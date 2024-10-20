package deob;

@ObfuscatedName("dr")
public class class110 implements class106 {

    @ObfuscatedName("dr.f")
    public class90[] field1811;

    @ObfuscatedName("dr.t")
    public class177 field1810 = new class177();

    @ObfuscatedName("dr.n")
    public int field1822;

    @ObfuscatedName("dr.e")
    public int field1812 = 0;

    @ObfuscatedName("dr.l")
    public double field1813 = 1.0D;

    @ObfuscatedName("dr.d")
    public int field1814 = 128;

    @ObfuscatedName("dr.r")
    public class153 field1815;

    public class110(class153 arg0, class153 arg1, int arg2, double arg3, int arg4) {
        this.field1815 = arg1;
        this.field1822 = arg2;
        this.field1812 = this.field1822;
        this.field1813 = arg3;
        this.field1814 = arg4;
        int[] var7 = arg0.method3043(0);
        int var8 = var7.length;
        this.field1811 = new class90[arg0.method3056(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class127 var10 = new class127(arg0.method3035(0, var7[var9]));
            this.field1811[var7[var9]] = new class90(var10);
        }
    }

    @ObfuscatedName("dr.a(D)V")
    public void method2224(double arg0) {
        this.field1813 = arg0;
        this.method2225();
    }

    @ObfuscatedName("dr.f(II)[I")
    public int[] method2210(int arg0) {
        class90 var2 = this.field1811[arg0];
        if (var2 != null) {
            if (var2.field1497 != null) {
                this.field1810.method3334(var2);
                var2.field1498 = true;
                return var2.field1497;
            }
            boolean var3 = var2.method1868(this.field1813, this.field1814, this.field1815);
            if (var3) {
                if (this.field1812 == 0) {
                    class90 var4 = (class90) this.field1810.method3337();
                    var4.method1859();
                } else {
                    this.field1812--;
                }
                this.field1810.method3334(var2);
                var2.field1498 = true;
                return var2.field1497;
            }
        }
        return null;
    }

    @ObfuscatedName("dr.t(IB)I")
    public int method2208(int arg0) {
        return this.field1811[arg0] == null ? 0 : this.field1811[arg0].field1489;
    }

    @ObfuscatedName("dr.n(II)Z")
    public boolean method2201(int arg0) {
        return this.field1811[arg0].field1490;
    }

    @ObfuscatedName("dr.e(II)Z")
    public boolean method2202(int arg0) {
        return this.field1814 == 64;
    }

    @ObfuscatedName("dr.c(B)V")
    public void method2225() {
        for (int var1 = 0; var1 < this.field1811.length; var1++) {
            if (this.field1811[var1] != null) {
                this.field1811[var1].method1859();
            }
        }
        this.field1810 = new class177();
        this.field1812 = this.field1822;
    }

    @ObfuscatedName("dr.m(II)V")
    public void method2227(int arg0) {
        for (int var2 = 0; var2 < this.field1811.length; var2++) {
            class90 var3 = this.field1811[var2];
            if (var3 != null && var3.field1495 != 0 && var3.field1498) {
                var3.method1861(arg0);
                var3.field1498 = false;
            }
        }
    }
}
