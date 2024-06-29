import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class46 extends class52 {

    @OriginalMember(owner = "client!f", name = "cb", descriptor = "Z")
    public static boolean field1122 = false;

    @OriginalMember(owner = "client!f", name = "ab", descriptor = "Lea;")
    private static class38 field1120 = class9.method46((byte) 120, "Please wait 1 minute and try again)3");

    @OriginalMember(owner = "client!f", name = "jb", descriptor = "Lea;")
    public static class38 field1129 = field1120;

    @OriginalMember(owner = "client!f", name = "lb", descriptor = "Lea;")
    public static class38 field1131 = class9.method46((byte) 106, "Bitte versuchen Sie es erneut)3");

    @OriginalMember(owner = "client!f", name = "mb", descriptor = "[Z")
    public static boolean[] field1132 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

    @OriginalMember(owner = "client!f", name = "fb", descriptor = "Lea;")
    private static class38 field1125 = class9.method46((byte) 109, "Please reload this page)3");

    @OriginalMember(owner = "client!f", name = "sb", descriptor = "Lea;")
    public static class38 field1138 = class9.method46((byte) 117, " zuerst von Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!f", name = "ob", descriptor = "Lea;")
    public static class38 field1134 = class9.method46((byte) 126, ":trade:");

    @OriginalMember(owner = "client!f", name = "db", descriptor = "Lea;")
    private static class38 field1123 = class9.method46((byte) 103, "Invalid username or password)3");

    @OriginalMember(owner = "client!f", name = "nb", descriptor = "Lea;")
    public static class38 field1133 = field1120;

    @OriginalMember(owner = "client!f", name = "tb", descriptor = "Lea;")
    public static class38 field1139 = class9.method46((byte) 103, "mapdots");

    @OriginalMember(owner = "client!f", name = "pb", descriptor = "Lea;")
    public static class38 field1135 = field1123;

    @OriginalMember(owner = "client!f", name = "kb", descriptor = "Lea;")
    public static class38 field1130 = field1125;

    @OriginalMember(owner = "client!f", name = "bb", descriptor = "I")
    public int field1121;

    @OriginalMember(owner = "client!f", name = "gb", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!f", name = "hb", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!f", name = "ib", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!f", name = "qb", descriptor = "I")
    public int field1136;

    @OriginalMember(owner = "client!f", name = "rb", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "client!f", name = "eb", descriptor = "Lob;")
    public static class127 field1124;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "(Z)Lrg;")
    public final class159 method220(boolean arg0) {
        if (!arg0) {
            method332(null, null);
        }
        field1128++;
        return class117.method908(this.field1136, (byte) 115).method11((byte) -115, this.field1121);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Ldd;Ldd;I)V")
    public static final void method331(class32 arg0, class32 arg1, int arg2) {
        field1137++;
        class96.field2154 = arg1;
        class99.field2194 = arg0;
        class9.field213 = class96.field2154.method213(10000, arg2);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lec;")
    public static final class40 method332(Throwable arg0, String arg1) {
        field1126++;
        class40 var2;
        if (arg0 instanceof class40) {
            var2 = (class40) arg0;
            var2.field885 = var2.field885 + ' ' + arg1;
        } else {
            var2 = new class40(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(B)V")
    public static void method333(byte arg0) {
        field1125 = null;
        field1130 = null;
        field1138 = null;
        field1134 = null;
        field1135 = null;
        field1131 = null;
        field1124 = null;
        field1120 = null;
        field1133 = null;
        if (arg0 != 59) {
            method333((byte) -101);
        }
        field1123 = null;
        field1132 = null;
        field1129 = null;
        field1139 = null;
    }
}
