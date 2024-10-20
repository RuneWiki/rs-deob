package deob;

@ObfuscatedName("bp")
public class class119 {

    @ObfuscatedName("bp.n")
    public static int[][] field1830 = new int[2][8];

    @ObfuscatedName("bp.o")
    public int[][][] field1826 = new int[2][2][4];

    @ObfuscatedName("bp.j")
    public int[] field1828 = new int[2];

    @ObfuscatedName("bp.h")
    public int[] field1824 = new int[2];

    @ObfuscatedName("bp.t")
    public int[][][] field1827 = new int[2][2][4];

    @ObfuscatedName("bp.r")
    public static float[][] field1833 = new float[2][8];

    @ObfuscatedName("bp.h(Ldy;Lbb;)V")
    public final void method1987(class31 arg0, class129 arg1) {
        int var3 = arg0.method512();
        this.field1828[0] = var3 >> 4;
        this.field1828[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1824;
            this.field1824[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1824[0] = arg0.method373();
        this.field1824[1] = arg0.method373();
        int var4 = arg0.method512();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1828[var5]; var6++) {
                this.field1826[var5][0][var6] = arg0.method373();
                this.field1827[var5][0][var6] = arg0.method373();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1828[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1826[var7][1][var8] = this.field1826[var7][0][var8];
                    this.field1827[var7][1][var8] = this.field1827[var7][0][var8];
                } else {
                    this.field1826[var7][1][var8] = arg0.method373();
                    this.field1827[var7][1][var8] = arg0.method373();
                }
            }
        }
        if (var4 != 0 || this.field1824[1] != this.field1824[0]) {
            arg1.method2181(arg0);
        }
    }

    @ObfuscatedName("bp.j(IIF)F")
    public float method1988(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1827[arg0][1][arg1] - this.field1827[arg0][0][arg1]) * arg2 + (float) this.field1827[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("bp.p(F)F")
    public static float method1989(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("bp.t(IF)I")
    public int method1991(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1824[1] - this.field1824[0]) * arg1 + (float) this.field1824[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1831 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1832 = (int) (Statics.field1831 * 65536.0F);
        }
        if (this.field1828[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1988(arg0, 0, arg1);
        field1833[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1994(arg0, 0, arg1));
        field1833[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1828[arg0]; var6++) {
            float var7 = this.method1988(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1994(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1833[arg0][var6 * 2 + 1] = field1833[arg0][var6 * 2 - 1] * var9;
            field1833[arg0][var6 * 2] = field1833[arg0][var6 * 2 - 1] * var8 + field1833[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1833[arg0][var10] += field1833[arg0][var10 - 1] * var8 + field1833[arg0][var10 - 2] * var9;
            }
            field1833[arg0][1] += field1833[arg0][0] * var8 + var9;
            field1833[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1828[0] * 2; var11++) {
                field1833[0][var11] *= Statics.field1831;
            }
        }
        for (int var12 = 0; var12 < this.field1828[arg0] * 2; var12++) {
            field1830[arg0][var12] = (int) (field1833[arg0][var12] * 65536.0F);
        }
        return this.field1828[arg0] * 2;
    }

    @ObfuscatedName("bp.o(IIF)F")
    public float method1994(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1826[arg0][1][arg1] - this.field1826[arg0][0][arg1]) * arg2 + (float) this.field1826[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1989(var5);
    }
}
