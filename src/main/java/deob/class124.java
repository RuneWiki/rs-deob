package deob;

@ObfuscatedName("da")
public class class124 {

    @ObfuscatedName("da.m")
    public int[] field1514 = new int[2];

    @ObfuscatedName("da.q")
    public int[][][] field1517 = new int[2][2][4];

    @ObfuscatedName("da.j")
    public int[][][] field1509 = new int[2][2][4];

    @ObfuscatedName("da.p")
    public int[] field1510 = new int[2];

    @ObfuscatedName("da.g")
    public static float[][] field1511 = new float[2][8];

    @ObfuscatedName("da.n")
    public static int[][] field1512 = new int[2][8];

    @ObfuscatedName("da.m(IIF)F")
    public float method2562(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1509[arg0][1][arg1] - this.field1509[arg0][0][arg1]) * arg2 + (float) this.field1509[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("da.o(F)F")
    public static float method2558(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("da.q(IIF)F")
    public float method2557(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1517[arg0][1][arg1] - this.field1517[arg0][0][arg1]) * arg2 + (float) this.field1517[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method2558(var5);
    }

    @ObfuscatedName("da.j(IF)I")
    public int method2565(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1510[1] - this.field1510[0]) * arg1 + (float) this.field1510[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1508 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1515 = (int) (Statics.field1508 * 65536.0F);
        }
        if (this.field1514[arg0] == 0) {
            return 0;
        }
        float var5 = this.method2562(arg0, 0, arg1);
        field1511[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method2557(arg0, 0, arg1));
        field1511[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1514[arg0]; var6++) {
            float var7 = this.method2562(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method2557(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1511[arg0][var6 * 2 + 1] = field1511[arg0][var6 * 2 - 1] * var9;
            field1511[arg0][var6 * 2] = field1511[arg0][var6 * 2 - 1] * var8 + field1511[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1511[arg0][var10] += field1511[arg0][var10 - 1] * var8 + field1511[arg0][var10 - 2] * var9;
            }
            field1511[arg0][1] += field1511[arg0][0] * var8 + var9;
            field1511[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1514[0] * 2; var11++) {
                field1511[0][var11] *= Statics.field1508;
            }
        }
        for (int var12 = 0; var12 < this.field1514[arg0] * 2; var12++) {
            field1512[arg0][var12] = (int) (field1511[arg0][var12] * 65536.0F);
        }
        return this.field1514[arg0] * 2;
    }

    @ObfuscatedName("da.p(Lkn;Lds;)V")
    public final void method2561(class310 arg0, class116 arg1) {
        int var3 = arg0.method5227();
        this.field1514[0] = var3 >> 4;
        this.field1514[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1510;
            this.field1510[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1510[0] = arg0.method5283();
        this.field1510[1] = arg0.method5283();
        int var4 = arg0.method5227();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1514[var5]; var6++) {
                this.field1517[var5][0][var6] = arg0.method5283();
                this.field1509[var5][0][var6] = arg0.method5283();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1514[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1517[var7][1][var8] = this.field1517[var7][0][var8];
                    this.field1509[var7][1][var8] = this.field1509[var7][0][var8];
                } else {
                    this.field1517[var7][1][var8] = arg0.method5283();
                    this.field1509[var7][1][var8] = arg0.method5283();
                }
            }
        }
        if (var4 != 0 || this.field1510[1] != this.field1510[0]) {
            arg1.method2370(arg0);
        }
    }
}
