package deob;

@ObfuscatedName("dq")
public class class125 extends class188 {

    @ObfuscatedName("dq.p")
    public int field1595;

    @ObfuscatedName("dq.b")
    public boolean field1603;

    @ObfuscatedName("dq.e")
    public int[] field1607;

    @ObfuscatedName("dq.x")
    public int[] field1599;

    @ObfuscatedName("dq.a")
    public int[] field1597;

    @ObfuscatedName("dq.d")
    public int[] field1604;

    @ObfuscatedName("dq.c")
    public int field1605;

    @ObfuscatedName("dq.o")
    public int field1606;

    @ObfuscatedName("dq.v")
    public int[] field1600;

    @ObfuscatedName("dq.k")
    public boolean field1608 = false;

    public class125(class300 arg0) {
        this.field1595 = arg0.method5112();
        this.field1603 = arg0.method5110() == 1;
        int var2 = arg0.method5110();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1607 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1607[var3] = arg0.method5112();
        }
        if (var2 > 1) {
            this.field1599 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1599[var4] = arg0.method5110();
            }
        }
        if (var2 > 1) {
            this.field1597 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1597[var5] = arg0.method5110();
            }
        }
        this.field1604 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1604[var6] = arg0.method5192();
        }
        this.field1605 = arg0.method5110();
        this.field1606 = arg0.method5110();
        this.field1600 = null;
    }

    @ObfuscatedName("dq.f(DILhz;)Z")
    public boolean method2620(double arg0, int arg1, class234 arg2) {
        for (int var5 = 0; var5 < this.field1607.length; var5++) {
            if (arg2.method3761(this.field1607[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1600 = new int[var6];
        for (int var7 = 0; var7 < this.field1607.length; var7++) {
            class324 var8 = class326.method1010(arg2, this.field1607[var7]);
            var8.method5634();
            byte[] var9 = var8.field3858;
            int[] var10 = var8.field3856;
            int var11 = this.field1604[var7];
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
                var10[var17] = class131.method2748(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field1599[var7 - 1];
            }
            if (var18 == 0) {
                if (var8.field3860 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field1600[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field3860 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field1600[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field3860 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field1600[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
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

    @ObfuscatedName("dq.i()V")
    public void method2621() {
        this.field1600 = null;
    }

    @ObfuscatedName("dq.y(I)V")
    public void method2622(int arg0) {
        if (this.field1600 == null) {
            return;
        }
        if (this.field1605 == 1 || this.field1605 == 3) {
            if (Statics.field1609 == null || Statics.field1609.length < this.field1600.length) {
                Statics.field1609 = new int[this.field1600.length];
            }
            short var2;
            if (this.field1600.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1600.length;
            int var4 = arg0 * var2 * this.field1606;
            int var5 = var3 - 1;
            if (this.field1605 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1609[var6] = this.field1600[var7];
            }
            int[] var8 = this.field1600;
            this.field1600 = Statics.field1609;
            Statics.field1609 = var8;
        }
        if (this.field1605 != 2 && this.field1605 != 4) {
            return;
        }
        if (Statics.field1609 == null || Statics.field1609.length < this.field1600.length) {
            Statics.field1609 = new int[this.field1600.length];
        }
        short var9;
        if (this.field1600.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1600.length;
        int var11 = this.field1606 * arg0;
        int var12 = var9 - 1;
        if (this.field1605 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1609[var15] = this.field1600[var16];
            }
        }
        int[] var17 = this.field1600;
        this.field1600 = Statics.field1609;
        Statics.field1609 = var17;
    }
}
