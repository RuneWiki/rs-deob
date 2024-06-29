import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public abstract class class442 {

    @OriginalMember(owner = "client!da", name = "m", descriptor = "Lha;")
    private class473 field6091;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "Lhw;")
    private class300 field6079;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    public static int field6086 = 0;

    @OriginalMember(owner = "client!da", name = "u", descriptor = "[I")
    public static int[] field6099 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!da", name = "x", descriptor = "I")
    public static int field6102 = -1;

    @OriginalMember(owner = "client!da", name = "t", descriptor = "F")
    public static float field6098;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public static int field6080;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public static int field6081;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public static int field6082;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field6083;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public static int field6084;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public static int field6085;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "I")
    public static int field6087;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "I")
    public static int field6088;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "I")
    public static int field6089;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "I")
    public static int field6090;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "I")
    public static int field6093;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "I")
    public static int field6094;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "I")
    public static int field6095;

    @OriginalMember(owner = "client!da", name = "r", descriptor = "I")
    public static int field6096;

    @OriginalMember(owner = "client!da", name = "s", descriptor = "I")
    public static int field6097;

    @OriginalMember(owner = "client!da", name = "v", descriptor = "I")
    public static int field6100;

    @OriginalMember(owner = "client!da", name = "w", descriptor = "I")
    public static int field6101;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "[I")
    public static int[] field6092;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;III)V")
    public final void method2636(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5) {
        field6101++;
        if (arg2 != null) {
            this.method2641(arg5, arg1, arg4);
            this.method2642(null, arg2, arg3 - this.field6079.method1953(arg2, (byte) 59), arg0, -1490, null, 0, null, 0);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V")
    public static void method2637(byte arg0) {
        if (arg0 < 38) {
            method2652(29);
        }
        field6092 = null;
        field6099 = null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I[IILjava/lang/String;III[Lho;Ljava/util/Random;I)I")
    public final int method2638(int arg0, int[] arg1, int arg2, String arg3, int arg4, int arg5, int arg6, class318[] arg7, Random arg8, int arg9) {
        field6085++;
        if (arg3 == null) {
            return 0;
        }
        arg8.setSeed((long) arg5);
        int var11 = (arg8.nextInt() & 0x1F) + 192;
        this.method2641(arg9 & 0xFFFFFF | var11 << 24, arg6 & 0xFFFFFF | var11 << 24, 0);
        int var12 = arg3.length();
        int[] var13 = new int[var12];
        if (arg2 <= 37) {
            field6099 = null;
        }
        int var14 = 0;
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg8.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        this.method2649(arg7, null, false, var13, arg3, arg0, arg1, arg4);
        return var14;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([IIIII[Lho;Ljava/lang/String;B)V")
    public final void method2639(int[] arg0, int arg1, int arg2, int arg3, int arg4, class318[] arg5, String arg6, byte arg7) {
        field6088++;
        if (arg6 != null) {
            int var9 = -17 / ((25 - arg7) / 63);
            this.method2641(arg1, arg4, 0);
            this.method2642(arg5, arg6, arg2, arg3, -1490, null, 0, arg0, 0);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;IIIIII)V")
    public final void method2640(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field6081++;
        if (arg1 == null) {
            return;
        }
        this.method2641(arg5, arg4, 0);
        if (arg2 > -32) {
            field6092 = null;
        }
        double var9 = 7.0D - ((double) arg3 / 8.0D);
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg1.length();
        int[] var12 = new int[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (var9 * Math.sin((double) var13 / 1.5D + (double) arg7));
        }
        this.method2649(null, var12, false, null, arg1, arg0 - (this.field6079.method1953(arg1, (byte) 68) / 2), null, arg6);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(III)V")
    private final void method2641(int arg0, int arg1, int arg2) {
        class585.field8272 = arg2;
        class703.field9792 = arg1;
        class440.field6073 = arg1;
        class673.field9443 = -1;
        field6097++;
        class385.field5506 = -1;
        if (arg0 == -1) {
            arg0 = 0;
        }
        class330.field4626 = 0;
        class602.field8445 = arg0;
        class416.field5802 = arg0;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([Lho;Ljava/lang/String;IIILaa;I[II)V")
    private final void method2642(class318[] arg0, String arg1, int arg2, int arg3, int arg4, class87 arg5, int arg6, int[] arg7, int arg8) {
        field6089++;
        int var10 = arg3 - this.field6079.field4362;
        int var11 = -1;
        int var12 = -1;
        int var13 = arg1.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class253.method1695(arg1.charAt(var14), arg4 ^ 0x25F7) & 0xFF);
            if (var15 == '<') {
                var11 = var14;
            } else {
                if (var15 == '>' && var11 != -1) {
                    String var16 = arg1.substring(var11 + 1, var14);
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
                                    int var17 = class157.method1014(var16.substring(4), arg4 - 13044);
                                    class318 var18 = arg0[var17];
                                    int var19 = arg7 == null ? var18.method736() : arg7[var17];
                                    if ((class440.field6073 & 0xFF000000) == -16777216) {
                                        var18.method746(arg2, var10 + this.field6079.field4362 - var19, 1, 0, 1);
                                    } else {
                                        var18.method746(arg2, this.field6079.field4362 + var10 - var19, 0, class440.field6073 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    arg2 += arg0[var17].method749();
                                    var12 = -1;
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method2644(16, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg2 += this.field6079.method1962(var12, var15, 169);
                    }
                    if (var15 == ' ') {
                        if (class585.field8272 > 0) {
                            class330.field4626 += class585.field8272;
                            arg2 += class330.field4626 >> 8;
                            class330.field4626 &= 0xFF;
                        }
                    } else if (arg5 == null) {
                        if ((class416.field5802 & 0xFF000000) != 0) {
                            this.method1191(var15, arg2 + 1, var10 + 1, class416.field5802, true);
                        }
                        this.method1191(var15, arg2, var10, class440.field6073, false);
                    } else {
                        if ((class416.field5802 & 0xFF000000) != 0) {
                            this.method1190(var15, arg2 + 1, var10 + 1, class416.field5802, true, arg5, arg8, arg6);
                        }
                        this.method1190(var15, arg2, var10, class440.field6073, false, arg5, arg8, arg6);
                    }
                    int var20 = this.field6079.method1952(arg4 + 1490, var15);
                    if (class385.field5506 != -1) {
                        this.field6091.method2816(var20, (byte) -83, arg2, var10 + ((int) ((double) this.field6079.field4362 * 0.7D)), class385.field5506);
                    }
                    if (class673.field9443 != -1) {
                        this.field6091.method2816(var20, (byte) -83, arg2, this.field6079.field4362 + var10 + 1, class673.field9443);
                    }
                    arg2 += var20;
                    var12 = var15;
                }
            }
        }
        if (arg4 != -1490) {
            this.method2651(114, -81, 15, 88, -97, null, -7);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIII[Lho;Ljava/lang/String;IBLaa;III[I)I")
    public final int method2643(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class318[] arg7, String arg8, int arg9, byte arg10, class87 arg11, int arg12, int arg13, int arg14, int[] arg15) {
        if (arg10 == -33) {
            field6087++;
            return this.method2647((byte) 43, 0, arg4, arg11, arg8, arg7, arg1, arg2, arg0, arg14, arg15, arg12, arg5, arg9, arg6, arg13, arg3);
        } else {
            return -27;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;)V")
    private final void method2644(int arg0, String arg1) {
        try {
            if (arg0 != 16) {
                field6099 = null;
            }
            if (arg1.startsWith("col=")) {
                class440.field6073 = class440.field6073 & 0xFF000000 | class507.method2956(10913, arg1.substring(4), 16) & 0xFFFFFF;
            } else if (arg1.equals("/col")) {
                class440.field6073 = class703.field9792 & 0xFFFFFF | class440.field6073 & 0xFF000000;
            }
            if (arg1.startsWith("argb=")) {
                class440.field6073 = class507.method2956(10913, arg1.substring(5), 16);
            } else if (arg1.equals("/argb")) {
                class440.field6073 = class703.field9792;
            } else if (arg1.startsWith("str=")) {
                class385.field5506 = class440.field6073 & 0xFF000000 | class507.method2956(10913, arg1.substring(4), 16);
            } else if (arg1.equals("str")) {
                class385.field5506 = class440.field6073 & 0xFF000000 | 0x800000;
            } else if (arg1.equals("/str")) {
                class385.field5506 = -1;
            } else if (arg1.startsWith("u=")) {
                class673.field9443 = class440.field6073 & 0xFF000000 | class507.method2956(10913, arg1.substring(2), 16);
            } else if (arg1.equals("u")) {
                class673.field9443 = class440.field6073 & 0xFF000000;
            } else if (arg1.equals("/u")) {
                class673.field9443 = -1;
            } else if (arg1.equalsIgnoreCase("shad=-1")) {
                class416.field5802 = 0;
            } else if (arg1.startsWith("shad=")) {
                class416.field5802 = class440.field6073 & 0xFF000000 | class507.method2956(10913, arg1.substring(5), 16);
            } else if (arg1.equals("shad")) {
                class416.field5802 = class440.field6073 & 0xFF000000;
            } else if (arg1.equals("/shad")) {
                class416.field5802 = class602.field8445;
            } else if (arg1.equals("br")) {
                this.method2641(class602.field8445, class703.field9792, 0);
            }
        } catch (Exception var3) {
        }
        field6084++;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(IILjava/lang/String;III)V")
    public final void method2645(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5) {
        field6096++;
        if (arg2 != null) {
            this.method2641(arg3, arg1, arg4);
            this.method2642(null, arg2, arg5 - (this.field6079.method1953(arg2, (byte) -51) / 2), arg0, -1490, null, 0, null, arg4);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IBIIIILjava/lang/String;)V")
    public final void method2646(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, String arg6) {
        field6083++;
        if (arg6 == null) {
            return;
        }
        if (arg1 != 114) {
            this.field6079 = null;
        }
        this.method2641(arg3, arg2, arg1 ^ 0x72);
        int var8 = arg6.length();
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg5 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg5 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method2649(null, var10, false, var9, arg6, arg0 - (this.field6079.method1953(arg6, (byte) 95) / 2), null, arg4);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BIILaa;Ljava/lang/String;[Lho;IIII[IIIIIII)I")
    public final int method2647(byte arg0, int arg1, int arg2, class87 arg3, String arg4, class318[] arg5, int arg6, int arg7, int arg8, int arg9, int[] arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16) {
        field6090++;
        if (arg4 == null) {
            return 0;
        }
        this.method2641(arg11, arg13, arg0 - 43);
        if (arg15 == 0) {
            arg15 = this.field6079.field4362;
        }
        int[] var18;
        if (arg14 < (this.field6079.field4363 + this.field6079.field4355 + arg15) && arg15 + arg15 > arg14) {
            var18 = null;
        } else {
            var18 = new int[] { arg12 };
        }
        int var19 = this.field6079.method1955(arg5, class339.field4911, arg4, var18, false);
        if (arg1 == -1) {
            arg1 = arg14 / arg15;
            if (arg1 <= 0) {
                arg1 = 1;
            }
        }
        if (arg1 > 0 && arg1 <= var19) {
            var19 = arg1;
            class339.field4911[arg1 - 1] = this.field6079.method1959(arg5, 46, arg12, class339.field4911[arg1 - 1]);
        }
        if (arg7 == 3 && var19 == 1) {
            arg7 = 1;
        }
        if (arg0 != 43) {
            return -25;
        }
        int var20;
        if (arg7 == 0) {
            var20 = this.field6079.field4363 + arg8;
        } else if (arg7 == 1) {
            var20 = arg8 + ((arg14 - this.field6079.field4363 - ((var19 + -1) * arg15) - this.field6079.field4355) / 2) + this.field6079.field4363;
        } else if (arg7 == 2) {
            var20 = arg14 + arg8 - this.field6079.field4355 - ((var19 + -1) * arg15);
        } else {
            int var21 = (arg14 - this.field6079.field4363 - ((var19 + -1) * arg15) - this.field6079.field4355) / (var19 + 1);
            if (var21 < 0) {
                var21 = 0;
            }
            arg15 += var21;
            var20 = arg8 + this.field6079.field4363 + var21;
        }
        for (int var22 = 0; var22 < var19; var22++) {
            if (arg2 == 0) {
                this.method2642(arg5, class339.field4911[var22], arg16, var20, -1490, arg3, arg6, arg10, arg9);
            } else if (arg2 == 1) {
                this.method2642(arg5, class339.field4911[var22], (arg12 - this.field6079.method1953(class339.field4911[var22], (byte) -62)) / 2 + arg16, var20, -1490, arg3, arg6, arg10, arg9);
            } else if (arg2 == 2) {
                this.method2642(arg5, class339.field4911[var22], arg12 + (arg16 - this.field6079.method1953(class339.field4911[var22], (byte) -128)), var20, -1490, arg3, arg6, arg10, arg9);
            } else if (var19 - 1 == var22) {
                this.method2642(arg5, class339.field4911[var22], arg16, var20, -1490, arg3, arg6, arg10, arg9);
            } else {
                this.method2650(32, class339.field4911[var22], arg12);
                this.method2642(arg5, class339.field4911[var22], arg16, var20, -1490, arg3, arg6, arg10, arg9);
                class585.field8272 = 0;
            }
            var20 += arg15;
        }
        return var19;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIILjava/util/Random;III[ILjava/lang/String;I[II[Lho;I)I")
    public final int method2648(int arg0, int arg1, int arg2, int arg3, Random arg4, int arg5, int arg6, int arg7, int[] arg8, String arg9, int arg10, int[] arg11, int arg12, class318[] arg13, int arg14) {
        field6094++;
        if (arg9 == null) {
            return 0;
        }
        arg4.setSeed((long) arg10);
        int var16 = (arg4.nextInt() & 0x1F) + 192;
        this.method2641(arg1 & 0xFFFFFF | var16 << 24, arg6 & 0xFFFFFF | var16 << 24, 0);
        int var17 = arg9.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        if (arg5 != -2899) {
            field6086 = -95;
        }
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg4.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        int var21 = arg14;
        int var22 = this.field6079.field4363 + arg7;
        int var23 = -1;
        if (arg3 == 1) {
            var22 += (arg2 - this.field6079.field4355 - this.field6079.field4363) / 2;
        } else if (arg3 == 2) {
            var22 = arg2 + arg7 - this.field6079.field4355;
        }
        if (arg0 == 1) {
            var23 = var19 + this.field6079.method1953(arg9, (byte) -52);
            var21 = (arg12 - var23) / 2 + arg14;
        } else if (arg0 == 2) {
            var23 = this.field6079.method1953(arg9, (byte) -107) + var19;
            var21 = arg12 + arg14 - var23;
        }
        this.method2649(arg13, null, false, var18, arg9, var21, arg11, var22);
        if (arg8 != null) {
            if (var23 == -1) {
                var23 = this.field6079.method1953(arg9, (byte) 86) + var19;
            }
            arg8[0] = var21;
            arg8[1] = var22 - this.field6079.field4363;
            arg8[3] = this.field6079.field4363 + this.field6079.field4355;
            arg8[2] = var23;
        }
        return var19;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([Lho;[IZ[ILjava/lang/String;I[II)V")
    private final void method2649(class318[] arg0, int[] arg1, boolean arg2, int[] arg3, String arg4, int arg5, int[] arg6, int arg7) {
        field6080++;
        int var9 = arg7 - this.field6079.field4362;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg4.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class253.method1695(arg4.charAt(var14), -8231) & 0xFF);
            if (var15 == '<') {
                var10 = var14;
            } else {
                if (var15 == '>' && var10 != -1) {
                    String var16 = arg4.substring(var10 + 1, var14);
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
                                    if (arg3 == null) {
                                        var17 = 0;
                                    } else {
                                        var17 = arg3[var12];
                                    }
                                    int var18;
                                    if (arg1 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg1[var12];
                                    }
                                    var12++;
                                    int var19 = class157.method1014(var16.substring(4), -14534);
                                    class318 var20 = arg0[var19];
                                    int var21 = arg6 == null ? var20.method736() : arg6[var19];
                                    var20.method746(arg5 + var17, var9 - -var18 + this.field6079.field4362 + -var21, 1, 0, 1);
                                    var11 = -1;
                                    arg5 += arg0[var19].method749();
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method2644(16, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg5 += this.field6079.method1962(var11, var15, 169);
                    }
                    int var22;
                    if (arg3 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg3[var12];
                    }
                    int var23;
                    if (arg1 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg1[var12];
                    }
                    var12++;
                    if (var15 != ' ') {
                        if ((class416.field5802 & 0xFF000000) != 0) {
                            this.method1191(var15, arg5 + var22 + 1, var9 - (-1 - var23), class416.field5802, true);
                        }
                        this.method1191(var15, arg5 + var22, var9 + var23, class440.field6073, false);
                    } else if (class585.field8272 > 0) {
                        class330.field4626 += class585.field8272;
                        arg5 += class330.field4626 >> 8;
                        class330.field4626 &= 0xFF;
                    }
                    int var24 = this.field6079.method1952(0, var15);
                    if (class385.field5506 != -1) {
                        this.field6091.method2816(var24, (byte) -83, arg5, (int) ((double) this.field6079.field4362 * 0.7D) + var9, class385.field5506);
                    }
                    if (class673.field9443 != -1) {
                        this.field6091.method2816(var24, (byte) -83, arg5, this.field6079.field4362 + var9, class673.field9443);
                    }
                    var11 = var15;
                    arg5 += var24;
                }
            }
        }
        if (arg2) {
            this.method2645(65, 112, null, 56, -65, 127);
        }
    }

    @OriginalMember(owner = "client!da", name = "fa", descriptor = "(CIIIZ)V")
    public abstract void method1191(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;I)V")
    private final void method2650(int arg0, String arg1, int arg2) {
        field6100++;
        if (arg0 != 32) {
            this.field6079 = null;
        }
        int var4 = 0;
        boolean var5 = false;
        for (int var6 = 0; var6 < arg1.length(); var6++) {
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
            class585.field8272 = (arg2 - this.field6079.method1953(arg1, (byte) -75) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lha;Lhw;)V")
    public class442(class473 arg0, class300 arg1) {
        this.field6091 = arg0;
        this.field6079 = arg1;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIILjava/lang/String;I)V")
    public final void method2651(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, int arg6) {
        field6082++;
        if (arg5 == null) {
            return;
        }
        this.method2641(arg6, arg4, 0);
        int var8 = arg5.length();
        int[] var9 = new int[var8];
        if (arg2 != 26567) {
            this.method2653(78, -104, 9, 88, -7, null);
        }
        for (int var10 = 0; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg1 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method2649(null, var9, false, null, arg5, arg0 - (this.field6079.method1953(arg5, (byte) 58) / 2), null, arg3);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
    public static final void method2652(int arg0) {
        field6093++;
        class498 var1 = (class498) class362.field5218.method1140(-98);
        if (arg0 != -16777216) {
            field6102 = 72;
        }
        while (var1 != null) {
            if (var1.field6833 > 1) {
                var1.field6833 = 0;
                class577.field8108.method305(var1, ((class171) var1.field6826.field2266.field591).field2183, arg0 ^ 0xFF004790);
                var1.field6826.method1143(-97);
            }
            var1 = (class498) class362.field5218.method1138(arg0 + 16777332);
        }
        class640.field8992 = 0;
        class367.field5278 = 0;
        class646.field9038.method1046((byte) -28);
        class775.field10667.method3672(0);
        class362.field5218.method1143(arg0 ^ 0xFFFF92);
        class573.method3365(class447.field6257, 90);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIILjava/lang/String;)V")
    public final void method2653(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5) {
        field6095++;
        if (arg5 == null) {
            return;
        }
        this.method2641(arg3, arg2, 0);
        this.method2642(null, arg5, arg4, arg0, -1490, null, 0, null, 0);
        if (arg1 <= 75) {
            this.field6079 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(CIIIZLaa;II)V")
    public abstract void method1190(char arg0, int arg1, int arg2, int arg3, boolean arg4, class87 arg5, int arg6, int arg7);
}
