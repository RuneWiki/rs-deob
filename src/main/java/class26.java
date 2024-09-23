import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("KTYXNKDN")
public class class26 {

    @OriginalMember(owner = "KTYXNKDN", name = "a", descriptor = "Z")
    private static boolean field981 = true;

    @OriginalMember(owner = "KTYXNKDN", name = "b", descriptor = "I")
    private static int field982 = 4;

    @OriginalMember(owner = "KTYXNKDN", name = "a", descriptor = "(IZII)I")
    public static int method269(int arg0, boolean arg1, int arg2, int arg3) {
        int var4 = arg0 & 0x3;
        if (arg1) {
            return 1;
        } else if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return 7 - arg2;
        }
    }

    @OriginalMember(owner = "KTYXNKDN", name = "a", descriptor = "(IIII)I")
    public static int method270(int arg0, int arg1, int arg2, int arg3) {
        if (field982 != arg1) {
            return field982;
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

    @OriginalMember(owner = "KTYXNKDN", name = "a", descriptor = "(IIIZIII)I")
    public static int method271(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        if ((arg5 & 0x1) == 1) {
            int var7 = arg1;
            arg1 = arg6;
            arg6 = var7;
        }
        int var8 = arg0 & 0x3;
        if (arg3) {
            field981 = !field981;
        }
        if (var8 == 0) {
            return arg4;
        } else if (var8 == 1) {
            return arg2;
        } else if (var8 == 2) {
            return 7 + 1 - arg4 - arg1;
        } else {
            return 7 + 1 - arg2 - arg6;
        }
    }

    @OriginalMember(owner = "KTYXNKDN", name = "b", descriptor = "(IIIZIII)I")
    public static int method272(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        if (arg3) {
            return 3;
        }
        if ((arg4 & 0x1) == 1) {
            int var7 = arg0;
            arg0 = arg2;
            arg2 = var7;
        }
        int var8 = arg5 & 0x3;
        if (var8 == 0) {
            return arg1;
        } else if (var8 == 1) {
            return 7 + 1 - arg6 - arg0;
        } else if (var8 == 2) {
            return 7 + 1 - arg1 - arg2;
        } else {
            return arg6;
        }
    }
}
