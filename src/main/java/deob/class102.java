package deob;

@ObfuscatedName("cu")
public class class102 {

    @ObfuscatedName("cu.w")
    public int field1368 = class93.method1991(16);

    @ObfuscatedName("cu.m")
    public int field1366 = class93.method1991(24);

    @ObfuscatedName("cu.q")
    public int field1367 = class93.method1991(24);

    @ObfuscatedName("cu.b")
    public int field1369 = class93.method1991(24) + 1;

    @ObfuscatedName("cu.f")
    public int field1370 = class93.method1991(6) + 1;

    @ObfuscatedName("cu.n")
    public int field1371 = class93.method1991(8);

    @ObfuscatedName("cu.h")
    public int[] field1372;

    public class102() {
        int[] var1 = new int[this.field1370];
        for (int var2 = 0; var2 < this.field1370; var2++) {
            int var3 = 0;
            int var4 = class93.method1991(3);
            boolean var5 = class93.method1971() != 0;
            if (var5) {
                var3 = class93.method1991(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1372 = new int[this.field1370 * 8];
        for (int var6 = 0; var6 < this.field1370 * 8; var6++) {
            this.field1372[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class93.method1991(8);
        }
    }

    @ObfuscatedName("cu.w([FIZ)V")
    public void method2129(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1271[this.field1371].field1261;
        int var6 = this.field1367 - this.field1366;
        int var7 = var6 / this.field1369;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1271[this.field1371].method1950();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1370;
                        }
                        var11 /= this.field1370;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1372[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1369 * var10 + this.field1366;
                        class91 var17 = Statics.field1271[var15];
                        if (this.field1368 == 0) {
                            int var18 = this.field1369 / var17.field1261;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1948();
                                for (int var21 = 0; var21 < var17.field1261; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1369) {
                                float[] var23 = var17.method1948();
                                for (int var24 = 0; var24 < var17.field1261; var24++) {
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
