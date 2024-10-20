package deob;

@ObfuscatedName("di")
public class class128 extends class204 {

    @ObfuscatedName("di.i")
    public int field1760;

    @ObfuscatedName("di.w")
    public boolean field1757;

    @ObfuscatedName("di.t")
    public int[] field1756;

    @ObfuscatedName("di.d")
    public int[] field1763;

    @ObfuscatedName("di.z")
    public int[] field1764;

    @ObfuscatedName("di.k")
    public int[] field1765;

    @ObfuscatedName("di.c")
    public int field1766;

    @ObfuscatedName("di.o")
    public int field1767;

    @ObfuscatedName("di.l")
    public int[] field1762;

    @ObfuscatedName("di.f")
    public boolean field1769 = false;

    public class128(class185 arg0) {
        this.field1760 = arg0.method3241();
        this.field1757 = arg0.method3239() == 1;
        int var2 = arg0.method3239();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1756 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1756[var3] = arg0.method3241();
        }
        if (var2 > 1) {
            this.field1763 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1763[var4] = arg0.method3239();
            }
        }
        if (var2 > 1) {
            this.field1764 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1764[var5] = arg0.method3239();
            }
        }
        this.field1765 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1765[var6] = arg0.method3292();
        }
        this.field1766 = arg0.method3239();
        this.field1767 = arg0.method3239();
        this.field1762 = null;
    }

    @ObfuscatedName("di.s(DILir;)Z")
    public boolean method2509(double arg0, int arg1, class247 arg2) {
        for (int var5 = 0; var5 < this.field1756.length; var5++) {
            if (arg2.method4193(this.field1756[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1762 = new int[var6];
        for (int var7 = 0; var7 < this.field1756.length; var7++) {
            class309 var8 = Statics.method4174(arg2, this.field1756[var7]);
            var8.method5269();
            byte[] var9 = var8.field3891;
            int[] var10 = var8.field3890;
            int var11 = this.field1765[var7];
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
                var10[var17] = class134.method2664(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field1763[var7 - 1];
            }
            if (var18 == 0) {
                if (var8.field3889 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field1762[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field3889 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field1762[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field3889 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field1762[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
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

    @ObfuscatedName("di.g()V")
    public void method2513() {
        this.field1762 = null;
    }

    @ObfuscatedName("di.m(I)V")
    public void method2511(int arg0) {
        if (this.field1762 == null) {
            return;
        }
        if (this.field1766 == 1 || this.field1766 == 3) {
            if (Statics.field1759 == null || Statics.field1759.length < this.field1762.length) {
                Statics.field1759 = new int[this.field1762.length];
            }
            short var2;
            if (this.field1762.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1762.length;
            int var4 = arg0 * var2 * this.field1767;
            int var5 = var3 - 1;
            if (this.field1766 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1759[var6] = this.field1762[var7];
            }
            int[] var8 = this.field1762;
            this.field1762 = Statics.field1759;
            Statics.field1759 = var8;
        }
        if (this.field1766 != 2 && this.field1766 != 4) {
            return;
        }
        if (Statics.field1759 == null || Statics.field1759.length < this.field1762.length) {
            Statics.field1759 = new int[this.field1762.length];
        }
        short var9;
        if (this.field1762.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1762.length;
        int var11 = this.field1767 * arg0;
        int var12 = var9 - 1;
        if (this.field1766 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1759[var15] = this.field1762[var16];
            }
        }
        int[] var17 = this.field1762;
        this.field1762 = Statics.field1759;
        Statics.field1759 = var17;
    }
}
