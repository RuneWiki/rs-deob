import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public class class534 extends class601 {

    @OriginalMember(owner = "client!ts", name = "g", descriptor = "Lpfa;")
    public static class295 field7720 = new class295(16);

    @OriginalMember(owner = "client!ts", name = "d", descriptor = "I")
    public static int field7717;

    @OriginalMember(owner = "client!ts", name = "e", descriptor = "I")
    public static int field7718;

    @OriginalMember(owner = "client!ts", name = "f", descriptor = "I")
    public static int field7719;

    @OriginalMember(owner = "client!ts", name = "h", descriptor = "I")
    public static int field7721;

    @OriginalMember(owner = "client!ts", name = "i", descriptor = "I")
    public static int field7722;

    @OriginalMember(owner = "client!ts", name = "j", descriptor = "I")
    public static int field7723;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)I")
    public final int method3133(int arg0) {
        ++field7722;
        int var2 = -57 / ((arg0 - -59) / 61);
        return super.field8565;
    }

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "(I)Z")
    public final boolean method3134(int arg0) {
        ++field7718;
        if (!class32.method156(super.field8563.field9850.method1512(arg0 ^ -9298), -20211)) {
            return false;
        } else {
            if (arg0 != -9242) {
                field7720 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IZ)V")
    public final void method40(int arg0, boolean arg1) {
        ++field7721;
        if (arg1) {
            this.method39((byte) -95);
        }
        super.field8565 = arg0;
    }

    @OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(ILgn;)V")
    public class534(int arg0, class699 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(Lgn;)V")
    public class534(class699 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ts", name = "c", descriptor = "(I)V")
    public static void method3135(int arg0) {
        if (arg0 >= -67) {
            field7720 = null;
        }
        field7720 = null;
    }

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "(II)I")
    public final int method34(int arg0, int arg1) {
        if (arg1 != 15706) {
            return -71;
        } else {
            ++field7719;
            return !class32.method156(super.field8563.field9850.method1512(5), arg1 ^ -29609) ? 3 : 1;
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(B)V")
    public final void method35(byte arg0) {
        ++field7717;
        if (arg0 > -37) {
            this.method40(85, false);
        }
        if (super.field8563.field9850.method1515(0) && !class32.method156(super.field8563.field9850.method1512(-128), -20211)) {
            super.field8565 = 0;
        }
        if (~super.field8565 > -1 || super.field8565 > 2) {
            super.field8565 = this.method39((byte) -17);
        }
    }

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "(B)I")
    public final int method39(byte arg0) {
        if (arg0 != -17) {
            return -59;
        } else {
            ++field7723;
            return 0;
        }
    }
}
