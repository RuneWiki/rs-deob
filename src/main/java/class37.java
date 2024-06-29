import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class37 {

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "[I")
    private int[] field528 = new int[2];

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "[[[I")
    private int[][][] field530 = new int[2][2][4];

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "[[[I")
    private int[][][] field531 = new int[2][2][4];

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "[I")
    public int[] field529 = new int[2];

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "[[I")
    public static int[][] field527 = new int[2][8];

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "[[F")
    private static float[][] field526 = new float[2][8];

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "F")
    private static float field525;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IF)I", line = 4)
    public final int method268(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field528[1] - this.field528[0]) * arg1 + (float) this.field528[0];
            float var4 = var3 * 0.0030517578F;
            field525 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field524 = (int) (field525 * 65536.0F);
        }
        if (this.field529[arg0] == 0) {
            return 0;
        }
        float var5 = this.method272(arg0, 0, arg1);
        field526[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method269(arg0, 0, arg1));
        field526[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field529[arg0]; var6++) {
            float var9 = this.method272(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method269(arg0, var6, arg1));
            float var11 = var9 * var9;
            field526[arg0][var6 * 2 + 1] = field526[arg0][var6 * 2 - 1] * var11;
            field526[arg0][var6 * 2] = field526[arg0][var6 * 2 - 1] * var10 + field526[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field526[arg0][var12] += field526[arg0][var12 - 1] * var10 + field526[arg0][var12 - 2] * var11;
            }
            field526[arg0][1] += field526[arg0][0] * var10 + var11;
            field526[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field529[0] * 2; var7++) {
                field526[0][var7] *= field525;
            }
        }
        for (int var8 = 0; var8 < this.field529[arg0] * 2; var8++) {
            field527[arg0][var8] = (int) (field526[arg0][var8] * 65536.0F);
        }
        return this.field529[arg0] * 2;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIF)F", line = 64)
    private final float method269(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field531[arg0][1][arg1] - this.field531[arg0][0][arg1]) * arg2 + (float) this.field531[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method271(var5);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lnj;Lrs;)V", line = 76)
    public final void method270(class228 arg0, class238 arg1) {
        int var3 = arg0.method1348(-121);
        this.field529[0] = var3 >> 4;
        this.field529[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field528[0] = this.field528[1] = 0;
            return;
        }
        this.field528[0] = arg0.method1343(255);
        this.field528[1] = arg0.method1343(255);
        int var4 = arg0.method1348(-121);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field529[var5]; var8++) {
                this.field531[var5][0][var8] = arg0.method1343(255);
                this.field530[var5][0][var8] = arg0.method1343(255);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field529[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field531[var6][1][var7] = this.field531[var6][0][var7];
                    this.field530[var6][1][var7] = this.field530[var6][0][var7];
                } else {
                    this.field531[var6][1][var7] = arg0.method1343(255);
                    this.field530[var6][1][var7] = arg0.method1343(255);
                }
            }
        }
        if (var4 != 0 || this.field528[1] != this.field528[0]) {
            arg1.method1438(arg0);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(F)F", line = 142)
    private static final float method271(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(IIF)F", line = 149)
    private final float method272(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field530[arg0][1][arg1] - this.field530[arg0][0][arg1]) * arg2 + (float) this.field530[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "()V", line = 155)
    public static void method273() {
        field526 = null;
        field527 = null;
    }
}
