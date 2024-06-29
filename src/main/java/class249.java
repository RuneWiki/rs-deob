import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaa")
public class class249 {

    @OriginalMember(owner = "client!jaa", name = "d", descriptor = "[J")
    public static long[] field3278 = new long[32];

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!jaa", name = "c", descriptor = "I")
    public static int field3277;

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "[Lcaa;")
    public static class538[] field3275;

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IIII)I", line = 7)
    public static final int method1512(int arg0, int arg1, int arg2, int arg3) {
        field3276++;
        int var4 = arg0 & 0x3;
        if (arg1 > -54) {
            method1513(-99, -71, null, 10, -106);
        }
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 4095 - arg2;
        } else if (var4 == 2) {
            return 4095 - arg3;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IILda;II)Lifa;", line = 33)
    public static final class62 method1513(int arg0, int arg1, class395 arg2, int arg3, int arg4) {
        if (arg3 == 2) {
            field3277++;
            return arg2 == null ? null : new class62(arg4, arg1, arg0, arg2.method1041(), arg2.method1012(), arg2.method1009(), arg2.method1007(), arg2.method1011(), arg2.method1053(), arg2.method1039());
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(I)V", line = 51)
    public static void method1514(int arg0) {
        if (arg0 <= -39) {
            field3275 = null;
            field3278 = null;
        }
    }
}
