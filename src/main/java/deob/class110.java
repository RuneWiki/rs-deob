package deob;

@ObfuscatedName("dr")
public class class110 implements class106 {

    @ObfuscatedName("dr.j")
    public class90[] field1830;

    @ObfuscatedName("dr.f")
    public class177 field1824 = new class177();

    @ObfuscatedName("dr.o")
    public int field1825;

    @ObfuscatedName("dr.h")
    public int field1826 = 0;

    @ObfuscatedName("dr.u")
    public double field1823 = 1.0D;

    @ObfuscatedName("dr.a")
    public int field1828 = 128;

    @ObfuscatedName("dr.q")
    public class153 field1829;

    public class110(class153 arg0, class153 arg1, int arg2, double arg3, int arg4) {
        this.field1829 = arg1;
        this.field1825 = arg2;
        this.field1826 = this.field1825;
        this.field1823 = arg3;
        this.field1828 = arg4;
        int[] var7 = arg0.method3036(0);
        int var8 = var7.length;
        this.field1830 = new class90[arg0.method3037(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class127 var10 = new class127(arg0.method3027(0, var7[var9]));
            this.field1830[var7[var9]] = new class90(var10);
        }
    }

    @ObfuscatedName("dr.g(D)V")
    public void method2220(double arg0) {
        this.field1823 = arg0;
        this.method2222();
    }

    @ObfuscatedName("dr.j(IB)[I")
    public int[] method2205(int arg0) {
        class90 var2 = this.field1830[arg0];
        if (var2 != null) {
            if (var2.field1515 != null) {
                this.field1824.method3313(var2);
                var2.field1503 = true;
                return var2.field1515;
            }
            boolean var3 = var2.method1862(this.field1823, this.field1828, this.field1829);
            if (var3) {
                if (this.field1826 == 0) {
                    class90 var4 = (class90) this.field1824.method3316();
                    var4.method1863();
                } else {
                    this.field1826--;
                }
                this.field1824.method3313(var2);
                var2.field1503 = true;
                return var2.field1515;
            }
        }
        return null;
    }

    @ObfuscatedName("dr.f(II)I")
    public int method2212(int arg0) {
        return this.field1830[arg0] == null ? 0 : this.field1830[arg0].field1516;
    }

    @ObfuscatedName("dr.o(IB)Z")
    public boolean method2202(int arg0) {
        return this.field1830[arg0].field1508;
    }

    @ObfuscatedName("dr.h(II)Z")
    public boolean method2203(int arg0) {
        return this.field1828 == 64;
    }

    @ObfuscatedName("dr.x(I)V")
    public void method2222() {
        for (int var1 = 0; var1 < this.field1830.length; var1++) {
            if (this.field1830[var1] != null) {
                this.field1830[var1].method1863();
            }
        }
        this.field1824 = new class177();
        this.field1826 = this.field1825;
    }

    @ObfuscatedName("dr.r(II)V")
    public void method2221(int arg0) {
        for (int var2 = 0; var2 < this.field1830.length; var2++) {
            class90 var3 = this.field1830[var2];
            if (var3 != null && var3.field1513 != 0 && var3.field1503) {
                var3.method1871(arg0);
                var3.field1503 = false;
            }
        }
    }
}
