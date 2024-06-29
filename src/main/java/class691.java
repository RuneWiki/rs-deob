import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public abstract class class691 {

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "Ljn;")
    public static class117 field9789 = new class117(32);

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "Lvh;")
    public static class125 field9793 = new class125(54, 7);

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
    public static int field9790;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
    public static int field9791;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "Lvo;")
    public static class345 field9792;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "Ljava/lang/Object;")
    public static Object field9794;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(II[FFIIIIIFIZF)V", line = 11)
    public static final void method3887(int arg0, int arg1, float[] arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8, float arg9, int arg10, boolean arg11, float arg12) {
        field9790++;
        int var13 = arg0 - arg1;
        int var14 = arg8 - arg7;
        int var15 = arg6 - arg5;
        float var16 = arg2[2] * (float) var15 + arg2[0] * (float) var13 + arg2[1] * (float) var14;
        float var17 = arg2[5] * (float) var15 + arg2[3] * (float) var13 + arg2[4] * (float) var14;
        float var18 = arg2[8] * (float) var15 + arg2[6] * (float) var13 + arg2[7] * (float) var14;
        if (!arg11) {
            return;
        }
        float var19;
        float var20;
        if (arg4 == 0) {
            var19 = arg9 + var16 + 0.5F;
            var20 = arg3 + 0.5F - var18;
        } else if (arg4 == 1) {
            var20 = arg3 + var18 + 0.5F;
            var19 = arg9 + var16 + 0.5F;
        } else if (arg4 == 2) {
            var20 = arg12 + 0.5F - var17;
            var19 = arg9 + 0.5F - var16;
        } else if (arg4 == 3) {
            var19 = arg9 + var16 + 0.5F;
            var20 = arg12 + 0.5F - var17;
        } else if (arg4 == 4) {
            var20 = arg12 + 0.5F - var17;
            var19 = arg3 + var18 + 0.5F;
        } else {
            var19 = arg3 + 0.5F - var18;
            var20 = arg12 + 0.5F - var17;
        }
        if (arg10 == 1) {
            float var22 = var19;
            var19 = -var20;
            var20 = var22;
        } else if (arg10 == 2) {
            var19 = -var19;
            var20 = -var20;
        } else if (arg10 == 3) {
            float var21 = var19;
            var19 = var20;
            var20 = -var21;
        }
        class597.field8634 = var19;
        class425.field6072 = var20;
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(B)V", line = 98)
    public static void method3888(byte arg0) {
        field9792 = null;
        field9789 = null;
        int var1 = 17 / ((41 - arg0) / 33);
        field9794 = null;
        field9793 = null;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(FF[BIBILba;IIFIFFI)V", line = 121)
    public static final void method3889(float arg0, float arg1, byte[] arg2, int arg3, byte arg4, int arg5, class108 arg6, int arg7, int arg8, float arg9, int arg10, float arg11, float arg12, int arg13) {
        field9791++;
        int var14 = arg5 * arg8;
        float[] var15 = new float[var14];
        for (int var16 = 0; var16 < arg7; var16++) {
            arg6.method892(arg1 * 127.0F, arg9 / (float) arg5, arg13, 0, arg12 / (float) arg10, var15, (byte) 65, arg10, arg8, arg5, arg11 / (float) arg8);
            int var19 = arg3;
            arg9 *= 2.0F;
            arg12 *= 2.0F;
            for (int var20 = 0; var20 < var14; var20++) {
                arg2[var19] = (byte) ((int) ((float) arg2[var19] + var15[var20]));
                var19++;
            }
            arg1 = arg0 * arg1;
            arg11 *= 2.0F;
        }
        if (arg4 != 4) {
            return;
        }
        int var17 = arg3;
        for (int var18 = 0; var18 < var14; var18++) {
            arg2[var17] -= -127;
            var17++;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I[B)V")
    public abstract void method3366(int arg0, byte[] arg1);

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)[B")
    public abstract byte[] method3365(byte arg0);

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(III)[B")
    public abstract byte[] method3364(int arg0, int arg1, int arg2);
}
