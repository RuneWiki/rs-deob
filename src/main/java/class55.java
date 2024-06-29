import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class55 {

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "[I")
    public static int[] field790 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "I")
    public static int field794;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(III)Z")
    public static final boolean method349(int arg0, int arg1, int arg2) {
        field789++;
        if (arg0 != 512) {
            method354(7);
        }
        return (arg2 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)V")
    public static void method350(byte arg0) {
        field790 = null;
        if (arg0 < 20) {
            method350((byte) -104);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lni;IIILni;IIIII)V")
    public static final void method351(class687 arg0, int arg1, int arg2, int arg3, class687 arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field794++;
        int var10 = arg4.method1775((byte) -7);
        if (arg1 != 1071156814) {
            field790 = null;
        }
        if (var10 == -1) {
            return;
        }
        Object var11 = null;
        class536 var12 = (class536) class195.field2452.method2418((long) var10, (byte) 100);
        if (var12 == null) {
            class661[] var13 = class661.method3722(class631.field8846, var10, 0);
            if (var13 == null) {
                return;
            }
            var12 = class32.field452.method1072(var13[0], true);
            class195.field2452.method2409((long) var10, var12, 1);
        }
        class281.method1593(0, arg0.field6464, arg0.method2785(-1) * 256, arg1 - 1071156936, arg2, arg7 >> 1, arg0.field6470, arg8, arg9 >> 1, arg0.field6461);
        int var14 = arg6 + class273.field3450[0] - 18;
        int var15 = arg3 / 4 * 18 + var14;
        int var16 = class273.field3450[1] + arg5 - 16 - 54;
        int var17 = arg3 % 4 * 18 + var16;
        var12.method2902(var15, var17);
        if (arg0 == arg4) {
            class32.field452.method3110(18, var17 - 1, 18, var15 - 1, 20822, -256);
        }
        class480 var18 = class84.method481(arg1 - 1071156814);
        var18.field6376 = var15 + 16;
        var18.field6383 = var15;
        var18.field6380 = arg4;
        var18.field6382 = var17 + 16;
        var18.field6377 = var17;
        class586.field8174.method801(var18, 98);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lfh;B)V")
    public static final void method352(class266 arg0, byte arg1) {
        field793++;
        if (class472.field5985 == arg0) {
            int var2 = class298.field3671.method3501(-9268);
            int var3 = (var2 & 0x7) + class517.field7053;
            int var4 = class630.field8817 + var3;
            int var5 = (var2 >> 4 & 0x7) + class605.field8511;
            int var6 = class145.field1879 + var5;
            int var7 = class298.field3671.method3470(13111);
            int var8 = class298.field3671.method3519((byte) 109);
            boolean var9 = var5 >= 0 && var3 >= 0 && class431.field5395 > var5 && var3 < class452.field5802;
            if (var9 || class587.method3235(class360.field4584, (byte) -107)) {
                class410.method2175(new class288(var7, var8), class356.field4558, var4, -16777216, var6);
                if (var9) {
                    class195.method1179(1736, var3, class356.field4558, var5);
                }
            }
        } else if (class549.field7640 == arg0) {
            int var10 = class298.field3671.method3501(-9268);
            int var11 = class605.field8511 + (var10 >> 4 & 0x7);
            int var12 = (var10 & 0x7) + class517.field7053;
            int var13 = class298.field3671.method3470(13111);
            if (var13 == 65535) {
                var13 = -1;
            }
            int var14 = class298.field3671.method3501(-9268);
            int var15 = var14 >> 4 & 0xF;
            int var16 = var14 & 0x7;
            int var17 = class298.field3671.method3501(-9268);
            int var18 = class298.field3671.method3501(-9268);
            if (var11 >= 0 && var12 >= 0 && class431.field5395 > var11 && var12 < class452.field5802) {
                int var19 = var15 + 1;
                if (var11 - var19 <= class376.field4748.field9758[0] && class376.field4748.field9758[0] <= var11 + var19 && class376.field4748.field9754[0] >= (var12 - var19) && class376.field4748.field9754[0] <= var12 + var19) {
                    class277.method1575(var13, -1, false, var18, var16, var17, (var12 << 8) + (class356.field4558 << 24) + (var11 << 16) + var15);
                }
            }
        } else if (class494.field6537 == arg0) {
            class298.field3671.method3501(-9268);
            int var20 = class298.field3671.method3501(-9268);
            int var21 = class605.field8511 + ((var20 & 0x75) >> 4);
            int var22 = (var20 & 0x7) + class517.field7053;
            int var23 = class298.field3671.method3470(13111);
            int var24 = class298.field3671.method3501(-9268);
            int var25 = class298.field3671.method3517(-1);
            String var26 = class298.field3671.method3500((byte) 122);
            class334.method1890(4, var22, var24, var23, class356.field4558, var25, var26, var21);
        } else if (class199.field2529 == arg0) {
            int var27 = class298.field3671.method3501(-9268);
            int var28 = class605.field8511 * 2 + (var27 >> 4 & 0xF);
            int var29 = (var27 & 0xF) + class517.field7053 * 2;
            int var30 = class298.field3671.method3501(-9268);
            boolean var31 = (var30 & 0x1) != 0;
            int var32 = var30 >> 1;
            int var33 = var28 + class298.field3671.method3480(-20933);
            int var34 = var29 + class298.field3671.method3480(-20933);
            int var35 = class298.field3671.method3510(57);
            int var36 = class298.field3671.method3510(19);
            int var37 = class298.field3671.method3470(13111);
            byte var38 = class298.field3671.method3480(-20933);
            int var39 = class298.field3671.method3501(-9268) * 4;
            int var40 = class298.field3671.method3470(13111);
            int var41 = class298.field3671.method3470(13111);
            int var42 = class298.field3671.method3501(-9268);
            int var43 = class298.field3671.method3470(13111);
            if (var42 == 255) {
                var42 = -1;
            }
            if (var28 >= 0 && var29 >= 0 && class431.field5395 * 2 > var28 && var29 < class431.field5395 * 2 && var33 >= 0 && var34 >= 0 && (class452.field5802 * 2) > var33 && var34 < (class452.field5802 * 2) && var37 != 65535) {
                int var44 = var38 << 2;
                int var45 = var34 * 256;
                int var46 = var39 << 2;
                int var47 = var29 * 256;
                int var48 = var28 * 256;
                int var49 = var33 * 256;
                int var50 = var43 << 2;
                if (var35 != 0) {
                    class687 var51 = null;
                    if (var35 < 0) {
                        int var52 = -var35 - 1;
                        if (class167.field2200 == var52) {
                            var51 = class376.field4748;
                        } else {
                            var51 = class351.field4490[var52];
                        }
                    } else {
                        int var53 = var35 - 1;
                        class206 var54 = (class206) class180.field2318.method399(-32748, (long) var53);
                        if (var54 != null) {
                            var51 = var54.field2618;
                        }
                    }
                    if (var51 != null) {
                        class601 var55 = var51.method3872(32195);
                        if (var55.field8443 != null && var55.field8443[var32] != null) {
                            int var56 = var55.field8443[var32][0];
                            int var57 = var55.field8443[var32][2];
                            int var58 = var51.field9672.method2911((byte) 67);
                            int var59 = class453.field5810[var58];
                            int var60 = class453.field5811[var58];
                            int var61 = var56 * var60 + var57 * var59 >> 14;
                            int var62 = var57 * var60 - (var56 * var59) >> 14;
                            var48 += var61;
                            var47 += var62;
                            var44 -= var55.field8443[var32][1];
                        }
                    }
                }
                class509 var64 = new class509(var37, class356.field4558, class356.field4558, var48, var47, var44, class133.field1735 + var40, var41 - -class133.field1735, var42, var50, var36, var46, var31);
                var64.method2749(var45, var49, 0, var40 + class133.field1735, -var46 + class467.method2469(var49, class356.field4558, -20214, var45));
                class201.field2540.method239(new class637(var64), (byte) 93);
            }
        } else if (class104.field1393 == arg0) {
            int var65 = class298.field3671.method3501(-9268);
            int var66 = ((var65 & 0xF9) >> 4) + class605.field8511 * 2;
            int var67 = (var65 & 0xF) + class517.field7053 * 2;
            boolean var68 = class298.field3671.method3501(-9268) != 0;
            int var69 = var66 + class298.field3671.method3480(-20933);
            int var70 = var67 + class298.field3671.method3480(-20933);
            int var71 = class298.field3671.method3510(44);
            int var72 = class298.field3671.method3470(13111);
            int var73 = class298.field3671.method3501(-9268) * 4;
            int var74 = class298.field3671.method3501(-9268) * 4;
            int var75 = class298.field3671.method3470(13111);
            int var76 = class298.field3671.method3470(13111);
            int var77 = class298.field3671.method3501(-9268);
            int var78 = class298.field3671.method3470(13111);
            if (var77 == 255) {
                var77 = -1;
            }
            if (var66 >= 0 && var67 >= 0 && (class431.field5395 * 2) > var66 && var67 < class431.field5395 * 2 && var69 >= 0 && var70 >= 0 && (class452.field5802 * 2) > var69 && class452.field5802 * 2 > var70 && var72 != 65535) {
                int var79 = var74 << 2;
                int var80 = var73 << 2;
                int var81 = var66 * 256;
                int var82 = var78 << 2;
                int var83 = var67 * 256;
                int var84 = var69 * 256;
                int var85 = var70 * 256;
                class509 var86 = new class509(var72, class356.field4558, class356.field4558, var81, var83, var80, var75 + class133.field1735, class133.field1735 + var76, var77, var82, var71, var79, var68);
                var86.method2749(var85, var84, 0, class133.field1735 + var75, class467.method2469(var84, class356.field4558, -20214, var85) - var79);
                class201.field2540.method239(new class637(var86), (byte) 93);
            }
        } else if (class325.field4176 == arg0) {
            int var87 = class298.field3671.method3498(255);
            int var88 = var87 >> 2;
            int var89 = var87 & 0x3;
            int var90 = class147.field1889[var88];
            int var91 = class298.field3671.method3501(-9268);
            int var92 = ((var91 & 0x76) >> 4) + class605.field8511;
            int var93 = (var91 & 0x7) + class517.field7053;
            int var94 = class298.field3671.method3470(13111);
            if (var94 == 65535) {
                var94 = -1;
            }
            class313.method1817(-1, var88, var94, var90, class356.field4558, var93, var89, var92);
        } else if (class386.field4848 == arg0) {
            int var95 = class298.field3671.method3501(-9268);
            int var96 = (var95 >> 4 & 0x7) + class605.field8511;
            int var97 = (var95 & 0x7) + class517.field7053;
            int var98 = class298.field3671.method3470(13111);
            if (var98 == 65535) {
                var98 = -1;
            }
            int var99 = class298.field3671.method3501(-9268);
            int var100 = (var99 & 0xFE) >> 4;
            int var101 = var99 & 0x7;
            int var102 = class298.field3671.method3501(-9268);
            int var103 = class298.field3671.method3501(-9268);
            if (var96 >= 0 && var97 >= 0 && class431.field5395 > var96 && class452.field5802 > var97) {
                int var104 = var100 + 1;
                if (class376.field4748.field9758[0] >= var96 - var104 && class376.field4748.field9758[0] <= (var96 + var104) && class376.field4748.field9754[0] >= var97 - var104 && (var97 + var104) >= class376.field4748.field9754[0]) {
                    class699.method3927(var102, var98, (class356.field4558 << 24) + (var97 << 8) + (var96 << 16) + var100, var101, var103, true);
                }
            }
        } else if (class97.field1320 == arg0) {
            int var105 = class298.field3671.method3501(-9268);
            int var106 = (var105 & 0x7) + class517.field7053;
            int var107 = class630.field8817 + var106;
            int var108 = class605.field8511 + (var105 >> 4 & 0x7);
            int var109 = var108 + class145.field1879;
            int var110 = class298.field3671.method3470(13111);
            int var111 = class298.field3671.method3470(13111);
            int var112 = class298.field3671.method3470(13111);
            if (class533.field7185 != null) {
                class650 var113 = (class650) class533.field7185.method399(-32748, (long) (var107 << 14 | class356.field4558 << 28 | var109));
                if (var113 != null) {
                    for (class288 var114 = (class288) var113.field9177.method237(121); var114 != null; var114 = (class288) var113.field9177.method245((byte) 72)) {
                        if ((var110 & 0x7FFF) == var114.field3586 && var114.field3585 == var111) {
                            var114.method1871(-20);
                            var114.field3585 = var112;
                            class410.method2175(var114, class356.field4558, var107, -16777216, var109);
                            break;
                        }
                    }
                    if (var108 >= 0 && var106 >= 0 && class431.field5395 > var108 && var106 < class452.field5802) {
                        class195.method1179(1736, var106, class356.field4558, var108);
                    }
                }
            }
        } else if (class237.field2966 == arg0) {
            int var115 = class298.field3671.method3470(13111);
            int var116 = class298.field3671.method3501(-9268);
            int var117 = (var116 & 0x7) + class517.field7053;
            int var118 = class630.field8817 + var117;
            int var119 = ((var116 & 0x7D) >> 4) + class605.field8511;
            int var120 = class145.field1879 + var119;
            class650 var121 = (class650) class533.field7185.method399(-32748, (long) (class356.field4558 << 28 | var118 << 14 | var120));
            if (var121 != null) {
                for (class288 var122 = (class288) var121.field9177.method237(119); var122 != null; var122 = (class288) var121.field9177.method245((byte) 67)) {
                    if ((var115 & 0x7FFF) == var122.field3586) {
                        var122.method1871(-30);
                        break;
                    }
                }
                if (var121.field9177.method246(true)) {
                    var121.method1871(-84);
                }
                if (var119 >= 0 && var117 >= 0 && class431.field5395 > var119 && var117 < class452.field5802) {
                    class195.method1179(1736, var117, class356.field4558, var119);
                }
            }
        } else if (class665.field9378 == arg0) {
            int var123 = class298.field3671.method3470(13111);
            int var124 = class298.field3671.method3501(-9268);
            class428.field5352.method3138((byte) 47, var123).method2364(-49, var124);
        } else if (arg1 > 12) {
            if (class89.field1249 == arg0) {
                int var125 = class298.field3671.method3498(255);
                int var126 = var125 >> 2;
                int var127 = var125 & 0x3;
                int var128 = class147.field1889[var126];
                int var129 = class298.field3671.method3498(255);
                int var130 = ((var129 & 0x79) >> 4) + class605.field8511;
                int var131 = class517.field7053 + (var129 & 0x7);
                if (class587.method3235(class360.field4584, (byte) -108) || var130 >= 0 && var131 >= 0 && var130 < class431.field5395 && class452.field5802 > var131) {
                    class423.method2246(-1, 0, class356.field4558, var127, var126, -1, -1, var131, var130, var128);
                }
            } else if (class646.field9088 == arg0) {
                int var132 = class298.field3671.method3501(-9268);
                int var133 = (var132 >> 4 & 0x7) + class605.field8511;
                int var134 = class517.field7053 + (var132 & 0x7);
                int var135 = class298.field3671.method3470(13111);
                int var136 = class298.field3671.method3501(-9268);
                int var137 = class298.field3671.method3470(13111);
                int var138 = class298.field3671.method3501(-9268);
                if (var133 >= 0 && var134 >= 0 && class431.field5395 > var133 && var134 < class452.field5802) {
                    int var139 = var133 * 512 + 256;
                    int var140 = var134 * 512 + 256;
                    int var141 = class356.field4558;
                    if (var141 < 3 && class3.method22(var134, var133, 5706)) {
                        var141++;
                    }
                    class622 var142 = new class622(var135, var137, class133.field1735, class356.field4558, var141, var139, class467.method2469(var139, class356.field4558, -20214, var140) - var136, var140, var133, var133, var134, var134, var138);
                    class310.field3952.method239(new class122(var142), (byte) 93);
                }
            } else if (class511.field6943 == arg0) {
                int var143 = class298.field3671.method3467((byte) -80);
                int var144 = class298.field3671.method3514((byte) -18);
                int var145 = (var144 & 0x7) + class517.field7053;
                int var146 = class630.field8817 + var145;
                int var147 = (var144 >> 4 & 0x7) + class605.field8511;
                int var148 = class145.field1879 + var147;
                int var149 = class298.field3671.method3467((byte) -80);
                int var150 = class298.field3671.method3519((byte) 120);
                if (class167.field2200 != var150) {
                    boolean var151 = var147 >= 0 && var145 >= 0 && var147 < class431.field5395 && var145 < class452.field5802;
                    if (var151 || class587.method3235(class360.field4584, (byte) -86)) {
                        class410.method2175(new class288(var143, var149), class356.field4558, var146, -16777216, var148);
                        if (var151) {
                            class195.method1179(1736, var145, class356.field4558, var147);
                        }
                    }
                }
            } else if (class400.field5009 == arg0) {
                int var152 = class298.field3671.method3501(-9268);
                boolean var153 = (var152 & 0x80) != 0;
                int var154 = (var152 >> 3 & 0x7) + class605.field8511;
                int var155 = (var152 & 0x7) + class517.field7053;
                int var156 = var154 + class298.field3671.method3480(-20933);
                int var157 = var155 + class298.field3671.method3480(-20933);
                int var158 = class298.field3671.method3510(116);
                int var159 = class298.field3671.method3470(13111);
                int var160 = class298.field3671.method3501(-9268) * 4;
                int var161 = class298.field3671.method3501(-9268) * 4;
                int var162 = class298.field3671.method3470(13111);
                int var163 = class298.field3671.method3470(13111);
                int var164 = class298.field3671.method3501(-9268);
                if (var164 == 255) {
                    var164 = -1;
                }
                int var165 = class298.field3671.method3470(13111);
                if (var154 >= 0 && var155 >= 0 && class431.field5395 > var154 && var155 < class452.field5802 && var156 >= 0 && var157 >= 0 && var156 < class431.field5395 && var157 < class452.field5802 && var159 != 65535) {
                    int var166 = var154 * 512 + 256;
                    int var167 = var165 << 2;
                    int var168 = var155 * 512 + 256;
                    int var169 = var156 * 512 + 256;
                    int var170 = var161 << 2;
                    int var171 = var160 << 2;
                    int var172 = var157 * 512 + 256;
                    class509 var173 = new class509(var159, class356.field4558, class356.field4558, var166, var168, var171, class133.field1735 + var162, class133.field1735 + var163, var164, var167, var158, var170, var153);
                    var173.method2749(var172, var169, 0, class133.field1735 + var162, -var170 + class467.method2469(var169, class356.field4558, -20214, var172));
                    class201.field2540.method239(new class637(var173), (byte) 93);
                }
            } else if (class689.field9767 == arg0) {
                int var174 = class298.field3671.method3499(-90);
                int var175 = var174 >> 2;
                int var176 = var174 & 0x3;
                int var177 = class147.field1889[var175];
                int var178 = class298.field3671.method3501(-9268);
                int var179 = ((var178 & 0x76) >> 4) + class605.field8511;
                int var180 = (var178 & 0x7) + class517.field7053;
                int var181 = class298.field3671.method3470(13111);
                if (class587.method3235(class360.field4584, (byte) -122) || var179 >= 0 && var180 >= 0 && var179 < class431.field5395 && var180 < class452.field5802) {
                    class423.method2246(-1, 0, class356.field4558, var176, var175, -1, var181, var180, var179, var177);
                }
            } else {
                class106.method597("T3 - " + arg0, -2, null);
                class413.method2189((byte) -101, false);
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IZLjava/lang/String;II)V")
    public static final void method353(int arg0, boolean arg1, String arg2, int arg3, int arg4) {
        field792++;
        class433.method2279(arg3, 339, null, arg1, arg0, false, arg2);
        if (arg4 != 1986811992) {
            method350((byte) 37);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V")
    public static final void method354(int arg0) {
        field791++;
        if (class697.field9866 == -1 || class465.field5928 == -1) {
            return;
        }
        int var1 = class693.field9827 + ((class310.field3964 - class693.field9827) * class284.field3531 >> 16);
        class284.field3531 += var1;
        if (class284.field3531 >= 65535) {
            if (class619.field8653) {
                class436.field5442 = false;
            } else {
                class436.field5442 = true;
            }
            class284.field3531 = 65535;
            class619.field8653 = true;
        } else {
            class619.field8653 = false;
            class436.field5442 = false;
        }
        if (arg0 != -1202242076) {
            method354(79);
        }
        float var2 = (float) class284.field3531 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class335.field4263 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class639.field8992[class697.field9866][var4][var5] * 3;
            int var22 = class639.field8992[class697.field9866][var4 + 1][var5] * 3;
            int var23 = (class639.field8992[class697.field9866][var4 + 2][var5] + class639.field8992[class697.field9866][var4 + 2][var5] - class639.field8992[class697.field9866][var4 + 3][var5]) * 3;
            int var24 = class639.field8992[class697.field9866][var4][var5];
            int var25 = var22 - var21;
            int var26 = var21 - (var22 * 2 - var23);
            int var27 = var22 + class639.field8992[class697.field9866][var4 + 2][var5] - var23 - var24;
            var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
        }
        class571.field7982 = (int) var3[1] * -1;
        class20.field292 = (int) var3[0] - (class145.field1879 * 512);
        class276.field3464 = (int) var3[2] - (class630.field8817 * 512);
        float[] var6 = new float[3];
        int var7 = class285.field3542 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class639.field8992[class465.field5928][var7][var8] * 3;
            int var15 = class639.field8992[class465.field5928][var7 + 1][var8] * 3;
            int var16 = (class639.field8992[class465.field5928][var7 + 2][var8] - (class639.field8992[class465.field5928][var7 + 3][var8] - class639.field8992[class465.field5928][var7 + 2][var8])) * 3;
            int var17 = class639.field8992[class465.field5928][var7][var8];
            int var18 = var15 - var14;
            int var19 = var14 + var16 - var15 * 2;
            int var20 = class639.field8992[class465.field5928][var7 + 2][var8] + var15 - var16 - var17;
            var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
        }
        float var9 = var6[0] - var3[0];
        float var10 = (var6[1] - var3[1]) * -1.0F;
        float var11 = var6[2] - var3[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class215.field2673 = (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D) & 0x3FFF;
        class693.field9826 = (int) (-Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
        class654.field9226 = ((class639.field8992[class697.field9866][var4 + 2][3] - class639.field8992[class697.field9866][var4][3]) * class284.field3531 >> 16) + class639.field8992[class697.field9866][var4][3];
    }
}
