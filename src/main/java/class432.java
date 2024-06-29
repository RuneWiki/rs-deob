import java.io.IOException;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public abstract class class432 extends class499 {

    @OriginalMember(owner = "client!pe", name = "s", descriptor = "I")
    public int field6279;

    @OriginalMember(owner = "client!pe", name = "x", descriptor = "I")
    public int field6284;

    @OriginalMember(owner = "client!pe", name = "v", descriptor = "I")
    private int field6282;

    @OriginalMember(owner = "client!pe", name = "A", descriptor = "F")
    public float field6287;

    @OriginalMember(owner = "client!pe", name = "z", descriptor = "I")
    public int field6286;

    @OriginalMember(owner = "client!pe", name = "y", descriptor = "I")
    private int field6285;

    @OriginalMember(owner = "client!pe", name = "B", descriptor = "Ljava/util/Random;")
    public static Random field6288 = new Random();

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "I")
    public static int field6274;

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "I")
    public static int field6275;

    @OriginalMember(owner = "client!pe", name = "p", descriptor = "I")
    public static int field6276;

    @OriginalMember(owner = "client!pe", name = "q", descriptor = "I")
    public static int field6277;

    @OriginalMember(owner = "client!pe", name = "r", descriptor = "I")
    public static int field6278;

    @OriginalMember(owner = "client!pe", name = "t", descriptor = "I")
    public static int field6280;

    @OriginalMember(owner = "client!pe", name = "u", descriptor = "I")
    public static int field6281;

    @OriginalMember(owner = "client!pe", name = "w", descriptor = "I")
    public static int field6283;

    @OriginalMember(owner = "client!pe", name = "C", descriptor = "I")
    public static int field6289;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Z)I", line = 3)
    public final int method2572(boolean arg0) {
        field6276++;
        if (arg0) {
            this.method2577(118);
        }
        return this.field6284;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)I", line = 14)
    public final int method2573(int arg0) {
        int var2 = 52 % ((6 - arg0) / 46);
        field6283++;
        return this.field6279;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(Z)I", line = 25)
    public final int method2574(boolean arg0) {
        field6275++;
        if (arg0) {
            this.field6286 = -38;
        }
        return this.field6282;
    }

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "(I)F", line = 39)
    public final float method2575(int arg0) {
        int var2 = 115 / ((34 - arg0) / 59);
        field6274++;
        return this.field6287;
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(Z)V", line = 56)
    public static final void method2576(boolean arg0) {
        field6281++;
        if (class471.field6890 > 0) {
            class471.field6890--;
        }
        if (class158.field2250 > 1) {
            class317.field4398 = class234.field3240;
            class158.field2250--;
        }
        if (class261.field3592) {
            class261.field3592 = false;
            class159.method982(-1);
            return;
        }
        if (!class9.field86) {
            class340.method1897(0);
        }
        for (int var1 = 0; var1 < 100 && class350.method1938((byte) -109); var1++) {
        }
        if (class137.field1958 != 30) {
            return;
        }
        class514.method3022((byte) -124, class511.field7516.method2861(92), class244.field3395);
        if (class138.field1984 == null) {
            if (class333.method1850(-3562) >= class284.field3820) {
                class138.field1984 = class309.field4235.method1552(55, class54.field751);
            }
        } else if (class138.field1984.field4733 != -1) {
            class356.method1978((byte) 115, class338.field4659);
            class244.field3395.method2070(81954016, class138.field1984.field4733);
            class138.field1984 = null;
            class284.field3820 = class333.method1850(-3562) + 30000L;
        }
        class386 var2 = (class386) class192.field2700.method3072((byte) 33);
        if (var2 != null || class184.field2575 < class333.method1850(-3562) - 2000L) {
            boolean var3 = false;
            int var4 = class244.field3395.field5069;
            for (class386 var5 = (class386) class233.field3230.method3072((byte) 119); var5 != null && class244.field3395.field5069 - var4 < 240; var5 = (class386) class233.field3230.method3066(2)) {
                var5.method2946(-100);
                int var6 = var5.method2221(-3);
                if (var6 < 0) {
                    var6 = 0;
                } else if (var6 > 65534) {
                    var6 = 65534;
                }
                int var7 = var5.method2220(-1243743073);
                if (var7 < 0) {
                    var7 = 0;
                } else if (var7 > 65534) {
                    var7 = 65534;
                }
                boolean var8 = false;
                if (var5.method2221(-3) == -1 && var5.method2220(-1243743073) == -1) {
                    var8 = true;
                    var6 = -1;
                    var7 = -1;
                }
                if (class12.field138 != var7 || class315.field4309 != var6) {
                    if (!var3) {
                        class356.method1978((byte) 73, class203.field2884);
                        class320.field4426++;
                        class244.field3395.method2084(0, false);
                        var3 = true;
                        var4 = class244.field3395.field5069;
                    }
                    int var9 = var7 - class12.field138;
                    class12.field138 = var7;
                    int var10 = var6 - class315.field4309;
                    class315.field4309 = var6;
                    int var11 = (int) ((var5.method2219(122) - class184.field2575) / 20L);
                    if (var11 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                        var9 += 32;
                        var10 += 32;
                        class244.field3395.method2070(81954016, (var11 << 12) + (var9 << 6) + var10);
                    } else if (var11 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                        var10 += 128;
                        class244.field3395.method2084(var11 + 128, false);
                        var9 += 128;
                        class244.field3395.method2070(81954016, (var9 << 8) + var10);
                    } else if (var11 >= 32) {
                        class244.field3395.method2070(81954016, var11 + 57344);
                        if (var8) {
                            class244.field3395.method2074(false, Integer.MIN_VALUE);
                        } else {
                            class244.field3395.method2074(false, var7 | var6 << 16);
                        }
                    } else {
                        class244.field3395.method2084(var11 + 192, false);
                        if (var8) {
                            class244.field3395.method2074(false, Integer.MIN_VALUE);
                        } else {
                            class244.field3395.method2074(false, var7 | var6 << 16);
                        }
                    }
                    class184.field2575 = var5.method2219(25);
                }
            }
            if (var3) {
                class244.field3395.method2107(class244.field3395.field5069 - var4, 116);
            }
        }
        if (var2 != null) {
            long var12 = (var2.method2219(-125) - class88.field1201) / 50L;
            class88.field1201 = var2.method2219(126);
            if (var12 > 32767L) {
                var12 = 32767L;
            }
            int var14 = var2.method2221(-3);
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            int var15 = var2.method2220(-1243743073);
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            byte var16 = 0;
            if (var2.method2217(2879) == 2) {
                var16 = 1;
            }
            class356.method1978((byte) 119, class148.field2092);
            int var17 = (int) var12;
            class43.field600++;
            class244.field3395.method2113(var16 << 15 | var17, -120);
            class244.field3395.method2074(!arg0, var15 | var14 << 16);
        }
        if (class171.field2449 > 0) {
            int var18 = 0;
            for (int var19 = 0; var19 < class171.field2449; var19++) {
                if (class270.field3697[var19].method271(true)) {
                    var18++;
                }
            }
            if (var18 > 0) {
                class356.method1978((byte) 91, class17.field178);
                class183.field2555++;
                if (var18 > 75) {
                    var18 = 75;
                }
                class244.field3395.method2084(var18 * 3, false);
                for (int var20 = 0; var20 < class171.field2449; var20++) {
                    class43 var21 = class270.field3697[var20];
                    if (var21.method271(true)) {
                        long var22 = (var21.method278(29480) - class518.field7624) / 50L;
                        if (var22 > 65535L) {
                            var22 = 65535L;
                        }
                        class518.field7624 = var21.method278(29480);
                        class244.field3395.method2084(var21.method276((byte) -124), false);
                        class244.field3395.method2070(81954016, (int) var22);
                    }
                }
            }
        }
        if (class309.field4238 > 0) {
            class309.field4238--;
        }
        if (class351.field4800 && class309.field4238 <= 0) {
            class178.field2523++;
            class309.field4238 = 20;
            class351.field4800 = false;
            class356.method1978((byte) 68, class344.field4736);
            class244.field3395.method2061((int) class510.field7495 >> 3, (byte) 118);
            class244.field3395.method2061((int) class40.field553 >> 3, (byte) 105);
        }
        if (class483.field7099 && !class320.field4421) {
            class320.field4421 = true;
            class8.field78++;
            class356.method1978((byte) 36, class356.field4867);
            class244.field3395.method2084(1, !arg0);
        }
        if (!class483.field7099 && class320.field4421) {
            class320.field4421 = false;
            class8.field78++;
            class356.method1978((byte) 79, class356.field4867);
            class244.field3395.method2084(0, false);
        }
        if (!class164.field2341) {
            class356.method1978((byte) 94, class63.field867);
            class290.field3894++;
            class244.field3395.method2084(0, !arg0);
            int var24 = class244.field3395.field5069;
            class365 var25 = class437.field6374.method559((byte) -108);
            class244.field3395.method2079(var25.field5069, var25.field5073, 64, 0);
            class244.field3395.method2107(class244.field3395.field5069 - var24, 99);
            class164.field2341 = true;
        }
        if (class385.field5410 != null) {
            if (class128.field1742 == 2) {
                class504.method2963(false);
            } else if (class128.field1742 == 3) {
                class102.method678(false);
            }
        }
        if (class125.field1717) {
            class125.field1717 = false;
        } else {
            class401.field5582 /= 2.0F;
        }
        if (class337.field4644) {
            class337.field4644 = false;
        } else {
            class260.field3580 /= 2.0F;
        }
        class171.method1060(69);
        if (class137.field1958 != 30) {
            return;
        }
        class382.method2195(-70);
        class60.method383(-16780);
        class316.method1795(-14409);
        class308.method1749((byte) 124);
        class193.field2752++;
        if (class193.field2752 > 750) {
            class159.method982(-1);
            return;
        }
        class310.method1758(-47);
        class115.method738((byte) -10);
        class29.method201(false);
        for (int var26 = class453.field6623.method1886((byte) -108, arg0); var26 != -1; var26 = class453.field6623.method1886((byte) -51, false)) {
            class183.method1113((byte) -122, var26);
            class129.field1776[class118.method750(class223.field3139++, 31)] = var26;
        }
        for (class163 var27 = class410.method2392(86); var27 != null; var27 = class410.method2392(-68)) {
            int var28 = var27.method1013((byte) -111);
            int var29 = var27.method1011(31047);
            if (var28 == 1) {
                class505.field7432[var29] = var27.field2328;
                class354.field4824 |= class326.field4473[var29];
                class292.field3912[class118.method750(31, class480.field7025++)] = var29;
            } else if (var28 == 2) {
                class92.field1240[var29] = var27.field2326;
                class338.field4662[class118.method750(class316.field4382++, 31)] = var29;
            } else if (var28 == 3) {
                class295 var30 = class339.method1882((byte) 58, var29);
                if (!var27.field2326.equals(var30.field3961)) {
                    var30.field3961 = var27.field2326;
                    class150.method952((byte) -3, var30);
                }
            } else if (var28 == 4) {
                class295 var31 = class339.method1882((byte) 54, var29);
                int var32 = var27.field2328;
                int var33 = var27.field2332;
                int var34 = var27.field2324;
                if (var31.field3965 != var32 || var31.field3948 != var33 || var31.field4045 != var34) {
                    var31.field3948 = var33;
                    var31.field4045 = var34;
                    var31.field3965 = var32;
                    class150.method952((byte) -56, var31);
                }
            } else if (var28 == 5) {
                class295 var35 = class339.method1882((byte) 116, var29);
                if (var27.field2328 != var35.field4060 || var27.field2328 == -1) {
                    var35.field4070 = 1;
                    var35.field4018 = 0;
                    var35.field4078 = 0;
                    var35.field4060 = var27.field2328;
                    class150.method952((byte) -5, var35);
                }
            } else if (var28 == 6) {
                int var46 = var27.field2328;
                int var47 = var46 >> 10 & 0x1F;
                int var48 = (var46 & 0x3EB) >> 5;
                int var49 = var46 & 0x1F;
                int var50 = (var47 << 19) + (var48 << 11) + (var49 << 3);
                class295 var51 = class339.method1882((byte) 83, var29);
                if (var51.field3925 != var50) {
                    var51.field3925 = var50;
                    class150.method952((byte) -113, var51);
                }
            } else if (var28 == 7) {
                class295 var44 = class339.method1882((byte) 99, var29);
                boolean var45 = var27.field2328 == 1;
                if (var44.field4031 != var45) {
                    var44.field4031 = var45;
                    class150.method952((byte) 104, var44);
                }
            } else if (var28 == 8) {
                class295 var43 = class339.method1882((byte) 71, var29);
                if (var27.field2328 != var43.field4074 || var27.field2332 != var43.field4017 || var27.field2324 != var43.field4009) {
                    var43.field4017 = var27.field2332;
                    var43.field4074 = var27.field2328;
                    var43.field4009 = var27.field2324;
                    if (var43.field4072 != -1) {
                        if (var43.field3945 > 0) {
                            var43.field4009 = var43.field4009 * 32 / var43.field3945;
                        } else if (var43.field3964 > 0) {
                            var43.field4009 = var43.field4009 * 32 / var43.field3964;
                        }
                    }
                    class150.method952((byte) -72, var43);
                }
            } else if (var28 == 9) {
                class295 var36 = class339.method1882((byte) 112, var29);
                if (var27.field2328 != var36.field4072 || var27.field2332 != var36.field3981) {
                    var36.field4072 = var27.field2328;
                    var36.field3981 = var27.field2332;
                    class150.method952((byte) 114, var36);
                }
            } else if (var28 == 10) {
                class295 var42 = class339.method1882((byte) 78, var29);
                if (var27.field2328 != var42.field3937 || var27.field2332 != var42.field3946 || var27.field2324 != var42.field4058) {
                    var42.field3946 = var27.field2332;
                    var42.field4058 = var27.field2324;
                    var42.field3937 = var27.field2328;
                    class150.method952((byte) 100, var42);
                }
            } else if (var28 == 11) {
                class295 var37 = class339.method1882((byte) 87, var29);
                var37.field4003 = 0;
                var37.field4020 = 0;
                var37.field4063 = var37.field3934 = var27.field2328;
                var37.field3982 = var37.field3966 = var27.field2332;
                class150.method952((byte) -124, var37);
            } else if (var28 == 12) {
                class295 var40 = class339.method1882((byte) 80, var29);
                int var41 = var27.field2328;
                if (var40 != null && var40.field3984 == 0) {
                    if (var40.field4051 - var40.field3960 < var41) {
                        var41 = var40.field4051 - var40.field3960;
                    }
                    if (var41 < 0) {
                        var41 = 0;
                    }
                    if (var40.field3977 != var41) {
                        var40.field3977 = var41;
                        class150.method952((byte) 110, var40);
                    }
                }
            } else if (var28 == 14) {
                class295 var38 = class339.method1882((byte) 78, var29);
                var38.field4026 = var27.field2328;
            } else if (var28 == 15) {
                class473.field6909 = var27.field2332;
                class35.field489 = true;
                class285.field3824 = var27.field2328;
            } else if (var28 == 16) {
                class295 var39 = class339.method1882((byte) 126, var29);
                var39.field3959 = var27.field2328;
            }
        }
        class424.field6196++;
        if (class271.field3700 != 0) {
            class214.field3049 += 20;
            if (class214.field3049 >= 400) {
                class271.field3700 = 0;
            }
        }
        if (class175.field2501 != null) {
            class105.field1436++;
            if (class105.field1436 >= 15) {
                class150.method952((byte) -9, class175.field2501);
                class175.field2501 = null;
            }
        }
        class34.field488 = null;
        class452.field6524 = null;
        class23.field378 = false;
        class492.field7271 = false;
        class123.method812(-1, 0, -1, null);
        class247.method1457(-1, null, -1, (byte) -103);
        if (!class297.field4101) {
            class287.field3858 = -1;
        }
        class331.method1839(0);
        class234.field3240++;
        if (class530.field7807) {
            class356.method1978((byte) 73, class80.field1139);
            class247.field3437++;
            class244.field3395.method2085(class123.field1687 << 14 | class352.field4803 << 28 | class178.field2524, 9503);
            class530.field7807 = false;
        }
        while (true) {
            class44 var52;
            class295 var53;
            class295 var54;
            do {
                var52 = (class44) class103.field1409.method3071((byte) 31);
                if (var52 == null) {
                    while (true) {
                        class44 var55;
                        class295 var56;
                        class295 var57;
                        do {
                            var55 = (class44) class28.field422.method3071((byte) -116);
                            if (var55 == null) {
                                while (true) {
                                    class44 var58;
                                    class295 var59;
                                    class295 var60;
                                    do {
                                        var58 = (class44) class225.field3171.method3071((byte) -116);
                                        if (var58 == null) {
                                            if (class34.field488 == null) {
                                                class78.field1127 = 0;
                                            }
                                            if (class292.field3914 != null) {
                                                class385.method2209((byte) -46);
                                            }
                                            if (class370.field5196 > 0 && class488.field7125.method1212(-1, 82) && class488.field7125.method1212(-1, 81) && class530.field7810 != 0) {
                                                int var61 = class75.field1089.field464 - class530.field7810;
                                                if (var61 < 0) {
                                                    var61 = 0;
                                                } else if (var61 > 3) {
                                                    var61 = 3;
                                                }
                                                class362.method2006((byte) -74, class79.field1134 + class75.field1089.field362[0], class75.field1089.field372[0] + class215.field3059, var61);
                                            }
                                            class78.method574(106);
                                            for (int var62 = 0; var62 < 5; var62++) {
                                                int var10002 = class423.field6171[var62]++;
                                            }
                                            if (class354.field4824 && class159.field2286 < (class333.method1850(-3562) - 60000L)) {
                                                class477.method2805((byte) -104);
                                            }
                                            class384.field5404++;
                                            if (class384.field5404 > 500) {
                                                class384.field5404 = 0;
                                                int var63 = (int) (Math.random() * 8.0D);
                                                if ((var63 & 0x1) == 1) {
                                                    class42.field595 += class223.field3141;
                                                }
                                                if ((var63 & 0x2) == 2) {
                                                    class137.field1960 += class465.field6767;
                                                }
                                                if ((var63 & 0x4) == 4) {
                                                    class65.field893 += class191.field2667;
                                                }
                                            }
                                            if (class42.field595 < -50) {
                                                class223.field3141 = 2;
                                            }
                                            if (class137.field1960 < -55) {
                                                class465.field6767 = 2;
                                            }
                                            if (class42.field595 > 50) {
                                                class223.field3141 = -2;
                                            }
                                            if (class137.field1960 > 55) {
                                                class465.field6767 = -2;
                                            }
                                            if (class65.field893 < -40) {
                                                class191.field2667 = 1;
                                            }
                                            if (class65.field893 > 40) {
                                                class191.field2667 = -1;
                                            }
                                            class473.field6906++;
                                            if (class473.field6906 > 500) {
                                                class473.field6906 = 0;
                                                int var64 = (int) (Math.random() * 8.0D);
                                                if ((var64 & 0x1) == 1) {
                                                    class22.field349 += class402.field5588;
                                                }
                                                if ((var64 & 0x2) == 2) {
                                                    class482.field7072 += class239.field3279;
                                                }
                                            }
                                            if (class22.field349 < -60) {
                                                class402.field5588 = 2;
                                            }
                                            if (class22.field349 > 60) {
                                                class402.field5588 = -2;
                                            }
                                            if (class482.field7072 < -20) {
                                                class239.field3279 = 1;
                                            }
                                            if (class482.field7072 > 10) {
                                                class239.field3279 = -1;
                                            }
                                            class415.field6085++;
                                            if (class415.field6085 > 50) {
                                                class162.field2304++;
                                                class356.method1978((byte) 79, class226.field3178);
                                            }
                                            if (class424.field6187) {
                                                class504.method2962(13227);
                                                class424.field6187 = false;
                                            }
                                            try {
                                                if (class117.field1578 != null && class244.field3395.field5069 > 0) {
                                                    class88.field1207 += class244.field3395.field5069;
                                                    class117.field1578.method643(class244.field3395.field5073, class244.field3395.field5069, -1, 0);
                                                    class244.field3395.field5069 = 0;
                                                    class415.field6085 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var65) {
                                                class159.method982(-1);
                                                return;
                                            }
                                        }
                                        var59 = var58.field613;
                                        if (var59.field3936 < 0) {
                                            break;
                                        }
                                        var60 = class339.method1882((byte) 54, var59.field3988);
                                    } while (var60 == null || var60.field4050 == null || var59.field3936 >= var60.field4050.length || var60.field4050[var59.field3936] != var59);
                                    class475.method2798(var58);
                                }
                            }
                            var56 = var55.field613;
                            if (var56.field3936 < 0) {
                                break;
                            }
                            var57 = class339.method1882((byte) 79, var56.field3988);
                        } while (var57 == null || var57.field4050 == null || var56.field3936 >= var57.field4050.length || var57.field4050[var56.field3936] != var56);
                        class475.method2798(var55);
                    }
                }
                var53 = var52.field613;
                if (var53.field3936 < 0) {
                    break;
                }
                var54 = class339.method1882((byte) 112, var53.field3988);
            } while (var54 == null || var54.field4050 == null || var53.field3936 >= var54.field4050.length || var54.field4050[var53.field3936] != var53);
            class475.method2798(var52);
        }
    }

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "(I)I", line = 908)
    public final int method2577(int arg0) {
        if (arg0 == 127) {
            field6277++;
            return this.field6285;
        } else {
            return 103;
        }
    }

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "(Z)I", line = 921)
    public final int method2578(boolean arg0) {
        if (!arg0) {
            this.method2573(-8);
        }
        field6280++;
        return this.field6286;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(BILjava/util/Random;)I", line = 933)
    public static final int method2579(byte arg0, int arg1, Random arg2) {
        field6278++;
        int var3 = 75 % ((arg0 + 69) / 41);
        if (arg1 <= 0) {
            throw new IllegalArgumentException();
        } else if (class455.method2685(arg1, 20721)) {
            return (int) (((long) arg2.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
        } else {
            int var4 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
            int var5;
            do {
                var5 = arg2.nextInt();
            } while (var5 >= var4);
            return class289.method1652(var5, -127, arg1);
        }
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(B)V", line = 962)
    public static void method2580(byte arg0) {
        field6288 = null;
        int var1 = 62 % ((-arg0 - 2) / 33);
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(IIIIIF)V", line = 978)
    public class432(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        this.field6279 = arg1;
        this.field6284 = arg2;
        this.field6282 = arg3;
        this.field6287 = arg5;
        this.field6286 = arg0;
        this.field6285 = arg4;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(BF)V")
    public abstract void method1080(byte arg0, float arg1);

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(BIII)V")
    public abstract void method1079(byte arg0, int arg1, int arg2, int arg3);
}
