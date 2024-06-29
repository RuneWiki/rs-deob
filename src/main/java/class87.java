import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class87 {

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "Ljava/lang/String;")
    public static String field1428 = "Connecting to update server";

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "Lli;")
    public static class297 field1422;

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "[I")
    public static int[] field1427;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V")
    public static void method695(int arg0) {
        field1422 = null;
        field1428 = null;
        if (arg0 != 18967) {
            method695(-69);
        }
        field1427 = null;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lag;III)V")
    public static final void method696(class188 arg0, int arg1, int arg2, int arg3) {
        field1424++;
        if (arg1 != 0) {
            method697(14);
        }
        if (arg0.field2970 == 0) {
            arg0.field2961 = arg0.field2860;
        } else if (arg0.field2970 == 1) {
            arg0.field2961 = (arg3 - arg0.field2928) / 2 + arg0.field2860;
        } else if (arg0.field2970 == 2) {
            arg0.field2961 = arg3 - arg0.field2860 - arg0.field2928;
        } else if (arg0.field2970 == 3) {
            arg0.field2961 = arg0.field2860 * arg3 >> 14;
        } else if (arg0.field2970 == 4) {
            arg0.field2961 = (arg0.field2860 * arg3 >> 14) + (arg3 - arg0.field2928) / 2;
        } else {
            arg0.field2961 = arg3 - arg0.field2928 - (arg0.field2860 * arg3 >> 14);
        }
        if (arg0.field2901 == 0) {
            arg0.field3003 = arg0.field2846;
        } else if (arg0.field2901 == 1) {
            arg0.field3003 = (arg2 - arg0.field2922) / 2 + arg0.field2846;
        } else if (arg0.field2901 == 2) {
            arg0.field3003 = arg2 - arg0.field2922 - arg0.field2846;
        } else if (arg0.field2901 == 3) {
            arg0.field3003 = arg0.field2846 * arg2 >> 14;
        } else if (arg0.field2901 == 4) {
            arg0.field3003 = (arg2 - arg0.field2922) / 2 + (arg0.field2846 * arg2 >> 14);
        } else {
            arg0.field3003 = arg2 - (arg0.field2922 + (arg0.field2846 * arg2 >> 14));
        }
        if (!class102.field1626) {
            return;
        }
        if (client.method1063(arg0).field3429 == 0 && arg0.field2937 != 0) {
            return;
        }
        if (arg0.field2961 < 0) {
            arg0.field2961 = 0;
        } else if (arg0.field2961 + arg0.field2928 > arg3) {
            arg0.field2961 = arg3 - arg0.field2928;
        }
        if (arg0.field3003 < 0) {
            arg0.field3003 = 0;
            return;
        }
        if ((arg0.field3003 + arg0.field2922) > arg2) {
            arg0.field3003 = arg2 - arg0.field2922;
            return;
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)V")
    public static final void method697(int arg0) {
        if (class155.field2373 > 0) {
            class155.field2373--;
        }
        field1426++;
        if (class108.field1725 > 1) {
            class108.field1725--;
            class259.field3967 = class141.field2178;
        }
        if (class297.field4686) {
            class297.field4686 = false;
            class227.method1509(40);
            return;
        }
        for (int var1 = 0; var1 < 100 && class4.method53(24890); var1++) {
        }
        if (class239.field3715 != 30) {
            return;
        }
        class17.method161(-103, class292.field4607, 167);
        Object var2 = class35.field552.field4227;
        synchronized (class35.field552.field4227) {
            if (!class251.field3864) {
                class35.field552.field4232 = 0;
            } else if (class71.field1137 != 0 || class35.field552.field4232 >= 40) {
                class292.field4607.method1251(48, (byte) -71);
                class292.field4607.method287(arg0 ^ 0xE5BACD22, 0);
                class260.field3993++;
                int var3 = class292.field4607.field588;
                int var4 = 0;
                for (int var5 = 0; class35.field552.field4232 > var5 && (class292.field4607.field588 - var3) < 240; var5++) {
                    var4++;
                    int var6 = class35.field552.field4235[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    int var7 = class35.field552.field4234[var5];
                    boolean var8 = false;
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 65534) {
                        var7 = 65534;
                    }
                    if (class35.field552.field4235[var5] == -1 && class35.field552.field4234[var5] == -1) {
                        var7 = -1;
                        var8 = true;
                        var6 = -1;
                    }
                    if (class267.field4263 != var7 || class92.field1501 != var6) {
                        int var9 = var7 - class267.field4263;
                        class267.field4263 = var7;
                        int var10 = var6 - class92.field1501;
                        class92.field1501 = var6;
                        if (class23.field331 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var10 += 32;
                            var9 += 32;
                            class292.field4607.method312(1489253544, (class23.field331 << 12) + (var9 << 6) + var10);
                            class23.field331 = 0;
                        } else if (class23.field331 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                            class292.field4607.method287(440742616, class23.field331 + 128);
                            var10 += 128;
                            var9 += 128;
                            class292.field4607.method312(1489253544, (var9 << 8) + var10);
                            class23.field331 = 0;
                        } else if (class23.field331 < 32) {
                            class292.field4607.method287(440742616, class23.field331 + 192);
                            if (var8) {
                                class292.field4607.method289(Integer.MIN_VALUE, 45);
                            } else {
                                class292.field4607.method289(var7 | var6 << 16, arg0 + 127);
                            }
                            class23.field331 = 0;
                        } else {
                            class292.field4607.method312(1489253544, class23.field331 + 57344);
                            if (var8) {
                                class292.field4607.method289(Integer.MIN_VALUE, 43);
                            } else {
                                class292.field4607.method289(var6 << 16 | var7, -128);
                            }
                            class23.field331 = 0;
                        }
                    } else if (class23.field331 < 2047) {
                        class23.field331++;
                    }
                }
                class292.field4607.method339(class292.field4607.field588 - var3, 440742616);
                if (class35.field552.field4232 <= var4) {
                    class35.field552.field4232 = 0;
                } else {
                    class35.field552.field4232 -= var4;
                    for (int var11 = 0; var11 < class35.field552.field4232; var11++) {
                        class35.field552.field4234[var11] = class35.field552.field4234[var11 + var4];
                        class35.field552.field4235[var11] = class35.field552.field4235[var4 + var11];
                    }
                }
            }
        }
        if (class71.field1137 != 0) {
            class58.field904++;
            long var12 = (class155.field2377 - class231.field3604) / 50L;
            if (var12 > 32767L) {
                var12 = 32767L;
            }
            int var14 = class126.field1985;
            int var15 = class78.field1317;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            int var16 = (int) var12;
            byte var17 = 0;
            class231.field3604 = class155.field2377;
            if (class71.field1137 == 2) {
                var17 = 1;
            }
            class292.field4607.method1251(87, (byte) -105);
            class292.field4607.method294((byte) 101, var15 | var14 << 16);
            class292.field4607.method330(var17 << 15 | var16, 1003752392);
        }
        if (class292.field4597 > 0) {
            class292.field4597--;
        }
        if (class216.field3333 && class292.field4597 <= 0) {
            class78.field1314++;
            class216.field3333 = false;
            class292.field4597 = 20;
            class292.field4607.method1251(122, (byte) -112);
            class292.field4607.method286((int) class161.field2460, true);
            class292.field4607.method330((int) class276.field4334, 1003752392);
        }
        if (client.field2407 && !class221.field3462) {
            class221.field3462 = true;
            class292.field4607.method1251(0, (byte) -70);
            class292.field4607.method287(440742616, 1);
            class135.field2107++;
        }
        if (!client.field2407 && class221.field3462) {
            class221.field3462 = false;
            class135.field2107++;
            class292.field4607.method1251(0, (byte) -42);
            class292.field4607.method287(arg0 ^ 0xE5BACD22, 0);
        }
        if (!class258.field3956) {
            class263.field4116++;
            class292.field4607.method1251(36, (byte) -23);
            class292.field4607.method324((byte) 64, class149.method1015((byte) -83));
            class258.field3956 = true;
        }
        if (class209.field3246) {
            class209.field3246 = false;
        } else {
            class26.field400 /= 2.0F;
        }
        if (class265.field4221) {
            class265.field4221 = false;
        } else {
            class53.field821 /= 2.0F;
        }
        class29.method239((byte) -115);
        if (class239.field3715 != 30) {
            return;
        }
        class64.method508(false);
        class65.method514(0);
        class241.method1629(-13441);
        class71.field1126++;
        if (class71.field1126 > 750) {
            class227.method1509(40);
            return;
        }
        class195.method1310((byte) 87);
        class65.method513(true);
        class260.method1729(true);
        if (class242.field3750 != null) {
            class88.method704(115);
        }
        for (int var18 = class103.method783(true, true); var18 != -1; var18 = class103.method783(false, true)) {
            class58.method462(-2409, var18);
            class266.field4246[class3.method48(31, class90.field1450++)] = var18;
        }
        for (class295 var19 = class260.method1732(0); var19 != null; var19 = class260.method1732(0)) {
            int var20 = var19.method1982(arg0 ^ 0xFFFFFF05);
            int var21 = var19.method1981(false);
            if (var20 == 1) {
                class227.field3550[var21] = var19.field4632;
                class258.field3953[class3.method48(31, class53.field820++)] = var21;
            } else if (var20 == 2) {
                class137.field2131[var21] = var19.field4634;
                class57.field888[class3.method48(31, class241.field3731++)] = var21;
            } else if (var20 == 3) {
                class188 var42 = class5.method57((byte) -102, var21);
                if (!var19.field4634.equals(var42.field2831)) {
                    var42.field2831 = var19.field4634;
                    class246.method1663(255, var42);
                }
            } else if (var20 == 4) {
                class188 var22 = class5.method57((byte) -94, var21);
                int var23 = var19.field4632;
                int var24 = var19.field4636;
                int var25 = var19.field4626;
                if (var22.field2947 != var23 || var22.field2993 != var24 || var22.field2866 != var25) {
                    var22.field2947 = var23;
                    var22.field2866 = var25;
                    var22.field2993 = var24;
                    class246.method1663(255, var22);
                }
            } else if (var20 == 5) {
                class188 var41 = class5.method57((byte) -97, var21);
                if (var19.field4632 != var41.field2857 || var19.field4632 == -1) {
                    var41.field2974 = 0;
                    var41.field2868 = 1;
                    var41.field2833 = 0;
                    var41.field2857 = var19.field4632;
                    class246.method1663(255, var41);
                }
            } else if (var20 == 6) {
                int var26 = var19.field4632;
                int var27 = (var26 & 0x7CA6) >> 10;
                int var28 = (var26 & 0x3E5) >> 5;
                int var29 = var26 & 0x1F;
                class188 var30 = class5.method57((byte) -106, var21);
                int var31 = (var29 << 3) + (var27 << 19) + (var28 << 11);
                if (var30.field2934 != var31) {
                    var30.field2934 = var31;
                    class246.method1663(255, var30);
                }
            } else if (var20 == 7) {
                class188 var32 = class5.method57((byte) -95, var21);
                boolean var33 = var19.field4632 == 1;
                if (var32.field3009 != var33) {
                    var32.field3009 = var33;
                    class246.method1663(255, var32);
                }
            } else if (var20 == 8) {
                class188 var40 = class5.method57((byte) -120, var21);
                if (var19.field4632 != var40.field2945 || var19.field4636 != var40.field2933 || var19.field4626 != var40.field2908) {
                    var40.field2908 = var19.field4626;
                    var40.field2933 = var19.field4636;
                    var40.field2945 = var19.field4632;
                    if (var40.field2835 != -1) {
                        if (var40.field2837 > 0) {
                            var40.field2908 = var40.field2908 * 32 / var40.field2837;
                        } else if (var40.field2924 > 0) {
                            var40.field2908 = var40.field2908 * 32 / var40.field2924;
                        }
                    }
                    class246.method1663(255, var40);
                }
            } else if (var20 == 9) {
                class188 var39 = class5.method57((byte) -114, var21);
                if (var19.field4632 != var39.field2835 || var19.field4636 != var39.field2995) {
                    var39.field2835 = var19.field4632;
                    var39.field2995 = var19.field4636;
                    class246.method1663(255, var39);
                }
            } else if (var20 == 10) {
                class188 var38 = class5.method57((byte) -99, var21);
                if (var19.field4632 != var38.field2869 || var19.field4636 != var38.field2953 || var19.field4626 != var38.field2990) {
                    var38.field2953 = var19.field4636;
                    var38.field2990 = var19.field4626;
                    var38.field2869 = var19.field4632;
                    class246.method1663(255, var38);
                }
            } else if (var20 == 11) {
                class188 var37 = class5.method57((byte) -120, var21);
                var37.field2961 = var37.field2860 = var19.field4636;
                var37.field3003 = var37.field2846 = var19.field4632;
                var37.field2970 = 0;
                var37.field2901 = 0;
                class246.method1663(255, var37);
            } else if (var20 == 12) {
                class188 var34 = class5.method57((byte) -98, var21);
                int var35 = var19.field4632;
                if (var34 != null && var34.field2937 == 0) {
                    if (var35 > (var34.field2900 - var34.field2928)) {
                        var35 = var34.field2900 - var34.field2928;
                    }
                    if (var35 < 0) {
                        var35 = 0;
                    }
                    if (var34.field2887 != var35) {
                        var34.field2887 = var35;
                        class246.method1663(255, var34);
                    }
                }
            } else if (var20 == 13) {
                class188 var36 = class5.method57((byte) -100, var21);
                var36.field2851 = var19.field4632;
            }
        }
        class127.field1996++;
        if (class293.field4612 != 0) {
            class297.field4687 += 20;
            if (class297.field4687 >= 400) {
                class293.field4612 = 0;
            }
        }
        if (class238.field3682 != null) {
            class29.field463++;
            if (class29.field463 >= 15) {
                class246.method1663(255, class238.field3682);
                class238.field3682 = null;
            }
        }
        if (class28.field438 != null) {
            class246.method1663(arg0 + 261, class28.field438);
            class68.field1087++;
            if (class188.field3012 > (class227.field3559 + 5) || class227.field3559 - 5 > class188.field3012 || class171.field2546 + 5 < class108.field1719 || class108.field1719 < (class171.field2546 - 5)) {
                class28.field442 = true;
            }
            if (class3.field50 == 0) {
                if (class28.field442 && class68.field1087 >= 5) {
                    if (class28.field438 == class157.field2417 && class272.field4290 != class208.field3225) {
                        class29.field451++;
                        class188 var43 = class28.field438;
                        byte var44 = 0;
                        if (class191.field3043 == 1 && var43.field2950 == 206) {
                            var44 = 1;
                        }
                        if (var43.field2944[class208.field3225] <= 0) {
                            var44 = 0;
                        }
                        if (client.method1063(var43).method1463((byte) -17)) {
                            int var47 = class272.field4290;
                            int var48 = class208.field3225;
                            var43.field2944[var48] = var43.field2944[var47];
                            var43.field2897[var48] = var43.field2897[var47];
                            var43.field2944[var47] = -1;
                            var43.field2897[var47] = 0;
                        } else if (var44 == 1) {
                            int var45 = class272.field4290;
                            int var46 = class208.field3225;
                            while (var45 != var46) {
                                if (var46 < var45) {
                                    var43.method1260(var45 - 1, var45, 861);
                                    var45--;
                                } else if (var45 < var46) {
                                    var43.method1260(var45 + 1, var45, 861);
                                    var45++;
                                }
                            }
                        } else {
                            var43.method1260(class208.field3225, class272.field4290, 861);
                        }
                        class292.field4607.method1251(11, (byte) -40);
                        class292.field4607.method281(arg0 ^ 0x39E1, class272.field4290);
                        class292.field4607.method294((byte) 101, class28.field438.field2977);
                        class292.field4607.method287(440742616, var44);
                        class292.field4607.method312(1489253544, class208.field3225);
                    }
                } else if ((class189.field3020 == 1 || class34.method270(class220.field3450 - 1, (byte) 122)) && class220.field3450 > 2) {
                    class88.method711(6588);
                } else if (class220.field3450 > 0) {
                    class100.method775(2);
                }
                class71.field1137 = 0;
                class28.field438 = null;
                class29.field463 = 10;
            }
        }
        class71.field1136 = null;
        class188 var49 = class260.field3988;
        class260.field3988 = null;
        class166.field2516 = false;
        class188 var50 = class56.field878;
        class56.field878 = null;
        class148.field2289 = 0;
        class224.field3521 = false;
        while (class249.method1671(127) && class148.field2289 < 128) {
            class53.field819[class148.field2289] = class229.field3584;
            class276.field4352[class148.field2289] = class256.field3932;
            class148.field2289++;
        }
        class242.field3750 = null;
        if (class34.field544 != -1) {
            class140.method968(0, 0, (byte) -125, 0, class35.field573, class277.field4369, 0, class34.field544);
        }
        class141.field2178++;
        while (true) {
            class39 var51;
            class188 var52;
            class188 var53;
            do {
                var51 = (class39) class165.field2499.method1011(arg0 + 120);
                if (var51 == null) {
                    while (true) {
                        class39 var54;
                        class188 var55;
                        class188 var56;
                        do {
                            var54 = (class39) class292.field4594.method1011(115);
                            if (var54 == null) {
                                while (true) {
                                    class39 var57;
                                    class188 var58;
                                    class188 var59;
                                    do {
                                        var57 = (class39) class131.field2030.method1011(arg0 ^ 0x6);
                                        if (var57 == null) {
                                            if (class242.field3750 == null) {
                                                class56.field873 = 0;
                                            }
                                            if (class292.field4606 != null) {
                                                class151.method1025(32);
                                            }
                                            if (class259.field3968 > 0 && class145.field2256[82] && class145.field2256[81] && class77.field1307 != 0) {
                                                int var60 = class274.field4318 - class77.field1307;
                                                if (var60 < 0) {
                                                    var60 = 0;
                                                } else if (var60 > 3) {
                                                    var60 = 3;
                                                }
                                                class45.method375(var60, true, class118.field1828 + class261.field4058.field4204[0], class129.field2008 - -class261.field4058.field4143[0]);
                                            }
                                            if (class259.field3968 > 0 && class145.field2256[82] && class145.field2256[81]) {
                                                if (class187.field2818 != -1) {
                                                    class45.method375(class274.field4318, true, class118.field1828 + class187.field2818, class133.field2041 + class129.field2008);
                                                }
                                                class159.field2440 = 0;
                                                class212.field3289 = 0;
                                            } else if (class212.field3289 == 2) {
                                                if (class187.field2818 != -1) {
                                                    class292.field4607.method1251(251, (byte) -128);
                                                    class151.field2329++;
                                                    class292.field4607.method312(1489253544, class187.field2818 + class118.field1828);
                                                    class292.field4607.method281(-14821, class217.field3369);
                                                    class292.field4607.method286(class133.field2041 + class129.field2008, true);
                                                    class292.field4607.method294((byte) 101, class10.field197);
                                                    class297.field4687 = 0;
                                                    class265.field4226 = class78.field1317;
                                                    class293.field4612 = 1;
                                                    class267.field4259 = class126.field1985;
                                                }
                                                class212.field3289 = 0;
                                            } else if (class159.field2440 == 2) {
                                                if (class187.field2818 != -1) {
                                                    class292.field4607.method1251(232, (byte) -97);
                                                    class292.field4607.method281(-14821, class133.field2041 + class129.field2008);
                                                    class57.field890++;
                                                    class292.field4607.method286(class118.field1828 + class187.field2818, true);
                                                    class297.field4687 = 0;
                                                    class293.field4612 = 1;
                                                    class265.field4226 = class78.field1317;
                                                    class267.field4259 = class126.field1985;
                                                }
                                                class159.field2440 = 0;
                                            } else if (class187.field2818 != -1 && class212.field3289 == 0 && class159.field2440 == 0) {
                                                class210.method1407((class133.field2041 << 1) + 1 - class261.field4058.method226((byte) -97) >> 1, (class187.field2818 << 1) + 1 - class261.field4058.method226((byte) -97) >> 1, 0, 0);
                                                class265.field4226 = class78.field1317;
                                                class297.field4687 = 0;
                                                class267.field4259 = class126.field1985;
                                                class293.field4612 = 1;
                                            }
                                            class187.field2818 = -1;
                                            class66.method520(arg0 ^ 0x79);
                                            if (class260.field3988 != var49) {
                                                if (var49 != null) {
                                                    class246.method1663(255, var49);
                                                }
                                                if (class260.field3988 != null) {
                                                    class246.method1663(255, class260.field3988);
                                                }
                                            }
                                            if (class56.field878 != var50 && class289.field4556 == class134.field2085) {
                                                if (var50 != null) {
                                                    class246.method1663(255, var50);
                                                }
                                                if (class56.field878 != null) {
                                                    class246.method1663(255, class56.field878);
                                                }
                                            }
                                            if (class56.field878 == null) {
                                                if (class289.field4556 > 0) {
                                                    class289.field4556--;
                                                }
                                            } else if (class134.field2085 > class289.field4556) {
                                                class289.field4556++;
                                                if (class289.field4556 == class134.field2085) {
                                                    class246.method1663(arg0 ^ 0xFFFFFF05, class56.field878);
                                                }
                                            }
                                            for (int var61 = 0; var61 < 5; var61++) {
                                                int var10002 = class247.field3826[var61]++;
                                            }
                                            int var62 = class278.method1864(80);
                                            int var63 = class261.method1766((byte) -128);
                                            if (var62 > 15000 && var63 > 15000) {
                                                class66.field1057++;
                                                class155.field2373 = 250;
                                                class197.method1320(true, 14500);
                                                class292.field4607.method1251(229, (byte) -105);
                                            }
                                            if (class10.field196 != null && class10.field196.field3828 == 1) {
                                                if (class10.field196.field3831 != null) {
                                                    class61.method492(class35.field561, class140.field2154, (byte) 43);
                                                }
                                                class10.field196 = null;
                                                class35.field561 = null;
                                                class140.field2154 = false;
                                            }
                                            class63.field1010++;
                                            class84.field1390++;
                                            if (arg0 != -6) {
                                                return;
                                            }
                                            class140.field2153++;
                                            if (class140.field2153 > 500) {
                                                class140.field2153 = 0;
                                                int var64 = (int) (Math.random() * 8.0D);
                                                if ((var64 & 0x2) == 2) {
                                                    class93.field1506 += class242.field3753;
                                                }
                                                if ((var64 & 0x4) == 4) {
                                                    class208.field3238 += class265.field4231;
                                                }
                                                if ((var64 & 0x1) == 1) {
                                                    class5.field76 += class23.field333;
                                                }
                                            }
                                            if (class84.field1390 > 500) {
                                                class84.field1390 = 0;
                                                int var65 = (int) (Math.random() * 8.0D);
                                                if ((var65 & 0x1) == 1) {
                                                    class133.field2060 += class98.field1568;
                                                }
                                                if ((var65 & 0x2) == 2) {
                                                    class296.field4674 += class196.field3082;
                                                }
                                            }
                                            if (class208.field3238 < -40) {
                                                class265.field4231 = 1;
                                            }
                                            if (class133.field2060 < -60) {
                                                class98.field1568 = 2;
                                            }
                                            if (class133.field2060 > 60) {
                                                class98.field1568 = -2;
                                            }
                                            if (class93.field1506 < -55) {
                                                class242.field3753 = 2;
                                            }
                                            if (class296.field4674 < -20) {
                                                class196.field3082 = 1;
                                            }
                                            if (class93.field1506 > 55) {
                                                class242.field3753 = -2;
                                            }
                                            if (class5.field76 < -50) {
                                                class23.field333 = 2;
                                            }
                                            if (class296.field4674 > 10) {
                                                class196.field3082 = -1;
                                            }
                                            if (class5.field76 > 50) {
                                                class23.field333 = -2;
                                            }
                                            if (class208.field3238 > 40) {
                                                class265.field4231 = -1;
                                            }
                                            if (class63.field1010 > 50) {
                                                class292.field4607.method1251(6, (byte) -88);
                                                class50.field805++;
                                            }
                                            if (class238.field3691) {
                                                class271.method1831((byte) -124);
                                                class238.field3691 = false;
                                            }
                                            try {
                                                if (class118.field1829 != null && class292.field4607.field588 > 0) {
                                                    class118.field1829.method1243(0, class292.field4607.field583, class292.field4607.field588, (byte) -103);
                                                    class292.field4607.field588 = 0;
                                                    class63.field1010 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var66) {
                                                class227.method1509(40);
                                                return;
                                            }
                                        }
                                        var58 = var57.field657;
                                        if (var58.field2856 < 0) {
                                            break;
                                        }
                                        var59 = class5.method57((byte) -126, var58.field2870);
                                    } while (var59 == null || var59.field2968 == null || var58.field2856 >= var59.field2968.length || var59.field2968[var58.field2856] != var58);
                                    class243.method1648((byte) 80, var57);
                                }
                            }
                            var55 = var54.field657;
                            if (var55.field2856 < 0) {
                                break;
                            }
                            var56 = class5.method57((byte) -93, var55.field2870);
                        } while (var56 == null || var56.field2968 == null || var56.field2968.length <= var55.field2856 || var56.field2968[var55.field2856] != var55);
                        class243.method1648((byte) 89, var54);
                    }
                }
                var52 = var51.field657;
                if (var52.field2856 < 0) {
                    break;
                }
                var53 = class5.method57((byte) -94, var52.field2870);
            } while (var53 == null || var53.field2968 == null || var52.field2856 >= var53.field2968.length || var53.field2968[var52.field2856] != var52);
            class243.method1648((byte) 77, var51);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Z)V")
    public static final void method698(boolean arg0) {
        if (class11.field214 == null || class221.field3456 == null) {
            class11.field214 = new int[256];
            class221.field3456 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class11.field214[var1] = (int) (Math.sin(var2) * 4096.0D);
                class221.field3456[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        field1423++;
        if (arg0) {
            method697(117);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILcd;BI)V")
    public static final void method699(int arg0, class28 arg1, byte arg2, int arg3) {
        if (arg1.field4210 == arg0 && arg0 != -1) {
            class223 var4 = class28.method224(arg0, 73);
            int var5 = var4.field3509;
            if (var5 == 1) {
                arg1.field4181 = 0;
                arg1.field4185 = 0;
                arg1.field4196 = 1;
                arg1.field4179 = arg3;
                arg1.field4194 = 0;
                class56.method452((byte) 111, arg1.field4185, arg1.field4176, var4, class261.field4058 == arg1, arg1.field4123);
            }
            if (var5 == 2) {
                arg1.field4181 = 0;
            }
        } else if (arg0 == -1 || arg1.field4210 == -1 || class28.method224(arg0, 83).field3481 >= class28.method224(arg1.field4210, 127).field3481) {
            arg1.field4196 = 1;
            arg1.field4185 = 0;
            arg1.field4179 = arg3;
            arg1.field4151 = arg1.field4208;
            arg1.field4194 = 0;
            arg1.field4181 = 0;
            arg1.field4210 = arg0;
            if (arg1.field4210 != -1) {
                class56.method452((byte) -33, arg1.field4185, arg1.field4176, class28.method224(arg1.field4210, 108), class261.field4058 == arg1, arg1.field4123);
            }
        }
        field1429++;
        if (arg2 <= 33) {
            field1427 = null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(Z)V")
    public static final void method700(boolean arg0) {
        field1420++;
        class294.field4625.method1782(-68);
        if (!arg0) {
            field1421 = 25;
        }
        class134.field2087.method1782(-31);
        class8.field176.method1782(-11);
    }
}
