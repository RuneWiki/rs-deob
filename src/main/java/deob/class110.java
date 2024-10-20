package deob;

@ObfuscatedName("dh")
public class class110 implements class106 {

    @ObfuscatedName("dh.a")
    public class90[] field1804;

    @ObfuscatedName("dh.r")
    public class177 field1800 = new class177();

    @ObfuscatedName("dh.u")
    public int field1801;

    @ObfuscatedName("dh.t")
    public int field1805 = 0;

    @ObfuscatedName("dh.k")
    public double field1806 = 1.0D;

    @ObfuscatedName("dh.x")
    public int field1811 = 128;

    @ObfuscatedName("dh.v")
    public class152 field1803;

    public class110(class152 arg0, class152 arg1, int arg2, double arg3, int arg4) {
        this.field1803 = arg1;
        this.field1801 = arg2;
        this.field1805 = this.field1801;
        this.field1806 = arg3;
        this.field1811 = arg4;
        int[] var7 = arg0.method2960(0);
        int var8 = var7.length;
        this.field1804 = new class90[arg0.method2962(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class126 var10 = new class126(arg0.method2943(0, var7[var9]));
            this.field1804[var7[var9]] = new class90(var10);
        }
    }

    @ObfuscatedName("dh.s(D)V")
    public void method2165(double arg0) {
        this.field1806 = arg0;
        this.method2164();
    }

    @ObfuscatedName("dh.a(II)[I")
    public int[] method2142(int arg0) {
        class90 var2 = this.field1804[arg0];
        if (var2 != null) {
            if (var2.field1472 != null) {
                this.field1800.method3272(var2);
                var2.field1482 = true;
                return var2.field1472;
            }
            boolean var3 = var2.method1784(this.field1806, this.field1811, this.field1803);
            if (var3) {
                if (this.field1805 == 0) {
                    class90 var4 = (class90) this.field1800.method3296();
                    var4.method1785();
                } else {
                    this.field1805--;
                }
                this.field1800.method3272(var2);
                var2.field1482 = true;
                return var2.field1472;
            }
        }
        return null;
    }

    @ObfuscatedName("dh.r(II)I")
    public int method2139(int arg0) {
        return this.field1804[arg0] == null ? 0 : this.field1804[arg0].field1473;
    }

    @ObfuscatedName("dh.u(II)Z")
    public boolean method2140(int arg0) {
        return this.field1804[arg0].field1474;
    }

    @ObfuscatedName("dh.t(II)Z")
    public boolean method2141(int arg0) {
        return this.field1811 == 64;
    }

    @ObfuscatedName("dh.b(B)V")
    public void method2164() {
        for (int var1 = 0; var1 < this.field1804.length; var1++) {
            if (this.field1804[var1] != null) {
                this.field1804[var1].method1785();
            }
        }
        this.field1800 = new class177();
        this.field1805 = this.field1801;
    }

    @ObfuscatedName("dh.c(IB)V")
    public void method2163(int arg0) {
        for (int var2 = 0; var2 < this.field1804.length; var2++) {
            class90 var3 = this.field1804[var2];
            if (var3 != null && var3.field1479 != 0 && var3.field1482) {
                var3.method1786(arg0);
                var3.field1482 = false;
            }
        }
    }
}
