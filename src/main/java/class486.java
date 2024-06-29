import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class486 extends class329 {

    @OriginalMember(owner = "client!jp", name = "z", descriptor = "I")
    public static int field6566;

    @OriginalMember(owner = "client!jp", name = "A", descriptor = "I")
    public static int field6567;

    @OriginalMember(owner = "client!jp", name = "C", descriptor = "I")
    public static int field6569;

    @OriginalMember(owner = "client!jp", name = "B", descriptor = "Lxa;")
    public static class424 field6568;

    @OriginalMember(owner = "client!jp", name = "e", descriptor = "(B)V")
    public static void method2707(byte arg0) {
        field6568 = null;
        int var1 = 122 / ((arg0 - 31) / 45);
    }

    @OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(IIIIIF)V")
    public class486(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(BIIIII)Z")
    public static final boolean method2708(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6567;
        if (arg0 > -46) {
            return false;
        } else {
            for (int var6 = arg3; ~var6 >= ~arg4; ++var6) {
                for (int var7 = arg5; ~arg2 <= ~var7; ++var7) {
                    if (class65.field860[var6][var7] == arg1 && ~class38.field418[var6][var7] >= -2) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIII)V")
    public final void method1721(int arg0, int arg1, int arg2, int arg3) {
        ++field6566;
        super.field4820 = arg2;
        super.field4823 = arg0;
        if (arg3 != 1) {
            this.method1720(6, -0.3287821F);
        }
        super.field4830 = arg1;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IF)V")
    public final void method1720(int arg0, float arg1) {
        ++field6569;
        if (arg0 == -22243) {
            super.field4832 = arg1;
        }
    }
}
