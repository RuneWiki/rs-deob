import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class86 extends class30 {

    @OriginalMember(owner = "client!mc", name = "R", descriptor = "[Lhe;")
    public class54[] field1896;

    @OriginalMember(owner = "client!mc", name = "S", descriptor = "Lje;")
    public static class67 field1897 = class85.method592(255, "<col=40ff00>");

    @OriginalMember(owner = "client!mc", name = "U", descriptor = "I")
    public static int field1899 = 1;

    @OriginalMember(owner = "client!mc", name = "bb", descriptor = "Lje;")
    public static class67 field1906 = class85.method592(255, "Ihr Spielkonto wird bereits benutzt)3");

    @OriginalMember(owner = "client!mc", name = "gb", descriptor = "Lje;")
    public static class67 field1911 = class85.method592(255, "leuchten1:");

    @OriginalMember(owner = "client!mc", name = "Y", descriptor = "I")
    public static int field1903 = 0;

    @OriginalMember(owner = "client!mc", name = "X", descriptor = "I")
    public static int field1902 = 0;

    @OriginalMember(owner = "client!mc", name = "V", descriptor = "[Lee;")
    public static class34[] field1900 = new class34[4];

    @OriginalMember(owner = "client!mc", name = "eb", descriptor = "Lje;")
    private static class67 field1909 = class85.method592(255, "Use");

    @OriginalMember(owner = "client!mc", name = "mb", descriptor = "Lje;")
    private static class67 field1917 = class85.method592(255, "You can(Wt add yourself to your own ignore list");

    @OriginalMember(owner = "client!mc", name = "W", descriptor = "Lje;")
    public static class67 field1901 = field1909;

    @OriginalMember(owner = "client!mc", name = "hb", descriptor = "Lje;")
    public static class67 field1912 = class85.method592(255, "sl_flags");

    @OriginalMember(owner = "client!mc", name = "nb", descriptor = "I")
    public static int field1918 = 0;

    @OriginalMember(owner = "client!mc", name = "fb", descriptor = "Lje;")
    public static class67 field1910 = field1917;

    @OriginalMember(owner = "client!mc", name = "T", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!mc", name = "Z", descriptor = "I")
    public static int field1904;

    @OriginalMember(owner = "client!mc", name = "ab", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!mc", name = "cb", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!mc", name = "db", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!mc", name = "ib", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "client!mc", name = "jb", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!mc", name = "kb", descriptor = "I")
    public static int field1915;

    @OriginalMember(owner = "client!mc", name = "lb", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!mc", name = "ob", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!mc", name = "pb", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IB)Z")
    public final boolean method600(int arg0, byte arg1) {
        field1907++;
        return arg1 == -95 ? this.field1896[arg0].field1053 : false;
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(I)V")
    public static void method601(int arg0) {
        field1901 = null;
        field1900 = null;
        field1911 = null;
        field1912 = null;
        field1917 = null;
        field1906 = null;
        field1909 = null;
        field1910 = null;
        if (arg0 >= -44) {
            field1902 = 30;
        }
        field1897 = null;
    }

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "(I)Z")
    public static final boolean method602(int arg0) {
        field1898++;
        if (class104.field2367 == null) {
            return false;
        }
        try {
            int var1 = class104.field2367.method848((byte) -125);
            if (var1 == 0) {
                return false;
            }
            if (class42.field797 == -1) {
                var1--;
                class104.field2367.method843(class9.field196.field1991, 1, 0, false);
                class9.field196.field2043 = 0;
                class42.field797 = class9.field196.method282(127);
                class155.field3544 = class46.field849[class42.field797];
            }
            if (class155.field3544 == -1) {
                if (var1 <= 0) {
                    return false;
                }
                var1--;
                class104.field2367.method843(class9.field196.field1991, 1, 0, false);
                class155.field3544 = class9.field196.field1991[0] & 0xFF;
            }
            if (class155.field3544 == -2) {
                if (var1 <= 1) {
                    return false;
                }
                class104.field2367.method843(class9.field196.field1991, 2, 0, false);
                var1 -= 2;
                class9.field196.field2043 = 0;
                class155.field3544 = class9.field196.method641(255);
            }
            if (var1 < class155.field3544) {
                return false;
            }
            class9.field196.field2043 = 0;
            class104.field2367.method843(class9.field196.field1991, class155.field3544, 0, false);
            class71.field1441 = 0;
            class47.field910 = class19.field362;
            class19.field362 = class140.field3163;
            class140.field3163 = class42.field797;
            if (class42.field797 == 179) {
                int var2 = class9.field196.method648(22591);
                if (var2 == 65535) {
                    var2 = -1;
                }
                class151.method1158((byte) 116, var2);
                class42.field797 = -1;
                return true;
            }
            if (class42.field797 == 20) {
                int var3 = class9.field196.method664((byte) 106);
                int var4 = class9.field196.method630((byte) -49);
                if (var4 == 65535) {
                    var4 = -1;
                }
                class30.method196(var4, -71, var3);
                class42.field797 = -1;
                return true;
            }
            if (class42.field797 == 213) {
                class29.field516 = class9.field196.method649(false);
                class18.field342 = class9.field196.method649(false);
                class158.field3627 = class9.field196.method649(false);
                class42.field797 = -1;
                return true;
            }
            if (class42.field797 == 8) {
                int var5 = class9.field196.method631(-31);
                int var6 = class9.field196.method641(255);
                class72 var7;
                if (var5 >= 0) {
                    var7 = class67.method467((byte) -13, var5);
                } else {
                    var7 = null;
                }
                if (var5 < -70000) {
                    var6 += 32768;
                }
                if (var7 != null) {
                    for (int var8 = 0; var8 < var7.field1581.length; var8++) {
                        var7.field1581[var8] = 0;
                        var7.field1482[var8] = 0;
                    }
                }
                class46.method296(var6, (byte) -25);
                int var9 = class9.field196.method641(255);
                for (int var10 = 0; var10 < var9; var10++) {
                    int var11 = class9.field196.method630((byte) -49);
                    int var12 = class9.field196.method623(-77);
                    if (var12 == 255) {
                        var12 = class9.field196.method646((byte) -52);
                    }
                    if (var7 != null && var10 < var7.field1581.length) {
                        var7.field1581[var10] = var11;
                        var7.field1482[var10] = var12;
                    }
                    class27.method182(var6, var12, var11 - 1, var10, 86);
                }
                if (var7 != null) {
                    class23.method160((byte) -29, var7);
                }
                class58.method405((byte) 102);
                class129.field2839[class34.method213(31, class6.field144++)] = class34.method213(var6, 32767);
                class42.field797 = -1;
                return true;
            }
            if (class42.field797 == 82) {
                int var13 = class9.field196.method621(6538);
                int var14 = class9.field196.method623(-33);
                class67 var15 = class9.field196.method634(-1);
                if (var13 >= 1 && var13 <= 8) {
                    if (var15.method479(63, class16.field275)) {
                        var15 = null;
                    }
                    class144.field3319[var13 - 1] = var15;
                    class103.field2312[var13 - 1] = var14 == 0;
                }
                class42.field797 = -1;
                return true;
            }
            if (class42.field797 == 105) {
                int var16 = class9.field196.method646((byte) -52);
                class67 var17 = class9.field196.method634(-1);
                class72 var18 = class67.method467((byte) -13, var16);
                if (!var17.method455(var18.field1459, 18909)) {
                    var18.field1459 = var17;
                    class23.method160((byte) -29, var18);
                }
                class42.field797 = -1;
                return true;
            }
            if (class42.field797 == 76) {
                class123.method962(-76);
                class42.field797 = -1;
                return false;
            }
            if (class42.field797 == 18) {
                int var19 = class9.field196.method631(-96);
                int var20 = class9.field196.method641(255);
                class72 var21;
                if (var19 < 0) {
                    var21 = null;
                } else {
                    var21 = class67.method467((byte) -13, var19);
                }
                if (var19 < -70000) {
                    var20 += 32768;
                }
                while (class155.field3544 > class9.field196.field2043) {
                    int var22 = class9.field196.method662((byte) 116);
                    int var23 = class9.field196.method641(255);
                    int var24 = 0;
                    if (var23 != 0) {
                        var24 = class9.field196.method649(false);
                        if (var24 == 255) {
                            var24 = class9.field196.method631(-107);
                        }
                    }
                    if (var21 != null && var22 >= 0 && var22 < var21.field1581.length) {
                        var21.field1581[var22] = var23;
                        var21.field1482[var22] = var24;
                    }
                    class27.method182(var20, var24, var23 - 1, var22, 106);
                }
                if (var21 != null) {
                    class23.method160((byte) -29, var21);
                }
                class58.method405((byte) 102);
                class129.field2839[class34.method213(31, class6.field144++)] = class34.method213(var20, 32767);
                class42.field797 = -1;
                return true;
            }
            if (class42.field797 == 228) {
                class112.method891(class9.field196, class155.field3544, class154.field3519, 101);
                class42.field797 = -1;
                return true;
            }
            if (class42.field797 == 136) {
                int var25 = class9.field196.method657(-2079350680);
                int var26 = class9.field196.method648(22591);
                class72 var27 = class67.method467((byte) -13, var25);
                if (var27.field1504 != 1 || var27.field1511 != var26) {
                    var27.field1511 = var26;
                    var27.field1504 = 1;
                    class23.method160((byte) -29, var27);
                }
                class42.field797 = -1;
                return true;
            }
            if (class42.field797 == 170) {
                int var28 = class9.field196.method631(-88);
                int var29 = class9.field196.method648(22591);
                int var30 = var29 >> 10 & 0x1F;
                int var31 = var29 >> 5 & 0x1F;
                class72 var32 = class67.method467((byte) -13, var28);
                int var33 = var29 & 0x1F;
                int var34 = (var33 << 3) + (var30 << 19) + (var31 << 11);
                if (var32.field1486 != var34) {
                    var32.field1486 = var34;
                    class23.method160((byte) -29, var32);
                }
                class42.field797 = -1;
                return true;
            }
            if (class42.field797 == 25) {
                class115.method928(18196, class9.field196);
                class42.field797 = -1;
                return true;
            }
            if (class42.field797 == 149 || class42.field797 == 129 || class42.field797 == 68 || class42.field797 == 10 || class42.field797 == 107 || class42.field797 == 66 || class42.field797 == 75 || class42.field797 == 22 || class42.field797 == 67 || class42.field797 == 140 || class42.field797 == 24) {
                class17.method117(true);
                class42.field797 = -1;
                return true;
            }
            if (class42.field797 == 192) {
                for (int var35 = 0; var35 < class91.field2018; var35++) {
                    class95 var36 = class101.method804(var35, -122);
                    if (var36 != null && var36.field2130 == 0) {
                        class79.field1743[var35] = 0;
                        class42.field804[var35] = 0;
                    }
                }
                class58.method405((byte) 102);
                class91.field2016 += 32;
                class42.field797 = -1;
                return true;
            }
            if (class42.field797 == 237) {
                int var37 = class9.field196.method646((byte) -52);
                class72 var38 = class67.method467((byte) -13, var37);
                for (int var39 = 0; var39 < var38.field1581.length; var39++) {
                    var38.field1581[var39] = -1;
                    var38.field1581[var39] = 0;
                }
                class23.method160((byte) -29, var38);
                class42.field797 = -1;
                return true;
            }
            if (class42.field797 == 42) {
                long var40 = class9.field196.method635((byte) 66);
                long var42 = (long) class9.field196.method641(255);
                long var44 = (long) class9.field196.method637(97);
                int var46 = class9.field196.method649(false);
                long var47 = (var42 << 32) + var44;
                boolean var49 = false;
                for (int var50 = 0; var50 < 100; var50++) {
                    if (class52.field1027[var50] == var47) {
                        var49 = true;
                        break;
                    }
                }
                if (var46 <= 1) {
                    for (int var51 = 0; var51 < class92.field2059; var51++) {
                        if (class14.field244[var51] == var40) {
                            var49 = true;
                            break;
                        }
                    }
                }
                if (!var49 && class58.field1149 == 0) {
                    class52.field1027[class34.field607] = var47;
                    class34.field607 = (class34.field607 + 1) % 100;
                    class67 var52 = class100.method785(class158.method1225(118, class9.field196).method462(true));
                    if (var46 == 2 || var46 == 3) {
                        class88.method614(var52, class49.method314(new class67[] { class142.field3276, class91.method674((byte) -116, var40).method460(123) }, 0), 108, 7);
                    } else if (var46 == 1) {
                        class88.method614(var52, class49.method314(new class67[] { class3.field40, class91.method674((byte) -116, var40).method460(108) }, 0), 92, 7);
                    } else {
                        class88.method614(var52, class91.method674((byte) -116, var40).method460(118), 88, 3);
                    }
                }
                class42.field797 = -1;
                return true;
            }
            if (class42.field797 == 205) {
                class26.field474 = true;
                class103.field2343 = class9.field196.method649(false);
                class15.field268 = class9.field196.method649(false);
                class150.field3435 = class9.field196.method641(255);
                class35.field658 = class9.field196.method649(false);
                class77.field1659 = class9.field196.method649(false);
                if (class77.field1659 >= 100) {
                    int var53 = class103.field2343 * 128 + 64;
                    int var54 = class15.field268 * 128 + 64;
                    int var55 = class114.method924(var53, class128.field2817, var54, -122) - class150.field3435;
                    int var56 = var55 - class3.field42;
                    int var57 = var53 - class101.field2274;
                    int var58 = var54 - class152.field3486;
                    int var59 = (int) Math.sqrt((double) (var57 * var57 + var58 * var58));
                    class46.field853 = (int) (Math.atan2((double) var56, (double) var59) * 325.949D) & 0x7FF;
                    class83.field1828 = (int) (Math.atan2((double) var57, (double) var58) * -325.949D) & 0x7FF;
                    if (class46.field853 < 128) {
                        class46.field853 = 128;
                    }
                    if (class46.field853 > 383) {
                        class46.field853 = 383;
                    }
                }
                class42.field797 = -1;
                return true;
            }
            if (class42.field797 == 26) {
                int var60 = class9.field196.method646((byte) -52);
                class72 var61 = class67.method467((byte) -13, var60);
                var61.field1504 = 3;
                var61.field1511 = class37.field667.field1843.method489(0);
                class23.method160((byte) -29, var61);
                class42.field797 = -1;
                return true;
            }
            if (class42.field797 == 84) {
                int var62 = class9.field196.method671(-488712568);
                int var63 = class9.field196.method630((byte) -49);
                class72 var64 = class67.method467((byte) -13, var62);
                if (var64 != null && var64.field1546 == 0) {
                    if (var64.field1449 - var64.field1523 < var63) {
                        var63 = var64.field1449 - var64.field1523;
                    }
                    if (var63 < 0) {
                        var63 = 0;
                    }
                    if (var64.field1575 != var63) {
                        var64.field1575 = var63;
                        class23.method160((byte) -29, var64);
                    }
                }
                class42.field797 = -1;
                return true;
            }
            if (class42.field797 == 95) {
                int var65 = class9.field196.method657(-2079350680);
                class16.field277 = class154.field3519.method874(5, var65);
                class42.field797 = -1;
                return true;
            }
            if (class42.field797 == 45) {
                int var66 = class9.field196.method641(255);
                class112.field2519 = var66;
                class159.method1232(101, var66);
                class19.method132(-110, class112.field2519);
                for (int var67 = 0; var67 < 100; var67++) {
                    class80.field1774[var67] = true;
                }
                class42.field797 = -1;
                return true;
            }
            if (class42.field797 == 193) {
                long var68 = class9.field196.method635((byte) -79);
                int var70 = class9.field196.method641(255);
                byte var71 = class9.field196.method667((byte) -37);
                boolean var72 = false;
                if ((var68 & Long.MIN_VALUE) != 0L) {
                    var72 = true;
                }
                if (var72) {
                    if (class106.field2411 == 0) {
                        class42.field797 = -1;
                        return true;
                    }
                    long var73 = var68 & Long.MAX_VALUE;
                    boolean var75 = false;
                    int var76;
                    for (var76 = 0; class106.field2411 > var76 && (class138.field3110[var76].field300 != var73 || class138.field3110[var76].field2057 != var70); var76++) {
                    }
                    if (var76 < class106.field2411) {
                        while (class106.field2411 - 1 > var76) {
                            class138.field3110[var76] = class138.field3110[var76 + 1];
                            var76++;
                        }
                        class138.field3110[class106.field2411] = null;
                        class106.field2411--;
                    }
                } else {
                    class92 var77 = new class92();
                    var77.field300 = var68;
                    var77.field2066 = class91.method674((byte) -116, var77.field300);
                    var77.field2052 = var71;
                    var77.field2057 = var70;
                    int var78;
                    for (var78 = class106.field2411 - 1; var78 >= 0; var78--) {
                        int var79 = class138.field3110[var78].field2066.method471(0, var77.field2066);
                        if (var79 == 0) {
                            class138.field3110[var78].field2057 = var70;
                            class138.field3110[var78].field2052 = var71;
                            if (class40.field738 == var68) {
                                class93.field2106 = var71;
                            }
                            client.field396 = field1899;
                            class42.field797 = -1;
                            return true;
                        }
                        if (var79 < 0) {
                            break;
                        }
                    }
                    if (class138.field3110.length <= class106.field2411) {
                        class42.field797 = -1;
                        return true;
                    }
                    for (int var80 = class106.field2411 - 1; var80 > var78; var80--) {
                        class138.field3110[var80 + 1] = class138.field3110[var80];
                    }
                    if (class106.field2411 == 0) {
                        class138.field3110 = new class92[100];
                    }
                    class138.field3110[var78 + 1] = var77;
                    class106.field2411++;
                    if (class40.field738 == var68) {
                        class93.field2106 = var71;
                    }
                }
                client.field396 = field1899;
                class42.field797 = -1;
                return true;
            }
            if (class42.field797 == 21) {
                int var81 = class9.field196.method641(255);
                int var82 = class9.field196.method649(false);
                int var83 = class9.field196.method641(255);
                class76.method541(var83, var81, var82, 26079);
                class42.field797 = -1;
                return true;
            }
            if (class42.field797 == 165) {
                class132.field2901 = class9.field196.method649(false);
                class69.field1420 = class9.field196.method623(-50);
                for (int var84 = class69.field1420; var84 < class69.field1420 + 8; var84++) {
                    for (int var85 = class132.field2901; var85 < class132.field2901 + 8; var85++) {
                        if (class99.field2200[class128.field2817][var84][var85] != null) {
                            class99.field2200[class128.field2817][var84][var85] = null;
                            class101.method806(var84, var85, true);
                        }
                    }
                }
                for (class138 var86 = (class138) class25.field447.method26((byte) 108); var86 != null; var86 = (class138) class25.field447.method18((byte) -128)) {
                    if (var86.field3111 >= class69.field1420 && var86.field3111 < class69.field1420 + 8 && class132.field2901 <= var86.field3126 && var86.field3126 < class132.field2901 + 8 && class128.field2817 == var86.field3119) {
                        var86.field3125 = 0;
                    }
                }
                class42.field797 = -1;
                return true;
            }
            if (class42.field797 == 222) {
                class58.method405((byte) 102);
                class2.field20 = class9.field196.method675((byte) 83);
                class34.field618 = field1899;
                class42.field797 = -1;
                return true;
            }
            if (class42.field797 == 29) {
                class132.field2901 = class9.field196.method622((byte) 102);
                class69.field1420 = class9.field196.method622((byte) 102);
                while (class155.field3544 > class9.field196.field2043) {
                    class42.field797 = class9.field196.method649(false);
                    class17.method117(true);
                }
                class42.field797 = -1;
                return true;
            }
            if (class42.field797 == 173) {
                int var87 = class9.field196.method675((byte) -103);
                int var88 = class9.field196.method670(113);
                int var89 = class9.field196.method631(-48);
                class72 var90 = class67.method467((byte) -13, var89);
                int var91 = var90.field1498 + var88;
                int var92 = var90.field1530 + var87;
                if (var90.field1561 != var91 || var90.field1475 != var92) {
                    var90.field1561 = var91;
                    var90.field1475 = var92;
                    class23.method160((byte) -29, var90);
                }
                class42.field797 = -1;
                return true;
            }
            if (class42.field797 == 164) {
                class55.method389(-27658);
                class42.field797 = -1;
                return true;
            }
            if (class42.field797 == 181) {
                class26.field474 = true;
                class4.field62 = class9.field196.method649(false);
                class140.field3160 = class9.field196.method649(false);
                class30.field526 = class9.field196.method641(255);
                class144.field3326 = class9.field196.method649(false);
                class82.field1803 = class9.field196.method649(false);
                if (class82.field1803 >= 100) {
                    class152.field3486 = class140.field3160 * 128 + 64;
                    class101.field2274 = class4.field62 * 128 + 64;
                    class3.field42 = class114.method924(class101.field2274, class128.field2817, class152.field3486, -118) - class30.field526;
                }
                class42.field797 = -1;
                return true;
            }
            if (class42.field797 == 32) {
                class126.field2772 = class9.field196.method649(false);
                class42.field797 = -1;
                class27.field486 = field1899;
                return true;
            }
            if (class42.field797 == 208) {
                int var93 = class9.field196.method631(-89);
                boolean var94 = class9.field196.method622((byte) 102) == 1;
                class72 var95 = class67.method467((byte) -13, var93);
                if (var94 != var95.field1557) {
                    var95.field1557 = var94;
                    class23.method160((byte) -29, var95);
                }
                class42.field797 = -1;
                return true;
            }
            if (class42.field797 == 195) {
                int var96 = class9.field196.method657(-2079350680);
                int var97 = class9.field196.method622((byte) 102);
                int var98 = class9.field196.method630((byte) -49);
                class60 var99 = (class60) class76.field1634.method1119(28254, (long) var96);
                if (var99 != null) {
                    class61.method425(var99.field1201 != var98, 88, var99);
                }
                class66.method441(var96, var97, var98, (byte) 55);
                class42.field797 = -1;
                return true;
            }
            if (class42.field797 == 63) {
                client.field396 = field1899;
                long var100 = class9.field196.method635((byte) 106);
                if (var100 == 0L) {
                    class72.field1500 = null;
                    class106.field2411 = 0;
                    class42.field797 = -1;
                    class15.field273 = null;
                    class138.field3110 = null;
                    return true;
                }
                long var102 = class9.field196.method635((byte) 63);
                class72.field1500 = class91.method674((byte) -116, var102);
                class15.field273 = class91.method674((byte) -116, var100);
                class83.field1839 = class9.field196.method667((byte) -37);
                int var104 = class9.field196.method649(false);
                if (var104 == 255) {
                    class42.field797 = -1;
                    return true;
                }
                class106.field2411 = var104;
                class92[] var105 = new class92[100];
                for (int var106 = 0; var106 < class106.field2411; var106++) {
                    var105[var106] = new class92();
                    var105[var106].field300 = class9.field196.method635((byte) -86);
                    var105[var106].field2066 = class91.method674((byte) -116, var105[var106].field300);
                    var105[var106].field2057 = class9.field196.method641(255);
                    var105[var106].field2052 = class9.field196.method667((byte) -37);
                    if (class40.field738 == var105[var106].field300) {
                        class93.field2106 = var105[var106].field2052;
                    }
                }
                boolean var107 = false;
                int var108 = class106.field2411;
                while (var108 > 0) {
                    boolean var109 = true;
                    var108--;
                    for (int var110 = 0; var110 < var108; var110++) {
                        if (var105[var110].field2066.method471(0, var105[var110 + 1].field2066) > 0) {
                            class92 var111 = var105[var110];
                            var109 = false;
                            var105[var110] = var105[var110 + 1];
                            var105[var110 + 1] = var111;
                        }
                    }
                    if (var109) {
                        break;
                    }
                }
                class138.field3110 = var105;
                class42.field797 = -1;
                return true;
            }
            if (class42.field797 == 101) {
                for (int var112 = 0; var112 < class85.field1885.length; var112++) {
                    if (class85.field1885[var112] != null) {
                        class85.field1885[var112].field2991 = -1;
                    }
                }
                for (int var113 = 0; var113 < class152.field3479.length; var113++) {
                    if (class152.field3479[var113] != null) {
                        class152.field3479[var113].field2991 = -1;
                    }
                }
                class42.field797 = -1;
                return true;
            }
            if (class42.field797 == 211) {
                class67 var114 = class9.field196.method634(-1);
                if (var114.method452(class35.field648, (byte) 60)) {
                    class67 var115 = var114.method448(0, var114.method472(class129.field2843, 30379), -118);
                    long var116 = var115.method476((byte) 77);
                    boolean var118 = false;
                    for (int var119 = 0; var119 < class92.field2059; var119++) {
                        if (class14.field244[var119] == var116) {
                            var118 = true;
                            break;
                        }
                    }
                    if (!var118 && class58.field1149 == 0) {
                        class88.method614(class134.field3008, var115, 104, 4);
                    }
                } else if (var114.method452(class85.field1878, (byte) 84)) {
                    class67 var120 = var114.method448(0, var114.method472(class129.field2843, 30379), -127);
                    long var121 = var120.method476((byte) 77);
                    boolean var123 = false;
                    for (int var124 = 0; var124 < class92.field2059; var124++) {
                        if (class14.field244[var124] == var121) {
                            var123 = true;
                            break;
                        }
                    }
                    if (!var123 && class58.field1149 == 0) {
                        class88.method614(class155.field3521, var120, 71, 8);
                    }
                } else if (var114.method452(class112.field2539, (byte) 35)) {
                    class67 var133 = var114.method448(0, var114.method472(class129.field2843, 30379), -117);
                    long var134 = var133.method476((byte) 77);
                    boolean var136 = false;
                    for (int var137 = 0; var137 < class92.field2059; var137++) {
                        if (class14.field244[var137] == var134) {
                            var136 = true;
                            break;
                        }
                    }
                    if (!var136 && class58.field1149 == 0) {
                        class67 var138 = var114.method448(var114.method472(class129.field2843, 30379) + 1, var114.method445(false) + -9, -119);
                        class88.method614(var138, var133, 109, 8);
                    }
                } else if (var114.method452(class141.field3184, (byte) 70)) {
                    class67 var128 = var114.method448(0, var114.method472(class129.field2843, 30379), -117);
                    long var129 = var128.method476((byte) 77);
                    boolean var131 = false;
                    for (int var132 = 0; var132 < class92.field2059; var132++) {
                        if (class14.field244[var132] == var129) {
                            var131 = true;
                            break;
                        }
                    }
                    if (!var131 && class58.field1149 == 0) {
                        class88.method614(class52.field1030, var128, 88, 10);
                    }
                } else if (var114.method452(class122.field2731, (byte) 82)) {
                    class67 var125 = var114.method448(0, var114.method472(class122.field2731, 30379), -126);
                    class88.method614(var125, class52.field1030, 87, 11);
                } else if (var114.method452(class47.field912, (byte) 63)) {
                    class67 var127 = var114.method448(0, var114.method472(class47.field912, 30379), -124);
                    if (class58.field1149 == 0) {
                        class88.method614(var127, class52.field1030, 82, 12);
                    }
                } else if (var114.method452(class27.field493, (byte) 113)) {
                    class67 var126 = var114.method448(0, var114.method472(class27.field493, 30379), -123);
                    if (class58.field1149 == 0) {
                        class88.method614(var126, class52.field1030, 120, 13);
                    }
                } else {
                    class88.method614(var114, class52.field1030, 54, 0);
                }
                class42.field797 = -1;
                return true;
            }
            if (class42.field797 == 71) {
                class92.field2059 = class155.field3544 / 8;
                for (int var139 = 0; var139 < class92.field2059; var139++) {
                    class14.field244[var139] = class9.field196.method635((byte) 90);
                    class68.field1377[var139] = class91.method674((byte) -116, class14.field244[var139]);
                }
                class42.field797 = -1;
                class27.field486 = field1899;
                return true;
            }
            if (class42.field797 == 232) {
                long var140 = class9.field196.method635((byte) 75);
                class9.field196.method667((byte) -37);
                long var142 = class9.field196.method635((byte) -92);
                long var144 = (long) class9.field196.method641(255);
                long var146 = (long) class9.field196.method637(111);
                int var148 = class9.field196.method649(false);
                long var149 = (var144 << 32) + var146;
                boolean var151 = false;
                for (int var152 = 0; var152 < 100; var152++) {
                    if (class52.field1027[var152] == var149) {
                        var151 = true;
                        break;
                    }
                }
                if (var148 <= 1) {
                    for (int var153 = 0; var153 < class92.field2059; var153++) {
                        if (class14.field244[var153] == var140) {
                            var151 = true;
                            break;
                        }
                    }
                }
                if (!var151 && class58.field1149 == 0) {
                    class52.field1027[class34.field607] = var149;
                    class34.field607 = (class34.field607 + 1) % 100;
                    class67 var154 = class100.method785(class158.method1225(123, class9.field196).method462(true));
                    if (var148 == 2 || var148 == 3) {
                        class68.method497(9, class91.method674((byte) -116, var142).method460(105), class49.method314(new class67[] { class142.field3276, class91.method674((byte) -116, var140).method460(82) }, 0), -1, var154);
                    } else if (var148 == 1) {
                        class68.method497(9, class91.method674((byte) -116, var142).method460(78), class49.method314(new class67[] { class3.field40, class91.method674((byte) -116, var140).method460(124) }, 0), -1, var154);
                    } else {
                        class68.method497(9, class91.method674((byte) -116, var142).method460(121), class91.method674((byte) -116, var140).method460(126), -1, var154);
                    }
                }
                class42.field797 = -1;
                return true;
            }
            if (class42.field797 == 227) {
                class33.field594 = class9.field196.method649(false);
                class42.field797 = -1;
                return true;
            }
            if (class42.field797 == 206) {
                class58.method405((byte) 102);
                int var155 = class9.field196.method657(-2079350680);
                int var156 = class9.field196.method621(6538);
                int var157 = class9.field196.method623(-103);
                class134.field3011[var156] = var155;
                class135.field3068[var156] = var157;
                class49.field944[var156] = 1;
                for (int var158 = 0; var158 < 98; var158++) {
                    if (var155 >= class56.field1117[var158]) {
                        class49.field944[var156] = var158 + 2;
                    }
                }
                class64.field1248[class34.method213(31, class41.field785++)] = var156;
                class42.field797 = -1;
                return true;
            }
            if (class42.field797 == 188) {
                class26.field474 = false;
                for (int var159 = 0; var159 < 5; var159++) {
                    class151.field3453[var159] = false;
                }
                class42.field797 = -1;
                return true;
            }
            if (class42.field797 == 246) {
                int var160 = class9.field196.method649(false);
                int var161 = class9.field196.method649(false);
                int var162 = class9.field196.method649(false);
                int var163 = class9.field196.method649(false);
                class151.field3453[var160] = true;
                class89.field1970[var160] = var161;
                class116.field2629[var160] = var162;
                class40.field722[var160] = var163;
                class116.field2628[var160] = 0;
                class42.field797 = -1;
                return true;
            }
            if (class42.field797 == 233) {
                class82.field1818 = 0;
                class42.field797 = -1;
                return true;
            }
            if (class42.field797 == 234) {
                int var164 = class9.field196.method648(22591);
                class88.method615(var164, 255);
                class129.field2839[class34.method213(31, class6.field144++)] = class34.method213(var164, 32767);
                class42.field797 = -1;
                return true;
            }
            if (class42.field797 == 168) {
                for (int var165 = 0; var165 < class42.field804.length; var165++) {
                    if (class79.field1743[var165] != class42.field804[var165]) {
                        class42.field804[var165] = class79.field1743[var165];
                        class59.method412(-127, var165);
                        class32.field572[class34.method213(31, class91.field2016++)] = var165;
                    }
                }
                class42.field797 = -1;
                return true;
            }
            if (class42.field797 == 16) {
                class106.method837(true, (byte) 109);
                class42.field797 = -1;
                return true;
            }
            if (class42.field797 == 157) {
                int var166 = class155.field3544 + class9.field196.field2043;
                int var167 = class9.field196.method641(255);
                int var168 = class9.field196.method641(255);
                if (class112.field2519 != var167) {
                    class112.field2519 = var167;
                    class159.method1232(119, class112.field2519);
                    class19.method132(54, class112.field2519);
                    for (int var169 = 0; var169 < 100; var169++) {
                        class80.field1774[var169] = true;
                    }
                }
                while (var168-- > 0) {
                    int var170 = class9.field196.method631(-68);
                    int var171 = class9.field196.method641(255);
                    int var172 = class9.field196.method649(false);
                    class60 var173 = (class60) class76.field1634.method1119(28254, (long) var170);
                    if (var173 != null && var173.field1201 != var171) {
                        class61.method425(true, 85, var173);
                        var173 = null;
                    }
                    if (var173 == null) {
                        var173 = class66.method441(var170, var172, var171, (byte) 86);
                    }
                    var173.field1207 = true;
                }
                for (class60 var174 = (class60) class76.field1634.method1116(0); var174 != null; var174 = (class60) class76.field1634.method1124(-1)) {
                    if (var174.field1207) {
                        var174.field1207 = false;
                    } else {
                        class61.method425(true, 93, var174);
                    }
                }
                class128.field2819 = new class145(512);
                while (var166 > class9.field196.field2043) {
                    int var175 = class9.field196.method631(-67);
                    int var176 = class9.field196.method641(255);
                    int var177 = class9.field196.method641(255);
                    int var178 = class9.field196.method631(-93);
                    for (int var179 = var176; var179 <= var177; var179++) {
                        long var180 = ((long) var175 << 32) + (long) var179;
                        class128.field2819.method1115(var180, new class84(var178), 1);
                    }
                }
                class42.field797 = -1;
                return true;
            }
            if (class42.field797 == 241) {
                class58.method405((byte) 102);
                class66.field1293 = class9.field196.method649(false);
                class42.field797 = -1;
                class34.field618 = field1899;
                return true;
            }
            if (class42.field797 == 162) {
                if (class112.field2519 != -1) {
                    class91.method636(0, class112.field2519, -7771);
                }
                class42.field797 = -1;
                return true;
            }
            if (class42.field797 == 196) {
                int var182 = class9.field196.method659(false);
                if (var182 == 65535) {
                    var182 = -1;
                }
                int var183 = class9.field196.method646((byte) -52);
                int var184 = class9.field196.method646((byte) -52);
                int var185 = class9.field196.method659(false);
                if (var185 == 65535) {
                    var185 = -1;
                }
                for (int var186 = var182; var186 <= var185; var186++) {
                    long var187 = ((long) var184 << 32) + ((long) var186);
                    class16 var189 = class128.field2819.method1119(28254, var187);
                    if (var189 != null) {
                        var189.method115(26851);
                    }
                    class128.field2819.method1115(var187, new class84(var183), 1);
                }
                class42.field797 = -1;
                return true;
            }
            if (class42.field797 == 1) {
                int var190 = class9.field196.method659(false);
                int var191 = class9.field196.method648(22591);
                int var192 = class9.field196.method671(-488712568);
                class72 var193 = class67.method467((byte) -13, var192);
                var193.field1555 = (var190 << 16) + var191;
                class42.field797 = -1;
                return true;
            }
            if (class42.field797 == 15) {
                int var194 = class9.field196.method658(10739);
                int var195 = class9.field196.method657(-2079350680);
                class72 var196 = class67.method467((byte) -13, var195);
                if (var196.field1536 != var194 || var194 == -1) {
                    var196.field1536 = var194;
                    var196.field1570 = 0;
                    var196.field1545 = 0;
                    class23.method160((byte) -29, var196);
                }
                class42.field797 = -1;
                return true;
            }
            if (class42.field797 == 14) {
                class37.field668 = class9.field196.method649(false);
                if (class37.field668 == 1) {
                    class47.field911 = class9.field196.method641(255);
                }
                if (class37.field668 >= 2 && class37.field668 <= 6) {
                    if (class37.field668 == 2) {
                        class42.field798 = 64;
                        client.field403 = 64;
                    }
                    if (class37.field668 == 3) {
                        class42.field798 = 0;
                        client.field403 = 64;
                    }
                    if (class37.field668 == 4) {
                        client.field403 = 64;
                        class42.field798 = 128;
                    }
                    if (class37.field668 == 5) {
                        class42.field798 = 64;
                        client.field403 = 0;
                    }
                    if (class37.field668 == 6) {
                        client.field403 = 128;
                        class42.field798 = 64;
                    }
                    class37.field668 = 2;
                    class79.field1747 = class9.field196.method641(255);
                    class77.field1647 = class9.field196.method641(255);
                    class147.field3363 = class9.field196.method649(false);
                }
                if (class37.field668 == 10) {
                    class103.field2295 = class9.field196.method641(255);
                }
                class42.field797 = -1;
                return true;
            }
            if (class42.field797 == 116) {
                int var197 = class9.field196.method630((byte) -49);
                int var198 = class9.field196.method648(22591);
                int var199 = class9.field196.method657(-2079350680);
                int var200 = class9.field196.method630((byte) -49);
                class72 var201 = class67.method467((byte) -13, var199);
                if (var201.field1542 != var200 || var201.field1502 != var197 || var201.field1461 != var198) {
                    var201.field1542 = var200;
                    var201.field1461 = var198;
                    var201.field1502 = var197;
                    class23.method160((byte) -29, var201);
                }
                class42.field797 = -1;
                return true;
            }
            if (class42.field797 == 134) {
                class132.field2901 = class9.field196.method621(6538);
                class69.field1420 = class9.field196.method623(-94);
                class42.field797 = -1;
                return true;
            }
            if (arg0 < 38) {
                method601(116);
            }
            if (class42.field797 == 175) {
                long var202 = class9.field196.method635((byte) 111);
                int var204 = class9.field196.method641(255);
                int var205 = class9.field196.method649(false);
                class67 var206 = class91.method674((byte) -116, var202).method460(110);
                for (int var207 = 0; var207 < class137.field3087; var207++) {
                    if (class107.field2454[var207] == var202) {
                        if (class47.field921[var207] != var204) {
                            class47.field921[var207] = var204;
                            if (var204 > 0) {
                                class88.method614(class49.method314(new class67[] { var206, class24.field437 }, 0), class52.field1030, 95, 5);
                            }
                            if (var204 == 0) {
                                class88.method614(class49.method314(new class67[] { var206, class126.field2768 }, 0), class52.field1030, 126, 5);
                            }
                        }
                        var206 = null;
                        class4.field71[var207] = var205;
                        break;
                    }
                }
                boolean var208 = false;
                if (var206 != null && class137.field3087 < 200) {
                    class107.field2454[class137.field3087] = var202;
                    class104.field2381[class137.field3087] = var206;
                    class47.field921[class137.field3087] = var204;
                    class4.field71[class137.field3087] = var205;
                    class137.field3087++;
                }
                int var209 = class137.field3087;
                class27.field486 = field1899;
                while (var209 > 0) {
                    boolean var210 = true;
                    var209--;
                    for (int var211 = 0; var211 < var209; var211++) {
                        if (class47.field921[var211] != class19.field366 && class47.field921[var211 + 1] == class19.field366 || class47.field921[var211] == 0 && class47.field921[var211 + 1] != 0) {
                            var210 = false;
                            int var212 = class47.field921[var211];
                            class47.field921[var211] = class47.field921[var211 + 1];
                            class47.field921[var211 + 1] = var212;
                            class67 var213 = class104.field2381[var211];
                            class104.field2381[var211] = class104.field2381[var211 + 1];
                            class104.field2381[var211 + 1] = var213;
                            long var214 = class107.field2454[var211];
                            class107.field2454[var211] = class107.field2454[var211 + 1];
                            class107.field2454[var211 + 1] = var214;
                            int var216 = class4.field71[var211];
                            class4.field71[var211] = class4.field71[var211 + 1];
                            class4.field71[var211 + 1] = var216;
                        }
                    }
                    if (var210) {
                        break;
                    }
                }
                class42.field797 = -1;
                return true;
            }
            if (class42.field797 == 118) {
                class67 var217 = class9.field196.method634(-1);
                Object[] var218 = new Object[var217.method445(false) + 1];
                for (int var219 = var217.method445(false) - 1; var219 >= 0; var219--) {
                    if (var217.method477(var219, (byte) 122) == 115) {
                        var218[var219 + 1] = class9.field196.method634(-1);
                    } else {
                        var218[var219 + 1] = Integer.valueOf(class9.field196.method631(-118));
                    }
                }
                var218[0] = Integer.valueOf(class9.field196.method631(-102));
                class35 var220 = new class35();
                var220.field630 = var218;
                class71.method513((byte) -25, var220);
                class42.field797 = -1;
                return true;
            }
            if (class42.field797 == 219) {
                int var221 = class9.field196.method630((byte) -49);
                int var222 = class9.field196.method671(-488712568);
                class79.field1743[var221] = var222;
                if (class42.field804[var221] != var222) {
                    class42.field804[var221] = var222;
                    class59.method412(-126, var221);
                }
                class32.field572[class34.method213(class91.field2016++, 31)] = var221;
                class42.field797 = -1;
                return true;
            }
            if (class42.field797 == 104) {
                int var223 = class9.field196.method631(-115);
                int var224 = class9.field196.method641(255);
                class72 var225 = class67.method467((byte) -13, var223);
                if (var225.field1504 != 2 || var225.field1511 != var224) {
                    var225.field1504 = 2;
                    var225.field1511 = var224;
                    class23.method160((byte) -29, var225);
                }
                class42.field797 = -1;
                return true;
            }
            if (class42.field797 == 130) {
                long var226 = class9.field196.method635((byte) -101);
                class67 var228 = class100.method785(class158.method1225(-125, class9.field196).method462(true));
                class88.method614(var228, class91.method674((byte) -116, var226).method460(117), 126, 6);
                class42.field797 = -1;
                return true;
            }
            if (class42.field797 == 198) {
                class106.method837(false, (byte) 99);
                class42.field797 = -1;
                return true;
            }
            if (class42.field797 == 145) {
                int var229 = class9.field196.method622((byte) 102);
                int var230 = class9.field196.method623(-110);
                int var231 = class9.field196.method621(6538);
                class128.field2817 = var231 >> 1;
                class37.field667.method1013((var231 & 0x1) == 1, var230, var229, -9);
                class42.field797 = -1;
                return true;
            }
            if (class42.field797 == 178) {
                byte var232 = class9.field196.method639(false);
                int var233 = class9.field196.method659(false);
                class79.field1743[var233] = var232;
                if (class42.field804[var233] != var232) {
                    class42.field804[var233] = var232;
                    class59.method412(-127, var233);
                }
                class32.field572[class34.method213(class91.field2016++, 31)] = var233;
                class42.field797 = -1;
                return true;
            }
            if (class42.field797 == 252) {
                int var234 = class9.field196.method631(-36);
                class60 var235 = (class60) class76.field1634.method1119(28254, (long) var234);
                if (var235 != null) {
                    class61.method425(true, 87, var235);
                }
                if (class68.field1384 != null) {
                    class23.method160((byte) -29, class68.field1384);
                    class68.field1384 = null;
                }
                class42.field797 = -1;
                return true;
            }
            if (class42.field797 == 229) {
                class2.field14 = class9.field196.method630((byte) -49) * 30;
                class42.field797 = -1;
                class34.field618 = field1899;
                return true;
            }
            if (class42.field797 == 56) {
                class149.method1143(24658);
                class42.field797 = -1;
                return true;
            }
            if (class42.field797 == 74) {
                int var236 = class9.field196.method630((byte) -49);
                if (var236 == 65535) {
                    var236 = -1;
                }
                int var237 = class9.field196.method671(-488712568);
                int var238 = class9.field196.method671(-488712568);
                class72 var239 = class67.method467((byte) -13, var237);
                if (var239.field1485) {
                    var239.field1487 = var236;
                    var239.field1515 = var238;
                    class103 var241 = class123.method961(var236, 1658);
                    var239.field1539 = var241.field2294;
                    var239.field1502 = var241.field2329;
                    var239.field1567 = var241.field2305;
                    var239.field1499 = var241.field2299;
                    var239.field1461 = var241.field2328;
                    var239.field1542 = var241.field2341;
                    if (var239.field1576 > 0) {
                        var239.field1461 = var239.field1461 * 32 / var239.field1576;
                    }
                    class23.method160((byte) -29, var239);
                } else if (var236 == -1) {
                    var239.field1504 = 0;
                    class42.field797 = -1;
                    return true;
                } else {
                    class103 var240 = class123.method961(var236, 1658);
                    var239.field1502 = var240.field2329;
                    var239.field1504 = 4;
                    var239.field1542 = var240.field2341;
                    var239.field1511 = var236;
                    var239.field1461 = var240.field2328 * 100 / var238;
                    class23.method160((byte) -29, var239);
                }
                class42.field797 = -1;
                return true;
            }
            class112.method887(-32453, null, "T1 - " + class42.field797 + "," + class19.field362 + "," + class47.field910 + " - " + class155.field3544);
            class123.method962(-123);
        } catch (IOException var245) {
            class60.method421(38);
        } catch (Exception var246) {
            String var243 = "T2 - " + class42.field797 + "," + class19.field362 + "," + class47.field910 + " - " + class155.field3544 + "," + (class37.field667.field2942[0] + class130.field2863) + "," + (class37.field667.field2993[0] + class35.field647) + " - ";
            for (int var244 = 0; class155.field3544 > var244 && var244 < 50; var244++) {
                var243 = var243 + class9.field196.field1991[var244] + ",";
            }
            class112.method887(-32453, var246, var243);
            class123.method962(106);
        }
        return true;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z)V")
    public static final void method603(boolean arg0) {
        field1913++;
        class23.method160((byte) -29, class46.field859);
        class137.field3086++;
        if (class89.field1977 && class31.field559) {
            int var1 = class135.field3070;
            int var2 = var1 - class25.field461;
            if (var2 < class92.field2071) {
                var2 = class92.field2071;
            }
            int var3 = class104.field2361;
            if (class92.field2071 + class81.field1788.field1576 < var2 - -class46.field859.field1576) {
                var2 = class92.field2071 + class81.field1788.field1576 - class46.field859.field1576;
            }
            int var4 = var2 - class91.field2025;
            int var5 = var3 - class147.field3361;
            int var6 = class81.field1788.field1587 + var2 - class92.field2071;
            if (class126.field2761 > var5) {
                var5 = class126.field2761;
            }
            int var7 = class46.field859.field1543;
            if (class46.field859.field1523 + var5 > class126.field2761 + class81.field1788.field1523) {
                var5 = class126.field2761 + class81.field1788.field1523 - class46.field859.field1523;
            }
            if (!arg0) {
                field1916 = -96;
            }
            int var8 = var5 - class147.field3376;
            if (class137.field3086 > class46.field859.field1548 && (var7 < var4 || -var7 > var4 || var7 < var8 || var8 < -var7)) {
                class55.field1104 = true;
            }
            int var9 = var5 + class81.field1788.field1575 - class126.field2761;
            if (class46.field859.field1463 != null && class55.field1104) {
                class35 var10 = new class35();
                var10.field640 = class46.field859;
                var10.field630 = class46.field859.field1463;
                var10.field657 = var9;
                var10.field653 = var6;
                class71.method513((byte) 91, var10);
            }
            if (class130.field2858 == 0) {
                if (class55.field1104) {
                    if (class46.field859.field1506 != null) {
                        class35 var11 = new class35();
                        var11.field640 = class46.field859;
                        var11.field657 = var9;
                        var11.field653 = var6;
                        var11.field631 = class17.field320;
                        var11.field630 = class46.field859.field1506;
                        class71.method513((byte) -49, var11);
                    }
                    if (class17.field320 != null && class105.method830(false, class46.field859) != null) {
                        class68.field1383++;
                        class69.field1399.method285(151, (byte) 64);
                        class69.field1399.method666(class17.field320.field1540, -32768);
                        class69.field1399.method625(-128, class46.field859.field1540);
                        class69.field1399.method640(class17.field320.field1508, 76);
                        class69.field1399.method638(class46.field859.field1508, true);
                    }
                } else if ((class29.field513 == 1 || class66.method442(class69.field1419 - 1, 0)) && class69.field1419 > 2) {
                    class16.method111((byte) 127);
                } else if (class69.field1419 > 0) {
                    class25.method168(class69.field1419 - 1, -5052);
                }
                class46.field859 = null;
            }
        } else if (class137.field3086 > 1) {
            class46.field859 = null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(BLpc;Z)V")
    public static final void method604(byte arg0, class107 arg1, boolean arg2) {
        if (class15.field266 != null) {
            try {
                class15.field266.method847(-115);
            } catch (Exception var8) {
            }
            class15.field266 = null;
        }
        field1919++;
        class15.field266 = arg1;
        class134.method1018(arg2, 88);
        class60.field1196 = 0;
        class2.field19 = null;
        class144.field3327 = null;
        class93.field2090.field2043 = 0;
        while (true) {
            class120 var3 = (class120) class118.field2663.method1116(0);
            if (var3 == null) {
                if (arg0 < 19) {
                    return;
                }
                while (true) {
                    class120 var4 = (class120) class18.field330.method1116(0);
                    if (var4 == null) {
                        if (class158.field3626 != 0) {
                            try {
                                class91 var5 = new class91(4);
                                var5.method653(4, 127);
                                var5.method653(class158.field3626, 71);
                                var5.method666(0, -32768);
                                class15.field266.method842(var5.field1991, 4, 82, 0);
                            } catch (IOException var7) {
                                try {
                                    class15.field266.method847(116);
                                } catch (Exception var6) {
                                }
                                class19.field367++;
                                class15.field266 = null;
                            }
                        }
                        class151.field3454 = 0;
                        class6.field147 = class150.method1148(-85808345);
                        return;
                    }
                    class88.field1944.method827(var4, -2);
                    class145.field3339.method1115(var4.field300, var4, 1);
                    class64.field1257--;
                    class145.field3350++;
                }
            }
            class84.field1857.method1115(var3.field300, var3, 1);
            class97.field2163++;
            class58.field1157--;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lkd;I)V")
    public static final void method605(class73 arg0, int arg1) {
        field1905++;
        int var2 = 0;
        if (arg1 >= -90) {
            field1916 = -87;
        }
        while (var2 < class138.field3121.length) {
            class138.field3121[var2] = 0;
            var2++;
        }
        short var3 = 256;
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) ((double) var3 * 128.0D * Math.random());
            class138.field3121[var16] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < var3 - 1; var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = var14 + (var12 << 7);
                    class18.field336[var15] = (class138.field3121[var15 + 1] + class138.field3121[var15 - 1] + class138.field3121[var15 + 128] + class138.field3121[var15 - 128]) / 4;
                }
            }
            int[] var13 = class138.field3121;
            class138.field3121 = class18.field336;
            class18.field336 = var13;
        }
        if (arg0 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg0.field1590; var7++) {
            for (int var8 = 0; var8 < arg0.field1592; var8++) {
                if (arg0.field1591[var6++] != 0) {
                    int var9 = var8 + arg0.field1589 + 16;
                    int var10 = var7 + arg0.field1596 + 16;
                    int var11 = (var10 << 7) + var9;
                    class138.field3121[var11] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "(I)V")
    public static final void method606(int arg0) {
        field1920++;
        if (arg0 != 23977) {
            method607(116);
        }
        for (class63 var1 = (class63) class97.field2167.method26((byte) -75); var1 != null; var1 = (class63) class97.field2167.method18((byte) -128)) {
            if (class128.field2817 != var1.field1239 || var1.field1245) {
                var1.method115(26851);
            } else if (var1.field1230 <= class34.field627) {
                var1.method426(class60.field1204, (byte) -89);
                if (var1.field1245) {
                    var1.method115(26851);
                } else {
                    class134.field3044.method360(var1.field1239, var1.field1235, var1.field1228, var1.field1231, 60, var1, 0, -1, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Lfd;Lfd;IZ)V")
    public class86(class40 arg0, class40 arg1, int arg2, boolean arg3) {
        class4 var5 = new class4();
        int var6 = arg0.method263(arg2, (byte) -49);
        this.field1896 = new class54[var6];
        int[] var7 = arg0.method265(arg2, (byte) 113);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method267((byte) -124, var7[var8], arg2);
            int var10 = var9[1] & 0xFF | (var9[0] & 0xFF) << 8;
            class151 var11 = null;
            for (class151 var12 = (class151) var5.method26((byte) 113); var12 != null; var12 = (class151) var5.method18((byte) -128)) {
                if (var12.field3452 == var10) {
                    var11 = var12;
                    break;
                }
            }
            if (var11 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method258(0, var10, (byte) -88);
                } else {
                    var13 = arg1.method258(var10, 0, (byte) -88);
                }
                var11 = new class151(var10, var13);
                var5.method19((byte) -48, var11);
            }
            this.field1896[var7[var8]] = new class54(var9, var11);
        }
    }

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "(I)V")
    public static final void method607(int arg0) {
        for (int var1 = arg0; var1 < class71.field1442; var1++) {
            int var2 = class89.field1961[var1];
            class24 var3 = class152.field3479[var2];
            int var4 = class9.field196.method649(false);
            if ((var4 & 0x80) != 0) {
                var3.field442 = class106.method838(arg0 + 12861, class9.field196.method648(arg0 ^ 0x583F));
                var3.field2984 = var3.field442.field2530;
                var3.field2986 = var3.field442.field2569;
                var3.field2954 = var3.field442.field2544;
                var3.field2998 = var3.field442.field2516;
                var3.field2935 = var3.field442.field2557;
                var3.field2997 = var3.field442.field2529;
                var3.field2958 = var3.field442.field2538;
                var3.field2945 = var3.field442.field2555;
                var3.field2967 = var3.field442.field2559;
            }
            if ((var4 & 0x4) != 0) {
                int var5 = class9.field196.method630((byte) -49);
                if (var5 == 65535) {
                    var5 = -1;
                }
                int var6 = class9.field196.method623(-46);
                if (var3.field2991 == var5 && var5 != -1) {
                    int var7 = class49.method316(var5, false).field2084;
                    if (var7 == 1) {
                        var3.field2987 = var6;
                        var3.field2944 = 0;
                        var3.field2933 = 0;
                        var3.field2975 = 0;
                    }
                    if (var7 == 2) {
                        var3.field2944 = 0;
                    }
                } else if (var5 == -1 || var3.field2991 == -1 || class49.method316(var5, false).field2082 >= class49.method316(var3.field2991, false).field2082) {
                    var3.field2991 = var5;
                    var3.field2950 = var3.field2947;
                    var3.field2975 = 0;
                    var3.field2933 = 0;
                    var3.field2987 = var6;
                    var3.field2944 = 0;
                }
            }
            if ((var4 & 0x2) != 0) {
                int var8 = class9.field196.method622((byte) 102);
                int var9 = class9.field196.method649(false);
                var3.method1012(var9, -124, class34.field627, var8);
                var3.field2951 = class34.field627 + 300;
                var3.field2974 = class9.field196.method622((byte) 102);
                var3.field2995 = class9.field196.method621(6538);
            }
            if ((var4 & 0x20) != 0) {
                var3.field2989 = class9.field196.method634(-1);
                var3.field2948 = 100;
            }
            if ((var4 & 0x40) != 0) {
                int var10 = class9.field196.method623(-70);
                int var11 = class9.field196.method622((byte) 102);
                var3.method1012(var11, -125, class34.field627, var10);
                var3.field2951 = class34.field627 + 300;
                var3.field2974 = class9.field196.method649(false);
                var3.field2995 = class9.field196.method621(6538);
            }
            if ((var4 & 0x10) != 0) {
                var3.field2970 = class9.field196.method641(255);
                var3.field2994 = class9.field196.method641(255);
            }
            if ((var4 & 0x8) != 0) {
                var3.field2988 = class9.field196.method641(255);
                if (var3.field2988 == 65535) {
                    var3.field2988 = -1;
                }
            }
            if ((var4 & 0x1) != 0) {
                var3.field2990 = class9.field196.method648(22591);
                int var12 = class9.field196.method671(-488712568);
                var3.field2941 = 0;
                var3.field2983 = (var12 & 0xFFFF) + class34.field627;
                if (var3.field2983 > class34.field627) {
                    var3.field2941 = -1;
                }
                if (var3.field2990 == 65535) {
                    var3.field2990 = -1;
                }
                var3.field2966 = 0;
                var3.field2962 = var12 >> 16;
            }
        }
        field1904++;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIZII)V")
    public static final void method608(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        class14.field250 = 0;
        field1908++;
        for (int var5 = -1; var5 < class155.field3540 + class123.field2743; var5++) {
            class133 var21;
            if (var5 == -1) {
                var21 = class37.field667;
            } else if (var5 >= class155.field3540) {
                var21 = class152.field3479[class45.field836[var5 - class155.field3540]];
            } else {
                var21 = class85.field1885[class151.field3464[var5]];
            }
            if (var21 != null && var21.method164((byte) 123)) {
                if (var21 instanceof class24) {
                    class112 var22 = ((class24) var21).field442;
                    if (var22.field2536 != null) {
                        var22 = var22.method890(-1);
                    }
                    if (var22 == null) {
                        continue;
                    }
                }
                if (var5 >= class155.field3540) {
                    class112 var25 = ((class24) var21).field442;
                    if (var25.field2536 != null) {
                        var25 = var25.method890(-1);
                    }
                    if (var25.field2521 >= 0 && var25.field2521 < class77.field1692.length) {
                        class97.method760(var21, var21.field2940 + 15, (byte) -84);
                        if (class148.field3401 > -1) {
                            class77.field1692[var25.field2521].method916(class148.field3401 + arg4 - 12, class142.field3281 + arg3 + -30);
                        }
                    }
                    if (class37.field668 == 1 && class45.field836[var5 - class155.field3540] == class47.field911 && class34.field627 % 20 < 10) {
                        class97.method760(var21, var21.field2940 + 15, (byte) -84);
                        if (class148.field3401 > -1) {
                            class61.field1218[0].method916(arg4 + class148.field3401 - 12, class142.field3281 + arg3 + -28);
                        }
                    }
                } else {
                    int var23 = 30;
                    class83 var24 = (class83) var21;
                    if (var24.field1831 != -1 || var24.field1845 != -1) {
                        class97.method760(var21, var21.field2940 + 15, (byte) -84);
                        if (class148.field3401 > -1) {
                            if (var24.field1831 != -1) {
                                class80.field1775[var24.field1831].method916(class148.field3401 + arg4 - 12, class142.field3281 + arg3 + -var23);
                                var23 += 25;
                            }
                            if (var24.field1845 != -1) {
                                class77.field1692[var24.field1845].method916(class148.field3401 + arg4 - 12, arg3 - -class142.field3281 + -var23);
                                var23 += 25;
                            }
                        }
                    }
                    if (var5 >= 0 && class37.field668 == 10 && class151.field3464[var5] == class103.field2295) {
                        class97.method760(var21, var21.field2940 + 15, (byte) -84);
                        if (class148.field3401 > -1) {
                            class61.field1218[1].method916(class148.field3401 + arg4 - 12, -var23 + class142.field3281 + arg3);
                        }
                    }
                }
                if (var21.field2989 != null && (var5 >= class155.field3540 || class29.field516 == 0 || class29.field516 == 3 || class29.field516 == 1 && class47.method310(-128, ((class83) var21).field1854))) {
                    class97.method760(var21, var21.field2940, (byte) -84);
                    if (class148.field3401 > -1 && class149.field3419 > class14.field250) {
                        class149.field3404[class14.field250] = class89.field1976.method797(var21.field2989) / 2;
                        class149.field3408[class14.field250] = class89.field1976.field2226;
                        class149.field3405[class14.field250] = class148.field3401;
                        class149.field3431[class14.field250] = class142.field3281;
                        class149.field3416[class14.field250] = var21.field2977;
                        class149.field3424[class14.field250] = var21.field2965;
                        class149.field3432[class14.field250] = var21.field2948;
                        class149.field3411[class14.field250] = var21.field2989;
                        class14.field250++;
                    }
                }
                if (class34.field627 < var21.field2951) {
                    class97.method760(var21, var21.field2940 + 15, (byte) -84);
                    if (class148.field3401 > -1) {
                        int var26 = var21.field2974 * 30 / var21.field2995;
                        if (var26 > 30) {
                            var26 = 30;
                        }
                        class8.method70(arg4 + class148.field3401 - 15, class142.field3281 + -3 + arg3, var26, 5, 65280);
                        class8.method70(class148.field3401 + arg4 + var26 - 15, class142.field3281 + arg3 + -3, 30 - var26, 5, 16711680);
                    }
                }
                for (int var27 = 0; var27 < 4; var27++) {
                    if (var21.field2955[var27] > class34.field627) {
                        class97.method760(var21, var21.field2940 / 2, (byte) -84);
                        if (class148.field3401 > -1) {
                            if (var27 == 1) {
                                class142.field3281 -= 20;
                            }
                            if (var27 == 2) {
                                class148.field3401 -= 15;
                                class142.field3281 -= 10;
                            }
                            if (var27 == 3) {
                                class148.field3401 += 15;
                                class142.field3281 -= 10;
                            }
                            class31.field563[var21.field2961[var27]].method916(class148.field3401 + arg4 - 12, arg3 - -class142.field3281 + -12);
                            class116.field2625.method791(class60.method420(var21.field2937[var27], 28498), class148.field3401 + arg4 - 1, arg3 + 3 + class142.field3281, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var6 = 0; var6 < class14.field250; var6++) {
            int var7 = class149.field3405[var6];
            int var8 = class149.field3404[var6];
            int var9 = class149.field3408[var6];
            int var10 = class149.field3431[var6];
            boolean var11 = true;
            while (var11) {
                var11 = false;
                for (int var20 = 0; var20 < var6; var20++) {
                    if (class149.field3431[var20] - class149.field3408[var20] < var10 + 2 && var10 - var9 < class149.field3431[var20] + 2 && class149.field3405[var20] + class149.field3404[var20] > -var8 + var7 && var7 + var8 > class149.field3405[var20] + -class149.field3404[var20] && class149.field3431[var20] - class149.field3408[var20] < var10) {
                        var10 = class149.field3431[var20] - class149.field3408[var20];
                        var11 = true;
                    }
                }
            }
            class148.field3401 = class149.field3405[var6];
            class142.field3281 = class149.field3431[var6] = var10;
            class67 var12 = class149.field3411[var6];
            if (class132.field2906 == 0) {
                int var13 = 16776960;
                if (class149.field3416[var6] < 6) {
                    var13 = class82.field1812[class149.field3416[var6]];
                }
                if (class149.field3416[var6] == 6) {
                    var13 = class117.field2636 % 20 < 10 ? 16711680 : 16776960;
                }
                if (class149.field3416[var6] == 7) {
                    var13 = class117.field2636 % 20 >= 10 ? 65535 : 255;
                }
                if (class149.field3416[var6] == 8) {
                    var13 = class117.field2636 % 20 >= 10 ? 8454016 : 45056;
                }
                if (class149.field3416[var6] == 9) {
                    int var14 = 150 - class149.field3432[var6];
                    if (var14 < 50) {
                        var13 = var14 * 1280 + 16711680;
                    } else if (var14 < 100) {
                        var13 = 16776960 + 16384000 - var14 * 327680;
                    } else if (var14 < 150) {
                        var13 = (var14 - 100) * 5 + 65280;
                    }
                }
                if (class149.field3416[var6] == 10) {
                    int var15 = 150 - class149.field3432[var6];
                    if (var15 < 50) {
                        var13 = var15 * 5 + 16711680;
                    } else if (var15 < 100) {
                        var13 = 16711935 - (var15 - 50) * 327680;
                    } else if (var15 < 150) {
                        var13 = (var15 - 100) * 327680 + 255 + 500 - var15 * 5;
                    }
                }
                if (class149.field3416[var6] == 11) {
                    int var16 = 150 - class149.field3432[var6];
                    if (var16 < 50) {
                        var13 = 16777215 - var16 * 327685;
                    } else if (var16 < 100) {
                        var13 = var16 * 327685 + 65280 - 16384250;
                    } else if (var16 < 150) {
                        var13 = 16777215 - (var16 - 100) * 327680;
                    }
                }
                if (class149.field3424[var6] == 0) {
                    class89.field1976.method791(var12, class148.field3401 + arg4, class142.field3281 + arg3, var13, 0);
                }
                if (class149.field3424[var6] == 1) {
                    class89.field1976.method790(var12, class148.field3401 + arg4, class142.field3281 + arg3, var13, 0, class117.field2636);
                }
                if (class149.field3424[var6] == 2) {
                    class89.field1976.method794(var12, class148.field3401 + arg4, class142.field3281 + arg3, var13, 0, class117.field2636);
                }
                if (class149.field3424[var6] == 3) {
                    class89.field1976.method781(var12, class148.field3401 + arg4, arg3 - -class142.field3281, var13, 0, class117.field2636, 150 - class149.field3432[var6]);
                }
                if (class149.field3424[var6] == 4) {
                    int var17 = (150 - class149.field3432[var6]) * (class89.field1976.method797(var12) + 100) / 150;
                    class8.method75(class148.field3401 + arg4 - 50, arg3, class148.field3401 + arg4 + 50, arg1 + arg3);
                    class89.field1976.method793(var12, arg4 + class148.field3401 + 50 - var17, arg3 - -class142.field3281, var13, 0);
                    class8.method60(arg4, arg3, arg4 + arg0, arg3 - -arg1);
                }
                if (class149.field3424[var6] == 5) {
                    int var18 = 150 - class149.field3432[var6];
                    class8.method75(arg4, arg3 + class142.field3281 - class89.field1976.field2226 - 1, arg0 + arg4, arg3 + class142.field3281 + 5);
                    int var19 = 0;
                    if (var18 < 25) {
                        var19 = var18 - 25;
                    } else if (var18 > 125) {
                        var19 = var18 - 125;
                    }
                    class89.field1976.method791(var12, class148.field3401 + arg4, class142.field3281 + arg3 - -var19, var13, 0);
                    class8.method60(arg4, arg3, arg0 + arg4, arg1 + arg3);
                }
            } else {
                class89.field1976.method791(var12, class148.field3401 + arg4, class142.field3281 + arg3, 16776960, 0);
            }
        }
        if (arg2) {
            method602(-55);
        }
    }
}
