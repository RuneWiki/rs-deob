import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class506 {

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "[C")
    public static char[] field7285 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "Ldq;")
    public static class493 field7286 = new class493(100, -2);

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "I")
    public static int field7287 = 0;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "I")
    public static int field7283;

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "I")
    public static int field7284;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIIIII)V", line = 4)
    public static final void method3037(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field7283++;
        if (arg4 != 107) {
            return;
        }
        if (arg3 >= class147.field1870 && arg2 <= class237.field3019 && class533.field7845 <= arg1 && arg5 <= class289.field3694) {
            class29.method219(arg0, (byte) -111, arg1, arg5, arg2, arg3);
        } else {
            class247.method1504(arg3, arg2, arg1, arg0, (byte) 108, arg5);
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)V", line = 27)
    public static final void method3038(int arg0) {
        field7284++;
        class449 var1 = class161.field2047;
        synchronized (class161.field2047) {
            class161.field2047.method2640(118);
            if (arg0 != -2) {
                field7286 = null;
            }
        }
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(I)V", line = 45)
    public static void method3039(int arg0) {
        field7286 = null;
        if (arg0 == 109) {
            field7285 = null;
        }
    }
}
