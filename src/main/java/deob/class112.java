package deob;

@ObfuscatedName("dc")
public class class112 {

    @ObfuscatedName("dc.s")
    public int field1433 = class103.method2171(16);

    @ObfuscatedName("dc.j")
    public int field1435 = class103.method2171(24);

    @ObfuscatedName("dc.i")
    public int field1432 = class103.method2171(24);

    @ObfuscatedName("dc.k")
    public int field1434 = class103.method2171(24) + 1;

    @ObfuscatedName("dc.u")
    public int field1431 = class103.method2171(6) + 1;

    @ObfuscatedName("dc.n")
    public int field1436 = class103.method2171(8);

    @ObfuscatedName("dc.t")
    public int[] field1437;

    public class112() {
        int[] var1 = new int[this.field1431];
        for (int var2 = 0; var2 < this.field1431; var2++) {
            int var3 = 0;
            int var4 = class103.method2171(3);
            boolean var5 = class103.method2153() != 0;
            if (var5) {
                var3 = class103.method2171(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1437 = new int[this.field1431 * 8];
        for (int var6 = 0; var6 < this.field1431 * 8; var6++) {
            this.field1437[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class103.method2171(8);
        }
    }

    @ObfuscatedName("dc.s([FIZ)V")
    public void method2294(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1340[this.field1436].field1320;
        int var6 = this.field1432 - this.field1435;
        int var7 = var6 / this.field1434;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1340[this.field1436].method2123();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1431;
                        }
                        var11 /= this.field1431;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1437[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1434 * var10 + this.field1435;
                        class101 var17 = Statics.field1340[var15];
                        if (this.field1433 == 0) {
                            int var18 = this.field1434 / var17.field1320;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method2124();
                                for (int var21 = 0; var21 < var17.field1320; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1434) {
                                float[] var23 = var17.method2124();
                                for (int var24 = 0; var24 < var17.field1320; var24++) {
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
