package deob;

@ObfuscatedName("de")
public class class119 extends class207 {

    @ObfuscatedName("de.g")
    public int field1598;

    @ObfuscatedName("de.i")
    public boolean field1601;

    @ObfuscatedName("de.h")
    public int[] field1602;

    @ObfuscatedName("de.l")
    public int[] field1603;

    @ObfuscatedName("de.d")
    public int[] field1607;

    @ObfuscatedName("de.o")
    public int[] field1605;

    @ObfuscatedName("de.s")
    public int field1606;

    @ObfuscatedName("de.k")
    public int field1604;

    @ObfuscatedName("de.v")
    public int[] field1608;

    @ObfuscatedName("de.p")
    public boolean field1609 = false;

    public class119(class185 arg0) {
        this.field1598 = arg0.method3245();
        this.field1601 = arg0.method3243() == 1;
        int var2 = arg0.method3243();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1602 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1602[var3] = arg0.method3245();
        }
        if (var2 > 1) {
            this.field1603 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1603[var4] = arg0.method3243();
            }
        }
        if (var2 > 1) {
            this.field1607 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1607[var5] = arg0.method3243();
            }
        }
        this.field1605 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1605[var6] = arg0.method3323();
        }
        this.field1606 = arg0.method3243();
        this.field1604 = arg0.method3243();
        this.field1608 = null;
    }

    @ObfuscatedName("de.c(DILih;)Z")
    public boolean method2403(double arg0, int arg1, class250 arg2) {
        for (int var5 = 0; var5 < this.field1602.length; var5++) {
            if (arg2.method4219(this.field1602[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1608 = new int[var6];
        for (int var7 = 0; var7 < this.field1602.length; var7++) {
            int var8 = this.field1602[var7];
            byte[] var9 = arg2.method4217(var8);
            boolean var10;
            if (var9 == null) {
                var10 = false;
            } else {
                class325.method45(var9);
                var10 = true;
            }
            class323 var11;
            if (var10) {
                class323 var12 = new class323();
                var12.field3850 = Statics.field3864;
                var12.field3843 = Statics.field78;
                var12.field3849 = Statics.field559[0];
                var12.field3848 = Statics.field3863[0];
                var12.field3845 = Statics.field3865[0];
                var12.field3846 = Statics.field3868[0];
                var12.field3844 = Statics.field3866;
                var12.field3847 = Statics.field326[0];
                class325.method200();
                var11 = var12;
            } else {
                var11 = null;
            }
            var11.method5457();
            byte[] var15 = var11.field3847;
            int[] var16 = var11.field3844;
            int var17 = this.field1605[var7];
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
                var16[var23] = class125.method2598(var16[var23], arg0);
            }
            int var24;
            if (var7 == 0) {
                var24 = 0;
            } else {
                var24 = this.field1603[var7 - 1];
            }
            if (var24 == 0) {
                if (var11.field3845 == arg1) {
                    for (int var25 = 0; var25 < var6; var25++) {
                        this.field1608[var25] = var16[var15[var25] & 0xFF];
                    }
                } else if (var11.field3845 == 64 && arg1 == 128) {
                    int var26 = 0;
                    for (int var27 = 0; var27 < arg1; var27++) {
                        for (int var28 = 0; var28 < arg1; var28++) {
                            this.field1608[var26++] = var16[var15[(var27 >> 1 << 6) + (var28 >> 1)] & 0xFF];
                        }
                    }
                } else if (var11.field3845 == 128 && arg1 == 64) {
                    int var29 = 0;
                    for (int var30 = 0; var30 < arg1; var30++) {
                        for (int var31 = 0; var31 < arg1; var31++) {
                            this.field1608[var29++] = var16[var15[(var30 << 1 << 7) + (var31 << 1)] & 0xFF];
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

    @ObfuscatedName("de.q()V")
    public void method2411() {
        this.field1608 = null;
    }

    @ObfuscatedName("de.m(I)V")
    public void method2405(int arg0) {
        if (this.field1608 == null) {
            return;
        }
        if (this.field1606 == 1 || this.field1606 == 3) {
            if (Statics.field1610 == null || Statics.field1610.length < this.field1608.length) {
                Statics.field1610 = new int[this.field1608.length];
            }
            short var2;
            if (this.field1608.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1608.length;
            int var4 = arg0 * var2 * this.field1604;
            int var5 = var3 - 1;
            if (this.field1606 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1610[var6] = this.field1608[var7];
            }
            int[] var8 = this.field1608;
            this.field1608 = Statics.field1610;
            Statics.field1610 = var8;
        }
        if (this.field1606 != 2 && this.field1606 != 4) {
            return;
        }
        if (Statics.field1610 == null || Statics.field1610.length < this.field1608.length) {
            Statics.field1610 = new int[this.field1608.length];
        }
        short var9;
        if (this.field1608.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1608.length;
        int var11 = this.field1604 * arg0;
        int var12 = var9 - 1;
        if (this.field1606 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1610[var15] = this.field1608[var16];
            }
        }
        int[] var17 = this.field1608;
        this.field1608 = Statics.field1610;
        Statics.field1610 = var17;
    }
}
