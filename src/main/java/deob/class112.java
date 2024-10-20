package deob;

@ObfuscatedName("dc")
public class class112 {

    @ObfuscatedName("dc.c")
    public int field1439 = class103.method2222(16);

    @ObfuscatedName("dc.t")
    public int field1438 = class103.method2222(24);

    @ObfuscatedName("dc.o")
    public int field1441 = class103.method2222(24);

    @ObfuscatedName("dc.e")
    public int field1440 = class103.method2222(24) + 1;

    @ObfuscatedName("dc.i")
    public int field1437 = class103.method2222(6) + 1;

    @ObfuscatedName("dc.g")
    public int field1442 = class103.method2222(8);

    @ObfuscatedName("dc.d")
    public int[] field1443;

    public class112() {
        int[] var1 = new int[this.field1437];
        for (int var2 = 0; var2 < this.field1437; var2++) {
            int var3 = 0;
            int var4 = class103.method2222(3);
            boolean var5 = class103.method2221() != 0;
            if (var5) {
                var3 = class103.method2222(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1443 = new int[this.field1437 * 8];
        for (int var6 = 0; var6 < this.field1437 * 8; var6++) {
            this.field1443[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class103.method2222(8);
        }
    }

    @ObfuscatedName("dc.c([FIZ)V")
    public void method2365(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1353[this.field1442].field1332;
        int var6 = this.field1441 - this.field1438;
        int var7 = var6 / this.field1440;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1353[this.field1442].method2198();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1437;
                        }
                        var11 /= this.field1437;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1443[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1440 * var10 + this.field1438;
                        class101 var17 = Statics.field1353[var15];
                        if (this.field1439 == 0) {
                            int var18 = this.field1440 / var17.field1332;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method2197();
                                for (int var21 = 0; var21 < var17.field1332; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1440) {
                                float[] var23 = var17.method2197();
                                for (int var24 = 0; var24 < var17.field1332; var24++) {
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
