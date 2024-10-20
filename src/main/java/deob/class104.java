package deob;

@ObfuscatedName("cc")
public class class104 {

    @ObfuscatedName("cc.c")
    public int field1408 = class95.method1931(16);

    @ObfuscatedName("cc.q")
    public int field1403 = class95.method1931(24);

    @ObfuscatedName("cc.m")
    public int field1404 = class95.method1931(24);

    @ObfuscatedName("cc.j")
    public int field1405 = class95.method1931(24) + 1;

    @ObfuscatedName("cc.g")
    public int field1406 = class95.method1931(6) + 1;

    @ObfuscatedName("cc.i")
    public int field1407 = class95.method1931(8);

    @ObfuscatedName("cc.h")
    public int[] field1402;

    public class104() {
        int[] var1 = new int[this.field1406];
        for (int var2 = 0; var2 < this.field1406; var2++) {
            int var3 = 0;
            int var4 = class95.method1931(3);
            boolean var5 = class95.method1943() != 0;
            if (var5) {
                var3 = class95.method1931(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1402 = new int[this.field1406 * 8];
        for (int var6 = 0; var6 < this.field1406 * 8; var6++) {
            this.field1402[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class95.method1931(8);
        }
    }

    @ObfuscatedName("cc.c([FIZ)V")
    public void method2067(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1314[this.field1407].field1294;
        int var6 = this.field1404 - this.field1403;
        int var7 = var6 / this.field1405;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1314[this.field1407].method1913();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1406;
                        }
                        var11 /= this.field1406;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1402[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1405 * var10 + this.field1403;
                        class93 var17 = Statics.field1314[var15];
                        if (this.field1408 == 0) {
                            int var18 = this.field1405 / var17.field1294;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1907();
                                for (int var21 = 0; var21 < var17.field1294; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1405) {
                                float[] var23 = var17.method1907();
                                for (int var24 = 0; var24 < var17.field1294; var24++) {
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
