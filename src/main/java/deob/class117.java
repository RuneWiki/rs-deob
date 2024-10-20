package deob;

@ObfuscatedName("du")
public class class117 {

    @ObfuscatedName("du.g")
    public int[] field1610 = new int[2];

    @ObfuscatedName("du.b")
    public int[][][] field1612 = new int[2][2][4];

    @ObfuscatedName("du.z")
    public int[][][] field1613 = new int[2][2][4];

    @ObfuscatedName("du.n")
    public int[] field1614 = new int[2];

    @ObfuscatedName("du.l")
    public static float[][] field1615 = new float[2][8];

    @ObfuscatedName("du.s")
    public static int[][] field1616 = new int[2][8];

    @ObfuscatedName("du.g(IIF)F")
    public float method2371(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1613[arg0][1][arg1] - this.field1613[arg0][0][arg1]) * arg2 + (float) this.field1613[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("du.e(F)F")
    public static float method2374(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("du.b(IIF)F")
    public float method2373(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1612[arg0][1][arg1] - this.field1612[arg0][0][arg1]) * arg2 + (float) this.field1612[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method2374(var5);
    }

    @ObfuscatedName("du.z(IF)I")
    public int method2379(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1614[1] - this.field1614[0]) * arg1 + (float) this.field1614[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1620 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1621 = (int) (Statics.field1620 * 65536.0F);
        }
        if (this.field1610[arg0] == 0) {
            return 0;
        }
        float var5 = this.method2371(arg0, 0, arg1);
        field1615[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method2373(arg0, 0, arg1));
        field1615[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1610[arg0]; var6++) {
            float var7 = this.method2371(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method2373(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1615[arg0][var6 * 2 + 1] = field1615[arg0][var6 * 2 - 1] * var9;
            field1615[arg0][var6 * 2] = field1615[arg0][var6 * 2 - 1] * var8 + field1615[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1615[arg0][var10] += field1615[arg0][var10 - 1] * var8 + field1615[arg0][var10 - 2] * var9;
            }
            field1615[arg0][1] += field1615[arg0][0] * var8 + var9;
            field1615[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1610[0] * 2; var11++) {
                field1615[0][var11] *= Statics.field1620;
            }
        }
        for (int var12 = 0; var12 < this.field1610[arg0] * 2; var12++) {
            field1616[arg0][var12] = (int) (field1615[arg0][var12] * 65536.0F);
        }
        return this.field1610[arg0] * 2;
    }

    @ObfuscatedName("du.n(Lgg;Lda;)V")
    public final void method2380(class195 arg0, class109 arg1) {
        int var3 = arg0.method3332();
        this.field1610[0] = var3 >> 4;
        this.field1610[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1614;
            this.field1614[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1614[0] = arg0.method3310();
        this.field1614[1] = arg0.method3310();
        int var4 = arg0.method3332();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1610[var5]; var6++) {
                this.field1612[var5][0][var6] = arg0.method3310();
                this.field1613[var5][0][var6] = arg0.method3310();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1610[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1612[var7][1][var8] = this.field1612[var7][0][var8];
                    this.field1613[var7][1][var8] = this.field1613[var7][0][var8];
                } else {
                    this.field1612[var7][1][var8] = arg0.method3310();
                    this.field1613[var7][1][var8] = arg0.method3310();
                }
            }
        }
        if (var4 != 0 || this.field1614[1] != this.field1614[0]) {
            arg1.method2194(arg0);
        }
    }
}
