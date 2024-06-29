import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!QMJXCCWI")
public class class43 {

    @OriginalMember(owner = "client!QMJXCCWI", name = "a", descriptor = "Z")
    private static boolean field1204;

    @OriginalMember(owner = "client!QMJXCCWI", name = "a", descriptor = "(IZII)I")
    public static int method426(int arg0, boolean arg1, int arg2, int arg3) {
        if (!arg1) {
            field1204 = !field1204;
        }
        int var4 = arg2 & 0x3;
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

    @OriginalMember(owner = "client!QMJXCCWI", name = "a", descriptor = "(IIII)I")
    public static int method427(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != -3564) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        int var5 = arg0 & 0x3;
        if (var5 == 0) {
            return arg2;
        } else if (var5 == 1) {
            return 7 - arg3;
        } else if (var5 == 2) {
            return 7 - arg2;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!QMJXCCWI", name = "a", descriptor = "(IIIIIII)I")
    public static int method428(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg6 <= 0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        if ((arg5 & 0x1) == 1) {
            int var8 = arg3;
            arg3 = arg2;
            arg2 = var8;
        }
        int var9 = arg0 & 0x3;
        if (var9 == 0) {
            return arg1;
        } else if (var9 == 1) {
            return arg4;
        } else if (var9 == 2) {
            return 7 + 1 - arg1 - arg3;
        } else {
            return 7 + 1 - arg4 - arg2;
        }
    }

    @OriginalMember(owner = "client!QMJXCCWI", name = "b", descriptor = "(IIIIIII)I")
    public static int method429(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 <= 0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        if ((arg4 & 0x1) == 1) {
            int var8 = arg1;
            arg1 = arg6;
            arg6 = var8;
        }
        int var9 = arg3 & 0x3;
        if (var9 == 0) {
            return arg5;
        } else if (var9 == 1) {
            return 7 + 1 - arg2 - arg1;
        } else if (var9 == 2) {
            return 7 + 1 - arg5 - arg6;
        } else {
            return arg2;
        }
    }
}
