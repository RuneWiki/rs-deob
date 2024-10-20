package deob;

@ObfuscatedName("di")
public class class119 {

    @ObfuscatedName("di.n")
    public int[] field1714 = new int[2];

    @ObfuscatedName("di.i")
    public int[][][] field1719 = new int[2][2][4];

    @ObfuscatedName("di.j")
    public int[][][] field1718 = new int[2][2][4];

    @ObfuscatedName("di.f")
    public int[] field1716 = new int[2];

    @ObfuscatedName("di.m")
    public static float[][] field1712 = new float[2][8];

    @ObfuscatedName("di.c")
    public static int[][] field1722 = new int[2][8];

    @ObfuscatedName("di.n(IIF)F")
    public float method2109(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1718[arg0][1][arg1] - this.field1718[arg0][0][arg1]) * arg2 + (float) this.field1718[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("di.p(F)F")
    public static float method2110(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("di.i(IIF)F")
    public float method2113(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1719[arg0][1][arg1] - this.field1719[arg0][0][arg1]) * arg2 + (float) this.field1719[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method2110(var5);
    }

    @ObfuscatedName("di.j(IF)I")
    public int method2111(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1716[1] - this.field1716[0]) * arg1 + (float) this.field1716[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1717 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1720 = (int) (Statics.field1717 * 65536.0F);
        }
        if (this.field1714[arg0] == 0) {
            return 0;
        }
        float var5 = this.method2109(arg0, 0, arg1);
        field1712[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method2113(arg0, 0, arg1));
        field1712[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1714[arg0]; var6++) {
            float var7 = this.method2109(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method2113(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1712[arg0][var6 * 2 + 1] = field1712[arg0][var6 * 2 - 1] * var9;
            field1712[arg0][var6 * 2] = field1712[arg0][var6 * 2 - 1] * var8 + field1712[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1712[arg0][var10] += field1712[arg0][var10 - 1] * var8 + field1712[arg0][var10 - 2] * var9;
            }
            field1712[arg0][1] += field1712[arg0][0] * var8 + var9;
            field1712[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1714[0] * 2; var11++) {
                field1712[0][var11] *= Statics.field1717;
            }
        }
        for (int var12 = 0; var12 < this.field1714[arg0] * 2; var12++) {
            field1722[arg0][var12] = (int) (field1712[arg0][var12] * 65536.0F);
        }
        return this.field1714[arg0] * 2;
    }

    @ObfuscatedName("di.f(Lfl;Ldd;)V")
    public final void method2112(class174 arg0, class111 arg1) {
        int var3 = arg0.method2925();
        this.field1714[0] = var3 >> 4;
        this.field1714[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1716;
            this.field1716[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1716[0] = arg0.method3065();
        this.field1716[1] = arg0.method3065();
        int var4 = arg0.method2925();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1714[var5]; var6++) {
                this.field1719[var5][0][var6] = arg0.method3065();
                this.field1718[var5][0][var6] = arg0.method3065();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1714[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1719[var7][1][var8] = this.field1719[var7][0][var8];
                    this.field1718[var7][1][var8] = this.field1718[var7][0][var8];
                } else {
                    this.field1719[var7][1][var8] = arg0.method3065();
                    this.field1718[var7][1][var8] = arg0.method3065();
                }
            }
        }
        if (var4 != 0 || this.field1716[1] != this.field1716[0]) {
            arg1.method1903(arg0);
        }
    }
}
