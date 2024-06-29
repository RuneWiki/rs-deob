import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class299 {

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "Z")
    public static boolean field4998 = false;

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "Lqd;")
    public static class40 field5005 = class147.method1106("<col=ff9040>", (byte) -65);

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "[I")
    public static int[] field5004 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "Lqd;")
    private static class40 field5001 = class147.method1106("wave2:", (byte) -51);

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "Lqd;")
    public static class40 field4989 = field5001;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "Lqd;")
    public static class40 field5000 = field5001;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "Lhi;")
    public static class282 field4990 = new class282();

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
    public int field4993;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
    public static int field4994;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
    public int field4995;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
    public int field4997;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "I")
    public int field4999;

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
    public static int field5002;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "I")
    public static int field5003;

    @OriginalMember(owner = "client!gd", name = "t", descriptor = "I")
    public static int field5008;

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "J")
    public long field5006;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "Lbg;")
    public class196 field4991;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "Lbg;")
    public class196 field4992;

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "Lbg;")
    public class196 field5007;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "Lwd;")
    public static class75 field4996;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIIII[Lrb;III)V", line = 10)
    public static final void method2039(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class213[] arg6, int arg7, int arg8, int arg9) {
        if (arg5 != -1) {
            method2041(false, (byte) 112, (class213) null);
        }
        field5003++;
        if (class21.field350) {
            class111.method847(arg8, arg2, arg4, arg1);
        } else {
            class115.method870(arg8, arg2, arg4, arg1);
            class203.method1414();
        }
        for (int var10 = 0; var10 < arg6.length; var10++) {
            class213 var11 = arg6[var10];
            if (var11 != null && (var11.field3421 == arg7 || arg7 == -1412584499 && class28.field596 == var11)) {
                int var12;
                if (arg0 == -1) {
                    class197.field3166[class83.field1438] = var11.field3442 + arg9;
                    class181.field2947[class83.field1438] = var11.field3554 + arg3;
                    class280.field4728[class83.field1438] = var11.field3502;
                    class53.field1036[class83.field1438] = var11.field3565;
                    var12 = class83.field1438++;
                } else {
                    var12 = arg0;
                }
                var11.field3564 = class256.field4266;
                var11.field3423 = var12;
                if (!var11.field3520 || !client.method1730(var11)) {
                    if (var11.field3510 > 0) {
                        class147.method1107(var11, (byte) -22);
                    }
                    int var13 = var11.field3442 + arg9;
                    int var14 = var11.field3544;
                    int var15 = var11.field3554 + arg3;
                    if (class126.field2176 && (client.method1720(var11) != 0 || var11.field3525 == 0) && var14 > 127) {
                        var14 = 127;
                    }
                    if (class28.field596 == var11) {
                        if (arg7 != -1412584499 && !var11.field3469) {
                            class207.field3297 = arg3;
                            class49.field949 = arg6;
                            class49.field951 = arg9;
                            continue;
                        }
                        if (class285.field4808 && class49.field952) {
                            int var16 = class48.field936;
                            int var17 = var16 - class19.field313;
                            int var18 = class46.field893;
                            int var19 = var18 - class225.field3722;
                            if (var17 < class89.field1603) {
                                var17 = class89.field1603;
                            }
                            if ((var11.field3502 + var17) > (class89.field1603 + class6.field89.field3502)) {
                                var17 = class89.field1603 + class6.field89.field3502 - var11.field3502;
                            }
                            if (var19 < class149.field2505) {
                                var19 = class149.field2505;
                            }
                            var13 = var17;
                            if (class149.field2505 + class6.field89.field3565 < var11.field3565 + var19) {
                                var19 = class149.field2505 + class6.field89.field3565 - var11.field3565;
                            }
                            var15 = var19;
                        }
                        if (!var11.field3469) {
                            var14 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var24;
                    int var25;
                    if (var11.field3525 == 2) {
                        var25 = arg1;
                        var24 = arg4;
                        var21 = arg8;
                        var20 = arg2;
                    } else {
                        var20 = var15 > arg2 ? var15 : arg2;
                        var21 = var13 <= arg8 ? arg8 : var13;
                        int var22 = var13 + var11.field3502;
                        int var23 = var15 + var11.field3565;
                        if (var11.field3525 == 9) {
                            var22++;
                            var23++;
                        }
                        var24 = arg4 <= var22 ? arg4 : var22;
                        var25 = arg1 > var23 ? var23 : arg1;
                    }
                    if (!var11.field3520 || var24 > var21 && var25 > var20) {
                        if (var11.field3510 != 0) {
                            if (var11.field3510 == 1337 || var11.field3510 == 1403 && class21.field350) {
                                class23.field410 = var15;
                                class221.field3671 = var11;
                                class72.field1283 = var13;
                                class247.method1746(var11.field3502, 127, var11.field3510 == 1403, var11.field3565, var15, var13);
                                if (class21.field350) {
                                    class111.method847(arg8, arg2, arg4, arg1);
                                } else {
                                    class115.method870(arg8, arg2, arg4, arg1);
                                }
                                continue;
                            }
                            if (var11.field3510 == 1338) {
                                if (var11.method1509(0)) {
                                    class212.method1487(var13, var15, var12, arg5 ^ 0xFFFFFF8C, var11);
                                    if (class21.field350) {
                                        class111.method847(arg8, arg2, arg4, arg1);
                                    } else {
                                        class115.method870(arg8, arg2, arg4, arg1);
                                    }
                                }
                                continue;
                            }
                            if (var11.field3510 == 1339) {
                                if (var11.method1509(~arg5)) {
                                    class242.method1703(var15, var12, var11, var13, (byte) 73);
                                    if (class21.field350) {
                                        class111.method847(arg8, arg2, arg4, arg1);
                                    } else {
                                        class115.method870(arg8, arg2, arg4, arg1);
                                    }
                                }
                                continue;
                            }
                            if (var11.field3510 == 1400) {
                                class72.method542(var13, var11.field3565, var15, true, var11.field3502);
                                class229.field3778[var12] = true;
                                class309.field5192[var12] = true;
                                if (class21.field350) {
                                    class111.method847(arg8, arg2, arg4, arg1);
                                } else {
                                    class115.method870(arg8, arg2, arg4, arg1);
                                }
                                continue;
                            }
                            if (var11.field3510 == 1401) {
                                class120.method905(var11.field3565, var13, (byte) 111, var11.field3502, var15);
                                class229.field3778[var12] = true;
                                class309.field5192[var12] = true;
                                if (class21.field350) {
                                    class111.method847(arg8, arg2, arg4, arg1);
                                } else {
                                    class115.method870(arg8, arg2, arg4, arg1);
                                }
                                continue;
                            }
                            if (var11.field3510 == 1402) {
                                if (!class21.field350) {
                                    class303.method2070(var13, -85, var15);
                                    class229.field3778[var12] = true;
                                    class309.field5192[var12] = true;
                                }
                                continue;
                            }
                            if (var11.field3510 == 1405) {
                                if (!class89.field1598) {
                                    continue;
                                }
                                int var26 = var13 + var11.field3502;
                                int var27 = var15 + 15;
                                class146.field2428.method1835(class153.method1192(new class40[] { class122.field2116, class276.method1927((byte) -101, class81.field1422) }, (byte) 125), var26, var27, 16776960, -1);
                                int var126 = var27 + 15;
                                int var28 = 16776960;
                                Runtime var29 = Runtime.getRuntime();
                                int var30 = (int) ((var29.totalMemory() - var29.freeMemory()) / 1024L);
                                if (var30 > 65536) {
                                    var28 = 16711680;
                                }
                                class146.field2428.method1835(class153.method1192(new class40[] { class265.field4450, class276.method1927((byte) -94, var30), class33.field671 }, (byte) 126), var26, var126, var28, -1);
                                var27 = var126 + 15;
                                if (class21.field350) {
                                    int var31 = 16776960;
                                    int var32 = (class136.field2303 + class136.field2301 + class136.field2304) / 1024;
                                    if (var32 > 65536) {
                                        var31 = 16711680;
                                    }
                                    class146.field2428.method1835(class153.method1192(new class40[] { class45.field871, class276.method1927((byte) -66, var32), class33.field671 }, (byte) 125), var26, var27, var31, -1);
                                    var27 += 15;
                                }
                                int var33 = 16776960;
                                int var34 = 0;
                                int var35 = 0;
                                int var36 = 0;
                                for (int var37 = 0; var37 < 27; var37++) {
                                    var34 += class96.field1721[var37].method681(100);
                                    var35 += class96.field1721[var37].method682(-119);
                                    var36 += class96.field1721[var37].method679((byte) -104);
                                }
                                int var38 = var36 * 100 / var34;
                                int var39 = var35 * 10000 / var34;
                                class40 var40 = class153.method1192(new class40[] { class95.field1717, class76.method565((long) var39, 125, true, 2, 0), class49.field947, class276.method1927((byte) -95, var38), class290.field4859 }, (byte) 3);
                                class49.field945.method1835(var40, var26, var27, var33, -1);
                                class229.field3778[var12] = true;
                                var27 += 12;
                                class309.field5192[var12] = true;
                                continue;
                            }
                        }
                        if (!class27.field518) {
                            if (var11.field3525 == 0 && var11.field3466 && var21 <= class159.field2664 && var20 <= class294.field4937 && var24 > class159.field2664 && class294.field4937 < var25 && !class126.field2176) {
                                class288.field4832[0] = 1006;
                                class255.field4252 = 1;
                                class246.field4079[0] = class129.field2221;
                                class3.field37[0] = class264.field4421;
                            }
                            if (var21 <= class159.field2664 && var20 <= class294.field4937 && var24 > class159.field2664 && var25 > class294.field4937) {
                                class292.method2010(22618, class294.field4937 - var15, var11, class159.field2664 - var13);
                            }
                        }
                        if (var11.field3525 == 0) {
                            if (!var11.field3520 && client.method1730(var11) && class230.field3793 != var11) {
                                continue;
                            }
                            if (!var11.field3520) {
                                if ((var11.field3437 - var11.field3565) < var11.field3583) {
                                    var11.field3583 = var11.field3437 - var11.field3565;
                                }
                                if (var11.field3583 < 0) {
                                    var11.field3583 = 0;
                                }
                            }
                            method2039(var12, var25, var20, var15 - var11.field3583, var24, -1, arg6, var11.field3507, var21, var13 - var11.field3530);
                            if (var11.field3415 != null) {
                                method2039(var12, var25, var20, var15 - var11.field3583, var24, -1, var11.field3415, var11.field3507, var21, var13 - var11.field3530);
                            }
                            class297 var41 = (class297) class165.field2731.method1405((byte) 115, (long) var11.field3507);
                            if (var41 != null) {
                                if (var41.field4963 == 0 && !class27.field518 && class159.field2664 >= var21 && class294.field4937 >= var20 && class159.field2664 < var24 && class294.field4937 < var25 && !class126.field2176) {
                                    class246.field4079[0] = class129.field2221;
                                    class288.field4832[0] = 1006;
                                    class3.field37[0] = class264.field4421;
                                    class255.field4252 = 1;
                                }
                                class255.method1798(var41.field4959, var20, var15, var24, var12, var25, var21, var13, false);
                            }
                            if (class21.field350) {
                                class111.method847(arg8, arg2, arg4, arg1);
                            } else {
                                class115.method870(arg8, arg2, arg4, arg1);
                                class203.method1414();
                            }
                        }
                        if (class289.field4840[var12] || class48.field938 > 1) {
                            if (var11.field3525 == 0 && !var11.field3520 && var11.field3437 > var11.field3565) {
                                class134.method995(var11.field3565, var11.field3583, var11.field3437, var15, var13 + var11.field3502, 8);
                            }
                            if (var11.field3525 != 1) {
                                if (var11.field3525 == 2) {
                                    int var42 = 0;
                                    for (int var43 = 0; var43 < var11.field3439; var43++) {
                                        for (int var44 = 0; var44 < var11.field3540; var44++) {
                                            int var45 = (var11.field3455 + 32) * var43 + var15;
                                            int var46 = var13 + ((var11.field3419 + 32) * var44);
                                            if (var42 < 20) {
                                                var45 += var11.field3533[var42];
                                                var46 += var11.field3545[var42];
                                            }
                                            if (var11.field3532[var42] > 0) {
                                                boolean var48 = false;
                                                boolean var49 = false;
                                                int var50 = var11.field3532[var42] - 1;
                                                if (arg8 < (var46 + 32) && arg4 > var46 && arg2 < var45 + 32 && arg1 > var45 || class235.field3852 == var11 && class39.field710 == var42) {
                                                    class185 var51;
                                                    if (class274.field4566 == 1 && class9.field147 == var42 && class10.field168 == var11.field3507) {
                                                        var51 = class10.method60(var11.field3471[var42], var50, 2, 0, var11.field3561, arg5 ^ 0xFFFFFF97);
                                                    } else {
                                                        var51 = class10.method60(var11.field3471[var42], var50, 1, 3153952, var11.field3561, -116);
                                                    }
                                                    if (class203.field3219) {
                                                        class229.field3778[var12] = true;
                                                    }
                                                    if (var51 == null) {
                                                        class25.method188(0, var11);
                                                    } else if (class235.field3852 == var11 && class39.field710 == var42) {
                                                        int var52 = class46.field893 - class60.field1149;
                                                        int var53 = class48.field936 - class173.field2824;
                                                        if (var52 < 5 && var52 > -5) {
                                                            var52 = 0;
                                                        }
                                                        if (var53 < 5 && var53 > -5) {
                                                            var53 = 0;
                                                        }
                                                        if (class118.field2003 < 5) {
                                                            var53 = 0;
                                                            var52 = 0;
                                                        }
                                                        var51.method743(var46 + var53, var45 + var52, 128);
                                                        if (arg7 != -1) {
                                                            class213 var54 = arg6[arg7 & 0xFFFF];
                                                            int var55;
                                                            int var56;
                                                            if (class21.field350) {
                                                                var55 = class111.field1938;
                                                                var56 = class111.field1937;
                                                            } else {
                                                                var55 = class115.field1984;
                                                                var56 = class115.field1982;
                                                            }
                                                            if ((var45 + var52) < var56 && var54.field3583 > 0) {
                                                                int var57 = (var56 - var52 - var45) * class189.field3059 / 3;
                                                                if ((class189.field3059 * 10) < var57) {
                                                                    var57 = class189.field3059 * 10;
                                                                }
                                                                if (var54.field3583 < var57) {
                                                                    var57 = var54.field3583;
                                                                }
                                                                class60.field1149 += var57;
                                                                var54.field3583 -= var57;
                                                                class25.method188(0, var54);
                                                            }
                                                            if ((var45 + var52 + 32) > var55 && var54.field3583 < (var54.field3437 - var54.field3565)) {
                                                                int var58 = (var52 + var45 + 32 - var55) * class189.field3059 / 3;
                                                                if (var58 > (class189.field3059 * 10)) {
                                                                    var58 = class189.field3059 * 10;
                                                                }
                                                                if (var54.field3437 - var54.field3583 - var54.field3565 < var58) {
                                                                    var58 = var54.field3437 - var54.field3583 - var54.field3565;
                                                                }
                                                                var54.field3583 += var58;
                                                                class60.field1149 -= var58;
                                                                class25.method188(0, var54);
                                                            }
                                                        }
                                                    } else if (class254.field4228 == var11 && class268.field4476 == var42) {
                                                        var51.method743(var46, var45, 128);
                                                    } else {
                                                        var51.method744(var46, var45);
                                                    }
                                                }
                                            } else if (var11.field3559 != null && var42 < 20) {
                                                class185 var47 = var11.method1501(var42, -52);
                                                if (var47 != null) {
                                                    var47.method744(var46, var45);
                                                } else if (class229.field3784) {
                                                    class25.method188(0, var11);
                                                }
                                            }
                                            var42++;
                                        }
                                    }
                                } else if (var11.field3525 == 3) {
                                    int var125;
                                    if (class296.method2025(false, var11)) {
                                        var125 = var11.field3422;
                                        if (class230.field3793 == var11 && var11.field3512 != 0) {
                                            var125 = var11.field3512;
                                        }
                                    } else {
                                        var125 = var11.field3480;
                                        if (class230.field3793 == var11 && var11.field3482 != 0) {
                                            var125 = var11.field3482;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var11.field3411) {
                                            if (class21.field350) {
                                                class111.method846(var13, var15, var11.field3502, var11.field3565, var125);
                                            } else {
                                                class115.method880(var13, var15, var11.field3502, var11.field3565, var125);
                                            }
                                        } else if (class21.field350) {
                                            class111.method835(var13, var15, var11.field3502, var11.field3565, var125);
                                        } else {
                                            class115.method881(var13, var15, var11.field3502, var11.field3565, var125);
                                        }
                                    } else if (var11.field3411) {
                                        if (class21.field350) {
                                            class111.method842(var13, var15, var11.field3502, var11.field3565, var125, 256 - (var14 & 0xFF));
                                        } else {
                                            class115.method874(var13, var15, var11.field3502, var11.field3565, var125, 256 - (var14 & 0xFF));
                                        }
                                    } else if (class21.field350) {
                                        class111.method833(var13, var15, var11.field3502, var11.field3565, var125, 256 - (var14 & 0xFF));
                                    } else {
                                        class115.method862(var13, var15, var11.field3502, var11.field3565, var125, 256 - (var14 & 0xFF));
                                    }
                                } else if (var11.field3525 == 4) {
                                    class259 var121 = var11.method1510(class246.field4077, (byte) 66);
                                    if (var121 != null) {
                                        class40 var122 = var11.field3517;
                                        int var123;
                                        if (class296.method2025(false, var11)) {
                                            var123 = var11.field3422;
                                            if (class230.field3793 == var11 && var11.field3512 != 0) {
                                                var123 = var11.field3512;
                                            }
                                            if (var11.field3584.method350(true) > 0) {
                                                var122 = var11.field3584;
                                            }
                                        } else {
                                            var123 = var11.field3480;
                                            if (class230.field3793 == var11 && var11.field3482 != 0) {
                                                var123 = var11.field3482;
                                            }
                                        }
                                        if (var11.field3520 && var11.field3438 != -1) {
                                            class277 var124 = class165.method1243(arg5 ^ 0x7D, var11.field3438);
                                            var122 = var124.field4628;
                                            if (var122 == null) {
                                                var122 = class148.field2490;
                                            }
                                            if ((var124.field4637 == 1 || var11.field3418 != 1) && var11.field3418 != -1) {
                                                var122 = class153.method1192(new class40[] { field5005, var122, class204.field3234, class93.method710(17696, var11.field3418) }, (byte) 123);
                                            }
                                        }
                                        if (class41.field792 == var11) {
                                            var122 = class12.field202;
                                            var123 = var11.field3480;
                                        }
                                        if (!var11.field3520) {
                                            var122 = class272.method1884(var122, var11, 116);
                                        }
                                        var121.method1840(var122, var13, var15, var11.field3502, var11.field3565, var123, var11.field3448 ? 0 : -1, var11.field3464, var11.field3452, var11.field3566);
                                    } else if (class229.field3784) {
                                        class25.method188(0, var11);
                                    }
                                } else if (var11.field3525 == 5) {
                                    if (var11.field3520) {
                                        class185 var59;
                                        if (var11.field3438 == -1) {
                                            var59 = var11.method1505(false, 21730);
                                        } else {
                                            var59 = class10.method60(var11.field3418, var11.field3438, var11.field3519, var11.field3416, var11.field3561, 111);
                                        }
                                        if (var59 != null) {
                                            int var60 = var59.field2971;
                                            int var61 = var59.field2980;
                                            if (var11.field3478) {
                                                int var63 = (var11.field3565 + var61 - 1) / var61;
                                                int var64 = (var11.field3502 - (1 - var60)) / var60;
                                                if (class21.field350) {
                                                    class111.method838(var13, var15, var11.field3502 + var13, var11.field3565 + var15);
                                                    boolean var65 = class163.method1238((byte) -93, var59.field2976);
                                                    boolean var66 = class163.method1238((byte) 85, var59.field2981);
                                                    class100 var67 = (class100) var59;
                                                    if (var65 && var66) {
                                                        if (var14 == 0) {
                                                            var67.method758(var13, var15, var64, var63);
                                                        } else {
                                                            var67.method761(var13, var15, 256 - (var14 & 0xFF), var64, var63);
                                                        }
                                                    } else if (var65) {
                                                        for (int var68 = 0; var68 < var63; var68++) {
                                                            if (var14 == 0) {
                                                                var67.method758(var13, var61 * var68 + var15, var64, 1);
                                                            } else {
                                                                var67.method761(var13, var61 * var68 + var15, -(var14 & 0xFF) + 256, var64, 1);
                                                            }
                                                        }
                                                    } else if (var66) {
                                                        for (int var69 = 0; var69 < var64; var69++) {
                                                            if (var14 == 0) {
                                                                var67.method758(var60 * var69 + var13, var15, 1, var63);
                                                            } else {
                                                                var67.method761(var13 + (var60 * var69), var15, 256 - (var14 & 0xFF), 1, var63);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var70 = 0; var70 < var64; var70++) {
                                                            for (int var71 = 0; var71 < var63; var71++) {
                                                                if (var14 == 0) {
                                                                    var59.method744(var60 * var70 + var13, var15 - -(var61 * var71));
                                                                } else {
                                                                    var59.method743(var60 * var70 + var13, var61 * var71 + var15, 256 - (var14 & 0xFF));
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class111.method847(arg8, arg2, arg4, arg1);
                                                } else {
                                                    class115.method863(var13, var15, var11.field3502 + var13, var15 - -var11.field3565);
                                                    for (int var72 = 0; var72 < var64; var72++) {
                                                        for (int var73 = 0; var73 < var63; var73++) {
                                                            if (var11.field3430 != 0) {
                                                                var59.method1341(var60 * var72 + var13 + (var60 / 2), 4096, 808464132, var61 / 2 + var61 * var73 + var15, var11.field3430);
                                                            } else if (var14 == 0) {
                                                                var59.method744(var13 + (var60 * var72), var61 * var73 + var15);
                                                            } else {
                                                                var59.method743(var60 * var72 + var13, var15 - -(var61 * var73), 256 - (var14 & 0xFF));
                                                            }
                                                        }
                                                    }
                                                    class115.method870(arg8, arg2, arg4, arg1);
                                                }
                                            } else {
                                                int var62 = var11.field3502 * 4096 / var60;
                                                if (var11.field3430 != 0) {
                                                    var59.method1341(var13 + (var11.field3502 / 2), var62, 808464132, var11.field3565 / 2 + var15, var11.field3430);
                                                } else if (var14 != 0) {
                                                    var59.method733(var13, var15, var11.field3502, var11.field3565, 256 - (var14 & 0xFF));
                                                } else if (var11.field3502 == var60 && var11.field3565 == var61) {
                                                    var59.method744(var13, var15);
                                                } else {
                                                    var59.method734(var13, var15, var11.field3502, var11.field3565);
                                                }
                                            }
                                        } else if (class229.field3784) {
                                            class25.method188(0, var11);
                                        }
                                    } else {
                                        class185 var74 = var11.method1505(class296.method2025(false, var11), arg5 + 21731);
                                        if (var74 != null) {
                                            var74.method744(var13, var15);
                                        } else if (class229.field3784) {
                                            class25.method188(arg5 + 1, var11);
                                        }
                                    }
                                } else if (var11.field3525 == 6) {
                                    boolean var75 = class296.method2025(false, var11);
                                    int var76;
                                    if (var75) {
                                        var76 = var11.field3498;
                                    } else {
                                        var76 = var11.field3521;
                                    }
                                    int var77 = 0;
                                    class266 var78 = null;
                                    if (var11.field3438 != -1) {
                                        class277 var79 = class165.method1243(-125, var11.field3438);
                                        if (var79 != null) {
                                            class277 var80 = var79.method1933(95, var11.field3418);
                                            class300 var81 = var76 == -1 ? null : class20.method128(arg5 + 91, var76);
                                            var78 = var80.method1943(-18401, var81, var11.field3514, 1);
                                            if (var78 == null) {
                                                class25.method188(~arg5, var11);
                                            } else {
                                                var77 = -var78.method74() / 2;
                                            }
                                        }
                                    } else if (var11.field3451 == 5) {
                                        if (var11.field3526 == -1) {
                                            var78 = class214.field3585.method459(-1, (byte) 88, -1, (class300) null, (class300) null);
                                        } else {
                                            int var82 = var11.field3526 & 0x7FF;
                                            if (class289.field4842 == var82) {
                                                var82 = 2047;
                                            }
                                            class258 var83 = class298.field4979[var82];
                                            class300 var84 = var76 == -1 ? null : class20.method128(101, var76);
                                            if (var83 != null && (int) var83.field4319.method362(-25194) << 11 == (var11.field3526 & 0xFFFFF800)) {
                                                var78 = var83.field4294.method459(0, (byte) -126, var11.field3514, (class300) null, var84);
                                            }
                                        }
                                    } else if (var76 == -1) {
                                        var78 = var11.method1513(-1, (class300) null, 4, var75, class255.field4233.field4294);
                                        if (var78 == null && class229.field3784) {
                                            class25.method188(0, var11);
                                        }
                                    } else {
                                        class300 var85 = class20.method128(arg5 + 108, var76);
                                        var78 = var11.method1513(var11.field3514, var85, arg5 ^ 0xFFFFFFFB, var75, class255.field4233.field4294);
                                        if (var78 == null && class229.field3784) {
                                            class25.method188(0, var11);
                                        }
                                    }
                                    if (var78 != null) {
                                        int var86;
                                        if (var11.field3568 <= 0) {
                                            var86 = 256;
                                        } else {
                                            var86 = (var11.field3565 << 8) / var11.field3568;
                                        }
                                        int var87;
                                        if (var11.field3485 > 0) {
                                            var87 = (var11.field3502 << 8) / var11.field3485;
                                        } else {
                                            var87 = 256;
                                        }
                                        int var88 = (var11.field3465 * var86 >> 8) + var11.field3565 / 2 + var15;
                                        int var89 = var11.field3502 / 2 + (var11.field3570 * var87 >> 8) + var13;
                                        if (class21.field350) {
                                            if (var11.field3509) {
                                                class21.method141(var89, var88, var11.field3481, var11.field3487, var87, var86);
                                            } else {
                                                class21.method155(var89, var88, var87, var86);
                                                class21.method138((float) var11.field3538, (float) var11.field3487 * 1.5F);
                                            }
                                            class21.method157();
                                            class21.method152(true);
                                            class21.method160(false);
                                            class104.method783(-65, class162.field2692);
                                            if (class156.field2619) {
                                                class111.method834();
                                                class21.method146();
                                                class111.method847(arg8, arg2, arg4, arg1);
                                                class156.field2619 = false;
                                            }
                                            if (var11.field3417) {
                                                class21.method150();
                                            }
                                            int var92 = class203.field3208[var11.field3551] * var11.field3481 >> 16;
                                            int var93 = class203.field3216[var11.field3551] * var11.field3481 >> 16;
                                            if (var11.field3520) {
                                                var78.method1168(0, var11.field3458, var11.field3536, var11.field3551, var11.field3493, var11.field3468 + var77 + var92, var11.field3468 + var93);
                                            } else {
                                                var78.method1168(0, var11.field3458, 0, var11.field3551, 0, var92, var93);
                                            }
                                            if (var11.field3417) {
                                                class21.method163();
                                            }
                                        } else {
                                            class203.method1431(var89, var88);
                                            int var90 = class203.field3208[var11.field3551] * var11.field3481 >> 16;
                                            int var91 = class203.field3216[var11.field3551] * var11.field3481 >> 16;
                                            if (!var11.field3520) {
                                                var78.method1168(0, var11.field3458, 0, var11.field3551, 0, var90, var91);
                                            } else if (var11.field3509) {
                                                ((class175) var78).method1281(0, var11.field3458, var11.field3536, var11.field3551, var11.field3493, var77 + var90 + var11.field3468, var11.field3468 + var91, var11.field3481);
                                            } else {
                                                var78.method1168(0, var11.field3458, var11.field3536, var11.field3551, var11.field3493, var11.field3468 + var90 + var77, var11.field3468 + var91);
                                            }
                                            class203.method1426();
                                        }
                                    }
                                } else {
                                    if (var11.field3525 == 7) {
                                        class259 var94 = var11.method1510(class246.field4077, (byte) 48);
                                        if (var94 == null) {
                                            if (class229.field3784) {
                                                class25.method188(0, var11);
                                            }
                                            continue;
                                        }
                                        int var95 = 0;
                                        for (int var96 = 0; var96 < var11.field3439; var96++) {
                                            for (int var97 = 0; var97 < var11.field3540; var97++) {
                                                if (var11.field3532[var95] > 0) {
                                                    class277 var98 = class165.method1243(-121, var11.field3532[var95] - 1);
                                                    class40 var99;
                                                    if (var98.field4637 != 1 && var11.field3471[var95] == 1) {
                                                        var99 = class153.method1192(new class40[] { field5005, var98.field4628, class28.field599 }, (byte) 127);
                                                    } else {
                                                        var99 = class153.method1192(new class40[] { field5005, var98.field4628, class204.field3234, class93.method710(arg5 + 17697, var11.field3471[var95]) }, (byte) 42);
                                                    }
                                                    int var100 = (var11.field3455 + 12) * var96 + var15;
                                                    int var101 = (var11.field3419 + 115) * var97 + var13;
                                                    if (var11.field3464 == 0) {
                                                        var94.method1831(var99, var101, var100, var11.field3480, var11.field3448 ? 0 : -1);
                                                    } else if (var11.field3464 == 1) {
                                                        var94.method1825(var99, var101 + 57, var100, var11.field3480, var11.field3448 ? 0 : -1);
                                                    } else {
                                                        var94.method1835(var99, var101 + 114, var100, var11.field3480, var11.field3448 ? 0 : -1);
                                                    }
                                                }
                                                var95++;
                                            }
                                        }
                                    }
                                    if (var11.field3525 == 8 && class182.field2963 == var11 && class310.field5210 == class272.field4517) {
                                        class259 var102 = class146.field2428;
                                        int var103 = 0;
                                        class40 var104 = var11.field3517;
                                        class40 var105 = class272.method1884(var104, var11, 117);
                                        int var106 = 0;
                                        while (var105.method350(true) > 0) {
                                            int var107 = var105.method358(arg5 ^ 0x71, class235.field3846);
                                            class40 var108;
                                            if (var107 == -1) {
                                                var108 = var105;
                                                var105 = class264.field4421;
                                            } else {
                                                var108 = var105.method333(0, arg5 ^ 0xFFFFFF88, var107);
                                                var105 = var105.method371(var107 + 4, false);
                                            }
                                            int var109 = var102.method1830(var108);
                                            var106 += var102.field4361 + 1;
                                            if (var103 < var109) {
                                                var103 = var109;
                                            }
                                        }
                                        var106 += 7;
                                        var103 += 6;
                                        int var110 = var11.field3565 + var15 + 5;
                                        if (arg1 < var106 + var110) {
                                            var110 = arg1 - var106;
                                        }
                                        int var111 = var11.field3502 + var13 - var103 - 5;
                                        if (var111 < var13 + 5) {
                                            var111 = var13 + 5;
                                        }
                                        if ((var103 + var111) > arg4) {
                                            var111 = arg4 - var103;
                                        }
                                        if (class21.field350) {
                                            class111.method846(var111, var110, var103, var106, 16777120);
                                            class111.method835(var111, var110, var103, var106, 0);
                                        } else {
                                            class115.method880(var111, var110, var103, var106, 16777120);
                                            class115.method881(var111, var110, var103, var106, 0);
                                        }
                                        class40 var112 = var11.field3517;
                                        int var113 = var110 + var102.field4361 + 2;
                                        class40 var114 = class272.method1884(var112, var11, 126);
                                        while (var114.method350(true) > 0) {
                                            int var115 = var114.method358(-120, class235.field3846);
                                            class40 var116;
                                            if (var115 == -1) {
                                                var116 = var114;
                                                var114 = class264.field4421;
                                            } else {
                                                var116 = var114.method333(0, 119, var115);
                                                var114 = var114.method371(var115 + 4, false);
                                            }
                                            var102.method1831(var116, var111 + 3, var113, 0, -1);
                                            var113 += var102.field4361 + 1;
                                        }
                                    }
                                    if (var11.field3525 == 9) {
                                        int var117;
                                        int var118;
                                        int var119;
                                        int var120;
                                        if (var11.field3486) {
                                            var120 = var11.field3502 + var13;
                                            var117 = var13;
                                            var118 = var15;
                                            var119 = var11.field3565 + var15;
                                        } else {
                                            var117 = var13;
                                            var118 = var11.field3565 + var15;
                                            var119 = var15;
                                            var120 = var11.field3502 + var13;
                                        }
                                        if (var11.field3579 == 1) {
                                            if (class21.field350) {
                                                class111.method845(var117, var119, var120, var118, var11.field3480);
                                            } else {
                                                class115.method878(var117, var119, var120, var118, var11.field3480);
                                            }
                                        } else if (class21.field350) {
                                            class111.method839(var117, var119, var120, var118, var11.field3480, var11.field3579);
                                        } else {
                                            class115.method869(var117, var119, var120, var118, var11.field3480, var11.field3579);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V", line = 1210)
    public static void method2040(int arg0) {
        field5000 = null;
        field4990 = null;
        field4989 = null;
        field5001 = null;
        if (arg0 <= 95) {
            field5001 = (class40) null;
        }
        field5005 = null;
        field5004 = null;
        field4996 = null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZBLrb;)V", line = 1269)
    public static final void method2041(boolean arg0, byte arg1, class213 arg2) {
        if (arg1 >= -84) {
            field5004 = (int[]) null;
        }
        int var3 = arg2.field3571 == 0 ? arg2.field3502 : arg2.field3571;
        int var4 = arg2.field3437 == 0 ? arg2.field3565 : arg2.field3437;
        class235.method1630(arg2.field3507, arg0, -1, var3, class44.field845[arg2.field3507 >> 16], var4);
        field4994++;
        if (arg2.field3415 != null) {
            class235.method1630(arg2.field3507, arg0, -1, var3, arg2.field3415, var4);
        }
        class297 var5 = (class297) class165.field2731.method1405((byte) 115, (long) arg2.field3507);
        if (var5 != null) {
            class173.method1272(arg0, var3, var5.field4959, var4, -105);
        }
    }
}
