import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class173 {

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "Lkh;")
    public static class117 field3120 = class224.method1450((byte) 117, "null");

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "Ldb;")
    public static class36 field3114 = new class36();

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "Lkh;")
    private static class117 field3121 = class224.method1450((byte) 13, "Enter your username (V password)3");

    @OriginalMember(owner = "client!pi", name = "j", descriptor = "[Lab;")
    public static class3[] field3123 = new class3[4];

    @OriginalMember(owner = "client!pi", name = "m", descriptor = "[Z")
    public static boolean[] field3126 = new boolean[100];

    @OriginalMember(owner = "client!pi", name = "k", descriptor = "Lkh;")
    private static class117 field3124 = class224.method1450((byte) -4, "go back to the main RuneScape webpage");

    @OriginalMember(owner = "client!pi", name = "l", descriptor = "Lkh;")
    public static class117 field3125 = field3121;

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "Lkh;")
    public static class117 field3122 = field3124;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "[Lch;")
    public static class31[] field3118;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "[[[B")
    public static byte[][][] field3117;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)V")
    public static void method1208(byte arg0) {
        field3126 = null;
        if (arg0 != -51) {
            return;
        }
        field3120 = null;
        field3121 = null;
        field3122 = null;
        field3114 = null;
        field3124 = null;
        field3118 = null;
        field3117 = null;
        field3125 = null;
        field3123 = null;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)V")
    public static final void method1209(int arg0, int arg1) {
        if (arg0 == 7059) {
            field3119++;
            if (class223.method1446(arg1, 6)) {
                class176.method1225(-32769, class90.field1675[arg1], -1);
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1210(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 >= class240.field4355 && arg4 <= class146.field2678 && class159.field2910 <= arg5 && class224.field4040 >= arg2) {
            class190.method1270(arg4, arg5, (byte) -12, arg3, arg2, arg6, arg0, arg7);
        } else {
            class82.method562(arg5, arg6, arg0, arg2, arg3, arg4, arg7, (byte) 127);
        }
        if (arg1 == 23) {
            field3115++;
        }
    }
}
