import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class79 {

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "Lkd;")
    private static class73 field1999 = class126.method1070((byte) -66, "Loaded fonts");

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "Lkd;")
    public static class73 field2001 = class126.method1070((byte) -66, " )2> <col=00ffff>");

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "Lkd;")
    public static class73 field2005 = field1999;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "Lta;")
    public static class131 field2006 = new class131(4096);

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "Lkd;")
    public static class73 field2007 = class126.method1070((byte) -66, "bevor Sie den Vorgang wiederholen)3");

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "Lkd;")
    private static class73 field2008 = class126.method1070((byte) -66, " more options");

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "Lkd;")
    public static class73 field2009 = field2008;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "Ljb;")
    public static class64 field2011 = new class64(64);

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "Lde;")
    public static class27 field2010;

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "[Lde;")
    public static class27[] field2012;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BI)Z")
    public static final boolean method678(byte arg0, int arg1) {
        field2000++;
        if (arg1 < 32) {
            return false;
        } else if (arg1 == 127) {
            return false;
        } else if (arg1 >= 129 && arg1 <= 159) {
            return false;
        } else {
            return arg0 == 43;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)I")
    public static int method679(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
    public static final void method680(int arg0) {
        field2002++;
        class31.field864.method246(8670);
        for (int var1 = 0; var1 < 32; var1++) {
            class47.field1239[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class142.field3550[var2] = 0L;
        }
        class31.field871 = arg0;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V")
    public static final void method681(byte arg0) {
        if (class53.field1424 > 1) {
            class53.field1424--;
        }
        field2004++;
        if (class118.field3017 > 0) {
            class118.field3017--;
        }
        if (class25.field728) {
            class25.field728 = false;
            class76.method656(0);
            return;
        }
        for (int var1 = 0; var1 < 100 && class47.method366(true); var1++) {
        }
        if (class1.field35 != 30 && class1.field35 != 35) {
            return;
        }
        if (class2.field147 && class1.field35 == 30) {
            class105.field2615 = 0;
            class98.field2455 = 0;
            while (class137.method1118(-39)) {
            }
            for (int var2 = 0; var2 < class73.field1895.length; var2++) {
                class73.field1895[var2] = false;
            }
        }
        class15.method123(class121.field3079, (byte) -56, 159);
        Object var3 = class92.field2368.field3530;
        synchronized (class92.field2368.field3530) {
            if (!class104.field2592) {
                class92.field2368.field3551 = 0;
            } else if (class105.field2615 != 0 || class92.field2368.field3551 >= 40) {
                class132.field3306++;
                class121.field3079.method1215(95, 243);
                int var4 = 0;
                class121.field3079.method956((byte) 10, 0);
                int var5 = class121.field3079.field2816;
                for (int var6 = 0; class92.field2368.field3551 > var6 && class121.field3079.field2816 - var5 < 240; var6++) {
                    var4++;
                    int var7 = class92.field2368.field3549[var6];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 502) {
                        var7 = 502;
                    }
                    int var8 = class92.field2368.field3547[var6];
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 764) {
                        var8 = 764;
                    }
                    int var9 = var7 * 765 + var8;
                    if (class92.field2368.field3549[var6] == -1 && class92.field2368.field3547[var6] == -1) {
                        var9 = 524287;
                        var8 = -1;
                        var7 = -1;
                    }
                    if (class45.field1194 != var8 || class77.field1968 != var7) {
                        int var10 = var8 - class45.field1194;
                        class45.field1194 = var8;
                        int var11 = var7 - class77.field1968;
                        class77.field1968 = var7;
                        if (class21.field590 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                            var11 += 32;
                            var10 += 32;
                            class121.field3079.method947((class21.field590 << 12) + (var10 << 6) + var11, 23661);
                            class21.field590 = 0;
                        } else if (class21.field590 < 8) {
                            class121.field3079.method976(4, (class21.field590 << 19) + (var9 + 8388608));
                            class21.field590 = 0;
                        } else {
                            class121.field3079.method937(-1370716840, (class21.field590 << 19) + var9 - 1073741824);
                            class21.field590 = 0;
                        }
                    } else if (class21.field590 < 2047) {
                        class21.field590++;
                    }
                }
                class121.field3079.method968(class121.field3079.field2816 - var5, 7);
                if (class92.field2368.field3551 > var4) {
                    class92.field2368.field3551 -= var4;
                    for (int var12 = 0; var12 < class92.field2368.field3551; var12++) {
                        class92.field2368.field3547[var12] = class92.field2368.field3547[var4 + var12];
                        class92.field2368.field3549[var12] = class92.field2368.field3549[var4 + var12];
                    }
                } else {
                    class92.field2368.field3551 = 0;
                }
            }
        }
        if (class105.field2615 != 0) {
            class122.field3128++;
            long var13 = (class13.field409 - class100.field2518) / 50L;
            if (var13 > 4095L) {
                var13 = 4095L;
            }
            class100.field2518 = class13.field409;
            int var15 = class42.field1134;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 502) {
                var15 = 502;
            }
            int var16 = class103.field2570;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 764) {
                var16 = 764;
            }
            int var17 = var15 * 765 + var16;
            byte var18 = 0;
            if (class105.field2615 == 2) {
                var18 = 1;
            }
            class121.field3079.method1215(-108, 39);
            int var19 = (int) var13;
            class121.field3079.method926((var18 << 19) + (var19 << 20) + var17, -9437);
        }
        if (class73.field1895[96] || class73.field1895[97] || class73.field1895[98] || class73.field1895[99]) {
            class45.field1180 = true;
        }
        if (class12.field383 > 0) {
            class12.field383--;
        }
        if (class45.field1180 && class12.field383 <= 0) {
            class12.field383 = 20;
            class45.field1180 = false;
            class121.field3079.method1215(108, 175);
            class107.field2645++;
            class121.field3079.method965(class86.field2183, 93);
            class121.field3079.method965(class55.field1490, 92);
        }
        if (class45.field1188 && !class76.field1951) {
            class76.field1951 = true;
            class123.field3147++;
            class121.field3079.method1215(-105, 179);
            class121.field3079.method956((byte) 10, 1);
        }
        if (!class45.field1188 && class76.field1951) {
            class76.field1951 = false;
            class121.field3079.method1215(116, 179);
            class123.field3147++;
            class121.field3079.method956((byte) 10, 0);
        }
        class77.method669(15);
        if (class1.field35 != 30 && class1.field35 != 35) {
            return;
        }
        class94.method780(115);
        class136.method1110(true);
        class143.field3573++;
        if (class143.field3573 > 750) {
            class76.method656(0);
            return;
        }
        class53.method428((byte) -94);
        class82.method700((byte) -128);
        class145.method1161(14522);
        if (class87.field2196 != 0) {
            class111.field2735 += 20;
            if (class111.field2735 >= 400) {
                class87.field2196 = 0;
            }
        }
        class125.field3166++;
        if (class105.field2607 != 0) {
            class70.field1770++;
            if (class70.field1770 >= 15) {
                if (class105.field2607 == 2) {
                    class38.field1028 = true;
                }
                if (class105.field2607 == 3) {
                    class132.field3304 = true;
                }
                class105.field2607 = 0;
            }
        }
        if (class87.field2198 != 0) {
            class34.field934++;
            if (class73.field1892 + 5 < class31.field869 || class31.field869 < class73.field1892 - 5 || class3.field161 > class9.field291 + 5 || class9.field291 - 5 > class3.field161) {
                class30.field850 = true;
            }
            if (class98.field2455 == 0) {
                if (class87.field2198 == 3) {
                    class132.field3304 = true;
                }
                if (class87.field2198 == 2) {
                    class38.field1028 = true;
                }
                class87.field2198 = 0;
                if (class30.field850 && class34.field934 >= 5) {
                    class142.field3533 = -1;
                    class80.method683((byte) -113);
                    if (class142.field3533 == class115.field2907 && class63.field1663 != class28.field788) {
                        client.field595++;
                        class1 var20 = class45.method335(class115.field2907, -66);
                        byte var21 = 0;
                        if (class22.field629 == 1 && var20.field84 == 206) {
                            var21 = 1;
                        }
                        if (var20.field6[class28.field788] <= 0) {
                            var21 = 0;
                        }
                        if (class151.method1218(0, class153.method1225(var20, -123))) {
                            int var24 = class63.field1663;
                            int var25 = class28.field788;
                            var20.field6[var25] = var20.field6[var24];
                            var20.field92[var25] = var20.field92[var24];
                            var20.field6[var24] = -1;
                            var20.field92[var24] = 0;
                        } else if (var21 == 1) {
                            int var22 = class63.field1663;
                            int var23 = class28.field788;
                            while (var22 != var23) {
                                if (var22 > var23) {
                                    var20.method5(var22, var22 - 1, (byte) -77);
                                    var22--;
                                } else if (var23 > var22) {
                                    var20.method5(var22, var22 + 1, (byte) -85);
                                    var22++;
                                }
                            }
                        } else {
                            var20.method5(class63.field1663, class28.field788, (byte) -79);
                        }
                        class121.field3079.method1215(-67, 246);
                        class121.field3079.method932((byte) -56, class115.field2907);
                        class121.field3079.method947(class63.field1663, 23661);
                        class121.field3079.method947(class28.field788, 23661);
                        class121.field3079.method971(0, var21);
                    }
                } else if ((class115.field2904 == 1 || class140.method1138(class129.field3262 - 1, 0)) && class129.field3262 > 2) {
                    class24.method194((byte) -84);
                } else if (class129.field3262 > 0) {
                    class115.method983(0, class129.field3262 - 1);
                }
                class70.field1770 = 10;
                class105.field2615 = 0;
            }
        }
        byte var26 = 34;
        if (arg0 >= -101) {
            method682(39);
        }
        if (class81.field2033 == -1) {
            if (class52.field1393 != -1) {
                class14.method116(0, true, 338, class52.field1393, var26, 4, 4, 516);
            } else if (class1.field80 != -1) {
                class14.method116(0, true, 338, class1.field80, var26, 4, 4, 516);
            }
            if (class105.field2624 != -1) {
                class14.method116(1, true, 466, class105.field2624, var26, 205, 553, 743);
            } else if (class24.field683[class141.field3523] != -1) {
                class14.method116(1, true, 466, class24.field683[class141.field3523], var26, 205, 553, 743);
            }
            if (class129.field3246 != -1) {
                class14.method116(2, true, 453, class129.field3246, var26, 357, 17, 496);
            } else if (class11.field364 != -1) {
                class14.method116(2, true, 453, class11.field364, var26, 357, 17, 496);
            }
        } else {
            class14.method116(3, true, 503, class81.field2033, var26, 0, 0, 765);
            if (class18.field528 != -1) {
                class14.method116(3, true, 503, class18.field528, var26, 0, 0, 765);
            }
        }
        if (class81.field2033 == -1) {
            if (class52.field1393 != -1) {
                class14.method116(0, true, 338, class52.field1393, ~var26, 4, 4, 516);
            } else if (class1.field80 != -1) {
                class14.method116(0, true, 338, class1.field80, ~var26, 4, 4, 516);
            }
            if (class105.field2624 != -1) {
                class14.method116(1, true, 466, class105.field2624, ~var26, 205, 553, 743);
            } else if (class24.field683[class141.field3523] != -1) {
                class14.method116(1, true, 466, class24.field683[class141.field3523], ~var26, 205, 553, 743);
            }
            if (class129.field3246 != -1) {
                class14.method116(2, true, 453, class129.field3246, ~var26, 357, 17, 496);
            } else if (class11.field364 != -1) {
                class14.method116(2, true, 453, class11.field364, ~var26, 357, 17, 496);
            }
        } else {
            class14.method116(3, true, 503, class81.field2033, ~var26, 0, 0, 765);
            if (class18.field528 != -1) {
                class14.method116(3, true, 503, class18.field528, ~var26, 0, 0, 765);
            }
        }
        class28.method218((byte) -124);
        if (class8.field263 != -1) {
            int var27 = class8.field274;
            int var28 = class8.field263;
            boolean var29 = class49.method394(class73.field1901.field2304[0], 0, 0, 0, class73.field1901.field2280[0], -1, 0, var28, var27, 0, 0, true);
            class8.field263 = -1;
            if (var29) {
                class87.field2196 = 1;
                class122.field3122 = class103.field2570;
                class111.field2735 = 0;
                class74.field1918 = class42.field1134;
            }
        }
        if (class105.field2615 == 1 && class143.field3575 != null) {
            class143.field3575 = null;
            class132.field3304 = true;
            class105.field2615 = 0;
        }
        class151.method1216(0);
        if (class81.field2033 == -1) {
            class64.method532(25330);
            class126.method1066(-32408);
            class15.method120((byte) -54);
        }
        if (class98.field2455 == 1 || class105.field2615 == 1) {
            class78.field1996++;
        }
        if (class133.field3351 == -1 && class24.field702 == -1 && class119.field3054 == -1) {
            if (class18.field522 > 0) {
                class18.field522--;
            }
        } else if (class18.field522 < class28.field781) {
            class18.field522++;
            if (class28.field781 == class18.field522) {
                if (class24.field702 != -1) {
                    class38.field1028 = true;
                }
                if (class133.field3351 != -1) {
                    class132.field3304 = true;
                }
            }
        }
        class42.method316(1);
        if (class31.field873) {
            class28.method224((byte) 110);
        }
        for (int var30 = 0; var30 < 5; var30++) {
            int var10002 = class61.field1614[var30]++;
        }
        class129.method1079((byte) -13);
        int var31 = class118.method1023(49);
        int var32 = class55.method443(100);
        if (var31 > 4500 && var32 > 4500) {
            class84.field2139++;
            class118.field3017 = 250;
            class78.method672(0, 4000);
            class121.field3079.method1215(-45, 10);
        }
        class1.field120++;
        class122.field3117++;
        class71.field1798++;
        if (class71.field1798 > 500) {
            class71.field1798 = 0;
            int var33 = (int) (Math.random() * 8.0D);
            if ((var33 & 0x4) == 4) {
                class121.field3107 += class82.field2062;
            }
            if ((var33 & 0x1) == 1) {
                class38.field1034 += class58.field1539;
            }
            if ((var33 & 0x2) == 2) {
                class58.field1555 += class57.field1519;
            }
        }
        if (class1.field120 > 500) {
            class1.field120 = 0;
            int var34 = (int) (Math.random() * 8.0D);
            if ((var34 & 0x1) == 1) {
                class84.field2123 += class16.field499;
            }
            if ((var34 & 0x2) == 2) {
                class43.field1156 += class73.field1902;
            }
        }
        if (class38.field1034 < -50) {
            class58.field1539 = 2;
        }
        if (class84.field2123 < -60) {
            class16.field499 = 2;
        }
        if (class121.field3107 < -40) {
            class82.field2062 = 1;
        }
        if (class58.field1555 < -55) {
            class57.field1519 = 2;
        }
        if (class84.field2123 > 60) {
            class16.field499 = -2;
        }
        if (class121.field3107 > 40) {
            class82.field2062 = -1;
        }
        if (class38.field1034 > 50) {
            class58.field1539 = -2;
        }
        if (class43.field1156 < -20) {
            class73.field1902 = 1;
        }
        if (class58.field1555 > 55) {
            class57.field1519 = -2;
        }
        if (class43.field1156 > 10) {
            class73.field1902 = -1;
        }
        if (class122.field3117 > 50) {
            class137.field3433++;
            class121.field3079.method1215(-123, 150);
        }
        try {
            if (class31.field862 != null && class121.field3079.field2816 > 0) {
                class31.field862.method1143(5000, 0, class121.field3079.field2880, class121.field3079.field2816);
                class122.field3117 = 0;
                class121.field3079.field2816 = 0;
            }
        } catch (IOException var35) {
            class76.method656(0);
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V")
    public static void method682(int arg0) {
        field2007 = null;
        field2011 = null;
        field2010 = null;
        field2001 = null;
        int var1 = -16 / ((arg0 + 70) / 37);
        field2005 = null;
        field2009 = null;
        field1999 = null;
        field2006 = null;
        field2008 = null;
        field2012 = null;
    }
}
