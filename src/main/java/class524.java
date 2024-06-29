import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class524 extends class601 {

    @OriginalMember(owner = "client!hr", name = "f", descriptor = "I")
    public static int field7483 = 0;

    @OriginalMember(owner = "client!hr", name = "d", descriptor = "[I")
    public static int[] field7481 = new int[1000];

    @OriginalMember(owner = "client!hr", name = "e", descriptor = "I")
    public static int field7482;

    @OriginalMember(owner = "client!hr", name = "g", descriptor = "I")
    public static int field7484;

    @OriginalMember(owner = "client!hr", name = "h", descriptor = "I")
    public static int field7485;

    @OriginalMember(owner = "client!hr", name = "i", descriptor = "I")
    public static int field7486;

    @OriginalMember(owner = "client!hr", name = "j", descriptor = "I")
    public static int field7487;

    @OriginalMember(owner = "client!hr", name = "k", descriptor = "I")
    public static int field7488;

    @OriginalMember(owner = "client!hr", name = "l", descriptor = "I")
    public static int field7489;

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(B)I", line = 4)
    public final int method39(byte arg0) {
        if (arg0 != -17) {
            return 33;
        } else {
            ++field7485;
            return 0;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)V", line = 15)
    public static void method3075(int arg0) {
        if (arg0 != -30209) {
            field7481 = null;
        }
        field7481 = null;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IJ)V", line = 26)
    public static final void method3076(int arg0, long arg1) {
        ++field7486;
        if (arg0 != 1) {
            method3075(-112);
        }
        if (~arg1 < -1L) {
            if (~(arg1 % 10L) == -1L) {
                class23.method104(108, arg1 + -1L);
                class23.method104(115, 1L);
            } else {
                class23.method104(-43, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(ILgn;)V", line = 48)
    public class524(int arg0, class699 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(I)I", line = 51)
    public final int method3077(int arg0) {
        int var2 = -11 / ((-59 - arg0) / 61);
        ++field7488;
        return super.field8565;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IZ)V", line = 61)
    public final void method40(int arg0, boolean arg1) {
        super.field8565 = arg0;
        ++field7487;
        if (arg1) {
            field7481 = null;
        }
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(II)I", line = 79)
    public final int method34(int arg0, int arg1) {
        if (arg1 != 15706) {
            field7481 = null;
        }
        ++field7484;
        return 1;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(B)V", line = 95)
    public final void method35(byte arg0) {
        if (arg0 < -37) {
            ++field7489;
        }
    }

    @OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(Lgn;)V", line = 107)
    public class524(class699 arg0) {
        super(arg0);
    }
}
