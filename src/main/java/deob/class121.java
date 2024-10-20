package deob;

@ObfuscatedName("de")
public class class121 {

    @ObfuscatedName("de.m")
    public int field1483 = class112.method2265(16);

    @ObfuscatedName("de.o")
    public int field1479 = class112.method2265(24);

    @ObfuscatedName("de.q")
    public int field1478 = class112.method2265(24);

    @ObfuscatedName("de.j")
    public int field1480 = class112.method2265(24) + 1;

    @ObfuscatedName("de.p")
    public int field1482 = class112.method2265(6) + 1;

    @ObfuscatedName("de.g")
    public int field1481 = class112.method2265(8);

    @ObfuscatedName("de.n")
    public int[] field1484;

    public class121() {
        int[] var1 = new int[this.field1482];
        for (int var2 = 0; var2 < this.field1482; var2++) {
            int var3 = 0;
            int var4 = class112.method2265(3);
            boolean var5 = class112.method2264() != 0;
            if (var5) {
                var3 = class112.method2265(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1484 = new int[this.field1482 * 8];
        for (int var6 = 0; var6 < this.field1482 * 8; var6++) {
            this.field1484[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class112.method2265(8);
        }
    }

    @ObfuscatedName("de.m([FIZ)V")
    public void method2399(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1391[this.field1481].field1376;
        int var6 = this.field1478 - this.field1479;
        int var7 = var6 / this.field1480;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1391[this.field1481].method2230();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1482;
                        }
                        var11 /= this.field1482;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1484[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1480 * var10 + this.field1479;
                        class110 var17 = Statics.field1391[var15];
                        if (this.field1483 == 0) {
                            int var18 = this.field1480 / var17.field1376;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method2234();
                                for (int var21 = 0; var21 < var17.field1376; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1480) {
                                float[] var23 = var17.method2234();
                                for (int var24 = 0; var24 < var17.field1376; var24++) {
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
