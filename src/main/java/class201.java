import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class201 extends class23 {

    @OriginalMember(owner = "client!mj", name = "M", descriptor = "I")
    private int field3666;

    @OriginalMember(owner = "client!mj", name = "O", descriptor = "Lbg;")
    public static class177 field3668 = new class177(64);

    @OriginalMember(owner = "client!mj", name = "Q", descriptor = "Llc;")
    public static class143 field3670 = class66.method374("K", -1);

    @OriginalMember(owner = "client!mj", name = "S", descriptor = "Z")
    public static volatile boolean field3672 = false;

    @OriginalMember(owner = "client!mj", name = "U", descriptor = "Llc;")
    public static class143 field3674 = class66.method374("k", -1);

    @OriginalMember(owner = "client!mj", name = "I", descriptor = "I")
    public static int field3662;

    @OriginalMember(owner = "client!mj", name = "J", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!mj", name = "K", descriptor = "I")
    public static int field3664;

    @OriginalMember(owner = "client!mj", name = "L", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!mj", name = "N", descriptor = "I")
    public static int field3667;

    @OriginalMember(owner = "client!mj", name = "P", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!mj", name = "T", descriptor = "Lgf;")
    public static class7 field3673;

    @OriginalMember(owner = "client!mj", name = "R", descriptor = "Z")
    public static boolean field3671;

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "(I)Z")
    public static final boolean method1378(int arg0) {
        ++field3664;
        if (arg0 != -432) {
            field3672 = false;
        }
        if (class247.field4440) {
            try {
                if ((Boolean) class143.field2545.method905(class4.field62.field1469, 0)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lh;IZ)V")
    public final void method83(class190 arg0, int arg1, boolean arg2) {
        if (arg1 == 0) {
            this.field3666 = (arg0.method1265(113) << 12) / 255;
        }
        if (!arg2) {
            field3670 = null;
        }
        ++field3669;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Z)V")
    public static final void method1379(boolean arg0) {
        ++field3662;
        if (~class88.field1605 < -2) {
            --class88.field1605;
            class26.field435 = class13.field249;
        }
        if (~class67.field1276 < -1) {
            --class67.field1276;
        }
        if (class170.field3030) {
            class170.field3030 = false;
            class287.method1877(0);
        } else {
            for (int var1 = 0; ~var1 > -101 && class8.method67((byte) -6); ++var1) {
            }
            if (~class147.field2652 == -31) {
                class149.method966(132, class285.field5010, (byte) -122);
                Object var2 = class282.field4960.field275;
                synchronized (class282.field4960.field275) {
                    if (!class192.field3538) {
                        class282.field4960.field277 = 0;
                    } else if (~class92.field1653 != -1 || ~class282.field4960.field277 <= -41) {
                        int var3 = 0;
                        class285.field5010.method799(103, 227);
                        class285.field5010.method1276(844519173, 0);
                        int var4 = class285.field5010.field3487;
                        for (int var5 = 0; ~class282.field4960.field277 < ~var5 && ~(class285.field5010.field3487 - var4) > -241; ++var5) {
                            ++var3;
                            int var6 = class282.field4960.field276[var5];
                            if (~var6 <= -1) {
                                if (~var6 < -65535) {
                                    var6 = 65534;
                                }
                            } else {
                                var6 = 0;
                            }
                            int var7 = class282.field4960.field278[var5];
                            boolean var8 = false;
                            if (~var7 > -1) {
                                var7 = 0;
                            } else if (var7 > 65534) {
                                var7 = 65534;
                            }
                            if (class282.field4960.field276[var5] == -1 && class282.field4960.field278[var5] == -1) {
                                var8 = true;
                                var7 = -1;
                                var6 = -1;
                            }
                            if (class223.field4062 == var7 && ~class122.field2151 == ~var6) {
                                if (~class9.field166 > -2048) {
                                    ++class9.field166;
                                }
                            } else {
                                int var9 = -class223.field4062 + var7;
                                int var10 = -class122.field2151 + var6;
                                class223.field4062 = var7;
                                class122.field2151 = var6;
                                if (~class9.field166 > -9 && ~var9 <= 31 && ~var9 >= -32 && var10 >= -32 && ~var10 >= -32) {
                                    var10 += 32;
                                    var9 += 32;
                                    class285.field5010.method1278((class9.field166 << 12) + (var9 << 6) + var10, (byte) 112);
                                    class9.field166 = 0;
                                } else if (class9.field166 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && ~var10 >= -128) {
                                    var9 += 128;
                                    var10 += 128;
                                    class285.field5010.method1276(844519173, class9.field166 + 128);
                                    class285.field5010.method1278((var9 << 8) + var10, (byte) 79);
                                    class9.field166 = 0;
                                } else if (~class9.field166 > -33) {
                                    class285.field5010.method1276(844519173, 192 - -class9.field166);
                                    if (!var8) {
                                        class285.field5010.method1280(-124, var6 << 16 | var7);
                                    } else {
                                        class285.field5010.method1280(-112, Integer.MIN_VALUE);
                                    }
                                    class9.field166 = 0;
                                } else {
                                    class285.field5010.method1278(57344 - -class9.field166, (byte) 39);
                                    if (var8) {
                                        class285.field5010.method1280(-122, Integer.MIN_VALUE);
                                    } else {
                                        class285.field5010.method1280(-117, var7 | var6 << 16);
                                    }
                                    class9.field166 = 0;
                                }
                            }
                        }
                        class285.field5010.method1263(0, -var4 + class285.field5010.field3487);
                        if (~class282.field4960.field277 < ~var3) {
                            class282.field4960.field277 -= var3;
                            for (int var11 = 0; var11 < class282.field4960.field277; ++var11) {
                                class282.field4960.field278[var11] = class282.field4960.field278[var3 + var11];
                                class282.field4960.field276[var11] = class282.field4960.field276[var11 - -var3];
                            }
                        } else {
                            class282.field4960.field277 = 0;
                        }
                        ++field3663;
                    }
                }
                if (~class92.field1653 != -1) {
                    long var12 = (-class154.field2778 + class189.field3425) / 50L;
                    int var14 = class31.field499;
                    if (~var14 <= -1) {
                        if (var14 > 65535) {
                            var14 = 65535;
                        }
                    } else {
                        var14 = 0;
                    }
                    ++class176.field3165;
                    int var15 = class67.field1279;
                    if (var12 > 32767L) {
                        var12 = 32767L;
                    }
                    if (~var15 <= -1) {
                        if (~var15 < -65536) {
                            var15 = 65535;
                        }
                    } else {
                        var15 = 0;
                    }
                    byte var16 = 0;
                    if (~class92.field1653 == -3) {
                        var16 = 1;
                    }
                    class154.field2778 = class189.field3425;
                    int var17 = (int) var12;
                    class285.field5010.method799(103, 4);
                    class285.field5010.method1262(-23499, var15 << 16 | var14);
                    class285.field5010.method1244(var17 | var16 << 15, true);
                }
                if (class189.field3420 > 0) {
                    --class189.field3420;
                }
                if (class51.field1019) {
                    for (int var18 = 0; ~class88.field1596 < ~var18; ++var18) {
                        int var19 = class190.field3484[var18];
                        if (~var19 == -99 || ~var19 == -100 || var19 == 96 || ~var19 == -98) {
                            class268.field4804 = true;
                            break;
                        }
                    }
                } else if (class128.field2264[96] || class128.field2264[97] || class128.field2264[98] || class128.field2264[99]) {
                    class268.field4804 = true;
                }
                if (class268.field4804 && class189.field3420 <= 0) {
                    class268.field4804 = false;
                    class189.field3420 = 20;
                    ++class172.field3071;
                    class285.field5010.method799(103, 238);
                    class285.field5010.method1278(class184.field3339, (byte) 79);
                    class285.field5010.method1244(class75.field1402, !arg0);
                }
                if (field3671 && !class268.field4806) {
                    ++class264.field4755;
                    class268.field4806 = true;
                    class285.field5010.method799(103, 34);
                    class285.field5010.method1276(844519173, 1);
                }
                if (!field3671 && class268.field4806) {
                    ++class264.field4755;
                    class268.field4806 = false;
                    class285.field5010.method799(103, 34);
                    class285.field5010.method1276(844519173, 0);
                }
                if (!class49.field949) {
                    class285.field5010.method799(103, 76);
                    ++class139.field2414;
                    class285.field5010.method1280(-118, class65.method368((byte) -24));
                    class49.field949 = true;
                }
                class72.method418(true);
                if (class147.field2652 == 30) {
                    class207.method1447(99);
                    class204.method1398(-24);
                    ++class126.field2239;
                    if (class126.field2239 > 750) {
                        class287.method1877(0);
                    } else {
                        class97.method572(true);
                        class224.method1541(-1);
                        class115.method699((byte) -99);
                        if (class12.field236 != null) {
                            class262.method1744((byte) -128);
                        }
                        for (int var20 = class54.method328(0, true); var20 != -1; var20 = class54.method328(0, false)) {
                            class24.method172(0, var20);
                            class132.field2317[class129.method777(class33.field560++, 31)] = var20;
                        }
                        for (class166 var21 = class290.method1940(118); var21 != null; var21 = class290.method1940(121)) {
                            int var22 = var21.method1096((byte) -126);
                            int var23 = var21.method1095(-12578);
                            if (var22 == 1) {
                                class48.field933[var23] = var21.field2978;
                                class182.field3259[class129.method777(class144.field2568++, 31)] = var23;
                            } else if (~var22 != -3) {
                                if (var22 == 3) {
                                    class43 var24 = class27.method186(1341, var23);
                                    if (!var21.field2967.method876((byte) -122, var24.field723)) {
                                        var24.field723 = var21.field2967;
                                        class141.method844((byte) -128, var24);
                                    }
                                } else if (~var22 == -5) {
                                    class43 var25 = class27.method186(1341, var23);
                                    int var26 = var21.field2978;
                                    int var27 = var21.field2979;
                                    if (var25.field785 != var26 || ~var25.field755 != ~var27) {
                                        var25.field755 = var27;
                                        var25.field785 = var26;
                                        class141.method844((byte) -125, var25);
                                    }
                                } else if (var22 == 5) {
                                    class43 var28 = class27.method186(1341, var23);
                                    if (var21.field2978 != var28.field853 || ~var21.field2978 == 0) {
                                        var28.field780 = 0;
                                        var28.field853 = var21.field2978;
                                        var28.field884 = 0;
                                        class141.method844((byte) -17, var28);
                                    }
                                } else if (~var22 != -7) {
                                    if (var22 != 7) {
                                        if (~var22 == -9) {
                                            class43 var29 = class27.method186(1341, var23);
                                            if (~var21.field2978 != ~var29.field854 || var21.field2979 != var29.field830 || var21.field2976 != var29.field869) {
                                                var29.field830 = var21.field2979;
                                                var29.field869 = var21.field2976;
                                                if (~var29.field851 != 0) {
                                                    if (var29.field829 > 0) {
                                                        var29.field869 = var29.field869 * 32 / var29.field829;
                                                    } else if (~var29.field739 < -1) {
                                                        var29.field869 = var29.field869 * 32 / var29.field739;
                                                    }
                                                }
                                                var29.field854 = var21.field2978;
                                                class141.method844((byte) -124, var29);
                                            }
                                        } else if (var22 != 9) {
                                            if (~var22 == -11) {
                                                class43 var30 = class27.method186(1341, var23);
                                                if (~var21.field2978 != ~var30.field808 || var21.field2979 != var30.field860 || ~var21.field2976 != ~var30.field757) {
                                                    var30.field860 = var21.field2979;
                                                    var30.field808 = var21.field2978;
                                                    var30.field757 = var21.field2976;
                                                    class141.method844((byte) -54, var30);
                                                }
                                            } else if (~var22 != -12) {
                                                if (var22 == 12) {
                                                    class43 var31 = class27.method186(1341, var23);
                                                    int var32 = var21.field2978;
                                                    if (var31 != null && ~var31.field769 == -1) {
                                                        if (~(-var31.field831 + var31.field732) > ~var32) {
                                                            var32 = -var31.field831 + var31.field732;
                                                        }
                                                        if (var32 < 0) {
                                                            var32 = 0;
                                                        }
                                                        if (~var31.field882 != ~var32) {
                                                            var31.field882 = var32;
                                                            class141.method844((byte) -123, var31);
                                                        }
                                                    }
                                                } else if (var22 == 13) {
                                                    class43 var33 = class27.method186(1341, var23);
                                                    var33.field841 = var21.field2978;
                                                }
                                            } else {
                                                class43 var34 = class27.method186(1341, var23);
                                                var34.field748 = var34.field833 = var21.field2979;
                                                var34.field873 = var34.field832 = var21.field2978;
                                                var34.field821 = 0;
                                                var34.field820 = 0;
                                                class141.method844((byte) -45, var34);
                                            }
                                        } else {
                                            class43 var35 = class27.method186(1341, var23);
                                            if (var21.field2978 != var35.field851 || var21.field2979 != var35.field801) {
                                                var35.field851 = var21.field2978;
                                                var35.field801 = var21.field2979;
                                                class141.method844((byte) -121, var35);
                                            }
                                        }
                                    } else {
                                        class43 var36 = class27.method186(1341, var23);
                                        boolean var37 = var21.field2978 == 1;
                                        if (var36.field865 == !var37) {
                                            var36.field865 = var37;
                                            class141.method844((byte) 102, var36);
                                        }
                                    }
                                } else {
                                    int var38 = var21.field2978;
                                    int var39 = var38 >> 10 & 31;
                                    int var40 = var38 & 31;
                                    int var41 = (var38 & 1007) >> 5;
                                    int var42 = (var40 << 3) + (var39 << 19) + (var41 << 11);
                                    class43 var43 = class27.method186(1341, var23);
                                    if (var43.field773 != var42) {
                                        var43.field773 = var42;
                                        class141.method844((byte) -128, var43);
                                    }
                                }
                            } else {
                                class221.field4005[var23] = var21.field2967;
                                class203.field3690[class129.method777(class144.field2594++, 31)] = var23;
                            }
                        }
                        ++class128.field2252;
                        if (class17.field301 != 0) {
                            class167.field2982 += 20;
                            if (class167.field2982 >= 400) {
                                class17.field301 = 0;
                            }
                        }
                        if (class283.field4994 != null) {
                            ++class158.field2857;
                            if (class158.field2857 >= 15) {
                                class141.method844((byte) -119, class283.field4994);
                                class283.field4994 = null;
                            }
                        }
                        if (class165.field2966 != null) {
                            class141.method844((byte) 110, class165.field2966);
                            if (class56.field1085 - -5 < class235.field4292 || ~(class56.field1085 + -5) < ~class235.field4292 || ~(class40.field685 - -5) > ~class158.field2859 || ~class158.field2859 > ~(class40.field685 + -5)) {
                                class258.field4634 = true;
                            }
                            ++class71.field1342;
                            if (~class147.field2660 == -1) {
                                if (class258.field4634 && ~class71.field1342 <= -6) {
                                    if (class190.field3471 == class165.field2966 && class256.field4607 != class15.field269) {
                                        ++class120.field2125;
                                        byte var44 = 0;
                                        class43 var45 = class165.field2966;
                                        if (~class54.field1053 == -2 && var45.field862 == 206) {
                                            var44 = 1;
                                        }
                                        if (~var45.field737[class256.field4607] >= -1) {
                                            var44 = 0;
                                        }
                                        if (class194.method1340((byte) 57, client.method1514(var45))) {
                                            int var46 = class256.field4607;
                                            int var47 = class15.field269;
                                            var45.field737[var46] = var45.field737[var47];
                                            var45.field889[var46] = var45.field889[var47];
                                            var45.field737[var47] = -1;
                                            var45.field889[var47] = 0;
                                        } else if (var44 == 1) {
                                            int var48 = class15.field269;
                                            int var49 = class256.field4607;
                                            while (~var48 != ~var49) {
                                                if (var48 <= var49) {
                                                    if (~var49 < ~var48) {
                                                        var45.method274(var48, 29240, var48 + 1);
                                                        ++var48;
                                                    }
                                                } else {
                                                    var45.method274(var48, 29240, var48 + -1);
                                                    --var48;
                                                }
                                            }
                                        } else {
                                            var45.method274(class15.field269, 29240, class256.field4607);
                                        }
                                        class285.field5010.method799(103, 37);
                                        class285.field5010.method1276(844519173, var44);
                                        class285.field5010.method1280(-116, class165.field2966.field722);
                                        class285.field5010.method1272(3225, class15.field269);
                                        class285.field5010.method1278(class256.field4607, (byte) 107);
                                    }
                                } else if ((class141.field2457 == 1 || class64.method366(!arg0, class257.field4625 - 1)) && ~class257.field4625 < -3) {
                                    class113.method676(-128);
                                } else if (~class257.field4625 < -1) {
                                    class287.method1881((byte) 73);
                                }
                                class158.field2857 = 10;
                                class165.field2966 = null;
                                class92.field1653 = 0;
                            }
                        }
                        class43 var50 = class126.field2230;
                        class176.field3144 = arg0;
                        class88.field1596 = 0;
                        class43 var51 = class169.field3017;
                        class169.field3017 = null;
                        class126.field2230 = null;
                        class25.field427 = false;
                        class117.field2087 = null;
                        while (class261.method1742((byte) 83) && ~class88.field1596 > -129) {
                            class190.field3484[class88.field1596] = class263.field4689;
                            class134.field2355[class88.field1596] = class229.field4191;
                            ++class88.field1596;
                        }
                        class12.field236 = null;
                        if (class7.field138 != -1) {
                            class82.method468(class269.field4820, class7.field138, (byte) -112, 0, 0, class10.field222, 0, 0);
                        }
                        ++class13.field249;
                        while (true) {
                            class91 var52;
                            class43 var53;
                            class43 var54;
                            do {
                                var52 = (class91) client.field4020.method1291(0);
                                if (var52 == null) {
                                    while (true) {
                                        class91 var55;
                                        class43 var56;
                                        class43 var57;
                                        do {
                                            var55 = (class91) class231.field4221.method1291(0);
                                            if (var55 == null) {
                                                while (true) {
                                                    class91 var58;
                                                    class43 var59;
                                                    class43 var60;
                                                    do {
                                                        var58 = (class91) class230.field4203.method1291(0);
                                                        if (var58 == null) {
                                                            if (class282.field4955 && class12.field236 == null) {
                                                                class282.field4955 = false;
                                                            }
                                                            if (class50.field996 != null) {
                                                                class47.method288(-1);
                                                            }
                                                            if (~class162.field2914 < -1 && class128.field2264[82] && class128.field2264[81] && ~class228.field4111 != -1) {
                                                                int var61 = class170.field3044 - class228.field4111;
                                                                if (var61 >= 0) {
                                                                    if (~var61 < -4) {
                                                                        var61 = 3;
                                                                    }
                                                                } else {
                                                                    var61 = 0;
                                                                }
                                                                class146.method935(class229.field4195.field4148[0] + class148.field2733, var61, class229.field4195.field4115[0] + class141.field2466, arg0);
                                                            }
                                                            if (class176.field3146 != -1) {
                                                                int var62 = class176.field3146;
                                                                int var63 = class7.field143;
                                                                if (~class162.field2914 < -1 && class128.field2264[82] && class128.field2264[81]) {
                                                                    class146.method935(class148.field2733 + var62, class170.field3044, class141.field2466 + var63, false);
                                                                } else if (!class219.field3996) {
                                                                    if (!class63.field1203) {
                                                                        boolean var64 = class203.method1389((byte) -60, true, 0, 0, 0, var62, class229.field4195.field4115[0], class229.field4195.field4148[0], 0, var63, 0, 0);
                                                                        if (var64) {
                                                                            class167.field2982 = 0;
                                                                            class51.field1009 = class67.field1279;
                                                                            class17.field301 = 1;
                                                                            class17.field290 = class31.field499;
                                                                        }
                                                                    } else {
                                                                        class285.field5010.method799(103, 36);
                                                                        ++class192.field3524;
                                                                        class285.field5010.method1245(class148.field2733 + var62, 62);
                                                                        class285.field5010.method1272(3225, class141.field2466 + var63);
                                                                        class167.field2982 = 0;
                                                                        class51.field1009 = class67.field1279;
                                                                        class17.field301 = 1;
                                                                        class17.field290 = class31.field499;
                                                                    }
                                                                } else {
                                                                    class285.field5010.method799(103, 229);
                                                                    class285.field5010.method1245(class254.field4564, 57);
                                                                    ++class240.field4343;
                                                                    class285.field5010.method1245(class148.field2733 + var62, 83);
                                                                    class285.field5010.method1272(3225, class141.field2466 + var63);
                                                                    class285.field5010.method1280(-120, class58.field1113);
                                                                    class17.field290 = class31.field499;
                                                                    class51.field1009 = class67.field1279;
                                                                    class17.field301 = 1;
                                                                    class167.field2982 = 0;
                                                                }
                                                                class176.field3146 = -1;
                                                                class63.field1203 = false;
                                                                class219.field3996 = false;
                                                            }
                                                            class192.method1302(1);
                                                            if (class126.field2230 != var50) {
                                                                if (var50 != null) {
                                                                    class141.method844((byte) -21, var50);
                                                                }
                                                                if (class126.field2230 != null) {
                                                                    class141.method844((byte) 123, class126.field2230);
                                                                }
                                                            }
                                                            if (class169.field3017 != var51 && class117.field2091 == class113.field1982) {
                                                                if (var51 != null) {
                                                                    class141.method844((byte) -124, var51);
                                                                }
                                                                if (class169.field3017 != null) {
                                                                    class141.method844((byte) -124, class169.field3017);
                                                                }
                                                            }
                                                            if (class169.field3017 != null) {
                                                                if (~class113.field1982 > ~class117.field2091) {
                                                                    ++class113.field1982;
                                                                    if (class117.field2091 == class113.field1982) {
                                                                        class141.method844((byte) 44, class169.field3017);
                                                                    }
                                                                }
                                                            } else if (class113.field1982 > 0) {
                                                                --class113.field1982;
                                                            }
                                                            if (~class21.field349 != -2) {
                                                                if (class21.field349 != 2) {
                                                                    class4.method13((byte) -123);
                                                                } else {
                                                                    class16.method120(-26650);
                                                                }
                                                            } else {
                                                                class42.method260(-500);
                                                            }
                                                            for (int var65 = 0; var65 < 5; ++var65) {
                                                                int var10002 = class143.field2511[var65]++;
                                                            }
                                                            int var66 = class157.method1029(23454);
                                                            int var67 = class130.method784(false);
                                                            if (~var66 < -4501 && ~var67 < -4501) {
                                                                ++class182.field3244;
                                                                class67.field1276 = 250;
                                                                class148.method948(4000, 127);
                                                                class285.field5010.method799(103, 160);
                                                            }
                                                            if (class16.field285 != null && ~class16.field285.field3241 == -2) {
                                                                if (class16.field285.field3239 != null) {
                                                                    class62.method355(class245.field4393, -65, class161.field2910);
                                                                }
                                                                class161.field2910 = false;
                                                                class245.field4393 = null;
                                                                class16.field285 = null;
                                                            }
                                                            ++class31.field491;
                                                            ++class270.field4831;
                                                            ++class7.field98;
                                                            if (class7.field98 > 500) {
                                                                class7.field98 = 0;
                                                                int var68 = (int) (8.0D * Math.random());
                                                                if (~(4 & var68) == -5) {
                                                                    class147.field2655 += class21.field346;
                                                                }
                                                                if ((2 & var68) == 2) {
                                                                    class266.field4783 += class247.field4429;
                                                                }
                                                                if (~(var68 & 1) == -2) {
                                                                    class267.field4793 += class141.field2456;
                                                                }
                                                            }
                                                            if (class266.field4783 < -55) {
                                                                class247.field4429 = 2;
                                                            }
                                                            if (class266.field4783 > 55) {
                                                                class247.field4429 = -2;
                                                            }
                                                            if (class31.field491 > 500) {
                                                                class31.field491 = 0;
                                                                int var69 = (int) (8.0D * Math.random());
                                                                if ((var69 & 2) == 2) {
                                                                    class230.field4211 += class111.field1954;
                                                                }
                                                                if ((1 & var69) == 1) {
                                                                    class137.field2400 += class120.field2121;
                                                                }
                                                            }
                                                            if (~class137.field2400 > 59) {
                                                                class120.field2121 = 2;
                                                            }
                                                            if (class137.field2400 > 60) {
                                                                class120.field2121 = -2;
                                                            }
                                                            if (~class230.field4211 > 19) {
                                                                class111.field1954 = 1;
                                                            }
                                                            if (class267.field4793 < -50) {
                                                                class141.field2456 = 2;
                                                            }
                                                            if (~class147.field2655 > 39) {
                                                                class21.field346 = 1;
                                                            }
                                                            if (class230.field4211 > 10) {
                                                                class111.field1954 = -1;
                                                            }
                                                            if (~class267.field4793 < -51) {
                                                                class141.field2456 = -2;
                                                            }
                                                            if (~class147.field2655 < -41) {
                                                                class21.field346 = -1;
                                                            }
                                                            if (class270.field4831 > 50) {
                                                                ++class62.field1171;
                                                                class285.field5010.method799(103, 120);
                                                            }
                                                            if (class254.field4556) {
                                                                method1380((byte) -119);
                                                                class254.field4556 = false;
                                                            }
                                                            try {
                                                                if (class17.field298 != null && ~class285.field5010.field3487 < -1) {
                                                                    class17.field298.method1685(class285.field5010.field3465, class285.field5010.field3487, false, 0);
                                                                    class285.field5010.field3487 = 0;
                                                                    class270.field4831 = 0;
                                                                    return;
                                                                }
                                                                return;
                                                            } catch (IOException var70) {
                                                                class287.method1877(0);
                                                                return;
                                                            }
                                                        }
                                                        var59 = var58.field1641;
                                                        if (var59.field719 < 0) {
                                                            break;
                                                        }
                                                        var60 = class27.method186(1341, var59.field789);
                                                    } while (var60 == null || var60.field885 == null || ~var59.field719 <= ~var60.field885.length || var60.field885[var59.field719] != var59);
                                                    class247.method1638(var58, (byte) -91);
                                                }
                                            }
                                            var56 = var55.field1641;
                                            if (~var56.field719 > -1) {
                                                break;
                                            }
                                            var57 = class27.method186(1341, var56.field789);
                                        } while (var57 == null || var57.field885 == null || var57.field885.length <= var56.field719 || var57.field885[var56.field719] != var56);
                                        class247.method1638(var55, (byte) -91);
                                    }
                                }
                                var53 = var52.field1641;
                                if (~var53.field719 > -1) {
                                    break;
                                }
                                var54 = class27.method186(1341, var53.field789);
                            } while (var54 == null || var54.field885 == null || ~var53.field719 <= ~var54.field885.length || var54.field885[var53.field719] != var53);
                            class247.method1638(var52, (byte) -91);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "()V")
    public class201() {
        this(4096);
    }

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "(B)V")
    private static final void method1380(byte arg0) {
        ++class105.field1853;
        class285.field5010.method799(103, 1);
        if (arg0 <= -70) {
            ++field3665;
            class285.field5010.method1278(class104.field1825, (byte) 50);
        }
    }

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "(B)V")
    public static void method1381(byte arg0) {
        field3673 = null;
        field3674 = null;
        field3668 = null;
        if (arg0 == -117) {
            field3670 = null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(I)V")
    private class201(int arg0) {
        super(0, true);
        this.field3666 = 4096;
        this.field3666 = arg0;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)[I")
    public final int[] method86(int arg0, int arg1) {
        if (arg0 > -13) {
            return null;
        } else {
            ++field3667;
            int[] var3 = super.field369.method306(arg1, -23179);
            if (super.field369.field1005) {
                class275.method1812(var3, 0, class72.field1359, this.field3666);
            }
            return var3;
        }
    }
}
