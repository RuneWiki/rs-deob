import jaggl.OpenGL;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public abstract class class488 {

    @OriginalMember(owner = "client!wn", name = "s", descriptor = "Lpm;")
    private class396 field7443;

    @OriginalMember(owner = "client!wn", name = "f", descriptor = "Lqq;")
    private class318 field7430;

    @OriginalMember(owner = "client!wn", name = "o", descriptor = "Lbg;")
    public static class310 field7439 = new class310(79, -1);

    @OriginalMember(owner = "client!wn", name = "t", descriptor = "Lbg;")
    public static class310 field7444 = new class310(45, 15);

    @OriginalMember(owner = "client!wn", name = "v", descriptor = "Loe;")
    public static class127 field7446 = new class127(1, 4);

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "I")
    public static int field7425;

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "I")
    public static int field7426;

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "I")
    public static int field7427;

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "I")
    public static int field7428;

    @OriginalMember(owner = "client!wn", name = "e", descriptor = "I")
    public static int field7429;

    @OriginalMember(owner = "client!wn", name = "g", descriptor = "I")
    public static int field7431;

    @OriginalMember(owner = "client!wn", name = "h", descriptor = "I")
    public static int field7432;

    @OriginalMember(owner = "client!wn", name = "i", descriptor = "I")
    public static int field7433;

    @OriginalMember(owner = "client!wn", name = "j", descriptor = "I")
    public static int field7434;

    @OriginalMember(owner = "client!wn", name = "k", descriptor = "I")
    public static int field7435;

    @OriginalMember(owner = "client!wn", name = "l", descriptor = "I")
    public static int field7436;

    @OriginalMember(owner = "client!wn", name = "m", descriptor = "I")
    public static int field7437;

    @OriginalMember(owner = "client!wn", name = "n", descriptor = "I")
    public static int field7438;

    @OriginalMember(owner = "client!wn", name = "p", descriptor = "I")
    public static int field7440;

    @OriginalMember(owner = "client!wn", name = "q", descriptor = "I")
    public static int field7441;

    @OriginalMember(owner = "client!wn", name = "r", descriptor = "I")
    public static int field7442;

    @OriginalMember(owner = "client!wn", name = "u", descriptor = "I")
    public static int field7445;

    @OriginalMember(owner = "client!wn", name = "w", descriptor = "I")
    public static int field7447;

    @OriginalMember(owner = "client!wn", name = "x", descriptor = "I")
    public static int field7448;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(BIIIIILjava/lang/String;)V")
    public final void method2928(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6) {
        field7447++;
        if (arg6 == null) {
            return;
        }
        this.method2929(arg1, arg4, 127);
        int var8 = arg6.length();
        int[] var9 = new int[var8];
        for (int var10 = 0; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg5 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        if (arg0 == 54) {
            this.method2942(null, null, arg2, true, arg3 - (this.field7443.method2349(arg6, arg0 ^ 0x36) / 2), arg6, var9, null);
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(III)V")
    private final void method2929(int arg0, int arg1, int arg2) {
        if (arg2 <= 112) {
            this.field7443 = null;
        }
        class306.field4634 = -1;
        class166.field2578 = arg0;
        class58.field980 = arg0;
        field7431++;
        class134.field2129 = 0;
        class350.field5165 = -1;
        class328.field4919 = 0;
        if (arg1 == -1) {
            arg1 = 0;
        }
        class466.field7157 = arg1;
        class248.field3803 = arg1;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)V")
    public static void method2930(int arg0) {
        field7444 = null;
        if (arg0 != 32) {
            field7444 = null;
        }
        field7439 = null;
        field7446 = null;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IILjava/lang/String;)V")
    private final void method2931(int arg0, int arg1, String arg2) {
        field7435++;
        int var4 = 0;
        boolean var5 = false;
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
        if (arg1 > ~var4) {
            class328.field4919 = (arg0 - this.field7443.method2349(arg2, 0) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(I)V")
    public static final void method2932(int arg0) {
        field7448++;
        if (class463.field7116.method84(class30.field395, (byte) 90) != 2 || arg0 > -29) {
            return;
        }
        byte var1 = (byte) (class338.field5055 - 4 & 0xFF);
        int var2 = class338.field5055 % class150.field2422;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var16 = 0; var16 < class21.field272; var16++) {
                class64.field1061[var3][var2][var16] = var1;
            }
        }
        if (class362.field5339 == 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class252.field3852[var4] = -1000000;
            class248.field3802[var4] = 1000000;
            class197.field3100[var4] = 0;
            class158.field2493[var4] = 1000000;
            class96.field1707[var4] = 0;
        }
        if (class408.field5928 != 1) {
            int var5 = class7.method38(class243.field3655, class362.field5339, class290.field4403, (byte) -54);
            if ((var5 - class288.field4373) < 800 && (class146.field2369[class362.field5339][class243.field3655 >> 7][class290.field4403 >> 7] & 0x4) != 0) {
                class512.method3062(1702040368, class321.field4830, class290.field4403 >> 7, 1, class243.field3655 >> 7, false);
                return;
            }
            return;
        }
        if ((class146.field2369[class362.field5339][class286.field4329.field3218 >> 7][class286.field4329.field3222 >> 7] & 0x4) != 0) {
            class512.method3062(1702040368, class321.field4830, class286.field4329.field3222 >> 7, 0, class286.field4329.field3218 >> 7, false);
        }
        if (class456.field6999 >= 2560) {
            return;
        }
        int var6 = class243.field3655 >> 7;
        int var7 = class290.field4403 >> 7;
        int var8 = class286.field4329.field3218 >> 7;
        int var9 = class286.field4329.field3222 >> 7;
        int var10;
        if (var6 >= var8) {
            var10 = var6 - var8;
        } else {
            var10 = var8 - var6;
        }
        int var11;
        if (var7 < var9) {
            var11 = var9 - var7;
        } else {
            var11 = var7 - var9;
        }
        if (var10 == 0 && var11 == 0 || -class150.field2422 >= var10 || class150.field2422 <= var10 || var11 <= (-class21.field272) || var11 >= class21.field272) {
            class32.method177(null, (byte) -95, "RC: " + var6 + "," + var7 + " " + var8 + "," + var9 + " " + class381.field5550 + "," + class320.field4827);
            return;
        }
        if (var10 <= var11) {
            int var12 = var10 * 65536 / var11;
            int var13 = 32768;
            while (var7 != var9) {
                if (var7 < var9) {
                    var7++;
                } else if (var7 > var9) {
                    var7--;
                }
                if ((class146.field2369[class362.field5339][var6][var7] & 0x4) != 0) {
                    class512.method3062(1702040368, class321.field4830, var7, 1, var6, false);
                    return;
                }
                var13 += var12;
                if (var13 >= 65536) {
                    if (var8 > var6) {
                        var6++;
                    } else if (var8 < var6) {
                        var6--;
                    }
                    var13 -= 65536;
                    if ((class146.field2369[class362.field5339][var6][var7] & 0x4) != 0) {
                        class512.method3062(1702040368, class321.field4830, var7, 1, var6, false);
                        return;
                    }
                }
            }
            return;
        }
        int var14 = var11 * 65536 / var10;
        int var15 = 32768;
        while (var6 != var8) {
            if (var8 > var6) {
                var6++;
            } else if (var6 > var8) {
                var6--;
            }
            if ((class146.field2369[class362.field5339][var6][var7] & 0x4) != 0) {
                class512.method3062(1702040368, class321.field4830, var7, 1, var6, false);
                return;
            }
            var15 += var14;
            if (var15 >= 65536) {
                var15 -= 65536;
                if (var9 > var7) {
                    var7++;
                } else if (var7 > var9) {
                    var7--;
                }
                if ((class146.field2369[class362.field5339][var6][var7] & 0x4) != 0) {
                    class512.method3062(1702040368, class321.field4830, var7, 1, var6, false);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIIIILjava/lang/String;)V")
    public final void method2933(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5) {
        field7425++;
        if (arg4 != 11252) {
            this.method2946(94, 75, (byte) -86, null, 100, -22);
        }
        if (arg5 != null) {
            this.method2929(arg2, arg3, arg4 - 11129);
            this.method2939(arg1, null, null, arg0 - (this.field7443.method2349(arg5, 0) / 2), 0, 0, null, arg5, -1);
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(ZLjava/lang/String;)V")
    private final void method2934(boolean arg0, String arg1) {
        field7438++;
        try {
            if (arg1.startsWith("col=")) {
                class58.field980 = class58.field980 & 0xFF000000 | class29.method144(arg1.substring(4), (byte) 77, 16) & 0xFFFFFF;
            } else if (arg1.equals("/col")) {
                class58.field980 = class58.field980 & 0xFF000000 | class166.field2578 & 0xFFFFFF;
            }
            if (arg1.startsWith("argb=")) {
                class58.field980 = class29.method144(arg1.substring(5), (byte) 77, 16);
            } else if (arg1.equals("/argb")) {
                class58.field980 = class166.field2578;
            } else if (arg1.startsWith("str=")) {
                class306.field4634 = class29.method144(arg1.substring(4), (byte) 77, 16) | 0xFF000000;
            } else if (arg1.equals("str")) {
                class306.field4634 = -8388608;
            } else if (arg1.equals("/str")) {
                class306.field4634 = -1;
            } else if (arg1.startsWith("u=")) {
                class350.field5165 = class29.method144(arg1.substring(2), (byte) 77, 16) | 0xFF000000;
            } else if (arg1.equals("u")) {
                class350.field5165 = -16777216;
            } else if (arg1.equals("/u")) {
                class350.field5165 = -1;
            } else if (arg1.equalsIgnoreCase("shad=-1")) {
                class248.field3803 = 0;
            } else if (arg1.startsWith("shad=")) {
                class248.field3803 = class29.method144(arg1.substring(5), (byte) 77, 16) | 0xFF000000;
            } else if (arg1.equals("shad")) {
                class248.field3803 = -16777216;
            } else if (arg1.equals("/shad")) {
                class248.field3803 = class466.field7157;
            } else if (arg1.equals("br")) {
                this.method2929(class166.field2578, class466.field7157, 123);
            }
            if (arg0) {
                field7444 = null;
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "(I)V")
    public static final void method2935(int arg0) {
        class402.field5846 = -1;
        class312.field4695 = -1;
        field7429++;
        class241.field3636 = -1;
        class57.field975 = 0;
        if (arg0 != 17396) {
            method2932(74);
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lbl;ILjava/lang/String;I)Lan;")
    public static final class20 method2936(class442 arg0, int arg1, String arg2, int arg3) {
        field7428++;
        int var4 = OpenGL.glGenProgramARB();
        int var5 = -44 / ((arg1 + 62) / 32);
        OpenGL.glBindProgramARB(arg3, var4);
        OpenGL.glProgramStringARB(arg3, 34933, arg2);
        OpenGL.glGetIntegerv(34379, class294.field4459, 0);
        if (class294.field4459[0] == -1) {
            OpenGL.glBindProgramARB(arg3, 0);
            return new class20(arg0, arg3, var4);
        } else {
            OpenGL.glBindProgramARB(arg3, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(II[I[Lig;IIILjava/lang/String;Ljava/util/Random;I)I")
    public final int method2937(int arg0, int arg1, int[] arg2, class154[] arg3, int arg4, int arg5, int arg6, String arg7, Random arg8, int arg9) {
        field7437++;
        if (arg9 > -8) {
            return -52;
        } else if (arg7 == null) {
            return 0;
        } else {
            arg8.setSeed((long) arg6);
            int var11 = (arg8.nextInt() & 0x1F) + 192;
            this.method2929(arg0 & 0xFFFFFF | var11 << 24, arg1 & 0xFFFFFF | var11 << 24, 126);
            int var12 = arg7.length();
            int[] var13 = new int[var12];
            int var14 = 0;
            for (int var15 = 0; var15 < var12; var15++) {
                var13[var15] = var14;
                if ((arg8.nextInt() & 0x3) == 0) {
                    var14++;
                }
            }
            this.method2942(arg2, var13, arg4, true, arg5, arg7, null, arg3);
            return var14;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIIILjava/lang/String;I)V")
    public final void method2938(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5) {
        field7433++;
        if (arg4 != null) {
            this.method2929(arg0, arg5, 115);
            if (arg3 == 32768) {
                this.method2939(arg1, null, null, arg2, 0, 0, null, arg4, -1);
            }
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(ILbe;[Lig;III[ILjava/lang/String;I)V")
    private final void method2939(int arg0, class28 arg1, class154[] arg2, int arg3, int arg4, int arg5, int[] arg6, String arg7, int arg8) {
        field7432++;
        int var10 = arg0 - this.field7443.field5778;
        int var11 = arg8;
        int var12 = -1;
        int var13 = arg7.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class467.method2825(338, arg7.charAt(var14)) & 0xFF);
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
                                    int var17 = class218.method1335(var16.substring(4), 10);
                                    class154 var18 = arg2[var17];
                                    int var19 = arg6 == null ? var18.method989() : arg6[var17];
                                    if ((class58.field980 & 0xFF000000) == -16777216) {
                                        var18.method577(arg3, this.field7443.field5778 + var10 - var19, 1, 0, 1);
                                    } else {
                                        var18.method577(arg3, this.field7443.field5778 + var10 - var19, 0, class58.field980 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    arg3 += arg2[var17].method988();
                                    var12 = -1;
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method2934(false, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg3 += this.field7443.method2352((byte) -113, var12, var15);
                    }
                    if (var15 == ' ') {
                        if (class328.field4919 > 0) {
                            class134.field2129 += class328.field4919;
                            arg3 += class134.field2129 >> 8;
                            class134.field2129 &= 0xFF;
                        }
                    } else if (arg1 == null) {
                        if ((class248.field3803 & 0xFF000000) != 0) {
                            this.method663(var15, arg3 + 1, var10 + 1, class248.field3803, true);
                        }
                        this.method663(var15, arg3, var10, class58.field980, false);
                    } else {
                        if ((class248.field3803 & 0xFF000000) != 0) {
                            this.method662(var15, arg3 + 1, var10 + 1, class248.field3803, true, arg1, arg4, arg5);
                        }
                        this.method662(var15, arg3, var10, class58.field980, false, arg1, arg4, arg5);
                    }
                    int var20 = this.field7443.method2353(false, var15);
                    if (class306.field4634 != -1) {
                        this.field7430.method1889((int) ((double) this.field7443.field5778 * 0.7D) + var10, class306.field4634, -97, var20, arg3);
                    }
                    if (class350.field5165 != -1) {
                        this.field7430.method1889(this.field7443.field5778 + var10 + 1, class350.field5165, -58, var20, arg3);
                    }
                    var12 = var15;
                    arg3 += var20;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(CIIIZLbe;II)V")
    public abstract void method662(char arg0, int arg1, int arg2, int arg3, boolean arg4, class28 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(III[IIIIIILjava/lang/String;IIILbe;[Lig;I)I")
    public final int method2940(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, String arg9, int arg10, int arg11, int arg12, class28 arg13, class154[] arg14, int arg15) {
        if (arg0 != 0) {
            this.field7430 = null;
        }
        field7436++;
        return this.method2941(arg12, arg3, 0, arg0 + 17975, arg4, arg14, arg10, arg2, arg8, arg6, arg5, arg15, arg9, arg7, arg1, arg11, arg13);
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(I[IIII[Lig;IIIIIILjava/lang/String;IIILbe;)I")
    public final int method2941(int arg0, int[] arg1, int arg2, int arg3, int arg4, class154[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, String arg12, int arg13, int arg14, int arg15, class28 arg16) {
        field7441++;
        if (arg12 == null) {
            return 0;
        }
        this.method2929(arg14, arg4, 119);
        if (arg0 == 0) {
            arg0 = this.field7443.field5778;
        }
        int[] var18;
        if (arg9 < this.field7443.field5780 + this.field7443.field5779 + arg0 && arg0 + arg0 > arg9) {
            var18 = null;
        } else {
            var18 = new int[] { arg10 };
        }
        int var19 = this.field7443.method2355(class49.field759, (byte) 94, var18, arg12, arg5);
        if (arg2 == -1) {
            arg2 = arg9 / arg0;
            if (arg2 <= 0) {
                arg2 = 1;
            }
        }
        if (arg2 > 0 && var19 >= arg2) {
            var19 = arg2;
            class49.field759[arg2 - 1] = this.field7443.method2348(arg5, 72, class49.field759[arg2 - 1], arg10);
        }
        if (arg8 == 3 && var19 == 1) {
            arg8 = 1;
        }
        int var20;
        if (arg8 == 0) {
            var20 = this.field7443.field5780 + arg13;
        } else if (arg8 == 1) {
            var20 = (arg9 - this.field7443.field5780 - (var19 + -1) * arg0 - this.field7443.field5779) / 2 + this.field7443.field5780 + arg13;
        } else if (arg8 == 2) {
            var20 = arg9 + arg13 - ((var19 - 1) * arg0) - this.field7443.field5779;
        } else {
            int var21 = (arg9 - this.field7443.field5780 - this.field7443.field5779 - ((var19 - 1) * arg0)) / (var19 + 1);
            if (var21 < 0) {
                var21 = 0;
            }
            arg0 += var21;
            var20 = arg13 + var21 + this.field7443.field5780;
        }
        for (int var22 = 0; var22 < var19; var22++) {
            if (arg15 == 0) {
                this.method2939(var20, arg16, arg5, arg11, arg6, arg7, arg1, class49.field759[var22], -1);
            } else if (arg15 == 1) {
                this.method2939(var20, arg16, arg5, (arg10 - this.field7443.method2349(class49.field759[var22], 0)) / 2 + arg11, arg6, arg7, arg1, class49.field759[var22], -1);
            } else if (arg15 == 2) {
                this.method2939(var20, arg16, arg5, arg10 + arg11 - this.field7443.method2349(class49.field759[var22], arg3 + -17975), arg6, arg7, arg1, class49.field759[var22], -1);
            } else if ((var19 - 1) == var22) {
                this.method2939(var20, arg16, arg5, arg11, arg6, arg7, arg1, class49.field759[var22], -1);
            } else {
                this.method2931(arg10, -1, class49.field759[var22]);
                this.method2939(var20, arg16, arg5, arg11, arg6, arg7, arg1, class49.field759[var22], arg3 ^ 0xFFFFB9C8);
                class328.field4919 = 0;
            }
            var20 += arg0;
        }
        if (arg3 != 17975) {
            field7439 = null;
        }
        return var19;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "([I[IIZILjava/lang/String;[I[Lig;)V")
    private final void method2942(int[] arg0, int[] arg1, int arg2, boolean arg3, int arg4, String arg5, int[] arg6, class154[] arg7) {
        field7440++;
        int var9 = arg2 - this.field7443.field5778;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg5.length();
        int var14 = 0;
        if (!arg3) {
            field7444 = null;
        }
        while (var14 < var13) {
            char var15 = (char) (class467.method2825(338, arg5.charAt(var14)) & 0xFF);
            if (var15 == '<') {
                var10 = var14;
            } else {
                label119: {
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
                                        if (arg1 == null) {
                                            var17 = 0;
                                        } else {
                                            var17 = arg1[var12];
                                        }
                                        int var18;
                                        if (arg6 == null) {
                                            var18 = 0;
                                        } else {
                                            var18 = arg6[var12];
                                        }
                                        var12++;
                                        int var19 = class218.method1335(var16.substring(4), 10);
                                        class154 var20 = arg7[var19];
                                        int var21 = arg0 == null ? var20.method989() : arg0[var19];
                                        var20.method577(arg4 + var17, -var21 + this.field7443.field5778 + var18 + var9, 1, 0, 1);
                                        arg4 += arg7[var19].method988();
                                        var11 = -1;
                                    } catch (Exception var25) {
                                    }
                                } else {
                                    this.method2934(!arg3, var16);
                                }
                                break label119;
                            }
                            var15 = '®';
                        }
                    }
                    if (var10 == -1) {
                        if (var11 != -1) {
                            arg4 += this.field7443.method2352((byte) -40, var11, var15);
                        }
                        int var22;
                        if (arg1 == null) {
                            var22 = 0;
                        } else {
                            var22 = arg1[var12];
                        }
                        int var23;
                        if (arg6 == null) {
                            var23 = 0;
                        } else {
                            var23 = arg6[var12];
                        }
                        if (var15 != ' ') {
                            if ((class248.field3803 & 0xFF000000) != 0) {
                                this.method663(var15, arg4 + var22 + 1, var9 + var23 + 1, class248.field3803, true);
                            }
                            this.method663(var15, arg4 + var22, var9 + var23, class58.field980, false);
                        } else if (class328.field4919 > 0) {
                            class134.field2129 += class328.field4919;
                            arg4 += class134.field2129 >> 8;
                            class134.field2129 &= 0xFF;
                        }
                        var12++;
                        int var24 = this.field7443.method2353(false, var15);
                        if (class306.field4634 != -1) {
                            this.field7430.method1889((int) ((double) this.field7443.field5778 * 0.7D) + var9, class306.field4634, -77, var24, arg4);
                        }
                        if (class350.field5165 != -1) {
                            this.field7430.method1889(this.field7443.field5778 + var9, class350.field5165, -29, var24, arg4);
                        }
                        arg4 += var24;
                        var11 = var15;
                    }
                }
            }
            var14++;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(ZI[Lig;[IIILjava/lang/String;I)V")
    public final void method2943(boolean arg0, int arg1, class154[] arg2, int[] arg3, int arg4, int arg5, String arg6, int arg7) {
        field7434++;
        if (arg6 == null) {
            return;
        }
        this.method2929(arg1, arg7, 119);
        this.method2939(arg5, null, arg2, arg4, 0, 0, arg3, arg6, -1);
        if (!arg0) {
            field7446 = null;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V")
    public final void method2944(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field7445++;
        if (arg0 == null) {
            return;
        }
        this.method2929(arg4, arg2, arg3 - 14947);
        int var8 = arg0.length();
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        if (arg3 != 15066) {
            return;
        }
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg1 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg1 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method2942(null, var9, arg6, true, arg5 - (this.field7443.method2349(arg0, 0) / 2), arg0, var10, null);
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(ILjava/lang/String;IIIIII)V")
    public final void method2945(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field7427++;
        if (arg1 == null) {
            return;
        }
        int var9 = -1 % ((-arg6 - 77) / 42);
        this.method2929(arg0, arg2, 124);
        double var10 = 7.0D - (double) arg7 / 8.0D;
        if (var10 < 0.0D) {
            var10 = 0.0D;
        }
        int var12 = arg1.length();
        int[] var13 = new int[var12];
        for (int var14 = 0; var14 < var12; var14++) {
            var13[var14] = (int) (var10 * Math.sin((double) var14 / 1.5D + (double) arg3));
        }
        this.method2942(null, null, arg5, true, arg4 - (this.field7443.method2349(arg1, 0) / 2), arg1, var13, null);
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIBLjava/lang/String;II)V")
    public final void method2946(int arg0, int arg1, byte arg2, String arg3, int arg4, int arg5) {
        field7426++;
        if (arg2 >= -35) {
            field7439 = null;
        }
        if (arg3 != null) {
            this.method2929(arg1, arg4, 119);
            this.method2939(arg5, null, null, arg0 - this.field7443.method2349(arg3, 0), 0, 0, null, arg3, -1);
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(III[ILjava/lang/String;Ljava/util/Random;I[IIIIII[Lig;I)I")
    public final int method2947(int arg0, int arg1, int arg2, int[] arg3, String arg4, Random arg5, int arg6, int[] arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class154[] arg13, int arg14) {
        field7442++;
        if (arg4 == null) {
            return 0;
        }
        arg5.setSeed((long) arg11);
        int var16 = (arg5.nextInt() & 0x1F) + 192;
        this.method2929(var16 << 24 | arg1 & 0xFFFFFF, var16 << 24 | arg8 & 0xFFFFFF, arg0 ^ 0xFFFFFFBA);
        int var17 = arg4.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg5.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        int var21 = arg10;
        int var22 = this.field7443.field5780 + arg9;
        if (arg0 != -61) {
            this.field7430 = null;
        }
        if (arg2 == 1) {
            var22 += (arg12 - this.field7443.field5779 - this.field7443.field5780) / 2;
        } else if (arg2 == 2) {
            var22 = arg9 + arg12 - this.field7443.field5779;
        }
        int var23 = -1;
        if (arg14 == 1) {
            var23 = var19 + this.field7443.method2349(arg4, arg0 ^ 0xFFFFFFC3);
            var21 = (arg6 - var23) / 2 + arg10;
        } else if (arg14 == 2) {
            var23 = var19 + this.field7443.method2349(arg4, arg0 + 61);
            var21 = arg6 + arg10 - var23;
        }
        this.method2942(arg7, var18, var22, true, var21, arg4, null, arg13);
        if (arg3 != null) {
            if (var23 == -1) {
                var23 = this.field7443.method2349(arg4, 0) + var19;
            }
            arg3[3] = this.field7443.field5780 + this.field7443.field5779;
            arg3[1] = var22 - this.field7443.field5780;
            arg3[0] = var21;
            arg3[2] = var23;
        }
        return var19;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(CIIIZ)V")
    public abstract void method663(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(Lqq;Lpm;)V")
    public class488(class318 arg0, class396 arg1) {
        this.field7443 = arg1;
        this.field7430 = arg0;
    }
}
