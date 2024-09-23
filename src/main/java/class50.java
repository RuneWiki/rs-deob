import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("TQHEKXXC")
public class class50 extends class31 {

    @OriginalMember(owner = "TQHEKXXC", name = "k", descriptor = "I")
    private static int field1271 = -371;

    @OriginalMember(owner = "TQHEKXXC", name = "l", descriptor = "I")
    private static int field1272 = 2;

    @OriginalMember(owner = "TQHEKXXC", name = "o", descriptor = "I")
    private static int field1275 = -558;

    @OriginalMember(owner = "TQHEKXXC", name = "p", descriptor = "I")
    private static int field1276 = -76;

    @OriginalMember(owner = "TQHEKXXC", name = "q", descriptor = "Z")
    private static boolean field1277 = true;

    @OriginalMember(owner = "TQHEKXXC", name = "i", descriptor = "I")
    private static int field1269;

    @OriginalMember(owner = "TQHEKXXC", name = "m", descriptor = "I")
    private static int field1273;

    @OriginalMember(owner = "TQHEKXXC", name = "n", descriptor = "I")
    private static int field1274;

    @OriginalMember(owner = "TQHEKXXC", name = "s", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "TQHEKXXC", name = "t", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "TQHEKXXC", name = "u", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "TQHEKXXC", name = "v", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "TQHEKXXC", name = "w", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "TQHEKXXC", name = "x", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "TQHEKXXC", name = "y", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "TQHEKXXC", name = "z", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "TQHEKXXC", name = "A", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "TQHEKXXC", name = "j", descriptor = "Z")
    private static boolean field1270;

    @OriginalMember(owner = "TQHEKXXC", name = "B", descriptor = "Z")
    public static boolean field1288;

    @OriginalMember(owner = "TQHEKXXC", name = "r", descriptor = "[I")
    public static int[] field1278;

    @OriginalMember(owner = "TQHEKXXC", name = "a", descriptor = "(III[I)V")
    public static void method473(int arg0, int arg1, int arg2, int[] arg3) {
        if (arg2 != 3) {
            field1270 = !field1270;
        }
        field1278 = arg3;
        field1279 = arg1;
        field1280 = arg0;
        method475(455, 0, arg1, arg0, 0);
    }

    @OriginalMember(owner = "TQHEKXXC", name = "a", descriptor = "(I)V")
    public static void method474(int arg0) {
        if (arg0 < 1 || arg0 > 1) {
            field1275 = 111;
        }
        field1283 = 0;
        field1281 = 0;
        field1284 = field1279;
        field1282 = field1280;
        field1285 = field1284 - 1;
        field1286 = field1284 / 2;
    }

    @OriginalMember(owner = "TQHEKXXC", name = "a", descriptor = "(IIIII)V")
    public static void method475(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg4 < 0) {
            arg4 = 0;
        }
        if (arg2 > field1279) {
            arg2 = field1279;
        }
        if (arg3 > field1280) {
            arg3 = field1280;
        }
        field1283 = arg1;
        field1281 = arg4;
        int var5 = 93 / arg0;
        field1284 = arg2;
        field1282 = arg3;
        field1285 = field1284 - 1;
        field1286 = field1284 / 2;
        field1287 = field1282 / 2;
    }

    @OriginalMember(owner = "TQHEKXXC", name = "b", descriptor = "(I)V")
    public static void method476(int arg0) {
        while (arg0 >= 0) {
            field1270 = !field1270;
        }
        int var1 = field1280 * field1279;
        for (int var2 = 0; var2 < var1; var2++) {
            field1278[var2] = 0;
        }
    }

    @OriginalMember(owner = "TQHEKXXC", name = "a", descriptor = "(IIIIIII)V")
    public static void method477(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 < field1283) {
            arg2 -= field1283 - arg1;
            arg1 = field1283;
        }
        if (arg4 < field1281) {
            arg6 -= field1281 - arg4;
            arg4 = field1281;
        }
        if (arg1 + arg2 > field1284) {
            arg2 = field1284 - arg1;
        }
        if (arg4 + arg6 > field1282) {
            arg6 = field1282 - arg4;
        }
        int var7 = 256 - arg5;
        int var8 = (arg0 >> 16 & 0xFF) * arg5;
        int var9 = (arg0 >> 8 & 0xFF) * arg5;
        int var10 = (arg0 & 0xFF) * arg5;
        if (arg3 >= 0) {
            field1271 = -284;
        }
        int var11 = field1279 - arg2;
        int var12 = field1279 * arg4 + arg1;
        for (int var13 = 0; var13 < arg6; var13++) {
            for (int var14 = -arg2; var14 < 0; var14++) {
                int var15 = (field1278[var12] >> 16 & 0xFF) * var7;
                int var16 = (field1278[var12] >> 8 & 0xFF) * var7;
                int var17 = (field1278[var12] & 0xFF) * var7;
                int var18 = (var10 + var17 >> 8) + (var8 + var15 >> 8 << 16) + (var9 + var16 >> 8 << 8);
                field1278[var12++] = var18;
            }
            var12 += var11;
        }
    }

    @OriginalMember(owner = "TQHEKXXC", name = "a", descriptor = "(IIIIIB)V")
    public static void method478(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        if (arg5 != 1) {
            field1269 = -368;
        }
        if (arg1 < field1283) {
            arg0 -= field1283 - arg1;
            arg1 = field1283;
        }
        if (arg3 < field1281) {
            arg4 -= field1281 - arg3;
            arg3 = field1281;
        }
        if (arg0 + arg1 > field1284) {
            arg0 = field1284 - arg1;
        }
        if (arg3 + arg4 > field1282) {
            arg4 = field1282 - arg3;
        }
        int var6 = field1279 - arg0;
        int var7 = field1279 * arg3 + arg1;
        for (int var8 = -arg4; var8 < 0; var8++) {
            for (int var9 = -arg0; var9 < 0; var9++) {
                field1278[var7++] = arg2;
            }
            var7 += var6;
        }
    }

    @OriginalMember(owner = "TQHEKXXC", name = "a", descriptor = "(IIIIII)V")
    public static void method479(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 < 4 || arg4 > 4) {
            field1276 = -230;
        }
        method481(arg5, arg0, arg2, 2, arg3);
        method481(arg5, arg0, arg2, 2, arg1 + arg3 - 1);
        method483(5, arg0, arg3, arg5, arg1);
        method483(5, arg0, arg3, arg2 + arg5 - 1, arg1);
    }

    @OriginalMember(owner = "TQHEKXXC", name = "a", descriptor = "(IIIZIII)V")
    public static void method480(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        method482(arg5, arg2, arg1, arg0, -199, arg4);
        method482(arg5 + arg6 - 1, arg2, arg1, arg0, -199, arg4);
        if (arg3) {
            field1277 = !field1277;
        }
        if (arg6 >= 3) {
            method484(field1273, arg6 - 2, arg1, arg5 + 1, arg2, arg4);
            method484(field1273, arg6 - 2, arg1, arg5 + 1, arg0 + arg2 - 1, arg4);
        }
    }

    @OriginalMember(owner = "TQHEKXXC", name = "b", descriptor = "(IIIII)V")
    public static void method481(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (field1272 != arg3) {
            field1277 = !field1277;
        }
        if (arg4 < field1281 || arg4 >= field1282) {
            return;
        }
        if (arg0 < field1283) {
            arg2 -= field1283 - arg0;
            arg0 = field1283;
        }
        if (arg0 + arg2 > field1284) {
            arg2 = field1284 - arg0;
        }
        int var5 = field1279 * arg4 + arg0;
        for (int var6 = 0; var6 < arg2; var6++) {
            field1278[var5 + var6] = arg1;
        }
    }

    @OriginalMember(owner = "TQHEKXXC", name = "b", descriptor = "(IIIIII)V")
    public static void method482(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field1281 || arg0 >= field1282) {
            return;
        }
        if (arg1 < field1283) {
            arg3 -= field1283 - arg1;
            arg1 = field1283;
        }
        if (arg1 + arg3 > field1284) {
            arg3 = field1284 - arg1;
        }
        int var6 = 256 - arg2;
        int var7 = (arg5 >> 16 & 0xFF) * arg2;
        int var8 = (arg5 >> 8 & 0xFF) * arg2;
        int var9 = (arg5 & 0xFF) * arg2;
        int var10 = field1279 * arg0 + arg1;
        if (arg4 >= 0) {
            field1270 = !field1270;
        }
        for (int var11 = 0; var11 < arg3; var11++) {
            int var12 = (field1278[var10] >> 16 & 0xFF) * var6;
            int var13 = (field1278[var10] >> 8 & 0xFF) * var6;
            int var14 = (field1278[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field1278[var10++] = var15;
        }
    }

    @OriginalMember(owner = "TQHEKXXC", name = "c", descriptor = "(IIIII)V")
    public static void method483(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 < field1283 || arg3 >= field1284) {
            return;
        }
        if (arg2 < field1281) {
            arg4 -= field1281 - arg2;
            arg2 = field1281;
        }
        if (arg2 + arg4 > field1282) {
            arg4 = field1282 - arg2;
        }
        int var5 = field1279 * arg2 + arg3;
        if (arg0 != 5) {
            field1274 = 444;
        }
        for (int var6 = 0; var6 < arg4; var6++) {
            field1278[field1279 * var6 + var5] = arg1;
        }
    }

    @OriginalMember(owner = "TQHEKXXC", name = "c", descriptor = "(IIIIII)V")
    public static void method484(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 < field1283 || arg4 >= field1284) {
            return;
        }
        if (arg3 < field1281) {
            arg1 -= field1281 - arg3;
            arg3 = field1281;
        }
        if (arg1 + arg3 > field1282) {
            arg1 = field1282 - arg3;
        }
        int var6 = 256 - arg2;
        int var7 = (arg5 >> 16 & 0xFF) * arg2;
        int var8 = (arg5 >> 8 & 0xFF) * arg2;
        int var9 = (arg5 & 0xFF) * arg2;
        if (arg0 != 0) {
            return;
        }
        int var10 = field1279 * arg3 + arg4;
        for (int var11 = 0; var11 < arg1; var11++) {
            int var12 = (field1278[var10] >> 16 & 0xFF) * var6;
            int var13 = (field1278[var10] >> 8 & 0xFF) * var6;
            int var14 = (field1278[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field1278[var10] = var15;
            var10 += field1279;
        }
    }
}
