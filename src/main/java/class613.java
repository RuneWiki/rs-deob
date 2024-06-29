import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaa")
public class class613 extends class601 {

    @OriginalMember(owner = "client!jaa", name = "d", descriptor = "I")
    public static int field8770;

    @OriginalMember(owner = "client!jaa", name = "e", descriptor = "I")
    public static int field8771;

    @OriginalMember(owner = "client!jaa", name = "f", descriptor = "I")
    public static int field8772;

    @OriginalMember(owner = "client!jaa", name = "g", descriptor = "I")
    public static int field8773;

    @OriginalMember(owner = "client!jaa", name = "h", descriptor = "I")
    public static int field8774;

    @OriginalMember(owner = "client!jaa", name = "i", descriptor = "I")
    public static int field8775;

    @OriginalMember(owner = "client!jaa", name = "j", descriptor = "I")
    public static int field8776;

    @OriginalMember(owner = "client!jaa", name = "k", descriptor = "I")
    public static int field8777;

    @OriginalMember(owner = "client!jaa", name = "l", descriptor = "I")
    public static int field8778;

    @OriginalMember(owner = "client!jaa", name = "<init>", descriptor = "(Lgn;)V", line = 3)
    public class613(class699 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "(B)I", line = 6)
    public final int method39(byte arg0) {
        if (arg0 != -17) {
            field8770 = 112;
        }
        ++field8776;
        if (!super.field8563.method3930(19)) {
            return super.field8563.field9850.method1515(0) && class256.method1527(arg0 ^ -27848954, super.field8563.field9850.method1512(6)) ? 1 : 0;
        } else {
            return 2;
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(I)Z", line = 28)
    public final boolean method3464(int arg0) {
        ++field8777;
        if (arg0 != -9242) {
            field8770 = -52;
        }
        return !super.field8563.method3930(19);
    }

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "(I)I", line = 44)
    public final int method3465(int arg0) {
        int var2 = -97 / ((-59 - arg0) / 61);
        ++field8771;
        return super.field8565;
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(BIII)V", line = 58)
    public static final void method3466(byte arg0, int arg1, int arg2, int arg3) {
        ++field8775;
        class47 var4 = class258.method1546(11, arg1, (byte) 121);
        var4.method271((byte) 125);
        int var5 = 35 % ((-45 - arg0) / 42);
        var4.field507 = arg3;
        var4.field514 = arg2;
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Lrr;III)V", line = 73)
    public static final void method3467(class361 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class284.field3473) {
            class691 var4 = class638.field9170[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field9736 != null && var4.field9736.method991(117)) {
                arg0.method987(true, class563.field8026, var4.field9736, 0, class559.field7987, 0, 0);
            }
        }
        if (arg3 < class284.field3473) {
            class691 var5 = class638.field9170[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field9736 != null && var5.field9736.method991(117)) {
                arg0.method987(true, class563.field8026, var5.field9736, 0, 0, class559.field7987, 0);
            }
        }
        if (arg2 < class284.field3473 && arg3 < class151.field1664) {
            class691 var6 = class638.field9170[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field9736 != null && var6.field9736.method991(119)) {
                arg0.method987(true, class563.field8026, var6.field9736, 0, class559.field7987, class559.field7987, 0);
            }
        }
        if (arg2 < class284.field3473 && arg3 > 0) {
            class691 var7 = class638.field9170[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field9736 != null && var7.field9736.method991(127)) {
                arg0.method987(true, class563.field8026, var7.field9736, 0, class559.field7987, -class559.field7987, 0);
            }
        }
    }

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "(II)I", line = 119)
    public final int method34(int arg0, int arg1) {
        if (arg1 != 15706) {
            this.method39((byte) 51);
        }
        ++field8774;
        return super.field8563.method3930(19) ? 3 : 1;
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(III)Z", line = 134)
    public static final boolean method3468(int arg0, int arg1, int arg2) {
        ++field8773;
        if (arg1 <= 95) {
            field8770 = -24;
        }
        return class193.method1173((byte) -22, arg0, arg2) || class590.method3376(arg2, (byte) -96, arg0);
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(B)V", line = 147)
    public final void method35(byte arg0) {
        if (super.field8563.method3930(19)) {
            super.field8565 = 2;
        }
        ++field8772;
        if (super.field8565 < 0 || super.field8565 > 2) {
            super.field8565 = this.method39((byte) -17);
        }
        if (arg0 >= -37) {
            this.method39((byte) -105);
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IZ)V", line = 167)
    public final void method40(int arg0, boolean arg1) {
        ++field8778;
        if (arg1) {
            method3467((class361) null, 28, 11, -106);
        }
        super.field8565 = arg0;
    }

    @OriginalMember(owner = "client!jaa", name = "<init>", descriptor = "(ILgn;)V", line = 178)
    public class613(int arg0, class699 arg1) {
        super(arg0, arg1);
    }
}
