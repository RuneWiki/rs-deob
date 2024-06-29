import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!YPGIYMSL")
public class class68 {

    @OriginalMember(owner = "client!YPGIYMSL", name = "a", descriptor = "Z")
    private static boolean field1722;

    @OriginalMember(owner = "client!YPGIYMSL", name = "a", descriptor = "(IZII)I")
    public static int method575(int arg0, boolean arg1, int arg2, int arg3) {
        int var4 = arg3 & 0x3;
        if (!arg1) {
            return 1;
        } else if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return 7 - arg2;
        }
    }

    @OriginalMember(owner = "client!YPGIYMSL", name = "b", descriptor = "(IZII)I")
    public static int method576(int arg0, boolean arg1, int arg2, int arg3) {
        int var4 = arg0 & 0x3;
        if (arg1) {
            return 0;
        } else if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return 7 - arg3;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!YPGIYMSL", name = "a", descriptor = "(IIIIIII)I")
    public static int method577(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg5 & 0x1) == 1) {
            int var7 = arg1;
            arg1 = arg4;
            arg4 = var7;
        }
        int var8 = arg3 & 0x3;
        if (arg2 < 9 || arg2 > 9) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        if (var8 == 0) {
            return arg0;
        } else if (var8 == 1) {
            return arg6;
        } else if (var8 == 2) {
            return 7 + 1 - arg0 - arg1;
        } else {
            return 7 + 1 - arg6 - arg4;
        }
    }

    @OriginalMember(owner = "client!YPGIYMSL", name = "a", descriptor = "(IZIIIII)I")
    public static int method578(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!arg1) {
            field1722 = !field1722;
        }
        if ((arg5 & 0x1) == 1) {
            int var7 = arg6;
            arg6 = arg3;
            arg3 = var7;
        }
        int var8 = arg0 & 0x3;
        if (var8 == 0) {
            return arg2;
        } else if (var8 == 1) {
            return 7 + 1 - arg4 - arg6;
        } else if (var8 == 2) {
            return 7 + 1 - arg2 - arg3;
        } else {
            return arg4;
        }
    }
}
