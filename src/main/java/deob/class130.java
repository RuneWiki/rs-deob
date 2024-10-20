package deob;

@ObfuscatedName("dz")
public class class130 extends class200 {

    @ObfuscatedName("dz.v")
    public int field1792;

    @ObfuscatedName("dz.x")
    public boolean field1797;

    @ObfuscatedName("dz.e")
    public int[] field1794;

    @ObfuscatedName("dz.l")
    public int[] field1790;

    @ObfuscatedName("dz.b")
    public int[] field1796;

    @ObfuscatedName("dz.n")
    public int[] field1788;

    @ObfuscatedName("dz.c")
    public int field1793;

    @ObfuscatedName("dz.a")
    public int field1795;

    @ObfuscatedName("dz.y")
    public int[] field1798;

    @ObfuscatedName("dz.w")
    public boolean field1801 = false;

    public class130(class181 arg0) {
        this.field1792 = arg0.method3009();
        this.field1797 = arg0.method3012() == 1;
        int var2 = arg0.method3012();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1794 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1794[var3] = arg0.method3009();
        }
        if (var2 > 1) {
            this.field1790 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1790[var4] = arg0.method3012();
            }
        }
        if (var2 > 1) {
            this.field1796 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1796[var5] = arg0.method3012();
            }
        }
        this.field1788 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1788[var6] = arg0.method3017();
        }
        this.field1793 = arg0.method3012();
        this.field1795 = arg0.method3012();
        this.field1798 = null;
    }

    @ObfuscatedName("dz.m(DILik;)Z")
    public boolean method2370(double arg0, int arg1, class243 arg2) {
        for (int var5 = 0; var5 < this.field1794.length; var5++) {
            if (arg2.method3938(this.field1794[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1798 = new int[var6];
        for (int var7 = 0; var7 < this.field1794.length; var7++) {
            class294 var8 = class296.method3243(arg2, this.field1794[var7]);
            var8.method4861();
            byte[] var9 = var8.field3838;
            int[] var10 = var8.field3832;
            int var11 = this.field1788[var7];
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
                var10[var17] = class136.method2490(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field1790[var7 - 1];
            }
            if (var18 == 0) {
                if (var8.field3834 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field1798[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field3834 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field1798[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field3834 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field1798[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
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

    @ObfuscatedName("dz.p()V")
    public void method2369() {
        this.field1798 = null;
    }

    @ObfuscatedName("dz.i(I)V")
    public void method2371(int arg0) {
        if (this.field1798 == null) {
            return;
        }
        if (this.field1793 == 1 || this.field1793 == 3) {
            if (Statics.field1802 == null || Statics.field1802.length < this.field1798.length) {
                Statics.field1802 = new int[this.field1798.length];
            }
            short var2;
            if (this.field1798.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1798.length;
            int var4 = arg0 * var2 * this.field1795;
            int var5 = var3 - 1;
            if (this.field1793 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1802[var6] = this.field1798[var7];
            }
            int[] var8 = this.field1798;
            this.field1798 = Statics.field1802;
            Statics.field1802 = var8;
        }
        if (this.field1793 != 2 && this.field1793 != 4) {
            return;
        }
        if (Statics.field1802 == null || Statics.field1802.length < this.field1798.length) {
            Statics.field1802 = new int[this.field1798.length];
        }
        short var9;
        if (this.field1798.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1798.length;
        int var11 = this.field1795 * arg0;
        int var12 = var9 - 1;
        if (this.field1793 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1802[var15] = this.field1798[var16];
            }
        }
        int[] var17 = this.field1798;
        this.field1798 = Statics.field1802;
        Statics.field1802 = var17;
    }
}
