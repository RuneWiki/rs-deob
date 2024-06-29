import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class82 {

    @OriginalMember(owner = "client!j", name = "c", descriptor = "Led;")
    private static class43 field1617 = class191.method1219("Click to switch", false);

    @OriginalMember(owner = "client!j", name = "i", descriptor = "Led;")
    private static class43 field1623 = class191.method1219("Please enter your username)3", false);

    @OriginalMember(owner = "client!j", name = "b", descriptor = "Led;")
    public static class43 field1616 = class191.method1219("mapback", false);

    @OriginalMember(owner = "client!j", name = "f", descriptor = "Led;")
    public static class43 field1620 = field1623;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "I")
    public static int field1619 = 5063219;

    @OriginalMember(owner = "client!j", name = "h", descriptor = "Led;")
    public static class43 field1622 = field1617;

    @OriginalMember(owner = "client!j", name = "d", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!j", name = "j", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!j", name = "k", descriptor = "Lob;")
    public static class129 field1625;

    @OriginalMember(owner = "client!j", name = "g", descriptor = "Lhh;")
    public static class73 field1621;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "[[[B")
    public static byte[][][] field1615;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ZLog;)V")
    public static final void method506(boolean arg0, class134 arg1) {
        if (arg1.field2791 != null) {
            arg1.field2791.field3729 = 0;
        }
        arg1.field2790 = arg0;
        for (class134 var2 = arg1.method651(); var2 != null; var2 = arg1.method655()) {
            method506(false, var2);
        }
        field1618++;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ZII)I")
    public static final int method507(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            field1619 = -42;
        }
        int var3 = class5.method31(-120, arg1 - 1, arg2 + -1) + class5.method31(-99, arg1 - 1, arg2 + 1) + class5.method31(-99, arg1 + 1, arg2 + -1) + class5.method31(-116, arg1 + 1, arg2 - -1);
        int var4 = class5.method31(-117, arg1, arg2 - 1) + class5.method31(-114, arg1, arg2 + 1) + class5.method31(-108, arg1 + -1, arg2) + class5.method31(-119, arg1 + 1, arg2);
        field1624++;
        int var5 = class5.method31(-102, arg1, arg2);
        return var3 / 16 + var4 / 8 + var5 / 4;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(B)V")
    public static void method508(byte arg0) {
        field1615 = null;
        field1616 = null;
        field1622 = null;
        if (arg0 != 47) {
            method507(false, -1, 8);
        }
        field1617 = null;
        field1625 = null;
        field1621 = null;
        field1623 = null;
        field1620 = null;
    }
}
