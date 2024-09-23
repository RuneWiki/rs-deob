import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gb")
public class Pix2D extends DoublyLinkable {

    @OriginalMember(owner = "gb", name = "i", descriptor = "I")
    private static int field614 = 1623;

    @OriginalMember(owner = "gb", name = "k", descriptor = "Z")
    private static boolean field616 = true;

    @OriginalMember(owner = "gb", name = "l", descriptor = "B")
    private static byte field617 = 8;

    @OriginalMember(owner = "gb", name = "m", descriptor = "I")
    private static int field618 = 1;

    @OriginalMember(owner = "gb", name = "n", descriptor = "B")
    private static byte field619 = 35;

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

    @OriginalMember(owner = "gb", name = "j", descriptor = "Z")
    private static boolean field615;

    @OriginalMember(owner = "gb", name = "o", descriptor = "[I")
    public static int[] field620;

    @OriginalMember(owner = "gb", name = "a", descriptor = "(I[III)V")
    public static void method151(int arg0, int[] arg1, int arg2, int arg3) {
        field620 = arg1;
        field621 = arg2;
        field622 = arg3;
        if (arg0 < 0) {
            method153(field617, arg3, arg2, 0, 0);
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(B)V")
    public static void method152(byte arg0) {
        field625 = 0;
        field623 = 0;
        field626 = field621;
        field624 = field622;
        if (arg0 != -92) {
            field615 = !field615;
        }
        field627 = field626 - 1;
        field628 = field626 / 2;
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(BIIII)V")
    public static void method153(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 < 0) {
            arg4 = 0;
        }
        if (arg3 < 0) {
            arg3 = 0;
        }
        if (arg2 > field621) {
            arg2 = field621;
        }
        if (arg1 > field622) {
            arg1 = field622;
        }
        field625 = arg4;
        field623 = arg3;
        if (arg0 != 8) {
            return;
        }
        boolean var5 = false;
        field626 = arg2;
        field624 = arg1;
        field627 = field626 - 1;
        field628 = field626 / 2;
        field629 = field624 / 2;
    }

    @OriginalMember(owner = "gb", name = "b", descriptor = "(B)V")
    public static void method154(byte arg0) {
        if (arg0 == 127) {
            int var1 = field622 * field621;
            for (int var2 = 0; var2 < var1; var2++) {
                field620[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IIIIIIZ)V")
    public static void method155(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg5 < field625) {
            arg4 -= field625 - arg5;
            arg5 = field625;
        }
        if (arg0 < field623) {
            arg1 -= field623 - arg0;
            arg0 = field623;
        }
        if (arg4 + arg5 > field626) {
            arg4 = field626 - arg5;
        }
        if (arg0 + arg1 > field624) {
            arg1 = field624 - arg0;
        }
        int var7 = 256 - arg2;
        int var8 = (arg3 >> 16 & 0xFF) * arg2;
        int var9 = (arg3 >> 8 & 0xFF) * arg2;
        int var10 = (arg3 & 0xFF) * arg2;
        if (arg6) {
            field614 = 122;
        }
        int var11 = field621 - arg4;
        int var12 = field621 * arg0 + arg5;
        for (int var13 = 0; var13 < arg1; var13++) {
            for (int var14 = -arg4; var14 < 0; var14++) {
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
    public static void method156(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 < field625) {
            arg5 -= field625 - arg4;
            arg4 = field625;
        }
        if (arg2 < field623) {
            arg3 -= field623 - arg2;
            arg2 = field623;
        }
        if (arg4 + arg5 > field626) {
            arg5 = field626 - arg4;
        }
        if (arg2 + arg3 > field624) {
            arg3 = field624 - arg2;
        }
        int var6 = field621 - arg5;
        int var7 = 83 / arg1;
        int var8 = field621 * arg2 + arg4;
        for (int var9 = -arg3; var9 < 0; var9++) {
            for (int var10 = -arg5; var10 < 0; var10++) {
                field620[var8++] = arg0;
            }
            var8 += var6;
        }
    }

    @OriginalMember(owner = "gb", name = "b", descriptor = "(IIIIII)V")
    public static void method157(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method159(arg2, arg1, arg3, true, arg4);
        method159(arg2, arg1, arg3, true, arg4 + arg5 - 1);
        method161(arg4, arg1, arg3, arg5, 0);
        if (arg0 < field618 || arg0 > field618) {
            field615 = !field615;
        }
        method161(arg4, arg1 + arg2 - 1, arg3, arg5, 0);
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IIIIIII)V")
    public static void method158(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        method160(-985, arg2, arg1, arg4, arg5, arg3);
        method160(-985, arg2, arg1, arg4, arg0 + arg5 - 1, arg3);
        if (arg6 != 0) {
            field614 = -232;
        }
        if (arg0 >= 3) {
            method162(arg0 - 2, arg1, arg5 + 1, arg4, 454, arg2);
            method162(arg0 - 2, arg1, arg5 + 1, arg4, 454, arg2 + arg3 - 1);
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IIIZI)V")
    public static void method159(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (!arg3 || (arg4 < field623 || arg4 >= field624)) {
            return;
        }
        if (arg1 < field625) {
            arg0 -= field625 - arg1;
            arg1 = field625;
        }
        if (arg0 + arg1 > field626) {
            arg0 = field626 - arg1;
        }
        int var5 = field621 * arg4 + arg1;
        for (int var6 = 0; var6 < arg0; var6++) {
            field620[var5 + var6] = arg2;
        }
    }

    @OriginalMember(owner = "gb", name = "c", descriptor = "(IIIIII)V")
    public static void method160(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 < field623 || arg4 >= field624) {
            return;
        }
        if (arg1 < field625) {
            arg5 -= field625 - arg1;
            arg1 = field625;
        }
        if (arg1 + arg5 > field626) {
            arg5 = field626 - arg1;
        }
        int var6 = 256 - arg3;
        while (arg0 >= 0) {
            for (int var16 = 1; var16 > 0; var16++) {
            }
        }
        int var7 = (arg2 >> 16 & 0xFF) * arg3;
        int var8 = (arg2 >> 8 & 0xFF) * arg3;
        int var9 = (arg2 & 0xFF) * arg3;
        int var10 = field621 * arg4 + arg1;
        for (int var11 = 0; var11 < arg5; var11++) {
            int var12 = (field620[var10] >> 16 & 0xFF) * var6;
            int var13 = (field620[var10] >> 8 & 0xFF) * var6;
            int var14 = (field620[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field620[var10++] = var15;
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IIIII)V")
    public static void method161(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != 0) {
            field616 = !field616;
        }
        if (arg1 < field625 || arg1 >= field626) {
            return;
        }
        if (arg0 < field623) {
            arg3 -= field623 - arg0;
            arg0 = field623;
        }
        if (arg0 + arg3 > field624) {
            arg3 = field624 - arg0;
        }
        int var5 = field621 * arg0 + arg1;
        for (int var6 = 0; var6 < arg3; var6++) {
            field620[field621 * var6 + var5] = arg2;
        }
    }

    @OriginalMember(owner = "gb", name = "d", descriptor = "(IIIIII)V")
    public static void method162(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 < field625 || arg5 >= field626) {
            return;
        }
        if (arg2 < field623) {
            arg0 -= field623 - arg2;
            arg2 = field623;
        }
        if (arg0 + arg2 > field624) {
            arg0 = field624 - arg2;
        }
        int var6 = 256 - arg3;
        int var7 = 37 / arg4;
        int var8 = (arg1 >> 16 & 0xFF) * arg3;
        int var9 = (arg1 >> 8 & 0xFF) * arg3;
        int var10 = (arg1 & 0xFF) * arg3;
        int var11 = field621 * arg2 + arg5;
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = (field620[var11] >> 16 & 0xFF) * var6;
            int var14 = (field620[var11] >> 8 & 0xFF) * var6;
            int var15 = (field620[var11] & 0xFF) * var6;
            int var16 = (var10 + var15 >> 8) + (var8 + var13 >> 8 << 16) + (var9 + var14 >> 8 << 8);
            field620[var11] = var16;
            var11 += field621;
        }
    }
}
