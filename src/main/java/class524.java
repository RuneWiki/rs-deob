import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class524 {

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "[I")
    public static int[] field7277 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1 };

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "Lvha;")
    public static class67 field7279 = new class67(8);

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "I")
    public static int field7283 = 0;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
    public static int field7278;

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "I")
    public static int field7282;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "Lej;")
    public static class179 field7280;

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "Luu;")
    public static class237 field7281;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V", line = 4)
    public static void method3117(int arg0) {
        if (arg0 >= 25) {
            field7277 = null;
            field7281 = null;
            field7280 = null;
            field7279 = null;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIII[FFB[FFII)V", line = 22)
    public static final void method3118(int arg0, int arg1, int arg2, int arg3, int arg4, float[] arg5, float arg6, byte arg7, float[] arg8, float arg9, int arg10, int arg11) {
        int var12 = arg11 - arg10;
        field7278++;
        int var13 = arg0 - arg1;
        int var14 = arg4 - arg3;
        if (arg7 != 76) {
            return;
        }
        float var15 = arg8[2] * (float) var13 + arg8[0] * (float) var12 + arg8[1] * (float) var14;
        float var16 = arg8[5] * (float) var13 + arg8[4] * (float) var14 + arg8[3] * (float) var12;
        float var17 = arg8[8] * (float) var13 + arg8[6] * (float) var12 + arg8[7] * (float) var14;
        float var18 = (float) Math.atan2((double) var15, (double) var17) / 6.2831855F + 0.5F;
        if (arg9 != 1.0F) {
            var18 = arg9 * var18;
        }
        float var19 = var16 + arg6 + 0.5F;
        if (arg2 == 1) {
            float var20 = var18;
            var18 = -var19;
            var19 = var20;
        } else if (arg2 == 2) {
            var19 = -var19;
            var18 = -var18;
        } else if (arg2 == 3) {
            float var21 = var18;
            var18 = var19;
            var19 = -var21;
        }
        arg5[0] = var18;
        arg5[1] = var19;
    }
}
