import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class117 extends class106 {

    @OriginalMember(owner = "client!ki", name = "y", descriptor = "[I")
    public static int[] field2109 = new int[500];

    @OriginalMember(owner = "client!ki", name = "F", descriptor = "Loc;")
    private static class151 field2116 = class137.method873(2, "wave:");

    @OriginalMember(owner = "client!ki", name = "D", descriptor = "I")
    public static int field2114 = 0;

    @OriginalMember(owner = "client!ki", name = "x", descriptor = "I")
    public static int field2108 = 0;

    @OriginalMember(owner = "client!ki", name = "A", descriptor = "Loc;")
    public static class151 field2111 = class137.method873(2, "Hidden)2");

    @OriginalMember(owner = "client!ki", name = "I", descriptor = "I")
    public static int field2119 = 2;

    @OriginalMember(owner = "client!ki", name = "q", descriptor = "Loc;")
    public static class151 field2101 = field2116;

    @OriginalMember(owner = "client!ki", name = "H", descriptor = "I")
    public static int field2118 = -1;

    @OriginalMember(owner = "client!ki", name = "t", descriptor = "Loc;")
    public static class151 field2104 = field2116;

    @OriginalMember(owner = "client!ki", name = "r", descriptor = "I")
    public int field2102;

    @OriginalMember(owner = "client!ki", name = "s", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!ki", name = "u", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!ki", name = "v", descriptor = "I")
    public int field2106;

    @OriginalMember(owner = "client!ki", name = "w", descriptor = "I")
    public int field2107;

    @OriginalMember(owner = "client!ki", name = "z", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!ki", name = "B", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!ki", name = "C", descriptor = "I")
    public static int field2113;

    @OriginalMember(owner = "client!ki", name = "E", descriptor = "I")
    public static int field2115;

    @OriginalMember(owner = "client!ki", name = "G", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!ki", name = "J", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(II)Z")
    public static final boolean method711(int arg0, int arg1) {
        field2115++;
        if (arg0 != -2001) {
            method711(35, -1);
        }
        return (arg1 >> 20 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(B)V")
    public static void method712(byte arg0) {
        field2109 = null;
        field2111 = null;
        if (arg0 != 72) {
            method711(84, 91);
        }
        field2116 = null;
        field2101 = null;
        field2104 = null;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lwa;Z)V")
    public static final void method713(class229 arg0, boolean arg1) {
        if (!arg1) {
            method719((byte) -31);
        }
        field2103++;
        if (class42.field864 != null) {
            try {
                class42.field864.method1081((byte) -121, 0L);
                class42.field864.method1073(-1, 24, arg0.field4101, arg0.field4087);
            } catch (Exception var2) {
            }
        }
        arg0.field4101 += 24;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public static final void method714(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class225 var20 = new class225(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class95.field1776[var21][arg1][arg2] == null) {
                    class95.field1776[var21][arg1][arg2] = new class72(var21, arg1, arg2);
                }
            }
            class95.field1776[arg0][arg1][arg2].field1415 = var20;
        } else if (arg3 == 1) {
            class225 var22 = new class225(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class95.field1776[var23][arg1][arg2] == null) {
                    class95.field1776[var23][arg1][arg2] = new class72(var23, arg1, arg2);
                }
            }
            class95.field1776[arg0][arg1][arg2].field1415 = var22;
        } else {
            class173 var24 = new class173(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class95.field1776[var25][arg1][arg2] == null) {
                    class95.field1776[var25][arg1][arg2] = new class72(var25, arg1, arg2);
                }
            }
            class95.field1776[arg0][arg1][arg2].field1403 = var24;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IB)I")
    public static final int method715(int arg0, byte arg1) {
        if (arg1 > -37) {
            method718(47, -115, -24);
        }
        field2117++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(II)Z")
    public static final boolean method716(int arg0, int arg1) {
        field2112++;
        if (arg1 < 0) {
            return false;
        }
        int var2 = class185.field3316[arg1];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        if (var2 == 1003) {
            return true;
        } else {
            if (arg0 <= 44) {
                method718(10, -9, -72);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIIIII)V")
    public static final void method717(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg6 != 2000) {
            return;
        }
        if (arg4 - arg0 >= class79.field1526 && arg0 + arg4 <= class25.field524 && class233.field4281 <= arg1 - arg0 && class154.field2793 >= arg0 + arg1) {
            class216.method1348(arg5, arg1, arg2, arg0, arg4, arg3, 7826);
        } else {
            class189.method1176(arg1, arg5, arg0, arg3, (byte) -1, arg2, arg4);
        }
        field2120++;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(III)Z")
    public static final boolean method718(int arg0, int arg1, int arg2) {
        field2113++;
        if (arg2 != 1) {
            field2111 = null;
        }
        return (arg0 >> arg1 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "(B)V")
    public static final void method719(byte arg0) {
        class153.field2778 = null;
        class152.field2751 = null;
        class166.field3007 = null;
        class106.field1876 = null;
        field2110++;
        class43.field883 = null;
        class175.field3171 = null;
        class107.field1891 = null;
        if (arg0 != -20) {
            field2101 = null;
        }
        class160.field2900 = null;
        class180.field3264 = null;
        class124.field2239 = 0;
        class19.field396 = null;
        client.field699.method1357(4);
        class209.field3672.method1357(4);
        class42.field872 = null;
        class231.field4126 = null;
        class89.field1635 = null;
        class21.field467 = null;
        class54.field1101 = null;
        class66.field1276 = null;
        class121.field2183 = null;
        class154.field2797 = null;
    }
}
