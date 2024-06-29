import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public abstract class class205 {

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "I")
    public static int field2890 = 0;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "I")
    public static int field2889;

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!rt", name = "d", descriptor = "Lrca;")
    public static class418 field2892;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(ZI)I")
    public static final int method1359(boolean arg0, int arg1) {
        field2891++;
        if (arg0) {
            field2892 = null;
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(B)V")
    public abstract void method1360(byte arg0);

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(IFFIIIIIIFI[FI)V")
    public static final void method1361(int arg0, float arg1, float arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, float arg9, int arg10, float[] arg11, int arg12) {
        int var13 = arg7 - arg4;
        field2889++;
        int var14 = arg10 - arg3;
        int var15 = arg12 - arg0;
        float var16 = arg11[2] * (float) var14 + arg11[1] * (float) var15 + arg11[0] * (float) var13;
        float var17 = arg11[5] * (float) var14 + arg11[arg6] * (float) var13 + arg11[4] * (float) var15;
        float var18 = arg11[8] * (float) var14 + arg11[6] * (float) var13 + arg11[7] * (float) var15;
        float var19;
        float var20;
        if (arg5 == 0) {
            var19 = arg2 + 0.5F - var18;
            var20 = arg9 + var16 + 0.5F;
        } else if (arg5 == 1) {
            var19 = arg2 + var18 + 0.5F;
            var20 = arg9 + var16 + 0.5F;
        } else if (arg5 == 2) {
            var19 = arg1 + 0.5F - var17;
            var20 = arg9 + 0.5F - var16;
        } else if (arg5 == 3) {
            var20 = arg9 + var16 + 0.5F;
            var19 = arg1 + 0.5F - var17;
        } else if (arg5 == 4) {
            var19 = arg1 + 0.5F - var17;
            var20 = arg2 + var18 + 0.5F;
        } else {
            var19 = arg1 + 0.5F - var17;
            var20 = arg2 + 0.5F - var18;
        }
        if (arg8 == 1) {
            float var21 = var20;
            var20 = -var19;
            var19 = var21;
        } else if (arg8 == 2) {
            var19 = -var19;
            var20 = -var20;
        } else if (arg8 == 3) {
            float var22 = var20;
            var20 = var19;
            var19 = -var22;
        }
        class503.field7114 = var19;
        class64.field1208 = var20;
    }

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "(B)V")
    public static void method1362(byte arg0) {
        field2892 = null;
        if (arg0 >= -8) {
            method1361(-29, 0.51427376F, 0.6885392F, -6, -109, -112, -12, -98, 54, -0.29324245F, 110, null, 127);
        }
    }

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "(B)V")
    public abstract void method1363(byte arg0);

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "(ZI)Z")
    public abstract boolean method1364(boolean arg0, int arg1);

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(I)Lvr;")
    public abstract class121 method1365(int arg0);
}
