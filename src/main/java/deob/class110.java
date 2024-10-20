package deob;

@ObfuscatedName("ds")
public class class110 implements class106 {

    @ObfuscatedName("ds.y")
    public class90[] field1823;

    @ObfuscatedName("ds.m")
    public class177 field1813 = new class177();

    @ObfuscatedName("ds.d")
    public int field1814;

    @ObfuscatedName("ds.k")
    public int field1815 = 0;

    @ObfuscatedName("ds.n")
    public double field1816 = 1.0D;

    @ObfuscatedName("ds.s")
    public int field1819 = 128;

    @ObfuscatedName("ds.x")
    public class152 field1818;

    public class110(class152 arg0, class152 arg1, int arg2, double arg3, int arg4) {
        this.field1818 = arg1;
        this.field1814 = arg2;
        this.field1815 = this.field1814;
        this.field1816 = arg3;
        this.field1819 = arg4;
        int[] var7 = arg0.method3033(0);
        int var8 = var7.length;
        this.field1823 = new class90[arg0.method2994(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class127 var10 = new class127(arg0.method2991(0, var7[var9]));
            this.field1823[var7[var9]] = new class90(var10);
        }
    }

    @ObfuscatedName("ds.t(D)V")
    public void method2231(double arg0) {
        this.field1816 = arg0;
        this.method2233();
    }

    @ObfuscatedName("ds.y(II)[I")
    public int[] method2212(int arg0) {
        class90 var2 = this.field1823[arg0];
        if (var2 != null) {
            if (var2.field1499 != null) {
                this.field1813.method3351(var2);
                var2.field1500 = true;
                return var2.field1499;
            }
            boolean var3 = var2.method1860(this.field1816, this.field1819, this.field1818);
            if (var3) {
                if (this.field1815 == 0) {
                    class90 var4 = (class90) this.field1813.method3354();
                    var4.method1861();
                } else {
                    this.field1815--;
                }
                this.field1813.method3351(var2);
                var2.field1500 = true;
                return var2.field1499;
            }
        }
        return null;
    }

    @ObfuscatedName("ds.m(II)I")
    public int method2207(int arg0) {
        return this.field1823[arg0] == null ? 0 : this.field1823[arg0].field1491;
    }

    @ObfuscatedName("ds.d(II)Z")
    public boolean method2208(int arg0) {
        return this.field1823[arg0].field1498;
    }

    @ObfuscatedName("ds.k(II)Z")
    public boolean method2209(int arg0) {
        return this.field1819 == 64;
    }

    @ObfuscatedName("ds.u(I)V")
    public void method2233() {
        for (int var1 = 0; var1 < this.field1823.length; var1++) {
            if (this.field1823[var1] != null) {
                this.field1823[var1].method1861();
            }
        }
        this.field1813 = new class177();
        this.field1815 = this.field1814;
    }

    @ObfuscatedName("ds.z(IB)V")
    public void method2234(int arg0) {
        for (int var2 = 0; var2 < this.field1823.length; var2++) {
            class90 var3 = this.field1823[var2];
            if (var3 != null && var3.field1497 != 0 && var3.field1500) {
                var3.method1862(arg0);
                var3.field1500 = false;
            }
        }
    }
}
