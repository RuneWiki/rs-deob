import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class82 extends class129 {

    @OriginalMember(owner = "client!nd", name = "W", descriptor = "Lv;")
    private static class122 field2132 = class55.method425(-107, " million");

    @OriginalMember(owner = "client!nd", name = "Q", descriptor = "Lv;")
    public static class122 field2126 = class55.method425(-119, "Ihr Spielkonto wird bereits benutzt)3");

    @OriginalMember(owner = "client!nd", name = "Y", descriptor = "Z")
    public static boolean field2134 = false;

    @OriginalMember(owner = "client!nd", name = "bb", descriptor = "Lv;")
    public static class122 field2137 = class55.method425(-54, " steht bereits auf Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!nd", name = "cb", descriptor = "Lv;")
    public static class122 field2138 = field2132;

    @OriginalMember(owner = "client!nd", name = "X", descriptor = "I")
    public static int field2133 = -1;

    @OriginalMember(owner = "client!nd", name = "db", descriptor = "Lv;")
    public static class122 field2139 = class55.method425(-76, "Ihre Nachricht an: ");

    @OriginalMember(owner = "client!nd", name = "eb", descriptor = "Lv;")
    public static class122 field2140 = class55.method425(-98, "null");

    @OriginalMember(owner = "client!nd", name = "fb", descriptor = "Lv;")
    private static class122 field2141 = class55.method425(-73, "No response from server)3");

    @OriginalMember(owner = "client!nd", name = "U", descriptor = "Lv;")
    public static class122 field2130 = field2141;

    @OriginalMember(owner = "client!nd", name = "T", descriptor = "B")
    public byte field2129;

    @OriginalMember(owner = "client!nd", name = "R", descriptor = "I")
    public int field2127;

    @OriginalMember(owner = "client!nd", name = "V", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!nd", name = "Z", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!nd", name = "ab", descriptor = "Lrd;")
    public class106 field2136;

    @OriginalMember(owner = "client!nd", name = "S", descriptor = "Ld;")
    public static class19 field2128;

    @OriginalMember(owner = "client!nd", name = "gb", descriptor = "[I")
    public static int[] field2142;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)Z", line = 4)
    public static final boolean method669(int arg0, int arg1) {
        field2135++;
        if (arg0 >= -27) {
            field2134 = true;
        }
        if (arg1 < 0) {
            return false;
        }
        int var2 = class56.field1483[arg1];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        return var2 == 8;
    }

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "(I)V", line = 32)
    public static void method670(int arg0) {
        field2140 = null;
        field2139 = null;
        field2142 = null;
        field2126 = null;
        field2132 = null;
        int var1 = 30 / ((arg0 - 61) / 42);
        field2128 = null;
        field2130 = null;
        field2137 = null;
        field2141 = null;
        field2138 = null;
    }
}
