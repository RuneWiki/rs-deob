import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class437 {

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "[I")
    private int[] field6178 = new int[2];

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "[I")
    public int[] field6181 = new int[2];

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "[[[I")
    private int[][][] field6182 = new int[2][2][4];

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "[[[I")
    private int[][][] field6183 = new int[2][2][4];

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "[[F")
    private static float[][] field6180 = new float[2][8];

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "[[I")
    public static int[][] field6176 = new int[2][8];

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "F")
    private static float field6179;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    public static int field6177;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IF)I", line = 3)
    public final int method2544(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field6178[1] - this.field6178[0]) * arg1 + (float) this.field6178[0];
            float var4 = var3 * 0.0030517578F;
            field6179 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field6177 = (int) (field6179 * 65536.0F);
        }
        if (this.field6181[arg0] == 0) {
            return 0;
        }
        float var5 = this.method2548(arg0, 0, arg1);
        field6180[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method2545(arg0, 0, arg1));
        field6180[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field6181[arg0]; var6++) {
            float var9 = this.method2548(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method2545(arg0, var6, arg1));
            float var11 = var9 * var9;
            field6180[arg0][var6 * 2 + 1] = field6180[arg0][var6 * 2 - 1] * var11;
            field6180[arg0][var6 * 2] = field6180[arg0][var6 * 2 - 1] * var10 + field6180[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field6180[arg0][var12] += field6180[arg0][var12 - 1] * var10 + field6180[arg0][var12 - 2] * var11;
            }
            field6180[arg0][1] += field6180[arg0][0] * var10 + var11;
            field6180[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field6181[0] * 2; var7++) {
                field6180[0][var7] *= field6179;
            }
        }
        for (int var8 = 0; var8 < this.field6181[arg0] * 2; var8++) {
            field6176[arg0][var8] = (int) (field6180[arg0][var8] * 65536.0F);
        }
        return this.field6181[arg0] * 2;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIF)F", line = 63)
    private final float method2545(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field6182[arg0][1][arg1] - this.field6182[arg0][0][arg1]) * arg2 + (float) this.field6182[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method2549(var5);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "()V", line = 81)
    public static void method2546() {
        field6180 = null;
        field6176 = null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lre;Lsr;)V", line = 87)
    public final void method2547(class446 arg0, class323 arg1) {
        int var3 = arg0.method2628(49152);
        this.field6181[0] = var3 >> 4;
        this.field6181[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field6178[0] = this.field6178[1] = 0;
            return;
        }
        this.field6178[0] = arg0.method2631(2530);
        this.field6178[1] = arg0.method2631(2530);
        int var4 = arg0.method2628(49152);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field6181[var5]; var8++) {
                this.field6182[var5][0][var8] = arg0.method2631(2530);
                this.field6183[var5][0][var8] = arg0.method2631(2530);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field6181[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field6182[var6][1][var7] = this.field6182[var6][0][var7];
                    this.field6183[var6][1][var7] = this.field6183[var6][0][var7];
                } else {
                    this.field6182[var6][1][var7] = arg0.method2631(2530);
                    this.field6183[var6][1][var7] = arg0.method2631(2530);
                }
            }
        }
        if (var4 != 0 || this.field6178[1] != this.field6178[0]) {
            arg1.method1992(arg0);
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(IIF)F", line = 166)
    private final float method2548(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field6183[arg0][1][arg1] - this.field6183[arg0][0][arg1]) * arg2 + (float) this.field6183[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(F)F", line = 172)
    private static final float method2549(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }
}
