import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gb")
public class Pix2D extends DoublyLinkable {

    @OriginalMember(owner = "gb", name = "i", descriptor = "I")
    private static int field618 = -3052;

    @OriginalMember(owner = "gb", name = "k", descriptor = "Z")
    private static boolean field620 = true;

    @OriginalMember(owner = "gb", name = "j", descriptor = "I")
    private static int field619;

    @OriginalMember(owner = "gb", name = "m", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "gb", name = "n", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "gb", name = "o", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "gb", name = "p", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "gb", name = "q", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "gb", name = "r", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "gb", name = "s", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "gb", name = "t", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "gb", name = "u", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "gb", name = "v", descriptor = "Z")
    public static boolean field631;

    @OriginalMember(owner = "gb", name = "l", descriptor = "[I")
    public static int[] field621;

    @OriginalMember(owner = "gb", name = "a", descriptor = "(I[III)V")
    public static void method151(int arg0, int[] arg1, int arg2, int arg3) {
        field621 = arg1;
        field622 = arg2;
        field623 = arg3;
        if (arg0 < 0) {
            method153(arg3, 0, 0, 0, arg2);
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(I)V")
    public static void method152(int arg0) {
        field626 = 0;
        field624 = 0;
        field627 = field622;
        field625 = field623;
        field628 = field627 - 1;
        if (arg0 != 0) {
            for (int var1 = 1; var1 > 0; var1++) {
            }
        }
        field629 = field627 / 2;
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IIIII)V")
    public static void method153(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 < 0) {
            arg3 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg4 > field622) {
            arg4 = field622;
        }
        if (arg0 > field623) {
            arg0 = field623;
        }
        field626 = arg3;
        field624 = arg1;
        field627 = arg4;
        field625 = arg0;
        if (arg2 != 0) {
            field619 = -207;
        }
        field628 = field627 - 1;
        field629 = field627 / 2;
        field630 = field625 / 2;
    }

    @OriginalMember(owner = "gb", name = "b", descriptor = "(I)V")
    public static void method154(int arg0) {
        int var1 = 54 / arg0;
        int var2 = field623 * field622;
        for (int var3 = 0; var3 < var2; var3++) {
            field621[var3] = 0;
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IIIIIII)V")
    public static void method155(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 < field626) {
            arg5 -= field626 - arg3;
            arg3 = field626;
        }
        if (arg6 < field624) {
            arg4 -= field624 - arg6;
            arg6 = field624;
        }
        if (arg3 + arg5 > field627) {
            arg5 = field627 - arg3;
        }
        if (arg4 + arg6 > field625) {
            arg4 = field625 - arg6;
        }
        int var7 = 256 - arg0;
        int var8 = (arg1 >> 16 & 0xFF) * arg0;
        int var9 = (arg1 >> 8 & 0xFF) * arg0;
        int var10 = (arg1 & 0xFF) * arg0;
        if (arg2 != 0) {
            return;
        }
        int var11 = field622 - arg5;
        int var12 = field622 * arg6 + arg3;
        for (int var13 = 0; var13 < arg4; var13++) {
            for (int var14 = -arg5; var14 < 0; var14++) {
                int var15 = (field621[var12] >> 16 & 0xFF) * var7;
                int var16 = (field621[var12] >> 8 & 0xFF) * var7;
                int var17 = (field621[var12] & 0xFF) * var7;
                int var18 = (var10 + var17 >> 8) + (var8 + var15 >> 8 << 16) + (var9 + var16 >> 8 << 8);
                field621[var12++] = var18;
            }
            var12 += var11;
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IIIIII)V")
    public static void method156(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 < field626) {
            arg0 -= field626 - arg5;
            arg5 = field626;
        }
        if (arg3 < field624) {
            arg4 -= field624 - arg3;
            arg3 = field624;
        }
        if (arg0 + arg5 > field627) {
            arg0 = field627 - arg5;
        }
        if (arg3 + arg4 > field625) {
            arg4 = field625 - arg3;
        }
        int var6 = field622 - arg0;
        if (arg2 != 47458) {
            field619 = 250;
        }
        int var7 = field622 * arg3 + arg5;
        for (int var8 = -arg4; var8 < 0; var8++) {
            for (int var9 = -arg0; var9 < 0; var9++) {
                field621[var7++] = arg1;
            }
            var7 += var6;
        }
    }

    @OriginalMember(owner = "gb", name = "b", descriptor = "(IIIIII)V")
    public static void method157(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method159(arg5, arg1, arg0, arg4, (byte) 2);
        method159(arg5, arg1, arg0, arg2 + arg4 - 1, (byte) 2);
        method161(arg4, arg0, arg5, arg2, true);
        if (arg3 != 0) {
            field618 = 322;
        }
        method161(arg4, arg0 + arg1 - 1, arg5, arg2, true);
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IZIIIII)V")
    public static void method158(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1) {
            return;
        }
        method160(arg2, arg3, -46513, arg5, arg0, arg6);
        method160(arg2 + arg4 - 1, arg3, -46513, arg5, arg0, arg6);
        if (arg4 >= 3) {
            method162(-465, arg5, arg4 - 2, arg2 + 1, arg6, arg0);
            method162(-465, arg5, arg4 - 2, arg2 + 1, arg3 + arg6 - 1, arg0);
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IIIIB)V")
    public static void method159(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg3 < field624 || arg3 >= field625) {
            return;
        }
        if (arg2 < field626) {
            arg1 -= field626 - arg2;
            arg2 = field626;
        }
        if (arg1 + arg2 > field627) {
            arg1 = field627 - arg2;
        }
        int var5 = field622 * arg3 + arg2;
        if (arg4 == 2) {
            boolean var6 = false;
        } else {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        for (int var8 = 0; var8 < arg1; var8++) {
            field621[var5 + var8] = arg0;
        }
    }

    @OriginalMember(owner = "gb", name = "c", descriptor = "(IIIIII)V")
    public static void method160(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field624 || arg0 >= field625) {
            return;
        }
        if (arg5 < field626) {
            arg1 -= field626 - arg5;
            arg5 = field626;
        }
        if (arg1 + arg5 > field627) {
            arg1 = field627 - arg5;
        }
        int var6 = 256 - arg3;
        int var7 = (arg4 >> 16 & 0xFF) * arg3;
        int var8 = (arg4 >> 8 & 0xFF) * arg3;
        int var9 = (arg4 & 0xFF) * arg3;
        int var10 = field622 * arg0 + arg5;
        for (int var11 = 0; var11 < arg1; var11++) {
            int var12 = (field621[var10] >> 16 & 0xFF) * var6;
            int var13 = (field621[var10] >> 8 & 0xFF) * var6;
            int var14 = (field621[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field621[var10++] = var15;
        }
        if (arg2 != -46513) {
            field618 = -187;
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IIIIZ)V")
    public static void method161(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (!arg4) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (arg1 < field626 || arg1 >= field627) {
            return;
        }
        if (arg0 < field624) {
            arg3 -= field624 - arg0;
            arg0 = field624;
        }
        if (arg0 + arg3 > field625) {
            arg3 = field625 - arg0;
        }
        int var6 = field622 * arg0 + arg1;
        for (int var7 = 0; var7 < arg3; var7++) {
            field621[field622 * var7 + var6] = arg2;
        }
    }

    @OriginalMember(owner = "gb", name = "d", descriptor = "(IIIIII)V")
    public static void method162(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 < field626 || arg4 >= field627) {
            return;
        }
        if (arg3 < field624) {
            arg2 -= field624 - arg3;
            arg3 = field624;
        }
        if (arg2 + arg3 > field625) {
            arg2 = field625 - arg3;
        }
        int var6 = 256 - arg1;
        int var7 = (arg5 >> 16 & 0xFF) * arg1;
        int var8 = (arg5 >> 8 & 0xFF) * arg1;
        int var9 = (arg5 & 0xFF) * arg1;
        if (arg0 >= 0) {
            return;
        }
        int var10 = field622 * arg3 + arg4;
        for (int var11 = 0; var11 < arg2; var11++) {
            int var12 = (field621[var10] >> 16 & 0xFF) * var6;
            int var13 = (field621[var10] >> 8 & 0xFF) * var6;
            int var14 = (field621[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field621[var10] = var15;
            var10 += field622;
        }
    }
}
