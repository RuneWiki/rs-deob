package deob;

@ObfuscatedName("db")
public class class125 extends class181 {

    @ObfuscatedName("db.i")
    public int field1618;

    @ObfuscatedName("db.g")
    public boolean field1611;

    @ObfuscatedName("db.d")
    public int[] field1610;

    @ObfuscatedName("db.l")
    public int[] field1613;

    @ObfuscatedName("db.j")
    public int[] field1608;

    @ObfuscatedName("db.m")
    public int[] field1614;

    @ObfuscatedName("db.p")
    public int field1616;

    @ObfuscatedName("db.h")
    public int field1617;

    @ObfuscatedName("db.v")
    public int[] field1612;

    @ObfuscatedName("db.n")
    public boolean field1619 = false;

    public class125(class301 arg0) {
        this.field1618 = arg0.method5124();
        this.field1611 = arg0.method5129() == 1;
        int var2 = arg0.method5129();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1610 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1610[var3] = arg0.method5124();
        }
        if (var2 > 1) {
            this.field1613 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1613[var4] = arg0.method5129();
            }
        }
        if (var2 > 1) {
            this.field1608 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1608[var5] = arg0.method5129();
            }
        }
        this.field1614 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1614[var6] = arg0.method5134();
        }
        this.field1616 = arg0.method5129();
        this.field1617 = arg0.method5129();
        this.field1612 = null;
    }

    @ObfuscatedName("db.c(DILii;)Z")
    public boolean method2652(double arg0, int arg1, class235 arg2) {
        for (int var5 = 0; var5 < this.field1610.length; var5++) {
            if (arg2.method3905(this.field1610[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1612 = new int[var6];
        for (int var7 = 0; var7 < this.field1610.length; var7++) {
            int var8 = this.field1610[var7];
            byte[] var9 = arg2.method3898(var8);
            boolean var10;
            if (var9 == null) {
                var10 = false;
            } else {
                class327.method3663(var9);
                var10 = true;
            }
            class325 var11;
            if (var10) {
                var11 = class327.method5477();
            } else {
                var11 = null;
            }
            var11.method5661();
            byte[] var13 = var11.field3861;
            int[] var14 = var11.field3862;
            int var15 = this.field1614[var7];
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
                var14[var21] = class131.method2808(var14[var21], arg0);
            }
            int var22;
            if (var7 == 0) {
                var22 = 0;
            } else {
                var22 = this.field1613[var7 - 1];
            }
            if (var22 == 0) {
                if (var11.field3863 == arg1) {
                    for (int var23 = 0; var23 < var6; var23++) {
                        this.field1612[var23] = var14[var13[var23] & 0xFF];
                    }
                } else if (var11.field3863 == 64 && arg1 == 128) {
                    int var24 = 0;
                    for (int var25 = 0; var25 < arg1; var25++) {
                        for (int var26 = 0; var26 < arg1; var26++) {
                            this.field1612[var24++] = var14[var13[(var25 >> 1 << 6) + (var26 >> 1)] & 0xFF];
                        }
                    }
                } else if (var11.field3863 == 128 && arg1 == 64) {
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

    @ObfuscatedName("db.t()V")
    public void method2661() {
        this.field1612 = null;
    }

    @ObfuscatedName("db.o(I)V")
    public void method2654(int arg0) {
        if (this.field1612 == null) {
            return;
        }
        if (this.field1616 == 1 || this.field1616 == 3) {
            if (Statics.field1620 == null || Statics.field1620.length < this.field1612.length) {
                Statics.field1620 = new int[this.field1612.length];
            }
            short var2;
            if (this.field1612.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1612.length;
            int var4 = arg0 * var2 * this.field1617;
            int var5 = var3 - 1;
            if (this.field1616 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1620[var6] = this.field1612[var7];
            }
            int[] var8 = this.field1612;
            this.field1612 = Statics.field1620;
            Statics.field1620 = var8;
        }
        if (this.field1616 != 2 && this.field1616 != 4) {
            return;
        }
        if (Statics.field1620 == null || Statics.field1620.length < this.field1612.length) {
            Statics.field1620 = new int[this.field1612.length];
        }
        short var9;
        if (this.field1612.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1612.length;
        int var11 = this.field1617 * arg0;
        int var12 = var9 - 1;
        if (this.field1616 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1620[var15] = this.field1612[var16];
            }
        }
        int[] var17 = this.field1612;
        this.field1612 = Statics.field1620;
        Statics.field1620 = var17;
    }
}
