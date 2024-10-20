package deob;

@ObfuscatedName("da")
public class class128 extends class213 {

    @ObfuscatedName("da.a")
    public int field1755;

    @ObfuscatedName("da.h")
    public boolean field1757;

    @ObfuscatedName("da.l")
    public int[] field1760;

    @ObfuscatedName("da.y")
    public int[] field1761;

    @ObfuscatedName("da.g")
    public int[] field1753;

    @ObfuscatedName("da.c")
    public int[] field1762;

    @ObfuscatedName("da.u")
    public int field1763;

    @ObfuscatedName("da.r")
    public int field1764;

    @ObfuscatedName("da.d")
    public int[] field1765;

    @ObfuscatedName("da.v")
    public boolean field1766 = false;

    public class128(class194 arg0) {
        this.field1755 = arg0.method3249();
        this.field1757 = arg0.method3247() == 1;
        int var2 = arg0.method3247();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1760 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1760[var3] = arg0.method3249();
        }
        if (var2 > 1) {
            this.field1761 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1761[var4] = arg0.method3247();
            }
        }
        if (var2 > 1) {
            this.field1753 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1753[var5] = arg0.method3247();
            }
        }
        this.field1762 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1762[var6] = arg0.method3261();
        }
        this.field1763 = arg0.method3247();
        this.field1764 = arg0.method3247();
        this.field1765 = null;
    }

    @ObfuscatedName("da.b(DILie;)Z")
    public boolean method2480(double arg0, int arg1, class256 arg2) {
        for (int var5 = 0; var5 < this.field1760.length; var5++) {
            if (arg2.method4185(this.field1760[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1765 = new int[var6];
        for (int var7 = 0; var7 < this.field1760.length; var7++) {
            class322 var8 = class324.method2103(arg2, this.field1760[var7]);
            var8.method5310();
            byte[] var9 = var8.field3894;
            int[] var10 = var8.field3899;
            int var11 = this.field1762[var7];
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
                var10[var17] = class134.method2600(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field1761[var7 - 1];
            }
            if (var18 == 0) {
                if (var8.field3895 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field1765[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field3895 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field1765[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field3895 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field1765[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
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

    @ObfuscatedName("da.q()V")
    public void method2475() {
        this.field1765 = null;
    }

    @ObfuscatedName("da.o(I)V")
    public void method2476(int arg0) {
        if (this.field1765 == null) {
            return;
        }
        if (this.field1763 == 1 || this.field1763 == 3) {
            if (Statics.field1767 == null || Statics.field1767.length < this.field1765.length) {
                Statics.field1767 = new int[this.field1765.length];
            }
            short var2;
            if (this.field1765.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1765.length;
            int var4 = arg0 * var2 * this.field1764;
            int var5 = var3 - 1;
            if (this.field1763 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1767[var6] = this.field1765[var7];
            }
            int[] var8 = this.field1765;
            this.field1765 = Statics.field1767;
            Statics.field1767 = var8;
        }
        if (this.field1763 != 2 && this.field1763 != 4) {
            return;
        }
        if (Statics.field1767 == null || Statics.field1767.length < this.field1765.length) {
            Statics.field1767 = new int[this.field1765.length];
        }
        short var9;
        if (this.field1765.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1765.length;
        int var11 = this.field1764 * arg0;
        int var12 = var9 - 1;
        if (this.field1763 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1767[var15] = this.field1765[var16];
            }
        }
        int[] var17 = this.field1765;
        this.field1765 = Statics.field1767;
        Statics.field1767 = var17;
    }
}
