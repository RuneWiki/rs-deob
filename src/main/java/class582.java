import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class582 extends class21 {

    @OriginalMember(owner = "client!pf", name = "D", descriptor = "Ljava/lang/Object;")
    private Object field7965;

    @OriginalMember(owner = "client!pf", name = "M", descriptor = "Lsj;")
    public static class460 field7970 = null;

    @OriginalMember(owner = "client!pf", name = "P", descriptor = "Lks;")
    public static class440 field7972 = new class440(true);

    @OriginalMember(owner = "client!pf", name = "Q", descriptor = "Lkn;")
    public static class737 field7973 = new class737(0, 3);

    @OriginalMember(owner = "client!pf", name = "I", descriptor = "I")
    public static int field7966;

    @OriginalMember(owner = "client!pf", name = "K", descriptor = "I")
    public static int field7968;

    @OriginalMember(owner = "client!pf", name = "L", descriptor = "I")
    public static int field7969;

    @OriginalMember(owner = "client!pf", name = "N", descriptor = "I")
    public static int field7971;

    @OriginalMember(owner = "client!pf", name = "R", descriptor = "I")
    public static int field7974;

    @OriginalMember(owner = "client!pf", name = "J", descriptor = "[[[J")
    public static long[][][] field7967;

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(IIB)Z", line = 5)
    public static final boolean method3336(int arg0, int arg1, byte arg2) {
        field7969++;
        int var3 = 18 / ((arg2 - 30) / 42);
        if (class639.method3626(arg0, (byte) -118, arg1)) {
            return class85.method815((byte) -118, arg0, arg1) | (arg0 & 0x9000) != 0 | class535.method3082(-31735, arg1, arg0) ? true : (arg1 & 0x37) == 0 & ((arg0 & 0x2000) != 0 | class497.method2931(arg0, arg1, 88) | class338.method2137(arg1, (byte) 127, arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 24)
    public class582(Object arg0, int arg1) {
        super(arg1);
        this.field7965 = arg0;
    }

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "(I)Z", line = 34)
    public final boolean method167(int arg0) {
        if (arg0 != -4) {
            method3338((byte) -58);
        }
        field7974++;
        return false;
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(Z)Z", line = 46)
    public static final boolean method3337(boolean arg0) throws IOException {
        field7966++;
        if (class512.field7137 == null) {
            return false;
        }
        if (class480.field6701 == null) {
            if (class746.field10331) {
                if (!class512.field7137.method708(1, 119)) {
                    return false;
                }
                class512.field7137.method707(1, 0, (byte) 6, class149.field2477.field3066);
                class568.field7816 = 0;
                class746.field10331 = false;
                class633.field8703++;
            }
            class149.field2477.field3109 = 0;
            if (class149.field2477.method3727(-1510)) {
                if (!class512.field7137.method708(1, 119)) {
                    return false;
                }
                class512.field7137.method707(1, 1, (byte) 26, class149.field2477.field3066);
                class633.field8703++;
                class568.field7816 = 0;
            }
            class746.field10331 = true;
            class303[] var1 = class407.method2532(-11271);
            int var2 = class149.field2477.method3730(15295);
            if (var2 < 0 || var1.length <= var2) {
                throw new IOException("invo:" + var2 + " ip:" + class149.field2477.field3109);
            }
            class480.field6701 = var1[var2];
            class57.field1142 = class480.field6701.field4216;
        }
        if (class57.field1142 == -1) {
            if (!class512.field7137.method708(1, 116)) {
                return false;
            }
            class512.field7137.method707(1, 0, (byte) -118, class149.field2477.field3066);
            class57.field1142 = class149.field2477.field3066[0] & 0xFF;
            class633.field8703++;
            class568.field7816 = 0;
        }
        if (class57.field1142 == -2) {
            if (!class512.field7137.method708(2, 120)) {
                return false;
            }
            class512.field7137.method707(2, 0, (byte) 127, class149.field2477.field3066);
            class149.field2477.field3109 = 0;
            class57.field1142 = class149.field2477.method1478(842397944);
            class633.field8703 += 2;
            class568.field7816 = 0;
        }
        if (class57.field1142 > 0) {
            if (!class512.field7137.method708(class57.field1142, 104)) {
                return false;
            }
            class149.field2477.field3109 = 0;
            class512.field7137.method707(class57.field1142, 0, (byte) -123, class149.field2477.field3066);
            class633.field8703 += class57.field1142;
            class568.field7816 = 0;
        }
        class517.field7204 = class212.field3013;
        class212.field3013 = class433.field6189;
        class433.field6189 = class480.field6701;
        if (class82.field1490 == class480.field6701) {
            class88.method832(class149.field2477.method1525((byte) 118), true);
            class480.field6701 = null;
            return true;
        } else if (class587.field8007 == class480.field6701) {
            int var3 = class149.field2477.method1535(255);
            boolean var4 = (var3 & 0x1) == 1;
            String var5 = class149.field2477.method1525((byte) 108);
            String var6 = class149.field2477.method1525((byte) -92);
            if (var6.equals("")) {
                var6 = var5;
            }
            String var7 = class149.field2477.method1525((byte) -64);
            String var8 = class149.field2477.method1525((byte) -97);
            if (var8.equals("")) {
                var8 = var7;
            }
            if (var4) {
                for (int var9 = 0; var9 < class324.field4501; var9++) {
                    if (class514.field7147[var9].equals(var8)) {
                        class99.field1767[var9] = var5;
                        class514.field7147[var9] = var6;
                        class438.field6245[var9] = var7;
                        class393.field5774[var9] = var8;
                        break;
                    }
                }
            } else {
                class99.field1767[class324.field4501] = var5;
                class514.field7147[class324.field4501] = var6;
                class438.field6245[class324.field4501] = var7;
                class393.field5774[class324.field4501] = var8;
                class240.field3502[class324.field4501] = class263.method1762(var3, 2) == 2;
                class324.field4501++;
            }
            class646.field8887 = class253.field3660;
            class480.field6701 = null;
            return true;
        } else if (class733.field9891 == class480.field6701) {
            class696.method3896(class655.field8997, (byte) 8);
            class480.field6701 = null;
            return true;
        } else if (class480.field6701 == class213.field3030) {
            byte var10 = class149.field2477.method1536(-100);
            int var11 = class149.field2477.method1506(-111);
            class328.method2084((byte) -126);
            class142.method1129(var11, -18075, var10);
            class480.field6701 = null;
            return true;
        } else if (class480.field6701 == class106.field1859) {
            int var12 = class149.field2477.method1512((byte) -123);
            int var13 = class149.field2477.method1533((byte) -126);
            class328.method2084((byte) -124);
            class432 var14 = (class432) class323.field4473.method1465((long) var13, -6008);
            class432 var15 = (class432) class323.field4473.method1465((long) var12, -6008);
            if (var15 != null) {
                class422.method2587(var14 == null || var14.field6181 != var15.field6181, false, var15, 2533);
            }
            if (var14 != null) {
                var14.method2314((byte) 32);
                class323.field4473.method1468((byte) 102, (long) var12, var14);
            }
            class378 var16 = class60.method633(1512932720, var13);
            if (var16 != null) {
                class296.method1945(-9343, var16);
            }
            class378 var17 = class60.method633(1512932720, var12);
            if (var17 != null) {
                class296.method1945(-9343, var17);
                class296.method1942(true, -123, var17);
            }
            if (class184.field2784 != -1) {
                class640.method3635((byte) -8, class184.field2784, 1);
            }
            class480.field6701 = null;
            return true;
        } else {
            if (!arg0) {
                field7970 = null;
            }
            if (class480.field6701 == class304.field4243) {
                class107.field1881 = class57.field1142 > 2 ? class149.field2477.method1525((byte) -119) : class497.field6917.method2936(class607.field8336, 544);
                class666.field9095 = class57.field1142 <= 0 ? -1 : class149.field2477.method1478(842397944);
                if (class666.field9095 == 65535) {
                    class666.field9095 = -1;
                }
                class480.field6701 = null;
                return true;
            } else if (class480.field6701 == class212.field3003) {
                int var18 = class149.field2477.method1541((byte) 62);
                int var19 = class149.field2477.method1512((byte) -126);
                class328.method2084((byte) -124);
                class7.method29(true, var18, var19);
                class480.field6701 = null;
                return true;
            } else if (class66.field1253 == class480.field6701) {
                int var20 = class149.field2477.method1494(255);
                int var21 = class149.field2477.method1521(false);
                int var22 = class149.field2477.method1503(10);
                int var23 = class149.field2477.method1521(false);
                class328.method2084((byte) -127);
                class433.method2631(7, var20, var22 << 16 | var23, 4, var21);
                class480.field6701 = null;
                return true;
            } else if (class480.field6701 == class333.field4636) {
                class473.field6619 = class149.field2477.method1520(13638);
                class480.field6701 = null;
                class728.field9854 = class253.field3660;
                return true;
            } else if (class480.field6701 == class413.field6003) {
                class696.method3896(class225.field3208, (byte) 8);
                class480.field6701 = null;
                return true;
            } else if (class742.field9987 == class480.field6701) {
                int var24 = class149.field2477.method1491((byte) 82);
                class328.method2084((byte) -124);
                class433.method2631(3, var24, -1, 4, -1);
                class480.field6701 = null;
                return true;
            } else if (class480.field6701 == class103.field1825) {
                boolean var25 = class149.field2477.method1535(255) == 1;
                String var26 = class149.field2477.method1525((byte) -34);
                String var27 = var26;
                if (var25) {
                    var27 = class149.field2477.method1525((byte) -64);
                }
                long var28 = class149.field2477.method1513(-456577760);
                long var30 = (long) class149.field2477.method1478(842397944);
                long var32 = (long) class149.field2477.method1499(-1);
                int var34 = class149.field2477.method1535(255);
                long var35 = (var30 << 32) + var32;
                boolean var37 = false;
                int var38 = 0;
                while (true) {
                    if (var38 >= 100) {
                        if (var34 <= 1) {
                            if (!(!class175.field2705 || class405.field5941) || class748.field10364) {
                                var37 = true;
                            } else if (class124.method1058(var27, 28280)) {
                                var37 = true;
                            }
                        }
                        break;
                    }
                    if (class384.field5581[var38] == var35) {
                        var37 = true;
                        break;
                    }
                    var38++;
                }
                if (!var37 && class391.field5763 == 0) {
                    class384.field5581[class334.field4676] = var35;
                    class334.field4676 = (class334.field4676 + 1) % 100;
                    String var39 = class275.method1814(class466.method2744((byte) 64, class149.field2477), 23034);
                    if (var34 == 2 || var34 == 3) {
                        class8.method48("<img=1>" + var27, var39, (byte) -126, -1, "<img=1>" + var26, class218.method1556((byte) -76, var28), 9, 0, var26);
                    } else if (var34 == 1) {
                        class8.method48("<img=0>" + var27, var39, (byte) -126, -1, "<img=0>" + var26, class218.method1556((byte) -75, var28), 9, 0, var26);
                    } else {
                        class8.method48(var27, var39, (byte) -125, -1, var26, class218.method1556((byte) -83, var28), 9, 0, var26);
                    }
                }
                class480.field6701 = null;
                return true;
            } else if (class67.field1258 == class480.field6701) {
                int var40 = class149.field2477.method1521(!arg0);
                class328.method2084((byte) -126);
                class597.method3395(-1, var40);
                class480.field6701 = null;
                return true;
            } else if (class696.field9401 == class480.field6701) {
                class696.method3896(class428.field6140, (byte) 8);
                class480.field6701 = null;
                return true;
            } else if (class480.field6701 == class192.field2847) {
                int var41 = class149.field2477.method1541((byte) -78);
                int var42 = class149.field2477.method1477((byte) 21);
                int var43 = class149.field2477.method1503(127);
                int var44 = class149.field2477.method1490((byte) -128);
                int var45 = class149.field2477.method1477((byte) 21);
                class328.method2084((byte) -127);
                class226.field3216[var42] = true;
                class197.field2899[var42] = var41;
                class20.field304[var42] = var44;
                class546.field7533[var42] = var45;
                class576.field7909[var42] = var43;
                class480.field6701 = null;
                return true;
            } else if (class94.field1650 == class480.field6701) {
                class192.field2854 = class149.field2477.method1509(-622951480) << 3;
                class76.field1371 = class149.field2477.method1541((byte) -84);
                class183.field2766 = class149.field2477.method1489(-8679) << 3;
                class480.field6701 = null;
                return true;
            } else if (class480.field6701 == class207.field2963) {
                class367.method2333((byte) 99);
                class480.field6701 = null;
                return false;
            } else if (class488.field6754 == class480.field6701) {
                int var46 = class149.field2477.method1541((byte) 71);
                class328.method2084((byte) -128);
                class237.field3445 = var46;
                class480.field6701 = null;
                return true;
            } else if (class605.field8305 == class480.field6701) {
                class696.method3896(class252.field3637, (byte) 8);
                class480.field6701 = null;
                return true;
            } else if (class480.field6701 == class350.field4883) {
                int var47 = class149.field2477.method1506(-117);
                int var48 = class149.field2477.method1503(125);
                class328.method2084((byte) -128);
                class177.method1317(var47, var48, 0, 3);
                class480.field6701 = null;
                return true;
            } else if (class480.field6701 == class346.field4841) {
                int var49 = class149.field2477.method1521(false);
                if (var49 == 65535) {
                    var49 = -1;
                }
                int var50 = class149.field2477.method1494(255);
                int var51 = class149.field2477.method1533((byte) -126);
                class328.method2084((byte) -128);
                class255.method1736((byte) -63, var51, var49, var50);
                class352 var52 = class721.field9801.method162(-126, var49);
                class514.method3005(var52.field4968, var52.field4930, (byte) -59, var52.field4924, var50);
                class699.method3911(var52.field4922, var52.field4969, 125, var50, var52.field4953);
                class480.field6701 = null;
                return true;
            } else if (class480.field6701 == class405.field5943) {
                int var53 = class149.field2477.method1478(842397944);
                int var54 = class149.field2477.method1535(255);
                boolean var55 = (var54 & 0x1) == 1;
                class186.method1351(var53, var55, true);
                int var56 = class149.field2477.method1478(842397944);
                for (int var57 = 0; var57 < var56; var57++) {
                    int var58 = class149.field2477.method1541((byte) -127);
                    if (var58 == 255) {
                        var58 = class149.field2477.method1491((byte) 82);
                    }
                    int var59 = class149.field2477.method1503(-78);
                    class53.method600(var53, -364570972, var55, var57, var58, var59 - 1);
                }
                class538.field7442[class263.method1762(31, class62.field1230++)] = var53;
                class480.field6701 = null;
                return true;
            } else if (class639.field8787 == class480.field6701) {
                class170.method1282(false, (byte) 11);
                class480.field6701 = null;
                return false;
            } else if (class480.field6701 == class137.field2296) {
                int var60 = class149.field2477.method1494(255);
                int var61 = class149.field2477.method1503(124);
                class390.field5635.method902((byte) 42, var60, var61);
                class480.field6701 = null;
                return true;
            } else if (class480.field6701 == class282.field3952) {
                int var62 = class149.field2477.method1490((byte) 75);
                int var63 = class149.field2477.method1503(124);
                int var64 = class149.field2477.method1503(125);
                int var65 = class149.field2477.method1478(842397944);
                int var66 = class149.field2477.method1491((byte) 82);
                boolean var67 = (var62 & 0x80) != 0;
                int var68 = var62 & 0x7;
                int var69 = (var62 & 0x7E) >> 3;
                if (var69 == 15) {
                    var69 = -1;
                }
                if ((var66 >> 30) != 0) {
                    int var101 = (var66 & 0x33705717) >> 28;
                    int var102 = ((var66 & 0xFFFF4FE) >> 14) - class221.field3177;
                    int var103 = (var66 & 0x3FFF) - class367.field5236;
                    if (var102 >= 0 && var103 >= 0 && class376.field5325 > var102 && class175.field2711 > var103) {
                        int var104 = var102 * 512 + 256;
                        int var105 = var103 * 512 + 256;
                        int var106 = var101;
                        if (var101 < 3 && class334.method2118(var103, var102, true)) {
                            var106 = var101 + 1;
                        }
                        class238 var107 = new class238(var64, var65, class641.field8810, var101, var106, var104, class197.method1403(var104, var101, 11219, var105) - var63, var105, var102, var102, var103, var103, var68);
                        class28.field757.method1273(new class715(var107), -20180);
                    }
                } else if (var66 >> 29 != 0) {
                    int var70 = var66 & 0xFFFF;
                    class751 var71 = (class751) class86.field1546.method1465((long) var70, -6008);
                    if (var71 != null) {
                        class9 var72 = var71.field10510;
                        if (var64 == 65535) {
                            var64 = -1;
                        }
                        boolean var73 = true;
                        int var74 = var67 ? var72.field5717 : var72.field5695;
                        if (var64 != -1 && var74 != -1) {
                            if (var64 == var74) {
                                class654 var75 = class104.field1840.method3016((byte) 55, var64);
                                if (var75.field8964 && var75.field8980 != -1) {
                                    class691 var76 = class456.field6436.method1021(var75.field8980, 7);
                                    int var77 = var76.field9338;
                                    if (var77 == 0 || var77 == 2) {
                                        var73 = false;
                                    } else if (var77 == 1) {
                                        var73 = true;
                                    }
                                }
                            } else {
                                class654 var78 = class104.field1840.method3016((byte) 105, var64);
                                class654 var79 = class104.field1840.method3016((byte) 56, var74);
                                if (var78.field8980 != -1 && var79.field8980 != -1) {
                                    class691 var80 = class456.field6436.method1021(var78.field8980, 7);
                                    class691 var81 = class456.field6436.method1021(var79.field8980, 7);
                                    if (var80.field9329 < var81.field9329) {
                                        var73 = false;
                                    }
                                }
                            }
                        }
                        if (var73) {
                            if (var67) {
                                var72.field5637 = class641.field8810 + var65;
                                var72.field5686 = var63;
                                var72.field5717 = var64;
                                var72.field5715 = var69;
                                var72.field5628 = var68;
                                var72.field5699 = 0;
                                var72.field5702 = 1;
                                var72.field5650 = 0;
                                if (var72.field5637 > class641.field8810) {
                                    var72.field5650 = -1;
                                }
                                if (var72.field5717 != -1 && class641.field8810 == var72.field5637) {
                                    int var84 = class104.field1840.method3016((byte) 103, var72.field5717).field8980;
                                    if (var84 != -1) {
                                        class691 var85 = class456.field6436.method1021(var84, 7);
                                        if (var85 != null && var85.field9327 != null && !var72.field5735) {
                                            class190.method1366(var72, 0, var85, -17);
                                        }
                                    }
                                }
                            } else {
                                var72.field5669 = 0;
                                var72.field5646 = var63;
                                var72.field5695 = var64;
                                var72.field5666 = 0;
                                var72.field5704 = var69;
                                var72.field5651 = class641.field8810 + var65;
                                var72.field5663 = var68;
                                var72.field5709 = 1;
                                if (var72.field5651 > class641.field8810) {
                                    var72.field5666 = -1;
                                }
                                if (var72.field5695 != -1 && class641.field8810 == var72.field5651) {
                                    int var82 = class104.field1840.method3016((byte) 87, var72.field5695).field8980;
                                    if (var82 != -1) {
                                        class691 var83 = class456.field6436.method1021(var82, 7);
                                        if (var83 != null && var83.field9327 != null && !var72.field5735) {
                                            class190.method1366(var72, 0, var83, -44);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (var66 >> 28 != 0) {
                    int var86 = var66 & 0xFFFF;
                    class598 var87;
                    if (class561.field7752 == var86) {
                        var87 = class58.field1147;
                    } else {
                        var87 = class49.field1040[var86];
                    }
                    if (var87 != null) {
                        if (var64 == 65535) {
                            var64 = -1;
                        }
                        boolean var88 = true;
                        int var89 = var67 ? var87.field5717 : var87.field5695;
                        if (var64 != -1 && var89 != -1) {
                            if (var64 == var89) {
                                class654 var94 = class104.field1840.method3016((byte) 111, var64);
                                if (var94.field8964 && var94.field8980 != -1) {
                                    class691 var95 = class456.field6436.method1021(var94.field8980, 7);
                                    int var96 = var95.field9338;
                                    if (var96 == 0 || var96 == 2) {
                                        var88 = false;
                                    } else if (var96 == 1) {
                                        var88 = true;
                                    }
                                }
                            } else {
                                class654 var90 = class104.field1840.method3016((byte) 105, var64);
                                class654 var91 = class104.field1840.method3016((byte) 118, var89);
                                if (var90.field8980 != -1 && var91.field8980 != -1) {
                                    class691 var92 = class456.field6436.method1021(var90.field8980, 7);
                                    class691 var93 = class456.field6436.method1021(var91.field8980, 7);
                                    if (var92.field9329 < var93.field9329) {
                                        var88 = false;
                                    }
                                }
                            }
                        }
                        if (var88) {
                            if (var67) {
                                var87.field5650 = 0;
                                var87.field5686 = var63;
                                var87.field5715 = var69;
                                var87.field5699 = 0;
                                var87.field5702 = 1;
                                var87.field5717 = var64;
                                var87.field5637 = class641.field8810 + var65;
                                var87.field5628 = var68;
                                if (var87.field5637 > class641.field8810) {
                                    var87.field5650 = -1;
                                }
                                if (var87.field5717 == 65535) {
                                    var87.field5717 = -1;
                                }
                                if (var87.field5717 != -1 && class641.field8810 == var87.field5637) {
                                    int var97 = class104.field1840.method3016((byte) 45, var87.field5717).field8980;
                                    if (var97 != -1) {
                                        class691 var98 = class456.field6436.method1021(var97, 7);
                                        if (var98 != null && var98.field9327 != null && !var87.field5735) {
                                            class190.method1366(var87, 0, var98, -120);
                                        }
                                    }
                                }
                            } else {
                                var87.field5695 = var64;
                                var87.field5669 = 0;
                                var87.field5646 = var63;
                                var87.field5666 = 0;
                                var87.field5704 = var69;
                                var87.field5663 = var68;
                                var87.field5709 = 1;
                                var87.field5651 = class641.field8810 + var65;
                                if (var87.field5695 == 65535) {
                                    var87.field5695 = -1;
                                }
                                if (class641.field8810 < var87.field5651) {
                                    var87.field5666 = -1;
                                }
                                if (var87.field5695 != -1 && class641.field8810 == var87.field5651) {
                                    int var99 = class104.field1840.method3016((byte) 81, var87.field5695).field8980;
                                    if (var99 != -1) {
                                        class691 var100 = class456.field6436.method1021(var99, 7);
                                        if (var100 != null && var100.field9327 != null && !var87.field5735) {
                                            class190.method1366(var87, 0, var100, -101);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                class480.field6701 = null;
                return true;
            } else if (class565.field7791 == class480.field6701) {
                int var108 = class149.field2477.method1506(-116);
                String var109 = class149.field2477.method1525((byte) -85);
                class328.method2084((byte) -125);
                class358.method2245(var109, var108, 2);
                class480.field6701 = null;
                return true;
            } else if (class737.field9926 == class480.field6701) {
                class477.field6660 = class149.field2477.method1517((byte) 125);
                class175.field2705 = class149.field2477.method1535(255) == 1;
                class480.field6701 = null;
                return true;
            } else if (class547.field7536 == class480.field6701) {
                String var110 = class149.field2477.method1525((byte) 122);
                boolean var111 = class149.field2477.method1535(255) == 1;
                String var112;
                if (var111) {
                    var112 = class149.field2477.method1525((byte) 125);
                } else {
                    var112 = var110;
                }
                int var113 = class149.field2477.method1478(842397944);
                byte var114 = class149.field2477.method1536(-128);
                boolean var115 = false;
                if (var114 == -128) {
                    var115 = true;
                }
                if (var115) {
                    if (class237.field3446 == 0) {
                        class480.field6701 = null;
                        return true;
                    }
                    boolean var116 = false;
                    int var117;
                    for (var117 = 0; class237.field3446 > var117 && (!class166.field2601[var117].field2965.equals(var112) || class166.field2601[var117].field2967 != var113); var117++) {
                    }
                    if (var117 < class237.field3446) {
                        while (var117 < (class237.field3446 - 1)) {
                            class166.field2601[var117] = class166.field2601[var117 + 1];
                            var117++;
                        }
                        class237.field3446--;
                        class166.field2601[class237.field3446] = null;
                    }
                } else {
                    String var118 = class149.field2477.method1525((byte) -74);
                    class207 var119 = new class207();
                    var119.field2965 = var112;
                    var119.field2973 = var110;
                    var119.field2971 = class115.method1015(2, var119.field2965);
                    var119.field2972 = var118;
                    var119.field2967 = var113;
                    var119.field2969 = var114;
                    int var120;
                    for (var120 = class237.field3446 - 1; var120 >= 0; var120--) {
                        int var121 = class166.field2601[var120].field2971.compareTo(var119.field2971);
                        if (var121 == 0) {
                            class166.field2601[var120].field2967 = var113;
                            class166.field2601[var120].field2969 = var114;
                            class166.field2601[var120].field2972 = var118;
                            if (var112.equals(class58.field1147.field8189)) {
                                class182.field2757 = var114;
                            }
                            class460.field6487 = class253.field3660;
                            class480.field6701 = null;
                            return true;
                        }
                        if (var121 < 0) {
                            break;
                        }
                    }
                    if (class166.field2601.length <= class237.field3446) {
                        class480.field6701 = null;
                        return true;
                    }
                    for (int var122 = class237.field3446 - 1; var122 > var120; var122--) {
                        class166.field2601[var122 + 1] = class166.field2601[var122];
                    }
                    if (class237.field3446 == 0) {
                        class166.field2601 = new class207[100];
                    }
                    class166.field2601[var120 + 1] = var119;
                    class237.field3446++;
                    if (var112.equals(class58.field1147.field8189)) {
                        class182.field2757 = var114;
                    }
                }
                class460.field6487 = class253.field3660;
                class480.field6701 = null;
                return true;
            } else if (class656.field8998 == class480.field6701) {
                int var123 = class149.field2477.method1535(255);
                int var124 = var123 >> 5;
                int var125 = var123 & 0x1F;
                if (var125 == 0) {
                    class55.field1118[var124] = null;
                    class480.field6701 = null;
                    return true;
                }
                class741 var126 = new class741();
                var126.field9982 = var125;
                var126.field9973 = class149.field2477.method1535(255);
                if (var126.field9973 >= 0 && var126.field9973 < class280.field3932.length) {
                    if (var126.field9982 == 1 || var126.field9982 == 10) {
                        var126.field9975 = class149.field2477.method1478(842397944);
                        class149.field2477.field3109 += 6;
                    } else if (var126.field9982 >= 2 && var126.field9982 <= 6) {
                        if (var126.field9982 == 2) {
                            var126.field9974 = 256;
                            var126.field9977 = 256;
                        }
                        if (var126.field9982 == 3) {
                            var126.field9977 = 0;
                            var126.field9974 = 256;
                        }
                        if (var126.field9982 == 4) {
                            var126.field9977 = 512;
                            var126.field9974 = 256;
                        }
                        if (var126.field9982 == 5) {
                            var126.field9977 = 256;
                            var126.field9974 = 0;
                        }
                        if (var126.field9982 == 6) {
                            var126.field9977 = 256;
                            var126.field9974 = 512;
                        }
                        var126.field9982 = 2;
                        var126.field9980 = class149.field2477.method1535(255);
                        var126.field9977 += class149.field2477.method1478(842397944) - class221.field3177 << 9;
                        var126.field9974 += class149.field2477.method1478(842397944) - class367.field5236 << 9;
                        var126.field9981 = class149.field2477.method1535(255) << 2;
                        var126.field9979 = class149.field2477.method1478(842397944);
                    }
                    var126.field9976 = class149.field2477.method1478(842397944);
                    if (var126.field9976 == 65535) {
                        var126.field9976 = -1;
                    }
                    class55.field1118[var124] = var126;
                }
                class480.field6701 = null;
                return true;
            } else if (class584.field7986 == class480.field6701) {
                class170.method1282(class426.field6128, (byte) 11);
                class480.field6701 = null;
                return false;
            } else if (class480.field6701 == class376.field5329) {
                class225.method1584(-101, class149.field2477, class57.field1142);
                class480.field6701 = null;
                return true;
            } else if (class85.field1537 == class480.field6701) {
                int var127 = class149.field2477.method1503(124);
                int var128 = class149.field2477.method1512((byte) -118);
                class328.method2084((byte) -128);
                class430.method2615(6, var127, var128);
                class480.field6701 = null;
                return true;
            } else if (class480.field6701 == class231.field3339) {
                class696.method3896(class659.field9026, (byte) 8);
                class480.field6701 = null;
                return true;
            } else if (class480.field6701 == class376.field5330) {
                int var129 = class149.field2477.method1533((byte) -126);
                int var130 = class149.field2477.method1506(-120);
                int var131 = class149.field2477.method1503(125);
                class328.method2084((byte) -125);
                class2.method4(-101, var129, (var131 << 16) + var130);
                class480.field6701 = null;
                return true;
            } else if (class570.field7827 == class480.field6701) {
                class390.field5635.method903((byte) 80);
                class190.field2836 += 32;
                class480.field6701 = null;
                return true;
            } else if (class480.field6701 == class181.field2747) {
                int var132 = class149.field2477.method1494(255);
                class328.method2084((byte) -128);
                class433.method2631(5, var132, class561.field7752, 4, 0);
                class480.field6701 = null;
                return true;
            } else if (class671.field9152 == class480.field6701) {
                int var133 = class149.field2477.method1503(-124);
                class328.method2084((byte) -124);
                class624.method3561((byte) -107, var133);
                class480.field6701 = null;
                return true;
            } else if (class608.field8349 == class480.field6701) {
                boolean var134 = class149.field2477.method1535(255) == 1;
                String var135 = class149.field2477.method1525((byte) -29);
                String var136 = var135;
                if (var134) {
                    var136 = class149.field2477.method1525((byte) -98);
                }
                int var137 = class149.field2477.method1535(255);
                boolean var138 = false;
                if (var137 <= 1) {
                    if (!(!class175.field2705 || class405.field5941) || class748.field10364) {
                        var138 = true;
                    } else if (var137 <= 1 && class124.method1058(var136, 28280)) {
                        var138 = true;
                    }
                }
                if (!var138 && class391.field5763 == 0) {
                    String var139 = class275.method1814(class466.method2744((byte) 64, class149.field2477), 23034);
                    if (var137 == 2) {
                        class8.method48("<img=1>" + var136, var139, (byte) -119, -1, "<img=1>" + var135, null, 24, 0, var135);
                    } else if (var137 == 1) {
                        class8.method48("<img=0>" + var136, var139, (byte) -119, -1, "<img=0>" + var135, null, 24, 0, var135);
                    } else {
                        class8.method48(var136, var139, (byte) -115, -1, var135, null, 24, 0, var135);
                    }
                }
                class480.field6701 = null;
                return true;
            } else if (class480.field6701 == class425.field6125) {
                class696.method3896(class23.field724, (byte) 8);
                class480.field6701 = null;
                return true;
            } else if (class81.field1482 == class480.field6701) {
                int var140 = class149.field2477.method1490((byte) 31);
                int var141 = class149.field2477.method1490((byte) -104);
                int var142 = class149.field2477.method1477((byte) 21);
                int var143 = class149.field2477.method1477((byte) 21);
                int var144 = class149.field2477.method1503(126) << 2;
                class328.method2084((byte) -127);
                class555.method3194(var141, var142, true, var144, !arg0, var143, var140);
                class480.field6701 = null;
                return true;
            } else if (class480.field6701 == class398.field5841) {
                String var145 = class149.field2477.method1525((byte) -100);
                Object[] var146 = new Object[var145.length() + 1];
                for (int var147 = var145.length() - 1; var147 >= 0; var147--) {
                    if (var145.charAt(var147) == 's') {
                        var146[var147 + 1] = class149.field2477.method1525((byte) 122);
                    } else {
                        var146[var147 + 1] = Integer.valueOf(class149.field2477.method1533((byte) -126));
                    }
                }
                var146[0] = Integer.valueOf(class149.field2477.method1533((byte) -126));
                class328.method2084((byte) -127);
                class33 var148 = new class33();
                var148.field845 = var146;
                class83.method788(var148);
                class480.field6701 = null;
                return true;
            } else if (class677.field9203 == class480.field6701) {
                class328.method2084((byte) -127);
                class123.method1057((byte) 125);
                class480.field6701 = null;
                return true;
            } else if (class480.field6701 == class432.field6183) {
                int var149 = class149.field2477.method1512((byte) -118);
                int var150 = class149.field2477.method1503(127);
                if (var150 == 65535) {
                    var150 = -1;
                }
                class328.method2084((byte) -126);
                class433.method2631(2, var149, var150, 4, -1);
                class480.field6701 = null;
                return true;
            } else if (class480.field6701 == class231.field3336) {
                int var151 = class149.field2477.method1533((byte) -126);
                class328.method2084((byte) -124);
                class432 var152 = (class432) class323.field4473.method1465((long) var151, -6008);
                if (var152 != null) {
                    class422.method2587(true, false, var152, 2533);
                }
                if (class647.field8909 != null) {
                    class296.method1945(-9343, class647.field8909);
                    class647.field8909 = null;
                }
                class480.field6701 = null;
                return true;
            } else if (class508.field7069 == class480.field6701) {
                int var153 = class149.field2477.method1503(-86);
                int var154 = class149.field2477.method1494(255);
                class328.method2084((byte) -124);
                class734.method4051(var154, var153, false);
                class480.field6701 = null;
                return true;
            } else if (class482.field6721 == class480.field6701) {
                class696.method3896(field7973, (byte) 8);
                class480.field6701 = null;
                return true;
            } else if (class559.field7736 == class480.field6701) {
                int var155 = class149.field2477.method1533((byte) -126);
                class715.field9743 = class689.field9299.method1206(80, var155);
                class480.field6701 = null;
                return true;
            } else if (class480.field6701 == class461.field6491) {
                int var156 = class149.field2477.method1478(842397944);
                class598 var157;
                if (class561.field7752 == var156) {
                    var157 = class58.field1147;
                } else {
                    var157 = class49.field1040[var156];
                }
                if (var157 == null) {
                    class480.field6701 = null;
                    return true;
                }
                int var158 = class149.field2477.method1478(842397944);
                int var159 = class149.field2477.method1535(255);
                boolean var160 = (var158 & 0x8000) != 0;
                if (var157.field8189 != null && var157.field8181 != null) {
                    boolean var161 = false;
                    if (var159 <= 1) {
                        if (!var160 && !(!class175.field2705 || class405.field5941) || class748.field10364) {
                            var161 = true;
                        } else if (class124.method1058(var157.field8189, 28280)) {
                            var161 = true;
                        }
                    }
                    if (!var161 && class391.field5763 == 0) {
                        int var162 = -1;
                        String var163;
                        if (var160) {
                            var158 &= 0x7FFF;
                            class88 var164 = class684.method3827((byte) -104, class149.field2477);
                            var162 = var164.field1567;
                            var163 = var164.field1566.method2707(class149.field2477, (byte) 119);
                        } else {
                            var163 = class275.method1814(class466.method2744((byte) 64, class149.field2477), 23034);
                        }
                        var157.field5718 = var163.trim();
                        var157.field5627 = var158 >> 8;
                        var157.field5660 = var158 & 0xFF;
                        var157.field5690 = 150;
                        int var165;
                        if (var159 == 1 || var159 == 2) {
                            var165 = var160 ? 17 : 1;
                        } else {
                            var165 = var160 ? 17 : 2;
                        }
                        if (var159 == 2) {
                            class8.method48("<img=1>" + var157.method3398(false, -95), var163, (byte) -120, var162, "<img=1>" + var157.method3404(true, 255), null, var165, 0, var157.field8182);
                        } else if (var159 == 1) {
                            class8.method48("<img=0>" + var157.method3398(false, -93), var163, (byte) -111, var162, "<img=0>" + var157.method3404(true, 255), null, var165, 0, var157.field8182);
                        } else {
                            class8.method48(var157.method3398(false, -121), var163, (byte) -126, var162, var157.method3404(true, 255), null, var165, 0, var157.field8182);
                        }
                    }
                }
                class480.field6701 = null;
                return true;
            } else if (class565.field7794 == class480.field6701) {
                boolean var166 = class149.field2477.method1535(255) == 1;
                String var167 = class149.field2477.method1525((byte) 126);
                String var168 = var167;
                if (var166) {
                    var168 = class149.field2477.method1525((byte) 86);
                }
                long var169 = (long) class149.field2477.method1478(842397944);
                long var171 = (long) class149.field2477.method1499(-1);
                int var173 = class149.field2477.method1535(255);
                long var174 = (var169 << 32) + var171;
                boolean var176 = false;
                int var177 = 0;
                while (true) {
                    if (var177 >= 100) {
                        if (var173 <= 1) {
                            if (!(!class175.field2705 || class405.field5941) || class748.field10364) {
                                var176 = true;
                            } else if (class124.method1058(var168, 28280)) {
                                var176 = true;
                            }
                        }
                        break;
                    }
                    if (class384.field5581[var177] == var174) {
                        var176 = true;
                        break;
                    }
                    var177++;
                }
                if (!var176 && class391.field5763 == 0) {
                    class384.field5581[class334.field4676] = var174;
                    class334.field4676 = (class334.field4676 + 1) % 100;
                    String var178 = class275.method1814(class466.method2744((byte) 64, class149.field2477), 23034);
                    if (var173 == 2) {
                        class8.method48("<img=1>" + var168, var178, (byte) -127, -1, "<img=1>" + var167, null, 7, 0, var167);
                    } else if (var173 == 1) {
                        class8.method48("<img=0>" + var168, var178, (byte) -115, -1, "<img=0>" + var167, null, 7, 0, var167);
                    } else {
                        class8.method48(var168, var178, (byte) -128, -1, var167, null, 3, 0, var167);
                    }
                }
                class480.field6701 = null;
                return true;
            } else if (class480.field6701 == class21.field332) {
                if (class184.field2784 != -1) {
                    class640.method3635((byte) -8, class184.field2784, 0);
                }
                class480.field6701 = null;
                return true;
            } else if (class480.field6701 == class445.field6320) {
                int var179 = class149.field2477.method1535(255);
                int var180 = class149.field2477.method1490((byte) -87);
                int var181 = class149.field2477.method1535(255);
                int var182 = class149.field2477.method1521(!arg0) << 2;
                int var183 = class149.field2477.method1477((byte) 21);
                class328.method2084((byte) -125);
                class324.method2074(var180, var179, var182, var183, var181, -127);
                class480.field6701 = null;
                return true;
            } else if (class480.field6701 == class410.field5966) {
                class480.field6701 = null;
                return false;
            } else if (class480.field6701 == class277.field3915) {
                class145.method1142(class57.field1142, class149.field2477, class689.field9299, 110);
                class480.field6701 = null;
                return true;
            } else if (class510.field7097 == class480.field6701) {
                boolean var184 = class149.field2477.method1535(255) == 1;
                byte[] var185 = new byte[class57.field1142 - 1];
                class149.field2477.method1537(Integer.MAX_VALUE, 0, class57.field1142 - 1, var185);
                class129.method1069(var184, var185, (byte) -104);
                class480.field6701 = null;
                return true;
            } else if (class480.field6701 == class118.field2008) {
                int var186 = class149.field2477.method1535(255);
                byte var187 = class149.field2477.method1489(-8679);
                class328.method2084((byte) -128);
                class167.method1261(var187, var186, 120);
                class480.field6701 = null;
                return true;
            } else if (class480.field6701 == class20.field296) {
                class183.field2766 = class149.field2477.method1509(-622951480) << 3;
                class76.field1371 = class149.field2477.method1490((byte) 98);
                class192.field2854 = class149.field2477.method1493(-27697) << 3;
                while (class57.field1142 > class149.field2477.field3109) {
                    class737 var188 = class20.method151((byte) -19)[class149.field2477.method1535(255)];
                    class696.method3896(var188, (byte) 8);
                }
                class480.field6701 = null;
                return true;
            } else if (class480.field6701 == class126.field2134) {
                int var189 = class149.field2477.method1520(13638);
                int var190 = class149.field2477.method1533((byte) -126);
                int var191 = class149.field2477.method1523((byte) 84);
                class328.method2084((byte) -124);
                class679.method3813(var191, -23697, var189, var190);
                class480.field6701 = null;
                return true;
            } else if (class480.field6701 == class250.field3606) {
                String var192 = class149.field2477.method1525((byte) 100);
                int var193 = class149.field2477.method1503(124);
                class328.method2084((byte) -127);
                class358.method2245(var192, var193, 2);
                class480.field6701 = null;
                return true;
            } else if (class705.field9563 == class480.field6701) {
                int var194 = class149.field2477.method1506(-117);
                int var195 = class149.field2477.method1533((byte) -126);
                class328.method2084((byte) -127);
                class333.method2106(var194, (byte) -88, var195);
                class480.field6701 = null;
                return true;
            } else if (class534.field7344 == class480.field6701) {
                boolean var196 = class149.field2477.method1535(255) == 1;
                String var197 = class149.field2477.method1525((byte) -81);
                String var198 = var197;
                if (var196) {
                    var198 = class149.field2477.method1525((byte) -39);
                }
                long var199 = class149.field2477.method1513(-456577760);
                long var201 = (long) class149.field2477.method1478(842397944);
                long var203 = (long) class149.field2477.method1499(-1);
                int var205 = class149.field2477.method1535(255);
                int var206 = class149.field2477.method1478(842397944);
                long var207 = (var201 << 32) + var203;
                boolean var209 = false;
                int var210 = 0;
                while (true) {
                    if (var210 >= 100) {
                        if (var205 <= 1 && class124.method1058(var198, 28280)) {
                            var209 = true;
                        }
                        break;
                    }
                    if (class384.field5581[var210] == var207) {
                        var209 = true;
                        break;
                    }
                    var210++;
                }
                if (!var209 && class391.field5763 == 0) {
                    class384.field5581[class334.field4676] = var207;
                    class334.field4676 = (class334.field4676 + 1) % 100;
                    String var211 = class621.field8455.method2411(var206, (byte) -106).method2707(class149.field2477, (byte) 42);
                    if (var205 == 2) {
                        class8.method48("<img=1>" + var198, var211, (byte) -120, var206, "<img=1>" + var197, class218.method1556((byte) 87, var199), 20, 0, var197);
                    } else if (var205 == 1) {
                        class8.method48("<img=0>" + var198, var211, (byte) -116, var206, "<img=0>" + var197, class218.method1556((byte) -98, var199), 20, 0, var197);
                    } else {
                        class8.method48(var198, var211, (byte) -111, var206, var197, class218.method1556((byte) 80, var199), 20, 0, var197);
                    }
                }
                class480.field6701 = null;
                return true;
            } else if (class564.field7786 == class480.field6701) {
                int var212 = class149.field2477.method1494(255);
                class328.method2084((byte) -125);
                if (var212 == -1) {
                    class44.field978 = -1;
                    class705.field9558 = -1;
                } else {
                    int var213 = var212 >> 14 & 0x3FFF;
                    int var214 = var213 - class221.field3177;
                    int var215 = var212 & 0x3FFF;
                    int var216 = var215 - class367.field5236;
                    if (var214 < 0) {
                        var214 = 0;
                    } else if (class376.field5325 <= var214) {
                        var214 = class376.field5325;
                    }
                    class44.field978 = (var214 << 9) + 256;
                    if (var216 < 0) {
                        var216 = 0;
                    } else if (var216 >= class175.field2711) {
                        var216 = class175.field2711;
                    }
                    class705.field9558 = (var216 << 9) + 256;
                }
                class480.field6701 = null;
                return true;
            } else if (class98.field1694 == class480.field6701) {
                int var217 = class149.field2477.method1541((byte) -88);
                int var218 = class149.field2477.method1521(!arg0);
                class390.field5635.method906((byte) -58, var218, var217);
                class480.field6701 = null;
                return true;
            } else if (class480.field6701 == class405.field5940) {
                class696.method3896(class556.field7680, (byte) 8);
                class480.field6701 = null;
                return true;
            } else if (class480.field6701 == class302.field4205) {
                int var219 = class149.field2477.method1506(-107);
                if (var219 == 65535) {
                    var219 = -1;
                }
                int var220 = class149.field2477.method1541((byte) -121);
                int var221 = var220 >> 2;
                int var222 = var220 & 0x3;
                int var223 = class585.field7990[var221];
                int var224 = class149.field2477.method1494(255);
                int var225 = (var224 & 0x36079814) >> 28;
                int var226 = var224 >> 14 & 0x3FFF;
                int var227 = var224 & 0x3FFF;
                int var228 = var226 - class221.field3177;
                int var229 = var227 - class367.field5236;
                class745.method4080(var229, var219, var221, var228, var222, 102, var225, var223);
                class480.field6701 = null;
                return true;
            } else if (class480.field6701 == class445.field6327) {
                String var230 = class149.field2477.method1525((byte) -104);
                int var231 = class149.field2477.method1478(842397944);
                String var232 = class621.field8455.method2411(var231, (byte) -98).method2707(class149.field2477, (byte) 42);
                class8.method48(var230, var232, (byte) -122, var231, var230, null, 19, 0, var230);
                class480.field6701 = null;
                return true;
            } else if (class480.field6701 == class21.field330) {
                class696.method3896(class531.field7325, (byte) 8);
                class480.field6701 = null;
                return true;
            } else if (class601.field8254 == class480.field6701) {
                for (int var233 = 0; var233 < class49.field1040.length; var233++) {
                    if (class49.field1040[var233] != null) {
                        class49.field1040[var233].field5662 = null;
                        class49.field1040[var233].field5712 = -1;
                    }
                }
                for (int var234 = 0; var234 < class77.field1375; var234++) {
                    class728.field9860[var234].field10510.field5662 = null;
                    class728.field9860[var234].field10510.field5712 = -1;
                }
                class480.field6701 = null;
                return true;
            } else if (class575.field7896 == class480.field6701) {
                int var235 = class149.field2477.method1494(255);
                int var236 = class149.field2477.method1478(842397944);
                int var237 = class149.field2477.method1506(-109);
                int var238 = class149.field2477.method1503(16);
                class328.method2084((byte) -125);
                class514.method3005(var238, var236, (byte) -86, var237, var235);
                class480.field6701 = null;
                return true;
            } else if (class480.field6701 == class471.field6599) {
                class335.field4733 = class479.method2805((byte) -57, class149.field2477.method1535(255));
                class480.field6701 = null;
                return true;
            } else if (class480.field6701 == class339.field4764) {
                class696.method3896(class463.field6505, (byte) 8);
                class480.field6701 = null;
                return true;
            } else if (class530.field7312 == class480.field6701) {
                class324.field4501 = class149.field2477.method1535(255);
                for (int var239 = 0; var239 < class324.field4501; var239++) {
                    class99.field1767[var239] = class149.field2477.method1525((byte) -36);
                    class514.field7147[var239] = class149.field2477.method1525((byte) 112);
                    if (class514.field7147[var239].equals("")) {
                        class514.field7147[var239] = class99.field1767[var239];
                    }
                    class438.field6245[var239] = class149.field2477.method1525((byte) 84);
                    class393.field5774[var239] = class149.field2477.method1525((byte) -111);
                    if (class393.field5774[var239].equals("")) {
                        class393.field5774[var239] = class438.field6245[var239];
                    }
                    class240.field3502[var239] = false;
                }
                class646.field8887 = class253.field3660;
                class480.field6701 = null;
                return true;
            } else if (class730.field9875 == class480.field6701) {
                int var240 = class149.field2477.method1506(-121);
                if (var240 == 65535) {
                    var240 = -1;
                }
                String var241 = class149.field2477.method1525((byte) 103);
                int var242 = class149.field2477.method1490((byte) -91);
                int var243 = class149.field2477.method1541((byte) 13);
                if (var242 >= 1 && var242 <= 8) {
                    if (var241.equalsIgnoreCase("null")) {
                        var241 = null;
                    }
                    class509.field7086[var242 - 1] = var241;
                    class53.field1089[var242 - 1] = var240;
                    class545.field7517[var242 - 1] = var243 == 0;
                }
                class480.field6701 = null;
                return true;
            } else if (class480.field6701 == class473.field6618) {
                int var244 = class149.field2477.method1530(-117);
                int var245 = class149.field2477.method1533((byte) -126);
                int var246 = class149.field2477.method1535(255);
                String var247 = "";
                String var248 = var247;
                if ((var246 & 0x1) != 0) {
                    var247 = class149.field2477.method1525((byte) 92);
                    if ((var246 & 0x2) == 0) {
                        var248 = var247;
                    } else {
                        var248 = class149.field2477.method1525((byte) 126);
                    }
                }
                String var249 = class149.field2477.method1525((byte) -95);
                if (var244 == 99) {
                    class355.method2228(var249, -93);
                } else if (var248.equals("") || !class124.method1058(var248, 28280)) {
                    class128.method1064(var248, var244, (byte) -92, var245, var249, var247, var247);
                } else {
                    class480.field6701 = null;
                    return true;
                }
                class480.field6701 = null;
                return true;
            } else if (class480.field6701 == class19.field292) {
                int var250 = class149.field2477.method1535(255);
                if (class149.field2477.method1535(255) == 0) {
                    class85.field1530[var250] = new class452();
                } else {
                    class149.field2477.field3109--;
                    class85.field1530[var250] = new class452(class149.field2477);
                }
                class480.field6701 = null;
                class510.field7093 = class253.field3660;
                return true;
            } else if (class480.field6701 == class145.field2396) {
                int var251 = class149.field2477.method1520(13638);
                int var252 = class149.field2477.method1491((byte) 82);
                class328.method2084((byte) -126);
                class742.method4070(var251, -19906, var252);
                class480.field6701 = null;
                return true;
            } else if (class678.field9205 == class480.field6701) {
                int var253 = class149.field2477.method1491((byte) 82);
                int var254 = class149.field2477.method1478(842397944);
                int var255 = class149.field2477.method1478(842397944);
                if (var255 == 65535) {
                    var255 = -1;
                }
                int var256 = class149.field2477.method1503(124);
                class328.method2084((byte) -128);
                if (var256 == 65535) {
                    var256 = -1;
                }
                for (int var257 = var256; var257 <= var255; var257++) {
                    long var258 = ((long) var253 << 32) + ((long) var257);
                    class331 var260 = (class331) class69.field1281.method1465(var258, -6008);
                    class331 var261;
                    if (var260 != null) {
                        var261 = new class331(var260.field4628, var254);
                        var260.method2314((byte) 91);
                    } else if (var257 == -1) {
                        var261 = new class331(class60.method633(1512932720, var253).field5424.field4628, var254);
                    } else {
                        var261 = new class331(0, var254);
                    }
                    class69.field1281.method1468((byte) 125, var258, var261);
                }
                class480.field6701 = null;
                return true;
            } else if (class480.field6701 == class19.field293) {
                while (class149.field2477.field3109 < class57.field1142) {
                    boolean var272 = class149.field2477.method1535(255) == 1;
                    String var273 = class149.field2477.method1525((byte) -95);
                    String var274 = class149.field2477.method1525((byte) 118);
                    int var275 = class149.field2477.method1478(842397944);
                    int var276 = class149.field2477.method1535(255);
                    String var277 = "";
                    boolean var278 = false;
                    if (var275 > 0) {
                        var277 = class149.field2477.method1525((byte) 119);
                        var278 = class149.field2477.method1535(255) == 1;
                    }
                    for (int var279 = 0; var279 < class443.field6289; var279++) {
                        if (var272) {
                            if (var274.equals(class648.field8912[var279])) {
                                class648.field8912[var279] = var273;
                                class128.field2162[var279] = var274;
                                var273 = null;
                                break;
                            }
                        } else if (var273.equals(class648.field8912[var279])) {
                            if (class59.field1169[var279] != var275) {
                                boolean var280 = true;
                                for (class692 var281 = (class692) class167.field2627.method1301(8); var281 != null; var281 = (class692) class167.field2627.method1307((byte) 124)) {
                                    if (var281.field9361.equals(var273)) {
                                        if (var275 != 0 && var281.field9364 == 0) {
                                            var280 = false;
                                            var281.method4018(false);
                                        } else if (var275 == 0 && var281.field9364 != 0) {
                                            var280 = false;
                                            var281.method4018(false);
                                        }
                                    }
                                }
                                if (var280) {
                                    class167.field2627.method1298(-95, new class692(var273, var275));
                                }
                                class59.field1169[var279] = var275;
                            }
                            class128.field2162[var279] = var274;
                            class539.field7456[var279] = var277;
                            class584.field7987[var279] = var276;
                            var273 = null;
                            class514.field7145[var279] = var278;
                            break;
                        }
                    }
                    if (var273 != null && class443.field6289 < 200) {
                        class648.field8912[class443.field6289] = var273;
                        class128.field2162[class443.field6289] = var274;
                        class59.field1169[class443.field6289] = var275;
                        class539.field7456[class443.field6289] = var277;
                        class584.field7987[class443.field6289] = var276;
                        class514.field7145[class443.field6289] = var278;
                        class443.field6289++;
                    }
                }
                class323.field4488 = 2;
                class646.field8887 = class253.field3660;
                boolean var262 = false;
                int var263 = class443.field6289;
                while (var263 > 0) {
                    var263--;
                    boolean var264 = true;
                    for (int var265 = 0; var265 < var263; var265++) {
                        if (class59.field1169[var265] != class678.field9207.field9140 && class59.field1169[var265 + 1] == class678.field9207.field9140 || class59.field1169[var265] == 0 && class59.field1169[var265 + 1] != 0) {
                            int var266 = class59.field1169[var265];
                            class59.field1169[var265] = class59.field1169[var265 + 1];
                            class59.field1169[var265 + 1] = var266;
                            String var267 = class539.field7456[var265];
                            class539.field7456[var265] = class539.field7456[var265 + 1];
                            class539.field7456[var265 + 1] = var267;
                            String var268 = class648.field8912[var265];
                            class648.field8912[var265] = class648.field8912[var265 + 1];
                            class648.field8912[var265 + 1] = var268;
                            String var269 = class128.field2162[var265];
                            class128.field2162[var265] = class128.field2162[var265 + 1];
                            class128.field2162[var265 + 1] = var269;
                            int var270 = class584.field7987[var265];
                            class584.field7987[var265] = class584.field7987[var265 + 1];
                            class584.field7987[var265 + 1] = var270;
                            boolean var271 = class514.field7145[var265];
                            class514.field7145[var265] = class514.field7145[var265 + 1];
                            var264 = false;
                            class514.field7145[var265 + 1] = var271;
                        }
                    }
                    if (var264) {
                        break;
                    }
                }
                class480.field6701 = null;
                return true;
            } else if (class480.field6701 == class275.field3868) {
                if (class699.field9455 != null) {
                    class486.method2864(class693.field9368.field4424.method3495(-32350), -1, (byte) 102, false, -1);
                }
                byte[] var282 = new byte[class57.field1142];
                class149.field2477.method3732(class57.field1142, var282, 0, -32769);
                String var283 = class79.method725(var282, 0, class57.field1142, 0);
                class727.method4024(var283, class689.field9299, class693.field9368.field4468.method1099(-32350) == 1, true, 99);
                class480.field6701 = null;
                return true;
            } else if (class79.field1421 == class480.field6701) {
                int var284 = class149.field2477.method1478(842397944);
                if (var284 == 65535) {
                    var284 = -1;
                }
                int var285 = class149.field2477.method1535(255);
                int var286 = class149.field2477.method1478(842397944);
                int var287 = class149.field2477.method1535(255);
                int var288 = class149.field2477.method1478(842397944);
                class717.method3991(true, var287, var284, var285, var286, var288);
                class480.field6701 = null;
                return true;
            } else if (class480.field6701 == class212.field3011) {
                int var289 = class149.field2477.method1478(842397944);
                byte var290 = class149.field2477.method1536(-83);
                class390.field5635.method902((byte) 42, var290, var289);
                class480.field6701 = null;
                return true;
            } else if (class494.field6844 == class480.field6701) {
                int var291 = class149.field2477.method1521(false);
                if (var291 == 65535) {
                    var291 = -1;
                }
                int var292 = class149.field2477.method1494(255);
                class328.method2084((byte) -127);
                class160.method1229(var291, 437853543, var292);
                class480.field6701 = null;
                return true;
            } else if (class504.field7019 == class480.field6701) {
                class696.method3896(class113.field1946, (byte) 8);
                class480.field6701 = null;
                return true;
            } else if (class754.field10533 == class480.field6701) {
                int var293 = class149.field2477.method1478(842397944);
                if (var293 == 65535) {
                    var293 = -1;
                }
                int var294 = class149.field2477.method1535(255);
                int var295 = class149.field2477.method1478(842397944);
                int var296 = class149.field2477.method1535(255);
                int var297 = class149.field2477.method1478(842397944);
                class550.method3171(var294, var297, false, (byte) -35, var296, var295, var293);
                class480.field6701 = null;
                return true;
            } else if (class66.field1255 == class480.field6701) {
                class449.method2685(-86);
                class480.field6701 = null;
                return false;
            } else if (class488.field6757 == class480.field6701) {
                int var298 = class149.field2477.method1503(-127);
                int var299 = class149.field2477.method1535(255);
                class328.method2084((byte) -128);
                class740.method4066(var299, true, var298, -127);
                class480.field6701 = null;
                return true;
            } else if (class480.field6701 == class201.field2918) {
                boolean var300 = class149.field2477.method1535(255) == 1;
                String var301 = class149.field2477.method1525((byte) 107);
                String var302 = var301;
                if (var300) {
                    var302 = class149.field2477.method1525((byte) -71);
                }
                long var303 = (long) class149.field2477.method1478(842397944);
                long var305 = (long) class149.field2477.method1499(-1);
                int var307 = class149.field2477.method1535(255);
                int var308 = class149.field2477.method1478(842397944);
                long var309 = (var303 << 32) + var305;
                boolean var311 = false;
                int var312 = 0;
                while (true) {
                    if (var312 >= 100) {
                        if (var307 <= 1 && class124.method1058(var302, 28280)) {
                            var311 = true;
                        }
                        break;
                    }
                    if (class384.field5581[var312] == var309) {
                        var311 = true;
                        break;
                    }
                    var312++;
                }
                if (!var311 && class391.field5763 == 0) {
                    class384.field5581[class334.field4676] = var309;
                    class334.field4676 = (class334.field4676 + 1) % 100;
                    String var313 = class621.field8455.method2411(var308, (byte) -93).method2707(class149.field2477, (byte) 62);
                    if (var307 == 2) {
                        class8.method48("<img=1>" + var302, var313, (byte) -110, var308, "<img=1>" + var301, null, 18, 0, var301);
                    } else if (var307 == 1) {
                        class8.method48("<img=0>" + var302, var313, (byte) -112, var308, "<img=0>" + var301, null, 18, 0, var301);
                    } else {
                        class8.method48(var302, var313, (byte) -118, var308, var301, null, 18, 0, var301);
                    }
                }
                class480.field6701 = null;
                return true;
            } else if (class505.field7023 == class480.field6701) {
                int var314 = class149.field2477.method1521(false);
                int var315 = class149.field2477.method1512((byte) -122);
                int var316 = class149.field2477.method1541((byte) -95);
                class328.method2084((byte) -125);
                class432 var317 = (class432) class323.field4473.method1465((long) var315, -6008);
                if (var317 != null) {
                    class422.method2587(var317.field6181 != var314, false, var317, 2533);
                }
                class546.method3150(var314, var315, var316, false, 2);
                class480.field6701 = null;
                return true;
            } else if (class480.field6701 == class422.field6091) {
                class480.field6701 = null;
                class323.field4488 = 1;
                class646.field8887 = class253.field3660;
                return true;
            } else if (class530.field7316 == class480.field6701) {
                class328.method2084((byte) -125);
                class473.method2788(0);
                class480.field6701 = null;
                return true;
            } else if (class633.field8702 == class480.field6701) {
                int var318 = class149.field2477.method1478(842397944);
                int var319 = class149.field2477.method1478(842397944);
                int var320 = class149.field2477.method1478(842397944);
                class328.method2084((byte) -125);
                if (class396.field5798[var318] != null) {
                    for (int var321 = var319; var321 < var320; var321++) {
                        int var322 = class149.field2477.method1499(-1);
                        if (var321 < class396.field5798[var318].length && class396.field5798[var318][var321] != null) {
                            class396.field5798[var318][var321].field5408 = var322;
                        }
                    }
                }
                class480.field6701 = null;
                return true;
            } else if (class480.field6701 == class394.field5787) {
                class696.method3896(class262.field3749, (byte) 8);
                class480.field6701 = null;
                return true;
            } else if (class697.field9420 == class480.field6701) {
                class76.field1371 = class149.field2477.method1541((byte) 126);
                class192.field2854 = class149.field2477.method1509(-622951480) << 3;
                class183.field2766 = class149.field2477.method1509(-622951480) << 3;
                for (class206 var323 = (class206) class491.field6801.method1469(0); var323 != null; var323 = (class206) class491.field6801.method1467(0)) {
                    int var325 = (int) (var323.field5204 >> 28 & 0x3L);
                    int var326 = (int) (var323.field5204 & 0x3FFFL);
                    int var327 = var326 - class221.field3177;
                    int var328 = (int) (var323.field5204 >> 14 & 0x3FFFL);
                    int var329 = var328 - class367.field5236;
                    if (class76.field1371 == var325 && var327 >= class183.field2766 && var327 < (class183.field2766 + 8) && var329 >= class192.field2854 && class192.field2854 + 8 > var329) {
                        var323.method2314((byte) 89);
                        if (var327 >= 0 && var329 >= 0 && var327 < class376.field5325 && class175.field2711 > var329) {
                            class209.method1439(var329, (byte) -118, var327, class76.field1371);
                        }
                    }
                }
                for (class55 var324 = (class55) class336.field4743.method1269(4); var324 != null; var324 = (class55) class336.field4743.method1264((byte) 31)) {
                    if (var324.field1126 >= class183.field2766 && (class183.field2766 + 8) > var324.field1126 && class192.field2854 <= var324.field1117 && var324.field1117 < class192.field2854 + 8 && class76.field1371 == var324.field1120) {
                        var324.field1114 = 0;
                    }
                }
                class480.field6701 = null;
                return true;
            } else if (class480.field6701 == class448.field6333) {
                int var330 = class149.field2477.method1477((byte) 21);
                int[] var331 = new int[4];
                for (int var332 = 0; var332 < 4; var332++) {
                    var331[var332] = class149.field2477.method1478(842397944);
                }
                int var333 = class149.field2477.method1521(false);
                class751 var334 = (class751) class86.field1546.method1465((long) var333, -6008);
                if (var334 != null) {
                    class217.method1553(var330, (byte) 110, var331, var334.field10510);
                }
                class480.field6701 = null;
                return true;
            } else if (class480.field6701 == class459.field6462) {
                class318.field4392 = class149.field2477.method1535(255);
                class480.field6701 = null;
                return true;
            } else if (class480.field6701 == class435.field6217) {
                int var335 = class149.field2477.method1490((byte) -104);
                int var336 = class149.field2477.method1490((byte) -92);
                int var337 = class149.field2477.method1506(-127);
                if (var337 == 65535) {
                    var337 = -1;
                }
                class256.method1740(var336, var337, -1, var335);
                class480.field6701 = null;
                return true;
            } else if (class480.field6701 == class467.field6557) {
                int var338 = class149.field2477.method1511(-13309);
                int var339 = class149.field2477.method1506(-124);
                if (var339 == 65535) {
                    var339 = -1;
                }
                int var340 = class149.field2477.method1477((byte) 21);
                class562.method3227(var339, var340, var338, (byte) -98);
                class480.field6701 = null;
                return true;
            } else if (class76.field1368 == class480.field6701) {
                String var341 = class149.field2477.method1525((byte) -43);
                String var342 = class275.method1814(class466.method2744((byte) 64, class149.field2477), 23034);
                class128.method1064(var341, 6, (byte) -101, 0, var342, var341, var341);
                class480.field6701 = null;
                return true;
            } else if (class480.field6701 == class422.field6092) {
                int var343 = class149.field2477.method1512((byte) -124);
                String var344 = class149.field2477.method1525((byte) -97);
                class328.method2084((byte) -125);
                class93.method884(var343, var344, -32394);
                class480.field6701 = null;
                return true;
            } else if (class558.field7730 == class480.field6701) {
                int var345 = class149.field2477.method1491((byte) 82);
                int var346 = class149.field2477.method1494(255);
                int var347 = class149.field2477.method1521(false);
                class328.method2084((byte) -126);
                class433.method2631(5, var345, var347, 4, var346);
                class480.field6701 = null;
                return true;
            } else if (class654.field8977 == class480.field6701) {
                boolean var348 = class149.field2477.method1477((byte) 21) == 1;
                class328.method2084((byte) -124);
                class514.field7140 = var348;
                class480.field6701 = null;
                return true;
            } else if (class480.field6701 == class356.field5047) {
                class521.method3036(-103);
                class480.field6701 = null;
                return true;
            } else if (class480.field6701 == class208.field2982) {
                class415.field6008 = class149.field2477.method1490((byte) 69);
                class316.field4373 = class149.field2477.method1541((byte) -82);
                class480.field6701 = null;
                return true;
            } else if (class98.field1697 == class480.field6701) {
                int var349 = class149.field2477.method1477((byte) 21);
                int var350 = class149.field2477.method1503(127);
                class328.method2084((byte) -125);
                if (var349 == 2) {
                    class162.method1237(92);
                }
                class184.field2784 = var350;
                class54.method603(var350, (byte) 123);
                class212.method1455(false, 520);
                class83.method786(class184.field2784);
                for (int var351 = 0; var351 < 100; var351++) {
                    class286.field3995[var351] = true;
                }
                class480.field6701 = null;
                return true;
            } else if (class680.field9213 == class480.field6701) {
                if (class626.method3575(class214.field3036, -105)) {
                    class591.field8069 = (int) ((float) class149.field2477.method1478(842397944) * 2.5F);
                } else {
                    class591.field8069 = class149.field2477.method1478(842397944) * 30;
                }
                class728.field9854 = class253.field3660;
                class480.field6701 = null;
                return true;
            } else if (class480.field6701 == class404.field5928) {
                int var352 = class149.field2477.method1478(842397944);
                if (var352 == 65535) {
                    var352 = -1;
                }
                int var353 = class149.field2477.method1535(255);
                int var354 = class149.field2477.method1478(842397944);
                int var355 = class149.field2477.method1535(255);
                class550.method3171(var353, 256, true, (byte) -35, var355, var354, var352);
                class480.field6701 = null;
                return true;
            } else if (class705.field9544 == class480.field6701) {
                int var356 = class149.field2477.method1503(-16);
                if (var356 == 65535) {
                    var356 = -1;
                }
                int var357 = class149.field2477.method1491((byte) 82);
                class328.method2084((byte) -125);
                class433.method2631(1, var357, var356, 4, -1);
                class480.field6701 = null;
                return true;
            } else if (class480.field6701 == class439.field6254) {
                class696.method3896(class430.field6156, (byte) 8);
                class480.field6701 = null;
                return true;
            } else if (class480.field6701 == class107.field1882) {
                int var358 = class149.field2477.method1503(125);
                if (var358 == 65535) {
                    var358 = -1;
                }
                int var359 = class149.field2477.method1521(false);
                if (var359 == 65535) {
                    var359 = -1;
                }
                int var360 = class149.field2477.method1533((byte) -126);
                int var361 = class149.field2477.method1494(255);
                class328.method2084((byte) -127);
                for (int var362 = var359; var362 <= var358; var362++) {
                    long var363 = ((long) var360 << 32) + (long) var362;
                    class331 var365 = (class331) class69.field1281.method1465(var363, -6008);
                    class331 var366;
                    if (var365 != null) {
                        var366 = new class331(var361, var365.field4623);
                        var365.method2314((byte) 80);
                    } else if (var362 == -1) {
                        var366 = new class331(var361, class60.method633(1512932720, var360).field5424.field4623);
                    } else {
                        var366 = new class331(var361, -1);
                    }
                    class69.field1281.method1468((byte) 114, var363, var366);
                }
                class480.field6701 = null;
                return true;
            } else if (class480.field6701 == class256.field3709) {
                int var367 = class149.field2477.method1503(-103);
                int var368 = class149.field2477.method1494(255);
                class390.field5635.method906((byte) -124, var367, var368);
                class480.field6701 = null;
                return true;
            } else if (class480.field6701 == class32.field804) {
                class149.field2477.field3109 += 28;
                if (class149.field2477.method1500(-25541)) {
                    class727.method4029(class149.field2477.field3109 - 28, (byte) -126, class149.field2477);
                }
                class480.field6701 = null;
                return true;
            } else if (class691.field9340 == class480.field6701) {
                class604.field8289 = class149.field2477.method1535(255);
                class728.field9854 = class253.field3660;
                class480.field6701 = null;
                return true;
            } else if (class681.field9223 == class480.field6701) {
                int var369 = class149.field2477.method1490((byte) 20);
                int var370 = class149.field2477.method1477((byte) 21);
                int var371 = class149.field2477.method1491((byte) 82);
                class463.field6511[var370] = var371;
                class670.field9142[var370] = var369;
                class513.field7139[var370] = 1;
                int var372 = class349.field4879[var370] - 1;
                for (int var373 = 0; var373 < var372; var373++) {
                    if (class659.field9027[var373] <= var371) {
                        class513.field7139[var370] = var373 + 2;
                    }
                }
                class538.field7441[class263.method1762(31, class5.field37++)] = var370;
                class480.field6701 = null;
                return true;
            } else if (class480.field6701 == class207.field2974) {
                class696.method3896(class259.field3721, (byte) 8);
                class480.field6701 = null;
                return true;
            } else if (class480.field6701 == class133.field2239) {
                int var374 = class149.field2477.method1503(10);
                int var375 = class149.field2477.method1490((byte) 70);
                boolean var376 = (var375 & 0x1) == 1;
                class175.method1309(var376, var374, -128);
                class538.field7442[class263.method1762(31, class62.field1230++)] = var374;
                class480.field6701 = null;
                return true;
            } else if (class630.field8670 == class480.field6701) {
                int var377 = class149.field2477.method1478(842397944);
                int var378 = class149.field2477.method1535(255);
                boolean var379 = (var378 & 0x1) == 1;
                while (class149.field2477.field3109 < class57.field1142) {
                    int var380 = class149.field2477.method1530(-125);
                    int var381 = class149.field2477.method1478(842397944);
                    int var382 = 0;
                    if (var381 != 0) {
                        var382 = class149.field2477.method1535(255);
                        if (var382 == 255) {
                            var382 = class149.field2477.method1533((byte) -126);
                        }
                    }
                    class53.method600(var377, -364570972, var379, var380, var382, var381 - 1);
                }
                class538.field7442[class263.method1762(31, class62.field1230++)] = var377;
                class480.field6701 = null;
                return true;
            } else if (class656.field8999 == class480.field6701) {
                int var383 = class149.field2477.method1490((byte) -113);
                int var384 = class149.field2477.method1541((byte) 127);
                if (var383 == 255) {
                    var384 = -1;
                    var383 = -1;
                }
                class134.method1095(120, var384, var383);
                class480.field6701 = null;
                return true;
            } else if (class641.field8812 == class480.field6701) {
                int var385 = class149.field2477.method1512((byte) -124);
                int var386 = class149.field2477.method1521(false);
                class328.method2084((byte) -124);
                class142.method1129(var386, -18075, var385);
                class480.field6701 = null;
                return true;
            } else if (class480.field6701 == class287.field3999) {
                class430.method2616((byte) 63);
                class480.field6701 = null;
                return true;
            } else if (class480.field6701 == class240.field3499) {
                boolean var387 = class149.field2477.method1535(255) == 1;
                String var388 = class149.field2477.method1525((byte) 89);
                String var389 = var388;
                if (var387) {
                    var389 = class149.field2477.method1525((byte) 98);
                }
                int var390 = class149.field2477.method1535(255);
                int var391 = class149.field2477.method1478(842397944);
                boolean var392 = false;
                if (var390 <= 1 && class124.method1058(var389, 28280)) {
                    var392 = true;
                }
                if (!var392 && class391.field5763 == 0) {
                    String var393 = class621.field8455.method2411(var391, (byte) -108).method2707(class149.field2477, (byte) 93);
                    if (var390 == 2) {
                        class8.method48("<img=1>" + var389, var393, (byte) -127, var391, "<img=1>" + var388, null, 25, 0, var388);
                    } else if (var390 == 1) {
                        class8.method48("<img=0>" + var389, var393, (byte) -125, var391, "<img=0>" + var388, null, 25, 0, var388);
                    } else {
                        class8.method48(var389, var393, (byte) -119, var391, var388, null, 25, 0, var388);
                    }
                }
                class480.field6701 = null;
                return true;
            } else if (class480.field6701 == class205.field2955) {
                int var394 = class149.field2477.method1494(255);
                int var395 = class149.field2477.method1503(-110);
                class328.method2084((byte) -124);
                class665.method3734(var394, 12, var395);
                class480.field6701 = null;
                return true;
            } else if (class753.field10516 == class480.field6701) {
                class460.field6487 = class253.field3660;
                if (class57.field1142 == 0) {
                    class237.field3446 = 0;
                    class578.field7935 = null;
                    class166.field2601 = null;
                    class710.field9636 = null;
                    class480.field6701 = null;
                    return true;
                }
                class710.field9636 = class149.field2477.method1525((byte) -112);
                boolean var396 = class149.field2477.method1535(255) == 1;
                if (var396) {
                    class149.field2477.method1525((byte) 108);
                }
                long var397 = class149.field2477.method1513(-456577760);
                class578.field7935 = class581.method3331(var397, -104);
                class293.field4108 = class149.field2477.method1536(-90);
                int var399 = class149.field2477.method1535(255);
                if (var399 == 255) {
                    class480.field6701 = null;
                    return true;
                }
                class237.field3446 = var399;
                class207[] var400 = new class207[100];
                for (int var401 = 0; var401 < class237.field3446; var401++) {
                    var400[var401] = new class207();
                    var400[var401].field2973 = class149.field2477.method1525((byte) 103);
                    boolean var407 = class149.field2477.method1535(255) == 1;
                    if (var407) {
                        var400[var401].field2965 = class149.field2477.method1525((byte) 107);
                    } else {
                        var400[var401].field2965 = var400[var401].field2973;
                    }
                    var400[var401].field2971 = class115.method1015(2, var400[var401].field2965);
                    var400[var401].field2967 = class149.field2477.method1478(842397944);
                    var400[var401].field2969 = class149.field2477.method1536(-118);
                    var400[var401].field2972 = class149.field2477.method1525((byte) -124);
                    if (var400[var401].field2965.equals(class58.field1147.field8189)) {
                        class182.field2757 = var400[var401].field2969;
                    }
                }
                boolean var402 = false;
                int var403 = class237.field3446;
                while (var403 > 0) {
                    var403--;
                    boolean var404 = true;
                    for (int var405 = 0; var405 < var403; var405++) {
                        if (var400[var405].field2971.compareTo(var400[var405 + 1].field2971) > 0) {
                            class207 var406 = var400[var405];
                            var400[var405] = var400[var405 + 1];
                            var400[var405 + 1] = var406;
                            var404 = false;
                        }
                    }
                    if (var404) {
                        break;
                    }
                }
                class166.field2601 = var400;
                class480.field6701 = null;
                return true;
            } else {
                class444.method2672("T1 - " + (class480.field6701 == null ? -1 : class480.field6701.method1966((byte) 110)) + "," + (class212.field3013 == null ? -1 : class212.field3013.method1966((byte) 127)) + "," + (class517.field7204 == null ? -1 : class517.field7204.method1966((byte) 125)) + " - " + class57.field1142, null, 15004);
                class170.method1282(false, (byte) 11);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "(B)V", line = 3251)
    public static void method3338(byte arg0) {
        field7970 = null;
        if (arg0 > 38) {
            field7967 = null;
            field7972 = null;
            field7973 = null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)Ljava/lang/Object;", line = 3274)
    public final Object method165(int arg0) {
        field7971++;
        if (arg0 < 75) {
            this.method165(-128);
        }
        return this.field7965;
    }
}
