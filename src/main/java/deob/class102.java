package deob;

@ObfuscatedName("ck")
public class class102 {

    @ObfuscatedName("ck.z")
    public int field1340 = class93.method1973(16);

    @ObfuscatedName("ck.w")
    public int field1341 = class93.method1973(24);

    @ObfuscatedName("ck.s")
    public int field1345 = class93.method1973(24);

    @ObfuscatedName("ck.l")
    public int field1342 = class93.method1973(24) + 1;

    @ObfuscatedName("ck.u")
    public int field1344 = class93.method1973(6) + 1;

    @ObfuscatedName("ck.q")
    public int field1343 = class93.method1973(8);

    @ObfuscatedName("ck.k")
    public int[] field1346;

    public class102() {
        int[] var1 = new int[this.field1344];
        for (int var2 = 0; var2 < this.field1344; var2++) {
            int var3 = 0;
            int var4 = class93.method1973(3);
            boolean var5 = class93.method1958() != 0;
            if (var5) {
                var3 = class93.method1973(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1346 = new int[this.field1344 * 8];
        for (int var6 = 0; var6 < this.field1344 * 8; var6++) {
            this.field1346[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class93.method1973(8);
        }
    }

    @ObfuscatedName("ck.z([FIZ)V")
    public void method2078(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1255[this.field1343].field1236;
        int var6 = this.field1345 - this.field1341;
        int var7 = var6 / this.field1342;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1255[this.field1343].method1920();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1344;
                        }
                        var11 /= this.field1344;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1346[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1342 * var10 + this.field1341;
                        class91 var17 = Statics.field1255[var15];
                        if (this.field1340 == 0) {
                            int var18 = this.field1342 / var17.field1236;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1927();
                                for (int var21 = 0; var21 < var17.field1236; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1342) {
                                float[] var23 = var17.method1927();
                                for (int var24 = 0; var24 < var17.field1236; var24++) {
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
