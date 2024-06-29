import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class103 {

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "J")
    public long field1602 = 0L;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "[I")
    public static int[] field1594 = new int[50];

    @OriginalMember(owner = "client!vj", name = "o", descriptor = "[I")
    public static int[] field1606 = new int[2048];

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "I")
    public static int field1592;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "I")
    public int field1595;

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "I")
    public int field1601;

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "I")
    public int field1604;

    @OriginalMember(owner = "client!vj", name = "n", descriptor = "I")
    public int field1605;

    @OriginalMember(owner = "client!vj", name = "p", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!vj", name = "q", descriptor = "I")
    public int field1608;

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "Lwb;")
    public class253 field1598;

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "Lwb;")
    public class253 field1600;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V", line = 4)
    public static final void method744(int arg0) {
        field1592++;
        class219.field3337.method2176((byte) -27);
        if (arg0 != 8) {
            field1596 = -1;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIII)V", line = 29)
    public static final void method745(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = -53 / ((arg0 + 18) / 34);
        field1593++;
        if (arg2 > arg1) {
            class272.method1876(class34.field525[arg3], arg2, arg1, arg4, (byte) -20);
        } else {
            class272.method1876(class34.field525[arg3], arg1, arg2, arg4, (byte) -77);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)V", line = 49)
    public static final void method746(byte arg0) {
        field1603++;
        if (arg0 != -104) {
            method744(32);
        }
        class321.field5014.method2174(-10385);
        class149.field2261.method2174(-10385);
        class229.field3639.method2174(-10385);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 66)
    public static final void method747(int arg0, String arg1, int arg2) {
        field1607++;
        class338 var3 = class195.method1391(arg0, (byte) -92, arg2);
        var3.method2352((byte) 125);
        var3.field5293 = arg1;
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(B)V", line = 77)
    public static final void method748(byte arg0) {
        field1599++;
        if (class233.field3705 == 0) {
            return;
        }
        try {
            if ((++class186.field2779) > 2000) {
                if (class295.field4568 != null) {
                    class295.field4568.method365(1);
                    class295.field4568 = null;
                }
                if (class37.field558 >= 1) {
                    class202.field3033 = -5;
                    class233.field3705 = 0;
                    return;
                }
                class186.field2779 = 0;
                class233.field3705 = 1;
                if (class25.field393 == field1596) {
                    field1596 = class258.field4044;
                } else {
                    field1596 = class25.field393;
                }
                class37.field558++;
            }
            if (arg0 < 86) {
                return;
            }
            if (class233.field3705 == 1) {
                class341.field5324 = class32.field471.method1286(field1596, class227.field3602, -104);
                class233.field3705 = 2;
            }
            if (class233.field3705 == 2) {
                if (class341.field5324.field2956 == 2) {
                    throw new IOException();
                }
                if (class341.field5324.field2956 != 1) {
                    return;
                }
                class295.field4568 = new class43((Socket) class341.field5324.field2959, class32.field471);
                class341.field5324 = null;
                class295.field4568.method370(1, class106.field1642.field2500, 0, class106.field1642.field2532);
                if (class315.field4917 != null) {
                    class315.field4917.method220(1);
                }
                if (class17.field243 != null) {
                    class17.field243.method220(1);
                }
                int var1 = class295.field4568.method373(-103);
                if (class315.field4917 != null) {
                    class315.field4917.method220(1);
                }
                if (class17.field243 != null) {
                    class17.field243.method220(1);
                }
                if (var1 != 21) {
                    class202.field3033 = var1;
                    class233.field3705 = 0;
                    class295.field4568.method365(1);
                    class295.field4568 = null;
                    return;
                }
                class233.field3705 = 3;
            }
            if (class233.field3705 == 3) {
                if (class295.field4568.method366(112) < 1) {
                    return;
                }
                class251.field3958 = new String[class295.field4568.method373(-101)];
                class233.field3705 = 4;
            }
            if (class233.field3705 == 4) {
                if (class295.field4568.method366(21) < class251.field3958.length * 8) {
                    return;
                }
                class10.field132.field2532 = 0;
                class295.field4568.method367((byte) 120, class251.field3958.length * 8, 0, class10.field132.field2500);
                for (int var2 = 0; var2 < class251.field3958.length; var2++) {
                    class251.field3958[var2] = class53.method444(1, class10.field132.method1165(0));
                }
                class202.field3033 = 21;
                class233.field3705 = 0;
                class295.field4568.method365(1);
                class295.field4568 = null;
                return;
            }
        } catch (IOException var4) {
            if (class295.field4568 != null) {
                class295.field4568.method365(1);
                class295.field4568 = null;
            }
            if (class37.field558 >= 1) {
                class202.field3033 = -4;
                class233.field3705 = 0;
            } else {
                class186.field2779 = 0;
                if (class25.field393 == field1596) {
                    field1596 = class258.field4044;
                } else {
                    field1596 = class25.field393;
                }
                class37.field558++;
                class233.field3705 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(I)V", line = 232)
    public static void method749(int arg0) {
        if (arg0 != -10082) {
            field1596 = -94;
        }
        field1594 = null;
        field1606 = null;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZIIIII[Lvg;II[BI)[I", line = 245)
    public static final int[] method750(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class303[] arg6, int arg7, int arg8, byte[] arg9, int arg10) {
        field1597++;
        int var11 = (arg10 & 0x7) * 8;
        if (!arg0) {
            for (int var12 = 0; var12 < 8; var12++) {
                for (int var13 = 0; var13 < 8; var13++) {
                    int var14 = arg1 + class327.method2222(arg8, var12 & 0x7, (byte) -68, var13 & 0x7);
                    int var15 = class223.method1584(0, var12 & 0x7, var13 & 0x7, arg8) + arg5;
                    if (var14 > 0 && var14 < 103 && var15 > 0 && var15 < 103) {
                        arg6[arg2].field4732[var14][var15] = class270.method1860(arg6[arg2].field4732[var14][var15], -2097153);
                    }
                }
            }
        }
        int var16 = (arg4 & 0x7) * 8;
        int var17 = arg10 & 0x1FFFFFF8 << 3;
        class166 var18 = new class166(arg9);
        byte var19;
        if (arg0) {
            var19 = 1;
        } else {
            var19 = 4;
        }
        int var20 = (arg4 & 0xFFFFFFF8) << 3;
        if (arg3 != 1936126115) {
            field1596 = -23;
        }
        for (int var21 = 0; var21 < var19; var21++) {
            for (int var22 = 0; var22 < 64; var22++) {
                for (int var23 = 0; var23 < 64; var23++) {
                    if (arg7 != var21 || var22 < var11 || var22 > var11 + 8 || var23 < var16 || var23 > (var16 + 8)) {
                        class19.method148(var18, false, 0, 0, -1, 0, 0, 0, -1, arg0);
                    } else if ((var11 + 8) == var22 || (var16 + 8) == var23) {
                        int var30;
                        int var31;
                        if (arg8 == 0) {
                            var30 = var22 + arg1 - var11;
                            var31 = arg5 + var23 - var16;
                        } else if (arg8 == 1) {
                            var31 = arg5 + var11 + 8 - var22;
                            var30 = arg1 + var23 - var16;
                        } else if (arg8 == 2) {
                            var30 = var11 - (var22 - (arg1 + 8));
                            var31 = arg5 + var16 + 8 - var23;
                        } else {
                            var31 = arg5 + var22 - var11;
                            var30 = arg1 + var16 + 8 - var23;
                        }
                        class19.method148(var18, true, var17 + var22, var20 + var23, var31, 0, arg2, arg3 - 1936126115, var30, arg0);
                    } else {
                        int var24 = arg1 + class327.method2222(arg8, var22 & 0x7, (byte) -111, var23 & 0x7);
                        int var25 = class223.method1584(0, var22 & 0x7, var23 & 0x7, arg8) + arg5;
                        class19.method148(var18, false, var17 + var22, var20 + var23, var25, arg8, arg2, arg3 ^ 0x7366F0A3, var24, arg0);
                        if (var22 == 63 || var23 == 63) {
                            int var26 = var22 == 63 ? 64 : var22;
                            int var27 = var23 == 63 ? 64 : var23;
                            int var28;
                            int var29;
                            if (arg8 == 0) {
                                var28 = arg1 + var26 - var11;
                                var29 = arg5 + var27 - var16;
                            } else if (arg8 == 1) {
                                var29 = arg5 + 8 - (-var11 + var26);
                                var28 = arg1 + var27 - var16;
                            } else if (arg8 == 2) {
                                var28 = var11 + arg1 + 8 - var26;
                                var29 = var16 + arg5 + 8 - var27;
                            } else {
                                var28 = var16 + arg1 + 8 - var27;
                                var29 = var26 + arg5 - var11;
                            }
                            if (var28 >= 0 && var28 < 104 && var29 >= 0 && var29 < 104) {
                                class218.field3321[var21][var28][var29] = class218.field3321[var21][var24][var25];
                            }
                        }
                    }
                }
            }
        }
        boolean var32 = false;
        boolean var33 = false;
        while (var18.field2500.length > var18.field2532) {
            int var34 = var18.method1178(arg3 ^ 0x7366F0A3);
            if (var34 == 128) {
                class137.field2160[0] = var18.method1151(-67);
                var32 = true;
                class137.field2160[1] = var18.method1166(52);
                class137.field2160[2] = var18.method1166(52);
                class137.field2160[3] = var18.method1166(52);
                class137.field2160[4] = var18.method1151(-128);
            } else {
                if (var34 != 129) {
                    var18.field2532--;
                    break;
                }
                for (int var35 = 0; var35 < 4; var35++) {
                    byte var36 = var18.method1143(-118);
                    if (var36 == 0) {
                        if (var35 <= arg7) {
                            int var37 = arg1;
                            if (arg1 < 0) {
                                var37 = 0;
                            } else if (arg1 >= 104) {
                                var37 = 104;
                            }
                            int var38 = arg5;
                            if (arg5 < 0) {
                                var38 = 0;
                            } else if (arg5 >= 104) {
                                var38 = 104;
                            }
                            int var39 = arg1 + 7;
                            int var40 = arg5 + 7;
                            if (var40 < 0) {
                                var40 = 0;
                            } else if (var40 >= 104) {
                                var40 = 104;
                            }
                            if (var39 < 0) {
                                var39 = 0;
                            } else if (var39 >= 104) {
                                var39 = 104;
                            }
                            while (var37 < var39) {
                                while (var38 < var40) {
                                    class143.field2220[arg2][var37][var38] = 0;
                                    var38++;
                                }
                                var37++;
                            }
                        }
                    } else if (var36 == 1) {
                        for (int var41 = 0; var41 < 64; var41 += 4) {
                            for (int var42 = 0; var42 < 64; var42 += 4) {
                                byte var43 = var18.method1143(75);
                                if (arg7 >= var35) {
                                    for (int var44 = var41; var44 < (var41 + 4); var44++) {
                                        for (int var45 = var42; var45 < var42 + 4; var45++) {
                                            if (var44 >= var11 && var44 < (var11 + 8) && var16 <= var45 && var16 + 8 > var16) {
                                                int var46 = arg1 + class327.method2222(arg8, var44 & 0x7, (byte) -82, var45 & 0x7);
                                                int var47 = class223.method1584(0, var44 & 0x7, var45 & 0x7, arg8) + arg5;
                                                if (var46 >= 0 && var46 < 104 && var47 >= 0 && var47 < 104) {
                                                    class143.field2220[arg2][var46][var47] = var43;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var36 == 2) {
                    }
                }
            }
        }
        if (class94.field1516 && !arg0) {
            class51 var48 = null;
            while (true) {
                while (var18.field2500.length > var18.field2532) {
                    int var49 = var18.method1178(0);
                    if (var49 == 0) {
                        var48 = new class51(var18);
                    } else if (var49 == 1) {
                        int var50 = var18.method1178(arg3 - 1936126115);
                        if (var50 > 0) {
                            for (int var51 = 0; var51 < var50; var51++) {
                                class204 var52 = new class204(var18);
                                if (var52.field3060 == 31) {
                                    class194 var53 = class11.method87(var18.method1151(-123), 56);
                                    var52.method1450(var53.field2893, var53.field2896, var53.field2892, (byte) -128, var53.field2894);
                                }
                                int var54 = var52.field3070 >> 7;
                                int var55 = var52.field3061 >> 7;
                                if (var52.field3078 == arg7 && var55 >= var11 && var55 < (var11 + 8) && var16 <= var54 && (var16 + 8) > var54) {
                                    int var56 = (arg1 << 7) + class327.method2223((byte) 42, arg8, var52.field3061 & 0x3FF, var52.field3070 & 0x3FF);
                                    int var57 = (arg5 << 7) + class300.method2052(var52.field3070 & 0x3FF, arg8, -1, var52.field3061 & 0x3FF);
                                    var52.field3061 = var56;
                                    var52.field3070 = var57;
                                    int var58 = var52.field3070 >> 7;
                                    int var59 = var52.field3061 >> 7;
                                    if (var59 >= 0 && var58 >= 0 && var59 < 104 && var58 < 104) {
                                        var52.field3063 = (class92.field1468[1][var59][var58] & 0x2) != 0;
                                        var52.field3051 = class218.field3321[var52.field3078][var59][var58] - var52.field3051;
                                        class183.method1306(var52);
                                    }
                                }
                            }
                        }
                    } else if (var49 == 2) {
                        if (var48 == null) {
                            var48 = new class51();
                        }
                        var48.method429((byte) 127, var18);
                    } else {
                        throw new IllegalStateException();
                    }
                }
                if (var48 == null) {
                    var48 = new class51();
                }
                class98.field1568[arg1 >> 3][arg5 >> 3] = var48;
                break;
            }
        }
        if (!var33) {
            int var60 = arg5 + 7;
            int var61 = arg1 + 7;
            for (int var62 = arg1; var62 < var61; var62++) {
                for (int var63 = arg5; var63 < var60; var63++) {
                    class143.field2220[arg2][var62][var63] = 0;
                }
            }
        }
        return var32 ? class137.field2160 : null;
    }
}
