package deob;

@ObfuscatedName("do")
public class class121 {

    @ObfuscatedName("do.z")
    public int field1481 = class112.method2272(16);

    @ObfuscatedName("do.k")
    public int field1479 = class112.method2272(24);

    @ObfuscatedName("do.s")
    public int field1480 = class112.method2272(24);

    @ObfuscatedName("do.t")
    public int field1482 = class112.method2272(24) + 1;

    @ObfuscatedName("do.i")
    public int field1478 = class112.method2272(6) + 1;

    @ObfuscatedName("do.o")
    public int field1483 = class112.method2272(8);

    @ObfuscatedName("do.x")
    public int[] field1484;

    public class121() {
        int[] var1 = new int[this.field1478];
        for (int var2 = 0; var2 < this.field1478; var2++) {
            int var3 = 0;
            int var4 = class112.method2272(3);
            boolean var5 = class112.method2279() != 0;
            if (var5) {
                var3 = class112.method2272(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1484 = new int[this.field1478 * 8];
        for (int var6 = 0; var6 < this.field1478 * 8; var6++) {
            this.field1484[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class112.method2272(8);
        }
    }

    @ObfuscatedName("do.z([FIZ)V")
    public void method2404(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1403[this.field1483].field1371;
        int var6 = this.field1480 - this.field1479;
        int var7 = var6 / this.field1482;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1403[this.field1483].method2240();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1478;
                        }
                        var11 /= this.field1478;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1484[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1482 * var10 + this.field1479;
                        class110 var17 = Statics.field1403[var15];
                        if (this.field1481 == 0) {
                            int var18 = this.field1482 / var17.field1371;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method2248();
                                for (int var21 = 0; var21 < var17.field1371; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1482) {
                                float[] var23 = var17.method2248();
                                for (int var24 = 0; var24 < var17.field1371; var24++) {
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
