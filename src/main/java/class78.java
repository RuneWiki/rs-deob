import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public abstract class class78 {

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "I")
    public int field1321;

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "I")
    public int field1325;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
    public int field1317;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "[I")
    public static int[] field1320 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!bi", name = "m", descriptor = "Lqd;")
    public static class40 field1328 = class147.method1106("<br>(X100(U(Y", (byte) -92);

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "Lqd;")
    public static class40 field1323 = class147.method1106("loc", (byte) -67);

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "[I")
    public static int[] field1324 = new int[50];

    @OriginalMember(owner = "client!bi", name = "p", descriptor = "Lqd;")
    public static class40 field1331 = class147.method1106("Speicher wird zugewiesen)3", (byte) -96);

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!bi", name = "n", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!bi", name = "o", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "[[[I")
    public static int[][][] field1316;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IZ)Leg;", line = 4)
    public static final class291 method579(int arg0, boolean arg1) {
        if (arg1) {
            field1329++;
            return class1.field12 && class270.field4486 <= arg0 && arg0 <= class166.field2752 ? class159.field2661[arg0 - class270.field4486] : null;
        } else {
            return (class291) null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(III)Lqd;", line = 22)
    public static final class40 method580(int arg0, int arg1, int arg2) {
        int var3 = arg1 - arg0;
        field1330++;
        if (var3 < -9) {
            return class204.field3227;
        } else if (var3 < -6) {
            return class27.field571;
        } else if (arg2 != -26482) {
            return (class40) null;
        } else if (var3 < -3) {
            return class150.field2521;
        } else if (var3 < 0) {
            return client.field4048;
        } else if (var3 > 9) {
            return class3.field29;
        } else if (var3 > 6) {
            return class150.field2517;
        } else if (var3 > 3) {
            return class192.field3096;
        } else if (var3 <= 0) {
            return class244.field4028;
        } else {
            return class101.field1787;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V", line = 65)
    public static final void method581(byte arg0) {
        if (class90.field1638 > 0) {
            class90.field1638--;
        }
        if (class166.field2753 > 1) {
            class134.field2278 = class60.field1152;
            class166.field2753--;
        }
        field1326++;
        if (class225.field3727) {
            class225.field3727 = false;
            class280.method1957((byte) -90);
            return;
        }
        for (int var1 = 0; var1 < 100 && class284.method1981(4); var1++) {
        }
        if (class6.field87 != 30) {
            return;
        }
        class213.method1511(class19.field295, 116, 41);
        Object var2 = class7.field105.field2651;
        synchronized (class7.field105.field2651) {
            if (!class299.field4998) {
                class7.field105.field2668 = 0;
            } else if (class288.field4833 != 0 || class7.field105.field2668 >= 40) {
                int var3 = 0;
                class19.field295.method1464(56, 0);
                class19.field295.method218(0, -19914);
                class188.field3043++;
                int var4 = class19.field295.field478;
                for (int var5 = 0; class7.field105.field2668 > var5 && class19.field295.field478 - var4 < 240; var5++) {
                    var3++;
                    int var6 = class7.field105.field2667[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    int var7 = class7.field105.field2669[var5];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 65534) {
                        var7 = 65534;
                    }
                    boolean var8 = false;
                    if (class7.field105.field2667[var5] == -1 && class7.field105.field2669[var5] == -1) {
                        var6 = -1;
                        var8 = true;
                        var7 = -1;
                    }
                    if (class53.field1035 != var7 || class34.field678 != var6) {
                        int var9 = var6 - class34.field678;
                        class34.field678 = var6;
                        int var10 = var7 - class53.field1035;
                        class53.field1035 = var7;
                        if (class279.field4707 < 8 && var10 >= -32 && var10 <= 31 && var9 >= -32 && var9 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            class19.field295.method209(16711680, (class279.field4707 << 12) + (var10 << 6) + var9);
                            class279.field4707 = 0;
                        } else if (class279.field4707 < 32 && var10 >= -128 && var10 <= 127 && var9 >= -128 && var9 <= 127) {
                            class19.field295.method218(class279.field4707 + 128, -19914);
                            var10 += 128;
                            var9 += 128;
                            class19.field295.method209(16711680, (var10 << 8) + var9);
                            class279.field4707 = 0;
                        } else if (class279.field4707 >= 32) {
                            class19.field295.method209(16711680, class279.field4707 + 57344);
                            if (var8) {
                                class19.field295.method239((byte) -28, Integer.MIN_VALUE);
                            } else {
                                class19.field295.method239((byte) 93, var6 << 16 | var7);
                            }
                            class279.field4707 = 0;
                        } else {
                            class19.field295.method218(class279.field4707 + 192, -19914);
                            if (var8) {
                                class19.field295.method239((byte) 99, Integer.MIN_VALUE);
                            } else {
                                class19.field295.method239((byte) -95, var6 << 16 | var7);
                            }
                            class279.field4707 = 0;
                        }
                    } else if (class279.field4707 < 2047) {
                        class279.field4707++;
                    }
                }
                class19.field295.method233(false, class19.field295.field478 - var4);
                if (var3 >= class7.field105.field2668) {
                    class7.field105.field2668 = 0;
                } else {
                    class7.field105.field2668 -= var3;
                    for (int var11 = 0; var11 < class7.field105.field2668; var11++) {
                        class7.field105.field2669[var11] = class7.field105.field2669[var3 + var11];
                        class7.field105.field2667[var11] = class7.field105.field2667[var3 + var11];
                    }
                }
            }
        }
        if (class288.field4833 != 0) {
            class164.field2722++;
            long var13 = (class85.field1469 - class247.field4086) / 50L;
            if (var13 > 32767L) {
                var13 = 32767L;
            }
            class247.field4086 = class85.field1469;
            int var15 = class62.field1171;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            int var16 = class128.field2208;
            int var17 = (int) var13;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 65535) {
                var16 = 65535;
            }
            byte var18 = 0;
            if (class288.field4833 == 2) {
                var18 = 1;
            }
            class19.field295.method1464(136, 0);
            class19.field295.method239((byte) 109, var15 << 16 | var16);
            class19.field295.method209(16711680, var17 | var18 << 15);
        }
        if (class15.field244 > 0) {
            class15.field244--;
        }
        if (class251.field4162[96] || class251.field4162[97] || class251.field4162[98] || class251.field4162[99]) {
            class101.field1785 = true;
        }
        if (class101.field1785 && class15.field244 <= 0) {
            class15.field244 = 20;
            class101.field1785 = false;
            class101.field1769++;
            class19.field295.method1464(237, 0);
            class19.field295.method245((byte) 69, class108.field1893);
            class19.field295.method202(class298.field4977, 49);
        }
        if (class227.field3755 && !class102.field1793) {
            class233.field3816++;
            class102.field1793 = true;
            class19.field295.method1464(212, 0);
            class19.field295.method218(1, -19914);
        }
        if (!class227.field3755 && class102.field1793) {
            class102.field1793 = false;
            class233.field3816++;
            class19.field295.method1464(212, 0);
            class19.field295.method218(0, -19914);
        }
        if (!client.field4051) {
            class19.field295.method1464(165, 0);
            class94.field1703++;
            class19.field295.method200(class228.method1596(1), (byte) -118);
            client.field4051 = true;
        }
        class243.method1711(-13500);
        if (class6.field87 != 30) {
            return;
        }
        class8.method45(-1);
        class76.method564(4401);
        class48.field939++;
        if (class48.field939 > 750) {
            class280.method1957((byte) -117);
            return;
        }
        class221.method1553(27719);
        class271.method1880((byte) -31);
        class151.method1133(126);
        if (class240.field3980 != null) {
            class258.method1810(false);
        }
        for (int var19 = class279.method1952((byte) -120, true); var19 != -1; var19 = class279.method1952((byte) -113, false)) {
            class207.method1463(var19, (byte) 88);
            class303.field5077[class276.method1923(class125.field2158++, 31)] = var19;
        }
        for (class177 var20 = class3.method10(-65); var20 != null; var20 = class3.method10(-99)) {
            int var21 = var20.method1308(25154);
            int var22 = var20.method1306(40);
            if (var21 == 1) {
                class134.field2280[var22] = var20.field2908;
                class225.field3726[class276.method1923(class204.field3250++, 31)] = var22;
            } else if (var21 == 2) {
                class195.field3149[var22] = var20.field2904;
                class301.field5049[class276.method1923(31, class251.field4173++)] = var22;
            } else if (var21 == 3) {
                class213 var23 = class314.method2172((byte) 30, var22);
                if (!var20.field2904.method345(var23.field3517, false)) {
                    var23.field3517 = var20.field2904;
                    class25.method188(0, var23);
                }
            } else if (var21 == 4) {
                class213 var40 = class314.method2172((byte) 87, var22);
                int var41 = var20.field2902;
                int var42 = var20.field2908;
                if (var40.field3451 != var42 || var40.field3526 != var41) {
                    var40.field3451 = var42;
                    var40.field3526 = var41;
                    class25.method188(0, var40);
                }
            } else if (var21 == 5) {
                class213 var39 = class314.method2172((byte) 12, var22);
                if (var20.field2908 != var39.field3521 || var20.field2908 == -1) {
                    var39.field3514 = 0;
                    var39.field3443 = 0;
                    var39.field3521 = var20.field2908;
                    class25.method188(0, var39);
                }
            } else if (var21 == 6) {
                int var24 = var20.field2908;
                int var25 = (var24 & 0x7E91) >> 10;
                int var26 = (var24 & 0x3E7) >> 5;
                class213 var27 = class314.method2172((byte) -118, var22);
                int var28 = var24 & 0x1F;
                int var29 = (var25 << 19) + (var26 << 11) + (var28 << 3);
                if (var27.field3480 != var29) {
                    var27.field3480 = var29;
                    class25.method188(0, var27);
                }
            } else if (var21 == 7) {
                class213 var30 = class314.method2172((byte) -120, var22);
                boolean var31 = var20.field2908 == 1;
                if (var31 != var30.field3441) {
                    var30.field3441 = var31;
                    class25.method188(0, var30);
                }
            } else if (var21 == 8) {
                class213 var38 = class314.method2172((byte) -118, var22);
                if (var20.field2908 != var38.field3551 || var20.field2902 != var38.field3458 || var20.field2907 != var38.field3481) {
                    var38.field3481 = var20.field2907;
                    var38.field3551 = var20.field2908;
                    var38.field3458 = var20.field2902;
                    if (var38.field3438 != -1) {
                        if (var38.field3485 > 0) {
                            var38.field3481 = var38.field3481 * 32 / var38.field3485;
                        } else if (var38.field3540 > 0) {
                            var38.field3481 = var38.field3481 * 32 / var38.field3540;
                        }
                    }
                    class25.method188(0, var38);
                }
            } else if (var21 == 9) {
                class213 var32 = class314.method2172((byte) -118, var22);
                if (var20.field2908 != var32.field3438 || var20.field2902 != var32.field3418) {
                    var32.field3418 = var20.field2902;
                    var32.field3438 = var20.field2908;
                    class25.method188(0, var32);
                }
            } else if (var21 == 10) {
                class213 var37 = class314.method2172((byte) -115, var22);
                if (var20.field2908 != var37.field3493 || var20.field2902 != var37.field3468 || var20.field2907 != var37.field3536) {
                    var37.field3468 = var20.field2902;
                    var37.field3536 = var20.field2907;
                    var37.field3493 = var20.field2908;
                    class25.method188(0, var37);
                }
            } else if (var21 == 11) {
                class213 var36 = class314.method2172((byte) -122, var22);
                var36.field3554 = var36.field3555 = var20.field2902;
                var36.field3539 = 0;
                var36.field3580 = 0;
                var36.field3442 = var36.field3474 = var20.field2908;
                class25.method188(0, var36);
            } else if (var21 == 12) {
                class213 var34 = class314.method2172((byte) -125, var22);
                int var35 = var20.field2908;
                if (var34 != null && var34.field3525 == 0) {
                    if ((var34.field3437 - var34.field3565) < var35) {
                        var35 = var34.field3437 - var34.field3565;
                    }
                    if (var35 < 0) {
                        var35 = 0;
                    }
                    if (var34.field3583 != var35) {
                        var34.field3583 = var35;
                        class25.method188(0, var34);
                    }
                }
            } else if (var21 == 13) {
                class213 var33 = class314.method2172((byte) 124, var22);
                var33.field3541 = var20.field2908;
            }
        }
        if (class294.field4940 != 0) {
            class233.field3845 += 20;
            if (class233.field3845 >= 400) {
                class294.field4940 = 0;
            }
        }
        class189.field3059++;
        if (class254.field4228 != null) {
            class37.field695++;
            if (class37.field695 >= 15) {
                class25.method188(0, class254.field4228);
                class254.field4228 = null;
            }
        }
        if (class235.field3852 != null) {
            class25.method188(0, class235.field3852);
            class118.field2003++;
            if ((class173.field2824 + 5) < class48.field936 || class48.field936 < (class173.field2824 - 5) || class46.field893 > class60.field1149 + 5 || class46.field893 < class60.field1149 - 5) {
                class89.field1606 = true;
            }
            if (class244.field4030 == 0) {
                if (class89.field1606 && class118.field2003 >= 5) {
                    if (class261.field4382 == class235.field3852 && class39.field710 != class134.field2281) {
                        class285.field4801++;
                        class213 var43 = class235.field3852;
                        byte var44 = 0;
                        if (class90.field1642 == 1 && var43.field3510 == 206) {
                            var44 = 1;
                        }
                        if (var43.field3532[class134.field2281] <= 0) {
                            var44 = 0;
                        }
                        if (class173.method1275(client.method1720(var43), (byte) -113)) {
                            int var45 = class134.field2281;
                            int var46 = class39.field710;
                            var43.field3532[var45] = var43.field3532[var46];
                            var43.field3471[var45] = var43.field3471[var46];
                            var43.field3532[var46] = -1;
                            var43.field3471[var46] = 0;
                        } else if (var44 == 1) {
                            int var47 = class39.field710;
                            int var48 = class134.field2281;
                            while (var47 != var48) {
                                if (var47 > var48) {
                                    var43.method1504((byte) -110, var47, var47 - 1);
                                    var47--;
                                } else if (var48 > var47) {
                                    var43.method1504((byte) 119, var47, var47 + 1);
                                    var47++;
                                }
                            }
                        } else {
                            var43.method1504((byte) 50, class39.field710, class134.field2281);
                        }
                        class19.field295.method1464(22, 0);
                        class19.field295.method202(class39.field710, 49);
                        class19.field295.method246(var44, (byte) 43);
                        class19.field295.method200(class235.field3852.field3507, (byte) -81);
                        class19.field295.method209(16711680, class134.field2281);
                    }
                } else if ((class246.field4073 == 1 || class73.method545(class255.field4252 - 1, -126)) && class255.field4252 > 2) {
                    class308.method2107((byte) 71);
                } else if (class255.field4252 > 0) {
                    class26.method219(73);
                }
                class235.field3852 = null;
                class288.field4833 = 0;
                class37.field695 = 10;
            }
        }
        class49.field952 = false;
        class93.field1687 = null;
        class196.field3156 = 0;
        class163.field2714 = false;
        class213 var49 = class230.field3793;
        int var50 = 13 % ((-arg0 - 70) / 36);
        class230.field3793 = null;
        class213 var51 = class182.field2963;
        class182.field2963 = null;
        while (class1.method1(-74) && class196.field3156 < 128) {
            class271.field4498[class196.field3156] = class199.field3186;
            class168.field2758[class196.field3156] = class65.field1222;
            class196.field3156++;
        }
        class240.field3980 = null;
        class123.field2137 = null;
        if (class148.field2499 != -1) {
            class301.method2060(class148.field2499, 0, 0, 16492, class112.field1945, 0, class73.field1287, 0);
        }
        class60.field1152++;
        if (class123.field2137 != null) {
            class182.method1328(class252.field4185, -1654, class123.field2137, class227.field3746);
            class123.field2137 = null;
        }
        while (true) {
            class109 var52;
            class213 var53;
            class213 var54;
            do {
                var52 = (class109) class210.field3352.method1969(100);
                if (var52 == null) {
                    while (true) {
                        class109 var55;
                        class213 var56;
                        class213 var57;
                        do {
                            var55 = (class109) class148.field2498.method1969(100);
                            if (var55 == null) {
                                while (true) {
                                    class109 var58;
                                    class213 var59;
                                    class213 var60;
                                    do {
                                        var58 = (class109) class58.field1117.method1969(100);
                                        if (var58 == null) {
                                            if (class276.field4596 && class240.field3980 == null) {
                                                class276.field4596 = false;
                                            }
                                            if (class28.field596 != null) {
                                                class265.method1857(true);
                                            }
                                            if (class162.field2689 > 0 && class251.field4162[82] && class251.field4162[81] && class292.field4895 != 0) {
                                                int var61 = class160.field2671 - class292.field4895;
                                                if (var61 < 0) {
                                                    var61 = 0;
                                                } else if (var61 > 3) {
                                                    var61 = 3;
                                                }
                                                class274.method1901(class263.field4407 + class255.field4233.field1532[0], class255.field4233.field1489[0] + class196.field3152, var61, true);
                                            }
                                            if (class42.field801 != -1) {
                                                int var62 = class42.field801;
                                                int var63 = class294.field4936;
                                                if (class162.field2689 > 0 && class251.field4162[82] && class251.field4162[81]) {
                                                    class274.method1901(class263.field4407 + var63, class196.field3152 + var62, class160.field2671, true);
                                                } else if (class23.field401) {
                                                    class256.field4273++;
                                                    class19.field295.method1464(225, 0);
                                                    class19.field295.method245((byte) 69, class196.field3152 + var62);
                                                    class19.field295.method200(class83.field1440, (byte) -68);
                                                    class19.field295.method209(16711680, class263.field4407 + var63);
                                                    class19.field295.method209(16711680, class235.field3856);
                                                    class233.field3845 = 0;
                                                    class294.field4940 = 1;
                                                    class274.field4545 = class62.field1171;
                                                    class43.field814 = class128.field2208;
                                                } else {
                                                    boolean var64 = class170.method1263(class255.field4233.field1489[0], 0, true, 0, var62, var63, 0, true, 0, 0, 0, class255.field4233.field1532[0]);
                                                    if (var64) {
                                                        class274.field4545 = class62.field1171;
                                                        class233.field3845 = 0;
                                                        class43.field814 = class128.field2208;
                                                        class294.field4940 = 1;
                                                    }
                                                }
                                                class42.field801 = -1;
                                                class23.field401 = false;
                                            }
                                            class91.method701(-58);
                                            if (class230.field3793 != var49) {
                                                if (var49 != null) {
                                                    class25.method188(0, var49);
                                                }
                                                if (class230.field3793 != null) {
                                                    class25.method188(0, class230.field3793);
                                                }
                                            }
                                            if (class182.field2963 != var51 && class310.field5210 == class272.field4517) {
                                                if (var51 != null) {
                                                    class25.method188(0, var51);
                                                }
                                                if (class182.field2963 != null) {
                                                    class25.method188(0, class182.field2963);
                                                }
                                            }
                                            if (class182.field2963 == null) {
                                                if (class272.field4517 > 0) {
                                                    class272.field4517--;
                                                }
                                            } else if (class272.field4517 < class310.field5210) {
                                                class272.field4517++;
                                                if (class310.field5210 == class272.field4517) {
                                                    class25.method188(0, class182.field2963);
                                                }
                                            }
                                            if (class103.field1814 == 1) {
                                                class157.method1212((byte) -61);
                                            } else if (class103.field1814 == 2) {
                                                class6.method31(-17352);
                                            } else {
                                                class314.method2167(-127);
                                            }
                                            for (int var65 = 0; var65 < 5; var65++) {
                                                int var10002 = class83.field1442[var65]++;
                                            }
                                            int var66 = class28.method270((byte) -126);
                                            int var67 = class140.method1037(110);
                                            if (var66 > 4500 && var67 > 4500) {
                                                class85.field1473++;
                                                class90.field1638 = 250;
                                                class298.method2034(-1, 4000);
                                                class19.field295.method1464(132, 0);
                                            }
                                            if (class149.field2504 != null && class149.field2504.field1258 == 1) {
                                                if (class149.field2504.field1260 != null) {
                                                    class236.method1638(-103, class25.field444, class48.field931);
                                                }
                                                class149.field2504 = null;
                                                class48.field931 = null;
                                                class25.field444 = false;
                                            }
                                            class177.field2917++;
                                            class197.field3170++;
                                            class271.field4495++;
                                            if (class271.field4495 > 500) {
                                                int var68 = (int) (Math.random() * 8.0D);
                                                if ((var68 & 0x2) == 2) {
                                                    class25.field440 += class60.field1154;
                                                }
                                                if ((var68 & 0x4) == 4) {
                                                    class174.field2826 += class108.field1894;
                                                }
                                                class271.field4495 = 0;
                                                if ((var68 & 0x1) == 1) {
                                                    class271.field4493 += class83.field1443;
                                                }
                                            }
                                            if (class25.field440 < -55) {
                                                class60.field1154 = 2;
                                            }
                                            if (class174.field2826 < -40) {
                                                class108.field1894 = 1;
                                            }
                                            if (class174.field2826 > 40) {
                                                class108.field1894 = -1;
                                            }
                                            if (class197.field3170 > 500) {
                                                int var69 = (int) (Math.random() * 8.0D);
                                                if ((var69 & 0x1) == 1) {
                                                    class309.field5191 += class71.field1272;
                                                }
                                                if ((var69 & 0x2) == 2) {
                                                    class33.field662 += class163.field2701;
                                                }
                                                class197.field3170 = 0;
                                            }
                                            if (class271.field4493 < -50) {
                                                class83.field1443 = 2;
                                            }
                                            if (class25.field440 > 55) {
                                                class60.field1154 = -2;
                                            }
                                            if (class309.field5191 < -60) {
                                                class71.field1272 = 2;
                                            }
                                            if (class309.field5191 > 60) {
                                                class71.field1272 = -2;
                                            }
                                            if (class271.field4493 > 50) {
                                                class83.field1443 = -2;
                                            }
                                            if (class33.field662 < -20) {
                                                class163.field2701 = 1;
                                            }
                                            if (class33.field662 > 10) {
                                                class163.field2701 = -1;
                                            }
                                            if (class177.field2917 > 50) {
                                                class243.field4006++;
                                                class19.field295.method1464(190, 0);
                                            }
                                            if (class153.field2599) {
                                                class254.method1793(-91);
                                                class153.field2599 = false;
                                            }
                                            try {
                                                if (class140.field2369 != null && class19.field295.field478 > 0) {
                                                    class140.field2369.method779(class19.field295.field478, 16333, 0, class19.field295.field472);
                                                    class177.field2917 = 0;
                                                    class19.field295.field478 = 0;
                                                }
                                            } catch (IOException var71) {
                                                class280.method1957((byte) -105);
                                            }
                                            return;
                                        }
                                        var59 = var58.field1910;
                                        if (var59.field3494 < 0) {
                                            break;
                                        }
                                        var60 = class314.method2172((byte) 59, var59.field3421);
                                    } while (var60 == null || var60.field3415 == null || var60.field3415.length <= var59.field3494 || var60.field3415[var59.field3494] != var59);
                                    class121.method912(var58, 125);
                                }
                            }
                            var56 = var55.field1910;
                            if (var56.field3494 < 0) {
                                break;
                            }
                            var57 = class314.method2172((byte) -111, var56.field3421);
                        } while (var57 == null || var57.field3415 == null || var56.field3494 >= var57.field3415.length || var57.field3415[var56.field3494] != var56);
                        class121.method912(var55, -93);
                    }
                }
                var53 = var52.field1910;
                if (var53.field3494 < 0) {
                    break;
                }
                var54 = class314.method2172((byte) -110, var53.field3421);
            } while (var54 == null || var54.field3415 == null || var53.field3494 >= var54.field3415.length || var54.field3415[var53.field3494] != var53);
            class121.method912(var52, 121);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V", line = 1061)
    public static final void method582(int arg0) {
        field1318++;
        class315.method2178(-11528);
        class59.method498((byte) -55);
        class87.method673(0);
        class314.method2166(16329);
        class185.method1340(86);
        class280.method1956((byte) 92);
        class205.method1440(1891963564);
        class301.method2053((byte) 62);
        int var1 = -4 / ((arg0 - 40) / 33);
        class249.method1757((byte) -104);
        class312.method2155((byte) 54);
        client.method1722(-62);
        class101.method767((byte) -54);
        class17.method100((byte) -110);
        class221.method1550(1);
        if (!class21.field350) {
            ((class212) class203.field3217).method1496((byte) -30);
        }
        class199.field3181.method985(61);
        class140.field2368.method1678((byte) -82);
        class5.field61.method1678((byte) -82);
        client.field4057.method1678((byte) -82);
        class156.field2612.method1678((byte) -82);
        class172.field2807.method1678((byte) -82);
        class199.field3189.method1678((byte) -82);
        class85.field1472.method1678((byte) -82);
        class120.field2030.method1678((byte) -82);
        class212.field3400.method1678((byte) -82);
        class274.field4562.method1678((byte) -82);
        class186.field3005.method1678((byte) -82);
        class293.field4905.method1349(true);
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)V", line = 1109)
    public static void method583(int arg0) {
        field1323 = null;
        field1324 = null;
        field1328 = null;
        field1331 = null;
        field1320 = null;
        if (arg0 != -12886) {
            method579(107, false);
        }
        field1316 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lrb;BII)V", line = 1135)
    public static final void method584(class213 arg0, byte arg1, int arg2, int arg3) {
        field1322++;
        if (class28.field596 != null || class27.field518 || arg0 == null || class218.method1525(arg0, (byte) 17) == null) {
            return;
        }
        class28.field596 = arg0;
        class6.field89 = class218.method1525(arg0, (byte) 17);
        class19.field313 = arg2;
        class285.field4808 = false;
        class293.field4930 = 0;
        if (arg1 < 94) {
            field1320 = (int[]) null;
        }
        class225.field3722 = arg3;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lcm;ILrb;IIII)V", line = 1159)
    public static final void method585(class185 arg0, int arg1, class213 arg2, int arg3, int arg4, int arg5, int arg6) {
        field1327++;
        if (arg0 == null) {
            return;
        }
        int var7 = class309.field5191 + class108.field1893 & 0x7FF;
        int var8 = arg5 * arg5 + arg6 * arg6;
        int var9 = Math.max(arg2.field3502 / 2, arg2.field3565 / 2) + 10;
        if (var9 * var9 < var8) {
            return;
        }
        int var10 = class203.field3208[var7];
        int var11 = class203.field3216[var7];
        int var12 = var11 * 256 / (class33.field662 + 256);
        if (arg1 != 65534) {
            method584((class213) null, (byte) -88, 88, 124);
        }
        int var13 = var10 * 256 / (class33.field662 + 256);
        int var14 = arg5 * var12 - (arg6 * var13) >> 16;
        int var15 = arg5 * var13 + arg6 * var12 >> 16;
        if (class21.field350) {
            ((class100) arg0).method756(arg2.field3502 / 2 + arg4 + var15 - (arg0.field2971 / 2), arg2.field3565 / 2 + arg3 + -(arg0.field2980 / 2) + -var14, (class100) arg2.method1505(false, 21730));
        } else {
            ((class99) arg0).method752(arg2.field3502 / 2 + arg4 + var15 - (arg0.field2971 / 2), -var14 + arg3 - -(arg2.field3565 / 2) + -(arg0.field2980 / 2), arg2.field3572, arg2.field3425);
        }
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(III)V", line = 1195)
    public class78(int arg0, int arg1, int arg2) {
        this.field1321 = arg0;
        this.field1325 = arg1;
        this.field1317 = arg2;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IBI)V")
    public abstract void method3(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(III)V")
    public abstract void method2(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(III)V")
    public abstract void method5(int arg0, int arg1, int arg2);
}
