import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class328 {

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "J")
    public static long field4934 = 0L;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "[Lir;")
    public static class22[] field4933 = new class22[14];

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
    public static int field4935;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "Lpl;")
    public class463 field4936;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIZB)V", line = 4)
    public static final void method2083(int arg0, int arg1, int arg2, boolean arg3, byte arg4) {
        class295.field4505 = 0L;
        field4935++;
        int var5 = class32.method223((byte) 118);
        if (arg0 == 3 || var5 == 3) {
            arg3 = true;
        }
        int var6 = -75 % ((arg4 + 70) / 52);
        if (!class377.field5692.method283()) {
            arg3 = true;
        }
        class480.method2884(arg1, arg3, arg2, var5, true, arg0);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)V", line = 35)
    public static void method2084(byte arg0) {
        field4933 = null;
        if (arg0 > 0) {
            method2083(72, -103, -93, false, (byte) 42);
        }
    }
}
