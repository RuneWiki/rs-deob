import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("NQLGXPRA")
public class class36 extends class28 {

    @OriginalMember(owner = "NQLGXPRA", name = "h", descriptor = "I")
    private static int field1120 = 12933;

    @OriginalMember(owner = "NQLGXPRA", name = "i", descriptor = "I")
    private static int field1121 = 834;

    @OriginalMember(owner = "NQLGXPRA", name = "j", descriptor = "B")
    private static byte field1122 = -113;

    @OriginalMember(owner = "NQLGXPRA", name = "k", descriptor = "Z")
    private static boolean field1123 = true;

    @OriginalMember(owner = "NQLGXPRA", name = "m", descriptor = "I")
    public static int field1125;

    @OriginalMember(owner = "NQLGXPRA", name = "n", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "NQLGXPRA", name = "o", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "NQLGXPRA", name = "p", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "NQLGXPRA", name = "q", descriptor = "I")
    public static int field1129;

    @OriginalMember(owner = "NQLGXPRA", name = "r", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "NQLGXPRA", name = "s", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "NQLGXPRA", name = "t", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "NQLGXPRA", name = "u", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "NQLGXPRA", name = "v", descriptor = "Z")
    public static boolean field1134;

    @OriginalMember(owner = "NQLGXPRA", name = "l", descriptor = "[I")
    public static int[] field1124;

    @OriginalMember(owner = "NQLGXPRA", name = "a", descriptor = "(I[III)V")
    public static void method388(int arg0, int[] arg1, int arg2, int arg3) {
        field1124 = arg1;
        field1125 = arg0;
        field1126 = arg2;
        if (field1120 != arg3) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        method390(0, arg2, (byte) 98, 0, arg0);
    }

    @OriginalMember(owner = "NQLGXPRA", name = "a", descriptor = "(I)V")
    public static void method389(int arg0) {
        if (arg0 <= 0) {
            for (int var1 = 1; var1 > 0; var1++) {
            }
        }
        field1129 = 0;
        field1127 = 0;
        field1130 = field1125;
        field1128 = field1126;
        field1131 = field1130 - 1;
        field1132 = field1130 / 2;
    }

    @OriginalMember(owner = "NQLGXPRA", name = "a", descriptor = "(IIBII)V")
    public static void method390(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg3 < 0) {
            arg3 = 0;
        }
        if (arg4 > field1125) {
            arg4 = field1125;
        }
        if (arg1 > field1126) {
            arg1 = field1126;
        }
        field1129 = arg0;
        if (arg2 != 98) {
            return;
        }
        field1127 = arg3;
        field1130 = arg4;
        field1128 = arg1;
        field1131 = field1130 - 1;
        field1132 = field1130 / 2;
        field1133 = field1128 / 2;
    }

    @OriginalMember(owner = "NQLGXPRA", name = "b", descriptor = "(I)V")
    public static void method391(int arg0) {
        int var1 = field1126 * field1125;
        if (arg0 != 7) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        for (int var3 = 0; var3 < var1; var3++) {
            field1124[var3] = 0;
        }
    }

    @OriginalMember(owner = "NQLGXPRA", name = "a", descriptor = "(IIIIIII)V")
    public static void method392(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 != 0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        if (arg6 < field1129) {
            arg1 -= field1129 - arg6;
            arg6 = field1129;
        }
        if (arg2 < field1127) {
            arg5 -= field1127 - arg2;
            arg2 = field1127;
        }
        if (arg1 + arg6 > field1130) {
            arg1 = field1130 - arg6;
        }
        if (arg2 + arg5 > field1128) {
            arg5 = field1128 - arg2;
        }
        int var8 = 256 - arg4;
        int var9 = (arg3 >> 16 & 0xFF) * arg4;
        int var10 = (arg3 >> 8 & 0xFF) * arg4;
        int var11 = (arg3 & 0xFF) * arg4;
        int var12 = field1125 - arg1;
        int var13 = field1125 * arg2 + arg6;
        for (int var14 = 0; var14 < arg5; var14++) {
            for (int var15 = -arg1; var15 < 0; var15++) {
                int var16 = (field1124[var13] >> 16 & 0xFF) * var8;
                int var17 = (field1124[var13] >> 8 & 0xFF) * var8;
                int var18 = (field1124[var13] & 0xFF) * var8;
                int var19 = (var11 + var18 >> 8) + (var9 + var16 >> 8 << 16) + (var10 + var17 >> 8 << 8);
                field1124[var13++] = var19;
            }
            var13 += var12;
        }
    }

    @OriginalMember(owner = "NQLGXPRA", name = "a", descriptor = "(IIIIII)V")
    public static void method393(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field1129) {
            arg5 -= field1129 - arg0;
            arg0 = field1129;
        }
        if (arg3 < field1127) {
            arg2 -= field1127 - arg3;
            arg3 = field1127;
        }
        if (arg0 + arg5 > field1130) {
            arg5 = field1130 - arg0;
        }
        if (arg2 + arg3 > field1128) {
            arg2 = field1128 - arg3;
        }
        int var6 = field1125 - arg5;
        int var7 = field1125 * arg3 + arg0;
        if (arg4 != 0) {
            return;
        }
        for (int var8 = -arg2; var8 < 0; var8++) {
            for (int var9 = -arg5; var9 < 0; var9++) {
                field1124[var7++] = arg1;
            }
            var7 += var6;
        }
    }

    @OriginalMember(owner = "NQLGXPRA", name = "a", descriptor = "(IBIIII)V")
    public static void method394(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        method396(arg2, arg0, arg5, 0, arg3);
        method396(arg2 + arg4 - 1, arg0, arg5, 0, arg3);
        if (arg1 == 52) {
            method398(arg0, arg2, arg5, 834, arg4);
            method398(arg0, arg2, arg3 + arg5 - 1, 834, arg4);
        }
    }

    @OriginalMember(owner = "NQLGXPRA", name = "b", descriptor = "(IIIIIII)V")
    public static void method395(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg2 > 1) {
            field1123 = !field1123;
        }
        method397(arg0, arg3, (byte) 0, arg6, arg1, arg5);
        method397(arg0 + arg4 - 1, arg3, (byte) 0, arg6, arg1, arg5);
        if (arg4 >= 3) {
            method399(arg0 + 1, arg1, arg4 - 2, arg5, arg3, (byte) 7);
            method399(arg0 + 1, arg1 + arg6 - 1, arg4 - 2, arg5, arg3, (byte) 7);
        }
    }

    @OriginalMember(owner = "NQLGXPRA", name = "a", descriptor = "(IIIII)V")
    public static void method396(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (arg0 < field1127 || arg0 >= field1128) {
            return;
        }
        if (arg2 < field1129) {
            arg4 -= field1129 - arg2;
            arg2 = field1129;
        }
        if (arg2 + arg4 > field1130) {
            arg4 = field1130 - arg2;
        }
        int var6 = field1125 * arg0 + arg2;
        for (int var7 = 0; var7 < arg4; var7++) {
            field1124[var6 + var7] = arg1;
        }
    }

    @OriginalMember(owner = "NQLGXPRA", name = "a", descriptor = "(IIBIII)V")
    public static void method397(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field1127 || arg0 >= field1128) {
            return;
        }
        if (arg4 < field1129) {
            arg3 -= field1129 - arg4;
            arg4 = field1129;
        }
        if (arg3 + arg4 > field1130) {
            arg3 = field1130 - arg4;
        }
        int var6 = 256 - arg1;
        if (arg2 != 0) {
            return;
        }
        int var7 = (arg5 >> 16 & 0xFF) * arg1;
        int var8 = (arg5 >> 8 & 0xFF) * arg1;
        int var9 = (arg5 & 0xFF) * arg1;
        int var10 = field1125 * arg0 + arg4;
        for (int var11 = 0; var11 < arg3; var11++) {
            int var12 = (field1124[var10] >> 16 & 0xFF) * var6;
            int var13 = (field1124[var10] >> 8 & 0xFF) * var6;
            int var14 = (field1124[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field1124[var10++] = var15;
        }
    }

    @OriginalMember(owner = "NQLGXPRA", name = "b", descriptor = "(IIIII)V")
    public static void method398(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 42 / arg3;
        if (arg2 < field1129 || arg2 >= field1130) {
            return;
        }
        if (arg1 < field1127) {
            arg4 -= field1127 - arg1;
            arg1 = field1127;
        }
        if (arg1 + arg4 > field1128) {
            arg4 = field1128 - arg1;
        }
        int var6 = field1125 * arg1 + arg2;
        for (int var7 = 0; var7 < arg4; var7++) {
            field1124[field1125 * var7 + var6] = arg0;
        }
    }

    @OriginalMember(owner = "NQLGXPRA", name = "a", descriptor = "(IIIIIB)V")
    public static void method399(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        if (arg1 < field1129 || arg1 >= field1130) {
            return;
        }
        if (arg0 < field1127) {
            arg2 -= field1127 - arg0;
            arg0 = field1127;
        }
        if (arg0 + arg2 > field1128) {
            arg2 = field1128 - arg0;
        }
        int var6 = 256 - arg4;
        int var7 = (arg3 >> 16 & 0xFF) * arg4;
        int var8 = (arg3 >> 8 & 0xFF) * arg4;
        int var9 = (arg3 & 0xFF) * arg4;
        int var10 = field1125 * arg0 + arg1;
        for (int var11 = 0; var11 < arg2; var11++) {
            int var13 = (field1124[var10] >> 16 & 0xFF) * var6;
            int var14 = (field1124[var10] >> 8 & 0xFF) * var6;
            int var15 = (field1124[var10] & 0xFF) * var6;
            int var16 = (var9 + var15 >> 8) + (var7 + var13 >> 8 << 16) + (var8 + var14 >> 8 << 8);
            field1124[var10] = var16;
            var10 += field1125;
        }
        if (arg5 == 7) {
            boolean var12 = false;
        }
    }
}
