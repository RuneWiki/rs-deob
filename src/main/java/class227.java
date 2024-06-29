import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class227 {

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "Lr;")
    public class301 field3741 = new class301();

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "[Loe;")
    public static class146[] field3738 = new class146[2048];

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public static int field3733;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public static int field3734;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    public static int field3735;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    public static int field3739;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
    public static int field3740;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
    public static int field3744;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "Lr;")
    private class301 field3745;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIZIIIIIZLrm;I)V", line = 4)
    public static final void method1579(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, class273 arg9, int arg10) {
        field3740++;
        if (arg2 && !class14.method137(256) && (class282.field4615[0][arg1][arg5] & 0x2) == 0) {
            if ((class282.field4615[arg0][arg1][arg5] & 0x10) != 0) {
                return;
            }
            if (class170.method1206(arg0, arg5, arg1, arg3 ^ 0x3BC8) != class208.field3479) {
                return;
            }
        }
        if (class311.field5064 > arg0) {
            class311.field5064 = arg0;
        }
        class238 var11 = class1.method7(arg7, 25);
        if (class241.field4016 && var11.field3886) {
            return;
        }
        int var12;
        int var13;
        if (arg4 == 1 || arg4 == 3) {
            var12 = var11.field3890;
            var13 = var11.field3935;
        } else {
            var12 = var11.field3935;
            var13 = var11.field3890;
        }
        if (arg3 != -15255) {
            field3738 = (class146[]) null;
        }
        int var14;
        int var15;
        if (arg1 + var12 > 104) {
            var14 = arg1 + 1;
            var15 = arg1;
        } else {
            var15 = arg1 + (var12 >> 1);
            var14 = arg1 + (var12 + 1 >> 1);
        }
        int var16;
        int var17;
        if ((arg5 + var13) > 104) {
            var16 = arg5 + 1;
            var17 = arg5;
        } else {
            var16 = (var13 + 1 >> 1) + arg5;
            var17 = (var13 >> 1) + arg5;
        }
        int[][] var18 = class144.field2427[arg10];
        int var19 = (arg1 << 7) + (var12 << 6);
        int var20 = (arg5 << 7) + (var13 << 6);
        int var21 = 0;
        int var22 = var18[var15][var17] + var18[var14][var17] + var18[var14][var16] + var18[var15][var16] >> 2;
        if (class241.field4016 && arg10 != 0) {
            int[][] var23 = class144.field2427[0];
            var21 = var22 - (var23[var14][var16] + var23[var15][var17] + var23[var14][var17] + var23[var15][var16] >> 2);
        }
        int[][] var24 = (int[][]) null;
        if (arg8) {
            var24 = class123.field2166[0];
        } else if (arg10 < 3) {
            var24 = class144.field2427[arg10 + 1];
        }
        long var25 = (long) (arg1 | arg5 << 7 | arg6 << 14 | arg4 << 20 | 0x40000000);
        if (var11.field3931 == 0 || arg8) {
            var25 |= Long.MIN_VALUE;
        }
        if (var11.field3919 == 1) {
            var25 |= 0x400000L;
        }
        if (var11.field3932) {
            var25 |= 0x80000000L;
        }
        if (var11.method1663(arg3 + 15255)) {
            class124.method891(var11, arg0, arg5, 0, arg1, arg3 ^ 0xFFFFC4E9, (class314) null, (class98) null, arg4);
        }
        long var27 = var25 | (long) arg7 << 32;
        boolean var29 = !arg8 & var11.field3956;
        if (arg6 == 22) {
            if (class349.field5590 || var11.field3931 != 0 || var11.field3930 == 1 || var11.field3918) {
                class152 var77;
                if (var11.field3904 == -1 && var11.field3927 == null && var11.field3937 == null && !var11.field3953) {
                    class223 var76 = var11.method1661(var20, arg4, var22, var19, -67, arg2, (class211) null, 22, var24, var29, var18);
                    if (class241.field4016 && var29) {
                        class221.method1550(var76.field3689, var19, var21, var20);
                    }
                    var77 = var76.field3681;
                } else {
                    var77 = new class86(arg7, 22, arg4, arg10, arg1, arg5, -1, var11.field3942, (class152) null);
                }
                class224.method1567(arg0, arg1, arg5, var22, var77, var27, var11.field3924);
                if (var11.field3930 == 1 && arg9 != null) {
                    arg9.method1925(arg1, arg3 + 15320, arg5);
                }
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class152 var71;
            if (var11.field3904 == -1 && var11.field3927 == null && var11.field3937 == null && !var11.field3953) {
                class223 var70 = var11.method1661(var20, arg6 == 11 ? arg4 + 4 : arg4, var22, var19, arg3 ^ 0x3BD4, arg2, (class211) null, 10, var24, var29, var18);
                if (class241.field4016 && var29) {
                    class221.method1550(var70.field3689, var19, var21, var20);
                }
                var71 = var70.field3681;
            } else {
                var71 = new class86(arg7, 10, arg6 == 11 ? arg4 + 4 : arg4, arg10, arg1, arg5, -1, var11.field3942, (class152) null);
            }
            if (var71 != null) {
                boolean var72 = class22.method194(arg0, arg1, arg5, var22, var12, var13, var71, 0, var27);
                if (var11.field3908 && var72 && arg2) {
                    int var73 = 15;
                    if (var71 instanceof class42) {
                        var73 = ((class42) var71).method331() / 4;
                        if (var73 > 30) {
                            var73 = 30;
                        }
                    }
                    for (int var74 = 0; var74 <= var12; var74++) {
                        for (int var75 = 0; var75 <= var13; var75++) {
                            if (class79.field1409[arg0][arg1 + var74][arg5 + var75] < var73) {
                                class79.field1409[arg0][arg1 + var74][arg5 + var75] = (byte) var73;
                            }
                        }
                    }
                }
            }
            if (var11.field3930 != 0 && arg9 != null) {
                arg9.method1948(var11.field3940, arg1, var13, var12, !var11.field3946, arg5, 1073741824);
            }
        } else if (arg6 >= 12) {
            class152 var31;
            if (var11.field3904 == -1 && var11.field3927 == null && var11.field3937 == null && !var11.field3953) {
                class223 var30 = var11.method1661(var20, arg4, var22, var19, -67, arg2, (class211) null, arg6, var24, var29, var18);
                if (class241.field4016 && var29) {
                    class221.method1550(var30.field3689, var19, var21, var20);
                }
                var31 = var30.field3681;
            } else {
                var31 = new class86(arg7, arg6, arg4, arg10, arg1, arg5, -1, var11.field3942, (class152) null);
            }
            class22.method194(arg0, arg1, arg5, var22, 1, 1, var31, 0, var27);
            if (arg2 && arg6 >= 12 && arg6 <= 17 && arg6 != 13 && arg0 > 0 && var11.field3913 != 0) {
                class167.field2793[arg0][arg1][arg5] = class287.method2034(class167.field2793[arg0][arg1][arg5], 4);
            }
            if (var11.field3930 != 0 && arg9 != null) {
                arg9.method1948(var11.field3940, arg1, var13, var12, !var11.field3946, arg5, 1073741824);
            }
        } else if (arg6 == 0) {
            class152 var69;
            if (var11.field3904 == -1 && var11.field3927 == null && var11.field3937 == null && !var11.field3953) {
                class223 var68 = var11.method1661(var20, arg4, var22, var19, -67, arg2, (class211) null, 0, var24, var29, var18);
                if (class241.field4016 && var29) {
                    class221.method1550(var68.field3689, var19, var21, var20);
                }
                var69 = var68.field3681;
            } else {
                var69 = new class86(arg7, 0, arg4, arg10, arg1, arg5, -1, var11.field3942, (class152) null);
            }
            class273.method1934(arg0, arg1, arg5, var22, var69, (class152) null, class255.field4187[arg4], 0, var27);
            if (arg2) {
                if (arg4 == 0) {
                    if (var11.field3908) {
                        class79.field1409[arg0][arg1][arg5] = 50;
                        class79.field1409[arg0][arg1][arg5 + 1] = 50;
                    }
                    if (var11.field3913 == 1) {
                        class167.field2793[arg0][arg1][arg5] = class287.method2034(class167.field2793[arg0][arg1][arg5], 1);
                    }
                } else if (arg4 == 1) {
                    if (var11.field3908) {
                        class79.field1409[arg0][arg1][arg5 + 1] = 50;
                        class79.field1409[arg0][arg1 + 1][arg5 + 1] = 50;
                    }
                    if (var11.field3913 == 1) {
                        class167.field2793[arg0][arg1][arg5 + 1] = class287.method2034(class167.field2793[arg0][arg1][arg5 + 1], 2);
                    }
                } else if (arg4 == 2) {
                    if (var11.field3908) {
                        class79.field1409[arg0][arg1 + 1][arg5] = 50;
                        class79.field1409[arg0][arg1 + 1][arg5 + 1] = 50;
                    }
                    if (var11.field3913 == 1) {
                        class167.field2793[arg0][arg1 + 1][arg5] = class287.method2034(class167.field2793[arg0][arg1 + 1][arg5], 1);
                    }
                } else if (arg4 == 3) {
                    if (var11.field3908) {
                        class79.field1409[arg0][arg1][arg5] = 50;
                        class79.field1409[arg0][arg1 + 1][arg5] = 50;
                    }
                    if (var11.field3913 == 1) {
                        class167.field2793[arg0][arg1][arg5] = class287.method2034(class167.field2793[arg0][arg1][arg5], 2);
                    }
                }
            }
            if (var11.field3930 != 0 && arg9 != null) {
                arg9.method1947(arg6, var11.field3940, arg1, !var11.field3946, (byte) 80, arg4, arg5);
            }
            if (var11.field3943 != 16) {
                class312.method2267(arg0, arg1, arg5, var11.field3943);
            }
        } else if (arg6 == 1) {
            class152 var33;
            if (var11.field3904 == -1 && var11.field3927 == null && var11.field3937 == null && !var11.field3953) {
                class223 var32 = var11.method1661(var20, arg4, var22, var19, -67, arg2, (class211) null, 1, var24, var29, var18);
                if (class241.field4016 && var29) {
                    class221.method1550(var32.field3689, var19, var21, var20);
                }
                var33 = var32.field3681;
            } else {
                var33 = new class86(arg7, 1, arg4, arg10, arg1, arg5, -1, var11.field3942, (class152) null);
            }
            class273.method1934(arg0, arg1, arg5, var22, var33, (class152) null, class12.field379[arg4], 0, var27);
            if (var11.field3908 && arg2) {
                if (arg4 == 0) {
                    class79.field1409[arg0][arg1][arg5 + 1] = 50;
                } else if (arg4 == 1) {
                    class79.field1409[arg0][arg1 + 1][arg5 + 1] = 50;
                } else if (arg4 == 2) {
                    class79.field1409[arg0][arg1 + 1][arg5] = 50;
                } else if (arg4 == 3) {
                    class79.field1409[arg0][arg1][arg5] = 50;
                }
            }
            if (var11.field3930 != 0 && arg9 != null) {
                arg9.method1947(arg6, var11.field3940, arg1, !var11.field3946, (byte) 59, arg4, arg5);
            }
        } else if (arg6 == 2) {
            int var34 = arg4 + 1 & 0x3;
            class152 var36;
            class152 var38;
            if (var11.field3904 == -1 && var11.field3927 == null && var11.field3937 == null && !var11.field3953) {
                class223 var35 = var11.method1661(var20, arg4 + 4, var22, var19, -67, arg2, (class211) null, 2, var24, var29, var18);
                if (class241.field4016 && var29) {
                    class221.method1550(var35.field3689, var19, var21, var20);
                }
                var36 = var35.field3681;
                class223 var37 = var11.method1661(var20, var34, var22, var19, -67, arg2, (class211) null, 2, var24, var29, var18);
                if (class241.field4016 && var29) {
                    class221.method1550(var37.field3689, var19, var21, var20);
                }
                var38 = var37.field3681;
            } else {
                var36 = new class86(arg7, 2, arg4 + 4, arg10, arg1, arg5, -1, var11.field3942, (class152) null);
                var38 = new class86(arg7, 2, var34, arg10, arg1, arg5, -1, var11.field3942, (class152) null);
            }
            class273.method1934(arg0, arg1, arg5, var22, var36, var38, class255.field4187[arg4], class255.field4187[var34], var27);
            if (var11.field3913 == 1 && arg2) {
                if (arg4 == 0) {
                    class167.field2793[arg0][arg1][arg5] = class287.method2034(class167.field2793[arg0][arg1][arg5], 1);
                    class167.field2793[arg0][arg1][arg5 + 1] = class287.method2034(class167.field2793[arg0][arg1][arg5 + 1], 2);
                } else if (arg4 == 1) {
                    class167.field2793[arg0][arg1][arg5 + 1] = class287.method2034(class167.field2793[arg0][arg1][arg5 + 1], 2);
                    class167.field2793[arg0][arg1 + 1][arg5] = class287.method2034(class167.field2793[arg0][arg1 + 1][arg5], 1);
                } else if (arg4 == 2) {
                    class167.field2793[arg0][arg1 + 1][arg5] = class287.method2034(class167.field2793[arg0][arg1 + 1][arg5], 1);
                    class167.field2793[arg0][arg1][arg5] = class287.method2034(class167.field2793[arg0][arg1][arg5], 2);
                } else if (arg4 == 3) {
                    class167.field2793[arg0][arg1][arg5] = class287.method2034(class167.field2793[arg0][arg1][arg5], 2);
                    class167.field2793[arg0][arg1][arg5] = class287.method2034(class167.field2793[arg0][arg1][arg5], 1);
                }
            }
            if (var11.field3930 != 0 && arg9 != null) {
                arg9.method1947(arg6, var11.field3940, arg1, !var11.field3946, (byte) 116, arg4, arg5);
            }
            if (var11.field3943 != 16) {
                class312.method2267(arg0, arg1, arg5, var11.field3943);
            }
        } else if (arg6 == 3) {
            class152 var40;
            if (var11.field3904 == -1 && var11.field3927 == null && var11.field3937 == null && !var11.field3953) {
                class223 var39 = var11.method1661(var20, arg4, var22, var19, -67, arg2, (class211) null, 3, var24, var29, var18);
                if (class241.field4016 && var29) {
                    class221.method1550(var39.field3689, var19, var21, var20);
                }
                var40 = var39.field3681;
            } else {
                var40 = new class86(arg7, 3, arg4, arg10, arg1, arg5, -1, var11.field3942, (class152) null);
            }
            class273.method1934(arg0, arg1, arg5, var22, var40, (class152) null, class12.field379[arg4], 0, var27);
            if (var11.field3908 && arg2) {
                if (arg4 == 0) {
                    class79.field1409[arg0][arg1][arg5 + 1] = 50;
                } else if (arg4 == 1) {
                    class79.field1409[arg0][arg1 + 1][arg5 + 1] = 50;
                } else if (arg4 == 2) {
                    class79.field1409[arg0][arg1 + 1][arg5] = 50;
                } else if (arg4 == 3) {
                    class79.field1409[arg0][arg1][arg5] = 50;
                }
            }
            if (var11.field3930 != 0 && arg9 != null) {
                arg9.method1947(arg6, var11.field3940, arg1, !var11.field3946, (byte) 51, arg4, arg5);
            }
        } else if (arg6 == 9) {
            class152 var42;
            if (var11.field3904 == -1 && var11.field3927 == null && var11.field3937 == null && !var11.field3953) {
                class223 var41 = var11.method1661(var20, arg4, var22, var19, -67, arg2, (class211) null, arg6, var24, var29, var18);
                if (class241.field4016 && var29) {
                    class221.method1550(var41.field3689, var19, var21, var20);
                }
                var42 = var41.field3681;
            } else {
                var42 = new class86(arg7, arg6, arg4, arg10, arg1, arg5, -1, var11.field3942, (class152) null);
            }
            class22.method194(arg0, arg1, arg5, var22, 1, 1, var42, 0, var27);
            if (var11.field3930 != 0 && arg9 != null) {
                arg9.method1948(var11.field3940, arg1, var13, var12, !var11.field3946, arg5, arg3 ^ 0xBFFFC469);
            }
            if (var11.field3943 != 16) {
                class312.method2267(arg0, arg1, arg5, var11.field3943);
            }
        } else if (arg6 == 4) {
            class152 var44;
            if (var11.field3904 == -1 && var11.field3927 == null && var11.field3937 == null && !var11.field3953) {
                class223 var43 = var11.method1661(var20, arg4, var22, var19, -67, arg2, (class211) null, 4, var24, var29, var18);
                if (class241.field4016 && var29) {
                    class221.method1550(var43.field3689, var19, var21, var20);
                }
                var44 = var43.field3681;
            } else {
                var44 = new class86(arg7, 4, arg4, arg10, arg1, arg5, -1, var11.field3942, (class152) null);
            }
            class78.method591(arg0, arg1, arg5, var22, var44, (class152) null, class255.field4187[arg4], 0, 0, 0, var27);
        } else if (arg6 == 5) {
            int var63 = 16;
            long var64 = class272.method1923(arg0, arg1, arg5);
            if (var64 != 0L) {
                var63 = class1.method7(Integer.MAX_VALUE & (int) (var64 >>> 32), arg3 ^ 0xFFFFC470).field3943;
            }
            class152 var67;
            if (var11.field3904 == -1 && var11.field3927 == null && var11.field3937 == null && !var11.field3953) {
                class223 var66 = var11.method1661(var20, arg4, var22, var19, arg3 ^ 0x3BD4, arg2, (class211) null, 4, var24, var29, var18);
                if (class241.field4016 && var29) {
                    class221.method1550(var66.field3689, var19 - (class109.field2005[arg4] * 8), var21, var20 - (class188.field3187[arg4] * 8));
                }
                var67 = var66.field3681;
            } else {
                var67 = new class86(arg7, 4, arg4, arg10, arg1, arg5, -1, var11.field3942, (class152) null);
            }
            class78.method591(arg0, arg1, arg5, var22, var67, (class152) null, class255.field4187[arg4], 0, class109.field2005[arg4] * var63, class188.field3187[arg4] * var63, var27);
        } else if (arg6 == 6) {
            int var45 = 8;
            long var46 = class272.method1923(arg0, arg1, arg5);
            if (var46 != 0L) {
                var45 = class1.method7(Integer.MAX_VALUE & (int) (var46 >>> 32), 25).field3943 / 2;
            }
            class152 var49;
            if (var11.field3904 == -1 && var11.field3927 == null && var11.field3937 == null && !var11.field3953) {
                class223 var48 = var11.method1661(var20, arg4 + 4, var22, var19, -67, arg2, (class211) null, 4, var24, var29, var18);
                if (class241.field4016 && var29) {
                    class221.method1550(var48.field3689, var19 - class353.field5639[arg4] * 8, var21, var20 - (class98.field1808[arg4] * 8));
                }
                var49 = var48.field3681;
            } else {
                var49 = new class86(arg7, 4, arg4 + 4, arg10, arg1, arg5, -1, var11.field3942, (class152) null);
            }
            class78.method591(arg0, arg1, arg5, var22, var49, (class152) null, 256, arg4, class353.field5639[arg4] * var45, class98.field1808[arg4] * var45, var27);
        } else if (arg6 == 7) {
            int var50 = arg4 + 2 & 0x3;
            class152 var52;
            if (var11.field3904 == -1 && var11.field3927 == null && var11.field3937 == null && !var11.field3953) {
                class223 var51 = var11.method1661(var20, var50 + 4, var22, var19, -67, arg2, (class211) null, 4, var24, var29, var18);
                if (class241.field4016 && var29) {
                    class221.method1550(var51.field3689, var19, var21, var20);
                }
                var52 = var51.field3681;
            } else {
                var52 = new class86(arg7, 4, var50 + 4, arg10, arg1, arg5, -1, var11.field3942, (class152) null);
            }
            class78.method591(arg0, arg1, arg5, var22, var52, (class152) null, 256, var50, 0, 0, var27);
        } else if (arg6 == 8) {
            int var53 = 8;
            long var54 = class272.method1923(arg0, arg1, arg5);
            if (var54 != 0L) {
                var53 = class1.method7((int) (var54 >>> 32) & Integer.MAX_VALUE, arg3 ^ 0xFFFFC470).field3943 / 2;
            }
            int var56 = arg4 + 2 & 0x3;
            class152 var60;
            class152 var62;
            if (var11.field3904 == -1 && var11.field3927 == null && var11.field3937 == null && !var11.field3953) {
                int var57 = class98.field1808[arg4] * 8;
                int var58 = class353.field5639[arg4] * 8;
                class223 var59 = var11.method1661(var20, arg4 + 4, var22, var19, -67, arg2, (class211) null, 4, var24, var29, var18);
                if (class241.field4016 && var29) {
                    class221.method1550(var59.field3689, var19 - var58, var21, var20 - var57);
                }
                var60 = var59.field3681;
                class223 var61 = var11.method1661(var20, var56 + 4, var22, var19, -67, arg2, (class211) null, 4, var24, var29, var18);
                if (class241.field4016 && var29) {
                    class221.method1550(var61.field3689, var19 - var58, var21, var20 - var57);
                }
                var62 = var61.field3681;
            } else {
                var60 = new class86(arg7, 4, arg4 + 4, arg10, arg1, arg5, -1, var11.field3942, (class152) null);
                var62 = new class86(arg7, 4, var56 + 4, arg10, arg1, arg5, -1, var11.field3942, (class152) null);
            }
            class78.method591(arg0, arg1, arg5, var22, var60, var62, 256, arg4, class353.field5639[arg4] * var53, class98.field1808[arg4] * var53, var27);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)Lr;", line = 658)
    public final class301 method1580(byte arg0) {
        if (arg0 > -118) {
            this.method1587(-94);
        }
        class301 var2 = this.field3741.field4901;
        field3739++;
        if (this.field3741 == var2) {
            this.field3745 = null;
            return null;
        } else {
            this.field3745 = var2.field4901;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZLg;IIZ)V", line = 681)
    public static final void method1581(boolean arg0, class181 arg1, int arg2, int arg3, boolean arg4) {
        field3743++;
        int var5 = arg1.field2972;
        if (arg1.field3128 == 0) {
            arg1.field2972 = arg1.field3057;
        } else if (arg1.field3128 == 1) {
            arg1.field2972 = arg3 - arg1.field3057;
        } else if (arg1.field3128 == 2) {
            arg1.field2972 = arg1.field3057 * arg3 >> 14;
        } else if (arg1.field3128 == 3) {
            if (arg1.field3098 == 2) {
                arg1.field2972 = arg1.field3057 * 32 + ((arg1.field3057 - 1) * arg1.field3034);
            } else if (arg1.field3098 == 7) {
                arg1.field2972 = (arg1.field3057 - 1) * arg1.field3034 + arg1.field3057 * 12;
            }
        }
        int var6 = arg1.field3024;
        if (arg1.field3087 == 0) {
            arg1.field3024 = arg1.field2981;
        } else if (arg1.field3087 == 1) {
            arg1.field3024 = arg2 - arg1.field2981;
        } else if (arg1.field3087 == 2) {
            arg1.field3024 = arg1.field2981 * arg2 >> 14;
        } else if (arg1.field3087 == 3) {
            if (arg1.field3098 == 2) {
                arg1.field3024 = arg1.field2981 * 32 + ((arg1.field2981 - 1) * arg1.field3007);
            } else if (arg1.field3098 == 7) {
                arg1.field3024 = (arg1.field2981 - 1) * arg1.field3007 + arg1.field2981 * 115;
            }
        }
        if (arg1.field3087 == 4) {
            arg1.field3024 = arg1.field3137 * arg1.field2972 / arg1.field3021;
        }
        if (arg1.field3128 == 4) {
            arg1.field2972 = arg1.field3024 * arg1.field3021 / arg1.field3137;
        }
        if (class323.field5230 && (client.method1990(arg1).field5380 != 0 || arg1.field3098 == 0)) {
            if (arg1.field2972 < 5 && arg1.field3024 < 5) {
                arg1.field3024 = 5;
                arg1.field2972 = 5;
            } else {
                if (arg1.field3024 <= 0) {
                    arg1.field3024 = 5;
                }
                if (arg1.field2972 <= 0) {
                    arg1.field2972 = 5;
                }
            }
        }
        if (!arg0) {
            method1581(true, (class181) null, -98, -2, true);
        }
        if (arg1.field3059 == 1337) {
            class338.field5359 = arg1;
        }
        if (arg4 && arg1.field3044 != null && (arg1.field3024 != var6 || arg1.field2972 != var5)) {
            class47 var7 = new class47();
            var7.field939 = arg1;
            var7.field936 = arg1.field3044;
            class261.field4296.method437(var7, (byte) 51);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V", line = 782)
    public final void method1582(int arg0) {
        field3737++;
        int var2 = -42 % ((66 - arg0) / 58);
        while (true) {
            class301 var3 = this.field3741.field4901;
            if (this.field3741 == var3) {
                this.field3745 = null;
                return;
            }
            var3.method2152((byte) 105);
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(B)V", line = 807)
    public static void method1583(byte arg0) {
        int var1 = -4 % ((85 - arg0) / 35);
        field3738 = null;
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(B)I", line = 819)
    public final int method1584(byte arg0) {
        field3736++;
        if (arg0 != 5) {
            return -69;
        }
        int var2 = 0;
        class301 var3 = this.field3741.field4901;
        while (this.field3741 != var3) {
            var3 = var3.field4901;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lr;B)V", line = 854)
    public final void method1585(class301 arg0, byte arg1) {
        field3734++;
        if (arg1 != -12) {
            return;
        }
        if (arg0.field4903 != null) {
            arg0.method2152((byte) 118);
        }
        arg0.field4903 = this.field3741.field4903;
        arg0.field4901 = this.field3741;
        arg0.field4903.field4901 = arg0;
        arg0.field4901.field4903 = arg0;
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "()V", line = 919)
    public class227() {
        this.field3741.field4901 = this.field3741;
        this.field3741.field4903 = this.field3741;
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(B)Lr;", line = 874)
    public final class301 method1586(byte arg0) {
        field3742++;
        if (arg0 != 50) {
            field3735 = -108;
        }
        class301 var2 = this.field3745;
        if (this.field3741 == var2) {
            this.field3745 = null;
            return null;
        } else {
            this.field3745 = var2.field4901;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)Lr;", line = 899)
    public final class301 method1587(int arg0) {
        field3733++;
        class301 var2 = this.field3741.field4901;
        if (this.field3741 == var2) {
            return null;
        }
        if (arg0 != 0) {
            method1579(-15, -80, false, 4, 59, 13, -53, 93, true, (class273) null, -32);
        }
        var2.method2152((byte) -104);
        return var2;
    }
}
