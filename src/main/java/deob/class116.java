package deob;

@ObfuscatedName("df")
public class class116 {

    @ObfuscatedName("df.i")
    public int field1687 = class107.method1814(16);

    @ObfuscatedName("df.w")
    public int field1691 = class107.method1814(24);

    @ObfuscatedName("df.a")
    public int field1688 = class107.method1814(24);

    @ObfuscatedName("df.t")
    public int field1689 = class107.method1814(24) + 1;

    @ObfuscatedName("df.s")
    public int field1690 = class107.method1814(6) + 1;

    @ObfuscatedName("df.r")
    public int field1686 = class107.method1814(8);

    @ObfuscatedName("df.v")
    public int[] field1692;

    public class116() {
        int[] var1 = new int[this.field1690];
        for (int var2 = 0; var2 < this.field1690; var2++) {
            int var3 = 0;
            int var4 = class107.method1814(3);
            boolean var5 = class107.method1799() != 0;
            if (var5) {
                var3 = class107.method1814(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1692 = new int[this.field1690 * 8];
        for (int var6 = 0; var6 < this.field1690 * 8; var6++) {
            this.field1692[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class107.method1814(8);
        }
    }

    @ObfuscatedName("df.i([FIZ)V")
    public void method1929(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1614[this.field1686].field1586;
        int var6 = this.field1688 - this.field1691;
        int var7 = var6 / this.field1689;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1614[this.field1686].method1778();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1690;
                        }
                        var11 /= this.field1690;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1692[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1689 * var10 + this.field1691;
                        class105 var17 = Statics.field1614[var15];
                        if (this.field1687 == 0) {
                            int var18 = this.field1689 / var17.field1586;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1774();
                                for (int var21 = 0; var21 < var17.field1586; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1689) {
                                float[] var23 = var17.method1774();
                                for (int var24 = 0; var24 < var17.field1586; var24++) {
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
