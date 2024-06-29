import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class148 extends class128 {

    @OriginalMember(owner = "client!ch", name = "P", descriptor = "I")
    private int field2059;

    @OriginalMember(owner = "client!ch", name = "L", descriptor = "I")
    public static int field2055 = 0;

    @OriginalMember(owner = "client!ch", name = "O", descriptor = "Ljava/lang/String;")
    public static String field2058 = "Continue";

    @OriginalMember(owner = "client!ch", name = "R", descriptor = "[Ljava/lang/String;")
    public static String[] field2061 = new String[500];

    @OriginalMember(owner = "client!ch", name = "M", descriptor = "I")
    public static int field2056 = 0;

    @OriginalMember(owner = "client!ch", name = "H", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!ch", name = "I", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!ch", name = "K", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!ch", name = "N", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!ch", name = "S", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!ch", name = "Q", descriptor = "Llc;")
    public static class175 field2060;

    @OriginalMember(owner = "client!ch", name = "J", descriptor = "[[[B")
    public static byte[][][] field2053;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIIIIIIII)V", line = 5)
    public static final void method995(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = arg0 - arg6;
        if (class291.field4574 > arg0) {
            var11++;
        }
        field2054++;
        int var12 = arg2 - arg10;
        if (arg3 >= -121) {
            field2055 = -118;
        }
        if (class308.field4766 > arg2) {
            var12++;
        }
        int var10000;
        for (int var13 = 0; var13 < var11; var13++) {
            int var14 = (var13 + 1) * arg7 + arg9 >> 16;
            int var15 = arg7 * var13 + arg9 >> 16;
            int var16 = var14 - var15;
            if (var16 > 0) {
                int var17 = arg6 + var13 >> 6;
                if (var17 >= 0 && var17 <= class247.field3754.length - 1) {
                    int var18 = arg4 + var15;
                    int var19 = arg4 + var14;
                    byte[][] var20 = class50.field625[var17];
                    byte[][] var21 = class224.field3179[var17];
                    byte[][] var22 = class181.field2622[var17];
                    int[][] var23 = class247.field3754[var17];
                    byte[][] var24 = class222.field3143[var17];
                    byte[][] var25 = class149.field2078[var17];
                    for (int var26 = 0; var26 < var12; var26++) {
                        int var27 = arg8 * var26 + arg1 >> 16;
                        int var28 = (var26 + 1) * arg8 + arg1 >> 16;
                        int var29 = var28 - var27;
                        if (var29 > 0) {
                            int var30 = arg5 + var27;
                            int var31 = arg5 + var28;
                            int var32 = arg10 + var26 >> 6;
                            int var33 = arg10 + var26 & 0x3F;
                            int var34 = arg6 + var13 & 0x3F;
                            int var35 = (var33 << 6) + var34;
                            int var36;
                            if (var32 < 0 || var23.length - 1 < var32 || var23[var32] == null) {
                                if (class69.field899.field993 != -1) {
                                    var36 = class69.field899.field993;
                                } else if ((var26 + arg10 & 0x4) == (arg6 + var13 & 0x4)) {
                                    var36 = class196.field2816[class243.field3660 + 1];
                                } else {
                                    var36 = 4936552;
                                }
                                if (var32 < 0 || var23.length - 1 < var32) {
                                    if (var36 == 0) {
                                        var36 = 1;
                                    }
                                    class144.method977(var18, var30, var16, var29, var36);
                                    continue;
                                }
                            } else {
                                var36 = var23[var32][var35];
                            }
                            if (var36 == 0) {
                                var36 = 1;
                            }
                            int var37 = var22[var32] == null ? 0 : class196.field2816[var22[var32][var35] & 0xFF];
                            int var38 = var24[var32] == null ? 0 : class196.field2816[var24[var32][var35] & 0xFF];
                            if (var37 == 0 && var38 == 0) {
                                class144.method977(var18, var30, var16, var29, var36);
                            } else {
                                if (var37 != 0) {
                                    if (var37 == -1) {
                                        var37 = 1;
                                    }
                                    byte var39 = var20[var32] == null ? 0 : var20[var32][var35];
                                    int var40 = var39 & 0xFC;
                                    if (var40 == 0 || var16 <= 1 || var29 <= 1) {
                                        class144.method977(var18, var30, var16, var29, var37);
                                    } else {
                                        class140.method929(var40 >> 2, var29, var18, var37, var16, var39 & 0x3, class144.field2005, 11, true, var36, var30);
                                    }
                                }
                                if (var38 != 0) {
                                    if (var38 == -1) {
                                        var38 = var36;
                                    }
                                    byte var41 = var21[var32][var35];
                                    int var42 = var41 & 0xFC;
                                    if (var42 == 0 || var16 <= 1 || var29 <= 1) {
                                        class144.method977(var18, var30, var16, var29, var38);
                                    }
                                    class140.method929(var42 >> 2, var29, var18, var38, var16, var41 & 0x3, class144.field2005, 11, var37 == 0, 0, var30);
                                }
                            }
                            if (var25[var32] != null) {
                                int var43 = var25[var32][var35] & 0xFF;
                                if (var43 != 0) {
                                    int var44;
                                    if (var16 == 1) {
                                        var44 = var18;
                                    } else {
                                        var44 = var19 - 1;
                                    }
                                    int var45 = 13421772;
                                    if (var43 >= 5 && var43 <= 8 || var43 >= 13 && var43 <= 16 || var43 >= 21 && var43 <= 24 || var43 == 27 || var43 == 28) {
                                        var45 = 13369344;
                                        var43 -= 4;
                                    }
                                    int var46;
                                    if (var29 == 1) {
                                        var46 = var30;
                                    } else {
                                        var46 = var31 - 1;
                                    }
                                    if (var43 == 1) {
                                        class144.method958(var18, var30, var29, var45);
                                    } else if (var43 == 2) {
                                        class144.method965(var18, var30, var16, var45);
                                    } else if (var43 == 3) {
                                        class144.method958(var44, var30, var29, var45);
                                    } else if (var43 == 4) {
                                        class144.method965(var18, var46, var16, var45);
                                    } else if (var43 == 9) {
                                        class144.method958(var18, var30, var29, 16777215);
                                        class144.method965(var18, var30, var16, var45);
                                    } else if (var43 == 10) {
                                        class144.method958(var44, var30, var29, 16777215);
                                        class144.method965(var18, var30, var16, var45);
                                    } else if (var43 == 11) {
                                        class144.method958(var44, var30, var29, 16777215);
                                        class144.method965(var18, var46, var16, var45);
                                    } else if (var43 == 12) {
                                        class144.method958(var18, var30, var29, 16777215);
                                        class144.method965(var18, var46, var16, var45);
                                    } else if (var43 == 17) {
                                        class144.method965(var18, var30, 1, var45);
                                    } else if (var43 == 18) {
                                        class144.method965(var44, var30, 1, var45);
                                    } else if (var43 == 19) {
                                        class144.method965(var44, var46, 1, var45);
                                    } else if (var43 == 20) {
                                        class144.method965(var18, var46, 1, var45);
                                    } else if (var43 == 25) {
                                        for (int var48 = 0; var48 < var29; var48++) {
                                            class144.method965(var18 + var48, -var48 + var46, 1, var45);
                                        }
                                    } else if (var43 == 26) {
                                        for (int var47 = 0; var47 < var29; var47++) {
                                            class144.method965(var18 + var47, var30 + var47, 1, var45);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    var10000 = arg4 + var14;
                    int var50 = arg4 + var15;
                    for (int var51 = 0; var51 < var12; var51++) {
                        int var52;
                        if (class69.field899.field993 != -1) {
                            var52 = class69.field899.field993;
                        } else if ((arg6 + var13 & 0x4) == (arg10 + var51 & 0x4)) {
                            var52 = class196.field2816[class243.field3660 + 1];
                        } else {
                            var52 = 4936552;
                        }
                        int var53 = (arg8 * var51 + arg1 >> 16) + arg5;
                        if (var52 == 0) {
                            var52 = 1;
                        }
                        int var54 = ((var51 + 1) * arg8 + arg1 >> 16) + arg5;
                        int var55 = var54 - var53;
                        class144.method977(var50, var53, var16, var55, var52);
                    }
                }
            }
        }
        for (int var56 = -2; var56 < (var11 + 2); var56++) {
            int var57 = arg7 * var56 + arg9 >> 16;
            int var58 = (var56 + 1) * arg7 + arg9 >> 16;
            int var59 = var58 - var57;
            if (var59 > 0) {
                int var60 = var56 + arg6 >> 6;
                var10000 = arg4 + var58;
                int var62 = arg4 + var57;
                if (var60 >= 0 && (class57.field687.length - 1) >= var60) {
                    int[][] var63 = class57.field687[var60];
                    for (int var64 = -2; var64 < var12 + 2; var64++) {
                        int var65 = arg8 * var64 + arg1 >> 16;
                        int var66 = (var64 + 1) * arg8 + arg1 >> 16;
                        int var67 = var66 - var65;
                        if (var67 > 0) {
                            var10000 = arg5 + var66;
                            int var69 = arg5 + var65;
                            int var70 = arg10 + var64 >> 6;
                            if (var70 >= 0 && var63.length - 1 >= var70) {
                                int var71 = (arg10 + var64 & 0x3F << 6) + (arg6 + var56 & 0x3F);
                                if (var63[var70] != null) {
                                    int var72 = var63[var70][var71];
                                    int var73 = var72 & 0x1FFF;
                                    if (var73 != 0) {
                                        class53 var74 = class293.method2083(var73 - 1, -51);
                                        int var75 = var72 >> 13 & 0x3;
                                        boolean var76 = (var72 >> 15 & 0x1) == 1;
                                        class234 var77 = var74.method322((byte) 110, var75, var76);
                                        if (var77 != null) {
                                            int var78 = var77.field4743 * var59 / 4;
                                            int var79 = var77.field4749 * var67 / 4;
                                            if (var74.field643) {
                                                int var80 = (var72 & 0xF9A9C) >> 16;
                                                int var81 = var72 >> 20 & 0xF;
                                                if ((var75 & 0x1) == 1) {
                                                    int var82 = var80;
                                                    var80 = var81;
                                                    var81 = var82;
                                                }
                                                var78 = var59 * var80;
                                                var79 = var67 * var81;
                                            }
                                            if (var78 != 0 && var79 != 0) {
                                                if (var74.field641 == 0) {
                                                    var77.method1648(var62, var67 + var69 - var79, var78, var79);
                                                } else {
                                                    var77.method1658(var62, var69 + var67 - var79, var78, var79, var74.field641);
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
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(I)V", line = 428)
    public class148(int arg0) {
        super(0, true);
        this.field2059 = 4096;
        this.field2059 = arg0;
    }

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "(I)V", line = 437)
    public static void method996(int arg0) {
        field2061 = null;
        if (arg0 != 0) {
            method997(80, 54, (byte) 104, 122, -86, -121, 48, -122);
        }
        field2060 = null;
        field2053 = (byte[][][]) null;
        field2058 = null;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lp;II)V", line = 450)
    public final void method107(class107 arg0, int arg1, int arg2) {
        field2051++;
        if (arg1 == 0) {
            this.field2059 = (arg0.method661(-1) << 12) / 255;
        }
        if (arg2 >= -85) {
            field2058 = (String) null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(BI)[I", line = 486)
    public final int[] method126(byte arg0, int arg1) {
        field2052++;
        if (arg0 <= 100) {
            return (int[]) null;
        }
        int[] var3 = this.field1748.method902(arg1, true);
        if (this.field1748.field1878) {
            class86.method514(var3, 0, class10.field141, this.field2059);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIBIIIII)V", line = 510)
    public static final void method997(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 >= 0 && arg0 >= 0 && arg6 < 103 && arg0 < 103) {
            if (arg4 == 0) {
                class168 var8 = class298.method2109(arg3, arg6, arg0);
                if (var8 != null) {
                    int var9 = (int) (var8.field2339 >>> 32) & Integer.MAX_VALUE;
                    if (arg1 == 2) {
                        var8.field2335 = new class110(var9, 2, arg7 + 4, arg3, arg6, arg0, arg5, false, var8.field2335);
                        var8.field2331 = new class110(var9, 2, arg7 + 1 & 0x3, arg3, arg6, arg0, arg5, false, var8.field2331);
                    } else {
                        var8.field2335 = new class110(var9, arg1, arg7, arg3, arg6, arg0, arg5, false, var8.field2335);
                    }
                }
            }
            if (arg4 == 1) {
                class54 var10 = client.method1943(arg3, arg6, arg0);
                if (var10 != null) {
                    int var11 = Integer.MAX_VALUE & (int) (var10.field656 >>> 32);
                    if (arg1 == 4 || arg1 == 5) {
                        var10.field662 = new class110(var11, 4, arg7, arg3, arg6, arg0, arg5, false, var10.field662);
                    } else if (arg1 == 6) {
                        var10.field662 = new class110(var11, 4, arg7 + 4, arg3, arg6, arg0, arg5, false, var10.field662);
                    } else if (arg1 == 7) {
                        var10.field662 = new class110(var11, 4, (arg7 + 2 & 0x3) + 4, arg3, arg6, arg0, arg5, false, var10.field662);
                    } else if (arg1 == 8) {
                        var10.field662 = new class110(var11, 4, arg7 + 4, arg3, arg6, arg0, arg5, false, var10.field662);
                        var10.field669 = new class110(var11, 4, (arg7 + 2 & 0x3) + 4, arg3, arg6, arg0, arg5, false, var10.field669);
                    }
                }
            }
            if (arg4 == 2) {
                if (arg1 == 11) {
                    arg1 = 10;
                }
                class80 var12 = class91.method536(arg3, arg6, arg0);
                if (var12 != null) {
                    var12.field1024 = new class110(Integer.MAX_VALUE & (int) (var12.field1026 >>> 32), arg1, arg7, arg3, arg6, arg0, arg5, false, var12.field1024);
                }
            }
            if (arg4 == 3) {
                class138 var13 = class339.method2345(arg3, arg6, arg0);
                if (var13 != null) {
                    var13.field1935 = new class110(Integer.MAX_VALUE & (int) (var13.field1937 >>> 32), 22, arg7, arg3, arg6, arg0, arg5, false, var13.field1935);
                }
            }
        }
        field2062++;
        if (arg2 >= -74) {
            method995(125, -15, -121, -22, 87, -93, -63, 123, -82, 24, -45);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIIII)V", line = 607)
    public static final void method998(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 != -2) {
            field2055 = 107;
        }
        field2057++;
        if (arg0 >= class109.field1494 && class56.field678 >= arg4 && arg5 >= class272.field4273 && class248.field3759 >= arg3) {
            if (arg6 == 1) {
                class233.method1643(true, arg3, arg4, arg2, arg5, arg0);
            } else {
                class99.method595(arg2, arg4, arg5, arg3, arg6, arg0, 793982496);
            }
        } else if (arg6 == 1) {
            class319.method2228(arg4, arg0, arg3, (byte) 119, arg2, arg5);
        } else {
            class322.method2240(arg0, arg6, arg4, arg2, arg3, arg5, (byte) -110);
        }
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "()V", line = 643)
    public class148() {
        this(4096);
    }
}
