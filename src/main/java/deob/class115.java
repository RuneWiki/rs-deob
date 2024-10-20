package deob;

@ObfuscatedName("dv")
public class class115 {

    @ObfuscatedName("dv.n")
    public int field1586 = class106.method1847(16);

    @ObfuscatedName("dv.v")
    public int field1587 = class106.method1847(24);

    @ObfuscatedName("dv.y")
    public int field1588 = class106.method1847(24);

    @ObfuscatedName("dv.r")
    public int field1585 = class106.method1847(24) + 1;

    @ObfuscatedName("dv.h")
    public int field1589 = class106.method1847(6) + 1;

    @ObfuscatedName("dv.d")
    public int field1590 = class106.method1847(8);

    @ObfuscatedName("dv.s")
    public int[] field1591;

    public class115() {
        int[] var1 = new int[this.field1589];
        for (int var2 = 0; var2 < this.field1589; var2++) {
            int var3 = 0;
            int var4 = class106.method1847(3);
            boolean var5 = class106.method1846() != 0;
            if (var5) {
                var3 = class106.method1847(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1591 = new int[this.field1589 * 8];
        for (int var6 = 0; var6 < this.field1589 * 8; var6++) {
            this.field1591[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class106.method1847(8);
        }
    }

    @ObfuscatedName("dv.n([FIZ)V")
    public void method1984(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1499[this.field1590].field1479;
        int var6 = this.field1588 - this.field1587;
        int var7 = var6 / this.field1585;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1499[this.field1590].method1823();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1589;
                        }
                        var11 /= this.field1589;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1591[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1585 * var10 + this.field1587;
                        class104 var17 = Statics.field1499[var15];
                        if (this.field1586 == 0) {
                            int var18 = this.field1585 / var17.field1479;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1820();
                                for (int var21 = 0; var21 < var17.field1479; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1585) {
                                float[] var23 = var17.method1820();
                                for (int var24 = 0; var24 < var17.field1479; var24++) {
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
