package deob;

@ObfuscatedName("da")
public class class110 {

    @ObfuscatedName("da.m")
    public int field1410 = class101.method2162(16);

    @ObfuscatedName("da.f")
    public int field1407 = class101.method2162(24);

    @ObfuscatedName("da.q")
    public int field1408 = class101.method2162(24);

    @ObfuscatedName("da.w")
    public int field1409 = class101.method2162(24) + 1;

    @ObfuscatedName("da.o")
    public int field1406 = class101.method2162(6) + 1;

    @ObfuscatedName("da.u")
    public int field1412 = class101.method2162(8);

    @ObfuscatedName("da.g")
    public int[] field1411;

    public class110() {
        int[] var1 = new int[this.field1406];
        for (int var2 = 0; var2 < this.field1406; var2++) {
            int var3 = 0;
            int var4 = class101.method2162(3);
            boolean var5 = class101.method2148() != 0;
            if (var5) {
                var3 = class101.method2162(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1411 = new int[this.field1406 * 8];
        for (int var6 = 0; var6 < this.field1406 * 8; var6++) {
            this.field1411[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class101.method2162(8);
        }
    }

    @ObfuscatedName("da.m([FIZ)V")
    public void method2260(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1324[this.field1412].field1307;
        int var6 = this.field1408 - this.field1407;
        int var7 = var6 / this.field1409;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1324[this.field1412].method2116();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1406;
                        }
                        var11 /= this.field1406;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1411[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1409 * var10 + this.field1407;
                        class99 var17 = Statics.field1324[var15];
                        if (this.field1410 == 0) {
                            int var18 = this.field1409 / var17.field1307;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method2117();
                                for (int var21 = 0; var21 < var17.field1307; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1409) {
                                float[] var23 = var17.method2117();
                                for (int var24 = 0; var24 < var17.field1307; var24++) {
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
