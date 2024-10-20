package deob;

@ObfuscatedName("cr")
public class class103 extends class120 {

    @ObfuscatedName("cr.i")
    public class194 field1574 = new class194();

    @ObfuscatedName("cr.c")
    public class194 field1576 = new class194();

    @ObfuscatedName("cr.e")
    public int field1575 = 0;

    @ObfuscatedName("cr.v")
    public int field1573 = -1;

    @ObfuscatedName("cr.i(Ldy;)V")
    public final synchronized void method1740(class120 arg0) {
        this.field1574.method3290(arg0);
    }

    @ObfuscatedName("cr.c(Ldy;)V")
    public final synchronized void method1727(class120 arg0) {
        arg0.method3278();
    }

    @ObfuscatedName("cr.e()V")
    public void method1728() {
        if (this.field1575 <= 0) {
            return;
        }
        for (class114 var1 = (class114) this.field1576.method3294(); var1 != null; var1 = (class114) this.field1576.method3296()) {
            var1.field1689 -= this.field1575;
        }
        this.field1573 -= this.field1575;
        this.field1575 = 0;
    }

    @ObfuscatedName("cr.v(Lgz;Ldo;)V")
    public void method1729(class193 arg0, class114 arg1) {
        while (this.field1576.field2483 != arg0 && ((class114) arg0).field1689 <= arg1.field1689) {
            arg0 = arg0.field2481;
        }
        class194.method3291(arg1, arg0);
        this.field1573 = ((class114) this.field1576.field2483.field2481).field1689;
    }

    @ObfuscatedName("cr.b(Ldo;)V")
    public void method1768(class114 arg0) {
        arg0.method3278();
        arg0.method1918();
        class193 var2 = this.field1576.field2483.field2481;
        if (this.field1576.field2483 == var2) {
            this.field1573 = -1;
        } else {
            this.field1573 = ((class114) var2).field1689;
        }
    }

    @ObfuscatedName("cr.y()Ldy;")
    public class120 method1731() {
        return (class120) this.field1574.method3294();
    }

    @ObfuscatedName("cr.h()Ldy;")
    public class120 method1733() {
        return (class120) this.field1574.method3296();
    }

    @ObfuscatedName("cr.x()I")
    public int method1730() {
        return 0;
    }

    @ObfuscatedName("cr.f([III)V")
    public final synchronized void method1734(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1573 < 0) {
                this.method1735(arg0, arg1, arg2);
                return;
            }
            if (this.field1575 + arg2 < this.field1573) {
                this.field1575 += arg2;
                this.method1735(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1573 - this.field1575;
            this.method1735(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1575 += var4;
            this.method1728();
            class114 var5 = (class114) this.field1576.method3294();
            synchronized (var5) {
                int var7 = var5.method1916(this);
                if (var7 < 0) {
                    var5.field1689 = 0;
                    this.method1768(var5);
                } else {
                    var5.field1689 = var7;
                    this.method1729(var5.field2481, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("cr.n([III)V")
    public void method1735(int[] arg0, int arg1, int arg2) {
        for (class120 var4 = (class120) this.field1574.method3294(); var4 != null; var4 = (class120) this.field1574.method3296()) {
            var4.method2080(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("cr.a(I)V")
    public final synchronized void method1725(int arg0) {
        do {
            if (this.field1573 < 0) {
                this.method1737(arg0);
                return;
            }
            if (this.field1575 + arg0 < this.field1573) {
                this.field1575 += arg0;
                this.method1737(arg0);
                return;
            }
            int var2 = this.field1573 - this.field1575;
            this.method1737(var2);
            arg0 -= var2;
            this.field1575 += var2;
            this.method1728();
            class114 var3 = (class114) this.field1576.method3294();
            synchronized (var3) {
                int var5 = var3.method1916(this);
                if (var5 < 0) {
                    var3.field1689 = 0;
                    this.method1768(var3);
                } else {
                    var3.field1689 = var5;
                    this.method1729(var3.field2481, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("cr.o(I)V")
    public void method1737(int arg0) {
        for (class120 var2 = (class120) this.field1574.method3294(); var2 != null; var2 = (class120) this.field1574.method3296()) {
            var2.method1725(arg0);
        }
    }
}
