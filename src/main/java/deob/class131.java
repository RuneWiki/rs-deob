package deob;

@ObfuscatedName("eg")
public class class131 extends class193 {

    @ObfuscatedName("eg.f")
    public int field1886;

    @ObfuscatedName("eg.m")
    public boolean field1894;

    @ObfuscatedName("eg.c")
    public int[] field1888;

    @ObfuscatedName("eg.z")
    public int[] field1889;

    @ObfuscatedName("eg.h")
    public int[] field1890;

    @ObfuscatedName("eg.g")
    public int[] field1891;

    @ObfuscatedName("eg.e")
    public int field1892;

    @ObfuscatedName("eg.o")
    public int field1893;

    @ObfuscatedName("eg.x")
    public int[] field1885;

    @ObfuscatedName("eg.a")
    public boolean field1895 = false;

    public class131(class174 arg0) {
        this.field1886 = arg0.method3065();
        this.field1894 = arg0.method2925() == 1;
        int var2 = arg0.method2925();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1888 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1888[var3] = arg0.method3065();
        }
        if (var2 > 1) {
            this.field1889 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1889[var4] = arg0.method2925();
            }
        }
        if (var2 > 1) {
            this.field1890 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1890[var5] = arg0.method2925();
            }
        }
        this.field1891 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1891[var6] = arg0.method3058();
        }
        this.field1892 = arg0.method2925();
        this.field1893 = arg0.method2925();
        this.field1885 = null;
    }

    @ObfuscatedName("eg.n(DILis;)Z")
    public boolean method2307(double arg0, int arg1, class236 arg2) {
        for (int var5 = 0; var5 < this.field1888.length; var5++) {
            if (arg2.method3838(this.field1888[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1885 = new int[var6];
        for (int var7 = 0; var7 < this.field1888.length; var7++) {
            int var8 = this.field1888[var7];
            class285 var9;
            if (class287.method4139(arg2, var8)) {
                var9 = class287.method880();
            } else {
                var9 = null;
            }
            var9.method4736();
            byte[] var11 = var9.field3776;
            int[] var12 = var9.field3772;
            int var13 = this.field1891[var7];
            if ((var13 & 0xFF000000) == 16777216) {
            }
            if ((var13 & 0xFF000000) == 33554432) {
            }
            if ((var13 & 0xFF000000) == 50331648) {
                int var14 = var13 & 0xFF00FF;
                int var15 = var13 >> 8 & 0xFF;
                for (int var16 = 0; var16 < var12.length; var16++) {
                    int var17 = var12[var16];
                    if (var17 >> 8 == (var17 & 0xFFFF)) {
                        int var18 = var17 & 0xFF;
                        var12[var16] = var14 * var18 >> 8 & 0xFF00FF | var15 * var18 & 0xFF00;
                    }
                }
            }
            for (int var19 = 0; var19 < var12.length; var19++) {
                var12[var19] = class137.method2462(var12[var19], arg0);
            }
            int var20;
            if (var7 == 0) {
                var20 = 0;
            } else {
                var20 = this.field1889[var7 - 1];
            }
            if (var20 == 0) {
                if (var9.field3773 == arg1) {
                    for (int var21 = 0; var21 < var6; var21++) {
                        this.field1885[var21] = var12[var11[var21] & 0xFF];
                    }
                } else if (var9.field3773 == 64 && arg1 == 128) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < arg1; var23++) {
                        for (int var24 = 0; var24 < arg1; var24++) {
                            this.field1885[var22++] = var12[var11[(var23 >> 1 << 6) + (var24 >> 1)] & 0xFF];
                        }
                    }
                } else if (var9.field3773 == 128 && arg1 == 64) {
                    int var25 = 0;
                    for (int var26 = 0; var26 < arg1; var26++) {
                        for (int var27 = 0; var27 < arg1; var27++) {
                            this.field1885[var25++] = var12[var11[(var26 << 1 << 7) + (var27 << 1)] & 0xFF];
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
            if (var20 == 1) {
            }
            if (var20 == 2) {
            }
            if (var20 == 3) {
            }
        }
        return true;
    }

    @ObfuscatedName("eg.p()V")
    public void method2310() {
        this.field1885 = null;
    }

    @ObfuscatedName("eg.i(I)V")
    public void method2311(int arg0) {
        if (this.field1885 == null) {
            return;
        }
        if (this.field1892 == 1 || this.field1892 == 3) {
            if (Statics.field1896 == null || Statics.field1896.length < this.field1885.length) {
                Statics.field1896 = new int[this.field1885.length];
            }
            short var2;
            if (this.field1885.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1885.length;
            int var4 = arg0 * var2 * this.field1893;
            int var5 = var3 - 1;
            if (this.field1892 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1896[var6] = this.field1885[var7];
            }
            int[] var8 = this.field1885;
            this.field1885 = Statics.field1896;
            Statics.field1896 = var8;
        }
        if (this.field1892 != 2 && this.field1892 != 4) {
            return;
        }
        if (Statics.field1896 == null || Statics.field1896.length < this.field1885.length) {
            Statics.field1896 = new int[this.field1885.length];
        }
        short var9;
        if (this.field1885.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1885.length;
        int var11 = this.field1893 * arg0;
        int var12 = var9 - 1;
        if (this.field1892 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1896[var15] = this.field1885[var16];
            }
        }
        int[] var17 = this.field1885;
        this.field1885 = Statics.field1896;
        Statics.field1896 = var17;
    }
}
