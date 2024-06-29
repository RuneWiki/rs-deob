import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!SBZYTIRX")
public class class55 {

    @OriginalMember(owner = "client!SBZYTIRX", name = "v", descriptor = "Z")
    private boolean field1530 = false;

    @OriginalMember(owner = "client!SBZYTIRX", name = "z", descriptor = "I")
    private int field1534 = 5;

    @OriginalMember(owner = "client!SBZYTIRX", name = "A", descriptor = "I")
    private int field1535 = -319;

    @OriginalMember(owner = "client!SBZYTIRX", name = "E", descriptor = "Z")
    private boolean field1539 = false;

    @OriginalMember(owner = "client!SBZYTIRX", name = "F", descriptor = "I")
    private int field1540 = -431;

    @OriginalMember(owner = "client!SBZYTIRX", name = "k", descriptor = "I")
    private int field1519;

    @OriginalMember(owner = "client!SBZYTIRX", name = "l", descriptor = "I")
    private int field1520;

    @OriginalMember(owner = "client!SBZYTIRX", name = "i", descriptor = "[[[I")
    private int[][][] field1517;

    @OriginalMember(owner = "client!SBZYTIRX", name = "w", descriptor = "[[[B")
    private byte[][][] field1531;

    @OriginalMember(owner = "client!SBZYTIRX", name = "a", descriptor = "[[[B")
    private byte[][][] field1509;

    @OriginalMember(owner = "client!SBZYTIRX", name = "b", descriptor = "[[[B")
    private byte[][][] field1510;

    @OriginalMember(owner = "client!SBZYTIRX", name = "g", descriptor = "[[[B")
    private byte[][][] field1515;

    @OriginalMember(owner = "client!SBZYTIRX", name = "h", descriptor = "[[[B")
    private byte[][][] field1516;

    @OriginalMember(owner = "client!SBZYTIRX", name = "d", descriptor = "[[[I")
    private int[][][] field1512;

    @OriginalMember(owner = "client!SBZYTIRX", name = "y", descriptor = "[[[B")
    private byte[][][] field1533;

    @OriginalMember(owner = "client!SBZYTIRX", name = "c", descriptor = "[[I")
    private int[][] field1511;

    @OriginalMember(owner = "client!SBZYTIRX", name = "m", descriptor = "[I")
    private int[] field1521;

    @OriginalMember(owner = "client!SBZYTIRX", name = "n", descriptor = "[I")
    private int[] field1522;

    @OriginalMember(owner = "client!SBZYTIRX", name = "o", descriptor = "[I")
    private int[] field1523;

    @OriginalMember(owner = "client!SBZYTIRX", name = "p", descriptor = "[I")
    private int[] field1524;

    @OriginalMember(owner = "client!SBZYTIRX", name = "q", descriptor = "[I")
    private int[] field1525;

    @OriginalMember(owner = "client!SBZYTIRX", name = "e", descriptor = "[I")
    private static final int[] field1513 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!SBZYTIRX", name = "j", descriptor = "I")
    public static int field1518 = 99;

    @OriginalMember(owner = "client!SBZYTIRX", name = "r", descriptor = "[I")
    private static final int[] field1526 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!SBZYTIRX", name = "s", descriptor = "[I")
    private static final int[] field1527 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!SBZYTIRX", name = "u", descriptor = "[I")
    private static final int[] field1529 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!SBZYTIRX", name = "x", descriptor = "I")
    private static int field1532 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!SBZYTIRX", name = "B", descriptor = "Z")
    public static boolean field1536 = true;

    @OriginalMember(owner = "client!SBZYTIRX", name = "C", descriptor = "I")
    private static int field1537 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!SBZYTIRX", name = "G", descriptor = "B")
    private static byte field1541 = 3;

    @OriginalMember(owner = "client!SBZYTIRX", name = "f", descriptor = "I")
    private static int field1514;

    @OriginalMember(owner = "client!SBZYTIRX", name = "D", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!SBZYTIRX", name = "t", descriptor = "Z")
    private static boolean field1528;

    @OriginalMember(owner = "client!SBZYTIRX", name = "a", descriptor = "(II)I")
    private static final int method519(int arg0, int arg1) {
        int var2 = method522(arg0 - 1, arg1 - 1) + method522(arg0 + 1, arg1 - 1) + method522(arg0 - 1, arg1 + 1) + method522(arg0 + 1, arg1 + 1);
        int var3 = method522(arg0 - 1, arg1) + method522(arg0 + 1, arg1) + method522(arg0, arg1 - 1) + method522(arg0, arg1 + 1);
        int var4 = method522(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @OriginalMember(owner = "client!SBZYTIRX", name = "a", descriptor = "(IIII)V")
    public final void method520(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1534 != arg2) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        for (int var6 = 0; var6 < 8; var6++) {
            for (int var9 = 0; var9 < 8; var9++) {
                this.field1517[arg0][arg1 + var6][arg3 + var9] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var7 = 1; var7 < 8; var7++) {
                this.field1517[arg0][arg1][arg3 + var7] = this.field1517[arg0][arg1 - 1][arg3 + var7];
            }
        }
        if (arg3 > 0) {
            for (int var8 = 1; var8 < 8; var8++) {
                this.field1517[arg0][arg1 + var8][arg3] = this.field1517[arg0][arg1 + var8][arg3 - 1];
            }
        }
        if (arg1 > 0 && this.field1517[arg0][arg1 - 1][arg3] != 0) {
            this.field1517[arg0][arg1][arg3] = this.field1517[arg0][arg1 - 1][arg3];
        } else if (arg3 > 0 && this.field1517[arg0][arg1][arg3 - 1] != 0) {
            this.field1517[arg0][arg1][arg3] = this.field1517[arg0][arg1][arg3 - 1];
        } else if (arg1 > 0 && arg3 > 0 && this.field1517[arg0][arg1 - 1][arg3 - 1] != 0) {
            this.field1517[arg0][arg1][arg3] = this.field1517[arg0][arg1 - 1][arg3 - 1];
        }
    }

    @OriginalMember(owner = "client!SBZYTIRX", name = "a", descriptor = "(IIIILJFQWYHZJ;LLQLHEUAQ;III)V")
    private final void method521(int arg0, int arg1, int arg2, int arg3, class26 arg4, class31 arg5, int arg6, int arg7, int arg8) {
        if (field1536 && (this.field1531[0][arg2][arg1] & 0x2) == 0) {
            if ((this.field1531[arg0][arg2][arg1] & 0x10) != 0) {
                return;
            }
            if (this.method533(arg2, true, arg0, arg1) != field1538) {
                return;
            }
        }
        if (arg0 < field1518) {
            field1518 = arg0;
        }
        int var10 = this.field1517[arg0][arg2][arg1];
        int var11 = this.field1517[arg0][arg2 + 1][arg1];
        int var12 = this.field1517[arg0][arg2 + 1][arg1 + 1];
        int var13 = this.field1517[arg0][arg2][arg1 + 1];
        int var14 = var10 + var11 + var12 + var13 >> 2;
        if (arg6 < 7 || arg6 > 7) {
            this.field1530 = !this.field1530;
        }
        class8 var15 = class8.method203(arg3);
        int var16 = (arg3 << 14) + (arg1 << 7) + arg2 + 1073741824;
        if (!var15.field663) {
            var16 += Integer.MIN_VALUE;
        }
        byte var17 = (byte) ((arg8 << 6) + arg7);
        if (arg7 == 22) {
            if (!field1536 || var15.field663 || var15.field625) {
                class67 var18;
                if (var15.field639 == -1 && var15.field638 == null) {
                    var18 = var15.method205(22, arg8, var10, var11, var12, var13, -1);
                } else {
                    var18 = new class49(var11, var15.field639, arg3, var12, arg8, 22, true, 902, var10, var13);
                }
                arg4.method258(arg0, var18, arg1, arg2, 4, var14, var16, var17);
                if (var15.field646 && var15.field663 && arg5 != null) {
                    arg5.method326(arg2, arg1, 0);
                }
            }
        } else if (arg7 == 10 || arg7 == 11) {
            class67 var38;
            if (var15.field639 == -1 && var15.field638 == null) {
                var38 = var15.method205(10, arg8, var10, var11, var12, var13, -1);
            } else {
                var38 = new class49(var11, var15.field639, arg3, var12, arg8, 10, true, 902, var10, var13);
            }
            if (var38 != null) {
                int var39 = 0;
                if (arg7 == 11) {
                    var39 += 256;
                }
                int var40;
                int var41;
                if (arg8 == 1 || arg8 == 3) {
                    var40 = var15.field671;
                    var41 = var15.field629;
                } else {
                    var40 = var15.field629;
                    var41 = var15.field671;
                }
                if (arg4.method262(arg2, var38, arg1, field1514, var39, var41, var16, var17, var14, var40, arg0) && var15.field667) {
                    class42 var42;
                    if (var38 instanceof class42) {
                        var42 = (class42) var38;
                    } else {
                        var42 = var15.method205(10, arg8, var10, var11, var12, var13, -1);
                    }
                    if (var42 != null) {
                        for (int var43 = 0; var43 <= var40; var43++) {
                            for (int var44 = 0; var44 <= var41; var44++) {
                                int var45 = var42.field1320 / 4;
                                if (var45 > 30) {
                                    var45 = 30;
                                }
                                if (var45 > this.field1533[arg0][arg2 + var43][arg1 + var44]) {
                                    this.field1533[arg0][arg2 + var43][arg1 + var44] = (byte) var45;
                                }
                            }
                        }
                    }
                }
            }
            if (var15.field646 && arg5 != null) {
                arg5.method325(-47563, arg1, var15.field627, var15.field629, arg8, arg2, var15.field671);
            }
        } else if (arg7 >= 12) {
            class67 var19;
            if (var15.field639 == -1 && var15.field638 == null) {
                var19 = var15.method205(arg7, arg8, var10, var11, var12, var13, -1);
            } else {
                var19 = new class49(var11, var15.field639, arg3, var12, arg8, arg7, true, 902, var10, var13);
            }
            arg4.method262(arg2, var19, arg1, field1514, 0, 1, var16, var17, var14, 1, arg0);
            if (arg7 >= 12 && arg7 <= 17 && arg7 != 13 && arg0 > 0) {
                this.field1512[arg0][arg2][arg1] |= 0x924;
            }
            if (var15.field646 && arg5 != null) {
                arg5.method325(-47563, arg1, var15.field627, var15.field629, arg8, arg2, var15.field671);
            }
        } else if (arg7 == 0) {
            class67 var20;
            if (var15.field639 == -1 && var15.field638 == null) {
                var20 = var15.method205(0, arg8, var10, var11, var12, var13, -1);
            } else {
                var20 = new class49(var11, var15.field639, arg3, var12, arg8, 0, true, 902, var10, var13);
            }
            arg4.method260(field1529[arg8], 0, arg1, var16, -205, null, var20, var17, arg2, arg0, var14);
            if (arg8 == 0) {
                if (var15.field667) {
                    this.field1533[arg0][arg2][arg1] = 50;
                    this.field1533[arg0][arg2][arg1 + 1] = 50;
                }
                if (var15.field658) {
                    this.field1512[arg0][arg2][arg1] |= 0x249;
                }
            } else if (arg8 == 1) {
                if (var15.field667) {
                    this.field1533[arg0][arg2][arg1 + 1] = 50;
                    this.field1533[arg0][arg2 + 1][arg1 + 1] = 50;
                }
                if (var15.field658) {
                    this.field1512[arg0][arg2][arg1 + 1] |= 0x492;
                }
            } else if (arg8 == 2) {
                if (var15.field667) {
                    this.field1533[arg0][arg2 + 1][arg1] = 50;
                    this.field1533[arg0][arg2 + 1][arg1 + 1] = 50;
                }
                if (var15.field658) {
                    this.field1512[arg0][arg2 + 1][arg1] |= 0x249;
                }
            } else if (arg8 == 3) {
                if (var15.field667) {
                    this.field1533[arg0][arg2][arg1] = 50;
                    this.field1533[arg0][arg2 + 1][arg1] = 50;
                }
                if (var15.field658) {
                    this.field1512[arg0][arg2][arg1] |= 0x492;
                }
            }
            if (var15.field646 && arg5 != null) {
                arg5.method324(var15.field627, arg2, arg8, arg7, arg1, true);
            }
            if (var15.field632 != 16) {
                arg4.method268(var15.field632, arg2, 9, arg0, arg1);
            }
        } else if (arg7 == 1) {
            class67 var21;
            if (var15.field639 == -1 && var15.field638 == null) {
                var21 = var15.method205(1, arg8, var10, var11, var12, var13, -1);
            } else {
                var21 = new class49(var11, var15.field639, arg3, var12, arg8, 1, true, 902, var10, var13);
            }
            arg4.method260(field1513[arg8], 0, arg1, var16, -205, null, var21, var17, arg2, arg0, var14);
            if (var15.field667) {
                if (arg8 == 0) {
                    this.field1533[arg0][arg2][arg1 + 1] = 50;
                } else if (arg8 == 1) {
                    this.field1533[arg0][arg2 + 1][arg1 + 1] = 50;
                } else if (arg8 == 2) {
                    this.field1533[arg0][arg2 + 1][arg1] = 50;
                } else if (arg8 == 3) {
                    this.field1533[arg0][arg2][arg1] = 50;
                }
            }
            if (var15.field646 && arg5 != null) {
                arg5.method324(var15.field627, arg2, arg8, arg7, arg1, true);
            }
        } else if (arg7 == 2) {
            int var22 = arg8 + 1 & 0x3;
            class67 var23;
            class67 var24;
            if (var15.field639 == -1 && var15.field638 == null) {
                var23 = var15.method205(2, arg8 + 4, var10, var11, var12, var13, -1);
                var24 = var15.method205(2, var22, var10, var11, var12, var13, -1);
            } else {
                var23 = new class49(var11, var15.field639, arg3, var12, arg8 + 4, 2, true, 902, var10, var13);
                var24 = new class49(var11, var15.field639, arg3, var12, var22, 2, true, 902, var10, var13);
            }
            arg4.method260(field1529[arg8], field1529[var22], arg1, var16, -205, var24, var23, var17, arg2, arg0, var14);
            if (var15.field658) {
                if (arg8 == 0) {
                    this.field1512[arg0][arg2][arg1] |= 0x249;
                    this.field1512[arg0][arg2][arg1 + 1] |= 0x492;
                } else if (arg8 == 1) {
                    this.field1512[arg0][arg2][arg1 + 1] |= 0x492;
                    this.field1512[arg0][arg2 + 1][arg1] |= 0x249;
                } else if (arg8 == 2) {
                    this.field1512[arg0][arg2 + 1][arg1] |= 0x249;
                    this.field1512[arg0][arg2][arg1] |= 0x492;
                } else if (arg8 == 3) {
                    this.field1512[arg0][arg2][arg1] |= 0x492;
                    this.field1512[arg0][arg2][arg1] |= 0x249;
                }
            }
            if (var15.field646 && arg5 != null) {
                arg5.method324(var15.field627, arg2, arg8, arg7, arg1, true);
            }
            if (var15.field632 != 16) {
                arg4.method268(var15.field632, arg2, 9, arg0, arg1);
            }
        } else if (arg7 == 3) {
            class67 var25;
            if (var15.field639 == -1 && var15.field638 == null) {
                var25 = var15.method205(3, arg8, var10, var11, var12, var13, -1);
            } else {
                var25 = new class49(var11, var15.field639, arg3, var12, arg8, 3, true, 902, var10, var13);
            }
            arg4.method260(field1513[arg8], 0, arg1, var16, -205, null, var25, var17, arg2, arg0, var14);
            if (var15.field667) {
                if (arg8 == 0) {
                    this.field1533[arg0][arg2][arg1 + 1] = 50;
                } else if (arg8 == 1) {
                    this.field1533[arg0][arg2 + 1][arg1 + 1] = 50;
                } else if (arg8 == 2) {
                    this.field1533[arg0][arg2 + 1][arg1] = 50;
                } else if (arg8 == 3) {
                    this.field1533[arg0][arg2][arg1] = 50;
                }
            }
            if (var15.field646 && arg5 != null) {
                arg5.method324(var15.field627, arg2, arg8, arg7, arg1, true);
            }
        } else if (arg7 == 9) {
            class67 var26;
            if (var15.field639 == -1 && var15.field638 == null) {
                var26 = var15.method205(arg7, arg8, var10, var11, var12, var13, -1);
            } else {
                var26 = new class49(var11, var15.field639, arg3, var12, arg8, arg7, true, 902, var10, var13);
            }
            arg4.method262(arg2, var26, arg1, field1514, 0, 1, var16, var17, var14, 1, arg0);
            if (var15.field646 && arg5 != null) {
                arg5.method325(-47563, arg1, var15.field627, var15.field629, arg8, arg2, var15.field671);
            }
        } else {
            if (var15.field634) {
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
            if (arg7 == 4) {
                class67 var31;
                if (var15.field639 == -1 && var15.field638 == null) {
                    var31 = var15.method205(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var31 = new class49(var11, var15.field639, arg3, var12, 0, 4, true, 902, var10, var13);
                }
                arg4.method261(arg0, arg1, 0, arg2, var31, field1529[arg8], field1541, 0, arg8 * 512, var16, var17, var14);
            } else if (arg7 == 5) {
                int var32 = 16;
                int var33 = arg4.method278(arg0, arg2, arg1);
                if (var33 > 0) {
                    var32 = class8.method203(var33 >> 14 & 0x7FFF).field632;
                }
                class67 var34;
                if (var15.field639 == -1 && var15.field638 == null) {
                    var34 = var15.method205(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var34 = new class49(var11, var15.field639, arg3, var12, 0, 4, true, 902, var10, var13);
                }
                arg4.method261(arg0, arg1, field1526[arg8] * var32, arg2, var34, field1529[arg8], field1541, field1527[arg8] * var32, arg8 * 512, var16, var17, var14);
            } else if (arg7 == 6) {
                class67 var35;
                if (var15.field639 == -1 && var15.field638 == null) {
                    var35 = var15.method205(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var35 = new class49(var11, var15.field639, arg3, var12, 0, 4, true, 902, var10, var13);
                }
                arg4.method261(arg0, arg1, 0, arg2, var35, 256, field1541, 0, arg8, var16, var17, var14);
            } else if (arg7 == 7) {
                class67 var36;
                if (var15.field639 == -1 && var15.field638 == null) {
                    var36 = var15.method205(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var36 = new class49(var11, var15.field639, arg3, var12, 0, 4, true, 902, var10, var13);
                }
                arg4.method261(arg0, arg1, 0, arg2, var36, 512, field1541, 0, arg8, var16, var17, var14);
            } else if (arg7 == 8) {
                class67 var37;
                if (var15.field639 == -1 && var15.field638 == null) {
                    var37 = var15.method205(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var37 = new class49(var11, var15.field639, arg3, var12, 0, 4, true, 902, var10, var13);
                }
                arg4.method261(arg0, arg1, 0, arg2, var37, 768, field1541, 0, arg8, var16, var17, var14);
            }
        }
    }

    @OriginalMember(owner = "client!SBZYTIRX", name = "b", descriptor = "(II)I")
    private static final int method522(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!SBZYTIRX", name = "a", descriptor = "(IIII[[[IIILLQLHEUAQ;ILJFQWYHZJ;I)V")
    public static final void method523(int arg0, int arg1, int arg2, int arg3, int[][][] arg4, int arg5, int arg6, class31 arg7, int arg8, class26 arg9, int arg10) {
        int var11 = arg4[arg8][arg5][arg6];
        int var12 = arg4[arg8][arg5 + 1][arg6];
        int var13 = arg4[arg8][arg5 + 1][arg6 + 1];
        int var14 = arg4[arg8][arg5][arg6 + 1];
        int var15 = var11 + var12 + var13 + var14 >> 2;
        class8 var16 = class8.method203(arg10);
        int var17 = (arg10 << 14) + (arg6 << 7) + arg5 + 1073741824;
        if (!var16.field663) {
            var17 += Integer.MIN_VALUE;
        }
        byte var18 = (byte) ((arg3 << 6) + arg1);
        if (arg0 != 33254) {
            field1528 = true;
        }
        if (arg1 == 22) {
            class67 var19;
            if (var16.field639 == -1 && var16.field638 == null) {
                var19 = var16.method205(22, arg3, var11, var12, var13, var14, -1);
            } else {
                var19 = new class49(var12, var16.field639, arg10, var13, arg3, 22, true, 902, var11, var14);
            }
            arg9.method258(arg2, var19, arg6, arg5, 4, var15, var17, var18);
            if (var16.field646 && var16.field663) {
                arg7.method326(arg5, arg6, 0);
            }
        } else if (arg1 == 10 || arg1 == 11) {
            class67 var39;
            if (var16.field639 == -1 && var16.field638 == null) {
                var39 = var16.method205(10, arg3, var11, var12, var13, var14, -1);
            } else {
                var39 = new class49(var12, var16.field639, arg10, var13, arg3, 10, true, 902, var11, var14);
            }
            if (var39 != null) {
                int var40 = 0;
                if (arg1 == 11) {
                    var40 += 256;
                }
                int var41;
                int var42;
                if (arg3 == 1 || arg3 == 3) {
                    var41 = var16.field671;
                    var42 = var16.field629;
                } else {
                    var41 = var16.field629;
                    var42 = var16.field671;
                }
                arg9.method262(arg5, var39, arg6, field1514, var40, var42, var17, var18, var15, var41, arg2);
            }
            if (var16.field646) {
                arg7.method325(-47563, arg6, var16.field627, var16.field629, arg3, arg5, var16.field671);
            }
        } else if (arg1 >= 12) {
            class67 var20;
            if (var16.field639 == -1 && var16.field638 == null) {
                var20 = var16.method205(arg1, arg3, var11, var12, var13, var14, -1);
            } else {
                var20 = new class49(var12, var16.field639, arg10, var13, arg3, arg1, true, 902, var11, var14);
            }
            arg9.method262(arg5, var20, arg6, field1514, 0, 1, var17, var18, var15, 1, arg2);
            if (var16.field646) {
                arg7.method325(-47563, arg6, var16.field627, var16.field629, arg3, arg5, var16.field671);
            }
        } else if (arg1 == 0) {
            class67 var21;
            if (var16.field639 == -1 && var16.field638 == null) {
                var21 = var16.method205(0, arg3, var11, var12, var13, var14, -1);
            } else {
                var21 = new class49(var12, var16.field639, arg10, var13, arg3, 0, true, 902, var11, var14);
            }
            arg9.method260(field1529[arg3], 0, arg6, var17, -205, null, var21, var18, arg5, arg2, var15);
            if (var16.field646) {
                arg7.method324(var16.field627, arg5, arg3, arg1, arg6, true);
            }
        } else if (arg1 == 1) {
            class67 var22;
            if (var16.field639 == -1 && var16.field638 == null) {
                var22 = var16.method205(1, arg3, var11, var12, var13, var14, -1);
            } else {
                var22 = new class49(var12, var16.field639, arg10, var13, arg3, 1, true, 902, var11, var14);
            }
            arg9.method260(field1513[arg3], 0, arg6, var17, -205, null, var22, var18, arg5, arg2, var15);
            if (var16.field646) {
                arg7.method324(var16.field627, arg5, arg3, arg1, arg6, true);
            }
        } else if (arg1 == 2) {
            int var23 = arg3 + 1 & 0x3;
            class67 var24;
            class67 var25;
            if (var16.field639 == -1 && var16.field638 == null) {
                var24 = var16.method205(2, arg3 + 4, var11, var12, var13, var14, -1);
                var25 = var16.method205(2, var23, var11, var12, var13, var14, -1);
            } else {
                var24 = new class49(var12, var16.field639, arg10, var13, arg3 + 4, 2, true, 902, var11, var14);
                var25 = new class49(var12, var16.field639, arg10, var13, var23, 2, true, 902, var11, var14);
            }
            arg9.method260(field1529[arg3], field1529[var23], arg6, var17, -205, var25, var24, var18, arg5, arg2, var15);
            if (var16.field646) {
                arg7.method324(var16.field627, arg5, arg3, arg1, arg6, true);
            }
        } else if (arg1 == 3) {
            class67 var26;
            if (var16.field639 == -1 && var16.field638 == null) {
                var26 = var16.method205(3, arg3, var11, var12, var13, var14, -1);
            } else {
                var26 = new class49(var12, var16.field639, arg10, var13, arg3, 3, true, 902, var11, var14);
            }
            arg9.method260(field1513[arg3], 0, arg6, var17, -205, null, var26, var18, arg5, arg2, var15);
            if (var16.field646) {
                arg7.method324(var16.field627, arg5, arg3, arg1, arg6, true);
            }
        } else if (arg1 == 9) {
            class67 var27;
            if (var16.field639 == -1 && var16.field638 == null) {
                var27 = var16.method205(arg1, arg3, var11, var12, var13, var14, -1);
            } else {
                var27 = new class49(var12, var16.field639, arg10, var13, arg3, arg1, true, 902, var11, var14);
            }
            arg9.method262(arg5, var27, arg6, field1514, 0, 1, var17, var18, var15, 1, arg2);
            if (var16.field646) {
                arg7.method325(-47563, arg6, var16.field627, var16.field629, arg3, arg5, var16.field671);
            }
        } else {
            if (var16.field634) {
                if (arg3 == 1) {
                    int var28 = var14;
                    var14 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var28;
                } else if (arg3 == 2) {
                    int var29 = var14;
                    var14 = var12;
                    var12 = var29;
                    int var30 = var13;
                    var13 = var11;
                    var11 = var30;
                } else if (arg3 == 3) {
                    int var31 = var14;
                    var14 = var11;
                    var11 = var12;
                    var12 = var13;
                    var13 = var31;
                }
            }
            if (arg1 == 4) {
                class67 var32;
                if (var16.field639 == -1 && var16.field638 == null) {
                    var32 = var16.method205(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var32 = new class49(var12, var16.field639, arg10, var13, 0, 4, true, 902, var11, var14);
                }
                arg9.method261(arg2, arg6, 0, arg5, var32, field1529[arg3], field1541, 0, arg3 * 512, var17, var18, var15);
            } else if (arg1 == 5) {
                int var33 = 16;
                int var34 = arg9.method278(arg2, arg5, arg6);
                if (var34 > 0) {
                    var33 = class8.method203(var34 >> 14 & 0x7FFF).field632;
                }
                class67 var35;
                if (var16.field639 == -1 && var16.field638 == null) {
                    var35 = var16.method205(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var35 = new class49(var12, var16.field639, arg10, var13, 0, 4, true, 902, var11, var14);
                }
                arg9.method261(arg2, arg6, field1526[arg3] * var33, arg5, var35, field1529[arg3], field1541, field1527[arg3] * var33, arg3 * 512, var17, var18, var15);
            } else if (arg1 == 6) {
                class67 var36;
                if (var16.field639 == -1 && var16.field638 == null) {
                    var36 = var16.method205(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var36 = new class49(var12, var16.field639, arg10, var13, 0, 4, true, 902, var11, var14);
                }
                arg9.method261(arg2, arg6, 0, arg5, var36, 256, field1541, 0, arg3, var17, var18, var15);
            } else if (arg1 == 7) {
                class67 var37;
                if (var16.field639 == -1 && var16.field638 == null) {
                    var37 = var16.method205(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var37 = new class49(var12, var16.field639, arg10, var13, 0, 4, true, 902, var11, var14);
                }
                arg9.method261(arg2, arg6, 0, arg5, var37, 512, field1541, 0, arg3, var17, var18, var15);
            } else if (arg1 == 8) {
                class67 var38;
                if (var16.field639 == -1 && var16.field638 == null) {
                    var38 = var16.method205(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var38 = new class49(var12, var16.field639, arg10, var13, 0, 4, true, 902, var11, var14);
                }
                arg9.method261(arg2, arg6, 0, arg5, var38, 768, field1541, 0, arg3, var17, var18, var15);
            }
        }
    }

    @OriginalMember(owner = "client!SBZYTIRX", name = "a", descriptor = "(III)I")
    private final int method524(int arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "client!SBZYTIRX", name = "<init>", descriptor = "([[[III[[[BI)V")
    public class55(int[][][] arg0, int arg1, int arg2, byte[][][] arg3, int arg4) {
        field1518 = 99;
        if (arg2 != 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        this.field1519 = arg4;
        this.field1520 = arg1;
        this.field1517 = arg0;
        this.field1531 = arg3;
        this.field1509 = new byte[4][this.field1519][this.field1520];
        this.field1510 = new byte[4][this.field1519][this.field1520];
        this.field1515 = new byte[4][this.field1519][this.field1520];
        this.field1516 = new byte[4][this.field1519][this.field1520];
        this.field1512 = new int[4][this.field1519 + 1][this.field1520 + 1];
        this.field1533 = new byte[4][this.field1519 + 1][this.field1520 + 1];
        this.field1511 = new int[this.field1519 + 1][this.field1520 + 1];
        this.field1521 = new int[this.field1520];
        this.field1522 = new int[this.field1520];
        this.field1523 = new int[this.field1520];
        this.field1524 = new int[this.field1520];
        this.field1525 = new int[this.field1520];
    }

    @OriginalMember(owner = "client!SBZYTIRX", name = "a", descriptor = "(IIIIILMVHXDWGI;IB)V")
    private final void method525(int arg0, int arg1, int arg2, int arg3, int arg4, class38 arg5, int arg6, byte arg7) {
        if (arg7 == 1) {
            boolean var9 = false;
        } else {
            for (int var10 = 1; var10 > 0; var10++) {
            }
        }
        if (arg4 < 0 || arg4 >= 104 || arg6 < 0 || arg6 >= 104) {
            while (true) {
                int var13 = arg5.method357();
                if (var13 == 0) {
                    return;
                }
                if (var13 == 1) {
                    arg5.method357();
                    return;
                }
                if (var13 <= 49) {
                    arg5.method357();
                }
            }
        }
        this.field1531[arg2][arg4][arg6] = 0;
        while (true) {
            int var11 = arg5.method357();
            if (var11 == 0) {
                if (arg2 == 0) {
                    this.field1517[0][arg4][arg6] = -method532(arg4 + arg0 + 932731, arg6 + 556238 + arg1) * 8;
                    return;
                } else {
                    this.field1517[arg2][arg4][arg6] = this.field1517[arg2 - 1][arg4][arg6] - 240;
                    return;
                }
            }
            if (var11 == 1) {
                int var12 = arg5.method357();
                if (var12 == 1) {
                    var12 = 0;
                }
                if (arg2 == 0) {
                    this.field1517[0][arg4][arg6] = -var12 * 8;
                    return;
                }
                this.field1517[arg2][arg4][arg6] = this.field1517[arg2 - 1][arg4][arg6] - var12 * 8;
                return;
            }
            if (var11 <= 49) {
                this.field1510[arg2][arg4][arg6] = arg5.method358();
                this.field1515[arg2][arg4][arg6] = (byte) ((var11 - 2) / 4);
                this.field1516[arg2][arg4][arg6] = (byte) (var11 + arg3 - 2 & 0x3);
            } else if (var11 <= 81) {
                this.field1531[arg2][arg4][arg6] = (byte) (var11 - 49);
            } else {
                this.field1509[arg2][arg4][arg6] = (byte) (var11 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!SBZYTIRX", name = "b", descriptor = "(IIII)I")
    private static final int method526(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class59.field1612[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @OriginalMember(owner = "client!SBZYTIRX", name = "c", descriptor = "(II)I")
    private static final int method527(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!SBZYTIRX", name = "a", descriptor = "([LLQLHEUAQ;LJFQWYHZJ;II[BIIIIII)V")
    public final void method528(class31[] arg0, class26 arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        class38 var12 = new class38(0, arg4);
        int var13 = -1;
        while (arg5 >= 0) {
            field1528 = true;
        }
        while (true) {
            int var14 = var12.method371();
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method371();
                if (var16 == 0) {
                    break;
                }
                var15 += var16 - 1;
                int var17 = var15 & 0x3F;
                int var18 = var15 >> 6 & 0x3F;
                int var19 = var15 >> 12;
                int var20 = var12.method357();
                int var21 = var20 >> 2;
                int var22 = var20 & 0x3;
                if (arg2 == var19 && var18 >= arg6 && var18 < arg6 + 8 && var17 >= arg10 && var17 < arg10 + 8) {
                    class8 var23 = class8.method203(var13);
                    int var24 = arg3 + class20.method226(var17 & 0x7, var22, -859, var23.field629, var18 & 0x7, arg9, var23.field671);
                    int var25 = arg8 + class20.method227(var23.field629, var23.field671, var17 & 0x7, var18 & 0x7, arg9, 0, var22);
                    if (var24 > 0 && var25 > 0 && var24 < 103 && var25 < 103) {
                        int var26 = arg7;
                        if ((this.field1531[1][var24][var25] & 0x2) == 2) {
                            var26 = arg7 - 1;
                        }
                        class31 var27 = null;
                        if (var26 >= 0) {
                            var27 = arg0[var26];
                        }
                        this.method521(arg7, var25, var24, var13, arg1, var27, 7, var21, arg9 + var22 & 0x3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!SBZYTIRX", name = "a", descriptor = "([B[LLQLHEUAQ;LJFQWYHZJ;III)V")
    public final void method529(byte[] arg0, class31[] arg1, class26 arg2, int arg3, int arg4, int arg5) {
        class38 var7 = new class38(0, arg0);
        int var8 = -1;
        if (arg4 >= 0) {
            return;
        }
        while (true) {
            int var9 = var7.method371();
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method371();
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = var10 & 0x3F;
                int var13 = var10 >> 6 & 0x3F;
                int var14 = var10 >> 12;
                int var15 = var7.method357();
                int var16 = var15 >> 2;
                int var17 = var15 & 0x3;
                int var18 = arg3 + var13;
                int var19 = arg5 + var12;
                if (var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) {
                    int var20 = var14;
                    if ((this.field1531[1][var18][var19] & 0x2) == 2) {
                        var20 = var14 - 1;
                    }
                    class31 var21 = null;
                    if (var20 >= 0) {
                        var21 = arg1[var20];
                    }
                    this.method521(var14, var19, var18, var8, arg2, var21, 7, var16, var17);
                }
            }
        }
    }

    @OriginalMember(owner = "client!SBZYTIRX", name = "b", descriptor = "(III)I")
    private static final int method530(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method519(var3, var5);
        int var8 = method519(var3 + 1, var5);
        int var9 = method519(var3, var5 + 1);
        int var10 = method519(var3 + 1, var5 + 1);
        int var11 = method526(var7, var8, var4, arg2);
        int var12 = method526(var9, var10, var4, arg2);
        return method526(var11, var12, var6, arg2);
    }

    @OriginalMember(owner = "client!SBZYTIRX", name = "a", descriptor = "(I[BIIZI[LLQLHEUAQ;)V")
    public final void method531(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4, int arg5, class31[] arg6) {
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg2 + var13 > 0 && arg2 + var13 < 103 && arg3 + var14 > 0 && arg3 + var14 < 103) {
                        arg6[var8].field1024[arg2 + var13][arg3 + var14] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        if (arg4) {
            return;
        }
        class38 var9 = new class38(0, arg1);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    this.method525(arg0, arg5, var10, 0, arg2 + var11, var9, arg3 + var12, (byte) 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!SBZYTIRX", name = "d", descriptor = "(II)I")
    private static final int method532(int arg0, int arg1) {
        int var2 = method530(arg0 + 45365, arg1 + 91923, 4) + (method530(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method530(arg0, arg1, 1) - 128 >> 2) - 128;
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @OriginalMember(owner = "client!SBZYTIRX", name = "a", descriptor = "(IZII)I")
    public int method533(int arg0, boolean arg1, int arg2, int arg3) {
        if (!arg1) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if ((this.field1531[arg2][arg0][arg3] & 0x8) == 0) {
            return arg2 <= 0 || (this.field1531[1][arg0][arg3] & 0x2) == 0 ? arg2 : arg2 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!SBZYTIRX", name = "a", descriptor = "(IBI)Z")
    public static final boolean method534(int arg0, byte arg1, int arg2) {
        class8 var3 = class8.method203(arg2);
        if (arg1 == 9) {
            boolean var4 = false;
        }
        if (arg0 == 11) {
            arg0 = 10;
        }
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        return var3.method198(20401, arg0);
    }

    @OriginalMember(owner = "client!SBZYTIRX", name = "a", descriptor = "([LLQLHEUAQ;II[BIIIZII)V")
    public final void method535(class31[] arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        for (int var11 = 0; var11 < 8; var11++) {
            for (int var16 = 0; var16 < 8; var16++) {
                if (arg4 + var11 > 0 && arg4 + var11 < 103 && arg8 + var16 > 0 && arg8 + var16 < 103) {
                    arg0[arg9].field1024[arg4 + var11][arg8 + var16] &= 0xFEFFFFFF;
                }
            }
        }
        class38 var12 = new class38(0, arg3);
        for (int var13 = 0; var13 < 4; var13++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    if (arg2 == var13 && var14 >= arg1 && var14 < arg1 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                        this.method525(0, 0, arg9, arg5, arg4 + class20.method224(var14 & 0x7, arg5, 3, var15 & 0x7), var12, arg8 + class20.method225(var14 & 0x7, var15 & 0x7, false, arg5), (byte) 1);
                    } else {
                        this.method525(0, 0, 0, 0, -1, var12, -1, (byte) 1);
                    }
                }
            }
        }
        if (!arg7) {
            this.field1539 = !this.field1539;
        }
    }

    @OriginalMember(owner = "client!SBZYTIRX", name = "a", descriptor = "(IBIII)V")
    public final void method536(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 != -14) {
            return;
        }
        for (int var6 = arg2; var6 <= arg2 + arg4; var6++) {
            for (int var7 = arg3; var7 <= arg0 + arg3; var7++) {
                if (var7 >= 0 && var7 < this.field1519 && var6 >= 0 && var6 < this.field1520) {
                    this.field1533[0][var7][var6] = 127;
                    if (arg3 == var7 && var7 > 0) {
                        this.field1517[0][var7][var6] = this.field1517[0][var7 - 1][var6];
                    }
                    if (arg0 + arg3 == var7 && var7 < this.field1519 - 1) {
                        this.field1517[0][var7][var6] = this.field1517[0][var7 + 1][var6];
                    }
                    if (arg2 == var6 && var6 > 0) {
                        this.field1517[0][var7][var6] = this.field1517[0][var7][var6 - 1];
                    }
                    if (arg2 + arg4 == var6 && var6 < this.field1520 - 1) {
                        this.field1517[0][var7][var6] = this.field1517[0][var7][var6 + 1];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!SBZYTIRX", name = "a", descriptor = "(I[BII)Z")
    public static final boolean method537(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg0 != 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        boolean var5 = true;
        class38 var6 = new class38(0, arg1);
        int var7 = -1;
        label55: while (true) {
            int var8 = var6.method371();
            if (var8 == 0) {
                return var5;
            }
            var7 += var8;
            int var9 = 0;
            boolean var10 = false;
            while (true) {
                while (!var10) {
                    int var12 = var6.method371();
                    if (var12 == 0) {
                        continue label55;
                    }
                    var9 += var12 - 1;
                    int var13 = var9 & 0x3F;
                    int var14 = var9 >> 6 & 0x3F;
                    int var15 = var6.method357() >> 2;
                    int var16 = arg3 + var14;
                    int var17 = arg2 + var13;
                    if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                        class8 var18 = class8.method203(var7);
                        if (var15 != 22 || !field1536 || var18.field663 || var18.field625) {
                            var5 &= var18.method199(false);
                            var10 = true;
                        }
                    }
                }
                int var11 = var6.method371();
                if (var11 == 0) {
                    break;
                }
                var6.method357();
            }
        }
    }

    @OriginalMember(owner = "client!SBZYTIRX", name = "e", descriptor = "(II)I")
    private final int method538(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!SBZYTIRX", name = "a", descriptor = "(LRKMPVAZH;ILMVHXDWGI;)V")
    public static final void method539(class53 arg0, int arg1, class38 arg2) {
        int var3 = -1;
        if (arg1 != 8) {
            return;
        }
        while (true) {
            int var4 = arg2.method371();
            if (var4 == 0) {
                return;
            }
            var3 += var4;
            class8 var5 = class8.method203(var3);
            var5.method202((byte) 0, arg0);
            while (true) {
                int var6 = arg2.method371();
                if (var6 == 0) {
                    break;
                }
                arg2.method357();
            }
        }
    }

    @OriginalMember(owner = "client!SBZYTIRX", name = "a", descriptor = "(ILJFQWYHZJ;[LLQLHEUAQ;)V")
    public final void method540(int arg0, class26 arg1, class31[] arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((this.field1531[var4][var110][var111] & 0x1) == 1) {
                        int var112 = var4;
                        if ((this.field1531[1][var110][var111] & 0x2) == 2) {
                            var112 = var4 - 1;
                        }
                        if (var112 >= 0) {
                            arg2[var112].method326(var110, var111, 0);
                        }
                    }
                }
            }
        }
        field1537 += (int) (Math.random() * 5.0D) - 2;
        if (field1537 < -8) {
            field1537 = -8;
        }
        if (field1537 > 8) {
            field1537 = 8;
        }
        field1532 += (int) (Math.random() * 5.0D) - 2;
        if (arg0 != -17648) {
            field1514 = -244;
        }
        if (field1532 < -16) {
            field1532 = -16;
        }
        if (field1532 > 16) {
            field1532 = 16;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            byte[][] var48 = this.field1533[var5];
            byte var49 = 96;
            short var50 = 768;
            byte var51 = -50;
            byte var52 = -10;
            byte var53 = -50;
            int var54 = (int) Math.sqrt((double) (var53 * var53 + var51 * var51 + var52 * var52));
            int var55 = var50 * var54 >> 8;
            for (int var56 = 1; var56 < this.field1520 - 1; var56++) {
                for (int var101 = 1; var101 < this.field1519 - 1; var101++) {
                    int var102 = this.field1517[var5][var101 + 1][var56] - this.field1517[var5][var101 - 1][var56];
                    int var103 = this.field1517[var5][var101][var56 + 1] - this.field1517[var5][var101][var56 - 1];
                    int var104 = (int) Math.sqrt((double) (var103 * var103 + var102 * var102 + 65536));
                    int var105 = (var102 << 8) / var104;
                    int var106 = 65536 / var104;
                    int var107 = (var103 << 8) / var104;
                    int var108 = (var53 * var107 + var51 * var105 + var52 * var106) / var55 + var49;
                    int var109 = (var48[var101][var56] >> 1) + (var48[var101][var56 + 1] >> 3) + (var48[var101][var56 - 1] >> 2) + (var48[var101 - 1][var56] >> 2) + (var48[var101 + 1][var56] >> 3);
                    this.field1511[var101][var56] = var108 - var109;
                }
            }
            for (int var57 = 0; var57 < this.field1520; var57++) {
                this.field1521[var57] = 0;
                this.field1522[var57] = 0;
                this.field1523[var57] = 0;
                this.field1524[var57] = 0;
                this.field1525[var57] = 0;
            }
            for (int var58 = -5; var58 < this.field1519 + 5; var58++) {
                for (int var61 = 0; var61 < this.field1520; var61++) {
                    int var95 = var58 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < this.field1519) {
                        int var96 = this.field1509[var5][var95][var61] & 0xFF;
                        if (var96 > 0) {
                            class45 var97 = class45.field1386[var96 - 1];
                            this.field1521[var61] += var97.field1395;
                            this.field1522[var61] += var97.field1393;
                            this.field1523[var61] += var97.field1394;
                            this.field1524[var61] += var97.field1396;
                            var10002 = this.field1525[var61]++;
                        }
                    }
                    int var98 = var58 - 5;
                    if (var98 >= 0 && var98 < this.field1519) {
                        int var99 = this.field1509[var5][var98][var61] & 0xFF;
                        if (var99 > 0) {
                            class45 var100 = class45.field1386[var99 - 1];
                            this.field1521[var61] -= var100.field1395;
                            this.field1522[var61] -= var100.field1393;
                            this.field1523[var61] -= var100.field1394;
                            this.field1524[var61] -= var100.field1396;
                            var10002 = this.field1525[var61]--;
                        }
                    }
                }
                if (var58 >= 1 && var58 < this.field1519 - 1) {
                    int var62 = 0;
                    int var63 = 0;
                    int var64 = 0;
                    int var65 = 0;
                    int var66 = 0;
                    for (int var67 = -5; var67 < this.field1520 + 5; var67++) {
                        int var68 = var67 + 5;
                        if (var68 >= 0 && var68 < this.field1520) {
                            var62 += this.field1521[var68];
                            var63 += this.field1522[var68];
                            var64 += this.field1523[var68];
                            var65 += this.field1524[var68];
                            var66 += this.field1525[var68];
                        }
                        int var69 = var67 - 5;
                        if (var69 >= 0 && var69 < this.field1520) {
                            var62 -= this.field1521[var69];
                            var63 -= this.field1522[var69];
                            var64 -= this.field1523[var69];
                            var65 -= this.field1524[var69];
                            var66 -= this.field1525[var69];
                        }
                        if (var67 >= 1 && var67 < this.field1520 - 1 && (!field1536 || (this.field1531[0][var58][var67] & 0x2) != 0 || (this.field1531[var5][var58][var67] & 0x10) == 0 && this.method533(var58, true, var5, var67) == field1538)) {
                            if (var5 < field1518) {
                                field1518 = var5;
                            }
                            int var70 = this.field1509[var5][var58][var67] & 0xFF;
                            int var71 = this.field1510[var5][var58][var67] & 0xFF;
                            if (var70 > 0 || var71 > 0) {
                                int var72 = this.field1517[var5][var58][var67];
                                int var73 = this.field1517[var5][var58 + 1][var67];
                                int var74 = this.field1517[var5][var58 + 1][var67 + 1];
                                int var75 = this.field1517[var5][var58][var67 + 1];
                                int var76 = this.field1511[var58][var67];
                                int var77 = this.field1511[var58 + 1][var67];
                                int var78 = this.field1511[var58 + 1][var67 + 1];
                                int var79 = this.field1511[var58][var67 + 1];
                                int var80 = -1;
                                int var81 = -1;
                                if (var70 > 0) {
                                    int var82 = var62 * 256 / var65;
                                    int var83 = var63 / var66;
                                    int var84 = var64 / var66;
                                    var80 = this.method524(var82, var83, var84);
                                    int var85 = field1537 + var82 & 0xFF;
                                    int var86 = field1532 + var84;
                                    if (var86 < 0) {
                                        var86 = 0;
                                    } else if (var86 > 255) {
                                        var86 = 255;
                                    }
                                    var81 = this.method524(var85, var83, var86);
                                }
                                if (var5 > 0) {
                                    boolean var87 = true;
                                    if (var70 == 0 && this.field1515[var5][var58][var67] != 0) {
                                        var87 = false;
                                    }
                                    if (var71 > 0 && !class45.field1386[var71 - 1].field1391) {
                                        var87 = false;
                                    }
                                    if (var87 && var72 == var73 && var72 == var74 && var72 == var75) {
                                        this.field1512[var5][var58][var67] |= 0x924;
                                    }
                                }
                                int var88 = 0;
                                if (var80 != -1) {
                                    var88 = class59.field1623[method527(var81, 96)];
                                }
                                if (var71 == 0) {
                                    arg1.method257(var5, var58, var67, 0, 0, -1, var72, var73, var74, var75, method527(var80, var76), method527(var80, var77), method527(var80, var78), method527(var80, var79), 0, 0, 0, 0, var88, 0);
                                } else {
                                    int var89 = this.field1515[var5][var58][var67] + 1;
                                    byte var90 = this.field1516[var5][var58][var67];
                                    class45 var91 = class45.field1386[var71 - 1];
                                    int var92 = var91.field1389;
                                    int var93;
                                    int var94;
                                    if (var92 >= 0) {
                                        var93 = class59.method559(var92, -596);
                                        var94 = -1;
                                    } else if (var91.field1388 == 16711935) {
                                        var94 = -2;
                                        var92 = -1;
                                        var93 = class59.field1623[this.method538(var91.field1397, 96)];
                                    } else {
                                        var94 = this.method524(var91.field1392, var91.field1393, var91.field1394);
                                        var93 = class59.field1623[this.method538(var91.field1397, 96)];
                                    }
                                    arg1.method257(var5, var58, var67, var89, var90, var92, var72, var73, var74, var75, method527(var80, var76), method527(var80, var77), method527(var80, var78), method527(var80, var79), this.method538(var94, var76), this.method538(var94, var77), this.method538(var94, var78), this.method538(var94, var79), var88, var93);
                                }
                            }
                        }
                    }
                }
            }
            for (int var59 = 1; var59 < this.field1520 - 1; var59++) {
                for (int var60 = 1; var60 < this.field1519 - 1; var60++) {
                    arg1.method256(var5, var60, var59, this.method533(var60, true, var5, var59));
                }
            }
        }
        arg1.method283(this.field1540, -50, -10, -50);
        for (int var6 = 0; var6 < this.field1519; var6++) {
            for (int var47 = 0; var47 < this.field1520; var47++) {
                if ((this.field1531[1][var6][var47] & 0x2) == 2) {
                    arg1.method254(var47, 934, var6);
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
                for (int var12 = 0; var12 <= this.field1520; var12++) {
                    for (int var13 = 0; var13 <= this.field1519; var13++) {
                        if ((this.field1512[var11][var13][var12] & var7) != 0) {
                            int var14 = var12;
                            int var15 = var12;
                            int var16 = var11;
                            int var17 = var11;
                            while (var14 > 0 && (this.field1512[var11][var13][var14 - 1] & var7) != 0) {
                                var14--;
                            }
                            while (var15 < this.field1520 && (this.field1512[var11][var13][var15 + 1] & var7) != 0) {
                                var15++;
                            }
                            label330: while (var16 > 0) {
                                for (int var18 = var14; var18 <= var15; var18++) {
                                    if ((this.field1512[var16 - 1][var13][var18] & var7) == 0) {
                                        break label330;
                                    }
                                }
                                var16--;
                            }
                            label319: while (var17 < var10) {
                                for (int var19 = var14; var19 <= var15; var19++) {
                                    if ((this.field1512[var17 + 1][var13][var19] & var7) == 0) {
                                        break label319;
                                    }
                                }
                                var17++;
                            }
                            int var20 = (var17 + 1 - var16) * (var15 + 1 - var14);
                            if (var20 >= 8) {
                                short var21 = 240;
                                int var22 = this.field1517[var17][var13][var14] - var21;
                                int var23 = this.field1517[var16][var13][var14];
                                class26.method255(var23, var13 * 128, var15 * 128 + 128, var22, var10, var13 * 128, var14 * 128, 765, 1);
                                for (int var24 = var16; var24 <= var17; var24++) {
                                    for (int var25 = var14; var25 <= var15; var25++) {
                                        this.field1512[var24][var13][var25] &= ~var7;
                                    }
                                }
                            }
                        }
                        if ((this.field1512[var11][var13][var12] & var8) != 0) {
                            int var26 = var13;
                            int var27 = var13;
                            int var28 = var11;
                            int var29 = var11;
                            while (var26 > 0 && (this.field1512[var11][var26 - 1][var12] & var8) != 0) {
                                var26--;
                            }
                            while (var27 < this.field1519 && (this.field1512[var11][var27 + 1][var12] & var8) != 0) {
                                var27++;
                            }
                            label383: while (var28 > 0) {
                                for (int var30 = var26; var30 <= var27; var30++) {
                                    if ((this.field1512[var28 - 1][var30][var12] & var8) == 0) {
                                        break label383;
                                    }
                                }
                                var28--;
                            }
                            label372: while (var29 < var10) {
                                for (int var31 = var26; var31 <= var27; var31++) {
                                    if ((this.field1512[var29 + 1][var31][var12] & var8) == 0) {
                                        break label372;
                                    }
                                }
                                var29++;
                            }
                            int var32 = (var29 + 1 - var28) * (var27 + 1 - var26);
                            if (var32 >= 8) {
                                short var33 = 240;
                                int var34 = this.field1517[var29][var26][var12] - var33;
                                int var35 = this.field1517[var28][var26][var12];
                                class26.method255(var35, var27 * 128 + 128, var12 * 128, var34, var10, var26 * 128, var12 * 128, 765, 2);
                                for (int var36 = var28; var36 <= var29; var36++) {
                                    for (int var37 = var26; var37 <= var27; var37++) {
                                        this.field1512[var36][var37][var12] &= ~var8;
                                    }
                                }
                            }
                        }
                        if ((this.field1512[var11][var13][var12] & var9) != 0) {
                            int var38 = var13;
                            int var39 = var13;
                            int var40 = var12;
                            int var41 = var12;
                            while (var40 > 0 && (this.field1512[var11][var13][var40 - 1] & var9) != 0) {
                                var40--;
                            }
                            while (var41 < this.field1520 && (this.field1512[var11][var13][var41 + 1] & var9) != 0) {
                                var41++;
                            }
                            label436: while (var38 > 0) {
                                for (int var42 = var40; var42 <= var41; var42++) {
                                    if ((this.field1512[var11][var38 - 1][var42] & var9) == 0) {
                                        break label436;
                                    }
                                }
                                var38--;
                            }
                            label425: while (var39 < this.field1519) {
                                for (int var43 = var40; var43 <= var41; var43++) {
                                    if ((this.field1512[var11][var39 + 1][var43] & var9) == 0) {
                                        break label425;
                                    }
                                }
                                var39++;
                            }
                            if ((var39 + 1 - var38) * (var41 + 1 - var40) >= 4) {
                                int var44 = this.field1517[var11][var38][var40];
                                class26.method255(var44, var39 * 128 + 128, var41 * 128 + 128, var44, var10, var38 * 128, var40 * 128, 765, 4);
                                for (int var45 = var38; var45 <= var39; var45++) {
                                    for (int var46 = var40; var46 <= var41; var46++) {
                                        this.field1512[var11][var45][var46] &= ~var9;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
