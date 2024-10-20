package deob;

@ObfuscatedName("dc")
public class class111 implements class107 {

    @ObfuscatedName("dc.e")
    public class91[] field1828;

    @ObfuscatedName("dc.i")
    public class179 field1823 = new class179();

    @ObfuscatedName("dc.k")
    public int field1830;

    @ObfuscatedName("dc.q")
    public int field1825 = 0;

    @ObfuscatedName("dc.j")
    public double field1826 = 1.0D;

    @ObfuscatedName("dc.z")
    public int field1827 = 128;

    @ObfuscatedName("dc.m")
    public class155 field1824;

    public class111(class155 arg0, class155 arg1, int arg2, double arg3, int arg4) {
        this.field1824 = arg1;
        this.field1830 = arg2;
        this.field1825 = this.field1830;
        this.field1826 = arg3;
        this.field1827 = arg4;
        int[] var7 = arg0.method3029(0);
        int var8 = var7.length;
        this.field1828 = new class91[arg0.method3019(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class128 var10 = new class128(arg0.method3069(0, var7[var9]));
            this.field1828[var7[var9]] = new class91(var10);
        }
    }

    @ObfuscatedName("dc.c(D)V")
    public void method2227(double arg0) {
        this.field1826 = arg0;
        this.method2230();
    }

    @ObfuscatedName("dc.e(II)[I")
    public int[] method2202(int arg0) {
        class91 var2 = this.field1828[arg0];
        if (var2 != null) {
            if (var2.field1493 != null) {
                this.field1823.method3352(var2);
                var2.field1487 = true;
                return var2.field1493;
            }
            boolean var3 = var2.method1876(this.field1826, this.field1827, this.field1824);
            if (var3) {
                if (this.field1825 == 0) {
                    class91 var4 = (class91) this.field1823.method3340();
                    var4.method1877();
                } else {
                    this.field1825--;
                }
                this.field1823.method3352(var2);
                var2.field1487 = true;
                return var2.field1493;
            }
        }
        return null;
    }

    @ObfuscatedName("dc.i(II)I")
    public int method2213(int arg0) {
        return this.field1828[arg0] == null ? 0 : this.field1828[arg0].field1488;
    }

    @ObfuscatedName("dc.k(II)Z")
    public boolean method2203(int arg0) {
        return this.field1828[arg0].field1492;
    }

    @ObfuscatedName("dc.q(II)Z")
    public boolean method2204(int arg0) {
        return this.field1827 == 64;
    }

    @ObfuscatedName("dc.b(I)V")
    public void method2230() {
        for (int var1 = 0; var1 < this.field1828.length; var1++) {
            if (this.field1828[var1] != null) {
                this.field1828[var1].method1877();
            }
        }
        this.field1823 = new class179();
        this.field1825 = this.field1830;
    }

    @ObfuscatedName("dc.f(II)V")
    public void method2229(int arg0) {
        for (int var2 = 0; var2 < this.field1828.length; var2++) {
            class91 var3 = this.field1828[var2];
            if (var3 != null && var3.field1497 != 0 && var3.field1487) {
                var3.method1880(arg0);
                var3.field1487 = false;
            }
        }
    }
}
