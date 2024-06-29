import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public abstract class class489 {

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "Leu;")
    private class332 field7229;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "Lqa;")
    private class162 field7234;

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "Lrn;")
    public static class174 field7244 = new class174(29, 6);

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "[I")
    public static int[] field7249 = new int[25];

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public static int field7230;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
    public static int field7231;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
    public static int field7232;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public static int field7233;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
    public static int field7235;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    public static int field7236;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    public static int field7237;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
    public static int field7238;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
    public static int field7239;

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "I")
    public static int field7240;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
    public static int field7241;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "I")
    public static int field7242;

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "I")
    public static int field7243;

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "I")
    public static int field7245;

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "I")
    public static int field7246;

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "I")
    public static int field7247;

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "I")
    public static int field7248;

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "I")
    public static int field7250;

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "I")
    public static int field7251;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 5)
    private final void method2896(String arg0, byte arg1) {
        field7236++;
        try {
            if (arg0.startsWith("col=")) {
                class297.field4233 = class297.field4233 & 0xFF000000 | class453.method2709(16, arg0.substring(4), (byte) 114) & 0xFFFFFF;
            } else if (arg0.equals("/col")) {
                class297.field4233 = class297.field4233 & 0xFF000000 | class221.field3175 & 0xFFFFFF;
            }
            if (arg0.startsWith("argb=")) {
                class297.field4233 = class453.method2709(16, arg0.substring(5), (byte) -97);
            } else if (arg0.equals("/argb")) {
                class297.field4233 = class221.field3175;
            } else if (arg0.startsWith("str=")) {
                class257.field3733 = class453.method2709(16, arg0.substring(4), (byte) -69) | 0xFF000000;
            } else if (arg0.equals("str")) {
                class257.field3733 = -8388608;
            } else if (arg0.equals("/str")) {
                class257.field3733 = -1;
            } else if (arg0.startsWith("u=")) {
                class416.field6207 = class453.method2709(16, arg0.substring(2), (byte) -67) | 0xFF000000;
            } else if (arg0.equals("u")) {
                class416.field6207 = -16777216;
            } else if (arg0.equals("/u")) {
                class416.field6207 = -1;
            } else if (arg0.equalsIgnoreCase("shad=-1")) {
                class333.field5034 = 0;
            } else if (arg0.startsWith("shad=")) {
                class333.field5034 = class453.method2709(16, arg0.substring(5), (byte) -82) | 0xFF000000;
            } else if (arg0.equals("shad")) {
                class333.field5034 = -16777216;
            } else if (arg0.equals("/shad")) {
                class333.field5034 = class71.field1242;
            } else if (arg0.equals("br")) {
                this.method2901(-16777216, class221.field3175, class71.field1242);
            }
            if (arg1 <= 122) {
                this.method2912(null, null, 39, null, (byte) -119, -51, null, null);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIII[IILjava/util/Random;Ljava/lang/String;[Lf;II[III)I", line = 82)
    public final int method2897(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, Random arg7, String arg8, class529[] arg9, int arg10, int arg11, int[] arg12, int arg13, int arg14) {
        field7248++;
        if (arg8 == null) {
            return 0;
        }
        arg7.setSeed((long) arg1);
        int var16 = -124 % ((44 - arg3) / 53);
        int var17 = (arg7.nextInt() & 0x1F) + 192;
        this.method2901(-16777216, arg11 & 0xFFFFFF | var17 << 24, arg0 & 0xFFFFFF | var17 << 24);
        int var18 = arg8.length();
        int[] var19 = new int[var18];
        int var20 = 0;
        for (int var21 = 0; var21 < var18; var21++) {
            var19[var21] = var20;
            if ((arg7.nextInt() & 0x3) == 0) {
                var20++;
            }
        }
        int var22 = arg2;
        int var23 = this.field7229.field5028 + arg14;
        int var24 = -1;
        if (arg10 == 1) {
            var23 += (arg6 - this.field7229.field5018 - this.field7229.field5028) / 2;
        } else if (arg10 == 2) {
            var23 = arg6 + arg14 - this.field7229.field5018;
        }
        if (arg13 == 1) {
            var24 = var20 + this.field7229.method2136(arg8, 13216);
            var22 = (arg4 - var24) / 2 + arg2;
        } else if (arg13 == 2) {
            var24 = var20 + this.field7229.method2136(arg8, 13216);
            var22 = arg4 + arg2 - var24;
        }
        this.method2912(arg8, arg9, var22, var19, (byte) -119, var23, null, arg12);
        if (arg5 != null) {
            if (var24 == -1) {
                var24 = var20 + this.field7229.method2136(arg8, 13216);
            }
            arg5[0] = var22;
            arg5[3] = this.field7229.field5028 + this.field7229.field5018;
            arg5[2] = var24;
            arg5[1] = var23 - this.field7229.field5028;
        }
        return var20;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILjava/lang/String;IIIII)V", line = 157)
    public final void method2898(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field7247++;
        if (arg1 == null) {
            return;
        }
        this.method2901(arg0 ^ 0xFF000000, arg4, arg6);
        int var8 = arg1.length();
        int[] var9 = new int[var8];
        for (int var10 = arg0; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg2 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method2912(arg1, null, arg5 - (this.field7229.method2136(arg1, 13216) / 2), null, (byte) -119, arg3, var9, null);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIILjava/lang/String;)V", line = 187)
    public final void method2899(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, String arg7) {
        field7243++;
        if (arg7 == null) {
            return;
        }
        this.method2901(-16777216, arg4, arg3);
        double var9 = 7.0D - (double) arg6 / 8.0D;
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg7.length();
        int[] var12 = new int[var11];
        for (int var13 = arg1; var13 < var11; var13++) {
            var12[var13] = (int) (var9 * Math.sin((double) var13 / 1.5D + (double) arg2));
        }
        this.method2912(arg7, null, arg5 - (this.field7229.method2136(arg7, arg1 + 13216) / 2), null, (byte) -119, arg0, var12, null);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/lang/String;IIIII)V", line = 222)
    public final void method2900(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = -40 % ((4 - arg2) / 33);
        field7237++;
        if (arg0 != null) {
            this.method2901(-16777216, arg1, arg3);
            this.method2905(null, 0, 89, 0, arg5 - this.field7229.method2136(arg0, 13216) / 2, arg4, arg0, null, null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(III)V", line = 236)
    private final void method2901(int arg0, int arg1, int arg2) {
        field7230++;
        class369.field5596 = 0;
        class257.field3733 = -1;
        class221.field3175 = arg1;
        class297.field4233 = arg1;
        class55.field965 = 0;
        class416.field6207 = -1;
        if (arg2 == -1) {
            arg2 = 0;
        }
        class71.field1242 = arg2;
        class333.field5034 = arg2;
        if (arg0 != -16777216) {
            method2910((byte) 89);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(BILjava/lang/String;)V", line = 256)
    private final void method2902(byte arg0, int arg1, String arg2) {
        field7231++;
        int var4 = 0;
        boolean var5 = false;
        if (arg0 != -87) {
            field7251 = -104;
        }
        for (int var6 = 0; var6 < arg2.length(); var6++) {
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
            class55.field965 = (arg1 - this.field7229.method2136(arg2, 13216) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V", line = 298)
    public static final void method2903(int arg0) {
        field7245++;
        int var1 = class92.field1573.method1079(-18);
        int var2 = class92.field1573.method1063((byte) -69);
        boolean var3 = class92.field1573.method1120((byte) -81) == 1;
        class412.field6157 = class92.field1573.method1120((byte) -64);
        int var4 = class92.field1573.method1116(128);
        class66.method555(var2, (byte) -89);
        class92.field1573.method2701(19466);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var20 = 0; var20 < (class33.field662 >> 3); var20++) {
                for (int var21 = 0; var21 < class121.field1966 >> 3; var21++) {
                    int var22 = class92.field1573.method2700((byte) 87, 1);
                    if (var22 == 1) {
                        class86.field1503[var5][var20][var21] = class92.field1573.method2700((byte) 87, 26);
                    } else {
                        class86.field1503[var5][var20][var21] = -1;
                    }
                }
            }
        }
        class92.field1573.method2702(10492);
        int var6 = (class34.field666 - class92.field1573.field2289) / 16;
        class451.field6746 = new int[var6][4];
        for (int var7 = 0; var7 < var6; var7++) {
            for (int var19 = 0; var19 < 4; var19++) {
                class451.field6746[var7][var19] = class92.field1573.method1070(-32387);
            }
        }
        class322.field4920 = new byte[var6][];
        class87.field1520 = new byte[var6][];
        class295.field4195 = new byte[var6][];
        class343.field5170 = new byte[var6][];
        class325.field4945 = null;
        class464.field6941 = null;
        class339.field5128 = new int[var6];
        class438.field6549 = new int[var6];
        class148.field2364 = new int[var6];
        class381.field5776 = new int[var6];
        if (arg0 != 26) {
            field7249 = null;
        }
        class373.field5657 = new int[var6];
        int var8 = 0;
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < (class33.field662 >> 3); var10++) {
                for (int var11 = 0; var11 < (class121.field1966 >> 3); var11++) {
                    int var12 = class86.field1503[var9][var10][var11];
                    if (var12 != -1) {
                        int var13 = var12 >> 14 & 0x3FF;
                        int var14 = (var12 & 0x3FF9) >> 3;
                        int var15 = (var13 / 8 << 8) + var14 / 8;
                        for (int var16 = 0; var16 < var8; var16++) {
                            if (class381.field5776[var16] == var15) {
                                var15 = -1;
                                break;
                            }
                        }
                        if (var15 != -1) {
                            class381.field5776[var8] = var15;
                            int var17 = (var15 & 0xFFC1) >> 8;
                            int var18 = var15 & 0xFF;
                            class148.field2364[var8] = class5.field122.method136("m" + var17 + "_" + var18, 124);
                            class438.field6549[var8] = class5.field122.method136("l" + var17 + "_" + var18, -67);
                            class373.field5657[var8] = class5.field122.method136("um" + var17 + "_" + var18, class125.method953(arg0, 92));
                            class339.field5128[var8] = class5.field122.method136("ul" + var17 + "_" + var18, -92);
                            var8++;
                        }
                    }
                }
            }
        }
        class364.method2282(false, var1, var3, var4, arg0 + 7144);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIILjava/lang/String;III)V", line = 446)
    public final void method2904(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6) {
        field7246++;
        if (arg3 == null) {
            return;
        }
        this.method2901(-16777216, arg0, arg1);
        int var8 = arg3.length();
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        for (int var11 = arg6; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg5 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg5 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method2912(arg3, null, arg4 - (this.field7229.method2136(arg3, 13216) / 2), var9, (byte) -119, arg2, var10, null);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lea;IIIIILjava/lang/String;[Lf;[I)V", line = 474)
    private final void method2905(class381 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6, class529[] arg7, int[] arg8) {
        field7233++;
        int var10 = arg5 - this.field7229.field5026;
        if (arg2 < 14) {
            return;
        }
        int var11 = -1;
        int var12 = -1;
        int var13 = arg6.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class429.method2572(-10707, arg6.charAt(var14)) & 0xFF);
            if (var15 == '<') {
                var11 = var14;
            } else {
                if (var15 == '>' && var11 != -1) {
                    String var16 = arg6.substring(var11 + 1, var14);
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
                                    int var17 = class463.method2758(-77, var16.substring(4));
                                    class529 var18 = arg7[var17];
                                    int var19 = arg8 == null ? var18.method104() : arg8[var17];
                                    if ((class297.field4233 & 0xFF000000) == -16777216) {
                                        var18.method102(arg4, var10 + this.field7229.field5026 - var19, 1, 0, 1);
                                    } else {
                                        var18.method102(arg4, var10 + this.field7229.field5026 - var19, 0, class297.field4233 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    arg4 += arg7[var17].method100();
                                    var12 = -1;
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method2896(var16, (byte) 123);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg4 += this.field7229.method2127(var15, 123, var12);
                    }
                    if (var15 == ' ') {
                        if (class55.field965 > 0) {
                            class369.field5596 += class55.field965;
                            arg4 += class369.field5596 >> 8;
                            class369.field5596 &= 0xFF;
                        }
                    } else if (arg0 == null) {
                        if ((class333.field5034 & 0xFF000000) != 0) {
                            this.method1277(var15, arg4 + 1, var10 - -1, class333.field5034, true);
                        }
                        this.method1277(var15, arg4, var10, class297.field4233, false);
                    } else {
                        if ((class333.field5034 & 0xFF000000) != 0) {
                            this.method1278(var15, arg4 + 1, var10 + 1, class333.field5034, true, arg0, arg1, arg3);
                        }
                        this.method1278(var15, arg4, var10, class297.field4233, false, arg0, arg1, arg3);
                    }
                    int var20 = this.field7229.method2131(-124, var15);
                    if (class257.field3733 != -1) {
                        this.field7234.method1202(arg4, class257.field3733, 1, var10 + ((int) ((double) this.field7229.field5026 * 0.7D)), var20);
                    }
                    if (class416.field6207 != -1) {
                        this.field7234.method1202(arg4, class416.field6207, 1, var10 + this.field7229.field5026 + 1, var20);
                    }
                    arg4 += var20;
                    var12 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIILjava/lang/String;)V", line = 630)
    public final void method2906(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5) {
        field7242++;
        if (arg0 != 13162) {
            this.method2902((byte) -78, -12, null);
        }
        if (arg5 != null) {
            this.method2901(-16777216, arg3, arg1);
            this.method2905(null, 0, 84, 0, arg2 - this.field7229.method2136(arg5, 13216), arg4, arg5, null, null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V", line = 648)
    public static void method2907(int arg0) {
        field7249 = null;
        field7244 = null;
        if (arg0 > -42) {
            method2903(-61);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(III[IILea;IILjava/lang/String;IIIII[Lf;I)I", line = 659)
    public final int method2908(int arg0, int arg1, int arg2, int[] arg3, int arg4, class381 arg5, int arg6, int arg7, String arg8, int arg9, int arg10, int arg11, int arg12, int arg13, class529[] arg14, int arg15) {
        field7250++;
        if (arg4 != -16777216) {
            this.field7234 = null;
        }
        return this.method2911(arg1, arg15, arg9, arg13, arg12, arg7, arg8, arg2, arg5, arg10, 0, arg3, arg6, arg0, arg11, 127, arg14);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([ILjava/util/Random;ILjava/lang/String;IIIZ[Lf;I)I", line = 673)
    public final int method2909(int[] arg0, Random arg1, int arg2, String arg3, int arg4, int arg5, int arg6, boolean arg7, class529[] arg8, int arg9) {
        field7240++;
        if (arg3 == null) {
            return 0;
        }
        arg1.setSeed((long) arg2);
        int var11 = (arg1.nextInt() & 0x1F) + 192;
        this.method2901(-16777216, arg5 & 0xFFFFFF | var11 << 24, var11 << 24 | arg6 & 0xFFFFFF);
        int var12 = arg3.length();
        int[] var13 = new int[var12];
        int var14 = 0;
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg1.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        if (!arg7) {
            field7244 = null;
        }
        this.method2912(arg3, arg8, arg4, var13, (byte) -119, arg9, null, arg0);
        return var14;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V", line = 712)
    public static final void method2910(byte arg0) {
        class254[] var1 = class241.field3477;
        synchronized (class241.field3477) {
            if (arg0 >= -48) {
                return;
            }
            int var2 = 0;
            while (true) {
                if (class241.field3477.length <= var2) {
                    break;
                }
                class241.field3477[var2] = new class254();
                class427.field6351[var2] = 0;
                var2++;
            }
        }
        field7232++;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILjava/lang/String;ILea;II[IIIII[Lf;)I", line = 735)
    public final int method2911(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6, int arg7, class381 arg8, int arg9, int arg10, int[] arg11, int arg12, int arg13, int arg14, int arg15, class529[] arg16) {
        field7239++;
        if (arg6 == null) {
            return 0;
        }
        this.method2901(-16777216, arg2, arg5);
        if (arg0 == 0) {
            arg0 = this.field7229.field5026;
        }
        int[] var18;
        if ((this.field7229.field5018 + arg0 + this.field7229.field5028) > arg14 && (arg0 + arg0) > arg14) {
            var18 = null;
        } else {
            var18 = new int[] { arg12 };
        }
        if (arg10 == -1) {
            arg10 = arg14 / arg0;
            if (arg10 <= 0) {
                arg10 = 1;
            }
        }
        int var19 = this.field7229.method2134(class148.field2369, arg16, arg6, 0, var18);
        if (arg10 > 0 && var19 >= arg10) {
            class148.field2369[arg10 - 1] = this.field7229.method2130(class148.field2369[arg10 - 1], arg12, (byte) -40, arg16);
            var19 = arg10;
        }
        if (arg13 == 3 && var19 == 1) {
            arg13 = 1;
        }
        if (arg15 < 125) {
            return 98;
        }
        int var20;
        if (arg13 == 0) {
            var20 = this.field7229.field5028 + arg1;
        } else if (arg13 == 1) {
            var20 = (arg14 - this.field7229.field5018 - ((var19 - 1) * arg0) - this.field7229.field5028) / 2 + arg1 + this.field7229.field5028;
        } else if (arg13 == 2) {
            var20 = arg1 + arg14 - ((var19 - 1) * arg0) - this.field7229.field5018;
        } else {
            int var21 = (arg14 - this.field7229.field5028 - ((var19 - 1) * arg0) - this.field7229.field5018) / (var19 + 1);
            if (var21 < 0) {
                var21 = 0;
            }
            var20 = arg1 + this.field7229.field5028 + var21;
            arg0 += var21;
        }
        for (int var22 = 0; var22 < var19; var22++) {
            if (arg9 == 0) {
                this.method2905(arg8, arg7, 54, arg4, arg3, var20, class148.field2369[var22], arg16, arg11);
            } else if (arg9 == 1) {
                this.method2905(arg8, arg7, 80, arg4, (arg12 - this.field7229.method2136(class148.field2369[var22], 13216)) / 2 + arg3, var20, class148.field2369[var22], arg16, arg11);
            } else if (arg9 == 2) {
                this.method2905(arg8, arg7, 18, arg4, arg3 + arg12 - this.field7229.method2136(class148.field2369[var22], 13216), var20, class148.field2369[var22], arg16, arg11);
            } else if (var19 - 1 == var22) {
                this.method2905(arg8, arg7, 29, arg4, arg3, var20, class148.field2369[var22], arg16, arg11);
            } else {
                this.method2902((byte) -87, arg12, class148.field2369[var22]);
                this.method2905(arg8, arg7, 35, arg4, arg3, var20, class148.field2369[var22], arg16, arg11);
                class55.field965 = 0;
            }
            var20 += arg0;
        }
        return var19;
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lqa;Leu;)V", line = 835)
    public class489(class162 arg0, class332 arg1) {
        this.field7229 = arg1;
        this.field7234 = arg0;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/lang/String;[Lf;I[IBI[I[I)V", line = 845)
    private final void method2912(String arg0, class529[] arg1, int arg2, int[] arg3, byte arg4, int arg5, int[] arg6, int[] arg7) {
        field7235++;
        int var9 = arg5 - this.field7229.field5026;
        int var10 = -1;
        if (arg4 != -119) {
            return;
        }
        int var11 = -1;
        int var12 = 0;
        int var13 = arg0.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class429.method2572(-10707, arg0.charAt(var14)) & 0xFF);
            if (var15 == '<') {
                var10 = var14;
            } else {
                if (var15 == '>' && var10 != -1) {
                    String var16 = arg0.substring(var10 + 1, var14);
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
                                    if (arg6 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg6[var12];
                                    }
                                    var12++;
                                    int var19 = class463.method2758(arg4 + 14, var16.substring(4));
                                    class529 var20 = arg1[var19];
                                    int var21 = arg7 == null ? var20.method104() : arg7[var19];
                                    var20.method102(arg2 + var17, -var21 + var9 - -this.field7229.field5026 + var18, 1, 0, 1);
                                    var11 = -1;
                                    arg2 += arg1[var19].method100();
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method2896(var16, (byte) 124);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg2 += this.field7229.method2127(var15, 6, var11);
                    }
                    int var22;
                    if (arg3 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg3[var12];
                    }
                    int var23;
                    if (arg6 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg6[var12];
                    }
                    var12++;
                    if (var15 != ' ') {
                        if ((class333.field5034 & 0xFF000000) != 0) {
                            this.method1277(var15, arg2 + var22 + 1, var9 + var23 + 1, class333.field5034, true);
                        }
                        this.method1277(var15, arg2 + var22, var9 + var23, class297.field4233, false);
                    } else if (class55.field965 > 0) {
                        class369.field5596 += class55.field965;
                        arg2 += class369.field5596 >> 8;
                        class369.field5596 &= 0xFF;
                    }
                    int var24 = this.field7229.method2131(arg4 ^ 0xFFFFFFF1, var15);
                    if (class257.field3733 != -1) {
                        this.field7234.method1202(arg2, class257.field3733, 1, (int) ((double) this.field7229.field5026 * 0.7D) + var9, var24);
                    }
                    if (class416.field6207 != -1) {
                        this.field7234.method1202(arg2, class416.field6207, 1, var9 + this.field7229.field5026, var24);
                    }
                    arg2 += var24;
                    var11 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILjava/lang/String;IIII)V", line = 1011)
    public final void method2913(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 >= -37) {
            this.field7229 = null;
        }
        field7238++;
        if (arg1 != null) {
            this.method2901(-16777216, arg3, arg0);
            this.method2905(null, 0, 60, 0, arg4, arg5, arg1, null, null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(BI[Lf;I[ILjava/lang/String;II)V", line = 1027)
    public final void method2914(byte arg0, int arg1, class529[] arg2, int arg3, int[] arg4, String arg5, int arg6, int arg7) {
        if (arg0 > -3) {
            this.method2904(-9, -19, -16, null, -13, 79, -47);
        }
        field7241++;
        if (arg5 != null) {
            this.method2901(-16777216, arg3, arg7);
            this.method2905(null, 0, 76, 0, arg1, arg6, arg5, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "(CIIIZ)V")
    public abstract void method1277(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(CIIIZLea;II)V")
    public abstract void method1278(char arg0, int arg1, int arg2, int arg3, boolean arg4, class381 arg5, int arg6, int arg7);
}
