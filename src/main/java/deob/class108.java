package deob;

@ObfuscatedName("dh")
public class class108 extends class125 {

    @ObfuscatedName("dh.z")
    public class272 field1368 = new class272();

    @ObfuscatedName("dh.k")
    public class272 field1366 = new class272();

    @ObfuscatedName("dh.s")
    public int field1367 = 0;

    @ObfuscatedName("dh.t")
    public int field1369 = -1;

    @ObfuscatedName("dh.z(Ldc;)V")
    public final synchronized void method2195(class125 arg0) {
        this.field1368.method4617(arg0);
    }

    @ObfuscatedName("dh.k(Ldc;)V")
    public final synchronized void method2196(class125 arg0) {
        arg0.method3401();
    }

    @ObfuscatedName("dh.s()V")
    public void method2197() {
        if (this.field1367 <= 0) {
            return;
        }
        for (class120 var1 = (class120) this.field1366.method4621(); var1 != null; var1 = (class120) this.field1366.method4641()) {
            var1.field1477 -= this.field1367;
        }
        this.field1369 -= this.field1367;
        this.field1367 = 0;
    }

    @ObfuscatedName("dh.t(Lgw;Ldi;)V")
    public void method2220(class190 arg0, class120 arg1) {
        while (this.field1366.field3557 != arg0 && ((class120) arg0).field1477 <= arg1.field1477) {
            arg0 = arg0.field2155;
        }
        class272.method4618(arg1, arg0);
        this.field1369 = ((class120) this.field1366.field3557.field2155).field1477;
    }

    @ObfuscatedName("dh.i(Ldi;)V")
    public void method2200(class120 arg0) {
        arg0.method3401();
        arg0.method2397();
        class190 var2 = this.field1366.field3557.field2155;
        if (this.field1366.field3557 == var2) {
            this.field1369 = -1;
        } else {
            this.field1369 = ((class120) var2).field1477;
        }
    }

    @ObfuscatedName("dh.o()Ldc;")
    public class125 method2199() {
        return (class125) this.field1368.method4621();
    }

    @ObfuscatedName("dh.x()Ldc;")
    public class125 method2201() {
        return (class125) this.field1368.method4641();
    }

    @ObfuscatedName("dh.w()I")
    public int method2202() {
        return 0;
    }

    @ObfuscatedName("dh.g([III)V")
    public final synchronized void method2203(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1369 < 0) {
                this.method2204(arg0, arg1, arg2);
                return;
            }
            if (this.field1367 + arg2 < this.field1369) {
                this.field1367 += arg2;
                this.method2204(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1369 - this.field1367;
            this.method2204(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1367 += var4;
            this.method2197();
            class120 var5 = (class120) this.field1366.method4621();
            synchronized (var5) {
                int var7 = var5.method2400(this);
                if (var7 < 0) {
                    var5.field1477 = 0;
                    this.method2200(var5);
                } else {
                    var5.field1477 = var7;
                    this.method2220(var5.field2155, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("dh.m([III)V")
    public void method2204(int[] arg0, int arg1, int arg2) {
        for (class125 var4 = (class125) this.field1368.method4621(); var4 != null; var4 = (class125) this.field1368.method4641()) {
            var4.method2600(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("dh.n(I)V")
    public final synchronized void method2214(int arg0) {
        do {
            if (this.field1369 < 0) {
                this.method2205(arg0);
                return;
            }
            if (this.field1367 + arg0 < this.field1369) {
                this.field1367 += arg0;
                this.method2205(arg0);
                return;
            }
            int var2 = this.field1369 - this.field1367;
            this.method2205(var2);
            arg0 -= var2;
            this.field1367 += var2;
            this.method2197();
            class120 var3 = (class120) this.field1366.method4621();
            synchronized (var3) {
                int var5 = var3.method2400(this);
                if (var5 < 0) {
                    var3.field1477 = 0;
                    this.method2200(var3);
                } else {
                    var3.field1477 = var5;
                    this.method2220(var3.field2155, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("dh.d(I)V")
    public void method2205(int arg0) {
        for (class125 var2 = (class125) this.field1368.method4621(); var2 != null; var2 = (class125) this.field1368.method4641()) {
            var2.method2214(arg0);
        }
    }
}
