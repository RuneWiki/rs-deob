package deob;

@ObfuscatedName("dt")
public class class118 {

    @ObfuscatedName("dt.a")
    public int[] field1607 = new int[2];

    @ObfuscatedName("dt.e")
    public int[][][] field1602 = new int[2][2][4];

    @ObfuscatedName("dt.k")
    public int[][][] field1608 = new int[2][2][4];

    @ObfuscatedName("dt.u")
    public int[] field1600 = new int[2];

    @ObfuscatedName("dt.z")
    public static float[][] field1605 = new float[2][8];

    @ObfuscatedName("dt.t")
    public static int[][] field1606 = new int[2][8];

    @ObfuscatedName("dt.a(IIF)F")
    public float method2078(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1608[arg0][1][arg1] - this.field1608[arg0][0][arg1]) * arg2 + (float) this.field1608[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("dt.w(F)F")
    public static float method2079(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("dt.e(IIF)F")
    public float method2080(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1602[arg0][1][arg1] - this.field1602[arg0][0][arg1]) * arg2 + (float) this.field1602[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method2079(var5);
    }

    @ObfuscatedName("dt.k(IF)I")
    public int method2077(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1600[1] - this.field1600[0]) * arg1 + (float) this.field1600[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1609 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1603 = (int) (Statics.field1609 * 65536.0F);
        }
        if (this.field1607[arg0] == 0) {
            return 0;
        }
        float var5 = this.method2078(arg0, 0, arg1);
        field1605[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method2080(arg0, 0, arg1));
        field1605[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1607[arg0]; var6++) {
            float var7 = this.method2078(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method2080(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1605[arg0][var6 * 2 + 1] = field1605[arg0][var6 * 2 - 1] * var9;
            field1605[arg0][var6 * 2] = field1605[arg0][var6 * 2 - 1] * var8 + field1605[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1605[arg0][var10] += field1605[arg0][var10 - 1] * var8 + field1605[arg0][var10 - 2] * var9;
            }
            field1605[arg0][1] += field1605[arg0][0] * var8 + var9;
            field1605[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1607[0] * 2; var11++) {
                field1605[0][var11] *= Statics.field1609;
            }
        }
        for (int var12 = 0; var12 < this.field1607[arg0] * 2; var12++) {
            field1606[arg0][var12] = (int) (field1605[arg0][var12] * 65536.0F);
        }
        return this.field1607[arg0] * 2;
    }

    @ObfuscatedName("dt.u(Lgh;Ldh;)V")
    public final void method2086(class185 arg0, class110 arg1) {
        int var3 = arg0.method2962();
        this.field1607[0] = var3 >> 4;
        this.field1607[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1600;
            this.field1600[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1600[0] = arg0.method3194();
        this.field1600[1] = arg0.method3194();
        int var4 = arg0.method2962();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1607[var5]; var6++) {
                this.field1602[var5][0][var6] = arg0.method3194();
                this.field1608[var5][0][var6] = arg0.method3194();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1607[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1602[var7][1][var8] = this.field1602[var7][0][var8];
                    this.field1608[var7][1][var8] = this.field1608[var7][0][var8];
                } else {
                    this.field1602[var7][1][var8] = arg0.method3194();
                    this.field1608[var7][1][var8] = arg0.method3194();
                }
            }
        }
        if (var4 != 0 || this.field1600[1] != this.field1600[0]) {
            arg1.method1886(arg0);
        }
    }
}
