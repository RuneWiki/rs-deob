package deob;

@ObfuscatedName("ej")
public class class131 extends class193 {

    @ObfuscatedName("ej.b")
    public int field1889;

    @ObfuscatedName("ej.y")
    public boolean field1894;

    @ObfuscatedName("ej.h")
    public int[] field1895;

    @ObfuscatedName("ej.x")
    public int[] field1903;

    @ObfuscatedName("ej.f")
    public int[] field1897;

    @ObfuscatedName("ej.n")
    public int[] field1898;

    @ObfuscatedName("ej.a")
    public int field1899;

    @ObfuscatedName("ej.o")
    public int field1900;

    @ObfuscatedName("ej.z")
    public int[] field1902;

    @ObfuscatedName("ej.q")
    public boolean field1891 = false;

    public class131(class174 arg0) {
        this.field1889 = arg0.method2872();
        this.field1894 = arg0.method2870() == 1;
        int var2 = arg0.method2870();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1895 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1895[var3] = arg0.method2872();
        }
        if (var2 > 1) {
            this.field1903 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1903[var4] = arg0.method2870();
            }
        }
        if (var2 > 1) {
            this.field1897 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1897[var5] = arg0.method2870();
            }
        }
        this.field1898 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1898[var6] = arg0.method2875();
        }
        this.field1899 = arg0.method2870();
        this.field1900 = arg0.method2870();
        this.field1902 = null;
    }

    @ObfuscatedName("ej.i(DILiw;)Z")
    public boolean method2261(double arg0, int arg1, class236 arg2) {
        for (int var5 = 0; var5 < this.field1895.length; var5++) {
            if (arg2.method3777(this.field1895[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1902 = new int[var6];
        for (int var7 = 0; var7 < this.field1895.length; var7++) {
            int var8 = this.field1895[var7];
            class285 var9;
            if (class287.method1558(arg2, var8)) {
                class285 var10 = new class285();
                var10.field3777 = Statics.field3791;
                var10.field3773 = Statics.field3793;
                var10.field3771 = Statics.field3794[0];
                var10.field3776 = Statics.field3658[0];
                var10.field3772 = Statics.field3206[0];
                var10.field3774 = Statics.field780[0];
                var10.field3778 = Statics.field34;
                var10.field3775 = Statics.field2308[0];
                class287.method4100();
                var9 = var10;
            } else {
                var9 = null;
            }
            var9.method4662();
            byte[] var13 = var9.field3775;
            int[] var14 = var9.field3778;
            int var15 = this.field1898[var7];
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
                var14[var21] = class137.method2378(var14[var21], arg0);
            }
            int var22;
            if (var7 == 0) {
                var22 = 0;
            } else {
                var22 = this.field1903[var7 - 1];
            }
            if (var22 == 0) {
                if (var9.field3772 == arg1) {
                    for (int var23 = 0; var23 < var6; var23++) {
                        this.field1902[var23] = var14[var13[var23] & 0xFF];
                    }
                } else if (var9.field3772 == 64 && arg1 == 128) {
                    int var24 = 0;
                    for (int var25 = 0; var25 < arg1; var25++) {
                        for (int var26 = 0; var26 < arg1; var26++) {
                            this.field1902[var24++] = var14[var13[(var25 >> 1 << 6) + (var26 >> 1)] & 0xFF];
                        }
                    }
                } else if (var9.field3772 == 128 && arg1 == 64) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < arg1; var28++) {
                        for (int var29 = 0; var29 < arg1; var29++) {
                            this.field1902[var27++] = var14[var13[(var28 << 1 << 7) + (var29 << 1)] & 0xFF];
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

    @ObfuscatedName("ej.c()V")
    public void method2262() {
        this.field1902 = null;
    }

    @ObfuscatedName("ej.e(I)V")
    public void method2268(int arg0) {
        if (this.field1902 == null) {
            return;
        }
        if (this.field1899 == 1 || this.field1899 == 3) {
            if (Statics.field1901 == null || Statics.field1901.length < this.field1902.length) {
                Statics.field1901 = new int[this.field1902.length];
            }
            short var2;
            if (this.field1902.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1902.length;
            int var4 = arg0 * var2 * this.field1900;
            int var5 = var3 - 1;
            if (this.field1899 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1901[var6] = this.field1902[var7];
            }
            int[] var8 = this.field1902;
            this.field1902 = Statics.field1901;
            Statics.field1901 = var8;
        }
        if (this.field1899 != 2 && this.field1899 != 4) {
            return;
        }
        if (Statics.field1901 == null || Statics.field1901.length < this.field1902.length) {
            Statics.field1901 = new int[this.field1902.length];
        }
        short var9;
        if (this.field1902.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1902.length;
        int var11 = this.field1900 * arg0;
        int var12 = var9 - 1;
        if (this.field1899 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1901[var15] = this.field1902[var16];
            }
        }
        int[] var17 = this.field1902;
        this.field1902 = Statics.field1901;
        Statics.field1901 = var17;
    }
}
