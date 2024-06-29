import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public class class690 {

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "[F")
    public static float[] field9797 = new float[4];

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "[I")
    public static int[] field9798 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!ut", name = "d", descriptor = "Ldh;")
    public static class654 field9800 = null;

    @OriginalMember(owner = "client!ut", name = "c", descriptor = "I")
    public static int field9799;

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(I)V", line = 6)
    public static void method3854(int arg0) {
        if (arg0 == 20134) {
            field9798 = null;
            field9797 = null;
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "([FFIIIIIII[FI)V", line = 27)
    public static final void method3855(float[] arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, float[] arg9, int arg10) {
        field9799++;
        int var11 = arg6 - arg2;
        int var12 = arg3 - arg4;
        int var13 = arg7 - arg10;
        float var14 = arg9[2] * (float) var11 + arg9[0] * (float) var13 + arg9[1] * (float) var12;
        float var15 = arg9[5] * (float) var11 + arg9[3] * (float) var13 + arg9[4] * (float) var12;
        float var16 = arg9[8] * (float) var11 + arg9[6] * (float) var13 + arg9[7] * (float) var12;
        float var17 = (float) Math.sqrt((double) (var16 * var16 + var14 * var14 + var15 * var15));
        float var18 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        float var19 = (float) Math.asin((double) (var15 / var17)) / 3.1415927F + arg1 + 0.5F;
        if (arg8 != 2616) {
            return;
        }
        if (arg5 == 1) {
            float var20 = var18;
            var18 = -var19;
            var19 = var20;
        } else if (arg5 == 2) {
            var18 = -var18;
            var19 = -var19;
        } else if (arg5 == 3) {
            float var21 = var18;
            var18 = var19;
            var19 = -var21;
        }
        arg0[1] = var19;
        arg0[0] = var18;
    }
}
