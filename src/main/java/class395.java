import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public abstract class class395 {

    @OriginalMember(owner = "client!la", name = "t", descriptor = "Lll;")
    private class490 field5724;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "Lr;")
    private class98 field5709;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field5705;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public static int field5706;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public static int field5707;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    public static int field5708;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "I")
    public static int field5710;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    public static int field5711;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "I")
    public static int field5712;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "I")
    public static int field5714;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "I")
    public static int field5715;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "I")
    public static int field5716;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "I")
    public static int field5717;

    @OriginalMember(owner = "client!la", name = "n", descriptor = "I")
    public static int field5718;

    @OriginalMember(owner = "client!la", name = "o", descriptor = "I")
    public static int field5719;

    @OriginalMember(owner = "client!la", name = "p", descriptor = "I")
    public static int field5720;

    @OriginalMember(owner = "client!la", name = "q", descriptor = "I")
    public static int field5721;

    @OriginalMember(owner = "client!la", name = "r", descriptor = "I")
    public static int field5722;

    @OriginalMember(owner = "client!la", name = "s", descriptor = "I")
    public static int field5723;

    @OriginalMember(owner = "client!la", name = "u", descriptor = "I")
    public static int field5725;

    @OriginalMember(owner = "client!la", name = "v", descriptor = "I")
    public static int field5726;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "[[B")
    public static byte[][] field5713;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIBIIILjava/lang/String;)V", line = 7)
    public final void method2385(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, String arg7) {
        field5719++;
        if (arg7 == null) {
            return;
        }
        this.method2393(arg0, arg5, 114);
        double var9 = 7.0D - (double) arg4 / 8.0D;
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg7.length();
        int[] var12 = new int[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (Math.sin((double) var13 / 1.5D + (double) arg6) * var9);
        }
        if (arg3 != 42) {
            this.method2402(-106, null, null, -84, 87, (byte) 87, 121, -18, 99, -15, 100, -43, null, 52, null, 106);
        }
        this.method2386(arg7, var12, null, null, arg2, null, arg1 - (this.field5724.method2870(true, arg7) / 2), (byte) 108);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;[I[Lf;[II[IIB)V", line = 38)
    private final void method2386(String arg0, int[] arg1, class257[] arg2, int[] arg3, int arg4, int[] arg5, int arg6, byte arg7) {
        int var9 = arg4 - this.field5724.field7039;
        field5726++;
        int var10 = -1;
        int var11 = -2 / ((arg7 - 70) / 36);
        int var12 = -1;
        int var13 = 0;
        int var14 = arg0.length();
        for (int var15 = 0; var15 < var14; var15++) {
            char var16 = (char) (class107.method888(-161, arg0.charAt(var15)) & 0xFF);
            if (var16 == '<') {
                var10 = var15;
            } else {
                if (var16 == '>' && var10 != -1) {
                    String var17 = arg0.substring(var10 + 1, var15);
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
                                    if (arg5 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg5[var13];
                                    }
                                    int var19;
                                    if (arg1 == null) {
                                        var19 = 0;
                                    } else {
                                        var19 = arg1[var13];
                                    }
                                    var13++;
                                    int var20 = class252.method1611(var17.substring(4), (byte) 68);
                                    class257 var21 = arg2[var20];
                                    int var22 = arg3 == null ? var21.method9() : arg3[var20];
                                    var21.method3(arg6 + var18, this.field5724.field7039 + var9 + -var22 - -var19, 1, 0, 1);
                                    arg6 += arg2[var20].method11();
                                    var12 = -1;
                                } catch (Exception var26) {
                                }
                            } else {
                                this.method2398(var17, 122);
                            }
                            continue;
                        }
                        var16 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var12 != -1) {
                        arg6 += this.field5724.method2865(-23241, var12, var16);
                    }
                    int var23;
                    if (arg5 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg5[var13];
                    }
                    int var24;
                    if (arg1 == null) {
                        var24 = 0;
                    } else {
                        var24 = arg1[var13];
                    }
                    var13++;
                    if (var16 != ' ') {
                        if ((class353.field4946 & 0xFF000000) != 0) {
                            this.method368(var16, arg6 + var23 + 1, var9 + 1 + var24, class353.field4946, true);
                        }
                        this.method368(var16, arg6 + var23, var9 + var24, class452.field6503, false);
                    } else if (class564.field8258 > 0) {
                        class688.field9763 += class564.field8258;
                        arg6 += class688.field9763 >> 8;
                        class688.field9763 &= 0xFF;
                    }
                    int var25 = this.field5724.method2866(21346, var16);
                    if (class149.field2510 != -1) {
                        this.field5709.method773((int) ((double) this.field5724.field7039 * 0.7D) + var9, 128, var25, class149.field2510, arg6);
                    }
                    if (class219.field3278 != -1) {
                        this.field5709.method773(this.field5724.field7039 + var9, 128, var25, class219.field3278, arg6);
                    }
                    arg6 += var25;
                    var12 = var16;
                }
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IILjava/lang/String;IBII)V", line = 206)
    public final void method2387(int arg0, int arg1, String arg2, int arg3, byte arg4, int arg5, int arg6) {
        field5723++;
        if (arg2 == null) {
            return;
        }
        this.method2393(arg6, arg3, 109);
        int var8 = 72 / ((arg4 - 84) / 40);
        int var9 = arg2.length();
        int[] var10 = new int[var9];
        for (int var11 = 0; var11 < var9; var11++) {
            var10[var11] = (int) (Math.sin((double) arg5 / 5.0D + (double) var11 / 2.0D) * 5.0D);
        }
        this.method2386(arg2, var10, null, null, arg1, null, arg0 - (this.field5724.method2870(true, arg2) / 2), (byte) -83);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([IIIIIILua;IIIIILjava/lang/String;III[Lf;)I", line = 232)
    public final int method2388(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class591 arg6, int arg7, int arg8, int arg9, int arg10, int arg11, String arg12, int arg13, int arg14, int arg15, class257[] arg16) {
        field5714++;
        if (arg12 == null) {
            return 0;
        }
        this.method2393(arg10, arg4, 126);
        if (arg3 == 0) {
            arg3 = this.field5724.field7039;
        }
        int[] var18;
        if ((this.field5724.field7038 + arg3 + this.field5724.field7041) > arg2 && arg3 + arg3 > arg2) {
            var18 = null;
        } else {
            var18 = new int[] { arg13 };
        }
        int var19 = this.field5724.method2864(arg16, class277.field3932, var18, arg12, arg7 - 173);
        if (arg8 == -1) {
            arg8 = arg2 / arg3;
            if (arg8 <= 0) {
                arg8 = 1;
            }
        }
        if (arg8 > 0 && var19 >= arg8) {
            class277.field3932[arg8 - 1] = this.field5724.method2869(arg13, class277.field3932[arg8 - 1], arg7 - 289, arg16);
            var19 = arg8;
        }
        if (arg11 == 3 && var19 == 1) {
            arg11 = 1;
        }
        int var20;
        if (arg11 == 0) {
            var20 = this.field5724.field7038 + arg1;
        } else if (arg11 == 1) {
            var20 = (arg2 - this.field5724.field7041 - this.field5724.field7038 - ((var19 - 1) * arg3)) / 2 + this.field5724.field7038 + arg1;
        } else if (arg11 == 2) {
            var20 = arg1 + arg2 - this.field5724.field7041 - (var19 + -1) * arg3;
        } else {
            int var21 = (arg2 - this.field5724.field7041 - ((var19 - 1) * arg3) - this.field5724.field7038) / (var19 + 1);
            if (var21 < 0) {
                var21 = 0;
            }
            var20 = this.field5724.field7038 + arg1 + var21;
            arg3 += var21;
        }
        for (int var22 = 0; var22 < var19; var22++) {
            if (arg5 == 0) {
                this.method2389(class277.field3932[var22], arg14, arg9, arg15, var20, false, arg16, arg6, arg0);
            } else if (arg5 == 1) {
                this.method2389(class277.field3932[var22], arg14 + ((arg13 - this.field5724.method2870(true, class277.field3932[var22])) / 2), arg9, arg15, var20, false, arg16, arg6, arg0);
            } else if (arg5 == 2) {
                this.method2389(class277.field3932[var22], arg13 + arg14 - this.field5724.method2870(true, class277.field3932[var22]), arg9, arg15, var20, false, arg16, arg6, arg0);
            } else if ((var19 - 1) == var22) {
                this.method2389(class277.field3932[var22], arg14, arg9, arg15, var20, false, arg16, arg6, arg0);
            } else {
                this.method2391(class277.field3932[var22], (byte) 11, arg13);
                this.method2389(class277.field3932[var22], arg14, arg9, arg15, var20, false, arg16, arg6, arg0);
                class564.field8258 = 0;
            }
            var20 += arg3;
        }
        if (arg7 != 173) {
            this.method2396(-15, null, null, 86, 121, null, (byte) -23, 41);
        }
        return var19;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;IIIIZ[Lf;Lua;[I)V", line = 332)
    private final void method2389(String arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, class257[] arg6, class591 arg7, int[] arg8) {
        int var10 = arg4 - this.field5724.field7039;
        field5717++;
        int var11 = -1;
        int var12 = -1;
        int var13 = arg0.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class107.method888(-161, arg0.charAt(var14)) & 0xFF);
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
                                    int var17 = class252.method1611(var16.substring(4), (byte) 121);
                                    class257 var18 = arg6[var17];
                                    int var19 = arg8 == null ? var18.method9() : arg8[var17];
                                    if ((class452.field6503 & 0xFF000000) == -16777216) {
                                        var18.method3(arg1, this.field5724.field7039 + var10 - var19, 1, 0, 1);
                                    } else {
                                        var18.method3(arg1, this.field5724.field7039 + var10 - var19, 0, class452.field6503 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    var12 = -1;
                                    arg1 += arg6[var17].method11();
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method2398(var16, 109);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg1 += this.field5724.method2865(-23241, var12, var15);
                    }
                    if (var15 == ' ') {
                        if (class564.field8258 > 0) {
                            class688.field9763 += class564.field8258;
                            arg1 += class688.field9763 >> 8;
                            class688.field9763 &= 0xFF;
                        }
                    } else if (arg7 == null) {
                        if ((class353.field4946 & 0xFF000000) != 0) {
                            this.method368(var15, arg1 + 1, var10 + 1, class353.field4946, true);
                        }
                        this.method368(var15, arg1, var10, class452.field6503, false);
                    } else {
                        if ((class353.field4946 & 0xFF000000) != 0) {
                            this.method366(var15, arg1 + 1, var10 + 1, class353.field4946, true, arg7, arg3, arg2);
                        }
                        this.method366(var15, arg1, var10, class452.field6503, false, arg7, arg3, arg2);
                    }
                    int var20 = this.field5724.method2866(21346, var15);
                    if (class149.field2510 != -1) {
                        this.field5709.method773((int) ((double) this.field5724.field7039 * 0.7D) + var10, 128, var20, class149.field2510, arg1);
                    }
                    if (class219.field3278 != -1) {
                        this.field5709.method773(this.field5724.field7039 + var10 + 1, 128, var20, class219.field3278, arg1);
                    }
                    var12 = var15;
                    arg1 += var20;
                }
            }
        }
        if (arg5) {
            this.method2399(-111, -71, -24, 106, null, (byte) 42);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([Lf;IBILjava/util/Random;[IILjava/lang/String;II)I", line = 487)
    public final int method2390(class257[] arg0, int arg1, byte arg2, int arg3, Random arg4, int[] arg5, int arg6, String arg7, int arg8, int arg9) {
        field5710++;
        if (arg7 == null) {
            return 0;
        }
        arg4.setSeed((long) arg8);
        int var11 = (arg4.nextInt() & 0x1F) + 192;
        this.method2393(var11 << 24 | arg3 & 0xFFFFFF, arg9 & 0xFFFFFF | var11 << 24, 113);
        int var12 = arg7.length();
        int[] var13 = new int[var12];
        int var14 = 0;
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg4.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        if (arg2 != -1) {
            this.field5709 = null;
        }
        this.method2386(arg7, null, arg0, arg5, arg1, var13, arg6, (byte) 106);
        return var14;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;BI)V", line = 525)
    private final void method2391(String arg0, byte arg1, int arg2) {
        field5707++;
        if (arg1 != 11) {
            method2401(true);
        }
        int var4 = 0;
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
            class564.field8258 = (arg2 - this.field5724.method2870(true, arg0) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V", line = 565)
    public static final void method2392(byte arg0) {
        field5715++;
        class580.field8512.method936(arg0 ^ 0xFFFFFFDD);
        class638.field9056.method936(arg0 - 50);
        if (arg0 != 12) {
            method2397(-37, 27);
        }
        class477.field6828.method936(-109);
        class241.field3538.method936(arg0 - 80);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(III)V", line = 579)
    private final void method2393(int arg0, int arg1, int arg2) {
        class445.field6440 = arg1;
        class452.field6503 = arg1;
        field5722++;
        class564.field8258 = 0;
        class688.field9763 = 0;
        class149.field2510 = -1;
        if (arg0 == -1) {
            arg0 = 0;
        }
        if (arg2 > 106) {
            class219.field3278 = -1;
            class525.field7712 = arg0;
            class353.field4946 = arg0;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BILjava/lang/String;III)V", line = 607)
    public final void method2394(byte arg0, int arg1, String arg2, int arg3, int arg4, int arg5) {
        if (arg0 <= 101) {
            return;
        }
        field5711++;
        if (arg2 != null) {
            this.method2393(arg3, arg4, 111);
            this.method2389(arg2, arg1, 0, 0, arg5, false, null, null, null);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([II[IIIIILjava/lang/String;ILjava/util/Random;[Lf;BIII)I", line = 628)
    public final int method2395(int[] arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, String arg7, int arg8, Random arg9, class257[] arg10, byte arg11, int arg12, int arg13, int arg14) {
        field5725++;
        if (arg7 == null) {
            return 0;
        }
        arg9.setSeed((long) arg3);
        int var16 = (arg9.nextInt() & 0x1F) + 192;
        int var17 = 98 / ((-arg11 - 14) / 44);
        this.method2393(var16 << 24 | arg14 & 0xFFFFFF, var16 << 24 | arg6 & 0xFFFFFF, 108);
        int var18 = arg7.length();
        int[] var19 = new int[var18];
        int var20 = 0;
        for (int var21 = 0; var21 < var18; var21++) {
            var19[var21] = var20;
            if ((arg9.nextInt() & 0x3) == 0) {
                var20++;
            }
        }
        int var22 = arg12;
        int var23 = this.field5724.field7038 + arg8;
        if (arg4 == 1) {
            var23 += (arg13 - this.field5724.field7041 - this.field5724.field7038) / 2;
        } else if (arg4 == 2) {
            var23 = arg8 + arg13 - this.field5724.field7041;
        }
        int var24 = -1;
        if (arg1 == 1) {
            var24 = var20 + this.field5724.method2870(true, arg7);
            var22 = (arg5 - var24) / 2 + arg12;
        } else if (arg1 == 2) {
            var24 = this.field5724.method2870(true, arg7) + var20;
            var22 = arg5 + arg12 - var24;
        }
        this.method2386(arg7, null, arg10, arg0, var23, var19, var22, (byte) 111);
        if (arg2 != null) {
            if (var24 == -1) {
                var24 = this.field5724.method2870(true, arg7) + var20;
            }
            arg2[2] = var24;
            arg2[3] = this.field5724.field7041 + this.field5724.field7038;
            arg2[1] = var23 - this.field5724.field7038;
            arg2[0] = var22;
        }
        return var20;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;[III[Lf;BI)V", line = 704)
    public final void method2396(int arg0, String arg1, int[] arg2, int arg3, int arg4, class257[] arg5, byte arg6, int arg7) {
        field5712++;
        if (arg1 == null) {
            return;
        }
        this.method2393(arg7, arg4, 123);
        if (arg6 >= -88) {
            field5713 = null;
        }
        this.method2389(arg1, arg3, 0, 0, arg0, false, arg5, null, arg2);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II)Lkga;", line = 722)
    public static final class520 method2397(int arg0, int arg1) {
        field5721++;
        class520[] var2 = class680.method3846(-119);
        for (int var3 = arg1; var3 < var2.length; var3++) {
            class520 var4 = var2[var3];
            if (var4.field7668 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 747)
    private final void method2398(String arg0, int arg1) {
        try {
            if (arg0.startsWith("col=")) {
                class452.field6503 = class452.field6503 & 0xFF000000 | class681.method3850(arg0.substring(4), 16, (byte) 107) & 0xFFFFFF;
            } else if (arg0.equals("/col")) {
                class452.field6503 = class452.field6503 & 0xFF000000 | class445.field6440 & 0xFFFFFF;
            }
            if (arg0.startsWith("argb=")) {
                class452.field6503 = class681.method3850(arg0.substring(5), 16, (byte) 118);
            } else if (arg0.equals("/argb")) {
                class452.field6503 = class445.field6440;
            } else if (arg0.startsWith("str=")) {
                class149.field2510 = class452.field6503 & 0xFF000000 | class681.method3850(arg0.substring(4), 16, (byte) 108);
            } else if (arg0.equals("str")) {
                class149.field2510 = class452.field6503 & 0xFF000000 | 0x800000;
            } else if (arg0.equals("/str")) {
                class149.field2510 = -1;
            } else if (arg0.startsWith("u=")) {
                class219.field3278 = class452.field6503 & 0xFF000000 | class681.method3850(arg0.substring(2), 16, (byte) 86);
            } else if (arg0.equals("u")) {
                class219.field3278 = class452.field6503 & 0xFF000000;
            } else if (arg0.equals("/u")) {
                class219.field3278 = -1;
            } else if (arg0.equalsIgnoreCase("shad=-1")) {
                class353.field4946 = 0;
            } else if (arg0.startsWith("shad=")) {
                class353.field4946 = class452.field6503 & 0xFF000000 | class681.method3850(arg0.substring(5), 16, (byte) 123);
            } else if (arg0.equals("shad")) {
                class353.field4946 = class452.field6503 & 0xFF000000;
            } else if (arg0.equals("/shad")) {
                class353.field4946 = class525.field7712;
            } else if (arg0.equals("br")) {
                this.method2393(class525.field7712, class445.field6440, 122);
            }
        } catch (Exception var3) {
        }
        field5706++;
        if (arg1 < 69) {
            this.field5724 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIILjava/lang/String;B)V", line = 823)
    public final void method2399(int arg0, int arg1, int arg2, int arg3, String arg4, byte arg5) {
        if (arg5 != 109) {
            return;
        }
        field5718++;
        if (arg4 != null) {
            this.method2393(arg3, arg0, arg5 + 3);
            this.method2389(arg4, arg1 - (this.field5724.method2870(true, arg4) / 2), 0, 0, arg2, false, null, null, null);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;IIIII)V", line = 839)
    public final void method2400(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5708++;
        if (arg1 == null) {
            return;
        }
        this.method2393(arg2, arg0, arg6 ^ 0x7E);
        int var8 = arg1.length();
        if (arg6 != 5) {
            this.field5724 = null;
        }
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg5 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg5 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method2386(arg1, var10, null, null, arg4, var9, arg3 - (this.field5724.method2870(true, arg1) / 2), (byte) 12);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Z)V", line = 873)
    public static void method2401(boolean arg0) {
        field5713 = null;
        if (arg0) {
            field5705 = -109;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I[ILua;IIBIIIIIILjava/lang/String;I[Lf;I)I", line = 883)
    public final int method2402(int arg0, int[] arg1, class591 arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, String arg12, int arg13, class257[] arg14, int arg15) {
        int var17 = -104 % ((arg5 + 40) / 55);
        field5720++;
        return this.method2388(arg1, arg9, arg3, arg7, arg11, arg0, arg2, 173, 0, arg6, arg8, arg13, arg12, arg10, arg15, arg4, arg14);
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lr;Lll;)V", line = 893)
    public class395(class98 arg0, class490 arg1) {
        this.field5724 = arg1;
        this.field5709 = arg0;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIILjava/lang/String;)V", line = 902)
    public final void method2403(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5) {
        field5716++;
        if (arg0 != 63409608) {
            field5705 = -5;
        }
        if (arg5 != null) {
            this.method2393(arg4, arg1, arg0 ^ 0x3C78DBB);
            this.method2389(arg5, arg3 - this.field5724.method2870(true, arg5), 0, 0, arg2, false, null, null, null);
        }
    }

    @OriginalMember(owner = "client!la", name = "OA", descriptor = "(CIIIZ)V")
    public abstract void method368(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(CIIIZLua;II)V")
    public abstract void method366(char arg0, int arg1, int arg2, int arg3, boolean arg4, class591 arg5, int arg6, int arg7);
}
