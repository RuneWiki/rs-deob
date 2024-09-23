import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("SMJSOFHG")
public class class54 {

    @OriginalMember(owner = "SMJSOFHG", name = "A", descriptor = "Z")
    private boolean field1536 = true;

    @OriginalMember(owner = "SMJSOFHG", name = "n", descriptor = "I")
    private int field1523;

    @OriginalMember(owner = "SMJSOFHG", name = "o", descriptor = "I")
    private int field1524;

    @OriginalMember(owner = "SMJSOFHG", name = "u", descriptor = "[[[I")
    private int[][][] field1530;

    @OriginalMember(owner = "SMJSOFHG", name = "h", descriptor = "[[[B")
    private byte[][][] field1517;

    @OriginalMember(owner = "SMJSOFHG", name = "q", descriptor = "[[[B")
    private byte[][][] field1526;

    @OriginalMember(owner = "SMJSOFHG", name = "a", descriptor = "[[[B")
    private byte[][][] field1510;

    @OriginalMember(owner = "SMJSOFHG", name = "z", descriptor = "[[[B")
    private byte[][][] field1535;

    @OriginalMember(owner = "SMJSOFHG", name = "i", descriptor = "[[[B")
    private byte[][][] field1518;

    @OriginalMember(owner = "SMJSOFHG", name = "y", descriptor = "[[[I")
    private int[][][] field1534;

    @OriginalMember(owner = "SMJSOFHG", name = "k", descriptor = "[[[B")
    private byte[][][] field1520;

    @OriginalMember(owner = "SMJSOFHG", name = "g", descriptor = "[[I")
    private int[][] field1516;

    @OriginalMember(owner = "SMJSOFHG", name = "b", descriptor = "[I")
    private int[] field1511;

    @OriginalMember(owner = "SMJSOFHG", name = "c", descriptor = "[I")
    private int[] field1512;

    @OriginalMember(owner = "SMJSOFHG", name = "d", descriptor = "[I")
    private int[] field1513;

    @OriginalMember(owner = "SMJSOFHG", name = "e", descriptor = "[I")
    private int[] field1514;

    @OriginalMember(owner = "SMJSOFHG", name = "f", descriptor = "[I")
    private int[] field1515;

    @OriginalMember(owner = "SMJSOFHG", name = "j", descriptor = "Z")
    private static boolean field1519 = true;

    @OriginalMember(owner = "SMJSOFHG", name = "l", descriptor = "I")
    private static int field1521 = -550;

    @OriginalMember(owner = "SMJSOFHG", name = "m", descriptor = "[I")
    private static final int[] field1522 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "SMJSOFHG", name = "p", descriptor = "Z")
    public static boolean field1525 = true;

    @OriginalMember(owner = "SMJSOFHG", name = "r", descriptor = "I")
    private static int field1527 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "SMJSOFHG", name = "s", descriptor = "I")
    private static int field1528 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "SMJSOFHG", name = "v", descriptor = "[I")
    private static final int[] field1531 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "SMJSOFHG", name = "w", descriptor = "[I")
    private static final int[] field1532 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "SMJSOFHG", name = "x", descriptor = "[I")
    private static final int[] field1533 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "SMJSOFHG", name = "t", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "SMJSOFHG", name = "a", descriptor = "(III)I")
    private static final int method490(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method504(var3, var5);
        int var8 = method504(var3 + 1, var5);
        int var9 = method504(var3, var5 + 1);
        int var10 = method504(var3 + 1, var5 + 1);
        int var11 = method494(var7, var8, var4, arg2);
        int var12 = method494(var9, var10, var4, arg2);
        return method494(var11, var12, var6, arg2);
    }

    @OriginalMember(owner = "SMJSOFHG", name = "a", descriptor = "(II[BZ)Z")
    public static final boolean method491(int arg0, int arg1, byte[] arg2, boolean arg3) {
        boolean var4 = true;
        if (arg3) {
            field1521 = -435;
        }
        class3 var5 = new class3(false, arg2);
        int var6 = -1;
        label54: while (true) {
            int var7 = var5.method29();
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method29();
                    if (var11 == 0) {
                        continue label54;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = var5.method15() >> 2;
                    int var15 = arg0 + var13;
                    int var16 = arg1 + var12;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        class32 var17 = class32.method401(var6);
                        if (var14 != 22 || !field1525 || var17.field1096 || var17.field1095) {
                            var4 &= var17.method405(5);
                            var9 = true;
                        }
                    }
                }
                int var10 = var5.method29();
                if (var10 == 0) {
                    break;
                }
                var5.method15();
            }
        }
    }

    @OriginalMember(owner = "SMJSOFHG", name = "a", descriptor = "(II)I")
    private static final int method492(int arg0, int arg1) {
        int var2 = method490(arg0 + 45365, arg1 + 91923, 4) + (method490(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method490(arg0, arg1, 1) - 128 >> 2) - 128;
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @OriginalMember(owner = "SMJSOFHG", name = "a", descriptor = "(LFHVZVKRA;ZLBJPWOXRJ;)V")
    public static final void method493(class9 arg0, boolean arg1, class3 arg2) {
        if (!arg1) {
            field1521 = 108;
        }
        int var3 = -1;
        while (true) {
            int var4 = arg2.method29();
            if (var4 == 0) {
                return;
            }
            var3 += var4;
            class32 var5 = class32.method401(var3);
            var5.method402(arg0, true);
            while (true) {
                int var6 = arg2.method29();
                if (var6 == 0) {
                    break;
                }
                arg2.method15();
            }
        }
    }

    @OriginalMember(owner = "SMJSOFHG", name = "a", descriptor = "(IIII)I")
    private static final int method494(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class12.field693[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @OriginalMember(owner = "SMJSOFHG", name = "b", descriptor = "(III)Z")
    public static final boolean method495(int arg0, int arg1, int arg2) {
        if (arg0 != -48173) {
            field1519 = !field1519;
        }
        class32 var3 = class32.method401(arg1);
        if (arg2 == 11) {
            arg2 = 10;
        }
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        return var3.method403(arg2, 822);
    }

    @OriginalMember(owner = "SMJSOFHG", name = "a", descriptor = "(I[BII[LHUQCCBIO;LHFOJZUJK;)V")
    public final void method496(int arg0, byte[] arg1, int arg2, int arg3, class21[] arg4, class17 arg5) {
        class3 var7 = new class3(false, arg1);
        int var8 = -1;
        if (arg3 >= 0) {
            return;
        }
        while (true) {
            int var9 = var7.method29();
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method29();
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = var10 & 0x3F;
                int var13 = var10 >> 6 & 0x3F;
                int var14 = var10 >> 12;
                int var15 = var7.method15();
                int var16 = var15 >> 2;
                int var17 = var15 & 0x3;
                int var18 = arg2 + var13;
                int var19 = arg0 + var12;
                if (var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) {
                    int var20 = var14;
                    if ((this.field1517[1][var18][var19] & 0x2) == 2) {
                        var20 = var14 - 1;
                    }
                    class21 var21 = null;
                    if (var20 >= 0) {
                        var21 = arg4[var20];
                    }
                    this.method498(var18, var8, false, var17, var14, var16, arg5, var19, var21);
                }
            }
        }
    }

    @OriginalMember(owner = "SMJSOFHG", name = "a", descriptor = "(ZIII)I")
    public int method497(boolean arg0, int arg1, int arg2, int arg3) {
        if (arg0) {
            return field1521;
        } else if ((this.field1517[arg3][arg1][arg2] & 0x8) == 0) {
            return arg3 <= 0 || (this.field1517[1][arg1][arg2] & 0x2) == 0 ? arg3 : arg3 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "SMJSOFHG", name = "a", descriptor = "(IIZIIILHFOJZUJK;ILHUQCCBIO;)V")
    private final void method498(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, class17 arg6, int arg7, class21 arg8) {
        if (field1525) {
            if ((this.field1517[arg4][arg0][arg7] & 0x10) != 0) {
                return;
            }
            if (this.method497(false, arg0, arg7, arg4) != field1529) {
                return;
            }
        }
        int var10 = this.field1530[arg4][arg0][arg7];
        int var11 = this.field1530[arg4][arg0 + 1][arg7];
        if (arg2) {
            return;
        }
        int var12 = this.field1530[arg4][arg0 + 1][arg7 + 1];
        int var13 = this.field1530[arg4][arg0][arg7 + 1];
        int var14 = var10 + var11 + var12 + var13 >> 2;
        class32 var15 = class32.method401(arg1);
        int var16 = (arg1 << 14) + (arg7 << 7) + arg0 + 1073741824;
        if (!var15.field1096) {
            var16 += Integer.MIN_VALUE;
        }
        byte var17 = (byte) ((arg3 << 6) + arg5);
        if (arg5 == 22) {
            if (!field1525 || var15.field1096 || var15.field1095) {
                class2 var18;
                if (var15.field1109 == -1 && var15.field1085 == null) {
                    var18 = var15.method406(22, arg3, var10, var11, var12, var13, -1);
                } else {
                    var18 = new class53(var10, var13, var15.field1109, 22, arg3, true, arg1, var11, var12, false);
                }
                arg6.method251(var17, var14, 708, var16, arg4, arg7, var18, arg0);
                if (var15.field1107 && var15.field1096 && arg8 != null) {
                    arg8.method302(arg0, (byte) 5, arg7);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class2 var38;
            if (var15.field1109 == -1 && var15.field1085 == null) {
                var38 = var15.method406(10, arg3, var10, var11, var12, var13, -1);
            } else {
                var38 = new class53(var10, var13, var15.field1109, 10, arg3, true, arg1, var11, var12, false);
            }
            if (var38 != null) {
                int var39 = 0;
                if (arg5 == 11) {
                    var39 += 256;
                }
                int var40;
                int var41;
                if (arg3 == 1 || arg3 == 3) {
                    var40 = var15.field1116;
                    var41 = var15.field1086;
                } else {
                    var40 = var15.field1086;
                    var41 = var15.field1116;
                }
                if (arg6.method255(var40, arg4, var38, var39, var14, arg0, var17, var16, arg7, true, var41) && var15.field1133) {
                    class26 var42;
                    if (var38 instanceof class26) {
                        var42 = (class26) var38;
                    } else {
                        var42 = var15.method406(10, arg3, var10, var11, var12, var13, -1);
                    }
                    if (var42 != null) {
                        for (int var43 = 0; var43 <= var40; var43++) {
                            for (int var44 = 0; var44 <= var41; var44++) {
                                int var45 = var42.field972 / 4;
                                if (var45 > 30) {
                                    var45 = 30;
                                }
                                if (var45 > this.field1520[arg4][arg0 + var43][arg7 + var44]) {
                                    this.field1520[arg4][arg0 + var43][arg7 + var44] = (byte) var45;
                                }
                            }
                        }
                    }
                }
            }
            if (var15.field1107 && arg8 != null) {
                arg8.method301(false, arg7, var15.field1086, var15.field1116, var15.field1108, arg3, arg0);
            }
        } else if (arg5 >= 12) {
            class2 var19;
            if (var15.field1109 == -1 && var15.field1085 == null) {
                var19 = var15.method406(arg5, arg3, var10, var11, var12, var13, -1);
            } else {
                var19 = new class53(var10, var13, var15.field1109, arg5, arg3, true, arg1, var11, var12, false);
            }
            arg6.method255(1, arg4, var19, 0, var14, arg0, var17, var16, arg7, true, 1);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg4 > 0) {
                this.field1534[arg4][arg0][arg7] |= 0x924;
            }
            if (var15.field1107 && arg8 != null) {
                arg8.method301(false, arg7, var15.field1086, var15.field1116, var15.field1108, arg3, arg0);
            }
        } else if (arg5 == 0) {
            class2 var20;
            if (var15.field1109 == -1 && var15.field1085 == null) {
                var20 = var15.method406(0, arg3, var10, var11, var12, var13, -1);
            } else {
                var20 = new class53(var10, var13, var15.field1109, 0, arg3, true, arg1, var11, var12, false);
            }
            arg6.method253(var20, var14, 1, var17, null, arg4, field1531[arg3], arg0, var16, arg7, 0);
            if (arg3 == 0) {
                if (var15.field1133) {
                    this.field1520[arg4][arg0][arg7] = 50;
                    this.field1520[arg4][arg0][arg7 + 1] = 50;
                }
                if (var15.field1119) {
                    this.field1534[arg4][arg0][arg7] |= 0x249;
                }
            } else if (arg3 == 1) {
                if (var15.field1133) {
                    this.field1520[arg4][arg0][arg7 + 1] = 50;
                    this.field1520[arg4][arg0 + 1][arg7 + 1] = 50;
                }
                if (var15.field1119) {
                    this.field1534[arg4][arg0][arg7 + 1] |= 0x492;
                }
            } else if (arg3 == 2) {
                if (var15.field1133) {
                    this.field1520[arg4][arg0 + 1][arg7] = 50;
                    this.field1520[arg4][arg0 + 1][arg7 + 1] = 50;
                }
                if (var15.field1119) {
                    this.field1534[arg4][arg0 + 1][arg7] |= 0x249;
                }
            } else if (arg3 == 3) {
                if (var15.field1133) {
                    this.field1520[arg4][arg0][arg7] = 50;
                    this.field1520[arg4][arg0 + 1][arg7] = 50;
                }
                if (var15.field1119) {
                    this.field1534[arg4][arg0][arg7] |= 0x492;
                }
            }
            if (var15.field1107 && arg8 != null) {
                arg8.method300(arg7, arg0, 4215, var15.field1108, arg3, arg5);
            }
            if (var15.field1129 != 16) {
                arg6.method261(arg0, 6, arg7, var15.field1129, arg4);
            }
        } else if (arg5 == 1) {
            class2 var21;
            if (var15.field1109 == -1 && var15.field1085 == null) {
                var21 = var15.method406(1, arg3, var10, var11, var12, var13, -1);
            } else {
                var21 = new class53(var10, var13, var15.field1109, 1, arg3, true, arg1, var11, var12, false);
            }
            arg6.method253(var21, var14, 1, var17, null, arg4, field1533[arg3], arg0, var16, arg7, 0);
            if (var15.field1133) {
                if (arg3 == 0) {
                    this.field1520[arg4][arg0][arg7 + 1] = 50;
                } else if (arg3 == 1) {
                    this.field1520[arg4][arg0 + 1][arg7 + 1] = 50;
                } else if (arg3 == 2) {
                    this.field1520[arg4][arg0 + 1][arg7] = 50;
                } else if (arg3 == 3) {
                    this.field1520[arg4][arg0][arg7] = 50;
                }
            }
            if (var15.field1107 && arg8 != null) {
                arg8.method300(arg7, arg0, 4215, var15.field1108, arg3, arg5);
            }
        } else if (arg5 == 2) {
            int var22 = arg3 + 1 & 0x3;
            class2 var23;
            class2 var24;
            if (var15.field1109 == -1 && var15.field1085 == null) {
                var23 = var15.method406(2, arg3 + 4, var10, var11, var12, var13, -1);
                var24 = var15.method406(2, var22, var10, var11, var12, var13, -1);
            } else {
                var23 = new class53(var10, var13, var15.field1109, 2, arg3 + 4, true, arg1, var11, var12, false);
                var24 = new class53(var10, var13, var15.field1109, 2, var22, true, arg1, var11, var12, false);
            }
            arg6.method253(var23, var14, 1, var17, var24, arg4, field1531[arg3], arg0, var16, arg7, field1531[var22]);
            if (var15.field1119) {
                if (arg3 == 0) {
                    this.field1534[arg4][arg0][arg7] |= 0x249;
                    this.field1534[arg4][arg0][arg7 + 1] |= 0x492;
                } else if (arg3 == 1) {
                    this.field1534[arg4][arg0][arg7 + 1] |= 0x492;
                    this.field1534[arg4][arg0 + 1][arg7] |= 0x249;
                } else if (arg3 == 2) {
                    this.field1534[arg4][arg0 + 1][arg7] |= 0x249;
                    this.field1534[arg4][arg0][arg7] |= 0x492;
                } else if (arg3 == 3) {
                    this.field1534[arg4][arg0][arg7] |= 0x492;
                    this.field1534[arg4][arg0][arg7] |= 0x249;
                }
            }
            if (var15.field1107 && arg8 != null) {
                arg8.method300(arg7, arg0, 4215, var15.field1108, arg3, arg5);
            }
            if (var15.field1129 != 16) {
                arg6.method261(arg0, 6, arg7, var15.field1129, arg4);
            }
        } else if (arg5 == 3) {
            class2 var25;
            if (var15.field1109 == -1 && var15.field1085 == null) {
                var25 = var15.method406(3, arg3, var10, var11, var12, var13, -1);
            } else {
                var25 = new class53(var10, var13, var15.field1109, 3, arg3, true, arg1, var11, var12, false);
            }
            arg6.method253(var25, var14, 1, var17, null, arg4, field1533[arg3], arg0, var16, arg7, 0);
            if (var15.field1133) {
                if (arg3 == 0) {
                    this.field1520[arg4][arg0][arg7 + 1] = 50;
                } else if (arg3 == 1) {
                    this.field1520[arg4][arg0 + 1][arg7 + 1] = 50;
                } else if (arg3 == 2) {
                    this.field1520[arg4][arg0 + 1][arg7] = 50;
                } else if (arg3 == 3) {
                    this.field1520[arg4][arg0][arg7] = 50;
                }
            }
            if (var15.field1107 && arg8 != null) {
                arg8.method300(arg7, arg0, 4215, var15.field1108, arg3, arg5);
            }
        } else if (arg5 == 9) {
            class2 var26;
            if (var15.field1109 == -1 && var15.field1085 == null) {
                var26 = var15.method406(arg5, arg3, var10, var11, var12, var13, -1);
            } else {
                var26 = new class53(var10, var13, var15.field1109, arg5, arg3, true, arg1, var11, var12, false);
            }
            arg6.method255(1, arg4, var26, 0, var14, arg0, var17, var16, arg7, true, 1);
            if (var15.field1107 && arg8 != null) {
                arg8.method301(false, arg7, var15.field1086, var15.field1116, var15.field1108, arg3, arg0);
            }
        } else {
            if (var15.field1089) {
                if (arg3 == 1) {
                    int var27 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var10;
                    var10 = var27;
                } else if (arg3 == 2) {
                    int var28 = var13;
                    var13 = var11;
                    var11 = var28;
                    int var29 = var12;
                    var12 = var10;
                    var10 = var29;
                } else if (arg3 == 3) {
                    int var30 = var13;
                    var13 = var10;
                    var10 = var11;
                    var11 = var12;
                    var12 = var30;
                }
            }
            if (arg5 == 4) {
                class2 var31;
                if (var15.field1109 == -1 && var15.field1085 == null) {
                    var31 = var15.method406(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var31 = new class53(var10, var13, var15.field1109, 4, 0, true, arg1, var11, var12, false);
                }
                arg6.method254(0, var17, arg7, var31, 0, var14, arg0, var16, arg3 * 512, field1531[arg3], true, arg4);
            } else if (arg5 == 5) {
                int var32 = 16;
                int var33 = arg6.method271(arg4, arg0, arg7);
                if (var33 > 0) {
                    var32 = class32.method401(var33 >> 14 & 0x7FFF).field1129;
                }
                class2 var34;
                if (var15.field1109 == -1 && var15.field1085 == null) {
                    var34 = var15.method406(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var34 = new class53(var10, var13, var15.field1109, 4, 0, true, arg1, var11, var12, false);
                }
                arg6.method254(field1522[arg3] * var32, var17, arg7, var34, field1532[arg3] * var32, var14, arg0, var16, arg3 * 512, field1531[arg3], true, arg4);
            } else if (arg5 == 6) {
                class2 var35;
                if (var15.field1109 == -1 && var15.field1085 == null) {
                    var35 = var15.method406(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var35 = new class53(var10, var13, var15.field1109, 4, 0, true, arg1, var11, var12, false);
                }
                arg6.method254(0, var17, arg7, var35, 0, var14, arg0, var16, arg3, 256, true, arg4);
            } else if (arg5 == 7) {
                class2 var36;
                if (var15.field1109 == -1 && var15.field1085 == null) {
                    var36 = var15.method406(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var36 = new class53(var10, var13, var15.field1109, 4, 0, true, arg1, var11, var12, false);
                }
                arg6.method254(0, var17, arg7, var36, 0, var14, arg0, var16, arg3, 512, true, arg4);
            } else if (arg5 == 8) {
                class2 var37;
                if (var15.field1109 == -1 && var15.field1085 == null) {
                    var37 = var15.method406(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var37 = new class53(var10, var13, var15.field1109, 4, 0, true, arg1, var11, var12, false);
                }
                arg6.method254(0, var17, arg7, var37, 0, var14, arg0, var16, arg3, 768, true, arg4);
            }
        }
    }

    @OriginalMember(owner = "SMJSOFHG", name = "b", descriptor = "(II)I")
    private static final int method499(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "SMJSOFHG", name = "c", descriptor = "(II)I")
    private final int method500(int arg0, int arg1) {
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

    @OriginalMember(owner = "SMJSOFHG", name = "c", descriptor = "(III)I")
    private final int method501(int arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "SMJSOFHG", name = "d", descriptor = "(II)I")
    private static final int method502(int arg0, int arg1) {
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

    @OriginalMember(owner = "SMJSOFHG", name = "a", descriptor = "(I[BIZII)V")
    public final void method503(int arg0, byte[] arg1, int arg2, boolean arg3, int arg4, int arg5) {
        class3 var7 = new class3(false, arg1);
        if (!arg3) {
            return;
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 64; var9++) {
                for (int var10 = 0; var10 < 64; var10++) {
                    int var11 = arg4 + var9;
                    int var12 = arg5 + var10;
                    if (var11 >= 0 && var11 < 104 && var12 >= 0 && var12 < 104) {
                        this.field1517[var8][var11][var12] = 0;
                        while (true) {
                            int var13 = var7.method15();
                            if (var13 == 0) {
                                if (var8 == 0) {
                                    this.field1530[0][var11][var12] = -method492(var11 + arg0 + 932731, var12 + 556238 + arg2) * 8;
                                } else {
                                    this.field1530[var8][var11][var12] = this.field1530[var8 - 1][var11][var12] - 240;
                                }
                                break;
                            }
                            if (var13 == 1) {
                                int var14 = var7.method15();
                                if (var14 == 1) {
                                    var14 = 0;
                                }
                                if (var8 == 0) {
                                    this.field1530[0][var11][var12] = -var14 * 8;
                                } else {
                                    this.field1530[var8][var11][var12] = this.field1530[var8 - 1][var11][var12] - var14 * 8;
                                }
                                break;
                            }
                            if (var13 <= 49) {
                                this.field1510[var8][var11][var12] = var7.method16();
                                this.field1535[var8][var11][var12] = (byte) ((var13 - 2) / 4);
                                this.field1518[var8][var11][var12] = (byte) (var13 - 2 & 0x3);
                            } else if (var13 <= 81) {
                                this.field1517[var8][var11][var12] = (byte) (var13 - 49);
                            } else {
                                this.field1526[var8][var11][var12] = (byte) (var13 - 81);
                            }
                        }
                    } else {
                        while (true) {
                            int var15 = var7.method15();
                            if (var15 == 0) {
                                break;
                            }
                            if (var15 == 1) {
                                var7.method15();
                                break;
                            }
                            if (var15 <= 49) {
                                var7.method15();
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "SMJSOFHG", name = "e", descriptor = "(II)I")
    private static final int method504(int arg0, int arg1) {
        int var2 = method499(arg0 - 1, arg1 - 1) + method499(arg0 + 1, arg1 - 1) + method499(arg0 - 1, arg1 + 1) + method499(arg0 + 1, arg1 + 1);
        int var3 = method499(arg0 - 1, arg1) + method499(arg0 + 1, arg1) + method499(arg0, arg1 - 1) + method499(arg0, arg1 + 1);
        int var4 = method499(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @OriginalMember(owner = "SMJSOFHG", name = "a", descriptor = "(IIILHUQCCBIO;IIIZ[[[ILHFOJZUJK;I)V")
    public static final void method505(int arg0, int arg1, int arg2, class21 arg3, int arg4, int arg5, int arg6, boolean arg7, int[][][] arg8, class17 arg9, int arg10) {
        int var11 = arg8[arg10][arg1][arg6];
        int var12 = arg8[arg10][arg1 + 1][arg6];
        int var13 = arg8[arg10][arg1 + 1][arg6 + 1];
        int var14 = arg8[arg10][arg1][arg6 + 1];
        int var15 = var11 + var12 + var13 + var14 >> 2;
        class32 var16 = class32.method401(arg4);
        int var17 = (arg4 << 14) + (arg6 << 7) + arg1 + 1073741824;
        if (!var16.field1096) {
            var17 += Integer.MIN_VALUE;
        }
        byte var18 = (byte) ((arg0 << 6) + arg2);
        if (arg7) {
            field1519 = !field1519;
        }
        if (arg2 == 22) {
            class2 var19;
            if (var16.field1109 == -1 && var16.field1085 == null) {
                var19 = var16.method406(22, arg0, var11, var12, var13, var14, -1);
            } else {
                var19 = new class53(var11, var14, var16.field1109, 22, arg0, true, arg4, var12, var13, false);
            }
            arg9.method251(var18, var15, 708, var17, arg5, arg6, var19, arg1);
            if (var16.field1107 && var16.field1096) {
                arg3.method302(arg1, (byte) 5, arg6);
            }
        } else if (arg2 == 10 || arg2 == 11) {
            class2 var39;
            if (var16.field1109 == -1 && var16.field1085 == null) {
                var39 = var16.method406(10, arg0, var11, var12, var13, var14, -1);
            } else {
                var39 = new class53(var11, var14, var16.field1109, 10, arg0, true, arg4, var12, var13, false);
            }
            if (var39 != null) {
                int var40 = 0;
                if (arg2 == 11) {
                    var40 += 256;
                }
                int var41;
                int var42;
                if (arg0 == 1 || arg0 == 3) {
                    var41 = var16.field1116;
                    var42 = var16.field1086;
                } else {
                    var41 = var16.field1086;
                    var42 = var16.field1116;
                }
                arg9.method255(var41, arg5, var39, var40, var15, arg1, var18, var17, arg6, true, var42);
            }
            if (var16.field1107) {
                arg3.method301(false, arg6, var16.field1086, var16.field1116, var16.field1108, arg0, arg1);
            }
        } else if (arg2 >= 12) {
            class2 var20;
            if (var16.field1109 == -1 && var16.field1085 == null) {
                var20 = var16.method406(arg2, arg0, var11, var12, var13, var14, -1);
            } else {
                var20 = new class53(var11, var14, var16.field1109, arg2, arg0, true, arg4, var12, var13, false);
            }
            arg9.method255(1, arg5, var20, 0, var15, arg1, var18, var17, arg6, true, 1);
            if (var16.field1107) {
                arg3.method301(false, arg6, var16.field1086, var16.field1116, var16.field1108, arg0, arg1);
            }
        } else if (arg2 == 0) {
            class2 var21;
            if (var16.field1109 == -1 && var16.field1085 == null) {
                var21 = var16.method406(0, arg0, var11, var12, var13, var14, -1);
            } else {
                var21 = new class53(var11, var14, var16.field1109, 0, arg0, true, arg4, var12, var13, false);
            }
            arg9.method253(var21, var15, 1, var18, null, arg5, field1531[arg0], arg1, var17, arg6, 0);
            if (var16.field1107) {
                arg3.method300(arg6, arg1, 4215, var16.field1108, arg0, arg2);
            }
        } else if (arg2 == 1) {
            class2 var22;
            if (var16.field1109 == -1 && var16.field1085 == null) {
                var22 = var16.method406(1, arg0, var11, var12, var13, var14, -1);
            } else {
                var22 = new class53(var11, var14, var16.field1109, 1, arg0, true, arg4, var12, var13, false);
            }
            arg9.method253(var22, var15, 1, var18, null, arg5, field1533[arg0], arg1, var17, arg6, 0);
            if (var16.field1107) {
                arg3.method300(arg6, arg1, 4215, var16.field1108, arg0, arg2);
            }
        } else if (arg2 == 2) {
            int var23 = arg0 + 1 & 0x3;
            class2 var24;
            class2 var25;
            if (var16.field1109 == -1 && var16.field1085 == null) {
                var24 = var16.method406(2, arg0 + 4, var11, var12, var13, var14, -1);
                var25 = var16.method406(2, var23, var11, var12, var13, var14, -1);
            } else {
                var24 = new class53(var11, var14, var16.field1109, 2, arg0 + 4, true, arg4, var12, var13, false);
                var25 = new class53(var11, var14, var16.field1109, 2, var23, true, arg4, var12, var13, false);
            }
            arg9.method253(var24, var15, 1, var18, var25, arg5, field1531[arg0], arg1, var17, arg6, field1531[var23]);
            if (var16.field1107) {
                arg3.method300(arg6, arg1, 4215, var16.field1108, arg0, arg2);
            }
        } else if (arg2 == 3) {
            class2 var26;
            if (var16.field1109 == -1 && var16.field1085 == null) {
                var26 = var16.method406(3, arg0, var11, var12, var13, var14, -1);
            } else {
                var26 = new class53(var11, var14, var16.field1109, 3, arg0, true, arg4, var12, var13, false);
            }
            arg9.method253(var26, var15, 1, var18, null, arg5, field1533[arg0], arg1, var17, arg6, 0);
            if (var16.field1107) {
                arg3.method300(arg6, arg1, 4215, var16.field1108, arg0, arg2);
            }
        } else if (arg2 == 9) {
            class2 var27;
            if (var16.field1109 == -1 && var16.field1085 == null) {
                var27 = var16.method406(arg2, arg0, var11, var12, var13, var14, -1);
            } else {
                var27 = new class53(var11, var14, var16.field1109, arg2, arg0, true, arg4, var12, var13, false);
            }
            arg9.method255(1, arg5, var27, 0, var15, arg1, var18, var17, arg6, true, 1);
            if (var16.field1107) {
                arg3.method301(false, arg6, var16.field1086, var16.field1116, var16.field1108, arg0, arg1);
            }
        } else {
            if (var16.field1089) {
                if (arg0 == 1) {
                    int var28 = var14;
                    var14 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var28;
                } else if (arg0 == 2) {
                    int var29 = var14;
                    var14 = var12;
                    var12 = var29;
                    int var30 = var13;
                    var13 = var11;
                    var11 = var30;
                } else if (arg0 == 3) {
                    int var31 = var14;
                    var14 = var11;
                    var11 = var12;
                    var12 = var13;
                    var13 = var31;
                }
            }
            if (arg2 == 4) {
                class2 var32;
                if (var16.field1109 == -1 && var16.field1085 == null) {
                    var32 = var16.method406(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var32 = new class53(var11, var14, var16.field1109, 4, 0, true, arg4, var12, var13, false);
                }
                arg9.method254(0, var18, arg6, var32, 0, var15, arg1, var17, arg0 * 512, field1531[arg0], true, arg5);
            } else if (arg2 == 5) {
                int var33 = 16;
                int var34 = arg9.method271(arg5, arg1, arg6);
                if (var34 > 0) {
                    var33 = class32.method401(var34 >> 14 & 0x7FFF).field1129;
                }
                class2 var35;
                if (var16.field1109 == -1 && var16.field1085 == null) {
                    var35 = var16.method406(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var35 = new class53(var11, var14, var16.field1109, 4, 0, true, arg4, var12, var13, false);
                }
                arg9.method254(field1522[arg0] * var33, var18, arg6, var35, field1532[arg0] * var33, var15, arg1, var17, arg0 * 512, field1531[arg0], true, arg5);
            } else if (arg2 == 6) {
                class2 var36;
                if (var16.field1109 == -1 && var16.field1085 == null) {
                    var36 = var16.method406(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var36 = new class53(var11, var14, var16.field1109, 4, 0, true, arg4, var12, var13, false);
                }
                arg9.method254(0, var18, arg6, var36, 0, var15, arg1, var17, arg0, 256, true, arg5);
            } else if (arg2 == 7) {
                class2 var37;
                if (var16.field1109 == -1 && var16.field1085 == null) {
                    var37 = var16.method406(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var37 = new class53(var11, var14, var16.field1109, 4, 0, true, arg4, var12, var13, false);
                }
                arg9.method254(0, var18, arg6, var37, 0, var15, arg1, var17, arg0, 512, true, arg5);
            } else if (arg2 == 8) {
                class2 var38;
                if (var16.field1109 == -1 && var16.field1085 == null) {
                    var38 = var16.method406(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var38 = new class53(var11, var14, var16.field1109, 4, 0, true, arg4, var12, var13, false);
                }
                arg9.method254(0, var18, arg6, var38, 0, var15, arg1, var17, arg0, 768, true, arg5);
            }
        }
    }

    @OriginalMember(owner = "SMJSOFHG", name = "a", descriptor = "(LHFOJZUJK;I[LHUQCCBIO;)V")
    public final void method506(class17 arg0, int arg1, class21[] arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((this.field1517[var4][var110][var111] & 0x1) == 1) {
                        int var112 = var4;
                        if ((this.field1517[1][var110][var111] & 0x2) == 2) {
                            var112 = var4 - 1;
                        }
                        if (var112 >= 0) {
                            arg2[var112].method302(var110, (byte) 5, var111);
                        }
                    }
                }
            }
        }
        field1528 += (int) (Math.random() * 5.0D) - 2;
        if (arg1 < 3 || arg1 > 3) {
            this.field1536 = !this.field1536;
        }
        if (field1528 < -8) {
            field1528 = -8;
        }
        if (field1528 > 8) {
            field1528 = 8;
        }
        field1527 += (int) (Math.random() * 5.0D) - 2;
        if (field1527 < -16) {
            field1527 = -16;
        }
        if (field1527 > 16) {
            field1527 = 16;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            byte[][] var48 = this.field1520[var5];
            byte var49 = 96;
            short var50 = 768;
            byte var51 = -50;
            byte var52 = -10;
            byte var53 = -50;
            int var54 = (int) Math.sqrt((double) (var53 * var53 + var51 * var51 + var52 * var52));
            int var55 = var50 * var54 >> 8;
            for (int var56 = 1; var56 < this.field1524 - 1; var56++) {
                for (int var101 = 1; var101 < this.field1523 - 1; var101++) {
                    int var102 = this.field1530[var5][var101 + 1][var56] - this.field1530[var5][var101 - 1][var56];
                    int var103 = this.field1530[var5][var101][var56 + 1] - this.field1530[var5][var101][var56 - 1];
                    int var104 = (int) Math.sqrt((double) (var103 * var103 + var102 * var102 + 65536));
                    int var105 = (var102 << 8) / var104;
                    int var106 = 65536 / var104;
                    int var107 = (var103 << 8) / var104;
                    int var108 = (var53 * var107 + var51 * var105 + var52 * var106) / var55 + var49;
                    int var109 = (var48[var101][var56] >> 1) + (var48[var101][var56 + 1] >> 3) + (var48[var101][var56 - 1] >> 2) + (var48[var101 - 1][var56] >> 2) + (var48[var101 + 1][var56] >> 3);
                    this.field1516[var101][var56] = var108 - var109;
                }
            }
            for (int var57 = 0; var57 < this.field1524; var57++) {
                this.field1511[var57] = 0;
                this.field1512[var57] = 0;
                this.field1513[var57] = 0;
                this.field1514[var57] = 0;
                this.field1515[var57] = 0;
            }
            for (int var58 = -5; var58 < this.field1523 + 5; var58++) {
                for (int var61 = 0; var61 < this.field1524; var61++) {
                    int var95 = var58 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < this.field1523) {
                        int var96 = this.field1526[var5][var95][var61] & 0xFF;
                        if (var96 > 0) {
                            class28 var97 = class28.field1032[var96 - 1];
                            this.field1511[var61] += var97.field1041;
                            this.field1512[var61] += var97.field1039;
                            this.field1513[var61] += var97.field1040;
                            this.field1514[var61] += var97.field1042;
                            var10002 = this.field1515[var61]++;
                        }
                    }
                    int var98 = var58 - 5;
                    if (var98 >= 0 && var98 < this.field1523) {
                        int var99 = this.field1526[var5][var98][var61] & 0xFF;
                        if (var99 > 0) {
                            class28 var100 = class28.field1032[var99 - 1];
                            this.field1511[var61] -= var100.field1041;
                            this.field1512[var61] -= var100.field1039;
                            this.field1513[var61] -= var100.field1040;
                            this.field1514[var61] -= var100.field1042;
                            var10002 = this.field1515[var61]--;
                        }
                    }
                }
                if (var58 >= 1 && var58 < this.field1523 - 1) {
                    int var62 = 0;
                    int var63 = 0;
                    int var64 = 0;
                    int var65 = 0;
                    int var66 = 0;
                    for (int var67 = -5; var67 < this.field1524 + 5; var67++) {
                        int var68 = var67 + 5;
                        if (var68 >= 0 && var68 < this.field1524) {
                            var62 += this.field1511[var68];
                            var63 += this.field1512[var68];
                            var64 += this.field1513[var68];
                            var65 += this.field1514[var68];
                            var66 += this.field1515[var68];
                        }
                        int var69 = var67 - 5;
                        if (var69 >= 0 && var69 < this.field1524) {
                            var62 -= this.field1511[var69];
                            var63 -= this.field1512[var69];
                            var64 -= this.field1513[var69];
                            var65 -= this.field1514[var69];
                            var66 -= this.field1515[var69];
                        }
                        if (var67 >= 1 && var67 < this.field1524 - 1 && (!field1525 || (this.field1517[var5][var58][var67] & 0x10) == 0 && this.method497(false, var58, var67, var5) == field1529)) {
                            int var70 = this.field1526[var5][var58][var67] & 0xFF;
                            int var71 = this.field1510[var5][var58][var67] & 0xFF;
                            if (var70 > 0 || var71 > 0) {
                                int var72 = this.field1530[var5][var58][var67];
                                int var73 = this.field1530[var5][var58 + 1][var67];
                                int var74 = this.field1530[var5][var58 + 1][var67 + 1];
                                int var75 = this.field1530[var5][var58][var67 + 1];
                                int var76 = this.field1516[var58][var67];
                                int var77 = this.field1516[var58 + 1][var67];
                                int var78 = this.field1516[var58 + 1][var67 + 1];
                                int var79 = this.field1516[var58][var67 + 1];
                                int var80 = -1;
                                int var81 = -1;
                                if (var70 > 0) {
                                    int var82 = var62 * 256 / var65;
                                    int var83 = var63 / var66;
                                    int var84 = var64 / var66;
                                    var80 = this.method501(var82, var83, var84);
                                    int var85 = field1528 + var82 & 0xFF;
                                    int var86 = field1527 + var84;
                                    if (var86 < 0) {
                                        var86 = 0;
                                    } else if (var86 > 255) {
                                        var86 = 255;
                                    }
                                    var81 = this.method501(var85, var83, var86);
                                }
                                if (var5 > 0) {
                                    boolean var87 = true;
                                    if (var70 == 0 && this.field1535[var5][var58][var67] != 0) {
                                        var87 = false;
                                    }
                                    if (var71 > 0 && !class28.field1032[var71 - 1].field1037) {
                                        var87 = false;
                                    }
                                    if (var87 && var72 == var73 && var72 == var74 && var72 == var75) {
                                        this.field1534[var5][var58][var67] |= 0x924;
                                    }
                                }
                                int var88 = 0;
                                if (var80 != -1) {
                                    var88 = class12.field704[method502(var81, 96)];
                                }
                                if (var71 == 0) {
                                    arg0.method250(var5, var58, var67, 0, 0, -1, var72, var73, var74, var75, method502(var80, var76), method502(var80, var77), method502(var80, var78), method502(var80, var79), 0, 0, 0, 0, var88, 0);
                                } else {
                                    int var89 = this.field1535[var5][var58][var67] + 1;
                                    byte var90 = this.field1518[var5][var58][var67];
                                    class28 var91 = class28.field1032[var71 - 1];
                                    int var92 = var91.field1035;
                                    int var93;
                                    int var94;
                                    if (var92 >= 0) {
                                        var93 = class12.method212(var92, -21641);
                                        var94 = -1;
                                    } else if (var91.field1034 == 16711935) {
                                        var93 = 0;
                                        var94 = -2;
                                        var92 = -1;
                                    } else {
                                        var94 = this.method501(var91.field1038, var91.field1039, var91.field1040);
                                        var93 = class12.field704[this.method500(var91.field1043, 96)];
                                    }
                                    arg0.method250(var5, var58, var67, var89, var90, var92, var72, var73, var74, var75, method502(var80, var76), method502(var80, var77), method502(var80, var78), method502(var80, var79), this.method500(var94, var76), this.method500(var94, var77), this.method500(var94, var78), this.method500(var94, var79), var88, var93);
                                }
                            }
                        }
                    }
                }
            }
            for (int var59 = 1; var59 < this.field1524 - 1; var59++) {
                for (int var60 = 1; var60 < this.field1523 - 1; var60++) {
                    arg0.method249(var5, var60, var59, this.method497(false, var60, var59, var5));
                }
            }
        }
        arg0.method276(-10, -50, -50, 64, 768, 95);
        for (int var6 = 0; var6 < this.field1523; var6++) {
            for (int var47 = 0; var47 < this.field1524; var47++) {
                if ((this.field1517[1][var6][var47] & 0x2) == 2) {
                    arg0.method247(var47, var6, (byte) 36);
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
                for (int var12 = 0; var12 <= this.field1524; var12++) {
                    for (int var13 = 0; var13 <= this.field1523; var13++) {
                        if ((this.field1534[var11][var13][var12] & var7) != 0) {
                            int var14 = var12;
                            int var15 = var12;
                            int var16 = var11;
                            int var17 = var11;
                            while (var14 > 0 && (this.field1534[var11][var13][var14 - 1] & var7) != 0) {
                                var14--;
                            }
                            while (var15 < this.field1524 && (this.field1534[var11][var13][var15 + 1] & var7) != 0) {
                                var15++;
                            }
                            label330: while (var16 > 0) {
                                for (int var18 = var14; var18 <= var15; var18++) {
                                    if ((this.field1534[var16 - 1][var13][var18] & var7) == 0) {
                                        break label330;
                                    }
                                }
                                var16--;
                            }
                            label319: while (var17 < var10) {
                                for (int var19 = var14; var19 <= var15; var19++) {
                                    if ((this.field1534[var17 + 1][var13][var19] & var7) == 0) {
                                        break label319;
                                    }
                                }
                                var17++;
                            }
                            int var20 = (var17 + 1 - var16) * (var15 + 1 - var14);
                            if (var20 >= 8) {
                                short var21 = 240;
                                int var22 = this.field1530[var17][var13][var14] - var21;
                                int var23 = this.field1530[var16][var13][var14];
                                class17.method248(var23, 1, var10, var13 * 128, var14 * 128, var15 * 128 + 128, var13 * 128, var22, 338);
                                for (int var24 = var16; var24 <= var17; var24++) {
                                    for (int var25 = var14; var25 <= var15; var25++) {
                                        this.field1534[var24][var13][var25] &= ~var7;
                                    }
                                }
                            }
                        }
                        if ((this.field1534[var11][var13][var12] & var8) != 0) {
                            int var26 = var13;
                            int var27 = var13;
                            int var28 = var11;
                            int var29 = var11;
                            while (var26 > 0 && (this.field1534[var11][var26 - 1][var12] & var8) != 0) {
                                var26--;
                            }
                            while (var27 < this.field1523 && (this.field1534[var11][var27 + 1][var12] & var8) != 0) {
                                var27++;
                            }
                            label383: while (var28 > 0) {
                                for (int var30 = var26; var30 <= var27; var30++) {
                                    if ((this.field1534[var28 - 1][var30][var12] & var8) == 0) {
                                        break label383;
                                    }
                                }
                                var28--;
                            }
                            label372: while (var29 < var10) {
                                for (int var31 = var26; var31 <= var27; var31++) {
                                    if ((this.field1534[var29 + 1][var31][var12] & var8) == 0) {
                                        break label372;
                                    }
                                }
                                var29++;
                            }
                            int var32 = (var29 + 1 - var28) * (var27 + 1 - var26);
                            if (var32 >= 8) {
                                short var33 = 240;
                                int var34 = this.field1530[var29][var26][var12] - var33;
                                int var35 = this.field1530[var28][var26][var12];
                                class17.method248(var35, 2, var10, var26 * 128, var12 * 128, var12 * 128, var27 * 128 + 128, var34, 338);
                                for (int var36 = var28; var36 <= var29; var36++) {
                                    for (int var37 = var26; var37 <= var27; var37++) {
                                        this.field1534[var36][var37][var12] &= ~var8;
                                    }
                                }
                            }
                        }
                        if ((this.field1534[var11][var13][var12] & var9) != 0) {
                            int var38 = var13;
                            int var39 = var13;
                            int var40 = var12;
                            int var41 = var12;
                            while (var40 > 0 && (this.field1534[var11][var13][var40 - 1] & var9) != 0) {
                                var40--;
                            }
                            while (var41 < this.field1524 && (this.field1534[var11][var13][var41 + 1] & var9) != 0) {
                                var41++;
                            }
                            label436: while (var38 > 0) {
                                for (int var42 = var40; var42 <= var41; var42++) {
                                    if ((this.field1534[var11][var38 - 1][var42] & var9) == 0) {
                                        break label436;
                                    }
                                }
                                var38--;
                            }
                            label425: while (var39 < this.field1523) {
                                for (int var43 = var40; var43 <= var41; var43++) {
                                    if ((this.field1534[var11][var39 + 1][var43] & var9) == 0) {
                                        break label425;
                                    }
                                }
                                var39++;
                            }
                            if ((var39 + 1 - var38) * (var41 + 1 - var40) >= 4) {
                                int var44 = this.field1530[var11][var38][var40];
                                class17.method248(var44, 4, var10, var38 * 128, var40 * 128, var41 * 128 + 128, var39 * 128 + 128, var44, 338);
                                for (int var45 = var38; var45 <= var39; var45++) {
                                    for (int var46 = var40; var46 <= var41; var46++) {
                                        this.field1534[var11][var45][var46] &= ~var9;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "SMJSOFHG", name = "a", descriptor = "(IIIIZ)V")
    public final void method507(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (!arg4) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        for (int var7 = arg0; var7 <= arg0 + arg1; var7++) {
            for (int var8 = arg3; var8 <= arg2 + arg3; var8++) {
                if (var8 >= 0 && var8 < this.field1523 && var7 >= 0 && var7 < this.field1524) {
                    this.field1520[0][var8][var7] = 127;
                    if (arg3 == var8 && var8 > 0) {
                        this.field1530[0][var8][var7] = this.field1530[0][var8 - 1][var7];
                    }
                    if (arg2 + arg3 == var8 && var8 < this.field1523 - 1) {
                        this.field1530[0][var8][var7] = this.field1530[0][var8 + 1][var7];
                    }
                    if (arg0 == var7 && var7 > 0) {
                        this.field1530[0][var8][var7] = this.field1530[0][var8][var7 - 1];
                    }
                    if (arg0 + arg1 == var7 && var7 < this.field1524 - 1) {
                        this.field1530[0][var8][var7] = this.field1530[0][var8][var7 + 1];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "SMJSOFHG", name = "<init>", descriptor = "([[[BII[[[II)V")
    public class54(byte[][][] arg0, int arg1, int arg2, int[][][] arg3, int arg4) {
        this.field1523 = arg4;
        this.field1524 = arg2;
        this.field1530 = arg3;
        this.field1517 = arg0;
        this.field1526 = new byte[4][this.field1523][this.field1524];
        this.field1510 = new byte[4][this.field1523][this.field1524];
        if (arg1 < 7 || arg1 > 7) {
            throw new NullPointerException();
        }
        this.field1535 = new byte[4][this.field1523][this.field1524];
        this.field1518 = new byte[4][this.field1523][this.field1524];
        this.field1534 = new int[4][this.field1523 + 1][this.field1524 + 1];
        this.field1520 = new byte[4][this.field1523 + 1][this.field1524 + 1];
        this.field1516 = new int[this.field1523 + 1][this.field1524 + 1];
        this.field1511 = new int[this.field1524];
        this.field1512 = new int[this.field1524];
        this.field1513 = new int[this.field1524];
        this.field1514 = new int[this.field1524];
        this.field1515 = new int[this.field1524];
    }
}
