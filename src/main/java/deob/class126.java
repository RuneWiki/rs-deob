package deob;

@ObfuscatedName("dj")
public class class126 implements class146 {

    @ObfuscatedName("dj.s")
    public class131[] field1768;

    @ObfuscatedName("dj.c")
    public class197 field1769 = new class197();

    @ObfuscatedName("dj.f")
    public int field1778;

    @ObfuscatedName("dj.m")
    public int field1775 = 0;

    @ObfuscatedName("dj.h")
    public double field1771 = 1.0D;

    @ObfuscatedName("dj.t")
    public int field1772 = 128;

    @ObfuscatedName("dj.p")
    public class239 field1774;

    public class126(class239 arg0, class239 arg1, int arg2, double arg3, int arg4) {
        this.field1774 = arg1;
        this.field1778 = arg2;
        this.field1775 = this.field1778;
        this.field1771 = arg3;
        this.field1772 = arg4;
        int[] var7 = arg0.method3872(0);
        int var8 = var7.length;
        this.field1768 = new class131[arg0.method3858(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class177 var10 = new class177(arg0.method3840(0, var7[var9]));
            this.field1768[var7[var9]] = new class131(var10);
        }
    }

    @ObfuscatedName("dj.s(D)V")
    public void method2215(double arg0) {
        this.field1771 = arg0;
        this.method2220();
    }

    @ObfuscatedName("dj.c(II)[I")
    public int[] method2216(int arg0) {
        class131 var2 = this.field1768[arg0];
        if (var2 != null) {
            if (var2.field1885 != null) {
                this.field1769.method3379(var2);
                var2.field1886 = true;
                return var2.field1885;
            }
            boolean var3 = var2.method2326(this.field1771, this.field1772, this.field1774);
            if (var3) {
                if (this.field1775 == 0) {
                    class131 var4 = (class131) this.field1769.method3382();
                    var4.method2327();
                } else {
                    this.field1775--;
                }
                this.field1769.method3379(var2);
                var2.field1886 = true;
                return var2.field1885;
            }
        }
        return null;
    }

    @ObfuscatedName("dj.f(IB)I")
    public int method2228(int arg0) {
        return this.field1768[arg0] == null ? 0 : this.field1768[arg0].field1877;
    }

    @ObfuscatedName("dj.m(IB)Z")
    public boolean method2231(int arg0) {
        return this.field1768[arg0].field1878;
    }

    @ObfuscatedName("dj.h(II)Z")
    public boolean method2214(int arg0) {
        return this.field1772 == 64;
    }

    @ObfuscatedName("dj.t(I)V")
    public void method2220() {
        for (int var1 = 0; var1 < this.field1768.length; var1++) {
            if (this.field1768[var1] != null) {
                this.field1768[var1].method2327();
            }
        }
        this.field1769 = new class197();
        this.field1775 = this.field1778;
    }

    @ObfuscatedName("dj.p(II)V")
    public void method2221(int arg0) {
        for (int var2 = 0; var2 < this.field1768.length; var2++) {
            class131 var3 = this.field1768[var2];
            if (var3 != null && var3.field1875 != 0 && var3.field1886) {
                var3.method2328(arg0);
                var3.field1886 = false;
            }
        }
    }
}
