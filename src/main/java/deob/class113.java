package deob;

@ObfuscatedName("dt")
public class class113 {

    @ObfuscatedName("dt.b")
    public int field1562 = class104.method1992(16);

    @ObfuscatedName("dt.q")
    public int field1558 = class104.method1992(24);

    @ObfuscatedName("dt.o")
    public int field1559 = class104.method1992(24);

    @ObfuscatedName("dt.p")
    public int field1560 = class104.method1992(24) + 1;

    @ObfuscatedName("dt.a")
    public int field1561 = class104.method1992(6) + 1;

    @ObfuscatedName("dt.h")
    public int field1563 = class104.method1992(8);

    @ObfuscatedName("dt.l")
    public int[] field1557;

    public class113() {
        int[] var1 = new int[this.field1561];
        for (int var2 = 0; var2 < this.field1561; var2++) {
            int var3 = 0;
            int var4 = class104.method1992(3);
            boolean var5 = class104.method1991() != 0;
            if (var5) {
                var3 = class104.method1992(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1557 = new int[this.field1561 * 8];
        for (int var6 = 0; var6 < this.field1561 * 8; var6++) {
            this.field1557[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class104.method1992(8);
        }
    }

    @ObfuscatedName("dt.b([FIZ)V")
    public void method2119(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1488[this.field1563].field1452;
        int var6 = this.field1559 - this.field1558;
        int var7 = var6 / this.field1560;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1488[this.field1563].method1962();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1561;
                        }
                        var11 /= this.field1561;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1557[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1560 * var10 + this.field1558;
                        class102 var17 = Statics.field1488[var15];
                        if (this.field1562 == 0) {
                            int var18 = this.field1560 / var17.field1452;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1963();
                                for (int var21 = 0; var21 < var17.field1452; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1560) {
                                float[] var23 = var17.method1963();
                                for (int var24 = 0; var24 < var17.field1452; var24++) {
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
