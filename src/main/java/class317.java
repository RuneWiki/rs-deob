import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public abstract class class317 {

    @OriginalMember(owner = "client!la", name = "p", descriptor = "Lza;")
    private class288 field4817;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "Lfj;")
    private class470 field4803;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "Lbj;")
    public static class162 field4802 = new class162(43, 0);

    @OriginalMember(owner = "client!la", name = "s", descriptor = "[Ljava/lang/String;")
    public static String[] field4820 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!la", name = "t", descriptor = "[Ljava/lang/String;")
    public static String[] field4821 = new String[100];

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public static int field4804;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    public static int field4805;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public static int field4806;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "I")
    public static int field4807;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    public static int field4808;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "I")
    public static int field4809;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "I")
    public static int field4810;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "I")
    public static int field4811;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "I")
    public static int field4812;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "I")
    public static int field4813;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "I")
    public static int field4814;

    @OriginalMember(owner = "client!la", name = "n", descriptor = "I")
    public static int field4815;

    @OriginalMember(owner = "client!la", name = "o", descriptor = "I")
    public static int field4816;

    @OriginalMember(owner = "client!la", name = "q", descriptor = "I")
    public static int field4818;

    @OriginalMember(owner = "client!la", name = "r", descriptor = "I")
    public static int field4819;

    @OriginalMember(owner = "client!la", name = "u", descriptor = "I")
    public static int field4822;

    @OriginalMember(owner = "client!la", name = "v", descriptor = "I")
    public static int field4823;

    @OriginalMember(owner = "client!la", name = "w", descriptor = "I")
    public static int field4824;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([Lo;[IIILta;IILjava/lang/String;I)V", line = 6)
    private final void method1999(class24[] arg0, int[] arg1, int arg2, int arg3, class144 arg4, int arg5, int arg6, String arg7, int arg8) {
        field4815++;
        int var10 = arg2 - this.field4803.field6977;
        if (arg8 != 28091) {
            this.method2007(7, null, null, 23, 14, 99, 90, null);
        }
        int var11 = -1;
        int var12 = -1;
        int var13 = arg7.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class260.method1671(7763, arg7.charAt(var14)) & 0xFF);
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
                                    int var17 = class19.method129(-94, var16.substring(4));
                                    class24 var18 = arg0[var17];
                                    int var19 = arg1 == null ? var18.method165() : arg1[var17];
                                    if ((class518.field7515 & 0xFF000000) == -16777216) {
                                        var18.method167(arg6, var10 - (var19 - this.field4803.field6977), 1, 0, 1);
                                    } else {
                                        var18.method167(arg6, var10 + this.field4803.field6977 - var19, 0, class518.field7515 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    arg6 += arg0[var17].method147();
                                    var12 = -1;
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method2013(arg8 - 28164, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg6 += this.field4803.method2806(true, var15, var12);
                    }
                    if (var15 == ' ') {
                        if (class339.field5105 > 0) {
                            class298.field4516 += class339.field5105;
                            arg6 += class298.field4516 >> 8;
                            class298.field4516 &= 0xFF;
                        }
                    } else if (arg4 == null) {
                        if ((class492.field7210 & 0xFF000000) != 0) {
                            this.method214(var15, arg6 + 1, var10 - -1, class492.field7210, true);
                        }
                        this.method214(var15, arg6, var10, class518.field7515, false);
                    } else {
                        if ((class492.field7210 & 0xFF000000) != 0) {
                            this.method213(var15, arg6 + 1, var10 + 1, class492.field7210, true, arg4, arg5, arg3);
                        }
                        this.method213(var15, arg6, var10, class518.field7515, false, arg4, arg5, arg3);
                    }
                    int var20 = this.field4803.method2807(255, var15);
                    if (class114.field2065 != -1) {
                        this.field4817.method1810(var20, class114.field2065, (byte) 84, (int) ((double) this.field4803.field6977 * 0.7D) + var10, arg6);
                    }
                    if (class416.field6276 != -1) {
                        this.field4817.method1810(var20, class416.field6276, (byte) -71, this.field4803.field6977 + var10 + 1, arg6);
                    }
                    var12 = var15;
                    arg6 += var20;
                }
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 157)
    private final void method2000(String arg0, int arg1, int arg2) {
        field4822++;
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
        if (var4 > arg2) {
            class339.field5105 = (arg1 - this.field4803.method2808(arg0, -83) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;IIIIZ)V", line = 192)
    public final void method2001(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field4806++;
        if (arg1 == null) {
            return;
        }
        this.method2016(arg5, 160, arg3);
        int var8 = arg1.length();
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg0 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg0 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method2005(var9, null, arg1, arg2, arg4 - (this.field4803.method2808(arg1, -102) / 2), null, var10, 105);
        if (!arg6) {
            field4802 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIBLjava/util/Random;[Lo;[ILjava/lang/String;IIIII[I)I", line = 224)
    public final int method2002(int arg0, int arg1, int arg2, int arg3, byte arg4, Random arg5, class24[] arg6, int[] arg7, String arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int[] arg14) {
        field4813++;
        if (arg8 == null) {
            return 0;
        }
        arg5.setSeed((long) arg10);
        int var16 = (arg5.nextInt() & 0x1F) + 192;
        this.method2016(arg11 & 0xFFFFFF | var16 << 24, 160, arg1 & 0xFFFFFF | var16 << 24);
        int var17 = arg8.length();
        int[] var18 = new int[var17];
        if (arg4 > -81) {
            return -22;
        }
        int var19 = 0;
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg5.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        int var21 = arg9;
        int var22 = arg12 + this.field4803.field6972;
        if (arg3 == 1) {
            var22 += (arg2 - this.field4803.field6972 - this.field4803.field6963) / 2;
        } else if (arg3 == 2) {
            var22 = arg12 - (this.field4803.field6963 - arg2);
        }
        int var23 = -1;
        if (arg0 == 1) {
            var23 = var19 + this.field4803.method2808(arg8, -102);
            var21 = (arg13 - var23) / 2 + arg9;
        } else if (arg0 == 2) {
            var23 = this.field4803.method2808(arg8, -68) + var19;
            var21 = arg13 + arg9 - var23;
        }
        this.method2005(var18, arg6, arg8, var22, var21, arg7, null, 96);
        if (arg14 != null) {
            if (var23 == -1) {
                var23 = var19 + this.field4803.method2808(arg8, -109);
            }
            arg14[0] = var21;
            arg14[3] = this.field4803.field6972 + this.field4803.field6963;
            arg14[1] = var22 - this.field4803.field6972;
            arg14[2] = var23;
        }
        return var19;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lta;[Lo;II[IIIIBIIILjava/lang/String;IIII)I", line = 303)
    public final int method2003(class144 arg0, class24[] arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, byte arg8, int arg9, int arg10, int arg11, String arg12, int arg13, int arg14, int arg15, int arg16) {
        field4804++;
        if (arg12 == null) {
            return 0;
        }
        this.method2016(arg5, 160, arg2);
        if (arg9 == 0) {
            arg9 = this.field4803.field6977;
        }
        int var18 = -118 % ((53 - arg8) / 57);
        int[] var19;
        if ((this.field4803.field6972 + arg9 + this.field4803.field6963) > arg15 && (arg9 + arg9) > arg15) {
            var19 = null;
        } else {
            var19 = new int[] { arg14 };
        }
        int var20 = this.field4803.method2817((byte) 122, class212.field3379, arg12, arg1, var19);
        if (arg11 == -1) {
            arg11 = arg15 / arg9;
            if (arg11 <= 0) {
                arg11 = 1;
            }
        }
        if (arg11 > 0 && var20 >= arg11) {
            class212.field3379[arg11 - 1] = this.field4803.method2816(arg1, arg14, class212.field3379[arg11 - 1], -1);
            var20 = arg11;
        }
        if (arg16 == 3 && var20 == 1) {
            arg16 = 1;
        }
        int var21;
        if (arg16 == 0) {
            var21 = this.field4803.field6972 + arg6;
        } else if (arg16 == 1) {
            var21 = arg6 + ((arg15 - this.field4803.field6972 - this.field4803.field6963 - ((var20 + -1) * arg9)) / 2) + this.field4803.field6972;
        } else if (arg16 == 2) {
            var21 = arg6 + arg15 - this.field4803.field6963 - ((var20 - 1) * arg9);
        } else {
            int var22 = (arg15 - ((var20 - 1) * arg9) - this.field4803.field6972 - this.field4803.field6963) / (var20 + 1);
            if (var22 < 0) {
                var22 = 0;
            }
            arg9 += var22;
            var21 = this.field4803.field6972 + arg6 + var22;
        }
        for (int var23 = 0; var23 < var20; var23++) {
            if (arg13 == 0) {
                this.method1999(arg1, arg4, var21, arg10, arg0, arg7, arg3, class212.field3379[var23], 28091);
            } else if (arg13 == 1) {
                this.method1999(arg1, arg4, var21, arg10, arg0, arg7, arg3 + (arg14 - this.field4803.method2808(class212.field3379[var23], -87)) / 2, class212.field3379[var23], 28091);
            } else if (arg13 == 2) {
                this.method1999(arg1, arg4, var21, arg10, arg0, arg7, arg3 - (this.field4803.method2808(class212.field3379[var23], -64) - arg14), class212.field3379[var23], 28091);
            } else if (var20 - 1 == var23) {
                this.method1999(arg1, arg4, var21, arg10, arg0, arg7, arg3, class212.field3379[var23], 28091);
            } else {
                this.method2000(class212.field3379[var23], arg14, 0);
                this.method1999(arg1, arg4, var21, arg10, arg0, arg7, arg3, class212.field3379[var23], 28091);
                class339.field5105 = 0;
            }
            var21 += arg9;
        }
        return var20;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIILjava/lang/String;I)V", line = 407)
    public final void method2004(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, int arg6) {
        field4810++;
        if (arg5 == null) {
            return;
        }
        this.method2016(arg6, 160, arg3);
        if (arg0 != -7094) {
            return;
        }
        int var8 = arg5.length();
        int[] var9 = new int[var8];
        for (int var10 = 0; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg1 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method2005(null, null, arg5, arg2, arg4 - (this.field4803.method2808(arg5, arg0 ^ 0x1BD8) / 2), null, var9, arg0 ^ 0x1B8C);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([I[Lo;Ljava/lang/String;II[I[II)V", line = 433)
    private final void method2005(int[] arg0, class24[] arg1, String arg2, int arg3, int arg4, int[] arg5, int[] arg6, int arg7) {
        int var9 = arg3 - this.field4803.field6977;
        int var10 = 105 / ((arg7 - 11) / 53);
        field4812++;
        int var11 = -1;
        int var12 = -1;
        int var13 = 0;
        int var14 = arg2.length();
        for (int var15 = 0; var15 < var14; var15++) {
            char var16 = (char) (class260.method1671(7763, arg2.charAt(var15)) & 0xFF);
            if (var16 == '<') {
                var11 = var15;
            } else {
                if (var16 == '>' && var11 != -1) {
                    String var17 = arg2.substring(var11 + 1, var15);
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
                                    if (arg0 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg0[var13];
                                    }
                                    int var19;
                                    if (arg6 == null) {
                                        var19 = 0;
                                    } else {
                                        var19 = arg6[var13];
                                    }
                                    var13++;
                                    int var20 = class19.method129(-118, var17.substring(4));
                                    class24 var21 = arg1[var20];
                                    int var22 = arg5 == null ? var21.method165() : arg5[var20];
                                    var21.method167(arg4 + var18, this.field4803.field6977 + var9 + -var22 - -var19, 1, 0, 1);
                                    arg4 += arg1[var20].method147();
                                    var12 = -1;
                                } catch (Exception var26) {
                                }
                            } else {
                                this.method2013(-95, var17);
                            }
                            continue;
                        }
                        var16 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg4 += this.field4803.method2806(true, var16, var12);
                    }
                    int var23;
                    if (arg0 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg0[var13];
                    }
                    int var24;
                    if (arg6 == null) {
                        var24 = 0;
                    } else {
                        var24 = arg6[var13];
                    }
                    var13++;
                    if (var16 != ' ') {
                        if ((class492.field7210 & 0xFF000000) != 0) {
                            this.method214(var16, arg4 + var23 + 1, var9 - -var24 + 1, class492.field7210, true);
                        }
                        this.method214(var16, arg4 + var23, var9 + var24, class518.field7515, false);
                    } else if (class339.field5105 > 0) {
                        class298.field4516 += class339.field5105;
                        arg4 += class298.field4516 >> 8;
                        class298.field4516 &= 0xFF;
                    }
                    int var25 = this.field4803.method2807(255, var16);
                    if (class114.field2065 != -1) {
                        this.field4817.method1810(var25, class114.field2065, (byte) 121, (int) ((double) this.field4803.field6977 * 0.7D) + var9, arg4);
                    }
                    if (class416.field6276 != -1) {
                        this.field4817.method1810(var25, class416.field6276, (byte) 117, this.field4803.field6977 + var9, arg4);
                    }
                    var12 = var16;
                    arg4 += var25;
                }
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIILjava/lang/String;IIII)V", line = 596)
    public final void method2006(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6, int arg7) {
        field4809++;
        if (arg3 == null) {
            return;
        }
        this.method2016(arg7, 160, arg2);
        double var9 = 7.0D - ((double) arg6 / 8.0D);
        if (arg5 != -3) {
            return;
        }
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg3.length();
        int[] var12 = new int[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (Math.sin((double) var13 / 1.5D + (double) arg4) * var9);
        }
        this.method2005(null, null, arg3, arg0, arg1 - this.field4803.method2808(arg3, arg5 - 115) / 2, null, var12, 114);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I[Lo;Ljava/lang/String;IIII[I)V", line = 637)
    public final void method2007(int arg0, class24[] arg1, String arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7) {
        field4818++;
        if (arg2 == null) {
            return;
        }
        this.method2016(arg0, 160, arg4);
        if (arg3 != 1) {
            field4820 = null;
        }
        this.method1999(arg1, arg7, arg5, 0, null, 0, arg6, arg2, 28091);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V", line = 653)
    public static final void method2008(int arg0) {
        if (arg0 != 0) {
            field4821 = null;
        }
        field4811++;
        class175.field2853.method2475((byte) 67);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Z)V", line = 670)
    public static final void method2009(boolean arg0) {
        field4808++;
        class479.field7061.method2477(82);
        if (arg0) {
            field4802 = null;
        }
        class50.field1009.method2477(79);
        class41.field575.method2477(-125);
        class306.field4561.method2477(95);
        class103.field1951.method2477(-126);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;IIII)V", line = 687)
    public final void method2010(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        field4805++;
        if (arg1 == null) {
            return;
        }
        if (arg5 < 15) {
            field4820 = null;
        }
        this.method2016(arg4, 160, arg2);
        this.method1999(null, null, arg3, 0, null, 0, arg0 - (this.field4803.method2808(arg1, -77) / 2), arg1, 28091);
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(I)V", line = 705)
    public static void method2011(int arg0) {
        field4820 = null;
        field4821 = null;
        int var1 = -89 % ((arg0 - 14) / 33);
        field4802 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BIIIIILjava/lang/String;IIII[Lo;IILta;[I)I", line = 717)
    public final int method2012(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6, int arg7, int arg8, int arg9, int arg10, class24[] arg11, int arg12, int arg13, class144 arg14, int[] arg15) {
        int var17 = 121 / ((-arg0 - 51) / 48);
        field4814++;
        return this.method2003(arg14, arg11, arg13, arg5, arg15, arg10, arg3, arg1, (byte) -116, arg2, arg4, 0, arg6, arg7, arg12, arg8, arg9);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;)V", line = 727)
    private final void method2013(int arg0, String arg1) {
        if (arg0 > -45) {
            this.method2003(null, null, 11, 46, null, 108, 60, -39, (byte) 115, -8, -18, -32, null, -118, -13, 105, -126);
        }
        try {
            if (arg1.startsWith("col=")) {
                class518.field7515 = class518.field7515 & 0xFF000000 | class83.method782(true, arg1.substring(4), 16) & 0xFFFFFF;
            } else if (arg1.equals("/col")) {
                class518.field7515 = class518.field7515 & 0xFF000000 | class43.field598 & 0xFFFFFF;
            }
            if (arg1.startsWith("argb=")) {
                class518.field7515 = class83.method782(true, arg1.substring(5), 16);
            } else if (arg1.equals("/argb")) {
                class518.field7515 = class43.field598;
            } else if (arg1.startsWith("str=")) {
                class114.field2065 = class518.field7515 & 0xFF000000 | class83.method782(true, arg1.substring(4), 16);
            } else if (arg1.equals("str")) {
                class114.field2065 = class518.field7515 & 0xFF000000 | 0x800000;
            } else if (arg1.equals("/str")) {
                class114.field2065 = -1;
            } else if (arg1.startsWith("u=")) {
                class416.field6276 = class518.field7515 & 0xFF000000 | class83.method782(true, arg1.substring(2), 16);
            } else if (arg1.equals("u")) {
                class416.field6276 = class518.field7515 & 0xFF000000;
            } else if (arg1.equals("/u")) {
                class416.field6276 = -1;
            } else if (arg1.equalsIgnoreCase("shad=-1")) {
                class492.field7210 = 0;
            } else if (arg1.startsWith("shad=")) {
                class492.field7210 = class518.field7515 & 0xFF000000 | class83.method782(true, arg1.substring(5), 16);
            } else if (arg1.equals("shad")) {
                class492.field7210 = class518.field7515 & 0xFF000000;
            } else if (arg1.equals("/shad")) {
                class492.field7210 = class124.field2144;
            } else if (arg1.equals("br")) {
                this.method2016(class124.field2144, 160, class43.field598);
            }
        } catch (Exception var3) {
        }
        field4819++;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BI[I[Lo;IIIILjava/util/Random;Ljava/lang/String;)I", line = 801)
    public final int method2014(byte arg0, int arg1, int[] arg2, class24[] arg3, int arg4, int arg5, int arg6, int arg7, Random arg8, String arg9) {
        field4807++;
        if (arg9 == null) {
            return 0;
        }
        arg8.setSeed((long) arg5);
        int var11 = (arg8.nextInt() & 0x1F) + 192;
        this.method2016(var11 << 24 | arg6 & 0xFFFFFF, 160, arg7 & 0xFFFFFF | var11 << 24);
        int var12 = arg9.length();
        int[] var13 = new int[var12];
        if (arg0 != 9) {
            this.method213((char) 65417, 92, 86, 60, false, null, 25, 109);
        }
        int var14 = 0;
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg8.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        this.method2005(var13, arg3, arg9, arg1, arg4, arg2, null, -115);
        return var14;
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lza;Lfj;)V", line = 844)
    public class317(class288 arg0, class470 arg1) {
        this.field4817 = arg0;
        this.field4803 = arg1;
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(ILjava/lang/String;IIII)V", line = 869)
    public final void method2015(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 <= 23) {
            return;
        }
        field4816++;
        if (arg1 != null) {
            this.method2016(arg2, 160, arg5);
            this.method1999(null, null, arg3, 0, null, 0, arg4 - this.field4803.method2808(arg1, -104), arg1, 28091);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(III)V", line = 887)
    private final void method2016(int arg0, int arg1, int arg2) {
        class339.field5105 = 0;
        if (arg0 == -1) {
            arg0 = 0;
        }
        field4824++;
        class43.field598 = arg2;
        class518.field7515 = arg2;
        if (arg1 != 160) {
            this.field4817 = null;
        }
        class416.field6276 = -1;
        class114.field2065 = -1;
        class298.field4516 = 0;
        class124.field2144 = arg0;
        class492.field7210 = arg0;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIBILjava/lang/String;)V", line = 907)
    public final void method2017(int arg0, int arg1, int arg2, byte arg3, int arg4, String arg5) {
        field4823++;
        if (arg5 != null && arg3 <= -69) {
            this.method2016(arg2, 160, arg1);
            this.method1999(null, null, arg4, 0, null, 0, arg0, arg5, 28091);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(CIIIZLta;II)V")
    public abstract void method213(char arg0, int arg1, int arg2, int arg3, boolean arg4, class144 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!la", name = "B", descriptor = "(CIIIZ)V")
    public abstract void method214(char arg0, int arg1, int arg2, int arg3, boolean arg4);
}
