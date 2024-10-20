package deob;

@ObfuscatedName("cl")
public class class102 extends class119 {

    @ObfuscatedName("cl.a")
    public class205 field1464 = new class205();

    @ObfuscatedName("cl.e")
    public class205 field1462 = new class205();

    @ObfuscatedName("cl.k")
    public int field1463 = 0;

    @ObfuscatedName("cl.u")
    public int field1461 = -1;

    @ObfuscatedName("cl.a(Ldy;)V")
    public final synchronized void method1729(class119 arg0) {
        this.field1464.method3460(arg0);
    }

    @ObfuscatedName("cl.w(Ldy;)V")
    public final synchronized void method1726(class119 arg0) {
        arg0.method3427();
    }

    @ObfuscatedName("cl.e()V")
    public void method1727() {
        if (this.field1463 <= 0) {
            return;
        }
        for (class114 var1 = (class114) this.field1462.method3442(); var1 != null; var1 = (class114) this.field1462.method3444()) {
            var1.field1564 -= this.field1463;
        }
        this.field1461 -= this.field1463;
        this.field1463 = 0;
    }

    @ObfuscatedName("cl.k(Lgn;Ldk;)V")
    public void method1739(class204 arg0, class114 arg1) {
        while (this.field1462.field2592 != arg0 && ((class114) arg0).field1564 <= arg1.field1564) {
            arg0 = arg0.field2590;
        }
        class205.method3439(arg1, arg0);
        this.field1461 = ((class114) this.field1462.field2592.field2590).field1564;
    }

    @ObfuscatedName("cl.u(Ldk;)V")
    public void method1753(class114 arg0) {
        arg0.method3427();
        arg0.method1913();
        class204 var2 = this.field1462.field2592.field2590;
        if (this.field1462.field2592 == var2) {
            this.field1461 = -1;
        } else {
            this.field1461 = ((class114) var2).field1564;
        }
    }

    @ObfuscatedName("cl.z()Ldy;")
    public class119 method1730() {
        return (class119) this.field1464.method3442();
    }

    @ObfuscatedName("cl.t()Ldy;")
    public class119 method1758() {
        return (class119) this.field1464.method3444();
    }

    @ObfuscatedName("cl.f()I")
    public int method1732() {
        return 0;
    }

    @ObfuscatedName("cl.g([III)V")
    public final synchronized void method1733(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1461 < 0) {
                this.method1731(arg0, arg1, arg2);
                return;
            }
            if (this.field1463 + arg2 < this.field1461) {
                this.field1463 += arg2;
                this.method1731(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1461 - this.field1463;
            this.method1731(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1463 += var4;
            this.method1727();
            class114 var5 = (class114) this.field1462.method3442();
            synchronized (var5) {
                int var7 = var5.method1914(this);
                if (var7 < 0) {
                    var5.field1564 = 0;
                    this.method1753(var5);
                } else {
                    var5.field1564 = var7;
                    this.method1739(var5.field2590, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("cl.x([III)V")
    public void method1731(int[] arg0, int arg1, int arg2) {
        for (class119 var4 = (class119) this.field1464.method3442(); var4 != null; var4 = (class119) this.field1464.method3444()) {
            var4.method2097(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("cl.c(I)V")
    public final synchronized void method1735(int arg0) {
        do {
            if (this.field1461 < 0) {
                this.method1736(arg0);
                return;
            }
            if (this.field1463 + arg0 < this.field1461) {
                this.field1463 += arg0;
                this.method1736(arg0);
                return;
            }
            int var2 = this.field1461 - this.field1463;
            this.method1736(var2);
            arg0 -= var2;
            this.field1463 += var2;
            this.method1727();
            class114 var3 = (class114) this.field1462.method3442();
            synchronized (var3) {
                int var5 = var3.method1914(this);
                if (var5 < 0) {
                    var3.field1564 = 0;
                    this.method1753(var3);
                } else {
                    var3.field1564 = var5;
                    this.method1739(var3.field2590, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("cl.n(I)V")
    public void method1736(int arg0) {
        for (class119 var2 = (class119) this.field1464.method3442(); var2 != null; var2 = (class119) this.field1464.method3444()) {
            var2.method1735(arg0);
        }
    }
}
