import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public abstract class class167 {

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "Lov;")
    private class278 field2163;

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "Lqa;")
    private class129 field2175;

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "[Ljava/lang/String;")
    public static String[] field2174 = new String[200];

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "[C")
    public static char[] field2178;

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "[Llk;")
    public static class311[] field2177;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public static int field2158;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
    public static int field2159;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
    public static int field2162;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    public static int field2165;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
    public static int field2169;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "I")
    public static int field2172;

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "Lii;")
    public static class389 field2161;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIILjava/lang/String;III)V")
    public final void method1102(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6) {
        field2157++;
        if (arg3 == null) {
            return;
        }
        this.method1115(arg2, (byte) -42, arg6);
        int var8 = arg3.length();
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        for (int var11 = arg5; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg1 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg1 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method1110(var10, var9, arg5 - 117, null, arg3, arg4, arg0 - (this.field2163.method1704((byte) 97, arg3) / 2), null);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([Lf;[IZIILjava/lang/String;II)V")
    public final void method1103(class404[] arg0, int[] arg1, boolean arg2, int arg3, int arg4, String arg5, int arg6, int arg7) {
        field2172++;
        if (arg2 && arg5 != null) {
            this.method1115(arg4, (byte) -42, arg6);
            this.method1114(arg0, arg1, -1, null, 0, 0, arg7, arg5, arg3);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(III[Lf;ILjava/lang/String;[IIILjava/util/Random;)I")
    public final int method1104(int arg0, int arg1, int arg2, class404[] arg3, int arg4, String arg5, int[] arg6, int arg7, int arg8, Random arg9) {
        field2167++;
        if (arg5 == null) {
            return 0;
        }
        arg9.setSeed((long) arg7);
        int var11 = (arg9.nextInt() & 0x1F) + 192;
        this.method1115(var11 << 24 | arg1 & 0xFFFFFF, (byte) -42, arg8 & 0xFFFFFF | var11 << 24);
        int var12 = arg5.length();
        int[] var13 = new int[var12];
        int var14 = 0;
        if (arg0 != 11625) {
            this.method1106(null, true, -87);
        }
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg9.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        this.method1110(null, var13, -103, arg3, arg5, arg4, arg2, arg6);
        return var14;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/lang/String;IIBII)V")
    public final void method1105(String arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        if (arg3 > -86) {
            return;
        }
        field2168++;
        if (arg0 != null) {
            this.method1115(arg5, (byte) -42, arg4);
            this.method1114(null, null, -1, null, 0, 0, arg2, arg0, arg1 - (this.field2163.method1704((byte) 95, arg0) / 2));
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
    private final void method1106(String arg0, boolean arg1, int arg2) {
        field2171++;
        int var4 = 0;
        boolean var5 = false;
        if (!arg1) {
            this.method1116(76, null, null, -64, null, -121, 26, 0, 8, -34, null, 56, 114, 96, 69, -37, -14);
        }
        for (int var6 = 0; arg0.length() > var6; var6++) {
            char var7 = arg0.charAt(var6);
            if (var7 == '<') {
                var5 = true;
            } else if (var7 == '>') {
                var5 = false;
            } else if (!var5 && var7 == ' ') {
                var4++;
            }
        }
        if (var4 > 0) {
            class527.field7788 = (arg2 - this.field2163.method1704((byte) 127, arg0) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZLjava/lang/String;)V")
    private final void method1107(boolean arg0, String arg1) {
        field2176++;
        try {
            if (arg1.startsWith("col=")) {
                class365.field4702 = class365.field4702 & 0xFF000000 | class202.method1325(arg1.substring(4), 16, (byte) -126) & 0xFFFFFF;
            } else if (arg1.equals("/col")) {
                class365.field4702 = class365.field4702 & 0xFF000000 | class297.field3855 & 0xFFFFFF;
            }
            if (arg1.startsWith("argb=")) {
                class365.field4702 = class202.method1325(arg1.substring(5), 16, (byte) -70);
            } else if (arg1.equals("/argb")) {
                class365.field4702 = class297.field3855;
            } else if (arg1.startsWith("str=")) {
                class5.field39 = class202.method1325(arg1.substring(4), 16, (byte) -72) | 0xFF000000;
            } else if (arg1.equals("str")) {
                class5.field39 = -8388608;
            } else if (arg1.equals("/str")) {
                class5.field39 = -1;
            } else if (arg1.startsWith("u=")) {
                class299.field3883 = class202.method1325(arg1.substring(2), 16, (byte) -79) | 0xFF000000;
            } else if (arg1.equals("u")) {
                class299.field3883 = -16777216;
            } else if (arg1.equals("/u")) {
                class299.field3883 = -1;
            } else if (arg1.equalsIgnoreCase("shad=-1")) {
                class75.field945 = 0;
            } else if (arg1.startsWith("shad=")) {
                class75.field945 = class202.method1325(arg1.substring(5), 16, (byte) -82) | 0xFF000000;
            } else if (arg1.equals("shad")) {
                class75.field945 = -16777216;
            } else if (arg1.equals("/shad")) {
                class75.field945 = class189.field2478;
            } else if (arg1.equals("br")) {
                this.method1115(class189.field2478, (byte) -42, class297.field3855);
            }
        } catch (Exception var3) {
        }
        if (arg0) {
            this.method1108(-103, 41, -21, 58, 56, -22, null, 102, 13, -21, null, null, (byte) -23, null, null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(CIIIZLea;II)V")
    public abstract void method385(char arg0, int arg1, int arg2, int arg3, boolean arg4, class113 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILjava/util/Random;III[Lf;[IBLjava/lang/String;[I)I")
    public final int method1108(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, Random arg6, int arg7, int arg8, int arg9, class404[] arg10, int[] arg11, byte arg12, String arg13, int[] arg14) {
        field2159++;
        if (arg13 == null) {
            return 0;
        }
        arg6.setSeed((long) arg9);
        int var16 = (arg6.nextInt() & 0x1F) + 192;
        this.method1115(arg3 & 0xFFFFFF | var16 << 24, (byte) -42, var16 << 24 | arg7 & 0xFFFFFF);
        if (arg12 <= 91) {
            this.field2163 = null;
        }
        int var17 = arg13.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg6.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        int var21 = arg5;
        int var22 = this.field2163.field3565 + arg1;
        int var23 = -1;
        if (arg8 == 1) {
            var22 += (arg2 - this.field2163.field3546 - this.field2163.field3565) / 2;
        } else if (arg8 == 2) {
            var22 = arg1 + arg2 - this.field2163.field3546;
        }
        if (arg0 == 1) {
            var23 = var19 + this.field2163.method1704((byte) 105, arg13);
            var21 = (arg4 - var23) / 2 + arg5;
        } else if (arg0 == 2) {
            var23 = this.field2163.method1704((byte) 123, arg13) + var19;
            var21 = arg4 + arg5 - var23;
        }
        this.method1110(null, var18, -106, arg10, arg13, var22, var21, arg14);
        if (arg11 != null) {
            if (var23 == -1) {
                var23 = this.field2163.method1704((byte) 105, arg13) + var19;
            }
            arg11[0] = var21;
            arg11[3] = this.field2163.field3565 + this.field2163.field3546;
            arg11[2] = var23;
            arg11[1] = var22 - this.field2163.field3565;
        }
        return var19;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(BILea;ILjava/lang/String;III[IIII[Lf;III)I")
    public final int method1109(byte arg0, int arg1, class113 arg2, int arg3, String arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9, int arg10, int arg11, class404[] arg12, int arg13, int arg14, int arg15) {
        int var17 = 90 % ((arg0 - 38) / 42);
        field2173++;
        return this.method1116(arg6, arg8, arg2, arg13, arg12, arg11, 0, arg14, arg10, arg3, arg4, arg7, 0, arg5, arg9, arg15, arg1);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([I[II[Lf;Ljava/lang/String;II[I)V")
    private final void method1110(int[] arg0, int[] arg1, int arg2, class404[] arg3, String arg4, int arg5, int arg6, int[] arg7) {
        int var9 = arg5 - this.field2163.field3566;
        field2162++;
        int var10 = -1;
        if (arg2 >= -100) {
            return;
        }
        int var11 = -1;
        int var12 = 0;
        int var13 = arg4.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class355.method2080(arg4.charAt(var14), -8219) & 0xFF);
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
                                    if (arg1 == null) {
                                        var17 = 0;
                                    } else {
                                        var17 = arg1[var12];
                                    }
                                    int var18;
                                    if (arg0 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg0[var12];
                                    }
                                    var12++;
                                    int var19 = class109.method716(var16.substring(4), 10);
                                    class404 var20 = arg3[var19];
                                    int var21 = arg7 == null ? var20.method369() : arg7[var19];
                                    var20.method353(arg6 + var17, -var21 + var9 - (-this.field2163.field3566 - var18), 1, 0, 1);
                                    var11 = -1;
                                    arg6 += arg3[var19].method370();
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method1107(false, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg6 += this.field2163.method1712(var15, true, var11);
                    }
                    int var22;
                    if (arg1 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg1[var12];
                    }
                    int var23;
                    if (arg0 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg0[var12];
                    }
                    if (var15 != ' ') {
                        if ((class75.field945 & 0xFF000000) != 0) {
                            this.method388(var15, var22 + arg6 + 1, var9 + 1 + var23, class75.field945, true);
                        }
                        this.method388(var15, arg6 + var22, var9 + var23, class365.field4702, false);
                    } else if (class527.field7788 > 0) {
                        class17.field279 += class527.field7788;
                        arg6 += class17.field279 >> 8;
                        class17.field279 &= 0xFF;
                    }
                    var12++;
                    int var24 = this.field2163.method1713(var15, true);
                    if (class5.field39 != -1) {
                        this.field2175.method920(1, arg6, var9 + ((int) ((double) this.field2163.field3566 * 0.7D)), class5.field39, var24);
                    }
                    if (class299.field3883 != -1) {
                        this.field2175.method920(1, arg6, this.field2163.field3566 + var9, class299.field3883, var24);
                    }
                    var11 = var15;
                    arg6 += var24;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/lang/String;BIIIIII)V")
    public final void method1111(String arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2165++;
        if (arg0 == null) {
            return;
        }
        this.method1115(arg3, (byte) -42, arg2);
        double var9 = 7.0D - (double) arg4 / 8.0D;
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg0.length();
        int[] var12 = new int[var11];
        if (arg1 != 115) {
            this.field2175 = null;
        }
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (var9 * Math.sin((double) var13 / 1.5D + (double) arg5));
        }
        this.method1110(var12, null, arg1 ^ 0xFFFFFFE4, null, arg0, arg6, arg7 - (this.field2163.method1704((byte) 82, arg0) / 2), null);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIZLjava/lang/String;)V")
    public final void method1112(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, String arg6) {
        field2179++;
        if (arg6 == null) {
            return;
        }
        this.method1115(arg4, (byte) -42, arg3);
        if (arg5) {
            return;
        }
        int var8 = arg6.length();
        int[] var9 = new int[var8];
        for (int var10 = 0; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg2 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method1110(var9, null, -118, null, arg6, arg1, arg0 - (this.field2163.method1704((byte) 80, arg6) / 2), null);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIILjava/lang/String;II)V")
    public final void method1113(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5) {
        field2166++;
        if (arg3 != null) {
            int var7 = 49 / ((arg0 + 32) / 44);
            this.method1115(arg5, (byte) -42, arg4);
            this.method1114(null, null, -1, null, 0, 0, arg2, arg3, arg1 - this.field2163.method1704((byte) 112, arg3));
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([Lf;[IILea;IIILjava/lang/String;I)V")
    private final void method1114(class404[] arg0, int[] arg1, int arg2, class113 arg3, int arg4, int arg5, int arg6, String arg7, int arg8) {
        int var10 = arg6 - this.field2163.field3566;
        field2158++;
        int var11 = arg2;
        int var12 = -1;
        int var13 = arg7.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class355.method2080(arg7.charAt(var14), -8219) & 0xFF);
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
                                    int var17 = class109.method716(var16.substring(4), 10);
                                    class404 var18 = arg0[var17];
                                    int var19 = arg1 == null ? var18.method369() : arg1[var17];
                                    if ((class365.field4702 & 0xFF000000) == -16777216) {
                                        var18.method353(arg8, var10 + this.field2163.field3566 - var19, 1, 0, 1);
                                    } else {
                                        var18.method353(arg8, var10 + this.field2163.field3566 - var19, 0, class365.field4702 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    var12 = -1;
                                    arg8 += arg0[var17].method370();
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method1107(false, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg8 += this.field2163.method1712(var15, true, var12);
                    }
                    if (var15 == ' ') {
                        if (class527.field7788 > 0) {
                            class17.field279 += class527.field7788;
                            arg8 += class17.field279 >> 8;
                            class17.field279 &= 0xFF;
                        }
                    } else if (arg3 == null) {
                        if ((class75.field945 & 0xFF000000) != 0) {
                            this.method388(var15, arg8 + 1, var10 - -1, class75.field945, true);
                        }
                        this.method388(var15, arg8, var10, class365.field4702, false);
                    } else {
                        if ((class75.field945 & 0xFF000000) != 0) {
                            this.method385(var15, arg8 + 1, var10 + 1, class75.field945, true, arg3, arg4, arg5);
                        }
                        this.method385(var15, arg8, var10, class365.field4702, false, arg3, arg4, arg5);
                    }
                    int var20 = this.field2163.method1713(var15, true);
                    if (class5.field39 != -1) {
                        this.field2175.method920(1, arg8, (int) ((double) this.field2163.field3566 * 0.7D) + var10, class5.field39, var20);
                    }
                    if (class299.field3883 != -1) {
                        this.field2175.method920(1, arg8, var10 + this.field2163.field3566 + 1, class299.field3883, var20);
                    }
                    arg8 += var20;
                    var12 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IBI)V")
    private final void method1115(int arg0, byte arg1, int arg2) {
        class17.field279 = 0;
        class297.field3855 = arg2;
        class365.field4702 = arg2;
        class527.field7788 = 0;
        field2170++;
        class5.field39 = -1;
        if (arg0 == -1) {
            arg0 = 0;
        }
        class299.field3883 = -1;
        class189.field2478 = arg0;
        class75.field945 = arg0;
        if (arg1 != -42) {
            this.method385('\u0003', -107, -112, 91, true, null, -115, 86);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[ILea;I[Lf;IIIIILjava/lang/String;IIIIII)I")
    public final int method1116(int arg0, int[] arg1, class113 arg2, int arg3, class404[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, String arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16) {
        field2164++;
        if (arg10 == null) {
            return 0;
        }
        this.method1115(arg0, (byte) -42, arg13);
        if (arg16 == 0) {
            arg16 = this.field2163.field3566;
        }
        int[] var18;
        if (this.field2163.field3546 + arg16 + this.field2163.field3565 > arg7 && (arg16 + arg16) > arg7) {
            var18 = null;
        } else {
            var18 = new int[] { arg5 };
        }
        if (arg6 == -1) {
            arg6 = arg7 / arg16;
            if (arg6 <= 0) {
                arg6 = 1;
            }
        }
        int var19 = this.field2163.method1710((byte) -41, var18, arg4, arg10, class302.field3916);
        if (arg6 > 0 && var19 >= arg6) {
            var19 = arg6;
            class302.field3916[arg6 - 1] = this.field2163.method1703((byte) -98, class302.field3916[arg6 - 1], arg5, arg4);
        }
        if (arg3 == 3 && var19 == 1) {
            arg3 = 1;
        }
        int var21;
        if (arg3 == 0) {
            var21 = arg11 + this.field2163.field3565;
        } else if (arg3 == 1) {
            var21 = (arg7 - this.field2163.field3565 - this.field2163.field3546 - ((var19 + -1) * arg16)) / 2 + arg11 + this.field2163.field3565;
        } else if (arg3 == 2) {
            var21 = arg11 - (this.field2163.field3546 - arg7) - ((var19 - 1) * arg16);
        } else {
            int var20 = (arg7 - this.field2163.field3565 - (this.field2163.field3546 - -((var19 + -1) * arg16))) / (var19 + 1);
            if (var20 < 0) {
                var20 = 0;
            }
            arg16 += var20;
            var21 = this.field2163.field3565 + arg11 + var20;
        }
        for (int var22 = arg12; var22 < var19; var22++) {
            if (arg9 == 0) {
                this.method1114(arg4, arg1, -1, arg2, arg15, arg14, var21, class302.field3916[var22], arg8);
            } else if (arg9 == 1) {
                this.method1114(arg4, arg1, -1, arg2, arg15, arg14, var21, class302.field3916[var22], arg8 + ((arg5 - this.field2163.method1704((byte) 79, class302.field3916[var22])) / 2));
            } else if (arg9 == 2) {
                this.method1114(arg4, arg1, -1, arg2, arg15, arg14, var21, class302.field3916[var22], arg5 + arg8 - this.field2163.method1704((byte) 96, class302.field3916[var22]));
            } else if (var19 - 1 == var22) {
                this.method1114(arg4, arg1, -1, arg2, arg15, arg14, var21, class302.field3916[var22], arg8);
            } else {
                this.method1106(class302.field3916[var22], true, arg5);
                this.method1114(arg4, arg1, -1, arg2, arg15, arg14, var21, class302.field3916[var22], arg8);
                class527.field7788 = 0;
            }
            var21 += arg16;
        }
        return var19;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
    public static void method1117(int arg0) {
        if (arg0 > -122) {
            method1117(117);
        }
        field2177 = null;
        field2174 = null;
        field2161 = null;
        field2178 = null;
    }

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "(CIIIZ)V")
    public abstract void method388(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIILjava/lang/String;)V")
    public final void method1118(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5) {
        field2169++;
        if (arg4 != -8634) {
            field2174 = null;
        }
        if (arg5 != null) {
            this.method1115(arg2, (byte) -42, arg3);
            this.method1114(null, null, arg4 + 8633, null, 0, 0, arg0, arg5, arg1);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V")
    public static final void method1119(boolean arg0) {
        if (arg0) {
            field2160++;
            class436 var1 = class459.method2712(15, 0, -1759243680);
            var1.method2567(16013);
        }
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lqa;Lov;)V")
    public class167(class129 arg0, class278 arg1) {
        this.field2163 = arg1;
        this.field2175 = arg0;
    }

    static {
        new class169("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
        field2178 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };
        field2177 = new class311[0];
    }
}
