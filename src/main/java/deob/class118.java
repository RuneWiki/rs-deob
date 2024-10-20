package deob;

@ObfuscatedName("dr")
public class class118 {

    @ObfuscatedName("dr.m")
    public int[] field1626 = new int[2];

    @ObfuscatedName("dr.i")
    public int[][][] field1624 = new int[2][2][4];

    @ObfuscatedName("dr.j")
    public int[][][] field1625 = new int[2][2][4];

    @ObfuscatedName("dr.v")
    public int[] field1633 = new int[2];

    @ObfuscatedName("dr.x")
    public static float[][] field1623 = new float[2][8];

    @ObfuscatedName("dr.e")
    public static int[][] field1628 = new int[2][8];

    @ObfuscatedName("dr.m(IIF)F")
    public float method2175(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1625[arg0][1][arg1] - this.field1625[arg0][0][arg1]) * arg2 + (float) this.field1625[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("dr.p(F)F")
    public static float method2191(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("dr.i(IIF)F")
    public float method2176(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1624[arg0][1][arg1] - this.field1624[arg0][0][arg1]) * arg2 + (float) this.field1624[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method2191(var5);
    }

    @ObfuscatedName("dr.j(IF)I")
    public int method2177(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1633[1] - this.field1633[0]) * arg1 + (float) this.field1633[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1629 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1630 = (int) (Statics.field1629 * 65536.0F);
        }
        if (this.field1626[arg0] == 0) {
            return 0;
        }
        float var5 = this.method2175(arg0, 0, arg1);
        field1623[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method2176(arg0, 0, arg1));
        field1623[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1626[arg0]; var6++) {
            float var7 = this.method2175(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method2176(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1623[arg0][var6 * 2 + 1] = field1623[arg0][var6 * 2 - 1] * var9;
            field1623[arg0][var6 * 2] = field1623[arg0][var6 * 2 - 1] * var8 + field1623[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1623[arg0][var10] += field1623[arg0][var10 - 1] * var8 + field1623[arg0][var10 - 2] * var9;
            }
            field1623[arg0][1] += field1623[arg0][0] * var8 + var9;
            field1623[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1626[0] * 2; var11++) {
                field1623[0][var11] *= Statics.field1629;
            }
        }
        for (int var12 = 0; var12 < this.field1626[arg0] * 2; var12++) {
            field1628[arg0][var12] = (int) (field1623[arg0][var12] * 65536.0F);
        }
        return this.field1626[arg0] * 2;
    }

    @ObfuscatedName("dr.v(Lfv;Ldl;)V")
    public final void method2184(class181 arg0, class110 arg1) {
        int var3 = arg0.method3012();
        this.field1626[0] = var3 >> 4;
        this.field1626[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1633;
            this.field1633[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1633[0] = arg0.method3009();
        this.field1633[1] = arg0.method3009();
        int var4 = arg0.method3012();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1626[var5]; var6++) {
                this.field1624[var5][0][var6] = arg0.method3009();
                this.field1625[var5][0][var6] = arg0.method3009();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1626[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1624[var7][1][var8] = this.field1624[var7][0][var8];
                    this.field1625[var7][1][var8] = this.field1625[var7][0][var8];
                } else {
                    this.field1624[var7][1][var8] = arg0.method3009();
                    this.field1625[var7][1][var8] = arg0.method3009();
                }
            }
        }
        if (var4 != 0 || this.field1633[1] != this.field1633[0]) {
            arg1.method1967(arg0);
        }
    }
}
