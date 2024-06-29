import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class149 {

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
    public int field2396 = 128;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
    public int field2398 = 128;

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "I")
    public int field2405;

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "I")
    public int field2403;

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "I")
    public int field2404;

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
    public int field2407;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "Lbg;")
    public static class310 field2401 = new class310(80, 16);

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)Lfa;", line = 7)
    public final class149 method968(int arg0) {
        if (arg0 != -1) {
            this.field2407 = 44;
        }
        field2400++;
        return new class149(this.field2405, this.field2398, this.field2396, this.field2407, this.field2404, this.field2403);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lqq;ILpb;)I", line = 18)
    public static final int method969(class318 arg0, int arg1, class448 arg2) {
        field2399++;
        if (~arg2.field6908 != arg1) {
            return arg2.field6908;
        }
        if (arg2.field6899 != -1) {
            class48 var3 = arg0.field4784.method59(arg0.method1893() ? arg2.field6899 : arg2.field6906, 21645);
            if (!var3.field733) {
                return var3.field737;
            }
        }
        return arg2.field6895;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)Z", line = 40)
    public static final boolean method970(int arg0, int arg1) {
        field2402++;
        class379.field5542 = arg0 + arg1 & 0xFFFF;
        class146.field2363 = true;
        return true;
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(I)V", line = 117)
    public class149(int arg0) {
        this.field2405 = arg0;
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(IIIIII)V", line = 124)
    private class149(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2403 = arg5;
        this.field2398 = arg1;
        this.field2404 = arg4;
        this.field2407 = arg3;
        this.field2405 = arg0;
        this.field2396 = arg2;
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)V", line = 56)
    public static void method971(int arg0) {
        if (arg0 != 0) {
            method970(65, 32);
        }
        field2401 = null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lfa;I)V", line = 79)
    public final void method972(class149 arg0, int arg1) {
        this.field2403 = arg0.field2403;
        this.field2396 = arg0.field2396;
        field2397++;
        this.field2405 = arg0.field2405;
        this.field2407 = arg0.field2407;
        int var3 = -42 % ((49 - arg1) / 56);
        this.field2398 = arg0.field2398;
        this.field2404 = arg0.field2404;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIIIIIIII)V", line = 97)
    public static final void method973(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2406++;
        if (arg6 < 128 || arg4 < 128 || ((class150.field2422 - 2) * 128) < arg6 || arg4 > (class21.field272 * 128 - 256)) {
            class161.field2529[0] = class161.field2529[1] = -1;
            return;
        }
        int var10 = class7.method38(arg6, arg9, arg4, (byte) -54) - arg1;
        class378.field5533.method201(arg3, 0, 0);
        class345.field5116.method1921(class378.field5533);
        class345.field5116.method1932(arg6, var10, arg4, class161.field2529);
        class378.field5533.method201(-arg3, 0, arg5);
        class345.field5116.method1921(class378.field5533);
    }
}
