import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public abstract class class67 {

    @OriginalMember(owner = "client!da", name = "c", descriptor = "Lkc;")
    private class145 field973;

    @OriginalMember(owner = "client!da", name = "t", descriptor = "Lha;")
    private class66 field990;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    private static int field972 = 0;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "[[I")
    public static int[][] field976 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!da", name = "p", descriptor = "I")
    public static int field986 = -1;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "I")
    public static int field979;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "I")
    public static int field987;

    @OriginalMember(owner = "client!da", name = "r", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!da", name = "s", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!da", name = "u", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!da", name = "v", descriptor = "I")
    public static int field992;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BLjava/lang/String;I)V", line = 4)
    private final void method597(byte arg0, String arg1, int arg2) {
        field981++;
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
            field972 = (arg2 - this.field973.method1172(arg1, (byte) 99) << 8) / var4;
        }
        if (arg0 > -108) {
            field972 = 70;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIILjava/lang/String;IB)V", line = 64)
    public final void method598(int arg0, int arg1, int arg2, String arg3, int arg4, byte arg5) {
        field980++;
        if (arg3 == null) {
            return;
        }
        this.method603(arg2, 0, arg1);
        if (arg5 != -19) {
            field972 = 75;
        }
        this.method610(arg4, null, 0, 0, arg3, null, null, arg0, 0);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BLjava/lang/String;IIILaa;IIIIII[I[Lnf;II)I", line = 81)
    public final int method599(byte arg0, String arg1, int arg2, int arg3, int arg4, class514 arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int[] arg12, class604[] arg13, int arg14, int arg15) {
        int var17 = 95 / ((-arg0 - 90) / 32);
        field991++;
        return this.method604(arg7, arg8, true, arg11, arg12, arg1, arg14, arg15, arg10, arg4, arg9, arg13, arg3, arg6, 0, arg5, arg2);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I[Lnf;IZ[ILjava/util/Random;ILjava/lang/String;II)I", line = 91)
    public final int method600(int arg0, class604[] arg1, int arg2, boolean arg3, int[] arg4, Random arg5, int arg6, String arg7, int arg8, int arg9) {
        field978++;
        if (arg7 == null) {
            return 0;
        }
        arg5.setSeed((long) arg9);
        int var11 = (arg5.nextInt() & 0x1F) + 192;
        this.method603(arg6 & 0xFFFFFF | var11 << 24, 0, arg0 & 0xFFFFFF | var11 << 24);
        int var12 = arg7.length();
        if (arg3) {
            this.method600(122, null, 24, true, null, null, 96, null, -63, 36);
        }
        int[] var13 = new int[var12];
        int var14 = 0;
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg5.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        this.method602(arg2, arg1, arg4, var13, 2, arg8, null, arg7);
        return var14;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II[Lnf;Ljava/lang/String;II[IIIIII[ILjava/util/Random;I)I", line = 129)
    public final int method601(int arg0, int arg1, class604[] arg2, String arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int[] arg12, Random arg13, int arg14) {
        if (arg5 != -22679) {
            return -12;
        }
        field974++;
        if (arg3 == null) {
            return 0;
        }
        arg13.setSeed((long) arg7);
        int var16 = (arg13.nextInt() & 0x1F) + 192;
        this.method603(arg8 & 0xFFFFFF | var16 << 24, 0, arg11 & 0xFFFFFF | var16 << 24);
        int var17 = arg3.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg13.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        int var21 = arg4;
        int var22 = this.field973.field2444 + arg10;
        if (arg1 == 1) {
            var22 += (arg9 - this.field973.field2444 - this.field973.field2434) / 2;
        } else if (arg1 == 2) {
            var22 = arg10 + arg9 - this.field973.field2434;
        }
        int var23 = -1;
        if (arg0 == 1) {
            var23 = this.field973.method1172(arg3, (byte) 87) + var19;
            var21 = (arg14 - var23) / 2 + arg4;
        } else if (arg0 == 2) {
            var23 = var19 + this.field973.method1172(arg3, (byte) 105);
            var21 = arg14 + arg4 - var23;
        }
        this.method602(var22, arg2, arg12, var18, 2, var21, null, arg3);
        if (arg6 != null) {
            if (var23 == -1) {
                var23 = var19 + this.field973.method1172(arg3, (byte) 101);
            }
            arg6[2] = var23;
            arg6[3] = this.field973.field2444 + this.field973.field2434;
            arg6[0] = var21;
            arg6[1] = var22 - this.field973.field2444;
        }
        return var19;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I[Lnf;[I[III[ILjava/lang/String;)V", line = 212)
    private final void method602(int arg0, class604[] arg1, int[] arg2, int[] arg3, int arg4, int arg5, int[] arg6, String arg7) {
        field988++;
        if (arg4 != 2) {
            this.method599((byte) -42, null, 57, 66, -29, null, 22, -101, 77, -78, -88, -11, null, null, -35, -117);
        }
        int var9 = arg0 - this.field973.field2447;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg7.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class687.method3863(arg7.charAt(var14), (byte) -112) & 0xFF);
            if (var15 == '<') {
                var10 = var14;
            } else {
                if (var15 == '>' && var10 != -1) {
                    String var16 = arg7.substring(var10 + 1, var14);
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
                                    if (arg3 == null) {
                                        var17 = 0;
                                    } else {
                                        var17 = arg3[var12];
                                    }
                                    int var18;
                                    if (arg6 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg6[var12];
                                    }
                                    var12++;
                                    int var19 = class287.method1832(arg4 ^ 0xFFFFFF9D, var16.substring(4));
                                    class604 var20 = arg1[var19];
                                    int var21 = arg2 == null ? var20.method218() : arg2[var19];
                                    var20.method215(arg5 + var17, this.field973.field2447 - (var21 - var18) + var9, 1, 0, 1);
                                    var11 = -1;
                                    arg5 += arg1[var19].method224();
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method609(var16, (byte) 48);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg5 += this.field973.method1167(-97, var11, var15);
                    }
                    int var22;
                    if (arg3 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg3[var12];
                    }
                    int var23;
                    if (arg6 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg6[var12];
                    }
                    var12++;
                    if (var15 != ' ') {
                        if ((class68.field1008 & 0xFF000000) != 0) {
                            this.method132(var15, arg5 + var22 + 1, var9 + var23 + 1, class68.field1008, true);
                        }
                        this.method132(var15, arg5 + var22, var9 - -var23, class402.field5530, false);
                    } else if (field972 > 0) {
                        class437.field5940 += field972;
                        arg5 += class437.field5940 >> 8;
                        class437.field5940 &= 0xFF;
                    }
                    int var24 = this.field973.method1171(-1, var15);
                    if (class205.field3089 != -1) {
                        this.field990.method528(-122, var24, class205.field3089, (int) ((double) this.field973.field2447 * 0.7D) + var9, arg5);
                    }
                    if (class269.field3770 != -1) {
                        this.field990.method528(-121, var24, class269.field3770, var9 + this.field973.field2447, arg5);
                    }
                    arg5 += var24;
                    var11 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(III)V", line = 376)
    private final void method603(int arg0, int arg1, int arg2) {
        field972 = arg1;
        class269.field3770 = -1;
        field989++;
        class205.field3089 = -1;
        class539.field7316 = arg2;
        class402.field5530 = arg2;
        class437.field5940 = 0;
        if (arg0 == -1) {
            arg0 = 0;
        }
        class236.field3394 = arg0;
        class68.field1008 = arg0;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIZI[ILjava/lang/String;IIIII[Lnf;IIILaa;I)I", line = 392)
    public final int method604(int arg0, int arg1, boolean arg2, int arg3, int[] arg4, String arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class604[] arg11, int arg12, int arg13, int arg14, class514 arg15, int arg16) {
        field975++;
        if (arg5 == null) {
            return 0;
        }
        this.method603(arg3, 0, arg7);
        if (!arg2) {
            this.field973 = null;
        }
        if (arg8 == 0) {
            arg8 = this.field973.field2447;
        }
        int[] var18;
        if (this.field973.field2444 + this.field973.field2434 + arg8 > arg10 && arg10 < (arg8 + arg8)) {
            var18 = null;
        } else {
            var18 = new int[] { arg9 };
        }
        int var19 = this.field973.method1163(arg5, true, var18, arg11, class332.field4497);
        if (arg14 == -1) {
            arg14 = arg10 / arg8;
            if (arg14 <= 0) {
                arg14 = 1;
            }
        }
        if (arg14 > 0 && var19 >= arg14) {
            class332.field4497[arg14 - 1] = this.field973.method1169(arg9, -61, class332.field4497[arg14 - 1], arg11);
            var19 = arg14;
        }
        if (arg1 == 3 && var19 == 1) {
            arg1 = 1;
        }
        int var20;
        if (arg1 == 0) {
            var20 = this.field973.field2444 + arg16;
        } else if (arg1 == 1) {
            var20 = (arg10 - this.field973.field2444 - ((var19 - 1) * arg8) - this.field973.field2434) / 2 + arg16 + this.field973.field2444;
        } else if (arg1 == 2) {
            var20 = arg16 + arg10 - ((var19 + -1) * arg8) - this.field973.field2434;
        } else {
            int var21 = (arg10 - ((var19 - 1) * arg8) - this.field973.field2444 - this.field973.field2434) / (var19 + 1);
            if (var21 < 0) {
                var21 = 0;
            }
            arg8 += var21;
            var20 = this.field973.field2444 + arg16 + var21;
        }
        for (int var22 = 0; var22 < var19; var22++) {
            if (arg12 == 0) {
                this.method610(arg6, arg15, arg13, arg0, class332.field4497[var22], arg4, arg11, var20, 0);
            } else if (arg12 == 1) {
                this.method610((arg9 - this.field973.method1172(class332.field4497[var22], (byte) 85)) / 2 + arg6, arg15, arg13, arg0, class332.field4497[var22], arg4, arg11, var20, 0);
            } else if (arg12 == 2) {
                this.method610(arg6 + arg9 - this.field973.method1172(class332.field4497[var22], (byte) 90), arg15, arg13, arg0, class332.field4497[var22], arg4, arg11, var20, 0);
            } else if (var19 - 1 == var22) {
                this.method610(arg6, arg15, arg13, arg0, class332.field4497[var22], arg4, arg11, var20, 0);
            } else {
                this.method597((byte) -121, class332.field4497[var22], arg9);
                this.method610(arg6, arg15, arg13, arg0, class332.field4497[var22], arg4, arg11, var20, 0);
                field972 = 0;
            }
            var20 += arg8;
        }
        return var19;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;IIB)V", line = 490)
    public final void method605(int arg0, int arg1, String arg2, int arg3, int arg4, byte arg5) {
        field992++;
        if (arg2 != null) {
            this.method603(arg3, 0, arg4);
            int var7 = -46 / ((arg5 - 86) / 36);
            this.method610(arg1 - this.field973.method1172(arg2, (byte) 102), null, 0, 0, arg2, null, null, arg0, 0);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V", line = 508)
    public static void method606(int arg0) {
        if (arg0 != -1) {
            method606(-34);
        }
        field976 = null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIBLjava/lang/String;I)V", line = 520)
    public final void method607(int arg0, int arg1, int arg2, int arg3, byte arg4, String arg5, int arg6) {
        field977++;
        if (arg5 == null) {
            return;
        }
        this.method603(arg1, arg4 - 58, arg3);
        int var8 = arg5.length();
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        if (arg4 != 58) {
            this.field990 = null;
        }
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg2 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg2 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method602(arg0, null, null, var9, 2, arg6 - (this.field973.method1172(arg5, (byte) 35) / 2), var10, arg5);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II[ILjava/lang/String;III[Lnf;)V", line = 555)
    public final void method608(int arg0, int arg1, int[] arg2, String arg3, int arg4, int arg5, int arg6, class604[] arg7) {
        field982++;
        if (arg3 != null) {
            this.method603(arg6, 0, arg5);
            this.method610(arg0, null, 0, 0, arg3, arg2, arg7, arg1, arg4);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 568)
    private final void method609(String arg0, byte arg1) {
        try {
            if (arg0.startsWith("col=")) {
                class402.field5530 = class402.field5530 & 0xFF000000 | class764.method4217(16, 4096, arg0.substring(4)) & 0xFFFFFF;
            } else if (arg0.equals("/col")) {
                class402.field5530 = class402.field5530 & 0xFF000000 | class539.field7316 & 0xFFFFFF;
            }
            if (arg0.startsWith("argb=")) {
                class402.field5530 = class764.method4217(16, arg1 ^ 0x1030, arg0.substring(5));
            } else if (arg0.equals("/argb")) {
                class402.field5530 = class539.field7316;
            } else if (arg0.startsWith("str=")) {
                class205.field3089 = class402.field5530 & 0xFF000000 | class764.method4217(16, 4096, arg0.substring(4));
            } else if (arg0.equals("str")) {
                class205.field3089 = class402.field5530 & 0xFF000000 | 0x800000;
            } else if (arg0.equals("/str")) {
                class205.field3089 = -1;
            } else if (arg0.startsWith("u=")) {
                class269.field3770 = class402.field5530 & 0xFF000000 | class764.method4217(16, 4096, arg0.substring(2));
            } else if (arg0.equals("u")) {
                class269.field3770 = class402.field5530 & 0xFF000000;
            } else if (arg0.equals("/u")) {
                class269.field3770 = -1;
            } else if (arg0.equalsIgnoreCase("shad=-1")) {
                class68.field1008 = 0;
            } else if (arg0.startsWith("shad=")) {
                class68.field1008 = class402.field5530 & 0xFF000000 | class764.method4217(16, 4096, arg0.substring(5));
            } else if (arg0.equals("shad")) {
                class68.field1008 = class402.field5530 & 0xFF000000;
            } else if (arg0.equals("/shad")) {
                class68.field1008 = class236.field3394;
            } else if (arg0.equals("br")) {
                this.method603(class236.field3394, 0, class539.field7316);
            }
            if (arg1 != 48) {
                this.method612(50, -32, 114, 63, null, 107, -82);
            }
        } catch (Exception var3) {
        }
        field987++;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILaa;IILjava/lang/String;[I[Lnf;II)V", line = 648)
    private final void method610(int arg0, class514 arg1, int arg2, int arg3, String arg4, int[] arg5, class604[] arg6, int arg7, int arg8) {
        int var10 = arg7 - this.field973.field2447;
        field984++;
        int var11 = -1;
        int var12 = -1;
        int var13 = arg4.length();
        for (int var14 = arg8; var14 < var13; var14++) {
            char var15 = (char) (class687.method3863(arg4.charAt(var14), (byte) -116) & 0xFF);
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
                                    int var17 = class287.method1832(-96, var16.substring(4));
                                    class604 var18 = arg6[var17];
                                    int var19 = arg5 == null ? var18.method218() : arg5[var17];
                                    if ((class402.field5530 & 0xFF000000) == -16777216) {
                                        var18.method215(arg0, var10 + this.field973.field2447 - var19, 1, 0, 1);
                                    } else {
                                        var18.method215(arg0, var10 + this.field973.field2447 - var19, 0, class402.field5530 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    arg0 += arg6[var17].method224();
                                    var12 = -1;
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method609(var16, (byte) 48);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg0 += this.field973.method1167(-45, var12, var15);
                    }
                    if (var15 == ' ') {
                        if (field972 > 0) {
                            class437.field5940 += field972;
                            arg0 += class437.field5940 >> 8;
                            class437.field5940 &= 0xFF;
                        }
                    } else if (arg1 == null) {
                        if ((class68.field1008 & 0xFF000000) != 0) {
                            this.method132(var15, arg0 + 1, var10 + 1, class68.field1008, true);
                        }
                        this.method132(var15, arg0, var10, class402.field5530, false);
                    } else {
                        if ((class68.field1008 & 0xFF000000) != 0) {
                            this.method134(var15, arg0 + 1, var10 - -1, class68.field1008, true, arg1, arg2, arg3);
                        }
                        this.method134(var15, arg0, var10, class402.field5530, false, arg1, arg2, arg3);
                    }
                    int var20 = this.field973.method1171(-1, var15);
                    if (class205.field3089 != -1) {
                        this.field990.method528(-126, var20, class205.field3089, (int) ((double) this.field973.field2447 * 0.7D) + var10, arg0);
                    }
                    if (class269.field3770 != -1) {
                        this.field990.method528(arg8 ^ 0xFFFFFF80, var20, class269.field3770, this.field973.field2447 + var10 + 1, arg0);
                    }
                    arg0 += var20;
                    var12 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIILjava/lang/String;III)V", line = 801)
    public final void method611(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5, int arg6, int arg7) {
        field983++;
        int var9 = -48 % ((arg3 + 16) / 52);
        if (arg4 == null) {
            return;
        }
        this.method603(arg7, 0, arg1);
        double var10 = 7.0D - ((double) arg6 / 8.0D);
        if (var10 < 0.0D) {
            var10 = 0.0D;
        }
        int var12 = arg4.length();
        int[] var13 = new int[var12];
        for (int var14 = 0; var14 < var12; var14++) {
            var13[var14] = (int) (var10 * Math.sin((double) var14 / 1.5D + (double) arg0));
        }
        this.method602(arg5, null, null, null, 2, arg2 - (this.field973.method1172(arg4, (byte) 121) / 2), var13, arg4);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIILjava/lang/String;II)V", line = 832)
    public final void method612(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5, int arg6) {
        field979++;
        if (arg4 == null) {
            return;
        }
        this.method603(arg3, arg6 - 13898, arg2);
        if (arg6 != 13898) {
            this.method599((byte) 116, null, 57, 19, -113, null, 71, 83, -35, 115, -45, 77, null, null, -92, -113);
        }
        int var8 = arg4.length();
        int[] var9 = new int[var8];
        for (int var10 = 0; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg1 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method602(arg0, null, null, null, arg6 ^ 0x3648, arg5 - this.field973.method1172(arg4, (byte) 89) / 2, var9, arg4);
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lha;Lkc;)V", line = 857)
    public class67(class66 arg0, class145 arg1) {
        this.field973 = arg1;
        this.field990 = arg0;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;IZI)V", line = 866)
    public final void method613(int arg0, int arg1, String arg2, int arg3, boolean arg4, int arg5) {
        field971++;
        if (!arg4) {
            field986 = -123;
        }
        if (arg2 != null) {
            this.method603(arg1, 0, arg3);
            this.method610(arg0 - (this.field973.method1172(arg2, (byte) 80) / 2), null, 0, 0, arg2, null, null, arg5, 0);
        }
    }

    @OriginalMember(owner = "client!da", name = "fa", descriptor = "(CIIIZ)V")
    public abstract void method132(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(CIIIZLaa;II)V")
    public abstract void method134(char arg0, int arg1, int arg2, int arg3, boolean arg4, class514 arg5, int arg6, int arg7);
}
