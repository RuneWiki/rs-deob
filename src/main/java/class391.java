import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class391 {

    @OriginalMember(owner = "client!jl", name = "p", descriptor = "Lkc;")
    private class435 field5726 = new class435();

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "Ljava/lang/String;")
    public static String field5712 = "Choose Option";

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "[I")
    public static int[] field5716 = new int[5];

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "I")
    public static int field5711;

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "I")
    public static int field5713;

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "I")
    public static int field5714;

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "I")
    public static int field5715;

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "I")
    public static int field5717;

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "I")
    public static int field5718;

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "I")
    public static int field5719;

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "I")
    public static int field5720;

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "I")
    public static int field5721;

    @OriginalMember(owner = "client!jl", name = "m", descriptor = "I")
    public static int field5723;

    @OriginalMember(owner = "client!jl", name = "n", descriptor = "I")
    public static int field5724;

    @OriginalMember(owner = "client!jl", name = "o", descriptor = "I")
    public static int field5725;

    @OriginalMember(owner = "client!jl", name = "q", descriptor = "Lkc;")
    private class435 field5727;

    @OriginalMember(owner = "client!jl", name = "l", descriptor = "[I")
    public static int[] field5722;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILkc;)V", line = 6)
    public final void method2483(int arg0, class435 arg1) {
        field5721++;
        if (arg0 < 118) {
            field5722 = null;
        }
        if (arg1.field6344 != null) {
            arg1.method2731((byte) 104);
        }
        arg1.field6344 = this.field5726.field6344;
        arg1.field6348 = this.field5726;
        arg1.field6344.field6348 = arg1;
        arg1.field6348.field6344 = arg1;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)V", line = 27)
    public static final void method2484(byte arg0) {
        class13.field216.method2781(false, 174);
        class129.field2103++;
        if (arg0 == 2) {
            field5711++;
            class13.field216.method267(0, false);
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)Z", line = 42)
    public final boolean method2485(int arg0) {
        field5718++;
        if (arg0 > -24) {
            return true;
        } else {
            return this.field5726.field6348 == this.field5726;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)I", line = 53)
    public static final int method2486(int arg0, int arg1) {
        if (arg1 == 1808545736) {
            field5719++;
            return arg0 >>> 8;
        } else {
            return 80;
        }
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(I)Lkc;", line = 69)
    public final class435 method2487(int arg0) {
        field5717++;
        if (arg0 != 0) {
            method2493((byte) -79);
        }
        class435 var2 = this.field5727;
        if (this.field5726 == var2) {
            this.field5727 = null;
            return null;
        } else {
            this.field5727 = var2.field6348;
            return var2;
        }
    }

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "(I)Lkc;", line = 95)
    public final class435 method2488(int arg0) {
        field5715++;
        class435 var2 = this.field5726.field6348;
        if (arg0 != 2) {
            this.method2494(60);
        }
        if (this.field5726 == var2) {
            return null;
        } else {
            var2.method2731((byte) 87);
            return var2;
        }
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(B)Lkc;", line = 112)
    public final class435 method2489(byte arg0) {
        field5724++;
        int var2 = -97 % ((-arg0 - 4) / 40);
        class435 var3 = this.field5726.field6344;
        if (this.field5726 == var3) {
            this.field5727 = null;
            return null;
        } else {
            this.field5727 = var3.field6344;
            return var3;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lbr;Lsk;)V", line = 132)
    public static final void method2490(class348 arg0, class168 arg1) {
        if (!arg1.field2499) {
            return;
        }
        short var2 = arg1.field2495;
        short var3 = arg1.field2497;
        byte var4 = arg1.field2490;
        byte var5 = arg1.field2504;
        int var6 = (var2 << 7) + 64;
        int var7 = (var3 << 7) + 64;
        class168[][] var8 = class443.field6447[var4];
        float var10;
        if (class50.field816 == class18.field262) {
            int var9 = class28.field412[var2][var3];
            class73.field1222.method717(class311.field4527[0].method809(var6, var7), var9 & 0xFFFFFF, var9 >>> 21 & 0x7F8);
            var10 = 201.5F;
        } else {
            var10 = 201.5F - (float) (var5 + 1) * 50.0F;
        }
        class73.field1222.method693(3000.0F, var10 * 1.5F);
        if (arg1.field2511) {
            if (class182.field2689) {
                if (var4 > 0) {
                    class168 var11 = class443.field6447[var4 - 1][var2][var3];
                    if (var11 != null && var11.field2499) {
                        return;
                    }
                }
                if (var2 <= class415.field6013 && var2 > class175.field2608) {
                    class168 var12 = var8[var2 - 1][var3];
                    if (var12 != null && var12.field2499 && (var12.field2511 || (arg1.field2494 & 0x1) == 0)) {
                        return;
                    }
                }
                if (var2 >= class415.field6013 && var2 < class34.field491 - 1) {
                    class168 var13 = var8[var2 + 1][var3];
                    if (var13 != null && var13.field2499 && (var13.field2511 || (arg1.field2494 & 0x4) == 0)) {
                        return;
                    }
                }
                if (var3 <= class71.field1203 && var3 > class373.field5306) {
                    class168 var14 = var8[var2][var3 - 1];
                    if (var14 != null && var14.field2499 && (var14.field2511 || (arg1.field2494 & 0x8) == 0)) {
                        return;
                    }
                }
                if (var3 >= class71.field1203 && var3 < class187.field2778 - 1) {
                    class168 var15 = var8[var2][var3 + 1];
                    if (var15 != null && var15.field2499 && (var15.field2511 || (arg1.field2494 & 0x2) == 0)) {
                        return;
                    }
                }
            } else {
                class182.field2689 = true;
            }
            arg1.field2511 = false;
            if (arg1.field2498 != null) {
                class168 var16 = arg1.field2498;
                class73.field1222.method693(3000.0F, (201.5F - (float) (var16.field2504 + 1) * 50.0F) * 1.5F);
                if (!class78.method619(var16.field2504, var2, var3)) {
                    class50.field816[var16.field2504].method808(var2, var3);
                }
                class148 var17 = var16.field2505;
                if (var17 != null) {
                    if (class236.field3404) {
                        if ((var17.field2281 & arg1.field2502) == 0) {
                            class359.method2302(arg0, var4, var2, var3);
                        } else {
                            class58.method451(arg0, var17.field2281, var5, var2, var3);
                        }
                        class73.field1222.method755(arg0.field4927, arg0.field4925);
                    }
                    var17.method134((byte) 96, class73.field1222);
                }
                for (class36 var18 = var16.field2488; var18 != null; var18 = var18.field505) {
                    class447 var19 = var18.field511;
                    if (var19 != null) {
                        if (class236.field3404) {
                            class359.method2302(arg0, var4, var2, var3);
                            class73.field1222.method755(arg0.field4927, arg0.field4925);
                        }
                        var19.method134((byte) 107, class73.field1222);
                    }
                }
                class73.field1222.method693(3000.0F, var10 * 1.5F);
            }
            boolean var20 = !class78.method619(var5, var2, var3);
            if (var20) {
                class50.field816[var5].method808(var2, var3);
                class49 var21 = arg1.field2501;
                if (var21 != null && var21.field791) {
                    if (var21.field792) {
                        class73.field1222.method693(3000.0F, (var10 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class236.field3404) {
                        class359.method2302(arg0, var4, var2, var3);
                        class73.field1222.method755(arg0.field4927, arg0.field4925);
                    }
                    class69 var22 = var21.method134((byte) 100, class73.field1222);
                    if (var22 != null) {
                        var22.field1125 = var21;
                        var22.field1129 = var4;
                        var22.field1132 = var2;
                        var22.field1126 = var3;
                        class58.field937.method2483(126, var22);
                    }
                    if (var21.field792) {
                        class73.field1222.method693(3000.0F, var10 * 1.5F);
                    }
                }
            }
            int var23 = 0;
            int var24 = 0;
            class148 var25 = arg1.field2505;
            class350 var26 = arg1.field2506;
            if (var25 != null || var26 != null) {
                if (class415.field6013 == var2) {
                    var23++;
                } else if (class415.field6013 < var2) {
                    var23 += 2;
                }
                if (class71.field1203 == var3) {
                    var23 += 3;
                } else if (class71.field1203 > var3) {
                    var23 += 6;
                }
                var24 = class135.field2167[var23];
                arg1.field2502 = class37.field573[var23];
            }
            if (var25 != null) {
                if ((var25.field2281 & class217.field3194[var23]) == 0) {
                    arg1.field2509 = 0;
                } else if (var25.field2281 == 16) {
                    arg1.field2509 = 3;
                    arg1.field2503 = class342.field4849[var23];
                    arg1.field2500 = (byte) (3 - arg1.field2503);
                } else if (var25.field2281 == 32) {
                    arg1.field2509 = 6;
                    arg1.field2503 = class416.field6022[var23];
                    arg1.field2500 = (byte) (6 - arg1.field2503);
                } else if (var25.field2281 == 64) {
                    arg1.field2509 = 12;
                    arg1.field2503 = class36.field507[var23];
                    arg1.field2500 = (byte) (12 - arg1.field2503);
                } else {
                    arg1.field2509 = 9;
                    arg1.field2503 = class265.field3982[var23];
                    arg1.field2500 = (byte) (9 - arg1.field2503);
                }
                if ((var25.field2281 & var24) != 0 && !class141.method1131(var5, var2, var3, var25.field2281)) {
                    if (class236.field3404) {
                        class359.method2302(arg0, var4, var2, var3);
                        class73.field1222.method755(arg0.field4927, arg0.field4925);
                    }
                    class69 var27 = var25.method134((byte) 91, class73.field1222);
                    if (var27 != null) {
                        var27.field1125 = var25;
                        var27.field1129 = var4;
                        var27.field1132 = var2;
                        var27.field1126 = var3;
                        class58.field937.method2483(121, var27);
                    }
                }
                class148 var28 = arg1.field2510;
                if (var28 != null && (var28.field2281 & var24) != 0 && !class141.method1131(var5, var2, var3, var28.field2281)) {
                    if (class236.field3404) {
                        class359.method2302(arg0, var4, var2, var3);
                        class73.field1222.method755(arg0.field4927, arg0.field4925);
                    }
                    class69 var29 = var28.method134((byte) 91, class73.field1222);
                    if (var29 != null) {
                        var29.field1125 = var28;
                        var29.field1129 = var4;
                        var29.field1132 = var2;
                        var29.field1126 = var3;
                        class58.field937.method2483(127, var29);
                    }
                }
            }
            if (var26 != null && !class231.method1720(var5, var2, var3, var26.method1457(12124))) {
                class350 var30 = arg1.field2507;
                class73.field1222.method693(3000.0F, (var10 - 0.5F) * 1.5F);
                if ((var26.field4974 & var24) != 0) {
                    if (class236.field3404) {
                        class359.method2302(arg0, var4, var2, var3);
                        class73.field1222.method755(arg0.field4927, arg0.field4925);
                    }
                    class69 var31 = var26.method134((byte) 105, class73.field1222);
                    if (var31 != null) {
                        var31.field1125 = var26;
                        var31.field1129 = var4;
                        var31.field1132 = var2;
                        var31.field1126 = var3;
                        class58.field937.method2483(119, var31);
                    }
                } else if (var26.field4974 == 256) {
                    int var32 = var26.field4980 - class113.field1817;
                    int var33 = var26.field4975 - class389.field5579;
                    int var34 = var26.field4973;
                    int var35;
                    if (var34 == 1 || var34 == 2) {
                        var35 = -var32;
                    } else {
                        var35 = var32;
                    }
                    int var36;
                    if (var34 == 2 || var34 == 3) {
                        var36 = -var33;
                    } else {
                        var36 = var33;
                    }
                    if (class236.field3404) {
                        class359.method2302(arg0, var4, var2, var3);
                        class73.field1222.method755(arg0.field4927, arg0.field4925);
                    }
                    if (var36 < var35) {
                        class69 var37 = var26.method134((byte) 124, class73.field1222);
                        if (var37 != null) {
                            var37.field1125 = var26;
                            var37.field1129 = var4;
                            var37.field1132 = var2;
                            var37.field1126 = var3;
                            class58.field937.method2483(120, var37);
                        }
                    } else if (var30 != null) {
                        class69 var38 = var30.method134((byte) 92, class73.field1222);
                        if (var38 != null) {
                            var38.field1125 = var30;
                            var38.field1129 = var4;
                            var38.field1132 = var2;
                            var38.field1126 = var3;
                            class58.field937.method2483(121, var38);
                        }
                    }
                }
                class73.field1222.method693(3000.0F, var10 * 1.5F);
            }
            if (var20) {
                class49 var39 = arg1.field2501;
                if (var39 != null && !var39.field791) {
                    if (var39.field792) {
                        class73.field1222.method693(3000.0F, (var10 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class236.field3404) {
                        class359.method2302(arg0, var4, var2, var3);
                        class73.field1222.method755(arg0.field4927, arg0.field4925);
                    }
                    class69 var40 = var39.method134((byte) 92, class73.field1222);
                    if (var40 != null) {
                        var40.field1125 = var39;
                        var40.field1129 = var4;
                        var40.field1132 = var2;
                        var40.field1126 = var3;
                        class58.field937.method2483(119, var40);
                    }
                    if (var39.field792) {
                        class73.field1222.method693(3000.0F, var10 * 1.5F);
                    }
                }
                class7 var41 = arg1.field2493;
                if (var41 != null && !var41.field96) {
                    if (class236.field3404) {
                        class359.method2302(arg0, var4, var2, var3);
                        class73.field1222.method755(arg0.field4927, arg0.field4925);
                    }
                    class69 var42 = var41.method134((byte) 108, class73.field1222);
                    if (var42 != null) {
                        var42.field1125 = var41;
                        var42.field1129 = var4;
                        var42.field1132 = var2;
                        var42.field1126 = var3;
                        class58.field937.method2483(127, var42);
                    }
                }
            }
            byte var43 = arg1.field2494;
            if (var43 != 0) {
                if (var2 < class415.field6013 && (var43 & 0x4) != 0) {
                    class168 var44 = var8[var2 + 1][var3];
                    if (var44 != null && var44.field2499) {
                        class432.field6229.method463(var44, (byte) -4);
                    }
                }
                if (var3 < class71.field1203 && (var43 & 0x2) != 0) {
                    class168 var45 = var8[var2][var3 + 1];
                    if (var45 != null && var45.field2499) {
                        class432.field6229.method463(var45, (byte) -4);
                    }
                }
                if (var2 > class415.field6013 && (var43 & 0x1) != 0) {
                    class168 var46 = var8[var2 - 1][var3];
                    if (var46 != null && var46.field2499) {
                        class432.field6229.method463(var46, (byte) -4);
                    }
                }
                if (var3 > class71.field1203 && (var43 & 0x8) != 0) {
                    class168 var47 = var8[var2][var3 - 1];
                    if (var47 != null && var47.field2499) {
                        class432.field6229.method463(var47, (byte) -4);
                    }
                }
            }
        }
        if (arg1.field2509 != 0) {
            boolean var48 = true;
            for (class36 var49 = arg1.field2488; var49 != null; var49 = var49.field505) {
                if (class365.field5205 != var49.field511.field6505 && (var49.field510 & arg1.field2509) == arg1.field2503) {
                    var48 = false;
                    break;
                }
            }
            if (var48) {
                class148 var50 = arg1.field2505;
                if (!class141.method1131(var5, var2, var3, var50.field2281)) {
                    if (class236.field3404) {
                        label687: {
                            if (var50.field2281 >= 16) {
                                int var51 = var2 - class415.field6013;
                                int var52 = var3 - class71.field1203;
                                if (var50.field2281 == 16) {
                                    var51 -= 64;
                                    var52 += 64;
                                    if (var52 < var51 && var2 > 0 && var3 <= class436.field6353) {
                                        class359.method2302(arg0, var4, var2 - 1, var3 + 1);
                                        break label687;
                                    }
                                } else if (var50.field2281 == 32) {
                                    var51 += 64;
                                    var52 += 64;
                                    if (var52 < -var51 && var2 < class139.field2209 && var3 < class436.field6353) {
                                        class359.method2302(arg0, var4, var2 + 1, var3 + 1);
                                        break label687;
                                    }
                                } else if (var50.field2281 == 64) {
                                    var51 += 64;
                                    var52 -= 64;
                                    if (var52 > var51 && var2 < class139.field2209 && var3 > 0) {
                                        class359.method2302(arg0, var4, var2 + 1, var3 - 1);
                                        break label687;
                                    }
                                } else if (var50.field2281 == 128) {
                                    var51 -= 64;
                                    var52 -= 64;
                                    if (var52 > -var51 && var2 > 0 && var3 > 0) {
                                        class359.method2302(arg0, var4, var2 - 1, var3 - 1);
                                        break label687;
                                    }
                                }
                            }
                            class359.method2302(arg0, var4, var2, var3);
                        }
                        class73.field1222.method755(arg0.field4927, arg0.field4925);
                    }
                    class69 var53 = var50.method134((byte) 102, class73.field1222);
                    if (var53 != null) {
                        var53.field1125 = var50;
                        var53.field1129 = var4;
                        var53.field1132 = var2;
                        var53.field1126 = var3;
                        class58.field937.method2483(122, var53);
                    }
                }
                arg1.field2509 = 0;
            }
        }
        if (arg1.field2508) {
            try {
                arg1.field2508 = false;
                int var54 = 0;
                label630: for (class36 var55 = arg1.field2488; var55 != null; var55 = var55.field505) {
                    class447 var56 = var55.field511;
                    if (class365.field5205 != var56.field6505) {
                        for (int var57 = var56.field6526; var57 <= var56.field6504; var57++) {
                            for (int var58 = var56.field6513; var58 <= var56.field6508; var58++) {
                                class168 var59 = var8[var57][var58];
                                if (var59.field2511) {
                                    arg1.field2508 = true;
                                    continue label630;
                                }
                                if (var59.field2509 != 0) {
                                    int var60 = 0;
                                    if (var57 > var56.field6526) {
                                        var60++;
                                    }
                                    if (var57 < var56.field6504) {
                                        var60 += 4;
                                    }
                                    if (var58 > var56.field6513) {
                                        var60 += 8;
                                    }
                                    if (var58 < var56.field6508) {
                                        var60 += 2;
                                    }
                                    if ((var60 & var59.field2509) == arg1.field2500) {
                                        arg1.field2508 = true;
                                        continue label630;
                                    }
                                }
                            }
                        }
                        int var61 = class415.field6013 - var56.field6526;
                        int var62 = var56.field6504 - class415.field6013;
                        if (var62 > var61) {
                            var61 = var62;
                        }
                        int var63 = class71.field1203 - var56.field6513;
                        int var64 = var56.field6508 - class71.field1203;
                        if (var64 > var63) {
                            var63 = var64;
                        }
                        arg0.field4919[var54] = var56;
                        arg0.field4924[var54++] = var61 + var63;
                    }
                }
                while (var54 > 0) {
                    int var65 = -50;
                    int var66 = -1;
                    for (int var67 = 0; var67 < var54; var67++) {
                        class447 var68 = arg0.field4919[var67];
                        if (class365.field5205 != var68.field6505) {
                            int var69 = arg0.field4924[var67];
                            if (var69 > var65) {
                                var65 = var69;
                                var66 = var67;
                            } else if (var65 == var69) {
                                int var70 = var68.field6520 - class113.field1817;
                                int var71 = var68.field6519 - class389.field5579;
                                int var72 = arg0.field4919[var66].field6520 - class113.field1817;
                                int var73 = arg0.field4919[var66].field6519 - class389.field5579;
                                if (var70 * var70 + var71 * var71 > var72 * var72 + var73 * var73) {
                                    var66 = var67;
                                }
                            }
                        }
                    }
                    if (var66 == -1) {
                        break;
                    }
                    class447 var74 = arg0.field4919[var66];
                    var74.field6505 = class365.field5205;
                    if (!class79.method624(var5, var74.field6526, var74.field6504, var74.field6513, var74.field6508, var74.method136(0))) {
                        if (class236.field3404) {
                            if (var74.field6510 == 0) {
                                class58.method447(arg0, var4, var74.field6526, var74.field6513, var74.field6504, var74.field6508);
                            } else {
                                class359.method2302(arg0, var4, var2, var3);
                                int var75 = var2 - class415.field6013;
                                int var76 = var3 - class71.field1203;
                                if (var74.field6510 == 2) {
                                    if (var76 > -var75) {
                                        class338.method2191(arg0, var4, var2, var3 - 1, var2 - 1, var3);
                                    } else {
                                        class338.method2191(arg0, var4, var2, var3 + 1, var2 + 1, var3);
                                    }
                                } else if (var76 > var75) {
                                    class338.method2191(arg0, var4, var2, var3 - 1, var2 + 1, var3);
                                } else {
                                    class338.method2191(arg0, var4, var2, var3 + 1, var2 - 1, var3);
                                }
                            }
                            class73.field1222.method755(arg0.field4927, arg0.field4925);
                        }
                        class69 var77 = var74.method134((byte) 122, class73.field1222);
                        if (var77 != null) {
                            var77.field1125 = var74;
                            var77.field1129 = var4;
                            var77.field1132 = var74.field6526;
                            var77.field1126 = var74.field6513;
                            class58.field937.method2483(126, var77);
                        }
                    }
                    for (int var78 = var74.field6526; var78 <= var74.field6504; var78++) {
                        for (int var79 = var74.field6513; var79 <= var74.field6508; var79++) {
                            class168 var80 = var8[var78][var79];
                            if (var80.field2509 != 0) {
                                class432.field6229.method463(var80, (byte) -4);
                            } else if ((var2 != var78 || var3 != var79) && var80.field2499) {
                                class432.field6229.method463(var80, (byte) -4);
                            }
                        }
                    }
                }
                if (arg1.field2508) {
                    return;
                }
            } catch (Exception var113) {
                arg1.field2508 = false;
            }
        }
        if (arg1.field2496 != null) {
            if ((byte) (class373.field5291 & 0xFF) == arg1.field2492) {
                class30 var81 = arg1.field2496;
                int var82 = class50.field816[var4].method794(var2, var3);
                int var83;
                if (var4 < 3) {
                    var83 = class50.field816[var4].method794(var2, var3) - class50.field816[var4 + 1].method794(var2, var3);
                } else {
                    var83 = 1024;
                }
                class230.field3370.method1535(var6, var82, var7, arg0.field4922);
                int var84 = arg0.field4922[2];
                class230.field3370.method1535(var6, var82 - var83, var7, arg0.field4922);
                int var85 = arg0.field4922[2];
                int var86 = var84;
                int var87 = var85;
                if (var84 > var85) {
                    var86 = var85;
                    var87 = var84;
                }
                var86 -= 91;
                var87 += 91;
                if (var86 < var87 - 1597) {
                    var86 = var87 - 1597;
                }
                var81.field437 = var86;
                var81.field434 = var87;
                var81.field435 = true;
                class73.field1222.method753(var81);
            } else {
                arg1.field2496 = null;
            }
        }
        if (!arg1.field2499) {
            return;
        }
        if (arg1.field2509 != 0) {
            return;
        }
        if (var2 <= class415.field6013 && var2 > class175.field2608) {
            class168 var88 = var8[var2 - 1][var3];
            if (var88 != null && var88.field2499) {
                return;
            }
        }
        if (var2 >= class415.field6013 && var2 < class34.field491 - 1) {
            class168 var89 = var8[var2 + 1][var3];
            if (var89 != null && var89.field2499) {
                return;
            }
        }
        if (var3 <= class71.field1203 && var3 > class373.field5306) {
            class168 var90 = var8[var2][var3 - 1];
            if (var90 != null && var90.field2499) {
                return;
            }
        }
        if (var3 >= class71.field1203 && var3 < class187.field2778 - 1) {
            class168 var91 = var8[var2][var3 + 1];
            if (var91 != null && var91.field2499) {
                return;
            }
        }
        arg1.field2499 = false;
        class324.field4689--;
        class7 var92 = arg1.field2493;
        if (var92 != null && var92.field96) {
            if (class236.field3404) {
                class359.method2302(arg0, var4, var2, var3);
                class73.field1222.method755(arg0.field4927, arg0.field4925);
            }
            class69 var93 = var92.method134((byte) 124, class73.field1222);
            if (var93 != null) {
                var93.field1125 = var92;
                var93.field1129 = var4;
                var93.field1132 = var2;
                var93.field1126 = var3;
                class58.field937.method2483(127, var93);
            }
        }
        if (arg1.field2502 != 0) {
            class350 var94 = arg1.field2506;
            if (var94 != null && !class231.method1720(var5, var2, var3, var94.method1457(12124))) {
                if ((var94.field4974 & arg1.field2502) != 0) {
                    if (class236.field3404) {
                        class359.method2302(arg0, var4, var2, var3);
                        class73.field1222.method755(arg0.field4927, arg0.field4925);
                    }
                    class69 var95 = var94.method134((byte) 107, class73.field1222);
                    if (var95 != null) {
                        var95.field1125 = var94;
                        var95.field1129 = var4;
                        var95.field1132 = var2;
                        var95.field1126 = var3;
                        class58.field937.method2483(125, var95);
                    }
                } else if (var94.field4974 == 256) {
                    int var96 = var94.field4980 - class113.field1817;
                    int var97 = var94.field4975 - class389.field5579;
                    int var98 = var94.field4973;
                    int var99;
                    if (var98 == 1 || var98 == 2) {
                        var99 = -var96;
                    } else {
                        var99 = var96;
                    }
                    int var100;
                    if (var98 == 2 || var98 == 3) {
                        var100 = -var97;
                    } else {
                        var100 = var97;
                    }
                    if (class236.field3404) {
                        class359.method2302(arg0, var4, var2, var3);
                        class73.field1222.method755(arg0.field4927, arg0.field4925);
                    }
                    class350 var101 = arg1.field2507;
                    if (var100 > var99) {
                        class69 var102 = var94.method134((byte) 127, class73.field1222);
                        if (var102 != null) {
                            var102.field1125 = var94;
                            var102.field1129 = var4;
                            var102.field1132 = var2;
                            var102.field1126 = var3;
                            class58.field937.method2483(121, var102);
                        }
                    } else if (var101 != null) {
                        class69 var103 = var101.method134((byte) 117, class73.field1222);
                        if (var103 != null) {
                            var103.field1125 = var101;
                            var103.field1129 = var4;
                            var103.field1132 = var2;
                            var103.field1126 = var3;
                            class58.field937.method2483(122, var103);
                        }
                    }
                }
            }
            class148 var104 = arg1.field2505;
            class148 var105 = arg1.field2510;
            if (var105 != null && (var105.field2281 & arg1.field2502) != 0 && !class141.method1131(var5, var2, var3, var105.field2281)) {
                if (class236.field3404) {
                    class58.method451(arg0, var105.field2281, var4, var2, var3);
                    class73.field1222.method755(arg0.field4927, arg0.field4925);
                }
                class69 var106 = var105.method134((byte) 121, class73.field1222);
                if (var106 != null) {
                    var106.field1125 = var105;
                    var106.field1129 = var4;
                    var106.field1132 = var2;
                    var106.field1126 = var3;
                    class58.field937.method2483(124, var106);
                }
            }
            if (var104 != null && (var104.field2281 & arg1.field2502) != 0 && !class141.method1131(var5, var2, var3, var104.field2281)) {
                if (class236.field3404) {
                    class58.method451(arg0, var104.field2281, var4, var2, var3);
                    class73.field1222.method755(arg0.field4927, arg0.field4925);
                }
                class69 var107 = var104.method134((byte) 117, class73.field1222);
                if (var107 != null) {
                    var107.field1125 = var104;
                    var107.field1129 = var4;
                    var107.field1132 = var2;
                    var107.field1126 = var3;
                    class58.field937.method2483(123, var107);
                }
            }
        }
        if (var4 < class13.field218 - 1) {
            class168 var108 = class443.field6447[var4 + 1][var2][var3];
            if (var108 != null && var108.field2499) {
                class432.field6229.method475(101, var108);
            }
        }
        if (var2 < class415.field6013) {
            class168 var109 = var8[var2 + 1][var3];
            if (var109 != null && var109.field2499) {
                class432.field6229.method463(var109, (byte) -4);
            }
        }
        if (var3 < class71.field1203) {
            class168 var110 = var8[var2][var3 + 1];
            if (var110 != null && var110.field2499) {
                class432.field6229.method463(var110, (byte) -4);
            }
        }
        if (var2 > class415.field6013) {
            class168 var111 = var8[var2 - 1][var3];
            if (var111 != null && var111.field2499) {
                class432.field6229.method463(var111, (byte) -4);
            }
        }
        if (var3 > class71.field1203) {
            class168 var112 = var8[var2][var3 - 1];
            if (var112 != null && var112.field2499) {
                class432.field6229.method463(var112, (byte) -4);
            }
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lja;Z)V", line = 1258)
    public static final void method2491(class90 arg0, boolean arg1) {
        field5725++;
        if (class390.field5656 == class367.field5213 || class443.field6447 == null) {
            return;
        }
        if (class109.method959(class367.field5213, arg0, 20826)) {
            class390.field5656 = class367.field5213;
        }
        if (!arg1) {
            field5716 = null;
        }
    }

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "(B)V", line = 1280)
    public static final void method2492(byte arg0) {
        field5714++;
        class365 var1 = class193.field2851;
        synchronized (class193.field2851) {
            class157.field2401 = class152.field2320;
            class356.field5062++;
            if (class297.field4402 < 0) {
                for (int var2 = 0; var2 < 112; var2++) {
                    class33.field482[var2] = false;
                }
                class297.field4402 = client.field3641;
            } else {
                while (client.field3641 != class297.field4402) {
                    int var3 = class107.field1766[client.field3641];
                    client.field3641 = client.field3641 + 1 & 0x7F;
                    if (var3 >= 0) {
                        class33.field482[var3] = true;
                    } else {
                        class33.field482[~var3] = false;
                    }
                }
            }
            if (arg0 != 125) {
                field5716 = null;
            }
            class152.field2320 = class397.field5849;
        }
    }

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "(B)V", line = 1326)
    public static void method2493(byte arg0) {
        if (arg0 > 25) {
            field5712 = null;
            field5716 = null;
            field5722 = null;
        }
    }

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "(I)V", line = 1338)
    public final void method2494(int arg0) {
        if (arg0 != 0) {
            field5712 = null;
        }
        field5723++;
        while (true) {
            class435 var2 = this.field5726.field6348;
            if (this.field5726 == var2) {
                this.field5727 = null;
                return;
            }
            var2.method2731((byte) 93);
        }
    }

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "(I)I", line = 1367)
    public final int method2495(int arg0) {
        field5720++;
        int var2 = 0;
        if (arg0 == 1) {
            for (class435 var3 = this.field5726.field6348; var3 != this.field5726; var3 = var3.field6348) {
                var2++;
            }
            return var2;
        } else {
            return 31;
        }
    }

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "(I)Lkc;", line = 1389)
    public final class435 method2496(int arg0) {
        field5713++;
        class435 var2 = this.field5726.field6348;
        if (arg0 <= 41) {
            this.method2483(9, (class435) null);
        }
        if (this.field5726 == var2) {
            this.field5727 = null;
            return null;
        } else {
            this.field5727 = var2.field6348;
            return var2;
        }
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "()V", line = 1412)
    public class391() {
        this.field5726.field6348 = this.field5726;
        this.field5726.field6344 = this.field5726;
    }
}
