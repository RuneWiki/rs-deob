package deob;

@ObfuscatedName("cr")
public class class101 extends class118 {

    @ObfuscatedName("cr.d")
    public class194 field1551 = new class194();

    @ObfuscatedName("cr.k")
    public class194 field1549 = new class194();

    @ObfuscatedName("cr.e")
    public int field1550 = 0;

    @ObfuscatedName("cr.p")
    public int field1548 = -1;

    @ObfuscatedName("cr.d(Ldd;)V")
    public final synchronized void method1821(class118 arg0) {
        this.field1551.method3415(arg0);
    }

    @ObfuscatedName("cr.k(Ldd;)V")
    public final synchronized void method1791(class118 arg0) {
        arg0.method3407();
    }

    @ObfuscatedName("cr.e()V")
    public void method1792() {
        if (this.field1550 <= 0) {
            return;
        }
        for (class112 var1 = (class112) this.field1549.method3409(); var1 != null; var1 = (class112) this.field1549.method3429()) {
            var1.field1660 -= this.field1550;
        }
        this.field1548 -= this.field1550;
        this.field1550 = 0;
    }

    @ObfuscatedName("cr.p(Lgs;Ldc;)V")
    public void method1793(class193 arg0, class112 arg1) {
        while (this.field1549.field2489 != arg0 && ((class112) arg0).field1660 <= arg1.field1660) {
            arg0 = arg0.field2485;
        }
        class194.method3413(arg1, arg0);
        this.field1548 = ((class112) this.field1549.field2489.field2485).field1660;
    }

    @ObfuscatedName("cr.q(Ldc;)V")
    public void method1794(class112 arg0) {
        arg0.method3407();
        arg0.method1994();
        class193 var2 = this.field1549.field2489.field2485;
        if (this.field1549.field2489 == var2) {
            this.field1548 = -1;
        } else {
            this.field1548 = ((class112) var2).field1660;
        }
    }

    @ObfuscatedName("cr.s()Ldd;")
    public class118 method1795() {
        return (class118) this.field1551.method3409();
    }

    @ObfuscatedName("cr.r()Ldd;")
    public class118 method1796() {
        return (class118) this.field1551.method3429();
    }

    @ObfuscatedName("cr.g()I")
    public int method1815() {
        return 0;
    }

    @ObfuscatedName("cr.v([III)V")
    public final synchronized void method1810(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1548 < 0) {
                this.method1799(arg0, arg1, arg2);
                return;
            }
            if (this.field1550 + arg2 < this.field1548) {
                this.field1550 += arg2;
                this.method1799(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1548 - this.field1550;
            this.method1799(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1550 += var4;
            this.method1792();
            class112 var5 = (class112) this.field1549.method3409();
            synchronized (var5) {
                int var7 = var5.method1993(this);
                if (var7 < 0) {
                    var5.field1660 = 0;
                    this.method1794(var5);
                } else {
                    var5.field1660 = var7;
                    this.method1793(var5.field2485, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("cr.t([III)V")
    public void method1799(int[] arg0, int arg1, int arg2) {
        for (class118 var4 = (class118) this.field1551.method3409(); var4 != null; var4 = (class118) this.field1551.method3429()) {
            var4.method2165(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("cr.y(I)V")
    public final synchronized void method1790(int arg0) {
        do {
            if (this.field1548 < 0) {
                this.method1801(arg0);
                return;
            }
            if (this.field1550 + arg0 < this.field1548) {
                this.field1550 += arg0;
                this.method1801(arg0);
                return;
            }
            int var2 = this.field1548 - this.field1550;
            this.method1801(var2);
            arg0 -= var2;
            this.field1550 += var2;
            this.method1792();
            class112 var3 = (class112) this.field1549.method3409();
            synchronized (var3) {
                int var5 = var3.method1993(this);
                if (var5 < 0) {
                    var3.field1660 = 0;
                    this.method1794(var3);
                } else {
                    var3.field1660 = var5;
                    this.method1793(var3.field2485, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("cr.o(I)V")
    public void method1801(int arg0) {
        for (class118 var2 = (class118) this.field1551.method3409(); var2 != null; var2 = (class118) this.field1551.method3429()) {
            var2.method1790(arg0);
        }
    }
}
