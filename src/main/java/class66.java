import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("XNQMQYFY")
public class class66 {

    @OriginalMember(owner = "XNQMQYFY", name = "a", descriptor = "I")
    private static int field1661 = -558;

    @OriginalMember(owner = "XNQMQYFY", name = "b", descriptor = "I")
    private static int field1662 = 6;

    @OriginalMember(owner = "XNQMQYFY", name = "c", descriptor = "I")
    private static int field1663 = -13936;

    @OriginalMember(owner = "XNQMQYFY", name = "a", descriptor = "(IIZI)I")
    public static int method570(int arg0, int arg1, boolean arg2, int arg3) {
        if (!arg2) {
            return field1661;
        }
        int var4 = arg3 & 0x3;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return 7 - arg0;
        }
    }

    @OriginalMember(owner = "XNQMQYFY", name = "a", descriptor = "(IIII)I")
    public static int method571(int arg0, int arg1, int arg2, int arg3) {
        if (field1662 != arg2) {
            return field1661;
        }
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 7 - arg3;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "XNQMQYFY", name = "a", descriptor = "(IIIIIII)I")
    public static int method572(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field1663 != arg5) {
            return 3;
        }
        if ((arg1 & 0x1) == 1) {
            int var7 = arg2;
            arg2 = arg0;
            arg0 = var7;
        }
        int var8 = arg3 & 0x3;
        if (var8 == 0) {
            return arg6;
        } else if (var8 == 1) {
            return arg4;
        } else if (var8 == 2) {
            return 7 + 1 - arg6 - arg2;
        } else {
            return 7 + 1 - arg4 - arg0;
        }
    }

    @OriginalMember(owner = "XNQMQYFY", name = "b", descriptor = "(IIIIIII)I")
    public static int method573(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 != 350) {
            return field1662;
        }
        if ((arg6 & 0x1) == 1) {
            int var7 = arg4;
            arg4 = arg3;
            arg3 = var7;
        }
        int var8 = arg5 & 0x3;
        if (var8 == 0) {
            return arg2;
        } else if (var8 == 1) {
            return 7 + 1 - arg0 - arg4;
        } else if (var8 == 2) {
            return 7 + 1 - arg2 - arg3;
        } else {
            return arg0;
        }
    }
}
