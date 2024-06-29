import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public abstract class class597 {

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "Loa;")
    private class43 field8072;

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "Lsga;")
    private class547 field8069;

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "Z")
    public static boolean field8076 = false;

    @OriginalMember(owner = "client!ta", name = "v", descriptor = "I")
    private static int field8082 = 0;

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "[S")
    public static short[] field8068 = new short[256];

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
    public static int field8061;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "I")
    public static int field8062;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
    public static int field8063;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "I")
    public static int field8064;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
    public static int field8065;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "I")
    public static int field8066;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
    public static int field8067;

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "I")
    public static int field8070;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "I")
    public static int field8071;

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "I")
    public static int field8073;

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "I")
    public static int field8074;

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "I")
    public static int field8075;

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "I")
    public static int field8077;

    @OriginalMember(owner = "client!ta", name = "r", descriptor = "I")
    public static int field8078;

    @OriginalMember(owner = "client!ta", name = "s", descriptor = "I")
    public static int field8079;

    @OriginalMember(owner = "client!ta", name = "u", descriptor = "I")
    public static int field8081;

    @OriginalMember(owner = "client!ta", name = "w", descriptor = "I")
    public static int field8083;

    @OriginalMember(owner = "client!ta", name = "x", descriptor = "I")
    public static int field8084;

    @OriginalMember(owner = "client!ta", name = "y", descriptor = "I")
    public static int field8085;

    @OriginalMember(owner = "client!ta", name = "z", descriptor = "I")
    public static int field8086;

    @OriginalMember(owner = "client!ta", name = "A", descriptor = "I")
    public static int field8087;

    @OriginalMember(owner = "client!ta", name = "t", descriptor = "Ljd;")
    public static class559 field8080;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I[Ltc;B)V")
    public static final void method3234(int arg0, class477[] arg1, byte arg2) {
        if (arg2 > -44) {
            method3247(-40, 62, null, false, 38, -46);
        }
        field8078++;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class477 var4 = arg1[var3];
            if (var4 != null) {
                if (var4.field6312 == 0) {
                    if (var4.field6258 != null) {
                        method3234(arg0, var4.field6258, (byte) -120);
                    }
                    class270 var5 = (class270) class700.field9763.method39((long) var4.field6234, 31750);
                    if (var5 != null) {
                        class491.method2685(arg0, 2626, var5.field3588);
                    }
                }
                if (arg0 == 0 && var4.field6363 != null) {
                    class155 var6 = new class155();
                    var6.field1968 = var4;
                    var6.field1962 = var4.field6363;
                    class709.method3885(var6);
                }
                if (arg0 == 1 && var4.field6254 != null) {
                    if (var4.field6221 >= 0) {
                        class477 var7 = class600.method3268(110, var4.field6234);
                        if (var7 == null || var7.field6258 == null || var7.field6258.length <= var4.field6221 || var7.field6258[var4.field6221] != var4) {
                            continue;
                        }
                    }
                    class155 var8 = new class155();
                    var8.field1968 = var4;
                    var8.field1962 = var4.field6254;
                    class709.method3885(var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BLjava/lang/String;IIII)V")
    public final void method3235(byte arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        field8084++;
        if (arg1 == null) {
            return;
        }
        this.method3255(arg4, arg3, -122);
        this.method3245(null, 16777215, 0, arg2, arg1, null, 0, arg5 - this.field8069.method2900(true, arg1), null);
        if (arg0 > -89) {
            this.method3256(-2, 91, -17, -126, 80, 71, null, null, 51, null, -46, null, 12, -117, -94, 117);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BLjava/lang/String;)[B")
    public static final byte[] method3236(byte arg0, String arg1) {
        field8062++;
        int var2 = 114 % ((arg0 + 61) / 38);
        int var3 = arg1.length();
        if (var3 == 0) {
            return new byte[0];
        }
        int var4 = var3 + 3 & 0xFFFFFFFC;
        int var5 = var4 / 4 * 3;
        if (var3 <= var4 - 2 || class564.method3013(false, arg1.charAt(var4 - 2)) == -1) {
            var5 -= 2;
        } else if ((var4 - 1) >= var3 || class564.method3013(false, arg1.charAt(var4 - 1)) == -1) {
            var5--;
        }
        byte[] var6 = new byte[var5];
        class515.method2780(192, var6, 0, arg1);
        return var6;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/lang/String;IIILjava/util/Random;II[IIZI[I[Lxa;II)I")
    public final int method3237(String arg0, int arg1, int arg2, int arg3, Random arg4, int arg5, int arg6, int[] arg7, int arg8, boolean arg9, int arg10, int[] arg11, class511[] arg12, int arg13, int arg14) {
        field8081++;
        if (arg0 == null) {
            return 0;
        }
        arg4.setSeed((long) arg1);
        int var16 = (arg4.nextInt() & 0x1F) + 192;
        this.method3255(arg14 & 0xFFFFFF | var16 << 24, arg3 & 0xFFFFFF | var16 << 24, -124);
        int var17 = arg0.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        int var20 = 0;
        if (arg9) {
            return -71;
        }
        while (var20 < var17) {
            var18[var20] = var19;
            if ((arg4.nextInt() & 0x3) == 0) {
                var19++;
            }
            var20++;
        }
        int var21 = arg5;
        int var22 = this.field8069.field7103 + arg2;
        int var23 = -1;
        if (arg10 == 1) {
            var22 += (arg8 - this.field8069.field7103 - this.field8069.field7102) / 2;
        } else if (arg10 == 2) {
            var22 = arg8 + arg2 - this.field8069.field7102;
        }
        if (arg6 == 1) {
            var23 = var19 + this.field8069.method2900(true, arg0);
            var21 = (arg13 - var23) / 2 + arg5;
        } else if (arg6 == 2) {
            var23 = var19 + this.field8069.method2900(!arg9, arg0);
            var21 = arg13 + arg5 - var23;
        }
        this.method3254(null, arg12, 1, arg0, arg7, var22, var21, var18);
        if (arg11 != null) {
            if (var23 == -1) {
                var23 = var19 + this.field8069.method2900(true, arg0);
            }
            arg11[0] = var21;
            arg11[2] = var23;
            arg11[1] = var22 - this.field8069.field7103;
            arg11[3] = this.field8069.field7103 + this.field8069.field7102;
        }
        return var19;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)I")
    public static int method3238(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([Lxa;IIII[ILjava/lang/String;I)V")
    public final void method3239(class511[] arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, String arg6, int arg7) {
        field8087++;
        if (arg6 != null) {
            this.method3255(arg1, arg2, -107);
            this.method3245(null, 16777215, 0, arg3, arg6, arg0, arg4, arg7, arg5);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(CIIIZLfa;II)V")
    public abstract void method1189(char arg0, int arg1, int arg2, int arg3, boolean arg4, class619 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILjava/lang/String;IIIII)V")
    public final void method3240(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field8064++;
        if (arg1 == null) {
            return;
        }
        this.method3255(arg2, arg6, arg0 - 119);
        if (arg0 != -3) {
            return;
        }
        int var8 = arg1.length();
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg3 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg3 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method3254(var10, null, arg0 + 4, arg1, null, arg4, arg5 - (this.field8069.method2900(true, arg1) / 2), var9);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILjava/lang/String;IIIIB)V")
    public final void method3241(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field8065++;
        if (arg1 == null) {
            return;
        }
        this.method3255(arg2, arg3, -99);
        int var8 = arg1.length();
        int[] var9 = new int[var8];
        int var10 = 0;
        if (arg6 != -25) {
            this.method3242(null, -79, 44, 28, null, null, 58, 25, 2, null);
        }
        while (var10 < var8) {
            var9[var10] = (int) (Math.sin((double) arg4 / 5.0D + (double) var10 / 2.0D) * 5.0D);
            var10++;
        }
        this.method3254(var9, null, 1, arg1, null, arg0, arg5 - (this.field8069.method2900(true, arg1) / 2), null);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/lang/String;IIILjava/util/Random;[Lxa;III[I)I")
    public final int method3242(String arg0, int arg1, int arg2, int arg3, Random arg4, class511[] arg5, int arg6, int arg7, int arg8, int[] arg9) {
        field8061++;
        if (arg0 == null) {
            return 0;
        }
        arg4.setSeed((long) arg2);
        int var11 = (arg4.nextInt() & 0x1F) + 192;
        this.method3255(arg6 & 0xFFFFFF | var11 << 24, arg8 & 0xFFFFFF | var11 << 24, -111);
        if (arg1 < 114) {
            method3234(100, null, (byte) -51);
        }
        int var12 = arg0.length();
        int[] var13 = new int[var12];
        int var14 = 0;
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg4.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        this.method3254(null, arg5, 1, arg0, arg9, arg3, arg7, var13);
        return var14;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
    public final void method3243(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field8079++;
        if (arg0 == null) {
            return;
        }
        this.method3255(arg3, arg4, -113);
        this.method3245(null, 16777215, 0, arg2, arg0, null, 0, arg1, null);
        if (arg5 >= -13) {
            field8082 = -48;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZLjava/lang/String;)V")
    private final void method3244(boolean arg0, String arg1) {
        try {
            if (arg1.startsWith("col=")) {
                class631.field8808 = class631.field8808 & 0xFF000000 | class19.method106(16, arg1.substring(4), (byte) 99) & 0xFFFFFF;
            } else if (arg1.equals("/col")) {
                class631.field8808 = class519.field6792 & 0xFFFFFF | class631.field8808 & 0xFF000000;
            }
            if (arg0) {
                return;
            }
            if (arg1.startsWith("argb=")) {
                class631.field8808 = class19.method106(16, arg1.substring(5), (byte) 99);
            } else if (arg1.equals("/argb")) {
                class631.field8808 = class519.field6792;
            } else if (arg1.startsWith("str=")) {
                class380.field4885 = class631.field8808 & 0xFF000000 | class19.method106(16, arg1.substring(4), (byte) 99);
            } else if (arg1.equals("str")) {
                class380.field4885 = class631.field8808 & 0xFF000000 | 0x800000;
            } else if (arg1.equals("/str")) {
                class380.field4885 = -1;
            } else if (arg1.startsWith("u=")) {
                class295.field3833 = class631.field8808 & 0xFF000000 | class19.method106(16, arg1.substring(2), (byte) 99);
            } else if (arg1.equals("u")) {
                class295.field3833 = class631.field8808 & 0xFF000000;
            } else if (arg1.equals("/u")) {
                class295.field3833 = -1;
            } else if (arg1.equalsIgnoreCase("shad=-1")) {
                class537.field6989 = 0;
            } else if (arg1.startsWith("shad=")) {
                class537.field6989 = class631.field8808 & 0xFF000000 | class19.method106(16, arg1.substring(5), (byte) 99);
            } else if (arg1.equals("shad")) {
                class537.field6989 = class631.field8808 & 0xFF000000;
            } else if (arg1.equals("/shad")) {
                class537.field6989 = class9.field100;
            } else if (arg1.equals("br")) {
                this.method3255(class519.field6792, class9.field100, -123);
            }
        } catch (Exception var3) {
        }
        field8085++;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lfa;IIILjava/lang/String;[Lxa;II[I)V")
    private final void method3245(class619 arg0, int arg1, int arg2, int arg3, String arg4, class511[] arg5, int arg6, int arg7, int[] arg8) {
        int var10 = arg3 - this.field8069.field7100;
        if (arg1 != 16777215) {
            this.method3252(49, -115, null);
        }
        field8074++;
        int var11 = -1;
        int var12 = -1;
        int var13 = arg4.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class576.method3152(arg4.charAt(var14), 119) & 0xFF);
            if (var15 == '<') {
                var11 = var14;
            } else {
                if (var15 == '>' && var11 != -1) {
                    String var16 = arg4.substring(var11 + 1, var14);
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
                                    int var17 = class703.method3845((byte) -94, var16.substring(4));
                                    class511 var18 = arg5[var17];
                                    int var19 = arg8 == null ? var18.method595() : arg8[var17];
                                    if ((class631.field8808 & 0xFF000000) == -16777216) {
                                        var18.method606(arg7, this.field8069.field7100 + var10 - var19, 1, 0, 1);
                                    } else {
                                        var18.method606(arg7, this.field8069.field7100 + var10 - var19, 0, class631.field8808 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    arg7 += arg5[var17].method602();
                                    var12 = -1;
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method3244(false, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg7 += this.field8069.method2901(var15, 12873, var12);
                    }
                    if (var15 == ' ') {
                        if (class329.field4271 > 0) {
                            field8082 += class329.field4271;
                            arg7 += field8082 >> 8;
                            field8082 &= 0xFF;
                        }
                    } else if (arg0 == null) {
                        if ((class537.field6989 & 0xFF000000) != 0) {
                            this.method1191(var15, arg7 + 1, var10 + 1, class537.field6989, true);
                        }
                        this.method1191(var15, arg7, var10, class631.field8808, false);
                    } else {
                        if ((class537.field6989 & 0xFF000000) != 0) {
                            this.method1189(var15, arg7 + 1, var10 - -1, class537.field6989, true, arg0, arg2, arg6);
                        }
                        this.method1189(var15, arg7, var10, class631.field8808, false, arg0, arg2, arg6);
                    }
                    int var20 = this.field8069.method2903(false, var15);
                    if (class380.field4885 != -1) {
                        this.field8072.method331((int) ((double) this.field8069.field7100 * 0.7D) + var10, 1, var20, class380.field4885, arg7);
                    }
                    if (class295.field3833 != -1) {
                        this.field8072.method331(this.field8069.field7100 + var10 + 1, arg1 ^ 0xFFFFFE, var20, class295.field3833, arg7);
                    }
                    arg7 += var20;
                    var12 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V")
    public static final void method3246(int arg0) {
        field8075++;
        if (class688.field9413.field1823 && class256.field3470.field3554 != -1) {
            class39.method309(class256.field3470.field3543, 6693, class256.field3470.field3554);
        }
        if (arg0 < 118) {
            field8068 = null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IILpe;ZII)V")
    public static final void method3247(int arg0, int arg1, class615 arg2, boolean arg3, int arg4, int arg5) {
        class27.field403 = 10000;
        class557.field7280 = arg5;
        if (arg1 != 8364) {
            field8076 = true;
        }
        class426.field5523 = 1;
        field8063++;
        class332.field4314 = arg0;
        class64.field867 = arg3;
        class521.field6803 = arg4;
        class414.field5327 = arg2;
    }

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "(CIIIZ)V")
    public abstract void method1191(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method3248(int arg0, String arg1) {
        field8077++;
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = (var3 << 5) + arg1.charAt(var4) - var3;
        }
        if (arg0 != 1544807237) {
            field8076 = true;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BIILjava/lang/String;II)V")
    public final void method3249(byte arg0, int arg1, int arg2, String arg3, int arg4, int arg5) {
        field8086++;
        if (arg3 != null) {
            int var7 = 15 % ((arg0 + 51) / 50);
            this.method3255(arg1, arg5, -99);
            this.method3245(null, 16777215, 0, arg2, arg3, null, 0, arg4 - (this.field8069.method2900(true, arg3) / 2), null);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([Lxa;[IILfa;IIIIIIIILjava/lang/String;IIII)I")
    public final int method3250(class511[] arg0, int[] arg1, int arg2, class619 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, String arg12, int arg13, int arg14, int arg15, int arg16) {
        field8070++;
        if (arg12 == null) {
            return 0;
        }
        this.method3255(arg10, arg8, arg4 ^ 0xFFFFFF8E);
        if (arg7 == 0) {
            arg7 = this.field8069.field7100;
        }
        int[] var18;
        if (arg11 < this.field8069.field7102 + arg7 + this.field8069.field7103 && arg11 < (arg7 + arg7)) {
            var18 = null;
        } else {
            var18 = new int[] { arg9 };
        }
        if (arg4 != 1) {
            field8076 = false;
        }
        int var19 = this.field8069.method2906((byte) 125, var18, arg0, class700.field9770, arg12);
        if (arg15 == -1) {
            arg15 = arg11 / arg7;
            if (arg15 <= 0) {
                arg15 = 1;
            }
        }
        if (arg15 > 0 && var19 >= arg15) {
            var19 = arg15;
            class700.field9770[arg15 - 1] = this.field8069.method2905(class700.field9770[arg15 - 1], arg0, arg9, 4);
        }
        if (arg14 == 3 && var19 == 1) {
            arg14 = 1;
        }
        int var21;
        if (arg14 == 0) {
            var21 = this.field8069.field7103 + arg6;
        } else if (arg14 == 1) {
            var21 = (arg11 - ((var19 - 1) * arg7) - this.field8069.field7102 - this.field8069.field7103) / 2 + arg6 + this.field8069.field7103;
        } else if (arg14 == 2) {
            var21 = arg6 + arg11 - this.field8069.field7102 - ((var19 - 1) * arg7);
        } else {
            int var20 = (arg11 - this.field8069.field7102 - ((var19 + -1) * arg7) - this.field8069.field7103) / (var19 + 1);
            if (var20 < 0) {
                var20 = 0;
            }
            var21 = arg6 + var20 + this.field8069.field7103;
            arg7 += var20;
        }
        for (int var22 = 0; var22 < var19; var22++) {
            if (arg16 == 0) {
                this.method3245(arg3, 16777215, arg13, var21, class700.field9770[var22], arg0, arg5, arg2, arg1);
            } else if (arg16 == 1) {
                this.method3245(arg3, arg4 ^ 0xFFFFFE, arg13, var21, class700.field9770[var22], arg0, arg5, arg2 + ((arg9 - this.field8069.method2900(true, class700.field9770[var22])) / 2), arg1);
            } else if (arg16 == 2) {
                this.method3245(arg3, arg4 ^ 0xFFFFFE, arg13, var21, class700.field9770[var22], arg0, arg5, arg9 + (arg2 - this.field8069.method2900(true, class700.field9770[var22])), arg1);
            } else if ((var19 - 1) == var22) {
                this.method3245(arg3, 16777215, arg13, var21, class700.field9770[var22], arg0, arg5, arg2, arg1);
            } else {
                this.method3252(-111, arg9, class700.field9770[var22]);
                this.method3245(arg3, arg4 ^ 0xFFFFFE, arg13, var21, class700.field9770[var22], arg0, arg5, arg2, arg1);
                class329.field4271 = 0;
            }
            var21 += arg7;
        }
        return var19;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)V")
    public static void method3251(int arg0) {
        if (arg0 > -67) {
            method3246(33);
        }
        field8080 = null;
        field8068 = null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IILjava/lang/String;)V")
    private final void method3252(int arg0, int arg1, String arg2) {
        field8071++;
        int var4 = 0;
        boolean var5 = false;
        int var6 = 82 / ((-arg0 - 57) / 34);
        for (int var7 = 0; var7 < arg2.length(); var7++) {
            char var8 = arg2.charAt(var7);
            if (var8 == '<') {
                var5 = true;
            } else if (var8 == '>') {
                var5 = false;
            } else if (!var5 && var8 == ' ') {
                var4++;
            }
        }
        if (var4 > 0) {
            class329.field4271 = (arg1 - this.field8069.method2900(true, arg2) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Loa;Lsga;)V")
    public class597(class43 arg0, class547 arg1) {
        this.field8072 = arg0;
        this.field8069 = arg1;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIIIILjava/lang/String;)V")
    public final void method3253(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, String arg7) {
        field8067++;
        if (arg7 == null) {
            return;
        }
        this.method3255(arg0, arg2, -120);
        double var9 = 7.0D - (double) arg1 / 8.0D;
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg7.length();
        int[] var12 = new int[var11];
        int var13 = 0;
        if (arg6 != 18326) {
            field8080 = null;
        }
        while (var11 > var13) {
            var12[var13] = (int) (var9 * Math.sin((double) var13 / 1.5D + (double) arg4));
            var13++;
        }
        this.method3254(var12, null, 1, arg7, null, arg5, arg3 - (this.field8069.method2900(true, arg7) / 2), null);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([I[Lxa;ILjava/lang/String;[III[I)V")
    private final void method3254(int[] arg0, class511[] arg1, int arg2, String arg3, int[] arg4, int arg5, int arg6, int[] arg7) {
        field8073++;
        if (arg2 != 1) {
            field8082 = -63;
        }
        int var9 = arg5 - this.field8069.field7100;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg3.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class576.method3152(arg3.charAt(var14), arg2 + 113) & 0xFF);
            if (var15 == '<') {
                var10 = var14;
            } else {
                if (var15 == '>' && var10 != -1) {
                    String var16 = arg3.substring(var10 + 1, var14);
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
                                    if (arg7 == null) {
                                        var17 = 0;
                                    } else {
                                        var17 = arg7[var12];
                                    }
                                    int var18;
                                    if (arg0 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg0[var12];
                                    }
                                    var12++;
                                    int var19 = class703.method3845((byte) -94, var16.substring(4));
                                    class511 var20 = arg1[var19];
                                    int var21 = arg4 == null ? var20.method595() : arg4[var19];
                                    var20.method606(arg6 + var17, -var21 + this.field8069.field7100 + var9 + var18, 1, 0, 1);
                                    arg6 += arg1[var19].method602();
                                    var11 = -1;
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method3244(false, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg6 += this.field8069.method2901(var15, 12873, var11);
                    }
                    int var22;
                    if (arg7 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg7[var12];
                    }
                    int var23;
                    if (arg0 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg0[var12];
                    }
                    if (var15 != ' ') {
                        if ((class537.field6989 & 0xFF000000) != 0) {
                            this.method1191(var15, var22 + arg6 + 1, var23 + 1 + var9, class537.field6989, true);
                        }
                        this.method1191(var15, arg6 + var22, var9 + var23, class631.field8808, false);
                    } else if (class329.field4271 > 0) {
                        field8082 += class329.field4271;
                        arg6 += field8082 >> 8;
                        field8082 &= 0xFF;
                    }
                    var12++;
                    int var24 = this.field8069.method2903(false, var15);
                    if (class380.field4885 != -1) {
                        this.field8072.method331((int) ((double) this.field8069.field7100 * 0.7D) + var9, 1, var24, class380.field4885, arg6);
                    }
                    if (class295.field3833 != -1) {
                        this.field8072.method331(var9 + this.field8069.field7100, 1, var24, class295.field3833, arg6);
                    }
                    var11 = var15;
                    arg6 += var24;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(III)V")
    private final void method3255(int arg0, int arg1, int arg2) {
        field8083++;
        class329.field4271 = 0;
        field8082 = 0;
        class380.field4885 = -1;
        class519.field6792 = arg0;
        class631.field8808 = arg0;
        if (arg2 >= -98) {
            this.method3235((byte) -117, null, 49, 88, -16, -72);
        }
        if (arg1 == -1) {
            arg1 = 0;
        }
        class295.field3833 = -1;
        class9.field100 = arg1;
        class537.field6989 = arg1;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIIILjava/lang/String;Lfa;I[II[Lxa;IIII)I")
    public final int method3256(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6, class619 arg7, int arg8, int[] arg9, int arg10, class511[] arg11, int arg12, int arg13, int arg14, int arg15) {
        int var17 = -93 % ((-arg8 - 70) / 33);
        field8066++;
        return this.method3250(arg11, arg9, arg4, arg7, 1, arg0, arg3, arg5, arg10, arg13, arg1, arg2, arg6, arg12, arg15, 0, arg14);
    }
}
