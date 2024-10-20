package deob;

@ObfuscatedName("dr")
public class class112 {

    @ObfuscatedName("dr.a")
    public int[] field1458 = new int[2];

    @ObfuscatedName("dr.g")
    public int[][][] field1464 = new int[2][2][4];

    @ObfuscatedName("dr.x")
    public int[][][] field1461 = new int[2][2][4];

    @ObfuscatedName("dr.h")
    public int[] field1465 = new int[2];

    @ObfuscatedName("dr.f")
    public static float[][] field1463 = new float[2][8];

    @ObfuscatedName("dr.p")
    public static int[][] field1466 = new int[2][8];

    @ObfuscatedName("dr.a(IIF)F")
    public float method2486(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1461[arg0][1][arg1] - this.field1461[arg0][0][arg1]) * arg2 + (float) this.field1461[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("dr.s(F)F")
    public static float method2483(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("dr.g(IIF)F")
    public float method2477(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1464[arg0][1][arg1] - this.field1464[arg0][0][arg1]) * arg2 + (float) this.field1464[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method2483(var5);
    }

    @ObfuscatedName("dr.x(IF)I")
    public int method2478(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1465[1] - this.field1465[0]) * arg1 + (float) this.field1465[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1460 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1462 = (int) (Statics.field1460 * 65536.0F);
        }
        if (this.field1458[arg0] == 0) {
            return 0;
        }
        float var5 = this.method2486(arg0, 0, arg1);
        field1463[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method2477(arg0, 0, arg1));
        field1463[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1458[arg0]; var6++) {
            float var7 = this.method2486(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method2477(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1463[arg0][var6 * 2 + 1] = field1463[arg0][var6 * 2 - 1] * var9;
            field1463[arg0][var6 * 2] = field1463[arg0][var6 * 2 - 1] * var8 + field1463[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1463[arg0][var10] += field1463[arg0][var10 - 1] * var8 + field1463[arg0][var10 - 2] * var9;
            }
            field1463[arg0][1] += field1463[arg0][0] * var8 + var9;
            field1463[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1458[0] * 2; var11++) {
                field1463[0][var11] *= Statics.field1460;
            }
        }
        for (int var12 = 0; var12 < this.field1458[arg0] * 2; var12++) {
            field1466[arg0][var12] = (int) (field1463[arg0][var12] * 65536.0F);
        }
        return this.field1458[arg0] * 2;
    }

    @ObfuscatedName("dr.h(Lgx;Lcl;)V")
    public final void method2479(class190 arg0, class104 arg1) {
        int var3 = arg0.method3443();
        this.field1458[0] = var3 >> 4;
        this.field1458[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1465;
            this.field1465[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1465[0] = arg0.method3610();
        this.field1465[1] = arg0.method3610();
        int var4 = arg0.method3443();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1458[var5]; var6++) {
                this.field1464[var5][0][var6] = arg0.method3610();
                this.field1461[var5][0][var6] = arg0.method3610();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1458[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1464[var7][1][var8] = this.field1464[var7][0][var8];
                    this.field1461[var7][1][var8] = this.field1461[var7][0][var8];
                } else {
                    this.field1464[var7][1][var8] = arg0.method3610();
                    this.field1461[var7][1][var8] = arg0.method3610();
                }
            }
        }
        if (var4 != 0 || this.field1465[1] != this.field1465[0]) {
            arg1.method2288(arg0);
        }
    }
}
