package deob;

@ObfuscatedName("dp")
public class class130 extends class204 {

    @ObfuscatedName("dp.u")
    public int field1771;

    @ObfuscatedName("dp.z")
    public boolean field1762;

    @ObfuscatedName("dp.t")
    public int[] field1773;

    @ObfuscatedName("dp.f")
    public int[] field1769;

    @ObfuscatedName("dp.g")
    public int[] field1766;

    @ObfuscatedName("dp.j")
    public int[] field1770;

    @ObfuscatedName("dp.x")
    public int field1772;

    @ObfuscatedName("dp.c")
    public int field1768;

    @ObfuscatedName("dp.s")
    public int[] field1774;

    @ObfuscatedName("dp.n")
    public boolean field1775 = false;

    public class130(class185 arg0) {
        this.field1771 = arg0.method3194();
        this.field1762 = arg0.method2962() == 1;
        int var2 = arg0.method2962();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1773 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1773[var3] = arg0.method3194();
        }
        if (var2 > 1) {
            this.field1769 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1769[var4] = arg0.method2962();
            }
        }
        if (var2 > 1) {
            this.field1766 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1766[var5] = arg0.method2962();
            }
        }
        this.field1770 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1770[var6] = arg0.method2967();
        }
        this.field1772 = arg0.method2962();
        this.field1768 = arg0.method2962();
        this.field1774 = null;
    }

    @ObfuscatedName("dp.a(DILib;)Z")
    public boolean method2284(double arg0, int arg1, class247 arg2) {
        for (int var5 = 0; var5 < this.field1773.length; var5++) {
            if (arg2.method3970(this.field1773[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1774 = new int[var6];
        for (int var7 = 0; var7 < this.field1773.length; var7++) {
            int var8 = this.field1773[var7];
            byte[] var9 = arg2.method3902(var8);
            boolean var10;
            if (var9 == null) {
                var10 = false;
            } else {
                class300.method2143(var9);
                var10 = true;
            }
            class298 var11;
            if (var10) {
                var11 = class300.method2700();
            } else {
                var11 = null;
            }
            var11.method4781();
            byte[] var13 = var11.field3849;
            int[] var14 = var11.field3846;
            int var15 = this.field1770[var7];
            if ((var15 & 0xFF000000) == 16777216) {
            }
            if ((var15 & 0xFF000000) == 33554432) {
            }
            if ((var15 & 0xFF000000) == 50331648) {
                int var16 = var15 & 0xFF00FF;
                int var17 = var15 >> 8 & 0xFF;
                for (int var18 = 0; var18 < var14.length; var18++) {
                    int var19 = var14[var18];
                    if (var19 >> 8 == (var19 & 0xFFFF)) {
                        int var20 = var19 & 0xFF;
                        var14[var18] = var16 * var20 >> 8 & 0xFF00FF | var17 * var20 & 0xFF00;
                    }
                }
            }
            for (int var21 = 0; var21 < var14.length; var21++) {
                var14[var21] = class136.method2442(var14[var21], arg0);
            }
            int var22;
            if (var7 == 0) {
                var22 = 0;
            } else {
                var22 = this.field1769[var7 - 1];
            }
            if (var22 == 0) {
                if (var11.field3847 == arg1) {
                    for (int var23 = 0; var23 < var6; var23++) {
                        this.field1774[var23] = var14[var13[var23] & 0xFF];
                    }
                } else if (var11.field3847 == 64 && arg1 == 128) {
                    int var24 = 0;
                    for (int var25 = 0; var25 < arg1; var25++) {
                        for (int var26 = 0; var26 < arg1; var26++) {
                            this.field1774[var24++] = var14[var13[(var25 >> 1 << 6) + (var26 >> 1)] & 0xFF];
                        }
                    }
                } else if (var11.field3847 == 128 && arg1 == 64) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < arg1; var28++) {
                        for (int var29 = 0; var29 < arg1; var29++) {
                            this.field1774[var27++] = var14[var13[(var28 << 1 << 7) + (var29 << 1)] & 0xFF];
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
            if (var22 == 1) {
            }
            if (var22 == 2) {
            }
            if (var22 == 3) {
            }
        }
        return true;
    }

    @ObfuscatedName("dp.w()V")
    public void method2285() {
        this.field1774 = null;
    }

    @ObfuscatedName("dp.e(I)V")
    public void method2291(int arg0) {
        if (this.field1774 == null) {
            return;
        }
        if (this.field1772 == 1 || this.field1772 == 3) {
            if (Statics.field1776 == null || Statics.field1776.length < this.field1774.length) {
                Statics.field1776 = new int[this.field1774.length];
            }
            short var2;
            if (this.field1774.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1774.length;
            int var4 = arg0 * var2 * this.field1768;
            int var5 = var3 - 1;
            if (this.field1772 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1776[var6] = this.field1774[var7];
            }
            int[] var8 = this.field1774;
            this.field1774 = Statics.field1776;
            Statics.field1776 = var8;
        }
        if (this.field1772 != 2 && this.field1772 != 4) {
            return;
        }
        if (Statics.field1776 == null || Statics.field1776.length < this.field1774.length) {
            Statics.field1776 = new int[this.field1774.length];
        }
        short var9;
        if (this.field1774.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1774.length;
        int var11 = this.field1768 * arg0;
        int var12 = var9 - 1;
        if (this.field1772 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1776[var15] = this.field1774[var16];
            }
        }
        int[] var17 = this.field1774;
        this.field1774 = Statics.field1776;
        Statics.field1776 = var17;
    }
}
