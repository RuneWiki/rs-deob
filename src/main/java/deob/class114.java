package deob;

@ObfuscatedName("df")
public class class114 {

    @ObfuscatedName("df.d")
    public int field1664 = class105.method1864(16);

    @ObfuscatedName("df.k")
    public int field1662 = class105.method1864(24);

    @ObfuscatedName("df.e")
    public int field1666 = class105.method1864(24);

    @ObfuscatedName("df.p")
    public int field1663 = class105.method1864(24) + 1;

    @ObfuscatedName("df.q")
    public int field1665 = class105.method1864(6) + 1;

    @ObfuscatedName("df.s")
    public int field1667 = class105.method1864(8);

    @ObfuscatedName("df.r")
    public int[] field1668;

    public class114() {
        int[] var1 = new int[this.field1665];
        for (int var2 = 0; var2 < this.field1665; var2++) {
            int var3 = 0;
            int var4 = class105.method1864(3);
            boolean var5 = class105.method1863() != 0;
            if (var5) {
                var3 = class105.method1864(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1668 = new int[this.field1665 * 8];
        for (int var6 = 0; var6 < this.field1665 * 8; var6++) {
            this.field1668[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class105.method1864(8);
        }
    }

    @ObfuscatedName("df.d([FIZ)V")
    public void method1999(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1573[this.field1667].field1556;
        int var6 = this.field1666 - this.field1662;
        int var7 = var6 / this.field1663;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1573[this.field1667].method1836();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1665;
                        }
                        var11 /= this.field1665;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1668[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1663 * var10 + this.field1662;
                        class103 var17 = Statics.field1573[var15];
                        if (this.field1664 == 0) {
                            int var18 = this.field1663 / var17.field1556;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1837();
                                for (int var21 = 0; var21 < var17.field1556; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1663) {
                                float[] var23 = var17.method1837();
                                for (int var24 = 0; var24 < var17.field1556; var24++) {
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
