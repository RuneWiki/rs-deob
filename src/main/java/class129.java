import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public abstract class class129 extends class280 {

    @OriginalMember(owner = "client!um", name = "z", descriptor = "S")
    public short field1779;

    @OriginalMember(owner = "client!um", name = "y", descriptor = "S")
    public short field1778;

    @OriginalMember(owner = "client!um", name = "t", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!um", name = "u", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!um", name = "v", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!um", name = "w", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!um", name = "x", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!um", name = "A", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!um", name = "B", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!um", name = "f", descriptor = "(B)Z", line = 6)
    public final boolean method92(byte arg0) {
        if (arg0 < 16) {
            this.field1779 = -62;
        }
        ++field1780;
        return class437.field6237[(super.field3923 >> class639.field9095) + -class613.field8757 + class430.field6190][(super.field3916 >> class639.field9095) + class430.field6190 + -class140.field1915];
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(I[Lwh;)I", line = 17)
    public final int method90(int arg0, class40[] arg1) {
        ++field1774;
        if (arg0 != -1) {
            this.method90(122, (class40[]) null);
        }
        return this.method1794(super.field3923 >> class639.field9095, arg1, -1, super.field3916 >> class639.field9095);
    }

    @OriginalMember(owner = "client!um", name = "f", descriptor = "(I)Z", line = 28)
    public final boolean method88(int arg0) {
        if (arg0 != -1) {
            return true;
        } else {
            ++field1773;
            return class187.method1326(this.method595(32767), super.field3916 >> class639.field9095, (byte) 101, super.field3924, super.field3923 >> class639.field9095);
        }
    }

    @OriginalMember(owner = "client!um", name = "h", descriptor = "(B)V", line = 40)
    public static final void method907(byte arg0) {
        if (arg0 == -49) {
            class718.field10130.method4013(-3);
            ++field1775;
            class121.field1651.method4013(-3);
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ILjw;Lha;BIZI)V", line = 54)
    public final void method711(int arg0, class280 arg1, class543 arg2, byte arg3, int arg4, boolean arg5, int arg6) {
        if (arg3 >= 28) {
            ++field1776;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!um", name = "d", descriptor = "(I)Z", line = 67)
    public final boolean method715(int arg0) {
        ++field1781;
        return arg0 != -12888 ? false : false;
    }

    @OriginalMember(owner = "client!um", name = "e", descriptor = "(I)V", line = 80)
    public final void method713(int arg0) {
        if (arg0 == -16221) {
            ++field1777;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "(IIIIIII)V", line = 90)
    public class129(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super.field3916 = arg2;
        super.field3920 = (byte) arg3;
        super.field3922 = arg1;
        this.field1779 = (short) arg6;
        this.field1778 = (short) arg5;
        super.field3923 = arg0;
        super.field3924 = (byte) arg4;
    }
}
