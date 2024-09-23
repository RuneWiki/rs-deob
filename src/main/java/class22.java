import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("HQRNTLRZ")
public class class22 extends class30 {

    @OriginalMember(owner = "HQRNTLRZ", name = "i", descriptor = "I")
    private static int field834 = -378;

    @OriginalMember(owner = "HQRNTLRZ", name = "j", descriptor = "I")
    private static int field835 = 5;

    @OriginalMember(owner = "HQRNTLRZ", name = "l", descriptor = "I")
    private static int field837 = -965;

    @OriginalMember(owner = "HQRNTLRZ", name = "k", descriptor = "I")
    private static int field836;

    @OriginalMember(owner = "HQRNTLRZ", name = "p", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "HQRNTLRZ", name = "q", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "HQRNTLRZ", name = "r", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "HQRNTLRZ", name = "s", descriptor = "I")
    public static int field844;

    @OriginalMember(owner = "HQRNTLRZ", name = "t", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "HQRNTLRZ", name = "u", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "HQRNTLRZ", name = "v", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "HQRNTLRZ", name = "w", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "HQRNTLRZ", name = "x", descriptor = "I")
    public static int field849;

    @OriginalMember(owner = "HQRNTLRZ", name = "m", descriptor = "Z")
    private static boolean field838;

    @OriginalMember(owner = "HQRNTLRZ", name = "n", descriptor = "Z")
    private static boolean field839;

    @OriginalMember(owner = "HQRNTLRZ", name = "y", descriptor = "Z")
    public static boolean field850;

    @OriginalMember(owner = "HQRNTLRZ", name = "o", descriptor = "[I")
    public static int[] field840;

    @OriginalMember(owner = "HQRNTLRZ", name = "a", descriptor = "(BI[II)V")
    public static void method279(byte arg0, int arg1, int[] arg2, int arg3) {
        if (arg0 != 86) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        field840 = arg2;
        field841 = arg1;
        field842 = arg3;
        method281(true, 0, 0, arg1, arg3);
    }

    @OriginalMember(owner = "HQRNTLRZ", name = "a", descriptor = "(I)V")
    public static void method280(int arg0) {
        if (arg0 >= 0) {
            field838 = !field838;
        }
        field845 = 0;
        field843 = 0;
        field846 = field841;
        field844 = field842;
        field847 = field846 - 1;
        field848 = field846 / 2;
    }

    @OriginalMember(owner = "HQRNTLRZ", name = "a", descriptor = "(ZIIII)V")
    public static void method281(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 < 0) {
            arg2 = 0;
        }
        if (arg3 > field841) {
            arg3 = field841;
        }
        if (arg4 > field842) {
            arg4 = field842;
        }
        field845 = arg1;
        field843 = arg2;
        field846 = arg3;
        if (!arg0) {
            field837 = 222;
        }
        field844 = arg4;
        field847 = field846 - 1;
        field848 = field846 / 2;
        field849 = field844 / 2;
    }

    @OriginalMember(owner = "HQRNTLRZ", name = "b", descriptor = "(I)V")
    public static void method282(int arg0) {
        int var1 = field842 * field841;
        if (arg0 != 5) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        for (int var3 = 0; var3 < var1; var3++) {
            field840[var3] = 0;
        }
    }

    @OriginalMember(owner = "HQRNTLRZ", name = "a", descriptor = "(IIIIIII)V")
    public static void method283(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 < field845) {
            arg1 -= field845 - arg5;
            arg5 = field845;
        }
        if (arg3 < field843) {
            arg6 -= field843 - arg3;
            arg3 = field843;
        }
        if (arg1 + arg5 > field846) {
            arg1 = field846 - arg5;
        }
        if (arg3 + arg6 > field844) {
            arg6 = field844 - arg3;
        }
        int var7 = 256 - arg4;
        int var8 = (arg0 >> 16 & 0xFF) * arg4;
        int var9 = (arg0 >> 8 & 0xFF) * arg4;
        int var10 = (arg0 & 0xFF) * arg4;
        int var11 = field841 - arg1;
        if (arg2 >= 0) {
            field839 = !field839;
        }
        int var12 = field841 * arg3 + arg5;
        for (int var13 = 0; var13 < arg6; var13++) {
            for (int var14 = -arg1; var14 < 0; var14++) {
                int var15 = (field840[var12] >> 16 & 0xFF) * var7;
                int var16 = (field840[var12] >> 8 & 0xFF) * var7;
                int var17 = (field840[var12] & 0xFF) * var7;
                int var18 = (var10 + var17 >> 8) + (var8 + var15 >> 8 << 16) + (var9 + var16 >> 8 << 8);
                field840[var12++] = var18;
            }
            var12 += var11;
        }
    }

    @OriginalMember(owner = "HQRNTLRZ", name = "a", descriptor = "(IIIIII)V")
    public static void method284(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 != 47782) {
            field838 = !field838;
        }
        if (arg0 < field845) {
            arg3 -= field845 - arg0;
            arg0 = field845;
        }
        if (arg1 < field843) {
            arg5 -= field843 - arg1;
            arg1 = field843;
        }
        if (arg0 + arg3 > field846) {
            arg3 = field846 - arg0;
        }
        if (arg1 + arg5 > field844) {
            arg5 = field844 - arg1;
        }
        int var6 = field841 - arg3;
        int var7 = field841 * arg1 + arg0;
        for (int var8 = -arg5; var8 < 0; var8++) {
            for (int var9 = -arg3; var9 < 0; var9++) {
                field840[var7++] = arg2;
            }
            var7 += var6;
        }
    }

    @OriginalMember(owner = "HQRNTLRZ", name = "b", descriptor = "(IIIIII)V")
    public static void method285(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 != -1086) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        method287(arg1, arg5, -166, arg3, arg2);
        method287(arg1, arg0 + arg5 - 1, -166, arg3, arg2);
        method289(11909, arg2, arg1, arg5, arg0);
        method289(11909, arg2 + arg3 - 1, arg1, arg5, arg0);
    }

    @OriginalMember(owner = "HQRNTLRZ", name = "b", descriptor = "(IIIIIII)V")
    public static void method286(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field835 != arg0) {
            return;
        }
        method288(arg4, arg2, arg3, arg5, arg6, 0);
        method288(arg4, arg2, arg3, arg1 + arg5 - 1, arg6, 0);
        if (arg1 >= 3) {
            method290(arg1 - 2, arg6, (byte) 8, arg5 + 1, arg2, arg3);
            method290(arg1 - 2, arg4 + arg6 - 1, (byte) 8, arg5 + 1, arg2, arg3);
        }
    }

    @OriginalMember(owner = "HQRNTLRZ", name = "a", descriptor = "(IIIII)V")
    public static void method287(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field843 || arg1 >= field844) {
            return;
        }
        if (arg4 < field845) {
            arg3 -= field845 - arg4;
            arg4 = field845;
        }
        if (arg3 + arg4 > field846) {
            arg3 = field846 - arg4;
        }
        int var5 = field841 * arg1 + arg4;
        if (arg2 == -166) {
            for (int var6 = 0; var6 < arg3; var6++) {
                field840[var5 + var6] = arg0;
            }
        }
    }

    @OriginalMember(owner = "HQRNTLRZ", name = "c", descriptor = "(IIIIII)V")
    public static void method288(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 < field843 || arg3 >= field844) {
            return;
        }
        if (arg4 < field845) {
            arg0 -= field845 - arg4;
            arg4 = field845;
        }
        if (arg0 + arg4 > field846) {
            arg0 = field846 - arg4;
        }
        int var6 = 256 - arg2;
        int var7 = (arg1 >> 16 & 0xFF) * arg2;
        int var8 = (arg1 >> 8 & 0xFF) * arg2;
        int var9 = (arg1 & 0xFF) * arg2;
        if (arg5 != 0) {
            field836 = 274;
        }
        int var10 = field841 * arg3 + arg4;
        for (int var11 = 0; var11 < arg0; var11++) {
            int var12 = (field840[var10] >> 16 & 0xFF) * var6;
            int var13 = (field840[var10] >> 8 & 0xFF) * var6;
            int var14 = (field840[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field840[var10++] = var15;
        }
    }

    @OriginalMember(owner = "HQRNTLRZ", name = "b", descriptor = "(IIIII)V")
    public static void method289(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field845 || arg1 >= field846) {
            return;
        }
        if (arg3 < field843) {
            arg4 -= field843 - arg3;
            arg3 = field843;
        }
        if (arg3 + arg4 > field844) {
            arg4 = field844 - arg3;
        }
        int var5 = field841 * arg3 + arg1;
        if (arg0 != 11909) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        for (int var7 = 0; var7 < arg4; var7++) {
            field840[field841 * var7 + var5] = arg2;
        }
    }

    @OriginalMember(owner = "HQRNTLRZ", name = "a", descriptor = "(IIBIII)V")
    public static void method290(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        if (arg1 < field845 || arg1 >= field846) {
            return;
        }
        if (arg3 < field843) {
            arg0 -= field843 - arg3;
            arg3 = field843;
        }
        if (arg0 + arg3 > field844) {
            arg0 = field844 - arg3;
        }
        int var6 = 256 - arg5;
        int var7 = (arg4 >> 16 & 0xFF) * arg5;
        int var8 = (arg4 >> 8 & 0xFF) * arg5;
        int var9 = (arg4 & 0xFF) * arg5;
        int var10 = field841 * arg3 + arg1;
        if (arg2 == 8) {
            boolean var11 = false;
        } else {
            for (int var12 = 1; var12 > 0; var12++) {
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var14 = (field840[var10] >> 16 & 0xFF) * var6;
            int var15 = (field840[var10] >> 8 & 0xFF) * var6;
            int var16 = (field840[var10] & 0xFF) * var6;
            int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
            field840[var10] = var17;
            var10 += field841;
        }
    }
}
