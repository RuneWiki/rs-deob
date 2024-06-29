import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!TYMHEFTS")
public class class58 extends class23 {

    @OriginalMember(owner = "client!TYMHEFTS", name = "i", descriptor = "I")
    private static int field1538 = 7;

    @OriginalMember(owner = "client!TYMHEFTS", name = "j", descriptor = "Z")
    private static boolean field1539 = true;

    @OriginalMember(owner = "client!TYMHEFTS", name = "k", descriptor = "B")
    private static byte field1540 = 9;

    @OriginalMember(owner = "client!TYMHEFTS", name = "o", descriptor = "I")
    private static int field1544 = 46523;

    @OriginalMember(owner = "client!TYMHEFTS", name = "l", descriptor = "B")
    private static byte field1541;

    @OriginalMember(owner = "client!TYMHEFTS", name = "m", descriptor = "I")
    private static int field1542;

    @OriginalMember(owner = "client!TYMHEFTS", name = "q", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!TYMHEFTS", name = "r", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!TYMHEFTS", name = "s", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!TYMHEFTS", name = "t", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!TYMHEFTS", name = "u", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!TYMHEFTS", name = "v", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!TYMHEFTS", name = "w", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!TYMHEFTS", name = "x", descriptor = "I")
    public static int field1553;

    @OriginalMember(owner = "client!TYMHEFTS", name = "y", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "client!TYMHEFTS", name = "n", descriptor = "Z")
    private static boolean field1543;

    @OriginalMember(owner = "client!TYMHEFTS", name = "A", descriptor = "Z")
    public static boolean field1555;

    @OriginalMember(owner = "client!TYMHEFTS", name = "p", descriptor = "[I")
    public static int[] field1545;

    @OriginalMember(owner = "client!TYMHEFTS", name = "a", descriptor = "([IIII)V")
    public static void method523(int[] arg0, int arg1, int arg2, int arg3) {
        field1545 = arg0;
        field1546 = arg3;
        field1547 = arg2;
        method525(32409, 0, 0, arg2, arg3);
        if (arg1 != 0) {
            field1539 = !field1539;
        }
    }

    @OriginalMember(owner = "client!TYMHEFTS", name = "a", descriptor = "(B)V")
    public static void method524(byte arg0) {
        field1550 = 0;
        field1548 = 0;
        field1551 = field1546;
        field1549 = field1547;
        field1552 = field1551 - 1;
        field1553 = field1551 / 2;
        if (field1540 == arg0) {
            boolean var1 = false;
        } else {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "client!TYMHEFTS", name = "a", descriptor = "(IIIII)V")
    public static void method525(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 < 0) {
            arg2 = 0;
        }
        if (arg4 > field1546) {
            arg4 = field1546;
        }
        if (arg3 > field1547) {
            arg3 = field1547;
        }
        field1550 = arg1;
        field1548 = arg2;
        field1551 = arg4;
        field1549 = arg3;
        field1552 = field1551 - 1;
        field1553 = field1551 / 2;
        field1554 = field1549 / 2;
        if (arg0 != 32409) {
            field1539 = !field1539;
        }
    }

    @OriginalMember(owner = "client!TYMHEFTS", name = "a", descriptor = "(I)V")
    public static void method526(int arg0) {
        if (arg0 != 30983) {
            field1538 = 352;
        }
        int var1 = field1547 * field1546;
        for (int var2 = 0; var2 < var1; var2++) {
            field1545[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!TYMHEFTS", name = "a", descriptor = "(IBIIIII)V")
    public static void method527(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 < field1550) {
            arg2 -= field1550 - arg3;
            arg3 = field1550;
        }
        if (arg5 < field1548) {
            arg0 -= field1548 - arg5;
            arg5 = field1548;
        }
        if (arg2 + arg3 > field1551) {
            arg2 = field1551 - arg3;
        }
        if (arg0 + arg5 > field1549) {
            arg0 = field1549 - arg5;
        }
        int var7 = 256 - arg4;
        int var8 = (arg6 >> 16 & 0xFF) * arg4;
        int var9 = (arg6 >> 8 & 0xFF) * arg4;
        int var10 = (arg6 & 0xFF) * arg4;
        int var11 = field1546 - arg2;
        int var12 = field1546 * arg5 + arg3;
        for (int var13 = 0; var13 < arg0; var13++) {
            for (int var15 = -arg2; var15 < 0; var15++) {
                int var16 = (field1545[var12] >> 16 & 0xFF) * var7;
                int var17 = (field1545[var12] >> 8 & 0xFF) * var7;
                int var18 = (field1545[var12] & 0xFF) * var7;
                int var19 = (var10 + var18 >> 8) + (var8 + var16 >> 8 << 16) + (var9 + var17 >> 8 << 8);
                field1545[var12++] = var19;
            }
            var12 += var11;
        }
        if (field1541 == arg1) {
            boolean var14 = false;
        }
    }

    @OriginalMember(owner = "client!TYMHEFTS", name = "a", descriptor = "(BIIIII)V")
    public static void method528(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 < field1550) {
            arg1 -= field1550 - arg3;
            arg3 = field1550;
        }
        if (arg2 < field1548) {
            arg4 -= field1548 - arg2;
            arg2 = field1548;
        }
        if (arg1 + arg3 > field1551) {
            arg1 = field1551 - arg3;
        }
        if (arg2 + arg4 > field1549) {
            arg4 = field1549 - arg2;
        }
        int var6 = field1546 - arg1;
        int var7 = field1546 * arg2 + arg3;
        if (arg0 != 1) {
            field1544 = -299;
        }
        for (int var8 = -arg4; var8 < 0; var8++) {
            for (int var9 = -arg1; var9 < 0; var9++) {
                field1545[var7++] = arg5;
            }
            var7 += var6;
        }
    }

    @OriginalMember(owner = "client!TYMHEFTS", name = "a", descriptor = "(IIIIII)V")
    public static void method529(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method531(arg3, arg0, arg4, arg5, 0);
        if (arg2 != 42741) {
            field1544 = 59;
        }
        method531(arg1 + arg3 - 1, arg0, arg4, arg5, 0);
        method533(arg1, arg4, arg3, 1, arg5);
        method533(arg1, arg4, arg3, 1, arg0 + arg5 - 1);
    }

    @OriginalMember(owner = "client!TYMHEFTS", name = "a", descriptor = "(IIIIIII)V")
    public static void method530(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        method532(arg4, arg5, arg0, arg3, (byte) 77, arg2);
        if (arg1 != 17146) {
            field1543 = !field1543;
        }
        method532(arg4, arg5, arg0, arg3, (byte) 77, arg2 + arg6 - 1);
        if (arg6 >= 3) {
            method534(arg6 - 2, arg4, arg3, arg2 + 1, true, arg0);
            method534(arg6 - 2, arg4, arg3, arg2 + 1, true, arg0 + arg5 - 1);
        }
    }

    @OriginalMember(owner = "client!TYMHEFTS", name = "b", descriptor = "(IIIII)V")
    public static void method531(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != 0) {
            field1542 = 55;
        }
        if (arg0 < field1548 || arg0 >= field1549) {
            return;
        }
        if (arg3 < field1550) {
            arg1 -= field1550 - arg3;
            arg3 = field1550;
        }
        if (arg1 + arg3 > field1551) {
            arg1 = field1551 - arg3;
        }
        int var5 = field1546 * arg0 + arg3;
        for (int var6 = 0; var6 < arg1; var6++) {
            field1545[var5 + var6] = arg2;
        }
    }

    @OriginalMember(owner = "client!TYMHEFTS", name = "a", descriptor = "(IIIIBI)V")
    public static void method532(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        if (arg5 < field1548 || arg5 >= field1549) {
            return;
        }
        if (arg2 < field1550) {
            arg1 -= field1550 - arg2;
            arg2 = field1550;
        }
        if (arg1 + arg2 > field1551) {
            arg1 = field1551 - arg2;
        }
        int var6 = 256 - arg3;
        int var7 = (arg0 >> 16 & 0xFF) * arg3;
        int var8 = (arg0 >> 8 & 0xFF) * arg3;
        int var9 = (arg0 & 0xFF) * arg3;
        if (arg4 != 77) {
            return;
        }
        int var10 = field1546 * arg5 + arg2;
        for (int var11 = 0; var11 < arg1; var11++) {
            int var12 = (field1545[var10] >> 16 & 0xFF) * var6;
            int var13 = (field1545[var10] >> 8 & 0xFF) * var6;
            int var14 = (field1545[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field1545[var10++] = var15;
        }
    }

    @OriginalMember(owner = "client!TYMHEFTS", name = "c", descriptor = "(IIIII)V")
    public static void method533(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != 1) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (arg4 < field1550 || arg4 >= field1551) {
            return;
        }
        if (arg2 < field1548) {
            arg0 -= field1548 - arg2;
            arg2 = field1548;
        }
        if (arg0 + arg2 > field1549) {
            arg0 = field1549 - arg2;
        }
        int var6 = field1546 * arg2 + arg4;
        for (int var7 = 0; var7 < arg0; var7++) {
            field1545[field1546 * var7 + var6] = arg1;
        }
    }

    @OriginalMember(owner = "client!TYMHEFTS", name = "a", descriptor = "(IIIIZI)V")
    public static void method534(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg5 < field1550 || arg5 >= field1551) {
            return;
        }
        if (arg3 < field1548) {
            arg0 -= field1548 - arg3;
            arg3 = field1548;
        }
        if (arg0 + arg3 > field1549) {
            arg0 = field1549 - arg3;
        }
        int var6 = 256 - arg2;
        if (!arg4) {
            field1543 = !field1543;
        }
        int var7 = (arg1 >> 16 & 0xFF) * arg2;
        int var8 = (arg1 >> 8 & 0xFF) * arg2;
        int var9 = (arg1 & 0xFF) * arg2;
        int var10 = field1546 * arg3 + arg5;
        for (int var11 = 0; var11 < arg0; var11++) {
            int var12 = (field1545[var10] >> 16 & 0xFF) * var6;
            int var13 = (field1545[var10] >> 8 & 0xFF) * var6;
            int var14 = (field1545[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field1545[var10] = var15;
            var10 += field1546;
        }
    }
}
