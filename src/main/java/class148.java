import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class148 extends class47 {

    @OriginalMember(owner = "client!w", name = "F", descriptor = "I")
    public int field3662 = -1;

    @OriginalMember(owner = "client!w", name = "u", descriptor = "I")
    public int field3651 = 0;

    @OriginalMember(owner = "client!w", name = "v", descriptor = "Loc;")
    public static class99 field3652 = class48.method402((byte) -104, "Handel)4Duell");

    @OriginalMember(owner = "client!w", name = "B", descriptor = "Loc;")
    public static class99 field3658 = class48.method402((byte) -104, "backleft2");

    @OriginalMember(owner = "client!w", name = "H", descriptor = "Loc;")
    private static class99 field3664 = class48.method402((byte) -104, "Offline");

    @OriginalMember(owner = "client!w", name = "z", descriptor = "I")
    public static int field3656 = 0;

    @OriginalMember(owner = "client!w", name = "E", descriptor = "Z")
    public static boolean field3661 = false;

    @OriginalMember(owner = "client!w", name = "I", descriptor = "Loc;")
    public static class99 field3665 = class48.method402((byte) -104, "@yel@*V");

    @OriginalMember(owner = "client!w", name = "J", descriptor = "Loc;")
    public static class99 field3666 = class48.method402((byte) -104, "Neuer Benutzer");

    @OriginalMember(owner = "client!w", name = "N", descriptor = "I")
    public static int field3670 = 0;

    @OriginalMember(owner = "client!w", name = "G", descriptor = "Loc;")
    private static class99 field3663 = class48.method402((byte) -104, "Members only world");

    @OriginalMember(owner = "client!w", name = "O", descriptor = "Loc;")
    public static class99 field3671 = class48.method402((byte) -104, "Spiel)2Fenster geladen)3");

    @OriginalMember(owner = "client!w", name = "A", descriptor = "Loc;")
    public static class99 field3657 = field3663;

    @OriginalMember(owner = "client!w", name = "W", descriptor = "Loc;")
    public static class99 field3679 = class48.method402((byte) -104, "Zu viele Verbindungen von Ihrer Adresse)3");

    @OriginalMember(owner = "client!w", name = "Y", descriptor = "Z")
    public static boolean field3681 = false;

    @OriginalMember(owner = "client!w", name = "ab", descriptor = "Loc;")
    public static class99 field3683 = field3664;

    @OriginalMember(owner = "client!w", name = "x", descriptor = "I")
    public int field3654;

    @OriginalMember(owner = "client!w", name = "y", descriptor = "I")
    public int field3655;

    @OriginalMember(owner = "client!w", name = "D", descriptor = "I")
    public int field3660;

    @OriginalMember(owner = "client!w", name = "K", descriptor = "I")
    public static int field3667;

    @OriginalMember(owner = "client!w", name = "L", descriptor = "I")
    public int field3668;

    @OriginalMember(owner = "client!w", name = "M", descriptor = "I")
    public int field3669;

    @OriginalMember(owner = "client!w", name = "P", descriptor = "I")
    public int field3672;

    @OriginalMember(owner = "client!w", name = "Q", descriptor = "I")
    public int field3673;

    @OriginalMember(owner = "client!w", name = "R", descriptor = "I")
    public static int field3674;

    @OriginalMember(owner = "client!w", name = "S", descriptor = "I")
    public static int field3675;

    @OriginalMember(owner = "client!w", name = "T", descriptor = "I")
    public int field3676;

    @OriginalMember(owner = "client!w", name = "U", descriptor = "I")
    public int field3677;

    @OriginalMember(owner = "client!w", name = "X", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "client!w", name = "Z", descriptor = "I")
    public int field3682;

    @OriginalMember(owner = "client!w", name = "C", descriptor = "Lpc;")
    public static class105 field3659;

    @OriginalMember(owner = "client!w", name = "V", descriptor = "Lpc;")
    public static class105 field3678;

    @OriginalMember(owner = "client!w", name = "w", descriptor = "Lef;")
    public static class35 field3653;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(B)V")
    public static final void method1200(byte arg0) {
        field3680++;
        if (arg0 < 118) {
            field3656 = 40;
        }
        if (class37.field936 > 0) {
            class74.method672((byte) -121);
        } else {
            class73.method663(40, (byte) 52);
            class35.field886 = class104.field2536;
            class104.field2536 = null;
        }
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(I)V")
    public static void method1201(int arg0) {
        field3683 = null;
        field3658 = null;
        field3657 = null;
        field3652 = null;
        field3664 = null;
        field3663 = null;
        if (arg0 != 0) {
            field3681 = true;
        }
        field3666 = null;
        field3678 = null;
        field3659 = null;
        field3679 = null;
        field3653 = null;
        field3665 = null;
        field3671 = null;
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(Z)V")
    public static final void method1202(boolean arg0) {
        if (!arg0) {
            field3678 = null;
        }
        for (class110 var1 = (class110) class108.field2638.method722(110); var1 != null; var1 = (class110) class108.field2638.method716(arg0)) {
            if (var1.field2739 != null) {
                var1.method944(1);
            }
        }
        field3674++;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(II)Lf;")
    public static final class39 method1203(int arg0, int arg1) {
        field3675++;
        class39 var2 = (class39) class27.field677.method997(-1, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        if (arg0 != 3410) {
            field3652 = null;
        }
        class39 var3 = class79.method689(false, class66.field1707, (byte) -114, arg1, class11.field257);
        if (var3 != null) {
            class27.field677.method993((byte) 100, (long) arg1, var3);
        }
        return var3;
    }
}
