package deob;

@ObfuscatedName("db")
public class class118 {

    @ObfuscatedName("db.i")
    public int[] field1717 = new int[2];

    @ObfuscatedName("db.a")
    public int[][][] field1715 = new int[2][2][4];

    @ObfuscatedName("db.r")
    public int[][][] field1718 = new int[2][2][4];

    @ObfuscatedName("db.o")
    public int[] field1719 = new int[2];

    @ObfuscatedName("db.n")
    public static float[][] field1720 = new float[2][8];

    @ObfuscatedName("db.q")
    public static int[][] field1721 = new int[2][8];

    @ObfuscatedName("db.i(IIF)F")
    public float method2096(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1718[arg0][1][arg1] - this.field1718[arg0][0][arg1]) * arg2 + (float) this.field1718[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("db.j(F)F")
    public static float method2097(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("db.a(IIF)F")
    public float method2101(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1715[arg0][1][arg1] - this.field1715[arg0][0][arg1]) * arg2 + (float) this.field1715[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method2097(var5);
    }

    @ObfuscatedName("db.r(IF)I")
    public int method2099(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1719[1] - this.field1719[0]) * arg1 + (float) this.field1719[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1726 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1722 = (int) (Statics.field1726 * 65536.0F);
        }
        if (this.field1717[arg0] == 0) {
            return 0;
        }
        float var5 = this.method2096(arg0, 0, arg1);
        field1720[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method2101(arg0, 0, arg1));
        field1720[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1717[arg0]; var6++) {
            float var7 = this.method2096(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method2101(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1720[arg0][var6 * 2 + 1] = field1720[arg0][var6 * 2 - 1] * var9;
            field1720[arg0][var6 * 2] = field1720[arg0][var6 * 2 - 1] * var8 + field1720[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1720[arg0][var10] += field1720[arg0][var10 - 1] * var8 + field1720[arg0][var10 - 2] * var9;
            }
            field1720[arg0][1] += field1720[arg0][0] * var8 + var9;
            field1720[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1717[0] * 2; var11++) {
                field1720[0][var11] *= Statics.field1726;
            }
        }
        for (int var12 = 0; var12 < this.field1717[arg0] * 2; var12++) {
            field1721[arg0][var12] = (int) (field1720[arg0][var12] * 65536.0F);
        }
        return this.field1717[arg0] * 2;
    }

    @ObfuscatedName("db.o(Lfp;Ldq;)V")
    public final void method2100(class175 arg0, class110 arg1) {
        int var3 = arg0.method2999();
        this.field1717[0] = var3 >> 4;
        this.field1717[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1719;
            this.field1719[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1719[0] = arg0.method2995();
        this.field1719[1] = arg0.method2995();
        int var4 = arg0.method2999();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1717[var5]; var6++) {
                this.field1715[var5][0][var6] = arg0.method2995();
                this.field1718[var5][0][var6] = arg0.method2995();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1717[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1715[var7][1][var8] = this.field1715[var7][0][var8];
                    this.field1718[var7][1][var8] = this.field1718[var7][0][var8];
                } else {
                    this.field1715[var7][1][var8] = arg0.method2995();
                    this.field1718[var7][1][var8] = arg0.method2995();
                }
            }
        }
        if (var4 != 0 || this.field1719[1] != this.field1719[0]) {
            arg1.method1888(arg0);
        }
    }
}
