import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class397 {

    @OriginalMember(owner = "client!id", name = "d", descriptor = "[[I")
    public static int[][] field5789 = new int[128][128];

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    public static int field5786;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    public static int field5787;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    public static int field5790;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "Lhf;")
    public static class260 field5788;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIIIIII)V", line = 4)
    public static final void method2358(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5790++;
        if (arg2 != 1105117192) {
            field5788 = null;
        }
        if (arg1 == arg7) {
            class48.method344(arg0, arg5, arg2 - 1105117159, arg6, arg7, arg3, arg4);
        } else if ((arg0 - arg7) >= class355.field5296 && (arg0 + arg7) <= class320.field4818 && class248.field3808 <= arg5 - arg1 && arg1 + arg5 <= class478.field7310) {
            class256.method1535(0, arg4, arg5, arg6, arg3, arg0, arg7, arg1);
        } else {
            class352.method2149(arg2 - 1105117192, arg1, arg0, arg6, arg3, arg5, arg4, arg7);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IILqq;IIII)Lcd;", line = 28)
    public static final class198 method2359(int arg0, int arg1, class318 arg2, int arg3, int arg4, int arg5, int arg6) {
        field5787++;
        if (arg3 != 2) {
            method2359(-127, 37, null, -21, 95, -40, 39);
        }
        long var7 = (long) arg1;
        class198 var9 = (class198) class57.field973.method1752(0, var7);
        short var10 = 2055;
        if (var9 == null) {
            class303 var11 = class175.method1096(arg1, 111, class274.field4160, 0);
            if (var11 == null) {
                return null;
            }
            if (var11.field4564 < 13) {
                var11.method1822(-13275, 0);
            }
            var9 = arg2.method1908(var11, var10, class218.field3357, 64, 768);
            class57.field973.method1758(arg3 - 1, var9, var7);
        }
        class198 var12 = var9.method511((byte) 2, var10, true);
        if (arg0 != 0) {
            var12.method476(arg0);
        }
        if (arg5 != 0) {
            var12.method470(arg5);
        }
        if (arg4 != 0) {
            var12.method467(arg4);
        }
        if (arg6 != 0) {
            var12.method508(0, arg6, 0);
        }
        return var12;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V", line = 75)
    public static void method2360(int arg0) {
        if (arg0 <= 104) {
            field5786 = 60;
        }
        field5789 = null;
        field5788 = null;
    }
}
