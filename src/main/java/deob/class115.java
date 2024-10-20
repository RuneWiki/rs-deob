package deob;

@ObfuscatedName("dp")
public class class115 {

    @ObfuscatedName("dp.s")
    public int[] field1472 = new int[2];

    @ObfuscatedName("dp.i")
    public int[][][] field1468 = new int[2][2][4];

    @ObfuscatedName("dp.k")
    public int[][][] field1471 = new int[2][2][4];

    @ObfuscatedName("dp.u")
    public int[] field1470 = new int[2];

    @ObfuscatedName("dp.n")
    public static float[][] field1476 = new float[2][8];

    @ObfuscatedName("dp.t")
    public static int[][] field1467 = new int[2][8];

    @ObfuscatedName("dp.s(IIF)F")
    public float method2457(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1471[arg0][1][arg1] - this.field1471[arg0][0][arg1]) * arg2 + (float) this.field1471[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("dp.j(F)F")
    public static float method2458(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("dp.i(IIF)F")
    public float method2464(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1468[arg0][1][arg1] - this.field1468[arg0][0][arg1]) * arg2 + (float) this.field1468[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method2458(var5);
    }

    @ObfuscatedName("dp.k(IF)I")
    public int method2460(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1470[1] - this.field1470[0]) * arg1 + (float) this.field1470[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1469 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1474 = (int) (Statics.field1469 * 65536.0F);
        }
        if (this.field1472[arg0] == 0) {
            return 0;
        }
        float var5 = this.method2457(arg0, 0, arg1);
        field1476[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method2464(arg0, 0, arg1));
        field1476[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1472[arg0]; var6++) {
            float var7 = this.method2457(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method2464(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1476[arg0][var6 * 2 + 1] = field1476[arg0][var6 * 2 - 1] * var9;
            field1476[arg0][var6 * 2] = field1476[arg0][var6 * 2 - 1] * var8 + field1476[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1476[arg0][var10] += field1476[arg0][var10 - 1] * var8 + field1476[arg0][var10 - 2] * var9;
            }
            field1476[arg0][1] += field1476[arg0][0] * var8 + var9;
            field1476[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1472[0] * 2; var11++) {
                field1476[0][var11] *= Statics.field1469;
            }
        }
        for (int var12 = 0; var12 < this.field1472[arg0] * 2; var12++) {
            field1467[arg0][var12] = (int) (field1476[arg0][var12] * 65536.0F);
        }
        return this.field1472[arg0] * 2;
    }

    @ObfuscatedName("dp.u(Lky;Ldv;)V")
    public final void method2472(class300 arg0, class107 arg1) {
        int var3 = arg0.method5179();
        this.field1472[0] = var3 >> 4;
        this.field1472[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1470;
            this.field1470[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1470[0] = arg0.method5054();
        this.field1470[1] = arg0.method5054();
        int var4 = arg0.method5179();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1472[var5]; var6++) {
                this.field1468[var5][0][var6] = arg0.method5054();
                this.field1471[var5][0][var6] = arg0.method5054();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1472[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1468[var7][1][var8] = this.field1468[var7][0][var8];
                    this.field1471[var7][1][var8] = this.field1471[var7][0][var8];
                } else {
                    this.field1468[var7][1][var8] = arg0.method5054();
                    this.field1471[var7][1][var8] = arg0.method5054();
                }
            }
        }
        if (var4 != 0 || this.field1470[1] != this.field1470[0]) {
            arg1.method2261(arg0);
        }
    }
}
