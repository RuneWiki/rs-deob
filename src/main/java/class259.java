import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public abstract class class259 {

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "Lqa;")
    private class167 field3761;

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "Lrl;")
    private class633 field3772;

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "I")
    public static int field3775 = 0;

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "Liu;")
    public static class517 field3774 = new class517(100, 8);

    @OriginalMember(owner = "client!ra", name = "u", descriptor = "Lbv;")
    public static class567 field3777 = new class567(" from your friends list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
    public static int field3760;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
    public static int field3763;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "I")
    public static int field3765;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "I")
    public static int field3770;

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "I")
    public static int field3771;

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIILjava/lang/String;II)V")
    public final void method1632(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5) {
        field3769++;
        if (arg3 != null && arg1 < -95) {
            this.method1648(arg4, arg5, -11352);
            this.method1638(0, arg3, false, null, null, arg0, 0, arg2 - this.field3772.method3651(-10408, arg3), null);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIILjava/lang/String;II)V")
    public final void method1633(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5, int arg6) {
        field3767++;
        if (arg4 == null) {
            return;
        }
        this.method1648(arg1, arg2, -11352);
        int var8 = arg4.length();
        if (arg0 != 19047) {
            this.method1635(null, -9, 20, -98, 21, -64);
        }
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg6 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg6 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method1647(null, var9, var10, arg0 - 18988, -(this.field3772.method3651(-10408, arg4) / 2) + arg5, arg3, null, arg4);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/lang/String;IIILjava/util/Random;IZ[Lha;I[I)I")
    public final int method1634(String arg0, int arg1, int arg2, int arg3, Random arg4, int arg5, boolean arg6, class116[] arg7, int arg8, int[] arg9) {
        field3759++;
        if (arg0 == null) {
            return 0;
        }
        arg4.setSeed((long) arg2);
        int var11 = (arg4.nextInt() & 0x1F) + 192;
        this.method1648(var11 << 24 | arg3 & 0xFFFFFF, arg8 & 0xFFFFFF | var11 << 24, -11352);
        int var12 = arg0.length();
        int[] var13 = new int[var12];
        int var14 = 0;
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg4.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        this.method1647(arg7, var13, null, -103, arg5, arg1, arg9, arg0);
        if (arg6) {
            this.method807('\'', -120, -17, -41, true);
        }
        return var14;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
    public final void method1635(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3762++;
        if (arg0 == null) {
            return;
        }
        this.method1648(arg5, arg2, -11352);
        this.method1638(0, arg0, false, null, null, arg4, 0, arg1 - (this.field3772.method3651(-10408, arg0) / 2), null);
        if (arg3 != 16777215) {
            field3774 = null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Z)V")
    public static void method1636(boolean arg0) {
        field3774 = null;
        field3777 = null;
        if (!arg0) {
            field3775 = -41;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([Lha;[ILjava/lang/String;BIIII)V")
    public final void method1637(class116[] arg0, int[] arg1, String arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg3 < 114) {
            this.field3772 = null;
        }
        field3768++;
        if (arg2 != null) {
            this.method1648(arg4, arg5, -11352);
            this.method1638(0, arg2, false, arg0, arg1, arg7, 0, arg6, null);
        }
    }

    @OriginalMember(owner = "client!ra", name = "HA", descriptor = "(CIIIZ)V")
    public abstract void method807(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILjava/lang/String;Z[Lha;[IIIILpa;)V")
    private final void method1638(int arg0, String arg1, boolean arg2, class116[] arg3, int[] arg4, int arg5, int arg6, int arg7, class593 arg8) {
        field3758++;
        int var10 = arg5 - this.field3772.field9196;
        int var11 = -1;
        int var12 = -1;
        int var13 = arg1.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class365.method2205(arg1.charAt(var14), 79) & 0xFF);
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
                                    int var17 = class302.method1889(var16.substring(4), false);
                                    class116 var18 = arg3[var17];
                                    int var19 = arg4 == null ? var18.method960() : arg4[var17];
                                    if ((class102.field1741 & 0xFF000000) == -16777216) {
                                        var18.method668(arg7, this.field3772.field9196 + var10 - var19, 1, 0, 1);
                                    } else {
                                        var18.method668(arg7, var10 + this.field3772.field9196 - var19, 0, class102.field1741 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    var12 = -1;
                                    arg7 += arg3[var17].method955();
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method1640(var16, (byte) -121);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg7 += this.field3772.method3662(var15, var12, 2);
                    }
                    if (var15 == ' ') {
                        if (class493.field6925 > 0) {
                            class417.field6144 += class493.field6925;
                            arg7 += class417.field6144 >> 8;
                            class417.field6144 &= 0xFF;
                        }
                    } else if (arg8 == null) {
                        if ((class102.field1745 & 0xFF000000) != 0) {
                            this.method807(var15, arg7 + 1, var10 + 1, class102.field1745, true);
                        }
                        this.method807(var15, arg7, var10, class102.field1741, false);
                    } else {
                        if ((class102.field1745 & 0xFF000000) != 0) {
                            this.method808(var15, arg7 + 1, var10 + 1, class102.field1745, true, arg8, arg6, arg0);
                        }
                        this.method808(var15, arg7, var10, class102.field1741, false, arg8, arg6, arg0);
                    }
                    int var20 = this.field3772.method3659(var15, (byte) 24);
                    if (class421.field6191 != -1) {
                        this.field3761.method1160(var20, var10 + ((int) ((double) this.field3772.field9196 * 0.7D)), arg7, -3, class421.field6191);
                    }
                    if (class474.field6791 != -1) {
                        this.field3761.method1160(var20, var10 + this.field3772.field9196 + 1, arg7, -3, class474.field6791);
                    }
                    arg7 += var20;
                    var12 = var15;
                }
            }
        }
        if (arg2) {
            this.field3761 = null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILpa;IIIIIIII[Lha;II[IILjava/lang/String;)I")
    public final int method1639(int arg0, class593 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class116[] arg10, int arg11, int arg12, int[] arg13, int arg14, String arg15) {
        if (arg0 == 0) {
            field3773++;
            return this.method1646(arg11, arg3, (byte) -71, arg15, arg2, arg13, arg10, arg8, arg9, arg14, arg12, arg7, 0, arg5, arg4, arg6, arg1);
        } else {
            return -53;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/lang/String;B)V")
    private final void method1640(String arg0, byte arg1) {
        field3765++;
        try {
            int var3 = -31 / ((arg1 - 55) / 35);
            if (arg0.startsWith("col=")) {
                class102.field1741 = class102.field1741 & 0xFF000000 | class182.method1225((byte) 94, arg0.substring(4), 16) & 0xFFFFFF;
            } else if (arg0.equals("/col")) {
                class102.field1741 = class504.field7044 & 0xFFFFFF | class102.field1741 & 0xFF000000;
            }
            if (arg0.startsWith("argb=")) {
                class102.field1741 = class182.method1225((byte) 123, arg0.substring(5), 16);
            } else if (arg0.equals("/argb")) {
                class102.field1741 = class504.field7044;
            } else if (arg0.startsWith("str=")) {
                class421.field6191 = class102.field1741 & 0xFF000000 | class182.method1225((byte) 120, arg0.substring(4), 16);
            } else if (arg0.equals("str")) {
                class421.field6191 = class102.field1741 & 0xFF000000 | 0x800000;
            } else if (arg0.equals("/str")) {
                class421.field6191 = -1;
            } else if (arg0.startsWith("u=")) {
                class474.field6791 = class102.field1741 & 0xFF000000 | class182.method1225((byte) 107, arg0.substring(2), 16);
            } else if (arg0.equals("u")) {
                class474.field6791 = class102.field1741 & 0xFF000000;
            } else if (arg0.equals("/u")) {
                class474.field6791 = -1;
            } else if (arg0.equalsIgnoreCase("shad=-1")) {
                class102.field1745 = 0;
            } else if (arg0.startsWith("shad=")) {
                class102.field1745 = class102.field1741 & 0xFF000000 | class182.method1225((byte) 78, arg0.substring(5), 16);
            } else if (arg0.equals("shad")) {
                class102.field1745 = class102.field1741 & 0xFF000000;
            } else if (arg0.equals("/shad")) {
                class102.field1745 = class248.field3613;
                return;
            } else if (arg0.equals("br")) {
                this.method1648(class504.field7044, class248.field3613, -11352);
                return;
            }
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IILjava/lang/String;)V")
    private final void method1641(int arg0, int arg1, String arg2) {
        field3757++;
        int var4 = 0;
        boolean var5 = false;
        if (arg1 != 2) {
            return;
        }
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
        if (var4 > 0) {
            class493.field6925 = (arg0 - this.field3772.method3651(-10408, arg2) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IBIILjava/lang/String;I)V")
    public final void method1642(int arg0, byte arg1, int arg2, int arg3, String arg4, int arg5) {
        int var7 = 97 % ((arg1 - 42) / 35);
        field3766++;
        if (arg4 != null) {
            this.method1648(arg5, arg0, -11352);
            this.method1638(0, arg4, false, null, null, arg3, 0, arg2, null);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BIILjava/lang/String;III)V")
    public final void method1643(byte arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6) {
        field3771++;
        if (arg3 == null) {
            return;
        }
        this.method1648(arg1, arg4, -11352);
        int var8 = arg3.length();
        if (arg0 <= 6) {
            return;
        }
        int[] var9 = new int[var8];
        for (int var10 = 0; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg2 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method1647(null, null, var9, 61, arg5 - (this.field3772.method3651(-10408, arg3) / 2), arg6, null, arg3);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIZIIILjava/lang/String;)V")
    public final void method1644(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, String arg7) {
        field3760++;
        if (arg7 == null) {
            return;
        }
        this.method1648(arg5, arg4, -11352);
        if (arg3) {
            this.method1642(-8, (byte) 21, -55, 18, null, -58);
        }
        double var9 = 7.0D - ((double) arg1 / 8.0D);
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg7.length();
        int[] var12 = new int[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (Math.sin((double) var13 / 1.5D + (double) arg0) * var9);
        }
        this.method1647(null, null, var12, -79, arg6 - (this.field3772.method3651(-10408, arg7) / 2), arg2, null, arg7);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([Lha;IBLjava/util/Random;IILjava/lang/String;III[IIII[I)I")
    public final int method1645(class116[] arg0, int arg1, byte arg2, Random arg3, int arg4, int arg5, String arg6, int arg7, int arg8, int arg9, int[] arg10, int arg11, int arg12, int arg13, int[] arg14) {
        int var16 = 11 % ((-arg2 - 57) / 63);
        field3776++;
        if (arg6 == null) {
            return 0;
        }
        arg3.setSeed((long) arg12);
        int var17 = (arg3.nextInt() & 0x1F) + 192;
        this.method1648(var17 << 24 | arg4 & 0xFFFFFF, arg8 & 0xFFFFFF | var17 << 24, -11352);
        int var18 = arg6.length();
        int[] var19 = new int[var18];
        int var20 = 0;
        for (int var21 = 0; var21 < var18; var21++) {
            var19[var21] = var20;
            if ((arg3.nextInt() & 0x3) == 0) {
                var20++;
            }
        }
        int var22 = arg11;
        int var23 = arg9 + this.field3772.field9193;
        if (arg5 == 1) {
            var23 += (arg7 - this.field3772.field9193 - this.field3772.field9192) / 2;
        } else if (arg5 == 2) {
            var23 = arg7 + arg9 - this.field3772.field9192;
        }
        int var24 = -1;
        if (arg13 == 1) {
            var24 = this.field3772.method3651(-10408, arg6) + var20;
            var22 = (arg1 - var24) / 2 + arg11;
        } else if (arg13 == 2) {
            var24 = this.field3772.method3651(-10408, arg6) + var20;
            var22 = arg1 + arg11 - var24;
        }
        this.method1647(arg0, var19, null, 110, var22, var23, arg14, arg6);
        if (arg10 != null) {
            if (var24 == -1) {
                var24 = this.field3772.method3651(-10408, arg6) + var20;
            }
            arg10[1] = var23 - this.field3772.field9193;
            arg10[0] = var22;
            arg10[3] = this.field3772.field9193 + this.field3772.field9192;
            arg10[2] = var24;
        }
        return var20;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIBLjava/lang/String;I[I[Lha;IIIIIIIIILpa;)I")
    public final int method1646(int arg0, int arg1, byte arg2, String arg3, int arg4, int[] arg5, class116[] arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, class593 arg16) {
        field3764++;
        if (arg3 == null) {
            return 0;
        }
        this.method1648(arg14, arg1, -11352);
        if (arg4 == 0) {
            arg4 = this.field3772.field9196;
        }
        int[] var18;
        if (arg8 < this.field3772.field9193 + arg4 + this.field3772.field9192 && arg8 < arg4 + arg4) {
            var18 = null;
        } else {
            var18 = new int[] { arg15 };
        }
        if (arg2 != -71) {
            this.method1633(60, 100, -83, 37, null, -91, -93);
        }
        int var19 = this.field3772.method3660(arg3, 4, arg6, var18, class242.field3513);
        if (arg12 == -1) {
            arg12 = arg8 / arg4;
            if (arg12 <= 0) {
                arg12 = 1;
            }
        }
        if (arg12 > 0 && arg12 <= var19) {
            var19 = arg12;
            class242.field3513[arg12 - 1] = this.field3772.method3655(class242.field3513[arg12 - 1], arg15, (byte) -69, arg6);
        }
        if (arg7 == 3 && var19 == 1) {
            arg7 = 1;
        }
        int var20;
        if (arg7 == 0) {
            var20 = this.field3772.field9193 + arg10;
        } else if (arg7 == 1) {
            var20 = (arg8 - this.field3772.field9193 - this.field3772.field9192 - ((var19 + -1) * arg4)) / 2 + arg10 + this.field3772.field9193;
        } else if (arg7 == 2) {
            var20 = arg8 + arg10 - this.field3772.field9192 - ((var19 - 1) * arg4);
        } else {
            int var21 = (arg8 - (this.field3772.field9193 + this.field3772.field9192) - ((var19 + -1) * arg4)) / (var19 + 1);
            if (var21 < 0) {
                var21 = 0;
            }
            var20 = this.field3772.field9193 + arg10 + var21;
            arg4 += var21;
        }
        for (int var22 = 0; var22 < var19; var22++) {
            if (arg13 == 0) {
                this.method1638(arg0, class242.field3513[var22], false, arg6, arg5, var20, arg9, arg11, arg16);
            } else if (arg13 == 1) {
                this.method1638(arg0, class242.field3513[var22], false, arg6, arg5, var20, arg9, (arg15 - this.field3772.method3651(arg2 - 10337, class242.field3513[var22])) / 2 + arg11, arg16);
            } else if (arg13 == 2) {
                this.method1638(arg0, class242.field3513[var22], false, arg6, arg5, var20, arg9, arg11 - (this.field3772.method3651(-10408, class242.field3513[var22]) - arg15), arg16);
            } else if ((var19 - 1) == var22) {
                this.method1638(arg0, class242.field3513[var22], false, arg6, arg5, var20, arg9, arg11, arg16);
            } else {
                this.method1641(arg15, 2, class242.field3513[var22]);
                this.method1638(arg0, class242.field3513[var22], false, arg6, arg5, var20, arg9, arg11, arg16);
                class493.field6925 = 0;
            }
            var20 += arg4;
        }
        return var19;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([Lha;[I[IIII[ILjava/lang/String;)V")
    private final void method1647(class116[] arg0, int[] arg1, int[] arg2, int arg3, int arg4, int arg5, int[] arg6, String arg7) {
        field3770++;
        int var9 = arg5 - this.field3772.field9196;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = -89 / ((-arg3 - 29) / 34);
        int var14 = arg7.length();
        for (int var15 = 0; var15 < var14; var15++) {
            char var16 = (char) (class365.method2205(arg7.charAt(var15), 106) & 0xFF);
            if (var16 == '<') {
                var10 = var15;
            } else {
                if (var16 == '>' && var10 != -1) {
                    String var17 = arg7.substring(var10 + 1, var15);
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
                                    if (arg1 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg1[var12];
                                    }
                                    int var19;
                                    if (arg2 == null) {
                                        var19 = 0;
                                    } else {
                                        var19 = arg2[var12];
                                    }
                                    var12++;
                                    int var20 = class302.method1889(var17.substring(4), false);
                                    class116 var21 = arg0[var20];
                                    int var22 = arg6 == null ? var21.method960() : arg6[var20];
                                    var21.method668(arg4 + var18, -var22 + this.field3772.field9196 + var19 + var9, 1, 0, 1);
                                    var11 = -1;
                                    arg4 += arg0[var20].method955();
                                } catch (Exception var26) {
                                }
                            } else {
                                this.method1640(var17, (byte) -109);
                            }
                            continue;
                        }
                        var16 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg4 += this.field3772.method3662(var16, var11, 2);
                    }
                    int var23;
                    if (arg1 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg1[var12];
                    }
                    int var24;
                    if (arg2 == null) {
                        var24 = 0;
                    } else {
                        var24 = arg2[var12];
                    }
                    if (var16 != ' ') {
                        if ((class102.field1745 & 0xFF000000) != 0) {
                            this.method807(var16, arg4 - (-var23 - 1), var9 + 1 + var24, class102.field1745, true);
                        }
                        this.method807(var16, arg4 + var23, var9 - -var24, class102.field1741, false);
                    } else if (class493.field6925 > 0) {
                        class417.field6144 += class493.field6925;
                        arg4 += class417.field6144 >> 8;
                        class417.field6144 &= 0xFF;
                    }
                    var12++;
                    int var25 = this.field3772.method3659(var16, (byte) 24);
                    if (class421.field6191 != -1) {
                        this.field3761.method1160(var25, var9 + ((int) ((double) this.field3772.field9196 * 0.7D)), arg4, -3, class421.field6191);
                    }
                    if (class474.field6791 != -1) {
                        this.field3761.method1160(var25, this.field3772.field9196 + var9, arg4, -3, class474.field6791);
                    }
                    var11 = var16;
                    arg4 += var25;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(III)V")
    private final void method1648(int arg0, int arg1, int arg2) {
        if (arg2 != -11352) {
            return;
        }
        if (arg1 == -1) {
            arg1 = 0;
        }
        class474.field6791 = -1;
        class421.field6191 = -1;
        field3763++;
        class504.field7044 = arg0;
        class102.field1741 = arg0;
        class493.field6925 = 0;
        class417.field6144 = 0;
        class248.field3613 = arg1;
        class102.field1745 = arg1;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(CIIIZLpa;II)V")
    public abstract void method808(char arg0, int arg1, int arg2, int arg3, boolean arg4, class593 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lqa;Lrl;)V")
    public class259(class167 arg0, class633 arg1) {
        this.field3761 = arg0;
        this.field3772 = arg1;
    }
}
