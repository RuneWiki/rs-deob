package deob;

@ObfuscatedName("dz")
public class class115 {

    @ObfuscatedName("dz.a")
    public int[] field1467 = new int[2];

    @ObfuscatedName("dz.n")
    public int[][][] field1458 = new int[2][2][4];

    @ObfuscatedName("dz.q")
    public int[][][] field1460 = new int[2][2][4];

    @ObfuscatedName("dz.v")
    public int[] field1456 = new int[2];

    @ObfuscatedName("dz.l")
    public static float[][] field1461 = new float[2][8];

    @ObfuscatedName("dz.c")
    public static int[][] field1462 = new int[2][8];

    @ObfuscatedName("dz.a(IIF)F")
    public float method2582(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1460[arg0][1][arg1] - this.field1460[arg0][0][arg1]) * arg2 + (float) this.field1460[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("dz.t(F)F")
    public static float method2578(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("dz.n(IIF)F")
    public float method2579(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1458[arg0][1][arg1] - this.field1458[arg0][0][arg1]) * arg2 + (float) this.field1458[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method2578(var5);
    }

    @ObfuscatedName("dz.q(IF)I")
    public int method2580(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1456[1] - this.field1456[0]) * arg1 + (float) this.field1456[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1459 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1464 = (int) (Statics.field1459 * 65536.0F);
        }
        if (this.field1467[arg0] == 0) {
            return 0;
        }
        float var5 = this.method2582(arg0, 0, arg1);
        field1461[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method2579(arg0, 0, arg1));
        field1461[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1467[arg0]; var6++) {
            float var7 = this.method2582(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method2579(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1461[arg0][var6 * 2 + 1] = field1461[arg0][var6 * 2 - 1] * var9;
            field1461[arg0][var6 * 2] = field1461[arg0][var6 * 2 - 1] * var8 + field1461[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1461[arg0][var10] += field1461[arg0][var10 - 1] * var8 + field1461[arg0][var10 - 2] * var9;
            }
            field1461[arg0][1] += field1461[arg0][0] * var8 + var9;
            field1461[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1467[0] * 2; var11++) {
                field1461[0][var11] *= Statics.field1459;
            }
        }
        for (int var12 = 0; var12 < this.field1467[arg0] * 2; var12++) {
            field1462[arg0][var12] = (int) (field1461[arg0][var12] * 65536.0F);
        }
        return this.field1467[arg0] * 2;
    }

    @ObfuscatedName("dz.v(Lkc;Ldd;)V")
    public final void method2577(class300 arg0, class107 arg1) {
        int var3 = arg0.method5123();
        this.field1467[0] = var3 >> 4;
        this.field1467[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1456;
            this.field1456[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1456[0] = arg0.method5166();
        this.field1456[1] = arg0.method5166();
        int var4 = arg0.method5123();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1467[var5]; var6++) {
                this.field1458[var5][0][var6] = arg0.method5166();
                this.field1460[var5][0][var6] = arg0.method5166();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1467[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1458[var7][1][var8] = this.field1458[var7][0][var8];
                    this.field1460[var7][1][var8] = this.field1460[var7][0][var8];
                } else {
                    this.field1458[var7][1][var8] = arg0.method5166();
                    this.field1460[var7][1][var8] = arg0.method5166();
                }
            }
        }
        if (var4 != 0 || this.field1456[1] != this.field1456[0]) {
            arg1.method2390(arg0);
        }
    }
}
