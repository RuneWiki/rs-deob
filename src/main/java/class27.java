import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class27 {

    @OriginalMember(owner = "client!de", name = "c", descriptor = "[I")
    public static int[] field529 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!de", name = "b", descriptor = "Lqf;")
    public static class117 field528 = class72.method514(104, "Weiter");

    @OriginalMember(owner = "client!de", name = "a", descriptor = "I")
    public static int field527 = 127;

    @OriginalMember(owner = "client!de", name = "n", descriptor = "Z")
    public static boolean field540 = false;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "I")
    public static int field533 = 0;

    @OriginalMember(owner = "client!de", name = "i", descriptor = "I")
    public static int field535 = 0;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "I")
    public static int field531 = 0;

    @OriginalMember(owner = "client!de", name = "o", descriptor = "Lqf;")
    public static class117 field541 = class72.method514(124, "Ung-Ultiger Benutzername");

    @OriginalMember(owner = "client!de", name = "p", descriptor = "I")
    public static int field542 = 0;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!de", name = "h", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!de", name = "j", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!de", name = "k", descriptor = "I")
    public static int field537;

    @OriginalMember(owner = "client!de", name = "l", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!de", name = "m", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(II)V")
    public static final void method204(int arg0, int arg1) {
        if (arg0 != 507) {
            return;
        }
        class78 var2 = (class78) client.field395.method1221(82, (long) arg1);
        field537++;
        if (var2 != null) {
            var2.method495(-54);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
    public static final void method205(int arg0) {
        field539++;
        class50.method371(arg0 ^ 0x17F9);
        if (class60.field1228 == 1) {
            class124.field2936[class16.field261 / 100].method660(class124.field2922 - 8 - 4, class4.field69 + -4 - 8);
        }
        if (class60.field1228 == 2) {
            class124.field2936[class16.field261 / 100 + 4].method660(class124.field2922 - 8 - 4, class4.field69 + -12);
        }
        if (class56.field1155 != -1) {
            class129.method1006(class56.field1155, 2047);
            class19.method153(4, arg0 ^ 0xFFFFA5F5, class56.field1155, 512, 0, 334, 0);
        }
        if (class96.field2316 != -1) {
            class129.method1006(class96.field2316, 2047);
            class19.method153(0, arg0 - 25869, class96.field2316, 512, 0, 334, 0);
        }
        class116.method897((byte) 84);
        if (!class81.field1864) {
            class135.method1056((byte) 18);
            class69.method486((byte) -125);
        } else if (class24.field468 == 0) {
            class58.method415(-104);
        }
        if (class4.field65 == 1) {
            class116.field2761.method660(472, 296);
        }
        if (class3.field42) {
            short var1 = 507;
            byte var2 = 20;
            class25.field501.method315(class73.method530((byte) -83, new class117[] { class66.field1388, class79.method614(arg0 ^ 0x2B64, class15.field221) }), var1, var2, 16776960, -1);
            int var9 = var2 + 15;
            Runtime var3 = Runtime.getRuntime();
            int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
            int var5 = 16776960;
            if (var4 > 32768 && class20.field334) {
                var5 = 16711680;
            }
            if (var4 > 65536 && !class20.field334) {
                var5 = 16711680;
            }
            class25.field501.method315(class73.method530((byte) -83, new class117[] { class67.field1409, class79.method614(15591, var4), class31.field668 }), var1, var9, var5, -1);
            var9 += 15;
            if (class134.field3204) {
                class25.field501.method315(class72.field1592, var1, var9, 16711680, -1);
                class134.field3204 = false;
                var9 += 15;
            }
            if (class4.field70) {
                class25.field501.method315(class73.field1597, var1, var9, 16711680, -1);
                class4.field70 = false;
                var9 += 15;
            }
            if (class125.field2963) {
                class25.field501.method315(class104.field2517, var1, var9, 16711680, -1);
                var9 += 15;
                class125.field2963 = false;
            }
        }
        if (arg0 != 6019) {
            field536 = -79;
        }
        if (class16.field245 == 0) {
            return;
        }
        int var6 = class16.field245 / 50;
        int var7 = var6 / 60;
        int var8 = var6 % 60;
        if (var8 >= 10) {
            class25.field501.method330(class73.method530((byte) -83, new class117[] { class90.field2166, class79.method614(15591, var7), class35.field737, class79.method614(15591, var8) }), 4, 329, 16776960, -1);
        } else {
            class25.field501.method330(class73.method530((byte) -83, new class117[] { class90.field2166, class79.method614(15591, var7), class152.field3748, class79.method614(15591, var8) }), 4, 329, 16776960, -1);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IB)Lkc;")
    public static final class72 method206(int arg0, byte arg1) {
        class72 var2 = (class72) class94.field2283.method247(0, (long) arg0);
        field534++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class44.field870.method458(false, arg0, 10);
        class72 var4 = new class72();
        var4.field1546 = arg0;
        if (var3 != null) {
            var4.method509((byte) -76, new class77(var3));
        }
        var4.method518((byte) -57);
        if (var4.field1551 != -1) {
            var4.method506(method206(var4.field1551, (byte) 90), method206(var4.field1547, (byte) 90), -106);
        }
        if (arg1 != 90) {
            return null;
        }
        if (!class73.field1604 && var4.field1581) {
            var4.field1593 = null;
            var4.field1544 = class45.field900;
            var4.field1563 = null;
            var4.field1559 = 0;
        }
        class94.field2283.method248((long) arg0, (byte) -119, var4);
        return var4;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(I)V")
    public static void method207(int arg0) {
        field529 = null;
        if (arg0 == -19549) {
            field541 = null;
            field528 = null;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BLmf;)Z")
    public static final boolean method208(byte arg0, class89 arg1) {
        field538++;
        int var2 = arg1.field2136;
        if (class64.field1334 == 2) {
            if (var2 == 201) {
                class141.field3412 = class141.field3351;
                class124.field2924 = 0;
                class141.field3376 = class148.field3616;
                class87.field1993 = true;
                class79.field1813 = 1;
                class69.field1445 = true;
            }
            if (var2 == 202) {
                class87.field1993 = true;
                class141.field3376 = class13.field188;
                class124.field2924 = 0;
                class79.field1813 = 2;
                class141.field3412 = class141.field3351;
                class69.field1445 = true;
            }
        }
        if (arg0 != 126) {
            return false;
        } else if (var2 == 205) {
            class41.field817 = 250;
            return true;
        } else {
            if (var2 == 501) {
                class69.field1445 = true;
                class79.field1813 = 4;
                class124.field2924 = 0;
                class141.field3376 = class3.field59;
                class141.field3412 = class141.field3351;
                class87.field1993 = true;
            }
            if (var2 == 502) {
                class69.field1445 = true;
                class87.field1993 = true;
                class141.field3412 = class141.field3351;
                class141.field3376 = class130.field3075;
                class79.field1813 = 5;
                class124.field2924 = 0;
            }
            if (var2 >= 300 && var2 <= 313) {
                int var3 = (var2 - 300) / 2;
                int var4 = var2 & 0x1;
                class79.field1788.method769(var4 == 1, var3, false);
            }
            if (var2 >= 314 && var2 <= 323) {
                int var5 = (var2 - 314) / 2;
                int var6 = var2 & 0x1;
                class79.field1788.method771(var5, var6 == 1, arg0 - 2399);
            }
            if (var2 == 324) {
                class79.field1788.method772(-1, false);
            }
            if (var2 == 325) {
                class79.field1788.method772(-1, true);
            }
            if (var2 == 326) {
                class143.field3499++;
                class99.field2373.method961(168, -1198);
                class79.field1788.method770((byte) -26, class99.field2373);
                return true;
            }
            if (var2 == 620) {
                class4.field74 = !class4.field74;
            }
            if (var2 >= 601 && var2 <= 613) {
                class93.method735(true);
                if (class141.field3384.method915(arg0 - 99) > 0) {
                    class99.field2373.method961(84, arg0 ^ 0xFFFFFB2C);
                    class99.field2373.method606(class141.field3384.method942((byte) 11), (byte) 107);
                    class71.field1520++;
                    class99.field2373.method571(var2 - 601, arg0 + -11250);
                    class99.field2373.method571(class4.field74 ? 1 : 0, arg0 ^ 0xFFFFD4F2);
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(I)V")
    public static final void method209(int arg0) {
        if (arg0 < 109) {
            method205(-26);
        }
        if (class26.field518 == 227) {
            byte var1 = class96.field2338.method588(0);
            byte var2 = class96.field2338.method555((byte) -24);
            int var3 = class96.field2338.method587(false);
            int var4 = class96.field2338.method559((byte) -73);
            int var5 = var4 >> 2;
            int var6 = var4 & 0x3;
            int var7 = class101.field2445[var5];
            byte var8 = class96.field2338.method555((byte) -24);
            int var9 = class96.field2338.method596(68);
            int var10 = (var9 >> 4 & 0x7) + class20.field318;
            int var11 = (var9 & 0x7) + class122.field2901;
            int var12 = class96.field2338.method597(112);
            int var13 = class96.field2338.method587(false);
            int var14 = class96.field2338.method574((byte) -107);
            byte var15 = class96.field2338.method592((byte) -113);
            class21 var16;
            if (class43.field857 == var14) {
                var16 = class141.field3395;
            } else {
                var16 = class149.field3709[var14];
            }
            if (var16 != null) {
                class148 var17 = class23.method181((byte) -58, var13);
                int var18 = class64.field1306[class140.field3344][var10][var11];
                int var19 = class64.field1306[class140.field3344][var10 + 1][var11];
                int var20 = class64.field1306[class140.field3344][var10 + 1][var11 + 1];
                int var21 = class64.field1306[class140.field3344][var10][var11 + 1];
                class30 var22 = var17.method1186((byte) -81, var20, var6, var18, var21, var5, var19);
                if (var22 != null) {
                    class121.method971(0, var3 + 1, var12 + 1, 120, -1, var7, var11, class140.field3344, var10, 0);
                    var16.field357 = var22;
                    if (var1 < var8) {
                        byte var23 = var8;
                        var8 = var1;
                        var1 = var23;
                    }
                    int var24 = var17.field3665;
                    var16.field343 = var12 + class43.field856;
                    if (var2 > var15) {
                        byte var25 = var2;
                        var2 = var15;
                        var15 = var25;
                    }
                    var16.field341 = class43.field856 + var3;
                    int var26 = var17.field3649;
                    if (var6 == 1 || var6 == 3) {
                        var26 = var17.field3665;
                        var24 = var17.field3649;
                    }
                    var16.field352 = var10 * 128 + var24 * 64;
                    var16.field342 = var11 * 128 + var26 * 64;
                    var16.field347 = class80.method626(var16.field352, class140.field3344, var16.field342, 80);
                    var16.field349 = var8 + var10;
                    var16.field338 = var11 + var15;
                    var16.field366 = var1 + var10;
                    var16.field373 = var11 + var2;
                }
            }
        }
        field532++;
        if (class26.field518 == 48) {
            int var27 = class96.field2338.method570((byte) 123);
            int var28 = class20.field318 + (var27 >> 4 & 0x7);
            int var29 = (var27 & 0x7) + class122.field2901;
            int var30 = class96.field2338.method587(false);
            if (var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
                class5 var31 = class43.field858[class140.field3344][var28][var29];
                if (var31 != null) {
                    for (class3 var32 = (class3) var31.method27(18823); var32 != null; var32 = (class3) var31.method25((byte) -126)) {
                        if ((var30 & 0x7FFF) == var32.field60) {
                            var32.method495(-106);
                            break;
                        }
                    }
                    if (var31.method27(18823) == null) {
                        class43.field858[class140.field3344][var28][var29] = null;
                    }
                    class67.method477(1, var29, var28);
                }
            }
        } else if (class26.field518 == 119) {
            int var33 = class96.field2338.method570((byte) 123);
            int var34 = (var33 & 0x7) + class122.field2901;
            int var35 = (var33 >> 4 & 0x7) + class20.field318;
            int var36 = class96.field2338.method597(107);
            int var37 = class96.field2338.method570((byte) 123);
            int var38 = class96.field2338.method597(44);
            if (var35 >= 0 && var34 >= 0 && var35 < 104 && var34 < 104) {
                int var39 = var34 * 128 + 64;
                int var40 = var35 * 128 + 64;
                class81 var41 = new class81(var36, class140.field3344, var40, var39, class80.method626(var40, class140.field3344, var39, -128) - var37, var38, class43.field856);
                class129.field3056.method22(var41, (byte) 114);
            }
        } else if (class26.field518 == 39) {
            int var42 = class96.field2338.method570((byte) 123);
            int var43 = (var42 & 0x7) + class122.field2901;
            int var44 = (var42 >> 4 & 0x7) + class20.field318;
            int var45 = class96.field2338.method592((byte) -106) + var44;
            int var46 = class96.field2338.method592((byte) -100) + var43;
            int var47 = class96.field2338.method603(113);
            int var48 = class96.field2338.method597(49);
            int var49 = class96.field2338.method570((byte) 123) * 4;
            int var50 = class96.field2338.method570((byte) 123) * 4;
            int var51 = class96.field2338.method597(113);
            int var52 = class96.field2338.method597(115);
            int var53 = class96.field2338.method570((byte) 123);
            int var54 = class96.field2338.method570((byte) 123);
            if (var44 >= 0 && var43 >= 0 && var44 < 104 && var43 < 104 && var45 >= 0 && var46 >= 0 && var45 < 104 && var46 < 104 && var48 != 65535) {
                int var55 = var43 * 128 + 64;
                int var56 = var46 * 128 + 64;
                int var57 = var45 * 128 + 64;
                int var58 = var44 * 128 + 64;
                class90 var59 = new class90(var48, class140.field3344, var58, var55, class80.method626(var58, class140.field3344, var55, 24) - var49, class43.field856 + var51, var52 + class43.field856, var53, var54, var47, var50);
                var59.method712(class80.method626(var57, class140.field3344, var56, -125) - var50, (byte) -88, var56, class43.field856 + var51, var57);
                class133.field3141.method22(var59, (byte) 46);
            }
        } else if (class26.field518 == 111) {
            int var60 = class96.field2338.method589((byte) -128);
            int var61 = class96.field2338.method574((byte) -122);
            int var62 = class96.field2338.method587(false);
            int var63 = class96.field2338.method559((byte) -73);
            int var64 = (var63 >> 4 & 0x7) + class20.field318;
            int var65 = (var63 & 0x7) + class122.field2901;
            if (var64 >= 0 && var65 >= 0 && var64 < 104 && var65 < 104 && class43.field857 != var61) {
                class3 var66 = new class3();
                var66.field60 = var60;
                var66.field61 = var62;
                if (class43.field858[class140.field3344][var64][var65] == null) {
                    class43.field858[class140.field3344][var64][var65] = new class5();
                }
                class43.field858[class140.field3344][var64][var65].method22(var66, (byte) 126);
                class67.method477(1, var65, var64);
            }
        } else {
            if (class26.field518 == 87) {
                int var67 = class96.field2338.method570((byte) 123);
                int var68 = class20.field318 + (var67 >> 4 & 0x7);
                int var69 = (var67 & 0x7) + class122.field2901;
                int var70 = class96.field2338.method597(118);
                int var71 = class96.field2338.method570((byte) 123);
                int var72 = var71 >> 4 & 0xF;
                int var73 = class96.field2338.method570((byte) 123);
                int var74 = var71 & 0x7;
                if (var68 >= 0 && var69 >= 0 && var68 < 104 && var69 < 104) {
                    int var75 = var72 + 1;
                    if (class141.field3395.field2004[0] >= var68 - var75 && class141.field3395.field2004[0] <= var68 + var75 && var69 - var75 <= class141.field3395.field1970[0] && var69 + var75 >= class141.field3395.field1970[0] && field527 != 0 && var74 > 0 && class71.field1515 < 50) {
                        class41.field814[class71.field1515] = var70;
                        class150.field3719[class71.field1515] = var74;
                        class95.field2289[class71.field1515] = var73;
                        class115.field2720[class71.field1515] = null;
                        class124.field2923[class71.field1515] = (var68 << 16) + (var69 << 8) + var72;
                        class71.field1515++;
                    }
                }
            }
            if (class26.field518 == 209) {
                int var76 = class96.field2338.method597(80);
                int var77 = class96.field2338.method570((byte) 123);
                int var78 = class20.field318 + (var77 >> 4 & 0x7);
                int var79 = class122.field2901 + (var77 & 0x7);
                int var80 = class96.field2338.method596(33);
                int var81 = var80 >> 2;
                int var82 = var80 & 0x3;
                int var83 = class101.field2445[var81];
                if (var78 >= 0 && var79 >= 0 && var78 < 103 && var79 < 103) {
                    int var84 = class64.field1306[class140.field3344][var78 + 1][var79];
                    int var85 = class64.field1306[class140.field3344][var78][var79];
                    int var86 = class64.field1306[class140.field3344][var78 + 1][var79 + 1];
                    int var87 = class64.field1306[class140.field3344][var78][var79 + 1];
                    if (var83 == 0) {
                        class129 var88 = class19.field311.method879(class140.field3344, var78, var79);
                        if (var88 != null) {
                            int var89 = var88.field3049 >> 14 & 0x7FFF;
                            if (var81 == 2) {
                                var88.field3057 = new class8(var89, 2, var82 + 4, var85, var84, var86, var87, var76, false, var88.field3057);
                                var88.field3047 = new class8(var89, 2, var82 + 1 & 0x3, var85, var84, var86, var87, var76, false, var88.field3047);
                            } else {
                                var88.field3057 = new class8(var89, var81, var82, var85, var84, var86, var87, var76, false, var88.field3057);
                            }
                        }
                    }
                    if (var83 == 1) {
                        class48 var90 = class19.field311.method853(class140.field3344, var78, var79);
                        if (var90 != null) {
                            var90.field975 = new class8(var90.field1020 >> 14 & 0x7FFF, 4, 0, var85, var84, var86, var87, var76, false, var90.field975);
                        }
                    }
                    if (var83 == 2) {
                        class125 var91 = class19.field311.method859(class140.field3344, var78, var79);
                        if (var81 == 11) {
                            var81 = 10;
                        }
                        if (var91 != null) {
                            var91.field2941 = new class8(var91.field2959 >> 14 & 0x7FFF, var81, var82, var85, var84, var86, var87, var76, false, var91.field2941);
                        }
                    }
                    if (var83 == 3) {
                        class102 var92 = class19.field311.method854(class140.field3344, var78, var79);
                        if (var92 != null) {
                            var92.field2457 = new class8(var92.field2458 >> 14 & 0x7FFF, 22, var82, var85, var84, var86, var87, var76, false, var92.field2457);
                        }
                    }
                }
            } else if (class26.field518 == 236) {
                int var93 = class96.field2338.method587(false);
                int var94 = class96.field2338.method551(80);
                int var95 = (var94 >> 4 & 0x7) + class20.field318;
                int var96 = class122.field2901 + (var94 & 0x7);
                int var97 = class96.field2338.method596(101);
                int var98 = var97 >> 2;
                int var99 = var97 & 0x3;
                int var100 = class101.field2445[var98];
                if (var95 >= 0 && var96 >= 0 && var95 < 104 && var96 < 104) {
                    class121.method971(var98, 0, -1, 126, var93, var100, var96, class140.field3344, var95, var99);
                }
            } else if (class26.field518 == 64) {
                int var101 = class96.field2338.method551(92);
                int var102 = var101 >> 2;
                int var103 = var101 & 0x3;
                int var104 = class101.field2445[var102];
                int var105 = class96.field2338.method570((byte) 123);
                int var106 = class20.field318 + (var105 >> 4 & 0x7);
                int var107 = (var105 & 0x7) + class122.field2901;
                if (var106 >= 0 && var107 >= 0 && var106 < 104 && var107 < 104) {
                    class121.method971(var102, 0, -1, 92, -1, var104, var107, class140.field3344, var106, var103);
                }
            } else if (class26.field518 == 33) {
                int var108 = class96.field2338.method587(false);
                int var109 = class96.field2338.method587(false);
                int var110 = class96.field2338.method570((byte) 123);
                int var111 = (var110 & 0x7) + class122.field2901;
                int var112 = (var110 >> 4 & 0x7) + class20.field318;
                if (var112 >= 0 && var111 >= 0 && var112 < 104 && var111 < 104) {
                    class3 var113 = new class3();
                    var113.field60 = var109;
                    var113.field61 = var108;
                    if (class43.field858[class140.field3344][var112][var111] == null) {
                        class43.field858[class140.field3344][var112][var111] = new class5();
                    }
                    class43.field858[class140.field3344][var112][var111].method22(var113, (byte) 62);
                    class67.method477(1, var111, var112);
                }
            } else if (class26.field518 == 241) {
                int var114 = class96.field2338.method570((byte) 123);
                int var115 = class20.field318 + (var114 >> 4 & 0x7);
                int var116 = (var114 & 0x7) + class122.field2901;
                int var117 = class96.field2338.method597(123);
                int var118 = class96.field2338.method597(84);
                int var119 = class96.field2338.method597(124);
                if (var115 >= 0 && var116 >= 0 && var115 < 104 && var116 < 104) {
                    class5 var120 = class43.field858[class140.field3344][var115][var116];
                    if (var120 != null) {
                        for (class3 var121 = (class3) var120.method27(18823); var121 != null; var121 = (class3) var120.method25((byte) -127)) {
                            if ((var117 & 0x7FFF) == var121.field60 && var121.field61 == var118) {
                                var121.field61 = var119;
                                break;
                            }
                        }
                        class67.method477(1, var116, var115);
                    }
                }
            }
        }
    }
}
