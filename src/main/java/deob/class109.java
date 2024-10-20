package deob;

@ObfuscatedName("dg")
public class class109 {

    @ObfuscatedName("dg.n")
    public int field1408 = class100.method2169(16);

    @ObfuscatedName("dg.h")
    public int field1406 = class100.method2169(24);

    @ObfuscatedName("dg.l")
    public int field1404 = class100.method2169(24);

    @ObfuscatedName("dg.g")
    public int field1407 = class100.method2169(24) + 1;

    @ObfuscatedName("dg.b")
    public int field1405 = class100.method2169(6) + 1;

    @ObfuscatedName("dg.a")
    public int field1409 = class100.method2169(8);

    @ObfuscatedName("dg.c")
    public int[] field1410;

    public class109() {
        int[] var1 = new int[this.field1405];
        for (int var2 = 0; var2 < this.field1405; var2++) {
            int var3 = 0;
            int var4 = class100.method2169(3);
            boolean var5 = class100.method2168() != 0;
            if (var5) {
                var3 = class100.method2169(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1410 = new int[this.field1405 * 8];
        for (int var6 = 0; var6 < this.field1405 * 8; var6++) {
            this.field1410[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class100.method2169(8);
        }
    }

    @ObfuscatedName("dg.n([FIZ)V")
    public void method2312(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1334[this.field1409].field1293;
        int var6 = this.field1404 - this.field1406;
        int var7 = var6 / this.field1407;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1334[this.field1409].method2132();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1405;
                        }
                        var11 /= this.field1405;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1410[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1407 * var10 + this.field1406;
                        class98 var17 = Statics.field1334[var15];
                        if (this.field1408 == 0) {
                            int var18 = this.field1407 / var17.field1293;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method2137();
                                for (int var21 = 0; var21 < var17.field1293; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1407) {
                                float[] var23 = var17.method2137();
                                for (int var24 = 0; var24 < var17.field1293; var24++) {
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
