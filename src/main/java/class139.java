import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class139 {

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "Lok;")
    private static class41 field2134 = class137.method956(" is already on your friend list)3", 45);

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "Lok;")
    public static class41 field2136 = field2134;

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "I")
    public static volatile int field2139 = 0;

    @OriginalMember(owner = "client!wj", name = "l", descriptor = "Lok;")
    private static class41 field2143 = class137.method956("Allocated memory", 45);

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "Lok;")
    public static class41 field2137 = field2143;

    @OriginalMember(owner = "client!wj", name = "k", descriptor = "I")
    public static int field2142 = 0;

    @OriginalMember(owner = "client!wj", name = "n", descriptor = "I")
    public static int field2145 = 128;

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "I")
    public static int field2138;

    @OriginalMember(owner = "client!wj", name = "i", descriptor = "I")
    public static int field2140;

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "Lmh;")
    public static class65 field2133;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "[Ltb;")
    public static class199[] field2132;

    @OriginalMember(owner = "client!wj", name = "j", descriptor = "[Ltb;")
    public static class199[] field2141;

    @OriginalMember(owner = "client!wj", name = "m", descriptor = "[Laf;")
    public static class72[] field2144;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(II)Z", line = 23)
    public static final boolean method975(int arg0, int arg1) {
        field2140++;
        if (arg1 != -883952033) {
            field2142 = 6;
        }
        return (arg0 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(II)V", line = 57)
    public static final void method976(int arg0, int arg1) {
        if (arg0 <= 93) {
            field2145 = 97;
        }
        class46 var2 = class195.method1396(4, arg1, false);
        field2138++;
        var2.method336(true);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)V", line = 94)
    public static void method977(byte arg0) {
        field2134 = null;
        field2136 = null;
        field2141 = null;
        field2133 = null;
        field2143 = null;
        field2137 = null;
        if (arg0 != 18) {
            method976(-12, 43);
        }
        field2132 = null;
        field2144 = null;
    }
}
