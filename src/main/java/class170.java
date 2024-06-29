import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class170 {

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "Z")
    public static boolean field2981 = false;

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "I")
    public static int field2987 = -1;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
    public static int field2980 = 0;

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "Lmb;")
    public static class96 field2985 = class243.method1708("(U5", (byte) 121);

    @OriginalMember(owner = "client!ch", name = "k", descriptor = "Lmb;")
    private static class96 field2989 = class243.method1708("K", (byte) 117);

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "Lmb;")
    public static class96 field2979 = field2989;

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "Lmb;")
    public static class96 field2984 = field2989;

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!ch", name = "l", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!ch", name = "m", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "Lff;")
    public static class3 field2983;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "[I")
    public static int[] field2982;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIII)V")
    public static final void method1217(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 > -73) {
            return;
        }
        field2990++;
        if (arg1 == arg3) {
            class200.method1401(arg4, false, arg5, arg3, arg0);
        } else if (class9.field145 <= arg0 - arg3 && (arg0 + arg3) <= class162.field2884 && arg4 - arg1 >= client.field1994 && arg4 + arg1 <= class9.field149) {
            class3.method20(arg1, (byte) -121, arg0, arg5, arg3, arg4);
        } else {
            class245.method1721(arg1, arg5, arg3, arg0, arg4, (byte) 120);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BLff;)V")
    public static final void method1218(byte arg0, class3 arg1) {
        field2991++;
        class52.field900 = arg1;
        int var2 = -79 / ((14 - arg0) / 40);
        class175.field3052 = class52.field900.method37(16, (byte) -126);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Z)V")
    public static void method1219(boolean arg0) {
        field2979 = null;
        field2989 = null;
        field2985 = null;
        field2984 = null;
        field2983 = null;
        field2982 = null;
        if (arg0) {
            field2987 = 108;
        }
    }
}
