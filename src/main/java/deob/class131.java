package deob;

@ObfuscatedName("ek")
public class class131 extends class193 {

    @ObfuscatedName("ek.d")
    public int field1881;

    @ObfuscatedName("ek.b")
    public boolean field1872;

    @ObfuscatedName("ek.k")
    public int[] field1873;

    @ObfuscatedName("ek.f")
    public int[] field1880;

    @ObfuscatedName("ek.j")
    public int[] field1875;

    @ObfuscatedName("ek.q")
    public int[] field1867;

    @ObfuscatedName("ek.h")
    public int field1877;

    @ObfuscatedName("ek.i")
    public int field1878;

    @ObfuscatedName("ek.s")
    public int[] field1879;

    @ObfuscatedName("ek.n")
    public boolean field1869 = false;

    public class131(class174 arg0) {
        this.field1881 = arg0.method2930();
        this.field1872 = arg0.method2891() == 1;
        int var2 = arg0.method2891();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1873 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1873[var3] = arg0.method2930();
        }
        if (var2 > 1) {
            this.field1880 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1880[var4] = arg0.method2891();
            }
        }
        if (var2 > 1) {
            this.field1875 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1875[var5] = arg0.method2891();
            }
        }
        this.field1867 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1867[var6] = arg0.method2896();
        }
        this.field1877 = arg0.method2891();
        this.field1878 = arg0.method2891();
        this.field1879 = null;
    }

    @ObfuscatedName("ek.e(DILin;)Z")
    public boolean method2264(double arg0, int arg1, class236 arg2) {
        for (int var5 = 0; var5 < this.field1873.length; var5++) {
            if (arg2.method3828(this.field1873[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1879 = new int[var6];
        for (int var7 = 0; var7 < this.field1873.length; var7++) {
            class285 var8 = class287.method7(arg2, this.field1873[var7]);
            var8.method4664();
            byte[] var9 = var8.field3766;
            int[] var10 = var8.field3767;
            int var11 = this.field1867[var7];
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
                var10[var17] = class137.method2389(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field1880[var7 - 1];
            }
            if (var18 == 0) {
                if (var8.field3768 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field1879[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field3768 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field1879[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field3768 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field1879[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
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

    @ObfuscatedName("ek.o()V")
    public void method2265() {
        this.field1879 = null;
    }

    @ObfuscatedName("ek.m(I)V")
    public void method2270(int arg0) {
        if (this.field1879 == null) {
            return;
        }
        if (this.field1877 == 1 || this.field1877 == 3) {
            if (Statics.field1874 == null || Statics.field1874.length < this.field1879.length) {
                Statics.field1874 = new int[this.field1879.length];
            }
            short var2;
            if (this.field1879.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1879.length;
            int var4 = arg0 * var2 * this.field1878;
            int var5 = var3 - 1;
            if (this.field1877 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1874[var6] = this.field1879[var7];
            }
            int[] var8 = this.field1879;
            this.field1879 = Statics.field1874;
            Statics.field1874 = var8;
        }
        if (this.field1877 != 2 && this.field1877 != 4) {
            return;
        }
        if (Statics.field1874 == null || Statics.field1874.length < this.field1879.length) {
            Statics.field1874 = new int[this.field1879.length];
        }
        short var9;
        if (this.field1879.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1879.length;
        int var11 = this.field1878 * arg0;
        int var12 = var9 - 1;
        if (this.field1877 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1874[var15] = this.field1879[var16];
            }
        }
        int[] var17 = this.field1879;
        this.field1879 = Statics.field1874;
        Statics.field1874 = var17;
    }
}
