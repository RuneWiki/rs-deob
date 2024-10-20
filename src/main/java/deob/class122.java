package deob;

@ObfuscatedName("bk")
public class class122 {

    @ObfuscatedName("bk.d")
    public int[] field1983;

    @ObfuscatedName("bk.b")
    public int field1981;

    @ObfuscatedName("bk.k")
    public int[] field1980;

    @ObfuscatedName("bk.h")
    public int field1979;

    @ObfuscatedName("bk.w")
    public int[] field1978;

    @ObfuscatedName("bk.t")
    public float[][] field1982;

    public class122() {
        class121.method2139(24);
        this.field1981 = class121.method2139(16);
        this.field1979 = class121.method2139(24);
        this.field1980 = new int[this.field1979];
        boolean var1 = class121.method2150() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class121.method2139(5) + 1;
            while (var2 < this.field1979) {
                int var4 = class121.method2139(class26.method2515(this.field1979 - var2));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field1980[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class121.method2150() != 0;
            for (int var7 = 0; var7 < this.field1979; var7++) {
                if (var6 && class121.method2150() == 0) {
                    this.field1980[var7] = 0;
                } else {
                    this.field1980[var7] = class121.method2139(5) + 1;
                }
            }
        }
        this.method2174();
        int var8 = class121.method2139(4);
        if (var8 > 0) {
            float var9 = class121.method2171(class121.method2139(32));
            float var10 = class121.method2171(class121.method2139(32));
            int var11 = class121.method2139(4) + 1;
            boolean var12 = class121.method2150() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method2183(this.field1979, this.field1981);
            } else {
                var13 = this.field1981 * this.field1979;
            }
            this.field1978 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field1978[var14] = class121.method2139(var11);
            }
            this.field1982 = new float[this.field1979][this.field1981];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field1979; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field1981; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field1978[var19] * var10 + var9 + var16;
                        this.field1982[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field1979; var21++) {
                    float var22 = 0.0F;
                    int var23 = this.field1981 * var21;
                    for (int var24 = 0; var24 < this.field1981; var24++) {
                        float var25 = (float) this.field1978[var23] * var10 + var9 + var22;
                        this.field1982[var21][var24] = var25;
                        if (var12) {
                            var22 = var25;
                        }
                        var23++;
                    }
                }
            }
        }
    }

    @ObfuscatedName("bk.h()V")
    public void method2174() {
        int[] var1 = new int[this.field1979];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field1979; var3++) {
            int var4 = this.field1980[var3];
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
        this.field1983 = new int[8];
        int var13 = 0;
        for (int var14 = 0; var14 < this.field1979; var14++) {
            int var15 = this.field1980[var14];
            if (var15 != 0) {
                int var16 = var1[var14];
                int var17 = 0;
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = Integer.MIN_VALUE >>> var18;
                    if ((var16 & var19) == 0) {
                        var17++;
                    } else {
                        if (this.field1983[var17] == 0) {
                            this.field1983[var17] = var13;
                        }
                        var17 = this.field1983[var17];
                    }
                    if (var17 >= this.field1983.length) {
                        int[] var20 = new int[this.field1983.length * 2];
                        for (int var21 = 0; var21 < this.field1983.length; var21++) {
                            var20[var21] = this.field1983[var21];
                        }
                        this.field1983 = var20;
                    }
                    int var22 = var19 >>> 1;
                }
                this.field1983[var17] = ~var14;
                if (var17 >= var13) {
                    var13 = var17 + 1;
                }
            }
        }
    }

    @ObfuscatedName("bk.k()I")
    public int method2175() {
        int var1;
        for (var1 = 0; this.field1983[var1] >= 0; var1 = class121.method2150() == 0 ? var1 + 1 : this.field1983[var1]) {
        }
        return ~this.field1983[var1];
    }

    @ObfuscatedName("bk.w()[F")
    public float[] method2181() {
        return this.field1982[this.method2175()];
    }

    @ObfuscatedName("bk.b(II)I")
    public static int method2183(int arg0, int arg1) {
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
}
