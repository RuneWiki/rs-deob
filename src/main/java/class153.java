import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class153 extends class151 {

    @OriginalMember(owner = "client!jf", name = "E", descriptor = "I")
    private final int field2662;

    @OriginalMember(owner = "client!jf", name = "A", descriptor = "I")
    private final int field2658;

    @OriginalMember(owner = "client!jf", name = "r", descriptor = "I")
    private final int field2649;

    @OriginalMember(owner = "client!jf", name = "B", descriptor = "I")
    private final int field2659;

    @OriginalMember(owner = "client!jf", name = "t", descriptor = "Z")
    public static boolean field2651 = true;

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "Lqe;")
    public static class168 field2647 = class66.method448("VOLL", 17);

    @OriginalMember(owner = "client!jf", name = "q", descriptor = "Lqe;")
    private static class168 field2648 = class66.method448("Unable to find ", -112);

    @OriginalMember(owner = "client!jf", name = "D", descriptor = "I")
    public static int field2661 = 0;

    @OriginalMember(owner = "client!jf", name = "z", descriptor = "Lqe;")
    public static class168 field2657 = field2648;

    @OriginalMember(owner = "client!jf", name = "s", descriptor = "I")
    public static int field2650;

    @OriginalMember(owner = "client!jf", name = "u", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!jf", name = "w", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!jf", name = "y", descriptor = "I")
    public static int field2656;

    @OriginalMember(owner = "client!jf", name = "C", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!jf", name = "F", descriptor = "I")
    public static int field2663;

    @OriginalMember(owner = "client!jf", name = "G", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!jf", name = "H", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!jf", name = "I", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!jf", name = "J", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!jf", name = "K", descriptor = "I")
    public static int field2668;

    @OriginalMember(owner = "client!jf", name = "v", descriptor = "Loe;")
    public static class256 field2653;

    @OriginalMember(owner = "client!jf", name = "x", descriptor = "[Lqe;")
    public static class168[] field2655;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILqe;)Z")
    public static final boolean method1008(int arg0, class168 arg1) {
        ++field2660;
        if (arg1 == null) {
            return false;
        } else {
            for (int var2 = 0; var2 < class173.field3024; ++var2) {
                if (arg1.method1106(-52, class189.field3299[var2])) {
                    return true;
                }
            }
            int var3 = 24 % ((arg0 - 1) / 57);
            return false;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(III)V")
    public final void method424(int arg0, int arg1, int arg2) {
        ++field2668;
        if (arg0 != -1) {
            field2653 = null;
        }
        int var4 = this.field2662 * arg2 >> 12;
        int var5 = this.field2659 * arg2 >> 12;
        int var6 = this.field2658 * arg1 >> 12;
        int var7 = this.field2649 * arg1 >> 12;
        class98.method640(var6, 0, var4, var7, super.field2637, var5);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZIIIIIII)V")
    private static final void method1009(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field2664;
        if (!arg0) {
            method1012(-76, -7, (class256) null, 72);
        }
        if (class174.field3055 <= arg1 && ~arg3 >= ~class249.field4314 && class222.field3811 <= arg6 && ~class196.field3402 <= ~arg7) {
            class2.method15((byte) 113, arg6, arg2, arg3, arg5, arg1, arg7, arg4);
        } else {
            class191.method1241(arg1, arg4, arg2, 23127, arg3, arg6, arg7, arg5);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IBI)V")
    public final void method426(int arg0, byte arg1, int arg2) {
        ++field2667;
        int var4 = this.field2662 * arg0 >> 12;
        if (arg1 != -110) {
            method1013(-66, false);
        }
        int var5 = this.field2658 * arg2 >> 12;
        int var6 = this.field2659 * arg0 >> 12;
        int var7 = this.field2649 * arg2 >> 12;
        class2.method9(1, var5, var6, var7, super.field2638, super.field2627, var4);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
    public static void method1010(byte arg0) {
        field2657 = null;
        field2648 = null;
        field2653 = null;
        field2647 = null;
        if (arg0 == 20) {
            field2655 = null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(II)I")
    public static final int method1011(int arg0, int arg1) {
        if (arg1 != -1953808724) {
            method1012(-107, -78, (class256) null, 84);
        }
        int var2 = 0;
        ++field2663;
        if (arg0 < 0 || arg0 >= 65536) {
            arg0 >>>= 16;
            var2 += 16;
        }
        if (arg0 >= 256) {
            arg0 >>>= 8;
            var2 += 8;
        }
        if (arg0 >= 16) {
            var2 += 4;
            arg0 >>>= 4;
        }
        if (~arg0 <= -5) {
            var2 += 2;
            arg0 >>>= 2;
        }
        if (arg0 >= 1) {
            ++var2;
            arg0 >>>= 1;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IILoe;I)[Lqg;")
    public static final class217[] method1012(int arg0, int arg1, class256 arg2, int arg3) {
        ++field2666;
        if (!class9.method34(arg0, arg2, (byte) -16, arg1)) {
            return null;
        } else {
            if (arg3 != -5) {
                method1012(-81, -68, (class256) null, 15);
            }
            return class149.method995(6410);
        }
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(IBI)V")
    public final void method422(int arg0, byte arg1, int arg2) {
        ++field2654;
        int var4 = this.field2658 * arg2 >> 12;
        int var5 = this.field2649 * arg2 >> 12;
        int var6 = this.field2662 * arg0 >> 12;
        int var7 = 63 % ((arg1 - 79) / 38);
        int var8 = this.field2659 * arg0 >> 12;
        method1009(true, var6, super.field2637, var8, super.field2638, super.field2627, var4, var5);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IZ)V")
    public static final void method1013(int arg0, boolean arg1) {
        class177.method1165(-8886);
        ++field2656;
        if (~class254.field4403 != -29) {
            ++class74.field1129;
            if (class74.field1129 >= 50 || arg1) {
                class74.field1129 = arg0;
                if (!class120.field1974 && class169.field2953 != null) {
                    class87.field1348.method672(252, 238);
                    ++class121.field2014;
                    try {
                        class169.field2953.method1650(12398, 0, class87.field1348.field1780, class87.field1348.field1821);
                        class87.field1348.field1821 = 0;
                    } catch (IOException var2) {
                        class120.field1974 = true;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(IIIIIII)V")
    public class153(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field2662 = arg0;
        this.field2658 = arg1;
        this.field2649 = arg3;
        this.field2659 = arg2;
    }
}
