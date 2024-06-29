import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class166 {

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "Lig;")
    private class93 field3171;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "Lvd;")
    public static class222 field3170 = class212.method1357("Art", 10731);

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "[I")
    public static int[] field3169 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "[[B")
    public static byte[][] field3176 = new byte[1000][];

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "I")
    public static int field3178;

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)I")
    public static final int method1068(byte arg0) {
        int var1 = -37 % ((arg0 - 67) / 50);
        field3168++;
        int var2 = class71.method482(class110.field2059, class211.field3923, class217.field4036, (byte) 121);
        return var2 - class118.field2243 >= 800 || (class161.field3074[class217.field4036][class211.field3923 >> 7][class110.field2059 >> 7] & 0x4) == 0 ? 3 : class217.field4036;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Le;JI)V")
    public final void method1069(class44 arg0, long arg1, int arg2) {
        if (arg2 >= 9) {
            this.field3171.method593(arg1, new class91(arg0), (byte) -12);
            field3177++;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "([Lvd;[SB)V")
    public static final void method1070(class222[] arg0, short[] arg1, byte arg2) {
        field3179++;
        class69.method468(0, arg1, 0, arg0.length - 1, arg0);
        if (arg2 > -109) {
            method1075(null, -44);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(JB)Le;")
    public final class44 method1071(long arg0, byte arg1) {
        if (arg1 != 122) {
            method1068((byte) 70);
        }
        field3181++;
        class91 var4 = (class91) this.field3171.method601(arg0, 53);
        return var4 == null ? null : var4.field1718;
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(I)V")
    public class166(int arg0) {
        this.field3171 = new class93(arg0);
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(B)V")
    public final void method1072(byte arg0) {
        this.field3171.method596(false);
        field3174++;
        if (arg0 >= -14) {
            method1073((byte) 81, -117, -34, -100, -72, null, -71, 33, -29, 46);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BIIII[Lba;IIII)V")
    public static final void method1073(byte arg0, int arg1, int arg2, int arg3, int arg4, class13[] arg5, int arg6, int arg7, int arg8, int arg9) {
        class53.method396(arg6, arg9, arg4, arg7);
        class199.method1264();
        if (arg0 >= -26) {
            field3176 = null;
        }
        field3180++;
        for (int var10 = 0; var10 < arg5.length; var10++) {
            class13 var11 = arg5[var10];
            if (var11 != null && (var11.field238 == arg2 || arg2 == -1412584499 && class182.field3369 == var11)) {
                int var12;
                if (arg3 == -1) {
                    class122.field2340[class98.field1834] = var11.field236 + arg1;
                    class56.field1062[class98.field1834] = var11.field295 + arg8;
                    class214.field3982[class98.field1834] = var11.field341;
                    class121.field2285[class98.field1834] = var11.field245;
                    var12 = class98.field1834++;
                } else {
                    var12 = arg3;
                }
                var11.field268 = class175.field3280;
                var11.field248 = var12;
                if (!var11.field323 || !class155.method992(0, var11)) {
                    if (var11.field348 > 0) {
                        class167.method1080(var11, (byte) -113);
                    }
                    int var13 = var11.field236 + arg1;
                    int var14 = var11.field295 + arg8;
                    int var15 = var11.field228;
                    if (class168.field3211 && (class221.method1405(var11, (byte) -126) != 0 || var11.field365 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class182.field3369 == var11) {
                        if (arg2 != -1412584499 && !var11.field308) {
                            class32.field669 = arg8;
                            class172.field3233 = arg5;
                            class36.field787 = arg1;
                            continue;
                        }
                        if (class82.field1582 && class60.field1115) {
                            int var16 = class94.field1769;
                            int var17 = class137.field2651;
                            int var18 = var16 - class130.field2528;
                            if (var18 < class66.field1249) {
                                var18 = class66.field1249;
                            }
                            int var19 = var17 - class186.field3438;
                            if (class66.field1249 + class57.field1074.field341 < var18 - -var11.field341) {
                                var18 = class66.field1249 + class57.field1074.field341 - var11.field341;
                            }
                            if (var19 < class39.field867) {
                                var19 = class39.field867;
                            }
                            var13 = var18;
                            if (var11.field245 + var19 > class39.field867 - -class57.field1074.field245) {
                                var19 = class39.field867 + class57.field1074.field245 - var11.field245;
                            }
                            var14 = var19;
                        }
                        if (!var11.field308) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var23;
                    int var24;
                    int var25;
                    if (var11.field365 == 2) {
                        var25 = arg4;
                        var24 = arg7;
                        var20 = arg9;
                        var23 = arg6;
                    } else {
                        var20 = var14 <= arg9 ? arg9 : var14;
                        int var21 = var11.field245 + var14;
                        int var22 = var11.field341 + var13;
                        if (var11.field365 == 9) {
                            var21++;
                            var22++;
                        }
                        var23 = arg6 < var13 ? var13 : arg6;
                        var24 = var21 < arg7 ? var21 : arg7;
                        var25 = var22 >= arg4 ? arg4 : var22;
                    }
                    if (!var11.field323 || var25 > var23 && var20 < var24) {
                        if (var11.field348 != 0) {
                            if (var11.field348 == 1337) {
                                class230.field4329 = var14;
                                class73.field1454 = var13;
                                class162.method1021(115, var11.field245, var13, var11.field341, var14);
                                class53.method396(arg6, arg9, arg4, arg7);
                                continue;
                            }
                            if (var11.field348 == 1338) {
                                if (var11.method111(-121)) {
                                    class204.method1309(var11, var14, var12, var13, -110);
                                    class53.method396(arg6, arg9, arg4, arg7);
                                }
                                continue;
                            }
                            if (var11.field348 == 1339) {
                                if (var11.method111(-121)) {
                                    class140.method878(var14, var13, (byte) 97, var12, var11);
                                    class53.method396(arg6, arg9, arg4, arg7);
                                }
                                continue;
                            }
                            if (var11.field348 == 1400) {
                                class11.method103(var14, 16776960, var13, var11.field341, var11.field245);
                                class93.field1746[var12] = true;
                                class157.field3021[var12] = true;
                                class53.method396(arg6, arg9, arg4, arg7);
                            }
                            if (var11.field348 == 1401) {
                                class197.method1213(var13, var11.field341, var14, var11.field245, (byte) 100);
                                class93.field1746[var12] = true;
                                class157.field3021[var12] = true;
                                class53.method396(arg6, arg9, arg4, arg7);
                                continue;
                            }
                        }
                        int var26 = class94.field1769;
                        int var27 = class137.field2651;
                        if (!class38.field834 && var26 >= var23 && var20 <= var27 && var25 > var26 && var24 > var27) {
                            class126.method799(var27 - var14, -var13 + var26, var11, -32165);
                        }
                        if (var11.field365 == 0) {
                            if (!var11.field323 && class155.method992(0, var11) && class152.field2935 != var11) {
                                continue;
                            }
                            if (!var11.field323) {
                                if (var11.field314 > var11.field354 - var11.field245) {
                                    var11.field314 = var11.field354 - var11.field245;
                                }
                                if (var11.field314 < 0) {
                                    var11.field314 = 0;
                                }
                            }
                            method1073((byte) -46, var13 - var11.field316, var11.field269, var12, var25, arg5, var23, var24, var14 - var11.field314, var20);
                            if (var11.field307 != null) {
                                method1073((byte) -35, var13 - var11.field316, var11.field269, var12, var25, var11.field307, var23, var24, var14 - var11.field314, var20);
                            }
                            class21 var28 = (class21) class208.field3863.method1520((long) var11.field269, 120);
                            if (var28 != null) {
                                if (var28.field492 == 0 && class94.field1769 >= var23 && class137.field2651 >= var20 && var25 > class94.field1769 && var24 > class137.field2651 && !class38.field834 && !class168.field3211) {
                                    class131.field2535[0] = 1004;
                                    class172.field3227 = 1;
                                    class179.field3323[0] = class78.field1512;
                                    class72.field1434[0] = class29.field646;
                                }
                                class112.method725(var24, var12, var13, var23, -1810599263, var25, var14, var28.field493, var20);
                            }
                            class53.method396(arg6, arg9, arg4, arg7);
                            class199.method1264();
                        }
                        if (var11.field348 != 1400 && (class111.field2098[var12] || class197.field3600 > 1)) {
                            if (var11.field365 == 0 && !var11.field323 && var11.field354 > var11.field245) {
                                class165.method1060(var13 + var11.field341, (byte) -53, var11.field245, var11.field354, var11.field314, var14);
                            }
                            if (var11.field365 != 1) {
                                if (var11.field365 == 2) {
                                    int var29 = 0;
                                    for (int var30 = 0; var30 < var11.field312; var30++) {
                                        for (int var31 = 0; var31 < var11.field333; var31++) {
                                            int var32 = var13 + (var11.field273 + 32) * var31;
                                            int var33 = var14 + (var11.field234 + 32) * var30;
                                            if (var29 < 20) {
                                                var33 += var11.field352[var29];
                                                var32 += var11.field376[var29];
                                            }
                                            if (var11.field289[var29] > 0) {
                                                boolean var34 = false;
                                                boolean var35 = false;
                                                int var36 = var11.field289[var29] - 1;
                                                if (var32 + 32 > arg6 && var32 < arg4 && var33 + 32 > arg9 && var33 < arg7 || class173.field3242 == var11 && class159.field3036 == var29) {
                                                    class19 var37;
                                                    if (class214.field3979 == 1 && class54.field1022 == var29 && class173.field3252 == var11.field269) {
                                                        var37 = class55.method412(0, (byte) 71, var36, var11.field226[var29], false, false, var11.field338, 2);
                                                    } else {
                                                        var37 = class55.method412(3153952, (byte) 77, var36, var11.field226[var29], false, false, var11.field338, 1);
                                                    }
                                                    if (var37 == null) {
                                                        class80.method527(var11, 31702);
                                                    } else if (class173.field3242 == var11 && class159.field3036 == var29) {
                                                        int var38 = class94.field1769 - class128.field2489;
                                                        int var39 = class137.field2651 - class120.field2276;
                                                        if (var38 < 5 && var38 > -5) {
                                                            var38 = 0;
                                                        }
                                                        if (var39 < 5 && var39 > -5) {
                                                            var39 = 0;
                                                        }
                                                        if (class103.field1910 < 5) {
                                                            var38 = 0;
                                                            var39 = 0;
                                                        }
                                                        var37.method168(var32 + var38, var33 - -var39, 128);
                                                        if (arg2 != -1) {
                                                            class13 var40 = arg5[arg2 & 0xFFFF];
                                                            int var41 = class53.field1011;
                                                            int var42 = class53.field1008;
                                                            if (var33 + var39 < var42 && var40.field314 > 0) {
                                                                int var43 = (var42 - var39 - var33) * class121.field2305 / 3;
                                                                if (class121.field2305 * 10 < var43) {
                                                                    var43 = class121.field2305 * 10;
                                                                }
                                                                if (var40.field314 < var43) {
                                                                    var43 = var40.field314;
                                                                }
                                                                var40.field314 -= var43;
                                                                class120.field2276 += var43;
                                                                class80.method527(var40, 31702);
                                                            }
                                                            if (var33 + var39 + 32 > var41 && var40.field314 < var40.field354 - var40.field245) {
                                                                int var44 = (var33 + var39 + 32 - var41) * class121.field2305 / 3;
                                                                if (var44 > class121.field2305 * 10) {
                                                                    var44 = class121.field2305 * 10;
                                                                }
                                                                if (var44 > var40.field354 - var40.field245 - var40.field314) {
                                                                    var44 = var40.field354 - var40.field314 - var40.field245;
                                                                }
                                                                var40.field314 += var44;
                                                                class120.field2276 -= var44;
                                                                class80.method527(var40, 31702);
                                                            }
                                                        }
                                                    } else if (class204.field3796 == var11 && class132.field2564 == var29) {
                                                        var37.method168(var32, var33, 128);
                                                    } else {
                                                        var37.method163(var32, var33);
                                                    }
                                                }
                                            } else if (var11.field313 != null && var29 < 20) {
                                                class19 var45 = var11.method112(-65536, var29);
                                                if (var45 != null) {
                                                    var45.method163(var32, var33);
                                                } else if (class31.field661) {
                                                    class80.method527(var11, 31702);
                                                }
                                            }
                                            var29++;
                                        }
                                    }
                                } else if (var11.field365 == 3) {
                                    int var46;
                                    if (class54.method404((byte) -16, var11)) {
                                        var46 = var11.field331;
                                        if (class152.field2935 == var11 && var11.field292 != 0) {
                                            var46 = var11.field292;
                                        }
                                    } else {
                                        var46 = var11.field358;
                                        if (class152.field2935 == var11 && var11.field364 != 0) {
                                            var46 = var11.field364;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var11.field253) {
                                            class53.method399(var13, var14, var11.field341, var11.field245, var46);
                                        } else {
                                            class53.method401(var13, var14, var11.field341, var11.field245, var46);
                                        }
                                    } else if (var11.field253) {
                                        class53.method389(var13, var14, var11.field341, var11.field245, var46, 256 - (var15 & 0xFF));
                                    } else {
                                        class53.method402(var13, var14, var11.field341, var11.field245, var46, 256 - (var15 & 0xFF));
                                    }
                                } else if (var11.field365 == 4) {
                                    class178 var47 = var11.method106(class24.field552, (byte) 59);
                                    if (var47 != null) {
                                        class222 var48 = var11.field374;
                                        int var49;
                                        if (class54.method404((byte) -16, var11)) {
                                            var49 = var11.field331;
                                            if (class152.field2935 == var11 && var11.field292 != 0) {
                                                var49 = var11.field292;
                                            }
                                            if (var11.field288.method1444(-62) > 0) {
                                                var48 = var11.field288;
                                            }
                                        } else {
                                            var49 = var11.field358;
                                            if (class152.field2935 == var11 && var11.field364 != 0) {
                                                var49 = var11.field364;
                                            }
                                        }
                                        if (var11.field323 && var11.field335 != -1) {
                                            class204 var50 = class112.method728(var11.field335, (byte) -110);
                                            var48 = var50.field3777;
                                            if (var48 == null) {
                                                var48 = class218.field4049;
                                            }
                                            if ((var50.field3740 == 1 || var11.field347 != 1) && var11.field347 != -1) {
                                                var48 = class234.method1531(new class222[] { class108.field1992, var48, class105.field1936, class83.method542((byte) 119, var11.field347) }, -10949);
                                            }
                                        }
                                        if (class91.field1713 == var11) {
                                            var48 = class172.field3232;
                                            var49 = var11.field358;
                                        }
                                        if (!var11.field323) {
                                            var48 = class237.method1545(255, var11, var48);
                                        }
                                        var47.method911(var48, var13, var14, var11.field341, var11.field245, var49, var11.field324 ? 0 : -1, var11.field281, var11.field327, var11.field356);
                                    } else if (class31.field661) {
                                        class80.method527(var11, 31702);
                                    }
                                } else if (var11.field365 == 5) {
                                    if (var11.field323) {
                                        class19 var52;
                                        if (var11.field335 == -1) {
                                            var52 = var11.method115(1, false);
                                        } else {
                                            var52 = class55.method412(var11.field315, (byte) 118, var11.field335, var11.field347, false, false, var11.field338, var11.field239);
                                        }
                                        if (var52 != null) {
                                            int var53 = var52.field447;
                                            int var54 = var52.field444;
                                            if (var11.field321) {
                                                int var56 = (var53 + var11.field341 - 1) / var53;
                                                int var57 = (var54 + var11.field245 - 1) / var54;
                                                class53.method381(var13, var14, var11.field341 + var13, var11.field245 + var14);
                                                for (int var58 = 0; var58 < var56; var58++) {
                                                    for (int var59 = 0; var59 < var57; var59++) {
                                                        if (var11.field286 != 0) {
                                                            var52.method165(var53 * var58 + var53 / 2 + var13, var54 / 2 + var54 * var59 + var14, var11.field286, 4096);
                                                        } else if (var15 == 0) {
                                                            var52.method163(var53 * var58 + var13, var54 * var59 + var14);
                                                        } else {
                                                            var52.method168(var13 + var53 * var58, var54 * var59 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class53.method396(arg6, arg9, arg4, arg7);
                                            } else {
                                                int var55 = var11.field341 * 4096 / var53;
                                                if (var11.field286 != 0) {
                                                    var52.method165(var11.field341 / 2 + var13, var11.field245 / 2 + var14, var11.field286, var55);
                                                } else if (var15 != 0) {
                                                    var52.method176(var13, var14, var11.field341, var11.field245, 256 - (var15 & 0xFF));
                                                } else if (var11.field341 == var53 && var11.field245 == var54) {
                                                    var52.method163(var13, var14);
                                                } else {
                                                    var52.method180(var13, var14, var11.field341, var11.field245);
                                                }
                                            }
                                        } else if (class31.field661) {
                                            class80.method527(var11, 31702);
                                        }
                                    } else {
                                        class19 var51 = var11.method115(1, class54.method404((byte) -16, var11));
                                        if (var51 != null) {
                                            var51.method163(var13, var14);
                                        } else if (class31.field661) {
                                            class80.method527(var11, 31702);
                                        }
                                    }
                                } else if (var11.field365 == 6) {
                                    boolean var60 = class54.method404((byte) -16, var11);
                                    int var61;
                                    if (var60) {
                                        var61 = var11.field277;
                                    } else {
                                        var61 = var11.field340;
                                    }
                                    int var62 = 0;
                                    class49 var63 = null;
                                    if (var11.field335 != -1) {
                                        class204 var64 = class112.method728(var11.field335, (byte) -122);
                                        if (var64 != null) {
                                            class204 var65 = var64.method1311(var11.field347, -92);
                                            var63 = var65.method1318(null, 1, (byte) -103, 0);
                                            if (var63 == null) {
                                                class80.method527(var11, 31702);
                                            } else {
                                                var62 = -var63.method87() / 2;
                                            }
                                        }
                                    } else if (var11.field325 == 5) {
                                        if (var11.field224 == -1) {
                                            var63 = class132.field2548.method1477(-4806, -1, null, null, -1);
                                        } else {
                                            int var67 = var11.field224 & 0x7FF;
                                            if (class35.field773 == var67) {
                                                var67 = 2047;
                                            }
                                            class38 var68 = class54.field1024[var67];
                                            class183 var69 = var61 == -1 ? null : class93.method599((byte) -20, var61);
                                            if (var68 != null && (int) var68.field853.method1428(15109) << 11 == (var11.field224 & 0xFFFFF800)) {
                                                var63 = var68.field850.method1477(-4806, 0, null, var69, var11.field270);
                                            }
                                        }
                                    } else if (var61 == -1) {
                                        var63 = var11.method114(0, -1, class17.field432.field850, null, var60);
                                        if (var63 == null && class31.field661) {
                                            class80.method527(var11, 31702);
                                        }
                                    } else {
                                        class183 var66 = class93.method599((byte) -17, var61);
                                        var63 = var11.method114(0, var11.field270, class17.field432.field850, var66, var60);
                                        if (var63 == null && class31.field661) {
                                            class80.method527(var11, 31702);
                                        }
                                    }
                                    if (var63 != null) {
                                        int var70;
                                        if (var11.field283 <= 0) {
                                            var70 = 256;
                                        } else {
                                            var70 = (var11.field245 << 8) / var11.field283;
                                        }
                                        int var71 = (var11.field326 * var70 >> 8) + (var14 + (var11.field245 / 2));
                                        int var72;
                                        if (var11.field287 <= 0) {
                                            var72 = 256;
                                        } else {
                                            var72 = (var11.field341 << 8) / var11.field287;
                                        }
                                        int var73 = (var11.field293 * var72 >> 8) + var11.field341 / 2 + var13;
                                        class199.method1272(var73, var71);
                                        int var74 = class199.field3640[var11.field240] * var11.field334 >> 16;
                                        int var75 = class199.field3624[var11.field240] * var11.field334 >> 16;
                                        if (!var11.field323) {
                                            var63.method346(0, var11.field353, 0, var11.field240, 0, var74, var75);
                                        } else if (var11.field291) {
                                            ((class150) var63).method960(0, var11.field353, var11.field361, var11.field240, var11.field279, var74 + var62 + var11.field372, var11.field372 + var75, var11.field334);
                                        } else {
                                            var63.method346(0, var11.field353, var11.field361, var11.field240, var11.field279, var74 + var11.field372 + var62, var11.field372 + var75);
                                        }
                                        class199.method1258();
                                    }
                                } else {
                                    if (var11.field365 == 7) {
                                        class178 var76 = var11.method106(class24.field552, (byte) 59);
                                        if (var76 == null) {
                                            if (class31.field661) {
                                                class80.method527(var11, 31702);
                                            }
                                            continue;
                                        }
                                        int var77 = 0;
                                        for (int var78 = 0; var78 < var11.field312; var78++) {
                                            for (int var79 = 0; var79 < var11.field333; var79++) {
                                                if (var11.field289[var77] > 0) {
                                                    class204 var80 = class112.method728(var11.field289[var77] - 1, (byte) 103);
                                                    class222 var81;
                                                    if (var80.field3740 != 1 && var11.field226[var77] == 1) {
                                                        var81 = class234.method1531(new class222[] { class108.field1992, var80.field3777, class221.field4101 }, -10949);
                                                    } else {
                                                        var81 = class234.method1531(new class222[] { class108.field1992, var80.field3777, class105.field1936, class83.method542((byte) 127, var11.field226[var77]) }, -10949);
                                                    }
                                                    int var82 = (var11.field273 + 115) * var79 + var13;
                                                    int var83 = (var11.field234 + 12) * var78 + var14;
                                                    if (var11.field281 == 0) {
                                                        var76.method881(var81, var82, var83, var11.field358, var11.field324 ? 0 : -1);
                                                    } else if (var11.field281 == 1) {
                                                        var76.method889(var81, var82 + 57, var83, var11.field358, var11.field324 ? 0 : -1);
                                                    } else {
                                                        var76.method882(var81, var82 + 115 - 1, var83, var11.field358, var11.field324 ? 0 : -1);
                                                    }
                                                }
                                                var77++;
                                            }
                                        }
                                    }
                                    if (var11.field365 == 8 && class151.field2917 == var11 && class36.field782 == class197.field3581) {
                                        int var84 = 0;
                                        class222 var85 = var11.field374;
                                        class178 var86 = class91.field1717;
                                        class222 var87 = class237.method1545(255, var11, var85);
                                        int var88 = 0;
                                        while (var87.method1444(-117) > 0) {
                                            int var96 = var87.method1445(class128.field2495, (byte) 95);
                                            class222 var97;
                                            if (var96 == -1) {
                                                var97 = var87;
                                                var87 = class29.field646;
                                            } else {
                                                var97 = var87.method1419(var96, 2, 0);
                                                var87 = var87.method1443(21120, var96 + 4);
                                            }
                                            int var98 = var86.method900(var97);
                                            var88 += var86.field2734 + 1;
                                            if (var84 < var98) {
                                                var84 = var98;
                                            }
                                        }
                                        var84 += 6;
                                        int var89 = var13 + var11.field341 - var84 - 5;
                                        int var90 = var14 + var11.field245 + 5;
                                        if (var13 + 5 > var89) {
                                            var89 = var13 + 5;
                                        }
                                        var88 += 7;
                                        if (var84 + var89 > arg4) {
                                            var89 = arg4 - var84;
                                        }
                                        if (arg7 < var88 + var90) {
                                            var90 = arg7 - var88;
                                        }
                                        class53.method399(var89, var90, var84, var88, 16777120);
                                        class53.method401(var89, var90, var84, var88, 0);
                                        int var91 = var90 + var86.field2734 + 2;
                                        class222 var92 = var11.field374;
                                        class222 var93 = class237.method1545(255, var11, var92);
                                        while (var93.method1444(-45) > 0) {
                                            int var94 = var93.method1445(class128.field2495, (byte) 90);
                                            class222 var95;
                                            if (var94 == -1) {
                                                var95 = var93;
                                                var93 = class29.field646;
                                            } else {
                                                var95 = var93.method1419(var94, 2, 0);
                                                var93 = var93.method1443(21120, var94 + 4);
                                            }
                                            var86.method881(var95, var89 + 3, var91, 0, -1);
                                            var91 += var86.field2734 + 1;
                                        }
                                    }
                                    if (var11.field365 == 9) {
                                        int var99;
                                        int var100;
                                        int var101;
                                        int var102;
                                        if (var11.field235) {
                                            var102 = var13;
                                            var99 = var13 + var11.field341;
                                            var101 = var11.field245 + var14;
                                            var100 = var14;
                                        } else {
                                            var99 = var11.field341 + var13;
                                            var100 = var11.field245 + var14;
                                            var101 = var14;
                                            var102 = var13;
                                        }
                                        if (var11.field311 == 1) {
                                            class53.method403(var102, var101, var99, var100, var11.field358);
                                        } else {
                                            class53.method386(var102, var101, var99, var100, var11.field358, var11.field311);
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

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "(B)V")
    public static void method1074(byte arg0) {
        field3169 = null;
        if (arg0 >= -91) {
            method1074((byte) 9);
        }
        field3176 = null;
        field3170 = null;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "([[II)V")
    public static final void method1075(int[][] arg0, int arg1) {
        class156.field2981 = arg0;
        if (arg1 <= 30) {
            method1073((byte) 101, -45, 90, 81, 114, null, 68, 63, -40, 93);
        }
        field3167++;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IJ)V")
    public final void method1076(int arg0, long arg1) {
        field3178++;
        if (arg0 != -1) {
            field3172 = -10;
        }
        this.field3171.method598(arg1, (byte) -111);
    }
}
