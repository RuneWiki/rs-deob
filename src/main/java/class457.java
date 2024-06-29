import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public abstract class class457 {

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "Lbg;")
    public static class310 field7003 = new class310(1, 8);

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    public static int field7006 = 0;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "[I")
    public static int[] field7007 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "Loe;")
    public static class127 field7008 = new class127(105, 3);

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
    public static int field7002;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public static int field7004;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
    public static int field7005;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "[[S")
    public static short[][] field7009;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V", line = 3)
    public static final void method2705(byte arg0) {
        if (class65.field1067 > 1) {
            class27.field352 = class298.field4515;
            class65.field1067--;
        }
        if (class39.field524 > 0) {
            class39.field524--;
        }
        field7004++;
        if (class458.field7053) {
            class458.field7053 = false;
            class499.method3001(arg0 ^ 0xFFFFFFD0);
            return;
        }
        if (!class381.field5555) {
            class134.method886(-1);
        }
        for (int var1 = 0; var1 < 100 && class392.method2336(-51); var1++) {
        }
        if (client.field2992 != 30) {
            return;
        }
        class159.method1015(class42.field623.method1856(arg0 ^ 0x7D), (byte) -117, class230.field3508);
        if (class221.field3420 == null) {
            if (class306.field4644 <= class344.method2111((byte) -110)) {
                class221.field3420 = class306.field4638.method1166((byte) -63, class376.field5480);
            }
        } else if (class221.field3420.field6294 != -1) {
            class400.method2379((byte) -75, class4.field46);
            class230.field3508.method246((byte) -30, class221.field3420.field6294);
            class221.field3420 = null;
            class306.field4644 = class344.method2111((byte) -125) + 30000L;
        }
        class112 var2 = (class112) class91.field1638.method8((byte) -98);
        if (var2 != null || (class344.method2111((byte) -39) - 2000L) > class429.field6299) {
            boolean var3 = false;
            int var4 = class230.field3508.field585;
            for (class112 var5 = (class112) class137.field2269.method8((byte) -98); var5 != null && class230.field3508.field585 - var4 < 240; var5 = (class112) class137.field2269.method17((byte) 98)) {
                var5.method1121(false);
                int var6 = var5.method802(arg0 - 116);
                if (var6 < 0) {
                    var6 = 0;
                } else if (var6 > 65534) {
                    var6 = 65534;
                }
                int var7 = var5.method801(arg0 ^ 0x29);
                if (var7 < 0) {
                    var7 = 0;
                } else if (var7 > 65534) {
                    var7 = 65534;
                }
                boolean var8 = false;
                if (var5.method802(6) == -1 && var5.method801(124) == -1) {
                    var7 = -1;
                    var6 = -1;
                    var8 = true;
                }
                if (class358.field5312 != var7 || class314.field4745 != var6) {
                    if (!var3) {
                        class233.field3549++;
                        class400.method2379((byte) -75, class488.field7439);
                        class230.field3508.method221(-1, 0);
                        var3 = true;
                        var4 = class230.field3508.field585;
                    }
                    int var9 = var7 - class358.field5312;
                    class358.field5312 = var7;
                    int var10 = var6 - class314.field4745;
                    class314.field4745 = var6;
                    int var11 = (int) ((var5.method803((byte) 22) - class429.field6299) / 20L);
                    if (var11 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                        var10 += 32;
                        var9 += 32;
                        class230.field3508.method246((byte) -114, (var11 << 12) - (-(var9 << 6) - var10));
                    } else if (var11 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                        var10 += 128;
                        var9 += 128;
                        class230.field3508.method221(-1, var11 + 128);
                        class230.field3508.method246((byte) -48, (var9 << 8) + var10);
                    } else if (var11 >= 32) {
                        class230.field3508.method246((byte) -62, var11 + 57344);
                        if (var8) {
                            class230.field3508.method253(-78, Integer.MIN_VALUE);
                        } else {
                            class230.field3508.method253(-88, var7 | var6 << 16);
                        }
                    } else {
                        class230.field3508.method221(-1, var11 + 192);
                        if (var8) {
                            class230.field3508.method253(-93, Integer.MIN_VALUE);
                        } else {
                            class230.field3508.method253(arg0 - 246, var7 | var6 << 16);
                        }
                    }
                    class429.field6299 = var5.method803((byte) 22);
                }
            }
            if (var3) {
                class230.field3508.method264(10807, class230.field3508.field585 - var4);
            }
        }
        if (var2 != null) {
            long var12 = (var2.method803((byte) 22) - class370.field5433) / 50L;
            class370.field5433 = var2.method803((byte) 22);
            if (var12 > 32767L) {
                var12 = 32767L;
            }
            int var14 = var2.method802(6);
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            int var15 = var2.method801(105);
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            byte var16 = 0;
            if (var2.method805(-4) == 2) {
                var16 = 1;
            }
            class400.method2379((byte) -75, class325.field4870);
            class401.field5841++;
            int var17 = (int) var12;
            class230.field3508.method259((byte) -86, var14 << 16 | var15);
            class230.field3508.method263(var17 | var16 << 15, (byte) -84);
        }
        if (class170.field2650 > 0) {
            int var18 = 0;
            for (int var19 = 0; var19 < class170.field2650; var19++) {
                if (class304.field4624[var19].method1068(false)) {
                    var18++;
                }
            }
            if (var18 > 0) {
                class54.field813++;
                if (var18 > 75) {
                    var18 = 75;
                }
                class400.method2379((byte) -75, class305.field4631);
                class230.field3508.method221(-1, var18 * 3);
                for (int var20 = 0; var20 < class170.field2650; var20++) {
                    class494 var21 = class304.field4624[var20];
                    if (var21.method1068(false)) {
                        long var22 = (var21.method1066(-8934) - class86.field1497) / 50L;
                        class86.field1497 = var21.method1066(-8934);
                        if (var22 > 65535L) {
                            var22 = 65535L;
                        }
                        class230.field3508.method221(-1, var21.method1071(115));
                        class230.field3508.method246((byte) -44, (int) var22);
                    }
                }
            }
        }
        if (class370.field5438 > 0) {
            class370.field5438--;
        }
        if (class7.field81 && class370.field5438 <= 0) {
            class300.field4539++;
            class7.field81 = false;
            class370.field5438 = 20;
            class400.method2379((byte) -75, class282.field4275);
            class230.field3508.method282((int) class23.field289 >> 3, 104);
            class230.field3508.method263((int) class376.field5483 >> 3, (byte) -111);
        }
        if (class410.field5946 && !class184.field2935) {
            class460.field7082++;
            class184.field2935 = true;
            class400.method2379((byte) -75, class114.field1941);
            class230.field3508.method221(-1, 1);
        }
        if (!class410.field5946 && class184.field2935) {
            class460.field7082++;
            class184.field2935 = false;
            class400.method2379((byte) -75, class114.field1941);
            class230.field3508.method221(-1, 0);
        }
        if (!class388.field5623) {
            class280.field4250++;
            class400.method2379((byte) -75, class77.field1377);
            class230.field3508.method221(-1, 0);
            int var24 = class230.field3508.field585;
            class40 var25 = class463.field7116.method83(0);
            class230.field3508.method281(var25.field585, var25.field536, 0, arg0 - 4);
            class230.field3508.method264(arg0 ^ 0x2A4D, class230.field3508.field585 - var24);
            class388.field5623 = true;
        }
        if (class321.field4830 != null) {
            if (class408.field5928 == 2) {
                class410.method2422(-1);
            } else if (class408.field5928 == 3) {
                class85.method600(37);
            }
        }
        if (class123.field2028) {
            class123.field2028 = false;
        } else {
            class219.field3373 /= 2.0F;
        }
        if (class316.field4761) {
            class316.field4761 = false;
        } else {
            class407.field5917 /= 2.0F;
        }
        class245.method1472((byte) 66);
        if (client.field2992 != 30) {
            return;
        }
        class504.method3017(0);
        class507.method3035((byte) -103);
        class376.method2263(arg0 ^ 0x66);
        class418.method2450((byte) -69);
        class54.field827++;
        if (class54.field827 > 750) {
            class499.method3001(-69);
            return;
        }
        class447.method2671(106);
        class30.method160(0);
        class379.method2280(113);
        for (int var26 = class273.field4144.method1621(true, (byte) 107); var26 != -1; var26 = class273.field4144.method1621(false, (byte) 107)) {
            class268.method1631(0, var26);
            class91.field1640[class330.method2050(31, class292.field4455++)] = var26;
        }
        for (class64 var27 = class52.method365(114); var27 != null; var27 = class52.method365(127)) {
            int var28 = var27.method443(255);
            int var29 = var27.method442((byte) 56);
            if (var28 == 1) {
                class482.field7367[var29] = var27.field1051;
                class96.field1742 |= class418.field6024[var29];
                class9.field122[class330.method2050(31, class273.field4148++)] = var29;
            } else if (var28 == 2) {
                class329.field4938[var29] = var27.field1057;
                class411.field5965[class330.method2050(class450.field6926++, 31)] = var29;
            } else if (var28 == 3) {
                class427 var51 = class413.method2435(160291920, var29);
                if (!var27.field1057.equals(var51.field6230)) {
                    var51.field6230 = var27.field1057;
                    class288.method1754(var51, 0);
                }
            } else if (var28 == 4) {
                class427 var47 = class413.method2435(160291920, var29);
                int var48 = var27.field1051;
                int var49 = var27.field1059;
                int var50 = var27.field1054;
                if (var47.field6195 != var48 || var47.field6161 != var49 || var47.field6134 != var50) {
                    var47.field6161 = var49;
                    var47.field6195 = var48;
                    var47.field6134 = var50;
                    class288.method1754(var47, 0);
                }
            } else if (var28 == 5) {
                class427 var46 = class413.method2435(arg0 ^ 0x98DDC2A, var29);
                if (var27.field1051 != var46.field6275 || var27.field1051 == -1) {
                    var46.field6235 = 1;
                    var46.field6290 = 0;
                    var46.field6217 = 0;
                    var46.field6275 = var27.field1051;
                    class288.method1754(var46, arg0 - 122);
                }
            } else if (var28 == 6) {
                int var30 = var27.field1051;
                int var31 = var30 >> 10 & 0x1F;
                int var32 = var30 >> 5 & 0x1F;
                int var33 = var30 & 0x1F;
                int var34 = (var33 << 3) + (var31 << 19) + (var32 << 11);
                class427 var35 = class413.method2435(160291920, var29);
                if (var35.field6166 != var34) {
                    var35.field6166 = var34;
                    class288.method1754(var35, 0);
                }
            } else if (var28 == 7) {
                class427 var36 = class413.method2435(160291920, var29);
                boolean var37 = var27.field1051 == 1;
                if (var36.field6141 != var37) {
                    var36.field6141 = var37;
                    class288.method1754(var36, 0);
                }
            } else if (var28 == 8) {
                class427 var38 = class413.method2435(160291920, var29);
                if (var27.field1051 != var38.field6214 || var27.field1059 != var38.field6201 || var27.field1054 != var38.field6221) {
                    var38.field6201 = var27.field1059;
                    var38.field6214 = var27.field1051;
                    var38.field6221 = var27.field1054;
                    if (var38.field6274 != -1) {
                        if (var38.field6125 > 0) {
                            var38.field6221 = var38.field6221 * 32 / var38.field6125;
                        } else if (var38.field6216 > 0) {
                            var38.field6221 = var38.field6221 * 32 / var38.field6216;
                        }
                    }
                    class288.method1754(var38, 0);
                }
            } else if (var28 == 9) {
                class427 var39 = class413.method2435(160291920, var29);
                if (var27.field1051 != var39.field6274 || var27.field1059 != var39.field6228) {
                    var39.field6274 = var27.field1051;
                    var39.field6228 = var27.field1059;
                    class288.method1754(var39, 0);
                }
            } else if (var28 == 10) {
                class427 var40 = class413.method2435(160291920, var29);
                if (var27.field1051 != var40.field6278 || var27.field1059 != var40.field6223 || var27.field1054 != var40.field6264) {
                    var40.field6223 = var27.field1059;
                    var40.field6278 = var27.field1051;
                    var40.field6264 = var27.field1054;
                    class288.method1754(var40, 0);
                }
            } else if (var28 == 11) {
                class427 var41 = class413.method2435(160291920, var29);
                var41.field6262 = var41.field6207 = var27.field1051;
                var41.field6205 = 0;
                var41.field6215 = 0;
                var41.field6259 = var41.field6263 = var27.field1059;
                class288.method1754(var41, 0);
            } else if (var28 == 12) {
                class427 var42 = class413.method2435(160291920, var29);
                int var43 = var27.field1051;
                if (var42 != null && var42.field6197 == 0) {
                    if (var42.field6184 - var42.field6126 < var43) {
                        var43 = var42.field6184 - var42.field6126;
                    }
                    if (var43 < 0) {
                        var43 = 0;
                    }
                    if (var42.field6179 != var43) {
                        var42.field6179 = var43;
                        class288.method1754(var42, 0);
                    }
                }
            } else if (var28 == 14) {
                class427 var44 = class413.method2435(160291920, var29);
                var44.field6211 = var27.field1051;
            } else if (var28 == 15) {
                class312.field4695 = var27.field1059;
                class395.field5764 = true;
                class402.field5846 = var27.field1051;
            } else if (var28 == 16) {
                class427 var45 = class413.method2435(160291920, var29);
                var45.field6247 = var27.field1051;
            }
        }
        class115.field1951++;
        if (class451.field6946 != 0) {
            class35.field492 += 20;
            if (class35.field492 >= 400) {
                class451.field6946 = 0;
            }
        }
        if (class65.field1068 != null) {
            class182.field2890++;
            if (class182.field2890 >= 15) {
                class288.method1754(class65.field1068, arg0 ^ 0x7A);
                class65.field1068 = null;
            }
        }
        class291.field4410 = false;
        class450.field6928 = null;
        class294.field4458 = null;
        class157.field2470 = false;
        class396.method2356(-1, -1, true, null);
        class294.method1786(-1, -1, arg0 - 14, null);
        if (!class306.field4636) {
            client.field3001 = -1;
        }
        class166.method1047(arg0 ^ 0xFFFFBC17);
        class298.field4515++;
        if (class100.field1812) {
            class400.method2379((byte) -75, class21.field263);
            class15.field217++;
            class230.field3508.method267(2926, class246.field3758 | class506.field7636 << 28 | class59.field1008 << 14);
            class100.field1812 = false;
        }
        while (true) {
            class298 var52;
            class427 var53;
            class427 var54;
            do {
                var52 = (class298) class220.field3397.method7(false);
                if (var52 == null) {
                    while (true) {
                        class298 var55;
                        class427 var56;
                        class427 var57;
                        do {
                            var55 = (class298) class114.field1927.method7(false);
                            if (var55 == null) {
                                while (true) {
                                    class298 var58;
                                    class427 var59;
                                    class427 var60;
                                    do {
                                        var58 = (class298) class144.field2339.method7(false);
                                        if (var58 == null) {
                                            if (class450.field6928 == null) {
                                                class170.field2653 = 0;
                                            }
                                            if (class450.field6931 != null) {
                                                class323.method2014(-2);
                                            }
                                            if (class193.field3052 > 0 && class308.field4662.method1650(82, 27365) && class308.field4662.method1650(81, 27365) && class165.field2571 != 0) {
                                                int var61 = class286.field4329.field3217 - class165.field2571;
                                                if (var61 < 0) {
                                                    var61 = 0;
                                                } else if (var61 > 3) {
                                                    var61 = 3;
                                                }
                                                client.method1170(class381.field5550 + class286.field4329.field2232[0], arg0 ^ 0xFFFFFFA9, class320.field4827 + class286.field4329.field2239[0], var61);
                                            }
                                            class85.method605((byte) -69);
                                            for (int var62 = 0; var62 < 5; var62++) {
                                                int var10002 = class189.field3020[var62]++;
                                            }
                                            if (class96.field1742 && class238.field3592 < class344.method2111((byte) -34) - 60000L) {
                                                class350.method2131((byte) -128);
                                            }
                                            class42.field622++;
                                            if (class42.field622 > 500) {
                                                class42.field622 = 0;
                                                int var63 = (int) (Math.random() * 8.0D);
                                                if ((var63 & 0x2) == 2) {
                                                    class26.field342 += class401.field5838;
                                                }
                                                if ((var63 & 0x1) == 1) {
                                                    class93.field1664 += class245.field3748;
                                                }
                                                if ((var63 & 0x4) == 4) {
                                                    class388.field5620 += class407.field5906;
                                                }
                                            }
                                            if (class93.field1664 < -50) {
                                                class245.field3748 = 2;
                                            }
                                            if (class26.field342 < -55) {
                                                class401.field5838 = 2;
                                            }
                                            if (class93.field1664 > 50) {
                                                class245.field3748 = -2;
                                            }
                                            if (class26.field342 > 55) {
                                                class401.field5838 = -2;
                                            }
                                            if (class388.field5620 < -40) {
                                                class407.field5906 = 1;
                                            }
                                            if (class388.field5620 > 40) {
                                                class407.field5906 = -1;
                                            }
                                            class261.field3960++;
                                            if (arg0 != 122) {
                                                method2708((byte) 90);
                                            }
                                            if (class261.field3960 > 500) {
                                                class261.field3960 = 0;
                                                int var64 = (int) (Math.random() * 8.0D);
                                                if ((var64 & 0x1) == 1) {
                                                    class273.field4145 += class74.field1318;
                                                }
                                                if ((var64 & 0x2) == 2) {
                                                    class222.field3427 += class471.field7205;
                                                }
                                            }
                                            if (class273.field4145 < -60) {
                                                class74.field1318 = 2;
                                            }
                                            if (class273.field4145 > 60) {
                                                class74.field1318 = -2;
                                            }
                                            if (class222.field3427 < -20) {
                                                class471.field7205 = 1;
                                            }
                                            class376.field5488++;
                                            if (class222.field3427 > 10) {
                                                class471.field7205 = -1;
                                            }
                                            if (class376.field5488 > 50) {
                                                class400.method2379((byte) -75, class164.field2541);
                                                class369.field5423++;
                                            }
                                            if (class146.field2363) {
                                                class286.method1741(-1);
                                                class146.field2363 = false;
                                            }
                                            try {
                                                if (class163.field2534 != null && class230.field3508.field585 > 0) {
                                                    class502.field7602 += class230.field3508.field585;
                                                    class163.field2534.method1787(class230.field3508.field536, 0, arg0 + 4778, class230.field3508.field585);
                                                    class376.field5488 = 0;
                                                    class230.field3508.field585 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var65) {
                                                class499.method3001(-69);
                                                return;
                                            }
                                        }
                                        var59 = var58.field4517;
                                        if (var59.field6265 < 0) {
                                            break;
                                        }
                                        var60 = class413.method2435(160291920, var59.field6253);
                                    } while (var60 == null || var60.field6193 == null || var59.field6265 >= var60.field6193.length || var60.field6193[var59.field6265] != var59);
                                    class94.method704(var58);
                                }
                            }
                            var56 = var55.field4517;
                            if (var56.field6265 < 0) {
                                break;
                            }
                            var57 = class413.method2435(160291920, var56.field6253);
                        } while (var57 == null || var57.field6193 == null || var56.field6265 >= var57.field6193.length || var57.field6193[var56.field6265] != var56);
                        class94.method704(var55);
                    }
                }
                var53 = var52.field4517;
                if (var53.field6265 < 0) {
                    break;
                }
                var54 = class413.method2435(arg0 ^ 0x98DDC2A, var53.field6253);
            } while (var54 == null || var54.field6193 == null || var53.field6265 >= var54.field6193.length || var54.field6193[var53.field6265] != var53);
            class94.method704(var52);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(BLhf;)[Lil;", line = 860)
    public static final class7[] method2706(byte arg0, class260 arg1) {
        field7005++;
        if (!arg1.method1561(-35)) {
            return new class7[0];
        }
        class180 var2 = arg1.method1559(113);
        while (var2.field2802 == 0) {
            class414.method2437(10L, (byte) -122);
        }
        if (var2.field2802 == 2) {
            return new class7[0];
        }
        int[] var3 = (int[]) var2.field2803;
        class7[] var4 = new class7[var3.length >> 2];
        for (int var5 = 0; var5 < var4.length; var5++) {
            class7 var7 = new class7();
            var4[var5] = var7;
            var7.field84 = var3[var5 << 2];
            var7.field78 = var3[(var5 << 2) + 1];
            var7.field90 = var3[(var5 << 2) + 2];
            var7.field85 = var3[(var5 << 2) + 3];
        }
        int var6 = -32 % ((54 - arg0) / 34);
        return var4;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIII)V", line = 902)
    public static final void method2707(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field7002++;
        int var5 = -71 / ((arg4 + 69) / 53);
        for (class286 var6 = (class286) class14.field204.method8((byte) -98); var6 != null; var6 = (class286) class14.field204.method17((byte) 63)) {
            class311.method1860(arg1, 75, var6, arg0, arg3, arg2);
        }
        for (class286 var7 = (class286) class414.field5999.method8((byte) -98); var7 != null; var7 = (class286) class414.field5999.method17((byte) 81)) {
            byte var12 = 1;
            class14 var13 = var7.field4341.method892((byte) -110);
            if (var7.field4341.field2196) {
                var12 = 0;
            } else if (var7.field4341.field2201 == var13.field173 || var7.field4341.field2201 == var13.field201 || var7.field4341.field2201 == var13.field168 || var7.field4341.field2201 == var13.field151) {
                var12 = 2;
            } else if (var7.field4341.field2201 == var13.field190 || var7.field4341.field2201 == var13.field169 || var7.field4341.field2201 == var13.field187 || var7.field4341.field2201 == var13.field172) {
                var12 = 3;
            }
            if (var7.field4321 != var12) {
                int var14 = class108.method782(-1, var7.field4341);
                if (var7.field4320 != var14) {
                    if (var7.field4325 != null) {
                        class178.field2786.method2099(var7.field4325);
                        var7.field4325 = null;
                    }
                    var7.field4320 = var14;
                }
                var7.field4321 = var12;
            }
            var7.field4333 = var7.field4341.field3218;
            var7.field4330 = var7.field4341.field3218 + (var7.field4341.method337(0) << 6);
            var7.field4332 = var7.field4341.field3222;
            var7.field4322 = var7.field4341.field3222 + (var7.field4341.method337(0) << 6);
            class311.method1860(arg1, 114, var7, arg0, arg3, arg2);
        }
        for (class286 var8 = (class286) class199.field3141.method2415((byte) 54); var8 != null; var8 = (class286) class199.field3141.method2416((byte) -127)) {
            byte var9 = 1;
            class14 var10 = var8.field4334.method892((byte) -110);
            if (var8.field4334.field2196) {
                var9 = 0;
            } else if (var8.field4334.field2201 == var10.field173 || var8.field4334.field2201 == var10.field201 || var8.field4334.field2201 == var10.field168 || var8.field4334.field2201 == var10.field151) {
                var9 = 2;
            } else if (var8.field4334.field2201 == var10.field190 || var8.field4334.field2201 == var10.field169 || var8.field4334.field2201 == var10.field187 || var8.field4334.field2201 == var10.field172) {
                var9 = 3;
            }
            if (var8.field4321 != var9) {
                int var11 = class473.method2848(var8.field4334, 0);
                if (var8.field4320 != var11) {
                    if (var8.field4325 != null) {
                        class178.field2786.method2099(var8.field4325);
                        var8.field4325 = null;
                    }
                    var8.field4320 = var11;
                }
                var8.field4321 = var9;
            }
            var8.field4333 = var8.field4334.field3218;
            var8.field4330 = var8.field4334.field3218 + (var8.field4334.method337(0) << 6);
            var8.field4332 = var8.field4334.field3222;
            var8.field4322 = var8.field4334.field3222 + (var8.field4334.method337(0) << 6);
            class311.method1860(arg1, 118, var8, arg0, arg3, arg2);
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(B)V", line = 1020)
    public static void method2708(byte arg0) {
        field7009 = null;
        field7003 = null;
        if (arg0 < -13) {
            field7007 = null;
            field7008 = null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(BLwu;)Lwu;")
    public abstract class241 method2446(byte arg0, class241 arg1);
}
