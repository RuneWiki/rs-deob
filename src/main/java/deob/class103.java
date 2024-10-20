package deob;

@ObfuscatedName("cm")
public class class103 {

    @ObfuscatedName("cm.d")
    public int field1492;

    @ObfuscatedName("cm.z")
    public int field1493;

    @ObfuscatedName("cm.n")
    public int[] field1490;

    @ObfuscatedName("cm.r")
    public int[] field1491;

    @ObfuscatedName("cm.e")
    public float[][] field1488;

    @ObfuscatedName("cm.y")
    public int[] field1489;

    @ObfuscatedName("cm.d(II)I")
    public static int method1997(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class200.method2915(var2, arg1) > arg0; var2--) {
        }
        return var2;
    }

    public class103() {
        class105.method2030(24);
        this.field1492 = class105.method2030(16);
        this.field1493 = class105.method2030(24);
        this.field1490 = new int[this.field1493];
        boolean var1 = class105.method2018() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class105.method2030(5) + 1;
            while (var2 < this.field1493) {
                int var4 = class105.method2030(class200.method142(this.field1493 - var2));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field1490[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class105.method2018() != 0;
            for (int var7 = 0; var7 < this.field1493; var7++) {
                if (var6 && class105.method2018() == 0) {
                    this.field1490[var7] = 0;
                } else {
                    this.field1490[var7] = class105.method2030(5) + 1;
                }
            }
        }
        this.method1990();
        int var8 = class105.method2030(4);
        if (var8 > 0) {
            float var9 = class105.method2038(class105.method2030(32));
            float var10 = class105.method2038(class105.method2030(32));
            int var11 = class105.method2030(4) + 1;
            boolean var12 = class105.method2018() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method1997(this.field1493, this.field1492);
            } else {
                var13 = this.field1493 * this.field1492;
            }
            this.field1491 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field1491[var14] = class105.method2030(var11);
            }
            this.field1488 = new float[this.field1493][this.field1492];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field1493; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field1492; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field1491[var19] * var10 + var9 + var16;
                        this.field1488[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field1493; var21++) {
                    float var22 = 0.0F;
                    int var23 = this.field1492 * var21;
                    for (int var24 = 0; var24 < this.field1492; var24++) {
                        float var25 = (float) this.field1491[var23] * var10 + var9 + var22;
                        this.field1488[var21][var24] = var25;
                        if (var12) {
                            var22 = var25;
                        }
                        var23++;
                    }
                }
            }
        }
    }

    @ObfuscatedName("cm.z()V")
    public void method1990() {
        int[] var1 = new int[this.field1493];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field1493; var3++) {
            int var4 = this.field1490[var3];
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
        this.field1489 = new int[8];
        int var13 = 0;
        for (int var14 = 0; var14 < this.field1493; var14++) {
            int var15 = this.field1490[var14];
            if (var15 != 0) {
                int var16 = var1[var14];
                int var17 = 0;
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = Integer.MIN_VALUE >>> var18;
                    if ((var16 & var19) == 0) {
                        var17++;
                    } else {
                        if (this.field1489[var17] == 0) {
                            this.field1489[var17] = var13;
                        }
                        var17 = this.field1489[var17];
                    }
                    if (var17 >= this.field1489.length) {
                        int[] var20 = new int[this.field1489.length * 2];
                        for (int var21 = 0; var21 < this.field1489.length; var21++) {
                            var20[var21] = this.field1489[var21];
                        }
                        this.field1489 = var20;
                    }
                    int var22 = var19 >>> 1;
                }
                this.field1489[var17] = ~var14;
                if (var17 >= var13) {
                    var13 = var17 + 1;
                }
            }
        }
    }

    @ObfuscatedName("cm.n()I")
    public int method1987() {
        int var1;
        for (var1 = 0; this.field1489[var1] >= 0; var1 = class105.method2018() == 0 ? var1 + 1 : this.field1489[var1]) {
        }
        return ~this.field1489[var1];
    }

    @ObfuscatedName("cm.r()[F")
    public float[] method1988() {
        return this.field1488[this.method1987()];
    }
}
