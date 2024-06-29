import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class102 {

    @OriginalMember(owner = "client!r", name = "j", descriptor = "Lee;")
    private class30 field2481 = null;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "Lee;")
    private class30 field2475 = null;

    @OriginalMember(owner = "client!r", name = "v", descriptor = "I")
    private int field2493 = 65000;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "I")
    private int field2482;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "I")
    public static int field2476 = 0;

    @OriginalMember(owner = "client!r", name = "m", descriptor = "Z")
    public static boolean field2484 = false;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "I")
    public static int field2483 = 1;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "Lad;")
    public static class5 field2477 = class88.method674(" )2> @yel@", 43);

    @OriginalMember(owner = "client!r", name = "t", descriptor = "[I")
    public static int[] field2491 = new int[99];

    @OriginalMember(owner = "client!r", name = "z", descriptor = "Z")
    public static boolean field2497;

    @OriginalMember(owner = "client!r", name = "y", descriptor = "Lad;")
    private static class5 field2496;

    @OriginalMember(owner = "client!r", name = "A", descriptor = "J")
    public static long field2498;

    @OriginalMember(owner = "client!r", name = "x", descriptor = "Lad;")
    public static class5 field2495;

    @OriginalMember(owner = "client!r", name = "D", descriptor = "Lad;")
    public static class5 field2500;

    @OriginalMember(owner = "client!r", name = "w", descriptor = "Lbb;")
    public static class9 field2494;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "I")
    public static int field2472;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    public static int field2473;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "I")
    public static int field2478;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "I")
    public static int field2480;

    @OriginalMember(owner = "client!r", name = "n", descriptor = "I")
    public static int field2485;

    @OriginalMember(owner = "client!r", name = "o", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!r", name = "q", descriptor = "I")
    public static int field2488;

    @OriginalMember(owner = "client!r", name = "r", descriptor = "I")
    public static int field2489;

    @OriginalMember(owner = "client!r", name = "s", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!r", name = "u", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!r", name = "G", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "Lrc;")
    public static class105 field2479;

    @OriginalMember(owner = "client!r", name = "C", descriptor = "Lrd;")
    public static class106 field2499;

    @OriginalMember(owner = "client!r", name = "F", descriptor = "Lrd;")
    public static class106 field2502;

    @OriginalMember(owner = "client!r", name = "p", descriptor = "Lsb;")
    public static class110 field2487;

    @OriginalMember(owner = "client!r", name = "E", descriptor = "Lsb;")
    public static class110 field2501;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field2491[var1] = var0 / 4;
        }
        field2497 = false;
        field2496 = class88.method674("No response from server)3", -111);
        field2498 = 0L;
        field2495 = field2496;
        field2500 = class88.method674("Spieler kann nicht gefunden werden: ", 93);
        field2494 = new class9(64);
    }

    @OriginalMember(owner = "client!r", name = "toString", descriptor = "()Ljava/lang/String;", line = 18)
    public final String toString() {
        field2485++;
        return "Cache:" + this.field2482;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([BIII)Z", line = 26)
    public final boolean method817(byte[] arg0, int arg1, int arg2, int arg3) {
        field2473++;
        if (arg1 >= -121) {
            field2488 = -119;
        }
        class30 var5 = this.field2475;
        synchronized (this.field2475) {
            if (arg3 < 0 || this.field2493 < arg3) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method823(arg2, arg3, false, true, arg0);
            if (!var6) {
                var6 = this.method823(arg2, arg3, false, false, arg0);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V", line = 59)
    public static void method818(int arg0) {
        field2495 = null;
        int var1 = -31 % ((17 - arg0) / 43);
        field2491 = null;
        field2499 = null;
        field2496 = null;
        field2479 = null;
        field2501 = null;
        field2487 = null;
        field2477 = null;
        field2494 = null;
        field2500 = null;
        field2502 = null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IILqa;ILjd;BIII)V", line = 85)
    public static final void method819(int arg0, int arg1, class97 arg2, int arg3, class58 arg4, byte arg5, int arg6, int arg7, int arg8) {
        field2489++;
        if (class40.field1048 && (class12.field371[0][arg1][arg8] & 0x2) == 0) {
            if ((class12.field371[arg3][arg1][arg8] & 0x10) != 0) {
                return;
            }
            if (class94.method719(-1, arg1, arg8, arg3) != class83.field1951) {
                return;
            }
        }
        if (class52.field1309 > arg3) {
            class52.field1309 = arg3;
        }
        int var9 = class42.field1062[arg3][arg1 + 1][arg8];
        int var10 = class42.field1062[arg3][arg1][arg8];
        int var11 = class42.field1062[arg3][arg1][arg8 + 1];
        int var12 = (arg8 << 7) + (arg0 << 14) + arg1 + 1073741824;
        int var13 = class42.field1062[arg3][arg1 + 1][arg8 + 1];
        int var14 = var10 + var13 + var9 + var11 >> 2;
        class70 var15 = class42.method357(arg0, (byte) -42);
        int var16 = (arg6 << 6) + arg7;
        if (var15.field1667 == 0) {
            var12 += Integer.MIN_VALUE;
        }
        if (var15.field1677 == 1) {
            var16 += 256;
        }
        if (var15.method559(-6)) {
            class1.method4(arg6, arg3, 0, arg8, arg1, var15);
        }
        if (arg7 == 22) {
            if (!class40.field1048 || var15.field1667 != 0 || var15.field1697) {
                class103 var17;
                if (var15.field1691 == -1 && var15.field1655 == null) {
                    var17 = var15.method549(var9, true, var10, var11, 22, var13, arg6);
                } else {
                    var17 = new class134(arg0, 22, arg6, var10, var9, var13, var11, var15.field1691, true);
                }
                arg2.method763(arg3, arg1, arg8, var14, var17, var12, var16);
                if (var15.field1668 && var15.field1667 == 1 && arg4 != null) {
                    arg4.method464(arg8, arg1, (byte) -69);
                }
            }
        } else if (arg7 == 10 || arg7 == 11) {
            class103 var37;
            if (var15.field1691 == -1 && var15.field1655 == null) {
                var37 = var15.method549(var9, true, var10, var11, 10, var13, arg6);
            } else {
                var37 = new class134(arg0, 10, arg6, var10, var9, var13, var11, var15.field1691, true);
            }
            if (var37 != null) {
                int var38;
                int var39;
                if (arg6 == 1 || arg6 == 3) {
                    var38 = var15.field1693;
                    var39 = var15.field1705;
                } else {
                    var38 = var15.field1705;
                    var39 = var15.field1693;
                }
                int var40 = 0;
                if (arg7 == 11) {
                    var40 += 256;
                }
                if (arg2.method749(arg3, arg1, arg8, var14, var38, var39, var37, var40, var12, var16) && var15.field1681) {
                    class45 var41;
                    if (var37 instanceof class45) {
                        var41 = (class45) var37;
                    } else {
                        var41 = var15.method549(var9, true, var10, var11, 10, var13, arg6);
                    }
                    if (var41 != null) {
                        for (int var42 = 0; var42 <= var38; var42++) {
                            for (int var43 = 0; var43 <= var39; var43++) {
                                int var44 = var41.method375() / 4;
                                if (var44 > 30) {
                                    var44 = 30;
                                }
                                if (var44 > client.field497[arg3][arg1 + var42][arg8 + var43]) {
                                    client.field497[arg3][arg1 + var42][arg8 + var43] = (byte) var44;
                                }
                            }
                        }
                    }
                }
            }
            if (var15.field1668 && arg4 != null) {
                arg4.method478(var15.field1685, var15.field1693, (byte) -127, arg8, arg6, arg1, var15.field1705);
            }
        } else {
            if (arg5 >= -79) {
                field2491 = null;
            }
            if (arg7 >= 12) {
                class103 var18;
                if (var15.field1691 == -1 && var15.field1655 == null) {
                    var18 = var15.method549(var9, true, var10, var11, arg7, var13, arg6);
                } else {
                    var18 = new class134(arg0, arg7, arg6, var10, var9, var13, var11, var15.field1691, true);
                }
                arg2.method749(arg3, arg1, arg8, var14, 1, 1, var18, 0, var12, var16);
                if (arg7 >= 12 && arg7 <= 17 && arg7 != 13 && arg3 > 0) {
                    class60.field1491[arg3][arg1][arg8] = class5.method54(class60.field1491[arg3][arg1][arg8], 2340);
                }
                if (var15.field1668 && arg4 != null) {
                    arg4.method478(var15.field1685, var15.field1693, (byte) -128, arg8, arg6, arg1, var15.field1705);
                }
            } else if (arg7 == 0) {
                class103 var19;
                if (var15.field1691 == -1 && var15.field1655 == null) {
                    var19 = var15.method549(var9, true, var10, var11, 0, var13, arg6);
                } else {
                    var19 = new class134(arg0, 0, arg6, var10, var9, var13, var11, var15.field1691, true);
                }
                arg2.method770(arg3, arg1, arg8, var14, var19, null, class30.field733[arg6], 0, var12, var16);
                if (arg6 == 0) {
                    if (var15.field1681) {
                        client.field497[arg3][arg1][arg8] = 50;
                        client.field497[arg3][arg1][arg8 + 1] = 50;
                    }
                    if (var15.field1649) {
                        class60.field1491[arg3][arg1][arg8] = class5.method54(class60.field1491[arg3][arg1][arg8], 585);
                    }
                } else if (arg6 == 1) {
                    if (var15.field1681) {
                        client.field497[arg3][arg1][arg8 + 1] = 50;
                        client.field497[arg3][arg1 + 1][arg8 + 1] = 50;
                    }
                    if (var15.field1649) {
                        class60.field1491[arg3][arg1][arg8 + 1] = class5.method54(class60.field1491[arg3][arg1][arg8 + 1], 1170);
                    }
                } else if (arg6 == 2) {
                    if (var15.field1681) {
                        client.field497[arg3][arg1 + 1][arg8] = 50;
                        client.field497[arg3][arg1 + 1][arg8 + 1] = 50;
                    }
                    if (var15.field1649) {
                        class60.field1491[arg3][arg1 + 1][arg8] = class5.method54(class60.field1491[arg3][arg1 + 1][arg8], 585);
                    }
                } else if (arg6 == 3) {
                    if (var15.field1681) {
                        client.field497[arg3][arg1][arg8] = 50;
                        client.field497[arg3][arg1 + 1][arg8] = 50;
                    }
                    if (var15.field1649) {
                        class60.field1491[arg3][arg1][arg8] = class5.method54(class60.field1491[arg3][arg1][arg8], 1170);
                    }
                }
                if (var15.field1668 && arg4 != null) {
                    arg4.method479(var15.field1685, arg6, arg8, arg1, arg7, (byte) -96);
                }
                if (var15.field1689 != 16) {
                    arg2.method777(arg3, arg1, arg8, var15.field1689);
                }
            } else if (arg7 == 1) {
                class103 var20;
                if (var15.field1691 == -1 && var15.field1655 == null) {
                    var20 = var15.method549(var9, true, var10, var11, 1, var13, arg6);
                } else {
                    var20 = new class134(arg0, 1, arg6, var10, var9, var13, var11, var15.field1691, true);
                }
                arg2.method770(arg3, arg1, arg8, var14, var20, null, class109.field2735[arg6], 0, var12, var16);
                if (var15.field1681) {
                    if (arg6 == 0) {
                        client.field497[arg3][arg1][arg8 + 1] = 50;
                    } else if (arg6 == 1) {
                        client.field497[arg3][arg1 + 1][arg8 + 1] = 50;
                    } else if (arg6 == 2) {
                        client.field497[arg3][arg1 + 1][arg8] = 50;
                    } else if (arg6 == 3) {
                        client.field497[arg3][arg1][arg8] = 50;
                    }
                }
                if (var15.field1668 && arg4 != null) {
                    arg4.method479(var15.field1685, arg6, arg8, arg1, arg7, (byte) 119);
                }
            } else if (arg7 == 2) {
                int var21 = arg6 + 1 & 0x3;
                class103 var22;
                class103 var23;
                if (var15.field1691 == -1 && var15.field1655 == null) {
                    var22 = var15.method549(var9, true, var10, var11, 2, var13, arg6 + 4);
                    var23 = var15.method549(var9, true, var10, var11, 2, var13, var21);
                } else {
                    var22 = new class134(arg0, 2, arg6 + 4, var10, var9, var13, var11, var15.field1691, true);
                    var23 = new class134(arg0, 2, var21, var10, var9, var13, var11, var15.field1691, true);
                }
                arg2.method770(arg3, arg1, arg8, var14, var22, var23, class30.field733[arg6], class30.field733[var21], var12, var16);
                if (var15.field1649) {
                    if (arg6 == 0) {
                        class60.field1491[arg3][arg1][arg8] = class5.method54(class60.field1491[arg3][arg1][arg8], 585);
                        class60.field1491[arg3][arg1][arg8 + 1] = class5.method54(class60.field1491[arg3][arg1][arg8 + 1], 1170);
                    } else if (arg6 == 1) {
                        class60.field1491[arg3][arg1][arg8 + 1] = class5.method54(class60.field1491[arg3][arg1][arg8 + 1], 1170);
                        class60.field1491[arg3][arg1 + 1][arg8] = class5.method54(class60.field1491[arg3][arg1 + 1][arg8], 585);
                    } else if (arg6 == 2) {
                        class60.field1491[arg3][arg1 + 1][arg8] = class5.method54(class60.field1491[arg3][arg1 + 1][arg8], 585);
                        class60.field1491[arg3][arg1][arg8] = class5.method54(class60.field1491[arg3][arg1][arg8], 1170);
                    } else if (arg6 == 3) {
                        class60.field1491[arg3][arg1][arg8] = class5.method54(class60.field1491[arg3][arg1][arg8], 1170);
                        class60.field1491[arg3][arg1][arg8] = class5.method54(class60.field1491[arg3][arg1][arg8], 585);
                    }
                }
                if (var15.field1668 && arg4 != null) {
                    arg4.method479(var15.field1685, arg6, arg8, arg1, arg7, (byte) -61);
                }
                if (var15.field1689 != 16) {
                    arg2.method777(arg3, arg1, arg8, var15.field1689);
                }
            } else if (arg7 == 3) {
                class103 var24;
                if (var15.field1691 == -1 && var15.field1655 == null) {
                    var24 = var15.method549(var9, true, var10, var11, 3, var13, arg6);
                } else {
                    var24 = new class134(arg0, 3, arg6, var10, var9, var13, var11, var15.field1691, true);
                }
                arg2.method770(arg3, arg1, arg8, var14, var24, null, class109.field2735[arg6], 0, var12, var16);
                if (var15.field1681) {
                    if (arg6 == 0) {
                        client.field497[arg3][arg1][arg8 + 1] = 50;
                    } else if (arg6 == 1) {
                        client.field497[arg3][arg1 + 1][arg8 + 1] = 50;
                    } else if (arg6 == 2) {
                        client.field497[arg3][arg1 + 1][arg8] = 50;
                    } else if (arg6 == 3) {
                        client.field497[arg3][arg1][arg8] = 50;
                    }
                }
                if (var15.field1668 && arg4 != null) {
                    arg4.method479(var15.field1685, arg6, arg8, arg1, arg7, (byte) -128);
                }
            } else if (arg7 == 9) {
                class103 var25;
                if (var15.field1691 == -1 && var15.field1655 == null) {
                    var25 = var15.method549(var9, true, var10, var11, arg7, var13, arg6);
                } else {
                    var25 = new class134(arg0, arg7, arg6, var10, var9, var13, var11, var15.field1691, true);
                }
                arg2.method749(arg3, arg1, arg8, var14, 1, 1, var25, 0, var12, var16);
                if (var15.field1668 && arg4 != null) {
                    arg4.method478(var15.field1685, var15.field1693, (byte) -125, arg8, arg6, arg1, var15.field1705);
                }
            } else {
                if (var15.field1680) {
                    if (arg6 == 1) {
                        int var29 = var11;
                        var11 = var13;
                        var13 = var9;
                        var9 = var10;
                        var10 = var29;
                    } else if (arg6 == 2) {
                        int var27 = var11;
                        var11 = var9;
                        var9 = var27;
                        int var28 = var13;
                        var13 = var10;
                        var10 = var28;
                    } else if (arg6 == 3) {
                        int var26 = var11;
                        var11 = var10;
                        var10 = var9;
                        var9 = var13;
                        var13 = var26;
                    }
                }
                if (arg7 == 4) {
                    class103 var30;
                    if (var15.field1691 == -1 && var15.field1655 == null) {
                        var30 = var15.method549(var9, true, var10, var11, 4, var13, 0);
                    } else {
                        var30 = new class134(arg0, 4, 0, var10, var9, var13, var11, var15.field1691, true);
                    }
                    arg2.method766(arg3, arg1, arg8, var14, var30, class30.field733[arg6], arg6 * 512, 0, 0, var12, var16);
                } else if (arg7 == 5) {
                    int var31 = arg2.method776(arg3, arg1, arg8);
                    int var32 = 16;
                    if (var31 > 0) {
                        var32 = class42.method357(var31 >> 14 & 0x7FFF, (byte) -42).field1689;
                    }
                    class103 var33;
                    if (var15.field1691 == -1 && var15.field1655 == null) {
                        var33 = var15.method549(var9, true, var10, var11, 4, var13, 0);
                    } else {
                        var33 = new class134(arg0, 4, 0, var10, var9, var13, var11, var15.field1691, true);
                    }
                    arg2.method766(arg3, arg1, arg8, var14, var33, class30.field733[arg6], arg6 * 512, class60.field1487[arg6] * var32, class121.field3010[arg6] * var32, var12, var16);
                } else if (arg7 == 6) {
                    class103 var34;
                    if (var15.field1691 == -1 && var15.field1655 == null) {
                        var34 = var15.method549(var9, true, var10, var11, 4, var13, 0);
                    } else {
                        var34 = new class134(arg0, 4, 0, var10, var9, var13, var11, var15.field1691, true);
                    }
                    arg2.method766(arg3, arg1, arg8, var14, var34, 256, arg6, 0, 0, var12, var16);
                } else if (arg7 == 7) {
                    class103 var35;
                    if (var15.field1691 == -1 && var15.field1655 == null) {
                        var35 = var15.method549(var9, true, var10, var11, 4, var13, 0);
                    } else {
                        var35 = new class134(arg0, 4, 0, var10, var9, var13, var11, var15.field1691, true);
                    }
                    arg2.method766(arg3, arg1, arg8, var14, var35, 512, arg6, 0, 0, var12, var16);
                } else if (arg7 == 8) {
                    class103 var36;
                    if (var15.field1691 == -1 && var15.field1655 == null) {
                        var36 = var15.method549(var9, true, var10, var11, 4, var13, 0);
                    } else {
                        var36 = new class134(arg0, 4, 0, var10, var9, var13, var11, var15.field1691, true);
                    }
                    arg2.method766(arg3, arg1, arg8, var14, var36, 768, arg6, 0, 0, var12, var16);
                }
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IBI)V", line = 599)
    public static final void method820(int arg0, byte arg1, int arg2) {
        field2480++;
        long var3 = (long) ((arg0 << 16) + arg2);
        class109 var5 = (class109) class105.field2585.method408(var3, 126);
        if (var5 != null) {
            class56.field1393.method663(false, var5);
            if (arg1 >= -95) {
                field2494 = null;
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BI)[B", line = 621)
    public final byte[] method821(byte arg0, int arg1) {
        field2472++;
        class30 var3 = this.field2475;
        synchronized (this.field2475) {
            if (arg0 <= 94) {
                return null;
            }
            try {
                if ((long) (arg1 * 6 + 6) > this.field2481.method243((byte) -28)) {
                    return null;
                }
                this.field2481.method242(-101, (long) (arg1 * 6));
                this.field2481.method252(6, (byte) -106, class135.field3267, 0);
                int var6 = ((class135.field3267[1] & 0xFF) << 8) + ((class135.field3267[0] & 0xFF) << 16) + (class135.field3267[2] & 0xFF);
                int var7 = ((class135.field3267[3] & 0xFF) << 16) + ((class135.field3267[4] & 0xFF) << 8) + (class135.field3267[5] & 0xFF);
                if (var6 < 0 || var6 > this.field2493) {
                    return null;
                } else if (var7 > 0 && (long) var7 <= this.field2475.method243((byte) -128) / 520L) {
                    int var10 = 0;
                    byte[] var11 = new byte[var6];
                    int var12 = 0;
                    while (var10 < var6) {
                        if (var7 == 0) {
                            return null;
                        }
                        int var14 = var6 - var10;
                        this.field2475.method242(-78, (long) (var7 * 520));
                        if (var14 > 512) {
                            var14 = 512;
                        }
                        this.field2475.method252(var14 + 8, (byte) -83, class135.field3267, 0);
                        int var15 = ((class135.field3267[2] & 0xFF) << 8) + (class135.field3267[3] & 0xFF);
                        int var16 = ((class135.field3267[0] & 0xFF) << 8) + (class135.field3267[1] & 0xFF);
                        int var17 = ((class135.field3267[5] & 0xFF) << 8) + (((class135.field3267[4] & 0xFF) << 16) + (class135.field3267[6] & 0xFF));
                        int var18 = class135.field3267[7] & 0xFF;
                        if (arg1 == var16 && var12 == var15 && this.field2482 == var18) {
                            if (var17 >= 0 && (long) var17 <= this.field2475.method243((byte) 73) / 520L) {
                                var12++;
                                for (int var21 = 0; var21 < var14; var21++) {
                                    var11[var10++] = class135.field3267[var21 + 8];
                                }
                                var7 = var17;
                                continue;
                            }
                            return null;
                        }
                        return null;
                    }
                    return var11;
                } else {
                    return null;
                }
            } catch (IOException var42) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)[Luc;", line = 699)
    public static final class123[] method822(boolean arg0) {
        field2474++;
        class123[] var1 = new class123[class74.field1771];
        for (int var2 = 0; var2 < class74.field1771; var2++) {
            class123 var3 = var1[var2] = new class123();
            var3.field3027 = class90.field2112;
            var3.field3025 = class5.field216;
            var3.field3021 = class61.field1504[var2];
            var3.field3022 = class38.field930[var2];
            var3.field3023 = class16.field432[var2];
            var3.field3026 = class43.field1095[var2];
            var3.field3024 = class46.field1198;
            var3.field3028 = class17.field458[var2];
        }
        class21.method169((byte) 25);
        return arg0 ? var1 : null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIZZ[B)Z", line = 731)
    private final boolean method823(int arg0, int arg1, boolean arg2, boolean arg3, byte[] arg4) {
        field2478++;
        class30 var6 = this.field2475;
        synchronized (this.field2475) {
            try {
                int var8;
                if (arg3) {
                    if (this.field2481.method243((byte) 78) < (long) (arg0 * 6 + 6)) {
                        return false;
                    }
                    this.field2481.method242(-121, (long) (arg0 * 6));
                    this.field2481.method252(6, (byte) -46, class135.field3267, 0);
                    var8 = ((class135.field3267[3] & 0xFF) << 16) + ((class135.field3267[4] & 0xFF) << 8) + (class135.field3267[5] & 0xFF);
                    if (var8 <= 0 || (long) var8 > this.field2475.method243((byte) -94) / 520L) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field2475.method243((byte) 84) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class135.field3267[0] = (byte) (arg1 >> 16);
                class135.field3267[1] = (byte) (arg1 >> 8);
                class135.field3267[2] = (byte) arg1;
                class135.field3267[3] = (byte) (var8 >> 16);
                class135.field3267[4] = (byte) (var8 >> 8);
                int var10 = 0;
                class135.field3267[5] = (byte) var8;
                this.field2481.method242(31, (long) (arg0 * 6));
                int var11 = 0;
                this.field2481.method248(11483, 0, class135.field3267, 6);
                while (true) {
                    if (arg1 > var10) {
                        label110: {
                            int var12 = 0;
                            if (arg3) {
                                label109: {
                                    this.field2475.method242(-67, (long) (var8 * 520));
                                    try {
                                        this.field2475.method252(8, (byte) -78, class135.field3267, 0);
                                    } catch (EOFException var33) {
                                        break label110;
                                    }
                                    var12 = (class135.field3267[6] & 0xFF) + ((class135.field3267[5] & 0xFF) << 8) + ((class135.field3267[4] & 0xFF) << 16);
                                    int var13 = ((class135.field3267[2] & 0xFF) << 8) + (class135.field3267[3] & 0xFF);
                                    int var14 = class135.field3267[7] & 0xFF;
                                    int var15 = ((class135.field3267[0] & 0xFF) << 8) + (class135.field3267[1] & 0xFF);
                                    if (arg0 == var15 && var11 == var13 && this.field2482 == var14) {
                                        if (var12 >= 0 && (long) var12 <= this.field2475.method243((byte) 115) / 520L) {
                                            break label109;
                                        }
                                        return false;
                                    }
                                    return false;
                                }
                            }
                            if (var12 == 0) {
                                arg3 = false;
                                var12 = (int) ((this.field2475.method243((byte) 88) + 519L) / 520L);
                                if (var12 == 0) {
                                    var12++;
                                }
                                if (var8 == var12) {
                                    var12++;
                                }
                            }
                            if (arg1 - var10 <= 512) {
                                var12 = 0;
                            }
                            class135.field3267[0] = (byte) (arg0 >> 8);
                            class135.field3267[1] = (byte) arg0;
                            int var18 = arg1 - var10;
                            class135.field3267[2] = (byte) (var11 >> 8);
                            if (var18 > 512) {
                                var18 = 512;
                            }
                            class135.field3267[3] = (byte) var11;
                            class135.field3267[4] = (byte) (var12 >> 16);
                            var11++;
                            class135.field3267[5] = (byte) (var12 >> 8);
                            class135.field3267[6] = (byte) var12;
                            class135.field3267[7] = (byte) this.field2482;
                            this.field2475.method242(108, (long) (var8 * 520));
                            var8 = var12;
                            this.field2475.method248(11483, 0, class135.field3267, 8);
                            this.field2475.method248(11483, var10, arg4, var18);
                            var10 += var18;
                            continue;
                        }
                    }
                    if (arg2) {
                        method822(true);
                    }
                    return true;
                }
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "(ILee;Lee;I)V", line = 922)
    public class102(int arg0, class30 arg1, class30 arg2, int arg3) {
        this.field2493 = arg3;
        this.field2475 = arg1;
        this.field2482 = arg0;
        this.field2481 = arg2;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V", line = 867)
    public static final void method824(byte arg0) {
        if (arg0 > -119) {
            return;
        }
        field2492++;
        if (class95.field2242 == 2) {
            class90.method686((class4.field142 - class106.field2659 << 7) + class70.field1706, 327680, class92.field2196 * 2, (client.field483 - class47.field1235 << 7) + class69.field1623);
            if (class91.field2178 > -1 && class69.field1636 % 20 < 10) {
                class39.field959[0].method964(class91.field2178 - 12, class95.field2241 - 28);
            }
        }
    }
}
