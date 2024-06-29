import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class79 {

    @OriginalMember(owner = "client!hi", name = "q", descriptor = "Lse;")
    public static class175 field1843 = new class175();

    @OriginalMember(owner = "client!hi", name = "y", descriptor = "Ldd;")
    public static class35 field1851 = class180.method1196((byte) 127, "runes");

    @OriginalMember(owner = "client!hi", name = "v", descriptor = "I")
    public static int field1848 = 0;

    @OriginalMember(owner = "client!hi", name = "A", descriptor = "Ldd;")
    public static class35 field1853 = class180.method1196((byte) 126, "Ihr Charakter)2Profil wird in:");

    @OriginalMember(owner = "client!hi", name = "w", descriptor = "Ldd;")
    public static class35 field1849 = class180.method1196((byte) -39, "Angreifen");

    @OriginalMember(owner = "client!hi", name = "E", descriptor = "Ldd;")
    public static class35 field1857 = class180.method1196((byte) 126, "Keine Antwort vom Anmelde)2Server)3");

    @OriginalMember(owner = "client!hi", name = "B", descriptor = "I")
    public static int field1854 = 0;

    @OriginalMember(owner = "client!hi", name = "D", descriptor = "Lth;")
    public static class187 field1856 = new class187();

    @OriginalMember(owner = "client!hi", name = "G", descriptor = "[I")
    public static int[] field1859 = new int[50];

    @OriginalMember(owner = "client!hi", name = "F", descriptor = "I")
    public static int field1858 = 0;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
    public int field1828;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
    public int field1829;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "I")
    public int field1831;

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "I")
    public int field1832;

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "I")
    public int field1833;

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "I")
    public int field1834;

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "I")
    public int field1835;

    @OriginalMember(owner = "client!hi", name = "j", descriptor = "I")
    public int field1836;

    @OriginalMember(owner = "client!hi", name = "k", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!hi", name = "l", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!hi", name = "m", descriptor = "I")
    public int field1839;

    @OriginalMember(owner = "client!hi", name = "n", descriptor = "I")
    public int field1840;

    @OriginalMember(owner = "client!hi", name = "o", descriptor = "I")
    public int field1841;

    @OriginalMember(owner = "client!hi", name = "p", descriptor = "I")
    public int field1842;

    @OriginalMember(owner = "client!hi", name = "r", descriptor = "I")
    public int field1844;

    @OriginalMember(owner = "client!hi", name = "s", descriptor = "I")
    public int field1845;

    @OriginalMember(owner = "client!hi", name = "t", descriptor = "I")
    public int field1846;

    @OriginalMember(owner = "client!hi", name = "u", descriptor = "I")
    public int field1847;

    @OriginalMember(owner = "client!hi", name = "x", descriptor = "I")
    public int field1850;

    @OriginalMember(owner = "client!hi", name = "z", descriptor = "I")
    public int field1852;

    @OriginalMember(owner = "client!hi", name = "C", descriptor = "Lo;")
    public static class134 field1855;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZIIZILfa;)V")
    public static final void method595(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, class52 arg5) {
        field1830++;
        if (class197.field3934 >= 50 || (arg5.field1191 == null || arg2 >= arg5.field1191.length)) {
            return;
        }
        int var6 = arg5.field1191[arg2];
        if (var6 == 0) {
            return;
        }
        if (!arg3) {
            method596(-45);
        }
        int var7 = var6 >> 8;
        int var8 = var6 >> 4 & 0x7;
        int var9 = var6 & 0xF;
        if (var9 == 0) {
            if (arg0) {
                class167.method1102(var8, (byte) 68, var7, 0);
            }
        } else if (class25.field507 != 0) {
            int var10 = (arg1 - 64) / 128;
            class175.field3582[class197.field3934] = var7;
            int var11 = (arg4 - 64) / 128;
            class21.field422[class197.field3934] = var8;
            field1859[class197.field3934] = 0;
            class126.field2745[class197.field3934] = null;
            class187.field3802[class197.field3934] = (var10 << 16) + var9 + (var11 << 8);
            class197.field3934++;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V")
    public static void method596(int arg0) {
        field1843 = null;
        field1853 = null;
        field1859 = null;
        field1856 = null;
        field1857 = null;
        if (arg0 != 128) {
            method596(57);
        }
        field1849 = null;
        field1851 = null;
        field1855 = null;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Z)V")
    public static final void method597(boolean arg0) {
        if (field1848 > 0) {
            field1848--;
        }
        field1837++;
        if (class20.field385 > 1) {
            class20.field385--;
        }
        if (class53.field1198) {
            class53.field1198 = false;
            class55.method490(19845);
            return;
        }
        for (int var1 = 0; var1 < 100 && class170.method1108(-121); var1++) {
        }
        if (class2.field27 != 30) {
            return;
        }
        class123.method875(96, class1.field11, !arg0);
        Object var2 = class210.field4160.field1594;
        synchronized (class210.field4160.field1594) {
            if (!class132.field2835) {
                class210.field4160.field1598 = 0;
            } else if (class121.field2667 != 0 || class210.field4160.field1598 >= 40) {
                class88.field1967++;
                int var3 = 0;
                class1.field11.method659(229, true);
                class1.field11.method257((byte) 126, 0);
                int var4 = class1.field11.field527;
                for (int var5 = 0; var5 < class210.field4160.field1598 && class1.field11.field527 - var4 < 240; var5++) {
                    var3++;
                    int var6 = class210.field4160.field1602[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 502) {
                        var6 = 502;
                    }
                    int var7 = class210.field4160.field1601[var5];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 764) {
                        var7 = 764;
                    }
                    int var8 = var6 * 765 + var7;
                    if (class210.field4160.field1602[var5] == -1 && class210.field4160.field1601[var5] == -1) {
                        var7 = -1;
                        var6 = -1;
                        var8 = 524287;
                    }
                    if (class101.field2216 != var7 || class174.field3562 != var6) {
                        int var9 = var7 - class101.field2216;
                        class101.field2216 = var7;
                        int var10 = var6 - class174.field3562;
                        class174.field3562 = var6;
                        if (class50.field1096 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var10 += 32;
                            var9 += 32;
                            class1.field11.method264((class50.field1096 << 12) + (var9 << 6) + var10, -112);
                            class50.field1096 = 0;
                        } else if (class50.field1096 < 8) {
                            class1.field11.method234((byte) 79, (class50.field1096 << 19) + var8 + 8388608);
                            class50.field1096 = 0;
                        } else {
                            class1.field11.method249((class50.field1096 << 19) + var8 - 1073741824, 61);
                            class50.field1096 = 0;
                        }
                    } else if (class50.field1096 < 2047) {
                        class50.field1096++;
                    }
                }
                class1.field11.method226(class1.field11.field527 - var4, -1);
                if (var3 < class210.field4160.field1598) {
                    class210.field4160.field1598 -= var3;
                    for (int var11 = 0; var11 < class210.field4160.field1598; var11++) {
                        class210.field4160.field1601[var11] = class210.field4160.field1601[var11 + var3];
                        class210.field4160.field1602[var11] = class210.field4160.field1602[var3 + var11];
                    }
                } else {
                    class210.field4160.field1598 = 0;
                }
            }
        }
        if (class121.field2667 != 0) {
            class90.field2007++;
            int var12 = class9.field187;
            if (var12 < 0) {
                var12 = 0;
            } else if (var12 > 502) {
                var12 = 502;
            }
            int var13 = class134.field2859;
            long var14 = (class84.field1930 - class158.field3212) / 50L;
            if (var13 < 0) {
                var13 = 0;
            } else if (var13 > 764) {
                var13 = 764;
            }
            int var16 = var12 * 765 + var13;
            class158.field3212 = class84.field1930;
            if (var14 > 4095L) {
                var14 = 4095L;
            }
            byte var17 = 0;
            if (class121.field2667 == 2) {
                var17 = 1;
            }
            int var18 = (int) var14;
            class1.field11.method659(12, true);
            class1.field11.method235(75, (var17 << 19) + ((var18 << 20) + var16));
        }
        if (class198.field3944[96] || class198.field3944[97] || class198.field3944[98] || class198.field3944[99]) {
            class166.field3355 = true;
        }
        if (class105.field2345 > 0) {
            class105.field2345--;
        }
        if (class166.field3355 && class105.field2345 <= 0) {
            class166.field3355 = false;
            class42.field927++;
            class105.field2345 = 20;
            class1.field11.method659(115, true);
            class1.field11.method264(class2.field40, -123);
            class1.field11.method264(class35.field750, -106);
        }
        if (class48.field1056 != arg0 && !class122.field2671) {
            class106.field2367++;
            class122.field2671 = true;
            class1.field11.method659(139, true);
            class1.field11.method257((byte) 126, 1);
        }
        if (!class48.field1056 && class122.field2671) {
            class106.field2367++;
            class122.field2671 = false;
            class1.field11.method659(139, true);
            class1.field11.method257((byte) 126, 0);
        }
        class63.method523(0);
        if (class2.field27 != 30) {
            return;
        }
        class148.method1015(0);
        class8.method36(0);
        class161.field3272++;
        if (class161.field3272 > 750) {
            class55.method490(19845);
            return;
        }
        class209.method1376(86);
        class135.method925((byte) 9);
        class148.method1016((byte) 117);
        if (class110.field2427 != 0) {
            class113.field2535 += 20;
            if (class113.field2535 >= 400) {
                class110.field2427 = 0;
            }
        }
        class129.field2782++;
        if (class52.field1186 != null) {
            class9.field177++;
            if (class9.field177 >= 15) {
                class137.method937(class52.field1186, (byte) -85);
                class52.field1186 = null;
            }
        }
        if (class42.field914 != null) {
            class137.method937(class42.field914, (byte) -85);
            class105.field2343++;
            if (class201.field4027 + 5 < class17.field329 || class201.field4027 - 5 > class17.field329 || class129.field2773 + 5 < class98.field2168 || class129.field2773 - 5 > class98.field2168) {
                class43.field948 = true;
            }
            if (class166.field3364 == 0) {
                if (class43.field948 && class105.field2343 >= 5) {
                    if (class42.field914 == class14.field242 && class193.field3864 != class147.field3100) {
                        class203.field4037++;
                        class55 var19 = class42.field914;
                        byte var20 = 0;
                        if (class110.field2433 == 1 && var19.field1299 == 206) {
                            var20 = 1;
                        }
                        if (var19.field1316[class147.field3100] <= 0) {
                            var20 = 0;
                        }
                        if (class21.method191(class59.method508(var19, (byte) 32), -7914)) {
                            int var21 = class147.field3100;
                            int var22 = class193.field3864;
                            var19.field1316[var21] = var19.field1316[var22];
                            var19.field1242[var21] = var19.field1242[var22];
                            var19.field1316[var22] = -1;
                            var19.field1242[var22] = 0;
                        } else if (var20 == 1) {
                            int var23 = class193.field3864;
                            int var24 = class147.field3100;
                            while (var23 != var24) {
                                if (var23 > var24) {
                                    var19.method488(var23 - 1, (byte) -69, var23);
                                    var23--;
                                } else if (var24 > var23) {
                                    var19.method488(var23 + 1, (byte) -55, var23);
                                    var23++;
                                }
                            }
                        } else {
                            var19.method488(class147.field3100, (byte) -122, class193.field3864);
                        }
                        class1.field11.method659(78, true);
                        class1.field11.method254(true, class42.field914.field1383);
                        class1.field11.method243(class147.field3100, -9440);
                        class1.field11.method257((byte) 126, var20);
                        class1.field11.method228(class193.field3864, 15358);
                    }
                } else if ((class210.field4161 == 1 || class163.method1082(class59.field1469 - 1, (byte) 46)) && class59.field1469 > 2) {
                    class78.method592(!arg0);
                } else if (class59.field1469 > 0) {
                    class21.method189(false, class59.field1469 - 1);
                }
                class42.field914 = null;
                class9.field177 = 10;
                class121.field2667 = 0;
            }
        }
        class122.field2676 = null;
        class127.field2758 = false;
        class55 var25 = class132.field2839;
        class74.field1767 = 0;
        class200.field4006 = false;
        class55 var26 = class163.field3303;
        class163.field3303 = null;
        class132.field2839 = null;
        while (class2.method12(127) && class74.field1767 < 128) {
            class190.field3828[class74.field1767] = class42.field926;
            class63.field1526[class74.field1767] = class150.field3123;
            class74.field1767++;
        }
        if (class93.field2062 != -1) {
            class45.method408((byte) 15, 503, 0, 765, 0, 0, 0, class93.field2062);
        }
        class13.field232++;
        while (true) {
            class200 var27;
            class55 var28;
            class55 var29;
            do {
                var27 = (class200) field1856.method1234(-121);
                if (var27 == null) {
                    while (true) {
                        class200 var30;
                        class55 var31;
                        class55 var32;
                        do {
                            var30 = (class200) class53.field1196.method1234(33);
                            if (var30 == null) {
                                while (true) {
                                    class200 var33;
                                    class55 var34;
                                    class55 var35;
                                    do {
                                        var33 = (class200) class120.field2633.method1234(56);
                                        if (var33 == null) {
                                            if (class181.field3694 != null) {
                                                class83.method628(94);
                                            }
                                            if (class188.field3817 != -1) {
                                                int var36 = class188.field3817;
                                                int var37 = class68.field1595;
                                                boolean var38 = class55.method476(arg0, class71.field1704.field1605[0], 0, 0, true, var36, var37, 0, 0, class71.field1704.field1603[0], 0, 0);
                                                if (var38) {
                                                    class113.field2535 = 0;
                                                    class110.field2427 = 1;
                                                    class170.field3399 = class134.field2859;
                                                    class131.field2833 = class9.field187;
                                                }
                                                class188.field3817 = -1;
                                            }
                                            class102.method765(-104);
                                            if (class132.field2839 != var25) {
                                                if (var25 != null) {
                                                    class137.method937(var25, (byte) -85);
                                                }
                                                if (class132.field2839 != null) {
                                                    class137.method937(class132.field2839, (byte) -85);
                                                }
                                            }
                                            if (class163.field3303 != var26 && class162.field3295 == class116.field2590) {
                                                if (var26 != null) {
                                                    class137.method937(var26, (byte) -85);
                                                }
                                                if (class163.field3303 != null) {
                                                    class137.method937(class163.field3303, (byte) -85);
                                                }
                                            }
                                            if (class163.field3303 == null) {
                                                if (class162.field3295 > 0) {
                                                    class162.field3295--;
                                                }
                                            } else if (class162.field3295 < class116.field2590) {
                                                class162.field3295++;
                                                if (class162.field3295 == class116.field2590) {
                                                    class137.method937(class163.field3303, (byte) -85);
                                                }
                                            }
                                            class137.method934((byte) 110);
                                            if (class2.field29) {
                                                class5.method28((byte) -73);
                                            }
                                            for (int var39 = 0; var39 < 5; var39++) {
                                                int var10002 = class37.field810[var39]++;
                                            }
                                            int var40 = class67.method545(true);
                                            int var41 = class205.method1357((byte) 91);
                                            if (var40 > 4500 && var41 > 4500) {
                                                field1848 = 250;
                                                class179.field3672++;
                                                class84.method630((byte) 11, 4000);
                                                class1.field11.method659(70, true);
                                            }
                                            class114.field2550++;
                                            class181.field3703++;
                                            if (class181.field3703 > 500) {
                                                int var42 = (int) (Math.random() * 8.0D);
                                                class181.field3703 = 0;
                                                if ((var42 & 0x4) == 4) {
                                                    class162.field3291 += class53.field1197;
                                                }
                                                if ((var42 & 0x2) == 2) {
                                                    class147.field3092 += class91.field2028;
                                                }
                                                if ((var42 & 0x1) == 1) {
                                                    class121.field2668 += class32.field667;
                                                }
                                            }
                                            class109.field2422++;
                                            if (class147.field3092 < -55) {
                                                class91.field2028 = 2;
                                            }
                                            if (class147.field3092 > 55) {
                                                class91.field2028 = -2;
                                            }
                                            if (class114.field2550 > 500) {
                                                class114.field2550 = 0;
                                                int var43 = (int) (Math.random() * 8.0D);
                                                if ((var43 & 0x1) == 1) {
                                                    class90.field2003 += class205.field4071;
                                                }
                                                if ((var43 & 0x2) == 2) {
                                                    class67.field1561 += class110.field2428;
                                                }
                                            }
                                            if (class121.field2668 < -50) {
                                                class32.field667 = 2;
                                            }
                                            if (class90.field2003 < -60) {
                                                class205.field4071 = 2;
                                            }
                                            if (class162.field3291 < -40) {
                                                class53.field1197 = 1;
                                            }
                                            if (class67.field1561 < -20) {
                                                class110.field2428 = 1;
                                            }
                                            if (class67.field1561 > 10) {
                                                class110.field2428 = -1;
                                            }
                                            if (class162.field3291 > 40) {
                                                class53.field1197 = -1;
                                            }
                                            if (class90.field2003 > 60) {
                                                class205.field4071 = -2;
                                            }
                                            if (class121.field2668 > 50) {
                                                class32.field667 = -2;
                                            }
                                            if (class109.field2422 > 50) {
                                                class1.field11.method659(46, true);
                                                class186.field3791++;
                                            }
                                            try {
                                                if (class108.field2408 != null && class1.field11.field527 > 0) {
                                                    class108.field2408.method924(0, class1.field11.field527, class1.field11.field529, true);
                                                    class109.field2422 = 0;
                                                    class1.field11.field527 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var44) {
                                                class55.method490(19845);
                                                return;
                                            }
                                        }
                                        var34 = var33.field3995;
                                        if (var34.field1339 < 0) {
                                            break;
                                        }
                                        var35 = class131.method903(609074640, var34.field1368);
                                    } while (var35 == null || var35.field1245 == null || var34.field1339 >= var35.field1245.length || var35.field1245[var34.field1339] != var34);
                                    class1.method2(var33, (byte) -71);
                                }
                            }
                            var31 = var30.field3995;
                            if (var31.field1339 < 0) {
                                break;
                            }
                            var32 = class131.method903(609074640, var31.field1368);
                        } while (var32 == null || var32.field1245 == null || var32.field1245.length <= var31.field1339 || var32.field1245[var31.field1339] != var31);
                        class1.method2(var30, (byte) -95);
                    }
                }
                var28 = var27.field3995;
                if (var28.field1339 < 0) {
                    break;
                }
                var29 = class131.method903(609074640, var28.field1368);
            } while (var29 == null || var29.field1245 == null || var28.field1339 >= var29.field1245.length || var29.field1245[var28.field1339] != var28);
            class1.method2(var27, (byte) -90);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "([Ldd;III)Ldd;")
    public static final class35 method598(class35[] arg0, int arg1, int arg2, int arg3) {
        field1827++;
        int var4 = 0;
        for (int var5 = 0; var5 < arg1; var5++) {
            if (arg0[arg3 + var5] == null) {
                arg0[arg3 + var5] = client.field617;
            }
            var4 += arg0[arg3 + var5].field758;
        }
        if (arg2 < 114) {
            method595(true, 71, -33, true, 108, null);
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        for (int var8 = 0; var8 < arg1; var8++) {
            class35 var10 = arg0[arg3 + var8];
            class156.method1048(var10.field730, 0, var6, var7, var10.field758);
            var7 += var10.field758;
        }
        class35 var9 = new class35();
        var9.field730 = var6;
        var9.field758 = var4;
        return var9;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILw;)V")
    public static final void method599(int arg0, class205 arg1) {
        field1838++;
        if (class107.field2388) {
            class42.method397((byte) 116, arg1);
            return;
        }
        if (class121.field2667 == 1 && class134.field2859 >= 715 && class9.field187 >= 453) {
            class49.field1078 = !class49.field1078;
            if (class49.field1078) {
                class19.method168((byte) -94);
            } else {
                class19.method173(class162.field3293, false, class57.field1427, (byte) 92, 0, 255);
            }
        }
        if (class2.field27 == 5) {
            return;
        }
        class49.field1075++;
        if (class2.field27 != 10) {
            return;
        }
        if (class178.field3648 != 2 && class106.field2373 == 0) {
            if (class121.field2667 == 1) {
                byte var2 = 5;
                short var3 = 463;
                byte var4 = 35;
                byte var5 = 100;
                if (class134.field2859 >= var2 && var2 + var5 >= class134.field2859 && class9.field187 >= var3 && class9.field187 <= var3 + var4) {
                    class182.method1205(arg0 - 65536);
                    return;
                }
            }
            if (class51.field1151 != null) {
                class182.method1205(arg0 - 65536);
            }
        }
        int var6 = class121.field2667;
        int var7 = class134.field2859;
        int var8 = class9.field187;
        if (class67.field1582 == arg0) {
            short var17 = 302;
            short var18 = 291;
            if (var6 == 1 && var7 >= var17 - 75 && var7 <= var17 + 75 && var8 >= var18 - 20 && var8 <= var18 + 20) {
                class141.field2989 = 0;
                class67.field1582 = 3;
            }
            short var19 = 462;
            boolean var20 = false;
            if (class25.field508 != 0) {
                while (class2.method12(127)) {
                    if (class42.field926 == 84) {
                        var20 = true;
                        break;
                    }
                }
            }
            if (var20 || var6 == 1 && var7 >= var19 - 75 && var7 <= var19 + 75 && var8 >= var18 - 20 && var18 + 20 >= var8) {
                class134.field2855 = class130.field2807;
                class141.field2989 = 0;
                class134.field2873 = class113.field2512;
                class134.field2858 = class113.field2484;
                class67.field1582 = 2;
            }
        } else if (class67.field1582 == 2) {
            short var11 = 231;
            short var12 = 302;
            short var13 = 321;
            int var21 = var11 + 30;
            if (var6 == 1 && var21 - 15 <= var8 && var8 < var21) {
                class141.field2989 = 0;
            }
            var21 += 15;
            if (var6 == 1 && var8 >= var21 - 15 && var21 > var8) {
                class141.field2989 = 1;
            }
            var21 += 15;
            if (var6 == 1 && var12 - 75 <= var7 && var12 + 75 >= var7 && var8 >= var13 - 20 && var8 <= var13 + 20) {
                class134.field2849 = class134.field2849.method323(arg0 ^ 0x3714).method346(115);
                if (class134.field2849.method347((byte) -96) == 0) {
                    class188.method1243(class121.field2662, class113.field2477, class113.field2517, arg0 ^ 0xFFFFFF9A);
                    return;
                }
                if (class134.field2867.method347((byte) -122) == 0) {
                    class188.method1243(class180.field3682, class113.field2526, class113.field2495, -117);
                    return;
                }
                class188.method1243(class64.field1544, class113.field2528, class113.field2486, 70);
                class59.method509(20, (byte) 116);
                return;
            }
            short var14 = 462;
            if (var6 == 1 && var7 >= var14 - 75 && var14 + 75 >= var7 && var13 - 20 <= var8 && var13 + 20 >= var8) {
                class67.field1582 = 0;
                class134.field2849 = class134.field2864;
                class134.field2867 = class134.field2864;
            }
            while (true) {
                boolean var15;
                label205: do {
                    while (class2.method12(127)) {
                        var15 = false;
                        for (int var16 = 0; var16 < class56.field1406.method347((byte) -92); var16++) {
                            if (class150.field3123 == class56.field1406.method341(var16, arg0 ^ 0xFFFFFFB4)) {
                                var15 = true;
                                break;
                            }
                        }
                        if (class141.field2989 != 0) {
                            continue label205;
                        }
                        if (class42.field926 == 85 && class134.field2849.method347((byte) -94) > 0) {
                            class134.field2849 = class134.field2849.method326(0, 114, class134.field2849.method347((byte) -92) - 1);
                        }
                        if (class42.field926 == 84 || class42.field926 == 80) {
                            class141.field2989 = 1;
                        }
                        if (var15 && class134.field2849.method347((byte) -115) < 12) {
                            class134.field2849 = class134.field2849.method342(6632, class150.field3123);
                        }
                    }
                    return;
                } while (class141.field2989 != 1);
                if (class42.field926 == 85 && class134.field2867.method347((byte) -107) > 0) {
                    class134.field2867 = class134.field2867.method326(0, arg0 + 103, class134.field2867.method347((byte) -123) + -1);
                }
                if (class42.field926 == 84 || class42.field926 == 80) {
                    class141.field2989 = 0;
                }
                if (class25.field508 != 0 && class42.field926 == 84) {
                    class134.field2849 = class134.field2849.method323(14100).method346(111);
                    if (class134.field2849.method347((byte) -113) == 0) {
                        class188.method1243(class121.field2662, class113.field2477, class113.field2517, arg0 - 125);
                        return;
                    }
                    if (class134.field2867.method347((byte) -112) == 0) {
                        class188.method1243(class180.field3682, class113.field2526, class113.field2495, 10);
                        return;
                    }
                    class188.method1243(class64.field1544, class113.field2528, class113.field2486, 64);
                    class59.method509(20, (byte) 115);
                    return;
                }
                if (var15 && class134.field2867.method347((byte) -85) < 20) {
                    class134.field2867 = class134.field2867.method342(arg0 ^ 0x19E8, class150.field3123);
                }
            }
        } else if (class67.field1582 == 3) {
            short var9 = 321;
            short var10 = 382;
            if (var6 == 1 && var10 - 75 <= var7 && var10 + 75 >= var7 && var8 >= var9 - 20 && var8 <= var9 + 20) {
                class67.field1582 = 0;
                return;
            }
        }
    }
}
