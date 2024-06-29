import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class201 {

    @OriginalMember(owner = "client!op", name = "c", descriptor = "I")
    private static int field3126 = 0;

    @OriginalMember(owner = "client!op", name = "b", descriptor = "Z")
    private static boolean field3127 = false;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "Lef;")
    private static class513 field3128 = new class513();

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(ZB)V")
    public static final synchronized void method1797(boolean arg0, byte arg1) {
        int var2 = -24 / ((arg1 - 60) / 61);
        field3127 = arg0;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(B)V")
    public static final synchronized void method1798(byte arg0) {
        field3126++;
        if (arg0 <= 17) {
            method1797(false, (byte) -52);
        }
    }

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(B)V")
    public static final synchronized void method1799(byte arg0) {
        field3126--;
        if (arg0 != 90) {
            method1798((byte) 73);
        }
        if (field3126 == 0) {
            method1800(true);
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(Z)V")
    public static final synchronized void method1800(boolean arg0) {
        if (!arg0) {
            field3128 = null;
        }
        while (true) {
            class621 var1 = (class621) field3128.method3875(87);
            if (var1 == null) {
                return;
            }
            var1.field9111.method130(true);
            var1.method1824(1);
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(BLe;)V")
    public static final synchronized void method1801(byte arg0, class558 arg1) {
        if (arg0 >= -3) {
            method1798((byte) 125);
        }
        if (field3127) {
            return;
        }
        if (field3126 > 0) {
            class621 var2 = new class621();
            var2.field9111 = arg1;
            field3128.method3868(-109, var2);
        } else {
            arg1.method130(false);
        }
    }
}
