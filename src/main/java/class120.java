import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class120 {

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "[I")
    public static int[] field1850 = new int[100];

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "I")
    public static int field1855 = 0;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
    public static int field1853;

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "Lfe;")
    public static class259 field1851;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(BI)V", line = 6)
    public static final void method907(byte arg0, int arg1) {
        if (arg0 < -83) {
            field1849++;
            class188 var2 = class147.method1111(-54, arg1, 6);
            var2.method1393((byte) -124);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILjava/lang/String;)V", line = 21)
    public static final void method908(int arg0, String arg1) {
        int var2 = 50 / ((arg0 + 56) / 59);
        System.out.println("Error: " + class189.method1395("%0a", arg1, "\n", (byte) 125));
        field1852++;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)Z", line = 36)
    public static final boolean method909(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class101.field1463; var3++) {
            class339 var4 = class51.field687[var3];
            if (var4.field5280 == 1) {
                int var5 = var4.field5276 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field5267 * var5 >> 8) + var4.field5261;
                    int var7 = (var4.field5258 * var5 >> 8) + var4.field5274;
                    int var8 = (var4.field5271 * var5 >> 8) + var4.field5279;
                    int var9 = (var4.field5273 * var5 >> 8) + var4.field5270;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field5280 == 2) {
                int var10 = arg0 - var4.field5276;
                if (var10 > 0) {
                    int var11 = (var4.field5267 * var10 >> 8) + var4.field5261;
                    int var12 = (var4.field5258 * var10 >> 8) + var4.field5274;
                    int var13 = (var4.field5271 * var10 >> 8) + var4.field5279;
                    int var14 = (var4.field5273 * var10 >> 8) + var4.field5270;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field5280 == 3) {
                int var15 = var4.field5261 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field5265 * var15 >> 8) + var4.field5276;
                    int var17 = (var4.field5268 * var15 >> 8) + var4.field5272;
                    int var18 = (var4.field5271 * var15 >> 8) + var4.field5279;
                    int var19 = (var4.field5273 * var15 >> 8) + var4.field5270;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field5280 == 4) {
                int var20 = arg2 - var4.field5261;
                if (var20 > 0) {
                    int var21 = (var4.field5265 * var20 >> 8) + var4.field5276;
                    int var22 = (var4.field5268 * var20 >> 8) + var4.field5272;
                    int var23 = (var4.field5271 * var20 >> 8) + var4.field5279;
                    int var24 = (var4.field5273 * var20 >> 8) + var4.field5270;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field5280 == 5) {
                int var25 = arg1 - var4.field5279;
                if (var25 > 0) {
                    int var26 = (var4.field5265 * var25 >> 8) + var4.field5276;
                    int var27 = (var4.field5268 * var25 >> 8) + var4.field5272;
                    int var28 = (var4.field5267 * var25 >> 8) + var4.field5261;
                    int var29 = (var4.field5258 * var25 >> 8) + var4.field5274;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V", line = 161)
    public static void method910(byte arg0) {
        field1851 = null;
        if (arg0 <= 36) {
            method907((byte) -111, 62);
        }
        field1850 = null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Z)V", line = 187)
    public static final void method911(boolean arg0) {
        if (class223.field3414 > 1) {
            class223.field3414--;
            class204.field3128 = class12.field155;
        }
        if (class219.field3350 > 0) {
            class219.field3350--;
        }
        field1853++;
        if (class51.field682) {
            class51.field682 = false;
            class299.method2061(0);
            return;
        }
        for (int var1 = 0; var1 < 100 && class324.method2250(-30552); var1++) {
        }
        if (class152.field2308 != 30) {
            return;
        }
        class228.method1614(class85.field1236, (byte) 117, 60);
        Object var2 = field1851.field3990;
        synchronized (field1851.field3990) {
            if (!class122.field1866) {
                field1851.field3997 = 0;
            } else if (class305.field4751 != 0 || field1851.field3997 >= 40) {
                class339.field5262++;
                int var3 = 0;
                class85.field1236.method1141((byte) 75, 130);
                class85.field1236.method1752(0, -80);
                int var4 = class85.field1236.field3866;
                for (int var5 = 0; field1851.field3997 > var5 && (class85.field1236.field3866 - var4) < 240; var5++) {
                    var3++;
                    int var6 = field1851.field3996[var5];
                    int var7 = field1851.field3995[var5];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 65534) {
                        var7 = 65534;
                    }
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    boolean var8 = false;
                    if (field1851.field3996[var5] == -1 && field1851.field3995[var5] == -1) {
                        var7 = -1;
                        var6 = -1;
                        var8 = true;
                    }
                    if (class23.field261 != var7 || class131.field2011 != var6) {
                        int var9 = var7 - class23.field261;
                        class23.field261 = var7;
                        int var10 = var6 - class131.field2011;
                        class131.field2011 = var6;
                        if (class96.field1388 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            class85.field1236.method1744(!arg0, (class96.field1388 << 12) + ((var9 << 6) + var10));
                            class96.field1388 = 0;
                        } else if (class96.field1388 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                            class85.field1236.method1752(class96.field1388 + 128, -86);
                            var10 += 128;
                            var9 += 128;
                            class85.field1236.method1744(!arg0, (var9 << 8) + var10);
                            class96.field1388 = 0;
                        } else if (class96.field1388 < 32) {
                            class85.field1236.method1752(class96.field1388 + 192, -85);
                            if (var8) {
                                class85.field1236.method1773(Integer.MIN_VALUE, false);
                            } else {
                                class85.field1236.method1773(var7 | var6 << 16, false);
                            }
                            class96.field1388 = 0;
                        } else {
                            class85.field1236.method1744(!arg0, class96.field1388 + 57344);
                            if (var8) {
                                class85.field1236.method1773(Integer.MIN_VALUE, arg0);
                            } else {
                                class85.field1236.method1773(var6 << 16 | var7, false);
                            }
                            class96.field1388 = 0;
                        }
                    } else if (class96.field1388 < 2047) {
                        class96.field1388++;
                    }
                }
                class85.field1236.method1767(class85.field1236.field3866 - var4, 791705512);
                if (var3 >= field1851.field3997) {
                    field1851.field3997 = 0;
                } else {
                    field1851.field3997 -= var3;
                    for (int var11 = 0; var11 < field1851.field3997; var11++) {
                        field1851.field3995[var11] = field1851.field3995[var3 + var11];
                        field1851.field3996[var11] = field1851.field3996[var11 + var3];
                    }
                }
            }
        }
        if (class305.field4751 != 0) {
            class299.field4612++;
            long var13 = (class223.field3409 - class172.field2785) / 50L;
            class172.field2785 = class223.field3409;
            int var15 = class47.field640;
            if (var13 > 32767L) {
                var13 = 32767L;
            }
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            int var16 = class109.field1643;
            byte var17 = 0;
            if (class305.field4751 == 2) {
                var17 = 1;
            }
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 65535) {
                var16 = 65535;
            }
            class85.field1236.method1141((byte) 99, 191);
            int var18 = (int) var13;
            class85.field1236.method1744(true, var17 << 15 | var18);
            class85.field1236.method1765(var16 | var15 << 16, -21654);
        }
        if (class202.field3104 > 0) {
            class202.field3104--;
        }
        if (class16.field207 && class202.field3104 <= 0) {
            class16.field207 = false;
            class243.field3693++;
            class202.field3104 = 20;
            class85.field1236.method1141((byte) 119, 240);
            class85.field1236.method1785((int) class307.field4786, (byte) 84);
            class85.field1236.method1785((int) class243.field3695, (byte) 112);
        }
        if (class313.field4857 && !class10.field139) {
            class10.field139 = true;
            class267.field4157++;
            class85.field1236.method1141((byte) 33, 160);
            class85.field1236.method1752(1, -106);
        }
        if (arg0 == class313.field4857 && class10.field139) {
            class10.field139 = false;
            class267.field4157++;
            class85.field1236.method1141((byte) 79, 160);
            class85.field1236.method1752(0, -95);
        }
        if (!class157.field2380) {
            class200.field3050++;
            class85.field1236.method1141((byte) 40, 101);
            class85.field1236.method1769(class307.method2103((byte) -84), (byte) -34);
            class157.field2380 = true;
        }
        if (class322.field4964) {
            class322.field4964 = false;
        } else {
            class283.field4400 /= 2.0F;
        }
        if (class8.field120) {
            class8.field120 = false;
        } else {
            class101.field1459 /= 2.0F;
        }
        class336.method2345(true);
        if (class152.field2308 != 30) {
            return;
        }
        class28.method206(false);
        class146.method1106(-128);
        class177.method1329(0);
        class210.field3211++;
        if (class210.field3211 > 750) {
            class299.method2061(0);
            return;
        }
        class318.method2210(-17);
        class319.method2216(-13);
        class283.method1962(false);
        if (class261.field4011 != null) {
            class102.method766(200);
        }
        for (int var19 = class273.method1907(true, (byte) 79); var19 != -1; var19 = class273.method1907(false, (byte) 79)) {
            class167.method1268(-98, var19);
            class205.field3147[class149.method1117(class35.field515++, 31)] = var19;
        }
        for (class188 var20 = class4.method23(0); var20 != null; var20 = class4.method23(0)) {
            int var21 = var20.method1391(-15255);
            int var22 = var20.method1390(!arg0);
            if (var21 == 1) {
                class233.field3555[var22] = var20.field2959;
                class25.field292[class149.method1117(31, class209.field3203++)] = var22;
            } else if (var21 == 2) {
                class291.field4480[var22] = var20.field2950;
                class232.field3537[class149.method1117(class142.field2184++, 31)] = var22;
            } else if (var21 == 3) {
                class161 var43 = class331.method2308((byte) -124, var22);
                if (!var20.field2950.equals(var43.field2466)) {
                    var43.field2466 = var20.field2950;
                    class254.method1776(4, var43);
                }
            } else if (var21 == 4) {
                class161 var39 = class331.method2308((byte) -122, var22);
                int var40 = var20.field2954;
                int var41 = var20.field2959;
                int var42 = var20.field2955;
                if (var39.field2481 != var41 || var39.field2444 != var40 || var39.field2496 != var42) {
                    var39.field2481 = var41;
                    var39.field2496 = var42;
                    var39.field2444 = var40;
                    class254.method1776(4, var39);
                }
            } else if (var21 == 5) {
                class161 var23 = class331.method2308((byte) 79, var22);
                if (var20.field2959 != var23.field2494 || var20.field2959 == -1) {
                    var23.field2494 = var20.field2959;
                    var23.field2460 = 0;
                    var23.field2470 = 0;
                    var23.field2532 = 1;
                    class254.method1776(4, var23);
                }
            } else if (var21 == 6) {
                int var33 = var20.field2959;
                int var34 = (var33 & 0x3F1) >> 5;
                int var35 = var33 & 0x1F;
                int var36 = var33 >> 10 & 0x1F;
                int var37 = (var34 << 11) + (var36 << 19) + (var35 << 3);
                class161 var38 = class331.method2308((byte) 90, var22);
                if (var38.field2597 != var37) {
                    var38.field2597 = var37;
                    class254.method1776(4, var38);
                }
            } else if (var21 == 7) {
                class161 var31 = class331.method2308((byte) 37, var22);
                boolean var32 = var20.field2959 == 1;
                if (var31.field2557 != var32) {
                    var31.field2557 = var32;
                    class254.method1776(4, var31);
                }
            } else if (var21 == 8) {
                class161 var24 = class331.method2308((byte) 112, var22);
                if (var20.field2959 != var24.field2622 || var20.field2954 != var24.field2473 || var20.field2955 != var24.field2565) {
                    var24.field2622 = var20.field2959;
                    var24.field2565 = var20.field2955;
                    if (var24.field2523 != -1) {
                        if (var24.field2465 > 0) {
                            var24.field2565 = var24.field2565 * 32 / var24.field2465;
                        } else if (var24.field2576 > 0) {
                            var24.field2565 = var24.field2565 * 32 / var24.field2576;
                        }
                    }
                    var24.field2473 = var20.field2954;
                    class254.method1776(4, var24);
                }
            } else if (var21 == 9) {
                class161 var25 = class331.method2308((byte) 88, var22);
                if (var20.field2959 != var25.field2523 || var20.field2954 != var25.field2456) {
                    var25.field2523 = var20.field2959;
                    var25.field2456 = var20.field2954;
                    class254.method1776(4, var25);
                }
            } else if (var21 == 10) {
                class161 var30 = class331.method2308((byte) -121, var22);
                if (var20.field2959 != var30.field2600 || var20.field2954 != var30.field2609 || var20.field2955 != var30.field2475) {
                    var30.field2475 = var20.field2955;
                    var30.field2609 = var20.field2954;
                    var30.field2600 = var20.field2959;
                    class254.method1776(4, var30);
                }
            } else if (var21 == 11) {
                class161 var26 = class331.method2308((byte) -126, var22);
                var26.field2587 = var26.field2558 = var20.field2954;
                var26.field2621 = var26.field2513 = var20.field2959;
                var26.field2577 = 0;
                var26.field2534 = 0;
                class254.method1776(4, var26);
            } else if (var21 == 12) {
                class161 var27 = class331.method2308((byte) -10, var22);
                int var28 = var20.field2959;
                if (var27 != null && var27.field2590 == 0) {
                    if (var28 > var27.field2441 - var27.field2490) {
                        var28 = var27.field2441 - var27.field2490;
                    }
                    if (var28 < 0) {
                        var28 = 0;
                    }
                    if (var27.field2546 != var28) {
                        var27.field2546 = var28;
                        class254.method1776(4, var27);
                    }
                }
            } else if (var21 == 13) {
                class161 var29 = class331.method2308((byte) 8, var22);
                var29.field2617 = var20.field2959;
            }
        }
        class228.field3488++;
        if (class139.field2093 != 0) {
            class89.field1268 += 20;
            if (class89.field1268 >= 400) {
                class139.field2093 = 0;
            }
        }
        if (class307.field4782 != null) {
            class36.field523++;
            if (class36.field523 >= 15) {
                class254.method1776(4, class307.field4782);
                class307.field4782 = null;
            }
        }
        if (class192.field2995 != null) {
            class254.method1776(4, class192.field2995);
            class61.field819++;
            if (class290.field4468 > (class262.field4027 + 5) || class290.field4468 < class262.field4027 - 5 || (class10.field144 + 5) < class108.field1622 || class10.field144 - 5 > class108.field1622) {
                class8.field118 = true;
            }
            if (class240.field3670 == 0) {
                if (class8.field118 && class61.field819 >= 5) {
                    if (class322.field4971 == class192.field2995 && class59.field788 != class30.field358) {
                        class161 var44 = class192.field2995;
                        class255.field3906++;
                        byte var45 = 0;
                        if (class214.field3295 == 1 && var44.field2598 == 206) {
                            var45 = 1;
                        }
                        if (var44.field2487[class30.field358] <= 0) {
                            var45 = 0;
                        }
                        if (client.method1012(var44).method25(-1)) {
                            int var46 = class59.field788;
                            int var47 = class30.field358;
                            var44.field2487[var47] = var44.field2487[var46];
                            var44.field2480[var47] = var44.field2480[var46];
                            var44.field2487[var46] = -1;
                            var44.field2480[var46] = 0;
                        } else if (var45 == 1) {
                            int var48 = class30.field358;
                            int var49 = class59.field788;
                            while (var48 != var49) {
                                if (var49 > var48) {
                                    var44.method1206(var49 - 1, true, var49);
                                    var49--;
                                } else if (var48 > var49) {
                                    var44.method1206(var49 + 1, true, var49);
                                    var49++;
                                }
                            }
                        } else {
                            var44.method1206(class30.field358, true, class59.field788);
                        }
                        class85.field1236.method1141((byte) 124, 47);
                        class85.field1236.method1773(class192.field2995.field2615, false);
                        class85.field1236.method1785(class30.field358, (byte) 115);
                        class85.field1236.method1752(var45, -110);
                        class85.field1236.method1784(class59.field788, (byte) -68);
                    }
                } else if ((class3.field35 == 1 || class100.method756(-28475, class32.field393 - 1)) && class32.field393 > 2) {
                    class147.method1112(false);
                } else if (class32.field393 > 0) {
                    class114.method877(-126);
                }
                class36.field523 = 10;
                class192.field2995 = null;
                class305.field4751 = 0;
            }
        }
        class295.field4547 = null;
        class14.field196 = 0;
        class136.field2056 = false;
        class163.field2646 = false;
        class161 var50 = class108.field1584;
        class161 var51 = class3.field40;
        class3.field40 = null;
        class108.field1584 = null;
        while (class251.method1722((byte) 84) && class14.field196 < 128) {
            class90.field1279[class14.field196] = class211.field3245;
            class182.field2883[class14.field196] = class280.field4356;
            class14.field196++;
        }
        class261.field4011 = null;
        if (class28.field334 != -1) {
            class205.method1480(class28.field334, 0, 0, -1, class215.field3300, 0, class151.field2281, 0);
        }
        class12.field155++;
        while (true) {
            class296 var52;
            class161 var53;
            class161 var54;
            do {
                var52 = (class296) class61.field820.method1944(122);
                if (var52 == null) {
                    while (true) {
                        class296 var55;
                        class161 var56;
                        class161 var57;
                        do {
                            var55 = (class296) class8.field127.method1944(64);
                            if (var55 == null) {
                                while (true) {
                                    class296 var58;
                                    class161 var59;
                                    class161 var60;
                                    do {
                                        var58 = (class296) class146.field2231.method1944(120);
                                        if (var58 == null) {
                                            if (class261.field4011 == null) {
                                                class60.field792 = 0;
                                            }
                                            if (class296.field4572 != null) {
                                                class267.method1877(-1);
                                            }
                                            if (class295.field4546 > 0 && class180.field2860[82] && class180.field2860[81] && class62.field826 != 0) {
                                                int var61 = class265.field4112 - class62.field826;
                                                if (var61 < 0) {
                                                    var61 = 0;
                                                } else if (var61 > 3) {
                                                    var61 = 3;
                                                }
                                                class106.method790(var61, class39.field575.field4744[0] + class293.field4522, (byte) -80, class39.field575.field4676[0] + class327.field5054);
                                            }
                                            if (class295.field4546 > 0 && class180.field2860[82] && class180.field2860[81]) {
                                                if (class257.field3933 != -1) {
                                                    class106.method790(class265.field4112, class293.field4522 + class264.field4101, (byte) -91, class327.field5054 + class257.field3933);
                                                }
                                                class216.field3306 = 0;
                                                class304.field4647 = 0;
                                            } else if (class304.field4647 == 2) {
                                                if (class257.field3933 != -1) {
                                                    class85.field1236.method1141((byte) 117, 206);
                                                    class188.field2957++;
                                                    class85.field1236.method1785(class183.field2893, (byte) 107);
                                                    class85.field1236.method1784(class327.field5054 + class257.field3933, (byte) -54);
                                                    class85.field1236.method1744(true, class293.field4522 + class264.field4101);
                                                    class85.field1236.method1765(class333.field5194, -21654);
                                                    class223.field3406 = class47.field640;
                                                    class89.field1268 = 0;
                                                    class139.field2093 = 1;
                                                    class111.field1683 = class109.field1643;
                                                }
                                                class304.field4647 = 0;
                                            } else if (class216.field3306 == 2) {
                                                if (class257.field3933 != -1) {
                                                    class261.field4014++;
                                                    class85.field1236.method1141((byte) 68, 29);
                                                    class85.field1236.method1784(class293.field4522 + class264.field4101, (byte) -57);
                                                    class85.field1236.method1744(true, class327.field5054 + class257.field3933);
                                                    class89.field1268 = 0;
                                                    class139.field2093 = 1;
                                                    class223.field3406 = class47.field640;
                                                    class111.field1683 = class109.field1643;
                                                }
                                                class216.field3306 = 0;
                                            } else if (class257.field3933 != -1 && class304.field4647 == 0 && class216.field3306 == 0) {
                                                class307.method2104(0, 0, (class264.field4101 << 1) + 1 - class39.field575.method1897(8) >> 1, (class257.field3933 << 1) + (1 - class39.field575.method1897(8)) >> 1);
                                                class139.field2093 = 1;
                                                class223.field3406 = class47.field640;
                                                class89.field1268 = 0;
                                                class111.field1683 = class109.field1643;
                                            }
                                            class257.field3933 = -1;
                                            class203.method1466(122);
                                            if (class3.field40 != var51) {
                                                if (var51 != null) {
                                                    class254.method1776(4, var51);
                                                }
                                                if (class3.field40 != null) {
                                                    class254.method1776(4, class3.field40);
                                                }
                                            }
                                            if (class108.field1584 != var50 && class264.field4098 == class23.field259) {
                                                if (var50 != null) {
                                                    class254.method1776(4, var50);
                                                }
                                                if (class108.field1584 != null) {
                                                    class254.method1776(4, class108.field1584);
                                                }
                                            }
                                            if (class108.field1584 == null) {
                                                if (class23.field259 > 0) {
                                                    class23.field259--;
                                                }
                                            } else if (class23.field259 < class264.field4098) {
                                                class23.field259++;
                                                if (class264.field4098 == class23.field259) {
                                                    class254.method1776(4, class108.field1584);
                                                }
                                            }
                                            for (int var62 = 0; var62 < 5; var62++) {
                                                int var10002 = class217.field3328[var62]++;
                                            }
                                            int var63 = class307.method2102(5);
                                            int var64 = class184.method1368(-62);
                                            if (var63 > 15000 && var64 > 15000) {
                                                class325.field5010++;
                                                class219.field3350 = 250;
                                                class130.method1014((byte) 127, 14500);
                                                class85.field1236.method1141((byte) 127, 120);
                                            }
                                            if (class336.field5228 != null && class336.field5228.field3185 == 1) {
                                                if (class336.field5228.field3186 != null) {
                                                    class87.method646(class237.field3607, class168.field2728, (byte) 121);
                                                }
                                                class168.field2728 = null;
                                                class336.field5228 = null;
                                                class237.field3607 = false;
                                            }
                                            class240.field3667++;
                                            class76.field1105++;
                                            class83.field1220++;
                                            if (class76.field1105 > 500) {
                                                class76.field1105 = 0;
                                                int var65 = (int) (Math.random() * 8.0D);
                                                if ((var65 & 0x4) == 4) {
                                                    class72.field1036 += class71.field1016;
                                                }
                                                if ((var65 & 0x1) == 1) {
                                                    class229.field3495 += class83.field1215;
                                                }
                                                if ((var65 & 0x2) == 2) {
                                                    class87.field1239 += class320.field4960;
                                                }
                                            }
                                            if (class240.field3667 > 500) {
                                                class240.field3667 = 0;
                                                int var66 = (int) (Math.random() * 8.0D);
                                                if ((var66 & 0x2) == 2) {
                                                    class94.field1332 += class260.field4010;
                                                }
                                                if ((var66 & 0x1) == 1) {
                                                    class63.field846 += class63.field851;
                                                }
                                            }
                                            if (class94.field1332 < -20) {
                                                class260.field4010 = 1;
                                            }
                                            if (class72.field1036 < -40) {
                                                class71.field1016 = 1;
                                            }
                                            if (class87.field1239 < -55) {
                                                class320.field4960 = 2;
                                            }
                                            if (class94.field1332 > 10) {
                                                class260.field4010 = -1;
                                            }
                                            if (class72.field1036 > 40) {
                                                class71.field1016 = -1;
                                            }
                                            if (class87.field1239 > 55) {
                                                class320.field4960 = -2;
                                            }
                                            if (class63.field846 < -60) {
                                                class63.field851 = 2;
                                            }
                                            if (class229.field3495 < -50) {
                                                class83.field1215 = 2;
                                            }
                                            if (class63.field846 > 60) {
                                                class63.field851 = -2;
                                            }
                                            if (class229.field3495 > 50) {
                                                class83.field1215 = -2;
                                            }
                                            if (class83.field1220 > 50) {
                                                class85.field1236.method1141((byte) 60, 84);
                                                class163.field2635++;
                                            }
                                            if (class112.field1693) {
                                                class75.method593((byte) 16);
                                                class112.field1693 = false;
                                            }
                                            try {
                                                if (class1.field20 != null && class85.field1236.field3866 > 0) {
                                                    class1.field20.method1651(0, class85.field1236.field3866, class85.field1236.field3840, (byte) -70);
                                                    class83.field1220 = 0;
                                                    class85.field1236.field3866 = 0;
                                                }
                                            } catch (IOException var68) {
                                                class299.method2061(0);
                                            }
                                            return;
                                        }
                                        var59 = var58.field4574;
                                        if (var59.field2510 < 0) {
                                            break;
                                        }
                                        var60 = class331.method2308((byte) -127, var59.field2566);
                                    } while (var60 == null || var60.field2509 == null || var59.field2510 >= var60.field2509.length || var60.field2509[var59.field2510] != var59);
                                    class251.method1719(-31, var58);
                                }
                            }
                            var56 = var55.field4574;
                            if (var56.field2510 < 0) {
                                break;
                            }
                            var57 = class331.method2308((byte) -127, var56.field2566);
                        } while (var57 == null || var57.field2509 == null || var56.field2510 >= var57.field2509.length || var57.field2509[var56.field2510] != var56);
                        class251.method1719(-31, var55);
                    }
                }
                var53 = var52.field4574;
                if (var53.field2510 < 0) {
                    break;
                }
                var54 = class331.method2308((byte) 32, var53.field2566);
            } while (var54 == null || var54.field2509 == null || var53.field2510 >= var54.field2509.length || var54.field2509[var53.field2510] != var53);
            class251.method1719(-31, var52);
        }
    }
}
