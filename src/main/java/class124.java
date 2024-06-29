import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class124 extends class69 {

    @OriginalMember(owner = "client!ab", name = "t", descriptor = "Lha;")
    public class46 field2289;

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "Lha;")
    public static class46 field2284 = class271.method1828("Nehmen", -46);

    @OriginalMember(owner = "client!ab", name = "s", descriptor = "I")
    public static int field2288 = 0;

    @OriginalMember(owner = "client!ab", name = "u", descriptor = "Z")
    public static boolean field2290 = false;

    @OriginalMember(owner = "client!ab", name = "v", descriptor = "I")
    public static int field2291 = 0;

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!ab", name = "q", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!ab", name = "r", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!ab", name = "w", descriptor = "I")
    public static int field2292;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lbc;IIIIIIIZ)V")
    public static final void method966(class265 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class93.field1751;
        int var11;
        int var12 = var11 = (arg7 << 7) - class118.field2224;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class119.field2228[arg1][arg6][arg7] - class200.field3577;
        int var18 = class119.field2228[arg1][arg6 + 1][arg7] - class200.field3577;
        int var19 = class119.field2228[arg1][arg6 + 1][arg7 + 1] - class200.field3577;
        int var20 = class119.field2228[arg1][arg6][arg7 + 1] - class200.field3577;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 < 50) {
            return;
        }
        int var27 = arg4 * var11 + arg5 * var14 >> 16;
        int var28 = arg5 * var11 - arg4 * var14 >> 16;
        int var30 = arg3 * var18 - arg2 * var28 >> 16;
        int var31 = arg2 * var18 + arg3 * var28 >> 16;
        if (var31 < 50) {
            return;
        }
        int var33 = arg4 * var16 + arg5 * var13 >> 16;
        int var34 = arg5 * var16 - arg4 * var13 >> 16;
        int var36 = arg3 * var19 - arg2 * var34 >> 16;
        int var37 = arg2 * var19 + arg3 * var34 >> 16;
        if (var37 < 50) {
            return;
        }
        int var39 = arg4 * var15 + arg5 * var9 >> 16;
        int var40 = arg5 * var15 - arg4 * var9 >> 16;
        int var42 = arg3 * var20 - arg2 * var40 >> 16;
        int var43 = arg2 * var20 + arg3 * var40 >> 16;
        if (var43 < 50) {
            return;
        }
        int var45 = (var21 << 9) / var25 + class62.field1043;
        int var46 = (var24 << 9) / var25 + class62.field1050;
        int var47 = (var27 << 9) / var31 + class62.field1043;
        int var48 = (var30 << 9) / var31 + class62.field1050;
        int var49 = (var33 << 9) / var37 + class62.field1043;
        int var50 = (var36 << 9) / var37 + class62.field1050;
        int var51 = (var39 << 9) / var43 + class62.field1043;
        int var52 = (var42 << 9) / var43 + class62.field1050;
        class62.field1036 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class240.field4278 && class244.method1673(class62.field1043 + class140.field2508, class62.field1050 + class37.field662, var50, var52, var48, var49, var51, var47)) {
                class119.field2239 = arg6;
                class12.field199 = arg7;
            }
            if (!arg8) {
                class62.field1053 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class62.field1039 || var51 > class62.field1039 || var47 > class62.field1039) {
                    class62.field1053 = true;
                }
                if (arg0.field4605 == -1) {
                    if (arg0.field4611 != 12345678) {
                        class62.method435(var50, var52, var48, var49, var51, var47, arg0.field4611, arg0.field4601, arg0.field4597);
                    }
                } else if (!class111.field2103) {
                    int var53 = class62.field1040.method728(arg0.field4605, (byte) -113);
                    class62.method435(var50, var52, var48, var49, var51, var47, class10.method52(var53, arg0.field4611), class10.method52(var53, arg0.field4601), class10.method52(var53, arg0.field4597));
                } else if (arg0.field4600) {
                    class62.method425(var50, var52, var48, var49, var51, var47, arg0.field4611, arg0.field4601, arg0.field4597, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field4605);
                } else {
                    class62.method425(var50, var52, var48, var49, var51, var47, arg0.field4611, arg0.field4601, arg0.field4597, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field4605);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class240.field4278 && class244.method1673(class62.field1043 + class140.field2508, class62.field1050 + class37.field662, var46, var48, var52, var45, var47, var51)) {
            class119.field2239 = arg6;
            class12.field199 = arg7;
        }
        if (arg8) {
            return;
        }
        class62.field1053 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class62.field1039 || var47 > class62.field1039 || var51 > class62.field1039) {
            class62.field1053 = true;
        }
        if (arg0.field4605 != -1) {
            if (class111.field2103) {
                class62.method425(var46, var48, var52, var45, var47, var51, arg0.field4598, arg0.field4597, arg0.field4601, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field4605);
                return;
            }
            int var54 = class62.field1040.method728(arg0.field4605, (byte) -84);
            class62.method435(var46, var48, var52, var45, var47, var51, class10.method52(var54, arg0.field4598), class10.method52(var54, arg0.field4597), class10.method52(var54, arg0.field4601));
        } else if (arg0.field4598 != 12345678) {
            class62.method435(var46, var48, var52, var45, var47, var51, arg0.field4598, arg0.field4597, arg0.field4601);
            return;
        }
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V")
    public static void method967(int arg0) {
        field2284 = null;
        if (arg0 != 21113) {
            field2291 = 40;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZJ)Lha;")
    public static final class46 method968(boolean arg0, long arg1) {
        field2292++;
        class176.field3163.setTime(new Date(arg1));
        int var3 = class176.field3163.get(7);
        int var4 = class176.field3163.get(5);
        if (arg0) {
            return null;
        }
        int var5 = class176.field3163.get(2);
        int var6 = class176.field3163.get(1);
        int var7 = class176.field3163.get(11);
        int var8 = class176.field3163.get(12);
        int var9 = class176.field3163.get(13);
        return class109.method855(0, new class46[] { class74.field1338[var3 - 1], class106.field1929, class115.method932(false, var4 / 10), class115.method932(arg0, var4 % 10), class270.field4704, class111.field2115[var5], class270.field4704, class115.method932(false, var6), class108.field2009, class115.method932(false, var7 / 10), class115.method932(false, var7 % 10), class207.field3714, class115.method932(arg0, var8 / 10), class115.method932(false, var8 % 10), class207.field3714, class115.method932(false, var9 / 10), class115.method932(false, var9 % 10), class116.field2195 });
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(B)V")
    public static final void method969(byte arg0) {
        field2285++;
        for (int var1 = 0; var1 < class43.field724; var1++) {
            class10 var2 = class6.method24(var1, (byte) 64);
            if (var2 != null && var2.field177 == 0) {
                class234.field4064[var1] = 0;
                class29.field568[var1] = 0;
            }
        }
        class15.field226 = new class235(16);
        if (arg0 != 71) {
            field2288 = -98;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(III[Lhi;IIIIII)V")
    public static final void method970(int arg0, int arg1, int arg2, class24[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2286++;
        class262.method1753(arg9, arg6, arg0, arg7);
        class62.method438();
        if (arg8 != 1) {
            field2290 = false;
        }
        for (int var10 = 0; var10 < arg3.length; var10++) {
            class24 var11 = arg3[var10];
            if (var11 != null && (var11.field440 == arg4 || arg4 == -1412584499 && class259.field4517 == var11)) {
                int var12;
                if (arg1 == -1) {
                    class175.field3156[class193.field3473] = var11.field421 + arg2;
                    class51.field894[class193.field3473] = var11.field501 + arg5;
                    class186.field3336[class193.field3473] = var11.field468;
                    class98.field1816[class193.field3473] = var11.field341;
                    var12 = class193.field3473++;
                } else {
                    var12 = arg1;
                }
                var11.field448 = var12;
                var11.field361 = class157.field2803;
                if (!var11.field480 || !client.method1809(var11)) {
                    if (var11.field407 > 0) {
                        class89.method693((byte) -101, var11);
                    }
                    int var13 = var11.field421 + arg2;
                    int var14 = var11.field501 + arg5;
                    int var15 = var11.field342;
                    if (class40.field701 && (client.method1811(var11) != 0 || var11.field485 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class259.field4517 == var11) {
                        if (arg4 != -1412584499 && !var11.field428) {
                            class221.field3886 = arg2;
                            class42.field708 = arg5;
                            class113.field2144 = arg3;
                            continue;
                        }
                        if (class222.field3914 && class137.field2473) {
                            int var16 = class7.field116;
                            int var17 = class208.field3735;
                            int var18 = var17 - class229.field3995;
                            int var19 = var16 - class47.field823;
                            if (var18 < class14.field211) {
                                var18 = class14.field211;
                            }
                            if (class32.field598 > var19) {
                                var19 = class32.field598;
                            }
                            if (var11.field341 + var18 > class14.field211 + class177.field3184.field341) {
                                var18 = class14.field211 + class177.field3184.field341 - var11.field341;
                            }
                            if (var19 + var11.field468 > class32.field598 + class177.field3184.field468) {
                                var19 = class32.field598 + class177.field3184.field468 - var11.field468;
                            }
                            var13 = var19;
                            var14 = var18;
                        }
                        if (!var11.field428) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var24;
                    int var25;
                    if (var11.field485 == 2) {
                        var20 = arg9;
                        var25 = arg0;
                        var21 = arg6;
                        var24 = arg7;
                    } else {
                        var20 = arg9 >= var13 ? arg9 : var13;
                        var21 = arg6 < var14 ? var14 : arg6;
                        int var22 = var11.field468 + var13;
                        int var23 = var11.field341 + var14;
                        if (var11.field485 == 9) {
                            var22++;
                            var23++;
                        }
                        var24 = var23 < arg7 ? var23 : arg7;
                        var25 = var22 < arg0 ? var22 : arg0;
                    }
                    if (!var11.field480 || var25 > var20 && var21 < var24) {
                        if (var11.field407 != 0) {
                            if (var11.field407 == 1337) {
                                class145.field2627 = var13;
                                class240.field4277 = var11;
                                class205.field3680 = var14;
                                class237.method1624(var11.field407 == 1403, var14, var11.field341, var11.field468, arg8 ^ 0x2, var13);
                                class262.method1753(arg9, arg6, arg0, arg7);
                                continue;
                            }
                            if (var11.field407 == 1338) {
                                if (var11.method167(true)) {
                                    class106.method805(var12, arg8 ^ 0x21, var11, var13, var14);
                                    class262.method1753(arg9, arg6, arg0, arg7);
                                }
                                continue;
                            }
                            if (var11.field407 == 1339) {
                                if (var11.method167(true)) {
                                    class185.method1340(var12, var13, var11, var14, (byte) -126);
                                    class262.method1753(arg9, arg6, arg0, arg7);
                                }
                                continue;
                            }
                            if (var11.field407 == 1400) {
                                class272.method1832(var11.field468, var13, var11.field341, var14, -12732);
                                class31.field592[var12] = true;
                                class52.field905[var12] = true;
                                class262.method1753(arg9, arg6, arg0, arg7);
                                continue;
                            }
                            if (var11.field407 == 1401) {
                                class93.method729(1457, var14, var11.field468, var13, var11.field341);
                                class31.field592[var12] = true;
                                class52.field905[var12] = true;
                                class262.method1753(arg9, arg6, arg0, arg7);
                                continue;
                            }
                            if (var11.field407 == 1402) {
                                class240.method1653(arg8 ^ 0xFFFF926A, var13, var14);
                                class31.field592[var12] = true;
                                class52.field905[var12] = true;
                                continue;
                            }
                            if (var11.field407 == 1405) {
                                if (!class4.field74) {
                                    continue;
                                }
                                int var26 = var11.field468 + var13;
                                int var27 = var14 + 15;
                                class261.field4547.method139(class109.method855(0, new class46[] { class217.field3843, class115.method932(false, class3.field44) }), var26, var27, 16776960, -1);
                                Runtime var28 = Runtime.getRuntime();
                                int var115 = var27 + 15;
                                int var29 = (int) ((var28.totalMemory() - var28.freeMemory()) / 1024L);
                                int var30 = 0;
                                int var31 = 0;
                                int var32 = 0;
                                int var33 = 16776960;
                                if (var29 > 65536) {
                                    var33 = 16711680;
                                }
                                class261.field4547.method139(class109.method855(0, new class46[] { class263.field4572, class115.method932(false, var29), class17.field254 }), var26, var115, var33, -1);
                                var27 = var115 + 15;
                                int var34 = 16776960;
                                for (int var35 = 0; var35 < 27; var35++) {
                                    var31 += class119.field2236[var35].method1579(false);
                                    var30 += class119.field2236[var35].method1581((byte) 120);
                                    var32 += class119.field2236[var35].method1576(true);
                                }
                                int var36 = var32 * 100 / var31;
                                int var37 = var30 * 10000 / var31;
                                class46 var38 = class109.method855(0, new class46[] { class196.field3510, class73.method533(255, (long) var37, 0, 2, true), class163.field2911, class115.method932(false, var36), class212.field3775 });
                                class37.field663.method139(var38, var26, var27, var34, -1);
                                var27 += 12;
                                class31.field592[var12] = true;
                                class52.field905[var12] = true;
                                continue;
                            }
                        }
                        if (!class222.field3910) {
                            if (var11.field485 == 0 && var11.field459 && class197.field3517 >= var20 && class250.field4420 >= var21 && var25 > class197.field3517 && class250.field4420 < var24 && !class40.field701) {
                                class215.field3807[0] = 1004;
                                class275.field4795[0] = class3.field48;
                                class242.field4290 = 1;
                                class162.field2855[0] = class85.field1613;
                            }
                            if (class197.field3517 >= var20 && var21 <= class250.field4420 && var25 > class197.field3517 && var24 > class250.field4420) {
                                class111.method906(class197.field3517 - var13, class250.field4420 - var14, 104, var11);
                            }
                        }
                        if (var11.field485 == 0) {
                            if (!var11.field480 && client.method1809(var11) && class216.field3831 != var11) {
                                continue;
                            }
                            if (!var11.field480) {
                                if (var11.field412 > var11.field350 - var11.field341) {
                                    var11.field412 = var11.field350 - var11.field341;
                                }
                                if (var11.field412 < 0) {
                                    var11.field412 = 0;
                                }
                            }
                            method970(var25, var12, var13 - var11.field506, arg3, var11.field374, var14 - var11.field412, var21, var24, 1, var20);
                            if (var11.field503 != null) {
                                method970(var25, var12, var13 - var11.field506, var11.field503, var11.field374, var14 - var11.field412, var21, var24, 1, var20);
                            }
                            class31 var39 = (class31) class93.field1727.method1601(76, (long) var11.field374);
                            if (var39 != null) {
                                if (var39.field591 == 0 && !class222.field3910 && var20 <= class197.field3517 && var21 <= class250.field4420 && class197.field3517 < var25 && var24 > class250.field4420 && !class40.field701) {
                                    class242.field4290 = 1;
                                    class275.field4795[0] = class3.field48;
                                    class162.field2855[0] = class85.field1613;
                                    class215.field3807[0] = 1004;
                                }
                                class134.method1031(false, var21, var39.field582, var20, var13, var14, var12, var24, var25);
                            }
                            class262.method1753(arg9, arg6, arg0, arg7);
                            class62.method438();
                        }
                        if (class119.field2243[var12] || class158.field2812 > 1) {
                            if (var11.field485 == 0 && !var11.field480 && var11.field341 < var11.field350) {
                                class42.method280(var11.field341, var14, 2988, var11.field468 + var13, var11.field350, var11.field412);
                            }
                            if (var11.field485 != 1) {
                                if (var11.field485 == 2) {
                                    int var40 = 0;
                                    for (int var41 = 0; var41 < var11.field461; var41++) {
                                        for (int var42 = 0; var42 < var11.field467; var42++) {
                                            int var43 = (var11.field463 + 32) * var42 + var13;
                                            int var44 = (var11.field388 + 32) * var41 + var14;
                                            if (var40 < 20) {
                                                var44 += var11.field510[var40];
                                                var43 += var11.field427[var40];
                                            }
                                            if (var11.field498[var40] > 0) {
                                                boolean var46 = false;
                                                boolean var47 = false;
                                                int var48 = var11.field498[var40] - 1;
                                                if ((var43 + 32) > arg9 && arg0 > var43 && arg6 < var44 + 32 && var44 < arg7 || class144.field2622 == var11 && class4.field76 == var40) {
                                                    class263 var49;
                                                    if (class31.field585 == 1 && class222.field3903 == var40 && class20.field265 == var11.field374) {
                                                        var49 = class86.method670(var48, 0, true, var11.field420, 2, var11.field483[var40]);
                                                    } else {
                                                        var49 = class86.method670(var48, 3153952, true, var11.field420, 1, var11.field483[var40]);
                                                    }
                                                    if (class62.field1046) {
                                                        class31.field592[var12] = true;
                                                    }
                                                    if (var49 == null) {
                                                        class226.method1549(false, var11);
                                                    } else if (class144.field2622 == var11 && class4.field76 == var40) {
                                                        int var50 = class208.field3735 - class57.field957;
                                                        if (var50 < 5 && var50 > -5) {
                                                            var50 = 0;
                                                        }
                                                        int var51 = class7.field116 - class43.field733;
                                                        if (var51 < 5 && var51 > -5) {
                                                            var51 = 0;
                                                        }
                                                        if (class196.field3505 < 5) {
                                                            var50 = 0;
                                                            var51 = 0;
                                                        }
                                                        var49.method129(var43 + var51, var44 + var50, 128);
                                                        if (arg4 != -1) {
                                                            class24 var52 = arg3[arg4 & 0xFFFF];
                                                            int var53 = class262.field4565;
                                                            int var54 = class262.field4562;
                                                            if (var54 > var44 + var50 && var52.field412 > 0) {
                                                                int var55 = (var54 - var44 - var50) * class237.field4202 / 3;
                                                                if (class237.field4202 * 10 < var55) {
                                                                    var55 = class237.field4202 * 10;
                                                                }
                                                                if (var52.field412 < var55) {
                                                                    var55 = var52.field412;
                                                                }
                                                                var52.field412 -= var55;
                                                                class57.field957 += var55;
                                                                class226.method1549(false, var52);
                                                            }
                                                            if (var53 < (var50 + var44 + 32) && (var52.field350 - var52.field341) > var52.field412) {
                                                                int var56 = (var50 + var44 + 32 - var53) * class237.field4202 / 3;
                                                                if (class237.field4202 * 10 < var56) {
                                                                    var56 = class237.field4202 * 10;
                                                                }
                                                                if (var56 > var52.field350 - var52.field412 - var52.field341) {
                                                                    var56 = var52.field350 - var52.field341 - var52.field412;
                                                                }
                                                                class57.field957 -= var56;
                                                                var52.field412 += var56;
                                                                class226.method1549(false, var52);
                                                            }
                                                        }
                                                    } else if (class5.field81 == var11 && class119.field2235 == var40) {
                                                        var49.method129(var43, var44, 128);
                                                    } else {
                                                        var49.method119(var43, var44);
                                                    }
                                                }
                                            } else if (var11.field371 != null && var40 < 20) {
                                                class263 var45 = var11.method180(var40, true);
                                                if (var45 != null) {
                                                    var45.method119(var43, var44);
                                                } else if (class193.field3469) {
                                                    class226.method1549(false, var11);
                                                }
                                            }
                                            var40++;
                                        }
                                    }
                                } else if (var11.field485 == 3) {
                                    int var57;
                                    if (class269.method1799(var11, true)) {
                                        var57 = var11.field372;
                                        if (class216.field3831 == var11 && var11.field504 != 0) {
                                            var57 = var11.field504;
                                        }
                                    } else {
                                        var57 = var11.field344;
                                        if (class216.field3831 == var11 && var11.field398 != 0) {
                                            var57 = var11.field398;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var11.field431) {
                                            class262.method1762(var13, var14, var11.field468, var11.field341, var57);
                                        } else {
                                            class262.method1769(var13, var14, var11.field468, var11.field341, var57);
                                        }
                                    } else if (var11.field431) {
                                        class262.method1766(var13, var14, var11.field468, var11.field341, var57, 256 - (var15 & 0xFF));
                                    } else {
                                        class262.method1749(var13, var14, var11.field468, var11.field341, var57, 256 - (var15 & 0xFF));
                                    }
                                } else if (var11.field485 == 4) {
                                    class22 var58 = var11.method177(class74.field1313, (byte) 78);
                                    if (var58 != null) {
                                        class46 var59 = var11.field411;
                                        int var60;
                                        if (class269.method1799(var11, true)) {
                                            var60 = var11.field372;
                                            if (class216.field3831 == var11 && var11.field504 != 0) {
                                                var60 = var11.field504;
                                            }
                                            if (var11.field479.method314(119) > 0) {
                                                var59 = var11.field479;
                                            }
                                        } else {
                                            var60 = var11.field344;
                                            if (class216.field3831 == var11 && var11.field398 != 0) {
                                                var60 = var11.field398;
                                            }
                                        }
                                        if (var11.field480 && var11.field348 != -1) {
                                            class71 var61 = class80.method633(var11.field348, arg8 ^ 0x1);
                                            var59 = var61.field1213;
                                            if (var59 == null) {
                                                var59 = class194.field3478;
                                            }
                                            if ((var61.field1226 == 1 || var11.field355 != 1) && var11.field355 != -1) {
                                                var59 = class109.method855(0, new class46[] { class95.field1776, var59, class158.field2809, class189.method1371(var11.field355, -17060) });
                                            }
                                        }
                                        if (class1.field13 == var11) {
                                            var59 = class166.field2928;
                                            var60 = var11.field344;
                                        }
                                        if (!var11.field480) {
                                            var59 = class69.method502(arg8 ^ 0xFFFFFFFE, var11, var59);
                                        }
                                        var58.method152(var59, var13, var14, var11.field468, var11.field341, var60, var11.field397 ? 0 : -1, var11.field408, var11.field343, var11.field471);
                                    } else if (class193.field3469) {
                                        class226.method1549(false, var11);
                                    }
                                } else if (var11.field485 == 5) {
                                    if (var11.field480) {
                                        class263 var62;
                                        if (var11.field348 == -1) {
                                            var62 = var11.method172(-1903580442, false);
                                        } else {
                                            var62 = class86.method670(var11.field348, var11.field369, true, var11.field420, var11.field489, var11.field355);
                                        }
                                        if (var62 != null) {
                                            int var63 = var62.field4574;
                                            int var64 = var62.field4570;
                                            if (var11.field491) {
                                                int var65 = (var11.field468 - (1 - var63)) / var63;
                                                int var66 = (var11.field341 - (1 - var64)) / var64;
                                                class262.method1768(var13, var14, var11.field468 + var13, var11.field341 + var14);
                                                for (int var67 = 0; var67 < var65; var67++) {
                                                    for (int var68 = 0; var68 < var66; var68++) {
                                                        if (var11.field386 != 0) {
                                                            var62.method1776(var64 / 2 + var64 * var68 + var14, var11.field386, 4096, var63 * var67 + (var13 + (var63 / 2)), arg8 ^ 0x209EA4E5);
                                                        } else if (var15 == 0) {
                                                            var62.method119(var63 * var67 + var13, var64 * var68 + var14);
                                                        } else {
                                                            var62.method129(var63 * var67 + var13, var64 * var68 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class262.method1753(arg9, arg6, arg0, arg7);
                                            } else {
                                                int var69 = var11.field468 * 4096 / var63;
                                                if (var11.field386 != 0) {
                                                    var62.method1776(var11.field341 / 2 + var14, var11.field386, var69, var11.field468 / 2 + var13, 547267812);
                                                } else if (var15 != 0) {
                                                    var62.method118(var13, var14, var11.field468, var11.field341, 256 - (var15 & 0xFF));
                                                } else if (var11.field468 == var63 && var11.field341 == var64) {
                                                    var62.method119(var13, var14);
                                                } else {
                                                    var62.method115(var13, var14, var11.field468, var11.field341);
                                                }
                                            }
                                        } else if (class193.field3469) {
                                            class226.method1549(false, var11);
                                        }
                                    } else {
                                        class263 var70 = var11.method172(arg8 ^ 0x8E89AAE7, class269.method1799(var11, true));
                                        if (var70 != null) {
                                            var70.method119(var13, var14);
                                        } else if (class193.field3469) {
                                            class226.method1549(false, var11);
                                        }
                                    }
                                } else if (var11.field485 == 6) {
                                    boolean var71 = class269.method1799(var11, true);
                                    int var72;
                                    if (var71) {
                                        var72 = var11.field457;
                                    } else {
                                        var72 = var11.field352;
                                    }
                                    class36 var73 = null;
                                    int var74 = 0;
                                    if (var11.field348 != -1) {
                                        class71 var75 = class80.method633(var11.field348, 0);
                                        if (var75 != null) {
                                            class71 var76 = var75.method505(var11.field355, 74);
                                            class170 var77 = var72 == -1 ? null : class119.method951(0, var72);
                                            var73 = var76.method507(var77, var11.field434, 1, arg8 ^ 0x7D);
                                            if (var73 == null) {
                                                class226.method1549(false, var11);
                                            } else {
                                                var74 = -var73.method183() / 2;
                                            }
                                        }
                                    } else if (var11.field359 == 5) {
                                        if (var11.field486 == -1) {
                                            var73 = class199.field3565.method610(false, -1, -1, (class170) null, (class170) null);
                                        } else {
                                            int var79 = var11.field486 & 0x7FF;
                                            if (class114.field2158 == var79) {
                                                var79 = 2047;
                                            }
                                            class81 var80 = class1.field6[var79];
                                            class170 var81 = var72 == -1 ? null : class119.method951(0, var72);
                                            if (var80 != null && (int) var80.field1528.method349((byte) 59) << 11 == (var11.field486 & 0xFFFFF800)) {
                                                var73 = var80.field1527.method610(false, var11.field434, 0, var81, (class170) null);
                                            }
                                        }
                                    } else if (var72 == -1) {
                                        var73 = var11.method168(var71, 111, (class170) null, class277.field4824.field1527, -1);
                                        if (var73 == null && class193.field3469) {
                                            class226.method1549(false, var11);
                                        }
                                    } else {
                                        class170 var78 = class119.method951(0, var72);
                                        var73 = var11.method168(var71, 89, var78, class277.field4824.field1527, var11.field434);
                                        if (var73 == null && class193.field3469) {
                                            class226.method1549(false, var11);
                                        }
                                    }
                                    if (var73 != null) {
                                        int var82;
                                        if (var11.field410 <= 0) {
                                            var82 = 256;
                                        } else {
                                            var82 = (var11.field468 << 8) / var11.field410;
                                        }
                                        int var83;
                                        if (var11.field358 > 0) {
                                            var83 = (var11.field341 << 8) / var11.field358;
                                        } else {
                                            var83 = 256;
                                        }
                                        int var84 = (var11.field349 * var82 >> 8) + var11.field468 / 2 + var13;
                                        int var85 = (var11.field402 * var83 >> 8) + var11.field341 / 2 + var14;
                                        class62.method431(var84, var85);
                                        int var86 = class62.field1049[var11.field373] * var11.field345 >> 16;
                                        int var87 = class62.field1042[var11.field373] * var11.field345 >> 16;
                                        if (!var11.field480) {
                                            var73.method234(0, var11.field473, 0, var11.field373, 0, var87, var86);
                                        } else if (var11.field505) {
                                            ((class192) var73).method1391(0, var11.field473, var11.field475, var11.field373, var11.field445, var87 + var74 + var11.field413, var11.field413 + var86, var11.field345);
                                        } else {
                                            var73.method234(0, var11.field473, var11.field475, var11.field373, var11.field445, var74 + var87 + var11.field413, var11.field413 + var86);
                                        }
                                        class62.method434();
                                    }
                                } else {
                                    if (var11.field485 == 7) {
                                        class22 var88 = var11.method177(class74.field1313, (byte) -107);
                                        if (var88 == null) {
                                            if (class193.field3469) {
                                                class226.method1549(false, var11);
                                            }
                                            continue;
                                        }
                                        int var89 = 0;
                                        for (int var90 = 0; var90 < var11.field461; var90++) {
                                            for (int var91 = 0; var91 < var11.field467; var91++) {
                                                if (var11.field498[var89] > 0) {
                                                    class71 var92 = class80.method633(var11.field498[var89] - 1, 0);
                                                    class46 var93;
                                                    if (var92.field1226 != 1 && var11.field483[var89] == 1) {
                                                        var93 = class109.method855(0, new class46[] { class95.field1776, var92.field1213, class30.field581 });
                                                    } else {
                                                        var93 = class109.method855(0, new class46[] { class95.field1776, var92.field1213, class158.field2809, class189.method1371(var11.field483[var89], -17060) });
                                                    }
                                                    int var94 = (var11.field463 + 115) * var91 + var13;
                                                    int var95 = var14 + ((var11.field388 + 12) * var90);
                                                    if (var11.field408 == 0) {
                                                        var88.method148(var93, var94, var95, var11.field344, var11.field397 ? 0 : -1);
                                                    } else if (var11.field408 == 1) {
                                                        var88.method147(var93, var94 + 57, var95, var11.field344, var11.field397 ? 0 : -1);
                                                    } else {
                                                        var88.method139(var93, var94 + 115 - 1, var95, var11.field344, var11.field397 ? 0 : -1);
                                                    }
                                                }
                                                var89++;
                                            }
                                        }
                                    }
                                    if (var11.field485 == 8 && class83.field1589 == var11 && class267.field4626 == class154.field2727) {
                                        int var96 = 0;
                                        int var97 = 0;
                                        class46 var98 = var11.field411;
                                        class22 var99 = class261.field4547;
                                        class46 var100 = class69.method502(-1, var11, var98);
                                        while (var100.method314(arg8 ^ 0x6D) > 0) {
                                            int var108 = var100.method342(class105.field1886, arg8 ^ 0xFFFFE60A);
                                            class46 var109;
                                            if (var108 == -1) {
                                                var109 = var100;
                                                var100 = class85.field1613;
                                            } else {
                                                var109 = var100.method338(19551, var108, 0);
                                                var100 = var100.method339(var108 + 4, arg8 + 75);
                                            }
                                            int var110 = var99.method153(var109);
                                            var97 += var99.field280 + 1;
                                            if (var110 > var96) {
                                                var96 = var110;
                                            }
                                        }
                                        var96 += 6;
                                        var97 += 7;
                                        int var101 = var11.field468 + var13 - var96 - 5;
                                        if (var101 < (var13 + 5)) {
                                            var101 = var13 + 5;
                                        }
                                        if (arg0 < var96 + var101) {
                                            var101 = arg0 - var96;
                                        }
                                        int var102 = var11.field341 + var14 + 5;
                                        if (var97 + var102 > arg7) {
                                            var102 = arg7 - var97;
                                        }
                                        class262.method1762(var101, var102, var96, var97, 16777120);
                                        class262.method1769(var101, var102, var96, var97, 0);
                                        class46 var103 = var11.field411;
                                        int var104 = var99.field280 + var102 + 2;
                                        class46 var105 = class69.method502(-1, var11, var103);
                                        while (var105.method314(41) > 0) {
                                            int var106 = var105.method342(class105.field1886, -6645);
                                            class46 var107;
                                            if (var106 == -1) {
                                                var107 = var105;
                                                var105 = class85.field1613;
                                            } else {
                                                var107 = var105.method338(19551, var106, 0);
                                                var105 = var105.method339(var106 + 4, arg8 + -94);
                                            }
                                            var99.method148(var107, var101 + 3, var104, 0, -1);
                                            var104 += var99.field280 + 1;
                                        }
                                    }
                                    if (var11.field485 == 9) {
                                        int var111;
                                        int var112;
                                        int var113;
                                        int var114;
                                        if (var11.field363) {
                                            var111 = var11.field468 + var13;
                                            var112 = var14;
                                            var113 = var11.field341 + var14;
                                            var114 = var13;
                                        } else {
                                            var112 = var11.field341 + var14;
                                            var113 = var14;
                                            var114 = var13;
                                            var111 = var13 + var11.field468;
                                        }
                                        if (var11.field455 == 1) {
                                            class262.method1771(var114, var113, var111, var112, var11.field344);
                                        } else {
                                            class262.method1760(var114, var113, var111, var112, var11.field344, var11.field455);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "()V")
    public class124() {
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Lha;)V")
    public class124(class46 arg0) {
        this.field2289 = arg0;
    }
}
