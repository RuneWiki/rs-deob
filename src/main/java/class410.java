import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class410 {

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "[I")
    public static int[] field5129 = new int[50];

    @OriginalMember(owner = "client!bn", name = "g", descriptor = "[I")
    public static int[] field5133 = new int[3];

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "I")
    public static int field5127;

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "I")
    public static int field5128;

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "I")
    public static int field5130;

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "I")
    public static int field5131;

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "I")
    public static int field5132;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lr;I)V", line = 8)
    public static final void method2170(class566 arg0, int arg1) {
        class462.field5888 = class405.method2155(true, class622.field8710, arg0, 0);
        field5128++;
        class383.field4835 = class531.method2884((byte) 91, arg0, class622.field8710);
        class133.field1729 = class405.method2155(true, class201.field2536, arg0, arg1 ^ arg1);
        class689.field9771 = class531.method2884((byte) 121, arg0, class201.field2536);
        class65.field889 = class405.method2155(true, class413.field5162, arg0, arg1 + 27346);
        class546.field7269 = class531.method2884((byte) 120, arg0, class413.field5162);
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(B)V", line = 22)
    public static void method2171(byte arg0) {
        field5129 = null;
        field5133 = null;
        if (arg0 != -47) {
            method2172(72, -72, 71, 113, -101, -52, 79);
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIIIII)V", line = 38)
    public static final void method2172(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5132++;
        int var7 = class596.field8384;
        int[] var8 = class354.field4521;
        class642.field9041 = 0;
        if (arg4 != -140) {
            method2170(null, -68);
        }
        for (int var9 = 0; var9 < (class470.field5974 + var7); var9++) {
            class586 var32 = null;
            class687 var33;
            if (var7 > var9) {
                var33 = class351.field4490[var8[var9]];
            } else {
                var33 = ((class206) class180.field2318.method399(-32748, (long) class153.field1958[var9 - var7])).field2618;
                var32 = ((class307) var33).field3902;
                if (var32.field8205 != null) {
                    var32 = var32.method3220(-4261, class684.field9606);
                    if (var32 == null) {
                        continue;
                    }
                }
            }
            if (var33.field9701 >= 0 && (class673.field9473 == var33.field9713 || class376.field4748.field6470 == var33.field6470)) {
                class145.method841(var33.method1779(arg4 + 17706), var33, arg0, arg3 >> 1, arg4 + 144, arg6 >> 1, arg5);
                if (class273.field3450[0] >= 0) {
                    if (var33.field9667 != null && (var9 >= var7 || class148.field1900 == 0 || class148.field1900 == 3 || class148.field1900 == 1 && class259.method1511(((class514) var33).field7017, -116)) && class642.field9041 < class74.field1001) {
                        class74.field1012[class642.field9041] = class546.field7269.method3269((byte) 99, var33.field9667) / 2;
                        class74.field1000[class642.field9041] = class273.field3450[0];
                        class74.field1008[class642.field9041] = class273.field3450[1];
                        class74.field1004[class642.field9041] = var33.field9674;
                        class74.field1007[class642.field9041] = var33.field9738;
                        class74.field1015[class642.field9041] = var33.field9655;
                        class74.field1002[class642.field9041] = var33.field9667;
                        class642.field9041++;
                    }
                    int var34 = class273.field3450[1] + arg1;
                    int var45;
                    if (var33.field9671 || class133.field1735 >= var33.field9735) {
                        var45 = var34 - Math.max(class546.field7269.field8359, class528.field7139[0].method162());
                    } else {
                        boolean var35 = true;
                        byte var36 = 1;
                        int var38;
                        if (var7 > var9) {
                            class514 var37 = class351.field4490[var8[var9]];
                            var38 = var33.method3872(32195).field8424;
                            if (var37.field6985) {
                                var36 = 2;
                            }
                        } else {
                            var38 = var32.field8244;
                            if (var38 == -1) {
                                var38 = var33.method3872(32195).field8424;
                            }
                        }
                        class536[] var39 = class528.field7139;
                        if (var38 != -1) {
                            class536[] var40 = (class536[]) class691.field9779.method2418((long) var38, (byte) 100);
                            if (var40 == null) {
                                class661[] var41 = class661.method3722(class631.field8846, var38, 0);
                                if (var41 != null) {
                                    var40 = new class536[var41.length];
                                    for (int var42 = 0; var42 < var41.length; var42++) {
                                        var40[var42] = class32.field452.method1072(var41[var42], true);
                                    }
                                    class691.field9779.method2409((long) var38, var40, arg4 ^ 0xFFFFFF75);
                                }
                            }
                            if (var40 != null && var40.length >= 2) {
                                var39 = var40;
                            }
                        }
                        if (var39.length <= var36) {
                            var36 = 1;
                        }
                        class536 var43 = var39[0];
                        class536 var44 = var39[var36];
                        var45 = var34 - Math.max(class546.field7269.field8359, var43.method162());
                        int var46 = arg2 - ((var43.method167() >> 1) - class273.field3450[0]);
                        int var47 = var43.method167() * var33.field9695 / 255;
                        if (var33.field9695 > 0 && var47 < 2) {
                            var47 = 2;
                        }
                        var43.method2902(var46, var45);
                        class32.field452.method1070(var46, var45, var46 + var47, var45 - -var43.method162());
                        var44.method2902(var46, var45);
                        class32.field452.method1083(arg2, arg1, arg2 + arg6, arg1 + arg3);
                    }
                    var45 -= 2;
                    if (!var33.field9671) {
                        if (class133.field1735 < var33.field9663) {
                            class536 var48 = class575.field8015[var33.field9675 ? 2 : 0];
                            class536 var49 = class575.field8015[var33.field9675 ? 3 : 1];
                            boolean var50 = true;
                            int var51;
                            if ((var33 instanceof class307)) {
                                var51 = var32.field8198;
                                if (var51 == -1) {
                                    var51 = var33.method3872(32195).field8461;
                                }
                            } else {
                                var51 = var33.method3872(32195).field8461;
                            }
                            if (var51 != -1) {
                                class536[] var52 = (class536[]) class392.field4930.method2418((long) var51, (byte) 100);
                                if (var52 == null) {
                                    class661[] var53 = class661.method3722(class631.field8846, var51, 0);
                                    if (var53 != null) {
                                        var52 = new class536[var53.length];
                                        for (int var54 = 0; var54 < var53.length; var54++) {
                                            var52[var54] = class32.field452.method1072(var53[var54], true);
                                        }
                                        class392.field4930.method2409((long) var51, var52, 1);
                                    }
                                }
                                if (var52 != null && var52.length == 4) {
                                    var48 = var52[var33.field9675 ? 2 : 0];
                                    var49 = var52[var33.field9675 ? 3 : 1];
                                }
                            }
                            int var55 = var33.field9663 - class133.field1735;
                            int var56;
                            if (var55 <= var33.field9720) {
                                var56 = var48.method167();
                            } else {
                                int var57 = var55 - var33.field9720;
                                int var58 = var33.field9670 == 0 ? 0 : (var33.field9717 - var57) / var33.field9670 * var33.field9670;
                                var56 = var58 * var48.method167() / var33.field9717;
                            }
                            int var59 = var48.method162();
                            var45 -= var59;
                            int var60 = arg2 + (class273.field3450[0] - (var48.method167() >> 1));
                            var48.method2902(var60, var45);
                            class32.field452.method1070(var60, var45, var56 + var60, var45 + var59);
                            var49.method2902(var60, var45);
                            class32.field452.method1083(arg2, arg1, arg2 + arg6, arg1 - -arg3);
                            var45 -= 2;
                        }
                        if (var9 < var7) {
                            class514 var61 = (class514) var33;
                            if (var61.field7016 != -1) {
                                var45 -= 25;
                                class622.field8705[var61.field7016].method2902(arg2 + class273.field3450[0] - 12, var45);
                                var45 -= 2;
                            }
                            if (var61.field7004 != -1) {
                                var45 -= 25;
                                class49.field687[var61.field7004].method2902(class273.field3450[0] + arg2 - 12, var45);
                                var45 -= 2;
                            }
                        } else if (var32.field8221 >= 0 && var32.field8221 < class49.field687.length) {
                            class536 var62 = class49.field687[var32.field8221];
                            var45 -= 25;
                            var62.method2902(class273.field3450[0] + arg2 - (var62.method167() >> 1), var45);
                            var45 -= 2;
                        }
                    }
                    int var10000;
                    if (!(var33 instanceof class514)) {
                        int var63 = 0;
                        class651[] var64 = class52.field784;
                        for (int var65 = 0; var65 < var64.length; var65++) {
                            class651 var67 = var64[var65];
                            if (var67 != null && var67.field9181 == 1 && class153.field1958[var9 - var7] == var67.field9185) {
                                class536 var68 = class475.field6026[var67.field9182];
                                if (var63 < var68.method162()) {
                                    var63 = var68.method162();
                                }
                                if (class133.field1735 % 20 < 10) {
                                    var68.method2902(arg2 + class273.field3450[0] - 12, -var68.method162() + var45);
                                }
                            }
                        }
                        if (var63 > 0) {
                            var10000 = var45 - (var63 + 2);
                        }
                    } else if (var9 >= 0) {
                        int var69 = 0;
                        class651[] var70 = class52.field784;
                        for (int var71 = 0; var71 < var70.length; var71++) {
                            class651 var73 = var70[var71];
                            if (var73 != null && var73.field9181 == 10 && var8[var9] == var73.field9185) {
                                class536 var74 = class475.field6026[var73.field9182];
                                if (var74.method162() > var69) {
                                    var69 = var74.method162();
                                }
                                var74.method2902(class273.field3450[0] + arg2 - 12, var45 + -var74.method162());
                            }
                        }
                        if (var69 > 0) {
                            var10000 = var45 - (var69 + 2);
                        }
                    }
                    for (int var75 = 0; var75 < 4; var75++) {
                        if (class133.field1735 < var33.field9707[var75]) {
                            int var76 = var33.method1779(17566) / 2;
                            class145.method841(var76, var33, arg0, arg3 >> 1, 4, arg6 >> 1, arg5);
                            if (class273.field3450[0] > -1) {
                                int var77 = class160.field2107[var33.field9649[var75]].method167();
                                if (var75 == 1) {
                                    class273.field3450[1] -= 20;
                                }
                                if (var75 == 2) {
                                    class273.field3450[0] -= var77 - 9;
                                    class273.field3450[1] -= 10;
                                }
                                if (var75 == 3) {
                                    class273.field3450[0] += var77 - 9;
                                    class273.field3450[1] -= 10;
                                }
                                class160.field2107[var33.field9649[var75]].method2902(arg2 + class273.field3450[0] - (var77 >> 1), arg1 - 12 + class273.field3450[1]);
                                class462.field5888.method2199(-1, arg4 ^ 0x6, class273.field3450[0] + arg2 - 1, 0, class273.field3450[1] + arg1 + 3, Integer.toString(var33.field9684[var75]));
                            }
                        }
                    }
                }
            }
        }
        for (int var10 = 0; var10 < class514.field7027; var10++) {
            int var28 = class396.field5000[var10];
            class687 var29;
            if (var28 < 2048) {
                var29 = class351.field4490[var28];
            } else {
                var29 = ((class206) class180.field2318.method399(-32748, (long) (var28 - 2048))).field2618;
            }
            int var30 = class26.field397[var10];
            class687 var31;
            if (var30 < 2048) {
                var31 = class351.field4490[var30];
            } else {
                var31 = ((class206) class180.field2318.method399(-32748, (long) (var30 - 2048))).field2618;
            }
            class55.method351(var29, 1071156814, arg5, --var29.field9726, var31, arg1, arg2, arg6, arg0, arg3);
        }
        int var11 = class546.field7269.field8359 + class546.field7269.field8371 + 2;
        for (int var12 = 0; var12 < class642.field9041; var12++) {
            int var13 = class74.field1000[var12];
            int var14 = class74.field1008[var12];
            int var15 = class74.field1012[var12];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var27 = 0; var27 < var12; var27++) {
                    if (var14 + 2 > class74.field1008[var27] + -var11 && class74.field1008[var27] + 2 > var14 - var11 && (var13 - var15) < (class74.field1000[var27] + class74.field1012[var27]) && (var13 + var15) > (class74.field1000[var27] - class74.field1012[var27]) && class74.field1008[var27] - var11 < var14) {
                        var16 = true;
                        var14 = class74.field1008[var27] - var11;
                    }
                }
            }
            class74.field1008[var12] = var14;
            String var17 = class74.field1002[var12];
            if (class502.field6623 == 0) {
                int var18 = 16776960;
                if (class74.field1004[var12] < 6) {
                    var18 = class320.field4084[class74.field1004[var12]];
                }
                if (class74.field1004[var12] == 6) {
                    var18 = class673.field9473 % 20 < 10 ? 16711680 : 16776960;
                }
                if (class74.field1004[var12] == 7) {
                    var18 = class673.field9473 % 20 >= 10 ? 65535 : 255;
                }
                if (class74.field1004[var12] == 8) {
                    var18 = class673.field9473 % 20 < 10 ? 45056 : 8454016;
                }
                if (class74.field1004[var12] == 9) {
                    int var19 = 150 - class74.field1015[var12];
                    if (var19 < 50) {
                        var18 = var19 * 1280 + 16711680;
                    } else if (var19 < 100) {
                        var18 = 33160960 - (var19 * 327680);
                    } else if (var19 < 150) {
                        var18 = (var19 - 100) * 5 + 65280;
                    }
                }
                if (class74.field1004[var12] == 10) {
                    int var20 = 150 - class74.field1015[var12];
                    if (var20 < 50) {
                        var18 = (var20 * 5) + 16711680;
                    } else if (var20 < 100) {
                        var18 = 16711935 - ((var20 - 50) * 327680);
                    } else if (var20 < 150) {
                        var18 = (var20 - 100) * 327680 + (255 - (var20 - 100) * 5);
                    }
                }
                if (class74.field1004[var12] == 11) {
                    int var21 = 150 - class74.field1015[var12];
                    if (var21 < 50) {
                        var18 = 16777215 - var21 * 327685;
                    } else if (var21 < 100) {
                        var18 = (var21 - 50) * 327685 + 65280;
                    } else if (var21 < 150) {
                        var18 = 16777215 - ((var21 - 100) * 327680);
                    }
                }
                int var22 = var18 | 0xFF000000;
                if (class74.field1007[var12] == 0) {
                    class65.field889.method2199(var22, -142, arg2 + var13, -16777216, arg1 + var14, var17);
                }
                if (class74.field1007[var12] == 1) {
                    class65.field889.method2204(arg2 + var13, arg1 - -var14, -16777216, class673.field9473, var22, arg4 + 15382, var17);
                }
                if (class74.field1007[var12] == 2) {
                    class65.field889.method2191(arg1 + var14, -16777216, var22, var17, arg2 + var13, class673.field9473, (byte) -106);
                }
                if (class74.field1007[var12] == 3) {
                    class65.field889.method2195((byte) 93, class673.field9473, var17, arg1 + var14, -16777216, var22, 150 - class74.field1015[var12], arg2 + var13);
                }
                if (class74.field1007[var12] == 4) {
                    int var23 = (150 - class74.field1015[var12]) * (class546.field7269.method3269((byte) 99, var17) + 100) / 150;
                    class32.field452.method1070(arg2 + var13 - 50, arg1, arg2 + var13 + 50, arg1 + arg3);
                    class65.field889.method2192(var22, true, arg2 + var13 - (var23 + -50), var17, -16777216, arg1 + var14);
                    class32.field452.method1083(arg2, arg1, arg2 + arg6, arg1 + arg3);
                }
                if (class74.field1007[var12] == 5) {
                    int var24 = 150 - class74.field1015[var12];
                    int var25 = 0;
                    if (var24 < 25) {
                        var25 = var24 - 25;
                    } else if (var24 > 125) {
                        var25 = var24 - 125;
                    }
                    int var26 = class546.field7269.field8371 + class546.field7269.field8359;
                    class32.field452.method1070(arg2, arg1 + var14 - var26 - 1, arg2 + arg6, arg1 + var14 + 5);
                    class65.field889.method2199(var22, -142, arg2 + var13, -16777216, arg1 + var25 + var14, var17);
                    class32.field452.method1083(arg2, arg1, arg2 + arg6, arg1 + arg3);
                }
            } else {
                class65.field889.method2199(-256, -142, arg2 + var13, -16777216, arg1 + var14, var17);
            }
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)V", line = 625)
    public static final void method2173(int arg0) {
        field5127++;
        class450 var1 = class199.field2526;
        synchronized (class199.field2526) {
            if (arg0 < 110) {
                field5133 = null;
            }
            class199.field2526.method2406(18385);
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIIBII[Lkp;II)V", line = 638)
    public static final void method2174(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, class507[] arg7, int arg8, int arg9) {
        field5131++;
        class32.field452.method1083(arg2, arg0, arg5, arg1);
        if (arg4 != -4) {
            method2172(31, -71, -93, -8, -21, -82, 43);
        }
        for (int var10 = 0; var10 < arg7.length; var10++) {
            class507 var11 = arg7[var10];
            if (var11 != null && (var11.field6719 == arg9 || arg9 == -1412584499 && class358.field4562 == var11)) {
                int var12;
                if (arg6 == -1) {
                    class221.field2711[class66.field905].setBounds(var11.field6726 + arg3, var11.field6724 - -arg8, var11.field6793, var11.field6700);
                    var12 = class66.field905++;
                } else {
                    var12 = arg6;
                }
                var11.field6800 = var12;
                var11.field6829 = class133.field1735;
                if (!client.method3809(var11)) {
                    if (var11.field6720 != 0) {
                        class511.method2759(var11, 108);
                    }
                    int var13 = var11.field6726 + arg3;
                    int var14 = var11.field6724 + arg8;
                    int var15 = var11.field6763;
                    if (class253.field3101 && (client.method3819(var11).field4678 != 0 || var11.field6735 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class358.field4562 == var11) {
                        if (arg9 != -1412584499 && (class415.field5182 == var11.field6869 || class405.field5076 == var11.field6869)) {
                            class314.field4049 = arg3;
                            class532.field7181 = arg7;
                            class194.field2441 = arg8;
                            continue;
                        }
                        if (class659.field9348 && class356.field4538) {
                            int var16 = class289.field3592.method944(2000);
                            int var17 = class289.field3592.method941(95);
                            int var18 = var16 - class222.field2716;
                            int var19 = var17 - class26.field387;
                            if (class65.field884 > var18) {
                                var18 = class65.field884;
                            }
                            if (class393.field4945 > var19) {
                                var19 = class393.field4945;
                            }
                            if ((var11.field6793 + var18) > (class65.field884 + class34.field473.field6793)) {
                                var18 = class65.field884 + class34.field473.field6793 - var11.field6793;
                            }
                            var13 = var18;
                            if ((class393.field4945 + class34.field473.field6700) < (var11.field6700 + var19)) {
                                var19 = class393.field4945 + class34.field473.field6700 - var11.field6700;
                            }
                            var14 = var19;
                        }
                        if (class405.field5076 == var11.field6869) {
                            var15 = 128;
                        }
                    }
                    int var22;
                    int var23;
                    int var24;
                    int var25;
                    if (var11.field6735 == 2) {
                        var23 = arg0;
                        var25 = arg1;
                        var24 = arg5;
                        var22 = arg2;
                    } else {
                        int var20 = var13 + var11.field6793;
                        int var21 = var11.field6700 + var14;
                        if (var11.field6735 == 9) {
                            var21++;
                            var20++;
                        }
                        var22 = var13 > arg2 ? var13 : arg2;
                        var23 = var14 > arg0 ? var14 : arg0;
                        var24 = arg5 <= var20 ? arg5 : var20;
                        var25 = arg1 > var21 ? var21 : arg1;
                    }
                    if (var24 > var22 && var25 > var23) {
                        if (var11.field6720 != 0) {
                            if (class205.field2605 == var11.field6720 || class631.field8854 == var11.field6720) {
                                class637.method3569(false, class631.field8854 == var11.field6720, var14, var11.field6793, var13, var11.field6700);
                                class413.field5168[var12] = true;
                                class32.field452.method1083(arg2, arg0, arg5, arg1);
                                continue;
                            }
                            if (class529.field7151 == var11.field6720) {
                                if (var11.method2740((byte) 125, class32.field452) != null) {
                                    class671.method3767((byte) 76);
                                    class260.method1516(var11, class32.field452, 125, var13, var14);
                                    class177.field2286[var12] = true;
                                    class32.field452.method1083(arg2, arg0, arg5, arg1);
                                }
                                continue;
                            }
                            if (class603.field8498 == var11.field6720) {
                                if (var11.method2740((byte) 125, class32.field452) != null) {
                                    class86.method494(arg4 ^ 0xFFFFC003, var11, var13, var14);
                                    class177.field2286[var12] = true;
                                    class32.field452.method1083(arg2, arg0, arg5, arg1);
                                }
                                continue;
                            }
                            if (class366.field4658 == var11.field6720) {
                                class631.method3534(var14, class32.field452, var13, (byte) -34, var11.field6700, var11.field6793, class651.field9183);
                                class413.field5168[var12] = true;
                                class32.field452.method1083(arg2, arg0, arg5, arg1);
                                continue;
                            }
                            if (class291.field3623 == var11.field6720) {
                                class686.method3860(-116, var13, var11.field6700, var11.field6793, var14, class32.field452);
                                class413.field5168[var12] = true;
                                class32.field452.method1083(arg2, arg0, arg5, arg1);
                                continue;
                            }
                            if (class649.field9166 == var11.field6720) {
                                if (!class605.field8512 && !class610.field8558) {
                                    continue;
                                }
                                int var26 = var11.field6793 + var13;
                                int var27 = var14 + 15;
                                if (class605.field8512) {
                                    int var28 = -256;
                                    if (class493.field6520 < 20) {
                                        var28 = -65536;
                                    }
                                    class133.field1729.method2198(var26, var27, "Fps:" + class493.field6520, var28, -1, -87);
                                    var27 += 15;
                                    Runtime var29 = Runtime.getRuntime();
                                    int var30 = (int) ((var29.totalMemory() - var29.freeMemory()) / 1024L);
                                    int var31 = -256;
                                    if (var30 > 98304) {
                                        var31 = -65536;
                                        if (class446.field5715) {
                                            class394.method2113(4096);
                                            for (int var32 = 0; var32 < 10; var32++) {
                                                System.gc();
                                            }
                                            var30 = (int) ((var29.totalMemory() - var29.freeMemory()) / 1024L);
                                            if (var30 > 65536) {
                                                class250.method1468(4, false, "WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
                                            }
                                        }
                                    }
                                    class133.field1729.method2198(var26, var27, "Mem:" + var30 + "k", var31, -1, -56);
                                    var27 += 15;
                                    class133.field1729.method2198(var26, var27, "In:" + class638.field8953 + "B/s Out:" + class319.field4082 + "B/s", -256, -1, -101);
                                    var27 += 15;
                                    int var33 = class32.field452.method1057() / 1024;
                                    class133.field1729.method2198(var26, var27, "Offheap:" + var33 + "k", var33 > 65536 ? -65536 : -256, -1, -83);
                                    var27 += 15;
                                    int var34 = 0;
                                    int var35 = 0;
                                    int var36 = 0;
                                    for (int var37 = 0; var37 < 35; var37++) {
                                        if (class654.field9227[var37] != null) {
                                            var34 += class654.field9227[var37].method1742(false);
                                            var35 += class654.field9227[var37].method1738(-14311);
                                            var36 += class654.field9227[var37].method1741(true);
                                        }
                                    }
                                    int var38 = var36 * 100 / var34;
                                    int var39 = var35 * 10000 / var34;
                                    String var40 = "Cache:" + class145.method843(0, 7110, (long) var39, true, 2) + "% (" + var38 + "%)";
                                    class462.field5888.method2198(var26, var27, var40, -256, -1, arg4 - 104);
                                    var27 += 12;
                                }
                                if (class260.field3215 > 0) {
                                    class462.field5888.method2198(var26, var27, "Particles: " + class273.field3443 + " / " + class260.field3215, -256, -1, -126);
                                }
                                var27 += 12;
                                if (class610.field8558) {
                                    class462.field5888.method2198(var26, var27, "Polys: " + class32.field452.method1045() + " Models: " + class32.field452.method1036(), -256, -1, arg4 ^ 0x31);
                                    var27 += 12;
                                    class462.field5888.method2198(var26, var27, "Ls: " + class188.field2361 + " La: " + class145.field1878 + " NPC: " + class271.field3430 + " Pl: " + class36.field497, -256, -1, arg4 - 73);
                                    class175.method1101(0);
                                    var27 += 12;
                                }
                                class413.field5168[var12] = true;
                                continue;
                            }
                        }
                        if (var11.field6735 == 0) {
                            if (class478.field6181 == var11.field6720 && class32.field452.method1006()) {
                                class32.field452.method1078(var13, var14, var11.field6793, var11.field6700);
                            }
                            method2174(var23, var25, var22, var13 - var11.field6785, (byte) -4, var24, var12, arg7, var14 - var11.field6769, var11.field6764);
                            if (var11.field6707 != null) {
                                method2174(var23, var25, var22, var13 - var11.field6785, (byte) -4, var24, var12, var11.field6707, var14 - var11.field6769, var11.field6764);
                            }
                            class340 var41 = (class340) class138.field1797.method399(-32748, (long) var11.field6764);
                            if (var41 != null) {
                                class232.method1399(var14, (byte) -23, var25, var12, var24, var41.field4392, var22, var23, var13);
                            }
                            if (class478.field6181 == var11.field6720 && class32.field452.method1006()) {
                                class32.field452.method983();
                            }
                            class32.field452.method1083(arg2, arg0, arg5, arg1);
                        }
                        if (class472.field5994[var12] || class273.field3449 > 1) {
                            if (var11.field6735 == 3) {
                                if (var15 == 0) {
                                    if (var11.field6701) {
                                        class32.field452.method1090(var13, var14, var11.field6793, var11.field6700, var11.field6710, 0);
                                    } else {
                                        class32.field452.method978(var13, var14, var11.field6793, var11.field6700, var11.field6710, 0);
                                    }
                                } else if (var11.field6701) {
                                    class32.field452.method1090(var13, var14, var11.field6793, var11.field6700, 255 - (var15 & 0xFF) << 24 | var11.field6710 & 0xFFFFFF, 1);
                                } else {
                                    class32.field452.method978(var13, var14, var11.field6793, var11.field6700, 255 - (var15 & 0xFF) << 24 | var11.field6710 & 0xFFFFFF, 1);
                                }
                            } else if (var11.field6735 == 4) {
                                class413 var42 = var11.method2741(class32.field452, arg4 - 7226);
                                if (var42 != null) {
                                    int var43 = var11.field6710;
                                    String var44 = var11.field6840;
                                    if (var11.field6832 != -1) {
                                        class3 var45 = class633.field8881.method434(12388, var11.field6832);
                                        var44 = var45.field34;
                                        if (var44 == null) {
                                            var44 = "null";
                                        }
                                        if ((var45.field88 == 1 || var11.field6858 != 1) && var11.field6858 != -1) {
                                            var44 = "<col=ff9040>" + var44 + "</col> x" + class691.method3889(true, var11.field6858);
                                        }
                                    }
                                    if (class461.field5873 == var11) {
                                        var44 = class83.field1139.method476((byte) -127, class250.field3068);
                                        var43 = var11.field6710;
                                    }
                                    if (class344.field4419) {
                                        class32.field452.method1070(var13, var14, var13 + var11.field6793, var11.field6700 + var14);
                                    }
                                    var42.method2197(var11.field6826 ? 255 - (var15 & 0xFF) << 24 : -1, null, var44, var14, 255 - (var15 & 0xFF) << 24 | var43, true, null, 0, var11.field6780, var13, var11.field6793, class677.field9502, 0, var11.field6716, var11.field6750, var11.field6700, var11.field6782);
                                    if (class344.field4419) {
                                        class32.field452.method1083(arg2, arg0, arg5, arg1);
                                    }
                                } else if (class22.field347) {
                                    class572.method3158(var11, 1023);
                                }
                            } else if (var11.field6735 == 5) {
                                if (var11.field6827 < 0) {
                                    class536 var46;
                                    if (var11.field6832 == -1) {
                                        var46 = var11.method2735(class32.field452, arg4 - 42);
                                    } else {
                                        class498 var47 = var11.field6759 ? class376.field4748.field7008 : null;
                                        var46 = class633.field8881.method427(var11.field6843 | 0xFF000000, var11.field6832, var47, class32.field452, var11.field6858, var11.field6812, 124, var11.field6846);
                                    }
                                    if (var46 != null) {
                                        int var48 = var46.method160();
                                        int var49 = var46.method166();
                                        int var50 = 255 - (var15 & 0xFF) << 24 | (var11.field6710 == 0 ? 16777215 : var11.field6710 & 0xFFFFFF);
                                        if (var11.field6864) {
                                            class32.field452.method1070(var13, var14, var11.field6793 + var13, var11.field6700 + var14);
                                            if (var11.field6754 != 0) {
                                                int var51 = (-(-var48 - var11.field6793) - 1) / var48;
                                                int var52 = (var11.field6700 + var49 - 1) / var49;
                                                for (int var53 = 0; var53 < var51; var53++) {
                                                    for (int var54 = 0; var54 < var52; var54++) {
                                                        if (var11.field6710 == 0) {
                                                            var46.method2907((float) var48 / 2.0F + (float) (var48 * var53 + var13), (float) var49 / 2.0F + (float) (var14 - -(var49 * var54)), 4096, var11.field6754);
                                                        } else {
                                                            var46.method2900((float) var48 / 2.0F + (float) (var48 * var53 + var13), (float) var49 / 2.0F + (float) (var49 * var54 + var14), 4096, var11.field6754, 0, var50, 1);
                                                        }
                                                    }
                                                }
                                            } else if (var11.field6710 == 0 && var15 == 0) {
                                                var46.method2909(var13, var14, var11.field6793, var11.field6700);
                                            } else {
                                                var46.method164(var13, var14, var11.field6793, var11.field6700, 0, var50, 1);
                                            }
                                            class32.field452.method1083(arg2, arg0, arg5, arg1);
                                        } else if (var11.field6710 == 0 && var15 == 0) {
                                            if (var11.field6754 != 0) {
                                                var46.method2907((float) var11.field6793 / 2.0F + (float) var13, (float) var11.field6700 / 2.0F + (float) var14, var11.field6793 * 4096 / var48, var11.field6754);
                                            } else if (var11.field6793 == var48 && var11.field6700 == var49) {
                                                var46.method2902(var13, var14);
                                            } else {
                                                var46.method2899(var13, var14, var11.field6793, var11.field6700);
                                            }
                                        } else if (var11.field6754 != 0) {
                                            var46.method2900((float) var11.field6793 / 2.0F + (float) var13, (float) var11.field6700 / 2.0F + (float) var14, var11.field6793 * 4096 / var48, var11.field6754, 0, var50, 1);
                                        } else if (var11.field6793 == var48 && var11.field6700 == var49) {
                                            var46.method155(var13, var14, 0, var50, 1);
                                        } else {
                                            var46.method2901(var13, var14, var11.field6793, var11.field6700, 0, var50, 1);
                                        }
                                    } else if (class22.field347) {
                                        class572.method3158(var11, arg4 + 1027);
                                    }
                                } else {
                                    var11.method2731(class64.field879, class470.field5972, (byte) 106).method3240(0, var13, var14, var11.field6700, (byte) -100, var11.field6802 << 3, var11.field6793, 0, var11.field6809 << 3, class32.field452);
                                }
                            } else if (var11.field6735 == 6) {
                                class306.method1754(-240);
                                class474 var55 = null;
                                int var56 = 0;
                                if (var11.field6832 != -1) {
                                    class3 var57 = class633.field8881.method434(12388, var11.field6832);
                                    if (var57 != null) {
                                        class3 var58 = var57.method24(var11.field6858, -2);
                                        class395 var59 = var11.field6746 == -1 ? null : class583.field8149.method1844(64, var11.field6746);
                                        class498 var60 = var11.field6759 ? class376.field4748.field7008 : null;
                                        var55 = var58.method31(var11.field6742, class32.field452, 2048, var59, var11.field6717, var60, 1, var11.field6820, 16777215);
                                        if (var55 == null) {
                                            class572.method3158(var11, arg4 + 1027);
                                        } else {
                                            var56 = -var55.method757() >> 1;
                                        }
                                    }
                                } else if (var11.field6714 == 5) {
                                    int var61 = var11.field6798;
                                    if (var61 >= 0 && var61 < 2048) {
                                        class514 var62 = class351.field4490[var61];
                                        class395 var63 = var11.field6746 == -1 ? null : class583.field8149.method1844(64, var11.field6746);
                                        if (var62 != null && (class167.field2200 == var61 || class322.method1842(var62.field7017, false) == var11.field6745)) {
                                            var55 = var62.field7008.method2682(class40.field540, class583.field8149, 2048, class633.field8881, var63, class287.field3581, null, class684.field9606, var11.field6742, -1, null, var11.field6717, var11.field6820, 0, class591.field8297, class32.field452, 0, true, (byte) 125);
                                        }
                                    }
                                } else if (var11.field6714 == 8 || var11.field6714 == 9) {
                                    class492 var65 = class183.method1141(false, (byte) 53, var11.field6798);
                                    class395 var66 = var11.field6746 == -1 ? null : class583.field8149.method1844(arg4 + 68, var11.field6746);
                                    if (var65 != null) {
                                        class498 var67 = var11.field6759 ? class376.field4748.field7008 : null;
                                        var55 = var65.method2650(-1, var11.field6820, 2048, var11.field6742, var11.field6714 == 9, class32.field452, var67, var11.field6717, var11.field6745, var66);
                                    }
                                } else if (var11.field6746 == -1) {
                                    var55 = var11.method2725(class32.field452, class684.field9606, 0, class591.field8297, class633.field8881, arg4 ^ 0x72, class40.field540, null, class376.field4748.field7008, -1, 2048, class287.field3581, -1, class583.field8149);
                                    if (var55 == null && class22.field347) {
                                        class572.method3158(var11, arg4 + 1027);
                                    }
                                } else {
                                    class395 var64 = class583.field8149.method1844(arg4 + 68, var11.field6746);
                                    var55 = var11.method2725(class32.field452, class684.field9606, var11.field6742, class591.field8297, class633.field8881, -108, class40.field540, var64, class376.field4748.field7008, var11.field6820, 2048, class287.field3581, var11.field6717, class583.field8149);
                                    if (var55 == null && class22.field347) {
                                        class572.method3158(var11, arg4 ^ 0xFFFFFC03);
                                    }
                                }
                                if (var55 != null) {
                                    int var68;
                                    if (var11.field6712 > 0) {
                                        var68 = (var11.field6793 << 9) / var11.field6712;
                                    } else {
                                        var68 = 512;
                                    }
                                    int var69;
                                    if (var11.field6806 > 0) {
                                        var69 = (var11.field6700 << 9) / var11.field6806;
                                    } else {
                                        var69 = 512;
                                    }
                                    int var70 = var11.field6793 / 2 + var13;
                                    int var71 = var11.field6700 / 2 + var14;
                                    if (!var11.field6727) {
                                        var70 += var11.field6772 * var68 >> 9;
                                        var71 += var11.field6732 * var69 >> 9;
                                    }
                                    class678.field9511.method918();
                                    class32.field452.method1058(class678.field9511);
                                    class32.field452.method1048(var70, var71, var68, var69);
                                    class32.field452.method1031();
                                    if (var11.field6855) {
                                        class32.field452.method1034(false);
                                    }
                                    if (var11.field6727) {
                                        class195.field2455.method911(var11.field6813);
                                        class195.field2455.method910(var11.field6799);
                                        class195.field2455.method924(var11.field6867);
                                        class195.field2455.method903(var11.field6772, var11.field6732, var11.field6739);
                                    } else {
                                        int var72 = (var11.field6850 << 2) * class453.field5810[var11.field6813 << 3] >> 14;
                                        int var73 = (var11.field6850 << 2) * class453.field5811[var11.field6813 << 3] >> 14;
                                        class195.field2455.method902(-var11.field6867 << 3);
                                        class195.field2455.method910(var11.field6799 << 3);
                                        class195.field2455.method903(var11.field6833 << 2, (var11.field6825 << 2) + var72 + var56, var73 - -(var11.field6825 << 2));
                                        class195.field2455.method922(var11.field6813 << 3);
                                    }
                                    var11.method2730((byte) 55, var55, class195.field2455, class32.field452, class133.field1735);
                                    if (class344.field4419) {
                                        class32.field452.method1070(var13, var14, var11.field6793 + var13, var14 - -var11.field6700);
                                    }
                                    if (var11.field6727) {
                                        if (var11.field6721) {
                                            var55.method751(class195.field2455, null, var11.field6850, 1);
                                        } else {
                                            var55.method717(class195.field2455, null, 1);
                                            if (var11.field6845 != null) {
                                                class32.field452.method993(var11.field6845.method535());
                                            }
                                        }
                                    } else if (var11.field6721) {
                                        var55.method751(class195.field2455, null, var11.field6850 << 2, 1);
                                    } else {
                                        var55.method717(class195.field2455, null, 1);
                                        if (var11.field6845 != null) {
                                            class32.field452.method993(var11.field6845.method535());
                                        }
                                    }
                                    if (class344.field4419) {
                                        class32.field452.method1083(arg2, arg0, arg5, arg1);
                                    }
                                    if (var11.field6855) {
                                        class32.field452.method1034(true);
                                    }
                                }
                            } else if (var11.field6735 == 9) {
                                int var74;
                                int var75;
                                int var76;
                                int var77;
                                if (var11.field6817) {
                                    var74 = var14;
                                    var75 = var11.field6793 + var13;
                                    var76 = var13;
                                    var77 = var14 + var11.field6700;
                                } else {
                                    var74 = var11.field6700 + var14;
                                    var76 = var13;
                                    var77 = var14;
                                    var75 = var11.field6793 + var13;
                                }
                                if (var11.field6748 == 1) {
                                    class32.field452.method1065(var76, var77, var75, var74, var11.field6710, 0);
                                } else {
                                    class32.field452.method1021(var76, var77, var75, var74, var11.field6710, var11.field6748, 0);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lfn;IIII)V", line = 1347)
    public static final void method2175(class288 arg0, int arg1, int arg2, int arg3, int arg4) {
        field5130++;
        long var5 = (long) (arg2 << 14 | arg1 << 28 | arg4);
        class650 var7 = (class650) class533.field7185.method399(-32748, var5);
        if (var7 == null) {
            class650 var8 = new class650();
            class533.field7185.method402(var8, (byte) -92, var5);
            var8.field9177.method239(arg0, (byte) 93);
        } else if (arg3 == -16777216) {
            class3 var9 = class633.field8881.method434(12388, arg0.field3586);
            int var10 = var9.field99;
            if (var9.field88 == 1) {
                var10 = (arg0.field3585 + 1) * var10;
            }
            for (class288 var11 = (class288) var7.field9177.method237(105); var11 != null; var11 = (class288) var7.field9177.method245((byte) 124)) {
                class3 var12 = class633.field8881.method434(12388, var11.field3586);
                int var13 = var12.field99;
                if (var12.field88 == 1) {
                    var13 = (var11.field3585 + 1) * var13;
                }
                if (var13 < var10) {
                    class404.method2151(arg0, var11, arg3 + 16777220);
                    return;
                }
            }
            var7.field9177.method239(arg0, (byte) 93);
        }
    }
}
