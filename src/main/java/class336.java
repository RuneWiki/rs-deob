import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class336 {

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "Lof;")
    public static class620 field4318 = new class620(4);

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "Lei;")
    public static class177 field4322 = null;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
    public static int field4319;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "Ljava/lang/Object;")
    public static Object field4321;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
    public static final void method1998(int arg0) {
        if (arg0 == 3) {
            field4319++;
            class491.method2951((byte) 87);
        }
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V")
    public static void method1999(int arg0) {
        field4318 = null;
        field4322 = null;
        field4321 = null;
        if (arg0 != -1014569436) {
            method2000(0.52630466F, 72, 0.7708373F, null, -37, 47, 88, -81, -62, -96, -67, -0.7792966F, 32, null);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(FIF[FIIIIIIIFI[F)V")
    public static final void method2000(float arg0, int arg1, float arg2, float[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, float arg11, int arg12, float[] arg13) {
        int var14 = arg7 - arg12;
        int var15 = arg1 - arg10;
        field4320++;
        int var16 = arg5 - arg4;
        float var17 = arg13[2] * (float) var15 + arg13[1] * (float) var14 + arg13[0] * (float) var16;
        float var18 = arg13[5] * (float) var15 + arg13[4] * (float) var14 + arg13[3] * (float) var16;
        float var19 = arg13[8] * (float) var15 + arg13[6] * (float) var16 + arg13[7] * (float) var14;
        if (arg8 != 28795) {
            return;
        }
        float var20;
        float var21;
        if (arg6 == 0) {
            var20 = arg11 + var17 + 0.5F;
            var21 = arg0 + 0.5F - var19;
        } else if (arg6 == 1) {
            var21 = arg0 + var19 + 0.5F;
            var20 = arg11 + var17 + 0.5F;
        } else if (arg6 == 2) {
            var20 = arg11 + 0.5F - var17;
            var21 = arg2 + 0.5F - var18;
        } else if (arg6 == 3) {
            var20 = arg11 + var17 + 0.5F;
            var21 = arg2 + 0.5F - var18;
        } else if (arg6 == 4) {
            var20 = arg0 + var19 + 0.5F;
            var21 = arg2 + 0.5F - var18;
        } else {
            var20 = arg0 + 0.5F - var19;
            var21 = arg2 + 0.5F - var18;
        }
        if (arg9 == 1) {
            float var23 = var20;
            var20 = -var21;
            var21 = var23;
        } else if (arg9 == 2) {
            var20 = -var20;
            var21 = -var21;
        } else if (arg9 == 3) {
            float var22 = var20;
            var20 = var21;
            var21 = -var22;
        }
        arg3[0] = var20;
        arg3[1] = var21;
    }
}
