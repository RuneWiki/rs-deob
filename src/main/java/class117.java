import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class117 {

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "Lmb;")
    public static class132 field2234 = null;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "Lmb;")
    public static class132 field2236 = class166.method1092("<col=ffffff>", 112);

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "[[I")
    public static int[][] field2237 = new int[104][104];

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "Lmb;")
    public static class132 field2235 = class166.method1092("gelb:", 115);

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "Lmb;")
    public static class132 field2238 = class166.method1092("blaugr-Un:", 113);

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V")
    public static void method785(int arg0) {
        field2237 = null;
        field2238 = null;
        field2236 = null;
        if (arg0 != 4500) {
            method786(false);
        }
        field2234 = null;
        field2235 = null;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Z)V")
    public static final void method786(boolean arg0) {
        if (class208.field3784 > 0) {
            class208.field3784--;
        }
        field2239++;
        if (class137.field2571 > 1) {
            class49.field835 = class13.field167;
            class137.field2571--;
        }
        if (class48.field820) {
            class48.field820 = false;
            class171.method1117(-9291);
            return;
        }
        for (int var1 = 0; var1 < 100 && class216.method1348(-92); var1++) {
        }
        if (class95.field1666 != 30) {
            return;
        }
        class182.method1171(-11, class64.field1054, 22);
        Object var2 = class33.field528.field3714;
        synchronized (class33.field528.field3714) {
            if (!class93.field1640) {
                class33.field528.field3722 = 0;
            } else if (class49.field827 != 0 || class33.field528.field3722 >= 40) {
                class64.field1054.method660(179, 3);
                class64.field1054.method747(0, (byte) -100);
                class238.field4305++;
                int var3 = 0;
                int var4 = class64.field1054.field2133;
                for (int var5 = 0; var5 < class33.field528.field3722 && class64.field1054.field2133 - var4 < 240; var5++) {
                    var3++;
                    int var6 = class33.field528.field3717[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 502) {
                        var6 = 502;
                    }
                    int var7 = class33.field528.field3719[var5];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 764) {
                        var7 = 764;
                    }
                    int var8 = var6 * 765 + var7;
                    if (class33.field528.field3717[var5] == -1 && class33.field528.field3719[var5] == -1) {
                        var8 = 524287;
                        var7 = -1;
                        var6 = -1;
                    }
                    if (class43.field762 != var7 || class45.field783 != var6) {
                        int var9 = var7 - class43.field762;
                        int var10 = var6 - class45.field783;
                        class45.field783 = var6;
                        class43.field762 = var7;
                        if (class139.field2609 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            class64.field1054.method715(102, (class139.field2609 << 12) + (var9 << 6) + var10);
                            class139.field2609 = 0;
                        } else if (class139.field2609 < 8) {
                            class64.field1054.method736(-123, (class139.field2609 << 19) + var8 + 8388608);
                            class139.field2609 = 0;
                        } else {
                            class64.field1054.method726((byte) -14, (class139.field2609 << 19) + var8 - 1073741824);
                            class139.field2609 = 0;
                        }
                    } else if (class139.field2609 < 2047) {
                        class139.field2609++;
                    }
                }
                class64.field1054.method731(-15826, class64.field1054.field2133 - var4);
                if (class33.field528.field3722 <= var3) {
                    class33.field528.field3722 = 0;
                } else {
                    class33.field528.field3722 -= var3;
                    for (int var11 = 0; var11 < class33.field528.field3722; var11++) {
                        class33.field528.field3719[var11] = class33.field528.field3719[var3 + var11];
                        class33.field528.field3717[var11] = class33.field528.field3717[var3 + var11];
                    }
                }
            }
        }
        if (class49.field827 != 0) {
            class136.field2559++;
            long var12 = (class101.field1895 - class33.field503) / 50L;
            int var14 = class189.field3501;
            if (var12 > 4095L) {
                var12 = 4095L;
            }
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 502) {
                var14 = 502;
            }
            class33.field503 = class101.field1895;
            int var15 = class48.field826;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 764) {
                var15 = 764;
            }
            int var16 = var14 * 765 + var15;
            byte var17 = 0;
            if (class49.field827 == 2) {
                var17 = 1;
            }
            class64.field1054.method660(40, 3);
            int var18 = (int) var12;
            class64.field1054.method726((byte) 117, (var17 << 19) + (var18 << 20) + var16);
        }
        if (class190.field3509 > 0) {
            class190.field3509--;
        }
        if (class9.field85[96] || class9.field85[97] || class9.field85[98] || class9.field85[99]) {
            class137.field2573 = true;
        }
        if (class137.field2573 && class190.field3509 <= 0) {
            class190.field3509 = 20;
            class95.field1677++;
            class137.field2573 = false;
            class64.field1054.method660(144, 3);
            class64.field1054.method760(class229.field4130, (byte) -2);
            class64.field1054.method741(83, class230.field4153);
        }
        if (class52.field888 && !class30.field474) {
            class30.field474 = true;
            class8.field71++;
            class64.field1054.method660(53, 3);
            class64.field1054.method747(1, (byte) -96);
        }
        if (!class52.field888 && class30.field474) {
            class8.field71++;
            class30.field474 = false;
            class64.field1054.method660(53, 3);
            class64.field1054.method747(0, (byte) -61);
        }
        class122.method813((byte) -30);
        if (class95.field1666 != 30) {
            return;
        }
        class215.method1345(true);
        class52.method358(64);
        class64.field1063++;
        if (class64.field1063 > 750) {
            class171.method1117(-9291);
            return;
        }
        class128.method838((byte) -4);
        class133.method908(23916);
        class43.method298(arg0);
        if (class218.field3984 != null) {
            class129.method849(true);
        }
        class112.field2118++;
        if (class149.field2734 != 0) {
            class194.field3612 += 20;
            if (class194.field3612 >= 400) {
                class149.field2734 = 0;
            }
        }
        if (class91.field1612 != null) {
            class222.field4043++;
            if (class222.field4043 >= 15) {
                class183.method1174(class91.field1612, 16235);
                class91.field1612 = null;
            }
        }
        if (class15.field220 != null) {
            class183.method1174(class15.field220, 16235);
            class172.field3197++;
            if (class181.field3329 > class123.field2314 + 5 || class181.field3329 < class123.field2314 - 5 || class36.field584 > class4.field44 + 5 || class36.field584 < class4.field44 - 5) {
                class69.field1156 = true;
            }
            if (class61.field1030 == 0) {
                if (class69.field1156 && class172.field3197 >= 5) {
                    if (class15.field220 == class111.field2101 && class48.field823 != class154.field2817) {
                        class30.field464++;
                        class96 var19 = class15.field220;
                        byte var20 = 0;
                        if (class140.field2630 == 1 && var19.field1805 == 206) {
                            var20 = 1;
                        }
                        if (var19.field1753[class48.field823] <= 0) {
                            var20 = 0;
                        }
                        if (class9.method43(class170.method1113(var19, (byte) -50), false)) {
                            int var23 = class154.field2817;
                            int var24 = class48.field823;
                            var19.field1753[var24] = var19.field1753[var23];
                            var19.field1722[var24] = var19.field1722[var23];
                            var19.field1753[var23] = -1;
                            var19.field1722[var23] = 0;
                        } else if (var20 == 1) {
                            int var21 = class48.field823;
                            int var22 = class154.field2817;
                            while (var21 != var22) {
                                if (var21 < var22) {
                                    var19.method595(var22 - 1, var22, -12440);
                                    var22--;
                                } else if (var21 > var22) {
                                    var19.method595(var22 + 1, var22, -12440);
                                    var22++;
                                }
                            }
                        } else {
                            var19.method595(class48.field823, class154.field2817, -12440);
                        }
                        class64.field1054.method660(78, 3);
                        class64.field1054.method741(53, class48.field823);
                        class64.field1054.method752((byte) 61, class15.field220.field1794);
                        class64.field1054.method715(61, class154.field2817);
                        class64.field1054.method713(var20, false);
                    }
                } else if ((class15.field211 == 1 || class101.method624(2000, class57.field974 - 1)) && class57.field974 > 2) {
                    class113.method766(0);
                } else if (class57.field974 > 0) {
                    class26.method195(88, class57.field974 - 1);
                }
                class222.field4043 = 10;
                class15.field220 = null;
                class49.field827 = 0;
            }
        }
        class74.field1227 = null;
        class99.field1869 = false;
        class163.field2950 = 0;
        class91.field1608 = false;
        class96 var25 = class8.field80;
        class96 var26 = class166.field3026;
        class166.field3026 = null;
        class8.field80 = null;
        while (class85.method526((byte) -91) && class163.field2950 < 128) {
            class32.field491[class163.field2950] = class191.field3536;
            class81.field1366[class163.field2950] = class209.field3814;
            class163.field2950++;
        }
        class218.field3984 = null;
        if (class45.field784 != -1) {
            class238.method1505(class45.field784, 0, class187.field3461, (byte) 101, 0, class47.field813, 0, 0);
        }
        class13.field167++;
        while (true) {
            class123 var27;
            class96 var28;
            class96 var29;
            do {
                var27 = (class123) class234.field4220.method117((byte) 6);
                if (var27 == null) {
                    while (true) {
                        class123 var30;
                        class96 var31;
                        class96 var32;
                        do {
                            var30 = (class123) class183.field3375.method117((byte) 6);
                            if (var30 == null) {
                                while (true) {
                                    class123 var33;
                                    class96 var34;
                                    class96 var35;
                                    do {
                                        var33 = (class123) class22.field311.method117((byte) 6);
                                        if (var33 == null) {
                                            if (class148.field2730 && class218.field3984 == null) {
                                                class148.field2730 = false;
                                            }
                                            if (class15.field217 != null) {
                                                class135.method919((byte) 127);
                                            }
                                            if (class140.field2618 != -1) {
                                                int var36 = class6.field60;
                                                int var37 = class140.field2618;
                                                boolean var38 = class37.method265(0, 0, class210.field3854.field703[0], true, -120, 0, 0, var37, 0, var36, 0, class210.field3854.field676[0]);
                                                class140.field2618 = -1;
                                                if (var38) {
                                                    class125.field2321 = class189.field3501;
                                                    class89.field1565 = class48.field826;
                                                    class194.field3612 = 0;
                                                    class149.field2734 = 1;
                                                }
                                            }
                                            class187.method1195((byte) -39);
                                            if (class8.field80 != var25) {
                                                if (var25 != null) {
                                                    class183.method1174(var25, 16235);
                                                }
                                                if (class8.field80 != null) {
                                                    class183.method1174(class8.field80, 16235);
                                                }
                                            }
                                            if (class166.field3026 != var26 && class64.field1058 == class210.field3841) {
                                                if (var26 != null) {
                                                    class183.method1174(var26, 16235);
                                                }
                                                if (class166.field3026 != null) {
                                                    class183.method1174(class166.field3026, 16235);
                                                }
                                            }
                                            if (class166.field3026 == null) {
                                                if (class64.field1058 > 0) {
                                                    class64.field1058--;
                                                }
                                            } else if (class210.field3841 > class64.field1058) {
                                                class64.field1058++;
                                                if (class64.field1058 == class210.field3841) {
                                                    class183.method1174(class166.field3026, 16235);
                                                }
                                            }
                                            class182.method1169(true);
                                            if (class180.field3313) {
                                                class85.method529(2047);
                                            }
                                            for (int var39 = 0; var39 < 5; var39++) {
                                                int var10002 = class192.field3584[var39]++;
                                            }
                                            int var40 = class189.method1211(true);
                                            int var41 = class160.method1038(-109);
                                            if (var40 > 4500 && var41 > 4500) {
                                                class208.field3784 = 250;
                                                class88.method548(4000, -16828);
                                                class45.field776++;
                                                class64.field1054.method660(130, 3);
                                            }
                                            class234.field4231++;
                                            class236.field4286++;
                                            class230.field4136++;
                                            if (class234.field4231 > 500) {
                                                class234.field4231 = 0;
                                                int var42 = (int) (Math.random() * 8.0D);
                                                if ((var42 & 0x4) == 4) {
                                                    class43.field752 += class14.field180;
                                                }
                                                if ((var42 & 0x2) == 2) {
                                                    class141.field2640 += class217.field3972;
                                                }
                                                if ((var42 & 0x1) == 1) {
                                                    class220.field4021 += class233.field4208;
                                                }
                                            }
                                            if (class230.field4136 > 500) {
                                                class230.field4136 = 0;
                                                int var43 = (int) (Math.random() * 8.0D);
                                                if ((var43 & 0x1) == 1) {
                                                    class166.field3029 += class90.field1592;
                                                }
                                                if ((var43 & 0x2) == 2) {
                                                    class233.field4196 += class219.field4002;
                                                }
                                            }
                                            if (class43.field752 < -40) {
                                                class14.field180 = 1;
                                            }
                                            if (class166.field3029 < -60) {
                                                class90.field1592 = 2;
                                            }
                                            if (class141.field2640 < -55) {
                                                class217.field3972 = 2;
                                            }
                                            if (class141.field2640 > 55) {
                                                class217.field3972 = -2;
                                            }
                                            if (class166.field3029 > 60) {
                                                class90.field1592 = -2;
                                            }
                                            if (class233.field4196 < -20) {
                                                class219.field4002 = 1;
                                            }
                                            if (class43.field752 > 40) {
                                                class14.field180 = -1;
                                            }
                                            if (class220.field4021 < -50) {
                                                class233.field4208 = 2;
                                            }
                                            if (class220.field4021 > 50) {
                                                class233.field4208 = -2;
                                            }
                                            if (class233.field4196 > 10) {
                                                class219.field4002 = -1;
                                            }
                                            if (class236.field4286 > 50) {
                                                class64.field1054.method660(34, 3);
                                                class203.field3729++;
                                            }
                                            try {
                                                if (class166.field3027 != null && class64.field1054.field2133 > 0) {
                                                    class166.field3027.method419(-62, class64.field1054.field2157, 0, class64.field1054.field2133);
                                                    class236.field4286 = 0;
                                                    class64.field1054.field2133 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var44) {
                                                class171.method1117(-9291);
                                                return;
                                            }
                                        }
                                        var34 = var33.field2299;
                                        if (var34.field1743 < 0) {
                                            break;
                                        }
                                        var35 = class158.method1029((byte) -100, var34.field1776);
                                    } while (var35 == null || var35.field1770 == null || var35.field1770.length <= var34.field1743 || var35.field1770[var34.field1743] != var34);
                                    class155.method1010(var33, 200000);
                                }
                            }
                            var31 = var30.field2299;
                            if (var31.field1743 < 0) {
                                break;
                            }
                            var32 = class158.method1029((byte) -119, var31.field1776);
                        } while (var32 == null || var32.field1770 == null || var32.field1770.length <= var31.field1743 || var32.field1770[var31.field1743] != var31);
                        class155.method1010(var30, 200000);
                    }
                }
                var28 = var27.field2299;
                if (var28.field1743 < 0) {
                    break;
                }
                var29 = class158.method1029((byte) -116, var28.field1776);
            } while (var29 == null || var29.field1770 == null || var28.field1743 >= var29.field1770.length || var29.field1770[var28.field1743] != var28);
            class155.method1010(var27, 200000);
        }
    }
}
