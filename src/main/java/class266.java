import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class266 extends class287 {

    @OriginalMember(owner = "client!sc", name = "q", descriptor = "I")
    public int field3573 = 0;

    @OriginalMember(owner = "client!sc", name = "v", descriptor = "Lrb;")
    public static class283 field3578 = new class283(75, 12);

    @OriginalMember(owner = "client!sc", name = "z", descriptor = "[J")
    public static long[] field3582 = new long[32];

    @OriginalMember(owner = "client!sc", name = "B", descriptor = "[I")
    public static int[] field3584 = new int[32];

    @OriginalMember(owner = "client!sc", name = "r", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!sc", name = "t", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!sc", name = "u", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!sc", name = "w", descriptor = "I")
    public static int field3579;

    @OriginalMember(owner = "client!sc", name = "x", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!sc", name = "y", descriptor = "I")
    public static int field3581;

    @OriginalMember(owner = "client!sc", name = "A", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!sc", name = "s", descriptor = "Lor;")
    public static class173 field3575;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1566(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3583++;
        if (arg5 >= class519.field7633 && arg4 <= class375.field5387 && arg2 >= class23.field320 && arg3 <= class233.field3241) {
            class78.method608(arg4, arg5, arg1, arg7, arg0, arg6, arg2, arg3);
        } else {
            class306.method1767(arg5, arg2, arg4, (byte) -119, arg1, arg3, arg7, arg6);
        }
        if (arg0 != -3) {
            method1571(-30, 74, -91, -11, 68);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BLsv;)V")
    public final void method1567(byte arg0, class319 arg1) {
        while (true) {
            int var3 = arg1.method1869(-102);
            if (var3 == 0) {
                if (arg0 != -46) {
                    return;
                }
                field3579++;
                return;
            }
            this.method1569(var3, arg1, -48);
        }
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(B)V")
    public static void method1568(byte arg0) {
        if (arg0 == -73) {
            field3584 = null;
            field3582 = null;
            field3578 = null;
            field3575 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILsv;I)V")
    private final void method1569(int arg0, class319 arg1, int arg2) {
        if (arg0 == 2) {
            this.field3573 = arg1.method1844(-107);
        }
        int var4 = -127 % ((2 - arg2) / 37);
        field3574++;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(JI)V")
    public static final void method1570(long arg0, int arg1) {
        class17.field275.field4360 = 0;
        field3576++;
        class17.field275.method1891(false, class88.field1436.field2102);
        class17.field275.method1859((byte) -112, arg0);
        class17.field275.method1891(false, class486.field6998);
        class49.field703 = -3;
        if (arg1 > 100) {
            class92.field1489 = 0;
            class196.field2876 = 1;
            class221.field3126 = 0;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIII)V")
    public static final void method1571(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3581++;
        if (arg3 >= class23.field320 && arg3 <= class233.field3241) {
            int var5 = class486.method2879((byte) 69, arg1, class375.field5387, class519.field7633);
            int var6 = class486.method2879((byte) -86, arg4, class375.field5387, class519.field7633);
            class350.method2098(var6, -75, var5, arg3, arg2);
        }
        if (arg0 != -25984) {
            method1568((byte) -6);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method1572(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            field3582 = null;
        }
        field3577++;
        return (arg1 & 0x8000) != 0;
    }
}
