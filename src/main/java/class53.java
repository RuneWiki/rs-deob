import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("RSDCQVXF")
public class class53 extends class41 {

    @OriginalMember(owner = "RSDCQVXF", name = "h", descriptor = "I")
    private static int field1373 = -455;

    @OriginalMember(owner = "RSDCQVXF", name = "j", descriptor = "I")
    private static int field1375 = 125;

    @OriginalMember(owner = "RSDCQVXF", name = "k", descriptor = "Z")
    private static boolean field1376 = true;

    @OriginalMember(owner = "RSDCQVXF", name = "l", descriptor = "B")
    private static byte field1377 = -119;

    @OriginalMember(owner = "RSDCQVXF", name = "m", descriptor = "B")
    private static byte field1378 = 9;

    @OriginalMember(owner = "RSDCQVXF", name = "n", descriptor = "B")
    private static byte field1379 = -117;

    @OriginalMember(owner = "RSDCQVXF", name = "o", descriptor = "Z")
    private static boolean field1380 = true;

    @OriginalMember(owner = "RSDCQVXF", name = "i", descriptor = "I")
    private static int field1374;

    @OriginalMember(owner = "RSDCQVXF", name = "q", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "RSDCQVXF", name = "r", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "RSDCQVXF", name = "s", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "RSDCQVXF", name = "t", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "RSDCQVXF", name = "u", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "RSDCQVXF", name = "v", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "RSDCQVXF", name = "w", descriptor = "I")
    public static int field1388;

    @OriginalMember(owner = "RSDCQVXF", name = "x", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "RSDCQVXF", name = "y", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "RSDCQVXF", name = "z", descriptor = "Z")
    public static boolean field1391;

    @OriginalMember(owner = "RSDCQVXF", name = "p", descriptor = "[I")
    public static int[] field1381;

    @OriginalMember(owner = "RSDCQVXF", name = "a", descriptor = "(II[II)V")
    public static void method453(int arg0, int arg1, int[] arg2, int arg3) {
        if (arg0 >= 0) {
            field1374 = 226;
        }
        field1381 = arg2;
        field1382 = arg1;
        field1383 = arg3;
        method455(arg1, 1, arg3, 0, 0);
    }

    @OriginalMember(owner = "RSDCQVXF", name = "a", descriptor = "(Z)V")
    public static void method454(boolean arg0) {
        field1386 = 0;
        field1384 = 0;
        field1387 = field1382;
        field1385 = field1383;
        field1388 = field1387 - 1;
        if (arg0) {
            field1389 = field1387 / 2;
        }
    }

    @OriginalMember(owner = "RSDCQVXF", name = "a", descriptor = "(IIIII)V")
    public static void method455(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 < 0) {
            arg4 = 0;
        }
        if (arg3 < 0) {
            arg3 = 0;
        }
        if (arg0 > field1382) {
            arg0 = field1382;
        }
        if (arg2 > field1383) {
            arg2 = field1383;
        }
        field1386 = arg4;
        field1384 = arg3;
        if (arg1 < 1 || arg1 > 1) {
            field1380 = !field1380;
        }
        field1387 = arg0;
        field1385 = arg2;
        field1388 = field1387 - 1;
        field1389 = field1387 / 2;
        field1390 = field1385 / 2;
    }

    @OriginalMember(owner = "RSDCQVXF", name = "b", descriptor = "(Z)V")
    public static void method456(boolean arg0) {
        int var1 = field1383 * field1382;
        if (!arg0) {
            field1374 = 189;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            field1381[var2] = 0;
        }
    }

    @OriginalMember(owner = "RSDCQVXF", name = "a", descriptor = "(IIIIIII)V")
    public static void method457(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 != -34211) {
            return;
        }
        if (arg4 < field1386) {
            arg5 -= field1386 - arg4;
            arg4 = field1386;
        }
        if (arg6 < field1384) {
            arg2 -= field1384 - arg6;
            arg6 = field1384;
        }
        if (arg4 + arg5 > field1387) {
            arg5 = field1387 - arg4;
        }
        if (arg2 + arg6 > field1385) {
            arg2 = field1385 - arg6;
        }
        int var7 = 256 - arg0;
        int var8 = (arg1 >> 16 & 0xFF) * arg0;
        int var9 = (arg1 >> 8 & 0xFF) * arg0;
        int var10 = (arg1 & 0xFF) * arg0;
        int var11 = field1382 - arg5;
        int var12 = field1382 * arg6 + arg4;
        for (int var13 = 0; var13 < arg2; var13++) {
            for (int var14 = -arg5; var14 < 0; var14++) {
                int var15 = (field1381[var12] >> 16 & 0xFF) * var7;
                int var16 = (field1381[var12] >> 8 & 0xFF) * var7;
                int var17 = (field1381[var12] & 0xFF) * var7;
                int var18 = (var10 + var17 >> 8) + (var8 + var15 >> 8 << 16) + (var9 + var16 >> 8 << 8);
                field1381[var12++] = var18;
            }
            var12 += var11;
        }
    }

    @OriginalMember(owner = "RSDCQVXF", name = "a", descriptor = "(BIIIII)V")
    public static void method458(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 < field1386) {
            arg1 -= field1386 - arg4;
            arg4 = field1386;
        }
        if (arg3 < field1384) {
            arg5 -= field1384 - arg3;
            arg3 = field1384;
        }
        if (arg1 + arg4 > field1387) {
            arg1 = field1387 - arg4;
        }
        if (arg3 + arg5 > field1385) {
            arg5 = field1385 - arg3;
        }
        int var6 = field1382 - arg1;
        int var7 = field1382 * arg3 + arg4;
        for (int var8 = -arg5; var8 < 0; var8++) {
            for (int var9 = -arg1; var9 < 0; var9++) {
                field1381[var7++] = arg2;
            }
            var7 += var6;
        }
        if (field1377 != arg0) {
            field1376 = !field1376;
        }
    }

    @OriginalMember(owner = "RSDCQVXF", name = "a", descriptor = "(IIIIII)V")
    public static void method459(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method461(arg2, field1378, arg1, arg4, arg0);
        method461(arg2, field1378, arg1, arg3 + arg4 - 1, arg0);
        if (arg5 < 2 || arg5 > 2) {
            field1380 = !field1380;
        }
        method463(arg4, arg1, -429, arg0, arg3);
        method463(arg4, arg1 + arg2 - 1, -429, arg0, arg3);
    }

    @OriginalMember(owner = "RSDCQVXF", name = "a", descriptor = "(IIIIBII)V")
    public static void method460(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        method462(2, arg5, arg1, arg2, arg6, arg3);
        if (arg4 != 43) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        method462(2, arg5, arg1, arg0 + arg2 - 1, arg6, arg3);
        if (arg0 >= 3) {
            method464(arg5, arg2 + 1, arg1, -96, arg0 - 2, arg3);
            method464(arg5, arg2 + 1, arg1 + arg6 - 1, -96, arg0 - 2, arg3);
        }
    }

    @OriginalMember(owner = "RSDCQVXF", name = "a", descriptor = "(IBIII)V")
    public static void method461(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 9 || (arg3 < field1384 || arg3 >= field1385)) {
            return;
        }
        if (arg2 < field1386) {
            arg0 -= field1386 - arg2;
            arg2 = field1386;
        }
        if (arg0 + arg2 > field1387) {
            arg0 = field1387 - arg2;
        }
        int var5 = field1382 * arg3 + arg2;
        for (int var6 = 0; var6 < arg0; var6++) {
            field1381[var5 + var6] = arg4;
        }
    }

    @OriginalMember(owner = "RSDCQVXF", name = "b", descriptor = "(IIIIII)V")
    public static void method462(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 < field1384 || arg3 >= field1385) {
            return;
        }
        if (arg2 < field1386) {
            arg4 -= field1386 - arg2;
            arg2 = field1386;
        }
        if (arg2 + arg4 > field1387) {
            arg4 = field1387 - arg2;
        }
        int var6 = 256 - arg1;
        int var7 = (arg5 >> 16 & 0xFF) * arg1;
        int var8 = (arg5 >> 8 & 0xFF) * arg1;
        int var9 = (arg5 & 0xFF) * arg1;
        int var10 = field1382 * arg3 + arg2;
        for (int var11 = 0; var11 < arg4; var11++) {
            int var12 = (field1381[var10] >> 16 & 0xFF) * var6;
            int var13 = (field1381[var10] >> 8 & 0xFF) * var6;
            int var14 = (field1381[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field1381[var10++] = var15;
        }
        if (arg0 > 0) {
            ;
        }
    }

    @OriginalMember(owner = "RSDCQVXF", name = "b", descriptor = "(IIIII)V")
    public static void method463(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field1386 || arg1 >= field1387) {
            return;
        }
        if (arg0 < field1384) {
            arg4 -= field1384 - arg0;
            arg0 = field1384;
        }
        if (arg0 + arg4 > field1385) {
            arg4 = field1385 - arg0;
        }
        int var5 = field1382 * arg0 + arg1;
        if (arg2 >= 0) {
            field1373 = -477;
        }
        for (int var6 = 0; var6 < arg4; var6++) {
            field1381[field1382 * var6 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "RSDCQVXF", name = "c", descriptor = "(IIIIII)V")
    public static void method464(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 < field1386 || arg2 >= field1387) {
            return;
        }
        if (arg1 < field1384) {
            arg4 -= field1384 - arg1;
            arg1 = field1384;
        }
        if (arg1 + arg4 > field1385) {
            arg4 = field1385 - arg1;
        }
        int var6 = 256 - arg0;
        if (arg3 >= 0) {
            return;
        }
        int var7 = (arg5 >> 16 & 0xFF) * arg0;
        int var8 = (arg5 >> 8 & 0xFF) * arg0;
        int var9 = (arg5 & 0xFF) * arg0;
        int var10 = field1382 * arg1 + arg2;
        for (int var11 = 0; var11 < arg4; var11++) {
            int var12 = (field1381[var10] >> 16 & 0xFF) * var6;
            int var13 = (field1381[var10] >> 8 & 0xFF) * var6;
            int var14 = (field1381[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field1381[var10] = var15;
            var10 += field1382;
        }
    }
}
