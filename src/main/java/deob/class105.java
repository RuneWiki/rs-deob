package deob;

import java.io.IOException;

@ObfuscatedName("dh")
public class class105 {

    @ObfuscatedName("dh.h")
    public class316 field1340;

    @ObfuscatedName("dh.v")
    public class272 field1325 = new class272();

    @ObfuscatedName("dh.x")
    public int field1327 = 0;

    @ObfuscatedName("dh.w")
    public class311 field1330 = new class311(5000);

    @ObfuscatedName("dh.t")
    public class339 field1329;

    @ObfuscatedName("dh.j")
    public class310 field1326 = new class310(40000);

    @ObfuscatedName("dh.n")
    public class192 field1331 = null;

    @ObfuscatedName("dh.p")
    public int field1339 = 0;

    @ObfuscatedName("dh.l")
    public boolean field1333 = true;

    @ObfuscatedName("dh.z")
    public int field1334 = 0;

    @ObfuscatedName("dh.u")
    public int field1335 = 0;

    @ObfuscatedName("dh.e")
    public class192 field1336;

    @ObfuscatedName("dh.m")
    public class192 field1337;

    @ObfuscatedName("dh.c")
    public class192 field1338;

    @ObfuscatedName("dh.h(S)V")
    public final void method2167() {
        this.field1325.method4461();
        this.field1327 = 0;
    }

    @ObfuscatedName("dh.v(I)V")
    public final void method2158() throws IOException {
        if (this.field1340 == null || this.field1327 <= 0) {
            return;
        }
        this.field1330.field3752 = 0;
        while (true) {
            class197 var1 = (class197) this.field1325.method4467();
            if (var1 == null || var1.field2367 > this.field1330.field3753.length - this.field1330.field3752) {
                this.field1340.method3307(this.field1330.field3753, 0, this.field1330.field3752);
                this.field1335 = 0;
                break;
            }
            this.field1330.method5237(var1.field2361.field3753, 0, var1.field2367);
            this.field1327 -= var1.field2367;
            var1.method3359();
            var1.field2361.method5125();
            var1.method3385();
        }
    }

    @ObfuscatedName("dh.x(Lgv;I)V")
    public final void method2155(class197 arg0) {
        this.field1325.method4472(arg0);
        arg0.field2367 = arg0.field2361.field3752;
        arg0.field2361.field3752 = 0;
        this.field1327 += arg0.field2367;
    }

    @ObfuscatedName("dh.w(Llr;I)V")
    public void method2156(class316 arg0) {
        this.field1340 = arg0;
    }

    @ObfuscatedName("dh.t(I)V")
    public void method2154() {
        if (this.field1340 != null) {
            this.field1340.method3288();
            this.field1340 = null;
        }
    }

    @ObfuscatedName("dh.j(I)V")
    public void method2153() {
        this.field1340 = null;
    }

    @ObfuscatedName("dh.n(I)Llr;")
    public class316 method2159() {
        return this.field1340;
    }
}
