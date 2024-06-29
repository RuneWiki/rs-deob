import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class583 extends class204 {

    @OriginalMember(owner = "client!va", name = "i", descriptor = "I")
    public static int field8251;

    @OriginalMember(owner = "client!va", name = "j", descriptor = "I")
    public static int field8252;

    @OriginalMember(owner = "client!va", name = "k", descriptor = "I")
    public static int field8253;

    @OriginalMember(owner = "client!va", name = "l", descriptor = "I")
    public static int field8254;

    @OriginalMember(owner = "client!va", name = "m", descriptor = "I")
    public static int field8255;

    @OriginalMember(owner = "client!va", name = "n", descriptor = "I")
    public static int field8256;

    @OriginalMember(owner = "client!va", name = "o", descriptor = "I")
    public static int field8257;

    @OriginalMember(owner = "client!va", name = "p", descriptor = "I")
    public static int field8258;

    @OriginalMember(owner = "client!va", name = "h", descriptor = "[Z")
    public static boolean[] field8250;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(I)V")
    public static void method3427(int arg0) {
        field8250 = null;
        if (arg0 <= 95) {
            method3427(-90);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V")
    public final void method486(int arg0) {
        if (super.field2853.method3510(-88) != class692.field9661) {
            super.field2852 = 1;
        } else if (super.field2853.method3505(126)) {
            super.field2852 = 0;
        }
        ++field8258;
        if (arg0 == -4591) {
            if (~super.field2852 != -1 && ~super.field2852 != -2) {
                super.field2852 = this.method490((byte) 89);
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "d", descriptor = "(I)Z")
    public final boolean method3428(int arg0) {
        ++field8252;
        int var2 = -34 % ((-13 - arg0) / 44);
        if (super.field2853.method3505(121)) {
            return false;
        } else {
            return super.field2853.method3510(-128) == class692.field9661;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(II)I")
    public final int method487(int arg0, int arg1) {
        ++field8255;
        int var3 = 90 / ((-57 - arg1) / 60);
        if (super.field2853.method3505(125)) {
            return 3;
        } else if (super.field2853.method3510(-95) == class692.field9661) {
            if (~arg0 == -1) {
                if (super.field2853.field8499.method2227((byte) -98) == 1) {
                    return 2;
                }
                if (~super.field2853.field8506.method1732((byte) -98) == -2) {
                    return 2;
                }
                if (super.field2853.field8507.method1714((byte) -98) > 0) {
                    return 2;
                }
            }
            return 1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Lfs;)V")
    public class583(class607 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(ILfs;)V")
    public class583(int arg0, class607 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(B)I")
    public final int method3429(byte arg0) {
        ++field8253;
        if (arg0 != -98) {
            field8250 = null;
        }
        return super.field2852;
    }

    @OriginalMember(owner = "client!va", name = "d", descriptor = "(II)V")
    public final void method488(int arg0, int arg1) {
        if (arg1 > -105) {
            method3427(-36);
        }
        ++field8256;
        super.field2852 = arg0;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Ljava/awt/Canvas;ILd;IB)Lha;")
    public static final class473 method3430(Canvas arg0, int arg1, class101 arg2, int arg3, byte arg4) {
        ++field8254;
        int var5 = -47 / ((74 - arg4) / 40);
        return new class30(arg0, arg2, arg1, arg3);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(B)I")
    public final int method490(byte arg0) {
        if (arg0 <= 83) {
            return -60;
        } else {
            ++field8257;
            return 1;
        }
    }
}
