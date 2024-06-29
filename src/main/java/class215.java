import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class215 extends class287 {

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "Ljava/lang/String;")
    public String field3386;

    @OriginalMember(owner = "client!aa", name = "o", descriptor = "I")
    public static volatile int field3389 = -1;

    @OriginalMember(owner = "client!aa", name = "m", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!aa", name = "n", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!aa", name = "p", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!aa", name = "q", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!aa", name = "t", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!aa", name = "u", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!aa", name = "w", descriptor = "I")
    public static int field3397;

    @OriginalMember(owner = "client!aa", name = "x", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!aa", name = "y", descriptor = "Lug;")
    public static class253 field3399;

    @OriginalMember(owner = "client!aa", name = "s", descriptor = "Led;")
    public static class323 field3393;

    @OriginalMember(owner = "client!aa", name = "r", descriptor = "[I")
    public static int[] field3392;

    @OriginalMember(owner = "client!aa", name = "v", descriptor = "[[Lwm;")
    public static class254[][] field3396;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(I)V", line = 4)
    public static void method1567(int arg0) {
        if (arg0 != 1) {
            method1567(-1);
        }
        field3393 = null;
        field3399 = null;
        field3392 = null;
        field3396 = (class254[][]) null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)I", line = 20)
    public static final int method1568(int arg0, int arg1) {
        if (arg0 != 479166497) {
            method1571(-22, 123, -13, 28, 101, (byte) -69, 62);
        }
        int var7 = arg1 - 1;
        field3395++;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILjava/lang/String;C)[Ljava/lang/String;", line = 39)
    public static final String[] method1569(int arg0, String arg1, char arg2) {
        int var3 = class14.method136(arg2, 0, arg1);
        field3391++;
        String[] var4 = new String[arg0 + var3];
        int var5 = 0;
        int var6 = 0;
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg2 != arg1.charAt(var8); var8++) {
            }
            var4[var5++] = arg1.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg1.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "(I)V", line = 77)
    public static final void method1570(int arg0) {
        if (class5.field59 > 1) {
            class43.field591 = class220.field3487;
            class5.field59--;
        }
        field3390++;
        if (class258.field4072 > 0) {
            class258.field4072--;
        }
        if (class130.field1919) {
            class130.field1919 = false;
            class153.method1114(-32);
            return;
        }
        for (int var1 = 0; var1 < 100 && class205.method1515(0); var1++) {
        }
        if (class105.field1388 != 30) {
            return;
        }
        class304.method2111(class183.field2965, true, 137);
        Object var2 = class107.field1439.field2865;
        synchronized (class107.field1439.field2865) {
            if (!class154.field2387) {
                class107.field1439.field2876 = 0;
            } else if (class193.field3076 != 0 || class107.field1439.field2876 >= 40) {
                class183.field2965.method1947((byte) 87, 202);
                class157.field2439++;
                class183.field2965.method81((byte) -116, 0);
                int var3 = 0;
                int var4 = class183.field2965.field111;
                for (int var5 = 0; class107.field1439.field2876 > var5 && (class183.field2965.field111 - var4) < 240; var5++) {
                    var3++;
                    int var6 = class107.field1439.field2878[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    int var7 = class107.field1439.field2877[var5];
                    boolean var8 = false;
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 65534) {
                        var7 = 65534;
                    }
                    if (class107.field1439.field2878[var5] == -1 && class107.field1439.field2877[var5] == -1) {
                        var6 = -1;
                        var7 = -1;
                        var8 = true;
                    }
                    if (class257.field4056 != var7 || class48.field625 != var6) {
                        int var9 = var7 - class257.field4056;
                        class257.field4056 = var7;
                        int var10 = var6 - class48.field625;
                        class48.field625 = var6;
                        if (class185.field3004 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            class183.field2965.method65((byte) -9, (class185.field3004 << 12) + (var9 << 6) + var10);
                            class185.field3004 = 0;
                        } else if (class185.field3004 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                            var10 += 128;
                            var9 += 128;
                            class183.field2965.method81((byte) -127, class185.field3004 + 128);
                            class183.field2965.method65((byte) -9, (var9 << 8) + var10);
                            class185.field3004 = 0;
                        } else if (class185.field3004 < 32) {
                            class183.field2965.method81((byte) -125, class185.field3004 + 192);
                            if (var8) {
                                class183.field2965.method34(Integer.MIN_VALUE, arg0 + 294355384);
                            } else {
                                class183.field2965.method34(var6 << 16 | var7, arg0 ^ 0xEE748258);
                            }
                            class185.field3004 = 0;
                        } else {
                            class183.field2965.method65((byte) -9, class185.field3004 + 57344);
                            if (var8) {
                                class183.field2965.method34(Integer.MIN_VALUE, 294335144);
                            } else {
                                class183.field2965.method34(var6 << 16 | var7, arg0 ^ 0xEE748258);
                            }
                            class185.field3004 = 0;
                        }
                    } else if (class185.field3004 < 2047) {
                        class185.field3004++;
                    }
                }
                class183.field2965.method64(class183.field2965.field111 - var4, 1557888296);
                if (class107.field1439.field2876 > var3) {
                    class107.field1439.field2876 -= var3;
                    for (int var11 = 0; var11 < class107.field1439.field2876; var11++) {
                        class107.field1439.field2877[var11] = class107.field1439.field2877[var3 + var11];
                        class107.field1439.field2878[var11] = class107.field1439.field2878[var3 + var11];
                    }
                } else {
                    class107.field1439.field2876 = 0;
                }
            }
        }
        if (class193.field3076 != 0) {
            class95.field1256++;
            long var13 = (class222.field3516 - class11.field196) / 50L;
            class11.field196 = class222.field3516;
            byte var15 = 0;
            int var16 = class271.field4207;
            int var17 = class205.field3256;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 65535) {
                var16 = 65535;
            }
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 65535) {
                var17 = 65535;
            }
            if (var13 > 32767L) {
                var13 = 32767L;
            }
            if (class193.field3076 == 2) {
                var15 = 1;
            }
            class183.field2965.method1947((byte) -50, 168);
            int var18 = (int) var13;
            class183.field2965.method41(var16 << 16 | var17, (byte) -90);
            class183.field2965.method65((byte) -9, var18 | var15 << 15);
        }
        if (class57.field804 > 0) {
            class57.field804--;
        }
        if (class281.field4320 && class57.field804 <= 0) {
            class57.field804 = 20;
            class132.field1948++;
            class281.field4320 = false;
            class183.field2965.method1947((byte) -104, 75);
            class183.field2965.method30((int) class45.field604, (byte) -76);
            class183.field2965.method65((byte) -9, (int) class6.field114);
        }
        if (class230.field3596 && !class62.field907) {
            class62.field907 = true;
            class45.field602++;
            class183.field2965.method1947((byte) -54, 236);
            class183.field2965.method81((byte) -112, 1);
        }
        if (!class230.field3596 && class62.field907) {
            class62.field907 = false;
            class45.field602++;
            class183.field2965.method1947((byte) 56, 236);
            class183.field2965.method81((byte) -108, 0);
        }
        if (!class129.field1892) {
            class183.field2965.method1947((byte) 96, 108);
            class328.field5141++;
            class183.field2965.method34(class136.method1003(0), 294335144);
            class129.field1892 = true;
        }
        if (class281.field4344) {
            class281.field4344 = false;
        } else {
            class135.field1975 /= 2.0F;
        }
        if (class69.field969) {
            class69.field969 = false;
        } else {
            class25.field383 /= 2.0F;
        }
        class278.method1957(false);
        if (class105.field1388 != 30) {
            return;
        }
        class23.method226(true);
        class172.method1283(arg0 ^ 0xFFFFB0F3);
        class66.method527(19468);
        class107.field1426++;
        if (class107.field1426 > 750) {
            class153.method1114(arg0 + 20208);
            return;
        }
        class36.method313(3658);
        class308.method2131(0);
        class246.method1772(arg0 ^ 0x4F7D);
        if (class261.field4101 != null) {
            class261.method1877((byte) 118);
        }
        for (int var19 = class77.method576(98, true); var19 != -1; var19 = class77.method576(66, false)) {
            class136.method990(var19, 4268);
            class107.field1442[class333.method2319(31, class2.field21++)] = var19;
        }
        for (class34 var20 = class282.method1997((byte) 2); var20 != null; var20 = class282.method1997((byte) 2)) {
            int var21 = var20.method308(-9047);
            int var22 = var20.method303((byte) -118);
            if (var21 == 1) {
                class166.field2733[var22] = var20.field500;
                class91.field1212[class333.method2319(31, class163.field2649++)] = var22;
            } else if (var21 == 2) {
                class336.field5240[var22] = var20.field504;
                class174.field2850[class333.method2319(class232.field3621++, 31)] = var22;
            } else if (var21 == 3) {
                class136 var43 = class14.method140(var22, arg0 ^ 0xC2386DC0);
                if (!var20.field504.equals(var43.field2158)) {
                    var43.field2158 = var20.field504;
                    class167.method1250(var43, 412);
                }
            } else if (var21 == 4) {
                class136 var23 = class14.method140(var22, 1036508464);
                int var24 = var20.field497;
                int var25 = var20.field500;
                int var26 = var20.field502;
                if (var23.field2166 != var25 || var23.field2117 != var24 || var23.field1988 != var26) {
                    var23.field1988 = var26;
                    var23.field2166 = var25;
                    var23.field2117 = var24;
                    class167.method1250(var23, 412);
                }
            } else if (var21 == 5) {
                class136 var42 = class14.method140(var22, 1036508464);
                if (var20.field500 != var42.field2128 || var20.field500 == -1) {
                    var42.field2130 = 1;
                    var42.field2088 = 0;
                    var42.field2128 = var20.field500;
                    var42.field2147 = 0;
                    class167.method1250(var42, 412);
                }
            } else if (var21 == 6) {
                int var27 = var20.field500;
                int var28 = (var27 & 0x7F80) >> 10;
                class136 var29 = class14.method140(var22, 1036508464);
                int var30 = var27 & 0x1F;
                int var31 = var27 >> 5 & 0x1F;
                int var32 = (var28 << 19) + (var31 << 11) + (var30 << 3);
                if (var29.field2094 != var32) {
                    var29.field2094 = var32;
                    class167.method1250(var29, 412);
                }
            } else if (var21 == 7) {
                class136 var40 = class14.method140(var22, arg0 + 1036528704);
                boolean var41 = var20.field500 == 1;
                if (var40.field2123 != var41) {
                    var40.field2123 = var41;
                    class167.method1250(var40, 412);
                }
            } else if (var21 == 8) {
                class136 var39 = class14.method140(var22, 1036508464);
                if (var20.field500 != var39.field2145 || var20.field497 != var39.field2096 || var20.field502 != var39.field2168) {
                    var39.field2168 = var20.field502;
                    var39.field2096 = var20.field497;
                    if (var39.field1997 != -1) {
                        if (var39.field2041 > 0) {
                            var39.field2168 = var39.field2168 * 32 / var39.field2041;
                        } else if (var39.field2048 > 0) {
                            var39.field2168 = var39.field2168 * 32 / var39.field2048;
                        }
                    }
                    var39.field2145 = var20.field500;
                    class167.method1250(var39, 412);
                }
            } else if (var21 == 9) {
                class136 var33 = class14.method140(var22, 1036508464);
                if (var20.field500 != var33.field1997 || var20.field497 != var33.field2087) {
                    var33.field1997 = var20.field500;
                    var33.field2087 = var20.field497;
                    class167.method1250(var33, 412);
                }
            } else if (var21 == 10) {
                class136 var34 = class14.method140(var22, 1036508464);
                if (var20.field500 != var34.field2075 || var20.field497 != var34.field2044 || var20.field502 != var34.field2119) {
                    var34.field2075 = var20.field500;
                    var34.field2044 = var20.field497;
                    var34.field2119 = var20.field502;
                    class167.method1250(var34, 412);
                }
            } else if (var21 == 11) {
                class136 var35 = class14.method140(var22, 1036508464);
                var35.field2131 = var35.field2011 = var20.field500;
                var35.field2142 = 0;
                var35.field2111 = var35.field2095 = var20.field497;
                var35.field2159 = 0;
                class167.method1250(var35, 412);
            } else if (var21 == 12) {
                class136 var37 = class14.method140(var22, 1036508464);
                int var38 = var20.field500;
                if (var37 != null && var37.field2063 == 0) {
                    if (var38 > (var37.field2007 - var37.field2078)) {
                        var38 = var37.field2007 - var37.field2078;
                    }
                    if (var38 < 0) {
                        var38 = 0;
                    }
                    if (var37.field2018 != var38) {
                        var37.field2018 = var38;
                        class167.method1250(var37, 412);
                    }
                }
            } else if (var21 == 13) {
                class136 var36 = class14.method140(var22, arg0 + 1036528704);
                var36.field2036 = var20.field500;
            }
        }
        class153.field2373++;
        if (class328.field5138 != 0) {
            class317.field5014 += 20;
            if (class317.field5014 >= 400) {
                class328.field5138 = 0;
            }
        }
        if (class153.field2359 != null) {
            class320.field5054++;
            if (class320.field5054 >= 15) {
                class167.method1250(class153.field2359, 412);
                class153.field2359 = null;
            }
        }
        if (class175.field2864 != null) {
            class167.method1250(class175.field2864, 412);
            class98.field1289++;
            if (class158.field2451 + 5 < class25.field381 || class25.field381 < (class158.field2451 - 5) || class92.field1226 + 5 < class82.field1129 || class82.field1129 < (class92.field1226 - 5)) {
                class27.field406 = true;
            }
            if (class183.field2971 == 0) {
                if (class27.field406 && class98.field1289 >= 5) {
                    if (class18.field287 == class175.field2864 && class224.field3549 != class145.field2287) {
                        class136 var44 = class175.field2864;
                        class344.field5338++;
                        byte var45 = 0;
                        if (class172.field2834 == 1 && var44.field2038 == 206) {
                            var45 = 1;
                        }
                        if (var44.field2146[class145.field2287] <= 0) {
                            var45 = 0;
                        }
                        if (client.method953(var44).method930(arg0 + 20365)) {
                            int var46 = class224.field3549;
                            int var47 = class145.field2287;
                            var44.field2146[var47] = var44.field2146[var46];
                            var44.field1992[var47] = var44.field1992[var46];
                            var44.field2146[var46] = -1;
                            var44.field1992[var46] = 0;
                        } else if (var45 == 1) {
                            int var48 = class224.field3549;
                            int var49 = class145.field2287;
                            while (var48 != var49) {
                                if (var48 > var49) {
                                    var44.method1005((byte) 41, var48, var48 - 1);
                                    var48--;
                                } else if (var49 > var48) {
                                    var44.method1005((byte) 41, var48, var48 + 1);
                                    var48++;
                                }
                            }
                        } else {
                            var44.method1005((byte) 41, class224.field3549, class145.field2287);
                        }
                        class183.field2965.method1947((byte) -46, 70);
                        class183.field2965.method80(var45, arg0 ^ 0xFFFFB0F5);
                        class183.field2965.method45(true, class145.field2287);
                        class183.field2965.method45(true, class224.field3549);
                        class183.field2965.method63((byte) 117, class175.field2864.field2069);
                    }
                } else if ((class274.field4235 == 1 || class325.method2285(class78.field1046 - 1, false)) && class78.field1046 > 2) {
                    class283.method2008(true);
                } else if (class78.field1046 > 0) {
                    class113.method797(true);
                }
                class175.field2864 = null;
                class320.field5054 = 10;
                class193.field3076 = 0;
            }
        }
        class3.field27 = false;
        class56.field775 = 0;
        class136 var50 = class62.field917;
        class62.field917 = null;
        class99.field1331 = false;
        class82.field1119 = null;
        class136 var51 = class174.field2856;
        class174.field2856 = null;
        while (class127.method933(true) && class56.field775 < 128) {
            class258.field4073[class56.field775] = class243.field3799;
            class47.field619[class56.field775] = class125.field1814;
            class56.field775++;
        }
        class261.field4101 = null;
        if (class147.field2321 != -1) {
            class318.method2230(0, 0, 0, 0, -117, class147.field2321, class127.field1841, class95.field1258);
        }
        class220.field3487++;
        while (true) {
            class15 var52;
            class136 var53;
            class136 var54;
            do {
                var52 = (class15) class50.field644.method24(0);
                if (var52 == null) {
                    while (true) {
                        class15 var55;
                        class136 var56;
                        class136 var57;
                        do {
                            var55 = (class15) class174.field2855.method24(0);
                            if (var55 == null) {
                                while (true) {
                                    class15 var58;
                                    class136 var59;
                                    class136 var60;
                                    do {
                                        var58 = (class15) class77.field1037.method24(0);
                                        if (var58 == null) {
                                            if (class261.field4101 == null) {
                                                class294.field4548 = 0;
                                            }
                                            if (class56.field777 != null) {
                                                class311.method2166(2);
                                            }
                                            if (client.field1905 > 0 && class260.field4093[82] && class260.field4093[81] && class195.field3118 != 0) {
                                                int var61 = class154.field2392 - class195.field3118;
                                                if (var61 < 0) {
                                                    var61 = 0;
                                                } else if (var61 > 3) {
                                                    var61 = 3;
                                                }
                                                class269.method1906((byte) -56, class146.field2310.field4708[0] + class326.field5108, class146.field2310.field4675[0] + class198.field3168, var61);
                                            }
                                            if (client.field1905 > 0 && class260.field4093[82] && class260.field4093[81]) {
                                                if (class120.field1664 != -1) {
                                                    class269.method1906((byte) -56, class326.field5108 + class120.field1664, class198.field3168 + class132.field1949, class154.field2392);
                                                }
                                                class286.field4417 = 0;
                                                class253.field3969 = 0;
                                            } else if (class253.field3969 == 2) {
                                                if (class120.field1664 != -1) {
                                                    class167.field2741++;
                                                    class183.field2965.method1947((byte) -63, 4);
                                                    class183.field2965.method34(class51.field646, 294335144);
                                                    class183.field2965.method59(class63.field920, 23062);
                                                    class183.field2965.method45(true, class326.field5108 + class120.field1664);
                                                    class183.field2965.method65((byte) -9, class198.field3168 + class132.field1949);
                                                    class183.field2974 = class205.field3256;
                                                    class317.field5014 = 0;
                                                    class32.field479 = class271.field4207;
                                                    class328.field5138 = 1;
                                                }
                                                class253.field3969 = 0;
                                            } else if (class286.field4417 == 2) {
                                                if (class120.field1664 != -1) {
                                                    class340.field5300++;
                                                    class183.field2965.method1947((byte) -106, 96);
                                                    class183.field2965.method65((byte) -9, class198.field3168 + class132.field1949);
                                                    class183.field2965.method45(true, class326.field5108 + class120.field1664);
                                                    class328.field5138 = 1;
                                                    class183.field2974 = class205.field3256;
                                                    class32.field479 = class271.field4207;
                                                    class317.field5014 = 0;
                                                }
                                                class286.field4417 = 0;
                                            } else if (class120.field1664 != -1 && class253.field3969 == 0 && class286.field4417 == 0) {
                                                class102.method707((class132.field1949 << 1) + 1 - class146.field2310.method2099((byte) 123) >> 1, (class120.field1664 << 1) + 1 - class146.field2310.method2099((byte) 123) >> 1, (byte) -26, 0);
                                                class317.field5014 = 0;
                                                class183.field2974 = class205.field3256;
                                                class328.field5138 = 1;
                                                class32.field479 = class271.field4207;
                                            }
                                            class120.field1664 = -1;
                                            class61.method502(true);
                                            if (class174.field2856 != var51) {
                                                if (var51 != null) {
                                                    class167.method1250(var51, 412);
                                                }
                                                if (class174.field2856 != null) {
                                                    class167.method1250(class174.field2856, 412);
                                                }
                                            }
                                            if (class62.field917 != var50 && class237.field3717 == class110.field1523) {
                                                if (var50 != null) {
                                                    class167.method1250(var50, 412);
                                                }
                                                if (class62.field917 != null) {
                                                    class167.method1250(class62.field917, 412);
                                                }
                                            }
                                            if (class62.field917 == null) {
                                                if (class110.field1523 > 0) {
                                                    class110.field1523--;
                                                }
                                            } else if (class110.field1523 < class237.field3717) {
                                                class110.field1523++;
                                                if (class237.field3717 == class110.field1523) {
                                                    class167.method1250(class62.field917, 412);
                                                }
                                            }
                                            for (int var62 = 0; var62 < 5; var62++) {
                                                int var10002 = class311.field4856[var62]++;
                                            }
                                            int var63 = class102.method711(arg0 + 4553);
                                            int var64 = class157.method1138(-29869);
                                            if (var63 > 15000 && var64 > 15000) {
                                                class282.field4358++;
                                                class258.field4072 = 250;
                                                class303.method2104(0, 14500);
                                                class183.field2965.method1947((byte) 121, 79);
                                            }
                                            if (class91.field1213 != null && class91.field1213.field1595 == 1) {
                                                if (class91.field1213.field1591 != null) {
                                                    class136.method997(class127.field1852, class81.field1107, 0);
                                                }
                                                class127.field1852 = false;
                                                class91.field1213 = null;
                                                class81.field1107 = null;
                                            }
                                            class70.field978++;
                                            class15.field250++;
                                            if (arg0 != -20240) {
                                                return;
                                            }
                                            if (class15.field250 > 500) {
                                                class15.field250 = 0;
                                                int var65 = (int) (Math.random() * 8.0D);
                                                if ((var65 & 0x2) == 2) {
                                                    class281.field4324 += class292.field4518;
                                                }
                                                if ((var65 & 0x4) == 4) {
                                                    class232.field3613 += class172.field2837;
                                                }
                                                if ((var65 & 0x1) == 1) {
                                                    class322.field5084 += class184.field2991;
                                                }
                                            }
                                            if (class322.field5084 < -50) {
                                                class184.field2991 = 2;
                                            }
                                            if (class232.field3613 < -40) {
                                                class172.field2837 = 1;
                                            }
                                            if (class232.field3613 > 40) {
                                                class172.field2837 = -1;
                                            }
                                            if (class322.field5084 > 50) {
                                                class184.field2991 = -2;
                                            }
                                            class119.field1661++;
                                            if (class281.field4324 < -55) {
                                                class292.field4518 = 2;
                                            }
                                            if (class281.field4324 > 55) {
                                                class292.field4518 = -2;
                                            }
                                            if (class70.field978 > 500) {
                                                class70.field978 = 0;
                                                int var66 = (int) (Math.random() * 8.0D);
                                                if ((var66 & 0x2) == 2) {
                                                    class293.field4541 += class20.field305;
                                                }
                                                if ((var66 & 0x1) == 1) {
                                                    class220.field3483 += class316.field4976;
                                                }
                                            }
                                            if (class293.field4541 < -20) {
                                                class20.field305 = 1;
                                            }
                                            if (class293.field4541 > 10) {
                                                class20.field305 = -1;
                                            }
                                            if (class220.field3483 < -60) {
                                                class316.field4976 = 2;
                                            }
                                            if (class220.field3483 > 60) {
                                                class316.field4976 = -2;
                                            }
                                            if (class119.field1661 > 50) {
                                                class183.field2965.method1947((byte) 55, 132);
                                                class284.field4391++;
                                            }
                                            if (class82.field1125) {
                                                class161.method1205(-5408);
                                                class82.field1125 = false;
                                            }
                                            try {
                                                if (class275.field4247 != null && class183.field2965.field111 > 0) {
                                                    class275.field4247.method221(arg0 + 20318, class183.field2965.field115, 0, class183.field2965.field111);
                                                    class119.field1661 = 0;
                                                    class183.field2965.field111 = 0;
                                                }
                                            } catch (IOException var68) {
                                                class153.method1114(-32);
                                            }
                                            return;
                                        }
                                        var59 = var58.field248;
                                        if (var59.field2086 < 0) {
                                            break;
                                        }
                                        var60 = class14.method140(var59.field2090, 1036508464);
                                    } while (var60 == null || var60.field2062 == null || var59.field2086 >= var60.field2062.length || var60.field2062[var59.field2086] != var59);
                                    class172.method1282(var58, (byte) 73);
                                }
                            }
                            var56 = var55.field248;
                            if (var56.field2086 < 0) {
                                break;
                            }
                            var57 = class14.method140(var56.field2090, 1036508464);
                        } while (var57 == null || var57.field2062 == null || var56.field2086 >= var57.field2062.length || var57.field2062[var56.field2086] != var56);
                        class172.method1282(var55, (byte) 73);
                    }
                }
                var53 = var52.field248;
                if (var53.field2086 < 0) {
                    break;
                }
                var54 = class14.method140(var53.field2090, 1036508464);
            } while (var54 == null || var54.field2062 == null || var54.field2062.length <= var53.field2086 || var54.field2062[var53.field2086] != var53);
            class172.method1282(var52, (byte) 73);
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIIIBI)V", line = 1062)
    public static final void method1571(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        int var7 = 0;
        field3388++;
        int var8 = arg2;
        class42.method342(-20247, arg2);
        int var9 = -arg2;
        int var10 = -1;
        if (arg5 != 118) {
            method1570(-81);
        }
        int var11 = arg2 - arg3;
        if (var11 < 0) {
            var11 = 0;
        }
        int var12 = -var11;
        if (arg0 >= class42.field579 && class334.field5205 >= arg0) {
            int[] var13 = class284.field4402[arg0];
            int var14 = class171.method1280(class291.field4490, (byte) -7, class210.field3309, arg1 - arg2);
            int var15 = class171.method1280(class291.field4490, (byte) -7, class210.field3309, arg1 + arg2);
            int var16 = class171.method1280(class291.field4490, (byte) -7, class210.field3309, arg1 - var11);
            int var17 = class171.method1280(class291.field4490, (byte) -7, class210.field3309, arg1 + var11);
            class256.method1853(var13, var14, arg4, var16, 0);
            class256.method1853(var13, var16, arg6, var17, arg5 - 118);
            class256.method1853(var13, var17, arg4, var15, 0);
        }
        int var18 = var11;
        int var19 = -1;
        while (var8 > var7) {
            var10 += 2;
            var9 += var10;
            var19 += 2;
            var12 += var19;
            if (var12 >= 0 && var18 >= 1) {
                var18--;
                var12 -= var18 << 1;
                class105.field1385[var18] = var7;
            }
            var7++;
            if (var9 >= 0) {
                var8--;
                var9 -= var8 << 1;
                int var20 = arg0 - var8;
                int var21 = arg0 + var8;
                if (class42.field579 <= var21 && var20 <= class334.field5205) {
                    if (var11 <= var8) {
                        int var22 = class171.method1280(class291.field4490, (byte) -7, class210.field3309, arg1 + var7);
                        int var23 = class171.method1280(class291.field4490, (byte) -7, class210.field3309, arg1 - var7);
                        if (class334.field5205 >= var21) {
                            class256.method1853(class284.field4402[var21], var23, arg4, var22, arg5 ^ 0x76);
                        }
                        if (class42.field579 <= var20) {
                            class256.method1853(class284.field4402[var20], var23, arg4, var22, 0);
                        }
                    } else {
                        int var24 = class105.field1385[var8];
                        int var25 = class171.method1280(class291.field4490, (byte) -7, class210.field3309, arg1 + var7);
                        int var26 = class171.method1280(class291.field4490, (byte) -7, class210.field3309, arg1 - var7);
                        int var27 = class171.method1280(class291.field4490, (byte) -7, class210.field3309, arg1 + var24);
                        int var28 = class171.method1280(class291.field4490, (byte) -7, class210.field3309, arg1 - var24);
                        if (var21 <= class334.field5205) {
                            int[] var29 = class284.field4402[var21];
                            class256.method1853(var29, var26, arg4, var28, arg5 - 118);
                            class256.method1853(var29, var28, arg6, var27, 0);
                            class256.method1853(var29, var27, arg4, var25, 0);
                        }
                        if (class42.field579 <= var20) {
                            int[] var30 = class284.field4402[var20];
                            class256.method1853(var30, var26, arg4, var28, arg5 - 118);
                            class256.method1853(var30, var28, arg6, var27, 0);
                            class256.method1853(var30, var27, arg4, var25, 0);
                        }
                    }
                }
            }
            int var31 = arg0 + var7;
            int var32 = arg0 - var7;
            if (var31 >= class42.field579 && var32 <= class334.field5205) {
                int var33 = arg1 + var8;
                int var34 = arg1 - var8;
                if (var33 >= class291.field4490 && class210.field3309 >= var34) {
                    int var35 = class171.method1280(class291.field4490, (byte) -7, class210.field3309, var33);
                    int var36 = class171.method1280(class291.field4490, (byte) -7, class210.field3309, var34);
                    if (var7 >= var11) {
                        if (class334.field5205 >= var31) {
                            class256.method1853(class284.field4402[var31], var36, arg4, var35, 0);
                        }
                        if (class42.field579 <= var32) {
                            class256.method1853(class284.field4402[var32], var36, arg4, var35, 0);
                        }
                    } else {
                        int var37 = var7 > var18 ? class105.field1385[var7] : var18;
                        int var38 = class171.method1280(class291.field4490, (byte) -7, class210.field3309, arg1 + var37);
                        int var39 = class171.method1280(class291.field4490, (byte) -7, class210.field3309, arg1 - var37);
                        if (var31 <= class334.field5205) {
                            int[] var40 = class284.field4402[var31];
                            class256.method1853(var40, var36, arg4, var39, 0);
                            class256.method1853(var40, var39, arg6, var38, 0);
                            class256.method1853(var40, var38, arg4, var35, arg5 - 118);
                        }
                        if (var32 >= class42.field579) {
                            int[] var41 = class284.field4402[var32];
                            class256.method1853(var41, var36, arg4, var39, arg5 ^ 0x76);
                            class256.method1853(var41, var39, arg6, var38, 0);
                            class256.method1853(var41, var38, arg4, var35, 0);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "()V", line = 1248)
    public class215() {
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 1250)
    public class215(String arg0) {
        this.field3386 = arg0;
    }
}
