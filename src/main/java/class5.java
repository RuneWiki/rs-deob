import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class5 {

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "Lvd;")
    public static class222 field80 = class212.method1357("m-Ochte mit Ihnen handeln)3", 10731);

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
    public static int field87 = 0;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    public int field83;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
    public int field86;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "I")
    public int field89;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "J")
    public long field84;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "Le;")
    public class44 field90;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "[Lbg;")
    public static class19[] field81;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
    public static final void method50(int arg0) {
        field85++;
        if (class122.field2331 && class217.field4036 != class112.field2116) {
            class36.method295(class160.field3052, class208.field3870, class17.field432.field1333[0], class17.field432.field1358[0], (byte) -124, class217.field4036);
            return;
        }
        if (class217.field4036 != class215.field3986) {
            class215.field3986 = class217.field4036;
            class217.method1382((byte) -125, class217.field4036);
        }
        if (arg0 != 0) {
            method51(null, (byte) 124, 59);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lge;BI)V")
    public static final void method51(class70 arg0, byte arg1, int arg2) {
        if (arg0.field1367 > class175.field3280) {
            class152.method978(true, arg0);
        } else if (arg0.field1343 >= class175.field3280) {
            class206.method1328(arg0, (byte) 67);
        } else {
            class206.method1329(arg0, (byte) 39);
        }
        field82++;
        if (arg0.field1353 < 128 || arg0.field1360 < 128 || arg0.field1353 >= 13184 || arg0.field1360 >= 13184) {
            arg0.field1360 = arg0.field1358[0] * 128 + arg0.field1331 * 64;
            arg0.field1323 = -1;
            arg0.field1343 = 0;
            arg0.field1309 = -1;
            arg0.field1353 = arg0.field1333[0] * 128 + arg0.field1331 * 64;
            arg0.field1367 = 0;
            arg0.method474(-6640);
        }
        if (class17.field432 == arg0 && (arg0.field1353 < 1536 || arg0.field1360 < 1536 || arg0.field1353 >= 11776 || arg0.field1360 >= 11776)) {
            arg0.field1367 = 0;
            arg0.field1323 = -1;
            arg0.field1343 = 0;
            arg0.field1360 = arg0.field1358[0] * 128 + arg0.field1331 * 64;
            arg0.field1353 = arg0.field1333[0] * 128 + arg0.field1331 * 64;
            arg0.field1309 = -1;
            arg0.method474(-6640);
        }
        if (arg1 == 67) {
            class7.method61(arg0, arg1 ^ 0xFFFFFFD9);
            class168.method1083(arg0, 123);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method52(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field88++;
        int var9 = arg6 - arg5;
        int var10 = arg8 - arg3;
        int var11 = (arg7 - arg2 << 16) / var9;
        int var12 = (arg4 - arg1 << 16) / var10;
        if (class38.field852 > arg8) {
            var10++;
        }
        if (class99.field1862 > arg6) {
            var9++;
        }
        for (int var13 = 0; var13 < var9; var13++) {
            int var30 = (var13 + 1) * var11 >> 16;
            int var31 = var11 * var13 >> 16;
            int var32 = var30 - var31;
            if (var32 > 0) {
                int var33 = arg2 + var31;
                int var34 = var13 + arg5 >> 6;
                byte[][] var35 = class179.field3319[var34];
                int var36 = arg2 + var30;
                int[][] var37 = class177.field3311[var34];
                byte[][] var38 = class130.field2532[var34];
                byte[][] var39 = class71.field1379[var34];
                byte[][] var40 = class185.field3428[var34];
                byte[][] var41 = class205.field3808[var34];
                for (int var42 = 0; var42 < var10; var42++) {
                    int var43 = var12 * var42 >> 16;
                    int var44 = (var42 + 1) * var12 >> 16;
                    int var45 = var44 - var43;
                    if (var45 > 0) {
                        int var46 = arg1 + var43;
                        int var47 = var42 + arg3 >> 6;
                        int var48 = var42 + arg3 & 0x3F;
                        int var49 = arg1 + var44;
                        int var50 = var13 + arg5 & 0x3F;
                        int var51 = (var48 << 6) + var50;
                        int var52;
                        if (var37[var47] == null) {
                            int var53 = arg5 + var13 & 0x4;
                            int var54 = arg3 + var42 & 0x4;
                            if ((var53 >= 2 || var54 <= 2) && (var53 <= 2 || var54 >= 2)) {
                                var52 = class84.field1608[class56.field1063 + 1];
                            } else {
                                var52 = 4936552;
                            }
                        } else {
                            var52 = var37[var47][var51];
                        }
                        int var55 = var35[var47] == null ? 0 : class84.field1608[var35[var47][var51] & 0xFF];
                        int var56 = var39[var47] == null ? 0 : class84.field1608[var39[var47][var51] & 0xFF];
                        if (var55 == 0 && var56 == 0) {
                            class53.method399(var33, var46, var32, var45, var52);
                        } else {
                            if (var55 != 0) {
                                if (var55 == -1) {
                                    var55 = 1;
                                }
                                byte var57 = var38[var47] == null ? 0 : var38[var47][var51];
                                int var58 = var57 & 0xFC;
                                if (var58 == 0 || var32 <= 1 || var45 <= 1) {
                                    class53.method399(var33, var46, var32, var45, var55);
                                } else {
                                    class86.method556((byte) 94, class53.field1007, var58 >> 2, var46, var32, var52, var57 & 0x3, true, var45, var33, var55);
                                }
                            }
                            if (var56 != 0) {
                                if (var56 == -1) {
                                    var56 = var52;
                                }
                                byte var59 = var40[var47][var51];
                                int var60 = var59 & 0xFC;
                                if (var60 == 0 || var32 <= 1 || var45 <= 1) {
                                    class53.method399(var33, var46, var32, var45, var56);
                                }
                                class86.method556((byte) -93, class53.field1007, var60 >> 2, var46, var32, 0, var59 & 0x3, var55 == 0, var45, var33, var56);
                            }
                        }
                        if (var41[var47] != null) {
                            int var61 = var41[var47][var51] & 0xFF;
                            if (var61 != 0) {
                                int var62;
                                if (var45 == 1) {
                                    var62 = var46;
                                } else {
                                    var62 = var49 - 1;
                                }
                                int var63 = 13421772;
                                int var64;
                                if (var32 == 1) {
                                    var64 = var33;
                                } else {
                                    var64 = var36 - 1;
                                }
                                if (var61 >= 5 && var61 <= 8 || var61 >= 13 && var61 <= 16 || var61 >= 21 && var61 <= 24 || var61 == 27 || var61 == 28) {
                                    var63 = 13369344;
                                    var61 -= 4;
                                }
                                if (var61 == 1) {
                                    class53.method384(var33, var46, var45, var63);
                                } else if (var61 == 2) {
                                    class53.method388(var33, var46, var32, var63);
                                } else if (var61 == 3) {
                                    class53.method384(var64, var46, var45, var63);
                                } else if (var61 == 4) {
                                    class53.method388(var33, var62, var32, var63);
                                } else if (var61 == 9) {
                                    class53.method384(var33, var46, var45, 16777215);
                                    class53.method388(var33, var46, var32, var63);
                                } else if (var61 == 10) {
                                    class53.method384(var64, var46, var45, 16777215);
                                    class53.method388(var33, var46, var32, var63);
                                } else if (var61 == 11) {
                                    class53.method384(var64, var46, var45, 16777215);
                                    class53.method388(var33, var62, var32, var63);
                                } else if (var61 == 12) {
                                    class53.method384(var33, var46, var45, 16777215);
                                    class53.method388(var33, var62, var32, var63);
                                } else if (var61 == 17) {
                                    class53.method388(var33, var46, 1, var63);
                                } else if (var61 == 18) {
                                    class53.method388(var64, var46, 1, var63);
                                } else if (var61 == 19) {
                                    class53.method388(var64, var62, 1, var63);
                                } else if (var61 == 20) {
                                    class53.method388(var33, var62, 1, var63);
                                } else if (var61 == 25) {
                                    for (int var66 = 0; var66 < var45; var66++) {
                                        class53.method388(var33 + var66, -var66 + var62, 1, var63);
                                    }
                                } else if (var61 == 26) {
                                    for (int var65 = 0; var65 < var45; var65++) {
                                        class53.method388(var33 + var65, var46 + var65, 1, var63);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int var14 = arg0; var14 < var9; var14++) {
            int var15 = var11 * var14 >> 16;
            int var16 = (var14 + 1) * var11 >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                int var10000 = arg2 + var16;
                int var19 = arg2 + var15;
                byte[][] var20 = class69.field1296[arg5 + var14 >> 6];
                for (int var21 = 0; var21 < var10; var21++) {
                    int var22 = (var21 + 1) * var12 >> 16;
                    int var23 = var12 * var21 >> 16;
                    int var24 = var22 - var23;
                    if (var24 > 0) {
                        var10000 = arg1 + var22;
                        int var26 = ((arg3 + var21 & 0x3F) << 6) + (arg5 + var14 & 0x3F);
                        int var27 = arg1 + var23;
                        int var28 = arg3 + var21 >> 6;
                        if (var20[var28] != null) {
                            int var29 = var20[var28][var26] & 0xFF;
                            if (var29 != 0) {
                                if (var29 == 47 || var29 == 53) {
                                    class21.field504[var29 - 1].method1391(var19, var27, var17 * 2 + 1, var24 * 2 + 1);
                                } else {
                                    class21.field504[var29 - 1].method1391(var19 - var17 / 2, -(var24 / 2) + var27, var17 * 2, var24 * 2);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V")
    public static void method53(byte arg0) {
        field81 = null;
        field80 = null;
        if (arg0 < 113) {
            field87 = 4;
        }
    }
}
