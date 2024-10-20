package deob;

@ObfuscatedName("dh")
public class class126 implements class146 {

    @ObfuscatedName("dh.p")
    public class131[] field1780;

    @ObfuscatedName("dh.m")
    public class194 field1774 = new class194();

    @ObfuscatedName("dh.e")
    public int field1775;

    @ObfuscatedName("dh.t")
    public int field1784 = 0;

    @ObfuscatedName("dh.w")
    public double field1782 = 1.0D;

    @ObfuscatedName("dh.z")
    public int field1778 = 128;

    @ObfuscatedName("dh.j")
    public class236 field1779;

    public class126(class236 arg0, class236 arg1, int arg2, double arg3, int arg4) {
        this.field1779 = arg1;
        this.field1775 = arg2;
        this.field1784 = this.field1775;
        this.field1782 = arg3;
        this.field1778 = arg4;
        int[] var7 = arg0.method3714(0);
        int var8 = var7.length;
        this.field1780 = new class131[arg0.method3784(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class174 var10 = new class174(arg0.method3720(0, var7[var9]));
            this.field1780[var7[var9]] = new class131(var10);
        }
    }

    @ObfuscatedName("dh.p(D)V")
    public void method2107(double arg0) {
        this.field1782 = arg0;
        this.method2112();
    }

    @ObfuscatedName("dh.m(II)[I")
    public int[] method2118(int arg0) {
        class131 var2 = this.field1780[arg0];
        if (var2 != null) {
            if (var2.field1884 != null) {
                this.field1774.method3266(var2);
                var2.field1885 = true;
                return var2.field1884;
            }
            boolean var3 = var2.method2209(this.field1782, this.field1778, this.field1779);
            if (var3) {
                if (this.field1784 == 0) {
                    class131 var4 = (class131) this.field1774.method3278();
                    var4.method2206();
                } else {
                    this.field1784--;
                }
                this.field1774.method3266(var2);
                var2.field1885 = true;
                return var2.field1884;
            }
        }
        return null;
    }

    @ObfuscatedName("dh.e(IB)I")
    public int method2109(int arg0) {
        return this.field1780[arg0] == null ? 0 : this.field1780[arg0].field1876;
    }

    @ObfuscatedName("dh.t(II)Z")
    public boolean method2110(int arg0) {
        return this.field1780[arg0].field1877;
    }

    @ObfuscatedName("dh.w(II)Z")
    public boolean method2106(int arg0) {
        return this.field1778 == 64;
    }

    @ObfuscatedName("dh.z(I)V")
    public void method2112() {
        for (int var1 = 0; var1 < this.field1780.length; var1++) {
            if (this.field1780[var1] != null) {
                this.field1780[var1].method2206();
            }
        }
        this.field1774 = new class194();
        this.field1784 = this.field1775;
    }

    @ObfuscatedName("dh.j(IB)V")
    public void method2113(int arg0) {
        for (int var2 = 0; var2 < this.field1780.length; var2++) {
            class131 var3 = this.field1780[var2];
            if (var3 != null && var3.field1882 != 0 && var3.field1885) {
                var3.method2212(arg0);
                var3.field1885 = false;
            }
        }
    }
}
