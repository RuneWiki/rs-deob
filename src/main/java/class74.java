import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class74 {

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "[J")
    public static long[] field1740 = new long[100];

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "[I")
    public static int[] field1742 = new int[32];

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "Lec;")
    public static class32 field1749 = class73.method594("", true);

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "Lec;")
    private static class32 field1751 = class73.method594("Malformed login packet)3", true);

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "Lec;")
    public static class32 field1752 = field1749;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "Lec;")
    public static class32 field1741 = field1749;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public static int field1738 = 1;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "Lec;")
    public static class32 field1743 = field1749;

    @OriginalMember(owner = "client!ke", name = "r", descriptor = "Lec;")
    public static class32 field1754 = field1751;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "Lec;")
    public static class32 field1744 = field1749;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "Lec;")
    public static class32 field1739 = field1749;

    @OriginalMember(owner = "client!ke", name = "s", descriptor = "Lec;")
    public static class32 field1755 = field1749;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "J")
    public static long field1745;

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "[I")
    public static int[] field1747;

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "[I")
    public static int[] field1748;

    @OriginalMember(owner = "client!ke", name = "q", descriptor = "[Lhb;")
    public static class51[] field1753;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IB)Lec;")
    public static final class32 method599(int arg0, byte arg1) {
        field1737++;
        if (arg0 < 100000) {
            return class52.method403(new class32[] { class94.field2184, class159.method1230(arg0, 0), class43.field997 }, (byte) -20);
        } else if (arg0 < 10000000) {
            return class52.method403(new class32[] { class139.field3214, class159.method1230(arg0 / 1000, 0), class89.field2054, class43.field997 }, (byte) -20);
        } else {
            int var2 = -13 % ((arg1 - 54) / 48);
            return class52.method403(new class32[] { class102.field2396, class159.method1230(arg0 / 1000000, 0), class44.field1042, class43.field997 }, (byte) -20);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lea;IZLea;)V")
    public static final void method600(class30 arg0, int arg1, boolean arg2, class30 arg3) {
        class151.field3456 = arg3;
        if (arg1 < 54) {
            method601((byte) 97);
        }
        class37.field889 = arg2;
        field1750++;
        class119.field2842 = arg0;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V")
    public static final void method601(byte arg0) {
        field1746++;
        if (class4.field68 > 0) {
            class4.field68--;
        }
        if (class56.field1295 > 1) {
            class56.field1295--;
        }
        if (class82.field1919) {
            class82.field1919 = false;
            class65.method504(-121);
            return;
        }
        for (int var1 = 0; var1 < 100 && class85.method662(30703); var1++) {
        }
        if (class134.field3116 != 30) {
            return;
        }
        class97.method755((byte) 7, 183, class44.field1027);
        Object var2 = class137.field3176.field3025;
        synchronized (class137.field3176.field3025) {
            if (!class109.field2555) {
                class137.field3176.field3030 = 0;
            } else if (class79.field1827 != 0 || class137.field3176.field3030 >= 40) {
                int var3 = 0;
                class13.field215++;
                class44.field1027.method357(119, -118);
                class44.field1027.method515((byte) 78, 0);
                int var4 = class44.field1027.field1569;
                for (int var5 = 0; var5 < class137.field3176.field3030 && class44.field1027.field1569 - var4 < 240; var5++) {
                    var3++;
                    int var6 = class137.field3176.field3032[var5];
                    int var7 = class137.field3176.field3029[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 502) {
                        var6 = 502;
                    }
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 764) {
                        var7 = 764;
                    }
                    int var8 = var6 * 765 + var7;
                    if (class137.field3176.field3032[var5] == -1 && class137.field3176.field3029[var5] == -1) {
                        var8 = 524287;
                        var7 = -1;
                        var6 = -1;
                    }
                    if (class75.field1766 != var7 || class28.field506 != var6) {
                        int var9 = var7 - class75.field1766;
                        class75.field1766 = var7;
                        int var10 = var6 - class28.field506;
                        class28.field506 = var6;
                        if (class152.field3499 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            class44.field1027.method514((class152.field3499 << 12) + var10 + (var9 << 6), (byte) -76);
                            class152.field3499 = 0;
                        } else if (class152.field3499 < 8) {
                            class44.field1027.method551(-31368, (class152.field3499 << 19) + var8 + 8388608);
                            class152.field3499 = 0;
                        } else {
                            class44.field1027.method531(false, (class152.field3499 << 19) + var8 - 1073741824);
                            class152.field3499 = 0;
                        }
                    } else if (class152.field3499 < 2047) {
                        class152.field3499++;
                    }
                }
                class44.field1027.method516(class44.field1027.field1569 - var4, false);
                if (class137.field3176.field3030 <= var3) {
                    class137.field3176.field3030 = 0;
                } else {
                    class137.field3176.field3030 -= var3;
                    for (int var11 = 0; var11 < class137.field3176.field3030; var11++) {
                        class137.field3176.field3029[var11] = class137.field3176.field3029[var3 + var11];
                        class137.field3176.field3032[var11] = class137.field3176.field3032[var3 + var11];
                    }
                }
            }
        }
        if (class79.field1827 != 0) {
            long var12 = (class84.field1975 - class11.field182) / 50L;
            class3.field41++;
            if (var12 > 4095L) {
                var12 = 4095L;
            }
            class11.field182 = class84.field1975;
            int var14 = class9.field166;
            int var15 = class66.field1590;
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 764) {
                var14 = 764;
            }
            byte var16 = 0;
            if (class79.field1827 == 2) {
                var16 = 1;
            }
            class44.field1027.method357(242, -87);
            int var17 = (int) var12;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 502) {
                var15 = 502;
            }
            int var18 = var15 * 765 + var14;
            class44.field1027.method531(false, (var17 << 20) + ((var16 << 19) + var18));
        }
        if (class30.field562 > 0) {
            class30.field562--;
        }
        if (class107.field2542[96] || class107.field2542[97] || class107.field2542[98] || class107.field2542[99]) {
            class92.field2115 = true;
        }
        if (class92.field2115 && class30.field562 <= 0) {
            class92.field2115 = false;
            class44.field1023++;
            class30.field562 = 20;
            class44.field1027.method357(211, -115);
            class44.field1027.method505(-2144754000, class133.field3056);
            class44.field1027.method505(-2144754000, class133.field3084);
        }
        if (class126.field2928 && !class77.field1813) {
            class38.field905++;
            class77.field1813 = true;
            class44.field1027.method357(177, -126);
            class44.field1027.method515((byte) 73, 1);
        }
        if (!class126.field2928 && class77.field1813) {
            class77.field1813 = false;
            class38.field905++;
            class44.field1027.method357(177, -89);
            class44.field1027.method515((byte) 58, 0);
        }
        class57.method450((byte) -66);
        if (class134.field3116 != 30) {
            return;
        }
        class91.method723(25682);
        class20.method137(false);
        class34.field704++;
        if (class34.field704 > 750) {
            class65.method504(-125);
            return;
        }
        class68.method570((byte) 97);
        if (arg0 > -109) {
            method599(-72, (byte) -35);
        }
        class12.method65(-93);
        class50.method398(-17471);
        if (class135.field3149 != 0) {
            class154.field3545 += 20;
            if (class154.field3545 >= 400) {
                class135.field3149 = 0;
            }
        }
        class54.field1283++;
        if (class5.field89 != null) {
            class136.field3158++;
            if (class136.field3158 >= 15) {
                class132.method1010(class5.field89, (byte) -127);
                class5.field89 = null;
            }
        }
        if (class34.field724 != null) {
            class132.method1010(class34.field724, (byte) -111);
            class109.field2571++;
            if (class113.field2639 + 5 < class86.field2002 || class113.field2639 - 5 > class86.field2002 || class140.field3218 > class94.field2162 + 5 || class140.field3218 < class94.field2162 - 5) {
                class72.field1694 = true;
            }
            if (class86.field2017 == 0) {
                if (class72.field1694 && class109.field2571 >= 5) {
                    if (class48.field1124 == class34.field724 && class81.field1857 != class107.field2544) {
                        class27.field492++;
                        class36 var19 = class34.field724;
                        byte var20 = 0;
                        if (class124.field2887 == 1 && var19.field846 == 206) {
                            var20 = 1;
                        }
                        if (var19.field835[class81.field1857] <= 0) {
                            var20 = 0;
                        }
                        if (class56.method437(16777215, class147.method1102(-128, var19))) {
                            int var23 = class81.field1857;
                            int var24 = class107.field2544;
                            var19.field835[var23] = var19.field835[var24];
                            var19.field754[var23] = var19.field754[var24];
                            var19.field835[var24] = -1;
                            var19.field754[var24] = 0;
                        } else if (var20 == 1) {
                            int var21 = class81.field1857;
                            int var22 = class107.field2544;
                            while (var21 != var22) {
                                if (var22 > var21) {
                                    var19.method310(var22 - 1, true, var22);
                                    var22--;
                                } else if (var22 < var21) {
                                    var19.method310(var22 + 1, true, var22);
                                    var22++;
                                }
                            }
                        } else {
                            var19.method310(class81.field1857, true, class107.field2544);
                        }
                        class44.field1027.method357(56, -91);
                        class44.field1027.method549(class81.field1857, 122);
                        class44.field1027.method534(var20, false);
                        class44.field1027.method554(8, class34.field724.field744);
                        class44.field1027.method547(-25680, class107.field2544);
                    }
                } else if ((class125.field2900 == 1 || class32.method237((byte) 93, class119.field2851 - 1)) && class119.field2851 > 2) {
                    class135.method1032(-5560);
                } else if (class119.field2851 > 0) {
                    class14.method79(80, class119.field2851 - 1);
                }
                class34.field724 = null;
                class136.field3158 = 10;
                class79.field1827 = 0;
            }
        }
        class27.field500 = false;
        class53.field1250 = 0;
        class124.field2888 = null;
        class112.field2624 = false;
        class36 var25 = class50.field1164;
        class50.field1164 = null;
        class36 var26 = class71.field1666;
        class71.field1666 = null;
        while (class145.method1091((byte) -125) && class53.field1250 < 128) {
            class73.field1734[class53.field1250] = class13.field224;
            class11.field188[class53.field1250] = class109.field2564;
            class53.field1250++;
        }
        class128.method994(class13.field220, 0, 0, 503, 0, 765, 0, 0);
        class115.field2769++;
        while (true) {
            class12 var27;
            class36 var28;
            class36 var29;
            do {
                var27 = (class12) class111.field2600.method1217((byte) -42);
                if (var27 == null) {
                    while (true) {
                        class12 var30;
                        class36 var31;
                        class36 var32;
                        do {
                            var30 = (class12) class80.field1839.method1217((byte) -52);
                            if (var30 == null) {
                                while (true) {
                                    class12 var33;
                                    class36 var34;
                                    class36 var35;
                                    do {
                                        var33 = (class12) class11.field176.method1217((byte) 100);
                                        if (var33 == null) {
                                            if (class158.field3631 != null) {
                                                class91.method724(2);
                                            }
                                            if (class150.field3414 != -1) {
                                                int var36 = class150.field3414;
                                                int var37 = class150.field3434;
                                                boolean var38 = class94.method749(true, 0, class20.field373.field2738[0], -1, 0, 0, var36, class20.field373.field2761[0], 0, var37, 0, 0);
                                                class150.field3414 = -1;
                                                if (var38) {
                                                    class154.field3545 = 0;
                                                    class154.field3547 = class66.field1590;
                                                    class135.field3149 = 1;
                                                    class27.field499 = class9.field166;
                                                }
                                            }
                                            class154.method1192((byte) -74);
                                            if (class50.field1164 != var25) {
                                                if (var25 != null) {
                                                    class132.method1010(var25, (byte) -121);
                                                }
                                                if (class50.field1164 != null) {
                                                    class132.method1010(class50.field1164, (byte) -126);
                                                }
                                            }
                                            if (class71.field1666 != var26 && class92.field2123 == class38.field925) {
                                                if (var26 != null) {
                                                    class132.method1010(var26, (byte) -100);
                                                }
                                                if (class71.field1666 != null) {
                                                    class132.method1010(class71.field1666, (byte) -112);
                                                }
                                            }
                                            if (class71.field1666 == null) {
                                                if (class38.field925 > 0) {
                                                    class38.field925--;
                                                }
                                            } else if (class92.field2123 > class38.field925) {
                                                class38.field925++;
                                                if (class92.field2123 == class38.field925) {
                                                    class132.method1010(class71.field1666, (byte) -114);
                                                }
                                            }
                                            class137.method1039(true);
                                            if (class23.field418) {
                                                class157.method1215(false);
                                            }
                                            for (int var39 = 0; var39 < 5; var39++) {
                                                int var10002 = class17.field351[var39]++;
                                            }
                                            int var40 = class31.method223(-513);
                                            int var41 = class113.method887((byte) -102);
                                            if (var40 > 4500 && var41 > 4500) {
                                                class30.field541++;
                                                class4.field68 = 250;
                                                class75.method605(false, 4000);
                                                class44.field1027.method357(13, -97);
                                            }
                                            class63.field1470++;
                                            class83.field1934++;
                                            class70.field1659++;
                                            if (class83.field1934 > 500) {
                                                class83.field1934 = 0;
                                                int var42 = (int) (Math.random() * 8.0D);
                                                if ((var42 & 0x2) == 2) {
                                                    class13.field225 += class30.field553;
                                                }
                                                if ((var42 & 0x4) == 4) {
                                                    class11.field173 += class11.field194;
                                                }
                                                if ((var42 & 0x1) == 1) {
                                                    class133.field3069 += class65.field1502;
                                                }
                                            }
                                            if (class11.field173 < -40) {
                                                class11.field194 = 1;
                                            }
                                            if (class63.field1470 > 500) {
                                                class63.field1470 = 0;
                                                int var43 = (int) (Math.random() * 8.0D);
                                                if ((var43 & 0x1) == 1) {
                                                    class27.field493 += class34.field702;
                                                }
                                                if ((var43 & 0x2) == 2) {
                                                    class29.field527 += class5.field102;
                                                }
                                            }
                                            if (class133.field3069 < -50) {
                                                class65.field1502 = 2;
                                            }
                                            if (class29.field527 < -20) {
                                                class5.field102 = 1;
                                            }
                                            if (class29.field527 > 10) {
                                                class5.field102 = -1;
                                            }
                                            if (class133.field3069 > 50) {
                                                class65.field1502 = -2;
                                            }
                                            if (class11.field173 > 40) {
                                                class11.field194 = -1;
                                            }
                                            if (class13.field225 < -55) {
                                                class30.field553 = 2;
                                            }
                                            if (class13.field225 > 55) {
                                                class30.field553 = -2;
                                            }
                                            if (class27.field493 < -60) {
                                                class34.field702 = 2;
                                            }
                                            if (class27.field493 > 60) {
                                                class34.field702 = -2;
                                            }
                                            if (class70.field1659 > 50) {
                                                class44.field1027.method357(232, -112);
                                                class64.field1479++;
                                            }
                                            try {
                                                if (class143.field3275 != null && class44.field1027.field1569 > 0) {
                                                    class143.field3275.method49(class44.field1027.field1587, class44.field1027.field1569, 0, (byte) 126);
                                                    class44.field1027.field1569 = 0;
                                                    class70.field1659 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var44) {
                                                class65.method504(-102);
                                                return;
                                            }
                                        }
                                        var34 = var33.field209;
                                        if (var34.field829 < 0) {
                                            break;
                                        }
                                        var35 = class128.method993(var34.field865, -100);
                                    } while (var35 == null || var35.field755 == null || var35.field755.length <= var34.field829 || var35.field755[var34.field829] != var34);
                                    class158.method1224(var33, (byte) -95);
                                }
                            }
                            var31 = var30.field209;
                            if (var31.field829 < 0) {
                                break;
                            }
                            var32 = class128.method993(var31.field865, -101);
                        } while (var32 == null || var32.field755 == null || var32.field755.length <= var31.field829 || var32.field755[var31.field829] != var31);
                        class158.method1224(var30, (byte) -93);
                    }
                }
                var28 = var27.field209;
                if (var28.field829 < 0) {
                    break;
                }
                var29 = class128.method993(var28.field865, 112);
            } while (var29 == null || var29.field755 == null || var28.field829 >= var29.field755.length || var29.field755[var28.field829] != var28);
            class158.method1224(var27, (byte) -89);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V")
    public static void method602(int arg0) {
        field1743 = null;
        field1754 = null;
        field1755 = null;
        field1740 = null;
        field1747 = null;
        if (arg0 != 17993) {
            field1751 = null;
        }
        field1744 = null;
        field1753 = null;
        field1741 = null;
        field1748 = null;
        field1739 = null;
        field1749 = null;
        field1742 = null;
        field1752 = null;
        field1751 = null;
    }
}
