import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("XPCGXWBX")
public class class66 {

    @OriginalMember(owner = "XPCGXWBX", name = "a", descriptor = "I")
    private static int field1635 = -426;

    @OriginalMember(owner = "XPCGXWBX", name = "b", descriptor = "Z")
    private static boolean field1636;

    @OriginalMember(owner = "XPCGXWBX", name = "a", descriptor = "(IBII)I")
    public static int method553(int arg0, byte arg1, int arg2, int arg3) {
        int var4 = arg2 & 0x3;
        if (arg1 != 94) {
            return field1635;
        } else if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg3;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return 7 - arg3;
        }
    }

    @OriginalMember(owner = "XPCGXWBX", name = "a", descriptor = "(IIII)I")
    public static int method554(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 & 0x3;
        if (arg0 != 7) {
            field1636 = !field1636;
        }
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 7 - arg2;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "XPCGXWBX", name = "a", descriptor = "(IIIIIII)I")
    public static int method555(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 != 0) {
            field1635 = 184;
        }
        if ((arg0 & 0x1) == 1) {
            int var7 = arg6;
            arg6 = arg4;
            arg4 = var7;
        }
        int var8 = arg3 & 0x3;
        if (var8 == 0) {
            return arg1;
        } else if (var8 == 1) {
            return arg2;
        } else if (var8 == 2) {
            return 7 + 1 - arg1 - arg6;
        } else {
            return 7 + 1 - arg2 - arg4;
        }
    }

    @OriginalMember(owner = "XPCGXWBX", name = "b", descriptor = "(IIIIIII)I")
    public static int method556(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg4 & 0x1) == 1) {
            int var7 = arg2;
            arg2 = arg5;
            arg5 = var7;
        }
        int var8 = arg3 & 0x3;
        if (arg6 != 0) {
            return 4;
        } else if (var8 == 0) {
            return arg1;
        } else if (var8 == 1) {
            return 7 + 1 - arg0 - arg2;
        } else if (var8 == 2) {
            return 7 + 1 - arg1 - arg5;
        } else {
            return arg0;
        }
    }
}
