package deob;

@ObfuscatedName("dx")
public class class119 extends class207 {

    @ObfuscatedName("dx.c")
    public int field1594;

    @ObfuscatedName("dx.l")
    public boolean field1603;

    @ObfuscatedName("dx.b")
    public int[] field1596;

    @ObfuscatedName("dx.w")
    public int[] field1597;

    @ObfuscatedName("dx.n")
    public int[] field1598;

    @ObfuscatedName("dx.i")
    public int[] field1599;

    @ObfuscatedName("dx.p")
    public int field1600;

    @ObfuscatedName("dx.m")
    public int field1592;

    @ObfuscatedName("dx.d")
    public int[] field1593;

    @ObfuscatedName("dx.j")
    public boolean field1590 = false;

    public class119(class185 arg0) {
        this.field1594 = arg0.method3467();
        this.field1603 = arg0.method3679() == 1;
        int var2 = arg0.method3679();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1596 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1596[var3] = arg0.method3467();
        }
        if (var2 > 1) {
            this.field1597 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1597[var4] = arg0.method3679();
            }
        }
        if (var2 > 1) {
            this.field1598 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1598[var5] = arg0.method3679();
            }
        }
        this.field1599 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1599[var6] = arg0.method3588();
        }
        this.field1600 = arg0.method3679();
        this.field1592 = arg0.method3679();
        this.field1593 = null;
    }

    @ObfuscatedName("dx.g(DILiu;)Z")
    public boolean method2652(double arg0, int arg1, class250 arg2) {
        for (int var5 = 0; var5 < this.field1596.length; var5++) {
            if (arg2.method4444(this.field1596[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1593 = new int[var6];
        for (int var7 = 0; var7 < this.field1596.length; var7++) {
            class323 var8 = class325.method1656(arg2, this.field1596[var7]);
            var8.method5659();
            byte[] var9 = var8.field3871;
            int[] var10 = var8.field3872;
            int var11 = this.field1599[var7];
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
                var10[var17] = class125.method2842(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field1597[var7 - 1];
            }
            if (var18 == 0) {
                if (var8.field3873 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field1593[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field3873 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field1593[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field3873 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field1593[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
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

    @ObfuscatedName("dx.r()V")
    public void method2653() {
        this.field1593 = null;
    }

    @ObfuscatedName("dx.e(I)V")
    public void method2654(int arg0) {
        if (this.field1593 == null) {
            return;
        }
        if (this.field1600 == 1 || this.field1600 == 3) {
            if (Statics.field1604 == null || Statics.field1604.length < this.field1593.length) {
                Statics.field1604 = new int[this.field1593.length];
            }
            short var2;
            if (this.field1593.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1593.length;
            int var4 = arg0 * var2 * this.field1592;
            int var5 = var3 - 1;
            if (this.field1600 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1604[var6] = this.field1593[var7];
            }
            int[] var8 = this.field1593;
            this.field1593 = Statics.field1604;
            Statics.field1604 = var8;
        }
        if (this.field1600 != 2 && this.field1600 != 4) {
            return;
        }
        if (Statics.field1604 == null || Statics.field1604.length < this.field1593.length) {
            Statics.field1604 = new int[this.field1593.length];
        }
        short var9;
        if (this.field1593.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1593.length;
        int var11 = this.field1592 * arg0;
        int var12 = var9 - 1;
        if (this.field1600 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1604[var15] = this.field1593[var16];
            }
        }
        int[] var17 = this.field1593;
        this.field1593 = Statics.field1604;
        Statics.field1604 = var17;
    }
}
