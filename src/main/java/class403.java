import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class403 extends class670 {

    @OriginalMember(owner = "client!ns", name = "j", descriptor = "I")
    public int field5709;

    @OriginalMember(owner = "client!ns", name = "g", descriptor = "Z")
    public static boolean field5706 = false;

    @OriginalMember(owner = "client!ns", name = "i", descriptor = "Lbda;")
    public static class505 field5708 = new class505(2);

    @OriginalMember(owner = "client!ns", name = "h", descriptor = "I")
    public static int field5707;

    @OriginalMember(owner = "client!ns", name = "f", descriptor = "Lql;")
    public static class735 field5705;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(B)V")
    public static void method2511(byte arg0) {
        int var1 = -57 % ((52 - arg0) / 45);
        field5705 = null;
        field5708 = null;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IIIIII[FIFF[FIFI)V")
    public static final void method2512(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, int arg7, float arg8, float arg9, float[] arg10, int arg11, float arg12, int arg13) {
        field5707++;
        int var14 = arg2 - arg13;
        int var15 = arg5 - arg11;
        int var16 = arg7 - arg3;
        if (arg1 <= 45) {
            return;
        }
        float var17 = arg10[2] * (float) var16 + arg10[0] * (float) var15 + arg10[1] * (float) var14;
        float var18 = arg10[5] * (float) var16 + arg10[3] * (float) var15 + arg10[4] * (float) var14;
        float var19 = arg10[8] * (float) var16 + arg10[6] * (float) var15 + arg10[7] * (float) var14;
        float var20;
        float var21;
        if (arg0 == 0) {
            var20 = arg8 + 0.5F - var19;
            var21 = arg12 + var17 + 0.5F;
        } else if (arg0 == 1) {
            var20 = arg8 + var19 + 0.5F;
            var21 = arg12 + var17 + 0.5F;
        } else if (arg0 == 2) {
            var21 = arg12 + 0.5F - var17;
            var20 = arg9 + 0.5F - var18;
        } else if (arg0 == 3) {
            var21 = arg12 + var17 + 0.5F;
            var20 = arg9 + 0.5F - var18;
        } else if (arg0 == 4) {
            var20 = arg9 + 0.5F - var18;
            var21 = arg8 + var19 + 0.5F;
        } else {
            var20 = arg9 + 0.5F - var18;
            var21 = arg8 + 0.5F - var19;
        }
        if (arg4 == 1) {
            float var23 = var21;
            var21 = -var20;
            var20 = var23;
        } else if (arg4 == 2) {
            var21 = -var21;
            var20 = -var20;
        } else if (arg4 == 3) {
            float var22 = var21;
            var21 = var20;
            var20 = -var22;
        }
        arg6[1] = var20;
        arg6[0] = var21;
    }

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(I)V")
    public class403(int arg0) {
        this.field5709 = arg0;
    }
}
