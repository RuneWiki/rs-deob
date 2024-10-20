package deob;

@ObfuscatedName("dd")
public class class108 extends class125 {

    @ObfuscatedName("dd.m")
    public class272 field1373 = new class272();

    @ObfuscatedName("dd.o")
    public class272 field1374 = new class272();

    @ObfuscatedName("dd.q")
    public int field1372 = 0;

    @ObfuscatedName("dd.j")
    public int field1375 = -1;

    @ObfuscatedName("dd.m(Ldf;)V")
    public final synchronized void method2193(class125 arg0) {
        this.field1373.method4647(arg0);
    }

    @ObfuscatedName("dd.o(Ldf;)V")
    public final synchronized void method2194(class125 arg0) {
        arg0.method3388();
    }

    @ObfuscatedName("dd.q()V")
    public void method2207() {
        if (this.field1372 <= 0) {
            return;
        }
        for (class120 var1 = (class120) this.field1374.method4651(); var1 != null; var1 = (class120) this.field1374.method4656()) {
            var1.field1477 -= this.field1372;
        }
        this.field1375 -= this.field1372;
        this.field1372 = 0;
    }

    @ObfuscatedName("dd.j(Lgr;Ldb;)V")
    public void method2196(class190 arg0, class120 arg1) {
        while (this.field1374.field3568 != arg0 && ((class120) arg0).field1477 <= arg1.field1477) {
            arg0 = arg0.field2153;
        }
        class272.method4648(arg1, arg0);
        this.field1375 = ((class120) this.field1374.field3568.field2153).field1477;
    }

    @ObfuscatedName("dd.p(Ldb;)V")
    public void method2197(class120 arg0) {
        arg0.method3388();
        arg0.method2396();
        class190 var2 = this.field1374.field3568.field2153;
        if (this.field1374.field3568 == var2) {
            this.field1375 = -1;
        } else {
            this.field1375 = ((class120) var2).field1477;
        }
    }

    @ObfuscatedName("dd.g()Ldf;")
    public class125 method2198() {
        return (class125) this.field1373.method4651();
    }

    @ObfuscatedName("dd.n()Ldf;")
    public class125 method2199() {
        return (class125) this.field1373.method4656();
    }

    @ObfuscatedName("dd.u()I")
    public int method2200() {
        return 0;
    }

    @ObfuscatedName("dd.a([III)V")
    public final synchronized void method2206(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1375 < 0) {
                this.method2202(arg0, arg1, arg2);
                return;
            }
            if (this.field1372 + arg2 < this.field1375) {
                this.field1372 += arg2;
                this.method2202(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1375 - this.field1372;
            this.method2202(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1372 += var4;
            this.method2207();
            class120 var5 = (class120) this.field1374.method4651();
            synchronized (var5) {
                int var7 = var5.method2395(this);
                if (var7 < 0) {
                    var5.field1477 = 0;
                    this.method2197(var5);
                } else {
                    var5.field1477 = var7;
                    this.method2196(var5.field2153, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("dd.z([III)V")
    public void method2202(int[] arg0, int arg1, int arg2) {
        for (class125 var4 = (class125) this.field1373.method4651(); var4 != null; var4 = (class125) this.field1373.method4656()) {
            var4.method2572(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("dd.w(I)V")
    public final synchronized void method2203(int arg0) {
        do {
            if (this.field1375 < 0) {
                this.method2218(arg0);
                return;
            }
            if (this.field1372 + arg0 < this.field1375) {
                this.field1372 += arg0;
                this.method2218(arg0);
                return;
            }
            int var2 = this.field1375 - this.field1372;
            this.method2218(var2);
            arg0 -= var2;
            this.field1372 += var2;
            this.method2207();
            class120 var3 = (class120) this.field1374.method4651();
            synchronized (var3) {
                int var5 = var3.method2395(this);
                if (var5 < 0) {
                    var3.field1477 = 0;
                    this.method2197(var3);
                } else {
                    var3.field1477 = var5;
                    this.method2196(var3.field2153, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("dd.y(I)V")
    public void method2218(int arg0) {
        for (class125 var2 = (class125) this.field1373.method4651(); var2 != null; var2 = (class125) this.field1373.method4656()) {
            var2.method2203(arg0);
        }
    }
}
