package deob;

@ObfuscatedName("ch")
public class class103 {

    @ObfuscatedName("ch.g")
    public int field1480;

    @ObfuscatedName("ch.e")
    public int field1476;

    @ObfuscatedName("ch.b")
    public int[] field1479;

    @ObfuscatedName("ch.z")
    public int[] field1478;

    @ObfuscatedName("ch.n")
    public float[][] field1475;

    @ObfuscatedName("ch.l")
    public int[] field1477;

    @ObfuscatedName("ch.g(II)I")
    public static int method2087(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class200.method2669(var2, arg1) > arg0; var2--) {
        }
        return var2;
    }

    public class103() {
        class105.method2103(24);
        this.field1480 = class105.method2103(16);
        this.field1476 = class105.method2103(24);
        this.field1479 = new int[this.field1476];
        boolean var1 = class105.method2105() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class105.method2103(5) + 1;
            while (var2 < this.field1476) {
                int var4 = class105.method2103(class200.method2011(this.field1476 - var2));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field1479[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class105.method2105() != 0;
            for (int var7 = 0; var7 < this.field1476; var7++) {
                if (var6 && class105.method2105() == 0) {
                    this.field1479[var7] = 0;
                } else {
                    this.field1479[var7] = class105.method2103(5) + 1;
                }
            }
        }
        this.method2079();
        int var8 = class105.method2103(4);
        if (var8 > 0) {
            float var9 = class105.method2104(class105.method2103(32));
            float var10 = class105.method2104(class105.method2103(32));
            int var11 = class105.method2103(4) + 1;
            boolean var12 = class105.method2105() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method2087(this.field1476, this.field1480);
            } else {
                var13 = this.field1480 * this.field1476;
            }
            this.field1478 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field1478[var14] = class105.method2103(var11);
            }
            this.field1475 = new float[this.field1476][this.field1480];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field1476; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field1480; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field1478[var19] * var10 + var9 + var16;
                        this.field1475[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field1476; var21++) {
                    float var22 = 0.0F;
                    int var23 = this.field1480 * var21;
                    for (int var24 = 0; var24 < this.field1480; var24++) {
                        float var25 = (float) this.field1478[var23] * var10 + var9 + var22;
                        this.field1475[var21][var24] = var25;
                        if (var12) {
                            var22 = var25;
                        }
                        var23++;
                    }
                }
            }
        }
    }

    @ObfuscatedName("ch.e()V")
    public void method2079() {
        int[] var1 = new int[this.field1476];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field1476; var3++) {
            int var4 = this.field1479[var3];
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
        this.field1477 = new int[8];
        int var13 = 0;
        for (int var14 = 0; var14 < this.field1476; var14++) {
            int var15 = this.field1479[var14];
            if (var15 != 0) {
                int var16 = var1[var14];
                int var17 = 0;
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = Integer.MIN_VALUE >>> var18;
                    if ((var16 & var19) == 0) {
                        var17++;
                    } else {
                        if (this.field1477[var17] == 0) {
                            this.field1477[var17] = var13;
                        }
                        var17 = this.field1477[var17];
                    }
                    if (var17 >= this.field1477.length) {
                        int[] var20 = new int[this.field1477.length * 2];
                        for (int var21 = 0; var21 < this.field1477.length; var21++) {
                            var20[var21] = this.field1477[var21];
                        }
                        this.field1477 = var20;
                    }
                    int var22 = var19 >>> 1;
                }
                this.field1477[var17] = ~var14;
                if (var17 >= var13) {
                    var13 = var17 + 1;
                }
            }
        }
    }

    @ObfuscatedName("ch.b()I")
    public int method2081() {
        int var1;
        for (var1 = 0; this.field1477[var1] >= 0; var1 = class105.method2105() == 0 ? var1 + 1 : this.field1477[var1]) {
        }
        return ~this.field1477[var1];
    }

    @ObfuscatedName("ch.z()[F")
    public float[] method2082() {
        return this.field1475[this.method2081()];
    }
}
