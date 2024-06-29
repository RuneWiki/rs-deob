import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class497 {

    @OriginalMember(owner = "client!nt", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field6554 = new String[5];

    @OriginalMember(owner = "client!nt", name = "c", descriptor = "Lbaa;")
    public static class593 field6553 = new class593(0, 2, 2, 1);

    @OriginalMember(owner = "client!nt", name = "e", descriptor = "Lqfa;")
    public static class372 field6555 = new class372("", 10);

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "I")
    public static int field6551;

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "I")
    public static int field6552;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(B)V", line = 3)
    public static void method2673(byte arg0) {
        if (arg0 < 103) {
            method2675(-62, 50, 105, 66, 94, -36, -87, -50);
        }
        field6553 = null;
        field6554 = null;
        field6555 = null;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IB)Z", line = 16)
    public static final boolean method2674(int arg0, byte arg1) {
        field6551++;
        if (arg1 < 17) {
            field6555 = null;
        }
        if (arg0 == 25 || arg0 == 11 || arg0 == 6 || arg0 == 46 || arg0 == 16) {
            return true;
        } else {
            return arg0 == 48 || arg0 == 1004;
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIIIIIII)V", line = 35)
    public static final void method2675(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field6552++;
        if (arg2 == arg7) {
            class478.method2523(arg6, arg7, arg1, arg3, arg5, 110, arg4);
            return;
        }
        if (arg5 - arg7 >= class263.field3294 && class314.field4052 >= (arg5 + arg7) && arg1 - arg2 >= class289.field3595 && arg1 + arg2 <= class159.field2063) {
            class583.method3211(arg5, arg7, arg3, arg2, -96, arg6, arg1, arg4);
        } else {
            class523.method2853(arg1, arg2, 6144, arg7, arg6, arg5, arg3, arg4);
        }
        if (arg0 > -59) {
            method2675(54, -113, 104, -26, 31, 121, 16, -100);
        }
    }
}
