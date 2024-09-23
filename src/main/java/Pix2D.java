import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("hb")
public class Pix2D extends DoublyLinkable {

    @OriginalMember(owner = "hb", name = "i", descriptor = "Z")
    private static boolean field623 = true;

    @OriginalMember(owner = "hb", name = "j", descriptor = "I")
    private static int field624 = -84;

    @OriginalMember(owner = "hb", name = "k", descriptor = "B")
    private static byte field625 = -77;

    @OriginalMember(owner = "hb", name = "l", descriptor = "B")
    private static byte field626 = -77;

    @OriginalMember(owner = "hb", name = "m", descriptor = "I")
    private static int field627 = 39984;

    @OriginalMember(owner = "hb", name = "n", descriptor = "I")
    private static int field628 = -523;

    @OriginalMember(owner = "hb", name = "p", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "hb", name = "q", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "hb", name = "r", descriptor = "I")
    public static int field632;

    @OriginalMember(owner = "hb", name = "s", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "hb", name = "t", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "hb", name = "u", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "hb", name = "v", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "hb", name = "w", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "hb", name = "x", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "hb", name = "y", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "hb", name = "h", descriptor = "Z")
    private static boolean field622;

    @OriginalMember(owner = "hb", name = "o", descriptor = "[I")
    public static int[] field629;

    @OriginalMember(owner = "hb", name = "a", descriptor = "([IIIB)V")
    public static void method165(int[] arg0, int arg1, int arg2, byte arg3) {
        field629 = arg0;
        if (arg3 != -59) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        field630 = arg1;
        field631 = arg2;
        method167(0, arg1, arg2, 0, field623);
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(B)V")
    public static void method166(byte arg0) {
        field634 = 0;
        field632 = 0;
        field635 = field630;
        field633 = field631;
        field636 = field635 - 1;
        if (arg0 != 0) {
            field628 = -157;
        }
        field637 = field635 / 2;
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IIIIZ)V")
    public static void method167(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg3 < 0) {
            arg3 = 0;
        }
        if (arg1 > field630) {
            arg1 = field630;
        }
        if (arg2 > field631) {
            arg2 = field631;
        }
        field634 = arg0;
        field632 = arg3;
        field635 = arg1;
        field633 = arg2;
        if (!arg4) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        field636 = field635 - 1;
        field637 = field635 / 2;
        field638 = field633 / 2;
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(I)V")
    public static void method168(int arg0) {
        int var1 = field631 * field630;
        if (arg0 <= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        for (int var3 = 0; var3 < var1; var3++) {
            field629[var3] = 0;
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IIIBIII)V")
    public static void method169(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        if (arg0 < field634) {
            arg5 -= field634 - arg0;
            arg0 = field634;
        }
        if (arg2 < field632) {
            arg1 -= field632 - arg2;
            arg2 = field632;
        }
        if (arg0 + arg5 > field635) {
            arg5 = field635 - arg0;
        }
        if (arg1 + arg2 > field633) {
            arg1 = field633 - arg2;
        }
        int var7 = 256 - arg4;
        int var8 = (arg6 >> 16 & 0xFF) * arg4;
        int var9 = (arg6 >> 8 & 0xFF) * arg4;
        int var10 = (arg6 & 0xFF) * arg4;
        if (arg3 == 4) {
            boolean var11 = false;
        } else {
            field622 = !field622;
        }
        int var12 = field630 - arg5;
        int var13 = field630 * arg2 + arg0;
        for (int var14 = 0; var14 < arg1; var14++) {
            for (int var15 = -arg5; var15 < 0; var15++) {
                int var16 = (field629[var13] >> 16 & 0xFF) * var7;
                int var17 = (field629[var13] >> 8 & 0xFF) * var7;
                int var18 = (field629[var13] & 0xFF) * var7;
                int var19 = (var10 + var18 >> 8) + (var8 + var16 >> 8 << 16) + (var9 + var17 >> 8 << 8);
                field629[var13++] = var19;
            }
            var13 += var12;
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IIIIII)V")
    public static void method170(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != 5) {
            field628 = 405;
        }
        if (arg2 < field634) {
            arg0 -= field634 - arg2;
            arg2 = field634;
        }
        if (arg3 < field632) {
            arg4 -= field632 - arg3;
            arg3 = field632;
        }
        if (arg0 + arg2 > field635) {
            arg0 = field635 - arg2;
        }
        if (arg3 + arg4 > field633) {
            arg4 = field633 - arg3;
        }
        int var6 = field630 - arg0;
        int var7 = field630 * arg3 + arg2;
        for (int var8 = -arg4; var8 < 0; var8++) {
            for (int var9 = -arg0; var9 < 0; var9++) {
                field629[var7++] = arg5;
            }
            var7 += var6;
        }
    }

    @OriginalMember(owner = "hb", name = "b", descriptor = "(IIIIII)V")
    public static void method171(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method173(arg2, arg5, arg3, arg4, (byte) 59);
        method173(arg1 + arg2 - 1, arg5, arg3, arg4, (byte) 59);
        method175(arg2, arg1, false, arg4, arg5);
        if (arg0 < 0) {
            method175(arg2, arg1, false, arg4, arg3 + arg5 - 1);
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IIIIIII)V")
    public static void method172(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        method174(arg4, arg6, arg0, arg1, arg5, (byte) -77);
        if (arg2 >= 0) {
            return;
        }
        method174(arg3 + arg4 - 1, arg6, arg0, arg1, arg5, (byte) -77);
        if (arg3 >= 3) {
            method176(arg5, arg1, arg3 - 2, true, arg6, arg4 + 1);
            method176(arg0 + arg5 - 1, arg1, arg3 - 2, true, arg6, arg4 + 1);
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IIIIB)V")
    public static void method173(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg0 < field632 || arg0 >= field633) {
            return;
        }
        if (arg1 < field634) {
            arg2 -= field634 - arg1;
            arg1 = field634;
        }
        if (arg1 + arg2 > field635) {
            arg2 = field635 - arg1;
        }
        int var5 = field630 * arg0 + arg1;
        if (arg4 == 59) {
            for (int var6 = 0; var6 < arg2; var6++) {
                field629[var5 + var6] = arg3;
            }
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IIIIIB)V")
    public static void method174(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        if (field625 != arg5) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        if (arg0 < field632 || arg0 >= field633) {
            return;
        }
        if (arg4 < field634) {
            arg2 -= field634 - arg4;
            arg4 = field634;
        }
        if (arg2 + arg4 > field635) {
            arg2 = field635 - arg4;
        }
        int var7 = 256 - arg1;
        int var8 = (arg3 >> 16 & 0xFF) * arg1;
        int var9 = (arg3 >> 8 & 0xFF) * arg1;
        int var10 = (arg3 & 0xFF) * arg1;
        int var11 = field630 * arg0 + arg4;
        for (int var12 = 0; var12 < arg2; var12++) {
            int var13 = (field629[var11] >> 16 & 0xFF) * var7;
            int var14 = (field629[var11] >> 8 & 0xFF) * var7;
            int var15 = (field629[var11] & 0xFF) * var7;
            int var16 = (var10 + var15 >> 8) + (var8 + var13 >> 8 << 16) + (var9 + var14 >> 8 << 8);
            field629[var11++] = var16;
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IIZII)V")
    public static void method175(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (arg4 < field634 || arg4 >= field635) {
            return;
        }
        if (arg0 < field632) {
            arg1 -= field632 - arg0;
            arg0 = field632;
        }
        if (arg0 + arg1 > field633) {
            arg1 = field633 - arg0;
        }
        int var5 = field630 * arg0 + arg4;
        if (arg2) {
            field624 = 345;
        }
        for (int var6 = 0; var6 < arg1; var6++) {
            field629[field630 * var6 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IIIZII)V")
    public static void method176(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (arg0 < field634 || arg0 >= field635) {
            return;
        }
        if (arg5 < field632) {
            arg2 -= field632 - arg5;
            arg5 = field632;
        }
        if (arg2 + arg5 > field633) {
            arg2 = field633 - arg5;
        }
        int var6 = 256 - arg4;
        int var7 = (arg1 >> 16 & 0xFF) * arg4;
        int var8 = (arg1 >> 8 & 0xFF) * arg4;
        int var9 = (arg1 & 0xFF) * arg4;
        if (!arg3) {
            for (int var10 = 1; var10 > 0; var10++) {
            }
        }
        int var11 = field630 * arg5 + arg0;
        for (int var12 = 0; var12 < arg2; var12++) {
            int var13 = (field629[var11] >> 16 & 0xFF) * var6;
            int var14 = (field629[var11] >> 8 & 0xFF) * var6;
            int var15 = (field629[var11] & 0xFF) * var6;
            int var16 = (var9 + var15 >> 8) + (var7 + var13 >> 8 << 16) + (var8 + var14 >> 8 << 8);
            field629[var11] = var16;
            var11 += field630;
        }
    }
}
