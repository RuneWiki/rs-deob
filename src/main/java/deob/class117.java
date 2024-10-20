package deob;

@ObfuscatedName("dh")
public class class117 {

    @ObfuscatedName("dh.o")
    public int[] field1653 = new int[2];

    @ObfuscatedName("dh.t")
    public int[][][] field1648 = new int[2][2][4];

    @ObfuscatedName("dh.d")
    public int[][][] field1649 = new int[2][2][4];

    @ObfuscatedName("dh.h")
    public int[] field1657 = new int[2];

    @ObfuscatedName("dh.m")
    public static float[][] field1646 = new float[2][8];

    @ObfuscatedName("dh.z")
    public static int[][] field1652 = new int[2][8];

    @ObfuscatedName("dh.o(IIF)F")
    public float method2263(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1649[arg0][1][arg1] - this.field1649[arg0][0][arg1]) * arg2 + (float) this.field1649[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("dh.k(F)F")
    public static float method2269(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("dh.t(IIF)F")
    public float method2265(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1648[arg0][1][arg1] - this.field1648[arg0][0][arg1]) * arg2 + (float) this.field1648[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method2269(var5);
    }

    @ObfuscatedName("dh.d(IF)I")
    public int method2266(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1657[1] - this.field1657[0]) * arg1 + (float) this.field1657[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1655 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1654 = (int) (Statics.field1655 * 65536.0F);
        }
        if (this.field1653[arg0] == 0) {
            return 0;
        }
        float var5 = this.method2263(arg0, 0, arg1);
        field1646[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method2265(arg0, 0, arg1));
        field1646[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1653[arg0]; var6++) {
            float var7 = this.method2263(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method2265(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1646[arg0][var6 * 2 + 1] = field1646[arg0][var6 * 2 - 1] * var9;
            field1646[arg0][var6 * 2] = field1646[arg0][var6 * 2 - 1] * var8 + field1646[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1646[arg0][var10] += field1646[arg0][var10 - 1] * var8 + field1646[arg0][var10 - 2] * var9;
            }
            field1646[arg0][1] += field1646[arg0][0] * var8 + var9;
            field1646[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1653[0] * 2; var11++) {
                field1646[0][var11] *= Statics.field1655;
            }
        }
        for (int var12 = 0; var12 < this.field1653[arg0] * 2; var12++) {
            field1652[arg0][var12] = (int) (field1646[arg0][var12] * 65536.0F);
        }
        return this.field1653[arg0] * 2;
    }

    @ObfuscatedName("dh.h(Lgc;Ldl;)V")
    public final void method2267(class195 arg0, class109 arg1) {
        int var3 = arg0.method3205();
        this.field1653[0] = var3 >> 4;
        this.field1653[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1657;
            this.field1657[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1657[0] = arg0.method3207();
        this.field1657[1] = arg0.method3207();
        int var4 = arg0.method3205();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1653[var5]; var6++) {
                this.field1648[var5][0][var6] = arg0.method3207();
                this.field1649[var5][0][var6] = arg0.method3207();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1653[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1648[var7][1][var8] = this.field1648[var7][0][var8];
                    this.field1649[var7][1][var8] = this.field1649[var7][0][var8];
                } else {
                    this.field1648[var7][1][var8] = arg0.method3207();
                    this.field1649[var7][1][var8] = arg0.method3207();
                }
            }
        }
        if (var4 != 0 || this.field1657[1] != this.field1657[0]) {
            arg1.method2064(arg0);
        }
    }
}
