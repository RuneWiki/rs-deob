import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class153 {

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "[[[I")
    private int[][][] field2768 = new int[2][2][4];

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "[I")
    public int[] field2766 = new int[2];

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "[[[I")
    private int[][][] field2767 = new int[2][2][4];

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "[I")
    private int[] field2770 = new int[2];

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "[[I")
    public static int[][] field2765 = new int[2][8];

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "[[F")
    private static float[][] field2771 = new float[2][8];

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "F")
    private static float field2764;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
    public static int field2769;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIF)F")
    private final float method981(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2768[arg0][1][arg1] - this.field2768[arg0][0][arg1]) * arg2 + (float) this.field2768[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method986(var5);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IF)I")
    public final int method982(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field2770[1] - this.field2770[0]) * arg1 + (float) this.field2770[0];
            float var4 = var3 * 0.0030517578F;
            field2764 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field2769 = (int) (field2764 * 65536.0F);
        }
        if (this.field2766[arg0] == 0) {
            return 0;
        }
        float var5 = this.method985(arg0, 0, arg1);
        field2771[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method981(arg0, 0, arg1));
        field2771[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field2766[arg0]; var6++) {
            float var9 = this.method985(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method981(arg0, var6, arg1));
            float var11 = var9 * var9;
            field2771[arg0][var6 * 2 + 1] = field2771[arg0][var6 * 2 - 1] * var11;
            field2771[arg0][var6 * 2] = field2771[arg0][var6 * 2 - 1] * var10 + field2771[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field2771[arg0][var12] += field2771[arg0][var12 - 1] * var10 + field2771[arg0][var12 - 2] * var11;
            }
            field2771[arg0][1] += field2771[arg0][0] * var10 + var11;
            field2771[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field2766[0] * 2; var7++) {
                field2771[0][var7] *= field2764;
            }
        }
        for (int var8 = 0; var8 < this.field2766[arg0] * 2; var8++) {
            field2765[arg0][var8] = (int) (field2771[arg0][var8] * 65536.0F);
        }
        return this.field2766[arg0] * 2;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "()V")
    public static void method983() {
        field2771 = null;
        field2765 = null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lra;Ldd;)V")
    public final void method984(class185 arg0, class37 arg1) {
        int var3 = arg0.method1243(3);
        this.field2766[0] = var3 >> 4;
        this.field2766[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field2770[0] = this.field2770[1] = 0;
            return;
        }
        this.field2770[0] = arg0.method1252(2);
        this.field2770[1] = arg0.method1252(2);
        int var4 = arg0.method1243(3);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field2766[var5]; var8++) {
                this.field2768[var5][0][var8] = arg0.method1252(2);
                this.field2767[var5][0][var8] = arg0.method1252(2);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field2766[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field2768[var6][1][var7] = this.field2768[var6][0][var7];
                    this.field2767[var6][1][var7] = this.field2767[var6][0][var7];
                } else {
                    this.field2768[var6][1][var7] = arg0.method1252(2);
                    this.field2767[var6][1][var7] = arg0.method1252(2);
                }
            }
        }
        if (var4 != 0 || this.field2770[1] != this.field2770[0]) {
            arg1.method243(arg0);
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIF)F")
    private final float method985(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2767[arg0][1][arg1] - this.field2767[arg0][0][arg1]) * arg2 + (float) this.field2767[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(F)F")
    private static final float method986(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }
}
