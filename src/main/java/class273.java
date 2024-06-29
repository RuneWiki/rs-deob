import jaclib.memory.Buffer;
import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class class273 extends class144 implements class458 {

    @OriginalMember(owner = "client!mu", name = "k", descriptor = "I")
    private int field3725;

    @OriginalMember(owner = "client!mu", name = "n", descriptor = "I")
    public static int field3728 = -1;

    @OriginalMember(owner = "client!mu", name = "h", descriptor = "Lwo;")
    public static class690 field3722 = new class690(69, 12);

    @OriginalMember(owner = "client!mu", name = "c", descriptor = "I")
    public static int field3717;

    @OriginalMember(owner = "client!mu", name = "d", descriptor = "I")
    public static int field3718;

    @OriginalMember(owner = "client!mu", name = "e", descriptor = "I")
    public static int field3719;

    @OriginalMember(owner = "client!mu", name = "f", descriptor = "I")
    public static int field3720;

    @OriginalMember(owner = "client!mu", name = "g", descriptor = "I")
    public static int field3721;

    @OriginalMember(owner = "client!mu", name = "i", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!mu", name = "j", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!mu", name = "l", descriptor = "I")
    public static int field3726;

    @OriginalMember(owner = "client!mu", name = "m", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!mu", name = "c", descriptor = "(I)V", line = 3)
    public static void method1634(int arg0) {
        field3722 = null;
        int var1 = 116 % ((4 - arg0) / 40);
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(B)J", line = 14)
    public final long method667(byte arg0) {
        ++field3719;
        return arg0 != -102 ? 54L : super.field1792.getAddress();
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(III)Z", line = 27)
    public static final boolean method1635(int arg0, int arg1, int arg2) {
        if (arg2 != -27037) {
            return false;
        } else {
            ++field3720;
            return ~(arg1 & 2048) != -1;
        }
    }

    @OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(Lkga;ILjaclib/memory/Buffer;)V", line = 38)
    public class273(class506 arg0, int arg1, Buffer arg2) {
        super(arg0, arg2);
        this.field3725 = arg1;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(I)I", line = 47)
    public final int method670(int arg0) {
        if (arg0 != 30863) {
            this.method670(111);
        }
        ++field3724;
        return this.field3725;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(I[BII)V", line = 60)
    public final void method672(int arg0, byte[] arg1, int arg2, int arg3) {
        this.method936(arg1, arg2);
        ++field3727;
        if (arg0 != 25735) {
            method1638((byte) -116, (class668) null, 26);
        }
        this.field3725 = arg3;
    }

    @OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(Lkga;I[BI)V", line = 74)
    public class273(class506 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field3725 = arg1;
    }

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "(B)V", line = 84)
    public static final void method1636(byte arg0) {
        if (arg0 != 48) {
            field3722 = null;
        }
        class376.field5043.method1684(true);
        ++field3726;
        class478.field6713.method1339(1);
        class683.field9762.method1662(arg0 + -51);
        class646.field9190.setBackground(Color.black);
        field3728 = -1;
        class376.field5043 = class256.method1560(class646.field9190, false);
        class478.field6713 = class510.method3018(class646.field9190, 0, true);
    }

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "(III)Z", line = 102)
    public static final boolean method1637(int arg0, int arg1, int arg2) {
        if (arg0 > -89) {
            field3728 = 53;
        }
        ++field3723;
        return (class588.method3412(arg1, (byte) -57, arg2) | class213.method1281(-1, arg2, arg1) | class613.method3518(arg1, arg2, 1)) & class226.method1378(-905560472, arg1, arg2);
    }

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "(I)I", line = 113)
    public final int method664(int arg0) {
        ++field3718;
        if (arg0 != 25779) {
            field3728 = -45;
        }
        return 0;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(BLjn;I)Lf;", line = 125)
    public static final class701 method1638(byte arg0, class668 arg1, int arg2) {
        ++field3717;
        class701 var3 = (class701) class42.field760.method2766(-124, (long) arg2);
        if (var3 == null) {
            if (!class652.field9240) {
                var3 = class700.method3921(arg1.method3811(121, arg2), (byte) 80);
            } else {
                var3 = class68.field1045.method216(class495.method2885(arg1, arg2), true);
            }
            class42.field760.method2772(var3, true, (long) arg2);
        }
        return arg0 >= -97 ? null : var3;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(ZI)I", line = 152)
    public static final int method1639(boolean arg0, int arg1) {
        ++field3721;
        if (class171.field2093 == null) {
            return 0;
        } else if (!arg0 && class681.field9746 != null) {
            return class171.field2093.length * 2;
        } else {
            if (arg1 != 14012) {
                method1637(-79, -62, 77);
            }
            int var2 = 0;
            for (int var3 = 0; ~class171.field2093.length < ~var3; ++var3) {
                int var4 = class171.field2093[var3];
                if (class62.field1012.method3802(var4, (byte) 107)) {
                    ++var2;
                }
                if (class660.field9374.method3802(var4, (byte) -1)) {
                    ++var2;
                }
            }
            return var2;
        }
    }
}
