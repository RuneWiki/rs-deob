package deob;

@ObfuscatedName("dq")
public class class109 {

    @ObfuscatedName("dq.a")
    public int field1427 = class100.method2192(16);

    @ObfuscatedName("dq.s")
    public int field1428 = class100.method2192(24);

    @ObfuscatedName("dq.g")
    public int field1429 = class100.method2192(24);

    @ObfuscatedName("dq.x")
    public int field1431 = class100.method2192(24) + 1;

    @ObfuscatedName("dq.h")
    public int field1430 = class100.method2192(6) + 1;

    @ObfuscatedName("dq.f")
    public int field1432 = class100.method2192(8);

    @ObfuscatedName("dq.p")
    public int[] field1433;

    public class109() {
        int[] var1 = new int[this.field1430];
        for (int var2 = 0; var2 < this.field1430; var2++) {
            int var3 = 0;
            int var4 = class100.method2192(3);
            boolean var5 = class100.method2191() != 0;
            if (var5) {
                var3 = class100.method2192(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1433 = new int[this.field1430 * 8];
        for (int var6 = 0; var6 < this.field1430 * 8; var6++) {
            this.field1433[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class100.method2192(8);
        }
    }

    @ObfuscatedName("dq.a([FIZ)V")
    public void method2324(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1368[this.field1432].field1331;
        int var6 = this.field1429 - this.field1428;
        int var7 = var6 / this.field1431;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1368[this.field1432].method2162();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1430;
                        }
                        var11 /= this.field1430;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1433[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1431 * var10 + this.field1428;
                        class98 var17 = Statics.field1368[var15];
                        if (this.field1427 == 0) {
                            int var18 = this.field1431 / var17.field1331;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method2159();
                                for (int var21 = 0; var21 < var17.field1331; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1431) {
                                float[] var23 = var17.method2159();
                                for (int var24 = 0; var24 < var17.field1331; var24++) {
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
