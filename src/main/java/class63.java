import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("UZSUQFDN")
public class class63 {

    @OriginalMember(owner = "UZSUQFDN", name = "m", descriptor = "Z")
    private boolean field1564 = false;

    @OriginalMember(owner = "UZSUQFDN", name = "x", descriptor = "I")
    private int field1575 = 489;

    @OriginalMember(owner = "UZSUQFDN", name = "E", descriptor = "Z")
    private boolean field1582 = false;

    @OriginalMember(owner = "UZSUQFDN", name = "i", descriptor = "I")
    private int field1560;

    @OriginalMember(owner = "UZSUQFDN", name = "j", descriptor = "I")
    private int field1561;

    @OriginalMember(owner = "UZSUQFDN", name = "v", descriptor = "[[[I")
    private int[][][] field1573;

    @OriginalMember(owner = "UZSUQFDN", name = "D", descriptor = "[[[B")
    private byte[][][] field1581;

    @OriginalMember(owner = "UZSUQFDN", name = "k", descriptor = "[[[B")
    private byte[][][] field1562;

    @OriginalMember(owner = "UZSUQFDN", name = "q", descriptor = "[[[B")
    private byte[][][] field1568;

    @OriginalMember(owner = "UZSUQFDN", name = "w", descriptor = "[[[B")
    private byte[][][] field1574;

    @OriginalMember(owner = "UZSUQFDN", name = "t", descriptor = "[[[B")
    private byte[][][] field1571;

    @OriginalMember(owner = "UZSUQFDN", name = "z", descriptor = "[[[I")
    private int[][][] field1577;

    @OriginalMember(owner = "UZSUQFDN", name = "F", descriptor = "[[[B")
    private byte[][][] field1583;

    @OriginalMember(owner = "UZSUQFDN", name = "s", descriptor = "[[I")
    private int[][] field1570;

    @OriginalMember(owner = "UZSUQFDN", name = "a", descriptor = "[I")
    private int[] field1552;

    @OriginalMember(owner = "UZSUQFDN", name = "b", descriptor = "[I")
    private int[] field1553;

    @OriginalMember(owner = "UZSUQFDN", name = "c", descriptor = "[I")
    private int[] field1554;

    @OriginalMember(owner = "UZSUQFDN", name = "d", descriptor = "[I")
    private int[] field1555;

    @OriginalMember(owner = "UZSUQFDN", name = "e", descriptor = "[I")
    private int[] field1556;

    @OriginalMember(owner = "UZSUQFDN", name = "f", descriptor = "I")
    private static int field1557 = 6;

    @OriginalMember(owner = "UZSUQFDN", name = "g", descriptor = "[I")
    private static final int[] field1558 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "UZSUQFDN", name = "h", descriptor = "I")
    public static int field1559 = 99;

    @OriginalMember(owner = "UZSUQFDN", name = "l", descriptor = "I")
    private static int field1563 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "UZSUQFDN", name = "n", descriptor = "[I")
    private static final int[] field1565 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "UZSUQFDN", name = "o", descriptor = "I")
    private static int field1566 = -690;

    @OriginalMember(owner = "UZSUQFDN", name = "p", descriptor = "I")
    private static int field1567 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "UZSUQFDN", name = "u", descriptor = "Z")
    private static boolean field1572 = true;

    @OriginalMember(owner = "UZSUQFDN", name = "y", descriptor = "Z")
    public static boolean field1576 = true;

    @OriginalMember(owner = "UZSUQFDN", name = "A", descriptor = "[I")
    private static final int[] field1578 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "UZSUQFDN", name = "C", descriptor = "[I")
    private static final int[] field1580 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "UZSUQFDN", name = "G", descriptor = "I")
    private static int field1584 = 732;

    @OriginalMember(owner = "UZSUQFDN", name = "r", descriptor = "I")
    private int field1569;

    @OriginalMember(owner = "UZSUQFDN", name = "B", descriptor = "I")
    public static int field1579;

    @OriginalMember(owner = "UZSUQFDN", name = "a", descriptor = "(I[LOPAHDXQS;IIILKALHRUDX;IIII[B)V")
    public final void method492(int arg0, class43[] arg1, int arg2, int arg3, int arg4, class28 arg5, int arg6, int arg7, int arg8, int arg9, byte[] arg10) {
        class68 var12 = new class68((byte) 9, arg10);
        int var13 = -1;
        if (arg3 < 2 || arg3 > 2) {
            this.field1569 = 77;
        }
        while (true) {
            int var14 = var12.method548();
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method548();
                if (var16 == 0) {
                    break;
                }
                var15 += var16 - 1;
                int var17 = var15 & 0x3F;
                int var18 = var15 >> 6 & 0x3F;
                int var19 = var15 >> 12;
                int var20 = var12.method534();
                int var21 = var20 >> 2;
                int var22 = var20 & 0x3;
                if (arg2 == var19 && var18 >= arg9 && var18 < arg9 + 8 && var17 >= arg0 && var17 < arg0 + 8) {
                    class58 var23 = class58.method455(var13);
                    int var24 = arg7 + class59.method463(3, var23.field1439, arg6, var18 & 0x7, var17 & 0x7, var23.field1450);
                    int var25 = arg8 + class59.method464(var17 & 0x7, arg6, var23.field1439, var23.field1450, (byte) -7, var18 & 0x7);
                    if (var24 > 0 && var25 > 0 && var24 < 103 && var25 < 103) {
                        int var26 = arg4;
                        if ((this.field1581[1][var24][var25] & 0x2) == 2) {
                            var26 = arg4 - 1;
                        }
                        class43 var27 = null;
                        if (var26 >= 0) {
                            var27 = arg1[var26];
                        }
                        this.method493(arg4, arg6 + var22 & 0x3, arg5, var27, var25, var13, var24, 555, var21);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "UZSUQFDN", name = "a", descriptor = "(IILKALHRUDX;LOPAHDXQS;IIIII)V")
    private final void method493(int arg0, int arg1, class28 arg2, class43 arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (field1576 && (this.field1581[0][arg6][arg4] & 0x2) == 0) {
            if ((this.field1581[arg0][arg6][arg4] & 0x10) != 0) {
                return;
            }
            if (this.method502(arg0, arg4, arg6, 489) != field1579) {
                return;
            }
        }
        if (arg0 < field1559) {
            field1559 = arg0;
        }
        int var10 = this.field1573[arg0][arg6][arg4];
        int var11 = this.field1573[arg0][arg6 + 1][arg4];
        int var12 = this.field1573[arg0][arg6 + 1][arg4 + 1];
        int var13 = this.field1573[arg0][arg6][arg4 + 1];
        int var14 = var10 + var11 + var12 + var13 >> 2;
        class58 var15 = class58.method455(arg5);
        int var16 = (arg5 << 14) + (arg4 << 7) + arg6 + 1073741824;
        int var17 = 86 / arg7;
        if (!var15.field1448) {
            var16 += Integer.MIN_VALUE;
        }
        byte var18 = (byte) ((arg1 << 6) + arg8);
        if (arg8 == 22) {
            if (!field1576 || var15.field1448 || var15.field1462) {
                class39 var19;
                if (var15.field1442 == -1 && var15.field1467 == null) {
                    var19 = var15.method456(22, arg1, var10, var11, var12, var13, -1);
                } else {
                    var19 = new class1(var10, var11, arg1, 22, var15.field1442, arg5, var12, true, var13, field1557);
                }
                arg2.method312(var18, -77, var16, arg4, var19, arg0, arg6, var14);
                if (var15.field1483 && var15.field1448 && arg3 != null) {
                    arg3.method374(2, arg6, arg4);
                }
            }
        } else if (arg8 == 10 || arg8 == 11) {
            class39 var39;
            if (var15.field1442 == -1 && var15.field1467 == null) {
                var39 = var15.method456(10, arg1, var10, var11, var12, var13, -1);
            } else {
                var39 = new class1(var10, var11, arg1, 10, var15.field1442, arg5, var12, true, var13, field1557);
            }
            if (var39 != null) {
                int var40 = 0;
                if (arg8 == 11) {
                    var40 += 256;
                }
                int var41;
                int var42;
                if (arg1 == 1 || arg1 == 3) {
                    var41 = var15.field1439;
                    var42 = var15.field1450;
                } else {
                    var41 = var15.field1450;
                    var42 = var15.field1439;
                }
                if (arg2.method316(-39393, var42, var39, var41, var14, var40, arg6, var16, arg0, var18, arg4) && var15.field1474) {
                    class19 var43;
                    if (var39 instanceof class19) {
                        var43 = (class19) var39;
                    } else {
                        var43 = var15.method456(10, arg1, var10, var11, var12, var13, -1);
                    }
                    if (var43 != null) {
                        for (int var44 = 0; var44 <= var41; var44++) {
                            for (int var45 = 0; var45 <= var42; var45++) {
                                int var46 = var43.field757 / 4;
                                if (var46 > 30) {
                                    var46 = 30;
                                }
                                if (var46 > this.field1583[arg0][arg6 + var44][arg4 + var45]) {
                                    this.field1583[arg0][arg6 + var44][arg4 + var45] = (byte) var46;
                                }
                            }
                        }
                    }
                }
            }
            if (var15.field1483 && arg3 != null) {
                arg3.method373(arg4, var15.field1445, arg1, (byte) 8, var15.field1439, var15.field1450, arg6);
            }
        } else if (arg8 >= 12) {
            class39 var20;
            if (var15.field1442 == -1 && var15.field1467 == null) {
                var20 = var15.method456(arg8, arg1, var10, var11, var12, var13, -1);
            } else {
                var20 = new class1(var10, var11, arg1, arg8, var15.field1442, arg5, var12, true, var13, field1557);
            }
            arg2.method316(-39393, 1, var20, 1, var14, 0, arg6, var16, arg0, var18, arg4);
            if (arg8 >= 12 && arg8 <= 17 && arg8 != 13 && arg0 > 0) {
                this.field1577[arg0][arg6][arg4] |= 0x924;
            }
            if (var15.field1483 && arg3 != null) {
                arg3.method373(arg4, var15.field1445, arg1, (byte) 8, var15.field1439, var15.field1450, arg6);
            }
        } else if (arg8 == 0) {
            class39 var21;
            if (var15.field1442 == -1 && var15.field1467 == null) {
                var21 = var15.method456(0, arg1, var10, var11, var12, var13, -1);
            } else {
                var21 = new class1(var10, var11, arg1, 0, var15.field1442, arg5, var12, true, var13, field1557);
            }
            arg2.method314(arg6, var14, var16, 0, var18, 37482, var21, field1565[arg1], arg4, arg0, null);
            if (arg1 == 0) {
                if (var15.field1474) {
                    this.field1583[arg0][arg6][arg4] = 50;
                    this.field1583[arg0][arg6][arg4 + 1] = 50;
                }
                if (var15.field1454) {
                    this.field1577[arg0][arg6][arg4] |= 0x249;
                }
            } else if (arg1 == 1) {
                if (var15.field1474) {
                    this.field1583[arg0][arg6][arg4 + 1] = 50;
                    this.field1583[arg0][arg6 + 1][arg4 + 1] = 50;
                }
                if (var15.field1454) {
                    this.field1577[arg0][arg6][arg4 + 1] |= 0x492;
                }
            } else if (arg1 == 2) {
                if (var15.field1474) {
                    this.field1583[arg0][arg6 + 1][arg4] = 50;
                    this.field1583[arg0][arg6 + 1][arg4 + 1] = 50;
                }
                if (var15.field1454) {
                    this.field1577[arg0][arg6 + 1][arg4] |= 0x249;
                }
            } else if (arg1 == 3) {
                if (var15.field1474) {
                    this.field1583[arg0][arg6][arg4] = 50;
                    this.field1583[arg0][arg6 + 1][arg4] = 50;
                }
                if (var15.field1454) {
                    this.field1577[arg0][arg6][arg4] |= 0x492;
                }
            }
            if (var15.field1483 && arg3 != null) {
                arg3.method372(-787, arg1, var15.field1445, arg6, arg4, arg8);
            }
            if (var15.field1478 != 16) {
                arg2.method322(var15.field1478, arg4, arg6, arg0, true);
            }
        } else if (arg8 == 1) {
            class39 var22;
            if (var15.field1442 == -1 && var15.field1467 == null) {
                var22 = var15.method456(1, arg1, var10, var11, var12, var13, -1);
            } else {
                var22 = new class1(var10, var11, arg1, 1, var15.field1442, arg5, var12, true, var13, field1557);
            }
            arg2.method314(arg6, var14, var16, 0, var18, 37482, var22, field1580[arg1], arg4, arg0, null);
            if (var15.field1474) {
                if (arg1 == 0) {
                    this.field1583[arg0][arg6][arg4 + 1] = 50;
                } else if (arg1 == 1) {
                    this.field1583[arg0][arg6 + 1][arg4 + 1] = 50;
                } else if (arg1 == 2) {
                    this.field1583[arg0][arg6 + 1][arg4] = 50;
                } else if (arg1 == 3) {
                    this.field1583[arg0][arg6][arg4] = 50;
                }
            }
            if (var15.field1483 && arg3 != null) {
                arg3.method372(-787, arg1, var15.field1445, arg6, arg4, arg8);
            }
        } else if (arg8 == 2) {
            int var23 = arg1 + 1 & 0x3;
            class39 var24;
            class39 var25;
            if (var15.field1442 == -1 && var15.field1467 == null) {
                var24 = var15.method456(2, arg1 + 4, var10, var11, var12, var13, -1);
                var25 = var15.method456(2, var23, var10, var11, var12, var13, -1);
            } else {
                var24 = new class1(var10, var11, arg1 + 4, 2, var15.field1442, arg5, var12, true, var13, field1557);
                var25 = new class1(var10, var11, var23, 2, var15.field1442, arg5, var12, true, var13, field1557);
            }
            arg2.method314(arg6, var14, var16, field1565[var23], var18, 37482, var24, field1565[arg1], arg4, arg0, var25);
            if (var15.field1454) {
                if (arg1 == 0) {
                    this.field1577[arg0][arg6][arg4] |= 0x249;
                    this.field1577[arg0][arg6][arg4 + 1] |= 0x492;
                } else if (arg1 == 1) {
                    this.field1577[arg0][arg6][arg4 + 1] |= 0x492;
                    this.field1577[arg0][arg6 + 1][arg4] |= 0x249;
                } else if (arg1 == 2) {
                    this.field1577[arg0][arg6 + 1][arg4] |= 0x249;
                    this.field1577[arg0][arg6][arg4] |= 0x492;
                } else if (arg1 == 3) {
                    this.field1577[arg0][arg6][arg4] |= 0x492;
                    this.field1577[arg0][arg6][arg4] |= 0x249;
                }
            }
            if (var15.field1483 && arg3 != null) {
                arg3.method372(-787, arg1, var15.field1445, arg6, arg4, arg8);
            }
            if (var15.field1478 != 16) {
                arg2.method322(var15.field1478, arg4, arg6, arg0, true);
            }
        } else if (arg8 == 3) {
            class39 var26;
            if (var15.field1442 == -1 && var15.field1467 == null) {
                var26 = var15.method456(3, arg1, var10, var11, var12, var13, -1);
            } else {
                var26 = new class1(var10, var11, arg1, 3, var15.field1442, arg5, var12, true, var13, field1557);
            }
            arg2.method314(arg6, var14, var16, 0, var18, 37482, var26, field1580[arg1], arg4, arg0, null);
            if (var15.field1474) {
                if (arg1 == 0) {
                    this.field1583[arg0][arg6][arg4 + 1] = 50;
                } else if (arg1 == 1) {
                    this.field1583[arg0][arg6 + 1][arg4 + 1] = 50;
                } else if (arg1 == 2) {
                    this.field1583[arg0][arg6 + 1][arg4] = 50;
                } else if (arg1 == 3) {
                    this.field1583[arg0][arg6][arg4] = 50;
                }
            }
            if (var15.field1483 && arg3 != null) {
                arg3.method372(-787, arg1, var15.field1445, arg6, arg4, arg8);
            }
        } else if (arg8 == 9) {
            class39 var27;
            if (var15.field1442 == -1 && var15.field1467 == null) {
                var27 = var15.method456(arg8, arg1, var10, var11, var12, var13, -1);
            } else {
                var27 = new class1(var10, var11, arg1, arg8, var15.field1442, arg5, var12, true, var13, field1557);
            }
            arg2.method316(-39393, 1, var27, 1, var14, 0, arg6, var16, arg0, var18, arg4);
            if (var15.field1483 && arg3 != null) {
                arg3.method373(arg4, var15.field1445, arg1, (byte) 8, var15.field1439, var15.field1450, arg6);
            }
        } else {
            if (var15.field1459) {
                if (arg1 == 1) {
                    int var28 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var10;
                    var10 = var28;
                } else if (arg1 == 2) {
                    int var29 = var13;
                    var13 = var11;
                    var11 = var29;
                    int var30 = var12;
                    var12 = var10;
                    var10 = var30;
                } else if (arg1 == 3) {
                    int var31 = var13;
                    var13 = var10;
                    var10 = var11;
                    var11 = var12;
                    var12 = var31;
                }
            }
            if (arg8 == 4) {
                class39 var32;
                if (var15.field1442 == -1 && var15.field1467 == null) {
                    var32 = var15.method456(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var32 = new class1(var10, var11, 0, 4, var15.field1442, arg5, var12, true, var13, field1557);
                }
                arg2.method315(0, var18, arg6, var14, arg4, (byte) -74, arg1 * 512, var32, var16, arg0, field1565[arg1], 0);
            } else if (arg8 == 5) {
                int var33 = 16;
                int var34 = arg2.method332(arg0, arg6, arg4);
                if (var34 > 0) {
                    var33 = class58.method455(var34 >> 14 & 0x7FFF).field1478;
                }
                class39 var35;
                if (var15.field1442 == -1 && var15.field1467 == null) {
                    var35 = var15.method456(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var35 = new class1(var10, var11, 0, 4, var15.field1442, arg5, var12, true, var13, field1557);
                }
                arg2.method315(field1578[arg1] * var33, var18, arg6, var14, arg4, (byte) -74, arg1 * 512, var35, var16, arg0, field1565[arg1], field1558[arg1] * var33);
            } else if (arg8 == 6) {
                class39 var36;
                if (var15.field1442 == -1 && var15.field1467 == null) {
                    var36 = var15.method456(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var36 = new class1(var10, var11, 0, 4, var15.field1442, arg5, var12, true, var13, field1557);
                }
                arg2.method315(0, var18, arg6, var14, arg4, (byte) -74, arg1, var36, var16, arg0, 256, 0);
            } else if (arg8 == 7) {
                class39 var37;
                if (var15.field1442 == -1 && var15.field1467 == null) {
                    var37 = var15.method456(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var37 = new class1(var10, var11, 0, 4, var15.field1442, arg5, var12, true, var13, field1557);
                }
                arg2.method315(0, var18, arg6, var14, arg4, (byte) -74, arg1, var37, var16, arg0, 512, 0);
            } else if (arg8 == 8) {
                class39 var38;
                if (var15.field1442 == -1 && var15.field1467 == null) {
                    var38 = var15.method456(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var38 = new class1(var10, var11, 0, 4, var15.field1442, arg5, var12, true, var13, field1557);
                }
                arg2.method315(0, var18, arg6, var14, arg4, (byte) -74, arg1, var38, var16, arg0, 768, 0);
            }
        }
    }

    @OriginalMember(owner = "UZSUQFDN", name = "a", descriptor = "([LOPAHDXQS;ILKALHRUDX;[BII)V")
    public final void method494(class43[] arg0, int arg1, class28 arg2, byte[] arg3, int arg4, int arg5) {
        class68 var7 = new class68((byte) 9, arg3);
        int var8 = -1;
        if (arg5 != 0) {
            field1566 = -483;
        }
        while (true) {
            int var9 = var7.method548();
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method548();
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = var10 & 0x3F;
                int var13 = var10 >> 6 & 0x3F;
                int var14 = var10 >> 12;
                int var15 = var7.method534();
                int var16 = var15 >> 2;
                int var17 = var15 & 0x3;
                int var18 = arg4 + var13;
                int var19 = arg1 + var12;
                if (var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) {
                    int var20 = var14;
                    if ((this.field1581[1][var18][var19] & 0x2) == 2) {
                        var20 = var14 - 1;
                    }
                    class43 var21 = null;
                    if (var20 >= 0) {
                        var21 = arg0[var20];
                    }
                    this.method493(var14, var17, arg2, var21, var19, var8, var18, 555, var16);
                }
            }
        }
    }

    @OriginalMember(owner = "UZSUQFDN", name = "a", descriptor = "(II)I")
    private static final int method495(int arg0, int arg1) {
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

    @OriginalMember(owner = "UZSUQFDN", name = "b", descriptor = "(II)I")
    private static final int method496(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "UZSUQFDN", name = "a", descriptor = "(IIII)I")
    private static final int method497(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class12.field640[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @OriginalMember(owner = "UZSUQFDN", name = "a", descriptor = "(II[BI)Z")
    public static final boolean method498(int arg0, int arg1, byte[] arg2, int arg3) {
        boolean var4 = true;
        class68 var5 = new class68((byte) 9, arg2);
        if (arg3 != 43518) {
            throw new NullPointerException();
        }
        int var6 = -1;
        label54: while (true) {
            int var7 = var5.method548();
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method548();
                    if (var11 == 0) {
                        continue label54;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = var5.method534() >> 2;
                    int var15 = arg0 + var13;
                    int var16 = arg1 + var12;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        class58 var17 = class58.method455(var6);
                        if (var14 != 22 || !field1576 || var17.field1448 || var17.field1462) {
                            var4 &= var17.method458(-225);
                            var9 = true;
                        }
                    }
                }
                int var10 = var5.method548();
                if (var10 == 0) {
                    break;
                }
                var5.method534();
            }
        }
    }

    @OriginalMember(owner = "UZSUQFDN", name = "a", descriptor = "(IIIII)V")
    public final void method499(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 0) {
            return;
        }
        for (int var6 = arg3; var6 <= arg1 + arg3; var6++) {
            for (int var7 = arg4; var7 <= arg2 + arg4; var7++) {
                if (var7 >= 0 && var7 < this.field1560 && var6 >= 0 && var6 < this.field1561) {
                    this.field1583[0][var7][var6] = 127;
                    if (arg4 == var7 && var7 > 0) {
                        this.field1573[0][var7][var6] = this.field1573[0][var7 - 1][var6];
                    }
                    if (arg2 + arg4 == var7 && var7 < this.field1560 - 1) {
                        this.field1573[0][var7][var6] = this.field1573[0][var7 + 1][var6];
                    }
                    if (arg3 == var6 && var6 > 0) {
                        this.field1573[0][var7][var6] = this.field1573[0][var7][var6 - 1];
                    }
                    if (arg1 + arg3 == var6 && var6 < this.field1561 - 1) {
                        this.field1573[0][var7][var6] = this.field1573[0][var7][var6 + 1];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "UZSUQFDN", name = "a", descriptor = "(III)Z")
    public static final boolean method500(int arg0, int arg1, int arg2) {
        if (arg0 >= 0) {
            field1584 = 9;
        }
        class58 var3 = class58.method455(arg1);
        if (arg2 == 11) {
            arg2 = 10;
        }
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        return var3.method450(arg2, false);
    }

    @OriginalMember(owner = "UZSUQFDN", name = "c", descriptor = "(II)I")
    private static final int method501(int arg0, int arg1) {
        int var2 = method512(arg0 + 45365, arg1 + 91923, 4) + (method512(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method512(arg0, arg1, 1) - 128 >> 2) - 128;
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @OriginalMember(owner = "UZSUQFDN", name = "b", descriptor = "(IIII)I")
    public int method502(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 <= 0) {
            return 2;
        } else if ((this.field1581[arg0][arg2][arg1] & 0x8) == 0) {
            return arg0 <= 0 || (this.field1581[1][arg2][arg1] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "UZSUQFDN", name = "a", descriptor = "([LOPAHDXQS;[BIIIIIIII)V")
    public final void method503(class43[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 <= 0) {
            field1572 = !field1572;
        }
        for (int var11 = 0; var11 < 8; var11++) {
            for (int var16 = 0; var16 < 8; var16++) {
                if (arg4 + var11 > 0 && arg4 + var11 < 103 && arg9 + var16 > 0 && arg9 + var16 < 103) {
                    arg0[arg8].field1163[arg4 + var11][arg9 + var16] &= 0xFEFFFFFF;
                }
            }
        }
        class68 var12 = new class68((byte) 9, arg1);
        for (int var13 = 0; var13 < 4; var13++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    if (arg3 == var13 && var14 >= arg7 && var14 < arg7 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                        this.method505(arg5, false, 0, var12, arg8, arg4 + class59.method461(-228, var14 & 0x7, arg5, var15 & 0x7), 0, arg9 + class59.method462(var14 & 0x7, arg5, true, var15 & 0x7));
                    } else {
                        this.method505(0, false, 0, var12, 0, -1, 0, -1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "UZSUQFDN", name = "d", descriptor = "(II)I")
    private final int method504(int arg0, int arg1) {
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

    @OriginalMember(owner = "UZSUQFDN", name = "a", descriptor = "(IZILXJCNBMKS;IIII)V")
    private final void method505(int arg0, boolean arg1, int arg2, class68 arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1) {
            return;
        }
        if (arg5 < 0 || arg5 >= 104 || arg7 < 0 || arg7 >= 104) {
            while (true) {
                int var11 = arg3.method534();
                if (var11 == 0) {
                    return;
                }
                if (var11 == 1) {
                    arg3.method534();
                    return;
                }
                if (var11 <= 49) {
                    arg3.method534();
                }
            }
        }
        this.field1581[arg4][arg5][arg7] = 0;
        while (true) {
            int var9 = arg3.method534();
            if (var9 == 0) {
                if (arg4 == 0) {
                    this.field1573[0][arg5][arg7] = -method501(arg5 + arg6 + 932731, arg7 + 556238 + arg2) * 8;
                    return;
                } else {
                    this.field1573[arg4][arg5][arg7] = this.field1573[arg4 - 1][arg5][arg7] - 240;
                    return;
                }
            }
            if (var9 == 1) {
                int var10 = arg3.method534();
                if (var10 == 1) {
                    var10 = 0;
                }
                if (arg4 == 0) {
                    this.field1573[0][arg5][arg7] = -var10 * 8;
                    return;
                }
                this.field1573[arg4][arg5][arg7] = this.field1573[arg4 - 1][arg5][arg7] - var10 * 8;
                return;
            }
            if (var9 <= 49) {
                this.field1568[arg4][arg5][arg7] = arg3.method535();
                this.field1574[arg4][arg5][arg7] = (byte) ((var9 - 2) / 4);
                this.field1571[arg4][arg5][arg7] = (byte) (var9 + arg0 - 2 & 0x3);
            } else if (var9 <= 81) {
                this.field1581[arg4][arg5][arg7] = (byte) (var9 - 49);
            } else {
                this.field1562[arg4][arg5][arg7] = (byte) (var9 - 81);
            }
        }
    }

    @OriginalMember(owner = "UZSUQFDN", name = "a", descriptor = "(LSDLNXGIT;LXJCNBMKS;Z)V")
    public static final void method506(class57 arg0, class68 arg1, boolean arg2) {
        int var3 = -1;
        if (arg2) {
            field1566 = -70;
        }
        while (true) {
            int var4 = arg1.method548();
            if (var4 == 0) {
                return;
            }
            var3 += var4;
            class58 var5 = class58.method455(var3);
            var5.method453(arg0, 746);
            while (true) {
                int var6 = arg1.method548();
                if (var6 == 0) {
                    break;
                }
                arg1.method534();
            }
        }
    }

    @OriginalMember(owner = "UZSUQFDN", name = "b", descriptor = "(III)I")
    private final int method507(int arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "UZSUQFDN", name = "e", descriptor = "(II)I")
    private static final int method508(int arg0, int arg1) {
        int var2 = method496(arg0 - 1, arg1 - 1) + method496(arg0 + 1, arg1 - 1) + method496(arg0 - 1, arg1 + 1) + method496(arg0 + 1, arg1 + 1);
        int var3 = method496(arg0 - 1, arg1) + method496(arg0 + 1, arg1) + method496(arg0, arg1 - 1) + method496(arg0, arg1 + 1);
        int var4 = method496(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @OriginalMember(owner = "UZSUQFDN", name = "a", descriptor = "(IIBI[LOPAHDXQS;[BI)V")
    public final void method509(int arg0, int arg1, byte arg2, int arg3, class43[] arg4, byte[] arg5, int arg6) {
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg3 + var13 > 0 && arg3 + var13 < 103 && arg1 + var14 > 0 && arg1 + var14 < 103) {
                        arg4[var8].field1163[arg3 + var13][arg1 + var14] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class68 var9 = new class68((byte) 9, arg5);
        if (arg2 != 57) {
            return;
        }
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    this.method505(0, false, arg0, var9, var10, arg3 + var11, arg6, arg1 + var12);
                }
            }
        }
    }

    @OriginalMember(owner = "UZSUQFDN", name = "a", descriptor = "(ZIIIILKALHRUDX;LOPAHDXQS;II[[[II)V")
    public static final void method510(boolean arg0, int arg1, int arg2, int arg3, int arg4, class28 arg5, class43 arg6, int arg7, int arg8, int[][][] arg9, int arg10) {
        int var11 = arg9[arg7][arg4][arg1];
        int var12 = arg9[arg7][arg4 + 1][arg1];
        int var13 = arg9[arg7][arg4 + 1][arg1 + 1];
        int var14 = arg9[arg7][arg4][arg1 + 1];
        int var15 = var11 + var12 + var13 + var14 >> 2;
        class58 var16 = class58.method455(arg10);
        int var17 = (arg10 << 14) + (arg1 << 7) + arg4 + 1073741824;
        if (!var16.field1448) {
            var17 += Integer.MIN_VALUE;
        }
        byte var18 = (byte) ((arg8 << 6) + arg3);
        if (!arg0) {
            field1572 = !field1572;
        }
        if (arg3 == 22) {
            class39 var19;
            if (var16.field1442 == -1 && var16.field1467 == null) {
                var19 = var16.method456(22, arg8, var11, var12, var13, var14, -1);
            } else {
                var19 = new class1(var11, var12, arg8, 22, var16.field1442, arg10, var13, true, var14, field1557);
            }
            arg5.method312(var18, -77, var17, arg1, var19, arg2, arg4, var15);
            if (var16.field1483 && var16.field1448) {
                arg6.method374(2, arg4, arg1);
            }
        } else if (arg3 == 10 || arg3 == 11) {
            class39 var39;
            if (var16.field1442 == -1 && var16.field1467 == null) {
                var39 = var16.method456(10, arg8, var11, var12, var13, var14, -1);
            } else {
                var39 = new class1(var11, var12, arg8, 10, var16.field1442, arg10, var13, true, var14, field1557);
            }
            if (var39 != null) {
                int var40 = 0;
                if (arg3 == 11) {
                    var40 += 256;
                }
                int var41;
                int var42;
                if (arg8 == 1 || arg8 == 3) {
                    var41 = var16.field1439;
                    var42 = var16.field1450;
                } else {
                    var41 = var16.field1450;
                    var42 = var16.field1439;
                }
                arg5.method316(-39393, var42, var39, var41, var15, var40, arg4, var17, arg2, var18, arg1);
            }
            if (var16.field1483) {
                arg6.method373(arg1, var16.field1445, arg8, (byte) 8, var16.field1439, var16.field1450, arg4);
            }
        } else if (arg3 >= 12) {
            class39 var20;
            if (var16.field1442 == -1 && var16.field1467 == null) {
                var20 = var16.method456(arg3, arg8, var11, var12, var13, var14, -1);
            } else {
                var20 = new class1(var11, var12, arg8, arg3, var16.field1442, arg10, var13, true, var14, field1557);
            }
            arg5.method316(-39393, 1, var20, 1, var15, 0, arg4, var17, arg2, var18, arg1);
            if (var16.field1483) {
                arg6.method373(arg1, var16.field1445, arg8, (byte) 8, var16.field1439, var16.field1450, arg4);
            }
        } else if (arg3 == 0) {
            class39 var21;
            if (var16.field1442 == -1 && var16.field1467 == null) {
                var21 = var16.method456(0, arg8, var11, var12, var13, var14, -1);
            } else {
                var21 = new class1(var11, var12, arg8, 0, var16.field1442, arg10, var13, true, var14, field1557);
            }
            arg5.method314(arg4, var15, var17, 0, var18, 37482, var21, field1565[arg8], arg1, arg2, null);
            if (var16.field1483) {
                arg6.method372(-787, arg8, var16.field1445, arg4, arg1, arg3);
            }
        } else if (arg3 == 1) {
            class39 var22;
            if (var16.field1442 == -1 && var16.field1467 == null) {
                var22 = var16.method456(1, arg8, var11, var12, var13, var14, -1);
            } else {
                var22 = new class1(var11, var12, arg8, 1, var16.field1442, arg10, var13, true, var14, field1557);
            }
            arg5.method314(arg4, var15, var17, 0, var18, 37482, var22, field1580[arg8], arg1, arg2, null);
            if (var16.field1483) {
                arg6.method372(-787, arg8, var16.field1445, arg4, arg1, arg3);
            }
        } else if (arg3 == 2) {
            int var23 = arg8 + 1 & 0x3;
            class39 var24;
            class39 var25;
            if (var16.field1442 == -1 && var16.field1467 == null) {
                var24 = var16.method456(2, arg8 + 4, var11, var12, var13, var14, -1);
                var25 = var16.method456(2, var23, var11, var12, var13, var14, -1);
            } else {
                var24 = new class1(var11, var12, arg8 + 4, 2, var16.field1442, arg10, var13, true, var14, field1557);
                var25 = new class1(var11, var12, var23, 2, var16.field1442, arg10, var13, true, var14, field1557);
            }
            arg5.method314(arg4, var15, var17, field1565[var23], var18, 37482, var24, field1565[arg8], arg1, arg2, var25);
            if (var16.field1483) {
                arg6.method372(-787, arg8, var16.field1445, arg4, arg1, arg3);
            }
        } else if (arg3 == 3) {
            class39 var26;
            if (var16.field1442 == -1 && var16.field1467 == null) {
                var26 = var16.method456(3, arg8, var11, var12, var13, var14, -1);
            } else {
                var26 = new class1(var11, var12, arg8, 3, var16.field1442, arg10, var13, true, var14, field1557);
            }
            arg5.method314(arg4, var15, var17, 0, var18, 37482, var26, field1580[arg8], arg1, arg2, null);
            if (var16.field1483) {
                arg6.method372(-787, arg8, var16.field1445, arg4, arg1, arg3);
            }
        } else if (arg3 == 9) {
            class39 var27;
            if (var16.field1442 == -1 && var16.field1467 == null) {
                var27 = var16.method456(arg3, arg8, var11, var12, var13, var14, -1);
            } else {
                var27 = new class1(var11, var12, arg8, arg3, var16.field1442, arg10, var13, true, var14, field1557);
            }
            arg5.method316(-39393, 1, var27, 1, var15, 0, arg4, var17, arg2, var18, arg1);
            if (var16.field1483) {
                arg6.method373(arg1, var16.field1445, arg8, (byte) 8, var16.field1439, var16.field1450, arg4);
            }
        } else {
            if (var16.field1459) {
                if (arg8 == 1) {
                    int var28 = var14;
                    var14 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var28;
                } else if (arg8 == 2) {
                    int var29 = var14;
                    var14 = var12;
                    var12 = var29;
                    int var30 = var13;
                    var13 = var11;
                    var11 = var30;
                } else if (arg8 == 3) {
                    int var31 = var14;
                    var14 = var11;
                    var11 = var12;
                    var12 = var13;
                    var13 = var31;
                }
            }
            if (arg3 == 4) {
                class39 var32;
                if (var16.field1442 == -1 && var16.field1467 == null) {
                    var32 = var16.method456(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var32 = new class1(var11, var12, 0, 4, var16.field1442, arg10, var13, true, var14, field1557);
                }
                arg5.method315(0, var18, arg4, var15, arg1, (byte) -74, arg8 * 512, var32, var17, arg2, field1565[arg8], 0);
            } else if (arg3 == 5) {
                int var33 = 16;
                int var34 = arg5.method332(arg2, arg4, arg1);
                if (var34 > 0) {
                    var33 = class58.method455(var34 >> 14 & 0x7FFF).field1478;
                }
                class39 var35;
                if (var16.field1442 == -1 && var16.field1467 == null) {
                    var35 = var16.method456(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var35 = new class1(var11, var12, 0, 4, var16.field1442, arg10, var13, true, var14, field1557);
                }
                arg5.method315(field1578[arg8] * var33, var18, arg4, var15, arg1, (byte) -74, arg8 * 512, var35, var17, arg2, field1565[arg8], field1558[arg8] * var33);
            } else if (arg3 == 6) {
                class39 var36;
                if (var16.field1442 == -1 && var16.field1467 == null) {
                    var36 = var16.method456(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var36 = new class1(var11, var12, 0, 4, var16.field1442, arg10, var13, true, var14, field1557);
                }
                arg5.method315(0, var18, arg4, var15, arg1, (byte) -74, arg8, var36, var17, arg2, 256, 0);
            } else if (arg3 == 7) {
                class39 var37;
                if (var16.field1442 == -1 && var16.field1467 == null) {
                    var37 = var16.method456(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var37 = new class1(var11, var12, 0, 4, var16.field1442, arg10, var13, true, var14, field1557);
                }
                arg5.method315(0, var18, arg4, var15, arg1, (byte) -74, arg8, var37, var17, arg2, 512, 0);
            } else if (arg3 == 8) {
                class39 var38;
                if (var16.field1442 == -1 && var16.field1467 == null) {
                    var38 = var16.method456(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var38 = new class1(var11, var12, 0, 4, var16.field1442, arg10, var13, true, var14, field1557);
                }
                arg5.method315(0, var18, arg4, var15, arg1, (byte) -74, arg8, var38, var17, arg2, 768, 0);
            }
        }
    }

    @OriginalMember(owner = "UZSUQFDN", name = "<init>", descriptor = "([[[BIII[[[I)V")
    public class63(byte[][][] arg0, int arg1, int arg2, int arg3, int[][][] arg4) {
        field1559 = 99;
        this.field1560 = arg1;
        this.field1561 = arg3;
        this.field1573 = arg4;
        if (arg2 >= 0) {
            this.field1582 = !this.field1582;
        }
        this.field1581 = arg0;
        this.field1562 = new byte[4][this.field1560][this.field1561];
        this.field1568 = new byte[4][this.field1560][this.field1561];
        this.field1574 = new byte[4][this.field1560][this.field1561];
        this.field1571 = new byte[4][this.field1560][this.field1561];
        this.field1577 = new int[4][this.field1560 + 1][this.field1561 + 1];
        this.field1583 = new byte[4][this.field1560 + 1][this.field1561 + 1];
        this.field1570 = new int[this.field1560 + 1][this.field1561 + 1];
        this.field1552 = new int[this.field1561];
        this.field1553 = new int[this.field1561];
        this.field1554 = new int[this.field1561];
        this.field1555 = new int[this.field1561];
        this.field1556 = new int[this.field1561];
    }

    @OriginalMember(owner = "UZSUQFDN", name = "a", descriptor = "(LKALHRUDX;[LOPAHDXQS;I)V")
    public final void method511(class28 arg0, class43[] arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((this.field1581[var4][var110][var111] & 0x1) == 1) {
                        int var112 = var4;
                        if ((this.field1581[1][var110][var111] & 0x2) == 2) {
                            var112 = var4 - 1;
                        }
                        if (var112 >= 0) {
                            arg1[var112].method374(2, var110, var111);
                        }
                    }
                }
            }
        }
        field1567 += (int) (Math.random() * 5.0D) - 2;
        if (field1567 < -8) {
            field1567 = -8;
        }
        if (field1567 > 8) {
            field1567 = 8;
        }
        field1563 += (int) (Math.random() * 5.0D) - 2;
        if (field1563 < -16) {
            field1563 = -16;
        }
        if (field1563 > 16) {
            field1563 = 16;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            byte[][] var48 = this.field1583[var5];
            byte var49 = 96;
            short var50 = 768;
            byte var51 = -50;
            byte var52 = -10;
            byte var53 = -50;
            int var54 = (int) Math.sqrt((double) (var53 * var53 + var51 * var51 + var52 * var52));
            int var55 = var50 * var54 >> 8;
            for (int var56 = 1; var56 < this.field1561 - 1; var56++) {
                for (int var101 = 1; var101 < this.field1560 - 1; var101++) {
                    int var102 = this.field1573[var5][var101 + 1][var56] - this.field1573[var5][var101 - 1][var56];
                    int var103 = this.field1573[var5][var101][var56 + 1] - this.field1573[var5][var101][var56 - 1];
                    int var104 = (int) Math.sqrt((double) (var103 * var103 + var102 * var102 + 65536));
                    int var105 = (var102 << 8) / var104;
                    int var106 = 65536 / var104;
                    int var107 = (var103 << 8) / var104;
                    int var108 = (var53 * var107 + var51 * var105 + var52 * var106) / var55 + var49;
                    int var109 = (var48[var101][var56] >> 1) + (var48[var101][var56 + 1] >> 3) + (var48[var101][var56 - 1] >> 2) + (var48[var101 - 1][var56] >> 2) + (var48[var101 + 1][var56] >> 3);
                    this.field1570[var101][var56] = var108 - var109;
                }
            }
            for (int var57 = 0; var57 < this.field1561; var57++) {
                this.field1552[var57] = 0;
                this.field1553[var57] = 0;
                this.field1554[var57] = 0;
                this.field1555[var57] = 0;
                this.field1556[var57] = 0;
            }
            for (int var58 = -5; var58 < this.field1560 + 5; var58++) {
                for (int var61 = 0; var61 < this.field1561; var61++) {
                    int var95 = var58 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < this.field1560) {
                        int var96 = this.field1562[var5][var95][var61] & 0xFF;
                        if (var96 > 0) {
                            class34 var97 = class34.field1045[var96 - 1];
                            this.field1552[var61] += var97.field1054;
                            this.field1553[var61] += var97.field1052;
                            this.field1554[var61] += var97.field1053;
                            this.field1555[var61] += var97.field1055;
                            var10002 = this.field1556[var61]++;
                        }
                    }
                    int var98 = var58 - 5;
                    if (var98 >= 0 && var98 < this.field1560) {
                        int var99 = this.field1562[var5][var98][var61] & 0xFF;
                        if (var99 > 0) {
                            class34 var100 = class34.field1045[var99 - 1];
                            this.field1552[var61] -= var100.field1054;
                            this.field1553[var61] -= var100.field1052;
                            this.field1554[var61] -= var100.field1053;
                            this.field1555[var61] -= var100.field1055;
                            var10002 = this.field1556[var61]--;
                        }
                    }
                }
                if (var58 >= 1 && var58 < this.field1560 - 1) {
                    int var62 = 0;
                    int var63 = 0;
                    int var64 = 0;
                    int var65 = 0;
                    int var66 = 0;
                    for (int var67 = -5; var67 < this.field1561 + 5; var67++) {
                        int var68 = var67 + 5;
                        if (var68 >= 0 && var68 < this.field1561) {
                            var62 += this.field1552[var68];
                            var63 += this.field1553[var68];
                            var64 += this.field1554[var68];
                            var65 += this.field1555[var68];
                            var66 += this.field1556[var68];
                        }
                        int var69 = var67 - 5;
                        if (var69 >= 0 && var69 < this.field1561) {
                            var62 -= this.field1552[var69];
                            var63 -= this.field1553[var69];
                            var64 -= this.field1554[var69];
                            var65 -= this.field1555[var69];
                            var66 -= this.field1556[var69];
                        }
                        if (var67 >= 1 && var67 < this.field1561 - 1 && (!field1576 || (this.field1581[0][var58][var67] & 0x2) != 0 || (this.field1581[var5][var58][var67] & 0x10) == 0 && this.method502(var5, var67, var58, 489) == field1579)) {
                            if (var5 < field1559) {
                                field1559 = var5;
                            }
                            int var70 = this.field1562[var5][var58][var67] & 0xFF;
                            int var71 = this.field1568[var5][var58][var67] & 0xFF;
                            if (var70 > 0 || var71 > 0) {
                                int var72 = this.field1573[var5][var58][var67];
                                int var73 = this.field1573[var5][var58 + 1][var67];
                                int var74 = this.field1573[var5][var58 + 1][var67 + 1];
                                int var75 = this.field1573[var5][var58][var67 + 1];
                                int var76 = this.field1570[var58][var67];
                                int var77 = this.field1570[var58 + 1][var67];
                                int var78 = this.field1570[var58 + 1][var67 + 1];
                                int var79 = this.field1570[var58][var67 + 1];
                                int var80 = -1;
                                int var81 = -1;
                                if (var70 > 0) {
                                    int var82 = var62 * 256 / var65;
                                    int var83 = var63 / var66;
                                    int var84 = var64 / var66;
                                    var80 = this.method507(var82, var83, var84);
                                    int var85 = field1567 + var82 & 0xFF;
                                    int var86 = field1563 + var84;
                                    if (var86 < 0) {
                                        var86 = 0;
                                    } else if (var86 > 255) {
                                        var86 = 255;
                                    }
                                    var81 = this.method507(var85, var83, var86);
                                }
                                if (var5 > 0) {
                                    boolean var87 = true;
                                    if (var70 == 0 && this.field1574[var5][var58][var67] != 0) {
                                        var87 = false;
                                    }
                                    if (var71 > 0 && !class34.field1045[var71 - 1].field1050) {
                                        var87 = false;
                                    }
                                    if (var87 && var72 == var73 && var72 == var74 && var72 == var75) {
                                        this.field1577[var5][var58][var67] |= 0x924;
                                    }
                                }
                                int var88 = 0;
                                if (var80 != -1) {
                                    var88 = class12.field651[method495(var81, 96)];
                                }
                                if (var71 == 0) {
                                    arg0.method311(var5, var58, var67, 0, 0, -1, var72, var73, var74, var75, method495(var80, var76), method495(var80, var77), method495(var80, var78), method495(var80, var79), 0, 0, 0, 0, var88, 0);
                                } else {
                                    int var89 = this.field1574[var5][var58][var67] + 1;
                                    byte var90 = this.field1571[var5][var58][var67];
                                    class34 var91 = class34.field1045[var71 - 1];
                                    int var92 = var91.field1048;
                                    int var93;
                                    int var94;
                                    if (var92 >= 0) {
                                        var93 = class12.method176(var92, (byte) 62);
                                        var94 = -1;
                                    } else if (var91.field1047 == 16711935) {
                                        var93 = 0;
                                        var94 = -2;
                                        var92 = -1;
                                    } else {
                                        var94 = this.method507(var91.field1051, var91.field1052, var91.field1053);
                                        var93 = class12.field651[this.method504(var91.field1056, 96)];
                                    }
                                    arg0.method311(var5, var58, var67, var89, var90, var92, var72, var73, var74, var75, method495(var80, var76), method495(var80, var77), method495(var80, var78), method495(var80, var79), this.method504(var94, var76), this.method504(var94, var77), this.method504(var94, var78), this.method504(var94, var79), var88, var93);
                                }
                            }
                        }
                    }
                }
            }
            for (int var59 = 1; var59 < this.field1561 - 1; var59++) {
                for (int var60 = 1; var60 < this.field1560 - 1; var60++) {
                    arg0.method310(var5, var60, var59, this.method502(var5, var59, var60, 489));
                }
            }
        }
        if (arg2 <= 0) {
            this.field1564 = !this.field1564;
        }
        arg0.method337(768, -50, false, -50, -10, 64);
        for (int var6 = 0; var6 < this.field1560; var6++) {
            for (int var47 = 0; var47 < this.field1561; var47++) {
                if ((this.field1581[1][var6][var47] & 0x2) == 2) {
                    arg0.method308((byte) 2, var6, var47);
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
                for (int var12 = 0; var12 <= this.field1561; var12++) {
                    for (int var13 = 0; var13 <= this.field1560; var13++) {
                        if ((this.field1577[var11][var13][var12] & var7) != 0) {
                            int var14 = var12;
                            int var15 = var12;
                            int var16 = var11;
                            int var17 = var11;
                            while (var14 > 0 && (this.field1577[var11][var13][var14 - 1] & var7) != 0) {
                                var14--;
                            }
                            while (var15 < this.field1561 && (this.field1577[var11][var13][var15 + 1] & var7) != 0) {
                                var15++;
                            }
                            label335: while (var16 > 0) {
                                for (int var18 = var14; var18 <= var15; var18++) {
                                    if ((this.field1577[var16 - 1][var13][var18] & var7) == 0) {
                                        break label335;
                                    }
                                }
                                var16--;
                            }
                            label324: while (var17 < var10) {
                                for (int var19 = var14; var19 <= var15; var19++) {
                                    if ((this.field1577[var17 + 1][var13][var19] & var7) == 0) {
                                        break label324;
                                    }
                                }
                                var17++;
                            }
                            int var20 = (var17 + 1 - var16) * (var15 + 1 - var14);
                            if (var20 >= 8) {
                                short var21 = 240;
                                int var22 = this.field1573[var17][var13][var14] - var21;
                                int var23 = this.field1573[var16][var13][var14];
                                class28.method309(var13 * 128, var22, 1, var14 * 128, var13 * 128, 213, var15 * 128 + 128, var10, var23);
                                for (int var24 = var16; var24 <= var17; var24++) {
                                    for (int var25 = var14; var25 <= var15; var25++) {
                                        this.field1577[var24][var13][var25] &= ~var7;
                                    }
                                }
                            }
                        }
                        if ((this.field1577[var11][var13][var12] & var8) != 0) {
                            int var26 = var13;
                            int var27 = var13;
                            int var28 = var11;
                            int var29 = var11;
                            while (var26 > 0 && (this.field1577[var11][var26 - 1][var12] & var8) != 0) {
                                var26--;
                            }
                            while (var27 < this.field1560 && (this.field1577[var11][var27 + 1][var12] & var8) != 0) {
                                var27++;
                            }
                            label388: while (var28 > 0) {
                                for (int var30 = var26; var30 <= var27; var30++) {
                                    if ((this.field1577[var28 - 1][var30][var12] & var8) == 0) {
                                        break label388;
                                    }
                                }
                                var28--;
                            }
                            label377: while (var29 < var10) {
                                for (int var31 = var26; var31 <= var27; var31++) {
                                    if ((this.field1577[var29 + 1][var31][var12] & var8) == 0) {
                                        break label377;
                                    }
                                }
                                var29++;
                            }
                            int var32 = (var29 + 1 - var28) * (var27 + 1 - var26);
                            if (var32 >= 8) {
                                short var33 = 240;
                                int var34 = this.field1573[var29][var26][var12] - var33;
                                int var35 = this.field1573[var28][var26][var12];
                                class28.method309(var26 * 128, var34, 2, var12 * 128, var27 * 128 + 128, 213, var12 * 128, var10, var35);
                                for (int var36 = var28; var36 <= var29; var36++) {
                                    for (int var37 = var26; var37 <= var27; var37++) {
                                        this.field1577[var36][var37][var12] &= ~var8;
                                    }
                                }
                            }
                        }
                        if ((this.field1577[var11][var13][var12] & var9) != 0) {
                            int var38 = var13;
                            int var39 = var13;
                            int var40 = var12;
                            int var41 = var12;
                            while (var40 > 0 && (this.field1577[var11][var13][var40 - 1] & var9) != 0) {
                                var40--;
                            }
                            while (var41 < this.field1561 && (this.field1577[var11][var13][var41 + 1] & var9) != 0) {
                                var41++;
                            }
                            label441: while (var38 > 0) {
                                for (int var42 = var40; var42 <= var41; var42++) {
                                    if ((this.field1577[var11][var38 - 1][var42] & var9) == 0) {
                                        break label441;
                                    }
                                }
                                var38--;
                            }
                            label430: while (var39 < this.field1560) {
                                for (int var43 = var40; var43 <= var41; var43++) {
                                    if ((this.field1577[var11][var39 + 1][var43] & var9) == 0) {
                                        break label430;
                                    }
                                }
                                var39++;
                            }
                            if ((var39 + 1 - var38) * (var41 + 1 - var40) >= 4) {
                                int var44 = this.field1573[var11][var38][var40];
                                class28.method309(var38 * 128, var44, 4, var40 * 128, var39 * 128 + 128, 213, var41 * 128 + 128, var10, var44);
                                for (int var45 = var38; var45 <= var39; var45++) {
                                    for (int var46 = var40; var46 <= var41; var46++) {
                                        this.field1577[var11][var45][var46] &= ~var9;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "UZSUQFDN", name = "c", descriptor = "(III)I")
    private static final int method512(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method508(var3, var5);
        int var8 = method508(var3 + 1, var5);
        int var9 = method508(var3, var5 + 1);
        int var10 = method508(var3 + 1, var5 + 1);
        int var11 = method497(var7, var8, var4, arg2);
        int var12 = method497(var9, var10, var4, arg2);
        return method497(var11, var12, var6, arg2);
    }
}
