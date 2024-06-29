import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class498 extends class470 {

    @OriginalMember(owner = "client!no", name = "E", descriptor = "Lhn;")
    public static class509 field7154 = new class509(105, 3);

    @OriginalMember(owner = "client!no", name = "L", descriptor = "I")
    public static int field7160 = 503;

    @OriginalMember(owner = "client!no", name = "D", descriptor = "I")
    public static int field7153;

    @OriginalMember(owner = "client!no", name = "F", descriptor = "I")
    public static int field7155;

    @OriginalMember(owner = "client!no", name = "G", descriptor = "I")
    public static int field7156;

    @OriginalMember(owner = "client!no", name = "I", descriptor = "I")
    public static int field7157;

    @OriginalMember(owner = "client!no", name = "J", descriptor = "I")
    public static int field7158;

    @OriginalMember(owner = "client!no", name = "K", descriptor = "I")
    public static int field7159;

    @OriginalMember(owner = "client!no", name = "M", descriptor = "I")
    public static int field7161;

    @OriginalMember(owner = "client!no", name = "i", descriptor = "(I)V", line = 3)
    public static final void method2950(int arg0) {
        class111.field1560 = null;
        ++field7155;
        class310.method1980(0, class76.field1105, class155.field2310, -1, 0, class80.field1163, true, 0, 0);
        if (arg0 == 25477) {
            if (class111.field1560 != null) {
                class497.method2948(-1412584499, 0, class124.field1852, class111.field1560, class76.field1105, (byte) 120, class33.field385, 0, class472.field6819.field1717, class80.field1163);
                class111.field1560 = null;
            }
        }
    }

    @OriginalMember(owner = "client!no", name = "j", descriptor = "(I)V", line = 26)
    public static void method2951(int arg0) {
        if (arg0 < 24) {
            field7154 = null;
        }
        field7154 = null;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IIBIIII)I", line = 36)
    public static final int method2952(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg4 & 1) == 1) {
            int var7 = arg3;
            arg3 = arg0;
            arg0 = var7;
        }
        ++field7156;
        int var8 = arg1 & 3;
        if (~var8 == -1) {
            return arg5;
        } else if (~var8 == -2) {
            return -arg3 + 1 + -arg6 + 7;
        } else {
            if (arg2 >= -46) {
                field7154 = null;
            }
            return ~var8 == -3 ? -arg0 - -1 + -arg5 + 7 : arg6;
        }
    }

    @OriginalMember(owner = "client!no", name = "<init>", descriptor = "(IIIIIF)V", line = 67)
    public class498(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IF)V", line = 70)
    public final void method791(int arg0, float arg1) {
        ++field7157;
        super.field6794 = arg1;
        if (arg0 != 1024) {
            this.method787(27, false, -80, 39);
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(III)I", line = 91)
    public static final int method2953(int arg0, int arg1, int arg2) {
        if (arg2 != 18731) {
            method2951(-35);
        }
        ++field7153;
        return arg1 != 1 && ~arg1 != -4 ? class473.field6828[3 & arg0] : class275.field4195[3 & arg0];
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IZII)V", line = 106)
    public final void method787(int arg0, boolean arg1, int arg2, int arg3) {
        ++field7159;
        if (!arg1) {
            this.method791(-53, 0.7576734F);
        }
        super.field6785 = arg3;
        super.field6783 = arg2;
        super.field6791 = arg0;
    }
}
