package deob;

@ObfuscatedName("bl")
public class class123 {

    @ObfuscatedName("bl.n")
    public int[] field1882;

    @ObfuscatedName("bl.o")
    public int field1877 = class127.method2141(24);

    @ObfuscatedName("bl.j")
    public int field1876 = class127.method2141(16);

    @ObfuscatedName("bl.h")
    public int field1880 = class127.method2141(6) + 1;

    @ObfuscatedName("bl.t")
    public int field1879 = class127.method2141(24) + 1;

    @ObfuscatedName("bl.r")
    public int field1881 = class127.method2141(8);

    @ObfuscatedName("bl.p")
    public int field1878 = class127.method2141(24);

    public class123() {
        int[] var1 = new int[this.field1880];
        for (int var2 = 0; var2 < this.field1880; var2++) {
            int var3 = 0;
            int var4 = class127.method2141(3);
            boolean var5 = class127.method2173() != 0;
            if (var5) {
                var3 = class127.method2141(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1882 = new int[this.field1880 * 8];
        for (int var6 = 0; var6 < this.field1880 * 8; var6++) {
            this.field1882[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class127.method2141(8);
        }
    }

    @ObfuscatedName("bl.j([FIZ)V")
    public void method2097(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1925[this.field1881].field1798;
        int var6 = this.field1877 - this.field1878;
        int var7 = var6 / this.field1879;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1925[this.field1881].method1950();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1880;
                        }
                        var11 /= this.field1880;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1882[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1879 * var10 + this.field1878;
                        class115 var17 = Statics.field1925[var15];
                        if (this.field1876 == 0) {
                            int var18 = this.field1879 / var17.field1798;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1951();
                                for (int var21 = 0; var21 < var17.field1798; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1879) {
                                float[] var23 = var17.method1951();
                                for (int var24 = 0; var24 < var17.field1798; var24++) {
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
