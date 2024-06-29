import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class275 extends class264 {

    @OriginalMember(owner = "client!dk", name = "Z", descriptor = "I")
    private int field4931 = 1024;

    @OriginalMember(owner = "client!dk", name = "U", descriptor = "I")
    private int field4926 = 2048;

    @OriginalMember(owner = "client!dk", name = "bb", descriptor = "I")
    private int field4933 = 3072;

    @OriginalMember(owner = "client!dk", name = "T", descriptor = "Lcf;")
    public static class93 field4925 = class147.method1066("brillant3:", -48);

    @OriginalMember(owner = "client!dk", name = "Q", descriptor = "Lcf;")
    public static class93 field4922 = class147.method1066("Ablegen", -48);

    @OriginalMember(owner = "client!dk", name = "L", descriptor = "Lcf;")
    private static class93 field4917 = class147.method1066("Loaded config", -48);

    @OriginalMember(owner = "client!dk", name = "V", descriptor = "Lcf;")
    public static class93 field4927 = field4917;

    @OriginalMember(owner = "client!dk", name = "P", descriptor = "I")
    public static int field4921 = 0;

    @OriginalMember(owner = "client!dk", name = "J", descriptor = "I")
    public static int field4915;

    @OriginalMember(owner = "client!dk", name = "K", descriptor = "I")
    public static int field4916;

    @OriginalMember(owner = "client!dk", name = "M", descriptor = "I")
    public static int field4918;

    @OriginalMember(owner = "client!dk", name = "N", descriptor = "I")
    public static int field4919;

    @OriginalMember(owner = "client!dk", name = "O", descriptor = "I")
    public static int field4920;

    @OriginalMember(owner = "client!dk", name = "R", descriptor = "I")
    public static int field4923;

    @OriginalMember(owner = "client!dk", name = "S", descriptor = "I")
    public static int field4924;

    @OriginalMember(owner = "client!dk", name = "W", descriptor = "I")
    public static int field4928;

    @OriginalMember(owner = "client!dk", name = "X", descriptor = "I")
    public static int field4929;

    @OriginalMember(owner = "client!dk", name = "Y", descriptor = "I")
    public static int field4930;

    @OriginalMember(owner = "client!dk", name = "ab", descriptor = "I")
    public static int field4932;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILtg;II)V")
    public static final void method1839(int arg0, class181 arg1, int arg2, int arg3) {
        ++field4919;
        if (arg1.field3314 == 1) {
            ++class159.field2806;
            class144.method1042((short) 8, 0L, -1, arg1.field3192, true, arg1.field3219, class178.field3144, 0);
        }
        if (arg1.field3314 == 2 && !class263.field4695) {
            class93 var4 = class252.method1710(arg1, 86);
            if (var4 != null) {
                class144.method1042((short) 19, 0L, -1, var4, true, arg1.field3219, class130.method949((byte) -77, new class93[] { class167.field2941, arg1.field3265 }), -1);
                ++class186.field3430;
            }
        }
        if (~arg1.field3314 == -4) {
            ++class247.field4443;
            class144.method1042((short) 17, 0L, -1, class66.field1218, true, arg1.field3219, class178.field3144, 0);
        }
        if (arg1.field3314 == 4) {
            ++class52.field855;
            class144.method1042((short) 20, 0L, -1, arg1.field3192, true, arg1.field3219, class178.field3144, 0);
        }
        if (arg1.field3314 == 5) {
            class144.method1042((short) 1, 0L, -1, arg1.field3192, true, arg1.field3219, class178.field3144, 0);
            ++class141.field2452;
        }
        if (arg1.field3314 == 6 && class139.field2410 == null) {
            class144.method1042((short) 59, 0L, -1, arg1.field3192, true, arg1.field3219, class178.field3144, -1);
            ++class224.field4027;
        }
        if (arg2 == 26914) {
            if (arg1.field3289 == 2) {
                int var5 = 0;
                for (int var6 = 0; arg1.field3210 > var6; ++var6) {
                    for (int var7 = 0; ~arg1.field3277 < ~var7; ++var7) {
                        int var8 = (arg1.field3303 + 32) * var7;
                        int var9 = (arg1.field3331 + 32) * var6;
                        if (var5 < 20) {
                            var8 += arg1.field3266[var5];
                            var9 += arg1.field3233[var5];
                        }
                        if (~arg0 <= ~var8 && ~var9 >= ~arg3 && ~arg0 > ~(var8 + 32) && var9 + 32 > arg3) {
                            class196.field3591 = var5;
                            class121.field2141 = arg1;
                            if (~arg1.field3301[var5] < -1) {
                                class200 var10 = client.method1109(arg1);
                                class29 var11 = class89.method617(arg1.field3301[var5] + -1, 0);
                                if (class268.field4769 == 1 && var10.method1438(116)) {
                                    if (~class217.field3946 != ~arg1.field3219 || class76.field1413 != var5) {
                                        ++class52.field854;
                                        class144.method1042((short) 38, (long) var11.field385, -1, class156.field2768, true, arg1.field3219, class130.method949((byte) -77, new class93[] { class97.field1738, class218.field3965, var11.field357 }), var5);
                                    }
                                } else if (class263.field4695 && var10.method1438(112)) {
                                    class131 var12 = ~class7.field102 == 0 ? null : class30.method176(arg2 + -19659, class7.field102);
                                    if (~(16 & class210.field3799) != -1 && (var12 == null || ~var11.method161(0, var12.field2320, class7.field102) != ~var12.field2320)) {
                                        ++class39.field610;
                                        class144.method1042((short) 6, (long) var11.field385, class54.field888, class153.field2683, true, arg1.field3219, class130.method949((byte) -77, new class93[] { class66.field1206, class218.field3965, var11.field357 }), var5);
                                    }
                                } else {
                                    ++class40.field617;
                                    class93[] var13 = var11.field438;
                                    if (class168.field2959) {
                                        var13 = class157.method1123(var13, true);
                                    }
                                    if (var10.method1438(111)) {
                                        for (int var14 = 4; ~var14 <= -4; --var14) {
                                            if (var13 != null && var13[var14] != null) {
                                                byte var15;
                                                if (var14 != 3) {
                                                    var15 = 46;
                                                } else {
                                                    var15 = 14;
                                                }
                                                class144.method1042(var15, (long) var11.field385, -1, var13[var14], true, arg1.field3219, class130.method949((byte) -77, new class93[] { class139.field2414, var11.field357 }), var5);
                                                ++class104.field1803;
                                            }
                                        }
                                    }
                                    if (var10.method1433(-28199)) {
                                        ++class175.field3042;
                                        class144.method1042((short) 18, (long) var11.field385, class220.field3994, class156.field2768, true, arg1.field3219, class130.method949((byte) -77, new class93[] { class139.field2414, var11.field357 }), var5);
                                    }
                                    if (var10.method1438(127) && var13 != null) {
                                        for (int var16 = 2; var16 >= 0; --var16) {
                                            if (var13[var16] != null) {
                                                byte var17 = 0;
                                                ++class47.field757;
                                                if (~var16 == -1) {
                                                    var17 = 33;
                                                }
                                                if (var16 == 1) {
                                                    var17 = 10;
                                                }
                                                if (var16 == 2) {
                                                    var17 = 40;
                                                }
                                                class144.method1042(var17, (long) var11.field385, -1, var13[var16], true, arg1.field3219, class130.method949((byte) -77, new class93[] { class139.field2414, var11.field357 }), var5);
                                            }
                                        }
                                    }
                                    class93[] var18 = arg1.field3220;
                                    if (class168.field2959) {
                                        var18 = class157.method1123(var18, true);
                                    }
                                    if (var18 != null) {
                                        for (int var19 = 4; var19 >= 0; --var19) {
                                            if (var18[var19] != null) {
                                                ++class102.field1791;
                                                byte var20 = 0;
                                                if (~var19 == -1) {
                                                    var20 = 11;
                                                }
                                                if (var19 == 1) {
                                                    var20 = 28;
                                                }
                                                if (var19 == 2) {
                                                    var20 = 43;
                                                }
                                                if (var19 == 3) {
                                                    var20 = 4;
                                                }
                                                if (var19 == 4) {
                                                    var20 = 34;
                                                }
                                                class144.method1042(var20, (long) var11.field385, -1, var18[var19], true, arg1.field3219, class130.method949((byte) -77, new class93[] { class139.field2414, var11.field357 }), var5);
                                            }
                                        }
                                    }
                                    class144.method1042((short) 1002, (long) var11.field385, class126.field2237, class266.field4735, true, arg1.field3219, class130.method949((byte) -77, new class93[] { class139.field2414, var11.field357 }), var5);
                                }
                            }
                        }
                        ++var5;
                    }
                }
            }
            if (arg1.field3307) {
                if (class263.field4695) {
                    if (client.method1109(arg1).method1441(-1500906954) && (class210.field3799 & 32) != 0) {
                        class144.method1042((short) 58, 0L, class54.field888, class153.field2683, true, arg1.field3219, class130.method949((byte) -77, new class93[] { class66.field1206, class29.field386, arg1.field3274 }), arg1.field3293);
                        ++class204.field3672;
                        return;
                    }
                } else {
                    for (int var21 = 9; ~var21 <= -6; --var21) {
                        class93 var25 = class55.method307(var21, (byte) -20, arg1);
                        if (var25 != null) {
                            ++class56.field936;
                            class144.method1042((short) 1007, (long) (var21 + 1), class63.method405((byte) 31, var21, arg1), var25, true, arg1.field3219, arg1.field3274, arg1.field3293);
                        }
                    }
                    class93 var22 = class252.method1710(arg1, -79);
                    if (var22 != null) {
                        ++class186.field3430;
                        class144.method1042((short) 19, 0L, -1, var22, true, arg1.field3219, arg1.field3274, arg1.field3293);
                    }
                    for (int var23 = 4; var23 >= 0; --var23) {
                        class93 var24 = class55.method307(var23, (byte) -20, arg1);
                        if (var24 != null) {
                            ++class56.field936;
                            class144.method1042((short) 37, (long) (var23 + 1), class63.method405((byte) 125, var23, arg1), var24, true, arg1.field3219, arg1.field3274, arg1.field3293);
                        }
                    }
                    if (!client.method1109(arg1).method1432(1)) {
                        return;
                    }
                    class144.method1042((short) 59, 0L, -1, class35.field541, true, arg1.field3219, class178.field3144, arg1.field3293);
                    ++class224.field4027;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IB)[I")
    public final int[] method22(int arg0, byte arg1) {
        if (arg1 > -83) {
            method1841(55, -11, 108, (class177) null);
        }
        int[] var3 = super.field4716.method532((byte) 99, arg0);
        if (super.field4716.field1424) {
            int[] var4 = this.method1767(0, arg0, 21654);
            for (int var5 = 0; ~var5 > ~class176.field3060; ++var5) {
                var3[var5] = (var4[var5] * this.field4926 >> 12) + this.field4931;
            }
        }
        ++field4920;
        return var3;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method17(int arg0, boolean arg1) {
        int[][] var3 = super.field4705.method1089(arg0, 112);
        ++field4916;
        if (super.field4705.field2670) {
            int[][] var4 = this.method1773(-124, 0, arg0);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class176.field3060; ++var11) {
                var8[var11] = (var6[var11] * this.field4926 >> 12) + this.field4931;
                var9[var11] = (var5[var11] * this.field4926 >> 12) + this.field4931;
                var10[var11] = this.field4931 - -(var7[var11] * this.field4926 >> 12);
            }
        }
        if (arg1) {
            method1840(true);
        }
        return var3;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Z)V")
    public static final void method1840(boolean arg0) {
        class268.field4786 = null;
        ++field4923;
        class266.method1775(0, class69.field1262, class150.field2629, 0, -1, 0, 0, class169.field2968, -1);
        if (!arg0) {
            method1844(25, -41);
        }
        if (class268.field4786 != null) {
            class111.method796(0, class268.field4786, 0, class55.field909, -1412584499, class169.field2968, class150.field2629, 21175, class29.field402, class1.field8.field3238);
            class268.field4786 = null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIILhg;)[Lnf;")
    public static final class158[] method1841(int arg0, int arg1, int arg2, class177 arg3) {
        ++field4932;
        int var4 = 109 / ((-24 - arg1) / 45);
        return !class149.method1074(arg0, arg3, 16597, arg2) ? null : class268.method1791(0);
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(II)V")
    public static final void method1842(int arg0, int arg1) {
        ++field4915;
        if (~arg0 <= -1) {
            int var2 = class38.field586[arg0];
            int var3 = class168.field2963[arg0];
            int var4 = class216.field3942[arg0];
            if (~var4 <= -2001) {
                var4 -= 2000;
            }
            int var5 = (int) class73.field1319[arg0];
            long var6 = class73.field1319[arg0];
            if (~var4 == -8) {
                ++class141.field2447;
                class42.method240(var2, var6, true, var3);
                class285.field5105.method1568(98, (byte) 79);
                class285.field5105.method1904(class229.field4111 + var2, true);
                class285.field5105.method1908(-79, Integer.MAX_VALUE & (int) (var6 >>> 32));
                class285.field5105.method1927(-1356247032, class4.field52 + var3);
            }
            if (~var4 == -48) {
                class227 var8 = class155.field2709[var5];
                if (var8 != null) {
                    class171.method1228(2, false, 53, 0, 1, var8.field3820[0], class166.field2927.field3805[0], 1, 0, 0, class166.field2927.field3820[0], var8.field3805[0]);
                    ++class1.field12;
                    class129.field2270 = 2;
                    class149.field2618 = 0;
                    class60.field1022 = class193.field3527;
                    class31.field497 = class58.field992;
                    class285.field5105.method1568(120, (byte) 107);
                    class285.field5105.method1892(class268.field4782, (byte) 120);
                    class285.field5105.method1886(class217.field3946, 2);
                    class285.field5105.method1892(class76.field1413, (byte) 119);
                    class285.field5105.method1908(arg1 ^ -17305, var5);
                }
            }
            if (var4 == 24) {
                if (class78.field1460 == 1) {
                    class171.method1228(2, false, arg1 + -17512, 0, 1, var3, class166.field2927.field3805[0], 1, 0, 0, class166.field2927.field3820[0], var2);
                } else {
                    boolean var9 = class171.method1228(2, false, arg1 ^ 17288, 0, 0, var3, class166.field2927.field3805[0], 0, 0, 0, class166.field2927.field3820[0], var2);
                    if (!var9) {
                        class171.method1228(2, false, 127, 0, 1, var3, class166.field2927.field3805[0], 1, 0, 0, class166.field2927.field3820[0], var2);
                    }
                }
                class149.field2618 = 0;
                ++class182.field3366;
                class60.field1022 = class193.field3527;
                class129.field2270 = 2;
                class31.field497 = class58.field992;
                class285.field5105.method1568(175, (byte) 90);
                class285.field5105.method1892(var5, (byte) 121);
                class285.field5105.method1927(arg1 + -1356264436, class4.field52 + var3);
                class285.field5105.method1904(class229.field4111 + var2, true);
            }
            if (~var4 == -30) {
                class237 var11 = class224.field4031[var5];
                if (var11 != null) {
                    ++class74.field1369;
                    class171.method1228(2, false, arg1 + -17504, 0, 1, var11.field3820[0], class166.field2927.field3805[0], 1, 0, 0, class166.field2927.field3820[0], var11.field3805[0]);
                    class31.field497 = class58.field992;
                    class60.field1022 = class193.field3527;
                    class149.field2618 = 0;
                    class129.field2270 = 2;
                    class285.field5105.method1568(123, (byte) 120);
                    class285.field5105.method1904(var5, true);
                }
            }
            if (~var4 == -1003) {
                class181 var12 = client.method1114(arg1 ^ -4613, var3);
                if (var12 != null && var12.field3304[var2] >= 100000) {
                    class263.method1764(0, (byte) -116, class178.field3144, class130.method949((byte) -77, new class93[] { class148.method1067(-7015, var12.field3304[var2]), class76.field1426, class89.method617(var5, 0).field357 }));
                } else {
                    ++class234.field4160;
                    class285.field5105.method1568(22, (byte) 72);
                    class285.field5105.method1904(var5, true);
                }
                class37.field561 = 0;
                class218.field3980 = client.method1114(arg1 + -38389, var3);
                class5.field76 = var2;
            }
            if (var4 == 39) {
                class227 var13 = class155.field2709[var5];
                if (var13 != null) {
                    ++class252.field4530;
                    class171.method1228(2, false, arg1 ^ -17374, 0, 1, var13.field3820[0], class166.field2927.field3805[0], 1, 0, 0, class166.field2927.field3820[0], var13.field3805[0]);
                    class60.field1022 = class193.field3527;
                    class129.field2270 = 2;
                    class31.field497 = class58.field992;
                    class149.field2618 = 0;
                    class285.field5105.method1568(158, (byte) 127);
                    class285.field5105.method1908(-114, var5);
                }
            }
            if (arg1 != 17404) {
                method1843((byte) 78);
            }
            if (~var4 == -7) {
                ++class162.field2862;
                class285.field5105.method1568(41, (byte) 75);
                class285.field5105.method1927(arg1 ^ -1356262412, var5);
                class285.field5105.method1885(2, var3);
                class285.field5105.method1886(class16.field229, 2);
                class285.field5105.method1927(-1356247032, var2);
                class285.field5105.method1927(-1356247032, class255.field4611);
                class37.field561 = 0;
                class218.field3980 = client.method1114(-20985, var3);
                class5.field76 = var2;
            }
            if (var4 == 20) {
                ++class287.field5137;
                class285.field5105.method1568(139, (byte) 52);
                class285.field5105.method1886(var3, 2);
                class181 var14 = client.method1114(-20985, var3);
                if (var14.field3313 != null && var14.field3313[0][0] == 5) {
                    int var15 = var14.field3313[0][1];
                    class176.field3061[var15] = 1 - class176.field3061[var15];
                    class53.method292(var15, 97);
                }
            }
            if (var4 == 38) {
                ++class123.field2193;
                class285.field5105.method1568(164, (byte) 58);
                class285.field5105.method1927(-1356247032, var2);
                class285.field5105.method1904(var5, true);
                class285.field5105.method1886(var3, 2);
                class285.field5105.method1892(class76.field1413, (byte) 125);
                class285.field5105.method1886(class217.field3946, arg1 + -17402);
                class285.field5105.method1904(class268.field4782, true);
                class37.field561 = 0;
                class218.field3980 = client.method1114(-20985, var3);
                class5.field76 = var2;
            }
            if (var4 == 8) {
                class181 var16 = client.method1114(arg1 ^ -4613, var3);
                boolean var17 = true;
                if (~var16.field3218 < -1) {
                    var17 = class266.method1776(var16, (byte) -89);
                }
                if (var17) {
                    ++class287.field5137;
                    class285.field5105.method1568(139, (byte) 117);
                    class285.field5105.method1886(var3, 2);
                }
            }
            if (~var4 == -3) {
                if (class78.field1460 == 1) {
                    class171.method1228(2, false, arg1 + -17303, 0, 1, var3, class166.field2927.field3805[0], 1, 0, 0, class166.field2927.field3820[0], var2);
                } else {
                    boolean var18 = class171.method1228(2, false, 42, 0, 0, var3, class166.field2927.field3805[0], 0, 0, 0, class166.field2927.field3820[0], var2);
                    if (!var18) {
                        class171.method1228(2, false, arg1 ^ -17294, 0, 1, var3, class166.field2927.field3805[0], 1, 0, 0, class166.field2927.field3820[0], var2);
                    }
                }
                class60.field1022 = class193.field3527;
                class129.field2270 = 2;
                ++class156.field2753;
                class149.field2618 = 0;
                class31.field497 = class58.field992;
                class285.field5105.method1568(174, (byte) 110);
                class285.field5105.method1892(var5, (byte) 126);
                class285.field5105.method1927(arg1 + -1356264436, class4.field52 + var3);
                class285.field5105.method1908(arg1 + -17514, class229.field4111 + var2);
            }
            if (var4 == 17) {
                class246.method1678(0);
            }
            if (var4 == 36 && class42.method240(var2, var6, true, var3)) {
                class285.field5105.method1568(95, (byte) 62);
                class285.field5105.method1904(class4.field52 + var3, true);
                class285.field5105.method1886(class217.field3946, 2);
                ++class156.field2749;
                class285.field5105.method1904(class268.field4782, true);
                class285.field5105.method1904(class76.field1413, true);
                class285.field5105.method1908(-94, class229.field4111 + var2);
                class285.field5105.method1904((int) (var6 >>> 32) & Integer.MAX_VALUE, true);
            }
            if (var4 == 28) {
                class285.field5105.method1568(235, (byte) 101);
                class285.field5105.method1892(var2, (byte) 125);
                ++class7.field101;
                class285.field5105.method1904(var5, true);
                class285.field5105.method1903(true, var3);
                class37.field561 = 0;
                class218.field3980 = client.method1114(-20985, var3);
                class5.field76 = var2;
            }
            if (~var4 == -41) {
                ++class47.field753;
                class285.field5105.method1568(243, (byte) 102);
                class285.field5105.method1904(var5, true);
                class285.field5105.method1892(var2, (byte) 124);
                class285.field5105.method1903(true, var3);
                class37.field561 = 0;
                class218.field3980 = client.method1114(-20985, var3);
                class5.field76 = var2;
            }
            if (var4 == 44) {
                class227 var20 = class155.field2709[var5];
                if (var20 != null) {
                    ++class109.field1859;
                    class171.method1228(2, false, -117, 0, 1, var20.field3820[0], class166.field2927.field3805[0], 1, 0, 0, class166.field2927.field3820[0], var20.field3805[0]);
                    class60.field1022 = class193.field3527;
                    class149.field2618 = 0;
                    class31.field497 = class58.field992;
                    class129.field2270 = 2;
                    class285.field5105.method1568(20, (byte) 87);
                    class285.field5105.method1908(-82, class255.field4611);
                    class285.field5105.method1927(-1356247032, var5);
                    class285.field5105.method1906(1304783144, class16.field229);
                }
            }
            if (~var4 == -33) {
                ++class259.field4667;
                class42.method240(var2, var6, true, var3);
                class285.field5105.method1568(173, (byte) 55);
                class285.field5105.method1904(class4.field52 + var3, true);
                class285.field5105.method1927(-1356247032, var2 - -class229.field4111);
                class285.field5105.method1908(-120, Integer.MAX_VALUE & (int) (var6 >>> 32));
            }
            if (var4 == 49) {
                class237 var21 = class224.field4031[var5];
                if (var21 != null) {
                    class171.method1228(2, false, 90, 0, 1, var21.field3820[0], class166.field2927.field3805[0], 1, 0, 0, class166.field2927.field3820[0], var21.field3805[0]);
                    class31.field497 = class58.field992;
                    class129.field2270 = 2;
                    class149.field2618 = 0;
                    class60.field1022 = class193.field3527;
                    ++class138.field2404;
                    class285.field5105.method1568(140, (byte) 82);
                    class285.field5105.method1908(-93, var5);
                }
            }
            if (var4 == 1003) {
                class42.method240(var2, var6, true, var3);
                ++class222.field4001;
                class285.field5105.method1568(234, (byte) 101);
                class285.field5105.method1904(class229.field4111 + var2, true);
                class285.field5105.method1892(var3 - -class4.field52, (byte) 120);
                class285.field5105.method1908(-85, Integer.MAX_VALUE & (int) (var6 >>> 32));
            }
            if (var4 == 30) {
                class227 var22 = class155.field2709[var5];
                if (var22 != null) {
                    class171.method1228(2, false, arg1 + -17498, 0, 1, var22.field3820[0], class166.field2927.field3805[0], 1, 0, 0, class166.field2927.field3820[0], var22.field3805[0]);
                    class60.field1022 = class193.field3527;
                    class31.field497 = class58.field992;
                    ++class205.field3696;
                    class149.field2618 = 0;
                    class129.field2270 = 2;
                    class285.field5105.method1568(203, (byte) 124);
                    class285.field5105.method1908(arg1 ^ -17286, var5);
                }
            }
            if (var4 == 37 || var4 == 1007) {
                class282.method1936(var2, -1, var3, class86.field1553[arg0], var5);
            }
            if (var4 == 60) {
                class227 var23 = class155.field2709[var5];
                if (var23 != null) {
                    class171.method1228(2, false, 88, 0, 1, var23.field3820[0], class166.field2927.field3805[0], 1, 0, 0, class166.field2927.field3820[0], var23.field3805[0]);
                    ++class174.field3037;
                    class31.field497 = class58.field992;
                    class149.field2618 = 0;
                    class60.field1022 = class193.field3527;
                    class129.field2270 = 2;
                    class285.field5105.method1568(52, (byte) 106);
                    class285.field5105.method1892(var5, (byte) 127);
                }
            }
            if (~var4 == -5) {
                class285.field5105.method1568(189, (byte) 108);
                class285.field5105.method1904(var5, true);
                ++class51.field836;
                class285.field5105.method1927(-1356247032, var2);
                class285.field5105.method1886(var3, 2);
                class37.field561 = 0;
                class218.field3980 = client.method1114(-20985, var3);
                class5.field76 = var2;
            }
            if (var4 == 23) {
                class237 var24 = class224.field4031[var5];
                if (var24 != null) {
                    ++class108.field1850;
                    class171.method1228(2, false, arg1 + -17531, 0, 1, var24.field3820[0], class166.field2927.field3805[0], 1, 0, 0, class166.field2927.field3820[0], var24.field3805[0]);
                    class60.field1022 = class193.field3527;
                    class149.field2618 = 0;
                    class31.field497 = class58.field992;
                    class129.field2270 = 2;
                    class285.field5105.method1568(220, (byte) 61);
                    class285.field5105.method1927(arg1 ^ -1356262412, var5);
                }
            }
            if (~var4 == -19) {
                class117.method869(64);
                class181 var25 = client.method1114(-20985, var3);
                class76.field1413 = var2;
                class268.field4769 = 1;
                class217.field3946 = var3;
                class268.field4782 = var5;
                class254.method1731(var25, (byte) -108);
                class97.field1738 = class130.method949((byte) -77, new class93[] { class139.field2414, class89.method617(var5, arg1 ^ 17404).field357, class83.field1525 });
                if (class97.field1738 == null) {
                    class97.field1738 = class167.field2937;
                }
            } else {
                if (var4 == 51) {
                    class237 var26 = class224.field4031[var5];
                    if (var26 != null) {
                        ++class224.field4037;
                        class171.method1228(2, false, 81, 0, 1, var26.field3820[0], class166.field2927.field3805[0], 1, 0, 0, class166.field2927.field3820[0], var26.field3805[0]);
                        class31.field497 = class58.field992;
                        class149.field2618 = 0;
                        class129.field2270 = 2;
                        class60.field1022 = class193.field3527;
                        class285.field5105.method1568(57, (byte) 50);
                        class285.field5105.method1927(arg1 + -1356264436, var5);
                    }
                }
                if (var4 == 14) {
                    ++class11.field138;
                    class285.field5105.method1568(89, (byte) 93);
                    class285.field5105.method1908(-125, var2);
                    class285.field5105.method1908(-112, var5);
                    class285.field5105.method1886(var3, 2);
                    class37.field561 = 0;
                    class218.field3980 = client.method1114(-20985, var3);
                    class5.field76 = var2;
                }
                if (~var4 == -27) {
                    if (var5 != 0) {
                        if (class285.field5109 > 0 && class176.field3048[82] && class176.field3048[81]) {
                            class61.method381(class138.field2405, class229.field4111 + var2, (byte) 73, class4.field52 - -var3);
                        } else {
                            class285.field5105.method1568(12, (byte) 64);
                            class285.field5105.method1908(-114, class4.field52 + var3);
                            ++class82.field1503;
                            class285.field5105.method1892(class229.field4111 + var2, (byte) 127);
                        }
                    } else {
                        class46.field747 = 1;
                        class241.method1646(class138.field2405, var2, var3);
                    }
                }
                if (var4 == 12) {
                    ++class63.field1145;
                    boolean var27 = class171.method1228(2, false, 111, 0, 0, var3, class166.field2927.field3805[0], 0, 0, 0, class166.field2927.field3820[0], var2);
                    if (!var27) {
                        class171.method1228(2, false, arg1 ^ 17313, 0, 1, var3, class166.field2927.field3805[0], 1, 0, 0, class166.field2927.field3820[0], var2);
                    }
                    class129.field2270 = 2;
                    class31.field497 = class58.field992;
                    class149.field2618 = 0;
                    class60.field1022 = class193.field3527;
                    class285.field5105.method1568(33, (byte) 124);
                    class285.field5105.method1904(var2 - -class229.field4111, true);
                    class285.field5105.method1908(-110, var5);
                    class285.field5105.method1927(-1356247032, class4.field52 + var3);
                    class285.field5105.method1904(class268.field4782, true);
                    class285.field5105.method1927(arg1 ^ -1356262412, class76.field1413);
                    class285.field5105.method1885(2, class217.field3946);
                }
                if (var4 == 13) {
                    ++class157.field2788;
                    class42.method240(var2, var6, true, var3);
                    class285.field5105.method1568(2, (byte) 120);
                    class285.field5105.method1892(class229.field4111 + var2, (byte) 121);
                    class285.field5105.method1908(arg1 + -17487, class4.field52 + var3);
                    class285.field5105.method1927(-1356247032, (int) (var6 >>> 32) & Integer.MAX_VALUE);
                }
                if (~var4 == -17) {
                    ++class83.field1521;
                    if (class78.field1460 != 1) {
                        boolean var29 = class171.method1228(2, false, -82, 0, 0, var3, class166.field2927.field3805[0], 0, 0, 0, class166.field2927.field3820[0], var2);
                        if (!var29) {
                            class171.method1228(2, false, 89, 0, 1, var3, class166.field2927.field3805[0], 1, 0, 0, class166.field2927.field3820[0], var2);
                        }
                    } else {
                        class171.method1228(2, false, -69, 0, 1, var3, class166.field2927.field3805[0], 1, 0, 0, class166.field2927.field3820[0], var2);
                    }
                    class60.field1022 = class193.field3527;
                    class31.field497 = class58.field992;
                    class149.field2618 = 0;
                    class129.field2270 = 2;
                    class285.field5105.method1568(115, (byte) 111);
                    class285.field5105.method1892(class4.field52 + var3, (byte) 122);
                    class285.field5105.method1908(-96, var5);
                    class285.field5105.method1892(var2 - -class229.field4111, (byte) 123);
                }
                if (var4 == 58) {
                    class285.field5105.method1568(252, (byte) 85);
                    class285.field5105.method1886(var3, arg1 ^ 17406);
                    ++class189.field3467;
                    class285.field5105.method1906(1304783144, class16.field229);
                    class285.field5105.method1892(class255.field4611, (byte) 127);
                    class285.field5105.method1927(arg1 ^ -1356262412, var2);
                }
                if (~var4 == -43) {
                    if (~var5 != -1) {
                        if (var5 == 1) {
                            if (class285.field5109 > 0 && class176.field3048[82] && class176.field3048[81]) {
                                class61.method381(class138.field2405, class229.field4111 + var2, (byte) 43, class4.field52 - -var3);
                            } else if (class171.method1228(1, true, arg1 + -17442, 0, 0, var3, class166.field2927.field3805[0], 0, 0, 0, class166.field2927.field3820[0], var2)) {
                                class285.field5105.method1916(class216.field3938, 73);
                                class285.field5105.method1916(class131.field2327, 93);
                                class285.field5105.method1908(arg1 + -17498, class50.field825);
                                class285.field5105.method1916(57, 105);
                                class285.field5105.method1916(class95.field1719, 90);
                                class285.field5105.method1916(class248.field4458, 81);
                                class285.field5105.method1916(89, 75);
                                class285.field5105.method1908(-111, class166.field2927.field3868);
                                class285.field5105.method1908(-96, class166.field2927.field3784);
                                class285.field5105.method1916(class147.field2587, arg1 ^ 17288);
                                class285.field5105.method1916(63, 122);
                            }
                        }
                    } else {
                        class241.method1646(class138.field2405, var2, var3);
                    }
                }
                if (~var4 == -26) {
                    ++class276.field4944;
                    if (~class78.field1460 == -2) {
                        class171.method1228(2, false, -114, 0, 1, var3, class166.field2927.field3805[0], 1, 0, 0, class166.field2927.field3820[0], var2);
                    } else {
                        boolean var31 = class171.method1228(2, false, arg1 + -17458, 0, 0, var3, class166.field2927.field3805[0], 0, 0, 0, class166.field2927.field3820[0], var2);
                        if (!var31) {
                            class171.method1228(2, false, 43, 0, 1, var3, class166.field2927.field3805[0], 1, 0, 0, class166.field2927.field3820[0], var2);
                        }
                    }
                    class129.field2270 = 2;
                    class60.field1022 = class193.field3527;
                    class31.field497 = class58.field992;
                    class149.field2618 = 0;
                    class285.field5105.method1568(107, (byte) 58);
                    class285.field5105.method1908(arg1 + -17515, var5);
                    class285.field5105.method1892(var2 - -class229.field4111, (byte) 127);
                    class285.field5105.method1908(arg1 + -17500, class4.field52 + var3);
                }
                if (var4 == 1004) {
                    class60.field1022 = class193.field3527;
                    class129.field2270 = 2;
                    class149.field2618 = 0;
                    ++class72.field1294;
                    class31.field497 = class58.field992;
                    class285.field5105.method1568(161, (byte) 108);
                    class285.field5105.method1927(-1356247032, var5);
                }
                if (var4 == 46) {
                    class285.field5105.method1568(1, (byte) 71);
                    class285.field5105.method1886(var3, arg1 + -17402);
                    ++class252.field4535;
                    class285.field5105.method1904(var2, true);
                    class285.field5105.method1892(var5, (byte) 121);
                    class37.field561 = 0;
                    class218.field3980 = client.method1114(-20985, var3);
                    class5.field76 = var2;
                }
                if (var4 == 22) {
                    ++class25.field323;
                    class42.method240(var2, var6, true, var3);
                    class285.field5105.method1568(206, (byte) 97);
                    class285.field5105.method1927(-1356247032, class229.field4111 + var2);
                    class285.field5105.method1904((int) (var6 >>> 32) & Integer.MAX_VALUE, true);
                    class285.field5105.method1908(arg1 ^ -17285, class4.field52 + var3);
                }
                if (~var4 == -16) {
                    ++class40.field619;
                    boolean var33 = class171.method1228(2, false, -111, 0, 0, var3, class166.field2927.field3805[0], 0, 0, 0, class166.field2927.field3820[0], var2);
                    if (!var33) {
                        class171.method1228(2, false, arg1 ^ 17331, 0, 1, var3, class166.field2927.field3805[0], 1, 0, 0, class166.field2927.field3820[0], var2);
                    }
                    class149.field2618 = 0;
                    class31.field497 = class58.field992;
                    class129.field2270 = 2;
                    class60.field1022 = class193.field3527;
                    class285.field5105.method1568(128, (byte) 122);
                    class285.field5105.method1892(var2 - -class229.field4111, (byte) 122);
                    class285.field5105.method1927(-1356247032, var3 - -class4.field52);
                    class285.field5105.method1892(var5, (byte) 122);
                    class285.field5105.method1885(2, class16.field229);
                    class285.field5105.method1904(class255.field4611, true);
                }
                if (var4 == 43) {
                    class285.field5105.method1568(124, (byte) 114);
                    ++class7.field99;
                    class285.field5105.method1906(1304783144, var3);
                    class285.field5105.method1927(-1356247032, var5);
                    class285.field5105.method1892(var2, (byte) 126);
                    class37.field561 = 0;
                    class218.field3980 = client.method1114(-20985, var3);
                    class5.field76 = var2;
                }
                if (~var4 == -60 && class139.field2410 == null) {
                    class165.method1199(63, var2, var3);
                    class139.field2410 = class5.method21(var3, var2, (byte) 40);
                    class254.method1731(class139.field2410, (byte) 55);
                }
                if (var4 == 35) {
                    class227 var35 = class155.field2709[var5];
                    if (var35 != null) {
                        class171.method1228(2, false, 65, 0, 1, var35.field3820[0], class166.field2927.field3805[0], 1, 0, 0, class166.field2927.field3820[0], var35.field3805[0]);
                        ++class52.field857;
                        class31.field497 = class58.field992;
                        class60.field1022 = class193.field3527;
                        class149.field2618 = 0;
                        class129.field2270 = 2;
                        class285.field5105.method1568(10, (byte) 107);
                        class285.field5105.method1908(-78, var5);
                    }
                }
                if (var4 == 21) {
                    class227 var36 = class155.field2709[var5];
                    if (var36 != null) {
                        class171.method1228(2, false, arg1 ^ 17315, 0, 1, var36.field3820[0], class166.field2927.field3805[0], 1, 0, 0, class166.field2927.field3820[0], var36.field3805[0]);
                        class60.field1022 = class193.field3527;
                        class129.field2270 = 2;
                        ++class129.field2279;
                        class31.field497 = class58.field992;
                        class149.field2618 = 0;
                        class285.field5105.method1568(8, (byte) 125);
                        class285.field5105.method1904(var5, true);
                    }
                }
                if (~var4 == -11) {
                    class285.field5105.method1568(195, (byte) 108);
                    ++class71.field1289;
                    class285.field5105.method1908(-112, var5);
                    class285.field5105.method1906(arg1 + 1304765740, var3);
                    class285.field5105.method1904(var2, true);
                    class37.field561 = 0;
                    class218.field3980 = client.method1114(-20985, var3);
                    class5.field76 = var2;
                }
                if (~var4 == -34) {
                    class285.field5105.method1568(244, (byte) 75);
                    class285.field5105.method1927(-1356247032, var5);
                    ++class19.field261;
                    class285.field5105.method1927(arg1 + -1356264436, var2);
                    class285.field5105.method1885(arg1 ^ 17406, var3);
                    class37.field561 = 0;
                    class218.field3980 = client.method1114(-20985, var3);
                    class5.field76 = var2;
                }
                if (var4 == 1006) {
                    class149.field2618 = 0;
                    ++class234.field4160;
                    class31.field497 = class58.field992;
                    class129.field2270 = 2;
                    class60.field1022 = class193.field3527;
                    class285.field5105.method1568(22, (byte) 77);
                    class285.field5105.method1904(var5, true);
                }
                if (~var4 == -51) {
                    class237 var37 = class224.field4031[var5];
                    if (var37 != null) {
                        ++class139.field2411;
                        class171.method1228(2, false, -109, 0, 1, var37.field3820[0], class166.field2927.field3805[0], 1, 0, 0, class166.field2927.field3820[0], var37.field3805[0]);
                        class149.field2618 = 0;
                        class60.field1022 = class193.field3527;
                        class31.field497 = class58.field992;
                        class129.field2270 = 2;
                        class285.field5105.method1568(88, (byte) 82);
                        class285.field5105.method1904(var5, true);
                    }
                }
                if (var4 == 5 && class42.method240(var2, var6, true, var3)) {
                    ++class250.field4502;
                    class285.field5105.method1568(233, (byte) 85);
                    class285.field5105.method1892(class255.field4611, (byte) 123);
                    class285.field5105.method1908(-81, class229.field4111 + var2);
                    class285.field5105.method1892(class4.field52 + var3, (byte) 124);
                    class285.field5105.method1927(-1356247032, (int) (var6 >>> 32) & Integer.MAX_VALUE);
                    class285.field5105.method1885(2, class16.field229);
                }
                if (var4 == 34) {
                    ++class213.field3899;
                    class285.field5105.method1568(238, (byte) 107);
                    class285.field5105.method1904(var2, true);
                    class285.field5105.method1904(var5, true);
                    class285.field5105.method1903(true, var3);
                    class37.field561 = 0;
                    class218.field3980 = client.method1114(-20985, var3);
                    class5.field76 = var2;
                }
                if (~var4 == -58) {
                    class237 var38 = class224.field4031[var5];
                    if (var38 != null) {
                        class171.method1228(2, false, -91, 0, 1, var38.field3820[0], class166.field2927.field3805[0], 1, 0, 0, class166.field2927.field3820[0], var38.field3805[0]);
                        class129.field2270 = 2;
                        ++class218.field3968;
                        class149.field2618 = 0;
                        class60.field1022 = class193.field3527;
                        class31.field497 = class58.field992;
                        class285.field5105.method1568(188, (byte) 110);
                        class285.field5105.method1908(-77, var5);
                    }
                }
                if (~var4 == -46) {
                    if (class78.field1460 != 1) {
                        boolean var39 = class171.method1228(2, false, arg1 ^ 17324, 0, 0, var3, class166.field2927.field3805[0], 0, 0, 0, class166.field2927.field3820[0], var2);
                        if (!var39) {
                            class171.method1228(2, false, -92, 0, 1, var3, class166.field2927.field3805[0], 1, 0, 0, class166.field2927.field3820[0], var2);
                        }
                    } else {
                        class171.method1228(2, false, arg1 ^ 17348, 0, 1, var3, class166.field2927.field3805[0], 1, 0, 0, class166.field2927.field3820[0], var2);
                    }
                    class31.field497 = class58.field992;
                    class149.field2618 = 0;
                    ++class55.field913;
                    class60.field1022 = class193.field3527;
                    class129.field2270 = 2;
                    class285.field5105.method1568(109, (byte) 96);
                    class285.field5105.method1927(-1356247032, class229.field4111 + var2);
                    class285.field5105.method1904(var3 - -class4.field52, true);
                    class285.field5105.method1927(-1356247032, var5);
                }
                if (~var4 == -10) {
                    class237 var41 = class224.field4031[var5];
                    if (var41 != null) {
                        class171.method1228(2, false, -45, 0, 1, var41.field3820[0], class166.field2927.field3805[0], 1, 0, 0, class166.field2927.field3820[0], var41.field3805[0]);
                        class31.field497 = class58.field992;
                        class129.field2270 = 2;
                        ++class56.field937;
                        class149.field2618 = 0;
                        class60.field1022 = class193.field3527;
                        class285.field5105.method1568(190, (byte) 87);
                        class285.field5105.method1908(arg1 + -17484, var5);
                    }
                }
                if (var4 == 48) {
                    if (~var5 != -1) {
                        if (var5 == 1) {
                            class285.field5105.method1568(255, (byte) 101);
                            ++class186.field3432;
                            class285.field5105.method1886(class16.field229, 2);
                            class285.field5105.method1892(class4.field52 + var3, (byte) 122);
                            class285.field5105.method1908(-125, class229.field4111 + var2);
                            class285.field5105.method1892(class255.field4611, (byte) 119);
                        }
                    } else {
                        class212.field3893 = 1;
                        class241.method1646(class138.field2405, var2, var3);
                    }
                }
                if (var4 == 19) {
                    class181 var42 = class5.method21(var3, var2, (byte) 40);
                    if (var42 != null) {
                        class117.method869(arg1 ^ 17340);
                        class200 var43 = client.method1109(var42);
                        class247.method1679(var42.field3341, true, var3, var43.method1430(120), var42.field3320, var2, var43.field3626);
                        class268.field4769 = 0;
                        class153.field2683 = class252.method1710(var42, -126);
                        if (class153.field2683 == null) {
                            class153.field2683 = class26.field339;
                        }
                        if (!var42.field3307) {
                            class66.field1206 = class130.method949((byte) -77, new class93[] { class167.field2941, var42.field3265, class83.field1525 });
                            return;
                        }
                        class66.field1206 = class130.method949((byte) -77, new class93[] { var42.field3274, class83.field1525 });
                    }
                } else {
                    if (var4 == 31) {
                        class237 var44 = class224.field4031[var5];
                        if (var44 != null) {
                            class171.method1228(2, false, 110, 0, 1, var44.field3820[0], class166.field2927.field3805[0], 1, 0, 0, class166.field2927.field3820[0], var44.field3805[0]);
                            class60.field1022 = class193.field3527;
                            class129.field2270 = 2;
                            class31.field497 = class58.field992;
                            class149.field2618 = 0;
                            ++class218.field3973;
                            class285.field5105.method1568(249, (byte) 124);
                            class285.field5105.method1904(var5, true);
                        }
                    }
                    if (var4 == 1) {
                        ++class287.field5137;
                        class285.field5105.method1568(139, (byte) 73);
                        class285.field5105.method1886(var3, 2);
                        class181 var45 = client.method1114(arg1 ^ -4613, var3);
                        if (var45.field3313 != null && var45.field3313[0][0] == 5) {
                            int var46 = var45.field3313[0][1];
                            if (class176.field3061[var46] != var45.field3247[0]) {
                                class176.field3061[var46] = var45.field3247[0];
                                class53.method292(var46, arg1 ^ 17345);
                            }
                        }
                    }
                    if (~var4 == -1006) {
                        class31.field497 = class58.field992;
                        class129.field2270 = 2;
                        class149.field2618 = 0;
                        class60.field1022 = class193.field3527;
                        class227 var47 = class155.field2709[var5];
                        if (var47 != null) {
                            class145 var48 = var47.field4062;
                            if (var48.field2523 != null) {
                                var48 = var48.method1058(249);
                            }
                            if (var48 != null) {
                                ++class256.field4622;
                                class285.field5105.method1568(7, (byte) 98);
                                class285.field5105.method1908(arg1 + -17500, var48.field2552);
                            }
                        }
                    }
                    if (var4 == 11) {
                        ++class105.field1815;
                        class285.field5105.method1568(207, (byte) 90);
                        class285.field5105.method1892(var5, (byte) 125);
                        class285.field5105.method1903(true, var3);
                        class285.field5105.method1908(-100, var2);
                        class37.field561 = 0;
                        class218.field3980 = client.method1114(-20985, var3);
                        class5.field76 = var2;
                    }
                    if (~var4 == -4) {
                        class237 var49 = class224.field4031[var5];
                        if (var49 != null) {
                            ++class218.field3964;
                            class171.method1228(2, false, -55, 0, 1, var49.field3820[0], class166.field2927.field3805[0], 1, 0, 0, class166.field2927.field3820[0], var49.field3805[0]);
                            class31.field497 = class58.field992;
                            class149.field2618 = 0;
                            class60.field1022 = class193.field3527;
                            class129.field2270 = 2;
                            class285.field5105.method1568(39, (byte) 120);
                            class285.field5105.method1927(arg1 + -1356264436, class76.field1413);
                            class285.field5105.method1892(var5, (byte) 125);
                            class285.field5105.method1906(1304783144, class217.field3946);
                            class285.field5105.method1927(-1356247032, class268.field4782);
                        }
                    }
                    if (var4 == 41) {
                        class237 var50 = class224.field4031[var5];
                        if (var50 != null) {
                            class171.method1228(2, false, arg1 ^ -17372, 0, 1, var50.field3820[0], class166.field2927.field3805[0], 1, 0, 0, class166.field2927.field3820[0], var50.field3805[0]);
                            class31.field497 = class58.field992;
                            ++class185.field3420;
                            class60.field1022 = class193.field3527;
                            class129.field2270 = 2;
                            class149.field2618 = 0;
                            class285.field5105.method1568(182, (byte) 87);
                            class285.field5105.method1892(class255.field4611, (byte) 125);
                            class285.field5105.method1906(arg1 ^ 1304767188, class16.field229);
                            class285.field5105.method1908(arg1 + -17531, var5);
                        }
                    }
                    if (class268.field4769 != 0) {
                        class268.field4769 = 0;
                        class254.method1731(client.method1114(-20985, class217.field3946), (byte) -93);
                    }
                    if (class263.field4695) {
                        class117.method869(64);
                    }
                    if (class218.field3980 != null && class37.field561 == 0) {
                        class254.method1731(class218.field3980, (byte) -64);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "(B)V")
    public static void method1843(byte arg0) {
        int var1 = 89 % ((-4 - arg0) / 49);
        field4917 = null;
        field4922 = null;
        field4927 = null;
        field4925 = null;
    }

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "(II)V")
    public static final void method1844(int arg0, int arg1) {
        ++field4929;
        class212 var2 = class123.method905(arg0 ^ -1205369484, 9, arg1);
        var2.method1502(255);
        if (arg0 != 7252) {
            field4917 = null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(I)V")
    public final void method64(int arg0) {
        if (arg0 != -3) {
            this.field4931 = 26;
        }
        this.field4926 = -this.field4931 + this.field4933;
        ++field4918;
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(ZI)Lhh;")
    public static final class118 method1845(boolean arg0, int arg1) {
        ++field4928;
        class118 var2 = (class118) class175.field3040.method1852((long) arg1, (byte) -105);
        if (arg0) {
            return null;
        } else if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class154.field2702.method1271(class157.method1126(arg1, -489923128), -2154, class237.method1615(-2, arg1));
            class118 var4 = new class118();
            if (var3 != null) {
                var4.method884((byte) 36, new class280(var3));
            }
            class175.field3040.method1847(var4, 57, (long) arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "()V")
    public class275() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lwc;)V")
    public static final void method1846(class229 arg0) {
        for (int var1 = arg0.field4095; var1 <= arg0.field4100; ++var1) {
            for (int var2 = arg0.field4099; var2 <= arg0.field4110; ++var2) {
                class41 var3 = class232.field4138[arg0.field4108][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field645; ++var4) {
                        if (var3.field637[var4] == arg0) {
                            --var3.field645;
                            for (int var5 = var4; var5 < var3.field645; ++var5) {
                                var3.field637[var5] = var3.field637[var5 + 1];
                                var3.field634[var5] = var3.field634[var5 + 1];
                            }
                            var3.field637[var3.field645] = null;
                            break;
                        }
                    }
                    var3.field648 = 0;
                    for (int var6 = 0; var6 < var3.field645; ++var6) {
                        var3.field648 |= var3.field634[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IILee;)V")
    public final void method20(int arg0, int arg1, class280 arg2) {
        if (arg0 > 11) {
            if (~arg1 != -1) {
                if (~arg1 != -2) {
                    if (~arg1 == -3) {
                        super.field4698 = arg2.method1907(16832) == 1;
                    }
                } else {
                    this.field4933 = arg2.method1891(-122);
                }
            } else {
                this.field4931 = arg2.method1891(-117);
            }
            ++field4924;
        }
    }
}
