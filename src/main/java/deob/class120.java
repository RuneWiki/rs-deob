package deob;

@ObfuscatedName("ds")
public class class120 {

    @ObfuscatedName("ds.e")
    public int[] field1696 = new int[2];

    @ObfuscatedName("ds.g")
    public int[][][] field1693 = new int[2][2][4];

    @ObfuscatedName("ds.y")
    public int[][][] field1702 = new int[2][2][4];

    @ObfuscatedName("ds.w")
    public int[] field1697 = new int[2];

    @ObfuscatedName("ds.k")
    public static float[][] field1698 = new float[2][8];

    @ObfuscatedName("ds.v")
    public static int[][] field1699 = new int[2][8];

    @ObfuscatedName("ds.e(IIF)F")
    public float method2116(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1702[arg0][1][arg1] - this.field1702[arg0][0][arg1]) * arg2 + (float) this.field1702[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("ds.n(F)F")
    public static float method2126(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("ds.g(IIF)F")
    public float method2118(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1693[arg0][1][arg1] - this.field1693[arg0][0][arg1]) * arg2 + (float) this.field1693[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method2126(var5);
    }

    @ObfuscatedName("ds.y(IF)I")
    public int method2119(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1697[1] - this.field1697[0]) * arg1 + (float) this.field1697[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1700 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1694 = (int) (Statics.field1700 * 65536.0F);
        }
        if (this.field1696[arg0] == 0) {
            return 0;
        }
        float var5 = this.method2116(arg0, 0, arg1);
        field1698[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method2118(arg0, 0, arg1));
        field1698[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1696[arg0]; var6++) {
            float var7 = this.method2116(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method2118(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1698[arg0][var6 * 2 + 1] = field1698[arg0][var6 * 2 - 1] * var9;
            field1698[arg0][var6 * 2] = field1698[arg0][var6 * 2 - 1] * var8 + field1698[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1698[arg0][var10] += field1698[arg0][var10 - 1] * var8 + field1698[arg0][var10 - 2] * var9;
            }
            field1698[arg0][1] += field1698[arg0][0] * var8 + var9;
            field1698[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1696[0] * 2; var11++) {
                field1698[0][var11] *= Statics.field1700;
            }
        }
        for (int var12 = 0; var12 < this.field1696[arg0] * 2; var12++) {
            field1699[arg0][var12] = (int) (field1698[arg0][var12] * 65536.0F);
        }
        return this.field1696[arg0] * 2;
    }

    @ObfuscatedName("ds.w(Lfh;Ldd;)V")
    public final void method2120(class175 arg0, class112 arg1) {
        int var3 = arg0.method2928();
        this.field1696[0] = var3 >> 4;
        this.field1696[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1697;
            this.field1697[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1697[0] = arg0.method3091();
        this.field1697[1] = arg0.method3091();
        int var4 = arg0.method2928();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1696[var5]; var6++) {
                this.field1693[var5][0][var6] = arg0.method3091();
                this.field1702[var5][0][var6] = arg0.method3091();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1696[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1693[var7][1][var8] = this.field1693[var7][0][var8];
                    this.field1702[var7][1][var8] = this.field1702[var7][0][var8];
                } else {
                    this.field1693[var7][1][var8] = arg0.method3091();
                    this.field1702[var7][1][var8] = arg0.method3091();
                }
            }
        }
        if (var4 != 0 || this.field1697[1] != this.field1697[0]) {
            arg1.method1925(arg0);
        }
    }
}
