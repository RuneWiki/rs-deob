import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gb")
public class Pix2D extends DoublyLinkable {

    @OriginalMember(owner = "gb", name = "j", descriptor = "B")
    private static byte field615 = 6;

    @OriginalMember(owner = "gb", name = "k", descriptor = "Z")
    private static boolean field616 = true;

    @OriginalMember(owner = "gb", name = "l", descriptor = "I")
    private static int field617 = 617;

    @OriginalMember(owner = "gb", name = "n", descriptor = "Z")
    private static boolean field619 = true;

    @OriginalMember(owner = "gb", name = "p", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "gb", name = "q", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "gb", name = "r", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "gb", name = "s", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "gb", name = "t", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "gb", name = "u", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "gb", name = "v", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "gb", name = "w", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "gb", name = "x", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "gb", name = "y", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "gb", name = "m", descriptor = "Z")
    private static boolean field618;

    @OriginalMember(owner = "gb", name = "o", descriptor = "[I")
    public static int[] field620;

    @OriginalMember(owner = "gb", name = "a", descriptor = "(III[I)V")
    public static void method152(int arg0, int arg1, int arg2, int[] arg3) {
        field620 = arg3;
        field621 = arg2;
        field622 = arg0;
        int var4 = 85 / arg1;
        method154(0, 0, arg2, 0, arg0);
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(I)V")
    public static void method153(int arg0) {
        field625 = 0;
        field623 = 0;
        field626 = field621;
        if (arg0 == 4207) {
            field624 = field622;
            field627 = field626 - 1;
            field628 = field626 / 2;
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IIIII)V")
    public static void method154(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg2 > field621) {
            arg2 = field621;
        }
        if (arg4 > field622) {
            arg4 = field622;
        }
        field625 = arg1;
        field623 = arg0;
        field626 = arg2;
        field624 = arg4;
        field627 = field626 - 1;
        if (arg3 == 0) {
            field628 = field626 / 2;
            field629 = field624 / 2;
        }
    }

    @OriginalMember(owner = "gb", name = "b", descriptor = "(I)V")
    public static void method155(int arg0) {
        int var1 = field622 * field621;
        if (arg0 == 0) {
            for (int var2 = 0; var2 < var1; var2++) {
                field620[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IIIIZII)V")
    public static void method156(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (arg4) {
            return;
        }
        if (arg5 < field625) {
            arg3 -= field625 - arg5;
            arg5 = field625;
        }
        if (arg2 < field623) {
            arg6 -= field623 - arg2;
            arg2 = field623;
        }
        if (arg3 + arg5 > field626) {
            arg3 = field626 - arg5;
        }
        if (arg2 + arg6 > field624) {
            arg6 = field624 - arg2;
        }
        int var7 = 256 - arg0;
        int var8 = (arg1 >> 16 & 0xFF) * arg0;
        int var9 = (arg1 >> 8 & 0xFF) * arg0;
        int var10 = (arg1 & 0xFF) * arg0;
        int var11 = field621 - arg3;
        int var12 = field621 * arg2 + arg5;
        for (int var13 = 0; var13 < arg6; var13++) {
            for (int var14 = -arg3; var14 < 0; var14++) {
                int var15 = (field620[var12] >> 16 & 0xFF) * var7;
                int var16 = (field620[var12] >> 8 & 0xFF) * var7;
                int var17 = (field620[var12] & 0xFF) * var7;
                int var18 = (var10 + var17 >> 8) + (var8 + var15 >> 8 << 16) + (var9 + var16 >> 8 << 8);
                field620[var12++] = var18;
            }
            var12 += var11;
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IIIIII)V")
    public static void method157(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field625) {
            arg1 -= field625 - arg0;
            arg0 = field625;
        }
        if (arg5 < field623) {
            arg4 -= field623 - arg5;
            arg5 = field623;
        }
        if (arg0 + arg1 > field626) {
            arg1 = field626 - arg0;
        }
        if (arg4 + arg5 > field624) {
            arg4 = field624 - arg5;
        }
        int var6 = field621 - arg1;
        int var7 = field621 * arg5 + arg0;
        for (int var8 = -arg4; var8 < 0; var8++) {
            for (int var9 = -arg1; var9 < 0; var9++) {
                field620[var7++] = arg3;
            }
            var7 += var6;
        }
        if (arg2 != 4) {
            field619 = !field619;
        }
    }

    @OriginalMember(owner = "gb", name = "b", descriptor = "(IIIIII)V")
    public static void method158(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method160(arg3, arg2, arg0, (byte) 6, arg5);
        method160(arg1 + arg3 - 1, arg2, arg0, (byte) 6, arg5);
        method162(arg5, arg3, 617, arg1, arg2);
        method162(arg5, arg3, 617, arg1, arg0 + arg2 - 1);
        if (arg4 != 22320) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IIIIIII)V")
    public static void method159(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 != 2799) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        method161(arg6, field616, arg2, arg3, arg0, arg5);
        method161(arg6, field616, arg2, arg1 + arg3 - 1, arg0, arg5);
        if (arg1 >= 3) {
            method163(arg6, arg2, arg5, arg3 + 1, (byte) 8, arg1 - 2);
            method163(arg0 + arg6 - 1, arg2, arg5, arg3 + 1, (byte) 8, arg1 - 2);
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IIIBI)V")
    public static void method160(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg0 < field623 || arg0 >= field624) {
            return;
        }
        if (arg1 < field625) {
            arg2 -= field625 - arg1;
            arg1 = field625;
        }
        if (arg1 + arg2 > field626) {
            arg2 = field626 - arg1;
        }
        int var5 = field621 * arg0 + arg1;
        if (field615 == arg3) {
            boolean var6 = false;
            for (int var7 = 0; var7 < arg2; var7++) {
                field620[var5 + var7] = arg4;
            }
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IZIIII)V")
    public static void method161(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 < field623 || arg3 >= field624) {
            return;
        }
        if (arg0 < field625) {
            arg4 -= field625 - arg0;
            arg0 = field625;
        }
        if (arg0 + arg4 > field626) {
            arg4 = field626 - arg0;
        }
        int var6 = 256 - arg5;
        int var7 = (arg2 >> 16 & 0xFF) * arg5;
        int var8 = (arg2 >> 8 & 0xFF) * arg5;
        int var9 = (arg2 & 0xFF) * arg5;
        int var10 = field621 * arg3 + arg0;
        if (!arg1) {
            field618 = !field618;
        }
        for (int var11 = 0; var11 < arg4; var11++) {
            int var12 = (field620[var10] >> 16 & 0xFF) * var6;
            int var13 = (field620[var10] >> 8 & 0xFF) * var6;
            int var14 = (field620[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field620[var10++] = var15;
        }
    }

    @OriginalMember(owner = "gb", name = "b", descriptor = "(IIIII)V")
    public static void method162(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 < field625 || arg4 >= field626) {
            return;
        }
        if (arg1 < field623) {
            arg3 -= field623 - arg1;
            arg1 = field623;
        }
        if (arg1 + arg3 > field624) {
            arg3 = field624 - arg1;
        }
        int var5 = field621 * arg1 + arg4;
        int var6 = 10 / arg2;
        for (int var7 = 0; var7 < arg3; var7++) {
            field620[field621 * var7 + var5] = arg0;
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IIIIBI)V")
    public static void method163(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        if (arg0 < field625 || arg0 >= field626) {
            return;
        }
        if (arg3 < field623) {
            arg5 -= field623 - arg3;
            arg3 = field623;
        }
        if (arg3 + arg5 > field624) {
            arg5 = field624 - arg3;
        }
        int var6 = 256 - arg2;
        int var7 = (arg1 >> 16 & 0xFF) * arg2;
        int var8 = (arg1 >> 8 & 0xFF) * arg2;
        int var9 = (arg1 & 0xFF) * arg2;
        int var10 = field621 * arg3 + arg0;
        for (int var11 = 0; var11 < arg5; var11++) {
            int var13 = (field620[var10] >> 16 & 0xFF) * var6;
            int var14 = (field620[var10] >> 8 & 0xFF) * var6;
            int var15 = (field620[var10] & 0xFF) * var6;
            int var16 = (var9 + var15 >> 8) + (var7 + var13 >> 8 << 16) + (var8 + var14 >> 8 << 8);
            field620[var10] = var16;
            var10 += field621;
        }
        if (arg4 != 8) {
            for (int var12 = 1; var12 > 0; var12++) {
            }
        }
    }
}
