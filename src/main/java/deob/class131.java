package deob;

@ObfuscatedName("ew")
public class class131 extends class196 {

    @ObfuscatedName("ew.h")
    public int field1877;

    @ObfuscatedName("ew.t")
    public boolean field1878;

    @ObfuscatedName("ew.p")
    public int[] field1879;

    @ObfuscatedName("ew.d")
    public int[] field1880;

    @ObfuscatedName("ew.n")
    public int[] field1874;

    @ObfuscatedName("ew.z")
    public int[] field1882;

    @ObfuscatedName("ew.o")
    public int field1875;

    @ObfuscatedName("ew.q")
    public int field1876;

    @ObfuscatedName("ew.u")
    public int[] field1885;

    @ObfuscatedName("ew.k")
    public boolean field1886 = false;

    public class131(class177 arg0) {
        this.field1877 = arg0.method2967();
        this.field1878 = arg0.method2965() == 1;
        int var2 = arg0.method2965();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1879 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1879[var3] = arg0.method2967();
        }
        if (var2 > 1) {
            this.field1880 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1880[var4] = arg0.method2965();
            }
        }
        if (var2 > 1) {
            this.field1874 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1874[var5] = arg0.method2965();
            }
        }
        this.field1882 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1882[var6] = arg0.method2970();
        }
        this.field1875 = arg0.method2965();
        this.field1876 = arg0.method2965();
        this.field1885 = null;
    }

    @ObfuscatedName("ew.s(DILiw;)Z")
    public boolean method2326(double arg0, int arg1, class239 arg2) {
        for (int var5 = 0; var5 < this.field1879.length; var5++) {
            if (arg2.method3905(this.field1879[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1885 = new int[var6];
        for (int var7 = 0; var7 < this.field1879.length; var7++) {
            class288 var8 = class290.method2697(arg2, this.field1879[var7]);
            var8.method4752();
            byte[] var9 = var8.field3787;
            int[] var10 = var8.field3783;
            int var11 = this.field1882[var7];
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
                var10[var17] = class137.method2440(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field1880[var7 - 1];
            }
            if (var18 == 0) {
                if (var8.field3782 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field1885[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field3782 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field1885[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field3782 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field1885[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
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

    @ObfuscatedName("ew.c()V")
    public void method2327() {
        this.field1885 = null;
    }

    @ObfuscatedName("ew.f(I)V")
    public void method2328(int arg0) {
        if (this.field1885 == null) {
            return;
        }
        if (this.field1875 == 1 || this.field1875 == 3) {
            if (Statics.field1873 == null || Statics.field1873.length < this.field1885.length) {
                Statics.field1873 = new int[this.field1885.length];
            }
            short var2;
            if (this.field1885.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1885.length;
            int var4 = arg0 * var2 * this.field1876;
            int var5 = var3 - 1;
            if (this.field1875 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1873[var6] = this.field1885[var7];
            }
            int[] var8 = this.field1885;
            this.field1885 = Statics.field1873;
            Statics.field1873 = var8;
        }
        if (this.field1875 != 2 && this.field1875 != 4) {
            return;
        }
        if (Statics.field1873 == null || Statics.field1873.length < this.field1885.length) {
            Statics.field1873 = new int[this.field1885.length];
        }
        short var9;
        if (this.field1885.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1885.length;
        int var11 = this.field1876 * arg0;
        int var12 = var9 - 1;
        if (this.field1875 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1873[var15] = this.field1885[var16];
            }
        }
        int[] var17 = this.field1885;
        this.field1885 = Statics.field1873;
        Statics.field1873 = var17;
    }
}
