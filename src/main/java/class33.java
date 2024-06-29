import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class33 {

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    public static int field622 = -1;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "Lsc;")
    public static class128 field621 = class129.method1017(false, "Lade Titelbild )2 ");

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "Lsc;")
    public static class128 field635 = class129.method1017(false, "Ihr Spielkonto wird bereits benutzt)3");

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "[I")
    public static int[] field633 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "Lsc;")
    private static class128 field623 = class129.method1017(false, "Please use a different world)3");

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
    public static int field628 = -1;

    @OriginalMember(owner = "client!ed", name = "q", descriptor = "Lsc;")
    public static class128 field636 = field623;

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "Lsc;")
    public static class128 field630 = field623;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "Lsc;")
    private static class128 field627 = class129.method1017(false, "Drop");

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "Lsc;")
    public static class128 field632 = class129.method1017(false, "::rect_debug");

    @OriginalMember(owner = "client!ed", name = "r", descriptor = "Lsc;")
    private static class128 field637 = class129.method1017(false, " has logged in)3");

    @OriginalMember(owner = "client!ed", name = "o", descriptor = "Lsc;")
    public static class128 field634 = field627;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "Lsc;")
    public static class128 field625 = field637;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "[Lhe;")
    public static class54[] field620;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILhe;)Lsc;")
    public static final class128 method245(int arg0, class54 arg1) {
        field624++;
        if (class7.method34(class77.method561(67, arg1), arg0 + 21637) == arg0) {
            return null;
        } else if (arg1.field1139 == null || arg1.field1139.method975(~arg0).method1014(-9) == 0) {
            return class5.field43 ? client.field437 : null;
        } else {
            return arg1.field1139;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
    public static void method246(int arg0) {
        field630 = null;
        field634 = null;
        field636 = null;
        field620 = null;
        field627 = null;
        field623 = null;
        field625 = null;
        field635 = null;
        field632 = null;
        field633 = null;
        field637 = null;
        if (arg0 != 9602) {
            method245(122, null);
        }
        field621 = null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)V")
    public static final void method247(int arg0, int arg1) {
        field629++;
        if (class65.method488((byte) 120, arg0)) {
            class154.method1219(arg1 ^ 0xF94, class123.field2791[arg0], arg1);
        }
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)V")
    public static final void method248(int arg0) {
        class46.field858 = new class127(arg0);
        field631++;
    }
}
