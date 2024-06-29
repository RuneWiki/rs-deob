import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class684 {

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "Z")
    private static boolean field9672 = false;

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "I")
    private static int field9671 = 0;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "Lbq;")
    private static class289 field9670 = new class289();

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Le;Z)V", line = 3)
    public static final synchronized void method3871(class531 arg0, boolean arg1) {
        if (!arg1 || field9672) {
            return;
        }
        if (field9671 > 0) {
            class214 var2 = new class214();
            var2.field2497 = arg0;
            field9670.method1721((byte) 115, var2);
        } else {
            arg0.method83(false);
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Z)V", line = 28)
    public static final synchronized void method3872(boolean arg0) {
        if (arg0) {
            field9672 = false;
        }
        field9671++;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V", line = 38)
    public static final synchronized void method3873(int arg0) {
        field9671--;
        if (~field9671 == arg0) {
            method3875((byte) -124);
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(BZ)V", line = 51)
    public static final synchronized void method3874(byte arg0, boolean arg1) {
        field9672 = arg1;
        if (arg0 != 8) {
            field9671 = -126;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(B)V", line = 64)
    public static final synchronized void method3875(byte arg0) {
        if (arg0 >= -120) {
            return;
        }
        while (true) {
            class214 var1 = (class214) field9670.method1729(662);
            if (var1 == null) {
                return;
            }
            var1.field2497.method83(true);
            var1.method864(12983);
        }
    }
}
