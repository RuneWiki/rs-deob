package deob;

@ObfuscatedName("cj")
public class class103 extends class120 {

    @ObfuscatedName("cj.s")
    public class197 field1557 = new class197();

    @ObfuscatedName("cj.c")
    public class197 field1556 = new class197();

    @ObfuscatedName("cj.f")
    public int field1558 = 0;

    @ObfuscatedName("cj.m")
    public int field1555 = -1;

    @ObfuscatedName("cj.s(Lds;)V")
    public final synchronized void method1800(class120 arg0) {
        this.field1557.method3379(arg0);
    }

    @ObfuscatedName("cj.c(Lds;)V")
    public final synchronized void method1766(class120 arg0) {
        arg0.method3372();
    }

    @ObfuscatedName("cj.f()V")
    public void method1767() {
        if (this.field1558 <= 0) {
            return;
        }
        for (class115 var1 = (class115) this.field1556.method3389(); var1 != null; var1 = (class115) this.field1556.method3385()) {
            var1.field1668 -= this.field1558;
        }
        this.field1555 -= this.field1558;
        this.field1558 = 0;
    }

    @ObfuscatedName("cj.m(Lgr;Ldb;)V")
    public void method1768(class196 arg0, class115 arg1) {
        while (this.field1556.field2489 != arg0 && ((class115) arg0).field1668 <= arg1.field1668) {
            arg0 = arg0.field2486;
        }
        class197.method3380(arg1, arg0);
        this.field1555 = ((class115) this.field1556.field2489.field2486).field1668;
    }

    @ObfuscatedName("cj.h(Ldb;)V")
    public void method1769(class115 arg0) {
        arg0.method3372();
        arg0.method1961();
        class196 var2 = this.field1556.field2489.field2486;
        if (this.field1556.field2489 == var2) {
            this.field1555 = -1;
        } else {
            this.field1555 = ((class115) var2).field1668;
        }
    }

    @ObfuscatedName("cj.t()Lds;")
    public class120 method1797() {
        return (class120) this.field1557.method3389();
    }

    @ObfuscatedName("cj.p()Lds;")
    public class120 method1778() {
        return (class120) this.field1557.method3385();
    }

    @ObfuscatedName("cj.d()I")
    public int method1770() {
        return 0;
    }

    @ObfuscatedName("cj.n([III)V")
    public final synchronized void method1773(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1555 < 0) {
                this.method1774(arg0, arg1, arg2);
                return;
            }
            if (this.field1558 + arg2 < this.field1555) {
                this.field1558 += arg2;
                this.method1774(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1555 - this.field1558;
            this.method1774(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1558 += var4;
            this.method1767();
            class115 var5 = (class115) this.field1556.method3389();
            synchronized (var5) {
                int var7 = var5.method1963(this);
                if (var7 < 0) {
                    var5.field1668 = 0;
                    this.method1769(var5);
                } else {
                    var5.field1668 = var7;
                    this.method1768(var5.field2486, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("cj.z([III)V")
    public void method1774(int[] arg0, int arg1, int arg2) {
        for (class120 var4 = (class120) this.field1557.method3389(); var4 != null; var4 = (class120) this.field1557.method3385()) {
            var4.method2146(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("cj.o(I)V")
    public final synchronized void method1775(int arg0) {
        do {
            if (this.field1555 < 0) {
                this.method1776(arg0);
                return;
            }
            if (this.field1558 + arg0 < this.field1555) {
                this.field1558 += arg0;
                this.method1776(arg0);
                return;
            }
            int var2 = this.field1555 - this.field1558;
            this.method1776(var2);
            arg0 -= var2;
            this.field1558 += var2;
            this.method1767();
            class115 var3 = (class115) this.field1556.method3389();
            synchronized (var3) {
                int var5 = var3.method1963(this);
                if (var5 < 0) {
                    var3.field1668 = 0;
                    this.method1769(var3);
                } else {
                    var3.field1668 = var5;
                    this.method1768(var3.field2486, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("cj.u(I)V")
    public void method1776(int arg0) {
        for (class120 var2 = (class120) this.field1557.method3389(); var2 != null; var2 = (class120) this.field1557.method3385()) {
            var2.method1775(arg0);
        }
    }
}
