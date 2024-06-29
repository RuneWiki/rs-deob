import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class272 {

    @OriginalMember(owner = "client!t", name = "b", descriptor = "[I")
    public static int[] field4646 = new int[] { 0, 0, 3, 0, 3, 0, 0, -1, 5, 7, 0, 1, 0, 0, 0, 0, 0, -1, 8, 0, 0, 0, -2, 0, 5, 0, 0, -1, 0, 20, 0, 0, 0, -2, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 6, 0, 0, 2, 0, 2, 5, 0, 0, 7, 3, 0, 0, 0, 0, 5, 0, 0, 5, 0, 0, 0, -1, 6, 0, 0, -2, 2, 0, 0, 0, 0, -1, 0, 5, 0, -1, 0, 0, 6, 0, 0, 7, 0, 0, -2, 6, 14, 0, 1, 0, 0, 4, 0, 0, 0, 0, 0, 3, 0, 7, -1, 0, 0, -1, 0, 6, 24, 10, 0, 2, 0, 9, -2, 3, 0, 0, 4, 0, 1, 4, 0, 0, 0, 0, 0, 0, 0, 6, -2, 0, 8, 0, 0, 4, 0, 4, 0, 0, 12, 0, 8, 0, 0, 0, 0, -2, 6, -2, 0, 0, -2, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 6, 2, 0, -2, 10, 0, -2, 0, 0, 0, 4, 0, 0, 0, -1, 0, -2, 0, 8, 0, 0, 0, 4, 0, 0, 6, 10, -2, 0, 6, 0, 0, 8, 5, 0, 15, 6, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 4, 0, 0, 0, 2, 0, -1, 0, 4, -2, 1, 0, 0, 15, 0, 6, 0, 0, 0 };

    @OriginalMember(owner = "client!t", name = "c", descriptor = "Lma;")
    private static class5 field4647 = class12.method119("Allocating memory", (byte) 78);

    @OriginalMember(owner = "client!t", name = "d", descriptor = "Lma;")
    public static class5 field4648 = class12.method119(" ", (byte) 112);

    @OriginalMember(owner = "client!t", name = "k", descriptor = "Lma;")
    public static class5 field4655 = field4647;

    @OriginalMember(owner = "client!t", name = "m", descriptor = "[[S")
    public static short[][] field4657 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!t", name = "e", descriptor = "I")
    public static int field4649 = -1;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "Lma;")
    public static class5 field4645 = class12.method119("M", (byte) 114);

    @OriginalMember(owner = "client!t", name = "f", descriptor = "I")
    public static int field4650;

    @OriginalMember(owner = "client!t", name = "g", descriptor = "I")
    public static int field4651;

    @OriginalMember(owner = "client!t", name = "h", descriptor = "I")
    public static int field4652;

    @OriginalMember(owner = "client!t", name = "j", descriptor = "I")
    public static int field4654;

    @OriginalMember(owner = "client!t", name = "l", descriptor = "I")
    public static int field4656;

    @OriginalMember(owner = "client!t", name = "n", descriptor = "I")
    public static int field4658;

    @OriginalMember(owner = "client!t", name = "i", descriptor = "Lbd;")
    public static class27 field4653;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IB)Z", line = 7)
    public static final boolean method1858(int arg0, byte arg1) {
        field4651++;
        if (arg1 < 3) {
            method1862(-119, 78);
        }
        return (arg0 & 0x6D137679) >> 30 != 0;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIILu;Z)V", line = 24)
    public static final void method1859(int arg0, int arg1, int arg2, int arg3, class33 arg4, boolean arg5) {
        field4650++;
        if (class186.field2934 >= 50 || arg4.field510 == null || arg4.field510.length <= arg3 || arg4.field510[arg3] == null) {
            return;
        }
        int var6 = arg4.field510[arg3][0];
        int var7 = var6 >> 8;
        if (arg4.field510[arg3].length > 1) {
            int var8 = (int) (Math.random() * (double) arg4.field510[arg3].length);
            if (var8 > 0) {
                var7 = arg4.field510[arg3][var8];
            }
        }
        int var9 = var6 & 0xF;
        int var10 = var6 >> 4 & 0x7;
        if (var9 == 0) {
            if (arg5) {
                class188.method1236(var7, var10, 0, 0);
            }
        } else if (class130.field1955 != 0) {
            class152.field2222[class186.field2934] = var7;
            if (arg2 == 64) {
                class24.field411[class186.field2934] = var10;
                class29.field470[class186.field2934] = 0;
                int var11 = (arg0 - 64) / 128;
                class142.field2085[class186.field2934] = null;
                int var12 = (arg1 - 64) / 128;
                class185.field2894[class186.field2934] = (var11 << 16) + (var12 << 8) + var9;
                class186.field2934++;
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(B)V", line = 96)
    public static final void method1860(byte arg0) {
        if (class88.field1317 > 1) {
            class88.field1317--;
            class123.field1868 = class303.field5107;
        }
        field4656++;
        if (class74.field1168 > 0) {
            class74.field1168--;
        }
        if (class74.field1169) {
            class74.field1169 = false;
            class231.method1644((byte) 126);
            return;
        }
        for (int var1 = 0; var1 < 100 && class197.method1304(3); var1++) {
        }
        if (class5.field58 != 30) {
            return;
        }
        class48.method359(4, class147.field2127, 112);
        Object var2 = class185.field2888.field2635;
        synchronized (class185.field2888.field2635) {
            if (!class168.field2571) {
                class185.field2888.field2638 = 0;
            } else if (class139.field2059 != 0 || class185.field2888.field2638 >= 40) {
                class47.field724++;
                int var3 = 0;
                class147.field2127.method1389((byte) -53, 210);
                class147.field2127.method1542(-64, 0);
                int var4 = class147.field2127.field3610;
                for (int var5 = 0; var5 < class185.field2888.field2638 && class147.field2127.field3610 - var4 < 240; var5++) {
                    int var6 = class185.field2888.field2639[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    var3++;
                    int var7 = class185.field2888.field2641[var5];
                    boolean var8 = false;
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 65534) {
                        var7 = 65534;
                    }
                    if (class185.field2888.field2639[var5] == -1 && class185.field2888.field2641[var5] == -1) {
                        var8 = true;
                        var6 = -1;
                        var7 = -1;
                    }
                    if (class235.field3879 != var7 || class117.field1772 != var6) {
                        int var9 = var6 - class117.field1772;
                        class117.field1772 = var6;
                        int var10 = var7 - class235.field3879;
                        class235.field3879 = var7;
                        if (class110.field1636 < 8 && var10 >= -32 && var10 <= 31 && var9 >= -32 && var9 <= 31) {
                            var10 += 32;
                            var9 += 32;
                            class147.field2127.method1539((class110.field1636 << 12) + (var10 << 6) + var9, false);
                            class110.field1636 = 0;
                        } else if (class110.field1636 < 32 && var10 >= -128 && var10 <= 127 && var9 >= -128 && var9 <= 127) {
                            class147.field2127.method1542(-120, class110.field1636 + 128);
                            var9 += 128;
                            var10 += 128;
                            class147.field2127.method1539((var10 << 8) + var9, false);
                            class110.field1636 = 0;
                        } else if (class110.field1636 < 32) {
                            class147.field2127.method1542(-68, class110.field1636 + 192);
                            if (var8) {
                                class147.field2127.method1513(Integer.MIN_VALUE, false);
                            } else {
                                class147.field2127.method1513(var6 << 16 | var7, false);
                            }
                            class110.field1636 = 0;
                        } else {
                            class147.field2127.method1539(class110.field1636 + 57344, false);
                            if (var8) {
                                class147.field2127.method1513(Integer.MIN_VALUE, false);
                            } else {
                                class147.field2127.method1513(var7 | var6 << 16, false);
                            }
                            class110.field1636 = 0;
                        }
                    } else if (class110.field1636 < 2047) {
                        class110.field1636++;
                    }
                }
                class147.field2127.method1546(class147.field2127.field3610 - var4, -13204);
                if (class185.field2888.field2638 > var3) {
                    class185.field2888.field2638 -= var3;
                    for (int var11 = 0; var11 < class185.field2888.field2638; var11++) {
                        class185.field2888.field2641[var11] = class185.field2888.field2641[var11 + var3];
                        class185.field2888.field2639[var11] = class185.field2888.field2639[var11 + var3];
                    }
                } else {
                    class185.field2888.field2638 = 0;
                }
            }
        }
        if (class139.field2059 != 0) {
            long var13 = (class136.field2016 - class249.field4121) / 50L;
            class249.field4121 = class136.field2016;
            if (var13 > 32767L) {
                var13 = 32767L;
            }
            class49.field762++;
            int var15 = class289.field4915;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            int var16 = (int) var13;
            int var17 = class104.field1545;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 65535) {
                var17 = 65535;
            }
            byte var18 = 0;
            if (class139.field2059 == 2) {
                var18 = 1;
            }
            class147.field2127.method1389((byte) 126, 169);
            class147.field2127.method1557(var16 | var18 << 15, -7351);
            class147.field2127.method1513(var15 << 16 | var17, false);
        }
        if (class234.field3872[96] || class234.field3872[97] || class234.field3872[98] || class234.field3872[99]) {
            class158.field2371 = true;
        }
        if (class245.field4063 > 0) {
            class245.field4063--;
        }
        if (class158.field2371 && class245.field4063 <= 0) {
            class158.field2371 = false;
            class245.field4063 = 20;
            class147.field2127.method1389((byte) 116, 32);
            class147.field2127.method1502(-52, class46.field707);
            class147.field2127.method1539(class24.field416, false);
            class165.field2521++;
        }
        if (class290.field4938 && !class137.field2026) {
            class226.field3711++;
            class137.field2026 = true;
            class147.field2127.method1389((byte) 122, 92);
            class147.field2127.method1542(-114, 1);
        }
        if (!class290.field4938 && class137.field2026) {
            class226.field3711++;
            class137.field2026 = false;
            class147.field2127.method1389((byte) 108, 92);
            class147.field2127.method1542(-78, 0);
        }
        if (!class37.field587) {
            class147.field2127.method1389((byte) -69, 36);
            class241.field3997++;
            class147.field2127.method1519(class219.method1488(17029), 1948485776);
            class37.field587 = true;
        }
        class66.method470(true);
        if (class5.field58 != 30) {
            return;
        }
        class35.method256(16556);
        class238.method1684(-1);
        class15.field281++;
        if (class15.field281 > 750) {
            class231.method1644((byte) 122);
            return;
        }
        class115.method754(-27148);
        class248.method1732(0);
        class100.method639(-78);
        if (class158.field2377 != null) {
            class271.method1856(71);
        }
        for (int var19 = class267.method1834(0, true); var19 != -1; var19 = class267.method1834(0, false)) {
            class179.method1167(var19, -24523764);
            class164.field2500[class204.method1354(31, class100.field1494++)] = var19;
        }
        for (class250 var20 = class288.method1951(719); var20 != null; var20 = class288.method1951(719)) {
            int var21 = var20.method1745(1346221920);
            int var22 = var20.method1746(-47);
            if (var21 == 1) {
                class10.field149[var22] = var20.field4137;
                class282.field4785[class204.method1354(class283.field4796++, 31)] = var22;
            } else if (var21 == 2) {
                class137.field2040[var22] = var20.field4135;
                class69.field1096[class204.method1354(31, class198.field3169++)] = var22;
            }
        }
        class282.field4788++;
        int var23 = 62 / ((arg0 + 14) / 45);
        if (class48.field738 != 0) {
            class98.field1474 += 20;
            if (class98.field1474 >= 400) {
                class48.field738 = 0;
            }
        }
        if (class264.field4493 != null) {
            class111.field1648++;
            if (class111.field1648 >= 15) {
                class29.method205(class264.field4493, (byte) 99);
                class264.field4493 = null;
            }
        }
        if (class300.field5066 != null) {
            class29.method205(class300.field5066, (byte) 114);
            class294.field4965++;
            if (class72.field1131 + 5 < class271.field4636 || (class72.field1131 - 5) > class271.field4636 || class158.field2383 + 5 < class18.field308 || class18.field308 < class158.field2383 - 5) {
                class284.field4808 = true;
            }
            if (class122.field1844 == 0) {
                if (class284.field4808 && class294.field4965 >= 5) {
                    if (class300.field5066 == class235.field3888 && class23.field407 != class152.field2204) {
                        class151.field2184++;
                        class253 var24 = class300.field5066;
                        byte var25 = 0;
                        if (class115.field1719 == 1 && var24.field4238 == 206) {
                            var25 = 1;
                        }
                        if (var24.field4257[class23.field407] <= 0) {
                            var25 = 0;
                        }
                        if (class297.method2005((byte) 86, client.method767(var24))) {
                            int var28 = class152.field2204;
                            int var29 = class23.field407;
                            var24.field4257[var29] = var24.field4257[var28];
                            var24.field4317[var29] = var24.field4317[var28];
                            var24.field4257[var28] = -1;
                            var24.field4317[var28] = 0;
                        } else if (var25 == 1) {
                            int var26 = class23.field407;
                            int var27 = class152.field2204;
                            while (var26 != var27) {
                                if (var27 > var26) {
                                    var24.method1766(var27 - 1, (byte) -106, var27);
                                    var27--;
                                } else if (var27 < var26) {
                                    var24.method1766(var27 + 1, (byte) -108, var27);
                                    var27++;
                                }
                            }
                        } else {
                            var24.method1766(class23.field407, (byte) -103, class152.field2204);
                        }
                        class147.field2127.method1389((byte) -33, 153);
                        class147.field2127.method1550(class300.field5066.field4206, (byte) 97);
                        class147.field2127.method1512(var25, true);
                        class147.field2127.method1526(26828, class23.field407);
                        class147.field2127.method1526(26828, class152.field2204);
                    }
                } else if ((class18.field317 == 1 || class287.method1935(class282.field4794 - 1, 1005)) && class282.field4794 > 2) {
                    class5.method52((byte) -105);
                } else if (class282.field4794 > 0) {
                    class268.method1848(0);
                }
                class300.field5066 = null;
                class139.field2059 = 0;
                class111.field1648 = 10;
            }
        }
        class135.field1997 = false;
        class182.field2778 = false;
        class221.field3590 = 0;
        class211.field3356 = null;
        class253 var30 = class29.field480;
        class29.field480 = null;
        class253 var31 = class267.field4582;
        class267.field4582 = null;
        while (class239.method1691(false) && class221.field3590 < 128) {
            class90.field1345[class221.field3590] = class289.field4914;
            class129.field1929[class221.field3590] = class186.field2931;
            class221.field3590++;
        }
        class158.field2377 = null;
        if (class255.field4354 != -1) {
            class85.method568(0, 0, class156.field2314, class255.field4362, 0, class255.field4354, 0, -62);
        }
        class303.field5107++;
        while (true) {
            class256 var32;
            class253 var33;
            class253 var34;
            do {
                var32 = (class256) class127.field1909.method1481(true);
                if (var32 == null) {
                    while (true) {
                        class256 var35;
                        class253 var36;
                        class253 var37;
                        do {
                            var35 = (class256) class161.field2461.method1481(true);
                            if (var35 == null) {
                                while (true) {
                                    class256 var38;
                                    class253 var39;
                                    class253 var40;
                                    do {
                                        var38 = (class256) class157.field2360.method1481(true);
                                        if (var38 == null) {
                                            if (class278.field4720 && class158.field2377 == null) {
                                                class278.field4720 = false;
                                            }
                                            if (class174.field2664 != null) {
                                                client.method774((byte) 113);
                                            }
                                            if (class1.field3 > 0 && class234.field3872[82] && class234.field3872[81] && class65.field1025 != 0) {
                                                int var41 = class276.field4701 - class65.field1025;
                                                if (var41 < 0) {
                                                    var41 = 0;
                                                } else if (var41 > 3) {
                                                    var41 = 3;
                                                }
                                                class186.method1231(class151.field2183.field175[0] + class193.field3017, var41, -11042, class151.field2183.field186[0] + class74.field1158);
                                            }
                                            if (class242.field4026 != -1) {
                                                int var42 = class242.field4026;
                                                int var43 = class182.field2772;
                                                if (class1.field3 > 0 && class234.field3872[82] && class234.field3872[81]) {
                                                    class186.method1231(class193.field3017 + var42, class276.field4701, -11042, class74.field1158 + var43);
                                                } else {
                                                    boolean var44 = class149.method939(0, 0, var42, 0, 0, 0, 126, 0, var43, true, class151.field2183.field186[0], class151.field2183.field175[0]);
                                                    if (var44) {
                                                        class213.field3385 = class104.field1545;
                                                        class48.field738 = 1;
                                                        class33.field507 = class289.field4915;
                                                        class98.field1474 = 0;
                                                    }
                                                }
                                                class242.field4026 = -1;
                                            }
                                            class35.method255(-34);
                                            if (class29.field480 != var30) {
                                                if (var30 != null) {
                                                    class29.method205(var30, (byte) 104);
                                                }
                                                if (class29.field480 != null) {
                                                    class29.method205(class29.field480, (byte) 115);
                                                }
                                            }
                                            if (class267.field4582 != var31 && class294.field4962 == class194.field3022) {
                                                if (var31 != null) {
                                                    class29.method205(var31, (byte) 95);
                                                }
                                                if (class267.field4582 != null) {
                                                    class29.method205(class267.field4582, (byte) 104);
                                                }
                                            }
                                            if (class267.field4582 == null) {
                                                if (class194.field3022 > 0) {
                                                    class194.field3022--;
                                                }
                                            } else if (class294.field4962 > class194.field3022) {
                                                class194.field3022++;
                                                if (class294.field4962 == class194.field3022) {
                                                    class29.method205(class267.field4582, (byte) 121);
                                                }
                                            }
                                            if (class270.field4631 == 1) {
                                                class180.method1169(true);
                                            } else if (class270.field4631 == 2) {
                                                class97.method619(2048);
                                            } else {
                                                class177.method1154((byte) -121);
                                            }
                                            for (int var45 = 0; var45 < 5; var45++) {
                                                int var10002 = class249.field4118[var45]++;
                                            }
                                            int var46 = class296.method1995(110);
                                            int var47 = class240.method1696((byte) 122);
                                            if (var46 > 4500 && var47 > 4500) {
                                                class74.field1168 = 250;
                                                class196.method1291(4000, (byte) 110);
                                                class133.field1983++;
                                                class147.field2127.method1389((byte) 115, 69);
                                            }
                                            class290.field4934++;
                                            class142.field2089++;
                                            class175.field2680++;
                                            if (class290.field4934 > 500) {
                                                class290.field4934 = 0;
                                                int var48 = (int) (Math.random() * 8.0D);
                                                if ((var48 & 0x2) == 2) {
                                                    class43.field644 += class14.field262;
                                                }
                                                if ((var48 & 0x4) == 4) {
                                                    class2.field25 += class237.field3912;
                                                }
                                                if ((var48 & 0x1) == 1) {
                                                    class280.field4739 += class130.field1954;
                                                }
                                            }
                                            if (class43.field644 < -55) {
                                                class14.field262 = 2;
                                            }
                                            if (class2.field25 < -40) {
                                                class237.field3912 = 1;
                                            }
                                            if (class142.field2089 > 500) {
                                                class142.field2089 = 0;
                                                int var49 = (int) (Math.random() * 8.0D);
                                                if ((var49 & 0x1) == 1) {
                                                    class14.field268 += class206.field3279;
                                                }
                                                if ((var49 & 0x2) == 2) {
                                                    class236.field3894 += class189.field2961;
                                                }
                                            }
                                            if (class43.field644 > 55) {
                                                class14.field262 = -2;
                                            }
                                            if (class280.field4739 < -50) {
                                                class130.field1954 = 2;
                                            }
                                            if (class280.field4739 > 50) {
                                                class130.field1954 = -2;
                                            }
                                            if (class2.field25 > 40) {
                                                class237.field3912 = -1;
                                            }
                                            if (class236.field3894 < -20) {
                                                class189.field2961 = 1;
                                            }
                                            if (class236.field3894 > 10) {
                                                class189.field2961 = -1;
                                            }
                                            if (class14.field268 < -60) {
                                                class206.field3279 = 2;
                                            }
                                            if (class14.field268 > 60) {
                                                class206.field3279 = -2;
                                            }
                                            if (class175.field2680 > 50) {
                                                class147.field2127.method1389((byte) -63, 209);
                                                client.field1745++;
                                            }
                                            class297.method1998(-2035);
                                            try {
                                                if (class47.field725 != null && class147.field2127.field3610 > 0) {
                                                    class47.field725.method1185(-22036, class147.field2127.field3610, class147.field2127.field3617, 0);
                                                    class175.field2680 = 0;
                                                    class147.field2127.field3610 = 0;
                                                }
                                            } catch (IOException var51) {
                                                class231.method1644((byte) 116);
                                            }
                                            return;
                                        }
                                        var39 = var38.field4382;
                                        if (var39.field4210 < 0) {
                                            break;
                                        }
                                        var40 = class172.method1140(var39.field4196, -116);
                                    } while (var40 == null || var40.field4275 == null || var39.field4210 >= var40.field4275.length || var40.field4275[var39.field4210] != var39);
                                    class12.method122(var38, (byte) -97);
                                }
                            }
                            var36 = var35.field4382;
                            if (var36.field4210 < 0) {
                                break;
                            }
                            var37 = class172.method1140(var36.field4196, -114);
                        } while (var37 == null || var37.field4275 == null || var37.field4275.length <= var36.field4210 || var37.field4275[var36.field4210] != var36);
                        class12.method122(var35, (byte) -57);
                    }
                }
                var33 = var32.field4382;
                if (var33.field4210 < 0) {
                    break;
                }
                var34 = class172.method1140(var33.field4196, -126);
            } while (var34 == null || var34.field4275 == null || var34.field4275.length <= var33.field4210 || var34.field4275[var33.field4210] != var33);
            class12.method122(var32, (byte) -68);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V", line = 846)
    public static void method1861(int arg0) {
        int var1 = 99 / ((arg0 - 47) / 55);
        field4646 = null;
        field4655 = null;
        field4657 = (short[][]) null;
        field4647 = null;
        field4648 = null;
        field4645 = null;
        field4653 = null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(II)Lqk;", line = 872)
    public static final class8 method1862(int arg0, int arg1) {
        field4654++;
        class8 var2 = (class8) class214.field3406.method964(arg1 ^ 0xFFFFFEFF, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 < 32768) {
            var3 = class105.field1563.method1342(arg1 + 36, 0, arg0);
        } else {
            var3 = class195.field3041.method1342(-107, 0, arg0 & 0x7FFF);
        }
        class8 var4 = new class8();
        if (arg1 != 0) {
            field4655 = (class5) null;
        }
        if (var3 != null) {
            var4.method95(new class221(var3), (byte) -107);
        }
        if (arg0 >= 32768) {
            var4.method93((byte) -50);
        }
        class214.field3406.method966(var4, (long) arg0, (byte) 73);
        return var4;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIII)V", line = 924)
    public static final void method1863(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4652++;
        if (arg0 != 0) {
            field4645 = (class5) null;
        }
        if (arg3 > arg2) {
            for (int var5 = arg2; var5 < arg3; var5++) {
                class137.field2032[var5][arg4] = arg1;
            }
        } else {
            for (int var6 = arg3; var6 < arg2; var6++) {
                class137.field2032[var6][arg4] = arg1;
            }
        }
    }
}
