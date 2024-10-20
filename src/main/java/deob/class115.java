package deob;

@ObfuscatedName("dy")
public class class115 {

    @ObfuscatedName("dy.q")
    public int[] field1491 = new int[2];

    @ObfuscatedName("dy.e")
    public int[][][] field1495 = new int[2][2][4];

    @ObfuscatedName("dy.p")
    public int[][][] field1487 = new int[2][2][4];

    @ObfuscatedName("dy.k")
    public int[] field1488 = new int[2];

    @ObfuscatedName("dy.l")
    public static float[][] field1489 = new float[2][8];

    @ObfuscatedName("dy.b")
    public static int[][] field1486 = new int[2][8];

    @ObfuscatedName("dy.q(IIF)F")
    public float method2433(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1487[arg0][1][arg1] - this.field1487[arg0][0][arg1]) * arg2 + (float) this.field1487[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("dy.w(F)F")
    public static float method2435(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("dy.e(IIF)F")
    public float method2448(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1495[arg0][1][arg1] - this.field1495[arg0][0][arg1]) * arg2 + (float) this.field1495[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method2435(var5);
    }

    @ObfuscatedName("dy.p(IF)I")
    public int method2436(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1488[1] - this.field1488[0]) * arg1 + (float) this.field1488[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1492 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1493 = (int) (Statics.field1492 * 65536.0F);
        }
        if (this.field1491[arg0] == 0) {
            return 0;
        }
        float var5 = this.method2433(arg0, 0, arg1);
        field1489[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method2448(arg0, 0, arg1));
        field1489[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1491[arg0]; var6++) {
            float var7 = this.method2433(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method2448(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1489[arg0][var6 * 2 + 1] = field1489[arg0][var6 * 2 - 1] * var9;
            field1489[arg0][var6 * 2] = field1489[arg0][var6 * 2 - 1] * var8 + field1489[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1489[arg0][var10] += field1489[arg0][var10 - 1] * var8 + field1489[arg0][var10 - 2] * var9;
            }
            field1489[arg0][1] += field1489[arg0][0] * var8 + var9;
            field1489[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1491[0] * 2; var11++) {
                field1489[0][var11] *= Statics.field1492;
            }
        }
        for (int var12 = 0; var12 < this.field1491[arg0] * 2; var12++) {
            field1486[arg0][var12] = (int) (field1489[arg0][var12] * 65536.0F);
        }
        return this.field1491[arg0] * 2;
    }

    @ObfuscatedName("dy.k(Lkf;Ldw;)V")
    public final void method2445(class301 arg0, class107 arg1) {
        int var3 = arg0.method5077();
        this.field1491[0] = var3 >> 4;
        this.field1491[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1488;
            this.field1488[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1488[0] = arg0.method5069();
        this.field1488[1] = arg0.method5069();
        int var4 = arg0.method5077();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1491[var5]; var6++) {
                this.field1495[var5][0][var6] = arg0.method5069();
                this.field1487[var5][0][var6] = arg0.method5069();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1491[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1495[var7][1][var8] = this.field1495[var7][0][var8];
                    this.field1487[var7][1][var8] = this.field1487[var7][0][var8];
                } else {
                    this.field1495[var7][1][var8] = arg0.method5069();
                    this.field1487[var7][1][var8] = arg0.method5069();
                }
            }
        }
        if (var4 != 0 || this.field1488[1] != this.field1488[0]) {
            arg1.method2250(arg0);
        }
    }
}
