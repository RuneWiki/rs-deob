package deob;

import java.io.IOException;

@ObfuscatedName("cz")
public class class100 {

    @ObfuscatedName("cz.o")
    public class378 field1353;

    @ObfuscatedName("cz.q")
    public class337 field1342 = new class337();

    @ObfuscatedName("cz.l")
    public int field1343 = 0;

    @ObfuscatedName("cz.k")
    public class440 field1354 = new class440(5000);

    @ObfuscatedName("cz.a")
    public class456 field1344;

    @ObfuscatedName("cz.m")
    public class439 field1345 = new class439(40000);

    @ObfuscatedName("cz.p")
    public class266 field1347 = null;

    @ObfuscatedName("cz.s")
    public int field1348 = 0;

    @ObfuscatedName("cz.r")
    public boolean field1349 = true;

    @ObfuscatedName("cz.v")
    public int field1350 = 0;

    @ObfuscatedName("cz.y")
    public int field1351 = 0;

    @ObfuscatedName("cz.c")
    public class266 field1352;

    @ObfuscatedName("cz.w")
    public class266 field1341;

    @ObfuscatedName("cz.b")
    public class266 field1346;

    @ObfuscatedName("cz.o(I)V")
    public final void method2360() {
        this.field1342.method5491();
        this.field1343 = 0;
    }

    @ObfuscatedName("cz.q(I)V")
    public final void method2378() throws IOException {
        if (this.field1353 == null || this.field1343 <= 0) {
            return;
        }
        this.field1354.field4678 = 0;
        while (true) {
            class265 var1 = (class265) this.field1342.method5479();
            if (var1 == null || var1.field3080 > this.field1354.field4679.length - this.field1354.field4678) {
                this.field1353.method2913(this.field1354.field4679, 0, this.field1354.field4678);
                this.field1351 = 0;
                break;
            }
            this.field1354.method6886(var1.field3075.field4679, 0, var1.field3080);
            this.field1343 -= var1.field3080;
            var1.method6399();
            var1.field3075.method7093();
            var1.method4586();
        }
    }

    @ObfuscatedName("cz.l(Ljm;B)V")
    public final void method2362(class265 arg0) {
        this.field1342.method5493(arg0);
        arg0.field3080 = arg0.field3075.field4678;
        arg0.field3075.field4678 = 0;
        this.field1343 += arg0.field3080;
    }

    @ObfuscatedName("cz.k(Lnf;I)V")
    public void method2363(class378 arg0) {
        this.field1353 = arg0;
    }

    @ObfuscatedName("cz.a(I)V")
    public void method2364() {
        if (this.field1353 != null) {
            this.field1353.method2910();
            this.field1353 = null;
        }
    }

    @ObfuscatedName("cz.m(B)V")
    public void method2365() {
        this.field1353 = null;
    }

    @ObfuscatedName("cz.p(S)Lnf;")
    public class378 method2366() {
        return this.field1353;
    }
}
