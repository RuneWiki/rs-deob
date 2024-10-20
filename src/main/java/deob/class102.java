package deob;

@ObfuscatedName("cu")
public class class102 extends class119 {

    @ObfuscatedName("cu.d")
    public class201 field1480 = new class201();

    @ObfuscatedName("cu.x")
    public class201 field1481 = new class201();

    @ObfuscatedName("cu.k")
    public int field1483 = 0;

    @ObfuscatedName("cu.z")
    public int field1482 = -1;

    @ObfuscatedName("cu.d(Ldn;)V")
    public final synchronized void method1805(class119 arg0) {
        this.field1480.method3497(arg0);
    }

    @ObfuscatedName("cu.x(Ldn;)V")
    public final synchronized void method1806(class119 arg0) {
        arg0.method3475();
    }

    @ObfuscatedName("cu.k()V")
    public void method1807() {
        if (this.field1483 <= 0) {
            return;
        }
        for (class113 var1 = (class113) this.field1481.method3500(); var1 != null; var1 = (class113) this.field1481.method3511()) {
            var1.field1590 -= this.field1483;
        }
        this.field1482 -= this.field1483;
        this.field1483 = 0;
    }

    @ObfuscatedName("cu.z(Lgf;Ldj;)V")
    public void method1810(class200 arg0, class113 arg1) {
        while (this.field1481.field2568 != arg0 && ((class113) arg0).field1590 <= arg1.field1590) {
            arg0 = arg0.field2565;
        }
        class201.method3483(arg1, arg0);
        this.field1482 = ((class113) this.field1481.field2568.field2565).field1590;
    }

    @ObfuscatedName("cu.v(Ldj;)V")
    public void method1809(class113 arg0) {
        arg0.method3475();
        arg0.method2027();
        class200 var2 = this.field1481.field2568.field2565;
        if (this.field1481.field2568 == var2) {
            this.field1482 = -1;
        } else {
            this.field1482 = ((class113) var2).field1590;
        }
    }

    @ObfuscatedName("cu.m()Ldn;")
    public class119 method1834() {
        return (class119) this.field1480.method3500();
    }

    @ObfuscatedName("cu.b()Ldn;")
    public class119 method1811() {
        return (class119) this.field1480.method3511();
    }

    @ObfuscatedName("cu.t()I")
    public int method1812() {
        return 0;
    }

    @ObfuscatedName("cu.p([III)V")
    public final synchronized void method1813(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1482 < 0) {
                this.method1814(arg0, arg1, arg2);
                return;
            }
            if (this.field1483 + arg2 < this.field1482) {
                this.field1483 += arg2;
                this.method1814(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1482 - this.field1483;
            this.method1814(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1483 += var4;
            this.method1807();
            class113 var5 = (class113) this.field1481.method3500();
            synchronized (var5) {
                int var7 = var5.method2028(this);
                if (var7 < 0) {
                    var5.field1590 = 0;
                    this.method1809(var5);
                } else {
                    var5.field1590 = var7;
                    this.method1810(var5.field2565, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("cu.r([III)V")
    public void method1814(int[] arg0, int arg1, int arg2) {
        for (class119 var4 = (class119) this.field1480.method3500(); var4 != null; var4 = (class119) this.field1480.method3511()) {
            var4.method2199(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("cu.l(I)V")
    public final synchronized void method1815(int arg0) {
        do {
            if (this.field1482 < 0) {
                this.method1816(arg0);
                return;
            }
            if (this.field1483 + arg0 < this.field1482) {
                this.field1483 += arg0;
                this.method1816(arg0);
                return;
            }
            int var2 = this.field1482 - this.field1483;
            this.method1816(var2);
            arg0 -= var2;
            this.field1483 += var2;
            this.method1807();
            class113 var3 = (class113) this.field1481.method3500();
            synchronized (var3) {
                int var5 = var3.method2028(this);
                if (var5 < 0) {
                    var3.field1590 = 0;
                    this.method1809(var3);
                } else {
                    var3.field1590 = var5;
                    this.method1810(var3.field2565, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("cu.u(I)V")
    public void method1816(int arg0) {
        for (class119 var2 = (class119) this.field1480.method3500(); var2 != null; var2 = (class119) this.field1480.method3511()) {
            var2.method1815(arg0);
        }
    }
}
