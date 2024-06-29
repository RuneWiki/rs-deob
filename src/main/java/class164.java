import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class164 {

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "Lvf;")
    private static class265 field2978 = class87.method582(-46, "Close");

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "Lvf;")
    public static class265 field2985 = class87.method582(-46, "::clientdrop");

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "Lvf;")
    public static class265 field2977 = field2978;

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "Ldg;")
    public static class276 field2981 = new class276(64);

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "I")
    public static int field2984;

    @OriginalMember(owner = "client!ei", name = "j", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V")
    public static final void method1081(int arg0) {
        field2982++;
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < (class120.field2129 - 1); var2++) {
                if (class118.field2079[var2] < 1000 && class118.field2079[var2 + 1] > 1000) {
                    var1 = false;
                    class265 var3 = class40.field924[var2];
                    class40.field924[var2] = class40.field924[var2 + 1];
                    class40.field924[var2 + 1] = var3;
                    class265 var4 = class206.field3717[var2];
                    class206.field3717[var2] = class206.field3717[var2 + 1];
                    class206.field3717[var2 + 1] = var4;
                    int var5 = class1.field4[var2];
                    class1.field4[var2] = class1.field4[var2 + 1];
                    class1.field4[var2 + 1] = var5;
                    int var6 = class170.field3070[var2];
                    class170.field3070[var2] = class170.field3070[var2 + 1];
                    class170.field3070[var2 + 1] = var6;
                    int var7 = class206.field3714[var2];
                    class206.field3714[var2] = class206.field3714[var2 + 1];
                    class206.field3714[var2 + 1] = var7;
                    short var8 = class118.field2079[var2];
                    class118.field2079[var2] = class118.field2079[var2 + 1];
                    class118.field2079[var2 + 1] = var8;
                    long var9 = class101.field1795[var2];
                    class101.field1795[var2] = class101.field1795[var2 + 1];
                    class101.field1795[var2 + 1] = var9;
                }
            }
        }
        if (arg0 > -1) {
            field2984 = -76;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)I")
    public static final int method1082(int arg0, int arg1) {
        int var2 = 0;
        field2979++;
        if (arg0 < 0 || arg0 >= 65536) {
            var2 += 16;
            arg0 >>>= 0x10;
        }
        if (arg0 >= 256) {
            arg0 >>>= 0x8;
            var2 += 8;
        }
        if (arg0 >= 16) {
            var2 += 4;
            arg0 >>>= 0x4;
        }
        if (arg0 >= arg1) {
            var2 += 2;
            arg0 >>>= 0x2;
        }
        if (arg0 >= 1) {
            var2++;
            arg0 >>>= 0x1;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(ZIZIIIILjg;III)V")
    public static final void method1083(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, class257 arg7, int arg8, int arg9, int arg10) {
        field2983++;
        if (arg0 && !class231.method1561(25088) && (class230.field4064[0][arg6][arg10] & 0x2) == 0) {
            if ((class230.field4064[arg4][arg6][arg10] & 0x10) != 0) {
                return;
            }
            if (class166.method1090(arg6, true, arg4, arg10) != class58.field1181) {
                return;
            }
        }
        if (arg4 < class268.field4721) {
            class268.field4721 = arg4;
        }
        class130 var11 = class84.method574(62, arg1);
        int var12;
        int var13;
        if (arg9 == 1 || arg9 == 3) {
            var12 = var11.field2309;
            var13 = var11.field2328;
        } else {
            var12 = var11.field2328;
            var13 = var11.field2309;
        }
        int var14;
        int var15;
        if ((arg6 + var13) <= 104) {
            var14 = (var13 + 1 >> 1) + arg6;
            var15 = (var13 >> 1) + arg6;
        } else {
            var15 = arg6;
            var14 = arg6 + 1;
        }
        int var16;
        int var17;
        if (arg10 + var12 <= 104) {
            var16 = (var12 >> 1) + arg10;
            var17 = (var12 + 1 >> 1) + arg10;
        } else {
            var16 = arg10;
            var17 = arg10 + 1;
        }
        int[][] var18 = class279.field4936[arg8];
        int var19 = var18[var15][var16] - (-var18[var15][var17] - var18[var14][var17] - var18[var14][var16]) >> 2;
        int[][] var20 = null;
        if (arg2) {
            var20 = class83.field1557[0];
        } else if (arg8 < 3) {
            var20 = class279.field4936[arg8 + 1];
        }
        long var21 = (long) (arg10 << 7 | arg6 | arg5 << 14 | arg9 << 20 | 0x40000000);
        int var23 = (arg6 << 7) + (var13 << 6);
        if (var11.field2332 == 0 || arg2) {
            var21 |= Long.MIN_VALUE;
        }
        int var24 = (arg10 << 7) + (var12 << 6);
        if (var11.field2322 == 1) {
            var21 |= 0x400000L;
        }
        if (var11.field2280) {
            var21 |= 0x80000000L;
        }
        long var25 = var21 | (long) arg1 << 32;
        if (var11.method858(-1426259990)) {
            class10.method75(arg9, arg6, arg10, false, arg4, (class23) null, var11, (class122) null);
        }
        if (arg3 < 6) {
            method1085(73, 24, 42, -61, (class179) null, -19L, true);
        }
        boolean var27 = var11.field2323 & !arg2;
        if (arg5 == 22) {
            if (client.field3855 || var11.field2332 != 0 || var11.field2334 == 1 || var11.field2333) {
                class179 var29;
                if (var11.field2316 == -1 && var11.field2365 == null && !var11.field2311) {
                    class52 var28 = var11.method850(-22501, var18, var24, arg9, var23, 22, var20, arg0, var27, (class34) null, var19);
                    var29 = var28.field1084;
                } else {
                    var29 = new class167(arg1, 22, arg9, arg8, arg6, arg10, var11.field2316, var11.field2350, (class179) null);
                }
                method1085(arg4, arg6, arg10, var19, var29, var25, var11.field2330);
                if (var11.field2334 == 1 && arg7 != null) {
                    arg7.method1700(arg6, arg10, false);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class179 var69;
            if (var11.field2316 == -1 && var11.field2365 == null && !var11.field2311) {
                class52 var68 = var11.method850(-22501, var18, var24, arg5 == 11 ? arg9 + 4 : arg9, var23, 10, var20, arg0, var27, (class34) null, var19);
                var69 = var68.field1084;
            } else {
                var69 = new class167(arg1, 10, arg5 == 11 ? arg9 + 4 : arg9, arg8, arg6, arg10, var11.field2316, var11.field2350, (class179) null);
            }
            if (var69 != null) {
                boolean var70 = class52.method409(arg4, arg6, arg10, var19, var13, var12, var69, 0, var25);
                if (var11.field2321 && var70 && arg0) {
                    int var71 = 15;
                    if (var69 instanceof class235) {
                        var71 = ((class235) var69).method1263() / 4;
                        if (var71 > 30) {
                            var71 = 30;
                        }
                    }
                    for (int var72 = 0; var72 <= var13; var72++) {
                        for (int var73 = 0; var73 <= var12; var73++) {
                            if (var71 > class11.field385[arg4][arg6 + var72][arg10 + var73]) {
                                class11.field385[arg4][arg6 + var72][arg10 + var73] = (byte) var71;
                            }
                        }
                    }
                }
            }
            if (var11.field2334 != 0 && arg7 != null) {
                arg7.method1694(arg6, var13, arg10, var12, var11.field2326, (byte) -104);
            }
        } else if (arg5 >= 12) {
            class179 var31;
            if (var11.field2316 == -1 && var11.field2365 == null && !var11.field2311) {
                class52 var30 = var11.method850(-22501, var18, var24, arg9, var23, arg5, var20, arg0, var27, (class34) null, var19);
                var31 = var30.field1084;
            } else {
                var31 = new class167(arg1, arg5, arg9, arg8, arg6, arg10, var11.field2316, var11.field2350, (class179) null);
            }
            class52.method409(arg4, arg6, arg10, var19, 1, 1, var31, 0, var25);
            if (arg0 && arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg4 > 0) {
                class70.field1345[arg4][arg6][arg10] = class144.method992(class70.field1345[arg4][arg6][arg10], 4);
            }
            if (var11.field2334 != 0 && arg7 != null) {
                arg7.method1694(arg6, var13, arg10, var12, var11.field2326, (byte) -105);
            }
        } else if (arg5 == 0) {
            class179 var33;
            if (var11.field2316 == -1 && var11.field2365 == null && !var11.field2311) {
                class52 var32 = var11.method850(-22501, var18, var24, arg9, var23, 0, var20, arg0, var27, (class34) null, var19);
                var33 = var32.field1084;
            } else {
                var33 = new class167(arg1, 0, arg9, arg8, arg6, arg10, var11.field2316, var11.field2350, (class179) null);
            }
            class179.method1164(arg4, arg6, arg10, var19, var33, (class179) null, class113.field1982[arg9], 0, var25);
            if (arg0) {
                if (arg9 == 0) {
                    if (var11.field2321) {
                        class11.field385[arg4][arg6][arg10] = 50;
                        class11.field385[arg4][arg6][arg10 + 1] = 50;
                    }
                    if (var11.field2364) {
                        class70.field1345[arg4][arg6][arg10] = class144.method992(class70.field1345[arg4][arg6][arg10], 1);
                    }
                } else if (arg9 == 1) {
                    if (var11.field2321) {
                        class11.field385[arg4][arg6][arg10 + 1] = 50;
                        class11.field385[arg4][arg6 + 1][arg10 + 1] = 50;
                    }
                    if (var11.field2364) {
                        class70.field1345[arg4][arg6][arg10 + 1] = class144.method992(class70.field1345[arg4][arg6][arg10 + 1], 2);
                    }
                } else if (arg9 == 2) {
                    if (var11.field2321) {
                        class11.field385[arg4][arg6 + 1][arg10] = 50;
                        class11.field385[arg4][arg6 + 1][arg10 + 1] = 50;
                    }
                    if (var11.field2364) {
                        class70.field1345[arg4][arg6 + 1][arg10] = class144.method992(class70.field1345[arg4][arg6 + 1][arg10], 1);
                    }
                } else if (arg9 == 3) {
                    if (var11.field2321) {
                        class11.field385[arg4][arg6][arg10] = 50;
                        class11.field385[arg4][arg6 + 1][arg10] = 50;
                    }
                    if (var11.field2364) {
                        class70.field1345[arg4][arg6][arg10] = class144.method992(class70.field1345[arg4][arg6][arg10], 2);
                    }
                }
            }
            if (var11.field2334 != 0 && arg7 != null) {
                arg7.method1696(arg10, arg9, var11.field2326, arg6, (byte) -67, arg5);
            }
            if (var11.field2355 != 16) {
                class141.method974(arg4, arg6, arg10, var11.field2355);
            }
        } else if (arg5 == 1) {
            class179 var35;
            if (var11.field2316 == -1 && var11.field2365 == null && !var11.field2311) {
                class52 var34 = var11.method850(-22501, var18, var24, arg9, var23, 1, var20, arg0, var27, (class34) null, var19);
                var35 = var34.field1084;
            } else {
                var35 = new class167(arg1, 1, arg9, arg8, arg6, arg10, var11.field2316, var11.field2350, (class179) null);
            }
            class179.method1164(arg4, arg6, arg10, var19, var35, (class179) null, class55.field1132[arg9], 0, var25);
            if (var11.field2321 && arg0) {
                if (arg9 == 0) {
                    class11.field385[arg4][arg6][arg10 + 1] = 50;
                } else if (arg9 == 1) {
                    class11.field385[arg4][arg6 + 1][arg10 + 1] = 50;
                } else if (arg9 == 2) {
                    class11.field385[arg4][arg6 + 1][arg10] = 50;
                } else if (arg9 == 3) {
                    class11.field385[arg4][arg6][arg10] = 50;
                }
            }
            if (var11.field2334 != 0 && arg7 != null) {
                arg7.method1696(arg10, arg9, var11.field2326, arg6, (byte) -67, arg5);
            }
        } else if (arg5 == 2) {
            int var36 = arg9 + 1 & 0x3;
            class179 var38;
            class179 var40;
            if (var11.field2316 == -1 && var11.field2365 == null && !var11.field2311) {
                class52 var37 = var11.method850(-22501, var18, var24, arg9 + 4, var23, 2, var20, arg0, var27, (class34) null, var19);
                var38 = var37.field1084;
                class52 var39 = var11.method850(-22501, var18, var24, var36, var23, 2, var20, arg0, var27, (class34) null, var19);
                var40 = var39.field1084;
            } else {
                var38 = new class167(arg1, 2, arg9 + 4, arg8, arg6, arg10, var11.field2316, var11.field2350, (class179) null);
                var40 = new class167(arg1, 2, var36, arg8, arg6, arg10, var11.field2316, var11.field2350, (class179) null);
            }
            class179.method1164(arg4, arg6, arg10, var19, var38, var40, class113.field1982[arg9], class113.field1982[var36], var25);
            if (var11.field2364 && arg0) {
                if (arg9 == 0) {
                    class70.field1345[arg4][arg6][arg10] = class144.method992(class70.field1345[arg4][arg6][arg10], 1);
                    class70.field1345[arg4][arg6][arg10 + 1] = class144.method992(class70.field1345[arg4][arg6][arg10 + 1], 2);
                } else if (arg9 == 1) {
                    class70.field1345[arg4][arg6][arg10 + 1] = class144.method992(class70.field1345[arg4][arg6][arg10 + 1], 2);
                    class70.field1345[arg4][arg6 + 1][arg10] = class144.method992(class70.field1345[arg4][arg6 + 1][arg10], 1);
                } else if (arg9 == 2) {
                    class70.field1345[arg4][arg6 + 1][arg10] = class144.method992(class70.field1345[arg4][arg6 + 1][arg10], 1);
                    class70.field1345[arg4][arg6][arg10] = class144.method992(class70.field1345[arg4][arg6][arg10], 2);
                } else if (arg9 == 3) {
                    class70.field1345[arg4][arg6][arg10] = class144.method992(class70.field1345[arg4][arg6][arg10], 2);
                    class70.field1345[arg4][arg6][arg10] = class144.method992(class70.field1345[arg4][arg6][arg10], 1);
                }
            }
            if (var11.field2334 != 0 && arg7 != null) {
                arg7.method1696(arg10, arg9, var11.field2326, arg6, (byte) -67, arg5);
            }
            if (var11.field2355 != 16) {
                class141.method974(arg4, arg6, arg10, var11.field2355);
            }
        } else if (arg5 == 3) {
            class179 var42;
            if (var11.field2316 == -1 && var11.field2365 == null && !var11.field2311) {
                class52 var41 = var11.method850(-22501, var18, var24, arg9, var23, 3, var20, arg0, var27, (class34) null, var19);
                var42 = var41.field1084;
            } else {
                var42 = new class167(arg1, 3, arg9, arg8, arg6, arg10, var11.field2316, var11.field2350, (class179) null);
            }
            class179.method1164(arg4, arg6, arg10, var19, var42, (class179) null, class55.field1132[arg9], 0, var25);
            if (var11.field2321 && arg0) {
                if (arg9 == 0) {
                    class11.field385[arg4][arg6][arg10 + 1] = 50;
                } else if (arg9 == 1) {
                    class11.field385[arg4][arg6 + 1][arg10 + 1] = 50;
                } else if (arg9 == 2) {
                    class11.field385[arg4][arg6 + 1][arg10] = 50;
                } else if (arg9 == 3) {
                    class11.field385[arg4][arg6][arg10] = 50;
                }
            }
            if (var11.field2334 != 0 && arg7 != null) {
                arg7.method1696(arg10, arg9, var11.field2326, arg6, (byte) -67, arg5);
            }
        } else if (arg5 == 9) {
            class179 var44;
            if (var11.field2316 == -1 && var11.field2365 == null && !var11.field2311) {
                class52 var43 = var11.method850(-22501, var18, var24, arg9, var23, arg5, var20, arg0, var27, (class34) null, var19);
                var44 = var43.field1084;
            } else {
                var44 = new class167(arg1, arg5, arg9, arg8, arg6, arg10, var11.field2316, var11.field2350, (class179) null);
            }
            class52.method409(arg4, arg6, arg10, var19, 1, 1, var44, 0, var25);
            if (var11.field2334 != 0 && arg7 != null) {
                arg7.method1694(arg6, var13, arg10, var12, var11.field2326, (byte) -96);
            }
            if (var11.field2355 != 16) {
                class141.method974(arg4, arg6, arg10, var11.field2355);
            }
        } else if (arg5 == 4) {
            class179 var46;
            if (var11.field2316 == -1 && var11.field2365 == null && !var11.field2311) {
                class52 var45 = var11.method850(-22501, var18, var24, arg9, var23, 4, var20, arg0, var27, (class34) null, var19);
                var46 = var45.field1084;
            } else {
                var46 = new class167(arg1, 4, arg9, arg8, arg6, arg10, var11.field2316, var11.field2350, (class179) null);
            }
            class61.method455(arg4, arg6, arg10, var19, var46, (class179) null, class113.field1982[arg9], 0, 0, 0, var25);
        } else if (arg5 == 5) {
            int var47 = 16;
            long var48 = class72.method510(arg4, arg6, arg10);
            if (var48 != 0L) {
                var47 = class84.method574(-1, (int) (var48 >>> 32) & Integer.MAX_VALUE).field2355;
            }
            class179 var51;
            if (var11.field2316 == -1 && var11.field2365 == null && !var11.field2311) {
                class52 var50 = var11.method850(-22501, var18, var24, arg9, var23, 4, var20, arg0, var27, (class34) null, var19);
                var51 = var50.field1084;
            } else {
                var51 = new class167(arg1, 4, arg9, arg8, arg6, arg10, var11.field2316, var11.field2350, (class179) null);
            }
            class61.method455(arg4, arg6, arg10, var19, var51, (class179) null, class113.field1982[arg9], 0, class239.field4178[arg9] * var47, class253.field4351[arg9] * var47, var25);
        } else if (arg5 == 6) {
            int var52 = 8;
            long var53 = class72.method510(arg4, arg6, arg10);
            if (var53 != 0L) {
                var52 = class84.method574(-125, Integer.MAX_VALUE & (int) (var53 >>> 32)).field2355 / 2;
            }
            class179 var56;
            if (var11.field2316 == -1 && var11.field2365 == null && !var11.field2311) {
                class52 var55 = var11.method850(-22501, var18, var24, arg9 + 4, var23, 4, var20, arg0, var27, (class34) null, var19);
                var56 = var55.field1084;
            } else {
                var56 = new class167(arg1, 4, arg9 + 4, arg8, arg6, arg10, var11.field2316, var11.field2350, (class179) null);
            }
            class61.method455(arg4, arg6, arg10, var19, var56, (class179) null, 256, arg9, class243.field4247[arg9] * var52, class12.field389[arg9] * var52, var25);
        } else if (arg5 == 7) {
            int var57 = arg9 + 2 & 0x3;
            class179 var59;
            if (var11.field2316 == -1 && var11.field2365 == null && !var11.field2311) {
                class52 var58 = var11.method850(-22501, var18, var24, var57 + 4, var23, 4, var20, arg0, var27, (class34) null, var19);
                var59 = var58.field1084;
            } else {
                var59 = new class167(arg1, 4, var57 + 4, arg8, arg6, arg10, var11.field2316, var11.field2350, (class179) null);
            }
            class61.method455(arg4, arg6, arg10, var19, var59, (class179) null, 256, var57, 0, 0, var25);
        } else if (arg5 == 8) {
            int var60 = 8;
            long var61 = class72.method510(arg4, arg6, arg10);
            if (var61 != 0L) {
                var60 = class84.method574(-124, Integer.MAX_VALUE & (int) (var61 >>> 32)).field2355 / 2;
            }
            int var63 = arg9 + 2 & 0x3;
            class179 var65;
            class179 var67;
            if (var11.field2316 == -1 && var11.field2365 == null && !var11.field2311) {
                class52 var64 = var11.method850(-22501, var18, var24, arg9 + 4, var23, 4, var20, arg0, var27, (class34) null, var19);
                var65 = var64.field1084;
                class52 var66 = var11.method850(-22501, var18, var24, var63 + 4, var23, 4, var20, arg0, var27, (class34) null, var19);
                var67 = var66.field1084;
            } else {
                var65 = new class167(arg1, 4, arg9 + 4, arg8, arg6, arg10, var11.field2316, var11.field2350, (class179) null);
                var67 = new class167(arg1, 4, var63 + 4, arg8, arg6, arg10, var11.field2316, var11.field2350, (class179) null);
            }
            class61.method455(arg4, arg6, arg10, var19, var65, var67, 256, arg9, class243.field4247[arg9] * var60, class12.field389[arg9] * var60, var25);
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(III)V")
    public static final void method1084(int arg0, int arg1, int arg2) {
        field2986++;
        class178 var3 = class188.method1282(arg2, arg1, 261360480);
        var3.method1162(true);
        var3.field3172 = arg0;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIILdk;JZ)V")
    private static final void method1085(int arg0, int arg1, int arg2, int arg3, class179 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class8 var8 = new class8();
        var8.field270 = arg4;
        var8.field280 = arg1 * 128 + 64;
        var8.field277 = arg2 * 128 + 64;
        var8.field269 = arg3;
        var8.field266 = arg5;
        if (class200.field3577[arg0][arg1][arg2] == null) {
            class200.field3577[arg0][arg1][arg2] = new class137(arg0, arg1, arg2);
        }
        class200.field3577[arg0][arg1][arg2].field2501 = var8;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(BLfl;)V")
    public static final void method1086(byte arg0, class192 arg1) {
        class113.field1983 = arg1;
        if (arg0 >= -10) {
            field2981 = null;
        }
        field2980++;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Z)V")
    public static void method1087(boolean arg0) {
        field2981 = null;
        field2977 = null;
        field2978 = null;
        if (arg0) {
            field2984 = -117;
        }
        field2985 = null;
    }
}
