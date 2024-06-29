import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class213 implements Runnable {

    @OriginalMember(owner = "client!ii", name = "o", descriptor = "[Lem;")
    public volatile class11[] field3403 = new class11[2];

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "Z")
    public volatile boolean field3396 = false;

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "Z")
    public volatile boolean field3397 = false;

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "I")
    public static int field3394 = 0;

    @OriginalMember(owner = "client!ii", name = "m", descriptor = "[I")
    public static int[] field3401 = new int[256];

    @OriginalMember(owner = "client!ii", name = "q", descriptor = "I")
    public static int field3405 = -1;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!ii", name = "k", descriptor = "I")
    public static int field3399;

    @OriginalMember(owner = "client!ii", name = "n", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!ii", name = "p", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!ii", name = "l", descriptor = "Lem;")
    public static class11 field3400;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "Loj;")
    public class325 field3391;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)V", line = 4)
    public static final void method1542(int arg0, int arg1) {
        class83.field1238 = 3;
        class87.field1328 = 20;
        if (arg1 != -20010) {
            field3405 = -17;
        }
        field3392++;
        class17.field325 = arg0;
    }

    @OriginalMember(owner = "client!ii", name = "run", descriptor = "()V", line = 18)
    public final void run() {
        field3393++;
        this.field3397 = true;
        try {
            while (!this.field3396) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class11 var2 = this.field3403[var1];
                    if (var2 != null) {
                        var2.method83((byte) 98);
                    }
                }
                class279.method1991(115, 10L);
                class25.method171((Object) null, true, this.field3391);
            }
        } catch (Exception var7) {
            class134.method1009(-2, (String) null, var7);
        } finally {
            this.field3397 = false;
        }
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(II)Z", line = 55)
    public static final boolean method1543(int arg0, int arg1) {
        field3395++;
        if (class12.field238[arg1]) {
            return true;
        } else if (class160.field2524.method491(arg1, (byte) -7)) {
            int var2 = class160.field2524.method465(arg1, 0);
            if (var2 == 0) {
                class12.field238[arg1] = true;
                return true;
            }
            if (class207.field3269[arg1] == null) {
                class207.field3269[arg1] = new class292[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class207.field3269[arg1][var3] == null) {
                    byte[] var4 = class160.field2524.method467(var3, 69, arg1);
                    if (var4 != null) {
                        class292 var5 = class207.field3269[arg1][var3] = new class292();
                        var5.field4531 = (arg1 << 16) + var3;
                        if (var4[0] == -1) {
                            var5.method2054(-1, new class101(var4));
                        } else {
                            var5.method2044(arg0 ^ 0xFFFF9BA4, new class101(var4));
                        }
                    }
                }
            }
            class12.field238[arg1] = true;
            if (arg0 == 25641) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "([Lob;IIIIIIIII)V", line = 114)
    public static final void method1544(class292[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg6 != -1) {
            method1544((class292[]) null, 36, 122, 53, -99, 124, 113, -57, 73, 25);
        }
        field3390++;
        if (class265.field4126) {
            class262.method1865(arg4, arg8, arg5, arg3);
        } else {
            class182.method1358(arg4, arg8, arg5, arg3);
            class174.method1292();
        }
        for (int var10 = 0; var10 < arg0.length; var10++) {
            class292 var11 = arg0[var10];
            if (var11 != null && (var11.field4587 == arg1 || arg1 == -1412584499 && class76.field1165 == var11)) {
                int var12;
                if (arg2 == -1) {
                    class260.field4042[class319.field4983] = var11.field4580 + arg7;
                    class230.field3661[class319.field4983] = var11.field4605 + arg9;
                    class104.field1758[class319.field4983] = var11.field4608;
                    class258.field3981[class319.field4983] = var11.field4499;
                    var12 = class319.field4983++;
                } else {
                    var12 = arg2;
                }
                var11.field4593 = var12;
                var11.field4591 = class205.field3252;
                if (!var11.field4537 || !client.method1790(var11)) {
                    if (var11.field4477 > 0) {
                        class70.method543(var11, 7290);
                    }
                    int var13 = var11.field4580 + arg7;
                    int var14 = var11.field4605 + arg9;
                    int var15 = var11.field4442;
                    if (class31.field523 && (client.method1786(var11).field738 != 0 || var11.field4490 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class76.field1165 == var11) {
                        if (arg1 != -1412584499 && !var11.field4571) {
                            class24.field407 = arg0;
                            class222.field3554 = arg9;
                            class223.field3593 = arg7;
                            continue;
                        }
                        if (class91.field1489 && class143.field2261) {
                            int var16 = class203.field3225;
                            int var17 = var16 - class274.field4257;
                            int var18 = class278.field4309;
                            int var19 = var18 - class328.field5081;
                            if (class54.field859 > var19) {
                                var19 = class54.field859;
                            }
                            if (class198.field3140 > var17) {
                                var17 = class198.field3140;
                            }
                            if ((class198.field3140 + class6.field101.field4608) < (var11.field4608 + var17)) {
                                var17 = class6.field101.field4608 + class198.field3140 - var11.field4608;
                            }
                            var13 = var17;
                            if ((var11.field4499 + var19) > (class54.field859 + class6.field101.field4499)) {
                                var19 = class54.field859 + class6.field101.field4499 - var11.field4499;
                            }
                            var14 = var19;
                        }
                        if (!var11.field4571) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var24;
                    int var25;
                    if (var11.field4490 == 2) {
                        var24 = arg5;
                        var25 = arg3;
                        var20 = arg8;
                        var21 = arg4;
                    } else {
                        var20 = arg8 >= var14 ? arg8 : var14;
                        var21 = var13 > arg4 ? var13 : arg4;
                        int var22 = var11.field4608 + var13;
                        int var23 = var14 + var11.field4499;
                        if (var11.field4490 == 9) {
                            var22++;
                            var23++;
                        }
                        var24 = var22 < arg5 ? var22 : arg5;
                        var25 = arg3 > var23 ? var23 : arg3;
                    }
                    if (!var11.field4537 || var24 > var21 && var20 < var25) {
                        if (var11.field4477 != 0) {
                            if (var11.field4477 == 1337 || var11.field4477 == 1403 && class265.field4126) {
                                class251.field3869 = var11;
                                class77.field1181 = var13;
                                field3405 = var14;
                                class82.method592(var11.field4477 == 1403, var11.field4499, var13, (byte) 73, var11.field4608, var14);
                                if (class265.field4126) {
                                    class262.method1865(arg4, arg8, arg5, arg3);
                                } else {
                                    class182.method1358(arg4, arg8, arg5, arg3);
                                }
                                continue;
                            }
                            if (var11.field4477 == 1338) {
                                if (!var11.method2042(true)) {
                                    continue;
                                }
                                class13.method116(var12, 256, var14, var13, var11);
                                if (class265.field4126) {
                                    class262.method1865(arg4, arg8, arg5, arg3);
                                } else {
                                    class182.method1358(arg4, arg8, arg5, arg3);
                                }
                                if (class17.field331 != 0 && class17.field331 != 3 || class243.field3754 || var21 > class275.field4270 || class138.field2198 < var20 || var24 <= class275.field4270 || var25 <= class138.field2198) {
                                    continue;
                                }
                                int var126 = class138.field2198 - var14;
                                int var127 = var11.field4597[var126];
                                int var128 = class275.field4270 - var13;
                                if (var128 < var127 || var128 > var11.field4459[var126] + var127) {
                                    continue;
                                }
                                int var129 = class248.field3833 + class204.field3234 & 0x7FF;
                                int var130 = var126 - var11.field4499 / 2;
                                int var131 = var128 - var11.field4608 / 2;
                                int var132 = class174.field2732[var129];
                                int var133 = class174.field2731[var129];
                                int var134 = (class123.field1970 + 256) * var133 >> 8;
                                int var135 = (class123.field1970 + 256) * var132 >> 8;
                                int var136 = var130 * var134 + (var131 * var135) >> 11;
                                int var137 = var130 * var135 - (var131 * var134) >> 11;
                                int var138 = class19.field356.field1442 + var136 >> 7;
                                int var139 = class19.field356.field1369 - var137 >> 7;
                                if (class219.field3514 && (class329.field5083 & 0x40) != 0) {
                                    class292 var140 = class41.method330(class233.field3692, class30.field493, -1);
                                    if (var140 == null) {
                                        class107.method820(122);
                                    } else {
                                        class34.method236((short) 5, var139, class239.field3722, var138, class306.field4820, (byte) 40, " ->", 1L);
                                    }
                                    continue;
                                }
                                if (class141.field2241 == 1) {
                                    class34.method236((short) 23, var139, class310.field4879, var138, -1, (byte) 40, "", 1L);
                                }
                                class34.method236((short) 35, var139, class308.field4855, var138, -1, (byte) 40, "", 1L);
                                continue;
                            }
                            if (var11.field4477 == 1339) {
                                if (var11.method2042(true)) {
                                    class68.method516(var11, var14, var13, var12, (byte) -28);
                                    if (class265.field4126) {
                                        class262.method1865(arg4, arg8, arg5, arg3);
                                    } else {
                                        class182.method1358(arg4, arg8, arg5, arg3);
                                    }
                                }
                                continue;
                            }
                            if (var11.field4477 == 1400) {
                                class128.method961(var13, var14, var11.field4499, 15008, var11.field4608);
                                class30.field502[var12] = true;
                                class301.field4734[var12] = true;
                                if (class265.field4126) {
                                    class262.method1865(arg4, arg8, arg5, arg3);
                                } else {
                                    class182.method1358(arg4, arg8, arg5, arg3);
                                }
                                continue;
                            }
                            if (var11.field4477 == 1401) {
                                class83.method597(var11.field4499, var11.field4608, arg6 ^ 0x6BE9, var14, var13);
                                class30.field502[var12] = true;
                                class301.field4734[var12] = true;
                                if (class265.field4126) {
                                    class262.method1865(arg4, arg8, arg5, arg3);
                                } else {
                                    class182.method1358(arg4, arg8, arg5, arg3);
                                }
                                continue;
                            }
                            if (var11.field4477 == 1402) {
                                if (!class265.field4126) {
                                    class276.method1978(var14, 116, var13);
                                    class30.field502[var12] = true;
                                    class301.field4734[var12] = true;
                                }
                                continue;
                            }
                            if (var11.field4477 == 1405) {
                                if (!class4.field28) {
                                    continue;
                                }
                                int var26 = var11.field4608 + var13;
                                int var27 = var14 + 15;
                                class64.field1021.method1031("Fps:" + class50.field807, var26, var27, 16776960, -1);
                                Runtime var28 = Runtime.getRuntime();
                                int var29 = (int) ((var28.totalMemory() - var28.freeMemory()) / 1024L);
                                int var141 = var27 + 15;
                                int var30 = 16776960;
                                if (var29 > 65536) {
                                    var30 = 16711680;
                                }
                                class64.field1021.method1031("Mem:" + var29 + "k", var26, var141, var30, -1);
                                var27 = var141 + 15;
                                if (class265.field4126) {
                                    int var31 = 16776960;
                                    int var32 = (class214.field3410 + class214.field3406 + class214.field3411) / 1024;
                                    if (var32 > 65536) {
                                        var31 = 16711680;
                                    }
                                    class64.field1021.method1031("Card:" + var32 + "k", var26, var27, var31, -1);
                                    var27 += 15;
                                }
                                int var33 = 0;
                                int var34 = 16776960;
                                int var35 = 0;
                                int var36 = 0;
                                for (int var37 = 0; var37 < 28; var37++) {
                                    var33 += class278.field4308[var37].method1567(12480);
                                    var35 += class278.field4308[var37].method1566(55);
                                    var36 += class278.field4308[var37].method1563(0);
                                }
                                int var38 = var36 * 100 / var33;
                                int var39 = var35 * 10000 / var33;
                                String var40 = "Cache:" + class27.method178(0, (long) var39, true, (byte) -69, 2) + "% (" + var38 + "%)";
                                class127.field2035.method1031(var40, var26, var27, var34, -1);
                                class30.field502[var12] = true;
                                class301.field4734[var12] = true;
                                var27 += 12;
                                continue;
                            }
                            if (var11.field4477 == 1406) {
                                class40.field717 = var13;
                                class115.field1873 = var11;
                                class204.field3235 = var14;
                                continue;
                            }
                        }
                        if (!class243.field3754) {
                            if (var11.field4490 == 0 && var11.field4460 && class275.field4270 >= var21 && class138.field2198 >= var20 && var24 > class275.field4270 && var25 > class138.field2198 && !class31.field523) {
                                class298.field4711[0] = class115.field1879;
                                class13.field246[0] = "";
                                class40.field728[0] = class273.field4240;
                                class12.field233[0] = 1001;
                                class65.field1062 = 1;
                            }
                            if (var21 <= class275.field4270 && var20 <= class138.field2198 && var24 > class275.field4270 && var25 > class138.field2198) {
                                class295.method2077(class275.field4270 - var13, class138.field2198 - var14, var11, (byte) -93);
                            }
                        }
                        if (var11.field4490 == 0) {
                            if (!var11.field4537 && client.method1790(var11) && class193.field3076 != var11) {
                                continue;
                            }
                            if (!var11.field4537) {
                                if (var11.field4578 > var11.field4465 - var11.field4499) {
                                    var11.field4578 = var11.field4465 - var11.field4499;
                                }
                                if (var11.field4578 < 0) {
                                    var11.field4578 = 0;
                                }
                            }
                            method1544(arg0, var11.field4531, var12, var25, var21, var24, -1, var13 - var11.field4505, var20, var14 - var11.field4578);
                            if (var11.field4553 != null) {
                                method1544(var11.field4553, var11.field4531, var12, var25, var21, var24, -1, var13 - var11.field4505, var20, var14 - var11.field4578);
                            }
                            class224 var41 = (class224) class268.field4148.method833(false, (long) var11.field4531);
                            if (var41 != null) {
                                if (var41.field3601 == 0 && !class243.field3754 && class275.field4270 >= var21 && var20 <= class138.field2198 && var24 > class275.field4270 && class138.field2198 < var25 && !class31.field523) {
                                    class65.field1062 = 1;
                                    class298.field4711[0] = class115.field1879;
                                    class13.field246[0] = "";
                                    class40.field728[0] = class273.field4240;
                                    class12.field233[0] = 1001;
                                }
                                class200.method1456(var25, var41.field3596, var21, var24, var12, var13, 9385, var20, var14);
                            }
                            if (class265.field4126) {
                                class262.method1865(arg4, arg8, arg5, arg3);
                            } else {
                                class182.method1358(arg4, arg8, arg5, arg3);
                                class174.method1292();
                            }
                        }
                        if (class39.field694[var12] || class274.field4261 > 1) {
                            if (var11.field4490 == 0 && !var11.field4537 && var11.field4499 < var11.field4465) {
                                class233.method1682(var11.field4465, var11.field4499, var13 + var11.field4608, (byte) 117, var14, var11.field4578);
                            }
                            if (var11.field4490 != 1) {
                                if (var11.field4490 == 2) {
                                    int var42 = 0;
                                    for (int var43 = 0; var43 < var11.field4512; var43++) {
                                        for (int var44 = 0; var44 < var11.field4432; var44++) {
                                            int var45 = (var11.field4568 + 32) * var44 + var13;
                                            int var46 = (var11.field4551 + 32) * var43 + var14;
                                            if (var42 < 20) {
                                                var45 += var11.field4545[var42];
                                                var46 += var11.field4482[var42];
                                            }
                                            if (var11.field4439[var42] > 0) {
                                                boolean var47 = false;
                                                boolean var48 = false;
                                                int var49 = var11.field4439[var42] - 1;
                                                if ((var45 + 32) > arg4 && var45 < arg5 && arg8 < var46 + 32 && arg3 > var46 || class180.field2885 == var11 && class25.field421 == var42) {
                                                    class126 var50;
                                                    if (class152.field2451 == 1 && class326.field5058 == var42 && class284.field4367 == var11.field4531) {
                                                        var50 = class33.method231(var49, -116, var11.field4501, 2, 0, var11.field4480[var42]);
                                                    } else {
                                                        var50 = class33.method231(var49, -118, var11.field4501, 1, 3153952, var11.field4480[var42]);
                                                    }
                                                    if (class174.field2743) {
                                                        class30.field502[var12] = true;
                                                    }
                                                    if (var50 == null) {
                                                        class143.method1091(var11, (byte) 79);
                                                    } else if (class180.field2885 == var11 && class25.field421 == var42) {
                                                        int var51 = class278.field4309 - class303.field4761;
                                                        int var52 = class203.field3225 - class59.field926;
                                                        if (var51 < 5 && var51 > -5) {
                                                            var51 = 0;
                                                        }
                                                        if (var52 < 5 && var52 > -5) {
                                                            var52 = 0;
                                                        }
                                                        if (class204.field3237 < 5) {
                                                            var51 = 0;
                                                            var52 = 0;
                                                        }
                                                        var50.method58(var45 + var52, var46 + var51, 128);
                                                        if (arg1 != -1) {
                                                            class292 var53 = arg0[arg1 & 0xFFFF];
                                                            int var54;
                                                            int var55;
                                                            if (class265.field4126) {
                                                                var55 = class262.field4067;
                                                                var54 = class262.field4065;
                                                            } else {
                                                                var54 = class182.field2911;
                                                                var55 = class182.field2906;
                                                            }
                                                            if (var54 > (var46 + var51) && var53.field4578 > 0) {
                                                                int var56 = (var54 - var46 - var51) * class122.field1952 / 3;
                                                                if ((class122.field1952 * 10) < var56) {
                                                                    var56 = class122.field1952 * 10;
                                                                }
                                                                if (var53.field4578 < var56) {
                                                                    var56 = var53.field4578;
                                                                }
                                                                class303.field4761 += var56;
                                                                var53.field4578 -= var56;
                                                                class143.method1091(var53, (byte) 97);
                                                            }
                                                            if ((var46 + var51 + 32) > var55 && var53.field4465 - var53.field4499 > var53.field4578) {
                                                                int var57 = (var51 + var46 + 32 - var55) * class122.field1952 / 3;
                                                                if (var57 > (class122.field1952 * 10)) {
                                                                    var57 = class122.field1952 * 10;
                                                                }
                                                                if (var57 > (var53.field4465 - var53.field4499 - var53.field4578)) {
                                                                    var57 = var53.field4465 - var53.field4499 - var53.field4578;
                                                                }
                                                                class303.field4761 -= var57;
                                                                var53.field4578 += var57;
                                                                class143.method1091(var53, (byte) 86);
                                                            }
                                                        }
                                                    } else if (class270.field4207 == var11 && class303.field4776 == var42) {
                                                        var50.method58(var45, var46, 128);
                                                    } else {
                                                        var50.method59(var45, var46);
                                                    }
                                                }
                                            } else if (var11.field4463 != null && var42 < 20) {
                                                class126 var58 = var11.method2051(false, var42);
                                                if (var58 != null) {
                                                    var58.method59(var45, var46);
                                                } else if (class52.field822) {
                                                    class143.method1091(var11, (byte) 82);
                                                }
                                            }
                                            var42++;
                                        }
                                    }
                                } else if (var11.field4490 == 3) {
                                    int var125;
                                    if (class123.method932(arg6 + 76, var11)) {
                                        var125 = var11.field4441;
                                        if (class193.field3076 == var11 && var11.field4516 != 0) {
                                            var125 = var11.field4516;
                                        }
                                    } else {
                                        var125 = var11.field4538;
                                        if (class193.field3076 == var11 && var11.field4461 != 0) {
                                            var125 = var11.field4461;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var11.field4561) {
                                            if (class265.field4126) {
                                                class262.method1855(var13, var14, var11.field4608, var11.field4499, var125);
                                            } else {
                                                class182.method1360(var13, var14, var11.field4608, var11.field4499, var125);
                                            }
                                        } else if (class265.field4126) {
                                            class262.method1854(var13, var14, var11.field4608, var11.field4499, var125);
                                        } else {
                                            class182.method1364(var13, var14, var11.field4608, var11.field4499, var125);
                                        }
                                    } else if (var11.field4561) {
                                        if (class265.field4126) {
                                            class262.method1858(var13, var14, var11.field4608, var11.field4499, var125, 256 - (var15 & 0xFF));
                                        } else {
                                            class182.method1372(var13, var14, var11.field4608, var11.field4499, var125, 256 - (var15 & 0xFF));
                                        }
                                    } else if (class265.field4126) {
                                        class262.method1860(var13, var14, var11.field4608, var11.field4499, var125, 256 - (var15 & 0xFF));
                                    } else {
                                        class182.method1373(var13, var14, var11.field4608, var11.field4499, var125, 256 - (var15 & 0xFF));
                                    }
                                } else if (var11.field4490 == 4) {
                                    class135 var121 = var11.method2050((byte) -22, class224.field3600);
                                    if (var121 != null) {
                                        String var122 = var11.field4564;
                                        int var123;
                                        if (class123.method932(arg6 ^ 0xFFFFFFD7, var11)) {
                                            var123 = var11.field4441;
                                            if (class193.field3076 == var11 && var11.field4516 != 0) {
                                                var123 = var11.field4516;
                                            }
                                            if (var11.field4604.length() > 0) {
                                                var122 = var11.field4604;
                                            }
                                        } else {
                                            var123 = var11.field4538;
                                            if (class193.field3076 == var11 && var11.field4461 != 0) {
                                                var123 = var11.field4461;
                                            }
                                        }
                                        if (var11.field4537 && var11.field4567 != -1) {
                                            class179 var124 = class208.method1521(-1361, var11.field4567);
                                            var122 = var124.field2825;
                                            if (var122 == null) {
                                                var122 = "null";
                                            }
                                            if ((var124.field2829 == 1 || var11.field4544 != 1) && var11.field4544 != -1) {
                                                var122 = "<col=ff9040>" + var122 + "</col> x" + class163.method1206(var11.field4544, (byte) 125);
                                            }
                                        }
                                        if (class168.field2612 == var11) {
                                            var123 = var11.field4538;
                                            var122 = class89.field1421;
                                        }
                                        if (!var11.field4537) {
                                            var122 = class81.method586((byte) 94, var122, var11);
                                        }
                                        var121.method1021(var122, var13, var14, var11.field4608, var11.field4499, var123, var11.field4566 ? 0 : -1, var11.field4573, var11.field4506, var11.field4448);
                                    } else if (class52.field822) {
                                        class143.method1091(var11, (byte) 74);
                                    }
                                } else if (var11.field4490 == 5) {
                                    if (var11.field4537) {
                                        class126 var60;
                                        if (var11.field4567 == -1) {
                                            var60 = var11.method2056((byte) -59, false);
                                        } else {
                                            var60 = class33.method231(var11.field4567, -116, var11.field4501, var11.field4440, var11.field4539, var11.field4544);
                                        }
                                        if (var60 != null) {
                                            int var61 = var60.field2003;
                                            int var62 = var60.field2004;
                                            if (var11.field4473) {
                                                int var64 = (var11.field4608 + var61 - 1) / var61;
                                                int var65 = (var11.field4499 + var62 - 1) / var62;
                                                if (class265.field4126) {
                                                    class262.method1862(var13, var14, var11.field4608 + var13, var11.field4499 + var14);
                                                    boolean var68 = class165.method1209(false, var60.field2007);
                                                    boolean var69 = class165.method1209(false, var60.field2011);
                                                    class105 var70 = (class105) var60;
                                                    if (var68 && var69) {
                                                        if (var15 == 0) {
                                                            var70.method812(var13, var14, var64, var65);
                                                        } else {
                                                            var70.method810(var13, var14, 256 - (var15 & 0xFF), var64, var65);
                                                        }
                                                    } else if (var68) {
                                                        for (int var74 = 0; var74 < var65; var74++) {
                                                            if (var15 == 0) {
                                                                var70.method812(var13, var62 * var74 + var14, var64, 1);
                                                            } else {
                                                                var70.method810(var13, var14 + (var62 * var74), -(var15 & 0xFF) + 256, var64, 1);
                                                            }
                                                        }
                                                    } else if (var69) {
                                                        for (int var71 = 0; var71 < var64; var71++) {
                                                            if (var15 == 0) {
                                                                var70.method812(var61 * var71 + var13, var14, 1, var65);
                                                            } else {
                                                                var70.method810(var61 * var71 + var13, var14, 256 - (var15 & 0xFF), 1, var65);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var72 = 0; var72 < var64; var72++) {
                                                            for (int var73 = 0; var73 < var65; var73++) {
                                                                if (var15 == 0) {
                                                                    var60.method59(var13 + (var61 * var72), var62 * var73 + var14);
                                                                } else {
                                                                    var60.method58(var61 * var72 + var13, var62 * var73 + var14, 256 - (var15 & 0xFF));
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class262.method1865(arg4, arg8, arg5, arg3);
                                                } else {
                                                    class182.method1357(var13, var14, var13 + var11.field4608, var14 - -var11.field4499);
                                                    for (int var66 = 0; var66 < var64; var66++) {
                                                        for (int var67 = 0; var67 < var65; var67++) {
                                                            if (var11.field4495 != 0) {
                                                                var60.method950(var61 * var66 + var13 + (var61 / 2), (byte) -42, var62 / 2 + var62 * var67 + var14, var11.field4495, 4096);
                                                            } else if (var15 == 0) {
                                                                var60.method59(var61 * var66 + var13, var62 * var67 + var14);
                                                            } else {
                                                                var60.method58(var61 * var66 + var13, var62 * var67 + var14, 256 - (var15 & 0xFF));
                                                            }
                                                        }
                                                    }
                                                    class182.method1358(arg4, arg8, arg5, arg3);
                                                }
                                            } else {
                                                int var63 = var11.field4608 * 4096 / var61;
                                                if (var11.field4495 != 0) {
                                                    var60.method950(var11.field4608 / 2 + var13, (byte) -42, var11.field4499 / 2 + var14, var11.field4495, var63);
                                                } else if (var15 != 0) {
                                                    var60.method41(var13, var14, var11.field4608, var11.field4499, 256 - (var15 & 0xFF));
                                                } else if (var11.field4608 == var61 && var11.field4499 == var62) {
                                                    var60.method59(var13, var14);
                                                } else {
                                                    var60.method56(var13, var14, var11.field4608, var11.field4499);
                                                }
                                            }
                                        } else if (class52.field822) {
                                            class143.method1091(var11, (byte) 40);
                                        }
                                    } else {
                                        class126 var59 = var11.method2056((byte) -59, class123.method932(51, var11));
                                        if (var59 != null) {
                                            var59.method59(var13, var14);
                                        } else if (class52.field822) {
                                            class143.method1091(var11, (byte) 82);
                                        }
                                    }
                                } else if (var11.field4490 == 6) {
                                    boolean var75 = class123.method932(-102, var11);
                                    int var76;
                                    if (var75) {
                                        var76 = var11.field4520;
                                    } else {
                                        var76 = var11.field4471;
                                    }
                                    class199 var77 = null;
                                    int var78 = 0;
                                    if (var11.field4567 != -1) {
                                        class179 var83 = class208.method1521(-1361, var11.field4567);
                                        if (var83 != null) {
                                            class179 var84 = var83.method1331(arg6 - 24005, var11.field4544);
                                            class269 var85 = var76 == -1 ? null : class6.method28(var76, 2);
                                            var77 = var84.method1328(var11.field4479, 1, 106, var85, var11.field4484, var11.field4565);
                                            if (var77 == null) {
                                                class143.method1091(var11, (byte) 79);
                                            } else {
                                                var78 = -var77.method207() / 2;
                                            }
                                        }
                                    } else if (var11.field4500 == 5) {
                                        if (var11.field4513 == -1) {
                                            var77 = class320.field5001.method1751(17499, -1, -1, (class18[]) null, 0, 0, (class269) null, true, -1, (class269) null, -1);
                                        } else {
                                            int var79 = var11.field4513 & 0x7FF;
                                            if (class60.field943 == var79) {
                                                var79 = 2047;
                                            }
                                            class30 var80 = class82.field1228[var79];
                                            class269 var81 = var76 == -1 ? null : class6.method28(var76, 2);
                                            if (var80 != null && ((int) class36.method281(106, var80.field494) << 11) == (var11.field4513 & 0xFFFFF800)) {
                                                var77 = var80.field489.method1751(17499, var11.field4479, 0, (class18[]) null, 0, 0, (class269) null, true, -1, var81, -1);
                                            }
                                        }
                                    } else if (var76 == -1) {
                                        var77 = var11.method2045(2, -1, var75, (class269) null, -1, class19.field356.field489, 0);
                                        if (var77 == null && class52.field822) {
                                            class143.method1091(var11, (byte) 95);
                                        }
                                    } else {
                                        class269 var82 = class6.method28(var76, 2);
                                        var77 = var11.method2045(2, var11.field4479, var75, var82, var11.field4484, class19.field356.field489, var11.field4565);
                                        if (var77 == null && class52.field822) {
                                            class143.method1091(var11, (byte) 99);
                                        }
                                    }
                                    if (var77 != null) {
                                        int var86;
                                        if (var11.field4521 <= 0) {
                                            var86 = 256;
                                        } else {
                                            var86 = (var11.field4608 << 8) / var11.field4521;
                                        }
                                        int var87;
                                        if (var11.field4535 <= 0) {
                                            var87 = 256;
                                        } else {
                                            var87 = (var11.field4499 << 8) / var11.field4535;
                                        }
                                        int var88 = (var11.field4526 * var87 >> 8) + var11.field4499 / 2 + var14;
                                        int var89 = var11.field4608 / 2 + (var11.field4496 * var86 >> 8) + var13;
                                        if (class265.field4126) {
                                            if (var11.field4576) {
                                                class265.method1901(var89, var88, var11.field4522, var11.field4508, var86, var87);
                                            } else {
                                                class265.method1880(var89, var88, var86, var87);
                                                class265.method1881((float) var11.field4514, (float) var11.field4508 * 1.5F);
                                            }
                                            class265.method1893();
                                            class265.method1905(true);
                                            class265.method1904(false);
                                            class231.method1669(class329.field5093, 116);
                                            if (class121.field1939) {
                                                class262.method1864();
                                                class265.method1914();
                                                class262.method1865(arg4, arg8, arg5, arg3);
                                                class121.field1939 = false;
                                            }
                                            if (var11.field4457) {
                                                class265.method1908();
                                            }
                                            int var92 = class174.field2732[var11.field4509] * var11.field4522 >> 16;
                                            int var93 = class174.field2731[var11.field4509] * var11.field4522 >> 16;
                                            if (var11.field4537) {
                                                var77.method1120(0, var11.field4511, var11.field4600, var11.field4509, var11.field4581, var11.field4468 + var93 + var78, var92 - -var11.field4468, -1L);
                                            } else {
                                                var77.method1120(0, var11.field4511, 0, var11.field4509, 0, var93, var92, -1L);
                                            }
                                            if (var11.field4457) {
                                                class265.method1897();
                                            }
                                        } else {
                                            class174.method1299(var89, var88);
                                            int var90 = class174.field2731[var11.field4509] * var11.field4522 >> 16;
                                            int var91 = class174.field2732[var11.field4509] * var11.field4522 >> 16;
                                            if (!var11.field4537) {
                                                var77.method1120(0, var11.field4511, 0, var11.field4509, 0, var90, var91, -1L);
                                            } else if (var11.field4576) {
                                                ((class146) var77).method1110(0, var11.field4511, var11.field4600, var11.field4509, var11.field4581, var78 + var90 + var11.field4468, var91 - -var11.field4468, var11.field4522);
                                            } else {
                                                var77.method1120(0, var11.field4511, var11.field4600, var11.field4509, var11.field4581, var78 + var90 + var11.field4468, var11.field4468 + var91, -1L);
                                            }
                                            class174.method1289();
                                        }
                                    }
                                } else {
                                    if (var11.field4490 == 7) {
                                        class135 var94 = var11.method2050((byte) -22, class224.field3600);
                                        if (var94 == null) {
                                            if (class52.field822) {
                                                class143.method1091(var11, (byte) 55);
                                            }
                                            continue;
                                        }
                                        int var95 = 0;
                                        for (int var96 = 0; var96 < var11.field4512; var96++) {
                                            for (int var97 = 0; var97 < var11.field4432; var97++) {
                                                if (var11.field4439[var95] > 0) {
                                                    class179 var98 = class208.method1521(arg6 ^ 0x550, var11.field4439[var95] - 1);
                                                    String var99;
                                                    if (var98.field2829 != 1 && var11.field4480[var95] == 1) {
                                                        var99 = "<col=ff9040>" + var98.field2825 + "</col>";
                                                    } else {
                                                        var99 = "<col=ff9040>" + var98.field2825 + "</col> x" + class163.method1206(var11.field4480[var95], (byte) 125);
                                                    }
                                                    int var100 = (var11.field4568 + 115) * var97 + var13;
                                                    int var101 = (var11.field4551 + 12) * var96 + var14;
                                                    if (var11.field4573 == 0) {
                                                        var94.method1029(var99, var100, var101, var11.field4538, var11.field4566 ? 0 : -1);
                                                    } else if (var11.field4573 == 1) {
                                                        var94.method1023(var99, var100 + 57, var101, var11.field4538, var11.field4566 ? 0 : -1);
                                                    } else {
                                                        var94.method1031(var99, var100 + 114, var101, var11.field4538, var11.field4566 ? 0 : -1);
                                                    }
                                                }
                                                var95++;
                                            }
                                        }
                                    }
                                    if (var11.field4490 == 8 && class169.field2637 == var11 && class200.field3146 == class137.field2174) {
                                        int var102 = 0;
                                        int var103 = 0;
                                        class135 var104 = class64.field1021;
                                        String var105 = var11.field4564;
                                        String var106 = class81.method586((byte) 94, var105, var11);
                                        while (var106.length() > 0) {
                                            int var107 = var106.indexOf("<br>");
                                            String var108;
                                            if (var107 == -1) {
                                                var108 = var106;
                                                var106 = "";
                                            } else {
                                                var108 = var106.substring(0, var107);
                                                var106 = var106.substring(var107 + 4);
                                            }
                                            int var109 = var104.method1035(var108);
                                            if (var109 > var102) {
                                                var102 = var109;
                                            }
                                            var103 += var104.field2133 + 1;
                                        }
                                        var102 += 6;
                                        var103 += 7;
                                        int var110 = var11.field4608 + var13 - var102 - 5;
                                        if (var110 < var13 + 5) {
                                            var110 = var13 + 5;
                                        }
                                        if (arg5 < var102 + var110) {
                                            var110 = arg5 - var102;
                                        }
                                        int var111 = var11.field4499 + var14 + 5;
                                        if (arg3 < var103 + var111) {
                                            var111 = arg3 - var103;
                                        }
                                        if (class265.field4126) {
                                            class262.method1855(var110, var111, var102, var103, 16777120);
                                            class262.method1854(var110, var111, var102, var103, 0);
                                        } else {
                                            class182.method1360(var110, var111, var102, var103, 16777120);
                                            class182.method1364(var110, var111, var102, var103, 0);
                                        }
                                        String var112 = var11.field4564;
                                        int var113 = var104.field2133 + var111 + 2;
                                        String var114 = class81.method586((byte) 94, var112, var11);
                                        while (var114.length() > 0) {
                                            int var115 = var114.indexOf("<br>");
                                            String var116;
                                            if (var115 == -1) {
                                                var116 = var114;
                                                var114 = "";
                                            } else {
                                                var116 = var114.substring(0, var115);
                                                var114 = var114.substring(var115 + 4);
                                            }
                                            var104.method1029(var116, var110 + 3, var113, 0, -1);
                                            var113 += var104.field2133 + 1;
                                        }
                                    }
                                    if (var11.field4490 == 9) {
                                        int var117;
                                        int var118;
                                        int var119;
                                        int var120;
                                        if (var11.field4470) {
                                            var117 = var11.field4608 + var13;
                                            var118 = var14;
                                            var119 = var13;
                                            var120 = var11.field4499 + var14;
                                        } else {
                                            var120 = var14;
                                            var119 = var13;
                                            var117 = var11.field4608 + var13;
                                            var118 = var14 + var11.field4499;
                                        }
                                        if (var11.field4476 == 1) {
                                            if (class265.field4126) {
                                                class262.method1863(var119, var120, var117, var118, var11.field4538);
                                            } else {
                                                class182.method1354(var119, var120, var117, var118, var11.field4538);
                                            }
                                        } else if (class265.field4126) {
                                            class262.method1861(var119, var120, var117, var118, var11.field4538, var11.field4476);
                                        } else {
                                            class182.method1365(var119, var120, var117, var118, var11.field4538, var11.field4476);
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

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(B)V", line = 1398)
    public static final void method1545(byte arg0) {
        int var1 = class76.field1168;
        int var2 = class217.field3485;
        int var3 = class316.field4931;
        field3399++;
        int var4 = class169.field2626;
        if (class235.field3698 == null || class62.field959 == null) {
            if (class210.field3356.method489(class163.field2556, 0) && class210.field3356.method489(class24.field411, 0)) {
                class235.field3698 = class35.method252(123, 0, class163.field2556, class210.field3356);
                class62.field959 = class35.method252(-75, 0, class24.field411, class210.field3356);
                if (class265.field4126) {
                    if ((class235.field3698 instanceof class66)) {
                        class235.field3698 = new class1((class7) class235.field3698);
                    } else {
                        class235.field3698 = new class105((class7) class235.field3698);
                    }
                    if ((class62.field959 instanceof class66)) {
                        class62.field959 = new class1((class7) class62.field959);
                    } else {
                        class62.field959 = new class105((class7) class62.field959);
                    }
                }
            } else if (class265.field4126) {
                class262.method1858(var1, var3, var2, 20, class311.field4892, 256 - class60.field947);
            } else {
                class182.method1372(var1, var3, var2, 20, class311.field4892, 256 - class60.field947);
            }
        }
        if (class235.field3698 != null && class62.field959 != null) {
            int var5 = var2 / class235.field3698.field2007;
            for (int var6 = 0; var6 < var5; var6++) {
                class235.field3698.method59(class235.field3698.field2007 * var6 + var1, var3);
            }
            class62.field959.method59(var1, var3);
            class62.field959.method62(var1 + var2 - class62.field959.field2007, var3);
        }
        class95.field1558.method1029(class77.field1175, var1 + 3, var3 - -14, class9.field147, -1);
        if (class265.field4126) {
            class262.method1858(var1, var3 + 20, var2, var4 - 20, class311.field4892, 256 - class60.field947);
        } else {
            class182.method1372(var1, var3 + 20, var2, var4 - 20, class311.field4892, 256 - class60.field947);
        }
        int var7 = class278.field4309;
        int var8 = class203.field3225;
        for (int var9 = 0; var9 < class65.field1062; var9++) {
            int var10 = var3 + ((-var9 + class65.field1062 + -1) * 15) + 35;
            if (var1 < var8 && var8 < (var1 + var2) && var7 > (var10 - 13) && var7 < (var10 + 3)) {
                if (class265.field4126) {
                    class262.method1858(var1, var10 - 13, var2, 16, class191.field3062, 256 - class246.field3814);
                } else {
                    class182.method1372(var1, var10 - 13, var2, 16, class191.field3062, 256 - class246.field3814);
                }
            }
        }
        if (arg0 <= 38) {
            method1545((byte) 21);
        }
        if ((class280.field4330 == null || class9.field149 == null || class118.field1905 == null) && class210.field3356.method489(class160.field2525, 0) && class210.field3356.method489(class123.field1972, 0) && class210.field3356.method489(class145.field2282, 0)) {
            class280.field4330 = class35.method252(114, 0, class160.field2525, class210.field3356);
            class9.field149 = class35.method252(118, 0, class123.field1972, class210.field3356);
            class118.field1905 = class35.method252(119, 0, class145.field2282, class210.field3356);
            if (class265.field4126) {
                if ((class280.field4330 instanceof class66)) {
                    class280.field4330 = new class1((class7) class280.field4330);
                } else {
                    class280.field4330 = new class105((class7) class280.field4330);
                }
                if ((class9.field149 instanceof class66)) {
                    class9.field149 = new class1((class7) class9.field149);
                } else {
                    class9.field149 = new class105((class7) class9.field149);
                }
                if (class118.field1905 instanceof class66) {
                    class118.field1905 = new class1((class7) class118.field1905);
                } else {
                    class118.field1905 = new class105((class7) class118.field1905);
                }
            }
        }
        if (class280.field4330 != null && class9.field149 != null && class118.field1905 != null) {
            int var11 = var2 / class280.field4330.field2007;
            for (int var12 = 0; var12 < var11; var12++) {
                class280.field4330.method59(class280.field4330.field2007 * var12 + var1, var3 - -var4 - class280.field4330.field2011);
            }
            int var13 = (var4 - 20) / class9.field149.field2011;
            for (int var14 = 0; var14 < var13; var14++) {
                class9.field149.method59(var1, var3 + (class9.field149.field2011 * var14) + 20);
                class9.field149.method62(var2 + var1 - class9.field149.field2007, class9.field149.field2011 * var14 + var3 + 20);
            }
            class118.field1905.method59(var1, var3 + var4 - class118.field1905.field2011);
            class118.field1905.method62(var1 + var2 - class118.field1905.field2007, -class118.field1905.field2011 + var4 + var3);
        }
        for (int var15 = 0; var15 < class65.field1062; var15++) {
            int var16 = class9.field147;
            int var17 = (class65.field1062 - (var15 + 1)) * 15 + var3 + 35;
            if (var8 > var1 && var8 < var1 + var2 && (var17 - 13) < var7 && var7 < (var17 + 3)) {
                var16 = class220.field3520;
            }
            class95.field1558.method1029(class215.method1559(false, var15), var1 + 3, var17, var16, 0);
        }
        class270.method1948(class169.field2626, (byte) -105, class316.field4931, class76.field1168, class217.field3485);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ILvi;IIIIIZI)V", line = 1571)
    public static final void method1546(int arg0, class6 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
        int var9 = arg3 & 0x3;
        field3402++;
        int var10;
        int var11;
        if (var9 == 1 || var9 == 3) {
            var11 = arg1.field63;
            var10 = arg1.field90;
        } else {
            var10 = arg1.field63;
            var11 = arg1.field90;
        }
        int var12;
        int var13;
        if ((arg4 + var10) <= 104) {
            var12 = arg4 + (var10 >> 1);
            var13 = arg4 + (var10 + 1 >> 1);
        } else {
            var13 = arg4 + 1;
            var12 = arg4;
        }
        int var14 = (arg4 << 7) + (var10 << 6);
        int var15 = (arg8 << 7) + (var11 << 6);
        int[][] var16 = class29.field475[arg0];
        int var17;
        int var18;
        if (arg8 + var11 <= 104) {
            var17 = (var11 >> 1) + arg8;
            var18 = (var11 + 1 >> 1) + arg8;
        } else {
            var18 = arg8 + 1;
            var17 = arg8;
        }
        int var19 = var16[var12][var17] + var16[var13][var17] + var16[var13][var18] + var16[var12][var18] >> 2;
        int var20 = 0;
        if (arg0 != 0) {
            int[][] var21 = class29.field475[0];
            var20 = var19 - (var21[var12][var18] + var21[var13][var17] + var21[var13][var18] + var21[var12][var17] >> 2);
        }
        int[][] var22 = (int[][]) null;
        if (arg0 < 3) {
            var22 = class29.field475[arg0 + 1];
        }
        class293 var23 = arg1.method27(var19, false, arg7, 20558, (class315) null, arg3, var22, var14, var15, arg2, var16);
        class69.method519(var23.field4615, var14 - arg5, var20, var15 - arg6);
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(B)V", line = 1652)
    public static void method1547(byte arg0) {
        if (arg0 == 52) {
            field3401 = null;
            field3400 = null;
        }
    }
}
