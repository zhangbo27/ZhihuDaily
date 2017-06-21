package com.github.jokar.zhihudaily.di.component

import com.github.jokar.zhihudaily.app.MyApplication
import com.github.jokar.zhihudaily.di.module.AppModule
import com.github.jokar.zhihudaily.di.module.activity.MainActivityModule
import com.github.jokar.zhihudaily.di.module.fragment.MainFragmentModule
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule


/**
 * Created by JokAr on 2017/6/15.
 */
@Component(modules = arrayOf(
        AndroidSupportInjectionModule::class,
        AppModule::class,
        MainActivityModule::class,
        MainFragmentModule::class
))
interface AppComponent {
    fun inject(application: MyApplication)
}