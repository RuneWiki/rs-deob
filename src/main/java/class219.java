import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class219 extends class33 {

    @OriginalMember(owner = "client!wc", name = "Y", descriptor = "Z")
    private boolean field4220 = true;

    @OriginalMember(owner = "client!wc", name = "ab", descriptor = "Z")
    private boolean field4222 = true;

    @OriginalMember(owner = "client!wc", name = "N", descriptor = "Lrd;")
    public static class173 field4210 = class133.method843(")4l", 83);

    @OriginalMember(owner = "client!wc", name = "S", descriptor = "Lrd;")
    private static class173 field4214 = class133.method843("Invalid username or password)3", -68);

    @OriginalMember(owner = "client!wc", name = "O", descriptor = "Lrd;")
    public static class173 field4211 = class133.method843("Mem:", 99);

    @OriginalMember(owner = "client!wc", name = "U", descriptor = "[Lsa;")
    public static class180[] field4216 = new class180[1000];

    @OriginalMember(owner = "client!wc", name = "cb", descriptor = "Lrd;")
    public static class173 field4224 = class133.method843("::noclip", -93);

    @OriginalMember(owner = "client!wc", name = "fb", descriptor = "Lrd;")
    public static class173 field4227 = field4214;

    @OriginalMember(owner = "client!wc", name = "M", descriptor = "I")
    public static int field4209;

    @OriginalMember(owner = "client!wc", name = "R", descriptor = "I")
    public static int field4213;

    @OriginalMember(owner = "client!wc", name = "T", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!wc", name = "W", descriptor = "I")
    public static int field4218;

    @OriginalMember(owner = "client!wc", name = "X", descriptor = "I")
    public static int field4219;

    @OriginalMember(owner = "client!wc", name = "Z", descriptor = "I")
    public static int field4221;

    @OriginalMember(owner = "client!wc", name = "bb", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!wc", name = "db", descriptor = "I")
    public static int field4225;

    @OriginalMember(owner = "client!wc", name = "eb", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!wc", name = "Q", descriptor = "J")
    public static long field4212;

    @OriginalMember(owner = "client!wc", name = "V", descriptor = "Lpd;")
    public static class153 field4217;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IB)[I")
    public final int[] method175(int arg0, byte arg1) {
        int var3 = 72 / ((-65 - arg1) / 60);
        ++field4215;
        int[] var4 = super.field718.method514(arg0, -20);
        if (super.field718.field1615) {
            int[] var5 = this.method262(this.field4220 ? -arg0 + class26.field545 : arg0, 118, 0);
            if (!this.field4222) {
                class85.method555(var5, 0, var4, 0, class117.field2173);
            } else {
                for (int var6 = 0; class117.field2173 > var6; ++var6) {
                    var4[var6] = var5[class125.field2347 - var6];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(III)Lw;")
    public static final class216 method1425(int arg0, int arg1, int arg2) {
        class105 var3 = class208.field4055[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1957;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IJII)Z")
    public static final boolean method1426(int arg0, long arg1, int arg2, int arg3) {
        ++field4223;
        int var5 = ((int) arg1 & 3354829) >> 20;
        int var6 = 31 & (int) arg1 >> 14;
        int var7 = Integer.MAX_VALUE & (int) (arg1 >>> 32);
        if (var6 != 10 && var6 != 11 && ~var6 != -23) {
            class30.method233(0, arg3, class175.field3447.field2814[0], arg2, true, 2, var6 + 1, 0, class175.field3447.field2764[0], (byte) -2, 0, var5);
        } else {
            class4 var8 = class182.method1237(true, var7);
            int var9;
            int var10;
            if (~var5 != -1 && ~var5 != -3) {
                var9 = var8.field61;
                var10 = var8.field67;
            } else {
                var9 = var8.field67;
                var10 = var8.field61;
            }
            int var11 = var8.field60;
            if (var5 != 0) {
                var11 = (var11 >> 4 - var5) + (15 & var11 << var5);
            }
            class30.method233(var9, arg3, class175.field3447.field2814[0], arg2, true, 2, 0, var11, class175.field3447.field2764[0], (byte) -2, var10, 0);
        }
        class31.field650 = class23.field493;
        if (arg0 < 30) {
            field4216 = null;
        }
        class161.field2996 = 0;
        class155.field2925 = 2;
        class20.field447 = class41.field849;
        return true;
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(II)Lmd;")
    public static final class123 method1427(int arg0, int arg1) {
        ++field4209;
        if (arg1 >= -63) {
            return null;
        } else {
            class123 var2 = (class123) class92.field1743.method46((long) arg0, 26580);
            if (var2 != null) {
                return var2;
            } else {
                byte[] var3 = class189.field3705.method142(class189.method1266(arg0, 50), class153.method1008(arg0, (byte) 99), (byte) 2);
                class123 var4 = new class123();
                var4.field2322 = arg0;
                if (var3 != null) {
                    var4.method798(true, new class121(var3));
                }
                class92.field1743.method52(-3583, var4, (long) arg0);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILqf;III)V")
    public static final void method1428(int arg0, class165 arg1, int arg2, int arg3, int arg4) {
        class196.method1305(-99);
        ++field4218;
        class27.method212(arg2, arg3, arg1.field3156 + arg2, arg1.field3105 + arg3);
        if (arg4 == 0) {
            if (~class64.field1256 != -3 && ~class64.field1256 != -6) {
                int var5 = class175.field3447.field2820 / 32 + 48;
                int var6 = class140.field2620 + class140.field2614 & 2047;
                int var7 = -(class175.field3447.field2801 / 32) + 464;
                class30.field620.method1233(arg2, arg3, arg1.field3156, arg1.field3105, var5, var7, var6, class167.field3225 + 256, arg1.field3053, arg1.field3089);
                for (int var8 = 0; var8 < class169.field3263; ++var8) {
                    int var41 = class94.field1755[var8] * 4 + 2 + -(class175.field3447.field2820 / 32);
                    int var42 = class109.field2030[var8] * 4 + 2 + -(class175.field3447.field2801 / 32);
                    class204.method1357(var41, arg1, (byte) -126, arg3, field4216[var8], arg2, var42);
                }
                for (int var9 = 0; var9 < 104; ++var9) {
                    for (int var37 = 0; ~var37 > -105; ++var37) {
                        class145 var38 = class160.field2985[class172.field3347][var9][var37];
                        if (var38 != null) {
                            int var39 = var9 * 4 + 2 + -(class175.field3447.field2820 / 32);
                            int var40 = var37 * 4 + -(class175.field3447.field2801 / 32) + 2;
                            class204.method1357(var39, arg1, (byte) -114, arg3, class82.field1600[0], arg2, var40);
                        }
                    }
                }
                for (int var10 = 0; var10 < class66.field1291; ++var10) {
                    class120 var33 = client.field632[class139.field2597[var10]];
                    if (var33 != null && var33.method727(true)) {
                        class45 var34 = var33.field2215;
                        if (var34 != null && var34.field922 != null) {
                            var34 = var34.method318((byte) 92);
                        }
                        if (var34 != null && var34.field931 && var34.field918) {
                            int var35 = var33.field2820 / 32 + -(class175.field3447.field2820 / 32);
                            int var36 = var33.field2801 / 32 + -(class175.field3447.field2801 / 32);
                            class204.method1357(var35, arg1, (byte) -87, arg3, class82.field1600[1], arg2, var36);
                        }
                    }
                }
                for (int var11 = 0; class18.field378 > var11; ++var11) {
                    class212 var25 = class183.field3600[class189.field3703[var11]];
                    if (var25 != null && var25.method727(true)) {
                        int var26 = var25.field2820 / 32 + -(class175.field3447.field2820 / 32);
                        int var27 = var25.field2801 / 32 + -(class175.field3447.field2801 / 32);
                        boolean var28 = false;
                        long var29 = var25.field4097.method1132(101);
                        for (int var31 = 0; class129.field2442 > var31; ++var31) {
                            if (class209.field4061[var31] == var29 && class181.field3557[var31] != 0) {
                                var28 = true;
                                break;
                            }
                        }
                        boolean var32 = false;
                        if (class175.field3447.field4115 != 0 && var25.field4115 != 0 && ~class175.field3447.field4115 == ~var25.field4115) {
                            var32 = true;
                        }
                        if (!var28) {
                            if (var32) {
                                class204.method1357(var26, arg1, (byte) -36, arg3, class82.field1600[4], arg2, var27);
                            } else {
                                class204.method1357(var26, arg1, (byte) -122, arg3, class82.field1600[2], arg2, var27);
                            }
                        } else {
                            class204.method1357(var26, arg1, (byte) -60, arg3, class82.field1600[3], arg2, var27);
                        }
                    }
                }
                class67[] var12 = class105.field1971;
                for (int var13 = 0; var12.length > var13; ++var13) {
                    class67 var16 = var12[var13];
                    if (var16 != null && ~var16.field1310 != -1 && class217.field4203 % 20 < 10) {
                        if (var16.field1310 == 1 && ~var16.field1311 <= -1 && var16.field1311 < client.field632.length) {
                            class120 var17 = client.field632[var16.field1311];
                            if (var17 != null) {
                                int var18 = var17.field2820 / 32 + -(class175.field3447.field2820 / 32);
                                int var19 = var17.field2801 / 32 + -(class175.field3447.field2801 / 32);
                                class99.method604(arg2, var16.field1309, (byte) 106, var18, arg3, arg1, var19);
                            }
                        }
                        if (var16.field1310 == 2) {
                            int var20 = (-class108.field2024 + var16.field1299) * 4 - -2 + -(class175.field3447.field2820 / 32);
                            int var21 = (-class43.field874 + var16.field1302) * 4 + -(class175.field3447.field2801 / 32) + 2;
                            class99.method604(arg2, var16.field1309, (byte) 74, var20, arg3, arg1, var21);
                        }
                        if (var16.field1310 == 10 && ~var16.field1311 <= -1 && ~class183.field3600.length < ~var16.field1311) {
                            class212 var22 = class183.field3600[var16.field1311];
                            if (var22 != null) {
                                int var23 = var22.field2820 / 32 + -(class175.field3447.field2820 / 32);
                                int var24 = var22.field2801 / 32 + -(class175.field3447.field2801 / 32);
                                class99.method604(arg2, var16.field1309, (byte) 82, var23, arg3, arg1, var24);
                            }
                        }
                    }
                }
                if (class55.field1094 != 0) {
                    int var14 = class193.field3759 * 4 + -(class175.field3447.field2801 / 32) + 2;
                    int var15 = class55.field1094 * 4 + (2 - class175.field3447.field2820 / 32);
                    class204.method1357(var15, arg1, (byte) -105, arg3, class31.field665, arg2, var14);
                }
                class27.method219(arg2 - (-(arg1.field3156 / 2) + 1), arg1.field3105 / 2 + -1 + arg3, 3, 3, 16777215);
            } else {
                class27.method208(arg2, arg3, 0, arg1.field3053, arg1.field3089);
            }
            class177.field3477[arg0] = true;
        }
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(II)[[I")
    public final int[][] method178(int arg0, int arg1) {
        ++field4213;
        int[][] var3 = super.field731.method1340(127, arg1);
        if (super.field731.field3925) {
            int[][] var4 = this.method259(0, -9, !this.field4220 ? arg1 : -arg1 + class26.field545);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            if (!this.field4222) {
                for (int var11 = 0; ~var11 > ~class117.field2173; ++var11) {
                    var9[var11] = var6[var11];
                    var8[var11] = var5[var11];
                    var10[var11] = var7[var11];
                }
            } else {
                for (int var12 = 0; class117.field2173 > var12; ++var12) {
                    var9[var12] = var6[class125.field2347 - var12];
                    var8[var12] = var5[-var12 + class125.field2347];
                    var10[var12] = var7[-var12 + class125.field2347];
                }
            }
        }
        return arg0 <= 112 ? null : var3;
    }

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "(I)V")
    public static void method1429(int arg0) {
        field4210 = null;
        field4227 = null;
        field4224 = null;
        field4211 = null;
        field4216 = null;
        field4214 = null;
        if (arg0 != -20843) {
            method1426(-73, 22L, 76, -43);
        }
        field4217 = null;
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(B)I")
    public static final int method1430(byte arg0) {
        ++field4226;
        int var1 = 22 / ((42 - arg0) / 38);
        return class134.field2542++;
    }

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "(I)V")
    public static final void method1431(int arg0) {
        class166.field3200 = class119.field2190;
        class13.field251 = class51.field1054;
        class43.field873 = class98.field1781;
        class131.field2482 = class9.field167;
        class182.field3578 = class19.field394;
        class193.field3758 = class220.field4233;
        class63.field1230 = class165.field3181;
        class193.field3745 = class127.field2391;
        class114.field2123 = class177.field3471;
        class203.field3959 = class94.field1761;
        class117.field2170 = class167.field3226;
        class187.field3652 = class60.field1170;
        class169.field3256 = class63.field1246;
        class204.field3993 = class34.field745;
        class169.field3269 = class194.field3777;
        class203.field3929 = class202.field3920;
        class133.field2505 = class188.field3673;
        class203.field3985 = class202.field3920;
        class71.field1379 = class122.field2287;
        class203.field3943 = class17.field364;
        class74.field1440 = class73.field1426;
        class41.field842 = class152.field2885;
        class168.field3236 = class75.field1480;
        class183.field3592 = class118.field2183;
        class202.field3923 = class145.field2699;
        class75.field1465 = class119.field2202;
        class30.field613 = class68.field1313;
        class203.field3978 = class202.field3920;
        class203.field3986 = class64.field1250;
        class187.field3662 = class31.field670;
        class37.field785 = class41.field844;
        class66.field1272 = class174.field3430;
        class203.field3964 = class202.field3920;
        class8.field149 = class214.field4158;
        class64.field1252 = class62.field1212;
        class54.field1075 = class197.field3850;
        class133.field2527 = class186.field3613;
        class203.field3969 = class202.field3920;
        class169.field3279 = class101.field1852;
        class203.field3974 = class202.field3920;
        class46.field992 = class23.field498;
        class73.field1431 = class179.field3535;
        class122.field2298 = class100.field1836;
        client.field629 = class4.field99;
        class75.field1466 = class171.field3304;
        class216.field4172 = class71.field1383;
        class38.field802 = class58.field1156;
        class99.field1804 = class183.field3586;
        class145.field2704 = class20.field459;
        class157.field2939 = class41.field845;
        class28.field591 = class4.field95;
        class13.field275 = class189.field3687;
        class203.field3930 = class202.field3920;
        class203.field3956 = class84.field1666;
        class116.field2142 = class93.field1748;
        class203.field3980 = class109.field2032;
        class17.field360 = class108.field2013;
        class172.field3316 = class121.field2261;
        class107.field2000 = class188.field3672;
        class12.field190 = class75.field1467;
        class203.field3970 = class202.field3920;
        field4227 = class209.field4068;
        class54.field1087 = class69.field1324;
        class78.field1512 = class79.field1550;
        class31.field655 = class84.field1665;
        class203.field3967 = class109.field2032;
        class26.field543 = class9.field159;
        class133.field2513 = class190.field3715;
        class60.field1195 = class169.field3266;
        class220.field4229 = class58.field1155;
        class145.field2710 = class212.field4119;
        class183.field3588 = class87.field1709;
        class167.field3233 = class126.field2364;
        class194.field3764 = class144.field2684;
        class109.field2034 = class122.field2294;
        class122.field2296 = class80.field1584;
        class203.field3966 = class152.field2876;
        class190.field3723 = class150.field2847;
        class176.field3455 = class220.field4238;
        class202.field3918 = class161.field3003;
        class22.field471 = class69.field1332;
        class187.field3657 = class31.field670;
        class163.field3019 = class98.field1783;
        class203.field3965 = class42.field866;
        class187.field3654 = class34.field748;
        class59.field1163 = class190.field3718;
        class189.field3685 = class35.field756;
        class82.field1596 = class111.field2065;
        class212.field4105 = class12.field201;
        class52.field1073 = class205.field4016;
        class203.field3941 = class202.field3920;
        class151.field2857 = class161.field2993;
        class203.field3952 = class202.field3920;
        class220.field4237 = class35.field764;
        class166.field3211 = class208.field4051;
        class187.field3649 = class31.field670;
        class171.field3312 = class101.field1846;
        class31.field672 = class87.field1708;
        class58.field1149 = class40.field818;
        class203.field3963 = class64.field1265;
        class203.field3931 = class202.field3920;
        class203.field3932 = class107.field1988;
        class48.field1016 = class105.field1939;
        class129.field2438 = class41.field852;
        class186.field3632 = class145.field2711;
        class54.field1083 = class151.field2869;
        class203.field3940 = class202.field3920;
        class110.field2046 = class46.field977;
        class203.field3979 = class202.field3920;
        class14.field319 = class54.field1084;
        class203.field3977 = class202.field3920;
        class35.field763 = class122.field2292;
        class169.field3259 = class63.field1246;
        class23.field507 = class24.field527;
        class160.field2987 = class223.field4278;
        class28.field584 = class97.field1772;
        class20.field444 = class175.field3443;
        class99.field1798 = class43.field872;
        class62.field1224 = class174.field3426;
        ++field4219;
        class92.field1737 = class190.field3725;
        class203.field3976 = class31.field670;
        class64.field1268 = class103.field1913;
        class188.field3675 = class9.field164;
        class189.field3710 = class161.field2995;
        class157.field2941 = class220.field4230;
        class64.field1263 = class62.field1212;
        class174.field3425 = class152.field2882;
        class133.field2528 = class38.field800;
        class127.field2393 = class160.field2990;
        class84.field1677 = class45.field917;
        class203.field3942 = class202.field3920;
        class75.field1483 = class126.field2369;
        class28.field569 = class172.field3346;
        class58.field1150 = class165.field3182;
        class106.field1981 = class120.field2207;
        class26.field549 = class40.field829;
        class203.field3936 = class202.field3920;
        class203.field3953 = class202.field3920;
        class109.field2037 = class25.field536;
        class36.field772 = class182.field3581;
        if (arg0 != 32) {
            method1431(-82);
        }
        class211.field4088 = class196.field3819;
        class197.field3847 = class205.field4005;
        class55.field1100 = class203.field3971;
        class54.field1081 = class38.field804;
        class112.field2075 = class14.field312;
        class103.field1922 = class17.field361;
        class145.field2712 = class212.field4119;
        class101.field1854 = class123.field2304;
        class46.field984 = class11.field185;
        class171.field3315 = class36.field779;
        class203.field3946 = class203.field3984;
        class181.field3561 = class19.field405;
        class68.field1321 = class28.field575;
        class221.field4243 = class212.field4124;
        class196.field3829 = class70.field1369;
        class183.field3597 = class118.field2183;
        class56.field1106 = class135.field2565;
        class133.field2507 = class188.field3673;
        class203.field3950 = class24.field520;
        class203.field3947 = class202.field3920;
        class189.field3689 = class191.field3741;
        class144.field2686 = class159.field2971;
        class147.field2819 = class87.field1706;
        class140.field2615 = class81.field1587;
        client.field644 = class153.field2899;
        class103.field1909 = class42.field856;
        class18.field373 = class205.field4008;
        class15.field346 = class119.field2200;
        class63.field1236 = class207.field4026;
        class203.field3961 = class202.field3920;
        class60.field1174 = class202.field3903;
        class145.field2697 = class70.field1371;
        class203.field3987 = class202.field3920;
        class103.field1921 = class125.field2348;
        class203.field3972 = class129.field2444;
        class221.field4252 = class68.field1319;
        class22.field473 = class194.field3768;
        class40.field828 = class35.field762;
        class157.field2954 = class202.field3920;
        class203.field3975 = class202.field3920;
        class145.field2725 = class181.field3554;
        class5.field110 = class105.field1969;
        class124.field2332 = client.field623;
        class161.field3004 = class119.field2192;
        class187.field3645 = class60.field1170;
        class197.field3844 = class140.field2608;
        class60.field1201 = class82.field1603;
        class118.field2178 = class151.field2872;
        class207.field4028 = class181.field3550;
        class100.field1840 = class58.field1147;
        class47.field1002 = class203.field3957;
        class74.field1455 = class23.field504;
        class67.field1300 = class195.field3787;
        class203.field3981 = class24.field520;
        class221.field4242 = class123.field2323;
        class103.field1915 = class17.field361;
        if (class172.field3364) {
        }
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "()V")
    public class219() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BI)Z")
    public static final boolean method1432(byte arg0, int arg1) {
        if (arg0 != 90) {
            return false;
        } else {
            ++field4221;
            return (1 & arg1 >> 21) != 0;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IILmb;)V")
    public final void method177(int arg0, int arg1, class121 arg2) {
        if (arg1 < -99) {
            if (~arg0 != -1) {
                if (arg0 != 1) {
                    if (arg0 == 2) {
                        super.field729 = arg2.method751((byte) -80) == 1;
                    }
                } else {
                    this.field4220 = ~arg2.method751((byte) -43) == -2;
                }
            } else {
                this.field4222 = ~arg2.method751((byte) 93) == -2;
            }
            ++field4225;
        }
    }
}
