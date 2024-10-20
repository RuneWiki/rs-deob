package deob;

@ObfuscatedName("dg")
public class class125 extends class181 {

    @ObfuscatedName("dg.r")
    public int field1587;

    @ObfuscatedName("dg.p")
    public boolean field1588;

    @ObfuscatedName("dg.q")
    public int[] field1589;

    @ObfuscatedName("dg.m")
    public int[] field1590;

    @ObfuscatedName("dg.y")
    public int[] field1586;

    @ObfuscatedName("dg.i")
    public int[] field1592;

    @ObfuscatedName("dg.c")
    public int field1583;

    @ObfuscatedName("dg.b")
    public int field1594;

    @ObfuscatedName("dg.o")
    public int[] field1595;

    @ObfuscatedName("dg.a")
    public boolean field1596 = false;

    public class125(class300 arg0) {
        this.field1587 = arg0.method4992();
        this.field1588 = arg0.method4990() == 1;
        int var2 = arg0.method4990();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1589 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1589[var3] = arg0.method4992();
        }
        if (var2 > 1) {
            this.field1590 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1590[var4] = arg0.method4990();
            }
        }
        if (var2 > 1) {
            this.field1586 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1586[var5] = arg0.method4990();
            }
        }
        this.field1592 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1592[var6] = arg0.method5085();
        }
        this.field1583 = arg0.method4990();
        this.field1594 = arg0.method4990();
        this.field1595 = null;
    }

    @ObfuscatedName("dg.z(DILhp;)Z")
    public boolean method2578(double arg0, int arg1, class234 arg2) {
        for (int var5 = 0; var5 < this.field1589.length; var5++) {
            if (arg2.method3735(this.field1589[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1595 = new int[var6];
        for (int var7 = 0; var7 < this.field1589.length; var7++) {
            int var8 = this.field1589[var7];
            byte[] var9 = arg2.method3733(var8);
            boolean var10;
            if (var9 == null) {
                var10 = false;
            } else {
                class326.method999(var9);
                var10 = true;
            }
            class324 var11;
            if (var10) {
                class324 var12 = new class324();
                var12.field3867 = Statics.field3882;
                var12.field3861 = Statics.field1871;
                var12.field3865 = Statics.field3885[0];
                var12.field3866 = Statics.field2471[0];
                var12.field3863 = Statics.field3884[0];
                var12.field3864 = Statics.field4047[0];
                var12.field3862 = Statics.field3881;
                var12.field3868 = Statics.field2320[0];
                Statics.field3885 = null;
                Statics.field2471 = null;
                Statics.field3884 = null;
                Statics.field4047 = null;
                Statics.field3881 = null;
                Statics.field2320 = (byte[][]) null;
                var11 = var12;
            } else {
                var11 = null;
            }
            var11.method5513();
            byte[] var15 = var11.field3868;
            int[] var16 = var11.field3862;
            int var17 = this.field1592[var7];
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
                var16[var23] = class131.method2706(var16[var23], arg0);
            }
            int var24;
            if (var7 == 0) {
                var24 = 0;
            } else {
                var24 = this.field1590[var7 - 1];
            }
            if (var24 == 0) {
                if (var11.field3863 == arg1) {
                    for (int var25 = 0; var25 < var6; var25++) {
                        this.field1595[var25] = var16[var15[var25] & 0xFF];
                    }
                } else if (var11.field3863 == 64 && arg1 == 128) {
                    int var26 = 0;
                    for (int var27 = 0; var27 < arg1; var27++) {
                        for (int var28 = 0; var28 < arg1; var28++) {
                            this.field1595[var26++] = var16[var15[(var27 >> 1 << 6) + (var28 >> 1)] & 0xFF];
                        }
                    }
                } else if (var11.field3863 == 128 && arg1 == 64) {
                    int var29 = 0;
                    for (int var30 = 0; var30 < arg1; var30++) {
                        for (int var31 = 0; var31 < arg1; var31++) {
                            this.field1595[var29++] = var16[var15[(var30 << 1 << 7) + (var31 << 1)] & 0xFF];
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

    @ObfuscatedName("dg.n()V")
    public void method2579() {
        this.field1595 = null;
    }

    @ObfuscatedName("dg.v(I)V")
    public void method2577(int arg0) {
        if (this.field1595 == null) {
            return;
        }
        if (this.field1583 == 1 || this.field1583 == 3) {
            if (Statics.field1597 == null || Statics.field1597.length < this.field1595.length) {
                Statics.field1597 = new int[this.field1595.length];
            }
            short var2;
            if (this.field1595.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1595.length;
            int var4 = arg0 * var2 * this.field1594;
            int var5 = var3 - 1;
            if (this.field1583 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1597[var6] = this.field1595[var7];
            }
            int[] var8 = this.field1595;
            this.field1595 = Statics.field1597;
            Statics.field1597 = var8;
        }
        if (this.field1583 != 2 && this.field1583 != 4) {
            return;
        }
        if (Statics.field1597 == null || Statics.field1597.length < this.field1595.length) {
            Statics.field1597 = new int[this.field1595.length];
        }
        short var9;
        if (this.field1595.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1595.length;
        int var11 = this.field1594 * arg0;
        int var12 = var9 - 1;
        if (this.field1583 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1597[var15] = this.field1595[var16];
            }
        }
        int[] var17 = this.field1595;
        this.field1595 = Statics.field1597;
        Statics.field1597 = var17;
    }
}
