import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class267 {

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
    public int field4650;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
    public static int field4651;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "I")
    public static int field4654;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "Lug;")
    public class208 field4653;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "[I")
    public int[] field4652;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IZ)I")
    public static final int method1831(int arg0, boolean arg1) {
        field4654++;
        class218 var2 = class33.method241(77, arg0);
        int var3 = var2.field3734;
        int var4 = var2.field3731;
        if (arg1) {
            int var5 = var2.field3738;
            int var6 = class19.field307[var5 - var4];
            return var6 & class54.field937[var3] >> var4;
        } else {
            return 90;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)V")
    public static final void method1832(byte arg0) {
        field4651++;
        if (class217.field3728 > 1) {
            class181.field3131 = class67.field1137;
            class217.field3728--;
        }
        if (class148.field2617 > 0) {
            class148.field2617--;
        }
        if (class10.field174) {
            class10.field174 = false;
            class260.method1798(7);
            return;
        }
        for (int var1 = 0; var1 < 100 && class163.method1183(false); var1++) {
        }
        if (class101.field1729 != 30) {
            return;
        }
        class130.method986(class140.field2505, 125, (byte) 68);
        Object var2 = class15.field229.field411;
        synchronized (class15.field229.field411) {
            if (!class51.field886) {
                class15.field229.field412 = 0;
            } else if (class272.field4734 != 0 || class15.field229.field412 >= 40) {
                class206.field3536++;
                class140.field2505.method1012((byte) -119, 92);
                int var3 = 0;
                class140.field2505.method1652(0, (byte) 41);
                int var4 = class140.field2505.field4124;
                for (int var5 = 0; var5 < class15.field229.field412 && (class140.field2505.field4124 - var4) < 240; var5++) {
                    var3++;
                    int var6 = class15.field229.field416[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    int var7 = class15.field229.field414[var5];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 65534) {
                        var7 = 65534;
                    }
                    boolean var8 = false;
                    if (class15.field229.field414[var5] == -1 && class15.field229.field416[var5] == -1) {
                        var8 = true;
                        var7 = -1;
                        var6 = -1;
                    }
                    if (class124.field2302 != var6 || class209.field3604 != var7) {
                        int var9 = var6 - class124.field2302;
                        class124.field2302 = var6;
                        int var10 = var7 - class209.field3604;
                        class209.field3604 = var7;
                        if (class185.field3217 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var10 += 32;
                            var9 += 32;
                            class140.field2505.method1632(true, (var9 << 6) + (class185.field3217 << 12) + var10);
                            class185.field3217 = 0;
                        } else if (class185.field3217 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                            class140.field2505.method1652(class185.field3217 + 128, (byte) 41);
                            var9 += 128;
                            var10 += 128;
                            class140.field2505.method1632(true, (var9 << 8) + var10);
                            class185.field3217 = 0;
                        } else if (class185.field3217 < 32) {
                            class140.field2505.method1652(class185.field3217 + 192, (byte) 41);
                            if (var8) {
                                class140.field2505.method1625((byte) 87, Integer.MIN_VALUE);
                            } else {
                                class140.field2505.method1625((byte) 49, var7 << 16 | var6);
                            }
                            class185.field3217 = 0;
                        } else {
                            class140.field2505.method1632(true, class185.field3217 + 57344);
                            if (var8) {
                                class140.field2505.method1625((byte) -95, Integer.MIN_VALUE);
                            } else {
                                class140.field2505.method1625((byte) -110, var6 | var7 << 16);
                            }
                            class185.field3217 = 0;
                        }
                    } else if (class185.field3217 < 2047) {
                        class185.field3217++;
                    }
                }
                class140.field2505.method1665(class140.field2505.field4124 - var4, -92);
                if (class15.field229.field412 > var3) {
                    class15.field229.field412 -= var3;
                    for (int var11 = 0; var11 < class15.field229.field412; var11++) {
                        class15.field229.field416[var11] = class15.field229.field416[var3 + var11];
                        class15.field229.field414[var11] = class15.field229.field414[var11 + var3];
                    }
                } else {
                    class15.field229.field412 = 0;
                }
            }
        }
        if (class272.field4734 != 0) {
            long var12 = (class121.field2241 - class169.field2966) / 50L;
            class149.field2629++;
            class169.field2966 = class121.field2241;
            if (var12 > 32767L) {
                var12 = 32767L;
            }
            int var14 = class167.field2950;
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            int var15 = class272.field4722;
            byte var16 = 0;
            if (class272.field4734 == 2) {
                var16 = 1;
            }
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            int var17 = (int) var12;
            class140.field2505.method1012((byte) -125, 4);
            class140.field2505.method1625((byte) -126, var15 << 16 | var14);
            class140.field2505.method1639(-124, var17 | var16 << 15);
        }
        if (class117.field2176 > 0) {
            class117.field2176--;
        }
        if (class233.field3990[96] || class233.field3990[97] || class233.field3990[98] || class233.field3990[99]) {
            class140.field2503 = true;
        }
        if (class140.field2503 && class117.field2176 <= 0) {
            class140.field2503 = false;
            class117.field2176 = 20;
            class245.field4246++;
            class140.field2505.method1012((byte) 65, 138);
            class140.field2505.method1639(-90, class235.field4033);
            class140.field2505.method1675(class117.field2170, -103);
        }
        if (class37.field635 && !class181.field3130) {
            client.field1979++;
            class181.field3130 = true;
            class140.field2505.method1012((byte) -12, 77);
            class140.field2505.method1652(1, (byte) 41);
        }
        if (!class37.field635 && class181.field3130) {
            class181.field3130 = false;
            class140.field2505.method1012((byte) -123, 77);
            client.field1979++;
            class140.field2505.method1652(0, (byte) 41);
        }
        if (!class169.field2977) {
            class140.field2505.method1012((byte) -119, 245);
            class245.field4258++;
            class140.field2505.method1642(class235.method1591(17934), 255);
            class169.field2977 = true;
        }
        class200.method1395(false);
        if (class101.field1729 != 30) {
            return;
        }
        class152.method1115(true);
        class85.method616(-16594);
        class87.field1463++;
        if (class87.field1463 > 750) {
            class260.method1798(7);
            return;
        }
        class236.method1608(-33);
        class79.method561((byte) -104);
        class4.method54(-1);
        if (class203.field3523 != null) {
            class76.method549(126);
        }
        for (int var18 = class106.method791((byte) 31, true); var18 != -1; var18 = class106.method791((byte) 31, false)) {
            class235.method1593((byte) -3, var18);
            class243.field4212[class130.method985(class210.field3617++, 31)] = var18;
        }
        for (class43 var19 = class273.method1856(120); var19 != null; var19 = class273.method1856(124)) {
            int var20 = var19.method332(1703976672);
            int var21 = var19.method338(115);
            if (var20 == 1) {
                class21.field348[var21] = var19.field740;
                class73.field1253[class130.method985(31, class4.field81++)] = var21;
            } else if (var20 == 2) {
                class41.field699[var21] = var19.field745;
                class15.field230[class130.method985(31, class33.field566++)] = var21;
            } else if (var20 == 3) {
                class107 var41 = class55.method408(var21, 251234864);
                if (!var19.field745.method705(0, var41.field1918)) {
                    var41.field1918 = var19.field745;
                    class53.method403(-112, var41);
                }
            } else if (var20 == 4) {
                class107 var22 = class55.method408(var21, 251234864);
                int var23 = var19.field740;
                int var24 = var19.field732;
                if (var22.field1947 != var23 || var22.field1847 != var24) {
                    var22.field1947 = var23;
                    var22.field1847 = var24;
                    class53.method403(-74, var22);
                }
            } else if (var20 == 5) {
                class107 var40 = class55.method408(var21, 251234864);
                if (var19.field740 != var40.field1888 || var19.field740 == -1) {
                    var40.field1888 = var19.field740;
                    var40.field1952 = 0;
                    var40.field1910 = 0;
                    class53.method403(-117, var40);
                }
            } else if (var20 == 6) {
                int var34 = var19.field740;
                int var35 = var34 >> 10 & 0x1F;
                int var36 = (var34 & 0x3FF) >> 5;
                int var37 = var34 & 0x1F;
                int var38 = (var35 << 19) + (var36 << 11) + (var37 << 3);
                class107 var39 = class55.method408(var21, 251234864);
                if (var39.field1848 != var38) {
                    var39.field1848 = var38;
                    class53.method403(-63, var39);
                }
            } else if (var20 == 7) {
                class107 var25 = class55.method408(var21, 251234864);
                boolean var26 = var19.field740 == 1;
                if (var26 != var25.field1911) {
                    var25.field1911 = var26;
                    class53.method403(-118, var25);
                }
            } else if (var20 == 8) {
                class107 var33 = class55.method408(var21, 251234864);
                if (var19.field740 != var33.field1969 || var19.field732 != var33.field1840 || var19.field734 != var33.field1904) {
                    var33.field1904 = var19.field734;
                    var33.field1840 = var19.field732;
                    var33.field1969 = var19.field740;
                    if (var33.field1863 != -1) {
                        if (var33.field1830 > 0) {
                            var33.field1904 = var33.field1904 * 32 / var33.field1830;
                        } else if (var33.field1899 > 0) {
                            var33.field1904 = var33.field1904 * 32 / var33.field1899;
                        }
                    }
                    class53.method403(-87, var33);
                }
            } else if (var20 == 9) {
                class107 var27 = class55.method408(var21, 251234864);
                if (var19.field740 != var27.field1863 || var19.field732 != var27.field1924) {
                    var27.field1924 = var19.field732;
                    var27.field1863 = var19.field740;
                    class53.method403(-88, var27);
                }
            } else if (var20 == 10) {
                class107 var28 = class55.method408(var21, 251234864);
                if (var19.field740 != var28.field1972 || var19.field732 != var28.field1886 || var19.field734 != var28.field1822) {
                    var28.field1822 = var19.field734;
                    var28.field1886 = var19.field732;
                    var28.field1972 = var19.field740;
                    class53.method403(-114, var28);
                }
            } else if (var20 == 11) {
                class107 var29 = class55.method408(var21, 251234864);
                var29.field1962 = 0;
                var29.field1810 = 0;
                var29.field1942 = var29.field1852 = var19.field740;
                var29.field1945 = var29.field1903 = var19.field732;
                class53.method403(-121, var29);
            } else if (var20 == 12) {
                class107 var31 = class55.method408(var21, 251234864);
                int var32 = var19.field740;
                if (var31 != null && var31.field1833 == 0) {
                    if (var32 > (var31.field1850 - var31.field1919)) {
                        var32 = var31.field1850 - var31.field1919;
                    }
                    if (var32 < 0) {
                        var32 = 0;
                    }
                    if (var31.field1934 != var32) {
                        var31.field1934 = var32;
                        class53.method403(-90, var31);
                    }
                }
            } else if (var20 == 13) {
                class107 var30 = class55.method408(var21, 251234864);
                var30.field1936 = var19.field740;
            }
        }
        class62.field1063++;
        if (class170.field2980 != 0) {
            class60.field1031 += 20;
            if (class60.field1031 >= 400) {
                class170.field2980 = 0;
            }
        }
        if (class169.field2968 != null) {
            class193.field3334++;
            if (class193.field3334 >= 15) {
                class53.method403(-124, class169.field2968);
                class169.field2968 = null;
            }
        }
        if (class48.field847 != null) {
            class53.method403(-83, class48.field847);
            if (class17.field244 > (class249.field4312 + 5) || class249.field4312 - 5 > class17.field244 || class214.field3684 > (class205.field3528 + 5) || class214.field3684 < class205.field3528 - 5) {
                class82.field1388 = true;
            }
            class115.field2142++;
            if (class40.field692 == 0) {
                if (class82.field1388 && class115.field2142 >= 5) {
                    if (class48.field847 == class193.field3329 && class193.field3330 != class139.field2482) {
                        class32.field514++;
                        class107 var42 = class48.field847;
                        byte var43 = 0;
                        if (class122.field2268 == 1 && var42.field1869 == 206) {
                            var43 = 1;
                        }
                        if (var42.field1873[class193.field3330] <= 0) {
                            var43 = 0;
                        }
                        if (class132.method997(-1, client.method817(var42))) {
                            int var44 = class139.field2482;
                            int var45 = class193.field3330;
                            var42.field1873[var45] = var42.field1873[var44];
                            var42.field1949[var45] = var42.field1949[var44];
                            var42.field1873[var44] = -1;
                            var42.field1949[var44] = 0;
                        } else if (var43 == 1) {
                            int var46 = class193.field3330;
                            int var47 = class139.field2482;
                            while (var46 != var47) {
                                if (var47 > var46) {
                                    var42.method801(var47 - 1, var47, 24959);
                                    var47--;
                                } else if (var46 > var47) {
                                    var42.method801(var47 + 1, var47, 24959);
                                    var47++;
                                }
                            }
                        } else {
                            var42.method801(class193.field3330, class139.field2482, 24959);
                        }
                        class140.field2505.method1012((byte) -20, 141);
                        class140.field2505.method1652(var43, (byte) 41);
                        class140.field2505.method1639(-108, class139.field2482);
                        class140.field2505.method1675(class193.field3330, -110);
                        class140.field2505.method1642(class48.field847.field1896, 255);
                    }
                } else if ((class244.field4239 == 1 || class246.method1727(class73.field1254 - 1, false)) && class73.field1254 > 2) {
                    class73.method529((byte) -107);
                } else if (class73.field1254 > 0) {
                    class180.method1275(97);
                }
                class193.field3334 = 10;
                class48.field847 = null;
                class272.field4734 = 0;
            }
        }
        class269.field4695 = false;
        class121.field2240 = 0;
        class20.field322 = false;
        class239.field4161 = null;
        class107 var48 = class92.field1528;
        class92.field1528 = null;
        class107 var49 = class143.field2538;
        class143.field2538 = null;
        while (class127.method970(-80) && class121.field2240 < 128) {
            class206.field3539[class121.field2240] = class1.field9;
            class234.field4006[class121.field2240] = class145.field2579;
            class121.field2240++;
        }
        class203.field3523 = null;
        class213.field3673 = null;
        if (class107.field1825 != -1) {
            class90.method640(0, class107.field1825, class168.field2954, 0, class232.field3979, 5415, 0, 0);
        }
        class67.field1137++;
        if (class213.field3673 != null) {
            class277.method1881(class213.field3673, class110.field2039, class203.field3509, (byte) 127);
            class213.field3673 = null;
        }
        while (true) {
            class116 var50;
            class107 var51;
            class107 var52;
            do {
                var50 = (class116) class210.field3616.method1815(9);
                if (var50 == null) {
                    while (true) {
                        class116 var53;
                        class107 var54;
                        class107 var55;
                        do {
                            var53 = (class116) class269.field4684.method1815(9);
                            if (var53 == null) {
                                while (true) {
                                    class116 var56;
                                    class107 var57;
                                    class107 var58;
                                    do {
                                        var56 = (class116) class47.field830.method1815(9);
                                        if (var56 == null) {
                                            if (class32.field503 && class203.field3523 == null) {
                                                class32.field503 = false;
                                            }
                                            if (class90.field1494 != null) {
                                                class55.method409(-1);
                                            }
                                            if (arg0 >= -90) {
                                                return;
                                            }
                                            if (class254.field4389 > 0 && class233.field3990[82] && class233.field3990[81] && class208.field3587 != 0) {
                                                int var59 = class216.field3712 - class208.field3587;
                                                if (var59 < 0) {
                                                    var59 = 0;
                                                } else if (var59 > 3) {
                                                    var59 = 3;
                                                }
                                                class213.method1480(class236.field4047.field4528[0] + class196.field3383, class236.field4047.field4566[0] + class225.field3832, -5, var59);
                                            }
                                            if (class5.field102 != -1) {
                                                int var60 = class150.field2638;
                                                int var61 = class5.field102;
                                                if (class254.field4389 > 0 && class233.field3990[82] && class233.field3990[81]) {
                                                    class213.method1480(class196.field3383 + var61, class225.field3832 + var60, -5, class216.field3712);
                                                } else if (class244.field4238) {
                                                    class52.field905++;
                                                    class140.field2505.method1012((byte) 18, 187);
                                                    class140.field2505.method1632(true, class196.field3383 + var61);
                                                    class140.field2505.method1629(32767, class225.field3832 + var60);
                                                    class140.field2505.method1631(class133.field2382, (byte) 27);
                                                    class140.field2505.method1632(true, class48.field851);
                                                    class186.field3255 = class167.field2950;
                                                    class215.field3704 = class272.field4722;
                                                    class170.field2980 = 1;
                                                    class60.field1031 = 0;
                                                } else {
                                                    boolean var62 = class2.method12(0, class236.field4047.field4566[0], var60, (byte) -73, 0, true, 0, class236.field4047.field4528[0], 0, 0, 0, var61);
                                                    if (var62) {
                                                        class60.field1031 = 0;
                                                        class215.field3704 = class272.field4722;
                                                        class170.field2980 = 1;
                                                        class186.field3255 = class167.field2950;
                                                    }
                                                }
                                                class5.field102 = -1;
                                                class244.field4238 = false;
                                            }
                                            class51.method393(1);
                                            if (class92.field1528 != var48) {
                                                if (var48 != null) {
                                                    class53.method403(-94, var48);
                                                }
                                                if (class92.field1528 != null) {
                                                    class53.method403(-123, class92.field1528);
                                                }
                                            }
                                            if (class143.field2538 != var49 && class270.field4699 == class236.field4057) {
                                                if (var49 != null) {
                                                    class53.method403(-104, var49);
                                                }
                                                if (class143.field2538 != null) {
                                                    class53.method403(-72, class143.field2538);
                                                }
                                            }
                                            if (class143.field2538 == null) {
                                                if (class270.field4699 > 0) {
                                                    class270.field4699--;
                                                }
                                            } else if (class236.field4057 > class270.field4699) {
                                                class270.field4699++;
                                                if (class270.field4699 == class236.field4057) {
                                                    class53.method403(-120, class143.field2538);
                                                }
                                            }
                                            if (class179.field3095 == 1) {
                                                class171.method1222(17687);
                                            } else if (class179.field3095 == 2) {
                                                class179.method1272(66);
                                            } else {
                                                class253.method1761(100);
                                            }
                                            for (int var63 = 0; var63 < 5; var63++) {
                                                int var10002 = class25.field426[var63]++;
                                            }
                                            int var64 = class237.method1611(80);
                                            int var65 = class212.method1472(7);
                                            if (var64 > 4500 && var65 > 4500) {
                                                class148.field2617 = 250;
                                                class42.field720++;
                                                class34.method260(4000, -4);
                                                class140.field2505.method1012((byte) 114, 115);
                                            }
                                            if (class236.field4038 != null && class236.field4038.field4605 == 1) {
                                                if (class236.field4038.field4604 != null) {
                                                    class76.method552(class22.field385, (byte) -101, class122.field2247);
                                                }
                                                class236.field4038 = null;
                                                class22.field385 = false;
                                                class122.field2247 = null;
                                            }
                                            class53.field930++;
                                            class200.field3479++;
                                            if (class53.field930 > 500) {
                                                class53.field930 = 0;
                                                int var66 = (int) (Math.random() * 8.0D);
                                                if ((var66 & 0x2) == 2) {
                                                    class14.field218 += class39.field674;
                                                }
                                                if ((var66 & 0x1) == 1) {
                                                    class52.field920 += class221.field3769;
                                                }
                                                if ((var66 & 0x4) == 4) {
                                                    class277.field4832 += class68.field1180;
                                                }
                                            }
                                            if (class277.field4832 < -40) {
                                                class68.field1180 = 1;
                                            }
                                            if (class14.field218 < -55) {
                                                class39.field674 = 2;
                                            }
                                            class147.field2611++;
                                            if (class52.field920 < -50) {
                                                class221.field3769 = 2;
                                            }
                                            if (class277.field4832 > 40) {
                                                class68.field1180 = -1;
                                            }
                                            if (class200.field3479 > 500) {
                                                class200.field3479 = 0;
                                                int var67 = (int) (Math.random() * 8.0D);
                                                if ((var67 & 0x1) == 1) {
                                                    class21.field343 += class31.field498;
                                                }
                                                if ((var67 & 0x2) == 2) {
                                                    class222.field3800 += class92.field1527;
                                                }
                                            }
                                            if (class52.field920 > 50) {
                                                class221.field3769 = -2;
                                            }
                                            if (class222.field3800 < -20) {
                                                class92.field1527 = 1;
                                            }
                                            if (class21.field343 < -60) {
                                                class31.field498 = 2;
                                            }
                                            if (class14.field218 > 55) {
                                                class39.field674 = -2;
                                            }
                                            if (class222.field3800 > 10) {
                                                class92.field1527 = -1;
                                            }
                                            if (class21.field343 > 60) {
                                                class31.field498 = -2;
                                            }
                                            if (class147.field2611 > 50) {
                                                class121.field2235++;
                                                class140.field2505.method1012((byte) -123, 119);
                                            }
                                            if (class171.field2994) {
                                                class153.method1120((byte) -114);
                                                class171.field2994 = false;
                                            }
                                            try {
                                                if (class211.field3638 != null && class140.field2505.field4124 > 0) {
                                                    class211.field3638.method1599(true, class140.field2505.field4124, class140.field2505.field4144, 0);
                                                    class147.field2611 = 0;
                                                    class140.field2505.field4124 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var68) {
                                                class260.method1798(7);
                                                return;
                                            }
                                        }
                                        var57 = var56.field2158;
                                        if (var57.field1974 < 0) {
                                            break;
                                        }
                                        var58 = class55.method408(var57.field1827, 251234864);
                                    } while (var58 == null || var58.field1842 == null || var58.field1842.length <= var57.field1974 || var58.field1842[var57.field1974] != var57);
                                    class141.method1044(var56, (byte) 76);
                                }
                            }
                            var54 = var53.field2158;
                            if (var54.field1974 < 0) {
                                break;
                            }
                            var55 = class55.method408(var54.field1827, 251234864);
                        } while (var55 == null || var55.field1842 == null || var55.field1842.length <= var54.field1974 || var55.field1842[var54.field1974] != var54);
                        class141.method1044(var53, (byte) 76);
                    }
                }
                var51 = var50.field2158;
                if (var51.field1974 < 0) {
                    break;
                }
                var52 = class55.method408(var51.field1827, 251234864);
            } while (var52 == null || var52.field1842 == null || var52.field1842.length <= var51.field1974 || var52.field1842[var51.field1974] != var51);
            class141.method1044(var50, (byte) 76);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(III)V")
    public static final void method1833(int arg0, int arg1, int arg2) {
        class269.field4679 = true;
        class206.field3534 = arg0;
        class265.field4626 = arg1;
        class62.field1054 = arg2;
        class5.field102 = -1;
        class150.field2638 = -1;
    }
}
