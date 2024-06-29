import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class116 {

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "Len;")
    public class193 field1644 = new class193();

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "I")
    public static int field1648 = 0;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "Lth;")
    public static class57 field1642 = new class57(64);

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "Lth;")
    public static class57 field1649 = new class57(2);

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
    public static int field1645;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!tf", name = "n", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!tf", name = "o", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "Len;")
    private class193 field1647;

    @OriginalMember(owner = "client!tf", name = "m", descriptor = "Lph;")
    public static class361 field1651;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)I", line = 4)
    public final int method865(int arg0) {
        field1641++;
        if (arg0 != 14756) {
            return 64;
        }
        int var2 = 0;
        for (class193 var3 = this.field1644.field2815; var3 != this.field1644; var3 = var3.field2815) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)V", line = 38)
    public static final void method866(byte arg0) {
        if (class361.field5721 > 0) {
            class361.field5721--;
        }
        if (class302.field4516 > 1) {
            class302.field4516--;
            class27.field369 = class68.field989;
        }
        field1646++;
        if (arg0 != 127) {
            return;
        }
        if (class313.field4658) {
            class313.field4658 = false;
            class312.method2183(40);
            return;
        }
        for (int var1 = 0; var1 < 100 && class361.method2529(-122); var1++) {
        }
        if (class194.field2819 != 30) {
            return;
        }
        class18.method111(113, -20, class107.field1533);
        Object var2 = class181.field2608.field559;
        synchronized (class181.field2608.field559) {
            if (!class291.field4415) {
                class181.field2608.field568 = 0;
            } else if (class31.field445 != 0 || class181.field2608.field568 >= 40) {
                class107.field1533.method1915(true, 209);
                class143.field2072++;
                int var3 = 0;
                class107.field1533.method1355((byte) -119, 0);
                int var4 = class107.field1533.field2776;
                for (int var5 = 0; var5 < class181.field2608.field568 && (class107.field1533.field2776 - var4) < 240; var5++) {
                    var3++;
                    int var6 = class181.field2608.field569[var5];
                    int var7 = class181.field2608.field567[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    boolean var8 = false;
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 65534) {
                        var7 = 65534;
                    }
                    if (class181.field2608.field567[var5] == -1 && class181.field2608.field569[var5] == -1) {
                        var8 = true;
                        var7 = -1;
                        var6 = -1;
                    }
                    if (class47.field714 != var6 || class298.field4453 != var7) {
                        int var9 = var7 - class298.field4453;
                        int var10 = var6 - class47.field714;
                        class298.field4453 = var7;
                        class47.field714 = var6;
                        if (class340.field5259 < 8 && var10 >= -32 && var10 <= 31 && var9 >= -32 && var9 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            class107.field1533.method1361((class340.field5259 << 12) + (var10 << 6) + var9, (byte) 125);
                            class340.field5259 = 0;
                        } else if (class340.field5259 < 32 && var10 >= -128 && var10 <= 127 && var9 >= -128 && var9 <= 127) {
                            var10 += 128;
                            var9 += 128;
                            class107.field1533.method1355((byte) -120, class340.field5259 + 128);
                            class107.field1533.method1361((var10 << 8) + var9, (byte) 126);
                            class340.field5259 = 0;
                        } else if (class340.field5259 >= 32) {
                            class107.field1533.method1361(class340.field5259 + 57344, (byte) 127);
                            if (var8) {
                                class107.field1533.method1354(Integer.MIN_VALUE, (byte) 116);
                            } else {
                                class107.field1533.method1354(var6 | var7 << 16, (byte) -36);
                            }
                            class340.field5259 = 0;
                        } else {
                            class107.field1533.method1355((byte) -126, class340.field5259 + 192);
                            if (var8) {
                                class107.field1533.method1354(Integer.MIN_VALUE, (byte) 119);
                            } else {
                                class107.field1533.method1354(var7 << 16 | var6, (byte) 126);
                            }
                            class340.field5259 = 0;
                        }
                    } else if (class340.field5259 < 2047) {
                        class340.field5259++;
                    }
                }
                class107.field1533.method1374(arg0 ^ 0x5A3C, class107.field1533.field2776 - var4);
                if (var3 < class181.field2608.field568) {
                    class181.field2608.field568 -= var3;
                    for (int var11 = 0; var11 < class181.field2608.field568; var11++) {
                        class181.field2608.field569[var11] = class181.field2608.field569[var11 + var3];
                        class181.field2608.field567[var11] = class181.field2608.field567[var3 + var11];
                    }
                } else {
                    class181.field2608.field568 = 0;
                }
            }
        }
        if (class31.field445 != 0) {
            class190.field2770++;
            long var13 = (class111.field1621 - class143.field2070) / 50L;
            int var15 = class180.field2592;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            class143.field2070 = class111.field1621;
            if (var13 > 32767L) {
                var13 = 32767L;
            }
            byte var16 = 0;
            int var17 = class227.field3425;
            int var18 = (int) var13;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 65535) {
                var17 = 65535;
            }
            if (class31.field445 == 2) {
                var16 = 1;
            }
            class107.field1533.method1915(true, 112);
            class107.field1533.method1368(6029344, var15 | var17 << 16);
            class107.field1533.method1342(var18 | var16 << 15, 128);
        }
        if (class50.field747 > 0) {
            class50.field747--;
        }
        if (class71.field1010 && class50.field747 <= 0) {
            class50.field747 = 20;
            class243.field3621++;
            class71.field1010 = false;
            class107.field1533.method1915(true, 79);
            class107.field1533.method1330((byte) -81, (int) class36.field535);
            class107.field1533.method1361((int) class103.field1476, (byte) 127);
        }
        if (class213.field3078 && !class41.field603) {
            class41.field603 = true;
            class107.field1533.method1915(true, 39);
            class17.field281++;
            class107.field1533.method1355((byte) -110, 1);
        }
        if (!class213.field3078 && class41.field603) {
            class41.field603 = false;
            class17.field281++;
            class107.field1533.method1915(true, 39);
            class107.field1533.method1355((byte) -123, 0);
        }
        if (!class56.field821) {
            class107.field1533.method1915(true, 203);
            class260.field3871++;
            class107.field1533.method1321(class62.method506(arg0 - 126), -315893864);
            class56.field821 = true;
        }
        if (class95.field1325) {
            class95.field1325 = false;
        } else {
            class354.field5443 /= 2.0F;
        }
        if (class126.field1834) {
            class126.field1834 = false;
        } else {
            class257.field3844 /= 2.0F;
        }
        class71.method572(-114);
        if (class194.field2819 != 30) {
            return;
        }
        class7.method46(56);
        class83.method678(-55);
        class135.method966(8844);
        class360.field5688++;
        if (class360.field5688 > 750) {
            class312.method2183(40);
            return;
        }
        class56.method455((byte) 76);
        class299.method2121(arg0 ^ 0x7F);
        class252.method1853(arg0 - 128);
        for (int var19 = class243.method1785(true, 122); var19 != -1; var19 = class243.method1785(false, 121)) {
            class225.method1649(var19, 100);
            class160.field2317[class287.method2076(class190.field2777++, 31)] = var19;
        }
        for (class95 var20 = class252.method1850(0); var20 != null; var20 = class252.method1850(0)) {
            int var21 = var20.method741(arg0 ^ 0x1B);
            int var22 = var20.method737((byte) 34);
            if (var21 == 1) {
                class308.field4605[var22] = var20.field1328;
                class93.field1295[class287.method2076(class273.field4147++, 31)] = var22;
            } else if (var21 == 2) {
                class21.field330[var22] = var20.field1332;
                class267.field4076[class287.method2076(class57.field844++, 31)] = var22;
            } else if (var21 == 3) {
                class359 var44 = class231.method1719(var22, 58);
                if (!var20.field1332.equals(var44.field5635)) {
                    var44.field5635 = var20.field1332;
                    class83.method676(var44, (byte) -56);
                }
            } else if (var21 == 4) {
                class359 var23 = class231.method1719(var22, 49);
                int var24 = var20.field1328;
                int var25 = var20.field1329;
                int var26 = var20.field1331;
                if (var23.field5623 != var24 || var23.field5595 != var26 || var23.field5606 != var25) {
                    var23.field5606 = var25;
                    var23.field5595 = var26;
                    var23.field5623 = var24;
                    class83.method676(var23, (byte) 92);
                }
            } else if (var21 == 5) {
                class359 var43 = class231.method1719(var22, 85);
                if (var20.field1328 != var43.field5547 || var20.field1328 == -1) {
                    var43.field5593 = 0;
                    var43.field5547 = var20.field1328;
                    var43.field5519 = 0;
                    var43.field5621 = 1;
                    class83.method676(var43, (byte) 88);
                }
            } else if (var21 == 6) {
                int var37 = var20.field1328;
                int var38 = (var37 & 0x7C60) >> 10;
                int var39 = (var37 & 0x3E9) >> 5;
                int var40 = var37 & 0x1F;
                int var41 = (var40 << 3) + (var38 << 19) + (var39 << 11);
                class359 var42 = class231.method1719(var22, 81);
                if (var42.field5646 != var41) {
                    var42.field5646 = var41;
                    class83.method676(var42, (byte) 79);
                }
            } else if (var21 == 7) {
                class359 var35 = class231.method1719(var22, 85);
                boolean var36 = var20.field1328 == 1;
                if (var35.field5658 != var36) {
                    var35.field5658 = var36;
                    class83.method676(var35, (byte) 78);
                }
            } else if (var21 == 8) {
                class359 var27 = class231.method1719(var22, 61);
                if (var20.field1328 != var27.field5517 || var20.field1331 != var27.field5609 || var20.field1329 != var27.field5544) {
                    var27.field5609 = var20.field1331;
                    var27.field5517 = var20.field1328;
                    var27.field5544 = var20.field1329;
                    if (var27.field5615 != -1) {
                        if (var27.field5611 > 0) {
                            var27.field5544 = var27.field5544 * 32 / var27.field5611;
                        } else if (var27.field5524 > 0) {
                            var27.field5544 = var27.field5544 * 32 / var27.field5524;
                        }
                    }
                    class83.method676(var27, (byte) -103);
                }
            } else if (var21 == 9) {
                class359 var28 = class231.method1719(var22, 117);
                if (var20.field1328 != var28.field5615 || var20.field1331 != var28.field5503) {
                    var28.field5615 = var20.field1328;
                    var28.field5503 = var20.field1331;
                    class83.method676(var28, (byte) -111);
                }
            } else if (var21 == 10) {
                class359 var29 = class231.method1719(var22, 117);
                if (var20.field1328 != var29.field5502 || var20.field1331 != var29.field5667 || var20.field1329 != var29.field5653) {
                    var29.field5667 = var20.field1331;
                    var29.field5653 = var20.field1329;
                    var29.field5502 = var20.field1328;
                    class83.method676(var29, (byte) -113);
                }
            } else if (var21 == 11) {
                class359 var30 = class231.method1719(var22, 59);
                var30.field5495 = var30.field5630 = var20.field1328;
                var30.field5566 = 0;
                var30.field5489 = 0;
                var30.field5585 = var30.field5577 = var20.field1331;
                class83.method676(var30, (byte) -89);
            } else if (var21 == 12) {
                class359 var31 = class231.method1719(var22, 115);
                int var32 = var20.field1328;
                if (var31 != null && var31.field5554 == 0) {
                    if (var32 > var31.field5580 - var31.field5560) {
                        var32 = var31.field5580 - var31.field5560;
                    }
                    if (var32 < 0) {
                        var32 = 0;
                    }
                    if (var31.field5641 != var32) {
                        var31.field5641 = var32;
                        class83.method676(var31, (byte) -59);
                    }
                }
            } else if (var21 == 13) {
                class359 var34 = class231.method1719(var22, 52);
                var34.field5490 = var20.field1328;
            } else if (var21 == 14) {
                class359 var33 = class231.method1719(var22, 58);
                var33.field5618 = var20.field1328;
            }
        }
        if (class343.field5315 != 0) {
            class48.field719 += 20;
            if (class48.field719 >= 400) {
                class343.field5315 = 0;
            }
        }
        class94.field1310++;
        if (class259.field3861 != null) {
            class166.field2375++;
            if (class166.field2375 >= 15) {
                class83.method676(class259.field3861, (byte) -89);
                class259.field3861 = null;
            }
        }
        if (class219.field3271 != null) {
            class83.method676(class219.field3271, (byte) -120);
            class132.field1934++;
            if (class56.field815 > class315.field4678 + 5 || class315.field4678 - 5 > class56.field815 || (class107.field1547 + 5) < class165.field2353 || class165.field2353 < (class107.field1547 - 5)) {
                class152.field2194 = true;
            }
            if (class96.field1346 == 0) {
                if (class152.field2194 && class132.field1934 >= 5) {
                    if (class219.field3271 == class17.field288 && class33.field473 != class240.field3570) {
                        class109.field1571++;
                        class359 var45 = class219.field3271;
                        byte var46 = 0;
                        if (class344.field5332 == 1 && var45.field5515 == 206) {
                            var46 = 1;
                        }
                        if (var45.field5545[class33.field473] <= 0) {
                            var46 = 0;
                        }
                        if (client.method347(var45).method1441(arg0 - 230)) {
                            int var49 = class240.field3570;
                            int var50 = class33.field473;
                            var45.field5545[var50] = var45.field5545[var49];
                            var45.field5513[var50] = var45.field5513[var49];
                            var45.field5545[var49] = -1;
                            var45.field5513[var49] = 0;
                        } else if (var46 == 1) {
                            int var47 = class240.field3570;
                            int var48 = class33.field473;
                            while (var47 != var48) {
                                if (var47 > var48) {
                                    var45.method2487(var47 - 1, var47, 42);
                                    var47--;
                                } else if (var47 < var48) {
                                    var45.method2487(var47 + 1, var47, arg0 ^ 0xFFFFFFE0);
                                    var47++;
                                }
                            }
                        } else {
                            var45.method2487(class33.field473, class240.field3570, -117);
                        }
                        class107.field1533.method1915(true, 232);
                        class107.field1533.method1361(class33.field473, (byte) 126);
                        class107.field1533.method1363((byte) 22, var46);
                        class107.field1533.method1368(arg0 ^ 0x5C005F, class219.field3271.field5521);
                        class107.field1533.method1330((byte) -81, class240.field3570);
                    }
                } else if ((class257.field3851 == 1 || class277.method2028(arg0 ^ 0xFFFFFFEC, class264.field4043 - 1)) && class264.field4043 > 2) {
                    class164.method1160(95);
                } else if (class264.field4043 > 0) {
                    class165.method1179(-1);
                }
                class31.field445 = 0;
                class219.field3271 = null;
                class166.field2375 = 10;
            }
        }
        class211.field3065 = false;
        class300.field4496 = 0;
        class359 var51 = class92.field1271;
        class359 var52 = class316.field4697;
        class316.field4697 = null;
        class142.field2064 = false;
        class17.field286 = null;
        class92.field1271 = null;
        while (class260.method1909((byte) -8) && class300.field4496 < 128) {
            class102.field1457[class300.field4496] = class107.field1548;
            class73.field1075[class300.field4496] = class137.field1993;
            class300.field4496++;
        }
        class197.field2855 = null;
        if (class257.field3850 != -1) {
            class103.method796(0, 0, class286.field4312, 0, class19.field301, class257.field3850, arg0 - 127, 0);
        }
        class68.field989++;
        if (class197.field2855 != null) {
            class121.method903(-1);
        }
        while (true) {
            class300 var53;
            class359 var54;
            class359 var55;
            do {
                var53 = (class300) class11.field167.method102((byte) -40);
                if (var53 == null) {
                    while (true) {
                        class300 var56;
                        class359 var57;
                        class359 var58;
                        do {
                            var56 = (class300) class50.field760.method102((byte) -40);
                            if (var56 == null) {
                                while (true) {
                                    class300 var59;
                                    class359 var60;
                                    class359 var61;
                                    do {
                                        var59 = (class300) class190.field2762.method102((byte) -40);
                                        if (var59 == null) {
                                            if (class197.field2855 == null) {
                                                class177.field2541 = 0;
                                            }
                                            if (class331.field5041 != null) {
                                                class290.method2092(-11498);
                                            }
                                            if (class111.field1619 > 0 && class236.field3549[82] && class236.field3549[81] && class142.field2063 != 0) {
                                                int var62 = class321.field4835 - class142.field2063;
                                                if (var62 < 0) {
                                                    var62 = 0;
                                                } else if (var62 > 3) {
                                                    var62 = 3;
                                                }
                                                class248.method1828(class1.field55.field5162[0] + class202.field2968, var62, class1.field55.field5186[0] + class272.field4123, (byte) 99);
                                            }
                                            if (class111.field1619 > 0 && class236.field3549[82] && class236.field3549[81]) {
                                                if (class336.field5235 != -1) {
                                                    class248.method1828(class358.field5486 + class202.field2968, class321.field4835, class272.field4123 + class336.field5235, (byte) 60);
                                                }
                                                class203.field2992 = 0;
                                                class256.field3831 = 0;
                                            } else if (class256.field3831 == 2) {
                                                if (class336.field5235 != -1) {
                                                    class129.field1869++;
                                                    class107.field1533.method1915(true, 149);
                                                    class107.field1533.method1361(class67.field976, (byte) 126);
                                                    class107.field1533.method1321(class88.field1234, -315893864);
                                                    class107.field1533.method1342(class358.field5486 + class202.field2968, 128);
                                                    class107.field1533.method1361(class336.field5235 + class272.field4123, (byte) 125);
                                                    class48.field719 = 0;
                                                    field1648 = class227.field3425;
                                                    class343.field5315 = 1;
                                                    class145.field2095 = class180.field2592;
                                                }
                                                class256.field3831 = 0;
                                            } else if (class203.field2992 == 2) {
                                                if (class336.field5235 != -1) {
                                                    class208.field3042++;
                                                    class107.field1533.method1915(true, 53);
                                                    class107.field1533.method1330((byte) -81, class358.field5486 + class202.field2968);
                                                    class107.field1533.method1330((byte) -81, class272.field4123 + class336.field5235);
                                                    class48.field719 = 0;
                                                    class145.field2095 = class180.field2592;
                                                    class343.field5315 = 1;
                                                    field1648 = class227.field3425;
                                                }
                                                class203.field2992 = 0;
                                            } else if (class336.field5235 != -1 && class256.field3831 == 0 && class203.field2992 == 0) {
                                                int var63 = (class336.field5235 << 1) + 1 - class1.field55.method1700(-94) >> 1;
                                                int var64 = (class358.field5486 << 1) - (class1.field55.method1700(arg0 ^ -21) - 1) >> 1;
                                                class59.method473(20527, var63, 0, var64);
                                                class48.field719 = 0;
                                                field1648 = class227.field3425;
                                                class145.field2095 = class180.field2592;
                                                class343.field5315 = 1;
                                                class49.method416(0, 0, class1.field55.field5186[0], 0, true, 0, 0, class1.field55.field5162[0], var63, var64, true);
                                            }
                                            class336.field5235 = -1;
                                            class15.method84(true);
                                            if (class92.field1271 != var51) {
                                                if (var51 != null) {
                                                    class83.method676(var51, (byte) -71);
                                                }
                                                if (class92.field1271 != null) {
                                                    class83.method676(class92.field1271, (byte) 106);
                                                }
                                            }
                                            if (class316.field4697 != var52 && class157.field2265 == class132.field1928) {
                                                if (var52 != null) {
                                                    class83.method676(var52, (byte) -47);
                                                }
                                                if (class316.field4697 != null) {
                                                    class83.method676(class316.field4697, (byte) -95);
                                                }
                                            }
                                            if (class316.field4697 == null) {
                                                if (class157.field2265 > 0) {
                                                    class157.field2265--;
                                                }
                                            } else if (class157.field2265 < class132.field1928) {
                                                class157.field2265++;
                                                if (class157.field2265 == class132.field1928) {
                                                    class83.method676(class316.field4697, (byte) 102);
                                                }
                                            }
                                            for (int var65 = 0; var65 < 5; var65++) {
                                                int var10002 = class122.field1770[var65]++;
                                            }
                                            int var66 = class67.method552(arg0 ^ 0xFFFFFF80);
                                            int var67 = class236.method1758(0);
                                            if (var66 > 15000 && var67 > 15000) {
                                                class357.field5475++;
                                                class361.field5721 = 250;
                                                class75.method615(14500, arg0 ^ 0xFFFFACD0);
                                                class107.field1533.method1915(true, 143);
                                            }
                                            if (class154.field2202 != null && class154.field2202.field3056 == 1) {
                                                if (class154.field2202.field3058 != null) {
                                                    class256.method1883(67, class252.field3765, class2.field83);
                                                }
                                                class154.field2202 = null;
                                                class252.field3765 = null;
                                                class2.field83 = false;
                                            }
                                            class253.field3768++;
                                            class169.field2426++;
                                            class37.field541++;
                                            if (class253.field3768 > 500) {
                                                int var68 = (int) (Math.random() * 8.0D);
                                                if ((var68 & 0x2) == 2) {
                                                    class108.field1561 += class211.field3067;
                                                }
                                                if ((var68 & 0x1) == 1) {
                                                    class287.field4337 += class192.field2805;
                                                }
                                                if ((var68 & 0x4) == 4) {
                                                    class321.field4832 += class279.field4236;
                                                }
                                                class253.field3768 = 0;
                                            }
                                            if (class108.field1561 < -55) {
                                                class211.field3067 = 2;
                                            }
                                            if (class287.field4337 < -50) {
                                                class192.field2805 = 2;
                                            }
                                            if (class37.field541 > 500) {
                                                class37.field541 = 0;
                                                int var69 = (int) (Math.random() * 8.0D);
                                                if ((var69 & 0x1) == 1) {
                                                    class298.field4460 += class99.field1421;
                                                }
                                                if ((var69 & 0x2) == 2) {
                                                    class281.field4271 += class64.field926;
                                                }
                                            }
                                            if (class298.field4460 < -60) {
                                                class99.field1421 = 2;
                                            }
                                            if (class287.field4337 > 50) {
                                                class192.field2805 = -2;
                                            }
                                            if (class321.field4832 < -40) {
                                                class279.field4236 = 1;
                                            }
                                            if (class108.field1561 > 55) {
                                                class211.field3067 = -2;
                                            }
                                            if (class281.field4271 < -20) {
                                                class64.field926 = 1;
                                            }
                                            if (class298.field4460 > 60) {
                                                class99.field1421 = -2;
                                            }
                                            if (class281.field4271 > 10) {
                                                class64.field926 = -1;
                                            }
                                            if (class321.field4832 > 40) {
                                                class279.field4236 = -1;
                                            }
                                            if (class169.field2426 > 50) {
                                                class263.field4002++;
                                                class107.field1533.method1915(true, 122);
                                            }
                                            if (class172.field2487) {
                                                class192.method1382(114);
                                                class172.field2487 = false;
                                            }
                                            try {
                                                if (class67.field973 != null && class107.field1533.field2776 > 0) {
                                                    class67.field973.method1558(5000, class107.field1533.field2718, 0, class107.field1533.field2776);
                                                    class107.field1533.field2776 = 0;
                                                    class169.field2426 = 0;
                                                }
                                            } catch (IOException var71) {
                                                class312.method2183(arg0 ^ 0x57);
                                            }
                                            return;
                                        }
                                        var60 = var59.field4491;
                                        if (var60.field5620 < 0) {
                                            break;
                                        }
                                        var61 = class231.method1719(var60.field5638, arg0 - 21);
                                    } while (var61 == null || var61.field5579 == null || var61.field5579.length <= var60.field5620 || var61.field5579[var60.field5620] != var60);
                                    class48.method412(var59, arg0 + 199873);
                                }
                            }
                            var57 = var56.field4491;
                            if (var57.field5620 < 0) {
                                break;
                            }
                            var58 = class231.method1719(var57.field5638, 83);
                        } while (var58 == null || var58.field5579 == null || var57.field5620 >= var58.field5579.length || var58.field5579[var57.field5620] != var57);
                        class48.method412(var56, 200000);
                    }
                }
                var54 = var53.field4491;
                if (var54.field5620 < 0) {
                    break;
                }
                var55 = class231.method1719(var54.field5638, 84);
            } while (var55 == null || var55.field5579 == null || var54.field5620 >= var55.field5579.length || var55.field5579[var54.field5620] != var54);
            class48.method412(var53, arg0 + 199873);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZI)Lvk;", line = 1053)
    public static final class209 method867(boolean arg0, int arg1) {
        field1643++;
        class209 var2 = (class209) class209.field3048.method461((byte) 120, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        class209 var3 = class128.method947(arg1, class277.field4199, -104, arg0, class98.field1392);
        if (var3 != null) {
            class209.field3048.method460(var3, -26089, (long) arg1);
        }
        return var3;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Len;B)V", line = 1073)
    public final void method868(class193 arg0, byte arg1) {
        field1640++;
        if (arg0.field2816 != null) {
            arg0.method1389(4096);
        }
        arg0.field2816 = this.field1644.field2816;
        arg0.field2815 = this.field1644;
        if (arg1 >= -121) {
            method867(true, 48);
        }
        arg0.field2816.field2815 = arg0;
        arg0.field2815.field2816 = arg0;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Z)Len;", line = 1097)
    public final class193 method869(boolean arg0) {
        field1650++;
        class193 var2 = this.field1644.field2815;
        if (arg0) {
            this.method868((class193) null, (byte) 22);
        }
        if (this.field1644 == var2) {
            this.field1647 = null;
            return null;
        } else {
            this.field1647 = var2.field2815;
            return var2;
        }
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(B)V", line = 1118)
    public static void method870(byte arg0) {
        field1642 = null;
        field1651 = null;
        field1649 = null;
        if (arg0 > -25) {
            method866((byte) -45);
        }
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V", line = 1135)
    public static final void method871(int arg0) {
        if (arg0 < 84) {
            field1653 = -6;
        }
        class217 var1 = (class217) class149.field2158.method93((byte) -59);
        field1639++;
        while (var1 != null) {
            if (var1.field3202 == -1) {
                var1.field3190 = 0;
                class215.method1559(var1, (byte) 101);
            } else {
                var1.method876(8);
            }
            var1 = (class217) class149.field2158.method97(-65);
        }
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(I)Len;", line = 1161)
    public final class193 method872(int arg0) {
        field1645++;
        class193 var2 = this.field1647;
        if (arg0 != 32767) {
            field1652 = 27;
        }
        if (this.field1644 == var2) {
            this.field1647 = null;
            return null;
        } else {
            this.field1647 = var2.field2815;
            return var2;
        }
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "()V", line = 1196)
    public class116() {
        this.field1644.field2815 = this.field1644;
        this.field1644.field2816 = this.field1644;
    }
}
