import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public abstract class class352 {

    @OriginalMember(owner = "client!rj", name = "w", descriptor = "Ldi;")
    private class65 field4932;

    @OriginalMember(owner = "client!rj", name = "q", descriptor = "Laa;")
    private class281 field4926;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
    public static int field4910;

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "I")
    public static int field4911;

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "I")
    public static int field4912;

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "I")
    public static int field4913;

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "I")
    public static int field4914;

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "I")
    public static int field4915;

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "I")
    public static int field4916;

    @OriginalMember(owner = "client!rj", name = "i", descriptor = "I")
    public static int field4918;

    @OriginalMember(owner = "client!rj", name = "j", descriptor = "I")
    public static int field4919;

    @OriginalMember(owner = "client!rj", name = "k", descriptor = "I")
    public static int field4920;

    @OriginalMember(owner = "client!rj", name = "l", descriptor = "I")
    public static int field4921;

    @OriginalMember(owner = "client!rj", name = "m", descriptor = "I")
    public static int field4922;

    @OriginalMember(owner = "client!rj", name = "n", descriptor = "I")
    public static int field4923;

    @OriginalMember(owner = "client!rj", name = "o", descriptor = "I")
    public static int field4924;

    @OriginalMember(owner = "client!rj", name = "p", descriptor = "I")
    public static int field4925;

    @OriginalMember(owner = "client!rj", name = "r", descriptor = "I")
    public static int field4927;

    @OriginalMember(owner = "client!rj", name = "s", descriptor = "I")
    public static int field4928;

    @OriginalMember(owner = "client!rj", name = "t", descriptor = "I")
    public static int field4929;

    @OriginalMember(owner = "client!rj", name = "u", descriptor = "I")
    public static int field4930;

    @OriginalMember(owner = "client!rj", name = "v", descriptor = "I")
    public static int field4931;

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "Laa;")
    public static class281 field4917;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Ljava/lang/String;III[Llf;IBIIIIIILtm;I[I)I", line = 4)
    public final int method2264(String arg0, int arg1, int arg2, int arg3, class130[] arg4, int arg5, byte arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class220 arg13, int arg14, int[] arg15) {
        field4929++;
        if (arg0 == null) {
            return 0;
        }
        this.method2270(22378, arg9, arg11);
        if (arg3 == 0) {
            arg3 = this.field4932.field1022;
        }
        int[] var17;
        if (this.field4932.field1015 + arg3 + this.field4932.field1025 > arg14 && arg14 < (arg3 + arg3)) {
            var17 = null;
        } else {
            var17 = new int[] { arg7 };
        }
        int var18 = this.field4932.method446(arg6 ^ 0x61D8, var17, arg4, class368.field5163, arg0);
        if (arg5 == 3 && var18 == 1) {
            arg5 = 1;
        }
        int var19;
        if (arg5 == 0) {
            var19 = this.field4932.field1015 + arg12;
        } else if (arg5 == 1) {
            var19 = (arg14 - (this.field4932.field1015 - (-this.field4932.field1025 - (var18 - 1) * arg3))) / 2 + arg12 + this.field4932.field1015;
        } else if (arg5 == 2) {
            var19 = arg12 + arg14 - ((var18 - 1) * arg3) - this.field4932.field1025;
        } else {
            int var20 = (arg14 - this.field4932.field1015 - this.field4932.field1025 - ((var18 - 1) * arg3)) / (var18 + 1);
            if (var20 < 0) {
                var20 = 0;
            }
            arg3 += var20;
            var19 = this.field4932.field1015 + arg12 + var20;
        }
        for (int var21 = 0; var21 < var18; var21++) {
            if (arg1 == 0) {
                this.method2282(arg10, class368.field5163[var21], arg2, 2, var19, arg13, arg8, arg4, arg15);
            } else if (arg1 == 1) {
                this.method2282((arg7 - this.field4932.method448((byte) -108, class368.field5163[var21])) / 2 + arg10, class368.field5163[var21], arg2, 2, var19, arg13, arg8, arg4, arg15);
            } else if (arg1 == 2) {
                this.method2282(arg10 + arg7 - this.field4932.method448((byte) -121, class368.field5163[var21]), class368.field5163[var21], arg2, arg6 ^ 0xFFFFFFAA, var19, arg13, arg8, arg4, arg15);
            } else if (var18 - 1 == var21) {
                this.method2282(arg10, class368.field5163[var21], arg2, arg6 + 90, var19, arg13, arg8, arg4, arg15);
            } else {
                this.method2272(arg6 ^ 0xFFFFFFA8, arg7, class368.field5163[var21]);
                this.method2282(arg10, class368.field5163[var21], arg2, 2, var19, arg13, arg8, arg4, arg15);
                class327.field4474 = 0;
            }
            var19 += arg3;
        }
        if (arg6 != -88) {
            this.field4926 = null;
        }
        return var18;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Ljava/util/Random;I[I[Llf;IILjava/lang/String;[IIIIZIII)I", line = 91)
    public final int method2265(Random arg0, int arg1, int[] arg2, class130[] arg3, int arg4, int arg5, String arg6, int[] arg7, int arg8, int arg9, int arg10, boolean arg11, int arg12, int arg13, int arg14) {
        field4910++;
        if (arg6 == null) {
            return 0;
        }
        arg0.setSeed((long) arg8);
        int var16 = (arg0.nextInt() & 0x1F) + 192;
        this.method2270(22378, var16 << 24 | arg9 & 0xFFFFFF, var16 << 24 | arg10 & 0xFFFFFF);
        if (!arg11) {
            field4917 = null;
        }
        int var17 = arg6.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg0.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        int var21 = arg12;
        int var22 = this.field4932.field1015 + arg5;
        int var23 = -1;
        if (arg13 == 1) {
            var22 += (arg1 - this.field4932.field1015 - this.field4932.field1025) / 2;
        } else if (arg13 == 2) {
            var22 = arg1 + arg5 - this.field4932.field1025;
        }
        if (arg14 == 1) {
            var23 = this.field4932.method448((byte) -77, arg6) + var19;
            var21 = (arg4 - var23) / 2 + arg12;
        } else if (arg14 == 2) {
            var23 = this.field4932.method448((byte) -72, arg6) + var19;
            var21 = arg4 + arg12 - var23;
        }
        this.method2276(arg2, var21, var22, (int[]) null, arg3, arg6, var18, false);
        if (arg7 != null) {
            if (var23 == -1) {
                var23 = this.field4932.method448((byte) -97, arg6) + var19;
            }
            arg7[1] = var22 - this.field4932.field1015;
            arg7[0] = var21;
            arg7[2] = var23;
            arg7[3] = this.field4932.field1025 + this.field4932.field1015;
        }
        return var19;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(II[Llf;IIILjava/util/Random;[ILjava/lang/String;B)I", line = 169)
    public final int method2266(int arg0, int arg1, class130[] arg2, int arg3, int arg4, int arg5, Random arg6, int[] arg7, String arg8, byte arg9) {
        field4930++;
        if (arg8 == null) {
            return 0;
        }
        if (arg9 > -41) {
            this.method2264((String) null, -119, -101, 119, (class130[]) null, 52, (byte) -92, -64, -84, -29, -47, -108, 27, (class220) null, 14, (int[]) null);
        }
        arg6.setSeed((long) arg1);
        int var11 = (arg6.nextInt() & 0x1F) + 192;
        this.method2270(22378, var11 << 24 | arg3 & 0xFFFFFF, var11 << 24 | arg4 & 0xFFFFFF);
        int var12 = arg8.length();
        int[] var13 = new int[var12];
        int var14 = 0;
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg6.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        this.method2276(arg7, arg0, arg5, (int[]) null, arg2, arg8, var13, false);
        return var14;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IBIIILjava/lang/String;I)V", line = 208)
    public final void method2267(int arg0, byte arg1, int arg2, int arg3, int arg4, String arg5, int arg6) {
        int var8 = -25 % ((-arg1 - 59) / 59);
        field4920++;
        if (arg5 == null) {
            return;
        }
        this.method2270(22378, arg2, arg6);
        int var9 = arg5.length();
        int[] var10 = new int[var9];
        int[] var11 = new int[var9];
        for (int var12 = 0; var12 < var9; var12++) {
            var10[var12] = (int) (Math.sin((double) arg4 / 5.0D + (double) var12 / 5.0D) * 5.0D);
            var11[var12] = (int) (Math.sin((double) arg4 / 5.0D + (double) var12 / 3.0D) * 5.0D);
        }
        this.method2276((int[]) null, arg0 - (this.field4932.method448((byte) -54, arg5) / 2), arg3, var11, (class130[]) null, arg5, var10, false);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIIIIILjava/lang/String;)V", line = 238)
    public final void method2268(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, String arg7) {
        field4914++;
        if (arg7 == null) {
            return;
        }
        this.method2270(arg5 + 23355, arg6, arg3);
        double var9 = 7.0D - (double) arg4 / 8.0D;
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg7.length();
        int[] var12 = new int[var11];
        if (arg5 != -977) {
            field4917 = null;
        }
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (var9 * Math.sin((double) var13 / 1.5D + (double) arg0));
        }
        this.method2276((int[]) null, arg1 - (this.field4932.method448((byte) -94, arg7) / 2), arg2, var12, (class130[]) null, arg7, (int[]) null, false);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILjava/lang/String;)V", line = 271)
    private final void method2269(int arg0, String arg1) {
        field4928++;
        try {
            if (arg0 > 24) {
                if (arg1.startsWith("col=")) {
                    class417.field6029 = class417.field6029 & 0xFF000000 | class271.method1665(16, arg1.substring(4), 10062) & 0xFFFFFF;
                } else if (arg1.equals("/col")) {
                    class417.field6029 = class417.field6029 & 0xFF000000 | class337.field4589 & 0xFFFFFF;
                }
                if (arg1.startsWith("argb=")) {
                    class417.field6029 = class271.method1665(16, arg1.substring(5), 10062);
                } else if (arg1.equals("/argb")) {
                    class417.field6029 = class337.field4589;
                } else if (arg1.startsWith("str=")) {
                    class301.field4173 = class271.method1665(16, arg1.substring(4), 10062) | 0xFF000000;
                } else if (arg1.equals("str")) {
                    class301.field4173 = -8388608;
                } else if (arg1.equals("/str")) {
                    class301.field4173 = -1;
                } else if (arg1.startsWith("u=")) {
                    class442.field6409 = class271.method1665(16, arg1.substring(2), 10062) | 0xFF000000;
                } else if (arg1.equals("u")) {
                    class442.field6409 = -16777216;
                } else if (arg1.equals("/u")) {
                    class442.field6409 = -1;
                } else if (arg1.equalsIgnoreCase("shad=-1")) {
                    class445.field6423 = 0;
                } else if (arg1.startsWith("shad=")) {
                    class445.field6423 = class271.method1665(16, arg1.substring(5), 10062) | 0xFF000000;
                } else if (arg1.equals("shad")) {
                    class445.field6423 = -16777216;
                } else if (arg1.equals("/shad")) {
                    class445.field6423 = class347.field4863;
                } else if (arg1.equals("br")) {
                    this.method2270(22378, class347.field4863, class337.field4589);
                    return;
                }
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(III)V", line = 346)
    private final void method2270(int arg0, int arg1, int arg2) {
        class337.field4589 = arg2;
        class417.field6029 = arg2;
        class361.field5072 = 0;
        field4912++;
        if (arg1 == -1) {
            arg1 = 0;
        }
        class301.field4173 = -1;
        class327.field4474 = 0;
        class442.field6409 = -1;
        if (arg0 != 22378) {
            this.field4926 = null;
        }
        class347.field4863 = arg1;
        class445.field6423 = arg1;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IILjava/lang/String;IBII)V", line = 366)
    public final void method2271(int arg0, int arg1, String arg2, int arg3, byte arg4, int arg5, int arg6) {
        field4925++;
        if (arg2 == null) {
            return;
        }
        if (arg4 <= 59) {
            field4922 = 93;
        }
        this.method2270(22378, arg6, arg5);
        int var8 = arg2.length();
        int[] var9 = new int[var8];
        for (int var10 = 0; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg3 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method2276((int[]) null, arg1 - this.field4932.method448((byte) -82, arg2) / 2, arg0, var9, (class130[]) null, arg2, (int[]) null, false);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IILjava/lang/String;)V", line = 396)
    private final void method2272(int arg0, int arg1, String arg2) {
        field4911++;
        int var4 = 0;
        boolean var5 = false;
        for (int var6 = 0; arg2.length() > var6; var6++) {
            char var7 = arg2.charAt(var6);
            if (var7 == '<') {
                var5 = true;
            } else if (var7 == '>') {
                var5 = false;
            } else if (!var5 && var7 == ' ') {
                var4++;
            }
        }
        if (var4 > arg0) {
            class327.field4474 = (arg1 - this.field4932.method448((byte) -109, arg2) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IILjava/lang/String;III[Llf;[I)V", line = 434)
    public final void method2273(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5, class130[] arg6, int[] arg7) {
        field4915++;
        if (arg2 != null) {
            this.method2270(arg4 + 22378, arg0, arg3);
            this.method2282(arg1, arg2, arg4, 2, arg5, (class220) null, 0, arg6, arg7);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Ljava/lang/String;IIBII)V", line = 452)
    public final void method2274(String arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        if (arg3 != 38) {
            method2275(41);
        }
        field4916++;
        if (arg0 != null) {
            this.method2270(arg3 ^ 0x574C, arg2, arg4);
            this.method2282(arg1 - this.field4932.method448((byte) -61, arg0), arg0, 0, arg3 - 36, arg5, (class220) null, 0, (class130[]) null, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V", line = 468)
    public static void method2275(int arg0) {
        if (arg0 == 1) {
            field4917 = null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "([III[I[Llf;Ljava/lang/String;[IZ)V", line = 491)
    private final void method2276(int[] arg0, int arg1, int arg2, int[] arg3, class130[] arg4, String arg5, int[] arg6, boolean arg7) {
        int var9 = arg2 - this.field4932.field1022;
        field4927++;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg7) {
            field4913 = -123;
        }
        int var13 = arg5.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class81.method576(false, arg5.charAt(var14)) & 0xFF);
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
                                    if (arg6 == null) {
                                        var17 = 0;
                                    } else {
                                        var17 = arg6[var12];
                                    }
                                    int var18;
                                    if (arg3 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg3[var12];
                                    }
                                    var12++;
                                    int var19 = class160.method1062(arg7, var16.substring(4));
                                    class130 var20 = arg4[var19];
                                    int var21 = arg0 == null ? var20.method877() : arg0[var19];
                                    var20.method809(arg1 + var17, var9 - -this.field4932.field1022 + -var21 + var18, 0, 0, 1);
                                    arg1 += arg4[var19].method874();
                                    var11 = -1;
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method2269(32, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg1 += this.field4932.method447(true, var15, var11);
                    }
                    int var22;
                    if (arg6 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg6[var12];
                    }
                    int var23;
                    if (arg3 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg3[var12];
                    }
                    if (var15 != ' ') {
                        if ((class445.field6423 & 0xFF000000) != 0) {
                            this.method617(var15, arg1 + var22 + 1, var9 + 1 + var23, class445.field6423, true);
                        }
                        this.method617(var15, arg1 + var22, var9 + var23, class417.field6029, false);
                    } else if (class327.field4474 > 0) {
                        class361.field5072 += class327.field4474;
                        arg1 += class361.field5072 >> 8;
                        class361.field5072 &= 0xFF;
                    }
                    var12++;
                    int var24 = this.field4932.method440(true, var15);
                    if (class301.field4173 != -1) {
                        this.field4926.method1739(class301.field4173, 1, (int) ((double) this.field4932.field1022 * 0.7D) + var9, arg1, var24);
                    }
                    if (class442.field6409 != -1) {
                        this.field4926.method1739(class442.field6409, 1, this.field4932.field1022 + var9, arg1, var24);
                    }
                    var11 = var15;
                    arg1 += var24;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILjava/lang/String;IIII)V", line = 657)
    public final void method2277(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 > -10) {
            this.method2270(-43, -40, 6);
        }
        field4921++;
        if (arg1 != null) {
            this.method2270(22378, arg4, arg5);
            this.method2282(arg2 - (this.field4932.method448((byte) -106, arg1) / 2), arg1, 0, 2, arg0, (class220) null, 0, (class130[]) null, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIILjava/lang/String;BI)V", line = 675)
    public final void method2278(int arg0, int arg1, int arg2, String arg3, byte arg4, int arg5) {
        if (arg4 > -73) {
            this.method2267(55, (byte) -98, 115, -117, 54, (String) null, -29);
        }
        field4923++;
        if (arg3 != null) {
            this.method2270(22378, arg2, arg0);
            this.method2282(arg5, arg3, 0, 2, arg1, (class220) null, 0, (class130[]) null, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Laa;Lqh;IIIII)V", line = 695)
    public static final void method2279(class281 arg0, class43 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        boolean var7 = true;
        int var8 = arg3;
        int var9 = arg3 + arg5;
        int var10 = arg4 - 1;
        int var11 = arg4 + arg6;
        for (int var12 = arg2; var12 <= arg2 + 1; var12++) {
            if (class176.field2480 != var12) {
                for (int var13 = var8; var13 <= var9; var13++) {
                    if (var13 >= 0 && var13 < class386.field5629) {
                        for (int var14 = var10; var14 <= var11; var14++) {
                            if (var14 >= 0 && var14 < class371.field5311 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg4 && arg3 != var13)) {
                                class142 var15 = class5.field79[var12][var13][var14];
                                if (var15 != null) {
                                    int var16 = (class249.field3456[var12].method275(var13, var14) + class249.field3456[var12].method275(var13 + 1, var14) + class249.field3456[var12].method275(var13, var14 + 1) + class249.field3456[var12].method275(var13 + 1, var14 + 1)) / 4 - (class249.field3456[arg2].method275(arg3, arg4) + class249.field3456[arg2].method275(arg3 + 1, arg4) + class249.field3456[arg2].method275(arg3, arg4 + 1) + class249.field3456[arg2].method275(arg3 + 1, arg4 + 1)) / 4;
                                    class254 var17 = var15.field2031;
                                    class254 var18 = var15.field2044;
                                    if (var17 != null && var17.method137(0)) {
                                        arg1.method129(0, var7, (var14 - arg4) * 128 + (1 - arg6) * 64, (var13 - arg3) * 128 + (1 - arg5) * 64, arg0, var16, var17);
                                    }
                                    if (var18 != null && var18.method137(0)) {
                                        arg1.method129(0, var7, (var14 - arg4) * 128 + (1 - arg6) * 64, (var13 - arg3) * 128 + (1 - arg5) * 64, arg0, var16, var18);
                                    }
                                    for (class218 var19 = var15.field2043; var19 != null; var19 = var19.field2884) {
                                        class430 var20 = var19.field2882;
                                        if (var20 != null && var20.method137(0) && (var20.field6182 == var13 || var8 == var13) && (var20.field6186 == var14 || var10 == var14)) {
                                            int var21 = var20.field6195 + 1 - var20.field6182;
                                            int var22 = var20.field6185 + 1 - var20.field6186;
                                            arg1.method129(0, var7, (var20.field6186 - arg4) * 128 + (var22 - arg6) * 64, (var20.field6182 - arg3) * 128 + (var21 - arg5) * 64, arg0, var16, var20);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var8--;
                var7 = false;
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(III)V", line = 784)
    public static final void method2280(int arg0, int arg1, int arg2) {
        field4931++;
        if ((class42.field629 > class42.field628)) {
            class42.field628 = (float) ((double) class42.field628 / 30.0D + (double) class42.field628);
            if (class42.field628 > class42.field629) {
                class42.field628 = class42.field629;
            }
            class245.method1536((byte) 110);
            class42.field621 = (int) class42.field628 >> 1;
            class42.field627 = class125.method840(class42.field621, (byte) 121);
        } else if (class42.field629 < class42.field628) {
            class42.field628 = (float) ((double) class42.field628 - (double) class42.field628 / 30.0D);
            if (class42.field629 > class42.field628) {
                class42.field628 = class42.field629;
            }
            class245.method1536((byte) 107);
            class42.field621 = (int) class42.field628 >> 1;
            class42.field627 = class125.method840(class42.field621, (byte) 52);
        }
        if (class165.field2359 != -1 && class35.field545 != -1) {
            int var3 = class165.field2359 - class339.field4742;
            if (var3 < 2 || var3 > 2) {
                var3 /= 8;
            }
            int var4 = class35.field545 - class448.field6472;
            if (var4 < 2 || var4 > 2) {
                var4 /= 8;
            }
            class339.field4742 += var3;
            if (var3 == 0 && var4 == 0) {
                class35.field545 = -1;
                class165.field2359 = -1;
            }
            class448.field6472 += var4;
            class245.method1536((byte) 88);
        }
        if (arg1 != -24410) {
            return;
        }
        if (class247.field3431 <= 0) {
            class79.field1230 = -1;
            class84.field1293 = -1;
        } else {
            class270.field3687--;
            if (class270.field3687 == 0) {
                class247.field3431--;
                class270.field3687 = 100;
            }
        }
        if (!class76.field1195 || class448.field6462 == null) {
            return;
        }
        for (class206 var5 = (class206) class448.field6462.method1312((byte) 25); var5 != null; var5 = (class206) class448.field6462.method1304(111)) {
            class46 var6 = class368.method2358(var5.field2781.field2464, 36);
            if (class299.field4145 == 0 && var5.method1348(arg0, (byte) 107, arg2)) {
                if (var6.field694 != null) {
                    if (var6.field694[4] != null) {
                        class336.method2092(-1, 0, var6.field703, (long) var5.field2781.field2464, (byte) 42, 1011, var6.field710, var6.field694[4]);
                    }
                    if (var6.field694[3] != null) {
                        class336.method2092(-1, 0, var6.field703, (long) var5.field2781.field2464, (byte) 74, 1005, var6.field710, var6.field694[3]);
                    }
                    if (var6.field694[2] != null) {
                        class336.method2092(-1, 0, var6.field703, (long) var5.field2781.field2464, (byte) 85, 1012, var6.field710, var6.field694[2]);
                    }
                    if (var6.field694[1] != null) {
                        class336.method2092(-1, 0, var6.field703, (long) var5.field2781.field2464, (byte) 64, 1009, var6.field710, var6.field694[1]);
                    }
                    if (var6.field694[0] != null) {
                        class336.method2092(-1, 0, var6.field703, (long) var5.field2781.field2464, (byte) 66, 1007, var6.field710, var6.field694[0]);
                    }
                }
                if (!var5.field2781.field2456) {
                    var5.field2781.field2456 = true;
                    class111.method737(15, var5.field2781.field2464, var6.field710);
                }
                if (var5.field2781.field2456) {
                    class111.method737(17, var5.field2781.field2464, var6.field710);
                }
            } else if (var5.field2781.field2456) {
                var5.field2781.field2456 = false;
                class111.method737(16, var5.field2781.field2464, var6.field710);
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILjava/lang/String;I[II[Llf;IZ)V", line = 923)
    public final void method2281(int arg0, String arg1, int arg2, int[] arg3, int arg4, class130[] arg5, int arg6, boolean arg7) {
        field4918++;
        if (arg1 != null && arg7) {
            this.method2270(22378, arg6, arg2);
            this.method2282(arg0 - this.field4932.method448((byte) -96, arg1), arg1, 0, 2, arg4, (class220) null, 0, arg5, arg3);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILjava/lang/String;IIILtm;I[Llf;[I)V", line = 943)
    private final void method2282(int arg0, String arg1, int arg2, int arg3, int arg4, class220 arg5, int arg6, class130[] arg7, int[] arg8) {
        field4924++;
        if (arg3 != 2) {
            this.method2278(49, -78, -36, (String) null, (byte) -59, -33);
        }
        int var10 = arg4 - this.field4932.field1022;
        int var11 = -1;
        int var12 = -1;
        int var13 = arg1.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class81.method576(false, arg1.charAt(var14)) & 0xFF);
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
                                    int var17 = class160.method1062(false, var16.substring(4));
                                    class130 var18 = arg7[var17];
                                    int var19 = arg8 == null ? var18.method877() : arg8[var17];
                                    if ((class417.field6029 & 0xFF000000) == -16777216) {
                                        var18.method809(arg0, this.field4932.field1022 + var10 - var19, 0, 0, 1);
                                    } else {
                                        var18.method809(arg0, var10 + this.field4932.field1022 - var19, 1, class417.field6029 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    arg0 += arg7[var17].method874();
                                    var12 = -1;
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method2269(31, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg0 += this.field4932.method447(true, var15, var12);
                    }
                    if (var15 == ' ') {
                        if (class327.field4474 > 0) {
                            class361.field5072 += class327.field4474;
                            arg0 += class361.field5072 >> 8;
                            class361.field5072 &= 0xFF;
                        }
                    } else if (arg5 == null) {
                        if ((class445.field6423 & 0xFF000000) != 0) {
                            this.method617(var15, arg0 + 1, var10 + 1, class445.field6423, true);
                        }
                        this.method617(var15, arg0, var10, class417.field6029, false);
                    } else {
                        if ((class445.field6423 & 0xFF000000) != 0) {
                            this.method618(var15, arg0 + 1, var10 - -1, class445.field6423, true, arg5, arg6, arg2);
                        }
                        this.method618(var15, arg0, var10, class417.field6029, false, arg5, arg6, arg2);
                    }
                    int var20 = this.field4932.method440(true, var15);
                    if (class301.field4173 != -1) {
                        this.field4926.method1739(class301.field4173, 1, (int) ((double) this.field4932.field1022 * 0.7D) + var10, arg0, var20);
                    }
                    if (class442.field6409 != -1) {
                        this.field4926.method1739(class442.field6409, 1, this.field4932.field1022 + var10 + 1, arg0, var20);
                    }
                    var12 = var15;
                    arg0 += var20;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "([IIIILjava/lang/String;IB[Llf;)V", line = 1093)
    public final void method2283(int[] arg0, int arg1, int arg2, int arg3, String arg4, int arg5, byte arg6, class130[] arg7) {
        field4919++;
        if (arg4 == null) {
            return;
        }
        this.method2270(22378, arg3, arg2);
        if (arg6 != -123) {
            field4922 = 121;
        }
        this.method2282(arg1 - (this.field4932.method448((byte) -102, arg4) / 2), arg4, 0, 2, arg5, (class220) null, 0, arg7, arg0);
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Laa;Ldi;)V", line = 1111)
    public class352(class281 arg0, class65 arg1) {
        this.field4932 = arg1;
        this.field4926 = arg0;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(CIIIZ)V")
    public abstract void method617(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(CIIIZLtm;II)V")
    public abstract void method618(char arg0, int arg1, int arg2, int arg3, boolean arg4, class220 arg5, int arg6, int arg7);
}
