import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cba")
public abstract class class511 extends class295 {

    @OriginalMember(owner = "client!cba", name = "E", descriptor = "Z")
    public static boolean field7018 = false;

    @OriginalMember(owner = "client!cba", name = "F", descriptor = "I")
    public static int field7019 = 1407;

    @OriginalMember(owner = "client!cba", name = "L", descriptor = "I")
    public static int field7025 = -1;

    @OriginalMember(owner = "client!cba", name = "B", descriptor = "I")
    public static int field7015;

    @OriginalMember(owner = "client!cba", name = "C", descriptor = "I")
    public static int field7016;

    @OriginalMember(owner = "client!cba", name = "D", descriptor = "I")
    public static int field7017;

    @OriginalMember(owner = "client!cba", name = "G", descriptor = "I")
    public static int field7020;

    @OriginalMember(owner = "client!cba", name = "H", descriptor = "I")
    public static int field7021;

    @OriginalMember(owner = "client!cba", name = "I", descriptor = "I")
    public static int field7022;

    @OriginalMember(owner = "client!cba", name = "K", descriptor = "I")
    public static int field7024;

    @OriginalMember(owner = "client!cba", name = "J", descriptor = "Lbda;")
    public static class467 field7023;

    @OriginalMember(owner = "client!cba", name = "i", descriptor = "(I)V")
    public final void method227(int arg0) {
        ++field7024;
        if (arg0 >= -115) {
            field7023 = null;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(ZLsea;IIJIII)V")
    public static final void method2932(boolean arg0, class648 arg1, int arg2, int arg3, long arg4, int arg5, int arg6, int arg7) {
        class439.field6090 = arg0;
        class686.field9799 = 10000;
        class123.field1688 = null;
        ++field7015;
        class450.field6183 = 1;
        class131.field1891 = arg5;
        class542.field7334 = arg2;
        class129.field1848 = arg7;
        int var9 = 74 / ((arg3 - 59) / 56);
        class628.field8700 = arg4;
        class4.field34 = arg1;
        class500.field6814 = arg6;
    }

    @OriginalMember(owner = "client!cba", name = "h", descriptor = "(I)Z")
    public final boolean method1324(int arg0) {
        ++field7022;
        return arg0 >= -104 ? false : class147.field2093[(super.field4042 >> class588.field8259) + -class167.field2435 + class36.field428][(super.field4047 >> class588.field8259) + -class353.field4699 + class36.field428];
    }

    @OriginalMember(owner = "client!cba", name = "f", descriptor = "(B)Z")
    public final boolean method1322(byte arg0) {
        if (arg0 != -54) {
            return true;
        } else {
            ++field7017;
            class467 var2 = class396.method2322(super.field4053, super.field4042 >> class588.field8259, super.field4047 >> class588.field8259);
            return var2 != null && var2.field6419.field2966 ? class372.method2142(super.field4047 >> class588.field8259, super.field4042 >> class588.field8259, var2.field6419.method217(99) - -this.method217(arg0 ^ -107), super.field4053, (byte) 117) : class469.method2648((byte) 80, super.field4047 >> class588.field8259, super.field4053, super.field4042 >> class588.field8259);
        }
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "([Ltw;I)I")
    public final int method1323(class186[] arg0, int arg1) {
        ++field7016;
        if (arg1 <= 69) {
            field7023 = null;
        }
        return this.method1798(super.field4047 >> class588.field8259, arg0, super.field4042 >> class588.field8259, -9609);
    }

    @OriginalMember(owner = "client!cba", name = "g", descriptor = "(I)Z")
    public final boolean method215(int arg0) {
        if (arg0 < 49) {
            return true;
        } else {
            ++field7020;
            return false;
        }
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(Lvv;IIZLr;II)V")
    public final void method223(class295 arg0, int arg1, int arg2, boolean arg3, class166 arg4, int arg5, int arg6) {
        ++field7021;
        if (arg6 == 0) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!cba", name = "<init>", descriptor = "(IIIII)V")
    public class511(int arg0, int arg1, int arg2, int arg3, int arg4) {
        super.field4052 = arg1;
        super.field4042 = arg0;
        super.field4053 = (byte) arg3;
        super.field4047 = arg2;
        super.field4050 = (byte) arg4;
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(I)V")
    public static void method2933(int arg0) {
        field7023 = null;
        if (arg0 != 10000) {
            field7018 = true;
        }
    }
}
