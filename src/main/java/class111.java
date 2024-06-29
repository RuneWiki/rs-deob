import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public abstract class class111 extends class32 {

    @OriginalMember(owner = "client!sk", name = "J", descriptor = "Lqk;")
    private static class207 field1936 = class24.method212(255, "glow1:");

    @OriginalMember(owner = "client!sk", name = "I", descriptor = "Lqk;")
    public static class207 field1935 = field1936;

    @OriginalMember(owner = "client!sk", name = "G", descriptor = "Lqk;")
    public static class207 field1933 = field1936;

    @OriginalMember(owner = "client!sk", name = "K", descriptor = "Lqk;")
    public static class207 field1937 = class24.method212(255, "glissement:");

    @OriginalMember(owner = "client!sk", name = "L", descriptor = "[I")
    public static int[] field1938 = new int[4];

    @OriginalMember(owner = "client!sk", name = "O", descriptor = "[I")
    public static int[] field1941 = new int[100];

    @OriginalMember(owner = "client!sk", name = "N", descriptor = "[Lqk;")
    public static class207[] field1940 = new class207[1000];

    @OriginalMember(owner = "client!sk", name = "F", descriptor = "I")
    public static int field1932;

    @OriginalMember(owner = "client!sk", name = "H", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!sk", name = "M", descriptor = "I")
    public static int field1939;

    @OriginalMember(owner = "client!sk", name = "E", descriptor = "Luh;")
    public static class100 field1931;

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method792(byte arg0);

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "(I)V")
    public static void method793(int arg0) {
        field1936 = null;
        if (arg0 != 233346342) {
            return;
        }
        field1938 = null;
        field1940 = null;
        field1933 = null;
        field1941 = null;
        field1935 = null;
        field1937 = null;
        field1931 = null;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIIIIIIII)V")
    public static final void method794(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = arg4 - arg0;
        field1934++;
        if (arg4 < class197.field3463) {
            var11++;
        }
        int var12 = arg10 - arg5;
        if (class70.field1253 > arg10) {
            var12++;
        }
        int var13 = 0;
        if (arg9 < 13) {
            field1940 = null;
        }
        int var10000;
        while (var11 > var13) {
            int var40 = arg7 + (arg2 * var13) >> 16;
            int var41 = arg7 + ((var13 + 1) * arg2) >> 16;
            int var42 = var41 - var40;
            if (var42 > 0) {
                int var43 = var13 + arg0 >> 6;
                if (var43 >= 0 && var43 <= class170.field3018.length - 1) {
                    int var44 = arg8 + var41;
                    int var45 = arg8 + var40;
                    int[][] var46 = class170.field3018[var43];
                    byte[][] var47 = class72.field1327[var43];
                    byte[][] var48 = class161.field2854[var43];
                    byte[][] var49 = class204.field3593[var43];
                    byte[][] var50 = class75.field1388[var43];
                    byte[][] var51 = class173.field3066[var43];
                    for (int var52 = 0; var52 < var12; var52++) {
                        int var53 = arg1 * var52 + arg3 >> 16;
                        int var54 = (var52 + 1) * arg1 + arg3 >> 16;
                        int var55 = var54 - var53;
                        if (var55 > 0) {
                            int var56 = arg5 + var52 >> 6;
                            int var57 = arg6 + var54;
                            int var58 = arg6 + var53;
                            int var59 = arg5 + var52 & 0x3F;
                            int var60 = var13 + arg0 & 0x3F;
                            int var61 = (var59 << 6) + var60;
                            int var62;
                            if (var56 < 0 || var56 > var46.length - 1 || var46[var56] == null) {
                                if (class1.field5.field4548 != -1) {
                                    var62 = class1.field5.field4548;
                                } else if ((arg0 + var13 & 0x4) == (arg5 + var52 & 0x4)) {
                                    var62 = class281.field4945[class131.field2270 + 1];
                                } else {
                                    var62 = 4936552;
                                }
                                if (var56 < 0 || (var46.length - 1) < var56) {
                                    if (var62 == 0) {
                                        var62 = 1;
                                    }
                                    class23.method167(var45, var58, var42, var55, var62);
                                    continue;
                                }
                            } else {
                                var62 = var46[var56][var61];
                            }
                            if (var62 == 0) {
                                var62 = 1;
                            }
                            int var63 = var51[var56] == null ? 0 : class281.field4945[var51[var56][var61] & 0xFF];
                            int var64 = var47[var56] == null ? 0 : class281.field4945[var47[var56][var61] & 0xFF];
                            if (var64 == 0 && var63 == 0) {
                                class23.method167(var45, var58, var42, var55, var62);
                            } else {
                                if (var64 != 0) {
                                    if (var64 == -1) {
                                        var64 = 1;
                                    }
                                    byte var65 = var48[var56] == null ? 0 : var48[var56][var61];
                                    int var66 = var65 & 0xFC;
                                    if (var66 == 0 || var42 <= 1 || var55 <= 1) {
                                        class23.method167(var45, var58, var42, var55, var64);
                                    } else {
                                        class136.method946(var64, var66 >> 2, var42, var58, var62, var55, class23.field435, -119, true, var65 & 0x3, var45);
                                    }
                                }
                                if (var63 != 0) {
                                    if (var63 == -1) {
                                        var63 = var62;
                                    }
                                    byte var67 = var49[var56][var61];
                                    int var68 = var67 & 0xFC;
                                    if (var68 == 0 || var42 <= 1 || var55 <= 1) {
                                        class23.method167(var45, var58, var42, var55, var63);
                                    }
                                    class136.method946(var63, var68 >> 2, var42, var58, 0, var55, class23.field435, -94, ~var64 == -1, var67 & 0x3, var45);
                                }
                            }
                            if (var50[var56] != null) {
                                int var69 = var50[var56][var61] & 0xFF;
                                if (var69 != 0) {
                                    int var70;
                                    if (var42 == 1) {
                                        var70 = var45;
                                    } else {
                                        var70 = var44 - 1;
                                    }
                                    int var71;
                                    if (var55 == 1) {
                                        var71 = var58;
                                    } else {
                                        var71 = var57 - 1;
                                    }
                                    int var72 = 13421772;
                                    if (var69 >= 5 && var69 <= 8 || var69 >= 13 && var69 <= 16 || var69 >= 21 && var69 <= 24 || var69 == 27 || var69 == 28) {
                                        var69 -= 4;
                                        var72 = 13369344;
                                    }
                                    if (var69 == 1) {
                                        class23.method146(var45, var58, var55, var72);
                                    } else if (var69 == 2) {
                                        class23.method161(var45, var58, var42, var72);
                                    } else if (var69 == 3) {
                                        class23.method146(var70, var58, var55, var72);
                                    } else if (var69 == 4) {
                                        class23.method161(var45, var71, var42, var72);
                                    } else if (var69 == 9) {
                                        class23.method146(var45, var58, var55, 16777215);
                                        class23.method161(var45, var58, var42, var72);
                                    } else if (var69 == 10) {
                                        class23.method146(var70, var58, var55, 16777215);
                                        class23.method161(var45, var58, var42, var72);
                                    } else if (var69 == 11) {
                                        class23.method146(var70, var58, var55, 16777215);
                                        class23.method161(var45, var71, var42, var72);
                                    } else if (var69 == 12) {
                                        class23.method146(var45, var58, var55, 16777215);
                                        class23.method161(var45, var71, var42, var72);
                                    } else if (var69 == 17) {
                                        class23.method161(var45, var58, 1, var72);
                                    } else if (var69 == 18) {
                                        class23.method161(var70, var58, 1, var72);
                                    } else if (var69 == 19) {
                                        class23.method161(var70, var71, 1, var72);
                                    } else if (var69 == 20) {
                                        class23.method161(var45, var71, 1, var72);
                                    } else if (var69 == 25) {
                                        for (int var73 = 0; var73 < var55; var73++) {
                                            class23.method161(var45 + var73, var71 - var73, 1, var72);
                                        }
                                    } else if (var69 == 26) {
                                        for (int var74 = 0; var74 < var55; var74++) {
                                            class23.method161(var45 + var74, var58 - -var74, 1, var72);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    var10000 = arg8 + var41;
                    int var76 = arg8 + var40;
                    for (int var77 = 0; var77 < var12; var77++) {
                        int var78;
                        if (class1.field5.field4548 != -1) {
                            var78 = class1.field5.field4548;
                        } else if ((arg0 + var13 & 0x4) == (arg5 + var77 & 0x4)) {
                            var78 = class281.field4945[class131.field2270 + 1];
                        } else {
                            var78 = 4936552;
                        }
                        int var79 = (arg1 * var77 + arg3 >> 16) + arg6;
                        if (var78 == 0) {
                            var78 = 1;
                        }
                        int var80 = ((var77 + 1) * arg1 + arg3 >> 16) + arg6;
                        int var81 = var80 - var79;
                        class23.method167(var76, var79, var42, var81, var78);
                    }
                }
            }
            var13++;
        }
        for (int var14 = -2; var14 < (var11 + 2); var14++) {
            int var15 = arg2 * var14 + arg7 >> 16;
            int var16 = arg7 + ((var14 + 1) * arg2) >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                var10000 = arg8 + var16;
                int var19 = var14 + arg0 >> 6;
                int var20 = arg8 + var15;
                if (var19 >= 0 && class236.field4351.length - 1 >= var19) {
                    int[][] var21 = class236.field4351[var19];
                    for (int var22 = -2; var22 < var12 + 2; var22++) {
                        int var23 = arg3 + (arg1 * var22) >> 16;
                        int var24 = arg3 + ((var22 + 1) * arg1) >> 16;
                        int var25 = var24 - var23;
                        if (var25 > 0) {
                            int var26 = arg6 + var23;
                            var10000 = arg6 + var24;
                            int var28 = arg5 + var22 >> 6;
                            if (var28 >= 0 && var21.length - 1 >= var28) {
                                int var29 = ((arg5 + var22 & 0x3F) << 6) + (arg0 + var14 & 0x3F);
                                if (var21[var28] != null) {
                                    int var30 = var21[var28][var29];
                                    int var31 = var30 & 0x3FFF;
                                    if (var31 != 0) {
                                        int var32 = var30 >> 14 & 0x3;
                                        class13 var33 = class164.method1186(var31 - 1, (byte) 44);
                                        class130 var34 = var33.method74(11230, var32);
                                        if (var34 != null) {
                                            int var35 = var34.field658 * var25 / 4;
                                            int var36 = var34.field661 * var17 / 4;
                                            if (var33.field180) {
                                                int var37 = (var30 & 0xF5293) >> 16;
                                                int var38 = (var30 & 0xF0901A) >> 20;
                                                if ((var32 & 0x1) == 1) {
                                                    int var39 = var37;
                                                    var37 = var38;
                                                    var38 = var39;
                                                }
                                                var36 = var17 * var37;
                                                var35 = var25 * var38;
                                            }
                                            if (var36 != 0 && var35 != 0) {
                                                if (var33.field185 == 0) {
                                                    var34.method916(var20, var26 + var25 - var35, var36, var35);
                                                } else {
                                                    var34.method909(var20, var25 + var26 - var35, var36, var35, var33.field185);
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

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "(I)Z")
    public abstract boolean method795(int arg0);
}
