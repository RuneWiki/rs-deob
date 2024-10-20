package deob;

@ObfuscatedName("dg")
public class class119 {

    @ObfuscatedName("dg.c")
    public int[] field1672 = new int[2];

    @ObfuscatedName("dg.i")
    public int[][][] field1671 = new int[2][2][4];

    @ObfuscatedName("dg.u")
    public int[][][] field1669 = new int[2][2][4];

    @ObfuscatedName("dg.g")
    public int[] field1673 = new int[2];

    @ObfuscatedName("dg.m")
    public static float[][] field1674 = new float[2][8];

    @ObfuscatedName("dg.s")
    public static int[][] field1675 = new int[2][8];

    @ObfuscatedName("dg.c(IIF)F")
    public float method2034(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1669[arg0][1][arg1] - this.field1669[arg0][0][arg1]) * arg2 + (float) this.field1669[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("dg.o(F)F")
    public static float method2038(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("dg.i(IIF)F")
    public float method2042(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1671[arg0][1][arg1] - this.field1671[arg0][0][arg1]) * arg2 + (float) this.field1671[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method2038(var5);
    }

    @ObfuscatedName("dg.u(IF)I")
    public int method2036(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1673[1] - this.field1673[0]) * arg1 + (float) this.field1673[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1676 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1679 = (int) (Statics.field1676 * 65536.0F);
        }
        if (this.field1672[arg0] == 0) {
            return 0;
        }
        float var5 = this.method2034(arg0, 0, arg1);
        field1674[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method2042(arg0, 0, arg1));
        field1674[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1672[arg0]; var6++) {
            float var7 = this.method2034(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method2042(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1674[arg0][var6 * 2 + 1] = field1674[arg0][var6 * 2 - 1] * var9;
            field1674[arg0][var6 * 2] = field1674[arg0][var6 * 2 - 1] * var8 + field1674[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1674[arg0][var10] += field1674[arg0][var10 - 1] * var8 + field1674[arg0][var10 - 2] * var9;
            }
            field1674[arg0][1] += field1674[arg0][0] * var8 + var9;
            field1674[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1672[0] * 2; var11++) {
                field1674[0][var11] *= Statics.field1676;
            }
        }
        for (int var12 = 0; var12 < this.field1672[arg0] * 2; var12++) {
            field1675[arg0][var12] = (int) (field1674[arg0][var12] * 65536.0F);
        }
        return this.field1672[arg0] * 2;
    }

    @ObfuscatedName("dg.g(Lfp;Ldh;)V")
    public final void method2037(class174 arg0, class111 arg1) {
        int var3 = arg0.method2843();
        this.field1672[0] = var3 >> 4;
        this.field1672[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1673;
            this.field1673[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1673[0] = arg0.method2861();
        this.field1673[1] = arg0.method2861();
        int var4 = arg0.method2843();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1672[var5]; var6++) {
                this.field1671[var5][0][var6] = arg0.method2861();
                this.field1669[var5][0][var6] = arg0.method2861();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1672[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1671[var7][1][var8] = this.field1671[var7][0][var8];
                    this.field1669[var7][1][var8] = this.field1669[var7][0][var8];
                } else {
                    this.field1671[var7][1][var8] = arg0.method2861();
                    this.field1669[var7][1][var8] = arg0.method2861();
                }
            }
        }
        if (var4 != 0 || this.field1673[1] != this.field1673[0]) {
            arg1.method1839(arg0);
        }
    }
}
