import java.awt.Point;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public abstract class class61 {

    @OriginalMember(owner = "client!da", name = "l", descriptor = "Lmv;")
    private class377 field664;

    @OriginalMember(owner = "client!da", name = "s", descriptor = "Lha;")
    private class60 field671;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field653 = 0;

    @OriginalMember(owner = "client!da", name = "u", descriptor = "Lmu;")
    public static class303 field673 = new class303("LIVE", "", "", 0);

    @OriginalMember(owner = "client!da", name = "v", descriptor = "[C")
    public static char[] field674 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "I")
    public static int field668;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!da", name = "r", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!da", name = "t", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!da", name = "w", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!da", name = "x", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!da", name = "y", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIILaa;ILjava/lang/String;[Lufa;[I)V")
    private final void method461(int arg0, int arg1, int arg2, int arg3, class487 arg4, int arg5, String arg6, class680[] arg7, int[] arg8) {
        field665++;
        int var10 = arg2 - this.field664.field5241;
        int var11 = -1;
        int var12 = arg5;
        int var13 = arg6.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class153.method933((byte) 88, arg6.charAt(var14)) & 0xFF);
            if (var15 == '<') {
                var11 = var14;
            } else {
                if (var15 == '>' && var11 != -1) {
                    String var16 = arg6.substring(var11 + 1, var14);
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
                                    int var17 = class436.method2477(42, var16.substring(4));
                                    class680 var18 = arg7[var17];
                                    int var19 = arg8 == null ? var18.method663() : arg8[var17];
                                    if ((class598.field8324 & 0xFF000000) == -16777216) {
                                        var18.method677(arg3, this.field664.field5241 + var10 - var19, 1, 0, 1);
                                    } else {
                                        var18.method677(arg3, var10 + this.field664.field5241 - var19, 0, class598.field8324 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    arg3 += arg7[var17].method666();
                                    var12 = -1;
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method465(var16, -1);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg3 += this.field664.method2213((byte) -50, var15, var12);
                    }
                    if (var15 == ' ') {
                        if (class424.field5956 > 0) {
                            class513.field6950 += class424.field5956;
                            arg3 += class513.field6950 >> 8;
                            class513.field6950 &= 0xFF;
                        }
                    } else if (arg4 == null) {
                        if ((class473.field6543 & 0xFF000000) != 0) {
                            this.method74(var15, arg3 + 1, var10 - -1, class473.field6543, true);
                        }
                        this.method74(var15, arg3, var10, class598.field8324, false);
                    } else {
                        if ((class473.field6543 & 0xFF000000) != 0) {
                            this.method76(var15, arg3 + 1, var10 + 1, class473.field6543, true, arg4, arg0, arg1);
                        }
                        this.method76(var15, arg3, var10, class598.field8324, false, arg4, arg0, arg1);
                    }
                    int var20 = this.field664.method2215((byte) 81, var15);
                    if (class5.field39 != -1) {
                        this.field671.method359(arg5 ^ 0xFFFFA8E9, var20, class5.field39, (int) ((double) this.field664.field5241 * 0.7D) + var10, arg3);
                    }
                    if (class518.field6977 != -1) {
                        this.field671.method359(22294, var20, class518.field6977, this.field664.field5241 + var10 + 1, arg3);
                    }
                    var12 = var15;
                    arg3 += var20;
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIILjava/lang/String;I)V")
    public final void method462(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5) {
        field654++;
        if (arg4 != null) {
            this.method464((byte) -47, arg3, arg0);
            this.method461(0, arg1, arg5, arg2 - this.field664.method2216(arg4, 124), null, -1, arg4, null, null);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
    public static final void method463(int arg0) {
        field670++;
        class704.method3970((long) class406.field5732, true, class21.field142);
        if (class116.field1543 != -1) {
            class54.method312(class116.field1543, -115);
        }
        for (int var1 = 0; var1 < class497.field6763; var1++) {
            if (class24.field186[var1]) {
                class12.field78[var1] = true;
            }
            class362.field4797[var1] = class24.field186[var1];
            class24.field186[var1] = false;
        }
        class266.field3520 = class406.field5732;
        if (arg0 < 33) {
            method463(14);
        }
        if (class116.field1543 != -1) {
            class497.field6763 = 0;
            class406.method2347((byte) 112);
        }
        class21.field142.method406();
        class418.method2399(256, class21.field142);
        int var2 = class258.method1549((byte) -70);
        if (var2 == -1) {
            var2 = class553.field7817;
        }
        if (var2 == -1) {
            var2 = class410.field5779;
        }
        method466(var2, true);
        class242.field3146 = 0;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BII)V")
    private final void method464(byte arg0, int arg1, int arg2) {
        field676++;
        class518.field6977 = -1;
        class5.field39 = -1;
        class115.field1516 = arg2;
        class598.field8324 = arg2;
        class513.field6950 = 0;
        int var4 = -8 / ((28 - arg0) / 61);
        class424.field5956 = 0;
        if (arg1 == -1) {
            arg1 = 0;
        }
        class242.field3142 = arg1;
        class473.field6543 = arg1;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;I)V")
    private final void method465(String arg0, int arg1) {
        try {
            if (arg1 != -1) {
                this.field664 = null;
            }
            if (arg0.startsWith("col=")) {
                class598.field8324 = class598.field8324 & 0xFF000000 | class638.method3590(arg1 ^ 0xFFFFFFFE, 16, arg0.substring(4)) & 0xFFFFFF;
            } else if (arg0.equals("/col")) {
                class598.field8324 = class115.field1516 & 0xFFFFFF | class598.field8324 & 0xFF000000;
            }
            if (arg0.startsWith("argb=")) {
                class598.field8324 = class638.method3590(1, 16, arg0.substring(5));
            } else if (arg0.equals("/argb")) {
                class598.field8324 = class115.field1516;
            } else if (arg0.startsWith("str=")) {
                class5.field39 = class598.field8324 & 0xFF000000 | class638.method3590(arg1 + 2, 16, arg0.substring(4));
            } else if (arg0.equals("str")) {
                class5.field39 = class598.field8324 & 0xFF000000 | 0x800000;
            } else if (arg0.equals("/str")) {
                class5.field39 = -1;
            } else if (arg0.startsWith("u=")) {
                class518.field6977 = class598.field8324 & 0xFF000000 | class638.method3590(arg1 + 2, 16, arg0.substring(2));
            } else if (arg0.equals("u")) {
                class518.field6977 = class598.field8324 & 0xFF000000;
            } else if (arg0.equals("/u")) {
                class518.field6977 = -1;
            } else if (arg0.equalsIgnoreCase("shad=-1")) {
                class473.field6543 = 0;
            } else if (arg0.startsWith("shad=")) {
                class473.field6543 = class598.field8324 & 0xFF000000 | class638.method3590(1, 16, arg0.substring(5));
            } else if (arg0.equals("shad")) {
                class473.field6543 = class598.field8324 & 0xFF000000;
            } else if (arg0.equals("/shad")) {
                class473.field6543 = class242.field3142;
            } else if (arg0.equals("br")) {
                this.method464((byte) -35, class242.field3142, class115.field1516);
            }
        } catch (Exception var3) {
        }
        field656++;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IZ)V")
    public static final void method466(int arg0, boolean arg1) {
        if (class11.field68.field5513.method1109((byte) 120) == 0) {
            arg0 = -1;
        }
        field669++;
        if (class665.field9268 == arg0) {
            return;
        }
        if (arg0 != -1) {
            class191 var2 = class360.field4768.method959(arg0, 25930);
            class204 var3 = var2.method1066((byte) 126);
            if (var3 == null) {
                arg0 = -1;
            } else {
                class287.field3823.method4140(var3.method1130(), new Point(var2.field2305, var2.field2302), var3.method1125(), (byte) 125, var3.method1133(), class725.field10121);
                class665.field9268 = arg0;
            }
        }
        if (arg1 && arg0 == -1 && class665.field9268 != -1) {
            class287.field3823.method4140(null, new Point(), -1, (byte) 95, -1, class725.field10121);
            class665.field9268 = -1;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;B)V")
    private final void method467(int arg0, String arg1, byte arg2) {
        field662++;
        int var4 = 0;
        boolean var5 = false;
        for (int var6 = 0; var6 < arg1.length(); var6++) {
            char var7 = arg1.charAt(var6);
            if (var7 == '<') {
                var5 = true;
            } else if (var7 == '>') {
                var5 = false;
            } else if (!var5 && var7 == ' ') {
                var4++;
            }
        }
        if (arg2 < 35) {
            this.field664 = null;
        }
        if (var4 > 0) {
            class424.field5956 = (arg0 - this.field664.method2216(arg1, 106) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIILjava/lang/String;I)V")
    public final void method468(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, int arg6) {
        if (arg4 < 3) {
            this.field664 = null;
        }
        field661++;
        if (arg5 == null) {
            return;
        }
        this.method464((byte) -81, arg0, arg6);
        int var8 = arg5.length();
        int[] var9 = new int[var8];
        for (int var10 = 0; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg3 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method474(var9, arg1 - this.field664.method2216(arg5, 113) / 2, true, null, null, arg5, null, arg2);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II)V")
    public static final void method469(int arg0, int arg1) {
        field658++;
        class262 var2 = class552.field7810;
        synchronized (class552.field7810) {
            class552.field7810.method1569((byte) 62, arg0);
        }
        if (arg1 != 2974) {
            method463(-17);
        }
        class262 var3 = class407.field5741;
        synchronized (class407.field5741) {
            class407.field5741.method1569((byte) 62, arg0);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIILaa;IIIIIIB[Lufa;IILjava/lang/String;I[I)I")
    public final int method470(int arg0, int arg1, int arg2, class487 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, byte arg10, class680[] arg11, int arg12, int arg13, String arg14, int arg15, int[] arg16) {
        field655++;
        if (arg14 == null) {
            return 0;
        }
        this.method464((byte) 108, arg6, arg12);
        if (arg7 == 0) {
            arg7 = this.field664.field5241;
        }
        int[] var18;
        if ((this.field664.field5239 + this.field664.field5236 + arg7) > arg2 && arg7 + arg7 > arg2) {
            var18 = null;
        } else {
            var18 = new int[] { arg5 };
        }
        int var19 = this.field664.method2217(arg14, class638.field8849, var18, arg11, -1);
        if (arg1 == -1) {
            arg1 = arg2 / arg7;
            if (arg1 <= 0) {
                arg1 = 1;
            }
        }
        int var20 = 82 % ((arg10 - 30) / 51);
        if (arg1 > 0 && var19 >= arg1) {
            var19 = arg1;
            class638.field8849[arg1 - 1] = this.field664.method2219(class638.field8849[arg1 - 1], false, arg11, arg5);
        }
        if (arg8 == 3 && var19 == 1) {
            arg8 = 1;
        }
        int var21;
        if (arg8 == 0) {
            var21 = this.field664.field5239 + arg9;
        } else if (arg8 == 1) {
            var21 = arg9 + ((arg2 - this.field664.field5239 - this.field664.field5236 - ((var19 + -1) * arg7)) / 2) + this.field664.field5239;
        } else if (arg8 == 2) {
            var21 = arg2 + arg9 - ((var19 - 1) * arg7) - this.field664.field5236;
        } else {
            int var22 = (arg2 - (var19 - 1) * arg7 - this.field664.field5239 - this.field664.field5236) / (var19 + 1);
            if (var22 < 0) {
                var22 = 0;
            }
            var21 = this.field664.field5239 + var22 + arg9;
            arg7 += var22;
        }
        for (int var23 = 0; var23 < var19; var23++) {
            if (arg15 == 0) {
                this.method461(arg13, arg4, var21, arg0, arg3, -1, class638.field8849[var23], arg11, arg16);
            } else if (arg15 == 1) {
                this.method461(arg13, arg4, var21, (arg5 - this.field664.method2216(class638.field8849[var23], 112)) / 2 + arg0, arg3, -1, class638.field8849[var23], arg11, arg16);
            } else if (arg15 == 2) {
                this.method461(arg13, arg4, var21, arg0 + (arg5 - this.field664.method2216(class638.field8849[var23], 123)), arg3, -1, class638.field8849[var23], arg11, arg16);
            } else if ((var19 - 1) == var23) {
                this.method461(arg13, arg4, var21, arg0, arg3, -1, class638.field8849[var23], arg11, arg16);
            } else {
                this.method467(arg5, class638.field8849[var23], (byte) 74);
                this.method461(arg13, arg4, var21, arg0, arg3, -1, class638.field8849[var23], arg11, arg16);
                class424.field5956 = 0;
            }
            var21 += arg7;
        }
        return var19;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIIILjava/lang/String;)V")
    public final void method471(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, String arg7) {
        field663++;
        if (arg7 == null) {
            return;
        }
        this.method464((byte) 123, arg1, arg3);
        double var9 = 7.0D - ((double) arg4 / 8.0D);
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg7.length();
        int[] var12 = new int[var11];
        for (int var13 = arg0; var13 < var11; var13++) {
            var12[var13] = (int) (var9 * Math.sin((double) var13 / 1.5D + (double) arg5));
        }
        this.method474(var12, arg6 - (this.field664.method2216(arg7, 118) / 2), true, null, null, arg7, null, arg2);
    }

    @OriginalMember(owner = "client!da", name = "fa", descriptor = "(CIIIZ)V")
    public abstract void method74(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIILjava/lang/String;Ljava/util/Random;[III[Lufa;I)I")
    public final int method472(int arg0, int arg1, int arg2, String arg3, Random arg4, int[] arg5, int arg6, int arg7, class680[] arg8, int arg9) {
        field675++;
        if (arg9 >= -48) {
            this.method474(null, -54, true, null, null, null, null, -121);
        }
        if (arg3 == null) {
            return 0;
        }
        arg4.setSeed((long) arg6);
        int var11 = (arg4.nextInt() & 0x1F) + 192;
        this.method464((byte) -94, arg0 & 0xFFFFFF | var11 << 24, var11 << 24 | arg1 & 0xFFFFFF);
        int var12 = arg3.length();
        int[] var13 = new int[var12];
        int var14 = 0;
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg4.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        this.method474(null, arg7, true, var13, arg8, arg3, arg5, arg2);
        return var14;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I[Lufa;ILjava/lang/String;IILaa;IBI[IIIIII)I")
    public final int method473(int arg0, class680[] arg1, int arg2, String arg3, int arg4, int arg5, class487 arg6, int arg7, byte arg8, int arg9, int[] arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        field672++;
        if (arg8 > -48) {
            this.method74('b', -40, -26, 60, false);
        }
        return this.method470(arg0, 0, arg15, arg6, arg12, arg2, arg5, arg11, arg13, arg14, (byte) -74, arg1, arg9, arg4, arg3, arg7, arg10);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(CIIIZLaa;II)V")
    public abstract void method76(char arg0, int arg1, int arg2, int arg3, boolean arg4, class487 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([IIZ[I[Lufa;Ljava/lang/String;[II)V")
    private final void method474(int[] arg0, int arg1, boolean arg2, int[] arg3, class680[] arg4, String arg5, int[] arg6, int arg7) {
        field666++;
        int var9 = arg7 - this.field664.field5241;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (!arg2) {
            this.method468(39, -23, 82, 55, -128, null, 88);
        }
        int var13 = arg5.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class153.method933((byte) 88, arg5.charAt(var14)) & 0xFF);
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
                                    if (arg3 == null) {
                                        var17 = 0;
                                    } else {
                                        var17 = arg3[var12];
                                    }
                                    int var18;
                                    if (arg0 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg0[var12];
                                    }
                                    var12++;
                                    int var19 = class436.method2477(-62, var16.substring(4));
                                    class680 var20 = arg4[var19];
                                    int var21 = arg6 == null ? var20.method663() : arg6[var19];
                                    var20.method677(arg1 + var17, this.field664.field5241 - var21 - -var18 + var9, 1, 0, 1);
                                    arg1 += arg4[var19].method666();
                                    var11 = -1;
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method465(var16, -1);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg1 += this.field664.method2213((byte) -50, var15, var11);
                    }
                    int var22;
                    if (arg3 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg3[var12];
                    }
                    int var23;
                    if (arg0 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg0[var12];
                    }
                    var12++;
                    if (var15 != ' ') {
                        if ((class473.field6543 & 0xFF000000) != 0) {
                            this.method74(var15, arg1 + var22 + 1, var9 + var23 + 1, class473.field6543, true);
                        }
                        this.method74(var15, arg1 + var22, var9 + var23, class598.field8324, false);
                    } else if (class424.field5956 > 0) {
                        class513.field6950 += class424.field5956;
                        arg1 += class513.field6950 >> 8;
                        class513.field6950 &= 0xFF;
                    }
                    int var24 = this.field664.method2215((byte) -127, var15);
                    if (class5.field39 != -1) {
                        this.field671.method359(22294, var24, class5.field39, (int) ((double) this.field664.field5241 * 0.7D) + var9, arg1);
                    }
                    if (class518.field6977 != -1) {
                        this.field671.method359(22294, var24, class518.field6977, this.field664.field5241 + var9, arg1);
                    }
                    var11 = var15;
                    arg1 += var24;
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BILjava/lang/String;III)V")
    public final void method475(byte arg0, int arg1, String arg2, int arg3, int arg4, int arg5) {
        int var7 = -126 % ((arg0 + 3) / 35);
        field667++;
        if (arg2 != null) {
            this.method464((byte) 93, arg4, arg3);
            this.method461(0, 0, arg1, arg5, null, -1, arg2, null, null);
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(IIIIILjava/lang/String;I)V")
    public final void method476(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, int arg6) {
        field660++;
        if (arg5 == null) {
            return;
        }
        this.method464((byte) 121, arg0, arg2);
        int var8 = arg5.length();
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg6 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg6 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        int var12 = -70 / ((arg1 + 76) / 50);
        this.method474(var10, arg3 - this.field664.method2216(arg5, 127) / 2, true, var9, null, arg5, null, arg4);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I[IILjava/lang/String;IIB[Lufa;)V")
    public final void method477(int arg0, int[] arg1, int arg2, String arg3, int arg4, int arg5, byte arg6, class680[] arg7) {
        if (arg6 != 18) {
            return;
        }
        field657++;
        if (arg3 != null) {
            this.method464((byte) 91, arg2, arg4);
            this.method461(0, 0, arg0, arg5, null, -1, arg3, arg7, arg1);
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(I)V")
    public static void method478(int arg0) {
        field674 = null;
        field673 = null;
        if (arg0 != -2) {
            field674 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;IIBI)V")
    public final void method479(int arg0, String arg1, int arg2, int arg3, byte arg4, int arg5) {
        int var7 = -35 / (arg4 / 47);
        field668++;
        if (arg1 != null) {
            this.method464((byte) 94, arg3, arg0);
            this.method461(0, 0, arg5, arg2 - this.field664.method2216(arg1, 127) / 2, null, -1, arg1, null, null);
        }
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lha;Lmv;)V")
    public class61(class60 arg0, class377 arg1) {
        this.field664 = arg1;
        this.field671 = arg0;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIILjava/util/Random;I[IILjava/lang/String;I[II[Lufa;I)I")
    public final int method480(int arg0, int arg1, int arg2, int arg3, int arg4, Random arg5, int arg6, int[] arg7, int arg8, String arg9, int arg10, int[] arg11, int arg12, class680[] arg13, int arg14) {
        field659++;
        if (arg9 == null) {
            return 0;
        }
        arg5.setSeed((long) arg2);
        int var16 = (arg5.nextInt() & 0x1F) + 192;
        this.method464((byte) -77, arg3 & 0xFFFFFF | var16 << 24, var16 << 24 | arg1 & 0xFFFFFF);
        int var17 = arg9.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg5.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        int var21 = -112 % ((arg12 + 55) / 54);
        int var22 = arg0;
        int var23 = this.field664.field5239 + arg14;
        int var24 = -1;
        if (arg10 == 1) {
            var23 += (arg4 - this.field664.field5239 - this.field664.field5236) / 2;
        } else if (arg10 == 2) {
            var23 = arg4 + arg14 - this.field664.field5236;
        }
        if (arg6 == 1) {
            var24 = var19 + this.field664.method2216(arg9, 118);
            var22 = (arg8 - var24) / 2 + arg0;
        } else if (arg6 == 2) {
            var24 = this.field664.method2216(arg9, 100) + var19;
            var22 = arg8 + arg0 - var24;
        }
        this.method474(null, var22, true, var18, arg13, arg9, arg11, var23);
        if (arg7 != null) {
            if (var24 == -1) {
                var24 = var19 + this.field664.method2216(arg9, 104);
            }
            arg7[1] = var23 - this.field664.field5239;
            arg7[0] = var22;
            arg7[3] = this.field664.field5239 + this.field664.field5236;
            arg7[2] = var24;
        }
        return var19;
    }
}
