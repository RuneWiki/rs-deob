package deob;

@ObfuscatedName("dg")
public class class115 {

    @ObfuscatedName("dg.i")
    public int field1688 = class106.method1800(16);

    @ObfuscatedName("dg.j")
    public int field1684 = class106.method1800(24);

    @ObfuscatedName("dg.a")
    public int field1685 = class106.method1800(24);

    @ObfuscatedName("dg.r")
    public int field1686 = class106.method1800(24) + 1;

    @ObfuscatedName("dg.o")
    public int field1687 = class106.method1800(6) + 1;

    @ObfuscatedName("dg.n")
    public int field1689 = class106.method1800(8);

    @ObfuscatedName("dg.q")
    public int[] field1683;

    public class115() {
        int[] var1 = new int[this.field1687];
        for (int var2 = 0; var2 < this.field1687; var2++) {
            int var3 = 0;
            int var4 = class106.method1800(3);
            boolean var5 = class106.method1819() != 0;
            if (var5) {
                var3 = class106.method1800(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1683 = new int[this.field1687 * 8];
        for (int var6 = 0; var6 < this.field1687 * 8; var6++) {
            this.field1683[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class106.method1800(8);
        }
    }

    @ObfuscatedName("dg.i([FIZ)V")
    public void method1937(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1605[this.field1689].field1577;
        int var6 = this.field1685 - this.field1684;
        int var7 = var6 / this.field1686;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1605[this.field1689].method1777();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1687;
                        }
                        var11 /= this.field1687;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1683[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1686 * var10 + this.field1684;
                        class104 var17 = Statics.field1605[var15];
                        if (this.field1688 == 0) {
                            int var18 = this.field1686 / var17.field1577;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1774();
                                for (int var21 = 0; var21 < var17.field1577; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1686) {
                                float[] var23 = var17.method1774();
                                for (int var24 = 0; var24 < var17.field1577; var24++) {
                                    arg0[var16 + var22] += var23[var24];
                                    var22++;
                                }
                            }
                        }
                    }
                    var10++;
                    if (var10 >= var7) {
                        break;
                    }
                }
            }
        }
    }
}
