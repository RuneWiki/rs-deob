import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class164 {

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "[I")
    public int[] field3318 = new int[2];

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "[[[I")
    private int[][][] field3315 = new int[2][2][4];

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "[[[I")
    private int[][][] field3322 = new int[2][2][4];

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "[I")
    private int[] field3321 = new int[2];

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "[[I")
    public static int[][] field3320 = new int[2][8];

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "[[F")
    private static float[][] field3319 = new float[2][8];

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "F")
    private static float field3317;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIF)F")
    private final float method1083(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3315[arg0][1][arg1] - this.field3315[arg0][0][arg1]) * arg2 + (float) this.field3315[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1086(var5);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IF)I")
    public final int method1084(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field3321[1] - this.field3321[0]) * arg1 + (float) this.field3321[0];
            float var4 = var3 * 0.0030517578F;
            field3317 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field3316 = (int) (field3317 * 65536.0F);
        }
        if (this.field3318[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1087(arg0, 0, arg1);
        field3319[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1083(arg0, 0, arg1));
        field3319[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field3318[arg0]; var6++) {
            float var9 = this.method1087(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method1083(arg0, var6, arg1));
            float var11 = var9 * var9;
            field3319[arg0][var6 * 2 + 1] = field3319[arg0][var6 * 2 - 1] * var11;
            field3319[arg0][var6 * 2] = field3319[arg0][var6 * 2 - 1] * var10 + field3319[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field3319[arg0][var12] += field3319[arg0][var12 - 1] * var10 + field3319[arg0][var12 - 2] * var11;
            }
            field3319[arg0][1] += field3319[arg0][0] * var10 + var11;
            field3319[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field3318[0] * 2; var7++) {
                field3319[0][var7] *= field3317;
            }
        }
        for (int var8 = 0; var8 < this.field3318[arg0] * 2; var8++) {
            field3320[arg0][var8] = (int) (field3319[arg0][var8] * 65536.0F);
        }
        return this.field3318[arg0] * 2;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "()V")
    public static void method1085() {
        field3319 = null;
        field3320 = null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(F)F")
    private static final float method1086(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(IIF)F")
    private final float method1087(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3322[arg0][1][arg1] - this.field3322[arg0][0][arg1]) * arg2 + (float) this.field3322[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lce;Lie;)V")
    public final void method1088(class26 arg0, class85 arg1) {
        int var3 = arg0.method221(-84);
        this.field3318[0] = var3 >> 4;
        this.field3318[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field3321[0] = this.field3321[1] = 0;
            return;
        }
        this.field3321[0] = arg0.method256((byte) -78);
        this.field3321[1] = arg0.method256((byte) -78);
        int var4 = arg0.method221(-111);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field3318[var5]; var8++) {
                this.field3315[var5][0][var8] = arg0.method256((byte) -78);
                this.field3322[var5][0][var8] = arg0.method256((byte) -78);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field3318[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field3315[var6][1][var7] = this.field3315[var6][0][var7];
                    this.field3322[var6][1][var7] = this.field3322[var6][0][var7];
                } else {
                    this.field3315[var6][1][var7] = arg0.method256((byte) -78);
                    this.field3322[var6][1][var7] = arg0.method256((byte) -78);
                }
            }
        }
        if (var4 != 0 || this.field3321[1] != this.field3321[0]) {
            arg1.method636(arg0);
        }
    }
}
