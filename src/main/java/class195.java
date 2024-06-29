import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public abstract class class195 {

    @OriginalMember(owner = "client!ta", name = "w", descriptor = "Led;")
    private class645 field2358;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "Loa;")
    private class635 field2337;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
    public static int field2336 = 0;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "I")
    public static int field2346;

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!ta", name = "r", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!ta", name = "s", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!ta", name = "t", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!ta", name = "u", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!ta", name = "v", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!ta", name = "x", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "Lcm;")
    public static class664 field2339;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/lang/String;BIIIII)V", line = 9)
    public final void method1115(String arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2338++;
        if (arg0 == null) {
            return;
        }
        this.method1118((byte) 60, arg2, arg5);
        if (arg1 >= -50) {
            field2336 = 15;
        }
        int var8 = arg0.length();
        int[] var9 = new int[var8];
        for (int var10 = 0; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg6 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method1123(arg3, arg0, var9, false, null, arg4 - (this.field2358.method3622(62, arg0) / 2), null, null);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/lang/String;Z)V", line = 36)
    private final void method1116(String arg0, boolean arg1) {
        if (!arg1) {
            method1126(39, 26, 69, -12);
        }
        try {
            if (arg0.startsWith("col=")) {
                class32.field364 = class32.field364 & 0xFF000000 | class107.method673(-1, arg0.substring(4), 16) & 0xFFFFFF;
            } else if (arg0.equals("/col")) {
                class32.field364 = class319.field4128 & 0xFFFFFF | class32.field364 & 0xFF000000;
            }
            if (arg0.startsWith("argb=")) {
                class32.field364 = class107.method673(-1, arg0.substring(5), 16);
            } else if (arg0.equals("/argb")) {
                class32.field364 = class319.field4128;
            } else if (arg0.startsWith("str=")) {
                class80.field848 = class32.field364 & 0xFF000000 | class107.method673(-1, arg0.substring(4), 16);
            } else if (arg0.equals("str")) {
                class80.field848 = class32.field364 & 0xFF000000 | 0x800000;
            } else if (arg0.equals("/str")) {
                class80.field848 = -1;
            } else if (arg0.startsWith("u=")) {
                class470.field6562 = class32.field364 & 0xFF000000 | class107.method673(-1, arg0.substring(2), 16);
            } else if (arg0.equals("u")) {
                class470.field6562 = class32.field364 & 0xFF000000;
            } else if (arg0.equals("/u")) {
                class470.field6562 = -1;
            } else if (arg0.equalsIgnoreCase("shad=-1")) {
                class471.field6580 = 0;
            } else if (arg0.startsWith("shad=")) {
                class471.field6580 = class32.field364 & 0xFF000000 | class107.method673(-1, arg0.substring(5), 16);
            } else if (arg0.equals("shad")) {
                class471.field6580 = class32.field364 & 0xFF000000;
            } else if (arg0.equals("/shad")) {
                class471.field6580 = class431.field5696;
            } else if (arg0.equals("br")) {
                this.method1118((byte) 60, class431.field5696, class319.field4128);
            }
        } catch (Exception var3) {
        }
        field2342++;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([Lxa;B[ILjava/lang/String;Ljava/util/Random;IIIII)I", line = 110)
    public final int method1117(class458[] arg0, byte arg1, int[] arg2, String arg3, Random arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2347++;
        if (arg3 == null) {
            return 0;
        }
        arg4.setSeed((long) arg9);
        int var11 = (arg4.nextInt() & 0x1F) + 192;
        if (arg1 >= -51) {
            this.method1120(37, null, -76, null, -64, 113, 97, 98, null, -17, -28, null, -125, null, -128);
        }
        this.method1118((byte) 60, var11 << 24 | arg8 & 0xFFFFFF, var11 << 24 | arg6 & 0xFFFFFF);
        int var12 = arg3.length();
        int[] var13 = new int[var12];
        int var14 = 0;
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg4.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        this.method1123(arg5, arg3, null, false, var13, arg7, arg2, arg0);
        return var14;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BII)V", line = 149)
    private final void method1118(byte arg0, int arg1, int arg2) {
        field2351++;
        class504.field7260 = 0;
        if (arg1 == -1) {
            arg1 = 0;
        }
        class80.field848 = -1;
        class470.field6562 = -1;
        if (arg0 != 60) {
            this.field2337 = null;
        }
        class319.field4128 = arg2;
        class32.field364 = arg2;
        class166.field1997 = 0;
        class431.field5696 = arg1;
        class471.field6580 = arg1;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILjava/lang/String;ILfa;I[Lxa;II[I)V", line = 176)
    private final void method1119(int arg0, String arg1, int arg2, class213 arg3, int arg4, class458[] arg5, int arg6, int arg7, int[] arg8) {
        int var10 = arg2 - this.field2358.field9128;
        field2353++;
        if (arg4 != 15946) {
            field2336 = -115;
        }
        int var11 = -1;
        int var12 = -1;
        int var13 = arg1.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class289.method1637(arg1.charAt(var14), (byte) -128) & 0xFF);
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
                                    int var17 = class399.method2185(var16.substring(4), (byte) -34);
                                    class458 var18 = arg5[var17];
                                    int var19 = arg8 == null ? var18.method408() : arg8[var17];
                                    if ((class32.field364 & 0xFF000000) == -16777216) {
                                        var18.method416(arg0, var10 - (var19 - this.field2358.field9128), 1, 0, 1);
                                    } else {
                                        var18.method416(arg0, var10 + this.field2358.field9128 - var19, 0, class32.field364 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    var12 = -1;
                                    arg0 += arg5[var17].method418();
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method1116(var16, true);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg0 += this.field2358.method3626(var12, var15, (byte) 51);
                    }
                    if (var15 == ' ') {
                        if (class504.field7260 > 0) {
                            class166.field1997 += class504.field7260;
                            arg0 += class166.field1997 >> 8;
                            class166.field1997 &= 0xFF;
                        }
                    } else if (arg3 == null) {
                        if ((class471.field6580 & 0xFF000000) != 0) {
                            this.method13(var15, arg0 + 1, var10 + 1, class471.field6580, true);
                        }
                        this.method13(var15, arg0, var10, class32.field364, false);
                    } else {
                        if ((class471.field6580 & 0xFF000000) != 0) {
                            this.method17(var15, arg0 + 1, var10 - -1, class471.field6580, true, arg3, arg7, arg6);
                        }
                        this.method17(var15, arg0, var10, class32.field364, false, arg3, arg7, arg6);
                    }
                    int var20 = this.field2358.method3619(arg4 ^ 0x3EB5, var15);
                    if (class80.field848 != -1) {
                        this.field2337.method3549(class80.field848, var20, (int) ((double) this.field2358.field9128 * 0.7D) + var10, arg0, (byte) 54);
                    }
                    if (class470.field6562 != -1) {
                        this.field2337.method3549(class470.field6562, var20, var10 + this.field2358.field9128 + 1, arg0, (byte) 54);
                    }
                    arg0 += var20;
                    var12 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILjava/lang/String;I[Lxa;IIII[IIILjava/util/Random;I[II)I", line = 330)
    public final int method1120(int arg0, String arg1, int arg2, class458[] arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9, int arg10, Random arg11, int arg12, int[] arg13, int arg14) {
        field2341++;
        if (arg1 == null) {
            return 0;
        }
        arg11.setSeed((long) arg10);
        int var16 = (arg11.nextInt() & 0x1F) + 192;
        this.method1118((byte) 60, arg4 & 0xFFFFFF | var16 << 24, var16 << 24 | arg7 & 0xFFFFFF);
        int var17 = arg1.length();
        if (arg0 < 30) {
            this.field2358 = null;
        }
        int[] var18 = new int[var17];
        int var19 = 0;
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg11.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        int var21 = arg9;
        int var22 = arg2 + this.field2358.field9130;
        int var23 = -1;
        if (arg12 == 1) {
            var22 += (arg5 - this.field2358.field9130 - this.field2358.field9123) / 2;
        } else if (arg12 == 2) {
            var22 = arg2 + arg5 - this.field2358.field9123;
        }
        if (arg14 == 1) {
            var23 = var19 + this.field2358.method3622(62, arg1);
            var21 = (arg6 - var23) / 2 + arg9;
        } else if (arg14 == 2) {
            var23 = var19 + this.field2358.method3622(62, arg1);
            var21 = arg6 + arg9 - var23;
        }
        this.method1123(var22, arg1, null, false, var18, var21, arg8, arg3);
        if (arg13 != null) {
            if (var23 == -1) {
                var23 = var19 + this.field2358.method3622(62, arg1);
            }
            arg13[1] = var22 - this.field2358.field9130;
            arg13[0] = var21;
            arg13[3] = this.field2358.field9130 + this.field2358.field9123;
            arg13[2] = var23;
        }
        return var19;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I[II[Lxa;IIILfa;IIILjava/lang/String;IIIII)I", line = 408)
    public final int method1121(int arg0, int[] arg1, int arg2, class458[] arg3, int arg4, int arg5, int arg6, class213 arg7, int arg8, int arg9, int arg10, String arg11, int arg12, int arg13, int arg14, int arg15, int arg16) {
        if (arg16 != 2) {
            return 92;
        }
        field2340++;
        if (arg11 == null) {
            return 0;
        }
        this.method1118((byte) 60, arg13, arg10);
        if (arg5 == 0) {
            arg5 = this.field2358.field9128;
        }
        int[] var18;
        if (this.field2358.field9130 + this.field2358.field9123 + arg5 > arg9 && arg5 + arg5 > arg9) {
            var18 = null;
        } else {
            var18 = new int[] { arg15 };
        }
        int var19 = this.field2358.method3621(arg11, arg3, 1, class354.field4653, var18);
        if (arg6 == -1) {
            arg6 = arg9 / arg5;
            if (arg6 <= 0) {
                arg6 = 1;
            }
        }
        if (arg6 > 0 && var19 >= arg6) {
            var19 = arg6;
            class354.field4653[arg6 - 1] = this.field2358.method3616(0, arg3, class354.field4653[arg6 - 1], arg15);
        }
        if (arg4 == 3 && var19 == 1) {
            arg4 = 1;
        }
        int var20;
        if (arg4 == 0) {
            var20 = this.field2358.field9130 + arg12;
        } else if (arg4 == 1) {
            var20 = (arg9 - this.field2358.field9123 - ((var19 + -1) * arg5) - this.field2358.field9130) / 2 + this.field2358.field9130 + arg12;
        } else if (arg4 == 2) {
            var20 = arg12 + arg9 - ((var19 - 1) * arg5) - this.field2358.field9123;
        } else {
            int var21 = ((arg9 - this.field2358.field9130) - this.field2358.field9123 - (var19 - 1) * arg5) / (var19 + 1);
            if (var21 < 0) {
                var21 = 0;
            }
            var20 = arg12 - (-this.field2358.field9130 - var21);
            arg5 += var21;
        }
        for (int var22 = 0; var22 < var19; var22++) {
            if (arg8 == 0) {
                this.method1119(arg14, class354.field4653[var22], var20, arg7, 15946, arg3, arg0, arg2, arg1);
            } else if (arg8 == 1) {
                this.method1119((arg15 - this.field2358.method3622(62, class354.field4653[var22])) / 2 + arg14, class354.field4653[var22], var20, arg7, 15946, arg3, arg0, arg2, arg1);
            } else if (arg8 == 2) {
                this.method1119(arg15 + arg14 - this.field2358.method3622(62, class354.field4653[var22]), class354.field4653[var22], var20, arg7, arg16 + 15944, arg3, arg0, arg2, arg1);
            } else if ((var19 - 1) == var22) {
                this.method1119(arg14, class354.field4653[var22], var20, arg7, 15946, arg3, arg0, arg2, arg1);
            } else {
                this.method1122(arg16 ^ 0xFFFFFFC1, class354.field4653[var22], arg15);
                this.method1119(arg14, class354.field4653[var22], var20, arg7, 15946, arg3, arg0, arg2, arg1);
                class504.field7260 = 0;
            }
            var20 += arg5;
        }
        return var19;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 506)
    private final void method1122(int arg0, String arg1, int arg2) {
        field2352++;
        int var4 = 0;
        boolean var5 = false;
        int var6 = 0;
        if (arg0 != -61) {
            field2336 = 67;
        }
        while (arg1.length() > var6) {
            char var7 = arg1.charAt(var6);
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
            class504.field7260 = (arg2 - this.field2358.method3622(62, arg1) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILjava/lang/String;[IZ[II[I[Lxa;)V", line = 547)
    private final void method1123(int arg0, String arg1, int[] arg2, boolean arg3, int[] arg4, int arg5, int[] arg6, class458[] arg7) {
        int var9 = arg0 - this.field2358.field9128;
        if (arg3) {
            this.field2358 = null;
        }
        field2354++;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg1.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class289.method1637(arg1.charAt(var14), (byte) -128) & 0xFF);
            if (var15 == '<') {
                var10 = var14;
            } else {
                if (var15 == '>' && var10 != -1) {
                    String var16 = arg1.substring(var10 + 1, var14);
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
                                    if (arg2 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg2[var12];
                                    }
                                    var12++;
                                    int var19 = class399.method2185(var16.substring(4), (byte) -34);
                                    class458 var20 = arg7[var19];
                                    int var21 = arg6 == null ? var20.method408() : arg6[var19];
                                    var20.method416(arg5 + var17, this.field2358.field9128 + var9 + -var21 + var18, 1, 0, 1);
                                    var11 = -1;
                                    arg5 += arg7[var19].method418();
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method1116(var16, true);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg5 += this.field2358.method3626(var11, var15, (byte) 68);
                    }
                    int var22;
                    if (arg4 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg4[var12];
                    }
                    int var23;
                    if (arg2 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg2[var12];
                    }
                    var12++;
                    if (var15 != ' ') {
                        if ((class471.field6580 & 0xFF000000) != 0) {
                            this.method13(var15, var22 + arg5 + 1, var9 + 1 + var23, class471.field6580, true);
                        }
                        this.method13(var15, arg5 + var22, var9 + var23, class32.field364, false);
                    } else if (class504.field7260 > 0) {
                        class166.field1997 += class504.field7260;
                        arg5 += class166.field1997 >> 8;
                        class166.field1997 &= 0xFF;
                    }
                    int var24 = this.field2358.method3619(255, var15);
                    if (class80.field848 != -1) {
                        this.field2337.method3549(class80.field848, var24, var9 + ((int) ((double) this.field2358.field9128 * 0.7D)), arg5, (byte) 54);
                    }
                    if (class470.field6562 != -1) {
                        this.field2337.method3549(class470.field6562, var24, this.field2358.field9128 + var9, arg5, (byte) 54);
                    }
                    var11 = var15;
                    arg5 += var24;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILjava/lang/String;IIII)V", line = 712)
    public final void method1124(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        field2344++;
        if (arg1 != null) {
            this.method1118((byte) 60, arg3, arg2);
            this.method1119(arg4, arg1, arg5, null, 15946, null, arg0, 0, null);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V", line = 727)
    public static final void method1125(int arg0) {
        class145.field1625 = 0;
        field2350++;
        class530.field7597.method3170((byte) 61);
        class215.field2615 = false;
        if (arg0 != -15444) {
            method1125(60);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIII)V", line = 740)
    public static final void method1126(int arg0, int arg1, int arg2, int arg3) {
        field2357++;
        if (arg1 == 26735) {
            String var4 = "tele " + arg0 + "," + (arg2 >> 6) + "," + (arg3 >> 6) + "," + (arg2 & 0x3F) + "," + (arg3 & 0x3F);
            System.out.println(var4);
            class332.method1866(false, true, (byte) 123, var4);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIILfa;IIIIIIILjava/lang/String;I[Lxa;Z[I)I", line = 755)
    public final int method1127(int arg0, int arg1, int arg2, class213 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, String arg11, int arg12, class458[] arg13, boolean arg14, int[] arg15) {
        field2348++;
        if (!arg14) {
            field2336 = 102;
        }
        return this.method1121(arg4, arg15, arg0, arg13, arg10, arg5, 0, arg3, arg7, arg6, arg9, arg11, arg1, arg2, arg8, arg12, 2);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIILjava/lang/String;II)V", line = 767)
    public final void method1128(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5) {
        field2349++;
        if (arg3 != null) {
            this.method1118((byte) 60, arg5, arg4);
            if (arg0 == 215) {
                this.method1119(arg1 - this.field2358.method3622(62, arg3) / 2, arg3, arg2, null, arg0 + 15731, null, 0, 0, null);
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IILjava/lang/String;BII)V", line = 783)
    public final void method1129(int arg0, int arg1, String arg2, byte arg3, int arg4, int arg5) {
        field2356++;
        if (arg2 != null && arg3 >= 123) {
            this.method1118((byte) 60, arg1, arg4);
            this.method1119(arg0 - this.field2358.method3622(62, arg2), arg2, arg5, null, 15946, null, 0, 0, null);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIIIII)V", line = 799)
    public static final void method1130(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2359++;
        int var8 = arg3 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = (class184.field2242 - class559.field7964) * var8 / 100 + class559.field7964;
        int var10 = arg5 * var9 >> 8;
        int var11 = 16384 - arg7 & 0x3FFF;
        int var12 = 16384 - arg6 & 0x3FFF;
        if (arg2 != -25130) {
            method1130(59, 84, -93, 62, 93, -3, 68, -26);
        }
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class285.field3655[var11] * -var10 >> 14;
            var15 = class285.field3656[var11] * var10 >> 14;
        }
        if (var12 != 0) {
            var13 = class285.field3655[var12] * var15 >> 14;
            var15 = class285.field3656[var12] * var15 >> 14;
        }
        class654.field9344 = arg7;
        class345.field4493 = arg4 - var13;
        class352.field4616 = 0;
        class150.field1707 = arg1 - var14;
        class662.field9411 = arg0 - var15;
        class587.field8342 = arg6;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIILoa;)V", line = 852)
    public static final void method1131(int arg0, int arg1, int arg2, class635 arg3) {
        if (arg0 != 16624) {
            method1130(69, 89, -72, -89, -15, -7, 116, 38);
        }
        field2355++;
        class337.field4413 = new class515[arg2][arg1];
        class14.field135 = arg3;
        if (class380.field4938 != null) {
            class205.field2503 = class110.method683(class380.field4938[2], class380.field4938[3], class380.field4938[4], class380.field4938[0], class380.field4938[5], class380.field4938[1], (byte) 30);
        }
        class587.field8341 = new class515();
        class135.method753(arg0 ^ 0xFFFFFD88);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIILjava/lang/String;I)V", line = 871)
    public final void method1132(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, int arg6) {
        field2346++;
        if (arg5 == null) {
            return;
        }
        this.method1118((byte) 60, arg2, arg3);
        int var8 = arg5.length();
        if (arg0 > -80) {
            method1131(63, -70, -1, null);
        }
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg6 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg6 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method1123(arg4, arg5, var10, false, var9, arg1 - (this.field2358.method3622(62, arg5) / 2), null, null);
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)V", line = 902)
    public static void method1133(int arg0) {
        field2339 = null;
        if (arg0 != -1) {
            method1125(-127);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIILjava/lang/String;IIII)V", line = 916)
    public final void method1134(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6, int arg7) {
        field2345++;
        if (arg3 == null) {
            return;
        }
        this.method1118((byte) 60, arg2, arg4);
        double var9 = 7.0D - (double) arg6 / 8.0D;
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg3.length();
        int[] var12 = new int[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (var9 * Math.sin((double) var13 / 1.5D + (double) arg1));
        }
        if (arg5 <= 115) {
            this.field2358 = null;
        }
        this.method1123(arg0, arg3, var12, false, null, arg7 - (this.field2358.method3622(62, arg3) / 2), null, null);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([Lxa;IIILjava/lang/String;[III)V", line = 948)
    public final void method1135(class458[] arg0, int arg1, int arg2, int arg3, String arg4, int[] arg5, int arg6, int arg7) {
        field2343++;
        if (arg6 != -18190) {
            this.field2337 = null;
        }
        if (arg4 != null) {
            this.method1118((byte) 60, arg3, arg1);
            this.method1119(arg2, arg4, arg7, null, 15946, arg0, 0, 0, arg5);
        }
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Loa;Led;)V", line = 971)
    public class195(class635 arg0, class645 arg1) {
        this.field2358 = arg1;
        this.field2337 = arg0;
    }

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "(CIIIZ)V")
    public abstract void method13(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(CIIIZLfa;II)V")
    public abstract void method17(char arg0, int arg1, int arg2, int arg3, boolean arg4, class213 arg5, int arg6, int arg7);
}
