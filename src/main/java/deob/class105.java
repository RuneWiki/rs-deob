package deob;

import java.io.IOException;

@ObfuscatedName("dv")
public class class105 {

    @ObfuscatedName("dv.x")
    public class315 field1331;

    @ObfuscatedName("dv.m")
    public class271 field1328 = new class271();

    @ObfuscatedName("dv.k")
    public int field1329 = 0;

    @ObfuscatedName("dv.d")
    public class310 field1327 = new class310(5000);

    @ObfuscatedName("dv.w")
    public class338 field1341;

    @ObfuscatedName("dv.v")
    public class309 field1338 = new class309(40000);

    @ObfuscatedName("dv.q")
    public class192 field1333 = null;

    @ObfuscatedName("dv.z")
    public int field1334 = 0;

    @ObfuscatedName("dv.t")
    public boolean field1336 = true;

    @ObfuscatedName("dv.e")
    public int field1339 = 0;

    @ObfuscatedName("dv.s")
    public int field1337 = 0;

    @ObfuscatedName("dv.p")
    public class192 field1335;

    @ObfuscatedName("dv.n")
    public class192 field1330;

    @ObfuscatedName("dv.u")
    public class192 field1340;

    @ObfuscatedName("dv.x(I)V")
    public final void method2155() {
        this.field1328.method4494();
        this.field1329 = 0;
    }

    @ObfuscatedName("dv.m(I)V")
    public final void method2156() throws IOException {
        if (this.field1331 == null || this.field1329 <= 0) {
            return;
        }
        this.field1327.field3711 = 0;
        while (true) {
            class197 var1 = (class197) this.field1328.method4488();
            if (var1 == null || var1.field2340 > this.field1327.field3710.length - this.field1327.field3711) {
                this.field1331.method3293(this.field1327.field3710, 0, this.field1327.field3711);
                this.field1337 = 0;
                break;
            }
            this.field1327.method5186(var1.field2339.field3710, 0, var1.field2340);
            this.field1329 -= var1.field2340;
            var1.method3355();
            var1.field2339.method5120();
            var1.method3384();
        }
    }

    @ObfuscatedName("dv.k(Lgq;I)V")
    public final void method2171(class197 arg0) {
        this.field1328.method4486(arg0);
        arg0.field2340 = arg0.field2339.field3711;
        arg0.field2339.field3711 = 0;
        this.field1329 += arg0.field2340;
    }

    @ObfuscatedName("dv.d(Llt;B)V")
    public void method2164(class315 arg0) {
        this.field1331 = arg0;
    }

    @ObfuscatedName("dv.w(I)V")
    public void method2159() {
        if (this.field1331 != null) {
            this.field1331.method3285();
            this.field1331 = null;
        }
    }

    @ObfuscatedName("dv.v(B)V")
    public void method2160() {
        this.field1331 = null;
    }

    @ObfuscatedName("dv.q(I)Llt;")
    public class315 method2169() {
        return this.field1331;
    }
}
