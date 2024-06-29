import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class13 extends class139 {

    @OriginalMember(owner = "client!lg", name = "t", descriptor = "I")
    private int field348 = -32768;

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "J")
    public static long field340 = 0L;

    @OriginalMember(owner = "client!lg", name = "q", descriptor = "I")
    public static int field345 = 0;

    @OriginalMember(owner = "client!lg", name = "u", descriptor = "Loh;")
    public static class263 field349 = class253.method1681(-120, "blaugr-Un:");

    @OriginalMember(owner = "client!lg", name = "r", descriptor = "Ln;")
    public static class16 field346 = new class16();

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!lg", name = "m", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!lg", name = "n", descriptor = "I")
    public int field342;

    @OriginalMember(owner = "client!lg", name = "o", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!lg", name = "p", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!lg", name = "s", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!lg", name = "v", descriptor = "I")
    public int field350;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "(III)J")
    public static final long method103(int arg0, int arg1, int arg2) {
        class2 var3 = class18.field417[arg0][arg1][arg2];
        return var3 == null || var3.field52 == null ? 0L : var3.field52.field3013;
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "(I)V")
    public static void method104(int arg0) {
        field346 = null;
        field349 = null;
        if (arg0 > -108) {
            field349 = null;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method105(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field343++;
        class76 var11 = class92.method649(-32508, this.field342).method471(0, (class240) null, 31246, this.field350);
        if (var11 != null) {
            var11.method105(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field348 = var11.method106();
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "()I")
    public final int method106() {
        field339++;
        return this.field348;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IZIIBIIIILpg;Z)V")
    public static final void method107(int arg0, boolean arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, class73 arg9, boolean arg10) {
        field341++;
        if (arg10 && !class77.method526(-26670) && (class77.field1576[0][arg7][arg5] & 0x2) == 0) {
            if ((class77.field1576[arg8][arg7][arg5] & 0x10) != 0) {
                return;
            }
            if (class54.method348(arg5, 3282, arg7, arg8) != class171.field3128) {
                return;
            }
        }
        if (arg8 < class51.field1100) {
            class51.field1100 = arg8;
        }
        class12 var11 = class117.method763(arg0, (byte) 111);
        if (arg4 != -21) {
            method107(-42, true, -21, 4, (byte) -39, -78, 62, 74, -117, (class73) null, true);
        }
        int var12;
        int var13;
        if (arg2 == 1 || arg2 == 3) {
            var13 = var11.field308;
            var12 = var11.field329;
        } else {
            var12 = var11.field308;
            var13 = var11.field329;
        }
        int var14;
        int var15;
        if (arg7 + var13 <= 104) {
            var14 = (var13 + 1 >> 1) + arg7;
            var15 = (var13 >> 1) + arg7;
        } else {
            var14 = arg7 + 1;
            var15 = arg7;
        }
        int var16;
        int var17;
        if (arg5 + var12 <= 104) {
            var16 = (var12 >> 1) + arg5;
            var17 = (var12 + 1 >> 1) + arg5;
        } else {
            var17 = arg5 + 1;
            var16 = arg5;
        }
        int var18 = (arg7 << 7) + (var13 << 6);
        int var19 = (arg5 << 7) + (var12 << 6);
        int[][] var20 = class112.field2102[arg3];
        int var21 = var20[var15][var16] + var20[var14][var16] + var20[var15][var17] + var20[var14][var17] >> 2;
        int[][] var22 = null;
        if (arg1) {
            var22 = class163.field2968[0];
        } else if (arg3 < 3) {
            var22 = class112.field2102[arg3 + 1];
        }
        long var23 = (long) (arg6 << 14 | arg5 << 7 | arg7 | arg2 << 20 | 0x40000000);
        if (var11.field299 == 0 || arg1) {
            var23 |= Long.MIN_VALUE;
        }
        if (var11.field282 == 1) {
            var23 |= 0x400000L;
        }
        if (var11.field277) {
            var23 |= 0x80000000L;
        }
        if (var11.method101((byte) 113)) {
            class128.method835((class90) null, arg7, var11, (class137) null, arg5, arg8, arg2, -63);
        }
        boolean var25 = !arg1 & var11.field265;
        long var26 = var23 | (long) arg0 << 32;
        if (arg6 == 22) {
            if (class146.field2670 || var11.field299 != 0 || var11.field331 == 1 || var11.field300) {
                class139 var29;
                if (var11.field326 == -1 && var11.field328 == null) {
                    class100 var28 = var11.method93(var22, var21, var19, var25, var20, arg10, var18, 22, (class88) null, -27556, arg2);
                    var29 = var28.field1911;
                } else {
                    var29 = new class82(arg0, 22, arg2, arg3, arg7, arg5, var11.field326, var11.field302, (class139) null);
                }
                class116.method760(arg8, arg7, arg5, var21, var29, var26, var11.field285);
                if (var11.field331 == 1 && arg9 != null) {
                    arg9.method484(arg5, arg4 ^ 0x5942, arg7);
                }
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class139 var69;
            if (var11.field326 == -1 && var11.field328 == null) {
                class100 var68 = var11.method93(var22, var21, var19, var25, var20, arg10, var18, 10, (class88) null, -27556, arg6 == 11 ? arg2 + 4 : arg2);
                var69 = var68.field1911;
            } else {
                var69 = new class82(arg0, 10, arg6 == 11 ? arg2 + 4 : arg2, arg3, arg7, arg5, var11.field326, var11.field302, (class139) null);
            }
            if (var69 != null) {
                boolean var70 = class245.method1662(arg8, arg7, arg5, var21, var13, var12, var69, 0, var26);
                if (var11.field317 && var70 && arg10) {
                    int var71 = 15;
                    if (var69 instanceof class76) {
                        var71 = ((class76) var69).method505() / 4;
                        if (var71 > 30) {
                            var71 = 30;
                        }
                    }
                    for (int var72 = 0; var72 <= var13; var72++) {
                        for (int var73 = 0; var73 <= var12; var73++) {
                            if (var71 > class232.field4052[arg8][arg7 + var72][arg5 + var73]) {
                                class232.field4052[arg8][arg7 + var72][arg5 + var73] = (byte) var71;
                            }
                        }
                    }
                }
            }
            if (var11.field331 != 0 && arg9 != null) {
                arg9.method482(var12, -115, arg7, var13, var11.field283, arg5);
            }
        } else if (arg6 >= 12) {
            class139 var31;
            if (var11.field326 == -1 && var11.field328 == null) {
                class100 var30 = var11.method93(var22, var21, var19, var25, var20, arg10, var18, arg6, (class88) null, -27556, arg2);
                var31 = var30.field1911;
            } else {
                var31 = new class82(arg0, arg6, arg2, arg3, arg7, arg5, var11.field326, var11.field302, (class139) null);
            }
            class245.method1662(arg8, arg7, arg5, var21, 1, 1, var31, 0, var26);
            if (arg10 && arg6 >= 12 && arg6 <= 17 && arg6 != 13 && arg8 > 0) {
                client.field2763[arg8][arg7][arg5] = class160.method1052(client.field2763[arg8][arg7][arg5], 4);
            }
            if (var11.field331 != 0 && arg9 != null) {
                arg9.method482(var12, -92, arg7, var13, var11.field283, arg5);
            }
        } else if (arg6 == 0) {
            class139 var33;
            if (var11.field326 == -1 && var11.field328 == null) {
                class100 var32 = var11.method93(var22, var21, var19, var25, var20, arg10, var18, 0, (class88) null, arg4 - 27535, arg2);
                var33 = var32.field1911;
            } else {
                var33 = new class82(arg0, 0, arg2, arg3, arg7, arg5, var11.field326, var11.field302, (class139) null);
            }
            class216.method1467(arg8, arg7, arg5, var21, var33, (class139) null, class219.field3888[arg2], 0, var26);
            if (arg10) {
                if (arg2 == 0) {
                    if (var11.field317) {
                        class232.field4052[arg8][arg7][arg5] = 50;
                        class232.field4052[arg8][arg7][arg5 + 1] = 50;
                    }
                    if (var11.field281) {
                        client.field2763[arg8][arg7][arg5] = class160.method1052(client.field2763[arg8][arg7][arg5], 1);
                    }
                } else if (arg2 == 1) {
                    if (var11.field317) {
                        class232.field4052[arg8][arg7][arg5 + 1] = 50;
                        class232.field4052[arg8][arg7 + 1][arg5 + 1] = 50;
                    }
                    if (var11.field281) {
                        client.field2763[arg8][arg7][arg5 + 1] = class160.method1052(client.field2763[arg8][arg7][arg5 + 1], 2);
                    }
                } else if (arg2 == 2) {
                    if (var11.field317) {
                        class232.field4052[arg8][arg7 + 1][arg5] = 50;
                        class232.field4052[arg8][arg7 + 1][arg5 + 1] = 50;
                    }
                    if (var11.field281) {
                        client.field2763[arg8][arg7 + 1][arg5] = class160.method1052(client.field2763[arg8][arg7 + 1][arg5], 1);
                    }
                } else if (arg2 == 3) {
                    if (var11.field317) {
                        class232.field4052[arg8][arg7][arg5] = 50;
                        class232.field4052[arg8][arg7 + 1][arg5] = 50;
                    }
                    if (var11.field281) {
                        client.field2763[arg8][arg7][arg5] = class160.method1052(client.field2763[arg8][arg7][arg5], 2);
                    }
                }
            }
            if (var11.field331 != 0 && arg9 != null) {
                arg9.method477(var11.field283, arg2, arg6, arg7, arg5, true);
            }
            if (var11.field275 != 16) {
                class119.method771(arg8, arg7, arg5, var11.field275);
            }
        } else if (arg6 == 1) {
            class139 var35;
            if (var11.field326 == -1 && var11.field328 == null) {
                class100 var34 = var11.method93(var22, var21, var19, var25, var20, arg10, var18, 1, (class88) null, -27556, arg2);
                var35 = var34.field1911;
            } else {
                var35 = new class82(arg0, 1, arg2, arg3, arg7, arg5, var11.field326, var11.field302, (class139) null);
            }
            class216.method1467(arg8, arg7, arg5, var21, var35, (class139) null, client.field2766[arg2], 0, var26);
            if (var11.field317 && arg10) {
                if (arg2 == 0) {
                    class232.field4052[arg8][arg7][arg5 + 1] = 50;
                } else if (arg2 == 1) {
                    class232.field4052[arg8][arg7 + 1][arg5 + 1] = 50;
                } else if (arg2 == 2) {
                    class232.field4052[arg8][arg7 + 1][arg5] = 50;
                } else if (arg2 == 3) {
                    class232.field4052[arg8][arg7][arg5] = 50;
                }
            }
            if (var11.field331 != 0 && arg9 != null) {
                arg9.method477(var11.field283, arg2, arg6, arg7, arg5, true);
            }
        } else if (arg6 == 2) {
            int var36 = arg2 + 1 & 0x3;
            class139 var38;
            class139 var40;
            if (var11.field326 == -1 && var11.field328 == null) {
                class100 var37 = var11.method93(var22, var21, var19, var25, var20, arg10, var18, 2, (class88) null, arg4 - 27535, 4 - -arg2);
                var38 = var37.field1911;
                class100 var39 = var11.method93(var22, var21, var19, var25, var20, arg10, var18, 2, (class88) null, -27556, var36);
                var40 = var39.field1911;
            } else {
                var38 = new class82(arg0, 2, arg2 + 4, arg3, arg7, arg5, var11.field326, var11.field302, (class139) null);
                var40 = new class82(arg0, 2, var36, arg3, arg7, arg5, var11.field326, var11.field302, (class139) null);
            }
            class216.method1467(arg8, arg7, arg5, var21, var38, var40, class219.field3888[arg2], class219.field3888[var36], var26);
            if (var11.field281 && arg10) {
                if (arg2 == 0) {
                    client.field2763[arg8][arg7][arg5] = class160.method1052(client.field2763[arg8][arg7][arg5], 1);
                    client.field2763[arg8][arg7][arg5 + 1] = class160.method1052(client.field2763[arg8][arg7][arg5 + 1], 2);
                } else if (arg2 == 1) {
                    client.field2763[arg8][arg7][arg5 + 1] = class160.method1052(client.field2763[arg8][arg7][arg5 + 1], 2);
                    client.field2763[arg8][arg7 + 1][arg5] = class160.method1052(client.field2763[arg8][arg7 + 1][arg5], 1);
                } else if (arg2 == 2) {
                    client.field2763[arg8][arg7 + 1][arg5] = class160.method1052(client.field2763[arg8][arg7 + 1][arg5], 1);
                    client.field2763[arg8][arg7][arg5] = class160.method1052(client.field2763[arg8][arg7][arg5], 2);
                } else if (arg2 == 3) {
                    client.field2763[arg8][arg7][arg5] = class160.method1052(client.field2763[arg8][arg7][arg5], 2);
                    client.field2763[arg8][arg7][arg5] = class160.method1052(client.field2763[arg8][arg7][arg5], 1);
                }
            }
            if (var11.field331 != 0 && arg9 != null) {
                arg9.method477(var11.field283, arg2, arg6, arg7, arg5, true);
            }
            if (var11.field275 != 16) {
                class119.method771(arg8, arg7, arg5, var11.field275);
            }
        } else if (arg6 == 3) {
            class139 var42;
            if (var11.field326 == -1 && var11.field328 == null) {
                class100 var41 = var11.method93(var22, var21, var19, var25, var20, arg10, var18, 3, (class88) null, -27556, arg2);
                var42 = var41.field1911;
            } else {
                var42 = new class82(arg0, 3, arg2, arg3, arg7, arg5, var11.field326, var11.field302, (class139) null);
            }
            class216.method1467(arg8, arg7, arg5, var21, var42, (class139) null, client.field2766[arg2], 0, var26);
            if (var11.field317 && arg10) {
                if (arg2 == 0) {
                    class232.field4052[arg8][arg7][arg5 + 1] = 50;
                } else if (arg2 == 1) {
                    class232.field4052[arg8][arg7 + 1][arg5 + 1] = 50;
                } else if (arg2 == 2) {
                    class232.field4052[arg8][arg7 + 1][arg5] = 50;
                } else if (arg2 == 3) {
                    class232.field4052[arg8][arg7][arg5] = 50;
                }
            }
            if (var11.field331 != 0 && arg9 != null) {
                arg9.method477(var11.field283, arg2, arg6, arg7, arg5, true);
            }
        } else if (arg6 == 9) {
            class139 var44;
            if (var11.field326 == -1 && var11.field328 == null) {
                class100 var43 = var11.method93(var22, var21, var19, var25, var20, arg10, var18, arg6, (class88) null, -27556, arg2);
                var44 = var43.field1911;
            } else {
                var44 = new class82(arg0, arg6, arg2, arg3, arg7, arg5, var11.field326, var11.field302, (class139) null);
            }
            class245.method1662(arg8, arg7, arg5, var21, 1, 1, var44, 0, var26);
            if (var11.field331 != 0 && arg9 != null) {
                arg9.method482(var12, -127, arg7, var13, var11.field283, arg5);
            }
            if (var11.field275 != 16) {
                class119.method771(arg8, arg7, arg5, var11.field275);
            }
        } else if (arg6 == 4) {
            class139 var46;
            if (var11.field326 == -1 && var11.field328 == null) {
                class100 var45 = var11.method93(var22, var21, var19, var25, var20, arg10, var18, 4, (class88) null, arg4 - 27535, arg2);
                var46 = var45.field1911;
            } else {
                var46 = new class82(arg0, 4, arg2, arg3, arg7, arg5, var11.field326, var11.field302, (class139) null);
            }
            class185.method1223(arg8, arg7, arg5, var21, var46, (class139) null, class219.field3888[arg2], 0, 0, 0, var26);
        } else if (arg6 == 5) {
            int var47 = 16;
            long var48 = class148.method970(arg8, arg7, arg5);
            if (var48 != 0L) {
                var47 = class117.method763((int) (var48 >>> 32) & Integer.MAX_VALUE, (byte) 111).field275;
            }
            class139 var51;
            if (var11.field326 == -1 && var11.field328 == null) {
                class100 var50 = var11.method93(var22, var21, var19, var25, var20, arg10, var18, 4, (class88) null, -27556, arg2);
                var51 = var50.field1911;
            } else {
                var51 = new class82(arg0, 4, arg2, arg3, arg7, arg5, var11.field326, var11.field302, (class139) null);
            }
            class185.method1223(arg8, arg7, arg5, var21, var51, (class139) null, class219.field3888[arg2], 0, class186.field3354[arg2] * var47, class108.field2046[arg2] * var47, var26);
        } else if (arg6 == 6) {
            int var52 = 8;
            long var53 = class148.method970(arg8, arg7, arg5);
            if (var53 != 0L) {
                var52 = class117.method763((int) (var53 >>> 32) & Integer.MAX_VALUE, (byte) -125).field275 / 2;
            }
            class139 var56;
            if (var11.field326 == -1 && var11.field328 == null) {
                class100 var55 = var11.method93(var22, var21, var19, var25, var20, arg10, var18, 4, (class88) null, arg4 - 27535, arg2 + 4);
                var56 = var55.field1911;
            } else {
                var56 = new class82(arg0, 4, arg2 + 4, arg3, arg7, arg5, var11.field326, var11.field302, (class139) null);
            }
            class185.method1223(arg8, arg7, arg5, var21, var56, (class139) null, 256, arg2, class94.field1850[arg2] * var52, class39.field894[arg2] * var52, var26);
        } else if (arg6 == 7) {
            int var57 = arg2 + 2 & 0x3;
            class139 var59;
            if (var11.field326 == -1 && var11.field328 == null) {
                class100 var58 = var11.method93(var22, var21, var19, var25, var20, arg10, var18, 4, (class88) null, -27556, var57 + 4);
                var59 = var58.field1911;
            } else {
                var59 = new class82(arg0, 4, var57 + 4, arg3, arg7, arg5, var11.field326, var11.field302, (class139) null);
            }
            class185.method1223(arg8, arg7, arg5, var21, var59, (class139) null, 256, var57, 0, 0, var26);
        } else if (arg6 == 8) {
            int var60 = 8;
            long var61 = class148.method970(arg8, arg7, arg5);
            if (var61 != 0L) {
                var60 = class117.method763(Integer.MAX_VALUE & (int) (var61 >>> 32), (byte) 79).field275 / 2;
            }
            int var63 = arg2 + 2 & 0x3;
            class139 var65;
            class139 var67;
            if (var11.field326 == -1 && var11.field328 == null) {
                class100 var64 = var11.method93(var22, var21, var19, var25, var20, arg10, var18, 4, (class88) null, -27556, arg2 + 4);
                var65 = var64.field1911;
                class100 var66 = var11.method93(var22, var21, var19, var25, var20, arg10, var18, 4, (class88) null, -27556, var63 + 4);
                var67 = var66.field1911;
            } else {
                var65 = new class82(arg0, 4, arg2 + 4, arg3, arg7, arg5, var11.field326, var11.field302, (class139) null);
                var67 = new class82(arg0, 4, var63 + 4, arg3, arg7, arg5, var11.field326, var11.field302, (class139) null);
            }
            class185.method1223(arg8, arg7, arg5, var21, var65, var67, 256, arg2, class94.field1850[arg2] * var60, class39.field894[arg2] * var60, var26);
        }
    }
}
