import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class77 extends class255 {

    @OriginalMember(owner = "client!ph", name = "V", descriptor = "Leb;")
    private class230 field1392 = class57.field1054;

    @OriginalMember(owner = "client!ph", name = "S", descriptor = "Leb;")
    public static class230 field1390 = class68.method589(0, "Weiter");

    @OriginalMember(owner = "client!ph", name = "db", descriptor = "Leb;")
    public static class230 field1400 = class68.method589(0, " zuerst von Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!ph", name = "L", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!ph", name = "M", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!ph", name = "N", descriptor = "I")
    private int field1385;

    @OriginalMember(owner = "client!ph", name = "O", descriptor = "I")
    public int field1386;

    @OriginalMember(owner = "client!ph", name = "P", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!ph", name = "Q", descriptor = "I")
    public static int field1388;

    @OriginalMember(owner = "client!ph", name = "U", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!ph", name = "W", descriptor = "I")
    public int field1393;

    @OriginalMember(owner = "client!ph", name = "X", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!ph", name = "Y", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!ph", name = "Z", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!ph", name = "bb", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!ph", name = "cb", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!ph", name = "eb", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!ph", name = "fb", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!ph", name = "gb", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!ph", name = "R", descriptor = "Laj;")
    private class46 field1389;

    @OriginalMember(owner = "client!ph", name = "ab", descriptor = "Laj;")
    public class46 field1397;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "(II)Z")
    public final boolean method635(int arg0, int arg1) {
        int var3 = -24 / ((arg1 - 10) / 43);
        field1395++;
        if (this.field1397 == null) {
            return false;
        }
        if (this.field1389 == null) {
            this.method639(-1);
        }
        class244 var4 = (class244) this.field1389.method394((long) arg0, -21083);
        return var4 != null;
    }

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "(I)Z")
    public static final boolean method636(int arg0) throws IOException {
        field1398++;
        if (class30.field556 == null) {
            return false;
        }
        int var1 = class30.field556.method1816(0);
        if (var1 == 0) {
            return false;
        }
        if (class259.field4572 == -1) {
            var1--;
            class30.field556.method1819(1, 0, class183.field3182.field269, (byte) 95);
            class183.field3182.field318 = 0;
            class259.field4572 = class183.field3182.method979(-107);
            class16.field368 = class268.field4757[class259.field4572];
        }
        if (class16.field368 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class30.field556.method1819(1, 0, class183.field3182.field269, (byte) 119);
            class16.field368 = class183.field3182.field269[0] & 0xFF;
            var1--;
        }
        if (class16.field368 == -2) {
            if (var1 <= 1) {
                return false;
            }
            var1 -= 2;
            class30.field556.method1819(2, 0, class183.field3182.field269, (byte) 105);
            class183.field3182.field318 = 0;
            class16.field368 = class183.field3182.method161(arg0 - 12);
        }
        if (class16.field368 > var1) {
            return false;
        }
        class183.field3182.field318 = 0;
        class30.field556.method1819(class16.field368, 0, class183.field3182.field269, (byte) 99);
        class15.field350 = class170.field3013;
        class170.field3013 = class23.field440;
        class23.field440 = class259.field4572;
        class265.field4717 = 0;
        if (class259.field4572 == 79) {
            class82.method669(arg0 ^ 0xFFFFC784);
            class259.field4572 = -1;
            return true;
        } else if (class259.field4572 == 225) {
            int var2 = class183.field3182.method151(58);
            int var3 = class183.field3182.method173(-109);
            if (var2 == 65535) {
                var2 = -1;
            }
            int var4 = class183.field3182.method158(true);
            if (class221.method1509(var3, (byte) -111)) {
                class91.method774(4, 2, var4, var2);
            }
            class259.field4572 = -1;
            return true;
        } else if (class259.field4572 == 173) {
            class183.method1315(true, 6);
            class259.field4572 = -1;
            return true;
        } else if (class259.field4572 == 21) {
            class214.field3702 = class183.field3182.method167(-1);
            class144.field2574 = class183.field3182.method200(arg0 + 239);
            class259.field4572 = -1;
            return true;
        } else if (class259.field4572 == 40) {
            int var5 = class183.field3182.method151(arg0 + 54);
            class42.method370(var5, 95);
            class226.field3903[class189.method1350(class157.field2811++, 31)] = class189.method1350(32767, var5);
            class259.field4572 = -1;
            return true;
        } else if (class259.field4572 == 242) {
            int var6 = class183.field3182.method203(7077);
            int var7 = class183.field3182.method199(arg0 ^ 0xFFFFFFEE);
            int var8 = class183.field3182.method173(arg0 - 129);
            int var9 = class183.field3182.method188(-2);
            if (class221.method1509(var8, (byte) -111)) {
                class132.method1034(arg0 ^ 0x1B, var6, var7, var9);
            }
            class259.field4572 = -1;
            return true;
        } else if (class259.field4572 == 174) {
            long var10 = class183.field3182.method150(true);
            boolean var12 = false;
            long var13 = (long) class183.field3182.method161(arg0 ^ 0x14);
            long var15 = (long) class183.field3182.method190(arg0 ^ 0xFFFF9D5D);
            int var17 = class183.field3182.method200(255);
            long var18 = (var13 << 32) + var15;
            int var20 = 0;
            label1069: while (true) {
                if (var20 >= 100) {
                    if (var17 <= 1) {
                        if (class48.field841 == 1 || class22.field433 == 1) {
                            var12 = true;
                        } else {
                            for (int var21 = 0; var21 < class45.field796; var21++) {
                                if (class145.field2607[var21] == var10) {
                                    var12 = true;
                                    break label1069;
                                }
                            }
                        }
                    }
                    break;
                }
                if (class99.field1836[var20] == var18) {
                    var12 = true;
                    break;
                }
                var20++;
            }
            if (!var12 && class65.field1220 == 0) {
                class99.field1836[class118.field2110] = var18;
                class118.field2110 = (class118.field2110 + 1) % 100;
                class230 var22 = class93.method793(class236.method1661(class183.field3182, -32133).method1600(2));
                if (var17 == 2 || var17 == 3) {
                    class227.method1565(class173.method1267((byte) 59, new class230[] { class230.field3986, class113.method906(var10, (byte) -115).method1623(arg0 ^ 0xFFFF870D) }), (byte) 58, 7, var22);
                } else if (var17 == 1) {
                    class227.method1565(class173.method1267((byte) 59, new class230[] { class31.field569, class113.method906(var10, (byte) -95).method1623(arg0 ^ 0xFFFF870D) }), (byte) 70, 7, var22);
                } else {
                    class227.method1565(class113.method906(var10, (byte) -114).method1623(-30947), (byte) 59, 3, var22);
                }
            }
            class259.field4572 = -1;
            return true;
        } else if (class259.field4572 == 132) {
            class200.method1412(-30);
            class259.field4572 = -1;
            return true;
        } else if (class259.field4572 == 231) {
            int var23 = class183.field3182.method199(-2);
            int var24 = (var23 & 0xFFFFC7E) >> 14;
            int var25 = (var23 & 0x3E693521) >> 28;
            int var26 = class183.field3182.method168((byte) 95);
            int var27 = var26 & 0x3;
            int var28 = var26 >> 2;
            int var29 = class149.field2664[var28];
            int var30 = class183.field3182.method161(4);
            int var31 = var23 & 0x3FFF;
            int var32 = var24 - class272.field4795;
            int var33 = var31 - class155.field2759;
            if (var30 == 65535) {
                var30 = -1;
            }
            class128.method1004(var28, -10407, var32, var25, var30, var33, var29, var27);
            class259.field4572 = -1;
            return true;
        } else if (class259.field4572 == 214) {
            long var34 = class183.field3182.method150(true);
            class230 var36 = class93.method793(class236.method1661(class183.field3182, arg0 ^ 0xFFFF826B).method1600(119));
            class227.method1565(class113.method906(var34, (byte) -127).method1623(arg0 ^ 0xFFFF870D), (byte) 116, 6, var36);
            class259.field4572 = -1;
            return true;
        } else if (class259.field4572 == 26) {
            int var37 = class183.field3182.method196(arg0 - 110);
            int var38 = class183.field3182.method199(-2);
            class111.method895(var37, var38, false);
            class259.field4572 = -1;
            return true;
        } else if (class259.field4572 == 198) {
            int var39 = class183.field3182.method151(67);
            int var40 = class183.field3182.method187((byte) 61);
            int var41 = class183.field3182.method173(arg0 - 133);
            if (class221.method1509(var39, (byte) -111)) {
                class42.method366(var40, 22461, var41);
            }
            class259.field4572 = -1;
            return true;
        } else if (class259.field4572 == 11) {
            int var42 = class183.field3182.method187((byte) 61);
            int var43 = class183.field3182.method161(4);
            class245 var44;
            if (var42 >= 0) {
                var44 = class155.method1183(var42, 17);
            } else {
                var44 = null;
            }
            if (var42 < -70000) {
                var43 += 32768;
            }
            while (class16.field368 > class183.field3182.field318) {
                int var45 = class183.field3182.method202(21);
                int var46 = class183.field3182.method161(4);
                int var47 = 0;
                if (var46 != 0) {
                    var47 = class183.field3182.method200(255);
                    if (var47 == 255) {
                        var47 = class183.field3182.method187((byte) 61);
                    }
                }
                if (var44 != null && var45 >= 0 && var45 < var44.field4331.length) {
                    var44.field4331[var45] = var46;
                    var44.field4215[var45] = var47;
                }
                class164.method1225(var43, var47, (byte) -38, var46 - 1, var45);
            }
            if (var44 != null) {
                class92.method777((byte) -65, var44);
            }
            class212.method1472(22312);
            class226.field3903[class189.method1350(31, class157.field2811++)] = class189.method1350(var43, 32767);
            class259.field4572 = -1;
            return true;
        } else if (class259.field4572 == 134) {
            long var48 = class183.field3182.method150(true);
            int var50 = class183.field3182.method161(4);
            class230 var51 = class13.method136((byte) 56, var50).method284(0, class183.field3182);
            class167.method1236(var51, (byte) 84, class113.method906(var48, (byte) -95).method1623(-30947), (class230) null, var50, 19);
            class259.field4572 = -1;
            return true;
        } else if (class259.field4572 == 75) {
            int var52 = class183.field3182.method158(true);
            int var53 = class183.field3182.method187((byte) 61);
            int var54 = class183.field3182.method196(-89);
            if (class221.method1509(var54, (byte) -111)) {
                class150 var55 = (class150) client.field2708.method394((long) var52, -21083);
                class150 var56 = (class150) client.field2708.method394((long) var53, -21083);
                if (var56 != null) {
                    class265.method1835(false, var56, var55 == null || var55.field2681 != var56.field2681);
                }
                if (var55 != null) {
                    var55.method518(arg0 + 70);
                    client.field2708.method388(arg0 - 17, (long) var53, var55);
                }
                class245 var57 = class155.method1183(var52, 17);
                if (var57 != null) {
                    class92.method777((byte) -65, var57);
                }
                class245 var58 = class155.method1183(var53, 17);
                if (var58 != null) {
                    class92.method777((byte) -65, var58);
                    class8.method84(var58, true, -98);
                }
                if (class263.field4679 != -1) {
                    class37.method339(class263.field4679, 1, arg0 - 13);
                }
            }
            class259.field4572 = -1;
            return true;
        } else if (class259.field4572 == 51) {
            class66.field1239 = class183.field3182.method151(8) * 30;
            class130.field2342 = class54.field935;
            class259.field4572 = -1;
            return true;
        } else if (class259.field4572 == 255) {
            class230 var59 = class183.field3182.method171((byte) 79);
            int var60 = class183.field3182.method173(-115);
            int var61 = class183.field3182.method196(-127);
            if (class221.method1509(var60, (byte) -111)) {
                class9.method90(2, var61, var59);
            }
            class259.field4572 = -1;
            return true;
        } else if (class259.field4572 == 144) {
            int var62 = class183.field3182.method151(99);
            if (var62 == 65535) {
                var62 = -1;
            }
            class268.method1846(0, var62);
            class259.field4572 = -1;
            return true;
        } else {
            if (arg0 != 16) {
                method645(-4);
            }
            if (class259.field4572 == 16) {
                int var63 = class183.field3182.method172((byte) -83);
                int var64 = class183.field3182.method161(arg0 - 12);
                if (var64 == 65535) {
                    var64 = -1;
                }
                class202.method1421(var63, var64, (byte) -82);
                class259.field4572 = -1;
                return true;
            } else if (class259.field4572 == 95) {
                long var65 = class183.field3182.method150(true);
                class183.field3182.method198(false);
                long var67 = class183.field3182.method150(true);
                long var69 = (long) class183.field3182.method161(4);
                boolean var71 = false;
                long var72 = (long) class183.field3182.method190(-25267);
                int var74 = class183.field3182.method200(255);
                long var75 = (var69 << 32) + var72;
                int var77 = 0;
                label1107: while (true) {
                    if (var77 >= 100) {
                        if (var74 <= 1) {
                            if (class48.field841 == 1 || class22.field433 == 1) {
                                var71 = true;
                            } else {
                                for (int var78 = 0; var78 < class45.field796; var78++) {
                                    if (class145.field2607[var78] == var65) {
                                        var71 = true;
                                        break label1107;
                                    }
                                }
                            }
                        }
                        break;
                    }
                    if (class99.field1836[var77] == var75) {
                        var71 = true;
                        break;
                    }
                    var77++;
                }
                if (!var71 && class65.field1220 == 0) {
                    class99.field1836[class118.field2110] = var75;
                    class118.field2110 = (class118.field2110 + 1) % 100;
                    class230 var79 = class93.method793(class236.method1661(class183.field3182, -32133).method1600(123));
                    if (var74 == 2 || var74 == 3) {
                        class240.method1683(class173.method1267((byte) 59, new class230[] { class230.field3986, class113.method906(var65, (byte) -84).method1623(-30947) }), 9, (byte) 108, var79, class113.method906(var67, (byte) -116).method1623(-30947));
                    } else if (var74 == 1) {
                        class240.method1683(class173.method1267((byte) 59, new class230[] { class31.field569, class113.method906(var65, (byte) -97).method1623(-30947) }), 9, (byte) 104, var79, class113.method906(var67, (byte) -121).method1623(-30947));
                    } else {
                        class240.method1683(class113.method906(var65, (byte) -106).method1623(-30947), 9, (byte) 122, var79, class113.method906(var67, (byte) -90).method1623(arg0 ^ 0xFFFF870D));
                    }
                }
                class259.field4572 = -1;
                return true;
            } else if (class259.field4572 == 91) {
                int var80 = class183.field3182.method200(255);
                int var81 = class183.field3182.method200(255);
                int var82 = class183.field3182.method200(255);
                int var83 = class183.field3182.method200(arg0 ^ 0xEF);
                int var84 = class183.field3182.method161(4);
                class223.field3828[var80] = true;
                class244.field4198[var80] = var81;
                class7.field89[var80] = var82;
                class125.field2199[var80] = var83;
                class57.field1048[var80] = var84;
                class259.field4572 = -1;
                return true;
            } else if (class259.field4572 == 175) {
                int var85 = class183.field3182.method200(arg0 + 239);
                int var86 = class183.field3182.method200(255);
                int var87 = class183.field3182.method161(4);
                int var88 = class183.field3182.method200(255);
                int var89 = class183.field3182.method200(255);
                class70.method606(var85, var89, true, 128, var87, var88, var86);
                class259.field4572 = -1;
                return true;
            } else if (class259.field4572 == 219) {
                class34.field639 = class183.field3182.method200(arg0 + 239);
                class259.field4572 = -1;
                return true;
            } else if (class259.field4572 == 127) {
                int var90 = class183.field3182.method158(true);
                int var91 = class183.field3182.method161(arg0 - 12);
                int var92 = class183.field3182.method161(4);
                if (var91 == 65535) {
                    var91 = -1;
                }
                if (class221.method1509(var92, (byte) -111)) {
                    class91.method774(4, 1, var90, var91);
                }
                class259.field4572 = -1;
                return true;
            } else if (class259.field4572 == 98) {
                int var93 = class183.field3182.method167(-1);
                int var94 = class183.field3182.method161(4);
                int var95 = class183.field3182.method173(-123);
                if (class221.method1509(var95, (byte) -111)) {
                    if (var93 == 2) {
                        class28.method265(25);
                    }
                    class263.field4679 = var94;
                    class178.method1292(var94, (byte) 119);
                    class175.method1279(false, (byte) 119);
                    class219.method1504(class263.field4679, -116);
                    for (int var96 = 0; var96 < 100; var96++) {
                        class71.field1300[var96] = true;
                    }
                }
                class259.field4572 = -1;
                return true;
            } else if (class259.field4572 == 182) {
                int var97 = class183.field3182.method161(arg0 ^ 0x14);
                int var98 = class183.field3182.method187((byte) 61);
                if (class221.method1509(var97, (byte) -111)) {
                    class150 var99 = (class150) client.field2708.method394((long) var98, -21083);
                    if (var99 != null) {
                        class265.method1835(false, var99, true);
                    }
                    if (class265.field4706 != null) {
                        class92.method777((byte) -65, class265.field4706);
                        class265.field4706 = null;
                    }
                }
                class259.field4572 = -1;
                return true;
            } else if (class259.field4572 == 212) {
                int var100 = class183.field3182.method200(255);
                class177 var101 = new class177();
                int var102 = var100 >> 6;
                var101.field3107 = var100 & 0x3F;
                var101.field3108 = class183.field3182.method200(255);
                if (var101.field3108 >= 0 && var101.field3108 < class162.field2894.length) {
                    if (var101.field3107 == 1 || var101.field3107 == 10) {
                        var101.field3110 = class183.field3182.method161(arg0 - 12);
                        class183.field3182.field318 += 3;
                    } else if (var101.field3107 >= 2 && var101.field3107 <= 6) {
                        if (var101.field3107 == 2) {
                            var101.field3111 = 64;
                            var101.field3114 = 64;
                        }
                        if (var101.field3107 == 3) {
                            var101.field3114 = 0;
                            var101.field3111 = 64;
                        }
                        if (var101.field3107 == 4) {
                            var101.field3114 = 128;
                            var101.field3111 = 64;
                        }
                        if (var101.field3107 == 5) {
                            var101.field3111 = 0;
                            var101.field3114 = 64;
                        }
                        if (var101.field3107 == 6) {
                            var101.field3111 = 128;
                            var101.field3114 = 64;
                        }
                        var101.field3107 = 2;
                        var101.field3109 = class183.field3182.method161(4);
                        var101.field3118 = class183.field3182.method161(arg0 - 12);
                        var101.field3102 = class183.field3182.method200(arg0 + 239);
                    }
                    var101.field3103 = class183.field3182.method161(4);
                    if (var101.field3103 == 65535) {
                        var101.field3103 = -1;
                    }
                    class45.field793[var102] = var101;
                }
                class259.field4572 = -1;
                return true;
            } else if (class259.field4572 == 42) {
                int var103 = class183.field3182.method200(255);
                if (class183.field3182.method200(255) == 0) {
                    class89.field1549[var103] = new class232();
                } else {
                    class183.field3182.field318--;
                    class89.field1549[var103] = new class232(class183.field3182);
                }
                class259.field4572 = -1;
                class95.field1719 = class54.field935;
                return true;
            } else if (class259.field4572 == 202) {
                int var104 = class183.field3182.method173(-111);
                int var105 = class183.field3182.method158(true);
                int var106 = class183.field3182.method173(-115);
                if (class221.method1509(var106, (byte) -111)) {
                    client.method1164(var104, false, var105);
                }
                class259.field4572 = -1;
                return true;
            } else if (class259.field4572 == 80) {
                class180.field3163 = class54.field935;
                long var107 = class183.field3182.method150(true);
                if (var107 == 0L) {
                    class259.field4572 = -1;
                    class182.field3175 = null;
                    class156.field2790 = null;
                    class105.field1906 = null;
                    class124.field2170 = 0;
                    return true;
                }
                long var109 = class183.field3182.method150(true);
                class156.field2790 = class113.method906(var109, (byte) -98);
                class105.field1906 = class113.method906(var107, (byte) -107);
                class259.field4582 = class183.field3182.method198(false);
                int var111 = class183.field3182.method200(255);
                if (var111 == 255) {
                    class259.field4572 = -1;
                    return true;
                }
                class124.field2170 = var111;
                class133[] var112 = new class133[100];
                for (int var113 = 0; var113 < class124.field2170; var113++) {
                    var112[var113] = new class133();
                    var112[var113].field1166 = class183.field3182.method150(true);
                    var112[var113].field2410 = class113.method906(var112[var113].field1166, (byte) -111);
                    var112[var113].field2413 = class183.field3182.method161(4);
                    var112[var113].field2407 = class183.field3182.method198(false);
                    var112[var113].field2409 = class183.field3182.method171((byte) 79);
                    if (class17.field381 == var112[var113].field1166) {
                        class247.field4389 = var112[var113].field2407;
                    }
                }
                boolean var114 = false;
                int var115 = class124.field2170;
                while (var115 > 0) {
                    boolean var116 = true;
                    var115--;
                    for (int var117 = 0; var117 < var115; var117++) {
                        if (var112[var117].field2410.method1590((byte) -95, var112[var117 + 1].field2410) > 0) {
                            class133 var118 = var112[var117];
                            var116 = false;
                            var112[var117] = var112[var117 + 1];
                            var112[var117 + 1] = var118;
                        }
                    }
                    if (var116) {
                        break;
                    }
                }
                class259.field4572 = -1;
                class182.field3175 = var112;
                return true;
            } else if (class259.field4572 == 96) {
                class212.method1472(arg0 ^ 0x5738);
                class171.field3037 = class183.field3182.method200(255);
                class130.field2342 = class54.field935;
                class259.field4572 = -1;
                return true;
            } else if (class259.field4572 == 13) {
                int var119 = class183.field3182.method196(-116);
                int var120 = class183.field3182.method187((byte) 61);
                int var121 = class183.field3182.method173(-128);
                int var122 = class183.field3182.method173(-122);
                if (class221.method1509(var121, (byte) -111)) {
                    class85.method681(-93, var120, (var119 << 16) + var122);
                }
                class259.field4572 = -1;
                return true;
            } else if (class259.field4572 == 116) {
                for (int var123 = 0; var123 < class230.field4011.length; var123++) {
                    if (class230.field4011[var123] != null) {
                        class230.field4011[var123].field2303 = -1;
                    }
                }
                for (int var124 = 0; var124 < class168.field2963.length; var124++) {
                    if (class168.field2963[var124] != null) {
                        class168.field2963[var124].field2303 = -1;
                    }
                }
                class259.field4572 = -1;
                return true;
            } else if (class259.field4572 == 154) {
                int var125 = class183.field3182.method161(4);
                int var126 = class183.field3182.method196(-107);
                int var127 = class183.field3182.method161(4);
                int var128 = class183.field3182.method187((byte) 61);
                if ((var128 >> 30) != 0) {
                    int var129 = var128 >> 28 & 0x3;
                    int var130 = (var128 & 0x3FFF) - class155.field2759;
                    int var131 = ((var128 & 0xFFFD50C) >> 14) - class272.field4795;
                    if (var131 >= 0 && var130 >= 0 && var131 < 104 && var130 < 104) {
                        int var132 = var131 * 128 + 64;
                        int var133 = var130 * 128 + 64;
                        class153 var134 = new class153(var125, var129, var132, var133, class37.method333(var133, 1637367879, var129, var132) - var127, var126, class259.field4584);
                        class123.field2144.method843(-5, new class149(var134));
                    }
                } else if (var128 >> 29 != 0) {
                    int var139 = var128 & 0xFFFF;
                    class109 var140 = class168.field2963[var139];
                    if (var140 != null) {
                        var140.field2281 = 0;
                        var140.field2261 = class259.field4584 + var126;
                        var140.field2279 = var125;
                        var140.field2244 = 0;
                        if (var140.field2279 == 65535) {
                            var140.field2279 = -1;
                        }
                        var140.field2266 = var127;
                        if (var140.field2261 > class259.field4584) {
                            var140.field2281 = -1;
                        }
                        if (var140.field2279 != -1 && class259.field4584 == var140.field2261) {
                            int var141 = class162.method1217((byte) 89, var140.field2279).field131;
                            if (var141 != -1) {
                                class249 var142 = class237.method1667(var141, -118);
                                if (var142 != null && var142.field4408 != null) {
                                    class27.method263(var142, var140.field2300, true, var140.field2274, false, 0);
                                }
                            }
                        }
                    }
                } else if ((var128 >> 28) != 0) {
                    int var135 = var128 & 0xFFFF;
                    class260 var136;
                    if (class33.field615 == var135) {
                        var136 = class56.field1033;
                    } else {
                        var136 = class230.field4011[var135];
                    }
                    if (var136 != null) {
                        var136.field2244 = 0;
                        var136.field2261 = class259.field4584 + var126;
                        var136.field2281 = 0;
                        var136.field2266 = var127;
                        if (var136.field2261 > class259.field4584) {
                            var136.field2281 = -1;
                        }
                        var136.field2279 = var125;
                        if (var136.field2279 == 65535) {
                            var136.field2279 = -1;
                        }
                        if (var136.field2279 != -1 && class259.field4584 == var136.field2261) {
                            int var137 = class162.method1217((byte) 80, var136.field2279).field131;
                            if (var137 != -1) {
                                class249 var138 = class237.method1667(var137, -120);
                                if (var138 != null && var138.field4408 != null) {
                                    class27.method263(var138, var136.field2300, true, var136.field2274, class56.field1033 == var136, 0);
                                }
                            }
                        }
                    }
                }
                class259.field4572 = -1;
                return true;
            } else if (class259.field4572 == 2) {
                int var143 = class183.field3182.method173(-110);
                int var144 = class183.field3182.method196(-114);
                int var145 = class183.field3182.method167(-1);
                class109 var146 = class168.field2963[var143];
                if (var146 != null) {
                    class52.method419(true, var146, var144, var145);
                }
                class259.field4572 = -1;
                return true;
            } else if (class259.field4572 == 63) {
                int var147 = class183.field3182.method173(-126);
                int var148 = class183.field3182.method199(-2);
                int var149 = class183.field3182.method167(-1);
                if (class221.method1509(var147, (byte) -111)) {
                    class65.method576((byte) 77, var149, var148);
                }
                class259.field4572 = -1;
                return true;
            } else if (class259.field4572 == 205) {
                if (class263.field4679 != -1) {
                    class37.method339(class263.field4679, 0, 3);
                }
                class259.field4572 = -1;
                return true;
            } else if (class259.field4572 == 102) {
                class183.method1315(false, 6);
                class259.field4572 = -1;
                return true;
            } else if (class259.field4572 == 86) {
                long var150 = class183.field3182.method150(true);
                int var152 = class183.field3182.method161(4);
                byte var153 = class183.field3182.method198(false);
                boolean var154 = false;
                if ((var150 & Long.MIN_VALUE) != 0L) {
                    var154 = true;
                }
                if (var154) {
                    if (class124.field2170 == 0) {
                        class259.field4572 = -1;
                        return true;
                    }
                    long var155 = var150 & Long.MAX_VALUE;
                    boolean var157 = false;
                    int var158;
                    for (var158 = 0; class124.field2170 > var158 && (class182.field3175[var158].field1166 != var155 || class182.field3175[var158].field2413 != var152); var158++) {
                    }
                    if (class124.field2170 > var158) {
                        while (var158 < (class124.field2170 - 1)) {
                            class182.field3175[var158] = class182.field3175[var158 + 1];
                            var158++;
                        }
                        class124.field2170--;
                        class182.field3175[class124.field2170] = null;
                    }
                } else {
                    class230 var159 = class183.field3182.method171((byte) 79);
                    class133 var160 = new class133();
                    var160.field1166 = var150;
                    var160.field2410 = class113.method906(var160.field1166, (byte) -93);
                    var160.field2413 = var152;
                    var160.field2409 = var159;
                    var160.field2407 = var153;
                    int var161;
                    for (var161 = class124.field2170 - 1; var161 >= 0; var161--) {
                        int var162 = class182.field3175[var161].field2410.method1590((byte) -81, var160.field2410);
                        if (var162 == 0) {
                            class182.field3175[var161].field2413 = var152;
                            class182.field3175[var161].field2407 = var153;
                            class182.field3175[var161].field2409 = var159;
                            class180.field3163 = class54.field935;
                            class259.field4572 = -1;
                            if (class17.field381 == var150) {
                                class247.field4389 = var153;
                            }
                            return true;
                        }
                        if (var162 < 0) {
                            break;
                        }
                    }
                    if (class182.field3175.length <= class124.field2170) {
                        class259.field4572 = -1;
                        return true;
                    }
                    for (int var163 = class124.field2170 - 1; var163 > var161; var163--) {
                        class182.field3175[var163 + 1] = class182.field3175[var163];
                    }
                    if (class124.field2170 == 0) {
                        class182.field3175 = new class133[100];
                    }
                    class182.field3175[var161 + 1] = var160;
                    class124.field2170++;
                    if (class17.field381 == var150) {
                        class247.field4389 = var153;
                    }
                }
                class180.field3163 = class54.field935;
                class259.field4572 = -1;
                return true;
            } else if (class259.field4572 == 190) {
                class66.method584(arg0 ^ 0x69);
                class212.method1472(arg0 + 22296);
                class259.field4572 = -1;
                class120.field2120 += 32;
                return true;
            } else if (class259.field4572 == 221) {
                int var164 = class183.field3182.method162((byte) 5);
                int var165 = class183.field3182.method161(4);
                int var166 = class183.field3182.method161(4);
                if (class221.method1509(var166, (byte) -111)) {
                    class42.method366(var164, 22461, var165);
                }
                class259.field4572 = -1;
                return true;
            } else if (class259.field4572 == 191) {
                long var167 = class183.field3182.method150(true);
                int var169 = class183.field3182.method161(arg0 ^ 0x14);
                int var170 = class183.field3182.method200(255);
                class230 var171 = class89.field1580;
                boolean var172 = true;
                if (var167 < 0L) {
                    var172 = false;
                    var167 &= Long.MAX_VALUE;
                }
                if (var169 > 0) {
                    var171 = class183.field3182.method171((byte) 79);
                }
                class230 var173 = class113.method906(var167, (byte) -112).method1623(-30947);
                for (int var174 = 0; var174 < class273.field4805; var174++) {
                    if (class140.field2508[var174] == var167) {
                        if (class268.field4750[var174] != var169) {
                            class268.field4750[var174] = var169;
                            if (var169 > 0) {
                                class227.method1565(class89.field1580, (byte) 47, 5, class173.method1267((byte) 59, new class230[] { var173, class183.field3219 }));
                            }
                            if (var169 == 0) {
                                class227.method1565(class89.field1580, (byte) 13, 5, class173.method1267((byte) 59, new class230[] { var173, class100.field1855 }));
                            }
                        }
                        class180.field3153[var174] = var171;
                        class59.field1130[var174] = var170;
                        var173 = null;
                        class114.field2040[var174] = var172;
                        break;
                    }
                }
                if (var173 != null && class273.field4805 < 200) {
                    class140.field2508[class273.field4805] = var167;
                    class12.field239[class273.field4805] = var173;
                    class268.field4750[class273.field4805] = var169;
                    class180.field3153[class273.field4805] = var171;
                    class59.field1130[class273.field4805] = var170;
                    class114.field2040[class273.field4805] = var172;
                    class273.field4805++;
                }
                class67.field1265 = class54.field935;
                boolean var175 = false;
                int var176 = class273.field4805;
                while (var176 > 0) {
                    var176--;
                    boolean var177 = true;
                    for (int var178 = 0; var178 < var176; var178++) {
                        if (class268.field4750[var178] != class7.field92 && class268.field4750[var178 + 1] == class7.field92 || class268.field4750[var178] == 0 && class268.field4750[var178 + 1] != 0) {
                            var177 = false;
                            int var179 = class268.field4750[var178];
                            class268.field4750[var178] = class268.field4750[var178 + 1];
                            class268.field4750[var178 + 1] = var179;
                            class230 var180 = class180.field3153[var178];
                            class180.field3153[var178] = class180.field3153[var178 + 1];
                            class180.field3153[var178 + 1] = var180;
                            class230 var181 = class12.field239[var178];
                            class12.field239[var178] = class12.field239[var178 + 1];
                            class12.field239[var178 + 1] = var181;
                            long var182 = class140.field2508[var178];
                            class140.field2508[var178] = class140.field2508[var178 + 1];
                            class140.field2508[var178 + 1] = var182;
                            int var184 = class59.field1130[var178];
                            class59.field1130[var178] = class59.field1130[var178 + 1];
                            class59.field1130[var178 + 1] = var184;
                            boolean var185 = class114.field2040[var178];
                            class114.field2040[var178] = class114.field2040[var178 + 1];
                            class114.field2040[var178 + 1] = var185;
                        }
                    }
                    if (var177) {
                        break;
                    }
                }
                class259.field4572 = -1;
                return true;
            } else if (class259.field4572 == 236) {
                int var186 = class183.field3182.method151(7);
                int var187 = class183.field3182.method151(110);
                int var188 = class183.field3182.method158(true);
                if (class221.method1509(var186, (byte) -111)) {
                    class66.method578(var188, (byte) -62, var187);
                }
                class259.field4572 = -1;
                return true;
            } else if (class259.field4572 == 245) {
                class128.method1006(-24);
                class259.field4572 = -1;
                return false;
            } else if (class259.field4572 == 197) {
                for (int var189 = 0; var189 < class99.field1838.length; var189++) {
                    if (class99.field1838[var189] != class225.field3887[var189]) {
                        class99.field1838[var189] = class225.field3887[var189];
                        class261.method1820((byte) -128, var189);
                        class182.field3172[class189.method1350(31, class120.field2120++)] = var189;
                    }
                }
                class259.field4572 = -1;
                return true;
            } else if (class259.field4572 == 105) {
                class159.method1205(class183.field3182, (byte) -3, class184.field3228, class16.field368);
                class259.field4572 = -1;
                return true;
            } else if (class259.field4572 == 69) {
                byte[] var190 = new byte[class16.field368];
                class183.field3182.method972(var190, class16.field368, (byte) 0, 0);
                class230 var191 = class197.method1398(0, true, var190, class16.field368);
                if (class267.field4736 == null && class129.field2314 == 3 || !class129.field2330.startsWith("win") || class156.field2789) {
                    class23.method250(var191, true, (byte) -81);
                } else {
                    class171.field3030 = var191;
                    class97.field1750 = true;
                    class172.field3040 = class184.field3228.method1017((byte) -54, new String(var191.method1622(arg0 ^ 0xFFFFE76E), "ISO-8859-1"));
                }
                class259.field4572 = -1;
                return true;
            } else if (class259.field4572 == 184) {
                class259.field4572 = -1;
                class227.field3918 = 0;
                return true;
            } else if (class259.field4572 == 61) {
                long var192 = class183.field3182.method150(true);
                long var194 = (long) class183.field3182.method161(4);
                long var196 = (long) class183.field3182.method190(-25267);
                int var198 = class183.field3182.method200(255);
                int var199 = class183.field3182.method161(4);
                long var200 = (var194 << 32) + var196;
                boolean var202 = false;
                int var203 = 0;
                label1242: while (true) {
                    if (var203 >= 100) {
                        if (var198 <= 1) {
                            for (int var204 = 0; var204 < class45.field796; var204++) {
                                if (class145.field2607[var204] == var192) {
                                    var202 = true;
                                    break label1242;
                                }
                            }
                        }
                        break;
                    }
                    if (class99.field1836[var203] == var200) {
                        var202 = true;
                        break;
                    }
                    var203++;
                }
                if (!var202 && class65.field1220 == 0) {
                    class99.field1836[class118.field2110] = var200;
                    class118.field2110 = (class118.field2110 + 1) % 100;
                    class230 var205 = class13.method136((byte) 104, var199).method284(0, class183.field3182);
                    if (var198 == 2) {
                        class167.method1236(var205, (byte) 110, class173.method1267((byte) 59, new class230[] { class230.field3986, class113.method906(var192, (byte) -123).method1623(arg0 - 30963) }), (class230) null, var199, 18);
                    } else if (var198 == 1) {
                        class167.method1236(var205, (byte) 80, class173.method1267((byte) 59, new class230[] { class31.field569, class113.method906(var192, (byte) -85).method1623(-30947) }), (class230) null, var199, 18);
                    } else {
                        class167.method1236(var205, (byte) 63, class113.method906(var192, (byte) -122).method1623(-30947), (class230) null, var199, 18);
                    }
                }
                class259.field4572 = -1;
                return true;
            } else if (class259.field4572 == 46) {
                int var206 = class183.field3182.method189((byte) -112);
                int var207 = class183.field3182.method173(-119);
                int var208 = class183.field3182.method196(arg0 ^ 0xFFFFFF96);
                int var209 = class183.field3182.method168((byte) 94);
                if (class221.method1509(var208, (byte) -111)) {
                    class150 var210 = (class150) client.field2708.method394((long) var206, -21083);
                    if (var210 != null) {
                        class265.method1835(false, var210, var210.field2681 != var207);
                    }
                    class255.method1795(var206, var207, (byte) 123, var209);
                }
                class259.field4572 = -1;
                return true;
            } else if (class259.field4572 == 226) {
                int var211 = class183.field3182.method158(true);
                int var212 = class183.field3182.method196(-111);
                if (class221.method1509(var212, (byte) -111)) {
                    int var213 = 0;
                    if (class56.field1033.field4626 != null) {
                        var213 = class56.field1033.field4626.method134(117);
                    }
                    class91.method774(arg0 ^ 0x14, 3, var211, var213);
                }
                class259.field4572 = -1;
                return true;
            } else if (class259.field4572 == 200) {
                int var214 = class183.field3182.method161(4);
                int var215 = class183.field3182.method187((byte) 61);
                class197.method1404(var215, var214, (byte) 19);
                class259.field4572 = -1;
                return true;
            } else if (class259.field4572 == 103) {
                class212.method1472(22312);
                int var216 = class183.field3182.method199(arg0 - 18);
                int var217 = class183.field3182.method162((byte) 5);
                int var218 = class183.field3182.method167(-1);
                class192.field3399[var218] = var216;
                class49.field870[var218] = var217;
                class203.field3578[var218] = 1;
                for (int var219 = 0; var219 < 98; var219++) {
                    if (class104.field1898[var219] <= var216) {
                        class203.field3578[var218] = var219 + 2;
                    }
                }
                class260.field4607[class189.method1350(31, class44.field779++)] = var218;
                class259.field4572 = -1;
                return true;
            } else if (class259.field4572 == 28) {
                int var220 = class183.field3182.method196(arg0 ^ 0xFFFFFF8D);
                int var221 = class183.field3182.method173(-120);
                class34.field641 = var220;
                class71.field1298 = var221;
                class146.method1119((byte) -48);
                class259.field4572 = -1;
                return true;
            } else if (class259.field4572 == 235) {
                class145.method1102(arg0 - 16, class183.field3182);
                class259.field4572 = -1;
                return true;
            } else if (class259.field4572 == 239) {
                int var222 = class183.field3182.method199(arg0 ^ 0xFFFFFFEE);
                int var223 = class183.field3182.method173(arg0 - 140);
                int var224 = class183.field3182.method161(4);
                int var225 = class183.field3182.method158(true);
                if (var224 == 65535) {
                    var224 = -1;
                }
                if (class221.method1509(var223, (byte) -111)) {
                    class245 var226 = class155.method1183(var225, 17);
                    if (var226.field4216) {
                        class230.method1620(var224, -25805, var222, var225);
                        class12 var228 = class214.method1484(var224, -1);
                        class237.method1665(var228.field223, var228.field233, arg0 ^ 0x10, var225, var228.field169);
                        class102.method862(var228.field201, var225, var228.field234, arg0 - 14, var228.field202);
                    } else if (var224 == -1) {
                        var226.field4205 = 0;
                        class259.field4572 = -1;
                        return true;
                    } else {
                        class12 var227 = class214.method1484(var224, -1);
                        var226.field4206 = var227.field169;
                        var226.field4264 = var224;
                        var226.field4290 = var227.field223 * 100 / var222;
                        var226.field4256 = var227.field233;
                        var226.field4205 = 4;
                        class92.method777((byte) -65, var226);
                    }
                }
                class259.field4572 = -1;
                return true;
            } else if (class259.field4572 == 45) {
                long var229 = class183.field3182.method150(true);
                class183.field3182.method198(false);
                long var231 = class183.field3182.method150(true);
                long var233 = (long) class183.field3182.method161(4);
                long var235 = (long) class183.field3182.method190(-25267);
                int var237 = class183.field3182.method200(255);
                int var238 = class183.field3182.method161(4);
                boolean var239 = false;
                long var240 = (var233 << 32) + var235;
                int var242 = 0;
                label1265: while (true) {
                    if (var242 >= 100) {
                        if (var237 <= 1) {
                            for (int var243 = 0; var243 < class45.field796; var243++) {
                                if (class145.field2607[var243] == var229) {
                                    var239 = true;
                                    break label1265;
                                }
                            }
                        }
                        break;
                    }
                    if (class99.field1836[var242] == var240) {
                        var239 = true;
                        break;
                    }
                    var242++;
                }
                if (!var239 && class65.field1220 == 0) {
                    class99.field1836[class118.field2110] = var240;
                    class118.field2110 = (class118.field2110 + 1) % 100;
                    class230 var244 = class13.method136((byte) 70, var238).method284(0, class183.field3182);
                    if (var237 == 2 || var237 == 3) {
                        class167.method1236(var244, (byte) 38, class173.method1267((byte) 59, new class230[] { class230.field3986, class113.method906(var229, (byte) -126).method1623(arg0 ^ 0xFFFF870D) }), class113.method906(var231, (byte) -89).method1623(-30947), var238, 20);
                    } else if (var237 == 1) {
                        class167.method1236(var244, (byte) 55, class173.method1267((byte) 59, new class230[] { class31.field569, class113.method906(var229, (byte) -84).method1623(-30947) }), class113.method906(var231, (byte) -120).method1623(-30947), var238, 20);
                    } else {
                        class167.method1236(var244, (byte) 99, class113.method906(var229, (byte) -109).method1623(-30947), class113.method906(var231, (byte) -116).method1623(arg0 - 30963), var238, 20);
                    }
                }
                class259.field4572 = -1;
                return true;
            } else if (class259.field4572 == 232) {
                int var245 = class183.field3182.method161(4);
                int var246 = class183.field3182.method200(255);
                int var247 = class183.field3182.method161(4);
                if (var245 == 65535) {
                    var245 = -1;
                }
                class214.method1478((byte) 114, var246, var245, var247);
                class259.field4572 = -1;
                return true;
            } else if (class259.field4572 == 185) {
                int var248 = class183.field3182.method161(4);
                class230 var249 = class183.field3182.method171((byte) 79);
                Object[] var250 = new Object[var249.method1635(-115) + 1];
                for (int var251 = var249.method1635(-114) - 1; var251 >= 0; var251--) {
                    if (var249.method1609(var251, (byte) -120) == 115) {
                        var250[var251 + 1] = class183.field3182.method171((byte) 79);
                    } else {
                        var250[var251 + 1] = Integer.valueOf(class183.field3182.method187((byte) 61));
                    }
                }
                var250[0] = Integer.valueOf(class183.field3182.method187((byte) 61));
                if (class221.method1509(var248, (byte) -111)) {
                    class75 var252 = new class75();
                    var252.field1364 = var250;
                    class58.method495(var252, 150);
                }
                class259.field4572 = -1;
                return true;
            } else if (class259.field4572 == 135) {
                int var253 = class183.field3182.method196(-106);
                int var254 = class183.field3182.method161(arg0 ^ 0x14);
                int var255 = class183.field3182.method161(4);
                int var256 = class183.field3182.method158(true);
                if (class221.method1509(var253, (byte) -111)) {
                    class91.method774(arg0 ^ 0x14, 7, var256, var254 << 16 | var255);
                }
                class259.field4572 = -1;
                return true;
            } else if (class259.field4572 == 153) {
                int var257 = class183.field3182.method187((byte) 61);
                int var258 = class183.field3182.method161(4);
                if (var257 < -70000) {
                    var258 += 32768;
                }
                class245 var259;
                if (var257 >= 0) {
                    var259 = class155.method1183(var257, arg0 ^ 0x1);
                } else {
                    var259 = null;
                }
                if (var259 != null) {
                    for (int var260 = 0; var260 < var259.field4331.length; var260++) {
                        var259.field4331[var260] = 0;
                        var259.field4215[var260] = 0;
                    }
                }
                class61.method520(var258, 2132345442);
                int var261 = class183.field3182.method161(4);
                for (int var262 = 0; var262 < var261; var262++) {
                    int var263 = class183.field3182.method173(-115);
                    int var264 = class183.field3182.method168((byte) 119);
                    if (var264 == 255) {
                        var264 = class183.field3182.method199(arg0 ^ 0xFFFFFFEE);
                    }
                    if (var259 != null && var262 < var259.field4331.length) {
                        var259.field4331[var262] = var263;
                        var259.field4215[var262] = var264;
                    }
                    class164.method1225(var258, var264, (byte) -49, var263 - 1, var262);
                }
                if (var259 != null) {
                    class92.method777((byte) -65, var259);
                }
                class212.method1472(arg0 ^ 0x5738);
                class226.field3903[class189.method1350(class157.field2811++, 31)] = class189.method1350(var258, 32767);
                class259.field4572 = -1;
                return true;
            } else if (class259.field4572 == 56) {
                class144.field2574 = class183.field3182.method162((byte) 5);
                class214.field3702 = class183.field3182.method162((byte) 5);
                for (int var265 = class144.field2574; var265 < (class144.field2574 + 8); var265++) {
                    for (int var267 = class214.field3702; var267 < class214.field3702 + 8; var267++) {
                        if (class237.field4090[class124.field2174][var265][var267] != null) {
                            class237.field4090[class124.field2174][var265][var267] = null;
                            class144.method1096(var265, arg0 ^ 0xFA0A1F11, var267);
                        }
                    }
                }
                for (class191 var266 = (class191) class222.field3806.method839(arg0 ^ 0x90); var266 != null; var266 = (class191) class222.field3806.method834((byte) 82)) {
                    if (class144.field2574 <= var266.field3381 && (class144.field2574 + 8) > var266.field3381 && class214.field3702 <= var266.field3377 && (class214.field3702 + 8) > var266.field3377 && class124.field2174 == var266.field3382) {
                        var266.field3368 = 0;
                    }
                }
                class259.field4572 = -1;
                return true;
            } else if (class259.field4572 == 138) {
                int var268 = class183.field3182.method173(-115);
                int var269 = class183.field3182.method161(arg0 ^ 0x14);
                int var270 = class183.field3182.method173(-121);
                int var271 = class183.field3182.method151(72);
                int var272 = class183.field3182.method189((byte) -112);
                if (class221.method1509(var268, (byte) -111)) {
                    class237.method1665(var269, var271, 0, var272, var270);
                }
                class259.field4572 = -1;
                return true;
            } else if (class259.field4572 == 60) {
                class230 var273 = class183.field3182.method171((byte) 79);
                int var274 = class183.field3182.method189((byte) -112);
                int var275 = class183.field3182.method173(-125);
                if (class221.method1509(var275, (byte) -111)) {
                    class133.method1041(var273, (byte) 83, var274);
                }
                class259.field4572 = -1;
                return true;
            } else if (class259.field4572 == 213) {
                int var276 = class183.field3182.method200(255);
                int var277 = class183.field3182.method200(255);
                int var278 = class183.field3182.method161(4);
                int var279 = class183.field3182.method200(255);
                int var280 = class183.field3182.method200(arg0 + 239);
                class16.method213(var277, var280, var276, (byte) -63, var278, var279);
                class259.field4572 = -1;
                return true;
            } else if (class259.field4572 == 39) {
                class230 var281 = class183.field3182.method171((byte) 79);
                int var282 = class183.field3182.method196(-119);
                int var283 = class183.field3182.method161(arg0 - 12);
                if (class221.method1509(var282, (byte) -111)) {
                    class9.method90(arg0 ^ 0x12, var283, var281);
                }
                class259.field4572 = -1;
                return true;
            } else if (class259.field4572 == 99) {
                int var284 = class183.field3182.method199(-2);
                int var285 = class183.field3182.method178(-1);
                int var286 = class183.field3182.method196(-96);
                if (class221.method1509(var286, (byte) -111)) {
                    class136.method1054(var284, (byte) 99, var285);
                }
                class259.field4572 = -1;
                return true;
            } else if (class259.field4572 == 189) {
                class187.field3277 = class183.field3182.method200(255);
                class67.field1265 = class54.field935;
                class259.field4572 = -1;
                return true;
            } else if (class259.field4572 == 152) {
                int var287 = class183.field3182.method151(26);
                if (var287 == 65535) {
                    var287 = -1;
                }
                int var288 = class183.field3182.method173(-116);
                int var289 = class183.field3182.method151(123);
                int var290 = class183.field3182.method187((byte) 61);
                int var291 = class183.field3182.method158(true);
                if (var288 == 65535) {
                    var288 = -1;
                }
                if (class221.method1509(var289, (byte) -111)) {
                    for (int var292 = var288; var292 <= var287; var292++) {
                        long var293 = ((long) var290 << 32) + (long) var292;
                        class61 var295 = class115.field2062.method394(var293, -21083);
                        if (var295 != null) {
                            var295.method518(arg0 ^ 0x66);
                        }
                        class115.field2062.method388(-1, var293, new class244(var291));
                    }
                }
                class259.field4572 = -1;
                return true;
            } else if (class259.field4572 == 148) {
                int var296 = class183.field3182.method173(arg0 - 140);
                byte var297 = class183.field3182.method183((byte) 109);
                class111.method895(var296, var297, false);
                class259.field4572 = -1;
                return true;
            } else if (class259.field4572 == 70) {
                int var298 = class183.field3182.method151(67);
                int var299 = class183.field3182.method167(-1);
                class197.method1404(var299, var298, (byte) 34);
                class259.field4572 = -1;
                return true;
            } else if (class259.field4572 == 77) {
                class203.method1424(13062, class183.field3182.method171((byte) 79));
                class259.field4572 = -1;
                return true;
            } else if (class259.field4572 == 166) {
                if (class16.field368 == 0) {
                    class54.field937 = class92.field1661;
                } else {
                    class54.field937 = class183.field3182.method171((byte) 79);
                }
                class259.field4572 = -1;
                return true;
            } else if (class259.field4572 == 67) {
                class168.method1244((byte) -23);
                class259.field4572 = -1;
                return true;
            } else if (class259.field4572 == 209 || class259.field4572 == 57 || class259.field4572 == 71 || class259.field4572 == 93 || class259.field4572 == 121 || class259.field4572 == 254 || class259.field4572 == 62 || class259.field4572 == 35 || class259.field4572 == 237 || class259.field4572 == 207 || class259.field4572 == 252 || class259.field4572 == 229) {
                class60.method510(111);
                class259.field4572 = -1;
                return true;
            } else if (class259.field4572 == 72) {
                class45.field796 = class16.field368 / 8;
                for (int var300 = 0; var300 < class45.field796; var300++) {
                    class145.field2607[var300] = class183.field3182.method150(true);
                    class146.field2627[var300] = class113.method906(class145.field2607[var300], (byte) -126);
                }
                class259.field4572 = -1;
                class67.field1265 = class54.field935;
                return true;
            } else if (class259.field4572 == 119) {
                int var301 = class183.field3182.method162((byte) 5);
                int var302 = class183.field3182.method162((byte) 5);
                class230 var303 = class183.field3182.method171((byte) 79);
                if (var302 >= 1 && var302 <= 8) {
                    if (var303.method1612((byte) 15, class171.field3034)) {
                        var303 = null;
                    }
                    class85.field1494[var302 - 1] = var303;
                    class72.field1314[var302 - 1] = var301 == 0;
                }
                class259.field4572 = -1;
                return true;
            } else if (class259.field4572 == 106) {
                class230 var304 = class183.field3182.method171((byte) 79);
                if (var304.method1625(119, class158.field2825)) {
                    class230 var305 = var304.method1597(0, 0, var304.method1624(class172.field3041, true));
                    long var306 = var305.method1587(114);
                    boolean var308 = false;
                    for (int var309 = 0; var309 < class45.field796; var309++) {
                        if (class145.field2607[var309] == var306) {
                            var308 = true;
                            break;
                        }
                    }
                    if (!var308 && class65.field1220 == 0) {
                        class227.method1565(var305, (byte) 80, 4, class138.field2471);
                    }
                } else if (var304.method1625(123, class226.field3905)) {
                    class230 var310 = var304.method1597(0, 0, var304.method1624(class172.field3041, true));
                    long var311 = var310.method1587(77);
                    boolean var313 = false;
                    for (int var314 = 0; var314 < class45.field796; var314++) {
                        if (class145.field2607[var314] == var311) {
                            var313 = true;
                            break;
                        }
                    }
                    if (!var313 && class65.field1220 == 0) {
                        class230 var315 = var304.method1597(0, var304.method1624(class172.field3041, true) + 1, var304.method1635(-92) - 9);
                        class227.method1565(var310, (byte) 87, 8, var315);
                    }
                } else if (var304.method1625(119, class130.field2340)) {
                    class230 var316 = var304.method1597(0, 0, var304.method1624(class172.field3041, true));
                    long var317 = var316.method1587(111);
                    boolean var319 = false;
                    for (int var320 = 0; var320 < class45.field796; var320++) {
                        if (class145.field2607[var320] == var317) {
                            var319 = true;
                            break;
                        }
                    }
                    if (!var319 && class65.field1220 == 0) {
                        class227.method1565(var316, (byte) 60, 10, class89.field1580);
                    }
                } else if (var304.method1625(arg0 + 110, class121.field2129)) {
                    class230 var344 = var304.method1597(0, 0, var304.method1624(class121.field2129, true));
                    class227.method1565(class89.field1580, (byte) 69, 11, var344);
                } else if (var304.method1625(117, class132.field2398)) {
                    class230 var343 = var304.method1597(0, 0, var304.method1624(class132.field2398, true));
                    if (class65.field1220 == 0) {
                        class227.method1565(class89.field1580, (byte) 20, 12, var343);
                    }
                } else if (var304.method1625(120, class265.field4702)) {
                    class230 var342 = var304.method1597(0, 0, var304.method1624(class265.field4702, true));
                    if (class65.field1220 == 0) {
                        class227.method1565(class89.field1580, (byte) 34, 13, var342);
                    }
                } else if (var304.method1625(121, class240.field4132)) {
                    class230 var337 = var304.method1597(0, 0, var304.method1624(class172.field3041, true));
                    boolean var338 = false;
                    long var339 = var337.method1587(101);
                    for (int var341 = 0; var341 < class45.field796; var341++) {
                        if (class145.field2607[var341] == var339) {
                            var338 = true;
                            break;
                        }
                    }
                    if (!var338 && class65.field1220 == 0) {
                        class227.method1565(var337, (byte) 50, 14, class89.field1580);
                    }
                } else if (var304.method1625(124, class249.field4438)) {
                    class230 var332 = var304.method1597(0, 0, var304.method1624(class172.field3041, true));
                    boolean var333 = false;
                    long var334 = var332.method1587(79);
                    for (int var336 = 0; var336 < class45.field796; var336++) {
                        if (class145.field2607[var336] == var334) {
                            var333 = true;
                            break;
                        }
                    }
                    if (!var333 && class65.field1220 == 0) {
                        class227.method1565(var332, (byte) 28, 15, class89.field1580);
                    }
                } else if (var304.method1625(115, class80.field1453)) {
                    class230 var321 = var304.method1597(0, 0, var304.method1624(class172.field3041, true));
                    long var322 = var321.method1587(84);
                    boolean var324 = false;
                    for (int var325 = 0; var325 < class45.field796; var325++) {
                        if (class145.field2607[var325] == var322) {
                            var324 = true;
                            break;
                        }
                    }
                    if (!var324 && class65.field1220 == 0) {
                        class227.method1565(var321, (byte) 60, 16, class89.field1580);
                    }
                } else if (var304.method1625(125, class48.field853)) {
                    class230 var326 = var304.method1597(arg0 - 16, 0, var304.method1624(class172.field3041, true));
                    boolean var327 = false;
                    long var328 = var326.method1587(93);
                    for (int var330 = 0; var330 < class45.field796; var330++) {
                        if (class145.field2607[var330] == var328) {
                            var327 = true;
                            break;
                        }
                    }
                    if (!var327 && class65.field1220 == 0) {
                        class230 var331 = var304.method1597(0, var304.method1624(class172.field3041, true) + 1, var304.method1635(arg0 ^ 0xFFFFFF8F) + -9);
                        class227.method1565(var326, (byte) 48, 21, var331);
                    }
                } else {
                    class227.method1565(class89.field1580, (byte) 16, 0, var304);
                }
                class259.field4572 = -1;
                return true;
            } else if (class259.field4572 == 87) {
                int var345 = class183.field3182.method199(arg0 - 18);
                class39.field722 = class184.field3228.method1012(2, var345);
                class259.field4572 = -1;
                return true;
            } else if (class259.field4572 == 203) {
                class214.field3702 = class183.field3182.method167(-1);
                class144.field2574 = class183.field3182.method167(-1);
                while (class183.field3182.field318 < class16.field368) {
                    class259.field4572 = class183.field3182.method200(arg0 + 239);
                    class60.method510(arg0 ^ 0x7A);
                }
                class259.field4572 = -1;
                return true;
            } else if (class259.field4572 == 238) {
                int var346 = class183.field3182.method168((byte) 121);
                int var347 = class183.field3182.method200(255);
                int var348 = class183.field3182.method200(arg0 ^ 0xEF);
                class124.field2174 = var347 >> 1;
                class56.field1033.method1810(var348, var346, (var347 & 0x1) == 1, 240);
                class259.field4572 = -1;
                return true;
            } else if (class259.field4572 == 6) {
                int var349 = class183.field3182.method189((byte) -112);
                class245 var350 = class155.method1183(var349, 17);
                for (int var351 = 0; var351 < var350.field4331.length; var351++) {
                    var350.field4331[var351] = -1;
                    var350.field4331[var351] = 0;
                }
                class92.method777((byte) -65, var350);
                class259.field4572 = -1;
                return true;
            } else if (class259.field4572 == 188) {
                class102.field1867 = class183.field3182.method200(arg0 + 239);
                class106.field1925 = class183.field3182.method200(255);
                class7.field117 = class183.field3182.method200(255);
                class259.field4572 = -1;
                return true;
            } else if (class259.field4572 == 55) {
                class212.method1472(22312);
                class107.field1928 = class183.field3182.method178(-1);
                class259.field4572 = -1;
                class130.field2342 = class54.field935;
                return true;
            } else {
                class154.method1177((Throwable) null, (byte) -82, "T1 - " + class259.field4572 + "," + class170.field3013 + "," + class15.field350 + " - " + class16.field368);
                class128.method1006(arg0 - 95);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "(II)I")
    public final int method637(int arg0, int arg1) {
        field1396++;
        if (this.field1397 == null) {
            return this.field1385;
        }
        if (arg1 != 0) {
            this.method646(44, (class14) null, (byte) 31);
        }
        class244 var3 = (class244) this.field1397.method394((long) arg0, -21083);
        return var3 == null ? this.field1385 : var3.field4189;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Leb;B)Z")
    public final boolean method638(class230 arg0, byte arg1) {
        field1391++;
        if (this.field1397 == null) {
            return false;
        }
        if (this.field1389 == null) {
            this.method643((byte) 46);
        }
        int var3 = -94 % ((arg1 + 44) / 40);
        for (class45 var4 = (class45) this.field1389.method394(arg0.method1604(-102), -21083); var4 != null; var4 = (class45) this.field1389.method396(1)) {
            if (var4.field804.method1585(arg0, 89)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "(I)V")
    private final void method639(int arg0) {
        field1383++;
        this.field1389 = new class46(this.field1397.method393(arg0));
        for (class244 var2 = (class244) this.field1397.method392(0); var2 != null; var2 = (class244) this.field1397.method390(-1)) {
            class244 var3 = new class244((int) var2.field1166);
            this.field1389.method388(-1, (long) var2.field4189, var3);
        }
    }

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "(B)V")
    public static void method640(byte arg0) {
        field1400 = null;
        if (arg0 != 95) {
            method645(61);
        }
        field1390 = null;
    }

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "(I)V")
    public static final void method641(int arg0) {
        field1384++;
        if (arg0 > -37) {
            method641(11);
        }
        if (class178.field3138 == 5) {
            class178.field3138 = 6;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BI)Leb;")
    public final class230 method642(byte arg0, int arg1) {
        field1402++;
        if (this.field1397 == null) {
            return this.field1392;
        } else {
            int var3 = 18 % ((-arg0 - 44) / 38);
            class259 var4 = (class259) this.field1397.method394((long) arg1, -21083);
            return var4 == null ? this.field1392 : var4.field4585;
        }
    }

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "(B)V")
    private final void method643(byte arg0) {
        int var2 = 89 / ((-arg0 - 57) / 40);
        field1394++;
        this.field1389 = new class46(this.field1397.method393(-1));
        for (class259 var3 = (class259) this.field1397.method392(0); var3 != null; var3 = (class259) this.field1397.method390(-1)) {
            class45 var4 = new class45(var3.field4585, (int) var3.field1166);
            this.field1389.method388(-1, var3.field4585.method1604(-93), var4);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILfk;)V")
    public final void method644(int arg0, class14 arg1) {
        if (arg0 != -16297) {
            this.field1386 = 115;
        }
        field1388++;
        while (true) {
            int var3 = arg1.method200(255);
            if (var3 == 0) {
                return;
            }
            this.method646(var3, arg1, (byte) 86);
        }
    }

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "(I)V")
    public static final void method645(int arg0) {
        field1401++;
        class92.method777((byte) -65, class229.field3940);
        class66.field1232++;
        if (class226.field3904 && class30.field546) {
            int var1 = class251.field4497;
            int var2 = class34.field620;
            int var3 = var1 - class28.field511;
            if (arg0 >= -81) {
                field1400 = null;
            }
            int var4 = class229.field3940.field4228;
            int var5 = var2 - class49.field869;
            if (class35.field668 > var5) {
                var5 = class35.field668;
            }
            if (class130.field2334 > var3) {
                var3 = class130.field2334;
            }
            if (class229.field3940.field4307 + var3 > class130.field2334 + class138.field2473.field4307) {
                var3 = class130.field2334 + class138.field2473.field4307 - class229.field3940.field4307;
            }
            if (class35.field668 + class138.field2473.field4325 < class229.field3940.field4325 + var5) {
                var5 = class35.field668 + class138.field2473.field4325 - class229.field3940.field4325;
            }
            int var6 = var3 - class41.field748;
            int var7 = var5 - class182.field3176;
            if (class66.field1232 > class229.field3940.field4323 && (var4 < var7 || -var4 > var7 || var6 > var4 || (-var4) > var6)) {
                class177.field3104 = true;
            }
            int var8 = var5 + class138.field2473.field4332 - class35.field668;
            int var9 = class138.field2473.field4351 + var3 - class130.field2334;
            if (class229.field3940.field4350 != null && class177.field3104) {
                class75 var10 = new class75();
                var10.field1362 = var9;
                var10.field1354 = class229.field3940;
                var10.field1359 = var8;
                var10.field1364 = class229.field3940.field4350;
                class58.method495(var10, 150);
            }
            if (class134.field2419 == 0) {
                if (class177.field3104) {
                    if (class229.field3940.field4361 != null) {
                        class75 var11 = new class75();
                        var11.field1367 = class72.field1313;
                        var11.field1354 = class229.field3940;
                        var11.field1364 = class229.field3940.field4361;
                        var11.field1359 = var8;
                        var11.field1362 = var9;
                        class58.method495(var11, 150);
                    }
                    if (class72.field1313 != null && client.method1157(class229.field3940) != null) {
                        class153.field2747.method978(2, 30);
                        class28.field521++;
                        class153.field2747.method186(class229.field3940.field4313, (byte) -125);
                        class153.field2747.method186(class72.field1313.field4313, (byte) -124);
                        class153.field2747.method165(class229.field3940.field4362, 1380186760);
                        class153.field2747.method165(class72.field1313.field4362, 1380186760);
                    }
                } else if ((class159.field2834 == 1 || class106.method881(class186.field3266 - 1, (byte) 65)) && class186.field3266 > 2) {
                    class266.method1840((byte) -48);
                } else if (class186.field3266 > 0) {
                    class158.method1200(-124);
                }
                class229.field3940 = null;
            }
        } else if (class66.field1232 > 1) {
            class229.field3940 = null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILfk;B)V")
    private final void method646(int arg0, class14 arg1, byte arg2) {
        field1387++;
        if (arg0 == 1) {
            this.field1386 = arg1.method200(255);
        } else if (arg0 == 2) {
            this.field1393 = arg1.method200(255);
        } else if (arg0 == 3) {
            this.field1392 = arg1.method171((byte) 79);
        } else if (arg0 == 4) {
            this.field1385 = arg1.method187((byte) 61);
        } else if (arg0 == 5 || arg0 == 6) {
            int var4 = arg1.method161(4);
            this.field1397 = new class46(class52.method415(-13538, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method187((byte) 61);
                class61 var7;
                if (arg0 == 5) {
                    var7 = new class259(arg1.method171((byte) 79));
                } else {
                    var7 = new class244(arg1.method187((byte) 61));
                }
                this.field1397.method388(-1, (long) var6, var7);
            }
        }
        if (arg2 <= 78) {
            this.method646(-63, (class14) null, (byte) 96);
        }
    }
}
