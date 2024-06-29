import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class288 {

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "I")
    public static int field4407 = 0;

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "[I")
    public static int[] field4409 = new int[2];

    @OriginalMember(owner = "client!fi", name = "p", descriptor = "I")
    public static int field4416 = 0;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "I")
    public static int field4401;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "I")
    public int field4402;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "I")
    public static int field4403;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "I")
    public static int field4404;

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "I")
    public int field4406;

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "I")
    public static int field4408;

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "I")
    public static int field4410;

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "I")
    public int field4411;

    @OriginalMember(owner = "client!fi", name = "l", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!fi", name = "m", descriptor = "I")
    public static int field4413;

    @OriginalMember(owner = "client!fi", name = "n", descriptor = "I")
    public int field4414;

    @OriginalMember(owner = "client!fi", name = "o", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "Lce;")
    public static class8 field4405;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BILjava/lang/String;Z)I", line = 6)
    public static final int method1873(byte arg0, int arg1, String arg2, boolean arg3) {
        field4413++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        boolean var4 = false;
        if (arg0 != 80) {
            field4416 = -21;
        }
        int var5 = 0;
        boolean var6 = false;
        int var7 = arg2.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg2.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var6 = true;
                    continue;
                }
                if (var9 == '+' && arg3) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (arg1 <= var11) {
                throw new NumberFormatException();
            }
            if (var6) {
                var11 = -var11;
            }
            int var10 = arg1 * var5 + var11;
            if ((var10 / arg1) != var5) {
                throw new NumberFormatException();
            }
            var5 = var10;
            var4 = true;
        }
        if (!var4) {
            throw new NumberFormatException();
        }
        return var5;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(III)V", line = 89)
    public static final void method1874(int arg0, int arg1, int arg2) {
        field4401++;
        if (class183.method1263(arg0 ^ arg0, arg2)) {
            class148.method1041(arg1, class219.field3487[arg2], (byte) -127);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIZI[Lwb;[BIIII)[I", line = 102)
    public static final int[] method1875(int arg0, int arg1, int arg2, boolean arg3, int arg4, class294[] arg5, byte[] arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = (arg2 & 0x7) * 8;
        field4403++;
        int var12 = (arg4 & 0x7) * 8;
        if (!arg3) {
            for (int var13 = 0; var13 < 8; var13++) {
                for (int var14 = 0; var14 < 8; var14++) {
                    int var15 = class299.method1971(var13 & 0x7, var14 & 0x7, arg0, 10643) + arg9;
                    int var16 = arg8 + class226.method1539(arg0, var13 & 0x7, 3, var14 & 0x7);
                    if (var15 > 0 && var15 < 103 && var16 > 0 && var16 < 103) {
                        arg5[arg1].field4544[var15][var16] = class311.method2135(arg5[arg1].field4544[var15][var16], -2097153);
                    }
                }
            }
        }
        if (arg10 != 28150) {
            method1881(35);
        }
        byte var17;
        if (arg3) {
            var17 = 1;
        } else {
            var17 = 4;
        }
        class303 var18 = new class303(arg6);
        int var19 = arg2 & 0x1FFFFFF8 << 3;
        int var20 = (arg4 & 0xFFFFFFF8) << 3;
        for (int var21 = 0; var21 < var17; var21++) {
            for (int var22 = 0; var22 < 64; var22++) {
                for (int var23 = 0; var23 < 64; var23++) {
                    if (arg7 != var21 || var22 < var11 || var11 + 8 < var22 || var12 > var23 || (var12 + 8) < var23) {
                        class51.method347(-1, -1, var18, arg10 - 28149, 0, arg3, 0, false, 0, 0);
                    } else if ((var11 + 8) == var22 || var12 + 8 == var23) {
                        int var30;
                        int var31;
                        if (arg0 == 0) {
                            var30 = var22 - (var11 - arg9);
                            var31 = var23 - (var12 - arg8);
                        } else if (arg0 == 1) {
                            var30 = var23 + arg9 - var12;
                            var31 = arg8 + var11 - (var22 - 8);
                        } else if (arg0 == 2) {
                            var30 = arg9 - (-(var11 - var22) - 8);
                            var31 = arg8 - (-(var12 - var23) - 8);
                        } else {
                            var31 = var22 + arg8 - var11;
                            var30 = arg9 + 8 - (-var12 + var23);
                        }
                        class51.method347(var30, var31, var18, 1, 0, arg3, arg1, true, var19 + var22, var20 - -var23);
                    } else {
                        int var24 = class299.method1971(var22 & 0x7, var23 & 0x7, arg0, 10643) + arg9;
                        int var25 = class226.method1539(arg0, var22 & 0x7, arg10 - 28147, var23 & 0x7) + arg8;
                        class51.method347(var24, var25, var18, 1, arg0, arg3, arg1, false, var19 + var22, var20 + var23);
                        if (var22 == 63 || var23 == 63) {
                            int var26 = var23 == 63 ? 64 : var23;
                            int var27 = var22 == 63 ? 64 : var22;
                            int var28;
                            int var29;
                            if (arg0 == 0) {
                                var28 = var26 + arg8 - var12;
                                var29 = arg9 + var27 - var11;
                            } else if (arg0 == 1) {
                                var28 = arg8 - (var27 - var11 - 8);
                                var29 = arg9 + var26 - var12;
                            } else if (arg0 == 2) {
                                var29 = var11 + arg9 + 8 - var27;
                                var28 = arg8 + var12 + 8 - var26;
                            } else {
                                var28 = arg8 + var27 - var11;
                                var29 = arg9 + (var12 - var26) + 8;
                            }
                            if (var29 >= 0 && var29 < 104 && var28 >= 0 && var28 < 104) {
                                client.field2034[var21][var29][var28] = client.field2034[var21][var24][var25];
                            }
                        }
                    }
                }
            }
        }
        boolean var32 = false;
        while (var18.field4716.length > var18.field4679) {
            int var33 = var18.method2043((byte) -110);
            if (var33 == 128) {
                class22.field276[0] = var18.method1994(false);
                class22.field276[1] = var18.method2042(7);
                class22.field276[2] = var18.method2042(7);
                class22.field276[3] = var18.method2042(7);
                class22.field276[4] = var18.method1994(false);
                var32 = true;
            } else {
                if (var33 != 129) {
                    var18.field4679--;
                    break;
                }
                for (int var34 = 0; var34 < 4; var34++) {
                    byte var35 = var18.method2001(-3);
                    if (var35 == 0) {
                        if (var34 <= arg7) {
                            int var43 = arg9;
                            if (arg9 < 0) {
                                var43 = 0;
                            } else if (arg9 >= 104) {
                                var43 = 104;
                            }
                            int var44 = arg9 + 7;
                            if (var44 < 0) {
                                var44 = 0;
                            } else if (var44 >= 104) {
                                var44 = 104;
                            }
                            int var45 = arg8;
                            int var46 = arg8 + 7;
                            if (var46 < 0) {
                                var46 = 0;
                            } else if (var46 >= 104) {
                                var46 = 104;
                            }
                            if (arg8 < 0) {
                                var45 = 0;
                            } else if (arg8 >= 104) {
                                var45 = 104;
                            }
                            while (var44 > var43) {
                                while (var45 < var46) {
                                    class265.field4096[arg1][var43][var45] = 0;
                                    var45++;
                                }
                                var43++;
                            }
                        }
                    } else if (var35 == 1) {
                        for (int var36 = 0; var36 < 64; var36 += 4) {
                            for (int var37 = 0; var37 < 64; var37 += 4) {
                                byte var38 = var18.method2001(-3);
                                if (var34 <= arg7) {
                                    for (int var39 = var36; var39 < (var36 + 4); var39++) {
                                        for (int var40 = var37; var40 < var37 + 4; var40++) {
                                            if (var39 >= var11 && var11 + 8 > var39 && var12 <= var40 && (var12 + 8) > var12) {
                                                int var41 = arg9 + class299.method1971(var39 & 0x7, var40 & 0x7, arg0, 10643);
                                                int var42 = class226.method1539(arg0, var39 & 0x7, 3, var40 & 0x7) + arg8;
                                                if (var41 >= 0 && var41 < 104 && var42 >= 0 && var42 < 104) {
                                                    class265.field4096[arg1][var41][var42] = var38;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var35 != 2) {
                    }
                }
            }
        }
        boolean var47 = false;
        if (class333.field5166 && !arg3) {
            class117 var48 = null;
            while (true) {
                while (var18.field4716.length > var18.field4679) {
                    int var49 = var18.method2043((byte) -118);
                    if (var49 == 0) {
                        var48 = new class117(var18);
                    } else if (var49 == 1) {
                        int var50 = var18.method2043((byte) -107);
                        if (var50 > 0) {
                            for (int var51 = 0; var51 < var50; var51++) {
                                class310 var52 = new class310(var18);
                                if (var52.field4894 == 31) {
                                    class221 var53 = class228.method1561(91, var18.method1994(false));
                                    var52.method2130(var53.field3514, var53.field3504, var53.field3511, var53.field3505, 11);
                                }
                                int var54 = var52.field4925 >> 7;
                                int var55 = var52.field4913 >> 7;
                                if (var52.field4915 == arg7 && var11 <= var54 && var54 < (var11 + 8) && var55 >= var12 && var55 < (var12 + 8)) {
                                    int var56 = (arg9 << 7) + class163.method1119(var52.field4925 & 0x3FF, arg10 ^ 0x6DF7, var52.field4913 & 0x3FF, arg0);
                                    int var57 = (arg8 << 7) + class38.method272(var52.field4925 & 0x3FF, arg0, 63, var52.field4913 & 0x3FF);
                                    var52.field4925 = var56;
                                    var52.field4913 = var57;
                                    int var58 = var52.field4925 >> 7;
                                    int var59 = var52.field4913 >> 7;
                                    if (var58 >= 0 && var59 >= 0 && var58 < 104 && var59 < 104) {
                                        var52.field4908 = (class305.field4784[1][var58][var59] & 0x2) != 0;
                                        var52.field4906 = client.field2034[var52.field4915][var58][var59] - var52.field4906;
                                        class147.method1038(var52);
                                    }
                                }
                            }
                        }
                    } else if (var49 == 2) {
                        if (var48 == null) {
                            var48 = new class117();
                        }
                        var48.method807(false, var18);
                    } else {
                        throw new IllegalStateException();
                    }
                }
                if (var48 == null) {
                    var48 = new class117();
                }
                class14.field144[arg9 >> 3][arg8 >> 3] = var48;
                break;
            }
        }
        if (!var47) {
            int var60 = arg8 + 7;
            int var61 = arg9 + 7;
            for (int var62 = arg9; var62 < var61; var62++) {
                for (int var63 = arg8; var63 < var60; var63++) {
                    class265.field4096[arg1][var62][var63] = 0;
                }
            }
        }
        return var32 ? class22.field276 : null;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "([Ljava/lang/String;B)[Ljava/lang/String;", line = 545)
    public static final String[] method1876(String[] arg0, byte arg1) {
        if (arg1 <= 113) {
            field4405 = (class8) null;
        }
        field4408++;
        String[] var2 = new String[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = var2[var3] + arg0[var3];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)V", line = 571)
    public static final void method1877(byte arg0) {
        class161.field2496.method1553(-27930);
        field4404++;
        if (arg0 > -101) {
            field4407 = 120;
        }
        class51.field718.method1828(-5);
        class234.field3763.method1828(-5);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)V", line = 587)
    public static final void method1878(boolean arg0) {
        class268.method1779((byte) -56);
        field4412++;
        class197.method1330(119);
        class222.method1490(0);
        class312.method2142((byte) -115);
        class282.method1854(32079);
        if (!arg0) {
            return;
        }
        class237.method1619(122);
        class104.method703(-111);
        class235.method1607(56);
        class3.method19((byte) 90);
        class72.method518((byte) 109);
        class68.method488(-21441);
        class323.method2184(0);
        class275.method1808(arg0);
        class105.method717(-4);
        class77.method540(-6910);
        class124.method841((byte) -44);
        class151.method1060((byte) 124);
        class96.method663(-1);
        class44.method312(513113996);
        class96.method660(74);
        class166.field2555.method1296(255);
        class68.field1023.method1296(255);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V", line = 621)
    public static final void method1879(int arg0) {
        field4415++;
        class4.field54 = arg0;
        class142.field2248 = 0;
        class318.method2164(true);
        class204.method1370(2);
        class236.method1613((byte) 26);
        class122.method832((byte) 14);
        for (int var1 = 0; var1 < class4.field54; var1++) {
            int var2 = class101.field1572[var1];
            if (class343.field5341 != class64.field966[var2].field527) {
                if (class64.field966[var2].field1248 > 0) {
                    class262.method1741(-65, class64.field966[var2]);
                }
                class64.field966[var2] = null;
            }
        }
        if (class85.field1284 != class230.field3713.field4679) {
            throw new RuntimeException("gpp1 pos:" + class230.field3713.field4679 + " psize:" + class85.field1284);
        }
        for (int var3 = 0; var3 < class175.field2678; var3++) {
            if (class64.field966[class174.field2645[var3]] == null) {
                throw new RuntimeException("gpp2 pos:" + var3 + " size:" + class175.field2678);
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(B)V", line = 671)
    public static void method1880(byte arg0) {
        field4409 = null;
        field4405 = null;
        if (arg0 >= -27) {
            field4405 = (class8) null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)V", line = 687)
    public static final void method1881(int arg0) {
        try {
            Method var1 = Runtime.class.getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class109.field1676 = (int) (var3 / 1048576L) + 1;
                } catch (Throwable var6) {
                }
            }
        } catch (Exception var7) {
        }
        if (arg0 != 1) {
            field4407 = -67;
        }
        field4410++;
    }
}
