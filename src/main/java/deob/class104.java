package deob;

@ObfuscatedName("cw")
public class class104 {

    @ObfuscatedName("cw.v")
    public int field1392 = class95.method1977(16);

    @ObfuscatedName("cw.s")
    public int field1391 = class95.method1977(24);

    @ObfuscatedName("cw.o")
    public int field1390 = class95.method1977(24);

    @ObfuscatedName("cw.k")
    public int field1393 = class95.method1977(24) + 1;

    @ObfuscatedName("cw.u")
    public int field1394 = class95.method1977(6) + 1;

    @ObfuscatedName("cw.i")
    public int field1395 = class95.method1977(8);

    @ObfuscatedName("cw.t")
    public int[] field1396;

    public class104() {
        int[] var1 = new int[this.field1394];
        for (int var2 = 0; var2 < this.field1394; var2++) {
            int var3 = 0;
            int var4 = class95.method1977(3);
            boolean var5 = class95.method1976() != 0;
            if (var5) {
                var3 = class95.method1977(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1396 = new int[this.field1394 * 8];
        for (int var6 = 0; var6 < this.field1394 * 8; var6++) {
            this.field1396[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class95.method1977(8);
        }
    }

    @ObfuscatedName("cw.v([FIZ)V")
    public void method2119(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1303[this.field1395].field1286;
        int var6 = this.field1390 - this.field1391;
        int var7 = var6 / this.field1393;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1303[this.field1395].method1949();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1394;
                        }
                        var11 /= this.field1394;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1396[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1393 * var10 + this.field1391;
                        class93 var17 = Statics.field1303[var15];
                        if (this.field1392 == 0) {
                            int var18 = this.field1393 / var17.field1286;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1956();
                                for (int var21 = 0; var21 < var17.field1286; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1393) {
                                float[] var23 = var17.method1956();
                                for (int var24 = 0; var24 < var17.field1286; var24++) {
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
