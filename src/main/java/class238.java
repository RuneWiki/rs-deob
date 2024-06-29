import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class238 extends class138 {

    @OriginalMember(owner = "client!oj", name = "n", descriptor = "[Lbe;")
    public static class218[] field4134 = new class218[27];

    @OriginalMember(owner = "client!oj", name = "o", descriptor = "I")
    public static int field4135 = -1;

    @OriginalMember(owner = "client!oj", name = "q", descriptor = "I")
    public static int field4137 = 2;

    @OriginalMember(owner = "client!oj", name = "m", descriptor = "I")
    public static int field4133 = 0;

    @OriginalMember(owner = "client!oj", name = "t", descriptor = "I")
    public static int field4140 = 0;

    @OriginalMember(owner = "client!oj", name = "p", descriptor = "Lsc;")
    public static class181 field4136 = class149.method967(255, "(Y");

    @OriginalMember(owner = "client!oj", name = "w", descriptor = "[B")
    public static byte[] field4143 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!oj", name = "x", descriptor = "Lsc;")
    private static class181 field4144 = class149.method967(255, "glow3:");

    @OriginalMember(owner = "client!oj", name = "j", descriptor = "Lsc;")
    public static class181 field4130 = field4144;

    @OriginalMember(owner = "client!oj", name = "u", descriptor = "Lsc;")
    public static class181 field4141 = field4144;

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!oj", name = "k", descriptor = "I")
    public static int field4131;

    @OriginalMember(owner = "client!oj", name = "l", descriptor = "I")
    public static int field4132;

    @OriginalMember(owner = "client!oj", name = "s", descriptor = "I")
    public static int field4139;

    @OriginalMember(owner = "client!oj", name = "v", descriptor = "I")
    public static int field4142;

    @OriginalMember(owner = "client!oj", name = "r", descriptor = "[[B")
    public static byte[][] field4138;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(BI)V")
    public static final void method1626(byte arg0, int arg1) {
        if (arg0 != 108) {
            return;
        }
        class85.field1344 = new int[arg1];
        class69.field1108 = new int[arg1];
        class38.field577 = new int[arg1];
        field4132++;
        class143.field2325 = new int[arg1];
        class60.field907 = new int[arg1];
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(B)V")
    public static void method1627(byte arg0) {
        field4141 = null;
        field4134 = null;
        field4136 = null;
        field4143 = null;
        field4130 = null;
        field4144 = null;
        int var1 = -65 % ((arg0 + 16) / 43);
        field4138 = null;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lvf;B)Lnd;")
    public static final class234 method1628(class230 arg0, byte arg1) {
        field4131++;
        if (arg1 >= -54) {
            field4135 = -128;
        }
        return new class234(arg0.method1515(-106), arg0.method1515(91), arg0.method1515(-113), arg0.method1515(-118), arg0.method1508(true), arg0.method1508(true), arg0.method1516((byte) 82));
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Z)V")
    public static final void method1629(boolean arg0) {
        field4142++;
        int var1 = 0;
        if (!arg0) {
            field4130 = null;
        }
        for (int var2 = 0; var2 < 104; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class210.method1391(var2, class221.field3820, true, var1, 42, var3)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }
}
