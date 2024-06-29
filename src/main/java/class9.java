import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class9 extends class93 {

    @OriginalMember(owner = "client!ah", name = "S", descriptor = "I")
    private int field322 = 1;

    @OriginalMember(owner = "client!ah", name = "Y", descriptor = "I")
    private int field328 = 1;

    @OriginalMember(owner = "client!ah", name = "gb", descriptor = "I")
    public static int field336 = (int) (17.0D * Math.random()) - 8;

    @OriginalMember(owner = "client!ah", name = "fb", descriptor = "J")
    public static volatile long field335 = 0L;

    @OriginalMember(owner = "client!ah", name = "X", descriptor = "I")
    public static int field327 = 0;

    @OriginalMember(owner = "client!ah", name = "hb", descriptor = "[I")
    public static int[] field337 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!ah", name = "W", descriptor = "Ljd;")
    public static class92 field326 = class202.method1325((byte) 90, "und loggen sich dann erneut ein)3");

    @OriginalMember(owner = "client!ah", name = "db", descriptor = "I")
    public static int field333 = 0;

    @OriginalMember(owner = "client!ah", name = "Z", descriptor = "Lf;")
    public static class51 field329 = new class51(0, 0);

    @OriginalMember(owner = "client!ah", name = "kb", descriptor = "Ljd;")
    public static class92 field340 = class202.method1325((byte) 90, "Hier wechseln");

    @OriginalMember(owner = "client!ah", name = "T", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!ah", name = "U", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!ah", name = "V", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!ah", name = "ab", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!ah", name = "bb", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!ah", name = "cb", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!ah", name = "eb", descriptor = "I")
    public static int field334;

    @OriginalMember(owner = "client!ah", name = "ib", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!ah", name = "jb", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "(I)Z")
    public static final boolean method58(int arg0) {
        ++field332;
        if (class66.field1334 == null) {
            return false;
        } else {
            try {
                int var1 = class66.field1334.method326(arg0 ^ arg0);
                if (var1 == 0) {
                    return false;
                }
                if (~class61.field1265 == 0) {
                    --var1;
                    class66.field1334.method318(0, (byte) 75, 1, class185.field3497.field1493);
                    class185.field3497.field1472 = 0;
                    class61.field1265 = class185.field3497.method404(true);
                    class148.field2930 = class77.field1599[class61.field1265];
                }
                if (class148.field2930 == -1) {
                    if (~var1 >= -1) {
                        return false;
                    }
                    --var1;
                    class66.field1334.method318(0, (byte) 112, 1, class185.field3497.field1493);
                    class148.field2930 = 255 & class185.field3497.field1493[0];
                }
                if (~class148.field2930 == 1) {
                    if (var1 <= 1) {
                        return false;
                    }
                    var1 -= 2;
                    class66.field1334.method318(0, (byte) 59, 2, class185.field3497.field1493);
                    class185.field3497.field1472 = 0;
                    class148.field2930 = class185.field3497.method442(-21351);
                }
                if (class148.field2930 > var1) {
                    return false;
                }
                class185.field3497.field1472 = 0;
                class66.field1334.method318(0, (byte) 64, class148.field2930, class185.field3497.field1493);
                class3.field174 = class44.field988;
                class119.field2415 = 0;
                class44.field988 = class98.field1991;
                class98.field1991 = class61.field1265;
                if (class61.field1265 == 22) {
                    int var2 = class185.field3497.method453(115);
                    int var3 = class185.field3497.method442(-21351);
                    if (~var2 > 69999) {
                        var3 += 32768;
                    }
                    class1 var4;
                    if (var2 < 0) {
                        var4 = null;
                    } else {
                        var4 = class175.method1155(var2, (byte) 56);
                    }
                    while (class148.field2930 > class185.field3497.field1472) {
                        int var5 = class185.field3497.method430(true);
                        int var6 = 0;
                        int var7 = class185.field3497.method442(arg0 ^ 21365);
                        if (var7 != 0) {
                            var6 = class185.field3497.method443(arg0 + 275);
                            if (var6 == 255) {
                                var6 = class185.field3497.method453(27);
                            }
                        }
                        if (var4 != null && var5 >= 0 && ~var4.field133.length < ~var5) {
                            var4.field133[var5] = var7;
                            var4.field60[var5] = var6;
                        }
                        class131.method864(var7 + -1, var3, var6, 18061, var5);
                    }
                    if (var4 != null) {
                        class3.method21(arg0 ^ -26718, var4);
                    }
                    class28.method179(0);
                    class185.field3503[class196.method1301(class166.field3269++, 31)] = class196.method1301(var3, 32767);
                    class61.field1265 = -1;
                    return true;
                }
                if (~class61.field1265 == -81) {
                    int var8 = class185.field3497.method433(-3);
                    int var9 = class185.field3497.method425((byte) -101);
                    if (~var9 == -65536) {
                        var9 = -1;
                    }
                    class1 var10 = class175.method1155(var8, (byte) -103);
                    if (~var10.field50 != -3 || var10.field131 != var9) {
                        var10.field131 = var9;
                        var10.field50 = 2;
                        class3.method21(26702, var10);
                    }
                    class61.field1265 = -1;
                    return true;
                }
                if (class61.field1265 == 171) {
                    for (int var11 = 0; class172.field3347.length > var11; ++var11) {
                        if (class172.field3347[var11] != null) {
                            class172.field3347[var11].field215 = -1;
                        }
                    }
                    for (int var12 = 0; var12 < class107.field2187.length; ++var12) {
                        if (class107.field2187[var12] != null) {
                            class107.field2187[var12].field215 = -1;
                        }
                    }
                    class61.field1265 = -1;
                    return true;
                }
                if (~class61.field1265 == -7) {
                    for (int var13 = 0; class12.field368 > var13; ++var13) {
                        class29 var14 = class55.method325(var13, 28037);
                        if (var14 != null && ~var14.field635 == -1) {
                            class44.field983[var13] = 0;
                            class165.field3242[var13] = 0;
                        }
                    }
                    class28.method179(0);
                    class61.field1265 = -1;
                    class162.field3175 += 32;
                    return true;
                }
                if (~class61.field1265 == -105) {
                    int var15 = class185.field3497.method451(83);
                    class92 var16 = class185.field3497.method437((byte) 80);
                    class1 var17 = class175.method1155(var15, (byte) 69);
                    if (!var16.method631(5003, var17.field9)) {
                        var17.field9 = var16;
                        class3.method21(26702, var17);
                    }
                    class61.field1265 = -1;
                    return true;
                }
                if (class61.field1265 == 83) {
                    class102.field2100 = class185.field3497.method443(255);
                    class195.field3808 = class185.field3497.method443(255);
                    while (class185.field3497.field1472 < class148.field2930) {
                        class61.field1265 = class185.field3497.method443(255);
                        class208.method1350(127);
                    }
                    class61.field1265 = -1;
                    return true;
                }
                if (~class61.field1265 == -229) {
                    long var18 = class185.field3497.method448(arg0 + 78);
                    int var20 = class185.field3497.method442(-21351);
                    byte var21 = class185.field3497.method431(arg0 + -12449);
                    boolean var22 = false;
                    if (~(Long.MIN_VALUE & var18) != -1L) {
                        var22 = true;
                    }
                    if (var22) {
                        if (~field338 == -1) {
                            class61.field1265 = -1;
                            return true;
                        }
                        long var23 = var18 & Long.MAX_VALUE;
                        boolean var25 = false;
                        int var26;
                        for (var26 = 0; ~field338 < ~var26 && (class68.field1382[var26].field4079 != var23 || ~class68.field1382[var26].field889 != ~var20); ++var26) {
                        }
                        if (~field338 < ~var26) {
                            while (var26 < field338 + -1) {
                                class68.field1382[var26] = class68.field1382[var26 + 1];
                                ++var26;
                            }
                            --field338;
                            class68.field1382[field338] = null;
                        }
                    } else {
                        class92 var27 = class185.field3497.method437((byte) 104);
                        class39 var28 = new class39();
                        var28.field4079 = var18;
                        var28.field887 = class129.method855(false, var28.field4079);
                        var28.field889 = var20;
                        var28.field877 = var27;
                        var28.field884 = var21;
                        int var29;
                        for (var29 = field338 - 1; ~var29 <= -1; --var29) {
                            int var30 = class68.field1382[var29].field887.method608(var28.field887, 1);
                            if (var30 == 0) {
                                class68.field1382[var29].field889 = var20;
                                class68.field1382[var29].field884 = var21;
                                class68.field1382[var29].field877 = var27;
                                if (class89.field1754 == var18) {
                                    class28.field626 = var21;
                                }
                                class114.field2312 = class186.field3516;
                                class61.field1265 = -1;
                                return true;
                            }
                            if (var30 < 0) {
                                break;
                            }
                        }
                        if (field338 >= class68.field1382.length) {
                            class61.field1265 = -1;
                            return true;
                        }
                        for (int var31 = field338 + -1; ~var31 < ~var29; --var31) {
                            class68.field1382[var31 - -1] = class68.field1382[var31];
                        }
                        if (~field338 == -1) {
                            class68.field1382 = new class39[100];
                        }
                        class68.field1382[var29 - -1] = var28;
                        ++field338;
                        if (~class89.field1754 == ~var18) {
                            class28.field626 = var21;
                        }
                    }
                    class61.field1265 = -1;
                    class114.field2312 = class186.field3516;
                    return true;
                }
                if (class61.field1265 == 149) {
                    int var32 = class185.field3497.method442(arg0 ^ 21365);
                    int var33 = class185.field3497.method433(-3);
                    class1 var34 = class175.method1155(var33, (byte) -118);
                    if (var34 != null && var34.field10 == 0) {
                        if (~var32 < ~(var34.field73 - var34.field28)) {
                            var32 = -var34.field28 + var34.field73;
                        }
                        if (var32 < 0) {
                            var32 = 0;
                        }
                        if (var34.field48 != var32) {
                            var34.field48 = var32;
                            class3.method21(26702, var34);
                        }
                    }
                    class61.field1265 = -1;
                    return true;
                }
                if (~class61.field1265 == -133) {
                    class133.method882(-8306);
                    class61.field1265 = -1;
                    return true;
                }
                if (~class61.field1265 == -204) {
                    class6.method40(class185.field3497, arg0 + 20);
                    class61.field1265 = -1;
                    return true;
                }
                if (~class61.field1265 == -180) {
                    int var35 = class185.field3497.method442(-21351);
                    if (~var35 == -65536) {
                        var35 = -1;
                    }
                    int var36 = class185.field3497.method443(arg0 + 275);
                    int var37 = class185.field3497.method442(-21351);
                    class100.method696(var35, var36, var37, -18231);
                    class61.field1265 = -1;
                    return true;
                }
                if (class61.field1265 == 119) {
                    client.field690 = class185.field3497.method442(-21351) * 30;
                    class92.field1826 = class186.field3516;
                    class61.field1265 = -1;
                    return true;
                }
                if (class61.field1265 == 194) {
                    long var38 = class185.field3497.method448(74);
                    class92 var40 = class154.method988(class111.method753(class185.field3497, arg0 + 32787).method633((byte) -57));
                    class117.method788(class129.method855(false, var38).method617(1), -19001, 6, var40);
                    class61.field1265 = -1;
                    return true;
                }
                if (class61.field1265 == 90) {
                    int var41 = class185.field3497.method443(255);
                    int var42 = class185.field3497.method443(arg0 ^ -237);
                    int var43 = class185.field3497.method443(255);
                    int var44 = class185.field3497.method443(arg0 + 275);
                    int var45 = class185.field3497.method442(-21351);
                    class32.field728[var41] = true;
                    class130.field2615[var41] = var42;
                    class110.field2246[var41] = var43;
                    class88.field1745[var41] = var44;
                    class93.field1876[var41] = var45;
                    class61.field1265 = -1;
                    return true;
                }
                if (class61.field1265 == 118) {
                    class86.field1714 = class185.field3497.method437((byte) 112);
                    class192.method1266(class86.field1714, arg0 + -99);
                    class61.field1265 = -1;
                    return true;
                }
                if (class61.field1265 == 156) {
                    int var46 = class185.field3497.method451(115);
                    class1 var47 = class175.method1155(var46, (byte) -100);
                    for (int var48 = 0; var47.field133.length > var48; ++var48) {
                        var47.field133[var48] = -1;
                        var47.field133[var48] = 0;
                    }
                    class3.method21(26702, var47);
                    class61.field1265 = -1;
                    return true;
                }
                if (~class61.field1265 == -193) {
                    long var49 = class185.field3497.method448(50);
                    class185.field3497.method431(arg0 + -12449);
                    long var51 = class185.field3497.method448(40);
                    long var53 = (long) class185.field3497.method442(arg0 ^ 21365);
                    long var55 = (long) class185.field3497.method415(-128);
                    long var57 = (var53 << 32) + var55;
                    int var59 = class185.field3497.method443(255);
                    boolean var60 = false;
                    for (int var61 = 0; var61 < 100; ++var61) {
                        if (~class20.field493[var61] == ~var57) {
                            var60 = true;
                            break;
                        }
                    }
                    if (var59 <= 1) {
                        for (int var62 = 0; ~class64.field1302 < ~var62; ++var62) {
                            if (~class144.field2880[var62] == ~var49) {
                                var60 = true;
                                break;
                            }
                        }
                    }
                    if (!var60 && ~class197.field3859 == -1) {
                        class20.field493[class46.field1014] = var57;
                        class46.field1014 = (class46.field1014 + 1) % 100;
                        class92 var63 = class154.method988(class111.method753(class185.field3497, 32767).method633((byte) -57));
                        if (~var59 != -3 && ~var59 != -4) {
                            if (var59 == 1) {
                                class2.method20(var63, 0, 9, class77.method529(-3, new class92[] { class118.field2395, class129.method855(false, var49).method617(arg0 ^ -19) }), class129.method855(false, var51).method617(1));
                            } else {
                                class2.method20(var63, arg0 + 20, 9, class129.method855(false, var49).method617(arg0 + 21), class129.method855(false, var51).method617(1));
                            }
                        } else {
                            class2.method20(var63, 0, 9, class77.method529(arg0 ^ 17, new class92[] { class64.field1316, class129.method855(false, var49).method617(1) }), class129.method855(false, var51).method617(1));
                        }
                    }
                    class61.field1265 = -1;
                    return true;
                }
                if (~class61.field1265 == -162) {
                    int var64 = class185.field3497.method435(true);
                    class1 var65 = class175.method1155(var64, (byte) -105);
                    var65.field50 = 3;
                    var65.field131 = class15.field423.field1799.method582(-121);
                    class3.method21(arg0 ^ -26718, var65);
                    class61.field1265 = -1;
                    return true;
                }
                if (class61.field1265 == 46) {
                    boolean var66 = ~class185.field3497.method461(-1) == -2;
                    int var67 = class185.field3497.method453(121);
                    class1 var68 = class175.method1155(var67, (byte) 60);
                    if (var68.field76 != var66) {
                        var68.field76 = var66;
                        class3.method21(arg0 + 26722, var68);
                    }
                    class61.field1265 = -1;
                    return true;
                }
                if (~class61.field1265 == -104) {
                    int var69 = class185.field3497.field1472 - -class148.field2930;
                    int var70 = class185.field3497.method442(-21351);
                    int var71 = class185.field3497.method442(-21351);
                    if (~class197.field3836 != ~var70) {
                        class197.field3836 = var70;
                        class98.method687(class197.field3836, arg0 + 131);
                        class52.method309(class197.field3836, true);
                        for (int var72 = 0; var72 < 100; ++var72) {
                            class55.field1143[var72] = true;
                        }
                    }
                    while (var71-- > 0) {
                        int var73 = class185.field3497.method453(117);
                        int var74 = class185.field3497.method442(-21351);
                        int var75 = class185.field3497.method443(255);
                        class105 var76 = (class105) class118.field2394.method216(-98, (long) var73);
                        if (var76 != null && ~var76.field2155 != ~var74) {
                            class100.method693(false, var76, true);
                            var76 = null;
                        }
                        if (var76 == null) {
                            var76 = class124.method835(var75, var73, 0, var74);
                        }
                        var76.field2149 = true;
                    }
                    for (class105 var77 = (class105) class118.field2394.method215((byte) -51); var77 != null; var77 = (class105) class118.field2394.method209(false)) {
                        if (var77.field2149) {
                            var77.field2149 = false;
                        } else {
                            class100.method693(false, var77, true);
                        }
                    }
                    class144.field2883 = new class33(512);
                    while (var69 > class185.field3497.field1472) {
                        int var78 = class185.field3497.method453(arg0 ^ -110);
                        int var79 = class185.field3497.method442(-21351);
                        int var80 = class185.field3497.method442(-21351);
                        int var81 = class185.field3497.method453(49);
                        for (int var82 = var79; ~var80 <= ~var82; ++var82) {
                            long var83 = ((long) var78 << 32) + (long) var82;
                            class144.field2883.method210((byte) -125, var83, new class130(var81));
                        }
                    }
                    class61.field1265 = -1;
                    return true;
                }
                if (class61.field1265 == 106) {
                    int var85 = class185.field3497.method465(255);
                    if (var85 == 65535) {
                        var85 = -1;
                    }
                    int var86 = class185.field3497.method433(-3);
                    int var87 = class185.field3497.method435(true);
                    class1 var88 = class175.method1155(var86, (byte) -96);
                    if (var88.field94) {
                        var88.field37 = var85;
                        var88.field87 = var87;
                        class107 var89 = class92.method626((byte) 59, var85);
                        var88.field31 = var89.field2219;
                        var88.field56 = var89.field2205;
                        var88.field7 = var89.field2177;
                        var88.field132 = var89.field2214;
                        var88.field106 = var89.field2203;
                        if (var88.field96 > 0) {
                            var88.field132 = var88.field132 * 32 / var88.field96;
                        }
                        var88.field5 = var89.field2194;
                        class3.method21(26702, var88);
                    } else {
                        if (var85 == -1) {
                            class61.field1265 = -1;
                            var88.field50 = 0;
                            return true;
                        }
                        class107 var90 = class92.method626((byte) 59, var85);
                        var88.field106 = var90.field2203;
                        var88.field132 = var90.field2214 * 100 / var87;
                        var88.field131 = var85;
                        var88.field56 = var90.field2205;
                        var88.field50 = 4;
                        class3.method21(26702, var88);
                    }
                    class61.field1265 = -1;
                    return true;
                }
                if (class61.field1265 == 115) {
                    class148.method962(class185.field3497, class148.field2930, class140.field2817, true);
                    class61.field1265 = -1;
                    return true;
                }
                if (~class61.field1265 == -53) {
                    int var91 = class185.field3497.method465(arg0 ^ -237);
                    int var92 = class185.field3497.method451(35);
                    class44.field983[var91] = var92;
                    if (~class165.field3242[var91] != ~var92) {
                        class165.field3242[var91] = var92;
                        class139.method924(var91, (byte) 125);
                    }
                    class156.field3111[class196.method1301(class162.field3175++, 31)] = var91;
                    class61.field1265 = -1;
                    return true;
                }
                if (~class61.field1265 == -188) {
                    int var93 = class185.field3497.method451(arg0 ^ -51);
                    int var94 = class185.field3497.method414((byte) -16);
                    int var95 = class185.field3497.method414((byte) -16);
                    class1 var96 = class175.method1155(var93, (byte) -126);
                    var96.field34 = (var94 << 16) + var95;
                    class61.field1265 = -1;
                    return true;
                }
                if (class61.field1265 == 65) {
                    int var97 = class185.field3497.method411(-90);
                    int var98 = class185.field3497.method443(arg0 + 275);
                    int var99 = class185.field3497.method461(-1);
                    class81.field1639 = var99 >> 1;
                    class15.field423.method29(var98, ~(var99 & 1) == -2, var97, 3);
                    class61.field1265 = -1;
                    return true;
                }
                if (~class61.field1265 == -148) {
                    long var100 = class185.field3497.method448(arg0 + 75);
                    int var102 = class185.field3497.method442(-21351);
                    int var103 = class185.field3497.method443(255);
                    class92 var104 = class3.field189;
                    if (~var102 < -1) {
                        var104 = class185.field3497.method437((byte) 64);
                    }
                    class92 var105 = class129.method855(false, var100).method617(1);
                    for (int var106 = 0; ~class166.field3273 < ~var106; ++var106) {
                        if (~class93.field1878[var106] == ~var100) {
                            if (class148.field2936[var106] != var102) {
                                class148.field2936[var106] = var102;
                                if (var102 > 0) {
                                    class117.method788(class3.field189, -19001, 5, class77.method529(arg0 ^ 17, new class92[] { var105, class152.field3024 }));
                                }
                                if (~var102 == -1) {
                                    class117.method788(class3.field189, -19001, 5, class77.method529(-3, new class92[] { var105, class140.field2803 }));
                                }
                            }
                            class34.field776[var106] = var104;
                            var105 = null;
                            class116.field2346[var106] = var103;
                            break;
                        }
                    }
                    boolean var107 = false;
                    if (var105 != null && class166.field3273 < 200) {
                        class93.field1878[class166.field3273] = var100;
                        class27.field603[class166.field3273] = var105;
                        class148.field2936[class166.field3273] = var102;
                        class34.field776[class166.field3273] = var104;
                        class116.field2346[class166.field3273] = var103;
                        ++class166.field3273;
                    }
                    class136.field2732 = class186.field3516;
                    int var108 = class166.field3273;
                    while (var108 > 0) {
                        boolean var109 = true;
                        --var108;
                        for (int var110 = 0; ~var108 < ~var110; ++var110) {
                            if (class148.field2936[var110] != class77.field1606 && class148.field2936[var110 - -1] == class77.field1606 || class148.field2936[var110] == 0 && ~class148.field2936[var110 - -1] != -1) {
                                var109 = false;
                                int var111 = class148.field2936[var110];
                                class148.field2936[var110] = class148.field2936[var110 + 1];
                                class148.field2936[var110 + 1] = var111;
                                class92 var112 = class34.field776[var110];
                                class34.field776[var110] = class34.field776[var110 + 1];
                                class34.field776[var110 + 1] = var112;
                                class92 var113 = class27.field603[var110];
                                class27.field603[var110] = class27.field603[var110 - -1];
                                class27.field603[var110 - -1] = var113;
                                long var114 = class93.field1878[var110];
                                class93.field1878[var110] = class93.field1878[var110 + 1];
                                class93.field1878[var110 - -1] = var114;
                                int var116 = class116.field2346[var110];
                                class116.field2346[var110] = class116.field2346[var110 + 1];
                                class116.field2346[var110 + 1] = var116;
                            }
                        }
                        if (var109) {
                            break;
                        }
                    }
                    class61.field1265 = -1;
                    return true;
                }
                if (~class61.field1265 == -108) {
                    class3.method22(false, (byte) -45);
                    class61.field1265 = -1;
                    return true;
                }
                if (class61.field1265 == 108) {
                    class92 var117 = class185.field3497.method437((byte) 89);
                    Object[] var118 = new Object[1 + var117.method640(true)];
                    for (int var119 = -1 + var117.method640(true); var119 >= 0; --var119) {
                        if (var117.method635((byte) 83, var119) != 115) {
                            var118[var119 + 1] = new Integer(class185.field3497.method453(67));
                        } else {
                            var118[var119 + 1] = class185.field3497.method437((byte) 111);
                        }
                    }
                    var118[0] = new Integer(class185.field3497.method453(75));
                    class156 var120 = new class156();
                    var120.field3108 = var118;
                    class2.method18(var120, 6645);
                    class61.field1265 = -1;
                    return true;
                }
                if (~class61.field1265 == -149) {
                    int var121 = class185.field3497.method451(95);
                    int var122 = class185.field3497.method442(-21351);
                    int var123 = class185.field3497.method442(-21351);
                    int var124 = class185.field3497.method465(arg0 + 275);
                    class1 var125 = class175.method1155(var121, (byte) 42);
                    if (var125.field56 != var122 || ~var125.field106 != ~var124 || var125.field132 != var123) {
                        var125.field56 = var122;
                        var125.field132 = var123;
                        var125.field106 = var124;
                        class3.method21(26702, var125);
                    }
                    class61.field1265 = -1;
                    return true;
                }
                if (~class61.field1265 == -216) {
                    long var126 = class185.field3497.method448(79);
                    long var128 = (long) class185.field3497.method442(-21351);
                    long var130 = (long) class185.field3497.method415(-76);
                    long var132 = (var128 << 32) + var130;
                    int var134 = class185.field3497.method443(255);
                    boolean var135 = false;
                    for (int var136 = 0; var136 < 100; ++var136) {
                        if (~class20.field493[var136] == ~var132) {
                            var135 = true;
                            break;
                        }
                    }
                    if (var134 <= 1) {
                        for (int var137 = 0; class64.field1302 > var137; ++var137) {
                            if (class144.field2880[var137] == var126) {
                                var135 = true;
                                break;
                            }
                        }
                    }
                    if (!var135 && class197.field3859 == 0) {
                        class20.field493[class46.field1014] = var132;
                        class46.field1014 = (class46.field1014 + 1) % 100;
                        class92 var138 = class154.method988(class111.method753(class185.field3497, 32767).method633((byte) -57));
                        if (var134 != 2 && ~var134 != -4) {
                            if (~var134 != -2) {
                                class117.method788(class129.method855(false, var126).method617(1), arg0 ^ 18987, 3, var138);
                            } else {
                                class117.method788(class77.method529(-3, new class92[] { class118.field2395, class129.method855(false, var126).method617(arg0 + 21) }), arg0 + -18981, 7, var138);
                            }
                        } else {
                            class117.method788(class77.method529(-3, new class92[] { class64.field1316, class129.method855(false, var126).method617(arg0 + 21) }), -19001, 7, var138);
                        }
                    }
                    class61.field1265 = -1;
                    return true;
                }
                if (class61.field1265 == 40) {
                    int var139 = class185.field3497.method420((byte) -91);
                    int var140 = class185.field3497.method453(65);
                    class1 var141 = class175.method1155(var140, (byte) -87);
                    if (~var141.field27 != ~var139 || var139 == -1) {
                        var141.field27 = var139;
                        var141.field130 = 0;
                        var141.field140 = 0;
                        class3.method21(26702, var141);
                    }
                    class61.field1265 = -1;
                    return true;
                }
                if (class61.field1265 == 191) {
                    int var142 = class185.field3497.method414((byte) -16);
                    class197.field3836 = var142;
                    class98.method687(var142, -60);
                    class52.method309(class197.field3836, true);
                    for (int var143 = 0; ~var143 > -101; ++var143) {
                        class55.field1143[var143] = true;
                    }
                    class61.field1265 = -1;
                    return true;
                }
                if (~class61.field1265 == -206) {
                    class28.method179(arg0 + 20);
                    class49.field1074 = class185.field3497.method417((byte) -95);
                    class61.field1265 = -1;
                    class92.field1826 = class186.field3516;
                    return true;
                }
                if (~class61.field1265 == -247) {
                    int var144 = class185.field3497.method453(arg0 ^ -90);
                    int var145 = class185.field3497.method456(-119);
                    int var146 = class185.field3497.method456(-109);
                    class1 var147 = class175.method1155(var144, (byte) 71);
                    int var148 = var147.field40 + var145;
                    int var149 = var147.field118 - -var146;
                    if (~var147.field79 != ~var148 || var147.field11 != var149) {
                        var147.field11 = var149;
                        var147.field79 = var148;
                        class3.method21(arg0 + 26722, var147);
                    }
                    class61.field1265 = -1;
                    return true;
                }
                if (~class61.field1265 == -208) {
                    int var150 = class185.field3497.method442(-21351);
                    if (var150 == 65535) {
                        var150 = -1;
                    }
                    int var151 = class185.field3497.method453(75);
                    class1 var152 = class175.method1155(var151, (byte) 105);
                    if (~var152.field50 != -2 || ~var152.field131 != ~var150) {
                        var152.field131 = var150;
                        var152.field50 = 1;
                        class3.method21(26702, var152);
                    }
                    class61.field1265 = -1;
                    return true;
                }
                if (class61.field1265 == 234) {
                    class125.method837(false);
                    class61.field1265 = -1;
                    return true;
                }
                if (class61.field1265 == 173) {
                    class114.field2312 = class186.field3516;
                    long var153 = class185.field3497.method448(97);
                    if (~var153 == -1L) {
                        class61.field1265 = -1;
                        class113.field2279 = null;
                        field338 = 0;
                        class68.field1382 = null;
                        class34.field770 = null;
                        return true;
                    }
                    long var155 = class185.field3497.method448(65);
                    class34.field770 = class129.method855(false, var155);
                    class113.field2279 = class129.method855(false, var153);
                    class6.field291 = class185.field3497.method431(arg0 + -12449);
                    int var157 = class185.field3497.method443(255);
                    if (~var157 == -256) {
                        class61.field1265 = -1;
                        return true;
                    }
                    field338 = var157;
                    class39[] var158 = new class39[100];
                    for (int var159 = 0; ~var159 > ~field338; ++var159) {
                        var158[var159] = new class39();
                        var158[var159].field4079 = class185.field3497.method448(117);
                        var158[var159].field887 = class129.method855(false, var158[var159].field4079);
                        var158[var159].field889 = class185.field3497.method442(-21351);
                        var158[var159].field884 = class185.field3497.method431(-12469);
                        var158[var159].field877 = class185.field3497.method437((byte) 84);
                        if (class89.field1754 == var158[var159].field4079) {
                            class28.field626 = var158[var159].field884;
                        }
                    }
                    boolean var160 = false;
                    int var161 = field338;
                    while (var161 > 0) {
                        --var161;
                        boolean var162 = true;
                        for (int var163 = 0; var161 > var163; ++var163) {
                            if (~var158[var163].field887.method608(var158[var163 + 1].field887, 1) < -1) {
                                var162 = false;
                                class39 var164 = var158[var163];
                                var158[var163] = var158[var163 + 1];
                                var158[var163 + 1] = var164;
                            }
                        }
                        if (var162) {
                            break;
                        }
                    }
                    class61.field1265 = -1;
                    class68.field1382 = var158;
                    return true;
                }
                if (class61.field1265 == 236) {
                    int var165 = class185.field3497.method425((byte) -101);
                    class166.method1082(var165, (byte) 69);
                    class185.field3503[class196.method1301(class166.field3269++, 31)] = class196.method1301(var165, 32767);
                    class61.field1265 = -1;
                    return true;
                }
                if (~class61.field1265 == -236) {
                    if (class197.field3836 != -1) {
                        class81.method551(class197.field3836, 0, (byte) 118);
                    }
                    class61.field1265 = -1;
                    return true;
                }
                if (~class61.field1265 == -103) {
                    int var166 = class185.field3497.method442(-21351);
                    int var167 = class185.field3497.method414((byte) -16);
                    class61.field1265 = -1;
                    class18.field451 = var167;
                    class4.field268 = var166;
                    return true;
                }
                if (~class61.field1265 == -211) {
                    int var168 = class185.field3497.method453(75);
                    int var169 = class185.field3497.method442(-21351);
                    if (~var168 > 69999) {
                        var169 += 32768;
                    }
                    class1 var170;
                    if (var168 >= 0) {
                        var170 = class175.method1155(var168, (byte) -124);
                    } else {
                        var170 = null;
                    }
                    if (var170 != null) {
                        for (int var171 = 0; var170.field133.length > var171; ++var171) {
                            var170.field133[var171] = 0;
                            var170.field60[var171] = 0;
                        }
                    }
                    class115.method781(-1, var169);
                    int var172 = class185.field3497.method442(-21351);
                    for (int var173 = 0; ~var172 < ~var173; ++var173) {
                        int var174 = class185.field3497.method443(arg0 ^ -237);
                        if (~var174 == -256) {
                            var174 = class185.field3497.method435(true);
                        }
                        int var175 = class185.field3497.method414((byte) -16);
                        if (var170 != null && var173 < var170.field133.length) {
                            var170.field133[var173] = var175;
                            var170.field60[var173] = var174;
                        }
                        class131.method864(var175 + -1, var169, var174, 18061, var173);
                    }
                    if (var170 != null) {
                        class3.method21(arg0 ^ -26718, var170);
                    }
                    class28.method179(0);
                    class185.field3503[class196.method1301(31, class166.field3269++)] = class196.method1301(32767, var169);
                    class61.field1265 = -1;
                    return true;
                }
                if (class61.field1265 == 151) {
                    class92.field1832 = class185.field3497.method443(arg0 + 275);
                    class61.field1265 = -1;
                    class136.field2732 = class186.field3516;
                    return true;
                }
                if (class61.field1265 == 199) {
                    class92 var176 = class185.field3497.method437((byte) 94);
                    if (var176.method625((byte) 78, class202.field3921)) {
                        class92 var177 = var176.method629(var176.method615(class36.field830, true), 0, arg0 ^ -20);
                        long var178 = var177.method609(10354);
                        boolean var180 = false;
                        for (int var181 = 0; ~var181 > ~class64.field1302; ++var181) {
                            if (class144.field2880[var181] == var178) {
                                var180 = true;
                                break;
                            }
                        }
                        if (!var180 && ~class197.field3859 == -1) {
                            class117.method788(var177, -19001, 4, class66.field1335);
                        }
                    } else if (!var176.method625((byte) 78, class34.field781)) {
                        if (!var176.method625((byte) 78, class2.field167)) {
                            if (var176.method625((byte) 78, class7.field315)) {
                                class92 var199 = var176.method629(var176.method615(class7.field315, true), 0, 0);
                                class117.method788(class3.field189, -19001, 11, var199);
                            } else if (var176.method625((byte) 78, class6.field287)) {
                                class92 var182 = var176.method629(var176.method615(class6.field287, true), 0, 0);
                                if (~class197.field3859 == -1) {
                                    class117.method788(class3.field189, -19001, 12, var182);
                                }
                            } else if (var176.method625((byte) 78, class84.field1691)) {
                                class92 var198 = var176.method629(var176.method615(class84.field1691, true), 0, 0);
                                if (class197.field3859 == 0) {
                                    class117.method788(class3.field189, arg0 + -18981, 13, var198);
                                }
                            } else if (var176.method625((byte) 78, class177.field3413)) {
                                class92 var183 = var176.method629(var176.method615(class36.field830, true), 0, 0);
                                long var184 = var183.method609(10354);
                                boolean var186 = false;
                                for (int var187 = 0; ~class64.field1302 < ~var187; ++var187) {
                                    if (class144.field2880[var187] == var184) {
                                        var186 = true;
                                        break;
                                    }
                                }
                                if (!var186 && ~class197.field3859 == -1) {
                                    class117.method788(var183, arg0 + -18981, 14, class3.field189);
                                }
                            } else if (var176.method625((byte) 78, class101.field2070)) {
                                boolean var188 = false;
                                class92 var189 = var176.method629(var176.method615(class36.field830, true), 0, 0);
                                long var190 = var189.method609(10354);
                                for (int var192 = 0; ~var192 > ~class64.field1302; ++var192) {
                                    if (~class144.field2880[var192] == ~var190) {
                                        var188 = true;
                                        break;
                                    }
                                }
                                if (!var188 && ~class197.field3859 == -1) {
                                    class117.method788(var189, -19001, 15, class3.field189);
                                }
                            } else if (!var176.method625((byte) 78, class99.field2013)) {
                                class117.method788(class3.field189, -19001, 0, var176);
                            } else {
                                class92 var193 = var176.method629(var176.method615(class36.field830, true), 0, 0);
                                long var194 = var193.method609(10354);
                                boolean var196 = false;
                                for (int var197 = 0; var197 < class64.field1302; ++var197) {
                                    if (~class144.field2880[var197] == ~var194) {
                                        var196 = true;
                                        break;
                                    }
                                }
                                if (!var196 && class197.field3859 == 0) {
                                    class117.method788(var193, -19001, 16, class3.field189);
                                }
                            }
                        } else {
                            class92 var200 = var176.method629(var176.method615(class36.field830, true), 0, 0);
                            long var201 = var200.method609(10354);
                            boolean var203 = false;
                            for (int var204 = 0; ~class64.field1302 < ~var204; ++var204) {
                                if (class144.field2880[var204] == var201) {
                                    var203 = true;
                                    break;
                                }
                            }
                            if (!var203 && ~class197.field3859 == -1) {
                                class117.method788(var200, arg0 + -18981, 10, class3.field189);
                            }
                        }
                    } else {
                        class92 var205 = var176.method629(var176.method615(class36.field830, true), 0, 0);
                        long var206 = var205.method609(arg0 ^ -10338);
                        boolean var208 = false;
                        for (int var209 = 0; class64.field1302 > var209; ++var209) {
                            if (class144.field2880[var209] == var206) {
                                var208 = true;
                                break;
                            }
                        }
                        if (!var208 && ~class197.field3859 == -1) {
                            class92 var210 = var176.method629(-9 + var176.method640(true), 1 + var176.method615(class36.field830, true), arg0 + 20);
                            class117.method788(var205, -19001, 8, var210);
                        }
                    }
                    class61.field1265 = -1;
                    return true;
                }
                if (class61.field1265 == 226) {
                    for (int var211 = 0; ~var211 > ~class165.field3242.length; ++var211) {
                        if (class44.field983[var211] != class165.field3242[var211]) {
                            class165.field3242[var211] = class44.field983[var211];
                            class139.method924(var211, (byte) 125);
                            class156.field3111[class196.method1301(class162.field3175++, 31)] = var211;
                        }
                    }
                    class61.field1265 = -1;
                    return true;
                }
                if (class61.field1265 == 29) {
                    class65.field1319 = class185.field3497.method443(255);
                    class142.field2835 = class185.field3497.method443(255);
                    class60.field1245 = class185.field3497.method443(255);
                    class61.field1265 = -1;
                    return true;
                }
                if (class61.field1265 == 135) {
                    class28.method179(0);
                    int var212 = class185.field3497.method411(108);
                    int var213 = class185.field3497.method411(arg0 ^ 111);
                    int var214 = class185.field3497.method435(true);
                    class135.field2700[var213] = var214;
                    class15.field428[var213] = var212;
                    class100.field2069[var213] = 1;
                    for (int var215 = 0; ~var215 > -99; ++var215) {
                        if (class68.field1368[var215] <= var214) {
                            class100.field2069[var213] = var215 - -2;
                        }
                    }
                    class98.field1993[class196.method1301(31, class123.field2471++)] = var213;
                    class61.field1265 = -1;
                    return true;
                }
                if (class61.field1265 == 43) {
                    class39.field883 = true;
                    class198.field3872 = class185.field3497.method443(255);
                    class111.field2251 = class185.field3497.method443(255);
                    class139.field2783 = class185.field3497.method442(-21351);
                    class159.field3155 = class185.field3497.method443(255);
                    class190.field3674 = class185.field3497.method443(arg0 ^ -237);
                    if (~class190.field3674 <= -101) {
                        int var216 = class198.field3872 * 128 - -64;
                        int var217 = class111.field2251 * 128 - -64;
                        int var218 = class118.method804(var216, class81.field1639, var217, 0) - class139.field2783;
                        int var219 = var216 - class132.field2645;
                        int var220 = -class124.field2511 + var218;
                        int var221 = var217 - class151.field2991;
                        int var222 = (int) Math.sqrt((double) (var219 * var219 - -(var221 * var221)));
                        class18.field451 = (int) (Math.atan2((double) var220, (double) var222) * 325.949D) & 2047;
                        class4.field268 = 2047 & (int) (-325.949D * Math.atan2((double) var219, (double) var221));
                        if (~class18.field451 > -129) {
                            class18.field451 = 128;
                        }
                        if (~class18.field451 < -384) {
                            class18.field451 = 383;
                        }
                    }
                    class61.field1265 = -1;
                    return true;
                }
                if (class61.field1265 == 175) {
                    class28.method179(0);
                    class174.field3367 = class185.field3497.method443(255);
                    class92.field1826 = class186.field3516;
                    class61.field1265 = -1;
                    return true;
                }
                if (class61.field1265 == 70) {
                    int var223 = class185.field3497.method414((byte) -16);
                    if (var223 == 65535) {
                        var223 = -1;
                    }
                    class80.method546(-1, var223);
                    class61.field1265 = -1;
                    return true;
                }
                if (class61.field1265 == 63) {
                    int var224 = class185.field3497.method462(-2);
                    int var225 = class185.field3497.method414((byte) -16);
                    if (var225 == 65535) {
                        var225 = -1;
                    }
                    class20.method128(var224, var225, 10661);
                    class61.field1265 = -1;
                    return true;
                }
                if (class61.field1265 == 109) {
                    class39.field883 = true;
                    class159.field3172 = class185.field3497.method443(255);
                    class124.field2509 = class185.field3497.method443(255);
                    class93.field1890 = class185.field3497.method442(arg0 ^ 21365);
                    class159.field3170 = class185.field3497.method443(255);
                    class121.field2459 = class185.field3497.method443(255);
                    if (~class121.field2459 <= -101) {
                        class132.field2645 = class159.field3172 * 128 + 64;
                        class151.field2991 = class124.field2509 * 128 + 64;
                        class124.field2511 = class118.method804(class132.field2645, class81.field1639, class151.field2991, 0) - class93.field1890;
                    }
                    class61.field1265 = -1;
                    return true;
                }
                if (class61.field1265 == 229) {
                    int var226 = class185.field3497.method442(-21351);
                    byte var227 = class185.field3497.method431(-12469);
                    class44.field983[var226] = var227;
                    if (class165.field3242[var226] != var227) {
                        class165.field3242[var226] = var227;
                        class139.method924(var226, (byte) 125);
                    }
                    class156.field3111[class196.method1301(class162.field3175++, 31)] = var226;
                    class61.field1265 = -1;
                    return true;
                }
                if (~class61.field1265 == -223) {
                    class61.field1265 = -1;
                    class4.field262 = 0;
                    return true;
                }
                if (class61.field1265 == 93 || class61.field1265 == 211 || ~class61.field1265 == -161 || class61.field1265 == 174 || class61.field1265 == 85 || ~class61.field1265 == -20 || ~class61.field1265 == -164 || ~class61.field1265 == -139 || class61.field1265 == 71 || ~class61.field1265 == -194 || ~class61.field1265 == -8) {
                    class208.method1350(121);
                    class61.field1265 = -1;
                    return true;
                }
                if (class61.field1265 == 217) {
                    int var228 = class185.field3497.method442(-21351);
                    int var229 = class185.field3497.method453(arg0 + 137);
                    int var230 = class185.field3497.method461(arg0 ^ 19);
                    class105 var231 = (class105) class118.field2394.method216(-101, (long) var229);
                    if (var231 != null) {
                        class100.method693(false, var231, var231.field2155 != var228);
                    }
                    class124.method835(var230, var229, arg0 + 20, var228);
                    class61.field1265 = -1;
                    return true;
                }
                if (~class61.field1265 == -106) {
                    int var232 = class185.field3497.method443(255);
                    class205 var233 = new class205();
                    int var234 = var232 >> 6;
                    var233.field3956 = var232 & 63;
                    var233.field3951 = class185.field3497.method443(255);
                    if (~var233.field3951 <= -1 && ~var233.field3951 > ~class212.field4106.length) {
                        if (var233.field3956 == 1 || var233.field3956 == 10) {
                            var233.field3958 = class185.field3497.method442(-21351);
                        }
                        if (var233.field3956 >= 2 && var233.field3956 <= 6) {
                            if (~var233.field3956 == -3) {
                                var233.field3948 = 64;
                                var233.field3943 = 64;
                            }
                            if (~var233.field3956 == -4) {
                                var233.field3943 = 64;
                                var233.field3948 = 0;
                            }
                            if (var233.field3956 == 4) {
                                var233.field3948 = 128;
                                var233.field3943 = 64;
                            }
                            if (~var233.field3956 == -6) {
                                var233.field3943 = 0;
                                var233.field3948 = 64;
                            }
                            if (~var233.field3956 == -7) {
                                var233.field3943 = 128;
                                var233.field3948 = 64;
                            }
                            var233.field3956 = 2;
                            var233.field3944 = class185.field3497.method442(-21351);
                            var233.field3955 = class185.field3497.method442(-21351);
                            var233.field3954 = class185.field3497.method443(arg0 + 275);
                        }
                        class135.field2711[var234] = var233;
                    }
                    class61.field1265 = -1;
                    return true;
                }
                if (~class61.field1265 == -67) {
                    class64.field1302 = class148.field2930 / 8;
                    for (int var235 = 0; ~class64.field1302 < ~var235; ++var235) {
                        class144.field2880[var235] = class185.field3497.method448(34);
                        class174.field3366[var235] = class129.method855(false, class144.field2880[var235]);
                    }
                    class61.field1265 = -1;
                    class136.field2732 = class186.field3516;
                    return true;
                }
                if (~class61.field1265 == -159) {
                    class102.field2100 = class185.field3497.method443(255);
                    class195.field3808 = class185.field3497.method418(73);
                    class61.field1265 = -1;
                    return true;
                }
                if (~class61.field1265 == -173) {
                    int var236 = class185.field3497.method453(120);
                    class48.field1043 = class140.field2817.method1120(var236, false);
                    class61.field1265 = -1;
                    return true;
                }
                if (~class61.field1265 == -24) {
                    class3.method22(true, (byte) -45);
                    class61.field1265 = -1;
                    return true;
                }
                if (~class61.field1265 == -29) {
                    int var237 = class185.field3497.method414((byte) -16);
                    int var238 = class185.field3497.method451(100);
                    int var239 = var237 >> 10 & 31;
                    int var240 = (var237 & 993) >> 5;
                    int var241 = 31 & var237;
                    int var242 = (var239 << 19) + (var240 << 11) + (var241 << 3);
                    class1 var243 = class175.method1155(var238, (byte) 98);
                    if (~var243.field8 != ~var242) {
                        var243.field8 = var242;
                        class3.method21(26702, var243);
                    }
                    class61.field1265 = -1;
                    return true;
                }
                if (class61.field1265 == 155) {
                    int var244 = class185.field3497.method453(111);
                    class105 var245 = (class105) class118.field2394.method216(arg0 + -85, (long) var244);
                    if (var245 != null) {
                        class100.method693(false, var245, true);
                    }
                    if (class93.field1897 != null) {
                        class3.method21(26702, class93.field1897);
                        class93.field1897 = null;
                    }
                    class61.field1265 = -1;
                    return true;
                }
                if (class61.field1265 == 227) {
                    class102.field2100 = class185.field3497.method411(arg0 + 141);
                    class195.field3808 = class185.field3497.method461(-1);
                    for (int var246 = class102.field2100; ~var246 > ~(class102.field2100 - -8); ++var246) {
                        for (int var247 = class195.field3808; ~var247 > ~(class195.field3808 + 8); ++var247) {
                            if (class136.field2725[class81.field1639][var246][var247] != null) {
                                class136.field2725[class81.field1639][var246][var247] = null;
                                class165.method1073(var247, var246, false);
                            }
                        }
                    }
                    for (class102 var248 = (class102) class211.field4080.method103(57); var248 != null; var248 = (class102) class211.field4080.method100(-49)) {
                        if (~class102.field2100 >= ~var248.field2108 && ~(class102.field2100 + 8) < ~var248.field2108 && var248.field2102 >= class195.field3808 && class195.field3808 - -8 > var248.field2102 && ~class81.field1639 == ~var248.field2106) {
                            var248.field2088 = 0;
                        }
                    }
                    class61.field1265 = -1;
                    return true;
                }
                if (class61.field1265 == 159) {
                    class190.method1225(arg0 ^ 17773);
                    class61.field1265 = -1;
                    return false;
                }
                if (~class61.field1265 == -166) {
                    int var249 = class185.field3497.method418(64);
                    int var250 = class185.field3497.method461(-1);
                    class92 var251 = class185.field3497.method437((byte) 112);
                    if (~var249 <= -2 && ~var249 >= -9) {
                        if (var251.method646(127, class60.field1251)) {
                            var251 = null;
                        }
                        class90.field1773[var249 + -1] = var251;
                        class51.field1091[var249 + -1] = var250 == 0;
                    }
                    class61.field1265 = -1;
                    return true;
                }
                if (class61.field1265 == 94) {
                    int var252 = class185.field3497.method443(255);
                    if (class185.field3497.method443(255) == 0) {
                        class68.field1380[var252] = new class142();
                    } else {
                        --class185.field3497.field1472;
                        class68.field1380[var252] = new class142(class185.field3497);
                    }
                    class61.field1265 = -1;
                    class39.field891 = class186.field3516;
                    return true;
                }
                if (~class61.field1265 == -155) {
                    class137.field2750 = class185.field3497.method443(255);
                    class61.field1265 = -1;
                    return true;
                }
                if (class61.field1265 == 239) {
                    class39.field883 = false;
                    for (int var253 = 0; ~var253 > -6; ++var253) {
                        class32.field728[var253] = false;
                    }
                    class61.field1265 = -1;
                    return true;
                }
                if (~class61.field1265 == -69) {
                    int var254 = class185.field3497.method442(-21351);
                    if (~var254 == -65536) {
                        var254 = -1;
                    }
                    int var255 = class185.field3497.method451(56);
                    int var256 = class185.field3497.method414((byte) -16);
                    if (~var256 == -65536) {
                        var256 = -1;
                    }
                    int var257 = class185.field3497.method433(-3);
                    for (int var258 = var254; var258 <= var256; ++var258) {
                        long var259 = ((long) var257 << 32) + (long) var258;
                        class210 var261 = class144.field2883.method216(-75, var259);
                        if (var261 != null) {
                            var261.method1370(-43);
                        }
                        class144.field2883.method210((byte) -40, var259, new class130(var255));
                    }
                    class61.field1265 = -1;
                    return true;
                }
                class164.method1059("T1 - " + class61.field1265 + "," + class44.field988 + "," + class3.field174 + " - " + class148.field2930, (Throwable) null, arg0 ^ -88);
                class190.method1225(-17791);
            } catch (IOException var265) {
                class209.method1358(false);
            } catch (Exception var266) {
                String var263 = "T2 - " + class61.field1265 + "," + class44.field988 + "," + class3.field174 + " - " + class148.field2930 + "," + (class15.field423.field233[0] + class115.field2343) + "," + (class15.field423.field198[0] + class210.field4077) + " - ";
                for (int var264 = 0; ~var264 > ~class148.field2930 && var264 < 50; ++var264) {
                    var263 = var263 + class185.field3497.field1493[var264] + ",";
                }
                class164.method1059(var263, var266, 125);
                class190.method1225(-17791);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "()V")
    public class9() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIII)I")
    public static final int method59(int arg0, int arg1, int arg2, int arg3) {
        ++field331;
        if (arg2 != 0) {
            method64(false);
        }
        if (~(class59.field1239[arg0][arg3][arg1] & 8) != -1) {
            return 0;
        } else {
            return ~arg0 < -1 && (class59.field1239[1][arg3][arg1] & 2) != 0 ? arg0 - 1 : arg0;
        }
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(Z)V")
    public static void method60(boolean arg0) {
        field326 = null;
        field329 = null;
        field337 = null;
        field340 = null;
        if (arg0) {
            field335 = -122L;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lnh;ILnh;)V")
    public static final void method61(class133 arg0, int arg1, class133 arg2) {
        if (arg1 != 128) {
            method65(-105L, (byte) 44, 44, 110);
        }
        class209.field4021 = arg0;
        class186.field3512 = arg2;
        class146.field2899 = class186.field3512.method886(arg1 + -8, 3);
        ++field339;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)[[I")
    public final int[][] method62(int arg0, int arg1) {
        if (arg1 != 4096) {
            this.method66(78, (byte) 81);
        }
        ++field323;
        int[][] var3 = super.field1873.method553(arg0, 0);
        if (super.field1873.field1656) {
            int var4 = this.field322 + 1 + this.field322;
            int var5 = this.field328 - -this.field328 + 1;
            int[][][] var6 = new int[var5][][];
            for (int var7 = -this.field328 + arg0; var7 <= this.field328 + arg0; ++var7) {
                int[][] var17 = this.method649(0, true, class5.field279 & var7);
                int var18 = 0;
                int var19 = 0;
                int[][] var20 = new int[3][class150.field2985];
                int[] var21 = var17[0];
                int[] var22 = var17[1];
                int[] var23 = var17[2];
                int var24 = 0;
                for (int var25 = -this.field322; ~this.field322 <= ~var25; ++var25) {
                    int var35 = var25 & class2.field163;
                    var24 += var22[var35];
                    var18 += var21[var35];
                    var19 += var23[var35];
                }
                int[] var26 = var20[1];
                int[] var27 = var20[0];
                int[] var28 = var20[2];
                int var29 = 0;
                while (class150.field2985 > var29) {
                    var27[var29] = var18 / var4;
                    var26[var29] = var24 / var4;
                    var28[var29] = var19 / var4;
                    int var30 = var29 - this.field322 & class2.field163;
                    int var31 = var19 - var23[var30];
                    int var32 = var18 - var21[var30];
                    int var33 = var24 - var22[var30];
                    ++var29;
                    int var34 = class2.field163 & this.field322 + var29;
                    var19 = var23[var34] + var31;
                    var24 = var22[var34] + var33;
                    var18 = var21[var34] + var32;
                }
                var6[var7 - arg0 + this.field328] = var20;
            }
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class150.field2985; ++var11) {
                int var12 = 0;
                int var13 = 0;
                int var14 = 0;
                for (int var15 = 0; var5 > var15; ++var15) {
                    int[][] var16 = var6[var15];
                    var13 += var16[1][var11];
                    var12 += var16[0][var11];
                    var14 += var16[2][var11];
                }
                var9[var11] = var12 / var5;
                var8[var11] = var13 / var5;
                var10[var11] = var14 / var5;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILh;I)V")
    public final void method63(int arg0, class70 arg1, int arg2) {
        if (arg2 == 0) {
            ++field334;
            if (~arg0 != -1) {
                if (~arg0 != -2) {
                    if (arg0 == 2) {
                        super.field1885 = ~arg1.method443(255) == -2;
                    }
                } else {
                    this.field328 = arg1.method443(arg2 + 255);
                }
            } else {
                this.field322 = arg1.method443(255);
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(Z)V")
    public static final void method64(boolean arg0) {
        for (class102 var1 = (class102) class211.field4080.method103(57); var1 != null; var1 = (class102) class211.field4080.method100(-49)) {
            if (~var1.field2088 < -1) {
                --var1.field2088;
            }
            if (~var1.field2088 == -1) {
                if (var1.field2091 < 0 || class206.method1344(var1.field2091, var1.field2087, 10)) {
                    class120.method810(var1.field2108, -4, var1.field2093, var1.field2102, var1.field2086, var1.field2091, var1.field2106, var1.field2087);
                    var1.method1370(-119);
                }
            } else {
                if (var1.field2084 > 0) {
                    --var1.field2084;
                }
                if (~var1.field2084 == -1 && var1.field2108 >= 1 && ~var1.field2102 <= -2 && ~var1.field2108 >= -103 && var1.field2102 <= 102 && (~var1.field2090 > -1 || class206.method1344(var1.field2090, var1.field2085, 10))) {
                    class120.method810(var1.field2108, -4, var1.field2093, var1.field2102, var1.field2092, var1.field2090, var1.field2106, var1.field2085);
                    var1.field2084 = -1;
                    if (~var1.field2091 == ~var1.field2090 && var1.field2091 == -1) {
                        var1.method1370(126);
                    } else if (var1.field2091 == var1.field2090 && ~var1.field2092 == ~var1.field2086 && ~var1.field2087 == ~var1.field2085) {
                        var1.method1370(121);
                    }
                }
            }
        }
        ++field325;
        if (arg0) {
            method65(-21L, (byte) 80, -96, 115);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(JBII)Z")
    public static final boolean method65(long arg0, byte arg1, int arg2, int arg3) {
        ++field324;
        int var5 = ((int) arg0 & 516010) >> 14;
        int var6 = (int) arg0 >> 20 & 3;
        int var7 = (int) (arg0 >>> 32) & Integer.MAX_VALUE;
        if (var5 != 10 && var5 != 11 && ~var5 != -23) {
            class186.method1206(class15.field423.field233[0], var6, (byte) -67, class15.field423.field198[0], arg3, 0, true, 0, 0, var5 + 1, arg2, 2);
        } else {
            class214 var8 = class126.method846(0, var7);
            int var9 = var8.field4172;
            int var10;
            int var11;
            if (var6 != 0 && var6 != 2) {
                var10 = var8.field4191;
                var11 = var8.field4197;
            } else {
                var11 = var8.field4191;
                var10 = var8.field4197;
            }
            if (var6 != 0) {
                var9 = (15 & var9 << var6) - -(var9 >> -var6 + 4);
            }
            class186.method1206(class15.field423.field233[0], 0, (byte) 126, class15.field423.field198[0], arg3, var11, true, var10, var9, 0, arg2, 2);
        }
        int var12 = -124 / ((82 - arg1) / 44);
        class205.field3946 = 0;
        class185.field3505 = class31.field705;
        class73.field1540 = 2;
        class159.field3164 = class81.field1645;
        return true;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IB)[I")
    public final int[] method66(int arg0, byte arg1) {
        int var3 = -37 / ((67 - arg1) / 42);
        ++field330;
        int[] var4 = super.field1887.method916(arg0, -6);
        if (super.field1887.field2757) {
            int var5 = this.field328 + this.field328 + 1;
            int[][] var6 = new int[var5][];
            int var7 = this.field322 + this.field322 + 1;
            for (int var8 = arg0 - this.field328; arg0 - -this.field328 >= var8; ++var8) {
                int[] var12 = this.method648((byte) 109, var8 & class5.field279, 0);
                int[] var13 = new int[class150.field2985];
                int var14 = 0;
                for (int var15 = -this.field322; var15 <= this.field322; ++var15) {
                    var14 += var12[var15 & class2.field163];
                }
                int var16 = 0;
                while (var16 < class150.field2985) {
                    var13[var16] = var14 / var7;
                    int var17 = var14 - var12[class2.field163 & -this.field322 + var16];
                    ++var16;
                    var14 = var12[this.field322 + var16 & class2.field163] + var17;
                }
                var6[var8 - (-this.field328 - -arg0)] = var13;
            }
            for (int var9 = 0; var9 < class150.field2985; ++var9) {
                int var10 = 0;
                for (int var11 = 0; ~var5 < ~var11; ++var11) {
                    var10 += var6[var11][var9];
                }
                var4[var9] = var10 / var5;
            }
        }
        return var4;
    }
}
