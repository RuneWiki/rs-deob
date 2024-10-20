package deob;

@ObfuscatedName("dw")
public class class119 extends class207 {

    @ObfuscatedName("dw.l")
    public int field1577;

    @ObfuscatedName("dw.w")
    public boolean field1578;

    @ObfuscatedName("dw.d")
    public int[] field1579;

    @ObfuscatedName("dw.n")
    public int[] field1581;

    @ObfuscatedName("dw.s")
    public int[] field1585;

    @ObfuscatedName("dw.g")
    public int[] field1582;

    @ObfuscatedName("dw.a")
    public int field1583;

    @ObfuscatedName("dw.r")
    public int field1584;

    @ObfuscatedName("dw.k")
    public int[] field1574;

    @ObfuscatedName("dw.m")
    public boolean field1586 = false;

    public class119(class185 arg0) {
        this.field1577 = arg0.method3325();
        this.field1578 = arg0.method3323() == 1;
        int var2 = arg0.method3323();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1579 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1579[var3] = arg0.method3325();
        }
        if (var2 > 1) {
            this.field1581 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1581[var4] = arg0.method3323();
            }
        }
        if (var2 > 1) {
            this.field1585 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1585[var5] = arg0.method3323();
            }
        }
        this.field1582 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1582[var6] = arg0.method3328();
        }
        this.field1583 = arg0.method3323();
        this.field1584 = arg0.method3323();
        this.field1574 = null;
    }

    @ObfuscatedName("dw.f(DILie;)Z")
    public boolean method2477(double arg0, int arg1, class250 arg2) {
        for (int var5 = 0; var5 < this.field1579.length; var5++) {
            if (arg2.method4276(this.field1579[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1574 = new int[var6];
        for (int var7 = 0; var7 < this.field1579.length; var7++) {
            class323 var8 = class325.method460(arg2, this.field1579[var7]);
            var8.method5429();
            byte[] var9 = var8.field3866;
            int[] var10 = var8.field3863;
            int var11 = this.field1582[var7];
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
                var10[var17] = class125.method2608(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field1581[var7 - 1];
            }
            if (var18 == 0) {
                if (var8.field3864 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field1574[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field3864 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field1574[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field3864 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field1574[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
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

    @ObfuscatedName("dw.h()V")
    public void method2475() {
        this.field1574 = null;
    }

    @ObfuscatedName("dw.e(I)V")
    public void method2476(int arg0) {
        if (this.field1574 == null) {
            return;
        }
        if (this.field1583 == 1 || this.field1583 == 3) {
            if (Statics.field1587 == null || Statics.field1587.length < this.field1574.length) {
                Statics.field1587 = new int[this.field1574.length];
            }
            short var2;
            if (this.field1574.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1574.length;
            int var4 = arg0 * var2 * this.field1584;
            int var5 = var3 - 1;
            if (this.field1583 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1587[var6] = this.field1574[var7];
            }
            int[] var8 = this.field1574;
            this.field1574 = Statics.field1587;
            Statics.field1587 = var8;
        }
        if (this.field1583 != 2 && this.field1583 != 4) {
            return;
        }
        if (Statics.field1587 == null || Statics.field1587.length < this.field1574.length) {
            Statics.field1587 = new int[this.field1574.length];
        }
        short var9;
        if (this.field1574.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1574.length;
        int var11 = this.field1584 * arg0;
        int var12 = var9 - 1;
        if (this.field1583 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1587[var15] = this.field1574[var16];
            }
        }
        int[] var17 = this.field1574;
        this.field1574 = Statics.field1587;
        Statics.field1587 = var17;
    }
}
