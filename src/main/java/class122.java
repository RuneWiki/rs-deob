import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class122 {

    @OriginalMember(owner = "client!s", name = "d", descriptor = "[I")
    private int[] field2721 = new int[2];

    @OriginalMember(owner = "client!s", name = "f", descriptor = "[I")
    public int[] field2723 = new int[2];

    @OriginalMember(owner = "client!s", name = "b", descriptor = "[[[I")
    private int[][][] field2719 = new int[2][2][4];

    @OriginalMember(owner = "client!s", name = "h", descriptor = "[[[I")
    private int[][][] field2725 = new int[2][2][4];

    @OriginalMember(owner = "client!s", name = "c", descriptor = "[[F")
    private static float[][] field2720 = new float[2][8];

    @OriginalMember(owner = "client!s", name = "a", descriptor = "[[I")
    public static int[][] field2718 = new int[2][8];

    @OriginalMember(owner = "client!s", name = "g", descriptor = "F")
    private static float field2724;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "()V")
    public static void method964() {
        field2720 = null;
        field2718 = null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(F)F")
    private static final float method965(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IF)I")
    public final int method966(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field2721[1] - this.field2721[0]) * arg1 + (float) this.field2721[0];
            float var4 = var3 * 0.0030517578F;
            field2724 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field2722 = (int) (field2724 * 65536.0F);
        }
        if (this.field2723[arg0] == 0) {
            return 0;
        }
        float var5 = this.method967(arg0, 0, arg1);
        field2720[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method969(arg0, 0, arg1));
        field2720[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field2723[arg0]; var6++) {
            float var9 = this.method967(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method969(arg0, var6, arg1));
            float var11 = var9 * var9;
            field2720[arg0][var6 * 2 + 1] = field2720[arg0][var6 * 2 - 1] * var11;
            field2720[arg0][var6 * 2] = field2720[arg0][var6 * 2 - 1] * var10 + field2720[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field2720[arg0][var12] += field2720[arg0][var12 - 1] * var10 + field2720[arg0][var12 - 2] * var11;
            }
            field2720[arg0][1] += field2720[arg0][0] * var10 + var11;
            field2720[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field2723[0] * 2; var7++) {
                field2720[0][var7] *= field2724;
            }
        }
        for (int var8 = 0; var8 < this.field2723[arg0] * 2; var8++) {
            field2718[arg0][var8] = (int) (field2720[arg0][var8] * 65536.0F);
        }
        return this.field2723[arg0] * 2;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIF)F")
    private final float method967(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2719[arg0][1][arg1] - this.field2719[arg0][0][arg1]) * arg2 + (float) this.field2719[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lb;Lnb;)V")
    public final void method968(class8 arg0, class92 arg1) {
        int var3 = arg0.method62((byte) 101);
        this.field2723[0] = var3 >> 4;
        this.field2723[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field2721[0] = this.field2721[1] = 0;
            return;
        }
        this.field2721[0] = arg0.method68(-2);
        this.field2721[1] = arg0.method68(-2);
        int var4 = arg0.method62((byte) 117);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field2723[var5]; var8++) {
                this.field2725[var5][0][var8] = arg0.method68(-2);
                this.field2719[var5][0][var8] = arg0.method68(-2);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field2723[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field2725[var6][1][var7] = this.field2725[var6][0][var7];
                    this.field2719[var6][1][var7] = this.field2719[var6][0][var7];
                } else {
                    this.field2725[var6][1][var7] = arg0.method68(-2);
                    this.field2719[var6][1][var7] = arg0.method68(-2);
                }
            }
        }
        if (var4 != 0 || this.field2721[1] != this.field2721[0]) {
            arg1.method746(arg0);
        }
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(IIF)F")
    private final float method969(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2725[arg0][1][arg1] - this.field2725[arg0][0][arg1]) * arg2 + (float) this.field2725[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method965(var5);
    }
}
