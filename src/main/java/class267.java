import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class267 extends class144 implements class145 {

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "I")
    private int field3661;

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "Liv;")
    public static class82 field3668 = new class82(12, -1);

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
    public static int field3662;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "I")
    public static int field3664;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "I")
    public static int field3667;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "([[IZ)V")
    public static final void method1618(int[][] arg0, boolean arg1) {
        if (!arg1) {
            field3668 = null;
        }
        ++field3662;
        class678.field9722 = arg0;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)J")
    public final long method937(byte arg0) {
        ++field3664;
        if (arg0 > -103) {
            this.field3661 = 71;
        }
        return super.field1792.getAddress();
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "([BIII)V")
    public final void method938(byte[] arg0, int arg1, int arg2, int arg3) {
        this.method936(arg0, arg3);
        if (arg2 == 32290) {
            ++field3665;
            this.field3661 = arg1;
        }
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(B)I")
    public final int method940(byte arg0) {
        ++field3667;
        int var2 = -95 % (-arg0 / 39);
        return 0;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IZ)Z")
    public static final boolean method1619(int arg0, boolean arg1) {
        ++field3666;
        if (arg0 != 6 && arg0 != 23 && arg0 != 45 && arg0 != 12 && arg0 != 25) {
            if (~arg0 != -59 && arg0 != 1009) {
                if (!arg1) {
                    method1619(67, true);
                }
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V")
    public static void method1620(int arg0) {
        field3668 = null;
        if (arg0 <= 51) {
            field3668 = null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)I")
    public final int method939(int arg0) {
        ++field3663;
        return arg0 != 32726 ? -43 : this.field3661;
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(Lkga;I[BI)V")
    public class267(class506 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field3661 = arg1;
    }
}
