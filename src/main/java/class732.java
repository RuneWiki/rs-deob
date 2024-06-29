import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!waa")
public class class732 extends class387 {

    @OriginalMember(owner = "client!waa", name = "m", descriptor = "I")
    public int field10097 = -1;

    @OriginalMember(owner = "client!waa", name = "s", descriptor = "I")
    public static int field10103 = 1339;

    @OriginalMember(owner = "client!waa", name = "r", descriptor = "Lcja;")
    public static class46 field10102 = new class46(16);

    @OriginalMember(owner = "client!waa", name = "l", descriptor = "I")
    public int field10096;

    @OriginalMember(owner = "client!waa", name = "n", descriptor = "I")
    public static int field10098;

    @OriginalMember(owner = "client!waa", name = "p", descriptor = "I")
    public static int field10100;

    @OriginalMember(owner = "client!waa", name = "q", descriptor = "I")
    public static int field10101;

    @OriginalMember(owner = "client!waa", name = "t", descriptor = "I")
    public static int field10104;

    @OriginalMember(owner = "client!waa", name = "u", descriptor = "I")
    public static int field10105;

    @OriginalMember(owner = "client!waa", name = "v", descriptor = "I")
    public static int field10106;

    @OriginalMember(owner = "client!waa", name = "k", descriptor = "Ljava/lang/String;")
    public String field10095;

    @OriginalMember(owner = "client!waa", name = "o", descriptor = "Ljava/lang/String;")
    public String field10099;

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(IIZI)V", line = 3)
    public static final void method4064(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg1 == 32457) {
            ++field10101;
            if (~arg3 <= -8001 && arg3 <= 48000) {
                class137.field2352 = arg2;
                class712.field9803 = arg0;
                class55.field782 = arg3;
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(Lju;I)V", line = 20)
    public static final void method4065(class137 arg0, int arg1) {
        ++field10100;
        if (class191.field2938 == arg0) {
            int var2 = class262.field3679.method793((byte) 99);
            int var3 = class202.field3059 - -(var2 >> 4 & 7);
            int var4 = (var2 & 7) + class89.field1246;
            int var5 = class262.field3679.method763(-94);
            int var6 = class262.field3679.method793((byte) 99);
            int var7 = class262.field3679.method763(127);
            int var8 = class262.field3679.method793((byte) 54);
            if (~var3 <= -1 && ~var4 <= -1 && var3 < class483.field6515 && ~class65.field926 < ~var4) {
                int var9 = var3 * 512 + 256;
                int var10 = var4 * 512 + 256;
                int var11 = class207.field3112;
                if (var11 < 3 && class61.method425(var4, 16340, var3)) {
                    ++var11;
                }
                class104 var12 = new class104(var5, var7, class440.field5977, class207.field3112, var11, var9, class309.method1973(15356, var9, var10, class207.field3112) + -var6, var10, var3, var3, var4, var4, var8);
                class280.field3893.method3594((byte) 124, new class272(var12));
            }
        } else if (class204.field3080 == arg0) {
            int var13 = class262.field3679.method789(-8);
            int var14 = class262.field3679.method784((byte) -120);
            int var15 = class262.field3679.method749((byte) -99);
            int var16 = class89.field1246 - -(7 & var15);
            int var17 = class400.field5510 - -var16;
            int var18 = class202.field3059 - -(7 & var15 >> 4);
            int var19 = class217.field3198 - -var18;
            boolean var20 = ~var18 <= -1 && ~var16 <= -1 && ~var18 > ~class483.field6515 && ~var16 > ~class65.field926;
            if (var20 || class607.method3450(class215.field3195, -4)) {
                class405.method2419(var19, new class348(var14, var13), var17, -492134130, class207.field3112);
                if (var20) {
                    class28.method185(var18, var16, class207.field3112, (byte) -105);
                }
            }
        } else if (class736.field10166 == arg0) {
            int var21 = class262.field3679.method793((byte) 13);
            boolean var22 = (var21 & 128) != 0;
            int var23 = (7 & var21 >> 3) + class202.field3059;
            int var24 = (var21 & 7) + class89.field1246;
            int var25 = var23 + class262.field3679.method766((byte) 122);
            int var26 = class262.field3679.method766((byte) 122) + var24;
            int var27 = class262.field3679.method774(-4);
            int var28 = class262.field3679.method763(-73);
            int var29 = class262.field3679.method793((byte) 90) * 4;
            int var30 = class262.field3679.method793((byte) 99) * 4;
            int var31 = class262.field3679.method763(112);
            int var32 = class262.field3679.method763(-58);
            int var33 = class262.field3679.method793((byte) 108);
            int var34 = class262.field3679.method763(-61);
            if (var33 == 255) {
                var33 = -1;
            }
            if (var23 >= 0 && ~var24 <= -1 && ~var23 > ~class483.field6515 && ~class65.field926 < ~var24 && var25 >= 0 && var26 >= 0 && var25 < class483.field6515 && class65.field926 > var26 && ~var28 != -65536) {
                int var35 = var26 * 512 - -256;
                int var36 = var23 * 512 - -256;
                int var37 = var30 << 2;
                int var38 = var29 << 2;
                int var39 = var25 * 512 + 256;
                int var40 = var34 << 2;
                int var41 = var24 * 512 - -256;
                class164 var42 = new class164(var28, class207.field3112, class207.field3112, var36, var41, var38, class440.field5977 + var31, class440.field5977 + var32, var33, var40, 0, var27, var37, var22, -1);
                var42.method1285(var35, var31 - -class440.field5977, (byte) -27, class309.method1973(15356, var39, var35, class207.field3112) - var37, var39);
                class243.field3469.method3594((byte) -43, new class536(var42));
            }
        } else if (class79.field1111 == arg0) {
            int var43 = class262.field3679.method749((byte) -86);
            int var44 = class262.field3679.method755(true);
            int var45 = (var44 >> 4 & 7) + class202.field3059;
            int var46 = class89.field1246 - -(var44 & 7);
            int var47 = class262.field3679.method789(-8);
            class445 var48 = class414.field5670.method2319(var47, false);
            int var49 = class262.field3679.method793((byte) 76);
            int var50 = var49 >> 2;
            int var51 = class132.field2271[var50];
            if (~var50 == -12) {
                var50 = 10;
            }
            int var52 = 0;
            if (var48.field6040 != null) {
                int var53 = -1;
                for (int var54 = 0; var48.field6040.length > var54; ++var54) {
                    if (var48.field6040[var54] == var50) {
                        var53 = var54;
                        break;
                    }
                }
                var52 = var48.field6069[var53].length;
            }
            int var55 = 0;
            if (var48.field6029 != null) {
                var55 = var48.field6029.length;
            }
            int var56 = 0;
            if (var48.field6056 != null) {
                var56 = var48.field6056.length;
            }
            if (~(var43 & 1) == -2) {
                class550.method3088(var46, (class326) null, var45, (byte) 126, var51, class207.field3112);
            } else {
                int[] var57 = null;
                if (~(var43 & 2) == -3) {
                    var57 = new int[var52];
                    for (int var58 = 0; ~var58 > ~var52; ++var58) {
                        var57[var58] = class262.field3679.method763(-87);
                    }
                }
                short[] var59 = null;
                if ((4 & var43) == 4) {
                    var59 = new short[var55];
                    for (int var60 = 0; var55 > var60; ++var60) {
                        var59[var60] = (short) class262.field3679.method763(-41);
                    }
                }
                short[] var61 = null;
                if ((8 & var43) == 8) {
                    var61 = new short[var56];
                    for (int var62 = 0; ~var56 < ~var62; ++var62) {
                        var61[var62] = (short) class262.field3679.method763(92);
                    }
                }
                class550.method3088(var46, new class326((long) (class97.field1535++), var57, var59, var61), var45, (byte) 81, var51, class207.field3112);
            }
        } else if (arg1 > 122) {
            if (class407.field5585 == arg0) {
                int var63 = class262.field3679.method777((byte) -36);
                int var64 = class262.field3679.method793((byte) 76);
                int var65 = (var64 & 7) + class89.field1246;
                int var66 = var65 - -class400.field5510;
                int var67 = ((var64 & 125) >> 4) + class202.field3059;
                int var68 = class217.field3198 + var67;
                class234 var69 = (class234) class214.field3181.method337((long) (var66 << 14 | class207.field3112 << 28 | var68), 1);
                if (var69 != null) {
                    for (class348 var70 = (class348) var69.field3367.method3589((byte) -127); var70 != null; var70 = (class348) var69.field3367.method3591(0)) {
                        if (~(32767 & var63) == ~var70.field4694) {
                            var70.method1207(114);
                            break;
                        }
                    }
                    if (var69.field3367.method3586(0)) {
                        var69.method1207(100);
                    }
                    if (~var67 <= -1 && ~var65 <= -1 && class483.field6515 > var67 && ~var65 > ~class65.field926) {
                        class28.method185(var67, var65, class207.field3112, (byte) -105);
                    }
                }
            } else if (class662.field9183 == arg0) {
                int var71 = class262.field3679.method793((byte) 112);
                int var72 = ((var71 & 245) >> 4) + class202.field3059 * 2;
                int var73 = class89.field1246 * 2 - -(var71 & 15);
                int var74 = class262.field3679.method793((byte) 63);
                boolean var75 = (var74 & 1) != 0;
                boolean var76 = ~(2 & var74) != -1;
                int var77 = !var76 ? -1 : var74 >> 2;
                int var78 = var72 + class262.field3679.method766((byte) 122);
                int var79 = class262.field3679.method766((byte) 122) + var73;
                int var80 = class262.field3679.method774(-4);
                int var81 = class262.field3679.method774(-4);
                int var82 = class262.field3679.method763(-101);
                int var83 = class262.field3679.method793((byte) 69);
                int var84;
                if (var76) {
                    var84 = (byte) var83;
                } else {
                    var84 = var83 * 4;
                }
                int var85 = class262.field3679.method793((byte) 110) * 4;
                int var86 = class262.field3679.method763(92);
                int var87 = class262.field3679.method763(93);
                int var88 = class262.field3679.method793((byte) 108);
                if (~var88 == -256) {
                    var88 = -1;
                }
                int var89 = class262.field3679.method763(75);
                if (~var72 <= -1 && ~var73 <= -1 && var72 < class483.field6515 * 2 && var73 < class483.field6515 * 2 && var78 >= 0 && ~var79 <= -1 && ~var78 > ~(class65.field926 * 2) && ~var79 > ~(class65.field926 * 2) && var82 != 65535) {
                    int var90 = var84 << 2;
                    int var91 = var78 * 256;
                    int var92 = var79 * 256;
                    int var93 = var85 << 2;
                    int var94 = var73 * 256;
                    int var95 = var72 * 256;
                    int var96 = var89 << 2;
                    if (~var80 != -1 && ~var77 != 0) {
                        class385 var97 = null;
                        if (var80 < 0) {
                            int var98 = -var80 - 1;
                            if (~class483.field6533 != ~var98) {
                                var97 = class527.field7150[var98];
                            } else {
                                var97 = class235.field3379;
                            }
                        } else {
                            int var99 = var80 + -1;
                            class755 var100 = (class755) class664.field9216.method337((long) var99, 1);
                            if (var100 != null) {
                                var97 = var100.field10414;
                            }
                        }
                        if (var97 != null) {
                            class540 var101 = var97.method2347(16383);
                            if (var101.field7374 != null && var101.field7374[var77] != null) {
                                var90 -= var101.field7374[var77][1];
                            }
                            if (var101.field7365 != null && var101.field7365[var77] != null) {
                                var90 -= var101.field7365[var77][1];
                            }
                        }
                    }
                    class164 var102 = new class164(var82, class207.field3112, class207.field3112, var95, var94, var90, class440.field5977 + var86, class440.field5977 + var87, var88, var96, var80, var81, var93, var75, var77);
                    var102.method1285(var92, var86 - -class440.field5977, (byte) 126, -var93 + class309.method1973(15356, var91, var92, class207.field3112), var91);
                    class243.field3469.method3594((byte) 110, new class536(var102));
                }
            } else if (class54.field770 == arg0) {
                int var103 = class262.field3679.method777((byte) -57);
                int var104 = class262.field3679.method777((byte) 127);
                int var105 = class262.field3679.method789(-8);
                int var106 = class262.field3679.method793((byte) 54);
                int var107 = class89.field1246 - -(7 & var106);
                int var108 = class400.field5510 + var107;
                int var109 = class202.field3059 - -((118 & var106) >> 4);
                int var110 = class217.field3198 + var109;
                if (class483.field6533 != var104) {
                    boolean var111 = ~var109 <= -1 && ~var107 <= -1 && class483.field6515 > var109 && ~class65.field926 < ~var107;
                    if (var111 || class607.method3450(class215.field3195, -4)) {
                        class405.method2419(var110, new class348(var105, var103), var108, -492134130, class207.field3112);
                        if (var111) {
                            class28.method185(var109, var107, class207.field3112, (byte) -105);
                        }
                    }
                }
            } else if (class336.field4532 == arg0) {
                class262.field3679.method793((byte) 89);
                int var112 = class262.field3679.method793((byte) 27);
                int var113 = ((124 & var112) >> 4) + class202.field3059;
                int var114 = class89.field1246 - -(7 & var112);
                int var115 = class262.field3679.method763(90);
                int var116 = class262.field3679.method793((byte) 35);
                int var117 = class262.field3679.method767((byte) -126);
                String var118 = class262.field3679.method752(0);
                class624.method3515(var115, var116, var113, var114, 126, var117, var118, class207.field3112);
            } else if (class579.field8197 == arg0) {
                int var119 = class262.field3679.method793((byte) 66);
                int var120 = (7 & var119) + class89.field1246;
                int var121 = class400.field5510 + var120;
                int var122 = class202.field3059 - -(7 & var119 >> 4);
                int var123 = class217.field3198 + var122;
                int var124 = class262.field3679.method763(-49);
                int var125 = class262.field3679.method763(92);
                int var126 = class262.field3679.method763(-69);
                if (class214.field3181 != null) {
                    class234 var127 = (class234) class214.field3181.method337((long) (var123 | class207.field3112 << 28 | var121 << 14), 1);
                    if (var127 != null) {
                        for (class348 var128 = (class348) var127.field3367.method3589((byte) -127); var128 != null; var128 = (class348) var127.field3367.method3591(0)) {
                            if (~(32767 & var124) == ~var128.field4694 && ~var128.field4693 == ~var125) {
                                var128.method1207(82);
                                var128.field4693 = var126;
                                class405.method2419(var123, var128, var121, -492134130, class207.field3112);
                                break;
                            }
                        }
                        if (var122 >= 0 && ~var120 <= -1 && var122 < class483.field6515 && class65.field926 > var120) {
                            class28.method185(var122, var120, class207.field3112, (byte) -105);
                        }
                    }
                }
            } else if (class451.field6175 == arg0) {
                int var129 = class262.field3679.method779((byte) 118);
                int var130 = class202.field3059 - -(var129 >> 4 & 7);
                int var131 = (7 & var129) + class89.field1246;
                int var132 = class262.field3679.method749((byte) -72);
                int var133 = var132 >> 2;
                int var134 = 3 & var132;
                int var135 = class132.field2271[var133];
                if (class607.method3450(class215.field3195, -4) || var130 >= 0 && ~var131 <= -1 && ~class483.field6515 < ~var130 && var131 < class65.field926) {
                    class735.method4080(var133, var134, class207.field3112, var131, var135, var130, -1, true);
                }
            } else if (class641.field8882 == arg0) {
                int var136 = class262.field3679.method793((byte) 61);
                int var137 = (7 & var136 >> 4) + class202.field3059;
                int var138 = class89.field1246 - -(7 & var136);
                int var139 = class262.field3679.method763(108);
                if (~var139 == -65536) {
                    var139 = -1;
                }
                int var140 = class262.field3679.method793((byte) 9);
                int var141 = var140 >> 4 & 15;
                int var142 = var140 & 7;
                int var143 = class262.field3679.method793((byte) 121);
                int var144 = class262.field3679.method793((byte) 115);
                int var145 = class262.field3679.method763(-123);
                if (~var137 <= -1 && ~var138 <= -1 && class483.field6515 > var137 && ~class65.field926 < ~var138) {
                    int var146 = var141 + 1;
                    if (-var146 + var137 <= class235.field3379.field5304[0] && var137 + var146 >= class235.field3379.field5304[0] && -var146 + var138 <= class235.field3379.field5308[0] && ~class235.field3379.field5308[0] >= ~(var138 + var146)) {
                        class460.method2646(12370, (var138 << 8) + (class207.field3112 << 24) + (var137 << 16) + var141, false, var143, var142, var139, var144, var145);
                    }
                }
            } else if (class66.field956 != arg0) {
                if (class169.field2709 == arg0) {
                    int var155 = class262.field3679.method793((byte) 83);
                    int var156 = (7 & var155 >> 4) + class202.field3059;
                    int var157 = class89.field1246 - -(var155 & 7);
                    int var158 = class262.field3679.method763(92);
                    if (var158 == 65535) {
                        var158 = -1;
                    }
                    int var159 = class262.field3679.method793((byte) 58);
                    int var160 = (var159 & 241) >> 4;
                    int var161 = var159 & 7;
                    int var162 = class262.field3679.method793((byte) 103);
                    int var163 = class262.field3679.method793((byte) 48);
                    int var164 = class262.field3679.method763(75);
                    if (var156 >= 0 && ~var157 <= -1 && var156 < class483.field6515 && ~var157 > ~class65.field926) {
                        int var165 = var160 - -1;
                        if (~(-var165 + var156) >= ~class235.field3379.field5304[0] && ~class235.field3379.field5304[0] >= ~(var156 + var165) && ~class235.field3379.field5308[0] <= ~(var157 - var165) && ~(var157 + var165) <= ~class235.field3379.field5308[0]) {
                            class119.method1049(-6732, var164, (class207.field3112 << 24) + (var156 << 16) - -(var157 << 8) + var160, var158, var163, var162, var161);
                        }
                    }
                } else if (class531.field7187 == arg0) {
                    int var166 = class262.field3679.method777((byte) -65);
                    if (~var166 == -65536) {
                        var166 = -1;
                    }
                    int var167 = class262.field3679.method793((byte) 62);
                    int var168 = (var167 >> 4 & 7) + class202.field3059;
                    int var169 = (var167 & 7) + class89.field1246;
                    int var170 = class262.field3679.method779((byte) 118);
                    int var171 = var170 >> 2;
                    int var172 = 3 & var170;
                    int var173 = class132.field2271[var171];
                    class706.method3942(var168, class207.field3112, var173, var172, var171, var166, var169, -1);
                } else if (class411.field5617 == arg0) {
                    int var174 = class262.field3679.method763(-59);
                    int var175 = class262.field3679.method793((byte) 26);
                    class414.field5670.method2319(var174, false).method2584(19502, var175);
                } else {
                    class281.method1820("T3 - " + arg0, 28395, (Throwable) null);
                    class479.method2746(false, false);
                }
            } else {
                int var147 = class262.field3679.method784((byte) -116);
                int var148 = class262.field3679.method755(true);
                int var149 = ((var148 & 114) >> 4) + class202.field3059;
                int var150 = (7 & var148) + class89.field1246;
                int var151 = class262.field3679.method755(true);
                int var152 = var151 >> 2;
                int var153 = 3 & var151;
                int var154 = class132.field2271[var152];
                if (class607.method3450(class215.field3195, -4) || ~var149 <= -1 && ~var150 <= -1 && ~class483.field6515 < ~var149 && var150 < class65.field926) {
                    class735.method4080(var152, var153, class207.field3112, var150, var154, var149, var147, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!waa", name = "e", descriptor = "(I)Lsw;", line = 733)
    public final class787 method4066(int arg0) {
        if (arg0 > -117) {
            field10103 = -12;
        }
        ++field10106;
        return class753.field10401[super.field5319];
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "([BII)[B", line = 745)
    public static final byte[] method4067(byte[] arg0, int arg1, int arg2) {
        if (arg1 > -126) {
            method4065((class137) null, 110);
        }
        ++field10104;
        byte[] var3 = new byte[arg2];
        class275.method1771(arg0, 0, var3, 0, arg2);
        return var3;
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(Z)V", line = 765)
    public static final void method4068(boolean arg0) {
        ++field10105;
        int var1 = class696.field9624;
        int[] var2 = class417.field5700;
        if (!arg0) {
            field10103 = 84;
        }
        for (int var3 = 0; var1 > var3; ++var3) {
            class771 var4 = class527.field7150[var2[var3]];
            if (var4 != null) {
                class451.method2612(92, var4.method2342((byte) 107), var4);
            }
        }
    }

    @OriginalMember(owner = "client!waa", name = "f", descriptor = "(I)V", line = 795)
    public static void method4069(int arg0) {
        if (arg0 != -65536) {
            method4065((class137) null, 6);
        }
        field10102 = null;
    }
}
