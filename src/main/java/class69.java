import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class69 extends class332 {

    @OriginalMember(owner = "client!bk", name = "m", descriptor = "I")
    public int field902;

    @OriginalMember(owner = "client!bk", name = "o", descriptor = "I")
    public int field904;

    @OriginalMember(owner = "client!bk", name = "k", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!bk", name = "n", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!bk", name = "j", descriptor = "Lgg;")
    public static class79 field899;

    @OriginalMember(owner = "client!bk", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field901;

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(I)V", line = 5)
    public static void method428(int arg0) {
        if (arg0 != 7) {
            field899 = (class79) null;
        }
        field899 = null;
        field901 = null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V", line = 16)
    public static final void method429(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class62.field788 * 128) {
            arg0 = class62.field788 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class326.field4993 * 128) {
            arg2 = class326.field4993 * 128 - 1;
        }
        class15.field217 = class215.field3024[arg3];
        class300.field4683 = class215.field3017[arg3];
        class127.field1736 = class215.field3024[arg4];
        class21.field272 = class215.field3017[arg4];
        class330.field5053 = arg0;
        class329.field5024 = arg1;
        class165.field2287 = arg2;
        class49.field610 = arg0 / 128;
        class242.field3645 = arg2 / 128;
        class222.field3136 = class49.field610 - class342.field5302;
        if (class222.field3136 < 0) {
            class222.field3136 = 0;
        }
        class19.field256 = class242.field3645 - class342.field5302;
        if (class19.field256 < 0) {
            class19.field256 = 0;
        }
        class237.field3485 = class49.field610 + class342.field5302;
        if (class237.field3485 > class62.field788) {
            class237.field3485 = class62.field788;
        }
        class228.field3278 = class342.field5302 + class242.field3645;
        if (class228.field3278 > class326.field4993) {
            class228.field3278 = class326.field4993;
        }
        short var15;
        if (class250.field3787) {
            var15 = 3584;
        } else {
            var15 = 3500;
        }
        for (int var16 = 0; var16 < class342.field5302 + class342.field5302 + 2; var16++) {
            for (int var17 = 0; var17 < class342.field5302 + class342.field5302 + 2; var17++) {
                int var18 = (var16 - class342.field5302 << 7) - (class330.field5053 & 0x7F);
                int var19 = (var17 - class342.field5302 << 7) - (class165.field2287 & 0x7F);
                int var20 = class49.field610 + var16 - class342.field5302;
                int var21 = class242.field3645 + var17 - class342.field5302;
                if (var20 >= 0 && var21 >= 0 && var20 < class62.field788 && var21 < class326.field4993) {
                    int var22;
                    if (class99.field1291 == null) {
                        var22 = class74.field957[0][var20][var21] + 128 - class329.field5024;
                    } else {
                        var22 = class99.field1291[0][var20][var21] + 128 - class329.field5024;
                    }
                    int var23 = class74.field957[3][var20][var21] - class329.field5024 - 1000;
                    client.field4232[var16][var17] = class253.method1839(var18, var23, var22, var19, var15);
                } else {
                    client.field4232[var16][var17] = false;
                }
            }
        }
        for (int var24 = 0; var24 < class342.field5302 + class342.field5302 + 1; var24++) {
            for (int var25 = 0; var25 < class342.field5302 + class342.field5302 + 1; var25++) {
                class218.field3067[var24][var25] = client.field4232[var24][var25] || client.field4232[var24 + 1][var25] || client.field4232[var24][var25 + 1] || client.field4232[var24 + 1][var25 + 1];
            }
        }
        class195.field2798 = arg6;
        class342.field5301 = arg7;
        class267.field4205 = arg8;
        class292.field4578 = arg9;
        class206.field2888 = arg10;
        class220.method1509();
        if (class150.field2081 != null) {
            class325.method2255(true);
            class157.method1044(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            if (class250.field3787) {
                class211.field2978 = false;
                class262.method1886(0, 3, 0);
                class64.method405((float[]) null);
                class193.method1344();
            }
            class325.method2255(false);
        }
        class157.method1044(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;", line = 146)
    public static final String method430(boolean arg0, String arg1) {
        if (arg0) {
            method431(-83, (byte[]) null, (class22[]) null, 113, 123, 87, 42, -123, -61, false, -93);
        }
        field903++;
        String var2 = class248.method1783(class48.method285((byte) -90, arg1), 0);
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I[B[Lhm;IIIIIIZI)[I", line = 164)
    public static final int[] method431(int arg0, byte[] arg1, class22[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        int var11 = (arg4 & 0x7) * 8;
        field900++;
        int var12 = (arg7 & 0x7) * 8;
        byte var13;
        if (arg9) {
            var13 = 1;
        } else {
            var13 = 4;
        }
        if (!arg9) {
            for (int var14 = 0; var14 < 8; var14++) {
                for (int var15 = 0; var15 < 8; var15++) {
                    int var16 = arg10 + class163.method1070(var15 & 0x7, arg8, -15, var14 & 0x7);
                    int var17 = class121.method822(7, arg8, var14 & 0x7, var15 & 0x7) + arg3;
                    if (var16 > 0 && var16 < 103 && var17 > 0 && var17 < 103) {
                        arg2[arg5].field282[var16][var17] = class229.method1613(arg2[arg5].field282[var16][var17], -2097153);
                    }
                }
            }
        }
        int var18 = arg4 & 0x1FFFFFF8 << 3;
        class107 var19 = new class107(arg1);
        int var20 = arg7 & 0x1FFFFFF8 << 3;
        byte var21 = 0;
        byte var22 = 0;
        if (arg8 == 1) {
            var22 = 1;
        } else if (arg8 == 2) {
            var21 = 1;
            var22 = 1;
        } else if (arg8 == 3) {
            var21 = 1;
        }
        for (int var23 = 0; var23 < var13; var23++) {
            for (int var24 = 0; var24 < 64; var24++) {
                for (int var25 = 0; var25 < 64; var25++) {
                    if (arg0 != var23 || var11 > var24 || var24 > (var11 + 8) || var25 < var12 || var12 + 8 < var25) {
                        class157.method1042(-124, 0, 0, -1, arg9, var19, 0, false, -1, 0, 0, 0);
                    } else if ((var11 + 8) == var24 || var12 + 8 == var25) {
                        int var32;
                        int var33;
                        if (arg8 == 0) {
                            var32 = var25 + arg3 - var12;
                            var33 = arg10 + var24 - var11;
                        } else if (arg8 == 1) {
                            var32 = var11 + arg3 + 8 - var24;
                            var33 = var25 + arg10 - var12;
                        } else if (arg8 == 2) {
                            var33 = var11 + (arg10 - -8) - var24;
                            var32 = var12 + arg3 + 8 - var25;
                        } else {
                            var33 = var12 + 8 - (var25 - arg10);
                            var32 = arg3 + var24 - var11;
                        }
                        class157.method1042(-31, arg5, 0, var32, arg9, var19, 0, true, var33, 0, var20 + var25, var18 + var24);
                    } else {
                        int var26 = class163.method1070(var25 & 0x7, arg8, -30, var24 & 0x7) + arg10;
                        int var27 = class121.method822(7, arg8, var24 & 0x7, var25 & 0x7) + arg3;
                        class157.method1042(-114, arg5, var21, var27, arg9, var19, arg8, false, var26, var22, var20 + var25, var18 + var24);
                        if (var24 == 63 || var25 == 63) {
                            int var28 = var24 == 63 ? 64 : var24;
                            int var29 = var25 == 63 ? 64 : var25;
                            int var30;
                            int var31;
                            if (arg8 == 0) {
                                var31 = var29 + arg3 - var12;
                                var30 = var28 - (var11 - arg10);
                            } else if (arg8 == 1) {
                                var31 = var11 + arg3 + 8 - var28;
                                var30 = var29 + arg10 - var12;
                            } else if (arg8 == 2) {
                                var31 = arg3 + var12 + 8 - var29;
                                var30 = arg10 + var11 + 8 - var28;
                            } else {
                                var30 = arg10 + var12 + 8 - var29;
                                var31 = arg3 + var28 - var11;
                            }
                            if (var30 >= 0 && var30 < 104 && var31 >= 0 && var31 < 104) {
                                class167.field2324[arg5][var30][var31] = class167.field2324[arg5][var21 + var26][var22 + var27];
                            }
                        }
                    }
                }
            }
        }
        if (arg6 > -20) {
            field901 = (String[]) null;
        }
        boolean var34 = false;
        boolean var35 = false;
        while (var19.field1400 < var19.field1388.length) {
            int var36 = var19.method661(-1);
            if (var36 == 128) {
                var34 = true;
                class73.field930[0] = var19.method624(14612);
                class73.field930[1] = var19.method656(-66);
                class73.field930[2] = var19.method656(124);
                class73.field930[3] = var19.method656(120);
                class73.field930[4] = var19.method624(14612);
            } else {
                if (var36 != 129) {
                    var19.field1400--;
                    break;
                }
                for (int var37 = 0; var37 < 4; var37++) {
                    byte var38 = var19.method679(-3);
                    if (var38 == 0) {
                        if (arg0 >= var37) {
                            int var39 = arg10;
                            if (arg10 < 0) {
                                var39 = 0;
                            } else if (arg10 >= 104) {
                                var39 = 104;
                            }
                            int var40 = arg10 + 7;
                            int var41 = arg3;
                            if (var40 < 0) {
                                var40 = 0;
                            } else if (var40 >= 104) {
                                var40 = 104;
                            }
                            int var42 = arg3 + 7;
                            if (arg3 < 0) {
                                var41 = 0;
                            } else if (arg3 >= 104) {
                                var41 = 104;
                            }
                            if (var42 < 0) {
                                var42 = 0;
                            } else if (var42 >= 104) {
                                var42 = 104;
                            }
                            while (var39 < var40) {
                                while (var42 > var41) {
                                    class148.field2053[arg5][var39][var41] = 0;
                                    var41++;
                                }
                                var39++;
                            }
                        }
                    } else if (var38 == 1) {
                        for (int var43 = 0; var43 < 64; var43 += 4) {
                            for (int var44 = 0; var44 < 64; var44 += 4) {
                                byte var45 = var19.method679(-3);
                                if (arg0 >= var37) {
                                    for (int var46 = var43; var46 < var43 + 4; var46++) {
                                        for (int var47 = var44; var47 < (var44 + 4); var47++) {
                                            if (var46 >= var11 && (var11 + 8) > var46 && var47 >= var12 && (var12 + 8) > var12) {
                                                int var48 = arg10 + class163.method1070(var47 & 0x7, arg8, -48, var46 & 0x7);
                                                int var49 = class121.method822(7, arg8, var46 & 0x7, var47 & 0x7) + arg3;
                                                if (var48 >= 0 && var48 < 104 && var49 >= 0 && var49 < 104) {
                                                    class148.field2053[arg5][var48][var49] = var45;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var38 != 2) {
                    }
                }
            }
        }
        if (class250.field3787 && !arg9) {
            class222 var50 = null;
            while (true) {
                while (var19.field1388.length > var19.field1400) {
                    int var51 = var19.method661(-1);
                    if (var51 == 0) {
                        var50 = new class222(var19);
                    } else if (var51 == 1) {
                        int var52 = var19.method661(-1);
                        if (var52 > 0) {
                            for (int var53 = 0; var53 < var52; var53++) {
                                class62 var54 = new class62(var19);
                                if (var54.field765 == 31) {
                                    class139 var55 = client.method1944(var19.method624(14612), 31);
                                    var54.method364(var55.field1947, (byte) -116, var55.field1941, var55.field1950, var55.field1949);
                                }
                                int var56 = var54.field764 >> 7;
                                int var57 = var54.field759 >> 7;
                                if (var54.field773 == arg0 && var11 <= var57 && var57 < var11 + 8 && var56 >= var12 && var56 < var12 + 8) {
                                    int var58 = class249.method1790(arg8, var54.field764 & 0x3FF, var54.field759 & 0x3FF, 100) + (arg10 << 7);
                                    int var59 = (arg3 << 7) + class211.method1447(3146, var54.field759 & 0x3FF, var54.field764 & 0x3FF, arg8);
                                    var54.field764 = var59;
                                    int var60 = var54.field764 >> 7;
                                    var54.field759 = var58;
                                    int var61 = var54.field759 >> 7;
                                    if (var61 >= 0 && var60 >= 0 && var61 < 104 && var60 < 104) {
                                        var54.field784 = (class264.field4163[1][var61][var60] & 0x2) != 0;
                                        var54.field758 = class167.field2324[var54.field773][var61][var60] - var54.field758;
                                        class193.method1341(var54);
                                    }
                                }
                            }
                        }
                    } else if (var51 == 2) {
                        if (var50 == null) {
                            var50 = new class222();
                        }
                        var50.method1528((byte) -78, var19);
                    } else {
                        throw new IllegalStateException();
                    }
                }
                if (var50 == null) {
                    var50 = new class222();
                }
                class295.field4611[arg10 >> 3][arg3 >> 3] = var50;
                break;
            }
        }
        if (!var35) {
            int var62 = arg10 + 7;
            int var63 = arg3 + 7;
            for (int var64 = arg10; var64 < var62; var64++) {
                for (int var65 = arg3; var65 < var63; var65++) {
                    class148.field2053[arg5][var64][var65] = 0;
                }
            }
        }
        return var34 ? class73.field930 : null;
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(II)V", line = 623)
    public class69(int arg0, int arg1) {
        this.field902 = arg0;
        this.field904 = arg1;
    }
}
