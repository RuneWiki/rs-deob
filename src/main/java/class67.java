import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!WNEQSCWL")
public class class67 extends class48 {

    @OriginalMember(owner = "client!WNEQSCWL", name = "l", descriptor = "I")
    private static int field1685 = 3;

    @OriginalMember(owner = "client!WNEQSCWL", name = "m", descriptor = "I")
    private static int field1686 = -1109;

    @OriginalMember(owner = "client!WNEQSCWL", name = "j", descriptor = "I")
    private static int field1683;

    @OriginalMember(owner = "client!WNEQSCWL", name = "o", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!WNEQSCWL", name = "p", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!WNEQSCWL", name = "q", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!WNEQSCWL", name = "r", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!WNEQSCWL", name = "s", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!WNEQSCWL", name = "t", descriptor = "I")
    public static int field1693;

    @OriginalMember(owner = "client!WNEQSCWL", name = "u", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!WNEQSCWL", name = "v", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!WNEQSCWL", name = "w", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!WNEQSCWL", name = "k", descriptor = "Z")
    private static boolean field1684;

    @OriginalMember(owner = "client!WNEQSCWL", name = "x", descriptor = "Z")
    public static boolean field1697;

    @OriginalMember(owner = "client!WNEQSCWL", name = "n", descriptor = "[I")
    public static int[] field1687;

    @OriginalMember(owner = "client!WNEQSCWL", name = "a", descriptor = "(Z[III)V")
    public static void method568(boolean arg0, int[] arg1, int arg2, int arg3) {
        field1687 = arg1;
        field1688 = arg2;
        if (arg0) {
            field1686 = -27;
        }
        field1689 = arg3;
        method570(0, (byte) -98, arg3, arg2, 0);
    }

    @OriginalMember(owner = "client!WNEQSCWL", name = "a", descriptor = "(B)V")
    public static void method569(byte arg0) {
        field1692 = 0;
        field1690 = 0;
        field1693 = field1688;
        field1691 = field1689;
        if (arg0 == 0) {
            boolean var1 = false;
            field1694 = field1693 - 1;
            field1695 = field1693 / 2;
        }
    }

    @OriginalMember(owner = "client!WNEQSCWL", name = "a", descriptor = "(IBIII)V")
    public static void method570(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 != -98) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg4 < 0) {
            arg4 = 0;
        }
        if (arg3 > field1688) {
            arg3 = field1688;
        }
        if (arg2 > field1689) {
            arg2 = field1689;
        }
        field1692 = arg0;
        field1690 = arg4;
        field1693 = arg3;
        field1691 = arg2;
        field1694 = field1693 - 1;
        field1695 = field1693 / 2;
        field1696 = field1691 / 2;
    }

    @OriginalMember(owner = "client!WNEQSCWL", name = "a", descriptor = "(Z)V")
    public static void method571(boolean arg0) {
        int var1 = field1689 * field1688;
        if (arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        for (int var3 = 0; var3 < var1; var3++) {
            field1687[var3] = 0;
        }
    }

    @OriginalMember(owner = "client!WNEQSCWL", name = "a", descriptor = "(IIIIIBI)V")
    public static void method572(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        if (arg4 < field1692) {
            arg3 -= field1692 - arg4;
            arg4 = field1692;
        }
        if (arg2 < field1690) {
            arg0 -= field1690 - arg2;
            arg2 = field1690;
        }
        if (arg3 + arg4 > field1693) {
            arg3 = field1693 - arg4;
        }
        if (arg0 + arg2 > field1691) {
            arg0 = field1691 - arg2;
        }
        int var7 = 256 - arg1;
        if (arg5 == 6) {
            boolean var8 = false;
        } else {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        int var10 = (arg6 >> 16 & 0xFF) * arg1;
        int var11 = (arg6 >> 8 & 0xFF) * arg1;
        int var12 = (arg6 & 0xFF) * arg1;
        int var13 = field1688 - arg3;
        int var14 = field1688 * arg2 + arg4;
        for (int var15 = 0; var15 < arg0; var15++) {
            for (int var16 = -arg3; var16 < 0; var16++) {
                int var17 = (field1687[var14] >> 16 & 0xFF) * var7;
                int var18 = (field1687[var14] >> 8 & 0xFF) * var7;
                int var19 = (field1687[var14] & 0xFF) * var7;
                int var20 = (var12 + var19 >> 8) + (var10 + var17 >> 8 << 16) + (var11 + var18 >> 8 << 8);
                field1687[var14++] = var20;
            }
            var14 += var13;
        }
    }

    @OriginalMember(owner = "client!WNEQSCWL", name = "a", descriptor = "(BIIIII)V")
    public static void method573(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 < field1692) {
            arg5 -= field1692 - arg2;
            arg2 = field1692;
        }
        if (arg1 < field1690) {
            arg4 -= field1690 - arg1;
            arg1 = field1690;
        }
        if (arg2 + arg5 > field1693) {
            arg5 = field1693 - arg2;
        }
        if (arg1 + arg4 > field1691) {
            arg4 = field1691 - arg1;
        }
        int var6 = field1688 - arg5;
        int var7 = field1688 * arg1 + arg2;
        for (int var8 = -arg4; var8 < 0; var8++) {
            for (int var10 = -arg5; var10 < 0; var10++) {
                field1687[var7++] = arg3;
            }
            var7 += var6;
        }
        if (arg0 == 4) {
            boolean var9 = false;
        }
    }

    @OriginalMember(owner = "client!WNEQSCWL", name = "a", descriptor = "(IIIIII)V")
    public static void method574(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method576(arg3, arg5, 893, arg1, arg4);
        int var6 = 28 / arg2;
        method576(arg3, arg5, 893, arg0 + arg1 - 1, arg4);
        method578(field1683, arg4, arg0, arg1, arg3);
        method578(field1683, arg4, arg0, arg1, arg3 + arg5 - 1);
    }

    @OriginalMember(owner = "client!WNEQSCWL", name = "a", descriptor = "(IIIIIII)V")
    public static void method575(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        method577(arg0, -32613, arg4, arg5, arg3, arg6);
        method577(arg0, -32613, arg4, arg1 + arg5 - 1, arg3, arg6);
        if (arg2 <= 0) {
            field1684 = !field1684;
        }
        if (arg1 >= 3) {
            method579(arg6, 29392, arg1 - 2, arg3, arg5 + 1, arg4);
            method579(arg6, 29392, arg1 - 2, arg0 + arg3 - 1, arg5 + 1, arg4);
        }
    }

    @OriginalMember(owner = "client!WNEQSCWL", name = "a", descriptor = "(IIIII)V")
    public static void method576(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 73 / arg2;
        if (arg3 < field1690 || arg3 >= field1691) {
            return;
        }
        if (arg0 < field1692) {
            arg1 -= field1692 - arg0;
            arg0 = field1692;
        }
        if (arg0 + arg1 > field1693) {
            arg1 = field1693 - arg0;
        }
        int var6 = field1688 * arg3 + arg0;
        for (int var7 = 0; var7 < arg1; var7++) {
            field1687[var6 + var7] = arg4;
        }
    }

    @OriginalMember(owner = "client!WNEQSCWL", name = "b", descriptor = "(IIIIII)V")
    public static void method577(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 < field1690 || arg3 >= field1691) {
            return;
        }
        if (arg4 < field1692) {
            arg0 -= field1692 - arg4;
            arg4 = field1692;
        }
        if (arg0 + arg4 > field1693) {
            arg0 = field1693 - arg4;
        }
        int var6 = 256 - arg2;
        int var7 = (arg5 >> 16 & 0xFF) * arg2;
        int var8 = (arg5 >> 8 & 0xFF) * arg2;
        int var9 = (arg5 & 0xFF) * arg2;
        int var10 = field1688 * arg3 + arg4;
        for (int var11 = 0; var11 < arg0; var11++) {
            int var12 = (field1687[var10] >> 16 & 0xFF) * var6;
            int var13 = (field1687[var10] >> 8 & 0xFF) * var6;
            int var14 = (field1687[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field1687[var10++] = var15;
        }
        if (arg1 != -32613) {
            field1684 = !field1684;
        }
    }

    @OriginalMember(owner = "client!WNEQSCWL", name = "b", descriptor = "(IIIII)V")
    public static void method578(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 < field1692 || arg4 >= field1693) {
            return;
        }
        if (arg3 < field1690) {
            arg2 -= field1690 - arg3;
            arg3 = field1690;
        }
        if (arg2 + arg3 > field1691) {
            arg2 = field1691 - arg3;
        }
        int var5 = field1688 * arg3 + arg4;
        if (arg0 == 0) {
            for (int var6 = 0; var6 < arg2; var6++) {
                field1687[field1688 * var6 + var5] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!WNEQSCWL", name = "c", descriptor = "(IIIIII)V")
    public static void method579(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 < field1692 || arg3 >= field1693) {
            return;
        }
        if (arg4 < field1690) {
            arg2 -= field1690 - arg4;
            arg4 = field1690;
        }
        if (arg2 + arg4 > field1691) {
            arg2 = field1691 - arg4;
        }
        int var6 = 256 - arg5;
        int var7 = (arg0 >> 16 & 0xFF) * arg5;
        int var8 = (arg0 >> 8 & 0xFF) * arg5;
        int var9 = (arg0 & 0xFF) * arg5;
        int var10 = field1688 * arg4 + arg3;
        for (int var11 = 0; var11 < arg2; var11++) {
            int var13 = (field1687[var10] >> 16 & 0xFF) * var6;
            int var14 = (field1687[var10] >> 8 & 0xFF) * var6;
            int var15 = (field1687[var10] & 0xFF) * var6;
            int var16 = (var9 + var15 >> 8) + (var7 + var13 >> 8 << 16) + (var8 + var14 >> 8 << 8);
            field1687[var10] = var16;
            var10 += field1688;
        }
        if (arg1 != 29392) {
            for (int var12 = 1; var12 > 0; var12++) {
            }
        }
    }
}
