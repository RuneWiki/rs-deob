import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("OKWPDMPE")
public class class46 extends class60 {

    @OriginalMember(owner = "OKWPDMPE", name = "k", descriptor = "I")
    private static int field1157 = -42775;

    @OriginalMember(owner = "OKWPDMPE", name = "l", descriptor = "I")
    private static int field1158 = 509;

    @OriginalMember(owner = "OKWPDMPE", name = "n", descriptor = "I")
    private static int field1160 = 47773;

    @OriginalMember(owner = "OKWPDMPE", name = "p", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "OKWPDMPE", name = "q", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "OKWPDMPE", name = "r", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "OKWPDMPE", name = "s", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "OKWPDMPE", name = "t", descriptor = "I")
    public static int field1166;

    @OriginalMember(owner = "OKWPDMPE", name = "u", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "OKWPDMPE", name = "v", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "OKWPDMPE", name = "w", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "OKWPDMPE", name = "x", descriptor = "I")
    public static int field1170;

    @OriginalMember(owner = "OKWPDMPE", name = "m", descriptor = "Z")
    private static boolean field1159;

    @OriginalMember(owner = "OKWPDMPE", name = "y", descriptor = "Z")
    public static boolean field1171;

    @OriginalMember(owner = "OKWPDMPE", name = "o", descriptor = "[I")
    public static int[] field1161;

    @OriginalMember(owner = "OKWPDMPE", name = "a", descriptor = "(ZII[I)V")
    public static void method431(boolean arg0, int arg1, int arg2, int[] arg3) {
        if (!arg0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        field1161 = arg3;
        field1162 = arg1;
        field1163 = arg2;
        method433(arg1, arg2, 0, -42775, 0);
    }

    @OriginalMember(owner = "OKWPDMPE", name = "a", descriptor = "(B)V")
    public static void method432(byte arg0) {
        field1166 = 0;
        field1164 = 0;
        field1167 = field1162;
        if (arg0 != 75) {
            field1159 = !field1159;
        }
        field1165 = field1163;
        field1168 = field1167 - 1;
        field1169 = field1167 / 2;
    }

    @OriginalMember(owner = "OKWPDMPE", name = "a", descriptor = "(IIIII)V")
    public static void method433(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = 0;
        }
        if (arg4 < 0) {
            arg4 = 0;
        }
        if (arg0 > field1162) {
            arg0 = field1162;
        }
        if (arg1 > field1163) {
            arg1 = field1163;
        }
        field1166 = arg2;
        if (field1157 != arg3) {
            return;
        }
        field1164 = arg4;
        field1167 = arg0;
        field1165 = arg1;
        field1168 = field1167 - 1;
        field1169 = field1167 / 2;
        field1170 = field1165 / 2;
    }

    @OriginalMember(owner = "OKWPDMPE", name = "a", descriptor = "(I)V")
    public static void method434(int arg0) {
        if (arg0 < 0) {
            int var1 = field1163 * field1162;
            for (int var2 = 0; var2 < var1; var2++) {
                field1161[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "OKWPDMPE", name = "a", descriptor = "(IBIIIII)V")
    public static void method435(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 < field1166) {
            arg4 -= field1166 - arg3;
            arg3 = field1166;
        }
        if (arg5 < field1164) {
            arg0 -= field1164 - arg5;
            arg5 = field1164;
        }
        if (arg3 + arg4 > field1167) {
            arg4 = field1167 - arg3;
        }
        if (arg0 + arg5 > field1165) {
            arg0 = field1165 - arg5;
        }
        int var7 = 256 - arg6;
        int var8 = (arg2 >> 16 & 0xFF) * arg6;
        int var9 = (arg2 >> 8 & 0xFF) * arg6;
        int var10 = (arg2 & 0xFF) * arg6;
        if (arg1 != 1) {
            return;
        }
        int var11 = field1162 - arg4;
        int var12 = field1162 * arg5 + arg3;
        for (int var13 = 0; var13 < arg0; var13++) {
            for (int var14 = -arg4; var14 < 0; var14++) {
                int var15 = (field1161[var12] >> 16 & 0xFF) * var7;
                int var16 = (field1161[var12] >> 8 & 0xFF) * var7;
                int var17 = (field1161[var12] & 0xFF) * var7;
                int var18 = (var10 + var17 >> 8) + (var8 + var15 >> 8 << 16) + (var9 + var16 >> 8 << 8);
                field1161[var12++] = var18;
            }
            var12 += var11;
        }
    }

    @OriginalMember(owner = "OKWPDMPE", name = "a", descriptor = "(IIIIII)V")
    public static void method436(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field1166) {
            arg4 -= field1166 - arg0;
            arg0 = field1166;
        }
        if (arg1 < field1164) {
            arg5 -= field1164 - arg1;
            arg1 = field1164;
        }
        if (arg0 + arg4 > field1167) {
            arg4 = field1167 - arg0;
        }
        if (arg1 + arg5 > field1165) {
            arg5 = field1165 - arg1;
        }
        int var6 = field1162 - arg4;
        if (arg2 != 2) {
            return;
        }
        int var7 = field1162 * arg1 + arg0;
        for (int var8 = -arg5; var8 < 0; var8++) {
            for (int var9 = -arg4; var9 < 0; var9++) {
                field1161[var7++] = arg3;
            }
            var7 += var6;
        }
    }

    @OriginalMember(owner = "OKWPDMPE", name = "b", descriptor = "(IIIIII)V")
    public static void method437(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method439(arg5, arg2, true, arg4, arg3);
        if (arg0 == 7) {
            method439(arg5, arg1 + arg2 - 1, true, arg4, arg3);
            method441(arg3, 185, arg2, arg4, arg1);
            method441(arg3 + arg5 - 1, 185, arg2, arg4, arg1);
        }
    }

    @OriginalMember(owner = "OKWPDMPE", name = "a", descriptor = "(IIIIIII)V")
    public static void method438(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg6 <= 0) {
            field1158 = -466;
        }
        method440(arg3, arg2, arg4, false, arg0, arg1);
        method440(arg3, arg2, arg4, false, arg0 + arg5 - 1, arg1);
        if (arg5 >= 3) {
            method442(5, arg1, arg5 - 2, arg0 + 1, arg3, arg2);
            method442(5, arg1 + arg4 - 1, arg5 - 2, arg0 + 1, arg3, arg2);
        }
    }

    @OriginalMember(owner = "OKWPDMPE", name = "a", descriptor = "(IIZII)V")
    public static void method439(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (!arg2) {
            field1160 = -135;
        }
        if (arg1 < field1164 || arg1 >= field1165) {
            return;
        }
        if (arg4 < field1166) {
            arg0 -= field1166 - arg4;
            arg4 = field1166;
        }
        if (arg0 + arg4 > field1167) {
            arg0 = field1167 - arg4;
        }
        int var5 = field1162 * arg1 + arg4;
        for (int var6 = 0; var6 < arg0; var6++) {
            field1161[var5 + var6] = arg3;
        }
    }

    @OriginalMember(owner = "OKWPDMPE", name = "a", descriptor = "(IIIZII)V")
    public static void method440(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (arg4 < field1164 || arg4 >= field1165) {
            return;
        }
        if (arg5 < field1166) {
            arg2 -= field1166 - arg5;
            arg5 = field1166;
        }
        if (arg2 + arg5 > field1167) {
            arg2 = field1167 - arg5;
        }
        int var6 = 256 - arg0;
        int var7 = (arg1 >> 16 & 0xFF) * arg0;
        int var8 = (arg1 >> 8 & 0xFF) * arg0;
        int var9 = (arg1 & 0xFF) * arg0;
        int var10 = field1162 * arg4 + arg5;
        if (arg3) {
            field1158 = 55;
        }
        for (int var11 = 0; var11 < arg2; var11++) {
            int var12 = (field1161[var10] >> 16 & 0xFF) * var6;
            int var13 = (field1161[var10] >> 8 & 0xFF) * var6;
            int var14 = (field1161[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field1161[var10++] = var15;
        }
    }

    @OriginalMember(owner = "OKWPDMPE", name = "b", descriptor = "(IIIII)V")
    public static void method441(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1166 || arg0 >= field1167) {
            return;
        }
        if (arg2 < field1164) {
            arg4 -= field1164 - arg2;
            arg2 = field1164;
        }
        if (arg2 + arg4 > field1165) {
            arg4 = field1165 - arg2;
        }
        int var5 = field1162 * arg2 + arg0;
        int var6 = 73 / arg1;
        for (int var7 = 0; var7 < arg4; var7++) {
            field1161[field1162 * var7 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "OKWPDMPE", name = "c", descriptor = "(IIIIII)V")
    public static void method442(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 < field1166 || arg1 >= field1167) {
            return;
        }
        if (arg3 < field1164) {
            arg2 -= field1164 - arg3;
            arg3 = field1164;
        }
        if (arg2 + arg3 > field1165) {
            arg2 = field1165 - arg3;
        }
        int var6 = 256 - arg4;
        if (arg0 < 5 || arg0 > 5) {
            return;
        }
        int var7 = (arg5 >> 16 & 0xFF) * arg4;
        int var8 = (arg5 >> 8 & 0xFF) * arg4;
        int var9 = (arg5 & 0xFF) * arg4;
        int var10 = field1162 * arg3 + arg1;
        for (int var11 = 0; var11 < arg2; var11++) {
            int var12 = (field1161[var10] >> 16 & 0xFF) * var6;
            int var13 = (field1161[var10] >> 8 & 0xFF) * var6;
            int var14 = (field1161[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field1161[var10] = var15;
            var10 += field1162;
        }
    }
}
