import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("GYWJXMKQ")
public class class22 {

    @OriginalMember(owner = "GYWJXMKQ", name = "a", descriptor = "I")
    private static int field831 = 19;

    @OriginalMember(owner = "GYWJXMKQ", name = "b", descriptor = "I")
    private static int field832 = 104;

    @OriginalMember(owner = "GYWJXMKQ", name = "c", descriptor = "I")
    private static int field833 = -76;

    @OriginalMember(owner = "GYWJXMKQ", name = "d", descriptor = "I")
    private static int field834 = -47865;

    @OriginalMember(owner = "GYWJXMKQ", name = "a", descriptor = "(IIII)I")
    public static int method281(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 & 0x3;
        if (arg2 != 38653) {
            field832 = -153;
        }
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return arg1;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return 7 - arg1;
        }
    }

    @OriginalMember(owner = "GYWJXMKQ", name = "b", descriptor = "(IIII)I")
    public static int method282(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 0) {
            field834 = -288;
        }
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 7 - arg1;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "GYWJXMKQ", name = "a", descriptor = "(IIZIII)I")
    public static int method283(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (!arg2) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        int var7 = arg0 & 0x3;
        if (var7 == 0) {
            return arg5;
        } else if (var7 == 1) {
            return arg3;
        } else if (var7 == 2) {
            return 7 + 1 - arg5 - arg4;
        } else {
            return 7 + 1 - arg3 - arg1;
        }
    }

    @OriginalMember(owner = "GYWJXMKQ", name = "a", descriptor = "(IIIIII)I")
    public static int method284(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 >= 0) {
            return field831;
        }
        int var6 = arg4 & 0x3;
        if (var6 == 0) {
            return arg3;
        } else if (var6 == 1) {
            return 7 + 1 - arg0 - arg2;
        } else if (var6 == 2) {
            return 7 + 1 - arg3 - arg1;
        } else {
            return arg0;
        }
    }
}
