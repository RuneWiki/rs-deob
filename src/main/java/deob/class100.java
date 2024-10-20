package deob;

@ObfuscatedName("cz")
public class class100 extends class117 {

    @ObfuscatedName("cz.p")
    public class205 field1454 = new class205();

    @ObfuscatedName("cz.i")
    public class205 field1453 = new class205();

    @ObfuscatedName("cz.s")
    public int field1455 = 0;

    @ObfuscatedName("cz.j")
    public int field1452 = -1;

    @ObfuscatedName("cz.p(Ldj;)V")
    public final synchronized void method1938(class117 arg0) {
        this.field1454.method3567(arg0);
    }

    @ObfuscatedName("cz.i(Ldj;)V")
    public final synchronized void method1940(class117 arg0) {
        arg0.method3561();
    }

    @ObfuscatedName("cz.w()V")
    public void method1902() {
        if (this.field1455 <= 0) {
            return;
        }
        for (class112 var1 = (class112) this.field1453.method3581(); var1 != null; var1 = (class112) this.field1453.method3597()) {
            var1.field1556 -= this.field1455;
        }
        this.field1452 -= this.field1455;
        this.field1455 = 0;
    }

    @ObfuscatedName("cz.s(Lgw;Ldi;)V")
    public void method1906(class204 arg0, class112 arg1) {
        while (this.field1453.field2565 != arg0 && ((class112) arg0).field1556 <= arg1.field1556) {
            arg0 = arg0.field2562;
        }
        class205.method3569(arg1, arg0);
        this.field1452 = ((class112) this.field1453.field2565.field2562).field1556;
    }

    @ObfuscatedName("cz.j(Ldi;)V")
    public void method1937(class112 arg0) {
        arg0.method3561();
        arg0.method2099();
        class204 var2 = this.field1453.field2565.field2562;
        if (this.field1453.field2565 == var2) {
            this.field1452 = -1;
        } else {
            this.field1452 = ((class112) var2).field1556;
        }
    }

    @ObfuscatedName("cz.a()Ldj;")
    public class117 method1915() {
        return (class117) this.field1454.method3581();
    }

    @ObfuscatedName("cz.t()Ldj;")
    public class117 method1909() {
        return (class117) this.field1454.method3597();
    }

    @ObfuscatedName("cz.r()I")
    public int method1910() {
        return 0;
    }

    @ObfuscatedName("cz.m([III)V")
    public final synchronized void method1923(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1452 < 0) {
                this.method1912(arg0, arg1, arg2);
                return;
            }
            if (this.field1455 + arg2 < this.field1452) {
                this.field1455 += arg2;
                this.method1912(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1452 - this.field1455;
            this.method1912(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1455 += var4;
            this.method1902();
            class112 var5 = (class112) this.field1453.method3581();
            synchronized (var5) {
                int var7 = var5.method2100(this);
                if (var7 < 0) {
                    var5.field1556 = 0;
                    this.method1937(var5);
                } else {
                    var5.field1556 = var7;
                    this.method1906(var5.field2562, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("cz.h([III)V")
    public void method1912(int[] arg0, int arg1, int arg2) {
        for (class117 var4 = (class117) this.field1454.method3581(); var4 != null; var4 = (class117) this.field1454.method3597()) {
            var4.method2266(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("cz.o(I)V")
    public final synchronized void method1913(int arg0) {
        do {
            if (this.field1452 < 0) {
                this.method1907(arg0);
                return;
            }
            if (this.field1455 + arg0 < this.field1452) {
                this.field1455 += arg0;
                this.method1907(arg0);
                return;
            }
            int var2 = this.field1452 - this.field1455;
            this.method1907(var2);
            arg0 -= var2;
            this.field1455 += var2;
            this.method1902();
            class112 var3 = (class112) this.field1453.method3581();
            synchronized (var3) {
                int var5 = var3.method2100(this);
                if (var5 < 0) {
                    var3.field1556 = 0;
                    this.method1937(var3);
                } else {
                    var3.field1556 = var5;
                    this.method1906(var3.field2562, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("cz.x(I)V")
    public void method1907(int arg0) {
        for (class117 var2 = (class117) this.field1454.method3581(); var2 != null; var2 = (class117) this.field1454.method3597()) {
            var2.method1913(arg0);
        }
    }
}
