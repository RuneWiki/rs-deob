package deob;

@ObfuscatedName("dh")
public class class113 {

    @ObfuscatedName("dh.f")
    public int[] field1447 = new int[2];

    @ObfuscatedName("dh.y")
    public int[][][] field1451 = new int[2][2][4];

    @ObfuscatedName("dh.w")
    public int[][][] field1444 = new int[2][2][4];

    @ObfuscatedName("dh.p")
    public int[] field1445 = new int[2];

    @ObfuscatedName("dh.b")
    public static float[][] field1446 = new float[2][8];

    @ObfuscatedName("dh.e")
    public static int[][] field1450 = new int[2][8];

    @ObfuscatedName("dh.f(IIF)F")
    public float method2475(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1444[arg0][1][arg1] - this.field1444[arg0][0][arg1]) * arg2 + (float) this.field1444[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("dh.i(F)F")
    public static float method2477(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("dh.y(IIF)F")
    public float method2465(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1451[arg0][1][arg1] - this.field1451[arg0][0][arg1]) * arg2 + (float) this.field1451[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method2477(var5);
    }

    @ObfuscatedName("dh.w(IF)I")
    public int method2466(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1445[1] - this.field1445[0]) * arg1 + (float) this.field1445[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1448 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1449 = (int) (Statics.field1448 * 65536.0F);
        }
        if (this.field1447[arg0] == 0) {
            return 0;
        }
        float var5 = this.method2475(arg0, 0, arg1);
        field1446[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method2465(arg0, 0, arg1));
        field1446[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1447[arg0]; var6++) {
            float var7 = this.method2475(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method2465(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1446[arg0][var6 * 2 + 1] = field1446[arg0][var6 * 2 - 1] * var9;
            field1446[arg0][var6 * 2] = field1446[arg0][var6 * 2 - 1] * var8 + field1446[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1446[arg0][var10] += field1446[arg0][var10 - 1] * var8 + field1446[arg0][var10 - 2] * var9;
            }
            field1446[arg0][1] += field1446[arg0][0] * var8 + var9;
            field1446[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1447[0] * 2; var11++) {
                field1446[0][var11] *= Statics.field1448;
            }
        }
        for (int var12 = 0; var12 < this.field1447[arg0] * 2; var12++) {
            field1450[arg0][var12] = (int) (field1446[arg0][var12] * 65536.0F);
        }
        return this.field1447[arg0] * 2;
    }

    @ObfuscatedName("dh.p(Lkq;Ldo;)V")
    public final void method2478(class300 arg0, class105 arg1) {
        int var3 = arg0.method5110();
        this.field1447[0] = var3 >> 4;
        this.field1447[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1445;
            this.field1445[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1445[0] = arg0.method5112();
        this.field1445[1] = arg0.method5112();
        int var4 = arg0.method5110();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1447[var5]; var6++) {
                this.field1451[var5][0][var6] = arg0.method5112();
                this.field1444[var5][0][var6] = arg0.method5112();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1447[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1451[var7][1][var8] = this.field1451[var7][0][var8];
                    this.field1444[var7][1][var8] = this.field1444[var7][0][var8];
                } else {
                    this.field1451[var7][1][var8] = arg0.method5112();
                    this.field1444[var7][1][var8] = arg0.method5112();
                }
            }
        }
        if (var4 != 0 || this.field1445[1] != this.field1445[0]) {
            arg1.method2274(arg0);
        }
    }
}
