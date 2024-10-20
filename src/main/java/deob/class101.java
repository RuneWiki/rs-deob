package deob;

@ObfuscatedName("ca")
public class class101 extends class118 {

    @ObfuscatedName("ca.t")
    public class218 field1473 = new class218();

    @ObfuscatedName("ca.q")
    public class218 field1471 = new class218();

    @ObfuscatedName("ca.i")
    public int field1472 = 0;

    @ObfuscatedName("ca.a")
    public int field1474 = -1;

    @ObfuscatedName("ca.t(Ldo;)V")
    public final synchronized void method1929(class118 arg0) {
        this.field1473.method3728(arg0);
    }

    @ObfuscatedName("ca.q(Ldo;)V")
    public final synchronized void method1930(class118 arg0) {
        arg0.method3721();
    }

    @ObfuscatedName("ca.i()V")
    public void method1931() {
        if (this.field1472 <= 0) {
            return;
        }
        for (class113 var1 = (class113) this.field1471.method3731(); var1 != null; var1 = (class113) this.field1471.method3733()) {
            var1.field1583 -= this.field1472;
        }
        this.field1474 -= this.field1472;
        this.field1472 = 0;
    }

    @ObfuscatedName("ca.a(Lhx;Ldf;)V")
    public void method1939(class217 arg0, class113 arg1) {
        while (this.field1471.field2640 != arg0 && ((class113) arg0).field1583 <= arg1.field1583) {
            arg0 = arg0.field2637;
        }
        class218.method3756(arg1, arg0);
        this.field1474 = ((class113) this.field1471.field2640.field2637).field1583;
    }

    @ObfuscatedName("ca.l(Ldf;)V")
    public void method1942(class113 arg0) {
        arg0.method3721();
        arg0.method2116();
        class217 var2 = this.field1471.field2640.field2637;
        if (this.field1471.field2640 == var2) {
            this.field1474 = -1;
        } else {
            this.field1474 = ((class113) var2).field1583;
        }
    }

    @ObfuscatedName("ca.b()Ldo;")
    public class118 method1934() {
        return (class118) this.field1473.method3731();
    }

    @ObfuscatedName("ca.e()Ldo;")
    public class118 method1935() {
        return (class118) this.field1473.method3733();
    }

    @ObfuscatedName("ca.x()I")
    public int method1961() {
        return 0;
    }

    @ObfuscatedName("ca.p([III)V")
    public final synchronized void method1937(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1474 < 0) {
                this.method1938(arg0, arg1, arg2);
                return;
            }
            if (this.field1472 + arg2 < this.field1474) {
                this.field1472 += arg2;
                this.method1938(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1474 - this.field1472;
            this.method1938(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1472 += var4;
            this.method1931();
            class113 var5 = (class113) this.field1471.method3731();
            synchronized (var5) {
                int var7 = var5.method2118(this);
                if (var7 < 0) {
                    var5.field1583 = 0;
                    this.method1942(var5);
                } else {
                    var5.field1583 = var7;
                    this.method1939(var5.field2637, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("ca.o([III)V")
    public void method1938(int[] arg0, int arg1, int arg2) {
        for (class118 var4 = (class118) this.field1473.method3731(); var4 != null; var4 = (class118) this.field1473.method3733()) {
            var4.method2274(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ca.c(I)V")
    public final synchronized void method1928(int arg0) {
        do {
            if (this.field1474 < 0) {
                this.method1936(arg0);
                return;
            }
            if (this.field1472 + arg0 < this.field1474) {
                this.field1472 += arg0;
                this.method1936(arg0);
                return;
            }
            int var2 = this.field1474 - this.field1472;
            this.method1936(var2);
            arg0 -= var2;
            this.field1472 += var2;
            this.method1931();
            class113 var3 = (class113) this.field1471.method3731();
            synchronized (var3) {
                int var5 = var3.method2118(this);
                if (var5 < 0) {
                    var3.field1583 = 0;
                    this.method1942(var3);
                } else {
                    var3.field1583 = var5;
                    this.method1939(var3.field2637, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("ca.u(I)V")
    public void method1936(int arg0) {
        for (class118 var2 = (class118) this.field1473.method3731(); var2 != null; var2 = (class118) this.field1473.method3733()) {
            var2.method1928(arg0);
        }
    }
}
