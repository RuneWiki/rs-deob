import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!PMIXOPWJ")
public class class46 {

    @OriginalMember(owner = "client!PMIXOPWJ", name = "f", descriptor = "B")
    private byte field1283 = 9;

    @OriginalMember(owner = "client!PMIXOPWJ", name = "n", descriptor = "Z")
    private boolean field1291 = false;

    @OriginalMember(owner = "client!PMIXOPWJ", name = "u", descriptor = "I")
    private int field1298 = 16143;

    @OriginalMember(owner = "client!PMIXOPWJ", name = "D", descriptor = "Z")
    private boolean field1307 = false;

    @OriginalMember(owner = "client!PMIXOPWJ", name = "B", descriptor = "I")
    private int field1305;

    @OriginalMember(owner = "client!PMIXOPWJ", name = "C", descriptor = "I")
    private int field1306;

    @OriginalMember(owner = "client!PMIXOPWJ", name = "l", descriptor = "[[[I")
    private int[][][] field1289;

    @OriginalMember(owner = "client!PMIXOPWJ", name = "i", descriptor = "[[[B")
    private byte[][][] field1286;

    @OriginalMember(owner = "client!PMIXOPWJ", name = "x", descriptor = "[[[B")
    private byte[][][] field1301;

    @OriginalMember(owner = "client!PMIXOPWJ", name = "E", descriptor = "[[[B")
    private byte[][][] field1308;

    @OriginalMember(owner = "client!PMIXOPWJ", name = "k", descriptor = "[[[B")
    private byte[][][] field1288;

    @OriginalMember(owner = "client!PMIXOPWJ", name = "y", descriptor = "[[[B")
    private byte[][][] field1302;

    @OriginalMember(owner = "client!PMIXOPWJ", name = "w", descriptor = "[[[I")
    private int[][][] field1300;

    @OriginalMember(owner = "client!PMIXOPWJ", name = "z", descriptor = "[[[B")
    private byte[][][] field1303;

    @OriginalMember(owner = "client!PMIXOPWJ", name = "j", descriptor = "[[I")
    private int[][] field1287;

    @OriginalMember(owner = "client!PMIXOPWJ", name = "p", descriptor = "[I")
    private int[] field1293;

    @OriginalMember(owner = "client!PMIXOPWJ", name = "q", descriptor = "[I")
    private int[] field1294;

    @OriginalMember(owner = "client!PMIXOPWJ", name = "r", descriptor = "[I")
    private int[] field1295;

    @OriginalMember(owner = "client!PMIXOPWJ", name = "s", descriptor = "[I")
    private int[] field1296;

    @OriginalMember(owner = "client!PMIXOPWJ", name = "t", descriptor = "[I")
    private int[] field1297;

    @OriginalMember(owner = "client!PMIXOPWJ", name = "a", descriptor = "[I")
    private static final int[] field1278 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!PMIXOPWJ", name = "b", descriptor = "I")
    private static int field1279 = -21200;

    @OriginalMember(owner = "client!PMIXOPWJ", name = "c", descriptor = "I")
    private static int field1280 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!PMIXOPWJ", name = "d", descriptor = "[I")
    private static final int[] field1281 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!PMIXOPWJ", name = "e", descriptor = "[I")
    private static final int[] field1282 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!PMIXOPWJ", name = "g", descriptor = "I")
    private static int field1284 = 398;

    @OriginalMember(owner = "client!PMIXOPWJ", name = "m", descriptor = "I")
    private static int field1290 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!PMIXOPWJ", name = "o", descriptor = "Z")
    public static boolean field1292 = true;

    @OriginalMember(owner = "client!PMIXOPWJ", name = "v", descriptor = "[I")
    private static final int[] field1299 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!PMIXOPWJ", name = "A", descriptor = "I")
    public static int field1304 = 99;

    @OriginalMember(owner = "client!PMIXOPWJ", name = "h", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!PMIXOPWJ", name = "a", descriptor = "(ZILFKUDHMAZ;[B[LZGDLGUZR;I)V")
    public final void method448(boolean arg0, int arg1, class19 arg2, byte[] arg3, class72[] arg4, int arg5) {
        class18 var7 = new class18(arg3, 0);
        int var8 = -1;
        if (arg0) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        while (true) {
            int var10 = var7.method253();
            if (var10 == 0) {
                return;
            }
            var8 += var10;
            int var11 = 0;
            while (true) {
                int var12 = var7.method253();
                if (var12 == 0) {
                    break;
                }
                var11 += var12 - 1;
                int var13 = var11 & 0x3F;
                int var14 = var11 >> 6 & 0x3F;
                int var15 = var11 >> 12;
                int var16 = var7.method239();
                int var17 = var16 >> 2;
                int var18 = var16 & 0x3;
                int var19 = arg5 + var14;
                int var20 = arg1 + var13;
                if (var19 > 0 && var20 > 0 && var19 < 103 && var20 < 103) {
                    int var21 = var15;
                    if ((this.field1286[1][var19][var20] & 0x2) == 2) {
                        var21 = var15 - 1;
                    }
                    class72 var22 = null;
                    if (var21 >= 0) {
                        var22 = arg4[var21];
                    }
                    this.method452(var18, var20, var17, var15, var8, var19, var22, (byte) 1, arg2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!PMIXOPWJ", name = "a", descriptor = "(III)I")
    private final int method449(int arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "client!PMIXOPWJ", name = "a", descriptor = "(IIIII)V")
    public final void method450(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != -10774) {
            field1284 = -44;
        }
        for (int var6 = arg2; var6 <= arg2 + arg4; var6++) {
            for (int var7 = arg0; var7 <= arg0 + arg3; var7++) {
                if (var7 >= 0 && var7 < this.field1305 && var6 >= 0 && var6 < this.field1306) {
                    this.field1303[0][var7][var6] = 127;
                    if (arg0 == var7 && var7 > 0) {
                        this.field1289[0][var7][var6] = this.field1289[0][var7 - 1][var6];
                    }
                    if (arg0 + arg3 == var7 && var7 < this.field1305 - 1) {
                        this.field1289[0][var7][var6] = this.field1289[0][var7 + 1][var6];
                    }
                    if (arg2 == var6 && var6 > 0) {
                        this.field1289[0][var7][var6] = this.field1289[0][var7][var6 - 1];
                    }
                    if (arg2 + arg4 == var6 && var6 < this.field1306 - 1) {
                        this.field1289[0][var7][var6] = this.field1289[0][var7][var6 + 1];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!PMIXOPWJ", name = "a", descriptor = "(II)I")
    private static final int method451(int arg0, int arg1) {
        int var2 = method463(arg0 - 1, arg1 - 1) + method463(arg0 + 1, arg1 - 1) + method463(arg0 - 1, arg1 + 1) + method463(arg0 + 1, arg1 + 1);
        int var3 = method463(arg0 - 1, arg1) + method463(arg0 + 1, arg1) + method463(arg0, arg1 - 1) + method463(arg0, arg1 + 1);
        int var4 = method463(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @OriginalMember(owner = "client!PMIXOPWJ", name = "a", descriptor = "(IIIIIILZGDLGUZR;BLFKUDHMAZ;)V")
    private final void method452(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class72 arg6, byte arg7, class19 arg8) {
        if (field1292 && (this.field1286[0][arg5][arg1] & 0x2) == 0) {
            if ((this.field1286[arg3][arg5][arg1] & 0x10) != 0) {
                return;
            }
            if (this.method458((byte) 5, arg3, arg5, arg1) != field1285) {
                return;
            }
        }
        if (arg3 < field1304) {
            field1304 = arg3;
        }
        int var10 = this.field1289[arg3][arg5][arg1];
        int var11 = this.field1289[arg3][arg5 + 1][arg1];
        int var12 = this.field1289[arg3][arg5 + 1][arg1 + 1];
        int var13 = this.field1289[arg3][arg5][arg1 + 1];
        int var14 = var10 + var11 + var12 + var13 >> 2;
        if (arg7 != 1) {
            return;
        }
        class64 var15 = class64.method548(arg4);
        int var16 = (arg4 << 14) + (arg1 << 7) + arg5 + 1073741824;
        if (!var15.field1601) {
            var16 += Integer.MIN_VALUE;
        }
        byte var17 = (byte) ((arg0 << 6) + arg2);
        if (arg2 == 22) {
            if (!field1292 || var15.field1601 || var15.field1615) {
                class58 var18;
                if (var15.field1610 == -1 && var15.field1591 == null) {
                    var18 = var15.method549(22, arg0, var10, var11, var12, var13, -1);
                } else {
                    var18 = new class15(723, var13, var12, var15.field1610, var11, var10, arg0, arg4, true, 22);
                }
                arg8.method285(arg3, arg5, 1, var17, var18, var14, var16, arg1);
                if (var15.field1617 && var15.field1601 && arg6 != null) {
                    arg6.method596(-135, arg5, arg1);
                }
            }
        } else if (arg2 == 10 || arg2 == 11) {
            class58 var38;
            if (var15.field1610 == -1 && var15.field1591 == null) {
                var38 = var15.method549(10, arg0, var10, var11, var12, var13, -1);
            } else {
                var38 = new class15(723, var13, var12, var15.field1610, var11, var10, arg0, arg4, true, 10);
            }
            if (var38 != null) {
                int var39 = 0;
                if (arg2 == 11) {
                    var39 += 256;
                }
                int var40;
                int var41;
                if (arg0 == 1 || arg0 == 3) {
                    var40 = var15.field1613;
                    var41 = var15.field1603;
                } else {
                    var40 = var15.field1603;
                    var41 = var15.field1613;
                }
                if (arg8.method289(arg1, var39, (byte) 1, arg3, var40, var38, var17, var41, var14, arg5, var16) && var15.field1584) {
                    class41 var42;
                    if (var38 instanceof class41) {
                        var42 = (class41) var38;
                    } else {
                        var42 = var15.method549(10, arg0, var10, var11, var12, var13, -1);
                    }
                    if (var42 != null) {
                        for (int var43 = 0; var43 <= var40; var43++) {
                            for (int var44 = 0; var44 <= var41; var44++) {
                                int var45 = var42.field1213 / 4;
                                if (var45 > 30) {
                                    var45 = 30;
                                }
                                if (var45 > this.field1303[arg3][arg5 + var43][arg1 + var44]) {
                                    this.field1303[arg3][arg5 + var43][arg1 + var44] = (byte) var45;
                                }
                            }
                        }
                    }
                }
            }
            if (var15.field1617 && arg6 != null) {
                arg6.method595(var15.field1624, var15.field1603, (byte) 1, arg0, var15.field1613, arg1, arg5);
            }
        } else if (arg2 >= 12) {
            class58 var19;
            if (var15.field1610 == -1 && var15.field1591 == null) {
                var19 = var15.method549(arg2, arg0, var10, var11, var12, var13, -1);
            } else {
                var19 = new class15(723, var13, var12, var15.field1610, var11, var10, arg0, arg4, true, arg2);
            }
            arg8.method289(arg1, 0, (byte) 1, arg3, 1, var19, var17, 1, var14, arg5, var16);
            if (arg2 >= 12 && arg2 <= 17 && arg2 != 13 && arg3 > 0) {
                this.field1300[arg3][arg5][arg1] |= 0x924;
            }
            if (var15.field1617 && arg6 != null) {
                arg6.method595(var15.field1624, var15.field1603, (byte) 1, arg0, var15.field1613, arg1, arg5);
            }
        } else if (arg2 == 0) {
            class58 var20;
            if (var15.field1610 == -1 && var15.field1591 == null) {
                var20 = var15.method549(0, arg0, var10, var11, var12, var13, -1);
            } else {
                var20 = new class15(723, var13, var12, var15.field1610, var11, var10, arg0, arg4, true, 0);
            }
            arg8.method287(arg3, var14, 0, null, var20, field1281[arg0], arg5, 32742, var17, arg1, var16);
            if (arg0 == 0) {
                if (var15.field1584) {
                    this.field1303[arg3][arg5][arg1] = 50;
                    this.field1303[arg3][arg5][arg1 + 1] = 50;
                }
                if (var15.field1580) {
                    this.field1300[arg3][arg5][arg1] |= 0x249;
                }
            } else if (arg0 == 1) {
                if (var15.field1584) {
                    this.field1303[arg3][arg5][arg1 + 1] = 50;
                    this.field1303[arg3][arg5 + 1][arg1 + 1] = 50;
                }
                if (var15.field1580) {
                    this.field1300[arg3][arg5][arg1 + 1] |= 0x492;
                }
            } else if (arg0 == 2) {
                if (var15.field1584) {
                    this.field1303[arg3][arg5 + 1][arg1] = 50;
                    this.field1303[arg3][arg5 + 1][arg1 + 1] = 50;
                }
                if (var15.field1580) {
                    this.field1300[arg3][arg5 + 1][arg1] |= 0x249;
                }
            } else if (arg0 == 3) {
                if (var15.field1584) {
                    this.field1303[arg3][arg5][arg1] = 50;
                    this.field1303[arg3][arg5 + 1][arg1] = 50;
                }
                if (var15.field1580) {
                    this.field1300[arg3][arg5][arg1] |= 0x492;
                }
            }
            if (var15.field1617 && arg6 != null) {
                arg6.method594(arg5, var15.field1624, arg0, arg2, (byte) 2, arg1);
            }
            if (var15.field1585 != 16) {
                arg8.method295(var15.field1585, arg3, arg1, arg5, 0);
            }
        } else if (arg2 == 1) {
            class58 var21;
            if (var15.field1610 == -1 && var15.field1591 == null) {
                var21 = var15.method549(1, arg0, var10, var11, var12, var13, -1);
            } else {
                var21 = new class15(723, var13, var12, var15.field1610, var11, var10, arg0, arg4, true, 1);
            }
            arg8.method287(arg3, var14, 0, null, var21, field1278[arg0], arg5, 32742, var17, arg1, var16);
            if (var15.field1584) {
                if (arg0 == 0) {
                    this.field1303[arg3][arg5][arg1 + 1] = 50;
                } else if (arg0 == 1) {
                    this.field1303[arg3][arg5 + 1][arg1 + 1] = 50;
                } else if (arg0 == 2) {
                    this.field1303[arg3][arg5 + 1][arg1] = 50;
                } else if (arg0 == 3) {
                    this.field1303[arg3][arg5][arg1] = 50;
                }
            }
            if (var15.field1617 && arg6 != null) {
                arg6.method594(arg5, var15.field1624, arg0, arg2, (byte) 2, arg1);
            }
        } else if (arg2 == 2) {
            int var22 = arg0 + 1 & 0x3;
            class58 var23;
            class58 var24;
            if (var15.field1610 == -1 && var15.field1591 == null) {
                var23 = var15.method549(2, arg0 + 4, var10, var11, var12, var13, -1);
                var24 = var15.method549(2, var22, var10, var11, var12, var13, -1);
            } else {
                var23 = new class15(723, var13, var12, var15.field1610, var11, var10, arg0 + 4, arg4, true, 2);
                var24 = new class15(723, var13, var12, var15.field1610, var11, var10, var22, arg4, true, 2);
            }
            arg8.method287(arg3, var14, field1281[var22], var24, var23, field1281[arg0], arg5, 32742, var17, arg1, var16);
            if (var15.field1580) {
                if (arg0 == 0) {
                    this.field1300[arg3][arg5][arg1] |= 0x249;
                    this.field1300[arg3][arg5][arg1 + 1] |= 0x492;
                } else if (arg0 == 1) {
                    this.field1300[arg3][arg5][arg1 + 1] |= 0x492;
                    this.field1300[arg3][arg5 + 1][arg1] |= 0x249;
                } else if (arg0 == 2) {
                    this.field1300[arg3][arg5 + 1][arg1] |= 0x249;
                    this.field1300[arg3][arg5][arg1] |= 0x492;
                } else if (arg0 == 3) {
                    this.field1300[arg3][arg5][arg1] |= 0x492;
                    this.field1300[arg3][arg5][arg1] |= 0x249;
                }
            }
            if (var15.field1617 && arg6 != null) {
                arg6.method594(arg5, var15.field1624, arg0, arg2, (byte) 2, arg1);
            }
            if (var15.field1585 != 16) {
                arg8.method295(var15.field1585, arg3, arg1, arg5, 0);
            }
        } else if (arg2 == 3) {
            class58 var25;
            if (var15.field1610 == -1 && var15.field1591 == null) {
                var25 = var15.method549(3, arg0, var10, var11, var12, var13, -1);
            } else {
                var25 = new class15(723, var13, var12, var15.field1610, var11, var10, arg0, arg4, true, 3);
            }
            arg8.method287(arg3, var14, 0, null, var25, field1278[arg0], arg5, 32742, var17, arg1, var16);
            if (var15.field1584) {
                if (arg0 == 0) {
                    this.field1303[arg3][arg5][arg1 + 1] = 50;
                } else if (arg0 == 1) {
                    this.field1303[arg3][arg5 + 1][arg1 + 1] = 50;
                } else if (arg0 == 2) {
                    this.field1303[arg3][arg5 + 1][arg1] = 50;
                } else if (arg0 == 3) {
                    this.field1303[arg3][arg5][arg1] = 50;
                }
            }
            if (var15.field1617 && arg6 != null) {
                arg6.method594(arg5, var15.field1624, arg0, arg2, (byte) 2, arg1);
            }
        } else if (arg2 == 9) {
            class58 var26;
            if (var15.field1610 == -1 && var15.field1591 == null) {
                var26 = var15.method549(arg2, arg0, var10, var11, var12, var13, -1);
            } else {
                var26 = new class15(723, var13, var12, var15.field1610, var11, var10, arg0, arg4, true, arg2);
            }
            arg8.method289(arg1, 0, (byte) 1, arg3, 1, var26, var17, 1, var14, arg5, var16);
            if (var15.field1617 && arg6 != null) {
                arg6.method595(var15.field1624, var15.field1603, (byte) 1, arg0, var15.field1613, arg1, arg5);
            }
        } else {
            if (var15.field1623) {
                if (arg0 == 1) {
                    int var27 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var10;
                    var10 = var27;
                } else if (arg0 == 2) {
                    int var28 = var13;
                    var13 = var11;
                    var11 = var28;
                    int var29 = var12;
                    var12 = var10;
                    var10 = var29;
                } else if (arg0 == 3) {
                    int var30 = var13;
                    var13 = var10;
                    var10 = var11;
                    var11 = var12;
                    var12 = var30;
                }
            }
            if (arg2 == 4) {
                class58 var31;
                if (var15.field1610 == -1 && var15.field1591 == null) {
                    var31 = var15.method549(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var31 = new class15(723, var13, var12, var15.field1610, var11, var10, 0, arg4, true, 4);
                }
                arg8.method288(var14, 0, var17, -911, var16, 0, arg3, arg1, var31, arg5, arg0 * 512, field1281[arg0]);
            } else if (arg2 == 5) {
                int var32 = 16;
                int var33 = arg8.method305(arg3, arg5, arg1);
                if (var33 > 0) {
                    var32 = class64.method548(var33 >> 14 & 0x7FFF).field1585;
                }
                class58 var34;
                if (var15.field1610 == -1 && var15.field1591 == null) {
                    var34 = var15.method549(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var34 = new class15(723, var13, var12, var15.field1610, var11, var10, 0, arg4, true, 4);
                }
                arg8.method288(var14, field1299[arg0] * var32, var17, -911, var16, field1282[arg0] * var32, arg3, arg1, var34, arg5, arg0 * 512, field1281[arg0]);
            } else if (arg2 == 6) {
                class58 var35;
                if (var15.field1610 == -1 && var15.field1591 == null) {
                    var35 = var15.method549(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var35 = new class15(723, var13, var12, var15.field1610, var11, var10, 0, arg4, true, 4);
                }
                arg8.method288(var14, 0, var17, -911, var16, 0, arg3, arg1, var35, arg5, arg0, 256);
            } else if (arg2 == 7) {
                class58 var36;
                if (var15.field1610 == -1 && var15.field1591 == null) {
                    var36 = var15.method549(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var36 = new class15(723, var13, var12, var15.field1610, var11, var10, 0, arg4, true, 4);
                }
                arg8.method288(var14, 0, var17, -911, var16, 0, arg3, arg1, var36, arg5, arg0, 512);
            } else if (arg2 == 8) {
                class58 var37;
                if (var15.field1610 == -1 && var15.field1591 == null) {
                    var37 = var15.method549(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var37 = new class15(723, var13, var12, var15.field1610, var11, var10, 0, arg4, true, 4);
                }
                arg8.method288(var14, 0, var17, -911, var16, 0, arg3, arg1, var37, arg5, arg0, 768);
            }
        }
    }

    @OriginalMember(owner = "client!PMIXOPWJ", name = "<init>", descriptor = "([[[BIII[[[I)V")
    public class46(byte[][][] arg0, int arg1, int arg2, int arg3, int[][][] arg4) {
        field1304 = 99;
        this.field1305 = arg3;
        this.field1306 = arg1;
        this.field1289 = arg4;
        this.field1286 = arg0;
        this.field1301 = new byte[4][this.field1305][this.field1306];
        this.field1308 = new byte[4][this.field1305][this.field1306];
        this.field1288 = new byte[4][this.field1305][this.field1306];
        int var6 = 19 / arg2;
        this.field1302 = new byte[4][this.field1305][this.field1306];
        this.field1300 = new int[4][this.field1305 + 1][this.field1306 + 1];
        this.field1303 = new byte[4][this.field1305 + 1][this.field1306 + 1];
        this.field1287 = new int[this.field1305 + 1][this.field1306 + 1];
        this.field1293 = new int[this.field1306];
        this.field1294 = new int[this.field1306];
        this.field1295 = new int[this.field1306];
        this.field1296 = new int[this.field1306];
        this.field1297 = new int[this.field1306];
    }

    @OriginalMember(owner = "client!PMIXOPWJ", name = "b", descriptor = "(II)I")
    private final int method453(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!PMIXOPWJ", name = "a", descriptor = "(II[BI)Z")
    public static final boolean method454(int arg0, int arg1, byte[] arg2, int arg3) {
        boolean var4 = true;
        class18 var5 = new class18(arg2, 0);
        int var6 = -1;
        if (arg3 != 39858) {
            field1279 = 410;
        }
        label52: while (true) {
            int var7 = var5.method253();
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method253();
                    if (var11 == 0) {
                        continue label52;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = var5.method239() >> 2;
                    int var15 = arg0 + var13;
                    int var16 = arg1 + var12;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        class64 var17 = class64.method548(var6);
                        if (var14 != 22 || !field1292 || var17.field1601 || var17.field1615) {
                            var4 &= var17.method555(5);
                            var9 = true;
                        }
                    }
                }
                int var10 = var5.method253();
                if (var10 == 0) {
                    break;
                }
                var5.method239();
            }
        }
    }

    @OriginalMember(owner = "client!PMIXOPWJ", name = "a", descriptor = "(IIII)V")
    public final void method455(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < 8; var5++) {
            for (int var8 = 0; var8 < 8; var8++) {
                this.field1289[arg1][arg3 + var5][arg0 + var8] = 0;
            }
        }
        if (arg2 != 0) {
            this.field1307 = !this.field1307;
        }
        if (arg3 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                this.field1289[arg1][arg3][arg0 + var6] = this.field1289[arg1][arg3 - 1][arg0 + var6];
            }
        }
        if (arg0 > 0) {
            for (int var7 = 1; var7 < 8; var7++) {
                this.field1289[arg1][arg3 + var7][arg0] = this.field1289[arg1][arg3 + var7][arg0 - 1];
            }
        }
        if (arg3 > 0 && this.field1289[arg1][arg3 - 1][arg0] != 0) {
            this.field1289[arg1][arg3][arg0] = this.field1289[arg1][arg3 - 1][arg0];
        } else if (arg0 > 0 && this.field1289[arg1][arg3][arg0 - 1] != 0) {
            this.field1289[arg1][arg3][arg0] = this.field1289[arg1][arg3][arg0 - 1];
        } else if (arg3 > 0 && arg0 > 0 && this.field1289[arg1][arg3 - 1][arg0 - 1] != 0) {
            this.field1289[arg1][arg3][arg0] = this.field1289[arg1][arg3 - 1][arg0 - 1];
        }
    }

    @OriginalMember(owner = "client!PMIXOPWJ", name = "a", descriptor = "(IIIILEYMNCFMK;III)V")
    private final void method456(int arg0, int arg1, int arg2, int arg3, class18 arg4, int arg5, int arg6, int arg7) {
        if (arg7 != 5) {
            return;
        }
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var11 = arg4.method239();
                if (var11 == 0) {
                    return;
                }
                if (var11 == 1) {
                    arg4.method239();
                    return;
                }
                if (var11 <= 49) {
                    arg4.method239();
                }
            }
        }
        this.field1286[arg6][arg2][arg3] = 0;
        while (true) {
            int var9 = arg4.method239();
            if (var9 == 0) {
                if (arg6 == 0) {
                    this.field1289[0][arg2][arg3] = -method461(arg2 + arg1 + 932731, arg3 + 556238 + arg5) * 8;
                    return;
                } else {
                    this.field1289[arg6][arg2][arg3] = this.field1289[arg6 - 1][arg2][arg3] - 240;
                    return;
                }
            }
            if (var9 == 1) {
                int var10 = arg4.method239();
                if (var10 == 1) {
                    var10 = 0;
                }
                if (arg6 == 0) {
                    this.field1289[0][arg2][arg3] = -var10 * 8;
                    return;
                }
                this.field1289[arg6][arg2][arg3] = this.field1289[arg6 - 1][arg2][arg3] - var10 * 8;
                return;
            }
            if (var9 <= 49) {
                this.field1308[arg6][arg2][arg3] = arg4.method240();
                this.field1288[arg6][arg2][arg3] = (byte) ((var9 - 2) / 4);
                this.field1302[arg6][arg2][arg3] = (byte) (var9 + arg0 - 2 & 0x3);
            } else if (var9 <= 81) {
                this.field1286[arg6][arg2][arg3] = (byte) (var9 - 49);
            } else {
                this.field1301[arg6][arg2][arg3] = (byte) (var9 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!PMIXOPWJ", name = "c", descriptor = "(II)I")
    private static final int method457(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!PMIXOPWJ", name = "a", descriptor = "(BIII)I")
    public int method458(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 == 5) {
            boolean var5 = false;
        } else {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        if ((this.field1286[arg1][arg2][arg3] & 0x8) == 0) {
            return arg1 <= 0 || (this.field1286[1][arg2][arg3] & 0x2) == 0 ? arg1 : arg1 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!PMIXOPWJ", name = "b", descriptor = "(III)I")
    private static final int method459(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method451(var3, var5);
        int var8 = method451(var3 + 1, var5);
        int var9 = method451(var3, var5 + 1);
        int var10 = method451(var3 + 1, var5 + 1);
        int var11 = method460(var7, var8, var4, arg2);
        int var12 = method460(var9, var10, var4, arg2);
        return method460(var11, var12, var6, arg2);
    }

    @OriginalMember(owner = "client!PMIXOPWJ", name = "b", descriptor = "(IIII)I")
    private static final int method460(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class3.field41[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @OriginalMember(owner = "client!PMIXOPWJ", name = "d", descriptor = "(II)I")
    private static final int method461(int arg0, int arg1) {
        int var2 = method459(arg0 + 45365, arg1 + 91923, 4) + (method459(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method459(arg0, arg1, 1) - 128 >> 2) - 128;
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @OriginalMember(owner = "client!PMIXOPWJ", name = "c", descriptor = "(III)Z")
    public static final boolean method462(int arg0, int arg1, int arg2) {
        if (arg0 != 27253) {
            throw new NullPointerException();
        }
        class64 var3 = class64.method548(arg2);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var3.method553(arg1, 173);
    }

    @OriginalMember(owner = "client!PMIXOPWJ", name = "e", descriptor = "(II)I")
    private static final int method463(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!PMIXOPWJ", name = "a", descriptor = "(II[BILFKUDHMAZ;III[LZGDLGUZR;II)V")
    public final void method464(int arg0, int arg1, byte[] arg2, int arg3, class19 arg4, int arg5, int arg6, int arg7, class72[] arg8, int arg9, int arg10) {
        class18 var12 = new class18(arg2, 0);
        if (arg6 != -644) {
            for (int var13 = 1; var13 > 0; var13++) {
            }
        }
        int var14 = -1;
        while (true) {
            int var15 = var12.method253();
            if (var15 == 0) {
                return;
            }
            var14 += var15;
            int var16 = 0;
            while (true) {
                int var17 = var12.method253();
                if (var17 == 0) {
                    break;
                }
                var16 += var17 - 1;
                int var18 = var16 & 0x3F;
                int var19 = var16 >> 6 & 0x3F;
                int var20 = var16 >> 12;
                int var21 = var12.method239();
                int var22 = var21 >> 2;
                int var23 = var21 & 0x3;
                if (arg0 == var20 && var19 >= arg5 && var19 < arg5 + 8 && var18 >= arg10 && var18 < arg10 + 8) {
                    class64 var24 = class64.method548(var14);
                    int var25 = arg9 + class62.method536(var24.field1603, var19 & 0x7, var18 & 0x7, var23, var24.field1613, true, arg7);
                    int var26 = arg1 + class62.method537(var18 & 0x7, var23, var19 & 0x7, var24.field1603, arg7, -881, var24.field1613);
                    if (var25 > 0 && var26 > 0 && var25 < 103 && var26 < 103) {
                        int var27 = arg3;
                        if ((this.field1286[1][var25][var26] & 0x2) == 2) {
                            var27 = arg3 - 1;
                        }
                        class72 var28 = null;
                        if (var27 >= 0) {
                            var28 = arg8[var27];
                        }
                        this.method452(arg7 + var23 & 0x3, var26, var22, arg3, var14, var25, var28, (byte) 1, arg4);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!PMIXOPWJ", name = "a", descriptor = "(ZLEYMNCFMK;LXQFIPMSR;)V")
    public static final void method465(boolean arg0, class18 arg1, class66 arg2) {
        if (arg0) {
            return;
        }
        int var3 = -1;
        while (true) {
            int var4 = arg1.method253();
            if (var4 == 0) {
                return;
            }
            var3 += var4;
            class64 var5 = class64.method548(var3);
            var5.method550(-35758, arg2);
            while (true) {
                int var6 = arg1.method253();
                if (var6 == 0) {
                    break;
                }
                arg1.method239();
            }
        }
    }

    @OriginalMember(owner = "client!PMIXOPWJ", name = "a", descriptor = "([LZGDLGUZR;IIII[BB)V")
    public final void method466(class72[] arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, byte arg6) {
        if (this.field1283 == arg6) {
            boolean var8 = false;
        } else {
            this.field1298 = -399;
        }
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    if (arg1 + var14 > 0 && arg1 + var14 < 103 && arg2 + var15 > 0 && arg2 + var15 < 103) {
                        arg0[var9].field1742[arg1 + var14][arg2 + var15] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class18 var10 = new class18(arg5, 0);
        for (int var11 = 0; var11 < 4; var11++) {
            for (int var12 = 0; var12 < 64; var12++) {
                for (int var13 = 0; var13 < 64; var13++) {
                    this.method456(0, arg4, arg1 + var12, arg2 + var13, var10, arg3, var11, 5);
                }
            }
        }
    }

    @OriginalMember(owner = "client!PMIXOPWJ", name = "a", descriptor = "([LZGDLGUZR;IIIIBII[BI)V")
    public final void method467(class72[] arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, byte[] arg8, int arg9) {
        if (arg5 != 5) {
            field1279 = -12;
        }
        for (int var11 = 0; var11 < 8; var11++) {
            for (int var16 = 0; var16 < 8; var16++) {
                if (arg9 + var11 > 0 && arg9 + var11 < 103 && arg1 + var16 > 0 && arg1 + var16 < 103) {
                    arg0[arg7].field1742[arg9 + var11][arg1 + var16] &= 0xFEFFFFFF;
                }
            }
        }
        class18 var12 = new class18(arg8, 0);
        for (int var13 = 0; var13 < 4; var13++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    if (arg6 == var13 && var14 >= arg4 && var14 < arg4 + 8 && var15 >= arg3 && var15 < arg3 + 8) {
                        this.method456(arg2, 0, arg9 + class62.method534(13489, var14 & 0x7, var15 & 0x7, arg2), arg1 + class62.method535(arg2, -211, var14 & 0x7, var15 & 0x7), var12, 0, arg7, 5);
                    } else {
                        this.method456(0, 0, -1, -1, var12, 0, 0, 5);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!PMIXOPWJ", name = "a", descriptor = "([[[ILFKUDHMAZ;IIIZLZGDLGUZR;IIII)V")
    public static final void method468(int[][][] arg0, class19 arg1, int arg2, int arg3, int arg4, boolean arg5, class72 arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = arg0[arg3][arg8][arg7];
        int var12 = arg0[arg3][arg8 + 1][arg7];
        int var13 = arg0[arg3][arg8 + 1][arg7 + 1];
        int var14 = arg0[arg3][arg8][arg7 + 1];
        int var15 = var11 + var12 + var13 + var14 >> 2;
        class64 var16 = class64.method548(arg2);
        int var17 = (arg2 << 14) + (arg7 << 7) + arg8 + 1073741824;
        if (!var16.field1601) {
            var17 += Integer.MIN_VALUE;
        }
        byte var18 = (byte) ((arg10 << 6) + arg4);
        if (arg5) {
            field1284 = -116;
        }
        if (arg4 == 22) {
            class58 var19;
            if (var16.field1610 == -1 && var16.field1591 == null) {
                var19 = var16.method549(22, arg10, var11, var12, var13, var14, -1);
            } else {
                var19 = new class15(723, var14, var13, var16.field1610, var12, var11, arg10, arg2, true, 22);
            }
            arg1.method285(arg9, arg8, 1, var18, var19, var15, var17, arg7);
            if (var16.field1617 && var16.field1601) {
                arg6.method596(-135, arg8, arg7);
            }
        } else if (arg4 == 10 || arg4 == 11) {
            class58 var39;
            if (var16.field1610 == -1 && var16.field1591 == null) {
                var39 = var16.method549(10, arg10, var11, var12, var13, var14, -1);
            } else {
                var39 = new class15(723, var14, var13, var16.field1610, var12, var11, arg10, arg2, true, 10);
            }
            if (var39 != null) {
                int var40 = 0;
                if (arg4 == 11) {
                    var40 += 256;
                }
                int var41;
                int var42;
                if (arg10 == 1 || arg10 == 3) {
                    var41 = var16.field1613;
                    var42 = var16.field1603;
                } else {
                    var41 = var16.field1603;
                    var42 = var16.field1613;
                }
                arg1.method289(arg7, var40, (byte) 1, arg9, var41, var39, var18, var42, var15, arg8, var17);
            }
            if (var16.field1617) {
                arg6.method595(var16.field1624, var16.field1603, (byte) 1, arg10, var16.field1613, arg7, arg8);
            }
        } else if (arg4 >= 12) {
            class58 var20;
            if (var16.field1610 == -1 && var16.field1591 == null) {
                var20 = var16.method549(arg4, arg10, var11, var12, var13, var14, -1);
            } else {
                var20 = new class15(723, var14, var13, var16.field1610, var12, var11, arg10, arg2, true, arg4);
            }
            arg1.method289(arg7, 0, (byte) 1, arg9, 1, var20, var18, 1, var15, arg8, var17);
            if (var16.field1617) {
                arg6.method595(var16.field1624, var16.field1603, (byte) 1, arg10, var16.field1613, arg7, arg8);
            }
        } else if (arg4 == 0) {
            class58 var21;
            if (var16.field1610 == -1 && var16.field1591 == null) {
                var21 = var16.method549(0, arg10, var11, var12, var13, var14, -1);
            } else {
                var21 = new class15(723, var14, var13, var16.field1610, var12, var11, arg10, arg2, true, 0);
            }
            arg1.method287(arg9, var15, 0, null, var21, field1281[arg10], arg8, 32742, var18, arg7, var17);
            if (var16.field1617) {
                arg6.method594(arg8, var16.field1624, arg10, arg4, (byte) 2, arg7);
            }
        } else if (arg4 == 1) {
            class58 var22;
            if (var16.field1610 == -1 && var16.field1591 == null) {
                var22 = var16.method549(1, arg10, var11, var12, var13, var14, -1);
            } else {
                var22 = new class15(723, var14, var13, var16.field1610, var12, var11, arg10, arg2, true, 1);
            }
            arg1.method287(arg9, var15, 0, null, var22, field1278[arg10], arg8, 32742, var18, arg7, var17);
            if (var16.field1617) {
                arg6.method594(arg8, var16.field1624, arg10, arg4, (byte) 2, arg7);
            }
        } else if (arg4 == 2) {
            int var23 = arg10 + 1 & 0x3;
            class58 var24;
            class58 var25;
            if (var16.field1610 == -1 && var16.field1591 == null) {
                var24 = var16.method549(2, arg10 + 4, var11, var12, var13, var14, -1);
                var25 = var16.method549(2, var23, var11, var12, var13, var14, -1);
            } else {
                var24 = new class15(723, var14, var13, var16.field1610, var12, var11, arg10 + 4, arg2, true, 2);
                var25 = new class15(723, var14, var13, var16.field1610, var12, var11, var23, arg2, true, 2);
            }
            arg1.method287(arg9, var15, field1281[var23], var25, var24, field1281[arg10], arg8, 32742, var18, arg7, var17);
            if (var16.field1617) {
                arg6.method594(arg8, var16.field1624, arg10, arg4, (byte) 2, arg7);
            }
        } else if (arg4 == 3) {
            class58 var26;
            if (var16.field1610 == -1 && var16.field1591 == null) {
                var26 = var16.method549(3, arg10, var11, var12, var13, var14, -1);
            } else {
                var26 = new class15(723, var14, var13, var16.field1610, var12, var11, arg10, arg2, true, 3);
            }
            arg1.method287(arg9, var15, 0, null, var26, field1278[arg10], arg8, 32742, var18, arg7, var17);
            if (var16.field1617) {
                arg6.method594(arg8, var16.field1624, arg10, arg4, (byte) 2, arg7);
            }
        } else if (arg4 == 9) {
            class58 var27;
            if (var16.field1610 == -1 && var16.field1591 == null) {
                var27 = var16.method549(arg4, arg10, var11, var12, var13, var14, -1);
            } else {
                var27 = new class15(723, var14, var13, var16.field1610, var12, var11, arg10, arg2, true, arg4);
            }
            arg1.method289(arg7, 0, (byte) 1, arg9, 1, var27, var18, 1, var15, arg8, var17);
            if (var16.field1617) {
                arg6.method595(var16.field1624, var16.field1603, (byte) 1, arg10, var16.field1613, arg7, arg8);
            }
        } else {
            if (var16.field1623) {
                if (arg10 == 1) {
                    int var28 = var14;
                    var14 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var28;
                } else if (arg10 == 2) {
                    int var29 = var14;
                    var14 = var12;
                    var12 = var29;
                    int var30 = var13;
                    var13 = var11;
                    var11 = var30;
                } else if (arg10 == 3) {
                    int var31 = var14;
                    var14 = var11;
                    var11 = var12;
                    var12 = var13;
                    var13 = var31;
                }
            }
            if (arg4 == 4) {
                class58 var32;
                if (var16.field1610 == -1 && var16.field1591 == null) {
                    var32 = var16.method549(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var32 = new class15(723, var14, var13, var16.field1610, var12, var11, 0, arg2, true, 4);
                }
                arg1.method288(var15, 0, var18, -911, var17, 0, arg9, arg7, var32, arg8, arg10 * 512, field1281[arg10]);
            } else if (arg4 == 5) {
                int var33 = 16;
                int var34 = arg1.method305(arg9, arg8, arg7);
                if (var34 > 0) {
                    var33 = class64.method548(var34 >> 14 & 0x7FFF).field1585;
                }
                class58 var35;
                if (var16.field1610 == -1 && var16.field1591 == null) {
                    var35 = var16.method549(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var35 = new class15(723, var14, var13, var16.field1610, var12, var11, 0, arg2, true, 4);
                }
                arg1.method288(var15, field1299[arg10] * var33, var18, -911, var17, field1282[arg10] * var33, arg9, arg7, var35, arg8, arg10 * 512, field1281[arg10]);
            } else if (arg4 == 6) {
                class58 var36;
                if (var16.field1610 == -1 && var16.field1591 == null) {
                    var36 = var16.method549(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var36 = new class15(723, var14, var13, var16.field1610, var12, var11, 0, arg2, true, 4);
                }
                arg1.method288(var15, 0, var18, -911, var17, 0, arg9, arg7, var36, arg8, arg10, 256);
            } else if (arg4 == 7) {
                class58 var37;
                if (var16.field1610 == -1 && var16.field1591 == null) {
                    var37 = var16.method549(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var37 = new class15(723, var14, var13, var16.field1610, var12, var11, 0, arg2, true, 4);
                }
                arg1.method288(var15, 0, var18, -911, var17, 0, arg9, arg7, var37, arg8, arg10, 512);
            } else if (arg4 == 8) {
                class58 var38;
                if (var16.field1610 == -1 && var16.field1591 == null) {
                    var38 = var16.method549(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var38 = new class15(723, var14, var13, var16.field1610, var12, var11, 0, arg2, true, 4);
                }
                arg1.method288(var15, 0, var18, -911, var17, 0, arg9, arg7, var38, arg8, arg10, 768);
            }
        }
    }

    @OriginalMember(owner = "client!PMIXOPWJ", name = "a", descriptor = "(LFKUDHMAZ;B[LZGDLGUZR;)V")
    public final void method469(class19 arg0, byte arg1, class72[] arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((this.field1286[var4][var110][var111] & 0x1) == 1) {
                        int var112 = var4;
                        if ((this.field1286[1][var110][var111] & 0x2) == 2) {
                            var112 = var4 - 1;
                        }
                        if (var112 >= 0) {
                            arg2[var112].method596(-135, var110, var111);
                        }
                    }
                }
            }
        }
        field1280 += (int) (Math.random() * 5.0D) - 2;
        if (field1280 < -8) {
            field1280 = -8;
        }
        if (field1280 > 8) {
            field1280 = 8;
        }
        field1290 += (int) (Math.random() * 5.0D) - 2;
        if (field1290 < -16) {
            field1290 = -16;
        }
        if (field1290 > 16) {
            field1290 = 16;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            byte[][] var48 = this.field1303[var5];
            byte var49 = 96;
            short var50 = 768;
            byte var51 = -50;
            byte var52 = -10;
            byte var53 = -50;
            int var54 = (int) Math.sqrt((double) (var53 * var53 + var51 * var51 + var52 * var52));
            int var55 = var50 * var54 >> 8;
            for (int var56 = 1; var56 < this.field1306 - 1; var56++) {
                for (int var101 = 1; var101 < this.field1305 - 1; var101++) {
                    int var102 = this.field1289[var5][var101 + 1][var56] - this.field1289[var5][var101 - 1][var56];
                    int var103 = this.field1289[var5][var101][var56 + 1] - this.field1289[var5][var101][var56 - 1];
                    int var104 = (int) Math.sqrt((double) (var103 * var103 + var102 * var102 + 65536));
                    int var105 = (var102 << 8) / var104;
                    int var106 = 65536 / var104;
                    int var107 = (var103 << 8) / var104;
                    int var108 = (var53 * var107 + var51 * var105 + var52 * var106) / var55 + var49;
                    int var109 = (var48[var101][var56] >> 1) + (var48[var101][var56 + 1] >> 3) + (var48[var101][var56 - 1] >> 2) + (var48[var101 - 1][var56] >> 2) + (var48[var101 + 1][var56] >> 3);
                    this.field1287[var101][var56] = var108 - var109;
                }
            }
            for (int var57 = 0; var57 < this.field1306; var57++) {
                this.field1293[var57] = 0;
                this.field1294[var57] = 0;
                this.field1295[var57] = 0;
                this.field1296[var57] = 0;
                this.field1297[var57] = 0;
            }
            for (int var58 = -5; var58 < this.field1305 + 5; var58++) {
                for (int var61 = 0; var61 < this.field1306; var61++) {
                    int var95 = var58 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < this.field1305) {
                        int var96 = this.field1301[var5][var95][var61] & 0xFF;
                        if (var96 > 0) {
                            class25 var97 = class25.field957[var96 - 1];
                            this.field1293[var61] += var97.field966;
                            this.field1294[var61] += var97.field964;
                            this.field1295[var61] += var97.field965;
                            this.field1296[var61] += var97.field967;
                            var10002 = this.field1297[var61]++;
                        }
                    }
                    int var98 = var58 - 5;
                    if (var98 >= 0 && var98 < this.field1305) {
                        int var99 = this.field1301[var5][var98][var61] & 0xFF;
                        if (var99 > 0) {
                            class25 var100 = class25.field957[var99 - 1];
                            this.field1293[var61] -= var100.field966;
                            this.field1294[var61] -= var100.field964;
                            this.field1295[var61] -= var100.field965;
                            this.field1296[var61] -= var100.field967;
                            var10002 = this.field1297[var61]--;
                        }
                    }
                }
                if (var58 >= 1 && var58 < this.field1305 - 1) {
                    int var62 = 0;
                    int var63 = 0;
                    int var64 = 0;
                    int var65 = 0;
                    int var66 = 0;
                    for (int var67 = -5; var67 < this.field1306 + 5; var67++) {
                        int var68 = var67 + 5;
                        if (var68 >= 0 && var68 < this.field1306) {
                            var62 += this.field1293[var68];
                            var63 += this.field1294[var68];
                            var64 += this.field1295[var68];
                            var65 += this.field1296[var68];
                            var66 += this.field1297[var68];
                        }
                        int var69 = var67 - 5;
                        if (var69 >= 0 && var69 < this.field1306) {
                            var62 -= this.field1293[var69];
                            var63 -= this.field1294[var69];
                            var64 -= this.field1295[var69];
                            var65 -= this.field1296[var69];
                            var66 -= this.field1297[var69];
                        }
                        if (var67 >= 1 && var67 < this.field1306 - 1 && (!field1292 || (this.field1286[0][var58][var67] & 0x2) != 0 || (this.field1286[var5][var58][var67] & 0x10) == 0 && this.method458((byte) 5, var5, var58, var67) == field1285)) {
                            if (var5 < field1304) {
                                field1304 = var5;
                            }
                            int var70 = this.field1301[var5][var58][var67] & 0xFF;
                            int var71 = this.field1308[var5][var58][var67] & 0xFF;
                            if (var70 > 0 || var71 > 0) {
                                int var72 = this.field1289[var5][var58][var67];
                                int var73 = this.field1289[var5][var58 + 1][var67];
                                int var74 = this.field1289[var5][var58 + 1][var67 + 1];
                                int var75 = this.field1289[var5][var58][var67 + 1];
                                int var76 = this.field1287[var58][var67];
                                int var77 = this.field1287[var58 + 1][var67];
                                int var78 = this.field1287[var58 + 1][var67 + 1];
                                int var79 = this.field1287[var58][var67 + 1];
                                int var80 = -1;
                                int var81 = -1;
                                if (var70 > 0) {
                                    int var82 = var62 * 256 / var65;
                                    int var83 = var63 / var66;
                                    int var84 = var64 / var66;
                                    var80 = this.method449(var82, var83, var84);
                                    int var85 = field1280 + var82 & 0xFF;
                                    int var86 = field1290 + var84;
                                    if (var86 < 0) {
                                        var86 = 0;
                                    } else if (var86 > 255) {
                                        var86 = 255;
                                    }
                                    var81 = this.method449(var85, var83, var86);
                                }
                                if (var5 > 0) {
                                    boolean var87 = true;
                                    if (var70 == 0 && this.field1288[var5][var58][var67] != 0) {
                                        var87 = false;
                                    }
                                    if (var71 > 0 && !class25.field957[var71 - 1].field962) {
                                        var87 = false;
                                    }
                                    if (var87 && var72 == var73 && var72 == var74 && var72 == var75) {
                                        this.field1300[var5][var58][var67] |= 0x924;
                                    }
                                }
                                int var88 = 0;
                                if (var80 != -1) {
                                    var88 = class3.field52[method457(var81, 96)];
                                }
                                if (var71 == 0) {
                                    arg0.method284(var5, var58, var67, 0, 0, -1, var72, var73, var74, var75, method457(var80, var76), method457(var80, var77), method457(var80, var78), method457(var80, var79), 0, 0, 0, 0, var88, 0);
                                } else {
                                    int var89 = this.field1288[var5][var58][var67] + 1;
                                    byte var90 = this.field1302[var5][var58][var67];
                                    class25 var91 = class25.field957[var71 - 1];
                                    int var92 = var91.field960;
                                    int var93;
                                    int var94;
                                    if (var92 >= 0) {
                                        var93 = class3.method13(var92, 4);
                                        var94 = -1;
                                    } else if (var91.field959 == 16711935) {
                                        var94 = -2;
                                        var92 = -1;
                                        var93 = class3.field52[this.method453(var91.field968, 96)];
                                    } else {
                                        var94 = this.method449(var91.field963, var91.field964, var91.field965);
                                        var93 = class3.field52[this.method453(var91.field968, 96)];
                                    }
                                    arg0.method284(var5, var58, var67, var89, var90, var92, var72, var73, var74, var75, method457(var80, var76), method457(var80, var77), method457(var80, var78), method457(var80, var79), this.method453(var94, var76), this.method453(var94, var77), this.method453(var94, var78), this.method453(var94, var79), var88, var93);
                                }
                            }
                        }
                    }
                }
            }
            for (int var59 = 1; var59 < this.field1306 - 1; var59++) {
                for (int var60 = 1; var60 < this.field1305 - 1; var60++) {
                    arg0.method283(var5, var60, var59, this.method458((byte) 5, var5, var60, var59));
                }
            }
        }
        if (arg1 != -126) {
            return;
        }
        arg0.method310(-50, -50, -10, false);
        for (int var6 = 0; var6 < this.field1305; var6++) {
            for (int var47 = 0; var47 < this.field1306; var47++) {
                if ((this.field1286[1][var6][var47] & 0x2) == 2) {
                    arg0.method281(var47, var6, (byte) 72);
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
                for (int var12 = 0; var12 <= this.field1306; var12++) {
                    for (int var13 = 0; var13 <= this.field1305; var13++) {
                        if ((this.field1300[var11][var13][var12] & var7) != 0) {
                            int var14 = var12;
                            int var15 = var12;
                            int var16 = var11;
                            int var17 = var11;
                            while (var14 > 0 && (this.field1300[var11][var13][var14 - 1] & var7) != 0) {
                                var14--;
                            }
                            while (var15 < this.field1306 && (this.field1300[var11][var13][var15 + 1] & var7) != 0) {
                                var15++;
                            }
                            label330: while (var16 > 0) {
                                for (int var18 = var14; var18 <= var15; var18++) {
                                    if ((this.field1300[var16 - 1][var13][var18] & var7) == 0) {
                                        break label330;
                                    }
                                }
                                var16--;
                            }
                            label319: while (var17 < var10) {
                                for (int var19 = var14; var19 <= var15; var19++) {
                                    if ((this.field1300[var17 + 1][var13][var19] & var7) == 0) {
                                        break label319;
                                    }
                                }
                                var17++;
                            }
                            int var20 = (var17 + 1 - var16) * (var15 - var14 + 1);
                            if (var20 >= 8) {
                                short var21 = 240;
                                int var22 = this.field1289[var17][var13][var14] - var21;
                                int var23 = this.field1289[var16][var13][var14];
                                class19.method282(var23, var22, false, var15 * 128 + 128, var13 * 128, 1, var13 * 128, var14 * 128, var10);
                                for (int var24 = var16; var24 <= var17; var24++) {
                                    for (int var25 = var14; var25 <= var15; var25++) {
                                        this.field1300[var24][var13][var25] &= ~var7;
                                    }
                                }
                            }
                        }
                        if ((this.field1300[var11][var13][var12] & var8) != 0) {
                            int var26 = var13;
                            int var27 = var13;
                            int var28 = var11;
                            int var29 = var11;
                            while (var26 > 0 && (this.field1300[var11][var26 - 1][var12] & var8) != 0) {
                                var26--;
                            }
                            while (var27 < this.field1305 && (this.field1300[var11][var27 + 1][var12] & var8) != 0) {
                                var27++;
                            }
                            label383: while (var28 > 0) {
                                for (int var30 = var26; var30 <= var27; var30++) {
                                    if ((this.field1300[var28 - 1][var30][var12] & var8) == 0) {
                                        break label383;
                                    }
                                }
                                var28--;
                            }
                            label372: while (var29 < var10) {
                                for (int var31 = var26; var31 <= var27; var31++) {
                                    if ((this.field1300[var29 + 1][var31][var12] & var8) == 0) {
                                        break label372;
                                    }
                                }
                                var29++;
                            }
                            int var32 = (var29 + 1 - var28) * (var27 - var26 + 1);
                            if (var32 >= 8) {
                                short var33 = 240;
                                int var34 = this.field1289[var29][var26][var12] - var33;
                                int var35 = this.field1289[var28][var26][var12];
                                class19.method282(var35, var34, false, var12 * 128, var26 * 128, 2, var27 * 128 + 128, var12 * 128, var10);
                                for (int var36 = var28; var36 <= var29; var36++) {
                                    for (int var37 = var26; var37 <= var27; var37++) {
                                        this.field1300[var36][var37][var12] &= ~var8;
                                    }
                                }
                            }
                        }
                        if ((this.field1300[var11][var13][var12] & var9) != 0) {
                            int var38 = var13;
                            int var39 = var13;
                            int var40 = var12;
                            int var41 = var12;
                            while (var40 > 0 && (this.field1300[var11][var13][var40 - 1] & var9) != 0) {
                                var40--;
                            }
                            while (var41 < this.field1306 && (this.field1300[var11][var13][var41 + 1] & var9) != 0) {
                                var41++;
                            }
                            label436: while (var38 > 0) {
                                for (int var42 = var40; var42 <= var41; var42++) {
                                    if ((this.field1300[var11][var38 - 1][var42] & var9) == 0) {
                                        break label436;
                                    }
                                }
                                var38--;
                            }
                            label425: while (var39 < this.field1305) {
                                for (int var43 = var40; var43 <= var41; var43++) {
                                    if ((this.field1300[var11][var39 + 1][var43] & var9) == 0) {
                                        break label425;
                                    }
                                }
                                var39++;
                            }
                            if ((var39 + 1 - var38) * (var41 - var40 + 1) >= 4) {
                                int var44 = this.field1289[var11][var38][var40];
                                class19.method282(var44, var44, false, var41 * 128 + 128, var38 * 128, 4, var39 * 128 + 128, var40 * 128, var10);
                                for (int var45 = var38; var45 <= var39; var45++) {
                                    for (int var46 = var40; var46 <= var41; var46++) {
                                        this.field1300[var11][var45][var46] &= ~var9;
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
