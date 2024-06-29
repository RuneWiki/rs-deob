import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class95 extends class108 implements class200 {

    @OriginalMember(owner = "client!me", name = "n", descriptor = "Lpp;")
    public static class464 field1662;

    @OriginalMember(owner = "client!me", name = "y", descriptor = "C")
    public char field1673;

    @OriginalMember(owner = "client!me", name = "k", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!me", name = "l", descriptor = "I")
    public int field1660;

    @OriginalMember(owner = "client!me", name = "m", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!me", name = "o", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!me", name = "p", descriptor = "I")
    public int field1664;

    @OriginalMember(owner = "client!me", name = "q", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!me", name = "r", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!me", name = "s", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!me", name = "t", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!me", name = "u", descriptor = "I")
    public int field1669;

    @OriginalMember(owner = "client!me", name = "v", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!me", name = "x", descriptor = "I")
    public static int field1672;

    @OriginalMember(owner = "client!me", name = "z", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!me", name = "A", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!me", name = "w", descriptor = "J")
    public long field1671;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(II)V")
    public static final void method829(int arg0, int arg1) {
        if (arg1 == -13125) {
            field1670++;
            class21 var2 = class601.method3413(arg0, 6, (byte) 98);
            var2.method227(true);
        }
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(B)V")
    public static final void method830(byte arg0) {
        field1665++;
        if (class189.field2717 > 1) {
            class189.field2717--;
            class410.field6095 = class498.field6986;
        }
        if (class554.field7835) {
            class554.field7835 = false;
            class587.method3365(114);
            return;
        }
        if (!class2.field20) {
            class167.method1161(13361);
        }
        for (int var1 = 0; var1 < 100 && class369.method2230(-32666); var1++) {
        }
        if (arg0 != -122) {
            field1675 = -46;
        }
        if (class64.field893 != 9) {
            return;
        }
        class277.method1788(class127.field2088, class314.field4585.method2707(110), -939);
        if (class547.field7610 == null) {
            if (class307.field4421 <= class508.method2860(false)) {
                class547.field7610 = class294.field4251.method2057(class352.field5017.field3411, 1);
            }
        } else if (class547.field7610.field3286 != -1) {
            class624.method3537(-87, class121.field1943);
            class127.field2088.method1699(true, class547.field7610.field3286);
            class547.field7610 = null;
            class307.field4421 = class508.method2860(false) + 30000L;
        }
        class7 var2 = (class7) class360.field5112.method427(true);
        if (var2 != null || class639.field9273 < (class508.method2860(false) - 2000L)) {
            boolean var3 = false;
            int var4 = class127.field2088.field3913;
            for (class7 var5 = (class7) class19.field286.method427(true); var5 != null && (class127.field2088.field3913 - var4) < 240; var5 = (class7) class19.field286.method420(false)) {
                var5.method911(arg0 ^ 0x4A);
                int var6 = var5.method26(true);
                if (var6 < -1) {
                    var6 = -1;
                } else if (var6 > 65534) {
                    var6 = 65534;
                }
                int var7 = var5.method27(false);
                if (var7 < -1) {
                    var7 = -1;
                } else if (var7 > 65534) {
                    var7 = 65534;
                }
                if (class162.field2403 != var7 || class626.field8827 != var6) {
                    if (!var3) {
                        class322.field4657++;
                        class624.method3537(-92, class637.field9247);
                        class127.field2088.method1710(0, 114);
                        var4 = class127.field2088.field3913;
                        var3 = true;
                    }
                    int var8 = var7 - class162.field2403;
                    class162.field2403 = var7;
                    int var9 = var6 - class626.field8827;
                    class626.field8827 = var6;
                    int var10 = (int) ((var5.method24(-6) - class639.field9273) / 20L);
                    if (var10 < 8 && var8 >= -32 && var8 <= 31 && var9 >= -32 && var9 <= 31) {
                        var9 += 32;
                        var8 += 32;
                        class127.field2088.method1699(true, (var10 << 12) + (var8 << 6) + var9);
                    } else if (var10 < 32 && var8 >= -128 && var8 <= 127 && var9 >= -128 && var9 <= 127) {
                        var9 += 128;
                        var8 += 128;
                        class127.field2088.method1710(var10 + 128, arg0 ^ 0xFFFFFFA1);
                        class127.field2088.method1699(true, (var8 << 8) + var9);
                    } else if (var10 < 32) {
                        class127.field2088.method1710(var10 + 192, 39);
                        if (var7 == 1 || var6 == -1) {
                            class127.field2088.method1702(Integer.MIN_VALUE, false);
                        } else {
                            class127.field2088.method1702(var6 << 16 | var7, false);
                        }
                    } else {
                        class127.field2088.method1699(true, var10 + 57344);
                        if (var7 == 1 || var6 == -1) {
                            class127.field2088.method1702(Integer.MIN_VALUE, false);
                        } else {
                            class127.field2088.method1702(var6 << 16 | var7, false);
                        }
                    }
                    class639.field9273 = var5.method24(arg0 ^ 0x7C);
                }
            }
            if (var3) {
                class127.field2088.method1688(class127.field2088.field3913 - var4, arg0 ^ 0x2B);
            }
        }
        if (var2 != null) {
            long var11 = (var2.method24(-6) - class88.field1596) / 50L;
            class88.field1596 = var2.method24(-6);
            if (var11 > 32767L) {
                var11 = 32767L;
            }
            int var13 = var2.method26(true);
            if (var13 < 0) {
                var13 = 0;
            } else if (var13 > 65535) {
                var13 = 65535;
            }
            int var14 = var2.method27(false);
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            byte var15 = 0;
            if (var2.method25(26999) == 2) {
                var15 = 1;
            }
            class624.method3537(-122, class406.field6035);
            class57.field809++;
            int var16 = (int) var11;
            class127.field2088.method1699(true, var16 | var15 << 15);
            class127.field2088.method1739(false, var13 << 16 | var14);
        }
        if (class529.field7356 > 0) {
            class54.field772++;
            class624.method3537(-117, class574.field8176);
            class127.field2088.method1710(class529.field7356 * 3, arg0 + 197);
            for (int var17 = 0; var17 < class529.field7356; var17++) {
                class200 var18 = class442.field6469[var17];
                long var19 = (var18.method834(arg0 ^ 0xFFFFB42C) - class565.field8086) / 50L;
                if (var19 > 65535L) {
                    var19 = 65535L;
                }
                class565.field8086 = var18.method834(19370);
                class127.field2088.method1710(var18.method835((byte) -21), 121);
                class127.field2088.method1699(true, (int) var19);
            }
        }
        if (class220.field3311 > 0) {
            class220.field3311--;
        }
        if (class521.field7236 && class220.field3311 <= 0) {
            class133.field2136++;
            class220.field3311 = 20;
            class521.field7236 = false;
            class624.method3537(-127, class206.field2898);
            class127.field2088.method1747((int) class181.field2622 >> 3, -29356);
            class127.field2088.method1699(true, (int) class523.field7256 >> 3);
        }
        if (class497.field6973 && !class539.field7513) {
            class539.field7513 = true;
            class319.field4625++;
            class624.method3537(arg0 - 3, class408.field6060);
            class127.field2088.method1710(1, 45);
        }
        if (!class497.field6973 && class539.field7513) {
            class539.field7513 = false;
            class319.field4625++;
            class624.method3537(-124, class408.field6060);
            class127.field2088.method1710(0, 24);
        }
        if (!class434.field6378) {
            class624.method3537(-125, class533.field7441);
            class249.field3625++;
            class127.field2088.method1710(0, 44);
            int var21 = class127.field2088.field3913;
            class268 var22 = new class268(class305.method1899(112));
            class202.field2854.method3141(var22, 6419);
            class127.field2088.method1725(0, var22.field3913, (byte) -12, var22.field3952);
            class127.field2088.method1688(class127.field2088.field3913 - var21, arg0 + -6);
            class434.field6378 = true;
        }
        if (class277.field4051 != null) {
            if (class377.field5547 == 2) {
                class286.method1817(arg0 + 189);
            } else if (class377.field5547 == 3) {
                class421.method2531((byte) -66);
            }
        }
        if (class307.field4425) {
            class307.field4425 = false;
        } else {
            class563.field8074 /= 2.0F;
        }
        if (class549.field7791) {
            class549.field7791 = false;
        } else {
            class367.field5199 /= 2.0F;
        }
        class459.method2686(false);
        if (class64.field893 != 9) {
            return;
        }
        class561.method3194(true);
        class265.method1679((byte) 77);
        class17.method199(3);
        class419.method2521((byte) 83);
        class464.field6699++;
        if (class464.field6699 > 750) {
            class587.method3365(68);
            return;
        }
        class378.method2293(0);
        class417.method2514(121);
        class290.method1834(0);
        for (int var23 = class401.field6001.method3553(true, -1); var23 != -1; var23 = class401.field6001.method3553(false, -1)) {
            class117.method970(var23, -25876);
            class388.field5796[class424.method2540(31, class495.field6939++)] = var23;
        }
        for (class21 var24 = class395.method2398(arg0 - 431); var24 != null; var24 = class395.method2398(-553)) {
            int var25 = var24.method224(109);
            int var26 = var24.method228(false);
            if (var25 == 1) {
                class310.field4551[var26] = var24.field308;
                class2.field14 |= class459.field6618[var26];
                class440.field6422[class424.method2540(class141.field2198++, 31)] = var26;
            } else if (var25 == 2) {
                class340.field4893[var26] = var24.field299;
                class300.field4339[class424.method2540(class287.field4179++, 31)] = var26;
            } else if (var25 == 3) {
                class549 var48 = class495.method2822((byte) -118, var26);
                if (!var24.field299.equals(var48.field7718)) {
                    var48.field7718 = var24.field299;
                    class412.method2497(var48, arg0 ^ 0xFFFFFFE7);
                }
            } else if (var25 == 4) {
                class549 var44 = class495.method2822((byte) -120, var26);
                int var45 = var24.field308;
                int var46 = var24.field302;
                int var47 = var24.field304;
                if (var44.field7763 != var45 || var44.field7649 != var46 || var44.field7696 != var47) {
                    var44.field7649 = var46;
                    var44.field7763 = var45;
                    var44.field7696 = var47;
                    class412.method2497(var44, arg0 ^ 0xFFFFFFF1);
                }
            } else if (var25 == 5) {
                class549 var27 = class495.method2822((byte) -104, var26);
                if (var24.field308 != var27.field7705 || var24.field308 == -1) {
                    var27.field7712 = 0;
                    var27.field7705 = var24.field308;
                    var27.field7632 = 1;
                    var27.field7664 = 0;
                    class412.method2497(var27, 100);
                }
            } else if (var25 == 6) {
                int var28 = var24.field308;
                int var29 = (var28 & 0x7F8F) >> 10;
                int var30 = (var28 & 0x3EC) >> 5;
                int var31 = var28 & 0x1F;
                int var32 = (var31 << 3) + (var29 << 19) + (var30 << 11);
                class549 var33 = class495.method2822((byte) -124, var26);
                if (var33.field7775 != var32) {
                    var33.field7775 = var32;
                    class412.method2497(var33, 85);
                }
            } else if (var25 == 7) {
                class549 var34 = class495.method2822((byte) -101, var26);
                boolean var35 = var24.field308 == 1;
                if (var34.field7677 != var35) {
                    var34.field7677 = var35;
                    class412.method2497(var34, 97);
                }
            } else if (var25 == 8) {
                class549 var36 = class495.method2822((byte) -114, var26);
                if (var24.field308 != var36.field7781 || var24.field302 != var36.field7660 || var24.field304 != var36.field7716) {
                    var36.field7660 = var24.field302;
                    var36.field7716 = var24.field304;
                    var36.field7781 = var24.field308;
                    if (var36.field7703 != -1) {
                        if (var36.field7669 > 0) {
                            var36.field7716 = var36.field7716 * 32 / var36.field7669;
                        } else if (var36.field7683 > 0) {
                            var36.field7716 = var36.field7716 * 32 / var36.field7683;
                        }
                    }
                    class412.method2497(var36, 79);
                }
            } else if (var25 == 9) {
                class549 var37 = class495.method2822((byte) -101, var26);
                if (var24.field308 != var37.field7703 || var24.field302 != var37.field7740) {
                    var37.field7703 = var24.field308;
                    var37.field7740 = var24.field302;
                    class412.method2497(var37, arg0 + 201);
                }
            } else if (var25 == 10) {
                class549 var43 = class495.method2822((byte) -126, var26);
                if (var24.field308 != var43.field7792 || var24.field302 != var43.field7758 || var24.field304 != var43.field7744) {
                    var43.field7744 = var24.field304;
                    var43.field7792 = var24.field308;
                    var43.field7758 = var24.field302;
                    class412.method2497(var43, 106);
                }
            } else if (var25 == 11) {
                class549 var42 = class495.method2822((byte) -105, var26);
                var42.field7628 = 0;
                var42.field7631 = var42.field7765 = var24.field308;
                var42.field7720 = 0;
                var42.field7687 = var42.field7670 = var24.field302;
                class412.method2497(var42, 118);
            } else if (var25 == 12) {
                class549 var38 = class495.method2822((byte) -120, var26);
                int var39 = var24.field308;
                if (var38 != null && var38.field7749 == 0) {
                    if (var39 > (var38.field7750 - var38.field7776)) {
                        var39 = var38.field7750 - var38.field7776;
                    }
                    if (var39 < 0) {
                        var39 = 0;
                    }
                    if (var38.field7643 != var39) {
                        var38.field7643 = var39;
                        class412.method2497(var38, 126);
                    }
                }
            } else if (var25 == 14) {
                class549 var40 = class495.method2822((byte) -124, var26);
                var40.field7689 = var24.field308;
            } else if (var25 == 15) {
                class624.field8810 = true;
                class439.field6391 = var24.field302;
                class476.field6810 = var24.field308;
            } else if (var25 == 16) {
                class549 var41 = class495.method2822((byte) -128, var26);
                var41.field7727 = var24.field308;
            }
        }
        class303.field4378++;
        if (class295.field4257 != 0) {
            class313.field4571 += 20;
            if (class313.field4571 >= 400) {
                class295.field4257 = 0;
            }
        }
        if (class261.field3805 != null) {
            class557.field7875++;
            if (class557.field7875 >= 15) {
                class412.method2497(class261.field3805, 101);
                class261.field3805 = null;
            }
        }
        class604.field8590 = false;
        class276.field4034 = null;
        class640.field9283 = false;
        class558.field7915 = null;
        class319.method1957(-1, arg0 + 250, -1, null);
        class125.method992(-1, -1, (byte) 8, null);
        if (!class90.field1620) {
            class185.field2692 = -1;
        }
        class184.method1238(true);
        class498.field6986++;
        if (class156.field2351) {
            class624.method3537(-118, class143.field2220);
            class179.field2603++;
            class127.field2088.method1739(false, class527.field7337 << 14 | class336.field4812 << 28 | class202.field2853);
            class156.field2351 = false;
        }
        while (true) {
            class526 var49;
            class549 var50;
            class549 var51;
            do {
                var49 = (class526) class332.field4772.method417((byte) 51);
                if (var49 == null) {
                    while (true) {
                        class526 var52;
                        class549 var53;
                        class549 var54;
                        do {
                            var52 = (class526) class477.field6816.method417((byte) 51);
                            if (var52 == null) {
                                while (true) {
                                    class526 var55;
                                    class549 var56;
                                    class549 var57;
                                    do {
                                        var55 = (class526) class307.field4417.method417((byte) 51);
                                        if (var55 == null) {
                                            if (class276.field4034 == null) {
                                                class551.field7807 = 0;
                                            }
                                            if (class311.field4557 != null) {
                                                class115.method942(true);
                                            }
                                            if (class602.field8571 > 0 && class404.field6022.method2183(82, false) && class404.field6022.method2183(81, false) && class85.field1564 != 0) {
                                                int var58 = class644.field9367.field5116 - class85.field1564;
                                                if (var58 < 0) {
                                                    var58 = 0;
                                                } else if (var58 > 3) {
                                                    var58 = 3;
                                                }
                                                class32.method295(class644.field9367.field1571[0] + class382.field5687, var58, false, class644.field9367.field1572[0] + class597.field8500);
                                            }
                                            class117.method972(true);
                                            for (int var59 = 0; var59 < 5; var59++) {
                                                int var10002 = class112.field1861[var59]++;
                                            }
                                            if (class2.field14 && class437.field6385 < class508.method2860(false) - 60000L) {
                                                class433.method2583(6428);
                                            }
                                            for (class81 var60 = (class81) class8.field76.method944(-126); var60 != null; var60 = (class81) class8.field76.method947((byte) -53)) {
                                                if ((long) var60.field1443 < class508.method2860(false) / 1000L - 5L) {
                                                    if (var60.field1439 > 0) {
                                                        class175.method1205("", 0, 5, var60.field1442 + class366.field5189.method3220(false, class538.field7500), -1, "");
                                                    }
                                                    if (var60.field1439 == 0) {
                                                        class175.method1205("", 0, 5, var60.field1442 + class232.field3418.method3220(false, class538.field7500), arg0 ^ 0x79, "");
                                                    }
                                                    var60.method2753(arg0 + 122);
                                                }
                                            }
                                            class264.field3843++;
                                            if (class264.field3843 > 500) {
                                                class264.field3843 = 0;
                                                int var61 = (int) (Math.random() * 8.0D);
                                                if ((var61 & 0x1) == 1) {
                                                    class539.field7514 += class492.field6914;
                                                }
                                                if ((var61 & 0x2) == 2) {
                                                    class409.field6075 += class305.field4401;
                                                }
                                                if ((var61 & 0x4) == 4) {
                                                    class105.field1760 += class530.field7361;
                                                }
                                            }
                                            if (class539.field7514 < -50) {
                                                class492.field6914 = 2;
                                            }
                                            if (class409.field6075 < -55) {
                                                class305.field4401 = 2;
                                            }
                                            if (class539.field7514 > 50) {
                                                class492.field6914 = -2;
                                            }
                                            if (class105.field1760 < -40) {
                                                class530.field7361 = 1;
                                            }
                                            if (class409.field6075 > 55) {
                                                class305.field4401 = -2;
                                            }
                                            if (class105.field1760 > 40) {
                                                class530.field7361 = -1;
                                            }
                                            class298.field4323++;
                                            if (class298.field4323 > 500) {
                                                class298.field4323 = 0;
                                                int var62 = (int) (Math.random() * 8.0D);
                                                if ((var62 & 0x1) == 1) {
                                                    class495.field6941 += class106.field1769;
                                                }
                                                if ((var62 & 0x2) == 2) {
                                                    class353.field5042 += class305.field4393;
                                                }
                                            }
                                            if (class495.field6941 < -60) {
                                                class106.field1769 = 2;
                                            }
                                            if (class353.field5042 < -20) {
                                                class305.field4393 = 1;
                                            }
                                            if (class495.field6941 > 60) {
                                                class106.field1769 = -2;
                                            }
                                            if (class353.field5042 > 10) {
                                                class305.field4393 = -1;
                                            }
                                            class259.field3775++;
                                            if (class259.field3775 > 50) {
                                                class257.field3733++;
                                                class624.method3537(-83, class195.field2799);
                                            }
                                            if (class595.field8469) {
                                                class74.method713(-32);
                                                class595.field8469 = false;
                                            }
                                            try {
                                                if (client.field8770 != null && class127.field2088.field3913 > 0) {
                                                    class339.field4857 += class127.field2088.field3913;
                                                    client.field8770.method2733(3, class127.field2088.field3913, 0, class127.field2088.field3952);
                                                    class127.field2088.field3913 = 0;
                                                    class259.field3775 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var63) {
                                                class587.method3365(37);
                                                return;
                                            }
                                        }
                                        var56 = var55.field7315;
                                        if (var56.field7761 < 0) {
                                            break;
                                        }
                                        var57 = class495.method2822((byte) -125, var56.field7637);
                                    } while (var57 == null || var57.field7684 == null || var56.field7761 >= var57.field7684.length || var57.field7684[var56.field7761] != var56);
                                    class30.method277(var55);
                                }
                            }
                            var53 = var52.field7315;
                            if (var53.field7761 < 0) {
                                break;
                            }
                            var54 = class495.method2822((byte) -125, var53.field7637);
                        } while (var54 == null || var54.field7684 == null || var53.field7761 >= var54.field7684.length || var54.field7684[var53.field7761] != var53);
                        class30.method277(var52);
                    }
                }
                var50 = var49.field7315;
                if (var50.field7761 < 0) {
                    break;
                }
                var51 = class495.method2822((byte) -106, var50.field7637);
            } while (var51 == null || var51.field7684 == null || var51.field7684.length <= var50.field7761 || var51.field7684[var50.field7761] != var50);
            class30.method277(var49);
        }
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(II)Lfa;")
    public static final class482 method831(int arg0, int arg1) {
        field1666++;
        if (arg0 == 0) {
            if ((double) class212.field3102 == 3.0D) {
                return class496.field6956;
            }
            if ((double) class212.field3102 == 4.0D) {
                return class205.field2887;
            }
            if ((double) class212.field3102 == 6.0D) {
                return class471.field6773;
            }
            if ((double) class212.field3102 >= 8.0D) {
                return class333.field4786;
            }
        } else if (arg0 == 1) {
            if ((double) class212.field3102 == 3.0D) {
                return class471.field6773;
            }
            if ((double) class212.field3102 == 4.0D) {
                return class333.field4786;
            }
            if ((double) class212.field3102 == 6.0D) {
                return class270.field3977;
            }
            if ((double) class212.field3102 >= 8.0D) {
                return class512.field7091;
            }
        } else if (arg0 == 2) {
            if ((double) class212.field3102 == 3.0D) {
                return class270.field3977;
            }
            if ((double) class212.field3102 == 4.0D) {
                return class512.field7091;
            }
            if ((double) class212.field3102 == 6.0D) {
                return class318.field4620;
            }
            if ((double) class212.field3102 >= 8.0D) {
                return class340.field4888;
            }
        }
        int var2 = 83 / ((arg1 - 67) / 59);
        return null;
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)I")
    public final int method832(int arg0) {
        if (arg0 != -2472) {
            field1675 = -98;
        }
        field1674++;
        return this.field1660;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lgp;IBI)Lbea;")
    public static final class644 method833(class561 arg0, int arg1, byte arg2, int arg3) {
        field1659++;
        class268 var4 = new class268(arg0.method3175(arg1, (byte) -53, arg3));
        class644 var5 = new class644(arg1, var4.method1752(false), var4.method1752(false), var4.method1748(115), var4.method1748(90), var4.method1738(255) == 1, var4.method1738(255), var4.method1738(arg2 ^ 0xFFFFFF4D));
        int var6 = var4.method1738(arg2 ^ 0xFFFFFF4D);
        if (arg2 != -78) {
            method836(null, (byte) 13);
        }
        for (int var7 = 0; var7 < var6; var7++) {
            var5.field9370.method414(new class383(var4.method1738(255), var4.method1745(32132), var4.method1745(32132), var4.method1745(32132), var4.method1745(arg2 + 32210), var4.method1745(32132), var4.method1745(32132), var4.method1745(arg2 ^ 0xFFFF8236), var4.method1745(32132)), (byte) 44);
        }
        var5.method3709(arg2 ^ 0xFFFFCDB2);
        return var5;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)J")
    public final long method834(int arg0) {
        if (arg0 != 19370) {
            method830((byte) 97);
        }
        field1672++;
        return this.field1671;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(B)I")
    public final int method835(byte arg0) {
        if (arg0 != -21) {
            this.field1664 = -38;
        }
        field1661++;
        return this.field1669;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lhn;B)V")
    public static final void method836(class85 arg0, byte arg1) {
        field1663++;
        arg0.field1546 = 0;
        if (arg0.field1531 != -1) {
            class439 var2 = class49.field739.method2297((byte) 113, arg0.field1531);
            if (var2 == null || var2.field6416 == null) {
                arg0.field1531 = -1;
                arg0.field1489 = false;
            } else {
                label403: {
                    arg0.field1471++;
                    if (var2.field6416.length > arg0.field1477 && var2.field6413[arg0.field1477] < arg0.field1471) {
                        arg0.field1471 = 1;
                        arg0.field1477++;
                        arg0.field1505++;
                        class402.method2456(class644.field9367 == arg0, arg0.field5109, arg0.field1477, var2, (byte) -23, arg0.field5108, arg0.field5116);
                    }
                    if (arg0.field1477 >= var2.field6416.length) {
                        arg0.field1471 = 0;
                        arg0.field1477 = 0;
                        if (arg0.field1489) {
                            arg0.field1531 = arg0.method772(0).method1866(-1);
                            if (arg0.field1531 == -1) {
                                arg0.field1489 = false;
                                break label403;
                            }
                            var2 = class49.field739.method2297((byte) 111, arg0.field1531);
                        }
                        class402.method2456(class644.field9367 == arg0, arg0.field5109, arg0.field1477, var2, (byte) -23, arg0.field5108, arg0.field5116);
                    }
                    arg0.field1505 = arg0.field1477 + 1;
                    if (var2.field6416.length <= arg0.field1505) {
                        arg0.field1505 = 0;
                    }
                }
            }
        }
        if (arg0.field1487 != -1 && arg0.field1481 <= class310.field4553) {
            class347 var3 = class522.field7247.method2489(30, arg0.field1487);
            int var4 = var3.field4961;
            if (var4 == -1) {
                arg0.field1487 = -1;
            } else {
                label405: {
                    class439 var5 = class49.field739.method2297((byte) 122, var4);
                    if (var3.field4975) {
                        if (var5.field6409 == 3) {
                            if (arg0.field1576 > 0 && arg0.field1527 <= class310.field4553 && class310.field4553 > arg0.field1524) {
                                arg0.field1487 = -1;
                                break label405;
                            }
                        } else if (var5.field6409 == 1 && arg0.field1576 > 0 && class310.field4553 >= arg0.field1527 && arg0.field1524 < class310.field4553) {
                            arg0.field1481 = class310.field4553 + 1;
                            break label405;
                        }
                    }
                    if (var5 == null || var5.field6416 == null) {
                        arg0.field1487 = -1;
                    } else {
                        if (arg0.field1553 < 0) {
                            arg0.field1553 = 0;
                            class402.method2456(class644.field9367 == arg0, arg0.field5109, 0, var5, (byte) -23, arg0.field5108, arg0.field5116);
                        }
                        arg0.field1494++;
                        if (var5.field6416.length > arg0.field1553 && var5.field6413[arg0.field1553] < arg0.field1494) {
                            arg0.field1553++;
                            arg0.field1494 = 1;
                            class402.method2456(class644.field9367 == arg0, arg0.field5109, arg0.field1553, var5, (byte) -23, arg0.field5108, arg0.field5116);
                        }
                        if (var5.field6416.length <= arg0.field1553) {
                            if (var3.field4975) {
                                arg0.field1553 -= var5.field6402;
                                arg0.field1495++;
                                if (arg0.field1495 >= var5.field6393) {
                                    arg0.field1487 = -1;
                                } else if (arg0.field1553 >= 0 && var5.field6416.length > arg0.field1553) {
                                    class402.method2456(class644.field9367 == arg0, arg0.field5109, arg0.field1553, var5, (byte) -23, arg0.field5108, arg0.field5116);
                                } else {
                                    arg0.field1487 = -1;
                                }
                            } else {
                                arg0.field1487 = -1;
                            }
                        }
                        arg0.field1533 = arg0.field1553 + 1;
                        if (var5.field6416.length <= arg0.field1533) {
                            if (var3.field4975) {
                                arg0.field1533 -= var5.field6402;
                                if (var5.field6393 <= (arg0.field1495 + 1)) {
                                    arg0.field1533 = -1;
                                } else if (arg0.field1533 < 0 || var5.field6416.length <= arg0.field1533) {
                                    arg0.field1533 = -1;
                                }
                            } else {
                                arg0.field1533 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg0.field1520 != -1 && arg0.field1510 <= class310.field4553) {
            class347 var6 = class522.field7247.method2489(30, arg0.field1520);
            int var7 = var6.field4961;
            if (var7 == -1) {
                arg0.field1520 = -1;
            } else {
                label408: {
                    class439 var8 = class49.field739.method2297((byte) 108, var7);
                    if (var6.field4975) {
                        if (var8.field6409 == 3) {
                            if (arg0.field1576 > 0 && arg0.field1527 <= class310.field4553 && class310.field4553 > arg0.field1524) {
                                arg0.field1520 = -1;
                                break label408;
                            }
                        } else if (var8.field6409 == 1 && arg0.field1576 > 0 && class310.field4553 >= arg0.field1527 && arg0.field1524 < class310.field4553) {
                            arg0.field1510 = class310.field4553 + 1;
                            break label408;
                        }
                    }
                    if (var8 == null || var8.field6416 == null) {
                        arg0.field1520 = -1;
                    } else {
                        if (arg0.field1535 < 0) {
                            arg0.field1535 = 0;
                            class402.method2456(class644.field9367 == arg0, arg0.field5109, 0, var8, (byte) -23, arg0.field5108, arg0.field5116);
                        }
                        arg0.field1513++;
                        if (arg0.field1535 < var8.field6416.length && var8.field6413[arg0.field1535] < arg0.field1513) {
                            arg0.field1513 = 1;
                            arg0.field1535++;
                            class402.method2456(class644.field9367 == arg0, arg0.field5109, arg0.field1535, var8, (byte) -23, arg0.field5108, arg0.field5116);
                        }
                        if (var8.field6416.length <= arg0.field1535) {
                            if (var6.field4975) {
                                arg0.field1492++;
                                arg0.field1535 -= var8.field6402;
                                if (var8.field6393 <= arg0.field1492) {
                                    arg0.field1520 = -1;
                                } else if (arg0.field1535 >= 0 && var8.field6416.length > arg0.field1535) {
                                    class402.method2456(class644.field9367 == arg0, arg0.field5109, arg0.field1535, var8, (byte) -23, arg0.field5108, arg0.field5116);
                                } else {
                                    arg0.field1520 = -1;
                                }
                            } else {
                                arg0.field1520 = -1;
                            }
                        }
                        arg0.field1561 = arg0.field1535 + 1;
                        if (arg0.field1561 >= var8.field6416.length) {
                            if (var6.field4975) {
                                arg0.field1561 -= var8.field6402;
                                if (var8.field6393 <= arg0.field1492 + 1) {
                                    arg0.field1561 = -1;
                                } else if (arg0.field1561 < 0 || var8.field6416.length <= arg0.field1561) {
                                    arg0.field1561 = -1;
                                }
                            } else {
                                arg0.field1561 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1 > -44) {
            return;
        }
        if (arg0.field1514 != -1 && arg0.field1519 <= 1) {
            class439 var9 = class49.field739.method2297((byte) 113, arg0.field1514);
            if (var9.field6409 == 3) {
                if (arg0.field1576 > 0 && class310.field4553 >= arg0.field1527 && class310.field4553 > arg0.field1524) {
                    arg0.field1514 = -1;
                }
            } else if (var9.field6409 == 1 && arg0.field1576 > 0 && class310.field4553 >= arg0.field1527 && class310.field4553 > arg0.field1524) {
                arg0.field1519 = 2;
            }
        }
        if (arg0.field1514 != -1 && arg0.field1519 == 0) {
            class439 var10 = class49.field739.method2297((byte) 126, arg0.field1514);
            if (var10 == null || var10.field6416 == null) {
                arg0.field1514 = -1;
            } else {
                arg0.field1506++;
                if (var10.field6416.length > arg0.field1511 && arg0.field1506 > var10.field6413[arg0.field1511]) {
                    arg0.field1511++;
                    arg0.field1506 = 1;
                    class402.method2456(class644.field9367 == arg0, arg0.field5109, arg0.field1511, var10, (byte) -23, arg0.field5108, arg0.field5116);
                }
                if (arg0.field1511 >= var10.field6416.length) {
                    arg0.field1511 -= var10.field6402;
                    arg0.field1488++;
                    if (var10.field6393 <= arg0.field1488) {
                        arg0.field1514 = -1;
                    } else if (arg0.field1511 >= 0 && arg0.field1511 < var10.field6416.length) {
                        class402.method2456(class644.field9367 == arg0, arg0.field5109, arg0.field1511, var10, (byte) -23, arg0.field5108, arg0.field5116);
                    } else {
                        arg0.field1514 = -1;
                    }
                }
                arg0.field1537 = arg0.field1511 + 1;
                if (arg0.field1537 >= var10.field6416.length) {
                    arg0.field1537 -= var10.field6402;
                    if ((arg0.field1488 + 1) >= var10.field6393) {
                        arg0.field1537 = -1;
                    } else if (arg0.field1537 < 0 || var10.field6416.length <= arg0.field1537) {
                        arg0.field1537 = -1;
                    }
                }
                arg0.field1546 = var10.field6404;
            }
        }
        if (arg0.field1519 > 0) {
            arg0.field1519--;
        }
        for (int var11 = 0; var11 < arg0.field1504.length; var11++) {
            class527 var12 = arg0.field1504[var11];
            if (var12 != null) {
                if (var12.field7327 > 0) {
                    var12.field7327--;
                } else {
                    class439 var13 = class49.field739.method2297((byte) 125, var12.field7335);
                    if (var13 == null || var13.field6416 == null) {
                        arg0.field1504[var11] = null;
                    } else {
                        var12.field7331++;
                        if (var12.field7330 < var13.field6416.length && var13.field6413[var12.field7330] < var12.field7331) {
                            var12.field7331 = 1;
                            var12.field7330++;
                            class402.method2456(class644.field9367 == arg0, arg0.field5109, var12.field7330, var13, (byte) -23, arg0.field5108, arg0.field5116);
                        }
                        if (var12.field7330 >= var13.field6416.length) {
                            var12.field7328++;
                            var12.field7330 -= var13.field6402;
                            if (var12.field7328 >= var13.field6393) {
                                arg0.field1504[var11] = null;
                            } else if (var12.field7330 >= 0 && var12.field7330 < var13.field6416.length) {
                                class402.method2456(class644.field9367 == arg0, arg0.field5109, var12.field7330, var13, (byte) -23, arg0.field5108, arg0.field5116);
                            } else {
                                arg0.field1504[var11] = null;
                            }
                        }
                        var12.field7332 = var12.field7330 + 1;
                        if (var12.field7332 >= var13.field6416.length) {
                            var12.field7332 -= var13.field6402;
                            if (var12.field7328 + 1 >= var13.field6393) {
                                var12.field7332 = -1;
                            } else if (var12.field7332 < 0 || var13.field6416.length <= var12.field7332) {
                                var12.field7332 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Z)C")
    public final char method837(boolean arg0) {
        field1668++;
        if (arg0) {
            this.field1660 = 16;
        }
        return this.field1673;
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(B)V")
    public static void method838(byte arg0) {
        field1662 = null;
        if (arg0 != 36) {
            field1662 = null;
        }
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(I)I")
    public final int method839(int arg0) {
        field1667++;
        return arg0 == -3641 ? this.field1664 : -24;
    }

    static {
        new class567("Use", "Benutzen", "Utiliser", "Usar");
        field1662 = new class464(80, 4);
    }
}
