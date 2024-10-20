package deob;

@ObfuscatedName("cv")
public class class103 extends class120 {

    @ObfuscatedName("cv.e")
    public class194 field1563 = new class194();

    @ObfuscatedName("cv.o")
    public class194 field1560 = new class194();

    @ObfuscatedName("cv.m")
    public int field1562 = 0;

    @ObfuscatedName("cv.g")
    public int field1561 = -1;

    @ObfuscatedName("cv.e(Ldx;)V")
    public final synchronized void method1728(class120 arg0) {
        this.field1563.method3314(arg0);
    }

    @ObfuscatedName("cv.o(Ldx;)V")
    public final synchronized void method1709(class120 arg0) {
        arg0.method3304();
    }

    @ObfuscatedName("cv.m()V")
    public void method1704() {
        if (this.field1562 <= 0) {
            return;
        }
        for (class114 var1 = (class114) this.field1560.method3336(); var1 != null; var1 = (class114) this.field1560.method3324()) {
            var1.field1673 -= this.field1562;
        }
        this.field1561 -= this.field1562;
        this.field1562 = 0;
    }

    @ObfuscatedName("cv.g(Lgc;Ldo;)V")
    public void method1706(class193 arg0, class114 arg1) {
        while (this.field1560.field2456 != arg0 && ((class114) arg0).field1673 <= arg1.field1673) {
            arg0 = arg0.field2453;
        }
        class194.method3346(arg1, arg0);
        this.field1561 = ((class114) this.field1560.field2456.field2453).field1673;
    }

    @ObfuscatedName("cv.d(Ldo;)V")
    public void method1720(class114 arg0) {
        arg0.method3304();
        arg0.method1914();
        class193 var2 = this.field1560.field2456.field2453;
        if (this.field1560.field2456 == var2) {
            this.field1561 = -1;
        } else {
            this.field1561 = ((class114) var2).field1673;
        }
    }

    @ObfuscatedName("cv.b()Ldx;")
    public class120 method1708() {
        return (class120) this.field1563.method3336();
    }

    @ObfuscatedName("cv.k()Ldx;")
    public class120 method1707() {
        return (class120) this.field1563.method3324();
    }

    @ObfuscatedName("cv.q()I")
    public int method1710() {
        return 0;
    }

    @ObfuscatedName("cv.h([III)V")
    public final synchronized void method1711(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1561 < 0) {
                this.method1734(arg0, arg1, arg2);
                return;
            }
            if (this.field1562 + arg2 < this.field1561) {
                this.field1562 += arg2;
                this.method1734(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1561 - this.field1562;
            this.method1734(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1562 += var4;
            this.method1704();
            class114 var5 = (class114) this.field1560.method3336();
            synchronized (var5) {
                int var7 = var5.method1911(this);
                if (var7 < 0) {
                    var5.field1673 = 0;
                    this.method1720(var5);
                } else {
                    var5.field1673 = var7;
                    this.method1706(var5.field2453, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("cv.i([III)V")
    public void method1734(int[] arg0, int arg1, int arg2) {
        for (class120 var4 = (class120) this.field1563.method3336(); var4 != null; var4 = (class120) this.field1563.method3324()) {
            var4.method2093(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("cv.s(I)V")
    public final synchronized void method1713(int arg0) {
        do {
            if (this.field1561 < 0) {
                this.method1714(arg0);
                return;
            }
            if (this.field1562 + arg0 < this.field1561) {
                this.field1562 += arg0;
                this.method1714(arg0);
                return;
            }
            int var2 = this.field1561 - this.field1562;
            this.method1714(var2);
            arg0 -= var2;
            this.field1562 += var2;
            this.method1704();
            class114 var3 = (class114) this.field1560.method3336();
            synchronized (var3) {
                int var5 = var3.method1911(this);
                if (var5 < 0) {
                    var3.field1673 = 0;
                    this.method1720(var3);
                } else {
                    var3.field1673 = var5;
                    this.method1706(var3.field2453, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("cv.n(I)V")
    public void method1714(int arg0) {
        for (class120 var2 = (class120) this.field1563.method3336(); var2 != null; var2 = (class120) this.field1563.method3324()) {
            var2.method1713(arg0);
        }
    }
}
