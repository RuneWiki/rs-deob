package com.jagex.oldscape.pub;

public interface OAuthApi {

    void setRefreshTokenRequester(RefreshAccessTokenRequester arg0);

    long getAccountHash();

    boolean isOnLoginScreen();

    void setOtlTokenRequester(OtlTokenRequester arg0);
}
