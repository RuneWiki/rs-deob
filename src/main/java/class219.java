import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class219 extends class209 {

    @OriginalMember(owner = "client!qk", name = "E", descriptor = "I")
    public static int field3340 = 0;

    @OriginalMember(owner = "client!qk", name = "G", descriptor = "Lag;")
    public static class192 field3342 = new class192(128);

    @OriginalMember(owner = "client!qk", name = "A", descriptor = "I")
    public int field3336;

    @OriginalMember(owner = "client!qk", name = "B", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!qk", name = "C", descriptor = "I")
    public int field3338;

    @OriginalMember(owner = "client!qk", name = "H", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!qk", name = "J", descriptor = "I")
    public int field3345;

    @OriginalMember(owner = "client!qk", name = "K", descriptor = "I")
    public int field3346;

    @OriginalMember(owner = "client!qk", name = "M", descriptor = "Ljava/lang/String;")
    public String field3348;

    @OriginalMember(owner = "client!qk", name = "I", descriptor = "[I")
    public int[] field3344;

    @OriginalMember(owner = "client!qk", name = "L", descriptor = "[I")
    public int[] field3347;

    @OriginalMember(owner = "client!qk", name = "D", descriptor = "[Lpf;")
    public class305[] field3339;

    @OriginalMember(owner = "client!qk", name = "F", descriptor = "[Ljava/lang/String;")
    public String[] field3341;

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "(I)V")
    public static void method1503(int arg0) {
        field3342 = null;
        if (arg0 != -1) {
            method1505((class89) null, -85, 37, true, 2, -25, (byte) 126, -50, 123, 44, false);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IB)I")
    public static final int method1504(int arg0, byte arg1) {
        int var2 = ((arg0 & 0xAAAAAAAB) >>> 1) + (arg0 & 0x55555555);
        int var3 = (var2 & 0x33333333) + (var2 >>> 2 & 0x73333333);
        field3337++;
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        if (arg1 != -40) {
            method1505((class89) null, -56, -119, false, -100, -93, (byte) -64, -91, -116, -73, true);
        }
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lai;IIZIIBIIIZ)V")
    public static final void method1505(class89 arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9, boolean arg10) {
        field3343++;
        if (arg10 && !class110.method819(false) && (client.field2390[0][arg2][arg4] & 0x2) == 0) {
            if ((client.field2390[arg7][arg2][arg4] & 0x10) != 0) {
                return;
            }
            if (class145.method1050(arg7, arg4, true, arg2) != class230.field3649) {
                return;
            }
        }
        if (class138.field2077 > arg7) {
            class138.field2077 = arg7;
        }
        class295 var11 = class166.method1209(-3, arg1);
        int var12;
        int var13;
        if (arg8 == 1 || arg8 == 3) {
            var13 = var11.field4620;
            var12 = var11.field4592;
        } else {
            var12 = var11.field4620;
            var13 = var11.field4592;
        }
        int var14;
        int var15;
        if ((arg2 + var12) <= 104) {
            var14 = (var12 >> 1) + arg2;
            var15 = (var12 + 1 >> 1) + arg2;
        } else {
            var15 = arg2 + 1;
            var14 = arg2;
        }
        int var16;
        int var17;
        if (arg4 + var13 <= 104) {
            var16 = (var13 + 1 >> 1) + arg4;
            var17 = (var13 >> 1) + arg4;
        } else {
            var16 = arg4 + 1;
            var17 = arg4;
        }
        int var18 = (arg2 << 7) + (var12 << 6);
        int[][] var19 = null;
        if (arg3) {
            var19 = class303.field4876[0];
        } else if (arg9 < 3) {
            var19 = class233.field3684[arg9 + 1];
        }
        int[][] var20 = class233.field3684[arg9];
        int var21 = var20[var14][var16] + var20[var14][var17] + var20[var15][var17] + var20[var15][var16] >> 2;
        long var22 = (long) (arg8 << 20 | arg5 << 14 | arg2 | arg4 << 7 | 0x40000000);
        if (var11.field4588 == 0 || arg3) {
            var22 |= Long.MIN_VALUE;
        }
        if (var11.field4593 == 1) {
            var22 |= 0x400000L;
        }
        if (var11.field4597) {
            var22 |= 0x80000000L;
        }
        long var24 = var22 | (long) arg1 << 32;
        int var26 = (arg4 << 7) + (var13 << 6);
        if (var11.method1958(true)) {
            class155.method1124(arg7, (class136) null, (byte) 106, arg4, arg2, var11, (class161) null, arg8);
        }
        boolean var27 = !arg3 & var11.field4608;
        int var28 = -85 / ((4 - arg6) / 63);
        if (arg5 == 22) {
            if (class292.field4536 || var11.field4588 != 0 || var11.field4621 == 1 || var11.field4580) {
                class55 var30;
                if (var11.field4650 == -1 && var11.field4656 == null && var11.field4598 == null && !var11.field4586) {
                    class27 var29 = var11.method1961(var20, (byte) 103, 22, (class13) null, var26, arg8, var21, var27, var19, var18, arg10);
                    var30 = var29.field466;
                } else {
                    var30 = new class67(arg1, 22, arg8, arg9, arg2, arg4, -1, var11.field4625, (class55) null);
                }
                class199.method1411(arg7, arg2, arg4, var21, var30, var24, var11.field4652);
                if (var11.field4621 == 1 && arg0 != null) {
                    arg0.method679(arg4, arg2, (byte) -59);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class55 var70;
            if (var11.field4650 == -1 && var11.field4656 == null && var11.field4598 == null && !var11.field4586) {
                class27 var69 = var11.method1961(var20, (byte) 103, 10, (class13) null, var26, arg5 == 11 ? arg8 + 4 : arg8, var21, var27, var19, var18, arg10);
                var70 = var69.field466;
            } else {
                var70 = new class67(arg1, 10, arg5 == 11 ? arg8 + 4 : arg8, arg9, arg2, arg4, -1, var11.field4625, (class55) null);
            }
            if (var70 != null) {
                boolean var71 = class40.method356(arg7, arg2, arg4, var21, var12, var13, var70, 0, var24);
                if (var11.field4614 && var71 && arg10) {
                    int var72 = 15;
                    if (var70 instanceof class11) {
                        var72 = ((class11) var70).method85() / 4;
                        if (var72 > 30) {
                            var72 = 30;
                        }
                    }
                    for (int var73 = 0; var73 <= var12; var73++) {
                        for (int var74 = 0; var74 <= var13; var74++) {
                            if (var72 > class247.field3927[arg7][arg2 + var73][arg4 + var74]) {
                                class247.field3927[arg7][arg2 + var73][arg4 + var74] = (byte) var72;
                            }
                        }
                    }
                }
            }
            if (var11.field4621 != 0 && arg0 != null) {
                arg0.method674(var13, var11.field4611, (byte) -66, !var11.field4655, var12, arg4, arg2);
            }
        } else if (arg5 >= 12) {
            class55 var32;
            if (var11.field4650 == -1 && var11.field4656 == null && var11.field4598 == null && !var11.field4586) {
                class27 var31 = var11.method1961(var20, (byte) 97, arg5, (class13) null, var26, arg8, var21, var27, var19, var18, arg10);
                var32 = var31.field466;
            } else {
                var32 = new class67(arg1, arg5, arg8, arg9, arg2, arg4, -1, var11.field4625, (class55) null);
            }
            class40.method356(arg7, arg2, arg4, var21, 1, 1, var32, 0, var24);
            if (arg10 && arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg7 > 0 && var11.field4599 != 0) {
                class156.field2328[arg7][arg2][arg4] = class44.method377(class156.field2328[arg7][arg2][arg4], 4);
            }
            if (var11.field4621 != 0 && arg0 != null) {
                arg0.method674(var13, var11.field4611, (byte) -66, !var11.field4655, var12, arg4, arg2);
            }
        } else if (arg5 == 0) {
            class55 var34;
            if (var11.field4650 == -1 && var11.field4656 == null && var11.field4598 == null && !var11.field4586) {
                class27 var33 = var11.method1961(var20, (byte) 126, 0, (class13) null, var26, arg8, var21, var27, var19, var18, arg10);
                var34 = var33.field466;
            } else {
                var34 = new class67(arg1, 0, arg8, arg9, arg2, arg4, -1, var11.field4625, (class55) null);
            }
            class135.method1000(arg7, arg2, arg4, var21, var34, (class55) null, class129.field1926[arg8], 0, var24);
            if (arg10) {
                if (arg8 == 0) {
                    if (var11.field4614) {
                        class247.field3927[arg7][arg2][arg4] = 50;
                        class247.field3927[arg7][arg2][arg4 + 1] = 50;
                    }
                    if (var11.field4599 == 1) {
                        class156.field2328[arg7][arg2][arg4] = class44.method377(class156.field2328[arg7][arg2][arg4], 1);
                    }
                } else if (arg8 == 1) {
                    if (var11.field4614) {
                        class247.field3927[arg7][arg2][arg4 + 1] = 50;
                        class247.field3927[arg7][arg2 + 1][arg4 + 1] = 50;
                    }
                    if (var11.field4599 == 1) {
                        class156.field2328[arg7][arg2][arg4 + 1] = class44.method377(class156.field2328[arg7][arg2][arg4 + 1], 2);
                    }
                } else if (arg8 == 2) {
                    if (var11.field4614) {
                        class247.field3927[arg7][arg2 + 1][arg4] = 50;
                        class247.field3927[arg7][arg2 + 1][arg4 + 1] = 50;
                    }
                    if (var11.field4599 == 1) {
                        class156.field2328[arg7][arg2 + 1][arg4] = class44.method377(class156.field2328[arg7][arg2 + 1][arg4], 1);
                    }
                } else if (arg8 == 3) {
                    if (var11.field4614) {
                        class247.field3927[arg7][arg2][arg4] = 50;
                        class247.field3927[arg7][arg2 + 1][arg4] = 50;
                    }
                    if (var11.field4599 == 1) {
                        class156.field2328[arg7][arg2][arg4] = class44.method377(class156.field2328[arg7][arg2][arg4], 2);
                    }
                }
            }
            if (var11.field4621 != 0 && arg0 != null) {
                arg0.method675(arg4, arg5, (byte) -99, var11.field4611, !var11.field4655, arg2, arg8);
            }
            if (var11.field4638 != 16) {
                class154.method1116(arg7, arg2, arg4, var11.field4638);
            }
        } else if (arg5 == 1) {
            class55 var36;
            if (var11.field4650 == -1 && var11.field4656 == null && var11.field4598 == null && !var11.field4586) {
                class27 var35 = var11.method1961(var20, (byte) 102, 1, (class13) null, var26, arg8, var21, var27, var19, var18, arg10);
                var36 = var35.field466;
            } else {
                var36 = new class67(arg1, 1, arg8, arg9, arg2, arg4, -1, var11.field4625, (class55) null);
            }
            class135.method1000(arg7, arg2, arg4, var21, var36, (class55) null, class167.field2525[arg8], 0, var24);
            if (var11.field4614 && arg10) {
                if (arg8 == 0) {
                    class247.field3927[arg7][arg2][arg4 + 1] = 50;
                } else if (arg8 == 1) {
                    class247.field3927[arg7][arg2 + 1][arg4 + 1] = 50;
                } else if (arg8 == 2) {
                    class247.field3927[arg7][arg2 + 1][arg4] = 50;
                } else if (arg8 == 3) {
                    class247.field3927[arg7][arg2][arg4] = 50;
                }
            }
            if (var11.field4621 != 0 && arg0 != null) {
                arg0.method675(arg4, arg5, (byte) -126, var11.field4611, !var11.field4655, arg2, arg8);
            }
        } else if (arg5 == 2) {
            int var37 = arg8 + 1 & 0x3;
            class55 var39;
            class55 var41;
            if (var11.field4650 == -1 && var11.field4656 == null && var11.field4598 == null && !var11.field4586) {
                class27 var38 = var11.method1961(var20, (byte) 114, 2, (class13) null, var26, arg8 + 4, var21, var27, var19, var18, arg10);
                var39 = var38.field466;
                class27 var40 = var11.method1961(var20, (byte) 120, 2, (class13) null, var26, var37, var21, var27, var19, var18, arg10);
                var41 = var40.field466;
            } else {
                var39 = new class67(arg1, 2, arg8 + 4, arg9, arg2, arg4, -1, var11.field4625, (class55) null);
                var41 = new class67(arg1, 2, var37, arg9, arg2, arg4, -1, var11.field4625, (class55) null);
            }
            class135.method1000(arg7, arg2, arg4, var21, var39, var41, class129.field1926[arg8], class129.field1926[var37], var24);
            if (var11.field4599 == 1 && arg10) {
                if (arg8 == 0) {
                    class156.field2328[arg7][arg2][arg4] = class44.method377(class156.field2328[arg7][arg2][arg4], 1);
                    class156.field2328[arg7][arg2][arg4 + 1] = class44.method377(class156.field2328[arg7][arg2][arg4 + 1], 2);
                } else if (arg8 == 1) {
                    class156.field2328[arg7][arg2][arg4 + 1] = class44.method377(class156.field2328[arg7][arg2][arg4 + 1], 2);
                    class156.field2328[arg7][arg2 + 1][arg4] = class44.method377(class156.field2328[arg7][arg2 + 1][arg4], 1);
                } else if (arg8 == 2) {
                    class156.field2328[arg7][arg2 + 1][arg4] = class44.method377(class156.field2328[arg7][arg2 + 1][arg4], 1);
                    class156.field2328[arg7][arg2][arg4] = class44.method377(class156.field2328[arg7][arg2][arg4], 2);
                } else if (arg8 == 3) {
                    class156.field2328[arg7][arg2][arg4] = class44.method377(class156.field2328[arg7][arg2][arg4], 2);
                    class156.field2328[arg7][arg2][arg4] = class44.method377(class156.field2328[arg7][arg2][arg4], 1);
                }
            }
            if (var11.field4621 != 0 && arg0 != null) {
                arg0.method675(arg4, arg5, (byte) -91, var11.field4611, !var11.field4655, arg2, arg8);
            }
            if (var11.field4638 != 16) {
                class154.method1116(arg7, arg2, arg4, var11.field4638);
            }
        } else if (arg5 == 3) {
            class55 var43;
            if (var11.field4650 == -1 && var11.field4656 == null && var11.field4598 == null && !var11.field4586) {
                class27 var42 = var11.method1961(var20, (byte) 123, 3, (class13) null, var26, arg8, var21, var27, var19, var18, arg10);
                var43 = var42.field466;
            } else {
                var43 = new class67(arg1, 3, arg8, arg9, arg2, arg4, -1, var11.field4625, (class55) null);
            }
            class135.method1000(arg7, arg2, arg4, var21, var43, (class55) null, class167.field2525[arg8], 0, var24);
            if (var11.field4614 && arg10) {
                if (arg8 == 0) {
                    class247.field3927[arg7][arg2][arg4 + 1] = 50;
                } else if (arg8 == 1) {
                    class247.field3927[arg7][arg2 + 1][arg4 + 1] = 50;
                } else if (arg8 == 2) {
                    class247.field3927[arg7][arg2 + 1][arg4] = 50;
                } else if (arg8 == 3) {
                    class247.field3927[arg7][arg2][arg4] = 50;
                }
            }
            if (var11.field4621 != 0 && arg0 != null) {
                arg0.method675(arg4, arg5, (byte) -127, var11.field4611, !var11.field4655, arg2, arg8);
            }
        } else if (arg5 == 9) {
            class55 var45;
            if (var11.field4650 == -1 && var11.field4656 == null && var11.field4598 == null && !var11.field4586) {
                class27 var44 = var11.method1961(var20, (byte) 112, arg5, (class13) null, var26, arg8, var21, var27, var19, var18, arg10);
                var45 = var44.field466;
            } else {
                var45 = new class67(arg1, arg5, arg8, arg9, arg2, arg4, -1, var11.field4625, (class55) null);
            }
            class40.method356(arg7, arg2, arg4, var21, 1, 1, var45, 0, var24);
            if (var11.field4621 != 0 && arg0 != null) {
                arg0.method674(var13, var11.field4611, (byte) -66, !var11.field4655, var12, arg4, arg2);
            }
            if (var11.field4638 != 16) {
                class154.method1116(arg7, arg2, arg4, var11.field4638);
            }
        } else if (arg5 == 4) {
            class55 var47;
            if (var11.field4650 == -1 && var11.field4656 == null && var11.field4598 == null && !var11.field4586) {
                class27 var46 = var11.method1961(var20, (byte) 115, 4, (class13) null, var26, arg8, var21, var27, var19, var18, arg10);
                var47 = var46.field466;
            } else {
                var47 = new class67(arg1, 4, arg8, arg9, arg2, arg4, -1, var11.field4625, (class55) null);
            }
            class130.method965(arg7, arg2, arg4, var21, var47, (class55) null, class129.field1926[arg8], 0, 0, 0, var24);
        } else if (arg5 == 5) {
            long var48 = class254.method1722(arg7, arg2, arg4);
            int var50 = 16;
            if (var48 != 0L) {
                var50 = class166.method1209(-32, Integer.MAX_VALUE & (int) (var48 >>> 32)).field4638;
            }
            class55 var52;
            if (var11.field4650 == -1 && var11.field4656 == null && var11.field4598 == null && !var11.field4586) {
                class27 var51 = var11.method1961(var20, (byte) 104, 4, (class13) null, var26, arg8, var21, var27, var19, var18, arg10);
                var52 = var51.field466;
            } else {
                var52 = new class67(arg1, 4, arg8, arg9, arg2, arg4, -1, var11.field4625, (class55) null);
            }
            class130.method965(arg7, arg2, arg4, var21, var52, (class55) null, class129.field1926[arg8], 0, class273.field4357[arg8] * var50, class175.field2699[arg8] * var50, var24);
        } else if (arg5 == 6) {
            long var53 = class254.method1722(arg7, arg2, arg4);
            int var55 = 8;
            if (var53 != 0L) {
                var55 = class166.method1209(-93, (int) (var53 >>> 32) & Integer.MAX_VALUE).field4638 / 2;
            }
            class55 var57;
            if (var11.field4650 == -1 && var11.field4656 == null && var11.field4598 == null && !var11.field4586) {
                class27 var56 = var11.method1961(var20, (byte) 127, 4, (class13) null, var26, arg8 + 4, var21, var27, var19, var18, arg10);
                var57 = var56.field466;
            } else {
                var57 = new class67(arg1, 4, arg8 + 4, arg9, arg2, arg4, -1, var11.field4625, (class55) null);
            }
            class130.method965(arg7, arg2, arg4, var21, var57, (class55) null, 256, arg8, class298.field4810[arg8] * var55, class191.field2984[arg8] * var55, var24);
        } else if (arg5 == 7) {
            int var58 = arg8 + 2 & 0x3;
            class55 var60;
            if (var11.field4650 == -1 && var11.field4656 == null && var11.field4598 == null && !var11.field4586) {
                class27 var59 = var11.method1961(var20, (byte) 97, 4, (class13) null, var26, var58 + 4, var21, var27, var19, var18, arg10);
                var60 = var59.field466;
            } else {
                var60 = new class67(arg1, 4, var58 + 4, arg9, arg2, arg4, -1, var11.field4625, (class55) null);
            }
            class130.method965(arg7, arg2, arg4, var21, var60, (class55) null, 256, var58, 0, 0, var24);
        } else if (arg5 == 8) {
            int var61 = 8;
            long var62 = class254.method1722(arg7, arg2, arg4);
            if (var62 != 0L) {
                var61 = class166.method1209(122, (int) (var62 >>> 32) & Integer.MAX_VALUE).field4638 / 2;
            }
            int var64 = arg8 + 2 & 0x3;
            class55 var66;
            class55 var68;
            if (var11.field4650 == -1 && var11.field4656 == null && var11.field4598 == null && !var11.field4586) {
                class27 var65 = var11.method1961(var20, (byte) 114, 4, (class13) null, var26, arg8 + 4, var21, var27, var19, var18, arg10);
                var66 = var65.field466;
                class27 var67 = var11.method1961(var20, (byte) 120, 4, (class13) null, var26, var64 + 4, var21, var27, var19, var18, arg10);
                var68 = var67.field466;
            } else {
                var66 = new class67(arg1, 4, arg8 + 4, arg9, arg2, arg4, -1, var11.field4625, (class55) null);
                var68 = new class67(arg1, 4, var64 + 4, arg9, arg2, arg4, -1, var11.field4625, (class55) null);
            }
            class130.method965(arg7, arg2, arg4, var21, var66, var68, 256, arg8, class298.field4810[arg8] * var61, class191.field2984[arg8] * var61, var24);
        }
    }
}
