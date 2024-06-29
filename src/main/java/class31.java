import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class31 implements Runnable {

    @OriginalMember(owner = "client!f", name = "g", descriptor = "Lhb;")
    public static class44 field767 = class102.method810("Bitte wenden Sie sich an den Kundendienst)3", -28606);

    @OriginalMember(owner = "client!f", name = "c", descriptor = "I")
    public static int field763 = -1;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "J")
    public static long field764 = 0L;

    @OriginalMember(owner = "client!f", name = "l", descriptor = "I")
    public static int field772 = 2301979;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "Lfc;")
    public static class34 field765 = new class34(30);

    @OriginalMember(owner = "client!f", name = "a", descriptor = "I")
    public static int field761;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!f", name = "i", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!f", name = "j", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!f", name = "k", descriptor = "I")
    public static int field771;

    @OriginalMember(owner = "client!f", name = "m", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!f", name = "n", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!f", name = "o", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!f", name = "p", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!f", name = "q", descriptor = "Ltd;")
    public static class116 field777;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "Lpc;")
    public static class93 field762;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIIIIIII)Z", line = 3)
    public static final boolean method307(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field774++;
        if (!class94.method748(9902, arg8)) {
            return false;
        } else if (arg2 == -7291) {
            class112.method859(arg0, arg1, arg4, arg5);
            boolean var9 = true;
            class72[] var10 = class113.field2777[arg8];
            for (int var11 = 0; var11 < var10.length; var11++) {
                class72 var12 = var10[var11];
                if (var12 != null && var12.field1818 == arg3) {
                    if (var12.field1800 > 0) {
                        class40.method352(var12, (byte) -106);
                    }
                    int var13 = var12.field1791 + arg0;
                    int var14 = var12.field1770 + arg1 - arg7;
                    if (var12.field1810 == 0) {
                        if (var12.field1809 && !class55.method508(arg6, var11, arg2 ^ 0xFFFFE386)) {
                            continue;
                        }
                        if (var12.field1817 - var12.field1760 < var12.field1827) {
                            var12.field1827 = var12.field1817 - var12.field1760;
                        }
                        if (var12.field1827 < 0) {
                            var12.field1827 = 0;
                        }
                        var9 &= method307(var13, var14, arg2, var11, var13 + var12.field1759, var12.field1760 + var14, arg6, var12.field1827, arg8);
                        class112.method859(arg0, arg1, arg4, arg5);
                        if (var12.field1817 > var12.field1760) {
                            class129.method964(var14, var12.field1760, 78, var13 + var12.field1759, var12.field1827, var12.field1817);
                        }
                    }
                    if (var12.field1810 != 1) {
                        if (var12.field1810 == 2) {
                            int var15 = 0;
                            for (int var16 = 0; var16 < var12.field1760; var16++) {
                                for (int var17 = 0; var17 < var12.field1759; var17++) {
                                    int var18 = var14 + (var12.field1769 + 32) * var16;
                                    int var19 = var13 + (var12.field1793 + 32) * var17;
                                    if (var15 < 20) {
                                        var18 += var12.field1763[var15];
                                        var19 += var12.field1795[var15];
                                    }
                                    if (var12.field1804[var15] > 0) {
                                        int var20 = 0;
                                        int var21 = var12.field1804[var15] - 1;
                                        int var22 = 0;
                                        if (var19 > class112.field2772 - 32 && var19 < class112.field2774 && class112.field2775 - 32 < var18 && var18 < class112.field2771 || class34.field843 != 0 && class5.field121 == var15) {
                                            int var23 = 0;
                                            if (class48.field1195 == 1 && class121.field2948 == var15 && (arg8 << 16) + var11 == class96.field2457) {
                                                var23 = 16777215;
                                            }
                                            class45 var24 = class28.method231((byte) 114, var21, var12.field1824[var15], var23);
                                            if (var24 == null) {
                                                var9 = false;
                                            } else {
                                                if (class34.field843 != 0 && class5.field121 == var15 && (arg8 << 16) + var11 == class61.field1533) {
                                                    var20 = class110.field2749 - class89.field2287;
                                                    var22 = class100.field2519 - class105.field2687;
                                                    if (var20 < 5 && var20 > -5) {
                                                        var20 = 0;
                                                    }
                                                    if (var22 < 5 && var22 > -5) {
                                                        var22 = 0;
                                                    }
                                                    if (client.field374 < 5) {
                                                        var20 = 0;
                                                        var22 = 0;
                                                    }
                                                    var24.method421(var19 + var22, var18 + var20, 128);
                                                    if (arg3 != -1) {
                                                        class72 var25 = var10[arg3];
                                                        if (class112.field2775 > var18 + var20 && var25.field1827 > 0) {
                                                            int var26 = (class112.field2775 - var18 - var20) * class44.field1124 / 3;
                                                            if (var26 > class44.field1124 * 10) {
                                                                var26 = class44.field1124 * 10;
                                                            }
                                                            if (var25.field1827 < var26) {
                                                                var26 = var25.field1827;
                                                            }
                                                            class89.field2287 += var26;
                                                            var25.field1827 -= var26;
                                                        }
                                                        if (var18 + var20 + 32 > class112.field2771 && var25.field1827 < var25.field1817 - var25.field1760) {
                                                            int var27 = (var18 + var20 + 32 - class112.field2771) * class44.field1124 / 3;
                                                            if (var27 > class44.field1124 * 10) {
                                                                var27 = class44.field1124 * 10;
                                                            }
                                                            if (var27 > var25.field1817 - var25.field1827 - var25.field1760) {
                                                                var27 = var25.field1817 - var25.field1760 - var25.field1827;
                                                            }
                                                            var25.field1827 += var27;
                                                            class89.field2287 -= var27;
                                                        }
                                                    }
                                                } else if (class102.field2592 != 0 && class78.field1975 == var15 && (arg8 << 16) + var11 == class130.field3123) {
                                                    var24.method421(var19, var18, 128);
                                                } else {
                                                    var24.method428(var19, var18);
                                                }
                                                if (var24.field1133 == 33 || var12.field1824[var15] != 1) {
                                                    int var28 = var12.field1824[var15];
                                                    class104.field2661.method301(class107.method839(arg2 ^ 0xFA142AD5, var28), var19 + var22 + 1, var18 + 10 + var20, 0);
                                                    class104.field2661.method301(class107.method839(arg2 ^ 0xFA142AD5, var28), var19 + var22, var18 - (-var20 + -9), 16776960);
                                                }
                                            }
                                        }
                                    } else if (var12.field1767 != null && var15 < 20) {
                                        class45 var29 = var12.method608(-120, var15);
                                        if (var29 != null) {
                                            var29.method428(var19, var18);
                                        } else if (class47.field1160) {
                                            var9 = false;
                                        }
                                    }
                                    var15++;
                                }
                            }
                        } else if (var12.field1810 == 3) {
                            int var30;
                            if (class104.method820(arg2 ^ 0xFFFFE386, var12)) {
                                var30 = var12.field1758;
                                if (class55.method508(arg6, var11, 3) && var12.field1751 != 0) {
                                    var30 = var12.field1751;
                                }
                            } else {
                                var30 = var12.field1831;
                                if (class55.method508(arg6, var11, 3) && var12.field1757 != 0) {
                                    var30 = var12.field1757;
                                }
                            }
                            if (var12.field1812 == 0) {
                                if (var12.field1811) {
                                    class112.method856(var13, var14, var12.field1759, var12.field1760, var30);
                                } else {
                                    class112.method862(var13, var14, var12.field1759, var12.field1760, var30);
                                }
                            } else if (var12.field1811) {
                                class112.method858(var13, var14, var12.field1759, var12.field1760, var30, 256 - (var12.field1812 & 0xFF));
                            } else {
                                class112.method851(var13, var14, var12.field1759, var12.field1760, var30, 256 - (var12.field1812 & 0xFF));
                            }
                        } else if (var12.field1810 == 4) {
                            class30 var31 = var12.method610(65535);
                            if (var31 != null) {
                                class44 var32 = var12.field1794;
                                int var33;
                                if (class104.method820(3, var12)) {
                                    var33 = var12.field1758;
                                    if (class55.method508(arg6, var11, 3) && var12.field1751 != 0) {
                                        var33 = var12.field1751;
                                    }
                                    if (var12.field1805.method414((byte) 84) > 0) {
                                        var32 = var12.field1805;
                                    }
                                } else {
                                    var33 = var12.field1831;
                                    if (class55.method508(arg6, var11, 3) && var12.field1757 != 0) {
                                        var33 = var12.field1757;
                                    }
                                }
                                if (var12.field1787 == 6 && (arg8 << 16) + var11 == class131.field3141) {
                                    var33 = var12.field1831;
                                    var32 = class27.field651;
                                }
                                if (class112.field2773 == 479) {
                                    if (var33 == 16776960) {
                                        var33 = 255;
                                    }
                                    if (var33 == 49152) {
                                        var33 = 16777215;
                                    }
                                }
                                class44 var34 = class110.method847(-120, var32, var12);
                                var31.method287(var34, var13, var14, var12.field1759, var12.field1760, var33, var12.field1789, var12.field1771, var12.field1788, var12.field1774);
                            } else if (class47.field1160) {
                                var9 = false;
                            }
                        } else if (var12.field1810 == 5) {
                            class45 var35 = var12.method613((byte) -2, class104.method820(3, var12));
                            if (var35 != null) {
                                var35.method428(var13, var14);
                            } else if (class47.field1160) {
                                var9 = false;
                            }
                        } else if (var12.field1810 == 6) {
                            class58.method555(var12.field1759 / 2 + var13, var12.field1760 / 2 + var14);
                            int var36 = class58.field1518[var12.field1819] * var12.field1834 >> 16;
                            int var37 = class58.field1519[var12.field1819] * var12.field1834 >> 16;
                            boolean var38 = class104.method820(arg2 ^ 0xFFFFE386, var12);
                            int var39;
                            if (var38) {
                                var39 = var12.field1781;
                            } else {
                                var39 = var12.field1752;
                            }
                            class24 var40;
                            if (var12.field1823 == 5) {
                                var40 = class95.field2413.method172(null, -1, (byte) -56, -1, null);
                            } else if (var39 == -1) {
                                var40 = var12.method612(arg2 + 16784506, null, class72.field1820.field2648, var38, -1);
                                if (var40 == null && class47.field1160) {
                                    var9 = false;
                                }
                            } else {
                                class118 var41 = client.method139(1, var39);
                                var40 = var12.method612(16777215, var41, class72.field1820.field2648, var38, var12.field1796);
                                if (var40 == null && class47.field1160) {
                                    var9 = false;
                                }
                            }
                            if (var40 != null) {
                                var40.method178(0, var12.field1807, 0, var12.field1819, 0, var37, var36);
                            }
                            class58.method551();
                        } else {
                            if (var12.field1810 == 7) {
                                class30 var42 = var12.method610(65535);
                                if (var42 == null) {
                                    if (class47.field1160) {
                                        var9 = false;
                                    }
                                    continue;
                                }
                                int var43 = 0;
                                for (int var44 = 0; var44 < var12.field1760; var44++) {
                                    for (int var45 = 0; var45 < var12.field1759; var45++) {
                                        if (var12.field1804[var43] > 0) {
                                            class80 var46 = class42.method358(arg2 ^ 0xFFFFE385, var12.field1804[var43] - 1);
                                            class44 var47 = var46.field2004;
                                            if (var47 == null) {
                                                var47 = class49.field1207;
                                            }
                                            if (var46.field2024 == 1 || var12.field1824[var43] != 1) {
                                                var47 = class117.method903(new class44[] { var47, class129.field3094, class41.method356((byte) -82, var12.field1824[var43]) }, false);
                                            }
                                            int var48 = (var12.field1769 + 12) * var44 + var14;
                                            int var49 = (var12.field1793 + 115) * var45 + var13;
                                            if (var12.field1771 == 0) {
                                                var42.method295(var47, var49, var48, var12.field1831, var12.field1789);
                                            } else if (var12.field1771 == 1) {
                                                var42.method289(var47, var12.field1759 / 2 + var49, var48, var12.field1831, var12.field1789);
                                            } else {
                                                var42.method303(var47, var12.field1759 + var49 - 1, var48, var12.field1831, var12.field1789);
                                            }
                                        }
                                        var43++;
                                    }
                                }
                            }
                            if (var12.field1810 == 8 && class101.method802(arg6, var11, -4) && class46.field1149 == class13.field259) {
                                int var50 = 0;
                                int var51 = 0;
                                class30 var52 = class103.field2631;
                                class44 var53 = var12.field1794;
                                class44 var54 = class110.method847(-98, var53, var12);
                                while (var54.method414((byte) 71) > 0) {
                                    int var62 = var54.method388(0, class72.field1833);
                                    class44 var63;
                                    if (var62 == -1) {
                                        var63 = var54;
                                        var54 = class51.field1274;
                                    } else {
                                        var63 = var54.method396((byte) -88, 0, var62);
                                        var54 = var54.method380(var62 + 2, (byte) 115);
                                    }
                                    int var64 = var52.method304(var63);
                                    var51 += var52.field754 + 1;
                                    if (var64 > var50) {
                                        var50 = var64;
                                    }
                                }
                                var50 += 6;
                                var51 += 7;
                                int var55 = var14 + var12.field1760 + 5;
                                int var56 = var12.field1759 + var13 - var50 - 5;
                                if (var13 + 5 > var56) {
                                    var56 = var13 + 5;
                                }
                                if (var51 + var55 > arg5) {
                                    var55 = arg5 - var51;
                                }
                                if (arg4 < var50 + var56) {
                                    var56 = arg4 - var50;
                                }
                                class112.method856(var56, var55, var50, var51, 16777120);
                                class112.method862(var56, var55, var50, var51, 0);
                                int var57 = var52.field754 + var55 + 2;
                                class44 var58 = var12.field1794;
                                class44 var59 = class110.method847(-117, var58, var12);
                                while (var59.method414((byte) 90) > 0) {
                                    int var60 = var59.method388(0, class72.field1833);
                                    class44 var61;
                                    if (var60 == -1) {
                                        var61 = var59;
                                        var59 = class51.field1274;
                                    } else {
                                        var61 = var59.method396((byte) -121, 0, var60);
                                        var59 = var59.method380(var60 + 2, (byte) 112);
                                    }
                                    var52.method295(var61, var56 + 3, var57, 0, false);
                                    var57 += var52.field754 + 1;
                                }
                            }
                        }
                    }
                }
            }
            return var9;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(B)V", line = 538)
    public static final void method308(byte arg0) {
        class14.field275 = 0;
        class1.field17 = -1;
        class15.field289 = false;
        class39.field882 = -1;
        class116.field2793 = 0;
        class22.field450 = -1;
        class71.field1744 = 0;
        field775++;
        class118.field2903 = -1;
        class35.field853 = 0;
        class90.field2301 = 0;
        class48.field1191 = 0;
        class92.field2333.field3182 = 0;
        class53.field1304.field3182 = 0;
        for (int var1 = 0; var1 < class82.field2110.length; var1++) {
            if (class82.field2110[var1] != null) {
                class82.field2110[var1].field1375 = -1;
            }
        }
        int var2 = 0;
        if (arg0 != 81) {
            return;
        }
        while (class116.field2845.length > var2) {
            if (class116.field2845[var2] != null) {
                class116.field2845[var2].field1375 = -1;
            }
            var2++;
        }
        class131.method1009(30, -110);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lm;I)Z", line = 591)
    public static final boolean method309(class72 arg0, int arg1) {
        int var2 = arg0.field1800;
        field769++;
        if (var2 >= 1 && var2 <= 200 || !(var2 < 701 || var2 > 900)) {
            class51.field1242++;
            class15.field305++;
            if (var2 >= 801) {
                var2 -= 701;
            } else if (var2 >= 701) {
                var2 -= 601;
            } else if (var2 < 101) {
                var2--;
            } else {
                var2 -= 101;
            }
            class52.method495(0, 10, 0, 0, 1000, class117.method903(new class44[] { class25.field583, class52.field1300[var2] }, false), class92.field2336);
            class52.method495(0, 42, 0, 0, 1000, class117.method903(new class44[] { class25.field583, class52.field1300[var2] }, false), class81.field2092);
            return true;
        } else if (var2 >= 401 && var2 <= 500) {
            class52.method495(0, 20, 0, 0, 1000, class117.method903(new class44[] { class25.field583, arg0.field1794 }, false), class92.field2336);
            class13.field244++;
            return true;
        } else {
            if (arg1 >= -6) {
                field762 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V", line = 637)
    public static final void method310(int arg0) {
        field766++;
        if (class102.field2590 == 0) {
            return;
        }
        if (arg0 > -2) {
            field768 = -36;
        }
        int var1 = 0;
        if (class35.field853 != 0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < 100; var2++) {
            if (class95.field2409[var2] != null) {
                int var3 = class95.field2407[var2];
                class44 var4 = class64.field1624[var2];
                if (var4 != null && var4.method400((byte) -54, class5.field122)) {
                    var4 = var4.method380(5, (byte) 112);
                }
                if (var4 != null && var4.method400((byte) -98, class48.field1190)) {
                    var4 = var4.method380(5, (byte) 114);
                }
                if ((var3 == 3 || var3 == 7) && (var3 == 7 || class39.field881 == 0 || class39.field881 == 1 && class57.method530(var4, false))) {
                    int var5 = 329 - var1 * 13;
                    var1++;
                    if (class100.field2519 > 4 && class110.field2749 - 4 > var5 + -10 && class110.field2749 - 4 <= var5 + 3) {
                        int var6 = class103.field2631.method297(class117.method903(new class44[] { class46.field1138, class97.field2468, var4, class95.field2409[var2] }, false)) + 25;
                        if (var6 > 450) {
                            var6 = 450;
                        }
                        if (class100.field2519 < var6 + 4) {
                            class100.field2542++;
                            if (class51.field1240 >= 1) {
                                class52.method495(0, 2032, 0, 0, 1000, class117.method903(new class44[] { class25.field583, var4 }, false), class53.field1321);
                                class81.field2078++;
                            }
                            class105.field2682++;
                            class52.method495(0, 2049, 0, 0, 1000, class117.method903(new class44[] { class25.field583, var4 }, false), class84.field2152);
                            class52.method495(0, 2006, 0, 0, 1000, class117.method903(new class44[] { class25.field583, var4 }, false), class66.field1672);
                        }
                    }
                    if (var1 >= 5) {
                        return;
                    }
                }
                if ((var3 == 5 || var3 == 6) && class39.field881 < 2) {
                    var1++;
                    if (var1 >= 5) {
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIII)V", line = 742)
    public static final void method311(int arg0, int arg1, int arg2, int arg3) {
        field761++;
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field763 = -1;
            class90.field2300 = -1;
            return;
        }
        int var4 = class55.method507(arg1, class79.field1993, arg0, arg3 - 168) - arg2;
        int var5 = var4 - class88.field2236;
        int var6 = class24.field554[class101.field2579];
        int var7 = class24.field557[class101.field2579];
        int var8 = arg0 - class130.field3122;
        int var9 = class24.field554[class95.field2420];
        int var10 = class24.field557[class95.field2420];
        int var11 = arg1 - class51.field1279;
        int var12 = var6 * var8 + var7 * var11 >> 16;
        int var13 = var6 * var11 - var7 * var8 >> 16;
        int var15 = var5 * var9 - var10 * var13 >> 16;
        if (arg3 != 167) {
            method307(94, -30, 42, -59, -70, -13, -12, 54, -126);
        }
        int var16 = var5 * var10 + var9 * var13 >> 16;
        if (var16 >= 50) {
            class90.field2300 = (var15 << 9) / var16 + 167;
            field763 = (var12 << 9) / var16 + 256;
        } else {
            field763 = -1;
            class90.field2300 = -1;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ZI)I", line = 798)
    public static final int method312(boolean arg0, int arg1) {
        field776++;
        if (!arg0) {
            method311(-35, 73, 100, -86);
        }
        return (int) (Math.log((double) arg1 * 0.00390625D) * 868.5889638065036D + 0.5D);
    }

    @OriginalMember(owner = "client!f", name = "run", descriptor = "()V", line = 809)
    public final void run() {
        field773++;
        try {
            while (true) {
                class47 var1 = class128.field3082;
                class107 var2;
                synchronized (class128.field3082) {
                    var2 = (class107) class128.field3082.method443((byte) -111);
                }
                if (var2 == null) {
                    class47.method447((byte) -84, 100L);
                    Object var6 = class16.field322;
                    synchronized (class16.field322) {
                        if (class36.field861 <= 1) {
                            class36.field861 = 0;
                            class16.field322.notifyAll();
                            return;
                        }
                        class36.field861--;
                    }
                } else {
                    if (var2.field2729 == 0) {
                        var2.field2710.method808((byte) 123, (int) var2.field3057, var2.field2706, var2.field2706.length);
                        class47 var4 = class128.field3082;
                        synchronized (class128.field3082) {
                            var2.method948(-104);
                        }
                    } else if (var2.field2729 == 1) {
                        var2.field2706 = var2.field2710.method809(119, (int) var2.field3057);
                        class47 var3 = class128.field3082;
                        synchronized (class128.field3082) {
                            class118.field2901.method448(var2, true);
                        }
                    }
                    Object var5 = class16.field322;
                    synchronized (class16.field322) {
                        if (class36.field861 <= 1) {
                            class36.field861 = 0;
                            class16.field322.notifyAll();
                            return;
                        }
                        class36.field861 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            client.method132(null, var17, (byte) 68);
        }
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(B)V", line = 900)
    public static void method313(byte arg0) {
        field765 = null;
        field777 = null;
        if (arg0 < 0) {
            method311(15, 86, 56, 9);
        }
        field767 = null;
        field762 = null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lhb;Ltd;Lhb;Z)Lhc;", line = 919)
    public static final class45 method314(class44 arg0, class116 arg1, class44 arg2, boolean arg3) {
        field770++;
        int var4 = arg1.method897(-101, arg0);
        if (arg3) {
            return null;
        } else {
            int var5 = arg1.method890((byte) 87, arg2, var4);
            return class27.method227(arg1, var5, 16777215, var4);
        }
    }
}
