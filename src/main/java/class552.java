import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class552 {

    @OriginalMember(owner = "client!um", name = "a", descriptor = "I")
    private static int field7457 = 0;

    @OriginalMember(owner = "client!um", name = "c", descriptor = "Z")
    private static boolean field7459 = false;

    @OriginalMember(owner = "client!um", name = "b", descriptor = "Ltm;")
    private static class412 field7458 = new class412();

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(I)V", line = 3)
    public static final synchronized void method3119(int arg0) {
        field7457--;
        if (field7457 == 0) {
            method3123((byte) -43);
        }
        if (arg0 != 0) {
            field7459 = false;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IZ)V", line = 18)
    public static final synchronized void method3120(int arg0, boolean arg1) {
        int var2 = 51 % ((-arg0 - 75) / 51);
        field7459 = arg1;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Le;B)V", line = 27)
    public static final synchronized void method3121(class559 arg0, byte arg1) {
        if (field7459) {
            return;
        }
        if (arg1 != 20) {
            method3122((byte) 109);
        }
        if (field7457 <= 0) {
            arg0.method151(false);
        } else {
            class725 var2 = new class725();
            var2.field10098 = arg0;
            field7458.method2545(-128, var2);
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(B)V", line = 54)
    public static final synchronized void method3122(byte arg0) {
        field7457++;
        if (arg0 != 87) {
            field7458 = null;
        }
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(B)V", line = 65)
    public static final synchronized void method3123(byte arg0) {
        if (arg0 != -43) {
            return;
        }
        while (true) {
            class725 var1 = (class725) field7458.method2543(-15114);
            if (var1 == null) {
                return;
            }
            var1.field10098.method151(true);
            var1.method792((byte) -89);
        }
    }
}
