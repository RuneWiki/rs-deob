import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("DSAVPBJG")
public class class11 extends class61 {

    @OriginalMember(owner = "DSAVPBJG", name = "i", descriptor = "I")
    private static int field642 = 24940;

    @OriginalMember(owner = "DSAVPBJG", name = "j", descriptor = "I")
    private static int field643 = 3;

    @OriginalMember(owner = "DSAVPBJG", name = "k", descriptor = "Z")
    private static boolean field644 = true;

    @OriginalMember(owner = "DSAVPBJG", name = "l", descriptor = "I")
    private static int field645 = 7;

    @OriginalMember(owner = "DSAVPBJG", name = "m", descriptor = "Z")
    private static boolean field646 = true;

    @OriginalMember(owner = "DSAVPBJG", name = "n", descriptor = "Z")
    private static boolean field647 = true;

    @OriginalMember(owner = "DSAVPBJG", name = "p", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "DSAVPBJG", name = "q", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "DSAVPBJG", name = "r", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "DSAVPBJG", name = "s", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "DSAVPBJG", name = "t", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "DSAVPBJG", name = "u", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "DSAVPBJG", name = "v", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "DSAVPBJG", name = "w", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "DSAVPBJG", name = "x", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "DSAVPBJG", name = "y", descriptor = "Z")
    public static boolean field658;

    @OriginalMember(owner = "DSAVPBJG", name = "o", descriptor = "[I")
    public static int[] field648;

    @OriginalMember(owner = "DSAVPBJG", name = "a", descriptor = "(I[III)V")
    public static void method191(int arg0, int[] arg1, int arg2, int arg3) {
        if (field642 == arg0) {
            field648 = arg1;
            field649 = arg2;
            field650 = arg3;
            method193(arg2, arg3, 0, 0, true);
        }
    }

    @OriginalMember(owner = "DSAVPBJG", name = "a", descriptor = "(B)V")
    public static void method192(byte arg0) {
        field653 = 0;
        field651 = 0;
        field654 = field649;
        field652 = field650;
        field655 = field654 - 1;
        if (arg0 == 36) {
            field656 = field654 / 2;
        }
    }

    @OriginalMember(owner = "DSAVPBJG", name = "a", descriptor = "(IIIIZ)V")
    public static void method193(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg2 < 0) {
            arg2 = 0;
        }
        if (arg3 < 0) {
            arg3 = 0;
        }
        if (arg0 > field649) {
            arg0 = field649;
        }
        if (arg1 > field650) {
            arg1 = field650;
        }
        field653 = arg2;
        field651 = arg3;
        if (!arg4) {
            field647 = !field647;
        }
        field654 = arg0;
        field652 = arg1;
        field655 = field654 - 1;
        field656 = field654 / 2;
        field657 = field652 / 2;
    }

    @OriginalMember(owner = "DSAVPBJG", name = "a", descriptor = "(I)V")
    public static void method194(int arg0) {
        if (arg0 != -27727) {
            field642 = 408;
        }
        int var1 = field650 * field649;
        for (int var2 = 0; var2 < var1; var2++) {
            field648[var2] = 0;
        }
    }

    @OriginalMember(owner = "DSAVPBJG", name = "a", descriptor = "(IIIIIII)V")
    public static void method195(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 < field653) {
            arg1 -= field653 - arg4;
            arg4 = field653;
        }
        if (arg2 < field651) {
            arg5 -= field651 - arg2;
            arg2 = field651;
        }
        if (arg1 + arg4 > field654) {
            arg1 = field654 - arg4;
        }
        if (arg2 + arg5 > field652) {
            arg5 = field652 - arg2;
        }
        int var7 = 256 - arg0;
        int var8 = (arg6 >> 16 & 0xFF) * arg0;
        int var9 = (arg6 >> 8 & 0xFF) * arg0;
        int var10 = (arg6 & 0xFF) * arg0;
        int var11 = field649 - arg1;
        int var12 = field649 * arg2 + arg4;
        while (arg3 >= 0) {
            field647 = !field647;
        }
        for (int var13 = 0; var13 < arg5; var13++) {
            for (int var14 = -arg1; var14 < 0; var14++) {
                int var15 = (field648[var12] >> 16 & 0xFF) * var7;
                int var16 = (field648[var12] >> 8 & 0xFF) * var7;
                int var17 = (field648[var12] & 0xFF) * var7;
                int var18 = (var10 + var17 >> 8) + (var8 + var15 >> 8 << 16) + (var9 + var16 >> 8 << 8);
                field648[var12++] = var18;
            }
            var12 += var11;
        }
    }

    @OriginalMember(owner = "DSAVPBJG", name = "a", descriptor = "(IIIIII)V")
    public static void method196(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field643 != arg5) {
            field646 = !field646;
        }
        if (arg1 < field653) {
            arg2 -= field653 - arg1;
            arg1 = field653;
        }
        if (arg4 < field651) {
            arg3 -= field651 - arg4;
            arg4 = field651;
        }
        if (arg1 + arg2 > field654) {
            arg2 = field654 - arg1;
        }
        if (arg3 + arg4 > field652) {
            arg3 = field652 - arg4;
        }
        int var6 = field649 - arg2;
        int var7 = field649 * arg4 + arg1;
        for (int var8 = -arg3; var8 < 0; var8++) {
            for (int var9 = -arg2; var9 < 0; var9++) {
                field648[var7++] = arg0;
            }
            var7 += var6;
        }
    }

    @OriginalMember(owner = "DSAVPBJG", name = "a", descriptor = "(IIIIBI)V")
    public static void method197(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        method199(arg5, arg2, arg0, 0, arg1);
        if (arg4 != -19) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        method199(arg5, arg2, arg0 + arg3 - 1, 0, arg1);
        method201(arg2, arg3, arg0, arg5, (byte) 1);
        method201(arg1 + arg2 - 1, arg3, arg0, arg5, (byte) 1);
    }

    @OriginalMember(owner = "DSAVPBJG", name = "b", descriptor = "(IIIIIII)V")
    public static void method198(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        method200(arg4, true, arg1, arg6, arg3, arg2);
        method200(arg4, true, arg1 + arg5 - 1, arg6, arg3, arg2);
        while (arg0 >= 0) {
            field643 = -196;
        }
        if (arg5 >= 3) {
            method202(arg1 + 1, arg3, arg5 - 2, 7, arg4, arg6);
            method202(arg1 + 1, arg2 + arg3 - 1, arg5 - 2, 7, arg4, arg6);
        }
    }

    @OriginalMember(owner = "DSAVPBJG", name = "a", descriptor = "(IIIII)V")
    public static void method199(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < field651 || arg2 >= field652) {
            return;
        }
        if (arg1 < field653) {
            arg4 -= field653 - arg1;
            arg1 = field653;
        }
        if (arg1 + arg4 > field654) {
            arg4 = field654 - arg1;
        }
        int var5 = field649 * arg2 + arg1;
        if (arg3 == 0) {
            for (int var6 = 0; var6 < arg4; var6++) {
                field648[var5 + var6] = arg0;
            }
        }
    }

    @OriginalMember(owner = "DSAVPBJG", name = "a", descriptor = "(IZIIII)V")
    public static void method200(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 < field651 || arg2 >= field652) {
            return;
        }
        if (arg4 < field653) {
            arg5 -= field653 - arg4;
            arg4 = field653;
        }
        if (arg4 + arg5 > field654) {
            arg5 = field654 - arg4;
        }
        int var6 = 256 - arg3;
        int var7 = (arg0 >> 16 & 0xFF) * arg3;
        int var8 = (arg0 >> 8 & 0xFF) * arg3;
        int var9 = (arg0 & 0xFF) * arg3;
        if (!arg1) {
            for (int var10 = 1; var10 > 0; var10++) {
            }
        }
        int var11 = field649 * arg2 + arg4;
        for (int var12 = 0; var12 < arg5; var12++) {
            int var13 = (field648[var11] >> 16 & 0xFF) * var6;
            int var14 = (field648[var11] >> 8 & 0xFF) * var6;
            int var15 = (field648[var11] & 0xFF) * var6;
            int var16 = (var9 + var15 >> 8) + (var7 + var13 >> 8 << 16) + (var8 + var14 >> 8 << 8);
            field648[var11++] = var16;
        }
    }

    @OriginalMember(owner = "DSAVPBJG", name = "a", descriptor = "(IIIIB)V")
    public static void method201(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 != 1) {
            field647 = !field647;
        }
        if (arg0 < field653 || arg0 >= field654) {
            return;
        }
        if (arg2 < field651) {
            arg1 -= field651 - arg2;
            arg2 = field651;
        }
        if (arg1 + arg2 > field652) {
            arg1 = field652 - arg2;
        }
        int var5 = field649 * arg2 + arg0;
        for (int var6 = 0; var6 < arg1; var6++) {
            field648[field649 * var6 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "DSAVPBJG", name = "b", descriptor = "(IIIIII)V")
    public static void method202(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 < field653 || arg1 >= field654) {
            return;
        }
        if (arg0 < field651) {
            arg2 -= field651 - arg0;
            arg0 = field651;
        }
        if (arg0 + arg2 > field652) {
            arg2 = field652 - arg0;
        }
        int var6 = 256 - arg5;
        int var7 = (arg4 >> 16 & 0xFF) * arg5;
        int var8 = (arg4 >> 8 & 0xFF) * arg5;
        int var9 = (arg4 & 0xFF) * arg5;
        if (field645 != arg3) {
            return;
        }
        int var10 = field649 * arg0 + arg1;
        for (int var11 = 0; var11 < arg2; var11++) {
            int var12 = (field648[var10] >> 16 & 0xFF) * var6;
            int var13 = (field648[var10] >> 8 & 0xFF) * var6;
            int var14 = (field648[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field648[var10] = var15;
            var10 += field649;
        }
    }
}
