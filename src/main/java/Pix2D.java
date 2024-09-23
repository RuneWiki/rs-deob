import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("hb")
public class Pix2D extends DoublyLinkable {

    @OriginalMember(owner = "hb", name = "k", descriptor = "I")
    private static int field625 = 7;

    @OriginalMember(owner = "hb", name = "l", descriptor = "Z")
    private static boolean field626 = true;

    @OriginalMember(owner = "hb", name = "j", descriptor = "I")
    private static int field624;

    @OriginalMember(owner = "hb", name = "n", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "hb", name = "o", descriptor = "I")
    public static int field629;

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

    @OriginalMember(owner = "hb", name = "i", descriptor = "Z")
    private static boolean field623;

    @OriginalMember(owner = "hb", name = "m", descriptor = "[I")
    public static int[] field627;

    @OriginalMember(owner = "hb", name = "a", descriptor = "(I[IIZ)V")
    public static void method165(int arg0, int[] arg1, int arg2, boolean arg3) {
        field627 = arg1;
        field628 = arg2;
        if (arg3) {
            field629 = arg0;
            method167(0, 0, arg0, 0, arg2);
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(Z)V")
    public static void method166(boolean arg0) {
        if (arg0) {
            for (int var1 = 1; var1 > 0; var1++) {
            }
        }
        field632 = 0;
        field630 = 0;
        field633 = field628;
        field631 = field629;
        field634 = field633 - 1;
        field635 = field633 / 2;
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IIIII)V")
    public static void method167(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != 0) {
            field623 = !field623;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg4 > field628) {
            arg4 = field628;
        }
        if (arg2 > field629) {
            arg2 = field629;
        }
        field632 = arg1;
        field630 = arg0;
        field633 = arg4;
        field631 = arg2;
        field634 = field633 - 1;
        field635 = field633 / 2;
        field636 = field631 / 2;
    }

    @OriginalMember(owner = "hb", name = "b", descriptor = "(Z)V")
    public static void method168(boolean arg0) {
        if (arg0) {
            field626 = !field626;
        }
        int var1 = field629 * field628;
        for (int var2 = 0; var2 < var1; var2++) {
            field627[var2] = 0;
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IIIIIII)V")
    public static void method169(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < field632) {
            arg6 -= field632 - arg2;
            arg2 = field632;
        }
        if (arg4 < field630) {
            arg3 -= field630 - arg4;
            arg4 = field630;
        }
        if (arg2 + arg6 > field633) {
            arg6 = field633 - arg2;
        }
        if (arg3 + arg4 > field631) {
            arg3 = field631 - arg4;
        }
        int var7 = 256 - arg0;
        int var8 = (arg5 >> 16 & 0xFF) * arg0;
        int var9 = (arg5 >> 8 & 0xFF) * arg0;
        int var10 = (arg5 & 0xFF) * arg0;
        int var11 = field628 - arg6;
        int var12 = field628 * arg4 + arg2;
        if (field624 != arg1) {
            return;
        }
        for (int var13 = 0; var13 < arg3; var13++) {
            for (int var14 = -arg6; var14 < 0; var14++) {
                int var15 = (field627[var12] >> 16 & 0xFF) * var7;
                int var16 = (field627[var12] >> 8 & 0xFF) * var7;
                int var17 = (field627[var12] & 0xFF) * var7;
                int var18 = (var10 + var17 >> 8) + (var8 + var15 >> 8 << 16) + (var9 + var16 >> 8 << 8);
                field627[var12++] = var18;
            }
            var12 += var11;
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IIIIII)V")
    public static void method170(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 < field632) {
            arg2 -= field632 - arg5;
            arg5 = field632;
        }
        if (arg3 < field630) {
            arg4 -= field630 - arg3;
            arg3 = field630;
        }
        if (arg2 + arg5 > field633) {
            arg2 = field633 - arg5;
        }
        if (arg3 + arg4 > field631) {
            arg4 = field631 - arg3;
        }
        int var6 = field628 - arg2;
        int var7 = field628 * arg3 + arg5;
        for (int var8 = -arg4; var8 < 0; var8++) {
            for (int var9 = -arg2; var9 < 0; var9++) {
                field627[var7++] = arg1;
            }
            var7 += var6;
        }
        if (arg0 == 33027) {
            ;
        }
    }

    @OriginalMember(owner = "hb", name = "b", descriptor = "(IIIIII)V")
    public static void method171(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method173(arg5, arg1, -25370, arg3, arg2);
        if (arg4 == 2) {
            method173(arg5, arg0 + arg1 - 1, -25370, arg3, arg2);
            method175(field625, arg0, arg2, arg1, arg5);
            method175(field625, arg0, arg2 + arg3 - 1, arg1, arg5);
        }
    }

    @OriginalMember(owner = "hb", name = "b", descriptor = "(IIIIIII)V")
    public static void method172(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        method174(arg0, 3, arg5, arg2, arg3, arg6);
        if (arg4 != 0) {
            field623 = !field623;
        }
        method174(arg0, 3, arg5, arg2, arg1 + arg3 - 1, arg6);
        if (arg1 >= 3) {
            method176(arg2, arg0, arg5, (byte) 9, arg3 + 1, arg1 - 2);
            method176(arg2, arg0 + arg6 - 1, arg5, (byte) 9, arg3 + 1, arg1 - 2);
        }
    }

    @OriginalMember(owner = "hb", name = "b", descriptor = "(IIIII)V")
    public static void method173(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field630 || arg1 >= field631) {
            return;
        }
        if (arg4 < field632) {
            arg3 -= field632 - arg4;
            arg4 = field632;
        }
        if (arg3 + arg4 > field633) {
            arg3 = field633 - arg4;
        }
        int var5 = field628 * arg1 + arg4;
        if (arg2 != -25370) {
            field626 = !field626;
        }
        for (int var6 = 0; var6 < arg3; var6++) {
            field627[var5 + var6] = arg0;
        }
    }

    @OriginalMember(owner = "hb", name = "c", descriptor = "(IIIIII)V")
    public static void method174(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 < field630 || arg4 >= field631) {
            return;
        }
        if (arg0 < field632) {
            arg5 -= field632 - arg0;
            arg0 = field632;
        }
        if (arg0 + arg5 > field633) {
            arg5 = field633 - arg0;
        }
        int var6 = 256 - arg2;
        int var7 = (arg3 >> 16 & 0xFF) * arg2;
        int var8 = (arg3 >> 8 & 0xFF) * arg2;
        int var9 = (arg3 & 0xFF) * arg2;
        if (arg1 < 3 || arg1 > 3) {
            return;
        }
        int var10 = field628 * arg4 + arg0;
        for (int var11 = 0; var11 < arg5; var11++) {
            int var12 = (field627[var10] >> 16 & 0xFF) * var6;
            int var13 = (field627[var10] >> 8 & 0xFF) * var6;
            int var14 = (field627[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field627[var10++] = var15;
        }
    }

    @OriginalMember(owner = "hb", name = "c", descriptor = "(IIIII)V")
    public static void method175(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < 7 || arg0 > 7 || (arg2 < field632 || arg2 >= field633)) {
            return;
        }
        if (arg3 < field630) {
            arg1 -= field630 - arg3;
            arg3 = field630;
        }
        if (arg1 + arg3 > field631) {
            arg1 = field631 - arg3;
        }
        int var5 = field628 * arg3 + arg2;
        for (int var6 = 0; var6 < arg1; var6++) {
            field627[field628 * var6 + var5] = arg4;
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IIIBII)V")
    public static void method176(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        if (arg1 < field632 || arg1 >= field633) {
            return;
        }
        if (arg4 < field630) {
            arg5 -= field630 - arg4;
            arg4 = field630;
        }
        if (arg4 + arg5 > field631) {
            arg5 = field631 - arg4;
        }
        int var6 = 256 - arg2;
        int var7 = (arg0 >> 16 & 0xFF) * arg2;
        int var8 = (arg0 >> 8 & 0xFF) * arg2;
        int var9 = (arg0 & 0xFF) * arg2;
        int var10 = field628 * arg4 + arg1;
        for (int var11 = 0; var11 < arg5; var11++) {
            int var14 = (field627[var10] >> 16 & 0xFF) * var6;
            int var15 = (field627[var10] >> 8 & 0xFF) * var6;
            int var16 = (field627[var10] & 0xFF) * var6;
            int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
            field627[var10] = var17;
            var10 += field628;
        }
        if (arg3 == 9) {
            boolean var12 = false;
        } else {
            for (int var13 = 1; var13 > 0; var13++) {
            }
        }
    }
}
