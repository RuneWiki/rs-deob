import java.awt.Canvas;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public abstract class class262 {

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "Lqa;")
    private class167 field3338;

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "Lpe;")
    private class157 field3340;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
    public static int field3333 = 0;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    public static int field3332;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "I")
    public static int field3348;

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!ra", name = "u", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/lang/String;IIIIIII)V")
    public final void method1608(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3339++;
        if (arg0 == null) {
            return;
        }
        this.method1619(arg3, arg6, arg4 - 2);
        double var9 = 7.0D - ((double) arg1 / 8.0D);
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg0.length();
        int[] var12 = new int[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (Math.sin((double) var13 / 1.5D + (double) arg7) * var9);
        }
        this.method1615(arg0, arg2 - (this.field3340.method856(arg4 ^ 0x2, arg0) / arg4), (byte) -8, arg5, null, var12, null, null);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIII[I[Lha;BLjava/util/Random;Ljava/lang/String;I)I")
    public final int method1609(int arg0, int arg1, int arg2, int arg3, int[] arg4, class116[] arg5, byte arg6, Random arg7, String arg8, int arg9) {
        field3332++;
        if (arg8 == null) {
            return 0;
        }
        arg7.setSeed((long) arg2);
        int var11 = (arg7.nextInt() & 0x1F) + 192;
        this.method1619(var11 << 24 | arg3 & 0xFFFFFF, var11 << 24 | arg9 & 0xFFFFFF, 0);
        int var12 = arg8.length();
        int var13 = 28 / ((-arg6 - 60) / 61);
        int[] var14 = new int[var12];
        int var15 = 0;
        for (int var16 = 0; var16 < var12; var16++) {
            var14[var16] = var15;
            if ((arg7.nextInt() & 0x3) == 0) {
                var15++;
            }
        }
        this.method1615(arg8, arg1, (byte) -9, arg0, arg5, null, arg4, var14);
        return var15;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([IIILjava/lang/String;ILpa;II[Lha;)V")
    private final void method1610(int[] arg0, int arg1, int arg2, String arg3, int arg4, class594 arg5, int arg6, int arg7, class116[] arg8) {
        field3345++;
        int var10 = arg6 - this.field3340.field2042;
        int var11 = -1;
        int var12 = -1;
        int var13 = arg3.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class373.method2274(false, arg3.charAt(var14)) & 0xFF);
            if (var15 == '<') {
                var11 = var14;
            } else {
                if (var15 == '>' && var11 != -1) {
                    String var16 = arg3.substring(var11 + 1, var14);
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
                                    int var17 = class254.method1532(var16.substring(4), 2);
                                    class116 var18 = arg8[var17];
                                    int var19 = arg0 == null ? var18.method631() : arg0[var17];
                                    if ((class342.field4756 & 0xFF000000) == -16777216) {
                                        var18.method633(arg2, var10 + this.field3340.field2042 - var19, 1, 0, 1);
                                    } else {
                                        var18.method633(arg2, var10 + this.field3340.field2042 - var19, 0, class342.field4756 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    var12 = -1;
                                    arg2 += arg8[var17].method627();
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method1624((byte) -111, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg2 += this.field3340.method852(0, var12, var15);
                    }
                    if (var15 == ' ') {
                        if (class241.field3063 > 0) {
                            class425.field5750 += class241.field3063;
                            arg2 += class425.field5750 >> 8;
                            class425.field5750 &= 0xFF;
                        }
                    } else if (arg5 == null) {
                        if ((class225.field2881 & 0xFF000000) != 0) {
                            this.method487(var15, arg2 + 1, var10 + 1, class225.field2881, true);
                        }
                        this.method487(var15, arg2, var10, class342.field4756, false);
                    } else {
                        if ((class225.field2881 & 0xFF000000) != 0) {
                            this.method488(var15, arg2 + 1, var10 + 1, class225.field2881, true, arg5, arg7, arg1);
                        }
                        this.method488(var15, arg2, var10, class342.field4756, false, arg5, arg7, arg1);
                    }
                    int var20 = this.field3340.method860(var15, 32);
                    if (class286.field3753 != -1) {
                        this.field3338.method967((int) ((double) this.field3340.field2042 * 0.7D) + var10, class286.field3753, -109, arg2, var20);
                    }
                    if (class124.field1546 != -1) {
                        this.field3338.method967(this.field3340.field2042 + var10 + 1, class124.field1546, 44, arg2, var20);
                    }
                    var12 = var15;
                    arg2 += var20;
                }
            }
        }
        if (arg4 <= 118) {
            this.method1623(-16, 41, 109, -31, -62, null);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIILjava/lang/String;III)V")
    public final void method1611(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6) {
        field3344++;
        if (arg3 == null) {
            return;
        }
        this.method1619(arg5, arg4, 0);
        if (arg2 > -47) {
            this.field3338 = null;
        }
        int var8 = arg3.length();
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg6 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg6 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method1615(arg3, arg1 - (this.field3340.method856(0, arg3) / 2), (byte) -103, arg0, null, var10, null, var9);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(II[I[Lha;IIIBIILpa;ILjava/lang/String;IIII)I")
    public final int method1612(int arg0, int arg1, int[] arg2, class116[] arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9, class594 arg10, int arg11, String arg12, int arg13, int arg14, int arg15, int arg16) {
        field3335++;
        if (arg12 == null) {
            return 0;
        }
        this.method1619(arg13, arg0, 0);
        if (arg5 == 0) {
            arg5 = this.field3340.field2042;
        }
        int[] var18;
        if (arg11 < (this.field3340.field2028 - (-this.field3340.field2037 - arg5)) && arg5 + arg5 > arg11) {
            var18 = null;
        } else {
            var18 = new int[] { arg8 };
        }
        int var19 = this.field3340.method859(arg12, arg3, var18, 103, class137.field1716);
        if (arg9 == -1) {
            arg9 = arg11 / arg5;
            if (arg9 <= 0) {
                arg9 = 1;
            }
        }
        if (arg9 > 0 && var19 >= arg9) {
            class137.field1716[arg9 - 1] = this.field3340.method851(arg3, arg8, class137.field1716[arg9 - 1], -1);
            var19 = arg9;
        }
        if (arg16 == 3 && var19 == 1) {
            arg16 = 1;
        }
        int var20;
        if (arg16 == 0) {
            var20 = this.field3340.field2028 + arg15;
        } else if (arg16 == 1) {
            var20 = (arg11 - this.field3340.field2028 - (this.field3340.field2037 - -((var19 + -1) * arg5))) / 2 + arg15 + this.field3340.field2028;
        } else if (arg16 == 2) {
            var20 = arg11 + arg15 - ((var19 - 1) * arg5) - this.field3340.field2037;
        } else {
            int var21 = (arg11 - this.field3340.field2037 - (var19 - 1) * arg5 - this.field3340.field2028) / (var19 + 1);
            if (var21 < 0) {
                var21 = 0;
            }
            var20 = this.field3340.field2028 + arg15 + var21;
            arg5 += var21;
        }
        for (int var22 = 0; var22 < var19; var22++) {
            if (arg6 == 0) {
                this.method1610(arg2, arg4, arg14, class137.field1716[var22], 122, arg10, var20, arg1, arg3);
            } else if (arg6 == 1) {
                this.method1610(arg2, arg4, arg14 + (arg8 - this.field3340.method856(0, class137.field1716[var22])) / 2, class137.field1716[var22], 125, arg10, var20, arg1, arg3);
            } else if (arg6 == 2) {
                this.method1610(arg2, arg4, arg8 + arg14 - this.field3340.method856(0, class137.field1716[var22]), class137.field1716[var22], 121, arg10, var20, arg1, arg3);
            } else if (var19 - 1 == var22) {
                this.method1610(arg2, arg4, arg14, class137.field1716[var22], 124, arg10, var20, arg1, arg3);
            } else {
                this.method1625(-94, arg8, class137.field1716[var22]);
                this.method1610(arg2, arg4, arg14, class137.field1716[var22], 126, arg10, var20, arg1, arg3);
                class241.field3063 = 0;
            }
            var20 += arg5;
        }
        if (arg7 < 69) {
            this.method1618(-102, 25, 9, (byte) 89, 0, null);
        }
        return var19;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIILqh;)V")
    public static final void method1613(int arg0, int arg1, int arg2, int arg3, class293 arg4) {
        class563 var5 = class423.method2492(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        int var6 = 0;
        arg4.field3816 = (arg1 << class400.field5480) + class337.field4699;
        arg4.field3814 = arg3;
        arg4.field3820 = (arg2 << class400.field5480) + class337.field4699;
        for (class15 var7 = var5.field7894; var7 != null; var7 = var7.field158) {
            if (var7.field161.field6355) {
                int var8 = var7.field161.method103((byte) -101);
                if (var8 != -32768 && var8 < var6) {
                    var6 = var8;
                }
            }
        }
        if (var6 < 0) {
            arg4.field3814 += var6;
            arg4.field3822 = true;
        } else if (var5.field7891 != null) {
            arg4.field3814 -= var5.field7891.field3131;
        }
        var5.field7895 = arg4;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V")
    public final void method1614(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3350++;
        if (arg0 == null) {
            return;
        }
        this.method1619(arg5, arg3, 0);
        int var8 = arg0.length();
        int[] var9 = new int[var8];
        if (arg2 > -40) {
            field3333 = -44;
        }
        for (int var10 = 0; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg4 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method1615(arg0, arg1 - (this.field3340.method856(0, arg0) / 2), (byte) 2, arg6, null, var9, null, null);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/lang/String;IBI[Lha;[I[I[I)V")
    private final void method1615(String arg0, int arg1, byte arg2, int arg3, class116[] arg4, int[] arg5, int[] arg6, int[] arg7) {
        int var9 = 76 / ((arg2 + 54) / 44);
        field3337++;
        int var10 = arg3 - this.field3340.field2042;
        int var11 = -1;
        int var12 = -1;
        int var13 = 0;
        int var14 = arg0.length();
        for (int var15 = 0; var15 < var14; var15++) {
            char var16 = (char) (class373.method2274(false, arg0.charAt(var15)) & 0xFF);
            if (var16 == '<') {
                var11 = var15;
            } else {
                if (var16 == '>' && var11 != -1) {
                    String var17 = arg0.substring(var11 + 1, var15);
                    var11 = -1;
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
                                    if (arg7 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg7[var13];
                                    }
                                    int var19;
                                    if (arg5 == null) {
                                        var19 = 0;
                                    } else {
                                        var19 = arg5[var13];
                                    }
                                    var13++;
                                    int var20 = class254.method1532(var17.substring(4), 2);
                                    class116 var21 = arg4[var20];
                                    int var22 = arg6 == null ? var21.method631() : arg6[var20];
                                    var21.method633(arg1 + var18, this.field3340.field2042 + var10 + var19 + -var22, 1, 0, 1);
                                    var12 = -1;
                                    arg1 += arg4[var20].method627();
                                } catch (Exception var26) {
                                }
                            } else {
                                this.method1624((byte) -114, var17);
                            }
                            continue;
                        }
                        var16 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg1 += this.field3340.method852(0, var12, var16);
                    }
                    int var23;
                    if (arg7 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg7[var13];
                    }
                    int var24;
                    if (arg5 == null) {
                        var24 = 0;
                    } else {
                        var24 = arg5[var13];
                    }
                    if (var16 != ' ') {
                        if ((class225.field2881 & 0xFF000000) != 0) {
                            this.method487(var16, arg1 + var23 + 1, var10 - -1 + var24, class225.field2881, true);
                        }
                        this.method487(var16, arg1 + var23, var10 - -var24, class342.field4756, false);
                    } else if (class241.field3063 > 0) {
                        class425.field5750 += class241.field3063;
                        arg1 += class425.field5750 >> 8;
                        class425.field5750 &= 0xFF;
                    }
                    var13++;
                    int var25 = this.field3340.method860(var16, 32);
                    if (class286.field3753 != -1) {
                        this.field3338.method967((int) ((double) this.field3340.field2042 * 0.7D) + var10, class286.field3753, -104, arg1, var25);
                    }
                    if (class124.field1546 != -1) {
                        this.field3338.method967(this.field3340.field2042 + var10, class124.field1546, 36, arg1, var25);
                    }
                    arg1 += var25;
                    var12 = var16;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/util/Random;[IIIII[Lha;IIILjava/lang/String;II[II)I")
    public final int method1616(Random arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, class116[] arg6, int arg7, int arg8, int arg9, String arg10, int arg11, int arg12, int[] arg13, int arg14) {
        field3348++;
        if (arg10 == null) {
            return 0;
        }
        arg0.setSeed((long) arg8);
        int var16 = (arg0.nextInt() & 0x1F) + arg7;
        this.method1619(arg3 & 0xFFFFFF | var16 << 24, var16 << 24 | arg11 & 0xFFFFFF, 0);
        int var17 = arg10.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg0.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        int var21 = arg4;
        int var22 = arg5 + this.field3340.field2028;
        int var23 = -1;
        if (arg12 == 1) {
            var22 += (arg9 - this.field3340.field2037 - this.field3340.field2028) / 2;
        } else if (arg12 == 2) {
            var22 = arg9 + arg5 - this.field3340.field2037;
        }
        if (arg2 == 1) {
            var23 = var19 + this.field3340.method856(0, arg10);
            var21 = (arg14 - var23) / 2 + arg4;
        } else if (arg2 == 2) {
            var23 = this.field3340.method856(0, arg10) + var19;
            var21 = arg14 + arg4 - var23;
        }
        this.method1615(arg10, var21, (byte) -102, var22, arg6, null, arg13, var18);
        if (arg1 != null) {
            if (var23 == -1) {
                var23 = var19 + this.field3340.method856(arg7 - 192, arg10);
            }
            arg1[2] = var23;
            arg1[0] = var21;
            arg1[3] = this.field3340.field2037 + this.field3340.field2028;
            arg1[1] = var22 - this.field3340.field2028;
        }
        return var19;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILjava/lang/String;IIII[Lha;IILpa;II[IIII)I")
    public final int method1617(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5, class116[] arg6, int arg7, int arg8, class594 arg9, int arg10, int arg11, int[] arg12, int arg13, int arg14, int arg15) {
        if (arg2 != 0) {
            this.method1620(91, 106, 4, 69, null, null, -59, null);
        }
        field3330++;
        return this.method1612(arg4, arg5, arg12, arg6, arg13, arg10, arg7, (byte) 96, arg15, 0, arg9, arg8, arg1, arg14, arg11, arg0, arg3);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIBILjava/lang/String;)V")
    public final void method1618(int arg0, int arg1, int arg2, byte arg3, int arg4, String arg5) {
        field3336++;
        if (arg3 >= -109) {
            this.field3338 = null;
        }
        if (arg5 != null) {
            this.method1619(arg1, arg0, 0);
            this.method1610(null, 0, arg4 - (this.field3340.method856(0, arg5) / 2), arg5, 125, null, arg2, 0, null);
        }
    }

    @OriginalMember(owner = "client!ra", name = "HA", descriptor = "(CIIIZ)V")
    public abstract void method487(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(III)V")
    private final void method1619(int arg0, int arg1, int arg2) {
        if (arg0 == -1) {
            arg0 = 0;
        }
        class425.field5750 = arg2;
        class241.field3063 = 0;
        class286.field3753 = -1;
        field3346++;
        class312.field3990 = arg1;
        class342.field4756 = arg1;
        class124.field1546 = -1;
        class132.field1634 = arg0;
        class225.field2881 = arg0;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIII[ILjava/lang/String;I[Lha;)V")
    public final void method1620(int arg0, int arg1, int arg2, int arg3, int[] arg4, String arg5, int arg6, class116[] arg7) {
        field3331++;
        if (arg5 != null && arg3 == 20730) {
            this.method1619(arg6, arg2, 0);
            this.method1610(arg4, 0, arg0, arg5, arg3 ^ 0x5084, null, arg1, 0, arg7);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(FIF[FIIIIIII)V")
    public static final void method1621(float arg0, int arg1, float arg2, float[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = arg8 - arg7;
        int var12 = arg9 - arg5;
        field3347++;
        int var13 = arg10 - arg4;
        float var14 = arg3[2] * (float) var11 + arg3[0] * (float) var12 + arg3[1] * (float) var13;
        float var15 = arg3[5] * (float) var11 + arg3[4] * (float) var13 + arg3[3] * (float) var12;
        float var16 = arg3[8] * (float) var11 + arg3[7] * (float) var13 + arg3[6] * (float) var12;
        float var17 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        if (arg1 != -9546) {
            field3333 = 110;
        }
        if (arg0 != 1.0F) {
            var17 = arg0 * var17;
        }
        float var18 = var15 + arg2 + 0.5F;
        if (arg6 == 1) {
            float var19 = var17;
            var17 = -var18;
            var18 = var19;
        } else if (arg6 == 2) {
            var18 = -var18;
            var17 = -var17;
        } else if (arg6 == 3) {
            float var20 = var17;
            var17 = var18;
            var18 = -var20;
        }
        class6.field53 = var18;
        class27.field454 = var17;
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lqa;Lpe;)V")
    public class262(class167 arg0, class157 arg1) {
        this.field3338 = arg0;
        this.field3340 = arg1;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ln;IILjava/awt/Canvas;)Lqa;")
    public static final class167 method1622(class473 arg0, int arg1, int arg2, Canvas arg3) {
        field3343++;
        return arg1 == -1698792760 ? new class313(arg3, arg0, arg2) : null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(CIIIZLpa;II)V")
    public abstract void method488(char arg0, int arg1, int arg2, int arg3, boolean arg4, class594 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIILjava/lang/String;)V")
    public final void method1623(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5) {
        field3342++;
        if (arg5 == null) {
            return;
        }
        this.method1619(arg3, arg0, 0);
        this.method1610(null, 0, arg4 - this.field3340.method856(arg1 ^ 0xA9, arg5), arg5, arg1 ^ 0xD5, null, arg2, 0, null);
        if (arg1 != 169) {
            this.method1611(44, 111, -19, null, 98, -127, -103);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BLjava/lang/String;)V")
    private final void method1624(byte arg0, String arg1) {
        field3334++;
        if (arg0 > -105) {
            method1622(null, 45, -7, null);
        }
        try {
            if (arg1.startsWith("col=")) {
                class342.field4756 = class342.field4756 & 0xFF000000 | class239.method1493(arg1.substring(4), 16, true) & 0xFFFFFF;
            } else if (arg1.equals("/col")) {
                class342.field4756 = class342.field4756 & 0xFF000000 | class312.field3990 & 0xFFFFFF;
            }
            if (arg1.startsWith("argb=")) {
                class342.field4756 = class239.method1493(arg1.substring(5), 16, true);
            } else if (arg1.equals("/argb")) {
                class342.field4756 = class312.field3990;
            } else if (arg1.startsWith("str=")) {
                class286.field3753 = class342.field4756 & 0xFF000000 | class239.method1493(arg1.substring(4), 16, true);
            } else if (arg1.equals("str")) {
                class286.field3753 = class342.field4756 & 0xFF000000 | 0x800000;
            } else if (arg1.equals("/str")) {
                class286.field3753 = -1;
            } else if (arg1.startsWith("u=")) {
                class124.field1546 = class342.field4756 & 0xFF000000 | class239.method1493(arg1.substring(2), 16, true);
            } else if (arg1.equals("u")) {
                class124.field1546 = class342.field4756 & 0xFF000000;
            } else if (arg1.equals("/u")) {
                class124.field1546 = -1;
            } else if (arg1.equalsIgnoreCase("shad=-1")) {
                class225.field2881 = 0;
            } else if (arg1.startsWith("shad=")) {
                class225.field2881 = class342.field4756 & 0xFF000000 | class239.method1493(arg1.substring(5), 16, true);
            } else if (arg1.equals("shad")) {
                class225.field2881 = class342.field4756 & 0xFF000000;
            } else if (arg1.equals("/shad")) {
                class225.field2881 = class132.field1634;
                return;
            } else if (arg1.equals("br")) {
                this.method1619(class132.field1634, class312.field3990, 0);
                return;
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IILjava/lang/String;)V")
    private final void method1625(int arg0, int arg1, String arg2) {
        field3349++;
        int var4 = -61 / ((arg0 + 31) / 55);
        int var5 = 0;
        boolean var6 = false;
        for (int var7 = 0; var7 < arg2.length(); var7++) {
            char var8 = arg2.charAt(var7);
            if (var8 == '<') {
                var6 = true;
            } else if (var8 == '>') {
                var6 = false;
            } else if (!var6 && var8 == ' ') {
                var5++;
            }
        }
        if (var5 > 0) {
            class241.field3063 = (arg1 - this.field3340.method856(0, arg2) << 8) / var5;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILjava/lang/String;IIBI)V")
    public final void method1626(int arg0, String arg1, int arg2, int arg3, byte arg4, int arg5) {
        if (arg4 != -16) {
            return;
        }
        field3341++;
        if (arg1 != null) {
            this.method1619(arg0, arg2, 0);
            this.method1610(null, 0, arg5, arg1, arg4 ^ 0xFFFFFF8F, null, arg3, 0, null);
        }
    }
}
