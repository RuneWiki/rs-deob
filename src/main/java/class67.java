import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("YYTDUXDR")
public class class67 extends class49 {

    @OriginalMember(owner = "YYTDUXDR", name = "k", descriptor = "Z")
    private static boolean field1667 = true;

    @OriginalMember(owner = "YYTDUXDR", name = "l", descriptor = "I")
    private static int field1668 = -408;

    @OriginalMember(owner = "YYTDUXDR", name = "o", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "YYTDUXDR", name = "p", descriptor = "I")
    public static int field1672;

    @OriginalMember(owner = "YYTDUXDR", name = "q", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "YYTDUXDR", name = "r", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "YYTDUXDR", name = "s", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "YYTDUXDR", name = "t", descriptor = "I")
    public static int field1676;

    @OriginalMember(owner = "YYTDUXDR", name = "u", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "YYTDUXDR", name = "v", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "YYTDUXDR", name = "w", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "YYTDUXDR", name = "i", descriptor = "Z")
    private static boolean field1665;

    @OriginalMember(owner = "YYTDUXDR", name = "j", descriptor = "Z")
    private static boolean field1666;

    @OriginalMember(owner = "YYTDUXDR", name = "m", descriptor = "Z")
    private static boolean field1669;

    @OriginalMember(owner = "YYTDUXDR", name = "x", descriptor = "Z")
    public static boolean field1680;

    @OriginalMember(owner = "YYTDUXDR", name = "n", descriptor = "[I")
    public static int[] field1670;

    @OriginalMember(owner = "YYTDUXDR", name = "a", descriptor = "([IIZI)V")
    public static void method576(int[] arg0, int arg1, boolean arg2, int arg3) {
        field1670 = arg0;
        field1671 = arg3;
        field1672 = arg1;
        method578(arg3, 0, 0, arg1, 5);
        if (!arg2) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "YYTDUXDR", name = "a", descriptor = "(I)V")
    public static void method577(int arg0) {
        field1675 = 0;
        field1673 = 0;
        field1676 = field1671;
        field1674 = field1672;
        field1677 = field1676 - 1;
        while (arg0 >= 0) {
        }
        field1678 = field1676 / 2;
    }

    @OriginalMember(owner = "YYTDUXDR", name = "a", descriptor = "(IIIII)V")
    public static void method578(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg0 > field1671) {
            arg0 = field1671;
        }
        if (arg3 > field1672) {
            arg3 = field1672;
        }
        field1675 = arg2;
        field1673 = arg1;
        field1676 = arg0;
        field1674 = arg3;
        field1677 = field1676 - 1;
        field1678 = field1676 / 2;
        if (arg4 < 5 || arg4 > 5) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        field1679 = field1674 / 2;
    }

    @OriginalMember(owner = "YYTDUXDR", name = "a", descriptor = "(Z)V")
    public static void method579(boolean arg0) {
        if (arg0) {
            field1666 = !field1666;
        }
        int var1 = field1672 * field1671;
        for (int var2 = 0; var2 < var1; var2++) {
            field1670[var2] = 0;
        }
    }

    @OriginalMember(owner = "YYTDUXDR", name = "a", descriptor = "(IIIIIII)V")
    public static void method580(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < field1675) {
            arg6 -= field1675 - arg2;
            arg2 = field1675;
        }
        if (arg3 < field1673) {
            arg5 -= field1673 - arg3;
            arg3 = field1673;
        }
        if (arg2 + arg6 > field1676) {
            arg6 = field1676 - arg2;
        }
        if (arg3 + arg5 > field1674) {
            arg5 = field1674 - arg3;
        }
        int var7 = 256 - arg1;
        int var8 = (arg0 >> 16 & 0xFF) * arg1;
        int var9 = (arg0 >> 8 & 0xFF) * arg1;
        int var10 = (arg0 & 0xFF) * arg1;
        if (arg4 >= 0) {
            return;
        }
        int var11 = field1671 - arg6;
        int var12 = field1671 * arg3 + arg2;
        for (int var13 = 0; var13 < arg5; var13++) {
            for (int var14 = -arg6; var14 < 0; var14++) {
                int var15 = (field1670[var12] >> 16 & 0xFF) * var7;
                int var16 = (field1670[var12] >> 8 & 0xFF) * var7;
                int var17 = (field1670[var12] & 0xFF) * var7;
                int var18 = (var10 + var17 >> 8) + (var8 + var15 >> 8 << 16) + (var9 + var16 >> 8 << 8);
                field1670[var12++] = var18;
            }
            var12 += var11;
        }
    }

    @OriginalMember(owner = "YYTDUXDR", name = "a", descriptor = "(IBIIII)V")
    public static void method581(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field1675) {
            arg3 -= field1675 - arg0;
            arg0 = field1675;
        }
        if (arg5 < field1673) {
            arg4 -= field1673 - arg5;
            arg5 = field1673;
        }
        if (arg0 + arg3 > field1676) {
            arg3 = field1676 - arg0;
        }
        if (arg4 + arg5 > field1674) {
            arg4 = field1674 - arg5;
        }
        int var6 = field1671 - arg3;
        int var7 = field1671 * arg5 + arg0;
        if (arg1 != 109) {
            field1665 = !field1665;
        }
        for (int var8 = -arg4; var8 < 0; var8++) {
            for (int var9 = -arg3; var9 < 0; var9++) {
                field1670[var7++] = arg2;
            }
            var7 += var6;
        }
    }

    @OriginalMember(owner = "YYTDUXDR", name = "a", descriptor = "(IIIIBI)V")
    public static void method582(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        method584(0, arg1, arg0, arg5, arg2);
        if (arg4 != 12) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        method584(0, arg1, arg0, arg3 + arg5 - 1, arg2);
        method586(-709, arg5, arg3, arg2, arg1);
        method586(-709, arg5, arg3, arg0 + arg2 - 1, arg1);
    }

    @OriginalMember(owner = "YYTDUXDR", name = "a", descriptor = "(BIIIIII)V")
    public static void method583(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        method585(arg1, arg6, arg5, arg4, arg3, -957);
        if (arg0 != 8) {
            field1669 = !field1669;
        }
        method585(arg1, arg6, arg5, arg4, arg2 + arg3 - 1, -957);
        if (arg2 >= 3) {
            method587(arg5, arg6, arg4, arg3 + 1, (byte) 9, arg2 - 2);
            method587(arg1 + arg5 - 1, arg6, arg4, arg3 + 1, (byte) 9, arg2 - 2);
        }
    }

    @OriginalMember(owner = "YYTDUXDR", name = "b", descriptor = "(IIIII)V")
    public static void method584(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 0 || (arg3 < field1673 || arg3 >= field1674)) {
            return;
        }
        if (arg4 < field1675) {
            arg2 -= field1675 - arg4;
            arg4 = field1675;
        }
        if (arg2 + arg4 > field1676) {
            arg2 = field1676 - arg4;
        }
        int var5 = field1671 * arg3 + arg4;
        for (int var6 = 0; var6 < arg2; var6++) {
            field1670[var5 + var6] = arg1;
        }
    }

    @OriginalMember(owner = "YYTDUXDR", name = "a", descriptor = "(IIIIII)V")
    public static void method585(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 < field1673 || arg4 >= field1674) {
            return;
        }
        if (arg2 < field1675) {
            arg0 -= field1675 - arg2;
            arg2 = field1675;
        }
        if (arg0 + arg2 > field1676) {
            arg0 = field1676 - arg2;
        }
        int var6 = 256 - arg1;
        int var7 = (arg3 >> 16 & 0xFF) * arg1;
        int var8 = (arg3 >> 8 & 0xFF) * arg1;
        int var9 = (arg3 & 0xFF) * arg1;
        int var10 = field1671 * arg4 + arg2;
        if (arg5 >= 0) {
            return;
        }
        for (int var11 = 0; var11 < arg0; var11++) {
            int var12 = (field1670[var10] >> 16 & 0xFF) * var6;
            int var13 = (field1670[var10] >> 8 & 0xFF) * var6;
            int var14 = (field1670[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field1670[var10++] = var15;
        }
    }

    @OriginalMember(owner = "YYTDUXDR", name = "c", descriptor = "(IIIII)V")
    public static void method586(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 < field1675 || arg3 >= field1676) {
            return;
        }
        if (arg1 < field1673) {
            arg2 -= field1673 - arg1;
            arg1 = field1673;
        }
        if (arg1 + arg2 > field1674) {
            arg2 = field1674 - arg1;
        }
        int var5 = field1671 * arg1 + arg3;
        while (arg0 >= 0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        for (int var6 = 0; var6 < arg2; var6++) {
            field1670[field1671 * var6 + var5] = arg4;
        }
    }

    @OriginalMember(owner = "YYTDUXDR", name = "b", descriptor = "(IIIIBI)V")
    public static void method587(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        if (arg4 != 9) {
            field1667 = true;
        }
        if (arg0 < field1675 || arg0 >= field1676) {
            return;
        }
        if (arg3 < field1673) {
            arg5 -= field1673 - arg3;
            arg3 = field1673;
        }
        if (arg3 + arg5 > field1674) {
            arg5 = field1674 - arg3;
        }
        int var6 = 256 - arg1;
        int var7 = (arg2 >> 16 & 0xFF) * arg1;
        int var8 = (arg2 >> 8 & 0xFF) * arg1;
        int var9 = (arg2 & 0xFF) * arg1;
        int var10 = field1671 * arg3 + arg0;
        for (int var11 = 0; var11 < arg5; var11++) {
            int var12 = (field1670[var10] >> 16 & 0xFF) * var6;
            int var13 = (field1670[var10] >> 8 & 0xFF) * var6;
            int var14 = (field1670[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field1670[var10] = var15;
            var10 += field1671;
        }
    }
}
