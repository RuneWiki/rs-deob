package deob;

@ObfuscatedName("dz")
public class class108 extends class125 {

    @ObfuscatedName("dz.x")
    public class272 field1357 = new class272();

    @ObfuscatedName("dz.m")
    public class272 field1358 = new class272();

    @ObfuscatedName("dz.k")
    public int field1359 = 0;

    @ObfuscatedName("dz.d")
    public int field1356 = -1;

    @ObfuscatedName("dz.x(Lds;)V")
    public final synchronized void method2195(class125 arg0) {
        this.field1357.method4555(arg0);
    }

    @ObfuscatedName("dz.m(Lds;)V")
    public final synchronized void method2196(class125 arg0) {
        arg0.method3355();
    }

    @ObfuscatedName("dz.k()V")
    public void method2197() {
        if (this.field1359 <= 0) {
            return;
        }
        for (class120 var1 = (class120) this.field1358.method4559(); var1 != null; var1 = (class120) this.field1358.method4577()) {
            var1.field1467 -= this.field1359;
        }
        this.field1356 -= this.field1359;
        this.field1359 = 0;
    }

    @ObfuscatedName("dz.d(Lga;Ldo;)V")
    public void method2198(class190 arg0, class120 arg1) {
        while (this.field1358.field3533 != arg0 && ((class120) arg0).field1467 <= arg1.field1467) {
            arg0 = arg0.field2118;
        }
        class272.method4556(arg1, arg0);
        this.field1356 = ((class120) this.field1358.field3533.field2118).field1467;
    }

    @ObfuscatedName("dz.w(Ldo;)V")
    public void method2199(class120 arg0) {
        arg0.method3355();
        arg0.method2394();
        class190 var2 = this.field1358.field3533.field2118;
        if (this.field1358.field3533 == var2) {
            this.field1356 = -1;
        } else {
            this.field1356 = ((class120) var2).field1467;
        }
    }

    @ObfuscatedName("dz.v()Lds;")
    public class125 method2200() {
        return (class125) this.field1357.method4559();
    }

    @ObfuscatedName("dz.q()Lds;")
    public class125 method2201() {
        return (class125) this.field1357.method4577();
    }

    @ObfuscatedName("dz.z()I")
    public int method2202() {
        return 0;
    }

    @ObfuscatedName("dz.t([III)V")
    public final synchronized void method2203(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1356 < 0) {
                this.method2208(arg0, arg1, arg2);
                return;
            }
            if (this.field1359 + arg2 < this.field1356) {
                this.field1359 += arg2;
                this.method2208(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1356 - this.field1359;
            this.method2208(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1359 += var4;
            this.method2197();
            class120 var5 = (class120) this.field1358.method4559();
            synchronized (var5) {
                int var7 = var5.method2395(this);
                if (var7 < 0) {
                    var5.field1467 = 0;
                    this.method2199(var5);
                } else {
                    var5.field1467 = var7;
                    this.method2198(var5.field2118, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("dz.e([III)V")
    public void method2208(int[] arg0, int arg1, int arg2) {
        for (class125 var4 = (class125) this.field1357.method4559(); var4 != null; var4 = (class125) this.field1357.method4577()) {
            var4.method2574(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("dz.s(I)V")
    public final synchronized void method2205(int arg0) {
        do {
            if (this.field1356 < 0) {
                this.method2206(arg0);
                return;
            }
            if (this.field1359 + arg0 < this.field1356) {
                this.field1359 += arg0;
                this.method2206(arg0);
                return;
            }
            int var2 = this.field1356 - this.field1359;
            this.method2206(var2);
            arg0 -= var2;
            this.field1359 += var2;
            this.method2197();
            class120 var3 = (class120) this.field1358.method4559();
            synchronized (var3) {
                int var5 = var3.method2395(this);
                if (var5 < 0) {
                    var3.field1467 = 0;
                    this.method2199(var3);
                } else {
                    var3.field1467 = var5;
                    this.method2198(var3.field2118, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("dz.p(I)V")
    public void method2206(int arg0) {
        for (class125 var2 = (class125) this.field1357.method4559(); var2 != null; var2 = (class125) this.field1357.method4577()) {
            var2.method2205(arg0);
        }
    }
}
