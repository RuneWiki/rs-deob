import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("RBJNNTUF")
public class class50 {

    @OriginalMember(owner = "RBJNNTUF", name = "a", descriptor = "I")
    private static int field1308;

    @OriginalMember(owner = "RBJNNTUF", name = "a", descriptor = "(IIII)I")
    public static int method454(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 & 0x3;
        if (arg0 < 7 || arg0 > 7) {
            return field1308;
        } else if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return arg1;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return 7 - arg1;
        }
    }

    @OriginalMember(owner = "RBJNNTUF", name = "a", descriptor = "(IZII)I")
    public static int method455(int arg0, boolean arg1, int arg2, int arg3) {
        int var4 = arg0 & 0x3;
        if (arg1) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
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

    @OriginalMember(owner = "RBJNNTUF", name = "a", descriptor = "(IIIIIBI)I")
    public static int method456(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        if ((arg4 & 0x1) == 1) {
            int var7 = arg1;
            arg1 = arg6;
            arg6 = var7;
        }
        int var8 = arg2 & 0x3;
        if (arg5 != 60) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        if (var8 == 0) {
            return arg0;
        } else if (var8 == 1) {
            return arg3;
        } else if (var8 == 2) {
            return 7 + 1 - arg0 - arg1;
        } else {
            return 7 + 1 - arg3 - arg6;
        }
    }

    @OriginalMember(owner = "RBJNNTUF", name = "a", descriptor = "(ZIIIIII)I")
    public static int method457(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg5 & 0x1) == 1) {
            int var7 = arg2;
            arg2 = arg3;
            arg3 = var7;
        }
        int var8 = arg1 & 0x3;
        if (!arg0) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        if (var8 == 0) {
            return arg6;
        } else if (var8 == 1) {
            return 7 + 1 - arg4 - arg2;
        } else if (var8 == 2) {
            return 7 + 1 - arg6 - arg3;
        } else {
            return arg4;
        }
    }
}
