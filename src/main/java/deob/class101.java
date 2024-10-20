package deob;

@ObfuscatedName("cs")
public class class101 extends class118 {

    @ObfuscatedName("cs.c")
    public class218 field1488 = new class218();

    @ObfuscatedName("cs.i")
    public class218 field1491 = new class218();

    @ObfuscatedName("cs.o")
    public int field1490 = 0;

    @ObfuscatedName("cs.j")
    public int field1489 = -1;

    @ObfuscatedName("cs.c(Ldd;)V")
    public final synchronized void method1933(class118 arg0) {
        this.field1488.method3717(arg0);
    }

    @ObfuscatedName("cs.i(Ldd;)V")
    public final synchronized void method1910(class118 arg0) {
        arg0.method3710();
    }

    @ObfuscatedName("cs.o()V")
    public void method1909() {
        if (this.field1490 <= 0) {
            return;
        }
        for (class113 var1 = (class113) this.field1491.method3723(); var1 != null; var1 = (class113) this.field1491.method3722()) {
            var1.field1595 -= this.field1490;
        }
        this.field1489 -= this.field1490;
        this.field1490 = 0;
    }

    @ObfuscatedName("cs.j(Lhg;Ldv;)V")
    public void method1906(class217 arg0, class113 arg1) {
        while (this.field1491.field2647 != arg0 && ((class113) arg0).field1595 <= arg1.field1595) {
            arg0 = arg0.field2643;
        }
        class218.method3741(arg1, arg0);
        this.field1489 = ((class113) this.field1491.field2647.field2643).field1595;
    }

    @ObfuscatedName("cs.k(Ldv;)V")
    public void method1911(class113 arg0) {
        arg0.method3710();
        arg0.method2099();
        class217 var2 = this.field1491.field2647.field2643;
        if (this.field1491.field2647 == var2) {
            this.field1489 = -1;
        } else {
            this.field1489 = ((class113) var2).field1595;
        }
    }

    @ObfuscatedName("cs.x()Ldd;")
    public class118 method1915() {
        return (class118) this.field1488.method3723();
    }

    @ObfuscatedName("cs.z()Ldd;")
    public class118 method1913() {
        return (class118) this.field1488.method3722();
    }

    @ObfuscatedName("cs.p()I")
    public int method1914() {
        return 0;
    }

    @ObfuscatedName("cs.w([III)V")
    public final synchronized void method1920(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1489 < 0) {
                this.method1916(arg0, arg1, arg2);
                return;
            }
            if (this.field1490 + arg2 < this.field1489) {
                this.field1490 += arg2;
                this.method1916(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1489 - this.field1490;
            this.method1916(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1490 += var4;
            this.method1909();
            class113 var5 = (class113) this.field1491.method3723();
            synchronized (var5) {
                int var7 = var5.method2105(this);
                if (var7 < 0) {
                    var5.field1595 = 0;
                    this.method1911(var5);
                } else {
                    var5.field1595 = var7;
                    this.method1906(var5.field2643, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("cs.r([III)V")
    public void method1916(int[] arg0, int arg1, int arg2) {
        for (class118 var4 = (class118) this.field1488.method3723(); var4 != null; var4 = (class118) this.field1488.method3722()) {
            var4.method2280(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("cs.d(I)V")
    public final synchronized void method1940(int arg0) {
        do {
            if (this.field1489 < 0) {
                this.method1918(arg0);
                return;
            }
            if (this.field1490 + arg0 < this.field1489) {
                this.field1490 += arg0;
                this.method1918(arg0);
                return;
            }
            int var2 = this.field1489 - this.field1490;
            this.method1918(var2);
            arg0 -= var2;
            this.field1490 += var2;
            this.method1909();
            class113 var3 = (class113) this.field1491.method3723();
            synchronized (var3) {
                int var5 = var3.method2105(this);
                if (var5 < 0) {
                    var3.field1595 = 0;
                    this.method1911(var3);
                } else {
                    var3.field1595 = var5;
                    this.method1906(var3.field2643, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("cs.a(I)V")
    public void method1918(int arg0) {
        for (class118 var2 = (class118) this.field1488.method3723(); var2 != null; var2 = (class118) this.field1488.method3722()) {
            var2.method1940(arg0);
        }
    }
}
