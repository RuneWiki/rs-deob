package deob;

@ObfuscatedName("dk")
public class class125 extends class181 {

    @ObfuscatedName("dk.u")
    public int field1604;

    @ObfuscatedName("dk.n")
    public boolean field1605;

    @ObfuscatedName("dk.t")
    public int[] field1606;

    @ObfuscatedName("dk.q")
    public int[] field1608;

    @ObfuscatedName("dk.x")
    public int[] field1611;

    @ObfuscatedName("dk.d")
    public int[] field1600;

    @ObfuscatedName("dk.f")
    public int field1607;

    @ObfuscatedName("dk.c")
    public int field1602;

    @ObfuscatedName("dk.r")
    public int[] field1612;

    @ObfuscatedName("dk.y")
    public boolean field1613 = false;

    public class125(class300 arg0) {
        this.field1604 = arg0.method5054();
        this.field1605 = arg0.method5179() == 1;
        int var2 = arg0.method5179();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1606 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1606[var3] = arg0.method5054();
        }
        if (var2 > 1) {
            this.field1608 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1608[var4] = arg0.method5179();
            }
        }
        if (var2 > 1) {
            this.field1611 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1611[var5] = arg0.method5179();
            }
        }
        this.field1600 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1600[var6] = arg0.method5056();
        }
        this.field1607 = arg0.method5179();
        this.field1602 = arg0.method5179();
        this.field1612 = null;
    }

    @ObfuscatedName("dk.s(DILhz;)Z")
    public boolean method2608(double arg0, int arg1, class234 arg2) {
        for (int var5 = 0; var5 < this.field1606.length; var5++) {
            if (arg2.method3860(this.field1606[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1612 = new int[var6];
        for (int var7 = 0; var7 < this.field1606.length; var7++) {
            int var8 = this.field1606[var7];
            class324 var9;
            if (class326.method4881(arg2, var8)) {
                class324 var10 = new class324();
                var10.field3871 = Statics.field72;
                var10.field3872 = Statics.field3888;
                var10.field3869 = Statics.field3886[0];
                var10.field3870 = Statics.field3887[0];
                var10.field3867 = Statics.field3889[0];
                var10.field3868 = Statics.field3042[0];
                var10.field3865 = Statics.field3890;
                var10.field3866 = Statics.field283[0];
                class326.method3139();
                var9 = var10;
            } else {
                var9 = null;
            }
            var9.method5568();
            byte[] var13 = var9.field3866;
            int[] var14 = var9.field3865;
            int var15 = this.field1600[var7];
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
                var14[var21] = class131.method2743(var14[var21], arg0);
            }
            int var22;
            if (var7 == 0) {
                var22 = 0;
            } else {
                var22 = this.field1608[var7 - 1];
            }
            if (var22 == 0) {
                if (var9.field3867 == arg1) {
                    for (int var23 = 0; var23 < var6; var23++) {
                        this.field1612[var23] = var14[var13[var23] & 0xFF];
                    }
                } else if (var9.field3867 == 64 && arg1 == 128) {
                    int var24 = 0;
                    for (int var25 = 0; var25 < arg1; var25++) {
                        for (int var26 = 0; var26 < arg1; var26++) {
                            this.field1612[var24++] = var14[var13[(var25 >> 1 << 6) + (var26 >> 1)] & 0xFF];
                        }
                    }
                } else if (var9.field3867 == 128 && arg1 == 64) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < arg1; var28++) {
                        for (int var29 = 0; var29 < arg1; var29++) {
                            this.field1612[var27++] = var14[var13[(var28 << 1 << 7) + (var29 << 1)] & 0xFF];
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

    @ObfuscatedName("dk.j()V")
    public void method2609() {
        this.field1612 = null;
    }

    @ObfuscatedName("dk.i(I)V")
    public void method2607(int arg0) {
        if (this.field1612 == null) {
            return;
        }
        if (this.field1607 == 1 || this.field1607 == 3) {
            if (Statics.field1610 == null || Statics.field1610.length < this.field1612.length) {
                Statics.field1610 = new int[this.field1612.length];
            }
            short var2;
            if (this.field1612.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1612.length;
            int var4 = arg0 * var2 * this.field1602;
            int var5 = var3 - 1;
            if (this.field1607 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1610[var6] = this.field1612[var7];
            }
            int[] var8 = this.field1612;
            this.field1612 = Statics.field1610;
            Statics.field1610 = var8;
        }
        if (this.field1607 != 2 && this.field1607 != 4) {
            return;
        }
        if (Statics.field1610 == null || Statics.field1610.length < this.field1612.length) {
            Statics.field1610 = new int[this.field1612.length];
        }
        short var9;
        if (this.field1612.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1612.length;
        int var11 = this.field1602 * arg0;
        int var12 = var9 - 1;
        if (this.field1607 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1610[var15] = this.field1612[var16];
            }
        }
        int[] var17 = this.field1612;
        this.field1612 = Statics.field1610;
        Statics.field1610 = var17;
    }
}
