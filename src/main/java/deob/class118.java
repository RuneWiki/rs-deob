package deob;

@ObfuscatedName("bo")
public class class118 {

    @ObfuscatedName("bo.b")
    public int field1836 = class162.method2885(24);

    @ObfuscatedName("bo.c")
    public int field1831 = class162.method2885(24);

    @ObfuscatedName("bo.m")
    public int field1834 = class162.method2885(6) + 1;

    @ObfuscatedName("bo.i")
    public int field1830 = class162.method2885(24) + 1;

    @ObfuscatedName("bo.v")
    public int field1832 = class162.method2885(16);

    @ObfuscatedName("bo.z")
    public int field1835 = class162.method2885(8);

    @ObfuscatedName("bo.x")
    public int[] field1833;

    public class118() {
        int[] var1 = new int[this.field1834];
        for (int var2 = 0; var2 < this.field1834; var2++) {
            int var3 = 0;
            int var4 = class162.method2885(3);
            boolean var5 = class162.method2884() != 0;
            if (var5) {
                var3 = class162.method2885(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1833 = new int[this.field1834 * 8];
        for (int var6 = 0; var6 < this.field1834 * 8; var6++) {
            this.field1833[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class162.method2885(8);
        }
    }

    @ObfuscatedName("bo.v([FIZ)V")
    public void method2112(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field2408[this.field1835].field1923;
        int var6 = this.field1836 - this.field1831;
        int var7 = var6 / this.field1830;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field2408[this.field1835].method2193();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1834;
                        }
                        var11 /= this.field1834;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1833[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1830 * var10 + this.field1831;
                        class128 var17 = Statics.field2408[var15];
                        if (this.field1832 == 0) {
                            int var18 = this.field1830 / var17.field1923;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method2194();
                                for (int var21 = 0; var21 < var17.field1923; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1830) {
                                float[] var23 = var17.method2194();
                                for (int var24 = 0; var24 < var17.field1923; var24++) {
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
