import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!KFSVUSRG")
public class class29 {

    @OriginalMember(owner = "client!KFSVUSRG", name = "a", descriptor = "I")
    private static int field1080 = 519;

    @OriginalMember(owner = "client!KFSVUSRG", name = "b", descriptor = "Z")
    private static boolean field1081;

    @OriginalMember(owner = "client!KFSVUSRG", name = "a", descriptor = "(IIII)I")
    public static int method312(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 >= 0) {
            field1080 = -198;
        }
        int var4 = arg3 & 0x3;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return 7 - arg0;
        }
    }

    @OriginalMember(owner = "client!KFSVUSRG", name = "a", descriptor = "(IZII)I")
    public static int method313(int arg0, boolean arg1, int arg2, int arg3) {
        if (!arg1) {
            return 0;
        }
        int var4 = arg2 & 0x3;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return 7 - arg3;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!KFSVUSRG", name = "a", descriptor = "(IIIIIBI)I")
    public static int method314(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        if (arg5 != -106) {
            field1081 = !field1081;
        }
        if ((arg0 & 0x1) == 1) {
            int var7 = arg2;
            arg2 = arg6;
            arg6 = var7;
        }
        int var8 = arg4 & 0x3;
        if (var8 == 0) {
            return arg1;
        } else if (var8 == 1) {
            return arg3;
        } else if (var8 == 2) {
            return 7 + 1 - arg1 - arg2;
        } else {
            return 7 + 1 - arg3 - arg6;
        }
    }

    @OriginalMember(owner = "client!KFSVUSRG", name = "a", descriptor = "(IIIIIII)I")
    public static int method315(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 != 4) {
            field1081 = !field1081;
        }
        if ((arg2 & 0x1) == 1) {
            int var7 = arg6;
            arg6 = arg4;
            arg4 = var7;
        }
        int var8 = arg3 & 0x3;
        if (var8 == 0) {
            return arg0;
        } else if (var8 == 1) {
            return 7 + 1 - arg5 - arg6;
        } else if (var8 == 2) {
            return 7 + 1 - arg0 - arg4;
        } else {
            return arg5;
        }
    }
}
