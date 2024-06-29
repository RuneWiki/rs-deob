import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public abstract class class421 {

    @OriginalMember(owner = "client!la", name = "c", descriptor = "Ldaa;")
    private class11 field6056;

    @OriginalMember(owner = "client!la", name = "r", descriptor = "Lr;")
    private class167 field6071;

    @OriginalMember(owner = "client!la", name = "q", descriptor = "I")
    public static int field6070 = 0;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field6054;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public static int field6055;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    public static int field6057;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public static int field6058;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "I")
    public static int field6059;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    public static int field6060;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "I")
    public static int field6061;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "I")
    public static int field6062;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "I")
    public static int field6063;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "I")
    public static int field6064;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "I")
    public static int field6065;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "I")
    public static int field6066;

    @OriginalMember(owner = "client!la", name = "n", descriptor = "I")
    public static int field6067;

    @OriginalMember(owner = "client!la", name = "o", descriptor = "I")
    public static int field6068;

    @OriginalMember(owner = "client!la", name = "p", descriptor = "I")
    public static int field6069;

    @OriginalMember(owner = "client!la", name = "s", descriptor = "I")
    public static int field6072;

    @OriginalMember(owner = "client!la", name = "t", descriptor = "I")
    public static int field6073;

    @OriginalMember(owner = "client!la", name = "u", descriptor = "I")
    public static int field6074;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BLjava/lang/String;)V")
    private final void method2548(byte arg0, String arg1) {
        field6074++;
        try {
            int var3 = 63 / ((arg0 + 21) / 60);
            if (arg1.startsWith("col=")) {
                class193.field3038 = class193.field3038 & 0xFF000000 | class410.method2502(16, arg1.substring(4), (byte) 40) & 0xFFFFFF;
            } else if (arg1.equals("/col")) {
                class193.field3038 = class204.field3134 & 0xFFFFFF | class193.field3038 & 0xFF000000;
            }
            if (arg1.startsWith("argb=")) {
                class193.field3038 = class410.method2502(16, arg1.substring(5), (byte) 40);
            } else if (arg1.equals("/argb")) {
                class193.field3038 = class204.field3134;
            } else if (arg1.startsWith("str=")) {
                class147.field2549 = class193.field3038 & 0xFF000000 | class410.method2502(16, arg1.substring(4), (byte) 40);
            } else if (arg1.equals("str")) {
                class147.field2549 = class193.field3038 & 0xFF000000 | 0x800000;
            } else if (arg1.equals("/str")) {
                class147.field2549 = -1;
            } else if (arg1.startsWith("u=")) {
                class213.field3251 = class193.field3038 & 0xFF000000 | class410.method2502(16, arg1.substring(2), (byte) 40);
            } else if (arg1.equals("u")) {
                class213.field3251 = class193.field3038 & 0xFF000000;
            } else if (arg1.equals("/u")) {
                class213.field3251 = -1;
            } else if (arg1.equalsIgnoreCase("shad=-1")) {
                class244.field3687 = 0;
            } else if (arg1.startsWith("shad=")) {
                class244.field3687 = class193.field3038 & 0xFF000000 | class410.method2502(16, arg1.substring(5), (byte) 40);
            } else if (arg1.equals("shad")) {
                class244.field3687 = class193.field3038 & 0xFF000000;
            } else if (arg1.equals("/shad")) {
                class244.field3687 = class437.field6308;
                return;
            } else if (arg1.equals("br")) {
                this.method2550(class437.field6308, class204.field3134, 19997);
                return;
            }
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIII[I[Lf;ILjava/lang/String;)V")
    public final void method2549(int arg0, int arg1, int arg2, int arg3, int[] arg4, class702[] arg5, int arg6, String arg7) {
        field6054++;
        if (arg7 != null) {
            this.method2550(arg1, arg2, 19997);
            this.method2563(arg7, 0, arg0, arg5, true, null, arg4, 0, arg6);
            int var9 = -34 / ((-arg3 - 71) / 42);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(III)V")
    private final void method2550(int arg0, int arg1, int arg2) {
        field6067++;
        class679.field9637 = 0;
        class204.field3134 = arg1;
        class193.field3038 = arg1;
        class213.field3251 = -1;
        class147.field2549 = -1;
        if (arg0 == -1) {
            arg0 = 0;
        }
        class326.field4772 = 0;
        if (arg2 != 19997) {
            this.method678('j', -109, -17, -105, true);
        }
        class437.field6308 = arg0;
        class244.field3687 = arg0;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIILjava/lang/String;III)V")
    public final void method2551(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5, int arg6, int arg7) {
        field6072++;
        if (arg4 == null) {
            return;
        }
        this.method2550(arg3, arg7, 19997);
        double var9 = 7.0D - ((double) arg5 / 8.0D);
        if (arg2 != 24719) {
            this.field6056 = null;
        }
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg4.length();
        int[] var12 = new int[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (Math.sin((double) var13 / 1.5D + (double) arg6) * var9);
        }
        this.method2552(null, arg0 - (this.field6056.method286(arg4, -5113) / 2), arg4, arg1, var12, -91, null, null);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([Lf;ILjava/lang/String;I[II[I[I)V")
    private final void method2552(class702[] arg0, int arg1, String arg2, int arg3, int[] arg4, int arg5, int[] arg6, int[] arg7) {
        field6065++;
        int var9 = arg3 - this.field6056.field568;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = -117 / (-arg5 / 59);
        int var14 = arg2.length();
        for (int var15 = 0; var15 < var14; var15++) {
            char var16 = (char) (class376.method2361(71, arg2.charAt(var15)) & 0xFF);
            if (var16 == '<') {
                var10 = var15;
            } else {
                if (var16 == '>' && var10 != -1) {
                    String var17 = arg2.substring(var10 + 1, var15);
                    var10 = -1;
                    if (var17.equals("lt")) {
                        var16 = '<';
                    } else if (var17.equals("gt")) {
                        var16 = '>';
                    } else if (var17.equals("nbsp")) {
                        var16 = ' ';
                    } else if (var17.equals("shy")) {
                        var16 = '\u00AD';
                    } else if (var17.equals("times")) {
                        var16 = '×';
                    } else if (var17.equals("euro")) {
                        var16 = '€';
                    } else if (var17.equals("copy")) {
                        var16 = '©';
                    } else {
                        if (!var17.equals("reg")) {
                            if (var17.startsWith("img=")) {
                                try {
                                    int var18;
                                    if (arg6 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg6[var12];
                                    }
                                    int var19;
                                    if (arg4 == null) {
                                        var19 = 0;
                                    } else {
                                        var19 = arg4[var12];
                                    }
                                    var12++;
                                    int var20 = class108.method975(var17.substring(4), -10426);
                                    class702 var21 = arg0[var20];
                                    int var22 = arg7 == null ? var21.method1789() : arg7[var20];
                                    var21.method1743(arg1 + var18, -var22 + var9 - -this.field6056.field568 + var19, 1, 0, 1);
                                    var11 = -1;
                                    arg1 += arg0[var20].method1784();
                                } catch (Exception var26) {
                                }
                            } else {
                                this.method2548((byte) 99, var17);
                            }
                            continue;
                        }
                        var16 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg1 += this.field6056.method291(80, var16, var11);
                    }
                    int var23;
                    if (arg6 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg6[var12];
                    }
                    int var24;
                    if (arg4 == null) {
                        var24 = 0;
                    } else {
                        var24 = arg4[var12];
                    }
                    if (var16 != ' ') {
                        if ((class244.field3687 & 0xFF000000) != 0) {
                            this.method678(var16, arg1 + var23 + 1, var9 - (-1 - var24), class244.field3687, true);
                        }
                        this.method678(var16, arg1 + var23, var9 + var24, class193.field3038, false);
                    } else if (class326.field4772 > 0) {
                        class679.field9637 += class326.field4772;
                        arg1 += class679.field9637 >> 8;
                        class679.field9637 &= 0xFF;
                    }
                    var12++;
                    int var25 = this.field6056.method288(var16, false);
                    if (class147.field2549 != -1) {
                        this.field6071.method1270(arg1, class147.field2549, var25, (byte) -32, var9 + ((int) ((double) this.field6056.field568 * 0.7D)));
                    }
                    if (class213.field3251 != -1) {
                        this.field6071.method1270(arg1, class213.field3251, var25, (byte) -32, this.field6056.field568 + var9);
                    }
                    var11 = var16;
                    arg1 += var25;
                }
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIILjava/lang/String;III)V")
    public final void method2553(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6) {
        field6055++;
        if (arg3 == null) {
            return;
        }
        this.method2550(arg0, arg1, 19997);
        if (arg4 > -84) {
            this.method2559(11, 103, -59, null, 80, -59);
        }
        int var8 = arg3.length();
        int[] var9 = new int[var8];
        for (int var10 = 0; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg2 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method2552(null, arg6 - (this.field6056.method286(arg3, -5113) / 2), arg3, arg5, var9, 93, null, null);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IILua;IIIILjava/lang/String;[I[Lf;IIIIII)I")
    public final int method2554(int arg0, int arg1, class619 arg2, int arg3, int arg4, int arg5, int arg6, String arg7, int[] arg8, class702[] arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        if (arg4 <= 71) {
            this.method2562(21, -65, 73, null, -7, 13);
        }
        field6057++;
        return this.method2555((byte) -42, arg10, arg3, arg2, arg13, arg7, arg15, arg12, arg9, arg0, arg5, arg1, 0, arg8, arg6, arg11, arg14);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BIILua;ILjava/lang/String;II[Lf;IIII[IIII)I")
    public final int method2555(byte arg0, int arg1, int arg2, class619 arg3, int arg4, String arg5, int arg6, int arg7, class702[] arg8, int arg9, int arg10, int arg11, int arg12, int[] arg13, int arg14, int arg15, int arg16) {
        field6058++;
        if (arg5 == null) {
            return 0;
        }
        this.method2550(arg9, arg10, arg0 + 20039);
        if (arg1 == 0) {
            arg1 = this.field6056.field568;
        }
        int[] var18;
        if (this.field6056.field575 + this.field6056.field564 + arg1 > arg14 && arg14 < arg1 + arg1) {
            var18 = null;
        } else {
            var18 = new int[] { arg15 };
        }
        int var19 = this.field6056.method297(class72.field1506, (byte) -109, var18, arg8, arg5);
        if (arg12 == -1) {
            arg12 = arg14 / arg1;
            if (arg12 <= 0) {
                arg12 = 1;
            }
        }
        if (arg12 > 0 && var19 >= arg12) {
            var19 = arg12;
            class72.field1506[arg12 - 1] = this.field6056.method287(arg8, 0, class72.field1506[arg12 - 1], arg15);
        }
        if (arg2 == 3 && var19 == 1) {
            arg2 = 1;
        }
        int var20;
        if (arg2 == 0) {
            var20 = this.field6056.field575 + arg11;
        } else if (arg2 == 1) {
            var20 = this.field6056.field575 + arg11 + ((-this.field6056.field575 - this.field6056.field564 + -((var19 + -1) * arg1) + arg14) / 2);
        } else if (arg2 == 2) {
            var20 = arg11 + arg14 - ((var19 + -1) * arg1) - this.field6056.field564;
        } else {
            int var21 = (arg14 - ((var19 - 1) * arg1) - this.field6056.field564 - this.field6056.field575) / (var19 + 1);
            if (var21 < 0) {
                var21 = 0;
            }
            arg1 += var21;
            var20 = this.field6056.field575 + arg11 + var21;
        }
        if (arg0 != -42) {
            return 91;
        }
        for (int var22 = 0; var22 < var19; var22++) {
            if (arg16 == 0) {
                this.method2563(class72.field1506[var22], arg6, var20, arg8, true, arg3, arg13, arg7, arg4);
            } else if (arg16 == 1) {
                this.method2563(class72.field1506[var22], arg6, var20, arg8, true, arg3, arg13, arg7, arg4 + (arg15 - this.field6056.method286(class72.field1506[var22], -5113)) / 2);
            } else if (arg16 == 2) {
                this.method2563(class72.field1506[var22], arg6, var20, arg8, true, arg3, arg13, arg7, arg15 + arg4 - this.field6056.method286(class72.field1506[var22], -5113));
            } else if ((var19 - 1) == var22) {
                this.method2563(class72.field1506[var22], arg6, var20, arg8, true, arg3, arg13, arg7, arg4);
            } else {
                this.method2556((byte) -114, class72.field1506[var22], arg15);
                this.method2563(class72.field1506[var22], arg6, var20, arg8, true, arg3, arg13, arg7, arg4);
                class326.field4772 = 0;
            }
            var20 += arg1;
        }
        return var19;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BLjava/lang/String;I)V")
    private final void method2556(byte arg0, String arg1, int arg2) {
        field6063++;
        int var4 = 0;
        boolean var5 = false;
        for (int var6 = 0; arg1.length() > var6; var6++) {
            char var7 = arg1.charAt(var6);
            if (var7 == '<') {
                var5 = true;
            } else if (var7 == '>') {
                var5 = false;
            } else if (!var5 && var7 == ' ') {
                var4++;
            }
        }
        if (var4 > 0) {
            class326.field4772 = (arg2 - this.field6056.method286(arg1, -5113) << 8) / var4;
        }
        if (arg0 >= -79) {
            this.field6056 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIII)I")
    public static final int method2557(int arg0, int arg1, int arg2, int arg3) {
        field6064++;
        if (~(class517.field7301[arg3][arg0][arg2] & 0x8) == arg1) {
            return arg3 <= 0 || (class517.field7301[1][arg0][arg2] & 0x2) == 0 ? arg3 : arg3 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;IIIBI)V")
    public final void method2558(String arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field6059++;
        if (arg0 != null) {
            this.method2550(arg5, arg2, 19997);
            this.method2563(arg0, 0, arg1, null, true, null, null, 0, arg3);
            int var7 = -124 % ((-arg4 - 74) / 52);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIILjava/lang/String;II)V")
    public final void method2559(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5) {
        field6066++;
        if (arg3 == null) {
            return;
        }
        if (arg4 != 23610) {
            this.method2553(106, 13, -60, null, 58, -33, 12);
        }
        this.method2550(arg1, arg5, 19997);
        this.method2563(arg3, 0, arg0, null, true, null, null, 0, arg2 - (this.field6056.method286(arg3, -5113) / 2));
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ZII)I")
    public static final int method2560(boolean arg0, int arg1, int arg2) {
        field6068++;
        int var3 = arg1 * 57 + arg2;
        int var4 = var3 ^ var3 << 13;
        int var5 = (var4 * var4 * 15731 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        if (arg0) {
            field6070 = 115;
        }
        return (var5 & 0x7F886BD) >> 19;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(CIIIZLua;II)V")
    public abstract void method676(char arg0, int arg1, int arg2, int arg3, boolean arg4, class619 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!la", name = "OA", descriptor = "(CIIIZ)V")
    public abstract void method678(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IILjava/lang/String;I[Lf;IILjava/util/Random;[II)I")
    public final int method2561(int arg0, int arg1, String arg2, int arg3, class702[] arg4, int arg5, int arg6, Random arg7, int[] arg8, int arg9) {
        field6060++;
        if (arg2 == null) {
            return 0;
        }
        arg7.setSeed((long) arg6);
        int var11 = (arg7.nextInt() & 0x1F) + 192;
        this.method2550(arg1 & 0xFFFFFF | var11 << 24, arg9 & 0xFFFFFF | var11 << 24, 19997);
        int var12 = arg2.length();
        int[] var13 = new int[var12];
        int var14 = 0;
        if (arg3 != -1) {
            return -59;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg7.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        this.method2552(arg4, arg5, arg2, arg0, null, arg3 + 119, var13, arg8);
        return var14;
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(IIILjava/lang/String;II)V")
    public final void method2562(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5) {
        field6062++;
        if (arg3 == null) {
            return;
        }
        this.method2550(arg2, arg0, 19997);
        if (arg4 < 47) {
            this.field6071 = null;
        }
        this.method2563(arg3, 0, arg5, null, true, null, null, 0, arg1 - this.field6056.method286(arg3, -5113));
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;II[Lf;ZLua;[III)V")
    private final void method2563(String arg0, int arg1, int arg2, class702[] arg3, boolean arg4, class619 arg5, int[] arg6, int arg7, int arg8) {
        field6061++;
        int var10 = arg2 - this.field6056.field568;
        int var11 = -1;
        int var12 = -1;
        int var13 = arg0.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class376.method2361(-101, arg0.charAt(var14)) & 0xFF);
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
                                    int var17 = class108.method975(var16.substring(4), -10426);
                                    class702 var18 = arg3[var17];
                                    int var19 = arg6 == null ? var18.method1789() : arg6[var17];
                                    if ((class193.field3038 & 0xFF000000) == -16777216) {
                                        var18.method1743(arg8, this.field6056.field568 + var10 - var19, 1, 0, 1);
                                    } else {
                                        var18.method1743(arg8, this.field6056.field568 + var10 - var19, 0, class193.field3038 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    var12 = -1;
                                    arg8 += arg3[var17].method1784();
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method2548((byte) 53, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg8 += this.field6056.method291(78, var15, var12);
                    }
                    if (var15 == ' ') {
                        if (class326.field4772 > 0) {
                            class679.field9637 += class326.field4772;
                            arg8 += class679.field9637 >> 8;
                            class679.field9637 &= 0xFF;
                        }
                    } else if (arg5 == null) {
                        if ((class244.field3687 & 0xFF000000) != 0) {
                            this.method678(var15, arg8 + 1, var10 + 1, class244.field3687, true);
                        }
                        this.method678(var15, arg8, var10, class193.field3038, false);
                    } else {
                        if ((class244.field3687 & 0xFF000000) != 0) {
                            this.method676(var15, arg8 + 1, var10 + 1, class244.field3687, true, arg5, arg7, arg1);
                        }
                        this.method676(var15, arg8, var10, class193.field3038, false, arg5, arg7, arg1);
                    }
                    int var20 = this.field6056.method288(var15, false);
                    if (class147.field2549 != -1) {
                        this.field6071.method1270(arg8, class147.field2549, var20, (byte) -32, (int) ((double) this.field6056.field568 * 0.7D) + var10);
                    }
                    if (class213.field3251 != -1) {
                        this.field6071.method1270(arg8, class213.field3251, var20, (byte) -32, var10 + this.field6056.field568 + 1);
                    }
                    arg8 += var20;
                    var12 = var15;
                }
            }
        }
        if (!arg4) {
            this.field6056 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lr;Ldaa;)V")
    public class421(class167 arg0, class11 arg1) {
        this.field6056 = arg1;
        this.field6071 = arg0;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIILjava/lang/String;II[Lf;II[IB[ILjava/util/Random;I)I")
    public final int method2564(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5, int arg6, class702[] arg7, int arg8, int arg9, int[] arg10, byte arg11, int[] arg12, Random arg13, int arg14) {
        field6069++;
        if (arg4 == null) {
            return 0;
        }
        arg13.setSeed((long) arg9);
        int var16 = (arg13.nextInt() & 0x1F) + 192;
        this.method2550(var16 << 24 | arg6 & 0xFFFFFF, arg3 & 0xFFFFFF | var16 << 24, 19997);
        int var17 = arg4.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg13.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        int var21 = arg0;
        int var22 = arg5 + this.field6056.field575;
        if (arg2 == 1) {
            var22 += (arg8 - this.field6056.field575 - this.field6056.field564) / 2;
        } else if (arg2 == 2) {
            var22 = arg5 + arg8 - this.field6056.field564;
        }
        int var23 = -1;
        if (arg1 == 1) {
            var23 = this.field6056.method286(arg4, -5113) + var19;
            var21 = (arg14 - var23) / 2 + arg0;
        } else if (arg1 == 2) {
            var23 = this.field6056.method286(arg4, -5113) + var19;
            var21 = arg14 + arg0 - var23;
        }
        this.method2552(arg7, var21, arg4, var22, null, 70, var18, arg12);
        int var24 = 86 / ((-arg11 - 76) / 49);
        if (arg10 != null) {
            if (var23 == -1) {
                var23 = this.field6056.method286(arg4, -5113) + var19;
            }
            arg10[1] = var22 - this.field6056.field575;
            arg10[3] = this.field6056.field575 + this.field6056.field564;
            arg10[0] = var21;
            arg10[2] = var23;
        }
        return var19;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IILjava/lang/String;IIIB)V")
    public final void method2565(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5, byte arg6) {
        field6073++;
        if (arg2 == null) {
            return;
        }
        this.method2550(arg1, arg0, 19997);
        int var8 = arg2.length();
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg5 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg5 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method2552(null, arg4 - (this.field6056.method286(arg2, -5113) / 2), arg2, arg3, var10, 79, var9, null);
        int var12 = -4 / ((arg6 - 50) / 41);
    }
}
