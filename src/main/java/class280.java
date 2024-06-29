import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class280 {

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "[I")
    public static int[] field4431 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "I")
    public static int field4432 = 0;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
    public static final void method1898(int arg0) {
        field4429++;
        if (class257.method1738(true) != 2) {
            return;
        }
        byte var1 = (byte) (class33.field588 - 4 & 0xFF);
        int var2 = class33.field588 % 104;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var17 = 0; var17 < 104; var17++) {
                class141.field2108[var3][var2][var17] = var1;
            }
        }
        int var4 = 71 / ((arg0 - 10) / 46);
        if (class130.field1941 == 3) {
            return;
        }
        for (int var5 = 0; var5 < 2; var5++) {
            class163.field2454[var5] = -1000000;
            class250.field3999[var5] = 1000000;
            class79.field1206[var5] = 0;
            class294.field4569[var5] = 1000000;
            class203.field3127[var5] = 0;
        }
        if (class175.field2704 != 1) {
            int var6 = class254.method1721(-580808345, class130.field1941, class118.field1787, class226.field3616);
            if ((var6 - class250.field4007) < 800 && (client.field2390[class130.field1941][class226.field3616 >> 7][class118.field1787 >> 7] & 0x4) != 0) {
                class159.method1141(class118.field1787 >> 7, (byte) -114, false, 1, class226.field3616 >> 7, class149.field2210);
            }
            return;
        }
        if ((client.field2390[class130.field1941][class263.field4168.field4725 >> 7][class263.field4168.field4709 >> 7] & 0x4) != 0) {
            class159.method1141(class263.field4168.field4709 >> 7, (byte) -127, false, 0, class263.field4168.field4725 >> 7, class149.field2210);
        }
        if (class8.field128 >= 310) {
            return;
        }
        int var7 = class226.field3616 >> 7;
        int var8 = class118.field1787 >> 7;
        int var9 = class263.field4168.field4709 >> 7;
        int var10 = class263.field4168.field4725 >> 7;
        int var11;
        if (var7 >= var10) {
            var11 = var7 - var10;
        } else {
            var11 = var10 - var7;
        }
        int var12;
        if (var9 <= var8) {
            var12 = var8 - var9;
        } else {
            var12 = var9 - var8;
        }
        if (!(var11 != 0 || var12 != 0) || var11 <= -104 || var11 >= 104 || var12 <= -104 || var12 >= 104) {
            class79.method624("RC: " + var7 + "," + var8 + " " + var10 + "," + var9 + " " + class138.field2072 + "," + class159.field2379, (Throwable) null, 0);
        } else if (var11 <= var12) {
            int var13 = var11 * 65536 / var12;
            int var14 = 32768;
            while (var8 != var9) {
                if (var8 < var9) {
                    var8++;
                } else if (var9 < var8) {
                    var8--;
                }
                if ((client.field2390[class130.field1941][var7][var8] & 0x4) != 0) {
                    class159.method1141(var8, (byte) -100, false, 1, var7, class149.field2210);
                    return;
                }
                var14 += var13;
                if (var14 >= 65536) {
                    if (var7 < var10) {
                        var7++;
                    } else if (var10 < var7) {
                        var7--;
                    }
                    var14 -= 65536;
                    if ((client.field2390[class130.field1941][var7][var8] & 0x4) != 0) {
                        class159.method1141(var8, (byte) -106, false, 1, var7, class149.field2210);
                        return;
                    }
                }
            }
        } else {
            int var15 = var12 * 65536 / var11;
            int var16 = 32768;
            while (var7 != var10) {
                if (var7 < var10) {
                    var7++;
                } else if (var7 > var10) {
                    var7--;
                }
                if ((client.field2390[class130.field1941][var7][var8] & 0x4) != 0) {
                    class159.method1141(var8, (byte) -101, false, 1, var7, class149.field2210);
                    return;
                }
                var16 += var15;
                if (var16 >= 65536) {
                    if (var9 > var8) {
                        var8++;
                    } else if (var9 < var8) {
                        var8--;
                    }
                    var16 -= 65536;
                    if ((client.field2390[class130.field1941][var7][var8] & 0x4) != 0) {
                        class159.method1141(var8, (byte) -113, false, 1, var7, class149.field2210);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)V")
    public static void method1899(int arg0) {
        if (arg0 < 55) {
            method1899(118);
        }
        field4431 = null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)Z")
    public static final boolean method1900(byte arg0) throws IOException {
        field4428++;
        if (class301.field4848 == null) {
            return false;
        }
        int var1 = class301.field4848.method1302(114);
        if (var1 == 0) {
            return false;
        }
        if (class215.field3302 == -1) {
            class301.field4848.method1301(0, 120, 1, class183.field2900.field560);
            var1--;
            class183.field2900.field541 = 0;
            class215.field3302 = class183.field2900.method1770((byte) 23);
            class95.field1528 = class2.field29[class215.field3302];
        }
        if (class95.field1528 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class301.field4848.method1301(0, 49, 1, class183.field2900.field560);
            class95.field1528 = class183.field2900.field560[0] & 0xFF;
            var1--;
        }
        if (class95.field1528 == -2) {
            if (var1 <= 1) {
                return false;
            }
            class301.field4848.method1301(0, -121, 2, class183.field2900.field560);
            var1 -= 2;
            class183.field2900.field541 = 0;
            class95.field1528 = class183.field2900.method260((byte) -67);
        }
        if (var1 < class95.field1528) {
            return false;
        }
        class183.field2900.field541 = 0;
        class301.field4848.method1301(0, 105, class95.field1528, class183.field2900.field560);
        class9.field147 = class135.field2019;
        class135.field2019 = class162.field2427;
        class50.field813 = 0;
        class162.field2427 = class215.field3302;
        if (class215.field3302 == 231) {
            int var2 = class183.field2900.method260((byte) -67);
            int var3 = class183.field2900.method265(-111);
            int var4 = class183.field2900.method265(-102);
            int var5 = class183.field2900.method265(-95);
            int var6 = class183.field2900.method265(-85);
            int var7 = class183.field2900.method260((byte) -67);
            if (class169.method1219((byte) 12, var2)) {
                class137.field2066[var3] = true;
                class110.field1694[var3] = var4;
                class24.field417[var3] = var5;
                class77.field1178[var3] = var6;
                class223.field3589[var3] = var7;
            }
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 38) {
            int var8 = class183.field2900.method256(-1);
            int var9 = class183.field2900.method260((byte) -67);
            int var10 = class183.field2900.method300((byte) -30);
            int var11 = class183.field2900.method260((byte) -67);
            int var12 = class183.field2900.method256(-1);
            if (class169.method1219((byte) 12, var12)) {
                class105.method799(var11, var8, var9, (byte) -69, var10);
            }
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 67) {
            class229.field3643 = class183.field2900.method295((byte) -87);
            class222.field3483 = class183.field2900.method295((byte) -87);
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 86) {
            long var13 = class183.field2900.method306(false);
            int var15 = class183.field2900.method260((byte) -67);
            byte var16 = class183.field2900.method266(-129);
            boolean var17 = false;
            if ((Long.MIN_VALUE & var13) != 0L) {
                var17 = true;
            }
            if (var17) {
                if (class297.field4776 == 0) {
                    class215.field3302 = -1;
                    return true;
                }
                long var18 = var13 & Long.MAX_VALUE;
                boolean var20 = false;
                int var21;
                for (var21 = 0; var21 < class297.field4776 && (class83.field1249[var21].field2009 != var18 || class83.field1249[var21].field2324 != var15); var21++) {
                }
                if (var21 < class297.field4776) {
                    while (var21 < (class297.field4776 - 1)) {
                        class83.field1249[var21] = class83.field1249[var21 + 1];
                        var21++;
                    }
                    class297.field4776--;
                    class83.field1249[class297.field4776] = null;
                }
            } else {
                String var22 = class183.field2900.method262(11386);
                class156 var23 = new class156();
                var23.field2009 = var13;
                var23.field2321 = class257.method1739((byte) 17, var23.field2009);
                var23.field2327 = var16;
                var23.field2324 = var15;
                var23.field2329 = var22;
                int var24;
                for (var24 = class297.field4776 - 1; var24 >= 0; var24--) {
                    int var25 = class83.field1249[var24].field2321.compareTo(var23.field2321);
                    if (var25 == 0) {
                        class83.field1249[var24].field2324 = var15;
                        class83.field1249[var24].field2327 = var16;
                        class83.field1249[var24].field2329 = var22;
                        class215.field3302 = -1;
                        if (class262.field4150 == var13) {
                            class204.field3148 = var16;
                        }
                        class204.field3139 = class216.field3305;
                        return true;
                    }
                    if (var25 < 0) {
                        break;
                    }
                }
                if (class83.field1249.length <= class297.field4776) {
                    class215.field3302 = -1;
                    return true;
                }
                for (int var26 = class297.field4776 - 1; var26 > var24; var26--) {
                    class83.field1249[var26 + 1] = class83.field1249[var26];
                }
                if (class297.field4776 == 0) {
                    class83.field1249 = new class156[100];
                }
                class83.field1249[var24 + 1] = var23;
                if (class262.field4150 == var13) {
                    class204.field3148 = var16;
                }
                class297.field4776++;
            }
            class204.field3139 = class216.field3305;
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 104) {
            int var27 = class183.field2900.method260((byte) -67);
            int var28 = class183.field2900.method265(-99);
            int var29 = class183.field2900.method265(-99);
            int var30 = class183.field2900.method260((byte) -67);
            int var31 = class183.field2900.method265(-94);
            int var32 = class183.field2900.method265(-95);
            if (class169.method1219((byte) 12, var27)) {
                class62.method501(var32, var28, (byte) 100, var29, var30, var31);
            }
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 100) {
            String var33 = class183.field2900.method262(11386);
            if (var33.endsWith(":tradereq:")) {
                boolean var69 = false;
                String var70 = var33.substring(0, var33.indexOf(":"));
                long var71 = class170.method1223(true, var70);
                for (int var73 = 0; var73 < class40.field677; var73++) {
                    if (class78.field1189[var73] == var71) {
                        var69 = true;
                        break;
                    }
                }
                if (!var69 && class236.field3724 == 0) {
                    class247.method1671(4, class69.field1094, -1, var70);
                }
            } else if (var33.endsWith(":chalreq:")) {
                boolean var63 = false;
                String var64 = var33.substring(0, var33.indexOf(":"));
                long var65 = class170.method1223(true, var64);
                for (int var67 = 0; var67 < class40.field677; var67++) {
                    if (class78.field1189[var67] == var65) {
                        var63 = true;
                        break;
                    }
                }
                if (!var63 && class236.field3724 == 0) {
                    String var68 = var33.substring(var33.indexOf(":") + 1, var33.length() + -9);
                    class247.method1671(8, var68, -1, var64);
                }
            } else if (var33.endsWith(":assistreq:")) {
                String var34 = var33.substring(0, var33.indexOf(":"));
                long var35 = class170.method1223(true, var34);
                boolean var37 = false;
                for (int var38 = 0; var38 < class40.field677; var38++) {
                    if (class78.field1189[var38] == var35) {
                        var37 = true;
                        break;
                    }
                }
                if (!var37 && class236.field3724 == 0) {
                    class247.method1671(10, "", -1, var34);
                }
            } else if (var33.endsWith(":clan:")) {
                String var39 = var33.substring(0, var33.indexOf(":clan:"));
                class247.method1671(11, var39, -1, "");
            } else if (var33.endsWith(":trade:")) {
                String var62 = var33.substring(0, var33.indexOf(":trade:"));
                if (class236.field3724 == 0) {
                    class247.method1671(12, var62, -1, "");
                }
            } else if (var33.endsWith(":assist:")) {
                String var40 = var33.substring(0, var33.indexOf(":assist:"));
                if (class236.field3724 == 0) {
                    class247.method1671(13, var40, -1, "");
                }
            } else if (var33.endsWith(":duelstake:")) {
                String var41 = var33.substring(0, var33.indexOf(":"));
                boolean var42 = false;
                long var43 = class170.method1223(true, var41);
                for (int var45 = 0; var45 < class40.field677; var45++) {
                    if (class78.field1189[var45] == var43) {
                        var42 = true;
                        break;
                    }
                }
                if (!var42 && class236.field3724 == 0) {
                    class247.method1671(14, "", -1, var41);
                }
            } else if (var33.endsWith(":duelfriend:")) {
                String var46 = var33.substring(0, var33.indexOf(":"));
                long var47 = class170.method1223(true, var46);
                boolean var49 = false;
                for (int var50 = 0; var50 < class40.field677; var50++) {
                    if (class78.field1189[var50] == var47) {
                        var49 = true;
                        break;
                    }
                }
                if (!var49 && class236.field3724 == 0) {
                    class247.method1671(15, "", -1, var46);
                }
            } else if (var33.endsWith(":clanreq:")) {
                String var51 = var33.substring(0, var33.indexOf(":"));
                long var52 = class170.method1223(true, var51);
                boolean var54 = false;
                for (int var55 = 0; var55 < class40.field677; var55++) {
                    if (class78.field1189[var55] == var52) {
                        var54 = true;
                        break;
                    }
                }
                if (!var54 && class236.field3724 == 0) {
                    class247.method1671(16, "", -1, var51);
                }
            } else if (var33.endsWith(":allyreq:")) {
                String var56 = var33.substring(0, var33.indexOf(":"));
                long var57 = class170.method1223(true, var56);
                boolean var59 = false;
                for (int var60 = 0; var60 < class40.field677; var60++) {
                    if (class78.field1189[var60] == var57) {
                        var59 = true;
                        break;
                    }
                }
                if (!var59 && class236.field3724 == 0) {
                    String var61 = var33.substring(var33.indexOf(":") + 1, var33.length() + -9);
                    class247.method1671(21, var61, -1, var56);
                }
            } else {
                class247.method1671(0, var33, -1, "");
            }
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 208) {
            class303.method2026(false);
            class203.field3132 = class183.field2900.method265(-112);
            class215.field3302 = -1;
            class255.field4082 = class216.field3305;
            return true;
        } else if (class215.field3302 == 126) {
            int var74 = class183.field2900.method279(true);
            int var75 = class183.field2900.method265(-116);
            int var76 = class183.field2900.method256(-1);
            int var77 = class183.field2900.method260((byte) -67);
            if (class169.method1219((byte) 12, var76)) {
                class288 var78 = (class288) class48.field787.method2043((long) var74, -1);
                if (var78 != null) {
                    class22.method192(var78.field4505 != var77, var78, (byte) 114);
                }
                class279.method1896(26, var74, var77, var75);
            }
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 151) {
            class183.field2900.field541 += 28;
            if (class183.field2900.method275((byte) -31)) {
                class209.method1461(class183.field2900.field541 - 28, class183.field2900, true);
            }
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 6) {
            long var79 = class183.field2900.method306(false);
            long var81 = (long) class183.field2900.method260((byte) -67);
            long var83 = (long) class183.field2900.method304((byte) 84);
            long var85 = (var81 << 32) + var83;
            int var87 = class183.field2900.method265(-107);
            int var88 = class183.field2900.method260((byte) -67);
            boolean var89 = false;
            int var90 = 0;
            label1292: while (true) {
                if (var90 >= 100) {
                    if (var87 <= 1) {
                        for (int var91 = 0; var91 < class40.field677; var91++) {
                            if (class78.field1189[var91] == var79) {
                                var89 = true;
                                break label1292;
                            }
                        }
                    }
                    break;
                }
                if (class283.field4464[var90] == var85) {
                    var89 = true;
                    break;
                }
                var90++;
            }
            if (!var89 && class236.field3724 == 0) {
                class283.field4464[class253.field4045] = var85;
                class253.field4045 = (class253.field4045 + 1) % 100;
                String var92 = class261.method1749(-117, var88).method1068(class183.field2900, (byte) 93);
                if (var87 == 2) {
                    class296.method1972(var92, var88, (String) null, -128, 18, "<img=1>" + class292.method1939(var79, -75));
                } else if (var87 == 1) {
                    class296.method1972(var92, var88, (String) null, -128, 18, "<img=0>" + class292.method1939(var79, -100));
                } else {
                    class296.method1972(var92, var88, (String) null, -128, 18, class292.method1939(var79, -87));
                }
            }
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 241) {
            class181.method1293(false, 26);
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 233) {
            long var93 = class183.field2900.method306(false);
            String var95 = class267.method1791(class67.method547(class297.method1992(class183.field2900, 125), (byte) 20));
            class247.method1671(6, var95, -1, class292.method1939(var93, -57));
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 102) {
            int var96 = class183.field2900.method260((byte) -67);
            if (var96 == 65535) {
                var96 = -1;
            }
            int var97 = class183.field2900.method279(true);
            int var98 = class183.field2900.method256(-1);
            if (class169.method1219((byte) 12, var98)) {
                class49.method413(2, -1, var96, var97, false);
            }
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 228 || class215.field3302 == 73 || class215.field3302 == 224 || class215.field3302 == 149 || class215.field3302 == 225 || class215.field3302 == 138 || class215.field3302 == 191 || class215.field3302 == 81 || class215.field3302 == 109 || class215.field3302 == 199 || class215.field3302 == 122 || class215.field3302 == 30 || class215.field3302 == 17 || class215.field3302 == 78) {
            class140.method1026((byte) 121);
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 172) {
            int var99 = class183.field2900.method260((byte) -67);
            class118.method862(var99, 106);
            class223.field3574[class118.method863(class73.field1120++, 31)] = class118.method863(var99, 32767);
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 39) {
            int var100 = class183.field2900.method316(98);
            int var101 = class183.field2900.method267(-7803);
            int var102 = class183.field2900.method261(false);
            int var103 = class183.field2900.method300((byte) -30);
            if (class169.method1219((byte) 12, var101)) {
                class270.method1829(var100, var102, var103, 83);
            }
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 184) {
            int var104 = class183.field2900.method267(-7803);
            int var105 = class183.field2900.method260((byte) -67);
            int var106 = class183.field2900.method256(-1);
            if (class169.method1219((byte) 12, var106)) {
                class307.method2054(-59, var105, var104);
            }
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 153) {
            int var107 = class183.field2900.method260((byte) -67);
            if (var107 == 65535) {
                var107 = -1;
            }
            int var108 = class183.field2900.method265(-105);
            int var109 = class183.field2900.method260((byte) -67);
            int var110 = class183.field2900.method265(-83);
            class24.method216((byte) 122, var107, var110, var109, var108);
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 55) {
            int var111 = class183.field2900.method282((byte) 111);
            int var112 = class183.field2900.method256(-1);
            int var113 = class183.field2900.method312((byte) 69);
            int var114 = class183.field2900.method282((byte) 118);
            if (class169.method1219((byte) 12, var112)) {
                class234.method1602(7880, (var111 << 16) + var114, var113);
            }
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 117) {
            int var115 = class183.field2900.method294((byte) 78);
            int var116 = class183.field2900.method267(-7803);
            if (class169.method1219((byte) 12, var116)) {
                int var117 = 0;
                if (class263.field4168.field2044 != null) {
                    var117 = class263.field4168.field2044.method1322(-68);
                }
                class49.method413(3, -1, var117, var115, false);
            }
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 245) {
            int var118 = class183.field2900.method294((byte) 93);
            class142.field2133 = class123.field1863.method17(true, var118);
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 207) {
            class52.field824 = class183.field2900.method265(-119);
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 243) {
            class40.field677 = class95.field1528 / 8;
            for (int var119 = 0; var119 < class40.field677; var119++) {
                class78.field1189[var119] = class183.field2900.method306(false);
                class226.field3627[var119] = class279.method1894(class78.field1189[var119], (byte) 63);
                class214.field3275[var119] = false;
            }
            class215.field3302 = -1;
            class178.field2737 = class216.field3305;
            return true;
        } else if (class215.field3302 == 72) {
            class149.method1081(-22202);
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 79) {
            int var120 = class183.field2900.method267(-7803);
            int var121 = class183.field2900.method282((byte) 120);
            int var122 = class183.field2900.method260((byte) -67);
            int var123 = class183.field2900.method294((byte) 71);
            int var124 = class183.field2900.method282((byte) 117);
            if (class169.method1219((byte) 12, var122)) {
                class49.method413(7, var120, var121 << 16 | var124, var123, false);
            }
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 165) {
            int var125 = class183.field2900.method256(-1);
            int var126 = class183.field2900.method265(-112);
            class42.method372(var126, 1, var125);
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 211) {
            if (class95.field1528 == 0) {
                class54.field852 = class281.field4438;
            } else {
                class54.field852 = class183.field2900.method262(11386);
            }
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 116) {
            class215.field3302 = -1;
            class305.field4895 = 0;
            return true;
        } else if (class215.field3302 == 74) {
            int var127 = class183.field2900.method260((byte) -67);
            if (var127 == 65535) {
                var127 = -1;
            }
            int var128 = class183.field2900.method267(-7803);
            int var129 = class183.field2900.method256(-1);
            int var130 = class183.field2900.method260((byte) -67);
            if (var130 == 65535) {
                var130 = -1;
            }
            int var131 = class183.field2900.method279(true);
            if (class169.method1219((byte) 12, var129)) {
                for (int var132 = var130; var132 <= var127; var132++) {
                    long var133 = ((long) var131 << 32) + (long) var132;
                    class28 var135 = (class28) class45.field760.method2043(var133, -1);
                    class28 var136;
                    if (var135 != null) {
                        var136 = new class28(var135.field477, var128);
                        var135.method995((byte) -22);
                    } else if (var132 == -1) {
                        var136 = new class28(class169.method1217(var131, 12180).field3424.field477, var128);
                    } else {
                        var136 = new class28(0, var128);
                    }
                    class45.field760.method2046(var136, -98, var133);
                }
            }
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 5) {
            class149.field2215 = class183.field2900.method265(-97);
            class206.field3174 = class183.field2900.method265(-97);
            class182.field2876 = class183.field2900.method265(-106);
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 181) {
            class169.method1221(class95.field1528, class123.field1863, -330, class183.field2900);
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 230) {
            int var137 = class183.field2900.method260((byte) -67);
            if (class169.method1219((byte) 12, var137)) {
                class178.method1265(5);
            }
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 248) {
            int var138 = class183.field2900.method265(-93);
            if (class183.field2900.method265(-86) == 0) {
                class28.field475[var138] = new class204();
            } else {
                class183.field2900.field541--;
                class28.field475[var138] = new class204(class183.field2900);
            }
            class215.field3302 = -1;
            class173.field2671 = class216.field3305;
            return true;
        } else if (class215.field3302 == 146) {
            int var139 = class183.field2900.method260((byte) -67);
            if (class169.method1219((byte) 12, var139)) {
                class254.method1715(0);
            }
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 36) {
            int var140 = class183.field2900.method267(-7803);
            if (var140 == 65535) {
                var140 = -1;
            }
            int var141 = class183.field2900.method277((byte) -103);
            class260.method1745(var140, 0, var141);
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 103) {
            int var142 = class183.field2900.method256(-1);
            if (var142 == 65535) {
                var142 = -1;
            }
            int var143 = class183.field2900.method315((byte) 76);
            int var144 = class183.field2900.method304((byte) 84);
            class268.method1816(var143, (byte) -23, var142, var144);
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 166) {
            int var145 = class183.field2900.method267(-7803);
            if (var145 == 65535) {
                var145 = -1;
            }
            int var146 = class183.field2900.method315((byte) 73);
            String var147 = class183.field2900.method262(11386);
            int var148 = class183.field2900.method315((byte) 85);
            if (var146 >= 1 && var146 <= 8) {
                if (var147.equalsIgnoreCase("null")) {
                    var147 = null;
                }
                class84.field1262[var146 - 1] = var147;
                class189.field2975[var146 - 1] = var145;
                class282.field4452[var146 - 1] = var148 == 0;
            }
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 139) {
            int var149 = class183.field2900.method300((byte) -30);
            int var150 = class183.field2900.method300((byte) -30);
            int var151 = class183.field2900.method282((byte) 116);
            int var152 = class183.field2900.method256(-1);
            int var153 = class183.field2900.method267(-7803);
            if (var151 == 65535) {
                var151 = -1;
            }
            if (var153 == 65535) {
                var153 = -1;
            }
            if (class169.method1219((byte) 12, var152)) {
                for (int var154 = var153; var154 <= var151; var154++) {
                    long var155 = ((long) var149 << 32) + (long) var154;
                    class28 var157 = (class28) class45.field760.method2043(var155, -1);
                    class28 var158;
                    if (var157 != null) {
                        var158 = new class28(var150, var157.field487);
                        var157.method995((byte) -109);
                    } else if (var154 == -1) {
                        var158 = new class28(var150, class169.method1217(var149, 12180).field3424.field487);
                    } else {
                        var158 = new class28(var150, -1);
                    }
                    class45.field760.method2046(var158, -69, var155);
                }
            }
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 137) {
            int var159 = class183.field2900.method300((byte) -30);
            int var160 = class183.field2900.method260((byte) -67);
            if (var159 < -70000) {
                var160 += 32768;
            }
            class222 var161;
            if (var159 < 0) {
                var161 = null;
            } else {
                var161 = class169.method1217(var159, 12180);
            }
            if (var161 != null) {
                for (int var162 = 0; var162 < var161.field3407.length; var162++) {
                    var161.field3407[var162] = 0;
                    var161.field3567[var162] = 0;
                }
            }
            class170.method1225(-1, var160);
            int var163 = class183.field2900.method260((byte) -67);
            for (int var164 = 0; var164 < var163; var164++) {
                int var165 = class183.field2900.method295((byte) -87);
                if (var165 == 255) {
                    var165 = class183.field2900.method294((byte) 103);
                }
                int var166 = class183.field2900.method260((byte) -67);
                if (var161 != null && var164 < var161.field3407.length) {
                    var161.field3407[var164] = var166;
                    var161.field3567[var164] = var165;
                }
                class206.method1442(10427, var160, var166 - 1, var164, var165);
            }
            if (var161 != null) {
                class80.method628((byte) -82, var161);
            }
            class303.method2026(false);
            class223.field3574[class118.method863(31, class73.field1120++)] = class118.method863(32767, var160);
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 217) {
            class194.field3046 = class183.field2900.method265(-101);
            class178.field2737 = class216.field3305;
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 31) {
            byte var167 = class183.field2900.method263(false);
            int var168 = class183.field2900.method260((byte) -67);
            int var169 = class183.field2900.method267(-7803);
            if (class169.method1219((byte) 12, var168)) {
                class306.method2051(var169, var167, (byte) -63);
            }
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 54) {
            class181.method1293(true, 26);
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 44) {
            class222.field3483 = class183.field2900.method277((byte) -103);
            class229.field3643 = class183.field2900.method265(-115);
            while (class183.field2900.field541 < class95.field1528) {
                class215.field3302 = class183.field2900.method265(-87);
                class140.method1026((byte) -113);
            }
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 255) {
            long var170 = class183.field2900.method306(false);
            class183.field2900.method266(-129);
            long var172 = class183.field2900.method306(false);
            long var174 = (long) class183.field2900.method260((byte) -67);
            long var176 = (long) class183.field2900.method304((byte) 84);
            long var178 = (var174 << 32) + var176;
            int var180 = class183.field2900.method265(-105);
            boolean var181 = false;
            int var182 = 0;
            label1370: while (true) {
                if (var182 >= 100) {
                    if (var180 <= 1) {
                        if ((!class112.field1733 || class166.field2508) && !class54.field854) {
                            for (int var183 = 0; var183 < class40.field677; var183++) {
                                if (class78.field1189[var183] == var170) {
                                    var181 = true;
                                    break label1370;
                                }
                            }
                        } else {
                            var181 = true;
                        }
                    }
                    break;
                }
                if (class283.field4464[var182] == var178) {
                    var181 = true;
                    break;
                }
                var182++;
            }
            if (!var181 && class236.field3724 == 0) {
                class283.field4464[class253.field4045] = var178;
                class253.field4045 = (class253.field4045 + 1) % 100;
                String var184 = class267.method1791(class67.method547(class297.method1992(class183.field2900, 127), (byte) 20));
                if (var180 == 2 || var180 == 3) {
                    class265.method1777(class292.method1939(var172, -121), 6705, var184, "<img=1>" + class292.method1939(var170, -81), 9);
                } else if (var180 == 1) {
                    class265.method1777(class292.method1939(var172, -85), 6705, var184, "<img=0>" + class292.method1939(var170, -74), 9);
                } else {
                    class265.method1777(class292.method1939(var172, -33), 6705, var184, class292.method1939(var170, -36), 9);
                }
            }
            class215.field3302 = -1;
            return true;
        } else if (arg0 < 25) {
            return true;
        } else if (class215.field3302 == 7) {
            int var185 = class183.field2900.method265(-102);
            int var186 = var185 >> 5;
            int var187 = var185 & 0x1F;
            if (var187 == 0) {
                class136.field2053[var186] = null;
                class215.field3302 = -1;
                return true;
            }
            class173 var188 = new class173();
            var188.field2670 = var187;
            var188.field2662 = class183.field2900.method265(-114);
            if (var188.field2662 >= 0 && var188.field2662 < class15.field198.length) {
                if (var188.field2670 == 1 || var188.field2670 == 10) {
                    var188.field2665 = class183.field2900.method260((byte) -67);
                    class183.field2900.field541 += 5;
                } else if (var188.field2670 >= 2 && var188.field2670 <= 6) {
                    if (var188.field2670 == 2) {
                        var188.field2672 = 64;
                        var188.field2656 = 64;
                    }
                    if (var188.field2670 == 3) {
                        var188.field2656 = 0;
                        var188.field2672 = 64;
                    }
                    if (var188.field2670 == 4) {
                        var188.field2672 = 64;
                        var188.field2656 = 128;
                    }
                    if (var188.field2670 == 5) {
                        var188.field2672 = 0;
                        var188.field2656 = 64;
                    }
                    if (var188.field2670 == 6) {
                        var188.field2656 = 64;
                        var188.field2672 = 128;
                    }
                    var188.field2670 = 2;
                    var188.field2661 = class183.field2900.method260((byte) -67);
                    var188.field2667 = class183.field2900.method260((byte) -67);
                    var188.field2675 = class183.field2900.method265(-114);
                    var188.field2664 = class183.field2900.method260((byte) -67);
                }
                var188.field2668 = class183.field2900.method260((byte) -67);
                if (var188.field2668 == 65535) {
                    var188.field2668 = -1;
                }
                class136.field2053[var186] = var188;
            }
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 193) {
            long var189 = class183.field2900.method306(false);
            boolean var191 = true;
            int var192 = class183.field2900.method260((byte) -67);
            String var193 = "";
            if (var189 < 0L) {
                var189 &= Long.MAX_VALUE;
                var191 = false;
            }
            int var194 = class183.field2900.method265(-104);
            if (var192 > 0) {
                var193 = class183.field2900.method262(11386);
            }
            String var195 = class292.method1939(var189, -91);
            for (int var196 = 0; var196 < class181.field2843; var196++) {
                if (class238.field3762[var196] == var189) {
                    if (class143.field2139[var196] != var192) {
                        class143.field2139[var196] = var192;
                        if (var192 > 0) {
                            class247.method1671(5, var195 + class127.field1910, -1, "");
                        }
                        if (var192 == 0) {
                            class247.method1671(5, var195 + class22.field351, -1, "");
                        }
                    }
                    class241.field3873[var196] = var193;
                    var195 = null;
                    class157.field2353[var196] = var194;
                    class253.field4049[var196] = var191;
                    break;
                }
            }
            if (var195 != null && class181.field2843 < 200) {
                class238.field3762[class181.field2843] = var189;
                class64.field1015[class181.field2843] = var195;
                class143.field2139[class181.field2843] = var192;
                class241.field3873[class181.field2843] = var193;
                class157.field2353[class181.field2843] = var194;
                class253.field4049[class181.field2843] = var191;
                class181.field2843++;
            }
            class178.field2737 = class216.field3305;
            boolean var197 = false;
            int var198 = class181.field2843;
            while (var198 > 0) {
                var198--;
                boolean var199 = true;
                for (int var200 = 0; var200 < var198; var200++) {
                    if (class143.field2139[var200] != class49.field807 && class143.field2139[var200 + 1] == class49.field807 || class143.field2139[var200] == 0 && class143.field2139[var200 + 1] != 0) {
                        var199 = false;
                        int var201 = class143.field2139[var200];
                        class143.field2139[var200] = class143.field2139[var200 + 1];
                        class143.field2139[var200 + 1] = var201;
                        String var202 = class241.field3873[var200];
                        class241.field3873[var200] = class241.field3873[var200 + 1];
                        class241.field3873[var200 + 1] = var202;
                        String var203 = class64.field1015[var200];
                        class64.field1015[var200] = class64.field1015[var200 + 1];
                        class64.field1015[var200 + 1] = var203;
                        long var204 = class238.field3762[var200];
                        class238.field3762[var200] = class238.field3762[var200 + 1];
                        class238.field3762[var200 + 1] = var204;
                        int var206 = class157.field2353[var200];
                        class157.field2353[var200] = class157.field2353[var200 + 1];
                        class157.field2353[var200 + 1] = var206;
                        boolean var207 = class253.field4049[var200];
                        class253.field4049[var200] = class253.field4049[var200 + 1];
                        class253.field4049[var200 + 1] = var207;
                    }
                }
                if (var199) {
                    break;
                }
            }
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 121) {
            int var208 = class183.field2900.method267(-7803);
            byte var209 = class183.field2900.method266(-129);
            class179.method1270(-129, var209, var208);
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 198) {
            class252.method1710(0);
            class215.field3302 = -1;
            return false;
        } else if (class215.field3302 == 174) {
            for (int var210 = 0; var210 < class257.field4090.length; var210++) {
                if (class257.field4090[var210] != class168.field2529[var210]) {
                    class257.field4090[var210] = class168.field2529[var210];
                    class170.method1227(var210, -7);
                    class260.field4113[class118.method863(class59.field939++, 31)] = var210;
                }
            }
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 144) {
            int var211 = class183.field2900.method312((byte) 69);
            int var212 = class183.field2900.method282((byte) 105);
            int var213 = class183.field2900.method267(-7803);
            int var214 = class183.field2900.method282((byte) 107);
            if ((var211 >> 30) != 0) {
                int var215 = (var211 >> 14 & 0x3FFF) - class138.field2072;
                int var216 = (var211 & 0x3FFF) - class159.field2379;
                int var217 = var211 >> 28 & 0x3;
                if (var215 >= 0 && var216 >= 0 && var215 < 104 && var216 < 104) {
                    int var218 = var216 * 128 + 64;
                    int var219 = var215 * 128 + 64;
                    class37 var220 = new class37(var212, var217, var219, var218, class254.method1721(-580808345, var217, var218, var219) - var214, var213, class41.field686);
                    class241.field3841.method12(new class307(var220), 12);
                }
            } else if ((var211 >> 29) != 0) {
                int var221 = var211 & 0xFFFF;
                class161 var222 = class116.field1781[var221];
                if (var222 != null) {
                    if (var212 == 65535) {
                        var212 = -1;
                    }
                    boolean var223 = true;
                    if (var212 != -1 && var222.field4732 != -1) {
                        if (var222.field4732 == var212) {
                            class206 var228 = class86.method654(var212, 97);
                            if (var228.field3180 && var228.field3166 != -1) {
                                class103 var229 = class250.method1700(var228.field3166, -78);
                                int var230 = var229.field1604;
                                if (var230 == 1) {
                                    var223 = false;
                                    var222.field4750 = class41.field686 + var213;
                                    var222.field4697 = 0;
                                    var222.field4711 = 0;
                                    var222.field4713 = 1;
                                    var222.field4660 = 0;
                                    class136.method1004(var222.field4725, var222.field4660, var222.field4709, var229, 255, false);
                                } else if (var230 == 2) {
                                    var222.field4720 = 0;
                                    var223 = false;
                                }
                            }
                        } else {
                            class206 var224 = class86.method654(var212, 127);
                            class206 var225 = class86.method654(var222.field4732, 115);
                            if (var224.field3166 != -1 && var225.field3166 != -1) {
                                class103 var226 = class250.method1700(var224.field3166, -31);
                                class103 var227 = class250.method1700(var225.field3166, -19);
                                if (var226.field1589 < var227.field1589) {
                                    var223 = false;
                                }
                            }
                        }
                    }
                    if (var223) {
                        var222.field4750 = class41.field686 + var213;
                        var222.field4744 = var214;
                        var222.field4711 = 0;
                        var222.field4713 = 1;
                        var222.field4660 = 0;
                        var222.field4732 = var212;
                        if (class41.field686 < var222.field4750) {
                            var222.field4660 = -1;
                        }
                        if (var222.field4732 != -1 && class41.field686 == var222.field4750) {
                            int var231 = class86.method654(var222.field4732, 94).field3166;
                            if (var231 != -1) {
                                class103 var232 = class250.method1700(var231, -30);
                                if (var232 != null && var232.field1606 != null) {
                                    class136.method1004(var222.field4725, 0, var222.field4709, var232, 255, false);
                                }
                            }
                        }
                    }
                }
            } else if (var211 >> 28 != 0) {
                int var233 = var211 & 0xFFFF;
                class136 var234;
                if (class107.field1677 == var233) {
                    var234 = class263.field4168;
                } else {
                    var234 = class233.field3682[var233];
                }
                if (var234 != null) {
                    boolean var235 = true;
                    if (var212 == 65535) {
                        var212 = -1;
                    }
                    if (var212 != -1 && var234.field4732 != -1) {
                        if (var234.field4732 == var212) {
                            class206 var240 = class86.method654(var212, 104);
                            if (var240.field3180 && var240.field3166 != -1) {
                                class103 var241 = class250.method1700(var240.field3166, -124);
                                int var242 = var241.field1604;
                                if (var242 == 1) {
                                    var234.field4713 = 1;
                                    var235 = false;
                                    var234.field4697 = 0;
                                    var234.field4711 = 0;
                                    var234.field4660 = 0;
                                    var234.field4750 = class41.field686 + var213;
                                    class136.method1004(var234.field4725, var234.field4660, var234.field4709, var241, 255, false);
                                } else if (var242 == 2) {
                                    var235 = false;
                                    var234.field4720 = 0;
                                }
                            }
                        } else {
                            class206 var236 = class86.method654(var212, 122);
                            class206 var237 = class86.method654(var234.field4732, 114);
                            if (var236.field3166 != -1 && var237.field3166 != -1) {
                                class103 var238 = class250.method1700(var236.field3166, -84);
                                class103 var239 = class250.method1700(var237.field3166, -104);
                                if (var239.field1589 > var238.field1589) {
                                    var235 = false;
                                }
                            }
                        }
                    }
                    if (var235) {
                        var234.field4713 = 1;
                        var234.field4660 = 0;
                        var234.field4711 = 0;
                        var234.field4732 = var212;
                        var234.field4750 = class41.field686 + var213;
                        if (class41.field686 < var234.field4750) {
                            var234.field4660 = -1;
                        }
                        if (var234.field4732 == 65535) {
                            var234.field4732 = -1;
                        }
                        var234.field4744 = var214;
                        if (var234.field4732 != -1 && class41.field686 == var234.field4750) {
                            int var243 = class86.method654(var234.field4732, 100).field3166;
                            if (var243 != -1) {
                                class103 var244 = class250.method1700(var243, -36);
                                if (var244 != null && var244.field1606 != null) {
                                    class136.method1004(var234.field4725, 0, var234.field4709, var244, 255, class263.field4168 == var234);
                                }
                            }
                        }
                    }
                }
            }
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 35) {
            if (class298.field4803 != -1) {
                class112.method829(-101, 0, class298.field4803);
            }
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 10) {
            byte[] var245 = new byte[class95.field1528];
            class183.field2900.method1764(0, var245, class95.field1528, true);
            String var246 = class130.method967(var245, 10, class95.field1528, 0);
            if (class170.field2582 == null && class4.field60 == 3 || !class4.field59.startsWith("win") || class60.field958) {
                class118.method865(39, var246, true);
            } else {
                class290.field4514 = true;
                class58.field937 = var246;
                class82.field1239 = class123.field1863.method22(0, var246);
            }
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 119) {
            class194.method1384(-127);
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 18) {
            int var247 = class183.field2900.method260((byte) -67);
            String var248 = class183.field2900.method262(11386);
            int var249 = class183.field2900.method282((byte) 120);
            if (class169.method1219((byte) 12, var247)) {
                class53.method453(var249, 0, var248);
            }
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 124) {
            int var250 = class183.field2900.method256(-1);
            int var251 = class183.field2900.method294((byte) 91);
            int var252 = class183.field2900.method256(-1);
            if (var252 == 65535) {
                var252 = -1;
            }
            if (class169.method1219((byte) 12, var250)) {
                class49.method413(1, -1, var252, var251, false);
            }
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 23) {
            long var253 = class183.field2900.method306(false);
            int var255 = class183.field2900.method260((byte) -67);
            String var256 = class261.method1749(-117, var255).method1068(class183.field2900, (byte) 86);
            class296.method1972(var256, var255, (String) null, -128, 19, class292.method1939(var253, -53));
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 97) {
            int var257 = class183.field2900.method265(-96);
            int var258 = class183.field2900.method256(-1);
            if (class169.method1219((byte) 12, var258)) {
                class292.field4531 = var257;
            }
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 206) {
            class204.field3139 = class216.field3305;
            long var259 = class183.field2900.method306(false);
            if (var259 == 0L) {
                class218.field3332 = null;
                class215.field3302 = -1;
                class297.field4776 = 0;
                class138.field2073 = null;
                class83.field1249 = null;
                return true;
            }
            long var261 = class183.field2900.method306(false);
            class138.field2073 = class257.method1739((byte) -119, var261);
            class218.field3332 = class257.method1739((byte) 125, var259);
            class36.field621 = class183.field2900.method266(-129);
            int var263 = class183.field2900.method265(-104);
            if (var263 == 255) {
                class215.field3302 = -1;
                return true;
            }
            class297.field4776 = var263;
            class156[] var264 = new class156[100];
            for (int var265 = 0; var265 < class297.field4776; var265++) {
                var264[var265] = new class156();
                var264[var265].field2009 = class183.field2900.method306(false);
                var264[var265].field2321 = class257.method1739((byte) 23, var264[var265].field2009);
                var264[var265].field2324 = class183.field2900.method260((byte) -67);
                var264[var265].field2327 = class183.field2900.method266(-129);
                var264[var265].field2329 = class183.field2900.method262(11386);
                if (class262.field4150 == var264[var265].field2009) {
                    class204.field3148 = var264[var265].field2327;
                }
            }
            boolean var266 = false;
            int var267 = class297.field4776;
            while (var267 > 0) {
                boolean var268 = true;
                var267--;
                for (int var269 = 0; var269 < var267; var269++) {
                    if (var264[var269].field2321.compareTo(var264[var269 + 1].field2321) > 0) {
                        class156 var270 = var264[var269];
                        var264[var269] = var264[var269 + 1];
                        var264[var269 + 1] = var270;
                        var268 = false;
                    }
                }
                if (var268) {
                    break;
                }
            }
            class83.field1249 = var264;
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 216) {
            class253.method1712((byte) -61);
            class303.method2026(false);
            class215.field3302 = -1;
            class59.field939 += 32;
            return true;
        } else if (class215.field3302 == 214) {
            class304.field4892 = class183.field2900.method282((byte) 111) * 30;
            class215.field3302 = -1;
            class255.field4082 = class216.field3305;
            return true;
        } else if (class215.field3302 == 2) {
            int var271 = class183.field2900.method294((byte) 109);
            int var272 = class183.field2900.method282((byte) 122);
            int var273 = class183.field2900.method312((byte) -65);
            int var274 = class183.field2900.method267(-7803);
            if (var274 == 65535) {
                var274 = -1;
            }
            if (class169.method1219((byte) 12, var272)) {
                class222 var275 = class169.method1217(var271, 12180);
                if (var275.field3441) {
                    class301.method2017(var274, var273, var271, (byte) -41);
                    class179 var277 = class123.method929(22497, var274);
                    class105.method799(var277.field2787, var277.field2752, var277.field2750, (byte) -79, var271);
                    class183.method1314(var277.field2809, var271, var277.field2794, var277.field2803, -29103);
                } else if (var274 == -1) {
                    class215.field3302 = -1;
                    var275.field3432 = 0;
                    return true;
                } else {
                    class179 var276 = class123.method929(22497, var274);
                    var275.field3406 = var276.field2787;
                    var275.field3432 = 4;
                    var275.field3524 = var274;
                    var275.field3448 = var276.field2750;
                    var275.field3450 = var276.field2752 * 100 / var273;
                    class80.method628((byte) -71, var275);
                }
            }
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 176) {
            long var278 = class183.field2900.method306(false);
            long var280 = (long) class183.field2900.method260((byte) -67);
            long var282 = (long) class183.field2900.method304((byte) 84);
            int var284 = class183.field2900.method265(-119);
            long var285 = (var280 << 32) + var282;
            boolean var287 = false;
            int var288 = 0;
            label1470: while (true) {
                if (var288 >= 100) {
                    if (var284 <= 1) {
                        if ((!class112.field1733 || class166.field2508) && !class54.field854) {
                            for (int var289 = 0; var289 < class40.field677; var289++) {
                                if (class78.field1189[var289] == var278) {
                                    var287 = true;
                                    break label1470;
                                }
                            }
                        } else {
                            var287 = true;
                        }
                    }
                    break;
                }
                if (class283.field4464[var288] == var285) {
                    var287 = true;
                    break;
                }
                var288++;
            }
            if (!var287 && class236.field3724 == 0) {
                class283.field4464[class253.field4045] = var285;
                class253.field4045 = (class253.field4045 + 1) % 100;
                String var290 = class267.method1791(class67.method547(class297.method1992(class183.field2900, 125), (byte) 20));
                if (var284 == 2 || var284 == 3) {
                    class247.method1671(7, var290, -1, "<img=1>" + class292.method1939(var278, -16));
                } else if (var284 == 1) {
                    class247.method1671(7, var290, -1, "<img=0>" + class292.method1939(var278, -98));
                } else {
                    class247.method1671(3, var290, -1, class292.method1939(var278, -60));
                }
            }
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 15) {
            int var291 = class183.field2900.method282((byte) 105);
            int var292 = class183.field2900.method256(-1);
            String var293 = class183.field2900.method262(11386);
            if (class169.method1219((byte) 12, var292)) {
                class53.method453(var291, 0, var293);
            }
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 196) {
            class300.method2011(class183.field2900.method262(11386), false);
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 108) {
            int var294 = class183.field2900.method300((byte) -30);
            int var295 = class183.field2900.method260((byte) -67);
            class222 var296;
            if (var294 >= 0) {
                var296 = class169.method1217(var294, 12180);
            } else {
                var296 = null;
            }
            if (var294 < -70000) {
                var295 += 32768;
            }
            while (class95.field1528 > class183.field2900.field541) {
                int var297 = class183.field2900.method276((byte) 115);
                int var298 = class183.field2900.method260((byte) -67);
                int var299 = 0;
                if (var298 != 0) {
                    var299 = class183.field2900.method265(-103);
                    if (var299 == 255) {
                        var299 = class183.field2900.method300((byte) -30);
                    }
                }
                if (var296 != null && var297 >= 0 && var296.field3407.length > var297) {
                    var296.field3407[var297] = var298;
                    var296.field3567[var297] = var299;
                }
                class206.method1442(10427, var295, var298 - 1, var297, var299);
            }
            if (var296 != null) {
                class80.method628((byte) -95, var296);
            }
            class303.method2026(false);
            class223.field3574[class118.method863(31, class73.field1120++)] = class118.method863(var295, 32767);
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 90) {
            int var300 = class183.field2900.method260((byte) -67);
            int var301 = class183.field2900.method265(-107);
            int var302 = class183.field2900.method265(-89);
            int var303 = class183.field2900.method260((byte) -67);
            int var304 = class183.field2900.method265(-90);
            int var305 = class183.field2900.method265(-83);
            if (class169.method1219((byte) 12, var300)) {
                class7.method48(var303, var304, true, -126, var302, var305, var301);
            }
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 197) {
            int var306 = class183.field2900.method295((byte) -87);
            int var307 = class183.field2900.method267(-7803);
            int var308 = class183.field2900.method279(true);
            if (class169.method1219((byte) 12, var307)) {
                class232.method1596(var306, false, var308);
            }
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 212) {
            int var309 = class183.field2900.method294((byte) 80);
            int var310 = class183.field2900.method260((byte) -67);
            class42.method372(var309, 1, var310);
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 120) {
            int var311 = class183.field2900.method260((byte) -67);
            String var312 = class183.field2900.method262(11386);
            Object[] var313 = new Object[var312.length() + 1];
            for (int var314 = var312.length() - 1; var314 >= 0; var314--) {
                if (var312.charAt(var314) == 's') {
                    var313[var314 + 1] = class183.field2900.method262(11386);
                } else {
                    var313[var314 + 1] = Integer.valueOf(class183.field2900.method300((byte) -30));
                }
            }
            var313[0] = Integer.valueOf(class183.field2900.method300((byte) -30));
            if (class169.method1219((byte) 12, var311)) {
                class26 var315 = new class26();
                var315.field450 = var313;
                class15.method116(8, var315);
            }
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 110) {
            long var316 = class183.field2900.method306(false);
            class183.field2900.method266(-129);
            long var318 = class183.field2900.method306(false);
            long var320 = (long) class183.field2900.method260((byte) -67);
            long var322 = (long) class183.field2900.method304((byte) 84);
            int var324 = class183.field2900.method265(-99);
            int var325 = class183.field2900.method260((byte) -67);
            boolean var326 = false;
            long var327 = (var320 << 32) + var322;
            int var329 = 0;
            label1493: while (true) {
                if (var329 >= 100) {
                    if (var324 <= 1) {
                        for (int var330 = 0; var330 < class40.field677; var330++) {
                            if (class78.field1189[var330] == var316) {
                                var326 = true;
                                break label1493;
                            }
                        }
                    }
                    break;
                }
                if (class283.field4464[var329] == var327) {
                    var326 = true;
                    break;
                }
                var329++;
            }
            if (!var326 && class236.field3724 == 0) {
                class283.field4464[class253.field4045] = var327;
                class253.field4045 = (class253.field4045 + 1) % 100;
                String var331 = class261.method1749(-111, var325).method1068(class183.field2900, (byte) 107);
                if (var324 == 2 || var324 == 3) {
                    class296.method1972(var331, var325, class292.method1939(var318, -14), -128, 20, "<img=1>" + class292.method1939(var316, -19));
                } else if (var324 == 1) {
                    class296.method1972(var331, var325, class292.method1939(var318, -59), -128, 20, "<img=0>" + class292.method1939(var316, -27));
                } else {
                    class296.method1972(var331, var325, class292.method1939(var318, -31), -128, 20, class292.method1939(var316, -9));
                }
            }
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 123) {
            int var332 = class183.field2900.method260((byte) -67);
            int var333 = class183.field2900.method295((byte) -87);
            int var334 = class183.field2900.method267(-7803);
            if (class169.method1219((byte) 12, var334)) {
                if (var333 == 2) {
                    class295.method1960(-108);
                }
                class298.field4803 = var332;
                class142.method1034(104, var332);
                class26.method218(false, (byte) -88);
                class35.method330(-124, class298.field4803);
                for (int var335 = 0; var335 < 100; var335++) {
                    class247.field3933[var335] = true;
                }
            }
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 61) {
            int var336 = class183.field2900.method294((byte) 112);
            String var337 = class183.field2900.method262(11386);
            int var338 = class183.field2900.method282((byte) 108);
            if (class169.method1219((byte) 12, var338)) {
                class304.method2038(1, var336, var337);
            }
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 28) {
            int var339 = class183.field2900.method256(-1);
            int var340 = class183.field2900.method256(-1);
            int var341 = class183.field2900.method277((byte) -103);
            class161 var342 = class116.field1781[var339];
            if (var342 != null) {
                class45.method383(1, var341, var340, var342);
            }
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 132) {
            for (int var343 = 0; var343 < class233.field3682.length; var343++) {
                if (class233.field3682[var343] != null) {
                    class233.field3682[var343].field4727 = -1;
                }
            }
            for (int var344 = 0; var344 < class116.field1781.length; var344++) {
                if (class116.field1781[var344] != null) {
                    class116.field1781[var344].field4727 = -1;
                }
            }
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 88) {
            int var345 = class183.field2900.method300((byte) -30);
            int var346 = class183.field2900.method260((byte) -67);
            int var347 = class183.field2900.method260((byte) -67);
            if (class169.method1219((byte) 12, var347)) {
                class306.method2051(var346, var345, (byte) -63);
            }
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 62) {
            int var348 = class183.field2900.method260((byte) -67);
            int var349 = class183.field2900.method294((byte) 112);
            int var350 = class183.field2900.method261(false);
            if (class169.method1219((byte) 12, var348)) {
                class142.method1033(var350, var349, -306674912);
            }
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 49) {
            class303.method2026(false);
            int var351 = class183.field2900.method315((byte) 123);
            int var352 = class183.field2900.method265(-121);
            int var353 = class183.field2900.method312((byte) -41);
            class207.field3187[var351] = var353;
            class9.field160[var351] = var352;
            class56.field885[var351] = 1;
            for (int var354 = 0; var354 < 98; var354++) {
                if (var353 >= class7.field120[var354]) {
                    class56.field885[var351] = var354 + 2;
                }
            }
            class198.field3085[class118.method863(class106.field1654++, 31)] = var351;
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 246) {
            int var355 = class183.field2900.method312((byte) 112);
            int var356 = class183.field2900.method260((byte) -67);
            int var357 = class183.field2900.method267(-7803);
            if (class169.method1219((byte) 12, var357)) {
                class41.method360(var355, 12, var356);
            }
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 96) {
            int var358 = class183.field2900.method312((byte) -35);
            int var359 = class183.field2900.method312((byte) -57);
            int var360 = class183.field2900.method256(-1);
            if (class169.method1219((byte) 12, var360)) {
                class288 var361 = (class288) class48.field787.method2043((long) var359, -1);
                class288 var362 = (class288) class48.field787.method2043((long) var358, -1);
                if (var362 != null) {
                    class22.method192(var361 == null || var361.field4505 != var362.field4505, var362, (byte) 114);
                }
                if (var361 != null) {
                    var361.method995((byte) 53);
                    class48.field787.method2046(var361, -31, (long) var358);
                }
                class222 var363 = class169.method1217(var359, 12180);
                if (var363 != null) {
                    class80.method628((byte) -70, var363);
                }
                class222 var364 = class169.method1217(var358, 12180);
                if (var364 != null) {
                    class80.method628((byte) -84, var364);
                    class305.method2041(var364, -127, true);
                }
                if (class298.field4803 != -1) {
                    class112.method829(-125, 1, class298.field4803);
                }
            }
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 186) {
            class303.method2026(false);
            class20.field278 = class183.field2900.method308((byte) 100);
            class255.field4082 = class216.field3305;
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 21) {
            class229.field3643 = class183.field2900.method295((byte) -87);
            class222.field3483 = class183.field2900.method315((byte) 52);
            for (int var365 = class229.field3643; var365 < class229.field3643 + 8; var365++) {
                for (int var367 = class222.field3483; var367 < (class222.field3483 + 8); var367++) {
                    if (class110.field1695[class130.field1941][var365][var367] != null) {
                        class110.field1695[class130.field1941][var365][var367] = null;
                        class220.method1507(var365, var367, (byte) 28);
                    }
                }
            }
            for (class221 var366 = (class221) class262.field4152.method6(-112); var366 != null; var366 = (class221) class262.field4152.method11((byte) 94)) {
                if (var366.field3376 >= class229.field3643 && var366.field3376 < class229.field3643 + 8 && class222.field3483 <= var366.field3372 && (class222.field3483 + 8) > var366.field3372 && class130.field1941 == var366.field3374) {
                    var366.field3378 = 0;
                }
            }
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 247) {
            int var368 = class183.field2900.method312((byte) 74);
            class222 var369 = class169.method1217(var368, 12180);
            for (int var370 = 0; var370 < var369.field3407.length; var370++) {
                var369.field3407[var370] = -1;
                var369.field3407[var370] = 0;
            }
            class80.method628((byte) -105, var369);
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 20) {
            int var371 = class183.field2900.method315((byte) 17);
            int var372 = class183.field2900.method277((byte) -103);
            int var373 = class183.field2900.method315((byte) 64);
            class130.field1941 = var372 >> 1;
            class263.field4168.method1014(var371, (byte) 88, (var372 & 0x1) == 1, var373);
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 45) {
            int var374 = class183.field2900.method315((byte) 81);
            int var375 = var374 >> 2;
            int var376 = var374 & 0x3;
            int var377 = field4431[var375];
            int var378 = class183.field2900.method267(-7803);
            if (var378 == 65535) {
                var378 = -1;
            }
            int var379 = class183.field2900.method294((byte) 76);
            int var380 = var379 >> 28 & 0x3;
            int var381 = (var379 & 0xFFFC9EB) >> 14;
            int var382 = var381 - class138.field2072;
            int var383 = var379 & 0x3FFF;
            int var384 = var383 - class159.field2379;
            class24.method211(var377, var376, var382, var384, var378, (byte) 121, var375, var380);
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 235) {
            int var385 = class183.field2900.method279(true);
            int var386 = class183.field2900.method256(-1);
            class179.method1270(-129, var385, var386);
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 157) {
            int var387 = class183.field2900.method282((byte) 117);
            int var388 = class183.field2900.method312((byte) 80);
            int var389 = class183.field2900.method267(-7803);
            if (class169.method1219((byte) 12, var387)) {
                class162.method1176(var388, var389, -95);
            }
            class215.field3302 = -1;
            return true;
        } else if (class215.field3302 == 93) {
            int var390 = class183.field2900.method260((byte) -67);
            int var391 = class183.field2900.method300((byte) -30);
            if (class169.method1219((byte) 12, var390)) {
                class288 var392 = (class288) class48.field787.method2043((long) var391, -1);
                if (var392 != null) {
                    class22.method192(true, var392, (byte) 114);
                }
                if (class260.field4115 != null) {
                    class80.method628((byte) -100, class260.field4115);
                    class260.field4115 = null;
                }
            }
            class215.field3302 = -1;
            return true;
        } else {
            class79.method624("T1 - " + class215.field3302 + "," + class135.field2019 + "," + class9.field147 + " - " + class95.field1528, (Throwable) null, 0);
            class252.method1710(0);
            return true;
        }
    }
}
