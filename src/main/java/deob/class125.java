package deob;

@ObfuscatedName("dt")
public class class125 extends class181 {

    @ObfuscatedName("dt.v")
    public int field1597;

    @ObfuscatedName("dt.l")
    public boolean field1594;

    @ObfuscatedName("dt.c")
    public int[] field1600;

    @ObfuscatedName("dt.o")
    public int[] field1599;

    @ObfuscatedName("dt.i")
    public int[] field1602;

    @ObfuscatedName("dt.d")
    public int[] field1603;

    @ObfuscatedName("dt.m")
    public int field1604;

    @ObfuscatedName("dt.p")
    public int field1605;

    @ObfuscatedName("dt.h")
    public int[] field1606;

    @ObfuscatedName("dt.k")
    public boolean field1607 = false;

    public class125(class300 arg0) {
        this.field1597 = arg0.method5166();
        this.field1594 = arg0.method5123() == 1;
        int var2 = arg0.method5123();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1600 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1600[var3] = arg0.method5166();
        }
        if (var2 > 1) {
            this.field1599 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1599[var4] = arg0.method5123();
            }
        }
        if (var2 > 1) {
            this.field1602 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1602[var5] = arg0.method5123();
            }
        }
        this.field1603 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1603[var6] = arg0.method5155();
        }
        this.field1604 = arg0.method5123();
        this.field1605 = arg0.method5123();
        this.field1606 = null;
    }

    @ObfuscatedName("dt.a(DILhq;)Z")
    public boolean method2715(double arg0, int arg1, class234 arg2) {
        for (int var5 = 0; var5 < this.field1600.length; var5++) {
            if (arg2.method3952(this.field1600[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1606 = new int[var6];
        for (int var7 = 0; var7 < this.field1600.length; var7++) {
            class324 var8 = Statics.method2824(arg2, this.field1600[var7]);
            var8.method5662();
            byte[] var9 = var8.field3855;
            int[] var10 = var8.field3856;
            int var11 = this.field1603[var7];
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
                var10[var17] = class131.method2833(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field1599[var7 - 1];
            }
            if (var18 == 0) {
                if (var8.field3854 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field1606[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field3854 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field1606[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field3854 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field1606[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
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

    @ObfuscatedName("dt.t()V")
    public void method2722() {
        this.field1606 = null;
    }

    @ObfuscatedName("dt.n(I)V")
    public void method2717(int arg0) {
        if (this.field1606 == null) {
            return;
        }
        if (this.field1604 == 1 || this.field1604 == 3) {
            if (Statics.field1608 == null || Statics.field1608.length < this.field1606.length) {
                Statics.field1608 = new int[this.field1606.length];
            }
            short var2;
            if (this.field1606.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1606.length;
            int var4 = arg0 * var2 * this.field1605;
            int var5 = var3 - 1;
            if (this.field1604 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1608[var6] = this.field1606[var7];
            }
            int[] var8 = this.field1606;
            this.field1606 = Statics.field1608;
            Statics.field1608 = var8;
        }
        if (this.field1604 != 2 && this.field1604 != 4) {
            return;
        }
        if (Statics.field1608 == null || Statics.field1608.length < this.field1606.length) {
            Statics.field1608 = new int[this.field1606.length];
        }
        short var9;
        if (this.field1606.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1606.length;
        int var11 = this.field1605 * arg0;
        int var12 = var9 - 1;
        if (this.field1604 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1608[var15] = this.field1606[var16];
            }
        }
        int[] var17 = this.field1606;
        this.field1606 = Statics.field1608;
        Statics.field1608 = var17;
    }
}
