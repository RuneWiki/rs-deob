import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public abstract class class413 {

    @OriginalMember(owner = "client!la", name = "k", descriptor = "Lho;")
    private class463 field5543;

    @OriginalMember(owner = "client!la", name = "t", descriptor = "Lr;")
    private class564 field5552;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "Lcq;")
    public static class110 field5537 = new class110(68, 5);

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field5533;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public static int field5534;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public static int field5535;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    public static int field5536;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "I")
    public static int field5538;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    public static int field5539;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "I")
    public static int field5540;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "I")
    public static int field5541;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "I")
    public static int field5542;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "I")
    public static int field5544;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "I")
    public static int field5545;

    @OriginalMember(owner = "client!la", name = "n", descriptor = "I")
    public static int field5546;

    @OriginalMember(owner = "client!la", name = "o", descriptor = "I")
    public static int field5547;

    @OriginalMember(owner = "client!la", name = "p", descriptor = "I")
    public static int field5548;

    @OriginalMember(owner = "client!la", name = "q", descriptor = "I")
    public static int field5549;

    @OriginalMember(owner = "client!la", name = "r", descriptor = "I")
    public static int field5550;

    @OriginalMember(owner = "client!la", name = "s", descriptor = "I")
    public static int field5551;

    @OriginalMember(owner = "client!la", name = "u", descriptor = "I")
    public static int field5553;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V", line = 4)
    public static final void method2310(byte arg0) {
        class385.field5192.method88(94);
        if (arg0 != -3) {
            field5537 = null;
        }
        field5548++;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I[Lf;B[ILjava/lang/String;III)V", line = 15)
    public final void method2311(int arg0, class534[] arg1, byte arg2, int[] arg3, String arg4, int arg5, int arg6, int arg7) {
        field5539++;
        if (arg4 != null) {
            this.method2327(arg5, arg0, arg2 ^ 0xFFFFFFA6);
            if (arg2 == 30) {
                this.method2321(arg4, 0, null, arg7, arg6, arg3, 1, 0, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IILjava/lang/String;IIB)V", line = 34)
    public final void method2312(int arg0, int arg1, String arg2, int arg3, int arg4, byte arg5) {
        if (arg5 < 6) {
            field5537 = null;
        }
        field5547++;
        if (arg2 != null) {
            this.method2327(arg0, arg3, -92);
            this.method2321(arg2, 0, null, arg1 - this.field5543.method2657((byte) 62, arg2), arg4, null, 1, 0, null);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([ILua;IIIIIIIIIIILjava/lang/String;I[Lf;)I", line = 51)
    public final int method2313(int[] arg0, class598 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, String arg13, int arg14, class534[] arg15) {
        int var17 = 16 / ((-arg3 - 2) / 49);
        field5550++;
        return this.method2319(arg6, arg2, arg1, arg9, arg5, arg15, arg7, arg8, arg13, arg10, arg12, arg11, 0, arg14, 17443, arg0, arg4);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([IILjava/lang/String;BIIII[IILjava/util/Random;II[Lf;I)I", line = 62)
    public final int method2314(int[] arg0, int arg1, String arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9, Random arg10, int arg11, int arg12, class534[] arg13, int arg14) {
        field5542++;
        if (arg2 == null) {
            return 0;
        }
        arg10.setSeed((long) arg11);
        int var16 = (arg10.nextInt() & 0x1F) + 192;
        this.method2327(arg4 & 0xFFFFFF | var16 << 24, var16 << 24 | arg1 & 0xFFFFFF, -110);
        int var17 = arg2.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg10.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        int var21 = arg12;
        int var22 = arg6 + this.field5543.field6601;
        int var23 = -1;
        if (arg5 == 1) {
            var22 += (arg7 - this.field5543.field6601 - this.field5543.field6596) / 2;
        } else if (arg5 == 2) {
            var22 = arg7 + arg6 - this.field5543.field6596;
        }
        if (arg9 == 1) {
            var23 = this.field5543.method2657((byte) 62, arg2) + var19;
            var21 = (arg14 - var23) / 2 + arg12;
        } else if (arg9 == 2) {
            var23 = this.field5543.method2657((byte) 62, arg2) + var19;
            var21 = arg14 + arg12 - var23;
        }
        this.method2323(var18, var22, null, var21, arg2, arg0, true, arg13);
        if (arg8 != null) {
            if (var23 == -1) {
                var23 = this.field5543.method2657((byte) 62, arg2) + var19;
            }
            arg8[3] = this.field5543.field6601 + this.field5543.field6596;
            arg8[2] = var23;
            arg8[0] = var21;
            arg8[1] = var22 - this.field5543.field6601;
        }
        if (arg3 != -14) {
            this.method2314(null, -25, null, (byte) 56, -119, 54, 64, -11, null, -52, null, 70, -88, null, -69);
        }
        return var19;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BILjava/lang/String;Z)Z", line = 143)
    public static final boolean method2315(byte arg0, int arg1, String arg2, boolean arg3) {
        field5553++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg2.length();
        int var8 = 0;
        if (arg0 != -104) {
            field5537 = null;
        }
        while (var8 < var7) {
            label78: {
                char var9 = arg2.charAt(var8);
                if (var8 == 0) {
                    if (var9 == '-') {
                        var4 = true;
                        break label78;
                    }
                    if (var9 == '+' && arg3) {
                        break label78;
                    }
                }
                int var11;
                if (var9 >= '0' && var9 <= '9') {
                    var11 = var9 - '0';
                } else if (var9 >= 'A' && var9 <= 'Z') {
                    var11 = var9 - '7';
                } else if (var9 >= 'a' && var9 <= 'z') {
                    var11 = var9 - 'W';
                } else {
                    return false;
                }
                if (arg1 <= var11) {
                    return false;
                }
                if (var4) {
                    var11 = -var11;
                }
                int var10 = arg1 * var6 + var11;
                if ((var10 / arg1) != var6) {
                    return false;
                }
                var6 = var10;
                var5 = true;
            }
            var8++;
        }
        return var5;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;IIIBII)V", line = 223)
    public final void method2316(String arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field5538++;
        if (arg0 == null) {
            return;
        }
        int var8 = -84 % ((arg4 + 55) / 53);
        this.method2327(arg5, arg3, -125);
        int var9 = arg0.length();
        int[] var10 = new int[var9];
        int[] var11 = new int[var9];
        for (int var12 = 0; var12 < var9; var12++) {
            var10[var12] = (int) (Math.sin((double) arg6 / 5.0D + (double) var12 / 5.0D) * 5.0D);
            var11[var12] = (int) (Math.sin((double) arg6 / 5.0D + (double) var12 / 3.0D) * 5.0D);
        }
        this.method2323(var10, arg1, var11, arg2 - (this.field5543.method2657((byte) 62, arg0) / 2), arg0, null, true, null);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIIIILjava/lang/String;)V", line = 256)
    public final void method2317(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, String arg7) {
        field5534++;
        if (arg7 == null) {
            return;
        }
        this.method2327(arg2, arg4, -69);
        double var9 = 7.0D - ((double) arg3 / 8.0D);
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg7.length();
        int[] var12 = new int[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (var9 * Math.sin((double) var13 / 1.5D + (double) arg5));
        }
        this.method2323(null, arg6, var12, arg1 - (this.field5543.method2657((byte) 62, arg7) / arg0), arg7, null, true, null);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;IIIII)V", line = 285)
    public final void method2318(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5533++;
        if (arg0 != null) {
            this.method2327(arg4, arg1, -124);
            this.method2321(arg0, arg3, null, arg2, arg5, null, 1, 0, null);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IILua;II[Lf;IILjava/lang/String;IIIIII[II)I", line = 299)
    public final int method2319(int arg0, int arg1, class598 arg2, int arg3, int arg4, class534[] arg5, int arg6, int arg7, String arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int[] arg15, int arg16) {
        field5551++;
        if (arg8 == null) {
            return 0;
        }
        this.method2327(arg11, arg4, -93);
        if (arg9 == 0) {
            arg9 = this.field5543.field6602;
        }
        int[] var18;
        if (this.field5543.field6601 + arg9 + this.field5543.field6596 > arg7 && arg7 < arg9 + arg9) {
            var18 = null;
        } else {
            var18 = new int[] { arg0 };
        }
        int var19 = this.field5543.method2659(arg5, var18, arg8, (byte) -111, class300.field3741);
        if (arg12 == -1) {
            arg12 = arg7 / arg9;
            if (arg12 <= 0) {
                arg12 = 1;
            }
        }
        if (arg12 > 0 && var19 >= arg12) {
            class300.field3741[arg12 - 1] = this.field5543.method2654(arg0, (byte) 31, arg5, class300.field3741[arg12 - 1]);
            var19 = arg12;
        }
        if (arg3 == 3 && var19 == 1) {
            arg3 = 1;
        }
        int var21;
        if (arg3 == 0) {
            var21 = arg6 + this.field5543.field6601;
        } else if (arg3 == 1) {
            var21 = (arg7 - this.field5543.field6601 - ((var19 - 1) * arg9 + this.field5543.field6596)) / 2 + arg6 + this.field5543.field6601;
        } else if (arg3 == 2) {
            var21 = arg6 + arg7 - ((var19 - 1) * arg9) - this.field5543.field6596;
        } else {
            int var20 = (arg7 - this.field5543.field6601 - (this.field5543.field6596 - -((var19 - 1) * arg9))) / (var19 + 1);
            if (var20 < 0) {
                var20 = 0;
            }
            var21 = arg6 + var20 + this.field5543.field6601;
            arg9 += var20;
        }
        if (arg14 != 17443) {
            this.field5552 = null;
        }
        for (int var22 = 0; var22 < var19; var22++) {
            if (arg16 == 0) {
                this.method2321(class300.field3741[var22], arg13, arg2, arg10, var21, arg15, 1, arg1, arg5);
            } else if (arg16 == 1) {
                this.method2321(class300.field3741[var22], arg13, arg2, (arg0 - this.field5543.method2657((byte) 62, class300.field3741[var22])) / 2 + arg10, var21, arg15, 1, arg1, arg5);
            } else if (arg16 == 2) {
                this.method2321(class300.field3741[var22], arg13, arg2, arg0 + arg10 - this.field5543.method2657((byte) 62, class300.field3741[var22]), var21, arg15, arg14 ^ 0x4422, arg1, arg5);
            } else if (var19 - 1 == var22) {
                this.method2321(class300.field3741[var22], arg13, arg2, arg10, var21, arg15, 1, arg1, arg5);
            } else {
                this.method2320(class300.field3741[var22], (byte) 120, arg0);
                this.method2321(class300.field3741[var22], arg13, arg2, arg10, var21, arg15, arg14 - 17442, arg1, arg5);
                class215.field2605 = 0;
            }
            var21 += arg9;
        }
        return var19;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;BI)V", line = 401)
    private final void method2320(String arg0, byte arg1, int arg2) {
        field5541++;
        int var4 = 0;
        int var5 = 45 / ((52 - arg1) / 57);
        boolean var6 = false;
        for (int var7 = 0; arg0.length() > var7; var7++) {
            char var8 = arg0.charAt(var7);
            if (var8 == '<') {
                var6 = true;
            } else if (var8 == '>') {
                var6 = false;
            } else if (!var6 && var8 == ' ') {
                var4++;
            }
        }
        if (var4 > 0) {
            class215.field2605 = (arg2 - this.field5543.method2657((byte) 62, arg0) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;ILua;II[III[Lf;)V", line = 444)
    private final void method2321(String arg0, int arg1, class598 arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, class534[] arg8) {
        field5540++;
        int var10 = arg4 - this.field5543.field6602;
        int var11 = -1;
        if (arg6 != 1) {
            this.method2324(null, 116, -7, null, (byte) 102, 8, -43, null, 72, null);
        }
        int var12 = -1;
        int var13 = arg0.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class180.method1097(-2740, arg0.charAt(var14)) & 0xFF);
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
                                    int var17 = class274.method1607(var16.substring(4), 1);
                                    class534 var18 = arg8[var17];
                                    int var19 = arg5 == null ? var18.method304() : arg5[var17];
                                    if ((class428.field6086 & 0xFF000000) == -16777216) {
                                        var18.method314(arg3, var10 + this.field5543.field6602 - var19, 1, 0, 1);
                                    } else {
                                        var18.method314(arg3, this.field5543.field6602 + var10 - var19, 0, class428.field6086 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    var12 = -1;
                                    arg3 += arg8[var17].method312();
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method2322(var16, (byte) 55);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg3 += this.field5543.method2663(true, var12, var15);
                    }
                    if (var15 == ' ') {
                        if (class215.field2605 > 0) {
                            class212.field2569 += class215.field2605;
                            arg3 += class212.field2569 >> 8;
                            class212.field2569 &= 0xFF;
                        }
                    } else if (arg2 == null) {
                        if ((class152.field1678 & 0xFF000000) != 0) {
                            this.method300(var15, arg3 + 1, var10 + 1, class152.field1678, true);
                        }
                        this.method300(var15, arg3, var10, class428.field6086, false);
                    } else {
                        if ((class152.field1678 & 0xFF000000) != 0) {
                            this.method299(var15, arg3 + 1, var10 - -1, class152.field1678, true, arg2, arg1, arg7);
                        }
                        this.method299(var15, arg3, var10, class428.field6086, false, arg2, arg1, arg7);
                    }
                    int var20 = this.field5543.method2662((byte) -37, var15);
                    if (class580.field8211 != -1) {
                        this.field5552.method3207(arg3, (int) ((double) this.field5543.field6602 * 0.7D) + var10, var20, class580.field8211, false);
                    }
                    if (class190.field2182 != -1) {
                        this.field5552.method3207(arg3, this.field5543.field6602 + var10 + 1, var20, class190.field2182, false);
                    }
                    arg3 += var20;
                    var12 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 599)
    private final void method2322(String arg0, byte arg1) {
        field5535++;
        try {
            if (arg0.startsWith("col=")) {
                class428.field6086 = class428.field6086 & 0xFF000000 | class360.method2115(16, arg0.substring(4), 116) & 0xFFFFFF;
            } else if (arg0.equals("/col")) {
                class428.field6086 = class473.field6813 & 0xFFFFFF | class428.field6086 & 0xFF000000;
            }
            if (arg0.startsWith("argb=")) {
                class428.field6086 = class360.method2115(16, arg0.substring(5), 117);
            } else if (arg0.equals("/argb")) {
                class428.field6086 = class473.field6813;
            } else if (arg0.startsWith("str=")) {
                class580.field8211 = class428.field6086 & 0xFF000000 | class360.method2115(16, arg0.substring(4), 16);
            } else if (arg0.equals("str")) {
                class580.field8211 = class428.field6086 & 0xFF000000 | 0x800000;
            } else if (arg0.equals("/str")) {
                class580.field8211 = -1;
            } else if (arg0.startsWith("u=")) {
                class190.field2182 = class428.field6086 & 0xFF000000 | class360.method2115(16, arg0.substring(2), 56);
            } else if (arg0.equals("u")) {
                class190.field2182 = class428.field6086 & 0xFF000000;
            } else if (arg0.equals("/u")) {
                class190.field2182 = -1;
            } else if (arg0.equalsIgnoreCase("shad=-1")) {
                class152.field1678 = 0;
            } else if (arg0.startsWith("shad=")) {
                class152.field1678 = class428.field6086 & 0xFF000000 | class360.method2115(16, arg0.substring(5), 12);
            } else if (arg0.equals("shad")) {
                class152.field1678 = class428.field6086 & 0xFF000000;
            } else if (arg0.equals("/shad")) {
                class152.field1678 = class428.field6085;
            } else if (arg0.equals("br")) {
                this.method2327(class473.field6813, class428.field6085, -118);
            }
        } catch (Exception var3) {
        }
        if (arg1 < 9) {
            this.field5543 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([II[IILjava/lang/String;[IZ[Lf;)V", line = 676)
    private final void method2323(int[] arg0, int arg1, int[] arg2, int arg3, String arg4, int[] arg5, boolean arg6, class534[] arg7) {
        field5546++;
        int var9 = arg1 - this.field5543.field6602;
        int var10 = -1;
        if (!arg6) {
            this.method2320(null, (byte) -9, 53);
        }
        int var11 = -1;
        int var12 = 0;
        int var13 = arg4.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class180.method1097(-2740, arg4.charAt(var14)) & 0xFF);
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
                                    if (arg0 == null) {
                                        var17 = 0;
                                    } else {
                                        var17 = arg0[var12];
                                    }
                                    int var18;
                                    if (arg2 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg2[var12];
                                    }
                                    var12++;
                                    int var19 = class274.method1607(var16.substring(4), 1);
                                    class534 var20 = arg7[var19];
                                    int var21 = arg5 == null ? var20.method304() : arg5[var19];
                                    var20.method314(arg3 + var17, var9 - (-this.field5543.field6602 - -var21) - -var18, 1, 0, 1);
                                    var11 = -1;
                                    arg3 += arg7[var19].method312();
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method2322(var16, (byte) 108);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg3 += this.field5543.method2663(true, var11, var15);
                    }
                    int var22;
                    if (arg0 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg0[var12];
                    }
                    int var23;
                    if (arg2 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg2[var12];
                    }
                    if (var15 != ' ') {
                        if ((class152.field1678 & 0xFF000000) != 0) {
                            this.method300(var15, arg3 + var22 + 1, var9 + 1 + var23, class152.field1678, true);
                        }
                        this.method300(var15, arg3 + var22, var9 - -var23, class428.field6086, false);
                    } else if (class215.field2605 > 0) {
                        class212.field2569 += class215.field2605;
                        arg3 += class212.field2569 >> 8;
                        class212.field2569 &= 0xFF;
                    }
                    var12++;
                    int var24 = this.field5543.method2662((byte) -33, var15);
                    if (class580.field8211 != -1) {
                        this.field5552.method3207(arg3, (int) ((double) this.field5543.field6602 * 0.7D) + var9, var24, class580.field8211, false);
                    }
                    if (class190.field2182 != -1) {
                        this.field5552.method3207(arg3, this.field5543.field6602 + var9, var24, class190.field2182, false);
                    }
                    var11 = var15;
                    arg3 += var24;
                }
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/util/Random;IILjava/lang/String;BII[Lf;I[I)I", line = 841)
    public final int method2324(Random arg0, int arg1, int arg2, String arg3, byte arg4, int arg5, int arg6, class534[] arg7, int arg8, int[] arg9) {
        field5545++;
        if (arg3 == null) {
            return 0;
        }
        arg0.setSeed((long) arg8);
        if (arg4 != 123) {
            return 57;
        }
        int var11 = (arg0.nextInt() & 0x1F) + 192;
        this.method2327(var11 << 24 | arg5 & 0xFFFFFF, var11 << 24 | arg1 & 0xFFFFFF, -125);
        int var12 = arg3.length();
        int[] var13 = new int[var12];
        int var14 = 0;
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg0.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        this.method2323(var13, arg6, null, arg2, arg3, arg9, true, arg7);
        return var14;
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(Ljava/lang/String;IIIII)V", line = 879)
    public final void method2325(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 != 1292016200) {
            return;
        }
        field5544++;
        if (arg0 != null) {
            this.method2327(arg1, arg3, -119);
            this.method2321(arg0, 0, null, arg5 - (this.field5543.method2657((byte) 62, arg0) / 2), arg4, null, 1, 0, null);
        }
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(B)V", line = 896)
    public static void method2326(byte arg0) {
        if (arg0 == 104) {
            field5537 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(III)V", line = 909)
    private final void method2327(int arg0, int arg1, int arg2) {
        if (arg1 == -1) {
            arg1 = 0;
        }
        class580.field8211 = -1;
        if (arg2 > -58) {
            return;
        }
        class190.field2182 = -1;
        field5549++;
        class473.field6813 = arg0;
        class428.field6086 = arg0;
        class215.field2605 = 0;
        class212.field2569 = 0;
        class428.field6085 = arg1;
        class152.field1678 = arg1;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIILjava/lang/String;I)V", line = 930)
    public final void method2328(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, int arg6) {
        field5536++;
        if (arg5 == null) {
            return;
        }
        if (arg0 != 5) {
            this.method2322(null, (byte) -102);
        }
        this.method2327(arg1, arg6, -128);
        int var8 = arg5.length();
        int[] var9 = new int[var8];
        for (int var10 = 0; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg4 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method2323(null, arg2, var9, arg3 - (this.field5543.method2657((byte) 62, arg5) / 2), arg5, null, true, null);
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lr;Lho;)V", line = 958)
    public class413(class564 arg0, class463 arg1) {
        this.field5543 = arg1;
        this.field5552 = arg0;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(CIIIZLua;II)V")
    public abstract void method299(char arg0, int arg1, int arg2, int arg3, boolean arg4, class598 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!la", name = "OA", descriptor = "(CIIIZ)V")
    public abstract void method300(char arg0, int arg1, int arg2, int arg3, boolean arg4);
}
