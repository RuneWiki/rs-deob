package deob;

@ObfuscatedName("cx")
public class class103 extends class120 {

    @ObfuscatedName("cx.o")
    public class197 field1571 = new class197();

    @ObfuscatedName("cx.x")
    public class197 field1573 = new class197();

    @ObfuscatedName("cx.k")
    public int field1570 = 0;

    @ObfuscatedName("cx.f")
    public int field1572 = -1;

    @ObfuscatedName("cx.w(Ldj;)V")
    public final synchronized void method1686(class120 arg0) {
        this.field1571.method3300(arg0);
    }

    @ObfuscatedName("cx.o(Ldj;)V")
    public final synchronized void method1687(class120 arg0) {
        arg0.method3294();
    }

    @ObfuscatedName("cx.x()V")
    public void method1712() {
        if (this.field1570 <= 0) {
            return;
        }
        for (class115 var1 = (class115) this.field1573.method3304(); var1 != null; var1 = (class115) this.field1573.method3306()) {
            var1.field1676 -= this.field1570;
        }
        this.field1572 -= this.field1570;
        this.field1570 = 0;
    }

    @ObfuscatedName("cx.k(Lgd;Ldc;)V")
    public void method1689(class196 arg0, class115 arg1) {
        while (this.field1573.field2491 != arg0 && ((class115) arg0).field1676 <= arg1.field1676) {
            arg0 = arg0.field2489;
        }
        class197.method3301(arg1, arg0);
        this.field1572 = ((class115) this.field1573.field2491.field2489).field1676;
    }

    @ObfuscatedName("cx.f(Ldc;)V")
    public void method1690(class115 arg0) {
        arg0.method3294();
        arg0.method1891();
        class196 var2 = this.field1573.field2491.field2489;
        if (this.field1573.field2491 == var2) {
            this.field1572 = -1;
        } else {
            this.field1572 = ((class115) var2).field1676;
        }
    }

    @ObfuscatedName("cx.i()Ldj;")
    public class120 method1691() {
        return (class120) this.field1571.method3304();
    }

    @ObfuscatedName("cx.j()Ldj;")
    public class120 method1716() {
        return (class120) this.field1571.method3306();
    }

    @ObfuscatedName("cx.m()I")
    public int method1693() {
        return 0;
    }

    @ObfuscatedName("cx.u([III)V")
    public final synchronized void method1726(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1572 < 0) {
                this.method1695(arg0, arg1, arg2);
                return;
            }
            if (this.field1570 + arg2 < this.field1572) {
                this.field1570 += arg2;
                this.method1695(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1572 - this.field1570;
            this.method1695(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1570 += var4;
            this.method1712();
            class115 var5 = (class115) this.field1573.method3304();
            synchronized (var5) {
                int var7 = var5.method1889(this);
                if (var7 < 0) {
                    var5.field1676 = 0;
                    this.method1690(var5);
                } else {
                    var5.field1676 = var7;
                    this.method1689(var5.field2489, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("cx.h([III)V")
    public void method1695(int[] arg0, int arg1, int arg2) {
        for (class120 var4 = (class120) this.field1571.method3304(); var4 != null; var4 = (class120) this.field1571.method3306()) {
            var4.method2071(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("cx.a(I)V")
    public final synchronized void method1696(int arg0) {
        do {
            if (this.field1572 < 0) {
                this.method1697(arg0);
                return;
            }
            if (this.field1570 + arg0 < this.field1572) {
                this.field1570 += arg0;
                this.method1697(arg0);
                return;
            }
            int var2 = this.field1572 - this.field1570;
            this.method1697(var2);
            arg0 -= var2;
            this.field1570 += var2;
            this.method1712();
            class115 var3 = (class115) this.field1573.method3304();
            synchronized (var3) {
                int var5 = var3.method1889(this);
                if (var5 < 0) {
                    var3.field1676 = 0;
                    this.method1690(var3);
                } else {
                    var3.field1676 = var5;
                    this.method1689(var3.field2489, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("cx.p(I)V")
    public void method1697(int arg0) {
        for (class120 var2 = (class120) this.field1571.method3304(); var2 != null; var2 = (class120) this.field1571.method3306()) {
            var2.method1696(arg0);
        }
    }
}
