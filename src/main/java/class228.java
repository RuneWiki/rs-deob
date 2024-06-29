import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class228 {

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "Lok;")
    private static class41 field3631 = class137.method956("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3", 45);

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "Z")
    public static boolean field3630 = false;

    @OriginalMember(owner = "client!mk", name = "h", descriptor = "Lok;")
    public static class41 field3636 = field3631;

    @OriginalMember(owner = "client!mk", name = "j", descriptor = "I")
    public static int field3638 = -1;

    @OriginalMember(owner = "client!mk", name = "m", descriptor = "I")
    public static int field3641 = -2;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!mk", name = "i", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!mk", name = "k", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!mk", name = "l", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)V", line = 7)
    public static void method1630(int arg0) {
        if (arg0 != 0) {
            field3638 = 113;
        }
        field3631 = null;
        field3636 = null;
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)Lqa;", line = 20)
    public static final class79 method1631(int arg0) {
        field3634++;
        if (arg0 <= 104) {
            field3641 = -119;
        }
        class181.field2930 = 0;
        return class60.method424((byte) 21);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)V", line = 33)
    public static final void method1632(byte arg0) {
        field3629++;
        class285.field4642.method844(-4, 136);
        class271.field4394++;
        if (arg0 >= -111) {
            method1635(35, 29, 23);
        }
        class285.field4642.method800(0L, (byte) -113);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Z)V", line = 69)
    public static final void method1633(boolean arg0) {
        field3635++;
        if (!arg0) {
            method1630(-98);
        }
        if (class9.field114 == 2) {
            if (class55.field805 == class196.field3164 && class245.field3910 == class130.field1948) {
                class9.field114 = 0;
                class202.method1436(class98.field1432 - 1, 79);
            }
        } else if (class196.field3164 == class151.field2358 && class245.field3941 == class130.field1948) {
            class9.field114 = 0;
            class202.method1436(class98.field1432 - 1, -91);
        } else {
            class55.field805 = class151.field2358;
            class245.field3910 = class245.field3941;
            class9.field114 = 2;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ZIIII)V", line = 125)
    public static final void method1634(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field3640++;
        class46 var5 = class195.method1396(8, arg4, false);
        var5.method337(0);
        var5.field719 = arg1;
        if (arg0) {
            var5.field716 = arg3;
            var5.field721 = arg2;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(III)V", line = 157)
    public static final void method1635(int arg0, int arg1, int arg2) {
        field3639++;
        if (class32.method223(arg1, 255)) {
            class288.method2011(arg0, -25695, class273.field4446[arg1]);
            if (arg2 != 23) {
                method1631(13);
            }
        }
    }
}
