import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("JNJDBENA")
public class class20 extends class33 {

    @OriginalMember(owner = "JNJDBENA", name = "i", descriptor = "I")
    private static int field928 = 6;

    @OriginalMember(owner = "JNJDBENA", name = "j", descriptor = "I")
    private static int field929 = -575;

    @OriginalMember(owner = "JNJDBENA", name = "n", descriptor = "I")
    public static int field933;

    @OriginalMember(owner = "JNJDBENA", name = "o", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "JNJDBENA", name = "p", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "JNJDBENA", name = "q", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "JNJDBENA", name = "r", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "JNJDBENA", name = "s", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "JNJDBENA", name = "t", descriptor = "I")
    public static int field939;

    @OriginalMember(owner = "JNJDBENA", name = "u", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "JNJDBENA", name = "v", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "JNJDBENA", name = "k", descriptor = "Z")
    private static boolean field930;

    @OriginalMember(owner = "JNJDBENA", name = "l", descriptor = "Z")
    private static boolean field931;

    @OriginalMember(owner = "JNJDBENA", name = "w", descriptor = "Z")
    public static boolean field942;

    @OriginalMember(owner = "JNJDBENA", name = "m", descriptor = "[I")
    public static int[] field932;

    @OriginalMember(owner = "JNJDBENA", name = "a", descriptor = "(IIB[I)V")
    public static void method283(int arg0, int arg1, byte arg2, int[] arg3) {
        if (arg2 == -31) {
            field932 = arg3;
            field933 = arg0;
            field934 = arg1;
            method285(0, -749, 0, arg1, arg0);
        }
    }

    @OriginalMember(owner = "JNJDBENA", name = "a", descriptor = "(I)V")
    public static void method284(int arg0) {
        field937 = 0;
        field935 = 0;
        if (arg0 != 3) {
            field929 = -280;
        }
        field938 = field933;
        field936 = field934;
        field939 = field938 - 1;
        field940 = field938 / 2;
    }

    @OriginalMember(owner = "JNJDBENA", name = "a", descriptor = "(IIIII)V")
    public static void method285(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg2 < 0) {
            arg2 = 0;
        }
        if (arg4 > field933) {
            arg4 = field933;
        }
        if (arg3 > field934) {
            arg3 = field934;
        }
        field937 = arg0;
        field935 = arg2;
        field938 = arg4;
        field936 = arg3;
        field939 = field938 - 1;
        field940 = field938 / 2;
        field941 = field936 / 2;
        while (arg1 >= 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
    }

    @OriginalMember(owner = "JNJDBENA", name = "b", descriptor = "(I)V")
    public static void method286(int arg0) {
        int var1 = field934 * field933;
        if (arg0 == 0) {
            for (int var2 = 0; var2 < var1; var2++) {
                field932[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "JNJDBENA", name = "a", descriptor = "(IIIIIIZ)V")
    public static void method287(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg3 < field937) {
            arg1 -= field937 - arg3;
            arg3 = field937;
        }
        if (arg4 < field935) {
            arg5 -= field935 - arg4;
            arg4 = field935;
        }
        if (arg1 + arg3 > field938) {
            arg1 = field938 - arg3;
        }
        if (arg4 + arg5 > field936) {
            arg5 = field936 - arg4;
        }
        int var7 = 256 - arg0;
        int var8 = (arg2 >> 16 & 0xFF) * arg0;
        int var9 = (arg2 >> 8 & 0xFF) * arg0;
        int var10 = (arg2 & 0xFF) * arg0;
        int var11 = field933 - arg1;
        int var12 = field933 * arg4 + arg3;
        for (int var13 = 0; var13 < arg5; var13++) {
            for (int var14 = -arg1; var14 < 0; var14++) {
                int var15 = (field932[var12] >> 16 & 0xFF) * var7;
                int var16 = (field932[var12] >> 8 & 0xFF) * var7;
                int var17 = (field932[var12] & 0xFF) * var7;
                int var18 = (var10 + var17 >> 8) + (var8 + var15 >> 8 << 16) + (var9 + var16 >> 8 << 8);
                field932[var12++] = var18;
            }
            var12 += var11;
        }
        if (!arg6) {
            field931 = !field931;
        }
    }

    @OriginalMember(owner = "JNJDBENA", name = "a", descriptor = "(IIIIII)V")
    public static void method288(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field937) {
            arg3 -= field937 - arg0;
            arg0 = field937;
        }
        if (arg2 < field935) {
            arg5 -= field935 - arg2;
            arg2 = field935;
        }
        if (arg0 + arg3 > field938) {
            arg3 = field938 - arg0;
        }
        if (arg2 + arg5 > field936) {
            arg5 = field936 - arg2;
        }
        int var6 = field933 - arg3;
        int var7 = field933 * arg2 + arg0;
        if (arg1 != 0) {
            return;
        }
        for (int var8 = -arg5; var8 < 0; var8++) {
            for (int var9 = -arg3; var9 < 0; var9++) {
                field932[var7++] = arg4;
            }
            var7 += var6;
        }
    }

    @OriginalMember(owner = "JNJDBENA", name = "b", descriptor = "(IIIIII)V")
    public static void method289(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method291(arg0, -729, arg1, arg3, arg2);
        method291(arg0, -729, arg1, arg3, arg2 + arg5 - 1);
        method293(arg5, arg3, -771, arg0, arg2);
        method293(arg5, arg3, -771, arg0 + arg1 - 1, arg2);
        if (arg4 < 0 || arg4 > 0) {
            field930 = !field930;
        }
    }

    @OriginalMember(owner = "JNJDBENA", name = "a", descriptor = "(IIIIIII)V")
    public static void method290(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 != 4) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        method292(arg0, arg5, arg6, -4269, arg2, arg4);
        method292(arg0, arg5, arg6, -4269, arg2, arg1 + arg4 - 1);
        if (arg1 >= 3) {
            method294(arg5, arg0, arg6, 45, arg1 - 2, arg4 + 1);
            method294(arg2 + arg5 - 1, arg0, arg6, 45, arg1 - 2, arg4 + 1);
        }
    }

    @OriginalMember(owner = "JNJDBENA", name = "b", descriptor = "(IIIII)V")
    public static void method291(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 < field935 || arg4 >= field936) {
            return;
        }
        if (arg0 < field937) {
            arg2 -= field937 - arg0;
            arg0 = field937;
        }
        if (arg0 + arg2 > field938) {
            arg2 = field938 - arg0;
        }
        int var5 = field933 * arg4 + arg0;
        if (arg1 >= 0) {
            field928 = 333;
        }
        for (int var6 = 0; var6 < arg2; var6++) {
            field932[var5 + var6] = arg3;
        }
    }

    @OriginalMember(owner = "JNJDBENA", name = "c", descriptor = "(IIIIII)V")
    public static void method292(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 < field935 || arg5 >= field936) {
            return;
        }
        if (arg1 < field937) {
            arg4 -= field937 - arg1;
            arg1 = field937;
        }
        if (arg1 + arg4 > field938) {
            arg4 = field938 - arg1;
        }
        int var6 = 256 - arg0;
        int var7 = (arg2 >> 16 & 0xFF) * arg0;
        int var8 = (arg2 >> 8 & 0xFF) * arg0;
        int var9 = (arg2 & 0xFF) * arg0;
        if (arg3 != -4269) {
            field929 = 208;
        }
        int var10 = field933 * arg5 + arg1;
        for (int var11 = 0; var11 < arg4; var11++) {
            int var12 = (field932[var10] >> 16 & 0xFF) * var6;
            int var13 = (field932[var10] >> 8 & 0xFF) * var6;
            int var14 = (field932[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field932[var10++] = var15;
        }
    }

    @OriginalMember(owner = "JNJDBENA", name = "c", descriptor = "(IIIII)V")
    public static void method293(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 >= 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (arg3 < field937 || arg3 >= field938) {
            return;
        }
        if (arg4 < field935) {
            arg0 -= field935 - arg4;
            arg4 = field935;
        }
        if (arg0 + arg4 > field936) {
            arg0 = field936 - arg4;
        }
        int var6 = field933 * arg4 + arg3;
        for (int var7 = 0; var7 < arg0; var7++) {
            field932[field933 * var7 + var6] = arg1;
        }
    }

    @OriginalMember(owner = "JNJDBENA", name = "d", descriptor = "(IIIIII)V")
    public static void method294(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 <= 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        if (arg0 < field937 || arg0 >= field938) {
            return;
        }
        if (arg5 < field935) {
            arg4 -= field935 - arg5;
            arg5 = field935;
        }
        if (arg4 + arg5 > field936) {
            arg4 = field936 - arg5;
        }
        int var7 = 256 - arg1;
        int var8 = (arg2 >> 16 & 0xFF) * arg1;
        int var9 = (arg2 >> 8 & 0xFF) * arg1;
        int var10 = (arg2 & 0xFF) * arg1;
        int var11 = field933 * arg5 + arg0;
        for (int var12 = 0; var12 < arg4; var12++) {
            int var13 = (field932[var11] >> 16 & 0xFF) * var7;
            int var14 = (field932[var11] >> 8 & 0xFF) * var7;
            int var15 = (field932[var11] & 0xFF) * var7;
            int var16 = (var10 + var15 >> 8) + (var8 + var13 >> 8 << 16) + (var9 + var14 >> 8 << 8);
            field932[var11] = var16;
            var11 += field933;
        }
    }
}
