package deob;

@ObfuscatedName("du")
public class class129 extends class193 {

    @ObfuscatedName("du.g")
    public int field1865;

    @ObfuscatedName("du.v")
    public boolean field1866;

    @ObfuscatedName("du.p")
    public int[] field1862;

    @ObfuscatedName("du.e")
    public int[] field1868;

    @ObfuscatedName("du.d")
    public int[] field1869;

    @ObfuscatedName("du.x")
    public int[] field1870;

    @ObfuscatedName("du.z")
    public int field1867;

    @ObfuscatedName("du.n")
    public int field1872;

    @ObfuscatedName("du.u")
    public int[] field1874;

    @ObfuscatedName("du.t")
    public boolean field1873 = false;

    public class129(class174 arg0) {
        this.field1865 = arg0.method3178();
        this.field1866 = arg0.method2971() == 1;
        int var2 = arg0.method2971();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1862 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1862[var3] = arg0.method3178();
        }
        if (var2 > 1) {
            this.field1868 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1868[var4] = arg0.method2971();
            }
        }
        if (var2 > 1) {
            this.field1869 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1869[var5] = arg0.method2971();
            }
        }
        this.field1870 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1870[var6] = arg0.method3131();
        }
        this.field1867 = arg0.method2971();
        this.field1872 = arg0.method2971();
        this.field1874 = null;
    }

    @ObfuscatedName("du.w(DILip;)Z")
    public boolean method2344(double arg0, int arg1, class236 arg2) {
        for (int var5 = 0; var5 < this.field1862.length; var5++) {
            if (arg2.method3928(this.field1862[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1874 = new int[var6];
        for (int var7 = 0; var7 < this.field1862.length; var7++) {
            class286 var8 = class288.method479(arg2, this.field1862[var7]);
            var8.method4805();
            byte[] var9 = var8.field3791;
            int[] var10 = var8.field3787;
            int var11 = this.field1870[var7];
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
                var10[var17] = class135.method2447(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field1868[var7 - 1];
            }
            if (var18 == 0) {
                if (var8.field3788 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field1874[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field3788 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field1874[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field3788 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field1874[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
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

    @ObfuscatedName("du.s()V")
    public void method2346() {
        this.field1874 = null;
    }

    @ObfuscatedName("du.q(I)V")
    public void method2347(int arg0) {
        if (this.field1874 == null) {
            return;
        }
        if (this.field1867 == 1 || this.field1867 == 3) {
            if (Statics.field1875 == null || Statics.field1875.length < this.field1874.length) {
                Statics.field1875 = new int[this.field1874.length];
            }
            short var2;
            if (this.field1874.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1874.length;
            int var4 = arg0 * var2 * this.field1872;
            int var5 = var3 - 1;
            if (this.field1867 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1875[var6] = this.field1874[var7];
            }
            int[] var8 = this.field1874;
            this.field1874 = Statics.field1875;
            Statics.field1875 = var8;
        }
        if (this.field1867 != 2 && this.field1867 != 4) {
            return;
        }
        if (Statics.field1875 == null || Statics.field1875.length < this.field1874.length) {
            Statics.field1875 = new int[this.field1874.length];
        }
        short var9;
        if (this.field1874.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1874.length;
        int var11 = this.field1872 * arg0;
        int var12 = var9 - 1;
        if (this.field1867 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1875[var15] = this.field1874[var16];
            }
        }
        int[] var17 = this.field1874;
        this.field1874 = Statics.field1875;
        Statics.field1875 = var17;
    }
}
