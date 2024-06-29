import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class161 extends class13 {

    @OriginalMember(owner = "client!jh", name = "x", descriptor = "Lto;")
    public class8 field2575;

    @OriginalMember(owner = "client!jh", name = "z", descriptor = "Lej;")
    public static class124 field2577 = new class124(81, 3);

    @OriginalMember(owner = "client!jh", name = "A", descriptor = "Ltr;")
    public static class296 field2578 = new class296();

    @OriginalMember(owner = "client!jh", name = "w", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!jh", name = "y", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!jh", name = "C", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZILma;)V", line = 8)
    public static final void method1231(boolean arg0, int arg1, class12 arg2) {
        if (arg1 > -55) {
            method1233(117, -54, 56);
        }
        class297.field4175.method3169(false, arg2);
        field2574++;
        if (arg0) {
            class434.method2636(class417.field6035, arg2, class107.field1877, false, class297.field4175, class744.field9998);
        }
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(Z)V", line = 22)
    public static void method1232(boolean arg0) {
        if (!arg0) {
            method1231(true, -84, null);
        }
        field2577 = null;
        field2578 = null;
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Lto;)V", line = 33)
    public class161(class8 arg0) {
        this.field2575 = arg0;
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(III)V", line = 45)
    public static final void method1233(int arg0, int arg1, int arg2) {
        field2576++;
        if (arg0 != 1) {
            field2577 = null;
        }
        if (class582.field7970 == class204.field2938) {
            if (!class137.method1116(false, arg2, arg1, (byte) -128, 1, 0, 1, -2, 0)) {
                class137.method1116(false, arg2, arg1, (byte) -115, 1, 0, 1, -3, 0);
            }
        } else if (!class137.method1116(false, arg2, arg1, (byte) -108, 1, 0, 1, -3, 0)) {
            class137.method1116(false, arg2, arg1, (byte) -99, 1, 0, 1, -2, 0);
        }
    }
}
