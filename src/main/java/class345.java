import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public abstract class class345 {

    @OriginalMember(owner = "client!ur", name = "f", descriptor = "Lwm;")
    private class364 field4747;

    @OriginalMember(owner = "client!ur", name = "q", descriptor = "Lvi;")
    private class347 field4758;

    @OriginalMember(owner = "client!ur", name = "d", descriptor = "[J")
    public static long[] field4745 = new long[100];

    @OriginalMember(owner = "client!ur", name = "t", descriptor = "I")
    public static int field4761 = -1;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "I")
    public static int field4742;

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "I")
    public static int field4743;

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "I")
    public static int field4744;

    @OriginalMember(owner = "client!ur", name = "e", descriptor = "I")
    public static int field4746;

    @OriginalMember(owner = "client!ur", name = "g", descriptor = "I")
    public static int field4748;

    @OriginalMember(owner = "client!ur", name = "h", descriptor = "I")
    public static int field4749;

    @OriginalMember(owner = "client!ur", name = "i", descriptor = "I")
    public static int field4750;

    @OriginalMember(owner = "client!ur", name = "j", descriptor = "I")
    public static int field4751;

    @OriginalMember(owner = "client!ur", name = "k", descriptor = "I")
    public static int field4752;

    @OriginalMember(owner = "client!ur", name = "l", descriptor = "I")
    public static int field4753;

    @OriginalMember(owner = "client!ur", name = "m", descriptor = "I")
    public static int field4754;

    @OriginalMember(owner = "client!ur", name = "n", descriptor = "I")
    public static int field4755;

    @OriginalMember(owner = "client!ur", name = "o", descriptor = "I")
    public static int field4756;

    @OriginalMember(owner = "client!ur", name = "p", descriptor = "I")
    public static int field4757;

    @OriginalMember(owner = "client!ur", name = "r", descriptor = "I")
    public static int field4759;

    @OriginalMember(owner = "client!ur", name = "s", descriptor = "I")
    public static int field4760;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(III)V", line = 3)
    private final void method2115(int arg0, int arg1, int arg2) {
        field4743++;
        class309.field4080 = -1;
        class295.field3943 = -1;
        class176.field2394 = arg2;
        class301.field4017 = arg2;
        class482.field6655 = 0;
        class33.field510 = 0;
        if (arg1 != 16777215) {
            return;
        }
        if (arg0 == -1) {
            arg0 = 0;
        }
        class121.field1791 = arg0;
        class9.field117 = arg0;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(I)V", line = 23)
    public static final void method2116(int arg0) {
        class239.field3187 = 0;
        field4760++;
        if (arg0 != -1) {
            method2123(55);
        }
        for (int var1 = 0; var1 < 2048; var1++) {
            class374.field5166[var1] = null;
            class280.field3754[var1] = 1;
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IILjava/lang/String;IIII)V", line = 46)
    public final void method2117(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5, int arg6) {
        field4751++;
        if (arg2 == null) {
            return;
        }
        this.method2115(arg1, arg3 ^ 0xFFFFFD, arg0);
        int var8 = arg2.length();
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg6 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg6 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method2118((byte) -84, arg5 - (this.field4758.method2145(arg2, arg3 + 13936) / arg3), (int[]) null, var10, arg4, (class139[]) null, arg2, var9);
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(BI[I[II[Ljd;Ljava/lang/String;[I)V", line = 78)
    private final void method2118(byte arg0, int arg1, int[] arg2, int[] arg3, int arg4, class139[] arg5, String arg6, int[] arg7) {
        field4757++;
        int var9 = 64 % ((33 - arg0) / 39);
        int var10 = arg4 - this.field4758.field4777;
        int var11 = -1;
        int var12 = -1;
        int var13 = 0;
        int var14 = arg6.length();
        for (int var15 = 0; var15 < var14; var15++) {
            char var16 = (char) (class332.method1905(arg6.charAt(var15), 18658) & 0xFF);
            if (var16 == '<') {
                var11 = var15;
            } else {
                if (var16 == '>' && var11 != -1) {
                    String var17 = arg6.substring(var11 + 1, var15);
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
                                    if (arg3 == null) {
                                        var19 = 0;
                                    } else {
                                        var19 = arg3[var13];
                                    }
                                    var13++;
                                    int var20 = class455.method2673(111, var17.substring(4));
                                    class139 var21 = arg5[var20];
                                    int var22 = arg2 == null ? var21.method774() : arg2[var20];
                                    var21.method768(arg1 + var18, -var22 + var19 + this.field4758.field4777 + var10, 0, 0, 1);
                                    var12 = -1;
                                    arg1 += arg5[var20].method777();
                                } catch (Exception var26) {
                                }
                            } else {
                                this.method2121(var17, true);
                            }
                            continue;
                        }
                        var16 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg1 += this.field4758.method2144(var12, 1, var16);
                    }
                    int var23;
                    if (arg7 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg7[var13];
                    }
                    int var24;
                    if (arg3 == null) {
                        var24 = 0;
                    } else {
                        var24 = arg3[var13];
                    }
                    if (var16 != ' ') {
                        if ((class9.field117 & 0xFF000000) != 0) {
                            this.method1314(var16, arg1 + var23 + 1, var24 + 1 + var10, class9.field117, true);
                        }
                        this.method1314(var16, arg1 + var23, var10 - -var24, class301.field4017, false);
                    } else if (class33.field510 > 0) {
                        class482.field6655 += class33.field510;
                        arg1 += class482.field6655 >> 8;
                        class482.field6655 &= 0xFF;
                    }
                    var13++;
                    int var25 = this.field4758.method2141(-42, var16);
                    if (class295.field3943 != -1) {
                        this.field4747.method2224(arg1, 16384, var25, (int) ((double) this.field4758.field4777 * 0.7D) + var10, class295.field3943);
                    }
                    if (class309.field4080 != -1) {
                        this.field4747.method2224(arg1, 16384, var25, this.field4758.field4777 + var10, class309.field4080);
                    }
                    var12 = var16;
                    arg1 += var25;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IILjava/lang/String;)V", line = 244)
    private final void method2119(int arg0, int arg1, String arg2) {
        field4754++;
        int var4 = 0;
        boolean var5 = false;
        if (arg1 <= 5) {
            this.method2119(-22, 97, (String) null);
        }
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
        if (var4 > 0) {
            class33.field510 = (arg0 - this.field4758.method2145(arg2, 13938) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIIII[IILkf;ILjava/lang/String;III[Ljd;II)I", line = 291)
    public final int method2120(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, class152 arg7, int arg8, String arg9, int arg10, int arg11, int arg12, class139[] arg13, int arg14, int arg15) {
        field4756++;
        if (arg9 == null) {
            return 0;
        }
        this.method2115(arg4, arg10 + 16777214, arg14);
        if (arg10 != 1) {
            field4761 = -107;
        }
        if (arg1 == 0) {
            arg1 = this.field4758.field4777;
        }
        int[] var17;
        if (arg8 < (this.field4758.field4782 + arg1 + this.field4758.field4772) && arg1 + arg1 > arg8) {
            var17 = null;
        } else {
            var17 = new int[] { arg15 };
        }
        int var18 = this.field4758.method2138(117, class203.field2746, arg9, var17, arg13);
        if (arg11 == 3 && var18 == 1) {
            arg11 = 1;
        }
        int var19;
        if (arg11 == 0) {
            var19 = this.field4758.field4772 + arg12;
        } else if (arg11 == 1) {
            var19 = (arg8 - this.field4758.field4772 - ((var18 + -1) * arg1 + this.field4758.field4782)) / 2 + this.field4758.field4772 + arg12;
        } else if (arg11 == 2) {
            var19 = arg12 + arg8 - this.field4758.field4782 - ((var18 + -1) * arg1);
        } else {
            int var20 = (arg8 - ((var18 - 1) * arg1 + this.field4758.field4782) - this.field4758.field4772) / (var18 + 1);
            if (var20 < 0) {
                var20 = 0;
            }
            arg1 += var20;
            var19 = arg12 + var20 + this.field4758.field4772;
        }
        for (int var21 = 0; var21 < var18; var21++) {
            if (arg3 == 0) {
                this.method2130(var19, arg6, class203.field2746[var21], arg7, arg2, arg13, true, arg5, arg0);
            } else if (arg3 == 1) {
                this.method2130(var19, arg6, class203.field2746[var21], arg7, (arg15 - this.field4758.method2145(class203.field2746[var21], 13938)) / 2 + arg2, arg13, true, arg5, arg0);
            } else if (arg3 == 2) {
                this.method2130(var19, arg6, class203.field2746[var21], arg7, arg2 + arg15 - this.field4758.method2145(class203.field2746[var21], 13938), arg13, true, arg5, arg0);
            } else if (var18 - 1 == var21) {
                this.method2130(var19, arg6, class203.field2746[var21], arg7, arg2, arg13, true, arg5, arg0);
            } else {
                this.method2119(arg15, arg10 + 14, class203.field2746[var21]);
                this.method2130(var19, arg6, class203.field2746[var21], arg7, arg2, arg13, true, arg5, arg0);
                class33.field510 = 0;
            }
            var19 += arg1;
        }
        return var18;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Ljava/lang/String;Z)V", line = 376)
    private final void method2121(String arg0, boolean arg1) {
        field4742++;
        try {
            if (arg0.startsWith("col=")) {
                class301.field4017 = class301.field4017 & 0xFF000000 | class321.method1780((byte) -76, arg0.substring(4), 16) & 0xFFFFFF;
            } else if (arg0.equals("/col")) {
                class301.field4017 = class176.field2394 & 0xFFFFFF | class301.field4017 & 0xFF000000;
            }
            if (arg0.startsWith("argb=")) {
                class301.field4017 = class321.method1780((byte) -76, arg0.substring(5), 16);
            } else if (arg0.equals("/argb")) {
                class301.field4017 = class176.field2394;
            } else if (arg0.startsWith("str=")) {
                class295.field3943 = class321.method1780((byte) -76, arg0.substring(4), 16) | 0xFF000000;
            } else if (arg0.equals("str")) {
                class295.field3943 = -8388608;
            } else if (arg0.equals("/str")) {
                class295.field3943 = -1;
            } else if (arg0.startsWith("u=")) {
                class309.field4080 = class321.method1780((byte) -76, arg0.substring(2), 16) | 0xFF000000;
            } else if (arg0.equals("u")) {
                class309.field4080 = -16777216;
            } else if (arg0.equals("/u")) {
                class309.field4080 = -1;
            } else if (arg0.equalsIgnoreCase("shad=-1")) {
                class9.field117 = 0;
            } else if (arg0.startsWith("shad=")) {
                class9.field117 = class321.method1780((byte) -76, arg0.substring(5), 16) | 0xFF000000;
            } else if (arg0.equals("shad")) {
                class9.field117 = -16777216;
            } else if (arg0.equals("/shad")) {
                class9.field117 = class121.field1791;
            } else if (arg0.equals("br")) {
                this.method2115(class121.field1791, 16777215, class176.field2394);
            }
            if (!arg1) {
                field4761 = 54;
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IBIIILjava/lang/String;II)V", line = 450)
    public final void method2122(int arg0, byte arg1, int arg2, int arg3, int arg4, String arg5, int arg6, int arg7) {
        field4750++;
        if (arg5 == null) {
            return;
        }
        this.method2115(arg2, 16777215, arg6);
        double var9 = 7.0D - ((double) arg4 / 8.0D);
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg5.length();
        int[] var12 = new int[var11];
        if (arg1 >= -99) {
            this.method2118((byte) -110, 112, (int[]) null, (int[]) null, -1, (class139[]) null, (String) null, (int[]) null);
        }
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (Math.sin((double) var13 / 1.5D + (double) arg0) * var9);
        }
        this.method2118((byte) -36, arg3 - (this.field4758.method2145(arg5, 13938) / 2), (int[]) null, var12, arg7, (class139[]) null, arg5, (int[]) null);
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(I)V", line = 484)
    public static void method2123(int arg0) {
        field4745 = null;
        if (arg0 != 27841) {
            field4745 = null;
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIIIBLjava/lang/String;)V", line = 494)
    public final void method2124(int arg0, int arg1, int arg2, int arg3, byte arg4, String arg5) {
        field4749++;
        if (arg5 != null) {
            this.method2115(arg1, 16777215, arg3);
            if (arg4 < 0) {
                this.method2130(arg2, 0, arg5, (class152) null, arg0, (class139[]) null, true, (int[]) null, 0);
            }
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIILjava/lang/String;II)V", line = 511)
    public final void method2125(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5) {
        field4746++;
        if (arg3 != null) {
            this.method2115(arg2, 16777215, arg5);
            this.method2130(arg1, 0, arg3, (class152) null, arg0 - this.field4758.method2145(arg3, 13938), (class139[]) null, true, (int[]) null, arg4);
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(II[Ljd;Ljava/util/Random;III[ILjava/lang/String;I)I", line = 523)
    public final int method2126(int arg0, int arg1, class139[] arg2, Random arg3, int arg4, int arg5, int arg6, int[] arg7, String arg8, int arg9) {
        field4752++;
        if (arg8 == null) {
            return 0;
        }
        arg3.setSeed((long) arg1);
        int var11 = (arg3.nextInt() & 0x1F) + 192;
        this.method2115(arg6 & arg9 | var11 << 24, arg6, arg4 & 0xFFFFFF | var11 << 24);
        int var12 = arg8.length();
        int[] var13 = new int[var12];
        int var14 = 0;
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg3.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        this.method2118((byte) 77, arg0, arg7, (int[]) null, arg5, arg2, arg8, var13);
        return var14;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Ljava/lang/String;IZIII)V", line = 559)
    public final void method2127(String arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field4744++;
        if (arg0 != null) {
            this.method2115(arg1, 16777215, arg4);
            this.method2130(arg3, 0, arg0, (class152) null, arg5 - (this.field4758.method2145(arg0, 13938) / 2), (class139[]) null, arg2, (int[]) null, 0);
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "([I[Ljd;ILjava/lang/String;IIII)V", line = 586)
    public final void method2128(int[] arg0, class139[] arg1, int arg2, String arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg5 <= 61) {
            return;
        }
        field4748++;
        if (arg3 != null) {
            this.method2115(arg6, 16777215, arg7);
            this.method2130(arg4, 0, arg3, (class152) null, arg2, arg1, true, arg0, 0);
        }
    }

    @OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(Lwm;Lvi;)V", line = 600)
    public class345(class364 arg0, class347 arg1) {
        this.field4747 = arg0;
        this.field4758 = arg1;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(ILjava/lang/String;ILjava/util/Random;I[IIIII[Ljd;II[IZ)I", line = 611)
    public final int method2129(int arg0, String arg1, int arg2, Random arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9, class139[] arg10, int arg11, int arg12, int[] arg13, boolean arg14) {
        field4759++;
        if (arg1 == null) {
            return 0;
        }
        arg3.setSeed((long) arg9);
        int var16 = (arg3.nextInt() & 0x1F) + 192;
        this.method2115(arg6 & 0xFFFFFF | var16 << 24, 16777215, arg8 & 0xFFFFFF | var16 << 24);
        int var17 = arg1.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        if (!arg14) {
            this.field4747 = null;
        }
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg3.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        int var21 = arg0;
        int var22 = this.field4758.field4772 + arg2;
        int var23 = -1;
        if (arg4 == 1) {
            var22 += (arg11 - this.field4758.field4772 - this.field4758.field4782) / 2;
        } else if (arg4 == 2) {
            var22 = arg11 + arg2 - this.field4758.field4782;
        }
        if (arg12 == 1) {
            var23 = this.field4758.method2145(arg1, 13938) + var19;
            var21 = (arg7 - var23) / 2 + arg0;
        } else if (arg12 == 2) {
            var23 = this.field4758.method2145(arg1, 13938) + var19;
            var21 = arg7 + arg0 - var23;
        }
        this.method2118((byte) -88, var21, arg13, (int[]) null, var22, arg10, arg1, var18);
        if (arg5 != null) {
            if (var23 == -1) {
                var23 = var19 + this.field4758.method2145(arg1, 13938);
            }
            arg5[2] = var23;
            arg5[3] = this.field4758.field4782 + this.field4758.field4772;
            arg5[1] = var22 - this.field4758.field4772;
            arg5[0] = var21;
        }
        return var19;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IILjava/lang/String;Lkf;I[Ljd;Z[II)V", line = 691)
    private final void method2130(int arg0, int arg1, String arg2, class152 arg3, int arg4, class139[] arg5, boolean arg6, int[] arg7, int arg8) {
        if (!arg6) {
            return;
        }
        field4753++;
        int var10 = arg0 - this.field4758.field4777;
        int var11 = -1;
        int var12 = -1;
        int var13 = arg2.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class332.method1905(arg2.charAt(var14), 18658) & 0xFF);
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
                                    int var17 = class455.method2673(113, var16.substring(4));
                                    class139 var18 = arg5[var17];
                                    int var19 = arg7 == null ? var18.method774() : arg7[var17];
                                    if ((class301.field4017 & 0xFF000000) == -16777216) {
                                        var18.method768(arg4, this.field4758.field4777 + var10 - var19, 0, 0, 1);
                                    } else {
                                        var18.method768(arg4, var10 + this.field4758.field4777 - var19, 1, class301.field4017 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    arg4 += arg5[var17].method777();
                                    var12 = -1;
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method2121(var16, true);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg4 += this.field4758.method2144(var12, 1, var15);
                    }
                    if (var15 == ' ') {
                        if (class33.field510 > 0) {
                            class482.field6655 += class33.field510;
                            arg4 += class482.field6655 >> 8;
                            class482.field6655 &= 0xFF;
                        }
                    } else if (arg3 == null) {
                        if ((class9.field117 & 0xFF000000) != 0) {
                            this.method1314(var15, arg4 + 1, var10 + 1, class9.field117, true);
                        }
                        this.method1314(var15, arg4, var10, class301.field4017, false);
                    } else {
                        if ((class9.field117 & 0xFF000000) != 0) {
                            this.method1319(var15, arg4 + 1, var10 + 1, class9.field117, true, arg3, arg8, arg1);
                        }
                        this.method1319(var15, arg4, var10, class301.field4017, false, arg3, arg8, arg1);
                    }
                    int var20 = this.field4758.method2141(-121, var15);
                    if (class295.field3943 != -1) {
                        this.field4747.method2224(arg4, 16384, var20, (int) ((double) this.field4758.field4777 * 0.7D) + var10, class295.field3943);
                    }
                    if (class309.field4080 != -1) {
                        this.field4747.method2224(arg4, 16384, var20, this.field4758.field4777 + var10 + 1, class309.field4080);
                    }
                    var12 = var15;
                    arg4 += var20;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(IILjava/lang/String;IIII)V", line = 843)
    public final void method2131(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5, int arg6) {
        field4755++;
        if (arg2 == null) {
            return;
        }
        this.method2115(arg4, 16777215, arg0);
        int var8 = arg2.length();
        int[] var9 = new int[var8];
        if (arg5 != -8388608) {
            method2123(-111);
        }
        for (int var10 = 0; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg1 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method2118((byte) -76, arg6 - (this.field4758.method2145(arg2, 13938) / 2), (int[]) null, var9, arg3, (class139[]) null, arg2, (int[]) null);
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(CIIIZ)V")
    public abstract void method1314(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(CIIIZLkf;II)V")
    public abstract void method1319(char arg0, int arg1, int arg2, int arg3, boolean arg4, class152 arg5, int arg6, int arg7);
}
