import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dba")
public class class94 extends class212 {

    @OriginalMember(owner = "client!dba", name = "t", descriptor = "Lmu;")
    public static class303 field1650 = new class303(41, 3);

    @OriginalMember(owner = "client!dba", name = "x", descriptor = "[[Ljava/lang/String;")
    public static String[][] field1654 = new String[][] { { "M1", "M2", "S1", "F" }, { "M1", "M2", "M3", "S1", "S2", "F" }, { "M1", "M2", "M3", "M4", "S1", "S2", "S3", "F" } };

    @OriginalMember(owner = "client!dba", name = "A", descriptor = "Ljr;")
    public static class112 field1657 = new class112(8);

    @OriginalMember(owner = "client!dba", name = "o", descriptor = "I")
    public static int field1645;

    @OriginalMember(owner = "client!dba", name = "p", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!dba", name = "q", descriptor = "I")
    public static int field1647;

    @OriginalMember(owner = "client!dba", name = "r", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!dba", name = "s", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!dba", name = "u", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!dba", name = "v", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!dba", name = "w", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!dba", name = "y", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!dba", name = "z", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!dba", name = "C", descriptor = "Lwh;")
    public static class149 field1659;

    @OriginalMember(owner = "client!dba", name = "B", descriptor = "Lmi;")
    public static class496 field1658;

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(II)V", line = 4)
    public final void method419(int arg0, int arg1) {
        int var3 = -73 % ((arg0 - 82) / 35);
        super.field3006 = arg1;
        ++field1646;
    }

    @OriginalMember(owner = "client!dba", name = "<init>", descriptor = "(Ldh;)V", line = 15)
    public class94(class322 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!dba", name = "d", descriptor = "(I)I", line = 22)
    public final int method887(int arg0) {
        if (arg0 != -32350) {
            return -43;
        } else {
            ++field1652;
            return super.field3006;
        }
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(ILjava/io/File;)[B", line = 33)
    public static final byte[] method888(int arg0, File arg1) {
        ++field1647;
        int var2 = 34 % ((arg0 - 31) / 39);
        return class531.method3064((int) arg1.length(), arg1, 121);
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(B)V", line = 47)
    public static void method889(byte arg0) {
        field1650 = null;
        field1657 = null;
        field1658 = null;
        field1654 = null;
        field1659 = null;
        if (arg0 != 110) {
            field1659 = null;
        }
    }

    @OriginalMember(owner = "client!dba", name = "b", descriptor = "(I)I", line = 61)
    public final int method422(int arg0) {
        if (arg0 != 20014) {
            return -20;
        } else {
            ++field1645;
            return 1;
        }
    }

    @OriginalMember(owner = "client!dba", name = "b", descriptor = "(II)I", line = 73)
    public final int method417(int arg0, int arg1) {
        ++field1653;
        if (super.field3004.method2058(674) == class456.field6431) {
            if (super.field3004.method2061(arg0 + -70)) {
                return 3;
            } else {
                return ~arg1 != -1 && super.field3004.field4453.method1849(-32350) != 1 ? 2 : 1;
            }
        } else {
            if (arg0 != 3) {
                this.method418(true);
            }
            return 3;
        }
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(Lha;IIB)V", line = 98)
    public static final void method890(class59 arg0, int arg1, int arg2, byte arg3) {
        ++field1649;
        int var4 = 56 % ((68 - arg3) / 58);
        if (arg1 >= 0 && ~arg2 <= -1 && ~class131.field2199 != -1 && ~class458.field6450 != -1) {
            int var5;
            int var6;
            int var7;
            int var8;
            class661 var9;
            int var10;
            int var11;
            if (!class241.field3529) {
                arg0.method179(class242.field3531, class201.field2913, class131.field2199, class458.field6450);
                var5 = class201.field2913;
                var6 = class458.field6450;
                var7 = class242.field3531;
                var8 = class131.field2199;
                arg0.method303(class679.field9211, class75.field1351, class131.field2199, class458.field6450);
                var9 = arg0.method290();
                var9.method747(class204.field2933, class78.field1400, class88.field1572, class331.field4622, class276.field3877, class322.field4441);
                arg0.method210(var9);
                var10 = arg2;
                var11 = arg1;
            } else {
                class368.method2343(false, false);
                var9 = arg0.method320();
                int[] var12 = arg0.method188();
                var7 = var12[0];
                var5 = var12[1];
                var6 = var12[3];
                var8 = var12[2];
                var11 = arg1 + class343.method2164(-81, false);
                var10 = class734.method4047(false, -52) + arg2;
            }
            class69.method683(1, true);
            if (~var8 == -1) {
                var8 = 1;
            }
            if (var6 == 0) {
                var6 = 1;
            }
            if (class465.field6517 != null && (!class184.field2785 || (64 & class479.field6669) != 0)) {
                int var13 = -1;
                int var14 = -1;
                int var15 = arg0.method323();
                int var16 = arg0.method186();
                int var17;
                int var18;
                int var19;
                int var20;
                if (!class458.field6459) {
                    var17 = (-var7 + var11) * var15 / var8;
                    var18 = (-var5 + var10) * var15 / var6;
                    var19 = (-var5 + var10) * var16 / var6;
                    var20 = (var11 - var7) * var16 / var8;
                } else {
                    var17 = var20 = (-var7 + var11) * class58.field1146 / var8;
                    var18 = var19 = (-var5 + var10) * class58.field1146 / var6;
                }
                int[] var21 = new int[] { var17, var18, var15 };
                int[] var22 = new int[] { var20, var19, var16 };
                var9.method769(var21);
                var9.method769(var22);
                float var23 = class746.method4160((float) var21[1], (float) var22[0], (float) var21[2], (float) var22[2], 4, (float) var21[0], (byte) 123, (float) var22[1]);
                if (var23 > 0.0F) {
                    int var24 = var22[0] + -var21[0];
                    int var25 = var22[2] + -var21[2];
                    int var26 = (int) ((float) var24 * var23 + (float) var21[0]);
                    int var27 = (int) ((float) var25 * var23 + (float) var21[2]);
                    var13 = (class58.field1147.method2457((byte) 71) + -1 << 8) + var26 >> 9;
                    var14 = var27 - -(class58.field1147.method2457((byte) 73) + -1 << 8) >> 9;
                    byte var28 = class58.field1147.field5926;
                    if (var28 < 3 && (2 & class607.field8331[1][var26 >> 9][var27 >> 9]) != 0) {
                        int var88 = var28 + 1;
                    }
                }
                if (var13 != -1 && var14 != -1) {
                    if (class184.field2785 && (64 & class479.field6669) != 0) {
                        class378 var29 = class751.method4199(class44.field980, (byte) -54, class406.field5949);
                        if (var29 == null) {
                            class236.method1643(-2049);
                        } else {
                            class142.method1128(false, " ->", var14, (byte) -101, true, var13, -1, true, 15, (long) (var13 << 0 | var14), class133.field2242, 0L, class548.field7549);
                        }
                    } else {
                        if (class514.field7140) {
                            class142.method1128(false, "", var14, (byte) -109, true, var13, -1, true, 12, (long) (var14 | var13 << 0), class497.field6918.method2936(class607.field8336, 544), 0L, -1);
                        }
                        ++class547.field7539;
                        class142.method1128(false, "", var14, (byte) -82, true, var13, -1, true, 19, (long) (var14 | var13 << 0), class107.field1881, 0L, class666.field9095);
                    }
                }
            }
            if (class241.field3529) {
                class115.method1017((byte) 86);
            }
            for (int var30 = 0; ~(!class241.field3529 ? 1 : 2) < ~var30; ++var30) {
                boolean var31 = var30 == 0;
                class440 var32 = var31 ? class545.field7511 : class582.field7972;
                int var33 = arg1;
                int var34 = arg2;
                if (class241.field3529) {
                    class368.method2343(false, var31);
                    var33 = arg1 + class343.method2164(-92, var31);
                    var34 = arg2 + class734.method4047(var31, -48);
                }
                class174 var35 = var32.field6262;
                for (class228 var36 = (class228) var35.method1301(8); var36 != null; var36 = (class228) var35.method1307((byte) -123)) {
                    if ((class274.field3853 || class58.field1147.field5926 == var36.field3309.field5926) && var36.method1603(var34, var33, arg0, -115)) {
                        boolean var37 = false;
                        boolean var38 = false;
                        int var39;
                        int var40;
                        if (var36.field3309 instanceof class494) {
                            var39 = ((class494) var36.field3309).field6838;
                            var40 = ((class494) var36.field3309).field6831;
                        } else {
                            var39 = var36.field3309.field5933 >> 9;
                            var40 = var36.field3309.field5922 >> 9;
                        }
                        if (var36.field3309 instanceof class598) {
                            class598 var41 = (class598) var36.field3309;
                            int var42 = var41.method2457((byte) 78);
                            if (~(1 & var42) == -1 && (511 & var41.field5922) == 0 && ~(511 & var41.field5933) == -1 || ~(var42 & 1) == -2 && ~(var41.field5922 & 511) == -257 && (var41.field5933 & 511) == 256) {
                                int var43 = var41.field5922 - (-1 + var41.method2457((byte) 82) << 8);
                                int var44 = var41.field5933 + -(-1 + var41.method2457((byte) 105) << 8);
                                for (int var45 = 0; ~var45 > ~class738.field9939; ++var45) {
                                    class751 var52 = (class751) class86.field1546.method1465((long) class737.field9925[var45], -6008);
                                    if (var52 != null) {
                                        class9 var53 = var52.field10510;
                                        if (~class641.field8810 != ~var53.field5641 && var53.field5735) {
                                            int var54 = var53.field5922 - (var53.field126.field4716 + -1 << 8);
                                            int var55 = -(var53.field126.field4716 + -1 << 8) + var53.field5933;
                                            if (var43 <= var54 && ~var53.field126.field4716 >= ~(-(-var43 + var54 >> 9) + var41.method2457((byte) 68)) && var44 <= var55 && ~var53.field126.field4716 >= ~(-(-var44 + var55 >> 9) + var41.method2457((byte) 97))) {
                                                class227.method1596(~class58.field1147.field5926 != ~var36.field3309.field5926, false, var53);
                                                var53.field5641 = class641.field8810;
                                            }
                                        }
                                    }
                                }
                                int var46 = class219.field3167;
                                int[] var47 = class87.field1561;
                                for (int var48 = 0; ~var48 > ~var46; ++var48) {
                                    class598 var49 = class49.field1040[var47[var48]];
                                    if (var49 != null && class641.field8810 != var49.field5641 && var41 != var49 && var49.field5735) {
                                        int var50 = var49.field5922 + -(var49.method2457((byte) 94) - 1 << 8);
                                        int var51 = var49.field5933 + -(-1 + var49.method2457((byte) 82) << 8);
                                        if (~var43 >= ~var50 && ~var49.method2457((byte) 89) >= ~(var41.method2457((byte) 70) - (-var43 + var50 >> 9)) && ~var44 >= ~var51 && ~var49.method2457((byte) 127) >= ~(var41.method2457((byte) 42) - (var51 - var44 >> 9))) {
                                            class326.method2075((byte) 114, ~class58.field1147.field5926 != ~var36.field3309.field5926, var49);
                                            var49.field5641 = class641.field8810;
                                        }
                                    }
                                }
                            }
                            if (class641.field8810 == var41.field5641) {
                                continue;
                            }
                            class326.method2075((byte) 96, class58.field1147.field5926 != var36.field3309.field5926, var41);
                            var41.field5641 = class641.field8810;
                        }
                        if (var36.field3309 instanceof class9) {
                            class9 var56 = (class9) var36.field3309;
                            if (var56.field126 != null) {
                                if (~(var56.field126.field4716 & 1) == -1 && ~(511 & var56.field5922) == -1 && (511 & var56.field5933) == 0 || (1 & var56.field126.field4716) == 1 && (511 & var56.field5922) == 256 && (var56.field5933 & 511) == 256) {
                                    int var57 = var56.field5922 - (var56.field126.field4716 + -1 << 8);
                                    int var58 = var56.field5933 - (var56.field126.field4716 - 1 << 8);
                                    for (int var59 = 0; var59 < class738.field9939; ++var59) {
                                        class751 var66 = (class751) class86.field1546.method1465((long) class737.field9925[var59], -6008);
                                        if (var66 != null) {
                                            class9 var67 = var66.field10510;
                                            if (~class641.field8810 != ~var67.field5641 && var56 != var67 && var67.field5735) {
                                                int var68 = -(var67.field126.field4716 - 1 << 8) + var67.field5922;
                                                int var69 = -(var67.field126.field4716 - 1 << 8) + var67.field5933;
                                                if (var68 >= var57 && ~(var56.field126.field4716 - (-var57 + var68 >> 9)) <= ~var67.field126.field4716 && ~var69 <= ~var58 && ~(-(-var58 + var69 >> 9) + var56.field126.field4716) <= ~var67.field126.field4716) {
                                                    class227.method1596(~class58.field1147.field5926 != ~var36.field3309.field5926, false, var67);
                                                    var67.field5641 = class641.field8810;
                                                }
                                            }
                                        }
                                    }
                                    int var60 = class219.field3167;
                                    int[] var61 = class87.field1561;
                                    for (int var62 = 0; ~var62 > ~var60; ++var62) {
                                        class598 var63 = class49.field1040[var61[var62]];
                                        if (var63 != null && ~class641.field8810 != ~var63.field5641 && var63.field5735) {
                                            int var64 = var63.field5922 - (-1 + var63.method2457((byte) 116) << 8);
                                            int var65 = var63.field5933 + -(var63.method2457((byte) 121) + -1 << 8);
                                            if (~var57 >= ~var64 && ~var63.method2457((byte) 114) >= ~(-(-var57 + var64 >> 9) + var56.field126.field4716) && ~var58 >= ~var65 && var63.method2457((byte) 58) <= var56.field126.field4716 - (-var58 + var65 >> 9)) {
                                                class326.method2075((byte) 125, ~class58.field1147.field5926 != ~var36.field3309.field5926, var63);
                                                var63.field5641 = class641.field8810;
                                            }
                                        }
                                    }
                                }
                                if (~class641.field8810 == ~var56.field5641) {
                                    continue;
                                }
                                class227.method1596(class58.field1147.field5926 != var36.field3309.field5926, false, var56);
                                var56.field5641 = class641.field8810;
                            }
                        }
                        if (var36.field3309 instanceof class509) {
                            int var70 = class221.field3177 + var40;
                            int var71 = var39 - -class367.field5236;
                            class206 var72 = (class206) class491.field6801.method1465((long) (var36.field3309.field5926 << 28 | var71 << 14 | var70), -6008);
                            if (var72 != null) {
                                int var73 = 0;
                                class38 var74 = (class38) var72.field2961.method1267(-92);
                                while (var74 != null) {
                                    class352 var75 = class721.field9801.method162(79, var74.field942);
                                    if (class184.field2785 && ~class58.field1147.field5926 == ~var36.field3309.field5926) {
                                        class118 var76 = class308.field4273 != -1 ? class495.field6863.method19(class308.field4273, 28364) : null;
                                        if ((class479.field6669 & 1) != 0 && (var76 == null || ~var75.method2214(var76.field2000, 29, class308.field4273) != ~var76.field2000)) {
                                            ++class136.field2286;
                                            class142.method1128(false, class133.field2241 + " -> <col=ff9040>" + var75.field4938, var39, (byte) -76, false, var40, -1, true, 49, (long) var73, class133.field2242, (long) var74.field942, class548.field7549);
                                        }
                                    }
                                    if (class58.field1147.field5926 == var36.field3309.field5926) {
                                        String[] var77 = var75.field4954;
                                        for (int var78 = 4; ~var78 <= -1; --var78) {
                                            if (var77 != null && var77[var78] != null) {
                                                byte var79 = 0;
                                                if (var78 == 0) {
                                                    var79 = 21;
                                                }
                                                int var80 = class479.field6675;
                                                if (var78 == 1) {
                                                    var79 = 10;
                                                }
                                                if (~var78 == -3) {
                                                    var79 = 47;
                                                }
                                                if (var78 == 3) {
                                                    var79 = 22;
                                                }
                                                if (~var75.field4895 == ~var78) {
                                                    var80 = var75.field4902;
                                                }
                                                if (~var78 == -5) {
                                                    var79 = 5;
                                                }
                                                if (~var75.field4907 == ~var78) {
                                                    var80 = var75.field4973;
                                                }
                                                class142.method1128(false, "<col=ff9040>" + var75.field4938, var39, (byte) -119, false, var40, -1, true, var79, (long) var73, var77[var78], (long) var74.field942, var80);
                                                ++class21.field328;
                                            }
                                        }
                                    }
                                    ++class607.field8325;
                                    class142.method1128(~class58.field1147.field5926 != ~var36.field3309.field5926, "<col=ff9040>" + var75.field4938, var39, (byte) -122, false, var40, -1, true, 1010, (long) var73, class497.field6913.method2936(class607.field8336, 544), (long) var74.field942, class365.field5224);
                                    var74 = (class38) var72.field2961.method1277(-127);
                                    ++var73;
                                }
                            }
                        }
                        if (var36.field3309 instanceof class258) {
                            class258 var81 = (class258) var36.field3309;
                            class99 var82 = class76.field1366.method1680(0, var81.method589(-100));
                            if (var82.field1780 != null) {
                                var82 = var82.method925(class390.field5635, (byte) 47);
                            }
                            if (var82 != null) {
                                if (class184.field2785 && class58.field1147.field5926 == var36.field3309.field5926) {
                                    class118 var83 = class308.field4273 != -1 ? class495.field6863.method19(class308.field4273, 28364) : null;
                                    if (~(4 & class479.field6669) != -1 && (var83 == null || ~var82.method932(class308.field4273, var83.field2000, 54) != ~var83.field2000)) {
                                        ++class45.field984;
                                        class142.method1128(false, class133.field2241 + " -> <col=00ffff>" + var82.field1719, var39, (byte) -94, false, var40, -1, true, 2, (long) var81.hashCode(), class133.field2242, class438.method2646((byte) 95, var81, var39, var40), class548.field7549);
                                    }
                                }
                                if (~class58.field1147.field5926 == ~var36.field3309.field5926) {
                                    String[] var84 = var82.field1748;
                                    if (var84 != null) {
                                        for (int var85 = 4; ~var85 <= -1; --var85) {
                                            if (var84[var85] != null) {
                                                short var86 = 0;
                                                if (var85 == 0) {
                                                    var86 = 3;
                                                }
                                                int var87 = class479.field6675;
                                                if (~var85 == -2) {
                                                    var86 = 4;
                                                }
                                                if (~var85 == -3) {
                                                    var86 = 9;
                                                }
                                                if (var85 == 3) {
                                                    var86 = 59;
                                                }
                                                if (~var85 == -5) {
                                                    var86 = 1007;
                                                }
                                                if (var82.field1785 == var85) {
                                                    var87 = var82.field1704;
                                                }
                                                if (var82.field1786 == var85) {
                                                    var87 = var82.field1712;
                                                }
                                                class142.method1128(false, "<col=00ffff>" + var82.field1719, var39, (byte) -100, false, var40, -1, true, var86, (long) var81.hashCode(), var84[var85], class438.method2646((byte) -116, var81, var39, var40), var87);
                                                ++class648.field8916;
                                            }
                                        }
                                    }
                                    class142.method1128(~class58.field1147.field5926 != ~var36.field3309.field5926, "<col=00ffff>" + var82.field1719, var39, (byte) -120, false, var40, -1, true, 1001, (long) var81.hashCode(), class497.field6913.method2936(class607.field8336, 544), (long) var82.field1776, class365.field5224);
                                    ++field1655;
                                }
                            }
                        }
                    }
                }
                if (class241.field3529) {
                    class115.method1017((byte) 86);
                }
            }
            class69.method683(1, false);
        }
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(Z)V", line = 650)
    public final void method418(boolean arg0) {
        if (super.field3004.method2058(674) != class456.field6431) {
            super.field3006 = 1;
        } else if (super.field3004.method2061(-95)) {
            super.field3006 = 0;
        }
        ++field1651;
        if (~super.field3006 != -1 && ~super.field3006 != -2) {
            super.field3006 = this.method422(20014);
        }
        if (arg0) {
            field1657 = null;
        }
    }

    @OriginalMember(owner = "client!dba", name = "e", descriptor = "(I)Z", line = 673)
    public final boolean method891(int arg0) {
        ++field1648;
        if (arg0 < 85) {
            method890((class59) null, 104, -95, (byte) 26);
        }
        if (super.field3004.method2058(674) == class456.field6431) {
            return !super.field3004.method2061(-96);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dba", name = "<init>", descriptor = "(ILdh;)V", line = 694)
    public class94(int arg0, class322 arg1) {
        super(arg0, arg1);
    }
}
