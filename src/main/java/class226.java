import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class226 extends class264 {

    @OriginalMember(owner = "client!rg", name = "K", descriptor = "[I")
    private int[] field4045 = new int[257];

    @OriginalMember(owner = "client!rg", name = "J", descriptor = "I")
    public static int field4044;

    @OriginalMember(owner = "client!rg", name = "L", descriptor = "I")
    public static int field4046;

    @OriginalMember(owner = "client!rg", name = "M", descriptor = "I")
    public static int field4047;

    @OriginalMember(owner = "client!rg", name = "N", descriptor = "I")
    public static int field4048;

    @OriginalMember(owner = "client!rg", name = "P", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!rg", name = "R", descriptor = "I")
    public static int field4052;

    @OriginalMember(owner = "client!rg", name = "S", descriptor = "I")
    public static int field4053;

    @OriginalMember(owner = "client!rg", name = "T", descriptor = "I")
    public static int field4054;

    @OriginalMember(owner = "client!rg", name = "U", descriptor = "I")
    public static int field4055;

    @OriginalMember(owner = "client!rg", name = "O", descriptor = "Lhg;")
    public static class177 field4049;

    @OriginalMember(owner = "client!rg", name = "Q", descriptor = "[[I")
    private int[][] field4051;

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)V")
    public final void method64(int arg0) {
        if (this.field4051 == null) {
            this.method1558(-36, 1);
        }
        if (arg0 != -3) {
            field4044 = -8;
        }
        ++field4047;
        this.method1560(arg0 ^ 53);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IILee;)V")
    public final void method20(int arg0, int arg1, class280 arg2) {
        ++field4052;
        if (arg0 > 11) {
            if (~arg1 == -1) {
                int var4 = arg2.method1907(16832);
                if (var4 != 0) {
                    this.method1558(-53, var4);
                } else {
                    this.field4051 = new int[arg2.method1907(16832)][4];
                    for (int var5 = 0; ~var5 > ~this.field4051.length; ++var5) {
                        this.field4051[var5][0] = arg2.method1891(-126);
                        this.field4051[var5][1] = arg2.method1907(16832) << 4;
                        this.field4051[var5][2] = arg2.method1907(16832) << 4;
                        this.field4051[var5][3] = arg2.method1907(16832) << 4;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILcf;)Z")
    public static final boolean method1555(int arg0, class93 arg1) {
        ++field4055;
        int var2 = -75 % ((28 - arg0) / 52);
        if (arg1 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < class284.field5098; ++var3) {
                if (arg1.method649(class164.field2889[var3], -4446)) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "(I)V")
    public static final void method1556(int arg0) {
        if (~class38.field593 < -2) {
            class167.field2951 = class193.field3542;
            --class38.field593;
        }
        ++field4054;
        if (class213.field3908 > 0) {
            --class213.field3908;
        }
        if (class224.field4038) {
            class224.field4038 = false;
            class256.method1738(false);
        } else {
            for (int var1 = 0; ~var1 > -101 && class240.method1629(0); ++var1) {
            }
            if (class199.field3609 == 30) {
                class49.method272(false, class285.field5105, 110);
                Object var2 = class160.field2817.field3382;
                synchronized (class160.field2817.field3382) {
                    if (!class167.field2950) {
                        class160.field2817.field3385 = 0;
                    } else if (~class93.field1648 != -1 || ~class160.field2817.field3385 <= -41) {
                        class285.field5105.method1568(65, (byte) 71);
                        class285.field5105.method1916(0, arg0 ^ 68);
                        ++class83.field1522;
                        int var3 = class285.field5105.field5027;
                        int var4 = 0;
                        for (int var5 = 0; class160.field2817.field3385 > var5 && -var3 + class285.field5105.field5027 < 240; ++var5) {
                            ++var4;
                            boolean var6 = false;
                            int var7 = class160.field2817.field3387[var5];
                            int var8 = class160.field2817.field3386[var5];
                            if (var8 >= 0) {
                                if (~var8 < -65535) {
                                    var8 = 65534;
                                }
                            } else {
                                var8 = 0;
                            }
                            if (~var7 > -1) {
                                var7 = 0;
                            } else if (var7 > 65534) {
                                var7 = 65534;
                            }
                            if (class160.field2817.field3387[var5] == -1 && class160.field2817.field3386[var5] == -1) {
                                var7 = -1;
                                var6 = true;
                                var8 = -1;
                            }
                            if (class171.field3009 == var8 && class41.field631 == var7) {
                                if (class271.field4819 < 2047) {
                                    ++class271.field4819;
                                }
                            } else {
                                int var9 = var7 - class41.field631;
                                int var10 = -class171.field3009 + var8;
                                class171.field3009 = var8;
                                class41.field631 = var7;
                                if (class271.field4819 < 8 && var10 >= -32 && ~var10 >= -32 && ~var9 <= 31 && ~var9 >= -32) {
                                    var9 += 32;
                                    var10 += 32;
                                    class285.field5105.method1908(arg0 ^ -98, (class271.field4819 << 12) + (var10 << 6) + var9);
                                    class271.field4819 = 0;
                                } else if (~class271.field4819 > -33 && ~var10 <= 127 && ~var10 >= -128 && var9 >= -128 && var9 <= 127) {
                                    class285.field5105.method1916(class271.field4819 + 128, arg0 ^ 119);
                                    var10 += 128;
                                    var9 += 128;
                                    class285.field5105.method1908(-84, (var10 << 8) + var9);
                                    class271.field4819 = 0;
                                } else if (~class271.field4819 > -33) {
                                    class285.field5105.method1916(class271.field4819 + 192, 103);
                                    if (var6) {
                                        class285.field5105.method1886(Integer.MIN_VALUE, arg0 ^ 2);
                                    } else {
                                        class285.field5105.method1886(var8 | var7 << 16, 2);
                                    }
                                    class271.field4819 = 0;
                                } else {
                                    class285.field5105.method1908(-98, class271.field4819 + 57344);
                                    if (var6) {
                                        class285.field5105.method1886(Integer.MIN_VALUE, 2);
                                    } else {
                                        class285.field5105.method1886(var8 | var7 << 16, arg0 ^ 2);
                                    }
                                    class271.field4819 = 0;
                                }
                            }
                        }
                        class285.field5105.method1874(false, -var3 + class285.field5105.field5027);
                        if (class160.field2817.field3385 > var4) {
                            class160.field2817.field3385 -= var4;
                            for (int var11 = 0; ~var11 > ~class160.field2817.field3385; ++var11) {
                                class160.field2817.field3386[var11] = class160.field2817.field3386[var4 + var11];
                                class160.field2817.field3387[var11] = class160.field2817.field3387[var4 + var11];
                            }
                        } else {
                            class160.field2817.field3385 = 0;
                        }
                    }
                }
                if (class93.field1648 != 0) {
                    ++class234.field4162;
                    long var12 = (-class254.field4593 + class52.field859) / 50L;
                    if (~var12 < -32768L) {
                        var12 = 32767L;
                    }
                    int var14 = class193.field3527;
                    class254.field4593 = class52.field859;
                    int var15 = class58.field992;
                    if (~var14 > -1) {
                        var14 = 0;
                    } else if (~var14 < -65536) {
                        var14 = 65535;
                    }
                    byte var16 = 0;
                    if (class93.field1648 == 2) {
                        var16 = 1;
                    }
                    if (~var15 <= -1) {
                        if (var15 > 65535) {
                            var15 = 65535;
                        }
                    } else {
                        var15 = 0;
                    }
                    class285.field5105.method1568(34, (byte) 79);
                    int var17 = (int) var12;
                    class285.field5105.method1892(var17 | var16 << 15, (byte) 127);
                    class285.field5105.method1903(true, var15 << 16 | var14);
                }
                if (~class228.field4092 < -1) {
                    --class228.field4092;
                }
                if (!class223.field4026) {
                    if (class176.field3048[96] || class176.field3048[97] || class176.field3048[98] || class176.field3048[99]) {
                        class9.field118 = true;
                    }
                } else {
                    for (int var18 = 0; class243.field4386 > var18; ++var18) {
                        int var19 = class257.field4629[var18];
                        if (~var19 == -99 || var19 == 99 || ~var19 == -97 || ~var19 == -98) {
                            class9.field118 = true;
                            break;
                        }
                    }
                }
                if (class9.field118 && class228.field4092 <= 0) {
                    ++class124.field2207;
                    class9.field118 = false;
                    class228.field4092 = 20;
                    class285.field5105.method1568(101, (byte) 96);
                    class285.field5105.method1927(arg0 ^ -1356247032, class50.field825);
                    class285.field5105.method1927(-1356247032, class211.field3875);
                }
                if (class32.field513 && !class67.field1233) {
                    class67.field1233 = true;
                    class285.field5105.method1568(114, (byte) 126);
                    ++class217.field3956;
                    class285.field5105.method1916(1, arg0 + 122);
                }
                if (!class32.field513 && class67.field1233) {
                    class67.field1233 = false;
                    ++class217.field3956;
                    class285.field5105.method1568(114, (byte) 50);
                    class285.field5105.method1916(0, 99);
                }
                if (!class193.field3525) {
                    class285.field5105.method1568(153, (byte) 60);
                    ++class248.field4461;
                    class285.field5105.method1885(2, class167.method1207(arg0));
                    class193.field3525 = true;
                }
                class39.method228(110);
                if (~class199.field3609 == -31) {
                    class218.method1529(122);
                    class186.method1354((byte) -105);
                    class237.method1620(118);
                    ++class31.field492;
                    if (class31.field492 > 750) {
                        class256.method1738(false);
                    } else {
                        class80.method557(79);
                        class45.method250((byte) 64);
                        class231.method1579((byte) 87);
                        if (class89.field1579 != null) {
                            class30.method178(33);
                        }
                        for (int var20 = class210.method1488(-1337609008, true); ~var20 != 0; var20 = class210.method1488(-1337609008, false)) {
                            class53.method292(var20, 31);
                            class124.field2209[class58.method333(31, class211.field3872++)] = var20;
                        }
                        for (class212 var21 = class47.method266(0); var21 != null; var21 = class47.method266(0)) {
                            int var22 = var21.method1494(arg0 + -40);
                            int var23 = var21.method1495(-104);
                            if (~var22 == -2) {
                                class250.field4496[var23] = var21.field3883;
                                class140.field2441[class58.method333(class256.field4621++, 31)] = var23;
                            } else if (var22 == 2) {
                                class47.field758[var23] = var21.field3895;
                                class70.field1282[class58.method333(class251.field4517++, 31)] = var23;
                            } else if (~var22 != -4) {
                                if (~var22 == -5) {
                                    class181 var24 = client.method1114(-20985, var23);
                                    int var25 = var21.field3889;
                                    int var26 = var21.field3892;
                                    int var27 = var21.field3883;
                                    if (~var24.field3287 != ~var27 || ~var24.field3326 != ~var25 || var24.field3211 != var26) {
                                        var24.field3287 = var27;
                                        var24.field3211 = var26;
                                        var24.field3326 = var25;
                                        class254.method1731(var24, (byte) 87);
                                    }
                                } else if (~var22 != -6) {
                                    if (~var22 != -7) {
                                        if (var22 != 7) {
                                            if (~var22 == -9) {
                                                class181 var28 = client.method1114(-20985, var23);
                                                if (var21.field3883 != var28.field3254 || var21.field3889 != var28.field3243 || var21.field3892 != var28.field3260) {
                                                    var28.field3243 = var21.field3889;
                                                    var28.field3260 = var21.field3892;
                                                    if (~var28.field3357 != 0) {
                                                        if (~var28.field3292 < -1) {
                                                            var28.field3260 = var28.field3260 * 32 / var28.field3292;
                                                        } else if (var28.field3277 > 0) {
                                                            var28.field3260 = var28.field3260 * 32 / var28.field3277;
                                                        }
                                                    }
                                                    var28.field3254 = var21.field3883;
                                                    class254.method1731(var28, (byte) 101);
                                                }
                                            } else if (~var22 != -10) {
                                                if (var22 != 10) {
                                                    if (var22 == 11) {
                                                        class181 var29 = client.method1114(arg0 + -20985, var23);
                                                        var29.field3294 = 0;
                                                        var29.field3189 = var29.field3248 = var21.field3889;
                                                        var29.field3351 = 0;
                                                        var29.field3214 = var29.field3253 = var21.field3883;
                                                        class254.method1731(var29, (byte) -126);
                                                    } else if (var22 == 12) {
                                                        class181 var30 = client.method1114(-20985, var23);
                                                        int var31 = var21.field3883;
                                                        if (var30 != null && var30.field3289 == 0) {
                                                            if (~var31 < ~(-var30.field3252 + var30.field3334)) {
                                                                var31 = -var30.field3252 + var30.field3334;
                                                            }
                                                            if (var31 < 0) {
                                                                var31 = 0;
                                                            }
                                                            if (~var30.field3282 != ~var31) {
                                                                var30.field3282 = var31;
                                                                class254.method1731(var30, (byte) -126);
                                                            }
                                                        }
                                                    } else if (var22 == 13) {
                                                        class181 var32 = client.method1114(-20985, var23);
                                                        var32.field3259 = var21.field3883;
                                                    }
                                                } else {
                                                    class181 var33 = client.method1114(-20985, var23);
                                                    if (var21.field3883 != var33.field3325 || ~var21.field3889 != ~var33.field3249 || var21.field3892 != var33.field3355) {
                                                        var33.field3325 = var21.field3883;
                                                        var33.field3355 = var21.field3892;
                                                        var33.field3249 = var21.field3889;
                                                        class254.method1731(var33, (byte) 66);
                                                    }
                                                }
                                            } else {
                                                class181 var34 = client.method1114(-20985, var23);
                                                if (var21.field3883 != var34.field3357 || ~var21.field3889 != ~var34.field3250) {
                                                    var34.field3250 = var21.field3889;
                                                    var34.field3357 = var21.field3883;
                                                    class254.method1731(var34, (byte) -76);
                                                }
                                            }
                                        } else {
                                            class181 var35 = client.method1114(-20985, var23);
                                            boolean var36 = var21.field3883 == 1;
                                            if (var35.field3290 != var36) {
                                                var35.field3290 = var36;
                                                class254.method1731(var35, (byte) 73);
                                            }
                                        }
                                    } else {
                                        int var37 = var21.field3883;
                                        int var38 = (var37 & 1016) >> 5;
                                        int var39 = var37 >> 10 & 31;
                                        int var40 = var37 & 31;
                                        int var41 = (var38 << 11) + (var39 << 19) + (var40 << 3);
                                        class181 var42 = client.method1114(arg0 + -20985, var23);
                                        if (~var42.field3180 != ~var41) {
                                            var42.field3180 = var41;
                                            class254.method1731(var42, (byte) -110);
                                        }
                                    }
                                } else {
                                    class181 var43 = client.method1114(-20985, var23);
                                    if (~var21.field3883 != ~var43.field3203 || ~var21.field3883 == 0) {
                                        var43.field3337 = 0;
                                        var43.field3203 = var21.field3883;
                                        var43.field3204 = 1;
                                        var43.field3328 = 0;
                                        class254.method1731(var43, (byte) -105);
                                    }
                                }
                            } else {
                                class181 var44 = client.method1114(arg0 ^ -20985, var23);
                                if (!var21.field3895.method667(var44.field3258, (byte) -121)) {
                                    var44.field3258 = var21.field3895;
                                    class254.method1731(var44, (byte) -106);
                                }
                            }
                        }
                        ++class203.field3670;
                        if (~class129.field2270 != -1) {
                            class149.field2618 += 20;
                            if (~class149.field2618 <= -401) {
                                class129.field2270 = 0;
                            }
                        }
                        if (class218.field3980 != null) {
                            ++class37.field561;
                            if (class37.field561 >= 15) {
                                class254.method1731(class218.field3980, (byte) -124);
                                class218.field3980 = null;
                            }
                        }
                        if (class228.field4080 != null) {
                            class254.method1731(class228.field4080, (byte) 92);
                            if (~class227.field4056 < ~(class104.field1801 + 5) || class227.field4056 < class104.field1801 + -5 || class157.field2793 > class245.field4419 - -5 || ~class157.field2793 > ~(class245.field4419 + -5)) {
                                class267.field4764 = true;
                            }
                            ++class245.field4398;
                            if (~class218.field3969 == -1) {
                                if (class267.field4764 && class245.field4398 >= 5) {
                                    if (class228.field4080 == class121.field2141 && class41.field625 != class196.field3591) {
                                        ++class50.field802;
                                        class181 var45 = class228.field4080;
                                        byte var46 = 0;
                                        if (class207.field3711 == 1 && var45.field3218 == 206) {
                                            var46 = 1;
                                        }
                                        if (var45.field3301[class196.field3591] <= 0) {
                                            var46 = 0;
                                        }
                                        if (client.method1109(var45).method1431((byte) 106)) {
                                            int var47 = class41.field625;
                                            int var48 = class196.field3591;
                                            var45.field3301[var48] = var45.field3301[var47];
                                            var45.field3304[var48] = var45.field3304[var47];
                                            var45.field3301[var47] = -1;
                                            var45.field3304[var47] = 0;
                                        } else if (var46 == 1) {
                                            int var49 = class196.field3591;
                                            int var50 = class41.field625;
                                            while (~var49 != ~var50) {
                                                if (var50 <= var49) {
                                                    if (~var49 < ~var50) {
                                                        var45.method1333(var50 + 1, var50, (byte) 74);
                                                        ++var50;
                                                    }
                                                } else {
                                                    var45.method1333(var50 + -1, var50, (byte) 74);
                                                    --var50;
                                                }
                                            }
                                        } else {
                                            var45.method1333(class196.field3591, class41.field625, (byte) 74);
                                        }
                                        class285.field5105.method1568(204, (byte) 61);
                                        class285.field5105.method1904(class41.field625, true);
                                        class285.field5105.method1904(class196.field3591, true);
                                        class285.field5105.method1905((byte) -127, var46);
                                        class285.field5105.method1886(class228.field4080.field3219, 2);
                                    }
                                } else if ((class67.field1227 == 1 || class73.method494(class253.field4549 + -1, -1)) && class253.field4549 > 2) {
                                    class193.method1384((byte) -42);
                                } else if (class253.field4549 > 0) {
                                    class255.method1732(arg0 ^ 68);
                                }
                                class37.field561 = 10;
                                class228.field4080 = null;
                                class93.field1648 = 0;
                            }
                        }
                        class243.field4386 = arg0;
                        class54.field894 = false;
                        class272.field4851 = null;
                        class181 var51 = class78.field1463;
                        class78.field1463 = null;
                        class241.field4363 = false;
                        class181 var52 = class232.field4146;
                        class232.field4146 = null;
                        while (class61.method387(10) && class243.field4386 < 128) {
                            class257.field4629[class243.field4386] = class131.field2318;
                            class32.field507[class243.field4386] = class217.field3945;
                            ++class243.field4386;
                        }
                        class89.field1579 = null;
                        if (~class69.field1262 != 0) {
                            class243.method1652(arg0 + -21606, 0, 0, class169.field2968, 0, class150.field2629, class69.field1262, 0);
                        }
                        ++class193.field3542;
                        while (true) {
                            class223 var53;
                            class181 var54;
                            class181 var55;
                            do {
                                var53 = (class223) class67.field1229.method1158(1375765729);
                                if (var53 == null) {
                                    while (true) {
                                        class223 var56;
                                        class181 var57;
                                        class181 var58;
                                        do {
                                            var56 = (class223) class85.field1547.method1158(1375765729);
                                            if (var56 == null) {
                                                while (true) {
                                                    class223 var59;
                                                    class181 var60;
                                                    class181 var61;
                                                    do {
                                                        var59 = (class223) class40.field623.method1158(1375765729);
                                                        if (var59 == null) {
                                                            if (class89.field1579 == null) {
                                                                class267.field4767 = 0;
                                                            }
                                                            if (class148.field2611 != null) {
                                                                class124.method911(-2);
                                                            }
                                                            if (class285.field5109 > 0 && class176.field3048[82] && class176.field3048[81] && class78.field1462 != 0) {
                                                                int var62 = -class78.field1462 + class138.field2405;
                                                                if (var62 >= 0) {
                                                                    if (var62 > 3) {
                                                                        var62 = 3;
                                                                    }
                                                                } else {
                                                                    var62 = 0;
                                                                }
                                                                class61.method381(var62, class166.field2927.field3805[0] + class229.field4111, (byte) 75, class4.field52 - -class166.field2927.field3820[0]);
                                                            }
                                                            if (class285.field5109 > 0 && class176.field3048[82] && class176.field3048[81]) {
                                                                if (~class78.field1458 != 0) {
                                                                    class61.method381(class138.field2405, class229.field4111 - -class78.field1458, (byte) 65, class4.field52 + class26.field336);
                                                                }
                                                                class46.field747 = 0;
                                                                class212.field3893 = 0;
                                                            } else if (class212.field3893 != 2) {
                                                                if (~class46.field747 == -3) {
                                                                    if (~class78.field1458 != 0) {
                                                                        ++class95.field1718;
                                                                        class285.field5105.method1568(12, (byte) 121);
                                                                        class285.field5105.method1908(-104, class4.field52 + class26.field336);
                                                                        class285.field5105.method1892(class78.field1458 + class229.field4111, (byte) 120);
                                                                        class149.field2618 = 0;
                                                                        class60.field1022 = class193.field3527;
                                                                        class129.field2270 = 1;
                                                                        class31.field497 = class58.field992;
                                                                    }
                                                                    class46.field747 = 0;
                                                                } else if (~class78.field1458 != 0 && ~class212.field3893 == -1 && class46.field747 == 0) {
                                                                    boolean var63 = class171.method1228(0, true, 114, 0, 0, class26.field336, class166.field2927.field3805[0], 0, 0, 0, class166.field2927.field3820[0], class78.field1458);
                                                                    if (var63) {
                                                                        class149.field2618 = 0;
                                                                        class31.field497 = class58.field992;
                                                                        class60.field1022 = class193.field3527;
                                                                        class129.field2270 = 1;
                                                                    }
                                                                }
                                                            } else {
                                                                if (class78.field1458 != -1) {
                                                                    class285.field5105.method1568(255, (byte) 127);
                                                                    class285.field5105.method1886(class16.field229, 2);
                                                                    class285.field5105.method1892(class4.field52 - -class26.field336, (byte) 127);
                                                                    ++class247.field4446;
                                                                    class285.field5105.method1908(-124, class78.field1458 + class229.field4111);
                                                                    class285.field5105.method1892(class255.field4611, (byte) 119);
                                                                    class31.field497 = class58.field992;
                                                                    class149.field2618 = 0;
                                                                    class129.field2270 = 1;
                                                                    class60.field1022 = class193.field3527;
                                                                }
                                                                class212.field3893 = 0;
                                                            }
                                                            class78.field1458 = -1;
                                                            class29.method168(arg0 ^ -109);
                                                            if (class232.field4146 != var52) {
                                                                if (var52 != null) {
                                                                    class254.method1731(var52, (byte) -103);
                                                                }
                                                                if (class232.field4146 != null) {
                                                                    class254.method1731(class232.field4146, (byte) 60);
                                                                }
                                                            }
                                                            if (class78.field1463 != var51 && class61.field1037 == class214.field3921) {
                                                                if (var51 != null) {
                                                                    class254.method1731(var51, (byte) -67);
                                                                }
                                                                if (class78.field1463 != null) {
                                                                    class254.method1731(class78.field1463, (byte) -98);
                                                                }
                                                            }
                                                            if (class78.field1463 == null) {
                                                                if (class214.field3921 > 0) {
                                                                    --class214.field3921;
                                                                }
                                                            } else if (class214.field3921 < class61.field1037) {
                                                                ++class214.field3921;
                                                                if (class61.field1037 == class214.field3921) {
                                                                    class254.method1731(class78.field1463, (byte) 41);
                                                                }
                                                            }
                                                            if (~class18.field234 != -2) {
                                                                if (~class18.field234 == -3) {
                                                                    class112.method798(true);
                                                                } else {
                                                                    class92.method632((byte) -120);
                                                                }
                                                            } else {
                                                                class136.method995((byte) 36);
                                                            }
                                                            for (int var64 = 0; ~var64 > -6; ++var64) {
                                                                int var10002 = class269.field4809[var64]++;
                                                            }
                                                            int var65 = class273.method1808((byte) -53);
                                                            int var66 = class223.method1549(-18123);
                                                            if (var65 > 15000 && var66 > 15000) {
                                                                ++class45.field732;
                                                                class213.field3908 = 250;
                                                                class208.method1467(14500, 16);
                                                                class285.field5105.method1568(191, (byte) 99);
                                                            }
                                                            if (class166.field2932 != null && class166.field2932.field290 == 1) {
                                                                if (class166.field2932.field292 != null) {
                                                                    class120.method892((byte) 91, class141.field2448, class257.field4637);
                                                                }
                                                                class141.field2448 = false;
                                                                class166.field2932 = null;
                                                                class257.field4637 = null;
                                                            }
                                                            ++class254.field4597;
                                                            ++class48.field782;
                                                            ++class156.field2762;
                                                            if (class48.field782 > 500) {
                                                                class48.field782 = 0;
                                                                int var67 = (int) (8.0D * Math.random());
                                                                if ((var67 & 2) == 2) {
                                                                    class38.field595 += class243.field4384;
                                                                }
                                                                if ((1 & var67) == 1) {
                                                                    client.field2736 += class174.field3039;
                                                                }
                                                                if ((4 & var67) == 4) {
                                                                    class112.field1919 += class277.field4974;
                                                                }
                                                            }
                                                            if (~class254.field4597 < -501) {
                                                                class254.field4597 = 0;
                                                                int var68 = (int) (8.0D * Math.random());
                                                                if (~(var68 & 1) == -2) {
                                                                    class95.field1719 += class73.field1322;
                                                                }
                                                                if ((2 & var68) == 2) {
                                                                    class248.field4458 += class144.field2489;
                                                                }
                                                            }
                                                            if (class112.field1919 < -40) {
                                                                class277.field4974 = 1;
                                                            }
                                                            if (~class95.field1719 > 59) {
                                                                class73.field1322 = 2;
                                                            }
                                                            if (~class248.field4458 > 19) {
                                                                class144.field2489 = 1;
                                                            }
                                                            if (~class38.field595 > 54) {
                                                                class243.field4384 = 2;
                                                            }
                                                            if (client.field2736 < -50) {
                                                                class174.field3039 = 2;
                                                            }
                                                            if (class95.field1719 > 60) {
                                                                class73.field1322 = -2;
                                                            }
                                                            if (class38.field595 > 55) {
                                                                class243.field4384 = -2;
                                                            }
                                                            if (class248.field4458 > 10) {
                                                                class144.field2489 = -1;
                                                            }
                                                            if (client.field2736 > 50) {
                                                                class174.field3039 = -2;
                                                            }
                                                            if (class112.field1919 > 40) {
                                                                class277.field4974 = -1;
                                                            }
                                                            if (~class156.field2762 < -51) {
                                                                ++class246.field4428;
                                                                class285.field5105.method1568(224, (byte) 90);
                                                            }
                                                            if (class250.field4497) {
                                                                class139.method1016(arg0 + 2);
                                                                class250.field4497 = false;
                                                            }
                                                            try {
                                                                if (class92.field1625 != null && ~class285.field5105.field5027 < -1) {
                                                                    class92.field1625.method945(class285.field5105.field5011, (byte) 127, 0, class285.field5105.field5027);
                                                                    class285.field5105.field5027 = 0;
                                                                    class156.field2762 = 0;
                                                                    return;
                                                                }
                                                                return;
                                                            } catch (IOException var69) {
                                                                class256.method1738(false);
                                                                return;
                                                            }
                                                        }
                                                        var60 = var59.field4017;
                                                        if (~var60.field3293 > -1) {
                                                            break;
                                                        }
                                                        var61 = client.method1114(arg0 + -20985, var60.field3321);
                                                    } while (var61 == null || var61.field3336 == null || ~var60.field3293 <= ~var61.field3336.length || var61.field3336[var60.field3293] != var60);
                                                    class106.method763(var59, (byte) 82);
                                                }
                                            }
                                            var57 = var56.field4017;
                                            if (var57.field3293 < 0) {
                                                break;
                                            }
                                            var58 = client.method1114(-20985, var57.field3321);
                                        } while (var58 == null || var58.field3336 == null || var57.field3293 >= var58.field3336.length || var58.field3336[var57.field3293] != var57);
                                        class106.method763(var56, (byte) -27);
                                    }
                                }
                                var54 = var53.field4017;
                                if (var54.field3293 < 0) {
                                    break;
                                }
                                var55 = client.method1114(-20985, var54.field3321);
                            } while (var55 == null || var55.field3336 == null || var55.field3336.length <= var54.field3293 || var55.field3336[var54.field3293] != var54);
                            class106.method763(var53, (byte) 100);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "(I)V")
    public static void method1557(int arg0) {
        field4049 = null;
        if (arg0 <= 100) {
            method1556(104);
        }
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(II)V")
    private final void method1558(int arg0, int arg1) {
        ++field4048;
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (~arg1 != -6) {
                                if (~arg1 != -7) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field4051 = new int[4][4];
                                this.field4051[0][0] = 2048;
                                this.field4051[0][2] = 4096;
                                this.field4051[0][3] = 0;
                                this.field4051[1][2] = 4096;
                                this.field4051[1][0] = 2867;
                                this.field4051[2][0] = 3276;
                                this.field4051[1][3] = 0;
                                this.field4051[3][0] = 4096;
                                this.field4051[2][3] = 0;
                                this.field4051[2][2] = 4096;
                                this.field4051[0][1] = 0;
                                this.field4051[3][3] = 0;
                                this.field4051[3][2] = 0;
                                this.field4051[1][1] = 4096;
                                this.field4051[2][1] = 4096;
                                this.field4051[3][1] = 4096;
                            } else {
                                this.field4051 = new int[16][4];
                                this.field4051[0][2] = 192;
                                this.field4051[1][2] = 449;
                                this.field4051[2][2] = 690;
                                this.field4051[0][0] = 0;
                                this.field4051[0][1] = 80;
                                this.field4051[3][2] = 995;
                                this.field4051[0][3] = 321;
                                this.field4051[1][3] = 562;
                                this.field4051[2][3] = 803;
                                this.field4051[1][0] = 155;
                                this.field4051[3][3] = 1140;
                                this.field4051[4][2] = 1397;
                                this.field4051[1][1] = 321;
                                this.field4051[5][2] = 1429;
                                this.field4051[2][1] = 578;
                                this.field4051[6][2] = 1461;
                                this.field4051[4][3] = 1509;
                                this.field4051[5][3] = 1413;
                                this.field4051[3][1] = 947;
                                this.field4051[2][0] = 389;
                                this.field4051[4][1] = 1285;
                                this.field4051[6][3] = 1333;
                                this.field4051[7][3] = 1702;
                                this.field4051[5][1] = 1525;
                                this.field4051[3][0] = 671;
                                this.field4051[6][1] = 1734;
                                this.field4051[8][3] = 2056;
                                this.field4051[7][1] = 1413;
                                this.field4051[4][0] = 897;
                                this.field4051[5][0] = 1175;
                                this.field4051[9][3] = 2666;
                                this.field4051[7][2] = 1525;
                                this.field4051[10][3] = 3276;
                                this.field4051[6][0] = 1368;
                                this.field4051[8][2] = 1590;
                                this.field4051[8][1] = 1108;
                                this.field4051[9][1] = 1766;
                                this.field4051[7][0] = 1507;
                                this.field4051[9][2] = 2056;
                                this.field4051[11][3] = 3228;
                                this.field4051[12][3] = 3196;
                                this.field4051[10][2] = 2586;
                                this.field4051[13][3] = 3019;
                                this.field4051[8][0] = 1736;
                                this.field4051[11][2] = 3148;
                                this.field4051[14][3] = 3228;
                                this.field4051[15][3] = 2746;
                                this.field4051[12][2] = 3710;
                                this.field4051[9][0] = 2088;
                                this.field4051[13][2] = 3421;
                                this.field4051[10][1] = 2409;
                                this.field4051[11][1] = 3116;
                                this.field4051[10][0] = 2355;
                                this.field4051[14][2] = 3148;
                                this.field4051[15][2] = 2505;
                                this.field4051[12][1] = 3806;
                                this.field4051[11][0] = 2691;
                                this.field4051[13][1] = 3437;
                                this.field4051[12][0] = 3031;
                                this.field4051[14][1] = 3116;
                                this.field4051[13][0] = 3522;
                                this.field4051[15][1] = 2377;
                                this.field4051[14][0] = 3727;
                                this.field4051[15][0] = 4096;
                            }
                        } else {
                            this.field4051 = new int[6][4];
                            this.field4051[0][2] = 0;
                            this.field4051[0][1] = 0;
                            this.field4051[0][3] = 0;
                            this.field4051[1][3] = 1493;
                            this.field4051[0][0] = 0;
                            this.field4051[1][0] = 1843;
                            this.field4051[2][3] = 2939;
                            this.field4051[2][0] = 2457;
                            this.field4051[1][2] = 0;
                            this.field4051[2][2] = 0;
                            this.field4051[3][0] = 2781;
                            this.field4051[3][2] = 1124;
                            this.field4051[4][2] = 3084;
                            this.field4051[4][0] = 3481;
                            this.field4051[3][3] = 3565;
                            this.field4051[1][1] = 0;
                            this.field4051[2][1] = 0;
                            this.field4051[5][2] = 4096;
                            this.field4051[4][3] = 4031;
                            this.field4051[5][0] = 4096;
                            this.field4051[3][1] = 0;
                            this.field4051[4][1] = 546;
                            this.field4051[5][3] = 4096;
                            this.field4051[5][1] = 4096;
                        }
                    } else {
                        this.field4051 = new int[7][4];
                        this.field4051[0][2] = 0;
                        this.field4051[0][3] = 4096;
                        this.field4051[0][1] = 0;
                        this.field4051[1][3] = 4096;
                        this.field4051[1][1] = 0;
                        this.field4051[1][2] = 4096;
                        this.field4051[2][1] = 0;
                        this.field4051[0][0] = 0;
                        this.field4051[3][1] = 4096;
                        this.field4051[4][1] = 4096;
                        this.field4051[2][3] = 0;
                        this.field4051[3][3] = 0;
                        this.field4051[5][1] = 4096;
                        this.field4051[2][2] = 4096;
                        this.field4051[3][2] = 4096;
                        this.field4051[1][0] = 663;
                        this.field4051[6][1] = 0;
                        this.field4051[4][2] = 0;
                        this.field4051[5][2] = 0;
                        this.field4051[2][0] = 1363;
                        this.field4051[6][2] = 0;
                        this.field4051[3][0] = 2048;
                        this.field4051[4][0] = 2727;
                        this.field4051[5][0] = 3411;
                        this.field4051[4][3] = 0;
                        this.field4051[6][0] = 4096;
                        this.field4051[5][3] = 4096;
                        this.field4051[6][3] = 4096;
                    }
                } else {
                    this.field4051 = new int[8][4];
                    this.field4051[0][3] = 2361;
                    this.field4051[0][0] = 0;
                    this.field4051[1][3] = 1558;
                    this.field4051[1][0] = 2867;
                    this.field4051[0][2] = 2602;
                    this.field4051[1][2] = 1799;
                    this.field4051[2][3] = 1413;
                    this.field4051[3][3] = 947;
                    this.field4051[4][3] = 722;
                    this.field4051[5][3] = 1766;
                    this.field4051[0][1] = 2650;
                    this.field4051[2][0] = 3072;
                    this.field4051[3][0] = 3276;
                    this.field4051[4][0] = 3481;
                    this.field4051[5][0] = 3686;
                    this.field4051[2][2] = 1734;
                    this.field4051[6][0] = 3891;
                    this.field4051[7][0] = 4096;
                    this.field4051[1][1] = 2313;
                    this.field4051[6][3] = 915;
                    this.field4051[2][1] = 2618;
                    this.field4051[7][3] = 1140;
                    this.field4051[3][1] = 2296;
                    this.field4051[4][1] = 2072;
                    this.field4051[3][2] = 1220;
                    this.field4051[4][2] = 963;
                    this.field4051[5][1] = 2730;
                    this.field4051[5][2] = 2152;
                    this.field4051[6][1] = 2232;
                    this.field4051[7][1] = 1686;
                    this.field4051[6][2] = 1060;
                    this.field4051[7][2] = 1413;
                }
            } else {
                this.field4051 = new int[2][4];
                this.field4051[0][1] = 0;
                this.field4051[0][3] = 0;
                this.field4051[0][0] = 0;
                this.field4051[1][0] = 4096;
                this.field4051[0][2] = 0;
                this.field4051[1][3] = 4096;
                this.field4051[1][2] = 4096;
                this.field4051[1][1] = 4096;
            }
        }
        if (arg0 >= -11) {
            method1555(59, (class93) null);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Z)V")
    public static final void method1559(boolean arg0) {
        ++field4053;
        if (class11.field155 != null) {
            class11.field155.method1716(16384);
        }
        if (!arg0) {
            if (class237.field4235 != null) {
                class237.field4235.method1716(16384);
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "(I)V")
    private final void method1560(int arg0) {
        ++field4050;
        if (arg0 > -40) {
            this.method64(-70);
        }
        int var2 = this.field4051.length;
        if (~var2 < -1) {
            for (int var3 = 0; var3 < 257; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; var2 > var6 && ~var5 <= ~this.field4051[var6][0]; ++var6) {
                    ++var4;
                }
                int var8;
                int var9;
                int var10;
                if (~var4 <= ~var2) {
                    int[] var7 = this.field4051[var2 + -1];
                    var8 = var7[2];
                    var9 = var7[3];
                    var10 = var7[1];
                } else {
                    int[] var11 = this.field4051[var4];
                    if (~var4 < -1) {
                        int[] var12 = this.field4051[var4 + -1];
                        int var13 = (-var12[0] + var5 << 12) / (var11[0] + -var12[0]);
                        int var14 = -var13 + 4096;
                        var10 = var11[1] * var13 - -(var12[1] * var14) >> 12;
                        var9 = var11[3] * var13 + var12[3] * var14 >> 12;
                        var8 = var11[2] * var13 - -(var12[2] * var14) >> 12;
                    } else {
                        var10 = var11[1];
                        var8 = var11[2];
                        var9 = var11[3];
                    }
                }
                int var15 = var8 >> 4;
                int var16 = var9 >> 4;
                if (var15 < 0) {
                    var15 = 0;
                } else if (var15 > 255) {
                    var15 = 255;
                }
                if (var16 < 0) {
                    var16 = 0;
                } else if (var16 > 255) {
                    var16 = 255;
                }
                int var17 = var10 >> 4;
                if (var17 >= 0) {
                    if (~var17 < -256) {
                        var17 = 255;
                    }
                } else {
                    var17 = 0;
                }
                this.field4045[var3] = class270.method1797(var16, class270.method1797(var15 << 8, var17 << 16));
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "()V")
    public class226() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method17(int arg0, boolean arg1) {
        int[][] var3 = super.field4705.method1089(arg0, 84);
        if (super.field4705.field2670) {
            int[] var4 = this.method1767(0, arg0, 21654);
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int[] var7 = var3[0];
            for (int var8 = 0; class176.field3060 > var8; ++var8) {
                int var9 = var4[var8] >> 4;
                if (~var9 > -1) {
                    var9 = 0;
                }
                if (~var9 < -257) {
                    var9 = 256;
                }
                int var10 = this.field4045[var9];
                var7[var8] = class58.method333(4080, var10 >> 12);
                var5[var8] = class58.method333(65280, var10) >> 4;
                var6[var8] = class58.method333(255, var10) << 4;
            }
        }
        ++field4046;
        if (arg1) {
            this.field4051 = null;
        }
        return var3;
    }
}
