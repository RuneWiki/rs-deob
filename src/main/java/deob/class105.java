package deob;

@ObfuscatedName("dh")
public class class105 {

    @ObfuscatedName("dh.z")
    public int[] field1374 = new int[2];

    @ObfuscatedName("dh.s")
    public int[][][] field1380 = new int[2][2][4];

    @ObfuscatedName("dh.l")
    public int[][][] field1378 = new int[2][2][4];

    @ObfuscatedName("dh.u")
    public int[] field1375 = new int[2];

    @ObfuscatedName("dh.q")
    public static float[][] field1371 = new float[2][8];

    @ObfuscatedName("dh.k")
    public static int[][] field1377 = new int[2][8];

    @ObfuscatedName("dh.z(IIF)F")
    public float method2243(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1378[arg0][1][arg1] - this.field1378[arg0][0][arg1]) * arg2 + (float) this.field1378[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("dh.w(F)F")
    public static float method2244(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("dh.s(IIF)F")
    public float method2245(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1380[arg0][1][arg1] - this.field1380[arg0][0][arg1]) * arg2 + (float) this.field1380[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method2244(var5);
    }

    @ObfuscatedName("dh.l(IF)I")
    public int method2251(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1375[1] - this.field1375[0]) * arg1 + (float) this.field1375[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1382 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1379 = (int) (Statics.field1382 * 65536.0F);
        }
        if (this.field1374[arg0] == 0) {
            return 0;
        }
        float var5 = this.method2243(arg0, 0, arg1);
        field1371[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method2245(arg0, 0, arg1));
        field1371[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1374[arg0]; var6++) {
            float var7 = this.method2243(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method2245(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1371[arg0][var6 * 2 + 1] = field1371[arg0][var6 * 2 - 1] * var9;
            field1371[arg0][var6 * 2] = field1371[arg0][var6 * 2 - 1] * var8 + field1371[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1371[arg0][var10] += field1371[arg0][var10 - 1] * var8 + field1371[arg0][var10 - 2] * var9;
            }
            field1371[arg0][1] += field1371[arg0][0] * var8 + var9;
            field1371[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1374[0] * 2; var11++) {
                field1371[0][var11] *= Statics.field1382;
            }
        }
        for (int var12 = 0; var12 < this.field1374[arg0] * 2; var12++) {
            field1377[arg0][var12] = (int) (field1371[arg0][var12] * 65536.0F);
        }
        return this.field1374[arg0] * 2;
    }

    @ObfuscatedName("dh.u(Lgk;Lcj;)V")
    public final void method2248(class183 arg0, class97 arg1) {
        int var3 = arg0.method3247();
        this.field1374[0] = var3 >> 4;
        this.field1374[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1375;
            this.field1375[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1375[0] = arg0.method3253();
        this.field1375[1] = arg0.method3253();
        int var4 = arg0.method3247();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1374[var5]; var6++) {
                this.field1380[var5][0][var6] = arg0.method3253();
                this.field1378[var5][0][var6] = arg0.method3253();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1374[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1380[var7][1][var8] = this.field1380[var7][0][var8];
                    this.field1378[var7][1][var8] = this.field1378[var7][0][var8];
                } else {
                    this.field1380[var7][1][var8] = arg0.method3253();
                    this.field1378[var7][1][var8] = arg0.method3253();
                }
            }
        }
        if (var4 != 0 || this.field1375[1] != this.field1375[0]) {
            arg1.method2041(arg0);
        }
    }
}
