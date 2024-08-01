import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ph")
public class class147 extends class71 {

    @OriginalMember(owner = "ph", name = "p", descriptor = "Llf;")
    private static class109 field2827 = class35.method275("Unable to connect)3", 2);

    @OriginalMember(owner = "ph", name = "o", descriptor = "I")
    public static int field2826 = 0;

    @OriginalMember(owner = "ph", name = "q", descriptor = "Llf;")
    private static class109 field2828 = class35.method275("Loading fonts )2 ", 2);

    @OriginalMember(owner = "ph", name = "t", descriptor = "Llf;")
    public static class109 field2831 = field2828;

    @OriginalMember(owner = "ph", name = "v", descriptor = "Llf;")
    public static class109 field2833 = field2827;

    @OriginalMember(owner = "ph", name = "z", descriptor = "Llf;")
    public static class109 field2837 = class35.method275("Ung-Ultiges Anmelde)2Paket)3", 2);

    @OriginalMember(owner = "ph", name = "n", descriptor = "Llf;")
    public static class109 field2825 = field2827;

    @OriginalMember(owner = "ph", name = "A", descriptor = "I")
    public static int field2838 = 0;

    @OriginalMember(owner = "ph", name = "w", descriptor = "Llf;")
    private static class109 field2834 = class35.method275("Please check your message)2centre for details)3", 2);

    @OriginalMember(owner = "ph", name = "x", descriptor = "Llf;")
    public static class109 field2835 = field2834;

    @OriginalMember(owner = "ph", name = "C", descriptor = "Lrc;")
    public static class160 field2840 = new class160(64);

    @OriginalMember(owner = "ph", name = "D", descriptor = "Lrc;")
    public static class160 field2841 = new class160(50);

    @OriginalMember(owner = "ph", name = "E", descriptor = "I")
    public static int field2842 = 0;

    @OriginalMember(owner = "ph", name = "F", descriptor = "Llf;")
    public static class109 field2843 = class35.method275("Spiel)2Engine wird gestartet)3)3)3", 2);

    @OriginalMember(owner = "ph", name = "s", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "ph", name = "u", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "ph", name = "y", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "ph", name = "r", descriptor = "Lph;")
    public class147 field2829;

    @OriginalMember(owner = "ph", name = "B", descriptor = "Lph;")
    public class147 field2839;

    @OriginalMember(owner = "ph", name = "a", descriptor = "(ILvg;)V")
    public static final void method1027(int arg0, class200 arg1) {
        int var2 = arg1.field3916;
        field2832++;
        if (var2 == 324) {
            if (class52.field1064 == -1) {
                class180.field3396 = arg1.field3863;
                class52.field1064 = arg1.field3924;
            }
            if (class144.field2773.field308) {
                arg1.field3924 = class52.field1064;
            } else {
                arg1.field3924 = class180.field3396;
            }
            return;
        }
        if (arg0 != -1753) {
            field2828 = null;
        }
        if (var2 == 325) {
            if (class52.field1064 == -1) {
                class180.field3396 = arg1.field3863;
                class52.field1064 = arg1.field3924;
            }
            if (class144.field2773.field308) {
                arg1.field3924 = class180.field3396;
            } else {
                arg1.field3924 = class52.field1064;
            }
        } else if (var2 == 327) {
            arg1.field3873 = 150;
            arg1.field3893 = (int) (Math.sin((double) class143.field2754 / 40.0D) * 256.0D) & 0x7FF;
            arg1.field3931 = -1;
            arg1.field3897 = 5;
        } else if (var2 == 328) {
            if (class157.field2955.field3455 == null) {
                arg1.field3931 = 0;
            } else {
                arg1.field3873 = 150;
                arg1.field3893 = (int) (Math.sin((double) class143.field2754 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field3897 = 5;
                arg1.field3931 = ((int) class157.field2955.field3455.method784(false) << 11) + 2047;
                arg1.field3939 = class157.field2955.field3573;
                arg1.field3896 = class157.field2955.field3579;
            }
        }
    }

    @OriginalMember(owner = "ph", name = "a", descriptor = "(I)V")
    public static void method1028(int arg0) {
        field2833 = null;
        field2828 = null;
        field2834 = null;
        field2837 = null;
        field2841 = null;
        field2827 = null;
        field2840 = null;
        field2843 = null;
        field2831 = null;
        field2825 = null;
        if (arg0 < 47) {
            method1027(103, null);
        }
        field2835 = null;
    }

    @OriginalMember(owner = "ph", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method1029(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "ph", name = "a", descriptor = "(Leb;IIIIII)V")
    public static final void method1030(class43 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg0.field897.length;
        for (int var8 = 0; var8 < var7; var8++) {
            int var21 = arg0.field897[var8] - class18.field371;
            int var22 = arg0.field898[var8] - class178.field3369;
            int var23 = arg0.field906[var8] - class144.field2782;
            int var24 = arg3 * var23 + arg4 * var21 >> 16;
            int var25 = arg4 * var23 - arg3 * var21 >> 16;
            int var27 = arg2 * var22 - arg1 * var25 >> 16;
            int var28 = arg1 * var22 + arg2 * var25 >> 16;
            if (var28 < 50) {
                return;
            }
            if (arg0.field894 != null) {
                class43.field895[var8] = var24;
                class43.field899[var8] = var27;
                class43.field902[var8] = var28;
            }
            class43.field892[var8] = (var24 << 9) / var28 + class124.field2375;
            class43.field887[var8] = (var27 << 9) / var28 + class124.field2382;
        }
        class124.field2374 = 0;
        int var9 = arg0.field908.length;
        for (int var10 = 0; var10 < var9; var10++) {
            int var11 = arg0.field908[var10];
            int var12 = arg0.field896[var10];
            int var13 = arg0.field907[var10];
            int var14 = class43.field892[var11];
            int var15 = class43.field892[var12];
            int var16 = class43.field892[var13];
            int var17 = class43.field887[var11];
            int var18 = class43.field887[var12];
            int var19 = class43.field887[var13];
            if ((var14 - var15) * (var19 - var18) - (var16 - var15) * (var17 - var18) > 0) {
                if (class128.field2485 && method1029(class34.field776, class177.field3345, var17, var18, var19, var14, var15, var16)) {
                    class9.field142 = arg5;
                    client.field662 = arg6;
                }
                class124.field2384 = false;
                if (var14 < 0 || var15 < 0 || var16 < 0 || var14 > class124.field2392 || var15 > class124.field2392 || var16 > class124.field2392) {
                    class124.field2384 = true;
                }
                if (arg0.field894 == null || arg0.field894[var10] == -1) {
                    if (arg0.field889[var10] != 12345678) {
                        class124.method890(var17, var18, var19, var14, var15, var16, arg0.field889[var10], arg0.field903[var10], arg0.field901[var10]);
                    }
                } else if (class194.field3714) {
                    int var20 = class124.field2385.method4(arg0.field894[var10], false);
                    class124.method890(var17, var18, var19, var14, var15, var16, class139.method994(var20, arg0.field889[var10]), class139.method994(var20, arg0.field903[var10]), class139.method994(var20, arg0.field901[var10]));
                } else if (arg0.field891) {
                    class124.method903(var17, var18, var19, var14, var15, var16, arg0.field889[var10], arg0.field903[var10], arg0.field901[var10], class43.field895[0], class43.field895[1], class43.field895[3], class43.field899[0], class43.field899[1], class43.field899[3], class43.field902[0], class43.field902[1], class43.field902[3], arg0.field894[var10]);
                } else {
                    class124.method903(var17, var18, var19, var14, var15, var16, arg0.field889[var10], arg0.field903[var10], arg0.field901[var10], class43.field895[var11], class43.field895[var12], class43.field895[var13], class43.field899[var11], class43.field899[var12], class43.field899[var13], class43.field902[var11], class43.field902[var12], class43.field902[var13], arg0.field894[var10]);
                }
            }
        }
    }

    @OriginalMember(owner = "ph", name = "c", descriptor = "(B)V")
    public final void method1031(byte arg0) {
        field2836++;
        if (arg0 != 3) {
            method1027(-121, null);
        }
        if (this.field2829 != null) {
            this.field2829.field2839 = this.field2839;
            this.field2839.field2829 = this.field2829;
            this.field2839 = null;
            this.field2829 = null;
        }
    }
}
