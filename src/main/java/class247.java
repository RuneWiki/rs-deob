import jaclib.memory.Stream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class247 extends class148 {

    @OriginalMember(owner = "client!eo", name = "Eb", descriptor = "S")
    public static short field3552 = 32767;

    @OriginalMember(owner = "client!eo", name = "Cb", descriptor = "I")
    public static int field3550;

    @OriginalMember(owner = "client!eo", name = "Db", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!eo", name = "Fb", descriptor = "I")
    public static int field3553;

    @OriginalMember(owner = "client!eo", name = "Gb", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(ZF)V", line = 5)
    public final void method1563(boolean arg0, float arg1) {
        ++field3554;
        if (!arg0) {
            this.method1563(true, -1.7629491F);
        }
        int var3 = Stream.floatToRawIntBits(arg1);
        super.field2146[super.field2177++] = (byte) var3;
        super.field2146[super.field2177++] = (byte) (var3 >> 8);
        super.field2146[super.field2177++] = (byte) (var3 >> 16);
        super.field2146[super.field2177++] = (byte) (var3 >> 24);
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IF)V", line = 21)
    public final void method1564(int arg0, float arg1) {
        ++field3550;
        if (arg0 != 0) {
            this.method1564(124, 0.068141825F);
        }
        int var3 = Stream.floatToRawIntBits(arg1);
        super.field2146[super.field2177++] = (byte) (var3 >> 24);
        super.field2146[super.field2177++] = (byte) (var3 >> 16);
        super.field2146[super.field2177++] = (byte) (var3 >> 8);
        super.field2146[super.field2177++] = (byte) var3;
    }

    @OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(I)V", line = 41)
    public class247(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!eo", name = "x", descriptor = "(I)Z", line = 45)
    public static final boolean method1565(int arg0) throws IOException {
        ++field3551;
        if (class296.field4075 == null) {
            return false;
        } else {
            if (class234.field3399 == null) {
                if (class643.field9368) {
                    if (!class296.field4075.method1831(false, 1)) {
                        return false;
                    }
                    class296.field4075.method1833(1, (byte) 3, class632.field9278.field2146, 0);
                    class554.field8256 = 0;
                    class643.field9368 = false;
                    ++class390.field5378;
                }
                class632.field9278.field2177 = 0;
                if (class632.field9278.method3415(112)) {
                    if (!class296.field4075.method1831(false, 1)) {
                        return false;
                    }
                    class296.field4075.method1833(1, (byte) 3, class632.field9278.field2146, 1);
                    class554.field8256 = 0;
                    ++class390.field5378;
                }
                class643.field9368 = true;
                class144[] var1 = class459.method2784(-78);
                int var2 = class632.field9278.method3422(811664354);
                if (var2 < 0 || var2 >= var1.length) {
                    throw new IOException("invo:" + var2 + " ip:" + class632.field9278.field2177);
                }
                class234.field3399 = var1[var2];
                class333.field4615 = class234.field3399.field2012;
            }
            if (class333.field4615 == -1) {
                if (!class296.field4075.method1831(false, 1)) {
                    return false;
                }
                class296.field4075.method1833(1, (byte) 3, class632.field9278.field2146, 0);
                ++class390.field5378;
                class333.field4615 = 255 & class632.field9278.field2146[0];
                class554.field8256 = 0;
            }
            if (class333.field4615 == -2) {
                if (!class296.field4075.method1831(false, 2)) {
                    return false;
                }
                class296.field4075.method1833(2, (byte) 3, class632.field9278.field2146, 0);
                class632.field9278.field2177 = 0;
                class333.field4615 = class632.field9278.method1045(true);
                class390.field5378 += 2;
                class554.field8256 = 0;
            }
            if (class333.field4615 > 0) {
                if (!class296.field4075.method1831(false, class333.field4615)) {
                    return false;
                }
                class632.field9278.field2177 = 0;
                class296.field4075.method1833(class333.field4615, (byte) 3, class632.field9278.field2146, 0);
                class554.field8256 = 0;
                class390.field5378 += class333.field4615;
            }
            class383.field5272 = class564.field8360;
            class564.field8360 = class482.field6884;
            class482.field6884 = class234.field3399;
            if (class234.field3399 == class221.field3207) {
                class311.field4286 = 1;
                class234.field3399 = null;
                class433.field5800 = class226.field3283;
                return true;
            } else if (class494.field7038 == class234.field3399) {
                int var3 = class632.field9278.method1024(-253);
                int var4 = class632.field9278.method1045(true);
                int var5 = class632.field9278.method1016(-128);
                int var6 = class632.field9278.method1038(-126);
                int var7 = class632.field9278.method1024(-253);
                if (class208.method1380(var5, 28152)) {
                    class267.method1693(var3, var4, var7, var6, 8);
                }
                class234.field3399 = null;
                return true;
            } else if (class234.field3399 == class192.field2849) {
                boolean var8 = class632.field9278.method1032((byte) -33) == 1;
                String var9 = class632.field9278.method1023(-29153);
                String var10 = var9;
                if (var8) {
                    var10 = class632.field9278.method1023(-29153);
                }
                long var11 = class632.field9278.method1004((byte) 101);
                long var13 = (long) class632.field9278.method1045(true);
                long var15 = (long) class632.field9278.method1028((byte) 123);
                int var17 = class632.field9278.method1032((byte) -33);
                int var18 = class632.field9278.method1045(true);
                long var19 = (var13 << 32) + var15;
                boolean var21 = false;
                int var22 = 0;
                while (true) {
                    if (~var22 <= -101) {
                        if (var17 <= 1 && class190.method1305(var10, (byte) -72)) {
                            var21 = true;
                        }
                        break;
                    }
                    if (~class645.field9390[var22] == ~var19) {
                        var21 = true;
                        break;
                    }
                    ++var22;
                }
                if (!var21 && class193.field2862 == 0) {
                    class645.field9390[class605.field9001] = var19;
                    class605.field9001 = (class605.field9001 + 1) % 100;
                    String var23 = class192.field2857.method275(var18, -6).method169(false, class632.field9278);
                    if (var17 == 2) {
                        class253.method1627("<img=1>" + var10, class221.method1434((byte) -76, var11), var23, "<img=1>" + var9, 0, 0, 20, var18);
                    } else if (var17 == 1) {
                        class253.method1627("<img=0>" + var10, class221.method1434((byte) -75, var11), var23, "<img=0>" + var9, 0, 0, 20, var18);
                    } else {
                        class253.method1627(var10, class221.method1434((byte) -92, var11), var23, var9, 0, 0, 20, var18);
                    }
                }
                class234.field3399 = null;
                return true;
            } else if (class83.field1193 == class234.field3399) {
                int var24 = class632.field9278.method1045(true);
                int var25 = class632.field9278.method1045(true);
                int var26 = class632.field9278.method1045(true);
                int var27 = class632.field9278.method1045(true);
                if (class208.method1380(var24, 28152) && class302.field4135[var25] != null) {
                    for (int var28 = var26; ~var27 < ~var28; ++var28) {
                        int var29 = class632.field9278.method1028((byte) 123);
                        if (~class302.field4135[var25].length < ~var28 && class302.field4135[var25][var28] != null) {
                            class302.field4135[var25][var28].field2436 = var29;
                        }
                    }
                }
                class234.field3399 = null;
                return true;
            } else if (class296.field4072 == class234.field3399) {
                String var30 = class632.field9278.method1023(-29153);
                int var31 = class632.field9278.method1045(true);
                String var32 = class192.field2857.method275(var31, -6).method169(false, class632.field9278);
                class253.method1627(var30, (String) null, var32, var30, 0, 0, 19, var31);
                class234.field3399 = null;
                return true;
            } else if (class431.field5777 == class234.field3399) {
                class427.field5749 = class632.field9278.method1033((byte) -13) << 3;
                class354.field4816 = class632.field9278.method1052((byte) 110) << 3;
                class616.field9113 = class632.field9278.method1061(-127);
                while (class632.field9278.field2177 < class333.field4615) {
                    class378 var33 = class457.method2772(false)[class632.field9278.method1032((byte) -33)];
                    class435.method2540((byte) -48, var33);
                }
                class234.field3399 = null;
                return true;
            } else if (class32.field396 == class234.field3399) {
                class403.field5510 = class632.field9278.method1005(11022);
                client.field3639 = class632.field9278.method1032((byte) -33);
                class234.field3399 = null;
                return true;
            } else if (class423.field5706 == class234.field3399) {
                class435.method2540((byte) -93, class61.field765);
                class234.field3399 = null;
                return true;
            } else if (class490.field6979 == class234.field3399) {
                int var34 = class632.field9278.method1045(true);
                if (class208.method1380(var34, 28152)) {
                    class480.method2890(0);
                }
                class234.field3399 = null;
                return true;
            } else if (class234.field3399 == class170.field2649) {
                int var35 = class632.field9278.method1024(-253);
                int var36 = class632.field9278.method1038(-120);
                int var37 = class632.field9278.method1016(124);
                if (class208.method1380(var35, 28152)) {
                    class459.method2783(var37, 116, var36);
                }
                class234.field3399 = null;
                return true;
            } else if (class626.field9222 == class234.field3399) {
                class328.field4536 = class62.method406((byte) 117, class632.field9278.method1032((byte) -33));
                class234.field3399 = null;
                return true;
            } else if (class234.field3399 == class230.field3366) {
                class435.method2540((byte) -46, class405.field5535);
                class234.field3399 = null;
                return true;
            } else if (class344.field4743 == class234.field3399) {
                class435.method2540((byte) -63, class384.field5285);
                class234.field3399 = null;
                return true;
            } else if (class587.field8699 == class234.field3399) {
                int var38 = class632.field9278.method1018(false);
                int var39 = class632.field9278.method1042((byte) 113);
                int var40 = class632.field9278.method1032((byte) -33);
                int var41 = class632.field9278.method1016(18);
                int var42 = class632.field9278.method1024(-253);
                boolean var43 = (var40 & 128) != 0;
                if (~(var38 >> 30) == -1) {
                    if (var38 >> 29 == 0) {
                        if (var38 >> 28 != 0) {
                            int var44 = 65535 & var38;
                            class373 var45;
                            if (~class183.field2758 != ~var44) {
                                var45 = class293.field4036[var44];
                            } else {
                                var45 = class541.field8119;
                            }
                            if (var45 != null) {
                                if (~var41 == -65536) {
                                    var41 = -1;
                                }
                                boolean var46 = true;
                                int var47 = var43 ? var45.field1935 : var45.field1912;
                                if (~var41 != 0 && ~var47 != 0) {
                                    if (~var41 == ~var47) {
                                        class389 var48 = class59.field742.method863(var41, (byte) -124);
                                        if (var48.field5352 && var48.field5357 != -1) {
                                            class78 var49 = class463.field6521.method2983(var48.field5357, -116);
                                            int var50 = var49.field1056;
                                            if (var50 != 0 && var50 != 2) {
                                                if (var50 == 1) {
                                                    var46 = true;
                                                }
                                            } else {
                                                var46 = false;
                                            }
                                        }
                                    } else {
                                        class389 var51 = class59.field742.method863(var41, (byte) -126);
                                        class389 var52 = class59.field742.method863(var47, (byte) -120);
                                        if (~var51.field5357 != 0 && ~var52.field5357 != 0) {
                                            class78 var53 = class463.field6521.method2983(var51.field5357, -121);
                                            class78 var54 = class463.field6521.method2983(var52.field5357, -119);
                                            if (var53.field1042 < var54.field1042) {
                                                var46 = false;
                                            }
                                        }
                                    }
                                }
                                if (var46) {
                                    if (var43) {
                                        var45.field1877 = 0;
                                        var45.field1936 = 7 & var40;
                                        var45.field1935 = var41;
                                        var45.field1903 = 1;
                                        var45.field1873 = var42;
                                        var45.field1860 = 0;
                                        var45.field1929 = class617.field9123 + var39;
                                        if (var45.field1935 == 65535) {
                                            var45.field1935 = -1;
                                        }
                                        if (var45.field1929 > class617.field9123) {
                                            var45.field1877 = -1;
                                        }
                                        if (var45.field1935 != -1 && ~class617.field9123 == ~var45.field1929) {
                                            int var55 = class59.field742.method863(var45.field1935, (byte) -117).field5357;
                                            if (~var55 != 0) {
                                                class78 var56 = class463.field6521.method2983(var55, -127);
                                                if (var56 != null && var56.field1035 != null) {
                                                    class163.method1179(-1721201176, var45.field8496, var56, class541.field8119 == var45, var45.field8501, var45.field8500, 0);
                                                }
                                            }
                                        }
                                    } else {
                                        var45.field1861 = 0;
                                        var45.field1912 = var41;
                                        var45.field1863 = 0;
                                        var45.field1941 = var42;
                                        var45.field1854 = 1;
                                        var45.field1890 = class617.field9123 + var39;
                                        var45.field1884 = 7 & var40;
                                        if (var45.field1912 == 65535) {
                                            var45.field1912 = -1;
                                        }
                                        if (~var45.field1890 < ~class617.field9123) {
                                            var45.field1863 = -1;
                                        }
                                        if (var45.field1912 != -1 && ~class617.field9123 == ~var45.field1890) {
                                            int var57 = class59.field742.method863(var45.field1912, (byte) -117).field5357;
                                            if (var57 != -1) {
                                                class78 var58 = class463.field6521.method2983(var57, -106);
                                                if (var58 != null && var58.field1035 != null) {
                                                    class163.method1179(-1721201176, var45.field8496, var58, class541.field8119 == var45, var45.field8501, var45.field8500, 0);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        int var59 = 65535 & var38;
                        class505 var60 = (class505) class510.field7260.method2799((long) var59, true);
                        if (var60 != null) {
                            class571 var61 = var60.field7148;
                            if (~var41 == -65536) {
                                var41 = -1;
                            }
                            boolean var62 = true;
                            int var63 = !var43 ? var61.field1912 : var61.field1935;
                            if (var41 != -1 && ~var63 != 0) {
                                if (var41 != var63) {
                                    class389 var64 = class59.field742.method863(var41, (byte) -126);
                                    class389 var65 = class59.field742.method863(var63, (byte) -125);
                                    if (~var64.field5357 != 0 && ~var65.field5357 != 0) {
                                        class78 var66 = class463.field6521.method2983(var64.field5357, -124);
                                        class78 var67 = class463.field6521.method2983(var65.field5357, -117);
                                        if (~var67.field1042 < ~var66.field1042) {
                                            var62 = false;
                                        }
                                    }
                                } else {
                                    class389 var68 = class59.field742.method863(var41, (byte) -123);
                                    if (var68.field5352 && ~var68.field5357 != 0) {
                                        class78 var69 = class463.field6521.method2983(var68.field5357, -125);
                                        int var70 = var69.field1056;
                                        if (var70 != 0 && ~var70 != -3) {
                                            if (var70 == 1) {
                                                var62 = true;
                                            }
                                        } else {
                                            var62 = false;
                                        }
                                    }
                                }
                            }
                            if (var62) {
                                if (var43) {
                                    var61.field1877 = 0;
                                    var61.field1873 = var42;
                                    var61.field1935 = var41;
                                    var61.field1936 = var40 & 7;
                                    var61.field1903 = 1;
                                    var61.field1860 = 0;
                                    var61.field1929 = class617.field9123 + var39;
                                    if (~class617.field9123 > ~var61.field1929) {
                                        var61.field1877 = -1;
                                    }
                                    if (~var61.field1935 != 0 && ~class617.field9123 == ~var61.field1929) {
                                        int var71 = class59.field742.method863(var61.field1935, (byte) -123).field5357;
                                        if (~var71 != 0) {
                                            class78 var72 = class463.field6521.method2983(var71, -107);
                                            if (var72 != null && var72.field1035 != null) {
                                                class163.method1179(-1721201176, var61.field8496, var72, false, var61.field8501, var61.field8500, 0);
                                            }
                                        }
                                    }
                                } else {
                                    var61.field1861 = 0;
                                    var61.field1912 = var41;
                                    var61.field1941 = var42;
                                    var61.field1884 = var40 & 7;
                                    var61.field1854 = 1;
                                    var61.field1890 = class617.field9123 + var39;
                                    var61.field1863 = 0;
                                    if (~var61.field1890 < ~class617.field9123) {
                                        var61.field1863 = -1;
                                    }
                                    if (var61.field1912 != -1 && class617.field9123 == var61.field1890) {
                                        int var73 = class59.field742.method863(var61.field1912, (byte) -124).field5357;
                                        if (var73 != -1) {
                                            class78 var74 = class463.field6521.method2983(var73, -128);
                                            if (var74 != null && var74.field1035 != null) {
                                                class163.method1179(-1721201176, var61.field8496, var74, false, var61.field8501, var61.field8500, 0);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    int var75 = (var38 & 1067064060) >> 28;
                    int var76 = ((268425912 & var38) >> 14) + -class473.field6687;
                    int var77 = (16383 & var38) + -class38.field463;
                    if (var76 >= 0 && var77 >= 0 && ~var76 > ~class146.field2125 && ~class410.field5609 < ~var77) {
                        int var78 = var76 * 128 + 64;
                        int var79 = var77 * 128 - -64;
                        int var80 = var75;
                        if (~var75 > -4 && class111.method815(var76, (byte) 93, var77)) {
                            var80 = var75 + 1;
                        }
                        class488 var81 = new class488(var41, 0, class617.field9123, var75, var80, var78, class132.method919(var75, var79, var78, (byte) -82) + -var42, var79, var76, var76, var77, var77, var40);
                        class33.field397.method131(new class580(var81), 0);
                    }
                }
                class234.field3399 = null;
                return true;
            } else if (class510.field7255 == class234.field3399) {
                int var82 = class632.field9278.method1016(126);
                if (var82 == 65535) {
                    var82 = -1;
                }
                int var83 = class632.field9278.method1038(38);
                int var84 = class632.field9278.method1042((byte) 109);
                if (~var84 == -65536) {
                    var84 = -1;
                }
                int var85 = class632.field9278.method1016(124);
                int var86 = class632.field9278.method1015(-252);
                if (class208.method1380(var85, 28152)) {
                    for (int var87 = var84; var82 >= var87; ++var87) {
                        long var88 = ((long) var83 << 32) + (long) var87;
                        class625 var90 = (class625) class494.field7036.method2799(var88, true);
                        class625 var91;
                        if (var90 == null) {
                            if (var87 != -1) {
                                var91 = new class625(var86, -1);
                            } else {
                                var91 = new class625(var86, class153.method1117(var83, -30170).field2543.field9205);
                            }
                        } else {
                            var91 = new class625(var86, var90.field9205);
                            var90.method2457(-8422);
                        }
                        class494.field7036.method2797(-4234, var91, var88);
                    }
                }
                class234.field3399 = null;
                return true;
            } else if (class477.field6766 == class234.field3399) {
                class556.field8280.method2293(8066);
                class103.field1481 += 32;
                class234.field3399 = null;
                return true;
            } else if (class449.field6293 == class234.field3399) {
                int var92 = class632.field9278.method1046((byte) -43);
                int var93 = class632.field9278.method1005(11022);
                int var94 = class632.field9278.method1042((byte) 122);
                if (~var94 == -65536) {
                    var94 = -1;
                }
                class270.method1706(true, var94, var92, var93);
                class234.field3399 = null;
                return true;
            } else if (class291.field4027 == class234.field3399) {
                int var95 = class632.field9278.method1042((byte) 103);
                if (~var95 == -65536) {
                    var95 = -1;
                }
                int var96 = class632.field9278.method1046((byte) -43);
                int var97 = class632.field9278.method1065(-42);
                class468.method2822(var96, var95, var97, 24277);
                class234.field3399 = null;
                return true;
            } else if (class234.field3399 == class187.field2790) {
                boolean var98 = class632.field9278.method1032((byte) -33) == 1;
                String var99 = class632.field9278.method1023(-29153);
                String var100 = var99;
                if (var98) {
                    var100 = class632.field9278.method1023(-29153);
                }
                long var101 = (long) class632.field9278.method1045(true);
                long var103 = (long) class632.field9278.method1028((byte) 123);
                int var105 = class632.field9278.method1032((byte) -33);
                long var106 = (var101 << 32) + var103;
                boolean var108 = false;
                int var109 = 0;
                while (true) {
                    if (~var109 <= -101) {
                        if (~var105 >= -2) {
                            if ((!class266.field3763 || class510.field7259) && !class228.field3340) {
                                if (class190.method1305(var100, (byte) -72)) {
                                    var108 = true;
                                }
                            } else {
                                var108 = true;
                            }
                        }
                        break;
                    }
                    if (~class645.field9390[var109] == ~var106) {
                        var108 = true;
                        break;
                    }
                    ++var109;
                }
                if (!var108 && ~class193.field2862 == -1) {
                    class645.field9390[class605.field9001] = var106;
                    class605.field9001 = (class605.field9001 + 1) % 100;
                    String var110 = class438.method2552(0, class518.method3067(class632.field9278, (byte) 125));
                    if (var105 != 2) {
                        if (var105 == 1) {
                            class253.method1627("<img=0>" + var100, (String) null, var110, "<img=0>" + var99, 0, 0, 7, -1);
                        } else {
                            class253.method1627(var100, (String) null, var110, var99, 0, 0, 3, -1);
                        }
                    } else {
                        class253.method1627("<img=1>" + var100, (String) null, var110, "<img=1>" + var99, 0, 0, 7, -1);
                    }
                }
                class234.field3399 = null;
                return true;
            } else if (class616.field9111 == class234.field3399) {
                String var111 = class632.field9278.method1023(-29153);
                boolean var112 = class632.field9278.method1032((byte) -33) == 1;
                String var113;
                if (!var112) {
                    var113 = var111;
                } else {
                    var113 = class632.field9278.method1023(-29153);
                }
                int var114 = class632.field9278.method1045(true);
                byte var115 = class632.field9278.method1062(-21188);
                boolean var116 = false;
                if (~var115 == 127) {
                    var116 = true;
                }
                if (!var116) {
                    String var117 = class632.field9278.method1023(-29153);
                    class138 var118 = new class138();
                    var118.field1971 = var113;
                    var118.field1967 = var111;
                    var118.field1969 = class533.method3214(-1, var118.field1971);
                    var118.field1964 = var117;
                    var118.field1965 = var115;
                    var118.field1963 = var114;
                    int var119;
                    for (var119 = class125.field1764 + -1; ~var119 <= -1; --var119) {
                        int var120 = class455.field6428[var119].field1969.compareTo(var118.field1969);
                        if (var120 == 0) {
                            class455.field6428[var119].field1963 = var114;
                            class455.field6428[var119].field1965 = var115;
                            class455.field6428[var119].field1964 = var117;
                            if (var113.equals(class541.field8119.field5138)) {
                                class289.field4021 = var115;
                            }
                            class234.field3399 = null;
                            class188.field2804 = class226.field3283;
                            return true;
                        }
                        if (var120 < 0) {
                            break;
                        }
                    }
                    if (class455.field6428.length <= class125.field1764) {
                        class234.field3399 = null;
                        return true;
                    }
                    for (int var121 = class125.field1764 + -1; var121 > var119; --var121) {
                        class455.field6428[var121 + 1] = class455.field6428[var121];
                    }
                    if (class125.field1764 == 0) {
                        class455.field6428 = new class138[100];
                    }
                    class455.field6428[var119 + 1] = var118;
                    ++class125.field1764;
                    if (var113.equals(class541.field8119.field5138)) {
                        class289.field4021 = var115;
                    }
                } else {
                    if (~class125.field1764 == -1) {
                        class234.field3399 = null;
                        return true;
                    }
                    boolean var122 = false;
                    int var123;
                    for (var123 = 0; ~var123 > ~class125.field1764 && (!class455.field6428[var123].field1971.equals(var113) || class455.field6428[var123].field1963 != var114); ++var123) {
                    }
                    if (var123 < class125.field1764) {
                        while (~var123 > ~(class125.field1764 + -1)) {
                            class455.field6428[var123] = class455.field6428[var123 + 1];
                            ++var123;
                        }
                        --class125.field1764;
                        class455.field6428[class125.field1764] = null;
                    }
                }
                class188.field2804 = class226.field3283;
                class234.field3399 = null;
                return true;
            } else if (class234.field3399 == class157.field2335) {
                int var124 = class632.field9278.method1015(-252);
                int var125 = class632.field9278.method1045(true);
                if (~var125 == -65536) {
                    var125 = -1;
                }
                int var126 = class632.field9278.method1045(true);
                int var127 = class632.field9278.method1042((byte) 122);
                if (~var127 == -65536) {
                    var127 = -1;
                }
                int var128 = class632.field9278.method1042((byte) 126);
                if (class208.method1380(var128, 28152)) {
                    for (int var129 = var127; ~var125 <= ~var129; ++var129) {
                        long var130 = ((long) var124 << 32) + (long) var129;
                        class625 var132 = (class625) class494.field7036.method2799(var130, true);
                        class625 var133;
                        if (var132 != null) {
                            var133 = new class625(var132.field9207, var126);
                            var132.method2457(-8422);
                        } else if (~var129 != 0) {
                            var133 = new class625(0, var126);
                        } else {
                            var133 = new class625(class153.method1117(var124, -30170).field2543.field9207, var126);
                        }
                        class494.field7036.method2797(-4234, var133, var130);
                    }
                }
                class234.field3399 = null;
                return true;
            } else if (class289.field4017 == class234.field3399) {
                class435.method2540((byte) -88, class216.field3171);
                class234.field3399 = null;
                return true;
            } else if (class242.field3467 == class234.field3399) {
                class33.field402 = class632.field9278.method1032((byte) -33);
                for (int var134 = 0; var134 < class33.field402; ++var134) {
                    class470.field6634[var134] = class632.field9278.method1023(-29153);
                    class380.field5229[var134] = class632.field9278.method1023(-29153);
                    if (class380.field5229[var134].equals("")) {
                        class380.field5229[var134] = class470.field6634[var134];
                    }
                    class59.field744[var134] = class632.field9278.method1023(-29153);
                    class78.field1058[var134] = class632.field9278.method1023(-29153);
                    if (class78.field1058[var134].equals("")) {
                        class78.field1058[var134] = class59.field744[var134];
                    }
                    class643.field9366[var134] = false;
                }
                class433.field5800 = class226.field3283;
                class234.field3399 = null;
                return true;
            } else if (class558.field8299 == class234.field3399) {
                int var135 = class632.field9278.method1045(true);
                int var136 = class632.field9278.method1032((byte) -33);
                boolean var137 = (var136 & 1) == 1;
                while (class632.field9278.field2177 < class333.field4615) {
                    int var138 = class632.field9278.method1055(1957696096);
                    int var139 = class632.field9278.method1045(true);
                    int var140 = 0;
                    if (var139 != 0) {
                        var140 = class632.field9278.method1032((byte) -33);
                        if (var140 == 255) {
                            var140 = class632.field9278.method1026(-917302120);
                        }
                    }
                    class348.method2109(-1, var140, var137, var135, var138, var139 - 1);
                }
                class282.field3950[class37.method245(class216.field3175++, 31)] = var135;
                class234.field3399 = null;
                return true;
            } else if (class415.field5635 == class234.field3399) {
                class120.method861(class210.field3101, -98);
                class234.field3399 = null;
                return false;
            } else if (class494.field7035 == class234.field3399) {
                for (int var141 = 0; class293.field4036.length > var141; ++var141) {
                    if (class293.field4036[var141] != null) {
                        class293.field4036[var141].field1872 = -1;
                    }
                }
                for (int var142 = 0; var142 < class599.field8840; ++var142) {
                    class57.field718[var142].field7148.field1872 = -1;
                }
                class234.field3399 = null;
                return true;
            } else if (class320.field4419 == class234.field3399) {
                class435.method2540((byte) -93, class68.field863);
                class234.field3399 = null;
                return true;
            } else if (class528.field7894 == class234.field3399) {
                int var143 = class632.field9278.method1055(1957696096);
                int var144 = class632.field9278.method1026(-917302120);
                int var145 = class632.field9278.method1032((byte) -33);
                String var146 = "";
                String var147 = var146;
                if (~(var145 & 1) != -1) {
                    var146 = class632.field9278.method1023(-29153);
                    if (~(2 & var145) == -1) {
                        var147 = var146;
                    } else {
                        var147 = class632.field9278.method1023(-29153);
                    }
                }
                String var148 = class632.field9278.method1023(-29153);
                if (~var143 != -100) {
                    if (!var147.equals("") && class190.method1305(var147, (byte) -72)) {
                        class234.field3399 = null;
                        return true;
                    }
                    class336.method2053(var146, var147, var143, 87, var144, var148);
                } else {
                    class393.method2337(var148, 1);
                }
                class234.field3399 = null;
                return true;
            } else if (class234.field3399 == class161.field2381) {
                int var149 = class632.field9278.method1016(-78);
                int var150 = class632.field9278.method1016(124);
                int var151 = class632.field9278.method1026(-917302120);
                if (class208.method1380(var149, 28152)) {
                    class267.method1695(var150, 3191, var151);
                }
                class234.field3399 = null;
                return true;
            } else if (class316.field4349 == class234.field3399) {
                int var152 = class632.field9278.method1032((byte) -33);
                int var153 = class632.field9278.method1032((byte) -33);
                int var154 = class632.field9278.method1015(-252);
                class275.field3862[var152] = var154;
                class533.field7940[var152] = var153;
                class158.field2359[var152] = 1;
                int var155 = class617.field9118[var152] + -1;
                for (int var156 = 0; ~var156 > ~var155; ++var156) {
                    if (~class63.field791[var156] >= ~var154) {
                        class158.field2359[var152] = var156 + 2;
                    }
                }
                class406.field5553[class37.method245(31, class240.field3448++)] = var152;
                class234.field3399 = null;
                return true;
            } else if (class234.field3399 == class183.field2750) {
                class188.field2804 = class226.field3283;
                if (class333.field4615 == 0) {
                    class499.field7078 = null;
                    class210.field3106 = null;
                    class234.field3399 = null;
                    class455.field6428 = null;
                    class125.field1764 = 0;
                    return true;
                } else {
                    class210.field3106 = class632.field9278.method1023(-29153);
                    boolean var157 = ~class632.field9278.method1032((byte) -33) == -2;
                    if (var157) {
                        class632.field9278.method1023(-29153);
                    }
                    long var158 = class632.field9278.method1004((byte) 117);
                    class499.field7078 = class217.method1415(var158, -86);
                    class163.field2574 = class632.field9278.method1062(-21188);
                    int var160 = class632.field9278.method1032((byte) -33);
                    if (var160 == 255) {
                        class234.field3399 = null;
                        return true;
                    } else {
                        class125.field1764 = var160;
                        class138[] var161 = new class138[100];
                        for (int var162 = 0; var162 < class125.field1764; ++var162) {
                            var161[var162] = new class138();
                            var161[var162].field1967 = class632.field9278.method1023(-29153);
                            boolean var168 = ~class632.field9278.method1032((byte) -33) == -2;
                            if (!var168) {
                                var161[var162].field1971 = var161[var162].field1967;
                            } else {
                                var161[var162].field1971 = class632.field9278.method1023(-29153);
                            }
                            var161[var162].field1969 = class533.method3214(-1, var161[var162].field1971);
                            var161[var162].field1963 = class632.field9278.method1045(true);
                            var161[var162].field1965 = class632.field9278.method1062(-21188);
                            var161[var162].field1964 = class632.field9278.method1023(-29153);
                            if (var161[var162].field1971.equals(class541.field8119.field5138)) {
                                class289.field4021 = var161[var162].field1965;
                            }
                        }
                        boolean var163 = false;
                        int var164 = class125.field1764;
                        while (~var164 < -1) {
                            boolean var165 = true;
                            --var164;
                            for (int var166 = 0; ~var166 > ~var164; ++var166) {
                                if (var161[var166].field1969.compareTo(var161[var166 + 1].field1969) > 0) {
                                    class138 var167 = var161[var166];
                                    var161[var166] = var161[var166 + 1];
                                    var165 = false;
                                    var161[var166 - -1] = var167;
                                }
                            }
                            if (var165) {
                                break;
                            }
                        }
                        class234.field3399 = null;
                        class455.field6428 = var161;
                        return true;
                    }
                }
            } else if (class300.field4115 == class234.field3399) {
                int var169 = class632.field9278.method1047(0);
                int var170 = class632.field9278.method1026(-917302120);
                int var171 = class632.field9278.method1042((byte) 103);
                int var172 = class632.field9278.method1011(27342);
                if (class208.method1380(var171, 28152)) {
                    class287.method1782(var169, (byte) 82, var172, var170);
                }
                class234.field3399 = null;
                return true;
            } else if (class234.field3399 == class158.field2349) {
                int var173 = class632.field9278.method1018(false);
                int var174 = class632.field9278.method1016(126);
                String var175 = class632.field9278.method1023(-29153);
                if (class208.method1380(var174, 28152)) {
                    class643.method3719(255, var173, var175);
                }
                class234.field3399 = null;
                return true;
            } else if (class96.field1407 == class234.field3399) {
                boolean var176 = class632.field9278.method1032((byte) -33) == 1;
                byte[] var177 = new byte[class333.field4615 + -1];
                class632.field9278.method1060((byte) 123, var177, 0, class333.field4615 + -1);
                class43.method273(var177, var176, -16294);
                class234.field3399 = null;
                return true;
            } else if (class24.field231 == class234.field3399) {
                int var178 = class632.field9278.method1024(-253);
                int var179 = class632.field9278.method1061(-124);
                class556.field8280.method2290(8, var179, var178);
                class234.field3399 = null;
                return true;
            } else if (class435.field5822 == class234.field3399) {
                int var180 = class632.field9278.method1045(true);
                int var181 = class632.field9278.method1038(97);
                int var182 = class632.field9278.method1024(-253);
                if (class208.method1380(var180, 28152)) {
                    class647.method3729(var181, 564038760, var182);
                }
                class234.field3399 = null;
                return true;
            } else if (class641.field9333 == class234.field3399) {
                int var183 = class632.field9278.method1042((byte) 102);
                int var184 = class632.field9278.method1016(123);
                int var185 = class632.field9278.method1024(-253);
                if (class208.method1380(var185, 28152)) {
                    class389.method2323(var184, var183, 127, 0);
                }
                class234.field3399 = null;
                return true;
            } else if (class9.field102 == class234.field3399) {
                class137.method963(class632.field9278.method1023(-29153), 255);
                class234.field3399 = null;
                return true;
            } else if (class473.field6688 == class234.field3399) {
                int var186 = class632.field9278.method1032((byte) -33);
                if (~class632.field9278.method1032((byte) -33) == -1) {
                    class641.field9335[var186] = new class310();
                } else {
                    --class632.field9278.field2177;
                    class641.field9335[var186] = new class310(class632.field9278);
                }
                class234.field3399 = null;
                class466.field6557 = class226.field3283;
                return true;
            } else if (class454.field6422 == class234.field3399) {
                int var187 = class632.field9278.method1016(24);
                int var188 = class632.field9278.method1006((byte) -124);
                int var189 = class632.field9278.method1038(-122);
                if (class208.method1380(var187, 28152)) {
                    class102.method769(var189, var188, 6);
                }
                class234.field3399 = null;
                return true;
            } else if (class377.field5198 == class234.field3399) {
                int var190 = class632.field9278.method1032((byte) -33);
                boolean var191 = ~(var190 & 1) == -2;
                String var192 = class632.field9278.method1023(-29153);
                String var193 = class632.field9278.method1023(-29153);
                if (var193.equals("")) {
                    var193 = var192;
                }
                String var194 = class632.field9278.method1023(-29153);
                String var195 = class632.field9278.method1023(-29153);
                if (var195.equals("")) {
                    var195 = var194;
                }
                if (!var191) {
                    class470.field6634[class33.field402] = var192;
                    class380.field5229[class33.field402] = var193;
                    class59.field744[class33.field402] = var194;
                    class78.field1058[class33.field402] = var195;
                    class643.field9366[class33.field402] = ~class37.method245(2, var190) == -3;
                    ++class33.field402;
                } else {
                    for (int var196 = 0; var196 < class33.field402; ++var196) {
                        if (class380.field5229[var196].equals(var195)) {
                            class470.field6634[var196] = var192;
                            class380.field5229[var196] = var193;
                            class59.field744[var196] = var194;
                            class78.field1058[var196] = var195;
                            break;
                        }
                    }
                }
                class234.field3399 = null;
                class433.field5800 = class226.field3283;
                return true;
            } else if (class306.field4201 == class234.field3399) {
                class352.method2135(class333.field4615, class442.field5896, class632.field9278, 8084);
                class234.field3399 = null;
                return true;
            } else if (class234.field3399 == class212.field3118) {
                byte var197 = class632.field9278.method1033((byte) -13);
                int var198 = class632.field9278.method1016(-101);
                class556.field8280.method2289(false, var198, var197);
                class234.field3399 = null;
                return true;
            } else if (class360.field4897 == class234.field3399) {
                int var199 = class632.field9278.method1042((byte) 107);
                int var200 = class632.field9278.method1015(-252);
                if (class208.method1380(var199, 28152)) {
                    class114.method825(3, -1, -1, var200, 2);
                }
                class234.field3399 = null;
                return true;
            } else if (class361.field4905 == class234.field3399) {
                int var201 = class632.field9278.method1015(-252);
                int var202 = class632.field9278.method1026(-917302120);
                int var203 = class632.field9278.method1042((byte) 116);
                int var204 = class632.field9278.method1024(-253);
                if (~var204 == -65536) {
                    var204 = -1;
                }
                if (class208.method1380(var203, 28152)) {
                    class433.method2529(var201, var202, var204, (byte) -24);
                    class540 var205 = class150.field2242.method3606((byte) -103, var204);
                    class267.method1693(var205.field8035, var205.field8107, var205.field8087, var202, 8);
                    class449.method2717(var205.field8041, -121, var202, var205.field8109, var205.field8103);
                }
                class234.field3399 = null;
                return true;
            } else if (class6.field55 == class234.field3399) {
                int var206 = class632.field9278.method1045(true);
                if (class208.method1380(var206, 28152)) {
                    class44.method279((byte) -47);
                }
                class234.field3399 = null;
                return true;
            } else if (class476.field6737 == class234.field3399) {
                boolean var207 = ~class632.field9278.method1032((byte) -33) == -2;
                String var208 = class632.field9278.method1023(-29153);
                String var209 = var208;
                if (var207) {
                    var209 = class632.field9278.method1023(-29153);
                }
                long var210 = (long) class632.field9278.method1045(true);
                long var212 = (long) class632.field9278.method1028((byte) 123);
                int var214 = class632.field9278.method1032((byte) -33);
                int var215 = class632.field9278.method1045(true);
                long var216 = (var210 << 32) + var212;
                boolean var218 = false;
                int var219 = 0;
                while (true) {
                    if (var219 >= 100) {
                        if (var214 <= 1 && class190.method1305(var209, (byte) -72)) {
                            var218 = true;
                        }
                        break;
                    }
                    if (class645.field9390[var219] == var216) {
                        var218 = true;
                        break;
                    }
                    ++var219;
                }
                if (!var218 && class193.field2862 == 0) {
                    class645.field9390[class605.field9001] = var216;
                    class605.field9001 = (class605.field9001 + 1) % 100;
                    String var220 = class192.field2857.method275(var215, -6).method169(false, class632.field9278);
                    if (var214 == 2) {
                        class253.method1627("<img=1>" + var209, (String) null, var220, "<img=1>" + var208, 0, 0, 18, var215);
                    } else if (~var214 == -2) {
                        class253.method1627("<img=0>" + var209, (String) null, var220, "<img=0>" + var208, 0, 0, 18, var215);
                    } else {
                        class253.method1627(var209, (String) null, var220, var208, 0, 0, 18, var215);
                    }
                }
                class234.field3399 = null;
                return true;
            } else if (class93.field1396 == class234.field3399) {
                class616.field9113 = class632.field9278.method1032((byte) -33);
                class354.field4816 = class632.field9278.method1052((byte) 73) << 3;
                class427.field5749 = class632.field9278.method1062(-21188) << 3;
                class234.field3399 = null;
                return true;
            } else if (class366.field5042 == class234.field3399) {
                class50.method305(2);
                class234.field3399 = null;
                return true;
            } else if (class317.field4371 == class234.field3399) {
                class588.field8727 = class632.field9278.method1032((byte) -33);
                class234.field3399 = null;
                return true;
            } else if (class234.field3399 == class19.field181) {
                class435.method2540((byte) -122, class185.field2771);
                class234.field3399 = null;
                return true;
            } else if (class532.field7935 == class234.field3399) {
                class427.field5749 = class632.field9278.method1033((byte) -13) << 3;
                class616.field9113 = class632.field9278.method1032((byte) -33);
                class354.field4816 = class632.field9278.method1068((byte) -128) << 3;
                for (class85 var221 = (class85) class45.field544.method2798((byte) -49); var221 != null; var221 = (class85) class45.field544.method2806(true)) {
                    int var223 = (int) (3L & var221.field5651 >> 28);
                    int var224 = (int) (var221.field5651 & 16383L);
                    int var225 = var224 - class473.field6687;
                    int var226 = (int) (var221.field5651 >> 14 & 16383L);
                    int var227 = -class38.field463 + var226;
                    if (class616.field9113 == var223 && class354.field4816 <= var225 && var225 < class354.field4816 + 8 && ~var227 <= ~class427.field5749 && ~(class427.field5749 + 8) < ~var227) {
                        var221.method2457(-8422);
                        if (~var225 <= -1 && ~var227 <= -1 && ~class146.field2125 < ~var225 && ~var227 > ~class410.field5609) {
                            class464.method2793(class616.field9113, (byte) 27, var225, var227);
                        }
                    }
                }
                for (class332 var222 = (class332) class306.field4198.method124((byte) 42); var222 != null; var222 = (class332) class306.field4198.method120(39)) {
                    if (var222.field4593 >= class354.field4816 && var222.field4593 < class354.field4816 + 8 && class427.field5749 <= var222.field4584 && class427.field5749 + 8 > var222.field4584 && class616.field9113 == var222.field4588) {
                        var222.field4589 = 0;
                    }
                }
                class234.field3399 = null;
                return true;
            } else if (class234.field3399 == class153.field2309) {
                int var228 = class632.field9278.method1046((byte) -43);
                int var229 = class632.field9278.method1042((byte) 127);
                if (class208.method1380(var229, 28152)) {
                    class136.field1859 = var228;
                }
                class234.field3399 = null;
                return true;
            } else if (class436.field5827 == class234.field3399) {
                while (class333.field4615 > class632.field9278.field2177) {
                    boolean var240 = class632.field9278.method1032((byte) -33) == 1;
                    String var241 = class632.field9278.method1023(-29153);
                    String var242 = class632.field9278.method1023(-29153);
                    int var243 = class632.field9278.method1045(true);
                    int var244 = class632.field9278.method1032((byte) -33);
                    String var245 = "";
                    boolean var246 = false;
                    if (var243 > 0) {
                        var245 = class632.field9278.method1023(-29153);
                        var246 = class632.field9278.method1032((byte) -33) == 1;
                    }
                    for (int var247 = 0; class304.field4180 > var247; ++var247) {
                        if (var240) {
                            if (var242.equals(class538.field8010[var247])) {
                                class538.field8010[var247] = var241;
                                class349.field4781[var247] = var242;
                                var241 = null;
                                break;
                            }
                        } else if (var241.equals(class538.field8010[var247])) {
                            if (class372.field5108[var247] != var243) {
                                boolean var248 = true;
                                for (class626 var249 = (class626) class200.field2941.method2233(true); var249 != null; var249 = (class626) class200.field2941.method2240(16772)) {
                                    if (var249.field9218.equals(var241)) {
                                        if (~var243 != -1 && var249.field9223 == 0) {
                                            var248 = false;
                                            var249.method1783((byte) -116);
                                        } else if (var243 == 0 && var249.field9223 != 0) {
                                            var248 = false;
                                            var249.method1783((byte) -110);
                                        }
                                    }
                                }
                                if (var248) {
                                    class200.field2941.method2241((byte) 66, new class626(var241, var243));
                                }
                                class372.field5108[var247] = var243;
                            }
                            class349.field4781[var247] = var242;
                            class408.field5576[var247] = var245;
                            class285.field3986[var247] = var244;
                            class171.field2668[var247] = var246;
                            var241 = null;
                            break;
                        }
                    }
                    if (var241 != null && class304.field4180 < 200) {
                        class538.field8010[class304.field4180] = var241;
                        class349.field4781[class304.field4180] = var242;
                        class372.field5108[class304.field4180] = var243;
                        class408.field5576[class304.field4180] = var245;
                        class285.field3986[class304.field4180] = var244;
                        class171.field2668[class304.field4180] = var246;
                        ++class304.field4180;
                    }
                }
                class433.field5800 = class226.field3283;
                class311.field4286 = 2;
                boolean var230 = false;
                int var231 = class304.field4180;
                while (~var231 < -1) {
                    boolean var232 = true;
                    --var231;
                    for (int var233 = 0; ~var233 > ~var231; ++var233) {
                        if (~class372.field5108[var233] != ~class286.field3993.field5709 && ~class372.field5108[var233 + 1] == ~class286.field3993.field5709 || ~class372.field5108[var233] == -1 && ~class372.field5108[var233 - -1] != -1) {
                            int var234 = class372.field5108[var233];
                            class372.field5108[var233] = class372.field5108[var233 + 1];
                            class372.field5108[var233 + 1] = var234;
                            String var235 = class408.field5576[var233];
                            class408.field5576[var233] = class408.field5576[var233 - -1];
                            class408.field5576[var233 + 1] = var235;
                            String var236 = class538.field8010[var233];
                            class538.field8010[var233] = class538.field8010[var233 - -1];
                            class538.field8010[var233 + 1] = var236;
                            String var237 = class349.field4781[var233];
                            class349.field4781[var233] = class349.field4781[var233 + 1];
                            class349.field4781[var233 + 1] = var237;
                            int var238 = class285.field3986[var233];
                            class285.field3986[var233] = class285.field3986[var233 - -1];
                            class285.field3986[var233 + 1] = var238;
                            boolean var239 = class171.field2668[var233];
                            class171.field2668[var233] = class171.field2668[var233 + 1];
                            var232 = false;
                            class171.field2668[var233 - -1] = var239;
                        }
                    }
                    if (var232) {
                        break;
                    }
                }
                class234.field3399 = null;
                return true;
            } else if (class40.field480 == class234.field3399) {
                class435.method2540((byte) -127, class166.field2613);
                class234.field3399 = null;
                return true;
            } else if (class604.field8996 == class234.field3399) {
                int var250 = class632.field9278.method1024(-253);
                if (var250 == 65535) {
                    var250 = -1;
                }
                int var251 = class632.field9278.method1032((byte) -33);
                int var252 = var251 >> 2;
                int var253 = 3 & var251;
                int var254 = class480.field6819[var252];
                int var255 = class632.field9278.method1038(9);
                int var256 = (914581071 & var255) >> 28;
                int var257 = var255 >> 14 & 16383;
                int var258 = var255 & 16383;
                int var259 = var257 - class473.field6687;
                int var260 = var258 - class38.field463;
                class237.method1517(var250, var260, var254, var256, var252, var253, 4, var259);
                class234.field3399 = null;
                return true;
            } else if (class282.field3955 == class234.field3399) {
                class49.field574 = class632.field9278.method1029(-64);
                class266.field3763 = class632.field9278.method1032((byte) -33) == 1;
                class234.field3399 = null;
                return true;
            } else if (class38.field461 == class234.field3399) {
                int var261 = class632.field9278.method1045(true);
                if (var261 == 65535) {
                    var261 = -1;
                }
                int var262 = class632.field9278.method1032((byte) -33);
                int var263 = class632.field9278.method1045(true);
                int var264 = class632.field9278.method1032((byte) -33);
                class245.method1550(var261, var264, var263, var262, (byte) 89);
                class234.field3399 = null;
                return true;
            } else if (class537.field8009 == class234.field3399) {
                int var265 = class632.field9278.method1045(true);
                int var266 = class632.field9278.method1032((byte) -33);
                int var267 = class632.field9278.method1032((byte) -33);
                int var268 = class632.field9278.method1045(true) << 0;
                int var269 = class632.field9278.method1032((byte) -33);
                int var270 = class632.field9278.method1032((byte) -33);
                if (class208.method1380(var265, 28152)) {
                    class54.method347(var267, var266, var270, var268, (byte) 116, var269);
                }
                class234.field3399 = null;
                return true;
            } else if (class234.field3399 == class145.field2096) {
                class435.method2540((byte) -107, class605.field8999);
                class234.field3399 = null;
                return true;
            } else if (class437.field5841 == class234.field3399) {
                int var271 = class632.field9278.method1015(-252);
                int var272 = class632.field9278.method1026(-917302120);
                int var273 = class632.field9278.method1024(-253);
                if (class208.method1380(var273, 28152)) {
                    class243 var274 = (class243) class385.field5297.method2799((long) var272, true);
                    class243 var275 = (class243) class385.field5297.method2799((long) var271, true);
                    if (var275 != null) {
                        class321.method1935(false, var275, (byte) 124, var274 == null || var274.field3471 != var275.field3471);
                    }
                    if (var274 != null) {
                        var274.method2457(-8422);
                        class385.field5297.method2797(-4234, var274, (long) var271);
                    }
                    class162 var276 = class153.method1117(var272, -30170);
                    if (var276 != null) {
                        class403.method2371(var276, (byte) -62);
                    }
                    class162 var277 = class153.method1117(var271, -30170);
                    if (var277 != null) {
                        class403.method2371(var277, (byte) -62);
                        class100.method761(var277, -114, true);
                    }
                    if (class340.field4708 != -1) {
                        class541.method3291(3, 1, class340.field4708);
                    }
                }
                class234.field3399 = null;
                return true;
            } else if (class86.field1235 == class234.field3399) {
                class230.field3371 = class632.field9278.method1047(0);
                class564.field8362 = class226.field3283;
                class234.field3399 = null;
                return true;
            } else if (class389.field5372 == class234.field3399) {
                class234.field3399 = null;
                return false;
            } else if (class424.field5737 == class234.field3399) {
                if (class99.field1448 != null) {
                    class622.method3638(-4, false, class56.field668.field6858, -1, -1);
                }
                byte[] var278 = new byte[class333.field4615];
                class632.field9278.method3418(0, var278, class333.field4615, 35);
                String var279 = class174.method1222(0, var278, class333.field4615, -129);
                class505.method2999(var279, class442.field5896, true, ~class526.field7533 == -2, -1);
                class234.field3399 = null;
                return true;
            } else if (class403.field5512 == class234.field3399) {
                int var280 = class632.field9278.method1005(11022);
                int var281 = class632.field9278.method1045(true);
                int var282 = class632.field9278.method1015(-252);
                if (class208.method1380(var281, 28152)) {
                    class510.method3034(var282, var280, (byte) -82);
                }
                class234.field3399 = null;
                return true;
            } else if (class415.field5633 == class234.field3399) {
                class632.field9278.field2177 += 28;
                if (class632.field9278.method1014(-96)) {
                    class332.method2027(class632.field9278.field2177 + -28, class632.field9278, false);
                }
                class234.field3399 = null;
                return true;
            } else if (class588.field8728 == class234.field3399) {
                boolean var283 = ~class632.field9278.method1032((byte) -33) == -2;
                String var284 = class632.field9278.method1023(-29153);
                String var285 = var284;
                if (var283) {
                    var285 = class632.field9278.method1023(-29153);
                }
                int var286 = class632.field9278.method1032((byte) -33);
                boolean var287 = false;
                if (~var286 >= -2) {
                    if ((!class266.field3763 || class510.field7259) && !class228.field3340) {
                        if (var286 <= 1 && class190.method1305(var285, (byte) -72)) {
                            var287 = true;
                        }
                    } else {
                        var287 = true;
                    }
                }
                if (!var287 && ~class193.field2862 == -1) {
                    String var288 = class438.method2552(0, class518.method3067(class632.field9278, (byte) 121));
                    if (~var286 == -3) {
                        class253.method1627("<img=1>" + var285, (String) null, var288, "<img=1>" + var284, 0, 0, 24, -1);
                    } else if (var286 != 1) {
                        class253.method1627(var285, (String) null, var288, var284, 0, 0, 24, -1);
                    } else {
                        class253.method1627("<img=0>" + var285, (String) null, var288, "<img=0>" + var284, 0, 0, 24, -1);
                    }
                }
                class234.field3399 = null;
                return true;
            } else if (class64.field796 == class234.field3399) {
                class467.field6573 = class632.field9278.method1032((byte) -33);
                class564.field8362 = class226.field3283;
                class234.field3399 = null;
                return true;
            } else if (class569.field8392 == class234.field3399) {
                if (!class136.method942(class472.field6670, 6)) {
                    class525.field7521 = class632.field9278.method1045(true) * 30;
                } else {
                    class525.field7521 = (int) ((float) class632.field9278.method1045(true) * 2.5F);
                }
                class234.field3399 = null;
                class564.field8362 = class226.field3283;
                return true;
            } else if (class587.field8693 == class234.field3399) {
                int var289 = class632.field9278.method1045(true);
                int var290 = class632.field9278.method1026(-917302120);
                if (class208.method1380(var289, 28152)) {
                    class243 var291 = (class243) class385.field5297.method2799((long) var290, true);
                    if (var291 != null) {
                        class321.method1935(false, var291, (byte) 53, true);
                    }
                    if (class230.field3374 != null) {
                        class403.method2371(class230.field3374, (byte) -62);
                        class230.field3374 = null;
                    }
                }
                class234.field3399 = null;
                return true;
            } else if (class540.field8082 == class234.field3399) {
                int var292 = class632.field9278.method1045(true);
                int var293 = class632.field9278.method1032((byte) -33);
                boolean var294 = (var293 & 1) == 1;
                class27.method191(var292, (byte) 105, var294);
                int var295 = class632.field9278.method1045(true);
                for (int var296 = 0; var295 > var296; ++var296) {
                    int var297 = class632.field9278.method1005(11022);
                    if (~var297 == -256) {
                        var297 = class632.field9278.method1018(false);
                    }
                    int var298 = class632.field9278.method1024(-253);
                    class348.method2109(-1, var297, var294, var292, var296, var298 + -1);
                }
                class282.field3950[class37.method245(class216.field3175++, 31)] = var292;
                class234.field3399 = null;
                return true;
            } else if (class234.field3399 == class214.field3162) {
                int var299 = class632.field9278.method1045(true);
                byte var300 = class632.field9278.method1068((byte) -127);
                int var301 = class632.field9278.method1045(true);
                if (class208.method1380(var301, 28152)) {
                    class267.method1695(var299, 3191, var300);
                }
                class234.field3399 = null;
                return true;
            } else if (class596.field8819 == class234.field3399) {
                int var302 = class632.field9278.method1045(true);
                int var303 = class632.field9278.method1024(-253);
                String var304 = class632.field9278.method1023(-29153);
                if (class208.method1380(var303, 28152)) {
                    class236.method1511(var302, var304, 6343);
                }
                class234.field3399 = null;
                return true;
            } else if (class234.field3399 == class162.field2538) {
                class120.method861(false, -70);
                class234.field3399 = null;
                return false;
            } else if (class593.field8767 == class234.field3399) {
                int var305 = class632.field9278.method1046((byte) -43);
                int var306 = class632.field9278.method1042((byte) 120);
                int var307 = class632.field9278.method1042((byte) 100);
                if (class208.method1380(var306, 28152)) {
                    if (~var305 == -3) {
                        class18.method115((byte) -90);
                    }
                    class340.field4708 = var307;
                    class493.method2949(0, var307);
                    class600.method3545(false, false);
                    class98.method746(class340.field4708);
                    for (int var308 = 0; var308 < 100; ++var308) {
                        class104.field1511[var308] = true;
                    }
                }
                class234.field3399 = null;
                return true;
            } else if (class234.field3399 == class190.field2826) {
                boolean var309 = ~class632.field9278.method1032((byte) -33) == -2;
                String var310 = class632.field9278.method1023(-29153);
                String var311 = var310;
                if (var309) {
                    var311 = class632.field9278.method1023(-29153);
                }
                int var312 = class632.field9278.method1032((byte) -33);
                int var313 = class632.field9278.method1045(true);
                boolean var314 = false;
                if (var312 <= 1 && class190.method1305(var311, (byte) -72)) {
                    var314 = true;
                }
                if (!var314 && ~class193.field2862 == -1) {
                    String var315 = class192.field2857.method275(var313, -6).method169(false, class632.field9278);
                    if (~var312 == -3) {
                        class253.method1627("<img=1>" + var311, (String) null, var315, "<img=1>" + var310, 0, 0, 25, var313);
                    } else if (~var312 != -2) {
                        class253.method1627(var311, (String) null, var315, var310, 0, 0, 25, var313);
                    } else {
                        class253.method1627("<img=0>" + var311, (String) null, var315, "<img=0>" + var310, 0, 0, 25, var313);
                    }
                }
                class234.field3399 = null;
                return true;
            } else if (class69.field878 == class234.field3399) {
                class348.field4771 = ~class333.field4615 < -3 ? class632.field9278.method1023(-29153) : class518.field7387.method3408(120, class63.field795);
                class405.field5548 = ~class333.field4615 < -1 ? class632.field9278.method1045(true) : -1;
                if (~class405.field5548 == -65536) {
                    class405.field5548 = -1;
                }
                class234.field3399 = null;
                return true;
            } else if (class64.field798 == class234.field3399) {
                int var316 = class632.field9278.method1045(true);
                int var317 = class632.field9278.method1045(true);
                int var318 = class632.field9278.method1045(true);
                int var319 = class632.field9278.method1026(-917302120);
                if (class208.method1380(var318, 28152)) {
                    class177.method1246((var317 << 16) + var316, var319, -115);
                }
                class234.field3399 = null;
                return true;
            } else if (class447.field6261 == class234.field3399) {
                int var320 = class632.field9278.method1016(-46);
                int var321 = class632.field9278.method1026(-917302120);
                int var322 = class632.field9278.method1045(true);
                if (class208.method1380(var322, 28152)) {
                    class332.method2028(128, var320, var321);
                }
                class234.field3399 = null;
                return true;
            } else if (class234.field3399 == class192.field2851) {
                int var323 = class632.field9278.method1038(-128);
                int var324 = class632.field9278.method1032((byte) -33);
                int var325 = class632.field9278.method1045(true);
                int var326 = class632.field9278.method1045(true);
                if (class208.method1380(var325, 28152)) {
                    class243 var327 = (class243) class385.field5297.method2799((long) var323, true);
                    if (var327 != null) {
                        class321.method1935(false, var327, (byte) 125, ~var327.field3471 != ~var326);
                    }
                    class213.method1402(var323, -4867, var324, var326, false);
                }
                class234.field3399 = null;
                return true;
            } else if (class234.field3399 == class144.field2010) {
                int var328 = class632.field9278.method1032((byte) -33);
                int var329 = var328 >> 5;
                int var330 = var328 & 31;
                if (var330 == 0) {
                    class385.field5293[var329] = null;
                    class234.field3399 = null;
                    return true;
                } else {
                    class190 var331 = new class190();
                    var331.field2821 = var330;
                    var331.field2823 = class632.field9278.method1032((byte) -33);
                    if (var331.field2823 >= 0 && ~class604.field8997.length < ~var331.field2823) {
                        if (var331.field2821 != 1 && var331.field2821 != 10) {
                            if (var331.field2821 >= 2 && ~var331.field2821 >= -7) {
                                if (var331.field2821 == 2) {
                                    var331.field2819 = 64;
                                    var331.field2822 = 64;
                                }
                                if (~var331.field2821 == -4) {
                                    var331.field2819 = 0;
                                    var331.field2822 = 64;
                                }
                                if (var331.field2821 == 4) {
                                    var331.field2822 = 64;
                                    var331.field2819 = 128;
                                }
                                if (var331.field2821 == 5) {
                                    var331.field2819 = 64;
                                    var331.field2822 = 0;
                                }
                                if (var331.field2821 == 6) {
                                    var331.field2819 = 64;
                                    var331.field2822 = 128;
                                }
                                var331.field2821 = 2;
                                var331.field2828 = class632.field9278.method1032((byte) -33);
                                var331.field2819 += class632.field9278.method1045(true) + -class473.field6687 << 7;
                                var331.field2822 += class632.field9278.method1045(true) - class38.field463 << 7;
                                var331.field2817 = class632.field9278.method1032((byte) -33) << 0;
                                var331.field2818 = class632.field9278.method1045(true);
                            }
                        } else {
                            var331.field2824 = class632.field9278.method1045(true);
                            class632.field9278.field2177 += 6;
                        }
                        var331.field2825 = class632.field9278.method1045(true);
                        if (~var331.field2825 == -65536) {
                            var331.field2825 = -1;
                        }
                        class385.field5293[var329] = var331;
                    }
                    class234.field3399 = null;
                    return true;
                }
            } else if (class291.field4030 == class234.field3399) {
                int var332 = class632.field9278.method1045(true);
                if (var332 == 65535) {
                    var332 = -1;
                }
                int var333 = class632.field9278.method1032((byte) -33);
                int var334 = class632.field9278.method1045(true);
                int var335 = class632.field9278.method1032((byte) -33);
                class82.method616(var333, var335, var332, false, var334);
                class234.field3399 = null;
                return true;
            } else if (class354.field4812 == class234.field3399) {
                int var336 = class632.field9278.method1024(-253);
                int var337 = class632.field9278.method1042((byte) 108);
                int var338 = class632.field9278.method1042((byte) 124);
                int var339 = class632.field9278.method1042((byte) 105);
                int var340 = class632.field9278.method1038(-115);
                if (class208.method1380(var337, 28152)) {
                    class114.method825(7, var339 << 16 | var338, var336, var340, 2);
                }
                class234.field3399 = null;
                return true;
            } else if (class234.field3399 == class171.field2654) {
                int var341 = class632.field9278.method1045(true);
                int var342 = class632.field9278.method1038(-119);
                class556.field8280.method2290(8, var342, var341);
                class234.field3399 = null;
                return true;
            } else if (class532.field7936 == class234.field3399) {
                class435.method2540((byte) -55, class164.field2599);
                class234.field3399 = null;
                return true;
            } else if (class424.field5738 == class234.field3399) {
                class341.method2090(0, true);
                class234.field3399 = null;
                return true;
            } else if (class357.field4864 == class234.field3399) {
                class435.method2540((byte) -52, class469.field6624);
                class234.field3399 = null;
                return true;
            } else if (class52.field611 == class234.field3399) {
                if (~class340.field4708 != 0) {
                    class541.method3291(3, 0, class340.field4708);
                }
                class234.field3399 = null;
                return true;
            } else if (class556.field8279 == class234.field3399) {
                class435.method2540((byte) -124, class513.field7308);
                class234.field3399 = null;
                return true;
            } else if (class69.field877 == class234.field3399) {
                int var343 = class632.field9278.method1045(true);
                String var344 = class632.field9278.method1023(-29153);
                Object[] var345 = new Object[var344.length() + 1];
                for (int var346 = var344.length() - 1; ~var346 <= -1; --var346) {
                    if (~var344.charAt(var346) != -116) {
                        var345[var346 + 1] = new Integer(class632.field9278.method1026(-917302120));
                    } else {
                        var345[var346 + 1] = class632.field9278.method1023(-29153);
                    }
                }
                var345[0] = new Integer(class632.field9278.method1026(-917302120));
                if (class208.method1380(var343, 28152)) {
                    class518 var347 = new class518();
                    var347.field7383 = var345;
                    class98.method757(var347);
                }
                class234.field3399 = null;
                return true;
            } else if (class374.field5177 == class234.field3399) {
                class435.method2540((byte) -74, class358.field4870);
                class234.field3399 = null;
                return true;
            } else if (class521.field7433 == class234.field3399) {
                class580.method3468((byte) 38);
                class234.field3399 = null;
                return false;
            } else if (class234.field3399 == class195.field2885) {
                int var348 = class632.field9278.method1016(126);
                int var349 = class632.field9278.method1016(121);
                int var350 = class632.field9278.method1061(-125);
                class505 var351 = (class505) class510.field7260.method2799((long) var348, true);
                if (var351 != null) {
                    class561.method3379(var350, var349, 48, var351.field7148);
                }
                class234.field3399 = null;
                return true;
            } else if (class611.field9061 == class234.field3399) {
                int var352 = class632.field9278.method1026(-917302120);
                int var353 = class632.field9278.method1016(125);
                int var354 = class632.field9278.method1018(false);
                int var355 = class632.field9278.method1045(true);
                if (class208.method1380(var353, 28152)) {
                    class114.method825(5, var355, var354, var352, 2);
                }
                class234.field3399 = null;
                return true;
            } else if (class33.field400 == class234.field3399) {
                String var356 = class632.field9278.method1023(-29153);
                String var357 = class438.method2552(0, class518.method3067(class632.field9278, (byte) 113));
                class336.method2053(var356, var356, 6, 31, 0, var357);
                class234.field3399 = null;
                return true;
            } else if (class234.field3399 == class11.field106) {
                int var358 = class632.field9278.method1061(-128);
                int var359 = class632.field9278.method1032((byte) -33);
                int var360 = class632.field9278.method1042((byte) 99);
                if (var360 == 65535) {
                    var360 = -1;
                }
                String var361 = class632.field9278.method1023(-29153);
                if (var359 >= 1 && ~var359 >= -9) {
                    if (var361.equalsIgnoreCase("null")) {
                        var361 = null;
                    }
                    class228.field3338[var359 + -1] = var361;
                    class48.field566[var359 + -1] = var360;
                    class66.field807[var359 + -1] = var358 == 0;
                }
                class234.field3399 = null;
                return true;
            } else if (class587.field8648 == class234.field3399) {
                class435.method2540((byte) -100, class54.field637);
                class234.field3399 = null;
                return true;
            } else if (class234.field3399 == class115.field1621) {
                class435.method2540((byte) -110, class605.field9000);
                class234.field3399 = null;
                return true;
            } else if (class505.field7146 == class234.field3399) {
                int var362 = class632.field9278.method1026(-917302120);
                class283.field3960 = class442.field5896.method2024(30, var362);
                class234.field3399 = null;
                return true;
            } else if (class83.field1195 == class234.field3399) {
                int var363 = class632.field9278.method1016(-112);
                if (~var363 == -65536) {
                    var363 = -1;
                }
                int var364 = class632.field9278.method1016(121);
                int var365 = class632.field9278.method1026(-917302120);
                if (class208.method1380(var364, 28152)) {
                    class114.method825(1, var363, -1, var365, 2);
                }
                class234.field3399 = null;
                return true;
            } else if (class52.field609 == class234.field3399) {
                int var366 = class632.field9278.method1042((byte) 113);
                if (var366 == 65535) {
                    var366 = -1;
                }
                int var367 = class632.field9278.method1015(-252);
                int var368 = class632.field9278.method1016(121);
                if (class208.method1380(var368, 28152)) {
                    class455.method2768(var367, (byte) -84, var366);
                }
                class234.field3399 = null;
                return true;
            } else if (class3.field27 == class234.field3399) {
                class309.method1890(class632.field9278, (byte) 126, class333.field4615);
                class234.field3399 = null;
                return true;
            } else if (class442.field5894 == class234.field3399) {
                int var369 = class632.field9278.method1046((byte) -43);
                int var370 = class632.field9278.method1061(-125);
                if (var369 == 255) {
                    var369 = -1;
                    var370 = -1;
                }
                class106.method781(var369, var370, 29090);
                class234.field3399 = null;
                return true;
            } else if (class58.field736 == class234.field3399) {
                String var371 = class632.field9278.method1023(-29153);
                int var372 = class632.field9278.method1045(true);
                int var373 = class632.field9278.method1016(122);
                if (class208.method1380(var372, 28152)) {
                    class236.method1511(var373, var371, 6343);
                }
                class234.field3399 = null;
                return true;
            } else if (class526.field7531 == class234.field3399) {
                class435.method2540((byte) -67, class319.field4405);
                class234.field3399 = null;
                return true;
            } else if (class426.field5740 == class234.field3399) {
                class22.method135(4543);
                class234.field3399 = null;
                return false;
            } else {
                if (arg0 > -36) {
                    field3553 = -99;
                }
                if (class234.field3399 == class125.field1756) {
                    int var374 = class632.field9278.method1042((byte) 97);
                    int var375 = class632.field9278.method1045(true);
                    if (var375 == 65535) {
                        var375 = -1;
                    }
                    int var376 = class632.field9278.method1026(-917302120);
                    if (class208.method1380(var374, 28152)) {
                        class114.method825(2, var375, -1, var376, 2);
                    }
                    class234.field3399 = null;
                    return true;
                } else if (class266.field3788 == class234.field3399) {
                    int var377 = class632.field9278.method1026(-917302120);
                    int var378 = class632.field9278.method1042((byte) 123);
                    if (class208.method1380(var378, 28152)) {
                        class114.method825(5, class183.field2758, 0, var377, 2);
                    }
                    class234.field3399 = null;
                    return true;
                } else if (class415.field5637 == class234.field3399) {
                    int var379 = class632.field9278.method1016(121);
                    int var380 = class632.field9278.method1026(-917302120);
                    class556.field8280.method2289(false, var379, var380);
                    class234.field3399 = null;
                    return true;
                } else if (class51.field600 == class234.field3399) {
                    int var381 = class632.field9278.method1045(true);
                    int var382 = class632.field9278.method1032((byte) -33);
                    int var383 = class632.field9278.method1032((byte) -33);
                    int var384 = class632.field9278.method1032((byte) -33);
                    int var385 = class632.field9278.method1032((byte) -33);
                    int var386 = class632.field9278.method1045(true);
                    if (class208.method1380(var381, 28152)) {
                        class345.field4750[var382] = true;
                        class116.field1638[var382] = var383;
                        class642.field9354[var382] = var384;
                        class312.field4311[var382] = var385;
                        class365.field5031[var382] = var386;
                    }
                    class234.field3399 = null;
                    return true;
                } else if (class312.field4310 == class234.field3399) {
                    int var387 = class632.field9278.method1024(-253);
                    int var388 = class632.field9278.method1032((byte) -33);
                    boolean var389 = ~(1 & var388) == -2;
                    class299.method1834(var387, 30000, var389);
                    class282.field3950[class37.method245(class216.field3175++, 31)] = var387;
                    class234.field3399 = null;
                    return true;
                } else if (class234.field3399 == class159.field2367) {
                    class341.method2090(0, false);
                    class234.field3399 = null;
                    return true;
                } else if (class424.field5735 == class234.field3399) {
                    int var390 = class632.field9278.method1045(true);
                    int var391 = class632.field9278.method1032((byte) -33);
                    int var392 = class632.field9278.method1032((byte) -33);
                    int var393 = class632.field9278.method1045(true) << 0;
                    int var394 = class632.field9278.method1032((byte) -33);
                    int var395 = class632.field9278.method1032((byte) -33);
                    if (class208.method1380(var390, 28152)) {
                        class420.method2478(var391, var392, var394, (byte) 117, var395, var393, true);
                    }
                    class234.field3399 = null;
                    return true;
                } else if (class234.field3399 != class184.field2769) {
                    class378.method2255((Throwable) null, "T1 - " + (class234.field3399 == null ? -1 : class234.field3399.method979((byte) -75)) + "," + (class564.field8360 == null ? -1 : class564.field8360.method979((byte) -41)) + "," + (class383.field5272 != null ? class383.field5272.method979((byte) -93) : -1) + " - " + class333.field4615, 120);
                    class120.method861(false, -67);
                    return true;
                } else {
                    boolean var396 = ~class632.field9278.method1032((byte) -33) == -2;
                    String var397 = class632.field9278.method1023(-29153);
                    String var398 = var397;
                    if (var396) {
                        var398 = class632.field9278.method1023(-29153);
                    }
                    long var399 = class632.field9278.method1004((byte) 114);
                    long var401 = (long) class632.field9278.method1045(true);
                    long var403 = (long) class632.field9278.method1028((byte) 123);
                    int var405 = class632.field9278.method1032((byte) -33);
                    long var406 = (var401 << 32) + var403;
                    boolean var408 = false;
                    int var409 = 0;
                    while (true) {
                        if (var409 >= 100) {
                            if (var405 <= 1) {
                                if ((!class266.field3763 || class510.field7259) && !class228.field3340) {
                                    if (class190.method1305(var398, (byte) -72)) {
                                        var408 = true;
                                    }
                                } else {
                                    var408 = true;
                                }
                            }
                            break;
                        }
                        if (class645.field9390[var409] == var406) {
                            var408 = true;
                            break;
                        }
                        ++var409;
                    }
                    if (!var408 && ~class193.field2862 == -1) {
                        class645.field9390[class605.field9001] = var406;
                        class605.field9001 = (class605.field9001 - -1) % 100;
                        String var410 = class438.method2552(0, class518.method3067(class632.field9278, (byte) 117));
                        if (~var405 != -3 && ~var405 != -4) {
                            if (var405 == 1) {
                                class253.method1627("<img=0>" + var398, class221.method1434((byte) -114, var399), var410, "<img=0>" + var397, 0, 0, 9, -1);
                            } else {
                                class253.method1627(var398, class221.method1434((byte) -77, var399), var410, var397, 0, 0, 9, -1);
                            }
                        } else {
                            class253.method1627("<img=1>" + var398, class221.method1434((byte) -80, var399), var410, "<img=1>" + var397, 0, 0, 9, -1);
                        }
                    }
                    class234.field3399 = null;
                    return true;
                }
            }
        }
    }
}
