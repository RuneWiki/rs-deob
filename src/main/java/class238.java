import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class238 {

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "I")
    public static int field3954 = 0;

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "[J")
    public static long[] field3960 = new long[100];

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "[I")
    public static int[] field3957 = new int[1000];

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "J")
    public static volatile long field3955 = 0L;

    @OriginalMember(owner = "client!tj", name = "j", descriptor = "Lbd;")
    public static class162 field3963 = class17.method142(0, ":assist:");

    @OriginalMember(owner = "client!tj", name = "l", descriptor = "Lbd;")
    public static class162 field3965 = class17.method142(0, "blinken3:");

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "Lbd;")
    private static class162 field3961 = class17.method142(0, "cyan:");

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "[I")
    public static int[] field3956 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2 };

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "Z")
    public static volatile boolean field3958 = true;

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "Lbd;")
    public static class162 field3959 = field3961;

    @OriginalMember(owner = "client!tj", name = "m", descriptor = "Lbd;")
    public static class162 field3966 = field3961;

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "I")
    public static int field3962;

    @OriginalMember(owner = "client!tj", name = "k", descriptor = "I")
    public static int field3964;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V", line = 4)
    public static void method1682(int arg0) {
        field3960 = null;
        field3956 = null;
        field3965 = null;
        field3957 = null;
        field3959 = null;
        field3966 = null;
        field3963 = null;
        if (arg0 == 1) {
            field3961 = null;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)V", line = 61)
    public static final void method1683(byte arg0) {
        class210.method1546();
        field3964++;
        class269.field4499 = new class159[7];
        class269.field4499[1] = new class175();
        if (arg0 != -116) {
            method1683((byte) -106);
        }
        class269.field4499[2] = new class121();
        class269.field4499[3] = new class152();
        class269.field4499[4] = new class36();
        class269.field4499[5] = new class6();
        class269.field4499[6] = new class145();
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIIILrk;IJZ)Z", line = 92)
    public static final boolean method1684(int arg0, int arg1, int arg2, int arg3, int arg4, class255 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class188.method1409(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }
}
