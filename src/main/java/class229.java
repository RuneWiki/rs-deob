import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class229 {

    @OriginalMember(owner = "client!bi", name = "p", descriptor = "Ljava/lang/String;")
    public static String field3705 = "flash1:";

    @OriginalMember(owner = "client!bi", name = "o", descriptor = "I")
    public static int field3704 = 0;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3694 = "scroll:";

    @OriginalMember(owner = "client!bi", name = "t", descriptor = "Ljava/lang/String;")
    public static String field3709 = " is already on your ignore list.";

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "I")
    public int field3692;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "I")
    public int field3693;

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "I")
    public int field3695;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "I")
    public int field3698;

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "I")
    public int field3700;

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "I")
    public int field3701;

    @OriginalMember(owner = "client!bi", name = "m", descriptor = "I")
    public int field3702;

    @OriginalMember(owner = "client!bi", name = "n", descriptor = "I")
    public int field3703;

    @OriginalMember(owner = "client!bi", name = "q", descriptor = "I")
    public int field3706;

    @OriginalMember(owner = "client!bi", name = "r", descriptor = "I")
    public int field3707;

    @OriginalMember(owner = "client!bi", name = "u", descriptor = "I")
    public int field3710;

    @OriginalMember(owner = "client!bi", name = "v", descriptor = "I")
    public int field3711;

    @OriginalMember(owner = "client!bi", name = "w", descriptor = "I")
    public int field3712;

    @OriginalMember(owner = "client!bi", name = "x", descriptor = "I")
    public static int field3713;

    @OriginalMember(owner = "client!bi", name = "y", descriptor = "I")
    public int field3714;

    @OriginalMember(owner = "client!bi", name = "z", descriptor = "I")
    public int field3715;

    @OriginalMember(owner = "client!bi", name = "A", descriptor = "I")
    public int field3716;

    @OriginalMember(owner = "client!bi", name = "B", descriptor = "I")
    public static int field3717;

    @OriginalMember(owner = "client!bi", name = "C", descriptor = "I")
    public int field3718;

    @OriginalMember(owner = "client!bi", name = "D", descriptor = "I")
    public int field3719;

    @OriginalMember(owner = "client!bi", name = "s", descriptor = "J")
    public static long field3708;

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "Lvb;")
    public static class140 field3699;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "Ldk;")
    public static class251 field3690;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "Ldk;")
    public static class251 field3691;

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "Ldk;")
    public static class251 field3697;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZB)V")
    public static final void method1548(boolean arg0, byte arg1) {
        field3696++;
        if (class298.field4748 == arg0) {
            return;
        }
        if (arg1 >= -115) {
            field3690 = null;
        }
        class298.field4748 = arg0;
        class153.method1045(true);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V")
    public static void method1549(int arg0) {
        field3699 = null;
        field3697 = null;
        field3690 = null;
        field3694 = null;
        field3709 = null;
        field3691 = null;
        field3705 = null;
        int var1 = 3 / ((-arg0 - 39) / 50);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ldk;Ldk;I)V")
    public static final void method1550(class251 arg0, class251 arg1, int arg2) {
        if (arg2 != 0) {
            field3697 = null;
        }
        class228.field3684 = arg0;
        class167.field2724 = arg1;
        field3717++;
    }
}
