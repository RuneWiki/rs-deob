import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!YZFMUVTK")
public class class69 {

    @OriginalMember(owner = "client!YZFMUVTK", name = "b", descriptor = "Z")
    private static boolean field1710 = true;

    @OriginalMember(owner = "client!YZFMUVTK", name = "a", descriptor = "I")
    private static int field1709;

    @OriginalMember(owner = "client!YZFMUVTK", name = "a", descriptor = "(IIII)I")
    public static int method580(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 & 0x3;
        while (arg2 >= 0) {
        }
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

    @OriginalMember(owner = "client!YZFMUVTK", name = "b", descriptor = "(IIII)I")
    public static int method581(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 & 0x3;
        if (arg2 != 0) {
            return 4;
        } else if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 7 - arg3;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!YZFMUVTK", name = "a", descriptor = "(IIIIIII)I")
    public static int method582(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg5 & 0x1) == 1) {
            int var7 = arg0;
            arg0 = arg4;
            arg4 = var7;
        }
        int var8 = arg3 & 0x3;
        if (arg6 != 0) {
            field1710 = true;
        }
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

    @OriginalMember(owner = "client!YZFMUVTK", name = "a", descriptor = "(IIIIIIB)I")
    public static int method583(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        if ((arg4 & 0x1) == 1) {
            int var7 = arg3;
            arg3 = arg2;
            arg2 = var7;
        }
        int var8 = arg5 & 0x3;
        if (arg6 != -19) {
            return field1709;
        } else if (var8 == 0) {
            return arg1;
        } else if (var8 == 1) {
            return 7 + 1 - arg0 - arg3;
        } else if (var8 == 2) {
            return 7 + 1 - arg1 - arg2;
        } else {
            return arg0;
        }
    }
}
