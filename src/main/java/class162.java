import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class162 {

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "Lgw;")
    private class690 field2243 = new class690(16);

    @OriginalMember(owner = "client!sn", name = "i", descriptor = "Luu;")
    private class237 field2247;

    @OriginalMember(owner = "client!sn", name = "h", descriptor = "[I")
    public static int[] field2246 = new int[32];

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "I")
    public static int field2241;

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!sn", name = "f", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!sn", name = "g", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!sn", name = "j", descriptor = "I")
    public static int field2248;

    @OriginalMember(owner = "client!sn", name = "k", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!sn", name = "l", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)V")
    public final void method1000(int arg0) {
        field2248++;
        class690 var2 = this.field2243;
        synchronized (this.field2243) {
            this.field2243.method3906(-110);
            if (arg0 != 65534) {
                this.field2243 = null;
            }
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(II)V")
    public final void method1001(int arg0, int arg1) {
        if (arg1 != -51) {
            this.method1006(-17, true);
        }
        class690 var3 = this.field2243;
        synchronized (this.field2243) {
            this.field2243.method3896(1, arg0);
        }
        field2250++;
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(I)V")
    public static void method1002(int arg0) {
        if (arg0 != 4) {
            field2246 = null;
        }
        field2246 = null;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(B)V")
    public static final void method1003(byte arg0) {
        field2242++;
        if (class84.field1188 > 1) {
            class84.field1188--;
            class526.field7303 = class320.field4449;
        }
        if (class320.field4450) {
            class320.field4450 = false;
            class481.method2934(7);
            return;
        }
        if (!class25.field320) {
            class186.method1165(1);
        }
        for (int var1 = 0; var1 < 100 && class374.method2347(-1); var1++) {
        }
        if (class102.field1401 != 10) {
            return;
        }
        while (class290.method1918((byte) 104)) {
            class583 var2 = class54.method400(class213.field2800, (byte) 121, class489.field6823);
            var2.field7963.method444(0, 128);
            int var3 = var2.field7963.field956;
            class73.method560(var2.field7963, -21);
            var2.field7963.method487(var2.field7963.field956 - var3, (byte) -110);
            class463.method2838(var2, (byte) 124);
        }
        if (class726.field10075 == null) {
            if (class60.field874 <= class97.method664((byte) -50)) {
                class726.field10075 = class67.field1040.method2533(class416.field5882.field6485, true);
            }
        } else if (class726.field10075.field3930 != -1) {
            class583 var4 = class54.method400(class213.field2800, (byte) -116, class710.field9899);
            var4.field7963.method492(-2, class726.field10075.field3930);
            class463.method2838(var4, (byte) 127);
            class726.field10075 = null;
            class60.field874 = class97.method664((byte) -50) + 30000L;
        }
        class674 var5 = (class674) class72.field1088.method3618(-67);
        if (var5 != null || class40.field495 < class97.method664((byte) -50) - 2000L) {
            class583 var6 = null;
            int var7 = 0;
            for (class674 var8 = (class674) class554.field7731.method3618(74); var8 != null && (var6 == null || var6.field7963.field956 - var7 < 240); var8 = (class674) class554.field7731.method3619(0)) {
                var8.method549(6410);
                int var9 = var8.method2571(true);
                if (var9 < -1) {
                    var9 = -1;
                } else if (var9 > 65534) {
                    var9 = 65534;
                }
                int var10 = var8.method2574((byte) 2);
                if (var10 < -1) {
                    var10 = -1;
                } else if (var10 > 65534) {
                    var10 = 65534;
                }
                if (class618.field8297 != var10 || class21.field218 != var9) {
                    if (var6 == null) {
                        var6 = class54.method400(class213.field2800, (byte) -9, class539.field7503);
                        class548.field7607++;
                        var6.field7963.method444(0, 128);
                        var7 = var6.field7963.field956;
                    }
                    int var11 = var10 - class618.field8297;
                    class618.field8297 = var10;
                    int var12 = var9 - class21.field218;
                    class21.field218 = var9;
                    int var13 = (int) ((var8.method2575((byte) -85) - class40.field495) / 20L);
                    if (var13 < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
                        var11 += 32;
                        var12 += 32;
                        var6.field7963.method492(-2, (var11 << 6) + (var13 << 12) + var12);
                    } else if (var13 < 32 && var11 >= -128 && var11 <= 127 && var12 >= -128 && var12 <= 127) {
                        var11 += 128;
                        var12 += 128;
                        var6.field7963.method444(var13 + 128, 128);
                        var6.field7963.method492(-2, (var11 << 8) + var12);
                    } else if (var13 < 32) {
                        var6.field7963.method444(var13 + 192, 128);
                        if (var10 == 1 || var9 == -1) {
                            var6.field7963.method473(-19, Integer.MIN_VALUE);
                        } else {
                            var6.field7963.method473(27, var9 << 16 | var10);
                        }
                    } else {
                        var6.field7963.method492(-2, var13 + 57344);
                        if (var10 == 1 || var9 == -1) {
                            var6.field7963.method473(79, Integer.MIN_VALUE);
                        } else {
                            var6.field7963.method473(-124, var9 << 16 | var10);
                        }
                    }
                    class40.field495 = var8.method2575((byte) -33);
                }
            }
            if (var6 != null) {
                var6.field7963.method487(var6.field7963.field956 - var7, (byte) -110);
                class463.method2838(var6, (byte) 121);
            }
        }
        if (var5 != null) {
            long var14 = (var5.method2575((byte) -65) - class762.field10625) / 50L;
            class762.field10625 = var5.method2575((byte) -21);
            if (var14 > 32767L) {
                var14 = 32767L;
            }
            int var16 = var5.method2571(true);
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 65535) {
                var16 = 65535;
            }
            int var17 = var5.method2574((byte) 2);
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 65535) {
                var17 = 65535;
            }
            byte var18 = 0;
            if (var5.method2573((byte) -111) == 2) {
                var18 = 1;
            }
            int var19 = (int) var14;
            class597.field8104++;
            class583 var20 = class54.method400(class213.field2800, (byte) 105, class733.field10170);
            var20.field7963.method462(-117, var17 | var16 << 16);
            var20.field7963.method488(-128, var18 << 15 | var19);
            class463.method2838(var20, (byte) 120);
        }
        if (class253.field3702 > 0) {
            class677.field9388++;
            class583 var21 = class54.method400(class213.field2800, (byte) -49, class610.field8212);
            var21.field7963.method444(class253.field3702 * 3, 128);
            for (int var22 = 0; var22 < class253.field3702; var22++) {
                class241 var23 = class542.field7537[var22];
                long var24 = (var23.method1624(-1575) - class664.field8984) / 50L;
                if (var24 > 65535L) {
                    var24 = 65535L;
                }
                class664.field8984 = var23.method1624(-1575);
                var21.field7963.method444(var23.method1618(true), 128);
                var21.field7963.method492(-2, (int) var24);
            }
            class463.method2838(var21, (byte) 125);
        }
        if (class84.field1190 > 0) {
            class84.field1190--;
        }
        if (class397.field5710 && class84.field1190 <= 0) {
            class185.field2531++;
            class84.field1190 = 20;
            class397.field5710 = false;
            class583 var26 = class54.method400(class213.field2800, (byte) 114, class491.field6899);
            var26.field7963.method467(2714, (int) class589.field8028 >> 3);
            var26.field7963.method492(-2, (int) class596.field8093 >> 3);
            class463.method2838(var26, (byte) 119);
        }
        if (class477.field6644 != class121.field1585) {
            class710.field9898++;
            class477.field6644 = class121.field1585;
            class583 var27 = class54.method400(class213.field2800, (byte) -88, class21.field230);
            var27.field7963.method444(class121.field1585 ? 1 : 0, 128);
            class463.method2838(var27, (byte) 120);
        }
        if (!class726.field10056) {
            class646.field8664++;
            class583 var28 = class54.method400(class213.field2800, (byte) -79, class483.field6734);
            var28.field7963.method444(0, 128);
            int var29 = var28.field7963.field956;
            class63 var30 = class332.field4707.method2155(13302);
            var28.field7963.method497(var30.field954, var30.field956, 0, -1);
            var28.field7963.method487(var28.field7963.field956 - var29, (byte) -110);
            class463.method2838(var28, (byte) 120);
            class726.field10056 = true;
        }
        if (class137.field1948 != null) {
            if (class720.field10023 == 2) {
                class336.method2138((byte) 111);
            } else if (class720.field10023 == 3) {
                class433.method2675(3);
            }
        }
        if (class449.field6212) {
            class449.field6212 = false;
        } else {
            class679.field9449 /= 2.0F;
        }
        if (class61.field875) {
            class61.field875 = false;
        } else {
            class244.field3622 /= 2.0F;
        }
        class27.method155(-28615);
        if (class102.field1401 != 10) {
            return;
        }
        class152.method964(-123);
        class170.method1087((byte) 53);
        class712.method4004((byte) 124);
        class68.field1048++;
        if (class68.field1048 > 750) {
            class481.method2934(7);
            return;
        }
        class688.method3879((byte) 44);
        class717.method4020(-114);
        class401.method2494(-1);
        for (int var31 = class124.field1712.method3607(true, (byte) -71); var31 != -1; var31 = class124.field1712.method3607(false, (byte) -71)) {
            class137.method910(-1, var31);
            class459.field6366[class665.method3759(31, class424.field5947++)] = var31;
        }
        for (class346 var32 = class326.method2083((byte) -70); var32 != null; var32 = class326.method2083((byte) -100)) {
            int var33 = var32.method2212((byte) -78);
            int var34 = var32.method2207((byte) -62);
            if (var33 == 1) {
                class621.field8315[var34] = var32.field4926;
                class696.field9689 |= class693.field9627[var34];
                class213.field2804[class665.method3759(31, class538.field7452++)] = var34;
            } else if (var33 == 2) {
                class380.field5458[var34] = var32.field4923;
                class99.field1383[class665.method3759(class259.field3752++, 31)] = var34;
            } else if (var33 == 3) {
                class755 var58 = class189.method1182(var34, (byte) -101);
                if (!var32.field4923.equals(var58.field10542)) {
                    var58.field10542 = var32.field4923;
                    class27.method159((byte) -105, var58);
                }
            } else if (var33 == 4) {
                class755 var54 = class189.method1182(var34, (byte) -101);
                int var55 = var32.field4926;
                int var56 = var32.field4916;
                int var57 = var32.field4919;
                if (var54.field10516 != var55 || var54.field10406 != var56 || var54.field10504 != var57) {
                    var54.field10516 = var55;
                    var54.field10504 = var57;
                    var54.field10406 = var56;
                    class27.method159((byte) -105, var54);
                }
            } else if (var33 == 5) {
                class755 var52 = class189.method1182(var34, (byte) -101);
                if (var32.field4926 != var52.field10498 || var32.field4926 == -1) {
                    var52.field10425 = 0;
                    var52.field10465 = 0;
                    var52.field10549 = 1;
                    var52.field10498 = var32.field4926;
                    class57 var53 = var52.field10498 == -1 ? null : class607.field8188.method3001(-12575, var52.field10498);
                    if (var53 != null) {
                        class401.method2499(var53, var52.field10465, -26802);
                    }
                    class27.method159((byte) -105, var52);
                }
            } else if (var33 == 6) {
                int var46 = var32.field4926;
                int var47 = var46 >> 10 & 0x1F;
                int var48 = var46 >> 5 & 0x1F;
                int var49 = var46 & 0x1F;
                int var50 = (var47 << 19) + (var48 << 11) + (var49 << 3);
                class755 var51 = class189.method1182(var34, (byte) -101);
                if (var51.field10388 != var50) {
                    var51.field10388 = var50;
                    class27.method159((byte) -105, var51);
                }
            } else if (var33 == 7) {
                class755 var35 = class189.method1182(var34, (byte) -101);
                boolean var36 = var32.field4926 == 1;
                if (var35.field10531 != var36) {
                    var35.field10531 = var36;
                    class27.method159((byte) -105, var35);
                }
            } else if (var33 == 8) {
                class755 var45 = class189.method1182(var34, (byte) -101);
                if (var32.field4926 != var45.field10514 || var32.field4916 != var45.field10522 || var32.field4919 != var45.field10544) {
                    var45.field10544 = var32.field4919;
                    var45.field10522 = var32.field4916;
                    var45.field10514 = var32.field4926;
                    if (var45.field10441 != -1) {
                        if (var45.field10468 > 0) {
                            var45.field10544 = var45.field10544 * 32 / var45.field10468;
                        } else if (var45.field10527 > 0) {
                            var45.field10544 = var45.field10544 * 32 / var45.field10527;
                        }
                    }
                    class27.method159((byte) -105, var45);
                }
            } else if (var33 == 9) {
                class755 var37 = class189.method1182(var34, (byte) -101);
                if (var32.field4926 != var37.field10441 || var32.field4916 != var37.field10439) {
                    var37.field10439 = var32.field4916;
                    var37.field10441 = var32.field4926;
                    class27.method159((byte) -105, var37);
                }
            } else if (var33 == 10) {
                class755 var44 = class189.method1182(var34, (byte) -101);
                if (var32.field4926 != var44.field10446 || var32.field4916 != var44.field10481 || var32.field4919 != var44.field10520) {
                    var44.field10520 = var32.field4919;
                    var44.field10446 = var32.field4926;
                    var44.field10481 = var32.field4916;
                    class27.method159((byte) -105, var44);
                }
            } else if (var33 == 11) {
                class755 var43 = class189.method1182(var34, (byte) -101);
                var43.field10420 = 0;
                var43.field10447 = var43.field10489 = var32.field4916;
                var43.field10443 = var43.field10429 = var32.field4926;
                var43.field10492 = 0;
                class27.method159((byte) -105, var43);
            } else if (var33 == 12) {
                class755 var38 = class189.method1182(var34, (byte) -101);
                int var39 = var32.field4926;
                if (var38 != null && var38.field10416 == 0) {
                    if ((var38.field10479 - var38.field10501) < var39) {
                        var39 = var38.field10479 - var38.field10501;
                    }
                    if (var39 < 0) {
                        var39 = 0;
                    }
                    if (var38.field10532 != var39) {
                        var38.field10532 = var39;
                        class27.method159((byte) -105, var38);
                    }
                }
            } else if (var33 == 14) {
                class755 var42 = class189.method1182(var34, (byte) -101);
                var42.field10490 = var32.field4926;
            } else if (var33 == 15) {
                class486.field6806 = var32.field4926;
                class171.field2378 = var32.field4916;
                class684.field9516 = true;
            } else if (var33 == 16) {
                class755 var40 = class189.method1182(var34, (byte) -101);
                var40.field10400 = var32.field4926;
            } else if (var33 == 17) {
                class755 var41 = class189.method1182(var34, (byte) -101);
                var41.field10391 = var32.field4926;
            }
        }
        class449.field6216++;
        if (class424.field5954 != 0) {
            class180.field2480 += 20;
            if (class180.field2480 >= 400) {
                class424.field5954 = 0;
            }
        }
        if (class754.field10385 != null) {
            class176.field2418++;
            if (class176.field2418 >= 15) {
                class27.method159((byte) -105, class754.field10385);
                class754.field10385 = null;
            }
        }
        class516.field7211 = null;
        class655.field8755 = null;
        class416.field5880 = false;
        class493.field6918 = false;
        class583.method3385((byte) 92, -1, null, -1);
        class480.method2924(null, -1, (byte) -84, -1);
        if (!class160.field2235) {
            class222.field3007 = -1;
        }
        class220.method1293(0);
        class320.field4449++;
        if (class1.field12) {
            class677.field9383++;
            class583 var59 = class54.method400(class213.field2800, (byte) 102, class127.field1765);
            var59.field7963.method473(-124, class651.field8724 << 28 | class275.field3985 << 14 | class622.field8322);
            class463.method2838(var59, (byte) 120);
            class1.field12 = false;
        }
        if (arg0 >= -91) {
            method1003((byte) -46);
        }
        while (true) {
            class142 var60;
            class755 var61;
            class755 var62;
            do {
                var60 = (class142) class417.field5895.method3623(0);
                if (var60 == null) {
                    while (true) {
                        class142 var63;
                        class755 var64;
                        class755 var65;
                        do {
                            var63 = (class142) class328.field4567.method3623(0);
                            if (var63 == null) {
                                while (true) {
                                    class142 var66;
                                    class755 var67;
                                    class755 var68;
                                    do {
                                        var66 = (class142) class218.field2845.method3623(0);
                                        if (var66 == null) {
                                            if (class655.field8755 == null) {
                                                class409.field5835 = 0;
                                            }
                                            if (class731.field10159 != null) {
                                                class735.method4098((byte) -99);
                                            }
                                            if (class290.field4163 > 0 && class224.field3014.method129(82, 115) && class224.field3014.method129(81, 116) && class687.field9563 != 0) {
                                                int var69 = class388.field5601.field4408 - class687.field9563;
                                                if (var69 < 0) {
                                                    var69 = 0;
                                                } else if (var69 > 3) {
                                                    var69 = 3;
                                                }
                                                class735.method4096(var69, class388.field5601.field7198[0] + class587.field7995, -2, class388.field5601.field7197[0] + class113.field1509);
                                            }
                                            class362.method2298((byte) -75);
                                            for (int var70 = 0; var70 < 5; var70++) {
                                                int var10002 = class257.field3726[var70]++;
                                            }
                                            if (class696.field9689 && (class97.method664((byte) -50) - 60000L) > class288.field4125) {
                                                class705.method3971(118);
                                            }
                                            for (class383 var71 = (class383) class652.field8733.method1638(false); var71 != null; var71 = (class383) class652.field8733.method1645(0)) {
                                                if (((long) var71.field5504) < (class97.method664((byte) -50) / 1000L - 5L)) {
                                                    if (var71.field5502 > 0) {
                                                        class476.method2904(var71.field5497 + class155.field2138.method978(class120.field1576, (byte) -117), "", "", "", 5, -1, 0);
                                                    }
                                                    if (var71.field5502 == 0) {
                                                        class476.method2904(var71.field5497 + class155.field2139.method978(class120.field1576, (byte) -119), "", "", "", 5, -1, 0);
                                                    }
                                                    var71.method3012(125);
                                                }
                                            }
                                            class71.field1081++;
                                            if (class71.field1081 > 500) {
                                                class71.field1081 = 0;
                                                int var72 = (int) (Math.random() * 8.0D);
                                                if ((var72 & 0x2) == 2) {
                                                    class605.field8177 += class61.field884;
                                                }
                                                if ((var72 & 0x1) == 1) {
                                                    class750.field10314 += class323.field4475;
                                                }
                                                if ((var72 & 0x4) == 4) {
                                                    class299.field4240 += class692.field9620;
                                                }
                                            }
                                            if (class750.field10314 < -50) {
                                                class323.field4475 = 2;
                                            }
                                            if (class605.field8177 < -55) {
                                                class61.field884 = 2;
                                            }
                                            if (class750.field10314 > 50) {
                                                class323.field4475 = -2;
                                            }
                                            if (class299.field4240 < -40) {
                                                class692.field9620 = 1;
                                            }
                                            if (class605.field8177 > 55) {
                                                class61.field884 = -2;
                                            }
                                            if (class299.field4240 > 40) {
                                                class692.field9620 = -1;
                                            }
                                            class387.field5569++;
                                            if (class387.field5569 > 500) {
                                                class387.field5569 = 0;
                                                int var73 = (int) (Math.random() * 8.0D);
                                                if ((var73 & 0x2) == 2) {
                                                    class31.field372 += class103.field1412;
                                                }
                                                if ((var73 & 0x1) == 1) {
                                                    class439.field6126 += class533.field7397;
                                                }
                                            }
                                            if (class439.field6126 < -60) {
                                                class533.field7397 = 2;
                                            }
                                            if (class439.field6126 > 60) {
                                                class533.field7397 = -2;
                                            }
                                            if (class31.field372 < -20) {
                                                class103.field1412 = 1;
                                            }
                                            if (class31.field372 > 10) {
                                                class103.field1412 = -1;
                                            }
                                            class221.field2992++;
                                            if (class221.field2992 > 50) {
                                                class732.field10163++;
                                                class583 var74 = class54.method400(class213.field2800, (byte) -59, class579.field7936);
                                                class463.method2838(var74, (byte) 121);
                                            }
                                            if (class709.field9894) {
                                                class149.method953(119);
                                                class709.field9894 = false;
                                            }
                                            try {
                                                class48.method348(-20161);
                                                return;
                                            } catch (IOException var75) {
                                                class481.method2934(7);
                                                return;
                                            }
                                        }
                                        var67 = var66.field2020;
                                        if (var67.field10469 < 0) {
                                            break;
                                        }
                                        var68 = class189.method1182(var67.field10552, (byte) -101);
                                    } while (var68 == null || var68.field10503 == null || var68.field10503.length <= var67.field10469 || var68.field10503[var67.field10469] != var67);
                                    class546.method3233(var66);
                                }
                            }
                            var64 = var63.field2020;
                            if (var64.field10469 < 0) {
                                break;
                            }
                            var65 = class189.method1182(var64.field10552, (byte) -101);
                        } while (var65 == null || var65.field10503 == null || var65.field10503.length <= var64.field10469 || var65.field10503[var64.field10469] != var64);
                        class546.method3233(var63);
                    }
                }
                var61 = var60.field2020;
                if (var61.field10469 < 0) {
                    break;
                }
                var62 = class189.method1182(var61.field10552, (byte) -101);
            } while (var62 == null || var62.field10503 == null || var62.field10503.length <= var61.field10469 || var62.field10503[var61.field10469] != var61);
            class546.method3233(var60);
        }
    }

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "(I)Lto;")
    public static final class717 method1004(int arg0) {
        field2241++;
        if (class461.field6394 == null || class225.field3028 == null) {
            return null;
        } else if (arg0 == -29606) {
            class225.field3028.method2762(class461.field6394, arg0 + 30132);
            class717 var1 = (class717) class225.field3028.method2760((byte) 75);
            if (var1 == null) {
                return null;
            } else {
                class21 var2 = class461.field6385.method11(-115, var1.field9990);
                return var2 != null && var2.field227 && var2.method109(false, class461.field6380) ? var1 : class513.method3066((byte) -126);
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(B)V")
    public final void method1005(byte arg0) {
        class690 var2 = this.field2243;
        synchronized (this.field2243) {
            this.field2243.method3902(0);
        }
        field2249++;
        if (arg0 != 13) {
            this.method1006(-18, true);
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IZ)Llda;")
    public final class571 method1006(int arg0, boolean arg1) {
        field2244++;
        class690 var3 = this.field2243;
        class571 var4;
        synchronized (this.field2243) {
            var4 = (class571) this.field2243.method3898((byte) -42, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg1) {
            field2245 = -64;
        }
        class237 var5 = this.field2247;
        byte[] var6;
        synchronized (this.field2247) {
            var6 = this.field2247.method1572(30, 0, arg0);
        }
        class571 var7 = new class571();
        if (var6 != null) {
            var7.method3348((byte) -128, new class63(var6));
        }
        class690 var8 = this.field2243;
        synchronized (this.field2243) {
            this.field2243.method3899(74, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "(I)Lvi;")
    public static final class370 method1007(int arg0) {
        field2239++;
        class493.field6910 = arg0;
        return class467.method2853((byte) -123);
    }

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Lgp;ILuu;)V")
    public class162(class553 arg0, int arg1, class237 arg2) {
        this.field2247 = arg2;
        this.field2247.method1597(30, 0);
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2246[var1] = var0 - 1;
            var0 += var0;
        }
    }
}
