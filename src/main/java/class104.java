import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class104 {

    @OriginalMember(owner = "client!p", name = "c", descriptor = "Lsb;")
    private class127 field2356 = new class127(256);

    @OriginalMember(owner = "client!p", name = "t", descriptor = "Lsb;")
    private class127 field2373 = new class127(256);

    @OriginalMember(owner = "client!p", name = "k", descriptor = "Lsf;")
    private class131 field2364;

    @OriginalMember(owner = "client!p", name = "j", descriptor = "Lsf;")
    private class131 field2363;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "Lsc;")
    public static class128 field2355 = class129.method1017(false, " )2> <col=00ffff>");

    @OriginalMember(owner = "client!p", name = "g", descriptor = "Lsc;")
    public static class128 field2360 = class129.method1017(false, "<col=00ff00>");

    @OriginalMember(owner = "client!p", name = "n", descriptor = "I")
    public static int field2367 = 0;

    @OriginalMember(owner = "client!p", name = "i", descriptor = "J")
    public static volatile long field2362 = 0L;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "I")
    public static volatile int field2357 = 0;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "[Lda;")
    public static class23[] field2359 = new class23[4];

    @OriginalMember(owner = "client!p", name = "a", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "I")
    public static int field2358;

    @OriginalMember(owner = "client!p", name = "h", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!p", name = "o", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!p", name = "p", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!p", name = "q", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!p", name = "r", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!p", name = "s", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!p", name = "u", descriptor = "[Lb;")
    public static class8[] field2374;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "([IBI)Lu;")
    public final class139 method775(int[] arg0, byte arg1, int arg2) {
        field2366++;
        if (this.field2364.method1044(arg1 - 116) == 1) {
            return this.method782(arg2, 0, arg0, -115);
        }
        if (arg1 != 109) {
            method780(35, 90, -107, 7, null, null, -119, 85, -19);
        }
        if (this.field2364.method1022(97, arg2) != 1) {
            throw new RuntimeException();
        }
        return this.method782(0, arg2, arg0, -115);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IBI[I)Lu;")
    private final class139 method776(int arg0, byte arg1, int arg2, int[] arg3) {
        field2372++;
        int var5 = ((arg0 & 0x80000FFF) << 4 | arg0 >>> 12) ^ arg2;
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class139 var9 = (class139) this.field2373.method969(var7, -99);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class88 var10 = (class88) this.field2356.method969(var7, -112);
            if (arg1 > -76) {
                this.field2363 = null;
            }
            if (var10 == null) {
                var10 = class88.method691(this.field2363, arg0, arg2);
                if (var10 == null) {
                    return null;
                }
                this.field2356.method964(false, var10, var7);
            }
            class139 var11 = var10.method684(arg3);
            if (var11 == null) {
                return null;
            } else {
                var10.method172(-2658);
                this.field2373.method964(false, var11, var7);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V")
    public static final void method777(byte arg0) {
        field2361++;
        class20.field367.method152(false);
        int var1 = -42 / ((arg0 + 66) / 58);
        for (int var2 = 0; var2 < 32; var2++) {
            class137.field3245[var2] = 0L;
        }
        for (int var3 = 0; var3 < 32; var3++) {
            class113.field2548[var3] = 0L;
        }
        class86.field1952 = 0;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(B)V")
    public static final void method778(byte arg0) {
        if (arg0 > -97) {
            field2367 = -71;
        }
        for (int var1 = 0; var1 < class124.field2802; var1++) {
            int var2 = class55.field1228[var1];
            class53 var3 = class106.field2421[var2];
            int var4 = class158.field3626.method646(-15447);
            if ((var4 & 0x80) != 0) {
                var4 += class158.field3626.method646(-15447) << 8;
            }
            class51.method398(var3, var4, var2, (byte) -122);
        }
        field2368++;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V")
    public static final void method779(int arg0) {
        if (arg0 != 0) {
            method783((byte) -39);
        }
        field2370++;
        class84.field1860++;
        class152.field3502.method507(92, 195);
        for (class143 var1 = (class143) class66.field1492.method970(true); var1 != null; var1 = (class143) class66.field1492.method968(arg0 - 60)) {
            if (var1.field3351 == 0 || var1.field3351 == 3) {
                class44.method314(var1, (byte) -51, true);
            }
        }
        if (class110.field2473 != null) {
            class89.method696(class110.field2473, 1);
            class110.field2473 = null;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIILda;Lbe;III)V")
    public static final void method780(int arg0, int arg1, int arg2, int arg3, class23 arg4, class13 arg5, int arg6, int arg7, int arg8) {
        field2369++;
        if (class110.field2487 && (class110.field2485[0][arg6][arg1] & 0x2) == 0) {
            if ((class110.field2485[arg8][arg6][arg1] & 0x10) != 0) {
                return;
            }
            if (class100.method763(arg8, (byte) -110, arg6, arg1) != class73.field1634) {
                return;
            }
        }
        if (arg2 != -3570) {
            method777((byte) 52);
        }
        if (class93.field2146 > arg8) {
            class93.field2146 = arg8;
        }
        class94 var9 = class147.method1185(-2, arg0);
        int var10;
        int var11;
        if (arg3 == 1 || arg3 == 3) {
            var11 = var9.field2195;
            var10 = var9.field2166;
        } else {
            var10 = var9.field2195;
            var11 = var9.field2166;
        }
        int var12;
        int var13;
        if (arg6 + var11 > 104) {
            var12 = arg6;
            var13 = arg6 + 1;
        } else {
            var12 = (var11 >> 1) + arg6;
            var13 = (var11 + 1 >> 1) + arg6;
        }
        int[][] var14 = class55.field1229[arg8];
        int var15;
        int var16;
        if (arg1 + var10 <= 104) {
            var15 = (var10 >> 1) + arg1;
            var16 = arg1 + (var10 + 1 >> 1);
        } else {
            var16 = arg1 + 1;
            var15 = arg1;
        }
        int var17 = var14[var12][var15] + var14[var13][var15] + var14[var12][var16] + var14[var13][var16] >> 2;
        int var18 = (arg6 << 7) + (var11 << 6);
        int var19 = (arg1 << 7) + (var10 << 6);
        int var20 = arg6 + (arg1 << 7) + (arg0 << 14) + 1073741824;
        if (var9.field2203 == 0) {
            var20 += Integer.MIN_VALUE;
        }
        int var21 = (arg3 << 6) + arg7;
        if (var9.field2149 == 1) {
            var21 += 256;
        }
        if (var9.method734(false)) {
            class35.method252((byte) -38, arg1, var9, arg8, arg3, arg6);
        }
        if (arg7 == 22) {
            if (!class110.field2487 || var9.field2203 != 0 || var9.field2196 == 1 || var9.field2180) {
                class156 var22;
                if (var9.field2183 == -1 && var9.field2164 == null) {
                    var22 = var9.method731(22, var14, arg3, var19, (byte) 126, var17, var18);
                } else {
                    var22 = new class40(arg0, 22, arg3, arg8, arg6, arg1, var9.field2183, true, null);
                }
                arg5.method126(arg8, arg6, arg1, var17, var22, var20, var21);
                if (var9.field2196 == 1 && arg4 != null) {
                    arg4.method212(arg1, arg6, false);
                }
            }
        } else if (arg7 == 10 || arg7 == 11) {
            class156 var45;
            if (var9.field2183 == -1 && var9.field2164 == null) {
                var45 = var9.method731(10, var14, arg3, var19, (byte) 105, var17, var18);
            } else {
                var45 = new class40(arg0, 10, arg3, arg8, arg6, arg1, var9.field2183, true, null);
            }
            if (var45 != null && arg5.method111(arg8, arg6, arg1, var17, var11, var10, var45, arg7 == 11 ? 256 : 0, var20, var21) && var9.field2188) {
                int var46 = 15;
                if (var45 instanceof class78) {
                    var46 = ((class78) var45).method580() / 4;
                    if (var46 > 30) {
                        var46 = 30;
                    }
                }
                for (int var47 = 0; var47 <= var11; var47++) {
                    for (int var48 = 0; var48 <= var10; var48++) {
                        if (var46 > class29.field559[arg8][arg6 + var47][arg1 + var48]) {
                            class29.field559[arg8][arg6 + var47][arg1 + var48] = (byte) var46;
                        }
                    }
                }
            }
            if (var9.field2196 != 0 && arg4 != null) {
                arg4.method214(8, var10, arg6, var11, arg1, var9.field2191);
            }
        } else if (arg7 >= 12) {
            class156 var23;
            if (var9.field2183 == -1 && var9.field2164 == null) {
                var23 = var9.method731(arg7, var14, arg3, var19, (byte) -35, var17, var18);
            } else {
                var23 = new class40(arg0, arg7, arg3, arg8, arg6, arg1, var9.field2183, true, null);
            }
            arg5.method111(arg8, arg6, arg1, var17, 1, 1, var23, 0, var20, var21);
            if (arg7 >= 12 && arg7 <= 17 && arg7 != 13 && arg8 > 0) {
                class95.field2229[arg8][arg6][arg1] = class97.method751(class95.field2229[arg8][arg6][arg1], 2340);
            }
            if (var9.field2196 != 0 && arg4 != null) {
                arg4.method214(8, var10, arg6, var11, arg1, var9.field2191);
            }
        } else if (arg7 == 0) {
            class156 var24;
            if (var9.field2183 == -1 && var9.field2164 == null) {
                var24 = var9.method731(0, var14, arg3, var19, (byte) 102, var17, var18);
            } else {
                var24 = new class40(arg0, 0, arg3, arg8, arg6, arg1, var9.field2183, true, null);
            }
            arg5.method112(arg8, arg6, arg1, var17, var24, null, class90.field2061[arg3], 0, var20, var21);
            if (arg3 == 0) {
                if (var9.field2188) {
                    class29.field559[arg8][arg6][arg1] = 50;
                    class29.field559[arg8][arg6][arg1 + 1] = 50;
                }
                if (var9.field2202) {
                    class95.field2229[arg8][arg6][arg1] = class97.method751(class95.field2229[arg8][arg6][arg1], 585);
                }
            } else if (arg3 == 1) {
                if (var9.field2188) {
                    class29.field559[arg8][arg6][arg1 + 1] = 50;
                    class29.field559[arg8][arg6 + 1][arg1 + 1] = 50;
                }
                if (var9.field2202) {
                    class95.field2229[arg8][arg6][arg1 + 1] = class97.method751(class95.field2229[arg8][arg6][arg1 + 1], 1170);
                }
            } else if (arg3 == 2) {
                if (var9.field2188) {
                    class29.field559[arg8][arg6 + 1][arg1] = 50;
                    class29.field559[arg8][arg6 + 1][arg1 + 1] = 50;
                }
                if (var9.field2202) {
                    class95.field2229[arg8][arg6 + 1][arg1] = class97.method751(class95.field2229[arg8][arg6 + 1][arg1], 585);
                }
            } else if (arg3 == 3) {
                if (var9.field2188) {
                    class29.field559[arg8][arg6][arg1] = 50;
                    class29.field559[arg8][arg6 + 1][arg1] = 50;
                }
                if (var9.field2202) {
                    class95.field2229[arg8][arg6][arg1] = class97.method751(class95.field2229[arg8][arg6][arg1], 1170);
                }
            }
            if (var9.field2196 != 0 && arg4 != null) {
                arg4.method209(arg6, arg1, arg3, (byte) -126, arg7, var9.field2191);
            }
            if (var9.field2201 != 16) {
                arg5.method110(arg8, arg6, arg1, var9.field2201);
            }
        } else if (arg7 == 1) {
            class156 var25;
            if (var9.field2183 == -1 && var9.field2164 == null) {
                var25 = var9.method731(1, var14, arg3, var19, (byte) -66, var17, var18);
            } else {
                var25 = new class40(arg0, 1, arg3, arg8, arg6, arg1, var9.field2183, true, null);
            }
            arg5.method112(arg8, arg6, arg1, var17, var25, null, class117.field2624[arg3], 0, var20, var21);
            if (var9.field2188) {
                if (arg3 == 0) {
                    class29.field559[arg8][arg6][arg1 + 1] = 50;
                } else if (arg3 == 1) {
                    class29.field559[arg8][arg6 + 1][arg1 + 1] = 50;
                } else if (arg3 == 2) {
                    class29.field559[arg8][arg6 + 1][arg1] = 50;
                } else if (arg3 == 3) {
                    class29.field559[arg8][arg6][arg1] = 50;
                }
            }
            if (var9.field2196 != 0 && arg4 != null) {
                arg4.method209(arg6, arg1, arg3, (byte) -126, arg7, var9.field2191);
            }
        } else if (arg7 == 2) {
            int var26 = arg3 + 1 & 0x3;
            class156 var27;
            class156 var28;
            if (var9.field2183 == -1 && var9.field2164 == null) {
                var27 = var9.method731(2, var14, arg3 + 4, var19, (byte) 105, var17, var18);
                var28 = var9.method731(2, var14, var26, var19, (byte) -93, var17, var18);
            } else {
                var27 = new class40(arg0, 2, arg3 + 4, arg8, arg6, arg1, var9.field2183, true, null);
                var28 = new class40(arg0, 2, var26, arg8, arg6, arg1, var9.field2183, true, null);
            }
            arg5.method112(arg8, arg6, arg1, var17, var27, var28, class90.field2061[arg3], class90.field2061[var26], var20, var21);
            if (var9.field2202) {
                if (arg3 == 0) {
                    class95.field2229[arg8][arg6][arg1] = class97.method751(class95.field2229[arg8][arg6][arg1], 585);
                    class95.field2229[arg8][arg6][arg1 + 1] = class97.method751(class95.field2229[arg8][arg6][arg1 + 1], 1170);
                } else if (arg3 == 1) {
                    class95.field2229[arg8][arg6][arg1 + 1] = class97.method751(class95.field2229[arg8][arg6][arg1 + 1], 1170);
                    class95.field2229[arg8][arg6 + 1][arg1] = class97.method751(class95.field2229[arg8][arg6 + 1][arg1], 585);
                } else if (arg3 == 2) {
                    class95.field2229[arg8][arg6 + 1][arg1] = class97.method751(class95.field2229[arg8][arg6 + 1][arg1], 585);
                    class95.field2229[arg8][arg6][arg1] = class97.method751(class95.field2229[arg8][arg6][arg1], 1170);
                } else if (arg3 == 3) {
                    class95.field2229[arg8][arg6][arg1] = class97.method751(class95.field2229[arg8][arg6][arg1], 1170);
                    class95.field2229[arg8][arg6][arg1] = class97.method751(class95.field2229[arg8][arg6][arg1], 585);
                }
            }
            if (var9.field2196 != 0 && arg4 != null) {
                arg4.method209(arg6, arg1, arg3, (byte) -126, arg7, var9.field2191);
            }
            if (var9.field2201 != 16) {
                arg5.method110(arg8, arg6, arg1, var9.field2201);
            }
        } else if (arg7 == 3) {
            class156 var29;
            if (var9.field2183 == -1 && var9.field2164 == null) {
                var29 = var9.method731(3, var14, arg3, var19, (byte) -75, var17, var18);
            } else {
                var29 = new class40(arg0, 3, arg3, arg8, arg6, arg1, var9.field2183, true, null);
            }
            arg5.method112(arg8, arg6, arg1, var17, var29, null, class117.field2624[arg3], 0, var20, var21);
            if (var9.field2188) {
                if (arg3 == 0) {
                    class29.field559[arg8][arg6][arg1 + 1] = 50;
                } else if (arg3 == 1) {
                    class29.field559[arg8][arg6 + 1][arg1 + 1] = 50;
                } else if (arg3 == 2) {
                    class29.field559[arg8][arg6 + 1][arg1] = 50;
                } else if (arg3 == 3) {
                    class29.field559[arg8][arg6][arg1] = 50;
                }
            }
            if (var9.field2196 != 0 && arg4 != null) {
                arg4.method209(arg6, arg1, arg3, (byte) -126, arg7, var9.field2191);
            }
        } else if (arg7 == 9) {
            class156 var30;
            if (var9.field2183 == -1 && var9.field2164 == null) {
                var30 = var9.method731(arg7, var14, arg3, var19, (byte) 110, var17, var18);
            } else {
                var30 = new class40(arg0, arg7, arg3, arg8, arg6, arg1, var9.field2183, true, null);
            }
            arg5.method111(arg8, arg6, arg1, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field2196 != 0 && arg4 != null) {
                arg4.method214(8, var10, arg6, var11, arg1, var9.field2191);
            }
            if (var9.field2201 != 16) {
                arg5.method110(arg8, arg6, arg1, var9.field2201);
            }
        } else if (arg7 == 4) {
            class156 var31;
            if (var9.field2183 == -1 && var9.field2164 == null) {
                var31 = var9.method731(4, var14, arg3, var19, (byte) 105, var17, var18);
            } else {
                var31 = new class40(arg0, 4, arg3, arg8, arg6, arg1, var9.field2183, true, null);
            }
            arg5.method133(arg8, arg6, arg1, var17, var31, null, class90.field2061[arg3], 0, 0, 0, var20, var21);
        } else if (arg7 == 5) {
            int var32 = 16;
            int var33 = arg5.method128(arg8, arg6, arg1);
            if (var33 != 0) {
                var32 = class147.method1185(-2, var33 >> 14 & 0x7FFF).field2201;
            }
            class156 var34;
            if (var9.field2183 == -1 && var9.field2164 == null) {
                var34 = var9.method731(4, var14, arg3, var19, (byte) -101, var17, var18);
            } else {
                var34 = new class40(arg0, 4, arg3, arg8, arg6, arg1, var9.field2183, true, null);
            }
            arg5.method133(arg8, arg6, arg1, var17, var34, null, class90.field2061[arg3], 0, class110.field2480[arg3] * var32, class125.field2843[arg3] * var32, var20, var21);
        } else if (arg7 == 6) {
            int var35 = 8;
            int var36 = arg5.method128(arg8, arg6, arg1);
            if (var36 != 0) {
                var35 = class147.method1185(arg2 ^ 0xDF0, var36 >> 14 & 0x7FFF).field2201 / 2;
            }
            class156 var37;
            if (var9.field2183 == -1 && var9.field2164 == null) {
                var37 = var9.method731(4, var14, arg3 + 4, var19, (byte) 98, var17, var18);
            } else {
                var37 = new class40(arg0, 4, arg3 + 4, arg8, arg6, arg1, var9.field2183, true, null);
            }
            arg5.method133(arg8, arg6, arg1, var17, var37, null, 256, arg3, class105.field2378[arg3] * var35, class62.field1338[arg3] * var35, var20, var21);
        } else if (arg7 == 7) {
            int var38 = arg3 + 2 & 0x3;
            class156 var39;
            if (var9.field2183 == -1 && var9.field2164 == null) {
                var39 = var9.method731(4, var14, var38 + 4, var19, (byte) 119, var17, var18);
            } else {
                var39 = new class40(arg0, 4, var38 + 4, arg8, arg6, arg1, var9.field2183, true, null);
            }
            arg5.method133(arg8, arg6, arg1, var17, var39, null, 256, var38, 0, 0, var20, var21);
        } else if (arg7 == 8) {
            int var40 = 8;
            int var41 = arg5.method128(arg8, arg6, arg1);
            if (var41 != 0) {
                var40 = class147.method1185(-2, var41 >> 14 & 0x7FFF).field2201 / 2;
            }
            int var42 = arg3 + 2 & 0x3;
            class156 var43;
            class156 var44;
            if (var9.field2183 == -1 && var9.field2164 == null) {
                var43 = var9.method731(4, var14, arg3 + 4, var19, (byte) 101, var17, var18);
                var44 = var9.method731(4, var14, var42 + 4, var19, (byte) -75, var17, var18);
            } else {
                var43 = new class40(arg0, 4, arg3 + 4, arg8, arg6, arg1, var9.field2183, true, null);
                var44 = new class40(arg0, 4, var42 + 4, arg8, arg6, arg1, var9.field2183, true, null);
            }
            arg5.method133(arg8, arg6, arg1, var17, var43, var44, 256, arg3, class105.field2378[arg3] * var40, class62.field1338[arg3] * var40, var20, var21);
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "([IBI)Lu;")
    public final class139 method781(int[] arg0, byte arg1, int arg2) {
        field2354++;
        if (this.field2363.method1044(-7) == 1) {
            return this.method776(0, (byte) -92, arg2, arg0);
        } else if (this.field2363.method1022(39, arg2) == 1) {
            return this.method776(arg2, (byte) -100, 0, arg0);
        } else if (arg1 == 29) {
            throw new RuntimeException();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II[II)Lu;")
    private final class139 method782(int arg0, int arg1, int[] arg2, int arg3) {
        field2358++;
        int var5 = (arg1 >>> 12 | arg1 << 4 & 0xFFF7) ^ arg0;
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6;
        class139 var9 = (class139) this.field2373.method969(var7, -90);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class17 var10 = class17.method158(this.field2364, arg1, arg0);
            if (var10 == null) {
                return null;
            }
            class139 var11 = var10.method157();
            if (arg3 >= -91) {
                this.field2363 = null;
            }
            this.field2373.method964(false, var11, var7);
            if (arg2 != null) {
                arg2[0] -= var11.field3257.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(B)V")
    public static void method783(byte arg0) {
        field2360 = null;
        if (arg0 < -46) {
            field2374 = null;
            field2359 = null;
            field2355 = null;
        }
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lsf;Lsf;)V")
    public class104(class131 arg0, class131 arg1) {
        this.field2364 = arg0;
        this.field2363 = arg1;
    }
}
