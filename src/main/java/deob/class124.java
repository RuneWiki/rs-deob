package deob;

@ObfuscatedName("de")
public class class124 {

    @ObfuscatedName("de.n")
    public int[] field1503 = new int[2];

    @ObfuscatedName("de.d")
    public int[][][] field1501 = new int[2][2][4];

    @ObfuscatedName("de.c")
    public int[][][] field1502 = new int[2][2][4];

    @ObfuscatedName("de.y")
    public int[] field1504 = new int[2];

    @ObfuscatedName("de.h")
    public static float[][] field1500 = new float[2][8];

    @ObfuscatedName("de.z")
    public static int[][] field1505 = new int[2][8];

    @ObfuscatedName("de.n(IIF)F")
    public float method2629(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1502[arg0][1][arg1] - this.field1502[arg0][0][arg1]) * arg2 + (float) this.field1502[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("de.v(F)F")
    public static float method2630(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("de.d(IIF)F")
    public float method2631(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1501[arg0][1][arg1] - this.field1501[arg0][0][arg1]) * arg2 + (float) this.field1501[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method2630(var5);
    }

    @ObfuscatedName("de.c(IF)I")
    public int method2632(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1504[1] - this.field1504[0]) * arg1 + (float) this.field1504[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1506 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1507 = (int) (Statics.field1506 * 65536.0F);
        }
        if (this.field1503[arg0] == 0) {
            return 0;
        }
        float var5 = this.method2629(arg0, 0, arg1);
        field1500[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method2631(arg0, 0, arg1));
        field1500[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1503[arg0]; var6++) {
            float var7 = this.method2629(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method2631(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1500[arg0][var6 * 2 + 1] = field1500[arg0][var6 * 2 - 1] * var9;
            field1500[arg0][var6 * 2] = field1500[arg0][var6 * 2 - 1] * var8 + field1500[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1500[arg0][var10] += field1500[arg0][var10 - 1] * var8 + field1500[arg0][var10 - 2] * var9;
            }
            field1500[arg0][1] += field1500[arg0][0] * var8 + var9;
            field1500[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1503[0] * 2; var11++) {
                field1500[0][var11] *= Statics.field1506;
            }
        }
        for (int var12 = 0; var12 < this.field1503[arg0] * 2; var12++) {
            field1505[arg0][var12] = (int) (field1500[arg0][var12] * 65536.0F);
        }
        return this.field1503[arg0] * 2;
    }

    @ObfuscatedName("de.y(Lkx;Lds;)V")
    public final void method2633(class311 arg0, class116 arg1) {
        int var3 = arg0.method5310();
        this.field1503[0] = var3 >> 4;
        this.field1503[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1504;
            this.field1504[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1504[0] = arg0.method5247();
        this.field1504[1] = arg0.method5247();
        int var4 = arg0.method5310();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1503[var5]; var6++) {
                this.field1501[var5][0][var6] = arg0.method5247();
                this.field1502[var5][0][var6] = arg0.method5247();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1503[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1501[var7][1][var8] = this.field1501[var7][0][var8];
                    this.field1502[var7][1][var8] = this.field1502[var7][0][var8];
                } else {
                    this.field1501[var7][1][var8] = arg0.method5247();
                    this.field1502[var7][1][var8] = arg0.method5247();
                }
            }
        }
        if (var4 != 0 || this.field1504[1] != this.field1504[0]) {
            arg1.method2458(arg0);
        }
    }
}
