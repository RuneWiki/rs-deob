import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("TTGPXKMD")
public class class53 extends class13 {

    @OriginalMember(owner = "TTGPXKMD", name = "j", descriptor = "Z")
    private static boolean field1366 = true;

    @OriginalMember(owner = "TTGPXKMD", name = "k", descriptor = "I")
    private static int field1367 = 27889;

    @OriginalMember(owner = "TTGPXKMD", name = "l", descriptor = "I")
    private static int field1368 = 531;

    @OriginalMember(owner = "TTGPXKMD", name = "m", descriptor = "I")
    private static int field1369;

    @OriginalMember(owner = "TTGPXKMD", name = "p", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "TTGPXKMD", name = "q", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "TTGPXKMD", name = "r", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "TTGPXKMD", name = "s", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "TTGPXKMD", name = "t", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "TTGPXKMD", name = "u", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "TTGPXKMD", name = "v", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "TTGPXKMD", name = "w", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "TTGPXKMD", name = "x", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "TTGPXKMD", name = "i", descriptor = "Z")
    private static boolean field1365;

    @OriginalMember(owner = "TTGPXKMD", name = "n", descriptor = "Z")
    private static boolean field1370;

    @OriginalMember(owner = "TTGPXKMD", name = "y", descriptor = "Z")
    public static boolean field1381;

    @OriginalMember(owner = "TTGPXKMD", name = "o", descriptor = "[I")
    public static int[] field1371;

    @OriginalMember(owner = "TTGPXKMD", name = "a", descriptor = "(Z[III)V")
    public static void method427(boolean arg0, int[] arg1, int arg2, int arg3) {
        field1371 = arg1;
        field1372 = arg3;
        field1373 = arg2;
        if (arg0) {
            method429(0, arg3, arg2, 0, (byte) -121);
        }
    }

    @OriginalMember(owner = "TTGPXKMD", name = "a", descriptor = "(I)V")
    public static void method428(int arg0) {
        field1376 = 0;
        field1374 = 0;
        field1377 = field1372;
        field1375 = field1373;
        if (arg0 >= 0) {
            field1370 = !field1370;
        }
        field1378 = field1377 - 1;
        field1379 = field1377 / 2;
    }

    @OriginalMember(owner = "TTGPXKMD", name = "a", descriptor = "(IIIIB)V")
    public static void method429(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg3 < 0) {
            arg3 = 0;
        }
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 > field1372) {
            arg1 = field1372;
        }
        if (arg2 > field1373) {
            arg2 = field1373;
        }
        field1376 = arg3;
        field1374 = arg0;
        field1377 = arg1;
        field1375 = arg2;
        field1378 = field1377 - 1;
        if (arg4 != -121) {
            field1370 = !field1370;
        }
        field1379 = field1377 / 2;
        field1380 = field1375 / 2;
    }

    @OriginalMember(owner = "TTGPXKMD", name = "b", descriptor = "(I)V")
    public static void method430(int arg0) {
        int var1 = field1373 * field1372;
        if (arg0 <= 0) {
            field1367 = 74;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            field1371[var2] = 0;
        }
    }

    @OriginalMember(owner = "TTGPXKMD", name = "a", descriptor = "(IIIIIII)V")
    public static void method431(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 < 2 || arg0 > 2) {
            field1369 = -165;
        }
        if (arg1 < field1376) {
            arg2 -= field1376 - arg1;
            arg1 = field1376;
        }
        if (arg5 < field1374) {
            arg6 -= field1374 - arg5;
            arg5 = field1374;
        }
        if (arg1 + arg2 > field1377) {
            arg2 = field1377 - arg1;
        }
        if (arg5 + arg6 > field1375) {
            arg6 = field1375 - arg5;
        }
        int var7 = 256 - arg4;
        int var8 = (arg3 >> 16 & 0xFF) * arg4;
        int var9 = (arg3 >> 8 & 0xFF) * arg4;
        int var10 = (arg3 & 0xFF) * arg4;
        int var11 = field1372 - arg2;
        int var12 = field1372 * arg5 + arg1;
        for (int var13 = 0; var13 < arg6; var13++) {
            for (int var14 = -arg2; var14 < 0; var14++) {
                int var15 = (field1371[var12] >> 16 & 0xFF) * var7;
                int var16 = (field1371[var12] >> 8 & 0xFF) * var7;
                int var17 = (field1371[var12] & 0xFF) * var7;
                int var18 = (var10 + var17 >> 8) + (var8 + var15 >> 8 << 16) + (var9 + var16 >> 8 << 8);
                field1371[var12++] = var18;
            }
            var12 += var11;
        }
    }

    @OriginalMember(owner = "TTGPXKMD", name = "a", descriptor = "(IIIZII)V")
    public static void method432(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (arg4 < field1376) {
            arg5 -= field1376 - arg4;
            arg4 = field1376;
        }
        if (arg1 < field1374) {
            arg2 -= field1374 - arg1;
            arg1 = field1374;
        }
        if (arg4 + arg5 > field1377) {
            arg5 = field1377 - arg4;
        }
        if (arg1 + arg2 > field1375) {
            arg2 = field1375 - arg1;
        }
        int var6 = field1372 - arg5;
        int var7 = field1372 * arg1 + arg4;
        for (int var8 = -arg2; var8 < 0; var8++) {
            for (int var9 = -arg5; var9 < 0; var9++) {
                field1371[var7++] = arg0;
            }
            var7 += var6;
        }
        if (arg3) {
            field1365 = !field1365;
        }
    }

    @OriginalMember(owner = "TTGPXKMD", name = "a", descriptor = "(IIIIII)V")
    public static void method433(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method435((byte) 1, arg1, arg2, arg3, arg0);
        method435((byte) 1, arg1 + arg5 - 1, arg2, arg3, arg0);
        method437(arg3, arg0, arg5, 617, arg1);
        int var6 = 63 / arg4;
        method437(arg3, arg0 + arg2 - 1, arg5, 617, arg1);
    }

    @OriginalMember(owner = "TTGPXKMD", name = "b", descriptor = "(IIIIIII)V")
    public static void method434(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        method436(arg0, arg2, arg4, arg5, false, arg3);
        method436(arg0 + arg6 - 1, arg2, arg4, arg5, false, arg3);
        if (arg1 != 1) {
            field1366 = !field1366;
        }
        if (arg6 >= 3) {
            method438(arg6 - 2, arg0 + 1, arg3, arg2, -34006, arg5);
            method438(arg6 - 2, arg0 + 1, arg3 + arg4 - 1, arg2, -34006, arg5);
        }
    }

    @OriginalMember(owner = "TTGPXKMD", name = "a", descriptor = "(BIIII)V")
    public static void method435(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 1 || (arg1 < field1374 || arg1 >= field1375)) {
            return;
        }
        if (arg4 < field1376) {
            arg2 -= field1376 - arg4;
            arg4 = field1376;
        }
        if (arg2 + arg4 > field1377) {
            arg2 = field1377 - arg4;
        }
        int var5 = field1372 * arg1 + arg4;
        for (int var6 = 0; var6 < arg2; var6++) {
            field1371[var5 + var6] = arg3;
        }
    }

    @OriginalMember(owner = "TTGPXKMD", name = "a", descriptor = "(IIIIZI)V")
    public static void method436(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg0 < field1374 || arg0 >= field1375) {
            return;
        }
        if (arg5 < field1376) {
            arg2 -= field1376 - arg5;
            arg5 = field1376;
        }
        if (arg2 + arg5 > field1377) {
            arg2 = field1377 - arg5;
        }
        int var6 = 256 - arg1;
        if (arg4) {
            field1368 = -237;
        }
        int var7 = (arg3 >> 16 & 0xFF) * arg1;
        int var8 = (arg3 >> 8 & 0xFF) * arg1;
        int var9 = (arg3 & 0xFF) * arg1;
        int var10 = field1372 * arg0 + arg5;
        for (int var11 = 0; var11 < arg2; var11++) {
            int var12 = (field1371[var10] >> 16 & 0xFF) * var6;
            int var13 = (field1371[var10] >> 8 & 0xFF) * var6;
            int var14 = (field1371[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field1371[var10++] = var15;
        }
    }

    @OriginalMember(owner = "TTGPXKMD", name = "a", descriptor = "(IIIII)V")
    public static void method437(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field1376 || arg1 >= field1377) {
            return;
        }
        if (arg4 < field1374) {
            arg2 -= field1374 - arg4;
            arg4 = field1374;
        }
        if (arg2 + arg4 > field1375) {
            arg2 = field1375 - arg4;
        }
        int var5 = field1372 * arg4 + arg1;
        if (arg3 <= 0) {
            field1365 = !field1365;
        }
        for (int var6 = 0; var6 < arg2; var6++) {
            field1371[field1372 * var6 + var5] = arg0;
        }
    }

    @OriginalMember(owner = "TTGPXKMD", name = "b", descriptor = "(IIIIII)V")
    public static void method438(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 != -34006) {
            field1369 = -117;
        }
        if (arg2 < field1376 || arg2 >= field1377) {
            return;
        }
        if (arg1 < field1374) {
            arg0 -= field1374 - arg1;
            arg1 = field1374;
        }
        if (arg0 + arg1 > field1375) {
            arg0 = field1375 - arg1;
        }
        int var6 = 256 - arg3;
        int var7 = (arg5 >> 16 & 0xFF) * arg3;
        int var8 = (arg5 >> 8 & 0xFF) * arg3;
        int var9 = (arg5 & 0xFF) * arg3;
        int var10 = field1372 * arg1 + arg2;
        for (int var11 = 0; var11 < arg0; var11++) {
            int var12 = (field1371[var10] >> 16 & 0xFF) * var6;
            int var13 = (field1371[var10] >> 8 & 0xFF) * var6;
            int var14 = (field1371[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field1371[var10] = var15;
            var10 += field1372;
        }
    }
}
