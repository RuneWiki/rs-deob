import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!BSWTKMFD")
public class class5 {

    @OriginalMember(owner = "client!BSWTKMFD", name = "a", descriptor = "Z")
    private static boolean field67 = true;

    @OriginalMember(owner = "client!BSWTKMFD", name = "b", descriptor = "I")
    private static int field68 = 7;

    @OriginalMember(owner = "client!BSWTKMFD", name = "a", descriptor = "(IIII)I")
    public static int method41(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 3) {
            return field68;
        }
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return 7 - arg0;
        }
    }

    @OriginalMember(owner = "client!BSWTKMFD", name = "a", descriptor = "(ZIII)I")
    public static int method42(boolean arg0, int arg1, int arg2, int arg3) {
        if (!arg0) {
            field67 = !field67;
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

    @OriginalMember(owner = "client!BSWTKMFD", name = "a", descriptor = "(IIIIIII)I")
    public static int method43(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 <= 0) {
            return field68;
        }
        if ((arg5 & 0x1) == 1) {
            int var7 = arg1;
            arg1 = arg3;
            arg3 = var7;
        }
        int var8 = arg6 & 0x3;
        if (var8 == 0) {
            return arg0;
        } else if (var8 == 1) {
            return arg2;
        } else if (var8 == 2) {
            return 7 + 1 - arg0 - arg1;
        } else {
            return 7 + 1 - arg2 - arg3;
        }
    }

    @OriginalMember(owner = "client!BSWTKMFD", name = "b", descriptor = "(IIIIIII)I")
    public static int method44(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg5 & 0x1) == 1) {
            int var7 = arg6;
            arg6 = arg1;
            arg1 = var7;
        }
        int var8 = arg2 & 0x3;
        if (arg3 <= 0) {
            return 4;
        } else if (var8 == 0) {
            return arg4;
        } else if (var8 == 1) {
            return 7 + 1 - arg0 - arg6;
        } else if (var8 == 2) {
            return 7 + 1 - arg4 - arg1;
        } else {
            return arg0;
        }
    }
}
