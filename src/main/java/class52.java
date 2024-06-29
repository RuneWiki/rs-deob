import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!UJSJLLWF")
public class class52 extends class42 {

    @OriginalMember(owner = "client!UJSJLLWF", name = "h", descriptor = "Z")
    private static boolean field1431 = true;

    @OriginalMember(owner = "client!UJSJLLWF", name = "i", descriptor = "Z")
    private static boolean field1432 = true;

    @OriginalMember(owner = "client!UJSJLLWF", name = "j", descriptor = "B")
    private static byte field1433 = -47;

    @OriginalMember(owner = "client!UJSJLLWF", name = "k", descriptor = "I")
    private static int field1434 = 2;

    @OriginalMember(owner = "client!UJSJLLWF", name = "l", descriptor = "I")
    private static int field1435 = -549;

    @OriginalMember(owner = "client!UJSJLLWF", name = "n", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!UJSJLLWF", name = "o", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!UJSJLLWF", name = "p", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!UJSJLLWF", name = "q", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!UJSJLLWF", name = "r", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!UJSJLLWF", name = "s", descriptor = "I")
    public static int field1442;

    @OriginalMember(owner = "client!UJSJLLWF", name = "t", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!UJSJLLWF", name = "u", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client!UJSJLLWF", name = "v", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!UJSJLLWF", name = "w", descriptor = "Z")
    public static boolean field1446;

    @OriginalMember(owner = "client!UJSJLLWF", name = "m", descriptor = "[I")
    public static int[] field1436;

    @OriginalMember(owner = "client!UJSJLLWF", name = "a", descriptor = "([IIII)V")
    public static void method479(int[] arg0, int arg1, int arg2, int arg3) {
        if (arg1 >= 5 && arg1 <= 5) {
            field1436 = arg0;
            field1437 = arg2;
            field1438 = arg3;
            method481(0, 0, 0, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!UJSJLLWF", name = "a", descriptor = "(B)V")
    public static void method480(byte arg0) {
        field1441 = 0;
        field1439 = 0;
        field1442 = field1437;
        if (arg0 == 3) {
            field1440 = field1438;
            field1443 = field1442 - 1;
            field1444 = field1442 / 2;
        }
    }

    @OriginalMember(owner = "client!UJSJLLWF", name = "a", descriptor = "(IIIII)V")
    public static void method481(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg2 < 0) {
            arg2 = 0;
        }
        if (arg3 > field1437) {
            arg3 = field1437;
        }
        if (arg4 > field1438) {
            arg4 = field1438;
        }
        field1441 = arg0;
        field1439 = arg2;
        if (arg1 < 0 || arg1 > 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        field1442 = arg3;
        field1440 = arg4;
        field1443 = field1442 - 1;
        field1444 = field1442 / 2;
        field1445 = field1440 / 2;
    }

    @OriginalMember(owner = "client!UJSJLLWF", name = "a", descriptor = "(I)V")
    public static void method482(int arg0) {
        int var1 = field1438 * field1437;
        if (arg0 < 0) {
            for (int var2 = 0; var2 < var1; var2++) {
                field1436[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!UJSJLLWF", name = "a", descriptor = "(BIIIIII)V")
    public static void method483(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 < field1441) {
            arg6 -= field1441 - arg3;
            arg3 = field1441;
        }
        if (arg2 < field1439) {
            arg1 -= field1439 - arg2;
            arg2 = field1439;
        }
        if (arg3 + arg6 > field1442) {
            arg6 = field1442 - arg3;
        }
        if (arg1 + arg2 > field1440) {
            arg1 = field1440 - arg2;
        }
        int var7 = 256 - arg4;
        int var8 = (arg5 >> 16 & 0xFF) * arg4;
        int var9 = (arg5 >> 8 & 0xFF) * arg4;
        int var10 = (arg5 & 0xFF) * arg4;
        if (arg0 != -86) {
            return;
        }
        int var11 = field1437 - arg6;
        int var12 = field1437 * arg2 + arg3;
        for (int var13 = 0; var13 < arg1; var13++) {
            for (int var14 = -arg6; var14 < 0; var14++) {
                int var15 = (field1436[var12] >> 16 & 0xFF) * var7;
                int var16 = (field1436[var12] >> 8 & 0xFF) * var7;
                int var17 = (field1436[var12] & 0xFF) * var7;
                int var18 = (var10 + var17 >> 8) + (var8 + var15 >> 8 << 16) + (var9 + var16 >> 8 << 8);
                field1436[var12++] = var18;
            }
            var12 += var11;
        }
    }

    @OriginalMember(owner = "client!UJSJLLWF", name = "a", descriptor = "(IIIIII)V")
    public static void method484(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 < field1441) {
            arg5 -= field1441 - arg1;
            arg1 = field1441;
        }
        if (arg3 < field1439) {
            arg4 -= field1439 - arg3;
            arg3 = field1439;
        }
        if (arg1 + arg5 > field1442) {
            arg5 = field1442 - arg1;
        }
        if (arg3 + arg4 > field1440) {
            arg4 = field1440 - arg3;
        }
        int var6 = field1437 - arg5;
        int var7 = field1437 * arg3 + arg1;
        for (int var8 = -arg4; var8 < 0; var8++) {
            for (int var10 = -arg5; var10 < 0; var10++) {
                field1436[var7++] = arg0;
            }
            var7 += var6;
        }
        if (arg2 != 4) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
    }

    @OriginalMember(owner = "client!UJSJLLWF", name = "a", descriptor = "(ZIIIII)V")
    public static void method485(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method487(arg3, -115, arg4, arg2, arg1);
        method487(arg3, -115, arg4, arg2, arg1 + arg5 - 1);
        method489(arg4, field1433, arg3, arg5, arg1);
        method489(arg4, field1433, arg2 + arg3 - 1, arg5, arg1);
        if (arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client!UJSJLLWF", name = "a", descriptor = "(IIIIIIZ)V")
    public static void method486(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        method488(arg1, arg0, arg5, arg3, arg2, (byte) 6);
        if (arg6) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        method488(arg1, arg0, arg5, arg3 + arg4 - 1, arg2, (byte) 6);
        if (arg4 >= 3) {
            method490(arg3 + 1, arg1, arg4 - 2, arg2, 21453, arg0);
            method490(arg3 + 1, arg1 + arg5 - 1, arg4 - 2, arg2, 21453, arg0);
        }
    }

    @OriginalMember(owner = "client!UJSJLLWF", name = "b", descriptor = "(IIIII)V")
    public static void method487(int arg0, int arg1, int arg2, int arg3, int arg4) {
        label40: while (true) {
            if (arg1 >= 0) {
                int var7 = 1;
                while (true) {
                    if (var7 <= 0) {
                        continue label40;
                    }
                    var7++;
                }
            }
            if (arg4 >= field1439 && arg4 < field1440) {
                if (arg0 < field1441) {
                    arg3 -= field1441 - arg0;
                    arg0 = field1441;
                }
                if (arg0 + arg3 > field1442) {
                    arg3 = field1442 - arg0;
                }
                int var5 = field1437 * arg4 + arg0;
                for (int var6 = 0; var6 < arg3; var6++) {
                    field1436[var5 + var6] = arg2;
                }
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!UJSJLLWF", name = "a", descriptor = "(IIIIIB)V")
    public static void method488(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        if (arg5 != 6) {
            field1434 = -129;
        }
        if (arg3 < field1439 || arg3 >= field1440) {
            return;
        }
        if (arg0 < field1441) {
            arg2 -= field1441 - arg0;
            arg0 = field1441;
        }
        if (arg0 + arg2 > field1442) {
            arg2 = field1442 - arg0;
        }
        int var6 = 256 - arg4;
        int var7 = (arg1 >> 16 & 0xFF) * arg4;
        int var8 = (arg1 >> 8 & 0xFF) * arg4;
        int var9 = (arg1 & 0xFF) * arg4;
        int var10 = field1437 * arg3 + arg0;
        for (int var11 = 0; var11 < arg2; var11++) {
            int var12 = (field1436[var10] >> 16 & 0xFF) * var6;
            int var13 = (field1436[var10] >> 8 & 0xFF) * var6;
            int var14 = (field1436[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field1436[var10++] = var15;
        }
    }

    @OriginalMember(owner = "client!UJSJLLWF", name = "a", descriptor = "(IBIII)V")
    public static void method489(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg2 < field1441 || arg2 >= field1442) {
            return;
        }
        if (arg4 < field1439) {
            arg3 -= field1439 - arg4;
            arg4 = field1439;
        }
        if (arg3 + arg4 > field1440) {
            arg3 = field1440 - arg4;
        }
        int var5 = field1437 * arg4 + arg2;
        if (arg1 != -47) {
            field1431 = !field1431;
        }
        for (int var6 = 0; var6 < arg3; var6++) {
            field1436[field1437 * var6 + var5] = arg0;
        }
    }

    @OriginalMember(owner = "client!UJSJLLWF", name = "b", descriptor = "(IIIIII)V")
    public static void method490(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 < field1441 || arg1 >= field1442) {
            return;
        }
        if (arg0 < field1439) {
            arg2 -= field1439 - arg0;
            arg0 = field1439;
        }
        if (arg0 + arg2 > field1440) {
            arg2 = field1440 - arg0;
        }
        int var6 = 256 - arg3;
        int var7 = (arg5 >> 16 & 0xFF) * arg3;
        int var8 = (arg5 >> 8 & 0xFF) * arg3;
        int var9 = (arg5 & 0xFF) * arg3;
        if (arg4 != 21453) {
            field1432 = !field1432;
        }
        int var10 = field1437 * arg0 + arg1;
        for (int var11 = 0; var11 < arg2; var11++) {
            int var12 = (field1436[var10] >> 16 & 0xFF) * var6;
            int var13 = (field1436[var10] >> 8 & 0xFF) * var6;
            int var14 = (field1436[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field1436[var10] = var15;
            var10 += field1437;
        }
    }
}
