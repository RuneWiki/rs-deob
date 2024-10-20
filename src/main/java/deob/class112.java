package deob;

@ObfuscatedName("dl")
public class class112 {

    @ObfuscatedName("dl.q")
    public int field1460 = class103.method2146(16);

    @ObfuscatedName("dl.w")
    public int field1455 = class103.method2146(24);

    @ObfuscatedName("dl.e")
    public int field1456 = class103.method2146(24);

    @ObfuscatedName("dl.p")
    public int field1457 = class103.method2146(24) + 1;

    @ObfuscatedName("dl.k")
    public int field1458 = class103.method2146(6) + 1;

    @ObfuscatedName("dl.l")
    public int field1454 = class103.method2146(8);

    @ObfuscatedName("dl.b")
    public int[] field1459;

    public class112() {
        int[] var1 = new int[this.field1458];
        for (int var2 = 0; var2 < this.field1458; var2++) {
            int var3 = 0;
            int var4 = class103.method2146(3);
            boolean var5 = class103.method2145() != 0;
            if (var5) {
                var3 = class103.method2146(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1459 = new int[this.field1458 * 8];
        for (int var6 = 0; var6 < this.field1458 * 8; var6++) {
            this.field1459[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class103.method2146(8);
        }
    }

    @ObfuscatedName("dl.q([FIZ)V")
    public void method2280(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1370[this.field1454].field1351;
        int var6 = this.field1456 - this.field1455;
        int var7 = var6 / this.field1457;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1370[this.field1454].method2126();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1458;
                        }
                        var11 /= this.field1458;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1459[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1457 * var10 + this.field1455;
                        class101 var17 = Statics.field1370[var15];
                        if (this.field1460 == 0) {
                            int var18 = this.field1457 / var17.field1351;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method2119();
                                for (int var21 = 0; var21 < var17.field1351; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1457) {
                                float[] var23 = var17.method2119();
                                for (int var24 = 0; var24 < var17.field1351; var24++) {
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
