import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class104 extends class201 {

    @OriginalMember(owner = "client!tf", name = "K", descriptor = "[B")
    public byte[] field1834;

    @OriginalMember(owner = "client!tf", name = "H", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!tf", name = "J", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!tf", name = "M", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!tf", name = "L", descriptor = "Lb;")
    public static class81 field1835;

    @OriginalMember(owner = "client!tf", name = "I", descriptor = "[[Z")
    public static boolean[][] field1832;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(Z)V")
    public static void method718(boolean arg0) {
        field1832 = null;
        field1835 = null;
        if (arg0) {
            method718(false);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZIIIIILkc;IIIZ)V")
    public static final void method719(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class264 arg6, int arg7, int arg8, int arg9, boolean arg10) {
        field1831++;
        if (arg10 && !class121.method833((byte) -91) && (class228.field3952[0][arg8][arg4] & 0x2) == 0) {
            if ((class228.field3952[arg1][arg8][arg4] & 0x10) != 0) {
                return;
            }
            if (class251.method1733(arg1, arg8, (byte) 122, arg4) != class82.field1498) {
                return;
            }
        }
        if (class204.field3559 > arg1) {
            class204.field3559 = arg1;
        }
        class199 var11 = class110.method753(arg2, (byte) 118);
        int var12;
        int var13;
        if (arg5 == 1 || arg5 == 3) {
            var12 = var11.field3464;
            var13 = var11.field3473;
        } else {
            var12 = var11.field3473;
            var13 = var11.field3464;
        }
        int[][] var14 = class245.field4193[arg3];
        int var15;
        int var16;
        if ((arg4 + var13) <= 104) {
            var15 = (var13 + 1 >> 1) + arg4;
            var16 = (var13 >> 1) + arg4;
        } else {
            var16 = arg4;
            var15 = arg4 + 1;
        }
        int var17;
        int var18;
        if (arg8 + var12 <= 104) {
            var17 = (var12 + 1 >> 1) + arg8;
            var18 = (var12 >> 1) + arg8;
        } else {
            var17 = arg8 + 1;
            var18 = arg8;
        }
        int var19 = (arg8 << 7) + (var12 << 6);
        if (arg7 != 14013) {
            field1835 = null;
        }
        int var20 = (arg4 << 7) + (var13 << 6);
        int var21 = var14[var17][var16] + var14[var18][var15] + var14[var18][var16] + var14[var17][var15] >> 2;
        long var22 = (long) (arg8 | arg4 << 7 | arg9 << 14 | arg5 << 20 | 0x40000000);
        int[][] var24 = null;
        if (var11.field3443 == 0 || arg0) {
            var22 |= Long.MIN_VALUE;
        }
        if (var11.field3445 == 1) {
            var22 |= 0x400000L;
        }
        if (arg0) {
            var24 = class225.field3920[0];
        } else if (arg3 < 3) {
            var24 = class245.field4193[arg3 + 1];
        }
        if (var11.field3467) {
            var22 |= 0x80000000L;
        }
        if (var11.method1358((byte) 53)) {
            class1.method3((class17) null, arg1, arg4, arg5, 128, (class44) null, var11, arg8);
        }
        long var25 = var22 | (long) arg2 << 32;
        boolean var27 = var11.field3461 & !arg0;
        if (arg9 == 22) {
            if (class31.field475 || var11.field3443 != 0 || var11.field3416 == 1 || var11.field3451) {
                class56 var29;
                if (var11.field3463 == -1 && var11.field3474 == null) {
                    class235 var28 = var11.method1361(22, arg5, var20, var27, (byte) -54, (class103) null, var21, arg10, var14, var19, var24);
                    var29 = var28.field4062;
                } else {
                    var29 = new class8(arg2, 22, arg5, arg3, arg8, arg4, var11.field3463, var11.field3434, (class56) null);
                }
                class232.method1554(arg1, arg8, arg4, var21, var29, var25, var11.field3453);
                if (var11.field3416 == 1 && arg6 != null) {
                    arg6.method1824(arg8, arg4, 125);
                }
            }
        } else if (arg9 == 10 || arg9 == 11) {
            class56 var69;
            if (var11.field3463 == -1 && var11.field3474 == null) {
                class235 var68 = var11.method1361(10, arg9 == 11 ? arg5 + 4 : arg5, var20, var27, (byte) 90, (class103) null, var21, arg10, var14, var19, var24);
                var69 = var68.field4062;
            } else {
                var69 = new class8(arg2, 10, arg9 == 11 ? arg5 + 4 : arg5, arg3, arg8, arg4, var11.field3463, var11.field3434, (class56) null);
            }
            if (var69 != null) {
                boolean var70 = class106.method727(arg1, arg8, arg4, var21, var12, var13, var69, 0, var25);
                if (var11.field3423 && var70 && arg10) {
                    int var71 = 15;
                    if (var69 instanceof class26) {
                        var71 = ((class26) var69).method179() / 4;
                        if (var71 > 30) {
                            var71 = 30;
                        }
                    }
                    for (int var72 = 0; var72 <= var12; var72++) {
                        for (int var73 = 0; var73 <= var13; var73++) {
                            if (class264.field4718[arg1][arg8 + var72][arg4 + var73] < var71) {
                                class264.field4718[arg1][arg8 + var72][arg4 + var73] = (byte) var71;
                            }
                        }
                    }
                }
            }
            if (var11.field3416 != 0 && arg6 != null) {
                arg6.method1814(arg4, var11.field3429, arg8, var13, var12, arg7 ^ 0x36E4);
            }
        } else if (arg9 >= 12) {
            class56 var31;
            if (var11.field3463 == -1 && var11.field3474 == null) {
                class235 var30 = var11.method1361(arg9, arg5, var20, var27, (byte) 122, (class103) null, var21, arg10, var14, var19, var24);
                var31 = var30.field4062;
            } else {
                var31 = new class8(arg2, arg9, arg5, arg3, arg8, arg4, var11.field3463, var11.field3434, (class56) null);
            }
            class106.method727(arg1, arg8, arg4, var21, 1, 1, var31, 0, var25);
            if (arg10 && arg9 >= 12 && arg9 <= 17 && arg9 != 13 && arg1 > 0) {
                class228.field3954[arg1][arg8][arg4] = class75.method528(class228.field3954[arg1][arg8][arg4], 4);
            }
            if (var11.field3416 != 0 && arg6 != null) {
                arg6.method1814(arg4, var11.field3429, arg8, var13, var12, -125);
            }
        } else if (arg9 == 0) {
            class56 var33;
            if (var11.field3463 == -1 && var11.field3474 == null) {
                class235 var32 = var11.method1361(0, arg5, var20, var27, (byte) 115, (class103) null, var21, arg10, var14, var19, var24);
                var33 = var32.field4062;
            } else {
                var33 = new class8(arg2, 0, arg5, arg3, arg8, arg4, var11.field3463, var11.field3434, (class56) null);
            }
            class175.method1178(arg1, arg8, arg4, var21, var33, (class56) null, class231.field3993[arg5], 0, var25);
            if (arg10) {
                if (arg5 == 0) {
                    if (var11.field3423) {
                        class264.field4718[arg1][arg8][arg4] = 50;
                        class264.field4718[arg1][arg8][arg4 + 1] = 50;
                    }
                    if (var11.field3458) {
                        class228.field3954[arg1][arg8][arg4] = class75.method528(class228.field3954[arg1][arg8][arg4], 1);
                    }
                } else if (arg5 == 1) {
                    if (var11.field3423) {
                        class264.field4718[arg1][arg8][arg4 + 1] = 50;
                        class264.field4718[arg1][arg8 + 1][arg4 + 1] = 50;
                    }
                    if (var11.field3458) {
                        class228.field3954[arg1][arg8][arg4 + 1] = class75.method528(class228.field3954[arg1][arg8][arg4 + 1], 2);
                    }
                } else if (arg5 == 2) {
                    if (var11.field3423) {
                        class264.field4718[arg1][arg8 + 1][arg4] = 50;
                        class264.field4718[arg1][arg8 + 1][arg4 + 1] = 50;
                    }
                    if (var11.field3458) {
                        class228.field3954[arg1][arg8 + 1][arg4] = class75.method528(class228.field3954[arg1][arg8 + 1][arg4], 1);
                    }
                } else if (arg5 == 3) {
                    if (var11.field3423) {
                        class264.field4718[arg1][arg8][arg4] = 50;
                        class264.field4718[arg1][arg8 + 1][arg4] = 50;
                    }
                    if (var11.field3458) {
                        class228.field3954[arg1][arg8][arg4] = class75.method528(class228.field3954[arg1][arg8][arg4], 2);
                    }
                }
            }
            if (var11.field3416 != 0 && arg6 != null) {
                arg6.method1819(arg9, var11.field3429, arg4, arg5, arg8, 0);
            }
            if (var11.field3425 != 16) {
                class52.method343(arg1, arg8, arg4, var11.field3425);
            }
        } else if (arg9 == 1) {
            class56 var35;
            if (var11.field3463 == -1 && var11.field3474 == null) {
                class235 var34 = var11.method1361(1, arg5, var20, var27, (byte) -109, (class103) null, var21, arg10, var14, var19, var24);
                var35 = var34.field4062;
            } else {
                var35 = new class8(arg2, 1, arg5, arg3, arg8, arg4, var11.field3463, var11.field3434, (class56) null);
            }
            class175.method1178(arg1, arg8, arg4, var21, var35, (class56) null, class74.field1388[arg5], 0, var25);
            if (var11.field3423 && arg10) {
                if (arg5 == 0) {
                    class264.field4718[arg1][arg8][arg4 + 1] = 50;
                } else if (arg5 == 1) {
                    class264.field4718[arg1][arg8 + 1][arg4 + 1] = 50;
                } else if (arg5 == 2) {
                    class264.field4718[arg1][arg8 + 1][arg4] = 50;
                } else if (arg5 == 3) {
                    class264.field4718[arg1][arg8][arg4] = 50;
                }
            }
            if (var11.field3416 != 0 && arg6 != null) {
                arg6.method1819(arg9, var11.field3429, arg4, arg5, arg8, 0);
            }
        } else if (arg9 == 2) {
            int var36 = arg5 + 1 & 0x3;
            class56 var38;
            class56 var40;
            if (var11.field3463 == -1 && var11.field3474 == null) {
                class235 var37 = var11.method1361(2, arg5 + 4, var20, var27, (byte) 126, (class103) null, var21, arg10, var14, var19, var24);
                var38 = var37.field4062;
                class235 var39 = var11.method1361(2, var36, var20, var27, (byte) 91, (class103) null, var21, arg10, var14, var19, var24);
                var40 = var39.field4062;
            } else {
                var38 = new class8(arg2, 2, arg5 + 4, arg3, arg8, arg4, var11.field3463, var11.field3434, (class56) null);
                var40 = new class8(arg2, 2, var36, arg3, arg8, arg4, var11.field3463, var11.field3434, (class56) null);
            }
            class175.method1178(arg1, arg8, arg4, var21, var38, var40, class231.field3993[arg5], class231.field3993[var36], var25);
            if (var11.field3458 && arg10) {
                if (arg5 == 0) {
                    class228.field3954[arg1][arg8][arg4] = class75.method528(class228.field3954[arg1][arg8][arg4], 1);
                    class228.field3954[arg1][arg8][arg4 + 1] = class75.method528(class228.field3954[arg1][arg8][arg4 + 1], 2);
                } else if (arg5 == 1) {
                    class228.field3954[arg1][arg8][arg4 + 1] = class75.method528(class228.field3954[arg1][arg8][arg4 + 1], 2);
                    class228.field3954[arg1][arg8 + 1][arg4] = class75.method528(class228.field3954[arg1][arg8 + 1][arg4], 1);
                } else if (arg5 == 2) {
                    class228.field3954[arg1][arg8 + 1][arg4] = class75.method528(class228.field3954[arg1][arg8 + 1][arg4], 1);
                    class228.field3954[arg1][arg8][arg4] = class75.method528(class228.field3954[arg1][arg8][arg4], 2);
                } else if (arg5 == 3) {
                    class228.field3954[arg1][arg8][arg4] = class75.method528(class228.field3954[arg1][arg8][arg4], 2);
                    class228.field3954[arg1][arg8][arg4] = class75.method528(class228.field3954[arg1][arg8][arg4], 1);
                }
            }
            if (var11.field3416 != 0 && arg6 != null) {
                arg6.method1819(arg9, var11.field3429, arg4, arg5, arg8, 0);
            }
            if (var11.field3425 != 16) {
                class52.method343(arg1, arg8, arg4, var11.field3425);
            }
        } else if (arg9 == 3) {
            class56 var42;
            if (var11.field3463 == -1 && var11.field3474 == null) {
                class235 var41 = var11.method1361(3, arg5, var20, var27, (byte) -20, (class103) null, var21, arg10, var14, var19, var24);
                var42 = var41.field4062;
            } else {
                var42 = new class8(arg2, 3, arg5, arg3, arg8, arg4, var11.field3463, var11.field3434, (class56) null);
            }
            class175.method1178(arg1, arg8, arg4, var21, var42, (class56) null, class74.field1388[arg5], 0, var25);
            if (var11.field3423 && arg10) {
                if (arg5 == 0) {
                    class264.field4718[arg1][arg8][arg4 + 1] = 50;
                } else if (arg5 == 1) {
                    class264.field4718[arg1][arg8 + 1][arg4 + 1] = 50;
                } else if (arg5 == 2) {
                    class264.field4718[arg1][arg8 + 1][arg4] = 50;
                } else if (arg5 == 3) {
                    class264.field4718[arg1][arg8][arg4] = 50;
                }
            }
            if (var11.field3416 != 0 && arg6 != null) {
                arg6.method1819(arg9, var11.field3429, arg4, arg5, arg8, 0);
            }
        } else if (arg9 == 9) {
            class56 var44;
            if (var11.field3463 == -1 && var11.field3474 == null) {
                class235 var43 = var11.method1361(arg9, arg5, var20, var27, (byte) -17, (class103) null, var21, arg10, var14, var19, var24);
                var44 = var43.field4062;
            } else {
                var44 = new class8(arg2, arg9, arg5, arg3, arg8, arg4, var11.field3463, var11.field3434, (class56) null);
            }
            class106.method727(arg1, arg8, arg4, var21, 1, 1, var44, 0, var25);
            if (var11.field3416 != 0 && arg6 != null) {
                arg6.method1814(arg4, var11.field3429, arg8, var13, var12, -98);
            }
            if (var11.field3425 != 16) {
                class52.method343(arg1, arg8, arg4, var11.field3425);
            }
        } else if (arg9 == 4) {
            class56 var46;
            if (var11.field3463 == -1 && var11.field3474 == null) {
                class235 var45 = var11.method1361(4, arg5, var20, var27, (byte) -77, (class103) null, var21, arg10, var14, var19, var24);
                var46 = var45.field4062;
            } else {
                var46 = new class8(arg2, 4, arg5, arg3, arg8, arg4, var11.field3463, var11.field3434, (class56) null);
            }
            class244.method1647(arg1, arg8, arg4, var21, var46, (class56) null, class231.field3993[arg5], 0, 0, 0, var25);
        } else if (arg9 == 5) {
            long var47 = class116.method818(arg1, arg8, arg4);
            int var49 = 16;
            if (var47 != 0L) {
                var49 = class110.method753((int) (var47 >>> 32) & Integer.MAX_VALUE, (byte) 120).field3425;
            }
            class56 var51;
            if (var11.field3463 == -1 && var11.field3474 == null) {
                class235 var50 = var11.method1361(4, arg5, var20, var27, (byte) -54, (class103) null, var21, arg10, var14, var19, var24);
                var51 = var50.field4062;
            } else {
                var51 = new class8(arg2, 4, arg5, arg3, arg8, arg4, var11.field3463, var11.field3434, (class56) null);
            }
            class244.method1647(arg1, arg8, arg4, var21, var51, (class56) null, class231.field3993[arg5], 0, class159.field2715[arg5] * var49, class206.field3611[arg5] * var49, var25);
        } else if (arg9 == 6) {
            int var52 = 8;
            long var53 = class116.method818(arg1, arg8, arg4);
            if (var53 != 0L) {
                var52 = class110.method753((int) (var53 >>> 32) & Integer.MAX_VALUE, (byte) -62).field3425 / 2;
            }
            class56 var56;
            if (var11.field3463 == -1 && var11.field3474 == null) {
                class235 var55 = var11.method1361(4, arg5 + 4, var20, var27, (byte) 122, (class103) null, var21, arg10, var14, var19, var24);
                var56 = var55.field4062;
            } else {
                var56 = new class8(arg2, 4, arg5 + 4, arg3, arg8, arg4, var11.field3463, var11.field3434, (class56) null);
            }
            class244.method1647(arg1, arg8, arg4, var21, var56, (class56) null, 256, arg5, class185.field3179[arg5] * var52, class264.field4721[arg5] * var52, var25);
        } else if (arg9 == 7) {
            int var57 = arg5 + 2 & 0x3;
            class56 var59;
            if (var11.field3463 == -1 && var11.field3474 == null) {
                class235 var58 = var11.method1361(4, var57 + 4, var20, var27, (byte) -48, (class103) null, var21, arg10, var14, var19, var24);
                var59 = var58.field4062;
            } else {
                var59 = new class8(arg2, 4, var57 + 4, arg3, arg8, arg4, var11.field3463, var11.field3434, (class56) null);
            }
            class244.method1647(arg1, arg8, arg4, var21, var59, (class56) null, 256, var57, 0, 0, var25);
        } else if (arg9 == 8) {
            int var60 = 8;
            long var61 = class116.method818(arg1, arg8, arg4);
            if (var61 != 0L) {
                var60 = class110.method753(Integer.MAX_VALUE & (int) (var61 >>> 32), (byte) 125).field3425 / 2;
            }
            int var63 = arg5 + 2 & 0x3;
            class56 var65;
            class56 var67;
            if (var11.field3463 == -1 && var11.field3474 == null) {
                class235 var64 = var11.method1361(4, arg5 + 4, var20, var27, (byte) 110, (class103) null, var21, arg10, var14, var19, var24);
                var65 = var64.field4062;
                class235 var66 = var11.method1361(4, var63 + 4, var20, var27, (byte) 92, (class103) null, var21, arg10, var14, var19, var24);
                var67 = var66.field4062;
            } else {
                var65 = new class8(arg2, 4, arg5 + 4, arg3, arg8, arg4, var11.field3463, var11.field3434, (class56) null);
                var67 = new class8(arg2, 4, var63 + 4, arg3, arg8, arg4, var11.field3463, var11.field3434, (class56) null);
            }
            class244.method1647(arg1, arg8, arg4, var21, var65, var67, 256, arg5, class185.field3179[arg5] * var60, class264.field4721[arg5] * var60, var25);
        }
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "([B)V")
    public class104(byte[] arg0) {
        this.field1834 = arg0;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "([Ljd;[SB)V")
    public static final void method720(class85[] arg0, short[] arg1, byte arg2) {
        if (arg2 != 63) {
            method719(true, -126, -14, -50, -82, -99, (class264) null, -29, -3, 34, false);
        }
        class162.method1064(arg1, arg0.length - 1, arg0, 0, (byte) -78);
        field1836++;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lme;)V")
    public static final void method721(class213 arg0) {
        for (int var1 = arg0.field3731; var1 <= arg0.field3737; var1++) {
            for (int var2 = arg0.field3729; var2 <= arg0.field3722; var2++) {
                class208 var3 = class99.field1780[arg0.field3727][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field3646; var4++) {
                        if (var3.field3650[var4] == arg0) {
                            var3.field3646--;
                            for (int var5 = var4; var5 < var3.field3646; var5++) {
                                var3.field3650[var5] = var3.field3650[var5 + 1];
                                var3.field3636[var5] = var3.field3636[var5 + 1];
                            }
                            var3.field3650[var3.field3646] = null;
                            break;
                        }
                    }
                    var3.field3638 = 0;
                    for (int var6 = 0; var6 < var3.field3646; var6++) {
                        var3.field3638 |= var3.field3636[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Ljd;I)V")
    public static final void method722(class85 arg0, int arg1) {
        int var2 = -79 % ((13 - arg1) / 55);
        class146.method958((byte) -102);
        class172.method1151(-19765, arg0);
        field1833++;
    }
}
