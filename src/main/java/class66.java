import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!YFQBSABU")
public class class66 {

    @OriginalMember(owner = "client!YFQBSABU", name = "a", descriptor = "I")
    private static int field1595 = 65;

    @OriginalMember(owner = "client!YFQBSABU", name = "b", descriptor = "I")
    private static int field1596 = 192;

    @OriginalMember(owner = "client!YFQBSABU", name = "a", descriptor = "(ZIII)I")
    public static int method537(boolean arg0, int arg1, int arg2, int arg3) {
        if (!arg0) {
            return field1596;
        }
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return arg3;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return 7 - arg3;
        }
    }

    @OriginalMember(owner = "client!YFQBSABU", name = "a", descriptor = "(IIIB)I")
    public static int method538(int arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0 & 0x3;
        if (arg3 != 1) {
            return field1595;
        }
        boolean var5 = false;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 7 - arg2;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!YFQBSABU", name = "a", descriptor = "(IIIBIII)I")
    public static int method539(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        if ((arg0 & 0x1) == 1) {
            int var7 = arg1;
            arg1 = arg6;
            arg6 = var7;
        }
        int var8 = arg4 & 0x3;
        if (arg3 != -105) {
            return 3;
        } else if (var8 == 0) {
            return arg5;
        } else if (var8 == 1) {
            return arg2;
        } else if (var8 == 2) {
            return 7 + 1 - arg5 - arg1;
        } else {
            return 7 + 1 - arg2 - arg6;
        }
    }

    @OriginalMember(owner = "client!YFQBSABU", name = "a", descriptor = "(IIIIIII)I")
    public static int method540(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = 71 / arg2;
        if ((arg5 & 0x1) == 1) {
            int var8 = arg6;
            arg6 = arg4;
            arg4 = var8;
        }
        int var9 = arg0 & 0x3;
        if (var9 == 0) {
            return arg3;
        } else if (var9 == 1) {
            return 7 + 1 - arg1 - arg6;
        } else if (var9 == 2) {
            return 7 + 1 - arg3 - arg4;
        } else {
            return arg1;
        }
    }
}
