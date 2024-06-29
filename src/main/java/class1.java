import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!AOGMWZWE")
public class class1 {

    @OriginalMember(owner = "client!AOGMWZWE", name = "a", descriptor = "I")
    private static int field1 = 1;

    @OriginalMember(owner = "client!AOGMWZWE", name = "a", descriptor = "(IIBI)I")
    public static int method1(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = arg1 & 0x3;
        if (arg2 != -68) {
            return 2;
        } else if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return 7 - arg0;
        }
    }

    @OriginalMember(owner = "client!AOGMWZWE", name = "a", descriptor = "(IIII)I")
    public static int method2(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != -17707) {
            return field1;
        }
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return 7 - arg3;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!AOGMWZWE", name = "a", descriptor = "(IIIBIII)I")
    public static int method3(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        if ((arg4 & 0x1) == 1) {
            int var7 = arg0;
            arg0 = arg2;
            arg2 = var7;
        }
        int var8 = arg6 & 0x3;
        if (arg3 != 101) {
            return 4;
        } else if (var8 == 0) {
            return arg5;
        } else if (var8 == 1) {
            return arg1;
        } else if (var8 == 2) {
            return 7 + 1 - arg5 - arg0;
        } else {
            return 7 + 1 - arg1 - arg2;
        }
    }

    @OriginalMember(owner = "client!AOGMWZWE", name = "a", descriptor = "(IIZIIII)I")
    public static int method4(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!arg2) {
            return field1;
        }
        if ((arg0 & 0x1) == 1) {
            int var7 = arg3;
            arg3 = arg6;
            arg6 = var7;
        }
        int var8 = arg4 & 0x3;
        if (var8 == 0) {
            return arg1;
        } else if (var8 == 1) {
            return 7 + 1 - arg5 - arg3;
        } else if (var8 == 2) {
            return 7 + 1 - arg1 - arg6;
        } else {
            return arg5;
        }
    }
}
