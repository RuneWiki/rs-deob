import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public abstract class class485 {

    @OriginalMember(owner = "client!oj", name = "s", descriptor = "Lkm;")
    private class487 field6845;

    @OriginalMember(owner = "client!oj", name = "q", descriptor = "Lss;")
    private class76 field6843;

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "[I")
    public static int[] field6831 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!oj", name = "y", descriptor = "Llk;")
    public static class425 field6851;

    @OriginalMember(owner = "client!oj", name = "z", descriptor = "Z")
    public static boolean field6852;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "I")
    public static int field6827;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "I")
    public static int field6828;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "I")
    public static int field6829;

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "I")
    public static int field6830;

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "I")
    public static int field6832;

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "I")
    public static int field6833;

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "I")
    public static int field6834;

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "I")
    public static int field6835;

    @OriginalMember(owner = "client!oj", name = "j", descriptor = "I")
    public static int field6836;

    @OriginalMember(owner = "client!oj", name = "k", descriptor = "I")
    public static int field6837;

    @OriginalMember(owner = "client!oj", name = "l", descriptor = "I")
    public static int field6838;

    @OriginalMember(owner = "client!oj", name = "m", descriptor = "I")
    public static int field6839;

    @OriginalMember(owner = "client!oj", name = "n", descriptor = "I")
    public static int field6840;

    @OriginalMember(owner = "client!oj", name = "o", descriptor = "I")
    public static int field6841;

    @OriginalMember(owner = "client!oj", name = "p", descriptor = "I")
    public static int field6842;

    @OriginalMember(owner = "client!oj", name = "r", descriptor = "I")
    public static int field6844;

    @OriginalMember(owner = "client!oj", name = "t", descriptor = "I")
    public static int field6846;

    @OriginalMember(owner = "client!oj", name = "u", descriptor = "I")
    public static int field6847;

    @OriginalMember(owner = "client!oj", name = "v", descriptor = "I")
    public static int field6848;

    @OriginalMember(owner = "client!oj", name = "w", descriptor = "I")
    public static int field6849;

    @OriginalMember(owner = "client!oj", name = "x", descriptor = "I")
    public static int field6850;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ILjava/lang/String;IIBI)V")
    public final void method2835(int arg0, String arg1, int arg2, int arg3, byte arg4, int arg5) {
        field6842++;
        if (arg1 == null) {
            return;
        }
        this.method2846((byte) 66, arg3, arg2);
        this.method2854(arg0, (int[]) null, (class385[]) null, (byte) -110, arg1, 0, (class90) null, 0, arg5);
        if (arg4 < 46) {
            field6851 = null;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZLjava/lang/String;)V")
    private final void method2836(boolean arg0, String arg1) {
        if (!arg0) {
            return;
        }
        try {
            if (arg1.startsWith("col=")) {
                class103.field1461 = class103.field1461 & 0xFF000000 | class387.method2304(16, arg1.substring(4), -125) & 0xFFFFFF;
            } else if (arg1.equals("/col")) {
                class103.field1461 = class155.field2232 & 0xFFFFFF | class103.field1461 & 0xFF000000;
            }
            if (arg1.startsWith("argb=")) {
                class103.field1461 = class387.method2304(16, arg1.substring(5), -93);
            } else if (arg1.equals("/argb")) {
                class103.field1461 = class155.field2232;
            } else if (arg1.startsWith("str=")) {
                class290.field3989 = class387.method2304(16, arg1.substring(4), -93) | 0xFF000000;
            } else if (arg1.equals("str")) {
                class290.field3989 = -8388608;
            } else if (arg1.equals("/str")) {
                class290.field3989 = -1;
            } else if (arg1.startsWith("u=")) {
                class103.field1467 = class387.method2304(16, arg1.substring(2), -93) | 0xFF000000;
            } else if (arg1.equals("u")) {
                class103.field1467 = -16777216;
            } else if (arg1.equals("/u")) {
                class103.field1467 = -1;
            } else if (arg1.equalsIgnoreCase("shad=-1")) {
                class168.field2491 = 0;
            } else if (arg1.startsWith("shad=")) {
                class168.field2491 = class387.method2304(16, arg1.substring(5), -101) | 0xFF000000;
            } else if (arg1.equals("shad")) {
                class168.field2491 = -16777216;
            } else if (arg1.equals("/shad")) {
                class168.field2491 = class13.field213;
            } else if (arg1.equals("br")) {
                this.method2846((byte) 66, class13.field213, class155.field2232);
            }
        } catch (Exception var3) {
        }
        field6834++;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Ljava/lang/String;II)V")
    private final void method2837(String arg0, int arg1, int arg2) {
        field6827++;
        int var4 = arg2;
        boolean var5 = false;
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
            class2.field12 = (arg1 - this.field6843.method522(-123, arg0) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
    public final void method2838(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6828++;
        if (arg0 != null) {
            this.method2846((byte) 66, arg1, arg5);
            this.method2854(arg4, (int[]) null, (class385[]) null, (byte) -127, arg0, 0, (class90) null, arg3, arg2 - this.field6843.method522(114, arg0));
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(III)V")
    public static final void method2839(int arg0, int arg1, int arg2) {
        field6830++;
        class265 var3 = class440.method2554(arg0, 2, arg1);
        var3.method1675(false);
        var3.field3698 = arg2;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIB)Lms;")
    public static final class363 method2840(int arg0, int arg1, byte arg2) {
        field6848++;
        class363 var3 = class292.method1804((byte) -108, arg1);
        if (arg0 == -1) {
            return var3;
        } else if (var3 == null || var3.field5113 == null || arg0 >= var3.field5113.length) {
            return null;
        } else {
            if (arg2 != 21) {
                method2840(42, 65, (byte) -14);
            }
            return var3.field5113[arg0];
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IILjava/lang/String;IIIII)V")
    public final void method2841(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field6837++;
        if (arg2 == null) {
            return;
        }
        this.method2846((byte) 66, arg1, arg4);
        double var9 = 7.0D - ((double) arg7 / 8.0D);
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg2.length();
        int[] var12 = new int[var11];
        for (int var13 = arg0; var13 < var11; var13++) {
            var12[var13] = (int) (Math.sin((double) var13 / 1.5D + (double) arg6) * var9);
        }
        this.method2850((class385[]) null, var12, arg3, arg5 - (this.field6843.method522(-122, arg2) / 2), (int[]) null, 118, arg2, (int[]) null);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2842(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class147[] var7 = class51.field860;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class147 var9 = var7[var8];
            if (var9 != null && var9.field2071 == 2) {
                class422.method2450((var9.field2072 - class325.field4472 << 7) + var9.field2077, (var9.field2075 - class153.field2204 << 7) + var9.field2080, -10831, arg6, var9.field2086, arg4, var9.field2082 * 2, arg2 >> 1, arg1 >> 1);
                if (class460.field6483[0] > -1 && (class356.field4972 % 20) < 10) {
                    class289.field3971[var9.field2087].method2301(arg0 + class460.field6483[0] - 12, arg5 + -28 + class460.field6483[1]);
                }
            }
        }
        if (arg3 != -1) {
            field6852 = true;
        }
        field6838++;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)V")
    public static void method2843(byte arg0) {
        field6831 = null;
        if (arg0 < 49) {
            method2839(-29, 36, 79);
        }
        field6851 = null;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIIIILvb;IIILjava/lang/String;III[I[Laq;)I")
    public final int method2844(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class90 arg6, int arg7, int arg8, int arg9, String arg10, int arg11, int arg12, int arg13, int[] arg14, class385[] arg15) {
        field6849++;
        if (arg10 == null) {
            return 0;
        }
        this.method2846((byte) 66, arg8, arg13);
        if (arg2 == 0) {
            arg2 = this.field6843.field1150;
        }
        int[] var17;
        if (arg4 < (this.field6843.field1156 + this.field6843.field1148 + arg2) && (arg2 + arg2) > arg4) {
            var17 = null;
        } else {
            var17 = new int[] { arg12 };
        }
        int var18 = this.field6843.method521(arg15, arg10, var17, class378.field5345, (byte) 26);
        if (arg9 > -67) {
            this.field6845 = null;
        }
        if (arg3 == 3 && var18 == 1) {
            arg3 = 1;
        }
        int var19;
        if (arg3 == 0) {
            var19 = this.field6843.field1156 + arg1;
        } else if (arg3 == 1) {
            var19 = (arg4 - this.field6843.field1148 - this.field6843.field1156 - ((var18 - 1) * arg2)) / 2 + this.field6843.field1156 + arg1;
        } else if (arg3 == 2) {
            var19 = arg1 + arg4 - ((var18 - 1) * arg2) - this.field6843.field1148;
        } else {
            int var20 = (arg4 - ((var18 - 1) * arg2) - this.field6843.field1156 - this.field6843.field1148) / (var18 + 1);
            if (var20 < 0) {
                var20 = 0;
            }
            var19 = this.field6843.field1156 + var20 + arg1;
            arg2 += var20;
        }
        for (int var21 = 0; var21 < var18; var21++) {
            if (arg5 == 0) {
                this.method2854(var19, arg14, arg15, (byte) -126, class378.field5345[var21], arg0, arg6, arg11, arg7);
            } else if (arg5 == 1) {
                this.method2854(var19, arg14, arg15, (byte) -113, class378.field5345[var21], arg0, arg6, arg11, arg7 + ((arg12 - this.field6843.method522(-109, class378.field5345[var21])) / 2));
            } else if (arg5 == 2) {
                this.method2854(var19, arg14, arg15, (byte) -128, class378.field5345[var21], arg0, arg6, arg11, arg7 + arg12 - this.field6843.method522(-121, class378.field5345[var21]));
            } else if ((var18 - 1) == var21) {
                this.method2854(var19, arg14, arg15, (byte) -125, class378.field5345[var21], arg0, arg6, arg11, arg7);
            } else {
                this.method2837(class378.field5345[var21], arg12, 0);
                this.method2854(var19, arg14, arg15, (byte) -120, class378.field5345[var21], arg0, arg6, arg11, arg7);
                class2.field12 = 0;
            }
            var19 += arg2;
        }
        return var18;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(CIIIZLvb;II)V")
    public abstract void method258(char arg0, int arg1, int arg2, int arg3, boolean arg4, class90 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V")
    public final void method2845(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6850++;
        if (arg0 == null) {
            return;
        }
        this.method2846((byte) 66, arg1, arg6);
        int var8 = arg0.length();
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg5 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg5 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method2850((class385[]) null, var10, arg4, arg3 - (this.field6843.method522(-116, arg0) / 2), var9, 101, arg0, (int[]) null);
        int var12 = 28 % ((-arg2 - 4) / 47);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(BII)V")
    private final void method2846(byte arg0, int arg1, int arg2) {
        class2.field12 = 0;
        class103.field1467 = -1;
        field6839++;
        class155.field2232 = arg2;
        class103.field1461 = arg2;
        class375.field5302 = 0;
        class290.field3989 = -1;
        if (arg0 != 66) {
            field6851 = null;
        }
        if (arg1 == -1) {
            arg1 = 0;
        }
        class13.field213 = arg1;
        class168.field2491 = arg1;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IBI)I")
    public static final int method2847(int arg0, byte arg1, int arg2) {
        field6835++;
        int var3 = arg0 * 57 + arg2;
        int var4 = var3 ^ var3 << 13;
        int var5 = Integer.MAX_VALUE & (var4 * 15731 * var4 + 789221) * var4 + 1376312589;
        if (arg1 <= 91) {
            method2843((byte) 24);
        }
        return (var5 & 0x7F85541) >> 19;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIII[IBILjava/util/Random;IIILjava/lang/String;I[Laq;[I)I")
    public final int method2848(int arg0, int arg1, int arg2, int arg3, int[] arg4, byte arg5, int arg6, Random arg7, int arg8, int arg9, int arg10, String arg11, int arg12, class385[] arg13, int[] arg14) {
        field6847++;
        int var16 = -24 / ((arg5 + 67) / 51);
        if (arg11 == null) {
            return 0;
        }
        arg7.setSeed((long) arg1);
        int var17 = (arg7.nextInt() & 0x1F) + 192;
        this.method2846((byte) 66, arg12 & 0xFFFFFF | var17 << 24, arg3 & 0xFFFFFF | var17 << 24);
        int var18 = arg11.length();
        int[] var19 = new int[var18];
        int var20 = 0;
        for (int var21 = 0; var21 < var18; var21++) {
            var19[var21] = var20;
            if ((arg7.nextInt() & 0x3) == 0) {
                var20++;
            }
        }
        int var22 = arg2;
        int var23 = this.field6843.field1156 + arg10;
        if (arg9 == 1) {
            var23 += (arg8 - this.field6843.field1156 - this.field6843.field1148) / 2;
        } else if (arg9 == 2) {
            var23 = arg8 + arg10 - this.field6843.field1148;
        }
        int var24 = -1;
        if (arg0 == 1) {
            var24 = var20 + this.field6843.method522(28, arg11);
            var22 = (arg6 - var24) / 2 + arg2;
        } else if (arg0 == 2) {
            var24 = this.field6843.method522(-111, arg11) + var20;
            var22 = arg6 + arg2 - var24;
        }
        this.method2850(arg13, (int[]) null, var23, var22, var19, 72, arg11, arg4);
        if (arg14 != null) {
            if (var24 == -1) {
                var24 = var20 + this.field6843.method522(39, arg11);
            }
            arg14[3] = this.field6843.field1156 + this.field6843.field1148;
            arg14[2] = var24;
            arg14[1] = var23 - this.field6843.field1156;
            arg14[0] = var22;
        }
        return var20;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(BIIILjava/lang/String;I)V")
    public final void method2849(byte arg0, int arg1, int arg2, int arg3, String arg4, int arg5) {
        field6840++;
        if (arg4 == null) {
            return;
        }
        if (arg0 != -42) {
            field6831 = null;
        }
        this.method2846((byte) 66, arg3, arg2);
        this.method2854(arg5, (int[]) null, (class385[]) null, (byte) -111, arg4, 0, (class90) null, 0, arg1 - this.field6843.method522(17, arg4) / 2);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "([Laq;[III[IILjava/lang/String;[I)V")
    private final void method2850(class385[] arg0, int[] arg1, int arg2, int arg3, int[] arg4, int arg5, String arg6, int[] arg7) {
        if (arg5 <= 0) {
            this.method2846((byte) 80, -25, 68);
        }
        field6844++;
        int var9 = arg2 - this.field6843.field1150;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg6.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class161.method977((byte) -28, arg6.charAt(var14)) & 0xFF);
            if (var15 == '<') {
                var10 = var14;
            } else {
                if (var15 == '>' && var10 != -1) {
                    String var16 = arg6.substring(var10 + 1, var14);
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
                                    if (arg1 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg1[var12];
                                    }
                                    var12++;
                                    int var19 = class168.method1039(var16.substring(4), false);
                                    class385 var20 = arg0[var19];
                                    int var21 = arg7 == null ? var20.method389() : arg7[var19];
                                    var20.method385(arg3 + var17, var9 - -var18 + this.field6843.field1150 + -var21, 0, 0, 1);
                                    var11 = -1;
                                    arg3 += arg0[var19].method382();
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method2836(true, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg3 += this.field6843.method526(var11, var15, (byte) 38);
                    }
                    int var22;
                    if (arg4 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg4[var12];
                    }
                    int var23;
                    if (arg1 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg1[var12];
                    }
                    var12++;
                    if (var15 != ' ') {
                        if ((class168.field2491 & 0xFF000000) != 0) {
                            this.method259(var15, var22 + arg3 + 1, var9 - -1 + var23, class168.field2491, true);
                        }
                        this.method259(var15, arg3 + var22, var9 + var23, class103.field1461, false);
                    } else if (class2.field12 > 0) {
                        class375.field5302 += class2.field12;
                        arg3 += class375.field5302 >> 8;
                        class375.field5302 &= 0xFF;
                    }
                    int var24 = this.field6843.method520(-24356, var15);
                    if (class290.field3989 != -1) {
                        this.field6845.method2859(var24, (byte) -6, arg3, class290.field3989, var9 + ((int) ((double) this.field6843.field1150 * 0.7D)));
                    }
                    if (class103.field1467 != -1) {
                        this.field6845.method2859(var24, (byte) -6, arg3, class103.field1467, this.field6843.field1150 + var9);
                    }
                    arg3 += var24;
                    var11 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(CIIIZ)V")
    public abstract void method259(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "([ILjava/lang/String;IIII[Laq;I)V")
    public final void method2851(int[] arg0, String arg1, int arg2, int arg3, int arg4, int arg5, class385[] arg6, int arg7) {
        field6846++;
        if (arg4 == -3732 && arg1 != null) {
            this.method2846((byte) 66, arg5, arg3);
            this.method2854(arg7, arg0, arg6, (byte) -111, arg1, 0, (class90) null, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IBILms;)V")
    public static final void method2852(int arg0, byte arg1, int arg2, class363 arg3) {
        field6833++;
        int var4 = -60 % ((arg1 + 49) / 57);
        if (class184.field2678) {
            if (!client.method2321(arg3).method477(109) || (class416.field5733 & 0x20) == 0) {
                return;
            }
            class367.field5217++;
            class225.method1415(false, arg3.field5047, class357.field4981 + " -> " + arg3.field5115, arg3.field5096, 23, 0L, class90.field1346, arg3.field5195, class238.field3363, 0, true);
            return;
        }
        for (int var5 = 9; var5 >= 5; var5--) {
            String var9 = class191.method1232(735, var5, arg3);
            if (var9 != null) {
                class393.field5525++;
                class225.method1415(false, arg3.field5047, arg3.field5115, arg3.field5096, 1004, (long) (var5 + 1), class409.method2396(var5, arg3, 32544), arg3.field5195, var9, 0, true);
            }
        }
        String var6 = class243.method1518(arg3, false);
        if (var6 != null) {
            class407.field5637++;
            class225.method1415(false, arg3.field5047, arg3.field5115, arg3.field5096, 13, 0L, arg3.field5065, arg3.field5195, var6, 0, true);
        }
        for (int var7 = 4; var7 >= 0; var7--) {
            String var8 = class191.method1232(735, var7, arg3);
            if (var8 != null) {
                class393.field5525++;
                class225.method1415(false, arg3.field5047, arg3.field5115, arg3.field5096, 50, (long) (var7 + 1), class409.method2396(var7, arg3, 32544), arg3.field5195, var8, 0, true);
            }
        }
        if (!client.method2321(arg3).method478((byte) -78)) {
            return;
        }
        class203.field2905++;
        if (arg3.field5199 != null) {
            class225.method1415(false, arg3.field5047, "", arg3.field5096, 59, 0L, -1, arg3.field5195, arg3.field5199, 0, true);
            return;
        }
        class225.method1415(false, arg3.field5047, "", arg3.field5096, 59, 0L, -1, arg3.field5195, class330.field4540.method695(-118, class487.field6867), 0, true);
        return;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IILjava/lang/String;IIII)V")
    public final void method2853(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5, int arg6) {
        field6841++;
        if (arg2 == null) {
            return;
        }
        if (arg3 != -31502) {
            this.method2855(11, 30, 29, -122, -90, (int[]) null, (class385[]) null, (String) null, (Random) null, 45);
        }
        this.method2846((byte) 66, arg4, arg1);
        int var8 = arg2.length();
        int[] var9 = new int[var8];
        for (int var10 = 0; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg6 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method2850((class385[]) null, var9, arg0, arg5 - (this.field6843.method522(-9, arg2) / 2), (int[]) null, 38, arg2, (int[]) null);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I[I[Laq;BLjava/lang/String;ILvb;II)V")
    private final void method2854(int arg0, int[] arg1, class385[] arg2, byte arg3, String arg4, int arg5, class90 arg6, int arg7, int arg8) {
        if (arg3 >= -109) {
            this.method2844(0, 93, -73, -108, -101, -105, (class90) null, 126, 23, 0, (String) null, -95, -7, -31, (int[]) null, (class385[]) null);
        }
        field6832++;
        int var10 = arg0 - this.field6843.field1150;
        int var11 = -1;
        int var12 = -1;
        int var13 = arg4.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class161.method977((byte) -34, arg4.charAt(var14)) & 0xFF);
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
                                    int var17 = class168.method1039(var16.substring(4), false);
                                    class385 var18 = arg2[var17];
                                    int var19 = arg1 == null ? var18.method389() : arg1[var17];
                                    if ((class103.field1461 & 0xFF000000) == -16777216) {
                                        var18.method385(arg8, this.field6843.field1150 + var10 - var19, 0, 0, 1);
                                    } else {
                                        var18.method385(arg8, var10 + this.field6843.field1150 - var19, 1, class103.field1461 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    arg8 += arg2[var17].method382();
                                    var12 = -1;
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method2836(true, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg8 += this.field6843.method526(var12, var15, (byte) -124);
                    }
                    if (var15 == ' ') {
                        if (class2.field12 > 0) {
                            class375.field5302 += class2.field12;
                            arg8 += class375.field5302 >> 8;
                            class375.field5302 &= 0xFF;
                        }
                    } else if (arg6 == null) {
                        if ((class168.field2491 & 0xFF000000) != 0) {
                            this.method259(var15, arg8 + 1, var10 - -1, class168.field2491, true);
                        }
                        this.method259(var15, arg8, var10, class103.field1461, false);
                    } else {
                        if ((class168.field2491 & 0xFF000000) != 0) {
                            this.method258(var15, arg8 + 1, var10 + 1, class168.field2491, true, arg6, arg5, arg7);
                        }
                        this.method258(var15, arg8, var10, class103.field1461, false, arg6, arg5, arg7);
                    }
                    int var20 = this.field6843.method520(-24356, var15);
                    if (class290.field3989 != -1) {
                        this.field6845.method2859(var20, (byte) -6, arg8, class290.field3989, (int) ((double) this.field6843.field1150 * 0.7D) + var10);
                    }
                    if (class103.field1467 != -1) {
                        this.field6845.method2859(var20, (byte) -6, arg8, class103.field1467, var10 + this.field6843.field1150 + 1);
                    }
                    arg8 += var20;
                    var12 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIII[I[Laq;Ljava/lang/String;Ljava/util/Random;I)I")
    public final int method2855(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, class385[] arg6, String arg7, Random arg8, int arg9) {
        field6829++;
        if (arg7 == null) {
            return 0;
        }
        if (arg9 != -1) {
            this.method2849((byte) 90, 112, 46, -54, (String) null, 118);
        }
        arg8.setSeed((long) arg4);
        int var11 = (arg8.nextInt() & 0x1F) + 192;
        this.method2846((byte) 66, arg2 & 0xFFFFFF | var11 << 24, var11 << 24 | arg0 & 0xFFFFFF);
        int var12 = arg7.length();
        int[] var13 = new int[var12];
        int var14 = 0;
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg8.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        this.method2850(arg6, (int[]) null, arg3, arg1, var13, 17, arg7, arg5);
        return var14;
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Lkm;Lss;)V")
    public class485(class487 arg0, class76 arg1) {
        this.field6845 = arg0;
        this.field6843 = arg1;
    }

    static {
        new class112((String) null, "die kürzlich gesprochen oder gehandelt haben.", (String) null, (String) null);
        field6851 = new class425(new byte[5000]);
        field6852 = false;
    }
}
