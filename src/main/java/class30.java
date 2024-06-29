import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!KTWDNTZZ")
public class class30 {

    @OriginalMember(owner = "client!KTWDNTZZ", name = "a", descriptor = "Z")
    private static boolean field1006 = true;

    @OriginalMember(owner = "client!KTWDNTZZ", name = "a", descriptor = "(IIIB)I")
    public static int method353(int arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg1 & 0x3;
        if (arg3 != 9) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
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

    @OriginalMember(owner = "client!KTWDNTZZ", name = "a", descriptor = "(IIII)I")
    public static int method354(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 <= 0) {
            field1006 = !field1006;
        }
        int var4 = arg2 & 0x3;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 7 - arg0;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!KTWDNTZZ", name = "a", descriptor = "(IIIIIII)I")
    public static int method355(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg6 & 0x1) == 1) {
            int var7 = arg5;
            arg5 = arg2;
            arg2 = var7;
        }
        int var8 = arg4 & 0x3;
        if (arg0 != -18423) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        if (var8 == 0) {
            return arg1;
        } else if (var8 == 1) {
            return arg3;
        } else if (var8 == 2) {
            return 7 + 1 - arg1 - arg5;
        } else {
            return 7 + 1 - arg3 - arg2;
        }
    }

    @OriginalMember(owner = "client!KTWDNTZZ", name = "b", descriptor = "(IIIIIII)I")
    public static int method356(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 >= 0) {
            return 3;
        }
        if ((arg2 & 0x1) == 1) {
            int var7 = arg6;
            arg6 = arg5;
            arg5 = var7;
        }
        int var8 = arg0 & 0x3;
        if (var8 == 0) {
            return arg1;
        } else if (var8 == 1) {
            return 7 + 1 - arg3 - arg6;
        } else if (var8 == 2) {
            return 7 + 1 - arg1 - arg5;
        } else {
            return arg3;
        }
    }
}
