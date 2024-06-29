import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bga")
public class class370 {

    @OriginalMember(owner = "client!bga", name = "b", descriptor = "[I")
    public static int[] field5122 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!bga", name = "d", descriptor = "I")
    public static int field5124 = 0;

    @OriginalMember(owner = "client!bga", name = "c", descriptor = "Lmf;")
    public static class409 field5123 = new class409();

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "I")
    public static int field5121;

    @OriginalMember(owner = "client!bga", name = "e", descriptor = "I")
    public static int field5125;

    @OriginalMember(owner = "client!bga", name = "f", descriptor = "Lfaa;")
    public static class425 field5126;

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(BIIII)I", line = 4)
    public static final int method2213(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 51 / ((60 - arg0) / 56);
        field5121++;
        int var6 = 65536 - class302.field4242[arg4 * 8192 / arg2] >> 1;
        return ((65536 - var6) * arg1 >> 16) + (arg3 * var6 >> 16);
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "([FIFIIIFIIII)V", line = 25)
    public static final void method2214(float[] arg0, int arg1, float arg2, int arg3, int arg4, int arg5, float arg6, int arg7, int arg8, int arg9, int arg10) {
        field5125++;
        int var11 = arg1 - arg4;
        int var12 = arg8 - arg10;
        int var13 = arg3 - arg9;
        float var14 = arg0[2] * (float) var11 + arg0[0] * (float) var13 + arg0[1] * (float) var12;
        float var15 = arg0[5] * (float) var11 + arg0[arg7] * (float) var13 + arg0[4] * (float) var12;
        float var16 = arg0[8] * (float) var11 + arg0[6] * (float) var13 + arg0[7] * (float) var12;
        float var17 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        if (arg6 != 1.0F) {
            var17 = arg6 * var17;
        }
        float var18 = var15 + arg2 + 0.5F;
        if (arg5 == 1) {
            float var19 = var17;
            var17 = -var18;
            var18 = var19;
        } else if (arg5 == 2) {
            var18 = -var18;
            var17 = -var17;
        } else if (arg5 == 3) {
            float var20 = var17;
            var17 = var18;
            var18 = -var20;
        }
        class460.field6619 = var18;
        class7.field70 = var17;
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(B)V", line = 76)
    public static void method2215(byte arg0) {
        int var1 = -76 % ((arg0 + 36) / 37);
        field5123 = null;
        field5122 = null;
        field5126 = null;
    }
}
