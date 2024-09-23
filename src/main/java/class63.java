import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("YECQDWTF")
public class class63 {

    @OriginalMember(owner = "YECQDWTF", name = "b", descriptor = "I")
    private int field1599 = 28730;

    @OriginalMember(owner = "YECQDWTF", name = "g", descriptor = "I")
    private int field1604 = 390;

    @OriginalMember(owner = "YECQDWTF", name = "m", descriptor = "Z")
    private boolean field1610 = false;

    @OriginalMember(owner = "YECQDWTF", name = "z", descriptor = "I")
    private int field1623;

    @OriginalMember(owner = "YECQDWTF", name = "A", descriptor = "I")
    private int field1624;

    @OriginalMember(owner = "YECQDWTF", name = "o", descriptor = "[[[I")
    private int[][][] field1612;

    @OriginalMember(owner = "YECQDWTF", name = "E", descriptor = "[[[B")
    private byte[][][] field1628;

    @OriginalMember(owner = "YECQDWTF", name = "a", descriptor = "[[[B")
    private byte[][][] field1598;

    @OriginalMember(owner = "YECQDWTF", name = "B", descriptor = "[[[B")
    private byte[][][] field1625;

    @OriginalMember(owner = "YECQDWTF", name = "p", descriptor = "[[[B")
    private byte[][][] field1613;

    @OriginalMember(owner = "YECQDWTF", name = "w", descriptor = "[[[B")
    private byte[][][] field1620;

    @OriginalMember(owner = "YECQDWTF", name = "k", descriptor = "[[[I")
    private int[][][] field1608;

    @OriginalMember(owner = "YECQDWTF", name = "e", descriptor = "[[[B")
    private byte[][][] field1602;

    @OriginalMember(owner = "YECQDWTF", name = "j", descriptor = "[[I")
    private int[][] field1607;

    @OriginalMember(owner = "YECQDWTF", name = "r", descriptor = "[I")
    private int[] field1615;

    @OriginalMember(owner = "YECQDWTF", name = "s", descriptor = "[I")
    private int[] field1616;

    @OriginalMember(owner = "YECQDWTF", name = "t", descriptor = "[I")
    private int[] field1617;

    @OriginalMember(owner = "YECQDWTF", name = "u", descriptor = "[I")
    private int[] field1618;

    @OriginalMember(owner = "YECQDWTF", name = "v", descriptor = "[I")
    private int[] field1619;

    @OriginalMember(owner = "YECQDWTF", name = "c", descriptor = "I")
    private static int field1600 = 921;

    @OriginalMember(owner = "YECQDWTF", name = "d", descriptor = "[I")
    private static final int[] field1601 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "YECQDWTF", name = "f", descriptor = "[I")
    private static final int[] field1603 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "YECQDWTF", name = "h", descriptor = "I")
    private static int field1605 = -4713;

    @OriginalMember(owner = "YECQDWTF", name = "i", descriptor = "Z")
    public static boolean field1606 = true;

    @OriginalMember(owner = "YECQDWTF", name = "l", descriptor = "I")
    private static int field1609 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "YECQDWTF", name = "n", descriptor = "Z")
    private static boolean field1611 = true;

    @OriginalMember(owner = "YECQDWTF", name = "q", descriptor = "[I")
    private static final int[] field1614 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "YECQDWTF", name = "y", descriptor = "I")
    public static int field1622 = 99;

    @OriginalMember(owner = "YECQDWTF", name = "C", descriptor = "[I")
    private static final int[] field1626 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "YECQDWTF", name = "D", descriptor = "I")
    private static int field1627 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "YECQDWTF", name = "x", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "YECQDWTF", name = "a", descriptor = "(II)I")
    private static final int method549(int arg0, int arg1) {
        int var2 = method550(arg0 - 1, arg1 - 1) + method550(arg0 + 1, arg1 - 1) + method550(arg0 - 1, arg1 + 1) + method550(arg0 + 1, arg1 + 1);
        int var3 = method550(arg0 - 1, arg1) + method550(arg0 + 1, arg1) + method550(arg0, arg1 - 1) + method550(arg0, arg1 + 1);
        int var4 = method550(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @OriginalMember(owner = "YECQDWTF", name = "b", descriptor = "(II)I")
    private static final int method550(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "YECQDWTF", name = "c", descriptor = "(II)I")
    private final int method551(int arg0, int arg1) {
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg1 < 0) {
                arg1 = 0;
            } else if (arg1 > 127) {
                arg1 = 127;
            }
            return 127 - arg1;
        } else {
            int var4 = (arg0 & 0x7F) * arg1 / 128;
            if (var4 < 2) {
                var4 = 2;
            } else if (var4 > 126) {
                var4 = 126;
            }
            return (arg0 & 0xFF80) + var4;
        }
    }

    @OriginalMember(owner = "YECQDWTF", name = "a", descriptor = "(III)I")
    private final int method552(int arg0, int arg1, int arg2) {
        if (arg2 > 179) {
            arg1 /= 2;
        }
        if (arg2 > 192) {
            arg1 /= 2;
        }
        if (arg2 > 217) {
            arg1 /= 2;
        }
        if (arg2 > 243) {
            arg1 /= 2;
        }
        return arg2 / 2 + (arg0 / 4 << 10) + (arg1 / 32 << 7);
    }

    @OriginalMember(owner = "YECQDWTF", name = "a", descriptor = "(IIIB)V")
    public final void method553(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != -21) {
            return;
        }
        for (int var5 = 0; var5 < 8; var5++) {
            for (int var8 = 0; var8 < 8; var8++) {
                this.field1612[arg1][arg0 + var5][arg2 + var8] = 0;
            }
        }
        if (arg0 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                this.field1612[arg1][arg0][arg2 + var6] = this.field1612[arg1][arg0 - 1][arg2 + var6];
            }
        }
        if (arg2 > 0) {
            for (int var7 = 1; var7 < 8; var7++) {
                this.field1612[arg1][arg0 + var7][arg2] = this.field1612[arg1][arg0 + var7][arg2 - 1];
            }
        }
        if (arg0 > 0 && this.field1612[arg1][arg0 - 1][arg2] != 0) {
            this.field1612[arg1][arg0][arg2] = this.field1612[arg1][arg0 - 1][arg2];
        } else if (arg2 > 0 && this.field1612[arg1][arg0][arg2 - 1] != 0) {
            this.field1612[arg1][arg0][arg2] = this.field1612[arg1][arg0][arg2 - 1];
        } else if (arg0 > 0 && arg2 > 0 && this.field1612[arg1][arg0 - 1][arg2 - 1] != 0) {
            this.field1612[arg1][arg0][arg2] = this.field1612[arg1][arg0 - 1][arg2 - 1];
        }
    }

    @OriginalMember(owner = "YECQDWTF", name = "d", descriptor = "(II)I")
    private static final int method554(int arg0, int arg1) {
        if (arg0 == -1) {
            return 12345678;
        }
        int var2 = (arg0 & 0x7F) * arg1 / 128;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "YECQDWTF", name = "a", descriptor = "([[[IIIIIILBBRQYCNY;IILKFVPSSJH;I)V")
    public static final void method555(int[][][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class2 arg6, int arg7, int arg8, class28 arg9, int arg10) {
        int var11 = arg0[arg1][arg2][arg8];
        int var12 = arg0[arg1][arg2 + 1][arg8];
        int var13 = arg0[arg1][arg2 + 1][arg8 + 1];
        int var14 = arg0[arg1][arg2][arg8 + 1];
        int var15 = var11 + var12 + var13 + var14 >> 2;
        if (arg10 >= 0) {
            field1600 = -327;
        }
        class7 var16 = class7.method219(arg5);
        int var17 = (arg5 << 14) + (arg8 << 7) + arg2 + 1073741824;
        if (!var16.field599) {
            var17 += Integer.MIN_VALUE;
        }
        byte var18 = (byte) ((arg4 << 6) + arg3);
        if (arg3 == 22) {
            class57 var19;
            if (var16.field578 == -1 && var16.field609 == null) {
                var19 = var16.method217(22, arg4, var11, var12, var13, var14, -1);
            } else {
                var19 = new class66(var16.field578, 22, true, var13, arg4, var11, arg5, true, var12, var14);
            }
            arg9.method318(var17, var19, arg8, (byte) -45, arg7, var15, arg2, var18);
            if (var16.field564 && var16.field599) {
                arg6.method42(5, arg8, arg2);
            }
        } else if (arg3 == 10 || arg3 == 11) {
            class57 var39;
            if (var16.field578 == -1 && var16.field609 == null) {
                var39 = var16.method217(10, arg4, var11, var12, var13, var14, -1);
            } else {
                var39 = new class66(var16.field578, 10, true, var13, arg4, var11, arg5, true, var12, var14);
            }
            if (var39 != null) {
                int var40 = 0;
                if (arg3 == 11) {
                    var40 += 256;
                }
                int var41;
                int var42;
                if (arg4 == 1 || arg4 == 3) {
                    var41 = var16.field611;
                    var42 = var16.field605;
                } else {
                    var41 = var16.field605;
                    var42 = var16.field611;
                }
                arg9.method322(var39, var17, var41, arg2, var18, var15, var40, arg8, arg7, 0, var42);
            }
            if (var16.field564) {
                arg6.method41(arg2, arg8, var16.field605, arg4, -47207, var16.field572, var16.field611);
            }
        } else if (arg3 >= 12) {
            class57 var20;
            if (var16.field578 == -1 && var16.field609 == null) {
                var20 = var16.method217(arg3, arg4, var11, var12, var13, var14, -1);
            } else {
                var20 = new class66(var16.field578, arg3, true, var13, arg4, var11, arg5, true, var12, var14);
            }
            arg9.method322(var20, var17, 1, arg2, var18, var15, 0, arg8, arg7, 0, 1);
            if (var16.field564) {
                arg6.method41(arg2, arg8, var16.field605, arg4, -47207, var16.field572, var16.field611);
            }
        } else if (arg3 == 0) {
            class57 var21;
            if (var16.field578 == -1 && var16.field609 == null) {
                var21 = var16.method217(0, arg4, var11, var12, var13, var14, -1);
            } else {
                var21 = new class66(var16.field578, 0, true, var13, arg4, var11, arg5, true, var12, var14);
            }
            arg9.method320(field1603[arg4], arg7, arg2, 0, null, (byte) 3, var15, var18, var17, arg8, var21);
            if (var16.field564) {
                arg6.method40(arg4, arg8, arg3, -357, var16.field572, arg2);
            }
        } else if (arg3 == 1) {
            class57 var22;
            if (var16.field578 == -1 && var16.field609 == null) {
                var22 = var16.method217(1, arg4, var11, var12, var13, var14, -1);
            } else {
                var22 = new class66(var16.field578, 1, true, var13, arg4, var11, arg5, true, var12, var14);
            }
            arg9.method320(field1614[arg4], arg7, arg2, 0, null, (byte) 3, var15, var18, var17, arg8, var22);
            if (var16.field564) {
                arg6.method40(arg4, arg8, arg3, -357, var16.field572, arg2);
            }
        } else if (arg3 == 2) {
            int var23 = arg4 + 1 & 0x3;
            class57 var24;
            class57 var25;
            if (var16.field578 == -1 && var16.field609 == null) {
                var24 = var16.method217(2, arg4 + 4, var11, var12, var13, var14, -1);
                var25 = var16.method217(2, var23, var11, var12, var13, var14, -1);
            } else {
                var24 = new class66(var16.field578, 2, true, var13, arg4 + 4, var11, arg5, true, var12, var14);
                var25 = new class66(var16.field578, 2, true, var13, var23, var11, arg5, true, var12, var14);
            }
            arg9.method320(field1603[arg4], arg7, arg2, field1603[var23], var25, (byte) 3, var15, var18, var17, arg8, var24);
            if (var16.field564) {
                arg6.method40(arg4, arg8, arg3, -357, var16.field572, arg2);
            }
        } else if (arg3 == 3) {
            class57 var26;
            if (var16.field578 == -1 && var16.field609 == null) {
                var26 = var16.method217(3, arg4, var11, var12, var13, var14, -1);
            } else {
                var26 = new class66(var16.field578, 3, true, var13, arg4, var11, arg5, true, var12, var14);
            }
            arg9.method320(field1614[arg4], arg7, arg2, 0, null, (byte) 3, var15, var18, var17, arg8, var26);
            if (var16.field564) {
                arg6.method40(arg4, arg8, arg3, -357, var16.field572, arg2);
            }
        } else if (arg3 == 9) {
            class57 var27;
            if (var16.field578 == -1 && var16.field609 == null) {
                var27 = var16.method217(arg3, arg4, var11, var12, var13, var14, -1);
            } else {
                var27 = new class66(var16.field578, arg3, true, var13, arg4, var11, arg5, true, var12, var14);
            }
            arg9.method322(var27, var17, 1, arg2, var18, var15, 0, arg8, arg7, 0, 1);
            if (var16.field564) {
                arg6.method41(arg2, arg8, var16.field605, arg4, -47207, var16.field572, var16.field611);
            }
        } else {
            if (var16.field584) {
                if (arg4 == 1) {
                    int var28 = var14;
                    var14 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var28;
                } else if (arg4 == 2) {
                    int var29 = var14;
                    var14 = var12;
                    var12 = var29;
                    int var30 = var13;
                    var13 = var11;
                    var11 = var30;
                } else if (arg4 == 3) {
                    int var31 = var14;
                    var14 = var11;
                    var11 = var12;
                    var12 = var13;
                    var13 = var31;
                }
            }
            if (arg3 == 4) {
                class57 var32;
                if (var16.field578 == -1 && var16.field609 == null) {
                    var32 = var16.method217(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var32 = new class66(var16.field578, 4, true, var13, 0, var11, arg5, true, var12, var14);
                }
                arg9.method321(6, arg4 * 512, var18, arg7, 0, field1603[arg4], var17, 0, arg2, var32, arg8, var15);
            } else if (arg3 == 5) {
                int var33 = 16;
                int var34 = arg9.method338(arg7, arg2, arg8);
                if (var34 > 0) {
                    var33 = class7.method219(var34 >> 14 & 0x7FFF).field586;
                }
                class57 var35;
                if (var16.field578 == -1 && var16.field609 == null) {
                    var35 = var16.method217(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var35 = new class66(var16.field578, 4, true, var13, 0, var11, arg5, true, var12, var14);
                }
                arg9.method321(6, arg4 * 512, var18, arg7, field1626[arg4] * var33, field1603[arg4], var17, field1601[arg4] * var33, arg2, var35, arg8, var15);
            } else if (arg3 == 6) {
                class57 var36;
                if (var16.field578 == -1 && var16.field609 == null) {
                    var36 = var16.method217(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var36 = new class66(var16.field578, 4, true, var13, 0, var11, arg5, true, var12, var14);
                }
                arg9.method321(6, arg4, var18, arg7, 0, 256, var17, 0, arg2, var36, arg8, var15);
            } else if (arg3 == 7) {
                class57 var37;
                if (var16.field578 == -1 && var16.field609 == null) {
                    var37 = var16.method217(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var37 = new class66(var16.field578, 4, true, var13, 0, var11, arg5, true, var12, var14);
                }
                arg9.method321(6, arg4, var18, arg7, 0, 512, var17, 0, arg2, var37, arg8, var15);
            } else if (arg3 == 8) {
                class57 var38;
                if (var16.field578 == -1 && var16.field609 == null) {
                    var38 = var16.method217(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var38 = new class66(var16.field578, 4, true, var13, 0, var11, arg5, true, var12, var14);
                }
                arg9.method321(6, arg4, var18, arg7, 0, 768, var17, 0, arg2, var38, arg8, var15);
            }
        }
    }

    @OriginalMember(owner = "YECQDWTF", name = "a", descriptor = "(IIILKFVPSSJH;ILBBRQYCNY;III)V")
    private final void method556(int arg0, int arg1, int arg2, class28 arg3, int arg4, class2 arg5, int arg6, int arg7, int arg8) {
        if (field1606 && (this.field1628[0][arg7][arg1] & 0x2) == 0) {
            if ((this.field1628[arg0][arg7][arg1] & 0x10) != 0) {
                return;
            }
            if (this.method559(arg0, false, arg7, arg1) != field1621) {
                return;
            }
        }
        if (arg0 < field1622) {
            field1622 = arg0;
        }
        int var10 = this.field1612[arg0][arg7][arg1];
        int var11 = this.field1612[arg0][arg7 + 1][arg1];
        int var12 = this.field1612[arg0][arg7 + 1][arg1 + 1];
        int var13 = this.field1612[arg0][arg7][arg1 + 1];
        int var14 = var10 + var11 + var12 + var13 >> 2;
        class7 var15 = class7.method219(arg4);
        int var16 = (arg4 << 14) + (arg1 << 7) + arg7 + 1073741824;
        if (arg6 != 22392) {
            this.field1610 = !this.field1610;
        }
        if (!var15.field599) {
            var16 += Integer.MIN_VALUE;
        }
        byte var17 = (byte) ((arg8 << 6) + arg2);
        if (arg2 == 22) {
            if (!field1606 || var15.field599 || var15.field613) {
                class57 var18;
                if (var15.field578 == -1 && var15.field609 == null) {
                    var18 = var15.method217(22, arg8, var10, var11, var12, var13, -1);
                } else {
                    var18 = new class66(var15.field578, 22, true, var12, arg8, var10, arg4, true, var11, var13);
                }
                arg3.method318(var16, var18, arg1, (byte) -45, arg0, var14, arg7, var17);
                if (var15.field564 && var15.field599 && arg5 != null) {
                    arg5.method42(5, arg1, arg7);
                }
            }
        } else if (arg2 == 10 || arg2 == 11) {
            class57 var38;
            if (var15.field578 == -1 && var15.field609 == null) {
                var38 = var15.method217(10, arg8, var10, var11, var12, var13, -1);
            } else {
                var38 = new class66(var15.field578, 10, true, var12, arg8, var10, arg4, true, var11, var13);
            }
            if (var38 != null) {
                int var39 = 0;
                if (arg2 == 11) {
                    var39 += 256;
                }
                int var40;
                int var41;
                if (arg8 == 1 || arg8 == 3) {
                    var40 = var15.field611;
                    var41 = var15.field605;
                } else {
                    var40 = var15.field605;
                    var41 = var15.field611;
                }
                if (arg3.method322(var38, var16, var40, arg7, var17, var14, var39, arg1, arg0, 0, var41) && var15.field567) {
                    class43 var42;
                    if (var38 instanceof class43) {
                        var42 = (class43) var38;
                    } else {
                        var42 = var15.method217(10, arg8, var10, var11, var12, var13, -1);
                    }
                    if (var42 != null) {
                        for (int var43 = 0; var43 <= var40; var43++) {
                            for (int var44 = 0; var44 <= var41; var44++) {
                                int var45 = var42.field1302 / 4;
                                if (var45 > 30) {
                                    var45 = 30;
                                }
                                if (var45 > this.field1602[arg0][arg7 + var43][arg1 + var44]) {
                                    this.field1602[arg0][arg7 + var43][arg1 + var44] = (byte) var45;
                                }
                            }
                        }
                    }
                }
            }
            if (var15.field564 && arg5 != null) {
                arg5.method41(arg7, arg1, var15.field605, arg8, -47207, var15.field572, var15.field611);
            }
        } else if (arg2 >= 12) {
            class57 var19;
            if (var15.field578 == -1 && var15.field609 == null) {
                var19 = var15.method217(arg2, arg8, var10, var11, var12, var13, -1);
            } else {
                var19 = new class66(var15.field578, arg2, true, var12, arg8, var10, arg4, true, var11, var13);
            }
            arg3.method322(var19, var16, 1, arg7, var17, var14, 0, arg1, arg0, 0, 1);
            if (arg2 >= 12 && arg2 <= 17 && arg2 != 13 && arg0 > 0) {
                this.field1608[arg0][arg7][arg1] |= 0x924;
            }
            if (var15.field564 && arg5 != null) {
                arg5.method41(arg7, arg1, var15.field605, arg8, -47207, var15.field572, var15.field611);
            }
        } else if (arg2 == 0) {
            class57 var20;
            if (var15.field578 == -1 && var15.field609 == null) {
                var20 = var15.method217(0, arg8, var10, var11, var12, var13, -1);
            } else {
                var20 = new class66(var15.field578, 0, true, var12, arg8, var10, arg4, true, var11, var13);
            }
            arg3.method320(field1603[arg8], arg0, arg7, 0, null, (byte) 3, var14, var17, var16, arg1, var20);
            if (arg8 == 0) {
                if (var15.field567) {
                    this.field1602[arg0][arg7][arg1] = 50;
                    this.field1602[arg0][arg7][arg1 + 1] = 50;
                }
                if (var15.field595) {
                    this.field1608[arg0][arg7][arg1] |= 0x249;
                }
            } else if (arg8 == 1) {
                if (var15.field567) {
                    this.field1602[arg0][arg7][arg1 + 1] = 50;
                    this.field1602[arg0][arg7 + 1][arg1 + 1] = 50;
                }
                if (var15.field595) {
                    this.field1608[arg0][arg7][arg1 + 1] |= 0x492;
                }
            } else if (arg8 == 2) {
                if (var15.field567) {
                    this.field1602[arg0][arg7 + 1][arg1] = 50;
                    this.field1602[arg0][arg7 + 1][arg1 + 1] = 50;
                }
                if (var15.field595) {
                    this.field1608[arg0][arg7 + 1][arg1] |= 0x249;
                }
            } else if (arg8 == 3) {
                if (var15.field567) {
                    this.field1602[arg0][arg7][arg1] = 50;
                    this.field1602[arg0][arg7 + 1][arg1] = 50;
                }
                if (var15.field595) {
                    this.field1608[arg0][arg7][arg1] |= 0x492;
                }
            }
            if (var15.field564 && arg5 != null) {
                arg5.method40(arg8, arg1, arg2, -357, var15.field572, arg7);
            }
            if (var15.field586 != 16) {
                arg3.method328(arg1, var15.field586, arg0, arg7, 767);
            }
        } else if (arg2 == 1) {
            class57 var21;
            if (var15.field578 == -1 && var15.field609 == null) {
                var21 = var15.method217(1, arg8, var10, var11, var12, var13, -1);
            } else {
                var21 = new class66(var15.field578, 1, true, var12, arg8, var10, arg4, true, var11, var13);
            }
            arg3.method320(field1614[arg8], arg0, arg7, 0, null, (byte) 3, var14, var17, var16, arg1, var21);
            if (var15.field567) {
                if (arg8 == 0) {
                    this.field1602[arg0][arg7][arg1 + 1] = 50;
                } else if (arg8 == 1) {
                    this.field1602[arg0][arg7 + 1][arg1 + 1] = 50;
                } else if (arg8 == 2) {
                    this.field1602[arg0][arg7 + 1][arg1] = 50;
                } else if (arg8 == 3) {
                    this.field1602[arg0][arg7][arg1] = 50;
                }
            }
            if (var15.field564 && arg5 != null) {
                arg5.method40(arg8, arg1, arg2, -357, var15.field572, arg7);
            }
        } else if (arg2 == 2) {
            int var22 = arg8 + 1 & 0x3;
            class57 var23;
            class57 var24;
            if (var15.field578 == -1 && var15.field609 == null) {
                var23 = var15.method217(2, arg8 + 4, var10, var11, var12, var13, -1);
                var24 = var15.method217(2, var22, var10, var11, var12, var13, -1);
            } else {
                var23 = new class66(var15.field578, 2, true, var12, arg8 + 4, var10, arg4, true, var11, var13);
                var24 = new class66(var15.field578, 2, true, var12, var22, var10, arg4, true, var11, var13);
            }
            arg3.method320(field1603[arg8], arg0, arg7, field1603[var22], var24, (byte) 3, var14, var17, var16, arg1, var23);
            if (var15.field595) {
                if (arg8 == 0) {
                    this.field1608[arg0][arg7][arg1] |= 0x249;
                    this.field1608[arg0][arg7][arg1 + 1] |= 0x492;
                } else if (arg8 == 1) {
                    this.field1608[arg0][arg7][arg1 + 1] |= 0x492;
                    this.field1608[arg0][arg7 + 1][arg1] |= 0x249;
                } else if (arg8 == 2) {
                    this.field1608[arg0][arg7 + 1][arg1] |= 0x249;
                    this.field1608[arg0][arg7][arg1] |= 0x492;
                } else if (arg8 == 3) {
                    this.field1608[arg0][arg7][arg1] |= 0x492;
                    this.field1608[arg0][arg7][arg1] |= 0x249;
                }
            }
            if (var15.field564 && arg5 != null) {
                arg5.method40(arg8, arg1, arg2, -357, var15.field572, arg7);
            }
            if (var15.field586 != 16) {
                arg3.method328(arg1, var15.field586, arg0, arg7, 767);
            }
        } else if (arg2 == 3) {
            class57 var25;
            if (var15.field578 == -1 && var15.field609 == null) {
                var25 = var15.method217(3, arg8, var10, var11, var12, var13, -1);
            } else {
                var25 = new class66(var15.field578, 3, true, var12, arg8, var10, arg4, true, var11, var13);
            }
            arg3.method320(field1614[arg8], arg0, arg7, 0, null, (byte) 3, var14, var17, var16, arg1, var25);
            if (var15.field567) {
                if (arg8 == 0) {
                    this.field1602[arg0][arg7][arg1 + 1] = 50;
                } else if (arg8 == 1) {
                    this.field1602[arg0][arg7 + 1][arg1 + 1] = 50;
                } else if (arg8 == 2) {
                    this.field1602[arg0][arg7 + 1][arg1] = 50;
                } else if (arg8 == 3) {
                    this.field1602[arg0][arg7][arg1] = 50;
                }
            }
            if (var15.field564 && arg5 != null) {
                arg5.method40(arg8, arg1, arg2, -357, var15.field572, arg7);
            }
        } else if (arg2 == 9) {
            class57 var26;
            if (var15.field578 == -1 && var15.field609 == null) {
                var26 = var15.method217(arg2, arg8, var10, var11, var12, var13, -1);
            } else {
                var26 = new class66(var15.field578, arg2, true, var12, arg8, var10, arg4, true, var11, var13);
            }
            arg3.method322(var26, var16, 1, arg7, var17, var14, 0, arg1, arg0, 0, 1);
            if (var15.field564 && arg5 != null) {
                arg5.method41(arg7, arg1, var15.field605, arg8, -47207, var15.field572, var15.field611);
            }
        } else {
            if (var15.field584) {
                if (arg8 == 1) {
                    int var27 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var10;
                    var10 = var27;
                } else if (arg8 == 2) {
                    int var28 = var13;
                    var13 = var11;
                    var11 = var28;
                    int var29 = var12;
                    var12 = var10;
                    var10 = var29;
                } else if (arg8 == 3) {
                    int var30 = var13;
                    var13 = var10;
                    var10 = var11;
                    var11 = var12;
                    var12 = var30;
                }
            }
            if (arg2 == 4) {
                class57 var31;
                if (var15.field578 == -1 && var15.field609 == null) {
                    var31 = var15.method217(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var31 = new class66(var15.field578, 4, true, var12, 0, var10, arg4, true, var11, var13);
                }
                arg3.method321(6, arg8 * 512, var17, arg0, 0, field1603[arg8], var16, 0, arg7, var31, arg1, var14);
            } else if (arg2 == 5) {
                int var32 = 16;
                int var33 = arg3.method338(arg0, arg7, arg1);
                if (var33 > 0) {
                    var32 = class7.method219(var33 >> 14 & 0x7FFF).field586;
                }
                class57 var34;
                if (var15.field578 == -1 && var15.field609 == null) {
                    var34 = var15.method217(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var34 = new class66(var15.field578, 4, true, var12, 0, var10, arg4, true, var11, var13);
                }
                arg3.method321(6, arg8 * 512, var17, arg0, field1626[arg8] * var32, field1603[arg8], var16, field1601[arg8] * var32, arg7, var34, arg1, var14);
            } else if (arg2 == 6) {
                class57 var35;
                if (var15.field578 == -1 && var15.field609 == null) {
                    var35 = var15.method217(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var35 = new class66(var15.field578, 4, true, var12, 0, var10, arg4, true, var11, var13);
                }
                arg3.method321(6, arg8, var17, arg0, 0, 256, var16, 0, arg7, var35, arg1, var14);
            } else if (arg2 == 7) {
                class57 var36;
                if (var15.field578 == -1 && var15.field609 == null) {
                    var36 = var15.method217(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var36 = new class66(var15.field578, 4, true, var12, 0, var10, arg4, true, var11, var13);
                }
                arg3.method321(6, arg8, var17, arg0, 0, 512, var16, 0, arg7, var36, arg1, var14);
            } else if (arg2 == 8) {
                class57 var37;
                if (var15.field578 == -1 && var15.field609 == null) {
                    var37 = var15.method217(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var37 = new class66(var15.field578, 4, true, var12, 0, var10, arg4, true, var11, var13);
                }
                arg3.method321(6, arg8, var17, arg0, 0, 768, var16, 0, arg7, var37, arg1, var14);
            }
        }
    }

    @OriginalMember(owner = "YECQDWTF", name = "<init>", descriptor = "(I[[[IZI[[[B)V")
    public class63(int arg0, int[][][] arg1, boolean arg2, int arg3, byte[][][] arg4) {
        field1622 = 99;
        this.field1623 = arg3;
        this.field1624 = arg0;
        this.field1612 = arg1;
        this.field1628 = arg4;
        this.field1598 = new byte[4][this.field1623][this.field1624];
        this.field1625 = new byte[4][this.field1623][this.field1624];
        this.field1613 = new byte[4][this.field1623][this.field1624];
        this.field1620 = new byte[4][this.field1623][this.field1624];
        this.field1608 = new int[4][this.field1623 + 1][this.field1624 + 1];
        this.field1602 = new byte[4][this.field1623 + 1][this.field1624 + 1];
        this.field1607 = new int[this.field1623 + 1][this.field1624 + 1];
        this.field1615 = new int[this.field1624];
        this.field1616 = new int[this.field1624];
        this.field1617 = new int[this.field1624];
        this.field1618 = new int[this.field1624];
        this.field1619 = new int[this.field1624];
        if (arg2) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
    }

    @OriginalMember(owner = "YECQDWTF", name = "a", descriptor = "([BIII[LBBRQYCNY;LKFVPSSJH;)V")
    public final void method557(byte[] arg0, int arg1, int arg2, int arg3, class2[] arg4, class28 arg5) {
        class42 var7 = new class42(5, arg0);
        int var8 = -1;
        if (arg3 != 0) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        while (true) {
            int var10 = var7.method434();
            if (var10 == 0) {
                return;
            }
            var8 += var10;
            int var11 = 0;
            while (true) {
                int var12 = var7.method434();
                if (var12 == 0) {
                    break;
                }
                var11 += var12 - 1;
                int var13 = var11 & 0x3F;
                int var14 = var11 >> 6 & 0x3F;
                int var15 = var11 >> 12;
                int var16 = var7.method420();
                int var17 = var16 >> 2;
                int var18 = var16 & 0x3;
                int var19 = arg2 + var14;
                int var20 = arg1 + var13;
                if (var19 > 0 && var20 > 0 && var19 < 103 && var20 < 103) {
                    int var21 = var15;
                    if ((this.field1628[1][var19][var20] & 0x2) == 2) {
                        var21 = var15 - 1;
                    }
                    class2 var22 = null;
                    if (var21 >= 0) {
                        var22 = arg4[var21];
                    }
                    this.method556(var15, var20, var17, arg5, var8, var22, 22392, var19, var18);
                }
            }
        }
    }

    @OriginalMember(owner = "YECQDWTF", name = "a", descriptor = "(BIIII[B[LBBRQYCNY;IIILKFVPSSJH;)V")
    public final void method558(byte arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, class2[] arg6, int arg7, int arg8, int arg9, class28 arg10) {
        class42 var12 = new class42(5, arg5);
        int var13 = -1;
        if (arg0 == 3) {
            boolean var14 = false;
        } else {
            this.field1599 = 361;
        }
        while (true) {
            int var15 = var12.method434();
            if (var15 == 0) {
                return;
            }
            var13 += var15;
            int var16 = 0;
            while (true) {
                int var17 = var12.method434();
                if (var17 == 0) {
                    break;
                }
                var16 += var17 - 1;
                int var18 = var16 & 0x3F;
                int var19 = var16 >> 6 & 0x3F;
                int var20 = var16 >> 12;
                int var21 = var12.method420();
                int var22 = var21 >> 2;
                int var23 = var21 & 0x3;
                if (arg8 == var20 && var19 >= arg4 && var19 < arg4 + 8 && var18 >= arg3 && var18 < arg3 + 8) {
                    class7 var24 = class7.method219(var13);
                    int var25 = arg7 + class51.method504(var19 & 0x7, (byte) 6, var23, var24.field611, var18 & 0x7, var24.field605, arg2);
                    int var26 = arg9 + class51.method505(var19 & 0x7, 0, var23, var18 & 0x7, arg2, var24.field611, var24.field605);
                    if (var25 > 0 && var26 > 0 && var25 < 103 && var26 < 103) {
                        int var27 = arg1;
                        if ((this.field1628[1][var25][var26] & 0x2) == 2) {
                            var27 = arg1 - 1;
                        }
                        class2 var28 = null;
                        if (var27 >= 0) {
                            var28 = arg6[var27];
                        }
                        this.method556(arg1, var26, var22, arg10, var13, var28, 22392, var25, arg2 + var23 & 0x3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "YECQDWTF", name = "a", descriptor = "(IZII)I")
    public int method559(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg1) {
            this.field1604 = -444;
        }
        if ((this.field1628[arg0][arg2][arg3] & 0x8) == 0) {
            return arg0 <= 0 || (this.field1628[1][arg2][arg3] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "YECQDWTF", name = "a", descriptor = "(BLKFVPSSJH;[LBBRQYCNY;)V")
    public final void method560(byte arg0, class28 arg1, class2[] arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((this.field1628[var4][var110][var111] & 0x1) == 1) {
                        int var112 = var4;
                        if ((this.field1628[1][var110][var111] & 0x2) == 2) {
                            var112 = var4 - 1;
                        }
                        if (var112 >= 0) {
                            arg2[var112].method42(5, var111, var110);
                        }
                    }
                }
            }
        }
        field1609 += (int) (Math.random() * 5.0D) - 2;
        if (field1609 < -8) {
            field1609 = -8;
        }
        if (field1609 > 8) {
            field1609 = 8;
        }
        field1627 += (int) (Math.random() * 5.0D) - 2;
        if (field1627 < -16) {
            field1627 = -16;
        }
        if (field1627 > 16) {
            field1627 = 16;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            byte[][] var48 = this.field1602[var5];
            byte var49 = 96;
            short var50 = 768;
            byte var51 = -50;
            byte var52 = -10;
            byte var53 = -50;
            int var54 = (int) Math.sqrt((double) (var53 * var53 + var51 * var51 + var52 * var52));
            int var55 = var50 * var54 >> 8;
            for (int var56 = 1; var56 < this.field1624 - 1; var56++) {
                for (int var101 = 1; var101 < this.field1623 - 1; var101++) {
                    int var102 = this.field1612[var5][var101 + 1][var56] - this.field1612[var5][var101 - 1][var56];
                    int var103 = this.field1612[var5][var101][var56 + 1] - this.field1612[var5][var101][var56 - 1];
                    int var104 = (int) Math.sqrt((double) (var103 * var103 + var102 * var102 + 65536));
                    int var105 = (var102 << 8) / var104;
                    int var106 = 65536 / var104;
                    int var107 = (var103 << 8) / var104;
                    int var108 = (var53 * var107 + var51 * var105 + var52 * var106) / var55 + var49;
                    int var109 = (var48[var101][var56] >> 1) + (var48[var101][var56 + 1] >> 3) + (var48[var101][var56 - 1] >> 2) + (var48[var101 - 1][var56] >> 2) + (var48[var101 + 1][var56] >> 3);
                    this.field1607[var101][var56] = var108 - var109;
                }
            }
            for (int var57 = 0; var57 < this.field1624; var57++) {
                this.field1615[var57] = 0;
                this.field1616[var57] = 0;
                this.field1617[var57] = 0;
                this.field1618[var57] = 0;
                this.field1619[var57] = 0;
            }
            for (int var58 = -5; var58 < this.field1623 + 5; var58++) {
                for (int var61 = 0; var61 < this.field1624; var61++) {
                    int var95 = var58 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < this.field1623) {
                        int var96 = this.field1598[var5][var95][var61] & 0xFF;
                        if (var96 > 0) {
                            class53 var97 = class53.field1444[var96 - 1];
                            this.field1615[var61] += var97.field1453;
                            this.field1616[var61] += var97.field1451;
                            this.field1617[var61] += var97.field1452;
                            this.field1618[var61] += var97.field1454;
                            var10002 = this.field1619[var61]++;
                        }
                    }
                    int var98 = var58 - 5;
                    if (var98 >= 0 && var98 < this.field1623) {
                        int var99 = this.field1598[var5][var98][var61] & 0xFF;
                        if (var99 > 0) {
                            class53 var100 = class53.field1444[var99 - 1];
                            this.field1615[var61] -= var100.field1453;
                            this.field1616[var61] -= var100.field1451;
                            this.field1617[var61] -= var100.field1452;
                            this.field1618[var61] -= var100.field1454;
                            var10002 = this.field1619[var61]--;
                        }
                    }
                }
                if (var58 >= 1 && var58 < this.field1623 - 1) {
                    int var62 = 0;
                    int var63 = 0;
                    int var64 = 0;
                    int var65 = 0;
                    int var66 = 0;
                    for (int var67 = -5; var67 < this.field1624 + 5; var67++) {
                        int var68 = var67 + 5;
                        if (var68 >= 0 && var68 < this.field1624) {
                            var62 += this.field1615[var68];
                            var63 += this.field1616[var68];
                            var64 += this.field1617[var68];
                            var65 += this.field1618[var68];
                            var66 += this.field1619[var68];
                        }
                        int var69 = var67 - 5;
                        if (var69 >= 0 && var69 < this.field1624) {
                            var62 -= this.field1615[var69];
                            var63 -= this.field1616[var69];
                            var64 -= this.field1617[var69];
                            var65 -= this.field1618[var69];
                            var66 -= this.field1619[var69];
                        }
                        if (var67 >= 1 && var67 < this.field1624 - 1 && (!field1606 || (this.field1628[0][var58][var67] & 0x2) != 0 || (this.field1628[var5][var58][var67] & 0x10) == 0 && this.method559(var5, false, var58, var67) == field1621)) {
                            if (var5 < field1622) {
                                field1622 = var5;
                            }
                            int var70 = this.field1598[var5][var58][var67] & 0xFF;
                            int var71 = this.field1625[var5][var58][var67] & 0xFF;
                            if (var70 > 0 || var71 > 0) {
                                int var72 = this.field1612[var5][var58][var67];
                                int var73 = this.field1612[var5][var58 + 1][var67];
                                int var74 = this.field1612[var5][var58 + 1][var67 + 1];
                                int var75 = this.field1612[var5][var58][var67 + 1];
                                int var76 = this.field1607[var58][var67];
                                int var77 = this.field1607[var58 + 1][var67];
                                int var78 = this.field1607[var58 + 1][var67 + 1];
                                int var79 = this.field1607[var58][var67 + 1];
                                int var80 = -1;
                                int var81 = -1;
                                if (var70 > 0) {
                                    int var82 = var62 * 256 / var65;
                                    int var83 = var63 / var66;
                                    int var84 = var64 / var66;
                                    var80 = this.method552(var82, var83, var84);
                                    int var85 = field1609 + var82 & 0xFF;
                                    int var86 = field1627 + var84;
                                    if (var86 < 0) {
                                        var86 = 0;
                                    } else if (var86 > 255) {
                                        var86 = 255;
                                    }
                                    var81 = this.method552(var85, var83, var86);
                                }
                                if (var5 > 0) {
                                    boolean var87 = true;
                                    if (var70 == 0 && this.field1613[var5][var58][var67] != 0) {
                                        var87 = false;
                                    }
                                    if (var71 > 0 && !class53.field1444[var71 - 1].field1449) {
                                        var87 = false;
                                    }
                                    if (var87 && var72 == var73 && var72 == var74 && var72 == var75) {
                                        this.field1608[var5][var58][var67] |= 0x924;
                                    }
                                }
                                int var88 = 0;
                                if (var80 != -1) {
                                    var88 = class10.field690[method554(var81, 96)];
                                }
                                if (var71 == 0) {
                                    arg1.method317(var5, var58, var67, 0, 0, -1, var72, var73, var74, var75, method554(var80, var76), method554(var80, var77), method554(var80, var78), method554(var80, var79), 0, 0, 0, 0, var88, 0);
                                } else {
                                    int var89 = this.field1613[var5][var58][var67] + 1;
                                    byte var90 = this.field1620[var5][var58][var67];
                                    class53 var91 = class53.field1444[var71 - 1];
                                    int var92 = var91.field1447;
                                    int var93;
                                    int var94;
                                    if (var92 >= 0) {
                                        var93 = class10.method250(this.field1604, var92);
                                        var94 = -1;
                                    } else if (var91.field1446 == 16711935) {
                                        var94 = -2;
                                        var92 = -1;
                                        var93 = class10.field690[this.method551(var91.field1455, 96)];
                                    } else {
                                        var94 = this.method552(var91.field1450, var91.field1451, var91.field1452);
                                        var93 = class10.field690[this.method551(var91.field1455, 96)];
                                    }
                                    arg1.method317(var5, var58, var67, var89, var90, var92, var72, var73, var74, var75, method554(var80, var76), method554(var80, var77), method554(var80, var78), method554(var80, var79), this.method551(var94, var76), this.method551(var94, var77), this.method551(var94, var78), this.method551(var94, var79), var88, var93);
                                }
                            }
                        }
                    }
                }
            }
            for (int var59 = 1; var59 < this.field1624 - 1; var59++) {
                for (int var60 = 1; var60 < this.field1623 - 1; var60++) {
                    arg1.method316(var5, var60, var59, this.method559(var5, false, var60, var59));
                }
            }
        }
        arg1.method343(-50, -10, -50, 487);
        if (arg0 != 95) {
            field1611 = !field1611;
        }
        for (int var6 = 0; var6 < this.field1623; var6++) {
            for (int var47 = 0; var47 < this.field1624; var47++) {
                if ((this.field1628[1][var6][var47] & 0x2) == 2) {
                    arg1.method314(var47, var6, -491);
                }
            }
        }
        int var7 = 1;
        int var8 = 2;
        int var9 = 4;
        for (int var10 = 0; var10 < 4; var10++) {
            if (var10 > 0) {
                var7 <<= 0x3;
                var8 <<= 0x3;
                var9 <<= 0x3;
            }
            for (int var11 = 0; var11 <= var10; var11++) {
                for (int var12 = 0; var12 <= this.field1624; var12++) {
                    for (int var13 = 0; var13 <= this.field1623; var13++) {
                        if ((this.field1608[var11][var13][var12] & var7) != 0) {
                            int var14 = var12;
                            int var15 = var12;
                            int var16 = var11;
                            int var17 = var11;
                            while (var14 > 0 && (this.field1608[var11][var13][var14 - 1] & var7) != 0) {
                                var14--;
                            }
                            while (var15 < this.field1624 && (this.field1608[var11][var13][var15 + 1] & var7) != 0) {
                                var15++;
                            }
                            label335: while (var16 > 0) {
                                for (int var18 = var14; var18 <= var15; var18++) {
                                    if ((this.field1608[var16 - 1][var13][var18] & var7) == 0) {
                                        break label335;
                                    }
                                }
                                var16--;
                            }
                            label324: while (var17 < var10) {
                                for (int var19 = var14; var19 <= var15; var19++) {
                                    if ((this.field1608[var17 + 1][var13][var19] & var7) == 0) {
                                        break label324;
                                    }
                                }
                                var17++;
                            }
                            int var20 = (var17 + 1 - var16) * (var15 + 1 - var14);
                            if (var20 >= 8) {
                                short var21 = 240;
                                int var22 = this.field1612[var17][var13][var14] - var21;
                                int var23 = this.field1612[var16][var13][var14];
                                class28.method315(1, var22, var15 * 128 + 128, false, var13 * 128, var10, var23, var14 * 128, var13 * 128);
                                for (int var24 = var16; var24 <= var17; var24++) {
                                    for (int var25 = var14; var25 <= var15; var25++) {
                                        this.field1608[var24][var13][var25] &= ~var7;
                                    }
                                }
                            }
                        }
                        if ((this.field1608[var11][var13][var12] & var8) != 0) {
                            int var26 = var13;
                            int var27 = var13;
                            int var28 = var11;
                            int var29 = var11;
                            while (var26 > 0 && (this.field1608[var11][var26 - 1][var12] & var8) != 0) {
                                var26--;
                            }
                            while (var27 < this.field1623 && (this.field1608[var11][var27 + 1][var12] & var8) != 0) {
                                var27++;
                            }
                            label388: while (var28 > 0) {
                                for (int var30 = var26; var30 <= var27; var30++) {
                                    if ((this.field1608[var28 - 1][var30][var12] & var8) == 0) {
                                        break label388;
                                    }
                                }
                                var28--;
                            }
                            label377: while (var29 < var10) {
                                for (int var31 = var26; var31 <= var27; var31++) {
                                    if ((this.field1608[var29 + 1][var31][var12] & var8) == 0) {
                                        break label377;
                                    }
                                }
                                var29++;
                            }
                            int var32 = (var29 + 1 - var28) * (var27 + 1 - var26);
                            if (var32 >= 8) {
                                short var33 = 240;
                                int var34 = this.field1612[var29][var26][var12] - var33;
                                int var35 = this.field1612[var28][var26][var12];
                                class28.method315(2, var34, var12 * 128, false, var27 * 128 + 128, var10, var35, var12 * 128, var26 * 128);
                                for (int var36 = var28; var36 <= var29; var36++) {
                                    for (int var37 = var26; var37 <= var27; var37++) {
                                        this.field1608[var36][var37][var12] &= ~var8;
                                    }
                                }
                            }
                        }
                        if ((this.field1608[var11][var13][var12] & var9) != 0) {
                            int var38 = var13;
                            int var39 = var13;
                            int var40 = var12;
                            int var41 = var12;
                            while (var40 > 0 && (this.field1608[var11][var13][var40 - 1] & var9) != 0) {
                                var40--;
                            }
                            while (var41 < this.field1624 && (this.field1608[var11][var13][var41 + 1] & var9) != 0) {
                                var41++;
                            }
                            label441: while (var38 > 0) {
                                for (int var42 = var40; var42 <= var41; var42++) {
                                    if ((this.field1608[var11][var38 - 1][var42] & var9) == 0) {
                                        break label441;
                                    }
                                }
                                var38--;
                            }
                            label430: while (var39 < this.field1623) {
                                for (int var43 = var40; var43 <= var41; var43++) {
                                    if ((this.field1608[var11][var39 + 1][var43] & var9) == 0) {
                                        break label430;
                                    }
                                }
                                var39++;
                            }
                            if ((var39 + 1 - var38) * (var41 + 1 - var40) >= 4) {
                                int var44 = this.field1612[var11][var38][var40];
                                class28.method315(4, var44, var41 * 128 + 128, false, var39 * 128 + 128, var10, var44, var40 * 128, var38 * 128);
                                for (int var45 = var38; var45 <= var39; var45++) {
                                    for (int var46 = var40; var46 <= var41; var46++) {
                                        this.field1608[var11][var45][var46] &= ~var9;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "YECQDWTF", name = "b", descriptor = "(III)I")
    private static final int method561(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method549(var3, var5);
        int var8 = method549(var3 + 1, var5);
        int var9 = method549(var3, var5 + 1);
        int var10 = method549(var3 + 1, var5 + 1);
        int var11 = method570(var7, var8, var4, arg2);
        int var12 = method570(var9, var10, var4, arg2);
        return method570(var11, var12, var6, arg2);
    }

    @OriginalMember(owner = "YECQDWTF", name = "a", descriptor = "(LPGNBHFUF;IIIIIII)V")
    private final void method562(class42 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 != 0) {
            this.field1610 = !this.field1610;
        }
        if (arg7 < 0 || arg7 >= 104 || arg4 < 0 || arg4 >= 104) {
            while (true) {
                int var11 = arg0.method420();
                if (var11 == 0) {
                    return;
                }
                if (var11 == 1) {
                    arg0.method420();
                    return;
                }
                if (var11 <= 49) {
                    arg0.method420();
                }
            }
        }
        this.field1628[arg3][arg7][arg4] = 0;
        while (true) {
            int var9 = arg0.method420();
            if (var9 == 0) {
                if (arg3 == 0) {
                    this.field1612[0][arg7][arg4] = -method565(arg7 + arg6 + 932731, arg4 + 556238 + arg5) * 8;
                    return;
                } else {
                    this.field1612[arg3][arg7][arg4] = this.field1612[arg3 - 1][arg7][arg4] - 240;
                    return;
                }
            }
            if (var9 == 1) {
                int var10 = arg0.method420();
                if (var10 == 1) {
                    var10 = 0;
                }
                if (arg3 == 0) {
                    this.field1612[0][arg7][arg4] = -var10 * 8;
                    return;
                }
                this.field1612[arg3][arg7][arg4] = this.field1612[arg3 - 1][arg7][arg4] - var10 * 8;
                return;
            }
            if (var9 <= 49) {
                this.field1625[arg3][arg7][arg4] = arg0.method421();
                this.field1613[arg3][arg7][arg4] = (byte) ((var9 - 2) / 4);
                this.field1620[arg3][arg7][arg4] = (byte) (var9 + arg2 - 2 & 0x3);
            } else if (var9 <= 81) {
                this.field1628[arg3][arg7][arg4] = (byte) (var9 - 49);
            } else {
                this.field1598[arg3][arg7][arg4] = (byte) (var9 - 81);
            }
        }
    }

    @OriginalMember(owner = "YECQDWTF", name = "a", descriptor = "(I[LBBRQYCNY;[BIIII)V")
    public final void method563(int arg0, class2[] arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6) {
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg3 + var13 > 0 && arg3 + var13 < 103 && arg5 + var14 > 0 && arg5 + var14 < 103) {
                        arg1[var8].field26[arg3 + var13][arg5 + var14] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class42 var9 = new class42(5, arg2);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    this.method562(var9, 0, 0, var10, arg5 + var12, arg4, arg0, arg3 + var11);
                }
            }
        }
        if (arg6 != 0) {
            this.field1610 = !this.field1610;
        }
    }

    @OriginalMember(owner = "YECQDWTF", name = "a", descriptor = "(I[BIZ)Z")
    public static final boolean method564(int arg0, byte[] arg1, int arg2, boolean arg3) {
        if (arg3) {
            field1605 = -101;
        }
        boolean var4 = true;
        class42 var5 = new class42(5, arg1);
        int var6 = -1;
        label54: while (true) {
            int var7 = var5.method434();
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method434();
                    if (var11 == 0) {
                        continue label54;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = var5.method420() >> 2;
                    int var15 = arg0 + var13;
                    int var16 = arg2 + var12;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        class7 var17 = class7.method219(var6);
                        if (var14 != 22 || !field1606 || var17.field599 || var17.field613) {
                            var4 &= var17.method210(-962);
                            var9 = true;
                        }
                    }
                }
                int var10 = var5.method434();
                if (var10 == 0) {
                    break;
                }
                var5.method420();
            }
        }
    }

    @OriginalMember(owner = "YECQDWTF", name = "e", descriptor = "(II)I")
    private static final int method565(int arg0, int arg1) {
        int var2 = method561(arg0 + 45365, arg1 + 91923, 4) + (method561(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method561(arg0, arg1, 1) - 128 >> 2) - 128;
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @OriginalMember(owner = "YECQDWTF", name = "a", descriptor = "(III[LBBRQYCNY;III[BIB)V")
    public final void method566(int arg0, int arg1, int arg2, class2[] arg3, int arg4, int arg5, int arg6, byte[] arg7, int arg8, byte arg9) {
        for (int var11 = 0; var11 < 8; var11++) {
            for (int var16 = 0; var16 < 8; var16++) {
                if (arg1 + var11 > 0 && arg1 + var11 < 103 && arg6 + var16 > 0 && arg6 + var16 < 103) {
                    arg3[arg4].field26[arg1 + var11][arg6 + var16] &= 0xFEFFFFFF;
                }
            }
        }
        class42 var12 = new class42(5, arg7);
        if (arg9 != 85) {
            return;
        }
        for (int var13 = 0; var13 < 4; var13++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    if (arg5 == var13 && var14 >= arg2 && var14 < arg2 + 8 && var15 >= arg8 && var15 < arg8 + 8) {
                        this.method562(var12, 0, arg0, arg4, arg6 + class51.method503(var15 & 0x7, var14 & 0x7, (byte) 77, arg0), 0, 0, arg1 + class51.method502(-698, arg0, var14 & 0x7, var15 & 0x7));
                    } else {
                        this.method562(var12, 0, 0, 0, -1, 0, 0, -1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "YECQDWTF", name = "a", descriptor = "(IIIII)V")
    public final void method567(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var6 = arg1; var6 <= arg1 + arg3; var6++) {
            for (int var7 = arg0; var7 <= arg0 + arg4; var7++) {
                if (var7 >= 0 && var7 < this.field1623 && var6 >= 0 && var6 < this.field1624) {
                    this.field1602[0][var7][var6] = 127;
                    if (arg0 == var7 && var7 > 0) {
                        this.field1612[0][var7][var6] = this.field1612[0][var7 - 1][var6];
                    }
                    if (arg0 + arg4 == var7 && var7 < this.field1623 - 1) {
                        this.field1612[0][var7][var6] = this.field1612[0][var7 + 1][var6];
                    }
                    if (arg1 == var6 && var6 > 0) {
                        this.field1612[0][var7][var6] = this.field1612[0][var7][var6 - 1];
                    }
                    if (arg1 + arg3 == var6 && var6 < this.field1624 - 1) {
                        this.field1612[0][var7][var6] = this.field1612[0][var7][var6 + 1];
                    }
                }
            }
        }
        if (arg2 > 0) {
            ;
        }
    }

    @OriginalMember(owner = "YECQDWTF", name = "a", descriptor = "(IZI)Z")
    public static final boolean method568(int arg0, boolean arg1, int arg2) {
        class7 var3 = class7.method219(arg2);
        if (!arg1) {
            throw new NullPointerException();
        }
        if (arg0 == 11) {
            arg0 = 10;
        }
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        return var3.method215(arg0, (byte) 50);
    }

    @OriginalMember(owner = "YECQDWTF", name = "a", descriptor = "(BLDGAWSPEW;LPGNBHFUF;)V")
    public static final void method569(byte arg0, class9 arg1, class42 arg2) {
        if (arg0 == 4) {
            boolean var3 = false;
        } else {
            field1611 = !field1611;
        }
        int var4 = -1;
        while (true) {
            int var5 = arg2.method434();
            if (var5 == 0) {
                return;
            }
            var4 += var5;
            class7 var6 = class7.method219(var4);
            var6.method218(0, arg1);
            while (true) {
                int var7 = arg2.method434();
                if (var7 == 0) {
                    break;
                }
                arg2.method420();
            }
        }
    }

    @OriginalMember(owner = "YECQDWTF", name = "a", descriptor = "(IIII)I")
    private static final int method570(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class10.field679[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }
}
