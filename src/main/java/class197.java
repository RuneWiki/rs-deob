import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public class class197 {

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "Lke;")
    public static class622 field2881 = new class622(74, -1);

    @OriginalMember(owner = "client!ov", name = "e", descriptor = "I")
    public static int field2884 = 0;

    @OriginalMember(owner = "client!ov", name = "d", descriptor = "Lke;")
    public static class622 field2883 = new class622(31, 2);

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!ov", name = "c", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!ov", name = "f", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(I)V")
    public static final void method1424(int arg0) {
        class620.method3543();
        if (arg0 < -33) {
            field2880++;
        }
    }

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "(I)V")
    public static void method1425(int arg0) {
        field2881 = null;
        field2883 = null;
        if (arg0 != -23493) {
            field2883 = null;
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(ZII)Ljava/lang/String;")
    public static final String method1426(boolean arg0, int arg1, int arg2) {
        field2882++;
        if (arg2 == 3272) {
            return arg0 && arg1 >= 0 ? class372.method2306(-10722, arg0, arg1, 10) : Integer.toString(arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(IZI)B")
    public static final byte method1427(int arg0, boolean arg1, int arg2) {
        field2885++;
        if (arg1) {
            method1427(-18, false, -33);
        }
        if (arg2 == 9) {
            return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }
}
