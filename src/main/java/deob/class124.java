package deob;

@ObfuscatedName("dr")
public class class124 extends class212 {

    @ObfuscatedName("dr.b")
    public int field1605;

    @ObfuscatedName("dr.a")
    public boolean field1601;

    @ObfuscatedName("dr.c")
    public int[] field1603;

    @ObfuscatedName("dr.z")
    public int[] field1604;

    @ObfuscatedName("dr.j")
    public int[] field1602;

    @ObfuscatedName("dr.d")
    public int[] field1606;

    @ObfuscatedName("dr.t")
    public int field1607;

    @ObfuscatedName("dr.f")
    public int field1608;

    @ObfuscatedName("dr.i")
    public int[] field1609;

    @ObfuscatedName("dr.m")
    public boolean field1610 = false;

    public class124(class190 arg0) {
        this.field1605 = arg0.method3513();
        this.field1601 = arg0.method3511() == 1;
        int var2 = arg0.method3511();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1603 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1603[var3] = arg0.method3513();
        }
        if (var2 > 1) {
            this.field1604 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1604[var4] = arg0.method3511();
            }
        }
        if (var2 > 1) {
            this.field1602 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1602[var5] = arg0.method3511();
            }
        }
        this.field1606 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1606[var6] = arg0.method3562();
        }
        this.field1607 = arg0.method3511();
        this.field1608 = arg0.method3511();
        this.field1609 = null;
    }

    @ObfuscatedName("dr.n(DILij;)Z")
    public boolean method2657(double arg0, int arg1, class254 arg2) {
        for (int var5 = 0; var5 < this.field1603.length; var5++) {
            if (arg2.method4474(this.field1603[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1609 = new int[var6];
        for (int var7 = 0; var7 < this.field1603.length; var7++) {
            int var8 = this.field1603[var7];
            byte[] var9 = arg2.method4470(var8);
            boolean var10;
            if (var9 == null) {
                var10 = false;
            } else {
                class328.method108(var9);
                var10 = true;
            }
            class326 var11;
            if (var10) {
                class326 var12 = new class326();
                var12.field3876 = Statics.field3890;
                var12.field3877 = Statics.field3892;
                var12.field3870 = Statics.field3774[0];
                var12.field3875 = Statics.field226[0];
                var12.field3873 = Statics.field523[0];
                var12.field3874 = Statics.field3893[0];
                var12.field3871 = Statics.field3894;
                var12.field3872 = Statics.field3895[0];
                Statics.field3774 = null;
                Statics.field226 = null;
                Statics.field523 = null;
                Statics.field3893 = null;
                Statics.field3894 = null;
                Statics.field3895 = (byte[][]) null;
                var11 = var12;
            } else {
                var11 = null;
            }
            var11.method5667();
            byte[] var15 = var11.field3872;
            int[] var16 = var11.field3871;
            int var17 = this.field1606[var7];
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
                var16[var23] = class130.method2792(var16[var23], arg0);
            }
            int var24;
            if (var7 == 0) {
                var24 = 0;
            } else {
                var24 = this.field1604[var7 - 1];
            }
            if (var24 == 0) {
                if (var11.field3873 == arg1) {
                    for (int var25 = 0; var25 < var6; var25++) {
                        this.field1609[var25] = var16[var15[var25] & 0xFF];
                    }
                } else if (var11.field3873 == 64 && arg1 == 128) {
                    int var26 = 0;
                    for (int var27 = 0; var27 < arg1; var27++) {
                        for (int var28 = 0; var28 < arg1; var28++) {
                            this.field1609[var26++] = var16[var15[(var27 >> 1 << 6) + (var28 >> 1)] & 0xFF];
                        }
                    }
                } else if (var11.field3873 == 128 && arg1 == 64) {
                    int var29 = 0;
                    for (int var30 = 0; var30 < arg1; var30++) {
                        for (int var31 = 0; var31 < arg1; var31++) {
                            this.field1609[var29++] = var16[var15[(var30 << 1 << 7) + (var31 << 1)] & 0xFF];
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

    @ObfuscatedName("dr.h()V")
    public void method2656() {
        this.field1609 = null;
    }

    @ObfuscatedName("dr.l(I)V")
    public void method2662(int arg0) {
        if (this.field1609 == null) {
            return;
        }
        if (this.field1607 == 1 || this.field1607 == 3) {
            if (Statics.field1611 == null || Statics.field1611.length < this.field1609.length) {
                Statics.field1611 = new int[this.field1609.length];
            }
            short var2;
            if (this.field1609.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1609.length;
            int var4 = arg0 * var2 * this.field1608;
            int var5 = var3 - 1;
            if (this.field1607 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1611[var6] = this.field1609[var7];
            }
            int[] var8 = this.field1609;
            this.field1609 = Statics.field1611;
            Statics.field1611 = var8;
        }
        if (this.field1607 != 2 && this.field1607 != 4) {
            return;
        }
        if (Statics.field1611 == null || Statics.field1611.length < this.field1609.length) {
            Statics.field1611 = new int[this.field1609.length];
        }
        short var9;
        if (this.field1609.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1609.length;
        int var11 = this.field1608 * arg0;
        int var12 = var9 - 1;
        if (this.field1607 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1611[var15] = this.field1609[var16];
            }
        }
        int[] var17 = this.field1609;
        this.field1609 = Statics.field1611;
        Statics.field1611 = var17;
    }
}
