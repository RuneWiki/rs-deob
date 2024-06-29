import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class222 {

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "I")
    private static int field3598 = 0;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "Z")
    private static boolean field3599 = false;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "Lor;")
    private static class594 field3597 = new class594();

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IZ)V", line = 4)
    public static final synchronized void method1637(int arg0, boolean arg1) {
        field3599 = arg1;
        if (arg0 != 0) {
            field3599 = true;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ILp;)V", line = 15)
    public static final synchronized void method1638(int arg0, class201 arg1) {
        if (field3599) {
            return;
        }
        if (~field3598 >= arg0) {
            arg1.method312(false);
        } else {
            class113 var2 = new class113();
            var2.field1784 = arg1;
            field3597.method3463((byte) -87, var2);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V", line = 39)
    public static final synchronized void method1639(int arg0) {
        while (true) {
            class113 var1 = (class113) field3597.method3471(arg0);
            if (var1 == null) {
                if (arg0 != 0) {
                    method1641(-66);
                    return;
                }
                return;
            }
            var1.field1784.method312(true);
            var1.method707((byte) -46);
        }
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)V", line = 62)
    public static final synchronized void method1640(int arg0) {
        field3598--;
        if (arg0 != 17481) {
            field3598 = -31;
        }
        if (field3598 == 0) {
            method1639(0);
        }
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "(I)V", line = 81)
    public static final synchronized void method1641(int arg0) {
        if (arg0 != -1) {
            method1638(52, null);
        }
        field3598++;
    }
}
