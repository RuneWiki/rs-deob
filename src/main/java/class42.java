import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class42 {

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "[[B")
    public static byte[][] field915 = new byte[50][];

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "Ldd;")
    private static class35 field918 = class180.method1196((byte) -94, "Ok");

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "Ldd;")
    public static class35 field923 = field918;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "Ldd;")
    private static class35 field919 = class180.method1196((byte) -82, "Loading)3)3)3");

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "Ldd;")
    private static class35 field921 = class180.method1196((byte) 127, "Free world");

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "Ldd;")
    public static class35 field922 = field921;

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "Ldd;")
    public static class35 field928 = field919;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    public static int field916;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
    public static int field924;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "Lfd;")
    public static class55 field914;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "Lag;")
    public static class8 field920;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BLgi;)V")
    public static final void method394(byte arg0, class69 arg1) {
        arg1.field1617 = 0;
        if (arg1.field1669 == 0) {
            arg1.field1613 = 1024;
        }
        field929++;
        int var2 = arg1.field1650 - class89.field1988;
        if (arg1.field1669 == 1) {
            arg1.field1613 = 1536;
        }
        if (arg0 >= -6) {
            method397((byte) -91, null);
        }
        if (arg1.field1669 == 2) {
            arg1.field1613 = 0;
        }
        int var3 = arg1.field1657 * 128 + arg1.field1644 * 64;
        arg1.field1676 += (var3 - arg1.field1676) / var2;
        if (arg1.field1669 == 3) {
            arg1.field1613 = 512;
        }
        int var4 = arg1.field1662 * 128 + arg1.field1644 * 64;
        arg1.field1664 += (var4 - arg1.field1664) / var2;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILdd;)Z")
    public static final boolean method395(int arg0, class35 arg1) {
        field917++;
        if (arg1 == null) {
            return false;
        }
        if (arg0 <= 38) {
            method400((byte) 67);
        }
        for (int var2 = 0; var2 < class136.field2912; var2++) {
            if (arg1.method337(97, class58.field1449[var2])) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Z)V")
    public static final void method396(boolean arg0) {
        field924++;
        class152.method1024(-58);
        class138.method944(57);
        class21.method192(0);
        class155.method1046(0);
        class137.method938(2);
        class191.method1258(13171);
        class174.method1162(16);
        class121.method863((byte) 66);
        class124.method880(82);
        class102.method763(true);
        class21.method195((byte) 61);
        class25.method210(7531);
        ((class115) class11.field217).method831((byte) -128);
        class57.field1419.method813(-111);
        class165.field3332.method62(-22543);
        class69.field1653.method62(-22543);
        class107.field2387.method62(-22543);
        class57.field1420.method62(-22543);
        class48.field1055.method62(-22543);
        class162.field3293.method62(-22543);
        class80.field1861.method62(-22543);
        class78.field1815.method62(-22543);
        class191.field3848.method62(-22543);
        class102.field2255.method62(-22543);
        class134.field2871.method62(-22543);
        if (arg0) {
            method398(null, false);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BLw;)V")
    public static final void method397(byte arg0, class205 arg1) {
        field916++;
        if (class121.field2667 == 1) {
            short var2 = 280;
            if (class134.field2859 >= var2 && var2 + 14 >= class134.field2859 && class9.field187 >= 4 && class9.field187 <= 18) {
                class59.method507(0, -116, 0);
                return;
            }
            if (class134.field2859 >= var2 + 15 && var2 + 80 >= class134.field2859 && class9.field187 >= 4 && class9.field187 <= 18) {
                class59.method507(0, -122, 1);
                return;
            }
            short var3 = 390;
            if (class134.field2859 >= var3 && class134.field2859 <= var3 + 14 && class9.field187 >= 4 && class9.field187 <= 18) {
                class59.method507(1, -107, 0);
                return;
            }
            if (class134.field2859 >= var3 + 15 && class134.field2859 <= var3 + 80 && class9.field187 >= 4 && class9.field187 <= 18) {
                class59.method507(1, 49, 1);
                return;
            }
            short var4 = 500;
            if (var4 <= class134.field2859 && class134.field2859 <= var4 + 14 && class9.field187 >= 4 && class9.field187 <= 18) {
                class59.method507(2, 106, 0);
                return;
            }
            if (var4 + 15 <= class134.field2859 && class134.field2859 <= var4 + 80 && class9.field187 >= 4 && class9.field187 <= 18) {
                class59.method507(2, 5, 1);
                return;
            }
            short var5 = 610;
            if (var5 <= class134.field2859 && class134.field2859 <= var5 + 14 && class9.field187 >= 4 && class9.field187 <= 18) {
                class59.method507(3, -99, 0);
                return;
            }
            if (var5 + 15 <= class134.field2859 && class134.field2859 <= var5 + 80 && class9.field187 >= 4 && class9.field187 <= 18) {
                class59.method507(3, 29, 1);
                return;
            }
            if (class134.field2859 >= 708 && class9.field187 >= 4 && class134.field2859 <= 758 && class9.field187 <= 20) {
                class107.field2388 = false;
                class3.field42.method93(0, 0);
                class187.field3806.method93(382, 0);
                class55.field1305.method162(382 - class55.field1305.field358 / 2, 18);
                return;
            }
            if (class166.field3350 != -1) {
                class84 var6 = class20.field399[class166.field3350];
                if (class22.field442 == var6.field1922) {
                    byte[] var7 = class63.method529(new class35[] { var6.field1936, class45.field977 }, (byte) 97).method325(-20306);
                    class152.field3150 = new String(var7, 0, var7.length);
                    if (class25.field508 != 0) {
                        class100.field2202 = 443;
                        class25.field508 = 0;
                        class82.field1904 = 43594;
                        class210.field4163 = 43594;
                    }
                    class107.field2388 = false;
                    class101.field2230 = var6.field1935;
                    class3.field42.method93(0, 0);
                    class187.field3806.method93(382, 0);
                    class55.field1305.method162(382 - class55.field1305.field358 / 2, 18);
                    return;
                }
                class35 var8 = class63.method529(new class35[] { class204.field4065, var6.field1936, class45.field977, class20.field397, class180.field3688, class3.method19(class35.field781 ? 1 : 0, -29578), class210.field4153, class3.method19(class178.field3648, -29578), class182.field3729, class3.method19(class1.field12, -29578) }, (byte) 100);
                try {
                    arg1.getAppletContext().showDocument(var8.method320(true), "_self");
                } catch (Exception var9) {
                }
            }
        }
        if (arg0 < 27) {
            method400((byte) 79);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lfc;Z)V")
    public static final void method398(class54 arg0, boolean arg1) {
        class208.field4125.method1236((byte) 126, arg0);
        while (true) {
            class54 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class54[][] var7;
            class54 var65;
            do {
                class54 var64;
                do {
                    class54 var63;
                    do {
                        class54 var62;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class54) class208.field4125.method1234(74);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field1235);
                                            var3 = var2.field1217;
                                            var4 = var2.field1233;
                                            var5 = var2.field1208;
                                            var6 = var2.field1211;
                                            var7 = class191.field3853[var5];
                                            if (!var2.field1221) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class54 var8 = class191.field3853[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field1235) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class92.field2045 && var3 > class8.field121) {
                                                    class54 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field1235 && (var9.field1221 || (var2.field1209 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class92.field2045 && var3 < class115.field2575 - 1) {
                                                    class54 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field1235 && (var10.field1221 || (var2.field1209 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class45.field975 && var4 > class118.field2617) {
                                                    class54 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field1235 && (var11.field1221 || (var2.field1209 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class45.field975 && var4 < class59.field1468 - 1) {
                                                    class54 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field1235 && (var12.field1221 || (var2.field1209 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field1221 = false;
                                            if (var2.field1214 != null) {
                                                class54 var13 = var2.field1214;
                                                if (var13.field1224 == null) {
                                                    if (var13.field1212 != null && !class1.method9(0, var3, var4)) {
                                                        class114.method826(var13.field1212, class1.field13, class201.field4030, class40.field889, class137.field2922, var3, var4);
                                                    }
                                                } else if (!class1.method9(0, var3, var4)) {
                                                    class1.method4(var13.field1224, 0, class1.field13, class201.field4030, class40.field889, class137.field2922, var3, var4);
                                                }
                                                class22 var14 = var13.field1210;
                                                if (var14 != null) {
                                                    var14.field448.method174(0, class1.field13, class201.field4030, class40.field889, class137.field2922, var14.field449 - class4.field78, var14.field451 - class2.field22, var14.field454 - class29.field590, var14.field444);
                                                }
                                                for (int var15 = 0; var15 < var13.field1218; var15++) {
                                                    class131 var16 = var13.field1225[var15];
                                                    if (var16 != null) {
                                                        var16.field2814.method174(var16.field2820, class1.field13, class201.field4030, class40.field889, class137.field2922, var16.field2824 - class4.field78, var16.field2821 - class2.field22, var16.field2815 - class29.field590, var16.field2822);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field1224 == null) {
                                                if (var2.field1212 != null && !class1.method9(var6, var3, var4)) {
                                                    var17 = true;
                                                    class114.method826(var2.field1212, class1.field13, class201.field4030, class40.field889, class137.field2922, var3, var4);
                                                }
                                            } else if (!class1.method9(var6, var3, var4)) {
                                                var17 = true;
                                                if (var2.field1224.field1411 != 12345678 || class80.field1865 && var5 <= class184.field3783) {
                                                    class1.method4(var2.field1224, var6, class1.field13, class201.field4030, class40.field889, class137.field2922, var3, var4);
                                                }
                                            }
                                            int var18 = 0;
                                            int var19 = 0;
                                            class22 var20 = var2.field1210;
                                            class150 var21 = var2.field1231;
                                            if (var20 != null || var21 != null) {
                                                if (class92.field2045 == var3) {
                                                    var18++;
                                                } else if (class92.field2045 < var3) {
                                                    var18 += 2;
                                                }
                                                if (class45.field975 == var4) {
                                                    var18 += 3;
                                                } else if (class45.field975 > var4) {
                                                    var18 += 6;
                                                }
                                                var19 = class188.field3823[var18];
                                                var2.field1226 = class2.field28[var18];
                                            }
                                            if (var20 != null) {
                                                if ((var20.field441 & class191.field3837[var18]) == 0) {
                                                    var2.field1222 = 0;
                                                } else if (var20.field441 == 16) {
                                                    var2.field1222 = 3;
                                                    var2.field1227 = class150.field3140[var18];
                                                    var2.field1236 = 3 - var2.field1227;
                                                } else if (var20.field441 == 32) {
                                                    var2.field1222 = 6;
                                                    var2.field1227 = class203.field4046[var18];
                                                    var2.field1236 = 6 - var2.field1227;
                                                } else if (var20.field441 == 64) {
                                                    var2.field1222 = 12;
                                                    var2.field1227 = class130.field2795[var18];
                                                    var2.field1236 = 12 - var2.field1227;
                                                } else {
                                                    var2.field1222 = 9;
                                                    var2.field1227 = class108.field2407[var18];
                                                    var2.field1236 = 9 - var2.field1227;
                                                }
                                                if ((var20.field441 & var19) != 0 && !class186.method1229(var6, var3, var4, var20.field441)) {
                                                    var20.field448.method174(0, class1.field13, class201.field4030, class40.field889, class137.field2922, var20.field449 - class4.field78, var20.field451 - class2.field22, var20.field454 - class29.field590, var20.field444);
                                                }
                                                if ((var20.field440 & var19) != 0 && !class186.method1229(var6, var3, var4, var20.field440)) {
                                                    var20.field446.method174(0, class1.field13, class201.field4030, class40.field889, class137.field2922, var20.field449 - class4.field78, var20.field451 - class2.field22, var20.field454 - class29.field590, var20.field444);
                                                }
                                            }
                                            if (var21 != null && !class43.method403(var6, var3, var4, var21.field3137.field2440)) {
                                                if ((var21.field3142 & var19) != 0) {
                                                    var21.field3137.method174(0, class1.field13, class201.field4030, class40.field889, class137.field2922, var21.field3132 + var21.field3125 - class4.field78, var21.field3135 - class2.field22, var21.field3126 + var21.field3138 - class29.field590, var21.field3139);
                                                } else if (var21.field3142 == 256) {
                                                    int var22 = var21.field3132 - class4.field78;
                                                    int var23 = var21.field3135 - class2.field22;
                                                    int var24 = var21.field3126 - class29.field590;
                                                    int var25 = var21.field3124;
                                                    int var26;
                                                    if (var25 == 1 || var25 == 2) {
                                                        var26 = -var22;
                                                    } else {
                                                        var26 = var22;
                                                    }
                                                    int var27;
                                                    if (var25 == 2 || var25 == 3) {
                                                        var27 = -var24;
                                                    } else {
                                                        var27 = var24;
                                                    }
                                                    if (var27 < var26) {
                                                        var21.field3137.method174(0, class1.field13, class201.field4030, class40.field889, class137.field2922, var21.field3125 + var22, var23, var21.field3138 + var24, var21.field3139);
                                                    } else if (var21.field3121 != null) {
                                                        var21.field3121.method174(0, class1.field13, class201.field4030, class40.field889, class137.field2922, var22, var23, var24, var21.field3139);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class127 var28 = var2.field1230;
                                                if (var28 != null) {
                                                    var28.field2751.method174(0, class1.field13, class201.field4030, class40.field889, class137.field2922, var28.field2748 - class4.field78, var28.field2754 - class2.field22, var28.field2750 - class29.field590, var28.field2747);
                                                }
                                                class100 var29 = var2.field1219;
                                                if (var29 != null && var29.field2204 == 0) {
                                                    if (var29.field2195 != null) {
                                                        var29.field2195.method174(0, class1.field13, class201.field4030, class40.field889, class137.field2922, var29.field2210 - class4.field78, var29.field2207 - class2.field22, var29.field2193 - class29.field590, var29.field2198);
                                                    }
                                                    if (var29.field2213 != null) {
                                                        var29.field2213.method174(0, class1.field13, class201.field4030, class40.field889, class137.field2922, var29.field2210 - class4.field78, var29.field2207 - class2.field22, var29.field2193 - class29.field590, var29.field2198);
                                                    }
                                                    if (var29.field2191 != null) {
                                                        var29.field2191.method174(0, class1.field13, class201.field4030, class40.field889, class137.field2922, var29.field2210 - class4.field78, var29.field2207 - class2.field22, var29.field2193 - class29.field590, var29.field2198);
                                                    }
                                                }
                                            }
                                            int var30 = var2.field1209;
                                            if (var30 != 0) {
                                                if (var3 < class92.field2045 && (var30 & 0x4) != 0) {
                                                    class54 var31 = var7[var3 + 1][var4];
                                                    if (var31 != null && var31.field1235) {
                                                        class208.field4125.method1236((byte) -116, var31);
                                                    }
                                                }
                                                if (var4 < class45.field975 && (var30 & 0x2) != 0) {
                                                    class54 var32 = var7[var3][var4 + 1];
                                                    if (var32 != null && var32.field1235) {
                                                        class208.field4125.method1236((byte) 120, var32);
                                                    }
                                                }
                                                if (var3 > class92.field2045 && (var30 & 0x1) != 0) {
                                                    class54 var33 = var7[var3 - 1][var4];
                                                    if (var33 != null && var33.field1235) {
                                                        class208.field4125.method1236((byte) 126, var33);
                                                    }
                                                }
                                                if (var4 > class45.field975 && (var30 & 0x8) != 0) {
                                                    class54 var34 = var7[var3][var4 - 1];
                                                    if (var34 != null && var34.field1235) {
                                                        class208.field4125.method1236((byte) 123, var34);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field1222 != 0) {
                                            boolean var35 = true;
                                            for (int var36 = 0; var36 < var2.field1218; var36++) {
                                                if (class101.field2232 != var2.field1225[var36].field2826 && (var2.field1220[var36] & var2.field1222) == var2.field1227) {
                                                    var35 = false;
                                                    break;
                                                }
                                            }
                                            if (var35) {
                                                class22 var37 = var2.field1210;
                                                if (!class186.method1229(var6, var3, var4, var37.field441)) {
                                                    var37.field448.method174(0, class1.field13, class201.field4030, class40.field889, class137.field2922, var37.field449 - class4.field78, var37.field451 - class2.field22, var37.field454 - class29.field590, var37.field444);
                                                }
                                                var2.field1222 = 0;
                                            }
                                        }
                                        if (!var2.field1223) {
                                            break;
                                        }
                                        try {
                                            int var38 = var2.field1218;
                                            var2.field1223 = false;
                                            int var39 = 0;
                                            label558: for (int var40 = 0; var40 < var38; var40++) {
                                                class131 var41 = var2.field1225[var40];
                                                if (class101.field2232 != var41.field2826) {
                                                    for (int var42 = var41.field2816; var42 <= var41.field2827; var42++) {
                                                        for (int var43 = var41.field2812; var43 <= var41.field2828; var43++) {
                                                            class54 var44 = var7[var42][var43];
                                                            if (var44.field1221) {
                                                                var2.field1223 = true;
                                                                continue label558;
                                                            }
                                                            if (var44.field1222 != 0) {
                                                                int var45 = 0;
                                                                if (var42 > var41.field2816) {
                                                                    var45++;
                                                                }
                                                                if (var42 < var41.field2827) {
                                                                    var45 += 4;
                                                                }
                                                                if (var43 > var41.field2812) {
                                                                    var45 += 8;
                                                                }
                                                                if (var43 < var41.field2828) {
                                                                    var45 += 2;
                                                                }
                                                                if ((var45 & var44.field1222) == var2.field1236) {
                                                                    var2.field1223 = true;
                                                                    continue label558;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class196.field3908[var39++] = var41;
                                                    int var46 = class92.field2045 - var41.field2816;
                                                    int var47 = var41.field2827 - class92.field2045;
                                                    if (var47 > var46) {
                                                        var46 = var47;
                                                    }
                                                    int var48 = class45.field975 - var41.field2812;
                                                    int var49 = var41.field2828 - class45.field975;
                                                    if (var49 > var48) {
                                                        var41.field2818 = var46 + var49;
                                                    } else {
                                                        var41.field2818 = var46 + var48;
                                                    }
                                                }
                                            }
                                            while (var39 > 0) {
                                                int var50 = -50;
                                                int var51 = -1;
                                                for (int var52 = 0; var52 < var39; var52++) {
                                                    class131 var53 = class196.field3908[var52];
                                                    if (class101.field2232 != var53.field2826) {
                                                        if (var53.field2818 > var50) {
                                                            var50 = var53.field2818;
                                                            var51 = var52;
                                                        } else if (var53.field2818 == var50) {
                                                            int var54 = var53.field2824 - class4.field78;
                                                            int var55 = var53.field2815 - class29.field590;
                                                            int var56 = class196.field3908[var51].field2824 - class4.field78;
                                                            int var57 = class196.field3908[var51].field2815 - class29.field590;
                                                            if (var54 * var54 + var55 * var55 > var56 * var56 + var57 * var57) {
                                                                var51 = var52;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var51 == -1) {
                                                    break;
                                                }
                                                class131 var58 = class196.field3908[var51];
                                                var58.field2826 = class101.field2232;
                                                if (!class28.method272(var6, var58.field2816, var58.field2827, var58.field2812, var58.field2828, var58.field2814.field2440)) {
                                                    var58.field2814.method174(var58.field2820, class1.field13, class201.field4030, class40.field889, class137.field2922, var58.field2824 - class4.field78, var58.field2821 - class2.field22, var58.field2815 - class29.field590, var58.field2822);
                                                }
                                                for (int var59 = var58.field2816; var59 <= var58.field2827; var59++) {
                                                    for (int var60 = var58.field2812; var60 <= var58.field2828; var60++) {
                                                        class54 var61 = var7[var59][var60];
                                                        if (var61.field1222 != 0) {
                                                            class208.field4125.method1236((byte) 0, var61);
                                                        } else if ((var3 != var59 || var4 != var60) && var61.field1235) {
                                                            class208.field4125.method1236((byte) 119, var61);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field1223) {
                                                break;
                                            }
                                        } catch (Exception var80) {
                                            var2.field1223 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field1235);
                            } while (var2.field1222 != 0);
                            if (var3 > class92.field2045 || var3 <= class8.field121) {
                                break;
                            }
                            var62 = var7[var3 - 1][var4];
                        } while (var62 != null && var62.field1235);
                        if (var3 < class92.field2045 || var3 >= class115.field2575 - 1) {
                            break;
                        }
                        var63 = var7[var3 + 1][var4];
                    } while (var63 != null && var63.field1235);
                    if (var4 > class45.field975 || var4 <= class118.field2617) {
                        break;
                    }
                    var64 = var7[var3][var4 - 1];
                } while (var64 != null && var64.field1235);
                if (var4 < class45.field975 || var4 >= class59.field1468 - 1) {
                    break;
                }
                var65 = var7[var3][var4 + 1];
            } while (var65 != null && var65.field1235);
            var2.field1235 = false;
            class125.field2735--;
            class100 var66 = var2.field1219;
            if (var66 != null && var66.field2204 != 0) {
                if (var66.field2195 != null) {
                    var66.field2195.method174(0, class1.field13, class201.field4030, class40.field889, class137.field2922, var66.field2210 - class4.field78, var66.field2207 - class2.field22 - var66.field2204, var66.field2193 - class29.field590, var66.field2198);
                }
                if (var66.field2213 != null) {
                    var66.field2213.method174(0, class1.field13, class201.field4030, class40.field889, class137.field2922, var66.field2210 - class4.field78, var66.field2207 - class2.field22 - var66.field2204, var66.field2193 - class29.field590, var66.field2198);
                }
                if (var66.field2191 != null) {
                    var66.field2191.method174(0, class1.field13, class201.field4030, class40.field889, class137.field2922, var66.field2210 - class4.field78, var66.field2207 - class2.field22 - var66.field2204, var66.field2193 - class29.field590, var66.field2198);
                }
            }
            if (var2.field1226 != 0) {
                class150 var67 = var2.field1231;
                if (var67 != null && !class43.method403(var6, var3, var4, var67.field3137.field2440)) {
                    if ((var67.field3142 & var2.field1226) != 0) {
                        var67.field3137.method174(0, class1.field13, class201.field4030, class40.field889, class137.field2922, var67.field3132 + var67.field3125 - class4.field78, var67.field3135 - class2.field22, var67.field3126 + var67.field3138 - class29.field590, var67.field3139);
                    } else if (var67.field3142 == 256) {
                        int var68 = var67.field3132 - class4.field78;
                        int var69 = var67.field3135 - class2.field22;
                        int var70 = var67.field3126 - class29.field590;
                        int var71 = var67.field3124;
                        int var72;
                        if (var71 == 1 || var71 == 2) {
                            var72 = -var68;
                        } else {
                            var72 = var68;
                        }
                        int var73;
                        if (var71 == 2 || var71 == 3) {
                            var73 = -var70;
                        } else {
                            var73 = var70;
                        }
                        if (var73 >= var72) {
                            var67.field3137.method174(0, class1.field13, class201.field4030, class40.field889, class137.field2922, var67.field3125 + var68, var69, var67.field3138 + var70, var67.field3139);
                        } else if (var67.field3121 != null) {
                            var67.field3121.method174(0, class1.field13, class201.field4030, class40.field889, class137.field2922, var68, var69, var70, var67.field3139);
                        }
                    }
                }
                class22 var74 = var2.field1210;
                if (var74 != null) {
                    if ((var74.field440 & var2.field1226) != 0 && !class186.method1229(var6, var3, var4, var74.field440)) {
                        var74.field446.method174(0, class1.field13, class201.field4030, class40.field889, class137.field2922, var74.field449 - class4.field78, var74.field451 - class2.field22, var74.field454 - class29.field590, var74.field444);
                    }
                    if ((var74.field441 & var2.field1226) != 0 && !class186.method1229(var6, var3, var4, var74.field441)) {
                        var74.field448.method174(0, class1.field13, class201.field4030, class40.field889, class137.field2922, var74.field449 - class4.field78, var74.field451 - class2.field22, var74.field454 - class29.field590, var74.field444);
                    }
                }
            }
            if (var5 < class4.field66 - 1) {
                class54 var75 = class191.field3853[var5 + 1][var3][var4];
                if (var75 != null && var75.field1235) {
                    class208.field4125.method1236((byte) -11, var75);
                }
            }
            if (var3 < class92.field2045) {
                class54 var76 = var7[var3 + 1][var4];
                if (var76 != null && var76.field1235) {
                    class208.field4125.method1236((byte) 119, var76);
                }
            }
            if (var4 < class45.field975) {
                class54 var77 = var7[var3][var4 + 1];
                if (var77 != null && var77.field1235) {
                    class208.field4125.method1236((byte) -104, var77);
                }
            }
            if (var3 > class92.field2045) {
                class54 var78 = var7[var3 - 1][var4];
                if (var78 != null && var78.field1235) {
                    class208.field4125.method1236((byte) 126, var78);
                }
            }
            if (var4 > class45.field975) {
                class54 var79 = var7[var3][var4 - 1];
                if (var79 != null && var79.field1235) {
                    class208.field4125.method1236((byte) 123, var79);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
    public static final void method399(int arg0) {
        for (int var1 = 0; var1 < class175.field3579; var1++) {
            int var2 = class165.field3327[var1];
            class19 var3 = class204.field4058[var2];
            int var4 = class172.field3441.method221(-101);
            if ((var4 & 0x10) != 0) {
                int var5 = class172.field3441.method217((byte) 48);
                int var6 = class172.field3441.method214((byte) -84);
                var3.method561(4, var5, var6, class89.field1988);
                var3.field1616 = class89.field1988 + 300;
                var3.field1621 = class172.field3441.method221(arg0 ^ 0xFFFFFF95);
            }
            if ((var4 & 0x8) != 0) {
                var3.field1636 = class172.field3441.method250(28198);
                if (var3.field1636 == 65535) {
                    var3.field1636 = -1;
                }
            }
            if ((var4 & 0x40) != 0) {
                var3.field377 = class184.method1222(-20643, class172.field3441.method248(true));
                var3.field1619 = var3.field377.field3743;
                var3.field1638 = var3.field377.field3746;
                var3.field1644 = var3.field377.field3717;
                var3.field1609 = var3.field377.field3708;
                var3.field1643 = var3.field377.field3709;
                var3.field1635 = var3.field377.field3742;
                var3.field1607 = var3.field377.field3720;
                var3.field1645 = var3.field377.field3755;
                var3.field1642 = var3.field377.field3727;
            }
            if ((var4 & 0x1) != 0) {
                int var7 = class172.field3441.method221(-80);
                int var8 = class172.field3441.method221(-102);
                var3.method561(arg0 - 14, var7, var8, class89.field1988);
            }
            if ((var4 & 0x20) != 0) {
                int var9 = class172.field3441.method256((byte) -78);
                if (var9 == 65535) {
                    var9 = -1;
                }
                int var10 = class172.field3441.method221(-96);
                if (var3.field1610 == var9 && var9 != -1) {
                    class52 var11 = class160.method1070((byte) -41, var9);
                    int var12 = var11.field1163;
                    if (var12 == 1) {
                        var3.field1647 = var10;
                        var3.field1641 = 0;
                        var3.field1654 = 0;
                        var3.field1608 = 0;
                        class79.method595(false, var3.field1664, var3.field1654, true, var3.field1676, var11);
                    }
                    if (var12 == 2) {
                        var3.field1641 = 0;
                    }
                } else if (var9 == -1 || var3.field1610 == -1 || class160.method1070((byte) -114, var9).field1180 >= class160.method1070((byte) -45, var3.field1610).field1180) {
                    var3.field1647 = var10;
                    var3.field1654 = 0;
                    var3.field1632 = var3.field1648;
                    var3.field1610 = var9;
                    var3.field1641 = 0;
                    var3.field1608 = 0;
                    if (var3.field1610 != -1) {
                        class79.method595(false, var3.field1664, var3.field1654, true, var3.field1676, class160.method1070((byte) -127, var3.field1610));
                    }
                }
            }
            if ((var4 & 0x80) != 0) {
                var3.field1655 = class172.field3441.method250(arg0 ^ 0x6E34);
                var3.field1623 = class172.field3441.method256((byte) -78);
            }
            if ((var4 & 0x4) != 0) {
                var3.field1633 = class172.field3441.method236(0);
                var3.field1652 = 100;
            }
            if ((var4 & 0x2) != 0) {
                var3.field1671 = class172.field3441.method250(28198);
                int var13 = class172.field3441.method266(-1330);
                var3.field1624 = 0;
                var3.field1666 = 0;
                var3.field1627 = var13 >> 16;
                var3.field1615 = (var13 & 0xFFFF) + class89.field1988;
                if (class89.field1988 < var3.field1615) {
                    var3.field1666 = -1;
                }
                if (var3.field1671 == 65535) {
                    var3.field1671 = -1;
                }
            }
        }
        field925++;
        if (arg0 != 18) {
            field923 = null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V")
    public static void method400(byte arg0) {
        field918 = null;
        if (arg0 != 35) {
            return;
        }
        field920 = null;
        field919 = null;
        field923 = null;
        field928 = null;
        field922 = null;
        field921 = null;
        field914 = null;
        field915 = null;
    }
}
