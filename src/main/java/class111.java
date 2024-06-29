import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class111 {

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "Luf;")
    public static class168 field1732 = class148.method1019(-1720, ")2");

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "I")
    public static int field1736 = -1;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "Luf;")
    private static class168 field1734 = class148.method1019(-1720, "Checking for updates )2 ");

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "Luf;")
    public static class168 field1733 = field1734;

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "[J")
    public static long[] field1741 = new long[32];

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "Z")
    public static boolean field1740 = false;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Loe;I)V", line = 5)
    public static final void method822(class54 arg0, int arg1) {
        field1738++;
        if (arg1 != -9) {
            return;
        }
        class113 var2 = (class113) class244.field4152.method493(arg0.field658.method1208((byte) 71), 126);
        if (var2 == null) {
            class297.method2036((class161) null, class79.field1127, 0, arg0.field3020[0], (class22) null, arg0, arg0.field3033[0], true);
        } else {
            var2.method829(arg1 ^ 0xFFFF8EC7);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZI)V", line = 29)
    public static final void method823(boolean arg0, int arg1) {
        field1735++;
        for (class113 var2 = (class113) class215.field3499.method442(65293); var2 != null; var2 = (class113) class215.field3499.method440(3)) {
            if (var2.field1770 != null) {
                client.field4933.method1533(var2.field1770);
                var2.field1770 = null;
            }
            if (var2.field1767 != null) {
                client.field4933.method1533(var2.field1767);
                var2.field1767 = null;
            }
            var2.method124((byte) 42);
        }
        if (arg0) {
            for (class113 var3 = (class113) class14.field146.method442(65293); var3 != null; var3 = (class113) class14.field146.method440(3)) {
                if (var3.field1770 != null) {
                    client.field4933.method1533(var3.field1770);
                    var3.field1770 = null;
                }
                var3.method124((byte) 47);
            }
            for (class113 var4 = (class113) class244.field4152.method499((byte) -99); var4 != null; var4 = (class113) class244.field4152.method488(1)) {
                if (var4.field1770 != null) {
                    client.field4933.method1533(var4.field1770);
                    var4.field1770 = null;
                }
                var4.method124((byte) 65);
            }
        }
        if (arg1 >= -86) {
            method826(-53, 60, -104);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIIIII)V", line = 110)
    public static final void method824(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 >= -51) {
            return;
        }
        field1739++;
        if (class150.field2331 <= arg4 && arg3 <= class65.field874 && arg6 >= class9.field112 && arg0 <= class44.field538) {
            if (arg5 == 1) {
                class204.method1432(arg3, arg6, false, arg4, arg0, arg2);
            } else {
                class252.method1720(arg2, true, arg6, arg5, arg3, arg0, arg4);
            }
        } else if (arg5 == 1) {
            class45.method248(arg3, arg2, arg4, (byte) -63, arg0, arg6);
        } else {
            class78.method466(arg4, arg0, arg6, arg2, arg3, arg5, -123);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)V", line = 157)
    public static void method825(byte arg0) {
        field1732 = null;
        if (arg0 <= 92) {
            field1740 = false;
        }
        field1733 = null;
        field1734 = null;
        field1741 = null;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(III)Z", line = 177)
    public static final boolean method826(int arg0, int arg1, int arg2) {
        if (arg2 == 11) {
            arg2 = 10;
        }
        int var3 = -121 % ((34 - arg1) / 48);
        field1731++;
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        class161 var4 = class15.method64(arg0, false);
        return var4.method1131(-2222, arg2);
    }
}
