import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public abstract class class452 {

    @OriginalMember(owner = "client!mp", name = "p", descriptor = "Lgh;")
    private class325 field6582;

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "Le;")
    private class312 field6568;

    @OriginalMember(owner = "client!mp", name = "m", descriptor = "I")
    public static int field6579 = 2;

    @OriginalMember(owner = "client!mp", name = "t", descriptor = "J")
    public static long field6586 = 0L;

    @OriginalMember(owner = "client!mp", name = "u", descriptor = "I")
    public static int field6587 = 1;

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "F")
    public static float field6569;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "I")
    public static int field6567;

    @OriginalMember(owner = "client!mp", name = "d", descriptor = "I")
    public static int field6570;

    @OriginalMember(owner = "client!mp", name = "e", descriptor = "I")
    public static int field6571;

    @OriginalMember(owner = "client!mp", name = "f", descriptor = "I")
    public static int field6572;

    @OriginalMember(owner = "client!mp", name = "g", descriptor = "I")
    public static int field6573;

    @OriginalMember(owner = "client!mp", name = "h", descriptor = "I")
    public static int field6574;

    @OriginalMember(owner = "client!mp", name = "i", descriptor = "I")
    public static int field6575;

    @OriginalMember(owner = "client!mp", name = "j", descriptor = "I")
    public static int field6576;

    @OriginalMember(owner = "client!mp", name = "k", descriptor = "I")
    public static int field6577;

    @OriginalMember(owner = "client!mp", name = "l", descriptor = "I")
    public static int field6578;

    @OriginalMember(owner = "client!mp", name = "n", descriptor = "I")
    public static int field6580;

    @OriginalMember(owner = "client!mp", name = "o", descriptor = "I")
    public static int field6581;

    @OriginalMember(owner = "client!mp", name = "q", descriptor = "I")
    public static int field6583;

    @OriginalMember(owner = "client!mp", name = "r", descriptor = "I")
    public static int field6584;

    @OriginalMember(owner = "client!mp", name = "s", descriptor = "I")
    public static int field6585;

    @OriginalMember(owner = "client!mp", name = "v", descriptor = "I")
    public static int field6588;

    @OriginalMember(owner = "client!mp", name = "w", descriptor = "I")
    public static int field6589;

    @OriginalMember(owner = "client!mp", name = "x", descriptor = "I")
    public static int field6590;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(I[Lgl;III[ILjava/util/Random;Ljava/lang/String;II)I")
    public final int method2809(int arg0, class356[] arg1, int arg2, int arg3, int arg4, int[] arg5, Random arg6, String arg7, int arg8, int arg9) {
        field6577++;
        if (arg7 == null) {
            return 0;
        }
        arg6.setSeed((long) arg3);
        int var11 = (arg6.nextInt() & 0x1F) + 192;
        this.method2812((byte) -127, arg8 & 0xFFFFFF | var11 << 24, var11 << 24 | arg9 & 0xFFFFFF);
        int var12 = arg7.length();
        if (arg2 != 8364) {
            field6569 = -1.1289005F;
        }
        int[] var13 = new int[var12];
        int var14 = 0;
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg6.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        this.method2814(arg5, arg1, arg4, false, arg7, arg0, var13, (int[]) null);
        return var14;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(IIIIZLjava/lang/String;)V")
    public final void method2810(int arg0, int arg1, int arg2, int arg3, boolean arg4, String arg5) {
        field6573++;
        if (arg5 != null) {
            this.method2812((byte) -126, arg2, arg1);
            this.method2816(arg0, 0, arg5, (class356[]) null, arg4, (class245) null, (int[]) null, arg3, 0);
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(Ljava/lang/String;BI)V")
    private final void method2811(String arg0, byte arg1, int arg2) {
        field6567++;
        int var4 = 0;
        boolean var5 = false;
        for (int var6 = 0; var6 < arg0.length(); var6++) {
            char var7 = arg0.charAt(var6);
            if (var7 == '<') {
                var5 = true;
            } else if (var7 == '>') {
                var5 = false;
            } else if (!var5 && var7 == ' ') {
                var4++;
            }
        }
        if (arg1 != 15) {
            field6587 = -14;
        }
        if (var4 > 0) {
            class193.field3130 = (arg2 - this.field6582.method2162(arg0, 80) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(BII)V")
    private final void method2812(byte arg0, int arg1, int arg2) {
        class241.field3986 = -1;
        class201.field3232 = 0;
        field6588++;
        if (arg2 == -1) {
            arg2 = 0;
        }
        class139.field2159 = arg1;
        class367.field5552 = arg1;
        class280.field4491 = -1;
        class193.field3130 = 0;
        class60.field766 = arg2;
        class263.field4243 = arg2;
        if (arg0 >= -117) {
            method2825(-37, -70);
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(ILjava/lang/String;[IIIIB[Lgl;)V")
    public final void method2813(int arg0, String arg1, int[] arg2, int arg3, int arg4, int arg5, byte arg6, class356[] arg7) {
        field6585++;
        if (arg1 == null) {
            return;
        }
        this.method2812((byte) -125, arg4, arg3);
        this.method2816(arg5, 0, arg1, arg7, true, (class245) null, arg2, arg0, 0);
        if (arg6 <= 17) {
            field6586 = -37L;
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "([I[Lgl;IZLjava/lang/String;I[I[I)V")
    private final void method2814(int[] arg0, class356[] arg1, int arg2, boolean arg3, String arg4, int arg5, int[] arg6, int[] arg7) {
        int var9 = arg2 - this.field6582.field5102;
        field6575++;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg4.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class220.method1571(arg4.charAt(var14), (byte) -100) & 0xFF);
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
                                    if (arg6 == null) {
                                        var17 = 0;
                                    } else {
                                        var17 = arg6[var12];
                                    }
                                    int var18;
                                    if (arg7 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg7[var12];
                                    }
                                    var12++;
                                    int var19 = class162.method1128(var16.substring(4), 125);
                                    class356 var20 = arg1[var19];
                                    int var21 = arg0 == null ? var20.method2315() : arg0[var19];
                                    var20.method419(arg5 + var17, -var21 + this.field6582.field5102 + var9 + var18, 0, 0, 1);
                                    var11 = -1;
                                    arg5 += arg1[var19].method2318();
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method2819(-1, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg5 += this.field6582.method2161(var11, var15, 0);
                    }
                    int var22;
                    if (arg6 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg6[var12];
                    }
                    int var23;
                    if (arg7 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg7[var12];
                    }
                    var12++;
                    if (var15 != ' ') {
                        if ((class263.field4243 & 0xFF000000) != 0) {
                            this.method149(var15, arg5 + var22 + 1, var23 + 1 + var9, class263.field4243, true);
                        }
                        this.method149(var15, arg5 + var22, var9 - -var23, class367.field5552, false);
                    } else if (class193.field3130 > 0) {
                        class201.field3232 += class193.field3130;
                        arg5 += class201.field3232 >> 8;
                        class201.field3232 &= 0xFF;
                    }
                    int var24 = this.field6582.method2154(var15, 255);
                    if (class241.field3986 != -1) {
                        this.field6568.method2087(class241.field3986, true, var9 + ((int) ((double) this.field6582.field5102 * 0.7D)), arg5, var24);
                    }
                    if (class280.field4491 != -1) {
                        this.field6568.method2087(class280.field4491, !arg3, this.field6582.field5102 + var9, arg5, var24);
                    }
                    arg5 += var24;
                    var11 = var15;
                }
            }
        }
        if (arg3) {
            this.field6568 = null;
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(II[Lgl;I[ILq;IIIIIILjava/lang/String;III)I")
    public final int method2815(int arg0, int arg1, class356[] arg2, int arg3, int[] arg4, class245 arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, String arg12, int arg13, int arg14, int arg15) {
        field6580++;
        if (arg12 == null) {
            return 0;
        }
        this.method2812((byte) -120, arg9, arg15);
        if (arg10 == 0) {
            arg10 = this.field6582.field5102;
        }
        int[] var17;
        if (this.field6582.field5108 + this.field6582.field5107 + arg10 > arg6 && (arg10 + arg10) > arg6) {
            var17 = null;
        } else {
            var17 = new int[] { arg8 };
        }
        int var18 = this.field6582.method2160(var17, class424.field6263, arg12, (byte) -18, arg2);
        if (arg0 != 173) {
            return -23;
        }
        if (arg7 == 3 && var18 == 1) {
            arg7 = 1;
        }
        int var19;
        if (arg7 == 0) {
            var19 = this.field6582.field5107 + arg1;
        } else if (arg7 == 1) {
            var19 = arg1 - (-this.field6582.field5107 - (arg6 - this.field6582.field5108 - this.field6582.field5107 - (var18 + -1) * arg10) / 2);
        } else if (arg7 == 2) {
            var19 = arg1 + arg6 - this.field6582.field5108 - ((var18 + -1) * arg10);
        } else {
            int var20 = (arg6 - (this.field6582.field5107 + ((var18 - 1) * arg10)) - this.field6582.field5108) / (var18 + 1);
            if (var20 < 0) {
                var20 = 0;
            }
            arg10 += var20;
            var19 = this.field6582.field5107 + var20 + arg1;
        }
        for (int var21 = 0; var21 < var18; var21++) {
            if (arg3 == 0) {
                this.method2816(arg13, arg14, class424.field6263[var21], arg2, true, arg5, arg4, var19, arg11);
            } else if (arg3 == 1) {
                this.method2816(arg13 + ((arg8 - this.field6582.method2162(class424.field6263[var21], -62)) / 2), arg14, class424.field6263[var21], arg2, true, arg5, arg4, var19, arg11);
            } else if (arg3 == 2) {
                this.method2816(arg8 + arg13 - this.field6582.method2162(class424.field6263[var21], -127), arg14, class424.field6263[var21], arg2, true, arg5, arg4, var19, arg11);
            } else if ((var18 - 1) == var21) {
                this.method2816(arg13, arg14, class424.field6263[var21], arg2, true, arg5, arg4, var19, arg11);
            } else {
                this.method2811(class424.field6263[var21], (byte) 15, arg8);
                this.method2816(arg13, arg14, class424.field6263[var21], arg2, true, arg5, arg4, var19, arg11);
                class193.field3130 = 0;
            }
            var19 += arg10;
        }
        return var18;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(IILjava/lang/String;[Lgl;ZLq;[III)V")
    private final void method2816(int arg0, int arg1, String arg2, class356[] arg3, boolean arg4, class245 arg5, int[] arg6, int arg7, int arg8) {
        int var10 = arg7 - this.field6582.field5102;
        field6571++;
        int var11 = -1;
        int var12 = -1;
        if (!arg4) {
            return;
        }
        int var13 = arg2.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class220.method1571(arg2.charAt(var14), (byte) -100) & 0xFF);
            if (var15 == '<') {
                var11 = var14;
            } else {
                if (var15 == '>' && var11 != -1) {
                    String var16 = arg2.substring(var11 + 1, var14);
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
                                    int var17 = class162.method1128(var16.substring(4), 123);
                                    class356 var18 = arg3[var17];
                                    int var19 = arg6 == null ? var18.method2315() : arg6[var17];
                                    if ((class367.field5552 & 0xFF000000) == -16777216) {
                                        var18.method419(arg0, this.field6582.field5102 + var10 - var19, 0, 0, 1);
                                    } else {
                                        var18.method419(arg0, this.field6582.field5102 + var10 - var19, 1, class367.field5552 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    arg0 += arg3[var17].method2318();
                                    var12 = -1;
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method2819(-1, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg0 += this.field6582.method2161(var12, var15, 0);
                    }
                    if (var15 == ' ') {
                        if (class193.field3130 > 0) {
                            class201.field3232 += class193.field3130;
                            arg0 += class201.field3232 >> 8;
                            class201.field3232 &= 0xFF;
                        }
                    } else if (arg5 == null) {
                        if ((class263.field4243 & 0xFF000000) != 0) {
                            this.method149(var15, arg0 + 1, var10 + 1, class263.field4243, true);
                        }
                        this.method149(var15, arg0, var10, class367.field5552, false);
                    } else {
                        if ((class263.field4243 & 0xFF000000) != 0) {
                            this.method148(var15, arg0 + 1, var10 - -1, class263.field4243, true, arg5, arg8, arg1);
                        }
                        this.method148(var15, arg0, var10, class367.field5552, false, arg5, arg8, arg1);
                    }
                    int var20 = this.field6582.method2154(var15, 255);
                    if (class241.field3986 != -1) {
                        this.field6568.method2087(class241.field3986, true, var10 + ((int) ((double) this.field6582.field5102 * 0.7D)), arg0, var20);
                    }
                    if (class280.field4491 != -1) {
                        this.field6568.method2087(class280.field4491, true, this.field6582.field5102 + var10 + 1, arg0, var20);
                    }
                    arg0 += var20;
                    var12 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(BLjava/util/Random;III[III[Lgl;ILjava/lang/String;I[III)I")
    public final int method2817(byte arg0, Random arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, class356[] arg8, int arg9, String arg10, int arg11, int[] arg12, int arg13, int arg14) {
        field6576++;
        if (arg0 > -27) {
            return 104;
        } else if (arg10 == null) {
            return 0;
        } else {
            arg1.setSeed((long) arg11);
            int var16 = (arg1.nextInt() & 0x1F) + 192;
            this.method2812((byte) -126, arg14 & 0xFFFFFF | var16 << 24, var16 << 24 | arg9 & 0xFFFFFF);
            int var17 = arg10.length();
            int[] var18 = new int[var17];
            int var19 = 0;
            for (int var20 = 0; var20 < var17; var20++) {
                var18[var20] = var19;
                if ((arg1.nextInt() & 0x3) == 0) {
                    var19++;
                }
            }
            int var21 = arg4;
            int var22 = arg3 + this.field6582.field5107;
            if (arg13 == 1) {
                var22 += (arg2 - this.field6582.field5107 - this.field6582.field5108) / 2;
            } else if (arg13 == 2) {
                var22 = arg3 + arg2 - this.field6582.field5108;
            }
            int var23 = -1;
            if (arg6 == 1) {
                var23 = this.field6582.method2162(arg10, -90) + var19;
                var21 = (arg7 - var23) / 2 + arg4;
            } else if (arg6 == 2) {
                var23 = this.field6582.method2162(arg10, -66) + var19;
                var21 = arg7 + arg4 - var23;
            }
            this.method2814(arg5, arg8, var22, false, arg10, var21, var18, (int[]) null);
            if (arg12 != null) {
                if (var23 == -1) {
                    var23 = this.field6582.method2162(arg10, -59) + var19;
                }
                arg12[1] = var22 - this.field6582.field5107;
                arg12[3] = this.field6582.field5108 + this.field6582.field5107;
                arg12[2] = var23;
                arg12[0] = var21;
            }
            return var19;
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(ILjava/lang/String;IBIII)V")
    public final void method2818(int arg0, String arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field6574++;
        if (arg1 == null) {
            return;
        }
        this.method2812((byte) -120, arg2, arg5);
        if (arg3 < 47) {
            return;
        }
        int var8 = arg1.length();
        int[] var9 = new int[var8];
        for (int var10 = 0; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg0 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method2814((int[]) null, (class356[]) null, arg6, false, arg1, arg4 - (this.field6582.method2162(arg1, -103) / 2), (int[]) null, var9);
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(CIIIZLq;II)V")
    public abstract void method148(char arg0, int arg1, int arg2, int arg3, boolean arg4, class245 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(CIIIZ)V")
    public abstract void method149(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(ILjava/lang/String;)V")
    private final void method2819(int arg0, String arg1) {
        try {
            if (arg1.startsWith("col=")) {
                class367.field5552 = class367.field5552 & 0xFF000000 | class56.method372(0, arg1.substring(4), 16) & 0xFFFFFF;
            } else if (arg1.equals("/col")) {
                class367.field5552 = class139.field2159 & 0xFFFFFF | class367.field5552 & 0xFF000000;
            }
            if (arg1.startsWith("argb=")) {
                class367.field5552 = class56.method372(0, arg1.substring(5), 16);
            } else if (arg1.equals("/argb")) {
                class367.field5552 = class139.field2159;
            } else if (arg1.startsWith("str=")) {
                class241.field3986 = class56.method372(0, arg1.substring(4), 16) | 0xFF000000;
            } else if (arg1.equals("str")) {
                class241.field3986 = -8388608;
            } else if (arg1.equals("/str")) {
                class241.field3986 = -1;
            } else if (arg1.startsWith("u=")) {
                class280.field4491 = class56.method372(0, arg1.substring(2), 16) | 0xFF000000;
            } else if (arg1.equals("u")) {
                class280.field4491 = -16777216;
            } else if (arg1.equals("/u")) {
                class280.field4491 = -1;
            } else if (arg1.equalsIgnoreCase("shad=-1")) {
                class263.field4243 = 0;
            } else if (arg1.startsWith("shad=")) {
                class263.field4243 = class56.method372(arg0 + 1, arg1.substring(5), 16) | 0xFF000000;
            } else if (arg1.equals("shad")) {
                class263.field4243 = -16777216;
            } else if (arg1.equals("/shad")) {
                class263.field4243 = class60.field766;
            } else if (arg1.equals("br")) {
                this.method2812((byte) -128, class139.field2159, class60.field766);
            }
        } catch (Exception var3) {
        }
        if (arg0 == -1) {
            field6572++;
        }
    }

    @OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(Le;Lgh;)V")
    public class452(class312 arg0, class325 arg1) {
        this.field6582 = arg1;
        this.field6568 = arg0;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(Ljava/lang/String;IIZII)V")
    public final void method2820(String arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field6589++;
        if (arg0 != null) {
            this.method2812((byte) -118, arg5, arg1);
            if (!arg3) {
                this.method2816(arg4 - (this.field6582.method2162(arg0, -125) / 2), 0, arg0, (class356[]) null, !arg3, (class245) null, (int[]) null, arg2, 0);
            }
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(Ljava/lang/String;IIIIIII)V")
    public final void method2821(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field6578++;
        if (arg0 == null) {
            return;
        }
        this.method2812((byte) -118, arg3, arg1);
        double var9 = 7.0D - (double) arg6 / 8.0D;
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg0.length();
        int[] var12 = new int[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (Math.sin((double) var13 / 1.5D + (double) arg5) * var9);
        }
        if (arg2 < -111) {
            this.method2814((int[]) null, (class356[]) null, arg4, false, arg0, arg7 - (this.field6582.method2162(arg0, 82) / 2), (int[]) null, var12);
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "([IIIILjava/lang/String;[Lgl;ZI)V")
    public final void method2822(int[] arg0, int arg1, int arg2, int arg3, String arg4, class356[] arg5, boolean arg6, int arg7) {
        if (arg6) {
            this.method2810(3, -126, 44, 20, false, (String) null);
        }
        field6583++;
        if (arg4 != null) {
            this.method2812((byte) -124, arg3, arg1);
            this.method2816(arg7 - this.field6582.method2162(arg4, -95) / 2, 0, arg4, arg5, !arg6, (class245) null, arg0, arg2, 0);
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(Ljava/lang/String;IIIZI)V")
    public final void method2823(String arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg4) {
            this.field6568 = null;
        }
        field6581++;
        if (arg0 != null) {
            this.method2812((byte) -121, arg5, arg1);
            this.method2816(arg3 - this.field6582.method2162(arg0, -84), 0, arg0, (class356[]) null, true, (class245) null, (int[]) null, arg2, 0);
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(IILjava/lang/String;IIII)V")
    public final void method2824(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5, int arg6) {
        field6590++;
        if (arg2 == null) {
            return;
        }
        this.method2812((byte) -127, arg5, arg0);
        int var8 = arg2.length();
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg3 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg3 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        if (arg6 > 103) {
            this.method2814((int[]) null, (class356[]) null, arg1, false, arg2, arg4 - (this.field6582.method2162(arg2, -111) / 2), var9, var10);
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(II)Lom;")
    public static final class209 method2825(int arg0, int arg1) {
        field6570++;
        class52 var2 = class68.field849;
        class209 var3;
        synchronized (class68.field849) {
            var3 = (class209) class68.field849.method331((byte) 69, (long) arg0);
            if (var3 == null) {
                var3 = new class209(arg0);
                class68.field849.method341(arg1 + 30787, (long) arg0, var3);
            }
            if (arg1 != -30741) {
                field6569 = -0.19919777F;
            }
        }
        synchronized (var3) {
            return var3.method1478(false) ? var3 : null;
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(Ljava/lang/String;II[II[Lgl;II)V")
    public final void method2826(String arg0, int arg1, int arg2, int[] arg3, int arg4, class356[] arg5, int arg6, int arg7) {
        field6584++;
        if (arg0 == null) {
            return;
        }
        this.method2812((byte) -123, arg7, arg6);
        this.method2816(arg2 - this.field6582.method2162(arg0, -64), 0, arg0, arg5, true, (class245) null, arg3, arg1, 0);
        if (arg4 >= -72) {
            this.method2817((byte) 106, (Random) null, 17, 38, -73, (int[]) null, 51, 51, (class356[]) null, 71, (String) null, -92, (int[]) null, -98, -42);
        }
    }
}
