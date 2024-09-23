import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("hb")
public class Pix2D extends DoublyLinkable {

    @OriginalMember(owner = "hb", name = "h", descriptor = "I")
    private static int field627 = -258;

    @OriginalMember(owner = "hb", name = "i", descriptor = "I")
    private static int field628 = -39972;

    @OriginalMember(owner = "hb", name = "j", descriptor = "Z")
    private static boolean field629 = true;

    @OriginalMember(owner = "hb", name = "l", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "hb", name = "m", descriptor = "I")
    public static int field632;

    @OriginalMember(owner = "hb", name = "n", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "hb", name = "o", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "hb", name = "p", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "hb", name = "q", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "hb", name = "r", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "hb", name = "s", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "hb", name = "t", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "hb", name = "u", descriptor = "Z")
    public static boolean field640;

    @OriginalMember(owner = "hb", name = "k", descriptor = "[I")
    public static int[] field630;

    @OriginalMember(owner = "hb", name = "a", descriptor = "([IIII)V")
    public static void method164(int[] arg0, int arg1, int arg2, int arg3) {
        if (arg1 < 0) {
            field630 = arg0;
            field631 = arg2;
            field632 = arg3;
            method166(5, 0, arg2, arg3, 0);
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(Z)V")
    public static void method165(boolean arg0) {
        field635 = 0;
        if (!arg0) {
            return;
        }
        field633 = 0;
        field636 = field631;
        field634 = field632;
        field637 = field636 - 1;
        field638 = field636 / 2;
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IIIII)V")
    public static void method166(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 < 0) {
            arg4 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field631) {
            arg2 = field631;
        }
        if (arg3 > field632) {
            arg3 = field632;
        }
        field635 = arg4;
        field633 = arg1;
        field636 = arg2;
        field634 = arg3;
        if (arg0 < 5 || arg0 > 5) {
            field627 = -389;
        }
        field637 = field636 - 1;
        field638 = field636 / 2;
        field639 = field634 / 2;
    }

    @OriginalMember(owner = "hb", name = "b", descriptor = "(Z)V")
    public static void method167(boolean arg0) {
        int var1 = field632 * field631;
        if (arg0) {
            for (int var2 = 0; var2 < var1; var2++) {
                field630[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IIIIIII)V")
    public static void method168(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 < field635) {
            arg6 -= field635 - arg0;
            arg0 = field635;
        }
        if (arg2 < field633) {
            arg1 -= field633 - arg2;
            arg2 = field633;
        }
        if (arg0 + arg6 > field636) {
            arg6 = field636 - arg0;
        }
        if (arg1 + arg2 > field634) {
            arg1 = field634 - arg2;
        }
        int var7 = 256 - arg5;
        int var8 = (arg3 >> 16 & 0xFF) * arg5;
        int var9 = (arg3 >> 8 & 0xFF) * arg5;
        int var10 = (arg3 & 0xFF) * arg5;
        int var11 = field631 - arg6;
        if (arg4 != 7861) {
            return;
        }
        int var12 = field631 * arg2 + arg0;
        for (int var13 = 0; var13 < arg1; var13++) {
            for (int var14 = -arg6; var14 < 0; var14++) {
                int var15 = (field630[var12] >> 16 & 0xFF) * var7;
                int var16 = (field630[var12] >> 8 & 0xFF) * var7;
                int var17 = (field630[var12] & 0xFF) * var7;
                int var18 = (var10 + var17 >> 8) + (var8 + var15 >> 8 << 16) + (var9 + var16 >> 8 << 8);
                field630[var12++] = var18;
            }
            var12 += var11;
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IIIIII)V")
    public static void method169(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 < field635) {
            arg4 -= field635 - arg3;
            arg3 = field635;
        }
        if (arg1 < field633) {
            arg2 -= field633 - arg1;
            arg1 = field633;
        }
        if (arg3 + arg4 > field636) {
            arg4 = field636 - arg3;
        }
        if (arg1 + arg2 > field634) {
            arg2 = field634 - arg1;
        }
        int var6 = field631 - arg4;
        if (arg0 >= 0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        int var8 = field631 * arg1 + arg3;
        for (int var9 = -arg2; var9 < 0; var9++) {
            for (int var10 = -arg4; var10 < 0; var10++) {
                field630[var8++] = arg5;
            }
            var8 += var6;
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IIIIIZ)V")
    public static void method170(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (!arg5) {
            method172(arg2, arg3, arg0, 0, arg4);
            method172(arg1 + arg2 - 1, arg3, arg0, 0, arg4);
            method174(arg4, arg0, arg1, arg2, -463);
            method174(arg4, arg0 + arg3 - 1, arg1, arg2, -463);
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IIIIIZI)V")
    public static void method171(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        if (arg5) {
            return;
        }
        method173(arg4, arg2, arg3, arg0, arg1, true);
        method173(arg4, arg2 + arg6 - 1, arg3, arg0, arg1, true);
        if (arg6 >= 3) {
            method175(field628, arg1, arg4, arg6 - 2, arg3, arg2 + 1);
            method175(field628, arg0 + arg1 - 1, arg4, arg6 - 2, arg3, arg2 + 1);
        }
    }

    @OriginalMember(owner = "hb", name = "b", descriptor = "(IIIII)V")
    public static void method172(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != 0 || (arg0 < field633 || arg0 >= field634)) {
            return;
        }
        if (arg2 < field635) {
            arg1 -= field635 - arg2;
            arg2 = field635;
        }
        if (arg1 + arg2 > field636) {
            arg1 = field636 - arg2;
        }
        int var5 = field631 * arg0 + arg2;
        for (int var6 = 0; var6 < arg1; var6++) {
            field630[var5 + var6] = arg4;
        }
    }

    @OriginalMember(owner = "hb", name = "b", descriptor = "(IIIIIZ)V")
    public static void method173(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 < field633 || arg1 >= field634) {
            return;
        }
        if (arg4 < field635) {
            arg3 -= field635 - arg4;
            arg4 = field635;
        }
        if (arg3 + arg4 > field636) {
            arg3 = field636 - arg4;
        }
        int var6 = 256 - arg2;
        if (!arg5) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        int var8 = (arg0 >> 16 & 0xFF) * arg2;
        int var9 = (arg0 >> 8 & 0xFF) * arg2;
        int var10 = (arg0 & 0xFF) * arg2;
        int var11 = field631 * arg1 + arg4;
        for (int var12 = 0; var12 < arg3; var12++) {
            int var13 = (field630[var11] >> 16 & 0xFF) * var6;
            int var14 = (field630[var11] >> 8 & 0xFF) * var6;
            int var15 = (field630[var11] & 0xFF) * var6;
            int var16 = (var10 + var15 >> 8) + (var8 + var13 >> 8 << 16) + (var9 + var14 >> 8 << 8);
            field630[var11++] = var16;
        }
    }

    @OriginalMember(owner = "hb", name = "c", descriptor = "(IIIII)V")
    public static void method174(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field635 || arg1 >= field636) {
            return;
        }
        if (arg3 < field633) {
            arg2 -= field633 - arg3;
            arg3 = field633;
        }
        if (arg2 + arg3 > field634) {
            arg2 = field634 - arg3;
        }
        int var5 = field631 * arg3 + arg1;
        if (arg4 < 0) {
            for (int var6 = 0; var6 < arg2; var6++) {
                field630[field631 * var6 + var5] = arg0;
            }
        }
    }

    @OriginalMember(owner = "hb", name = "b", descriptor = "(IIIIII)V")
    public static void method175(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 < field635 || arg1 >= field636) {
            return;
        }
        if (arg5 < field633) {
            arg3 -= field633 - arg5;
            arg5 = field633;
        }
        if (arg3 + arg5 > field634) {
            arg3 = field634 - arg5;
        }
        int var6 = 256 - arg4;
        if (arg0 != -39972) {
            field629 = !field629;
        }
        int var7 = (arg2 >> 16 & 0xFF) * arg4;
        int var8 = (arg2 >> 8 & 0xFF) * arg4;
        int var9 = (arg2 & 0xFF) * arg4;
        int var10 = field631 * arg5 + arg1;
        for (int var11 = 0; var11 < arg3; var11++) {
            int var12 = (field630[var10] >> 16 & 0xFF) * var6;
            int var13 = (field630[var10] >> 8 & 0xFF) * var6;
            int var14 = (field630[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field630[var10] = var15;
            var10 += field631;
        }
    }
}
