package deob;

@ObfuscatedName("be")
public class class132 {

    @ObfuscatedName("be.d")
    public int field2076 = class121.method2139(8);

    @ObfuscatedName("be.b")
    public int field2072 = class121.method2139(16);

    @ObfuscatedName("be.l")
    public int[] field2078;

    @ObfuscatedName("be.k")
    public int field2074 = class121.method2139(24);

    @ObfuscatedName("be.h")
    public int field2073 = class121.method2139(24);

    @ObfuscatedName("be.w")
    public int field2075 = class121.method2139(24) + 1;

    @ObfuscatedName("be.t")
    public int field2077 = class121.method2139(6) + 1;

    @ObfuscatedName("be.b([FIZ)V")
    public void method2310(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1955[this.field2076].field1981;
        int var6 = this.field2074 - this.field2073;
        int var7 = var6 / this.field2075;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1955[this.field2076].method2175();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field2077;
                        }
                        var11 /= this.field2077;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field2078[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field2075 * var10 + this.field2073;
                        class122 var17 = Statics.field1955[var15];
                        if (this.field2072 == 0) {
                            int var18 = this.field2075 / var17.field1981;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method2181();
                                for (int var21 = 0; var21 < var17.field1981; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field2075) {
                                float[] var23 = var17.method2181();
                                for (int var24 = 0; var24 < var17.field1981; var24++) {
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

    public class132() {
        int[] var1 = new int[this.field2077];
        for (int var2 = 0; var2 < this.field2077; var2++) {
            int var3 = 0;
            int var4 = class121.method2139(3);
            boolean var5 = class121.method2150() != 0;
            if (var5) {
                var3 = class121.method2139(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field2078 = new int[this.field2077 * 8];
        for (int var6 = 0; var6 < this.field2077 * 8; var6++) {
            this.field2078[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class121.method2139(8);
        }
    }
}
