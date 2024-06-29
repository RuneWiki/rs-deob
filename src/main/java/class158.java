import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class158 extends class12 {

    @OriginalMember(owner = "client!we", name = "z", descriptor = "I")
    public int field3651;

    @OriginalMember(owner = "client!we", name = "s", descriptor = "B")
    public static byte field3644 = 0;

    @OriginalMember(owner = "client!we", name = "B", descriptor = "[I")
    public static int[] field3652 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!we", name = "C", descriptor = "Lpe;")
    private static class109 field3653 = class141.method1120("Sorry invited players only)3", 0);

    @OriginalMember(owner = "client!we", name = "H", descriptor = "Lpe;")
    public static class109 field3658 = class141.method1120("nicht hergestellt werden)3", 0);

    @OriginalMember(owner = "client!we", name = "F", descriptor = "Lpe;")
    public static class109 field3656 = class141.method1120("Standort", 0);

    @OriginalMember(owner = "client!we", name = "K", descriptor = "Lpe;")
    public static class109 field3661 = field3653;

    @OriginalMember(owner = "client!we", name = "E", descriptor = "I")
    public static int field3655 = 0;

    @OriginalMember(owner = "client!we", name = "x", descriptor = "I")
    public static int field3649 = 0;

    @OriginalMember(owner = "client!we", name = "t", descriptor = "I")
    public static int field3645;

    @OriginalMember(owner = "client!we", name = "u", descriptor = "I")
    public static int field3646;

    @OriginalMember(owner = "client!we", name = "v", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!we", name = "w", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!we", name = "y", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "client!we", name = "D", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "client!we", name = "G", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!we", name = "I", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!we", name = "J", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Z)V")
    public static void method1229(boolean arg0) {
        field3658 = null;
        if (!arg0) {
            field3656 = null;
        }
        field3653 = null;
        field3652 = null;
        field3656 = null;
        field3661 = null;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lna;Lna;Lna;I)V")
    public static final void method1230(class91 arg0, class91 arg1, class91 arg2, int arg3) {
        class135.field2934 = arg1;
        class119.field2650 = arg0;
        if (arg3 != -1) {
            field3644 = 14;
        }
        class19.field478 = arg2;
        field3654++;
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(B)V")
    public static final void method1231(byte arg0) {
        field3645++;
        if (!class76.field1531) {
            return;
        }
        class78.field1637 = null;
        class55.field1133 = null;
        class14.field352 = null;
        class145.field3183 = null;
        class1.field2 = null;
        class27.field637 = null;
        class13.field287 = null;
        class149.field3300 = null;
        class25.field616 = null;
        class134.field2929 = null;
        class118.field2627 = null;
        class137.field2990 = null;
        class47.field983 = null;
        class45.field945 = null;
        class50.field1046 = null;
        if (arg0 != -93) {
            method1229(false);
        }
        class24.field585 = null;
        class4.field110 = null;
        class124.field2750 = null;
        class101.field2123 = null;
        class94.field2033 = null;
        class79.method634(-1, 2);
        class122.method988((byte) 126, true);
        class76.field1531 = false;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IBILna;)[Le;")
    public static final class29[] method1232(int arg0, byte arg1, int arg2, class91 arg3) {
        field3646++;
        if (class12.method100(arg3, arg0, true, arg2)) {
            int var4 = 69 % ((26 - arg1) / 55);
            return class126.method1018(true);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "()V")
    public class158() {
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(I)V")
    public class158(int arg0) {
        this.field3651 = arg0;
    }
}
