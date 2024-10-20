package deob;

@ObfuscatedName("dn")
public class class112 {

    @ObfuscatedName("dn.c")
    public int field1420 = class103.method2190(16);

    @ObfuscatedName("dn.x")
    public int field1421 = class103.method2190(24);

    @ObfuscatedName("dn.t")
    public int field1425 = class103.method2190(24);

    @ObfuscatedName("dn.g")
    public int field1423 = class103.method2190(24) + 1;

    @ObfuscatedName("dn.l")
    public int field1424 = class103.method2190(6) + 1;

    @ObfuscatedName("dn.u")
    public int field1422 = class103.method2190(8);

    @ObfuscatedName("dn.j")
    public int[] field1426;

    public class112() {
        int[] var1 = new int[this.field1424];
        for (int var2 = 0; var2 < this.field1424; var2++) {
            int var3 = 0;
            int var4 = class103.method2190(3);
            boolean var5 = class103.method2194() != 0;
            if (var5) {
                var3 = class103.method2190(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1426 = new int[this.field1424 * 8];
        for (int var6 = 0; var6 < this.field1424 * 8; var6++) {
            this.field1426[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class103.method2190(8);
        }
    }

    @ObfuscatedName("dn.c([FIZ)V")
    public void method2311(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1332[this.field1422].field1311;
        int var6 = this.field1425 - this.field1421;
        int var7 = var6 / this.field1423;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1332[this.field1422].method2152();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1424;
                        }
                        var11 /= this.field1424;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1426[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1423 * var10 + this.field1421;
                        class101 var17 = Statics.field1332[var15];
                        if (this.field1420 == 0) {
                            int var18 = this.field1423 / var17.field1311;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method2163();
                                for (int var21 = 0; var21 < var17.field1311; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1423) {
                                float[] var23 = var17.method2163();
                                for (int var24 = 0; var24 < var17.field1311; var24++) {
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
