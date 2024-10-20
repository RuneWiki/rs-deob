package deob;

@ObfuscatedName("di")
public class class112 {

    @ObfuscatedName("di.u")
    public int field1443 = class103.method2178(16);

    @ObfuscatedName("di.f")
    public int field1446 = class103.method2178(24);

    @ObfuscatedName("di.b")
    public int field1444 = class103.method2178(24);

    @ObfuscatedName("di.g")
    public int field1442 = class103.method2178(24) + 1;

    @ObfuscatedName("di.z")
    public int field1447 = class103.method2178(6) + 1;

    @ObfuscatedName("di.p")
    public int field1445 = class103.method2178(8);

    @ObfuscatedName("di.h")
    public int[] field1448;

    public class112() {
        int[] var1 = new int[this.field1447];
        for (int var2 = 0; var2 < this.field1447; var2++) {
            int var3 = 0;
            int var4 = class103.method2178(3);
            boolean var5 = class103.method2177() != 0;
            if (var5) {
                var3 = class103.method2178(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1448 = new int[this.field1447 * 8];
        for (int var6 = 0; var6 < this.field1447 * 8; var6++) {
            this.field1448[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class103.method2178(8);
        }
    }

    @ObfuscatedName("di.u([FIZ)V")
    public void method2324(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1352[this.field1445].field1332;
        int var6 = this.field1444 - this.field1446;
        int var7 = var6 / this.field1442;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1352[this.field1445].method2147();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1447;
                        }
                        var11 /= this.field1447;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1448[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1442 * var10 + this.field1446;
                        class101 var17 = Statics.field1352[var15];
                        if (this.field1443 == 0) {
                            int var18 = this.field1442 / var17.field1332;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method2148();
                                for (int var21 = 0; var21 < var17.field1332; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1442) {
                                float[] var23 = var17.method2148();
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
