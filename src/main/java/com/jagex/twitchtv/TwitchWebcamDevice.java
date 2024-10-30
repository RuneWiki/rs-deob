package com.jagex.twitchtv;

import deob.ObfuscatedName;
import java.util.LinkedList;

public class TwitchWebcamDevice {

    @ObfuscatedName("com/jagex/twitchtv/TwitchWebcamDevice.e")
    public String field237;

    @ObfuscatedName("com/jagex/twitchtv/TwitchWebcamDevice.n")
    public String field238;

    @ObfuscatedName("com/jagex/twitchtv/TwitchWebcamDevice.m")
    public int field239;

    @ObfuscatedName("com/jagex/twitchtv/TwitchWebcamDevice.k")
    public int field240;

    @ObfuscatedName("com/jagex/twitchtv/TwitchWebcamDevice.f")
    public LinkedList field241 = new LinkedList();

    public TwitchWebcamDevice(int arg0, int arg1, String arg2, String arg3) {
        this.field239 = arg0 * 849061987 * -1015277237;
        this.field240 = arg1 * -1720800279 * -1975853991;
        this.field237 = arg2;
        this.field238 = arg3;
    }

    public void AddCapability(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field241.add(new TwitchWebcamDeviceCapability(arg0, arg1, arg2, arg3, arg4));
    }

    @ObfuscatedName("com/jagex/twitchtv/TwitchWebcamDevice.e(I)Lcom/jagex/twitchtv/TwitchWebcamDeviceCapability;")
    public TwitchWebcamDeviceCapability method27(int arg0) {
        return arg0 >= 0 && arg0 < this.field241.size() ? (TwitchWebcamDeviceCapability) this.field241.get(arg0) : null;
    }

    @ObfuscatedName("com/jagex/twitchtv/TwitchWebcamDevice.n(I)Lcom/jagex/twitchtv/TwitchWebcamDeviceCapability;")
    public TwitchWebcamDeviceCapability method28(int arg0) {
        for (int var2 = 0; var2 < this.field241.size(); var2++) {
            if (((TwitchWebcamDeviceCapability) this.field241.get(var2)).field216 == arg0) {
                return (TwitchWebcamDeviceCapability) this.field241.get(var2);
            }
        }
        return null;
    }

    @ObfuscatedName("com/jagex/twitchtv/TwitchWebcamDevice.m()I")
    public int method29() {
        return this.field241.size();
    }
}
