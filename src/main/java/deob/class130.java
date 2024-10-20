package deob;

@ObfuscatedName("dk")
public class class130 extends class194 {

    @ObfuscatedName("dk.o")
    public int field1894;

    @ObfuscatedName("dk.n")
    public boolean field1888;

    @ObfuscatedName("dk.q")
    public int[] field1895;

    @ObfuscatedName("dk.b")
    public int[] field1890;

    @ObfuscatedName("dk.k")
    public int[] field1891;

    @ObfuscatedName("dk.s")
    public int[] field1892;

    @ObfuscatedName("dk.d")
    public int field1893;

    @ObfuscatedName("dk.l")
    public int field1885;

    @ObfuscatedName("dk.t")
    public int[] field1889;

    @ObfuscatedName("dk.y")
    public boolean field1896 = false;

    public class130(class175 arg0) {
        this.field1894 = arg0.method2995();
        this.field1888 = arg0.method2999() == 1;
        int var2 = arg0.method2999();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1895 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1895[var3] = arg0.method2995();
        }
        if (var2 > 1) {
            this.field1890 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1890[var4] = arg0.method2999();
            }
        }
        if (var2 > 1) {
            this.field1891 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1891[var5] = arg0.method2999();
            }
        }
        this.field1892 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1892[var6] = arg0.method2998();
        }
        this.field1893 = arg0.method2999();
        this.field1885 = arg0.method2999();
        this.field1889 = null;
    }

    @ObfuscatedName("dk.i(DILii;)Z")
    public boolean method2296(double arg0, int arg1, class237 arg2) {
        for (int var5 = 0; var5 < this.field1895.length; var5++) {
            if (arg2.method3832(this.field1895[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1889 = new int[var6];
        for (int var7 = 0; var7 < this.field1895.length; var7++) {
            class286 var8 = class288.method4627(arg2, this.field1895[var7]);
            var8.method4636();
            byte[] var9 = var8.field3778;
            int[] var10 = var8.field3784;
            int var11 = this.field1892[var7];
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
                var10[var17] = class136.method2431(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field1890[var7 - 1];
            }
            if (var18 == 0) {
                if (var8.field3777 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field1889[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field3777 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field1889[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field3777 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field1889[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
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

    @ObfuscatedName("dk.j()V")
    public void method2297() {
        this.field1889 = null;
    }

    @ObfuscatedName("dk.a(I)V")
    public void method2298(int arg0) {
        if (this.field1889 == null) {
            return;
        }
        if (this.field1893 == 1 || this.field1893 == 3) {
            if (Statics.field1897 == null || Statics.field1897.length < this.field1889.length) {
                Statics.field1897 = new int[this.field1889.length];
            }
            short var2;
            if (this.field1889.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1889.length;
            int var4 = arg0 * var2 * this.field1885;
            int var5 = var3 - 1;
            if (this.field1893 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1897[var6] = this.field1889[var7];
            }
            int[] var8 = this.field1889;
            this.field1889 = Statics.field1897;
            Statics.field1897 = var8;
        }
        if (this.field1893 != 2 && this.field1893 != 4) {
            return;
        }
        if (Statics.field1897 == null || Statics.field1897.length < this.field1889.length) {
            Statics.field1897 = new int[this.field1889.length];
        }
        short var9;
        if (this.field1889.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1889.length;
        int var11 = this.field1885 * arg0;
        int var12 = var9 - 1;
        if (this.field1893 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1897[var15] = this.field1889[var16];
            }
        }
        int[] var17 = this.field1889;
        this.field1889 = Statics.field1897;
        Statics.field1897 = var17;
    }
}
