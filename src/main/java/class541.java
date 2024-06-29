import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class541 {

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "I")
    private static int field7562 = 0;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "Z")
    private static boolean field7560 = false;

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "Lhga;")
    private static class158 field7561 = new class158();

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)V")
    public static final synchronized void method3119(byte arg0) {
        int var1 = -99 / ((47 - arg0) / 51);
        field7562++;
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(B)V")
    public static final synchronized void method3120(byte arg0) {
        if (arg0 != 92) {
            field7561 = null;
        }
        field7562--;
        if (field7562 == 0) {
            method3121(0);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
    public static final synchronized void method3121(int arg0) {
        while (true) {
            class100 var1 = (class100) field7561.method1226(0);
            if (var1 == null) {
                if (arg0 != 0) {
                    method3122(false, 98);
                    return;
                }
                return;
            }
            var1.field1771.method420(true);
            var1.method2588(300);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZI)V")
    public static final synchronized void method3122(boolean arg0, int arg1) {
        if (arg1 > -6) {
            field7560 = false;
        }
        field7560 = arg0;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILp;)V")
    public static final synchronized void method3123(int arg0, class201 arg1) {
        if (field7560) {
            return;
        }
        if (arg0 != 14336) {
            method3123(-34, null);
        }
        if (field7562 <= 0) {
            arg1.method420(false);
        } else {
            class100 var2 = new class100();
            var2.field1771 = arg1;
            field7561.method1229(var2, (byte) 120);
        }
    }
}
