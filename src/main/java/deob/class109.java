package deob;

@ObfuscatedName("bw")
public class class109 {

    @ObfuscatedName("bw.b")
    public int[][][] field1738 = new int[2][2][4];

    @ObfuscatedName("bw.m")
    public int[] field1740 = new int[2];

    @ObfuscatedName("bw.i")
    public int[][][] field1737 = new int[2][2][4];

    @ObfuscatedName("bw.v")
    public int[] field1746 = new int[2];

    @ObfuscatedName("bw.z")
    public static float[][] field1741 = new float[2][8];

    @ObfuscatedName("bw.x")
    public static int[][] field1742 = new int[2][8];

    @ObfuscatedName("bw.c(F)F")
    public static float method1907(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("bw.b(IIF)F")
    public float method1908(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1738[arg0][1][arg1] - this.field1738[arg0][0][arg1]) * arg2 + (float) this.field1738[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1907(var5);
    }

    @ObfuscatedName("bw.m(Ldv;Lbq;)V")
    public final void method1910(class28 arg0, class120 arg1) {
        int var3 = arg0.method450();
        this.field1746[0] = var3 >> 4;
        this.field1746[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1740;
            this.field1740[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1740[0] = arg0.method349();
        this.field1740[1] = arg0.method349();
        int var4 = arg0.method450();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1746[var5]; var6++) {
                this.field1738[var5][0][var6] = arg0.method349();
                this.field1737[var5][0][var6] = arg0.method349();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1746[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1738[var7][1][var8] = this.field1738[var7][0][var8];
                    this.field1737[var7][1][var8] = this.field1737[var7][0][var8];
                } else {
                    this.field1738[var7][1][var8] = arg0.method349();
                    this.field1737[var7][1][var8] = arg0.method349();
                }
            }
        }
        if (var4 != 0 || this.field1740[1] != this.field1740[0]) {
            arg1.method2125(arg0);
        }
    }

    @ObfuscatedName("bw.i(IF)I")
    public int method1921(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1740[1] - this.field1740[0]) * arg1 + (float) this.field1740[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1743 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1739 = (int) (Statics.field1743 * 65536.0F);
        }
        if (this.field1746[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1925(arg0, 0, arg1);
        field1741[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1908(arg0, 0, arg1));
        field1741[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1746[arg0]; var6++) {
            float var7 = this.method1925(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1908(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1741[arg0][var6 * 2 + 1] = field1741[arg0][var6 * 2 - 1] * var9;
            field1741[arg0][var6 * 2] = field1741[arg0][var6 * 2 - 1] * var8 + field1741[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1741[arg0][var10] += field1741[arg0][var10 - 1] * var8 + field1741[arg0][var10 - 2] * var9;
            }
            field1741[arg0][1] += field1741[arg0][0] * var8 + var9;
            field1741[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1746[0] * 2; var11++) {
                field1741[0][var11] *= Statics.field1743;
            }
        }
        for (int var12 = 0; var12 < this.field1746[arg0] * 2; var12++) {
            field1742[arg0][var12] = (int) (field1741[arg0][var12] * 65536.0F);
        }
        return this.field1746[arg0] * 2;
    }

    @ObfuscatedName("bw.v(IIF)F")
    public float method1925(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1737[arg0][1][arg1] - this.field1737[arg0][0][arg1]) * arg2 + (float) this.field1737[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }
}
