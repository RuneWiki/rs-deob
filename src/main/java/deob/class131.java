package deob;

@ObfuscatedName("eg")
public class class131 extends class193 {

    @ObfuscatedName("eg.g")
    public int field1832;

    @ObfuscatedName("eg.m")
    public boolean field1841;

    @ObfuscatedName("eg.s")
    public int[] field1834;

    @ObfuscatedName("eg.x")
    public int[] field1830;

    @ObfuscatedName("eg.p")
    public int[] field1836;

    @ObfuscatedName("eg.k")
    public int[] field1837;

    @ObfuscatedName("eg.r")
    public int field1835;

    @ObfuscatedName("eg.w")
    public int field1839;

    @ObfuscatedName("eg.v")
    public int[] field1838;

    @ObfuscatedName("eg.h")
    public boolean field1828 = false;

    public class131(class174 arg0) {
        this.field1832 = arg0.method2861();
        this.field1841 = arg0.method2843() == 1;
        int var2 = arg0.method2843();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1834 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1834[var3] = arg0.method2861();
        }
        if (var2 > 1) {
            this.field1830 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1830[var4] = arg0.method2843();
            }
        }
        if (var2 > 1) {
            this.field1836 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1836[var5] = arg0.method2843();
            }
        }
        this.field1837 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1837[var6] = arg0.method2987();
        }
        this.field1835 = arg0.method2843();
        this.field1839 = arg0.method2843();
        this.field1838 = null;
    }

    @ObfuscatedName("eg.c(DILip;)Z")
    public boolean method2222(double arg0, int arg1, class236 arg2) {
        for (int var5 = 0; var5 < this.field1834.length; var5++) {
            if (arg2.method3722(this.field1834[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1838 = new int[var6];
        for (int var7 = 0; var7 < this.field1834.length; var7++) {
            int var8 = this.field1834[var7];
            byte[] var9 = arg2.method3720(var8);
            boolean var10;
            if (var9 == null) {
                var10 = false;
            } else {
                class287.method19(var9);
                var10 = true;
            }
            class285 var11;
            if (var10) {
                class285 var12 = new class285();
                var12.field3766 = Statics.field3781;
                var12.field3760 = Statics.field3782;
                var12.field3763 = Statics.field3783[0];
                var12.field3765 = Statics.field3784[0];
                var12.field3762 = Statics.field3780[0];
                var12.field3761 = Statics.field3788[0];
                var12.field3764 = Statics.field3787;
                var12.field3767 = Statics.field3785[0];
                Statics.field3783 = null;
                Statics.field3784 = null;
                Statics.field3780 = null;
                Statics.field3788 = null;
                Statics.field3787 = null;
                Statics.field3785 = (byte[][]) null;
                var11 = var12;
            } else {
                var11 = null;
            }
            var11.method4596();
            byte[] var15 = var11.field3767;
            int[] var16 = var11.field3764;
            int var17 = this.field1837[var7];
            if ((var17 & 0xFF000000) == 16777216) {
            }
            if ((var17 & 0xFF000000) == 33554432) {
            }
            if ((var17 & 0xFF000000) == 50331648) {
                int var18 = var17 & 0xFF00FF;
                int var19 = var17 >> 8 & 0xFF;
                for (int var20 = 0; var20 < var16.length; var20++) {
                    int var21 = var16[var20];
                    if (var21 >> 8 == (var21 & 0xFFFF)) {
                        int var22 = var21 & 0xFF;
                        var16[var20] = var18 * var22 >> 8 & 0xFF00FF | var19 * var22 & 0xFF00;
                    }
                }
            }
            for (int var23 = 0; var23 < var16.length; var23++) {
                var16[var23] = class137.method2338(var16[var23], arg0);
            }
            int var24;
            if (var7 == 0) {
                var24 = 0;
            } else {
                var24 = this.field1830[var7 - 1];
            }
            if (var24 == 0) {
                if (var11.field3762 == arg1) {
                    for (int var25 = 0; var25 < var6; var25++) {
                        this.field1838[var25] = var16[var15[var25] & 0xFF];
                    }
                } else if (var11.field3762 == 64 && arg1 == 128) {
                    int var26 = 0;
                    for (int var27 = 0; var27 < arg1; var27++) {
                        for (int var28 = 0; var28 < arg1; var28++) {
                            this.field1838[var26++] = var16[var15[(var27 >> 1 << 6) + (var28 >> 1)] & 0xFF];
                        }
                    }
                } else if (var11.field3762 == 128 && arg1 == 64) {
                    int var29 = 0;
                    for (int var30 = 0; var30 < arg1; var30++) {
                        for (int var31 = 0; var31 < arg1; var31++) {
                            this.field1838[var29++] = var16[var15[(var30 << 1 << 7) + (var31 << 1)] & 0xFF];
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
            if (var24 == 1) {
            }
            if (var24 == 2) {
            }
            if (var24 == 3) {
            }
        }
        return true;
    }

    @ObfuscatedName("eg.o()V")
    public void method2223() {
        this.field1838 = null;
    }

    @ObfuscatedName("eg.i(I)V")
    public void method2229(int arg0) {
        if (this.field1838 == null) {
            return;
        }
        if (this.field1835 == 1 || this.field1835 == 3) {
            if (Statics.field1842 == null || Statics.field1842.length < this.field1838.length) {
                Statics.field1842 = new int[this.field1838.length];
            }
            short var2;
            if (this.field1838.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1838.length;
            int var4 = arg0 * var2 * this.field1839;
            int var5 = var3 - 1;
            if (this.field1835 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1842[var6] = this.field1838[var7];
            }
            int[] var8 = this.field1838;
            this.field1838 = Statics.field1842;
            Statics.field1842 = var8;
        }
        if (this.field1835 != 2 && this.field1835 != 4) {
            return;
        }
        if (Statics.field1842 == null || Statics.field1842.length < this.field1838.length) {
            Statics.field1842 = new int[this.field1838.length];
        }
        short var9;
        if (this.field1838.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1838.length;
        int var11 = this.field1839 * arg0;
        int var12 = var9 - 1;
        if (this.field1835 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1842[var15] = this.field1838[var16];
            }
        }
        int[] var17 = this.field1838;
        this.field1838 = Statics.field1842;
        Statics.field1842 = var17;
    }
}
