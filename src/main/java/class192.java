import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class192 {

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "[[[I")
    private int[][][] field3550 = new int[2][2][4];

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "[I")
    private int[] field3551 = new int[2];

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "[I")
    public int[] field3552 = new int[2];

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "[[[I")
    private int[][][] field3554 = new int[2][2][4];

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "[[I")
    public static int[][] field3549 = new int[2][8];

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "[[F")
    private static float[][] field3547 = new float[2][8];

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "F")
    private static float field3553;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "I")
    public static int field3548;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIF)F")
    private final float method1384(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3554[arg0][1][arg1] - this.field3554[arg0][0][arg1]) * arg2 + (float) this.field3554[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1389(var5);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Ljd;Lbf;)V")
    public final void method1385(class118 arg0, class283 arg1) {
        int var3 = arg0.method867(false);
        this.field3552[0] = var3 >> 4;
        this.field3552[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field3551[0] = this.field3551[1] = 0;
            return;
        }
        this.field3551[0] = arg0.method827(255);
        this.field3551[1] = arg0.method827(255);
        int var4 = arg0.method867(false);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field3552[var5]; var8++) {
                this.field3554[var5][0][var8] = arg0.method827(255);
                this.field3550[var5][0][var8] = arg0.method827(255);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field3552[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field3554[var6][1][var7] = this.field3554[var6][0][var7];
                    this.field3550[var6][1][var7] = this.field3550[var6][0][var7];
                } else {
                    this.field3554[var6][1][var7] = arg0.method827(255);
                    this.field3550[var6][1][var7] = arg0.method827(255);
                }
            }
        }
        if (var4 != 0 || this.field3551[1] != this.field3551[0]) {
            arg1.method1923(arg0);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "()V")
    public static void method1386() {
        field3547 = null;
        field3549 = null;
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(IIF)F")
    private final float method1387(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3550[arg0][1][arg1] - this.field3550[arg0][0][arg1]) * arg2 + (float) this.field3550[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IF)I")
    public final int method1388(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field3551[1] - this.field3551[0]) * arg1 + (float) this.field3551[0];
            float var4 = var3 * 0.0030517578F;
            field3553 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field3548 = (int) (field3553 * 65536.0F);
        }
        if (this.field3552[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1387(arg0, 0, arg1);
        field3547[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1384(arg0, 0, arg1));
        field3547[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field3552[arg0]; var6++) {
            float var9 = this.method1387(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method1384(arg0, var6, arg1));
            float var11 = var9 * var9;
            field3547[arg0][var6 * 2 + 1] = field3547[arg0][var6 * 2 - 1] * var11;
            field3547[arg0][var6 * 2] = field3547[arg0][var6 * 2 - 1] * var10 + field3547[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field3547[arg0][var12] += field3547[arg0][var12 - 1] * var10 + field3547[arg0][var12 - 2] * var11;
            }
            field3547[arg0][1] += field3547[arg0][0] * var10 + var11;
            field3547[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field3552[0] * 2; var7++) {
                field3547[0][var7] *= field3553;
            }
        }
        for (int var8 = 0; var8 < this.field3552[arg0] * 2; var8++) {
            field3549[arg0][var8] = (int) (field3547[arg0][var8] * 65536.0F);
        }
        return this.field3552[arg0] * 2;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(F)F")
    private static final float method1389(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }
}
