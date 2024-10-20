package deob;

@ObfuscatedName("ck")
public class class101 {

    @ObfuscatedName("ck.q")
    public int field1351;

    @ObfuscatedName("ck.w")
    public int field1350;

    @ObfuscatedName("ck.e")
    public int[] field1348;

    @ObfuscatedName("ck.p")
    public int[] field1347;

    @ObfuscatedName("ck.k")
    public float[][] field1346;

    @ObfuscatedName("ck.l")
    public int[] field1349;

    @ObfuscatedName("ck.q(II)I")
    public static int method2128(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class189.method871(var2, arg1) > arg0; var2--) {
        }
        return var2;
    }

    public class101() {
        class103.method2146(24);
        this.field1351 = class103.method2146(16);
        this.field1350 = class103.method2146(24);
        this.field1348 = new int[this.field1350];
        boolean var1 = class103.method2145() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class103.method2146(5) + 1;
            while (var2 < this.field1350) {
                int var4 = class103.method2146(class189.method3035(this.field1350 - var2));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field1348[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class103.method2145() != 0;
            for (int var7 = 0; var7 < this.field1350; var7++) {
                if (var6 && class103.method2145() == 0) {
                    this.field1348[var7] = 0;
                } else {
                    this.field1348[var7] = class103.method2146(5) + 1;
                }
            }
        }
        this.method2118();
        int var8 = class103.method2146(4);
        if (var8 > 0) {
            float var9 = class103.method2168(class103.method2146(32));
            float var10 = class103.method2168(class103.method2146(32));
            int var11 = class103.method2146(4) + 1;
            boolean var12 = class103.method2145() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method2128(this.field1350, this.field1351);
            } else {
                var13 = this.field1351 * this.field1350;
            }
            this.field1347 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field1347[var14] = class103.method2146(var11);
            }
            this.field1346 = new float[this.field1350][this.field1351];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field1350; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field1351; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field1347[var19] * var10 + var9 + var16;
                        this.field1346[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field1350; var21++) {
                    float var22 = 0.0F;
                    int var23 = this.field1351 * var21;
                    for (int var24 = 0; var24 < this.field1351; var24++) {
                        float var25 = (float) this.field1347[var23] * var10 + var9 + var22;
                        this.field1346[var21][var24] = var25;
                        if (var12) {
                            var22 = var25;
                        }
                        var23++;
                    }
                }
            }
        }
    }

    @ObfuscatedName("ck.w()V")
    public void method2118() {
        int[] var1 = new int[this.field1350];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field1350; var3++) {
            int var4 = this.field1348[var3];
            if (var4 != 0) {
                int var5 = 0x1 << 32 - var4;
                int var6 = var2[var4];
                var1[var3] = var6;
                int var7;
                if ((var6 & var5) == 0) {
                    var7 = var6 | var5;
                    for (int var8 = var4 - 1; var8 >= 1; var8--) {
                        int var9 = var2[var8];
                        if (var6 != var9) {
                            break;
                        }
                        int var10 = 0x1 << 32 - var8;
                        if ((var9 & var10) != 0) {
                            var2[var8] = var2[var8 - 1];
                            break;
                        }
                        var2[var8] = var9 | var10;
                    }
                } else {
                    var7 = var2[var4 - 1];
                }
                var2[var4] = var7;
                for (int var11 = var4 + 1; var11 <= 32; var11++) {
                    int var12 = var2[var11];
                    if (var6 == var12) {
                        var2[var11] = var7;
                    }
                }
            }
        }
        this.field1349 = new int[8];
        int var13 = 0;
        for (int var14 = 0; var14 < this.field1350; var14++) {
            int var15 = this.field1348[var14];
            if (var15 != 0) {
                int var16 = var1[var14];
                int var17 = 0;
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = Integer.MIN_VALUE >>> var18;
                    if ((var16 & var19) == 0) {
                        var17++;
                    } else {
                        if (this.field1349[var17] == 0) {
                            this.field1349[var17] = var13;
                        }
                        var17 = this.field1349[var17];
                    }
                    if (var17 >= this.field1349.length) {
                        int[] var20 = new int[this.field1349.length * 2];
                        for (int var21 = 0; var21 < this.field1349.length; var21++) {
                            var20[var21] = this.field1349[var21];
                        }
                        this.field1349 = var20;
                    }
                    int var22 = var19 >>> 1;
                }
                this.field1349[var17] = ~var14;
                if (var17 >= var13) {
                    var13 = var17 + 1;
                }
            }
        }
    }

    @ObfuscatedName("ck.e()I")
    public int method2126() {
        int var1;
        for (var1 = 0; this.field1349[var1] >= 0; var1 = class103.method2145() == 0 ? var1 + 1 : this.field1349[var1]) {
        }
        return ~this.field1349[var1];
    }

    @ObfuscatedName("ck.p()[F")
    public float[] method2119() {
        return this.field1346[this.method2126()];
    }
}
