import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class161 {

    @OriginalMember(owner = "client!cd", name = "t", descriptor = "[B")
    private byte[] field2069;

    @OriginalMember(owner = "client!cd", name = "s", descriptor = "[[B")
    private byte[][] field2076;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
    public int field2077;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
    public int field2071;

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "I")
    public int field2062;

    @OriginalMember(owner = "client!cd", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field2079 = new String[] { method1370(method1369("d\\z,")), method1370(method1369("*yw2QcJz%V0\t")), method1370(method1369("q\u00078nX")), method1370(method1369("gZ")), method1370(method1369("ZHd4LiEs`VsZb%H*Jy5K~\u00136")), method1370(method1369("OD\u007f4Qo[ez\u0005")), method1370(method1369("$\tB)Ho\tb!NoG,`")), method1370(method1369("&\td5Kd@x'\u001f*")), method1370(method1369("iM8\u000f\r")), method1370(method1369("iM8\u0007\r")), method1370(method1369("iM8\n\r")), method1370(method1369("iM8\u0002\r")), method1370(method1369("iM8\t\r")), method1370(method1369("iM8|Ld@b~\r")), method1370(method1369("iM8\u0005\r")), method1370(method1369("iM8\u000e\r")), method1370(method1369("iM8\u0006\r")), method1370(method1369("yAo")), method1370(method1369("h[")), method1370(method1369("o\\d/")), method1370(method1369("cDq}")), method1370(method1369("dKe0")), method1370(method1369("iM8\u0001\r")), method1370(method1369("xLq")), method1370(method1369("f]")), method1370(method1369("iFf9")), method1370(method1369("~@{%V")), method1370(method1369("m]")), method1370(method1369("iM8\u0004\r")), method1370(method1369("iM8\r\r")), method1370(method1369("iM8\u0003\r")), method1370(method1369("$\u00078")), method1370(method1369("iM8\b\r")), method1370(method1369("iM8\u000b\r")), method1370(method1369("iM8\f\r")) };

    @OriginalMember(owner = "client!cd", name = "v", descriptor = "Z")
    public static boolean field2066 = false;

    @OriginalMember(owner = "client!cd", name = "r", descriptor = "Lkl;")
    public static class740 field2065 = new class740();

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!cd", name = "u", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public static int field2075;

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)Z", line = 5)
    public static final boolean method1354(int arg0, int arg1) {
        try {
            field2057++;
            if (arg0 == 22 || arg0 == 8 || arg0 == 5 || arg0 == 20 || arg0 == 4 || arg0 == 1003) {
                return true;
            } else if (arg0 == 19) {
                return true;
            } else {
                if (arg1 != 2353) {
                    method1360(67);
                }
                return false;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2079[34] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIII)V", line = 24)
    public static final void method1355(int arg0, int arg1, int arg2, int arg3) {
        try {
            int var7 = arg0 * class451.field6612.field9094.method2498(3) >> 8;
            field2075++;
            if (var7 != 0 && arg2 != -1) {
                if (!class399.field5812 && class291.field4106 != -1 && class628.method4611(64) && !class514.method3934((byte) 65)) {
                    class732.field10452 = class375.method2964(28563);
                    class429 var4 = class403.method3164(93, class732.field10452);
                    class474.method3663(7728, true, var4);
                }
                class772.method5562(0, arg2, class98.field1330, var7, (byte) 55, false);
                class132.method1151((byte) -78, -1, 255);
                class399.field5812 = true;
            }
            if (arg1 < 5) {
                field2066 = false;
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field2079[15] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "([Ltb;[IZLjava/lang/String;[Ljava/lang/String;)I", line = 54)
    public final int method1356(class392[] arg0, int[] arg1, boolean arg2, String arg3, String[] arg4) {
        try {
            field2070++;
            if (arg3 == null) {
                return 0;
            }
            int var6 = 0;
            int var7 = 0;
            int var8 = -1;
            int var9 = 0;
            byte var10 = 0;
            if (arg2) {
                method1354(22, -24);
            }
            int var11 = -1;
            int var12 = -1;
            int var13 = 0;
            int var14 = arg3.length();
            for (int var15 = 0; var15 < var14; var15++) {
                int var16 = class152.method1291(arg3.charAt(var15), (byte) -9) & 0xFF;
                int var17 = 0;
                if (var16 == 60) {
                    var11 = var15;
                } else {
                    int var18;
                    if (var11 == -1) {
                        var18 = var15;
                        var17 += this.method1357((byte) 122, var16);
                        if (this.field2076 != null && var12 != -1) {
                            var17 += this.field2076[var12][var16];
                        }
                        var12 = var16;
                    } else {
                        if (var16 != 62) {
                            continue;
                        }
                        var18 = var11;
                        String var19 = arg3.substring(var11 + 1, var15);
                        var11 = -1;
                        if (var19.equals(field2079[18])) {
                            arg4[var13] = arg3.substring(var7, var15 + 1);
                            var13++;
                            if (arg4.length <= var13) {
                                return 0;
                            }
                            var6 = 0;
                            var8 = -1;
                            var7 = var15 + 1;
                            var12 = -1;
                            continue;
                        }
                        if (var19.equals(field2079[24])) {
                            var17 += this.method1357((byte) 122, 60);
                            if (this.field2076 != null && var12 != -1) {
                                var17 += this.field2076[var12][60];
                            }
                            var12 = 60;
                        } else if (var19.equals(field2079[27])) {
                            var17 += this.method1357((byte) 122, 62);
                            if (this.field2076 != null && var12 != -1) {
                                var17 += this.field2076[var12][62];
                            }
                            var12 = 62;
                        } else if (var19.equals(field2079[21])) {
                            var17 += this.method1357((byte) 122, 160);
                            if (this.field2076 != null && var12 != -1) {
                                var17 += this.field2076[var12][160];
                            }
                            var12 = 160;
                        } else if (var19.equals(field2079[17])) {
                            var17 += this.method1357((byte) 122, 173);
                            if (this.field2076 != null && var12 != -1) {
                                var17 += this.field2076[var12][173];
                            }
                            var12 = 173;
                        } else if (var19.equals(field2079[26])) {
                            var17 += this.method1357((byte) 122, 215);
                            if (this.field2076 != null && var12 != -1) {
                                var17 += this.field2076[var12][215];
                            }
                            var12 = 215;
                        } else if (var19.equals(field2079[19])) {
                            var17 += this.method1357((byte) 122, 8364);
                            if (this.field2076 != null && var12 != -1) {
                                var17 += this.field2076[var12][8364];
                            }
                            var12 = 8364;
                        } else if (var19.equals(field2079[25])) {
                            var17 += this.method1357((byte) 122, 169);
                            if (this.field2076 != null && var12 != -1) {
                                var17 += this.field2076[var12][169];
                            }
                            var12 = 169;
                        } else if (var19.equals(field2079[23])) {
                            var17 += this.method1357((byte) 122, 174);
                            if (this.field2076 != null && var12 != -1) {
                                var17 += this.field2076[var12][174];
                            }
                            var12 = 174;
                        } else if (var19.startsWith(field2079[20]) && arg0 != null) {
                            try {
                                int var20 = class425.method3299(var19.substring(4), (byte) 109);
                                var12 = -1;
                                var17 += arg0[var20].method1378();
                            } catch (Exception var22) {
                            }
                        }
                        var16 = -1;
                    }
                    if (var17 > 0) {
                        var6 += var17;
                        if (arg1 != null) {
                            if (var16 == 32) {
                                var10 = 1;
                                var8 = var15;
                                var9 = var6;
                            }
                            if (var6 > arg1[var13 >= arg1.length ? arg1.length - 1 : var13]) {
                                if (var8 < 0) {
                                    arg4[var13] = arg3.substring(var7, var18);
                                    var13++;
                                    if (var13 >= arg4.length) {
                                        return 0;
                                    }
                                    var8 = -1;
                                    var6 = var17;
                                    var12 = -1;
                                    var7 = var18;
                                } else {
                                    arg4[var13] = arg3.substring(var7, var8 + 1 - var10);
                                    var13++;
                                    if (var13 >= arg4.length) {
                                        return 0;
                                    }
                                    var7 = var8 + 1;
                                    var8 = -1;
                                    var6 -= var9;
                                    var12 = -1;
                                }
                            }
                            if (var16 == 45) {
                                var10 = 0;
                                var8 = var15;
                                var9 = var6;
                            }
                        }
                    }
                }
            }
            if (arg3.length() > var7) {
                arg4[var13] = arg3.substring(var7, arg3.length());
                var13++;
            }
            return var13;
        } catch (RuntimeException var23) {
            throw class665.method4799(var23, field2079[22] + (arg0 == null ? field2079[0] : field2079[2]) + ',' + (arg1 == null ? field2079[0] : field2079[2]) + ',' + arg2 + ',' + (arg3 == null ? field2079[0] : field2079[2]) + ',' + (arg4 == null ? field2079[0] : field2079[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BI)I", line = 305)
    public final int method1357(byte arg0, int arg1) {
        try {
            field2073++;
            return arg0 == 122 ? this.field2069[arg1] & 0xFF : 87;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field2079[16] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IILjava/lang/String;[Ltb;)I", line = 316)
    public final int method1358(int arg0, int arg1, String arg2, class392[] arg3) {
        try {
            field2068++;
            if (arg1 < 88) {
                this.method1357((byte) 29, -84);
            }
            int var5 = this.method1356(arg3, new int[] { arg0 }, false, arg2, class61.field935);
            int var6 = 0;
            for (int var7 = 0; var7 < var5; var7++) {
                int var8 = this.method1366(arg3, -117, class61.field935[var7]);
                if (var8 > var6) {
                    var6 = var8;
                }
            }
            return var6;
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field2079[10] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field2079[0] : field2079[2]) + ',' + (arg3 == null ? field2079[0] : field2079[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "([Ltb;IBLjava/lang/String;I)I", line = 345)
    public final int method1359(class392[] arg0, int arg1, byte arg2, String arg3, int arg4) {
        try {
            field2060++;
            if (arg4 == 0) {
                arg4 = this.field2077;
            }
            int var6 = this.method1356(arg0, new int[] { arg1 }, false, arg3, class61.field935);
            int var7 = (var6 - 1) * arg4;
            if (arg2 != 116) {
                this.method1358(-122, -103, null, null);
            }
            return this.field2071 + var7 + this.field2062;
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field2079[32] + (arg0 == null ? field2079[0] : field2079[2]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field2079[0] : field2079[2]) + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)V", line = 367)
    public static final void method1360(int arg0) {
        try {
            for (class801 var1 = (class801) class520.field7588.method3932((byte) -94); var1 != null; var1 = (class801) class520.field7588.method3939((byte) -75)) {
                if (var1.field11653 > 1) {
                    var1.field11653 = 0;
                    class721.field10264.method2051(((class228) var1.field11651.field7555.field9626).field3303, var1, 93);
                    var1.field11651.method3936((byte) 94);
                }
            }
            int var2 = 97 / ((-arg0 - 62) / 36);
            field2063++;
            class17.field221 = 0;
            class72.field1049 = 0;
            class45.field644.method3982(-126);
            class603.field8646.method3690((byte) 95);
            class520.field7588.method3936((byte) -71);
            class507.method3877(class783.field11299, (byte) -11);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field2079[29] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "([Ltb;IILjava/lang/String;)Ljava/lang/String;", line = 398)
    public final String method1361(class392[] arg0, int arg1, int arg2, String arg3) {
        try {
            field2078++;
            if (arg1 >= this.method1366(arg0, -107, arg3)) {
                return arg3;
            }
            int var18 = arg1 - this.method1366(null, -111, field2079[31]);
            int var5 = -1;
            if (arg2 != 46) {
                this.method1367(76, null, null, (byte) -2);
            }
            int var6 = -1;
            int var7 = 0;
            int var8 = arg3.length();
            String var9 = "";
            for (int var10 = 0; var10 < var8; var10++) {
                char var11 = arg3.charAt(var10);
                if (var11 == '<') {
                    var5 = var10;
                } else {
                    if (var11 == '>' && var5 != -1) {
                        String var12 = arg3.substring(var5 + 1, var10);
                        var5 = -1;
                        if (var12.equals(field2079[24])) {
                            var11 = '<';
                        } else if (var12.equals(field2079[27])) {
                            var11 = '>';
                        } else if (var12.equals(field2079[21])) {
                            var11 = ' ';
                        } else if (var12.equals(field2079[17])) {
                            var11 = '\u00AD';
                        } else if (var12.equals(field2079[26])) {
                            var11 = '×';
                        } else if (var12.equals(field2079[19])) {
                            var11 = '€';
                        } else if (var12.equals(field2079[25])) {
                            var11 = '©';
                        } else {
                            if (!var12.equals(field2079[23])) {
                                if (var12.startsWith(field2079[20]) && arg0 != null) {
                                    try {
                                        int var13 = class425.method3299(var12.substring(4), (byte) 102);
                                        var7 += arg0[var13].method1378();
                                        var6 = -1;
                                        if (var7 > var18) {
                                            return var9 + field2079[31];
                                        }
                                        var9 = arg3.substring(0, var10 + 1);
                                    } catch (Exception var16) {
                                    }
                                }
                                continue;
                            }
                            var11 = '®';
                        }
                    }
                    if (var5 == -1) {
                        var7 += this.field2069[class152.method1291(var11, (byte) -9) & 0xFF] & 0xFF;
                        if (this.field2076 != null && var6 != -1) {
                            var7 += this.field2076[var6][var11];
                        }
                        var6 = var11;
                        int var14 = var7;
                        if (this.field2076 != null) {
                            var14 = this.field2076[var11][46] + var7;
                        }
                        if (var18 < var14) {
                            return var9 + field2079[31];
                        }
                        var9 = arg3.substring(0, var10 + 1);
                    }
                }
            }
            return arg3;
        } catch (RuntimeException var17) {
            throw class665.method4799(var17, field2079[30] + (arg0 == null ? field2079[0] : field2079[2]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field2079[0] : field2079[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V", line = 522)
    public static void method1362(int arg0) {
        try {
            field2065 = null;
            if (arg0 != 0) {
                field2067 = 122;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field2079[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(JLha;I)V", line = 533)
    public static final void method1363(long arg0, class18 arg1, int arg2) {
        try {
            field2058++;
            class530.field7689 = class623.field8909;
            class57.field809 = 0;
            class720.field10256 = 0;
            class623.field8909 = 0;
            if (arg2 > 41) {
                long var4 = class614.method4531(-67);
                for (class464 var6 = (class464) class21.field262.method3617(false); var6 != null; var6 = (class464) class21.field262.method3612(3)) {
                    if (var6.method3570(arg1, arg0)) {
                        class720.field10256++;
                    }
                }
                if (class486.field7132 && arg0 % 100L == 0L) {
                    System.out.println(field2079[4] + class21.field262.method3619(0) + field2079[7] + class720.field10256);
                    System.out.println(field2079[5] + class57.field809 + field2079[1] + class623.field8909 + field2079[6] + (class614.method4531(-105) - var4) + field2079[3]);
                }
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field2079[8] + arg0 + ',' + (arg1 == null ? field2079[0] : field2079[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BIC)I", line = 569)
    public final int method1364(byte arg0, int arg1, char arg2) {
        try {
            if (arg0 >= -28) {
                this.field2062 = -55;
            }
            field2074++;
            return this.field2076 == null ? 0 : this.field2076[arg1][arg2];
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field2079[11] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;I)V", line = 586)
    public static final void method1365(String arg0, byte arg1, String arg2, int arg3) {
        try {
            field2064++;
            class139.field1812 = arg3;
            class398.field5797 = 2;
            int var4 = 43 % ((-arg1 - 27) / 32);
            class341.field4966 = class60.field916;
            class157.method1317(false, arg2, 0, arg0, false);
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field2079[12] + (arg0 == null ? field2079[0] : field2079[2]) + ',' + arg1 + ',' + (arg2 == null ? field2079[0] : field2079[2]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "([Ltb;ILjava/lang/String;)I", line = 600)
    public final int method1366(class392[] arg0, int arg1, String arg2) {
        try {
            field2059++;
            if (arg2 == null) {
                return 0;
            }
            int var4 = -1;
            int var5 = -1;
            if (arg1 > -93) {
                return -26;
            }
            int var6 = 0;
            int var7 = arg2.length();
            for (int var8 = 0; var8 < var7; var8++) {
                char var9 = arg2.charAt(var8);
                if (var9 == '<') {
                    var4 = var8;
                } else {
                    if (var9 == '>' && var4 != -1) {
                        String var10 = arg2.substring(var4 + 1, var8);
                        var4 = -1;
                        if (var10.equals(field2079[24])) {
                            var9 = '<';
                        } else if (var10.equals(field2079[27])) {
                            var9 = '>';
                        } else if (var10.equals(field2079[21])) {
                            var9 = ' ';
                        } else if (var10.equals(field2079[17])) {
                            var9 = '\u00AD';
                        } else if (var10.equals(field2079[26])) {
                            var9 = '×';
                        } else if (var10.equals(field2079[19])) {
                            var9 = '€';
                        } else if (var10.equals(field2079[25])) {
                            var9 = '©';
                        } else {
                            if (!var10.equals(field2079[23])) {
                                if (var10.startsWith(field2079[20]) && arg0 != null) {
                                    try {
                                        int var11 = class425.method3299(var10.substring(4), (byte) 107);
                                        var6 += arg0[var11].method1378();
                                        var5 = -1;
                                    } catch (Exception var13) {
                                    }
                                }
                                continue;
                            }
                            var9 = '®';
                        }
                    }
                    if (var4 == -1) {
                        var6 += this.field2069[class152.method1291(var9, (byte) -9) & 0xFF] & 0xFF;
                        if (this.field2076 != null && var5 != -1) {
                            var6 += this.field2076[var5][var9];
                        }
                        var5 = var9;
                    }
                }
            }
            return var6;
        } catch (RuntimeException var14) {
            throw class665.method4799(var14, field2079[28] + (arg0 == null ? field2079[0] : field2079[2]) + ',' + arg1 + ',' + (arg2 == null ? field2079[0] : field2079[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I[Ltb;Ljava/lang/String;B)I", line = 711)
    public final int method1367(int arg0, class392[] arg1, String arg2, byte arg3) {
        try {
            field2072++;
            if (arg3 > -37) {
                field2067 = 10;
            }
            return this.method1356(arg1, new int[] { arg0 }, false, arg2, class61.field935);
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field2079[14] + arg0 + ',' + (arg1 == null ? field2079[0] : field2079[2]) + ',' + (arg2 == null ? field2079[0] : field2079[2]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 724)
    public final int method1368(String arg0, int arg1) {
        try {
            if (arg1 > -61) {
                return -59;
            } else {
                field2061++;
                return this.method1366(null, -103, arg0);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field2079[33] + (arg0 == null ? field2079[0] : field2079[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "([B)V", line = 743)
    public class161(byte[] arg0) {
        try {
            class711 var2 = new class711(arg0);
            int var3 = var2.method5128(0);
            if (var3 != 0) {
                throw new RuntimeException("");
            }
            boolean var4 = var2.method5128(0) == 1;
            this.field2069 = new byte[256];
            var2.method5117(256, 0, this.field2069, -38);
            if (var4) {
                int[] var5 = new int[256];
                for (int var6 = 0; var6 < 256; var6++) {
                    var5[var6] = var2.method5128(0);
                }
                int[] var7 = new int[256];
                for (int var8 = 0; var8 < 256; var8++) {
                    var7[var8] = var2.method5128(0);
                }
                byte[][] var9 = new byte[256][];
                for (int var10 = 0; var10 < 256; var10++) {
                    var9[var10] = new byte[var5[var10]];
                    byte var11 = 0;
                    for (int var12 = 0; var12 < var9[var10].length; var12++) {
                        var11 += var2.method5125((byte) 122);
                        var9[var10][var12] = var11;
                    }
                }
                byte[][] var13 = new byte[256][];
                for (int var14 = 0; var14 < 256; var14++) {
                    var13[var14] = new byte[var5[var14]];
                    byte var15 = 0;
                    for (int var16 = 0; var16 < var13[var14].length; var16++) {
                        var15 += var2.method5125((byte) -22);
                        var13[var14][var16] = var15;
                    }
                }
                this.field2076 = new byte[256][256];
                for (int var17 = 0; var17 < 256; var17++) {
                    if (var17 != 32 && var17 != 160) {
                        for (int var18 = 0; var18 < 256; var18++) {
                            if (var18 != 32 && var18 != 160) {
                                this.field2076[var17][var18] = (byte) class735.method5340(var18, var13, (byte) 99, this.field2069, var17, var7, var9, var5);
                            }
                        }
                    }
                }
                this.field2077 = var5[32] + var7[32];
            } else {
                this.field2077 = var2.method5128(0);
            }
            var2.method5128(0);
            var2.method5128(0);
            this.field2071 = var2.method5128(0);
            this.field2062 = var2.method5128(0);
        } catch (RuntimeException var20) {
            throw class665.method4799(var20, field2079[13] + (arg0 == null ? field2079[0] : field2079[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!cd", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1369(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x25);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!cd", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1370(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 10;
                    break;
                case 1:
                    var10005 = 41;
                    break;
                case 2:
                    var10005 = 22;
                    break;
                case 3:
                    var10005 = 64;
                    break;
                default:
                    var10005 = 37;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
