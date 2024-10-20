package deob;

@ObfuscatedName("du")
public class class130 extends class200 {

    @ObfuscatedName("du.v")
    public int field1784;

    @ObfuscatedName("du.m")
    public boolean field1785;

    @ObfuscatedName("du.b")
    public int[] field1786;

    @ObfuscatedName("du.t")
    public int[] field1789;

    @ObfuscatedName("du.p")
    public int[] field1788;

    @ObfuscatedName("du.r")
    public int[] field1791;

    @ObfuscatedName("du.l")
    public int field1790;

    @ObfuscatedName("du.u")
    public int field1780;

    @ObfuscatedName("du.n")
    public int[] field1792;

    @ObfuscatedName("du.c")
    public boolean field1793 = false;

    public class130(class181 arg0) {
        this.field1784 = arg0.method3179();
        this.field1785 = arg0.method3204() == 1;
        int var2 = arg0.method3204();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1786 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1786[var3] = arg0.method3179();
        }
        if (var2 > 1) {
            this.field1789 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1789[var4] = arg0.method3204();
            }
        }
        if (var2 > 1) {
            this.field1788 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1788[var5] = arg0.method3204();
            }
        }
        this.field1791 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1791[var6] = arg0.method3041();
        }
        this.field1790 = arg0.method3204();
        this.field1780 = arg0.method3204();
        this.field1792 = null;
    }

    @ObfuscatedName("du.d(DILid;)Z")
    public boolean method2392(double arg0, int arg1, class243 arg2) {
        for (int var5 = 0; var5 < this.field1786.length; var5++) {
            if (arg2.method3943(this.field1786[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1792 = new int[var6];
        for (int var7 = 0; var7 < this.field1786.length; var7++) {
            int var8 = this.field1786[var7];
            class294 var9;
            if (class296.method3784(arg2, var8)) {
                var9 = class296.method4133();
            } else {
                var9 = null;
            }
            var9.method4874();
            byte[] var11 = var9.field3826;
            int[] var12 = var9.field3829;
            int var13 = this.field1791[var7];
            if ((var13 & 0xFF000000) == 16777216) {
            }
            if ((var13 & 0xFF000000) == 33554432) {
            }
            if ((var13 & 0xFF000000) == 50331648) {
                int var14 = var13 & 0xFF00FF;
                int var15 = var13 >> 8 & 0xFF;
                for (int var16 = 0; var16 < var12.length; var16++) {
                    int var17 = var12[var16];
                    if (var17 >> 8 == (var17 & 0xFFFF)) {
                        int var18 = var17 & 0xFF;
                        var12[var16] = var14 * var18 >> 8 & 0xFF00FF | var15 * var18 & 0xFF00;
                    }
                }
            }
            for (int var19 = 0; var19 < var12.length; var19++) {
                var12[var19] = class136.method2575(var12[var19], arg0);
            }
            int var20;
            if (var7 == 0) {
                var20 = 0;
            } else {
                var20 = this.field1789[var7 - 1];
            }
            if (var20 == 0) {
                if (var9.field3827 == arg1) {
                    for (int var21 = 0; var21 < var6; var21++) {
                        this.field1792[var21] = var12[var11[var21] & 0xFF];
                    }
                } else if (var9.field3827 == 64 && arg1 == 128) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < arg1; var23++) {
                        for (int var24 = 0; var24 < arg1; var24++) {
                            this.field1792[var22++] = var12[var11[(var23 >> 1 << 6) + (var24 >> 1)] & 0xFF];
                        }
                    }
                } else if (var9.field3827 == 128 && arg1 == 64) {
                    int var25 = 0;
                    for (int var26 = 0; var26 < arg1; var26++) {
                        for (int var27 = 0; var27 < arg1; var27++) {
                            this.field1792[var25++] = var12[var11[(var26 << 1 << 7) + (var27 << 1)] & 0xFF];
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
            if (var20 == 1) {
            }
            if (var20 == 2) {
            }
            if (var20 == 3) {
            }
        }
        return true;
    }

    @ObfuscatedName("du.x()V")
    public void method2390() {
        this.field1792 = null;
    }

    @ObfuscatedName("du.k(I)V")
    public void method2391(int arg0) {
        if (this.field1792 == null) {
            return;
        }
        if (this.field1790 == 1 || this.field1790 == 3) {
            if (Statics.field1783 == null || Statics.field1783.length < this.field1792.length) {
                Statics.field1783 = new int[this.field1792.length];
            }
            short var2;
            if (this.field1792.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1792.length;
            int var4 = arg0 * var2 * this.field1780;
            int var5 = var3 - 1;
            if (this.field1790 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1783[var6] = this.field1792[var7];
            }
            int[] var8 = this.field1792;
            this.field1792 = Statics.field1783;
            Statics.field1783 = var8;
        }
        if (this.field1790 != 2 && this.field1790 != 4) {
            return;
        }
        if (Statics.field1783 == null || Statics.field1783.length < this.field1792.length) {
            Statics.field1783 = new int[this.field1792.length];
        }
        short var9;
        if (this.field1792.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1792.length;
        int var11 = this.field1780 * arg0;
        int var12 = var9 - 1;
        if (this.field1790 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1783[var15] = this.field1792[var16];
            }
        }
        int[] var17 = this.field1792;
        this.field1792 = Statics.field1783;
        Statics.field1783 = var17;
    }
}
