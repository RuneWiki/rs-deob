import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("IGZZCJOU")
public class class24 extends class27 {

    @OriginalMember(owner = "IGZZCJOU", name = "i", descriptor = "I")
    private static int field893 = -774;

    @OriginalMember(owner = "IGZZCJOU", name = "j", descriptor = "Z")
    private static boolean field894 = true;

    @OriginalMember(owner = "IGZZCJOU", name = "k", descriptor = "I")
    private static int field895 = 6;

    @OriginalMember(owner = "IGZZCJOU", name = "l", descriptor = "Z")
    private static boolean field896 = true;

    @OriginalMember(owner = "IGZZCJOU", name = "n", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "IGZZCJOU", name = "o", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "IGZZCJOU", name = "p", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "IGZZCJOU", name = "q", descriptor = "I")
    public static int field901;

    @OriginalMember(owner = "IGZZCJOU", name = "r", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "IGZZCJOU", name = "s", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "IGZZCJOU", name = "t", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "IGZZCJOU", name = "u", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "IGZZCJOU", name = "v", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "IGZZCJOU", name = "w", descriptor = "Z")
    public static boolean field907;

    @OriginalMember(owner = "IGZZCJOU", name = "m", descriptor = "[I")
    public static int[] field897;

    @OriginalMember(owner = "IGZZCJOU", name = "a", descriptor = "([IBII)V")
    public static void method240(int[] arg0, byte arg1, int arg2, int arg3) {
        field897 = arg0;
        field898 = arg2;
        field899 = arg3;
        method242((byte) -90, 0, arg3, 0, arg2);
        if (arg1 != 4) {
            field896 = !field896;
        }
    }

    @OriginalMember(owner = "IGZZCJOU", name = "a", descriptor = "(I)V")
    public static void method241(int arg0) {
        if (arg0 >= 0) {
            return;
        }
        field902 = 0;
        field900 = 0;
        field903 = field898;
        field901 = field899;
        field904 = field903 - 1;
        field905 = field903 / 2;
    }

    @OriginalMember(owner = "IGZZCJOU", name = "a", descriptor = "(BIIII)V")
    public static void method242(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg3 < 0) {
            arg3 = 0;
        }
        if (arg4 > field898) {
            arg4 = field898;
        }
        if (arg2 > field899) {
            arg2 = field899;
        }
        field902 = arg1;
        field900 = arg3;
        field903 = arg4;
        field901 = arg2;
        if (arg0 == -90) {
            field904 = field903 - 1;
            field905 = field903 / 2;
            field906 = field901 / 2;
        }
    }

    @OriginalMember(owner = "IGZZCJOU", name = "a", descriptor = "(B)V")
    public static void method243(byte arg0) {
        if (arg0 != -107) {
            field894 = !field894;
        }
        int var1 = field899 * field898;
        for (int var2 = 0; var2 < var1; var2++) {
            field897[var2] = 0;
        }
    }

    @OriginalMember(owner = "IGZZCJOU", name = "a", descriptor = "(IIIIIII)V")
    public static void method244(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 < field902) {
            arg4 -= field902 - arg1;
            arg1 = field902;
        }
        if (arg6 < field900) {
            arg5 -= field900 - arg6;
            arg6 = field900;
        }
        if (arg1 + arg4 > field903) {
            arg4 = field903 - arg1;
        }
        if (arg5 + arg6 > field901) {
            arg5 = field901 - arg6;
        }
        int var7 = 256 - arg2;
        int var8 = (arg0 >> 16 & 0xFF) * arg2;
        int var9 = (arg0 >> 8 & 0xFF) * arg2;
        int var10 = (arg0 & 0xFF) * arg2;
        int var11 = field898 - arg4;
        if (arg3 >= 0) {
            field895 = -255;
        }
        int var12 = field898 * arg6 + arg1;
        for (int var13 = 0; var13 < arg5; var13++) {
            for (int var14 = -arg4; var14 < 0; var14++) {
                int var15 = (field897[var12] >> 16 & 0xFF) * var7;
                int var16 = (field897[var12] >> 8 & 0xFF) * var7;
                int var17 = (field897[var12] & 0xFF) * var7;
                int var18 = (var10 + var17 >> 8) + (var8 + var15 >> 8 << 16) + (var9 + var16 >> 8 << 8);
                field897[var12++] = var18;
            }
            var12 += var11;
        }
    }

    @OriginalMember(owner = "IGZZCJOU", name = "a", descriptor = "(IIIZII)V")
    public static void method245(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (arg2 < field902) {
            arg4 -= field902 - arg2;
            arg2 = field902;
        }
        if (arg0 < field900) {
            arg5 -= field900 - arg0;
            arg0 = field900;
        }
        if (arg2 + arg4 > field903) {
            arg4 = field903 - arg2;
        }
        if (arg0 + arg5 > field901) {
            arg5 = field901 - arg0;
        }
        int var6 = field898 - arg4;
        int var7 = field898 * arg0 + arg2;
        for (int var8 = -arg5; var8 < 0; var8++) {
            for (int var10 = -arg4; var10 < 0; var10++) {
                field897[var7++] = arg1;
            }
            var7 += var6;
        }
        if (arg3) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
    }

    @OriginalMember(owner = "IGZZCJOU", name = "a", descriptor = "(ZIIIII)V")
    public static void method246(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method248(arg1, arg2, arg3, arg4, false);
        if (!arg0) {
            method248(arg1, arg2 + arg5 - 1, arg3, arg4, false);
            method250(arg5, arg2, arg1, arg4, -72);
            method250(arg5, arg2, arg1, arg3 + arg4 - 1, -72);
        }
    }

    @OriginalMember(owner = "IGZZCJOU", name = "a", descriptor = "(IIZIIII)V")
    public static void method247(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        method249(arg5, arg3, arg0, arg4, arg1, true);
        if (arg2) {
            field894 = !field894;
        }
        method249(arg5, arg3, arg0, arg4, arg1 + arg6 - 1, true);
        if (arg6 >= 3) {
            method251(arg6 - 2, arg3, arg1 + 1, arg4, arg0, (byte) 5);
            method251(arg6 - 2, arg3, arg1 + 1, arg4 + arg5 - 1, arg0, (byte) 5);
        }
    }

    @OriginalMember(owner = "IGZZCJOU", name = "a", descriptor = "(IIIIZ)V")
    public static void method248(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg1 < field900 || arg1 >= field901) {
            return;
        }
        if (arg3 < field902) {
            arg2 -= field902 - arg3;
            arg3 = field902;
        }
        if (arg2 + arg3 > field903) {
            arg2 = field903 - arg3;
        }
        int var5 = field898 * arg1 + arg3;
        if (arg4) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        for (int var7 = 0; var7 < arg2; var7++) {
            field897[var5 + var7] = arg0;
        }
    }

    @OriginalMember(owner = "IGZZCJOU", name = "a", descriptor = "(IIIIIZ)V")
    public static void method249(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg4 < field900 || arg4 >= field901) {
            return;
        }
        if (arg3 < field902) {
            arg0 -= field902 - arg3;
            arg3 = field902;
        }
        if (arg0 + arg3 > field903) {
            arg0 = field903 - arg3;
        }
        int var6 = 256 - arg2;
        if (!arg5) {
            field894 = !field894;
        }
        int var7 = (arg1 >> 16 & 0xFF) * arg2;
        int var8 = (arg1 >> 8 & 0xFF) * arg2;
        int var9 = (arg1 & 0xFF) * arg2;
        int var10 = field898 * arg4 + arg3;
        for (int var11 = 0; var11 < arg0; var11++) {
            int var12 = (field897[var10] >> 16 & 0xFF) * var6;
            int var13 = (field897[var10] >> 8 & 0xFF) * var6;
            int var14 = (field897[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field897[var10++] = var15;
        }
    }

    @OriginalMember(owner = "IGZZCJOU", name = "a", descriptor = "(IIIII)V")
    public static void method250(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 >= 0 || (arg3 < field902 || arg3 >= field903)) {
            return;
        }
        if (arg1 < field900) {
            arg0 -= field900 - arg1;
            arg1 = field900;
        }
        if (arg0 + arg1 > field901) {
            arg0 = field901 - arg1;
        }
        int var5 = field898 * arg1 + arg3;
        for (int var6 = 0; var6 < arg0; var6++) {
            field897[field898 * var6 + var5] = arg2;
        }
    }

    @OriginalMember(owner = "IGZZCJOU", name = "a", descriptor = "(IIIIIB)V")
    public static void method251(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        if (arg3 < field902 || arg3 >= field903) {
            return;
        }
        if (arg2 < field900) {
            arg0 -= field900 - arg2;
            arg2 = field900;
        }
        if (arg0 + arg2 > field901) {
            arg0 = field901 - arg2;
        }
        int var6 = 256 - arg4;
        int var7 = (arg1 >> 16 & 0xFF) * arg4;
        int var8 = (arg1 >> 8 & 0xFF) * arg4;
        int var9 = (arg1 & 0xFF) * arg4;
        int var10 = field898 * arg2 + arg3;
        if (arg5 != 5) {
            field894 = !field894;
        }
        for (int var11 = 0; var11 < arg0; var11++) {
            int var12 = (field897[var10] >> 16 & 0xFF) * var6;
            int var13 = (field897[var10] >> 8 & 0xFF) * var6;
            int var14 = (field897[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field897[var10] = var15;
            var10 += field898;
        }
    }
}
