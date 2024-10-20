package deob;

@ObfuscatedName("ch")
public class class103 extends class120 {

    @ObfuscatedName("ch.c")
    public class194 field1530 = new class194();

    @ObfuscatedName("ch.o")
    public class194 field1529 = new class194();

    @ObfuscatedName("ch.i")
    public int field1528 = 0;

    @ObfuscatedName("ch.u")
    public int field1531 = -1;

    @ObfuscatedName("ch.c(Ldk;)V")
    public final synchronized void method1673(class120 arg0) {
        this.field1530.method3292(arg0);
    }

    @ObfuscatedName("ch.o(Ldk;)V")
    public final synchronized void method1674(class120 arg0) {
        arg0.method3287();
    }

    @ObfuscatedName("ch.i()V")
    public void method1672() {
        if (this.field1528 <= 0) {
            return;
        }
        for (class114 var1 = (class114) this.field1529.method3296(); var1 != null; var1 = (class114) this.field1529.method3298()) {
            var1.field1636 -= this.field1528;
        }
        this.field1531 -= this.field1528;
        this.field1528 = 0;
    }

    @ObfuscatedName("ch.u(Lgh;Ldo;)V")
    public void method1689(class193 arg0, class114 arg1) {
        while (this.field1529.field2440 != arg0 && ((class114) arg0).field1636 <= arg1.field1636) {
            arg0 = arg0.field2438;
        }
        class194.method3293(arg1, arg0);
        this.field1531 = ((class114) this.field1529.field2440.field2438).field1636;
    }

    @ObfuscatedName("ch.g(Ldo;)V")
    public void method1677(class114 arg0) {
        arg0.method3287();
        arg0.method1872();
        class193 var2 = this.field1529.field2440.field2438;
        if (this.field1529.field2440 == var2) {
            this.field1531 = -1;
        } else {
            this.field1531 = ((class114) var2).field1636;
        }
    }

    @ObfuscatedName("ch.m()Ldk;")
    public class120 method1678() {
        return (class120) this.field1530.method3296();
    }

    @ObfuscatedName("ch.s()Ldk;")
    public class120 method1679() {
        return (class120) this.field1530.method3298();
    }

    @ObfuscatedName("ch.x()I")
    public int method1694() {
        return 0;
    }

    @ObfuscatedName("ch.p([III)V")
    public final synchronized void method1681(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1531 < 0) {
                this.method1703(arg0, arg1, arg2);
                return;
            }
            if (this.field1528 + arg2 < this.field1531) {
                this.field1528 += arg2;
                this.method1703(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1531 - this.field1528;
            this.method1703(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1528 += var4;
            this.method1672();
            class114 var5 = (class114) this.field1529.method3296();
            synchronized (var5) {
                int var7 = var5.method1873(this);
                if (var7 < 0) {
                    var5.field1636 = 0;
                    this.method1677(var5);
                } else {
                    var5.field1636 = var7;
                    this.method1689(var5.field2438, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("ch.k([III)V")
    public void method1703(int[] arg0, int arg1, int arg2) {
        for (class120 var4 = (class120) this.field1530.method3296(); var4 != null; var4 = (class120) this.field1530.method3298()) {
            var4.method2051(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ch.r(I)V")
    public final synchronized void method1683(int arg0) {
        do {
            if (this.field1531 < 0) {
                this.method1684(arg0);
                return;
            }
            if (this.field1528 + arg0 < this.field1531) {
                this.field1528 += arg0;
                this.method1684(arg0);
                return;
            }
            int var2 = this.field1531 - this.field1528;
            this.method1684(var2);
            arg0 -= var2;
            this.field1528 += var2;
            this.method1672();
            class114 var3 = (class114) this.field1529.method3296();
            synchronized (var3) {
                int var5 = var3.method1873(this);
                if (var5 < 0) {
                    var3.field1636 = 0;
                    this.method1677(var3);
                } else {
                    var3.field1636 = var5;
                    this.method1689(var3.field2438, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("ch.w(I)V")
    public void method1684(int arg0) {
        for (class120 var2 = (class120) this.field1530.method3296(); var2 != null; var2 = (class120) this.field1530.method3298()) {
            var2.method1683(arg0);
        }
    }
}
