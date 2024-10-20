package deob;

@ObfuscatedName("ds")
public class class115 {

    @ObfuscatedName("ds.z")
    public int[] field1458 = new int[2];

    @ObfuscatedName("ds.v")
    public int[][][] field1459 = new int[2][2][4];

    @ObfuscatedName("ds.u")
    public int[][][] field1453 = new int[2][2][4];

    @ObfuscatedName("ds.r")
    public int[] field1454 = new int[2];

    @ObfuscatedName("ds.p")
    public static float[][] field1455 = new float[2][8];

    @ObfuscatedName("ds.q")
    public static int[][] field1450 = new int[2][8];

    @ObfuscatedName("ds.z(IIF)F")
    public float method2430(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1453[arg0][1][arg1] - this.field1453[arg0][0][arg1]) * arg2 + (float) this.field1453[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("ds.n(F)F")
    public static float method2439(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("ds.v(IIF)F")
    public float method2432(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1459[arg0][1][arg1] - this.field1459[arg0][0][arg1]) * arg2 + (float) this.field1459[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method2439(var5);
    }

    @ObfuscatedName("ds.u(IF)I")
    public int method2433(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1454[1] - this.field1454[0]) * arg1 + (float) this.field1454[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1457 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1452 = (int) (Statics.field1457 * 65536.0F);
        }
        if (this.field1458[arg0] == 0) {
            return 0;
        }
        float var5 = this.method2430(arg0, 0, arg1);
        field1455[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method2432(arg0, 0, arg1));
        field1455[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1458[arg0]; var6++) {
            float var7 = this.method2430(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method2432(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1455[arg0][var6 * 2 + 1] = field1455[arg0][var6 * 2 - 1] * var9;
            field1455[arg0][var6 * 2] = field1455[arg0][var6 * 2 - 1] * var8 + field1455[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1455[arg0][var10] += field1455[arg0][var10 - 1] * var8 + field1455[arg0][var10 - 2] * var9;
            }
            field1455[arg0][1] += field1455[arg0][0] * var8 + var9;
            field1455[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1458[0] * 2; var11++) {
                field1455[0][var11] *= Statics.field1457;
            }
        }
        for (int var12 = 0; var12 < this.field1458[arg0] * 2; var12++) {
            field1450[arg0][var12] = (int) (field1455[arg0][var12] * 65536.0F);
        }
        return this.field1458[arg0] * 2;
    }

    @ObfuscatedName("ds.r(Lkl;Ldm;)V")
    public final void method2434(class300 arg0, class107 arg1) {
        int var3 = arg0.method4990();
        this.field1458[0] = var3 >> 4;
        this.field1458[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1454;
            this.field1454[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1454[0] = arg0.method4992();
        this.field1454[1] = arg0.method4992();
        int var4 = arg0.method4990();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1458[var5]; var6++) {
                this.field1459[var5][0][var6] = arg0.method4992();
                this.field1453[var5][0][var6] = arg0.method4992();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1458[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1459[var7][1][var8] = this.field1459[var7][0][var8];
                    this.field1453[var7][1][var8] = this.field1453[var7][0][var8];
                } else {
                    this.field1459[var7][1][var8] = arg0.method4992();
                    this.field1453[var7][1][var8] = arg0.method4992();
                }
            }
        }
        if (var4 != 0 || this.field1454[1] != this.field1454[0]) {
            arg1.method2223(arg0);
        }
    }
}
