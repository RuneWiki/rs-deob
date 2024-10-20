package deob;

@ObfuscatedName("ed")
public class class131 extends class193 {

    @ObfuscatedName("ed.e")
    public int field1848;

    @ObfuscatedName("ed.f")
    public boolean field1847;

    @ObfuscatedName("ed.v")
    public int[] field1849;

    @ObfuscatedName("ed.t")
    public int[] field1842;

    @ObfuscatedName("ed.i")
    public int[] field1850;

    @ObfuscatedName("ed.r")
    public int[] field1853;

    @ObfuscatedName("ed.g")
    public int field1852;

    @ObfuscatedName("ed.s")
    public int field1846;

    @ObfuscatedName("ed.o")
    public int[] field1854;

    @ObfuscatedName("ed.p")
    public boolean field1851 = false;

    public class131(class174 arg0) {
        this.field1848 = arg0.method2916();
        this.field1847 = arg0.method2921() == 1;
        int var2 = arg0.method2921();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1849 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1849[var3] = arg0.method2916();
        }
        if (var2 > 1) {
            this.field1842 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1842[var4] = arg0.method2921();
            }
        }
        if (var2 > 1) {
            this.field1850 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1850[var5] = arg0.method2921();
            }
        }
        this.field1853 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1853[var6] = arg0.method2935();
        }
        this.field1852 = arg0.method2921();
        this.field1846 = arg0.method2921();
        this.field1854 = null;
    }

    @ObfuscatedName("ed.d(DILim;)Z")
    public boolean method2256(double arg0, int arg1, class236 arg2) {
        for (int var5 = 0; var5 < this.field1849.length; var5++) {
            if (arg2.method3754(this.field1849[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1854 = new int[var6];
        for (int var7 = 0; var7 < this.field1849.length; var7++) {
            int var8 = this.field1849[var7];
            class285 var9;
            if (class287.method4525(arg2, var8)) {
                class285 var10 = new class285();
                var10.field3765 = Statics.field3780;
                var10.field3759 = Statics.field3781;
                var10.field3762 = Statics.field3667[0];
                var10.field3763 = Statics.field3778[0];
                var10.field3760 = Statics.field3779[0];
                var10.field3758 = Statics.field3783[0];
                var10.field3764 = Statics.field3784;
                var10.field3761 = Statics.field2391[0];
                class287.method3738();
                var9 = var10;
            } else {
                var9 = null;
            }
            var9.method4634();
            byte[] var13 = var9.field3761;
            int[] var14 = var9.field3764;
            int var15 = this.field1853[var7];
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
                var14[var21] = class137.method2373(var14[var21], arg0);
            }
            int var22;
            if (var7 == 0) {
                var22 = 0;
            } else {
                var22 = this.field1842[var7 - 1];
            }
            if (var22 == 0) {
                if (var9.field3760 == arg1) {
                    for (int var23 = 0; var23 < var6; var23++) {
                        this.field1854[var23] = var14[var13[var23] & 0xFF];
                    }
                } else if (var9.field3760 == 64 && arg1 == 128) {
                    int var24 = 0;
                    for (int var25 = 0; var25 < arg1; var25++) {
                        for (int var26 = 0; var26 < arg1; var26++) {
                            this.field1854[var24++] = var14[var13[(var25 >> 1 << 6) + (var26 >> 1)] & 0xFF];
                        }
                    }
                } else if (var9.field3760 == 128 && arg1 == 64) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < arg1; var28++) {
                        for (int var29 = 0; var29 < arg1; var29++) {
                            this.field1854[var27++] = var14[var13[(var28 << 1 << 7) + (var29 << 1)] & 0xFF];
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

    @ObfuscatedName("ed.q()V")
    public void method2259() {
        this.field1854 = null;
    }

    @ObfuscatedName("ed.x(I)V")
    public void method2258(int arg0) {
        if (this.field1854 == null) {
            return;
        }
        if (this.field1852 == 1 || this.field1852 == 3) {
            if (Statics.field1856 == null || Statics.field1856.length < this.field1854.length) {
                Statics.field1856 = new int[this.field1854.length];
            }
            short var2;
            if (this.field1854.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1854.length;
            int var4 = arg0 * var2 * this.field1846;
            int var5 = var3 - 1;
            if (this.field1852 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1856[var6] = this.field1854[var7];
            }
            int[] var8 = this.field1854;
            this.field1854 = Statics.field1856;
            Statics.field1856 = var8;
        }
        if (this.field1852 != 2 && this.field1852 != 4) {
            return;
        }
        if (Statics.field1856 == null || Statics.field1856.length < this.field1854.length) {
            Statics.field1856 = new int[this.field1854.length];
        }
        short var9;
        if (this.field1854.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1854.length;
        int var11 = this.field1846 * arg0;
        int var12 = var9 - 1;
        if (this.field1852 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1856[var15] = this.field1854[var16];
            }
        }
        int[] var17 = this.field1854;
        this.field1854 = Statics.field1856;
        Statics.field1856 = var17;
    }
}
