import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class87 extends class179 {

    @OriginalMember(owner = "client!p", name = "u", descriptor = "Lhi;")
    public static class82 field1547 = class95.method664((byte) -27, "zap");

    @OriginalMember(owner = "client!p", name = "I", descriptor = "[I")
    public static int[] field1560 = new int[100];

    @OriginalMember(owner = "client!p", name = "C", descriptor = "Z")
    public static boolean field1554 = false;

    @OriginalMember(owner = "client!p", name = "H", descriptor = "Lhi;")
    private static class82 field1559 = class95.method664((byte) -91, "Opened title screen");

    @OriginalMember(owner = "client!p", name = "x", descriptor = "Lhi;")
    public static class82 field1550 = field1559;

    @OriginalMember(owner = "client!p", name = "s", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!p", name = "t", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!p", name = "w", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!p", name = "y", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!p", name = "z", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!p", name = "B", descriptor = "I")
    public static int field1553;

    @OriginalMember(owner = "client!p", name = "D", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!p", name = "E", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!p", name = "F", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!p", name = "G", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!p", name = "J", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!p", name = "K", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!p", name = "v", descriptor = "Ljg;")
    public static class140 field1548;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(III)V", line = 4)
    public static final void method607(int arg0, int arg1, int arg2) {
        field1553++;
        class130 var3 = class290.method2002(arg0, (byte) -88);
        int var4 = var3.field2269;
        int var5 = var3.field2262;
        int var6 = var3.field2260;
        int var7 = class98.field1772[var5 - var4];
        if (arg2 < ~arg1 || var7 < arg1) {
            arg1 = 0;
        }
        int var8 = var7 << var4;
        class196.method1363(var6, false, var8 & arg1 << var4 | ~var8 & class330.field5623[var6]);
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(I)V", line = 44)
    public static void method608(int arg0) {
        field1559 = null;
        if (arg0 > -77) {
            field1550 = (class82) null;
        }
        field1548 = null;
        field1547 = null;
        field1550 = null;
        field1560 = null;
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "(I)V", line = 69)
    public static final void method609(int arg0) {
        if (arg0 <= 36) {
            return;
        }
        field1562++;
        if (class282.field4743) {
            class280.field4709 = null;
            class282.field4743 = false;
            class100.field1798 = null;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I[[IZIFII[[FI[[FI[[I[[FIIILuk;I)I", line = 86)
    public static final int method610(int arg0, int[][] arg1, boolean arg2, int arg3, float arg4, int arg5, int arg6, float[][] arg7, int arg8, float[][] arg9, int arg10, int[][] arg11, float[][] arg12, int arg13, int arg14, int arg15, class108 arg16, int arg17) {
        field1558++;
        if (arg15 == 1) {
            int var19 = arg13;
            arg13 = arg5;
            arg5 = 128 - var19;
        } else if (arg15 == 2) {
            arg5 = 128 - arg5;
            arg13 = 128 - arg13;
        } else if (arg15 == 3) {
            int var18 = arg13;
            arg13 = 128 - arg5;
            arg5 = var18;
        }
        float var20;
        float var21;
        float var22;
        int var23;
        if (arg13 == 0 && arg5 == 0) {
            var20 = arg12[arg17][arg8];
            var21 = arg9[arg17][arg8];
            var22 = arg7[arg17][arg8];
            var23 = arg10;
        } else if (arg13 == 128 && arg5 == 0) {
            var20 = arg12[arg17 + 1][arg8];
            var22 = arg7[arg17 + 1][arg8];
            var23 = arg0;
            var21 = arg9[arg17 + 1][arg8];
        } else if (arg13 == 128 && arg5 == 128) {
            var21 = arg9[arg17 + 1][arg8 + 1];
            var20 = arg12[arg17 + 1][arg8 + 1];
            var22 = arg7[arg17 + 1][arg8 + 1];
            var23 = arg3;
        } else if (arg13 == 0 && arg5 == 128) {
            var23 = arg6;
            var22 = arg7[arg17][arg8 + 1];
            var20 = arg12[arg17][arg8 + 1];
            var21 = arg9[arg17][arg8 + 1];
        } else {
            float var24 = arg12[arg17][arg8];
            float var25 = arg7[arg17][arg8];
            float var26 = arg9[arg17][arg8];
            float var27 = (float) arg13 / 128.0F;
            float var28 = (arg7[arg17 + 1][arg8] - var25) * var27 + var25;
            float var29 = arg12[arg17][arg8 + 1];
            float var30 = (float) arg5 / 128.0F;
            float var31 = arg9[arg17][arg8 + 1];
            float var32 = (arg9[arg17 + 1][arg8 + 1] - var31) * var27 + var31;
            float var33 = (arg12[arg17 + 1][arg8] - var24) * var27 + var24;
            float var34 = (arg12[arg17 + 1][arg8 + 1] - var29) * var27 + var29;
            float var35 = (arg9[arg17 + 1][arg8] - var26) * var27 + var26;
            var21 = (var32 - var35) * var30 + var35;
            var20 = (var34 - var33) * var30 + var33;
            float var36 = arg7[arg17][arg8 + 1];
            float var37 = (arg7[arg17 + 1][arg8 + 1] - var36) * var27 + var36;
            var22 = (var37 - var28) * var30 + var28;
            int var38 = class159.method1154(arg0, arg13, (byte) -128, arg10);
            int var39 = class159.method1154(arg3, arg13, (byte) -115, arg6);
            var23 = class159.method1154(var39, arg5, (byte) -78, var38);
        }
        if (arg14 > -115) {
            field1546 = 10;
        }
        int var40 = (arg17 << 7) + arg13;
        int var41 = (arg8 << 7) + arg5;
        int var42 = class17.method97(arg5, arg13, arg8, true, arg17, arg1);
        return arg16.method738(var40, var42, var41, var20, var21, var22, arg2 ? var23 & 0xFFFFFF00 : var23, arg11 == null ? 0.0F : (float) (var42 - class17.method97(arg5, arg13, arg8, true, arg17, arg11)) / arg4);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IZIIII)V", line = 198)
    public static final void method611(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1) {
            field1551 = 60;
        }
        field1545++;
        if (class200.field3443 <= arg3 && arg4 <= class207.field3623 && class60.field931 <= arg0 && arg2 <= class29.field399) {
            class138.method939(arg1, arg5, arg2, arg0, arg3, arg4);
        } else {
            class134.method921((byte) -95, arg2, arg5, arg0, arg3, arg4);
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(B)V", line = 221)
    public static final void method612(byte arg0) {
        int var1 = (class230.field3976 >> 3) + (class219.field3792 >> 10);
        int var2 = (class4.field32 >> 10) + (class226.field3916 >> 3);
        byte var3 = 0;
        byte var4 = 8;
        byte var5 = 8;
        field1561++;
        byte var6 = 18;
        class160.field2793 = new int[var6][4];
        class199.field3424 = new int[var6];
        class56.field914 = new int[var6];
        class123.field2147 = new byte[var6][];
        class129.field2242 = new int[var6];
        class93.field1664 = new int[var6];
        class149.field2526 = new int[var6];
        class71.field1094 = new byte[var6][];
        class107.field1902 = new byte[var6][];
        class36.field590 = new byte[var6][];
        class104.field1838 = new int[var6];
        class287.field4830 = new byte[var6][];
        int var7 = 0;
        for (int var8 = (var1 - 6) / 8; var8 <= ((var1 + 6) / 8); var8++) {
            for (int var9 = (var2 - 6) / 8; var9 <= ((var2 + 6) / 8); var9++) {
                int var10 = (var8 << 8) + var9;
                class93.field1664[var7] = var10;
                class56.field914[var7] = class184.field3134.method1594(class29.method182(-6039, new class82[] { class260.field4464, class327.method2240((byte) -74, var8), class311.field5315, class327.method2240((byte) -74, var9) }), class143.method974(arg0, 97));
                class129.field2242[var7] = class184.field3134.method1594(class29.method182(-6039, new class82[] { class298.field5068, class327.method2240((byte) -74, var8), class311.field5315, class327.method2240((byte) -74, var9) }), arg0 - 51);
                class149.field2526[var7] = class184.field3134.method1594(class29.method182(-6039, new class82[] { class177.field3050, class327.method2240((byte) -74, var8), class311.field5315, class327.method2240((byte) -74, var9) }), -119);
                class199.field3424[var7] = class184.field3134.method1594(class29.method182(-6039, new class82[] { class124.field2165, class327.method2240((byte) -74, var8), class311.field5315, class327.method2240((byte) -74, var9) }), -107);
                class104.field1838[var7] = class184.field3134.method1594(class29.method182(arg0 - 5992, new class82[] { class149.field2543, class327.method2240((byte) -74, var8), class311.field5315, class327.method2240((byte) -74, var9) }), -19);
                if (class149.field2526[var7] == -1) {
                    class56.field914[var7] = -1;
                    class129.field2242[var7] = -1;
                    class199.field3424[var7] = -1;
                    class104.field1838[var7] = -1;
                }
                var7++;
            }
        }
        for (int var11 = var7; var11 < class149.field2526.length; var11++) {
            class149.field2526[var11] = -1;
            class56.field914[var11] = -1;
            class129.field2242[var11] = -1;
            class199.field3424[var11] = -1;
            class104.field1838[var11] = -1;
        }
        class192.method1336(var4, 77, var1, var3, true, var5, var2);
        if (arg0 != -47) {
            method607(-90, -35, 111);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)I", line = 312)
    public static final int method613(int arg0, int arg1) {
        if (arg0 != 25134) {
            method610(25, (int[][]) ((int[][]) null), false, -35, -0.6691034F, -29, 10, (float[][]) ((float[][]) null), 118, (float[][]) ((float[][]) null), 82, (int[][]) ((int[][]) null), (float[][]) ((float[][]) null), -57, -40, 51, (class108) null, -89);
        }
        field1557++;
        return (arg1 & 0x1FA2D5) >> 18;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IZIIBLum;)V", line = 323)
    public static final void method614(int arg0, boolean arg1, int arg2, int arg3, byte arg4, class222 arg5) {
        if (arg4 != -27) {
            return;
        }
        class243.field4227 = arg2;
        class28.field380 = arg0;
        class136.field2348 = arg3;
        class293.field4918 = arg1;
        class77.field1324 = 1;
        class315.field5422 = arg5;
        field1552++;
        class265.field4529 = 10000;
    }
}
