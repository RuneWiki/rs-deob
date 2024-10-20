package deob;

@ObfuscatedName("dv")
public class class114 {

    @ObfuscatedName("dv.g")
    public int field1584 = class105.method2103(16);

    @ObfuscatedName("dv.e")
    public int field1580 = class105.method2103(24);

    @ObfuscatedName("dv.b")
    public int field1581 = class105.method2103(24);

    @ObfuscatedName("dv.z")
    public int field1579 = class105.method2103(24) + 1;

    @ObfuscatedName("dv.n")
    public int field1582 = class105.method2103(6) + 1;

    @ObfuscatedName("dv.l")
    public int field1583 = class105.method2103(8);

    @ObfuscatedName("dv.s")
    public int[] field1585;

    public class114() {
        int[] var1 = new int[this.field1582];
        for (int var2 = 0; var2 < this.field1582; var2++) {
            int var3 = 0;
            int var4 = class105.method2103(3);
            boolean var5 = class105.method2105() != 0;
            if (var5) {
                var3 = class105.method2103(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1585 = new int[this.field1582 * 8];
        for (int var6 = 0; var6 < this.field1582 * 8; var6++) {
            this.field1585[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class105.method2103(8);
        }
    }

    @ObfuscatedName("dv.g([FIZ)V")
    public void method2224(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1495[this.field1583].field1480;
        int var6 = this.field1581 - this.field1580;
        int var7 = var6 / this.field1579;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1495[this.field1583].method2081();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1582;
                        }
                        var11 /= this.field1582;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1585[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1579 * var10 + this.field1580;
                        class103 var17 = Statics.field1495[var15];
                        if (this.field1584 == 0) {
                            int var18 = this.field1579 / var17.field1480;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method2082();
                                for (int var21 = 0; var21 < var17.field1480; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1579) {
                                float[] var23 = var17.method2082();
                                for (int var24 = 0; var24 < var17.field1480; var24++) {
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
