import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class56 extends class132 {

    @OriginalMember(owner = "client!fa", name = "x", descriptor = "I")
    public int field1047 = -1;

    @OriginalMember(owner = "client!fa", name = "N", descriptor = "I")
    public int field1061 = 0;

    @OriginalMember(owner = "client!fa", name = "C", descriptor = "Lvd;")
    private static class222 field1051 = class212.method1357("To create a new account you need to", 10731);

    @OriginalMember(owner = "client!fa", name = "M", descriptor = "Lvd;")
    public static class222 field1060 = field1051;

    @OriginalMember(owner = "client!fa", name = "z", descriptor = "Lvd;")
    private static class222 field1049 = class212.method1357("RuneScape is loading )2 please wait)3)3)3", 10731);

    @OriginalMember(owner = "client!fa", name = "E", descriptor = "Lvd;")
    public static class222 field1053 = field1049;

    @OriginalMember(owner = "client!fa", name = "L", descriptor = "Lcf;")
    public static class28 field1059 = new class28();

    @OriginalMember(owner = "client!fa", name = "O", descriptor = "[I")
    public static int[] field1062 = new int[100];

    @OriginalMember(owner = "client!fa", name = "R", descriptor = "I")
    public static int field1065 = 1;

    @OriginalMember(owner = "client!fa", name = "P", descriptor = "I")
    public static int field1063 = 0;

    @OriginalMember(owner = "client!fa", name = "S", descriptor = "I")
    public static int field1066 = 0;

    @OriginalMember(owner = "client!fa", name = "Q", descriptor = "Lvd;")
    public static class222 field1064 = class212.method1357("; Max)2Age=", 10731);

    @OriginalMember(owner = "client!fa", name = "s", descriptor = "I")
    public int field1042;

    @OriginalMember(owner = "client!fa", name = "t", descriptor = "I")
    public int field1043;

    @OriginalMember(owner = "client!fa", name = "u", descriptor = "I")
    public int field1044;

    @OriginalMember(owner = "client!fa", name = "v", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!fa", name = "w", descriptor = "I")
    public int field1046;

    @OriginalMember(owner = "client!fa", name = "y", descriptor = "I")
    public int field1048;

    @OriginalMember(owner = "client!fa", name = "B", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!fa", name = "D", descriptor = "I")
    public int field1052;

    @OriginalMember(owner = "client!fa", name = "F", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!fa", name = "G", descriptor = "I")
    public int field1055;

    @OriginalMember(owner = "client!fa", name = "H", descriptor = "I")
    public int field1056;

    @OriginalMember(owner = "client!fa", name = "I", descriptor = "I")
    public int field1057;

    @OriginalMember(owner = "client!fa", name = "K", descriptor = "I")
    public int field1058;

    @OriginalMember(owner = "client!fa", name = "T", descriptor = "Lve;")
    public static class223 field1067;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(III)J")
    public static final long method413(int arg0, int arg1, int arg2) {
        class121 var3 = class204.field3800[arg0][arg1][arg2];
        return var3 == null || var3.field2302 == null ? 0L : var3.field2302.field3670;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)Lvd;")
    public static final class222 method414(int arg0, int arg1) {
        if (arg0 >= -93) {
            method415(63);
        }
        field1045++;
        return class225.method1470(false, 105, 10, arg1);
    }

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "(I)V")
    public static void method415(int arg0) {
        field1064 = null;
        if (arg0 != 0) {
            return;
        }
        field1053 = null;
        field1049 = null;
        field1051 = null;
        field1062 = null;
        field1060 = null;
        field1059 = null;
        field1067 = null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILab;)V")
    public static final void method416(int arg0, class3 arg1) {
        if (arg0 <= -89) {
            class55.field1034 = arg1;
            field1054++;
        }
    }
}
