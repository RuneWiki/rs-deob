package deob;

@ObfuscatedName("ds")
public class class117 {

    @ObfuscatedName("ds.d")
    public int[] field1694 = new int[2];

    @ObfuscatedName("ds.e")
    public int[][][] field1692 = new int[2][2][4];

    @ObfuscatedName("ds.p")
    public int[][][] field1695 = new int[2][2][4];

    @ObfuscatedName("ds.q")
    public int[] field1698 = new int[2];

    @ObfuscatedName("ds.s")
    public static float[][] field1697 = new float[2][8];

    @ObfuscatedName("ds.r")
    public static int[][] field1702 = new int[2][8];

    @ObfuscatedName("ds.d(IIF)F")
    public float method2151(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1695[arg0][1][arg1] - this.field1695[arg0][0][arg1]) * arg2 + (float) this.field1695[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("ds.k(F)F")
    public static float method2161(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("ds.e(IIF)F")
    public float method2153(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1692[arg0][1][arg1] - this.field1692[arg0][0][arg1]) * arg2 + (float) this.field1692[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method2161(var5);
    }

    @ObfuscatedName("ds.p(IF)I")
    public int method2154(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1698[1] - this.field1698[0]) * arg1 + (float) this.field1698[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1699 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1700 = (int) (Statics.field1699 * 65536.0F);
        }
        if (this.field1694[arg0] == 0) {
            return 0;
        }
        float var5 = this.method2151(arg0, 0, arg1);
        field1697[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method2153(arg0, 0, arg1));
        field1697[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1694[arg0]; var6++) {
            float var7 = this.method2151(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method2153(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1697[arg0][var6 * 2 + 1] = field1697[arg0][var6 * 2 - 1] * var9;
            field1697[arg0][var6 * 2] = field1697[arg0][var6 * 2 - 1] * var8 + field1697[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1697[arg0][var10] += field1697[arg0][var10 - 1] * var8 + field1697[arg0][var10 - 2] * var9;
            }
            field1697[arg0][1] += field1697[arg0][0] * var8 + var9;
            field1697[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1694[0] * 2; var11++) {
                field1697[0][var11] *= Statics.field1699;
            }
        }
        for (int var12 = 0; var12 < this.field1694[arg0] * 2; var12++) {
            field1702[arg0][var12] = (int) (field1697[arg0][var12] * 65536.0F);
        }
        return this.field1694[arg0] * 2;
    }

    @ObfuscatedName("ds.q(Lfg;Lda;)V")
    public final void method2155(class174 arg0, class109 arg1) {
        int var3 = arg0.method2955();
        this.field1694[0] = var3 >> 4;
        this.field1694[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1698;
            this.field1698[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1698[0] = arg0.method3035();
        this.field1698[1] = arg0.method3035();
        int var4 = arg0.method2955();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1694[var5]; var6++) {
                this.field1692[var5][0][var6] = arg0.method3035();
                this.field1695[var5][0][var6] = arg0.method3035();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1694[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1692[var7][1][var8] = this.field1692[var7][0][var8];
                    this.field1695[var7][1][var8] = this.field1695[var7][0][var8];
                } else {
                    this.field1692[var7][1][var8] = arg0.method3035();
                    this.field1695[var7][1][var8] = arg0.method3035();
                }
            }
        }
        if (var4 != 0 || this.field1698[1] != this.field1698[0]) {
            arg1.method1954(arg0);
        }
    }
}
