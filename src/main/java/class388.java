import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class388 {

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "Z")
    private static boolean field5676 = false;

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "I")
    private static int field5678 = 0;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "Lau;")
    private static class692 field5677 = new class692();

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(ZB)V")
    public static final synchronized void method2369(boolean arg0, byte arg1) {
        int var2 = 9 % ((arg1 - 76) / 36);
        field5676 = arg0;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V")
    public static final synchronized void method2370(int arg0) {
        while (true) {
            class579 var1 = (class579) field5677.method3906(0);
            if (var1 == null) {
                int var2 = -16 % ((17 - arg0) / 34);
                return;
            }
            var1.field8499.method411(true);
            var1.method2549((byte) -59);
        }
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)V")
    public static final synchronized void method2371(int arg0) {
        field5678++;
        if (arg0 != 0) {
            method2373(-58);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lp;I)V")
    public static final synchronized void method2372(class52 arg0, int arg1) {
        if (field5676 || arg1 != 0) {
            return;
        }
        if (field5678 <= 0) {
            arg0.method411(false);
        } else {
            class579 var2 = new class579();
            var2.field8499 = arg0;
            field5677.method3904(var2, 0);
        }
    }

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(I)V")
    public static final synchronized void method2373(int arg0) {
        field5678--;
        int var1 = 1 / ((-arg0 - 77) / 37);
        if (field5678 == 0) {
            method2370(123);
        }
    }
}
