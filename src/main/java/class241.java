import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class241 {

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "I")
    public static int field3944 = -1;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "Lwm;")
    private static class152 field3945 = class157.method1048("glow3:", 115);

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "Lwm;")
    public static class152 field3940 = field3945;

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "Lwm;")
    public static class152 field3943 = field3945;

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "I")
    public static int field3948 = 0;

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "[Z")
    public static boolean[] field3946 = new boolean[100];

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "Lne;")
    public static class235 field3947 = new class235(260);

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "I")
    public static int field3949 = 0;

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "Lwm;")
    public static class152 field3950 = class157.method1048("details", 118);

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "Lwm;")
    public static class152 field3951 = null;

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
    public static int field3939;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "I")
    public static int field3941;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "Lwm;")
    public static class152 field3942;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "[I")
    public static int[] field3938;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IJ)Lwm;", line = 4)
    public static final class152 method1641(int arg0, long arg1) {
        field3939++;
        return arg0 < 41 ? (class152) null : class148.method930(100, false, arg1, 10);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lqk;Lqk;I)V", line = 21)
    public static final void method1642(class61 arg0, class61 arg1, int arg2) {
        if (arg0.field930 != null) {
            arg0.method402(0);
        }
        arg0.field927 = arg1.field927;
        field3941++;
        arg0.field930 = arg1;
        arg0.field930.field927 = arg0;
        if (arg2 != 1920) {
            field3946 = (boolean[]) null;
        }
        arg0.field927.field930 = arg0;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)V", line = 45)
    public static void method1643(byte arg0) {
        field3942 = null;
        field3946 = null;
        field3943 = null;
        field3940 = null;
        field3945 = null;
        if (arg0 < 76) {
            field3948 = -61;
        }
        field3951 = null;
        field3947 = null;
        field3950 = null;
        field3938 = null;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIILv;IJZ)Z", line = 62)
    public static final boolean method1644(int arg0, int arg1, int arg2, int arg3, int arg4, class73 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class262.method1804(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }
}
