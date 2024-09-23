import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("SXFSGYHA")
public class class53 extends class30 {

    @OriginalMember(owner = "SXFSGYHA", name = "i", descriptor = "Z")
    private static boolean field1340 = true;

    @OriginalMember(owner = "SXFSGYHA", name = "j", descriptor = "I")
    private static int field1341 = 6;

    @OriginalMember(owner = "SXFSGYHA", name = "k", descriptor = "I")
    private static int field1342 = 43417;

    @OriginalMember(owner = "SXFSGYHA", name = "l", descriptor = "I")
    private static int field1343 = -426;

    @OriginalMember(owner = "SXFSGYHA", name = "m", descriptor = "B")
    private static byte field1344 = 79;

    @OriginalMember(owner = "SXFSGYHA", name = "o", descriptor = "I")
    private static int field1346 = 851;

    @OriginalMember(owner = "SXFSGYHA", name = "q", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "SXFSGYHA", name = "r", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "SXFSGYHA", name = "s", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "SXFSGYHA", name = "t", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "SXFSGYHA", name = "u", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "SXFSGYHA", name = "v", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "SXFSGYHA", name = "w", descriptor = "I")
    public static int field1354;

    @OriginalMember(owner = "SXFSGYHA", name = "x", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "SXFSGYHA", name = "y", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "SXFSGYHA", name = "n", descriptor = "Z")
    private static boolean field1345;

    @OriginalMember(owner = "SXFSGYHA", name = "z", descriptor = "Z")
    public static boolean field1357;

    @OriginalMember(owner = "SXFSGYHA", name = "p", descriptor = "[I")
    public static int[] field1347;

    @OriginalMember(owner = "SXFSGYHA", name = "a", descriptor = "(I[III)V")
    public static void method516(int arg0, int[] arg1, int arg2, int arg3) {
        field1347 = arg1;
        field1348 = arg0;
        if (arg3 < field1341 || arg3 > field1341) {
            field1346 = 168;
        }
        field1349 = arg2;
        method518(0, 0, arg0, arg2, 0);
    }

    @OriginalMember(owner = "SXFSGYHA", name = "a", descriptor = "(I)V")
    public static void method517(int arg0) {
        field1352 = 0;
        field1350 = 0;
        field1353 = field1348;
        field1351 = field1349;
        field1354 = field1353 - 1;
        if (field1342 == arg0) {
            field1355 = field1353 / 2;
        }
    }

    @OriginalMember(owner = "SXFSGYHA", name = "a", descriptor = "(IIIII)V")
    public static void method518(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 < 0) {
            arg4 = 0;
        }
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg2 > field1348) {
            arg2 = field1348;
        }
        if (arg3 > field1349) {
            arg3 = field1349;
        }
        field1352 = arg4;
        if (arg1 != 0) {
            field1340 = !field1340;
        }
        field1350 = arg0;
        field1353 = arg2;
        field1351 = arg3;
        field1354 = field1353 - 1;
        field1355 = field1353 / 2;
        field1356 = field1351 / 2;
    }

    @OriginalMember(owner = "SXFSGYHA", name = "a", descriptor = "(Z)V")
    public static void method519(boolean arg0) {
        int var1 = field1349 * field1348;
        if (!arg0) {
            for (int var2 = 0; var2 < var1; var2++) {
                field1347[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "SXFSGYHA", name = "a", descriptor = "(IIIIIII)V")
    public static void method520(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg6 < field1352) {
            arg5 -= field1352 - arg6;
            arg6 = field1352;
        }
        if (arg1 < field1350) {
            arg3 -= field1350 - arg1;
            arg1 = field1350;
        }
        if (arg5 + arg6 > field1353) {
            arg5 = field1353 - arg6;
        }
        if (arg1 + arg3 > field1351) {
            arg3 = field1351 - arg1;
        }
        int var7 = 256 - arg4;
        int var8 = (arg0 >> 16 & 0xFF) * arg4;
        int var9 = (arg0 >> 8 & 0xFF) * arg4;
        int var10 = (arg0 & 0xFF) * arg4;
        int var11 = 34 / arg2;
        int var12 = field1348 - arg5;
        int var13 = field1348 * arg1 + arg6;
        for (int var14 = 0; var14 < arg3; var14++) {
            for (int var15 = -arg5; var15 < 0; var15++) {
                int var16 = (field1347[var13] >> 16 & 0xFF) * var7;
                int var17 = (field1347[var13] >> 8 & 0xFF) * var7;
                int var18 = (field1347[var13] & 0xFF) * var7;
                int var19 = (var10 + var18 >> 8) + (var8 + var16 >> 8 << 16) + (var9 + var17 >> 8 << 8);
                field1347[var13++] = var19;
            }
            var13 += var12;
        }
    }

    @OriginalMember(owner = "SXFSGYHA", name = "a", descriptor = "(IIIIII)V")
    public static void method521(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 < field1352) {
            arg2 -= field1352 - arg3;
            arg3 = field1352;
        }
        if (arg4 < field1350) {
            arg5 -= field1350 - arg4;
            arg4 = field1350;
        }
        if (arg2 + arg3 > field1353) {
            arg2 = field1353 - arg3;
        }
        if (arg4 + arg5 > field1351) {
            arg5 = field1351 - arg4;
        }
        int var6 = field1348 - arg2;
        while (arg1 >= 0) {
            field1345 = !field1345;
        }
        int var7 = field1348 * arg4 + arg3;
        for (int var8 = -arg5; var8 < 0; var8++) {
            for (int var9 = -arg2; var9 < 0; var9++) {
                field1347[var7++] = arg0;
            }
            var7 += var6;
        }
    }

    @OriginalMember(owner = "SXFSGYHA", name = "b", descriptor = "(IIIIII)V")
    public static void method522(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method524(arg5, arg1, arg0, arg2, -81);
        method524(arg4 + arg5 - 1, arg1, arg0, arg2, -81);
        method526(arg0, arg4, (byte) 88, arg1, arg5);
        if (arg3 != 23829) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        method526(arg0, arg4, (byte) 88, arg1 + arg2 - 1, arg5);
    }

    @OriginalMember(owner = "SXFSGYHA", name = "b", descriptor = "(IIIIIII)V")
    public static void method523(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        method525(arg4, arg1, arg3, arg0, arg2, 0);
        if (arg5 >= 0) {
            return;
        }
        method525(arg4 + arg6 - 1, arg1, arg3, arg0, arg2, 0);
        if (arg6 >= 3) {
            method527(969, arg0, arg4 + 1, arg2, arg1, arg6 - 2);
            method527(969, arg0 + arg3 - 1, arg4 + 1, arg2, arg1, arg6 - 2);
        }
    }

    @OriginalMember(owner = "SXFSGYHA", name = "b", descriptor = "(IIIII)V")
    public static void method524(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 >= 0 || (arg0 < field1350 || arg0 >= field1351)) {
            return;
        }
        if (arg1 < field1352) {
            arg3 -= field1352 - arg1;
            arg1 = field1352;
        }
        if (arg1 + arg3 > field1353) {
            arg3 = field1353 - arg1;
        }
        int var5 = field1348 * arg0 + arg1;
        for (int var6 = 0; var6 < arg3; var6++) {
            field1347[var5 + var6] = arg2;
        }
    }

    @OriginalMember(owner = "SXFSGYHA", name = "c", descriptor = "(IIIIII)V")
    public static void method525(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field1350 || arg0 >= field1351) {
            return;
        }
        if (arg3 < field1352) {
            arg2 -= field1352 - arg3;
            arg3 = field1352;
        }
        if (arg2 + arg3 > field1353) {
            arg2 = field1353 - arg3;
        }
        int var6 = 256 - arg4;
        int var7 = (arg1 >> 16 & 0xFF) * arg4;
        int var8 = (arg1 >> 8 & 0xFF) * arg4;
        int var9 = (arg1 & 0xFF) * arg4;
        int var10 = field1348 * arg0 + arg3;
        if (arg5 != 0) {
            return;
        }
        for (int var11 = 0; var11 < arg2; var11++) {
            int var12 = (field1347[var10] >> 16 & 0xFF) * var6;
            int var13 = (field1347[var10] >> 8 & 0xFF) * var6;
            int var14 = (field1347[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field1347[var10++] = var15;
        }
    }

    @OriginalMember(owner = "SXFSGYHA", name = "a", descriptor = "(IIBII)V")
    public static void method526(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg3 < field1352 || arg3 >= field1353) {
            return;
        }
        if (arg4 < field1350) {
            arg1 -= field1350 - arg4;
            arg4 = field1350;
        }
        if (arg1 + arg4 > field1351) {
            arg1 = field1351 - arg4;
        }
        int var5 = field1348 * arg4 + arg3;
        if (arg2 != 88) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        for (int var7 = 0; var7 < arg1; var7++) {
            field1347[field1348 * var7 + var5] = arg0;
        }
    }

    @OriginalMember(owner = "SXFSGYHA", name = "d", descriptor = "(IIIIII)V")
    public static void method527(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 < field1352 || arg1 >= field1353) {
            return;
        }
        if (arg2 < field1350) {
            arg5 -= field1350 - arg2;
            arg2 = field1350;
        }
        if (arg2 + arg5 > field1351) {
            arg5 = field1351 - arg2;
        }
        int var6 = 256 - arg3;
        int var7 = (arg4 >> 16 & 0xFF) * arg3;
        int var8 = (arg4 >> 8 & 0xFF) * arg3;
        int var9 = (arg4 & 0xFF) * arg3;
        int var10 = field1348 * arg2 + arg1;
        for (int var11 = 0; var11 < arg5; var11++) {
            int var12 = (field1347[var10] >> 16 & 0xFF) * var6;
            int var13 = (field1347[var10] >> 8 & 0xFF) * var6;
            int var14 = (field1347[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field1347[var10] = var15;
            var10 += field1348;
        }
        if (arg0 > 0) {
            ;
        }
    }
}
