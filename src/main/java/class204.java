import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class204 {

    @OriginalMember(owner = "client!e", name = "c", descriptor = "[[[I")
    private int[][][] field3673 = new int[2][2][4];

    @OriginalMember(owner = "client!e", name = "e", descriptor = "[I")
    private int[] field3675 = new int[2];

    @OriginalMember(owner = "client!e", name = "a", descriptor = "[[[I")
    private int[][][] field3671 = new int[2][2][4];

    @OriginalMember(owner = "client!e", name = "h", descriptor = "[I")
    public int[] field3678 = new int[2];

    @OriginalMember(owner = "client!e", name = "d", descriptor = "[[F")
    private static float[][] field3674 = new float[2][8];

    @OriginalMember(owner = "client!e", name = "b", descriptor = "[[I")
    public static int[][] field3672 = new int[2][8];

    @OriginalMember(owner = "client!e", name = "g", descriptor = "F")
    private static float field3677;

    @OriginalMember(owner = "client!e", name = "f", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "()V")
    public static void method1384() {
        field3674 = null;
        field3672 = null;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IF)I")
    public final int method1385(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field3675[1] - this.field3675[0]) * arg1 + (float) this.field3675[0];
            float var4 = var3 * 0.0030517578F;
            field3677 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field3676 = (int) (field3677 * 65536.0F);
        }
        if (this.field3678[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1389(arg0, 0, arg1);
        field3674[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1388(arg0, 0, arg1));
        field3674[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field3678[arg0]; var6++) {
            float var9 = this.method1389(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method1388(arg0, var6, arg1));
            float var11 = var9 * var9;
            field3674[arg0][var6 * 2 + 1] = field3674[arg0][var6 * 2 - 1] * var11;
            field3674[arg0][var6 * 2] = field3674[arg0][var6 * 2 - 1] * var10 + field3674[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field3674[arg0][var12] += field3674[arg0][var12 - 1] * var10 + field3674[arg0][var12 - 2] * var11;
            }
            field3674[arg0][1] += field3674[arg0][0] * var10 + var11;
            field3674[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field3678[0] * 2; var7++) {
                field3674[0][var7] *= field3677;
            }
        }
        for (int var8 = 0; var8 < this.field3678[arg0] * 2; var8++) {
            field3672[arg0][var8] = (int) (field3674[arg0][var8] * 65536.0F);
        }
        return this.field3678[arg0] * 2;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lp;Leh;)V")
    public final void method1386(class56 arg0, class107 arg1) {
        int var3 = arg0.method367(1);
        this.field3678[0] = var3 >> 4;
        this.field3678[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field3675[0] = this.field3675[1] = 0;
            return;
        }
        this.field3675[0] = arg0.method318(true);
        this.field3675[1] = arg0.method318(true);
        int var4 = arg0.method367(1);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field3678[var5]; var8++) {
                this.field3673[var5][0][var8] = arg0.method318(true);
                this.field3671[var5][0][var8] = arg0.method318(true);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field3678[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field3673[var6][1][var7] = this.field3673[var6][0][var7];
                    this.field3671[var6][1][var7] = this.field3671[var6][0][var7];
                } else {
                    this.field3673[var6][1][var7] = arg0.method318(true);
                    this.field3671[var6][1][var7] = arg0.method318(true);
                }
            }
        }
        if (var4 != 0 || this.field3675[1] != this.field3675[0]) {
            arg1.method644(arg0);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(F)F")
    private static final float method1387(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIF)F")
    private final float method1388(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3673[arg0][1][arg1] - this.field3673[arg0][0][arg1]) * arg2 + (float) this.field3673[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1387(var5);
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(IIF)F")
    private final float method1389(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3671[arg0][1][arg1] - this.field3671[arg0][0][arg1]) * arg2 + (float) this.field3671[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }
}
