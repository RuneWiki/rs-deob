package deob;

@ObfuscatedName("db")
public class class105 extends class122 {

    @ObfuscatedName("db.d")
    public class194 field1552 = new class194();

    @ObfuscatedName("db.q")
    public class194 field1551 = new class194();

    @ObfuscatedName("db.x")
    public int field1550 = 0;

    @ObfuscatedName("db.y")
    public int field1553 = -1;

    @ObfuscatedName("db.d(Ldz;)V")
    public final synchronized void method1774(class122 arg0) {
        this.field1552.method3317(arg0);
    }

    @ObfuscatedName("db.q(Ldz;)V")
    public final synchronized void method1775(class122 arg0) {
        arg0.method3312();
    }

    @ObfuscatedName("db.x()V")
    public void method1776() {
        if (this.field1550 <= 0) {
            return;
        }
        for (class116 var1 = (class116) this.field1551.method3323(); var1 != null; var1 = (class116) this.field1551.method3325()) {
            var1.field1663 -= this.field1550;
        }
        this.field1553 -= this.field1550;
        this.field1550 = 0;
    }

    @ObfuscatedName("db.y(Lgm;Ldo;)V")
    public void method1777(class193 arg0, class116 arg1) {
        while (this.field1551.field2442 != arg0 && ((class116) arg0).field1663 <= arg1.field1663) {
            arg0 = arg0.field2440;
        }
        class194.method3320(arg1, arg0);
        this.field1553 = ((class116) this.field1551.field2442.field2440).field1663;
    }

    @ObfuscatedName("db.e(Ldo;)V")
    public void method1800(class116 arg0) {
        arg0.method3312();
        arg0.method1980();
        class193 var2 = this.field1551.field2442.field2440;
        if (this.field1551.field2442 == var2) {
            this.field1553 = -1;
        } else {
            this.field1553 = ((class116) var2).field1663;
        }
    }

    @ObfuscatedName("db.f()Ldz;")
    public class122 method1779() {
        return (class122) this.field1552.method3323();
    }

    @ObfuscatedName("db.v()Ldz;")
    public class122 method1780() {
        return (class122) this.field1552.method3325();
    }

    @ObfuscatedName("db.t()I")
    public int method1781() {
        return 0;
    }

    @ObfuscatedName("db.i([III)V")
    public final synchronized void method1782(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1553 < 0) {
                this.method1783(arg0, arg1, arg2);
                return;
            }
            if (this.field1550 + arg2 < this.field1553) {
                this.field1550 += arg2;
                this.method1783(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1553 - this.field1550;
            this.method1783(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1550 += var4;
            this.method1776();
            class116 var5 = (class116) this.field1551.method3323();
            synchronized (var5) {
                int var7 = var5.method1978(this);
                if (var7 < 0) {
                    var5.field1663 = 0;
                    this.method1800(var5);
                } else {
                    var5.field1663 = var7;
                    this.method1777(var5.field2440, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("db.r([III)V")
    public void method1783(int[] arg0, int arg1, int arg2) {
        for (class122 var4 = (class122) this.field1552.method3323(); var4 != null; var4 = (class122) this.field1552.method3325()) {
            var4.method2138(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("db.g(I)V")
    public final synchronized void method1778(int arg0) {
        do {
            if (this.field1553 < 0) {
                this.method1789(arg0);
                return;
            }
            if (this.field1550 + arg0 < this.field1553) {
                this.field1550 += arg0;
                this.method1789(arg0);
                return;
            }
            int var2 = this.field1553 - this.field1550;
            this.method1789(var2);
            arg0 -= var2;
            this.field1550 += var2;
            this.method1776();
            class116 var3 = (class116) this.field1551.method3323();
            synchronized (var3) {
                int var5 = var3.method1978(this);
                if (var5 < 0) {
                    var3.field1663 = 0;
                    this.method1800(var3);
                } else {
                    var3.field1663 = var5;
                    this.method1777(var3.field2440, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("db.s(I)V")
    public void method1789(int arg0) {
        for (class122 var2 = (class122) this.field1552.method3323(); var2 != null; var2 = (class122) this.field1552.method3325()) {
            var2.method1778(arg0);
        }
    }
}
