package deob;

@ObfuscatedName("dr")
public class class117 {

    @ObfuscatedName("dr.d")
    public int[] field1635 = new int[2];

    @ObfuscatedName("dr.n")
    public int[][][] field1629 = new int[2][2][4];

    @ObfuscatedName("dr.r")
    public int[][][] field1630 = new int[2][2][4];

    @ObfuscatedName("dr.e")
    public int[] field1631 = new int[2];

    @ObfuscatedName("dr.y")
    public static float[][] field1633 = new float[2][8];

    @ObfuscatedName("dr.k")
    public static int[][] field1638 = new int[2][8];

    @ObfuscatedName("dr.d(IIF)F")
    public float method2317(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1630[arg0][1][arg1] - this.field1630[arg0][0][arg1]) * arg2 + (float) this.field1630[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("dr.z(F)F")
    public static float method2318(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("dr.n(IIF)F")
    public float method2321(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1629[arg0][1][arg1] - this.field1629[arg0][0][arg1]) * arg2 + (float) this.field1629[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method2318(var5);
    }

    @ObfuscatedName("dr.r(IF)I")
    public int method2319(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1631[1] - this.field1631[0]) * arg1 + (float) this.field1631[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1634 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1632 = (int) (Statics.field1634 * 65536.0F);
        }
        if (this.field1635[arg0] == 0) {
            return 0;
        }
        float var5 = this.method2317(arg0, 0, arg1);
        field1633[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method2321(arg0, 0, arg1));
        field1633[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1635[arg0]; var6++) {
            float var7 = this.method2317(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method2321(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1633[arg0][var6 * 2 + 1] = field1633[arg0][var6 * 2 - 1] * var9;
            field1633[arg0][var6 * 2] = field1633[arg0][var6 * 2 - 1] * var8 + field1633[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1633[arg0][var10] += field1633[arg0][var10 - 1] * var8 + field1633[arg0][var10 - 2] * var9;
            }
            field1633[arg0][1] += field1633[arg0][0] * var8 + var9;
            field1633[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1635[0] * 2; var11++) {
                field1633[0][var11] *= Statics.field1634;
            }
        }
        for (int var12 = 0; var12 < this.field1635[arg0] * 2; var12++) {
            field1638[arg0][var12] = (int) (field1633[arg0][var12] * 65536.0F);
        }
        return this.field1635[arg0] * 2;
    }

    @ObfuscatedName("dr.e(Lgy;Ldx;)V")
    public final void method2327(class195 arg0, class109 arg1) {
        int var3 = arg0.method3330();
        this.field1635[0] = var3 >> 4;
        this.field1635[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1631;
            this.field1631[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1631[0] = arg0.method3269();
        this.field1631[1] = arg0.method3269();
        int var4 = arg0.method3330();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1635[var5]; var6++) {
                this.field1629[var5][0][var6] = arg0.method3269();
                this.field1630[var5][0][var6] = arg0.method3269();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1635[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1629[var7][1][var8] = this.field1629[var7][0][var8];
                    this.field1630[var7][1][var8] = this.field1630[var7][0][var8];
                } else {
                    this.field1629[var7][1][var8] = arg0.method3269();
                    this.field1630[var7][1][var8] = arg0.method3269();
                }
            }
        }
        if (var4 != 0 || this.field1631[1] != this.field1631[0]) {
            arg1.method2117(arg0);
        }
    }
}
