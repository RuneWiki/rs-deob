package deob;

@ObfuscatedName("cs")
public class class104 {

    @ObfuscatedName("cs.f")
    public int field1385 = class95.method1994(16);

    @ObfuscatedName("cs.h")
    public int field1388 = class95.method1994(24);

    @ObfuscatedName("cs.e")
    public int field1386 = class95.method1994(24);

    @ObfuscatedName("cs.b")
    public int field1387 = class95.method1994(24) + 1;

    @ObfuscatedName("cs.l")
    public int field1384 = class95.method1994(6) + 1;

    @ObfuscatedName("cs.w")
    public int field1389 = class95.method1994(8);

    @ObfuscatedName("cs.d")
    public int[] field1390;

    public class104() {
        int[] var1 = new int[this.field1384];
        for (int var2 = 0; var2 < this.field1384; var2++) {
            int var3 = 0;
            int var4 = class95.method1994(3);
            boolean var5 = class95.method1977() != 0;
            if (var5) {
                var3 = class95.method1994(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1390 = new int[this.field1384 * 8];
        for (int var6 = 0; var6 < this.field1384 * 8; var6++) {
            this.field1390[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class95.method1994(8);
        }
    }

    @ObfuscatedName("cs.f([FIZ)V")
    public void method2114(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1300[this.field1389].field1281;
        int var6 = this.field1386 - this.field1388;
        int var7 = var6 / this.field1387;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1300[this.field1389].method1948();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1384;
                        }
                        var11 /= this.field1384;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1390[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1387 * var10 + this.field1388;
                        class93 var17 = Statics.field1300[var15];
                        if (this.field1385 == 0) {
                            int var18 = this.field1387 / var17.field1281;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1945();
                                for (int var21 = 0; var21 < var17.field1281; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1387) {
                                float[] var23 = var17.method1945();
                                for (int var24 = 0; var24 < var17.field1281; var24++) {
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
