package deob;

@ObfuscatedName("dr")
public class class107 {

    @ObfuscatedName("dr.c")
    public int[] field1439 = new int[2];

    @ObfuscatedName("dr.m")
    public int[][][] field1437 = new int[2][2][4];

    @ObfuscatedName("dr.j")
    public int[][][] field1435 = new int[2][2][4];

    @ObfuscatedName("dr.g")
    public int[] field1445 = new int[2];

    @ObfuscatedName("dr.i")
    public static float[][] field1440 = new float[2][8];

    @ObfuscatedName("dr.h")
    public static int[][] field1436 = new int[2][8];

    @ObfuscatedName("dr.c(IIF)F")
    public float method2213(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1435[arg0][1][arg1] - this.field1435[arg0][0][arg1]) * arg2 + (float) this.field1435[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("dr.q(F)F")
    public static float method2214(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("dr.m(IIF)F")
    public float method2220(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1437[arg0][1][arg1] - this.field1437[arg0][0][arg1]) * arg2 + (float) this.field1437[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method2214(var5);
    }

    @ObfuscatedName("dr.j(IF)I")
    public int method2216(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1445[1] - this.field1445[0]) * arg1 + (float) this.field1445[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1441 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1442 = (int) (Statics.field1441 * 65536.0F);
        }
        if (this.field1439[arg0] == 0) {
            return 0;
        }
        float var5 = this.method2213(arg0, 0, arg1);
        field1440[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method2220(arg0, 0, arg1));
        field1440[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1439[arg0]; var6++) {
            float var7 = this.method2213(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method2220(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1440[arg0][var6 * 2 + 1] = field1440[arg0][var6 * 2 - 1] * var9;
            field1440[arg0][var6 * 2] = field1440[arg0][var6 * 2 - 1] * var8 + field1440[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1440[arg0][var10] += field1440[arg0][var10 - 1] * var8 + field1440[arg0][var10 - 2] * var9;
            }
            field1440[arg0][1] += field1440[arg0][0] * var8 + var9;
            field1440[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1439[0] * 2; var11++) {
                field1440[0][var11] *= Statics.field1441;
            }
        }
        for (int var12 = 0; var12 < this.field1439[arg0] * 2; var12++) {
            field1436[arg0][var12] = (int) (field1440[arg0][var12] * 65536.0F);
        }
        return this.field1439[arg0] * 2;
    }

    @ObfuscatedName("dr.g(Lgg;Lca;)V")
    public final void method2217(class185 arg0, class99 arg1) {
        int var3 = arg0.method3243();
        this.field1439[0] = var3 >> 4;
        this.field1439[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1445;
            this.field1445[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1445[0] = arg0.method3245();
        this.field1445[1] = arg0.method3245();
        int var4 = arg0.method3243();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1439[var5]; var6++) {
                this.field1437[var5][0][var6] = arg0.method3245();
                this.field1435[var5][0][var6] = arg0.method3245();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1439[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1437[var7][1][var8] = this.field1437[var7][0][var8];
                    this.field1435[var7][1][var8] = this.field1435[var7][0][var8];
                } else {
                    this.field1437[var7][1][var8] = arg0.method3245();
                    this.field1435[var7][1][var8] = arg0.method3245();
                }
            }
        }
        if (var4 != 0 || this.field1445[1] != this.field1445[0]) {
            arg1.method2038(arg0);
        }
    }
}
