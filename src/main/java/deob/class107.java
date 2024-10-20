package deob;

@ObfuscatedName("dq")
public class class107 {

    @ObfuscatedName("dq.f")
    public int[] field1422 = new int[2];

    @ObfuscatedName("dq.e")
    public int[][][] field1418 = new int[2][2][4];

    @ObfuscatedName("dq.b")
    public int[][][] field1419 = new int[2][2][4];

    @ObfuscatedName("dq.l")
    public int[] field1420 = new int[2];

    @ObfuscatedName("dq.w")
    public static float[][] field1421 = new float[2][8];

    @ObfuscatedName("dq.d")
    public static int[][] field1426 = new int[2][8];

    @ObfuscatedName("dq.f(IIF)F")
    public float method2259(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1419[arg0][1][arg1] - this.field1419[arg0][0][arg1]) * arg2 + (float) this.field1419[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("dq.h(F)F")
    public static float method2260(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("dq.e(IIF)F")
    public float method2262(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1418[arg0][1][arg1] - this.field1418[arg0][0][arg1]) * arg2 + (float) this.field1418[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method2260(var5);
    }

    @ObfuscatedName("dq.b(IF)I")
    public int method2263(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1420[1] - this.field1420[0]) * arg1 + (float) this.field1420[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1423 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1416 = (int) (Statics.field1423 * 65536.0F);
        }
        if (this.field1422[arg0] == 0) {
            return 0;
        }
        float var5 = this.method2259(arg0, 0, arg1);
        field1421[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method2262(arg0, 0, arg1));
        field1421[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1422[arg0]; var6++) {
            float var7 = this.method2259(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method2262(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1421[arg0][var6 * 2 + 1] = field1421[arg0][var6 * 2 - 1] * var9;
            field1421[arg0][var6 * 2] = field1421[arg0][var6 * 2 - 1] * var8 + field1421[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1421[arg0][var10] += field1421[arg0][var10 - 1] * var8 + field1421[arg0][var10 - 2] * var9;
            }
            field1421[arg0][1] += field1421[arg0][0] * var8 + var9;
            field1421[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1422[0] * 2; var11++) {
                field1421[0][var11] *= Statics.field1423;
            }
        }
        for (int var12 = 0; var12 < this.field1422[arg0] * 2; var12++) {
            field1426[arg0][var12] = (int) (field1421[arg0][var12] * 65536.0F);
        }
        return this.field1422[arg0] * 2;
    }

    @ObfuscatedName("dq.l(Lgx;Lcx;)V")
    public final void method2265(class185 arg0, class99 arg1) {
        int var3 = arg0.method3323();
        this.field1422[0] = var3 >> 4;
        this.field1422[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1420;
            this.field1420[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1420[0] = arg0.method3325();
        this.field1420[1] = arg0.method3325();
        int var4 = arg0.method3323();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1422[var5]; var6++) {
                this.field1418[var5][0][var6] = arg0.method3325();
                this.field1419[var5][0][var6] = arg0.method3325();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1422[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1418[var7][1][var8] = this.field1418[var7][0][var8];
                    this.field1419[var7][1][var8] = this.field1419[var7][0][var8];
                } else {
                    this.field1418[var7][1][var8] = arg0.method3325();
                    this.field1419[var7][1][var8] = arg0.method3325();
                }
            }
        }
        if (var4 != 0 || this.field1420[1] != this.field1420[0]) {
            arg1.method2083(arg0);
        }
    }
}
