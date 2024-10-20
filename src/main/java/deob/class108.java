package deob;

@ObfuscatedName("di")
public class class108 extends class125 {

    @ObfuscatedName("di.n")
    public class273 field1353 = new class273();

    @ObfuscatedName("di.v")
    public class273 field1354 = new class273();

    @ObfuscatedName("di.d")
    public int field1355 = 0;

    @ObfuscatedName("di.c")
    public int field1356 = -1;

    @ObfuscatedName("di.n(Ldw;)V")
    public final synchronized void method2304(class125 arg0) {
        this.field1353.method4700(arg0);
    }

    @ObfuscatedName("di.v(Ldw;)V")
    public final synchronized void method2284(class125 arg0) {
        arg0.method3486();
    }

    @ObfuscatedName("di.d()V")
    public void method2276() {
        if (this.field1355 <= 0) {
            return;
        }
        for (class120 var1 = (class120) this.field1354.method4721(); var1 != null; var1 = (class120) this.field1354.method4706()) {
            var1.field1467 -= this.field1355;
        }
        this.field1356 -= this.field1355;
        this.field1355 = 0;
    }

    @ObfuscatedName("di.c(Lga;Ldr;)V")
    public void method2278(class190 arg0, class120 arg1) {
        while (this.field1354.field3572 != arg0 && ((class120) arg0).field1467 <= arg1.field1467) {
            arg0 = arg0.field2140;
        }
        class273.method4701(arg1, arg0);
        this.field1356 = ((class120) this.field1354.field3572.field2140).field1467;
    }

    @ObfuscatedName("di.y(Ldr;)V")
    public void method2279(class120 arg0) {
        arg0.method3486();
        arg0.method2485();
        class190 var2 = this.field1354.field3572.field2140;
        if (this.field1354.field3572 == var2) {
            this.field1356 = -1;
        } else {
            this.field1356 = ((class120) var2).field1467;
        }
    }

    @ObfuscatedName("di.h()Ldw;")
    public class125 method2280() {
        return (class125) this.field1353.method4721();
    }

    @ObfuscatedName("di.z()Ldw;")
    public class125 method2281() {
        return (class125) this.field1353.method4706();
    }

    @ObfuscatedName("di.e()I")
    public int method2282() {
        return 0;
    }

    @ObfuscatedName("di.q([III)V")
    public final synchronized void method2283(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1356 < 0) {
                this.method2286(arg0, arg1, arg2);
                return;
            }
            if (this.field1355 + arg2 < this.field1356) {
                this.field1355 += arg2;
                this.method2286(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1356 - this.field1355;
            this.method2286(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1355 += var4;
            this.method2276();
            class120 var5 = (class120) this.field1354.method4721();
            synchronized (var5) {
                int var7 = var5.method2486(this);
                if (var7 < 0) {
                    var5.field1467 = 0;
                    this.method2279(var5);
                } else {
                    var5.field1467 = var7;
                    this.method2278(var5.field2140, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("di.l([III)V")
    public void method2286(int[] arg0, int arg1, int arg2) {
        for (class125 var4 = (class125) this.field1353.method4721(); var4 != null; var4 = (class125) this.field1353.method4706()) {
            var4.method2649(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("di.s(I)V")
    public final synchronized void method2305(int arg0) {
        do {
            if (this.field1356 < 0) {
                this.method2274(arg0);
                return;
            }
            if (this.field1355 + arg0 < this.field1356) {
                this.field1355 += arg0;
                this.method2274(arg0);
                return;
            }
            int var2 = this.field1356 - this.field1355;
            this.method2274(var2);
            arg0 -= var2;
            this.field1355 += var2;
            this.method2276();
            class120 var3 = (class120) this.field1354.method4721();
            synchronized (var3) {
                int var5 = var3.method2486(this);
                if (var5 < 0) {
                    var3.field1467 = 0;
                    this.method2279(var3);
                } else {
                    var3.field1467 = var5;
                    this.method2278(var3.field2140, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("di.b(I)V")
    public void method2274(int arg0) {
        for (class125 var2 = (class125) this.field1353.method4721(); var2 != null; var2 = (class125) this.field1353.method4706()) {
            var2.method2305(arg0);
        }
    }
}
