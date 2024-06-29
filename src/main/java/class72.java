import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ZLDPKUPX")
public class class72 extends class36 {

    @OriginalMember(owner = "client!ZLDPKUPX", name = "i", descriptor = "B")
    private static byte field1724 = 8;

    @OriginalMember(owner = "client!ZLDPKUPX", name = "j", descriptor = "Z")
    private static boolean field1725 = true;

    @OriginalMember(owner = "client!ZLDPKUPX", name = "k", descriptor = "B")
    private static byte field1726 = -126;

    @OriginalMember(owner = "client!ZLDPKUPX", name = "l", descriptor = "I")
    private static int field1727 = 283;

    @OriginalMember(owner = "client!ZLDPKUPX", name = "m", descriptor = "Z")
    private static boolean field1728 = true;

    @OriginalMember(owner = "client!ZLDPKUPX", name = "h", descriptor = "I")
    private static int field1723;

    @OriginalMember(owner = "client!ZLDPKUPX", name = "n", descriptor = "I")
    private static int field1729;

    @OriginalMember(owner = "client!ZLDPKUPX", name = "p", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "client!ZLDPKUPX", name = "q", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!ZLDPKUPX", name = "r", descriptor = "I")
    public static int field1733;

    @OriginalMember(owner = "client!ZLDPKUPX", name = "s", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!ZLDPKUPX", name = "t", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!ZLDPKUPX", name = "u", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!ZLDPKUPX", name = "v", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!ZLDPKUPX", name = "w", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!ZLDPKUPX", name = "x", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!ZLDPKUPX", name = "y", descriptor = "Z")
    public static boolean field1740;

    @OriginalMember(owner = "client!ZLDPKUPX", name = "o", descriptor = "[I")
    public static int[] field1730;

    @OriginalMember(owner = "client!ZLDPKUPX", name = "a", descriptor = "([IZII)V")
    public static void method592(int[] arg0, boolean arg1, int arg2, int arg3) {
        field1730 = arg0;
        field1731 = arg2;
        if (!arg1) {
            field1732 = arg3;
            method594(7, arg3, 0, arg2, 0);
        }
    }

    @OriginalMember(owner = "client!ZLDPKUPX", name = "a", descriptor = "(I)V")
    public static void method593(int arg0) {
        field1735 = 0;
        field1733 = 0;
        field1736 = field1731;
        field1734 = field1732;
        if (arg0 == -38001) {
            field1737 = field1736 - 1;
            field1738 = field1736 / 2;
        }
    }

    @OriginalMember(owner = "client!ZLDPKUPX", name = "a", descriptor = "(IIIII)V")
    public static void method594(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = 0;
        }
        if (arg4 < 0) {
            arg4 = 0;
        }
        if (arg3 > field1731) {
            arg3 = field1731;
        }
        if (arg1 > field1732) {
            arg1 = field1732;
        }
        field1735 = arg2;
        field1733 = arg4;
        field1736 = arg3;
        field1734 = arg1;
        field1737 = field1736 - 1;
        field1738 = field1736 / 2;
        field1739 = field1734 / 2;
        if (arg0 != 7) {
            field1728 = !field1728;
        }
    }

    @OriginalMember(owner = "client!ZLDPKUPX", name = "b", descriptor = "(I)V")
    public static void method595(int arg0) {
        if (arg0 >= 0) {
            field1723 = -75;
        }
        int var1 = field1732 * field1731;
        for (int var2 = 0; var2 < var1; var2++) {
            field1730[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!ZLDPKUPX", name = "a", descriptor = "(IIIIIII)V")
    public static void method596(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 < field1735) {
            arg3 -= field1735 - arg5;
            arg5 = field1735;
        }
        if (arg0 < field1733) {
            arg2 -= field1733 - arg0;
            arg0 = field1733;
        }
        if (arg3 + arg5 > field1736) {
            arg3 = field1736 - arg5;
        }
        if (arg0 + arg2 > field1734) {
            arg2 = field1734 - arg0;
        }
        int var7 = 256 - arg1;
        int var8 = (arg6 >> 16 & 0xFF) * arg1;
        int var9 = (arg6 >> 8 & 0xFF) * arg1;
        int var10 = (arg6 & 0xFF) * arg1;
        int var11 = field1731 - arg3;
        int var12 = field1731 * arg0 + arg5;
        if (arg4 != 0) {
            return;
        }
        for (int var13 = 0; var13 < arg2; var13++) {
            for (int var14 = -arg3; var14 < 0; var14++) {
                int var15 = (field1730[var12] >> 16 & 0xFF) * var7;
                int var16 = (field1730[var12] >> 8 & 0xFF) * var7;
                int var17 = (field1730[var12] & 0xFF) * var7;
                int var18 = (var10 + var17 >> 8) + (var8 + var15 >> 8 << 16) + (var9 + var16 >> 8 << 8);
                field1730[var12++] = var18;
            }
            var12 += var11;
        }
    }

    @OriginalMember(owner = "client!ZLDPKUPX", name = "a", descriptor = "(IIIIBI)V")
    public static void method597(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        if (arg3 < field1735) {
            arg0 -= field1735 - arg3;
            arg3 = field1735;
        }
        if (arg5 < field1733) {
            arg2 -= field1733 - arg5;
            arg5 = field1733;
        }
        if (arg0 + arg3 > field1736) {
            arg0 = field1736 - arg3;
        }
        if (arg2 + arg5 > field1734) {
            arg2 = field1734 - arg5;
        }
        int var6 = field1731 - arg0;
        if (field1724 == arg4) {
            boolean var7 = false;
        } else {
            field1729 = -354;
        }
        int var8 = field1731 * arg5 + arg3;
        for (int var9 = -arg2; var9 < 0; var9++) {
            for (int var10 = -arg0; var10 < 0; var10++) {
                field1730[var8++] = arg1;
            }
            var8 += var6;
        }
    }

    @OriginalMember(owner = "client!ZLDPKUPX", name = "a", descriptor = "(IIZIII)V")
    public static void method598(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        method600(9916, arg4, arg3, arg1, arg5);
        method600(9916, arg0 + arg4 - 1, arg3, arg1, arg5);
        method602(arg0, (byte) 1, arg3, arg4, arg5);
        method602(arg0, (byte) 1, arg3, arg4, arg1 + arg5 - 1);
        if (arg2) {
            ;
        }
    }

    @OriginalMember(owner = "client!ZLDPKUPX", name = "b", descriptor = "(IIIIIII)V")
    public static void method599(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        method601(arg4, arg3, arg1, arg5, false, arg0);
        if (arg2 != -34942) {
            field1723 = 322;
        }
        method601(arg4, arg3, arg1, arg5, false, arg0 + arg6 - 1);
        if (arg6 >= 3) {
            method603(arg5, arg3, 5, arg0 + 1, arg6 - 2, arg1);
            method603(arg5, arg3 + arg4 - 1, 5, arg0 + 1, arg6 - 2, arg1);
        }
    }

    @OriginalMember(owner = "client!ZLDPKUPX", name = "b", descriptor = "(IIIII)V")
    public static void method600(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field1733 || arg1 >= field1734) {
            return;
        }
        if (arg4 < field1735) {
            arg3 -= field1735 - arg4;
            arg4 = field1735;
        }
        if (arg3 + arg4 > field1736) {
            arg3 = field1736 - arg4;
        }
        int var5 = field1731 * arg1 + arg4;
        if (arg0 != 9916) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        for (int var7 = 0; var7 < arg3; var7++) {
            field1730[var5 + var7] = arg2;
        }
    }

    @OriginalMember(owner = "client!ZLDPKUPX", name = "a", descriptor = "(IIIIZI)V")
    public static void method601(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg5 < field1733 || arg5 >= field1734) {
            return;
        }
        if (arg1 < field1735) {
            arg0 -= field1735 - arg1;
            arg1 = field1735;
        }
        if (arg0 + arg1 > field1736) {
            arg0 = field1736 - arg1;
        }
        int var6 = 256 - arg3;
        int var7 = (arg2 >> 16 & 0xFF) * arg3;
        int var8 = (arg2 >> 8 & 0xFF) * arg3;
        int var9 = (arg2 & 0xFF) * arg3;
        int var10 = field1731 * arg5 + arg1;
        if (arg4) {
            return;
        }
        for (int var11 = 0; var11 < arg0; var11++) {
            int var12 = (field1730[var10] >> 16 & 0xFF) * var6;
            int var13 = (field1730[var10] >> 8 & 0xFF) * var6;
            int var14 = (field1730[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field1730[var10++] = var15;
        }
    }

    @OriginalMember(owner = "client!ZLDPKUPX", name = "a", descriptor = "(IBIII)V")
    public static void method602(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 1) {
            return;
        }
        boolean var5 = false;
        if (arg4 < field1735 || arg4 >= field1736) {
            return;
        }
        if (arg3 < field1733) {
            arg0 -= field1733 - arg3;
            arg3 = field1733;
        }
        if (arg0 + arg3 > field1734) {
            arg0 = field1734 - arg3;
        }
        int var6 = field1731 * arg3 + arg4;
        for (int var7 = 0; var7 < arg0; var7++) {
            field1730[field1731 * var7 + var6] = arg2;
        }
    }

    @OriginalMember(owner = "client!ZLDPKUPX", name = "a", descriptor = "(IIIIII)V")
    public static void method603(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 != 5 || (arg1 < field1735 || arg1 >= field1736)) {
            return;
        }
        if (arg3 < field1733) {
            arg4 -= field1733 - arg3;
            arg3 = field1733;
        }
        if (arg3 + arg4 > field1734) {
            arg4 = field1734 - arg3;
        }
        int var6 = 256 - arg0;
        int var7 = (arg5 >> 16 & 0xFF) * arg0;
        int var8 = (arg5 >> 8 & 0xFF) * arg0;
        int var9 = (arg5 & 0xFF) * arg0;
        int var10 = field1731 * arg3 + arg1;
        for (int var11 = 0; var11 < arg4; var11++) {
            int var12 = (field1730[var10] >> 16 & 0xFF) * var6;
            int var13 = (field1730[var10] >> 8 & 0xFF) * var6;
            int var14 = (field1730[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field1730[var10] = var15;
            var10 += field1731;
        }
    }
}
