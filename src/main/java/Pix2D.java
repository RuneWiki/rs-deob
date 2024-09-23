import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gb")
public class Pix2D extends DoublyLinkable {

    @OriginalMember(owner = "gb", name = "j", descriptor = "Z")
    private static boolean field624 = true;

    @OriginalMember(owner = "gb", name = "k", descriptor = "Z")
    private static boolean field625 = true;

    @OriginalMember(owner = "gb", name = "l", descriptor = "I")
    private static int field626 = 755;

    @OriginalMember(owner = "gb", name = "i", descriptor = "I")
    private static int field623;

    @OriginalMember(owner = "gb", name = "n", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "gb", name = "o", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "gb", name = "p", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "gb", name = "q", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "gb", name = "r", descriptor = "I")
    public static int field632;

    @OriginalMember(owner = "gb", name = "s", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "gb", name = "t", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "gb", name = "u", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "gb", name = "v", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "gb", name = "w", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "gb", name = "m", descriptor = "[I")
    public static int[] field627;

    @OriginalMember(owner = "gb", name = "a", descriptor = "(II[II)V")
    public static void method152(int arg0, int arg1, int[] arg2, int arg3) {
        int var4 = 91 / arg3;
        field627 = arg2;
        field628 = arg1;
        field629 = arg0;
        method154(arg0, arg1, 0, -226, 0);
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(B)V")
    public static void method153(byte arg0) {
        field632 = 0;
        field630 = 0;
        field633 = field628;
        field631 = field629;
        if (arg0 == 3) {
            boolean var1 = false;
            field634 = field633 - 1;
            field635 = field633 / 2;
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IIIII)V")
    public static void method154(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = 0;
        }
        if (arg4 < 0) {
            arg4 = 0;
        }
        if (arg1 > field628) {
            arg1 = field628;
        }
        if (arg0 > field629) {
            arg0 = field629;
        }
        field632 = arg2;
        field630 = arg4;
        field633 = arg1;
        while (arg3 >= 0) {
            field623 = 137;
        }
        field631 = arg0;
        field634 = field633 - 1;
        field635 = field633 / 2;
        field636 = field631 / 2;
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(I)V")
    public static void method155(int arg0) {
        int var1 = field629 * field628;
        if (arg0 >= 4 && arg0 <= 4) {
            for (int var2 = 0; var2 < var1; var2++) {
                field627[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IIIIIII)V")
    public static void method156(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 < field632) {
            arg2 -= field632 - arg4;
            arg4 = field632;
        }
        if (arg5 < field630) {
            arg1 -= field630 - arg5;
            arg5 = field630;
        }
        if (arg2 + arg4 > field633) {
            arg2 = field633 - arg4;
        }
        if (arg1 + arg5 > field631) {
            arg1 = field631 - arg5;
        }
        int var7 = 256 - arg6;
        int var8 = (arg0 >> 16 & 0xFF) * arg6;
        int var9 = (arg0 >> 8 & 0xFF) * arg6;
        int var10 = (arg0 & 0xFF) * arg6;
        int var11 = 19 / arg3;
        int var12 = field628 - arg2;
        int var13 = field628 * arg5 + arg4;
        for (int var14 = 0; var14 < arg1; var14++) {
            for (int var15 = -arg2; var15 < 0; var15++) {
                int var16 = (field627[var13] >> 16 & 0xFF) * var7;
                int var17 = (field627[var13] >> 8 & 0xFF) * var7;
                int var18 = (field627[var13] & 0xFF) * var7;
                int var19 = (var10 + var18 >> 8) + (var8 + var16 >> 8 << 16) + (var9 + var17 >> 8 << 8);
                field627[var13++] = var19;
            }
            var13 += var12;
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IIIIIB)V")
    public static void method157(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        if (arg3 < field632) {
            arg2 -= field632 - arg3;
            arg3 = field632;
        }
        if (arg4 < field630) {
            arg1 -= field630 - arg4;
            arg4 = field630;
        }
        if (arg2 + arg3 > field633) {
            arg2 = field633 - arg3;
        }
        if (arg1 + arg4 > field631) {
            arg1 = field631 - arg4;
        }
        int var6 = field628 - arg2;
        int var7 = field628 * arg4 + arg3;
        for (int var8 = -arg1; var8 < 0; var8++) {
            for (int var9 = -arg2; var9 < 0; var9++) {
                field627[var7++] = arg0;
            }
            var7 += var6;
        }
        if (arg5 != 66) {
            field624 = !field624;
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IIIIII)V")
    public static void method158(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method160(arg5, arg2, arg1, arg3, 1);
        if (arg4 < 3 || arg4 > 3) {
            field624 = !field624;
        }
        method160(arg5, arg2, arg0 + arg1 - 1, arg3, 1);
        method162(arg5, 830, arg1, arg2, arg0);
        method162(arg3 + arg5 - 1, 830, arg1, arg2, arg0);
    }

    @OriginalMember(owner = "gb", name = "b", descriptor = "(IIIIIII)V")
    public static void method159(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        method161(arg3, arg5, arg6, arg0, arg4, (byte) 57);
        method161(arg3, arg5, arg6, arg0, arg1 + arg4 - 1, (byte) 57);
        if (arg2 != 0) {
            field624 = !field624;
        }
        if (arg1 >= 3) {
            method163(arg6, 0, arg5, arg4 + 1, arg1 - 2, arg3);
            method163(arg0 + arg6 - 1, 0, arg5, arg4 + 1, arg1 - 2, arg3);
        }
    }

    @OriginalMember(owner = "gb", name = "b", descriptor = "(IIIII)V")
    public static void method160(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < field630 || arg2 >= field631) {
            return;
        }
        if (arg0 < field632) {
            arg3 -= field632 - arg0;
            arg0 = field632;
        }
        if (arg0 + arg3 > field633) {
            arg3 = field633 - arg0;
        }
        int var5 = field628 * arg2 + arg0;
        if (arg4 != 1) {
            field625 = !field625;
        }
        for (int var6 = 0; var6 < arg3; var6++) {
            field627[var5 + var6] = arg1;
        }
    }

    @OriginalMember(owner = "gb", name = "b", descriptor = "(IIIIIB)V")
    public static void method161(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        if (arg4 < field630 || arg4 >= field631) {
            return;
        }
        if (arg2 < field632) {
            arg3 -= field632 - arg2;
            arg2 = field632;
        }
        if (arg2 + arg3 > field633) {
            arg3 = field633 - arg2;
        }
        int var6 = 256 - arg1;
        if (arg5 != 57) {
            field624 = !field624;
        }
        int var7 = (arg0 >> 16 & 0xFF) * arg1;
        int var8 = (arg0 >> 8 & 0xFF) * arg1;
        int var9 = (arg0 & 0xFF) * arg1;
        int var10 = field628 * arg4 + arg2;
        for (int var11 = 0; var11 < arg3; var11++) {
            int var12 = (field627[var10] >> 16 & 0xFF) * var6;
            int var13 = (field627[var10] >> 8 & 0xFF) * var6;
            int var14 = (field627[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field627[var10++] = var15;
        }
    }

    @OriginalMember(owner = "gb", name = "c", descriptor = "(IIIII)V")
    public static void method162(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 <= 0) {
            field624 = !field624;
        }
        if (arg0 < field632 || arg0 >= field633) {
            return;
        }
        if (arg2 < field630) {
            arg4 -= field630 - arg2;
            arg2 = field630;
        }
        if (arg2 + arg4 > field631) {
            arg4 = field631 - arg2;
        }
        int var5 = field628 * arg2 + arg0;
        for (int var6 = 0; var6 < arg4; var6++) {
            field627[field628 * var6 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "gb", name = "b", descriptor = "(IIIIII)V")
    public static void method163(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field632 || arg0 >= field633) {
            return;
        }
        if (arg3 < field630) {
            arg4 -= field630 - arg3;
            arg3 = field630;
        }
        if (arg3 + arg4 > field631) {
            arg4 = field631 - arg3;
        }
        int var6 = 256 - arg2;
        int var7 = (arg5 >> 16 & 0xFF) * arg2;
        int var8 = (arg5 >> 8 & 0xFF) * arg2;
        int var9 = (arg5 & 0xFF) * arg2;
        if (arg1 != 0) {
            return;
        }
        int var10 = field628 * arg3 + arg0;
        for (int var11 = 0; var11 < arg4; var11++) {
            int var12 = (field627[var10] >> 16 & 0xFF) * var6;
            int var13 = (field627[var10] >> 8 & 0xFF) * var6;
            int var14 = (field627[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field627[var10] = var15;
            var10 += field628;
        }
    }
}
