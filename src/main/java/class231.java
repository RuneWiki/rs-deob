import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public class class231 {

    @OriginalMember(owner = "client!ku", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3345 = new String[] { method1923(method1922("jC<qj")), method1923(method1922("oC~Y")), method1923(method1922("jC<wj")), method1923(method1922("z\u0018<\u001b?")), method1923(method1922("jC<sj")), method1923(method1922("jC<pj")), method1923(method1922("jC<rj")), method1923(method1922("jC<tj")), method1923(method1922("jC<vj")) };

    @OriginalMember(owner = "client!ku", name = "h", descriptor = "Lmv;")
    public static class125 field3339 = new class125(7, 4);

    @OriginalMember(owner = "client!ku", name = "g", descriptor = "Lsb;")
    public static class261 field3341 = new class261(29, -1);

    @OriginalMember(owner = "client!ku", name = "c", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field3344 = new Hashtable();

    @OriginalMember(owner = "client!ku", name = "f", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!ku", name = "d", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!ku", name = "e", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!ku", name = "i", descriptor = "I")
    public static int field3338;

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!ku", name = "j", descriptor = "[J")
    public static long[] field3343;

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1915(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            field3336++;
            if (arg2 < 15) {
                field3344 = null;
            }
            for (class472 var7 = (class472) class211.field3097.method3617(false); var7 != null; var7 = (class472) class211.field3097.method3612(3)) {
                if (var7.field6913 <= class694.field9700) {
                    var7.method4736(0);
                } else {
                    class615.method4535((var7.field6917 << 9) + 256, var7.field6920 * 2, arg1, 0, arg6, arg3 >> 1, var7.field6918, (var7.field6914 << 9) + 256, arg0 >> 1);
                    class200.field2954.method1825(class302.field4219[1] + arg4, arg5 - -class302.field4219[0], var7.field6915 | 0xFF000000, 0, (byte) -124, var7.field6921);
                }
            }
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field3345[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(I)[Lu;")
    public static final class741[] method1916(int arg0) {
        try {
            field3338++;
            return arg0 == 23651 ? new class741[] { class398.field5793, class226.field3284, class447.field6570, class46.field648, class581.field8393, class491.field7197, class260.field3692 } : null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3345[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(IIILha;II)V")
    public static final void method1917(int arg0, int arg1, int arg2, class18 arg3, int arg4, int arg5) {
        try {
            arg3.method208(arg5, arg1, arg0 + arg5, arg1 - -arg2);
            field3340++;
            arg3.method121(arg0, arg5, arg4 + 66, arg2, -16777216, arg1);
            if (class511.field7506 >= 100) {
                float var6 = (float) class534.field7759 / (float) class534.field7747;
                int var7 = arg0;
                int var8 = arg2;
                if (var6 < (float) arg4) {
                    var8 = (int) ((float) arg0 * var6);
                } else {
                    var7 = (int) ((float) arg2 / var6);
                }
                int var24 = (arg0 - var7) / 2 + arg5;
                int var23 = (arg2 - var8) / 2 + arg1;
                if (class248.field3560 == null || class248.field3560.method1376() != arg0 || class248.field3560.method1377() != arg2) {
                    class534.method4053(class534.field7745, class534.field7759 + class534.field7751, class534.field7745 - -class534.field7747, class534.field7751, var24, var23, var24 + var7, var23 + var8);
                    class534.method4041(arg3);
                    class248.field3560 = arg3.method196(var24, var23, var7, var8, false);
                }
                class248.field3560.method3074(var24, var23);
                int var9 = class395.field5730 * var7 / class534.field7747;
                int var10 = class425.field6127 * var8 / class534.field7759;
                int var11 = var24 + (class299.field4175 * var7 / class534.field7747);
                int var12 = var23 + var8 - (class50.field712 * var8 / class534.field7759) - var10;
                int var13 = -1996554240;
                if (class544.field7978 == class316.field4323) {
                    var13 = -1996488705;
                }
                arg3.method237(var11, var12, var9, var10, var13, 1);
                arg3.method212(var11, var12, var9, var10, var13, 0);
                if (class147.field1894 > 0) {
                    int var14;
                    if (class426.field6140 <= 50) {
                        var14 = class426.field6140 * 5;
                    } else {
                        var14 = 500 - (class426.field6140 * 5);
                    }
                    for (class353 var15 = (class353) class534.field7732.method3977((byte) -91); var15 != null; var15 = (class353) class534.field7732.method3987(0)) {
                        class475 var16 = class534.field7725.method2508(var15.field5108, false);
                        if (class121.method1093(var16, 1)) {
                            if (class230.field3330 == var15.field5108) {
                                int var19 = var15.field5110 * var7 / class534.field7747 + var24;
                                int var20 = (class534.field7759 - var15.field5117) * var8 / class534.field7759 + var23;
                                arg3.method121(4, var19 - 2, 107, 4, var14 << 24 | 0xFFFF00, var20 - 2);
                            } else if (class570.field8272 != -1 && class570.field8272 == var16.field7003) {
                                int var17 = var15.field5110 * var7 / class534.field7747 + var24;
                                int var18 = (class534.field7759 - var15.field5117) * var8 / class534.field7759 + var23;
                                arg3.method121(4, var17 - 2, 66, 4, var14 << 24 | 0xFFFF00, var18 - 2);
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException var22) {
            throw class665.method4799(var22, field3345[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field3345[1] : field3345[3]) + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(B)V")
    public static void method1918(byte arg0) {
        try {
            field3343 = null;
            if (arg0 != 71) {
                field3343 = null;
            }
            field3344 = null;
            field3341 = null;
            field3339 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3345[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(IIIIIIIIILuda;II)Z")
    public static final boolean method1919(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class302 arg9, int arg10, int arg11) {
        try {
            field3337++;
            int var12 = arg8;
            int var13 = arg0;
            byte var14 = 64;
            if (arg10 < 124) {
                return true;
            }
            byte var15 = 64;
            int var16 = arg8 - var14;
            int var17 = arg0 - var15;
            class393.field5717[var14][var15] = 99;
            class481.field7084[var14][var15] = 0;
            byte var18 = 0;
            class796.field11576[var18] = arg8;
            int var19 = 0;
            int var37 = var18 + 1;
            class356.field5171[var18] = arg0;
            int[][] var20 = arg9.field4202;
            while (true) {
                label346: while (true) {
                    int var21;
                    int var22;
                    int var23;
                    int var24;
                    int var26;
                    do {
                        do {
                            do {
                                label323: do {
                                    if (var37 == var19) {
                                        class654.field9282 = var13;
                                        class263.field3716 = var12;
                                        return false;
                                    }
                                    var13 = class356.field5171[var19];
                                    var12 = class796.field11576[var19];
                                    var21 = var12 - var16;
                                    var19 = var19 + 1 & 0xFFF;
                                    var22 = var13 - var17;
                                    var23 = var12 - arg9.field4214;
                                    var24 = var13 - arg9.field4196;
                                    if (arg7 == -4) {
                                        if (arg6 == var12 && arg2 == var13) {
                                            class263.field3716 = var12;
                                            class654.field9282 = var13;
                                            return true;
                                        }
                                    } else if (arg7 == -3) {
                                        if (class801.method5778(arg5, var12, var13, arg5, arg6, arg3, arg2, (byte) 120, arg4)) {
                                            class654.field9282 = var13;
                                            class263.field3716 = var12;
                                            return true;
                                        }
                                    } else if (arg7 == -2) {
                                        if (arg9.method2416(arg2, (byte) 33, arg11, arg4, arg6, var12, arg5, arg5, arg3, var13)) {
                                            class263.field3716 = var12;
                                            class654.field9282 = var13;
                                            return true;
                                        }
                                    } else if (arg7 == -1) {
                                        if (arg9.method2422(arg2, var13, arg4, var12, arg5, arg6, arg11, false, arg3)) {
                                            class263.field3716 = var12;
                                            class654.field9282 = var13;
                                            return true;
                                        }
                                    } else if (arg7 == 0 || arg7 == 1 || arg7 == 2 || arg7 == 3 || arg7 == 9) {
                                        if (arg9.method2424(var13, arg1, arg6, 0, var12, arg2, arg7, arg5)) {
                                            class654.field9282 = var13;
                                            class263.field3716 = var12;
                                            return true;
                                        }
                                    } else if (arg9.method2430(false, var12, arg1, var13, arg7, arg6, arg5, arg2)) {
                                        class654.field9282 = var13;
                                        class263.field3716 = var12;
                                        return true;
                                    }
                                    var26 = class481.field7084[var21][var22] + 1;
                                    if (var21 > 0 && class393.field5717[var21 - 1][var22] == 0 && (var20[var23 - 1][var24] & 0x43A40000) == 0 && (var20[var23 - 1][var24 + arg5 - 1] & 0x4E240000) == 0) {
                                        int var27 = 1;
                                        while (true) {
                                            if (var27 >= arg5 - 1) {
                                                class796.field11576[var37] = var12 - 1;
                                                class356.field5171[var37] = var13;
                                                class393.field5717[var21 - 1][var22] = 2;
                                                var37 = var37 + 1 & 0xFFF;
                                                class481.field7084[var21 - 1][var22] = var26;
                                                break;
                                            }
                                            if ((var20[var23 - 1][var24 + var27] & 0x4FA40000) != 0) {
                                                break;
                                            }
                                            var27++;
                                        }
                                    }
                                    if ((128 - arg5) > var21 && class393.field5717[var21 + 1][var22] == 0 && (var20[arg5 + var23][var24] & 0x60E40000) == 0 && (var20[var23 + arg5][arg5 + var24 - 1] & 0x78240000) == 0) {
                                        int var28 = 1;
                                        while (true) {
                                            if (var28 >= (arg5 - 1)) {
                                                class796.field11576[var37] = var12 + 1;
                                                class356.field5171[var37] = var13;
                                                var37 = var37 + 1 & 0xFFF;
                                                class393.field5717[var21 + 1][var22] = 8;
                                                class481.field7084[var21 + 1][var22] = var26;
                                                break;
                                            }
                                            if ((var20[var23 + arg5][var28 + var24] & 0x78E40000) != 0) {
                                                break;
                                            }
                                            var28++;
                                        }
                                    }
                                    if (var22 > 0 && class393.field5717[var21][var22 - 1] == 0 && (var20[var23][var24 - 1] & 0x43A40000) == 0 && (var20[var23 + arg5 - 1][var24 - 1] & 0x60E40000) == 0) {
                                        int var29 = 1;
                                        while (true) {
                                            if ((arg5 - 1) <= var29) {
                                                class796.field11576[var37] = var12;
                                                class356.field5171[var37] = var13 - 1;
                                                class393.field5717[var21][var22 - 1] = 1;
                                                var37 = var37 + 1 & 0xFFF;
                                                class481.field7084[var21][var22 - 1] = var26;
                                                break;
                                            }
                                            if ((var20[var23 + var29][var24 - 1] & 0x63E40000) != 0) {
                                                break;
                                            }
                                            var29++;
                                        }
                                    }
                                    if ((128 - arg5) > var22 && class393.field5717[var21][var22 + 1] == 0 && (var20[var23][arg5 + var24] & 0x4E240000) == 0 && (var20[arg5 + var23 - 1][arg5 + var24] & 0x78240000) == 0) {
                                        int var30 = 1;
                                        while (true) {
                                            if (var30 >= arg5 - 1) {
                                                class796.field11576[var37] = var12;
                                                class356.field5171[var37] = var13 + 1;
                                                var37 = var37 + 1 & 0xFFF;
                                                class393.field5717[var21][var22 + 1] = 4;
                                                class481.field7084[var21][var22 + 1] = var26;
                                                break;
                                            }
                                            if ((var20[var23 + var30][arg5 + var24] & 0x7E240000) != 0) {
                                                break;
                                            }
                                            var30++;
                                        }
                                    }
                                    if (var21 > 0 && var22 > 0 && class393.field5717[var21 - 1][var22 - 1] == 0 && (var20[var23 - 1][var24 - 1] & 0x43A40000) == 0) {
                                        int var31 = 1;
                                        while (true) {
                                            if (var31 >= arg5) {
                                                class796.field11576[var37] = var12 - 1;
                                                class356.field5171[var37] = var13 - 1;
                                                class393.field5717[var21 - 1][var22 - 1] = 3;
                                                var37 = var37 + 1 & 0xFFF;
                                                class481.field7084[var21 - 1][var22 - 1] = var26;
                                                break;
                                            }
                                            if ((var20[var23 - 1][var24 + var31 - 1] & 0x4FA40000) != 0 || (var20[var23 - (1 - var31)][var24 - 1] & 0x63E40000) != 0) {
                                                break;
                                            }
                                            var31++;
                                        }
                                    }
                                    if (var21 < 128 - arg5 && var22 > 0 && class393.field5717[var21 + 1][var22 - 1] == 0 && (var20[arg5 + var23][var24 - 1] & 0x60E40000) == 0) {
                                        int var32 = 1;
                                        while (true) {
                                            if (var32 >= arg5) {
                                                class796.field11576[var37] = var12 + 1;
                                                class356.field5171[var37] = var13 - 1;
                                                class393.field5717[var21 + 1][var22 - 1] = 9;
                                                var37 = var37 + 1 & 0xFFF;
                                                class481.field7084[var21 + 1][var22 - 1] = var26;
                                                break;
                                            }
                                            if ((var20[arg5 + var23][var32 + var24 - 1] & 0x78E40000) != 0 || (var20[var23 + var32][var24 - 1] & 0x63E40000) != 0) {
                                                break;
                                            }
                                            var32++;
                                        }
                                    }
                                    if (var21 > 0 && (128 - arg5) > var22 && class393.field5717[var21 - 1][var22 + 1] == 0 && (var20[var23 - 1][arg5 + var24] & 0x4E240000) == 0) {
                                        for (int var33 = 1; var33 < arg5; var33++) {
                                            if ((var20[var23 - 1][var33 + var24] & 0x4FA40000) != 0 || (var20[var23 + var33 - 1][arg5 + var24] & 0x7E240000) != 0) {
                                                continue label323;
                                            }
                                        }
                                        class796.field11576[var37] = var12 - 1;
                                        class356.field5171[var37] = var13 + 1;
                                        var37 = var37 + 1 & 0xFFF;
                                        class393.field5717[var21 - 1][var22 + 1] = 6;
                                        class481.field7084[var21 - 1][var22 + 1] = var26;
                                    }
                                } while (var21 >= 128 - arg5);
                            } while (128 - arg5 <= var22);
                        } while (class393.field5717[var21 + 1][var22 + 1] != 0);
                    } while ((var20[var23 + arg5][arg5 + var24] & 0x78240000) != 0);
                    for (int var34 = 1; var34 < arg5; var34++) {
                        if ((var20[var23 + var34][var24 + arg5] & 0x7E240000) != 0 || (var20[arg5 + var23][var24 + var34] & 0x78E40000) != 0) {
                            continue label346;
                        }
                    }
                    class796.field11576[var37] = var12 + 1;
                    class356.field5171[var37] = var13 + 1;
                    class393.field5717[var21 + 1][var22 + 1] = 12;
                    var37 = var37 + 1 & 0xFFF;
                    class481.field7084[var21 + 1][var22 + 1] = var26;
                }
            }
        } catch (RuntimeException var36) {
            throw class665.method4799(var36, field3345[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + (arg9 == null ? field3345[1] : field3345[3]) + ',' + arg10 + ',' + arg11 + ')');
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(B)V")
    public static final void method1920(byte arg0) {
        try {
            if (arg0 < -25) {
                class467.field6810 = null;
                field3342++;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3345[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(III[BILjava/lang/String;)I")
    public static final int method1921(int arg0, int arg1, int arg2, byte[] arg3, int arg4, String arg5) {
        try {
            field3335++;
            int var6 = arg2 - arg0;
            for (int var7 = arg1; var7 < var6; var7++) {
                char var8 = arg5.charAt(arg0 + var7);
                if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                    arg3[arg4 + var7] = (byte) var8;
                } else if (var8 == '€') {
                    arg3[arg4 + var7] = -128;
                } else if (var8 == '‚') {
                    arg3[arg4 + var7] = -126;
                } else if (var8 == 'ƒ') {
                    arg3[arg4 + var7] = -125;
                } else if (var8 == '„') {
                    arg3[arg4 + var7] = -124;
                } else if (var8 == '…') {
                    arg3[arg4 + var7] = -123;
                } else if (var8 == '†') {
                    arg3[arg4 + var7] = -122;
                } else if (var8 == '‡') {
                    arg3[arg4 + var7] = -121;
                } else if (var8 == 'ˆ') {
                    arg3[arg4 + var7] = -120;
                } else if (var8 == '‰') {
                    arg3[arg4 + var7] = -119;
                } else if (var8 == 'Š') {
                    arg3[arg4 + var7] = -118;
                } else if (var8 == '‹') {
                    arg3[arg4 + var7] = -117;
                } else if (var8 == 'Œ') {
                    arg3[arg4 + var7] = -116;
                } else if (var8 == 'Ž') {
                    arg3[arg4 + var7] = -114;
                } else if (var8 == '‘') {
                    arg3[arg4 + var7] = -111;
                } else if (var8 == '’') {
                    arg3[arg4 + var7] = -110;
                } else if (var8 == '“') {
                    arg3[arg4 + var7] = -109;
                } else if (var8 == '”') {
                    arg3[arg4 + var7] = -108;
                } else if (var8 == '•') {
                    arg3[arg4 + var7] = -107;
                } else if (var8 == '–') {
                    arg3[arg4 + var7] = -106;
                } else if (var8 == '—') {
                    arg3[arg4 + var7] = -105;
                } else if (var8 == '˜') {
                    arg3[arg4 + var7] = -104;
                } else if (var8 == '™') {
                    arg3[arg4 + var7] = -103;
                } else if (var8 == 'š') {
                    arg3[arg4 + var7] = -102;
                } else if (var8 == '›') {
                    arg3[arg4 + var7] = -101;
                } else if (var8 == 'œ') {
                    arg3[arg4 + var7] = -100;
                } else if (var8 == 'ž') {
                    arg3[arg4 + var7] = -98;
                } else if (var8 == 'Ÿ') {
                    arg3[arg4 + var7] = -97;
                } else {
                    arg3[arg4 + var7] = 63;
                }
            }
            return var6;
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field3345[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field3345[1] : field3345[3]) + ',' + arg4 + ',' + (arg5 == null ? field3345[1] : field3345[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!ku", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1922(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x42);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ku", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1923(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 1;
                    break;
                case 1:
                    var10005 = 54;
                    break;
                case 2:
                    var10005 = 18;
                    break;
                case 3:
                    var10005 = 53;
                    break;
                default:
                    var10005 = 66;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
