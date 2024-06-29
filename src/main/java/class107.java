import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class107 {

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "Ltd;")
    private static class136 field2518 = class145.method1172(" from your friend list first", 45);

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "I")
    public static int field2520 = 0;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "Ltd;")
    public static class136 field2516 = class145.method1172(": ", 45);

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "Lke;")
    public static class74 field2523 = null;

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "Ltd;")
    public static class136 field2525 = field2518;

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "[I")
    public static int[] field2529 = new int[] { 1, 1, 1, 1 };

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "I")
    public static int field2528 = 0;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    public int field2514;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
    public int field2515;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
    public static int field2519;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
    public int field2521;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
    public int field2522;

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "I")
    public int field2526;

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "Lqa;")
    public class112 field2524;

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "Lmd;")
    public static class87 field2527;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Z)V")
    public static void method848(boolean arg0) {
        field2516 = null;
        field2518 = null;
        if (!arg0) {
            method849(-89);
        }
        field2527 = null;
        field2525 = null;
        field2529 = null;
        field2523 = null;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
    public static final void method849(int arg0) {
        class78.field1796.method1165((byte) -73);
        field2513++;
        if (arg0 < 7) {
            field2517 = -10;
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V")
    public static final void method850(int arg0) {
        field2519++;
        if (arg0 != 3983) {
            field2527 = null;
        }
        if (class65.field1399 && class62.field1331 != field2520) {
            class26.method229(class132.field3110, class24.field555.field3560[0], class62.field1331, class54.field1203, class24.field555.field3581[0], arg0 ^ 0xF8E);
        } else if (class62.field1331 != class4.field88) {
            class4.field88 = class62.field1331;
            class19.method143(class62.field1331, -4);
        }
    }
}
