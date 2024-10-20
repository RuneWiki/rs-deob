package deob;

@ObfuscatedName("dg")
public class class107 {

    @ObfuscatedName("dg.y")
    public int[] field1429 = new int[2];

    @ObfuscatedName("dg.n")
    public int[][][] field1422 = new int[2][2][4];

    @ObfuscatedName("dg.u")
    public int[][][] field1423 = new int[2][2][4];

    @ObfuscatedName("dg.i")
    public int[] field1428 = new int[2];

    @ObfuscatedName("dg.r")
    public static float[][] field1425 = new float[2][8];

    @ObfuscatedName("dg.j")
    public static int[][] field1420 = new int[2][8];

    @ObfuscatedName("dg.y(IIF)F")
    public float method2255(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1423[arg0][1][arg1] - this.field1423[arg0][0][arg1]) * arg2 + (float) this.field1423[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("dg.c(F)F")
    public static float method2256(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("dg.n(IIF)F")
    public float method2257(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1422[arg0][1][arg1] - this.field1422[arg0][0][arg1]) * arg2 + (float) this.field1422[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method2256(var5);
    }

    @ObfuscatedName("dg.u(IF)I")
    public int method2260(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1428[1] - this.field1428[0]) * arg1 + (float) this.field1428[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1427 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1426 = (int) (Statics.field1427 * 65536.0F);
        }
        if (this.field1429[arg0] == 0) {
            return 0;
        }
        float var5 = this.method2255(arg0, 0, arg1);
        field1425[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method2257(arg0, 0, arg1));
        field1425[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1429[arg0]; var6++) {
            float var7 = this.method2255(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method2257(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1425[arg0][var6 * 2 + 1] = field1425[arg0][var6 * 2 - 1] * var9;
            field1425[arg0][var6 * 2] = field1425[arg0][var6 * 2 - 1] * var8 + field1425[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1425[arg0][var10] += field1425[arg0][var10 - 1] * var8 + field1425[arg0][var10 - 2] * var9;
            }
            field1425[arg0][1] += field1425[arg0][0] * var8 + var9;
            field1425[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1429[0] * 2; var11++) {
                field1425[0][var11] *= Statics.field1427;
            }
        }
        for (int var12 = 0; var12 < this.field1429[arg0] * 2; var12++) {
            field1420[arg0][var12] = (int) (field1425[arg0][var12] * 65536.0F);
        }
        return this.field1429[arg0] * 2;
    }

    @ObfuscatedName("dg.i(Lge;Lcx;)V")
    public final void method2259(class185 arg0, class99 arg1) {
        int var3 = arg0.method3299();
        this.field1429[0] = var3 >> 4;
        this.field1429[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1428;
            this.field1428[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1428[0] = arg0.method3280();
        this.field1428[1] = arg0.method3280();
        int var4 = arg0.method3299();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1429[var5]; var6++) {
                this.field1422[var5][0][var6] = arg0.method3280();
                this.field1423[var5][0][var6] = arg0.method3280();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1429[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1422[var7][1][var8] = this.field1422[var7][0][var8];
                    this.field1423[var7][1][var8] = this.field1423[var7][0][var8];
                } else {
                    this.field1422[var7][1][var8] = arg0.method3280();
                    this.field1423[var7][1][var8] = arg0.method3280();
                }
            }
        }
        if (var4 != 0 || this.field1428[1] != this.field1428[0]) {
            arg1.method2074(arg0);
        }
    }
}
