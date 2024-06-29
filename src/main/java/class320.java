import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class320 {

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "Lhq;")
    public static class365 field4295 = new class365(4);

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "I")
    public static int field4294;

    @OriginalMember(owner = "client!jq", name = "c", descriptor = "I")
    public static int field4296;

    @OriginalMember(owner = "client!jq", name = "d", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!jq", name = "e", descriptor = "I")
    public static int field4298;

    @OriginalMember(owner = "client!jq", name = "f", descriptor = "I")
    public static int field4299;

    @OriginalMember(owner = "client!jq", name = "g", descriptor = "I")
    public static int field4300;

    @OriginalMember(owner = "client!jq", name = "h", descriptor = "Lwo;")
    public static class285 field4301;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIIIIZII)V")
    public static final void method1996(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        if (arg5) {
            field4294 = -111;
        }
        class319.method1995(arg2, arg7, arg4, arg6, arg1, arg3, 0, arg0, (byte) -84);
        field4298++;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(II)Lrd;")
    public static final class295 method1997(int arg0, int arg1) {
        field4297++;
        class295 var2 = (class295) class387.field5287.method2295((long) arg0, (byte) 74);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class310.field4201.method1794(5860, 0, arg0);
        class295 var4 = new class295();
        if (var3 != null) {
            var4.method1876((byte) 73, new class242(var3));
        }
        int var5 = 24 / ((arg1 - 22) / 39);
        var4.method1877(false);
        class387.field5287.method2294(var4, (byte) 31, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(ILtf;)V")
    public static final void method1998(int arg0, class452 arg1) {
        field4299++;
        arg1.field6313 = false;
        if (arg1.field6310 != null) {
            arg1.field6310.field2142 = 0;
        }
        if (arg0 > -105) {
            method1998(101, (class452) null);
        }
        for (class452 var2 = arg1.method114(); var2 != null; var2 = arg1.method109()) {
            method1998(-109, var2);
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(IB)V")
    public static final void method1999(int arg0, byte arg1) {
        if (arg1 <= 41) {
            method1998(96, (class452) null);
        }
        field4300++;
        if (class192.method1185(-3201, arg0)) {
            class148.method956(class362.field4903[arg0], 3610, -1);
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "([BI[Lg;IIIZILuo;III)[I")
    public static final int[] method2000(byte[] arg0, int arg1, class366[] arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, class118 arg8, int arg9, int arg10, int arg11) {
        field4296++;
        int var12 = (arg4 & 0x7) * 8;
        int var13 = (arg7 & 0x7) * 8;
        byte var14;
        if (arg6) {
            var14 = 1;
        } else {
            var14 = 4;
        }
        if (!arg6) {
            class366 var15 = arg2[arg5];
            for (int var16 = 0; var16 < 8; var16++) {
                for (int var17 = 0; var17 < 8; var17++) {
                    int var18 = class438.method2678(var16 & 0x7, arg10, var17 & 0x7, 7) + arg1;
                    int var19 = arg11 + class369.method2326(var17 & 0x7, var16 & 0x7, 0, arg10);
                    if (var18 > 0 && class22.field232 - 1 > var18 && var19 > 0 && var19 < (class196.field2329 - 1)) {
                        var15.method2314(var18, var19, (byte) -54);
                    }
                }
            }
        }
        class242 var20 = new class242(arg0);
        int var21 = arg4 & 0x1FFFFFF8 << 3;
        int var22 = (arg7 & 0xFFFFFFF8) << 3;
        byte var23 = 0;
        byte var24 = 0;
        if (arg10 == 1) {
            var24 = 1;
        } else if (arg10 == 2) {
            var23 = 1;
            var24 = 1;
        } else if (arg10 == 3) {
            var23 = 1;
        }
        for (int var25 = 0; var25 < var14; var25++) {
            for (int var58 = 0; var58 < 64; var58++) {
                for (int var59 = 0; var59 < 64; var59++) {
                    if (arg3 != var25 || var58 < var12 || (var12 + 8) < var58 || var59 < var13 || var59 > (var13 + 8)) {
                        class96.method594(0, -1, arg6, 0, false, 0, 0, var20, 0, -1, (byte) 0, 0);
                    } else if (var12 + 8 == var58 || var13 + 8 == var59) {
                        int var66;
                        int var67;
                        if (arg10 == 0) {
                            var67 = arg1 + var58 - var12;
                            var66 = var59 + arg11 - var13;
                        } else if (arg10 == 1) {
                            var66 = arg11 + 8 - (var58 - var12);
                            var67 = var59 - (var13 - arg1);
                        } else if (arg10 == 2) {
                            var67 = var12 + arg1 + 8 - var58;
                            var66 = var13 + arg11 + 8 - var59;
                        } else {
                            var67 = arg1 + var13 + 8 - var59;
                            var66 = arg11 + var58 - var12;
                        }
                        class96.method594(0, var67, arg6, arg5, true, var21 + var58, 0, var20, var22 + var59, var66, (byte) 0, 0);
                    } else {
                        int var60 = class438.method2678(var58 & 0x7, arg10, var59 & 0x7, 7) + arg1;
                        int var61 = arg11 + class369.method2326(var59 & 0x7, var58 & 0x7, 0, arg10);
                        class96.method594(arg10, var60, arg6, arg5, false, var21 + var58, var24, var20, var22 + var59, var61, (byte) 0, var23);
                        if (var58 == 63 || var59 == 63) {
                            int var62 = var58 == 63 ? 64 : var58;
                            int var63 = var59 == 63 ? 64 : var59;
                            int var64;
                            int var65;
                            if (arg10 == 0) {
                                var65 = arg1 - (var12 - var62);
                                var64 = arg11 + var63 - var13;
                            } else if (arg10 == 1) {
                                var65 = arg1 + var63 - var13;
                                var64 = arg11 - (var62 - var12 - 8);
                            } else if (arg10 == 2) {
                                var64 = arg11 - var63 - (-var13 - 8);
                                var65 = var12 + arg1 + 8 - var62;
                            } else {
                                var64 = arg11 + var62 - var12;
                                var65 = arg1 + var13 + 8 - var63;
                            }
                            if (var65 >= 0 && var65 < class22.field232 && var64 >= 0 && class196.field2329 > var64) {
                                class226.field2868[arg5][var65][var64] = class226.field2868[arg5][var23 + var60][var24 + var61];
                            }
                        }
                    }
                }
            }
        }
        if (arg9 > -43) {
            field4295 = null;
        }
        boolean var26 = false;
        while (var20.field3211 < var20.field3188.length) {
            int var27 = var20.method1563(-128);
            if (var27 == 128) {
                class202.field2379[0] = var20.method1587((byte) -102);
                class202.field2379[1] = var20.method1582(false);
                class202.field2379[2] = var20.method1582(false);
                class202.field2379[3] = var20.method1582(false);
                var26 = true;
                class202.field2379[4] = var20.method1587((byte) -102);
            } else {
                if (var27 != 129) {
                    var20.field3211--;
                    break;
                }
                if (class284.field3710 == null) {
                    class284.field3710 = new byte[4][][];
                }
                for (int var45 = 0; var45 < 4; var45++) {
                    byte var46 = var20.method1589(false);
                    if (var46 == 0 && class284.field3710[arg5] != null) {
                        if (arg3 >= var45) {
                            int var47 = arg1;
                            int var48 = arg1 + 7;
                            int var49 = arg11;
                            if (arg11 < 0) {
                                var49 = 0;
                            } else if (class196.field2329 <= arg11) {
                                var49 = class196.field2329;
                            }
                            if (arg1 < 0) {
                                var47 = 0;
                            } else if (arg1 >= class22.field232) {
                                var47 = class22.field232;
                            }
                            int var50 = arg11 + 7;
                            if (var48 < 0) {
                                var48 = 0;
                            } else if (var48 >= class22.field232) {
                                var48 = class22.field232;
                            }
                            if (var50 < 0) {
                                var50 = 0;
                            } else if (class196.field2329 <= var50) {
                                var50 = class196.field2329;
                            }
                            while (var47 < var48) {
                                while (var50 > var49) {
                                    class284.field3710[arg5][var47][var49] = 0;
                                    var49++;
                                }
                                var47++;
                            }
                        }
                    } else if (var46 == 1) {
                        if (class284.field3710[arg5] == null) {
                            class284.field3710[arg5] = new byte[class22.field232 + 1][class196.field2329 + 1];
                        }
                        for (int var51 = 0; var51 < 64; var51 += 4) {
                            for (int var52 = 0; var52 < 64; var52 += 4) {
                                byte var53 = var20.method1589(false);
                                if (var45 <= arg3) {
                                    for (int var54 = var51; var54 < var51 + 4; var54++) {
                                        for (int var55 = var52; var55 < var52 + 4; var55++) {
                                            if (var54 >= var12 && (var12 + 8) > var54 && var55 >= var13 && var13 + 8 > var13) {
                                                int var56 = arg1 + class438.method2678(var54 & 0x7, arg10, var55 & 0x7, 7);
                                                int var57 = class369.method2326(var55 & 0x7, var54 & 0x7, 0, arg10) + arg11;
                                                if (var56 >= 0 && class22.field232 > var56 && var57 >= 0 && class196.field2329 > var57) {
                                                    class284.field3710[arg5][var56][var57] = var53;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var28 = false;
        if (!arg6) {
            class342 var29 = null;
            while (true) {
                while (var20.field3188.length > var20.field3211) {
                    int var30 = var20.method1563(-128);
                    if (var30 == 0) {
                        var29 = new class342(var20);
                    } else if (var30 == 1) {
                        int var31 = var20.method1563(-128);
                        if (var31 > 0) {
                            for (int var32 = 0; var32 < var31; var32++) {
                                class6 var33 = new class6(var20);
                                if (var33.field47 == 31) {
                                    class276 var34 = class451.method2795(var20.method1587((byte) -102), (byte) -31);
                                    var33.method27(var34.field3572, var34.field3577, var34.field3576, var34.field3569, -101);
                                }
                                int var35 = var33.field1073 >> 7;
                                int var36 = var33.field1071 >> 7;
                                if (var33.field52 == arg3 && var12 <= var35 && (var12 + 8) > var35 && var36 >= var13 && (var13 + 8) > var36) {
                                    int var37 = class376.method2344(var33.field1073 & 0x3FF, arg10, var33.field1071 & 0x3FF, 4770) + (arg1 << 7);
                                    int var38 = (arg11 << 7) + class350.method2231(var33.field1073 & 0x3FF, arg10, (byte) -79, var33.field1071 & 0x3FF);
                                    var33.field1073 = var37;
                                    var33.field1071 = var38;
                                    int var39 = var33.field1073 >> 7;
                                    int var40 = var33.field1071 >> 7;
                                    if (var39 >= 0 && var40 >= 0 && var39 < class22.field232 && var40 < class196.field2329) {
                                        var33.field1072 = class226.field2868[arg3][var39][var40] - var33.field1072;
                                        if (arg8.method788() > 0) {
                                            class269.method1686(var33);
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var30 == 2) {
                        if (var29 == null) {
                            var29 = new class342();
                        }
                        var29.method2186(8, var20);
                    } else {
                        throw new IllegalStateException();
                    }
                }
                if (var29 != null) {
                    class118.method780(arg11 >> 3, arg1 >> 3, var29, 0);
                }
                break;
            }
        }
        if (!var28 && class284.field3710 != null && class284.field3710[arg5] != null) {
            int var41 = arg1 + 7;
            int var42 = arg11 + 7;
            for (int var43 = arg1; var43 < var41; var43++) {
                for (int var44 = arg11; var44 < var42; var44++) {
                    class284.field3710[arg5][var43][var44] = 0;
                }
            }
        }
        if (var26) {
            return class202.field2379;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(B)V")
    public static void method2001(byte arg0) {
        field4295 = null;
        if (arg0 > -16) {
            method1999(-105, (byte) 30);
        }
        field4301 = null;
    }
}
