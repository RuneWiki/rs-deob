import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class154 {

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "[I")
    public int[] field3586 = new int[2];

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "[I")
    private int[] field3588 = new int[2];

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "[[[I")
    private int[][][] field3587 = new int[2][2][4];

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "[[[I")
    private int[][][] field3592 = new int[2][2][4];

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "[[F")
    private static float[][] field3591 = new float[2][8];

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "[[I")
    public static int[][] field3593 = new int[2][8];

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "F")
    private static float field3589;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIF)F")
    private final float method1205(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3587[arg0][1][arg1] - this.field3587[arg0][0][arg1]) * arg2 + (float) this.field3587[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1206(var5);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(F)F")
    private static final float method1206(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lrd;Lub;)V")
    public final void method1207(class122 arg0, class140 arg1) {
        int var3 = arg0.method931((byte) 124);
        this.field3586[0] = var3 >> 4;
        this.field3586[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field3588[0] = this.field3588[1] = 0;
            return;
        }
        this.field3588[0] = arg0.method965(false);
        this.field3588[1] = arg0.method965(false);
        int var4 = arg0.method931((byte) 124);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field3586[var5]; var8++) {
                this.field3587[var5][0][var8] = arg0.method965(false);
                this.field3592[var5][0][var8] = arg0.method965(false);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field3586[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field3587[var6][1][var7] = this.field3587[var6][0][var7];
                    this.field3592[var6][1][var7] = this.field3592[var6][0][var7];
                } else {
                    this.field3587[var6][1][var7] = arg0.method965(false);
                    this.field3592[var6][1][var7] = arg0.method965(false);
                }
            }
        }
        if (var4 != 0 || this.field3588[1] != this.field3588[0]) {
            arg1.method1148(arg0);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IF)I")
    public final int method1208(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field3588[1] - this.field3588[0]) * arg1 + (float) this.field3588[0];
            float var4 = var3 * 0.0030517578F;
            field3589 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field3590 = (int) (field3589 * 65536.0F);
        }
        if (this.field3586[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1209(arg0, 0, arg1);
        field3591[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1205(arg0, 0, arg1));
        field3591[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field3586[arg0]; var6++) {
            float var9 = this.method1209(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method1205(arg0, var6, arg1));
            float var11 = var9 * var9;
            field3591[arg0][var6 * 2 + 1] = field3591[arg0][var6 * 2 - 1] * var11;
            field3591[arg0][var6 * 2] = field3591[arg0][var6 * 2 - 1] * var10 + field3591[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field3591[arg0][var12] += field3591[arg0][var12 - 1] * var10 + field3591[arg0][var12 - 2] * var11;
            }
            field3591[arg0][1] += field3591[arg0][0] * var10 + var11;
            field3591[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field3586[0] * 2; var7++) {
                field3591[0][var7] *= field3589;
            }
        }
        for (int var8 = 0; var8 < this.field3586[arg0] * 2; var8++) {
            field3593[arg0][var8] = (int) (field3591[arg0][var8] * 65536.0F);
        }
        return this.field3586[arg0] * 2;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(IIF)F")
    private final float method1209(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3592[arg0][1][arg1] - this.field3592[arg0][0][arg1]) * arg2 + (float) this.field3592[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "()V")
    public static void method1210() {
        field3591 = null;
        field3593 = null;
    }
}
