package deob;

@ObfuscatedName("eo")
public class class131 extends class193 {

    @ObfuscatedName("eo.v")
    public int field1869;

    @ObfuscatedName("eo.e")
    public boolean field1870;

    @ObfuscatedName("eo.l")
    public int[] field1871;

    @ObfuscatedName("eo.s")
    public int[] field1868;

    @ObfuscatedName("eo.w")
    public int[] field1873;

    @ObfuscatedName("eo.p")
    public int[] field1865;

    @ObfuscatedName("eo.m")
    public int field1875;

    @ObfuscatedName("eo.u")
    public int field1872;

    @ObfuscatedName("eo.g")
    public int[] field1877;

    @ObfuscatedName("eo.k")
    public boolean field1878 = false;

    public class131(class174 arg0) {
        this.field1869 = arg0.method2873();
        this.field1870 = arg0.method2871() == 1;
        int var2 = arg0.method2871();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1871 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1871[var3] = arg0.method2873();
        }
        if (var2 > 1) {
            this.field1868 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1868[var4] = arg0.method2871();
            }
        }
        if (var2 > 1) {
            this.field1873 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1873[var5] = arg0.method2871();
            }
        }
        this.field1865 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1865[var6] = arg0.method2876();
        }
        this.field1875 = arg0.method2871();
        this.field1872 = arg0.method2871();
        this.field1877 = null;
    }

    @ObfuscatedName("eo.a(DILif;)Z")
    public boolean method2264(double arg0, int arg1, class236 arg2) {
        for (int var5 = 0; var5 < this.field1871.length; var5++) {
            if (arg2.method3770(this.field1871[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1877 = new int[var6];
        for (int var7 = 0; var7 < this.field1871.length; var7++) {
            int var8 = this.field1871[var7];
            byte[] var9 = arg2.method3768(var8);
            boolean var10;
            if (var9 == null) {
                var10 = false;
            } else {
                class287.method453(var9);
                var10 = true;
            }
            class285 var11;
            if (var10) {
                class285 var12 = new class285();
                var12.field3773 = Statics.field3794;
                var12.field3777 = Statics.field3793;
                var12.field3779 = Statics.field3796[0];
                var12.field3778 = Statics.field440[0];
                var12.field3775 = Statics.field3798[0];
                var12.field3776 = Statics.field1406[0];
                var12.field3774 = Statics.field3797;
                var12.field3780 = Statics.field2415[0];
                class287.method131();
                var11 = var12;
            } else {
                var11 = null;
            }
            var11.method4618();
            byte[] var15 = var11.field3780;
            int[] var16 = var11.field3774;
            int var17 = this.field1865[var7];
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
                var16[var23] = class137.method2379(var16[var23], arg0);
            }
            int var24;
            if (var7 == 0) {
                var24 = 0;
            } else {
                var24 = this.field1868[var7 - 1];
            }
            if (var24 == 0) {
                if (var11.field3775 == arg1) {
                    for (int var25 = 0; var25 < var6; var25++) {
                        this.field1877[var25] = var16[var15[var25] & 0xFF];
                    }
                } else if (var11.field3775 == 64 && arg1 == 128) {
                    int var26 = 0;
                    for (int var27 = 0; var27 < arg1; var27++) {
                        for (int var28 = 0; var28 < arg1; var28++) {
                            this.field1877[var26++] = var16[var15[(var27 >> 1 << 6) + (var28 >> 1)] & 0xFF];
                        }
                    }
                } else if (var11.field3775 == 128 && arg1 == 64) {
                    int var29 = 0;
                    for (int var30 = 0; var30 < arg1; var30++) {
                        for (int var31 = 0; var31 < arg1; var31++) {
                            this.field1877[var29++] = var16[var15[(var30 << 1 << 7) + (var31 << 1)] & 0xFF];
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

    @ObfuscatedName("eo.j()V")
    public void method2260() {
        this.field1877 = null;
    }

    @ObfuscatedName("eo.n(I)V")
    public void method2265(int arg0) {
        if (this.field1877 == null) {
            return;
        }
        if (this.field1875 == 1 || this.field1875 == 3) {
            if (Statics.field1866 == null || Statics.field1866.length < this.field1877.length) {
                Statics.field1866 = new int[this.field1877.length];
            }
            short var2;
            if (this.field1877.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1877.length;
            int var4 = arg0 * var2 * this.field1872;
            int var5 = var3 - 1;
            if (this.field1875 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1866[var6] = this.field1877[var7];
            }
            int[] var8 = this.field1877;
            this.field1877 = Statics.field1866;
            Statics.field1866 = var8;
        }
        if (this.field1875 != 2 && this.field1875 != 4) {
            return;
        }
        if (Statics.field1866 == null || Statics.field1866.length < this.field1877.length) {
            Statics.field1866 = new int[this.field1877.length];
        }
        short var9;
        if (this.field1877.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1877.length;
        int var11 = this.field1872 * arg0;
        int var12 = var9 - 1;
        if (this.field1875 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1866[var15] = this.field1877[var16];
            }
        }
        int[] var17 = this.field1877;
        this.field1877 = Statics.field1866;
        Statics.field1866 = var17;
    }
}
