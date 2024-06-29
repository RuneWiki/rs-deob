import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class72 extends class40 {

    @OriginalMember(owner = "client!m", name = "y", descriptor = "Lec;")
    public static class28 field1598 = class28.method210(-46, "attack");

    @OriginalMember(owner = "client!m", name = "x", descriptor = "I")
    public static int field1597 = 0;

    @OriginalMember(owner = "client!m", name = "z", descriptor = "I")
    public static int field1599 = -1;

    @OriginalMember(owner = "client!m", name = "r", descriptor = "Z")
    public static boolean field1591 = false;

    @OriginalMember(owner = "client!m", name = "B", descriptor = "Lec;")
    public static class28 field1601 = class28.method210(-46, "Click to continue");

    @OriginalMember(owner = "client!m", name = "G", descriptor = "Lec;")
    public static class28 field1606 = class28.method210(-46, "Nov");

    @OriginalMember(owner = "client!m", name = "J", descriptor = "I")
    public static int field1609 = 0;

    @OriginalMember(owner = "client!m", name = "t", descriptor = "Lpa;")
    public static class91 field1593 = new class91(260);

    @OriginalMember(owner = "client!m", name = "L", descriptor = "Lec;")
    public static class28 field1611 = class28.method210(-46, "backleft1");

    @OriginalMember(owner = "client!m", name = "O", descriptor = "I")
    public static int field1614 = 1;

    @OriginalMember(owner = "client!m", name = "P", descriptor = "I")
    public static int field1615 = 0;

    @OriginalMember(owner = "client!m", name = "s", descriptor = "I")
    public static int field1592;

    @OriginalMember(owner = "client!m", name = "u", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!m", name = "v", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!m", name = "A", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!m", name = "C", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!m", name = "D", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!m", name = "H", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!m", name = "I", descriptor = "I")
    public static int field1608;

    @OriginalMember(owner = "client!m", name = "K", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!m", name = "M", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!m", name = "N", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!m", name = "E", descriptor = "Lm;")
    public class72 field1604;

    @OriginalMember(owner = "client!m", name = "F", descriptor = "Lm;")
    public class72 field1605;

    @OriginalMember(owner = "client!m", name = "w", descriptor = "Lbb;")
    public static class9 field1596;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Z)Lf;")
    public static final class31 method563(boolean arg0) {
        if (arg0) {
            return null;
        }
        field1602++;
        try {
            return (class31) Class.forName("ae").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class92();
        }
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(Z)V")
    public static final void method564(boolean arg0) {
        field1594++;
        if (class25.field545 == 118) {
            int var1 = class56.field1282.method879((byte) 45);
            int var2 = (var1 >> 4 & 0x7) + class37.field841;
            int var3 = class45.field1010 + (var1 & 0x7);
            int var4 = class56.field1282.method903(2);
            int var5 = class56.field1282.method879((byte) 45);
            int var6 = var5 >> 4 & 0xF;
            int var7 = var5 & 0x7;
            if (class37.field848.field1487[0] >= var2 - var6 && var2 + var6 >= class37.field848.field1487[0] && class37.field848.field1466[0] >= var3 - var6 && class37.field848.field1466[0] <= var3 + var6 && class50.field1176 != 0 && var7 > 0 && class76.field1701 < 50) {
                class42.field907[class76.field1701] = var4;
                class91.field1998[class76.field1701] = var7;
                class2.field25[class76.field1701] = 0;
                class122.field2621[class76.field1701] = null;
                class76.field1701++;
            }
        }
        if (class25.field545 == 69) {
            int var8 = class56.field1282.method879((byte) 45);
            int var9 = (var8 & 0x7) + class45.field1010;
            int var10 = (var8 >> 4 & 0x7) + class37.field841;
            int var11 = class56.field1282.method904(-31558) + var10;
            int var12 = class56.field1282.method904(-31558) + var9;
            int var13 = class56.field1282.method880((byte) 102);
            int var14 = class56.field1282.method903(2);
            int var15 = class56.field1282.method879((byte) 45) * 4;
            int var16 = class56.field1282.method879((byte) 45) * 4;
            int var17 = class56.field1282.method903(2);
            int var18 = class56.field1282.method903(2);
            int var19 = class56.field1282.method879((byte) 45);
            int var20 = class56.field1282.method879((byte) 45);
            if (var10 >= 0 && var9 >= 0 && var10 < 104 && var9 < 104 && var11 >= 0 && var12 >= 0 && var11 < 104 && var12 < 104 && var14 != 65535) {
                int var21 = var9 * 128 + 64;
                int var22 = var11 * 128 + 64;
                int var23 = var12 * 128 + 64;
                int var24 = var10 * 128 + 64;
                class47 var25 = new class47(var14, class122.field2657, var24, var21, class18.method107(var21, var24, -2049, class122.field2657) - var15, class83.field1888 + var17, class83.field1888 + var18, var19, var20, var13, var16);
                var25.method382((byte) -4, var23, class18.method107(var23, var22, -2049, class122.field2657) - var16, class83.field1888 + var17, var22);
                class93.field2044.method337(25563, var25);
            }
        } else if (class25.field545 == 56) {
            int var26 = class56.field1282.method859(7482);
            int var27 = class56.field1282.method862(-31050);
            int var28 = (var27 >> 4 & 0x7) + class37.field841;
            int var29 = class45.field1010 + (var27 & 0x7);
            int var30 = class56.field1282.method874(true);
            if (var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
                class34 var31 = new class34();
                var31.field764 = var26;
                var31.field766 = var30;
                if (class127.field2746[class122.field2657][var28][var29] == null) {
                    class127.field2746[class122.field2657][var28][var29] = new class42();
                }
                class127.field2746[class122.field2657][var28][var29].method337(25563, var31);
                class20.method137((byte) -109, var28, var29);
            }
        } else if (class25.field545 == 46) {
            int var32 = class56.field1282.method893((byte) 76);
            int var33 = class56.field1282.method859(7482);
            int var34 = class56.field1282.method874(true);
            int var35 = class56.field1282.method862(-31050);
            int var36 = class45.field1010 + (var35 & 0x7);
            int var37 = class37.field841 + (var35 >> 4 & 0x7);
            if (var37 >= 0 && var36 >= 0 && var37 < 104 && var36 < 104 && class32.field674 != var33) {
                class34 var38 = new class34();
                var38.field764 = var34;
                var38.field766 = var32;
                if (class127.field2746[class122.field2657][var37][var36] == null) {
                    class127.field2746[class122.field2657][var37][var36] = new class42();
                }
                class127.field2746[class122.field2657][var37][var36].method337(25563, var38);
                class20.method137((byte) -125, var37, var36);
            }
        } else if (class25.field545 == 129) {
            int var39 = class56.field1282.method874(true);
            int var40 = class56.field1282.method878((byte) -121);
            int var41 = var40 & 0x3;
            int var42 = var40 >> 2;
            int var43 = class110.field2321[var42];
            int var44 = class56.field1282.method900((byte) 127);
            int var45 = class37.field841 + (var44 >> 4 & 0x7);
            int var46 = (var44 & 0x7) + class45.field1010;
            if (var45 >= 0 && var46 >= 0 && var45 < 103 && var46 < 103) {
                int var47 = class118.field2523[class122.field2657][var45 + 1][var46];
                int var48 = class118.field2523[class122.field2657][var45][var46];
                int var49 = class118.field2523[class122.field2657][var45 + 1][var46 + 1];
                int var50 = class118.field2523[class122.field2657][var45][var46 + 1];
                if (var43 == 0) {
                    class48 var51 = class11.field179.method790(class122.field2657, var45, var46);
                    if (var51 != null) {
                        int var52 = var51.field1098 >> 14 & 0x7FFF;
                        if (var42 == 2) {
                            var51.field1113 = new class86(var52, 2, var41 + 4, var48, var47, var49, var50, var39, false);
                            var51.field1102 = new class86(var52, 2, var41 + 1 & 0x3, var48, var47, var49, var50, var39, false);
                        } else {
                            var51.field1113 = new class86(var52, var42, var41, var48, var47, var49, var50, var39, false);
                        }
                    }
                }
                if (var43 == 1) {
                    class8 var53 = class11.field179.method780(class122.field2657, var45, var46);
                    if (var53 != null) {
                        var53.field137 = new class86(var53.field131 >> 14 & 0x7FFF, 4, 0, var48, var47, var49, var50, var39, false);
                    }
                }
                if (var43 == 2) {
                    if (var42 == 11) {
                        var42 = 10;
                    }
                    class15 var54 = class11.field179.method806(class122.field2657, var45, var46);
                    if (var54 != null) {
                        var54.field281 = new class86(var54.field276 >> 14 & 0x7FFF, var42, var41, var48, var47, var49, var50, var39, false);
                    }
                }
                if (var43 == 3) {
                    class79 var55 = class11.field179.method781(class122.field2657, var45, var46);
                    if (var55 != null) {
                        var55.field1828 = new class86(var55.field1831 >> 14 & 0x7FFF, 22, var41, var48, var47, var49, var50, var39, false);
                    }
                }
            }
        } else if (class25.field545 == 244) {
            int var56 = class56.field1282.method874(true);
            int var57 = class56.field1282.method878((byte) -121);
            int var58 = (var57 >> 4 & 0x7) + class37.field841;
            int var59 = (var57 & 0x7) + class45.field1010;
            int var60 = class56.field1282.method862(-31050);
            int var61 = var60 >> 2;
            int var62 = var60 & 0x3;
            int var63 = class110.field2321[var61];
            if (var58 >= 0 && var59 >= 0 && var58 < 104 && var59 < 104) {
                class7.method34(var61, var63, var58, var56, 0, -16228, class122.field2657, var62, var59, -1);
            }
        } else if (arg0) {
            if (class25.field545 == 135) {
                int var64 = class56.field1282.method879((byte) 45);
                int var65 = (var64 & 0x7) + class45.field1010;
                int var66 = (var64 >> 4 & 0x7) + class37.field841;
                int var67 = class56.field1282.method903(2);
                int var68 = class56.field1282.method879((byte) 45);
                int var69 = class56.field1282.method903(2);
                if (var66 >= 0 && var65 >= 0 && var66 < 104 && var65 < 104) {
                    int var70 = var65 * 128 + 64;
                    int var71 = var66 * 128 + 64;
                    class56 var72 = new class56(var67, class122.field2657, var71, var70, class18.method107(var70, var71, -2049, class122.field2657) - var68, var69, class83.field1888);
                    class76.field1694.method337(25563, var72);
                }
            } else if (class25.field545 == 35) {
                int var73 = class56.field1282.method879((byte) 45);
                int var74 = class37.field841 + (var73 >> 4 & 0x7);
                int var75 = class45.field1010 + (var73 & 0x7);
                int var76 = class56.field1282.method879((byte) 45);
                int var77 = var76 & 0x3;
                int var78 = var76 >> 2;
                int var79 = class110.field2321[var78];
                if (var74 >= 0 && var75 >= 0 && var74 < 104 && var75 < 104) {
                    class7.method34(var78, var79, var74, -1, 0, -16228, class122.field2657, var77, var75, -1);
                }
            } else if (class25.field545 == 221) {
                int var80 = class56.field1282.method900((byte) 127);
                int var81 = (var80 & 0x7) + class45.field1010;
                int var82 = (var80 >> 4 & 0x7) + class37.field841;
                int var83 = class56.field1282.method903(2);
                if (var82 >= 0 && var81 >= 0 && var82 < 104 && var81 < 104) {
                    class42 var84 = class127.field2746[class122.field2657][var82][var81];
                    if (var84 != null) {
                        for (class34 var85 = (class34) var84.method326(0); var85 != null; var85 = (class34) var84.method325((byte) 118)) {
                            if ((var83 & 0x7FFF) == var85.field764) {
                                var85.method319((byte) -29);
                                break;
                            }
                        }
                        if (var84.method326(0) == null) {
                            class127.field2746[class122.field2657][var82][var81] = null;
                        }
                        class20.method137((byte) -117, var82, var81);
                    }
                }
            } else {
                if (class25.field545 == 21) {
                    int var86 = class56.field1282.method859(7482);
                    int var87 = class56.field1282.method900((byte) 127);
                    int var88 = class37.field841 + (var87 >> 4 & 0x7);
                    int var89 = class45.field1010 + (var87 & 0x7);
                    int var90 = class56.field1282.method893((byte) 87);
                    int var91 = class56.field1282.method900((byte) 127);
                    int var92 = var91 & 0x3;
                    int var93 = var91 >> 2;
                    int var94 = class110.field2321[var93];
                    byte var95 = class56.field1282.method872((byte) -35);
                    byte var96 = class56.field1282.method896(17275);
                    byte var97 = class56.field1282.method904(-31558);
                    byte var98 = class56.field1282.method896(17275);
                    int var99 = class56.field1282.method859(7482);
                    int var100 = class56.field1282.method874(arg0);
                    class43 var101;
                    if (class32.field674 == var86) {
                        var101 = class37.field848;
                    } else {
                        var101 = class129.field2779[var86];
                    }
                    if (var101 != null) {
                        class45 var102 = method566(var99, -119);
                        int var103 = class118.field2523[class122.field2657][var88 + 1][var89];
                        int var104 = class118.field2523[class122.field2657][var88][var89];
                        int var105 = class118.field2523[class122.field2657][var88 + 1][var89 + 1];
                        int var106 = class118.field2523[class122.field2657][var88][var89 + 1];
                        class33 var107 = var102.method362(var105, var92, var93, var106, var104, -121, var103);
                        if (var107 != null) {
                            class7.method34(0, var94, var88, -1, var90 + 1, -16228, class122.field2657, 0, var89, var100 + 1);
                            var101.field944 = var100 + class83.field1888;
                            int var108 = var102.field1002;
                            if (var96 < var98) {
                                byte var109 = var98;
                                var98 = var96;
                                var96 = var109;
                            }
                            var101.field948 = var107;
                            var101.field934 = class83.field1888 + var90;
                            int var110 = var102.field979;
                            if (var95 < var97) {
                                byte var111 = var97;
                                var97 = var95;
                                var95 = var111;
                            }
                            if (var92 == 1 || var92 == 3) {
                                var108 = var102.field979;
                                var110 = var102.field1002;
                            }
                            var101.field921 = var89 * 128 + var110 * 64;
                            var101.field945 = var88 * 128 + var108 * 64;
                            var101.field929 = class18.method107(var101.field921, var101.field945, -2049, class122.field2657);
                            var101.field938 = var88 + var98;
                            var101.field915 = var88 + var96;
                            var101.field911 = var89 + var97;
                            var101.field943 = var89 + var95;
                        }
                    }
                }
                if (class25.field545 == 63) {
                    int var112 = class56.field1282.method879((byte) 45);
                    int var113 = (var112 >> 4 & 0x7) + class37.field841;
                    int var114 = (var112 & 0x7) + class45.field1010;
                    int var115 = class56.field1282.method903(2);
                    int var116 = class56.field1282.method903(2);
                    int var117 = class56.field1282.method903(2);
                    if (var113 >= 0 && var114 >= 0 && var113 < 104 && var114 < 104) {
                        class42 var118 = class127.field2746[class122.field2657][var113][var114];
                        if (var118 != null) {
                            for (class34 var119 = (class34) var118.method326(0); var119 != null; var119 = (class34) var118.method325((byte) 125)) {
                                if ((var115 & 0x7FFF) == var119.field764 && var119.field766 == var116) {
                                    var119.field766 = var117;
                                    break;
                                }
                            }
                            class20.method137((byte) -115, var113, var114);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(Z)V")
    public static final void method565(boolean arg0) {
        field1600++;
        if (class21.field482 > 1) {
            class21.field482--;
        }
        if (client.field381 > 0) {
            client.field381--;
        }
        if (class129.field2773) {
            class129.field2773 = false;
            class64.method514(-23296);
            return;
        }
        for (int var1 = 0; var1 < 100 && class125.method963(false); var1++) {
        }
        if (class114.field2444 != 30 && class114.field2444 != 35) {
            return;
        }
        if (class88.field1947 && class114.field2444 == 30) {
            class40.field868 = 0;
            class36.field790 = 0;
            while (class7.method40(4625)) {
            }
            for (int var2 = 0; var2 < class74.field1634.length; var2++) {
                class74.field1634[var2] = false;
            }
        }
        class31.method251((byte) 113, 149, class5.field85);
        Object var3 = class45.field999.field199;
        synchronized (class45.field999.field199) {
            if (!class63.field1410) {
                class45.field999.field211 = 0;
            } else if (class40.field868 != 0 || class45.field999.field211 >= 40) {
                class5.field85.method161((byte) 121, 94);
                class57.field1303++;
                class5.field85.method888(0, 55);
                int var4 = class5.field85.field2554;
                int var5 = 0;
                for (int var6 = 0; var6 < class45.field999.field211 && class5.field85.field2554 - var4 < 240; var6++) {
                    var5++;
                    int var7 = class45.field999.field212[var6];
                    int var8 = class45.field999.field213[var6];
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 764) {
                        var8 = 764;
                    }
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 502) {
                        var7 = 502;
                    }
                    int var9 = var7 * 765 + var8;
                    if (class45.field999.field212[var6] == -1 && class45.field999.field213[var6] == -1) {
                        var8 = -1;
                        var9 = 524287;
                        var7 = -1;
                    }
                    if (client.field392 != var8 || class8.field147 != var7) {
                        int var10 = var7 - class8.field147;
                        class8.field147 = var7;
                        int var11 = var8 - client.field392;
                        client.field392 = var8;
                        if (class92.field2041 < 8 && var11 >= -32 && var11 <= 31 && var10 >= -32 && var10 <= 31) {
                            var11 += 32;
                            var10 += 32;
                            class5.field85.method876((byte) -48, (var11 << 6) + (class92.field2041 << 12) + var10);
                            class92.field2041 = 0;
                        } else if (class92.field2041 < 8) {
                            class5.field85.method873((byte) -108, (class92.field2041 << 19) + var9 + 8388608);
                            class92.field2041 = 0;
                        } else {
                            class5.field85.method898((class92.field2041 << 19) + var9 - 1073741824, -1202576);
                            class92.field2041 = 0;
                        }
                    } else if (class92.field2041 < 2047) {
                        class92.field2041++;
                    }
                }
                class5.field85.method887((byte) -56, class5.field85.field2554 - var4);
                if (class45.field999.field211 > var5) {
                    class45.field999.field211 -= var5;
                    for (int var12 = 0; var12 < class45.field999.field211; var12++) {
                        class45.field999.field213[var12] = class45.field999.field213[var12 + var5];
                        class45.field999.field212[var12] = class45.field999.field212[var12 + var5];
                    }
                } else {
                    class45.field999.field211 = 0;
                }
            }
        }
        if (class40.field868 != 0) {
            long var13 = (class43.field947 - class2.field18) / 50L;
            class2.field18 = class43.field947;
            if (var13 > 4095L) {
                var13 = 4095L;
            }
            class48.field1117++;
            int var15 = class32.field680;
            int var16 = class96.field2143;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 502) {
                var15 = 502;
            }
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 764) {
                var16 = 764;
            }
            int var17 = var15 * 765 + var16;
            int var18 = (int) var13;
            byte var19 = 0;
            if (class40.field868 == 2) {
                var19 = 1;
            }
            class5.field85.method161((byte) 114, 55);
            class5.field85.method861((byte) -115, (var18 << 20) + (var19 << 19) + var17);
        }
        if (class11.field178 > 0) {
            class11.field178--;
        }
        if (class74.field1634[96] || class74.field1634[97] || class74.field1634[98] || class74.field1634[99]) {
            class8.field139 = true;
        }
        if (class8.field139 && class11.field178 <= 0) {
            class8.field139 = false;
            class15.field283++;
            class11.field178 = 20;
            class5.field85.method161((byte) 99, 2);
            class5.field85.method902(class122.field2663, false);
            class5.field85.method892(class25.field558, 1815787688);
        }
        if (class86.field1924 && !class18.field345) {
            class48.field1103++;
            class18.field345 = true;
            class5.field85.method161((byte) 124, 99);
            class5.field85.method888(1, 91);
        }
        if (arg0 == class86.field1924 && class18.field345) {
            class18.field345 = false;
            class5.field85.method161((byte) 98, 99);
            class5.field85.method888(0, 108);
            class48.field1103++;
        }
        class47.method377(0);
        if (class114.field2444 != 30 && class114.field2444 != 35) {
            return;
        }
        class86.method639(-78);
        class76.method582((byte) -123);
        class48.field1118++;
        if (class48.field1118 > 750) {
            class64.method514(-23296);
            return;
        }
        class18.method100(2047);
        class36.method301((byte) 43);
        class49.method391(-12513);
        class12.field197++;
        if (class69.field1545 != 0) {
            class8.field145++;
            if (class8.field145 >= 15) {
                if (class69.field1545 == 3) {
                    class95.field2092 = true;
                }
                if (class69.field1545 == 2) {
                    class30.field646 = true;
                }
                class69.field1545 = 0;
            }
        }
        if (class119.field2584 != 0) {
            class125.field2722 += 20;
            if (class125.field2722 >= 400) {
                class119.field2584 = 0;
            }
        }
        if (class79.field1839 != 0) {
            class78.field1744++;
            if (class23.field530 > class94.field2074 + 5 || class23.field530 < class94.field2074 - 5 || class88.field1960 > class98.field2173 + 5 || class98.field2173 - 5 > class88.field1960) {
                class5.field90 = true;
            }
            if (class36.field790 == 0) {
                if (class79.field1839 == 3) {
                    class95.field2092 = true;
                }
                if (class79.field1839 == 2) {
                    class30.field646 = true;
                }
                class79.field1839 = 0;
                if (class5.field90 && class78.field1744 >= 5) {
                    class106.field2254 = -1;
                    class21.method149(-1);
                    if (class65.field1490 == class106.field2254 && class87.field1933 != class13.field239) {
                        byte var20 = 0;
                        class91.field2004++;
                        class78 var21 = class5.method27(0, class65.field1490);
                        if (class119.field2544 == 1 && var21.field1796 == 206) {
                            var20 = 1;
                        }
                        if (var21.field1795[class13.field239] <= 0) {
                            var20 = 0;
                        }
                        if (var21.field1751) {
                            int var24 = class87.field1933;
                            int var25 = class13.field239;
                            var21.field1795[var25] = var21.field1795[var24];
                            var21.field1792[var25] = var21.field1792[var24];
                            var21.field1795[var24] = -1;
                            var21.field1792[var24] = 0;
                        } else if (var20 == 1) {
                            int var22 = class87.field1933;
                            int var23 = class13.field239;
                            while (var22 != var23) {
                                if (var22 > var23) {
                                    var21.method596(var22, var22 - 1, 4);
                                    var22--;
                                } else if (var22 < var23) {
                                    var21.method596(var22, var22 + 1, 4);
                                    var22++;
                                }
                            }
                        } else {
                            var21.method596(class87.field1933, class13.field239, 4);
                        }
                        class5.field85.method161((byte) 83, 125);
                        class5.field85.method892(class87.field1933, 1815787688);
                        class5.field85.method866(-791766776, class13.field239);
                        class5.field85.method861((byte) -97, class65.field1490);
                        class5.field85.method864(var20, (byte) 105);
                    }
                } else if ((class9.field175 == 1 || class56.method454((byte) -63, class114.field2435 - 1)) && class114.field2435 > 2) {
                    class15.method83((byte) 116);
                } else if (class114.field2435 > 0) {
                    class105.method727(class114.field2435 - 1, (byte) -1);
                }
                class40.field868 = 0;
                class8.field145 = 10;
            }
        }
        if (class111.field2359 != -1) {
            int var26 = class111.field2359;
            int var27 = class111.field2355;
            boolean var28 = class51.method416(true, 0, 0, -96, var27, 0, 0, class37.field848.field1487[0], 0, 0, class37.field848.field1466[0], var26);
            class111.field2359 = -1;
            if (var28) {
                class76.field1695 = class96.field2143;
                class105.field2227 = class32.field680;
                class119.field2584 = 1;
                class125.field2722 = 0;
            }
        }
        if (class40.field868 == 1 && class64.field1416 != null) {
            class64.field1416 = null;
            class95.field2092 = true;
            class40.field868 = 0;
        }
        class36.method302(-91);
        if (class37.field854 == -1) {
            class123.method951(true);
            client.method119((byte) 122);
            class64.method518(75);
        }
        if (class36.field790 == 1 || class40.field868 == 1) {
            class3.field46++;
        }
        if (class69.field1550 == -1 && class106.field2247 == -1 && class17.field331 == -1) {
            if (class123.field2669 > 0) {
                class123.field2669--;
            }
        } else if (class123.field2669 < 100) {
            class123.field2669++;
            if (class123.field2669 == 100) {
                if (class106.field2247 != -1) {
                    class30.field646 = true;
                }
                if (class69.field1550 != -1) {
                    class95.field2092 = true;
                }
            }
        }
        class61.method499(-121);
        if (class61.field1360) {
            class91.method664((byte) 1);
        }
        for (int var29 = 0; var29 < 5; var29++) {
            int var10002 = class40.field859[var29]++;
        }
        class117.method839(17498112);
        int var30 = client.method118(84);
        int var31 = class95.method682((byte) -116);
        if (var30 > 4500 && var31 > 4500) {
            client.field381 = 250;
            class15.method86(4000, 0);
            class5.field85.method161((byte) 107, 247);
            class119.field2588++;
        }
        class37.field852++;
        class20.field440++;
        class18.field364++;
        if (class18.field364 > 500) {
            class18.field364 = 0;
            int var32 = (int) (Math.random() * 8.0D);
            if ((var32 & 0x4) == 4) {
                class57.field1306 += class3.field41;
            }
            if ((var32 & 0x2) == 2) {
                class8.field148 += class55.field1275;
            }
            if ((var32 & 0x1) == 1) {
                class68.field1541 += class62.field1384;
            }
        }
        if (class57.field1306 < -40) {
            class3.field41 = 1;
        }
        if (class57.field1306 > 40) {
            class3.field41 = -1;
        }
        if (class20.field440 > 500) {
            class20.field440 = 0;
            int var33 = (int) (Math.random() * 8.0D);
            if ((var33 & 0x1) == 1) {
                class48.field1105 += class36.field822;
            }
            if ((var33 & 0x2) == 2) {
                class74.field1637 += class55.field1267;
            }
        }
        if (class74.field1637 < -20) {
            class55.field1267 = 1;
        }
        if (class74.field1637 > 10) {
            class55.field1267 = -1;
        }
        if (class68.field1541 < -50) {
            class62.field1384 = 2;
        }
        if (class68.field1541 > 50) {
            class62.field1384 = -2;
        }
        if (class48.field1105 < -60) {
            class36.field822 = 2;
        }
        if (class8.field148 < -55) {
            class55.field1275 = 2;
        }
        if (class48.field1105 > 60) {
            class36.field822 = -2;
        }
        if (class8.field148 > 55) {
            class55.field1275 = -2;
        }
        if (class37.field852 > 50) {
            class5.field85.method161((byte) 79, 217);
            class92.field2025++;
        }
        try {
            if (class106.field2239 != null && class5.field85.field2554 > 0) {
                class106.field2239.method110(class5.field85.field2531, 0, (byte) -54, class5.field85.field2554);
                class37.field852 = 0;
                class5.field85.field2554 = 0;
            }
        } catch (IOException var34) {
            class64.method514(-23296);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II)Lhc;")
    public static final class45 method566(int arg0, int arg1) {
        field1592++;
        class45 var2 = (class45) class94.field2071.method660(-2, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class75.field1681.method932(127, arg0, 6);
        class45 var4 = new class45();
        var4.field961 = arg0;
        if (var3 != null) {
            var4.method353(new class119(var3), 108);
        }
        var4.method360(87);
        if (var4.field1005) {
            var4.field976 = false;
            var4.field980 = false;
        }
        class94.field2071.method666(false, var4, (long) arg0);
        int var5 = 78 % ((11 - arg1) / 52);
        return var4;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IZ)V")
    public static final void method567(int arg0, boolean arg1) {
        if (class37.field848.field1446 >> 7 == class127.field2750 && class37.field848.field1501 >> 7 == class27.field585) {
            class127.field2750 = 0;
        }
        field1607++;
        int var2 = class74.field1641;
        if (arg1) {
            var2 = 1;
        }
        if (arg0 != -1351) {
            return;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            class43 var4;
            int var5;
            if (arg1) {
                var4 = class37.field848;
                var5 = 33538048;
            } else {
                var4 = class129.field2779[class4.field66[var3]];
                var5 = class4.field66[var3] << 14;
            }
            if (var4 != null && var4.method343((byte) 110)) {
                int var6 = var4.field1446 >> 7;
                int var7 = var4.field1501 >> 7;
                var4.field950 = false;
                if ((field1591 && class74.field1641 > 50 || class74.field1641 > 200) && !arg1 && var4.field1470 == var4.field1451) {
                    var4.field950 = true;
                }
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.field948 == null || var4.field934 > class83.field1888 || var4.field944 <= class83.field1888) {
                        if ((var4.field1446 & 0x7F) == 64 && (var4.field1501 & 0x7F) == 64) {
                            if (class86.field1926[var6][var7] == field1597) {
                                continue;
                            }
                            class86.field1926[var6][var7] = field1597;
                        }
                        var4.field913 = class18.method107(var4.field1501, var4.field1446, arg0 ^ 0xD46, class122.field2657);
                        class11.field179.method760(class122.field2657, var4.field1446, var4.field1501, var4.field913, 60, var4, var4.field1492, var5, var4.field1462);
                    } else {
                        var4.field950 = false;
                        var4.field913 = class18.method107(var4.field1501, var4.field1446, arg0 ^ 0xD46, class122.field2657);
                        class11.field179.method782(class122.field2657, var4.field1446, var4.field1501, var4.field913, 60, var4, var4.field1492, var5, var4.field938, var4.field911, var4.field915, var4.field943);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
    public static void method568(int arg0) {
        field1611 = null;
        field1601 = null;
        field1606 = null;
        field1593 = null;
        field1598 = null;
        int var1 = 100 % ((-arg0 - 76) / 33);
        field1596 = null;
    }

    @OriginalMember(owner = "client!m", name = "d", descriptor = "(Z)V")
    public final void method569(boolean arg0) {
        field1595++;
        if (arg0) {
            field1615 = 87;
        }
        if (this.field1604 != null) {
            this.field1604.field1605 = this.field1605;
            this.field1605.field1604 = this.field1604;
            this.field1605 = null;
            this.field1604 = null;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(BLvb;Lec;Lec;)[Lwc;")
    public static final class128[] method570(byte arg0, class122 arg1, class28 arg2, class28 arg3) {
        field1608++;
        if (arg0 != 17) {
            method570((byte) -84, null, null, null);
        }
        int var4 = arg1.method942(arg3, 1);
        int var5 = arg1.method930((byte) 39, var4, arg2);
        return class34.method287(arg1, -100, var4, var5);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lnd;I)V")
    public static final void method571(class82 arg0, int arg1) {
        if (arg1 < 115) {
            method564(true);
        }
        class32.field689 = 20;
        field1612++;
        try {
            class14.field251 = (class27) Class.forName("ga").getDeclaredConstructor().newInstance();
        } catch (Throwable var3) {
            class39 var2 = arg0.method623(7467);
            if (var2 == null) {
                class14.field251 = new class25(arg0);
            } else {
                class14.field251 = new class35(arg0, var2);
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(BLvb;II)Lea;")
    public static final class26 method572(byte arg0, class122 arg1, int arg2, int arg3) {
        field1603++;
        if (class47.method381((byte) -44, arg1, arg3, arg2)) {
            if (arg0 <= 120) {
                field1597 = -92;
            }
            return class112.method820(0);
        } else {
            return null;
        }
    }
}
