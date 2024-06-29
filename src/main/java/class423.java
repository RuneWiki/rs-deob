import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public abstract class class423 {

    @OriginalMember(owner = "client!da", name = "f", descriptor = "Ltba;")
    private class56 field6007;

    @OriginalMember(owner = "client!da", name = "u", descriptor = "Lha;")
    private class454 field6022;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "I")
    public static int field6018 = 0;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "Z")
    public static boolean field6011 = false;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "I")
    public static int field6015 = -1;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "Lmq;")
    public static class78 field6012 = new class78(8, -2);

    @OriginalMember(owner = "client!da", name = "g", descriptor = "F")
    public static float field6008;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field6002;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public static int field6003;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public static int field6004;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public static int field6005;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field6006;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    public static int field6009;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "I")
    public static int field6010;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "I")
    public static int field6013;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "I")
    public static int field6014;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "I")
    public static int field6016;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "I")
    public static int field6017;

    @OriginalMember(owner = "client!da", name = "r", descriptor = "I")
    public static int field6019;

    @OriginalMember(owner = "client!da", name = "s", descriptor = "I")
    public static int field6020;

    @OriginalMember(owner = "client!da", name = "t", descriptor = "I")
    public static int field6021;

    @OriginalMember(owner = "client!da", name = "v", descriptor = "I")
    public static int field6023;

    @OriginalMember(owner = "client!da", name = "w", descriptor = "I")
    public static int field6024;

    @OriginalMember(owner = "client!da", name = "x", descriptor = "I")
    public static int field6025;

    @OriginalMember(owner = "client!da", name = "y", descriptor = "I")
    public static int field6026;

    @OriginalMember(owner = "client!da", name = "z", descriptor = "I")
    public static int field6027;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([Lac;Ljava/util/Random;Ljava/lang/String;IBIII[II)I")
    public final int method2504(class712[] arg0, Random arg1, String arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9) {
        field6005++;
        if (arg2 == null) {
            return 0;
        }
        arg1.setSeed((long) arg9);
        int var11 = (arg1.nextInt() & 0x1F) + 192;
        this.method2506(var11 << 24 | arg7 & 0xFFFFFF, arg3 & 0xFFFFFF | var11 << 24, (byte) -5);
        int var12 = arg2.length();
        int[] var13 = new int[var12];
        int var14 = 0;
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg1.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        this.method2507(arg6, arg5, arg8, -25512, null, arg0, var13, arg2);
        int var16 = 44 % ((-arg4 - 42) / 43);
        return var14;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;III)V")
    public final void method2505(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5) {
        if (arg5 != 255) {
            this.method2523(87, -58, 85, 27, null, 67, -101, null, null, -44, null, -10, -83, -92, 72, 113);
        }
        field6002++;
        if (arg2 != null) {
            this.method2506(arg0, arg1, (byte) -5);
            this.method2515(null, null, 0, 0, arg4, arg3, 0, arg2, null);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIB)V")
    private final void method2506(int arg0, int arg1, byte arg2) {
        class477.field6819 = arg0;
        class240.field3099 = arg0;
        class218.field2775 = -1;
        class560.field7827 = 0;
        field6017++;
        class738.field10336 = 0;
        class240.field3098 = -1;
        if (arg1 == -1) {
            arg1 = 0;
        }
        if (arg2 == -5) {
            class323.field4127 = arg1;
            class709.field9975 = arg1;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II[II[I[Lac;[ILjava/lang/String;)V")
    private final void method2507(int arg0, int arg1, int[] arg2, int arg3, int[] arg4, class712[] arg5, int[] arg6, String arg7) {
        field6026++;
        int var9 = arg1 - this.field6007.field813;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg7.length();
        int var14 = 0;
        if (arg3 != -25512) {
            field6011 = true;
        }
        while (var14 < var13) {
            char var15 = (char) (class278.method1665(arg7.charAt(var14), (byte) 59) & 0xFF);
            if (var15 == '<') {
                var10 = var14;
            } else {
                label114: {
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
                                        if (arg6 == null) {
                                            var17 = 0;
                                        } else {
                                            var17 = arg6[var12];
                                        }
                                        int var18;
                                        if (arg4 == null) {
                                            var18 = 0;
                                        } else {
                                            var18 = arg4[var12];
                                        }
                                        var12++;
                                        int var19 = class337.method1980(-27187, var16.substring(4));
                                        class712 var20 = arg5[var19];
                                        int var21 = arg2 == null ? var20.method1882() : arg2[var19];
                                        var20.method690(arg0 + var17, -var21 + var18 + this.field6007.field813 + var9, 1, 0, 1);
                                        var11 = -1;
                                        arg0 += arg5[var19].method1892();
                                    } catch (Exception var25) {
                                    }
                                } else {
                                    this.method2514(var16, arg3 ^ 0x63CC);
                                }
                                break label114;
                            }
                            var15 = '®';
                        }
                    }
                    if (var10 == -1) {
                        if (var11 != -1) {
                            arg0 += this.field6007.method448(var15, var11, arg3 ^ 0x70F9);
                        }
                        int var22;
                        if (arg6 == null) {
                            var22 = 0;
                        } else {
                            var22 = arg6[var12];
                        }
                        int var23;
                        if (arg4 == null) {
                            var23 = 0;
                        } else {
                            var23 = arg4[var12];
                        }
                        var12++;
                        if (var15 != ' ') {
                            if ((class709.field9975 & 0xFF000000) != 0) {
                                this.method564(var15, arg0 + var22 + 1, var9 + 1 + var23, class709.field9975, true);
                            }
                            this.method564(var15, arg0 + var22, var9 + var23, class240.field3099, false);
                        } else if (class560.field7827 > 0) {
                            class738.field10336 += class560.field7827;
                            arg0 += class738.field10336 >> 8;
                            class738.field10336 &= 0xFF;
                        }
                        int var24 = this.field6007.method451(62, var15);
                        if (class218.field2775 != -1) {
                            this.field6022.method2660(var24, 88, (int) ((double) this.field6007.field813 * 0.7D) + var9, class218.field2775, arg0);
                        }
                        if (class240.field3098 != -1) {
                            this.field6022.method2660(var24, 127, this.field6007.field813 + var9, class240.field3098, arg0);
                        }
                        var11 = var15;
                        arg0 += var24;
                    }
                }
            }
            var14++;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
    public static void method2508(int arg0) {
        field6012 = null;
        if (arg0 != -24228) {
            field6015 = -61;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IZIILjava/lang/String;II)V")
    public final void method2509(int arg0, boolean arg1, int arg2, int arg3, String arg4, int arg5, int arg6) {
        field6023++;
        if (arg4 == null) {
            return;
        }
        this.method2506(arg5, arg6, (byte) -5);
        int var8 = arg4.length();
        int[] var9 = new int[var8];
        if (arg1) {
            this.method2521(-31, 88, -92, null, 67, 101, -56);
        }
        for (int var10 = 0; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg2 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method2507(arg0 - (this.field6007.method453(-1, arg4) / 2), arg3, null, -25512, var9, null, null, arg4);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIILjava/lang/String;I)V")
    public final void method2510(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5) {
        field6021++;
        if (arg4 == null) {
            return;
        }
        this.method2506(arg2, arg1, (byte) -5);
        this.method2515(null, null, 0, 0, arg0, arg5 - this.field6007.method453(-1, arg4) / 2, 0, arg4, null);
        if (arg3 != 16777215) {
            field6015 = -95;
        }
    }

    @OriginalMember(owner = "client!da", name = "fa", descriptor = "(CIIIZ)V")
    public abstract void method564(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIILjava/lang/String;I)V")
    public final void method2511(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6, int arg7) {
        field6010++;
        if (arg6 == null) {
            return;
        }
        this.method2506(arg1, arg4, (byte) -5);
        double var9 = 7.0D - (double) arg2 / 8.0D;
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        if (arg3 >= -65) {
            return;
        }
        int var11 = arg6.length();
        int[] var12 = new int[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (Math.sin((double) var13 / 1.5D + (double) arg7) * var9);
        }
        this.method2507(arg0 - this.field6007.method453(-1, arg6) / 2, arg5, null, -25512, var12, null, null, arg6);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(CIIIZLaa;II)V")
    public abstract void method565(char arg0, int arg1, int arg2, int arg3, boolean arg4, class81 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([Lac;IILjava/lang/String;III[I)V")
    public final void method2512(class712[] arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6, int[] arg7) {
        field6019++;
        if (arg6 <= 106) {
            this.method2506(55, 51, (byte) -113);
        }
        if (arg3 != null) {
            this.method2506(arg2, arg1, (byte) -5);
            this.method2515(arg0, arg7, 0, 0, arg4, arg5, 0, arg3, null);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILqca;)Z")
    public static final boolean method2513(int arg0, class351 arg1) {
        field6020++;
        if (arg1 == null) {
            return false;
        } else if (arg1.field4619) {
            if (arg0 != 16777215) {
                field6027 = -119;
            }
            if (!arg1.method2065(true, class341.field4409)) {
                return false;
            } else if (class441.field6194.method3248((long) arg1.field4625, arg0 - 16777215) == null) {
                return class489.field6951.method3248((long) arg1.field4608, 0) == null;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;I)V")
    private final void method2514(String arg0, int arg1) {
        try {
            if (arg0.startsWith("col=")) {
                class240.field3099 = class240.field3099 & 0xFF000000 | class560.method3164(arg0.substring(4), 16, false) & 0xFFFFFF;
            } else if (arg0.equals("/col")) {
                class240.field3099 = class477.field6819 & 0xFFFFFF | class240.field3099 & 0xFF000000;
            }
            if (arg1 >= -49) {
                field6008 = -1.0515356F;
            }
            if (arg0.startsWith("argb=")) {
                class240.field3099 = class560.method3164(arg0.substring(5), 16, false);
            } else if (arg0.equals("/argb")) {
                class240.field3099 = class477.field6819;
            } else if (arg0.startsWith("str=")) {
                class218.field2775 = class240.field3099 & 0xFF000000 | class560.method3164(arg0.substring(4), 16, false);
            } else if (arg0.equals("str")) {
                class218.field2775 = class240.field3099 & 0xFF000000 | 0x800000;
            } else if (arg0.equals("/str")) {
                class218.field2775 = -1;
            } else if (arg0.startsWith("u=")) {
                class240.field3098 = class240.field3099 & 0xFF000000 | class560.method3164(arg0.substring(2), 16, false);
            } else if (arg0.equals("u")) {
                class240.field3098 = class240.field3099 & 0xFF000000;
            } else if (arg0.equals("/u")) {
                class240.field3098 = -1;
            } else if (arg0.equalsIgnoreCase("shad=-1")) {
                class709.field9975 = 0;
            } else if (arg0.startsWith("shad=")) {
                class709.field9975 = class240.field3099 & 0xFF000000 | class560.method3164(arg0.substring(5), 16, false);
            } else if (arg0.equals("shad")) {
                class709.field9975 = class240.field3099 & 0xFF000000;
            } else if (arg0.equals("/shad")) {
                class709.field9975 = class323.field4127;
            } else if (arg0.equals("br")) {
                this.method2506(class477.field6819, class323.field4127, (byte) -5);
            }
        } catch (Exception var3) {
        }
        field6014++;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([Lac;[IIIIIILjava/lang/String;Laa;)V")
    private final void method2515(class712[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, String arg7, class81 arg8) {
        field6006++;
        int var10 = arg4 - this.field6007.field813;
        int var11 = -1;
        int var12 = -1;
        int var13 = arg7.length();
        for (int var14 = arg6; var14 < var13; var14++) {
            char var15 = (char) (class278.method1665(arg7.charAt(var14), (byte) 59) & 0xFF);
            if (var15 == '<') {
                var11 = var14;
            } else {
                if (var15 == '>' && var11 != -1) {
                    String var16 = arg7.substring(var11 + 1, var14);
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
                                    int var17 = class337.method1980(-27187, var16.substring(4));
                                    class712 var18 = arg0[var17];
                                    int var19 = arg1 == null ? var18.method1882() : arg1[var17];
                                    if ((class240.field3099 & 0xFF000000) == -16777216) {
                                        var18.method690(arg5, this.field6007.field813 + var10 - var19, 1, 0, 1);
                                    } else {
                                        var18.method690(arg5, var10 + this.field6007.field813 - var19, 0, class240.field3099 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    arg5 += arg0[var17].method1892();
                                    var12 = -1;
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method2514(var16, -92);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg5 += this.field6007.method448(var15, var12, arg6 - 4959);
                    }
                    if (var15 == ' ') {
                        if (class560.field7827 > 0) {
                            class738.field10336 += class560.field7827;
                            arg5 += class738.field10336 >> 8;
                            class738.field10336 &= 0xFF;
                        }
                    } else if (arg8 == null) {
                        if ((class709.field9975 & 0xFF000000) != 0) {
                            this.method564(var15, arg5 + 1, var10 + 1, class709.field9975, true);
                        }
                        this.method564(var15, arg5, var10, class240.field3099, false);
                    } else {
                        if ((class709.field9975 & 0xFF000000) != 0) {
                            this.method565(var15, arg5 + 1, var10 + 1, class709.field9975, true, arg8, arg2, arg3);
                        }
                        this.method565(var15, arg5, var10, class240.field3099, false, arg8, arg2, arg3);
                    }
                    int var20 = this.field6007.method451(62, var15);
                    if (class218.field2775 != -1) {
                        this.field6022.method2660(var20, 13, (int) ((double) this.field6007.field813 * 0.7D) + var10, class218.field2775, arg5);
                    }
                    if (class240.field3098 != -1) {
                        this.field6022.method2660(var20, arg6 + 74, var10 - -this.field6007.field813 + 1, class240.field3098, arg5);
                    }
                    var12 = var15;
                    arg5 += var20;
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;[IIIII[Lac;II[IIIILjava/util/Random;)I")
    public final int method2516(int arg0, String arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, class712[] arg7, int arg8, int arg9, int[] arg10, int arg11, int arg12, int arg13, Random arg14) {
        field6013++;
        if (arg1 == null) {
            return 0;
        }
        arg14.setSeed((long) arg3);
        int var16 = (arg14.nextInt() & 0x1F) + 192;
        if (arg9 > -62) {
            this.method2523(72, 24, 103, 60, null, -67, -21, null, null, -33, null, -105, -70, 112, -96, -43);
        }
        this.method2506(arg11 & 0xFFFFFF | var16 << 24, arg6 & 0xFFFFFF | var16 << 24, (byte) -5);
        int var17 = arg1.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg14.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        int var21 = arg4;
        int var22 = this.field6007.field800 + arg12;
        if (arg0 == 1) {
            var22 += (arg5 - this.field6007.field800 - this.field6007.field808) / 2;
        } else if (arg0 == 2) {
            var22 = arg5 + arg12 - this.field6007.field808;
        }
        int var23 = -1;
        if (arg8 == 1) {
            var23 = var19 + this.field6007.method453(-1, arg1);
            var21 = (arg13 - var23) / 2 + arg4;
        } else if (arg8 == 2) {
            var23 = this.field6007.method453(-1, arg1) + var19;
            var21 = arg13 + arg4 - var23;
        }
        this.method2507(var21, var22, arg10, -25512, null, arg7, var18, arg1);
        if (arg2 != null) {
            if (var23 == -1) {
                var23 = this.field6007.method453(-1, arg1) + var19;
            }
            arg2[1] = var22 - this.field6007.field800;
            arg2[0] = var21;
            arg2[3] = this.field6007.field808 + this.field6007.field800;
            arg2[2] = var23;
        }
        return var19;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method2517(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field6025++;
        class63 var10 = null;
        class63 var11 = (class63) class73.field955.method3111(86);
        if (arg1 != 192) {
            field6011 = true;
        }
        while (var11 != null) {
            if (var11.field857 == arg9 && var11.field856 == arg0 && var11.field848 == arg5 && var11.field846 == arg7) {
                var10 = var11;
                break;
            }
            var11 = (class63) class73.field955.method3116(arg1 - 235);
        }
        if (var10 == null) {
            var10 = new class63();
            var10.field856 = arg0;
            var10.field848 = arg5;
            var10.field857 = arg9;
            var10.field846 = arg7;
            if (arg0 >= 0 && arg5 >= 0 && class613.field8591 > arg0 && class1.field3 > arg5) {
                class62.method479(-125, var10);
            }
            class73.field955.method3110(var10, 1);
        }
        var10.field855 = arg4;
        var10.field854 = arg3;
        var10.field849 = arg2;
        var10.field847 = arg8;
        var10.field845 = arg6;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIII[Lac;IIII[IIILaa;IILjava/lang/String;)I")
    public final int method2518(int arg0, int arg1, int arg2, int arg3, int arg4, class712[] arg5, int arg6, int arg7, int arg8, int arg9, int[] arg10, int arg11, int arg12, class81 arg13, int arg14, int arg15, String arg16) {
        field6009++;
        if (arg16 == null) {
            return 0;
        }
        this.method2506(arg2, arg8, (byte) -5);
        if (arg15 <= 88) {
            this.method2504(null, null, null, -121, (byte) -78, 77, 112, -26, null, -16);
        }
        if (arg9 == 0) {
            arg9 = this.field6007.field813;
        }
        int[] var18;
        if ((this.field6007.field800 + this.field6007.field808 + arg9) > arg14 && arg9 + arg9 > arg14) {
            var18 = null;
        } else {
            var18 = new int[] { arg7 };
        }
        if (arg6 == -1) {
            arg6 = arg14 / arg9;
            if (arg6 <= 0) {
                arg6 = 1;
            }
        }
        int var19 = this.field6007.method454((byte) -106, arg5, var18, class333.field4291, arg16);
        if (arg6 > 0 && var19 >= arg6) {
            var19 = arg6;
            class333.field4291[arg6 - 1] = this.field6007.method446(class333.field4291[arg6 - 1], arg5, arg7, (byte) -98);
        }
        if (arg1 == 3 && var19 == 1) {
            arg1 = 1;
        }
        int var20;
        if (arg1 == 0) {
            var20 = arg4 + this.field6007.field800;
        } else if (arg1 == 1) {
            var20 = arg4 + ((arg14 - this.field6007.field808 - this.field6007.field800 - ((var19 + -1) * arg9)) / 2) + this.field6007.field800;
        } else if (arg1 == 2) {
            var20 = arg4 + arg14 - this.field6007.field808 - ((var19 + -1) * arg9);
        } else {
            int var21 = (arg14 - this.field6007.field808 - this.field6007.field800 - (var19 + -1) * arg9) / (var19 + 1);
            if (var21 < 0) {
                var21 = 0;
            }
            arg9 += var21;
            var20 = this.field6007.field800 + var21 + arg4;
        }
        for (int var22 = 0; var22 < var19; var22++) {
            if (arg12 == 0) {
                this.method2515(arg5, arg10, arg3, arg0, var20, arg11, 0, class333.field4291[var22], arg13);
            } else if (arg12 == 1) {
                this.method2515(arg5, arg10, arg3, arg0, var20, (arg7 - this.field6007.method453(-1, class333.field4291[var22])) / 2 + arg11, 0, class333.field4291[var22], arg13);
            } else if (arg12 == 2) {
                this.method2515(arg5, arg10, arg3, arg0, var20, arg7 + arg11 - this.field6007.method453(-1, class333.field4291[var22]), 0, class333.field4291[var22], arg13);
            } else if ((var19 - 1) == var22) {
                this.method2515(arg5, arg10, arg3, arg0, var20, arg11, 0, class333.field4291[var22], arg13);
            } else {
                this.method2520((byte) 96, arg7, class333.field4291[var22]);
                this.method2515(arg5, arg10, arg3, arg0, var20, arg11, 0, class333.field4291[var22], arg13);
                class560.field7827 = 0;
            }
            var20 += arg9;
        }
        return var19;
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lha;Ltba;)V")
    public class423(class454 arg0, class56 arg1) {
        this.field6007 = arg1;
        this.field6022 = arg0;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZZ)Z")
    public static boolean method2519(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BILjava/lang/String;)V")
    private final void method2520(byte arg0, int arg1, String arg2) {
        if (arg0 < 51) {
            this.method564('k', 39, 24, -70, false);
        }
        field6024++;
        int var4 = 0;
        boolean var5 = false;
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
            class560.field7827 = (arg1 - this.field6007.method453(-1, arg2) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIILjava/lang/String;III)V")
    public final void method2521(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6) {
        field6004++;
        if (arg3 == null) {
            return;
        }
        this.method2506(arg6, arg1, (byte) -5);
        int var8 = arg3.length();
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg0 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg0 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        if (arg2 != 15104) {
            this.method2511(112, 93, 67, -82, 84, 55, null, 66);
        }
        this.method2507(arg5 - (this.field6007.method453(arg2 - 15105, arg3) / 2), arg4, null, -25512, var10, null, var9, arg3);
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(IILjava/lang/String;III)V")
    public final void method2522(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5) {
        field6003++;
        if (arg2 == null) {
            return;
        }
        if (arg0 > -126) {
            this.method2518(18, 96, -44, 31, -82, null, -118, 73, 6, 34, null, -86, -94, null, 10, 18, null);
        }
        this.method2506(arg5, arg3, (byte) -5);
        this.method2515(null, null, 0, 0, arg4, arg1 - this.field6007.method453(-1, arg2), 0, arg2, null);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIILaa;IILjava/lang/String;[II[Lac;IIIII)I")
    public final int method2523(int arg0, int arg1, int arg2, int arg3, class81 arg4, int arg5, int arg6, String arg7, int[] arg8, int arg9, class712[] arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        field6016++;
        if (arg12 != 17517) {
            field6011 = true;
        }
        return this.method2518(arg15, arg9, arg6, arg14, arg11, arg10, 0, arg1, arg3, arg2, arg8, arg0, arg13, arg4, arg5, arg12 ^ 0x4416, arg7);
    }
}
