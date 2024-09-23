import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("UKUXLUWP")
public class class56 extends class10 {

    @OriginalMember(owner = "UKUXLUWP", name = "j", descriptor = "Z")
    private static boolean field1551 = true;

    @OriginalMember(owner = "UKUXLUWP", name = "k", descriptor = "I")
    private static int field1552 = 658;

    @OriginalMember(owner = "UKUXLUWP", name = "l", descriptor = "B")
    private static byte field1553 = 2;

    @OriginalMember(owner = "UKUXLUWP", name = "m", descriptor = "I")
    private static int field1554 = 490;

    @OriginalMember(owner = "UKUXLUWP", name = "o", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "UKUXLUWP", name = "p", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "UKUXLUWP", name = "q", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "UKUXLUWP", name = "r", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "UKUXLUWP", name = "s", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "UKUXLUWP", name = "t", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "UKUXLUWP", name = "u", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "UKUXLUWP", name = "v", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "UKUXLUWP", name = "w", descriptor = "I")
    public static int field1564;

    @OriginalMember(owner = "UKUXLUWP", name = "i", descriptor = "Z")
    private static boolean field1550;

    @OriginalMember(owner = "UKUXLUWP", name = "x", descriptor = "Z")
    public static boolean field1565;

    @OriginalMember(owner = "UKUXLUWP", name = "n", descriptor = "[I")
    public static int[] field1555;

    @OriginalMember(owner = "UKUXLUWP", name = "a", descriptor = "(I[IBI)V")
    public static void method541(int arg0, int[] arg1, byte arg2, int arg3) {
        field1555 = arg1;
        field1556 = arg0;
        field1557 = arg3;
        if (arg2 != 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        method543(0, 0, arg0, 134, arg3);
    }

    @OriginalMember(owner = "UKUXLUWP", name = "a", descriptor = "(I)V")
    public static void method542(int arg0) {
        field1560 = 0;
        if (arg0 <= 0) {
            field1550 = !field1550;
        }
        field1558 = 0;
        field1561 = field1556;
        field1559 = field1557;
        field1562 = field1561 - 1;
        field1563 = field1561 / 2;
    }

    @OriginalMember(owner = "UKUXLUWP", name = "a", descriptor = "(IIIII)V")
    public static void method543(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field1556) {
            arg2 = field1556;
        }
        if (arg4 > field1557) {
            arg4 = field1557;
        }
        field1560 = arg0;
        field1558 = arg1;
        field1561 = arg2;
        field1559 = arg4;
        int var5 = 54 / arg3;
        field1562 = field1561 - 1;
        field1563 = field1561 / 2;
        field1564 = field1559 / 2;
    }

    @OriginalMember(owner = "UKUXLUWP", name = "a", descriptor = "(B)V")
    public static void method544(byte arg0) {
        int var1 = field1557 * field1556;
        if (arg0 != -2) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        for (int var3 = 0; var3 < var1; var3++) {
            field1555[var3] = 0;
        }
    }

    @OriginalMember(owner = "UKUXLUWP", name = "a", descriptor = "(IIIIIII)V")
    public static void method545(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 < field1560) {
            arg6 -= field1560 - arg0;
            arg0 = field1560;
        }
        if (arg1 < field1558) {
            arg5 -= field1558 - arg1;
            arg1 = field1558;
        }
        if (arg0 + arg6 > field1561) {
            arg6 = field1561 - arg0;
        }
        if (arg1 + arg5 > field1559) {
            arg5 = field1559 - arg1;
        }
        int var7 = 256 - arg3;
        int var8 = (arg2 >> 16 & 0xFF) * arg3;
        int var9 = (arg2 >> 8 & 0xFF) * arg3;
        int var10 = (arg2 & 0xFF) * arg3;
        if (arg4 != 0) {
            field1551 = !field1551;
        }
        int var11 = field1556 - arg6;
        int var12 = field1556 * arg1 + arg0;
        for (int var13 = 0; var13 < arg5; var13++) {
            for (int var14 = -arg6; var14 < 0; var14++) {
                int var15 = (field1555[var12] >> 16 & 0xFF) * var7;
                int var16 = (field1555[var12] >> 8 & 0xFF) * var7;
                int var17 = (field1555[var12] & 0xFF) * var7;
                int var18 = (var10 + var17 >> 8) + (var8 + var15 >> 8 << 16) + (var9 + var16 >> 8 << 8);
                field1555[var12++] = var18;
            }
            var12 += var11;
        }
    }

    @OriginalMember(owner = "UKUXLUWP", name = "a", descriptor = "(IIZIII)V")
    public static void method546(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (!arg2) {
            return;
        }
        if (arg1 < field1560) {
            arg4 -= field1560 - arg1;
            arg1 = field1560;
        }
        if (arg3 < field1558) {
            arg5 -= field1558 - arg3;
            arg3 = field1558;
        }
        if (arg1 + arg4 > field1561) {
            arg4 = field1561 - arg1;
        }
        if (arg3 + arg5 > field1559) {
            arg5 = field1559 - arg3;
        }
        int var6 = field1556 - arg4;
        int var7 = field1556 * arg3 + arg1;
        for (int var8 = -arg5; var8 < 0; var8++) {
            for (int var9 = -arg4; var9 < 0; var9++) {
                field1555[var7++] = arg0;
            }
            var7 += var6;
        }
    }

    @OriginalMember(owner = "UKUXLUWP", name = "a", descriptor = "(IIIIII)V")
    public static void method547(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method549(0, arg4, arg1, arg5, arg3);
        method549(0, arg4, arg1 + arg2 - 1, arg5, arg3);
        method551(arg4, -663, arg2, arg3, arg1);
        if (arg0 > 0) {
            method551(arg4, -663, arg2, arg3 + arg5 - 1, arg1);
        }
    }

    @OriginalMember(owner = "UKUXLUWP", name = "a", descriptor = "(IIIIBII)V")
    public static void method548(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        if (arg4 != 43) {
            field1554 = 46;
        }
        method550(arg0, arg1, arg6, arg3, arg2, 0);
        method550(arg0 + arg5 - 1, arg1, arg6, arg3, arg2, 0);
        if (arg5 >= 3) {
            method552(arg0 + 1, arg2, arg3, arg5 - 2, false, arg6);
            method552(arg0 + 1, arg1 + arg2 - 1, arg3, arg5 - 2, false, arg6);
        }
    }

    @OriginalMember(owner = "UKUXLUWP", name = "b", descriptor = "(IIIII)V")
    public static void method549(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < field1558 || arg2 >= field1559) {
            return;
        }
        if (arg4 < field1560) {
            arg3 -= field1560 - arg4;
            arg4 = field1560;
        }
        if (arg3 + arg4 > field1561) {
            arg3 = field1561 - arg4;
        }
        int var5 = field1556 * arg2 + arg4;
        if (arg0 == 0) {
            for (int var6 = 0; var6 < arg3; var6++) {
                field1555[var5 + var6] = arg1;
            }
        }
    }

    @OriginalMember(owner = "UKUXLUWP", name = "b", descriptor = "(IIIIII)V")
    public static void method550(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 != 0 || (arg0 < field1558 || arg0 >= field1559)) {
            return;
        }
        if (arg4 < field1560) {
            arg1 -= field1560 - arg4;
            arg4 = field1560;
        }
        if (arg1 + arg4 > field1561) {
            arg1 = field1561 - arg4;
        }
        int var6 = 256 - arg3;
        int var7 = (arg2 >> 16 & 0xFF) * arg3;
        int var8 = (arg2 >> 8 & 0xFF) * arg3;
        int var9 = (arg2 & 0xFF) * arg3;
        int var10 = field1556 * arg0 + arg4;
        for (int var11 = 0; var11 < arg1; var11++) {
            int var12 = (field1555[var10] >> 16 & 0xFF) * var6;
            int var13 = (field1555[var10] >> 8 & 0xFF) * var6;
            int var14 = (field1555[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field1555[var10++] = var15;
        }
    }

    @OriginalMember(owner = "UKUXLUWP", name = "c", descriptor = "(IIIII)V")
    public static void method551(int arg0, int arg1, int arg2, int arg3, int arg4) {
        while (arg1 >= 0) {
            field1551 = !field1551;
        }
        if (arg3 < field1560 || arg3 >= field1561) {
            return;
        }
        if (arg4 < field1558) {
            arg2 -= field1558 - arg4;
            arg4 = field1558;
        }
        if (arg2 + arg4 > field1559) {
            arg2 = field1559 - arg4;
        }
        int var5 = field1556 * arg4 + arg3;
        for (int var6 = 0; var6 < arg2; var6++) {
            field1555[field1556 * var6 + var5] = arg0;
        }
    }

    @OriginalMember(owner = "UKUXLUWP", name = "a", descriptor = "(IIIIZI)V")
    public static void method552(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg1 < field1560 || arg1 >= field1561) {
            return;
        }
        if (arg0 < field1558) {
            arg3 -= field1558 - arg0;
            arg0 = field1558;
        }
        if (arg0 + arg3 > field1559) {
            arg3 = field1559 - arg0;
        }
        int var6 = 256 - arg2;
        int var7 = (arg5 >> 16 & 0xFF) * arg2;
        int var8 = (arg5 >> 8 & 0xFF) * arg2;
        int var9 = (arg5 & 0xFF) * arg2;
        if (arg4) {
            return;
        }
        int var10 = field1556 * arg0 + arg1;
        for (int var11 = 0; var11 < arg3; var11++) {
            int var12 = (field1555[var10] >> 16 & 0xFF) * var6;
            int var13 = (field1555[var10] >> 8 & 0xFF) * var6;
            int var14 = (field1555[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field1555[var10] = var15;
            var10 += field1556;
        }
    }
}
