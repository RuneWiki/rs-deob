import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class463 extends class397 {

    @OriginalMember(owner = "client!mj", name = "s", descriptor = "Z")
    public static boolean field6805 = true;

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "[Z")
    public static boolean[] field6801 = new boolean[100];

    @OriginalMember(owner = "client!mj", name = "q", descriptor = "[Lcq;")
    public static class327[] field6803 = new class327[14];

    @OriginalMember(owner = "client!mj", name = "u", descriptor = "F")
    public static float field6807;

    @OriginalMember(owner = "client!mj", name = "p", descriptor = "I")
    public static int field6802;

    @OriginalMember(owner = "client!mj", name = "r", descriptor = "I")
    public static int field6804;

    @OriginalMember(owner = "client!mj", name = "t", descriptor = "I")
    public static int field6806;

    @OriginalMember(owner = "client!mj", name = "v", descriptor = "I")
    public static int field6808;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V")
    public static final void method2719(int arg0) {
        field6802++;
        for (class190 var1 = (class190) class458.field6717.method2461(-113); var1 != null; var1 = (class190) class458.field6717.method2458(-124)) {
            var1.method1198();
        }
        int var2 = 6 / ((-arg0 - 56) / 58);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIZFII[FFFIIII)V")
    public static final void method2720(int arg0, int arg1, boolean arg2, float arg3, int arg4, int arg5, float[] arg6, float arg7, float arg8, int arg9, int arg10, int arg11, int arg12) {
        int var13 = arg10 - arg12;
        field6804++;
        int var14 = arg4 - arg5;
        int var15 = arg11 - arg0;
        float var16 = arg6[2] * (float) var14 + arg6[1] * (float) var15 + arg6[0] * (float) var13;
        float var17 = arg6[5] * (float) var14 + arg6[3] * (float) var13 + arg6[4] * (float) var15;
        if (!arg2) {
            field6805 = true;
        }
        float var18 = arg6[8] * (float) var14 + arg6[6] * (float) var13 + arg6[7] * (float) var15;
        float var19;
        float var20;
        if (arg1 == 0) {
            var20 = arg8 + 0.5F - var18;
            var19 = arg7 + var16 + 0.5F;
        } else if (arg1 == 1) {
            var20 = arg8 + var18 + 0.5F;
            var19 = arg7 + var16 + 0.5F;
        } else if (arg1 == 2) {
            var19 = arg7 + 0.5F - var16;
            var20 = arg3 + 0.5F - var17;
        } else if (arg1 == 3) {
            var19 = arg7 + var16 + 0.5F;
            var20 = arg3 + 0.5F - var17;
        } else if (arg1 == 4) {
            var19 = arg8 + var18 + 0.5F;
            var20 = arg3 + 0.5F - var17;
        } else {
            var20 = arg3 + 0.5F - var17;
            var19 = arg8 + 0.5F - var18;
        }
        if (arg9 == 1) {
            float var21 = var19;
            var19 = -var20;
            var20 = var21;
        } else if (arg9 == 2) {
            var19 = -var19;
            var20 = -var20;
        } else if (arg9 == 3) {
            float var22 = var19;
            var19 = var20;
            var20 = -var22;
        }
        class216.field3002 = var19;
        class141.field2015 = var20;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIZIB)V")
    public static final void method2721(int arg0, int arg1, boolean arg2, int arg3, byte arg4) {
        class196.field2784 = 0L;
        field6806++;
        int var5 = class50.method445(-8);
        if (arg3 == 3 || var5 == 3) {
            arg2 = true;
        }
        if (!class269.field3721.method298()) {
            arg2 = true;
        }
        if (arg4 != 113) {
            method2720(-15, -96, false, 0.59430367F, 124, 96, null, -1.45285F, 1.6246166F, -56, 78, -62, 80);
        }
        class346.method2048(var5, arg2, arg1, arg0, arg3, (byte) -65);
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)V")
    public static void method2722(int arg0) {
        field6803 = null;
        if (arg0 == 8261) {
            field6801 = null;
        }
    }
}
