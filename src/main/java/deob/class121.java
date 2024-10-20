package deob;

@ObfuscatedName("dy")
public class class121 {

    @ObfuscatedName("dy.h")
    public int field1469 = class112.method2252(16);

    @ObfuscatedName("dy.v")
    public int field1467 = class112.method2252(24);

    @ObfuscatedName("dy.x")
    public int field1468 = class112.method2252(24);

    @ObfuscatedName("dy.w")
    public int field1471 = class112.method2252(24) + 1;

    @ObfuscatedName("dy.t")
    public int field1470 = class112.method2252(6) + 1;

    @ObfuscatedName("dy.j")
    public int field1466 = class112.method2252(8);

    @ObfuscatedName("dy.n")
    public int[] field1472;

    public class121() {
        int[] var1 = new int[this.field1470];
        for (int var2 = 0; var2 < this.field1470; var2++) {
            int var3 = 0;
            int var4 = class112.method2252(3);
            boolean var5 = class112.method2251() != 0;
            if (var5) {
                var3 = class112.method2252(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1472 = new int[this.field1470 * 8];
        for (int var6 = 0; var6 < this.field1470 * 8; var6++) {
            this.field1472[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class112.method2252(8);
        }
    }

    @ObfuscatedName("dy.h([FIZ)V")
    public void method2394(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1374[this.field1466].field1364;
        int var6 = this.field1468 - this.field1467;
        int var7 = var6 / this.field1471;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1374[this.field1466].method2232();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1470;
                        }
                        var11 /= this.field1470;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1472[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1471 * var10 + this.field1467;
                        class110 var17 = Statics.field1374[var15];
                        if (this.field1469 == 0) {
                            int var18 = this.field1471 / var17.field1364;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method2230();
                                for (int var21 = 0; var21 < var17.field1364; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1471) {
                                float[] var23 = var17.method2230();
                                for (int var24 = 0; var24 < var17.field1364; var24++) {
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
