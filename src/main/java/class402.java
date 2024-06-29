import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public abstract class class402 {

    @OriginalMember(owner = "client!da", name = "r", descriptor = "Lha;")
    private class548 field5770;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "Lej;")
    private class179 field5767;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "[F")
    public static float[] field5757 = new float[16384];

    @OriginalMember(owner = "client!da", name = "k", descriptor = "[F")
    public static float[] field5763 = new float[16384];

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field5753;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public static int field5754;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public static int field5755;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public static int field5756;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public static int field5758;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public static int field5759;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    public static int field5760;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "I")
    public static int field5761;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "I")
    public static int field5762;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "I")
    public static int field5764;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "I")
    public static int field5765;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "I")
    public static int field5766;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "I")
    public static int field5768;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "I")
    public static int field5769;

    @OriginalMember(owner = "client!da", name = "s", descriptor = "I")
    public static int field5771;

    @OriginalMember(owner = "client!da", name = "t", descriptor = "I")
    public static int field5772;

    @OriginalMember(owner = "client!da", name = "u", descriptor = "I")
    public static int field5773;

    @OriginalMember(owner = "client!da", name = "v", descriptor = "I")
    public static int field5774;

    @OriginalMember(owner = "client!da", name = "w", descriptor = "I")
    public static int field5775;

    @OriginalMember(owner = "client!da", name = "x", descriptor = "I")
    public static int field5776;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field5757[var2] = (float) Math.sin((double) var2 * var0);
            field5763[var2] = (float) Math.cos((double) var2 * var0);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IBI)V", line = 7)
    private final void method2501(int arg0, byte arg1, int arg2) {
        class235.field3480 = -1;
        class618.field8302 = 0;
        field5761++;
        if (arg0 == -1) {
            arg0 = 0;
        }
        class384.field5505 = 0;
        if (arg1 != -14) {
            this.method2502(-97, null, 6, 39, 64, null, null, -122, null);
        }
        class129.field1803 = -1;
        class264.field3863 = arg2;
        class214.field2806 = arg2;
        class500.field6978 = arg0;
        class667.field9209 = arg0;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I[Lfd;III[ILaa;ILjava/lang/String;)V", line = 30)
    private final void method2502(int arg0, class298[] arg1, int arg2, int arg3, int arg4, int[] arg5, class573 arg6, int arg7, String arg8) {
        int var10 = arg0 - this.field5767.field2458;
        field5755++;
        int var11 = -1;
        int var12 = -1;
        int var13 = arg8.length();
        int var14 = 0;
        if (arg3 < 18) {
            this.field5770 = null;
        }
        while (var14 < var13) {
            char var15 = (char) (class27.method156(true, arg8.charAt(var14)) & 0xFF);
            if (var15 == '<') {
                var11 = var14;
            } else {
                label106: {
                    if (var15 == '>' && var11 != -1) {
                        String var16 = arg8.substring(var11 + 1, var14);
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
                                        int var17 = class341.method2169(var16.substring(4), 126);
                                        class298 var18 = arg1[var17];
                                        int var19 = arg5 == null ? var18.method1961() : arg5[var17];
                                        if ((class214.field2806 & 0xFF000000) == -16777216) {
                                            var18.method1013(arg4, var10 + this.field5767.field2458 - var19, 1, 0, 1);
                                        } else {
                                            var18.method1013(arg4, var10 + this.field5767.field2458 - var19, 0, class214.field2806 & 0xFF000000 | 0xFFFFFF, 1);
                                        }
                                        var12 = -1;
                                        arg4 += arg1[var17].method1963();
                                    } catch (Exception var21) {
                                    }
                                } else {
                                    this.method2520(var16, (byte) 98);
                                }
                                break label106;
                            }
                            var15 = '®';
                        }
                    }
                    if (var11 == -1) {
                        if (var12 != -1) {
                            arg4 += this.field5767.method1130(var15, var12, -127);
                        }
                        if (var15 == ' ') {
                            if (class384.field5505 > 0) {
                                class618.field8302 += class384.field5505;
                                arg4 += class618.field8302 >> 8;
                                class618.field8302 &= 0xFF;
                            }
                        } else if (arg6 == null) {
                            if ((class667.field9209 & 0xFF000000) != 0) {
                                this.method829(var15, arg4 + 1, var10 + 1, class667.field9209, true);
                            }
                            this.method829(var15, arg4, var10, class214.field2806, false);
                        } else {
                            if ((class667.field9209 & 0xFF000000) != 0) {
                                this.method830(var15, arg4 + 1, var10 + 1, class667.field9209, true, arg6, arg7, arg2);
                            }
                            this.method830(var15, arg4, var10, class214.field2806, false, arg6, arg7, arg2);
                        }
                        int var20 = this.field5767.method1135(var15, 0);
                        if (class129.field1803 != -1) {
                            this.field5770.method3243(arg4, (byte) -27, (int) ((double) this.field5767.field2458 * 0.7D) + var10, class129.field1803, var20);
                        }
                        if (class235.field3480 != -1) {
                            this.field5770.method3243(arg4, (byte) -27, this.field5767.field2458 + var10 + 1, class235.field3480, var20);
                        }
                        arg4 += var20;
                        var12 = var15;
                    }
                }
            }
            var14++;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIII[IILaa;ILjava/lang/String;III[Lfd;III)I", line = 184)
    public final int method2503(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, class573 arg6, int arg7, String arg8, int arg9, int arg10, int arg11, class298[] arg12, int arg13, int arg14, int arg15) {
        if (arg9 != 0) {
            field5763 = null;
        }
        field5759++;
        return this.method2513(arg5, -4, arg1, arg12, arg13, arg7, arg8, arg4, arg0, arg2, arg14, 0, arg11, arg15, arg6, arg10, arg3);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIBIIILjava/lang/String;I)V", line = 195)
    public final void method2504(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, String arg6, int arg7) {
        field5769++;
        if (arg6 == null) {
            return;
        }
        this.method2501(arg0, (byte) -14, arg7);
        double var9 = 7.0D - ((double) arg5 / 8.0D);
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg6.length();
        int[] var12 = new int[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (Math.sin((double) var13 / 1.5D + (double) arg4) * var9);
        }
        this.method2519(arg3, null, var12, arg1 - (this.field5767.method1133(106, arg6) / 2), null, arg6, null, (byte) -53);
        if (arg2 < 125) {
            this.method2508(null, -53, -43, -70, 111, 41);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIILjava/lang/String;II)V", line = 230)
    public final void method2505(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5) {
        field5764++;
        if (arg1 < -68 && arg3 != null) {
            this.method2501(arg2, (byte) -14, arg4);
            this.method2502(arg5, null, 0, 94, arg0, null, null, 0, arg3);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIILjava/lang/String;I)V", line = 247)
    public final void method2506(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5) {
        field5771++;
        if (arg4 != null && arg2 <= -84) {
            this.method2501(arg5, (byte) -14, arg1);
            this.method2502(arg3, null, 0, 69, arg0 - this.field5767.method1133(114, arg4), null, null, 0, arg4);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;IIIBII)V", line = 263)
    public final void method2507(String arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field5775++;
        if (arg0 == null) {
            return;
        }
        this.method2501(arg1, (byte) -14, arg2);
        int var8 = arg0.length();
        if (arg4 != 45) {
            return;
        }
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg6 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg6 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method2519(arg5, null, var10, arg3 - (this.field5767.method1133(87, arg0) / 2), null, arg0, var9, (byte) -53);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;IIIII)V", line = 298)
    public final void method2508(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = -97 / ((arg4 - 21) / 41);
        field5773++;
        if (arg0 != null) {
            this.method2501(arg3, (byte) -14, arg2);
            this.method2502(arg1, null, 0, 100, arg5 - (this.field5767.method1133(88, arg0) / 2), null, null, 0, arg0);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;IIII)V", line = 315)
    public final void method2509(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5, int arg6) {
        field5758++;
        if (arg2 == null) {
            return;
        }
        int var8 = 90 / ((-arg6 - 25) / 40);
        this.method2501(arg0, (byte) -14, arg3);
        int var9 = arg2.length();
        int[] var10 = new int[var9];
        for (int var11 = 0; var11 < var9; var11++) {
            var10[var11] = (int) (Math.sin((double) arg1 / 5.0D + (double) var11 / 2.0D) * 5.0D);
        }
        this.method2519(arg5, null, var10, arg4 - this.field5767.method1133(117, arg2) / 2, null, arg2, null, (byte) -53);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I[Lfd;BI[ILjava/lang/String;II)V", line = 340)
    public final void method2510(int arg0, class298[] arg1, byte arg2, int arg3, int[] arg4, String arg5, int arg6, int arg7) {
        field5768++;
        if (arg2 != -92) {
            this.method2504(71, -83, (byte) 44, -76, -120, -69, null, -21);
        }
        if (arg5 != null) {
            this.method2501(arg6, (byte) -14, arg7);
            this.method2502(arg3, arg1, 0, 105, arg0, arg4, null, 0, arg5);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I[Lfd;IIIILjava/util/Random;[IILjava/lang/String;)I", line = 359)
    public final int method2511(int arg0, class298[] arg1, int arg2, int arg3, int arg4, int arg5, Random arg6, int[] arg7, int arg8, String arg9) {
        field5774++;
        if (arg9 == null) {
            return 0;
        }
        arg6.setSeed((long) arg0);
        int var11 = (arg3 & arg6.nextInt()) + 192;
        this.method2501(var11 << 24 | arg5 & 0xFFFFFF, (byte) -14, arg8 & 0xFFFFFF | var11 << 24);
        int var12 = arg9.length();
        int[] var13 = new int[var12];
        int var14 = 0;
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg6.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        this.method2519(arg2, arg1, null, arg4, arg7, arg9, var13, (byte) -53);
        return var14;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BIZI)V", line = 396)
    public static final void method2512(byte arg0, int arg1, boolean arg2, int arg3) {
        field5776++;
        if (arg3 < 8000 || arg3 > 48000) {
            throw new IllegalArgumentException();
        }
        class364.field5186 = arg1;
        int var4 = 2 % ((17 - arg0) / 35);
        class644.field8627 = arg2;
        class718.field9998 = arg3;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(III[Lfd;IILjava/lang/String;[IIIIIIILaa;II)I", line = 412)
    public final int method2513(int arg0, int arg1, int arg2, class298[] arg3, int arg4, int arg5, String arg6, int[] arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, class573 arg14, int arg15, int arg16) {
        field5762++;
        if (arg6 == null) {
            return 0;
        }
        this.method2501(arg4, (byte) -14, arg16);
        if (arg9 == 0) {
            arg9 = this.field5767.field2458;
        }
        int[] var18;
        if (arg0 < this.field5767.field2464 + arg9 + this.field5767.field2462 && arg0 < arg9 + arg9) {
            var18 = null;
        } else {
            var18 = new int[] { arg12 };
        }
        int var19 = this.field5767.method1129((byte) 91, arg6, class357.field5122, arg3, var18);
        if (arg11 == -1) {
            arg11 = arg0 / arg9;
            if (arg11 <= 0) {
                arg11 = 1;
            }
        }
        if (arg11 > 0 && var19 >= arg11) {
            class357.field5122[arg11 - 1] = this.field5767.method1138(false, arg3, class357.field5122[arg11 - 1], arg12);
            var19 = arg11;
        }
        if (~arg8 == arg1 && var19 == 1) {
            arg8 = 1;
        }
        int var21;
        if (arg8 == 0) {
            var21 = arg10 + this.field5767.field2462;
        } else if (arg8 == 1) {
            var21 = (arg0 - this.field5767.field2464 - (var19 - 1) * arg9 - this.field5767.field2462) / 2 + this.field5767.field2462 + arg10;
        } else if (arg8 == 2) {
            var21 = arg0 + arg10 - ((var19 + -1) * arg9) - this.field5767.field2464;
        } else {
            int var20 = (arg0 - ((var19 - 1) * arg9) - this.field5767.field2462 - this.field5767.field2464) / (var19 + 1);
            if (var20 < 0) {
                var20 = 0;
            }
            var21 = arg10 + var20 + this.field5767.field2462;
            arg9 += var20;
        }
        for (int var22 = 0; var22 < var19; var22++) {
            if (arg2 == 0) {
                this.method2502(var21, arg3, arg13, 31, arg5, arg7, arg14, arg15, class357.field5122[var22]);
            } else if (arg2 == 1) {
                this.method2502(var21, arg3, arg13, 22, arg5 + (arg12 - this.field5767.method1133(95, class357.field5122[var22])) / 2, arg7, arg14, arg15, class357.field5122[var22]);
            } else if (arg2 == 2) {
                this.method2502(var21, arg3, arg13, 53, (arg5 + arg12) - this.field5767.method1133(arg1 ^ 0xFFFFFF99, class357.field5122[var22]), arg7, arg14, arg15, class357.field5122[var22]);
            } else if (var19 - 1 == var22) {
                this.method2502(var21, arg3, arg13, arg1 + 48, arg5, arg7, arg14, arg15, class357.field5122[var22]);
            } else {
                this.method2514(arg12, class357.field5122[var22], (byte) -110);
                this.method2502(var21, arg3, arg13, 43, arg5, arg7, arg14, arg15, class357.field5122[var22]);
                class384.field5505 = 0;
            }
            var21 += arg9;
        }
        return var19;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;B)V", line = 512)
    private final void method2514(int arg0, String arg1, byte arg2) {
        field5756++;
        int var4 = 0;
        if (arg2 != -110) {
            return;
        }
        boolean var5 = false;
        for (int var6 = 0; arg1.length() > var6; var6++) {
            char var7 = arg1.charAt(var6);
            if (var7 == '<') {
                var5 = true;
            } else if (var7 == '>') {
                var5 = false;
            } else if (!var5 && var7 == ' ') {
                var4++;
            }
        }
        if (var4 > 0) {
            class384.field5505 = (arg0 - this.field5767.method1133(99, arg1) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;I)Luf;", line = 550)
    public static final class362 method2515(int arg0, String arg1, int arg2) {
        field5753++;
        class362 var3;
        try {
            var3 = (class362) Class.forName("qia").getDeclaredConstructor().newInstance();
        } catch (Throwable var4) {
            var3 = new class188();
        }
        var3.field5173 = arg1;
        var3.field5172 = arg2;
        if (arg0 < 25) {
            field5757 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(III[IIIII)Z", line = 572)
    public static final boolean method2516(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg7 != -17575) {
            method2515(54, null, 14);
        }
        if (class702.field9783 < arg1) {
            arg1 = class702.field9783;
        }
        if (arg2 < 0) {
            arg2 = 0;
        }
        field5772++;
        if (arg2 >= arg1) {
            return true;
        }
        int var8 = arg1 - arg2 >> 2;
        int var9 = arg2 * arg5 + arg6;
        int var10 = arg2 + arg4 - 1;
        int var10000;
        if (class139.field1982 == 1) {
            class527.field7314 += var8;
            while (true) {
                var8--;
                if (var8 < 0) {
                    int var16 = arg1 - arg2 & 0x3;
                    while (true) {
                        var16--;
                        if (var16 < 0) {
                            return true;
                        }
                        var10++;
                        if (arg3[var10] > var9) {
                            arg3[var10] = var9;
                        }
                        var9 += arg5;
                    }
                }
                var10++;
                if (arg3[var10] > var9) {
                    arg3[var10] = var9;
                }
                int var17 = arg5 + var9;
                var10++;
                if (arg3[var10] > var17) {
                    arg3[var10] = var17;
                }
                int var18 = arg5 + var17;
                var10++;
                if (var18 < arg3[var10]) {
                    arg3[var10] = var18;
                }
                int var19 = arg5 + var18;
                var10000 = ~var19;
                var10++;
                if (var10000 > ~arg3[var10]) {
                    arg3[var10] = var19;
                }
                var9 = arg5 + var19;
            }
        } else {
            int var11 = var9 - 38400;
            while (true) {
                var8--;
                if (var8 < 0) {
                    int var12 = arg1 - arg2 & 0x3;
                    while (true) {
                        var12--;
                        if (var12 < 0) {
                            return true;
                        }
                        var10000 = ~var11;
                        var10++;
                        if (var10000 > ~arg3[var10]) {
                            return false;
                        }
                        var11 += arg5;
                    }
                }
                var10++;
                if (var11 < arg3[var10]) {
                    return false;
                }
                int var13 = arg5 + var11;
                var10++;
                if (var13 < arg3[var10]) {
                    return false;
                }
                int var14 = arg5 + var13;
                var10000 = ~var14;
                var10++;
                if (var10000 > ~arg3[var10]) {
                    return false;
                }
                int var15 = arg5 + var14;
                var10++;
                if (var15 < arg3[var10]) {
                    return false;
                }
                var11 = arg5 + var15;
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V", line = 676)
    public static final void method2517(byte arg0) {
        class728.field10131 = 0;
        class486.field6806 = -1;
        class171.field2378 = -1;
        if (arg0 == -28) {
            field5765++;
            class570.field7877 = -1;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/util/Random;IILjava/lang/String;III[I[III[Lfd;I)I", line = 710)
    public final int method2518(int arg0, int arg1, Random arg2, int arg3, int arg4, String arg5, int arg6, int arg7, int arg8, int[] arg9, int[] arg10, int arg11, int arg12, class298[] arg13, int arg14) {
        field5754++;
        if (arg5 == null) {
            return 0;
        }
        if (arg4 != 659053272) {
            method2517((byte) 61);
        }
        arg2.setSeed((long) arg0);
        int var16 = (arg2.nextInt() & 0x1F) + 192;
        this.method2501(var16 << 24 | arg14 & 0xFFFFFF, (byte) -14, arg6 & 0xFFFFFF | var16 << 24);
        int var17 = arg5.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg2.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        int var21 = arg7;
        int var22 = this.field5767.field2462 + arg8;
        int var23 = -1;
        if (arg12 == 1) {
            var22 += (arg3 - this.field5767.field2464 - this.field5767.field2462) / 2;
        } else if (arg12 == 2) {
            var22 = arg3 + arg8 - this.field5767.field2464;
        }
        if (arg11 == 1) {
            var23 = this.field5767.method1133(97, arg5) + var19;
            var21 = (arg1 - var23) / 2 + arg7;
        } else if (arg11 == 2) {
            var23 = var19 + this.field5767.method1133(arg4 - 659053179, arg5);
            var21 = arg1 + arg7 - var23;
        }
        this.method2519(var22, arg13, null, var21, arg9, arg5, var18, (byte) -53);
        if (arg10 != null) {
            if (var23 == -1) {
                var23 = this.field5767.method1133(86, arg5) + var19;
            }
            arg10[3] = this.field5767.field2464 + this.field5767.field2462;
            arg10[1] = var22 - this.field5767.field2462;
            arg10[2] = var23;
            arg10[0] = var21;
        }
        return var19;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I[Lfd;[II[ILjava/lang/String;[IB)V", line = 785)
    private final void method2519(int arg0, class298[] arg1, int[] arg2, int arg3, int[] arg4, String arg5, int[] arg6, byte arg7) {
        field5766++;
        int var9 = arg0 - this.field5767.field2458;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg5.length();
        int var14 = 0;
        if (arg7 != -53) {
            method2512((byte) -10, 103, true, -59);
        }
        while (var13 > var14) {
            char var15 = (char) (class27.method156(true, arg5.charAt(var14)) & 0xFF);
            if (var15 == '<') {
                var10 = var14;
            } else {
                label114: {
                    if (var15 == '>' && var10 != -1) {
                        String var16 = arg5.substring(var10 + 1, var14);
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
                                        if (arg6 == null) {
                                            var17 = 0;
                                        } else {
                                            var17 = arg6[var12];
                                        }
                                        int var18;
                                        if (arg2 == null) {
                                            var18 = 0;
                                        } else {
                                            var18 = arg2[var12];
                                        }
                                        var12++;
                                        int var19 = class341.method2169(var16.substring(4), arg7 ^ 0xFFFFFFA5);
                                        class298 var20 = arg1[var19];
                                        int var21 = arg4 == null ? var20.method1961() : arg4[var19];
                                        var20.method1013(arg3 + var17, this.field5767.field2458 - var21 + var9 + var18, 1, 0, 1);
                                        var11 = -1;
                                        arg3 += arg1[var19].method1963();
                                    } catch (Exception var25) {
                                    }
                                } else {
                                    this.method2520(var16, (byte) 98);
                                }
                                break label114;
                            }
                            var15 = '®';
                        }
                    }
                    if (var10 == -1) {
                        if (var11 != -1) {
                            arg3 += this.field5767.method1130(var15, var11, -118);
                        }
                        int var22;
                        if (arg6 == null) {
                            var22 = 0;
                        } else {
                            var22 = arg6[var12];
                        }
                        int var23;
                        if (arg2 == null) {
                            var23 = 0;
                        } else {
                            var23 = arg2[var12];
                        }
                        if (var15 != ' ') {
                            if ((class667.field9209 & 0xFF000000) != 0) {
                                this.method829(var15, arg3 + var22 + 1, var9 + var23 - -1, class667.field9209, true);
                            }
                            this.method829(var15, arg3 + var22, var9 + var23, class214.field2806, false);
                        } else if (class384.field5505 > 0) {
                            class618.field8302 += class384.field5505;
                            arg3 += class618.field8302 >> 8;
                            class618.field8302 &= 0xFF;
                        }
                        var12++;
                        int var24 = this.field5767.method1135(var15, 0);
                        if (class129.field1803 != -1) {
                            this.field5770.method3243(arg3, (byte) -27, var9 + ((int) ((double) this.field5767.field2458 * 0.7D)), class129.field1803, var24);
                        }
                        if (class235.field3480 != -1) {
                            this.field5770.method3243(arg3, (byte) -27, this.field5767.field2458 + var9, class235.field3480, var24);
                        }
                        arg3 += var24;
                        var11 = var15;
                    }
                }
            }
            var14++;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 947)
    private final void method2520(String arg0, byte arg1) {
        field5760++;
        try {
            if (arg0.startsWith("col=")) {
                class214.field2806 = class214.field2806 & 0xFF000000 | class269.method1827(16, 16, arg0.substring(4)) & 0xFFFFFF;
            } else if (arg0.equals("/col")) {
                class214.field2806 = class264.field3863 & 0xFFFFFF | class214.field2806 & 0xFF000000;
            }
            if (arg0.startsWith("argb=")) {
                class214.field2806 = class269.method1827(arg1 - 82, 16, arg0.substring(5));
            } else if (arg0.equals("/argb")) {
                class214.field2806 = class264.field3863;
            } else if (arg0.startsWith("str=")) {
                class129.field1803 = class214.field2806 & 0xFF000000 | class269.method1827(arg1 ^ 0x72, 16, arg0.substring(4));
            } else if (arg0.equals("str")) {
                class129.field1803 = class214.field2806 & 0xFF000000 | 0x800000;
            } else if (arg0.equals("/str")) {
                class129.field1803 = -1;
            } else if (arg0.startsWith("u=")) {
                class235.field3480 = class214.field2806 & 0xFF000000 | class269.method1827(16, 16, arg0.substring(2));
            } else if (arg0.equals("u")) {
                class235.field3480 = class214.field2806 & 0xFF000000;
            } else if (arg0.equals("/u")) {
                class235.field3480 = -1;
            } else if (arg0.equalsIgnoreCase("shad=-1")) {
                class667.field9209 = 0;
            } else if (arg0.startsWith("shad=")) {
                class667.field9209 = class214.field2806 & 0xFF000000 | class269.method1827(16, 16, arg0.substring(5));
            } else if (arg0.equals("shad")) {
                class667.field9209 = class214.field2806 & 0xFF000000;
            } else if (arg0.equals("/shad")) {
                class667.field9209 = class500.field6978;
            } else if (arg0.equals("br")) {
                this.method2501(class500.field6978, (byte) -14, class264.field3863);
            }
        } catch (Exception var3) {
        }
        if (arg1 != 98) {
            this.method2502(86, null, -52, -65, 68, null, null, 81, null);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Z)V", line = 1027)
    public static void method2521(boolean arg0) {
        field5763 = null;
        field5757 = null;
        if (arg0) {
            field5763 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lha;Lej;)V", line = 1037)
    public class402(class548 arg0, class179 arg1) {
        this.field5770 = arg0;
        this.field5767 = arg1;
    }

    @OriginalMember(owner = "client!da", name = "fa", descriptor = "(CIIIZ)V")
    public abstract void method829(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(CIIIZLaa;II)V")
    public abstract void method830(char arg0, int arg1, int arg2, int arg3, boolean arg4, class573 arg5, int arg6, int arg7);
}
