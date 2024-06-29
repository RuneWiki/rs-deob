import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!VBKBPIQQ")
public class class62 {

    @OriginalMember(owner = "client!VBKBPIQQ", name = "a", descriptor = "I")
    private static int field1497 = 313;

    @OriginalMember(owner = "client!VBKBPIQQ", name = "a", descriptor = "(IIII)I")
    public static int method534(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 13489) {
            return 0;
        }
        int var4 = arg3 & 0x3;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return 7 - arg2;
        }
    }

    @OriginalMember(owner = "client!VBKBPIQQ", name = "b", descriptor = "(IIII)I")
    public static int method535(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 >= 0) {
            return field1497;
        }
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 7 - arg2;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!VBKBPIQQ", name = "a", descriptor = "(IIIIIZI)I")
    public static int method536(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        if (!arg5) {
            return 0;
        }
        if ((arg3 & 0x1) == 1) {
            int var7 = arg0;
            arg0 = arg4;
            arg4 = var7;
        }
        int var8 = arg6 & 0x3;
        if (var8 == 0) {
            return arg1;
        } else if (var8 == 1) {
            return arg2;
        } else if (var8 == 2) {
            return 7 + 1 - arg1 - arg0;
        } else {
            return 7 + 1 - arg2 - arg4;
        }
    }

    @OriginalMember(owner = "client!VBKBPIQQ", name = "a", descriptor = "(IIIIIII)I")
    public static int method537(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg1 & 0x1) == 1) {
            int var7 = arg3;
            arg3 = arg6;
            arg6 = var7;
        }
        int var8 = arg4 & 0x3;
        if (arg5 >= 0) {
            field1497 = -184;
        }
        if (var8 == 0) {
            return arg0;
        } else if (var8 == 1) {
            return 7 + 1 - arg2 - arg3;
        } else if (var8 == 2) {
            return 7 + 1 - arg0 - arg6;
        } else {
            return arg2;
        }
    }
}
