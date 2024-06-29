import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class238 {

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "[[[I")
    private int[][][] field3582 = new int[2][2][4];

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "[I")
    private int[] field3586 = new int[2];

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "[I")
    public int[] field3584 = new int[2];

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "[[[I")
    private int[][][] field3588 = new int[2][2][4];

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "[[I")
    public static int[][] field3585 = new int[2][8];

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "[[F")
    private static float[][] field3583 = new float[2][8];

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "F")
    private static float field3587;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
    public static int field3589;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(F)F")
    private static final float method1507(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lfl;Lcg;)V")
    public final void method1508(class248 arg0, class168 arg1) {
        int var3 = arg0.method1593((byte) 27);
        this.field3584[0] = var3 >> 4;
        this.field3584[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field3586[0] = this.field3586[1] = 0;
            return;
        }
        this.field3586[0] = arg0.method1575(false);
        this.field3586[1] = arg0.method1575(false);
        int var4 = arg0.method1593((byte) 27);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field3584[var5]; var8++) {
                this.field3588[var5][0][var8] = arg0.method1575(false);
                this.field3582[var5][0][var8] = arg0.method1575(false);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field3584[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field3588[var6][1][var7] = this.field3588[var6][0][var7];
                    this.field3582[var6][1][var7] = this.field3582[var6][0][var7];
                } else {
                    this.field3588[var6][1][var7] = arg0.method1575(false);
                    this.field3582[var6][1][var7] = arg0.method1575(false);
                }
            }
        }
        if (var4 != 0 || this.field3586[1] != this.field3586[0]) {
            arg1.method1048(arg0);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "()V")
    public static void method1509() {
        field3583 = null;
        field3585 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIF)F")
    private final float method1510(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3582[arg0][1][arg1] - this.field3582[arg0][0][arg1]) * arg2 + (float) this.field3582[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(IIF)F")
    private final float method1511(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3588[arg0][1][arg1] - this.field3588[arg0][0][arg1]) * arg2 + (float) this.field3588[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1507(var5);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IF)I")
    public final int method1512(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field3586[1] - this.field3586[0]) * arg1 + (float) this.field3586[0];
            float var4 = var3 * 0.0030517578F;
            field3587 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field3589 = (int) (field3587 * 65536.0F);
        }
        if (this.field3584[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1510(arg0, 0, arg1);
        field3583[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1511(arg0, 0, arg1));
        field3583[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field3584[arg0]; var6++) {
            float var9 = this.method1510(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method1511(arg0, var6, arg1));
            float var11 = var9 * var9;
            field3583[arg0][var6 * 2 + 1] = field3583[arg0][var6 * 2 - 1] * var11;
            field3583[arg0][var6 * 2] = field3583[arg0][var6 * 2 - 1] * var10 + field3583[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field3583[arg0][var12] += field3583[arg0][var12 - 1] * var10 + field3583[arg0][var12 - 2] * var11;
            }
            field3583[arg0][1] += field3583[arg0][0] * var10 + var11;
            field3583[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field3584[0] * 2; var7++) {
                field3583[0][var7] *= field3587;
            }
        }
        for (int var8 = 0; var8 < this.field3584[arg0] * 2; var8++) {
            field3585[arg0][var8] = (int) (field3583[arg0][var8] * 65536.0F);
        }
        return this.field3584[arg0] * 2;
    }
}
