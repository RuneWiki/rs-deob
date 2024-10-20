package deob;

@ObfuscatedName("dl")
public class class115 {

    @ObfuscatedName("dl.c")
    public int[] field1449 = new int[2];

    @ObfuscatedName("dl.t")
    public int[][][] field1459 = new int[2][2][4];

    @ObfuscatedName("dl.g")
    public int[][][] field1451 = new int[2][2][4];

    @ObfuscatedName("dl.l")
    public int[] field1452 = new int[2];

    @ObfuscatedName("dl.u")
    public static float[][] field1448 = new float[2][8];

    @ObfuscatedName("dl.j")
    public static int[][] field1454 = new int[2][8];

    @ObfuscatedName("dl.c(IIF)F")
    public float method2465(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1451[arg0][1][arg1] - this.field1451[arg0][0][arg1]) * arg2 + (float) this.field1451[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("dl.x(F)F")
    public static float method2469(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("dl.t(IIF)F")
    public float method2467(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1459[arg0][1][arg1] - this.field1459[arg0][0][arg1]) * arg2 + (float) this.field1459[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method2469(var5);
    }

    @ObfuscatedName("dl.g(IF)I")
    public int method2470(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1452[1] - this.field1452[0]) * arg1 + (float) this.field1452[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1455 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1450 = (int) (Statics.field1455 * 65536.0F);
        }
        if (this.field1449[arg0] == 0) {
            return 0;
        }
        float var5 = this.method2465(arg0, 0, arg1);
        field1448[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method2467(arg0, 0, arg1));
        field1448[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1449[arg0]; var6++) {
            float var7 = this.method2465(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method2467(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1448[arg0][var6 * 2 + 1] = field1448[arg0][var6 * 2 - 1] * var9;
            field1448[arg0][var6 * 2] = field1448[arg0][var6 * 2 - 1] * var8 + field1448[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1448[arg0][var10] += field1448[arg0][var10 - 1] * var8 + field1448[arg0][var10 - 2] * var9;
            }
            field1448[arg0][1] += field1448[arg0][0] * var8 + var9;
            field1448[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1449[0] * 2; var11++) {
                field1448[0][var11] *= Statics.field1455;
            }
        }
        for (int var12 = 0; var12 < this.field1449[arg0] * 2; var12++) {
            field1454[arg0][var12] = (int) (field1448[arg0][var12] * 65536.0F);
        }
        return this.field1449[arg0] * 2;
    }

    @ObfuscatedName("dl.l(Lkz;Ldo;)V")
    public final void method2476(class300 arg0, class107 arg1) {
        int var3 = arg0.method5103();
        this.field1449[0] = var3 >> 4;
        this.field1449[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1452;
            this.field1452[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1452[0] = arg0.method5304();
        this.field1452[1] = arg0.method5304();
        int var4 = arg0.method5103();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1449[var5]; var6++) {
                this.field1459[var5][0][var6] = arg0.method5304();
                this.field1451[var5][0][var6] = arg0.method5304();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1449[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1459[var7][1][var8] = this.field1459[var7][0][var8];
                    this.field1451[var7][1][var8] = this.field1451[var7][0][var8];
                } else {
                    this.field1459[var7][1][var8] = arg0.method5304();
                    this.field1451[var7][1][var8] = arg0.method5304();
                }
            }
        }
        if (var4 != 0 || this.field1452[1] != this.field1452[0]) {
            arg1.method2269(arg0);
        }
    }
}
