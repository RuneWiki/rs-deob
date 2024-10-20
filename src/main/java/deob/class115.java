package deob;

@ObfuscatedName("dv")
public class class115 {

    @ObfuscatedName("dv.s")
    public int field1591 = class106.method2057(16);

    @ObfuscatedName("dv.g")
    public int field1587 = class106.method2057(24);

    @ObfuscatedName("dv.m")
    public int field1589 = class106.method2057(24);

    @ObfuscatedName("dv.h")
    public int field1590 = class106.method2057(24) + 1;

    @ObfuscatedName("dv.i")
    public int field1593 = class106.method2057(6) + 1;

    @ObfuscatedName("dv.w")
    public int field1592 = class106.method2057(8);

    @ObfuscatedName("dv.t")
    public int[] field1588;

    public class115() {
        int[] var1 = new int[this.field1593];
        for (int var2 = 0; var2 < this.field1593; var2++) {
            int var3 = 0;
            int var4 = class106.method2057(3);
            boolean var5 = class106.method2056() != 0;
            if (var5) {
                var3 = class106.method2057(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1588 = new int[this.field1593 * 8];
        for (int var6 = 0; var6 < this.field1593 * 8; var6++) {
            this.field1588[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class106.method2057(8);
        }
    }

    @ObfuscatedName("dv.s([FIZ)V")
    public void method2201(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1502[this.field1592].field1485;
        int var6 = this.field1589 - this.field1587;
        int var7 = var6 / this.field1590;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1502[this.field1592].method2023();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1593;
                        }
                        var11 /= this.field1593;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1588[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1590 * var10 + this.field1587;
                        class104 var17 = Statics.field1502[var15];
                        if (this.field1591 == 0) {
                            int var18 = this.field1590 / var17.field1485;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method2024();
                                for (int var21 = 0; var21 < var17.field1485; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1590) {
                                float[] var23 = var17.method2024();
                                for (int var24 = 0; var24 < var17.field1485; var24++) {
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
