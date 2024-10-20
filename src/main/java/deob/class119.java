package deob;

@ObfuscatedName("dm")
public class class119 {

    @ObfuscatedName("dm.i")
    public int[] field1728 = new int[2];

    @ObfuscatedName("dm.e")
    public int[][][] field1723 = new int[2][2][4];

    @ObfuscatedName("dm.v")
    public int[][][] field1724 = new int[2][2][4];

    @ObfuscatedName("dm.b")
    public int[] field1727 = new int[2];

    @ObfuscatedName("dm.y")
    public static float[][] field1726 = new float[2][8];

    @ObfuscatedName("dm.h")
    public static int[][] field1729 = new int[2][8];

    @ObfuscatedName("dm.i(IIF)F")
    public float method2067(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1724[arg0][1][arg1] - this.field1724[arg0][0][arg1]) * arg2 + (float) this.field1724[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("dm.c(F)F")
    public static float method2069(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("dm.e(IIF)F")
    public float method2079(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1723[arg0][1][arg1] - this.field1723[arg0][0][arg1]) * arg2 + (float) this.field1723[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method2069(var5);
    }

    @ObfuscatedName("dm.v(IF)I")
    public int method2071(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1727[1] - this.field1727[0]) * arg1 + (float) this.field1727[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1732 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1730 = (int) (Statics.field1732 * 65536.0F);
        }
        if (this.field1728[arg0] == 0) {
            return 0;
        }
        float var5 = this.method2067(arg0, 0, arg1);
        field1726[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method2079(arg0, 0, arg1));
        field1726[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1728[arg0]; var6++) {
            float var7 = this.method2067(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method2079(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1726[arg0][var6 * 2 + 1] = field1726[arg0][var6 * 2 - 1] * var9;
            field1726[arg0][var6 * 2] = field1726[arg0][var6 * 2 - 1] * var8 + field1726[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1726[arg0][var10] += field1726[arg0][var10 - 1] * var8 + field1726[arg0][var10 - 2] * var9;
            }
            field1726[arg0][1] += field1726[arg0][0] * var8 + var9;
            field1726[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1728[0] * 2; var11++) {
                field1726[0][var11] *= Statics.field1732;
            }
        }
        for (int var12 = 0; var12 < this.field1728[arg0] * 2; var12++) {
            field1729[arg0][var12] = (int) (field1726[arg0][var12] * 65536.0F);
        }
        return this.field1728[arg0] * 2;
    }

    @ObfuscatedName("dm.b(Lfx;Ldd;)V")
    public final void method2070(class174 arg0, class111 arg1) {
        int var3 = arg0.method2870();
        this.field1728[0] = var3 >> 4;
        this.field1728[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1727;
            this.field1727[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1727[0] = arg0.method2872();
        this.field1727[1] = arg0.method2872();
        int var4 = arg0.method2870();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1728[var5]; var6++) {
                this.field1723[var5][0][var6] = arg0.method2872();
                this.field1724[var5][0][var6] = arg0.method2872();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1728[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1723[var7][1][var8] = this.field1723[var7][0][var8];
                    this.field1724[var7][1][var8] = this.field1724[var7][0][var8];
                } else {
                    this.field1723[var7][1][var8] = arg0.method2872();
                    this.field1724[var7][1][var8] = arg0.method2872();
                }
            }
        }
        if (var4 != 0 || this.field1727[1] != this.field1727[0]) {
            arg1.method1893(arg0);
        }
    }
}
