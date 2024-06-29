import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class219 {

    @OriginalMember(owner = "client!d", name = "f", descriptor = "[I")
    private int[] field3816;

    @OriginalMember(owner = "client!d", name = "g", descriptor = "Ldf;")
    private static class51 field3817 = class46.method233("Checking for updates )2 ", 100);

    @OriginalMember(owner = "client!d", name = "c", descriptor = "Ldf;")
    public static class51 field3813 = field3817;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "Ldf;")
    public static class51 field3812 = class46.method233("Bitte entfernen Sie ", 100);

    @OriginalMember(owner = "client!d", name = "j", descriptor = "I")
    public static int field3820 = 0;

    @OriginalMember(owner = "client!d", name = "i", descriptor = "Ldf;")
    public static class51 field3819 = class46.method233("blaugr-Un:", 100);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!d", name = "h", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!d", name = "k", descriptor = "I")
    public static int field3821;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IB)I")
    public final int method1506(int arg0, byte arg1) {
        int var3 = (this.field3816.length >> 1) - 1;
        field3815++;
        int var4 = arg0 & var3;
        if (arg1 != 76) {
            return 92;
        }
        while (true) {
            int var5 = this.field3816[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field3816[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IILm;II)V")
    public static final void method1507(int arg0, int arg1, class108 arg2, int arg3, int arg4) {
        field3811++;
        if (arg3 != 9) {
            method1511(-55);
        }
        for (class93 var5 = (class93) class209.field3485.method1720(true); var5 != null; var5 = (class93) class209.field3485.method1712((byte) 112)) {
            if (var5.field1543 == arg1 && (arg0 * 128) == var5.field1536 && arg4 * 128 == var5.field1558 && var5.field1554.field1799 == arg2.field1799) {
                if (var5.field1552 != null) {
                    class166.field2709.method488(var5.field1552);
                    var5.field1552 = null;
                }
                if (var5.field1537 != null) {
                    class166.field2709.method488(var5.field1537);
                    var5.field1537 = null;
                }
                var5.method764((byte) -87);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(IB)Leb;")
    public static final class222 method1508(int arg0, byte arg1) {
        int var2 = 9 / ((30 - arg1) / 48);
        field3821++;
        class222 var3 = (class222) class28.field400.method1357((byte) -114, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class69.field1121.method828(class140.method1013(120, arg0), (byte) 109, class109.method793((byte) -57, arg0));
        class222 var5 = new class222();
        var5.field3859 = arg0;
        if (var4 != null) {
            var5.method1524(-124, new class121(var4));
        }
        var5.method1529(-54);
        if (var5.field3882 != -1) {
            var5.method1520(method1508(var5.field3882, (byte) 108), true, method1508(var5.field3900, (byte) 85));
        }
        if (var5.field3866 != -1) {
            var5.method1523(method1508(var5.field3866, (byte) 103), method1508(var5.field3850, (byte) 94), (byte) -41);
        }
        if (!class8.field93 && var5.field3914) {
            var5.field3901 = false;
            var5.field3908 = null;
            var5.field3856 = 0;
            var5.field3907 = class190.field3187;
            var5.field3915 = null;
        }
        class28.field400.method1351(var5, 2, (long) arg0);
        return var5;
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(IB)V")
    public static final void method1509(int arg0, byte arg1) {
        int var2 = -56 % ((arg1 + 24) / 53);
        class128.field2142.method1348(0, arg0);
        field3818++;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)Z")
    public static final boolean method1510(int arg0) throws IOException {
        field3814++;
        if (class204.field3415 == null) {
            return false;
        }
        int var1 = class204.field3415.method837(false);
        if (var1 == 0) {
            return false;
        }
        if (class35.field516 == -1) {
            class204.field3415.method841(0, class97.field1622.field2014, 1, (byte) -35);
            var1--;
            class97.field1622.field2026 = 0;
            class35.field516 = class97.field1622.method426(-91);
            class70.field1128 = class222.field3920[class35.field516];
        }
        if (class70.field1128 == -1) {
            if (var1 <= 0) {
                return false;
            }
            var1--;
            class204.field3415.method841(0, class97.field1622.field2014, 1, (byte) -45);
            class70.field1128 = class97.field1622.field2014[0] & 0xFF;
        }
        if (class70.field1128 == -2) {
            if (var1 <= 1) {
                return false;
            }
            class204.field3415.method841(0, class97.field1622.field2014, 2, (byte) -81);
            var1 -= 2;
            class97.field1622.field2026 = 0;
            class70.field1128 = class97.field1622.method876(false);
        }
        if (var1 < class70.field1128) {
            return false;
        }
        class97.field1622.field2026 = 0;
        class204.field3415.method841(0, class97.field1622.field2014, class70.field1128, (byte) -123);
        class37.field573 = 0;
        class189.field3163 = class44.field705;
        class44.field705 = class52.field874;
        class52.field874 = class35.field516;
        if (arg0 > -50) {
            return true;
        } else if (class35.field516 == 2) {
            int var2 = class97.field1622.method897(-51);
            int var3 = class97.field1622.method914(93);
            class252.method1710(var3, -120, var2);
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 120) {
            byte var4 = class97.field1622.method912((byte) -90);
            int var5 = class97.field1622.method876(false);
            class4.method14(var4, var5, (byte) 94);
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 182) {
            int var6 = class97.field1622.method890((byte) -83);
            int var7 = class97.field1622.method867(24);
            int var8 = class97.field1622.method890((byte) -83);
            int var9 = class97.field1622.method890((byte) -83);
            if ((var7 >> 30) != 0) {
                int var18 = (var7 & 0x3C3A71AF) >> 28;
                int var19 = ((var7 & 0xFFFC6F5) >> 14) - class11.field160;
                int var20 = (var7 & 0x3FFF) - class241.field4179;
                if (var19 >= 0 && var20 >= 0 && var19 < 104 && var20 < 104) {
                    int var21 = var19 * 128 + 64;
                    int var22 = var20 * 128 + 64;
                    class20 var23 = new class20(var6, var18, var21, var22, class207.method1424(var18, var21, (byte) 70, var22) - var8, var9, class179.field2960);
                    class27.field391.method1709(81, new class13(var23));
                }
            } else if (var7 >> 29 != 0) {
                int var14 = var7 & 0xFFFF;
                class83 var15 = class34.field512[var14];
                if (var15 != null) {
                    var15.field4334 = var6;
                    var15.field4357 = var8;
                    if (var15.field4334 == 65535) {
                        var15.field4334 = -1;
                    }
                    var15.field4306 = 0;
                    var15.field4289 = 0;
                    var15.field4358 = class179.field2960 + var9;
                    if (class179.field2960 < var15.field4358) {
                        var15.field4306 = -1;
                    }
                    if (var15.field4334 != -1 && class179.field2960 == var15.field4358) {
                        int var16 = class195.method1384(var15.field4334, 0).field1388;
                        if (var16 != -1) {
                            class151 var17 = class72.method501(var16, (byte) 35);
                            if (var17 != null && var17.field2539 != null) {
                                class208.method1433(var15.field4348, var15.field4319, 99, 0, false, var17);
                            }
                        }
                    }
                }
            } else if (var7 >> 28 != 0) {
                int var10 = var7 & 0xFFFF;
                class103 var11;
                if (class167.field2719 == var10) {
                    var11 = class44.field706;
                } else {
                    var11 = class66.field1055[var10];
                }
                if (var11 != null) {
                    var11.field4306 = 0;
                    var11.field4289 = 0;
                    var11.field4357 = var8;
                    var11.field4334 = var6;
                    if (var11.field4334 == 65535) {
                        var11.field4334 = -1;
                    }
                    var11.field4358 = class179.field2960 + var9;
                    if (var11.field4358 > class179.field2960) {
                        var11.field4306 = -1;
                    }
                    if (var11.field4334 != -1 && class179.field2960 == var11.field4358) {
                        int var12 = class195.method1384(var11.field4334, 0).field1388;
                        if (var12 != -1) {
                            class151 var13 = class72.method501(var12, (byte) 126);
                            if (var13 != null && var13.field2539 != null) {
                                class208.method1433(var11.field4348, var11.field4319, 67, 0, class44.field706 == var11, var13);
                            }
                        }
                    }
                }
            }
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 179) {
            class208.method1436(0);
            class115.field1948 = class97.field1622.method884(14513);
            class95.field1571 = class189.field3173;
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 226) {
            byte[] var24 = new byte[class70.field1128];
            class97.field1622.method430(class70.field1128, 0, var24, 0);
            class76.method547(64, class101.method741(class70.field1128, 0, true, var24), true);
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 181) {
            class164.method1154(false);
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 114) {
            int var25 = class97.field1622.method880((byte) 107);
            int var26 = class97.field1622.method867(-117);
            int var27 = class97.field1622.method876(false);
            int var28 = class97.field1622.method914(-70);
            class213 var29 = class198.method1392(11823, var26);
            if (var29.field3586 != var27 || var29.field3668 != var25 || var29.field3553 != var28) {
                var29.field3553 = var28;
                var29.field3668 = var25;
                var29.field3586 = var27;
                class25.method135(var29, -28014);
            }
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 201) {
            class140.method1019(false);
            class208.method1436(0);
            class35.field516 = -1;
            class247.field4322 += 32;
            return true;
        } else if (class35.field516 == 118) {
            int var30 = class97.field1622.method897(-75);
            int var31 = var30 >> 6;
            class157 var32 = new class157();
            var32.field2592 = var30 & 0x3F;
            var32.field2597 = class97.field1622.method897(115);
            if (var32.field2597 >= 0 && var32.field2597 < class116.field1968.length) {
                if (var32.field2592 == 1 || var32.field2592 == 10) {
                    var32.field2596 = class97.field1622.method876(false);
                    class97.field1622.field2026 += 3;
                } else if (var32.field2592 >= 2 && var32.field2592 <= 6) {
                    if (var32.field2592 == 2) {
                        var32.field2599 = 64;
                        var32.field2587 = 64;
                    }
                    if (var32.field2592 == 3) {
                        var32.field2587 = 0;
                        var32.field2599 = 64;
                    }
                    if (var32.field2592 == 4) {
                        var32.field2599 = 64;
                        var32.field2587 = 128;
                    }
                    if (var32.field2592 == 5) {
                        var32.field2587 = 64;
                        var32.field2599 = 0;
                    }
                    if (var32.field2592 == 6) {
                        var32.field2587 = 64;
                        var32.field2599 = 128;
                    }
                    var32.field2592 = 2;
                    var32.field2586 = class97.field1622.method876(false);
                    var32.field2590 = class97.field1622.method876(false);
                    var32.field2601 = class97.field1622.method897(-22);
                }
                var32.field2589 = class97.field1622.method876(false);
                if (var32.field2589 == 65535) {
                    var32.field2589 = -1;
                }
                class135.field2250[var31] = var32;
            }
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 49) {
            class67.field1095 = class97.field1622.method901((byte) -4);
            class260.field4545 = class97.field1622.method906(9147);
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 17) {
            long var33 = class97.field1622.method868(102);
            class51 var35 = class187.method1322(class192.method1368(-6290, class97.field1622).method307(-3));
            class147.method1064(var35, class63.method422(var33, -28).method304((byte) -92), (byte) 90, 6);
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 246) {
            int var36 = class70.field1128 + class97.field1622.field2026;
            int var37 = class97.field1622.method876(false);
            int var38 = class97.field1622.method876(false);
            if (class243.field4206 != var37) {
                class243.field4206 = var37;
                class143.method1032(class243.field4206, (byte) 69);
                class215.method1477((byte) -22, false);
                class20.method103(class243.field4206, (byte) -96);
                for (int var39 = 0; var39 < 100; var39++) {
                    class213.field3705[var39] = true;
                }
            }
            while ((var38--) > 0) {
                int var48 = class97.field1622.method865((byte) 8);
                int var49 = class97.field1622.method876(false);
                int var50 = class97.field1622.method897(108);
                class42 var51 = (class42) class79.field1265.method1453((long) var48, 1);
                if (var51 != null && var51.field668 != var49) {
                    class258.method1753(true, var51, false);
                    var51 = null;
                }
                if (var51 == null) {
                    var51 = class29.method146(118, var49, var50, var48);
                }
                var51.field667 = true;
            }
            for (class42 var40 = (class42) class79.field1265.method1451(47); var40 != null; var40 = (class42) class79.field1265.method1449(-1)) {
                if (var40.field667) {
                    var40.field667 = false;
                } else {
                    class258.method1753(true, var40, false);
                }
            }
            class242.field4190.method1448(0);
            while (var36 > class97.field1622.field2026) {
                int var41 = class97.field1622.method865((byte) 8);
                int var42 = class97.field1622.method876(false);
                int var43 = class97.field1622.method876(false);
                int var44 = class97.field1622.method865((byte) 8);
                for (int var45 = var42; var45 <= var43; var45++) {
                    long var46 = ((long) var41 << 32) + (long) var45;
                    class242.field4190.method1447(18, var46, new class255(var44));
                }
            }
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 8) {
            int var52 = class97.field1622.method914(47);
            int var53 = class97.field1622.method890((byte) -83);
            int var54 = class97.field1622.method906(9147);
            class83 var55 = class34.field512[var52];
            if (var55 != null) {
                class43.method221(var55, -1, var54, var53);
            }
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 33) {
            int var56 = class97.field1622.method876(false);
            class51 var57 = class97.field1622.method903((byte) 108);
            int var58 = class97.field1622.method876(false);
            class22.method112(-21847, var56);
            class46.method235(true, var58, var57);
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 110) {
            if (class70.field1128 == 0) {
                class258.field4501 = class42.field679;
            } else {
                class258.field4501 = class97.field1622.method903((byte) 108);
            }
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 98) {
            int var59 = class97.field1622.method908((byte) 125);
            class180.field2974 = class25.field376.method1576(var59, false);
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 134) {
            int var60 = class97.field1622.method880((byte) 107);
            int var61 = var60 >> 5 & 0x1F;
            int var62 = class97.field1622.method865((byte) 8);
            int var63 = (var60 & 0x7F35) >> 10;
            int var64 = var60 & 0x1F;
            int var65 = (var63 << 19) + ((var61 << 11) + (var64 << 3));
            class213 var66 = class198.method1392(11823, var62);
            if (var66.field3550 != var65) {
                var66.field3550 = var65;
                class25.method135(var66, -28014);
            }
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 184) {
            class132.method971(class25.field376, 31219, class97.field1622, class70.field1128);
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 188) {
            int var67 = class97.field1622.method908((byte) 124);
            class213 var68 = class198.method1392(11823, var67);
            for (int var69 = 0; var69 < var68.field3543.length; var69++) {
                var68.field3543[var69] = -1;
                var68.field3543[var69] = 0;
            }
            class25.method135(var68, -28014);
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 45) {
            long var70 = class97.field1622.method868(-114);
            int var72 = class97.field1622.method876(false);
            class51 var73 = class225.method1551((byte) 114, var72).method1759(class97.field1622, -1);
            class20.method97(19, var73, 3, (class51) null, var72, class63.method422(var70, -108).method304((byte) -92));
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 112) {
            int var74 = class97.field1622.method897(-29);
            int var75 = class97.field1622.method897(-86);
            int var76 = class97.field1622.method897(-120);
            int var77 = class97.field1622.method897(114);
            int var78 = class97.field1622.method876(false);
            class64.field1049[var74] = true;
            class211.field3504[var74] = var75;
            class140.field2356[var74] = var76;
            class76.field1217[var74] = var77;
            class169.field2744[var74] = var78;
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 4) {
            int var79 = class97.field1622.method901((byte) -4);
            int var80 = class97.field1622.method897(-86);
            int var81 = class97.field1622.method881(0);
            class257.field4496 = var80 >> 1;
            class44.field706.method1683(var81, 2, var79, (var80 & 0x1) == 1);
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 22) {
            class108.field1844 = class70.field1128 / 8;
            for (int var82 = 0; var82 < class108.field1844; var82++) {
                class203.field3396[var82] = class97.field1622.method868(-106);
                class259.field4520[var82] = class63.method422(class203.field3396[var82], -51);
            }
            class204.field3418 = class189.field3173;
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 142) {
            int var83 = class97.field1622.method865((byte) 8);
            class213 var84 = class198.method1392(11823, var83);
            var84.field3649 = 3;
            var84.field3619 = class44.field706.field1708.method1026(1);
            class25.method135(var84, -28014);
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 196) {
            int var85 = class97.field1622.method865((byte) 8);
            int var86 = class97.field1622.method865((byte) 8);
            class42 var87 = (class42) class79.field1265.method1453((long) var85, 1);
            class42 var88 = (class42) class79.field1265.method1453((long) var86, 1);
            if (var88 != null) {
                class258.method1753(var87 == null || var87.field668 != var88.field668, var88, false);
            }
            if (var87 != null) {
                var87.method764((byte) -31);
                class79.field1265.method1447(-105, (long) var86, var87);
            }
            class213 var89 = class198.method1392(11823, var85);
            if (var89 != null) {
                class25.method135(var89, -28014);
            }
            class213 var90 = class198.method1392(11823, var86);
            if (var90 != null) {
                class25.method135(var90, -28014);
                class97.method718(-26, true, var90);
            }
            if (class243.field4206 != -1) {
                class17.method88(class243.field4206, (byte) -121, 1);
            }
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 145) {
            int var91 = class97.field1622.method890((byte) -83);
            if (var91 == 65535) {
                var91 = -1;
            }
            int var92 = class97.field1622.method914(-57);
            if (var92 == 65535) {
                var92 = -1;
            }
            int var93 = class97.field1622.method867(90);
            int var94 = class97.field1622.method894(255);
            for (int var95 = var92; var95 <= var91; var95++) {
                long var96 = ((long) var93 << 32) + ((long) var95);
                class107 var98 = class242.field4190.method1453(var96, 1);
                if (var98 != null) {
                    var98.method764((byte) -121);
                }
                class242.field4190.method1447(-97, var96, new class255(var94));
            }
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 46) {
            int var99 = class97.field1622.method894(255);
            int var100 = class97.field1622.method884(14513);
            class213 var101 = class198.method1392(11823, var99);
            if (var101.field3633 != var100 || var100 == -1) {
                var101.field3618 = 0;
                var101.field3633 = var100;
                var101.field3697 = 0;
                class25.method135(var101, -28014);
            }
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 194) {
            class35.method174(70, false);
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 204) {
            int var102 = class97.field1622.method867(-111);
            int var103 = class97.field1622.method876(false);
            if (var103 == 65535) {
                var103 = -1;
            }
            int var104 = class97.field1622.method865((byte) 8);
            class213 var105 = class198.method1392(11823, var102);
            if (var105.field3574) {
                var105.field3571 = var103;
                var105.field3578 = var104;
                class222 var106 = method1508(var103, (byte) -70);
                var105.field3598 = var106.field3847;
                var105.field3583 = var106.field3874;
                var105.field3553 = var106.field3851;
                var105.field3668 = var106.field3906;
                var105.field3549 = var106.field3848;
                if (var105.field3582 > 0) {
                    var105.field3553 = var105.field3553 * 32 / var105.field3582;
                } else if (var105.field3540 > 0) {
                    var105.field3553 = var105.field3553 * 32 / var105.field3540;
                }
                var105.field3586 = var106.field3911;
                class25.method135(var105, -28014);
            } else if (var103 == -1) {
                var105.field3649 = 0;
                class35.field516 = -1;
                return true;
            } else {
                class222 var107 = method1508(var103, (byte) -28);
                var105.field3649 = 4;
                var105.field3586 = var107.field3911;
                var105.field3668 = var107.field3906;
                var105.field3619 = var103;
                var105.field3553 = var107.field3851 * 100 / var104;
                class25.method135(var105, -28014);
            }
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 80) {
            int var108 = class97.field1622.method880((byte) 107);
            int var109 = class97.field1622.method901((byte) -4);
            int var110 = class97.field1622.method880((byte) 107);
            class22.method112(-21847, var108);
            class90.method680(var110, false, var109);
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 29) {
            int var111 = class97.field1622.method897(112);
            if (class97.field1622.method897(105) == 0) {
                class247.field4303[var111] = new class87();
            } else {
                class97.field1622.field2026--;
                class247.field4303[var111] = new class87(class97.field1622);
            }
            class35.field516 = -1;
            class10.field111 = class189.field3173;
            return true;
        } else if (class35.field516 == 242) {
            class223.method1540(-43);
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 119) {
            class35.method174(86, true);
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 7) {
            boolean var112 = false;
            long var113 = class97.field1622.method868(75);
            if ((Long.MIN_VALUE & var113) != 0L) {
                var112 = true;
            }
            int var115 = class97.field1622.method876(false);
            byte var116 = class97.field1622.method912((byte) -90);
            if (var112) {
                if (class52.field884 == 0) {
                    class35.field516 = -1;
                    return true;
                }
                long var117 = var113 & Long.MAX_VALUE;
                boolean var119 = false;
                int var120;
                for (var120 = 0; var120 < class52.field884 && (class153.field2547[var120].field1760 != var117 || class153.field2547[var120].field4164 != var115); var120++) {
                }
                if (var120 < class52.field884) {
                    while (var120 < (class52.field884 - 1)) {
                        class153.field2547[var120] = class153.field2547[var120 + 1];
                        var120++;
                    }
                    class52.field884--;
                    class153.field2547[class52.field884] = null;
                }
            } else {
                class51 var121 = class97.field1622.method903((byte) 108);
                class239 var122 = new class239();
                var122.field1760 = var113;
                var122.field4162 = class63.method422(var122.field1760, -59);
                var122.field4158 = var116;
                var122.field4154 = var121;
                var122.field4164 = var115;
                int var123;
                for (var123 = class52.field884 - 1; var123 >= 0; var123--) {
                    int var124 = class153.field2547[var123].field4162.method282(var122.field4162, (byte) -113);
                    if (var124 == 0) {
                        class153.field2547[var123].field4164 = var115;
                        class153.field2547[var123].field4158 = var116;
                        class153.field2547[var123].field4154 = var121;
                        class35.field516 = -1;
                        class183.field3015 = class189.field3173;
                        if (class30.field443 == var113) {
                            class172.field2811 = var116;
                        }
                        return true;
                    }
                    if (var124 < 0) {
                        break;
                    }
                }
                if (class153.field2547.length <= class52.field884) {
                    class35.field516 = -1;
                    return true;
                }
                for (int var125 = class52.field884 - 1; var125 > var123; var125--) {
                    class153.field2547[var125 + 1] = class153.field2547[var125];
                }
                if (class52.field884 == 0) {
                    class153.field2547 = new class239[100];
                }
                class153.field2547[var123 + 1] = var122;
                class52.field884++;
                if (class30.field443 == var113) {
                    class172.field2811 = var116;
                }
            }
            class35.field516 = -1;
            class183.field3015 = class189.field3173;
            return true;
        } else if (class35.field516 == 154) {
            class49.method257((byte) -77);
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 211) {
            int var126 = class97.field1622.method876(false);
            if (var126 == 65535) {
                var126 = -1;
            }
            int var127 = class97.field1622.method897(109);
            int var128 = class97.field1622.method876(false);
            class47.method245(-30361, var128, var126, var127);
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 107) {
            int var129 = class97.field1622.method881(0);
            class51 var130 = class97.field1622.method903((byte) 108);
            int var131 = class97.field1622.method906(9147);
            if (var129 >= 1 && var129 <= 8) {
                if (var130.method292(true, class31.field451)) {
                    var130 = null;
                }
                class77.field1240[var129 - 1] = var130;
                class120.field1994[var129 - 1] = var131 == 0;
            }
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 51) {
            class67.field1095 = class97.field1622.method897(-61);
            class260.field4545 = class97.field1622.method881(0);
            for (int var132 = class67.field1095; var132 < (class67.field1095 + 8); var132++) {
                for (int var134 = class260.field4545; var134 < class260.field4545 + 8; var134++) {
                    if (class90.field1493[class257.field4496][var132][var134] != null) {
                        class90.field1493[class257.field4496][var132][var134] = null;
                        class51.method272(var132, var134, -28686);
                    }
                }
            }
            for (class36 var133 = (class36) class66.field1085.method1720(true); var133 != null; var133 = (class36) class66.field1085.method1712((byte) 112)) {
                if (class67.field1095 <= var133.field543 && var133.field543 < class67.field1095 + 8 && class260.field4545 <= var133.field552 && var133.field552 < class260.field4545 + 8 && class257.field4496 == var133.field548) {
                    var133.field557 = 0;
                }
            }
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 104) {
            int var135 = class97.field1622.method876(false);
            int var136 = class97.field1622.method906(9147);
            if (var136 == 2) {
                class261.method1772(110);
            }
            class243.field4206 = var135;
            class143.method1032(var135, (byte) 69);
            class215.method1477((byte) -22, false);
            class20.method103(class243.field4206, (byte) -96);
            for (int var137 = 0; var137 < 100; var137++) {
                class213.field3705[var137] = true;
            }
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 247) {
            class208.method1436(0);
            class84.field1405 = class97.field1622.method897(110);
            class95.field1571 = class189.field3173;
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 178) {
            int var138 = class97.field1622.method880((byte) 107);
            int var139 = class97.field1622.method894(255);
            class213 var140 = class198.method1392(11823, var139);
            if (var140 != null && var140.field3623 == 0) {
                if ((var140.field3546 - var140.field3608) < var138) {
                    var138 = var140.field3546 - var140.field3608;
                }
                if (var138 < 0) {
                    var138 = 0;
                }
                if (var140.field3593 != var138) {
                    var140.field3593 = var138;
                    class25.method135(var140, -28014);
                }
            }
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 85) {
            int var141 = class97.field1622.method897(118);
            int var142 = class97.field1622.method897(106);
            int var143 = class97.field1622.method876(false);
            int var144 = class97.field1622.method897(115);
            int var145 = class97.field1622.method897(-97);
            class60.method400(var143, var144, var145, (byte) -53, var142, var141);
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 161) {
            for (int var146 = 0; var146 < class66.field1055.length; var146++) {
                if (class66.field1055[var146] != null) {
                    class66.field1055[var146].field4344 = -1;
                }
            }
            for (int var147 = 0; var147 < class34.field512.length; var147++) {
                if (class34.field512[var147] != null) {
                    class34.field512[var147].field4344 = -1;
                }
            }
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 152) {
            int var148 = class97.field1622.method894(255);
            class51 var149 = class97.field1622.method903((byte) 108);
            class213 var150 = class198.method1392(11823, var148);
            if (!var149.method315(false, var150.field3627)) {
                var150.field3627 = var149;
                class25.method135(var150, -28014);
            }
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 72) {
            class183.field3015 = class189.field3173;
            long var151 = class97.field1622.method868(112);
            if (var151 == 0L) {
                class205.field3437 = null;
                class153.field2547 = null;
                class69.field1115 = null;
                class52.field884 = 0;
                class35.field516 = -1;
                return true;
            }
            long var153 = class97.field1622.method868(-126);
            class69.field1115 = class63.method422(var153, -71);
            class205.field3437 = class63.method422(var151, -119);
            class153.field2559 = class97.field1622.method912((byte) -90);
            int var155 = class97.field1622.method897(108);
            if (var155 == 255) {
                class35.field516 = -1;
                return true;
            }
            class52.field884 = var155;
            class239[] var156 = new class239[100];
            for (int var157 = 0; var157 < class52.field884; var157++) {
                var156[var157] = new class239();
                var156[var157].field1760 = class97.field1622.method868(-119);
                var156[var157].field4162 = class63.method422(var156[var157].field1760, -126);
                var156[var157].field4164 = class97.field1622.method876(false);
                var156[var157].field4158 = class97.field1622.method912((byte) -90);
                var156[var157].field4154 = class97.field1622.method903((byte) 108);
                if (class30.field443 == var156[var157].field1760) {
                    class172.field2811 = var156[var157].field4158;
                }
            }
            int var158 = class52.field884;
            boolean var159 = false;
            while (var158 > 0) {
                var158--;
                boolean var160 = true;
                for (int var161 = 0; var161 < var158; var161++) {
                    if (var156[var161].field4162.method282(var156[var161 + 1].field4162, (byte) -113) > 0) {
                        class239 var162 = var156[var161];
                        var160 = false;
                        var156[var161] = var156[var161 + 1];
                        var156[var161 + 1] = var162;
                    }
                }
                if (var160) {
                    break;
                }
            }
            class153.field2547 = var156;
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 153) {
            class208.method1436(0);
            int var163 = class97.field1622.method908((byte) -96);
            int var164 = class97.field1622.method901((byte) -4);
            int var165 = class97.field1622.method906(9147);
            class259.field4517[var165] = var163;
            class246.field4264[var165] = var164;
            class123.field2089[var165] = 1;
            for (int var166 = 0; var166 < 98; var166++) {
                if (var163 >= class264.field4609[var166]) {
                    class123.field2089[var165] = var166 + 2;
                }
            }
            class92.field1530[class191.method1366(31, field3820++)] = var165;
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 116) {
            class260.field4546 = class97.field1622.method890((byte) -83) * 30;
            class35.field516 = -1;
            class95.field1571 = class189.field3173;
            return true;
        } else if (class35.field516 == 135) {
            class260.field4545 = class97.field1622.method897(-57);
            class67.field1095 = class97.field1622.method906(9147);
            while (class97.field1622.field2026 < class70.field1128) {
                class35.field516 = class97.field1622.method897(106);
                class107.method763((byte) 65);
            }
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 205) {
            int var167 = class97.field1622.method865((byte) 8);
            int var168 = class97.field1622.method876(false);
            if (var167 < -70000) {
                var168 += 32768;
            }
            class213 var169;
            if (var167 < 0) {
                var169 = null;
            } else {
                var169 = class198.method1392(11823, var167);
            }
            while (class97.field1622.field2026 < class70.field1128) {
                int var170 = class97.field1622.method877((byte) -87);
                int var171 = 0;
                int var172 = class97.field1622.method876(false);
                if (var172 != 0) {
                    var171 = class97.field1622.method897(120);
                    if (var171 == 255) {
                        var171 = class97.field1622.method865((byte) 8);
                    }
                }
                if (var169 != null && var170 >= 0 && var169.field3543.length > var170) {
                    var169.field3543[var170] = var172;
                    var169.field3587[var170] = var171;
                }
                class211.method1445(30587, var170, var171, var168, var172 - 1);
            }
            if (var169 != null) {
                class25.method135(var169, -28014);
            }
            class208.method1436(0);
            class215.field3726[class191.method1366(class103.field1700++, 31)] = class191.method1366(var168, 32767);
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 203) {
            int var173 = class97.field1622.method876(false);
            int var174 = class97.field1622.method908((byte) -9);
            class252.method1710(var173, -71, var174);
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 42) {
            class51 var175 = class97.field1622.method903((byte) 108);
            if (var175.method277(0, class244.field4229)) {
                class51 var176 = var175.method269((byte) -74, 0, var175.method271(class34.field502, -1));
                long var177 = var176.method316(104);
                boolean var179 = false;
                for (int var180 = 0; var180 < class108.field1844; var180++) {
                    if (class203.field3396[var180] == var177) {
                        var179 = true;
                        break;
                    }
                }
                if (!var179 && class255.field4448 == 0) {
                    class147.method1064(class234.field4091, var176, (byte) 70, 4);
                }
            } else if (var175.method277(0, class106.field1747)) {
                class51 var210 = var175.method269((byte) -74, 0, var175.method271(class34.field502, -1));
                long var211 = var210.method316(14);
                boolean var213 = false;
                for (int var214 = 0; var214 < class108.field1844; var214++) {
                    if (class203.field3396[var214] == var211) {
                        var213 = true;
                        break;
                    }
                }
                if (!var213 && class255.field4448 == 0) {
                    class51 var215 = var175.method269((byte) -74, var175.method271(class34.field502, -1) + 1, var175.method293(false) - 9);
                    class147.method1064(var215, var210, (byte) 94, 8);
                }
            } else if (var175.method277(0, class121.field2007)) {
                boolean var181 = false;
                class51 var182 = var175.method269((byte) -74, 0, var175.method271(class34.field502, -1));
                long var183 = var182.method316(118);
                for (int var185 = 0; var185 < class108.field1844; var185++) {
                    if (class203.field3396[var185] == var183) {
                        var181 = true;
                        break;
                    }
                }
                if (!var181 && class255.field4448 == 0) {
                    class147.method1064(class43.field696, var182, (byte) 89, 10);
                }
            } else if (var175.method277(0, class41.field657)) {
                class51 var186 = var175.method269((byte) -74, 0, var175.method271(class41.field657, -1));
                class147.method1064(var186, class43.field696, (byte) 66, 11);
            } else if (var175.method277(0, class217.field3776)) {
                class51 var209 = var175.method269((byte) -74, 0, var175.method271(class217.field3776, -1));
                if (class255.field4448 == 0) {
                    class147.method1064(var209, class43.field696, (byte) 74, 12);
                }
            } else if (var175.method277(0, class115.field1949)) {
                class51 var208 = var175.method269((byte) -74, 0, var175.method271(class115.field1949, -1));
                if (class255.field4448 == 0) {
                    class147.method1064(var208, class43.field696, (byte) 90, 13);
                }
            } else if (var175.method277(0, class14.field218)) {
                class51 var203 = var175.method269((byte) -74, 0, var175.method271(class34.field502, -1));
                long var204 = var203.method316(115);
                boolean var206 = false;
                for (int var207 = 0; var207 < class108.field1844; var207++) {
                    if (class203.field3396[var207] == var204) {
                        var206 = true;
                        break;
                    }
                }
                if (!var206 && class255.field4448 == 0) {
                    class147.method1064(class43.field696, var203, (byte) 68, 14);
                }
            } else if (var175.method277(0, class262.field4583)) {
                class51 var187 = var175.method269((byte) -74, 0, var175.method271(class34.field502, -1));
                long var188 = var187.method316(74);
                boolean var190 = false;
                for (int var191 = 0; var191 < class108.field1844; var191++) {
                    if (class203.field3396[var191] == var188) {
                        var190 = true;
                        break;
                    }
                }
                if (!var190 && class255.field4448 == 0) {
                    class147.method1064(class43.field696, var187, (byte) 116, 15);
                }
            } else if (var175.method277(0, class221.field3840)) {
                class51 var192 = var175.method269((byte) -74, 0, var175.method271(class34.field502, -1));
                long var193 = var192.method316(30);
                boolean var195 = false;
                for (int var196 = 0; var196 < class108.field1844; var196++) {
                    if (class203.field3396[var196] == var193) {
                        var195 = true;
                        break;
                    }
                }
                if (!var195 && class255.field4448 == 0) {
                    class147.method1064(class43.field696, var192, (byte) 52, 16);
                }
            } else if (var175.method277(0, class213.field3601)) {
                class51 var197 = var175.method269((byte) -74, 0, var175.method271(class34.field502, -1));
                long var198 = var197.method316(114);
                boolean var200 = false;
                for (int var201 = 0; var201 < class108.field1844; var201++) {
                    if (class203.field3396[var201] == var198) {
                        var200 = true;
                        break;
                    }
                }
                if (!var200 && class255.field4448 == 0) {
                    class51 var202 = var175.method269((byte) -74, var175.method271(class34.field502, -1) + 1, var175.method293(false) + -9);
                    class147.method1064(var202, var197, (byte) 109, 21);
                }
            } else {
                class147.method1064(var175, class43.field696, (byte) 109, 0);
            }
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 241) {
            int var216 = class97.field1622.method890((byte) -83);
            class37.method189(var216, 1792);
            class215.field3726[class191.method1366(class103.field1700++, 31)] = class191.method1366(var216, 32767);
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 82) {
            long var217 = class97.field1622.method868(127);
            long var219 = (long) class97.field1622.method876(false);
            long var221 = (long) class97.field1622.method891((byte) -109);
            long var223 = (var219 << 32) + var221;
            int var225 = class97.field1622.method897(105);
            boolean var226 = false;
            int var227 = 0;
            label1284: while (true) {
                if (var227 >= 100) {
                    if (var225 <= 1) {
                        if (class241.field4180 == 1 || class115.field1953 == 1) {
                            var226 = true;
                        } else {
                            for (int var228 = 0; var228 < class108.field1844; var228++) {
                                if (class203.field3396[var228] == var217) {
                                    var226 = true;
                                    break label1284;
                                }
                            }
                        }
                    }
                    break;
                }
                if (class78.field1251[var227] == var223) {
                    var226 = true;
                    break;
                }
                var227++;
            }
            if (!var226 && class255.field4448 == 0) {
                class78.field1251[class176.field2879] = var223;
                class176.field2879 = (class176.field2879 + 1) % 100;
                class51 var229 = class187.method1322(class192.method1368(-6290, class97.field1622).method307(-3));
                if (var225 == 2 || var225 == 3) {
                    class147.method1064(var229, class20.method104(-118, new class51[] { class228.field3981, class63.method422(var217, -24).method304((byte) -92) }), (byte) 90, 7);
                } else if (var225 == 1) {
                    class147.method1064(var229, class20.method104(-12, new class51[] { class193.field3234, class63.method422(var217, -81).method304((byte) -92) }), (byte) 95, 7);
                } else {
                    class147.method1064(var229, class63.method422(var217, -69).method304((byte) -92), (byte) 68, 3);
                }
            }
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 95) {
            class80.field1334 = class97.field1622.method897(-89);
            class35.field516 = -1;
            class204.field3418 = class189.field3173;
            return true;
        } else if (class35.field516 == 113) {
            class153.method1107(class97.field1622, 2);
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 27) {
            int var230 = class97.field1622.method890((byte) -83);
            int var231 = class97.field1622.method914(-101);
            class51 var232 = class97.field1622.method903((byte) 108);
            class22.method112(-21847, var230);
            class46.method235(true, var231, var232);
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 56) {
            class125.field2115 = class97.field1622.method897(123);
            class210.field3502 = class97.field1622.method897(110);
            class33.field494 = class97.field1622.method897(109);
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 176) {
            int var233 = class97.field1622.method876(false);
            if (var233 == 65535) {
                var233 = -1;
            }
            class196.method1388((byte) 115, var233);
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 24) {
            int var234 = class97.field1622.method891((byte) -111);
            int var235 = class97.field1622.method880((byte) 107);
            if (var235 == 65535) {
                var235 = -1;
            }
            class222.method1530(var235, 98, var234);
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 214) {
            int var236 = class97.field1622.method897(108);
            int var237 = class97.field1622.method897(106);
            int var238 = class97.field1622.method876(false);
            int var239 = class97.field1622.method897(-101);
            int var240 = class97.field1622.method897(-64);
            class153.method1106(var236, var237, (byte) 48, var239, true, var240, var238);
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 250 || class35.field516 == 64 || class35.field516 == 9 || class35.field516 == 93 || class35.field516 == 55 || class35.field516 == 252 || class35.field516 == 213 || class35.field516 == 215 || class35.field516 == 52 || class35.field516 == 237 || class35.field516 == 73 || class35.field516 == 126) {
            class107.method763((byte) 65);
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 207) {
            int var241 = class97.field1622.method876(false);
            int var242 = class97.field1622.method867(-119);
            class213 var243 = class198.method1392(11823, var242);
            if (var241 == 65535) {
                var241 = -1;
            }
            if (var243.field3649 != 2 || var243.field3619 != var241) {
                var243.field3649 = 2;
                var243.field3619 = var241;
                class25.method135(var243, -28014);
            }
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 210) {
            int var244 = class97.field1622.method905(-122);
            int var245 = class97.field1622.method900(true);
            int var246 = class97.field1622.method908((byte) 127);
            class213 var247 = class198.method1392(11823, var246);
            var247.field3629 = var247.field3674 = var245;
            var247.field3605 = var247.field3690 = var244;
            var247.field3651 = 0;
            var247.field3681 = 0;
            class25.method135(var247, -28014);
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 123) {
            int var248 = class97.field1622.method865((byte) 8);
            class42 var249 = (class42) class79.field1265.method1453((long) var248, 1);
            if (var249 != null) {
                class258.method1753(true, var249, false);
            }
            if (class1.field3 != null) {
                class25.method135(class1.field3, -28014);
                class1.field3 = null;
            }
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 61) {
            boolean var250 = class97.field1622.method881(0) == 1;
            int var251 = class97.field1622.method908((byte) 124);
            class213 var252 = class198.method1392(11823, var251);
            if (var252.field3700 != var250) {
                var252.field3700 = var250;
                class25.method135(var252, -28014);
            }
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 18) {
            int var253 = class97.field1622.method914(19);
            int var254 = class97.field1622.method914(-62);
            int var255 = class97.field1622.method865((byte) 8);
            class213 var256 = class198.method1392(11823, var255);
            var256.field3602 = (var253 << 16) + var254;
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 87) {
            for (int var257 = 0; var257 < class30.field439.length; var257++) {
                if (class30.field439[var257] != class139.field2335[var257]) {
                    class30.field439[var257] = class139.field2335[var257];
                    class131.method965((byte) 22, var257);
                    class210.field3501[class191.method1366(class247.field4322++, 31)] = var257;
                }
            }
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 125) {
            class170.field2780 = class97.field1622.method897(123);
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 243) {
            long var258 = class97.field1622.method868(-116);
            class97.field1622.method912((byte) -90);
            long var260 = class97.field1622.method868(-118);
            long var262 = (long) class97.field1622.method876(false);
            long var264 = (long) class97.field1622.method891((byte) -107);
            int var266 = class97.field1622.method897(-95);
            long var267 = (var262 << 32) + var264;
            boolean var269 = false;
            int var270 = 0;
            label1318: while (true) {
                if (var270 >= 100) {
                    if (var266 <= 1) {
                        if (class241.field4180 == 1 || class115.field1953 == 1) {
                            var269 = true;
                        } else {
                            for (int var271 = 0; var271 < class108.field1844; var271++) {
                                if (class203.field3396[var271] == var258) {
                                    var269 = true;
                                    break label1318;
                                }
                            }
                        }
                    }
                    break;
                }
                if (class78.field1251[var270] == var267) {
                    var269 = true;
                    break;
                }
                var270++;
            }
            if (!var269 && class255.field4448 == 0) {
                class78.field1251[class176.field2879] = var267;
                class176.field2879 = (class176.field2879 + 1) % 100;
                class51 var272 = class187.method1322(class192.method1368(-6290, class97.field1622).method307(-3));
                if (var266 == 2 || var266 == 3) {
                    class236.method1637(class63.method422(var260, -75).method304((byte) -92), var272, 9, class20.method104(-86, new class51[] { class228.field3981, class63.method422(var258, -56).method304((byte) -92) }), -1);
                } else if (var266 == 1) {
                    class236.method1637(class63.method422(var260, -66).method304((byte) -92), var272, 9, class20.method104(-92, new class51[] { class193.field3234, class63.method422(var258, -105).method304((byte) -92) }), -1);
                } else {
                    class236.method1637(class63.method422(var260, -37).method304((byte) -92), var272, 9, class63.method422(var258, -79).method304((byte) -92), -1);
                }
            }
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 192) {
            long var273 = class97.field1622.method868(-117);
            int var275 = class97.field1622.method876(false);
            int var276 = class97.field1622.method897(-50);
            boolean var277 = true;
            class51 var278 = class43.field696;
            if (var275 > 0) {
                var278 = class97.field1622.method903((byte) 108);
            }
            if (var273 < 0L) {
                var273 &= Long.MAX_VALUE;
                var277 = false;
            }
            class51 var279 = class63.method422(var273, -77).method304((byte) -92);
            for (int var280 = 0; var280 < class184.field3051; var280++) {
                if (class122.field2079[var280] == var273) {
                    if (class96.field1588[var280] != var275) {
                        class96.field1588[var280] = var275;
                        if (var275 > 0) {
                            class147.method1064(class20.method104(-98, new class51[] { var279, class263.field4597 }), class43.field696, (byte) 47, 5);
                        }
                        if (var275 == 0) {
                            class147.method1064(class20.method104(35, new class51[] { var279, class83.field1400 }), class43.field696, (byte) 97, 5);
                        }
                    }
                    var279 = null;
                    class149.field2492[var280] = var278;
                    class30.field433[var280] = var276;
                    class201.field3352[var280] = var277;
                    break;
                }
            }
            if (var279 != null && class184.field3051 < 200) {
                class122.field2079[class184.field3051] = var273;
                class216.field3749[class184.field3051] = var279;
                class96.field1588[class184.field3051] = var275;
                class149.field2492[class184.field3051] = var278;
                class30.field433[class184.field3051] = var276;
                class201.field3352[class184.field3051] = var277;
                class184.field3051++;
            }
            class204.field3418 = class189.field3173;
            boolean var281 = false;
            int var282 = class184.field3051;
            while (var282 > 0) {
                var282--;
                boolean var283 = true;
                for (int var284 = 0; var284 < var282; var284++) {
                    if (class96.field1588[var284] != class259.field4521 && class96.field1588[var284 + 1] == class259.field4521 || class96.field1588[var284] == 0 && class96.field1588[var284 + 1] != 0) {
                        int var285 = class96.field1588[var284];
                        var283 = false;
                        class96.field1588[var284] = class96.field1588[var284 + 1];
                        class96.field1588[var284 + 1] = var285;
                        class51 var286 = class149.field2492[var284];
                        class149.field2492[var284] = class149.field2492[var284 + 1];
                        class149.field2492[var284 + 1] = var286;
                        class51 var287 = class216.field3749[var284];
                        class216.field3749[var284] = class216.field3749[var284 + 1];
                        class216.field3749[var284 + 1] = var287;
                        long var288 = class122.field2079[var284];
                        class122.field2079[var284] = class122.field2079[var284 + 1];
                        class122.field2079[var284 + 1] = var288;
                        int var290 = class30.field433[var284];
                        class30.field433[var284] = class30.field433[var284 + 1];
                        class30.field433[var284 + 1] = var290;
                        boolean var291 = class201.field3352[var284];
                        class201.field3352[var284] = class201.field3352[var284 + 1];
                        class201.field3352[var284 + 1] = var291;
                    }
                }
                if (var283) {
                    break;
                }
            }
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 88) {
            int var292 = class97.field1622.method890((byte) -83);
            int var293 = class97.field1622.method867(-4);
            int var294 = class97.field1622.method906(9147);
            class42 var295 = (class42) class79.field1265.method1453((long) var293, 1);
            if (var295 != null) {
                class258.method1753(var295.field668 != var292, var295, false);
            }
            class29.method146(85, var292, var294, var293);
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 157) {
            class51 var296 = class97.field1622.method903((byte) 108);
            Object[] var297 = new Object[var296.method293(false) + 1];
            for (int var298 = var296.method293(false) - 1; var298 >= 0; var298--) {
                if (var296.method268(var298, -106) == 115) {
                    var297[var298 + 1] = class97.field1622.method903((byte) 108);
                } else {
                    var297[var298 + 1] = Integer.valueOf(class97.field1622.method865((byte) 8));
                }
            }
            var297[0] = Integer.valueOf(class97.field1622.method865((byte) 8));
            class205 var299 = new class205();
            var299.field3423 = var297;
            class176.method1233(var299, (byte) 117);
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 92) {
            int var300 = class97.field1622.method867(-102);
            int var301 = class97.field1622.method880((byte) 107);
            class4.method14(var300, var301, (byte) 127);
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 235) {
            int var302 = class97.field1622.method894(255);
            int var303 = class97.field1622.method890((byte) -83);
            if (var303 == 65535) {
                var303 = -1;
            }
            class213 var304 = class198.method1392(11823, var302);
            if (var304.field3649 != 1 || var304.field3619 != var303) {
                var304.field3619 = var303;
                var304.field3649 = 1;
                class25.method135(var304, -28014);
            }
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 106) {
            int var305 = class97.field1622.method880((byte) 107);
            if (var305 == 65535) {
                var305 = -1;
            }
            int var306 = class97.field1622.method865((byte) 8);
            int var307 = (var306 & 0xFFFC629) >> 14;
            int var308 = var306 & 0x3FFF;
            int var309 = var306 >> 28 & 0x3;
            int var310 = class97.field1622.method906(9147);
            int var311 = var308 - class241.field4179;
            int var312 = var310 >> 2;
            int var313 = var307 - class11.field160;
            int var314 = class247.field4315[var312];
            int var315 = var310 & 0x3;
            class87.method666(var312, var315, (byte) 122, var311, var314, var305, var309, var313);
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 78) {
            long var316 = class97.field1622.method868(-115);
            long var318 = (long) class97.field1622.method876(false);
            long var320 = (long) class97.field1622.method891((byte) -113);
            long var322 = (var318 << 32) + var320;
            int var324 = class97.field1622.method897(126);
            boolean var325 = false;
            int var326 = class97.field1622.method876(false);
            int var327 = 0;
            label1371: while (true) {
                if (var327 >= 100) {
                    if (var324 <= 1) {
                        for (int var328 = 0; var328 < class108.field1844; var328++) {
                            if (class203.field3396[var328] == var316) {
                                var325 = true;
                                break label1371;
                            }
                        }
                    }
                    break;
                }
                if (class78.field1251[var327] == var322) {
                    var325 = true;
                    break;
                }
                var327++;
            }
            if (!var325 && class255.field4448 == 0) {
                class78.field1251[class176.field2879] = var322;
                class176.field2879 = (class176.field2879 + 1) % 100;
                class51 var329 = class225.method1551((byte) -94, var326).method1759(class97.field1622, -1);
                if (var324 == 2) {
                    class20.method97(18, var329, 3, (class51) null, var326, class20.method104(68, new class51[] { class228.field3981, class63.method422(var316, -66).method304((byte) -92) }));
                } else if (var324 == 1) {
                    class20.method97(18, var329, 3, (class51) null, var326, class20.method104(56, new class51[] { class193.field3234, class63.method422(var316, -114).method304((byte) -92) }));
                } else {
                    class20.method97(18, var329, 3, (class51) null, var326, class63.method422(var316, -109).method304((byte) -92));
                }
            }
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 127) {
            if (class243.field4206 != -1) {
                class17.method88(class243.field4206, (byte) 122, 0);
            }
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 128) {
            class96.field1581 = 0;
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 68) {
            long var330 = class97.field1622.method868(82);
            class97.field1622.method912((byte) -90);
            long var332 = class97.field1622.method868(38);
            long var334 = (long) class97.field1622.method876(false);
            long var336 = (long) class97.field1622.method891((byte) -108);
            long var338 = (var334 << 32) + var336;
            boolean var340 = false;
            int var341 = class97.field1622.method897(127);
            int var342 = class97.field1622.method876(false);
            int var343 = 0;
            label1396: while (true) {
                if (var343 >= 100) {
                    if (var341 <= 1) {
                        for (int var344 = 0; var344 < class108.field1844; var344++) {
                            if (class203.field3396[var344] == var330) {
                                var340 = true;
                                break label1396;
                            }
                        }
                    }
                    break;
                }
                if (class78.field1251[var343] == var338) {
                    var340 = true;
                    break;
                }
                var343++;
            }
            if (!var340 && class255.field4448 == 0) {
                class78.field1251[class176.field2879] = var338;
                class176.field2879 = (class176.field2879 + 1) % 100;
                class51 var345 = class225.method1551((byte) -29, var342).method1759(class97.field1622, -1);
                if (var341 == 2 || var341 == 3) {
                    class20.method97(20, var345, 3, class63.method422(var332, -126).method304((byte) -92), var342, class20.method104(15, new class51[] { class228.field3981, class63.method422(var330, -53).method304((byte) -92) }));
                } else if (var341 == 1) {
                    class20.method97(20, var345, 3, class63.method422(var332, -62).method304((byte) -92), var342, class20.method104(-112, new class51[] { class193.field3234, class63.method422(var330, -113).method304((byte) -92) }));
                } else {
                    class20.method97(20, var345, 3, class63.method422(var332, -80).method304((byte) -92), var342, class63.method422(var330, -95).method304((byte) -92));
                }
            }
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 189) {
            class42.method216(104);
            class35.field516 = -1;
            return false;
        } else if (class35.field516 == 137) {
            int var346 = class97.field1622.method880((byte) 107);
            int var347 = class97.field1622.method908((byte) -42);
            int var348 = class97.field1622.method914(23);
            class22.method112(-21847, var348);
            class90.method680(var346, false, var347);
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 225) {
            class131.method963(class97.field1622.method903((byte) 108), 0);
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 140) {
            int var349 = class97.field1622.method876(false);
            int var350 = class97.field1622.method890((byte) -83);
            class192.field3211 = var350;
            class120.field1993 = var349;
            class64.method429((byte) 65);
            class35.field516 = -1;
            return true;
        } else if (class35.field516 == 91) {
            int var351 = class97.field1622.method865((byte) 8);
            int var352 = class97.field1622.method876(false);
            class213 var353;
            if (var351 >= 0) {
                var353 = class198.method1392(11823, var351);
            } else {
                var353 = null;
            }
            if (var353 != null) {
                for (int var354 = 0; var354 < var353.field3543.length; var354++) {
                    var353.field3543[var354] = 0;
                    var353.field3587[var354] = 0;
                }
            }
            if (var351 < -70000) {
                var352 += 32768;
            }
            class122.method922(var352, true);
            int var355 = class97.field1622.method876(false);
            for (int var356 = 0; var356 < var355; var356++) {
                int var357 = class97.field1622.method890((byte) -83);
                int var358 = class97.field1622.method897(-64);
                if (var358 == 255) {
                    var358 = class97.field1622.method894(255);
                }
                if (var353 != null && var356 < var353.field3543.length) {
                    var353.field3543[var356] = var357;
                    var353.field3587[var356] = var358;
                }
                class211.method1445(30587, var356, var358, var352, var357 - 1);
            }
            if (var353 != null) {
                class25.method135(var353, -28014);
            }
            class208.method1436(0);
            class215.field3726[class191.method1366(class103.field1700++, 31)] = class191.method1366(var352, 32767);
            class35.field516 = -1;
            return true;
        } else {
            class89.method674((Throwable) null, "T1 - " + class35.field516 + "," + class44.field705 + "," + class189.field3163 + " - " + class70.field1128, 95);
            class42.method216(104);
            return true;
        }
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(I)V")
    public static void method1511(int arg0) {
        field3812 = null;
        if (arg0 != 0) {
            method1508(69, (byte) -86);
        }
        field3813 = null;
        field3819 = null;
        field3817 = null;
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "([I)V")
    public class219(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field3816 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field3816[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field3816[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 - -1) {
            }
            this.field3816[var5 + var5] = arg0[var4];
            this.field3816[var5 + var5 + 1] = var4++;
        }
    }
}
