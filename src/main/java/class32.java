import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class32 extends class167 {

    @OriginalMember(owner = "client!ci", name = "U", descriptor = "Lkh;")
    private static class117 field745 = class224.method1450((byte) -92, "Loaded sprites");

    @OriginalMember(owner = "client!ci", name = "ab", descriptor = "[J")
    public static long[] field751 = new long[200];

    @OriginalMember(owner = "client!ci", name = "ib", descriptor = "Lkh;")
    public static class117 field759 = field745;

    @OriginalMember(owner = "client!ci", name = "V", descriptor = "I")
    public static int field746 = 0;

    @OriginalMember(owner = "client!ci", name = "hb", descriptor = "I")
    public static int field758 = 0;

    @OriginalMember(owner = "client!ci", name = "gb", descriptor = "I")
    public static int field757 = 0;

    @OriginalMember(owner = "client!ci", name = "jb", descriptor = "[J")
    public static long[] field760 = new long[256];

    @OriginalMember(owner = "client!ci", name = "eb", descriptor = "Lkh;")
    public static class117 field755 = class224.method1450((byte) -105, "rot:");

    @OriginalMember(owner = "client!ci", name = "lb", descriptor = "Lkh;")
    public static class117 field762;

    @OriginalMember(owner = "client!ci", name = "T", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "client!ci", name = "W", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!ci", name = "X", descriptor = "I")
    public static int field748;

    @OriginalMember(owner = "client!ci", name = "Y", descriptor = "I")
    public static int field749;

    @OriginalMember(owner = "client!ci", name = "bb", descriptor = "I")
    public static int field752;

    @OriginalMember(owner = "client!ci", name = "cb", descriptor = "I")
    public static int field753;

    @OriginalMember(owner = "client!ci", name = "db", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!ci", name = "fb", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!ci", name = "kb", descriptor = "I")
    public static int field761;

    @OriginalMember(owner = "client!ci", name = "Z", descriptor = "Lvb;")
    public static class232 field750;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "(B)V")
    public static void method278(byte arg0) {
        field745 = null;
        field759 = null;
        field762 = null;
        if (arg0 >= 65) {
            field751 = null;
            field755 = null;
            field750 = null;
            field760 = null;
        }
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(III)V")
    private final void method279(int arg0, int arg1, int arg2) {
        int var4 = class70.field1350[arg2];
        ++field748;
        int var5 = class143.field2583[arg0];
        float var6 = (float) Math.atan2((double) (arg1 + var4), (double) (var5 + -2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class55.field1123 = arg0;
            class185.field3324 = arg2;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class185.field3324 = arg0;
            class55.field1123 = arg2;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class185.field3324 = class115.field2146 - arg0;
            class55.field1123 = arg2;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class55.field1123 = -arg0 + class57.field1185;
            class185.field3324 = arg2;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class55.field1123 = -arg0 + class57.field1185;
            class185.field3324 = -arg2 + class115.field2146;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class185.field3324 = -arg0 + class115.field2146;
            class55.field1123 = -arg2 + class57.field1185;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class185.field3324 = arg0;
            class55.field1123 = class57.field1185 - arg2;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class185.field3324 = class115.field2146 - arg2;
            class55.field1123 = arg0;
        }
        class55.field1123 &= class101.field1839;
        class185.field3324 &= class34.field801;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)[[I")
    public final int[][] method116(int arg0, int arg1) {
        if (arg1 != -9179) {
            return null;
        } else {
            ++field744;
            int[][] var3 = super.field3022.method1148(arg0, 8708);
            if (super.field3022.field2957) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                for (int var7 = 0; ~var7 > ~class115.field2146; ++var7) {
                    this.method279(arg0, -2048, var7);
                    int[][] var8 = this.method1180(class55.field1123, 26851, 0);
                    var4[var7] = var8[0][class185.field3324];
                    var5[var7] = var8[1][class185.field3324];
                    var6[var7] = var8[2][class185.field3324];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "()V")
    public class32() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(BI)[I")
    public final int[] method53(byte arg0, int arg1) {
        ++field752;
        int[] var3 = super.field3013.method1463((byte) -115, arg1);
        if (super.field3013.field4085) {
            for (int var4 = 0; class115.field2146 > var4; ++var4) {
                this.method279(arg1, arg0 ^ 1952, var4);
                int[] var5 = this.method1186(class55.field1123, arg0 ^ -96, 0);
                var3[var4] = var5[class185.field3324];
            }
        }
        if (arg0 != -96) {
            this.method51((class145) null, false, -41);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Z)V")
    public static final void method280(boolean arg0) {
        ++field753;
        if (class195.field3487 == 198) {
            int var1 = class18.field511.method1045((byte) 24);
            int var2 = ((var1 & 118) >> 4) + class217.field3949;
            int var3 = (var1 & 7) + class203.field3680;
            int var4 = class18.field511.method988(64);
            if (~var2 <= -1 && ~var3 <= -1 && var2 < 104 && ~var3 > -105) {
                class36 var5 = class143.field2597[class203.field3675][var2][var3];
                if (var5 != null) {
                    for (class143 var6 = (class143) var5.method314((byte) -26); var6 != null; var6 = (class143) var5.method320(0)) {
                        if ((var4 & 32767) == var6.field2586.field1286) {
                            var6.method123((byte) -126);
                            break;
                        }
                    }
                    if (var5.method314((byte) -26) == null) {
                        class143.field2597[class203.field3675][var2][var3] = null;
                    }
                    class139.method948(var3, (byte) 116, var2);
                }
            }
        } else if (class195.field3487 == 150) {
            int var7 = class18.field511.method998(104);
            int var8 = (7 & var7 >> 4) + class217.field3949;
            int var9 = class203.field3680 - -(var7 & 7);
            int var10 = class18.field511.method994((byte) 30) + var8;
            int var11 = class18.field511.method994((byte) 84) + var9;
            int var12 = class18.field511.method1035(-117);
            int var13 = class18.field511.method1049((byte) 91);
            int var14 = 4 * class18.field511.method998(92);
            int var15 = class18.field511.method998(74) * 4;
            int var16 = class18.field511.method1049((byte) 98);
            int var17 = class18.field511.method1049((byte) 123);
            int var18 = class18.field511.method998(68);
            int var19 = class18.field511.method998(104);
            if (~var8 <= -1 && ~var9 <= -1 && var8 < 104 && var9 < 104 && var10 >= 0 && ~var11 <= -1 && ~var10 > -105 && var11 < 104 && var13 != 65535) {
                int var20 = var9 * 128 - -64;
                int var21 = var11 * 128 + 64;
                int var22 = var8 * 128 + 64;
                int var23 = var10 * 128 + 64;
                class190 var24 = new class190(var13, class203.field3675, var22, var20, class186.method1265(arg0, var20, class203.field3675, var22) - var14, var16 - -class44.field966, class44.field966 + var17, var18, var19, var12, var15);
                var24.method1277(var23, var21, class44.field966 + var16, class186.method1265(true, var21, class203.field3675, var23) - var15, -1);
                class173.field3114.method325(122, new class105(var24));
            }
        } else if (~class195.field3487 == -53) {
            int var25 = class18.field511.method998(82);
            int var26 = (var25 & 7) + class203.field3680;
            int var27 = ((119 & var25) >> 4) + class217.field3949;
            int var28 = class18.field511.method1049((byte) 113);
            if (var28 == 65535) {
                var28 = -1;
            }
            int var29 = class18.field511.method998(94);
            int var30 = class18.field511.method998(107);
            int var31 = 7 & var29;
            int var32 = (255 & var29) >> 4;
            if (var27 >= 0 && var26 >= 0 && var27 < 104 && var26 < 104) {
                int var33 = var32 - -1;
                if (-var33 + var27 <= class93.field1712.field4259[0] && ~class93.field1712.field4259[0] >= ~(var27 + var33) && class93.field1712.field4266[0] >= -var33 + var26 && var26 + var33 >= class93.field1712.field4266[0] && ~class86.field1617 != -1 && var31 > 0 && class219.field3975 < 50 && ~var28 != 0) {
                    class178.field3226[class219.field3975] = var28;
                    class5.field65[class219.field3975] = var31;
                    class34.field803[class219.field3975] = var30;
                    class80.field1508[class219.field3975] = null;
                    class174.field3127[class219.field3975] = (var26 << 8) + (var27 << 16) - -var32;
                    ++class219.field3975;
                }
            }
        } else if (class195.field3487 == 232) {
            int var34 = class18.field511.method998(66);
            int var35 = (var34 >> 4 & 7) + class217.field3949;
            int var36 = class203.field3680 - -(7 & var34);
            int var37 = class18.field511.method1049((byte) 102);
            int var38 = class18.field511.method1049((byte) 98);
            int var39 = class18.field511.method1049((byte) 119);
            if (var35 >= 0 && ~var36 <= -1 && var35 < 104 && ~var36 > -105) {
                class36 var40 = class143.field2597[class203.field3675][var35][var36];
                if (var40 != null) {
                    for (class143 var41 = (class143) var40.method314((byte) -26); var41 != null; var41 = (class143) var40.method320(0)) {
                        class67 var42 = var41.field2586;
                        if ((var37 & 32767) == var42.field1286 && var42.field1295 == var38) {
                            var42.field1295 = var39;
                            break;
                        }
                    }
                    class139.method948(var36, (byte) 27, var35);
                }
            }
        } else {
            if (class195.field3487 == 61) {
                int var43 = class18.field511.method1049((byte) 100);
                int var44 = class18.field511.method1042(true);
                int var45 = var44 >> 2;
                int var46 = class73.field1389[var45];
                int var47 = class18.field511.method1049((byte) 93);
                int var48 = var44 & 3;
                byte var49 = class18.field511.method1010(-1773958768);
                byte var50 = class18.field511.method1009((byte) -128);
                byte var51 = class18.field511.method994((byte) 26);
                byte var52 = class18.field511.method1009((byte) -99);
                int var53 = class18.field511.method1049((byte) 119);
                int var54 = class18.field511.method998(82);
                int var55 = ((113 & var54) >> 4) + class217.field3949;
                int var56 = (var54 & 7) + class203.field3680;
                int var57 = class18.field511.method1004(255);
                class56 var58;
                if (~class72.field1387 == ~var43) {
                    var58 = class93.field1712;
                } else {
                    var58 = class43.field950[var43];
                }
                if (var58 != null) {
                    class211 var59 = class48.method379(68, var47);
                    int var60;
                    int var61;
                    if (~var48 != -2 && ~var48 != -4) {
                        var60 = var59.field3814;
                        var61 = var59.field3804;
                    } else {
                        var61 = var59.field3814;
                        var60 = var59.field3804;
                    }
                    int var62 = var55 - -(var60 >> 1);
                    int var63 = (var60 + 1 >> 1) + var55;
                    int var64 = (var61 >> 1) + var56;
                    int[][] var65 = null;
                    int[][] var66 = class156.field2839[class203.field3675];
                    int var67 = (var55 << 7) + (var60 << 6);
                    if (class203.field3675 < 3) {
                        var65 = class156.field2839[class203.field3675 + 1];
                    }
                    int var68 = (var61 - -1 >> 1) + var56;
                    int var69 = var66[var62][var64] + var66[var63][var64] + var66[var62][var68] - -var66[var63][var68] >> 2;
                    int var70 = (var56 << 7) + (var61 << 6);
                    class1 var71 = var59.method1383(var69, var66, var65, var67, var45, (byte) -125, var70, false, var48);
                    if (var71 != null) {
                        if (var51 < var50) {
                            byte var72 = var50;
                            var50 = var51;
                            var51 = var72;
                        }
                        class200.method1331(var57 - -1, -1, var53 - -1, var46, var55, var56, class203.field3675, 0, 0, 2);
                        var58.field1138 = var56 * 128 + var61 * 64;
                        var58.field1137 = var50 + var55;
                        var58.field1157 = class44.field966 + var53;
                        if (~var52 < ~var49) {
                            byte var73 = var52;
                            var52 = var49;
                            var49 = var73;
                        }
                        var58.field1144 = class44.field966 + var57;
                        var58.field1139 = (class29) var71.field17;
                        var58.field1130 = var51 + var55;
                        var58.field1140 = var49 + var56;
                        var58.field1159 = var69;
                        var58.field1146 = var55 * 128 + var60 * 64;
                        var58.field1127 = var56 - -var52;
                    }
                }
            }
            if (class195.field3487 == 171) {
                int var74 = class18.field511.method1045((byte) 73);
                int var75 = 3 & var74;
                int var76 = var74 >> 2;
                int var77 = class73.field1389[var76];
                int var78 = class18.field511.method1019((byte) 4);
                if (~var78 == -65536) {
                    var78 = -1;
                }
                int var79 = class18.field511.method1033(-128);
                int var80 = (7 & var79 >> 4) + class217.field3949;
                int var81 = (var79 & 7) + class203.field3680;
                class120.method844(var78, var80, class203.field3675, var76, var75, (byte) 127, var77, var81);
            } else if (~class195.field3487 == -100) {
                int var82 = class18.field511.method998(125);
                int var83 = class217.field3949 - -((var82 & 115) >> 4);
                int var84 = (7 & var82) + class203.field3680;
                int var85 = class18.field511.method1004(255);
                int var86 = class18.field511.method988(118);
                if (var83 >= 0 && ~var84 <= -1 && ~var83 > -105 && ~var84 > -105) {
                    class67 var87 = new class67();
                    var87.field1295 = var86;
                    var87.field1286 = var85;
                    if (class143.field2597[class203.field3675][var83][var84] == null) {
                        class143.field2597[class203.field3675][var83][var84] = new class36();
                    }
                    class143.field2597[class203.field3675][var83][var84].method325(127, new class143(var87));
                    class139.method948(var84, (byte) 110, var83);
                }
            } else if (~class195.field3487 == -174) {
                int var88 = class18.field511.method998(95);
                int var89 = class217.field3949 - -((var88 & 119) >> 4);
                int var90 = (var88 & 7) + class203.field3680;
                int var91 = class18.field511.method1049((byte) 98);
                int var92 = class18.field511.method998(91);
                int var93 = class18.field511.method1049((byte) 117);
                if (~var89 <= -1 && var90 >= 0 && var89 < 104 && var90 < 104) {
                    int var94 = var90 * 128 - -64;
                    int var95 = var89 * 128 - -64;
                    class177 var96 = new class177(var91, class203.field3675, var95, var94, class186.method1265(true, var94, class203.field3675, var95) + -var92, var93, class44.field966);
                    class119.field2257.method325(124, new class221(var96));
                }
            } else if (arg0) {
                if (class195.field3487 == 75) {
                    int var97 = class18.field511.method998(72);
                    int var98 = var97 >> 2;
                    int var99 = 3 & var97;
                    int var100 = class73.field1389[var98];
                    int var101 = class18.field511.method1042(true);
                    int var102 = class217.field3949 - -((125 & var101) >> 4);
                    int var103 = (7 & var101) + class203.field3680;
                    if (var102 >= 0 && var103 >= 0 && var102 < 104 && ~var103 > -105) {
                        class200.method1331(-1, -1, 0, var100, var102, var103, class203.field3675, var99, var98, 2);
                    }
                } else if (~class195.field3487 == -136) {
                    int var104 = class18.field511.method1045((byte) 125);
                    int var105 = (7 & var104) + class203.field3680;
                    int var106 = (var104 >> 4 & 7) + class217.field3949;
                    int var107 = class18.field511.method988(104);
                    int var108 = class18.field511.method1004(255);
                    int var109 = class18.field511.method1004(255);
                    if (var106 >= 0 && var105 >= 0 && var106 < 104 && var105 < 104 && class72.field1387 != var108) {
                        class67 var110 = new class67();
                        var110.field1286 = var107;
                        var110.field1295 = var109;
                        if (class143.field2597[class203.field3675][var106][var105] == null) {
                            class143.field2597[class203.field3675][var106][var105] = new class36();
                        }
                        class143.field2597[class203.field3675][var106][var105].method325(118, new class143(var110));
                        class139.method948(var105, (byte) 22, var106);
                    }
                } else if (class195.field3487 == 123) {
                    int var111 = class18.field511.method998(112);
                    int var112 = ((249 & var111) >> 4) + class217.field3949 * 2;
                    int var113 = (var111 & 15) + class203.field3680 * 2;
                    int var114 = var112 + class18.field511.method994((byte) 114);
                    int var115 = class18.field511.method994((byte) 24) + var113;
                    int var116 = class18.field511.method1035(-93);
                    int var117 = class18.field511.method1049((byte) 112);
                    int var118 = class18.field511.method998(120) * 4;
                    int var119 = 4 * class18.field511.method998(124);
                    int var120 = class18.field511.method1049((byte) 127);
                    int var121 = class18.field511.method1049((byte) 105);
                    int var122 = class18.field511.method998(60);
                    int var123 = class18.field511.method998(110);
                    if (~var112 <= -1 && var113 >= 0 && ~var112 > -209 && ~var113 > -209 && var114 >= 0 && ~var115 <= -1 && ~var114 > -209 && ~var115 > -209 && ~var117 != -65536) {
                        int var124 = var112 * 64;
                        int var125 = var114 * 64;
                        int var126 = var113 * 64;
                        class190 var127 = new class190(var117, class203.field3675, var124, var126, -var118 + class186.method1265(true, var126, class203.field3675, var124), class44.field966 + var120, class44.field966 + var121, var122, var123, var116, var119);
                        int var128 = var115 * 64;
                        var127.method1277(var125, var128, class44.field966 + var120, -var119 + class186.method1265(true, var128, class203.field3675, var125), -1);
                        class173.field3114.method325(127, new class105(var127));
                    }
                } else if (~class195.field3487 == -45) {
                    int var129 = class18.field511.method998(77);
                    int var130 = var129 >> 2;
                    int var131 = 3 & var129;
                    int var132 = class73.field1389[var130];
                    int var133 = class18.field511.method988(110);
                    int var134 = class18.field511.method1045((byte) 66);
                    int var135 = (7 & var134 >> 4) + class217.field3949;
                    int var136 = (7 & var134) + class203.field3680;
                    if (~var135 <= -1 && var136 >= 0 && ~var135 > -105 && var136 < 104) {
                        class200.method1331(-1, var133, 0, var132, var135, var136, class203.field3675, var131, var130, 2);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lve;II)V")
    public static final void method281(class234 arg0, int arg1, int arg2) {
        ++field754;
        if (arg2 != -752) {
            field757 = 31;
        }
        if (arg0.field4278 <= class44.field966) {
            if (class44.field966 <= arg0.field4252) {
                class14.method128((byte) -99, arg0);
            } else {
                class209.method1372(arg0, (byte) 18);
            }
        } else {
            class157.method1116(arg0, true);
        }
        if (~arg0.field4244 > -129 || ~arg0.field4221 > -129 || arg0.field4244 >= 13184 || ~arg0.field4221 <= -13185) {
            arg0.field4252 = 0;
            arg0.field4233 = -1;
            arg0.field4244 = arg0.field4259[0] * 128 + arg0.field4256 * 64;
            arg0.field4213 = -1;
            arg0.field4278 = 0;
            arg0.field4221 = arg0.field4266[0] * 128 + arg0.field4256 * 64;
            arg0.method1512(true);
        }
        if (class93.field1712 == arg0 && (~arg0.field4244 > -1537 || arg0.field4221 < 1536 || ~arg0.field4244 <= -11777 || ~arg0.field4221 <= -11777)) {
            arg0.field4213 = -1;
            arg0.field4252 = 0;
            arg0.field4278 = 0;
            arg0.field4233 = -1;
            arg0.field4221 = arg0.field4266[0] * 128 - -(arg0.field4256 * 64);
            arg0.field4244 = arg0.field4259[0] * 128 - -(arg0.field4256 * 64);
            arg0.method1512(true);
        }
        class92.method634((byte) 30, arg0);
        class140.method953((byte) -54, arg0);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lnc;I)V")
    public static final void method282(class145 arg0, int arg1) {
        if (arg1 != -25) {
            field746 = -9;
        }
        byte[] var2 = new byte[24];
        ++field749;
        if (class88.field1638 != null) {
            try {
                class88.field1638.method905(0L, (byte) -92);
                int var3 = 0;
                class88.field1638.method903(var2, arg1 ^ -21749);
                while (var3 < 24 && ~var2[var3] == -1) {
                    ++var3;
                }
                if (~var3 <= -25) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; ++var4) {
                    var2[var4] = -1;
                }
            }
        }
        arg0.method1047(24, 0, (byte) -54, var2);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lnc;ZI)V")
    public final void method51(class145 arg0, boolean arg1, int arg2) {
        ++field756;
        if (arg2 == 0) {
            super.field3009 = ~arg0.method998(63) == -2;
        }
        if (arg1) {
            field757 = 110;
        }
    }

    static {
        for (int var0 = 0; ~var0 > -257; ++var0) {
            long var1 = (long) var0;
            for (int var3 = 0; ~var3 > -9; ++var3) {
                if ((var1 & 1L) != 1L) {
                    var1 >>>= 1;
                } else {
                    var1 = -3932672073523589310L ^ var1 >>> 1;
                }
            }
            field760[var0] = var1;
        }
        field762 = class224.method1450((byte) 115, "null");
    }
}
