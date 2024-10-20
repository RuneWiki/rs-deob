package deob;

@ObfuscatedName("dj")
public class class117 {

    @ObfuscatedName("dj.c")
    public final int field1436;

    @ObfuscatedName("dj.p")
    public class117 field1430;

    @ObfuscatedName("dj.f")
    public float[][] field1431;

    @ObfuscatedName("dj.n")
    public final class390[] field1432;

    @ObfuscatedName("dj.k")
    public class390[] field1433;

    @ObfuscatedName("dj.w")
    public class390[] field1434;

    @ObfuscatedName("dj.s")
    public class390 field1435 = new class390();

    @ObfuscatedName("dj.q")
    public boolean field1440 = true;

    @ObfuscatedName("dj.m")
    public class390 field1443 = new class390();

    @ObfuscatedName("dj.x")
    public boolean field1438 = true;

    @ObfuscatedName("dj.j")
    public class390 field1437 = new class390();

    @ObfuscatedName("dj.v")
    public float[][] field1439;

    @ObfuscatedName("dj.h")
    public float[][] field1441;

    @ObfuscatedName("dj.t")
    public float[][] field1442;

    public class117(int arg0, class445 arg1, boolean arg2) {
        this.field1436 = arg1.method7199();
        this.field1432 = new class390[arg0];
        this.field1433 = new class390[this.field1432.length];
        this.field1434 = new class390[this.field1432.length];
        this.field1431 = new float[this.field1432.length][3];
        for (int var4 = 0; var4 < this.field1432.length; var4++) {
            this.field1432[var4] = new class390(arg1, arg2);
            this.field1431[var4][0] = arg1.method7203();
            this.field1431[var4][1] = arg1.method7203();
            this.field1431[var4][2] = arg1.method7203();
        }
        this.method2696();
    }

    @ObfuscatedName("dj.c(I)V")
    public void method2696() {
        this.field1439 = new float[this.field1432.length][3];
        this.field1441 = new float[this.field1432.length][3];
        this.field1442 = new float[this.field1432.length][3];
        class390 var1 = class390.method3607();
        for (int var2 = 0; var2 < this.field1432.length; var2++) {
            class390 var3 = this.method2697(var2);
            var1.method6556(var3);
            var1.method6528();
            this.field1439[var2] = var1.method6535();
            this.field1441[var2][0] = var3.field4441[12];
            this.field1441[var2][1] = var3.field4441[13];
            this.field1441[var2][2] = var3.field4441[14];
            this.field1442[var2] = var3.method6514();
        }
        var1.method6532();
    }

    @ObfuscatedName("dj.p(IB)Lnw;")
    public class390 method2697(int arg0) {
        return this.field1432[arg0];
    }

    @ObfuscatedName("dj.f(II)Lnw;")
    public class390 method2709(int arg0) {
        if (this.field1433[arg0] == null) {
            this.field1433[arg0] = new class390(this.method2697(arg0));
            if (this.field1430 == null) {
                this.field1433[arg0].method6507(class390.field4439);
            } else {
                this.field1433[arg0].method6507(this.field1430.method2709(arg0));
            }
        }
        return this.field1433[arg0];
    }

    @ObfuscatedName("dj.n(II)Lnw;")
    public class390 method2699(int arg0) {
        if (this.field1434[arg0] == null) {
            this.field1434[arg0] = new class390(this.method2709(arg0));
            this.field1434[arg0].method6528();
        }
        return this.field1434[arg0];
    }

    @ObfuscatedName("dj.k(Lnw;B)V")
    public void method2700(class390 arg0) {
        this.field1435.method6556(arg0);
        this.field1440 = true;
        this.field1438 = true;
    }

    @ObfuscatedName("dj.w(I)Lnw;")
    public class390 method2701() {
        return this.field1435;
    }

    @ObfuscatedName("dj.s(I)Lnw;")
    public class390 method2727() {
        if (this.field1440) {
            this.field1443.method6556(this.method2701());
            if (this.field1430 != null) {
                this.field1443.method6507(this.field1430.method2727());
            }
            this.field1440 = false;
        }
        return this.field1443;
    }

    @ObfuscatedName("dj.q(IB)Lnw;")
    public class390 method2703(int arg0) {
        if (this.field1438) {
            this.field1437.method6556(this.method2699(arg0));
            this.field1437.method6507(this.method2727());
            this.field1438 = false;
        }
        return this.field1437;
    }

    @ObfuscatedName("dj.m(II)[F")
    public float[] method2704(int arg0) {
        return this.field1439[arg0];
    }

    @ObfuscatedName("dj.x(IB)[F")
    public float[] method2725(int arg0) {
        return this.field1441[arg0];
    }

    @ObfuscatedName("dj.j(II)[F")
    public float[] method2730(int arg0) {
        return this.field1442[arg0];
    }
}
