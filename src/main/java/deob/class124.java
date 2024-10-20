package deob;

@ObfuscatedName("dc")
public class class124 {

    @ObfuscatedName("dc.x")
    public int[] field1499 = new int[2];

    @ObfuscatedName("dc.k")
    public int[][][] field1498 = new int[2][2][4];

    @ObfuscatedName("dc.d")
    public int[][][] field1503 = new int[2][2][4];

    @ObfuscatedName("dc.w")
    public int[] field1505 = new int[2];

    @ObfuscatedName("dc.v")
    public static float[][] field1501 = new float[2][8];

    @ObfuscatedName("dc.q")
    public static int[][] field1500 = new int[2][8];

    @ObfuscatedName("dc.x(IIF)F")
    public float method2560(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1503[arg0][1][arg1] - this.field1503[arg0][0][arg1]) * arg2 + (float) this.field1503[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("dc.m(F)F")
    public static float method2557(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("dc.k(IIF)F")
    public float method2558(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1498[arg0][1][arg1] - this.field1498[arg0][0][arg1]) * arg2 + (float) this.field1498[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method2557(var5);
    }

    @ObfuscatedName("dc.d(IF)I")
    public int method2559(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1505[1] - this.field1505[0]) * arg1 + (float) this.field1505[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1506 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1504 = (int) (Statics.field1506 * 65536.0F);
        }
        if (this.field1499[arg0] == 0) {
            return 0;
        }
        float var5 = this.method2560(arg0, 0, arg1);
        field1501[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method2558(arg0, 0, arg1));
        field1501[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1499[arg0]; var6++) {
            float var7 = this.method2560(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method2558(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1501[arg0][var6 * 2 + 1] = field1501[arg0][var6 * 2 - 1] * var9;
            field1501[arg0][var6 * 2] = field1501[arg0][var6 * 2 - 1] * var8 + field1501[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1501[arg0][var10] += field1501[arg0][var10 - 1] * var8 + field1501[arg0][var10 - 2] * var9;
            }
            field1501[arg0][1] += field1501[arg0][0] * var8 + var9;
            field1501[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1499[0] * 2; var11++) {
                field1501[0][var11] *= Statics.field1506;
            }
        }
        for (int var12 = 0; var12 < this.field1499[arg0] * 2; var12++) {
            field1500[arg0][var12] = (int) (field1501[arg0][var12] * 65536.0F);
        }
        return this.field1499[arg0] * 2;
    }

    @ObfuscatedName("dc.w(Lkb;Lde;)V")
    public final void method2568(class310 arg0, class116 arg1) {
        int var3 = arg0.method5137();
        this.field1499[0] = var3 >> 4;
        this.field1499[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1505;
            this.field1505[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1505[0] = arg0.method5139();
        this.field1505[1] = arg0.method5139();
        int var4 = arg0.method5137();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1499[var5]; var6++) {
                this.field1498[var5][0][var6] = arg0.method5139();
                this.field1503[var5][0][var6] = arg0.method5139();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1499[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1498[var7][1][var8] = this.field1498[var7][0][var8];
                    this.field1503[var7][1][var8] = this.field1503[var7][0][var8];
                } else {
                    this.field1498[var7][1][var8] = arg0.method5139();
                    this.field1503[var7][1][var8] = arg0.method5139();
                }
            }
        }
        if (var4 != 0 || this.field1505[1] != this.field1505[0]) {
            arg1.method2367(arg0);
        }
    }
}
