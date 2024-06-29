import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class244 {

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
    public static int field3221 = -1;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "Lho;")
    public static class103 field3220 = new class103(79, -1);

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "Lml;")
    public static class266 field3223;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V", line = 6)
    public static void method1518(int arg0) {
        field3223 = null;
        if (arg0 != 0) {
            field3223 = null;
        }
        field3220 = null;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lwq;I)V", line = 17)
    public static final void method1519(class115 arg0, int arg1) {
        field3222++;
        if (class517.field7625 == arg0) {
            int var2 = class334.field4414.method2441(-25006);
            int var3 = (var2 >> 4 & 0x7) + class367.field5013;
            int var4 = (var2 & 0x7) + class242.field3197;
            int var5 = class334.field4414.method2386(-23648);
            if (var3 >= 0 && var4 >= 0 && var3 < class308.field4128 && var4 < class426.field6200) {
                class166 var6 = (class166) class243.field3208.method295((long) (var4 << 14 | class12.field131 << 28 | var3), -128);
                if (var6 != null) {
                    for (class364 var7 = (class364) var6.field2147.method970(12); var7 != null; var7 = (class364) var6.field2147.method976((byte) -127)) {
                        if ((var5 & 0x7FFF) == var7.field4971) {
                            var7.method2674(true);
                            break;
                        }
                    }
                    if (var6.field2147.method979(2)) {
                        var6.method2674(true);
                    }
                    class497.method2995(class12.field131, var4, var3, (byte) -127);
                }
            }
        } else if (class375.field5083 == arg0) {
            int var8 = class334.field4414.method2388((byte) -122);
            int var9 = (var8 >> 4 & 0x7) + class367.field5013;
            int var10 = class242.field3197 + (var8 & 0x7);
            int var11 = class334.field4414.method2386(-23648);
            if (var11 == 65535) {
                var11 = -1;
            }
            int var12 = class334.field4414.method2388((byte) -112);
            int var13 = var12 >> 4 & 0xF;
            int var14 = var12 & 0x7;
            int var15 = class334.field4414.method2388((byte) -111);
            int var16 = class334.field4414.method2388((byte) -117);
            if (var9 >= 0 && var10 >= 0 && var9 < class308.field4128 && class426.field6200 > var10) {
                int var17 = var13 + 1;
                if (class96.field1170.field1249[0] >= (var9 - var17) && (var9 + var17) >= class96.field1170.field1249[0] && var10 - var17 <= class96.field1170.field1251[0] && class96.field1170.field1251[0] <= (var10 + var17)) {
                    class274.method1667((byte) -28, var14, var15, (var9 << 16) + (class12.field131 << 24) + var13 + (var10 << 8), var16, var11);
                }
            }
        } else if (class495.field7225 == arg0) {
            int var18 = class334.field4414.method2388((byte) -125);
            int var19 = (var18 >> 4 & 0x7) + class367.field5013;
            int var20 = class242.field3197 + (var18 & 0x7);
            int var21 = class334.field4414.method2386(-23648);
            int var22 = class334.field4414.method2386(-23648);
            int var23 = class334.field4414.method2386(-23648);
            if (class243.field3208 != null && var19 >= 0 && var20 >= 0 && var19 < class308.field4128 && class426.field6200 > var20) {
                class166 var24 = (class166) class243.field3208.method295((long) (var19 | class12.field131 << 28 | var20 << 14), -118);
                if (var24 != null) {
                    for (class364 var25 = (class364) var24.field2147.method970(12); var25 != null; var25 = (class364) var24.field2147.method976((byte) 105)) {
                        if ((var21 & 0x7FFF) == var25.field4971 && var25.field4974 == var22) {
                            var25.method2674(true);
                            var25.field4974 = var23;
                            class262.method1613(class12.field131, var20, (byte) 55, var19, var25);
                            break;
                        }
                    }
                    class497.method2995(class12.field131, var20, var19, (byte) -56);
                }
            }
        } else if (class185.field2418 == arg0) {
            int var26 = class334.field4414.method2388((byte) -121);
            int var27 = ((var26 & 0xF7) >> 4) + class367.field5013 * 2;
            int var28 = (var26 & 0xF) + class242.field3197 * 2;
            boolean var29 = class334.field4414.method2388((byte) -114) != 0;
            int var30 = var27 + class334.field4414.method2418(-113);
            int var31 = var28 + class334.field4414.method2418(-28);
            int var32 = class334.field4414.method2433((byte) 115);
            int var33 = class334.field4414.method2433((byte) 115);
            int var34 = class334.field4414.method2386(-23648);
            byte var35 = class334.field4414.method2418(-57);
            int var36 = class334.field4414.method2388((byte) -123) * 4;
            int var37 = class334.field4414.method2386(-23648);
            int var38 = class334.field4414.method2386(-23648);
            int var39 = class334.field4414.method2388((byte) -127);
            if (var39 == 255) {
                var39 = -1;
            }
            int var40 = class334.field4414.method2388((byte) -113);
            if (var27 >= 0 && var28 >= 0 && var27 < (class308.field4128 * 2) && class308.field4128 * 2 > var28 && var30 >= 0 && var31 >= 0 && (class426.field6200 * 2) > var30 && (class426.field6200 * 2) > var31 && var34 != 65535) {
                int var41 = var31 * 64;
                int var42 = var27 * 64;
                int var43 = var35 << 0;
                int var44 = var30 * 64;
                int var45 = var36 << 0;
                int var46 = var28 * 64;
                if (var32 != 0) {
                    int var48;
                    class96 var50;
                    if (var32 < 0) {
                        int var47 = -var32 - 1;
                        var48 = (var47 & 0x7DE3) >> 11;
                        int var49 = var47 & 0x7FF;
                        if (class308.field4121 == var49) {
                            var50 = class96.field1170;
                        } else {
                            var50 = class29.field272[var49];
                        }
                    } else {
                        int var51 = var32 - 1;
                        var48 = (var51 & 0x7F72) >> 11;
                        int var52 = var51 & 0x7FF;
                        var50 = class339.field4484[var52];
                    }
                    if (var50 != null) {
                        class306 var53 = var50.method547((byte) 117);
                        if (var53.field4069 != null && var53.field4069[var48] != null) {
                            int var54 = var53.field4069[var48][0];
                            int var55 = var53.field4069[var48][2];
                            int var56 = var50.field1231.method615(-1);
                            int var57 = class456.field6812[var56];
                            int var58 = class456.field6811[var56];
                            int var59 = var54 * var58 + var55 * var57 >> 15;
                            int var60 = var55 * var58 - (var54 * var57) >> 15;
                            var43 -= var53.field4069[var48][1];
                            var46 += var60;
                            var42 += var59;
                        }
                    }
                }
                class417 var62 = new class417(var34, class12.field131, var42, var46, var43, class532.field7836 + var37, class532.field7836 + var38, var39, var40, var33, var45, var29);
                var62.method2579(class532.field7836 + var37, var44, class470.method2868(127, class12.field131, var44, var41) - var45, var41, (byte) -124);
                class116.field1514.method975(0, new class397(var62));
            }
        } else if (class401.field5817 == arg0) {
            int var63 = class334.field4414.method2392(false);
            int var64 = class334.field4414.method2441(-25006);
            int var65 = ((var64 & 0x75) >> 4) + class367.field5013;
            int var66 = (var64 & 0x7) + class242.field3197;
            int var67 = class334.field4414.method2386(-23648);
            int var68 = class334.field4414.method2392(false);
            if (var65 >= 0 && var66 >= 0 && class308.field4128 > var65 && var66 < class426.field6200 && class308.field4121 != var68) {
                class262.method1613(class12.field131, var66, (byte) -103, var65, new class364(var63, var67));
                class497.method2995(class12.field131, var66, var65, (byte) -117);
            }
        } else if (class316.field4228 == arg0) {
            int var69 = class334.field4414.method2441(-25006);
            int var70 = var69 >> 2;
            int var71 = var69 & 0x3;
            int var72 = class198.field2555[var70];
            int var73 = class334.field4414.method2388((byte) -115);
            int var74 = (var73 >> 4 & 0x7) + class367.field5013;
            int var75 = (var73 & 0x7) + class242.field3197;
            int var76 = class334.field4414.method2386(-23648);
            if (class449.method2773((byte) -118, class116.field1512) || var74 >= 0 && var75 >= 0 && var74 < class308.field4128 && var75 < class426.field6200) {
                class206.method1307(17354, var74, var76, -1, var75, var72, class12.field131, 0, var71, var70);
            }
        } else if (class482.field7121 == arg0) {
            class334.field4414.method2388((byte) -125);
            int var77 = class334.field4414.method2388((byte) -128);
            int var78 = ((var77 & 0x7B) >> 4) + class367.field5013;
            int var79 = (var77 & 0x7) + class242.field3197;
            int var80 = class334.field4414.method2386(-23648);
            int var81 = class334.field4414.method2388((byte) -127);
            int var82 = class334.field4414.method2396((byte) -115);
            String var83 = class334.field4414.method2432((byte) 125);
            class323.method1909(var79, class12.field131, var83, var82, var78, -81, var81, var80);
        } else if (class408.field5858 == arg0) {
            int var84 = class334.field4414.method2388((byte) -124);
            boolean var85 = (var84 & 0x80) != 0;
            int var86 = ((var84 & 0x3F) >> 3) + class367.field5013;
            int var87 = (var84 & 0x7) + class242.field3197;
            int var88 = class334.field4414.method2418(121) + var86;
            int var89 = class334.field4414.method2418(-121) + var87;
            int var90 = class334.field4414.method2433((byte) 115);
            int var91 = class334.field4414.method2386(-23648);
            int var92 = class334.field4414.method2388((byte) -122) * 4;
            int var93 = class334.field4414.method2388((byte) -127) * 4;
            int var94 = class334.field4414.method2386(-23648);
            int var95 = class334.field4414.method2386(-23648);
            int var96 = class334.field4414.method2388((byte) -119);
            if (var96 == 255) {
                var96 = -1;
            }
            int var97 = class334.field4414.method2388((byte) -111);
            if (var86 >= 0 && var87 >= 0 && class308.field4128 > var86 && var87 < class426.field6200 && var88 >= 0 && var89 >= 0 && class308.field4128 > var88 && var89 < class426.field6200 && var91 != 65535) {
                int var98 = var86 * 128 + 64;
                int var99 = var92 << 0;
                int var100 = var88 * 128 + 64;
                int var101 = var87 * 128 + 64;
                int var102 = var89 * 128 + 64;
                int var103 = var93 << 0;
                class417 var104 = new class417(var91, class12.field131, var98, var101, var99, class532.field7836 + var94, class532.field7836 + var95, var96, var97, var90, var103, var85);
                var104.method2579(class532.field7836 + var94, var100, class470.method2868(124, class12.field131, var100, var102) - var103, var102, (byte) 107);
                class116.field1514.method975(0, new class397(var104));
            }
        } else if (class517.field7626 == arg0) {
            int var105 = class334.field4414.method2387((byte) 125);
            int var106 = class334.field4414.method2447(4339);
            int var107 = ((var106 & 0x78) >> 4) + class367.field5013;
            int var108 = (var106 & 0x7) + class242.field3197;
            int var109 = class334.field4414.method2386(-23648);
            if (var107 >= 0 && var108 >= 0 && class308.field4128 > var107 && var108 < class426.field6200) {
                class262.method1613(class12.field131, var108, (byte) 63, var107, new class364(var105, var109));
                class497.method2995(class12.field131, var108, var107, (byte) -82);
            }
        } else if (class338.field4468 == arg0) {
            int var110 = class334.field4414.method2447(4339);
            int var111 = var110 >> 2;
            int var112 = var110 & 0x3;
            int var113 = class198.field2555[var111];
            int var114 = class334.field4414.method2447(4339);
            int var115 = ((var114 & 0x7F) >> 4) + class367.field5013;
            int var116 = (var114 & 0x7) + class242.field3197;
            int var117 = class334.field4414.method2392(false);
            if (var117 == 65535) {
                var117 = -1;
            }
            class419.method2590(class12.field131, var113, var112, var111, var116, var117, -12, var115);
        } else if (class444.field6464 == arg0) {
            int var118 = class334.field4414.method2388((byte) -127);
            int var119 = ((var118 & 0xF0) >> 4) + class367.field5013 * 2;
            int var120 = class242.field3197 * 2 + (var118 & 0xF);
            boolean var121 = class334.field4414.method2388((byte) -127) != 0;
            int var122 = class334.field4414.method2418(-46) + var119;
            int var123 = var120 + class334.field4414.method2418(-42);
            int var124 = class334.field4414.method2433((byte) 115);
            int var125 = class334.field4414.method2386(-23648);
            int var126 = class334.field4414.method2388((byte) -128) * 4;
            int var127 = class334.field4414.method2388((byte) -118) * 4;
            int var128 = class334.field4414.method2386(-23648);
            int var129 = class334.field4414.method2386(-23648);
            int var130 = class334.field4414.method2388((byte) -123);
            int var131 = class334.field4414.method2388((byte) -117);
            if (var130 == 255) {
                var130 = -1;
            }
            if (var119 >= 0 && var120 >= 0 && (class308.field4128 * 2) > var119 && (class308.field4128 * 2) > var120 && var122 >= 0 && var123 >= 0 && (class426.field6200 * 2) > var122 && var123 < (class426.field6200 * 2) && var125 != 65535) {
                int var132 = var127 << 0;
                int var133 = var126 << 0;
                int var134 = var122 * 64;
                int var135 = var119 * 64;
                int var136 = var123 * 64;
                int var137 = var120 * 64;
                class417 var138 = new class417(var125, class12.field131, var135, var137, var133, class532.field7836 + var128, class532.field7836 + var129, var130, var131, var124, var132, var121);
                var138.method2579(var128 + class532.field7836, var134, class470.method2868(40, class12.field131, var134, var136) - var132, var136, (byte) -7);
                class116.field1514.method975(0, new class397(var138));
            }
        } else if (class514.field7477 == arg0) {
            int var139 = class334.field4414.method2447(4339);
            int var140 = (var139 >> 4 & 0x7) + class367.field5013;
            int var141 = (var139 & 0x7) + class242.field3197;
            int var142 = class334.field4414.method2447(4339);
            int var143 = var142 >> 2;
            int var144 = var142 & 0x3;
            int var145 = class198.field2555[var143];
            if (class449.method2773((byte) -118, class116.field1512) || var140 >= 0 && var141 >= 0 && var140 < class308.field4128 && var141 < class426.field6200) {
                class206.method1307(17354, var140, -1, -1, var141, var145, class12.field131, 0, var144, var143);
            }
        } else if (class419.field6086 == arg0) {
            int var146 = class334.field4414.method2388((byte) -110);
            int var147 = (var146 >> 4 & 0x7) + class367.field5013;
            int var148 = (var146 & 0x7) + class242.field3197;
            int var149 = class334.field4414.method2386(-23648);
            int var150 = class334.field4414.method2388((byte) -128);
            int var151 = class334.field4414.method2386(-23648);
            int var152 = class334.field4414.method2388((byte) -126);
            if (var147 >= 0 && var148 >= 0 && class308.field4128 > var147 && class426.field6200 > var148) {
                int var153 = var147 * 128 + 64;
                int var154 = var148 * 128 + 64;
                int var155 = class12.field131;
                if (var155 < 3 && class381.method2330(false, var148, var147)) {
                    var155++;
                }
                class530 var156 = new class530(var149, var151, class532.field7836, class12.field131, var155, var153, class470.method2868(127, class12.field131, var153, var154) - var150, var154, var147, var147, var148, var148, var152);
                class65.field740.method975(0, new class428(var156));
            }
        } else if (class6.field61 == arg0) {
            byte var157 = class334.field4414.method2428(1797);
            byte var158 = class334.field4414.method2428(1797);
            byte var159 = class334.field4414.method2418(-96);
            int var160 = class334.field4414.method2433((byte) 115);
            int var161 = class334.field4414.method2414(true);
            int var162 = class367.field5013 + (var161 >> 4 & 0x7);
            int var163 = (var161 & 0x7) + class242.field3197;
            byte var164 = class334.field4414.method2404((byte) -97);
            int var165 = class334.field4414.method2426((byte) 127);
            int var166 = class334.field4414.method2387((byte) 125);
            int var167 = class334.field4414.method2388((byte) -116);
            int var168 = var167 >> 2;
            int var169 = var167 & 0x3;
            int var170 = class334.field4414.method2392(false);
            if (!class343.field4596.method1144()) {
                class474.method2889(var158, var157, var170, var168, var162, var169, var165, var159, var164, var166, class12.field131, var163, (byte) -107, var160);
            }
        } else if (class215.field2935 == arg0) {
            int var171 = class334.field4414.method2386(-23648);
            int var172 = class334.field4414.method2388((byte) -110);
            class123.field1593.method2920(var171, 19219).method404(0, var172);
        } else {
            client.method1256(null, -2020, "T3 - " + arg0);
            int var173 = -93 % ((arg1 + 15) / 40);
            class321.method1900(false, -20147);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IZIII)V", line = 642)
    public static final void method1520(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field3224++;
        if (class169.field2190 == 1) {
            class250.field3337[class474.field7032 / 100].method144(class396.field5749 - 8, class410.field5875 + -8);
        }
        if (class169.field2190 == 2) {
            class250.field3337[(class474.field7032 / 100) + 4].method144(class396.field5749 - 8, class410.field5875 + -8);
        }
        if (!arg1) {
            method1519(null, -112);
        }
        class205.method1305(!arg1);
    }
}
