package deob;

@ObfuscatedName("ez")
public class class131 extends class193 {

    @ObfuscatedName("ez.w")
    public int field1876;

    @ObfuscatedName("ez.z")
    public boolean field1877;

    @ObfuscatedName("ez.j")
    public int[] field1880;

    @ObfuscatedName("ez.i")
    public int[] field1879;

    @ObfuscatedName("ez.f")
    public int[] field1874;

    @ObfuscatedName("ez.c")
    public int[] field1881;

    @ObfuscatedName("ez.o")
    public int field1882;

    @ObfuscatedName("ez.q")
    public int field1883;

    @ObfuscatedName("ez.n")
    public int[] field1884;

    @ObfuscatedName("ez.a")
    public boolean field1885 = false;

    public class131(class174 arg0) {
        this.field1876 = arg0.method2824();
        this.field1877 = arg0.method2810() == 1;
        int var2 = arg0.method2810();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1880 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1880[var3] = arg0.method2824();
        }
        if (var2 > 1) {
            this.field1879 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1879[var4] = arg0.method2810();
            }
        }
        if (var2 > 1) {
            this.field1874 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1874[var5] = arg0.method2810();
            }
        }
        this.field1881 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1881[var6] = arg0.method2803();
        }
        this.field1882 = arg0.method2810();
        this.field1883 = arg0.method2810();
        this.field1884 = null;
    }

    @ObfuscatedName("ez.p(DILil;)Z")
    public boolean method2209(double arg0, int arg1, class236 arg2) {
        for (int var5 = 0; var5 < this.field1880.length; var5++) {
            if (arg2.method3712(this.field1880[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1884 = new int[var6];
        for (int var7 = 0; var7 < this.field1880.length; var7++) {
            class285 var8 = class287.method4410(arg2, this.field1880[var7]);
            var8.method4582();
            byte[] var9 = var8.field3772;
            int[] var10 = var8.field3773;
            int var11 = this.field1881[var7];
            if ((var11 & 0xFF000000) == 16777216) {
            }
            if ((var11 & 0xFF000000) == 33554432) {
            }
            if ((var11 & 0xFF000000) == 50331648) {
                int var12 = var11 & 0xFF00FF;
                int var13 = var11 >> 8 & 0xFF;
                for (int var14 = 0; var14 < var10.length; var14++) {
                    int var15 = var10[var14];
                    if (var15 >> 8 == (var15 & 0xFFFF)) {
                        int var16 = var15 & 0xFF;
                        var10[var14] = var12 * var16 >> 8 & 0xFF00FF | var13 * var16 & 0xFF00;
                    }
                }
            }
            for (int var17 = 0; var17 < var10.length; var17++) {
                var10[var17] = class137.method2327(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field1879[var7 - 1];
            }
            if (var18 == 0) {
                if (var8.field3774 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field1884[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field3774 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field1884[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field3774 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field1884[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
            if (var18 == 1) {
            }
            if (var18 == 2) {
            }
            if (var18 == 3) {
            }
        }
        return true;
    }

    @ObfuscatedName("ez.m()V")
    public void method2206() {
        this.field1884 = null;
    }

    @ObfuscatedName("ez.e(I)V")
    public void method2212(int arg0) {
        if (this.field1884 == null) {
            return;
        }
        if (this.field1882 == 1 || this.field1882 == 3) {
            if (Statics.field1886 == null || Statics.field1886.length < this.field1884.length) {
                Statics.field1886 = new int[this.field1884.length];
            }
            short var2;
            if (this.field1884.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1884.length;
            int var4 = arg0 * var2 * this.field1883;
            int var5 = var3 - 1;
            if (this.field1882 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1886[var6] = this.field1884[var7];
            }
            int[] var8 = this.field1884;
            this.field1884 = Statics.field1886;
            Statics.field1886 = var8;
        }
        if (this.field1882 != 2 && this.field1882 != 4) {
            return;
        }
        if (Statics.field1886 == null || Statics.field1886.length < this.field1884.length) {
            Statics.field1886 = new int[this.field1884.length];
        }
        short var9;
        if (this.field1884.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1884.length;
        int var11 = this.field1883 * arg0;
        int var12 = var9 - 1;
        if (this.field1882 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1886[var15] = this.field1884[var16];
            }
        }
        int[] var17 = this.field1884;
        this.field1884 = Statics.field1886;
        Statics.field1886 = var17;
    }
}
