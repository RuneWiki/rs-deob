import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public abstract class class18 {

    @OriginalMember(owner = "client!as", name = "a", descriptor = "Luv;")
    public static class2 field282 = new class2(53, 11);

    @OriginalMember(owner = "client!as", name = "b", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!as", name = "c", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client!as", name = "d", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!as", name = "f", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!as", name = "g", descriptor = "I")
    public static int field288;

    @OriginalMember(owner = "client!as", name = "e", descriptor = "Lc;")
    public static class511 field286;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Z)Z")
    public abstract boolean method200(boolean arg0);

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(B)I")
    public abstract int method201(byte arg0);

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(I)V")
    public static final void method202(int arg0) {
        if (arg0 != 4) {
            field282 = null;
        }
        class111.field1697.method3120(-30086);
        field288++;
        class274.field4095 = 1;
        class525.field7766 = null;
    }

    @OriginalMember(owner = "client!as", name = "b", descriptor = "(B)C")
    public abstract char method203(byte arg0);

    @OriginalMember(owner = "client!as", name = "b", descriptor = "(I)J")
    public abstract long method204(int arg0);

    @OriginalMember(owner = "client!as", name = "c", descriptor = "(B)V")
    public static final void method205(byte arg0) {
        if (class89.field1392 > 1) {
            class486.field7240 = class264.field3939;
            class89.field1392--;
        }
        field287++;
        if (class219.field3135 > 0) {
            class219.field3135--;
        }
        if (class420.field6295) {
            class420.field6295 = false;
            method207(-32);
            return;
        }
        if (!class495.field7350) {
            class275.method1717(78);
        }
        for (int var1 = 0; var1 < 100 && class496.method2946(true); var1++) {
        }
        if (class411.field6213 != 9) {
            return;
        }
        class34.method289((byte) -98, class349.field5378.method560((byte) 84), class43.field559);
        if (class12.field120 == null) {
            if (class381.method2281((byte) 81) >= class397.field5932) {
                class12.field120 = class332.field5150.method387(class141.field2122.field3021, (byte) 112);
            }
        } else if (class12.field120.field1747 != -1) {
            class97.method758(class33.field458, false);
            class43.field559.method2777((byte) 74, class12.field120.field1747);
            class12.field120 = null;
            class397.field5932 = class381.method2281((byte) -115) + 30000L;
        }
        class376 var2 = (class376) class483.field7130.method2957(93);
        if (var2 != null || class381.method2281((byte) -122) - 2000L > class213.field3047) {
            boolean var3 = false;
            int var4 = class43.field559.field6830;
            for (class376 var5 = (class376) class81.field1192.method2957(-40); var5 != null && (class43.field559.field6830 - var4) < 240; var5 = (class376) class81.field1192.method2947(-100)) {
                var5.method876((byte) -96);
                int var6 = var5.method954(3);
                if (var6 < 0) {
                    var6 = 0;
                } else if (var6 > 65534) {
                    var6 = 65534;
                }
                int var7 = var5.method952(25407);
                if (var7 < 0) {
                    var7 = 0;
                } else if (var7 > 65534) {
                    var7 = 65534;
                }
                boolean var8 = false;
                if (var5.method954(3) == -1 && var5.method952(25407) == -1) {
                    var8 = true;
                    var7 = -1;
                    var6 = -1;
                }
                if (class201.field2930 != var7 || class256.field3479 != var6) {
                    if (!var3) {
                        class97.method758(class282.field4259, false);
                        class39.field519++;
                        class43.field559.method2754(0, 5574);
                        var3 = true;
                        var4 = class43.field559.field6830;
                    }
                    int var9 = var7 - class201.field2930;
                    class201.field2930 = var7;
                    int var10 = var6 - class256.field3479;
                    class256.field3479 = var6;
                    int var11 = (int) ((var5.method950(true) - class213.field3047) / 20L);
                    if (var11 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                        var10 += 32;
                        var9 += 32;
                        class43.field559.method2777((byte) 74, (var9 << 6) + (var11 << 12) + var10);
                    } else if (var11 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                        var10 += 128;
                        var9 += 128;
                        class43.field559.method2754(var11 + 128, 5574);
                        class43.field559.method2777((byte) 74, (var9 << 8) + var10);
                    } else if (var11 < 32) {
                        class43.field559.method2754(var11 + 192, 5574);
                        if (var8) {
                            class43.field559.method2717(Integer.MIN_VALUE, 496598568);
                        } else {
                            class43.field559.method2717(var6 << 16 | var7, 496598568);
                        }
                    } else {
                        class43.field559.method2777((byte) 74, var11 + 57344);
                        if (var8) {
                            class43.field559.method2717(Integer.MIN_VALUE, 496598568);
                        } else {
                            class43.field559.method2717(var6 << 16 | var7, 496598568);
                        }
                    }
                    class213.field3047 = var5.method950(true);
                }
            }
            if (var3) {
                class43.field559.method2744(class43.field559.field6830 - var4, true);
            }
        }
        if (var2 != null) {
            long var12 = (var2.method950(true) - class15.field199) / 50L;
            class15.field199 = var2.method950(true);
            if (var12 > 32767L) {
                var12 = 32767L;
            }
            int var14 = var2.method954(3);
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            int var15 = var2.method952(25407);
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            byte var16 = 0;
            if (var2.method955((byte) -120) == 2) {
                var16 = 1;
            }
            class97.method758(class526.field7779, false);
            int var17 = (int) var12;
            class327.field5109++;
            class43.field559.method2739(var17 | var16 << 15, (byte) -41);
            class43.field559.method2748(var15 | var14 << 16, (byte) -23);
        }
        if (class56.field775 > 0) {
            int var18 = 0;
            for (int var19 = 0; var19 < class56.field775; var19++) {
                if (class58.field800[var19].method200(false)) {
                    var18++;
                }
            }
            if (var18 > 0) {
                class97.method758(class310.field4700, false);
                class237.field3313++;
                if (var18 > 75) {
                    var18 = 75;
                }
                class43.field559.method2754(var18 * 3, 5574);
                for (int var20 = 0; var20 < class56.field775; var20++) {
                    class18 var21 = class58.field800[var20];
                    if (var21.method200(false)) {
                        long var22 = (var21.method204(86) - class191.field2786) / 50L;
                        class191.field2786 = var21.method204(124);
                        if (var22 > 65535L) {
                            var22 = 65535L;
                        }
                        class43.field559.method2754(var21.method209(true), 5574);
                        class43.field559.method2777((byte) 74, (int) var22);
                    }
                }
            }
        }
        if (class6.field58 > 0) {
            class6.field58--;
        }
        if (class116.field1745 && class6.field58 <= 0) {
            class116.field1745 = false;
            class6.field58 = 20;
            class170.field2507++;
            class97.method758(class134.field2002, false);
            class43.field559.method2777((byte) 74, (int) class254.field3443 >> 3);
            class43.field559.method2777((byte) 74, (int) class311.field4836 >> 3);
        }
        if (class394.field5908 && !class107.field1594) {
            class301.field4479++;
            class107.field1594 = true;
            class97.method758(class108.field1606, false);
            class43.field559.method2754(1, 5574);
        }
        if (!class394.field5908 && class107.field1594) {
            class301.field4479++;
            class107.field1594 = false;
            class97.method758(class108.field1606, false);
            class43.field559.method2754(0, 5574);
        }
        if (!class273.field4068) {
            class97.method758(class150.field2285, false);
            class208.field3002++;
            class43.field559.method2754(0, 5574);
            int var24 = class43.field559.field6830;
            class468 var25 = class454.field6661.method1529(0);
            class43.field559.method2736(-1, 0, var25.field6830, var25.field6868);
            class43.field559.method2744(class43.field559.field6830 - var24, true);
            class273.field4068 = true;
        }
        if (class236.field3305 != null) {
            if (class350.field5388 == 2) {
                class281.method1752(-613070045);
            } else if (class350.field5388 == 3) {
                class104.method782(18326);
            }
        }
        if (class62.field837) {
            class62.field837 = false;
        } else {
            class78.field1085 /= 2.0F;
        }
        if (class116.field1742) {
            class116.field1742 = false;
        } else {
            class161.field2413 /= 2.0F;
        }
        class126.method924((byte) -4);
        if (class411.field6213 != 9) {
            return;
        }
        class258.method1592(-6402);
        class250.method1501(-23090);
        class348.method2106(-1965);
        class41.method329((byte) -119);
        class104.field1562++;
        if (class104.field1562 > 750) {
            method207(-32);
            return;
        }
        class184.method1249((byte) -25);
        class460.method2668((byte) -120);
        class389.method2331(0);
        for (int var26 = class307.field4619.method1029(true, 0); var26 != -1; var26 = class307.field4619.method1029(false, 0)) {
            class219.method1384(var26, (byte) 119);
            class265.field3955[class140.method1023(class174.field2545++, 31)] = var26;
        }
        for (class506 var27 = class306.method1906(0); var27 != null; var27 = class306.method1906(0)) {
            int var28 = var27.method2990(-122);
            int var29 = var27.method2991((byte) -93);
            if (var28 == 1) {
                class466.field6795[var29] = var27.field7442;
                class274.field4089 |= class409.field6170[var29];
                class295.field4420[class140.method1023(31, class286.field4291++)] = var29;
            } else if (var28 == 2) {
                class359.field5515[var29] = var27.field7444;
                class154.field2337[class140.method1023(31, class411.field6215++)] = var29;
            } else if (var28 == 3) {
                class310 var51 = class52.method386(0, var29);
                if (!var27.field7444.equals(var51.field4651)) {
                    var51.field4651 = var27.field7444;
                    class292.method1812(-14307, var51);
                }
            } else if (var28 == 4) {
                class310 var30 = class52.method386(0, var29);
                int var31 = var27.field7442;
                int var32 = var27.field7441;
                int var33 = var27.field7445;
                if (var30.field4802 != var31 || var30.field4782 != var32 || var30.field4717 != var33) {
                    var30.field4782 = var32;
                    var30.field4717 = var33;
                    var30.field4802 = var31;
                    class292.method1812(-14307, var30);
                }
            } else if (var28 == 5) {
                class310 var34 = class52.method386(0, var29);
                if (var27.field7442 != var34.field4772 || var27.field7442 == -1) {
                    var34.field4641 = 0;
                    var34.field4772 = var27.field7442;
                    var34.field4739 = 1;
                    var34.field4710 = 0;
                    class292.method1812(-14307, var34);
                }
            } else if (var28 == 6) {
                int var45 = var27.field7442;
                int var46 = (var45 & 0x7CF1) >> 10;
                int var47 = var45 >> 5 & 0x1F;
                int var48 = var45 & 0x1F;
                int var49 = (var47 << 11) + (var46 << 19) + (var48 << 3);
                class310 var50 = class52.method386(0, var29);
                if (var50.field4764 != var49) {
                    var50.field4764 = var49;
                    class292.method1812(-14307, var50);
                }
            } else if (var28 == 7) {
                class310 var35 = class52.method386(0, var29);
                boolean var36 = var27.field7442 == 1;
                if (var35.field4783 != var36) {
                    var35.field4783 = var36;
                    class292.method1812(-14307, var35);
                }
            } else if (var28 == 8) {
                class310 var44 = class52.method386(0, var29);
                if (var27.field7442 != var44.field4797 || var27.field7441 != var44.field4705 || var27.field7445 != var44.field4787) {
                    var44.field4797 = var27.field7442;
                    var44.field4787 = var27.field7445;
                    var44.field4705 = var27.field7441;
                    if (var44.field4665 != -1) {
                        if (var44.field4732 > 0) {
                            var44.field4787 = var44.field4787 * 32 / var44.field4732;
                        } else if (var44.field4664 > 0) {
                            var44.field4787 = var44.field4787 * 32 / var44.field4664;
                        }
                    }
                    class292.method1812(-14307, var44);
                }
            } else if (var28 == 9) {
                class310 var37 = class52.method386(0, var29);
                if (var27.field7442 != var37.field4665 || var27.field7441 != var37.field4677) {
                    var37.field4677 = var27.field7441;
                    var37.field4665 = var27.field7442;
                    class292.method1812(-14307, var37);
                }
            } else if (var28 == 10) {
                class310 var43 = class52.method386(0, var29);
                if (var27.field7442 != var43.field4760 || var27.field7441 != var43.field4728 || var27.field7445 != var43.field4716) {
                    var43.field4716 = var27.field7445;
                    var43.field4728 = var27.field7441;
                    var43.field4760 = var27.field7442;
                    class292.method1812(-14307, var43);
                }
            } else if (var28 == 11) {
                class310 var42 = class52.method386(0, var29);
                var42.field4734 = 0;
                var42.field4671 = var42.field4805 = var27.field7442;
                var42.field4644 = var42.field4646 = var27.field7441;
                var42.field4798 = 0;
                class292.method1812(-14307, var42);
            } else if (var28 == 12) {
                class310 var40 = class52.method386(0, var29);
                int var41 = var27.field7442;
                if (var40 != null && var40.field4703 == 0) {
                    if (var40.field4749 - var40.field4736 < var41) {
                        var41 = var40.field4749 - var40.field4736;
                    }
                    if (var41 < 0) {
                        var41 = 0;
                    }
                    if (var40.field4645 != var41) {
                        var40.field4645 = var41;
                        class292.method1812(-14307, var40);
                    }
                }
            } else if (var28 == 14) {
                class310 var38 = class52.method386(0, var29);
                var38.field4733 = var27.field7442;
            } else if (var28 == 15) {
                class182.field2702 = var27.field7441;
                class504.field7423 = var27.field7442;
                class94.field1462 = true;
            } else if (var28 == 16) {
                class310 var39 = class52.method386(0, var29);
                var39.field4759 = var27.field7442;
            }
        }
        if (class503.field7411 != 0) {
            class341.field5247 += 20;
            if (class341.field5247 >= 400) {
                class503.field7411 = 0;
            }
        }
        class469.field6876++;
        if (class297.field4426 != null) {
            class347.field5341++;
            if (class347.field5341 >= 15) {
                class292.method1812(-14307, class297.field4426);
                class297.field4426 = null;
            }
        }
        class465.field6768 = null;
        class53.field706 = false;
        class197.field2892 = false;
        class316.field4886 = null;
        class299.method1858(-1, null, -1, false);
        class443.method2600(-1, false, -1, null);
        if (!class302.field4504) {
            class98.field1510 = -1;
        }
        class434.method2559(89);
        class264.field3939++;
        if (class444.field6525) {
            class97.method758(class174.field2550, false);
            class356.field5462++;
            class43.field559.method2748(class346.field5335 | class174.field2552 << 14 | class264.field3942 << 28, (byte) -23);
            class444.field6525 = false;
        }
        while (true) {
            class120 var52;
            class310 var53;
            class310 var54;
            do {
                var52 = (class120) class11.field113.method2951((byte) 116);
                if (var52 == null) {
                    while (true) {
                        class120 var55;
                        class310 var56;
                        class310 var57;
                        do {
                            var55 = (class120) class158.field2384.method2951((byte) 97);
                            if (var55 == null) {
                                while (true) {
                                    class120 var58;
                                    class310 var59;
                                    class310 var60;
                                    do {
                                        var58 = (class120) class478.field7041.method2951((byte) 119);
                                        if (var58 == null) {
                                            if (class316.field4886 == null) {
                                                class9.field88 = 0;
                                            }
                                            if (class251.field3435 != null) {
                                                class511.method3015(1);
                                            }
                                            if (class234.field3291 > 0 && class49.field630.method1879(82, true) && class49.field630.method1879(81, true) && class384.field5794 != 0) {
                                                int var61 = class410.field6198.field7686 - class384.field5794;
                                                if (var61 < 0) {
                                                    var61 = 0;
                                                } else if (var61 > 3) {
                                                    var61 = 3;
                                                }
                                                class498.method2965(var61, -122, class241.field3358 + class410.field6198.field6068[0], class410.field6198.field6065[0] + class267.field3979);
                                            }
                                            class313.method1970(-16152);
                                            for (int var62 = 0; var62 < 5; var62++) {
                                                int var10002 = class377.field5689[var62]++;
                                            }
                                            if (class274.field4089 && class65.field883 < class381.method2281((byte) 20) - 60000L) {
                                                class234.method1445(6);
                                            }
                                            for (class143 var63 = (class143) class328.field5126.method3089(71); var63 != null; var63 = (class143) class328.field5126.method3088((byte) -65)) {
                                                if ((long) var63.field2151 < class381.method2281((byte) 84) / 1000L - 5L) {
                                                    if (var63.field2155 > 0) {
                                                        class73.method515(127, 5, 0, "", var63.field2152 + class120.field1834.method2103(class30.field430, (byte) 34), "");
                                                    }
                                                    if (var63.field2155 == 0) {
                                                        class73.method515(127, 5, 0, "", var63.field2152 + class133.field1991.method2103(class30.field430, (byte) 34), "");
                                                    }
                                                    var63.method2096((byte) 73);
                                                }
                                            }
                                            class377.field5683++;
                                            if (class377.field5683 > 500) {
                                                class377.field5683 = 0;
                                                int var64 = (int) (Math.random() * 8.0D);
                                                if ((var64 & 0x4) == 4) {
                                                    class80.field1096 += class218.field3122;
                                                }
                                                if ((var64 & 0x1) == 1) {
                                                    class96.field1488 += class233.field3278;
                                                }
                                                if ((var64 & 0x2) == 2) {
                                                    class469.field6882 += class531.field7829;
                                                }
                                            }
                                            if (class96.field1488 < -50) {
                                                class233.field3278 = 2;
                                            }
                                            if (class469.field6882 < -55) {
                                                class531.field7829 = 2;
                                            }
                                            if (class96.field1488 > 50) {
                                                class233.field3278 = -2;
                                            }
                                            if (class469.field6882 > 55) {
                                                class531.field7829 = -2;
                                            }
                                            if (class80.field1096 < -40) {
                                                class218.field3122 = 1;
                                            }
                                            if (class80.field1096 > 40) {
                                                class218.field3122 = -1;
                                            }
                                            class112.field1711++;
                                            if (class112.field1711 > 500) {
                                                class112.field1711 = 0;
                                                int var65 = (int) (Math.random() * 8.0D);
                                                if ((var65 & 0x1) == 1) {
                                                    class469.field6881 += class365.field5580;
                                                }
                                                if ((var65 & 0x2) == 2) {
                                                    class230.field3230 += class147.field2225;
                                                }
                                            }
                                            if (arg0 > -2) {
                                                return;
                                            }
                                            if (class469.field6881 < -60) {
                                                class365.field5580 = 2;
                                            }
                                            if (class469.field6881 > 60) {
                                                class365.field5580 = -2;
                                            }
                                            if (class230.field3230 < -20) {
                                                class147.field2225 = 1;
                                            }
                                            if (class230.field3230 > 10) {
                                                class147.field2225 = -1;
                                            }
                                            class163.field2427++;
                                            if (class163.field2427 > 50) {
                                                class421.field6297++;
                                                class97.method758(class406.field6109, false);
                                            }
                                            if (class333.field5168) {
                                                class507.method2993(13);
                                                class333.field5168 = false;
                                            }
                                            try {
                                                if (class232.field3269 != null && class43.field559.field6830 > 0) {
                                                    class40.field526 += class43.field559.field6830;
                                                    class232.field3269.method658(14812, 0, class43.field559.field6830, class43.field559.field6868);
                                                    class43.field559.field6830 = 0;
                                                    class163.field2427 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var66) {
                                                method207(-32);
                                                return;
                                            }
                                        }
                                        var59 = var58.field1833;
                                        if (var59.field4675 < 0) {
                                            break;
                                        }
                                        var60 = class52.method386(0, var59.field4753);
                                    } while (var60 == null || var60.field4788 == null || var59.field4675 >= var60.field4788.length || var60.field4788[var59.field4675] != var59);
                                    class64.method449(var58);
                                }
                            }
                            var56 = var55.field1833;
                            if (var56.field4675 < 0) {
                                break;
                            }
                            var57 = class52.method386(0, var56.field4753);
                        } while (var57 == null || var57.field4788 == null || var57.field4788.length <= var56.field4675 || var57.field4788[var56.field4675] != var56);
                        class64.method449(var55);
                    }
                }
                var53 = var52.field1833;
                if (var53.field4675 < 0) {
                    break;
                }
                var54 = class52.method386(0, var53.field4753);
            } while (var54 == null || var54.field4788 == null || var54.field4788.length <= var53.field4675 || var54.field4788[var53.field4675] != var53);
            class64.method449(var52);
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IZ)I")
    public static final int method206(int arg0, boolean arg1) {
        field285++;
        if (!arg1) {
            method202(-62);
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!as", name = "c", descriptor = "(I)V")
    public static final void method207(int arg0) {
        field284++;
        if (class411.field6213 == 6) {
            class457.method2654(false, 116);
        } else if (class219.field3135 > 0) {
            class457.method2654(class209.field3010, 115);
        } else {
            class133.field1984 = class232.field3269;
            if (arg0 == -32) {
                class232.field3269 = null;
                class526.method3137(12, arg0 ^ 0xFFFFF73E);
            }
        }
    }

    @OriginalMember(owner = "client!as", name = "d", descriptor = "(B)V")
    public static void method208(byte arg0) {
        if (arg0 < -90) {
            field286 = null;
            field282 = null;
        }
    }

    @OriginalMember(owner = "client!as", name = "b", descriptor = "(Z)I")
    public abstract int method209(boolean arg0);
}
