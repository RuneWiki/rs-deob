package deob;

@ObfuscatedName("ep")
public class class131 extends class196 {

    @ObfuscatedName("ep.f")
    public int field1891;

    @ObfuscatedName("ep.i")
    public boolean field1887;

    @ObfuscatedName("ep.j")
    public int[] field1888;

    @ObfuscatedName("ep.m")
    public int[] field1889;

    @ObfuscatedName("ep.u")
    public int[] field1896;

    @ObfuscatedName("ep.r")
    public int[] field1895;

    @ObfuscatedName("ep.v")
    public int field1892;

    @ObfuscatedName("ep.h")
    public int field1886;

    @ObfuscatedName("ep.a")
    public int[] field1894;

    @ObfuscatedName("ep.p")
    public boolean field1882 = false;

    public class131(class177 arg0) {
        this.field1891 = arg0.method2886();
        this.field1887 = arg0.method2931() == 1;
        int var2 = arg0.method2931();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1888 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1888[var3] = arg0.method2886();
        }
        if (var2 > 1) {
            this.field1889 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1889[var4] = arg0.method2931();
            }
        }
        if (var2 > 1) {
            this.field1896 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1896[var5] = arg0.method2931();
            }
        }
        this.field1895 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1895[var6] = arg0.method2904();
        }
        this.field1892 = arg0.method2931();
        this.field1886 = arg0.method2931();
        this.field1894 = null;
    }

    @ObfuscatedName("ep.w(DILiq;)Z")
    public boolean method2241(double arg0, int arg1, class239 arg2) {
        for (int var5 = 0; var5 < this.field1888.length; var5++) {
            if (arg2.method3752(this.field1888[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1894 = new int[var6];
        for (int var7 = 0; var7 < this.field1888.length; var7++) {
            class288 var8 = class290.method2764(arg2, this.field1888[var7]);
            var8.method4683();
            byte[] var9 = var8.field3783;
            int[] var10 = var8.field3787;
            int var11 = this.field1895[var7];
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
                var10[var17] = class137.method2355(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field1889[var7 - 1];
            }
            if (var18 == 0) {
                if (var8.field3782 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field1894[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field3782 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field1894[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field3782 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field1894[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
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

    @ObfuscatedName("ep.o()V")
    public void method2242() {
        this.field1894 = null;
    }

    @ObfuscatedName("ep.x(I)V")
    public void method2243(int arg0) {
        if (this.field1894 == null) {
            return;
        }
        if (this.field1892 == 1 || this.field1892 == 3) {
            if (Statics.field1893 == null || Statics.field1893.length < this.field1894.length) {
                Statics.field1893 = new int[this.field1894.length];
            }
            short var2;
            if (this.field1894.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1894.length;
            int var4 = arg0 * var2 * this.field1886;
            int var5 = var3 - 1;
            if (this.field1892 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1893[var6] = this.field1894[var7];
            }
            int[] var8 = this.field1894;
            this.field1894 = Statics.field1893;
            Statics.field1893 = var8;
        }
        if (this.field1892 != 2 && this.field1892 != 4) {
            return;
        }
        if (Statics.field1893 == null || Statics.field1893.length < this.field1894.length) {
            Statics.field1893 = new int[this.field1894.length];
        }
        short var9;
        if (this.field1894.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1894.length;
        int var11 = this.field1886 * arg0;
        int var12 = var9 - 1;
        if (this.field1892 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1893[var15] = this.field1894[var16];
            }
        }
        int[] var17 = this.field1894;
        this.field1894 = Statics.field1893;
        Statics.field1893 = var17;
    }
}
