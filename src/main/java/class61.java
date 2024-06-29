import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public abstract class class61 {

    @OriginalMember(owner = "client!da", name = "v", descriptor = "Lhia;")
    private class66 field884;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "Lha;")
    private class60 field877;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "Lsca;")
    public static class46 field871 = null;

    @OriginalMember(owner = "client!da", name = "s", descriptor = "I")
    public static int field881 = 4;

    @OriginalMember(owner = "client!da", name = "r", descriptor = "I")
    public static int field880 = 52;

    @OriginalMember(owner = "client!da", name = "u", descriptor = "Lqg;")
    public static class464 field883 = new class464("game3", 2);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!da", name = "t", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!da", name = "w", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I[Lpga;Laa;IIIIIIIII[IIIILjava/lang/String;)I", line = 8)
    public final int method541(int arg0, class536[] arg1, class488 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int[] arg12, int arg13, int arg14, int arg15, String arg16) {
        field872++;
        if (arg5 != -2) {
            this.method543(28, -120, false, -127, null, 91, 21);
        }
        if (arg16 == null) {
            return 0;
        }
        this.method553(0, arg11, arg14);
        if (arg4 == 0) {
            arg4 = this.field884.field945;
        }
        int[] var18;
        if ((this.field884.field940 + this.field884.field938 + arg4) > arg0 && arg0 < (arg4 + arg4)) {
            var18 = null;
        } else {
            var18 = new int[] { arg15 };
        }
        int var19 = this.field884.method584(class604.field8548, var18, arg16, (byte) 85, arg1);
        if (arg6 == -1) {
            arg6 = arg0 / arg4;
            if (arg6 <= 0) {
                arg6 = 1;
            }
        }
        if (arg6 > 0 && var19 >= arg6) {
            class604.field8548[arg6 - 1] = this.field884.method581(true, arg15, arg1, class604.field8548[arg6 - 1]);
            var19 = arg6;
        }
        if (arg7 == 3 && var19 == 1) {
            arg7 = 1;
        }
        int var20;
        if (arg7 == 0) {
            var20 = this.field884.field940 + arg3;
        } else if (arg7 == 1) {
            var20 = this.field884.field940 + arg3 + ((arg0 - this.field884.field940 + -((var19 + -1) * arg4) + -this.field884.field938) / 2);
        } else if (arg7 == 2) {
            var20 = arg0 + arg3 - this.field884.field938 - (var19 + -1) * arg4;
        } else {
            int var21 = (arg0 - this.field884.field940 - this.field884.field938 - ((var19 + -1) * arg4)) / (var19 + 1);
            if (var21 < 0) {
                var21 = 0;
            }
            arg4 += var21;
            var20 = this.field884.field940 + arg3 + var21;
        }
        for (int var22 = 0; var22 < var19; var22++) {
            if (arg9 == 0) {
                this.method542(arg10, arg8, arg1, arg12, class604.field8548[var22], var20, arg2, arg13, -114);
            } else if (arg9 == 1) {
                this.method542(arg10, arg8, arg1, arg12, class604.field8548[var22], var20, arg2, arg13 + (arg15 - this.field884.method587(100, class604.field8548[var22])) / 2, 105);
            } else if (arg9 == 2) {
                this.method542(arg10, arg8, arg1, arg12, class604.field8548[var22], var20, arg2, arg15 + (arg13 - this.field884.method587(-39, class604.field8548[var22])), arg5 + 26);
            } else if (var19 - 1 == var22) {
                this.method542(arg10, arg8, arg1, arg12, class604.field8548[var22], var20, arg2, arg13, 107);
            } else {
                this.method554((byte) 40, arg15, class604.field8548[var22]);
                this.method542(arg10, arg8, arg1, arg12, class604.field8548[var22], var20, arg2, arg13, arg5 ^ 0xFFFFFFCF);
                class437.field6480 = 0;
            }
            var20 += arg4;
        }
        return var19;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II[Lpga;[ILjava/lang/String;ILaa;II)V", line = 109)
    private final void method542(int arg0, int arg1, class536[] arg2, int[] arg3, String arg4, int arg5, class488 arg6, int arg7, int arg8) {
        field868++;
        int var10 = -10 % ((-arg8 - 51) / 51);
        int var11 = arg5 - this.field884.field945;
        int var12 = -1;
        int var13 = -1;
        int var14 = arg4.length();
        for (int var15 = 0; var15 < var14; var15++) {
            char var16 = (char) (class631.method3639(arg4.charAt(var15), (byte) -31) & 0xFF);
            if (var16 == '<') {
                var12 = var15;
            } else {
                if (var16 == '>' && var12 != -1) {
                    String var17 = arg4.substring(var12 + 1, var15);
                    var12 = -1;
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
                                    int var18 = class763.method4236((byte) 37, var17.substring(4));
                                    class536 var19 = arg2[var18];
                                    int var20 = arg3 == null ? var19.method1514() : arg3[var18];
                                    if ((class588.field8344 & 0xFF000000) == -16777216) {
                                        var19.method133(arg7, this.field884.field945 + var11 - var20, 1, 0, 1);
                                    } else {
                                        var19.method133(arg7, var11 + this.field884.field945 - var20, 0, class588.field8344 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    arg7 += arg2[var18].method1504();
                                    var13 = -1;
                                } catch (Exception var22) {
                                }
                            } else {
                                this.method552(var17, -26486);
                            }
                            continue;
                        }
                        var16 = '®';
                    }
                }
                if (var12 == -1) {
                    if (var13 != -1) {
                        arg7 += this.field884.method586((byte) 36, var13, var16);
                    }
                    if (var16 == ' ') {
                        if (class437.field6480 > 0) {
                            class238.field3462 += class437.field6480;
                            arg7 += class238.field3462 >> 8;
                            class238.field3462 &= 0xFF;
                        }
                    } else if (arg6 == null) {
                        if ((class596.field8443 & 0xFF000000) != 0) {
                            this.method23(var16, arg7 + 1, var11 - -1, class596.field8443, true);
                        }
                        this.method23(var16, arg7, var11, class588.field8344, false);
                    } else {
                        if ((class596.field8443 & 0xFF000000) != 0) {
                            this.method22(var16, arg7 + 1, var11 + 1, class596.field8443, true, arg6, arg0, arg1);
                        }
                        this.method22(var16, arg7, var11, class588.field8344, false, arg6, arg0, arg1);
                    }
                    int var21 = this.field884.method588(var16, 255);
                    if (class434.field6459 != -1) {
                        this.field877.method448((int) ((double) this.field884.field945 * 0.7D) + var11, var21, (byte) -75, class434.field6459, arg7);
                    }
                    if (class75.field1049 != -1) {
                        this.field877.method448(var11 - (-this.field884.field945 - 1), var21, (byte) 126, class75.field1049, arg7);
                    }
                    arg7 += var21;
                    var13 = var16;
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIZILjava/lang/String;II)V", line = 261)
    public final void method543(int arg0, int arg1, boolean arg2, int arg3, String arg4, int arg5, int arg6) {
        field875++;
        if (arg4 == null) {
            return;
        }
        this.method553(0, arg6, arg5);
        int var8 = arg4.length();
        if (!arg2) {
            this.field884 = null;
        }
        int[] var9 = new int[var8];
        for (int var10 = 0; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg1 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method550(null, false, null, null, arg3, arg4, var9, arg0 - this.field884.method587(-66, arg4) / 2);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;IBII)V", line = 289)
    public final void method544(int arg0, String arg1, int arg2, byte arg3, int arg4, int arg5) {
        field874++;
        if (arg1 != null) {
            int var7 = 107 % ((15 - arg3) / 57);
            this.method553(0, arg5, arg2);
            this.method542(0, 0, null, null, arg1, arg4, null, arg0 - (this.field884.method587(-82, arg1) / 2), 73);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;IIIB)V", line = 305)
    public final void method545(int arg0, String arg1, int arg2, int arg3, int arg4, byte arg5) {
        field864++;
        if (arg1 == null) {
            return;
        }
        this.method553(0, arg3, arg2);
        this.method542(0, 0, null, null, arg1, arg4, null, arg0 - this.field884.method587(-42, arg1), 120);
        if (arg5 <= 113) {
            method548(-96, -90, 67, 36, -43, (byte) -72, -79);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZIILjava/lang/String;II)V", line = 321)
    public final void method546(boolean arg0, int arg1, int arg2, String arg3, int arg4, int arg5) {
        if (arg0) {
            this.field877 = null;
        }
        field865++;
        if (arg3 != null) {
            this.method553(0, arg5, arg1);
            this.method542(0, 0, null, null, arg3, arg4, null, arg2, -125);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;IIII[Lpga;I[ILjava/util/Random;III[I)I", line = 338)
    public final int method547(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5, int arg6, class536[] arg7, int arg8, int[] arg9, Random arg10, int arg11, int arg12, int arg13, int[] arg14) {
        field876++;
        if (arg2 == null) {
            return 0;
        }
        arg10.setSeed((long) arg5);
        int var16 = 58 % ((-arg4 - 64) / 49);
        int var17 = (arg10.nextInt() & 0x1F) + 192;
        this.method553(0, var17 << 24 | arg0 & 0xFFFFFF, arg13 & 0xFFFFFF | var17 << 24);
        int var18 = arg2.length();
        int[] var19 = new int[var18];
        int var20 = 0;
        for (int var21 = 0; var21 < var18; var21++) {
            var19[var21] = var20;
            if ((arg10.nextInt() & 0x3) == 0) {
                var20++;
            }
        }
        int var22 = arg12;
        int var23 = this.field884.field940 + arg8;
        int var24 = -1;
        if (arg11 == 1) {
            var23 += (arg6 - this.field884.field938 - this.field884.field940) / 2;
        } else if (arg11 == 2) {
            var23 = arg6 + arg8 - this.field884.field938;
        }
        if (arg1 == 1) {
            var24 = var20 + this.field884.method587(109, arg2);
            var22 = (arg3 - var24) / 2 + arg12;
        } else if (arg1 == 2) {
            var24 = this.field884.method587(93, arg2) + var20;
            var22 = arg3 + arg12 - var24;
        }
        this.method550(arg7, false, var19, arg9, var23, arg2, null, var22);
        if (arg14 != null) {
            if (var24 == -1) {
                var24 = this.field884.method587(-73, arg2) + var20;
            }
            arg14[1] = var23 - this.field884.field940;
            arg14[3] = this.field884.field940 + this.field884.field938;
            arg14[2] = var24;
            arg14[0] = var22;
        }
        return var20;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIBI)V", line = 418)
    public static final void method548(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field879++;
        int var7 = class462.method2818(class432.field6446, class166.field2622, arg3, 8373);
        int var8 = class462.method2818(class432.field6446, class166.field2622, arg2, 8373);
        int var9 = class462.method2818(class391.field5895, class497.field7073, arg6, 8373);
        int var10 = -106 / ((-arg5 - 37) / 33);
        int var11 = class462.method2818(class391.field5895, class497.field7073, arg4, 8373);
        int var12 = class462.method2818(class432.field6446, class166.field2622, arg3 + arg1, 8373);
        int var13 = class462.method2818(class432.field6446, class166.field2622, arg2 - arg1, 8373);
        for (int var14 = var7; var14 < var12; var14++) {
            class238.method1577(arg0, class664.field9322[var14], var11, var9, (byte) 124);
        }
        for (int var15 = var8; var15 > var13; var15--) {
            class238.method1577(arg0, class664.field9322[var15], var11, var9, (byte) -123);
        }
        int var16 = class462.method2818(class391.field5895, class497.field7073, arg1 + arg6, 8373);
        int var17 = class462.method2818(class391.field5895, class497.field7073, arg4 - arg1, 8373);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class664.field9322[var18];
            class238.method1577(arg0, var19, var16, var9, (byte) 122);
            class238.method1577(arg0, var19, var11, var17, (byte) 120);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IBI[I[Lpga;Ljava/util/Random;Ljava/lang/String;III)I", line = 470)
    public final int method549(int arg0, byte arg1, int arg2, int[] arg3, class536[] arg4, Random arg5, String arg6, int arg7, int arg8, int arg9) {
        int var11 = 66 / ((arg1 - 13) / 32);
        field863++;
        if (arg6 == null) {
            return 0;
        }
        arg5.setSeed((long) arg2);
        int var12 = (arg5.nextInt() & 0x1F) + 192;
        this.method553(0, var12 << 24 | arg9 & 0xFFFFFF, var12 << 24 | arg0 & 0xFFFFFF);
        int var13 = arg6.length();
        int[] var14 = new int[var13];
        int var15 = 0;
        for (int var16 = 0; var16 < var13; var16++) {
            var14[var16] = var15;
            if ((arg5.nextInt() & 0x3) == 0) {
                var15++;
            }
        }
        this.method550(arg4, false, var14, arg3, arg7, arg6, null, arg8);
        return var15;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([Lpga;Z[I[IILjava/lang/String;[II)V", line = 514)
    private final void method550(class536[] arg0, boolean arg1, int[] arg2, int[] arg3, int arg4, String arg5, int[] arg6, int arg7) {
        int var9 = arg4 - this.field884.field945;
        field866++;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg5.length();
        if (arg1) {
            field881 = 69;
        }
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class631.method3639(arg5.charAt(var14), (byte) -31) & 0xFF);
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
                                    if (arg2 == null) {
                                        var17 = 0;
                                    } else {
                                        var17 = arg2[var12];
                                    }
                                    int var18;
                                    if (arg6 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg6[var12];
                                    }
                                    var12++;
                                    int var19 = class763.method4236((byte) 37, var16.substring(4));
                                    class536 var20 = arg0[var19];
                                    int var21 = arg3 == null ? var20.method1514() : arg3[var19];
                                    var20.method133(arg7 + var17, this.field884.field945 + var9 - var21 - -var18, 1, 0, 1);
                                    arg7 += arg0[var19].method1504();
                                    var11 = -1;
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method552(var16, -26486);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg7 += this.field884.method586((byte) 36, var11, var15);
                    }
                    int var22;
                    if (arg2 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg2[var12];
                    }
                    int var23;
                    if (arg6 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg6[var12];
                    }
                    if (var15 != ' ') {
                        if ((class596.field8443 & 0xFF000000) != 0) {
                            this.method23(var15, arg7 + var22 + 1, var9 + 1 + var23, class596.field8443, true);
                        }
                        this.method23(var15, arg7 + var22, var9 + var23, class588.field8344, false);
                    } else if (class437.field6480 > 0) {
                        class238.field3462 += class437.field6480;
                        arg7 += class238.field3462 >> 8;
                        class238.field3462 &= 0xFF;
                    }
                    var12++;
                    int var24 = this.field884.method588(var15, 255);
                    if (class434.field6459 != -1) {
                        this.field877.method448(var9 + ((int) ((double) this.field884.field945 * 0.7D)), var24, (byte) -112, class434.field6459, arg7);
                    }
                    if (class75.field1049 != -1) {
                        this.field877.method448(this.field884.field945 + var9, var24, (byte) 115, class75.field1049, arg7);
                    }
                    arg7 += var24;
                    var11 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I[IIIIILaa;ILjava/lang/String;IIIIII[Lpga;)I", line = 680)
    public final int method551(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, class488 arg6, int arg7, String arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, class536[] arg15) {
        field873++;
        if (arg2 != -1) {
            method557((byte) 45);
        }
        return this.method541(arg11, arg15, arg6, arg3, arg5, -2, 0, arg10, arg0, arg7, arg9, arg4, arg1, arg13, arg14, arg12, arg8);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 695)
    private final void method552(String arg0, int arg1) {
        if (arg1 != -26486) {
            return;
        }
        try {
            if (arg0.startsWith("col=")) {
                class588.field8344 = class588.field8344 & 0xFF000000 | class494.method2944(16, arg0.substring(4), 512) & 0xFFFFFF;
            } else if (arg0.equals("/col")) {
                class588.field8344 = class588.field8344 & 0xFF000000 | class752.field10507 & 0xFFFFFF;
            }
            if (arg0.startsWith("argb=")) {
                class588.field8344 = class494.method2944(16, arg0.substring(5), 512);
            } else if (arg0.equals("/argb")) {
                class588.field8344 = class752.field10507;
            } else if (arg0.startsWith("str=")) {
                class434.field6459 = class588.field8344 & 0xFF000000 | class494.method2944(16, arg0.substring(4), 512);
            } else if (arg0.equals("str")) {
                class434.field6459 = class588.field8344 & 0xFF000000 | 0x800000;
            } else if (arg0.equals("/str")) {
                class434.field6459 = -1;
            } else if (arg0.startsWith("u=")) {
                class75.field1049 = class588.field8344 & 0xFF000000 | class494.method2944(16, arg0.substring(2), 512);
            } else if (arg0.equals("u")) {
                class75.field1049 = class588.field8344 & 0xFF000000;
            } else if (arg0.equals("/u")) {
                class75.field1049 = -1;
            } else if (arg0.equalsIgnoreCase("shad=-1")) {
                class596.field8443 = 0;
            } else if (arg0.startsWith("shad=")) {
                class596.field8443 = class588.field8344 & 0xFF000000 | class494.method2944(16, arg0.substring(5), 512);
            } else if (arg0.equals("shad")) {
                class596.field8443 = class588.field8344 & 0xFF000000;
            } else if (arg0.equals("/shad")) {
                class596.field8443 = class400.field5967;
            } else if (arg0.equals("br")) {
                this.method553(0, class752.field10507, class400.field5967);
            }
        } catch (Exception var3) {
        }
        field882++;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(III)V", line = 769)
    private final void method553(int arg0, int arg1, int arg2) {
        class752.field10507 = arg1;
        class588.field8344 = arg1;
        field878++;
        class238.field3462 = 0;
        class75.field1049 = -1;
        class434.field6459 = -1;
        if (~arg2 == arg0) {
            arg2 = 0;
        }
        class437.field6480 = 0;
        class400.field5967 = arg2;
        class596.field8443 = arg2;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BILjava/lang/String;)V", line = 785)
    private final void method554(byte arg0, int arg1, String arg2) {
        field885++;
        int var4 = 0;
        boolean var5 = false;
        if (arg0 != 40) {
            this.field877 = null;
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
            class437.field6480 = (arg1 - this.field884.method587(84, arg2) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V", line = 827)
    public final void method555(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field867++;
        if (arg0 == null) {
            return;
        }
        this.method553(arg3 ^ arg3, arg1, arg5);
        int var8 = arg0.length();
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg6 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg6 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method550(null, false, var9, null, arg4, arg0, var10, arg2 - this.field884.method587(-93, arg0) / 2);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIZIILjava/lang/String;II)V", line = 858)
    public final void method556(int arg0, int arg1, boolean arg2, int arg3, int arg4, String arg5, int arg6, int arg7) {
        field869++;
        if (arg5 == null) {
            return;
        }
        this.method553(0, arg0, arg1);
        double var9 = 7.0D - (double) arg3 / 8.0D;
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg5.length();
        int[] var12 = new int[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (Math.sin((double) var13 / 1.5D + (double) arg6) * var9);
        }
        this.method550(null, arg2, null, null, arg7, arg5, var12, arg4 - (this.field884.method587(86, arg5) / 2));
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V", line = 894)
    public static void method557(byte arg0) {
        int var1 = 126 / ((49 - arg0) / 48);
        field883 = null;
        field871 = null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIILjava/lang/String;I[Lpga;[II)V", line = 904)
    public final void method558(int arg0, int arg1, int arg2, String arg3, int arg4, class536[] arg5, int[] arg6, int arg7) {
        field870++;
        if (arg7 <= 104) {
            field871 = null;
        }
        if (arg3 != null) {
            this.method553(0, arg1, arg4);
            this.method542(0, 0, arg5, arg6, arg3, arg2, null, arg0, -117);
        }
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lha;Lhia;)V", line = 933)
    public class61(class60 arg0, class66 arg1) {
        this.field884 = arg1;
        this.field877 = arg0;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(CIIIZLaa;II)V")
    public abstract void method22(char arg0, int arg1, int arg2, int arg3, boolean arg4, class488 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!da", name = "fa", descriptor = "(CIIIZ)V")
    public abstract void method23(char arg0, int arg1, int arg2, int arg3, boolean arg4);
}
