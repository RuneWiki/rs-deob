package deob;

import java.io.IOException;

@ObfuscatedName("dn")
public class class112 {

    @ObfuscatedName("dn.f")
    public class328 field1384;

    @ObfuscatedName("dn.o")
    public class274 field1383 = new class274();

    @ObfuscatedName("dn.u")
    public int field1390 = 0;

    @ObfuscatedName("dn.p")
    public class382 field1381 = new class382(5000);

    @ObfuscatedName("dn.b")
    public class398 field1385;

    @ObfuscatedName("dn.e")
    public class381 field1386 = new class381(40000);

    @ObfuscatedName("dn.k")
    public class206 field1387 = null;

    @ObfuscatedName("dn.g")
    public int field1388 = 0;

    @ObfuscatedName("dn.h")
    public boolean field1389 = true;

    @ObfuscatedName("dn.n")
    public int field1392 = 0;

    @ObfuscatedName("dn.l")
    public int field1391 = 0;

    @ObfuscatedName("dn.m")
    public class206 field1382;

    @ObfuscatedName("dn.d")
    public class206 field1393;

    @ObfuscatedName("dn.c")
    public class206 field1394;

    @ObfuscatedName("dn.f(B)V")
    public final void method2085() {
        this.field1383.method4259();
        this.field1390 = 0;
    }

    @ObfuscatedName("dn.o(B)V")
    public final void method2084() throws IOException {
        if (this.field1384 == null || this.field1390 <= 0) {
            return;
        }
        this.field1381.field4155 = 0;
        while (true) {
            class205 var1 = (class205) this.field1383.method4212();
            if (var1 == null || var1.field2344 > this.field1381.field4153.length - this.field1381.field4155) {
                this.field1384.method2265(this.field1381.field4153, 0, this.field1381.field4155);
                this.field1391 = 0;
                break;
            }
            this.field1381.method5849(var1.field2342.field4153, 0, var1.field2344);
            this.field1390 -= var1.field2344;
            var1.method5354();
            var1.field2342.method5976();
            var1.method3408();
        }
    }

    @ObfuscatedName("dn.u(Lgy;B)V")
    public final void method2099(class205 arg0) {
        this.field1383.method4209(arg0);
        arg0.field2344 = arg0.field2342.field4155;
        arg0.field2342.field4155 = 0;
        this.field1390 += arg0.field2344;
    }

    @ObfuscatedName("dn.p(Lli;I)V")
    public void method2101(class328 arg0) {
        this.field1384 = arg0;
    }

    @ObfuscatedName("dn.b(B)V")
    public void method2086() {
        if (this.field1384 != null) {
            this.field1384.method2268();
            this.field1384 = null;
        }
    }

    @ObfuscatedName("dn.e(B)V")
    public void method2087() {
        this.field1384 = null;
    }

    @ObfuscatedName("dn.k(I)Lli;")
    public class328 method2088() {
        return this.field1384;
    }
}
