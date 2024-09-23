import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("JJXDTORW")
public class class35 extends class17 {

    @OriginalMember(owner = "JJXDTORW", name = "j", descriptor = "I")
    private static int field1124 = -333;

    @OriginalMember(owner = "JJXDTORW", name = "k", descriptor = "Z")
    private static boolean field1125 = true;

    @OriginalMember(owner = "JJXDTORW", name = "l", descriptor = "I")
    private static int field1126 = 464;

    @OriginalMember(owner = "JJXDTORW", name = "m", descriptor = "I")
    private static int field1127 = 10277;

    @OriginalMember(owner = "JJXDTORW", name = "n", descriptor = "I")
    private static int field1128 = -247;

    @OriginalMember(owner = "JJXDTORW", name = "p", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "JJXDTORW", name = "q", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "JJXDTORW", name = "r", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "JJXDTORW", name = "s", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "JJXDTORW", name = "t", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "JJXDTORW", name = "u", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "JJXDTORW", name = "v", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "JJXDTORW", name = "w", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "JJXDTORW", name = "x", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "JJXDTORW", name = "y", descriptor = "Z")
    public static boolean field1139;

    @OriginalMember(owner = "JJXDTORW", name = "o", descriptor = "[I")
    public static int[] field1129;

    @OriginalMember(owner = "JJXDTORW", name = "a", descriptor = "(III[I)V")
    public static void method412(int arg0, int arg1, int arg2, int[] arg3) {
        field1129 = arg3;
        field1130 = arg2;
        if (arg1 != -8228) {
            field1124 = -148;
        }
        field1131 = arg0;
        method414(0, arg2, true, 0, arg0);
    }

    @OriginalMember(owner = "JJXDTORW", name = "a", descriptor = "(B)V")
    public static void method413(byte arg0) {
        field1134 = 0;
        field1132 = 0;
        field1135 = field1130;
        field1133 = field1131;
        field1136 = field1135 - 1;
        if (arg0 == 6) {
            field1137 = field1135 / 2;
        }
    }

    @OriginalMember(owner = "JJXDTORW", name = "a", descriptor = "(IIZII)V")
    public static void method414(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg3 < 0) {
            arg3 = 0;
        }
        if (arg1 > field1130) {
            arg1 = field1130;
        }
        if (arg4 > field1131) {
            arg4 = field1131;
        }
        field1134 = arg0;
        field1132 = arg3;
        if (!arg2) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        field1135 = arg1;
        field1133 = arg4;
        field1136 = field1135 - 1;
        field1137 = field1135 / 2;
        field1138 = field1133 / 2;
    }

    @OriginalMember(owner = "JJXDTORW", name = "a", descriptor = "(I)V")
    public static void method415(int arg0) {
        if (arg0 != 0) {
            field1124 = -125;
        }
        int var1 = field1131 * field1130;
        for (int var2 = 0; var2 < var1; var2++) {
            field1129[var2] = 0;
        }
    }

    @OriginalMember(owner = "JJXDTORW", name = "a", descriptor = "(IIBIIII)V")
    public static void method416(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 != 5) {
            field1125 = !field1125;
        }
        if (arg0 < field1134) {
            arg4 -= field1134 - arg0;
            arg0 = field1134;
        }
        if (arg5 < field1132) {
            arg1 -= field1132 - arg5;
            arg5 = field1132;
        }
        if (arg0 + arg4 > field1135) {
            arg4 = field1135 - arg0;
        }
        if (arg1 + arg5 > field1133) {
            arg1 = field1133 - arg5;
        }
        int var7 = 256 - arg6;
        int var8 = (arg3 >> 16 & 0xFF) * arg6;
        int var9 = (arg3 >> 8 & 0xFF) * arg6;
        int var10 = (arg3 & 0xFF) * arg6;
        int var11 = field1130 - arg4;
        int var12 = field1130 * arg5 + arg0;
        for (int var13 = 0; var13 < arg1; var13++) {
            for (int var14 = -arg4; var14 < 0; var14++) {
                int var15 = (field1129[var12] >> 16 & 0xFF) * var7;
                int var16 = (field1129[var12] >> 8 & 0xFF) * var7;
                int var17 = (field1129[var12] & 0xFF) * var7;
                int var18 = (var10 + var17 >> 8) + (var8 + var15 >> 8 << 16) + (var9 + var16 >> 8 << 8);
                field1129[var12++] = var18;
            }
            var12 += var11;
        }
    }

    @OriginalMember(owner = "JJXDTORW", name = "a", descriptor = "(IIIIII)V")
    public static void method417(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 < field1134) {
            arg4 -= field1134 - arg3;
            arg3 = field1134;
        }
        if (arg1 < field1132) {
            arg2 -= field1132 - arg1;
            arg1 = field1132;
        }
        if (arg3 + arg4 > field1135) {
            arg4 = field1135 - arg3;
        }
        if (arg1 + arg2 > field1133) {
            arg2 = field1133 - arg1;
        }
        int var6 = field1130 - arg4;
        int var7 = field1130 * arg1 + arg3;
        for (int var8 = -arg2; var8 < 0; var8++) {
            for (int var9 = -arg4; var9 < 0; var9++) {
                field1129[var7++] = arg5;
            }
            var7 += var6;
        }
        if (arg0 <= 0) {
            field1125 = !field1125;
        }
    }

    @OriginalMember(owner = "JJXDTORW", name = "b", descriptor = "(IIIIII)V")
    public static void method418(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 <= 0) {
            field1126 = 341;
        }
        method420(arg3, arg4, field1127, arg5, arg1);
        method420(arg3, arg2 + arg4 - 1, field1127, arg5, arg1);
        method422(arg5, arg3, arg4, true, arg2);
        method422(arg1 + arg5 - 1, arg3, arg4, true, arg2);
    }

    @OriginalMember(owner = "JJXDTORW", name = "a", descriptor = "(ZIIIIII)V")
    public static void method419(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        method421(-247, arg1, arg5, arg4, arg2, arg3);
        method421(-247, arg1, arg5, arg4, arg2 + arg6 - 1, arg3);
        if (arg0) {
            field1125 = !field1125;
        }
        if (arg6 >= 3) {
            method423(arg3, arg4, 2, arg1, arg6 - 2, arg2 + 1);
            method423(arg3, arg4, 2, arg1 + arg5 - 1, arg6 - 2, arg2 + 1);
        }
    }

    @OriginalMember(owner = "JJXDTORW", name = "a", descriptor = "(IIIII)V")
    public static void method420(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field1132 || arg1 >= field1133) {
            return;
        }
        if (arg3 < field1134) {
            arg4 -= field1134 - arg3;
            arg3 = field1134;
        }
        if (arg3 + arg4 > field1135) {
            arg4 = field1135 - arg3;
        }
        int var5 = field1130 * arg1 + arg3;
        if (arg2 == 10277) {
            for (int var6 = 0; var6 < arg4; var6++) {
                field1129[var5 + var6] = arg0;
            }
        }
    }

    @OriginalMember(owner = "JJXDTORW", name = "c", descriptor = "(IIIIII)V")
    public static void method421(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 < field1132 || arg4 >= field1133) {
            return;
        }
        if (arg1 < field1134) {
            arg2 -= field1134 - arg1;
            arg1 = field1134;
        }
        if (arg1 + arg2 > field1135) {
            arg2 = field1135 - arg1;
        }
        int var6 = 256 - arg5;
        int var7 = (arg3 >> 16 & 0xFF) * arg5;
        int var8 = (arg3 >> 8 & 0xFF) * arg5;
        int var9 = (arg3 & 0xFF) * arg5;
        if (arg0 >= 0) {
            return;
        }
        int var10 = field1130 * arg4 + arg1;
        for (int var11 = 0; var11 < arg2; var11++) {
            int var12 = (field1129[var10] >> 16 & 0xFF) * var6;
            int var13 = (field1129[var10] >> 8 & 0xFF) * var6;
            int var14 = (field1129[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field1129[var10++] = var15;
        }
    }

    @OriginalMember(owner = "JJXDTORW", name = "a", descriptor = "(IIIZI)V")
    public static void method422(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (arg0 < field1134 || arg0 >= field1135) {
            return;
        }
        if (arg2 < field1132) {
            arg4 -= field1132 - arg2;
            arg2 = field1132;
        }
        if (arg2 + arg4 > field1133) {
            arg4 = field1133 - arg2;
        }
        int var5 = field1130 * arg2 + arg0;
        if (arg3) {
            for (int var6 = 0; var6 < arg4; var6++) {
                field1129[field1130 * var6 + var5] = arg1;
            }
        }
    }

    @OriginalMember(owner = "JJXDTORW", name = "d", descriptor = "(IIIIII)V")
    public static void method423(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 != 2 || (arg3 < field1134 || arg3 >= field1135)) {
            return;
        }
        if (arg5 < field1132) {
            arg4 -= field1132 - arg5;
            arg5 = field1132;
        }
        if (arg4 + arg5 > field1133) {
            arg4 = field1133 - arg5;
        }
        int var6 = 256 - arg0;
        int var7 = (arg1 >> 16 & 0xFF) * arg0;
        int var8 = (arg1 >> 8 & 0xFF) * arg0;
        int var9 = (arg1 & 0xFF) * arg0;
        int var10 = field1130 * arg5 + arg3;
        for (int var11 = 0; var11 < arg4; var11++) {
            int var12 = (field1129[var10] >> 16 & 0xFF) * var6;
            int var13 = (field1129[var10] >> 8 & 0xFF) * var6;
            int var14 = (field1129[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field1129[var10] = var15;
            var10 += field1130;
        }
    }
}
