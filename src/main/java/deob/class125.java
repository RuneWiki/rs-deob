package deob;

@ObfuscatedName("du")
public class class125 extends class181 {

    @ObfuscatedName("du.l")
    public int field1597;

    @ObfuscatedName("du.u")
    public boolean field1591;

    @ObfuscatedName("du.j")
    public int[] field1594;

    @ObfuscatedName("du.v")
    public int[] field1595;

    @ObfuscatedName("du.d")
    public int[] field1593;

    @ObfuscatedName("du.z")
    public int[] field1601;

    @ObfuscatedName("du.n")
    public int field1598;

    @ObfuscatedName("du.h")
    public int field1588;

    @ObfuscatedName("du.f")
    public int[] field1600;

    @ObfuscatedName("du.s")
    public boolean field1599 = false;

    public class125(class300 arg0) {
        this.field1597 = arg0.method5304();
        this.field1591 = arg0.method5103() == 1;
        int var2 = arg0.method5103();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1594 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1594[var3] = arg0.method5304();
        }
        if (var2 > 1) {
            this.field1595 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1595[var4] = arg0.method5103();
            }
        }
        if (var2 > 1) {
            this.field1593 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1593[var5] = arg0.method5103();
            }
        }
        this.field1601 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1601[var6] = arg0.method5208();
        }
        this.field1598 = arg0.method5103();
        this.field1588 = arg0.method5103();
        this.field1600 = null;
    }

    @ObfuscatedName("du.c(DILhz;)Z")
    public boolean method2615(double arg0, int arg1, class234 arg2) {
        for (int var5 = 0; var5 < this.field1594.length; var5++) {
            if (arg2.method3834(this.field1594[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1600 = new int[var6];
        for (int var7 = 0; var7 < this.field1594.length; var7++) {
            int var8 = this.field1594[var7];
            class324 var9;
            if (class326.method3807(arg2, var8)) {
                class324 var10 = new class324();
                var10.field3864 = Statics.field3880;
                var10.field3860 = Statics.field3881;
                var10.field3862 = Statics.field3883[0];
                var10.field3863 = Statics.field501[0];
                var10.field3865 = Statics.field3882[0];
                var10.field3861 = Statics.field1403[0];
                var10.field3859 = Statics.field3878;
                var10.field3858 = Statics.field3181[0];
                class326.method3386();
                var9 = var10;
            } else {
                var9 = null;
            }
            var9.method5638();
            byte[] var13 = var9.field3858;
            int[] var14 = var9.field3859;
            int var15 = this.field1601[var7];
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
                var14[var21] = class131.method2763(var14[var21], arg0);
            }
            int var22;
            if (var7 == 0) {
                var22 = 0;
            } else {
                var22 = this.field1595[var7 - 1];
            }
            if (var22 == 0) {
                if (var9.field3865 == arg1) {
                    for (int var23 = 0; var23 < var6; var23++) {
                        this.field1600[var23] = var14[var13[var23] & 0xFF];
                    }
                } else if (var9.field3865 == 64 && arg1 == 128) {
                    int var24 = 0;
                    for (int var25 = 0; var25 < arg1; var25++) {
                        for (int var26 = 0; var26 < arg1; var26++) {
                            this.field1600[var24++] = var14[var13[(var25 >> 1 << 6) + (var26 >> 1)] & 0xFF];
                        }
                    }
                } else if (var9.field3865 == 128 && arg1 == 64) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < arg1; var28++) {
                        for (int var29 = 0; var29 < arg1; var29++) {
                            this.field1600[var27++] = var14[var13[(var28 << 1 << 7) + (var29 << 1)] & 0xFF];
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

    @ObfuscatedName("du.x()V")
    public void method2611() {
        this.field1600 = null;
    }

    @ObfuscatedName("du.t(I)V")
    public void method2610(int arg0) {
        if (this.field1600 == null) {
            return;
        }
        if (this.field1598 == 1 || this.field1598 == 3) {
            if (Statics.field1602 == null || Statics.field1602.length < this.field1600.length) {
                Statics.field1602 = new int[this.field1600.length];
            }
            short var2;
            if (this.field1600.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1600.length;
            int var4 = arg0 * var2 * this.field1588;
            int var5 = var3 - 1;
            if (this.field1598 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1602[var6] = this.field1600[var7];
            }
            int[] var8 = this.field1600;
            this.field1600 = Statics.field1602;
            Statics.field1602 = var8;
        }
        if (this.field1598 != 2 && this.field1598 != 4) {
            return;
        }
        if (Statics.field1602 == null || Statics.field1602.length < this.field1600.length) {
            Statics.field1602 = new int[this.field1600.length];
        }
        short var9;
        if (this.field1600.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1600.length;
        int var11 = this.field1588 * arg0;
        int var12 = var9 - 1;
        if (this.field1598 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1602[var15] = this.field1600[var16];
            }
        }
        int[] var17 = this.field1600;
        this.field1600 = Statics.field1602;
        Statics.field1602 = var17;
    }
}
