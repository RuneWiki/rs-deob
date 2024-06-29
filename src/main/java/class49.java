import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class49 {

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "[I")
    public int[] field583 = new int[2];

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "[I")
    private int[] field582 = new int[2];

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "[[[I")
    private int[][][] field581 = new int[2][2][4];

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "[[[I")
    private int[][][] field587 = new int[2][2][4];

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "[[I")
    public static int[][] field580 = new int[2][8];

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "[[F")
    private static float[][] field585 = new float[2][8];

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "F")
    private static float field584;

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIF)F", line = 4)
    private final float method393(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field587[arg0][1][arg1] - this.field587[arg0][0][arg1]) * arg2 + (float) this.field587[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "()V", line = 11)
    public static void method394() {
        field585 = null;
        field580 = null;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(F)F", line = 20)
    private static final float method395(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(IIF)F", line = 33)
    private final float method396(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field581[arg0][1][arg1] - this.field581[arg0][0][arg1]) * arg2 + (float) this.field581[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method395(var5);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IF)I", line = 38)
    public final int method397(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field582[1] - this.field582[0]) * arg1 + (float) this.field582[0];
            float var4 = var3 * 0.0030517578F;
            field584 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field586 = (int) (field584 * 65536.0F);
        }
        if (this.field583[arg0] == 0) {
            return 0;
        }
        float var5 = this.method393(arg0, 0, arg1);
        field585[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method396(arg0, 0, arg1));
        field585[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field583[arg0]; var6++) {
            float var9 = this.method393(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method396(arg0, var6, arg1));
            float var11 = var9 * var9;
            field585[arg0][var6 * 2 + 1] = field585[arg0][var6 * 2 - 1] * var11;
            field585[arg0][var6 * 2] = field585[arg0][var6 * 2 - 1] * var10 + field585[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field585[arg0][var12] += field585[arg0][var12 - 1] * var10 + field585[arg0][var12 - 2] * var11;
            }
            field585[arg0][1] += field585[arg0][0] * var10 + var11;
            field585[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field583[0] * 2; var7++) {
                field585[0][var7] *= field584;
            }
        }
        for (int var8 = 0; var8 < this.field583[arg0] * 2; var8++) {
            field580[arg0][var8] = (int) (field585[arg0][var8] * 65536.0F);
        }
        return this.field583[arg0] * 2;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lac;Lfp;)V", line = 108)
    public final void method398(class501 arg0, class294 arg1) {
        int var3 = arg0.method2874((byte) -75);
        this.field583[0] = var3 >> 4;
        this.field583[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field582[0] = this.field582[1] = 0;
            return;
        }
        this.field582[0] = arg0.method2845(-1);
        this.field582[1] = arg0.method2845(-1);
        int var4 = arg0.method2874((byte) -75);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field583[var5]; var8++) {
                this.field581[var5][0][var8] = arg0.method2845(-1);
                this.field587[var5][0][var8] = arg0.method2845(-1);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field583[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field581[var6][1][var7] = this.field581[var6][0][var7];
                    this.field587[var6][1][var7] = this.field587[var6][0][var7];
                } else {
                    this.field581[var6][1][var7] = arg0.method2845(-1);
                    this.field587[var6][1][var7] = arg0.method2845(-1);
                }
            }
        }
        if (var4 != 0 || this.field582[1] != this.field582[0]) {
            arg1.method1797(arg0);
        }
    }
}
