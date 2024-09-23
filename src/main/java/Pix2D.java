import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gb")
public class Pix2D extends DoublyLinkable {

    @OriginalMember(owner = "gb", name = "k", descriptor = "I")
    private static int field619 = 7;

    @OriginalMember(owner = "gb", name = "m", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "gb", name = "n", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "gb", name = "o", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "gb", name = "p", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "gb", name = "q", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "gb", name = "r", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "gb", name = "s", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "gb", name = "t", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "gb", name = "u", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "gb", name = "v", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "gb", name = "j", descriptor = "Z")
    private static boolean field618;

    @OriginalMember(owner = "gb", name = "l", descriptor = "[I")
    public static int[] field620;

    @OriginalMember(owner = "gb", name = "a", descriptor = "(II[IZ)V")
    public static void method151(int arg0, int arg1, int[] arg2, boolean arg3) {
        field620 = arg2;
        field621 = arg0;
        if (!arg3) {
            field622 = arg1;
            method153(0, 0, arg0, arg1, 297);
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(Z)V")
    public static void method152(boolean arg0) {
        field625 = 0;
        field623 = 0;
        field626 = field621;
        if (!arg0) {
            field624 = field622;
            field627 = field626 - 1;
            field628 = field626 / 2;
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IIIII)V")
    public static void method153(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg2 > field621) {
            arg2 = field621;
        }
        if (arg3 > field622) {
            arg3 = field622;
        }
        field625 = arg1;
        int var5 = 82 / arg4;
        field623 = arg0;
        field626 = arg2;
        field624 = arg3;
        field627 = field626 - 1;
        field628 = field626 / 2;
        field629 = field624 / 2;
    }

    @OriginalMember(owner = "gb", name = "b", descriptor = "(Z)V")
    public static void method154(boolean arg0) {
        int var1 = field622 * field621;
        if (!arg0) {
            for (int var2 = 0; var2 < var1; var2++) {
                field620[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(ZIIIIII)V")
    public static void method155(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 < field625) {
            arg2 -= field625 - arg4;
            arg4 = field625;
        }
        if (arg6 < field623) {
            arg5 -= field623 - arg6;
            arg6 = field623;
        }
        if (arg2 + arg4 > field626) {
            arg2 = field626 - arg4;
        }
        if (arg5 + arg6 > field624) {
            arg5 = field624 - arg6;
        }
        int var7 = 256 - arg1;
        if (arg0) {
            return;
        }
        int var8 = (arg3 >> 16 & 0xFF) * arg1;
        int var9 = (arg3 >> 8 & 0xFF) * arg1;
        int var10 = (arg3 & 0xFF) * arg1;
        int var11 = field621 - arg2;
        int var12 = field621 * arg6 + arg4;
        for (int var13 = 0; var13 < arg5; var13++) {
            for (int var14 = -arg2; var14 < 0; var14++) {
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
        if (arg4 != -37952) {
            field618 = !field618;
        }
        if (arg0 < field625) {
            arg3 -= field625 - arg0;
            arg0 = field625;
        }
        if (arg5 < field623) {
            arg2 -= field623 - arg5;
            arg5 = field623;
        }
        if (arg0 + arg3 > field626) {
            arg3 = field626 - arg0;
        }
        if (arg2 + arg5 > field624) {
            arg2 = field624 - arg5;
        }
        int var6 = field621 - arg3;
        int var7 = field621 * arg5 + arg0;
        for (int var8 = -arg2; var8 < 0; var8++) {
            for (int var9 = -arg3; var9 < 0; var9++) {
                field620[var7++] = arg1;
            }
            var7 += var6;
        }
    }

    @OriginalMember(owner = "gb", name = "b", descriptor = "(IIIIII)V")
    public static void method157(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method159(arg4, arg1, arg0, 0, arg5);
        if (arg3 == 0) {
            method159(arg2 + arg4 - 1, arg1, arg0, 0, arg5);
            method161(true, arg2, arg5, arg4, arg1);
            method161(true, arg2, arg0 + arg5 - 1, arg4, arg1);
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IIBIIII)V")
    public static void method158(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 != 0) {
            return;
        }
        boolean var7 = false;
        method160(arg0, arg1, arg5, arg3, false, arg4);
        method160(arg0, arg1, arg5, arg3 + arg6 - 1, false, arg4);
        if (arg6 >= 3) {
            method162(arg3 + 1, arg4, arg0, arg6 - 2, arg1, 669);
            method162(arg3 + 1, arg4 + arg5 - 1, arg0, arg6 - 2, arg1, 669);
        }
    }

    @OriginalMember(owner = "gb", name = "b", descriptor = "(IIIII)V")
    public static void method159(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 < 0 || arg3 > 0 || (arg0 < field623 || arg0 >= field624)) {
            return;
        }
        if (arg4 < field625) {
            arg2 -= field625 - arg4;
            arg4 = field625;
        }
        if (arg2 + arg4 > field626) {
            arg2 = field626 - arg4;
        }
        int var5 = field621 * arg0 + arg4;
        for (int var6 = 0; var6 < arg2; var6++) {
            field620[var5 + var6] = arg1;
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IIIIZI)V")
    public static void method160(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg3 < field623 || arg3 >= field624) {
            return;
        }
        if (arg5 < field625) {
            arg2 -= field625 - arg5;
            arg5 = field625;
        }
        if (arg2 + arg5 > field626) {
            arg2 = field626 - arg5;
        }
        int var6 = 256 - arg0;
        int var7 = (arg1 >> 16 & 0xFF) * arg0;
        int var8 = (arg1 >> 8 & 0xFF) * arg0;
        int var9 = (arg1 & 0xFF) * arg0;
        if (arg4) {
            field618 = !field618;
        }
        int var10 = field621 * arg3 + arg5;
        for (int var11 = 0; var11 < arg2; var11++) {
            int var12 = (field620[var10] >> 16 & 0xFF) * var6;
            int var13 = (field620[var10] >> 8 & 0xFF) * var6;
            int var14 = (field620[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field620[var10++] = var15;
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(ZIIII)V")
    public static void method161(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!arg0) {
            field618 = !field618;
        }
        if (arg2 < field625 || arg2 >= field626) {
            return;
        }
        if (arg3 < field623) {
            arg1 -= field623 - arg3;
            arg3 = field623;
        }
        if (arg1 + arg3 > field624) {
            arg1 = field624 - arg3;
        }
        int var5 = field621 * arg3 + arg2;
        for (int var6 = 0; var6 < arg1; var6++) {
            field620[field621 * var6 + var5] = arg4;
        }
    }

    @OriginalMember(owner = "gb", name = "c", descriptor = "(IIIIII)V")
    public static void method162(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var6 = 256 - arg2;
        int var7 = (arg4 >> 16 & 0xFF) * arg2;
        int var8 = (arg4 >> 8 & 0xFF) * arg2;
        int var9 = (arg4 & 0xFF) * arg2;
        int var10 = 32 / arg5;
        int var11 = field621 * arg0 + arg1;
        for (int var12 = 0; var12 < arg3; var12++) {
            int var13 = (field620[var11] >> 16 & 0xFF) * var6;
            int var14 = (field620[var11] >> 8 & 0xFF) * var6;
            int var15 = (field620[var11] & 0xFF) * var6;
            int var16 = (var9 + var15 >> 8) + (var7 + var13 >> 8 << 16) + (var8 + var14 >> 8 << 8);
            field620[var11] = var16;
            var11 += field621;
        }
    }
}
