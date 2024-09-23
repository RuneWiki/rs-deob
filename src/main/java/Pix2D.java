import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gb")
public class Pix2D extends DoublyLinkable {

    @OriginalMember(owner = "gb", name = "h", descriptor = "Z")
    private static boolean field617 = true;

    @OriginalMember(owner = "gb", name = "i", descriptor = "I")
    private static int field618 = 3;

    @OriginalMember(owner = "gb", name = "j", descriptor = "Z")
    private static boolean field619 = true;

    @OriginalMember(owner = "gb", name = "k", descriptor = "I")
    private static int field620 = -636;

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

    @OriginalMember(owner = "gb", name = "v", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "gb", name = "l", descriptor = "[I")
    public static int[] field621;

    @OriginalMember(owner = "gb", name = "a", descriptor = "([IIII)V")
    public static void method152(int[] arg0, int arg1, int arg2, int arg3) {
        field621 = arg0;
        field622 = arg2;
        field623 = arg1;
        method154(0, arg2, 0, (byte) 2, arg1);
        int var4 = 16 / arg3;
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(Z)V")
    public static void method153(boolean arg0) {
        field626 = 0;
        field624 = 0;
        if (!arg0) {
            field617 = !field617;
        }
        field627 = field622;
        field625 = field623;
        field628 = field627 - 1;
        field629 = field627 / 2;
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IIIBI)V")
    public static void method154(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg2 < 0) {
            arg2 = 0;
        }
        if (arg1 > field622) {
            arg1 = field622;
        }
        if (arg4 > field623) {
            arg4 = field623;
        }
        field626 = arg0;
        field624 = arg2;
        field627 = arg1;
        if (arg3 != 2) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        field625 = arg4;
        field628 = field627 - 1;
        field629 = field627 / 2;
        field630 = field625 / 2;
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(I)V")
    public static void method155(int arg0) {
        int var1 = field623 * field622;
        if (arg0 != 7) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        for (int var3 = 0; var3 < var1; var3++) {
            field621[var3] = 0;
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IIIIIZI)V")
    public static void method156(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        if (arg3 < field626) {
            arg0 -= field626 - arg3;
            arg3 = field626;
        }
        if (arg1 < field624) {
            arg2 -= field624 - arg1;
            arg1 = field624;
        }
        if (arg0 + arg3 > field627) {
            arg0 = field627 - arg3;
        }
        if (arg1 + arg2 > field625) {
            arg2 = field625 - arg1;
        }
        int var7 = 256 - arg4;
        if (arg5) {
            return;
        }
        int var8 = (arg6 >> 16 & 0xFF) * arg4;
        int var9 = (arg6 >> 8 & 0xFF) * arg4;
        int var10 = (arg6 & 0xFF) * arg4;
        int var11 = field622 - arg0;
        int var12 = field622 * arg1 + arg3;
        for (int var13 = 0; var13 < arg2; var13++) {
            for (int var14 = -arg0; var14 < 0; var14++) {
                int var15 = (field621[var12] >> 16 & 0xFF) * var7;
                int var16 = (field621[var12] >> 8 & 0xFF) * var7;
                int var17 = (field621[var12] & 0xFF) * var7;
                int var18 = (var10 + var17 >> 8) + (var8 + var15 >> 8 << 16) + (var9 + var16 >> 8 << 8);
                field621[var12++] = var18;
            }
            var12 += var11;
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IIIZII)V")
    public static void method157(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (arg3) {
            return;
        }
        if (arg5 < field626) {
            arg4 -= field626 - arg5;
            arg5 = field626;
        }
        if (arg0 < field624) {
            arg1 -= field624 - arg0;
            arg0 = field624;
        }
        if (arg4 + arg5 > field627) {
            arg4 = field627 - arg5;
        }
        if (arg0 + arg1 > field625) {
            arg1 = field625 - arg0;
        }
        int var6 = field622 - arg4;
        int var7 = field622 * arg0 + arg5;
        for (int var8 = -arg1; var8 < 0; var8++) {
            for (int var9 = -arg4; var9 < 0; var9++) {
                field621[var7++] = arg2;
            }
            var7 += var6;
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IIIIII)V")
    public static void method158(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method160(arg1, 5, arg0, arg4, arg2);
        method160(arg1 + arg5 - 1, 5, arg0, arg4, arg2);
        method162(arg4, arg5, arg0, 11, arg1);
        if (arg3 <= 0) {
            field618 = -479;
        }
        method162(arg4, arg5, arg0 + arg2 - 1, 11, arg1);
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IIZIIII)V")
    public static void method159(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        method161(arg1, arg5, arg0, arg6, arg3, (byte) 53);
        method161(arg1 + arg4 - 1, arg5, arg0, arg6, arg3, (byte) 53);
        if (arg2 && arg4 >= 3) {
            method163(true, arg5, arg0, arg1 + 1, arg4 - 2, arg3);
            method163(true, arg5 + arg6 - 1, arg0, arg1 + 1, arg4 - 2, arg3);
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IIIII)V")
    public static void method160(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field624 || arg0 >= field625) {
            return;
        }
        if (arg2 < field626) {
            arg4 -= field626 - arg2;
            arg2 = field626;
        }
        if (arg2 + arg4 > field627) {
            arg4 = field627 - arg2;
        }
        int var5 = field622 * arg0 + arg2;
        if (arg1 != 5) {
            field620 = -297;
        }
        for (int var6 = 0; var6 < arg4; var6++) {
            field621[var5 + var6] = arg3;
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IIIIIB)V")
    public static void method161(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        if (arg0 < field624 || arg0 >= field625) {
            return;
        }
        if (arg1 < field626) {
            arg3 -= field626 - arg1;
            arg1 = field626;
        }
        if (arg1 + arg3 > field627) {
            arg3 = field627 - arg1;
        }
        int var6 = 256 - arg4;
        int var7 = (arg2 >> 16 & 0xFF) * arg4;
        int var8 = (arg2 >> 8 & 0xFF) * arg4;
        int var9 = (arg2 & 0xFF) * arg4;
        int var10 = field622 * arg0 + arg1;
        if (arg5 != 53) {
            field620 = -358;
        }
        for (int var11 = 0; var11 < arg3; var11++) {
            int var12 = (field621[var10] >> 16 & 0xFF) * var6;
            int var13 = (field621[var10] >> 8 & 0xFF) * var6;
            int var14 = (field621[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field621[var10++] = var15;
        }
    }

    @OriginalMember(owner = "gb", name = "b", descriptor = "(IIIII)V")
    public static void method162(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < field626 || arg2 >= field627) {
            return;
        }
        if (arg4 < field624) {
            arg1 -= field624 - arg4;
            arg4 = field624;
        }
        if (arg1 + arg4 > field625) {
            arg1 = field625 - arg4;
        }
        int var5 = field622 * arg4 + arg2;
        if (arg3 <= 0) {
            field617 = !field617;
        }
        for (int var6 = 0; var6 < arg1; var6++) {
            field621[field622 * var6 + var5] = arg0;
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(ZIIIII)V")
    public static void method163(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 < field626 || arg1 >= field627) {
            return;
        }
        if (arg3 < field624) {
            arg4 -= field624 - arg3;
            arg3 = field624;
        }
        if (arg3 + arg4 > field625) {
            arg4 = field625 - arg3;
        }
        int var6 = 256 - arg5;
        int var7 = (arg2 >> 16 & 0xFF) * arg5;
        int var8 = (arg2 >> 8 & 0xFF) * arg5;
        int var9 = (arg2 & 0xFF) * arg5;
        int var10 = field622 * arg3 + arg1;
        for (int var11 = 0; var11 < arg4; var11++) {
            int var12 = (field621[var10] >> 16 & 0xFF) * var6;
            int var13 = (field621[var10] >> 8 & 0xFF) * var6;
            int var14 = (field621[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field621[var10] = var15;
            var10 += field622;
        }
        if (arg0) {
            ;
        }
    }
}
