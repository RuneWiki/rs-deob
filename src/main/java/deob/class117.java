package deob;

@ObfuscatedName("dn")
public class class117 {

    @ObfuscatedName("dn.t")
    public int[] field1621 = new int[2];

    @ObfuscatedName("dn.i")
    public int[][][] field1616 = new int[2][2][4];

    @ObfuscatedName("dn.a")
    public int[][][] field1617 = new int[2][2][4];

    @ObfuscatedName("dn.l")
    public int[] field1624 = new int[2];

    @ObfuscatedName("dn.b")
    public static float[][] field1622 = new float[2][8];

    @ObfuscatedName("dn.e")
    public static int[][] field1620 = new int[2][8];

    @ObfuscatedName("dn.t(IIF)F")
    public float method2271(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1617[arg0][1][arg1] - this.field1617[arg0][0][arg1]) * arg2 + (float) this.field1617[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("dn.q(F)F")
    public static float method2261(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("dn.i(IIF)F")
    public float method2262(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1616[arg0][1][arg1] - this.field1616[arg0][0][arg1]) * arg2 + (float) this.field1616[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method2261(var5);
    }

    @ObfuscatedName("dn.a(IF)I")
    public int method2264(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1624[1] - this.field1624[0]) * arg1 + (float) this.field1624[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1619 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1615 = (int) (Statics.field1619 * 65536.0F);
        }
        if (this.field1621[arg0] == 0) {
            return 0;
        }
        float var5 = this.method2271(arg0, 0, arg1);
        field1622[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method2262(arg0, 0, arg1));
        field1622[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1621[arg0]; var6++) {
            float var7 = this.method2271(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method2262(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1622[arg0][var6 * 2 + 1] = field1622[arg0][var6 * 2 - 1] * var9;
            field1622[arg0][var6 * 2] = field1622[arg0][var6 * 2 - 1] * var8 + field1622[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1622[arg0][var10] += field1622[arg0][var10 - 1] * var8 + field1622[arg0][var10 - 2] * var9;
            }
            field1622[arg0][1] += field1622[arg0][0] * var8 + var9;
            field1622[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1621[0] * 2; var11++) {
                field1622[0][var11] *= Statics.field1619;
            }
        }
        for (int var12 = 0; var12 < this.field1621[arg0] * 2; var12++) {
            field1620[arg0][var12] = (int) (field1622[arg0][var12] * 65536.0F);
        }
        return this.field1621[arg0] * 2;
    }

    @ObfuscatedName("dn.l(Lgb;Ldj;)V")
    public final void method2266(class195 arg0, class109 arg1) {
        int var3 = arg0.method3236();
        this.field1621[0] = var3 >> 4;
        this.field1621[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1624;
            this.field1624[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1624[0] = arg0.method3238();
        this.field1624[1] = arg0.method3238();
        int var4 = arg0.method3236();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1621[var5]; var6++) {
                this.field1616[var5][0][var6] = arg0.method3238();
                this.field1617[var5][0][var6] = arg0.method3238();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1621[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1616[var7][1][var8] = this.field1616[var7][0][var8];
                    this.field1617[var7][1][var8] = this.field1617[var7][0][var8];
                } else {
                    this.field1616[var7][1][var8] = arg0.method3238();
                    this.field1617[var7][1][var8] = arg0.method3238();
                }
            }
        }
        if (var4 != 0 || this.field1624[1] != this.field1624[0]) {
            arg1.method2086(arg0);
        }
    }
}
