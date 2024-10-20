package deob;

@ObfuscatedName("cv")
public class class103 extends class120 {

    @ObfuscatedName("cv.p")
    public class194 field1559 = new class194();

    @ObfuscatedName("cv.m")
    public class194 field1557 = new class194();

    @ObfuscatedName("cv.e")
    public int field1558 = 0;

    @ObfuscatedName("cv.t")
    public int field1560 = -1;

    @ObfuscatedName("cv.p(Ldb;)V")
    public final synchronized void method1690(class120 arg0) {
        this.field1559.method3266(arg0);
    }

    @ObfuscatedName("cv.m(Ldb;)V")
    public final synchronized void method1664(class120 arg0) {
        arg0.method3234();
    }

    @ObfuscatedName("cv.e()V")
    public void method1665() {
        if (this.field1558 <= 0) {
            return;
        }
        for (class114 var1 = (class114) this.field1557.method3252(); var1 != null; var1 = (class114) this.field1557.method3277()) {
            var1.field1672 -= this.field1558;
        }
        this.field1560 -= this.field1558;
        this.field1558 = 0;
    }

    @ObfuscatedName("cv.t(Lgw;Ldn;)V")
    public void method1666(class193 arg0, class114 arg1) {
        while (this.field1557.field2485 != arg0 && ((class114) arg0).field1672 <= arg1.field1672) {
            arg0 = arg0.field2484;
        }
        class194.method3283(arg1, arg0);
        this.field1560 = ((class114) this.field1557.field2485.field2484).field1672;
    }

    @ObfuscatedName("cv.w(Ldn;)V")
    public void method1667(class114 arg0) {
        arg0.method3234();
        arg0.method1879();
        class193 var2 = this.field1557.field2485.field2484;
        if (this.field1557.field2485 == var2) {
            this.field1560 = -1;
        } else {
            this.field1560 = ((class114) var2).field1672;
        }
    }

    @ObfuscatedName("cv.z()Ldb;")
    public class120 method1668() {
        return (class120) this.field1559.method3252();
    }

    @ObfuscatedName("cv.j()Ldb;")
    public class120 method1669() {
        return (class120) this.field1559.method3277();
    }

    @ObfuscatedName("cv.c()I")
    public int method1670() {
        return 0;
    }

    @ObfuscatedName("cv.o([III)V")
    public final synchronized void method1671(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1560 < 0) {
                this.method1672(arg0, arg1, arg2);
                return;
            }
            if (this.field1558 + arg2 < this.field1560) {
                this.field1558 += arg2;
                this.method1672(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1560 - this.field1558;
            this.method1672(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1558 += var4;
            this.method1665();
            class114 var5 = (class114) this.field1557.method3252();
            synchronized (var5) {
                int var7 = var5.method1873(this);
                if (var7 < 0) {
                    var5.field1672 = 0;
                    this.method1667(var5);
                } else {
                    var5.field1672 = var7;
                    this.method1666(var5.field2484, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("cv.q([III)V")
    public void method1672(int[] arg0, int arg1, int arg2) {
        for (class120 var4 = (class120) this.field1559.method3252(); var4 != null; var4 = (class120) this.field1559.method3277()) {
            var4.method2046(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("cv.n(I)V")
    public final synchronized void method1673(int arg0) {
        do {
            if (this.field1560 < 0) {
                this.method1674(arg0);
                return;
            }
            if (this.field1558 + arg0 < this.field1560) {
                this.field1558 += arg0;
                this.method1674(arg0);
                return;
            }
            int var2 = this.field1560 - this.field1558;
            this.method1674(var2);
            arg0 -= var2;
            this.field1558 += var2;
            this.method1665();
            class114 var3 = (class114) this.field1557.method3252();
            synchronized (var3) {
                int var5 = var3.method1873(this);
                if (var5 < 0) {
                    var3.field1672 = 0;
                    this.method1667(var3);
                } else {
                    var3.field1672 = var5;
                    this.method1666(var3.field2484, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("cv.a(I)V")
    public void method1674(int arg0) {
        for (class120 var2 = (class120) this.field1559.method3252(); var2 != null; var2 = (class120) this.field1559.method3277()) {
            var2.method1673(arg0);
        }
    }
}
