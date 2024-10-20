package deob;

@ObfuscatedName("cn")
public class class103 {

    @ObfuscatedName("cn.c")
    public int field1496;

    @ObfuscatedName("cn.i")
    public int field1497;

    @ObfuscatedName("cn.o")
    public int[] field1492;

    @ObfuscatedName("cn.j")
    public int[] field1495;

    @ObfuscatedName("cn.k")
    public float[][] field1493;

    @ObfuscatedName("cn.x")
    public int[] field1494;

    @ObfuscatedName("cn.c(II)I")
    public static int method1956(int arg0, int arg1) {
        int var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1;
        while (true) {
            int var3 = var2;
            int var4 = arg1;
            int var5 = 1;
            while (var4 > 1) {
                if ((var4 & 0x1) != 0) {
                    var5 = var3 * var5;
                }
                var3 *= var3;
                var4 >>= 0x1;
            }
            int var6;
            if (var4 == 1) {
                var6 = var3 * var5;
            } else {
                var6 = var5;
            }
            if (var6 <= arg0) {
                return var2;
            }
            var2--;
        }
    }

    public class103() {
        class105.method1998(24);
        this.field1496 = class105.method1998(16);
        this.field1497 = class105.method1998(24);
        this.field1492 = new int[this.field1497];
        boolean var1 = class105.method1990() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class105.method1998(5) + 1;
            while (var2 < this.field1497) {
                int var4 = class105.method1998(class200.method89(this.field1497 - var2));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field1492[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class105.method1990() != 0;
            for (int var7 = 0; var7 < this.field1497; var7++) {
                if (var6 && class105.method1990() == 0) {
                    this.field1492[var7] = 0;
                } else {
                    this.field1492[var7] = class105.method1998(5) + 1;
                }
            }
        }
        this.method1948();
        int var8 = class105.method1998(4);
        if (var8 > 0) {
            float var9 = class105.method1971(class105.method1998(32));
            float var10 = class105.method1971(class105.method1998(32));
            int var11 = class105.method1998(4) + 1;
            boolean var12 = class105.method1990() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method1956(this.field1497, this.field1496);
            } else {
                var13 = this.field1497 * this.field1496;
            }
            this.field1495 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field1495[var14] = class105.method1998(var11);
            }
            this.field1493 = new float[this.field1497][this.field1496];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field1497; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field1496; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field1495[var19] * var10 + var9 + var16;
                        this.field1493[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field1497; var21++) {
                    float var22 = 0.0F;
                    int var23 = this.field1496 * var21;
                    for (int var24 = 0; var24 < this.field1496; var24++) {
                        float var25 = (float) this.field1495[var23] * var10 + var9 + var22;
                        this.field1493[var21][var24] = var25;
                        if (var12) {
                            var22 = var25;
                        }
                        var23++;
                    }
                }
            }
        }
    }

    @ObfuscatedName("cn.i()V")
    public void method1948() {
        int[] var1 = new int[this.field1497];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field1497; var3++) {
            int var4 = this.field1492[var3];
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
        this.field1494 = new int[8];
        int var13 = 0;
        for (int var14 = 0; var14 < this.field1497; var14++) {
            int var15 = this.field1492[var14];
            if (var15 != 0) {
                int var16 = var1[var14];
                int var17 = 0;
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = Integer.MIN_VALUE >>> var18;
                    if ((var16 & var19) == 0) {
                        var17++;
                    } else {
                        if (this.field1494[var17] == 0) {
                            this.field1494[var17] = var13;
                        }
                        var17 = this.field1494[var17];
                    }
                    if (var17 >= this.field1494.length) {
                        int[] var20 = new int[this.field1494.length * 2];
                        for (int var21 = 0; var21 < this.field1494.length; var21++) {
                            var20[var21] = this.field1494[var21];
                        }
                        this.field1494 = var20;
                    }
                    int var22 = var19 >>> 1;
                }
                this.field1494[var17] = ~var14;
                if (var17 >= var13) {
                    var13 = var17 + 1;
                }
            }
        }
    }

    @ObfuscatedName("cn.o()I")
    public int method1945() {
        int var1;
        for (var1 = 0; this.field1494[var1] >= 0; var1 = class105.method1990() == 0 ? var1 + 1 : this.field1494[var1]) {
        }
        return ~this.field1494[var1];
    }

    @ObfuscatedName("cn.j()[F")
    public float[] method1946() {
        return this.field1493[this.method1945()];
    }
}
