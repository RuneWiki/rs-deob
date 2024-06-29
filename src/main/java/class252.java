import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public class class252 {

    @OriginalMember(owner = "client!av", name = "a", descriptor = "[J")
    public static long[] field3299 = new long[100];

    @OriginalMember(owner = "client!av", name = "f", descriptor = "[I")
    public static int[] field3304 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!av", name = "b", descriptor = "F")
    public static float field3300;

    @OriginalMember(owner = "client!av", name = "d", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!av", name = "e", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!av", name = "g", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!av", name = "c", descriptor = "Lfl;")
    public static class104 field3301;

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(ZILmv;IIJB)V")
    public static final void method1520(boolean arg0, int arg1, class295 arg2, int arg3, int arg4, long arg5, byte arg6) {
        field3305++;
        class284.method1683(arg2, 0, -77, arg3, arg4, arg1, arg0, arg5);
        if (arg6 < 115) {
            method1520(false, -30, null, 41, 18, -18L, (byte) 30);
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(III)Z")
    public static final boolean method1521(int arg0, int arg1, int arg2) {
        field3302++;
        if (arg2 <= 42) {
            return false;
        } else {
            return (arg1 & 0x34) != 0;
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(B)V")
    public static void method1522(byte arg0) {
        field3299 = null;
        field3304 = null;
        field3301 = null;
        if (arg0 <= 122) {
            method1520(true, 76, null, 112, -116, -35L, (byte) 90);
        }
    }
}
