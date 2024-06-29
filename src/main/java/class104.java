import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class104 extends class172 {

    @OriginalMember(owner = "client!nc", name = "I", descriptor = "I")
    public int field1676 = 0;

    @OriginalMember(owner = "client!nc", name = "R", descriptor = "I")
    public int field1685 = 12800;

    @OriginalMember(owner = "client!nc", name = "cb", descriptor = "I")
    public int field1696 = 0;

    @OriginalMember(owner = "client!nc", name = "Z", descriptor = "Z")
    public boolean field1693 = true;

    @OriginalMember(owner = "client!nc", name = "T", descriptor = "I")
    public int field1687 = -1;

    @OriginalMember(owner = "client!nc", name = "fb", descriptor = "I")
    public int field1699 = 12800;

    @OriginalMember(owner = "client!nc", name = "gb", descriptor = "I")
    public int field1700 = -1;

    @OriginalMember(owner = "client!nc", name = "Q", descriptor = "I")
    public int field1684;

    @OriginalMember(owner = "client!nc", name = "L", descriptor = "I")
    public int field1679;

    @OriginalMember(owner = "client!nc", name = "X", descriptor = "Ljava/lang/String;")
    public String field1691;

    @OriginalMember(owner = "client!nc", name = "U", descriptor = "Ljava/lang/String;")
    public String field1688;

    @OriginalMember(owner = "client!nc", name = "Y", descriptor = "Lci;")
    public class327 field1692;

    @OriginalMember(owner = "client!nc", name = "V", descriptor = "Ljava/lang/String;")
    public static String field1689 = "Cancel";

    @OriginalMember(owner = "client!nc", name = "P", descriptor = "I")
    public static int field1683 = 0;

    @OriginalMember(owner = "client!nc", name = "J", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!nc", name = "M", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!nc", name = "N", descriptor = "I")
    public static int field1681;

    @OriginalMember(owner = "client!nc", name = "O", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!nc", name = "S", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!nc", name = "W", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!nc", name = "ab", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!nc", name = "bb", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!nc", name = "db", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!nc", name = "eb", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!nc", name = "K", descriptor = "[Lml;")
    public static class17[] field1678;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(B)V", line = 4)
    public static void method798(byte arg0) {
        if (arg0 == 63) {
            field1689 = null;
            field1678 = null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(BI)Ljava/lang/String;", line = 15)
    public static final String method799(byte arg0, int arg1) {
        field1680++;
        if (arg1 < 100000) {
            return "<col=ffff00>" + arg1 + "</col>";
        } else {
            if (arg0 >= -10) {
                field1683 = 55;
            }
            return arg1 >= 10000000 ? "<col=00ff80>" + arg1 / 1000000 + class46.field748 + "</col>" : "<col=ffffff>" + arg1 / 1000 + class352.field5583 + "</col>";
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIII[Lwf;IIIII)V", line = 34)
    public static final void method800(int arg0, int arg1, int arg2, int arg3, class250[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1682++;
        if (class42.field607) {
            class244.method1871(arg8, arg7, arg6, arg0);
        } else {
            class246.method1889(arg8, arg7, arg6, arg0);
            class153.method1179();
        }
        if (arg1 != -29153) {
            method806(true, (byte) -1, true, -58, true);
        }
        for (int var10 = 0; var10 < arg4.length; var10++) {
            class250 var11 = arg4[var10];
            if (var11 != null && (var11.field4086 == arg3 || arg3 == -1412584499 && class81.field1392 == var11)) {
                int var12;
                if (arg5 == -1) {
                    class54.field895[class183.field2955] = var11.field4147 + arg9;
                    class78.field1349[class183.field2955] = var11.field4213 + arg2;
                    class222.field3637[class183.field2955] = var11.field4081;
                    class358.field5685[class183.field2955] = var11.field4157;
                    var12 = class183.field2955++;
                } else {
                    var12 = arg5;
                }
                var11.field4165 = var12;
                var11.field4203 = class332.field5261;
                if (!var11.field4205 || !client.method362(var11)) {
                    if (var11.field4134 > 0) {
                        class51.method397(false, var11);
                    }
                    int var13 = var11.field4147 + arg9;
                    int var14 = var11.field4213 + arg2;
                    int var15 = var11.field4087;
                    if (class178.field2857 && (client.method336(var11).field1710 != 0 || var11.field4078 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class81.field1392 == var11) {
                        if (arg3 != -1412584499 && !var11.field4091) {
                            class156.field2470 = arg4;
                            class98.field1610 = arg2;
                            class75.field1282 = arg9;
                            continue;
                        }
                        if (class86.field1460 && class352.field5587) {
                            int var16 = class333.field5275;
                            int var17 = class77.field1343;
                            int var18 = var16 - class205.field3239;
                            int var19 = var17 - class252.field4268;
                            if (class77.field1344 > var18) {
                                var18 = class77.field1344;
                            }
                            if (class77.field1344 + class176.field2828.field4081 < var18 - -var11.field4081) {
                                var18 = class77.field1344 - (var11.field4081 - class176.field2828.field4081);
                            }
                            var13 = var18;
                            if (class295.field4750 > var19) {
                                var19 = class295.field4750;
                            }
                            if ((var11.field4157 + var19) > (class295.field4750 + class176.field2828.field4157)) {
                                var19 = class295.field4750 + class176.field2828.field4157 - var11.field4157;
                            }
                            var14 = var19;
                        }
                        if (!var11.field4091) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.field4078 == 2) {
                        var20 = arg7;
                        var21 = arg0;
                        var22 = arg6;
                        var23 = arg8;
                    } else {
                        var23 = arg8 < var13 ? var13 : arg8;
                        int var24 = var11.field4081 + var13;
                        var20 = var14 > arg7 ? var14 : arg7;
                        int var25 = var11.field4157 + var14;
                        if (var11.field4078 == 9) {
                            var24++;
                            var25++;
                        }
                        var21 = arg0 > var25 ? var25 : arg0;
                        var22 = var24 < arg6 ? var24 : arg6;
                    }
                    if (!var11.field4205 || var22 > var23 && var21 > var20) {
                        if (var11.field4134 != 0) {
                            if (var11.field4134 == 1337 || var11.field4134 == 1403) {
                                class14.field153 = var11;
                                class237.field3924 = var14;
                                class220.field3494 = var13;
                                class252.method1954(var11.field4134 == 1403, var13, (byte) -65, var14, var11.field4081, var11.field4157);
                                class270.field4498[var12] = true;
                                if (class42.field607) {
                                    class244.method1871(arg8, arg7, arg6, arg0);
                                } else {
                                    class246.method1889(arg8, arg7, arg6, arg0);
                                }
                                continue;
                            }
                            if (var11.field4134 == 1338) {
                                if (!var11.method1933(-1)) {
                                    continue;
                                }
                                class77.method639(var13, var11, var14, var12, arg1 ^ 0x71E1);
                                if (class42.field607) {
                                    class244.method1871(arg8, arg7, arg6, arg0);
                                } else {
                                    class246.method1889(arg8, arg7, arg6, arg0);
                                }
                                if (class338.field5387 != 0 && class338.field5387 != 3 || class358.field5687 || var23 > class45.field695 || var20 > class196.field3144 || var22 <= class45.field695 || class196.field3144 >= var21) {
                                    continue;
                                }
                                int var26 = class196.field3144 - var14;
                                int var27 = var11.field4208[var26];
                                int var28 = class45.field695 - var13;
                                if (var28 < var27 || var28 > (var27 + var11.field4188[var26])) {
                                    continue;
                                }
                                int var29 = var26 - var11.field4157 / 2;
                                int var30 = var28 - var11.field4081 / 2;
                                int var31;
                                if (class112.field1827 == 4) {
                                    var31 = (int) class261.field4396 & 0x7FF;
                                } else {
                                    var31 = (int) class261.field4396 + class79.field1372 & 0x7FF;
                                }
                                int var32 = class153.field2438[var31];
                                int var33 = class153.field2445[var31];
                                if (class112.field1827 != 4) {
                                    var33 = (class4.field41 + 256) * var33 >> 8;
                                    var32 = (class4.field41 + 256) * var32 >> 8;
                                }
                                int var34 = var29 * var32 + var30 * var33 >> 11;
                                int var35 = var29 * var33 - (var30 * var32) >> 11;
                                int var36;
                                int var37;
                                if (class112.field1827 == 4) {
                                    var36 = class350.field5565 + var34 >> 7;
                                    var37 = class240.field3954 - var35 >> 7;
                                } else {
                                    var36 = class6.field55.field3577 - ((class6.field55.method1634(-1) * 64) - var34 - 64) >> 7;
                                    var37 = class6.field55.field3511 - var35 - (class6.field55.method1634(-1) + -1) * 64 >> 7;
                                }
                                if (class227.field3789 && (class6.field48 & 0x40) != 0) {
                                    class250 var38 = class25.method165(class209.field3297, class275.field4549, 24836);
                                    if (var38 == null) {
                                        class57.method473((byte) 89);
                                    } else {
                                        class55.method434(var37, field1690, false, 1L, " ->", var36, class324.field5160, (short) 49);
                                    }
                                    continue;
                                }
                                if (class131.field2212 == 1) {
                                    class55.method434(var37, -1, false, 1L, "", var36, class176.field2819, (short) 44);
                                }
                                class55.method434(var37, -1, false, 1L, "", var36, class51.field800, (short) 48);
                                continue;
                            }
                            if (var11.field4134 == 1339) {
                                if (var11.method1933(-1)) {
                                    class64.method556(256, var13, var11, var14, var12);
                                    if (class42.field607) {
                                        class244.method1871(arg8, arg7, arg6, arg0);
                                    } else {
                                        class246.method1889(arg8, arg7, arg6, arg0);
                                    }
                                }
                                continue;
                            }
                            if (var11.field4134 == 1400) {
                                class27.method171(var11.field4081, var14, var11.field4157, 125, var13);
                                class270.field4498[var12] = true;
                                class12.field115[var12] = true;
                                if (class42.field607) {
                                    class244.method1871(arg8, arg7, arg6, arg0);
                                } else {
                                    class246.method1889(arg8, arg7, arg6, arg0);
                                }
                                continue;
                            }
                            if (var11.field4134 == 1401) {
                                class175.method1379(var11.field4081, 29932, var11.field4157, var14, var13);
                                class270.field4498[var12] = true;
                                class12.field115[var12] = true;
                                if (class42.field607) {
                                    class244.method1871(arg8, arg7, arg6, arg0);
                                } else {
                                    class246.method1889(arg8, arg7, arg6, arg0);
                                }
                                continue;
                            }
                            if (var11.field4134 == 1402) {
                                if (!class42.field607) {
                                    class222.method1679(var14, var13, 53);
                                    class270.field4498[var12] = true;
                                    class12.field115[var12] = true;
                                }
                                continue;
                            }
                            if (var11.field4134 == 1405) {
                                if (!class16.field185) {
                                    continue;
                                }
                                int var39 = var14 + 15;
                                int var40 = var11.field4081 + var13;
                                int var41 = 16776960;
                                class343.field5466.method1324("Fps:" + class141.field2308, var40, var39, 16776960, -1);
                                int var140 = var39 + 15;
                                Runtime var42 = Runtime.getRuntime();
                                int var43 = (int) ((var42.totalMemory() - var42.freeMemory()) / 1024L);
                                if (var43 > 65536) {
                                    var41 = 16711680;
                                }
                                class343.field5466.method1324("Mem:" + var43 + "k", var40, var140, var41, -1);
                                var39 = var140 + 15;
                                if (class42.field607) {
                                    int var44 = 16776960;
                                    int var45 = (class199.field3174 + class199.field3173 + class199.field3169) / 1024;
                                    if (var45 > 65536) {
                                        var44 = 16711680;
                                    }
                                    class343.field5466.method1324("Card:" + var45 + "k", var40, var39, var44, -1);
                                    var39 += 15;
                                }
                                int var46 = 16776960;
                                int var47 = 0;
                                int var48 = 0;
                                int var49 = 0;
                                for (int var50 = 0; var50 < 29; var50++) {
                                    var47 += class261.field4402[var50].method716((byte) 115);
                                    var49 += class261.field4402[var50].method708(arg1 + 29063);
                                    var48 += class261.field4402[var50].method710(arg1 ^ 0x719F);
                                }
                                int var51 = var48 * 100 / var47;
                                int var52 = var49 * 10000 / var47;
                                String var53 = "Cache:" + class323.method2283(4, 2, 0, true, (long) var52) + "% (" + var51 + "%)";
                                class286.field4663.method1324(var53, var40, var39, var46, -1);
                                var39 += 12;
                                if (class158.field2490 > 0) {
                                    class286.field4663.method1324("Particles: " + class158.field2496 + " / " + class158.field2490, var40, var39, var46, -1);
                                }
                                var39 += 12;
                                class270.field4498[var12] = true;
                                class12.field115[var12] = true;
                                continue;
                            }
                            if (var11.field4134 == 1406) {
                                class181.field2891 = var11;
                                class66.field1167 = var14;
                                class180.field2881 = var13;
                                continue;
                            }
                        }
                        if (!class358.field5687) {
                            if (var11.field4078 == 0 && var11.field4145 && class45.field695 >= var23 && class196.field3144 >= var20 && var22 > class45.field695 && class196.field3144 < var21 && !class178.field2857) {
                                field1683 = 1;
                                class22.field249[0] = field1689;
                                class149.field2379[0] = class232.field3847;
                                class200.field3193[0] = "";
                                class51.field810[0] = 1003;
                            }
                            if (class45.field695 >= var23 && var20 <= class196.field3144 && class45.field695 < var22 && var21 > class196.field3144) {
                                class156.method1215(var11, class45.field695 - var13, class196.field3144 - var14, arg1 ^ 0xFFFFDF60);
                            }
                        }
                        if (var11.field4078 == 0) {
                            if (!var11.field4205 && client.method362(var11) && class36.field551 != var11) {
                                continue;
                            }
                            if (!var11.field4205) {
                                if (var11.field4120 > (var11.field4201 - var11.field4157)) {
                                    var11.field4120 = var11.field4201 - var11.field4157;
                                }
                                if (var11.field4120 < 0) {
                                    var11.field4120 = 0;
                                }
                            }
                            if (class42.field607 && var11.field4134 == 1407) {
                                class68.method575(var13, var14, var11.field4081, var11.field4157);
                            }
                            method800(var21, arg1, -var11.field4120 + var14, var11.field4167, arg4, var12, var22, var20, var23, var13 - var11.field4225);
                            if (var11.field4171 != null) {
                                method800(var21, -29153, var14 - var11.field4120, var11.field4167, var11.field4171, var12, var22, var20, var23, var13 - var11.field4225);
                            }
                            class259 var54 = (class259) class226.field3723.method1268(-124, (long) var11.field4167);
                            if (var54 != null) {
                                if (var54.field4356 == 0 && !class358.field5687 && var23 <= class45.field695 && class196.field3144 >= var20 && var22 > class45.field695 && class196.field3144 < var21 && !class178.field2857) {
                                    class22.field249[0] = field1689;
                                    class51.field810[0] = 1003;
                                    field1683 = 1;
                                    class200.field3193[0] = "";
                                    class149.field2379[0] = class232.field3847;
                                }
                                class20.method118(var22, (byte) -91, var12, var23, var20, var14, var21, var13, var54.field4358);
                            }
                            if (class42.field607 && var11.field4134 == 1407) {
                                class68.method574();
                                class63.field1132 = true;
                            }
                            if (class42.field607) {
                                class244.method1871(arg8, arg7, arg6, arg0);
                            } else {
                                class246.method1889(arg8, arg7, arg6, arg0);
                                class153.method1179();
                            }
                        }
                        if (class2.field13[var12] || class296.field4764 > 1) {
                            if (var11.field4078 == 0 && !var11.field4205 && var11.field4157 < var11.field4201) {
                                class112.method851(var11.field4120, -6237, var11.field4081 + var13, var11.field4157, var14, var11.field4201);
                            }
                            if (var11.field4078 != 1) {
                                if (var11.field4078 == 2) {
                                    int var123 = 0;
                                    for (int var124 = 0; var124 < var11.field4113; var124++) {
                                        for (int var125 = 0; var125 < var11.field4200; var125++) {
                                            int var126 = var13 + ((var11.field4169 + 32) * var125);
                                            int var127 = (var11.field4196 + 32) * var124 + var14;
                                            if (var123 < 20) {
                                                var126 += var11.field4110[var123];
                                                var127 += var11.field4075[var123];
                                            }
                                            if (var11.field4233[var123] > 0) {
                                                boolean var128 = false;
                                                boolean var129 = false;
                                                int var130 = var11.field4233[var123] - 1;
                                                if ((var126 + 32) > arg8 && var126 < arg6 && var127 + 32 > arg7 && var127 < arg0 || class123.field2114 == var11 && class297.field4771 == var123) {
                                                    class17 var131;
                                                    if (class16.field186 == 1 && class17.field202 == var123 && class77.field1345 == var11.field4167) {
                                                        var131 = class343.method2420(var130, var11.field4177[var123], 32767, 0, var11.field4187, (class115) null, 2);
                                                    } else {
                                                        var131 = class343.method2420(var130, var11.field4177[var123], 32767, 3153952, var11.field4187, (class115) null, 1);
                                                    }
                                                    if (class153.field2443) {
                                                        class270.field4498[var12] = true;
                                                    }
                                                    if (var131 == null) {
                                                        class205.method1568(var11, (byte) 115);
                                                    } else if (class123.field2114 == var11 && class297.field4771 == var123) {
                                                        int var132 = class77.field1343 - class121.field2035;
                                                        int var133 = class333.field5275 - class70.field1216;
                                                        if (var133 < 5 && var133 > -5) {
                                                            var133 = 0;
                                                        }
                                                        if (var132 < 5 && var132 > -5) {
                                                            var132 = 0;
                                                        }
                                                        if (class90.field1542 < 5) {
                                                            var133 = 0;
                                                            var132 = 0;
                                                        }
                                                        var131.method92(var126 + var133, var127 + var132, 128);
                                                        if (arg3 != -1) {
                                                            class250 var134 = arg4[arg3 & 0xFFFF];
                                                            int var135;
                                                            int var136;
                                                            if (class42.field607) {
                                                                var136 = class244.field4007;
                                                                var135 = class244.field4005;
                                                            } else {
                                                                var135 = class246.field4038;
                                                                var136 = class246.field4039;
                                                            }
                                                            if (var127 + var132 < var135 && var134.field4120 > 0) {
                                                                int var137 = (var135 - var132 - var127) * class272.field4516 / 3;
                                                                if (var137 > class272.field4516 * 10) {
                                                                    var137 = class272.field4516 * 10;
                                                                }
                                                                if (var134.field4120 < var137) {
                                                                    var137 = var134.field4120;
                                                                }
                                                                var134.field4120 -= var137;
                                                                class121.field2035 += var137;
                                                                class205.method1568(var134, (byte) 117);
                                                            }
                                                            if (var132 + var127 + 32 > var136 && var134.field4120 < (var134.field4201 - var134.field4157)) {
                                                                int var138 = (var127 + var132 + 32 - var136) * class272.field4516 / 3;
                                                                if ((class272.field4516 * 10) < var138) {
                                                                    var138 = class272.field4516 * 10;
                                                                }
                                                                if (var138 > var134.field4201 - var134.field4157 - var134.field4120) {
                                                                    var138 = var134.field4201 - var134.field4120 - var134.field4157;
                                                                }
                                                                var134.field4120 += var138;
                                                                class121.field2035 -= var138;
                                                                class205.method1568(var134, (byte) 126);
                                                            }
                                                        }
                                                    } else if (class252.field4257 == var11 && class291.field4702 == var123) {
                                                        var131.method92(var126, var127, 128);
                                                    } else {
                                                        var131.method89(var126, var127);
                                                    }
                                                }
                                            } else if (var11.field4216 != null && var123 < 20) {
                                                class17 var139 = var11.method1938(var123, -119);
                                                if (var139 != null) {
                                                    var139.method89(var126, var127);
                                                } else if (class172.field2758) {
                                                    class205.method1568(var11, (byte) 127);
                                                }
                                            }
                                            var123++;
                                        }
                                    }
                                } else if (var11.field4078 == 3) {
                                    int var55;
                                    if (class243.method1848((byte) 92, var11)) {
                                        var55 = var11.field4194;
                                        if (class36.field551 == var11 && var11.field4239 != 0) {
                                            var55 = var11.field4239;
                                        }
                                    } else {
                                        var55 = var11.field4068;
                                        if (class36.field551 == var11 && var11.field4237 != 0) {
                                            var55 = var11.field4237;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var11.field4061) {
                                            if (class42.field607) {
                                                class244.method1862(var13, var14, var11.field4081, var11.field4157, var55);
                                            } else {
                                                class246.method1885(var13, var14, var11.field4081, var11.field4157, var55);
                                            }
                                        } else if (class42.field607) {
                                            class244.method1865(var13, var14, var11.field4081, var11.field4157, var55);
                                        } else {
                                            class246.method1881(var13, var14, var11.field4081, var11.field4157, var55);
                                        }
                                    } else if (var11.field4061) {
                                        if (class42.field607) {
                                            class244.method1872(var13, var14, var11.field4081, var11.field4157, var55, 256 - (var15 & 0xFF));
                                        } else {
                                            class246.method1905(var13, var14, var11.field4081, var11.field4157, var55, 256 - (var15 & 0xFF));
                                        }
                                    } else if (class42.field607) {
                                        class244.method1869(var13, var14, var11.field4081, var11.field4157, var55, 256 - (var15 & 0xFF));
                                    } else {
                                        class246.method1878(var13, var14, var11.field4081, var11.field4157, var55, 256 - (var15 & 0xFF));
                                    }
                                } else if (var11.field4078 == 4) {
                                    class171 var119 = var11.method1941(class34.field504, 65535);
                                    if (var119 != null) {
                                        String var120 = var11.field4168;
                                        int var121;
                                        if (class243.method1848((byte) 91, var11)) {
                                            var121 = var11.field4194;
                                            if (class36.field551 == var11 && var11.field4239 != 0) {
                                                var121 = var11.field4239;
                                            }
                                            if (var11.field4228.length() > 0) {
                                                var120 = var11.field4228;
                                            }
                                        } else {
                                            var121 = var11.field4068;
                                            if (class36.field551 == var11 && var11.field4237 != 0) {
                                                var121 = var11.field4237;
                                            }
                                        }
                                        if (var11.field4205 && var11.field4231 != -1) {
                                            class52 var122 = class6.method22(var11.field4231, arg1 + 45583);
                                            var120 = var122.field871;
                                            if (var120 == null) {
                                                var120 = "null";
                                            }
                                            if ((var122.field884 == 1 || var11.field4176 != 1) && var11.field4176 != -1) {
                                                var120 = "<col=ff9040>" + var120 + "</col> x" + class317.method2245(var11.field4176, 111);
                                            }
                                        }
                                        if (class187.field3005 == var11) {
                                            var120 = class129.field2186;
                                            var121 = var11.field4068;
                                        }
                                        if (!var11.field4205) {
                                            var120 = class113.method858(var120, -122, var11);
                                        }
                                        var119.method1340(var120, var13, var14, var11.field4081, var11.field4157, var121, var11.field4185 ? 0 : -1, var11.field4123, var11.field4209, var11.field4126);
                                    } else if (class172.field2758) {
                                        class205.method1568(var11, (byte) 121);
                                    }
                                } else if (var11.field4078 == 5) {
                                    if (!var11.field4205) {
                                        class17 var56 = var11.method1940((byte) -53, class243.method1848((byte) 117, var11));
                                        if (var56 != null) {
                                            var56.method89(var13, var14);
                                        } else if (class172.field2758) {
                                            class205.method1568(var11, (byte) 115);
                                        }
                                    } else if (var11.field4106 >= 0) {
                                        class359 var57 = var11.method1942((byte) -40);
                                        if (class42.field607) {
                                            var57.method2529(0, var13, var14, var11.field4081, var11.field4157, var11.field4083, var11.field4109, 0);
                                        } else {
                                            var57.method2525(0, var13, var14, var11.field4081, var11.field4157, var11.field4083, var11.field4109, 0);
                                        }
                                    } else {
                                        class17 var58;
                                        if (var11.field4231 == -1) {
                                            var58 = var11.method1940((byte) -91, false);
                                        } else if (var11.field4193 && class6.field55.field4316 != null) {
                                            var58 = class343.method2420(var11.field4231, var11.field4176, 32767, var11.field4125, var11.field4187, class6.field55.field4316, var11.field4224);
                                        } else {
                                            var58 = class343.method2420(var11.field4231, var11.field4176, arg1 ^ 0xFFFFF1E0, var11.field4125, var11.field4187, (class115) null, var11.field4224);
                                        }
                                        if (var58 != null) {
                                            int var59 = var58.field198;
                                            int var60 = var58.field201;
                                            if (var11.field4124) {
                                                int var61 = (var59 + var11.field4081 - 1) / var59;
                                                int var62 = (var60 + var11.field4157 - 1) / var60;
                                                if (class42.field607) {
                                                    class244.method1859(var13, var14, var11.field4081 + var13, var11.field4157 + var14);
                                                    boolean var63 = class157.method1217(-113, var58.field197);
                                                    boolean var64 = class157.method1217(-127, var58.field199);
                                                    class58 var65 = (class58) var58;
                                                    if (var63 && var64) {
                                                        if (var15 == 0) {
                                                            var65.method491(var13, var14, var61, var62);
                                                        } else {
                                                            var65.method492(var13, var14, 256 - (var15 & 0xFF), var61, var62);
                                                        }
                                                    } else if (var63) {
                                                        for (int var66 = 0; var66 < var62; var66++) {
                                                            if (var15 == 0) {
                                                                var65.method491(var13, var60 * var66 + var14, var61, 1);
                                                            } else {
                                                                var65.method492(var13, var60 * var66 + var14, -(var15 & 0xFF) + 256, var61, 1);
                                                            }
                                                        }
                                                    } else if (var64) {
                                                        for (int var67 = 0; var67 < var61; var67++) {
                                                            if (var15 == 0) {
                                                                var65.method491(var59 * var67 + var13, var14, 1, var62);
                                                            } else {
                                                                var65.method492(var59 * var67 + var13, var14, 256 - (var15 & 0xFF), 1, var62);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var68 = 0; var68 < var61; var68++) {
                                                            for (int var69 = 0; var69 < var62; var69++) {
                                                                if (var15 == 0) {
                                                                    var58.method89(var59 * var68 + var13, var14 - -(var60 * var69));
                                                                } else {
                                                                    var58.method92(var59 * var68 + var13, var14 - -(var60 * var69), 256 - (var15 & 0xFF));
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class244.method1871(arg8, arg7, arg6, arg0);
                                                } else {
                                                    class246.method1884(var13, var14, var11.field4081 + var13, var11.field4157 + var14);
                                                    for (int var70 = 0; var70 < var61; var70++) {
                                                        for (int var71 = 0; var71 < var62; var71++) {
                                                            if (var11.field4122 != 0) {
                                                                var58.method98(var60 / 2 + var60 * var71 + var14, var11.field4122, (byte) -97, var59 / 2 + var59 * var70 + var13, 4096);
                                                            } else if (var15 == 0) {
                                                                var58.method89(var59 * var70 + var13, var14 - -(var60 * var71));
                                                            } else {
                                                                var58.method92(var59 * var70 + var13, var14 - -(var60 * var71), 256 - (var15 & 0xFF));
                                                            }
                                                        }
                                                    }
                                                    class246.method1889(arg8, arg7, arg6, arg0);
                                                }
                                            } else {
                                                int var72 = var11.field4081 * 4096 / var59;
                                                if (var11.field4122 != 0) {
                                                    var58.method98(var14 + (var11.field4157 / 2), var11.field4122, (byte) -77, var13 + (var11.field4081 / 2), var72);
                                                } else if (var15 != 0) {
                                                    var58.method94(var13, var14, var11.field4081, var11.field4157, 256 - (var15 & 0xFF));
                                                } else if (var11.field4081 == var59 && var11.field4157 == var60) {
                                                    var58.method89(var13, var14);
                                                } else {
                                                    var58.method90(var13, var14, var11.field4081, var11.field4157);
                                                }
                                            }
                                        } else if (class172.field2758) {
                                            class205.method1568(var11, (byte) 116);
                                        }
                                    }
                                } else if (var11.field4078 == 6) {
                                    boolean var100 = class243.method1848((byte) 113, var11);
                                    int var101;
                                    if (var100) {
                                        var101 = var11.field4104;
                                    } else {
                                        var101 = var11.field4063;
                                    }
                                    int var102 = 0;
                                    class96 var103 = null;
                                    if (var11.field4231 != -1) {
                                        class52 var108 = class6.method22(var11.field4231, arg1 ^ 0xFFFFCE31);
                                        if (var108 != null) {
                                            class52 var109 = var108.method413(-1, var11.field4176);
                                            class43 var110 = var101 == -1 ? null : class198.method1524(var101, -48);
                                            if (var11.field4193 && class6.field55.field4316 != null) {
                                                var103 = var109.method411(var11.field4135, var11.field4116, 1, class6.field55.field4316, var110, var11.field4114, -129);
                                            } else {
                                                var103 = var109.method411(var11.field4135, var11.field4116, 1, (class115) null, var110, var11.field4114, -129);
                                            }
                                            if (var103 == null) {
                                                class205.method1568(var11, (byte) 126);
                                            } else {
                                                var102 = -var103.method444() / 2;
                                            }
                                        }
                                    } else if (var11.field4197 == 5) {
                                        if (var11.field4238 == -1) {
                                            var103 = class241.field3978.method897((class43) null, 0, (class43) null, (byte) -82, -1, -1, true, -1, -1, false, 0, (class194[]) null);
                                        } else {
                                            int var104 = var11.field4238;
                                            class258 var105;
                                            if (class261.field4399 == var104) {
                                                var105 = class6.field55;
                                            } else {
                                                var105 = class56.field924[var104];
                                            }
                                            class43 var106 = var101 == -1 ? null : class198.method1524(var101, 103);
                                            if (var105 != null && (var104 == 2047 || class71.method610(var105.field4349, (byte) -124) == var11.field4222)) {
                                                var103 = var105.field4316.method897((class43) null, 0, var106, (byte) -59, -1, var11.field4116, true, -1, 0, false, 0, (class194[]) null);
                                            }
                                        }
                                    } else if (var101 == -1) {
                                        var103 = var11.method1935(-1, class6.field55.field4316, -1, 0, 0, var100, (class43) null);
                                        if (var103 == null && class172.field2758) {
                                            class205.method1568(var11, (byte) 124);
                                        }
                                    } else {
                                        class43 var107 = class198.method1524(var101, 108);
                                        var103 = var11.method1935(var11.field4116, class6.field55.field4316, var11.field4135, 0, var11.field4114, var100, var107);
                                        if (var103 == null && class172.field2758) {
                                            class205.method1568(var11, (byte) 127);
                                        }
                                    }
                                    if (var103 != null) {
                                        int var111;
                                        if (var11.field4070 > 0) {
                                            var111 = (var11.field4081 << 8) / var11.field4070;
                                        } else {
                                            var111 = 256;
                                        }
                                        int var112 = (var11.field4195 * var111 >> 8) + var11.field4081 / 2 + var13;
                                        int var113;
                                        if (var11.field4127 <= 0) {
                                            var113 = 256;
                                        } else {
                                            var113 = (var11.field4157 << 8) / var11.field4127;
                                        }
                                        int var114 = (var11.field4131 * var113 >> 8) + var11.field4157 / 2 + var14;
                                        if (class42.field607) {
                                            if (var11.field4064) {
                                                class42.method301(var112, var114, var11.field4240, var11.field4152, var111, var113);
                                            } else {
                                                class42.method302(var112, var114, var111, var113);
                                                class42.method300((float) var11.field4121, (float) var11.field4152 * 1.5F);
                                            }
                                            class42.method287();
                                            class42.method278(true);
                                            class42.method286(false);
                                            class184.method1451(class166.field2649, 0);
                                            if (class63.field1132) {
                                                class244.method1863();
                                                class42.method308();
                                                class244.method1871(arg8, arg7, arg6, arg0);
                                                class63.field1132 = false;
                                            }
                                            if (var11.field4072) {
                                                class42.method279();
                                            }
                                            int var115 = class153.field2445[var11.field4084] * var11.field4240 >> 16;
                                            int var116 = class153.field2438[var11.field4084] * var11.field4240 >> 16;
                                            if (var11.field4205) {
                                                var103.method534(0, var11.field4139, var11.field4085, var11.field4084, var11.field4172, var11.field4174 + var102 + var116, var11.field4174 + var115, -1L);
                                            } else {
                                                var103.method534(0, var11.field4139, 0, var11.field4084, 0, var116, var115, -1L);
                                            }
                                            if (var11.field4072) {
                                                class42.method282();
                                            }
                                        } else {
                                            class153.method1190(var112, var114);
                                            int var117 = class153.field2438[var11.field4084] * var11.field4240 >> 16;
                                            int var118 = class153.field2445[var11.field4084] * var11.field4240 >> 16;
                                            if (!var11.field4205) {
                                                var103.method534(0, var11.field4139, 0, var11.field4084, 0, var117, var118, -1L);
                                            } else if (var11.field4064) {
                                                ((class62) var103).method538(0, var11.field4139, var11.field4085, var11.field4084, var11.field4172, var102 + var117 + var11.field4174, var11.field4174 + var118, var11.field4240);
                                            } else {
                                                var103.method534(0, var11.field4139, var11.field4085, var11.field4084, var11.field4172, var117 + var11.field4174 + var102, var11.field4174 + var118, -1L);
                                            }
                                            class153.method1192();
                                        }
                                    }
                                } else {
                                    if (var11.field4078 == 7) {
                                        class171 var73 = var11.method1941(class34.field504, 65535);
                                        if (var73 == null) {
                                            if (class172.field2758) {
                                                class205.method1568(var11, (byte) 121);
                                            }
                                            continue;
                                        }
                                        int var74 = 0;
                                        for (int var75 = 0; var75 < var11.field4113; var75++) {
                                            for (int var76 = 0; var76 < var11.field4200; var76++) {
                                                if (var11.field4233[var74] > 0) {
                                                    class52 var77 = class6.method22(var11.field4233[var74] - 1, 16430);
                                                    String var78;
                                                    if (var77.field884 != 1 && var11.field4177[var74] == 1) {
                                                        var78 = "<col=ff9040>" + var77.field871 + "</col>";
                                                    } else {
                                                        var78 = "<col=ff9040>" + var77.field871 + "</col> x" + class317.method2245(var11.field4177[var74], 21);
                                                    }
                                                    int var79 = (var11.field4169 + 115) * var76 + var13;
                                                    int var80 = var14 + ((var11.field4196 + 12) * var75);
                                                    if (var11.field4123 == 0) {
                                                        var73.method1332(var78, var79, var80, var11.field4068, var11.field4185 ? 0 : -1);
                                                    } else if (var11.field4123 == 1) {
                                                        var73.method1328(var78, var79 + 57, var80, var11.field4068, var11.field4185 ? 0 : -1);
                                                    } else {
                                                        var73.method1324(var78, var79 + 115 - 1, var80, var11.field4068, var11.field4185 ? 0 : -1);
                                                    }
                                                }
                                                var74++;
                                            }
                                        }
                                    }
                                    if (var11.field4078 == 8 && class352.field5579 == var11 && class352.field5574 == class23.field278) {
                                        int var81 = 0;
                                        int var82 = 0;
                                        class171 var83 = class343.field5466;
                                        String var84 = var11.field4168;
                                        String var85 = class113.method858(var84, -128, var11);
                                        while (var85.length() > 0) {
                                            int var86 = var85.indexOf("<br>");
                                            String var87;
                                            if (var86 == -1) {
                                                var87 = var85;
                                                var85 = "";
                                            } else {
                                                var87 = var85.substring(0, var86);
                                                var85 = var85.substring(var86 + 4);
                                            }
                                            int var88 = var83.method1338(var87);
                                            if (var88 > var81) {
                                                var81 = var88;
                                            }
                                            var82 += var83.field2725 + 1;
                                        }
                                        var81 += 6;
                                        var82 += 7;
                                        int var89 = var13 + var11.field4081 - var81 - 5;
                                        int var90 = var14 + var11.field4157 + 5;
                                        if (var13 + 5 > var89) {
                                            var89 = var13 + 5;
                                        }
                                        if (arg6 < (var81 + var89)) {
                                            var89 = arg6 - var81;
                                        }
                                        if (arg0 < (var82 + var90)) {
                                            var90 = arg0 - var82;
                                        }
                                        if (class42.field607) {
                                            class244.method1862(var89, var90, var81, var82, 16777120);
                                            class244.method1865(var89, var90, var81, var82, 0);
                                        } else {
                                            class246.method1885(var89, var90, var81, var82, 16777120);
                                            class246.method1881(var89, var90, var81, var82, 0);
                                        }
                                        String var91 = var11.field4168;
                                        int var92 = var90 + var83.field2725 + 2;
                                        String var93 = class113.method858(var91, -115, var11);
                                        while (var93.length() > 0) {
                                            int var94 = var93.indexOf("<br>");
                                            String var95;
                                            if (var94 == -1) {
                                                var95 = var93;
                                                var93 = "";
                                            } else {
                                                var95 = var93.substring(0, var94);
                                                var93 = var93.substring(var94 + 4);
                                            }
                                            var83.method1332(var95, var89 + 3, var92, 0, -1);
                                            var92 += var83.field2725 + 1;
                                        }
                                    }
                                    if (var11.field4078 == 9) {
                                        int var96;
                                        int var97;
                                        int var98;
                                        int var99;
                                        if (var11.field4092) {
                                            var96 = var14;
                                            var97 = var11.field4081 + var13;
                                            var98 = var11.field4157 + var14;
                                            var99 = var13;
                                        } else {
                                            var99 = var13;
                                            var96 = var14 + var11.field4157;
                                            var98 = var14;
                                            var97 = var11.field4081 + var13;
                                        }
                                        if (var11.field4210 == 1) {
                                            if (class42.field607) {
                                                class244.method1858(var99, var98, var97, var96, var11.field4068);
                                            } else {
                                                class246.method1897(var99, var98, var97, var96, var11.field4068);
                                            }
                                        } else if (class42.field607) {
                                            class244.method1855(var99, var98, var97, var96, var11.field4068, var11.field4210);
                                        } else {
                                            class246.method1903(var99, var98, var97, var96, var11.field4068, var11.field4210);
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

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II[III)Z", line = 1358)
    public final boolean method801(int arg0, int arg1, int[] arg2, int arg3, int arg4) {
        field1697++;
        class160 var6 = (class160) this.field1692.method2300((byte) 126);
        if (arg1 != 0) {
            method806(true, (byte) -69, true, -90, true);
        }
        while (var6 != null) {
            if (var6.method1250(arg4, arg0, (byte) 114, arg3)) {
                var6.method1249(true, arg0, arg2, arg3);
                return true;
            }
            var6 = (class160) this.field1692.method2306(-23);
        }
        return false;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B[III)Z", line = 1387)
    public final boolean method802(byte arg0, int[] arg1, int arg2, int arg3) {
        field1681++;
        class160 var5 = (class160) this.field1692.method2300((byte) 103);
        int var6 = -20 / ((arg0 + 3) / 35);
        while (var5 != null) {
            if (var5.method1246(arg3, 2, arg2)) {
                var5.method1251((byte) -87, arg3, arg1, arg2);
                return true;
            }
            var5 = (class160) this.field1692.method2306(-23);
        }
        return false;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "([IIII)Z", line = 1411)
    public final boolean method803(int[] arg0, int arg1, int arg2, int arg3) {
        field1686++;
        for (class160 var5 = (class160) this.field1692.method2300((byte) 127); var5 != null; var5 = (class160) this.field1692.method2306(-23)) {
            if (var5.method1247(arg2, arg3, (byte) 22)) {
                var5.method1249(true, arg3, arg0, arg2);
                return true;
            }
        }
        if (arg1 != 256) {
            this.field1684 = -102;
        }
        return false;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(BII)Z", line = 1441)
    public final boolean method804(byte arg0, int arg1, int arg2) {
        field1694++;
        if (arg0 != -8) {
            return false;
        }
        for (class160 var4 = (class160) this.field1692.method2300((byte) 108); var4 != null; var4 = (class160) this.field1692.method2306(-23)) {
            if (var4.method1247(arg2, arg1, (byte) 22)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V", line = 1566)
    public class104(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6) {
        this.field1684 = arg0;
        this.field1679 = arg3;
        this.field1687 = arg4;
        this.field1691 = arg1;
        this.field1688 = arg2;
        this.field1693 = arg5;
        this.field1700 = arg6;
        if (this.field1700 == 255) {
            this.field1700 = 0;
        }
        this.field1692 = new class327();
    }

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "(I)V", line = 1494)
    public final void method805(int arg0) {
        this.field1676 = 0;
        field1695++;
        if (arg0 != 24619) {
            return;
        }
        this.field1696 = 0;
        this.field1685 = 12800;
        this.field1699 = 12800;
        for (class160 var2 = (class160) this.field1692.method2300((byte) 100); var2 != null; var2 = (class160) this.field1692.method2306(-23)) {
            if (this.field1696 < var2.field2545) {
                this.field1696 = var2.field2545;
            }
            if (this.field1676 < var2.field2553) {
                this.field1676 = var2.field2553;
            }
            if (this.field1685 > var2.field2557) {
                this.field1685 = var2.field2557;
            }
            if (var2.field2550 < this.field1699) {
                this.field1699 = var2.field2550;
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZBZIZ)Lth;", line = 1544)
    public static final class57 method806(boolean arg0, byte arg1, boolean arg2, int arg3, boolean arg4) {
        if (arg1 != -49) {
            method798((byte) 84);
        }
        field1698++;
        class302 var5 = null;
        if (class214.field3432 != null) {
            var5 = new class302(arg3, class214.field3432, class193.field3081[arg3], 1000000);
        }
        class261.field4402[arg3] = class233.field3880.method1946(arg3, false, var5, class340.field5430);
        if (arg2) {
            class261.field4402[arg3].method719((byte) -94);
        }
        return new class57(class261.field4402[arg3], arg4, arg0);
    }
}
