import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class365 {

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
    public static int field5116;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
    public static int field5117;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "I")
    public static int field5118;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "I")
    public static int field5119;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;", line = 3)
    public static final String method2215(String arg0, String arg1, String arg2, int arg3) {
        field5119++;
        int var4 = -92 / ((arg3 + 62) / 39);
        for (int var5 = arg2.indexOf(arg0); var5 != -1; var5 = arg2.indexOf(arg0, var5 + arg1.length())) {
            arg2 = arg2.substring(0, var5) + arg1 + arg2.substring(arg0.length() + var5);
        }
        return arg2;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "([Llg;B)V", line = 21)
    public static final void method2216(class20[] arg0, byte arg1) {
        class105.field1288 = arg0.length;
        field5117++;
        class335.field4469 = new class20[class105.field1288 + 10];
        if (arg1 < 98) {
            method2216((class20[]) null, (byte) 94);
        }
        class130.field1673 = new int[class105.field1288 + 10];
        class358.method2181(arg0, 0, class335.field4469, 0, class105.field1288);
        for (int var2 = 0; var2 < class105.field1288; var2++) {
            class130.field1673[var2] = class335.field4469[var2].method109();
        }
        for (int var3 = class105.field1288; var3 < class335.field4469.length; var3++) {
            class130.field1673[var3] = 12;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "([[B[[B[ZLvm;IIB[[BLfc;Lqq;IIII)V", line = 59)
    public static final void method2217(byte[][] arg0, byte[][] arg1, boolean[] arg2, class322 arg3, int arg4, int arg5, byte arg6, byte[][] arg7, class191 arg8, class262 arg9, int arg10, int arg11, int arg12, int arg13) {
        field5118++;
        if (arg8 != null && arg9 != null || arg9 != null && arg5 == 12 || arg8 != null && arg5 == 0) {
            boolean[] var14 = arg8 != null && arg8.field2405 ? class427.field6276[arg5] : class386.field5506[arg5];
            if (arg11 > 0) {
                if (arg10 > 0) {
                    int var15 = arg0[arg10 - 1][arg11 - 1] & 0xFF;
                    if (var15 > 0) {
                        class191 var16 = class247.method1317((byte) 97, var15 - 1);
                        if (var16.field2417 != -1 && var16.field2405) {
                            byte var17 = arg1[arg10 - 1][arg11 - 1];
                            int var18 = arg7[arg10 - 1][arg11 - 1] * 2 + 4 & 0x7;
                            int var19 = class156.method839(var16, 1604449159, arg3);
                            if (class248.field3350[var17][var18]) {
                                class231.field3181[0] = var16.field2417;
                                class136.field1738[0] = var19;
                                class191.field2418[0] = arg3.method1562() ? var16.field2412 : var16.field2404;
                                class371.field5198[0] = var16.field2419;
                                class321.field4296[0] = var16.field2409;
                                class18.field175[0] = 256;
                            }
                        }
                    }
                }
                if (arg10 < arg12 - 1) {
                    int var20 = arg0[arg10 + 1][arg11 - 1] & 0xFF;
                    if (var20 > 0) {
                        class191 var21 = class247.method1317((byte) 97, var20 - 1);
                        if (var21.field2417 != -1 && var21.field2405) {
                            byte var22 = arg1[arg10 + 1][arg11 - 1];
                            int var23 = arg7[arg10 + 1][arg11 - 1] * 2 + 6 & 0x7;
                            int var24 = class156.method839(var21, 1604449159, arg3);
                            if (class248.field3350[var22][var23]) {
                                class231.field3181[2] = var21.field2417;
                                class136.field1738[2] = var24;
                                class191.field2418[2] = arg3.method1562() ? var21.field2412 : var21.field2404;
                                class371.field5198[2] = var21.field2419;
                                class321.field4296[2] = var21.field2409;
                                class18.field175[2] = 512;
                            }
                        }
                    }
                }
            }
            if (arg11 < (arg4 - 1)) {
                if (arg10 > 0) {
                    int var25 = arg0[arg10 - 1][arg11 + 1] & 0xFF;
                    if (var25 > 0) {
                        class191 var26 = class247.method1317((byte) 97, var25 - 1);
                        if (var26.field2417 != -1 && var26.field2405) {
                            byte var27 = arg1[arg10 - 1][arg11 + 1];
                            int var28 = arg7[arg10 - 1][arg11 + 1] * 2 + 2 & 0x7;
                            int var29 = class156.method839(var26, 1604449159, arg3);
                            if (class248.field3350[var27][var28]) {
                                class231.field3181[6] = var26.field2417;
                                class136.field1738[6] = var29;
                                class191.field2418[6] = arg3.method1562() ? var26.field2412 : var26.field2404;
                                class371.field5198[6] = var26.field2419;
                                class321.field4296[6] = var26.field2409;
                                class18.field175[6] = 64;
                            }
                        }
                    }
                }
                if (arg10 < (arg12 - 1)) {
                    int var30 = arg0[arg10 + 1][arg11 + 1] & 0xFF;
                    if (var30 > 0) {
                        class191 var31 = class247.method1317((byte) 97, var30 - 1);
                        if (var31.field2417 != -1 && var31.field2405) {
                            byte var32 = arg1[arg10 + 1][arg11 + 1];
                            int var33 = -(-(arg7[arg10 + 1][arg11 + 1] * 2)) & 0x7;
                            int var34 = class156.method839(var31, 1604449159, arg3);
                            if (class248.field3350[var32][var33]) {
                                class231.field3181[4] = var31.field2417;
                                class136.field1738[4] = var34;
                                class191.field2418[4] = arg3.method1562() ? var31.field2412 : var31.field2404;
                                class371.field5198[4] = var31.field2419;
                                class321.field4296[4] = var31.field2409;
                                class18.field175[4] = 128;
                            }
                        }
                    }
                }
            }
            if (arg11 > 0) {
                int var35 = arg0[arg10][arg11 - 1] & 0xFF;
                if (var35 > 0) {
                    class191 var36 = class247.method1317((byte) 97, var35 - 1);
                    if (var36.field2417 != -1) {
                        byte var37 = arg1[arg10][arg11 - 1];
                        byte var38 = arg7[arg10][arg11 - 1];
                        if (var36.field2405) {
                            int var39 = 2;
                            int var40 = var38 * 2 + 4;
                            int var41 = class156.method839(var36, 1604449159, arg3);
                            for (int var42 = 0; var42 < 3; var42++) {
                                var39 &= 0x7;
                                var40 &= 0x7;
                                if (class248.field3350[var37][var40] && class321.field4296[var39] <= var36.field2409) {
                                    class231.field3181[var39] = var36.field2417;
                                    class136.field1738[var39] = var41;
                                    class191.field2418[var39] = arg3.method1562() ? var36.field2412 : var36.field2404;
                                    class371.field5198[var39] = var36.field2419;
                                    if (class321.field4296[var39] == var36.field2409) {
                                        class18.field175[var39] = class392.method2441(class18.field175[var39], 32);
                                    } else {
                                        class18.field175[var39] = 32;
                                    }
                                    class321.field4296[var39] = var36.field2409;
                                }
                                var39--;
                                var40++;
                            }
                            if (!var14[arg13 & 0x3]) {
                                arg2[0] = class427.field6276[var37][class262.method1461(var38 + 2, 3)];
                            }
                        } else if (!var14[arg13 & 0x3]) {
                            arg2[0] = class386.field5506[var37][class262.method1461(3, var38 + 2)];
                        }
                    }
                }
            }
            if ((arg4 - 1) > arg11) {
                int var43 = arg0[arg10][arg11 + 1] & 0xFF;
                if (var43 > 0) {
                    class191 var44 = class247.method1317((byte) 97, var43 - 1);
                    if (var44.field2417 != -1) {
                        byte var45 = arg1[arg10][arg11 + 1];
                        byte var46 = arg7[arg10][arg11 + 1];
                        if (var44.field2405) {
                            int var47 = 4;
                            int var48 = var46 * 2 + 2;
                            int var49 = class156.method839(var44, 1604449159, arg3);
                            for (int var50 = 0; var50 < 3; var50++) {
                                var48 &= 0x7;
                                var47 &= 0x7;
                                if (class248.field3350[var45][var48] && var44.field2409 >= class321.field4296[var47]) {
                                    class231.field3181[var47] = var44.field2417;
                                    class136.field1738[var47] = var49;
                                    class191.field2418[var47] = arg3.method1562() ? var44.field2412 : var44.field2404;
                                    class371.field5198[var47] = var44.field2419;
                                    if (class321.field4296[var47] == var44.field2409) {
                                        class18.field175[var47] = class392.method2441(class18.field175[var47], 16);
                                    } else {
                                        class18.field175[var47] = 16;
                                    }
                                    class321.field4296[var47] = var44.field2409;
                                }
                                var47++;
                                var48--;
                            }
                            if (!var14[arg13 + 2 & 0x3]) {
                                arg2[2] = class427.field6276[var45][class262.method1461(var46, 3)];
                            }
                        } else if (!var14[arg13 + 2 & 0x3]) {
                            arg2[2] = class386.field5506[var45][class262.method1461(3, var46)];
                        }
                    }
                }
            }
            if (arg10 > 0) {
                int var51 = arg0[arg10 - 1][arg11] & 0xFF;
                if (var51 > 0) {
                    class191 var52 = class247.method1317((byte) 97, var51 - 1);
                    if (var52.field2417 != -1) {
                        byte var53 = arg1[arg10 - 1][arg11];
                        byte var54 = arg7[arg10 - 1][arg11];
                        if (var52.field2405) {
                            int var55 = 6;
                            int var56 = (var54 * 2) + 4;
                            int var57 = class156.method839(var52, 1604449159, arg3);
                            for (int var58 = 0; var58 < 3; var58++) {
                                var56 &= 0x7;
                                var55 &= 0x7;
                                if (class248.field3350[var53][var56] && var52.field2409 >= class321.field4296[var55]) {
                                    class231.field3181[var55] = var52.field2417;
                                    class136.field1738[var55] = var57;
                                    class191.field2418[var55] = arg3.method1562() ? var52.field2412 : var52.field2404;
                                    class371.field5198[var55] = var52.field2419;
                                    if (class321.field4296[var55] == var52.field2409) {
                                        class18.field175[var55] = class392.method2441(class18.field175[var55], 8);
                                    } else {
                                        class18.field175[var55] = 8;
                                    }
                                    class321.field4296[var55] = var52.field2409;
                                }
                                var55++;
                                var56--;
                            }
                            if (!var14[arg13 + 3 & 0x3]) {
                                arg2[3] = class427.field6276[var53][class262.method1461(var54 + 1, 3)];
                            }
                        } else if (!var14[arg13 + 3 & 0x3]) {
                            arg2[3] = class386.field5506[var53][class262.method1461(var54 + 1, 3)];
                        }
                    }
                }
            }
            if (arg12 - 1 > arg10) {
                int var59 = arg0[arg10 + 1][arg11] & 0xFF;
                if (var59 > 0) {
                    class191 var60 = class247.method1317((byte) 97, var59 - 1);
                    if (var60.field2417 != -1) {
                        byte var61 = arg1[arg10 + 1][arg11];
                        byte var62 = arg7[arg10 + 1][arg11];
                        if (var60.field2405) {
                            int var63 = 4;
                            int var64 = (var62 * 2) + 6;
                            int var65 = class156.method839(var60, 1604449159, arg3);
                            for (int var66 = 0; var66 < 3; var66++) {
                                var64 &= 0x7;
                                var63 &= 0x7;
                                if (class248.field3350[var61][var64] && class321.field4296[var63] <= var60.field2409) {
                                    class231.field3181[var63] = var60.field2417;
                                    class136.field1738[var63] = var65;
                                    class191.field2418[var63] = arg3.method1562() ? var60.field2412 : var60.field2404;
                                    class371.field5198[var63] = var60.field2419;
                                    if (class321.field4296[var63] == var60.field2409) {
                                        class18.field175[var63] = class392.method2441(class18.field175[var63], 4);
                                    } else {
                                        class18.field175[var63] = 4;
                                    }
                                    class321.field4296[var63] = var60.field2409;
                                }
                                var63--;
                                var64++;
                            }
                            if (!var14[arg13 + 1 & 0x3]) {
                                arg2[1] = class427.field6276[var61][class262.method1461(3, var62 + 3)];
                            }
                        } else if (!var14[arg13 + 1 & 0x3]) {
                            arg2[1] = class386.field5506[var61][class262.method1461(3, var62 + 3)];
                        }
                    }
                }
            }
        }
        if (arg8 != null) {
            int var67 = class156.method839(arg8, 1604449159, arg3);
            if (arg8.field2405) {
                for (int var68 = 0; var68 < 8; var68++) {
                    int var69 = var68 - (arg13 * 2) & 0x7;
                    if (class248.field3350[arg5][var68] && class321.field4296[var69] <= arg8.field2409) {
                        class231.field3181[var69] = arg8.field2417;
                        class136.field1738[var69] = var67;
                        class191.field2418[var69] = arg3.method1562() ? arg8.field2412 : arg8.field2404;
                        class371.field5198[var69] = arg8.field2419;
                        if (class321.field4296[var69] == arg8.field2409) {
                            class18.field175[var69] = class392.method2441(class18.field175[var69], 2);
                        } else {
                            class18.field175[var69] = 2;
                        }
                        class321.field4296[var69] = arg8.field2409;
                    }
                }
            }
        }
        int var70 = -79 / ((arg6 + 75) / 49);
    }
}
