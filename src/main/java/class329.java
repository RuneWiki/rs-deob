import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class329 {

    @OriginalMember(owner = "client!km", name = "b", descriptor = "Z")
    public static boolean field5618 = false;

    @OriginalMember(owner = "client!km", name = "f", descriptor = "Lsf;")
    private static class108 field5622 = class140.method973(255, " more options");

    @OriginalMember(owner = "client!km", name = "k", descriptor = "[I")
    public static int[] field5627 = new int[25];

    @OriginalMember(owner = "client!km", name = "j", descriptor = "Lsf;")
    public static class108 field5626 = field5622;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "I")
    public static int field5617;

    @OriginalMember(owner = "client!km", name = "c", descriptor = "I")
    public static int field5619;

    @OriginalMember(owner = "client!km", name = "d", descriptor = "I")
    public static int field5620;

    @OriginalMember(owner = "client!km", name = "e", descriptor = "I")
    public static int field5621;

    @OriginalMember(owner = "client!km", name = "g", descriptor = "I")
    public static int field5623;

    @OriginalMember(owner = "client!km", name = "i", descriptor = "I")
    public static int field5625;

    @OriginalMember(owner = "client!km", name = "h", descriptor = "Ljava/lang/String;")
    public static String field5624;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ZLrm;)V", line = 6)
    public static final void method2252(boolean arg0, class249 arg1) {
        field5620++;
        if (!arg0) {
            field5624 = (String) null;
        }
        while (true) {
            while (arg1.field4314 < arg1.field4338.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg1.method1731(true) == 1) {
                    var2 = true;
                    var3 = arg1.method1731(true);
                    var4 = arg1.method1731(arg0);
                }
                int var5 = arg1.method1731(arg0);
                int var6 = arg1.method1731(arg0);
                int var7 = var5 * 64 - class144.field2546;
                int var8 = class152.field2757 + class83.field1288 - var6 * 64 - 1;
                if (var7 >= 0 && (var8 - 63) >= 0 && var7 + 63 < class74.field1113 && var8 < class152.field2757) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || (var3 * 8) <= var11 && var11 < (var3 * 8 + 8) && var12 >= var4 * 8 && var12 < var4 * 8 + 8) {
                                byte var13 = arg1.method1721((byte) 61);
                                if (var13 != 0) {
                                    if (class183.field3360[var9][var10] == null) {
                                        class183.field3360[var9][var10] = new byte[4096];
                                    }
                                    class183.field3360[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg1.method1721((byte) 84);
                                    if (class5.field69[var9][var10] == null) {
                                        class5.field69[var9][var10] = new byte[4096];
                                    }
                                    class5.field69[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                        byte var16 = arg1.method1721((byte) 86);
                        if (var16 != 0) {
                            arg1.field4314++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ILik;)V", line = 105)
    public static final void method2253(int arg0, class262 arg1) {
        field5621++;
        if (class140.field2463) {
            return;
        }
        if (class231.field4051) {
            class50.method344();
        } else {
            class28.method187();
        }
        class296.field5168 = class6.method37((byte) 35, class328.field5604, arg1);
        if (arg0 < 92) {
            return;
        }
        int var2 = class21.field331;
        int var3 = var2 * 956 / 503;
        class296.field5168.method72((class73.field1110 - var3) / 2, 0, var3, var2);
        class105.field1814 = class105.method719(class170.field3047, true, arg1);
        class105.field1814.method404(class73.field1110 / 2 - class105.field1814.field889 / 2, 18);
        class140.field2463 = true;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(III)I", line = 133)
    public static final int method2254(int arg0, int arg1, int arg2) {
        class117 var3 = (class117) class98.field1620.method1676((long) arg2, (byte) -67);
        field5625++;
        int var4 = -33 % ((29 - arg0) / 54);
        if (var3 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var3.field2036.length) {
            return var3.field2036[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(B)V", line = 158)
    public static void method2255(byte arg0) {
        if (arg0 != -124) {
            method2257((Object[]) null, -57, 118, 21, (long[]) null);
        }
        field5627 = null;
        field5624 = null;
        field5626 = null;
        field5622 = null;
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(B)V", line = 184)
    public static final void method2256(byte arg0) {
        field5623++;
        if (class156.field2805 > 1) {
            class94.field1510 = class242.field4217;
            class156.field2805--;
        }
        if (class16.field205 > 0) {
            class16.field205--;
        }
        if (class68.field1056) {
            class68.field1056 = false;
            class54.method377((byte) 94);
            return;
        }
        for (int var1 = 0; var1 < 100 && class176.method1243((byte) 60); var1++) {
        }
        if (class203.field3658 != 30) {
            return;
        }
        class212.method1464(class256.field4471, 13, 72);
        Object var2 = class218.field3881.field5109;
        synchronized (class218.field3881.field5109) {
            if (!class47.field691) {
                class218.field3881.field5116 = 0;
            } else if (class331.field5645 != 0 || class218.field3881.field5116 >= 40) {
                class256.field4471.method1427(65, 0);
                class256.field4471.method1759(-32768, 0);
                int var3 = class256.field4471.field4314;
                int var4 = 0;
                class47.field704++;
                for (int var5 = 0; var5 < class218.field3881.field5116 && (class256.field4471.field4314 - var3) < 240; var5++) {
                    var4++;
                    int var6 = class218.field3881.field5115[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    int var7 = class218.field3881.field5117[var5];
                    boolean var8 = false;
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 65534) {
                        var7 = 65534;
                    }
                    if (class218.field3881.field5115[var5] == -1 && class218.field3881.field5117[var5] == -1) {
                        var6 = -1;
                        var7 = -1;
                        var8 = true;
                    }
                    if (class168.field3019 != var7 || class137.field2417 != var6) {
                        int var9 = var7 - class168.field3019;
                        class168.field3019 = var7;
                        int var10 = var6 - class137.field2417;
                        class137.field2417 = var6;
                        if (class47.field696 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            class256.field4471.method1724(false, (class47.field696 << 12) - (-(var9 << 6) - var10));
                            class47.field696 = 0;
                        } else if (class47.field696 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                            class256.field4471.method1759(-32768, class47.field696 + 128);
                            var9 += 128;
                            var10 += 128;
                            class256.field4471.method1724(false, (var9 << 8) + var10);
                            class47.field696 = 0;
                        } else if (class47.field696 >= 32) {
                            class256.field4471.method1724(false, class47.field696 + 57344);
                            if (var8) {
                                class256.field4471.method1741(Integer.MIN_VALUE, -1580277072);
                            } else {
                                class256.field4471.method1741(var6 << 16 | var7, -1580277072);
                            }
                            class47.field696 = 0;
                        } else {
                            class256.field4471.method1759(-32768, class47.field696 + 192);
                            if (var8) {
                                class256.field4471.method1741(Integer.MIN_VALUE, -1580277072);
                            } else {
                                class256.field4471.method1741(var7 | var6 << 16, -1580277072);
                            }
                            class47.field696 = 0;
                        }
                    } else if (class47.field696 < 2047) {
                        class47.field696++;
                    }
                }
                class256.field4471.method1766(0, class256.field4471.field4314 - var3);
                if (var4 < class218.field3881.field5116) {
                    class218.field3881.field5116 -= var4;
                    for (int var11 = 0; var11 < class218.field3881.field5116; var11++) {
                        class218.field3881.field5117[var11] = class218.field3881.field5117[var4 + var11];
                        class218.field3881.field5115[var11] = class218.field3881.field5115[var11 + var4];
                    }
                } else {
                    class218.field3881.field5116 = 0;
                }
            }
        }
        if (class331.field5645 != 0) {
            class84.field1311++;
            int var13 = class87.field1382;
            long var14 = (class100.field1771 - class256.field4528) / 50L;
            if (var13 < 0) {
                var13 = 0;
            } else if (var13 > 65535) {
                var13 = 65535;
            }
            class256.field4528 = class100.field1771;
            int var16 = class170.field3041;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 65535) {
                var16 = 65535;
            }
            byte var17 = 0;
            if (var14 > 32767L) {
                var14 = 32767L;
            }
            if (class331.field5645 == 2) {
                var17 = 1;
            }
            class256.field4471.method1427(19, 0);
            int var18 = (int) var14;
            class256.field4471.method1707(var13 | var16 << 16, 255);
            class256.field4471.method1724(false, var18 | var17 << 15);
        }
        if (class83.field1304 > 0) {
            class83.field1304--;
        }
        if (class282.field4939) {
            for (int var19 = 0; var19 < class137.field2429; var19++) {
                int var20 = class197.field3562[var19];
                if (var20 == 98 || var20 == 99 || var20 == 96 || var20 == 97) {
                    class273.field4802 = true;
                    break;
                }
            }
        } else if (class144.field2529[96] || class144.field2529[97] || class144.field2529[98] || class144.field2529[99]) {
            class273.field4802 = true;
        }
        if (class273.field4802 && class83.field1304 <= 0) {
            class273.field4802 = false;
            class52.field766++;
            class83.field1304 = 20;
            class256.field4471.method1427(3, 0);
            class256.field4471.method1754(class186.field3423, 108);
            class256.field4471.method1761(-103, class176.field3207);
        }
        if (class47.field699 && !class259.field4573) {
            class274.field4815++;
            class259.field4573 = true;
            class256.field4471.method1427(244, 0);
            class256.field4471.method1759(-32768, 1);
        }
        if (!class47.field699 && class259.field4573) {
            class259.field4573 = false;
            class274.field4815++;
            class256.field4471.method1427(244, 0);
            class256.field4471.method1759(-32768, 0);
        }
        if (!class99.field1758) {
            class256.field4471.method1427(94, 0);
            class256.field4471.method1765(class100.method695(71), 0);
            class174.field3182++;
            class99.field1758 = true;
        }
        class126.method865(0);
        if (class203.field3658 != 30) {
            return;
        }
        if (arg0 >= -116) {
            field5624 = (String) null;
        }
        class177.method1252(-123);
        class265.method1918(-18506);
        class290.field5069++;
        if (class290.field5069 > 750) {
            class54.method377((byte) 48);
            return;
        }
        class10.method55((byte) 53);
        class180.method1305(27725);
        class22.method152((byte) -63);
        if (class316.field5444 != null) {
            class242.method1682((byte) 62);
        }
        for (int var21 = class203.method1436(true, (byte) 32); var21 != -1; var21 = class203.method1436(false, (byte) 32)) {
            class330.method2258(var21, -123);
            class278.field4875[class162.method1118(class326.field5551++, 31)] = var21;
        }
        for (class120 var22 = class42.method280(116); var22 != null; var22 = class42.method280(60)) {
            int var23 = var22.method842(-52);
            int var24 = var22.method841(true);
            if (var23 == 1) {
                class151.field2740[var24] = var22.field2066;
                class78.field1183[class162.method1118(31, class88.field1390++)] = var24;
            } else if (var23 == 2) {
                class283.field4958[var24] = var22.field2063;
                class210.field3748[class162.method1118(31, class174.field3177++)] = var24;
            } else if (var23 == 3) {
                class98 var44 = class168.method1173(var24, -1456948048);
                if (!var22.field2063.method779(var44.field1604, 73)) {
                    var44.field1604 = var22.field2063;
                    class195.method1388(-82, var44);
                }
            } else if (var23 == 4) {
                class98 var25 = class168.method1173(var24, -1456948048);
                int var26 = var22.field2066;
                int var27 = var22.field2067;
                if (var25.field1577 != var26 || var25.field1664 != var27) {
                    var25.field1577 = var26;
                    var25.field1664 = var27;
                    class195.method1388(-82, var25);
                }
            } else if (var23 == 5) {
                class98 var28 = class168.method1173(var24, -1456948048);
                if (var22.field2066 != var28.field1580 || var22.field2066 == -1) {
                    var28.field1713 = 0;
                    var28.field1675 = 0;
                    var28.field1580 = var22.field2066;
                    class195.method1388(-82, var28);
                }
            } else if (var23 == 6) {
                int var29 = var22.field2066;
                int var30 = (var29 & 0x7E10) >> 10;
                int var31 = var29 & 0x1F;
                int var32 = (var29 & 0x3EB) >> 5;
                int var33 = (var30 << 19) + (var32 << 11) + (var31 << 3);
                class98 var34 = class168.method1173(var24, -1456948048);
                if (var34.field1573 != var33) {
                    var34.field1573 = var33;
                    class195.method1388(-82, var34);
                }
            } else if (var23 == 7) {
                class98 var42 = class168.method1173(var24, -1456948048);
                boolean var43 = var22.field2066 == 1;
                if (var43 != var42.field1595) {
                    var42.field1595 = var43;
                    class195.method1388(-82, var42);
                }
            } else if (var23 == 8) {
                class98 var41 = class168.method1173(var24, -1456948048);
                if (var22.field2066 != var41.field1672 || var22.field2067 != var41.field1708 || var22.field2055 != var41.field1712) {
                    var41.field1708 = var22.field2067;
                    var41.field1672 = var22.field2066;
                    var41.field1712 = var22.field2055;
                    if (var41.field1614 != -1) {
                        if (var41.field1609 > 0) {
                            var41.field1712 = var41.field1712 * 32 / var41.field1609;
                        } else if (var41.field1733 > 0) {
                            var41.field1712 = var41.field1712 * 32 / var41.field1733;
                        }
                    }
                    class195.method1388(-82, var41);
                }
            } else if (var23 == 9) {
                class98 var35 = class168.method1173(var24, -1456948048);
                if (var22.field2066 != var35.field1614 || var22.field2067 != var35.field1682) {
                    var35.field1614 = var22.field2066;
                    var35.field1682 = var22.field2067;
                    class195.method1388(-82, var35);
                }
            } else if (var23 == 10) {
                class98 var40 = class168.method1173(var24, -1456948048);
                if (var22.field2066 != var40.field1666 || var22.field2067 != var40.field1711 || var22.field2055 != var40.field1646) {
                    var40.field1711 = var22.field2067;
                    var40.field1666 = var22.field2066;
                    var40.field1646 = var22.field2055;
                    class195.method1388(-82, var40);
                }
            } else if (var23 == 11) {
                class98 var39 = class168.method1173(var24, -1456948048);
                var39.field1590 = var39.field1710 = var22.field2067;
                var39.field1730 = var39.field1727 = var22.field2066;
                var39.field1563 = 0;
                var39.field1651 = 0;
                class195.method1388(-82, var39);
            } else if (var23 == 12) {
                class98 var37 = class168.method1173(var24, -1456948048);
                int var38 = var22.field2066;
                if (var37 != null && var37.field1677 == 0) {
                    if ((var37.field1703 - var37.field1688) < var38) {
                        var38 = var37.field1703 - var37.field1688;
                    }
                    if (var38 < 0) {
                        var38 = 0;
                    }
                    if (var37.field1701 != var38) {
                        var37.field1701 = var38;
                        class195.method1388(-82, var37);
                    }
                }
            } else if (var23 == 13) {
                class98 var36 = class168.method1173(var24, -1456948048);
                var36.field1633 = var22.field2066;
            }
        }
        class195.field3534++;
        if (class318.field5466 != 0) {
            class259.field4578 += 20;
            if (class259.field4578 >= 400) {
                class318.field5466 = 0;
            }
        }
        if (class249.field4321 != null) {
            class94.field1505++;
            if (class94.field1505 >= 15) {
                class195.method1388(-82, class249.field4321);
                class249.field4321 = null;
            }
        }
        if (class295.field5151 != null) {
            class195.method1388(-82, class295.field5151);
            class136.field2411++;
            if (class129.field2194 + 5 < class317.field5456 || (class129.field2194 - 5) > class317.field5456 || class29.field441 + 5 < class171.field3116 || class171.field3116 < (class29.field441 - 5)) {
                class26.field401 = true;
            }
            if (class83.field1298 == 0) {
                if (class26.field401 && class136.field2411 >= 5) {
                    if (class295.field5151 == class278.field4879 && class46.field660 != class236.field4141) {
                        class273.field4778++;
                        class98 var45 = class295.field5151;
                        byte var46 = 0;
                        if (class3.field55 == 1 && var45.field1698 == 206) {
                            var46 = 1;
                        }
                        if (var45.field1575[class46.field660] <= 0) {
                            var46 = 0;
                        }
                        if (class159.method1104(client.method1815(var45), (byte) -127)) {
                            int var47 = class236.field4141;
                            int var48 = class46.field660;
                            var45.field1575[var48] = var45.field1575[var47];
                            var45.field1671[var48] = var45.field1671[var47];
                            var45.field1575[var47] = -1;
                            var45.field1671[var47] = 0;
                        } else if (var46 == 1) {
                            int var49 = class236.field4141;
                            int var50 = class46.field660;
                            while (var49 != var50) {
                                if (var49 > var50) {
                                    var45.method664((byte) 46, var49, var49 - 1);
                                    var49--;
                                } else if (var50 > var49) {
                                    var45.method664((byte) 46, var49, var49 + 1);
                                    var49++;
                                }
                            }
                        } else {
                            var45.method664((byte) 46, class236.field4141, class46.field660);
                        }
                        class256.field4471.method1427(223, 0);
                        class256.field4471.method1742(var46, (byte) 50);
                        class256.field4471.method1761(111, class46.field660);
                        class256.field4471.method1741(class295.field5151.field1649, -1580277072);
                        class256.field4471.method1754(class236.field4141, 102);
                    }
                } else if ((class155.field2798 == 1 || class274.method1980(class311.field5374 - 1, 79)) && class311.field5374 > 2) {
                    class90.method612(-19775);
                } else if (class311.field5374 > 0) {
                    class1.method6(0);
                }
                class94.field1505 = 10;
                class331.field5645 = 0;
                class295.field5151 = null;
            }
        }
        class137.field2429 = 0;
        class98 var51 = class60.field967;
        class54.field797 = false;
        class98 var52 = class93.field1488;
        class60.field967 = null;
        class240.field4177 = null;
        class93.field1488 = null;
        class296.field5161 = false;
        while (class90.method608(9) && class137.field2429 < 128) {
            class197.field3562[class137.field2429] = class115.field1989;
            class91.field1427[class137.field2429] = class285.field4981;
            class137.field2429++;
        }
        class316.field5444 = null;
        if (class322.field5511 != -1) {
            class326.method2229(class322.field5511, (byte) 124, 0, 0, class21.field331, 0, 0, class73.field1110);
        }
        class242.field4217++;
        while (true) {
            class286 var53;
            class98 var54;
            class98 var55;
            do {
                var53 = (class286) class10.field123.method12(116);
                if (var53 == null) {
                    while (true) {
                        class286 var56;
                        class98 var57;
                        class98 var58;
                        do {
                            var56 = (class286) class301.field5237.method12(70);
                            if (var56 == null) {
                                while (true) {
                                    class286 var59;
                                    class98 var60;
                                    class98 var61;
                                    do {
                                        var59 = (class286) class295.field5138.method12(57);
                                        if (var59 == null) {
                                            if (class154.field2764 && class316.field5444 == null) {
                                                class154.field2764 = false;
                                            }
                                            if (class272.field4776 != null) {
                                                class282.method2029(0);
                                            }
                                            if (class299.field5191 > 0 && class144.field2529[82] && class144.field2529[81] && class130.field2233 != 0) {
                                                int var62 = class295.field5159 - class130.field2233;
                                                if (var62 < 0) {
                                                    var62 = 0;
                                                } else if (var62 > 3) {
                                                    var62 = 3;
                                                }
                                                class92.method624(false, class95.field1513.field4482[0] + class137.field2421, class95.field1513.field4498[0] + class305.field5295, var62);
                                            }
                                            if (class242.field4205 != -1) {
                                                int var63 = class242.field4205;
                                                int var64 = class200.field3619;
                                                if (class299.field5191 > 0 && class144.field2529[82] && class144.field2529[81]) {
                                                    class92.method624(false, class137.field2421 + var64, class305.field5295 + var63, class295.field5159);
                                                } else if (class220.field3915) {
                                                    class43.field567++;
                                                    class256.field4471.method1427(110, 0);
                                                    class256.field4471.method1729(class305.field5295 + var63, 4110);
                                                    class256.field4471.method1729(class218.field3873, 4110);
                                                    class256.field4471.method1741(class163.field2927, -1580277072);
                                                    class256.field4471.method1724(false, class137.field2421 + var64);
                                                    class318.field5466 = 1;
                                                    class259.field4578 = 0;
                                                    class307.field5344 = class170.field3041;
                                                    class54.field792 = class87.field1382;
                                                } else if (class266.field4676) {
                                                    class256.field4471.method1427(133, 0);
                                                    class256.field4471.method1729(class305.field5295 + var63, 4110);
                                                    class256.field4471.method1761(-69, class137.field2421 + var64);
                                                    class307.field5344 = class170.field3041;
                                                    class88.field1384++;
                                                    class259.field4578 = 0;
                                                    class318.field5466 = 1;
                                                    class54.field792 = class87.field1382;
                                                } else {
                                                    boolean var65 = class328.method2245(var64, class95.field1513.field4482[0], 0, 0, true, 0, class95.field1513.field4498[0], 0, (byte) -101, 0, var63, 0);
                                                    if (var65) {
                                                        class259.field4578 = 0;
                                                        class318.field5466 = 1;
                                                        class54.field792 = class87.field1382;
                                                        class307.field5344 = class170.field3041;
                                                    }
                                                }
                                                class220.field3915 = false;
                                                class266.field4676 = false;
                                                class242.field4205 = -1;
                                            }
                                            class183.method1321((byte) 117);
                                            if (class60.field967 != var51) {
                                                if (var51 != null) {
                                                    class195.method1388(-82, var51);
                                                }
                                                if (class60.field967 != null) {
                                                    class195.method1388(-82, class60.field967);
                                                }
                                            }
                                            if (class93.field1488 != var52 && class55.field810 == class144.field2534) {
                                                if (var52 != null) {
                                                    class195.method1388(-82, var52);
                                                }
                                                if (class93.field1488 != null) {
                                                    class195.method1388(-82, class93.field1488);
                                                }
                                            }
                                            if (class93.field1488 == null) {
                                                if (class144.field2534 > 0) {
                                                    class144.field2534--;
                                                }
                                            } else if (class144.field2534 < class55.field810) {
                                                class144.field2534++;
                                                if (class55.field810 == class144.field2534) {
                                                    class195.method1388(-82, class93.field1488);
                                                }
                                            }
                                            if (class63.field1021 == 1) {
                                                class233.method1625(-2430);
                                            } else if (class63.field1021 == 2) {
                                                class59.method405(-45);
                                            } else {
                                                class17.method118(64);
                                            }
                                            for (int var66 = 0; var66 < 5; var66++) {
                                                int var10002 = class265.field4668[var66]++;
                                            }
                                            int var67 = class247.method1699(-1);
                                            int var68 = class75.method491(-1);
                                            if (var67 > 4500 && var68 > 4500) {
                                                class16.field205 = 250;
                                                class88.method601(4000, -66);
                                                class242.field4224++;
                                                class256.field4471.method1427(182, 0);
                                            }
                                            if (class101.field1773 != null && class101.field1773.field3686 == 1) {
                                                if (class101.field1773.field3685 != null) {
                                                    class200.method1413(class96.field1560, class83.field1286, 3);
                                                }
                                                class101.field1773 = null;
                                                class96.field1560 = false;
                                                class83.field1286 = null;
                                            }
                                            class17.field230++;
                                            class52.field761++;
                                            if (class52.field761 > 500) {
                                                int var69 = (int) (Math.random() * 8.0D);
                                                if ((var69 & 0x1) == 1) {
                                                    class42.field562 += class307.field5339;
                                                }
                                                if ((var69 & 0x2) == 2) {
                                                    class209.field3732 += class237.field4147;
                                                }
                                                if ((var69 & 0x4) == 4) {
                                                    class194.field3509 += class307.field5338;
                                                }
                                                class52.field761 = 0;
                                            }
                                            if (class17.field230 > 500) {
                                                class17.field230 = 0;
                                                int var70 = (int) (Math.random() * 8.0D);
                                                if ((var70 & 0x2) == 2) {
                                                    class272.field4775 += class2.field31;
                                                }
                                                if ((var70 & 0x1) == 1) {
                                                    class328.field5609 += class209.field3741;
                                                }
                                            }
                                            if (class42.field562 < -50) {
                                                class307.field5339 = 2;
                                            }
                                            if (class328.field5609 < -60) {
                                                class209.field3741 = 2;
                                            }
                                            if (class194.field3509 < -40) {
                                                class307.field5338 = 1;
                                            }
                                            if (class272.field4775 < -20) {
                                                class2.field31 = 1;
                                            }
                                            if (class209.field3732 < -55) {
                                                class237.field4147 = 2;
                                            }
                                            if (class42.field562 > 50) {
                                                class307.field5339 = -2;
                                            }
                                            if (class209.field3732 > 55) {
                                                class237.field4147 = -2;
                                            }
                                            if (class328.field5609 > 60) {
                                                class209.field3741 = -2;
                                            }
                                            class271.field4744++;
                                            if (class272.field4775 > 10) {
                                                class2.field31 = -1;
                                            }
                                            if (class194.field3509 > 40) {
                                                class307.field5338 = -1;
                                            }
                                            if (class271.field4744 > 50) {
                                                class256.field4471.method1427(203, 0);
                                                class149.field2716++;
                                            }
                                            if (class16.field204) {
                                                class223.method1519(-25378);
                                                class16.field204 = false;
                                            }
                                            try {
                                                if (class14.field161 != null && class256.field4471.field4314 > 0) {
                                                    class14.field161.method1483(class256.field4471.field4314, 0, false, class256.field4471.field4338);
                                                    class271.field4744 = 0;
                                                    class256.field4471.field4314 = 0;
                                                }
                                            } catch (IOException var72) {
                                                class54.method377((byte) 53);
                                            }
                                            return;
                                        }
                                        var60 = var59.field5006;
                                        if (var60.field1583 < 0) {
                                            break;
                                        }
                                        var61 = class168.method1173(var60.field1611, -1456948048);
                                    } while (var61 == null || var61.field1636 == null || var60.field1583 >= var61.field1636.length || var61.field1636[var60.field1583] != var60);
                                    class287.method2053(var59, 34);
                                }
                            }
                            var57 = var56.field5006;
                            if (var57.field1583 < 0) {
                                break;
                            }
                            var58 = class168.method1173(var57.field1611, -1456948048);
                        } while (var58 == null || var58.field1636 == null || var58.field1636.length <= var57.field1583 || var58.field1636[var57.field1583] != var57);
                        class287.method2053(var56, 117);
                    }
                }
                var54 = var53.field5006;
                if (var54.field1583 < 0) {
                    break;
                }
                var55 = class168.method1173(var54.field1611, -1456948048);
            } while (var55 == null || var55.field1636 == null || var55.field1636.length <= var54.field1583 || var55.field1636[var54.field1583] != var54);
            class287.method2053(var53, 116);
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "([Ljava/lang/Object;III[J)V", line = 1205)
    public static final void method2257(Object[] arg0, int arg1, int arg2, int arg3, long[] arg4) {
        if (arg2 < 23) {
            return;
        }
        if (arg1 < arg3) {
            int var5 = arg1;
            int var6 = (arg1 + arg3) / 2;
            long var7 = arg4[var6];
            arg4[var6] = arg4[arg3];
            arg4[arg3] = var7;
            Object var9 = arg0[var6];
            arg0[var6] = arg0[arg3];
            arg0[arg3] = var9;
            for (int var10 = arg1; var10 < arg3; var10++) {
                if ((long) (var10 & 0x1) + var7 > arg4[var10]) {
                    long var11 = arg4[var10];
                    arg4[var10] = arg4[var5];
                    arg4[var5] = var11;
                    Object var13 = arg0[var10];
                    arg0[var10] = arg0[var5];
                    arg0[var5++] = var13;
                }
            }
            arg4[arg3] = arg4[var5];
            arg4[var5] = var7;
            arg0[arg3] = arg0[var5];
            arg0[var5] = var9;
            method2257(arg0, arg1, 85, var5 - 1, arg4);
            method2257(arg0, var5 + 1, 38, arg3, arg4);
        }
        field5619++;
    }
}
