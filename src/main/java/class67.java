import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public abstract class class67 {

    @OriginalMember(owner = "client!da", name = "f", descriptor = "Leb;")
    private class651 field924;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "Lha;")
    private class66 field934;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "I")
    public static int field933 = 765;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "[Lpja;")
    public static class43[] field935 = new class43[300];

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public static int field922;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!da", name = "r", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!da", name = "s", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!da", name = "t", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!da", name = "u", descriptor = "I")
    public static int field939;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II[Lhh;[IIBLjava/lang/String;IIILaa;IIIII)I")
    public final int method557(int arg0, int arg1, class140[] arg2, int[] arg3, int arg4, byte arg5, String arg6, int arg7, int arg8, int arg9, class512 arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        field937++;
        int var17 = -31 / ((-arg5 - 50) / 42);
        return this.method570(arg8, arg7, -1, arg1, arg6, arg12, arg3, arg15, arg0, arg9, arg13, 0, arg2, arg14, arg4, arg11, arg10);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II[I[Lhh;IIILjava/lang/String;)V")
    public final void method558(int arg0, int arg1, int[] arg2, class140[] arg3, int arg4, int arg5, int arg6, String arg7) {
        field927++;
        if (arg7 != null) {
            this.method566(-128, arg1, arg0);
            this.method564(true, arg5, arg2, 0, arg6, arg4, arg3, null, arg7);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V")
    public final void method559(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field932++;
        if (arg0 == null) {
            return;
        }
        this.method566(arg2 ^ 0x63, arg6, arg1);
        if (arg2 != -1) {
            return;
        }
        int var8 = arg0.length();
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg4 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg4 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method565(null, arg0, arg5, var10, arg3 - (this.field924.method3619((byte) -69, arg0) / 2), (byte) 70, var9, null);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIBIILjava/lang/String;)V")
    public final void method560(int arg0, int arg1, byte arg2, int arg3, int arg4, String arg5) {
        field931++;
        if (arg5 == null) {
            return;
        }
        this.method566(arg2 ^ 0x6, arg4, arg3);
        if (arg2 != 125) {
            this.field924 = null;
        }
        this.method564(true, 0, null, 0, arg1 - this.field924.method3619((byte) -69, arg5), arg0, null, null, arg5);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;IIII)V")
    public final void method561(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        field930++;
        if (arg1 != null) {
            this.method566(119, arg0, arg2);
            this.method564(true, 0, null, 0, arg5 - (this.field924.method3619((byte) -69, arg1) / 2), arg4, null, null, arg1);
            int var7 = -98 % ((42 - arg3) / 60);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(CIIIZLaa;II)V")
    public abstract void method107(char arg0, int arg1, int arg2, int arg3, boolean arg4, class512 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;[IIBIIILjava/util/Random;[Lhh;I)I")
    public final int method562(String arg0, int[] arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, Random arg7, class140[] arg8, int arg9) {
        field929++;
        if (arg0 == null) {
            return 0;
        }
        arg7.setSeed((long) arg6);
        int var11 = (arg7.nextInt() & 0x1F) + 192;
        this.method566(92, arg4 & 0xFFFFFF | var11 << 24, arg5 & 0xFFFFFF | var11 << 24);
        if (arg3 > -76) {
            return -49;
        }
        int var12 = arg0.length();
        int[] var13 = new int[var12];
        int var14 = 0;
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg7.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        this.method565(arg8, arg0, arg9, null, arg2, (byte) 70, var13, arg1);
        return var14;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I[IIILjava/util/Random;IZ[I[Lhh;IILjava/lang/String;III)I")
    public final int method563(int arg0, int[] arg1, int arg2, int arg3, Random arg4, int arg5, boolean arg6, int[] arg7, class140[] arg8, int arg9, int arg10, String arg11, int arg12, int arg13, int arg14) {
        field920++;
        if (arg11 == null) {
            return 0;
        }
        arg4.setSeed((long) arg5);
        int var16 = (arg4.nextInt() & 0x1F) + 192;
        this.method566(-127, var16 << 24 | arg0 & 0xFFFFFF, arg9 & 0xFFFFFF | var16 << 24);
        int var17 = arg11.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg4.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        int var21 = arg3;
        int var22 = arg2 + this.field924.field8769;
        int var23 = -1;
        if (arg12 == 1) {
            var22 += (arg10 - this.field924.field8782 - this.field924.field8769) / 2;
        } else if (arg12 == 2) {
            var22 = arg2 + arg10 - this.field924.field8782;
        }
        if (!arg6) {
            this.method557(93, -75, null, null, -92, (byte) -121, null, -30, 63, -34, null, -85, 96, 106, -113, -120);
        }
        if (arg13 == 1) {
            var23 = var19 + this.field924.method3619((byte) -69, arg11);
            var21 = (arg14 - var23) / 2 + arg3;
        } else if (arg13 == 2) {
            var23 = var19 + this.field924.method3619((byte) -69, arg11);
            var21 = arg14 + arg3 - var23;
        }
        this.method565(arg8, arg11, var22, null, var21, (byte) 70, var18, arg7);
        if (arg1 != null) {
            if (var23 == -1) {
                var23 = var19 + this.field924.method3619((byte) -69, arg11);
            }
            arg1[3] = this.field924.field8769 + this.field924.field8782;
            arg1[2] = var23;
            arg1[1] = var22 - this.field924.field8769;
            arg1[0] = var21;
        }
        return var19;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZI[IIII[Lhh;Laa;Ljava/lang/String;)V")
    private final void method564(boolean arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, class140[] arg6, class512 arg7, String arg8) {
        int var10 = arg5 - this.field924.field8785;
        field936++;
        int var11 = -1;
        int var12 = -1;
        int var13 = arg8.length();
        if (!arg0) {
            this.field934 = null;
        }
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class545.method3141(120, arg8.charAt(var14)) & 0xFF);
            if (var15 == '<') {
                var11 = var14;
            } else {
                if (var15 == '>' && var11 != -1) {
                    String var16 = arg8.substring(var11 + 1, var14);
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
                                    int var17 = class469.method2750((byte) 46, var16.substring(4));
                                    class140 var18 = arg6[var17];
                                    int var19 = arg2 == null ? var18.method340() : arg2[var17];
                                    if ((class712.field9724 & 0xFF000000) == -16777216) {
                                        var18.method358(arg4, this.field924.field8785 + var10 - var19, 1, 0, 1);
                                    } else {
                                        var18.method358(arg4, var10 - (var19 - this.field924.field8785), 0, class712.field9724 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    var12 = -1;
                                    arg4 += arg6[var17].method343();
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method573((byte) 116, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg4 += this.field924.method3625(-118, var15, var12);
                    }
                    if (var15 == ' ') {
                        if (class583.field7925 > 0) {
                            class184.field2422 += class583.field7925;
                            arg4 += class184.field2422 >> 8;
                            class184.field2422 &= 0xFF;
                        }
                    } else if (arg7 == null) {
                        if ((class749.field10092 & 0xFF000000) != 0) {
                            this.method104(var15, arg4 + 1, var10 + 1, class749.field10092, true);
                        }
                        this.method104(var15, arg4, var10, class712.field9724, false);
                    } else {
                        if ((class749.field10092 & 0xFF000000) != 0) {
                            this.method107(var15, arg4 + 1, var10 + 1, class749.field10092, true, arg7, arg3, arg1);
                        }
                        this.method107(var15, arg4, var10, class712.field9724, false, arg7, arg3, arg1);
                    }
                    int var20 = this.field924.method3623((byte) -117, var15);
                    if (class216.field2832 != -1) {
                        this.field934.method544(arg4, var20, (int) ((double) this.field924.field8785 * 0.7D) + var10, class216.field2832, (byte) 127);
                    }
                    if (class640.field8625 != -1) {
                        this.field934.method544(arg4, var20, this.field924.field8785 + var10 + 1, class640.field8625, (byte) 127);
                    }
                    arg4 += var20;
                    var12 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([Lhh;Ljava/lang/String;I[IIB[I[I)V")
    private final void method565(class140[] arg0, String arg1, int arg2, int[] arg3, int arg4, byte arg5, int[] arg6, int[] arg7) {
        int var9 = arg2 - this.field924.field8785;
        field926++;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg1.length();
        if (arg5 != 70) {
            return;
        }
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class545.method3141(arg5 ^ 0x30, arg1.charAt(var14)) & 0xFF);
            if (var15 == '<') {
                var10 = var14;
            } else {
                if (var15 == '>' && var10 != -1) {
                    String var16 = arg1.substring(var10 + 1, var14);
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
                                    int var19 = class469.method2750((byte) 49, var16.substring(4));
                                    class140 var20 = arg0[var19];
                                    int var21 = arg7 == null ? var20.method340() : arg7[var19];
                                    var20.method358(arg4 + var17, this.field924.field8785 + var9 - var21 - -var18, 1, 0, 1);
                                    arg4 += arg0[var19].method343();
                                    var11 = -1;
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method573((byte) -22, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg4 += this.field924.method3625(arg5 ^ 0x7F, var15, var11);
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
                        if ((class749.field10092 & 0xFF000000) != 0) {
                            this.method104(var15, arg4 + var22 + 1, var9 + var23 - -1, class749.field10092, true);
                        }
                        this.method104(var15, arg4 + var22, var9 + var23, class712.field9724, false);
                    } else if (class583.field7925 > 0) {
                        class184.field2422 += class583.field7925;
                        arg4 += class184.field2422 >> 8;
                        class184.field2422 &= 0xFF;
                    }
                    var12++;
                    int var24 = this.field924.method3623((byte) -103, var15);
                    if (class216.field2832 != -1) {
                        this.field934.method544(arg4, var24, (int) ((double) this.field924.field8785 * 0.7D) + var9, class216.field2832, (byte) 127);
                    }
                    if (class640.field8625 != -1) {
                        this.field934.method544(arg4, var24, this.field924.field8785 + var9, class640.field8625, (byte) 126);
                    }
                    var11 = var15;
                    arg4 += var24;
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(III)V")
    private final void method566(int arg0, int arg1, int arg2) {
        class184.field2422 = 0;
        class216.field2832 = -1;
        class640.field8625 = -1;
        int var4 = -94 / ((arg0 - 7) / 58);
        field923++;
        class583.field7925 = 0;
        class126.field1731 = arg1;
        class712.field9724 = arg1;
        if (arg2 == -1) {
            arg2 = 0;
        }
        class568.field7754 = arg2;
        class749.field10092 = arg2;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;)V")
    private final void method567(int arg0, int arg1, String arg2) {
        field939++;
        int var4 = 0;
        boolean var5 = false;
        int var6 = -109 % ((arg0 - 81) / 32);
        for (int var7 = 0; var7 < arg2.length(); var7++) {
            char var8 = arg2.charAt(var7);
            if (var8 == '<') {
                var5 = true;
            } else if (var8 == '>') {
                var5 = false;
            } else if (!var5 && var8 == ' ') {
                var4++;
            }
        }
        if (var4 > 0) {
            class583.field7925 = (arg1 - this.field924.method3619((byte) -69, arg2) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!da", name = "fa", descriptor = "(CIIIZ)V")
    public abstract void method104(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIILjava/lang/String;IZ)V")
    public final void method568(int arg0, int arg1, int arg2, String arg3, int arg4, boolean arg5) {
        field921++;
        if (arg3 != null) {
            this.method566(-86, arg0, arg4);
            this.method564(arg5, 0, null, 0, arg1, arg2, null, null, arg3);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IC)Z")
    public static final boolean method569(int arg0, char arg1) {
        field919++;
        if (arg1 >= ' ' && arg1 <= '~') {
            return true;
        } else if (arg1 >= ' ' && arg1 <= 'ÿ') {
            return true;
        } else if (arg1 == '€' || arg1 == 'Œ' || arg1 == '—' || arg1 == 'œ' || arg1 == 'Ÿ') {
            return true;
        } else if (arg0 == -127) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIILjava/lang/String;I[IIIIII[Lhh;IIILaa;)I")
    public final int method570(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5, int[] arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class140[] arg12, int arg13, int arg14, int arg15, class512 arg16) {
        field925++;
        if (arg4 == null) {
            return 0;
        }
        this.method566(arg2 - 66, arg10, arg0);
        if (arg9 == 0) {
            arg9 = this.field924.field8785;
        }
        int[] var18;
        if (arg7 < (this.field924.field8769 + arg9 + this.field924.field8782) && arg7 < arg9 + arg9) {
            var18 = null;
        } else {
            var18 = new int[] { arg1 };
        }
        int var19 = this.field924.method3621(arg12, var18, class706.field9661, arg4, (byte) 87);
        if (arg11 == -1) {
            arg11 = arg7 / arg9;
            if (arg11 <= 0) {
                arg11 = 1;
            }
        }
        if (arg2 > ~arg11 && var19 >= arg11) {
            var19 = arg11;
            class706.field9661[arg11 - 1] = this.field924.method3617(32, arg12, arg1, class706.field9661[arg11 - 1]);
        }
        if (arg13 == 3 && var19 == 1) {
            arg13 = 1;
        }
        int var20;
        if (arg13 == 0) {
            var20 = arg8 + this.field924.field8769;
        } else if (arg13 == 1) {
            var20 = arg8 + this.field924.field8769 + ((-((var19 - 1) * arg9) + -this.field924.field8782 + -this.field924.field8769 + arg7) / 2);
        } else if (arg13 == 2) {
            var20 = arg8 + arg7 - ((var19 - 1) * arg9) - this.field924.field8782;
        } else {
            int var21 = (arg7 - ((var19 - 1) * arg9) - this.field924.field8782 - this.field924.field8769) / (var19 + 1);
            if (var21 < 0) {
                var21 = 0;
            }
            var20 = this.field924.field8769 + var21 + arg8;
            arg9 += var21;
        }
        for (int var22 = 0; var22 < var19; var22++) {
            if (arg14 == 0) {
                this.method564(true, arg15, arg6, arg5, arg3, var20, arg12, arg16, class706.field9661[var22]);
            } else if (arg14 == 1) {
                this.method564(true, arg15, arg6, arg5, arg3 + ((arg1 - this.field924.method3619((byte) -69, class706.field9661[var22])) / 2), var20, arg12, arg16, class706.field9661[var22]);
            } else if (arg14 == 2) {
                this.method564(true, arg15, arg6, arg5, arg1 + arg3 - this.field924.method3619((byte) -69, class706.field9661[var22]), var20, arg12, arg16, class706.field9661[var22]);
            } else if ((var19 - 1) == var22) {
                this.method564(true, arg15, arg6, arg5, arg3, var20, arg12, arg16, class706.field9661[var22]);
            } else {
                this.method567(117, arg1, class706.field9661[var22]);
                this.method564(true, arg15, arg6, arg5, arg3, var20, arg12, arg16, class706.field9661[var22]);
                class583.field7925 = 0;
            }
            var20 += arg9;
        }
        return var19;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIIILjava/lang/String;)V")
    public final void method571(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, String arg7) {
        field922++;
        if (arg7 == null) {
            return;
        }
        this.method566(arg4 ^ 0x44, arg0, arg5);
        double var9 = 7.0D - (double) arg1 / 8.0D;
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg7.length();
        int[] var12 = new int[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (var9 * Math.sin((double) var13 / 1.5D + (double) arg3));
        }
        this.method565(null, arg7, arg6, var12, arg2 - (this.field924.method3619((byte) -69, arg7) / arg4), (byte) 70, null, null);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIILjava/lang/String;III)V")
    public final void method572(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6) {
        field938++;
        if (arg3 == null) {
            return;
        }
        this.method566(72, arg5, arg4);
        int var8 = arg3.length();
        int[] var9 = new int[var8];
        for (int var10 = 0; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg2 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method565(null, arg3, arg6, var9, arg1 - this.field924.method3619((byte) -69, arg3) / 2, (byte) 70, null, null);
        if (arg0 < 90) {
            this.method566(53, 36, -69);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BLjava/lang/String;)V")
    private final void method573(byte arg0, String arg1) {
        field928++;
        try {
            if (arg1.startsWith("col=")) {
                class712.field9724 = class712.field9724 & 0xFF000000 | class638.method3514(arg1.substring(4), 16, (byte) 119) & 0xFFFFFF;
            } else if (arg1.equals("/col")) {
                class712.field9724 = class126.field1731 & 0xFFFFFF | class712.field9724 & 0xFF000000;
            }
            if (arg1.startsWith("argb=")) {
                class712.field9724 = class638.method3514(arg1.substring(5), 16, (byte) 89);
            } else if (arg1.equals("/argb")) {
                class712.field9724 = class126.field1731;
            } else if (arg1.startsWith("str=")) {
                class216.field2832 = class712.field9724 & 0xFF000000 | class638.method3514(arg1.substring(4), 16, (byte) -114);
            } else if (arg1.equals("str")) {
                class216.field2832 = class712.field9724 & 0xFF000000 | 0x800000;
            } else if (arg1.equals("/str")) {
                class216.field2832 = -1;
            } else if (arg1.startsWith("u=")) {
                class640.field8625 = class712.field9724 & 0xFF000000 | class638.method3514(arg1.substring(2), 16, (byte) -90);
            } else if (arg1.equals("u")) {
                class640.field8625 = class712.field9724 & 0xFF000000;
            } else if (arg1.equals("/u")) {
                class640.field8625 = -1;
            } else if (arg1.equalsIgnoreCase("shad=-1")) {
                class749.field10092 = 0;
            } else if (arg1.startsWith("shad=")) {
                class749.field10092 = class712.field9724 & 0xFF000000 | class638.method3514(arg1.substring(5), 16, (byte) 125);
            } else if (arg1.equals("shad")) {
                class749.field10092 = class712.field9724 & 0xFF000000;
            } else if (arg1.equals("/shad")) {
                class749.field10092 = class568.field7754;
            } else if (arg1.equals("br")) {
                this.method566(97, class126.field1731, class568.field7754);
            }
        } catch (Exception var4) {
        }
        int var3 = -46 % ((arg0 - 32) / 52);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
    public static void method574(int arg0) {
        if (arg0 == -17319) {
            field935 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lha;Leb;)V")
    public class67(class66 arg0, class651 arg1) {
        this.field924 = arg1;
        this.field934 = arg0;
    }
}
