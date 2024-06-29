import java.awt.Canvas;
import java.io.IOException;
import java.util.Date;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public abstract class class400 {

    @OriginalMember(owner = "client!da", name = "s", descriptor = "Lpia;")
    private class54 field5945;

    @OriginalMember(owner = "client!da", name = "u", descriptor = "Lha;")
    private class544 field5947;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public static int field5929 = 0;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field5927;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public static int field5928;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public static int field5930;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field5931;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public static int field5932;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public static int field5933;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    public static int field5934;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "I")
    public static int field5935;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "I")
    public static int field5936;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "I")
    public static int field5937;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "I")
    public static int field5938;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "I")
    public static int field5939;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "I")
    public static int field5940;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "I")
    public static int field5942;

    @OriginalMember(owner = "client!da", name = "r", descriptor = "I")
    public static int field5944;

    @OriginalMember(owner = "client!da", name = "t", descriptor = "I")
    public static int field5946;

    @OriginalMember(owner = "client!da", name = "v", descriptor = "I")
    public static int field5948;

    @OriginalMember(owner = "client!da", name = "w", descriptor = "I")
    public static int field5949;

    @OriginalMember(owner = "client!da", name = "x", descriptor = "I")
    public static int field5950;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "Lofa;")
    public static class301 field5943;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field5941;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIII[Lit;Ljava/lang/String;II[ILaa;III)I", line = 6)
    public final int method2468(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class34[] arg7, String arg8, int arg9, int arg10, int[] arg11, class570 arg12, int arg13, int arg14, int arg15) {
        field5935++;
        if (arg3 != 0) {
            field5936 = 123;
        }
        return this.method2480(arg15, arg6, arg9, arg3 + 98, arg0, arg11, 0, arg2, arg12, arg7, arg13, arg4, arg10, arg8, arg14, arg1, arg5);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/util/Random;ILjava/lang/String;II[Lit;II[I[IIIII)I", line = 21)
    public final int method2469(int arg0, Random arg1, int arg2, String arg3, int arg4, int arg5, class34[] arg6, int arg7, int arg8, int[] arg9, int[] arg10, int arg11, int arg12, int arg13, int arg14) {
        field5939++;
        if (arg3 == null) {
            return 0;
        }
        arg1.setSeed((long) arg5);
        int var16 = (arg1.nextInt() & 0x1F) + 192;
        this.method2478(var16 << 24 | arg8 & 0xFFFFFF, arg4 & 0xFFFFFF | var16 << 24, (byte) 69);
        int var17 = arg3.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg1.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        int var21 = arg7;
        int var22 = 48 / ((arg14 + 66) / 38);
        int var23 = this.field5945.field858 + arg12;
        int var24 = -1;
        if (arg0 == 1) {
            var23 += (arg11 - this.field5945.field861 - this.field5945.field858) / 2;
        } else if (arg0 == 2) {
            var23 = arg12 + arg11 - this.field5945.field861;
        }
        if (arg13 == 1) {
            var24 = this.field5945.method510(arg3, 174) + var19;
            var21 = (arg2 - var24) / 2 + arg7;
        } else if (arg13 == 2) {
            var24 = this.field5945.method510(arg3, 174) + var19;
            var21 = arg2 + arg7 - var24;
        }
        this.method2476(null, var21, var23, 20197, var18, arg10, arg6, arg3);
        if (arg9 != null) {
            if (var24 == -1) {
                var24 = this.field5945.method510(arg3, 174) + var19;
            }
            arg9[2] = var24;
            arg9[3] = this.field5945.field861 + this.field5945.field858;
            arg9[1] = var23 - this.field5945.field858;
            arg9[0] = var21;
        }
        return var19;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II)V", line = 103)
    public static final void method2470(int arg0, int arg1) {
        field5932++;
        if (arg1 == 37) {
            class729.field10217 = 3.0F;
        } else if (arg1 == 50) {
            class729.field10217 = 4.0F;
        } else if (arg1 == 75) {
            class729.field10217 = 6.0F;
        } else if (arg1 == 100) {
            class729.field10217 = 8.0F;
        } else if (arg1 == 200) {
            class729.field10217 = 16.0F;
        }
        class120.field1849 = -1;
        if (arg0 == -201) {
            class120.field1849 = -1;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 145)
    private final void method2471(String arg0, int arg1) {
        if (arg1 != -1) {
            return;
        }
        field5942++;
        try {
            if (arg0.startsWith("col=")) {
                class248.field3978 = class248.field3978 & 0xFF000000 | class144.method1112(16, arg0.substring(4), -70) & 0xFFFFFF;
            } else if (arg0.equals("/col")) {
                class248.field3978 = class188.field3126 & 0xFFFFFF | class248.field3978 & 0xFF000000;
            }
            if (arg0.startsWith("argb=")) {
                class248.field3978 = class144.method1112(16, arg0.substring(5), -88);
            } else if (arg0.equals("/argb")) {
                class248.field3978 = class188.field3126;
            } else if (arg0.startsWith("str=")) {
                class754.field10521 = class248.field3978 & 0xFF000000 | class144.method1112(16, arg0.substring(4), -110);
            } else if (arg0.equals("str")) {
                class754.field10521 = class248.field3978 & 0xFF000000 | 0x800000;
            } else if (arg0.equals("/str")) {
                class754.field10521 = -1;
            } else if (arg0.startsWith("u=")) {
                class199.field3398 = class248.field3978 & 0xFF000000 | class144.method1112(16, arg0.substring(2), -57);
            } else if (arg0.equals("u")) {
                class199.field3398 = class248.field3978 & 0xFF000000;
            } else if (arg0.equals("/u")) {
                class199.field3398 = -1;
            } else if (arg0.equalsIgnoreCase("shad=-1")) {
                class115.field1788 = 0;
                return;
            } else if (arg0.startsWith("shad=")) {
                class115.field1788 = class248.field3978 & 0xFF000000 | class144.method1112(16, arg0.substring(5), -125);
                return;
            } else if (arg0.equals("shad")) {
                class115.field1788 = class248.field3978 & 0xFF000000;
                return;
            } else if (arg0.equals("/shad")) {
                class115.field1788 = class231.field3723;
                return;
            } else if (arg0.equals("br")) {
                this.method2478(class188.field3126, class231.field3723, (byte) 69);
                return;
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;I[Lit;[IIBI)V", line = 221)
    public final void method2472(int arg0, String arg1, int arg2, class34[] arg3, int[] arg4, int arg5, byte arg6, int arg7) {
        field5944++;
        if (arg1 == null) {
            return;
        }
        this.method2478(arg0, arg2, (byte) 69);
        this.method2481(0, arg7, arg4, arg1, 0, arg5, null, false, arg3);
        if (arg6 != 4) {
            this.method2482(null, -62, -109, -58, 90, -87);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZILjava/lang/String;III)V", line = 238)
    public final void method2473(boolean arg0, int arg1, String arg2, int arg3, int arg4, int arg5) {
        field5930++;
        if (arg2 != null) {
            this.method2478(arg4, arg1, (byte) 69);
            this.method2481(0, arg5 - (this.field5945.method510(arg2, 174) / 2), null, arg2, 0, arg3, null, arg0, null);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 252)
    private final void method2474(String arg0, int arg1, int arg2) {
        field5940++;
        int var4 = 0;
        boolean var5 = false;
        int var6 = 0;
        if (arg1 != -16777216) {
            field5943 = null;
        }
        while (var6 < arg0.length()) {
            char var7 = arg0.charAt(var6);
            if (var7 == '<') {
                var5 = true;
            } else if (var7 == '>') {
                var5 = false;
            } else if (!var5 && var7 == ' ') {
                var4++;
            }
            var6++;
        }
        if (var4 > 0) {
            class416.field6108 = (arg2 - this.field5945.method510(arg0, 174) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V", line = 297)
    public static void method2475(int arg0) {
        field5941 = null;
        field5943 = null;
        if (arg0 != 255) {
            method2484(12, null);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([IIII[I[I[Lit;Ljava/lang/String;)V", line = 309)
    private final void method2476(int[] arg0, int arg1, int arg2, int arg3, int[] arg4, int[] arg5, class34[] arg6, String arg7) {
        field5928++;
        int var9 = arg2 - this.field5945.field854;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg7.length();
        if (arg3 != 20197) {
            return;
        }
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class127.method983((byte) -92, arg7.charAt(var14)) & 0xFF);
            if (var15 == '<') {
                var10 = var14;
            } else {
                if (var15 == '>' && var10 != -1) {
                    String var16 = arg7.substring(var10 + 1, var14);
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
                                    if (arg4 == null) {
                                        var17 = 0;
                                    } else {
                                        var17 = arg4[var12];
                                    }
                                    int var18;
                                    if (arg0 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg0[var12];
                                    }
                                    var12++;
                                    int var19 = class714.method3949((byte) -92, var16.substring(4));
                                    class34 var20 = arg6[var19];
                                    int var21 = arg5 == null ? var20.method184() : arg5[var19];
                                    var20.method48(arg1 + var17, var9 - -var18 + -var21 + this.field5945.field854, 1, 0, 1);
                                    arg1 += arg6[var19].method177();
                                    var11 = -1;
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method2471(var16, -1);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg1 += this.field5945.method515(arg3 - 22981, var15, var11);
                    }
                    int var22;
                    if (arg4 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg4[var12];
                    }
                    int var23;
                    if (arg0 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg0[var12];
                    }
                    var12++;
                    if (var15 != ' ') {
                        if ((class115.field1788 & 0xFF000000) != 0) {
                            this.method492(var15, arg1 + var22 + 1, var9 - -1 + var23, class115.field1788, true);
                        }
                        this.method492(var15, arg1 + var22, var9 - -var23, class248.field3978, false);
                    } else if (class416.field6108 > 0) {
                        class510.field7400 += class416.field6108;
                        arg1 += class510.field7400 >> 8;
                        class510.field7400 &= 0xFF;
                    }
                    int var24 = this.field5945.method509(var15, false);
                    if (class754.field10521 != -1) {
                        this.field5947.method3188(var24, class754.field10521, (int) ((double) this.field5945.field854 * 0.7D) + var9, (byte) -97, arg1);
                    }
                    if (class199.field3398 != -1) {
                        this.field5947.method3188(var24, class199.field3398, this.field5945.field854 + var9, (byte) -105, arg1);
                    }
                    var11 = var15;
                    arg1 += var24;
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIILjava/lang/String;)V", line = 473)
    public final void method2477(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6) {
        field5949++;
        if (arg6 == null) {
            return;
        }
        this.method2478(arg3, arg1, (byte) 69);
        if (arg4 != -1513) {
            return;
        }
        int var8 = arg6.length();
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg0 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg0 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method2476(var10, arg5 - (this.field5945.method510(arg6, 174) / 2), arg2, 20197, var9, null, null, arg6);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIB)V", line = 504)
    private final void method2478(int arg0, int arg1, byte arg2) {
        if (arg2 != 69) {
            field5943 = null;
        }
        class416.field6108 = 0;
        class199.field3398 = -1;
        class754.field10521 = -1;
        class188.field3126 = arg0;
        class248.field3978 = arg0;
        if (arg1 == -1) {
            arg1 = 0;
        }
        field5934++;
        class510.field7400 = 0;
        class231.field3723 = arg1;
        class115.field1788 = arg1;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;IIIIZ)V", line = 524)
    public final void method2479(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        field5938++;
        if (arg2 == null) {
            return;
        }
        if (arg7) {
            this.method2483(22, -31, null, -22, -18, -113);
        }
        this.method2478(arg1, arg0, (byte) 69);
        double var9 = 7.0D - (double) arg4 / 8.0D;
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg2.length();
        int[] var12 = new int[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (var9 * Math.sin((double) var13 / 1.5D + (double) arg5));
        }
        this.method2476(var12, arg3 - (this.field5945.method510(arg2, 174) / 2), arg6, 20197, null, null, null, arg2);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIII[IIILaa;[Lit;IIILjava/lang/String;III)I", line = 555)
    public final int method2480(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, class570 arg8, class34[] arg9, int arg10, int arg11, int arg12, String arg13, int arg14, int arg15, int arg16) {
        field5931++;
        if (arg13 == null) {
            return 0;
        }
        this.method2478(arg10, arg2, (byte) 69);
        if (arg4 == 0) {
            arg4 = this.field5945.field854;
        }
        int[] var18;
        if (arg12 < (this.field5945.field861 + arg4 + this.field5945.field858) && arg4 + arg4 > arg12) {
            var18 = null;
        } else {
            var18 = new int[] { arg0 };
        }
        if (arg6 == -1) {
            arg6 = arg12 / arg4;
            if (arg6 <= 0) {
                arg6 = 1;
            }
        }
        int var19 = this.field5945.method511(var18, -7205, arg9, arg13, class206.field3456);
        if (arg6 > 0 && var19 >= arg6) {
            class206.field3456[arg6 - 1] = this.field5945.method513(arg0, 66, class206.field3456[arg6 - 1], arg9);
            var19 = arg6;
        }
        if (arg7 == 3 && var19 == 1) {
            arg7 = 1;
        }
        int var20;
        if (arg7 == 0) {
            var20 = this.field5945.field858 + arg16;
        } else if (arg7 == 1) {
            var20 = (arg12 - this.field5945.field858 - this.field5945.field861 - ((var19 + -1) * arg4)) / 2 + (arg16 + this.field5945.field858);
        } else if (arg7 == 2) {
            var20 = arg12 + arg16 - this.field5945.field861 - ((var19 + -1) * arg4);
        } else {
            int var21 = (arg12 - ((var19 - 1) * arg4) - this.field5945.field861 - this.field5945.field858) / (var19 + 1);
            if (var21 < 0) {
                var21 = 0;
            }
            arg4 += var21;
            var20 = arg16 + var21 + this.field5945.field858;
        }
        int var22 = 31 / ((arg3 - 39) / 55);
        for (int var23 = 0; var23 < var19; var23++) {
            if (arg14 == 0) {
                this.method2481(arg11, arg1, arg5, class206.field3456[var23], arg15, var20, arg8, false, arg9);
            } else if (arg14 == 1) {
                this.method2481(arg11, (arg0 - this.field5945.method510(class206.field3456[var23], 174)) / 2 + arg1, arg5, class206.field3456[var23], arg15, var20, arg8, false, arg9);
            } else if (arg14 == 2) {
                this.method2481(arg11, arg1 + arg0 - this.field5945.method510(class206.field3456[var23], 174), arg5, class206.field3456[var23], arg15, var20, arg8, false, arg9);
            } else if (var19 - 1 == var23) {
                this.method2481(arg11, arg1, arg5, class206.field3456[var23], arg15, var20, arg8, false, arg9);
            } else {
                this.method2474(class206.field3456[var23], -16777216, arg0);
                this.method2481(arg11, arg1, arg5, class206.field3456[var23], arg15, var20, arg8, false, arg9);
                class416.field6108 = 0;
            }
            var20 += arg4;
        }
        return var19;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II[ILjava/lang/String;IILaa;Z[Lit;)V", line = 657)
    private final void method2481(int arg0, int arg1, int[] arg2, String arg3, int arg4, int arg5, class570 arg6, boolean arg7, class34[] arg8) {
        int var10 = arg5 - this.field5945.field854;
        field5946++;
        int var11 = -1;
        int var12 = -1;
        int var13 = arg3.length();
        int var14 = 0;
        if (arg7) {
            this.method2469(-62, null, 93, null, 123, -1, null, -126, -119, null, null, -4, 97, 94, 96);
        }
        while (var14 < var13) {
            char var15 = (char) (class127.method983((byte) 103, arg3.charAt(var14)) & 0xFF);
            if (var15 == '<') {
                var11 = var14;
            } else {
                label106: {
                    if (var15 == '>' && var11 != -1) {
                        String var16 = arg3.substring(var11 + 1, var14);
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
                                        int var17 = class714.method3949((byte) -123, var16.substring(4));
                                        class34 var18 = arg8[var17];
                                        int var19 = arg2 == null ? var18.method184() : arg2[var17];
                                        if ((class248.field3978 & 0xFF000000) == -16777216) {
                                            var18.method48(arg1, this.field5945.field854 + var10 - var19, 1, 0, 1);
                                        } else {
                                            var18.method48(arg1, this.field5945.field854 + var10 - var19, 0, class248.field3978 & 0xFF000000 | 0xFFFFFF, 1);
                                        }
                                        arg1 += arg8[var17].method177();
                                        var12 = -1;
                                    } catch (Exception var21) {
                                    }
                                } else {
                                    this.method2471(var16, -1);
                                }
                                break label106;
                            }
                            var15 = '®';
                        }
                    }
                    if (var11 == -1) {
                        if (var12 != -1) {
                            arg1 += this.field5945.method515(-2784, var15, var12);
                        }
                        if (var15 == ' ') {
                            if (class416.field6108 > 0) {
                                class510.field7400 += class416.field6108;
                                arg1 += class510.field7400 >> 8;
                                class510.field7400 &= 0xFF;
                            }
                        } else if (arg6 == null) {
                            if ((class115.field1788 & 0xFF000000) != 0) {
                                this.method492(var15, arg1 + 1, var10 + 1, class115.field1788, true);
                            }
                            this.method492(var15, arg1, var10, class248.field3978, false);
                        } else {
                            if ((class115.field1788 & 0xFF000000) != 0) {
                                this.method491(var15, arg1 + 1, var10 + 1, class115.field1788, true, arg6, arg4, arg0);
                            }
                            this.method491(var15, arg1, var10, class248.field3978, false, arg6, arg4, arg0);
                        }
                        int var20 = this.field5945.method509(var15, arg7);
                        if (class754.field10521 != -1) {
                            this.field5947.method3188(var20, class754.field10521, (int) ((double) this.field5945.field854 * 0.7D) + var10, (byte) -115, arg1);
                        }
                        if (class199.field3398 != -1) {
                            this.field5947.method3188(var20, class199.field3398, this.field5945.field854 + var10 + 1, (byte) 68, arg1);
                        }
                        var12 = var15;
                        arg1 += var20;
                    }
                }
            }
            var14++;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;IIIII)V", line = 808)
    public final void method2482(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5927++;
        if (arg0 != null) {
            this.method2478(arg4, arg1, (byte) 69);
            this.method2481(0, arg2 - this.field5945.method510(arg0, 174), null, arg0, arg3, arg5, null, false, null);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;III)V", line = 823)
    public final void method2483(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5) {
        if (arg4 >= -25) {
            this.field5945 = null;
        }
        field5937++;
        if (arg2 != null) {
            this.method2478(arg0, arg5, (byte) 69);
            this.method2481(0, arg1, null, arg2, 0, arg3, null, false, null);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;)V", line = 839)
    public static final void method2484(int arg0, String arg1) {
        if (class8.field84 == null) {
            class640.method3619(arg0 ^ 0x1051);
        }
        field5950++;
        class53.field850.setTime(new Date(class18.method109(arg0 - 37973)));
        int var2 = class53.field850.get(11);
        int var3 = class53.field850.get(12);
        if (arg0 != 26852) {
            field5936 = -11;
        }
        int var4 = class53.field850.get(13);
        String var5 = Integer.toString(var2 / 10) + var2 % 10 + ":" + var3 / 10 + var3 % 10 + ":" + var4 / 10 + var4 % 10;
        String[] var6 = class750.method4181((byte) -54, arg1, '\n');
        for (int var7 = 0; var7 < var6.length; var7++) {
            for (int var8 = class336.field4920; var8 > 0; var8--) {
                class8.field84[var8] = class8.field84[var8 - 1];
            }
            class8.field84[0] = var5 + ": " + var6[var7];
            if (class620.field8721 != null) {
                try {
                    class620.field8721.write(class4.method17(class8.field84[0] + "\n", 123));
                } catch (IOException var9) {
                }
            }
            if ((class8.field84.length - 1) > class336.field4920) {
                if (class92.field1373 > 0) {
                    class92.field1373++;
                }
                class336.field4920++;
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II[Lit;Ljava/util/Random;III[IILjava/lang/String;)I", line = 905)
    public final int method2485(int arg0, int arg1, class34[] arg2, Random arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, String arg9) {
        field5933++;
        if (arg9 == null) {
            return 0;
        }
        arg3.setSeed((long) arg0);
        int var11 = (arg3.nextInt() & 0x1F) + 192;
        this.method2478(var11 << 24 | arg6 & 0xFFFFFF, arg1 & 0xFFFFFF | var11 << 24, (byte) 69);
        int var12 = arg9.length();
        if (arg5 != 5) {
            field5936 = 66;
        }
        int[] var13 = new int[var12];
        int var14 = 0;
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg3.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        this.method2476(null, arg4, arg8, 20197, var13, arg7, arg2, arg9);
        return var14;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIILjava/lang/String;I)V", line = 945)
    public final void method2486(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, int arg6) {
        field5948++;
        if (arg5 == null) {
            return;
        }
        this.method2478(arg1, arg6, (byte) 69);
        int var8 = arg5.length();
        if (arg3 > -98) {
            this.method2474(null, -120, 100);
        }
        int[] var9 = new int[var8];
        for (int var10 = 0; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg0 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method2476(var9, arg4 - this.field5945.method510(arg5, 174) / 2, arg2, 20197, null, null, null, arg5);
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lha;Lpia;)V", line = 972)
    public class400(class544 arg0, class54 arg1) {
        this.field5945 = arg1;
        this.field5947 = arg0;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(CIIIZLaa;II)V")
    public abstract void method491(char arg0, int arg1, int arg2, int arg3, boolean arg4, class570 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!da", name = "fa", descriptor = "(CIIIZ)V")
    public abstract void method492(char arg0, int arg1, int arg2, int arg3, boolean arg4);
}
