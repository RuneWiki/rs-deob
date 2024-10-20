package deob;

@ObfuscatedName("di")
public class class110 {

    @ObfuscatedName("di.f")
    public int field1416 = class101.method2175(16);

    @ObfuscatedName("di.i")
    public int field1413 = class101.method2175(24);

    @ObfuscatedName("di.y")
    public int field1412 = class101.method2175(24);

    @ObfuscatedName("di.w")
    public int field1415 = class101.method2175(24) + 1;

    @ObfuscatedName("di.p")
    public int field1414 = class101.method2175(6) + 1;

    @ObfuscatedName("di.b")
    public int field1417 = class101.method2175(8);

    @ObfuscatedName("di.e")
    public int[] field1418;

    public class110() {
        int[] var1 = new int[this.field1414];
        for (int var2 = 0; var2 < this.field1414; var2++) {
            int var3 = 0;
            int var4 = class101.method2175(3);
            boolean var5 = class101.method2192() != 0;
            if (var5) {
                var3 = class101.method2175(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1418 = new int[this.field1414 * 8];
        for (int var6 = 0; var6 < this.field1414 * 8; var6++) {
            this.field1418[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class101.method2175(8);
        }
    }

    @ObfuscatedName("di.f([FIZ)V")
    public void method2313(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1329[this.field1417].field1312;
        int var6 = this.field1412 - this.field1413;
        int var7 = var6 / this.field1415;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1329[this.field1417].method2149();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1414;
                        }
                        var11 /= this.field1414;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1418[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1415 * var10 + this.field1413;
                        class99 var17 = Statics.field1329[var15];
                        if (this.field1416 == 0) {
                            int var18 = this.field1415 / var17.field1312;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method2156();
                                for (int var21 = 0; var21 < var17.field1312; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1415) {
                                float[] var23 = var17.method2156();
                                for (int var24 = 0; var24 < var17.field1312; var24++) {
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
