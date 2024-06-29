import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class279 extends class45 {

    @OriginalMember(owner = "client!ei", name = "k", descriptor = "I")
    public int field4054;

    @OriginalMember(owner = "client!ei", name = "n", descriptor = "[J")
    public static long[] field4057 = new long[32];

    @OriginalMember(owner = "client!ei", name = "l", descriptor = "[[I")
    public static int[][] field4055 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!ei", name = "o", descriptor = "I")
    public static int field4058 = 0;

    @OriginalMember(owner = "client!ei", name = "m", descriptor = "I")
    public static int field4056;

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "(I)V", line = 3)
    public static void method1932(int arg0) {
        field4057 = null;
        if (arg0 != 32324) {
            method1933(-128, (class351) null, -105, (byte[][]) null, (class351) null, (byte[][]) null, false, 69, (class405) null, (int[][]) null, (byte[][]) null, 16, (byte[][]) null);
        }
        field4055 = null;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(ILck;I[[BLck;[[BZILii;[[I[[BI[[B)V", line = 19)
    public static final void method1933(int arg0, class351 arg1, int arg2, byte[][] arg3, class351 arg4, byte[][] arg5, boolean arg6, int arg7, class405 arg8, int[][] arg9, byte[][] arg10, int arg11, byte[][] arg12) {
        if (arg0 != -28906) {
            field4055 = null;
        }
        field4056++;
        if (class373.field5422 == 0 && !class275.field3984) {
            class396.method2544(arg4, arg3, arg6, arg12, arg8, arg10, arg2, arg9, arg1, arg5, arg11, (byte) 124, arg7);
        } else {
            class31.method207(arg3, arg9, arg5, arg10, arg8, arg4, arg6, arg12, arg0 + 28913, arg7, arg11, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "()V", line = 33)
    public class279() {
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(I)V", line = 36)
    public class279(int arg0) {
        this.field4054 = arg0;
    }
}
