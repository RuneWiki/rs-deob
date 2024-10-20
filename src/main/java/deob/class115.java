package deob;

@ObfuscatedName("dw")
public class class115 {

    @ObfuscatedName("dw.b")
    public int field1591 = class106.method1810(16);

    @ObfuscatedName("dw.s")
    public int field1587 = class106.method1810(24);

    @ObfuscatedName("dw.r")
    public int field1588 = class106.method1810(24);

    @ObfuscatedName("dw.g")
    public int field1589 = class106.method1810(24) + 1;

    @ObfuscatedName("dw.x")
    public int field1590 = class106.method1810(6) + 1;

    @ObfuscatedName("dw.f")
    public int field1586 = class106.method1810(8);

    @ObfuscatedName("dw.u")
    public int[] field1592;

    public class115() {
        int[] var1 = new int[this.field1590];
        for (int var2 = 0; var2 < this.field1590; var2++) {
            int var3 = 0;
            int var4 = class106.method1810(3);
            boolean var5 = class106.method1809() != 0;
            if (var5) {
                var3 = class106.method1810(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1592 = new int[this.field1590 * 8];
        for (int var6 = 0; var6 < this.field1590 * 8; var6++) {
            this.field1592[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class106.method1810(8);
        }
    }

    @ObfuscatedName("dw.b([FIZ)V")
    public void method1948(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1507[this.field1586].field1479;
        int var6 = this.field1588 - this.field1587;
        int var7 = var6 / this.field1589;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1507[this.field1586].method1778();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1590;
                        }
                        var11 /= this.field1590;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1592[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1589 * var10 + this.field1587;
                        class104 var17 = Statics.field1507[var15];
                        if (this.field1591 == 0) {
                            int var18 = this.field1589 / var17.field1479;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1779();
                                for (int var21 = 0; var21 < var17.field1479; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1589) {
                                float[] var23 = var17.method1779();
                                for (int var24 = 0; var24 < var17.field1479; var24++) {
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
