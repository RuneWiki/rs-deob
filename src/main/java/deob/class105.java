package deob;

@ObfuscatedName("df")
public class class105 {

    @ObfuscatedName("df.w")
    public int[] field1398 = new int[2];

    @ObfuscatedName("df.q")
    public int[][][] field1397 = new int[2][2][4];

    @ObfuscatedName("df.b")
    public int[][][] field1400 = new int[2][2][4];

    @ObfuscatedName("df.f")
    public int[] field1399 = new int[2];

    @ObfuscatedName("df.n")
    public static float[][] field1402 = new float[2][8];

    @ObfuscatedName("df.h")
    public static int[][] field1405 = new int[2][8];

    @ObfuscatedName("df.w(IIF)F")
    public float method2280(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1400[arg0][1][arg1] - this.field1400[arg0][0][arg1]) * arg2 + (float) this.field1400[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("df.m(F)F")
    public static float method2282(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("df.q(IIF)F")
    public float method2292(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1397[arg0][1][arg1] - this.field1397[arg0][0][arg1]) * arg2 + (float) this.field1397[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method2282(var5);
    }

    @ObfuscatedName("df.x(IF)I")
    public int method2279(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1399[1] - this.field1399[0]) * arg1 + (float) this.field1399[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1395 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1403 = (int) (Statics.field1395 * 65536.0F);
        }
        if (this.field1398[arg0] == 0) {
            return 0;
        }
        float var5 = this.method2280(arg0, 0, arg1);
        field1402[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method2292(arg0, 0, arg1));
        field1402[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1398[arg0]; var6++) {
            float var7 = this.method2280(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method2292(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1402[arg0][var6 * 2 + 1] = field1402[arg0][var6 * 2 - 1] * var9;
            field1402[arg0][var6 * 2] = field1402[arg0][var6 * 2 - 1] * var8 + field1402[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1402[arg0][var10] += field1402[arg0][var10 - 1] * var8 + field1402[arg0][var10 - 2] * var9;
            }
            field1402[arg0][1] += field1402[arg0][0] * var8 + var9;
            field1402[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1398[0] * 2; var11++) {
                field1402[0][var11] *= Statics.field1395;
            }
        }
        for (int var12 = 0; var12 < this.field1398[arg0] * 2; var12++) {
            field1405[arg0][var12] = (int) (field1402[arg0][var12] * 65536.0F);
        }
        return this.field1398[arg0] * 2;
    }

    @ObfuscatedName("df.j(Lgy;Lcy;)V")
    public final void method2281(class183 arg0, class97 arg1) {
        int var3 = arg0.method3436();
        this.field1398[0] = var3 >> 4;
        this.field1398[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1399;
            this.field1399[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1399[0] = arg0.method3268();
        this.field1399[1] = arg0.method3268();
        int var4 = arg0.method3436();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1398[var5]; var6++) {
                this.field1397[var5][0][var6] = arg0.method3268();
                this.field1400[var5][0][var6] = arg0.method3268();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1398[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1397[var7][1][var8] = this.field1397[var7][0][var8];
                    this.field1400[var7][1][var8] = this.field1400[var7][0][var8];
                } else {
                    this.field1397[var7][1][var8] = arg0.method3268();
                    this.field1400[var7][1][var8] = arg0.method3268();
                }
            }
        }
        if (var4 != 0 || this.field1399[1] != this.field1399[0]) {
            arg1.method2084(arg0);
        }
    }
}
