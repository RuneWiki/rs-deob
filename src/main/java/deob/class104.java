package deob;

@ObfuscatedName("cf")
public class class104 extends class121 {

    @ObfuscatedName("cf.e")
    public class195 field1554 = new class195();

    @ObfuscatedName("cf.n")
    public class195 field1552 = new class195();

    @ObfuscatedName("cf.g")
    public int field1553 = 0;

    @ObfuscatedName("cf.y")
    public int field1555 = -1;

    @ObfuscatedName("cf.e(Ldl;)V")
    public final synchronized void method1769(class121 arg0) {
        this.field1554.method3343(arg0);
    }

    @ObfuscatedName("cf.n(Ldl;)V")
    public final synchronized void method1792(class121 arg0) {
        arg0.method3333();
    }

    @ObfuscatedName("cf.g()V")
    public void method1773() {
        if (this.field1553 <= 0) {
            return;
        }
        for (class115 var1 = (class115) this.field1552.method3348(); var1 != null; var1 = (class115) this.field1552.method3350()) {
            var1.field1661 -= this.field1553;
        }
        this.field1555 -= this.field1553;
        this.field1553 = 0;
    }

    @ObfuscatedName("cf.y(Lgx;Ldz;)V")
    public void method1772(class194 arg0, class115 arg1) {
        while (this.field1552.field2455 != arg0 && ((class115) arg0).field1661 <= arg1.field1661) {
            arg0 = arg0.field2452;
        }
        class195.method3345(arg1, arg0);
        this.field1555 = ((class115) this.field1552.field2455.field2452).field1661;
    }

    @ObfuscatedName("cf.w(Ldz;)V")
    public void method1771(class115 arg0) {
        arg0.method3333();
        arg0.method1956();
        class194 var2 = this.field1552.field2455.field2452;
        if (this.field1552.field2455 == var2) {
            this.field1555 = -1;
        } else {
            this.field1555 = ((class115) var2).field1661;
        }
    }

    @ObfuscatedName("cf.k()Ldl;")
    public class121 method1774() {
        return (class121) this.field1554.method3348();
    }

    @ObfuscatedName("cf.v()Ldl;")
    public class121 method1775() {
        return (class121) this.field1554.method3350();
    }

    @ObfuscatedName("cf.z()I")
    public int method1776() {
        return 0;
    }

    @ObfuscatedName("cf.r([III)V")
    public final synchronized void method1777(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1555 < 0) {
                this.method1778(arg0, arg1, arg2);
                return;
            }
            if (this.field1553 + arg2 < this.field1555) {
                this.field1553 += arg2;
                this.method1778(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1555 - this.field1553;
            this.method1778(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1553 += var4;
            this.method1773();
            class115 var5 = (class115) this.field1552.method3348();
            synchronized (var5) {
                int var7 = var5.method1954(this);
                if (var7 < 0) {
                    var5.field1661 = 0;
                    this.method1771(var5);
                } else {
                    var5.field1661 = var7;
                    this.method1772(var5.field2452, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("cf.u([III)V")
    public void method1778(int[] arg0, int arg1, int arg2) {
        for (class121 var4 = (class121) this.field1554.method3348(); var4 != null; var4 = (class121) this.field1554.method3350()) {
            var4.method2130(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("cf.d(I)V")
    public final synchronized void method1791(int arg0) {
        do {
            if (this.field1555 < 0) {
                this.method1787(arg0);
                return;
            }
            if (this.field1553 + arg0 < this.field1555) {
                this.field1553 += arg0;
                this.method1787(arg0);
                return;
            }
            int var2 = this.field1555 - this.field1553;
            this.method1787(var2);
            arg0 -= var2;
            this.field1553 += var2;
            this.method1773();
            class115 var3 = (class115) this.field1552.method3348();
            synchronized (var3) {
                int var5 = var3.method1954(this);
                if (var5 < 0) {
                    var3.field1661 = 0;
                    this.method1771(var3);
                } else {
                    var3.field1661 = var5;
                    this.method1772(var3.field2452, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("cf.o(I)V")
    public void method1787(int arg0) {
        for (class121 var2 = (class121) this.field1554.method3348(); var2 != null; var2 = (class121) this.field1554.method3350()) {
            var2.method1791(arg0);
        }
    }
}
