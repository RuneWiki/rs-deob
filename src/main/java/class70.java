import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!XSVEHPAI")
public class class70 {

    @OriginalMember(owner = "client!XSVEHPAI", name = "a", descriptor = "Z")
    private static boolean field1736 = true;

    @OriginalMember(owner = "client!XSVEHPAI", name = "b", descriptor = "I")
    private static int field1737 = -128;

    @OriginalMember(owner = "client!XSVEHPAI", name = "a", descriptor = "(IIBI)I")
    public static int method584(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != -49) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        int var5 = arg1 & 0x3;
        if (var5 == 0) {
            return arg3;
        } else if (var5 == 1) {
            return arg0;
        } else if (var5 == 2) {
            return 7 - arg3;
        } else {
            return 7 - arg0;
        }
    }

    @OriginalMember(owner = "client!XSVEHPAI", name = "a", descriptor = "(IIII)I")
    public static int method585(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 >= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        int var5 = arg0 & 0x3;
        if (var5 == 0) {
            return arg2;
        } else if (var5 == 1) {
            return 7 - arg1;
        } else if (var5 == 2) {
            return 7 - arg2;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!XSVEHPAI", name = "a", descriptor = "(IIIIIII)I")
    public static int method586(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg5 & 0x1) == 1) {
            int var7 = arg1;
            arg1 = arg3;
            arg3 = var7;
        }
        int var8 = arg2 & 0x3;
        if (arg4 >= 0) {
            return 4;
        } else if (var8 == 0) {
            return arg0;
        } else if (var8 == 1) {
            return arg6;
        } else if (var8 == 2) {
            return 7 + 1 - arg0 - arg1;
        } else {
            return 7 + 1 - arg6 - arg3;
        }
    }

    @OriginalMember(owner = "client!XSVEHPAI", name = "a", descriptor = "(ZIIIIII)I")
    public static int method587(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0) {
            field1736 = !field1736;
        }
        if ((arg3 & 0x1) == 1) {
            int var7 = arg4;
            arg4 = arg6;
            arg6 = var7;
        }
        int var8 = arg1 & 0x3;
        if (var8 == 0) {
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
