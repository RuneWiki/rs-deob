import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("RHHZDAUG")
public class class48 {

    @OriginalMember(owner = "RHHZDAUG", name = "a", descriptor = "I")
    private static int field1298 = -454;

    @OriginalMember(owner = "RHHZDAUG", name = "a", descriptor = "(IIII)I")
    public static int method439(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 >= 0) {
            return 1;
        }
        int var4 = arg2 & 0x3;
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

    @OriginalMember(owner = "RHHZDAUG", name = "b", descriptor = "(IIII)I")
    public static int method440(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 >= 0) {
            return field1298;
        }
        int var4 = arg3 & 0x3;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return 7 - arg1;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "RHHZDAUG", name = "a", descriptor = "(IIIIIZI)I")
    public static int method441(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        if (arg5) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        if ((arg3 & 0x1) == 1) {
            int var8 = arg6;
            arg6 = arg4;
            arg4 = var8;
        }
        int var9 = arg0 & 0x3;
        if (var9 == 0) {
            return arg2;
        } else if (var9 == 1) {
            return arg1;
        } else if (var9 == 2) {
            return 7 + 1 - arg2 - arg6;
        } else {
            return 7 + 1 - arg1 - arg4;
        }
    }

    @OriginalMember(owner = "RHHZDAUG", name = "a", descriptor = "(IIIIIII)I")
    public static int method442(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = 29 / arg6;
        if ((arg1 & 0x1) == 1) {
            int var8 = arg4;
            arg4 = arg0;
            arg0 = var8;
        }
        int var9 = arg2 & 0x3;
        if (var9 == 0) {
            return arg5;
        } else if (var9 == 1) {
            return 7 + 1 - arg3 - arg4;
        } else if (var9 == 2) {
            return 7 + 1 - arg5 - arg0;
        } else {
            return arg3;
        }
    }
}
