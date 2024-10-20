package deob;

import java.io.IOException;

@ObfuscatedName("dx")
public class class105 {

    @ObfuscatedName("dx.n")
    public class316 field1330;

    @ObfuscatedName("dx.v")
    public class272 field1323 = new class272();

    @ObfuscatedName("dx.d")
    public int field1322 = 0;

    @ObfuscatedName("dx.c")
    public class311 field1325 = new class311(5000);

    @ObfuscatedName("dx.y")
    public class339 field1333;

    @ObfuscatedName("dx.h")
    public class310 field1327 = new class310(40000);

    @ObfuscatedName("dx.z")
    public class192 field1326 = null;

    @ObfuscatedName("dx.e")
    public int field1329 = 0;

    @ObfuscatedName("dx.q")
    public boolean field1328 = true;

    @ObfuscatedName("dx.l")
    public int field1331 = 0;

    @ObfuscatedName("dx.s")
    public int field1324 = 0;

    @ObfuscatedName("dx.b")
    public class192 field1332;

    @ObfuscatedName("dx.a")
    public class192 field1334;

    @ObfuscatedName("dx.w")
    public class192 field1335;

    @ObfuscatedName("dx.n(I)V")
    public final void method2228() {
        this.field1323.method4626();
        this.field1322 = 0;
    }

    @ObfuscatedName("dx.v(I)V")
    public final void method2229() throws IOException {
        if (this.field1330 == null || this.field1322 <= 0) {
            return;
        }
        this.field1325.field3747 = 0;
        while (true) {
            class197 var1 = (class197) this.field1323.method4682();
            if (var1 == null || var1.field2368 > this.field1325.field3746.length - this.field1325.field3747) {
                this.field1330.method3419(this.field1325.field3746, 0, this.field1325.field3747);
                this.field1324 = 0;
                break;
            }
            this.field1325.method5238(var1.field2372.field3746, 0, var1.field2368);
            this.field1322 -= var1.field2368;
            var1.method3486();
            var1.field2372.method5407();
            var1.method3508();
        }
    }

    @ObfuscatedName("dx.d(Lgk;I)V")
    public final void method2239(class197 arg0) {
        this.field1323.method4627(arg0);
        arg0.field2368 = arg0.field2372.field3747;
        arg0.field2372.field3747 = 0;
        this.field1322 += arg0.field2368;
    }

    @ObfuscatedName("dx.c(Lls;I)V")
    public void method2231(class316 arg0) {
        this.field1330 = arg0;
    }

    @ObfuscatedName("dx.y(I)V")
    public void method2241() {
        if (this.field1330 != null) {
            this.field1330.method3413();
            this.field1330 = null;
        }
    }

    @ObfuscatedName("dx.h(I)V")
    public void method2250() {
        this.field1330 = null;
    }

    @ObfuscatedName("dx.z(I)Lls;")
    public class316 method2240() {
        return this.field1330;
    }
}
