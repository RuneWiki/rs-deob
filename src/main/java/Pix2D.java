import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gb")
public class Pix2D extends DoublyLinkable {

    @OriginalMember(owner = "gb", name = "i", descriptor = "I")
    private static int field614 = 227;

    @OriginalMember(owner = "gb", name = "j", descriptor = "Z")
    private static boolean field615 = true;

    @OriginalMember(owner = "gb", name = "k", descriptor = "B")
    private static byte field616 = 5;

    @OriginalMember(owner = "gb", name = "l", descriptor = "I")
    private static int field617 = -631;

    @OriginalMember(owner = "gb", name = "m", descriptor = "I")
    private static int field618 = 9113;

    @OriginalMember(owner = "gb", name = "n", descriptor = "I")
    private static int field619;

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

    @OriginalMember(owner = "gb", name = "z", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "gb", name = "o", descriptor = "Z")
    private static boolean field620;

    @OriginalMember(owner = "gb", name = "p", descriptor = "[I")
    public static int[] field621;

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IIB[I)V")
    public static void method152(int arg0, int arg1, byte arg2, int[] arg3) {
        field621 = arg3;
        field622 = arg0;
        field623 = arg1;
        if (arg2 == 7) {
            boolean var4 = false;
            method154(0, 0, arg0, false, arg1);
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(Z)V")
    public static void method153(boolean arg0) {
        field626 = 0;
        if (!arg0) {
            return;
        }
        field624 = 0;
        field627 = field622;
        field625 = field623;
        field628 = field627 - 1;
        field629 = field627 / 2;
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IIIZI)V")
    public static void method154(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (arg3) {
            field619 = -458;
        }
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field622) {
            arg2 = field622;
        }
        if (arg4 > field623) {
            arg4 = field623;
        }
        field626 = arg0;
        field624 = arg1;
        field627 = arg2;
        field625 = arg4;
        field628 = field627 - 1;
        field629 = field627 / 2;
        field630 = field625 / 2;
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(I)V")
    public static void method155(int arg0) {
        if (arg0 < 0) {
            int var1 = field623 * field622;
            for (int var2 = 0; var2 < var1; var2++) {
                field621[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IIIIIII)V")
    public static void method156(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 < field626) {
            arg2 -= field626 - arg5;
            arg5 = field626;
        }
        if (arg6 < field624) {
            arg1 -= field624 - arg6;
            arg6 = field624;
        }
        if (arg2 + arg5 > field627) {
            arg2 = field627 - arg5;
        }
        if (arg1 + arg6 > field625) {
            arg1 = field625 - arg6;
        }
        int var7 = 256 - arg3;
        int var8 = (arg4 >> 16 & 0xFF) * arg3;
        int var9 = (arg4 >> 8 & 0xFF) * arg3;
        int var10 = (arg4 & 0xFF) * arg3;
        int var11 = field622 - arg2;
        int var12 = field622 * arg6 + arg5;
        if (arg0 != 14017) {
            return;
        }
        for (int var13 = 0; var13 < arg1; var13++) {
            for (int var14 = -arg2; var14 < 0; var14++) {
                int var15 = (field621[var12] >> 16 & 0xFF) * var7;
                int var16 = (field621[var12] >> 8 & 0xFF) * var7;
                int var17 = (field621[var12] & 0xFF) * var7;
                int var18 = (var10 + var17 >> 8) + (var8 + var15 >> 8 << 16) + (var9 + var16 >> 8 << 8);
                field621[var12++] = var18;
            }
            var12 += var11;
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IIIIBI)V")
    public static void method157(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        if (arg5 < field626) {
            arg3 -= field626 - arg5;
            arg5 = field626;
        }
        if (arg2 < field624) {
            arg1 -= field624 - arg2;
            arg2 = field624;
        }
        if (arg3 + arg5 > field627) {
            arg3 = field627 - arg5;
        }
        if (arg1 + arg2 > field625) {
            arg1 = field625 - arg2;
        }
        int var6 = field622 - arg3;
        if (field616 == arg4) {
            boolean var7 = false;
        } else {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        int var9 = field622 * arg2 + arg5;
        for (int var10 = -arg1; var10 < 0; var10++) {
            for (int var11 = -arg3; var11 < 0; var11++) {
                field621[var9++] = arg0;
            }
            var9 += var6;
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IIIIIB)V")
    public static void method158(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        method160(arg3, 0, arg1, arg4, arg0);
        method160(arg3, 0, arg1 + arg2 - 1, arg4, arg0);
        method162(arg1, arg3, arg0, (byte) 4, arg2);
        if (arg5 != -69) {
            field615 = !field615;
        }
        method162(arg1, arg3, arg0 + arg4 - 1, (byte) 4, arg2);
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IIIIBII)V")
    public static void method159(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        if (arg4 != 72) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        method161(arg6, arg5, arg1, arg3, field617, arg0);
        method161(arg6, arg5, arg1, arg3, field617, arg0 + arg2 - 1);
        if (arg2 >= 3) {
            method163(arg1, arg6, 9113, arg0 + 1, arg2 - 2, arg5);
            method163(arg1, arg3 + arg6 - 1, 9113, arg0 + 1, arg2 - 2, arg5);
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IIIII)V")
    public static void method160(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 0 || (arg2 < field624 || arg2 >= field625)) {
            return;
        }
        if (arg4 < field626) {
            arg3 -= field626 - arg4;
            arg4 = field626;
        }
        if (arg3 + arg4 > field627) {
            arg3 = field627 - arg4;
        }
        int var5 = field622 * arg2 + arg4;
        for (int var6 = 0; var6 < arg3; var6++) {
            field621[var5 + var6] = arg0;
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IIIIII)V")
    public static void method161(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 < field624 || arg5 >= field625) {
            return;
        }
        if (arg0 < field626) {
            arg3 -= field626 - arg0;
            arg0 = field626;
        }
        if (arg0 + arg3 > field627) {
            arg3 = field627 - arg0;
        }
        int var6 = 256 - arg2;
        int var7 = (arg1 >> 16 & 0xFF) * arg2;
        int var8 = (arg1 >> 8 & 0xFF) * arg2;
        int var9 = (arg1 & 0xFF) * arg2;
        while (arg4 >= 0) {
            field620 = !field620;
        }
        int var10 = field622 * arg5 + arg0;
        for (int var11 = 0; var11 < arg3; var11++) {
            int var12 = (field621[var10] >> 16 & 0xFF) * var6;
            int var13 = (field621[var10] >> 8 & 0xFF) * var6;
            int var14 = (field621[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field621[var10++] = var15;
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IIIBI)V")
    public static void method162(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg2 < field626 || arg2 >= field627) {
            return;
        }
        if (arg0 < field624) {
            arg4 -= field624 - arg0;
            arg0 = field624;
        }
        if (arg0 + arg4 > field625) {
            arg4 = field625 - arg0;
        }
        int var5 = field622 * arg0 + arg2;
        if (arg3 != 4) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        for (int var7 = 0; var7 < arg4; var7++) {
            field621[field622 * var7 + var5] = arg1;
        }
    }

    @OriginalMember(owner = "gb", name = "b", descriptor = "(IIIIII)V")
    public static void method163(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var6 = 256 - arg0;
        int var7 = (arg5 >> 16 & 0xFF) * arg0;
        int var8 = (arg5 >> 8 & 0xFF) * arg0;
        int var9 = (arg5 & 0xFF) * arg0;
        if (field618 != arg2) {
            field618 = -445;
        }
        int var10 = field622 * arg3 + arg1;
        for (int var11 = 0; var11 < arg4; var11++) {
            int var12 = (field621[var10] >> 16 & 0xFF) * var6;
            int var13 = (field621[var10] >> 8 & 0xFF) * var6;
            int var14 = (field621[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field621[var10] = var15;
            var10 += field622;
        }
    }
}
