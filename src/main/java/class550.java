import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eba")
public class class550 {

    @OriginalMember(owner = "client!eba", name = "c", descriptor = "I")
    private static int field7329 = 0;

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "Z")
    private static boolean field7327 = false;

    @OriginalMember(owner = "client!eba", name = "b", descriptor = "Lgj;")
    private static class593 field7328 = new class593();

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(I)V", line = 3)
    public static final synchronized void method3052(int arg0) {
        field7329--;
        if (~field7329 == arg0) {
            method3054(arg0 ^ 0x64);
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(ZI)V", line = 18)
    public static final synchronized void method3053(boolean arg0, int arg1) {
        if (arg1 == 245) {
            field7327 = arg0;
        }
    }

    @OriginalMember(owner = "client!eba", name = "b", descriptor = "(I)V", line = 30)
    public static final synchronized void method3054(int arg0) {
        if (arg0 >= -85) {
            field7329 = -59;
        }
        while (true) {
            class535 var1 = (class535) field7328.method3262(-123);
            if (var1 == null) {
                return;
            }
            var1.field7092.method132(true);
            var1.method2797(-112);
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(BLg;)V", line = 53)
    public static final synchronized void method3055(byte arg0, class144 arg1) {
        if (field7327 || arg0 != -20) {
            return;
        }
        if (field7329 > 0) {
            class535 var2 = new class535();
            var2.field7092 = arg1;
            field7328.method3265(var2, (byte) -83);
        } else {
            arg1.method132(false);
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(B)V", line = 84)
    public static final synchronized void method3056(byte arg0) {
        field7329++;
        if (arg0 >= -33) {
            field7327 = true;
        }
    }
}
