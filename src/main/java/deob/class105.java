package deob;

import java.io.IOException;

@ObfuscatedName("dg")
public class class105 {

    @ObfuscatedName("dg.f")
    public class316 field1350;

    @ObfuscatedName("dg.b")
    public class272 field1339 = new class272();

    @ObfuscatedName("dg.l")
    public int field1346 = 0;

    @ObfuscatedName("dg.m")
    public class311 field1342 = new class311(5000);

    @ObfuscatedName("dg.z")
    public class339 field1347;

    @ObfuscatedName("dg.q")
    public class310 field1343 = new class310(40000);

    @ObfuscatedName("dg.k")
    public class192 field1344 = null;

    @ObfuscatedName("dg.c")
    public int field1345 = 0;

    @ObfuscatedName("dg.u")
    public boolean field1341 = true;

    @ObfuscatedName("dg.t")
    public int field1338 = 0;

    @ObfuscatedName("dg.e")
    public int field1348 = 0;

    @ObfuscatedName("dg.o")
    public class192 field1349;

    @ObfuscatedName("dg.n")
    public class192 field1340;

    @ObfuscatedName("dg.x")
    public class192 field1351;

    @ObfuscatedName("dg.f(I)V")
    public final void method2176() {
        this.field1339.method4613();
        this.field1346 = 0;
    }

    @ObfuscatedName("dg.b(B)V")
    public final void method2175() throws IOException {
        if (this.field1350 == null || this.field1346 <= 0) {
            return;
        }
        this.field1342.field3741 = 0;
        while (true) {
            class197 var1 = (class197) this.field1339.method4572();
            if (var1 == null || var1.field2370 > this.field1342.field3742.length - this.field1342.field3741) {
                this.field1350.method3341(this.field1342.field3742, 0, this.field1342.field3741);
                this.field1348 = 0;
                break;
            }
            this.field1342.method5161(var1.field2371.field3742, 0, var1.field2370);
            this.field1346 -= var1.field2370;
            var1.method3407();
            var1.field2371.method5339();
            var1.method3435();
        }
    }

    @ObfuscatedName("dg.l(Lgk;B)V")
    public final void method2178(class197 arg0) {
        this.field1339.method4588(arg0);
        arg0.field2370 = arg0.field2371.field3741;
        arg0.field2371.field3741 = 0;
        this.field1346 += arg0.field2370;
    }

    @ObfuscatedName("dg.m(Llv;I)V")
    public void method2187(class316 arg0) {
        this.field1350 = arg0;
    }

    @ObfuscatedName("dg.z(I)V")
    public void method2180() {
        if (this.field1350 != null) {
            this.field1350.method3334();
            this.field1350 = null;
        }
    }

    @ObfuscatedName("dg.q(I)V")
    public void method2181() {
        this.field1350 = null;
    }

    @ObfuscatedName("dg.k(S)Llv;")
    public class316 method2182() {
        return this.field1350;
    }
}
