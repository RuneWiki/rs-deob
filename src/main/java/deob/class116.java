package deob;

@ObfuscatedName("di")
public class class116 {

    @ObfuscatedName("di.b")
    public int[] field1592 = new int[2];

    @ObfuscatedName("di.o")
    public int[][][] field1591 = new int[2][2][4];

    @ObfuscatedName("di.p")
    public int[][][] field1594 = new int[2][2][4];

    @ObfuscatedName("di.a")
    public int[] field1593 = new int[2];

    @ObfuscatedName("di.h")
    public static float[][] field1596 = new float[2][8];

    @ObfuscatedName("di.l")
    public static int[][] field1598 = new int[2][8];

    @ObfuscatedName("di.b(IIF)F")
    public float method2277(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1594[arg0][1][arg1] - this.field1594[arg0][0][arg1]) * arg2 + (float) this.field1594[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("di.q(F)F")
    public static float method2278(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("di.o(IIF)F")
    public float method2281(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1591[arg0][1][arg1] - this.field1591[arg0][0][arg1]) * arg2 + (float) this.field1591[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method2278(var5);
    }

    @ObfuscatedName("di.p(IF)I")
    public int method2280(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1593[1] - this.field1593[0]) * arg1 + (float) this.field1593[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1595 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1597 = (int) (Statics.field1595 * 65536.0F);
        }
        if (this.field1592[arg0] == 0) {
            return 0;
        }
        float var5 = this.method2277(arg0, 0, arg1);
        field1596[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method2281(arg0, 0, arg1));
        field1596[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1592[arg0]; var6++) {
            float var7 = this.method2277(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method2281(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1596[arg0][var6 * 2 + 1] = field1596[arg0][var6 * 2 - 1] * var9;
            field1596[arg0][var6 * 2] = field1596[arg0][var6 * 2 - 1] * var8 + field1596[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1596[arg0][var10] += field1596[arg0][var10 - 1] * var8 + field1596[arg0][var10 - 2] * var9;
            }
            field1596[arg0][1] += field1596[arg0][0] * var8 + var9;
            field1596[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1592[0] * 2; var11++) {
                field1596[0][var11] *= Statics.field1595;
            }
        }
        for (int var12 = 0; var12 < this.field1592[arg0] * 2; var12++) {
            field1598[arg0][var12] = (int) (field1596[arg0][var12] * 65536.0F);
        }
        return this.field1592[arg0] * 2;
    }

    @ObfuscatedName("di.a(Lgn;Ldf;)V")
    public final void method2285(class194 arg0, class108 arg1) {
        int var3 = arg0.method3247();
        this.field1592[0] = var3 >> 4;
        this.field1592[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1593;
            this.field1593[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1593[0] = arg0.method3249();
        this.field1593[1] = arg0.method3249();
        int var4 = arg0.method3247();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1592[var5]; var6++) {
                this.field1591[var5][0][var6] = arg0.method3249();
                this.field1594[var5][0][var6] = arg0.method3249();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1592[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1591[var7][1][var8] = this.field1591[var7][0][var8];
                    this.field1594[var7][1][var8] = this.field1594[var7][0][var8];
                } else {
                    this.field1591[var7][1][var8] = arg0.method3249();
                    this.field1594[var7][1][var8] = arg0.method3249();
                }
            }
        }
        if (var4 != 0 || this.field1593[1] != this.field1593[0]) {
            arg1.method2083(arg0);
        }
    }
}
