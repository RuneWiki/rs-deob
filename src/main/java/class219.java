import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class219 {

    @OriginalMember(owner = "client!ih", name = "l", descriptor = "J")
    public long field3446 = 0L;

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "Z")
    public static boolean field3443 = false;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
    public int field3435;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
    public int field3436;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "I")
    public int field3438;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "I")
    public int field3445;

    @OriginalMember(owner = "client!ih", name = "m", descriptor = "I")
    public int field3447;

    @OriginalMember(owner = "client!ih", name = "n", descriptor = "I")
    public int field3448;

    @OriginalMember(owner = "client!ih", name = "o", descriptor = "I")
    public int field3449;

    @OriginalMember(owner = "client!ih", name = "p", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "Lie;")
    public class34 field3437;

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "Lie;")
    public class34 field3444;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IB[Lrg;)V")
    public static final void method1491(int arg0, byte arg1, class248[] arg2) {
        if (arg1 != -77) {
            return;
        }
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class248 var4 = arg2[var3];
            if (var4 != null && var4.field3974 == arg0 && (!var4.field3952 || !client.method1137(var4))) {
                if (var4.field4038 == 0) {
                    if (!var4.field3952 && client.method1137(var4) && class85.field1356 != var4) {
                        continue;
                    }
                    method1491(var4.field3968, (byte) -77, arg2);
                    if (var4.field4068 != null) {
                        method1491(var4.field3968, (byte) -77, var4.field4068);
                    }
                    class109 var5 = (class109) class74.field1192.method371(54, (long) var4.field3968);
                    if (var5 != null) {
                        class155.method1048(-99, var5.field1689);
                    }
                }
                if (var4.field4038 == 6) {
                    if (var4.field3940 != -1 || var4.field3892 != -1) {
                        boolean var6 = class35.method259(var4, -4);
                        int var7;
                        if (var6) {
                            var7 = var4.field3892;
                        } else {
                            var7 = var4.field3940;
                        }
                        if (var7 != -1) {
                            class91 var8 = class159.method1085((byte) -63, var7);
                            if (var8 != null) {
                                var4.field4031 += class61.field883;
                                while (var4.field4031 > var8.field1452[var4.field3927]) {
                                    var4.field4031 -= var8.field1452[var4.field3927];
                                    var4.field3927++;
                                    if (var4.field3927 >= var8.field1434.length) {
                                        var4.field3927 -= var8.field1442;
                                        if (var4.field3927 < 0 || var8.field1434.length <= var4.field3927) {
                                            var4.field3927 = 0;
                                        }
                                    }
                                    var4.field3969 = var4.field3927 + 1;
                                    if (var8.field1434.length <= var4.field3969) {
                                        var4.field3969 -= var8.field1442;
                                        if (var4.field3969 < 0 || var4.field3969 >= var8.field1434.length) {
                                            var4.field3969 = -1;
                                        }
                                    }
                                    class111.method776(var4, (byte) 25);
                                }
                            }
                        }
                    }
                    if (var4.field3979 != 0 && !var4.field3952) {
                        int var9 = var4.field3979 << 16 >> 16;
                        int var10 = var4.field3979 >> 16;
                        int var11 = class61.field883 * var10;
                        int var12 = class61.field883 * var9;
                        var4.field4035 = var4.field4035 + var11 & 0x7FF;
                        var4.field4062 = var4.field4062 + var12 & 0x7FF;
                        class111.method776(var4, (byte) 25);
                    }
                }
            }
        }
        field3442++;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1492(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class52 var7 = new class52();
        var7.field755 = arg1 / 128;
        var7.field756 = arg2 / 128;
        var7.field761 = arg3 / 128;
        var7.field768 = arg4 / 128;
        var7.field764 = arg0;
        var7.field750 = arg1;
        var7.field748 = arg2;
        var7.field749 = arg3;
        var7.field760 = arg4;
        var7.field757 = arg5;
        var7.field753 = arg6;
        class248.field3935[class28.field512++] = var7;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(III[Lrg;IIIIII)V")
    public static final void method1493(int arg0, int arg1, int arg2, class248[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3439++;
        class94.method676(arg0, arg4, arg5, arg8);
        class136.method945();
        if (arg9 >= -119) {
            field3443 = false;
        }
        for (int var10 = 0; var10 < arg3.length; var10++) {
            class248 var11 = arg3[var10];
            if (var11 != null && (var11.field3974 == arg1 || arg1 == -1412584499 && class218.field3430 == var11)) {
                int var12;
                if (arg2 == -1) {
                    class270.field4353[class128.field2054] = var11.field4037 + arg7;
                    class248.field4071[class128.field2054] = var11.field3916 + arg6;
                    class169.field2779[class128.field2054] = var11.field4016;
                    class165.field2732[class128.field2054] = var11.field4057;
                    var12 = class128.field2054++;
                } else {
                    var12 = arg2;
                }
                var11.field3915 = class274.field4472;
                var11.field3996 = var12;
                if (!var11.field3952 || !client.method1137(var11)) {
                    if (var11.field3957 > 0) {
                        class5.method60(var11, (byte) 106);
                    }
                    int var13 = var11.field4037 + arg7;
                    int var14 = var11.field3916 + arg6;
                    int var15 = var11.field3939;
                    if (class61.field881 && (client.method1126(var11).field427 != 0 || var11.field4038 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class218.field3430 == var11) {
                        if (arg1 != -1412584499 && !var11.field3941) {
                            class49.field717 = arg3;
                            class137.field2217 = arg6;
                            class26.field474 = arg7;
                            continue;
                        }
                        if (!var11.field3941) {
                            var15 = 128;
                        }
                        if (class300.field4918 && class113.field1732) {
                            int var16 = class287.field4640;
                            int var17 = var16 - class100.field1573;
                            int var18 = class55.field797;
                            if (var17 < class129.field2061) {
                                var17 = class129.field2061;
                            }
                            if ((class129.field2061 + class263.field4304.field4016) < (var11.field4016 + var17)) {
                                var17 = class129.field2061 + class263.field4304.field4016 - var11.field4016;
                            }
                            var13 = var17;
                            int var19 = var18 - class64.field1035;
                            if (class15.field298 > var19) {
                                var19 = class15.field298;
                            }
                            if ((class15.field298 + class263.field4304.field4057) < (var11.field4057 + var19)) {
                                var19 = class15.field298 + class263.field4304.field4057 - var11.field4057;
                            }
                            var14 = var19;
                        }
                    }
                    int var20;
                    int var23;
                    int var24;
                    int var25;
                    if (var11.field4038 == 2) {
                        var25 = arg8;
                        var20 = arg4;
                        var23 = arg0;
                        var24 = arg5;
                    } else {
                        var20 = var14 <= arg4 ? arg4 : var14;
                        int var21 = var11.field4016 + var13;
                        int var22 = var11.field4057 + var14;
                        if (var11.field4038 == 9) {
                            var21++;
                            var22++;
                        }
                        var23 = arg0 < var13 ? var13 : arg0;
                        var24 = var21 < arg5 ? var21 : arg5;
                        var25 = arg8 <= var22 ? arg8 : var22;
                    }
                    if (!var11.field3952 || var23 < var24 && var25 > var20) {
                        if (var11.field3957 != 0) {
                            if (var11.field3957 == 1337 || var11.field3957 == 1403) {
                                class170.field2790 = var11;
                                class259.field4244 = var13;
                                class162.field2649 = var14;
                                class139.method962(var13, var11.field4016, var11.field4057, (byte) -95, var14, var11.field3957 == 1403);
                                class259.field4249[var12] = true;
                                class94.method676(arg0, arg4, arg5, arg8);
                                continue;
                            }
                            if (var11.field3957 == 1338) {
                                if (!var11.method1679(114)) {
                                    continue;
                                }
                                class110.method771(var12, (byte) -104, var13, var11, var14);
                                class94.method676(arg0, arg4, arg5, arg8);
                                if (class31.field531 != 0 && class31.field531 != 3 || class41.field633 || var23 > class33.field539 || class148.field2368 < var20 || class33.field539 >= var24 || class148.field2368 >= var25) {
                                    continue;
                                }
                                int var26 = class33.field539 - var13;
                                int var27 = class148.field2368 - var14;
                                int var28 = var11.field3993[var27];
                                if (var28 > var26 || var26 > (var11.field3934[var27] + var28)) {
                                    continue;
                                }
                                int var29 = var27 - var11.field4057 / 2;
                                int var30 = var26 - var11.field4016 / 2;
                                int var31 = (int) class114.field1742 + class278.field4540 & 0x7FF;
                                int var32 = class136.field2191[var31];
                                int var33 = (class150.field2394 + 256) * var32 >> 8;
                                int var34 = class136.field2193[var31];
                                int var35 = (class150.field2394 + 256) * var34 >> 8;
                                int var36 = var29 * var33 + (var30 * var35) >> 11;
                                int var37 = var29 * var35 - (var30 * var33) >> 11;
                                int var38 = var36 + class217.field3408.field994 + 64 - class217.field3408.method101(false) * 64 >> 7;
                                int var39 = class217.field3408.field929 - var37 - (class217.field3408.method101(false) * 64 + -64) >> 7;
                                if (class101.field1579 && (class44.field652 & 0x40) != 0) {
                                    class248 var40 = class79.method571(class243.field3847, class122.field1940, (byte) -74);
                                    if (var40 == null) {
                                        class51.method325(-59);
                                    } else {
                                        class205.method1420(class205.field3297, 1L, 112, var38, var39, class189.field3096, " ->", (short) 45);
                                    }
                                    continue;
                                }
                                if (class106.field1656 == 1) {
                                    class205.method1420(class88.field1377, 1L, 127, var38, var39, -1, "", (short) 19);
                                }
                                class205.method1420(class78.field1254, 1L, 109, var38, var39, -1, "", (short) 25);
                                continue;
                            }
                            if (var11.field3957 == 1339) {
                                if (var11.method1679(-19)) {
                                    class213.method1465(var12, var14, var13, 89, var11);
                                    class94.method676(arg0, arg4, arg5, arg8);
                                }
                                continue;
                            }
                            if (var11.field3957 == 1400) {
                                class208.method1431(var13, var11.field4057, var14, var11.field4016, (byte) 112);
                                class259.field4249[var12] = true;
                                class197.field3170[var12] = true;
                                class94.method676(arg0, arg4, arg5, arg8);
                                continue;
                            }
                            if (var11.field3957 == 1401) {
                                class143.method980(var11.field4016, var11.field4057, var13, true, var14);
                                class259.field4249[var12] = true;
                                class197.field3170[var12] = true;
                                class94.method676(arg0, arg4, arg5, arg8);
                                continue;
                            }
                            if (var11.field3957 == 1402) {
                                class213.method1466(var13, var14, 0);
                                class259.field4249[var12] = true;
                                class197.field3170[var12] = true;
                                continue;
                            }
                            if (var11.field3957 == 1405) {
                                if (!class118.field1837) {
                                    continue;
                                }
                                int var41 = var13 + var11.field4016;
                                int var42 = var14 + 15;
                                class207.field3313.method506("Fps:" + class132.field2121, var41, var42, 16776960, -1);
                                int var131 = var42 + 15;
                                int var43 = 16776960;
                                int var44 = 0;
                                int var45 = 0;
                                Runtime var46 = Runtime.getRuntime();
                                int var47 = (int) ((var46.totalMemory() - var46.freeMemory()) / 1024L);
                                if (var47 > 65536) {
                                    var43 = 16711680;
                                }
                                class207.field3313.method506("Mem:" + var47 + "k", var41, var131, var43, -1);
                                int var48 = 0;
                                for (int var49 = 0; var49 < 29; var49++) {
                                    var44 += class79.field1273[var49].method905((byte) 0);
                                    var45 += class79.field1273[var49].method901(17732);
                                    var48 += class79.field1273[var49].method912(-17004);
                                }
                                int var50 = 16776960;
                                int var51 = var48 * 100 / var44;
                                var42 = var131 + 15;
                                int var52 = var45 * 10000 / var44;
                                String var53 = "Cache:" + class61.method395(0, true, 2, 0, (long) var52) + "% (" + var51 + "%)";
                                class183.field3043.method506(var53, var41, var42, var50, -1);
                                var42 += 12;
                                if (class181.field2995 > 0) {
                                    class183.field3043.method506("Particles: " + class181.field2983 + " / " + class181.field2995, var41, var42, var50, -1);
                                }
                                var42 += 12;
                                class259.field4249[var12] = true;
                                class197.field3170[var12] = true;
                                continue;
                            }
                            if (var11.field3957 == 1406) {
                                class214.field3387 = var11;
                                class265.field4317 = var13;
                                class179.field2967 = var14;
                                continue;
                            }
                        }
                        if (!class41.field633) {
                            if (var11.field4038 == 0 && var11.field4039 && class33.field539 >= var23 && class148.field2368 >= var20 && var24 > class33.field539 && var25 > class148.field2368 && !class61.field881) {
                                class188.field3083[0] = class62.field908;
                                class26.field478[0] = 1004;
                                class226.field3550[0] = "";
                                class275.field4502[0] = class184.field3061;
                                class291.field4776 = 1;
                            }
                            if (var23 <= class33.field539 && class148.field2368 >= var20 && class33.field539 < var24 && class148.field2368 < var25) {
                                class268.method1787(class33.field539 - var13, 97, class148.field2368 - var14, var11);
                            }
                        }
                        if (var11.field4038 == 0) {
                            if (!var11.field3952 && client.method1137(var11) && class85.field1356 != var11) {
                                continue;
                            }
                            if (!var11.field3952) {
                                if (var11.field3953 > (var11.field3994 - var11.field4057)) {
                                    var11.field3953 = var11.field3994 - var11.field4057;
                                }
                                if (var11.field3953 < 0) {
                                    var11.field3953 = 0;
                                }
                            }
                            method1493(var23, var11.field3968, var12, arg3, var20, var24, var14 - var11.field3953, -var11.field3944 + var13, var25, -124);
                            if (var11.field4068 != null) {
                                method1493(var23, var11.field3968, var12, var11.field4068, var20, var24, var14 - var11.field3953, -var11.field3944 + var13, var25, -121);
                            }
                            class109 var54 = (class109) class74.field1192.method371(-111, (long) var11.field3968);
                            if (var54 != null) {
                                if (var54.field1693 == 0 && !class41.field633 && class33.field539 >= var23 && var20 <= class148.field2368 && var24 > class33.field539 && var25 > class148.field2368 && !class61.field881) {
                                    class275.field4502[0] = class184.field3061;
                                    class188.field3083[0] = class62.field908;
                                    class291.field4776 = 1;
                                    class26.field478[0] = 1004;
                                    class226.field3550[0] = "";
                                }
                                class119.method822(var12, var13, var14, (byte) -81, var54.field1689, var20, var25, var23, var24);
                            }
                            class94.method676(arg0, arg4, arg5, arg8);
                            class136.method945();
                        }
                        if (class21.field403[var12] || class306.field4975 > 1) {
                            if (var11.field4038 == 0 && !var11.field3952 && var11.field3994 > var11.field4057) {
                                class247.method1672(var11.field3994, var11.field4057, (byte) 37, var11.field3953, var14, var11.field4016 + var13);
                            }
                            if (var11.field4038 != 1) {
                                if (var11.field4038 == 2) {
                                    int var55 = 0;
                                    for (int var56 = 0; var56 < var11.field4029; var56++) {
                                        for (int var57 = 0; var57 < var11.field3911; var57++) {
                                            int var58 = var13 + ((var11.field4030 + 32) * var57);
                                            int var59 = var14 + ((var11.field4045 + 32) * var56);
                                            if (var55 < 20) {
                                                var58 += var11.field4063[var55];
                                                var59 += var11.field3890[var55];
                                            }
                                            if (var11.field4041[var55] > 0) {
                                                boolean var60 = false;
                                                boolean var61 = false;
                                                int var62 = var11.field4041[var55] - 1;
                                                if (arg0 < (var58 + 32) && var58 < arg5 && arg4 < var59 + 32 && var59 < arg8 || class202.field3270 == var11 && class34.field557 == var55) {
                                                    class292 var63;
                                                    if (class45.field669 == 1 && class119.field1878 == var55 && class272.field4386 == var11.field3968) {
                                                        var63 = class310.method2101(741, var11.field4054[var55], 2, (class280) null, var62, 0, var11.field4059);
                                                    } else {
                                                        var63 = class310.method2101(741, var11.field4054[var55], 1, (class280) null, var62, 3153952, var11.field4059);
                                                    }
                                                    if (class136.field2203) {
                                                        class259.field4249[var12] = true;
                                                    }
                                                    if (var63 == null) {
                                                        class111.method776(var11, (byte) 25);
                                                    } else if (class202.field3270 == var11 && class34.field557 == var55) {
                                                        int var64 = class55.field797 - class156.field2494;
                                                        if (var64 < 5 && var64 > -5) {
                                                            var64 = 0;
                                                        }
                                                        int var65 = class287.field4640 - class57.field828;
                                                        if (var65 < 5 && var65 > -5) {
                                                            var65 = 0;
                                                        }
                                                        if (class266.field4321 < 5) {
                                                            var65 = 0;
                                                            var64 = 0;
                                                        }
                                                        var63.method452(var58 + var65, var59 + var64, 128);
                                                        if (arg1 != -1) {
                                                            class248 var66 = arg3[arg1 & 0xFFFF];
                                                            int var67 = class94.field1501;
                                                            int var68 = class94.field1494;
                                                            if (var67 > (var59 + var64) && var66.field3953 > 0) {
                                                                int var69 = (var67 - var59 - var64) * class61.field883 / 3;
                                                                if (class61.field883 * 10 < var69) {
                                                                    var69 = class61.field883 * 10;
                                                                }
                                                                if (var69 > var66.field3953) {
                                                                    var69 = var66.field3953;
                                                                }
                                                                var66.field3953 -= var69;
                                                                class156.field2494 += var69;
                                                                class111.method776(var66, (byte) 25);
                                                            }
                                                            if (var68 < var59 + var64 + 32 && var66.field3994 - var66.field4057 > var66.field3953) {
                                                                int var70 = (var64 + var59 + 32 - var68) * class61.field883 / 3;
                                                                if (class61.field883 * 10 < var70) {
                                                                    var70 = class61.field883 * 10;
                                                                }
                                                                if (var70 > (var66.field3994 - (var66.field4057 + var66.field3953))) {
                                                                    var70 = var66.field3994 - var66.field4057 - var66.field3953;
                                                                }
                                                                var66.field3953 += var70;
                                                                class156.field2494 -= var70;
                                                                class111.method776(var66, (byte) 25);
                                                            }
                                                        }
                                                    } else if (class114.field1744 == var11 && class239.field3745 == var55) {
                                                        var63.method452(var58, var59, 128);
                                                    } else {
                                                        var63.method451(var58, var59);
                                                    }
                                                }
                                            } else if (var11.field3913 != null && var55 < 20) {
                                                class292 var71 = var11.method1687(var55, 68);
                                                if (var71 != null) {
                                                    var71.method451(var58, var59);
                                                } else if (class182.field3019) {
                                                    class111.method776(var11, (byte) 25);
                                                }
                                            }
                                            var55++;
                                        }
                                    }
                                } else if (var11.field4038 == 3) {
                                    int var72;
                                    if (class35.method259(var11, -4)) {
                                        var72 = var11.field3936;
                                        if (class85.field1356 == var11 && var11.field3896 != 0) {
                                            var72 = var11.field3896;
                                        }
                                    } else {
                                        var72 = var11.field3976;
                                        if (class85.field1356 == var11 && var11.field3897 != 0) {
                                            var72 = var11.field3897;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var11.field3924) {
                                            class94.method660(var13, var14, var11.field4016, var11.field4057, var72);
                                        } else {
                                            class94.method670(var13, var14, var11.field4016, var11.field4057, var72);
                                        }
                                    } else if (var11.field3924) {
                                        class94.method668(var13, var14, var11.field4016, var11.field4057, var72, 256 - (var15 & 0xFF));
                                    } else {
                                        class94.method665(var13, var14, var11.field4016, var11.field4057, var72, 256 - (var15 & 0xFF));
                                    }
                                } else if (var11.field4038 == 4) {
                                    class73 var73 = var11.method1691(class197.field3174, -86);
                                    if (var73 != null) {
                                        String var74 = var11.field4046;
                                        int var75;
                                        if (class35.method259(var11, -4)) {
                                            var75 = var11.field3936;
                                            if (class85.field1356 == var11 && var11.field3896 != 0) {
                                                var75 = var11.field3896;
                                            }
                                            if (var11.field3891.length() > 0) {
                                                var74 = var11.field3891;
                                            }
                                        } else {
                                            var75 = var11.field3976;
                                            if (class85.field1356 == var11 && var11.field3897 != 0) {
                                                var75 = var11.field3897;
                                            }
                                        }
                                        if (var11.field3952 && var11.field4049 != -1) {
                                            class158 var76 = class107.method754(-20563, var11.field4049);
                                            var74 = var76.field2532;
                                            if (var74 == null) {
                                                var74 = "null";
                                            }
                                            if ((var76.field2539 == 1 || var11.field3902 != 1) && var11.field3902 != -1) {
                                                var74 = "<col=ff9040>" + var74 + "</col> x" + class217.method1483(var11.field3902, (byte) 103);
                                            }
                                        }
                                        if (class221.field3485 == var11) {
                                            var74 = class8.field184;
                                            var75 = var11.field3976;
                                        }
                                        if (!var11.field3952) {
                                            var74 = class210.method1445(var11, var74, (byte) -121);
                                        }
                                        var73.method511(var74, var13, var14, var11.field4016, var11.field4057, var75, var11.field4048 ? 0 : -1, var11.field3987, var11.field3963, var11.field3971);
                                    } else if (class182.field3019) {
                                        class111.method776(var11, (byte) 25);
                                    }
                                } else if (var11.field4038 == 5) {
                                    if (!var11.field3952) {
                                        class292 var86 = var11.method1675(class35.method259(var11, -4), (byte) -75);
                                        if (var86 != null) {
                                            var86.method451(var13, var14);
                                        } else if (class182.field3019) {
                                            class111.method776(var11, (byte) 25);
                                        }
                                    } else if (var11.field4017 >= 0) {
                                        class142 var85 = var11.method1686(false);
                                        var85.method976(0, var13, var14, var11.field4016, var11.field4057, var11.field3977, var11.field3995, 0);
                                    } else {
                                        class292 var77;
                                        if (var11.field4049 == -1) {
                                            var77 = var11.method1675(false, (byte) -115);
                                        } else if (var11.field4061 && class217.field3408.field232 != null) {
                                            var77 = class310.method2101(741, var11.field3902, var11.field4050, class217.field3408.field232, var11.field4049, var11.field3921, var11.field4059);
                                        } else {
                                            var77 = class310.method2101(741, var11.field3902, var11.field4050, (class280) null, var11.field4049, var11.field3921, var11.field4059);
                                        }
                                        if (var77 != null) {
                                            int var78 = var77.field4778;
                                            int var79 = var77.field4781;
                                            if (var11.field4000) {
                                                int var80 = (var11.field4016 - (1 - var79)) / var79;
                                                int var81 = (var78 + var11.field4057 - 1) / var78;
                                                class94.method673(var13, var14, var11.field4016 + var13, var11.field4057 + var14);
                                                for (int var82 = 0; var82 < var80; var82++) {
                                                    for (int var83 = 0; var83 < var81; var83++) {
                                                        if (var11.field3889 != 0) {
                                                            var77.method2014(var78 / 2 + var78 * var83 + var14, -93, 4096, var11.field3889, var79 * var82 + var79 / 2 + var13);
                                                        } else if (var15 == 0) {
                                                            var77.method451(var79 * var82 + var13, var14 - -(var78 * var83));
                                                        } else {
                                                            var77.method452(var79 * var82 + var13, var78 * var83 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class94.method676(arg0, arg4, arg5, arg8);
                                            } else {
                                                int var84 = var11.field4016 * 4096 / var79;
                                                if (var11.field3889 != 0) {
                                                    var77.method2014(var11.field4057 / 2 + var14, -126, var84, var11.field3889, var11.field4016 / 2 + var13);
                                                } else if (var15 != 0) {
                                                    var77.method444(var13, var14, var11.field4016, var11.field4057, 256 - (var15 & 0xFF));
                                                } else if (var11.field4016 == var79 && var11.field4057 == var78) {
                                                    var77.method451(var13, var14);
                                                } else {
                                                    var77.method450(var13, var14, var11.field4016, var11.field4057);
                                                }
                                            }
                                        } else if (class182.field3019) {
                                            class111.method776(var11, (byte) 25);
                                        }
                                    }
                                } else if (var11.field4038 == 6) {
                                    boolean var87 = class35.method259(var11, -4);
                                    class32 var88 = null;
                                    int var89;
                                    if (var87) {
                                        var89 = var11.field3892;
                                    } else {
                                        var89 = var11.field3940;
                                    }
                                    int var90 = 0;
                                    if (var11.field4049 != -1) {
                                        class158 var91 = class107.method754(-20563, var11.field4049);
                                        if (var91 != null) {
                                            class158 var92 = var91.method1081((byte) 122, var11.field3902);
                                            class91 var93 = var89 == -1 ? null : class159.method1085((byte) -63, var89);
                                            if (var11.field4061 && class217.field3408.field232 != null) {
                                                var88 = var92.method1083(class217.field3408.field232, 1, var93, var11.field4031, var11.field3969, false, var11.field3927);
                                            } else {
                                                var88 = var92.method1083((class280) null, 1, var93, var11.field4031, var11.field3969, false, var11.field3927);
                                            }
                                            if (var88 == null) {
                                                class111.method776(var11, (byte) 25);
                                            } else {
                                                var90 = -var88.method22() / 2;
                                            }
                                        }
                                    } else if (var11.field4042 == 5) {
                                        if (var11.field4055 == -1) {
                                            var88 = class75.field1201.method1905(-1, 0, (class278[]) null, -1, -1, 0, false, (class91) null, (class91) null, -1592297808, true, -1);
                                        } else {
                                            int var94 = var11.field4055 & 0x7FF;
                                            if (class41.field632 == var94) {
                                                var94 = 2047;
                                            }
                                            class12 var95 = class28.field494[var94];
                                            class91 var96 = var89 == -1 ? null : class159.method1085((byte) -63, var89);
                                            if (var95 != null && ((int) class162.method1114((byte) -116, var95.field222) << 11) == (var11.field4055 & 0xFFFFF800)) {
                                                var88 = var95.field232.method1905(0, 0, (class278[]) null, -1, var11.field3927, 0, false, (class91) null, var96, -1592297808, true, -1);
                                            }
                                        }
                                    } else if (var89 == -1) {
                                        var88 = var11.method1684(var87, class217.field3408.field232, (class91) null, -1, -1, -1, 0);
                                        if (var88 == null && class182.field3019) {
                                            class111.method776(var11, (byte) 25);
                                        }
                                    } else {
                                        class91 var97 = class159.method1085((byte) -63, var89);
                                        var88 = var11.method1684(var87, class217.field3408.field232, var97, var11.field3969, var11.field3927, -1, var11.field4031);
                                        if (var88 == null && class182.field3019) {
                                            class111.method776(var11, (byte) 25);
                                        }
                                    }
                                    if (var88 != null) {
                                        int var98;
                                        if (var11.field4053 <= 0) {
                                            var98 = 256;
                                        } else {
                                            var98 = (var11.field4016 << 8) / var11.field4053;
                                        }
                                        int var99;
                                        if (var11.field3933 > 0) {
                                            var99 = (var11.field4057 << 8) / var11.field3933;
                                        } else {
                                            var99 = 256;
                                        }
                                        int var100 = (var11.field4004 * var98 >> 8) + var11.field4016 / 2 + var13;
                                        int var101 = (var11.field4066 * var99 >> 8) + (var14 + (var11.field4057 / 2));
                                        class136.method941(var100, var101);
                                        int var102 = class136.field2191[var11.field4035] * var11.field4022 >> 16;
                                        int var103 = class136.field2193[var11.field4035] * var11.field4022 >> 16;
                                        if (!var11.field3952) {
                                            var88.method20(0, var11.field4062, 0, var11.field4035, 0, var102, var103, -1L);
                                        } else if (var11.field4018) {
                                            ((class3) var88).method28(0, var11.field4062, var11.field4011, var11.field4035, var11.field4047, var90 + var102 + var11.field3923, var11.field3923 + var103, var11.field4022);
                                        } else {
                                            var88.method20(0, var11.field4062, var11.field4011, var11.field4035, var11.field4047, var90 + var102 + var11.field3923, var11.field3923 + var103, -1L);
                                        }
                                        class136.method929();
                                    }
                                } else {
                                    if (var11.field4038 == 7) {
                                        class73 var104 = var11.method1691(class197.field3174, 77);
                                        if (var104 == null) {
                                            if (class182.field3019) {
                                                class111.method776(var11, (byte) 25);
                                            }
                                            continue;
                                        }
                                        int var105 = 0;
                                        for (int var106 = 0; var106 < var11.field4029; var106++) {
                                            for (int var107 = 0; var107 < var11.field3911; var107++) {
                                                if (var11.field4041[var105] > 0) {
                                                    class158 var108 = class107.method754(-20563, var11.field4041[var105] - 1);
                                                    String var109;
                                                    if (var108.field2539 != 1 && var11.field4054[var105] == 1) {
                                                        var109 = "<col=ff9040>" + var108.field2532 + "</col>";
                                                    } else {
                                                        var109 = "<col=ff9040>" + var108.field2532 + "</col> x" + class217.method1483(var11.field4054[var105], (byte) 92);
                                                    }
                                                    int var110 = (var11.field4030 + 115) * var107 + var13;
                                                    int var111 = (var11.field4045 + 12) * var106 + var14;
                                                    if (var11.field3987 == 0) {
                                                        var104.method505(var109, var110, var111, var11.field3976, var11.field4048 ? 0 : -1);
                                                    } else if (var11.field3987 == 1) {
                                                        var104.method510(var109, var110 + 57, var111, var11.field3976, var11.field4048 ? 0 : -1);
                                                    } else {
                                                        var104.method506(var109, var110 + 115 - 1, var111, var11.field3976, var11.field4048 ? 0 : -1);
                                                    }
                                                }
                                                var105++;
                                            }
                                        }
                                    }
                                    if (var11.field4038 == 8 && class173.field2903 == var11 && class224.field3522 == class155.field2471) {
                                        int var112 = 0;
                                        int var113 = 0;
                                        class73 var114 = class207.field3313;
                                        String var115 = var11.field4046;
                                        String var116 = class210.method1445(var11, var115, (byte) -121);
                                        while (var116.length() > 0) {
                                            int var124 = var116.indexOf("<br>");
                                            String var125;
                                            if (var124 == -1) {
                                                var125 = var116;
                                                var116 = "";
                                            } else {
                                                var125 = var116.substring(0, var124);
                                                var116 = var116.substring(var124 + 4);
                                            }
                                            int var126 = var114.method527(var125);
                                            if (var112 < var126) {
                                                var112 = var126;
                                            }
                                            var113 += var114.field1178 + 1;
                                        }
                                        var113 += 7;
                                        var112 += 6;
                                        int var117 = var13 + var11.field4016 - var112 - 5;
                                        if (var117 < (var13 + 5)) {
                                            var117 = var13 + 5;
                                        }
                                        int var118 = var14 + var11.field4057 + 5;
                                        if (arg5 < (var117 + var112)) {
                                            var117 = arg5 - var112;
                                        }
                                        if (var113 + var118 > arg8) {
                                            var118 = arg8 - var113;
                                        }
                                        class94.method660(var117, var118, var112, var113, 16777120);
                                        class94.method670(var117, var118, var112, var113, 0);
                                        String var119 = var11.field4046;
                                        int var120 = var118 + var114.field1178 + 2;
                                        String var121 = class210.method1445(var11, var119, (byte) -121);
                                        while (var121.length() > 0) {
                                            int var122 = var121.indexOf("<br>");
                                            String var123;
                                            if (var122 == -1) {
                                                var123 = var121;
                                                var121 = "";
                                            } else {
                                                var123 = var121.substring(0, var122);
                                                var121 = var121.substring(var122 + 4);
                                            }
                                            var114.method505(var123, var117 + 3, var120, 0, -1);
                                            var120 += var114.field1178 + 1;
                                        }
                                    }
                                    if (var11.field4038 == 9) {
                                        int var127;
                                        int var128;
                                        int var129;
                                        int var130;
                                        if (var11.field3973) {
                                            var127 = var13;
                                            var128 = var14;
                                            var129 = var11.field4016 + var13;
                                            var130 = var11.field4057 + var14;
                                        } else {
                                            var130 = var14;
                                            var127 = var13;
                                            var129 = var11.field4016 + var13;
                                            var128 = var14 + var11.field4057;
                                        }
                                        if (var11.field3982 == 1) {
                                            class94.method681(var127, var130, var129, var128, var11.field3976);
                                        } else {
                                            class94.method672(var127, var130, var129, var128, var11.field3976, var11.field3982);
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
}
