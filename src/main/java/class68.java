import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!YTWJKTVW")
public class class68 {

    @OriginalMember(owner = "client!YTWJKTVW", name = "i", descriptor = "I")
    private int field1684 = -706;

    @OriginalMember(owner = "client!YTWJKTVW", name = "k", descriptor = "B")
    private byte field1686 = 6;

    @OriginalMember(owner = "client!YTWJKTVW", name = "s", descriptor = "Z")
    private boolean field1694 = true;

    @OriginalMember(owner = "client!YTWJKTVW", name = "u", descriptor = "Z")
    private boolean field1696 = false;

    @OriginalMember(owner = "client!YTWJKTVW", name = "f", descriptor = "I")
    private int field1681;

    @OriginalMember(owner = "client!YTWJKTVW", name = "g", descriptor = "I")
    private int field1682;

    @OriginalMember(owner = "client!YTWJKTVW", name = "m", descriptor = "[[[I")
    private int[][][] field1688;

    @OriginalMember(owner = "client!YTWJKTVW", name = "C", descriptor = "[[[B")
    private byte[][][] field1704;

    @OriginalMember(owner = "client!YTWJKTVW", name = "G", descriptor = "[[[B")
    private byte[][][] field1708;

    @OriginalMember(owner = "client!YTWJKTVW", name = "E", descriptor = "[[[B")
    private byte[][][] field1706;

    @OriginalMember(owner = "client!YTWJKTVW", name = "b", descriptor = "[[[B")
    private byte[][][] field1677;

    @OriginalMember(owner = "client!YTWJKTVW", name = "p", descriptor = "[[[B")
    private byte[][][] field1691;

    @OriginalMember(owner = "client!YTWJKTVW", name = "v", descriptor = "[[[I")
    private int[][][] field1697;

    @OriginalMember(owner = "client!YTWJKTVW", name = "n", descriptor = "[[[B")
    private byte[][][] field1689;

    @OriginalMember(owner = "client!YTWJKTVW", name = "F", descriptor = "[[I")
    private int[][] field1707;

    @OriginalMember(owner = "client!YTWJKTVW", name = "w", descriptor = "[I")
    private int[] field1698;

    @OriginalMember(owner = "client!YTWJKTVW", name = "x", descriptor = "[I")
    private int[] field1699;

    @OriginalMember(owner = "client!YTWJKTVW", name = "y", descriptor = "[I")
    private int[] field1700;

    @OriginalMember(owner = "client!YTWJKTVW", name = "z", descriptor = "[I")
    private int[] field1701;

    @OriginalMember(owner = "client!YTWJKTVW", name = "A", descriptor = "[I")
    private int[] field1702;

    @OriginalMember(owner = "client!YTWJKTVW", name = "a", descriptor = "[I")
    private static final int[] field1676 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!YTWJKTVW", name = "c", descriptor = "I")
    private static int field1678 = 302;

    @OriginalMember(owner = "client!YTWJKTVW", name = "d", descriptor = "[I")
    private static final int[] field1679 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!YTWJKTVW", name = "e", descriptor = "I")
    public static int field1680 = 99;

    @OriginalMember(owner = "client!YTWJKTVW", name = "h", descriptor = "[I")
    private static final int[] field1683 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!YTWJKTVW", name = "j", descriptor = "I")
    private static int field1685 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!YTWJKTVW", name = "l", descriptor = "I")
    private static int field1687 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!YTWJKTVW", name = "o", descriptor = "Z")
    private static boolean field1690 = true;

    @OriginalMember(owner = "client!YTWJKTVW", name = "q", descriptor = "Z")
    public static boolean field1692 = true;

    @OriginalMember(owner = "client!YTWJKTVW", name = "t", descriptor = "[I")
    private static final int[] field1695 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!YTWJKTVW", name = "r", descriptor = "I")
    public static int field1693;

    @OriginalMember(owner = "client!YTWJKTVW", name = "B", descriptor = "I")
    private int field1703;

    @OriginalMember(owner = "client!YTWJKTVW", name = "D", descriptor = "Z")
    private static boolean field1705;

    @OriginalMember(owner = "client!YTWJKTVW", name = "a", descriptor = "(III)I")
    private static final int method558(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method573(var3, var5);
        int var8 = method573(var3 + 1, var5);
        int var9 = method573(var3, var5 + 1);
        int var10 = method573(var3 + 1, var5 + 1);
        int var11 = method579(var7, var8, var4, arg2);
        int var12 = method579(var9, var10, var4, arg2);
        return method579(var11, var12, var6, arg2);
    }

    @OriginalMember(owner = "client!YTWJKTVW", name = "a", descriptor = "(IBII)I")
    public int method559(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != 124) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if ((this.field1704[arg3][arg2][arg0] & 0x8) == 0) {
            return arg3 <= 0 || (this.field1704[1][arg2][arg0] & 0x2) == 0 ? arg3 : arg3 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!YTWJKTVW", name = "a", descriptor = "([[[IIIILMCPCRICF;LFUVVWALN;IIZII)V")
    public static final void method560(int[][][] arg0, int arg1, int arg2, int arg3, class35 arg4, class13 arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10) {
        int var11 = arg0[arg2][arg10][arg3];
        int var12 = arg0[arg2][arg10 + 1][arg3];
        int var13 = arg0[arg2][arg10 + 1][arg3 + 1];
        int var14 = arg0[arg2][arg10][arg3 + 1];
        if (arg8) {
            field1705 = !field1705;
        }
        int var15 = var11 + var12 + var13 + var14 >> 2;
        class9 var16 = class9.method184(arg1);
        int var17 = (arg1 << 14) + (arg3 << 7) + arg10 + 1073741824;
        if (!var16.field644) {
            var17 += Integer.MIN_VALUE;
        }
        byte var18 = (byte) ((arg9 << 6) + arg6);
        if (arg6 == 22) {
            class3 var19;
            if (var16.field634 == -1 && var16.field614 == null) {
                var19 = var16.method190(22, arg9, var11, var12, var13, var14, -1);
            } else {
                var19 = new class22(var13, var12, var14, true, true, var11, 22, arg9, arg1, var16.field634);
            }
            arg4.method335(arg7, var17, arg10, var18, arg3, false, var19, var15);
            if (var16.field630 && var16.field644) {
                arg5.method231(arg10, arg3, false);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class3 var39;
            if (var16.field634 == -1 && var16.field614 == null) {
                var39 = var16.method190(10, arg9, var11, var12, var13, var14, -1);
            } else {
                var39 = new class22(var13, var12, var14, true, true, var11, 10, arg9, arg1, var16.field634);
            }
            if (var39 != null) {
                int var40 = 0;
                if (arg6 == 11) {
                    var40 += 256;
                }
                int var41;
                int var42;
                if (arg9 == 1 || arg9 == 3) {
                    var41 = var16.field656;
                    var42 = var16.field636;
                } else {
                    var41 = var16.field636;
                    var42 = var16.field656;
                }
                arg4.method339(arg3, (byte) 0, arg7, var42, var17, var15, arg10, var18, var41, var39, var40);
            }
            if (var16.field630) {
                arg5.method230(var16.field656, arg9, arg10, var16.field655, -433, var16.field636, arg3);
            }
        } else if (arg6 >= 12) {
            class3 var20;
            if (var16.field634 == -1 && var16.field614 == null) {
                var20 = var16.method190(arg6, arg9, var11, var12, var13, var14, -1);
            } else {
                var20 = new class22(var13, var12, var14, true, true, var11, arg6, arg9, arg1, var16.field634);
            }
            arg4.method339(arg3, (byte) 0, arg7, 1, var17, var15, arg10, var18, 1, var20, 0);
            if (var16.field630) {
                arg5.method230(var16.field656, arg9, arg10, var16.field655, -433, var16.field636, arg3);
            }
        } else if (arg6 == 0) {
            class3 var21;
            if (var16.field634 == -1 && var16.field614 == null) {
                var21 = var16.method190(0, arg9, var11, var12, var13, var14, -1);
            } else {
                var21 = new class22(var13, var12, var14, true, true, var11, 0, arg9, arg1, var16.field634);
            }
            arg4.method337(0, arg3, var18, field1695[arg9], false, null, arg10, arg7, var17, var15, var21);
            if (var16.field630) {
                arg5.method229(arg6, var16.field655, arg9, (byte) -50, arg10, arg3);
            }
        } else if (arg6 == 1) {
            class3 var22;
            if (var16.field634 == -1 && var16.field614 == null) {
                var22 = var16.method190(1, arg9, var11, var12, var13, var14, -1);
            } else {
                var22 = new class22(var13, var12, var14, true, true, var11, 1, arg9, arg1, var16.field634);
            }
            arg4.method337(0, arg3, var18, field1679[arg9], false, null, arg10, arg7, var17, var15, var22);
            if (var16.field630) {
                arg5.method229(arg6, var16.field655, arg9, (byte) -50, arg10, arg3);
            }
        } else if (arg6 == 2) {
            int var23 = arg9 + 1 & 0x3;
            class3 var24;
            class3 var25;
            if (var16.field634 == -1 && var16.field614 == null) {
                var24 = var16.method190(2, arg9 + 4, var11, var12, var13, var14, -1);
                var25 = var16.method190(2, var23, var11, var12, var13, var14, -1);
            } else {
                var24 = new class22(var13, var12, var14, true, true, var11, 2, arg9 + 4, arg1, var16.field634);
                var25 = new class22(var13, var12, var14, true, true, var11, 2, var23, arg1, var16.field634);
            }
            arg4.method337(field1695[var23], arg3, var18, field1695[arg9], false, var25, arg10, arg7, var17, var15, var24);
            if (var16.field630) {
                arg5.method229(arg6, var16.field655, arg9, (byte) -50, arg10, arg3);
            }
        } else if (arg6 == 3) {
            class3 var26;
            if (var16.field634 == -1 && var16.field614 == null) {
                var26 = var16.method190(3, arg9, var11, var12, var13, var14, -1);
            } else {
                var26 = new class22(var13, var12, var14, true, true, var11, 3, arg9, arg1, var16.field634);
            }
            arg4.method337(0, arg3, var18, field1679[arg9], false, null, arg10, arg7, var17, var15, var26);
            if (var16.field630) {
                arg5.method229(arg6, var16.field655, arg9, (byte) -50, arg10, arg3);
            }
        } else if (arg6 == 9) {
            class3 var27;
            if (var16.field634 == -1 && var16.field614 == null) {
                var27 = var16.method190(arg6, arg9, var11, var12, var13, var14, -1);
            } else {
                var27 = new class22(var13, var12, var14, true, true, var11, arg6, arg9, arg1, var16.field634);
            }
            arg4.method339(arg3, (byte) 0, arg7, 1, var17, var15, arg10, var18, 1, var27, 0);
            if (var16.field630) {
                arg5.method230(var16.field656, arg9, arg10, var16.field655, -433, var16.field636, arg3);
            }
        } else {
            if (var16.field623) {
                if (arg9 == 1) {
                    int var28 = var14;
                    var14 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var28;
                } else if (arg9 == 2) {
                    int var29 = var14;
                    var14 = var12;
                    var12 = var29;
                    int var30 = var13;
                    var13 = var11;
                    var11 = var30;
                } else if (arg9 == 3) {
                    int var31 = var14;
                    var14 = var11;
                    var11 = var12;
                    var12 = var13;
                    var13 = var31;
                }
            }
            if (arg6 == 4) {
                class3 var32;
                if (var16.field634 == -1 && var16.field614 == null) {
                    var32 = var16.method190(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var32 = new class22(var13, var12, var14, true, true, var11, 4, 0, arg1, var16.field634);
                }
                arg4.method338(var17, var15, 0, field1695[arg9], var18, var32, arg3, arg9 * 512, 0, -11470, arg10, arg7);
            } else if (arg6 == 5) {
                int var33 = 16;
                int var34 = arg4.method355(arg7, arg10, arg3);
                if (var34 > 0) {
                    var33 = class9.method184(var34 >> 14 & 0x7FFF).field640;
                }
                class3 var35;
                if (var16.field634 == -1 && var16.field614 == null) {
                    var35 = var16.method190(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var35 = new class22(var13, var12, var14, true, true, var11, 4, 0, arg1, var16.field634);
                }
                arg4.method338(var17, var15, field1683[arg9] * var33, field1695[arg9], var18, var35, arg3, arg9 * 512, field1676[arg9] * var33, -11470, arg10, arg7);
            } else if (arg6 == 6) {
                class3 var36;
                if (var16.field634 == -1 && var16.field614 == null) {
                    var36 = var16.method190(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var36 = new class22(var13, var12, var14, true, true, var11, 4, 0, arg1, var16.field634);
                }
                arg4.method338(var17, var15, 0, 256, var18, var36, arg3, arg9, 0, -11470, arg10, arg7);
            } else if (arg6 == 7) {
                class3 var37;
                if (var16.field634 == -1 && var16.field614 == null) {
                    var37 = var16.method190(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var37 = new class22(var13, var12, var14, true, true, var11, 4, 0, arg1, var16.field634);
                }
                arg4.method338(var17, var15, 0, 512, var18, var37, arg3, arg9, 0, -11470, arg10, arg7);
            } else if (arg6 == 8) {
                class3 var38;
                if (var16.field634 == -1 && var16.field614 == null) {
                    var38 = var16.method190(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var38 = new class22(var13, var12, var14, true, true, var11, 4, 0, arg1, var16.field634);
                }
                arg4.method338(var17, var15, 0, 768, var18, var38, arg3, arg9, 0, -11470, arg10, arg7);
            }
        }
    }

    @OriginalMember(owner = "client!YTWJKTVW", name = "a", descriptor = "(III[BIIILMCPCRICF;II[LFUVVWALN;)V")
    public final void method561(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, class35 arg7, int arg8, int arg9, class13[] arg10) {
        class63 var12 = new class63((byte) -58, arg3);
        int var13 = -1;
        int var14 = 0 / arg5;
        while (true) {
            int var15 = var12.method516();
            if (var15 == 0) {
                return;
            }
            var13 += var15;
            int var16 = 0;
            while (true) {
                int var17 = var12.method516();
                if (var17 == 0) {
                    break;
                }
                var16 += var17 - 1;
                int var18 = var16 & 0x3F;
                int var19 = var16 >> 6 & 0x3F;
                int var20 = var16 >> 12;
                int var21 = var12.method502();
                int var22 = var21 >> 2;
                int var23 = var21 & 0x3;
                if (arg8 == var20 && var19 >= arg2 && var19 < arg2 + 8 && var18 >= arg1 && var18 < arg1 + 8) {
                    class9 var24 = class9.method184(var13);
                    int var25 = arg0 + class69.method582(var24.field636, var19 & 0x7, var18 & 0x7, arg4, var24.field656, var23, 0);
                    int var26 = arg9 + class69.method583(var19 & 0x7, var18 & 0x7, var24.field656, var24.field636, var23, arg4, (byte) -19);
                    if (var25 > 0 && var26 > 0 && var25 < 103 && var26 < 103) {
                        int var27 = arg6;
                        if ((this.field1704[1][var25][var26] & 0x2) == 2) {
                            var27 = arg6 - 1;
                        }
                        class13 var28 = null;
                        if (var27 >= 0) {
                            var28 = arg10[var27];
                        }
                        this.method578(var13, arg4 + var23 & 0x3, var28, var25, var22, 568, arg7, arg6, var26);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!YTWJKTVW", name = "a", descriptor = "(ZIIII)V")
    public final void method562(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var6 = arg3; var6 <= arg2 + arg3; var6++) {
            for (int var7 = arg1; var7 <= arg1 + arg4; var7++) {
                if (var7 >= 0 && var7 < this.field1681 && var6 >= 0 && var6 < this.field1682) {
                    this.field1689[0][var7][var6] = 127;
                    if (arg1 == var7 && var7 > 0) {
                        this.field1688[0][var7][var6] = this.field1688[0][var7 - 1][var6];
                    }
                    if (arg1 + arg4 == var7 && var7 < this.field1681 - 1) {
                        this.field1688[0][var7][var6] = this.field1688[0][var7 + 1][var6];
                    }
                    if (arg3 == var6 && var6 > 0) {
                        this.field1688[0][var7][var6] = this.field1688[0][var7][var6 - 1];
                    }
                    if (arg2 + arg3 == var6 && var6 < this.field1682 - 1) {
                        this.field1688[0][var7][var6] = this.field1688[0][var7][var6 + 1];
                    }
                }
            }
        }
        if (arg0) {
            field1705 = !field1705;
        }
    }

    @OriginalMember(owner = "client!YTWJKTVW", name = "a", descriptor = "(II)I")
    private final int method563(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!YTWJKTVW", name = "b", descriptor = "(II)I")
    private static final int method564(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!YTWJKTVW", name = "a", descriptor = "(ILWNCFPLWV;LHKGQPBYJ;)V")
    public static final void method565(int arg0, class63 arg1, class21 arg2) {
        int var3 = -1;
        if (arg0 < 3 || arg0 > 3) {
            field1690 = !field1690;
        }
        while (true) {
            int var4 = arg1.method516();
            if (var4 == 0) {
                return;
            }
            var3 += var4;
            class9 var5 = class9.method184(var3);
            var5.method188(arg2, false);
            while (true) {
                int var6 = arg1.method516();
                if (var6 == 0) {
                    break;
                }
                arg1.method502();
            }
        }
    }

    @OriginalMember(owner = "client!YTWJKTVW", name = "a", descriptor = "(IIII)V")
    public final void method566(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < 8; var5++) {
            for (int var8 = 0; var8 < 8; var8++) {
                this.field1688[arg0][arg1 + var5][arg3 + var8] = 0;
            }
        }
        if (arg2 >= 0) {
            this.field1684 = -232;
        }
        if (arg1 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                this.field1688[arg0][arg1][arg3 + var6] = this.field1688[arg0][arg1 - 1][arg3 + var6];
            }
        }
        if (arg3 > 0) {
            for (int var7 = 1; var7 < 8; var7++) {
                this.field1688[arg0][arg1 + var7][arg3] = this.field1688[arg0][arg1 + var7][arg3 - 1];
            }
        }
        if (arg1 > 0 && this.field1688[arg0][arg1 - 1][arg3] != 0) {
            this.field1688[arg0][arg1][arg3] = this.field1688[arg0][arg1 - 1][arg3];
        } else if (arg3 > 0 && this.field1688[arg0][arg1][arg3 - 1] != 0) {
            this.field1688[arg0][arg1][arg3] = this.field1688[arg0][arg1][arg3 - 1];
        } else if (arg1 > 0 && arg3 > 0 && this.field1688[arg0][arg1 - 1][arg3 - 1] != 0) {
            this.field1688[arg0][arg1][arg3] = this.field1688[arg0][arg1 - 1][arg3 - 1];
        }
    }

    @OriginalMember(owner = "client!YTWJKTVW", name = "a", descriptor = "(ILMCPCRICF;[LFUVVWALN;)V")
    public final void method567(int arg0, class35 arg1, class13[] arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((this.field1704[var4][var110][var111] & 0x1) == 1) {
                        int var112 = var4;
                        if ((this.field1704[1][var110][var111] & 0x2) == 2) {
                            var112 = var4 - 1;
                        }
                        if (var112 >= 0) {
                            arg2[var112].method231(var110, var111, false);
                        }
                    }
                }
            }
        }
        if (arg0 >= 0) {
            return;
        }
        field1685 += (int) (Math.random() * 5.0D) - 2;
        if (field1685 < -8) {
            field1685 = -8;
        }
        if (field1685 > 8) {
            field1685 = 8;
        }
        field1687 += (int) (Math.random() * 5.0D) - 2;
        if (field1687 < -16) {
            field1687 = -16;
        }
        if (field1687 > 16) {
            field1687 = 16;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            byte[][] var48 = this.field1689[var5];
            byte var49 = 96;
            short var50 = 768;
            byte var51 = -50;
            byte var52 = -10;
            byte var53 = -50;
            int var54 = (int) Math.sqrt((double) (var53 * var53 + var51 * var51 + var52 * var52));
            int var55 = var50 * var54 >> 8;
            for (int var56 = 1; var56 < this.field1682 - 1; var56++) {
                for (int var101 = 1; var101 < this.field1681 - 1; var101++) {
                    int var102 = this.field1688[var5][var101 + 1][var56] - this.field1688[var5][var101 - 1][var56];
                    int var103 = this.field1688[var5][var101][var56 + 1] - this.field1688[var5][var101][var56 - 1];
                    int var104 = (int) Math.sqrt((double) (var103 * var103 + var102 * var102 + 65536));
                    int var105 = (var102 << 8) / var104;
                    int var106 = 65536 / var104;
                    int var107 = (var103 << 8) / var104;
                    int var108 = (var53 * var107 + var51 * var105 + var52 * var106) / var55 + var49;
                    int var109 = (var48[var101][var56] >> 1) + (var48[var101][var56 + 1] >> 3) + (var48[var101][var56 - 1] >> 2) + (var48[var101 - 1][var56] >> 2) + (var48[var101 + 1][var56] >> 3);
                    this.field1707[var101][var56] = var108 - var109;
                }
            }
            for (int var57 = 0; var57 < this.field1682; var57++) {
                this.field1698[var57] = 0;
                this.field1699[var57] = 0;
                this.field1700[var57] = 0;
                this.field1701[var57] = 0;
                this.field1702[var57] = 0;
            }
            for (int var58 = -5; var58 < this.field1681 + 5; var58++) {
                for (int var61 = 0; var61 < this.field1682; var61++) {
                    int var95 = var58 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < this.field1681) {
                        int var96 = this.field1708[var5][var95][var61] & 0xFF;
                        if (var96 > 0) {
                            class37 var97 = class37.field1040[var96 - 1];
                            this.field1698[var61] += var97.field1049;
                            this.field1699[var61] += var97.field1047;
                            this.field1700[var61] += var97.field1048;
                            this.field1701[var61] += var97.field1050;
                            var10002 = this.field1702[var61]++;
                        }
                    }
                    int var98 = var58 - 5;
                    if (var98 >= 0 && var98 < this.field1681) {
                        int var99 = this.field1708[var5][var98][var61] & 0xFF;
                        if (var99 > 0) {
                            class37 var100 = class37.field1040[var99 - 1];
                            this.field1698[var61] -= var100.field1049;
                            this.field1699[var61] -= var100.field1047;
                            this.field1700[var61] -= var100.field1048;
                            this.field1701[var61] -= var100.field1050;
                            var10002 = this.field1702[var61]--;
                        }
                    }
                }
                if (var58 >= 1 && var58 < this.field1681 - 1) {
                    int var62 = 0;
                    int var63 = 0;
                    int var64 = 0;
                    int var65 = 0;
                    int var66 = 0;
                    for (int var67 = -5; var67 < this.field1682 + 5; var67++) {
                        int var68 = var67 + 5;
                        if (var68 >= 0 && var68 < this.field1682) {
                            var62 += this.field1698[var68];
                            var63 += this.field1699[var68];
                            var64 += this.field1700[var68];
                            var65 += this.field1701[var68];
                            var66 += this.field1702[var68];
                        }
                        int var69 = var67 - 5;
                        if (var69 >= 0 && var69 < this.field1682) {
                            var62 -= this.field1698[var69];
                            var63 -= this.field1699[var69];
                            var64 -= this.field1700[var69];
                            var65 -= this.field1701[var69];
                            var66 -= this.field1702[var69];
                        }
                        if (var67 >= 1 && var67 < this.field1682 - 1 && (!field1692 || (this.field1704[0][var58][var67] & 0x2) != 0 || (this.field1704[var5][var58][var67] & 0x10) == 0 && this.method559(var67, (byte) 124, var58, var5) == field1693)) {
                            if (var5 < field1680) {
                                field1680 = var5;
                            }
                            int var70 = this.field1708[var5][var58][var67] & 0xFF;
                            int var71 = this.field1706[var5][var58][var67] & 0xFF;
                            if (var70 > 0 || var71 > 0) {
                                int var72 = this.field1688[var5][var58][var67];
                                int var73 = this.field1688[var5][var58 + 1][var67];
                                int var74 = this.field1688[var5][var58 + 1][var67 + 1];
                                int var75 = this.field1688[var5][var58][var67 + 1];
                                int var76 = this.field1707[var58][var67];
                                int var77 = this.field1707[var58 + 1][var67];
                                int var78 = this.field1707[var58 + 1][var67 + 1];
                                int var79 = this.field1707[var58][var67 + 1];
                                int var80 = -1;
                                int var81 = -1;
                                if (var70 > 0) {
                                    int var82 = var62 * 256 / var65;
                                    int var83 = var63 / var66;
                                    int var84 = var64 / var66;
                                    var80 = this.method577(var82, var83, var84);
                                    int var85 = field1685 + var82 & 0xFF;
                                    int var86 = field1687 + var84;
                                    if (var86 < 0) {
                                        var86 = 0;
                                    } else if (var86 > 255) {
                                        var86 = 255;
                                    }
                                    var81 = this.method577(var85, var83, var86);
                                }
                                if (var5 > 0) {
                                    boolean var87 = true;
                                    if (var70 == 0 && this.field1677[var5][var58][var67] != 0) {
                                        var87 = false;
                                    }
                                    if (var71 > 0 && !class37.field1040[var71 - 1].field1045) {
                                        var87 = false;
                                    }
                                    if (var87 && var72 == var73 && var72 == var74 && var72 == var75) {
                                        this.field1697[var5][var58][var67] |= 0x924;
                                    }
                                }
                                int var88 = 0;
                                if (var80 != -1) {
                                    var88 = class11.field692[method568(var81, 96)];
                                }
                                if (var71 == 0) {
                                    arg1.method334(var5, var58, var67, 0, 0, -1, var72, var73, var74, var75, method568(var80, var76), method568(var80, var77), method568(var80, var78), method568(var80, var79), 0, 0, 0, 0, var88, 0);
                                } else {
                                    int var89 = this.field1677[var5][var58][var67] + 1;
                                    byte var90 = this.field1691[var5][var58][var67];
                                    class37 var91 = class37.field1040[var71 - 1];
                                    int var92 = var91.field1043;
                                    int var93;
                                    int var94;
                                    if (var92 >= 0) {
                                        var93 = class11.method204(var92, true);
                                        var94 = -1;
                                    } else if (var91.field1042 == 16711935) {
                                        var94 = -2;
                                        var92 = -1;
                                        var93 = class11.field692[this.method563(var91.field1051, 96)];
                                    } else {
                                        var94 = this.method577(var91.field1046, var91.field1047, var91.field1048);
                                        var93 = class11.field692[this.method563(var91.field1051, 96)];
                                    }
                                    arg1.method334(var5, var58, var67, var89, var90, var92, var72, var73, var74, var75, method568(var80, var76), method568(var80, var77), method568(var80, var78), method568(var80, var79), this.method563(var94, var76), this.method563(var94, var77), this.method563(var94, var78), this.method563(var94, var79), var88, var93);
                                }
                            }
                        }
                    }
                }
            }
            for (int var59 = 1; var59 < this.field1682 - 1; var59++) {
                for (int var60 = 1; var60 < this.field1681 - 1; var60++) {
                    arg1.method333(var5, var60, var59, this.method559(var59, (byte) 124, var60, var5));
                }
            }
        }
        arg1.method360(-50, true, -10, -50);
        for (int var6 = 0; var6 < this.field1681; var6++) {
            for (int var47 = 0; var47 < this.field1682; var47++) {
                if ((this.field1704[1][var6][var47] & 0x2) == 2) {
                    arg1.method331(var6, var47, -129);
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
                for (int var12 = 0; var12 <= this.field1682; var12++) {
                    for (int var13 = 0; var13 <= this.field1681; var13++) {
                        if ((this.field1697[var11][var13][var12] & var7) != 0) {
                            int var14 = var12;
                            int var15 = var12;
                            int var16 = var11;
                            int var17 = var11;
                            while (var14 > 0 && (this.field1697[var11][var13][var14 - 1] & var7) != 0) {
                                var14--;
                            }
                            while (var15 < this.field1682 && (this.field1697[var11][var13][var15 + 1] & var7) != 0) {
                                var15++;
                            }
                            label330: while (var16 > 0) {
                                for (int var18 = var14; var18 <= var15; var18++) {
                                    if ((this.field1697[var16 - 1][var13][var18] & var7) == 0) {
                                        break label330;
                                    }
                                }
                                var16--;
                            }
                            label319: while (var17 < var10) {
                                for (int var19 = var14; var19 <= var15; var19++) {
                                    if ((this.field1697[var17 + 1][var13][var19] & var7) == 0) {
                                        break label319;
                                    }
                                }
                                var17++;
                            }
                            int var20 = (var17 + 1 - var16) * (var15 - var14 + 1);
                            if (var20 >= 8) {
                                short var21 = 240;
                                int var22 = this.field1688[var17][var13][var14] - var21;
                                int var23 = this.field1688[var16][var13][var14];
                                class35.method332(1, this.field1696, var10, var13 * 128, var23, var15 * 128 + 128, var22, var14 * 128, var13 * 128);
                                for (int var24 = var16; var24 <= var17; var24++) {
                                    for (int var25 = var14; var25 <= var15; var25++) {
                                        this.field1697[var24][var13][var25] &= ~var7;
                                    }
                                }
                            }
                        }
                        if ((this.field1697[var11][var13][var12] & var8) != 0) {
                            int var26 = var13;
                            int var27 = var13;
                            int var28 = var11;
                            int var29 = var11;
                            while (var26 > 0 && (this.field1697[var11][var26 - 1][var12] & var8) != 0) {
                                var26--;
                            }
                            while (var27 < this.field1681 && (this.field1697[var11][var27 + 1][var12] & var8) != 0) {
                                var27++;
                            }
                            label383: while (var28 > 0) {
                                for (int var30 = var26; var30 <= var27; var30++) {
                                    if ((this.field1697[var28 - 1][var30][var12] & var8) == 0) {
                                        break label383;
                                    }
                                }
                                var28--;
                            }
                            label372: while (var29 < var10) {
                                for (int var31 = var26; var31 <= var27; var31++) {
                                    if ((this.field1697[var29 + 1][var31][var12] & var8) == 0) {
                                        break label372;
                                    }
                                }
                                var29++;
                            }
                            int var32 = (var29 + 1 - var28) * (var27 - var26 + 1);
                            if (var32 >= 8) {
                                short var33 = 240;
                                int var34 = this.field1688[var29][var26][var12] - var33;
                                int var35 = this.field1688[var28][var26][var12];
                                class35.method332(2, this.field1696, var10, var27 * 128 + 128, var35, var12 * 128, var34, var12 * 128, var26 * 128);
                                for (int var36 = var28; var36 <= var29; var36++) {
                                    for (int var37 = var26; var37 <= var27; var37++) {
                                        this.field1697[var36][var37][var12] &= ~var8;
                                    }
                                }
                            }
                        }
                        if ((this.field1697[var11][var13][var12] & var9) != 0) {
                            int var38 = var13;
                            int var39 = var13;
                            int var40 = var12;
                            int var41 = var12;
                            while (var40 > 0 && (this.field1697[var11][var13][var40 - 1] & var9) != 0) {
                                var40--;
                            }
                            while (var41 < this.field1682 && (this.field1697[var11][var13][var41 + 1] & var9) != 0) {
                                var41++;
                            }
                            label436: while (var38 > 0) {
                                for (int var42 = var40; var42 <= var41; var42++) {
                                    if ((this.field1697[var11][var38 - 1][var42] & var9) == 0) {
                                        break label436;
                                    }
                                }
                                var38--;
                            }
                            label425: while (var39 < this.field1681) {
                                for (int var43 = var40; var43 <= var41; var43++) {
                                    if ((this.field1697[var11][var39 + 1][var43] & var9) == 0) {
                                        break label425;
                                    }
                                }
                                var39++;
                            }
                            if ((var39 + 1 - var38) * (var41 - var40 + 1) >= 4) {
                                int var44 = this.field1688[var11][var38][var40];
                                class35.method332(4, this.field1696, var10, var39 * 128 + 128, var44, var41 * 128 + 128, var44, var40 * 128, var38 * 128);
                                for (int var45 = var38; var45 <= var39; var45++) {
                                    for (int var46 = var40; var46 <= var41; var46++) {
                                        this.field1697[var11][var45][var46] &= ~var9;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!YTWJKTVW", name = "c", descriptor = "(II)I")
    private static final int method568(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!YTWJKTVW", name = "d", descriptor = "(II)I")
    private static final int method569(int arg0, int arg1) {
        int var2 = method558(arg0 + 45365, arg1 + 91923, 4) + (method558(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method558(arg0, arg1, 1) - 128 >> 2) - 128;
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @OriginalMember(owner = "client!YTWJKTVW", name = "a", descriptor = "([LFUVVWALN;[BBIILMCPCRICF;)V")
    public final void method570(class13[] arg0, byte[] arg1, byte arg2, int arg3, int arg4, class35 arg5) {
        class63 var7 = new class63((byte) -58, arg1);
        int var8 = -1;
        if (this.field1686 != arg2) {
            return;
        }
        while (true) {
            int var9 = var7.method516();
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method516();
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = var10 & 0x3F;
                int var13 = var10 >> 6 & 0x3F;
                int var14 = var10 >> 12;
                int var15 = var7.method502();
                int var16 = var15 >> 2;
                int var17 = var15 & 0x3;
                int var18 = arg3 + var13;
                int var19 = arg4 + var12;
                if (var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) {
                    int var20 = var14;
                    if ((this.field1704[1][var18][var19] & 0x2) == 2) {
                        var20 = var14 - 1;
                    }
                    class13 var21 = null;
                    if (var20 >= 0) {
                        var21 = arg0[var20];
                    }
                    this.method578(var8, var17, var21, var18, var16, 568, arg5, var14, var19);
                }
            }
        }
    }

    @OriginalMember(owner = "client!YTWJKTVW", name = "a", descriptor = "(I[BII)Z")
    public static final boolean method571(int arg0, byte[] arg1, int arg2, int arg3) {
        boolean var4 = true;
        class63 var5 = new class63((byte) -58, arg1);
        int var6 = -1;
        int var7 = 30 / arg3;
        label50: while (true) {
            int var8 = var5.method516();
            if (var8 == 0) {
                return var4;
            }
            var6 += var8;
            int var9 = 0;
            boolean var10 = false;
            while (true) {
                while (!var10) {
                    int var12 = var5.method516();
                    if (var12 == 0) {
                        continue label50;
                    }
                    var9 += var12 - 1;
                    int var13 = var9 & 0x3F;
                    int var14 = var9 >> 6 & 0x3F;
                    int var15 = var5.method502() >> 2;
                    int var16 = arg0 + var14;
                    int var17 = arg2 + var13;
                    if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                        class9 var18 = class9.method184(var6);
                        if (var15 != 22 || !field1692 || var18.field644 || var18.field653) {
                            var4 &= var18.method186(-49);
                            var10 = true;
                        }
                    }
                }
                int var11 = var5.method516();
                if (var11 == 0) {
                    break;
                }
                var5.method502();
            }
        }
    }

    @OriginalMember(owner = "client!YTWJKTVW", name = "a", descriptor = "(IIILWNCFPLWV;IBII)V")
    private final void method572(int arg0, int arg1, int arg2, class63 arg3, int arg4, byte arg5, int arg6, int arg7) {
        if (arg5 != 7) {
            return;
        }
        boolean var9 = false;
        if (arg4 < 0 || arg4 >= 104 || arg2 < 0 || arg2 >= 104) {
            while (true) {
                int var12 = arg3.method502();
                if (var12 == 0) {
                    return;
                }
                if (var12 == 1) {
                    arg3.method502();
                    return;
                }
                if (var12 <= 49) {
                    arg3.method502();
                }
            }
        }
        this.field1704[arg7][arg4][arg2] = 0;
        while (true) {
            int var10 = arg3.method502();
            if (var10 == 0) {
                if (arg7 == 0) {
                    this.field1688[0][arg4][arg2] = -method569(arg4 + arg6 + 932731, arg2 + 556238 + arg0) * 8;
                    return;
                } else {
                    this.field1688[arg7][arg4][arg2] = this.field1688[arg7 - 1][arg4][arg2] - 240;
                    return;
                }
            }
            if (var10 == 1) {
                int var11 = arg3.method502();
                if (var11 == 1) {
                    var11 = 0;
                }
                if (arg7 == 0) {
                    this.field1688[0][arg4][arg2] = -var11 * 8;
                    return;
                }
                this.field1688[arg7][arg4][arg2] = this.field1688[arg7 - 1][arg4][arg2] - var11 * 8;
                return;
            }
            if (var10 <= 49) {
                this.field1706[arg7][arg4][arg2] = arg3.method503();
                this.field1677[arg7][arg4][arg2] = (byte) ((var10 - 2) / 4);
                this.field1691[arg7][arg4][arg2] = (byte) (var10 + arg1 - 2 & 0x3);
            } else if (var10 <= 81) {
                this.field1704[arg7][arg4][arg2] = (byte) (var10 - 49);
            } else {
                this.field1708[arg7][arg4][arg2] = (byte) (var10 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!YTWJKTVW", name = "e", descriptor = "(II)I")
    private static final int method573(int arg0, int arg1) {
        int var2 = method564(arg0 - 1, arg1 - 1) + method564(arg0 + 1, arg1 - 1) + method564(arg0 - 1, arg1 + 1) + method564(arg0 + 1, arg1 + 1);
        int var3 = method564(arg0 - 1, arg1) + method564(arg0 + 1, arg1) + method564(arg0, arg1 - 1) + method564(arg0, arg1 + 1);
        int var4 = method564(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @OriginalMember(owner = "client!YTWJKTVW", name = "<init>", descriptor = "(I[[[III[[[B)V")
    public class68(int arg0, int[][][] arg1, int arg2, int arg3, byte[][][] arg4) {
        field1680 = 99;
        this.field1681 = arg0;
        this.field1682 = arg2;
        this.field1688 = arg1;
        this.field1704 = arg4;
        this.field1708 = new byte[4][this.field1681][this.field1682];
        this.field1706 = new byte[4][this.field1681][this.field1682];
        this.field1677 = new byte[4][this.field1681][this.field1682];
        this.field1691 = new byte[4][this.field1681][this.field1682];
        this.field1697 = new int[4][this.field1681 + 1][this.field1682 + 1];
        this.field1689 = new byte[4][this.field1681 + 1][this.field1682 + 1];
        this.field1707 = new int[this.field1681 + 1][this.field1682 + 1];
        if (arg3 >= 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        this.field1698 = new int[this.field1682];
        this.field1699 = new int[this.field1682];
        this.field1700 = new int[this.field1682];
        this.field1701 = new int[this.field1682];
        this.field1702 = new int[this.field1682];
    }

    @OriginalMember(owner = "client!YTWJKTVW", name = "a", descriptor = "(IBI[BII[LFUVVWALN;)V")
    public final void method574(int arg0, byte arg1, int arg2, byte[] arg3, int arg4, int arg5, class13[] arg6) {
        if (arg1 != 54) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    if (arg5 + var14 > 0 && arg5 + var14 < 103 && arg0 + var15 > 0 && arg0 + var15 < 103) {
                        arg6[var9].field755[arg5 + var14][arg0 + var15] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class63 var10 = new class63((byte) -58, arg3);
        for (int var11 = 0; var11 < 4; var11++) {
            for (int var12 = 0; var12 < 64; var12++) {
                for (int var13 = 0; var13 < 64; var13++) {
                    this.method572(arg4, 0, arg0 + var13, var10, arg5 + var12, (byte) 7, arg2, var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!YTWJKTVW", name = "b", descriptor = "(III)Z")
    public static final boolean method575(int arg0, int arg1, int arg2) {
        class9 var3 = class9.method184(arg1);
        if (arg0 <= 0) {
            field1678 = -259;
        }
        if (arg2 == 11) {
            arg2 = 10;
        }
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        return var3.method185(arg2, field1690);
    }

    @OriginalMember(owner = "client!YTWJKTVW", name = "a", descriptor = "(ZIII[BI[LFUVVWALN;III)V")
    public final void method576(boolean arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, class13[] arg6, int arg7, int arg8, int arg9) {
        for (int var11 = 0; var11 < 8; var11++) {
            for (int var16 = 0; var16 < 8; var16++) {
                if (arg7 + var11 > 0 && arg7 + var11 < 103 && arg3 + var16 > 0 && arg3 + var16 < 103) {
                    arg6[arg2].field755[arg7 + var11][arg3 + var16] &= 0xFEFFFFFF;
                }
            }
        }
        class63 var12 = new class63((byte) -58, arg4);
        for (int var13 = 0; var13 < 4; var13++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    if (arg9 == var13 && var14 >= arg5 && var14 < arg5 + 8 && var15 >= arg1 && var15 < arg1 + 8) {
                        this.method572(0, arg8, arg3 + class69.method581(arg8, var15 & 0x7, this.field1703, var14 & 0x7), var12, arg7 + class69.method580(var15 & 0x7, var14 & 0x7, -874, arg8), (byte) 7, 0, arg2);
                    } else {
                        this.method572(0, 0, -1, var12, -1, (byte) 7, 0, 0);
                    }
                }
            }
        }
        if (!arg0) {
            this.field1703 = 412;
        }
    }

    @OriginalMember(owner = "client!YTWJKTVW", name = "c", descriptor = "(III)I")
    private final int method577(int arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "client!YTWJKTVW", name = "a", descriptor = "(IILFUVVWALN;IIILMCPCRICF;II)V")
    private final void method578(int arg0, int arg1, class13 arg2, int arg3, int arg4, int arg5, class35 arg6, int arg7, int arg8) {
        int var10 = 85 / arg5;
        if (field1692 && (this.field1704[0][arg3][arg8] & 0x2) == 0) {
            if ((this.field1704[arg7][arg3][arg8] & 0x10) != 0) {
                return;
            }
            if (this.method559(arg8, (byte) 124, arg3, arg7) != field1693) {
                return;
            }
        }
        if (arg7 < field1680) {
            field1680 = arg7;
        }
        int var11 = this.field1688[arg7][arg3][arg8];
        int var12 = this.field1688[arg7][arg3 + 1][arg8];
        int var13 = this.field1688[arg7][arg3 + 1][arg8 + 1];
        int var14 = this.field1688[arg7][arg3][arg8 + 1];
        int var15 = var11 + var12 + var13 + var14 >> 2;
        class9 var16 = class9.method184(arg0);
        int var17 = (arg0 << 14) + (arg8 << 7) + arg3 + 1073741824;
        if (!var16.field644) {
            var17 += Integer.MIN_VALUE;
        }
        byte var18 = (byte) ((arg1 << 6) + arg4);
        if (arg4 == 22) {
            if (!field1692 || var16.field644 || var16.field653) {
                class3 var19;
                if (var16.field634 == -1 && var16.field614 == null) {
                    var19 = var16.method190(22, arg1, var11, var12, var13, var14, -1);
                } else {
                    var19 = new class22(var13, var12, var14, true, true, var11, 22, arg1, arg0, var16.field634);
                }
                arg6.method335(arg7, var17, arg3, var18, arg8, false, var19, var15);
                if (var16.field630 && var16.field644 && arg2 != null) {
                    arg2.method231(arg3, arg8, false);
                }
            }
        } else if (arg4 == 10 || arg4 == 11) {
            class3 var39;
            if (var16.field634 == -1 && var16.field614 == null) {
                var39 = var16.method190(10, arg1, var11, var12, var13, var14, -1);
            } else {
                var39 = new class22(var13, var12, var14, true, true, var11, 10, arg1, arg0, var16.field634);
            }
            if (var39 != null) {
                int var40 = 0;
                if (arg4 == 11) {
                    var40 += 256;
                }
                int var41;
                int var42;
                if (arg1 == 1 || arg1 == 3) {
                    var41 = var16.field656;
                    var42 = var16.field636;
                } else {
                    var41 = var16.field636;
                    var42 = var16.field656;
                }
                if (arg6.method339(arg8, (byte) 0, arg7, var42, var17, var15, arg3, var18, var41, var39, var40) && var16.field659) {
                    class56 var43;
                    if (var39 instanceof class56) {
                        var43 = (class56) var39;
                    } else {
                        var43 = var16.method190(10, arg1, var11, var12, var13, var14, -1);
                    }
                    if (var43 != null) {
                        for (int var44 = 0; var44 <= var41; var44++) {
                            for (int var45 = 0; var45 <= var42; var45++) {
                                int var46 = var43.field1458 / 4;
                                if (var46 > 30) {
                                    var46 = 30;
                                }
                                if (var46 > this.field1689[arg7][arg3 + var44][arg8 + var45]) {
                                    this.field1689[arg7][arg3 + var44][arg8 + var45] = (byte) var46;
                                }
                            }
                        }
                    }
                }
            }
            if (var16.field630 && arg2 != null) {
                arg2.method230(var16.field656, arg1, arg3, var16.field655, -433, var16.field636, arg8);
            }
        } else if (arg4 >= 12) {
            class3 var20;
            if (var16.field634 == -1 && var16.field614 == null) {
                var20 = var16.method190(arg4, arg1, var11, var12, var13, var14, -1);
            } else {
                var20 = new class22(var13, var12, var14, true, true, var11, arg4, arg1, arg0, var16.field634);
            }
            arg6.method339(arg8, (byte) 0, arg7, 1, var17, var15, arg3, var18, 1, var20, 0);
            if (arg4 >= 12 && arg4 <= 17 && arg4 != 13 && arg7 > 0) {
                this.field1697[arg7][arg3][arg8] |= 0x924;
            }
            if (var16.field630 && arg2 != null) {
                arg2.method230(var16.field656, arg1, arg3, var16.field655, -433, var16.field636, arg8);
            }
        } else if (arg4 == 0) {
            class3 var21;
            if (var16.field634 == -1 && var16.field614 == null) {
                var21 = var16.method190(0, arg1, var11, var12, var13, var14, -1);
            } else {
                var21 = new class22(var13, var12, var14, true, true, var11, 0, arg1, arg0, var16.field634);
            }
            arg6.method337(0, arg8, var18, field1695[arg1], false, null, arg3, arg7, var17, var15, var21);
            if (arg1 == 0) {
                if (var16.field659) {
                    this.field1689[arg7][arg3][arg8] = 50;
                    this.field1689[arg7][arg3][arg8 + 1] = 50;
                }
                if (var16.field665) {
                    this.field1697[arg7][arg3][arg8] |= 0x249;
                }
            } else if (arg1 == 1) {
                if (var16.field659) {
                    this.field1689[arg7][arg3][arg8 + 1] = 50;
                    this.field1689[arg7][arg3 + 1][arg8 + 1] = 50;
                }
                if (var16.field665) {
                    this.field1697[arg7][arg3][arg8 + 1] |= 0x492;
                }
            } else if (arg1 == 2) {
                if (var16.field659) {
                    this.field1689[arg7][arg3 + 1][arg8] = 50;
                    this.field1689[arg7][arg3 + 1][arg8 + 1] = 50;
                }
                if (var16.field665) {
                    this.field1697[arg7][arg3 + 1][arg8] |= 0x249;
                }
            } else if (arg1 == 3) {
                if (var16.field659) {
                    this.field1689[arg7][arg3][arg8] = 50;
                    this.field1689[arg7][arg3 + 1][arg8] = 50;
                }
                if (var16.field665) {
                    this.field1697[arg7][arg3][arg8] |= 0x492;
                }
            }
            if (var16.field630 && arg2 != null) {
                arg2.method229(arg4, var16.field655, arg1, (byte) -50, arg3, arg8);
            }
            if (var16.field640 != 16) {
                arg6.method345(arg7, var16.field640, arg3, (byte) -92, arg8);
            }
        } else if (arg4 == 1) {
            class3 var22;
            if (var16.field634 == -1 && var16.field614 == null) {
                var22 = var16.method190(1, arg1, var11, var12, var13, var14, -1);
            } else {
                var22 = new class22(var13, var12, var14, true, true, var11, 1, arg1, arg0, var16.field634);
            }
            arg6.method337(0, arg8, var18, field1679[arg1], false, null, arg3, arg7, var17, var15, var22);
            if (var16.field659) {
                if (arg1 == 0) {
                    this.field1689[arg7][arg3][arg8 + 1] = 50;
                } else if (arg1 == 1) {
                    this.field1689[arg7][arg3 + 1][arg8 + 1] = 50;
                } else if (arg1 == 2) {
                    this.field1689[arg7][arg3 + 1][arg8] = 50;
                } else if (arg1 == 3) {
                    this.field1689[arg7][arg3][arg8] = 50;
                }
            }
            if (var16.field630 && arg2 != null) {
                arg2.method229(arg4, var16.field655, arg1, (byte) -50, arg3, arg8);
            }
        } else if (arg4 == 2) {
            int var23 = arg1 + 1 & 0x3;
            class3 var24;
            class3 var25;
            if (var16.field634 == -1 && var16.field614 == null) {
                var24 = var16.method190(2, arg1 + 4, var11, var12, var13, var14, -1);
                var25 = var16.method190(2, var23, var11, var12, var13, var14, -1);
            } else {
                var24 = new class22(var13, var12, var14, true, true, var11, 2, arg1 + 4, arg0, var16.field634);
                var25 = new class22(var13, var12, var14, true, true, var11, 2, var23, arg0, var16.field634);
            }
            arg6.method337(field1695[var23], arg8, var18, field1695[arg1], false, var25, arg3, arg7, var17, var15, var24);
            if (var16.field665) {
                if (arg1 == 0) {
                    this.field1697[arg7][arg3][arg8] |= 0x249;
                    this.field1697[arg7][arg3][arg8 + 1] |= 0x492;
                } else if (arg1 == 1) {
                    this.field1697[arg7][arg3][arg8 + 1] |= 0x492;
                    this.field1697[arg7][arg3 + 1][arg8] |= 0x249;
                } else if (arg1 == 2) {
                    this.field1697[arg7][arg3 + 1][arg8] |= 0x249;
                    this.field1697[arg7][arg3][arg8] |= 0x492;
                } else if (arg1 == 3) {
                    this.field1697[arg7][arg3][arg8] |= 0x492;
                    this.field1697[arg7][arg3][arg8] |= 0x249;
                }
            }
            if (var16.field630 && arg2 != null) {
                arg2.method229(arg4, var16.field655, arg1, (byte) -50, arg3, arg8);
            }
            if (var16.field640 != 16) {
                arg6.method345(arg7, var16.field640, arg3, (byte) -92, arg8);
            }
        } else if (arg4 == 3) {
            class3 var26;
            if (var16.field634 == -1 && var16.field614 == null) {
                var26 = var16.method190(3, arg1, var11, var12, var13, var14, -1);
            } else {
                var26 = new class22(var13, var12, var14, true, true, var11, 3, arg1, arg0, var16.field634);
            }
            arg6.method337(0, arg8, var18, field1679[arg1], false, null, arg3, arg7, var17, var15, var26);
            if (var16.field659) {
                if (arg1 == 0) {
                    this.field1689[arg7][arg3][arg8 + 1] = 50;
                } else if (arg1 == 1) {
                    this.field1689[arg7][arg3 + 1][arg8 + 1] = 50;
                } else if (arg1 == 2) {
                    this.field1689[arg7][arg3 + 1][arg8] = 50;
                } else if (arg1 == 3) {
                    this.field1689[arg7][arg3][arg8] = 50;
                }
            }
            if (var16.field630 && arg2 != null) {
                arg2.method229(arg4, var16.field655, arg1, (byte) -50, arg3, arg8);
            }
        } else if (arg4 == 9) {
            class3 var27;
            if (var16.field634 == -1 && var16.field614 == null) {
                var27 = var16.method190(arg4, arg1, var11, var12, var13, var14, -1);
            } else {
                var27 = new class22(var13, var12, var14, true, true, var11, arg4, arg1, arg0, var16.field634);
            }
            arg6.method339(arg8, (byte) 0, arg7, 1, var17, var15, arg3, var18, 1, var27, 0);
            if (var16.field630 && arg2 != null) {
                arg2.method230(var16.field656, arg1, arg3, var16.field655, -433, var16.field636, arg8);
            }
        } else {
            if (var16.field623) {
                if (arg1 == 1) {
                    int var28 = var14;
                    var14 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var28;
                } else if (arg1 == 2) {
                    int var29 = var14;
                    var14 = var12;
                    var12 = var29;
                    int var30 = var13;
                    var13 = var11;
                    var11 = var30;
                } else if (arg1 == 3) {
                    int var31 = var14;
                    var14 = var11;
                    var11 = var12;
                    var12 = var13;
                    var13 = var31;
                }
            }
            if (arg4 == 4) {
                class3 var32;
                if (var16.field634 == -1 && var16.field614 == null) {
                    var32 = var16.method190(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var32 = new class22(var13, var12, var14, true, true, var11, 4, 0, arg0, var16.field634);
                }
                arg6.method338(var17, var15, 0, field1695[arg1], var18, var32, arg8, arg1 * 512, 0, -11470, arg3, arg7);
            } else if (arg4 == 5) {
                int var33 = 16;
                int var34 = arg6.method355(arg7, arg3, arg8);
                if (var34 > 0) {
                    var33 = class9.method184(var34 >> 14 & 0x7FFF).field640;
                }
                class3 var35;
                if (var16.field634 == -1 && var16.field614 == null) {
                    var35 = var16.method190(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var35 = new class22(var13, var12, var14, true, true, var11, 4, 0, arg0, var16.field634);
                }
                arg6.method338(var17, var15, field1683[arg1] * var33, field1695[arg1], var18, var35, arg8, arg1 * 512, field1676[arg1] * var33, -11470, arg3, arg7);
            } else if (arg4 == 6) {
                class3 var36;
                if (var16.field634 == -1 && var16.field614 == null) {
                    var36 = var16.method190(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var36 = new class22(var13, var12, var14, true, true, var11, 4, 0, arg0, var16.field634);
                }
                arg6.method338(var17, var15, 0, 256, var18, var36, arg8, arg1, 0, -11470, arg3, arg7);
            } else if (arg4 == 7) {
                class3 var37;
                if (var16.field634 == -1 && var16.field614 == null) {
                    var37 = var16.method190(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var37 = new class22(var13, var12, var14, true, true, var11, 4, 0, arg0, var16.field634);
                }
                arg6.method338(var17, var15, 0, 512, var18, var37, arg8, arg1, 0, -11470, arg3, arg7);
            } else if (arg4 == 8) {
                class3 var38;
                if (var16.field634 == -1 && var16.field614 == null) {
                    var38 = var16.method190(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var38 = new class22(var13, var12, var14, true, true, var11, 4, 0, arg0, var16.field634);
                }
                arg6.method338(var17, var15, 0, 768, var18, var38, arg8, arg1, 0, -11470, arg3, arg7);
            }
        }
    }

    @OriginalMember(owner = "client!YTWJKTVW", name = "b", descriptor = "(IIII)I")
    private static final int method579(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class11.field681[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }
}
