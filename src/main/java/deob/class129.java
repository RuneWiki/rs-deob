package deob;

@ObfuscatedName("dd")
public class class129 extends class217 {

    @ObfuscatedName("dd.n")
    public int field1772;

    @ObfuscatedName("dd.l")
    public boolean field1777;

    @ObfuscatedName("dd.s")
    public int[] field1778;

    @ObfuscatedName("dd.y")
    public int[] field1779;

    @ObfuscatedName("dd.c")
    public int[] field1782;

    @ObfuscatedName("dd.h")
    public int[] field1781;

    @ObfuscatedName("dd.i")
    public int field1776;

    @ObfuscatedName("dd.o")
    public int field1783;

    @ObfuscatedName("dd.d")
    public int[] field1784;

    @ObfuscatedName("dd.r")
    public boolean field1785 = false;

    public class129(class195 arg0) {
        this.field1772 = arg0.method3310();
        this.field1777 = arg0.method3332() == 1;
        int var2 = arg0.method3332();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1778 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1778[var3] = arg0.method3310();
        }
        if (var2 > 1) {
            this.field1779 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1779[var4] = arg0.method3332();
            }
        }
        if (var2 > 1) {
            this.field1782 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1782[var5] = arg0.method3332();
            }
        }
        this.field1781 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1781[var6] = arg0.method3472();
        }
        this.field1776 = arg0.method3332();
        this.field1783 = arg0.method3332();
        this.field1784 = null;
    }

    @ObfuscatedName("dd.g(DILjr;)Z")
    public boolean method2564(double arg0, int arg1, class262 arg2) {
        for (int var5 = 0; var5 < this.field1778.length; var5++) {
            if (arg2.method4309(this.field1778[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1784 = new int[var6];
        for (int var7 = 0; var7 < this.field1778.length; var7++) {
            class331 var8 = class333.method5340(arg2, this.field1778[var7]);
            var8.method5447();
            byte[] var9 = var8.field3980;
            int[] var10 = var8.field3979;
            int var11 = this.field1781[var7];
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
                var10[var17] = class135.method2678(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field1779[var7 - 1];
            }
            if (var18 == 0) {
                if (var8.field3981 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field1784[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field3981 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field1784[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field3981 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field1784[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
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

    @ObfuscatedName("dd.e()V")
    public void method2566() {
        this.field1784 = null;
    }

    @ObfuscatedName("dd.b(I)V")
    public void method2565(int arg0) {
        if (this.field1784 == null) {
            return;
        }
        if (this.field1776 == 1 || this.field1776 == 3) {
            if (Statics.field1786 == null || Statics.field1786.length < this.field1784.length) {
                Statics.field1786 = new int[this.field1784.length];
            }
            short var2;
            if (this.field1784.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1784.length;
            int var4 = arg0 * var2 * this.field1783;
            int var5 = var3 - 1;
            if (this.field1776 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1786[var6] = this.field1784[var7];
            }
            int[] var8 = this.field1784;
            this.field1784 = Statics.field1786;
            Statics.field1786 = var8;
        }
        if (this.field1776 != 2 && this.field1776 != 4) {
            return;
        }
        if (Statics.field1786 == null || Statics.field1786.length < this.field1784.length) {
            Statics.field1786 = new int[this.field1784.length];
        }
        short var9;
        if (this.field1784.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1784.length;
        int var11 = this.field1783 * arg0;
        int var12 = var9 - 1;
        if (this.field1776 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1786[var15] = this.field1784[var16];
            }
        }
        int[] var17 = this.field1784;
        this.field1784 = Statics.field1786;
        Statics.field1786 = var17;
    }
}
