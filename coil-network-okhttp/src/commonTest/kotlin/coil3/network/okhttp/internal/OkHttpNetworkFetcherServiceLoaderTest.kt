package coil3.network.okhttp.internal

import coil3.network.NetworkFetcher
import coil3.util.ServiceLoaderComponentRegistry
import kotlin.test.Test
import kotlin.test.assertTrue

class OkHttpNetworkFetcherServiceLoaderTest {

    @Test
    fun serviceLoaderFindsFetcher() {
        val fetchers = ServiceLoaderComponentRegistry.fetchers
        assertTrue(fetchers.any { it.factory() is NetworkFetcher.Factory })
    }
}
