import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mba")
public class class442 {

    @OriginalMember(owner = "client!mba", name = "b", descriptor = "[Lso;")
    public static class496[] field5928 = new class496[4];

    @OriginalMember(owner = "client!mba", name = "d", descriptor = "[I")
    public static int[] field5930 = new int[14];

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "I")
    public static int field5927;

    @OriginalMember(owner = "client!mba", name = "c", descriptor = "I")
    public static int field5929;

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(I)V", line = 4)
    public static void method2601(int arg0) {
        field5930 = null;
        field5928 = null;
        if (arg0 > -111) {
            method2601(31);
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(III[F[FFIIIII)V", line = 21)
    public static final void method2602(int arg0, int arg1, int arg2, float[] arg3, float[] arg4, float arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = arg8 - arg7;
        int var12 = arg9 - arg2;
        int var13 = arg0 - arg6;
        field5927++;
        float var14 = arg3[2] * (float) var11 + arg3[1] * (float) var13 + arg3[0] * (float) var12;
        float var15 = arg3[5] * (float) var11 + arg3[arg10] * (float) var12 + arg3[4] * (float) var13;
        float var16 = arg3[8] * (float) var11 + arg3[7] * (float) var13 + arg3[6] * (float) var12;
        float var17 = (float) Math.sqrt((double) (var16 * var16 + var14 * var14 + var15 * var15));
        float var18 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        float var19 = arg5 + (float) Math.asin((double) (var15 / var17)) / 3.1415927F + 0.5F;
        if (arg1 == 1) {
            float var20 = var18;
            var18 = -var19;
            var19 = var20;
        } else if (arg1 == 2) {
            var18 = -var18;
            var19 = -var19;
        } else if (arg1 == 3) {
            float var21 = var18;
            var18 = var19;
            var19 = -var21;
        }
        arg4[1] = var19;
        arg4[0] = var18;
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(B)I", line = 73)
    public static final int method2603(byte arg0) {
        field5929++;
        if (class208.field2473 == null) {
            return 0;
        } else if (arg0 == -21) {
            return class208.field2473.length * 2;
        } else {
            return 104;
        }
    }
}
