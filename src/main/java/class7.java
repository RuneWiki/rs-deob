import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!BXGEDAMF")
public class class7 {

    @OriginalMember(owner = "client!BXGEDAMF", name = "g", descriptor = "Z")
    private boolean field114 = false;

    @OriginalMember(owner = "client!BXGEDAMF", name = "z", descriptor = "I")
    private int field133 = 44107;

    @OriginalMember(owner = "client!BXGEDAMF", name = "E", descriptor = "B")
    private byte field138 = 0;

    @OriginalMember(owner = "client!BXGEDAMF", name = "c", descriptor = "I")
    private int field110;

    @OriginalMember(owner = "client!BXGEDAMF", name = "d", descriptor = "I")
    private int field111;

    @OriginalMember(owner = "client!BXGEDAMF", name = "G", descriptor = "[[[I")
    private int[][][] field140;

    @OriginalMember(owner = "client!BXGEDAMF", name = "h", descriptor = "[[[B")
    private byte[][][] field115;

    @OriginalMember(owner = "client!BXGEDAMF", name = "n", descriptor = "[[[B")
    private byte[][][] field121;

    @OriginalMember(owner = "client!BXGEDAMF", name = "r", descriptor = "[[[B")
    private byte[][][] field125;

    @OriginalMember(owner = "client!BXGEDAMF", name = "f", descriptor = "[[[B")
    private byte[][][] field113;

    @OriginalMember(owner = "client!BXGEDAMF", name = "m", descriptor = "[[[B")
    private byte[][][] field120;

    @OriginalMember(owner = "client!BXGEDAMF", name = "F", descriptor = "[[[I")
    private int[][][] field139;

    @OriginalMember(owner = "client!BXGEDAMF", name = "e", descriptor = "[[[B")
    private byte[][][] field112;

    @OriginalMember(owner = "client!BXGEDAMF", name = "q", descriptor = "[[I")
    private int[][] field124;

    @OriginalMember(owner = "client!BXGEDAMF", name = "u", descriptor = "[I")
    private int[] field128;

    @OriginalMember(owner = "client!BXGEDAMF", name = "v", descriptor = "[I")
    private int[] field129;

    @OriginalMember(owner = "client!BXGEDAMF", name = "w", descriptor = "[I")
    private int[] field130;

    @OriginalMember(owner = "client!BXGEDAMF", name = "x", descriptor = "[I")
    private int[] field131;

    @OriginalMember(owner = "client!BXGEDAMF", name = "y", descriptor = "[I")
    private int[] field132;

    @OriginalMember(owner = "client!BXGEDAMF", name = "a", descriptor = "[I")
    private static final int[] field108 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!BXGEDAMF", name = "b", descriptor = "I")
    public static int field109 = 99;

    @OriginalMember(owner = "client!BXGEDAMF", name = "i", descriptor = "[I")
    private static final int[] field116 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!BXGEDAMF", name = "j", descriptor = "I")
    private static int field117 = -30521;

    @OriginalMember(owner = "client!BXGEDAMF", name = "k", descriptor = "[I")
    private static final int[] field118 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!BXGEDAMF", name = "o", descriptor = "Z")
    public static boolean field122 = true;

    @OriginalMember(owner = "client!BXGEDAMF", name = "p", descriptor = "I")
    private static int field123 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!BXGEDAMF", name = "s", descriptor = "[I")
    private static final int[] field126 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!BXGEDAMF", name = "t", descriptor = "I")
    private static int field127 = -660;

    @OriginalMember(owner = "client!BXGEDAMF", name = "B", descriptor = "I")
    private static int field135 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!BXGEDAMF", name = "D", descriptor = "I")
    private static int field137 = 6;

    @OriginalMember(owner = "client!BXGEDAMF", name = "l", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!BXGEDAMF", name = "C", descriptor = "I")
    private static int field136;

    @OriginalMember(owner = "client!BXGEDAMF", name = "A", descriptor = "Z")
    private static boolean field134;

    @OriginalMember(owner = "client!BXGEDAMF", name = "a", descriptor = "(ILJPCEPCNA;LVDSFJUIR;IIIIII)V")
    private final void method12(int arg0, class30 arg1, class62 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (field122 && (this.field115[0][arg7][arg4] & 0x2) == 0) {
            if ((this.field115[arg6][arg7][arg4] & 0x10) != 0) {
                return;
            }
            if (this.method19(arg4, arg6, (byte) 65, arg7) != field119) {
                return;
            }
        }
        if (arg6 < field109) {
            field109 = arg6;
        }
        int var10 = this.field140[arg6][arg7][arg4];
        int var11 = this.field140[arg6][arg7 + 1][arg4];
        int var12 = 21 / arg8;
        int var13 = this.field140[arg6][arg7 + 1][arg4 + 1];
        int var14 = this.field140[arg6][arg7][arg4 + 1];
        int var15 = var10 + var11 + var13 + var14 >> 2;
        class55 var16 = class55.method499(arg0);
        int var17 = (arg0 << 14) + (arg4 << 7) + arg7 + 1073741824;
        if (!var16.field1511) {
            var17 += Integer.MIN_VALUE;
        }
        byte var18 = (byte) ((arg3 << 6) + arg5);
        if (arg5 == 22) {
            if (!field122 || var16.field1511 || var16.field1507) {
                class11 var19;
                if (var16.field1476 == -1 && var16.field1516 == null) {
                    var19 = var16.method496(22, arg3, var10, var11, var13, var14, -1);
                } else {
                    var19 = new class6(22, var14, arg0, 2, var16.field1476, var13, var11, var10, true, arg3);
                }
                arg1.method326(var18, arg7, var15, arg6, arg4, -6917, var19, var17);
                if (var16.field1503 && var16.field1511 && arg2 != null) {
                    arg2.method573(-803, arg7, arg4);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class11 var39;
            if (var16.field1476 == -1 && var16.field1516 == null) {
                var39 = var16.method496(10, arg3, var10, var11, var13, var14, -1);
            } else {
                var39 = new class6(10, var14, arg0, 2, var16.field1476, var13, var11, var10, true, arg3);
            }
            if (var39 != null) {
                int var40 = 0;
                if (arg5 == 11) {
                    var40 += 256;
                }
                int var41;
                int var42;
                if (arg3 == 1 || arg3 == 3) {
                    var41 = var16.field1515;
                    var42 = var16.field1469;
                } else {
                    var41 = var16.field1469;
                    var42 = var16.field1515;
                }
                if (arg1.method330(var15, var18, var41, arg4, var40, var17, arg6, var42, true, arg7, var39) && var16.field1467) {
                    class45 var43;
                    if (var39 instanceof class45) {
                        var43 = (class45) var39;
                    } else {
                        var43 = var16.method496(10, arg3, var10, var11, var13, var14, -1);
                    }
                    if (var43 != null) {
                        for (int var44 = 0; var44 <= var41; var44++) {
                            for (int var45 = 0; var45 <= var42; var45++) {
                                int var46 = var43.field1300 / 4;
                                if (var46 > 30) {
                                    var46 = 30;
                                }
                                if (var46 > this.field112[arg6][arg7 + var44][arg4 + var45]) {
                                    this.field112[arg6][arg7 + var44][arg4 + var45] = (byte) var46;
                                }
                            }
                        }
                    }
                }
            }
            if (var16.field1503 && arg2 != null) {
                arg2.method572(var16.field1469, arg3, arg7, var16.field1508, arg4, 0, var16.field1515);
            }
        } else if (arg5 >= 12) {
            class11 var20;
            if (var16.field1476 == -1 && var16.field1516 == null) {
                var20 = var16.method496(arg5, arg3, var10, var11, var13, var14, -1);
            } else {
                var20 = new class6(arg5, var14, arg0, 2, var16.field1476, var13, var11, var10, true, arg3);
            }
            arg1.method330(var15, var18, 1, arg4, 0, var17, arg6, 1, true, arg7, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg6 > 0) {
                this.field139[arg6][arg7][arg4] |= 0x924;
            }
            if (var16.field1503 && arg2 != null) {
                arg2.method572(var16.field1469, arg3, arg7, var16.field1508, arg4, 0, var16.field1515);
            }
        } else if (arg5 == 0) {
            class11 var21;
            if (var16.field1476 == -1 && var16.field1516 == null) {
                var21 = var16.method496(0, arg3, var10, var11, var13, var14, -1);
            } else {
                var21 = new class6(0, var14, arg0, 2, var16.field1476, var13, var11, var10, true, arg3);
            }
            arg1.method328(arg4, arg7, var15, null, field126[arg3], arg6, var18, var17, 0, var21, false);
            if (arg3 == 0) {
                if (var16.field1467) {
                    this.field112[arg6][arg7][arg4] = 50;
                    this.field112[arg6][arg7][arg4 + 1] = 50;
                }
                if (var16.field1485) {
                    this.field139[arg6][arg7][arg4] |= 0x249;
                }
            } else if (arg3 == 1) {
                if (var16.field1467) {
                    this.field112[arg6][arg7][arg4 + 1] = 50;
                    this.field112[arg6][arg7 + 1][arg4 + 1] = 50;
                }
                if (var16.field1485) {
                    this.field139[arg6][arg7][arg4 + 1] |= 0x492;
                }
            } else if (arg3 == 2) {
                if (var16.field1467) {
                    this.field112[arg6][arg7 + 1][arg4] = 50;
                    this.field112[arg6][arg7 + 1][arg4 + 1] = 50;
                }
                if (var16.field1485) {
                    this.field139[arg6][arg7 + 1][arg4] |= 0x249;
                }
            } else if (arg3 == 3) {
                if (var16.field1467) {
                    this.field112[arg6][arg7][arg4] = 50;
                    this.field112[arg6][arg7 + 1][arg4] = 50;
                }
                if (var16.field1485) {
                    this.field139[arg6][arg7][arg4] |= 0x492;
                }
            }
            if (var16.field1503 && arg2 != null) {
                arg2.method571(arg5, arg7, field136, arg3, var16.field1508, arg4);
            }
            if (var16.field1505 != 16) {
                arg1.method336(arg4, this.field138, arg7, var16.field1505, arg6);
            }
        } else if (arg5 == 1) {
            class11 var22;
            if (var16.field1476 == -1 && var16.field1516 == null) {
                var22 = var16.method496(1, arg3, var10, var11, var13, var14, -1);
            } else {
                var22 = new class6(1, var14, arg0, 2, var16.field1476, var13, var11, var10, true, arg3);
            }
            arg1.method328(arg4, arg7, var15, null, field116[arg3], arg6, var18, var17, 0, var22, false);
            if (var16.field1467) {
                if (arg3 == 0) {
                    this.field112[arg6][arg7][arg4 + 1] = 50;
                } else if (arg3 == 1) {
                    this.field112[arg6][arg7 + 1][arg4 + 1] = 50;
                } else if (arg3 == 2) {
                    this.field112[arg6][arg7 + 1][arg4] = 50;
                } else if (arg3 == 3) {
                    this.field112[arg6][arg7][arg4] = 50;
                }
            }
            if (var16.field1503 && arg2 != null) {
                arg2.method571(arg5, arg7, field136, arg3, var16.field1508, arg4);
            }
        } else if (arg5 == 2) {
            int var23 = arg3 + 1 & 0x3;
            class11 var24;
            class11 var25;
            if (var16.field1476 == -1 && var16.field1516 == null) {
                var24 = var16.method496(2, arg3 + 4, var10, var11, var13, var14, -1);
                var25 = var16.method496(2, var23, var10, var11, var13, var14, -1);
            } else {
                var24 = new class6(2, var14, arg0, 2, var16.field1476, var13, var11, var10, true, arg3 + 4);
                var25 = new class6(2, var14, arg0, 2, var16.field1476, var13, var11, var10, true, var23);
            }
            arg1.method328(arg4, arg7, var15, var25, field126[arg3], arg6, var18, var17, field126[var23], var24, false);
            if (var16.field1485) {
                if (arg3 == 0) {
                    this.field139[arg6][arg7][arg4] |= 0x249;
                    this.field139[arg6][arg7][arg4 + 1] |= 0x492;
                } else if (arg3 == 1) {
                    this.field139[arg6][arg7][arg4 + 1] |= 0x492;
                    this.field139[arg6][arg7 + 1][arg4] |= 0x249;
                } else if (arg3 == 2) {
                    this.field139[arg6][arg7 + 1][arg4] |= 0x249;
                    this.field139[arg6][arg7][arg4] |= 0x492;
                } else if (arg3 == 3) {
                    this.field139[arg6][arg7][arg4] |= 0x492;
                    this.field139[arg6][arg7][arg4] |= 0x249;
                }
            }
            if (var16.field1503 && arg2 != null) {
                arg2.method571(arg5, arg7, field136, arg3, var16.field1508, arg4);
            }
            if (var16.field1505 != 16) {
                arg1.method336(arg4, this.field138, arg7, var16.field1505, arg6);
            }
        } else if (arg5 == 3) {
            class11 var26;
            if (var16.field1476 == -1 && var16.field1516 == null) {
                var26 = var16.method496(3, arg3, var10, var11, var13, var14, -1);
            } else {
                var26 = new class6(3, var14, arg0, 2, var16.field1476, var13, var11, var10, true, arg3);
            }
            arg1.method328(arg4, arg7, var15, null, field116[arg3], arg6, var18, var17, 0, var26, false);
            if (var16.field1467) {
                if (arg3 == 0) {
                    this.field112[arg6][arg7][arg4 + 1] = 50;
                } else if (arg3 == 1) {
                    this.field112[arg6][arg7 + 1][arg4 + 1] = 50;
                } else if (arg3 == 2) {
                    this.field112[arg6][arg7 + 1][arg4] = 50;
                } else if (arg3 == 3) {
                    this.field112[arg6][arg7][arg4] = 50;
                }
            }
            if (var16.field1503 && arg2 != null) {
                arg2.method571(arg5, arg7, field136, arg3, var16.field1508, arg4);
            }
        } else if (arg5 == 9) {
            class11 var27;
            if (var16.field1476 == -1 && var16.field1516 == null) {
                var27 = var16.method496(arg5, arg3, var10, var11, var13, var14, -1);
            } else {
                var27 = new class6(arg5, var14, arg0, 2, var16.field1476, var13, var11, var10, true, arg3);
            }
            arg1.method330(var15, var18, 1, arg4, 0, var17, arg6, 1, true, arg7, var27);
            if (var16.field1503 && arg2 != null) {
                arg2.method572(var16.field1469, arg3, arg7, var16.field1508, arg4, 0, var16.field1515);
            }
        } else {
            if (var16.field1495) {
                if (arg3 == 1) {
                    int var28 = var14;
                    var14 = var13;
                    var13 = var11;
                    var11 = var10;
                    var10 = var28;
                } else if (arg3 == 2) {
                    int var29 = var14;
                    var14 = var11;
                    var11 = var29;
                    int var30 = var13;
                    var13 = var10;
                    var10 = var30;
                } else if (arg3 == 3) {
                    int var31 = var14;
                    var14 = var10;
                    var10 = var11;
                    var11 = var13;
                    var13 = var31;
                }
            }
            if (arg5 == 4) {
                class11 var32;
                if (var16.field1476 == -1 && var16.field1516 == null) {
                    var32 = var16.method496(4, 0, var10, var11, var13, var14, -1);
                } else {
                    var32 = new class6(4, var14, arg0, 2, var16.field1476, var13, var11, var10, true, 0);
                }
                arg1.method329(var18, var32, 0, var17, true, arg4, arg6, arg7, 0, field126[arg3], arg3 * 512, var15);
            } else if (arg5 == 5) {
                int var33 = 16;
                int var34 = arg1.method346(arg6, arg7, arg4);
                if (var34 > 0) {
                    var33 = class55.method499(var34 >> 14 & 0x7FFF).field1505;
                }
                class11 var35;
                if (var16.field1476 == -1 && var16.field1516 == null) {
                    var35 = var16.method496(4, 0, var10, var11, var13, var14, -1);
                } else {
                    var35 = new class6(4, var14, arg0, 2, var16.field1476, var13, var11, var10, true, 0);
                }
                arg1.method329(var18, var35, field118[arg3] * var33, var17, true, arg4, arg6, arg7, field108[arg3] * var33, field126[arg3], arg3 * 512, var15);
            } else if (arg5 == 6) {
                class11 var36;
                if (var16.field1476 == -1 && var16.field1516 == null) {
                    var36 = var16.method496(4, 0, var10, var11, var13, var14, -1);
                } else {
                    var36 = new class6(4, var14, arg0, 2, var16.field1476, var13, var11, var10, true, 0);
                }
                arg1.method329(var18, var36, 0, var17, true, arg4, arg6, arg7, 0, 256, arg3, var15);
            } else if (arg5 == 7) {
                class11 var37;
                if (var16.field1476 == -1 && var16.field1516 == null) {
                    var37 = var16.method496(4, 0, var10, var11, var13, var14, -1);
                } else {
                    var37 = new class6(4, var14, arg0, 2, var16.field1476, var13, var11, var10, true, 0);
                }
                arg1.method329(var18, var37, 0, var17, true, arg4, arg6, arg7, 0, 512, arg3, var15);
            } else if (arg5 == 8) {
                class11 var38;
                if (var16.field1476 == -1 && var16.field1516 == null) {
                    var38 = var16.method496(4, 0, var10, var11, var13, var14, -1);
                } else {
                    var38 = new class6(4, var14, arg0, 2, var16.field1476, var13, var11, var10, true, 0);
                }
                arg1.method329(var18, var38, 0, var17, true, arg4, arg6, arg7, 0, 768, arg3, var15);
            }
        }
    }

    @OriginalMember(owner = "client!BXGEDAMF", name = "a", descriptor = "(ZLTKPFKOXP;LFOFQGQZJ;)V")
    public static final void method13(boolean arg0, class59 arg1, class20 arg2) {
        int var3 = -1;
        if (!arg0) {
            field134 = !field134;
        }
        while (true) {
            int var4 = arg1.method543();
            if (var4 == 0) {
                return;
            }
            var3 += var4;
            class55 var5 = class55.method499(var3);
            var5.method504(arg2, true);
            while (true) {
                int var6 = arg1.method543();
                if (var6 == 0) {
                    break;
                }
                arg1.method529();
            }
        }
    }

    @OriginalMember(owner = "client!BXGEDAMF", name = "a", descriptor = "(ZI[BI)Z")
    public static final boolean method14(boolean arg0, int arg1, byte[] arg2, int arg3) {
        boolean var4 = true;
        class59 var5 = new class59(859, arg2);
        int var6 = -1;
        if (!arg0) {
            throw new NullPointerException();
        }
        label52: while (true) {
            int var7 = var5.method543();
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method543();
                    if (var11 == 0) {
                        continue label52;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = var5.method529() >> 2;
                    int var15 = arg3 + var13;
                    int var16 = arg1 + var12;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        class55 var17 = class55.method499(var6);
                        if (var14 != 22 || !field122 || var17.field1511 || var17.field1507) {
                            var4 &= var17.method498(field137);
                            var9 = true;
                        }
                    }
                }
                int var10 = var5.method543();
                if (var10 == 0) {
                    break;
                }
                var5.method529();
            }
        }
    }

    @OriginalMember(owner = "client!BXGEDAMF", name = "a", descriptor = "(II)I")
    private static final int method15(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!BXGEDAMF", name = "a", descriptor = "(IIIIIIILTKPFKOXP;)V")
    private final void method16(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class59 arg7) {
        if (arg3 != 9) {
            field134 = !field134;
        }
        if (arg6 < 0 || arg6 >= 104 || arg1 < 0 || arg1 >= 104) {
            while (true) {
                int var11 = arg7.method529();
                if (var11 == 0) {
                    return;
                }
                if (var11 == 1) {
                    arg7.method529();
                    return;
                }
                if (var11 <= 49) {
                    arg7.method529();
                }
            }
        }
        this.field115[arg0][arg6][arg1] = 0;
        while (true) {
            int var9 = arg7.method529();
            if (var9 == 0) {
                if (arg0 == 0) {
                    this.field140[0][arg6][arg1] = -method25(arg6 + arg5 + 932731, arg1 + 556238 + arg2) * 8;
                    return;
                } else {
                    this.field140[arg0][arg6][arg1] = this.field140[arg0 - 1][arg6][arg1] - 240;
                    return;
                }
            }
            if (var9 == 1) {
                int var10 = arg7.method529();
                if (var10 == 1) {
                    var10 = 0;
                }
                if (arg0 == 0) {
                    this.field140[0][arg6][arg1] = -var10 * 8;
                    return;
                }
                this.field140[arg0][arg6][arg1] = this.field140[arg0 - 1][arg6][arg1] - var10 * 8;
                return;
            }
            if (var9 <= 49) {
                this.field125[arg0][arg6][arg1] = arg7.method530();
                this.field113[arg0][arg6][arg1] = (byte) ((var9 - 2) / 4);
                this.field120[arg0][arg6][arg1] = (byte) (var9 + arg4 - 2 & 0x3);
            } else if (var9 <= 81) {
                this.field115[arg0][arg6][arg1] = (byte) (var9 - 49);
            } else {
                this.field121[arg0][arg6][arg1] = (byte) (var9 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!BXGEDAMF", name = "a", descriptor = "(IIII)I")
    private static final int method17(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class22.field842[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @OriginalMember(owner = "client!BXGEDAMF", name = "b", descriptor = "(II)I")
    private final int method18(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!BXGEDAMF", name = "a", descriptor = "(IIBI)I")
    public int method19(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != 65) {
            return 0;
        } else if ((this.field115[arg1][arg3][arg0] & 0x8) == 0) {
            return arg1 <= 0 || (this.field115[1][arg3][arg0] & 0x2) == 0 ? arg1 : arg1 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!BXGEDAMF", name = "a", descriptor = "(III)I")
    private static final int method20(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method28(var3, var5);
        int var8 = method28(var3 + 1, var5);
        int var9 = method28(var3, var5 + 1);
        int var10 = method28(var3 + 1, var5 + 1);
        int var11 = method17(var7, var8, var4, arg2);
        int var12 = method17(var9, var10, var4, arg2);
        return method17(var11, var12, var6, arg2);
    }

    @OriginalMember(owner = "client!BXGEDAMF", name = "<init>", descriptor = "([[[I[[[BIII)V")
    public class7(int[][][] arg0, byte[][][] arg1, int arg2, int arg3, int arg4) {
        field109 = 99;
        this.field110 = arg3;
        if (arg2 < 6 || arg2 > 6) {
            this.field114 = !this.field114;
        }
        this.field111 = arg4;
        this.field140 = arg0;
        this.field115 = arg1;
        this.field121 = new byte[4][this.field110][this.field111];
        this.field125 = new byte[4][this.field110][this.field111];
        this.field113 = new byte[4][this.field110][this.field111];
        this.field120 = new byte[4][this.field110][this.field111];
        this.field139 = new int[4][this.field110 + 1][this.field111 + 1];
        this.field112 = new byte[4][this.field110 + 1][this.field111 + 1];
        this.field124 = new int[this.field110 + 1][this.field111 + 1];
        this.field128 = new int[this.field111];
        this.field129 = new int[this.field111];
        this.field130 = new int[this.field111];
        this.field131 = new int[this.field111];
        this.field132 = new int[this.field111];
    }

    @OriginalMember(owner = "client!BXGEDAMF", name = "a", descriptor = "([LVDSFJUIR;LJPCEPCNA;Z)V")
    public final void method21(class62[] arg0, class30 arg1, boolean arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((this.field115[var4][var110][var111] & 0x1) == 1) {
                        int var112 = var4;
                        if ((this.field115[1][var110][var111] & 0x2) == 2) {
                            var112 = var4 - 1;
                        }
                        if (var112 >= 0) {
                            arg0[var112].method573(-803, var110, var111);
                        }
                    }
                }
            }
        }
        field135 += (int) (Math.random() * 5.0D) - 2;
        if (field135 < -8) {
            field135 = -8;
        }
        if (field135 > 8) {
            field135 = 8;
        }
        field123 += (int) (Math.random() * 5.0D) - 2;
        if (field123 < -16) {
            field123 = -16;
        }
        if (field123 > 16) {
            field123 = 16;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            byte[][] var48 = this.field112[var5];
            byte var49 = 96;
            short var50 = 768;
            byte var51 = -50;
            byte var52 = -10;
            byte var53 = -50;
            int var54 = (int) Math.sqrt((double) (var53 * var53 + var51 * var51 + var52 * var52));
            int var55 = var50 * var54 >> 8;
            for (int var56 = 1; var56 < this.field111 - 1; var56++) {
                for (int var101 = 1; var101 < this.field110 - 1; var101++) {
                    int var102 = this.field140[var5][var101 + 1][var56] - this.field140[var5][var101 - 1][var56];
                    int var103 = this.field140[var5][var101][var56 + 1] - this.field140[var5][var101][var56 - 1];
                    int var104 = (int) Math.sqrt((double) (var103 * var103 + var102 * var102 + 65536));
                    int var105 = (var102 << 8) / var104;
                    int var106 = 65536 / var104;
                    int var107 = (var103 << 8) / var104;
                    int var108 = (var53 * var107 + var51 * var105 + var52 * var106) / var55 + var49;
                    int var109 = (var48[var101][var56] >> 1) + (var48[var101][var56 + 1] >> 3) + (var48[var101][var56 - 1] >> 2) + (var48[var101 - 1][var56] >> 2) + (var48[var101 + 1][var56] >> 3);
                    this.field124[var101][var56] = var108 - var109;
                }
            }
            for (int var57 = 0; var57 < this.field111; var57++) {
                this.field128[var57] = 0;
                this.field129[var57] = 0;
                this.field130[var57] = 0;
                this.field131[var57] = 0;
                this.field132[var57] = 0;
            }
            for (int var58 = -5; var58 < this.field110 + 5; var58++) {
                for (int var61 = 0; var61 < this.field111; var61++) {
                    int var95 = var58 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < this.field110) {
                        int var96 = this.field121[var5][var95][var61] & 0xFF;
                        if (var96 > 0) {
                            class17 var97 = class17.field761[var96 - 1];
                            this.field128[var61] += var97.field770;
                            this.field129[var61] += var97.field768;
                            this.field130[var61] += var97.field769;
                            this.field131[var61] += var97.field771;
                            var10002 = this.field132[var61]++;
                        }
                    }
                    int var98 = var58 - 5;
                    if (var98 >= 0 && var98 < this.field110) {
                        int var99 = this.field121[var5][var98][var61] & 0xFF;
                        if (var99 > 0) {
                            class17 var100 = class17.field761[var99 - 1];
                            this.field128[var61] -= var100.field770;
                            this.field129[var61] -= var100.field768;
                            this.field130[var61] -= var100.field769;
                            this.field131[var61] -= var100.field771;
                            var10002 = this.field132[var61]--;
                        }
                    }
                }
                if (var58 >= 1 && var58 < this.field110 - 1) {
                    int var62 = 0;
                    int var63 = 0;
                    int var64 = 0;
                    int var65 = 0;
                    int var66 = 0;
                    for (int var67 = -5; var67 < this.field111 + 5; var67++) {
                        int var68 = var67 + 5;
                        if (var68 >= 0 && var68 < this.field111) {
                            var62 += this.field128[var68];
                            var63 += this.field129[var68];
                            var64 += this.field130[var68];
                            var65 += this.field131[var68];
                            var66 += this.field132[var68];
                        }
                        int var69 = var67 - 5;
                        if (var69 >= 0 && var69 < this.field111) {
                            var62 -= this.field128[var69];
                            var63 -= this.field129[var69];
                            var64 -= this.field130[var69];
                            var65 -= this.field131[var69];
                            var66 -= this.field132[var69];
                        }
                        if (var67 >= 1 && var67 < this.field111 - 1 && (!field122 || (this.field115[0][var58][var67] & 0x2) != 0 || (this.field115[var5][var58][var67] & 0x10) == 0 && this.method19(var67, var5, (byte) 65, var58) == field119)) {
                            if (var5 < field109) {
                                field109 = var5;
                            }
                            int var70 = this.field121[var5][var58][var67] & 0xFF;
                            int var71 = this.field125[var5][var58][var67] & 0xFF;
                            if (var70 > 0 || var71 > 0) {
                                int var72 = this.field140[var5][var58][var67];
                                int var73 = this.field140[var5][var58 + 1][var67];
                                int var74 = this.field140[var5][var58 + 1][var67 + 1];
                                int var75 = this.field140[var5][var58][var67 + 1];
                                int var76 = this.field124[var58][var67];
                                int var77 = this.field124[var58 + 1][var67];
                                int var78 = this.field124[var58 + 1][var67 + 1];
                                int var79 = this.field124[var58][var67 + 1];
                                int var80 = -1;
                                int var81 = -1;
                                if (var70 > 0) {
                                    int var82 = var62 * 256 / var65;
                                    int var83 = var63 / var66;
                                    int var84 = var64 / var66;
                                    var80 = this.method30(var82, var83, var84);
                                    int var85 = field135 + var82 & 0xFF;
                                    int var86 = field123 + var84;
                                    if (var86 < 0) {
                                        var86 = 0;
                                    } else if (var86 > 255) {
                                        var86 = 255;
                                    }
                                    var81 = this.method30(var85, var83, var86);
                                }
                                if (var5 > 0) {
                                    boolean var87 = true;
                                    if (var70 == 0 && this.field113[var5][var58][var67] != 0) {
                                        var87 = false;
                                    }
                                    if (var71 > 0 && !class17.field761[var71 - 1].field766) {
                                        var87 = false;
                                    }
                                    if (var87 && var72 == var73 && var72 == var74 && var72 == var75) {
                                        this.field139[var5][var58][var67] |= 0x924;
                                    }
                                }
                                int var88 = 0;
                                if (var80 != -1) {
                                    var88 = class22.field853[method15(var81, 96)];
                                }
                                if (var71 == 0) {
                                    arg1.method325(var5, var58, var67, 0, 0, -1, var72, var73, var74, var75, method15(var80, var76), method15(var80, var77), method15(var80, var78), method15(var80, var79), 0, 0, 0, 0, var88, 0);
                                } else {
                                    int var89 = this.field113[var5][var58][var67] + 1;
                                    byte var90 = this.field120[var5][var58][var67];
                                    class17 var91 = class17.field761[var71 - 1];
                                    int var92 = var91.field764;
                                    int var93;
                                    int var94;
                                    if (var92 >= 0) {
                                        var93 = class22.method232(var92, 862);
                                        var94 = -1;
                                    } else if (var91.field763 == 16711935) {
                                        var94 = -2;
                                        var92 = -1;
                                        var93 = class22.field853[this.method18(var91.field772, 96)];
                                    } else {
                                        var94 = this.method30(var91.field767, var91.field768, var91.field769);
                                        var93 = class22.field853[this.method18(var91.field772, 96)];
                                    }
                                    arg1.method325(var5, var58, var67, var89, var90, var92, var72, var73, var74, var75, method15(var80, var76), method15(var80, var77), method15(var80, var78), method15(var80, var79), this.method18(var94, var76), this.method18(var94, var77), this.method18(var94, var78), this.method18(var94, var79), var88, var93);
                                }
                            }
                        }
                    }
                }
            }
            for (int var59 = 1; var59 < this.field111 - 1; var59++) {
                for (int var60 = 1; var60 < this.field110 - 1; var60++) {
                    arg1.method324(var5, var60, var59, this.method19(var59, var5, (byte) 65, var60));
                }
            }
        }
        arg1.method351(-10, -50, (byte) 5, -50);
        for (int var6 = 0; var6 < this.field110; var6++) {
            for (int var47 = 0; var47 < this.field111; var47++) {
                if ((this.field115[1][var6][var47] & 0x2) == 2) {
                    arg1.method322(var6, 0, var47);
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
                for (int var12 = 0; var12 <= this.field111; var12++) {
                    for (int var13 = 0; var13 <= this.field110; var13++) {
                        if ((this.field139[var11][var13][var12] & var7) != 0) {
                            int var14 = var12;
                            int var15 = var12;
                            int var16 = var11;
                            int var17 = var11;
                            while (var14 > 0 && (this.field139[var11][var13][var14 - 1] & var7) != 0) {
                                var14--;
                            }
                            while (var15 < this.field111 && (this.field139[var11][var13][var15 + 1] & var7) != 0) {
                                var15++;
                            }
                            label330: while (var16 > 0) {
                                for (int var18 = var14; var18 <= var15; var18++) {
                                    if ((this.field139[var16 - 1][var13][var18] & var7) == 0) {
                                        break label330;
                                    }
                                }
                                var16--;
                            }
                            label319: while (var17 < var10) {
                                for (int var19 = var14; var19 <= var15; var19++) {
                                    if ((this.field139[var17 + 1][var13][var19] & var7) == 0) {
                                        break label319;
                                    }
                                }
                                var17++;
                            }
                            int var20 = (var17 + 1 - var16) * (var15 + 1 - var14);
                            if (var20 >= 8) {
                                short var21 = 240;
                                int var22 = this.field140[var17][var13][var14] - var21;
                                int var23 = this.field140[var16][var13][var14];
                                class30.method323(var14 * 128, -830, var13 * 128, var13 * 128, var22, var23, var15 * 128 + 128, 1, var10);
                                for (int var24 = var16; var24 <= var17; var24++) {
                                    for (int var25 = var14; var25 <= var15; var25++) {
                                        this.field139[var24][var13][var25] &= ~var7;
                                    }
                                }
                            }
                        }
                        if ((this.field139[var11][var13][var12] & var8) != 0) {
                            int var26 = var13;
                            int var27 = var13;
                            int var28 = var11;
                            int var29 = var11;
                            while (var26 > 0 && (this.field139[var11][var26 - 1][var12] & var8) != 0) {
                                var26--;
                            }
                            while (var27 < this.field110 && (this.field139[var11][var27 + 1][var12] & var8) != 0) {
                                var27++;
                            }
                            label383: while (var28 > 0) {
                                for (int var30 = var26; var30 <= var27; var30++) {
                                    if ((this.field139[var28 - 1][var30][var12] & var8) == 0) {
                                        break label383;
                                    }
                                }
                                var28--;
                            }
                            label372: while (var29 < var10) {
                                for (int var31 = var26; var31 <= var27; var31++) {
                                    if ((this.field139[var29 + 1][var31][var12] & var8) == 0) {
                                        break label372;
                                    }
                                }
                                var29++;
                            }
                            int var32 = (var29 + 1 - var28) * (var27 + 1 - var26);
                            if (var32 >= 8) {
                                short var33 = 240;
                                int var34 = this.field140[var29][var26][var12] - var33;
                                int var35 = this.field140[var28][var26][var12];
                                class30.method323(var12 * 128, -830, var26 * 128, var27 * 128 + 128, var34, var35, var12 * 128, 2, var10);
                                for (int var36 = var28; var36 <= var29; var36++) {
                                    for (int var37 = var26; var37 <= var27; var37++) {
                                        this.field139[var36][var37][var12] &= ~var8;
                                    }
                                }
                            }
                        }
                        if ((this.field139[var11][var13][var12] & var9) != 0) {
                            int var38 = var13;
                            int var39 = var13;
                            int var40 = var12;
                            int var41 = var12;
                            while (var40 > 0 && (this.field139[var11][var13][var40 - 1] & var9) != 0) {
                                var40--;
                            }
                            while (var41 < this.field111 && (this.field139[var11][var13][var41 + 1] & var9) != 0) {
                                var41++;
                            }
                            label436: while (var38 > 0) {
                                for (int var42 = var40; var42 <= var41; var42++) {
                                    if ((this.field139[var11][var38 - 1][var42] & var9) == 0) {
                                        break label436;
                                    }
                                }
                                var38--;
                            }
                            label425: while (var39 < this.field110) {
                                for (int var43 = var40; var43 <= var41; var43++) {
                                    if ((this.field139[var11][var39 + 1][var43] & var9) == 0) {
                                        break label425;
                                    }
                                }
                                var39++;
                            }
                            if ((var39 + 1 - var38) * (var41 + 1 - var40) >= 4) {
                                int var44 = this.field140[var11][var38][var40];
                                class30.method323(var40 * 128, -830, var38 * 128, var39 * 128 + 128, var44, var44, var41 * 128 + 128, 4, var10);
                                for (int var45 = var38; var45 <= var39; var45++) {
                                    for (int var46 = var40; var46 <= var41; var46++) {
                                        this.field139[var11][var45][var46] &= ~var9;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg2) {
            ;
        }
    }

    @OriginalMember(owner = "client!BXGEDAMF", name = "c", descriptor = "(II)I")
    private static final int method22(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!BXGEDAMF", name = "a", descriptor = "(I[BIII[LVDSFJUIR;I)V")
    public final void method23(int arg0, byte[] arg1, int arg2, int arg3, int arg4, class62[] arg5, int arg6) {
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    if (arg3 + var14 > 0 && arg3 + var14 < 103 && arg2 + var15 > 0 && arg2 + var15 < 103) {
                        arg5[var8].field1630[arg3 + var14][arg2 + var15] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class59 var9 = new class59(859, arg1);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var12 = 0; var12 < 64; var12++) {
                for (int var13 = 0; var13 < 64; var13++) {
                    this.method16(var10, arg2 + var13, arg0, 9, 0, arg4, arg3 + var12, var9);
                }
            }
        }
        if (arg6 < 4 || arg6 > 4) {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
    }

    @OriginalMember(owner = "client!BXGEDAMF", name = "a", descriptor = "(ILJPCEPCNA;IIIIII[LVDSFJUIR;I[B)V")
    public final void method24(int arg0, class30 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class62[] arg8, int arg9, byte[] arg10) {
        class59 var12 = new class59(859, arg10);
        int var13 = -1;
        if (arg3 != 0) {
            return;
        }
        while (true) {
            int var14 = var12.method543();
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method543();
                if (var16 == 0) {
                    break;
                }
                var15 += var16 - 1;
                int var17 = var15 & 0x3F;
                int var18 = var15 >> 6 & 0x3F;
                int var19 = var15 >> 12;
                int var20 = var12.method529();
                int var21 = var20 >> 2;
                int var22 = var20 & 0x3;
                if (arg4 == var19 && var18 >= arg0 && var18 < arg0 + 8 && var17 >= arg6 && var17 < arg6 + 8) {
                    class55 var23 = class55.method499(var13);
                    int var24 = arg5 + class46.method461(var17 & 0x7, var22, var23.field1515, var23.field1469, arg7, var18 & 0x7, false);
                    int var25 = arg2 + class46.method462(var23.field1515, var23.field1469, 731, arg7, var18 & 0x7, var22, var17 & 0x7);
                    if (var24 > 0 && var25 > 0 && var24 < 103 && var25 < 103) {
                        int var26 = arg9;
                        if ((this.field115[1][var24][var25] & 0x2) == 2) {
                            var26 = arg9 - 1;
                        }
                        class62 var27 = null;
                        if (var26 >= 0) {
                            var27 = arg8[var26];
                        }
                        this.method12(var13, arg1, var27, arg7 + var22 & 0x3, var25, var21, arg9, var24, 351);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!BXGEDAMF", name = "d", descriptor = "(II)I")
    private static final int method25(int arg0, int arg1) {
        int var2 = method20(arg0 + 45365, arg1 + 91923, 4) + (method20(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method20(arg0, arg1, 1) - 128 >> 2) - 128;
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @OriginalMember(owner = "client!BXGEDAMF", name = "a", descriptor = "(IIIII)V")
    public final void method26(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != -38997) {
            field127 = 102;
        }
        for (int var6 = arg3; var6 <= arg2 + arg3; var6++) {
            for (int var7 = arg0; var7 <= arg0 + arg4; var7++) {
                if (var7 >= 0 && var7 < this.field110 && var6 >= 0 && var6 < this.field111) {
                    this.field112[0][var7][var6] = 127;
                    if (arg0 == var7 && var7 > 0) {
                        this.field140[0][var7][var6] = this.field140[0][var7 - 1][var6];
                    }
                    if (arg0 + arg4 == var7 && var7 < this.field110 - 1) {
                        this.field140[0][var7][var6] = this.field140[0][var7 + 1][var6];
                    }
                    if (arg3 == var6 && var6 > 0) {
                        this.field140[0][var7][var6] = this.field140[0][var7][var6 - 1];
                    }
                    if (arg2 + arg3 == var6 && var6 < this.field111 - 1) {
                        this.field140[0][var7][var6] = this.field140[0][var7][var6 + 1];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!BXGEDAMF", name = "a", descriptor = "(BII)Z")
    public static final boolean method27(byte arg0, int arg1, int arg2) {
        class55 var3 = class55.method499(arg2);
        if (arg0 != -50) {
            field127 = -329;
        }
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var3.method505(field117, arg1);
    }

    @OriginalMember(owner = "client!BXGEDAMF", name = "e", descriptor = "(II)I")
    private static final int method28(int arg0, int arg1) {
        int var2 = method22(arg0 - 1, arg1 - 1) + method22(arg0 + 1, arg1 - 1) + method22(arg0 - 1, arg1 + 1) + method22(arg0 + 1, arg1 + 1);
        int var3 = method22(arg0 - 1, arg1) + method22(arg0 + 1, arg1) + method22(arg0, arg1 - 1) + method22(arg0, arg1 + 1);
        int var4 = method22(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @OriginalMember(owner = "client!BXGEDAMF", name = "a", descriptor = "([[[ILVDSFJUIR;IIILJPCEPCNA;IBIII)V")
    public static final void method29(int[][][] arg0, class62 arg1, int arg2, int arg3, int arg4, class30 arg5, int arg6, byte arg7, int arg8, int arg9, int arg10) {
        int var11 = arg0[arg8][arg6][arg2];
        int var12 = arg0[arg8][arg6 + 1][arg2];
        if (arg7 != 50) {
            return;
        }
        int var13 = arg0[arg8][arg6 + 1][arg2 + 1];
        int var14 = arg0[arg8][arg6][arg2 + 1];
        int var15 = var11 + var12 + var13 + var14 >> 2;
        class55 var16 = class55.method499(arg9);
        int var17 = (arg9 << 14) + (arg2 << 7) + arg6 + 1073741824;
        if (!var16.field1511) {
            var17 += Integer.MIN_VALUE;
        }
        byte var18 = (byte) ((arg3 << 6) + arg10);
        if (arg10 == 22) {
            class11 var19;
            if (var16.field1476 == -1 && var16.field1516 == null) {
                var19 = var16.method496(22, arg3, var11, var12, var13, var14, -1);
            } else {
                var19 = new class6(22, var14, arg9, 2, var16.field1476, var13, var12, var11, true, arg3);
            }
            arg5.method326(var18, arg6, var15, arg4, arg2, -6917, var19, var17);
            if (var16.field1503 && var16.field1511) {
                arg1.method573(-803, arg6, arg2);
            }
        } else if (arg10 == 10 || arg10 == 11) {
            class11 var39;
            if (var16.field1476 == -1 && var16.field1516 == null) {
                var39 = var16.method496(10, arg3, var11, var12, var13, var14, -1);
            } else {
                var39 = new class6(10, var14, arg9, 2, var16.field1476, var13, var12, var11, true, arg3);
            }
            if (var39 != null) {
                int var40 = 0;
                if (arg10 == 11) {
                    var40 += 256;
                }
                int var41;
                int var42;
                if (arg3 == 1 || arg3 == 3) {
                    var41 = var16.field1515;
                    var42 = var16.field1469;
                } else {
                    var41 = var16.field1469;
                    var42 = var16.field1515;
                }
                arg5.method330(var15, var18, var41, arg2, var40, var17, arg4, var42, true, arg6, var39);
            }
            if (var16.field1503) {
                arg1.method572(var16.field1469, arg3, arg6, var16.field1508, arg2, 0, var16.field1515);
            }
        } else if (arg10 >= 12) {
            class11 var20;
            if (var16.field1476 == -1 && var16.field1516 == null) {
                var20 = var16.method496(arg10, arg3, var11, var12, var13, var14, -1);
            } else {
                var20 = new class6(arg10, var14, arg9, 2, var16.field1476, var13, var12, var11, true, arg3);
            }
            arg5.method330(var15, var18, 1, arg2, 0, var17, arg4, 1, true, arg6, var20);
            if (var16.field1503) {
                arg1.method572(var16.field1469, arg3, arg6, var16.field1508, arg2, 0, var16.field1515);
            }
        } else if (arg10 == 0) {
            class11 var21;
            if (var16.field1476 == -1 && var16.field1516 == null) {
                var21 = var16.method496(0, arg3, var11, var12, var13, var14, -1);
            } else {
                var21 = new class6(0, var14, arg9, 2, var16.field1476, var13, var12, var11, true, arg3);
            }
            arg5.method328(arg2, arg6, var15, null, field126[arg3], arg4, var18, var17, 0, var21, false);
            if (var16.field1503) {
                arg1.method571(arg10, arg6, field136, arg3, var16.field1508, arg2);
            }
        } else if (arg10 == 1) {
            class11 var22;
            if (var16.field1476 == -1 && var16.field1516 == null) {
                var22 = var16.method496(1, arg3, var11, var12, var13, var14, -1);
            } else {
                var22 = new class6(1, var14, arg9, 2, var16.field1476, var13, var12, var11, true, arg3);
            }
            arg5.method328(arg2, arg6, var15, null, field116[arg3], arg4, var18, var17, 0, var22, false);
            if (var16.field1503) {
                arg1.method571(arg10, arg6, field136, arg3, var16.field1508, arg2);
            }
        } else if (arg10 == 2) {
            int var23 = arg3 + 1 & 0x3;
            class11 var24;
            class11 var25;
            if (var16.field1476 == -1 && var16.field1516 == null) {
                var24 = var16.method496(2, arg3 + 4, var11, var12, var13, var14, -1);
                var25 = var16.method496(2, var23, var11, var12, var13, var14, -1);
            } else {
                var24 = new class6(2, var14, arg9, 2, var16.field1476, var13, var12, var11, true, arg3 + 4);
                var25 = new class6(2, var14, arg9, 2, var16.field1476, var13, var12, var11, true, var23);
            }
            arg5.method328(arg2, arg6, var15, var25, field126[arg3], arg4, var18, var17, field126[var23], var24, false);
            if (var16.field1503) {
                arg1.method571(arg10, arg6, field136, arg3, var16.field1508, arg2);
            }
        } else if (arg10 == 3) {
            class11 var26;
            if (var16.field1476 == -1 && var16.field1516 == null) {
                var26 = var16.method496(3, arg3, var11, var12, var13, var14, -1);
            } else {
                var26 = new class6(3, var14, arg9, 2, var16.field1476, var13, var12, var11, true, arg3);
            }
            arg5.method328(arg2, arg6, var15, null, field116[arg3], arg4, var18, var17, 0, var26, false);
            if (var16.field1503) {
                arg1.method571(arg10, arg6, field136, arg3, var16.field1508, arg2);
            }
        } else if (arg10 == 9) {
            class11 var27;
            if (var16.field1476 == -1 && var16.field1516 == null) {
                var27 = var16.method496(arg10, arg3, var11, var12, var13, var14, -1);
            } else {
                var27 = new class6(arg10, var14, arg9, 2, var16.field1476, var13, var12, var11, true, arg3);
            }
            arg5.method330(var15, var18, 1, arg2, 0, var17, arg4, 1, true, arg6, var27);
            if (var16.field1503) {
                arg1.method572(var16.field1469, arg3, arg6, var16.field1508, arg2, 0, var16.field1515);
            }
        } else {
            if (var16.field1495) {
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
            if (arg10 == 4) {
                class11 var32;
                if (var16.field1476 == -1 && var16.field1516 == null) {
                    var32 = var16.method496(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var32 = new class6(4, var14, arg9, 2, var16.field1476, var13, var12, var11, true, 0);
                }
                arg5.method329(var18, var32, 0, var17, true, arg2, arg4, arg6, 0, field126[arg3], arg3 * 512, var15);
            } else if (arg10 == 5) {
                int var33 = 16;
                int var34 = arg5.method346(arg4, arg6, arg2);
                if (var34 > 0) {
                    var33 = class55.method499(var34 >> 14 & 0x7FFF).field1505;
                }
                class11 var35;
                if (var16.field1476 == -1 && var16.field1516 == null) {
                    var35 = var16.method496(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var35 = new class6(4, var14, arg9, 2, var16.field1476, var13, var12, var11, true, 0);
                }
                arg5.method329(var18, var35, field118[arg3] * var33, var17, true, arg2, arg4, arg6, field108[arg3] * var33, field126[arg3], arg3 * 512, var15);
            } else if (arg10 == 6) {
                class11 var36;
                if (var16.field1476 == -1 && var16.field1516 == null) {
                    var36 = var16.method496(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var36 = new class6(4, var14, arg9, 2, var16.field1476, var13, var12, var11, true, 0);
                }
                arg5.method329(var18, var36, 0, var17, true, arg2, arg4, arg6, 0, 256, arg3, var15);
            } else if (arg10 == 7) {
                class11 var37;
                if (var16.field1476 == -1 && var16.field1516 == null) {
                    var37 = var16.method496(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var37 = new class6(4, var14, arg9, 2, var16.field1476, var13, var12, var11, true, 0);
                }
                arg5.method329(var18, var37, 0, var17, true, arg2, arg4, arg6, 0, 512, arg3, var15);
            } else if (arg10 == 8) {
                class11 var38;
                if (var16.field1476 == -1 && var16.field1516 == null) {
                    var38 = var16.method496(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var38 = new class6(4, var14, arg9, 2, var16.field1476, var13, var12, var11, true, 0);
                }
                arg5.method329(var18, var38, 0, var17, true, arg2, arg4, arg6, 0, 768, arg3, var15);
            }
        }
    }

    @OriginalMember(owner = "client!BXGEDAMF", name = "b", descriptor = "(III)I")
    private final int method30(int arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "client!BXGEDAMF", name = "a", descriptor = "(III[BIIZI[LVDSFJUIR;I)V")
    public final void method31(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, boolean arg6, int arg7, class62[] arg8, int arg9) {
        for (int var11 = 0; var11 < 8; var11++) {
            for (int var16 = 0; var16 < 8; var16++) {
                if (arg4 + var11 > 0 && arg4 + var11 < 103 && arg0 + var16 > 0 && arg0 + var16 < 103) {
                    arg8[arg9].field1630[arg4 + var11][arg0 + var16] &= 0xFEFFFFFF;
                }
            }
        }
        if (!arg6) {
            this.field133 = 309;
        }
        class59 var12 = new class59(859, arg3);
        for (int var13 = 0; var13 < 4; var13++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    if (arg2 == var13 && var14 >= arg7 && var14 < arg7 + 8 && var15 >= arg5 && var15 < arg5 + 8) {
                        this.method16(arg9, arg0 + class46.method460(arg1, true, var14 & 0x7, var15 & 0x7), 0, 9, arg1, 0, arg4 + class46.method459((byte) -55, arg1, var15 & 0x7, var14 & 0x7), var12);
                    } else {
                        this.method16(0, -1, 0, 9, 0, 0, -1, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!BXGEDAMF", name = "a", descriptor = "([B[LVDSFJUIR;IILJPCEPCNA;I)V")
    public final void method32(byte[] arg0, class62[] arg1, int arg2, int arg3, class30 arg4, int arg5) {
        class59 var7 = new class59(859, arg0);
        int var8 = 47 / arg3;
        int var9 = -1;
        while (true) {
            int var10 = var7.method543();
            if (var10 == 0) {
                return;
            }
            var9 += var10;
            int var11 = 0;
            while (true) {
                int var12 = var7.method543();
                if (var12 == 0) {
                    break;
                }
                var11 += var12 - 1;
                int var13 = var11 & 0x3F;
                int var14 = var11 >> 6 & 0x3F;
                int var15 = var11 >> 12;
                int var16 = var7.method529();
                int var17 = var16 >> 2;
                int var18 = var16 & 0x3;
                int var19 = arg2 + var14;
                int var20 = arg5 + var13;
                if (var19 > 0 && var20 > 0 && var19 < 103 && var20 < 103) {
                    int var21 = var15;
                    if ((this.field115[1][var19][var20] & 0x2) == 2) {
                        var21 = var15 - 1;
                    }
                    class62 var22 = null;
                    if (var21 >= 0) {
                        var22 = arg1[var21];
                    }
                    this.method12(var9, arg4, var22, var18, var20, var17, var15, var19, 351);
                }
            }
        }
    }

    @OriginalMember(owner = "client!BXGEDAMF", name = "b", descriptor = "(IIII)V")
    public final void method33(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < 8; var5++) {
            for (int var9 = 0; var9 < 8; var9++) {
                this.field140[arg2][arg3 + var5][arg0 + var9] = 0;
            }
        }
        int var6 = 93 / arg1;
        if (arg3 > 0) {
            for (int var7 = 1; var7 < 8; var7++) {
                this.field140[arg2][arg3][arg0 + var7] = this.field140[arg2][arg3 - 1][arg0 + var7];
            }
        }
        if (arg0 > 0) {
            for (int var8 = 1; var8 < 8; var8++) {
                this.field140[arg2][arg3 + var8][arg0] = this.field140[arg2][arg3 + var8][arg0 - 1];
            }
        }
        if (arg3 > 0 && this.field140[arg2][arg3 - 1][arg0] != 0) {
            this.field140[arg2][arg3][arg0] = this.field140[arg2][arg3 - 1][arg0];
        } else if (arg0 > 0 && this.field140[arg2][arg3][arg0 - 1] != 0) {
            this.field140[arg2][arg3][arg0] = this.field140[arg2][arg3][arg0 - 1];
        } else if (arg3 > 0 && arg0 > 0 && this.field140[arg2][arg3 - 1][arg0 - 1] != 0) {
            this.field140[arg2][arg3][arg0] = this.field140[arg2][arg3 - 1][arg0 - 1];
        }
    }
}
