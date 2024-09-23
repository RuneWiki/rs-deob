import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("VDGJUQAS")
public class class62 extends class36 {

    @OriginalMember(owner = "VDGJUQAS", name = "k", descriptor = "Z")
    private static boolean field1526 = true;

    @OriginalMember(owner = "VDGJUQAS", name = "l", descriptor = "I")
    private static int field1527 = -69;

    @OriginalMember(owner = "VDGJUQAS", name = "i", descriptor = "I")
    private static int field1524;

    @OriginalMember(owner = "VDGJUQAS", name = "j", descriptor = "I")
    private static int field1525;

    @OriginalMember(owner = "VDGJUQAS", name = "n", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "VDGJUQAS", name = "o", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "VDGJUQAS", name = "p", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "VDGJUQAS", name = "q", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "VDGJUQAS", name = "r", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "VDGJUQAS", name = "s", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "VDGJUQAS", name = "t", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "VDGJUQAS", name = "u", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "VDGJUQAS", name = "v", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "VDGJUQAS", name = "w", descriptor = "Z")
    public static boolean field1538;

    @OriginalMember(owner = "VDGJUQAS", name = "m", descriptor = "[I")
    public static int[] field1528;

    @OriginalMember(owner = "VDGJUQAS", name = "a", descriptor = "([IIII)V")
    public static void method512(int[] arg0, int arg1, int arg2, int arg3) {
        field1528 = arg0;
        while (arg2 >= 0) {
        }
        field1529 = arg3;
        field1530 = arg1;
        method514(0, 0, arg1, arg3, 0);
    }

    @OriginalMember(owner = "VDGJUQAS", name = "a", descriptor = "(I)V")
    public static void method513(int arg0) {
        field1533 = 0;
        field1531 = 0;
        field1534 = field1529;
        field1532 = field1530;
        if (arg0 == -30460) {
            field1535 = field1534 - 1;
            field1536 = field1534 / 2;
        }
    }

    @OriginalMember(owner = "VDGJUQAS", name = "a", descriptor = "(IIIII)V")
    public static void method514(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg3 > field1529) {
            arg3 = field1529;
        }
        if (arg2 > field1530) {
            arg2 = field1530;
        }
        field1533 = arg0;
        if (arg4 != 0) {
            return;
        }
        field1531 = arg1;
        field1534 = arg3;
        field1532 = arg2;
        field1535 = field1534 - 1;
        field1536 = field1534 / 2;
        field1537 = field1532 / 2;
    }

    @OriginalMember(owner = "VDGJUQAS", name = "a", descriptor = "(B)V")
    public static void method515(byte arg0) {
        int var1 = field1530 * field1529;
        if (arg0 != 75) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        for (int var3 = 0; var3 < var1; var3++) {
            field1528[var3] = 0;
        }
    }

    @OriginalMember(owner = "VDGJUQAS", name = "a", descriptor = "(IIIIIII)V")
    public static void method516(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 < field1533) {
            arg1 -= field1533 - arg4;
            arg4 = field1533;
        }
        if (arg6 < field1531) {
            arg3 -= field1531 - arg6;
            arg6 = field1531;
        }
        if (arg1 + arg4 > field1534) {
            arg1 = field1534 - arg4;
        }
        if (arg3 + arg6 > field1532) {
            arg3 = field1532 - arg6;
        }
        int var7 = 256 - arg2;
        int var8 = (arg5 >> 16 & 0xFF) * arg2;
        int var9 = (arg5 >> 8 & 0xFF) * arg2;
        int var10 = (arg5 & 0xFF) * arg2;
        if (arg0 != 27370) {
            return;
        }
        int var11 = field1529 - arg1;
        int var12 = field1529 * arg6 + arg4;
        for (int var13 = 0; var13 < arg3; var13++) {
            for (int var14 = -arg1; var14 < 0; var14++) {
                int var15 = (field1528[var12] >> 16 & 0xFF) * var7;
                int var16 = (field1528[var12] >> 8 & 0xFF) * var7;
                int var17 = (field1528[var12] & 0xFF) * var7;
                int var18 = (var10 + var17 >> 8) + (var8 + var15 >> 8 << 16) + (var9 + var16 >> 8 << 8);
                field1528[var12++] = var18;
            }
            var12 += var11;
        }
    }

    @OriginalMember(owner = "VDGJUQAS", name = "a", descriptor = "(IIIIZI)V")
    public static void method517(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg2 < field1533) {
            arg3 -= field1533 - arg2;
            arg2 = field1533;
        }
        if (arg5 < field1531) {
            arg0 -= field1531 - arg5;
            arg5 = field1531;
        }
        if (arg2 + arg3 > field1534) {
            arg3 = field1534 - arg2;
        }
        if (arg0 + arg5 > field1532) {
            arg0 = field1532 - arg5;
        }
        int var6 = field1529 - arg3;
        if (arg4) {
            return;
        }
        int var7 = field1529 * arg5 + arg2;
        for (int var8 = -arg0; var8 < 0; var8++) {
            for (int var9 = -arg3; var9 < 0; var9++) {
                field1528[var7++] = arg1;
            }
            var7 += var6;
        }
    }

    @OriginalMember(owner = "VDGJUQAS", name = "a", descriptor = "(IIIIII)V")
    public static void method518(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method520(arg5, arg4, arg2, arg3, field1524);
        method520(arg0 + arg5 - 1, arg4, arg2, arg3, field1524);
        method522(arg3, arg2, arg0, arg5, true);
        if (arg1 < 0) {
            method522(arg3, arg2 + arg4 - 1, arg0, arg5, true);
        }
    }

    @OriginalMember(owner = "VDGJUQAS", name = "a", descriptor = "(IIIIIIZ)V")
    public static void method519(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg6) {
            return;
        }
        method521(field1525, arg0, arg4, arg1, arg2, arg3);
        method521(field1525, arg0, arg4, arg1, arg2 + arg5 - 1, arg3);
        if (arg5 >= 3) {
            method523(arg2 + 1, arg5 - 2, arg1, arg3, arg4, true);
            method523(arg2 + 1, arg5 - 2, arg0 + arg1 - 1, arg3, arg4, true);
        }
    }

    @OriginalMember(owner = "VDGJUQAS", name = "b", descriptor = "(IIIII)V")
    public static void method520(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != 0) {
            field1526 = true;
        }
        if (arg0 < field1531 || arg0 >= field1532) {
            return;
        }
        if (arg2 < field1533) {
            arg1 -= field1533 - arg2;
            arg2 = field1533;
        }
        if (arg1 + arg2 > field1534) {
            arg1 = field1534 - arg2;
        }
        int var5 = field1529 * arg0 + arg2;
        for (int var6 = 0; var6 < arg1; var6++) {
            field1528[var5 + var6] = arg3;
        }
    }

    @OriginalMember(owner = "VDGJUQAS", name = "b", descriptor = "(IIIIII)V")
    public static void method521(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 < field1531 || arg4 >= field1532) {
            return;
        }
        if (arg3 < field1533) {
            arg1 -= field1533 - arg3;
            arg3 = field1533;
        }
        if (arg1 + arg3 > field1534) {
            arg1 = field1534 - arg3;
        }
        int var6 = 256 - arg5;
        int var7 = (arg2 >> 16 & 0xFF) * arg5;
        int var8 = (arg2 >> 8 & 0xFF) * arg5;
        int var9 = (arg2 & 0xFF) * arg5;
        int var10 = field1529 * arg4 + arg3;
        if (arg0 != 0) {
            field1526 = true;
        }
        for (int var11 = 0; var11 < arg1; var11++) {
            int var12 = (field1528[var10] >> 16 & 0xFF) * var6;
            int var13 = (field1528[var10] >> 8 & 0xFF) * var6;
            int var14 = (field1528[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field1528[var10++] = var15;
        }
    }

    @OriginalMember(owner = "VDGJUQAS", name = "a", descriptor = "(IIIIZ)V")
    public static void method522(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (!arg4 || (arg1 < field1533 || arg1 >= field1534)) {
            return;
        }
        if (arg3 < field1531) {
            arg2 -= field1531 - arg3;
            arg3 = field1531;
        }
        if (arg2 + arg3 > field1532) {
            arg2 = field1532 - arg3;
        }
        int var5 = field1529 * arg3 + arg1;
        for (int var6 = 0; var6 < arg2; var6++) {
            field1528[field1529 * var6 + var5] = arg0;
        }
    }

    @OriginalMember(owner = "VDGJUQAS", name = "a", descriptor = "(IIIIIZ)V")
    public static void method523(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg2 < field1533 || arg2 >= field1534) {
            return;
        }
        if (arg0 < field1531) {
            arg1 -= field1531 - arg0;
            arg0 = field1531;
        }
        if (arg0 + arg1 > field1532) {
            arg1 = field1532 - arg0;
        }
        int var6 = 256 - arg3;
        if (!arg5) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        int var8 = (arg4 >> 16 & 0xFF) * arg3;
        int var9 = (arg4 >> 8 & 0xFF) * arg3;
        int var10 = (arg4 & 0xFF) * arg3;
        int var11 = field1529 * arg0 + arg2;
        for (int var12 = 0; var12 < arg1; var12++) {
            int var13 = (field1528[var11] >> 16 & 0xFF) * var6;
            int var14 = (field1528[var11] >> 8 & 0xFF) * var6;
            int var15 = (field1528[var11] & 0xFF) * var6;
            int var16 = (var10 + var15 >> 8) + (var8 + var13 >> 8 << 16) + (var9 + var14 >> 8 << 8);
            field1528[var11] = var16;
            var11 += field1529;
        }
    }
}
