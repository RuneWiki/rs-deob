package deob;

@ObfuscatedName("co")
public class class103 extends class120 {

    @ObfuscatedName("co.n")
    public class194 field1565 = new class194();

    @ObfuscatedName("co.p")
    public class194 field1566 = new class194();

    @ObfuscatedName("co.i")
    public int field1567 = 0;

    @ObfuscatedName("co.j")
    public int field1568 = -1;

    @ObfuscatedName("co.n(Ldp;)V")
    public final synchronized void method1731(class120 arg0) {
        this.field1565.method3353(arg0);
    }

    @ObfuscatedName("co.p(Ldp;)V")
    public final synchronized void method1732(class120 arg0) {
        arg0.method3347();
    }

    @ObfuscatedName("co.i()V")
    public void method1733() {
        if (this.field1567 <= 0) {
            return;
        }
        for (class114 var1 = (class114) this.field1566.method3372(); var1 != null; var1 = (class114) this.field1566.method3358()) {
            var1.field1680 -= this.field1567;
        }
        this.field1568 -= this.field1567;
        this.field1567 = 0;
    }

    @ObfuscatedName("co.j(Lgr;Ldm;)V")
    public void method1734(class193 arg0, class114 arg1) {
        while (this.field1566.field2486 != arg0 && ((class114) arg0).field1680 <= arg1.field1680) {
            arg0 = arg0.field2482;
        }
        class194.method3350(arg1, arg0);
        this.field1568 = ((class114) this.field1566.field2486.field2482).field1680;
    }

    @ObfuscatedName("co.f(Ldm;)V")
    public void method1735(class114 arg0) {
        arg0.method3347();
        arg0.method1937();
        class193 var2 = this.field1566.field2486.field2482;
        if (this.field1566.field2486 == var2) {
            this.field1568 = -1;
        } else {
            this.field1568 = ((class114) var2).field1680;
        }
    }

    @ObfuscatedName("co.m()Ldp;")
    public class120 method1757() {
        return (class120) this.field1565.method3372();
    }

    @ObfuscatedName("co.c()Ldp;")
    public class120 method1737() {
        return (class120) this.field1565.method3358();
    }

    @ObfuscatedName("co.z()I")
    public int method1736() {
        return 0;
    }

    @ObfuscatedName("co.h([III)V")
    public final synchronized void method1752(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1568 < 0) {
                this.method1740(arg0, arg1, arg2);
                return;
            }
            if (this.field1567 + arg2 < this.field1568) {
                this.field1567 += arg2;
                this.method1740(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1568 - this.field1567;
            this.method1740(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1567 += var4;
            this.method1733();
            class114 var5 = (class114) this.field1566.method3372();
            synchronized (var5) {
                int var7 = var5.method1942(this);
                if (var7 < 0) {
                    var5.field1680 = 0;
                    this.method1735(var5);
                } else {
                    var5.field1680 = var7;
                    this.method1734(var5.field2482, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("co.g([III)V")
    public void method1740(int[] arg0, int arg1, int arg2) {
        for (class120 var4 = (class120) this.field1565.method3372(); var4 != null; var4 = (class120) this.field1565.method3358()) {
            var4.method2126(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("co.e(I)V")
    public final synchronized void method1741(int arg0) {
        do {
            if (this.field1568 < 0) {
                this.method1739(arg0);
                return;
            }
            if (this.field1567 + arg0 < this.field1568) {
                this.field1567 += arg0;
                this.method1739(arg0);
                return;
            }
            int var2 = this.field1568 - this.field1567;
            this.method1739(var2);
            arg0 -= var2;
            this.field1567 += var2;
            this.method1733();
            class114 var3 = (class114) this.field1566.method3372();
            synchronized (var3) {
                int var5 = var3.method1942(this);
                if (var5 < 0) {
                    var3.field1680 = 0;
                    this.method1735(var3);
                } else {
                    var3.field1680 = var5;
                    this.method1734(var3.field2482, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("co.o(I)V")
    public void method1739(int arg0) {
        for (class120 var2 = (class120) this.field1565.method3372(); var2 != null; var2 = (class120) this.field1565.method3358()) {
            var2.method1741(arg0);
        }
    }
}
