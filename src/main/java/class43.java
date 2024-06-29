import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class43 {

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "Lhj;")
    public static class69 field614 = class181.method1318(")1 ", (byte) -125);

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "Lhj;")
    private static class69 field617 = class181.method1318("scroll:", (byte) -109);

    @OriginalMember(owner = "client!kh", name = "j", descriptor = "Lhj;")
    private static class69 field622 = class181.method1318("You can(Wt add yourself to your own ignore list)3", (byte) -111);

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "Lhj;")
    public static class69 field615 = field617;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "I")
    public static int field613 = 0;

    @OriginalMember(owner = "client!kh", name = "k", descriptor = "Lhj;")
    public static class69 field623 = field617;

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "Lhj;")
    public static class69 field619 = class181.method1318(":clan:", (byte) -118);

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "Lhj;")
    public static class69 field620 = field622;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "I")
    public static int field616 = 0;

    @OriginalMember(owner = "client!kh", name = "l", descriptor = "Lhj;")
    public static class69 field624 = class181.method1318(": ", (byte) -113);

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "[I")
    public static int[] field621 = new int[] { 1, 1, 1, 1 };

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "I")
    public static int field618;

    @OriginalMember(owner = "client!kh", name = "m", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)V")
    public static void method244(byte arg0) {
        field617 = null;
        field615 = null;
        field614 = null;
        field622 = null;
        field621 = null;
        field620 = null;
        if (arg0 >= 115) {
            field623 = null;
            field619 = null;
            field624 = null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)I")
    public static final int method245(int arg0) {
        field625++;
        if (arg0 > -53) {
            method244((byte) -21);
        }
        return ((class250.field4537 ? 1 : 0) << 16) + ((class91.field1712 ? 1 : 0) << 13) + ((class233.field4261 ? 1 : 0) << 10) + (((class119.field2249 ? 1 : 0) << 7) + ((class57.field1030 ? 1 : 0) << 6) + ((class64.field1246 ? 1 : 0) << 5) + (class10.field88 & 0x7) - (-((class151.field2790 ? 1 : 0) << 3) + -((class45.field649 ? 1 : 0) << 4) + (-((class222.field4033 ? 1 : 0) << 8) - ((class9.field63 ? 1 : 0) << 9))) - (-((class191.field3461 & 0x3) << 11) - ((class133.field2476 ? 1 : 0) << 15) + (-((class44.field627 & 0x3) << 17) - ((class95.field1784 ? 1 : 0) << 19) - ((class91.field1726 == 0 ? 0 : 1) << 20) + -((class81.field1554 == 0 ? 0 : 1) << 21) - ((class11.field105 == 0 ? 0 : 1) << 22))));
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIII)V")
    public static final void method246(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class216.field3907 == 1) {
            class24.field356[class161.field2995 / 100].method341(class222.field4059 - 8, class9.field65 + -8);
        }
        if (class216.field3907 == 2) {
            class24.field356[class161.field2995 / 100 + 4].method341(class222.field4059 - 8, class9.field65 - 8);
        }
        if (arg1 >= 31) {
            field618++;
            class272.method1862(-3137);
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Z)V")
    public static final void method247(boolean arg0) {
        if (arg0) {
            class271.field4793 = class263.field4673;
            class158.field2935 = class70.field1381;
        } else {
            class271.field4793 = class31.field429;
            class158.field2935 = class221.field3970;
        }
        class66.field1275 = class158.field2935.length;
    }
}
