import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class143 extends class728 {

    @OriginalMember(owner = "client!ud", name = "C", descriptor = "Ljava/lang/Object;")
    private Object field1859;

    @OriginalMember(owner = "client!ud", name = "E", descriptor = "Lkka;")
    public static class542 field1861 = new class542();

    @OriginalMember(owner = "client!ud", name = "y", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!ud", name = "z", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!ud", name = "A", descriptor = "I")
    public static int field1857;

    @OriginalMember(owner = "client!ud", name = "B", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!ud", name = "D", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!ud", name = "F", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!ud", name = "G", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!ud", name = "H", descriptor = "Lcl;")
    public static class778 field1864;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIB)Z")
    public static final boolean method822(int arg0, int arg1, byte arg2) {
        field1862++;
        if (arg2 >= -48) {
            method826(-96);
        }
        return (arg1 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIIII)V")
    public static final void method823(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1857++;
        int var7 = class20.field189;
        class430.field5651 = 0;
        int[] var8 = class503.field6451;
        int var9 = 0;
        if (arg1 != 6566) {
            return;
        }
        while (var9 < (class349.field4271 + var7)) {
            label714: {
                class240 var37 = null;
                class381 var38;
                if (var7 > var9) {
                    var38 = class263.field3508[var8[var9]];
                } else {
                    var38 = ((class232) class444.field5811.method2616((long) class88.field1224[var9 - var7], (byte) 73)).field3125;
                    var37 = ((class727) var38).field9545;
                    if (var37.field3289 != null) {
                        var37 = var37.method1585((byte) -100, class381.field4705);
                        if (var37 == null) {
                            break label714;
                        }
                    }
                }
                if (var38.field4683 >= 0 && (class495.field6333 == var38.field4691 || class422.field5564.field2895 == var38.field2895)) {
                    class133.method776(arg5 >> 1, var38.method2173(-106), arg0, arg1 ^ 0x5B77, var38, arg3 >> 1, arg2);
                    if (class128.field1716[0] >= 0) {
                        if (var38.field4709 != null && (var9 >= var7 || class571.field7226 == 0 || class571.field7226 == 3 || class571.field7226 == 1 && class345.method1999(125, ((class33) var38).field375)) && class430.field5651 < class92.field1271) {
                            class92.field1277[class430.field5651] = class66.field868.method1049(-115, var38.field4709) / 2;
                            class92.field1273[class430.field5651] = class128.field1716[0];
                            class92.field1274[class430.field5651] = class128.field1716[1];
                            class92.field1276[class430.field5651] = var38.field4730;
                            class92.field1279[class430.field5651] = var38.field4710;
                            class92.field1280[class430.field5651] = var38.field4664;
                            class92.field1272[class430.field5651] = var38.field4709;
                            class430.field5651++;
                        }
                        int var39 = arg6 + class128.field1716[1];
                        int var50;
                        if (var38.field4688 || var38.field4676 <= class693.field8900) {
                            var50 = var39 - Math.max(class66.field868.field2212, class634.field8064[0].method612());
                        } else {
                            boolean var40 = true;
                            byte var41 = 1;
                            int var43;
                            if (var9 < var7) {
                                class33 var42 = class263.field3508[var8[var9]];
                                var43 = var38.method2169(0).field917;
                                if (var42.field342) {
                                    var41 = 2;
                                }
                            } else {
                                var43 = var37.field3303;
                                if (var43 == -1) {
                                    var43 = var38.method2169(arg1 ^ 0x19A6).field917;
                                }
                            }
                            class772[] var44 = class634.field8064;
                            if (var43 != -1) {
                                class772[] var45 = (class772[]) class83.field1191.method2931((long) var43, (byte) -81);
                                if (var45 == null) {
                                    class388[] var46 = class388.method2226(class172.field2270, var43, 0);
                                    if (var46 != null) {
                                        var45 = new class772[var46.length];
                                        for (int var47 = 0; var47 < var46.length; var47++) {
                                            var45[var47] = class576.field7320.method977(var46[var47], true);
                                        }
                                        class83.field1191.method2918((long) var43, var45, 97);
                                    }
                                }
                                if (var45 != null && var45.length >= 2) {
                                    var44 = var45;
                                }
                            }
                            if (var41 >= var44.length) {
                                var41 = 1;
                            }
                            class772 var48 = var44[0];
                            class772 var49 = var44[var41];
                            var50 = var39 - Math.max(class66.field868.field2212, var48.method612());
                            int var51 = class128.field1716[0] + arg4 - (var48.method620() >> 1);
                            int var52 = var48.method620() * var38.field4677 / 255;
                            int var53 = var48.method612();
                            if (var38.field4677 > 0 && var52 < 2) {
                                var52 = 2;
                            }
                            var48.method4203(var51, var50);
                            class576.field7320.method928(var51, var50, var51 + var52, var50 + var53);
                            var49.method4203(var51, var50);
                            class576.field7320.method915(arg4, arg6, arg3 + arg4, arg5 + arg6);
                            class548.method2967(var51, var50 + var53, var50, (byte) -118, var48.method623() + var51);
                        }
                        var50 -= 2;
                        if (!var38.field4688) {
                            if (var38.field4702 > class693.field8900) {
                                class772 var54 = class544.field6816[var38.field4689 ? 2 : 0];
                                class772 var55 = class544.field6816[var38.field4689 ? 3 : 1];
                                boolean var56 = true;
                                int var57;
                                if (var38 instanceof class727) {
                                    var57 = var37.field3278;
                                    if (var57 == -1) {
                                        var57 = var38.method2169(0).field919;
                                    }
                                } else {
                                    var57 = var38.method2169(0).field919;
                                }
                                if (var57 != -1) {
                                    class772[] var58 = (class772[]) class57.field758.method2931((long) var57, (byte) -95);
                                    if (var58 == null) {
                                        class388[] var59 = class388.method2226(class172.field2270, var57, 0);
                                        if (var59 != null) {
                                            var58 = new class772[var59.length];
                                            for (int var60 = 0; var60 < var59.length; var60++) {
                                                var58[var60] = class576.field7320.method977(var59[var60], true);
                                            }
                                            class57.field758.method2918((long) var57, var58, 120);
                                        }
                                    }
                                    if (var58 != null && var58.length == 4) {
                                        var54 = var58[var38.field4689 ? 2 : 0];
                                        var55 = var58[var38.field4689 ? 3 : 1];
                                    }
                                }
                                int var61 = var38.field4702 - class693.field8900;
                                int var62;
                                if (var38.field4708 >= var61) {
                                    var62 = var54.method620();
                                } else {
                                    int var63 = var61 - var38.field4708;
                                    int var64 = var38.field4751 == 0 ? 0 : (var38.field4703 - var63) / var38.field4751 * var38.field4751;
                                    var62 = var54.method620() * var64 / var38.field4703;
                                }
                                int var65 = var54.method612();
                                var50 -= var65;
                                int var66 = class128.field1716[0] + arg4 - (var54.method620() >> 1);
                                var54.method4203(var66, var50);
                                class576.field7320.method928(var66, var50, var62 + var66, var50 + var65);
                                var55.method4203(var66, var50);
                                class576.field7320.method915(arg4, arg6, arg4 + arg3, arg5 + arg6);
                                class548.method2967(var66, var50 + var65, var50, (byte) -120, var54.method623() + var66);
                                var50 -= 2;
                            }
                            if (var9 < var7) {
                                class33 var67 = (class33) var38;
                                if (var67.field376 != -1) {
                                    var50 -= 25;
                                    class772 var68 = class394.field5191[var67.field376];
                                    var68.method4203(arg4 + class128.field1716[0] - 12, var50);
                                    class548.method2967(class128.field1716[0] + arg4 - 12, var68.method628() + var50, var50, (byte) -97, arg4 - (-class128.field1716[0] - var68.method623()) - 12);
                                    var50 -= 2;
                                }
                                if (var67.field354 != -1) {
                                    var50 -= 25;
                                    class772 var69 = class362.field4402[var67.field354];
                                    var69.method4203(arg4 + class128.field1716[0] - 12, var50);
                                    class548.method2967(class128.field1716[0] + arg4 - 12, var69.method628() + var50, var50, (byte) -86, class128.field1716[0] + arg4 + var69.method623() - 12);
                                    var50 -= 2;
                                }
                            } else if (var37.field3326 >= 0 && class362.field4402.length > var37.field3326) {
                                var50 -= 25;
                                class772 var70 = class362.field4402[var37.field3326];
                                var70.method4203(class128.field1716[0] + arg4 - (var70.method620() >> 1), var50);
                                class548.method2967(arg4 + class128.field1716[0] - (var70.method620() >> 1), var50 + var70.method628(), var50, (byte) -126, arg4 - (-class128.field1716[0] - (-(var70.method620() >> 1) + var70.method623())));
                                var50 -= 2;
                            }
                        }
                        int var10000;
                        if (!var38 instanceof class33) {
                            int var77 = 0;
                            class28[] var78 = class589.field7475;
                            for (int var79 = 0; var79 < var78.length; var79++) {
                                class28 var179 = var78[var79];
                                if (var179 != null && var179.field250 == 1 && class88.field1224[var9 - var7] == var179.field251) {
                                    class772 var180 = class689.field8854[var179.field244];
                                    if (var180.method612() > var77) {
                                        var77 = var180.method612();
                                    }
                                    if (class693.field8900 % 20 < 10) {
                                        var180.method4203(class128.field1716[0] + arg4 - 12, -var180.method612() + var50);
                                        class548.method2967(class128.field1716[0] + arg4 - 12, -var180.method612() + (var50 - -var180.method628()), var50 - var180.method612(), (byte) -86, class128.field1716[0] + arg4 + var180.method623() - 12);
                                    }
                                }
                            }
                            if (var77 > 0) {
                                var10000 = var50 - (var77 + 2);
                            }
                        } else if (var9 >= 0) {
                            int var71 = 0;
                            class28[] var72 = class589.field7475;
                            for (int var73 = 0; var73 < var72.length; var73++) {
                                class28 var75 = var72[var73];
                                if (var75 != null && var75.field250 == 10 && var8[var9] == var75.field251) {
                                    class772 var76 = class689.field8854[var75.field244];
                                    if (var71 < var76.method612()) {
                                        var71 = var76.method612();
                                    }
                                    var76.method4203(class128.field1716[0] + arg4 - 12, -var76.method612() + var50);
                                    class548.method2967(class128.field1716[0] + arg4 - 12, var50 + -var76.method612() + var76.method628(), var50 - var76.method612(), (byte) -92, class128.field1716[0] + arg4 + (-12 - -var76.method623()));
                                }
                            }
                            if (var71 > 0) {
                                var10000 = var50 - (var71 + 2);
                            }
                        }
                        for (int var81 = 0; var81 < class181.field2476; var81++) {
                            int var82 = var38.field4678[var81];
                            int var83 = var38.field4701[var81];
                            class678 var84 = null;
                            int var85 = 0;
                            if (var83 >= 0) {
                                if (var82 <= class693.field8900) {
                                    continue;
                                }
                                var84 = class111.field1482.method1986(2, var38.field4701[var81]);
                                var85 = var84.field8753;
                            } else if (var82 < 0) {
                                continue;
                            }
                            int var86 = var38.field4726[var81];
                            class678 var87 = null;
                            if (var86 >= 0) {
                                var87 = class111.field1482.method1986(2, var86);
                            }
                            if (class693.field8900 >= var82 - var85) {
                                int var88 = var38.field4666[var81];
                                if (var88 >= 0) {
                                    var38.field4676 = class693.field8900 + 300;
                                    var38.field4677 = var88;
                                    var38.field4666[var81] = -1;
                                }
                                if (var84 == null) {
                                    var38.field4678[var81] = -1;
                                } else {
                                    int var89 = var38.method2173(arg1 - 6686) / 2;
                                    class133.method776(arg5 >> 1, var89, arg0, 17105, var38, arg3 >> 1, arg2);
                                    if (class128.field1716[0] > -1) {
                                        class128.field1716[0] += class468.field6087[var81];
                                        class128.field1716[1] += class614.field7751[var81];
                                        Object var90 = null;
                                        Object var91 = null;
                                        Object var92 = null;
                                        Object var93 = null;
                                        int var94 = 0;
                                        int var95 = 0;
                                        int var96 = 0;
                                        int var97 = 0;
                                        int var98 = 0;
                                        int var99 = 0;
                                        int var100 = 0;
                                        int var101 = 0;
                                        class772 var102 = null;
                                        class772 var103 = null;
                                        class772 var104 = null;
                                        class772 var105 = null;
                                        int var106 = 0;
                                        int var107 = 0;
                                        int var108 = 0;
                                        int var109 = 0;
                                        int var110 = 0;
                                        int var111 = 0;
                                        int var112 = 0;
                                        int var113 = 0;
                                        int var114 = 0;
                                        class772 var115 = var84.method3650(class576.field7320, (byte) 107);
                                        if (var115 != null) {
                                            var94 = var115.method620();
                                            int var116 = var115.method612();
                                            var115.method615(class573.field7254);
                                            if (var114 < var116) {
                                                var114 = var116;
                                            }
                                            var98 = class573.field7254[0];
                                        }
                                        class772 var117 = var84.method3648(class576.field7320, 0);
                                        if (var117 != null) {
                                            var95 = var117.method620();
                                            int var118 = var117.method612();
                                            var117.method615(class573.field7254);
                                            if (var118 > var114) {
                                                var114 = var118;
                                            }
                                            var99 = class573.field7254[0];
                                        }
                                        class772 var119 = var84.method3643(class576.field7320, (byte) 96);
                                        if (var119 != null) {
                                            var96 = var119.method620();
                                            int var120 = var119.method612();
                                            if (var114 < var120) {
                                                var114 = var120;
                                            }
                                            var119.method615(class573.field7254);
                                            var100 = class573.field7254[0];
                                        }
                                        class772 var121 = var84.method3649(class576.field7320, arg1 ^ 0xFFFFE659);
                                        if (var121 != null) {
                                            var97 = var121.method620();
                                            int var122 = var121.method612();
                                            var121.method615(class573.field7254);
                                            if (var114 < var122) {
                                                var114 = var122;
                                            }
                                            var101 = class573.field7254[0];
                                        }
                                        if (var87 != null) {
                                            var102 = var87.method3650(class576.field7320, (byte) 112);
                                            if (var102 != null) {
                                                var106 = var102.method620();
                                                int var123 = var102.method612();
                                                var102.method615(class573.field7254);
                                                if (var114 < var123) {
                                                    var114 = var123;
                                                }
                                                var110 = class573.field7254[0];
                                            }
                                            var103 = var87.method3648(class576.field7320, arg1 ^ 0x19A6);
                                            if (var103 != null) {
                                                var107 = var103.method620();
                                                int var124 = var103.method612();
                                                var103.method615(class573.field7254);
                                                if (var124 > var114) {
                                                    var114 = var124;
                                                }
                                                var111 = class573.field7254[0];
                                            }
                                            var104 = var87.method3643(class576.field7320, (byte) 96);
                                            if (var104 != null) {
                                                var108 = var104.method620();
                                                int var125 = var104.method612();
                                                var104.method615(class573.field7254);
                                                if (var114 < var125) {
                                                    var114 = var125;
                                                }
                                                var112 = class573.field7254[0];
                                            }
                                            var105 = var87.method3649(class576.field7320, -1);
                                            if (var105 != null) {
                                                var109 = var105.method620();
                                                int var126 = var105.method612();
                                                if (var126 > var114) {
                                                    var114 = var126;
                                                }
                                                var105.method615(class573.field7254);
                                                var113 = class573.field7254[0];
                                            }
                                        }
                                        class420 var127 = class399.field5278;
                                        class420 var128 = class399.field5278;
                                        class166 var129 = class364.field4453;
                                        int var130 = var84.field8755;
                                        class166 var131 = class364.field4453;
                                        if (var130 >= 0) {
                                            class420 var132 = class574.method3092(var130, true, class576.field7320, arg1 - 6694);
                                            class166 var133 = class628.method3362(var130, -93, class576.field7320);
                                            if (var132 != null && var133 != null) {
                                                var129 = var133;
                                                var127 = var132;
                                            }
                                        }
                                        if (var87 != null) {
                                            int var134 = var87.field8755;
                                            if (var134 >= 0) {
                                                class420 var135 = class574.method3092(var134, true, class576.field7320, -119);
                                                class166 var136 = class628.method3362(var134, -82, class576.field7320);
                                                if (var135 != null && var136 != null) {
                                                    var128 = var135;
                                                    var131 = var136;
                                                }
                                            }
                                        }
                                        Object var137 = null;
                                        String var138 = null;
                                        boolean var139 = false;
                                        int var140 = 0;
                                        String var141 = var84.method3647((byte) -108, var38.field4746[var81]);
                                        int var142 = var129.method1049(-42, var141);
                                        if (var87 != null) {
                                            var138 = var87.method3647((byte) -116, var38.field4743[var81]);
                                            var140 = var131.method1049(-33, var138);
                                        }
                                        int var143 = 0;
                                        int var144 = 0;
                                        if (var95 > 0) {
                                            var143 = var142 / var95 + 1;
                                        }
                                        if (var87 != null && var107 > 0) {
                                            var144 = var140 / var107 + 1;
                                        }
                                        int var145 = 0;
                                        int var146 = var145;
                                        if (var94 > 0) {
                                            var145 += var94;
                                        }
                                        var145 += 2;
                                        int var147 = var145;
                                        if (var96 > 0) {
                                            var145 += var96;
                                        }
                                        int var148 = var145;
                                        int var149 = var145;
                                        int var150;
                                        if (var95 <= 0) {
                                            var150 = var142 + var145;
                                        } else {
                                            int var151 = var95 * var143;
                                            var149 = (var151 - var142) / 2 + var145;
                                            var150 = var145 + var151;
                                        }
                                        int var152 = var150;
                                        if (var97 > 0) {
                                            var150 += var97;
                                        }
                                        int var153 = 0;
                                        int var154 = 0;
                                        int var155 = 0;
                                        int var156 = 0;
                                        int var157 = 0;
                                        if (var87 != null) {
                                            var150 += 2;
                                            var153 = var150;
                                            if (var106 > 0) {
                                                var150 += var106;
                                            }
                                            var150 += 2;
                                            var154 = var150;
                                            if (var108 > 0) {
                                                var150 += var108;
                                            }
                                            var157 = var150;
                                            var155 = var150;
                                            if (var107 > 0) {
                                                int var158 = var107 * var144;
                                                var157 = (var158 - var140) / 2 + var150;
                                                var150 += var158;
                                            } else {
                                                var150 += var140;
                                            }
                                            var156 = var150;
                                            if (var109 > 0) {
                                                var150 += var109;
                                            }
                                        }
                                        int var159 = var38.field4678[var81] - class693.field8900;
                                        int var160 = var84.field8769 - var84.field8769 * var159 / var84.field8753;
                                        int var161 = var84.field8776 * var159 / var84.field8753 - var84.field8776;
                                        int var162 = class128.field1716[0] + arg4 + var160 - (var150 >> 1);
                                        int var163 = var161 + arg6 + class128.field1716[1] - 12;
                                        int var164 = var163;
                                        int var165 = var163 + var114;
                                        int var166 = var163 + var84.field8754 + 15;
                                        int var167 = var166 - var129.field2212;
                                        if (var167 < var163) {
                                            var164 = var167;
                                        }
                                        int var168 = var129.field2201 + var166;
                                        if (var168 > var165) {
                                            var165 = var168;
                                        }
                                        int var169 = 0;
                                        if (var87 != null) {
                                            var169 = var87.field8754 + var163 + 15;
                                            int var170 = var169 - var131.field2212;
                                            if (var170 < var164) {
                                                var164 = var170;
                                            }
                                            int var171 = var131.field2201 + var169;
                                            if (var171 > var165) {
                                                var165 = var171;
                                            }
                                        }
                                        int var172 = 255;
                                        if (var84.field8761 >= 0) {
                                            var172 = (var159 << 8) / (var84.field8753 - var84.field8761);
                                        }
                                        if (var172 >= 0 && var172 < 255) {
                                            int var173 = var172 << 24;
                                            int var174 = var173 | 0xFFFFFF;
                                            if (var115 != null) {
                                                var115.method616(var146 + var162 - var98, var163, 0, var174, 1);
                                            }
                                            if (var119 != null) {
                                                var119.method616(var147 + var162 - var100, var163, 0, var174, 1);
                                            }
                                            if (var117 != null) {
                                                for (int var175 = 0; var175 < var143; var175++) {
                                                    var117.method616(var95 * var175 + var162 + var148 - var99, var163, 0, var174, 1);
                                                }
                                            }
                                            if (var121 != null) {
                                                var121.method616(var152 + var162 - var101, var163, 0, var174, 1);
                                            }
                                            var127.method2419(var166, var173 | var84.field8765, var141, -74, var149 + var162, 0);
                                            if (var87 != null) {
                                                if (var102 != null) {
                                                    var102.method616(var153 + var162 - var110, var163, 0, var174, 1);
                                                }
                                                if (var104 != null) {
                                                    var104.method616(var162 + var154 - var112, var163, 0, var174, 1);
                                                }
                                                if (var103 != null) {
                                                    for (int var176 = 0; var176 < var144; var176++) {
                                                        var103.method616(var162 + (var107 * var176) + var155 - var111, var163, 0, var174, 1);
                                                    }
                                                }
                                                if (var105 != null) {
                                                    var105.method616(var156 + var162 - var113, var163, 0, var174, 1);
                                                }
                                                var128.method2419(var169, var87.field8765 | var173, var138, -61, var157 + var162, 0);
                                            }
                                        } else {
                                            if (var115 != null) {
                                                var115.method4203(var146 + var162 - var98, var163);
                                            }
                                            if (var119 != null) {
                                                var119.method4203(var162 + var147 - var100, var163);
                                            }
                                            if (var117 != null) {
                                                for (int var177 = 0; var177 < var143; var177++) {
                                                    var117.method4203(var162 - (var99 - var148 - (var95 * var177)), var163);
                                                }
                                            }
                                            if (var121 != null) {
                                                var121.method4203(var152 + var162 - var101, var163);
                                            }
                                            var127.method2419(var166, var84.field8765 | 0xFF000000, var141, -104, var149 + var162, 0);
                                            if (var87 != null) {
                                                if (var102 != null) {
                                                    var102.method4203(var153 + var162 - var110, var163);
                                                }
                                                if (var104 != null) {
                                                    var104.method4203(var162 - (var112 - var154), var163);
                                                }
                                                if (var103 != null) {
                                                    for (int var178 = 0; var178 < var144; var178++) {
                                                        var103.method4203(var107 * var178 + var155 + var162 - var111, var163);
                                                    }
                                                }
                                                if (var105 != null) {
                                                    var105.method4203(var156 + var162 - var113, var163);
                                                }
                                                var128.method2419(var169, var87.field8765 | 0xFF000000, var138, arg1 ^ 0xFFFFE611, var157 + var162, 0);
                                            }
                                        }
                                        class548.method2967(var162, var165 + 1, var164, (byte) -83, var162 + var150);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            var9++;
        }
        for (int var10 = 0; var10 < class757.field10320; var10++) {
            int var33 = class576.field7317[var10];
            class381 var34;
            if (var33 < 2048) {
                var34 = class263.field3508[var33];
            } else {
                var34 = ((class232) class444.field5811.method2616((long) (var33 - 2048), (byte) 47)).field3125;
            }
            int var35 = class641.field8226[var10];
            class381 var36;
            if (var35 < 2048) {
                var36 = class263.field3508[var35];
            } else {
                var36 = ((class232) class444.field5811.method2616((long) (var35 - 2048), (byte) 124)).field3125;
            }
            class342.method1981(arg3, arg0, --var34.field4733, var36, arg4, var34, arg5, (byte) 121, arg6, arg2);
        }
        int var11 = class66.field868.field2212 + class66.field868.field2201 + 2;
        for (int var12 = 0; var12 < class430.field5651; var12++) {
            int var13 = class92.field1273[var12];
            int var14 = class92.field1274[var12];
            int var15 = class92.field1277[var12];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var32 = 0; var32 < var12; var32++) {
                    if ((class92.field1274[var32] - var11) < (var14 + 2) && var14 - var11 < class92.field1274[var32] + 2 && var13 - var15 < class92.field1277[var32] + class92.field1273[var32] && var13 + var15 > class92.field1273[var32] + -class92.field1277[var32] && var14 > (class92.field1274[var32] - var11)) {
                        var14 = class92.field1274[var32] - var11;
                        var16 = true;
                    }
                }
            }
            class92.field1274[var12] = var14;
            String var17 = class92.field1272[var12];
            int var18 = class66.field868.method1049(63, var17);
            int var19 = arg4 + var13;
            int var20 = arg6 + var14 - class66.field868.field2212;
            int var21 = var18 + var19;
            int var22 = class66.field868.field2201 + var14 + arg6;
            if (class55.field710 == 0) {
                int var23 = 16776960;
                if (class92.field1276[var12] < 6) {
                    var23 = class190.field2648[class92.field1276[var12]];
                }
                if (class92.field1276[var12] == 6) {
                    var23 = (class495.field6333 % 20) >= 10 ? 16776960 : 16711680;
                }
                if (class92.field1276[var12] == 7) {
                    var23 = (class495.field6333 % 20) < 10 ? 255 : 65535;
                }
                if (class92.field1276[var12] == 8) {
                    var23 = class495.field6333 % 20 >= 10 ? 8454016 : 45056;
                }
                if (class92.field1276[var12] == 9) {
                    int var24 = 150 - class92.field1280[var12];
                    if (var24 < 50) {
                        var23 = var24 * 1280 + 16711680;
                    } else if (var24 < 100) {
                        var23 = 16776960 - ((var24 - 50) * 327680);
                    } else if (var24 < 150) {
                        var23 = var24 * 5 + 64780;
                    }
                }
                if (class92.field1276[var12] == 10) {
                    int var25 = 150 - class92.field1280[var12];
                    if (var25 < 50) {
                        var23 = (var25 * 5) + 16711680;
                    } else if (var25 < 100) {
                        var23 = 16711935 - ((var25 - 50) * 327680);
                    } else if (var25 < 150) {
                        var23 = (var25 - 100) * 327680 + 255 + 500 - (var25 * 5);
                    }
                }
                if (class92.field1276[var12] == 11) {
                    int var26 = 150 - class92.field1280[var12];
                    if (var26 < 50) {
                        var23 = 16777215 - var26 * 327685;
                    } else if (var26 < 100) {
                        var23 = var26 * 327685 + 65280 - 16384250;
                    } else if (var26 < 150) {
                        var23 = 32768000 + 16777215 - (var26 * 327680);
                    }
                }
                int var27 = var23 | 0xFF000000;
                if (class92.field1279[var12] == 0) {
                    class595.field7562.method2427(var17, arg6 + var14, 112, arg4 + var13, -16777216, var27);
                    var19 -= var18 >> 1;
                    var21 -= var18 >> 1;
                }
                if (class92.field1279[var12] == 1) {
                    var19 -= var18 >> 1;
                    var21 -= var18 >> 1;
                    var20 -= 5;
                    var22 += 5;
                    class595.field7562.method2425(var27, class495.field6333, -16777216, arg6 + var14, arg4 + var13, 0, var17);
                }
                if (class92.field1279[var12] == 2) {
                    class595.field7562.method2434(class495.field6333, arg1 ^ 0x19A3, arg4 + var13, var17, arg6 + var14, -16777216, var27);
                    var22 += 5;
                    var19 -= (var18 >> 1) + 5;
                    var21 -= (var18 >> 1) - 5;
                    var20 -= 5;
                }
                if (class92.field1279[var12] == 3) {
                    class595.field7562.method2431(-16777216, arg6 + var14, arg4 + var13, var17, 150 - class92.field1280[var12], class495.field6333, 1, var27);
                    var19 -= var18 >> 1;
                    var22 += 7;
                    var20 -= 7;
                    var21 -= var18 >> 1;
                }
                if (class92.field1279[var12] == 4) {
                    int var28 = (150 - class92.field1280[var12]) * (class66.field868.method1049(121, var17) + 100) / 150;
                    class576.field7320.method928(arg4 + var13 - 50, arg6, arg4 + var13 + 50, arg5 + arg6);
                    var21 += 50 - var28;
                    class595.field7562.method2419(arg6 + var14, var27, var17, -72, arg4 + var13 + 50 - var28, -16777216);
                    var19 += 50 - var28;
                    class576.field7320.method915(arg4, arg6, arg3 + arg4, arg5 + arg6);
                }
                if (class92.field1279[var12] == 5) {
                    int var29 = 150 - class92.field1280[var12];
                    int var30 = 0;
                    if (var29 < 25) {
                        var30 = var29 - 25;
                    } else if (var29 > 125) {
                        var30 = var29 - 125;
                    }
                    int var31 = class66.field868.field2212 + class66.field868.field2201;
                    class576.field7320.method928(arg4, arg6 + var14 - var31 - 1, arg3 + arg4, arg6 + var14 + 5);
                    var20 += var30;
                    var21 -= var18 >> 1;
                    var19 -= var18 >> 1;
                    class595.field7562.method2427(var17, arg6 + var14 + var30, 109, arg4 + var13, -16777216, var27);
                    var22 += var30;
                    class576.field7320.method915(arg4, arg6, arg4 + arg3, arg6 - -arg5);
                }
            } else {
                var21 -= var18 >> 1;
                var19 -= var18 >> 1;
                class595.field7562.method2427(var17, arg6 + var14, 124, arg4 + var13, -16777216, -256);
            }
            class548.method2967(var19, var22 + 1, var20, (byte) -83, var21 + 1);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Ltia;II)Z")
    public static final boolean method824(class740 arg0, int arg1, int arg2) {
        field1860++;
        int var3 = arg0.method4023(true, 2);
        if (var3 == 0) {
            if (arg0.method4023(true, 1) != 0) {
                method824(arg0, arg1, -82);
            }
            int var4 = arg0.method4023(true, 6);
            int var5 = arg0.method4023(true, 6);
            boolean var6 = arg0.method4023(true, 1) == 1;
            if (var6) {
                class723.field9490[class404.field5371++] = arg1;
            }
            if (class263.field3508[arg1] != null) {
                throw new RuntimeException("hr:lr");
            }
            class750 var7 = class420.field5533[arg1];
            class33 var8 = class263.field3508[arg1] = new class33();
            var8.field4737 = arg1;
            if (class26.field229[arg1] != null) {
                var8.method177(class26.field229[arg1], -1);
            }
            var8.method2179(284, var7.field10226, true);
            var8.field4723 = var7.field10230;
            int var9 = var7.field10232;
            int var10 = var9 >> 28;
            int var11 = var9 >> 14 & 0xFF;
            int var12 = var9 & 0xFF;
            int var13 = (var11 << 6) + var4 - class714.field9407;
            int var14 = (var12 << 6) + (var5 - class240.field3293);
            var8.field344 = var7.field10227;
            var8.field342 = var7.field10233;
            var8.field4761[0] = class282.field3657[arg1];
            var8.field2895 = var8.field2889 = (byte) var10;
            if (class433.method2484(var14, 0, var13)) {
                var8.field2889++;
            }
            var8.method184(var14, var13, 126);
            var8.field333 = false;
            class420.field5533[arg1] = null;
            return true;
        } else if (var3 == 1) {
            int var15 = arg0.method4023(true, 2);
            int var16 = class420.field5533[arg1].field10232;
            class420.field5533[arg1].field10232 = (((var16 >> 28) + var15 & 0x3) << 28) + (var16 & 0xFFFFFFF);
            return false;
        } else if (var3 == 2) {
            int var17 = arg0.method4023(true, 5);
            int var18 = var17 >> 3;
            int var19 = var17 & 0x7;
            int var20 = class420.field5533[arg1].field10232;
            int var21 = (var20 >> 28) + var18 & 0x3;
            int var22 = (var20 & 0x3FD627) >> 14;
            int var23 = var20 & 0xFF;
            if (var19 == 0) {
                var22--;
                var23--;
            }
            if (var19 == 1) {
                var23--;
            }
            if (var19 == 2) {
                var23--;
                var22++;
            }
            if (var19 == 3) {
                var22--;
            }
            if (var19 == 4) {
                var22++;
            }
            if (var19 == 5) {
                var23++;
                var22--;
            }
            if (var19 == 6) {
                var23++;
            }
            if (var19 == 7) {
                var23++;
                var22++;
            }
            class420.field5533[arg1].field10232 = (var21 << 28) + (var22 << 14) + var23;
            return false;
        } else {
            int var24 = arg0.method4023(true, 18);
            int var25 = var24 >> 16;
            int var26 = var24 >> 8 & 0xFF;
            if (arg2 >= -60) {
                field1864 = null;
            }
            int var27 = var24 & 0xFF;
            int var28 = class420.field5533[arg1].field10232;
            int var29 = (var28 >> 28) + var25 & 0x3;
            int var30 = (var28 >> 14) + var26 & 0xFF;
            int var31 = var28 + var27 & 0xFF;
            class420.field5533[arg1].field10232 = (var29 << 28) + (var30 << 14) + var31;
            return false;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)Z")
    public final boolean method825(byte arg0) {
        field1863++;
        if (arg0 != -117) {
            field1858 = -85;
        }
        return false;
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lofa;Ljava/lang/Object;I)V")
    public class143(class320 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field1859 = arg1;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
    public static void method826(int arg0) {
        field1864 = null;
        if (arg0 != 150) {
            method824(null, 43, 66);
        }
        field1861 = null;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IB)Z")
    public static final boolean method827(int arg0, byte arg1) {
        field1855++;
        if (arg0 == 15 || arg0 == 46 || arg0 == 23 || arg0 == 13 || arg0 == 1002) {
            return true;
        } else {
            if (arg1 >= -35) {
                method827(-68, (byte) -110);
            }
            return arg0 == 53 || arg0 == 1009;
        }
    }

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "(B)Ljava/lang/Object;")
    public final Object method828(byte arg0) {
        if (arg0 >= -105) {
            field1864 = null;
        }
        field1856++;
        return this.field1859;
    }
}
