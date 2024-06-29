import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class25 {

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "Leb;")
    private static class230 field473 = class68.method589(0, "Select");

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "I")
    public static int field475 = 0;

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "[I")
    public static int[] field479 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2 };

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "Leb;")
    public static class230 field480 = field473;

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "Lge;")
    public static class69 field477 = null;

    @OriginalMember(owner = "client!lj", name = "m", descriptor = "I")
    public static int field482 = 0;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "I")
    public int field470;

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "I")
    public int field472;

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "I")
    public int field476;

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!lj", name = "n", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!lj", name = "l", descriptor = "J")
    public static long field481;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZLec;ZLec;I)I")
    public static final int method255(boolean arg0, class23 arg1, boolean arg2, class23 arg3, int arg4) {
        if (arg0) {
            return 46;
        }
        field483++;
        if (arg4 == 1) {
            int var5 = arg3.field2127;
            int var6 = arg1.field2127;
            if (!arg2) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var6 - var5;
        } else if (arg4 == 2) {
            return arg1.method247(127).field3579.method1610(arg3.method247(127).field3579, (byte) -86);
        } else if (arg4 == 3) {
            if (arg1.field438.method1585(class248.field4396, 83)) {
                if (arg3.field438.method1585(class248.field4396, -106)) {
                    return 0;
                } else if (arg2) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg3.field438.method1585(class248.field4396, 115)) {
                return arg2 ? 1 : -1;
            } else {
                return arg1.field438.method1610(arg3.field438, (byte) -126);
            }
        } else if (arg4 == 4) {
            if (arg1.method949(-1)) {
                return arg3.method949(-1) ? 0 : 1;
            } else if (arg3.method949(-1)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg4 == 5) {
            if (arg1.method955(false)) {
                return arg3.method955(false) ? 0 : 1;
            } else if (arg3.method955(false)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg4 == 6) {
            if (arg1.method953((byte) -128)) {
                return arg3.method953((byte) -123) ? 0 : 1;
            } else if (arg3.method953((byte) -123)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg4 != 7) {
            return arg1.field442 - arg3.field442;
        } else if (arg1.method952(108)) {
            return arg3.method952(126) ? 0 : 1;
        } else if (arg3.method952(-31)) {
            return -1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V")
    public static void method256(int arg0) {
        if (arg0 > -13) {
            method256(117);
        }
        field477 = null;
        field473 = null;
        field479 = null;
        field480 = null;
    }
}
