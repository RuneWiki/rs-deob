package deob;

@ObfuscatedName("ds")
public class class119 {

    @ObfuscatedName("ds.e")
    public int[] field1709 = new int[2];

    @ObfuscatedName("ds.m")
    public int[][][] field1706 = new int[2][2][4];

    @ObfuscatedName("ds.g")
    public int[][][] field1711 = new int[2][2][4];

    @ObfuscatedName("ds.d")
    public int[] field1708 = new int[2];

    @ObfuscatedName("ds.b")
    public static float[][] field1715 = new float[2][8];

    @ObfuscatedName("ds.k")
    public static int[][] field1707 = new int[2][8];

    @ObfuscatedName("ds.e(IIF)F")
    public float method2077(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1711[arg0][1][arg1] - this.field1711[arg0][0][arg1]) * arg2 + (float) this.field1711[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("ds.o(F)F")
    public static float method2078(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("ds.m(IIF)F")
    public float method2079(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1706[arg0][1][arg1] - this.field1706[arg0][0][arg1]) * arg2 + (float) this.field1706[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method2078(var5);
    }

    @ObfuscatedName("ds.g(IF)I")
    public int method2080(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1708[1] - this.field1708[0]) * arg1 + (float) this.field1708[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1710 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1712 = (int) (Statics.field1710 * 65536.0F);
        }
        if (this.field1709[arg0] == 0) {
            return 0;
        }
        float var5 = this.method2077(arg0, 0, arg1);
        field1715[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method2079(arg0, 0, arg1));
        field1715[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1709[arg0]; var6++) {
            float var7 = this.method2077(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method2079(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1715[arg0][var6 * 2 + 1] = field1715[arg0][var6 * 2 - 1] * var9;
            field1715[arg0][var6 * 2] = field1715[arg0][var6 * 2 - 1] * var8 + field1715[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1715[arg0][var10] += field1715[arg0][var10 - 1] * var8 + field1715[arg0][var10 - 2] * var9;
            }
            field1715[arg0][1] += field1715[arg0][0] * var8 + var9;
            field1715[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1709[0] * 2; var11++) {
                field1715[0][var11] *= Statics.field1710;
            }
        }
        for (int var12 = 0; var12 < this.field1709[arg0] * 2; var12++) {
            field1707[arg0][var12] = (int) (field1715[arg0][var12] * 65536.0F);
        }
        return this.field1709[arg0] * 2;
    }

    @ObfuscatedName("ds.d(Lfw;Ldj;)V")
    public final void method2081(class174 arg0, class111 arg1) {
        int var3 = arg0.method2891();
        this.field1709[0] = var3 >> 4;
        this.field1709[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1708;
            this.field1708[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1708[0] = arg0.method2930();
        this.field1708[1] = arg0.method2930();
        int var4 = arg0.method2891();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1709[var5]; var6++) {
                this.field1706[var5][0][var6] = arg0.method2930();
                this.field1711[var5][0][var6] = arg0.method2930();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1709[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1706[var7][1][var8] = this.field1706[var7][0][var8];
                    this.field1711[var7][1][var8] = this.field1711[var7][0][var8];
                } else {
                    this.field1706[var7][1][var8] = arg0.method2930();
                    this.field1711[var7][1][var8] = arg0.method2930();
                }
            }
        }
        if (var4 != 0 || this.field1708[1] != this.field1708[0]) {
            arg1.method1881(arg0);
        }
    }
}
