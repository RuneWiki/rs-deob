package deob;

@ObfuscatedName("du")
public class class119 extends class207 {

    @ObfuscatedName("du.e")
    public int field1590;

    @ObfuscatedName("du.a")
    public boolean field1595;

    @ObfuscatedName("du.c")
    public int[] field1592;

    @ObfuscatedName("du.p")
    public int[] field1593;

    @ObfuscatedName("du.r")
    public int[] field1594;

    @ObfuscatedName("du.m")
    public int[] field1586;

    @ObfuscatedName("du.d")
    public int field1596;

    @ObfuscatedName("du.z")
    public int field1587;

    @ObfuscatedName("du.x")
    public int[] field1597;

    @ObfuscatedName("du.v")
    public boolean field1599 = false;

    public class119(class185 arg0) {
        this.field1590 = arg0.method3346();
        this.field1595 = arg0.method3344() == 1;
        int var2 = arg0.method3344();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1592 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1592[var3] = arg0.method3346();
        }
        if (var2 > 1) {
            this.field1593 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1593[var4] = arg0.method3344();
            }
        }
        if (var2 > 1) {
            this.field1594 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1594[var5] = arg0.method3344();
            }
        }
        this.field1586 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1586[var6] = arg0.method3432();
        }
        this.field1596 = arg0.method3344();
        this.field1587 = arg0.method3344();
        this.field1597 = null;
    }

    @ObfuscatedName("du.f(DILik;)Z")
    public boolean method2518(double arg0, int arg1, class250 arg2) {
        for (int var5 = 0; var5 < this.field1592.length; var5++) {
            if (arg2.method4298(this.field1592[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1597 = new int[var6];
        for (int var7 = 0; var7 < this.field1592.length; var7++) {
            class323 var8 = class325.method4624(arg2, this.field1592[var7]);
            var8.method5540();
            byte[] var9 = var8.field3866;
            int[] var10 = var8.field3864;
            int var11 = this.field1586[var7];
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
                var10[var17] = class125.method2647(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field1593[var7 - 1];
            }
            if (var18 == 0) {
                if (var8.field3865 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field1597[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field3865 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field1597[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field3865 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field1597[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
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

    @ObfuscatedName("du.l()V")
    public void method2526() {
        this.field1597 = null;
    }

    @ObfuscatedName("du.w(I)V")
    public void method2520(int arg0) {
        if (this.field1597 == null) {
            return;
        }
        if (this.field1596 == 1 || this.field1596 == 3) {
            if (Statics.field1600 == null || Statics.field1600.length < this.field1597.length) {
                Statics.field1600 = new int[this.field1597.length];
            }
            short var2;
            if (this.field1597.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1597.length;
            int var4 = arg0 * var2 * this.field1587;
            int var5 = var3 - 1;
            if (this.field1596 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1600[var6] = this.field1597[var7];
            }
            int[] var8 = this.field1597;
            this.field1597 = Statics.field1600;
            Statics.field1600 = var8;
        }
        if (this.field1596 != 2 && this.field1596 != 4) {
            return;
        }
        if (Statics.field1600 == null || Statics.field1600.length < this.field1597.length) {
            Statics.field1600 = new int[this.field1597.length];
        }
        short var9;
        if (this.field1597.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1597.length;
        int var11 = this.field1587 * arg0;
        int var12 = var9 - 1;
        if (this.field1596 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1600[var15] = this.field1597[var16];
            }
        }
        int[] var17 = this.field1597;
        this.field1597 = Statics.field1600;
        Statics.field1600 = var17;
    }
}
