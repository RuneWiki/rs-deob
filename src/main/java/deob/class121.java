package deob;

@ObfuscatedName("dc")
public class class121 {

    @ObfuscatedName("dc.n")
    public int field1470 = class112.method2357(16);

    @ObfuscatedName("dc.v")
    public int field1469 = class112.method2357(24);

    @ObfuscatedName("dc.d")
    public int field1468 = class112.method2357(24);

    @ObfuscatedName("dc.c")
    public int field1473 = class112.method2357(24) + 1;

    @ObfuscatedName("dc.y")
    public int field1472 = class112.method2357(6) + 1;

    @ObfuscatedName("dc.h")
    public int field1471 = class112.method2357(8);

    @ObfuscatedName("dc.z")
    public int[] field1474;

    public class121() {
        int[] var1 = new int[this.field1472];
        for (int var2 = 0; var2 < this.field1472; var2++) {
            int var3 = 0;
            int var4 = class112.method2357(3);
            boolean var5 = class112.method2385() != 0;
            if (var5) {
                var3 = class112.method2357(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1474 = new int[this.field1472 * 8];
        for (int var6 = 0; var6 < this.field1472 * 8; var6++) {
            this.field1474[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class112.method2357(8);
        }
    }

    @ObfuscatedName("dc.n([FIZ)V")
    public void method2490(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1378[this.field1471].field1361;
        int var6 = this.field1468 - this.field1469;
        int var7 = var6 / this.field1473;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1378[this.field1471].method2326();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1472;
                        }
                        var11 /= this.field1472;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1474[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1473 * var10 + this.field1469;
                        class110 var17 = Statics.field1378[var15];
                        if (this.field1470 == 0) {
                            int var18 = this.field1473 / var17.field1361;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method2327();
                                for (int var21 = 0; var21 < var17.field1361; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1473) {
                                float[] var23 = var17.method2327();
                                for (int var24 = 0; var24 < var17.field1361; var24++) {
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
