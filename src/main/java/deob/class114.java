package deob;

@ObfuscatedName("ds")
public class class114 {

    @ObfuscatedName("ds.d")
    public int field1599 = class105.method2030(16);

    @ObfuscatedName("ds.z")
    public int field1598 = class105.method2030(24);

    @ObfuscatedName("ds.n")
    public int field1600 = class105.method2030(24);

    @ObfuscatedName("ds.r")
    public int field1597 = class105.method2030(24) + 1;

    @ObfuscatedName("ds.e")
    public int field1601 = class105.method2030(6) + 1;

    @ObfuscatedName("ds.y")
    public int field1602 = class105.method2030(8);

    @ObfuscatedName("ds.k")
    public int[] field1603;

    public class114() {
        int[] var1 = new int[this.field1601];
        for (int var2 = 0; var2 < this.field1601; var2++) {
            int var3 = 0;
            int var4 = class105.method2030(3);
            boolean var5 = class105.method2018() != 0;
            if (var5) {
                var3 = class105.method2030(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1603 = new int[this.field1601 * 8];
        for (int var6 = 0; var6 < this.field1601 * 8; var6++) {
            this.field1603[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class105.method2030(8);
        }
    }

    @ObfuscatedName("ds.d([FIZ)V")
    public void method2155(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1509[this.field1602].field1492;
        int var6 = this.field1600 - this.field1598;
        int var7 = var6 / this.field1597;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1509[this.field1602].method1987();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1601;
                        }
                        var11 /= this.field1601;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1603[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1597 * var10 + this.field1598;
                        class103 var17 = Statics.field1509[var15];
                        if (this.field1599 == 0) {
                            int var18 = this.field1597 / var17.field1492;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1988();
                                for (int var21 = 0; var21 < var17.field1492; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1597) {
                                float[] var23 = var17.method1988();
                                for (int var24 = 0; var24 < var17.field1492; var24++) {
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
