import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class80 {

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "Lje;")
    public static class67 field1754 = class85.method592(255, "ams");

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "Lje;")
    private static class67 field1753 = class85.method592(255, " more options");

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "J")
    public static volatile long field1758 = 0L;

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "[Lrf;")
    public static class124[] field1767 = new class124[50];

    @OriginalMember(owner = "client!ld", name = "q", descriptor = "Lje;")
    public static class67 field1769 = class85.method592(255, "hitmarks");

    @OriginalMember(owner = "client!ld", name = "y", descriptor = "Lje;")
    private static class67 field1777 = class85.method592(255, "Malformed login packet)3");

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "Lje;")
    public static class67 field1763 = field1777;

    @OriginalMember(owner = "client!ld", name = "v", descriptor = "[Z")
    public static boolean[] field1774 = new boolean[100];

    @OriginalMember(owner = "client!ld", name = "z", descriptor = "Lje;")
    private static class67 field1778 = class85.method592(255, "Click to switch");

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "Lje;")
    public static class67 field1762 = field1753;

    @OriginalMember(owner = "client!ld", name = "B", descriptor = "Lje;")
    public static class67 field1780 = field1778;

    @OriginalMember(owner = "client!ld", name = "u", descriptor = "I")
    public static int field1773 = 0;

    @OriginalMember(owner = "client!ld", name = "D", descriptor = "Z")
    public static volatile boolean field1782 = true;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    public int field1755;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public int field1756;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
    public int field1759;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "I")
    public static int field1765;

    @OriginalMember(owner = "client!ld", name = "p", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!ld", name = "r", descriptor = "I")
    public int field1770;

    @OriginalMember(owner = "client!ld", name = "x", descriptor = "I")
    public int field1776;

    @OriginalMember(owner = "client!ld", name = "A", descriptor = "I")
    public int field1779;

    @OriginalMember(owner = "client!ld", name = "C", descriptor = "I")
    public int field1781;

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "[B")
    public byte[] field1766;

    @OriginalMember(owner = "client!ld", name = "s", descriptor = "[B")
    public byte[] field1771;

    @OriginalMember(owner = "client!ld", name = "w", descriptor = "[Lqb;")
    public static class113[] field1775;

    @OriginalMember(owner = "client!ld", name = "t", descriptor = "[[I")
    public static int[][] field1772;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "[[[I")
    public static int[][][] field1757;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
    public static final void method571(int arg0) {
        if (class14.field251 > 0) {
            class14.field251--;
        }
        if (class2.field14 > 1) {
            class2.field14--;
        }
        field1761++;
        if (class143.field3289) {
            class143.field3289 = false;
            class60.method421(38);
            return;
        }
        for (int var1 = 0; var1 < 100 && class86.method602(100); var1++) {
        }
        if (class128.field2823 != 30) {
            return;
        }
        class95.method737(166, 12723, class69.field1399);
        Object var2 = class137.field3090.field2592;
        synchronized (class137.field3090.field2592) {
            if (!class128.field2801) {
                class137.field3090.field2600 = 0;
            } else if (class84.field1855 != 0 || class137.field3090.field2600 >= 40) {
                class69.field1399.method285(91, (byte) 64);
                class32.field585++;
                int var3 = 0;
                class69.field1399.method653(0, 69);
                int var4 = class69.field1399.field2043;
                for (int var5 = 0; class137.field3090.field2600 > var5 && class69.field1399.field2043 - var4 < 240; var5++) {
                    var3++;
                    int var6 = class137.field3090.field2602[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 502) {
                        var6 = 502;
                    }
                    int var7 = class137.field3090.field2599[var5];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 764) {
                        var7 = 764;
                    }
                    int var8 = var6 * 765 + var7;
                    if (class137.field3090.field2602[var5] == -1 && class137.field3090.field2599[var5] == -1) {
                        var7 = -1;
                        var6 = -1;
                        var8 = 524287;
                    }
                    if (class135.field3061 != var7 || class117.field2648 != var6) {
                        int var9 = var7 - class135.field3061;
                        int var10 = var6 - class117.field2648;
                        class117.field2648 = var6;
                        class135.field3061 = var7;
                        if (class85.field1875 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var10 += 32;
                            var9 += 32;
                            class69.field1399.method666((class85.field1875 << 12) + (var9 << 6) + var10, -32768);
                            class85.field1875 = 0;
                        } else if (class85.field1875 < 8) {
                            class69.field1399.method647((class85.field1875 << 19) + var8 + 8388608, (byte) 108);
                            class85.field1875 = 0;
                        } else {
                            class69.field1399.method629((byte) -97, (class85.field1875 << 19) + var8 - 1073741824);
                            class85.field1875 = 0;
                        }
                    } else if (class85.field1875 < 2047) {
                        class85.field1875++;
                    }
                }
                class69.field1399.method617(23232, class69.field1399.field2043 - var4);
                if (class137.field3090.field2600 <= var3) {
                    class137.field3090.field2600 = 0;
                } else {
                    class137.field3090.field2600 -= var3;
                    for (int var11 = 0; var11 < class137.field3090.field2600; var11++) {
                        class137.field3090.field2599[var11] = class137.field3090.field2599[var3 + var11];
                        class137.field3090.field2602[var11] = class137.field3090.field2602[var3 + var11];
                    }
                }
            }
        }
        if (class84.field1855 != 0) {
            class120.field2709++;
            long var12 = (class114.field2579 - class31.field564) / 50L;
            if (var12 > 4095L) {
                var12 = 4095L;
            }
            class31.field564 = class114.field2579;
            int var14 = class126.field2773;
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 502) {
                var14 = 502;
            }
            int var15 = (int) var12;
            byte var16 = 0;
            if (class84.field1855 == 2) {
                var16 = 1;
            }
            int var17 = class50.field961;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 764) {
                var17 = 764;
            }
            class69.field1399.method285(64, (byte) 64);
            int var18 = var14 * 765 + var17;
            class69.field1399.method633(-1230655272, (var15 << 20) + var18 + (var16 << 19));
        }
        if (class63.field1242[96] || class63.field1242[97] || class63.field1242[98] || class63.field1242[99]) {
            class81.field1784 = true;
        }
        if (class59.field1178 > 0) {
            class59.field1178--;
        }
        if (class81.field1784 && class59.field1178 <= 0) {
            class81.field1784 = false;
            class59.field1178 = 20;
            class152.field3477++;
            class69.field1399.method285(154, (byte) 64);
            class69.field1399.method666(class40.field735, -32768);
            class69.field1399.method666(class47.field874, -32768);
        }
        if (class140.field3152 && !class127.field2789) {
            class38.field680++;
            class127.field2789 = true;
            class69.field1399.method285(137, (byte) 64);
            class69.field1399.method653(1, 116);
        }
        if (!class140.field3152 && class127.field2789) {
            class38.field680++;
            class127.field2789 = false;
            class69.field1399.method285(137, (byte) 64);
            class69.field1399.method653(0, 109);
        }
        if (arg0 > -73) {
            field1763 = null;
        }
        class25.method172(0);
        if (class128.field2823 != 30) {
            return;
        }
        class81.method576((byte) -73);
        class118.method943(-28901);
        class71.field1441++;
        if (class71.field1441 > 750) {
            class60.method421(38);
            return;
        }
        class132.method1006(20365);
        class147.method1138(false);
        class3.method12((byte) -30);
        class60.field1204++;
        if (class91.field1983 != 0) {
            class149.field3410 += 20;
            if (class149.field3410 >= 400) {
                class91.field1983 = 0;
            }
        }
        if (class138.field3108 != null) {
            class149.field3423++;
            if (class149.field3423 >= 15) {
                class23.method160((byte) -29, class138.field3108);
                class138.field3108 = null;
            }
        }
        if (class122.field2735 != null) {
            class23.method160((byte) -29, class122.field2735);
            class24.field445++;
            if (class135.field3070 > class71.field1446 + 5 || class135.field3070 < class71.field1446 - 5 || class104.field2361 > field1773 + 5 || class104.field2361 < field1773 - 5) {
                class63.field1238 = true;
            }
            if (class130.field2858 == 0) {
                if (class63.field1238 && class24.field445 >= 5) {
                    if (class122.field2735 == class122.field2734 && class25.field458 != class122.field2727) {
                        byte var19 = 0;
                        class72 var20 = class122.field2735;
                        class33.field588++;
                        if (class14.field248 == 1 && var20.field1553 == 206) {
                            var19 = 1;
                        }
                        if (var20.field1581[class122.field2727] <= 0) {
                            var19 = 0;
                        }
                        if (class76.method542(class140.method1063(var20, (byte) -99), (byte) 88)) {
                            int var23 = class25.field458;
                            int var24 = class122.field2727;
                            var20.field1581[var24] = var20.field1581[var23];
                            var20.field1482[var24] = var20.field1482[var23];
                            var20.field1581[var23] = -1;
                            var20.field1482[var23] = 0;
                        } else if (var19 == 1) {
                            int var21 = class25.field458;
                            int var22 = class122.field2727;
                            while (var21 != var22) {
                                if (var22 < var21) {
                                    var20.method519(var21 - 1, var21, -109);
                                    var21--;
                                } else if (var21 < var22) {
                                    var20.method519(var21 + 1, var21, -94);
                                    var21++;
                                }
                            }
                        } else {
                            var20.method519(class122.field2727, class25.field458, -104);
                        }
                        class69.field1399.method285(143, (byte) 64);
                        class69.field1399.method618(var19, true);
                        class69.field1399.method655(class25.field458, -1735580088);
                        class69.field1399.method625(-128, class122.field2727);
                        class69.field1399.method638(class122.field2735.field1508, true);
                    }
                } else if ((class29.field513 == 1 || class66.method442(class69.field1419 - 1, 0)) && class69.field1419 > 2) {
                    class16.method111((byte) 86);
                } else if (class69.field1419 > 0) {
                    class25.method168(class69.field1419 - 1, -5052);
                }
                class84.field1855 = 0;
                class122.field2735 = null;
                class149.field3423 = 10;
            }
        }
        class145.field3337 = 0;
        class31.field559 = false;
        class89.field1977 = false;
        class17.field320 = null;
        class72 var25 = class159.field3645;
        class159.field3645 = null;
        class72 var26 = class66.field1287;
        class66.field1287 = null;
        while (class127.method976(-14101) && class145.field3337 < 128) {
            class92.field2063[class145.field3337] = class72.field1554;
            class103.field2310[class145.field3337] = class59.field1187;
            class145.field3337++;
        }
        class143.method1107(0, 503, 0, 765, 0, -1, 0, class112.field2519);
        class86.field1899++;
        while (true) {
            class35 var27;
            class72 var28;
            class72 var29;
            do {
                var27 = (class35) class97.field2179.method22((byte) 117);
                if (var27 == null) {
                    while (true) {
                        class35 var30;
                        class72 var31;
                        class72 var32;
                        do {
                            var30 = (class35) class152.field3487.method22((byte) 114);
                            if (var30 == null) {
                                while (true) {
                                    class35 var33;
                                    class72 var34;
                                    class72 var35;
                                    do {
                                        var33 = (class35) class77.field1672.method22((byte) 114);
                                        if (var33 == null) {
                                            if (class46.field859 != null) {
                                                class86.method603(true);
                                            }
                                            if (class51.field987 != -1) {
                                                int var36 = class51.field994;
                                                int var37 = class51.field987;
                                                boolean var38 = class120.method949(class37.field667.field2993[0], 0, 0, true, 0, (byte) 78, 0, 0, var36, var37, class37.field667.field2942[0], 0);
                                                if (var38) {
                                                    class91.field1983 = 1;
                                                    class149.field3410 = 0;
                                                    class81.field1787 = class126.field2773;
                                                    class16.field281 = class50.field961;
                                                }
                                                class51.field987 = -1;
                                            }
                                            class9.method80(-1);
                                            if (class159.field3645 != var25) {
                                                if (var25 != null) {
                                                    class23.method160((byte) -29, var25);
                                                }
                                                if (class159.field3645 != null) {
                                                    class23.method160((byte) -29, class159.field3645);
                                                }
                                            }
                                            if (class66.field1287 != var26 && class50.field953 == class45.field839) {
                                                if (var26 != null) {
                                                    class23.method160((byte) -29, var26);
                                                }
                                                if (class66.field1287 != null) {
                                                    class23.method160((byte) -29, class66.field1287);
                                                }
                                            }
                                            if (class66.field1287 == null) {
                                                if (class50.field953 > 0) {
                                                    class50.field953--;
                                                }
                                            } else if (class45.field839 > class50.field953) {
                                                class50.field953++;
                                                if (class50.field953 == class45.field839) {
                                                    class23.method160((byte) -29, class66.field1287);
                                                }
                                            }
                                            class9.method78(false);
                                            if (class26.field474) {
                                                class152.method1162(1);
                                            }
                                            for (int var39 = 0; var39 < 5; var39++) {
                                                int var10002 = class116.field2628[var39]++;
                                            }
                                            int var40 = class142.method1099((byte) 11);
                                            int var41 = class72.method528(true);
                                            if (var40 > 4500 && var41 > 4500) {
                                                class14.field251 = 250;
                                                class23.field418++;
                                                class17.method119((byte) 124, 4000);
                                                class69.field1399.method285(167, (byte) 64);
                                            }
                                            class38.field688++;
                                            class61.field1222++;
                                            class114.field2578++;
                                            if (class114.field2578 > 500) {
                                                int var42 = (int) (Math.random() * 8.0D);
                                                if ((var42 & 0x1) == 1) {
                                                    class152.field3480 += class2.field8;
                                                }
                                                if ((var42 & 0x4) == 4) {
                                                    class148.field3385 += class147.field3365;
                                                }
                                                if ((var42 & 0x2) == 2) {
                                                    class81.field1793 += class69.field1413;
                                                }
                                                class114.field2578 = 0;
                                            }
                                            if (class148.field3385 < -40) {
                                                class147.field3365 = 1;
                                            }
                                            if (class81.field1793 < -55) {
                                                class69.field1413 = 2;
                                            }
                                            if (class81.field1793 > 55) {
                                                class69.field1413 = -2;
                                            }
                                            if (class148.field3385 > 40) {
                                                class147.field3365 = -1;
                                            }
                                            if (class152.field3480 < -50) {
                                                class2.field8 = 2;
                                            }
                                            if (class152.field3480 > 50) {
                                                class2.field8 = -2;
                                            }
                                            if (class38.field688 > 500) {
                                                int var43 = (int) (Math.random() * 8.0D);
                                                if ((var43 & 0x1) == 1) {
                                                    class25.field463 += class158.field3622;
                                                }
                                                class38.field688 = 0;
                                                if ((var43 & 0x2) == 2) {
                                                    class115.field2603 += class79.field1703;
                                                }
                                            }
                                            if (class25.field463 < -60) {
                                                class158.field3622 = 2;
                                            }
                                            if (class25.field463 > 60) {
                                                class158.field3622 = -2;
                                            }
                                            if (class115.field2603 < -20) {
                                                class79.field1703 = 1;
                                            }
                                            if (class115.field2603 > 10) {
                                                class79.field1703 = -1;
                                            }
                                            if (class61.field1222 > 50) {
                                                class141.field3202++;
                                                class69.field1399.method285(7, (byte) 64);
                                            }
                                            try {
                                                if (class104.field2367 != null && class69.field1399.field2043 > 0) {
                                                    class104.field2367.method842(class69.field1399.field1991, class69.field1399.field2043, 83, 0);
                                                    class61.field1222 = 0;
                                                    class69.field1399.field2043 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var44) {
                                                class60.method421(38);
                                                return;
                                            }
                                        }
                                        var34 = var33.field640;
                                        if (var34.field1540 < 0) {
                                            break;
                                        }
                                        var35 = class67.method467((byte) -13, var34.field1470);
                                    } while (var35 == null || var35.field1494 == null || var35.field1494.length <= var34.field1540 || var35.field1494[var34.field1540] != var34);
                                    class71.method513((byte) -33, var33);
                                }
                            }
                            var31 = var30.field640;
                            if (var31.field1540 < 0) {
                                break;
                            }
                            var32 = class67.method467((byte) -13, var31.field1470);
                        } while (var32 == null || var32.field1494 == null || var31.field1540 >= var32.field1494.length || var32.field1494[var31.field1540] != var31);
                        class71.method513((byte) -40, var30);
                    }
                }
                var28 = var27.field640;
                if (var28.field1540 < 0) {
                    break;
                }
                var29 = class67.method467((byte) -13, var28.field1470);
            } while (var29 == null || var29.field1494 == null || var29.field1494.length <= var28.field1540 || var29.field1494[var28.field1540] != var28);
            class71.method513((byte) -77, var27);
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)V")
    public static void method572(int arg0) {
        field1753 = null;
        field1780 = null;
        field1757 = null;
        if (arg0 != -1) {
            return;
        }
        field1777 = null;
        field1767 = null;
        field1775 = null;
        field1762 = null;
        field1769 = null;
        field1778 = null;
        field1754 = null;
        field1774 = null;
        field1772 = null;
        field1763 = null;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)Ljb;")
    public static final class64 method573(int arg0, int arg1) {
        class64 var2 = (class64) class30.field536.method764((long) arg0, 24182);
        if (arg1 != -15618) {
            method572(-117);
        }
        field1765++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class127.field2787.method267((byte) -124, arg0, 14);
        class64 var4 = new class64();
        if (var3 != null) {
            var4.method436(new class91(var3), (byte) -72);
        }
        class30.field536.method765((long) arg0, var4, (byte) -66);
        return var4;
    }
}
