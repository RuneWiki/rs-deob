import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("KNERFXXY")
public class class31 extends class30 {

    @OriginalMember(owner = "KNERFXXY", name = "j", descriptor = "I")
    private static int field949 = -944;

    @OriginalMember(owner = "KNERFXXY", name = "k", descriptor = "I")
    private static int field950 = -489;

    @OriginalMember(owner = "KNERFXXY", name = "l", descriptor = "I")
    private static int field951 = 3;

    @OriginalMember(owner = "KNERFXXY", name = "m", descriptor = "I")
    private static int field952 = -280;

    @OriginalMember(owner = "KNERFXXY", name = "o", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "KNERFXXY", name = "p", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "KNERFXXY", name = "q", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "KNERFXXY", name = "r", descriptor = "I")
    public static int field957;

    @OriginalMember(owner = "KNERFXXY", name = "s", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "KNERFXXY", name = "t", descriptor = "I")
    public static int field959;

    @OriginalMember(owner = "KNERFXXY", name = "u", descriptor = "I")
    public static int field960;

    @OriginalMember(owner = "KNERFXXY", name = "v", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "KNERFXXY", name = "w", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "KNERFXXY", name = "i", descriptor = "Z")
    private static boolean field948;

    @OriginalMember(owner = "KNERFXXY", name = "x", descriptor = "Z")
    public static boolean field963;

    @OriginalMember(owner = "KNERFXXY", name = "n", descriptor = "[I")
    public static int[] field953;

    @OriginalMember(owner = "KNERFXXY", name = "a", descriptor = "(IIB[I)V")
    public static void method279(int arg0, int arg1, byte arg2, int[] arg3) {
        field953 = arg3;
        field954 = arg1;
        field955 = arg0;
        method281(0, arg0, arg1, 0, 1);
        if (arg2 == -105) {
            ;
        }
    }

    @OriginalMember(owner = "KNERFXXY", name = "a", descriptor = "(Z)V")
    public static void method280(boolean arg0) {
        if (!arg0) {
            for (int var1 = 1; var1 > 0; var1++) {
            }
        }
        field958 = 0;
        field956 = 0;
        field959 = field954;
        field957 = field955;
        field960 = field959 - 1;
        field961 = field959 / 2;
    }

    @OriginalMember(owner = "KNERFXXY", name = "a", descriptor = "(IIIII)V")
    public static void method281(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 < 0) {
            arg3 = 0;
        }
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg2 > field954) {
            arg2 = field954;
        }
        if (arg1 > field955) {
            arg1 = field955;
        }
        field958 = arg3;
        field956 = arg0;
        field959 = arg2;
        if (arg4 < 1 || arg4 > 1) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        field957 = arg1;
        field960 = field959 - 1;
        field961 = field959 / 2;
        field962 = field957 / 2;
    }

    @OriginalMember(owner = "KNERFXXY", name = "a", descriptor = "(I)V")
    public static void method282(int arg0) {
        int var1 = field955 * field954;
        if (arg0 != 3) {
            field949 = -265;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            field953[var2] = 0;
        }
    }

    @OriginalMember(owner = "KNERFXXY", name = "a", descriptor = "(IIIIIBI)V")
    public static void method283(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        if (arg4 < field958) {
            arg2 -= field958 - arg4;
            arg4 = field958;
        }
        if (arg3 < field956) {
            arg0 -= field956 - arg3;
            arg3 = field956;
        }
        if (arg2 + arg4 > field959) {
            arg2 = field959 - arg4;
        }
        if (arg0 + arg3 > field957) {
            arg0 = field957 - arg3;
        }
        int var7 = 256 - arg6;
        int var8 = (arg1 >> 16 & 0xFF) * arg6;
        int var9 = (arg1 >> 8 & 0xFF) * arg6;
        int var10 = (arg1 & 0xFF) * arg6;
        if (arg5 != 2) {
            field949 = -209;
        }
        int var11 = field954 - arg2;
        int var12 = field954 * arg3 + arg4;
        for (int var13 = 0; var13 < arg0; var13++) {
            for (int var14 = -arg2; var14 < 0; var14++) {
                int var15 = (field953[var12] >> 16 & 0xFF) * var7;
                int var16 = (field953[var12] >> 8 & 0xFF) * var7;
                int var17 = (field953[var12] & 0xFF) * var7;
                int var18 = (var10 + var17 >> 8) + (var8 + var15 >> 8 << 16) + (var9 + var16 >> 8 << 8);
                field953[var12++] = var18;
            }
            var12 += var11;
        }
    }

    @OriginalMember(owner = "KNERFXXY", name = "a", descriptor = "(IIIBII)V")
    public static void method284(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        if (arg0 < field958) {
            arg5 -= field958 - arg0;
            arg0 = field958;
        }
        if (arg1 < field956) {
            arg4 -= field956 - arg1;
            arg1 = field956;
        }
        if (arg0 + arg5 > field959) {
            arg5 = field959 - arg0;
        }
        if (arg1 + arg4 > field957) {
            arg4 = field957 - arg1;
        }
        int var6 = field954 - arg5;
        int var7 = field954 * arg1 + arg0;
        for (int var8 = -arg4; var8 < 0; var8++) {
            for (int var9 = -arg5; var9 < 0; var9++) {
                field953[var7++] = arg2;
            }
            var7 += var6;
        }
        if (arg3 == -4) {
            ;
        }
    }

    @OriginalMember(owner = "KNERFXXY", name = "a", descriptor = "(IIIIIB)V")
    public static void method285(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        method287(arg2, arg3, arg0, (byte) 8, arg4);
        if (arg5 != 3) {
            field948 = !field948;
        }
        method287(arg2, arg3, arg0 + arg1 - 1, (byte) 8, arg4);
        method289(false, arg2, arg3, arg1, arg0);
        method289(false, arg2, arg3 + arg4 - 1, arg1, arg0);
    }

    @OriginalMember(owner = "KNERFXXY", name = "a", descriptor = "(IIIIIII)V")
    public static void method286(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        method288(-489, arg3, arg2, arg4, arg0, arg6);
        method288(-489, arg3, arg2, arg4, arg0, arg5 + arg6 - 1);
        if (arg1 != 0) {
            field950 = 205;
        }
        if (arg5 >= 3) {
            method290(-564, arg0, arg3, arg4, arg6 + 1, arg5 - 2);
            method290(-564, arg0, arg2 + arg3 - 1, arg4, arg6 + 1, arg5 - 2);
        }
    }

    @OriginalMember(owner = "KNERFXXY", name = "a", descriptor = "(IIIBI)V")
    public static void method287(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg2 < field956 || arg2 >= field957) {
            return;
        }
        if (arg1 < field958) {
            arg4 -= field958 - arg1;
            arg1 = field958;
        }
        if (arg1 + arg4 > field959) {
            arg4 = field959 - arg1;
        }
        int var5 = field954 * arg2 + arg1;
        if (arg3 != 8) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        for (int var7 = 0; var7 < arg4; var7++) {
            field953[var5 + var7] = arg0;
        }
    }

    @OriginalMember(owner = "KNERFXXY", name = "a", descriptor = "(IIIIII)V")
    public static void method288(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 < field956 || arg5 >= field957) {
            return;
        }
        if (arg1 < field958) {
            arg2 -= field958 - arg1;
            arg1 = field958;
        }
        if (arg1 + arg2 > field959) {
            arg2 = field959 - arg1;
        }
        int var6 = 256 - arg3;
        int var7 = (arg4 >> 16 & 0xFF) * arg3;
        int var8 = (arg4 >> 8 & 0xFF) * arg3;
        int var9 = (arg4 & 0xFF) * arg3;
        if (arg0 >= 0) {
            return;
        }
        int var10 = field954 * arg5 + arg1;
        for (int var11 = 0; var11 < arg2; var11++) {
            int var12 = (field953[var10] >> 16 & 0xFF) * var6;
            int var13 = (field953[var10] >> 8 & 0xFF) * var6;
            int var14 = (field953[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field953[var10++] = var15;
        }
    }

    @OriginalMember(owner = "KNERFXXY", name = "a", descriptor = "(ZIIII)V")
    public static void method289(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 || (arg2 < field958 || arg2 >= field959)) {
            return;
        }
        if (arg4 < field956) {
            arg3 -= field956 - arg4;
            arg4 = field956;
        }
        if (arg3 + arg4 > field957) {
            arg3 = field957 - arg4;
        }
        int var5 = field954 * arg4 + arg2;
        for (int var6 = 0; var6 < arg3; var6++) {
            field953[field954 * var6 + var5] = arg1;
        }
    }

    @OriginalMember(owner = "KNERFXXY", name = "b", descriptor = "(IIIIII)V")
    public static void method290(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        while (arg0 >= 0) {
            field952 = 201;
        }
        if (arg2 < field958 || arg2 >= field959) {
            return;
        }
        if (arg4 < field956) {
            arg5 -= field956 - arg4;
            arg4 = field956;
        }
        if (arg4 + arg5 > field957) {
            arg5 = field957 - arg4;
        }
        int var6 = 256 - arg3;
        int var7 = (arg1 >> 16 & 0xFF) * arg3;
        int var8 = (arg1 >> 8 & 0xFF) * arg3;
        int var9 = (arg1 & 0xFF) * arg3;
        int var10 = field954 * arg4 + arg2;
        for (int var11 = 0; var11 < arg5; var11++) {
            int var12 = (field953[var10] >> 16 & 0xFF) * var6;
            int var13 = (field953[var10] >> 8 & 0xFF) * var6;
            int var14 = (field953[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field953[var10] = var15;
            var10 += field954;
        }
    }
}
