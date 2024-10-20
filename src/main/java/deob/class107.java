package deob;

@ObfuscatedName("dc")
public class class107 {

    @ObfuscatedName("dc.g")
    public int[] field1434 = new int[2];

    @ObfuscatedName("dc.e")
    public int[][][] field1441 = new int[2][2][4];

    @ObfuscatedName("dc.q")
    public int[][][] field1437 = new int[2][2][4];

    @ObfuscatedName("dc.c")
    public int[] field1433 = new int[2];

    @ObfuscatedName("dc.l")
    public static float[][] field1436 = new float[2][8];

    @ObfuscatedName("dc.b")
    public static int[][] field1438 = new int[2][8];

    @ObfuscatedName("dc.g(IIF)F")
    public float method2453(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1437[arg0][1][arg1] - this.field1437[arg0][0][arg1]) * arg2 + (float) this.field1437[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("dc.r(F)F")
    public static float method2468(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("dc.e(IIF)F")
    public float method2455(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1441[arg0][1][arg1] - this.field1441[arg0][0][arg1]) * arg2 + (float) this.field1441[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method2468(var5);
    }

    @ObfuscatedName("dc.q(IF)I")
    public int method2469(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1433[1] - this.field1433[0]) * arg1 + (float) this.field1433[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1435 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1439 = (int) (Statics.field1435 * 65536.0F);
        }
        if (this.field1434[arg0] == 0) {
            return 0;
        }
        float var5 = this.method2453(arg0, 0, arg1);
        field1436[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method2455(arg0, 0, arg1));
        field1436[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1434[arg0]; var6++) {
            float var7 = this.method2453(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method2455(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1436[arg0][var6 * 2 + 1] = field1436[arg0][var6 * 2 - 1] * var9;
            field1436[arg0][var6 * 2] = field1436[arg0][var6 * 2 - 1] * var8 + field1436[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1436[arg0][var10] += field1436[arg0][var10 - 1] * var8 + field1436[arg0][var10 - 2] * var9;
            }
            field1436[arg0][1] += field1436[arg0][0] * var8 + var9;
            field1436[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1434[0] * 2; var11++) {
                field1436[0][var11] *= Statics.field1435;
            }
        }
        for (int var12 = 0; var12 < this.field1434[arg0] * 2; var12++) {
            field1438[arg0][var12] = (int) (field1436[arg0][var12] * 65536.0F);
        }
        return this.field1434[arg0] * 2;
    }

    @ObfuscatedName("dc.c(Lgl;Lcj;)V")
    public final void method2457(class185 arg0, class99 arg1) {
        int var3 = arg0.method3679();
        this.field1434[0] = var3 >> 4;
        this.field1434[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1433;
            this.field1433[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1433[0] = arg0.method3467();
        this.field1433[1] = arg0.method3467();
        int var4 = arg0.method3679();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1434[var5]; var6++) {
                this.field1441[var5][0][var6] = arg0.method3467();
                this.field1437[var5][0][var6] = arg0.method3467();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1434[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1441[var7][1][var8] = this.field1441[var7][0][var8];
                    this.field1437[var7][1][var8] = this.field1437[var7][0][var8];
                } else {
                    this.field1441[var7][1][var8] = arg0.method3467();
                    this.field1437[var7][1][var8] = arg0.method3467();
                }
            }
        }
        if (var4 != 0 || this.field1433[1] != this.field1433[0]) {
            arg1.method2249(arg0);
        }
    }
}
