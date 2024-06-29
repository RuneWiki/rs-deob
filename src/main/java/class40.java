import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!PFTTLTVY")
public class class40 {

    @OriginalMember(owner = "client!PFTTLTVY", name = "a", descriptor = "I")
    private static int field1127 = 96;

    @OriginalMember(owner = "client!PFTTLTVY", name = "b", descriptor = "Z")
    private static boolean field1128;

    @OriginalMember(owner = "client!PFTTLTVY", name = "a", descriptor = "(IIII)I")
    public static int method408(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 0) {
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

    @OriginalMember(owner = "client!PFTTLTVY", name = "a", descriptor = "(IIZI)I")
    public static int method409(int arg0, int arg1, boolean arg2, int arg3) {
        int var4 = arg3 & 0x3;
        if (!arg2) {
            field1128 = !field1128;
        }
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 7 - arg0;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!PFTTLTVY", name = "a", descriptor = "(IIIIIBI)I")
    public static int method410(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        if ((arg0 & 0x1) == 1) {
            int var7 = arg1;
            arg1 = arg3;
            arg3 = var7;
        }
        int var8 = arg6 & 0x3;
        if (arg5 != 6) {
            field1128 = !field1128;
        }
        if (var8 == 0) {
            return arg4;
        } else if (var8 == 1) {
            return arg2;
        } else if (var8 == 2) {
            return 7 + 1 - arg4 - arg1;
        } else {
            return 7 + 1 - arg2 - arg3;
        }
    }

    @OriginalMember(owner = "client!PFTTLTVY", name = "a", descriptor = "(ZIIIIII)I")
    public static int method411(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg3 & 0x1) == 1) {
            int var7 = arg4;
            arg4 = arg6;
            arg6 = var7;
        }
        int var8 = arg1 & 0x3;
        if (!arg0) {
            return field1127;
        } else if (var8 == 0) {
            return arg2;
        } else if (var8 == 1) {
            return 7 + 1 - arg5 - arg4;
        } else if (var8 == 2) {
            return 7 + 1 - arg2 - arg6;
        } else {
            return arg5;
        }
    }
}
