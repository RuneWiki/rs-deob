package deob;

@ObfuscatedName("cm")
public class class102 extends class119 {

    @ObfuscatedName("cm.m")
    public class201 field1480 = new class201();

    @ObfuscatedName("cm.p")
    public class201 field1481 = new class201();

    @ObfuscatedName("cm.i")
    public int field1482 = 0;

    @ObfuscatedName("cm.j")
    public int field1483 = -1;

    @ObfuscatedName("cm.m(Ldq;)V")
    public final synchronized void method1804(class119 arg0) {
        this.field1480.method3482(arg0);
    }

    @ObfuscatedName("cm.p(Ldq;)V")
    public final synchronized void method1816(class119 arg0) {
        arg0.method3476();
    }

    @ObfuscatedName("cm.i()V")
    public void method1806() {
        if (this.field1482 <= 0) {
            return;
        }
        for (class113 var1 = (class113) this.field1481.method3486(); var1 != null; var1 = (class113) this.field1481.method3507()) {
            var1.field1590 -= this.field1482;
        }
        this.field1483 -= this.field1482;
        this.field1482 = 0;
    }

    @ObfuscatedName("cm.j(Lgh;Ldo;)V")
    public void method1807(class200 arg0, class113 arg1) {
        while (this.field1481.field2565 != arg0 && ((class113) arg0).field1590 <= arg1.field1590) {
            arg0 = arg0.field2562;
        }
        class201.method3483(arg1, arg0);
        this.field1483 = ((class113) this.field1481.field2565.field2562).field1590;
    }

    @ObfuscatedName("cm.v(Ldo;)V")
    public void method1808(class113 arg0) {
        arg0.method3476();
        arg0.method1999();
        class200 var2 = this.field1481.field2565.field2562;
        if (this.field1481.field2565 == var2) {
            this.field1483 = -1;
        } else {
            this.field1483 = ((class113) var2).field1590;
        }
    }

    @ObfuscatedName("cm.x()Ldq;")
    public class119 method1809() {
        return (class119) this.field1480.method3486();
    }

    @ObfuscatedName("cm.e()Ldq;")
    public class119 method1810() {
        return (class119) this.field1480.method3507();
    }

    @ObfuscatedName("cm.l()I")
    public int method1811() {
        return 0;
    }

    @ObfuscatedName("cm.b([III)V")
    public final synchronized void method1812(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1483 < 0) {
                this.method1813(arg0, arg1, arg2);
                return;
            }
            if (this.field1482 + arg2 < this.field1483) {
                this.field1482 += arg2;
                this.method1813(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1483 - this.field1482;
            this.method1813(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1482 += var4;
            this.method1806();
            class113 var5 = (class113) this.field1481.method3486();
            synchronized (var5) {
                int var7 = var5.method2000(this);
                if (var7 < 0) {
                    var5.field1590 = 0;
                    this.method1808(var5);
                } else {
                    var5.field1590 = var7;
                    this.method1807(var5.field2562, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("cm.n([III)V")
    public void method1813(int[] arg0, int arg1, int arg2) {
        for (class119 var4 = (class119) this.field1480.method3486(); var4 != null; var4 = (class119) this.field1480.method3507()) {
            var4.method2197(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("cm.c(I)V")
    public final synchronized void method1814(int arg0) {
        do {
            if (this.field1483 < 0) {
                this.method1815(arg0);
                return;
            }
            if (this.field1482 + arg0 < this.field1483) {
                this.field1482 += arg0;
                this.method1815(arg0);
                return;
            }
            int var2 = this.field1483 - this.field1482;
            this.method1815(var2);
            arg0 -= var2;
            this.field1482 += var2;
            this.method1806();
            class113 var3 = (class113) this.field1481.method3486();
            synchronized (var3) {
                int var5 = var3.method2000(this);
                if (var5 < 0) {
                    var3.field1590 = 0;
                    this.method1808(var3);
                } else {
                    var3.field1590 = var5;
                    this.method1807(var3.field2562, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("cm.a(I)V")
    public void method1815(int arg0) {
        for (class119 var2 = (class119) this.field1480.method3486(); var2 != null; var2 = (class119) this.field1480.method3507()) {
            var2.method1814(arg0);
        }
    }
}
