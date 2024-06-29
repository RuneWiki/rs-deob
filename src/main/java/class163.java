import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class163 {

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "Loc;")
    private static class151 field2941 = class137.method873(2, "wave2:");

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "Loc;")
    public static class151 field2945 = field2941;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "[I")
    public static int[] field2942 = new int[1000];

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
    public static int field2943 = -1;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "Loc;")
    public static class151 field2947 = field2941;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "Lk;")
    public static class108 field2948 = new class108(5000);

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "Loc;")
    private static class151 field2949 = class137.method873(2, "skill)2");

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "Loc;")
    private static class151 field2950 = class137.method873(2, "To create a new account you need to");

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "Loc;")
    private static class151 field2954 = class137.method873(2, "Select");

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "Loc;")
    public static class151 field2951 = field2954;

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "Loc;")
    public static class151 field2955 = field2950;

    @OriginalMember(owner = "client!pe", name = "p", descriptor = "Loc;")
    public static class151 field2956 = field2949;

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "[I")
    public static int[] field2953 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "Lsd;")
    public static class192 field2952;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "[I")
    public static int[] field2946;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIILwg;IJIIII)Z")
    public static final boolean method1053(int arg0, int arg1, int arg2, int arg3, class235 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class218.method1363(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Z)V")
    public static final void method1054(boolean arg0) {
        field2944++;
        if (arg0) {
            method1054(true);
        }
        for (int var1 = -1; var1 < class47.field961; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class159.field2866[var1];
            }
            class20 var3 = class179.field3229[var2];
            if (var3 != null) {
                class169.method1092(var3, 11416, 1);
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
    public static void method1055(int arg0) {
        field2953 = null;
        field2949 = null;
        field2954 = null;
        field2950 = null;
        field2955 = null;
        field2942 = null;
        field2956 = null;
        field2947 = null;
        field2946 = null;
        field2952 = null;
        field2951 = null;
        field2945 = null;
        int var1 = -38 % ((-arg0 - 47) / 48);
        field2941 = null;
        field2948 = null;
    }
}
