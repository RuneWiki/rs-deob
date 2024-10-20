package deob;

@ObfuscatedName("eu")
public class class131 extends class193 {

    @ObfuscatedName("eu.g")
    public int field1864;

    @ObfuscatedName("eu.v")
    public boolean field1865;

    @ObfuscatedName("eu.t")
    public int[] field1860;

    @ObfuscatedName("eu.p")
    public int[] field1862;

    @ObfuscatedName("eu.l")
    public int[] field1868;

    @ObfuscatedName("eu.a")
    public int[] field1869;

    @ObfuscatedName("eu.k")
    public int field1871;

    @ObfuscatedName("eu.r")
    public int field1870;

    @ObfuscatedName("eu.b")
    public int[] field1874;

    @ObfuscatedName("eu.x")
    public boolean field1873 = false;

    public class131(class174 arg0) {
        this.field1864 = arg0.method2932();
        this.field1865 = arg0.method2930() == 1;
        int var2 = arg0.method2930();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1860 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1860[var3] = arg0.method2932();
        }
        if (var2 > 1) {
            this.field1862 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1862[var4] = arg0.method2930();
            }
        }
        if (var2 > 1) {
            this.field1868 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1868[var5] = arg0.method2930();
            }
        }
        this.field1869 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1869[var6] = arg0.method2927();
        }
        this.field1871 = arg0.method2930();
        this.field1870 = arg0.method2930();
        this.field1874 = null;
    }

    @ObfuscatedName("eu.i(DILiy;)Z")
    public boolean method2309(double arg0, int arg1, class236 arg2) {
        for (int var5 = 0; var5 < this.field1860.length; var5++) {
            if (arg2.method3843(this.field1860[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1874 = new int[var6];
        for (int var7 = 0; var7 < this.field1860.length; var7++) {
            int var8 = this.field1860[var7];
            byte[] var9 = arg2.method3842(var8);
            boolean var10;
            if (var9 == null) {
                var10 = false;
            } else {
                class287.method567(var9);
                var10 = true;
            }
            class285 var11;
            if (var10) {
                var11 = class287.method1031();
            } else {
                var11 = null;
            }
            var11.method4735();
            byte[] var13 = var11.field3767;
            int[] var14 = var11.field3769;
            int var15 = this.field1869[var7];
            if ((var15 & 0xFF000000) == 16777216) {
            }
            if ((var15 & 0xFF000000) == 33554432) {
            }
            if ((var15 & 0xFF000000) == 50331648) {
                int var16 = var15 & 0xFF00FF;
                int var17 = var15 >> 8 & 0xFF;
                for (int var18 = 0; var18 < var14.length; var18++) {
                    int var19 = var14[var18];
                    if (var19 >> 8 == (var19 & 0xFFFF)) {
                        int var20 = var19 & 0xFF;
                        var14[var18] = var16 * var20 >> 8 & 0xFF00FF | var17 * var20 & 0xFF00;
                    }
                }
            }
            for (int var21 = 0; var21 < var14.length; var21++) {
                var14[var21] = class137.method2413(var14[var21], arg0);
            }
            int var22;
            if (var7 == 0) {
                var22 = 0;
            } else {
                var22 = this.field1862[var7 - 1];
            }
            if (var22 == 0) {
                if (var11.field3766 == arg1) {
                    for (int var23 = 0; var23 < var6; var23++) {
                        this.field1874[var23] = var14[var13[var23] & 0xFF];
                    }
                } else if (var11.field3766 == 64 && arg1 == 128) {
                    int var24 = 0;
                    for (int var25 = 0; var25 < arg1; var25++) {
                        for (int var26 = 0; var26 < arg1; var26++) {
                            this.field1874[var24++] = var14[var13[(var25 >> 1 << 6) + (var26 >> 1)] & 0xFF];
                        }
                    }
                } else if (var11.field3766 == 128 && arg1 == 64) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < arg1; var28++) {
                        for (int var29 = 0; var29 < arg1; var29++) {
                            this.field1874[var27++] = var14[var13[(var28 << 1 << 7) + (var29 << 1)] & 0xFF];
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
            if (var22 == 1) {
            }
            if (var22 == 2) {
            }
            if (var22 == 3) {
            }
        }
        return true;
    }

    @ObfuscatedName("eu.h()V")
    public void method2313() {
        this.field1874 = null;
    }

    @ObfuscatedName("eu.u(I)V")
    public void method2310(int arg0) {
        if (this.field1874 == null) {
            return;
        }
        if (this.field1871 == 1 || this.field1871 == 3) {
            if (Statics.field1866 == null || Statics.field1866.length < this.field1874.length) {
                Statics.field1866 = new int[this.field1874.length];
            }
            short var2;
            if (this.field1874.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1874.length;
            int var4 = arg0 * var2 * this.field1870;
            int var5 = var3 - 1;
            if (this.field1871 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1866[var6] = this.field1874[var7];
            }
            int[] var8 = this.field1874;
            this.field1874 = Statics.field1866;
            Statics.field1866 = var8;
        }
        if (this.field1871 != 2 && this.field1871 != 4) {
            return;
        }
        if (Statics.field1866 == null || Statics.field1866.length < this.field1874.length) {
            Statics.field1866 = new int[this.field1874.length];
        }
        short var9;
        if (this.field1874.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1874.length;
        int var11 = this.field1870 * arg0;
        int var12 = var9 - 1;
        if (this.field1871 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1866[var15] = this.field1874[var16];
            }
        }
        int[] var17 = this.field1874;
        this.field1874 = Statics.field1866;
        Statics.field1866 = var17;
    }
}
