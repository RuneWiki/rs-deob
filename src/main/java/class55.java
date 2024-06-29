import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public abstract class class55 extends class140 {

    @OriginalMember(owner = "client!jv", name = "o", descriptor = "Lff;")
    public static class9 field868 = new class9(34, -2);

    @OriginalMember(owner = "client!jv", name = "p", descriptor = "Lwl;")
    public static class280 field869 = new class280();

    @OriginalMember(owner = "client!jv", name = "s", descriptor = "I")
    public static int field872 = 0;

    @OriginalMember(owner = "client!jv", name = "r", descriptor = "Lff;")
    public static class9 field871 = new class9(101, 6);

    @OriginalMember(owner = "client!jv", name = "g", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!jv", name = "h", descriptor = "I")
    public int field861;

    @OriginalMember(owner = "client!jv", name = "i", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!jv", name = "j", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!jv", name = "k", descriptor = "I")
    public int field864;

    @OriginalMember(owner = "client!jv", name = "l", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!jv", name = "m", descriptor = "I")
    public int field866;

    @OriginalMember(owner = "client!jv", name = "n", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!jv", name = "q", descriptor = "Z")
    public boolean field870;

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(I)V")
    public static final void method402(int arg0) {
        if (class377.field5106 > 1) {
            class222.field2994 = class308.field4051;
            class377.field5106--;
        }
        field867++;
        if (class265.field3500 > 0) {
            class265.field3500--;
        }
        if (class407.field5593) {
            class407.field5593 = false;
            class467.method2651((byte) -48);
            return;
        }
        if (!class379.field5189) {
            class389.method2294(false);
        }
        for (int var1 = 0; var1 < 100 && class219.method1388(-90); var1++) {
        }
        if (class454.field6161 != 30) {
            return;
        }
        class360.method2099((byte) 7, class193.field2708, class205.field2837.method1004(-32624));
        if (class50.field776 == null) {
            if (class498.method2854(-119) >= class319.field4182) {
                class50.field776 = class321.field4199.method664((byte) -53, class273.field3588);
            }
        } else if (class50.field776.field379 != -1) {
            class118.method822(-119, class411.field5651);
            class193.field2708.method2246(class50.field776.field379, (byte) -102);
            class50.field776 = null;
            class319.field4182 = class498.method2854(-128) + 30000L;
        }
        class378 var2 = (class378) class511.field7294.method1672((byte) -126);
        if (var2 != null || class91.field1382 < (class498.method2854(-122) - 2000L)) {
            boolean var3 = false;
            int var4 = class193.field2708.field5173;
            for (class378 var5 = (class378) class264.field3484.method1672((byte) -87); var5 != null && (class193.field2708.field5173 - var4) < 240; var5 = (class378) class264.field3484.method1668(-1)) {
                var5.method300(false);
                int var6 = var5.method263((byte) -127);
                if (var6 < 0) {
                    var6 = 0;
                } else if (var6 > 65534) {
                    var6 = 65534;
                }
                int var7 = var5.method255(125);
                if (var7 < 0) {
                    var7 = 0;
                } else if (var7 > 65534) {
                    var7 = 65534;
                }
                boolean var8 = false;
                if (var5.method263((byte) -125) == -1 && var5.method255(110) == -1) {
                    var7 = -1;
                    var6 = -1;
                    var8 = true;
                }
                if (class186.field2634 != var7 || class337.field4415 != var6) {
                    if (!var3) {
                        class151.field2166++;
                        class118.method822(arg0 ^ 0x7539, class397.field5352);
                        class193.field2708.method2200(7, 0);
                        var4 = class193.field2708.field5173;
                        var3 = true;
                    }
                    int var9 = var7 - class186.field2634;
                    class186.field2634 = var7;
                    int var10 = var6 - class337.field4415;
                    class337.field4415 = var6;
                    int var11 = (int) ((var5.method260(2) - class91.field1382) / 20L);
                    if (var11 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                        var10 += 32;
                        var9 += 32;
                        class193.field2708.method2246((var9 << 6) + (var11 << 12) + var10, (byte) -97);
                    } else if (var11 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                        var9 += 128;
                        var10 += 128;
                        class193.field2708.method2200(7, var11 + 128);
                        class193.field2708.method2246((var9 << 8) + var10, (byte) -125);
                    } else if (var11 >= 32) {
                        class193.field2708.method2246(var11 + 57344, (byte) -87);
                        if (var8) {
                            class193.field2708.method2214(93, Integer.MIN_VALUE);
                        } else {
                            class193.field2708.method2214(arg0 - 29992, var7 | var6 << 16);
                        }
                    } else {
                        class193.field2708.method2200(7, var11 + 192);
                        if (var8) {
                            class193.field2708.method2214(arg0 ^ 0x756F, Integer.MIN_VALUE);
                        } else {
                            class193.field2708.method2214(107, var7 | var6 << 16);
                        }
                    }
                    class91.field1382 = var5.method260(2);
                }
            }
            if (var3) {
                class193.field2708.method2210(class193.field2708.field5173 - var4, (byte) 103);
            }
        }
        if (var2 != null) {
            long var12 = (var2.method260(arg0 - 30032) - class231.field3108) / 50L;
            class231.field3108 = var2.method260(2);
            if (var12 > 32767L) {
                var12 = 32767L;
            }
            int var14 = var2.method263((byte) -128);
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            int var15 = var2.method255(arg0 ^ 0x7522);
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            byte var16 = 0;
            if (var2.method256((byte) -127) == 2) {
                var16 = 1;
            }
            class12.field249++;
            int var17 = (int) var12;
            class118.method822(-81, class435.field5976);
            class193.field2708.method2206(var14 << 16 | var15, arg0 + 900350038);
            class193.field2708.method2246(var16 << 15 | var17, (byte) -121);
        }
        if (class361.field4878 > 0) {
            int var18 = 0;
            for (int var19 = 0; var19 < class361.field4878; var19++) {
                if (class242.field3235[var19].method1334(0)) {
                    var18++;
                }
            }
            if (var18 > 0) {
                class118.method822(arg0 - 30120, class291.field3808);
                if (var18 > 75) {
                    var18 = 75;
                }
                class203.field2812++;
                class193.field2708.method2200(arg0 ^ 0x7555, var18 * 3);
                for (int var20 = 0; var20 < class361.field4878; var20++) {
                    class210 var21 = class242.field3235[var20];
                    if (var21.method1334(0)) {
                        long var22 = (var21.method1329((byte) 105) - class377.field5107) / 50L;
                        class377.field5107 = var21.method1329((byte) -12);
                        if (var22 > 65535L) {
                            var22 = 65535L;
                        }
                        class193.field2708.method2200(7, var21.method1332(88));
                        class193.field2708.method2246((int) var22, (byte) -91);
                    }
                }
            }
        }
        if (class105.field1536 > 0) {
            class105.field1536--;
        }
        if (class104.field1531 && class105.field1536 <= 0) {
            class105.field1536 = 20;
            class366.field4953++;
            class104.field1531 = false;
            class118.method822(arg0 ^ 0xFFFF8AE7, class366.field4955);
            class193.field2708.method2198((int) class184.field2621 >> 3, (byte) -23);
            class193.field2708.method2198((int) class426.field5820 >> 3, (byte) -23);
        }
        if (class334.field4378 && !class50.field771) {
            class50.field771 = true;
            class397.field5350++;
            class118.method822(arg0 - 30127, class51.field798);
            class193.field2708.method2200(7, 1);
        }
        if (!class334.field4378 && class50.field771) {
            class50.field771 = false;
            class397.field5350++;
            class118.method822(97, class51.field798);
            class193.field2708.method2200(7, 0);
        }
        if (!class121.field1774) {
            class118.method822(121, class463.field6409);
            class306.field4030++;
            class193.field2708.method2200(7, 0);
            int var24 = class193.field2708.field5173;
            class379 var25 = class154.field2244.method1853((byte) -72);
            class193.field2708.method2211(0, var25.field5173, var25.field5152, (byte) -111);
            class193.field2708.method2210(class193.field2708.field5173 - var24, (byte) 91);
            class121.field1774 = true;
        }
        if (class497.field6886 != null) {
            if (class42.field623 == 2) {
                class48.method355(true);
            } else if (class42.field623 == 3) {
                class406.method2360(-2);
            }
        }
        if (class209.field2866) {
            class209.field2866 = false;
        } else {
            class467.field6440 /= 2.0F;
        }
        if (class74.field1112) {
            class74.field1112 = false;
        } else {
            class48.field754 /= 2.0F;
        }
        class228.method1421(0);
        if (class454.field6161 != 30) {
            return;
        }
        class493.method2837(arg0 - 1980167599);
        class490.method2826(61);
        class219.method1387(-27250);
        class73.method475(arg0 ^ 0xFFFFD6E5);
        class466.field6425++;
        if (class466.field6425 > 750) {
            class467.method2651((byte) -48);
            return;
        }
        class482.method2771((byte) 90);
        class148.method1025((byte) 19);
        class229.method1429(-116);
        for (int var26 = class301.field3980.method1726((byte) 50, true); var26 != -1; var26 = class301.field3980.method1726((byte) 50, false)) {
            class252.method1517(var26, (byte) 84);
            class324.field4276[class494.method2839(class49.field763++, 31)] = var26;
        }
        class253 var27 = class247.method1499(arg0 - 3061);
        if (arg0 != 30034) {
            field872 = 40;
        }
        while (var27 != null) {
            int var28 = var27.method1527((byte) -61);
            int var29 = var27.method1526(arg0 - 30155);
            if (var28 == 1) {
                class98.field1478[var29] = var27.field3356;
                class269.field3538 |= class131.field1900[var29];
                class58.field904[class494.method2839(31, class149.field2129++)] = var29;
            } else if (var28 == 2) {
                class344.field4551[var29] = var27.field3353;
                class184.field2614[class494.method2839(class102.field1508++, 31)] = var29;
            } else if (var28 == 3) {
                class403 var30 = class213.method1345((byte) -119, var29);
                if (!var27.field3353.equals(var30.field5479)) {
                    var30.field5479 = var27.field3353;
                    class412.method2378(var30, (byte) -115);
                }
            } else if (var28 == 4) {
                class403 var48 = class213.method1345((byte) 32, var29);
                int var49 = var27.field3356;
                int var50 = var27.field3355;
                int var51 = var27.field3358;
                if (var48.field5516 != var49 || var48.field5510 != var50 || var48.field5419 != var51) {
                    var48.field5516 = var49;
                    var48.field5419 = var51;
                    var48.field5510 = var50;
                    class412.method2378(var48, (byte) -123);
                }
            } else if (var28 == 5) {
                class403 var31 = class213.method1345((byte) -126, var29);
                if (var27.field3356 != var31.field5415 || var27.field3356 == -1) {
                    var31.field5484 = 1;
                    var31.field5543 = 0;
                    var31.field5415 = var27.field3356;
                    var31.field5477 = 0;
                    class412.method2378(var31, (byte) -115);
                }
            } else if (var28 == 6) {
                int var32 = var27.field3356;
                int var33 = (var32 & 0x7DDB) >> 10;
                int var34 = (var32 & 0x3E7) >> 5;
                int var35 = var32 & 0x1F;
                int var36 = (var34 << 11) + ((var33 << 19) + (var35 << 3));
                class403 var37 = class213.method1345((byte) 41, var29);
                if (var37.field5436 != var36) {
                    var37.field5436 = var36;
                    class412.method2378(var37, (byte) -118);
                }
            } else if (var28 == 7) {
                class403 var46 = class213.method1345((byte) 53, var29);
                boolean var47 = var27.field3356 == 1;
                if (var47 != var46.field5550) {
                    var46.field5550 = var47;
                    class412.method2378(var46, (byte) -120);
                }
            } else if (var28 == 8) {
                class403 var45 = class213.method1345((byte) 36, var29);
                if (var27.field3356 != var45.field5556 || var27.field3355 != var45.field5546 || var27.field3358 != var45.field5434) {
                    var45.field5434 = var27.field3358;
                    var45.field5546 = var27.field3355;
                    var45.field5556 = var27.field3356;
                    if (var45.field5530 != -1) {
                        if (var45.field5496 > 0) {
                            var45.field5434 = var45.field5434 * 32 / var45.field5496;
                        } else if (var45.field5536 > 0) {
                            var45.field5434 = var45.field5434 * 32 / var45.field5536;
                        }
                    }
                    class412.method2378(var45, (byte) -116);
                }
            } else if (var28 == 9) {
                class403 var44 = class213.method1345((byte) 62, var29);
                if (var27.field3356 != var44.field5530 || var27.field3355 != var44.field5541) {
                    var44.field5530 = var27.field3356;
                    var44.field5541 = var27.field3355;
                    class412.method2378(var44, (byte) -124);
                }
            } else if (var28 == 10) {
                class403 var43 = class213.method1345((byte) 111, var29);
                if (var27.field3356 != var43.field5405 || var27.field3355 != var43.field5527 || var27.field3358 != var43.field5457) {
                    var43.field5405 = var27.field3356;
                    var43.field5527 = var27.field3355;
                    var43.field5457 = var27.field3358;
                    class412.method2378(var43, (byte) -114);
                }
            } else if (var28 == 11) {
                class403 var38 = class213.method1345((byte) -114, var29);
                var38.field5521 = 0;
                var38.field5469 = 0;
                var38.field5537 = var38.field5475 = var27.field3355;
                var38.field5438 = var38.field5470 = var27.field3356;
                class412.method2378(var38, (byte) -118);
            } else if (var28 == 12) {
                class403 var39 = class213.method1345((byte) 100, var29);
                int var40 = var27.field3356;
                if (var39 != null && var39.field5480 == 0) {
                    if (var40 > var39.field5472 - var39.field5404) {
                        var40 = var39.field5472 - var39.field5404;
                    }
                    if (var40 < 0) {
                        var40 = 0;
                    }
                    if (var39.field5442 != var40) {
                        var39.field5442 = var40;
                        class412.method2378(var39, (byte) -115);
                    }
                }
            } else if (var28 == 14) {
                class403 var42 = class213.method1345((byte) 119, var29);
                var42.field5424 = var27.field3356;
            } else if (var28 == 15) {
                class11.field239 = var27.field3356;
                class497.field6888 = var27.field3355;
                class413.field5717 = true;
            } else if (var28 == 16) {
                class403 var41 = class213.method1345((byte) -121, var29);
                var41.field5531 = var27.field3356;
            }
            var27 = class247.method1499(arg0 ^ 0x1C0F);
        }
        class128.field1871++;
        if (class39.field593 != 0) {
            class506.field7033 += 20;
            if (class506.field7033 >= 400) {
                class39.field593 = 0;
            }
        }
        if (class485.field6759 != null) {
            class320.field4191++;
            if (class320.field4191 >= 15) {
                class412.method2378(class485.field6759, (byte) -113);
                class485.field6759 = null;
            }
        }
        class129.field1883 = false;
        class366.field4954 = null;
        class53.field836 = null;
        class334.field4377 = false;
        class9.method102(null, 13132, -1, -1);
        class75.method483(-1, null, (byte) 125, -1);
        if (!class32.field529) {
            class16.field285 = -1;
        }
        class14.method135(true);
        class308.field4051++;
        if (class9.field219) {
            class266.field3510++;
            class118.method822(-80, class474.field6550);
            class193.field2708.method2227(class506.field7034 << 14 | class519.field7696 << 28 | class347.field4683, (byte) -127);
            class9.field219 = false;
        }
        while (true) {
            class353 var52;
            class403 var53;
            class403 var54;
            do {
                var52 = (class353) class379.field5188.method1662((byte) 110);
                if (var52 == null) {
                    while (true) {
                        class353 var55;
                        class403 var56;
                        class403 var57;
                        do {
                            var55 = (class353) class349.field4709.method1662((byte) 127);
                            if (var55 == null) {
                                while (true) {
                                    class353 var58;
                                    class403 var59;
                                    class403 var60;
                                    do {
                                        var58 = (class353) field869.method1662((byte) 117);
                                        if (var58 == null) {
                                            if (class53.field836 == null) {
                                                class78.field1175 = 0;
                                            }
                                            if (class484.field6735 != null) {
                                                class514.method3026(69);
                                            }
                                            if (class196.field2745 > 0 && class32.field523.method305(82, (byte) 59) && class32.field523.method305(81, (byte) 59) && class476.field6560 != 0) {
                                                int var61 = class385.field5232.field573 - class476.field6560;
                                                if (var61 < 0) {
                                                    var61 = 0;
                                                } else if (var61 > 3) {
                                                    var61 = 3;
                                                }
                                                class268.method1611(class421.field5762 + class385.field5232.field6266[0], (byte) -123, var61, class385.field5232.field6261[0] + class401.field5382);
                                            }
                                            class412.method2382(2);
                                            for (int var62 = 0; var62 < 5; var62++) {
                                                int var10002 = class189.field2665[var62]++;
                                            }
                                            if (class269.field3538 && class21.field386 < class498.method2854(-115) - 60000L) {
                                                class519.method3060((byte) 39);
                                            }
                                            class199.field2766++;
                                            if (class199.field2766 > 500) {
                                                class199.field2766 = 0;
                                                int var63 = (int) (Math.random() * 8.0D);
                                                if ((var63 & 0x1) == 1) {
                                                    class525.field7779 += class361.field4877;
                                                }
                                                if ((var63 & 0x2) == 2) {
                                                    class371.field4991 += class50.field775;
                                                }
                                                if ((var63 & 0x4) == 4) {
                                                    class336.field4405 += class258.field3414;
                                                }
                                            }
                                            if (class525.field7779 < -50) {
                                                class361.field4877 = 2;
                                            }
                                            if (class525.field7779 > 50) {
                                                class361.field4877 = -2;
                                            }
                                            if (class371.field4991 < -55) {
                                                class50.field775 = 2;
                                            }
                                            if (class336.field4405 < -40) {
                                                class258.field3414 = 1;
                                            }
                                            if (class371.field4991 > 55) {
                                                class50.field775 = -2;
                                            }
                                            class37.field577++;
                                            if (class336.field4405 > 40) {
                                                class258.field3414 = -1;
                                            }
                                            if (class37.field577 > 500) {
                                                class37.field577 = 0;
                                                int var64 = (int) (Math.random() * 8.0D);
                                                if ((var64 & 0x1) == 1) {
                                                    class361.field4871 += class138.field1982;
                                                }
                                                if ((var64 & 0x2) == 2) {
                                                    class514.field7589 += class511.field7277;
                                                }
                                            }
                                            if (class361.field4871 < -60) {
                                                class138.field1982 = 2;
                                            }
                                            if (class361.field4871 > 60) {
                                                class138.field1982 = -2;
                                            }
                                            if (class514.field7589 < -20) {
                                                class511.field7277 = 1;
                                            }
                                            class285.field3725++;
                                            if (class514.field7589 > 10) {
                                                class511.field7277 = -1;
                                            }
                                            if (class285.field3725 > 50) {
                                                class93.field1408++;
                                                class118.method822(109, class261.field3468);
                                            }
                                            if (class457.field6301) {
                                                class255.method1538(2);
                                                class457.field6301 = false;
                                            }
                                            try {
                                                if (class304.field4004 != null && class193.field2708.field5173 > 0) {
                                                    class132.field1911 += class193.field2708.field5173;
                                                    class304.field4004.method1880(class193.field2708.field5152, 96, 0, class193.field2708.field5173);
                                                    class193.field2708.field5173 = 0;
                                                    class285.field3725 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var65) {
                                                class467.method2651((byte) -48);
                                                return;
                                            }
                                        }
                                        var59 = var58.field4770;
                                        if (var59.field5553 < 0) {
                                            break;
                                        }
                                        var60 = class213.method1345((byte) -120, var59.field5517);
                                    } while (var60 == null || var60.field5420 == null || var59.field5553 >= var60.field5420.length || var60.field5420[var59.field5553] != var59);
                                    class122.method893(var58);
                                }
                            }
                            var56 = var55.field4770;
                            if (var56.field5553 < 0) {
                                break;
                            }
                            var57 = class213.method1345((byte) 8, var56.field5517);
                        } while (var57 == null || var57.field5420 == null || var56.field5553 >= var57.field5420.length || var57.field5420[var56.field5553] != var56);
                        class122.method893(var55);
                    }
                }
                var53 = var52.field4770;
                if (var53.field5553 < 0) {
                    break;
                }
                var54 = class213.method1345((byte) 1, var53.field5517);
            } while (var54 == null || var54.field5420 == null || var53.field5553 >= var54.field5420.length || var54.field5420[var53.field5553] != var53);
            class122.method893(var52);
        }
    }

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "(B)Z")
    public final boolean method126(byte arg0) {
        if (arg0 != 54) {
            this.field861 = -36;
        }
        field865++;
        return false;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(B)V")
    public static void method403(byte arg0) {
        field871 = null;
        if (arg0 > -114) {
            field871 = null;
        }
        field868 = null;
        field869 = null;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(IILqa;Leq;IIZ)V")
    public final void method127(int arg0, int arg1, class162 arg2, class140 arg3, int arg4, int arg5, boolean arg6) {
        field862++;
        if (arg0 == 1) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(Z)V")
    public final void method125(boolean arg0) {
        if (arg0) {
            field860++;
            throw new IllegalStateException();
        }
    }
}
