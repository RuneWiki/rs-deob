import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!OWEOYNVX")
public class class39 {

    @OriginalMember(owner = "client!OWEOYNVX", name = "a", descriptor = "(IIII)I")
    public static int method363(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 & 0x3;
        int var5 = 11 / arg1;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg3;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return 7 - arg3;
        }
    }

    @OriginalMember(owner = "client!OWEOYNVX", name = "a", descriptor = "(IIZI)I")
    public static int method364(int arg0, int arg1, boolean arg2, int arg3) {
        int var4 = arg1 & 0x3;
        if (arg2) {
            return 1;
        } else if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 7 - arg0;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!OWEOYNVX", name = "a", descriptor = "(IIIIIII)I")
    public static int method365(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 != 0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        if ((arg4 & 0x1) == 1) {
            int var8 = arg6;
            arg6 = arg1;
            arg1 = var8;
        }
        int var9 = arg5 & 0x3;
        if (var9 == 0) {
            return arg0;
        } else if (var9 == 1) {
            return arg3;
        } else if (var9 == 2) {
            return 7 + 1 - arg0 - arg6;
        } else {
            return 7 + 1 - arg3 - arg1;
        }
    }

    @OriginalMember(owner = "client!OWEOYNVX", name = "a", descriptor = "(IIIIIZI)I")
    public static int method366(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        if (!arg5) {
            return 3;
        }
        if ((arg4 & 0x1) == 1) {
            int var7 = arg3;
            arg3 = arg0;
            arg0 = var7;
        }
        int var8 = arg1 & 0x3;
        if (var8 == 0) {
            return arg6;
        } else if (var8 == 1) {
            return 7 + 1 - arg2 - arg3;
        } else if (var8 == 2) {
            return 7 + 1 - arg6 - arg0;
        } else {
            return arg2;
        }
    }
}
