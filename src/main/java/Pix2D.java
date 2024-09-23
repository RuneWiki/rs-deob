import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("hb")
public class Pix2D extends DoublyLinkable {

    @OriginalMember(owner = "hb", name = "i", descriptor = "I")
    private static int field617 = 728;

    @OriginalMember(owner = "hb", name = "j", descriptor = "I")
    private static int field618 = -216;

    @OriginalMember(owner = "hb", name = "k", descriptor = "I")
    private static int field619 = 579;

    @OriginalMember(owner = "hb", name = "l", descriptor = "Z")
    private static boolean field620 = true;

    @OriginalMember(owner = "hb", name = "m", descriptor = "B")
    private static byte field621 = 9;

    @OriginalMember(owner = "hb", name = "n", descriptor = "Z")
    private static boolean field622 = true;

    @OriginalMember(owner = "hb", name = "p", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "hb", name = "q", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "hb", name = "r", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "hb", name = "s", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "hb", name = "t", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "hb", name = "u", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "hb", name = "v", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "hb", name = "w", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "hb", name = "x", descriptor = "I")
    public static int field632;

    @OriginalMember(owner = "hb", name = "y", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "hb", name = "o", descriptor = "[I")
    public static int[] field623;

    @OriginalMember(owner = "hb", name = "a", descriptor = "(II[II)V")
    public static void method165(int arg0, int arg1, int[] arg2, int arg3) {
        field623 = arg2;
        field624 = arg3;
        field625 = arg1;
        if (arg0 < 0) {
            method167(arg3, true, 0, arg1, 0);
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(I)V")
    public static void method166(int arg0) {
        field628 = 0;
        field626 = 0;
        field629 = field624;
        field627 = field625;
        field630 = field629 - 1;
        if (arg0 > 0) {
            field631 = field629 / 2;
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IZIII)V")
    public static void method167(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (!arg1) {
            field619 = 122;
        }
        if (arg2 < 0) {
            arg2 = 0;
        }
        if (arg4 < 0) {
            arg4 = 0;
        }
        if (arg0 > field624) {
            arg0 = field624;
        }
        if (arg3 > field625) {
            arg3 = field625;
        }
        field628 = arg2;
        field626 = arg4;
        field629 = arg0;
        field627 = arg3;
        field630 = field629 - 1;
        field631 = field629 / 2;
        field632 = field627 / 2;
    }

    @OriginalMember(owner = "hb", name = "b", descriptor = "(I)V")
    public static void method168(int arg0) {
        int var1 = field625 * field624;
        if (arg0 < 0) {
            for (int var2 = 0; var2 < var1; var2++) {
                field623[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IIIIIII)V")
    public static void method169(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < field628) {
            arg5 -= field628 - arg2;
            arg2 = field628;
        }
        if (arg0 < field626) {
            arg4 -= field626 - arg0;
            arg0 = field626;
        }
        if (arg2 + arg5 > field629) {
            arg5 = field629 - arg2;
        }
        if (arg0 + arg4 > field627) {
            arg4 = field627 - arg0;
        }
        int var7 = 256 - arg1;
        int var8 = (arg6 >> 16 & 0xFF) * arg1;
        int var9 = (arg6 >> 8 & 0xFF) * arg1;
        int var10 = (arg6 & 0xFF) * arg1;
        int var11 = field624 - arg5;
        int var12 = field624 * arg0 + arg2;
        if (arg3 < 4 || arg3 > 4) {
            field622 = !field622;
        }
        for (int var13 = 0; var13 < arg4; var13++) {
            for (int var14 = -arg5; var14 < 0; var14++) {
                int var15 = (field623[var12] >> 16 & 0xFF) * var7;
                int var16 = (field623[var12] >> 8 & 0xFF) * var7;
                int var17 = (field623[var12] & 0xFF) * var7;
                int var18 = (var10 + var17 >> 8) + (var8 + var15 >> 8 << 16) + (var9 + var16 >> 8 << 8);
                field623[var12++] = var18;
            }
            var12 += var11;
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IIIIBI)V")
    public static void method170(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        if (arg2 < field628) {
            arg1 -= field628 - arg2;
            arg2 = field628;
        }
        if (arg3 < field626) {
            arg0 -= field626 - arg3;
            arg3 = field626;
        }
        if (arg1 + arg2 > field629) {
            arg1 = field629 - arg2;
        }
        if (arg0 + arg3 > field627) {
            arg0 = field627 - arg3;
        }
        int var6 = field624 - arg1;
        int var7 = field624 * arg3 + arg2;
        if (arg4 != 3) {
            return;
        }
        boolean var8 = false;
        for (int var9 = -arg0; var9 < 0; var9++) {
            for (int var10 = -arg1; var10 < 0; var10++) {
                field623[var7++] = arg5;
            }
            var7 += var6;
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IIIZII)V")
    public static void method171(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (!arg3) {
            field622 = !field622;
        }
        method173(arg4, arg2, 4, arg0, arg1);
        method173(arg4, arg2 + arg5 - 1, 4, arg0, arg1);
        method175(arg2, arg5, arg0, arg4, -490);
        method175(arg2, arg5, arg0, arg1 + arg4 - 1, -490);
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IBIIIII)V")
    public static void method172(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        method174(0, arg2, arg6, arg3, arg0, arg4);
        method174(0, arg2, arg5 + arg6 - 1, arg3, arg0, arg4);
        if (field621 == arg1) {
            boolean var7 = false;
        } else {
            field617 = -251;
        }
        if (arg5 >= 3) {
            method176(arg4, arg0, true, arg2, arg6 + 1, arg5 - 2);
            method176(arg3 + arg4 - 1, arg0, true, arg2, arg6 + 1, arg5 - 2);
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IIIII)V")
    public static void method173(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field626 || arg1 >= field627) {
            return;
        }
        if (arg0 < field628) {
            arg4 -= field628 - arg0;
            arg0 = field628;
        }
        if (arg0 + arg4 > field629) {
            arg4 = field629 - arg0;
        }
        int var5 = field624 * arg1 + arg0;
        if (arg2 < 4 || arg2 > 4) {
            field620 = !field620;
        }
        for (int var6 = 0; var6 < arg4; var6++) {
            field623[var5 + var6] = arg3;
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IIIIII)V")
    public static void method174(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 < field626 || arg2 >= field627) {
            return;
        }
        if (arg5 < field628) {
            arg3 -= field628 - arg5;
            arg5 = field628;
        }
        if (arg3 + arg5 > field629) {
            arg3 = field629 - arg5;
        }
        int var6 = 256 - arg4;
        int var7 = (arg1 >> 16 & 0xFF) * arg4;
        int var8 = (arg1 >> 8 & 0xFF) * arg4;
        int var9 = (arg1 & 0xFF) * arg4;
        int var10 = field624 * arg2 + arg5;
        if (arg0 != 0) {
            return;
        }
        for (int var11 = 0; var11 < arg3; var11++) {
            int var12 = (field623[var10] >> 16 & 0xFF) * var6;
            int var13 = (field623[var10] >> 8 & 0xFF) * var6;
            int var14 = (field623[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field623[var10++] = var15;
        }
    }

    @OriginalMember(owner = "hb", name = "b", descriptor = "(IIIII)V")
    public static void method175(int arg0, int arg1, int arg2, int arg3, int arg4) {
        label40: while (true) {
            if (arg4 >= 0) {
                int var7 = 1;
                while (true) {
                    if (var7 <= 0) {
                        continue label40;
                    }
                    var7++;
                }
            }
            if (arg3 >= field628 && arg3 < field629) {
                if (arg0 < field626) {
                    arg1 -= field626 - arg0;
                    arg0 = field626;
                }
                if (arg0 + arg1 > field627) {
                    arg1 = field627 - arg0;
                }
                int var5 = field624 * arg0 + arg3;
                for (int var6 = 0; var6 < arg1; var6++) {
                    field623[field624 * var6 + var5] = arg2;
                }
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IIZIII)V")
    public static void method176(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field628 || arg0 >= field629) {
            return;
        }
        if (arg4 < field626) {
            arg5 -= field626 - arg4;
            arg4 = field626;
        }
        if (arg4 + arg5 > field627) {
            arg5 = field627 - arg4;
        }
        int var6 = 256 - arg1;
        int var7 = (arg3 >> 16 & 0xFF) * arg1;
        int var8 = (arg3 >> 8 & 0xFF) * arg1;
        int var9 = (arg3 & 0xFF) * arg1;
        int var10 = field624 * arg4 + arg0;
        if (!arg2) {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
        for (int var12 = 0; var12 < arg5; var12++) {
            int var13 = (field623[var10] >> 16 & 0xFF) * var6;
            int var14 = (field623[var10] >> 8 & 0xFF) * var6;
            int var15 = (field623[var10] & 0xFF) * var6;
            int var16 = (var9 + var15 >> 8) + (var7 + var13 >> 8 << 16) + (var8 + var14 >> 8 << 8);
            field623[var10] = var16;
            var10 += field624;
        }
    }
}
