package deob;

@ObfuscatedName("dc")
public class class119 {

    @ObfuscatedName("dc.i")
    public int[] field1722 = new int[2];

    @ObfuscatedName("dc.a")
    public int[][][] field1725 = new int[2][2][4];

    @ObfuscatedName("dc.t")
    public int[][][] field1717 = new int[2][2][4];

    @ObfuscatedName("dc.s")
    public int[] field1718 = new int[2];

    @ObfuscatedName("dc.r")
    public static float[][] field1719 = new float[2][8];

    @ObfuscatedName("dc.v")
    public static int[][] field1720 = new int[2][8];

    @ObfuscatedName("dc.i(IIF)F")
    public float method2088(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1717[arg0][1][arg1] - this.field1717[arg0][0][arg1]) * arg2 + (float) this.field1717[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("dc.w(F)F")
    public static float method2074(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("dc.a(IIF)F")
    public float method2075(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1725[arg0][1][arg1] - this.field1725[arg0][0][arg1]) * arg2 + (float) this.field1725[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method2074(var5);
    }

    @ObfuscatedName("dc.t(IF)I")
    public int method2076(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1718[1] - this.field1718[0]) * arg1 + (float) this.field1718[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1721 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1716 = (int) (Statics.field1721 * 65536.0F);
        }
        if (this.field1722[arg0] == 0) {
            return 0;
        }
        float var5 = this.method2088(arg0, 0, arg1);
        field1719[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method2075(arg0, 0, arg1));
        field1719[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1722[arg0]; var6++) {
            float var7 = this.method2088(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method2075(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1719[arg0][var6 * 2 + 1] = field1719[arg0][var6 * 2 - 1] * var9;
            field1719[arg0][var6 * 2] = field1719[arg0][var6 * 2 - 1] * var8 + field1719[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1719[arg0][var10] += field1719[arg0][var10 - 1] * var8 + field1719[arg0][var10 - 2] * var9;
            }
            field1719[arg0][1] += field1719[arg0][0] * var8 + var9;
            field1719[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1722[0] * 2; var11++) {
                field1719[0][var11] *= Statics.field1721;
            }
        }
        for (int var12 = 0; var12 < this.field1722[arg0] * 2; var12++) {
            field1720[arg0][var12] = (int) (field1719[arg0][var12] * 65536.0F);
        }
        return this.field1722[arg0] * 2;
    }

    @ObfuscatedName("dc.s(Lfp;Ldk;)V")
    public final void method2078(class174 arg0, class111 arg1) {
        int var3 = arg0.method3061();
        this.field1722[0] = var3 >> 4;
        this.field1722[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1718;
            this.field1718[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1718[0] = arg0.method2882();
        this.field1718[1] = arg0.method2882();
        int var4 = arg0.method3061();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1722[var5]; var6++) {
                this.field1725[var5][0][var6] = arg0.method2882();
                this.field1717[var5][0][var6] = arg0.method2882();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1722[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1725[var7][1][var8] = this.field1725[var7][0][var8];
                    this.field1717[var7][1][var8] = this.field1717[var7][0][var8];
                } else {
                    this.field1725[var7][1][var8] = arg0.method2882();
                    this.field1717[var7][1][var8] = arg0.method2882();
                }
            }
        }
        if (var4 != 0 || this.field1718[1] != this.field1718[0]) {
            arg1.method1888(arg0);
        }
    }
}
