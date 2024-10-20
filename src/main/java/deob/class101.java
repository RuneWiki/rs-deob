package deob;

@ObfuscatedName("cn")
public class class101 extends class118 {

    @ObfuscatedName("cn.o")
    public class218 field1498 = new class218();

    @ObfuscatedName("cn.k")
    public class218 field1500 = new class218();

    @ObfuscatedName("cn.t")
    public int field1499 = 0;

    @ObfuscatedName("cn.d")
    public int field1497 = -1;

    @ObfuscatedName("cn.o(Ldd;)V")
    public final synchronized void method1889(class118 arg0) {
        this.field1498.method3691(arg0);
    }

    @ObfuscatedName("cn.k(Ldd;)V")
    public final synchronized void method1890(class118 arg0) {
        arg0.method3681();
    }

    @ObfuscatedName("cn.t()V")
    public void method1905() {
        if (this.field1499 <= 0) {
            return;
        }
        for (class113 var1 = (class113) this.field1500.method3707(); var1 != null; var1 = (class113) this.field1500.method3697()) {
            var1.field1611 -= this.field1499;
        }
        this.field1497 -= this.field1499;
        this.field1499 = 0;
    }

    @ObfuscatedName("cn.d(Lhj;Ldv;)V")
    public void method1892(class217 arg0, class113 arg1) {
        while (this.field1500.field2656 != arg0 && ((class113) arg0).field1611 <= arg1.field1611) {
            arg0 = arg0.field2653;
        }
        class218.method3692(arg1, arg0);
        this.field1497 = ((class113) this.field1500.field2656.field2653).field1611;
    }

    @ObfuscatedName("cn.h(Ldv;)V")
    public void method1917(class113 arg0) {
        arg0.method3681();
        arg0.method2098();
        class217 var2 = this.field1500.field2656.field2653;
        if (this.field1500.field2656 == var2) {
            this.field1497 = -1;
        } else {
            this.field1497 = ((class113) var2).field1611;
        }
    }

    @ObfuscatedName("cn.m()Ldd;")
    public class118 method1894() {
        return (class118) this.field1498.method3707();
    }

    @ObfuscatedName("cn.z()Ldd;")
    public class118 method1913() {
        return (class118) this.field1498.method3697();
    }

    @ObfuscatedName("cn.i()I")
    public int method1927() {
        return 0;
    }

    @ObfuscatedName("cn.u([III)V")
    public final synchronized void method1897(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1497 < 0) {
                this.method1919(arg0, arg1, arg2);
                return;
            }
            if (this.field1499 + arg2 < this.field1497) {
                this.field1499 += arg2;
                this.method1919(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1497 - this.field1499;
            this.method1919(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1499 += var4;
            this.method1905();
            class113 var5 = (class113) this.field1500.method3707();
            synchronized (var5) {
                int var7 = var5.method2095(this);
                if (var7 < 0) {
                    var5.field1611 = 0;
                    this.method1917(var5);
                } else {
                    var5.field1611 = var7;
                    this.method1892(var5.field2653, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("cn.x([III)V")
    public void method1919(int[] arg0, int arg1, int arg2) {
        for (class118 var4 = (class118) this.field1498.method3707(); var4 != null; var4 = (class118) this.field1498.method3697()) {
            var4.method2281(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("cn.y(I)V")
    public final synchronized void method1899(int arg0) {
        do {
            if (this.field1497 < 0) {
                this.method1900(arg0);
                return;
            }
            if (this.field1499 + arg0 < this.field1497) {
                this.field1499 += arg0;
                this.method1900(arg0);
                return;
            }
            int var2 = this.field1497 - this.field1499;
            this.method1900(var2);
            arg0 -= var2;
            this.field1499 += var2;
            this.method1905();
            class113 var3 = (class113) this.field1500.method3707();
            synchronized (var3) {
                int var5 = var3.method2095(this);
                if (var5 < 0) {
                    var3.field1611 = 0;
                    this.method1917(var3);
                } else {
                    var3.field1611 = var5;
                    this.method1892(var3.field2653, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("cn.a(I)V")
    public void method1900(int arg0) {
        for (class118 var2 = (class118) this.field1498.method3707(); var2 != null; var2 = (class118) this.field1498.method3697()) {
            var2.method1899(arg0);
        }
    }
}
