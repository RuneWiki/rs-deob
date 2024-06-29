import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gw")
public class class181 extends class260 {

    @OriginalMember(owner = "client!gw", name = "h", descriptor = "I")
    public static int field2801 = -1;

    @OriginalMember(owner = "client!gw", name = "n", descriptor = "[I")
    public static int[] field2807 = new int[500];

    @OriginalMember(owner = "client!gw", name = "i", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!gw", name = "j", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!gw", name = "k", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!gw", name = "l", descriptor = "I")
    public static int field2805;

    @OriginalMember(owner = "client!gw", name = "m", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(I)V")
    public final void method126(int arg0) {
        ++field2803;
        if (arg0 < 102) {
            field2801 = -110;
        }
        if (super.field3828 < 0 || super.field3828 > 4) {
            super.field3828 = this.method123(4377);
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(IB)V")
    public final void method128(int arg0, byte arg1) {
        super.field3828 = arg0;
        if (arg1 != 122) {
            this.method1292(1);
        }
        ++field2805;
    }

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "(I)I")
    public final int method123(int arg0) {
        if (arg0 != 4377) {
            field2807 = null;
        }
        ++field2802;
        return 0;
    }

    @OriginalMember(owner = "client!gw", name = "c", descriptor = "(II)I")
    public final int method129(int arg0, int arg1) {
        ++field2806;
        if (arg0 != -1) {
            field2807 = null;
        }
        return 1;
    }

    @OriginalMember(owner = "client!gw", name = "<init>", descriptor = "(ILgn;)V")
    public class181(int arg0, class729 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!gw", name = "d", descriptor = "(I)I")
    public final int method1292(int arg0) {
        if (arg0 > -14) {
            return 95;
        } else {
            ++field2804;
            return super.field3828;
        }
    }

    @OriginalMember(owner = "client!gw", name = "<init>", descriptor = "(Lgn;)V")
    public class181(class729 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(B)V")
    public static void method1293(byte arg0) {
        field2807 = null;
        if (arg0 < 68) {
            method1293((byte) 25);
        }
    }
}
