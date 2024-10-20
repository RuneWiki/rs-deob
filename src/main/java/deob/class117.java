package deob;

@ObfuscatedName("du")
public class class117 extends class205 {

    @ObfuscatedName("du.u")
    public int field1528;

    @ObfuscatedName("du.q")
    public boolean field1531;

    @ObfuscatedName("du.k")
    public int[] field1534;

    @ObfuscatedName("du.i")
    public int[] field1536;

    @ObfuscatedName("du.x")
    public int[] field1533;

    @ObfuscatedName("du.e")
    public int[] field1537;

    @ObfuscatedName("du.p")
    public int field1538;

    @ObfuscatedName("du.b")
    public int field1539;

    @ObfuscatedName("du.n")
    public int[] field1540;

    @ObfuscatedName("du.f")
    public boolean field1541 = false;

    public class117(class183 arg0) {
        this.field1528 = arg0.method3253();
        this.field1531 = arg0.method3247() == 1;
        int var2 = arg0.method3247();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1534 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1534[var3] = arg0.method3253();
        }
        if (var2 > 1) {
            this.field1536 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1536[var4] = arg0.method3247();
            }
        }
        if (var2 > 1) {
            this.field1533 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1533[var5] = arg0.method3247();
            }
        }
        this.field1537 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1537[var6] = arg0.method3374();
        }
        this.field1538 = arg0.method3247();
        this.field1539 = arg0.method3247();
        this.field1540 = null;
    }

    @ObfuscatedName("du.z(DILir;)Z")
    public boolean method2457(double arg0, int arg1, class248 arg2) {
        for (int var5 = 0; var5 < this.field1534.length; var5++) {
            if (arg2.method4248(this.field1534[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1540 = new int[var6];
        for (int var7 = 0; var7 < this.field1534.length; var7++) {
            class318 var8 = class320.method4220(arg2, this.field1534[var7]);
            var8.method5384();
            byte[] var9 = var8.field3786;
            int[] var10 = var8.field3780;
            int var11 = this.field1537[var7];
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
                var10[var17] = class123.method2588(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field1536[var7 - 1];
            }
            if (var18 == 0) {
                if (var8.field3781 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field1540[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field3781 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field1540[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field3781 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field1540[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
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

    @ObfuscatedName("du.w()V")
    public void method2452() {
        this.field1540 = null;
    }

    @ObfuscatedName("du.s(I)V")
    public void method2453(int arg0) {
        if (this.field1540 == null) {
            return;
        }
        if (this.field1538 == 1 || this.field1538 == 3) {
            if (Statics.field1542 == null || Statics.field1542.length < this.field1540.length) {
                Statics.field1542 = new int[this.field1540.length];
            }
            short var2;
            if (this.field1540.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1540.length;
            int var4 = arg0 * var2 * this.field1539;
            int var5 = var3 - 1;
            if (this.field1538 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1542[var6] = this.field1540[var7];
            }
            int[] var8 = this.field1540;
            this.field1540 = Statics.field1542;
            Statics.field1542 = var8;
        }
        if (this.field1538 != 2 && this.field1538 != 4) {
            return;
        }
        if (Statics.field1542 == null || Statics.field1542.length < this.field1540.length) {
            Statics.field1542 = new int[this.field1540.length];
        }
        short var9;
        if (this.field1540.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1540.length;
        int var11 = this.field1539 * arg0;
        int var12 = var9 - 1;
        if (this.field1538 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1542[var15] = this.field1540[var16];
            }
        }
        int[] var17 = this.field1540;
        this.field1540 = Statics.field1542;
        Statics.field1542 = var17;
    }
}
