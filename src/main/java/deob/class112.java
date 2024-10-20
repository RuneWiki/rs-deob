package deob;

@ObfuscatedName("df")
public class class112 {

    @ObfuscatedName("df.z")
    public int field1424 = class103.method2152(16);

    @ObfuscatedName("df.n")
    public int field1427 = class103.method2152(24);

    @ObfuscatedName("df.v")
    public int field1425 = class103.method2152(24);

    @ObfuscatedName("df.u")
    public int field1426 = class103.method2152(24) + 1;

    @ObfuscatedName("df.r")
    public int field1423 = class103.method2152(6) + 1;

    @ObfuscatedName("df.p")
    public int field1428 = class103.method2152(8);

    @ObfuscatedName("df.q")
    public int[] field1429;

    public class112() {
        int[] var1 = new int[this.field1423];
        for (int var2 = 0; var2 < this.field1423; var2++) {
            int var3 = 0;
            int var4 = class103.method2152(3);
            boolean var5 = class103.method2143() != 0;
            if (var5) {
                var3 = class103.method2152(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1429 = new int[this.field1423 * 8];
        for (int var6 = 0; var6 < this.field1423 * 8; var6++) {
            this.field1429[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class103.method2152(8);
        }
    }

    @ObfuscatedName("df.z([FIZ)V")
    public void method2267(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1355[this.field1428].field1322;
        int var6 = this.field1425 - this.field1427;
        int var7 = var6 / this.field1426;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1355[this.field1428].method2112();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1423;
                        }
                        var11 /= this.field1423;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1429[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1426 * var10 + this.field1427;
                        class101 var17 = Statics.field1355[var15];
                        if (this.field1424 == 0) {
                            int var18 = this.field1426 / var17.field1322;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method2113();
                                for (int var21 = 0; var21 < var17.field1322; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1426) {
                                float[] var23 = var17.method2113();
                                for (int var24 = 0; var24 < var17.field1322; var24++) {
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
