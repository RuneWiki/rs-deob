import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public abstract class class61 {

    @OriginalMember(owner = "client!da", name = "d", descriptor = "Lha;")
    private class60 field849;

    @OriginalMember(owner = "client!da", name = "z", descriptor = "Ljl;")
    private class274 field871;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "[I")
    public static int[] field851 = new int[200];

    @OriginalMember(owner = "client!da", name = "u", descriptor = "F")
    public static float field866;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public static int field852;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "I")
    public static int field855;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "I")
    public static int field856;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!da", name = "r", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!da", name = "s", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!da", name = "t", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!da", name = "v", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!da", name = "w", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!da", name = "x", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!da", name = "y", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([I[IIIIILjava/lang/String;[Liea;Ljava/util/Random;IIIIZI)I", line = 4)
    public final int method554(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, String arg6, class481[] arg7, Random arg8, int arg9, int arg10, int arg11, int arg12, boolean arg13, int arg14) {
        field852++;
        if (arg6 == null) {
            return 0;
        }
        arg8.setSeed((long) arg4);
        int var16 = (arg8.nextInt() & 0x1F) + 192;
        this.method561(arg12 & 0xFFFFFF | var16 << 24, var16 << 24 | arg14 & 0xFFFFFF, (byte) -78);
        int var17 = arg6.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg8.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        int var21 = arg3;
        int var22 = arg9 + this.field871.field3432;
        if (arg2 == 1) {
            var22 += (arg5 - this.field871.field3432 - this.field871.field3434) / 2;
        } else if (arg2 == 2) {
            var22 = arg9 + arg5 - this.field871.field3434;
        }
        int var23 = -1;
        if (arg10 == 1) {
            var23 = var19 + this.field871.method1619(false, arg6);
            var21 = (arg11 - var23) / 2 + arg3;
        } else if (arg10 == 2) {
            var23 = this.field871.method1619(!arg13, arg6) + var19;
            var21 = arg11 + arg3 - var23;
        }
        if (!arg13) {
            return 69;
        }
        this.method565(arg7, var22, null, 0, arg1, arg6, var21, var18);
        if (arg0 != null) {
            if (var23 == -1) {
                var23 = var19 + this.field871.method1619(false, arg6);
            }
            arg0[3] = this.field871.field3432 + this.field871.field3434;
            arg0[1] = var22 - this.field871.field3432;
            arg0[0] = var21;
            arg0[2] = var23;
        }
        return var19;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;IIII)V", line = 83)
    public final void method555(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        field855++;
        if (arg1 != null) {
            this.method561(arg0, arg3, (byte) 121);
            this.method560(arg1, arg2, null, 87, 0, arg5, null, arg4, null);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(III)Z", line = 95)
    public static final boolean method556(int arg0, int arg1, int arg2) {
        int var3 = -59 / ((53 - arg1) / 50);
        field856++;
        return (arg2 & 0x70000) != 0 | class356.method2068(arg2, (byte) -27, arg0) || class92.method736(-127, arg2, arg0);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 111)
    private final void method557(int arg0, String arg1, int arg2) {
        field859++;
        int var4 = 0;
        boolean var5 = false;
        for (int var6 = 0; var6 < arg1.length(); var6++) {
            char var8 = arg1.charAt(var6);
            if (var8 == '<') {
                var5 = true;
            } else if (var8 == '>') {
                var5 = false;
            } else if (!var5 && var8 == ' ') {
                var4++;
            }
        }
        int var7 = 65 % ((arg2 + 2) / 40);
        if (var4 > 0) {
            class96.field1337 = (arg0 - this.field871.method1619(false, arg1) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(III)V", line = 149)
    public static final void method558(int arg0, int arg1, int arg2) {
        field862++;
        if (arg1 != 27146) {
            field847 = -118;
        }
        class37 var3 = class636.method3571(12, arg0, -89);
        var3.method232(-3);
        var3.field579 = arg2;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IBLjava/lang/String;III)V", line = 164)
    public final void method559(int arg0, byte arg1, String arg2, int arg3, int arg4, int arg5) {
        field867++;
        if (arg2 == null) {
            return;
        }
        this.method561(arg0, arg4, (byte) -47);
        this.method560(arg2, 0, null, 63, 0, arg5, null, arg3 - this.field871.method1619(false, arg2), null);
        if (arg1 >= -69) {
            field861 = 77;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;I[IIII[Liea;ILaa;)V", line = 181)
    private final void method560(String arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, class481[] arg6, int arg7, class489 arg8) {
        int var10 = arg5 - this.field871.field3444;
        if (arg3 <= 49) {
            this.field849 = null;
        }
        field853++;
        int var11 = -1;
        int var12 = -1;
        int var13 = arg0.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class518.method3007(true, arg0.charAt(var14)) & 0xFF);
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
                                    int var17 = class160.method1124(var16.substring(4), 125);
                                    class481 var18 = arg6[var17];
                                    int var19 = arg2 == null ? var18.method149() : arg2[var17];
                                    if ((class82.field1126 & 0xFF000000) == -16777216) {
                                        var18.method148(arg7, var10 + this.field871.field3444 - var19, 1, 0, 1);
                                    } else {
                                        var18.method148(arg7, this.field871.field3444 + var10 - var19, 0, class82.field1126 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    arg7 += arg6[var17].method142();
                                    var12 = -1;
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method571(107, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg7 += this.field871.method1615(-80, var12, var15);
                    }
                    if (var15 == ' ') {
                        if (class96.field1337 > 0) {
                            class54.field754 += class96.field1337;
                            arg7 += class54.field754 >> 8;
                            class54.field754 &= 0xFF;
                        }
                    } else if (arg8 == null) {
                        if ((class38.field587 & 0xFF000000) != 0) {
                            this.method121(var15, arg7 + 1, var10 + 1, class38.field587, true);
                        }
                        this.method121(var15, arg7, var10, class82.field1126, false);
                    } else {
                        if ((class38.field587 & 0xFF000000) != 0) {
                            this.method120(var15, arg7 + 1, var10 + 1, class38.field587, true, arg8, arg1, arg4);
                        }
                        this.method120(var15, arg7, var10, class82.field1126, false, arg8, arg1, arg4);
                    }
                    int var20 = this.field871.method1623(var15, true);
                    if (class500.field7063 != -1) {
                        this.field849.method439((int) ((double) this.field871.field3444 * 0.7D) + var10, arg7, var20, true, class500.field7063);
                    }
                    if (class309.field4072 != -1) {
                        this.field849.method439(this.field871.field3444 + var10 + 1, arg7, var20, true, class309.field4072);
                    }
                    arg7 += var20;
                    var12 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIB)V", line = 331)
    private final void method561(int arg0, int arg1, byte arg2) {
        class556.field7743 = arg0;
        class82.field1126 = arg0;
        class309.field4072 = -1;
        int var4 = -98 % ((arg2 - 41) / 34);
        if (arg1 == -1) {
            arg1 = 0;
        }
        class96.field1337 = 0;
        class500.field7063 = -1;
        field858++;
        class54.field754 = 0;
        class534.field7402 = arg1;
        class38.field587 = arg1;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIB[ILjava/lang/String;[Liea;I)V", line = 350)
    public final void method562(int arg0, int arg1, int arg2, byte arg3, int[] arg4, String arg5, class481[] arg6, int arg7) {
        field857++;
        if (arg3 >= -53) {
            this.method569(-116, -48, 60, 2, null, -61, -86, -119);
        }
        if (arg5 != null) {
            this.method561(arg2, arg7, (byte) -126);
            this.method560(arg5, 0, arg4, 80, 0, arg0, arg6, arg1, null);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIILjava/lang/String;)V", line = 369)
    public final void method563(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5) {
        int var7 = 126 % ((-arg2 - 63) / 44);
        field848++;
        if (arg5 != null) {
            this.method561(arg3, arg1, (byte) 81);
            this.method560(arg5, 0, null, 91, 0, arg4, null, arg0 - (this.field871.method1619(false, arg5) / 2), null);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I[I[Liea;IIIIILaa;IIIIIILjava/lang/String;I)I", line = 384)
    public final int method564(int arg0, int[] arg1, class481[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class489 arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, String arg15, int arg16) {
        if (arg6 >= -113) {
            field866 = -1.2443544F;
        }
        field860++;
        if (arg15 == null) {
            return 0;
        }
        this.method561(arg11, arg7, (byte) 79);
        if (arg0 == 0) {
            arg0 = this.field871.field3444;
        }
        int[] var18;
        if (this.field871.field3434 + this.field871.field3432 + arg0 > arg12 && arg0 + arg0 > arg12) {
            var18 = null;
        } else {
            var18 = new int[] { arg13 };
        }
        int var19 = this.field871.method1624(arg15, class455.field6074, false, var18, arg2);
        if (arg5 == -1) {
            arg5 = arg12 / arg0;
            if (arg5 <= 0) {
                arg5 = 1;
            }
        }
        if (arg5 > 0 && arg5 <= var19) {
            class455.field6074[arg5 - 1] = this.field871.method1617(arg13, class455.field6074[arg5 - 1], (byte) 121, arg2);
            var19 = arg5;
        }
        if (arg4 == 3 && var19 == 1) {
            arg4 = 1;
        }
        int var20;
        if (arg4 == 0) {
            var20 = this.field871.field3432 + arg16;
        } else if (arg4 == 1) {
            var20 = (arg12 - this.field871.field3432 - ((var19 + -1) * arg0) - this.field871.field3434) / 2 + this.field871.field3432 + arg16;
        } else if (arg4 == 2) {
            var20 = arg16 - ((var19 - 1) * arg0) - (-arg12 - -this.field871.field3434);
        } else {
            int var21 = (arg12 - this.field871.field3432 - this.field871.field3434 - ((var19 + -1) * arg0)) / (var19 + 1);
            if (var21 < 0) {
                var21 = 0;
            }
            arg0 += var21;
            var20 = this.field871.field3432 + var21 + arg16;
        }
        for (int var22 = 0; var22 < var19; var22++) {
            if (arg14 == 0) {
                this.method560(class455.field6074[var22], arg9, arg1, 56, arg3, var20, arg2, arg10, arg8);
            } else if (arg14 == 1) {
                this.method560(class455.field6074[var22], arg9, arg1, 95, arg3, var20, arg2, arg10 + (arg13 - this.field871.method1619(false, class455.field6074[var22])) / 2, arg8);
            } else if (arg14 == 2) {
                this.method560(class455.field6074[var22], arg9, arg1, 64, arg3, var20, arg2, arg13 + arg10 - this.field871.method1619(false, class455.field6074[var22]), arg8);
            } else if (var19 - 1 == var22) {
                this.method560(class455.field6074[var22], arg9, arg1, 77, arg3, var20, arg2, arg10, arg8);
            } else {
                this.method557(arg13, class455.field6074[var22], 86);
                this.method560(class455.field6074[var22], arg9, arg1, 114, arg3, var20, arg2, arg10, arg8);
                class96.field1337 = 0;
            }
            var20 += arg0;
        }
        return var19;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([Liea;I[II[ILjava/lang/String;I[I)V", line = 493)
    private final void method565(class481[] arg0, int arg1, int[] arg2, int arg3, int[] arg4, String arg5, int arg6, int[] arg7) {
        int var9 = arg1 - this.field871.field3444;
        field865++;
        int var10 = -1;
        int var11 = -1;
        int var12 = arg3;
        int var13 = arg5.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class518.method3007(true, arg5.charAt(var14)) & 0xFF);
            if (var15 == '<') {
                var10 = var14;
            } else {
                if (var15 == '>' && var10 != -1) {
                    String var16 = arg5.substring(var10 + 1, var14);
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
                                    if (arg2 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg2[var12];
                                    }
                                    var12++;
                                    int var19 = class160.method1124(var16.substring(4), 122);
                                    class481 var20 = arg0[var19];
                                    int var21 = arg4 == null ? var20.method149() : arg4[var19];
                                    var20.method148(arg6 + var17, -var21 - -var18 + this.field871.field3444 + var9, 1, 0, 1);
                                    arg6 += arg0[var19].method142();
                                    var11 = -1;
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method571(82, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg6 += this.field871.method1615(-120, var11, var15);
                    }
                    int var22;
                    if (arg7 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg7[var12];
                    }
                    int var23;
                    if (arg2 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg2[var12];
                    }
                    var12++;
                    if (var15 != ' ') {
                        if ((class38.field587 & 0xFF000000) != 0) {
                            this.method121(var15, arg6 - (-var22 - 1), var9 + 1 + var23, class38.field587, true);
                        }
                        this.method121(var15, arg6 + var22, var9 + var23, class82.field1126, false);
                    } else if (class96.field1337 > 0) {
                        class54.field754 += class96.field1337;
                        arg6 += class54.field754 >> 8;
                        class54.field754 &= 0xFF;
                    }
                    int var24 = this.field871.method1623(var15, true);
                    if (class500.field7063 != -1) {
                        this.field849.method439((int) ((double) this.field871.field3444 * 0.7D) + var9, arg6, var24, true, class500.field7063);
                    }
                    if (class309.field4072 != -1) {
                        this.field849.method439(this.field871.field3444 + var9, arg6, var24, true, class309.field4072);
                    }
                    arg6 += var24;
                    var11 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIII[IIIIIILaa;Ljava/lang/String;[Liea;)I", line = 660)
    public final int method566(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class489 arg13, String arg14, class481[] arg15) {
        if (arg8 == 13518) {
            field868++;
            return this.method564(arg11, arg7, arg15, arg5, arg6, 0, -116, arg10, arg13, arg12, arg3, arg2, arg9, arg4, arg0, arg14, arg1);
        } else {
            return -2;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIILjava/lang/String;I)V", line = 671)
    public final void method567(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, int arg6) {
        field870++;
        if (arg5 == null) {
            return;
        }
        this.method561(arg2, arg0, (byte) 103);
        int var8 = arg5.length();
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        int var11 = 0;
        if (arg6 >= -11) {
            field847 = 113;
        }
        while (var11 < var8) {
            var9[var11] = (int) (Math.sin((double) arg3 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg3 / 5.0D + (double) var11 / 3.0D) * 5.0D);
            var11++;
        }
        this.method565(null, arg1, var10, 0, null, arg5, arg4 - (this.field871.method1619(false, arg5) / 2), var9);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([ILjava/lang/String;III[Liea;Ljava/util/Random;III)I", line = 705)
    public final int method568(int[] arg0, String arg1, int arg2, int arg3, int arg4, class481[] arg5, Random arg6, int arg7, int arg8, int arg9) {
        field869++;
        if (arg1 == null) {
            return 0;
        }
        arg6.setSeed((long) arg7);
        if (arg3 != -26879) {
            return -87;
        }
        int var11 = (arg6.nextInt() & 0x1F) + 192;
        this.method561(var11 << 24 | arg4 & 0xFFFFFF, arg8 & 0xFFFFFF | var11 << 24, (byte) 105);
        int var12 = arg1.length();
        int[] var13 = new int[var12];
        int var14 = 0;
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg6.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        this.method565(arg5, arg2, null, 0, arg0, arg1, arg9, var13);
        return var14;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIILjava/lang/String;III)V", line = 744)
    public final void method569(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5, int arg6, int arg7) {
        field864++;
        if (arg4 == null) {
            return;
        }
        this.method561(arg1, arg3, (byte) 75);
        double var9 = 7.0D - (double) arg5 / 8.0D;
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg4.length();
        if (arg2 != -6525) {
            this.method566(-24, 49, 52, -2, -95, 64, 14, null, -5, 18, 92, -36, -102, null, null, null);
        }
        int[] var12 = new int[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (Math.sin((double) var13 / 1.5D + (double) arg6) * var9);
        }
        this.method565(null, arg0, var12, arg2 + 6525, null, arg4, arg7 - (this.field871.method1619(false, arg4) / 2), null);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IBIIII)V", line = 779)
    public static final void method570(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field850++;
        int var6 = arg0 - arg5;
        int var7 = arg3 - arg2;
        if (arg1 > -54) {
            field851 = null;
        }
        if (var7 == 0) {
            if (var6 != 0) {
                class108.method872(arg2, true, arg4, arg0, arg5);
            }
        } else if (var6 == 0) {
            class694.method3889(arg3, arg5, arg2, -457000927, arg4);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var6 > var7;
            if (var8) {
                int var9 = arg2;
                int var10 = arg3;
                arg2 = arg5;
                arg5 = var9;
                arg3 = arg0;
                arg0 = var10;
            }
            if (arg2 > arg3) {
                int var11 = arg2;
                arg2 = arg3;
                int var12 = arg5;
                arg5 = arg0;
                arg3 = var11;
                arg0 = var12;
            }
            int var13 = arg5;
            int var14 = arg3 - arg2;
            int var15 = arg0 - arg5;
            int var16 = -(var14 >> 1);
            int var17 = arg0 > arg5 ? 1 : -1;
            if (var15 < 0) {
                var15 = -var15;
            }
            if (var8) {
                for (int var18 = arg2; var18 <= arg3; var18++) {
                    class432.field5765[var18][var13] = arg4;
                    var16 += var15;
                    if (var16 > 0) {
                        var16 -= var14;
                        var13 += var17;
                    }
                }
            } else {
                for (int var19 = arg2; var19 <= arg3; var19++) {
                    var16 += var15;
                    class432.field5765[var13][var19] = arg4;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var14;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;)V", line = 899)
    private final void method571(int arg0, String arg1) {
        if (arg0 <= 54) {
            return;
        }
        try {
            if (arg1.startsWith("col=")) {
                class82.field1126 = class82.field1126 & 0xFF000000 | class455.method2551(arg1.substring(4), (byte) -35, 16) & 0xFFFFFF;
            } else if (arg1.equals("/col")) {
                class82.field1126 = class82.field1126 & 0xFF000000 | class556.field7743 & 0xFFFFFF;
            }
            if (arg1.startsWith("argb=")) {
                class82.field1126 = class455.method2551(arg1.substring(5), (byte) -35, 16);
            } else if (arg1.equals("/argb")) {
                class82.field1126 = class556.field7743;
            } else if (arg1.startsWith("str=")) {
                class500.field7063 = class82.field1126 & 0xFF000000 | class455.method2551(arg1.substring(4), (byte) -35, 16);
            } else if (arg1.equals("str")) {
                class500.field7063 = class82.field1126 & 0xFF000000 | 0x800000;
            } else if (arg1.equals("/str")) {
                class500.field7063 = -1;
            } else if (arg1.startsWith("u=")) {
                class309.field4072 = class82.field1126 & 0xFF000000 | class455.method2551(arg1.substring(2), (byte) -35, 16);
            } else if (arg1.equals("u")) {
                class309.field4072 = class82.field1126 & 0xFF000000;
            } else if (arg1.equals("/u")) {
                class309.field4072 = -1;
            } else if (arg1.equalsIgnoreCase("shad=-1")) {
                class38.field587 = 0;
            } else if (arg1.startsWith("shad=")) {
                class38.field587 = class82.field1126 & 0xFF000000 | class455.method2551(arg1.substring(5), (byte) -35, 16);
            } else if (arg1.equals("shad")) {
                class38.field587 = class82.field1126 & 0xFF000000;
            } else if (arg1.equals("/shad")) {
                class38.field587 = class534.field7402;
            } else if (arg1.equals("br")) {
                this.method561(class556.field7743, class534.field7402, (byte) -88);
            }
        } catch (Exception var3) {
        }
        field846++;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(IIIIILjava/lang/String;I)V", line = 976)
    public final void method572(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, int arg6) {
        field854++;
        if (arg5 == null) {
            return;
        }
        this.method561(arg2, arg4, (byte) -72);
        int var8 = arg5.length();
        int[] var9 = new int[var8];
        if (arg0 != -1) {
            this.method559(110, (byte) -96, null, 48, 33, -98);
        }
        for (int var10 = 0; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg3 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method565(null, arg6, var9, arg0 + 1, null, arg5, arg1 - (this.field871.method1619(false, arg5) / 2), null);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lha;IILac;II)V", line = 1006)
    public static final void method573(class60 arg0, int arg1, int arg2, class543 arg3, int arg4, int arg5) {
        field863++;
        class12 var6 = class52.field741.method589(-32672, arg3.field7512);
        if (arg4 != -2704) {
            field851 = null;
        }
        if (var6.field146 == -1) {
            return;
        }
        int var7;
        if (arg3.field7566) {
            int var8 = arg3.field7573 + arg2;
            var7 = var8 & 0x3;
        } else {
            var7 = 0;
        }
        class481 var9 = var6.method73((byte) 120, arg3.field7536, var7, arg0);
        if (var9 == null) {
            return;
        }
        int var10 = arg3.field7520;
        int var11 = arg3.field7534;
        if ((var7 & 0x1) == 1) {
            var11 = arg3.field7520;
            var10 = arg3.field7534;
        }
        int var12 = var9.method142();
        int var13 = var9.method149();
        if (var6.field147) {
            var13 = var11 * 4;
            var12 = var10 * 4;
        }
        if (var6.field145 == 0) {
            var9.method2760(arg5, 4 - (var11 * 4 - arg1), var12, var13);
        } else {
            var9.method2761(arg5, arg1 + 4 - (var11 * 4), var12, var13, 0, var6.field145 | 0xFF000000, 1);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V", line = 1061)
    public static void method574(int arg0) {
        field851 = null;
        if (arg0 != -27710) {
            field851 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lha;Ljl;)V", line = 1075)
    public class61(class60 arg0, class274 arg1) {
        this.field849 = arg0;
        this.field871 = arg1;
    }

    @OriginalMember(owner = "client!da", name = "fa", descriptor = "(CIIIZ)V")
    public abstract void method121(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(CIIIZLaa;II)V")
    public abstract void method120(char arg0, int arg1, int arg2, int arg3, boolean arg4, class489 arg5, int arg6, int arg7);
}
