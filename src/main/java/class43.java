import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class43 {

    @OriginalMember(owner = "client!mf", name = "q", descriptor = "[I")
    private int[] field886;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "[I")
    private int[] field876;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "[I")
    public static int[] field879 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
    public static int field875 = 100;

    @OriginalMember(owner = "client!mf", name = "o", descriptor = "I")
    public static int field884 = 0;

    @OriginalMember(owner = "client!mf", name = "p", descriptor = "F")
    public static float field885;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "I")
    private int field880;

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "I")
    private int field882;

    @OriginalMember(owner = "client!mf", name = "n", descriptor = "I")
    private int field883;

    @OriginalMember(owner = "client!mf", name = "r", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!mf", name = "s", descriptor = "I")
    private int field888;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "Lem;")
    public static class10 field870;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z)I", line = 6)
    public final int method295(boolean arg0) {
        if (arg0) {
            method300(-81);
        }
        field874++;
        if ((this.field883--) == 0) {
            this.method298(255);
            this.field883 = 255;
        }
        return this.field886[this.field883];
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIBZIIIIZLid;I)V", line = 26)
    public static final void method296(int arg0, int arg1, byte arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, class249 arg9, int arg10) {
        field871++;
        if (arg8 && !class117.method702(true) && (class301.field5117[0][arg6][arg0] & 0x2) == 0) {
            if ((class301.field5117[arg4][arg6][arg0] & 0x10) != 0) {
                return;
            }
            if (class287.method1979(arg4, arg0, (byte) -106, arg6) != class281.field4855) {
                return;
            }
        }
        if (class50.field986 > arg4) {
            class50.field986 = arg4;
        }
        class38 var11 = class239.method1629((byte) -57, arg10);
        if (class247.field4247 && var11.field790) {
            return;
        }
        int var12;
        int var13;
        if (arg1 == 1 || arg1 == 3) {
            var12 = var11.field778;
            var13 = var11.field758;
        } else {
            var12 = var11.field758;
            var13 = var11.field778;
        }
        int var14;
        int var15;
        if (arg6 + var12 <= 104) {
            var14 = arg6 + (var12 + 1 >> 1);
            var15 = (var12 >> 1) + arg6;
        } else {
            var14 = arg6 + 1;
            var15 = arg6;
        }
        int var16;
        int var17;
        if (arg0 + var13 <= 104) {
            var16 = (var13 + 1 >> 1) + arg0;
            var17 = (var13 >> 1) + arg0;
        } else {
            var16 = arg0 + 1;
            var17 = arg0;
        }
        int[][] var18 = class250.field4334[arg7];
        int var19 = (arg6 << 7) + (var12 << 6);
        int var20 = (arg0 << 7) + (var13 << 6);
        int var21 = var18[var15][var17] - (-var18[var14][var16] - var18[var15][var16] - var18[var14][var17]) >> 2;
        int var22 = 0;
        if (class247.field4247 && arg7 != 0) {
            int[][] var23 = class250.field4334[0];
            var22 = var21 - (var23[var15][var17] + var23[var14][var17] - (-var23[var15][var16] - var23[var14][var16]) >> 2);
        }
        int[][] var24 = (int[][]) null;
        if (arg3) {
            var24 = class267.field4626[0];
        } else if (arg7 < 3) {
            var24 = class250.field4334[arg7 + 1];
        }
        long var25 = (long) (arg1 << 20 | arg0 << 7 | arg6 | arg5 << 14 | 0x40000000);
        if (var11.field795 == 0 || arg3) {
            var25 |= Long.MIN_VALUE;
        }
        if (var11.field820 == 1) {
            var25 |= 0x400000L;
        }
        if (var11.field809) {
            var25 |= 0x80000000L;
        }
        long var27 = var25 | (long) arg10 << 32;
        if (var11.method248(0)) {
            class267.method1864(arg6, var11, arg1, (class123) null, (class115) null, 0, arg4, arg0);
        }
        boolean var29 = var11.field806 & !arg3;
        if (arg5 != 22) {
            if (arg2 >= -30) {
                method296(31, 79, (byte) -108, false, -93, 60, -62, 121, true, (class249) null, 9);
            }
            if (arg5 == 10 || arg5 == 11) {
                class226 var71;
                if (var11.field783 == -1 && var11.field817 == null) {
                    class285 var70 = var11.method262(var21, arg5 == 11 ? arg1 + 4 : arg1, (class127) null, var18, arg8, 10, var20, 126, var24, var19, var29);
                    if (class247.field4247 && var29) {
                        class312.method2125(var70.field4892, var19, var22, var20);
                    }
                    var71 = var70.field4893;
                } else {
                    var71 = new class271(arg10, 10, arg5 == 11 ? arg1 + 4 : arg1, arg7, arg6, arg0, var11.field783, var11.field801, (class226) null);
                }
                if (var71 != null) {
                    boolean var72 = class196.method1367(arg4, arg6, arg0, var21, var12, var13, var71, 0, var27);
                    if (var11.field761 && var72 && arg8) {
                        int var73 = 15;
                        if (var71 instanceof class60) {
                            var73 = ((class60) var71).method211() / 4;
                            if (var73 > 30) {
                                var73 = 30;
                            }
                        }
                        for (int var74 = 0; var74 <= var12; var74++) {
                            for (int var75 = 0; var75 <= var13; var75++) {
                                if (class252.field4355[arg4][arg6 + var74][arg0 + var75] < var73) {
                                    class252.field4355[arg4][arg6 + var74][arg0 + var75] = (byte) var73;
                                }
                            }
                        }
                    }
                }
                if (var11.field813 != 0 && arg9 != null) {
                    arg9.method1740(var11.field807, (byte) -51, var13, var12, arg0, arg6);
                }
            } else if (arg5 >= 12) {
                class226 var31;
                if (var11.field783 == -1 && var11.field817 == null) {
                    class285 var30 = var11.method262(var21, arg1, (class127) null, var18, arg8, arg5, var20, 126, var24, var19, var29);
                    if (class247.field4247 && var29) {
                        class312.method2125(var30.field4892, var19, var22, var20);
                    }
                    var31 = var30.field4893;
                } else {
                    var31 = new class271(arg10, arg5, arg1, arg7, arg6, arg0, var11.field783, var11.field801, (class226) null);
                }
                class196.method1367(arg4, arg6, arg0, var21, 1, 1, var31, 0, var27);
                if (arg8 && arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg4 > 0) {
                    class4.field80[arg4][arg6][arg0] = class279.method1951(class4.field80[arg4][arg6][arg0], 4);
                }
                if (var11.field813 != 0 && arg9 != null) {
                    arg9.method1740(var11.field807, (byte) -51, var13, var12, arg0, arg6);
                }
            } else if (arg5 == 0) {
                class226 var69;
                if (var11.field783 == -1 && var11.field817 == null) {
                    class285 var68 = var11.method262(var21, arg1, (class127) null, var18, arg8, 0, var20, 126, var24, var19, var29);
                    if (class247.field4247 && var29) {
                        class312.method2125(var68.field4892, var19, var22, var20);
                    }
                    var69 = var68.field4893;
                } else {
                    var69 = new class271(arg10, 0, arg1, arg7, arg6, arg0, var11.field783, var11.field801, (class226) null);
                }
                class192.method1290(arg4, arg6, arg0, var21, var69, (class226) null, class259.field4482[arg1], 0, var27);
                if (arg8) {
                    if (arg1 == 0) {
                        if (var11.field761) {
                            class252.field4355[arg4][arg6][arg0] = 50;
                            class252.field4355[arg4][arg6][arg0 + 1] = 50;
                        }
                        if (var11.field776) {
                            class4.field80[arg4][arg6][arg0] = class279.method1951(class4.field80[arg4][arg6][arg0], 1);
                        }
                    } else if (arg1 == 1) {
                        if (var11.field761) {
                            class252.field4355[arg4][arg6][arg0 + 1] = 50;
                            class252.field4355[arg4][arg6 + 1][arg0 + 1] = 50;
                        }
                        if (var11.field776) {
                            class4.field80[arg4][arg6][arg0 + 1] = class279.method1951(class4.field80[arg4][arg6][arg0 + 1], 2);
                        }
                    } else if (arg1 == 2) {
                        if (var11.field761) {
                            class252.field4355[arg4][arg6 + 1][arg0] = 50;
                            class252.field4355[arg4][arg6 + 1][arg0 + 1] = 50;
                        }
                        if (var11.field776) {
                            class4.field80[arg4][arg6 + 1][arg0] = class279.method1951(class4.field80[arg4][arg6 + 1][arg0], 1);
                        }
                    } else if (arg1 == 3) {
                        if (var11.field761) {
                            class252.field4355[arg4][arg6][arg0] = 50;
                            class252.field4355[arg4][arg6 + 1][arg0] = 50;
                        }
                        if (var11.field776) {
                            class4.field80[arg4][arg6][arg0] = class279.method1951(class4.field80[arg4][arg6][arg0], 2);
                        }
                    }
                }
                if (var11.field813 != 0 && arg9 != null) {
                    arg9.method1738(arg1, arg5, arg0, var11.field807, (byte) -64, arg6);
                }
                if (var11.field794 != 16) {
                    class1.method1(arg4, arg6, arg0, var11.field794);
                }
            } else if (arg5 == 1) {
                class226 var33;
                if (var11.field783 == -1 && var11.field817 == null) {
                    class285 var32 = var11.method262(var21, arg1, (class127) null, var18, arg8, 1, var20, 126, var24, var19, var29);
                    if (class247.field4247 && var29) {
                        class312.method2125(var32.field4892, var19, var22, var20);
                    }
                    var33 = var32.field4893;
                } else {
                    var33 = new class271(arg10, 1, arg1, arg7, arg6, arg0, var11.field783, var11.field801, (class226) null);
                }
                class192.method1290(arg4, arg6, arg0, var21, var33, (class226) null, class27.field585[arg1], 0, var27);
                if (var11.field761 && arg8) {
                    if (arg1 == 0) {
                        class252.field4355[arg4][arg6][arg0 + 1] = 50;
                    } else if (arg1 == 1) {
                        class252.field4355[arg4][arg6 + 1][arg0 + 1] = 50;
                    } else if (arg1 == 2) {
                        class252.field4355[arg4][arg6 + 1][arg0] = 50;
                    } else if (arg1 == 3) {
                        class252.field4355[arg4][arg6][arg0] = 50;
                    }
                }
                if (var11.field813 != 0 && arg9 != null) {
                    arg9.method1738(arg1, arg5, arg0, var11.field807, (byte) -64, arg6);
                }
            } else if (arg5 == 2) {
                int var63 = arg1 + 1 & 0x3;
                class226 var65;
                class226 var67;
                if (var11.field783 == -1 && var11.field817 == null) {
                    class285 var64 = var11.method262(var21, arg1 + 4, (class127) null, var18, arg8, 2, var20, 127, var24, var19, var29);
                    if (class247.field4247 && var29) {
                        class312.method2125(var64.field4892, var19, var22, var20);
                    }
                    var65 = var64.field4893;
                    class285 var66 = var11.method262(var21, var63, (class127) null, var18, arg8, 2, var20, -45, var24, var19, var29);
                    if (class247.field4247 && var29) {
                        class312.method2125(var66.field4892, var19, var22, var20);
                    }
                    var67 = var66.field4893;
                } else {
                    var65 = new class271(arg10, 2, arg1 + 4, arg7, arg6, arg0, var11.field783, var11.field801, (class226) null);
                    var67 = new class271(arg10, 2, var63, arg7, arg6, arg0, var11.field783, var11.field801, (class226) null);
                }
                class192.method1290(arg4, arg6, arg0, var21, var65, var67, class259.field4482[arg1], class259.field4482[var63], var27);
                if (var11.field776 && arg8) {
                    if (arg1 == 0) {
                        class4.field80[arg4][arg6][arg0] = class279.method1951(class4.field80[arg4][arg6][arg0], 1);
                        class4.field80[arg4][arg6][arg0 + 1] = class279.method1951(class4.field80[arg4][arg6][arg0 + 1], 2);
                    } else if (arg1 == 1) {
                        class4.field80[arg4][arg6][arg0 + 1] = class279.method1951(class4.field80[arg4][arg6][arg0 + 1], 2);
                        class4.field80[arg4][arg6 + 1][arg0] = class279.method1951(class4.field80[arg4][arg6 + 1][arg0], 1);
                    } else if (arg1 == 2) {
                        class4.field80[arg4][arg6 + 1][arg0] = class279.method1951(class4.field80[arg4][arg6 + 1][arg0], 1);
                        class4.field80[arg4][arg6][arg0] = class279.method1951(class4.field80[arg4][arg6][arg0], 2);
                    } else if (arg1 == 3) {
                        class4.field80[arg4][arg6][arg0] = class279.method1951(class4.field80[arg4][arg6][arg0], 2);
                        class4.field80[arg4][arg6][arg0] = class279.method1951(class4.field80[arg4][arg6][arg0], 1);
                    }
                }
                if (var11.field813 != 0 && arg9 != null) {
                    arg9.method1738(arg1, arg5, arg0, var11.field807, (byte) -64, arg6);
                }
                if (var11.field794 != 16) {
                    class1.method1(arg4, arg6, arg0, var11.field794);
                }
            } else if (arg5 == 3) {
                class226 var62;
                if (var11.field783 == -1 && var11.field817 == null) {
                    class285 var61 = var11.method262(var21, arg1, (class127) null, var18, arg8, 3, var20, 17, var24, var19, var29);
                    if (class247.field4247 && var29) {
                        class312.method2125(var61.field4892, var19, var22, var20);
                    }
                    var62 = var61.field4893;
                } else {
                    var62 = new class271(arg10, 3, arg1, arg7, arg6, arg0, var11.field783, var11.field801, (class226) null);
                }
                class192.method1290(arg4, arg6, arg0, var21, var62, (class226) null, class27.field585[arg1], 0, var27);
                if (var11.field761 && arg8) {
                    if (arg1 == 0) {
                        class252.field4355[arg4][arg6][arg0 + 1] = 50;
                    } else if (arg1 == 1) {
                        class252.field4355[arg4][arg6 + 1][arg0 + 1] = 50;
                    } else if (arg1 == 2) {
                        class252.field4355[arg4][arg6 + 1][arg0] = 50;
                    } else if (arg1 == 3) {
                        class252.field4355[arg4][arg6][arg0] = 50;
                    }
                }
                if (var11.field813 != 0 && arg9 != null) {
                    arg9.method1738(arg1, arg5, arg0, var11.field807, (byte) -64, arg6);
                }
            } else if (arg5 == 9) {
                class226 var60;
                if (var11.field783 == -1 && var11.field817 == null) {
                    class285 var59 = var11.method262(var21, arg1, (class127) null, var18, arg8, arg5, var20, -85, var24, var19, var29);
                    if (class247.field4247 && var29) {
                        class312.method2125(var59.field4892, var19, var22, var20);
                    }
                    var60 = var59.field4893;
                } else {
                    var60 = new class271(arg10, arg5, arg1, arg7, arg6, arg0, var11.field783, var11.field801, (class226) null);
                }
                class196.method1367(arg4, arg6, arg0, var21, 1, 1, var60, 0, var27);
                if (var11.field813 != 0 && arg9 != null) {
                    arg9.method1740(var11.field807, (byte) -51, var13, var12, arg0, arg6);
                }
                if (var11.field794 != 16) {
                    class1.method1(arg4, arg6, arg0, var11.field794);
                }
            } else if (arg5 == 4) {
                class226 var58;
                if (var11.field783 == -1 && var11.field817 == null) {
                    class285 var57 = var11.method262(var21, arg1, (class127) null, var18, arg8, 4, var20, -121, var24, var19, var29);
                    if (class247.field4247 && var29) {
                        class312.method2125(var57.field4892, var19, var22, var20);
                    }
                    var58 = var57.field4893;
                } else {
                    var58 = new class271(arg10, 4, arg1, arg7, arg6, arg0, var11.field783, var11.field801, (class226) null);
                }
                class219.method1516(arg4, arg6, arg0, var21, var58, (class226) null, class259.field4482[arg1], 0, 0, 0, var27);
            } else if (arg5 == 5) {
                long var34 = class201.method1402(arg4, arg6, arg0);
                int var36 = 16;
                if (var34 != 0L) {
                    var36 = class239.method1629((byte) -33, (int) (var34 >>> 32) & Integer.MAX_VALUE).field794;
                }
                class226 var38;
                if (var11.field783 == -1 && var11.field817 == null) {
                    class285 var37 = var11.method262(var21, arg1, (class127) null, var18, arg8, 4, var20, 127, var24, var19, var29);
                    if (class247.field4247 && var29) {
                        class312.method2125(var37.field4892, var19 - (class28.field597[arg1] * 8), var22, var20 - class226.field3952[arg1] * 8);
                    }
                    var38 = var37.field4893;
                } else {
                    var38 = new class271(arg10, 4, arg1, arg7, arg6, arg0, var11.field783, var11.field801, (class226) null);
                }
                class219.method1516(arg4, arg6, arg0, var21, var38, (class226) null, class259.field4482[arg1], 0, class28.field597[arg1] * var36, class226.field3952[arg1] * var36, var27);
            } else if (arg5 == 6) {
                int var52 = 8;
                long var53 = class201.method1402(arg4, arg6, arg0);
                if (var53 != 0L) {
                    var52 = class239.method1629((byte) 117, (int) (var53 >>> 32) & Integer.MAX_VALUE).field794 / 2;
                }
                class226 var56;
                if (var11.field783 == -1 && var11.field817 == null) {
                    class285 var55 = var11.method262(var21, arg1 + 4, (class127) null, var18, arg8, 4, var20, 126, var24, var19, var29);
                    if (class247.field4247 && var29) {
                        class312.method2125(var55.field4892, var19 - (class99.field1727[arg1] * 8), var22, var20 - (class158.field2712[arg1] * 8));
                    }
                    var56 = var55.field4893;
                } else {
                    var56 = new class271(arg10, 4, arg1 + 4, arg7, arg6, arg0, var11.field783, var11.field801, (class226) null);
                }
                class219.method1516(arg4, arg6, arg0, var21, var56, (class226) null, 256, arg1, class99.field1727[arg1] * var52, class158.field2712[arg1] * var52, var27);
            } else if (arg5 == 7) {
                int var39 = arg1 + 2 & 0x3;
                class226 var41;
                if (var11.field783 == -1 && var11.field817 == null) {
                    class285 var40 = var11.method262(var21, var39 + 4, (class127) null, var18, arg8, 4, var20, 127, var24, var19, var29);
                    if (class247.field4247 && var29) {
                        class312.method2125(var40.field4892, var19, var22, var20);
                    }
                    var41 = var40.field4893;
                } else {
                    var41 = new class271(arg10, 4, var39 + 4, arg7, arg6, arg0, var11.field783, var11.field801, (class226) null);
                }
                class219.method1516(arg4, arg6, arg0, var21, var41, (class226) null, 256, var39, 0, 0, var27);
            } else if (arg5 == 8) {
                int var42 = 8;
                long var43 = class201.method1402(arg4, arg6, arg0);
                if (var43 != 0L) {
                    var42 = class239.method1629((byte) -61, Integer.MAX_VALUE & (int) (var43 >>> 32)).field794 / 2;
                }
                int var45 = arg1 + 2 & 0x3;
                class226 var49;
                class226 var51;
                if (var11.field783 == -1 && var11.field817 == null) {
                    int var46 = class158.field2712[arg1] * 8;
                    int var47 = class99.field1727[arg1] * 8;
                    class285 var48 = var11.method262(var21, arg1 + 4, (class127) null, var18, arg8, 4, var20, 126, var24, var19, var29);
                    if (class247.field4247 && var29) {
                        class312.method2125(var48.field4892, var19 - var47, var22, var20 - var46);
                    }
                    var49 = var48.field4893;
                    class285 var50 = var11.method262(var21, var45 + 4, (class127) null, var18, arg8, 4, var20, 126, var24, var19, var29);
                    if (class247.field4247 && var29) {
                        class312.method2125(var50.field4892, var19 - var47, var22, var20 - var46);
                    }
                    var51 = var50.field4893;
                } else {
                    var49 = new class271(arg10, 4, arg1 + 4, arg7, arg6, arg0, var11.field783, var11.field801, (class226) null);
                    var51 = new class271(arg10, 4, var45 + 4, arg7, arg6, arg0, var11.field783, var11.field801, (class226) null);
                }
                class219.method1516(arg4, arg6, arg0, var21, var49, var51, 256, arg1, class99.field1727[arg1] * var42, class158.field2712[arg1] * var42, var27);
            }
        } else if (class228.field3968 || var11.field795 != 0 || var11.field813 == 1 || var11.field775) {
            class226 var77;
            if (var11.field783 == -1 && var11.field817 == null) {
                class285 var76 = var11.method262(var21, arg1, (class127) null, var18, arg8, 22, var20, 127, var24, var19, var29);
                if (class247.field4247 && var29) {
                    class312.method2125(var76.field4892, var19, var22, var20);
                }
                var77 = var76.field4893;
            } else {
                var77 = new class271(arg10, 22, arg1, arg7, arg6, arg0, var11.field783, var11.field801, (class226) null);
            }
            class147.method989(arg4, arg6, arg0, var21, var77, var27, var11.field805);
            if (var11.field813 == 1 && arg9 != null) {
                arg9.method1731(arg0, arg6, false);
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IBLmh;)V", line = 685)
    public static final void method297(int arg0, byte arg1, class128 arg2) {
        field878++;
        boolean var3 = false;
        if (arg1 != 100) {
            return;
        }
        class128 var4 = arg2.method818(-8206).method850(55);
        for (int var5 = 0; var5 < class75.field1404; var5++) {
            class123 var6 = class140.field2405[class203.field3593[var5]];
            if (var6 != null && var6.field2079 != null && var6.field2079.method861(10362, var4)) {
                class11.method87(1, 0, 2, 1, class163.field2796.field422[0], var6.field450[0], 0, class163.field2796.field450[0], var6.field422[0], 0, 0, false);
                var3 = true;
                if (arg0 == 1) {
                    class71.field1320.method570(51, -1);
                    class134.field2338++;
                    class71.field1320.method1324(class203.field3593[var5], arg1 + 15703);
                } else if (arg0 == 4) {
                    class273.field4741++;
                    class71.field1320.method570(213, -1);
                    class71.field1320.method1298(class203.field3593[var5], (byte) -104);
                } else if (arg0 == 5) {
                    class71.field1320.method570(127, -1);
                    class212.field3762++;
                    class71.field1320.method1324(class203.field3593[var5], 15803);
                } else if (arg0 == 6) {
                    class71.field1320.method570(55, -1);
                    class71.field1320.method1324(class203.field3593[var5], arg1 ^ 0x3DDF);
                    class30.field665++;
                } else if (arg0 == 7) {
                    class115.field1927++;
                    class71.field1320.method570(218, -1);
                    class71.field1320.method1310(255, class203.field3593[var5]);
                }
                break;
            }
        }
        if (!var3) {
            class212.method1456(class28.method177((byte) -101, new class128[] { class169.field2953, var4 }), arg1 ^ 0x65, class273.field4733, 0);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V", line = 769)
    private final void method298(int arg0) {
        field887++;
        this.field880 += ++this.field888;
        int var2 = 0;
        if (arg0 != 255) {
            field885 = 0.30279085F;
        }
        while (var2 < 256) {
            int var3 = this.field876[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field882 ^= this.field882 << 13;
                } else {
                    this.field882 ^= this.field882 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field882 ^= this.field882 << 2;
            } else {
                this.field882 ^= this.field882 >>> 16;
            }
            this.field882 += this.field876[var2 + 128 & 0xFF];
            int var4;
            this.field876[var2] = var4 = this.field880 + this.field876[class238.method1622(var3, 1020) >> 2] + this.field882;
            this.field886[var2] = this.field880 = this.field876[class238.method1622(var4 >> 8 >> 2, 255)] + var3;
            var2++;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "([BII)I", line = 811)
    public static final int method299(byte[] arg0, int arg1, int arg2) {
        field877++;
        if (arg2 >= -78) {
            method297(-58, (byte) 41, (class128) null);
        }
        return class315.method2174(arg1, 0, (byte) -126, arg0);
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)V", line = 823)
    public static void method300(int arg0) {
        if (arg0 != 2) {
            field872 = -22;
        }
        field879 = null;
        field870 = null;
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(I)V", line = 849)
    private final void method301(int arg0) {
        field873++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        for (int var10 = 0; var10 < 4; var10++) {
            int var11 = var9 ^ var8 << 11;
            int var12 = var7 + var8;
            int var13 = var6 + var11;
            int var14 = var12 ^ var7 >>> 2;
            int var15 = var5 + var14;
            int var16 = var7 + var13;
            int var17 = var16 ^ var13 << 8;
            int var18 = var13 + var15;
            var6 = var18 ^ var15 >>> 16;
            int var19 = var4 + var17;
            int var20 = var15 + var19;
            int var21 = var3 + var6;
            var5 = var20 ^ var19 << 10;
            int var22 = var2 + var5;
            int var23 = var19 + var21;
            var4 = var23 ^ var21 >>> 4;
            int var24 = var4 + var11;
            int var25 = var21 + var22;
            var3 = var25 ^ var22 << 8;
            var8 = var3 + var14;
            int var26 = var22 + var24;
            var2 = var26 ^ var24 >>> 9;
            var9 = var8 + var24;
            var7 = var2 + var17;
        }
        for (int var27 = arg0; var27 < 256; var27 += 8) {
            int var28 = this.field886[var27 + 2] + var7;
            int var29 = this.field886[var27 + 6] + var3;
            int var30 = this.field886[var27] + var9;
            int var31 = this.field886[var27 + 7] + var2;
            int var32 = this.field886[var27 + 4] + var5;
            int var33 = this.field886[var27 + 3] + var6;
            int var34 = this.field886[var27 + 1] + var8;
            int var35 = this.field886[var27 + 5] + var4;
            int var36 = var30 ^ var34 << 11;
            int var37 = var33 + var36;
            int var38 = var28 + var34;
            int var39 = var38 ^ var28 >>> 2;
            int var40 = var28 + var37;
            int var41 = var32 + var39;
            int var42 = var40 ^ var37 << 8;
            int var43 = var37 + var41;
            int var44 = var35 + var42;
            var6 = var43 ^ var41 >>> 16;
            int var45 = var6 + var29;
            int var46 = var41 + var44;
            var5 = var46 ^ var44 << 10;
            int var47 = var44 + var45;
            int var48 = var5 + var31;
            var4 = var47 ^ var45 >>> 4;
            int var49 = var4 + var36;
            int var50 = var45 + var48;
            var3 = var50 ^ var48 << 8;
            int var51 = var48 + var49;
            var8 = var3 + var39;
            var2 = var51 ^ var49 >>> 9;
            var7 = var2 + var42;
            var9 = var8 + var49;
            this.field876[var27] = var9;
            this.field876[var27 + 1] = var8;
            this.field876[var27 + 2] = var7;
            this.field876[var27 + 3] = var6;
            this.field876[var27 + 4] = var5;
            this.field876[var27 + 5] = var4;
            this.field876[var27 + 6] = var3;
            this.field876[var27 + 7] = var2;
        }
        for (int var52 = 0; var52 < 256; var52 += 8) {
            int var53 = this.field876[var52 + 7] + var2;
            int var54 = this.field876[var52 + 3] + var6;
            int var55 = this.field876[var52 + 4] + var5;
            int var56 = this.field876[var52 + 5] + var4;
            int var57 = this.field876[var52 + 2] + var7;
            int var58 = this.field876[var52 + 6] + var3;
            int var59 = this.field876[var52 + 1] + var8;
            int var60 = this.field876[var52] + var9;
            int var61 = var60 ^ var59 << 11;
            int var62 = var54 + var61;
            int var63 = var57 + var59;
            int var64 = var63 ^ var57 >>> 2;
            int var65 = var57 + var62;
            int var66 = var55 + var64;
            int var67 = var65 ^ var62 << 8;
            int var68 = var56 + var67;
            int var69 = var62 + var66;
            var6 = var69 ^ var66 >>> 16;
            int var70 = var66 + var68;
            int var71 = var6 + var58;
            var5 = var70 ^ var68 << 10;
            int var72 = var5 + var53;
            int var73 = var68 + var71;
            var4 = var73 ^ var71 >>> 4;
            int var74 = var71 + var72;
            int var75 = var4 + var61;
            var3 = var74 ^ var72 << 8;
            int var76 = var72 + var75;
            var2 = var76 ^ var75 >>> 9;
            var8 = var3 + var64;
            var7 = var2 + var67;
            var9 = var8 + var75;
            this.field876[var52] = var9;
            this.field876[var52 + 1] = var8;
            this.field876[var52 + 2] = var7;
            this.field876[var52 + 3] = var6;
            this.field876[var52 + 4] = var5;
            this.field876[var52 + 5] = var4;
            this.field876[var52 + 6] = var3;
            this.field876[var52 + 7] = var2;
        }
        this.method298(255);
        this.field883 = 256;
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "()V", line = 996)
    private class43() {
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "([I)V", line = 998)
    public class43(int[] arg0) {
        this.field886 = new int[256];
        this.field876 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field886[var2] = arg0[var2];
        }
        this.method301(0);
    }
}
