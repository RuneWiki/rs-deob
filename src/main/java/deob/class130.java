package deob;

@ObfuscatedName("ds")
public class class130 extends class200 {

    @ObfuscatedName("ds.x")
    public int field1788;

    @ObfuscatedName("ds.f")
    public boolean field1784;

    @ObfuscatedName("ds.u")
    public int[] field1789;

    @ObfuscatedName("ds.t")
    public int[] field1787;

    @ObfuscatedName("ds.k")
    public int[] field1780;

    @ObfuscatedName("ds.n")
    public int[] field1785;

    @ObfuscatedName("ds.d")
    public int field1790;

    @ObfuscatedName("ds.o")
    public int field1791;

    @ObfuscatedName("ds.a")
    public int[] field1792;

    @ObfuscatedName("ds.q")
    public boolean field1793 = false;

    public class130(class181 arg0) {
        this.field1788 = arg0.method3081();
        this.field1784 = arg0.method2945() == 1;
        int var2 = arg0.method2945();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1789 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1789[var3] = arg0.method3081();
        }
        if (var2 > 1) {
            this.field1787 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1787[var4] = arg0.method2945();
            }
        }
        if (var2 > 1) {
            this.field1780 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1780[var5] = arg0.method2945();
            }
        }
        this.field1785 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1785[var6] = arg0.method2996();
        }
        this.field1790 = arg0.method2945();
        this.field1791 = arg0.method2945();
        this.field1792 = null;
    }

    @ObfuscatedName("ds.b(DILij;)Z")
    public boolean method2298(double arg0, int arg1, class243 arg2) {
        for (int var5 = 0; var5 < this.field1789.length; var5++) {
            if (arg2.method3825(this.field1789[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1792 = new int[var6];
        for (int var7 = 0; var7 < this.field1789.length; var7++) {
            class294 var8 = class296.method4118(arg2, this.field1789[var7]);
            var8.method4763();
            byte[] var9 = var8.field3833;
            int[] var10 = var8.field3827;
            int var11 = this.field1785[var7];
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
                var10[var17] = class136.method2470(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field1787[var7 - 1];
            }
            if (var18 == 0) {
                if (var8.field3828 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field1792[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field3828 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field1792[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field3828 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field1792[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
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

    @ObfuscatedName("ds.s()V")
    public void method2297() {
        this.field1792 = null;
    }

    @ObfuscatedName("ds.r(I)V")
    public void method2300(int arg0) {
        if (this.field1792 == null) {
            return;
        }
        if (this.field1790 == 1 || this.field1790 == 3) {
            if (Statics.field1794 == null || Statics.field1794.length < this.field1792.length) {
                Statics.field1794 = new int[this.field1792.length];
            }
            short var2;
            if (this.field1792.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1792.length;
            int var4 = arg0 * var2 * this.field1791;
            int var5 = var3 - 1;
            if (this.field1790 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1794[var6] = this.field1792[var7];
            }
            int[] var8 = this.field1792;
            this.field1792 = Statics.field1794;
            Statics.field1794 = var8;
        }
        if (this.field1790 != 2 && this.field1790 != 4) {
            return;
        }
        if (Statics.field1794 == null || Statics.field1794.length < this.field1792.length) {
            Statics.field1794 = new int[this.field1792.length];
        }
        short var9;
        if (this.field1792.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1792.length;
        int var11 = this.field1791 * arg0;
        int var12 = var9 - 1;
        if (this.field1790 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1794[var15] = this.field1792[var16];
            }
        }
        int[] var17 = this.field1792;
        this.field1792 = Statics.field1794;
        Statics.field1794 = var17;
    }
}
