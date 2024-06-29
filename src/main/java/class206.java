import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public abstract class class206 {

    @OriginalMember(owner = "client!cr", name = "r", descriptor = "Loj;")
    private class280 field2829;

    @OriginalMember(owner = "client!cr", name = "h", descriptor = "Lbg;")
    private class406 field2819;

    @OriginalMember(owner = "client!cr", name = "j", descriptor = "Lco;")
    public static class210 field2821 = new class210(64);

    @OriginalMember(owner = "client!cr", name = "x", descriptor = "Z")
    public static boolean field2835 = false;

    @OriginalMember(owner = "client!cr", name = "z", descriptor = "[I")
    public static int[] field2837 = new int[13];

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!cr", name = "d", descriptor = "I")
    public static int field2815;

    @OriginalMember(owner = "client!cr", name = "e", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!cr", name = "f", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!cr", name = "g", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!cr", name = "i", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!cr", name = "k", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!cr", name = "l", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!cr", name = "m", descriptor = "I")
    public static int field2824;

    @OriginalMember(owner = "client!cr", name = "n", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!cr", name = "o", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!cr", name = "p", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!cr", name = "q", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!cr", name = "s", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!cr", name = "t", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!cr", name = "u", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!cr", name = "v", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!cr", name = "w", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!cr", name = "y", descriptor = "Z")
    public static boolean field2836;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "[I")
    public static int[] field2812;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIBIILjava/lang/String;)V", line = 5)
    public final void method1124(int arg0, int arg1, byte arg2, int arg3, int arg4, String arg5) {
        field2816++;
        if (arg2 == 29 && arg5 != null) {
            this.method1128(true, arg1, arg0);
            this.method1136(arg5, (class395[]) null, (class313) null, 0, (int[]) null, arg4 - (this.field2819.method2419(false, arg5) / 2), 0, arg3, 0);
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Ljava/lang/String;IIIIB)V", line = 21)
    public final void method1125(String arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        if (arg5 != -83) {
            method1140(12, -72, 107);
        }
        field2824++;
        if (arg0 != null) {
            this.method1128(true, arg2, arg3);
            this.method1136(arg0, (class395[]) null, (class313) null, 0, (int[]) null, arg1 - this.field2819.method2419(false, arg0), arg5 ^ 0xFFFFFFAD, arg4, 0);
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(II[Lrg;IIILjava/util/Random;I[III[IIILjava/lang/String;)I", line = 37)
    public final int method1126(int arg0, int arg1, class395[] arg2, int arg3, int arg4, int arg5, Random arg6, int arg7, int[] arg8, int arg9, int arg10, int[] arg11, int arg12, int arg13, String arg14) {
        field2825++;
        if (arg14 == null) {
            return 0;
        }
        arg6.setSeed((long) arg9);
        int var16 = (arg6.nextInt() & 0x1F) + 192;
        this.method1128(true, arg4 & 0xFFFFFF | var16 << 24, arg13 & 0xFFFFFF | var16 << 24);
        int var17 = arg14.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg6.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        int var21 = arg5;
        if (arg10 < 38) {
            return -40;
        }
        int var22 = this.field2819.field5770 + arg0;
        if (arg12 == 1) {
            var22 += (arg3 - this.field2819.field5770 - this.field2819.field5763) / 2;
        } else if (arg12 == 2) {
            var22 = arg3 + arg0 - this.field2819.field5763;
        }
        int var23 = -1;
        if (arg1 == 1) {
            var23 = var19 + this.field2819.method2419(false, arg14);
            var21 = (arg7 - var23) / 2 + arg5;
        } else if (arg1 == 2) {
            var23 = var19 + this.field2819.method2419(false, arg14);
            var21 = arg7 + arg5 - var23;
        }
        this.method1141(var21, (byte) 65, arg14, (int[]) null, arg11, var18, var22, arg2);
        if (arg8 != null) {
            if (var23 == -1) {
                var23 = var19 + this.field2819.method2419(false, arg14);
            }
            arg8[3] = this.field2819.field5770 + this.field2819.field5763;
            arg8[2] = var23;
            arg8[1] = var22 - this.field2819.field5770;
            arg8[0] = var21;
        }
        return var19;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)V", line = 113)
    public static void method1127(int arg0) {
        field2821 = null;
        field2812 = null;
        field2837 = null;
        if (arg0 <= 126) {
            method1140(-15, -92, -21);
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(ZII)V", line = 126)
    private final void method1128(boolean arg0, int arg1, int arg2) {
        class351.field5046 = arg2;
        class148.field1796 = arg2;
        if (arg1 == -1) {
            arg1 = 0;
        }
        class480.field6795 = 0;
        field2823++;
        class40.field479 = -1;
        if (arg0) {
            class101.field1233 = -1;
            class382.field5431 = 0;
            class399.field5690 = arg1;
            class204.field2793 = arg1;
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IILjava/lang/String;IIBI)V", line = 150)
    public final void method1129(int arg0, int arg1, String arg2, int arg3, int arg4, byte arg5, int arg6) {
        field2833++;
        if (arg2 == null) {
            return;
        }
        this.method1128(true, arg4, arg3);
        if (arg5 != 60) {
            return;
        }
        int var8 = arg2.length();
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg6 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg6 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method1141(arg1 - (this.field2819.method2419(false, arg2) / 2), (byte) 63, arg2, var10, (int[]) null, var9, arg0, (class395[]) null);
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V", line = 187)
    public final void method1130(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2827++;
        if (arg0 == null) {
            return;
        }
        this.method1128(true, arg3, arg6);
        if (arg5 != -1) {
            field2821 = null;
        }
        int var8 = arg0.length();
        int[] var9 = new int[var8];
        for (int var10 = 0; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg1 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method1141(arg2 - (this.field2819.method2419(false, arg0) / 2), (byte) 36, arg0, var9, (int[]) null, (int[]) null, arg4, (class395[]) null);
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(ILab;)V", line = 215)
    public static final void method1131(int arg0, class256 arg1) {
        if (arg0 <= 36) {
            field2828 = 63;
        }
        if (arg1.field3654 == 5 && arg1.field3585 != -1) {
            class85.method429(class231.field3205, arg1, (byte) -63);
        }
        field2830++;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIIILjava/lang/String;I)V", line = 230)
    public final void method1132(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5) {
        field2832++;
        if (arg4 != null) {
            this.method1128(true, arg0, arg3);
            this.method1136(arg4, (class395[]) null, (class313) null, 0, (int[]) null, arg2, arg5 ^ arg5, arg1, 0);
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(ZILjava/lang/String;)V", line = 245)
    private final void method1133(boolean arg0, int arg1, String arg2) {
        field2818++;
        int var4 = 0;
        boolean var5 = false;
        if (!arg0) {
            field2837 = null;
        }
        for (int var6 = 0; arg2.length() > var6; var6++) {
            char var7 = arg2.charAt(var6);
            if (var7 == '<') {
                var5 = true;
            } else if (var7 == '>') {
                var5 = false;
            } else if (!var5 && var7 == ' ') {
                var4++;
            }
        }
        if (var4 > 0) {
            class382.field5431 = (arg1 - this.field2819.method2419(false, arg2) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 283)
    private final void method1134(String arg0, byte arg1) {
        field2826++;
        try {
            if (arg1 != 67) {
                field2836 = false;
            }
            if (arg0.startsWith("col=")) {
                class148.field1796 = class148.field1796 & 0xFF000000 | class421.method2510(arg0.substring(4), 16, (byte) 86) & 0xFFFFFF;
            } else if (arg0.equals("/col")) {
                class148.field1796 = class148.field1796 & 0xFF000000 | class351.field5046 & 0xFFFFFF;
            }
            if (arg0.startsWith("argb=")) {
                class148.field1796 = class421.method2510(arg0.substring(5), 16, (byte) 95);
            } else if (arg0.equals("/argb")) {
                class148.field1796 = class351.field5046;
            } else if (arg0.startsWith("str=")) {
                class101.field1233 = class421.method2510(arg0.substring(4), 16, (byte) 41) | 0xFF000000;
            } else if (arg0.equals("str")) {
                class101.field1233 = -8388608;
            } else if (arg0.equals("/str")) {
                class101.field1233 = -1;
            } else if (arg0.startsWith("u=")) {
                class40.field479 = class421.method2510(arg0.substring(2), 16, (byte) 76) | 0xFF000000;
            } else if (arg0.equals("u")) {
                class40.field479 = -16777216;
            } else if (arg0.equals("/u")) {
                class40.field479 = -1;
            } else if (arg0.equalsIgnoreCase("shad=-1")) {
                class204.field2793 = 0;
            } else if (arg0.startsWith("shad=")) {
                class204.field2793 = class421.method2510(arg0.substring(5), 16, (byte) 63) | 0xFF000000;
            } else if (arg0.equals("shad")) {
                class204.field2793 = -16777216;
            } else if (arg0.equals("/shad")) {
                class204.field2793 = class399.field5690;
            } else if (arg0.equals("br")) {
                this.method1128(true, class399.field5690, class351.field5046);
                return;
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIIIIIIIIIIIII)V", line = 359)
    public static final void method1135(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        field2817++;
        class187 var15;
        if (arg1 < 0) {
            int var14 = -arg1 - 1;
            if (class61.field760 == var14) {
                var15 = class19.field258;
            } else {
                var15 = class46.field596[var14];
            }
        } else {
            int var16 = arg1 - 1;
            var15 = class448.field6366[var16];
        }
        if (var15 == null || arg8 != -4) {
            return;
        }
        class415 var17 = class173.field2084.method2297(50, arg5);
        int var18;
        int var19;
        if (arg7 == 1 || arg7 == 3) {
            var19 = var17.field5927;
            var18 = var17.field5939;
        } else {
            var18 = var17.field5927;
            var19 = var17.field5939;
        }
        int var20 = (var19 >> 1) + arg11;
        int var21 = arg11 + (var19 + 1 >> 1);
        int var22 = (var18 >> 1) + arg10;
        int var23 = (var18 + 1 >> 1) + arg10;
        class443 var24 = class398.field5667[arg6];
        int var25 = var24.method1861(var20, var22) + var24.method1861(var21, var22) + (var24.method1861(var20, var23) - -var24.method1861(var21, var23)) >> 2;
        class176 var26 = new class176();
        var26.field2111 = arg11;
        var26.field2114 = class204.field2796 + arg12;
        var26.field2126 = class204.field2796 + arg9;
        var26.field2125 = arg10;
        var26.field2109 = arg5;
        var26.field2112 = arg4;
        var26.field2110 = arg7;
        var26.field2124 = var15.field994;
        if (arg13 > arg0) {
            int var27 = arg13;
            arg13 = arg0;
            arg0 = var27;
        }
        var26.field2121 = arg11 + arg13;
        var26.field2116 = arg0 + arg11;
        if (arg3 < arg2) {
            int var28 = arg2;
            arg2 = arg3;
            arg3 = var28;
        }
        var26.field2128 = var26.field2111 * 128 + var19 * 64;
        var26.field2115 = arg10 + arg3;
        var26.field2108 = var25;
        var26.field2120 = var26.field2125 * 128 + (var18 * 64);
        var26.field2123 = arg2 + arg10;
        class451.field6383.method803(var26, 50);
        var15.field2533 = var26;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Ljava/lang/String;[Lrg;Lhg;I[IIIII)V", line = 465)
    private final void method1136(String arg0, class395[] arg1, class313 arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8) {
        field2834++;
        int var10 = arg7 - this.field2819.field5766;
        int var11 = -1;
        int var12 = -1;
        int var13 = arg0.length();
        for (int var14 = arg6; var14 < var13; var14++) {
            char var15 = (char) (class470.method2781((byte) -42, arg0.charAt(var14)) & 0xFF);
            if (var15 == '<') {
                var11 = var14;
            } else {
                if (var15 == '>' && var11 != -1) {
                    String var16 = arg0.substring(var11 + 1, var14);
                    var11 = -1;
                    if (var16.equals("lt")) {
                        var15 = '<';
                    } else if (var16.equals("gt")) {
                        var15 = '>';
                    } else if (var16.equals("nbsp")) {
                        var15 = ' ';
                    } else if (var16.equals("shy")) {
                        var15 = '\u00AD';
                    } else if (var16.equals("times")) {
                        var15 = '×';
                    } else if (var16.equals("euro")) {
                        var15 = '€';
                    } else if (var16.equals("copy")) {
                        var15 = '©';
                    } else {
                        if (!var16.equals("reg")) {
                            if (var16.startsWith("img=")) {
                                try {
                                    int var17 = class184.method997(var16.substring(4), false);
                                    class395 var18 = arg1[var17];
                                    int var19 = arg4 == null ? var18.method222() : arg4[var17];
                                    if ((class148.field1796 & 0xFF000000) == -16777216) {
                                        var18.method214(arg5, this.field2819.field5766 + var10 - var19, 0, 0, 1);
                                    } else {
                                        var18.method214(arg5, this.field2819.field5766 + var10 - var19, 1, class148.field1796 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    arg5 += arg1[var17].method216();
                                    var12 = -1;
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method1134(var16, (byte) 67);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg5 += this.field2819.method2417(var12, (byte) -18, var15);
                    }
                    if (var15 == ' ') {
                        if (class382.field5431 > 0) {
                            class480.field6795 += class382.field5431;
                            arg5 += class480.field6795 >> 8;
                            class480.field6795 &= 0xFF;
                        }
                    } else if (arg2 == null) {
                        if ((class204.field2793 & 0xFF000000) != 0) {
                            this.method254(var15, arg5 + 1, var10 + 1, class204.field2793, true);
                        }
                        this.method254(var15, arg5, var10, class148.field1796, false);
                    } else {
                        if ((class204.field2793 & 0xFF000000) != 0) {
                            this.method256(var15, arg5 + 1, var10 + 1, class204.field2793, true, arg2, arg3, arg8);
                        }
                        this.method256(var15, arg5, var10, class148.field1796, false, arg2, arg3, arg8);
                    }
                    int var20 = this.field2819.method2420(var15, true);
                    if (class101.field1233 != -1) {
                        this.field2829.method1756(class101.field1233, arg5, (int) ((double) this.field2819.field5766 * 0.7D) + var10, var20, 9);
                    }
                    if (class40.field479 != -1) {
                        this.field2829.method1756(class40.field479, arg5, this.field2819.field5766 + var10 + 1, var20, 9);
                    }
                    var12 = var15;
                    arg5 += var20;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "([Lrg;Ljava/lang/String;III[III)V", line = 618)
    public final void method1137(class395[] arg0, String arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7) {
        field2814++;
        if (arg1 != null) {
            this.method1128(true, arg7, arg2);
            this.method1136(arg1, arg0, (class313) null, 0, arg5, arg3, 0, arg4, 0);
            int var9 = 92 / ((75 - arg6) / 37);
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Ljava/lang/String;IIIIIZI)V", line = 632)
    public final void method1138(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        field2813++;
        if (arg0 == null) {
            return;
        }
        this.method1128(true, arg3, arg7);
        double var9 = 7.0D - ((double) arg5 / 8.0D);
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg0.length();
        int[] var12 = new int[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (var9 * Math.sin((double) var13 / 1.5D + (double) arg2));
        }
        this.method1141(arg1 - this.field2819.method2419(arg6, arg0) / 2, (byte) 61, arg0, var12, (int[]) null, (int[]) null, arg4, (class395[]) null);
    }

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(Loj;Lbg;)V", line = 659)
    public class206(class280 arg0, class406 arg1) {
        this.field2829 = arg0;
        this.field2819 = arg1;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(ILhg;I[IIIIII[Lrg;ILjava/lang/String;IIII)I", line = 669)
    public final int method1139(int arg0, class313 arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class395[] arg9, int arg10, String arg11, int arg12, int arg13, int arg14, int arg15) {
        field2815++;
        if (arg11 == null) {
            return 0;
        }
        this.method1128(true, arg12, arg15);
        if (arg13 == 0) {
            arg13 = this.field2819.field5766;
        }
        int[] var17;
        if (arg14 < this.field2819.field5770 + arg13 + this.field2819.field5763 && (arg13 + arg13) > arg14) {
            var17 = null;
        } else {
            var17 = new int[] { arg6 };
        }
        int var18 = this.field2819.method2424(var17, class263.field3778, arg11, -97, arg9);
        if (arg0 == 3 && var18 == 1) {
            arg0 = 1;
        }
        int var19;
        if (arg0 == 0) {
            var19 = this.field2819.field5770 + arg2;
        } else if (arg0 == 1) {
            var19 = (arg14 - ((var18 - 1) * arg13) - this.field2819.field5763 - this.field2819.field5770) / 2 + arg2 + this.field2819.field5770;
        } else if (arg0 == 2) {
            var19 = arg14 + arg2 - this.field2819.field5763 - (var18 + -1) * arg13;
        } else {
            int var20 = (arg14 - ((var18 - 1) * arg13) - this.field2819.field5770 - this.field2819.field5763) / (var18 + 1);
            if (var20 < 0) {
                var20 = 0;
            }
            arg13 += var20;
            var19 = this.field2819.field5770 + arg2 + var20;
        }
        for (int var21 = arg7; var21 < var18; var21++) {
            if (arg4 == 0) {
                this.method1136(class263.field3778[var21], arg9, arg1, arg5, arg3, arg10, 0, var19, arg8);
            } else if (arg4 == 1) {
                this.method1136(class263.field3778[var21], arg9, arg1, arg5, arg3, arg10 + (arg6 - this.field2819.method2419(false, class263.field3778[var21])) / 2, 0, var19, arg8);
            } else if (arg4 == 2) {
                this.method1136(class263.field3778[var21], arg9, arg1, arg5, arg3, arg6 + arg10 - this.field2819.method2419(false, class263.field3778[var21]), 0, var19, arg8);
            } else if ((var18 - 1) == var21) {
                this.method1136(class263.field3778[var21], arg9, arg1, arg5, arg3, arg10, 0, var19, arg8);
            } else {
                this.method1133(true, arg6, class263.field3778[var21]);
                this.method1136(class263.field3778[var21], arg9, arg1, arg5, arg3, arg10, arg7, var19, arg8);
                class382.field5431 = 0;
            }
            var19 += arg13;
        }
        return var18;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(III)V", line = 752)
    public static final void method1140(int arg0, int arg1, int arg2) {
        field2820++;
        class89 var3 = class146.method695(13, arg2, (byte) -18);
        var3.method449(true);
        var3.field1106 = arg1;
        if (arg0 != -21759) {
            method1140(123, 118, 70);
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IBLjava/lang/String;[I[I[II[Lrg;)V", line = 767)
    private final void method1141(int arg0, byte arg1, String arg2, int[] arg3, int[] arg4, int[] arg5, int arg6, class395[] arg7) {
        if (arg1 <= 11) {
            this.field2819 = null;
        }
        int var9 = arg6 - this.field2819.field5766;
        field2822++;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg2.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class470.method2781((byte) -42, arg2.charAt(var14)) & 0xFF);
            if (var15 == '<') {
                var10 = var14;
            } else {
                if (var15 == '>' && var10 != -1) {
                    String var16 = arg2.substring(var10 + 1, var14);
                    var10 = -1;
                    if (var16.equals("lt")) {
                        var15 = '<';
                    } else if (var16.equals("gt")) {
                        var15 = '>';
                    } else if (var16.equals("nbsp")) {
                        var15 = ' ';
                    } else if (var16.equals("shy")) {
                        var15 = '\u00AD';
                    } else if (var16.equals("times")) {
                        var15 = '×';
                    } else if (var16.equals("euro")) {
                        var15 = '€';
                    } else if (var16.equals("copy")) {
                        var15 = '©';
                    } else {
                        if (!var16.equals("reg")) {
                            if (var16.startsWith("img=")) {
                                try {
                                    int var17;
                                    if (arg5 == null) {
                                        var17 = 0;
                                    } else {
                                        var17 = arg5[var12];
                                    }
                                    int var18;
                                    if (arg3 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg3[var12];
                                    }
                                    var12++;
                                    int var19 = class184.method997(var16.substring(4), false);
                                    class395 var20 = arg7[var19];
                                    int var21 = arg4 == null ? var20.method222() : arg4[var19];
                                    var20.method214(arg0 + var17, var9 + var18 + this.field2819.field5766 + -var21, 0, 0, 1);
                                    arg0 += arg7[var19].method216();
                                    var11 = -1;
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method1134(var16, (byte) 67);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg0 += this.field2819.method2417(var11, (byte) -18, var15);
                    }
                    int var22;
                    if (arg5 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg5[var12];
                    }
                    int var23;
                    if (arg3 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg3[var12];
                    }
                    if (var15 != ' ') {
                        if ((class204.field2793 & 0xFF000000) != 0) {
                            this.method254(var15, var22 + arg0 + 1, var23 + 1 + var9, class204.field2793, true);
                        }
                        this.method254(var15, arg0 + var22, var9 + var23, class148.field1796, false);
                    } else if (class382.field5431 > 0) {
                        class480.field6795 += class382.field5431;
                        arg0 += class480.field6795 >> 8;
                        class480.field6795 &= 0xFF;
                    }
                    var12++;
                    int var24 = this.field2819.method2420(var15, true);
                    if (class101.field1233 != -1) {
                        this.field2829.method1756(class101.field1233, arg0, (int) ((double) this.field2819.field5766 * 0.7D) + var9, var24, 9);
                    }
                    if (class40.field479 != -1) {
                        this.field2829.method1756(class40.field479, arg0, this.field2819.field5766 + var9, var24, 9);
                    }
                    arg0 += var24;
                    var11 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(ILjava/lang/String;ILjava/util/Random;[IZI[Lrg;II)I", line = 940)
    public final int method1142(int arg0, String arg1, int arg2, Random arg3, int[] arg4, boolean arg5, int arg6, class395[] arg7, int arg8, int arg9) {
        field2831++;
        if (arg1 == null) {
            return 0;
        }
        arg3.setSeed((long) arg8);
        int var11 = (arg3.nextInt() & 0x1F) + 192;
        this.method1128(arg5, arg9 & 0xFFFFFF | var11 << 24, arg0 & 0xFFFFFF | var11 << 24);
        int var12 = arg1.length();
        int[] var13 = new int[var12];
        int var14 = 0;
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg3.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        this.method1141(arg6, (byte) 20, arg1, (int[]) null, arg4, var13, arg2, arg7);
        return var14;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(CIIIZLhg;II)V")
    public abstract void method256(char arg0, int arg1, int arg2, int arg3, boolean arg4, class313 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(CIIIZ)V")
    public abstract void method254(char arg0, int arg1, int arg2, int arg3, boolean arg4);
}
