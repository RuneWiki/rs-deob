import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class282 {

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "Lwl;")
    public static class452 field4306 = new class452(7, 6);

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "Lwl;")
    public static class452 field4310 = new class452(13, -1);

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "[I")
    public static int[] field4313 = new int[14];

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "Lns;")
    public static class55 field4312 = new class55(8, 3);

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "[I")
    public static int[] field4314;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
    public static int field4304;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
    public static int field4305;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
    public static int field4308;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
    public static int field4309;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "I")
    public static int field4311;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "Luj;")
    public static class415 field4307;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(JIIIZ)Ljava/lang/String;")
    public static final String method1734(long arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field4309++;
        char var6 = ',';
        char var7 = '.';
        int var8 = 110 / ((arg3 - 75) / 39);
        if (arg1 == 0) {
            var6 = '.';
            var7 = ',';
        }
        if (arg1 == 2) {
            var7 = ' ';
        }
        boolean var9 = false;
        if (arg0 < 0L) {
            var9 = true;
            arg0 = -arg0;
        }
        StringBuffer var10 = new StringBuffer(26);
        if (arg2 > 0) {
            for (int var11 = 0; var11 < arg2; var11++) {
                int var12 = (int) arg0;
                arg0 /= 10L;
                var10.append((char) (var12 + 48 - (int) arg0 * 10));
            }
            var10.append(var6);
        }
        int var13 = 0;
        while (true) {
            int var14 = (int) arg0;
            arg0 /= 10L;
            var10.append((char) (var14 + 48 - ((int) arg0 * 10)));
            if (arg0 == 0L) {
                if (var9) {
                    var10.append('-');
                }
                return var10.reverse().toString();
            }
            if (arg4) {
                var13++;
                if ((var13 % 3) == 0) {
                    var10.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IBI)V")
    public static final void method1735(int arg0, byte arg1, int arg2) {
        field4304++;
        if (arg1 != 102) {
            field4313 = null;
        }
        class32 var3 = class136.method854(1, (byte) 121, arg2);
        var3.method194(false);
        var3.field404 = arg0;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIIBLek;IIIII)Z")
    public static final boolean method1736(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, class375 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field4308++;
        int var12 = arg9;
        int var13 = arg3;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg9 - var14;
        int var17 = arg3 - var15;
        class449.field6612[var14][var15] = 99;
        class150.field2072[var14][var15] = 0;
        if (arg5 != -11) {
            field4314 = null;
        }
        byte var18 = 0;
        class451.field6659[var18] = arg9;
        int var19 = 0;
        int var35 = var18 + 1;
        class107.field1429[var18] = arg3;
        int[][] var20 = arg6.field5455;
        while (true) {
            label286: while (true) {
                int var21;
                int var22;
                int var23;
                int var24;
                int var26;
                do {
                    do {
                        do {
                            label263: do {
                                if (var35 == var19) {
                                    class191.field2846 = var12;
                                    class399.field5956 = var13;
                                    return false;
                                }
                                var12 = class451.field6659[var19];
                                var13 = class107.field1429[var19];
                                var19 = var19 + 1 & 0xFFF;
                                var21 = var13 - var17;
                                var22 = var12 - var16;
                                var23 = var12 - arg6.field5452;
                                var24 = var13 - arg6.field5456;
                                if (arg8 == -4) {
                                    if (arg1 == var12 && arg2 == var13) {
                                        class191.field2846 = var12;
                                        class399.field5956 = var13;
                                        return true;
                                    }
                                } else if (arg8 == -3) {
                                    if (class71.method474(128, arg0, var13, arg7, arg2, arg7, var12, arg1, arg11)) {
                                        class191.field2846 = var12;
                                        class399.field5956 = var13;
                                        return true;
                                    }
                                } else if (arg8 == -2) {
                                    if (arg6.method2251(arg0, arg11, arg7, arg7, arg10, var13, var12, arg1, -29128, arg2)) {
                                        class191.field2846 = var12;
                                        class399.field5956 = var13;
                                        return true;
                                    }
                                } else if (arg8 == -1) {
                                    if (arg6.method2246(arg1, var13, (byte) 66, arg0, var12, arg10, arg7, arg2, arg11)) {
                                        class191.field2846 = var12;
                                        class399.field5956 = var13;
                                        return true;
                                    }
                                } else if (arg8 == 0 || arg8 == 1 || arg8 == 2 || arg8 == 3 || arg8 == 9) {
                                    if (arg6.method2254(arg5 + 116, arg4, arg1, arg8, arg7, var13, var12, arg2)) {
                                        class191.field2846 = var12;
                                        class399.field5956 = var13;
                                        return true;
                                    }
                                } else if (arg6.method2259(arg2, arg8, arg4, arg1, arg7, var12, 0, var13)) {
                                    class399.field5956 = var13;
                                    class191.field2846 = var12;
                                    return true;
                                }
                                var26 = class150.field2072[var22][var21] + 1;
                                if (var22 > 0 && class449.field6612[var22 - 1][var21] == 0 && (var20[var23 - 1][var24] & 0x43A40000) == 0 && (var20[var23 - 1][arg7 + var24 - 1] & 0x4E240000) == 0) {
                                    int var27 = 1;
                                    while (true) {
                                        if (var27 >= arg7 - 1) {
                                            class451.field6659[var35] = var12 - 1;
                                            class107.field1429[var35] = var13;
                                            var35 = var35 + 1 & 0xFFF;
                                            class449.field6612[var22 - 1][var21] = 2;
                                            class150.field2072[var22 - 1][var21] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var27] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var27++;
                                    }
                                }
                                if (var22 < 128 - arg7 && class449.field6612[var22 + 1][var21] == 0 && (var20[arg7 + var23][var24] & 0x60E40000) == 0 && (var20[arg7 + var23][var24 + arg7 - 1] & 0x78240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if (arg7 - 1 <= var28) {
                                            class451.field6659[var35] = var12 + 1;
                                            class107.field1429[var35] = var13;
                                            var35 = var35 + 1 & 0xFFF;
                                            class449.field6612[var22 + 1][var21] = 8;
                                            class150.field2072[var22 + 1][var21] = var26;
                                            break;
                                        }
                                        if ((var20[arg7 + var23][var24 + var28] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var21 > 0 && class449.field6612[var22][var21 - 1] == 0 && (var20[var23][var24 - 1] & 0x43A40000) == 0 && (var20[var23 - (1 - arg7)][var24 - 1] & 0x60E40000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if (var29 >= (arg7 - 1)) {
                                            class451.field6659[var35] = var12;
                                            class107.field1429[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class449.field6612[var22][var21 - 1] = 1;
                                            class150.field2072[var22][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var29][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if (var21 < 128 - arg7 && class449.field6612[var22][var21 + 1] == 0 && (var20[var23][arg7 + var24] & 0x4E240000) == 0 && (var20[arg7 + var23 - 1][arg7 + var24] & 0x78240000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if (arg7 - 1 <= var30) {
                                            class451.field6659[var35] = var12;
                                            class107.field1429[var35] = var13 + 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class449.field6612[var22][var21 + 1] = 4;
                                            class150.field2072[var22][var21 + 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var30][arg7 + var24] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var22 > 0 && var21 > 0 && class449.field6612[var22 - 1][var21 - 1] == 0 && (var20[var23 - 1][var24 - 1] & 0x43A40000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (var31 >= arg7) {
                                            class451.field6659[var35] = var12 - 1;
                                            class107.field1429[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class449.field6612[var22 - 1][var21 - 1] = 3;
                                            class150.field2072[var22 - 1][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var31 - 1] & 0x4FA40000) != 0 || (var20[var23 + var31 - 1][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if (var22 < (128 - arg7) && var21 > 0 && class449.field6612[var22 + 1][var21 - 1] == 0 && (var20[arg7 + var23][var24 - 1] & 0x60E40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (var32 >= arg7) {
                                            class451.field6659[var35] = var12 + 1;
                                            class107.field1429[var35] = var13 - 1;
                                            class449.field6612[var22 + 1][var21 - 1] = 9;
                                            var35 = var35 + 1 & 0xFFF;
                                            class150.field2072[var22 + 1][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + arg7][var24 + var32 - 1] & 0x78E40000) != 0 || (var20[var23 + var32][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (var22 > 0 && 128 - arg7 > var21 && class449.field6612[var22 - 1][var21 + 1] == 0 && (var20[var23 - 1][arg7 + var24] & 0x4E240000) == 0) {
                                    for (int var33 = 1; var33 < arg7; var33++) {
                                        if ((var20[var23 - 1][var24 + var33] & 0x4FA40000) != 0 || (var20[var23 + var33 - 1][var24 + arg7] & 0x7E240000) != 0) {
                                            continue label263;
                                        }
                                    }
                                    class451.field6659[var35] = var12 - 1;
                                    class107.field1429[var35] = var13 + 1;
                                    class449.field6612[var22 - 1][var21 + 1] = 6;
                                    var35 = var35 + 1 & 0xFFF;
                                    class150.field2072[var22 - 1][var21 + 1] = var26;
                                }
                            } while (var22 >= 128 - arg7);
                        } while (128 - arg7 <= var21);
                    } while (class449.field6612[var22 + 1][var21 + 1] != 0);
                } while ((var20[arg7 + var23][arg7 + var24] & 0x78240000) != 0);
                for (int var34 = 1; var34 < arg7; var34++) {
                    if ((var20[var23 + var34][arg7 + var24] & 0x7E240000) != 0 || (var20[arg7 + var23][var24 + var34] & 0x78E40000) != 0) {
                        continue label286;
                    }
                }
                class451.field6659[var35] = var12 + 1;
                class107.field1429[var35] = var13 + 1;
                class449.field6612[var22 + 1][var21 + 1] = 12;
                var35 = var35 + 1 & 0xFFF;
                class150.field2072[var22 + 1][var21 + 1] = var26;
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Ljava/lang/String;Z)I")
    public static final int method1737(String arg0, boolean arg1) {
        field4305++;
        for (int var2 = 0; var2 < class451.field6645.length; var2++) {
            if (class451.field6645[var2].equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        if (!arg1) {
            method1738(-110);
        }
        return -1;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
    public static final void method1738(int arg0) {
        if (arg0 != 128) {
            return;
        }
        field4311++;
        class110.field1448 = 0;
        int var1 = (class113.field1500.field1900 >> 7) + class17.field250;
        int var2 = (class113.field1500.field1892 >> 7) + class112.field1487;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class110.field1448 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class110.field1448 = 1;
        }
        if (class110.field1448 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class110.field1448 = 0;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Z)V")
    public static void method1739(boolean arg0) {
        if (arg0) {
            method1739(true);
        }
        field4314 = null;
        field4306 = null;
        field4312 = null;
        field4307 = null;
        field4310 = null;
        field4313 = null;
    }

    static {
        new class151("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
        field4314 = new int[2];
    }
}
