import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gb")
public class Pix2D extends DoublyLinkable {

    @OriginalMember(owner = "gb", name = "i", descriptor = "Z")
    private static boolean field617 = true;

    @OriginalMember(owner = "gb", name = "j", descriptor = "I")
    private static int field618 = -452;

    @OriginalMember(owner = "gb", name = "l", descriptor = "I")
    public static int field620;

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

    @OriginalMember(owner = "gb", name = "k", descriptor = "[I")
    public static int[] field619;

    @OriginalMember(owner = "gb", name = "a", descriptor = "(III[I)V")
    public static void method152(int arg0, int arg1, int arg2, int[] arg3) {
        field619 = arg3;
        field620 = arg0;
        field621 = arg2;
        method154(false, 0, 0, arg2, arg0);
        int var4 = 4 / arg1;
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(Z)V")
    public static void method153(boolean arg0) {
        field624 = 0;
        field622 = 0;
        field625 = field620;
        field623 = field621;
        field626 = field625 - 1;
        field627 = field625 / 2;
        if (!arg0) {
            field618 = 299;
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(ZIIII)V")
    public static void method154(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg4 > field620) {
            arg4 = field620;
        }
        if (arg3 > field621) {
            arg3 = field621;
        }
        field624 = arg2;
        field622 = arg1;
        field625 = arg4;
        if (arg0) {
            field618 = -197;
        }
        field623 = arg3;
        field626 = field625 - 1;
        field627 = field625 / 2;
        field628 = field623 / 2;
    }

    @OriginalMember(owner = "gb", name = "b", descriptor = "(Z)V")
    public static void method155(boolean arg0) {
        if (arg0) {
            for (int var1 = 1; var1 > 0; var1++) {
            }
        }
        int var2 = field621 * field620;
        for (int var3 = 0; var3 < var2; var3++) {
            field619[var3] = 0;
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IIIIIII)V")
    public static void method156(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 < field624) {
            arg5 -= field624 - arg1;
            arg1 = field624;
        }
        if (arg0 < field622) {
            arg6 -= field622 - arg0;
            arg0 = field622;
        }
        if (arg1 + arg5 > field625) {
            arg5 = field625 - arg1;
        }
        if (arg0 + arg6 > field623) {
            arg6 = field623 - arg0;
        }
        int var7 = 256 - arg2;
        int var8 = (arg4 >> 16 & 0xFF) * arg2;
        int var9 = (arg4 >> 8 & 0xFF) * arg2;
        int var10 = (arg4 & 0xFF) * arg2;
        int var11 = field620 - arg5;
        int var12 = field620 * arg0 + arg1;
        for (int var13 = 0; var13 < arg6; var13++) {
            for (int var14 = -arg5; var14 < 0; var14++) {
                int var15 = (field619[var12] >> 16 & 0xFF) * var7;
                int var16 = (field619[var12] >> 8 & 0xFF) * var7;
                int var17 = (field619[var12] & 0xFF) * var7;
                int var18 = (var10 + var17 >> 8) + (var8 + var15 >> 8 << 16) + (var9 + var16 >> 8 << 8);
                field619[var12++] = var18;
            }
            var12 += var11;
        }
        if (arg3 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IIIZII)V")
    public static void method157(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (arg0 < field624) {
            arg1 -= field624 - arg0;
            arg0 = field624;
        }
        if (arg4 < field622) {
            arg5 -= field622 - arg4;
            arg4 = field622;
        }
        if (arg0 + arg1 > field625) {
            arg1 = field625 - arg0;
        }
        if (arg4 + arg5 > field623) {
            arg5 = field623 - arg4;
        }
        int var6 = field620 - arg1;
        int var7 = field620 * arg4 + arg0;
        if (arg3) {
            return;
        }
        for (int var8 = -arg5; var8 < 0; var8++) {
            for (int var9 = -arg1; var9 < 0; var9++) {
                field619[var7++] = arg2;
            }
            var7 += var6;
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IIIIII)V")
    public static void method158(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method160(arg4, arg0, false, arg2, arg1);
        method160(arg4, arg0, false, arg2, arg1 + arg3 - 1);
        if (arg5 < 0) {
            method162(arg2, arg4, arg3, arg1, 476);
            method162(arg0 + arg2 - 1, arg4, arg3, arg1, 476);
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(BIIIIII)V")
    public static void method159(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        method161((byte) 2, arg2, arg4, arg1, arg6, arg5);
        if (arg0 != 34) {
            field617 = !field617;
        }
        method161((byte) 2, arg2, arg3 + arg4 - 1, arg1, arg6, arg5);
        if (arg3 >= 3) {
            method163(arg5, arg3 - 2, arg6, arg4 + 1, 4, arg1);
            method163(arg2 + arg5 - 1, arg3 - 2, arg6, arg4 + 1, 4, arg1);
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IIZII)V")
    public static void method160(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (arg2 || (arg4 < field622 || arg4 >= field623)) {
            return;
        }
        if (arg3 < field624) {
            arg1 -= field624 - arg3;
            arg3 = field624;
        }
        if (arg1 + arg3 > field625) {
            arg1 = field625 - arg3;
        }
        int var5 = field620 * arg4 + arg3;
        for (int var6 = 0; var6 < arg1; var6++) {
            field619[var5 + var6] = arg0;
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(BIIIII)V")
    public static void method161(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 < field622 || arg2 >= field623) {
            return;
        }
        if (arg5 < field624) {
            arg1 -= field624 - arg5;
            arg5 = field624;
        }
        if (arg1 + arg5 > field625) {
            arg1 = field625 - arg5;
        }
        int var6 = 256 - arg4;
        int var7 = (arg3 >> 16 & 0xFF) * arg4;
        int var8 = (arg3 >> 8 & 0xFF) * arg4;
        int var9 = (arg3 & 0xFF) * arg4;
        int var10 = field620 * arg2 + arg5;
        if (arg0 != 2) {
            return;
        }
        boolean var11 = false;
        for (int var12 = 0; var12 < arg1; var12++) {
            int var13 = (field619[var10] >> 16 & 0xFF) * var6;
            int var14 = (field619[var10] >> 8 & 0xFF) * var6;
            int var15 = (field619[var10] & 0xFF) * var6;
            int var16 = (var9 + var15 >> 8) + (var7 + var13 >> 8 << 16) + (var8 + var14 >> 8 << 8);
            field619[var10++] = var16;
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IIIII)V")
    public static void method162(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 <= 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (arg0 < field624 || arg0 >= field625) {
            return;
        }
        if (arg3 < field622) {
            arg2 -= field622 - arg3;
            arg3 = field622;
        }
        if (arg2 + arg3 > field623) {
            arg2 = field623 - arg3;
        }
        int var6 = field620 * arg3 + arg0;
        for (int var7 = 0; var7 < arg2; var7++) {
            field619[field620 * var7 + var6] = arg1;
        }
    }

    @OriginalMember(owner = "gb", name = "b", descriptor = "(IIIIII)V")
    public static void method163(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field624 || arg0 >= field625) {
            return;
        }
        if (arg3 < field622) {
            arg1 -= field622 - arg3;
            arg3 = field622;
        }
        if (arg1 + arg3 > field623) {
            arg1 = field623 - arg3;
        }
        int var6 = 256 - arg2;
        if (arg4 < 4 || arg4 > 4) {
            field617 = !field617;
        }
        int var7 = (arg5 >> 16 & 0xFF) * arg2;
        int var8 = (arg5 >> 8 & 0xFF) * arg2;
        int var9 = (arg5 & 0xFF) * arg2;
        int var10 = field620 * arg3 + arg0;
        for (int var11 = 0; var11 < arg1; var11++) {
            int var12 = (field619[var10] >> 16 & 0xFF) * var6;
            int var13 = (field619[var10] >> 8 & 0xFF) * var6;
            int var14 = (field619[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field619[var10] = var15;
            var10 += field620;
        }
    }
}
