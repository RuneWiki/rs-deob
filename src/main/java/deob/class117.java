package deob;

@ObfuscatedName("dh")
public class class117 {

    @ObfuscatedName("dh.j")
    public int field1683 = class108.method1808(16);

    @ObfuscatedName("dh.h")
    public int field1689 = class108.method1808(24);

    @ObfuscatedName("dh.f")
    public int field1685 = class108.method1808(24);

    @ObfuscatedName("dh.p")
    public int field1686 = class108.method1808(24) + 1;

    @ObfuscatedName("dh.x")
    public int field1684 = class108.method1808(6) + 1;

    @ObfuscatedName("dh.g")
    public int field1688 = class108.method1808(8);

    @ObfuscatedName("dh.c")
    public int[] field1687;

    public class117() {
        int[] var1 = new int[this.field1684];
        for (int var2 = 0; var2 < this.field1684; var2++) {
            int var3 = 0;
            int var4 = class108.method1808(3);
            boolean var5 = class108.method1807() != 0;
            if (var5) {
                var3 = class108.method1808(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1687 = new int[this.field1684 * 8];
        for (int var6 = 0; var6 < this.field1684 * 8; var6++) {
            this.field1687[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class108.method1808(8);
        }
    }

    @ObfuscatedName("dh.j([FIZ)V")
    public void method1943(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1592[this.field1688].field1574;
        int var6 = this.field1685 - this.field1689;
        int var7 = var6 / this.field1686;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1592[this.field1688].method1781();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1684;
                        }
                        var11 /= this.field1684;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1687[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1686 * var10 + this.field1689;
                        class106 var17 = Statics.field1592[var15];
                        if (this.field1683 == 0) {
                            int var18 = this.field1686 / var17.field1574;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1790();
                                for (int var21 = 0; var21 < var17.field1574; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1686) {
                                float[] var23 = var17.method1790();
                                for (int var24 = 0; var24 < var17.field1574; var24++) {
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
