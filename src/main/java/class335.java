import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class335 {

    @OriginalMember(owner = "client!so", name = "e", descriptor = "Lqv;")
    public static class316 field4963 = new class316(69, 3);

    @OriginalMember(owner = "client!so", name = "f", descriptor = "Z")
    public static boolean field4964 = false;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "I")
    public static int field4959;

    @OriginalMember(owner = "client!so", name = "c", descriptor = "I")
    public static int field4961;

    @OriginalMember(owner = "client!so", name = "b", descriptor = "Lka;")
    public class336 field4960;

    @OriginalMember(owner = "client!so", name = "d", descriptor = "Lia;")
    public class424 field4962;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IIBIIIII)V", line = 5)
    public static final void method2124(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4959++;
        if (arg3 == arg5) {
            class251.method1627(arg6, arg5, arg0, arg1, (byte) 73, arg4, arg7);
            return;
        }
        if (arg2 != -49) {
            method2125(11);
        }
        if ((arg6 - arg5) >= class465.field6763 && arg6 + arg5 <= class176.field2630 && (arg0 - arg3) >= class424.field5996 && (arg0 + arg3) <= class333.field4936) {
            class294.method1895(arg2 + 11647, arg4, arg3, arg7, arg1, arg0, arg6, arg5);
        } else {
            class403.method2407(arg0, arg7, arg1, arg3, arg6, arg5, -2133273151, arg4);
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(I)V", line = 30)
    public static final void method2125(int arg0) {
        field4961++;
        if (class494.field7139 || arg0 != 11970) {
            return;
        }
        class494.field7139 = true;
        class472.field6873 = true;
        if (class220.field3371.field2554) {
            class508.field7354 = ((int) class508.field7354 + 191 & 0xFFFFFF80);
        } else {
            class253.field3748 += (24.0F - class253.field3748) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!so", name = "b", descriptor = "(I)V", line = 65)
    public static void method2126(int arg0) {
        if (arg0 <= 68) {
            field4964 = false;
        }
        field4963 = null;
    }
}
