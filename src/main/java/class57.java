import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!TIJYBGAE")
public class class57 extends class26 {

    @OriginalMember(owner = "client!TIJYBGAE", name = "k", descriptor = "I")
    private static int field1528 = -803;

    @OriginalMember(owner = "client!TIJYBGAE", name = "j", descriptor = "I")
    private static int field1527;

    @OriginalMember(owner = "client!TIJYBGAE", name = "m", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!TIJYBGAE", name = "n", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!TIJYBGAE", name = "o", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!TIJYBGAE", name = "p", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!TIJYBGAE", name = "q", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "client!TIJYBGAE", name = "r", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!TIJYBGAE", name = "s", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!TIJYBGAE", name = "t", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!TIJYBGAE", name = "u", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!TIJYBGAE", name = "v", descriptor = "Z")
    public static boolean field1539;

    @OriginalMember(owner = "client!TIJYBGAE", name = "l", descriptor = "[I")
    public static int[] field1529;

    @OriginalMember(owner = "client!TIJYBGAE", name = "a", descriptor = "(II[II)V")
    public static void method487(int arg0, int arg1, int[] arg2, int arg3) {
        field1529 = arg2;
        if (arg3 <= 0) {
            field1527 = 371;
        }
        field1530 = arg0;
        field1531 = arg1;
        method489(arg1, 0, -34121, 0, arg0);
    }

    @OriginalMember(owner = "client!TIJYBGAE", name = "a", descriptor = "(I)V")
    public static void method488(int arg0) {
        field1534 = 0;
        field1532 = 0;
        field1535 = field1530;
        field1533 = field1531;
        field1536 = field1535 - 1;
        if (arg0 < 0) {
            field1537 = field1535 / 2;
        }
    }

    @OriginalMember(owner = "client!TIJYBGAE", name = "a", descriptor = "(IIIII)V")
    public static void method489(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg3 < 0) {
            arg3 = 0;
        }
        if (arg4 > field1530) {
            arg4 = field1530;
        }
        if (arg0 > field1531) {
            arg0 = field1531;
        }
        field1534 = arg1;
        field1532 = arg3;
        field1535 = arg4;
        field1533 = arg0;
        if (arg2 == -34121) {
            field1536 = field1535 - 1;
            field1537 = field1535 / 2;
            field1538 = field1533 / 2;
        }
    }

    @OriginalMember(owner = "client!TIJYBGAE", name = "b", descriptor = "(I)V")
    public static void method490(int arg0) {
        int var1 = field1531 * field1530;
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        for (int var3 = 0; var3 < var1; var3++) {
            field1529[var3] = 0;
        }
    }

    @OriginalMember(owner = "client!TIJYBGAE", name = "a", descriptor = "(IIIIIII)V")
    public static void method491(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 != -47082) {
            return;
        }
        if (arg1 < field1534) {
            arg5 -= field1534 - arg1;
            arg1 = field1534;
        }
        if (arg3 < field1532) {
            arg0 -= field1532 - arg3;
            arg3 = field1532;
        }
        if (arg1 + arg5 > field1535) {
            arg5 = field1535 - arg1;
        }
        if (arg0 + arg3 > field1533) {
            arg0 = field1533 - arg3;
        }
        int var7 = 256 - arg4;
        int var8 = (arg6 >> 16 & 0xFF) * arg4;
        int var9 = (arg6 >> 8 & 0xFF) * arg4;
        int var10 = (arg6 & 0xFF) * arg4;
        int var11 = field1530 - arg5;
        int var12 = field1530 * arg3 + arg1;
        for (int var13 = 0; var13 < arg0; var13++) {
            for (int var14 = -arg5; var14 < 0; var14++) {
                int var15 = (field1529[var12] >> 16 & 0xFF) * var7;
                int var16 = (field1529[var12] >> 8 & 0xFF) * var7;
                int var17 = (field1529[var12] & 0xFF) * var7;
                int var18 = (var10 + var17 >> 8) + (var8 + var15 >> 8 << 16) + (var9 + var16 >> 8 << 8);
                field1529[var12++] = var18;
            }
            var12 += var11;
        }
    }

    @OriginalMember(owner = "client!TIJYBGAE", name = "a", descriptor = "(IIIIII)V")
    public static void method492(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 < field1534) {
            arg0 -= field1534 - arg5;
            arg5 = field1534;
        }
        if (arg1 < field1532) {
            arg4 -= field1532 - arg1;
            arg1 = field1532;
        }
        if (arg0 + arg5 > field1535) {
            arg0 = field1535 - arg5;
        }
        if (arg1 + arg4 > field1533) {
            arg4 = field1533 - arg1;
        }
        int var6 = field1530 - arg0;
        int var7 = field1530 * arg1 + arg5;
        if (arg3 >= 0) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        for (int var9 = -arg4; var9 < 0; var9++) {
            for (int var10 = -arg0; var10 < 0; var10++) {
                field1529[var7++] = arg2;
            }
            var7 += var6;
        }
    }

    @OriginalMember(owner = "client!TIJYBGAE", name = "a", descriptor = "(IIIIBI)V")
    public static void method493(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        if (arg4 == 0) {
            boolean var6 = false;
        } else {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        method495(9, arg3, arg0, arg5, arg1);
        method495(9, arg2 + arg3 - 1, arg0, arg5, arg1);
        method497(arg3, 0, arg2, arg5, arg0);
        method497(arg3, 0, arg2, arg1 + arg5 - 1, arg0);
    }

    @OriginalMember(owner = "client!TIJYBGAE", name = "a", descriptor = "(IIIIIIZ)V")
    public static void method494(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg6) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        method496(arg0, arg4, (byte) -39, arg3, arg1, arg2);
        method496(arg0, arg4, (byte) -39, arg3, arg1, arg2 + arg5 - 1);
        if (arg5 >= 3) {
            method498(arg2 + 1, arg3, arg0, 5, arg5 - 2, arg1);
            method498(arg2 + 1, arg3, arg0, 5, arg5 - 2, arg1 + arg4 - 1);
        }
    }

    @OriginalMember(owner = "client!TIJYBGAE", name = "b", descriptor = "(IIIII)V")
    public static void method495(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < 9 || arg0 > 9) {
            field1528 = 447;
        }
        if (arg1 < field1532 || arg1 >= field1533) {
            return;
        }
        if (arg3 < field1534) {
            arg4 -= field1534 - arg3;
            arg3 = field1534;
        }
        if (arg3 + arg4 > field1535) {
            arg4 = field1535 - arg3;
        }
        int var5 = field1530 * arg1 + arg3;
        for (int var6 = 0; var6 < arg4; var6++) {
            field1529[var5 + var6] = arg2;
        }
    }

    @OriginalMember(owner = "client!TIJYBGAE", name = "a", descriptor = "(IIBIII)V")
    public static void method496(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        if (arg5 < field1532 || arg5 >= field1533) {
            return;
        }
        if (arg4 < field1534) {
            arg1 -= field1534 - arg4;
            arg4 = field1534;
        }
        if (arg1 + arg4 > field1535) {
            arg1 = field1535 - arg4;
        }
        int var6 = 256 - arg0;
        int var7 = (arg3 >> 16 & 0xFF) * arg0;
        int var8 = (arg3 >> 8 & 0xFF) * arg0;
        int var9 = (arg3 & 0xFF) * arg0;
        if (arg2 != -39) {
            for (int var10 = 1; var10 > 0; var10++) {
            }
        }
        int var11 = field1530 * arg5 + arg4;
        for (int var12 = 0; var12 < arg1; var12++) {
            int var13 = (field1529[var11] >> 16 & 0xFF) * var6;
            int var14 = (field1529[var11] >> 8 & 0xFF) * var6;
            int var15 = (field1529[var11] & 0xFF) * var6;
            int var16 = (var9 + var15 >> 8) + (var7 + var13 >> 8 << 16) + (var8 + var14 >> 8 << 8);
            field1529[var11++] = var16;
        }
    }

    @OriginalMember(owner = "client!TIJYBGAE", name = "c", descriptor = "(IIIII)V")
    public static void method497(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 0 || (arg3 < field1534 || arg3 >= field1535)) {
            return;
        }
        if (arg0 < field1532) {
            arg2 -= field1532 - arg0;
            arg0 = field1532;
        }
        if (arg0 + arg2 > field1533) {
            arg2 = field1533 - arg0;
        }
        int var5 = field1530 * arg0 + arg3;
        for (int var6 = 0; var6 < arg2; var6++) {
            field1529[field1530 * var6 + var5] = arg4;
        }
    }

    @OriginalMember(owner = "client!TIJYBGAE", name = "b", descriptor = "(IIIIII)V")
    public static void method498(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 < field1534 || arg5 >= field1535) {
            return;
        }
        if (arg0 < field1532) {
            arg4 -= field1532 - arg0;
            arg0 = field1532;
        }
        if (arg0 + arg4 > field1533) {
            arg4 = field1533 - arg0;
        }
        int var6 = 256 - arg2;
        int var7 = (arg1 >> 16 & 0xFF) * arg2;
        int var8 = (arg1 >> 8 & 0xFF) * arg2;
        int var9 = (arg1 & 0xFF) * arg2;
        int var10 = field1530 * arg0 + arg5;
        for (int var11 = 0; var11 < arg4; var11++) {
            int var12 = (field1529[var10] >> 16 & 0xFF) * var6;
            int var13 = (field1529[var10] >> 8 & 0xFF) * var6;
            int var14 = (field1529[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field1529[var10] = var15;
            var10 += field1530;
        }
        if (arg3 < 5 || arg3 > 5) {
            ;
        }
    }
}
