import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class168 extends class384 {

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "Lrp;")
    public static class653 field2216 = new class653(8);

    @OriginalMember(owner = "client!cb", name = "t", descriptor = "[I")
    public static int[] field2218 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!cb", name = "w", descriptor = "[Lbt;")
    public static class496[] field2221 = new class496[16];

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
    public static int field2213;

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!cb", name = "s", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!cb", name = "u", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!cb", name = "v", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZB)V")
    public final void method1020(boolean arg0, byte arg1) {
        if (arg1 >= 23) {
            ++field2214;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IBI)V")
    public final void method1025(int arg0, byte arg1, int arg2) {
        if (arg1 == 102) {
            ++field2212;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lbia;BI)V")
    public final void method1015(class329 arg0, byte arg1, int arg2) {
        if (arg1 != 80) {
            field2218 = null;
        }
        ++field2213;
        super.field5337.method3711(false, arg0);
        super.field5337.method3781(arg1 ^ -83, arg2);
    }

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "(I)Z")
    public static final boolean method1054(int arg0) throws IOException {
        ++field2215;
        if (class426.field6057 == null) {
            return false;
        } else {
            if (class730.field10219 == null) {
                if (class506.field7143) {
                    if (!class426.field6057.method873(1, (byte) -128)) {
                        return false;
                    }
                    class426.field6057.method870(0, 1, class24.field414.field2325, false);
                    class506.field7143 = false;
                    class199.field2550 = 0;
                    ++class534.field7495;
                }
                class24.field414.field2354 = 0;
                if (class24.field414.method4207((byte) 70)) {
                    if (!class426.field6057.method873(1, (byte) -127)) {
                        return false;
                    }
                    class426.field6057.method870(1, 1, class24.field414.field2325, false);
                    class199.field2550 = 0;
                    ++class534.field7495;
                }
                class506.field7143 = true;
                class78[] var1 = class228.method1462(2);
                int var2 = class24.field414.method4211(1526808035);
                if (~var2 > -1 || ~var2 <= ~var1.length) {
                    throw new IOException("invo:" + var2 + " ip:" + class24.field414.field2354);
                }
                class730.field10219 = var1[var2];
                class677.field9199 = class730.field10219.field1037;
            }
            if (class677.field9199 == -1) {
                if (!class426.field6057.method873(1, (byte) -128)) {
                    return false;
                }
                class426.field6057.method870(0, 1, class24.field414.field2325, false);
                class199.field2550 = 0;
                ++class534.field7495;
                class677.field9199 = class24.field414.field2325[0] & 255;
            }
            if (~class677.field9199 == 1) {
                if (!class426.field6057.method873(2, (byte) -127)) {
                    return false;
                }
                class426.field6057.method870(0, 2, class24.field414.field2325, false);
                class24.field414.field2354 = 0;
                class677.field9199 = class24.field414.method1107(false);
                class534.field7495 += 2;
                class199.field2550 = 0;
            }
            if (~class677.field9199 < -1) {
                if (!class426.field6057.method873(class677.field9199, (byte) -128)) {
                    return false;
                }
                class24.field414.field2354 = 0;
                class426.field6057.method870(0, class677.field9199, class24.field414.field2325, false);
                class199.field2550 = 0;
                class534.field7495 += class677.field9199;
            }
            class508.field7186 = class455.field6380;
            class455.field6380 = class68.field938;
            class68.field938 = class730.field10219;
            if (class730.field10219 == class437.field6138) {
                int var3 = class24.field414.method1095((byte) 127);
                class398.field5520 = class681.field9312.method1560(var3, 0);
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class56.field810) {
                int var4 = class24.field414.method1107(false);
                int var5 = class24.field414.method1156(-3);
                class461.field6637.method1685((byte) 121, var5, var4);
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class438.field6158) {
                int var6 = class24.field414.method1153(true);
                int var7 = class24.field414.method1117((byte) -73);
                class684.method3762((byte) 59);
                if (var7 == 2) {
                    class97.method651((byte) -50);
                }
                class638.field8834 = var6;
                class279.method1669((byte) 45, var6);
                class504.method2911(false, false);
                class445.method2628(class638.field8834);
                for (int var8 = 0; ~var8 > -101; ++var8) {
                    class709.field9971[var8] = true;
                }
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class130.field1559) {
                class24.field414.field2354 += 28;
                if (class24.field414.method1105(-123)) {
                    class546.method3100((byte) -114, class24.field414, class24.field414.field2354 + -28);
                }
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class537.field7547) {
                class485.method2829(class527.field7442, (byte) 89);
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class175.field2275) {
                class485.method2829(class571.field7962, (byte) 89);
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class233.field3017) {
                int var9 = class24.field414.method1111(-17320);
                class684.method3762((byte) -82);
                class609.method3336(-1, var9, -1, 115, 3);
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class280.field3548) {
                int var10 = class24.field414.method1156(-3);
                int var11 = class24.field414.method1153(true);
                class684.method3762((byte) -66);
                class367.method2257((byte) -58, var10, var11);
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class165.field2115) {
                class485.method2829(class384.field5342, (byte) 89);
                class730.field10219 = null;
                return true;
            } else if (class743.field10377 == class730.field10219) {
                int var12 = class24.field414.method1156(-3);
                int var13 = class24.field414.method1111(-17320);
                class684.method3762((byte) -69);
                class157 var14 = (class157) class148.field1802.method3248((long) var13, 0);
                class157 var15 = (class157) class148.field1802.method3248((long) var12, 0);
                if (var15 != null) {
                    class22.method239(var14 == null || var14.field2028 != var15.field2028, false, var15, 7799);
                }
                if (var14 != null) {
                    var14.method3426((byte) -99);
                    class148.field1802.method3249((long) var12, var14, (byte) -110);
                }
                class460 var16 = class102.method684(5025, var13);
                if (var16 != null) {
                    class663.method3591(16886, var16);
                }
                class460 var17 = class102.method684(5025, var12);
                if (var17 != null) {
                    class663.method3591(16886, var17);
                    class146.method908(true, 256, var17);
                }
                if (~class638.field8834 != 0) {
                    class677.method3641(1, class638.field8834, 31);
                }
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class547.field7714) {
                class485.method2829(class302.field3887, (byte) 89);
                class730.field10219 = null;
                return true;
            } else if (class739.field10341 == class730.field10219) {
                class67.method506(-8224);
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class572.field7996) {
                class485.method2829(class507.field7167, (byte) 89);
                class730.field10219 = null;
                return true;
            } else if (class741.field10356 == class730.field10219) {
                class363.field5164 = class215.field2727;
                if (~class677.field9199 == -1) {
                    class110.field1357 = null;
                    class730.field10219 = null;
                    class414.field5841 = null;
                    class492.field6976 = 0;
                    class760.field10595 = null;
                    return true;
                } else {
                    class414.field5841 = class24.field414.method1106(-1);
                    boolean var18 = ~class24.field414.method1094(255) == -2;
                    if (var18) {
                        class24.field414.method1106(-1);
                    }
                    long var19 = class24.field414.method1093(215350688);
                    class110.field1357 = class541.method3079(0, var19);
                    class34.field525 = class24.field414.method1133(8);
                    int var21 = class24.field414.method1094(255);
                    if (~var21 == -256) {
                        class730.field10219 = null;
                        return true;
                    } else {
                        class492.field6976 = var21;
                        class125[] var22 = new class125[100];
                        for (int var23 = 0; var23 < class492.field6976; ++var23) {
                            var22[var23] = new class125();
                            var22[var23].field1496 = class24.field414.method1106(-1);
                            boolean var29 = ~class24.field414.method1094(255) == -2;
                            if (!var29) {
                                var22[var23].field1500 = var22[var23].field1496;
                            } else {
                                var22[var23].field1500 = class24.field414.method1106(-1);
                            }
                            var22[var23].field1498 = class165.method1022((byte) 114, var22[var23].field1500);
                            var22[var23].field1503 = class24.field414.method1107(false);
                            var22[var23].field1504 = class24.field414.method1133(8);
                            var22[var23].field1505 = class24.field414.method1106(-1);
                            if (var22[var23].field1500.equals(class339.field4374.field7690)) {
                                class274.field3471 = var22[var23].field1504;
                            }
                        }
                        boolean var24 = false;
                        int var25 = class492.field6976;
                        while (~var25 < -1) {
                            --var25;
                            boolean var26 = true;
                            for (int var27 = 0; var27 < var25; ++var27) {
                                if (var22[var27].field1498.compareTo(var22[var27 + 1].field1498) > 0) {
                                    class125 var28 = var22[var27];
                                    var22[var27] = var22[var27 + 1];
                                    var26 = false;
                                    var22[var27 + 1] = var28;
                                }
                            }
                            if (var26) {
                                break;
                            }
                        }
                        class730.field10219 = null;
                        class760.field10595 = var22;
                        return true;
                    }
                }
            } else if (class730.field10219 == class11.field128) {
                String var30 = class24.field414.method1106(-1);
                int var31 = class24.field414.method1107(false);
                String var32 = class674.field9178.method1302(var31, 1).method1655(class24.field414, 0);
                class45.method368(19, var30, var32, (String) null, 0, var30, var31, 0, var30);
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class116.field1423) {
                class485.method2829(class468.field6735, (byte) 89);
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class353.field4725) {
                int var33 = class24.field414.method1156(-3);
                int var34 = class24.field414.method1119(false);
                int var35 = class24.field414.method1117((byte) -73);
                class684.method3762((byte) 119);
                class157 var36 = (class157) class148.field1802.method3248((long) var33, 0);
                if (var36 != null) {
                    class22.method239(var36.field2028 != var34, false, var36, 7799);
                }
                class702.method3895(var35, false, var33, (byte) 123, var34);
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class233.field3016) {
                class485.method2829(class510.field7198, (byte) 89);
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class551.field7747) {
                int var37 = class24.field414.method1144(-15189);
                int var38 = class24.field414.method1107(false);
                if (var38 == 65535) {
                    var38 = -1;
                }
                int var39 = class24.field414.method1144(-15189);
                class684.method3762((byte) -119);
                class34.method310(var37, true, var38, var39);
                class167 var40 = class190.field2488.method3944(256, var38);
                class484.method2816(116, var40.field2156, var40.field2135, var39, var40.field2181);
                class201.method1253(var40.field2183, var39, var40.field2184, var40.field2193, 10);
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class237.field3066) {
                int var41 = class24.field414.method1140((byte) 121);
                class684.method3762((byte) -119);
                class730.field10219 = null;
                class460.field6597 = var41;
                return true;
            } else if (class730.field10219 == class273.field3453) {
                if (~class638.field8834 != 0) {
                    class677.method3641(0, class638.field8834, 31);
                }
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class610.field8446) {
                boolean var42 = class24.field414.method1094(255) == 1;
                String var43 = class24.field414.method1106(-1);
                String var44 = var43;
                if (var42) {
                    var44 = class24.field414.method1106(-1);
                }
                int var45 = class24.field414.method1094(255);
                boolean var46 = false;
                if (var45 <= 1) {
                    if ((!class58.field824 || class332.field4245) && !class525.field7422) {
                        if (var45 <= 1 && class696.method3870(-99, var44)) {
                            var46 = true;
                        }
                    } else {
                        var46 = true;
                    }
                }
                if (!var46 && class247.field3157 == 0) {
                    String var47 = class7.method32(28497, class704.method3904((byte) 68, class24.field414));
                    if (var45 != 2) {
                        if (~var45 == -2) {
                            class45.method368(24, "<img=0>" + var43, var47, (String) null, 0, "<img=0>" + var44, -1, 0, var43);
                        } else {
                            class45.method368(24, var43, var47, (String) null, 0, var44, -1, 0, var43);
                        }
                    } else {
                        class45.method368(24, "<img=1>" + var43, var47, (String) null, 0, "<img=1>" + var44, -1, 0, var43);
                    }
                }
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class449.field6305) {
                int var48 = class24.field414.method1117((byte) -73);
                int var49 = class24.field414.method1154((byte) -66);
                int var50 = class24.field414.method1153(true);
                if (~var50 == -65536) {
                    var50 = -1;
                }
                String var51 = class24.field414.method1106(-1);
                if (~var48 <= -2 && ~var48 >= -9) {
                    if (var51.equalsIgnoreCase("null")) {
                        var51 = null;
                    }
                    class542.field7635[var48 + -1] = var51;
                    class166.field2123[var48 - 1] = var50;
                    class618.field8655[var48 + -1] = var49 == 0;
                }
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class266.field3360) {
                class485.method2829(class685.field9701, (byte) 89);
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class270.field3414) {
                class364.field5167 = ~class677.field9199 >= -3 ? class586.field8151.method3261(class416.field5920, (byte) 82) : class24.field414.method1106(-1);
                class548.field7736 = class677.field9199 > 0 ? class24.field414.method1107(false) : -1;
                if (~class548.field7736 == -65536) {
                    class548.field7736 = -1;
                }
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class497.field7031) {
                byte var52 = class24.field414.method1133(8);
                int var53 = class24.field414.method1107(false);
                class684.method3762((byte) 93);
                class354.method2108(-118, var53, var52);
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class367.field5191) {
                class463.field6710 = class24.field414.method1117((byte) -73);
                class82.field1070 = class24.field414.method1140((byte) 123);
                class730.field10219 = null;
                return true;
            } else if (class89.field1126 == class730.field10219) {
                int var54 = class24.field414.method1122(18726);
                int var55 = class24.field414.method1153(true);
                int var56 = class24.field414.method1156(-3);
                int var57 = class24.field414.method1153(true);
                class684.method3762((byte) 103);
                class484.method2816(-125, var55, var57, var56, var54);
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class510.field7199) {
                boolean var58 = class24.field414.method1094(255) == 1;
                String var59 = class24.field414.method1106(-1);
                String var60 = var59;
                if (var58) {
                    var60 = class24.field414.method1106(-1);
                }
                long var61 = class24.field414.method1093(215350688);
                long var63 = (long) class24.field414.method1107(false);
                long var65 = (long) class24.field414.method1114(93);
                int var67 = class24.field414.method1094(255);
                int var68 = class24.field414.method1107(false);
                long var69 = (var63 << 32) + var65;
                boolean var71 = false;
                int var72 = 0;
                while (true) {
                    if (~var72 <= -101) {
                        if (var67 <= 1 && class696.method3870(-93, var60)) {
                            var71 = true;
                        }
                        break;
                    }
                    if (class493.field6978[var72] == var69) {
                        var71 = true;
                        break;
                    }
                    ++var72;
                }
                if (!var71 && ~class247.field3157 == -1) {
                    class493.field6978[class184.field2420] = var69;
                    class184.field2420 = (class184.field2420 + 1) % 100;
                    String var73 = class674.field9178.method1302(var68, 1).method1655(class24.field414, 0);
                    if (var67 != 2) {
                        if (var67 != 1) {
                            class45.method368(20, var59, var73, class81.method578(37, var61), 0, var60, var68, 0, var59);
                        } else {
                            class45.method368(20, "<img=0>" + var59, var73, class81.method578(37, var61), 0, "<img=0>" + var60, var68, 0, var59);
                        }
                    } else {
                        class45.method368(20, "<img=1>" + var59, var73, class81.method578(37, var61), 0, "<img=1>" + var60, var68, 0, var59);
                    }
                }
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class670.field9159) {
                if (class627.field8740 != null) {
                    class653.method3523(-1, class223.field2944.field617.method3243((byte) -127), -1, -1, false);
                }
                byte[] var74 = new byte[class677.field9199];
                class24.field414.method4213(-4118, var74, class677.field9199, 0);
                String var75 = class324.method1916(var74, 0, (byte) 53, class677.field9199);
                class616.method3383(class223.field2944.field633.method4191((byte) -125) == 1, var75, true, class681.field9312, 109);
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class528.field7448) {
                class145.field1725 = class24.field414.method1137((byte) -110);
                class22.field287 = class215.field2727;
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class184.field2419) {
                int var76 = class24.field414.method1154((byte) -87);
                int var77 = class24.field414.method1154((byte) 82);
                int var78 = class24.field414.method1122(18726);
                if (var78 == 65535) {
                    var78 = -1;
                }
                class323.method1909(var77, (byte) -25, var76, var78);
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class569.field7937) {
                int var79 = class24.field414.method1154((byte) 58);
                int var80 = class24.field414.method1119(false);
                if (var80 == 65535) {
                    var80 = -1;
                }
                int var81 = class24.field414.method1099(true);
                class395.method2354(var80, var79, 0, var81);
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class33.field514) {
                boolean var82 = ~class24.field414.method1094(255) == -2;
                String var83 = class24.field414.method1106(-1);
                String var84 = var83;
                if (var82) {
                    var84 = class24.field414.method1106(-1);
                }
                long var85 = (long) class24.field414.method1107(false);
                long var87 = (long) class24.field414.method1114(121);
                int var89 = class24.field414.method1094(255);
                int var90 = class24.field414.method1107(false);
                long var91 = (var85 << 32) + var87;
                boolean var93 = false;
                int var94 = 0;
                while (true) {
                    if (var94 >= 100) {
                        if (var89 <= 1 && class696.method3870(-110, var84)) {
                            var93 = true;
                        }
                        break;
                    }
                    if (~class493.field6978[var94] == ~var91) {
                        var93 = true;
                        break;
                    }
                    ++var94;
                }
                if (!var93 && class247.field3157 == 0) {
                    class493.field6978[class184.field2420] = var91;
                    class184.field2420 = (class184.field2420 + 1) % 100;
                    String var95 = class674.field9178.method1302(var90, 1).method1655(class24.field414, 0);
                    if (~var89 == -3) {
                        class45.method368(18, "<img=1>" + var83, var95, (String) null, 0, "<img=1>" + var84, var90, 0, var83);
                    } else if (~var89 != -2) {
                        class45.method368(18, var83, var95, (String) null, 0, var84, var90, 0, var83);
                    } else {
                        class45.method368(18, "<img=0>" + var83, var95, (String) null, 0, "<img=0>" + var84, var90, 0, var83);
                    }
                }
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class659.field9047) {
                int var96 = class24.field414.method1153(true);
                int var97 = class24.field414.method1107(false);
                int var98 = class24.field414.method1156(-3);
                class684.method3762((byte) -66);
                class354.method2106(var98, (var96 << 16) + var97, true);
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class313.field3997) {
                int var99 = class24.field414.method1107(false);
                int var100 = class24.field414.method1119(false);
                class684.method3762((byte) 116);
                class416.method2475(-102, var99, var100, 0);
                class730.field10219 = null;
                return true;
            } else if (class93.field1184 == class730.field10219) {
                int var101 = class24.field414.method1144(-15189);
                int var102 = class24.field414.method1137((byte) -86);
                class684.method3762((byte) 106);
                class272.method1628((byte) 24, var101, var102);
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class499.field7060) {
                int var103 = class24.field414.method1154((byte) -120);
                int var104 = var103 >> 2;
                int var105 = 3 & var103;
                int var106 = class427.field6061[var104];
                int var107 = class24.field414.method1122(18726);
                if (~var107 == -65536) {
                    var107 = -1;
                }
                int var108 = class24.field414.method1111(-17320);
                int var109 = (var108 & 1026910220) >> 28;
                int var110 = (268422005 & var108) >> 14;
                int var111 = var110 - class63.field851;
                int var112 = var108 & 16383;
                int var113 = var112 - class753.field10509;
                class557.method3160(var105, var113, var106, var111, var107, false, var109, var104);
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class17.field227) {
                int var114 = class24.field414.method1140((byte) 126);
                int var115 = class24.field414.method1154((byte) 56);
                int var116 = class24.field414.method1095((byte) 116);
                class121.field1453[var114] = var116;
                class615.field8612[var114] = var115;
                class524.field7405[var114] = 1;
                int var117 = class177.field2293[var114] - 1;
                for (int var118 = 0; ~var118 > ~var117; ++var118) {
                    if (~var116 <= ~class621.field8691[var118]) {
                        class524.field7405[var114] = var118 - -2;
                    }
                }
                class739.field10339[class272.method1629(31, class162.field2066++)] = var114;
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class604.field8397) {
                int var119 = class24.field414.method1107(false);
                int var120 = class24.field414.method1107(false);
                int var121 = class24.field414.method1107(false);
                class684.method3762((byte) -113);
                if (class323.field4125[var119] != null) {
                    for (int var122 = var120; ~var121 < ~var122; ++var122) {
                        int var123 = class24.field414.method1114(95);
                        if (~class323.field4125[var119].length < ~var122 && class323.field4125[var119][var122] != null) {
                            class323.field4125[var119][var122].field6496 = var123;
                        }
                    }
                }
                class730.field10219 = null;
                return true;
            } else if (arg0 < 40) {
                return true;
            } else if (class730.field10219 == class148.field1795) {
                int var124 = class24.field414.method1154((byte) 71);
                int var125 = class24.field414.method1094(255);
                int var126 = class24.field414.method1154((byte) -110);
                int var127 = class24.field414.method1122(18726);
                int var128 = class24.field414.method1117((byte) -73);
                class684.method3762((byte) -118);
                class488.field6948[var126] = true;
                class154.field1872[var126] = var128;
                class503.field7078[var126] = var125;
                class157.field2029[var126] = var124;
                class332.field4209[var126] = var127;
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class463.field6709) {
                class218.method1316(0);
                class730.field10219 = null;
                return false;
            } else if (class730.field10219 == class423.field6012) {
                String var129 = class24.field414.method1106(-1);
                Object[] var130 = new Object[var129.length() - -1];
                for (int var131 = var129.length() + -1; var131 >= 0; --var131) {
                    if (~var129.charAt(var131) == -116) {
                        var130[var131 - -1] = class24.field414.method1106(-1);
                    } else {
                        var130[var131 - -1] = new Integer(class24.field414.method1095((byte) 116));
                    }
                }
                var130[0] = new Integer(class24.field414.method1095((byte) 125));
                class684.method3762((byte) 74);
                class575 var132 = new class575();
                var132.field8027 = var130;
                class445.method2625(var132);
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class152.field1849) {
                int var133 = class24.field414.method1144(-15189);
                int var134 = class24.field414.method1122(18726);
                class684.method3762((byte) 125);
                if (~var134 == -65536) {
                    var134 = -1;
                }
                class609.method3336(-1, var133, var134, 95, 2);
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class449.field6308) {
                int var135 = class24.field414.method1158(-32768);
                int var136 = class24.field414.method1095((byte) 121);
                int var137 = class24.field414.method1094(255);
                String var138 = "";
                String var139 = var138;
                if ((1 & var137) != 0) {
                    var138 = class24.field414.method1106(-1);
                    if ((2 & var137) != 0) {
                        var139 = class24.field414.method1106(-1);
                    } else {
                        var139 = var138;
                    }
                }
                String var140 = class24.field414.method1106(-1);
                if (var135 != 99) {
                    if (!var139.equals("") && class696.method3870(-117, var139)) {
                        class730.field10219 = null;
                        return true;
                    }
                    class673.method3627((byte) -126, var138, var139, var135, var138, var136, var140);
                } else {
                    class192.method1210(-80, var140);
                }
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class464.field6714) {
                int var141 = class24.field414.method1111(-17320);
                class684.method3762((byte) -79);
                class157 var142 = (class157) class148.field1802.method3248((long) var141, 0);
                if (var142 != null) {
                    class22.method239(true, false, var142, 7799);
                }
                if (class419.field5958 != null) {
                    class663.method3591(16886, class419.field5958);
                    class419.field5958 = null;
                }
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class288.field3665) {
                int var143 = class24.field414.method1107(false);
                byte var144 = class24.field414.method1131(-128);
                class461.field6637.method1685((byte) 126, var144, var143);
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class722.field10160) {
                class650.method3509(false, (byte) -74);
                class730.field10219 = null;
                return false;
            } else if (class730.field10219 == class715.field10074) {
                int var145 = class24.field414.method1122(18726);
                int var146 = class24.field414.method1094(255);
                boolean var147 = ~(1 & var146) == -2;
                class47.method385(var147, (byte) 95, var145);
                class502.field7067[class272.method1629(31, class416.field5915++)] = var145;
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class179.field2366) {
                int var148 = class24.field414.method1094(255);
                int var149 = class24.field414.method1095((byte) 113);
                class684.method3762((byte) -91);
                class55.method442(var149, var148, (byte) 63);
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class49.field727) {
                class566.method3192(16238, class677.field9199, class24.field414);
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class557.field7807) {
                boolean var150 = class24.field414.method1094(255) == 1;
                String var151 = class24.field414.method1106(-1);
                String var152 = var151;
                if (var150) {
                    var152 = class24.field414.method1106(-1);
                }
                long var153 = (long) class24.field414.method1107(false);
                long var155 = (long) class24.field414.method1114(101);
                int var157 = class24.field414.method1094(255);
                long var158 = (var153 << 32) + var155;
                boolean var160 = false;
                int var161 = 0;
                while (true) {
                    if (var161 >= 100) {
                        if (var157 <= 1) {
                            if ((!class58.field824 || class332.field4245) && !class525.field7422) {
                                if (class696.method3870(-105, var152)) {
                                    var160 = true;
                                }
                            } else {
                                var160 = true;
                            }
                        }
                        break;
                    }
                    if (~class493.field6978[var161] == ~var158) {
                        var160 = true;
                        break;
                    }
                    ++var161;
                }
                if (!var160 && ~class247.field3157 == -1) {
                    class493.field6978[class184.field2420] = var158;
                    class184.field2420 = (class184.field2420 + 1) % 100;
                    String var162 = class7.method32(28497, class704.method3904((byte) 35, class24.field414));
                    if (var157 != 2) {
                        if (var157 != 1) {
                            class45.method368(3, var151, var162, (String) null, 0, var152, -1, 0, var151);
                        } else {
                            class45.method368(7, "<img=0>" + var151, var162, (String) null, 0, "<img=0>" + var152, -1, 0, var151);
                        }
                    } else {
                        class45.method368(7, "<img=1>" + var151, var162, (String) null, 0, "<img=1>" + var152, -1, 0, var151);
                    }
                }
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class479.field6844) {
                int var163 = class24.field414.method1117((byte) -73);
                int var164 = class24.field414.method1140((byte) 124);
                int var165 = class24.field414.method1094(255);
                int var166 = class24.field414.method1094(255);
                int var167 = class24.field414.method1119(false) << 2;
                class684.method3762((byte) -92);
                class7.method31(true, 256, var164, var167, var165, var163, var166);
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class715.field10070) {
                class730.field10219 = null;
                return false;
            } else if (class730.field10219 == class28.field464) {
                class112.field1379 = class215.field2727;
                class730.field10219 = null;
                class17.field235 = 1;
                return true;
            } else if (class730.field10219 == class301.field3878) {
                int var168 = class24.field414.method1094(255);
                boolean var169 = (var168 & 1) == 1;
                String var170 = class24.field414.method1106(-1);
                String var171 = class24.field414.method1106(-1);
                if (var171.equals("")) {
                    var171 = var170;
                }
                String var172 = class24.field414.method1106(-1);
                String var173 = class24.field414.method1106(-1);
                if (var173.equals("")) {
                    var173 = var172;
                }
                if (!var169) {
                    class736.field10317[class497.field7034] = var170;
                    class223.field2934[class497.field7034] = var171;
                    class415.field5866[class497.field7034] = var172;
                    class556.field7801[class497.field7034] = var173;
                    class425.field6051[class497.field7034] = class272.method1629(2, var168) == 2;
                    ++class497.field7034;
                } else {
                    for (int var174 = 0; ~var174 > ~class497.field7034; ++var174) {
                        if (class223.field2934[var174].equals(var173)) {
                            class736.field10317[var174] = var170;
                            class223.field2934[var174] = var171;
                            class415.field5866[var174] = var172;
                            class556.field7801[var174] = var173;
                            break;
                        }
                    }
                }
                class730.field10219 = null;
                class112.field1379 = class215.field2727;
                return true;
            } else if (class88.field1113 == class730.field10219) {
                class131.field1568 = class750.method4189((byte) -121, class24.field414.method1094(255));
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class488.field6942) {
                int var175 = class24.field414.method1119(false);
                if (var175 == 65535) {
                    var175 = -1;
                }
                int var176 = class24.field414.method1156(-3);
                class684.method3762((byte) 61);
                class609.method3336(-1, var176, var175, 100, 1);
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class264.field3347) {
                class515.field7255 = class24.field414.method1131(-128) << 3;
                class380.field5308 = class24.field414.method1140((byte) 122);
                class198.field2543 = class24.field414.method1136((byte) -102) << 3;
                for (class585 var177 = (class585) class497.field7028.method3245(false); var177 != null; var177 = (class585) class497.field7028.method3252(12938)) {
                    int var179 = (int) (var177.field8746 >> 28 & 3L);
                    int var180 = (int) (16383L & var177.field8746);
                    int var181 = -class63.field851 + var180;
                    int var182 = (int) (var177.field8746 >> 14 & 16383L);
                    int var183 = -class753.field10509 + var182;
                    if (~class380.field5308 == ~var179 && ~class515.field7255 >= ~var181 && ~var181 > ~(class515.field7255 - -8) && ~var183 <= ~class198.field2543 && var183 < class198.field2543 + 8) {
                        var177.method3426((byte) -66);
                        if (var181 >= 0 && ~var183 <= -1 && ~var181 > ~class613.field8591 && ~var183 > ~class1.field3) {
                            class203.method1261(class380.field5308, var183, var181, (byte) 30);
                        }
                    }
                }
                for (class63 var178 = (class63) class73.field955.method3111(76); var178 != null; var178 = (class63) class73.field955.method3116(-61)) {
                    if (~class515.field7255 >= ~var178.field856 && ~var178.field856 > ~(class515.field7255 - -8) && ~var178.field848 <= ~class198.field2543 && class198.field2543 + 8 > var178.field848 && class380.field5308 == var178.field857) {
                        var178.field847 = 0;
                    }
                }
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class105.field1288) {
                class485.method2829(class573.field8005, (byte) 89);
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class383.field5334) {
                if (!class189.method1198(class668.field9150, -124)) {
                    class471.field6763 = 30 * class24.field414.method1107(false);
                } else {
                    class471.field6763 = (int) ((float) class24.field414.method1107(false) * 2.5F);
                }
                class730.field10219 = null;
                class22.field287 = class215.field2727;
                return true;
            } else if (class730.field10219 == class276.field3492) {
                class684.method3762((byte) 122);
                class682.method3700(-696);
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class170.field2242) {
                class485.method2829(class754.field10516, (byte) 89);
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class588.field8212) {
                class67.field886 = class24.field414.method1094(255);
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class650.field8931) {
                int var184 = class24.field414.method1119(false);
                int var185 = class24.field414.method1144(-15189);
                class684.method3762((byte) -99);
                class217.method1312(12, var185, var184);
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class403.field5589) {
                String var186 = class24.field414.method1106(-1);
                String var187 = class7.method32(28497, class704.method3904((byte) 87, class24.field414));
                class673.method3627((byte) -125, var186, var186, 6, var186, 0, var187);
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class200.field2554) {
                int var188 = class24.field414.method1117((byte) -73);
                int var189 = class24.field414.method1119(false);
                class461.field6637.method1679(var189, var188, 4733);
                class730.field10219 = null;
                return true;
            } else if (class753.field10512 == class730.field10219) {
                class380.field5308 = class24.field414.method1094(255);
                class198.field2543 = class24.field414.method1131(-128) << 3;
                class515.field7255 = class24.field414.method1131(-128) << 3;
                while (~class24.field414.field2354 > ~class677.field9199) {
                    class182 var190 = class160.method991(4)[class24.field414.method1094(255)];
                    class485.method2829(var190, (byte) 89);
                }
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class434.field6116) {
                boolean var191 = ~class24.field414.method1094(255) == -2;
                class684.method3762((byte) 63);
                class245.field3148 = var191;
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class700.field9878) {
                int var192 = class24.field414.method1156(-3);
                String var193 = class24.field414.method1106(-1);
                class684.method3762((byte) -69);
                class357.method2185(var193, var192, true);
                class730.field10219 = null;
                return true;
            } else if (class739.field10346 == class730.field10219) {
                int var194 = class24.field414.method1156(-3);
                class684.method3762((byte) -113);
                class609.method3336(0, var194, class456.field6387, 116, 5);
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class379.field5298) {
                int var195 = class24.field414.method1122(18726);
                String var196 = class24.field414.method1106(-1);
                class684.method3762((byte) 75);
                class407.method2415(126, var196, var195);
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class499.field7051) {
                class461.field6637.method1680(-117);
                class730.field10219 = null;
                class111.field1369 += 32;
                return true;
            } else if (class730.field10219 == class411.field5797) {
                int var197 = class24.field414.method1119(false);
                int var198 = class24.field414.method1144(-15189);
                class684.method3762((byte) -115);
                class394.method2347(var197, true, var198);
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class654.field9001) {
                int var199 = class24.field414.method1107(false);
                if (~var199 == -65536) {
                    var199 = -1;
                }
                int var200 = class24.field414.method1094(255);
                int var201 = class24.field414.method1107(false);
                int var202 = class24.field414.method1094(255);
                class487.method2846(var201, var202, (byte) -48, var199, 256, true, var200);
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class386.field5382) {
                boolean var203 = class24.field414.method1094(255) == 1;
                String var204 = class24.field414.method1106(-1);
                String var205 = var204;
                if (var203) {
                    var205 = class24.field414.method1106(-1);
                }
                long var206 = class24.field414.method1093(215350688);
                long var208 = (long) class24.field414.method1107(false);
                long var210 = (long) class24.field414.method1114(87);
                int var212 = class24.field414.method1094(255);
                long var213 = (var208 << 32) + var210;
                boolean var215 = false;
                int var216 = 0;
                while (true) {
                    if (var216 >= 100) {
                        if (~var212 >= -2) {
                            if ((!class58.field824 || class332.field4245) && !class525.field7422) {
                                if (class696.method3870(-127, var205)) {
                                    var215 = true;
                                }
                            } else {
                                var215 = true;
                            }
                        }
                        break;
                    }
                    if (class493.field6978[var216] == var213) {
                        var215 = true;
                        break;
                    }
                    ++var216;
                }
                if (!var215 && class247.field3157 == 0) {
                    class493.field6978[class184.field2420] = var213;
                    class184.field2420 = (class184.field2420 + 1) % 100;
                    String var217 = class7.method32(28497, class704.method3904((byte) -100, class24.field414));
                    if (var212 != 2 && var212 != 3) {
                        if (var212 == 1) {
                            class45.method368(9, "<img=0>" + var204, var217, class81.method578(37, var206), 0, "<img=0>" + var205, -1, 0, var204);
                        } else {
                            class45.method368(9, var204, var217, class81.method578(37, var206), 0, var205, -1, 0, var204);
                        }
                    } else {
                        class45.method368(9, "<img=1>" + var204, var217, class81.method578(37, var206), 0, "<img=1>" + var205, -1, 0, var204);
                    }
                }
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class569.field7942) {
                String var218 = class24.field414.method1106(-1);
                boolean var219 = ~class24.field414.method1094(255) == -2;
                String var220;
                if (!var219) {
                    var220 = var218;
                } else {
                    var220 = class24.field414.method1106(-1);
                }
                int var221 = class24.field414.method1107(false);
                byte var222 = class24.field414.method1133(8);
                boolean var223 = false;
                if (var222 == -128) {
                    var223 = true;
                }
                if (var223) {
                    if (class492.field6976 == 0) {
                        class730.field10219 = null;
                        return true;
                    }
                    boolean var224 = false;
                    int var225;
                    for (var225 = 0; var225 < class492.field6976 && (!class760.field10595[var225].field1500.equals(var220) || class760.field10595[var225].field1503 != var221); ++var225) {
                    }
                    if (class492.field6976 > var225) {
                        while (var225 < class492.field6976 + -1) {
                            class760.field10595[var225] = class760.field10595[var225 + 1];
                            ++var225;
                        }
                        --class492.field6976;
                        class760.field10595[class492.field6976] = null;
                    }
                } else {
                    String var226 = class24.field414.method1106(-1);
                    class125 var227 = new class125();
                    var227.field1496 = var218;
                    var227.field1500 = var220;
                    var227.field1498 = class165.method1022((byte) 106, var227.field1500);
                    var227.field1505 = var226;
                    var227.field1504 = var222;
                    var227.field1503 = var221;
                    int var228;
                    for (var228 = class492.field6976 + -1; ~var228 <= -1; --var228) {
                        int var229 = class760.field10595[var228].field1498.compareTo(var227.field1498);
                        if (~var229 == -1) {
                            class760.field10595[var228].field1503 = var221;
                            class760.field10595[var228].field1504 = var222;
                            class760.field10595[var228].field1505 = var226;
                            if (var220.equals(class339.field4374.field7690)) {
                                class274.field3471 = var222;
                            }
                            class730.field10219 = null;
                            class363.field5164 = class215.field2727;
                            return true;
                        }
                        if (~var229 > -1) {
                            break;
                        }
                    }
                    if (class492.field6976 >= class760.field10595.length) {
                        class730.field10219 = null;
                        return true;
                    }
                    for (int var230 = class492.field6976 - 1; ~var228 > ~var230; --var230) {
                        class760.field10595[var230 + 1] = class760.field10595[var230];
                    }
                    if (~class492.field6976 == -1) {
                        class760.field10595 = new class125[100];
                    }
                    class760.field10595[var228 + 1] = var227;
                    ++class492.field6976;
                    if (var220.equals(class339.field4374.field7690)) {
                        class274.field3471 = var222;
                    }
                }
                class730.field10219 = null;
                class363.field5164 = class215.field2727;
                return true;
            } else if (class98.field1223 == class730.field10219) {
                int var231 = class24.field414.method1144(-15189);
                int var232 = class24.field414.method1107(false);
                if (var232 == 65535) {
                    var232 = -1;
                }
                int var233 = class24.field414.method1119(false);
                if (~var233 == -65536) {
                    var233 = -1;
                }
                int var234 = class24.field414.method1107(false);
                class684.method3762((byte) -51);
                for (int var235 = var232; ~var235 >= ~var233; ++var235) {
                    long var236 = ((long) var231 << 32) + (long) var235;
                    class28 var238 = (class28) class418.field5952.method3248(var236, 0);
                    class28 var239;
                    if (var238 == null) {
                        if (~var235 != 0) {
                            var239 = new class28(0, var234);
                        } else {
                            var239 = new class28(class102.method684(5025, var231).field6617.field465, var234);
                        }
                    } else {
                        var239 = new class28(var238.field465, var234);
                        var238.method3426((byte) -67);
                    }
                    class418.field5952.method3249(var236, var239, (byte) -117);
                }
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class487.field6930) {
                String var240 = class24.field414.method1106(-1);
                int var241 = class24.field414.method1153(true);
                class684.method3762((byte) -67);
                class407.method2415(125, var240, var241);
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class669.field9157) {
                boolean var242 = class24.field414.method1094(255) == 1;
                byte[] var243 = new byte[class677.field9199 - 1];
                class24.field414.method1096(class677.field9199 + -1, 0, var243, 12050);
                class508.method2933(var243, var242, 127);
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class386.field5380) {
                class485.method2829(class250.field3174, (byte) 89);
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class62.field841) {
                class485.method2829(class635.field8796, (byte) 89);
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class603.field8368) {
                int var244 = class24.field414.method1119(false);
                int var245 = class24.field414.method1153(true);
                int var246 = class24.field414.method1153(true);
                int var247 = class24.field414.method1095((byte) 121);
                class684.method3762((byte) 75);
                class609.method3336(var246, var247, var244 << 16 | var245, 105, 7);
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class519.field7304) {
                int var248 = class24.field414.method1140((byte) 124);
                int var249 = class24.field414.method1153(true);
                class684.method3762((byte) -106);
                class272.method1630(var249, var248, 24575, true);
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class476.field6802) {
                class497.field7034 = class24.field414.method1094(255);
                for (int var250 = 0; var250 < class497.field7034; ++var250) {
                    class736.field10317[var250] = class24.field414.method1106(-1);
                    class223.field2934[var250] = class24.field414.method1106(-1);
                    if (class223.field2934[var250].equals("")) {
                        class223.field2934[var250] = class736.field10317[var250];
                    }
                    class415.field5866[var250] = class24.field414.method1106(-1);
                    class556.field7801[var250] = class24.field414.method1106(-1);
                    if (class556.field7801[var250].equals("")) {
                        class556.field7801[var250] = class415.field5866[var250];
                    }
                    class425.field6051[var250] = false;
                }
                class112.field1379 = class215.field2727;
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class419.field5961) {
                class416.method2478(class24.field414.method1106(-1), (byte) -105);
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class288.field3663) {
                int var251 = class24.field414.method1113(-18161);
                int var252 = class24.field414.method1145(38);
                int var253 = class24.field414.method1144(-15189);
                class684.method3762((byte) 95);
                class249.method1522((byte) 125, var253, var252, var251);
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class668.field9145) {
                int var254 = class24.field414.method1107(false);
                int var255 = class24.field414.method1094(255);
                boolean var256 = ~(var255 & 1) == -2;
                while (~class24.field414.field2354 > ~class677.field9199) {
                    int var257 = class24.field414.method1158(-32768);
                    int var258 = class24.field414.method1107(false);
                    int var259 = 0;
                    if (var258 != 0) {
                        var259 = class24.field414.method1094(255);
                        if (~var259 == -256) {
                            var259 = class24.field414.method1095((byte) 116);
                        }
                    }
                    class709.method3917(var258 + -1, var259, -122, var254, var257, var256);
                }
                class502.field7067[class272.method1629(31, class416.field5915++)] = var254;
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class29.field470) {
                int var260 = class24.field414.method1154((byte) 80);
                int var261 = class24.field414.method1156(-3);
                int var262 = class24.field414.method1153(true);
                int var263 = class24.field414.method1122(18726);
                int var264 = class24.field414.method1122(18726);
                boolean var265 = (128 & var260) != 0;
                int var266 = var260 & 7;
                int var267 = 15 & var260 >> 3;
                if (~var267 == -16) {
                    var267 = -1;
                }
                if (~(var261 >> 30) != -1) {
                    int var268 = (var261 & 949862319) >> 28;
                    int var269 = (var261 >> 14 & 16383) + -class63.field851;
                    int var270 = (var261 & 16383) + -class753.field10509;
                    if (var269 >= 0 && var270 >= 0 && ~var269 > ~class613.field8591 && class1.field3 > var270) {
                        int var271 = var269 * 512 + 256;
                        int var272 = var270 * 512 - -256;
                        int var273 = var268;
                        if (~var268 > -4 && class739.method4140((byte) 125, var270, var269)) {
                            var273 = var268 + 1;
                        }
                        class561 var274 = new class561(var263, var264, class266.field3368, var268, var273, var271, -var262 + class592.method3287(false, var272, var268, var271), var272, var269, var269, var270, var270, var266);
                        class631.field8763.method3110(new class64(var274), 1);
                    }
                } else if (~(var261 >> 29) != -1) {
                    int var275 = 65535 & var261;
                    class247 var276 = (class247) class563.field7875.method3248((long) var275, 0);
                    if (var276 != null) {
                        if (~var263 == -65536) {
                            var263 = -1;
                        }
                        class124 var277 = var276.field3158;
                        boolean var278 = true;
                        int var279 = !var265 ? var277.field395 : var277.field367;
                        if (~var263 != 0 && var279 != -1) {
                            if (~var263 == ~var279) {
                                class716 var280 = class250.field3177.method3616((byte) 125, var263);
                                if (var280.field10105 && ~var280.field10096 != 0) {
                                    class747 var281 = class646.field8903.method643(var280.field10096, -73);
                                    int var282 = var281.field10437;
                                    if (~var282 != -1 && ~var282 != -3) {
                                        if (var282 == 1) {
                                            var278 = true;
                                        }
                                    } else {
                                        var278 = false;
                                    }
                                }
                            } else {
                                class716 var283 = class250.field3177.method3616((byte) 112, var263);
                                class716 var284 = class250.field3177.method3616((byte) 119, var279);
                                if (var283.field10096 != -1 && var284.field10096 != -1) {
                                    class747 var285 = class646.field8903.method643(var283.field10096, -99);
                                    class747 var286 = class646.field8903.method643(var284.field10096, -119);
                                    if (~var286.field10447 < ~var285.field10447) {
                                        var278 = false;
                                    }
                                }
                            }
                        }
                        if (var278) {
                            if (!var265) {
                                var277.field395 = var263;
                                var277.field379 = var262;
                                var277.field400 = 0;
                                var277.field419 = 0;
                                var277.field361 = 1;
                                var277.field314 = var266;
                                var277.field403 = var267;
                                var277.field383 = class266.field3368 + var264;
                                if (class266.field3368 < var277.field383) {
                                    var277.field400 = -1;
                                }
                                if (var277.field395 != -1 && ~class266.field3368 == ~var277.field383) {
                                    int var287 = class250.field3177.method3616((byte) 127, var277.field395).field10096;
                                    if (~var287 != 0) {
                                        class747 var288 = class646.field8903.method643(var287, -64);
                                        if (var288 != null && var288.field10458 != null && !var277.field417) {
                                            class107.method729(0, var288, var277, -4855);
                                        }
                                    }
                                }
                            } else {
                                var277.field392 = 0;
                                var277.field397 = var262;
                                var277.field329 = 0;
                                var277.field367 = var263;
                                var277.field368 = var267;
                                var277.field374 = var266;
                                var277.field317 = class266.field3368 + var264;
                                var277.field338 = 1;
                                if (~var277.field317 < ~class266.field3368) {
                                    var277.field329 = -1;
                                }
                                if (var277.field367 != -1 && ~class266.field3368 == ~var277.field317) {
                                    int var289 = class250.field3177.method3616((byte) 116, var277.field367).field10096;
                                    if (~var289 != 0) {
                                        class747 var290 = class646.field8903.method643(var289, -61);
                                        if (var290 != null && var290.field10458 != null && !var277.field417) {
                                            class107.method729(0, var290, var277, -4855);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (~(var261 >> 28) != -1) {
                    int var291 = var261 & 65535;
                    class546 var292;
                    if (class456.field6387 == var291) {
                        var292 = class339.field4374;
                    } else {
                        var292 = class447.field6287[var291];
                    }
                    if (var292 != null) {
                        if (var263 == 65535) {
                            var263 = -1;
                        }
                        boolean var293 = true;
                        int var294 = var265 ? var292.field367 : var292.field395;
                        if (var263 != -1 && var294 != -1) {
                            if (~var263 != ~var294) {
                                class716 var295 = class250.field3177.method3616((byte) 107, var263);
                                class716 var296 = class250.field3177.method3616((byte) 108, var294);
                                if (var295.field10096 != -1 && var296.field10096 != -1) {
                                    class747 var297 = class646.field8903.method643(var295.field10096, -69);
                                    class747 var298 = class646.field8903.method643(var296.field10096, -61);
                                    if (~var298.field10447 < ~var297.field10447) {
                                        var293 = false;
                                    }
                                }
                            } else {
                                class716 var299 = class250.field3177.method3616((byte) 109, var263);
                                if (var299.field10105 && var299.field10096 != -1) {
                                    class747 var300 = class646.field8903.method643(var299.field10096, -73);
                                    int var301 = var300.field10437;
                                    if (var301 != 0 && ~var301 != -3) {
                                        if (var301 == 1) {
                                            var293 = true;
                                        }
                                    } else {
                                        var293 = false;
                                    }
                                }
                            }
                        }
                        if (var293) {
                            if (!var265) {
                                var292.field419 = 0;
                                var292.field361 = 1;
                                var292.field395 = var263;
                                var292.field403 = var267;
                                var292.field383 = class266.field3368 + var264;
                                var292.field314 = var266;
                                var292.field400 = 0;
                                var292.field379 = var262;
                                if (~class266.field3368 > ~var292.field383) {
                                    var292.field400 = -1;
                                }
                                if (~var292.field395 == -65536) {
                                    var292.field395 = -1;
                                }
                                if (var292.field395 != -1 && ~class266.field3368 == ~var292.field383) {
                                    int var302 = class250.field3177.method3616((byte) 113, var292.field395).field10096;
                                    if (var302 != -1) {
                                        class747 var303 = class646.field8903.method643(var302, -111);
                                        if (var303 != null && var303.field10458 != null && !var292.field417) {
                                            class107.method729(0, var303, var292, -4855);
                                        }
                                    }
                                }
                            } else {
                                var292.field368 = var267;
                                var292.field397 = var262;
                                var292.field367 = var263;
                                var292.field329 = 0;
                                var292.field374 = var266;
                                var292.field338 = 1;
                                var292.field317 = class266.field3368 - -var264;
                                var292.field392 = 0;
                                if (~var292.field367 == -65536) {
                                    var292.field367 = -1;
                                }
                                if (~var292.field317 < ~class266.field3368) {
                                    var292.field329 = -1;
                                }
                                if (var292.field367 != -1 && ~class266.field3368 == ~var292.field317) {
                                    int var304 = class250.field3177.method3616((byte) 105, var292.field367).field10096;
                                    if (~var304 != 0) {
                                        class747 var305 = class646.field8903.method643(var304, -92);
                                        if (var305 != null && var305.field10458 != null && !var292.field417) {
                                            class107.method729(0, var305, var292, -4855);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class206.field2648) {
                int var306 = class24.field414.method1094(255);
                int var307 = var306 >> 5;
                int var308 = var306 & 31;
                if (~var308 == -1) {
                    class498.field7043[var307] = null;
                    class730.field10219 = null;
                    return true;
                } else {
                    class126 var309 = new class126();
                    var309.field1507 = var308;
                    var309.field1512 = class24.field414.method1094(255);
                    if (~var309.field1512 <= -1 && var309.field1512 < class487.field6935.length) {
                        if (var309.field1507 != 1 && ~var309.field1507 != -11) {
                            if (var309.field1507 >= 2 && var309.field1507 <= 6) {
                                if (~var309.field1507 == -3) {
                                    var309.field1516 = 256;
                                    var309.field1517 = 256;
                                }
                                if (var309.field1507 == 3) {
                                    var309.field1516 = 0;
                                    var309.field1517 = 256;
                                }
                                if (var309.field1507 == 4) {
                                    var309.field1516 = 512;
                                    var309.field1517 = 256;
                                }
                                if (~var309.field1507 == -6) {
                                    var309.field1517 = 0;
                                    var309.field1516 = 256;
                                }
                                if (~var309.field1507 == -7) {
                                    var309.field1517 = 512;
                                    var309.field1516 = 256;
                                }
                                var309.field1507 = 2;
                                var309.field1519 = class24.field414.method1094(255);
                                var309.field1516 += class24.field414.method1107(false) + -class63.field851 << 9;
                                var309.field1517 += class24.field414.method1107(false) - class753.field10509 << 9;
                                var309.field1508 = class24.field414.method1094(255) << 2;
                                var309.field1514 = class24.field414.method1107(false);
                            }
                        } else {
                            var309.field1515 = class24.field414.method1107(false);
                            class24.field414.field2354 += 6;
                        }
                        var309.field1518 = class24.field414.method1107(false);
                        if (var309.field1518 == 65535) {
                            var309.field1518 = -1;
                        }
                        class498.field7043[var307] = var309;
                    }
                    class730.field10219 = null;
                    return true;
                }
            } else if (class730.field10219 == class415.field5871) {
                int var310 = class24.field414.method1154((byte) -125);
                int var311 = class24.field414.method1117((byte) -73);
                int var312 = class24.field414.method1117((byte) -73);
                int var313 = class24.field414.method1122(18726) << 2;
                int var314 = class24.field414.method1094(255);
                class684.method3762((byte) -62);
                class527.method3022(var310, var312, var314, -69, var313, var311);
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class293.field3803) {
                class661.field9057 = class24.field414.method1143((byte) 124);
                class58.field824 = class24.field414.method1094(255) == 1;
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class345.field4467) {
                class485.method2829(class513.field7231, (byte) 89);
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class494.field6996) {
                while (class24.field414.field2354 < class677.field9199) {
                    boolean var325 = class24.field414.method1094(255) == 1;
                    String var326 = class24.field414.method1106(-1);
                    String var327 = class24.field414.method1106(-1);
                    int var328 = class24.field414.method1107(false);
                    int var329 = class24.field414.method1094(255);
                    String var330 = "";
                    boolean var331 = false;
                    if (var328 > 0) {
                        var330 = class24.field414.method1106(-1);
                        var331 = class24.field414.method1094(255) == 1;
                    }
                    for (int var332 = 0; ~class727.field10184 < ~var332; ++var332) {
                        if (!var325) {
                            if (var326.equals(class4.field34[var332])) {
                                if (class323.field4122[var332] != var328) {
                                    boolean var333 = true;
                                    for (class248 var334 = (class248) class159.field2044.method1839(-124); var334 != null; var334 = (class248) class159.field2044.method1836((byte) -26)) {
                                        if (var334.field3165.equals(var326)) {
                                            if (var328 != 0 && var334.field3160 == 0) {
                                                var334.method3869(true);
                                                var333 = false;
                                            } else if (var328 == 0 && var334.field3160 != 0) {
                                                var334.method3869(true);
                                                var333 = false;
                                            }
                                        }
                                    }
                                    if (var333) {
                                        class159.field2044.method1840(18, new class248(var326, var328));
                                    }
                                    class323.field4122[var332] = var328;
                                }
                                class17.field238[var332] = var327;
                                class536.field7518[var332] = var330;
                                class292.field3779[var332] = var329;
                                class315.field4044[var332] = var331;
                                var326 = null;
                                break;
                            }
                        } else if (var327.equals(class4.field34[var332])) {
                            class4.field34[var332] = var326;
                            var326 = null;
                            class17.field238[var332] = var327;
                            break;
                        }
                    }
                    if (var326 != null && class727.field10184 < 200) {
                        class4.field34[class727.field10184] = var326;
                        class17.field238[class727.field10184] = var327;
                        class323.field4122[class727.field10184] = var328;
                        class536.field7518[class727.field10184] = var330;
                        class292.field3779[class727.field10184] = var329;
                        class315.field4044[class727.field10184] = var331;
                        ++class727.field10184;
                    }
                }
                class112.field1379 = class215.field2727;
                class17.field235 = 2;
                boolean var315 = false;
                int var316 = class727.field10184;
                while (var316 > 0) {
                    boolean var317 = true;
                    --var316;
                    for (int var318 = 0; ~var316 < ~var318; ++var318) {
                        if (~class323.field4122[var318] != ~class575.field8035.field2454 && class323.field4122[var318 - -1] == class575.field8035.field2454 || class323.field4122[var318] == 0 && class323.field4122[var318 + 1] != 0) {
                            int var319 = class323.field4122[var318];
                            class323.field4122[var318] = class323.field4122[var318 + 1];
                            class323.field4122[var318 - -1] = var319;
                            String var320 = class536.field7518[var318];
                            class536.field7518[var318] = class536.field7518[var318 - -1];
                            class536.field7518[var318 + 1] = var320;
                            String var321 = class4.field34[var318];
                            class4.field34[var318] = class4.field34[var318 + 1];
                            class4.field34[var318 + 1] = var321;
                            String var322 = class17.field238[var318];
                            class17.field238[var318] = class17.field238[var318 + 1];
                            class17.field238[var318 - -1] = var322;
                            int var323 = class292.field3779[var318];
                            class292.field3779[var318] = class292.field3779[var318 - -1];
                            class292.field3779[var318 + 1] = var323;
                            boolean var324 = class315.field4044[var318];
                            class315.field4044[var318] = class315.field4044[var318 - -1];
                            var317 = false;
                            class315.field4044[var318 + 1] = var324;
                        }
                    }
                    if (var317) {
                        break;
                    }
                }
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class540.field7608) {
                for (int var335 = 0; class447.field6287.length > var335; ++var335) {
                    if (class447.field6287[var335] != null) {
                        class447.field6287[var335].field408 = null;
                        class447.field6287[var335].field376 = -1;
                    }
                }
                for (int var336 = 0; ~var336 > ~class676.field9195; ++var336) {
                    class38.field559[var336].field3158.field408 = null;
                    class38.field559[var336].field3158.field376 = -1;
                }
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class552.field7755) {
                boolean var337 = class24.field414.method1094(255) == 1;
                String var338 = class24.field414.method1106(-1);
                String var339 = var338;
                if (var337) {
                    var339 = class24.field414.method1106(-1);
                }
                int var340 = class24.field414.method1094(255);
                int var341 = class24.field414.method1107(false);
                boolean var342 = false;
                if (~var340 >= -2 && class696.method3870(-126, var339)) {
                    var342 = true;
                }
                if (!var342 && ~class247.field3157 == -1) {
                    String var343 = class674.field9178.method1302(var341, 1).method1655(class24.field414, 0);
                    if (var340 != 2) {
                        if (var340 != 1) {
                            class45.method368(25, var338, var343, (String) null, 0, var339, var341, 0, var338);
                        } else {
                            class45.method368(25, "<img=0>" + var338, var343, (String) null, 0, "<img=0>" + var339, var341, 0, var338);
                        }
                    } else {
                        class45.method368(25, "<img=1>" + var338, var343, (String) null, 0, "<img=1>" + var339, var341, 0, var338);
                    }
                }
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class340.field4387) {
                class650.method3509(class667.field9134, (byte) -74);
                class730.field10219 = null;
                return false;
            } else if (class730.field10219 == class233.field3013) {
                int var344 = class24.field414.method1153(true);
                class684.method3762((byte) 61);
                class463.method2743(var344, -2);
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class632.field8775) {
                int var345 = class24.field414.method1107(false);
                if (var345 == 65535) {
                    var345 = -1;
                }
                int var346 = class24.field414.method1094(255);
                int var347 = class24.field414.method1107(false);
                int var348 = class24.field414.method1094(255);
                int var349 = class24.field414.method1107(false);
                class487.method2846(var347, var348, (byte) -116, var345, var349, false, var346);
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class268.field3392) {
                int var350 = class24.field414.method1107(false);
                class546 var351;
                if (~class456.field6387 == ~var350) {
                    var351 = class339.field4374;
                } else {
                    var351 = class447.field6287[var350];
                }
                if (var351 == null) {
                    class730.field10219 = null;
                    return true;
                } else {
                    int var352 = class24.field414.method1107(false);
                    int var353 = class24.field414.method1094(255);
                    boolean var354 = (var352 & 32768) != 0;
                    if (var351.field7690 != null && var351.field7665 != null) {
                        boolean var355 = false;
                        if (var353 <= 1) {
                            if (var354 || (!class58.field824 || class332.field4245) && !class525.field7422) {
                                if (class696.method3870(-104, var351.field7690)) {
                                    var355 = true;
                                }
                            } else {
                                var355 = true;
                            }
                        }
                        if (!var355 && ~class247.field3157 == -1) {
                            int var356 = -1;
                            String var358;
                            if (var354) {
                                var352 &= 32767;
                                class533 var357 = class90.method627(class24.field414, 3);
                                var356 = var357.field7488;
                                var358 = var357.field7491.method1655(class24.field414, 0);
                            } else {
                                var358 = class7.method32(28497, class704.method3904((byte) 89, class24.field414));
                            }
                            var351.field334 = var358.trim();
                            var351.field356 = var352 & 255;
                            var351.field345 = 150;
                            var351.field409 = var352 >> 8;
                            int var359;
                            if (~var353 != -2 && ~var353 != -3) {
                                var359 = var354 ? 17 : 2;
                            } else {
                                var359 = var354 ? 17 : 1;
                            }
                            if (var353 == 2) {
                                class45.method368(var359, "<img=1>" + var351.method3101(101, true), var358, (String) null, 0, "<img=1>" + var351.method3105((byte) 112, false), var356, 0, var351.field7656);
                            } else if (var353 != 1) {
                                class45.method368(var359, var351.method3101(127, true), var358, (String) null, 0, var351.method3105((byte) 96, false), var356, 0, var351.field7656);
                            } else {
                                class45.method368(var359, "<img=0>" + var351.method3101(102, true), var358, (String) null, 0, "<img=0>" + var351.method3105((byte) 127, false), var356, 0, var351.field7656);
                            }
                        }
                    }
                    class730.field10219 = null;
                    return true;
                }
            } else if (class730.field10219 == class390.field5433) {
                class668.method3613(class24.field414, class677.field9199, class681.field9312, 10653);
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class416.field5914) {
                int var360 = class24.field414.method1144(-15189);
                int var361 = class24.field414.method1122(18726);
                if (var361 == 65535) {
                    var361 = -1;
                }
                int var362 = class24.field414.method1111(-17320);
                int var363 = class24.field414.method1153(true);
                if (var363 == 65535) {
                    var363 = -1;
                }
                class684.method3762((byte) 120);
                for (int var364 = var361; var364 <= var363; ++var364) {
                    long var365 = ((long) var360 << 32) - -((long) var364);
                    class28 var367 = (class28) class418.field5952.method3248(var365, 0);
                    class28 var368;
                    if (var367 == null) {
                        if (~var364 != 0) {
                            var368 = new class28(var362, -1);
                        } else {
                            var368 = new class28(var362, class102.method684(5025, var360).field6617.field466);
                        }
                    } else {
                        var368 = new class28(var362, var367.field466);
                        var367.method3426((byte) -31);
                    }
                    class418.field5952.method3249(var365, var368, (byte) 107);
                }
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class622.field8696) {
                int var369 = class24.field414.method1094(255);
                if (class24.field414.method1094(255) == 0) {
                    class584.field8107[var369] = new class412();
                } else {
                    --class24.field414.field2354;
                    class584.field8107[var369] = new class412(class24.field414);
                }
                class730.field10219 = null;
                class380.field5317 = class215.field2727;
                return true;
            } else if (class730.field10219 == class181.field2377) {
                class702.method3893(119);
                class730.field10219 = null;
                return true;
            } else if (class83.field1081 == class730.field10219) {
                int var370 = class24.field414.method1122(18726);
                int var371 = class24.field414.method1111(-17320);
                class461.field6637.method1679(var370, var371, 4733);
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class426.field6052) {
                int var372 = class24.field414.method1156(-3);
                int var373 = class24.field414.method1107(false);
                class684.method3762((byte) -96);
                if (~var373 == -65536) {
                    var373 = -1;
                }
                class702.method3894(var373, var372, -128);
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class420.field5971) {
                int var374 = class24.field414.method1156(-3);
                int var375 = class24.field414.method1153(true);
                class684.method3762((byte) -121);
                class354.method2108(-14, var375, var374);
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class406.field5729) {
                int var376 = class24.field414.method1107(false);
                int var377 = class24.field414.method1094(255);
                boolean var378 = ~(1 & var377) == -2;
                class554.method3150(var376, (byte) -11, var378);
                int var379 = class24.field414.method1107(false);
                for (int var380 = 0; ~var379 < ~var380; ++var380) {
                    int var381 = class24.field414.method1107(false);
                    int var382 = class24.field414.method1154((byte) -65);
                    if (var382 == 255) {
                        var382 = class24.field414.method1111(-17320);
                    }
                    class709.method3917(var381 - 1, var382, 122, var376, var380, var378);
                }
                class502.field7067[class272.method1629(class416.field5915++, 31)] = var376;
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class613.field8509) {
                int var383 = class24.field414.method1107(false);
                class684.method3762((byte) 97);
                class623.method3410(var383, -127);
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class200.field2564) {
                int var384 = class24.field414.method1140((byte) 127);
                int var385 = class24.field414.method1094(255);
                if (var384 == 255) {
                    var385 = -1;
                    var384 = -1;
                }
                class412.method2443(8, var385, var384);
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class109.field1340) {
                class657.method3568(-112);
                class730.field10219 = null;
                return false;
            } else if (class730.field10219 == class332.field4282) {
                class517.field7279 = class24.field414.method1094(255);
                class730.field10219 = null;
                class22.field287 = class215.field2727;
                return true;
            } else if (class82.field1069 == class730.field10219) {
                int var386 = class24.field414.method1107(false);
                if (~var386 == -65536) {
                    var386 = -1;
                }
                int var387 = class24.field414.method1094(255);
                int var388 = class24.field414.method1107(false);
                int var389 = class24.field414.method1094(255);
                int var390 = class24.field414.method1107(false);
                class140.method869(var389, var386, var390, var387, (byte) 42, var388);
                class730.field10219 = null;
                return true;
            } else if (class95.field1201 == class730.field10219) {
                int var391 = class24.field414.method1119(false);
                int var392 = class24.field414.method1144(-15189);
                class684.method3762((byte) -85);
                class631.method3435(var391, 6, var392);
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class645.field8895) {
                class198.field2543 = class24.field414.method1133(8) << 3;
                class380.field5308 = class24.field414.method1154((byte) 118);
                class515.field7255 = class24.field414.method1131(-128) << 3;
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class456.field6386) {
                int var393 = class24.field414.method1111(-17320);
                int var394 = class24.field414.method1144(-15189);
                int var395 = class24.field414.method1153(true);
                class684.method3762((byte) 117);
                class609.method3336(var393, var394, var395, 98, 5);
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class21.field262) {
                class684.method3762((byte) -56);
                class241.method1503(4589);
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 == class189.field2475) {
                int var396 = class24.field414.method1144(-15189);
                class684.method3762((byte) -120);
                if (var396 == -1) {
                    class147.field1783 = -1;
                    class335.field4311 = -1;
                } else {
                    int var397 = var396 >> 14 & 16383;
                    int var398 = var396 & 16383;
                    int var399 = var397 - class63.field851;
                    if (var399 >= 0) {
                        if (var399 >= class613.field8591) {
                            var399 = class613.field8591;
                        }
                    } else {
                        var399 = 0;
                    }
                    int var400 = var398 - class753.field10509;
                    if (~var400 <= -1) {
                        if (~class1.field3 >= ~var400) {
                            var400 = class1.field3;
                        }
                    } else {
                        var400 = 0;
                    }
                    class147.field1783 = (var399 << 9) - -256;
                    class335.field4311 = (var400 << 9) + 256;
                }
                class730.field10219 = null;
                return true;
            } else if (class730.field10219 != class382.field5328) {
                if (class730.field10219 == class162.field2080) {
                    byte var406 = class24.field414.method1133(8);
                    int var407 = class24.field414.method1117((byte) -73);
                    class684.method3762((byte) -81);
                    class349.method2044(var406, var407, (byte) -1);
                    class730.field10219 = null;
                    return true;
                } else if (class730.field10219 == class184.field2410) {
                    class485.method2829(class271.field3432, (byte) 89);
                    class730.field10219 = null;
                    return true;
                } else {
                    class486.method2844((byte) -1, "T1 - " + (class730.field10219 != null ? class730.field10219.method563((byte) -119) : -1) + "," + (class455.field6380 == null ? -1 : class455.field6380.method563((byte) -122)) + "," + (class508.field7186 == null ? -1 : class508.field7186.method563((byte) 53)) + " - " + class677.field9199, (Throwable) null);
                    class650.method3509(false, (byte) -74);
                    return true;
                }
            } else {
                int[] var401 = new int[4];
                for (int var402 = 0; var402 < 4; ++var402) {
                    var401[var402] = class24.field414.method1119(false);
                }
                int var403 = class24.field414.method1107(false);
                int var404 = class24.field414.method1117((byte) -73);
                class247 var405 = (class247) class563.field7875.method3248((long) var403, 0);
                if (var405 != null) {
                    class216.method1307(var405.field3158, var401, -120, var404);
                }
                class730.field10219 = null;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Lbm;)V")
    public class168(class684 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "(B)V")
    public static void method1055(byte arg0) {
        field2216 = null;
        field2221 = null;
        if (arg0 >= -81) {
            field2218 = null;
        }
        field2218 = null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IZ)V")
    public final void method1018(int arg0, boolean arg1) {
        ++field2217;
        if (arg0 != 4) {
            field2218 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "(B)Z")
    public final boolean method1021(byte arg0) {
        ++field2219;
        return arg0 < 78 ? false : false;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(B)V")
    public final void method1019(byte arg0) {
        if (arg0 != -60) {
            field2218 = null;
        }
        ++field2220;
    }
}
