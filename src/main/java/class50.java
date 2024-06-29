import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public abstract class class50 extends class674 {

    @OriginalMember(owner = "client!c", name = "B", descriptor = "S")
    public short field734;

    @OriginalMember(owner = "client!c", name = "G", descriptor = "Lju;")
    public static class102 field739 = new class102(31, 7);

    @OriginalMember(owner = "client!c", name = "H", descriptor = "Lqk;")
    public static class148 field740 = new class148(22, 4);

    @OriginalMember(owner = "client!c", name = "y", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!c", name = "z", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!c", name = "A", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!c", name = "C", descriptor = "I")
    public static int field735;

    @OriginalMember(owner = "client!c", name = "D", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!c", name = "E", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!c", name = "F", descriptor = "I")
    public static int field738;

    @OriginalMember(owner = "client!c", name = "i", descriptor = "(I)Z", line = 3)
    public final boolean method339(int arg0) {
        if (arg0 != 32188) {
            method343(false);
        }
        ++field732;
        return class614.method3603(super.field9489 >> class509.field7106, false, super.field9490 >> class509.field7106, super.field9495);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IB)Lei;", line = 14)
    public static final class183 method340(int arg0, byte arg1) {
        ++field735;
        if (arg1 >= -48) {
            method343(true);
        }
        return class93.field1266 && ~class639.field9087 >= ~arg0 && ~arg0 >= ~class610.field8681 ? class658.field9293[-class639.field9087 + arg0] : null;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II)Z", line = 35)
    public static final boolean method341(int arg0, int arg1) {
        ++field737;
        if (arg1 != 25 && arg1 != 30 && arg1 != 3 && arg1 != 13 && ~arg1 != -3) {
            if (arg0 > -76) {
                method341(-107, -89);
            }
            return ~arg1 == -48 || arg1 == 1004;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "(IIIIII)V", line = 55)
    public class50(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field734 = (short) arg5;
        super.field9501 = (byte) arg3;
        super.field9489 = arg2;
        super.field9490 = arg0;
        super.field9495 = (byte) arg4;
        super.field9502 = arg1;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(Z)Z", line = 69)
    public final boolean method342(boolean arg0) {
        if (arg0) {
            this.method344(-63, (class757[]) null);
        }
        ++field731;
        return class359.field4594[(super.field9490 >> class509.field7106) + -class126.field1717 - -class707.field9874][(super.field9489 >> class509.field7106) - class157.field2139 - -class707.field9874];
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(Z)V", line = 80)
    public static void method343(boolean arg0) {
        field739 = null;
        field740 = null;
        if (!arg0) {
            field740 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I[Lkb;)I", line = 91)
    public final int method344(int arg0, class757[] arg1) {
        int var3 = 47 % ((arg0 - 35) / 58);
        ++field736;
        return this.method3864(super.field9489 >> class509.field7106, arg1, super.field9490 >> class509.field7106, 0);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIIIIII)V", line = 102)
    public static final void method345(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field733;
        if (class490.field6592 <= arg1 && ~class116.field1628 <= ~arg1 && arg6 >= class490.field6592 && ~class116.field1628 <= ~arg6 && ~arg5 <= ~class490.field6592 && arg5 <= class116.field1628 && arg3 >= class490.field6592 && ~arg3 >= ~class116.field1628 && arg8 >= class675.field9512 && arg8 <= class395.field5484 && arg2 >= class675.field9512 && ~class395.field5484 <= ~arg2 && ~class675.field9512 >= ~arg9 && ~arg9 >= ~class395.field5484 && ~arg4 <= ~class675.field9512 && ~class395.field5484 <= ~arg4) {
            class720.method4039(arg7, arg3, arg6, arg2, arg1, arg5, arg4, 4, arg9, arg8);
        } else {
            class669.method3831(arg1, arg9, -63, arg3, arg2, arg7, arg8, arg4, arg6, arg5);
        }
        if (arg0 != 22) {
            method341(9, 65);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IBI)Z", line = 122)
    public static final boolean method346(int arg0, byte arg1, int arg2) {
        ++field738;
        if (arg1 <= 118) {
            method340(-85, (byte) 38);
        }
        return (arg2 & 1024) != 0;
    }
}
