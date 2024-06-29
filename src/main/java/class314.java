import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public abstract class class314 {

    @OriginalMember(owner = "client!la", name = "b", descriptor = "Lgt;")
    private class316 field4457;

    @OriginalMember(owner = "client!la", name = "u", descriptor = "Lya;")
    private class38 field4476;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "I")
    public static int field4466 = 0;

    @OriginalMember(owner = "client!la", name = "n", descriptor = "Z")
    public static boolean field4469 = false;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "Lpn;")
    public static class523 field4458 = new class523("", 16);

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field4456;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    public static int field4459;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public static int field4460;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    public static int field4462;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "I")
    public static int field4467;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!la", name = "o", descriptor = "I")
    public static int field4470;

    @OriginalMember(owner = "client!la", name = "p", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!la", name = "q", descriptor = "I")
    public static int field4472;

    @OriginalMember(owner = "client!la", name = "r", descriptor = "I")
    public static int field4473;

    @OriginalMember(owner = "client!la", name = "s", descriptor = "I")
    public static int field4474;

    @OriginalMember(owner = "client!la", name = "t", descriptor = "I")
    public static int field4475;

    @OriginalMember(owner = "client!la", name = "v", descriptor = "I")
    public static int field4477;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIILjava/lang/String;III)V")
    public final void method1947(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6) {
        field4470++;
        if (arg3 == null) {
            return;
        }
        this.method1954(arg1, (byte) 35, arg5);
        int var8 = arg3.length();
        if (arg6 > -124) {
            field4458 = null;
        }
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg4 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg4 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method1952(null, arg0, -16777216, arg2 - this.field4457.method1969(-1, arg3) / 2, arg3, var9, null, var10);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(III[I[Ll;ILjava/util/Random;Ljava/lang/String;IIIII[II)I")
    public final int method1948(int arg0, int arg1, int arg2, int[] arg3, class16[] arg4, int arg5, Random arg6, String arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int[] arg13, int arg14) {
        field4475++;
        if (arg7 == null) {
            return 0;
        }
        arg6.setSeed((long) arg2);
        int var16 = (arg6.nextInt() & 0x1F) + 192;
        this.method1954(arg10 & 0xFFFFFF | var16 << 24, (byte) -109, var16 << 24 | arg8 & 0xFFFFFF);
        int var17 = arg7.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        if (arg12 != -23980) {
            return 123;
        }
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg6.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        int var21 = arg5;
        int var22 = arg14 + this.field4457.field4493;
        int var23 = -1;
        if (arg11 == 1) {
            var22 += (arg1 - this.field4457.field4488 - this.field4457.field4493) / 2;
        } else if (arg11 == 2) {
            var22 = arg14 + arg1 - this.field4457.field4488;
        }
        if (arg0 == 1) {
            var23 = var19 + this.field4457.method1969(arg12 ^ 0x5DAB, arg7);
            var21 = (arg9 - var23) / 2 + arg5;
        } else if (arg0 == 2) {
            var23 = this.field4457.method1969(arg12 ^ 0x5DAB, arg7) + var19;
            var21 = arg9 + arg5 - var23;
        }
        this.method1952(arg3, var22, -16777216, var21, arg7, var18, arg4, null);
        if (arg13 != null) {
            if (var23 == -1) {
                var23 = this.field4457.method1969(arg12 ^ 0x5DAB, arg7) + var19;
            }
            arg13[1] = var22 - this.field4457.field4493;
            arg13[3] = this.field4457.field4493 + this.field4457.field4488;
            arg13[2] = var23;
            arg13[0] = var21;
        }
        return var19;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(III[Ll;[IZIIIIILjava/lang/String;IILma;II)I")
    public final int method1949(int arg0, int arg1, int arg2, class16[] arg3, int[] arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10, String arg11, int arg12, int arg13, class10 arg14, int arg15, int arg16) {
        field4460++;
        if (arg11 == null) {
            return 0;
        }
        this.method1954(arg6, (byte) -107, arg2);
        if (arg7 == 0) {
            arg7 = this.field4457.field4497;
        }
        int[] var18;
        if (arg1 < this.field4457.field4493 + arg7 + this.field4457.field4488 && arg1 < arg7 + arg7) {
            var18 = null;
        } else {
            var18 = new int[] { arg16 };
        }
        int var19 = this.field4457.method1968(arg3, var18, (byte) -96, class344.field4776, arg11);
        if (arg13 == -1) {
            arg13 = arg1 / arg7;
            if (arg13 <= 0) {
                arg13 = 1;
            }
        }
        if (arg13 > 0 && arg13 <= var19) {
            class344.field4776[arg13 - 1] = this.field4457.method1975(8364, arg3, class344.field4776[arg13 - 1], arg16);
            var19 = arg13;
        }
        if (arg10 == 3 && var19 == 1) {
            arg10 = 1;
        }
        int var20;
        if (arg10 == 0) {
            var20 = this.field4457.field4493 + arg12;
        } else if (arg10 == 1) {
            var20 = (arg1 - this.field4457.field4488 - ((var19 - 1) * arg7) - this.field4457.field4493) / 2 + this.field4457.field4493 + arg12;
        } else if (arg10 == 2) {
            var20 = arg1 + arg12 - ((var19 - 1) * arg7) - this.field4457.field4488;
        } else {
            int var21 = (arg1 - this.field4457.field4488 - this.field4457.field4493 - ((var19 + -1) * arg7)) / (var19 + 1);
            if (var21 < 0) {
                var21 = 0;
            }
            var20 = arg12 + this.field4457.field4493 + var21;
            arg7 += var21;
        }
        if (arg5) {
            this.field4457 = null;
        }
        for (int var22 = 0; var22 < var19; var22++) {
            if (arg15 == 0) {
                this.method1962(class344.field4776[var22], arg9, arg4, arg8, arg3, var20, false, arg14, arg0);
            } else if (arg15 == 1) {
                this.method1962(class344.field4776[var22], arg9, arg4, arg8, arg3, var20, arg5, arg14, arg0 + (arg16 - this.field4457.method1969(-1, class344.field4776[var22])) / 2);
            } else if (arg15 == 2) {
                this.method1962(class344.field4776[var22], arg9, arg4, arg8, arg3, var20, arg5, arg14, arg0 + arg16 - this.field4457.method1969(-1, class344.field4776[var22]));
            } else if (var19 - 1 == var22) {
                this.method1962(class344.field4776[var22], arg9, arg4, arg8, arg3, var20, false, arg14, arg0);
            } else {
                this.method1960(class344.field4776[var22], arg16, (byte) -73);
                this.method1962(class344.field4776[var22], arg9, arg4, arg8, arg3, var20, false, arg14, arg0);
                class153.field2178 = 0;
            }
            var20 += arg7;
        }
        return var19;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
    public static void method1950(int arg0) {
        field4458 = null;
        if (arg0 != 1) {
            field4466 = -62;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;IIIII)V")
    public final void method1951(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4462++;
        if (arg1 == null) {
            return;
        }
        this.method1954(arg6, (byte) 105, arg0);
        int var8 = arg1.length();
        int[] var9 = new int[var8];
        for (int var10 = 0; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg5 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method1952(null, arg3, -16777216, arg4 - this.field4457.method1969(-1, arg1) / 2, arg1, null, null, var9);
        if (arg2 > -12) {
            this.field4457 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(CIIIZLma;II)V")
    public abstract void method41(char arg0, int arg1, int arg2, int arg3, boolean arg4, class10 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([IIIILjava/lang/String;[I[Ll;[I)V")
    private final void method1952(int[] arg0, int arg1, int arg2, int arg3, String arg4, int[] arg5, class16[] arg6, int[] arg7) {
        int var9 = arg1 - this.field4457.field4497;
        field4464++;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg4.length();
        if (arg2 != -16777216) {
            this.field4476 = null;
        }
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class215.method1466(true, arg4.charAt(var14)) & 0xFF);
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
                                    if (arg5 == null) {
                                        var17 = 0;
                                    } else {
                                        var17 = arg5[var12];
                                    }
                                    int var18;
                                    if (arg7 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg7[var12];
                                    }
                                    var12++;
                                    int var19 = class56.method521(var16.substring(4), 10);
                                    class16 var20 = arg6[var19];
                                    int var21 = arg0 == null ? var20.method117() : arg0[var19];
                                    var20.method114(arg3 + var17, -var21 + this.field4457.field4497 + var9 - -var18, 1, 0, 1);
                                    var11 = -1;
                                    arg3 += arg6[var19].method125();
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method1955(124, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg3 += this.field4457.method1970((byte) -81, var11, var15);
                    }
                    int var22;
                    if (arg5 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg5[var12];
                    }
                    int var23;
                    if (arg7 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg7[var12];
                    }
                    if (var15 != ' ') {
                        if ((class154.field2190 & 0xFF000000) != 0) {
                            this.method42(var15, arg3 + var22 + 1, var9 - -var23 + 1, class154.field2190, true);
                        }
                        this.method42(var15, arg3 + var22, var9 - -var23, class432.field6355, false);
                    } else if (class153.field2178 > 0) {
                        class420.field6205 += class153.field2178;
                        arg3 += class420.field6205 >> 8;
                        class420.field6205 &= 0xFF;
                    }
                    var12++;
                    int var24 = this.field4457.method1972(22148, var15);
                    if (class99.field1335 != -1) {
                        this.field4476.method316(var24, -127, var9 + ((int) ((double) this.field4457.field4497 * 0.7D)), arg3, class99.field1335);
                    }
                    if (class502.field7441 != -1) {
                        this.field4476.method316(var24, arg2 ^ 0xFFFF83, this.field4457.field4497 + var9, arg3, class502.field7441);
                    }
                    arg3 += var24;
                    var11 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/util/Random;[Ll;I[IILjava/lang/String;IIII)I")
    public final int method1953(Random arg0, class16[] arg1, int arg2, int[] arg3, int arg4, String arg5, int arg6, int arg7, int arg8, int arg9) {
        field4456++;
        if (arg5 == null) {
            return 0;
        }
        arg0.setSeed((long) arg4);
        int var11 = (arg0.nextInt() & 0x1F) + 192;
        this.method1954(arg2 & 0xFFFFFF | var11 << 24, (byte) 11, var11 << 24 | arg7 & 0xFFFFFF);
        int var12 = arg5.length();
        int[] var13 = new int[var12];
        int var14 = 0;
        for (int var15 = arg6; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg0.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        this.method1952(arg3, arg9, -16777216, arg8, arg5, var13, arg1, null);
        return var14;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IBI)V")
    private final void method1954(int arg0, byte arg1, int arg2) {
        class153.field2178 = 0;
        class502.field7441 = -1;
        class420.field6205 = 0;
        class99.field1335 = -1;
        class499.field7407 = arg2;
        class432.field6355 = arg2;
        if (arg0 == -1) {
            arg0 = 0;
        }
        int var4 = 121 % ((arg1 + 48) / 36);
        field4471++;
        class387.field5726 = arg0;
        class154.field2190 = arg0;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;)V")
    private final void method1955(int arg0, String arg1) {
        try {
            int var3 = -48 / ((65 - arg0) / 46);
            if (arg1.startsWith("col=")) {
                class432.field6355 = class432.field6355 & 0xFF000000 | class165.method1171(16, -46, arg1.substring(4)) & 0xFFFFFF;
            } else if (arg1.equals("/col")) {
                class432.field6355 = class499.field7407 & 0xFFFFFF | class432.field6355 & 0xFF000000;
            }
            if (arg1.startsWith("argb=")) {
                class432.field6355 = class165.method1171(16, -56, arg1.substring(5));
            } else if (arg1.equals("/argb")) {
                class432.field6355 = class499.field7407;
            } else if (arg1.startsWith("str=")) {
                class99.field1335 = class165.method1171(16, -54, arg1.substring(4)) | 0xFF000000;
            } else if (arg1.equals("str")) {
                class99.field1335 = -8388608;
            } else if (arg1.equals("/str")) {
                class99.field1335 = -1;
            } else if (arg1.startsWith("u=")) {
                class502.field7441 = class165.method1171(16, -18, arg1.substring(2)) | 0xFF000000;
            } else if (arg1.equals("u")) {
                class502.field7441 = -16777216;
            } else if (arg1.equals("/u")) {
                class502.field7441 = -1;
            } else if (arg1.equalsIgnoreCase("shad=-1")) {
                class154.field2190 = 0;
            } else if (arg1.startsWith("shad=")) {
                class154.field2190 = class165.method1171(16, -29, arg1.substring(5)) | 0xFF000000;
            } else if (arg1.equals("shad")) {
                class154.field2190 = -16777216;
            } else if (arg1.equals("/shad")) {
                class154.field2190 = class387.field5726;
            } else if (arg1.equals("br")) {
                this.method1954(class387.field5726, (byte) 72, class499.field7407);
            }
        } catch (Exception var4) {
        }
        field4477++;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIILjava/lang/String;)V")
    public final void method1956(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5) {
        field4463++;
        if (arg5 != null) {
            this.method1954(arg4, (byte) -87, arg1);
            this.method1962(arg5, arg2, null, 0, null, arg3, false, null, arg0 - this.field4457.method1969(-1, arg5) / 2);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B[II[Ll;ILjava/lang/String;II)V")
    public final void method1957(byte arg0, int[] arg1, int arg2, class16[] arg3, int arg4, String arg5, int arg6, int arg7) {
        field4467++;
        if (arg5 == null) {
            return;
        }
        this.method1954(arg2, (byte) -109, arg4);
        this.method1962(arg5, 0, arg1, 0, arg3, arg7, false, null, arg6);
        if (arg0 >= -97) {
            field4458 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IILjava/lang/String;III)V")
    public final void method1958(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5) {
        field4472++;
        if (arg2 != null) {
            this.method1954(arg0, (byte) 115, arg1);
            this.method1962(arg2, arg5, null, 0, null, arg3, false, null, arg4);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IZLjava/lang/String;III)V")
    public final void method1959(int arg0, boolean arg1, String arg2, int arg3, int arg4, int arg5) {
        field4459++;
        if (arg2 != null) {
            this.method1954(arg0, (byte) -95, arg4);
            this.method1962(arg2, 0, null, 0, null, arg3, arg1, null, arg5 - this.field4457.method1969(-1, arg2));
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;IB)V")
    private final void method1960(String arg0, int arg1, byte arg2) {
        field4465++;
        int var4 = 0;
        if (arg2 >= -15) {
            field4469 = true;
        }
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
        if (var4 > 0) {
            class153.field2178 = (arg1 - this.field4457.method1969(-1, arg0) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II)I")
    public static final int method1961(int arg0, int arg1) {
        field4461++;
        int var2 = 60 / ((arg0 - 51) / 52);
        return arg1 == 16711935 ? -1 : class501.method2999(0, arg1);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;I[II[Ll;IZLma;I)V")
    private final void method1962(String arg0, int arg1, int[] arg2, int arg3, class16[] arg4, int arg5, boolean arg6, class10 arg7, int arg8) {
        int var10 = arg5 - this.field4457.field4497;
        field4473++;
        int var11 = -1;
        int var12 = -1;
        int var13 = arg0.length();
        if (arg6) {
            this.method1960(null, -122, (byte) -82);
        }
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class215.method1466(true, arg0.charAt(var14)) & 0xFF);
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
                                    int var17 = class56.method521(var16.substring(4), 10);
                                    class16 var18 = arg4[var17];
                                    int var19 = arg2 == null ? var18.method117() : arg2[var17];
                                    if ((class432.field6355 & 0xFF000000) == -16777216) {
                                        var18.method114(arg8, var10 + this.field4457.field4497 - var19, 1, 0, 1);
                                    } else {
                                        var18.method114(arg8, this.field4457.field4497 + var10 - var19, 0, class432.field6355 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    var12 = -1;
                                    arg8 += arg4[var17].method125();
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method1955(115, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg8 += this.field4457.method1970((byte) -61, var12, var15);
                    }
                    if (var15 == ' ') {
                        if (class153.field2178 > 0) {
                            class420.field6205 += class153.field2178;
                            arg8 += class420.field6205 >> 8;
                            class420.field6205 &= 0xFF;
                        }
                    } else if (arg7 == null) {
                        if ((class154.field2190 & 0xFF000000) != 0) {
                            this.method42(var15, arg8 + 1, var10 - -1, class154.field2190, true);
                        }
                        this.method42(var15, arg8, var10, class432.field6355, false);
                    } else {
                        if ((class154.field2190 & 0xFF000000) != 0) {
                            this.method41(var15, arg8 + 1, var10 - -1, class154.field2190, true, arg7, arg1, arg3);
                        }
                        this.method41(var15, arg8, var10, class432.field6355, false, arg7, arg1, arg3);
                    }
                    int var20 = this.field4457.method1972(22148, var15);
                    if (class99.field1335 != -1) {
                        this.field4476.method316(var20, -127, (int) ((double) this.field4457.field4497 * 0.7D) + var10, arg8, class99.field1335);
                    }
                    if (class502.field7441 != -1) {
                        this.field4476.method316(var20, -127, this.field4457.field4497 + var10 + 1, arg8, class502.field7441);
                    }
                    arg8 += var20;
                    var12 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II[Ll;IILma;IIIIIIIILjava/lang/String;[I)I")
    public final int method1963(int arg0, int arg1, class16[] arg2, int arg3, int arg4, class10 arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, String arg14, int[] arg15) {
        if (arg9 == 0) {
            field4474++;
            return this.method1949(arg7, arg10, arg12, arg2, arg15, false, arg0, arg8, arg1, arg3, arg13, arg14, arg6, 0, arg5, arg4, arg11);
        } else {
            return -89;
        }
    }

    @OriginalMember(owner = "client!la", name = "OA", descriptor = "(CIIIZ)V")
    public abstract void method42(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lya;Lgt;)V")
    public class314(class38 arg0, class316 arg1) {
        this.field4457 = arg1;
        this.field4476 = arg0;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIILjava/lang/String;IIII)V")
    public final void method1964(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6, int arg7) {
        field4468++;
        if (arg3 == null) {
            return;
        }
        this.method1954(arg0, (byte) 102, arg1);
        double var9 = 7.0D - ((double) arg7 / 8.0D);
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg3.length();
        int[] var12 = new int[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (Math.sin((double) var13 / 1.5D + (double) arg6) * var9);
        }
        int var14 = -128 / ((arg4 - 51) / 62);
        this.method1952(null, arg2, -16777216, arg5 - this.field4457.method1969(-1, arg3) / 2, arg3, null, null, var12);
    }
}
