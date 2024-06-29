import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class460 extends class378 {

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "Lpm;")
    private class12 field6808;

    @OriginalMember(owner = "client!pf", name = "x", descriptor = "I")
    private int field6819;

    @OriginalMember(owner = "client!pf", name = "v", descriptor = "[[I")
    public int[][] field6817;

    @OriginalMember(owner = "client!pf", name = "r", descriptor = "[[I")
    private int[][] field6813;

    @OriginalMember(owner = "client!pf", name = "z", descriptor = "I")
    private int field6821;

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "I")
    private int field6806;

    @OriginalMember(owner = "client!pf", name = "o", descriptor = "[[B")
    private byte[][] field6810;

    @OriginalMember(owner = "client!pf", name = "u", descriptor = "[[B")
    private byte[][] field6816;

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "I")
    private int field6803;

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "I")
    private int field6804;

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "I")
    private int field6809;

    @OriginalMember(owner = "client!pf", name = "p", descriptor = "I")
    private int field6811;

    @OriginalMember(owner = "client!pf", name = "q", descriptor = "I")
    private int field6812;

    @OriginalMember(owner = "client!pf", name = "s", descriptor = "I")
    private int field6814;

    @OriginalMember(owner = "client!pf", name = "t", descriptor = "I")
    private int field6815;

    @OriginalMember(owner = "client!pf", name = "w", descriptor = "I")
    private int field6818;

    @OriginalMember(owner = "client!pf", name = "y", descriptor = "I")
    private int field6820;

    @OriginalMember(owner = "client!pf", name = "A", descriptor = "I")
    private int field6822;

    @OriginalMember(owner = "client!pf", name = "C", descriptor = "I")
    private int field6824;

    @OriginalMember(owner = "client!pf", name = "D", descriptor = "I")
    private int field6825;

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "[[Lgd;")
    private class114[][] field6805;

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "[[Lsb;")
    private class374[][] field6807;

    @OriginalMember(owner = "client!pf", name = "B", descriptor = "[[Lfj;")
    private class412[][] field6823;

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "[[Lfb;")
    private class48[][] field6802;

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Lpm;IIII[[I[[II)V")
    public class460(class12 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4);
        this.field6808 = arg0;
        this.field6819 = arg2;
        this.field6817 = arg5;
        this.field6813 = arg6;
        this.field6821 = arg7;
        this.field6806 = 0;
        while (arg7 > 1) {
            ++this.field6806;
            arg7 >>= 1;
        }
        this.field6810 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field6808.field204 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = this.field6817[var11 + 1][var10] - this.field6817[var11 - 1][var10];
                int var14 = this.field6817[var11][var10 + 1] - this.field6817[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + var13 * var13 + 65536));
                int var16 = (var13 << 8) / var15;
                int var17 = -65536 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field6808.field172 * var18 + this.field6808.field178 * var17 + this.field6808.field171 * var16 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field6810[var11][var10] = (byte) var20;
            }
        }
        this.field6816 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "(II)I")
    private static final int method2856(int arg0, int arg1) {
        int var2 = (arg0 & 16711680) * arg1 >> 23;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 253) {
            var2 = 253;
        }
        int var3 = (arg0 & 65280) * arg1 >> 15;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 253) {
            var3 = 253;
        }
        int var4 = (arg0 & 255) * arg1 >> 7;
        if (var4 < 2) {
            var4 = 2;
        } else if (var4 > 253) {
            var4 = 253;
        }
        return var2 << 16 | var3 << 8 | var4;
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(II)I")
    public final int method1427(int arg0, int arg1) {
        int var3 = arg0 >> this.field6806;
        int var4 = arg1 >> this.field6806;
        if (var3 >= 0 && var4 >= 0 && var3 <= super.field5538 - 1 && var4 <= super.field5540 - 1) {
            int var5 = arg0 & this.field6821 - 1;
            int var6 = arg1 & this.field6821 - 1;
            int var7 = (this.field6821 - var5) * this.field6817[var3][var4] + this.field6817[var3 + 1][var4] * var5 >> this.field6806;
            int var8 = (this.field6821 - var5) * this.field6817[var3][var4 + 1] + this.field6817[var3 + 1][var4 + 1] * var5 >> this.field6806;
            return (this.field6821 - var6) * var7 + var6 * var8 >> this.field6806;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(III[[ZZ)V")
    public final void method1419(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        class122 var6 = this.field6808.field207;
        this.field6804 = var6.field1630;
        this.field6820 = var6.field1629;
        this.field6803 = var6.field1627;
        this.field6812 = var6.field1624;
        this.field6822 = var6.field1631;
        this.field6809 = var6.field1620;
        this.field6811 = var6.field1621;
        this.field6815 = var6.field1626;
        this.field6825 = var6.field1625;
        this.field6818 = var6.field1623;
        this.field6824 = var6.field1628;
        this.field6814 = var6.field1622;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)V")
    public final void method1424(int arg0, int arg1, int arg2) {
        if (this.field6816[arg0][arg1] < arg2) {
            this.field6816[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIZLfi;[I[I[I)V")
    private final void method2857(int arg0, int arg1, boolean arg2, class172 arg3, int[] arg4, int[] arg5, int[] arg6) {
        class114 var8 = this.field6805[arg0][arg1];
        if (var8 != null) {
            if ((var8.field1552 & 2) == 0) {
                int var9 = this.field6821 * arg0;
                int var10 = this.field6821 + var9;
                int var11 = this.field6821 * arg1;
                int var12 = this.field6821 + var11;
                int var13 = 0;
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                int var19;
                int var20;
                int var21;
                int var22;
                int var29;
                int var30;
                int var31;
                int var32;
                int var33;
                int var34;
                int var35;
                int var36;
                int var37;
                int var38;
                int var39;
                int var40;
                int var41;
                int var42;
                int var43;
                int var44;
                if ((var8.field1552 & 1) != 0 && !arg2) {
                    int var17 = this.field6817[arg0][arg1];
                    int var18 = this.field6818 * var17;
                    var19 = (this.field6824 * var11 + this.field6825 * var9 + var18 >> 15) + this.field6814;
                    if (var19 <= this.field6808.field164) {
                        return;
                    }
                    var20 = (this.field6824 * var11 + this.field6825 * var10 + var18 >> 15) + this.field6814;
                    if (var20 <= this.field6808.field164) {
                        return;
                    }
                    var21 = (this.field6824 * var12 + this.field6825 * var10 + var18 >> 15) + this.field6814;
                    if (var21 <= this.field6808.field164) {
                        return;
                    }
                    var22 = (this.field6824 * var12 + this.field6825 * var9 + var18 >> 15) + this.field6814;
                    if (var22 <= this.field6808.field164) {
                        return;
                    }
                    if (this.field6808.field208) {
                        int var23 = var19 - this.field6808.field191;
                        if (var23 > 0) {
                            var13 = var23;
                            if (var23 > 255) {
                                var13 = 255;
                            }
                        }
                        int var24 = var20 - this.field6808.field191;
                        if (var24 > 0) {
                            var14 = var24;
                            if (var24 > 255) {
                                var14 = 255;
                            }
                        }
                        int var25 = var21 - this.field6808.field191;
                        if (var25 > 0) {
                            var15 = var25;
                            if (var25 > 255) {
                                var15 = 255;
                            }
                        }
                        int var26 = var22 - this.field6808.field191;
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    int var27 = this.field6820 * var17;
                    int var28 = this.field6809 * var17;
                    var29 = (this.field6803 * var11 + this.field6804 * var9 + var27 >> 15) + this.field6812;
                    var30 = this.field6808.field203 * var29 / var19 + arg3.field2249;
                    var31 = (this.field6811 * var11 + this.field6822 * var9 + var28 >> 15) + this.field6815;
                    var32 = this.field6808.field168 * var31 / var19 + arg3.field2243;
                    var33 = (this.field6803 * var11 + this.field6804 * var10 + var27 >> 15) + this.field6812;
                    var34 = this.field6808.field203 * var33 / var20 + arg3.field2249;
                    var35 = (this.field6811 * var11 + this.field6822 * var10 + var28 >> 15) + this.field6815;
                    var36 = this.field6808.field168 * var35 / var20 + arg3.field2243;
                    var37 = (this.field6803 * var12 + this.field6804 * var10 + var27 >> 15) + this.field6812;
                    var38 = this.field6808.field203 * var37 / var21 + arg3.field2249;
                    var39 = (this.field6811 * var12 + this.field6822 * var10 + var28 >> 15) + this.field6815;
                    var40 = this.field6808.field168 * var39 / var21 + arg3.field2243;
                    var41 = (this.field6803 * var12 + this.field6804 * var9 + var27 >> 15) + this.field6812;
                    var42 = this.field6808.field203 * var41 / var22 + arg3.field2249;
                    var43 = (this.field6811 * var12 + this.field6822 * var9 + var28 >> 15) + this.field6815;
                    var44 = this.field6808.field168 * var43 / var22 + arg3.field2243;
                } else {
                    int var45 = this.field6817[arg0][arg1];
                    int var46 = this.field6817[arg0 + 1][arg1];
                    int var47 = this.field6817[arg0 + 1][arg1 + 1];
                    int var48 = this.field6817[arg0][arg1 + 1];
                    var19 = (this.field6824 * var11 + this.field6825 * var9 + this.field6818 * var45 >> 15) + this.field6814;
                    if (var19 <= this.field6808.field164) {
                        return;
                    }
                    var20 = (this.field6824 * var11 + this.field6825 * var10 + this.field6818 * var46 >> 15) + this.field6814;
                    if (var20 <= this.field6808.field164) {
                        return;
                    }
                    var21 = (this.field6824 * var12 + this.field6825 * var10 + this.field6818 * var47 >> 15) + this.field6814;
                    if (var21 <= this.field6808.field164) {
                        return;
                    }
                    var22 = (this.field6824 * var12 + this.field6825 * var9 + this.field6818 * var48 >> 15) + this.field6814;
                    if (var22 <= this.field6808.field164) {
                        return;
                    }
                    if (arg2) {
                        int var49 = var19 - this.field6808.field191;
                        if (var49 > 255) {
                            var49 = 255;
                        }
                        if (var49 > 0) {
                            var13 = var49;
                            int var50 = this.field6813[arg0][arg1] * var49 / 255;
                            if (var50 > 0) {
                                var45 -= var50;
                            }
                        }
                        int var51 = var20 - this.field6808.field191;
                        if (var51 > 255) {
                            var51 = 255;
                        }
                        if (var51 > 0) {
                            var14 = var51;
                            int var52 = this.field6813[arg0 + 1][arg1] * var51 / 255;
                            if (var52 > 0) {
                                var46 -= var52;
                            }
                        }
                        int var53 = var21 - this.field6808.field191;
                        if (var53 > 255) {
                            var53 = 255;
                        }
                        if (var53 > 0) {
                            var15 = var53;
                            int var54 = this.field6813[arg0 + 1][arg1 + 1] * var53 / 255;
                            if (var54 > 0) {
                                var47 -= var54;
                            }
                        }
                        int var55 = var22 - this.field6808.field191;
                        if (var55 > 255) {
                            var55 = 255;
                        }
                        if (var55 > 0) {
                            var16 = var55;
                            int var56 = this.field6813[arg0][arg1 + 1] * var55 / 255;
                            if (var56 > 0) {
                                var48 -= var56;
                            }
                        }
                    } else if (this.field6808.field208) {
                        int var57 = var19 - this.field6808.field191;
                        if (var57 > 0) {
                            var13 = var57;
                            if (var57 > 255) {
                                var13 = 255;
                            }
                        }
                        int var58 = var20 - this.field6808.field191;
                        if (var58 > 0) {
                            var14 = var58;
                            if (var58 > 255) {
                                var14 = 255;
                            }
                        }
                        int var59 = var21 - this.field6808.field191;
                        if (var59 > 0) {
                            var15 = var59;
                            if (var59 > 255) {
                                var15 = 255;
                            }
                        }
                        int var60 = var22 - this.field6808.field191;
                        if (var60 > 0) {
                            var16 = var60;
                            if (var60 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    var29 = (this.field6803 * var11 + this.field6820 * var45 + this.field6804 * var9 >> 15) + this.field6812;
                    var30 = this.field6808.field203 * var29 / var19 + arg3.field2249;
                    var31 = (this.field6811 * var11 + this.field6822 * var9 + this.field6809 * var45 >> 15) + this.field6815;
                    var32 = this.field6808.field168 * var31 / var19 + arg3.field2243;
                    var33 = (this.field6803 * var11 + this.field6820 * var46 + this.field6804 * var10 >> 15) + this.field6812;
                    var34 = this.field6808.field203 * var33 / var20 + arg3.field2249;
                    var35 = (this.field6811 * var11 + this.field6822 * var10 + this.field6809 * var46 >> 15) + this.field6815;
                    var36 = this.field6808.field168 * var35 / var20 + arg3.field2243;
                    var37 = (this.field6803 * var12 + this.field6820 * var47 + this.field6804 * var10 >> 15) + this.field6812;
                    var38 = this.field6808.field203 * var37 / var21 + arg3.field2249;
                    var39 = (this.field6811 * var12 + this.field6822 * var10 + this.field6809 * var47 >> 15) + this.field6815;
                    var40 = this.field6808.field168 * var39 / var21 + arg3.field2243;
                    var41 = (this.field6803 * var12 + this.field6820 * var48 + this.field6804 * var9 >> 15) + this.field6812;
                    var42 = this.field6808.field203 * var41 / var22 + arg3.field2249;
                    var43 = (this.field6811 * var12 + this.field6822 * var9 + this.field6809 * var48 >> 15) + this.field6815;
                    var44 = this.field6808.field168 * var43 / var22 + arg3.field2243;
                }
                boolean var61 = var8.field1553 != -1 && this.method2858(this.field6808.field182.method468((byte) -37, var8.field1553).field279);
                int var62 = var14 + var15 + var16;
                if ((var36 - var44) * (var38 - var42) - (var34 - var42) * (var40 - var44) > 0) {
                    arg3.field2244 = var38 < 0 || var42 < 0 || var34 < 0 || var38 > arg3.field2239 || var42 > arg3.field2239 || var34 > arg3.field2239;
                    if (var62 < 765) {
                        if (var61) {
                            arg3.field2246 = 100;
                        }
                        if (var62 > 0) {
                            if (var8.field1553 >= 0) {
                                arg3.method1117(var40, var44, var36, var38, var42, var34, this.field6808.field163, var15, var16, var14, var8.field1554, var8.field1550, var8.field1555, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field1553);
                            } else {
                                arg3.method1120(var40, var44, var36, var38, var42, var34, class93.method635(true, var8.field1554, var15 << 24 | this.field6808.field163), class93.method635(true, var8.field1550, var16 << 24 | this.field6808.field163), class93.method635(true, var8.field1555, var14 << 24 | this.field6808.field163));
                            }
                        } else if (var8.field1553 >= 0) {
                            arg3.method1115(var40, var44, var36, var38, var42, var34, var8.field1554, var8.field1550, var8.field1555, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field1553);
                        } else {
                            arg3.method1120(var40, var44, var36, var38, var42, var34, var8.field1554, var8.field1550, var8.field1555);
                        }
                        arg3.field2246 = 0;
                    } else {
                        arg3.method1111(var40, var44, var36, var38, var42, var34, this.field6808.field163);
                    }
                }
                int var63 = var13 + var14 + var16;
                if ((var30 - var34) * (var44 - var36) - (var32 - var36) * (var42 - var34) > 0) {
                    arg3.field2244 = var30 < 0 || var34 < 0 || var42 < 0 || var30 > arg3.field2239 || var34 > arg3.field2239 || var42 > arg3.field2239;
                    if (var63 < 765) {
                        if (var61) {
                            arg3.field2246 = 100;
                        }
                        if (var63 > 0) {
                            if (var8.field1553 >= 0) {
                                arg3.method1117(var32, var36, var44, var30, var34, var42, this.field6808.field163, var13, var14, var16, var8.field1551, var8.field1555, var8.field1550, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field1553);
                            } else {
                                arg3.method1120(var32, var36, var44, var30, var34, var42, class93.method635(true, var8.field1551, var13 << 24 | this.field6808.field163), class93.method635(true, var8.field1555, var14 << 24 | this.field6808.field163), class93.method635(true, var8.field1550, var16 << 24 | this.field6808.field163));
                            }
                        } else if (var8.field1553 >= 0) {
                            arg3.method1115(var32, var36, var44, var30, var34, var42, var8.field1551, var8.field1555, var8.field1550, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field1553);
                        } else {
                            arg3.method1120(var32, var36, var44, var30, var34, var42, var8.field1551, var8.field1555, var8.field1550);
                        }
                        arg3.field2246 = 0;
                        return;
                    }
                    arg3.method1111(var32, var36, var44, var30, var34, var42, this.field6808.field163);
                }
            }
        } else {
            class374 var64 = this.field6807[arg0][arg1];
            if (var64 != null) {
                for (int var65 = 0; var65 < var64.field5462; ++var65) {
                    short var105 = var64.field5463[var65];
                    int var106 = var64.field5459[var65];
                    short var107 = var64.field5464[var65];
                    int var108 = (this.field6824 * var107 + this.field6825 * var105 + this.field6818 * var106 >> 15) + this.field6814;
                    if (var108 <= this.field6808.field164) {
                        return;
                    }
                    arg6[var65] = 0;
                    if (arg2) {
                        int var109 = var108 - this.field6808.field191;
                        if (var109 > 255) {
                            var109 = 255;
                        }
                        if (var109 > 0) {
                            arg6[var65] = var109;
                            int var110 = var64.field5461[var65] * var109 / 255;
                            if (var110 > 0) {
                                var106 -= var110;
                            }
                        }
                    } else if (this.field6808.field208) {
                        int var111 = var108 - this.field6808.field191;
                        if (var111 > 0) {
                            arg6[var65] = var111;
                            if (arg6[var65] > 255) {
                                arg6[var65] = 255;
                            }
                        }
                    }
                    int var112 = (this.field6803 * var107 + this.field6820 * var106 + this.field6804 * var105 >> 15) + this.field6812;
                    int var113 = (this.field6811 * var107 + this.field6822 * var105 + this.field6809 * var106 >> 15) + this.field6815;
                    arg4[var65] = this.field6808.field203 * var112 / var108 + arg3.field2249;
                    arg5[var65] = this.field6808.field168 * var113 / var108 + arg3.field2243;
                }
                if (var64.field5458 != null) {
                    int var66 = this.field6817[arg0][arg1];
                    int var67 = this.field6817[arg0 + 1][arg1];
                    int var68 = this.field6817[arg0][arg1 + 1];
                    int var69 = this.field6821 * arg0;
                    int var70 = this.field6821 + var69;
                    int var71 = this.field6821 * arg1;
                    int var72 = this.field6821 + var71;
                    int var73 = (this.field6803 * var71 + this.field6820 * var66 + this.field6804 * var69 >> 15) + this.field6812;
                    int var74 = (this.field6811 * var71 + this.field6822 * var69 + this.field6809 * var66 >> 15) + this.field6815;
                    int var75 = (this.field6824 * var71 + this.field6825 * var69 + this.field6818 * var66 >> 15) + this.field6814;
                    int var76 = (this.field6803 * var71 + this.field6820 * var67 + this.field6804 * var70 >> 15) + this.field6812;
                    int var77 = (this.field6811 * var71 + this.field6822 * var70 + this.field6809 * var67 >> 15) + this.field6815;
                    int var78 = (this.field6824 * var71 + this.field6825 * var70 + this.field6818 * var67 >> 15) + this.field6814;
                    int var79 = (this.field6803 * var72 + this.field6820 * var68 + this.field6804 * var69 >> 15) + this.field6812;
                    int var80 = (this.field6811 * var72 + this.field6822 * var69 + this.field6809 * var68 >> 15) + this.field6815;
                    int var81 = (this.field6824 * var72 + this.field6825 * var69 + this.field6818 * var68 >> 15) + this.field6814;
                    for (int var82 = 0; var82 < var64.field5465; ++var82) {
                        int var83 = var82 * 3;
                        int var84 = var83 + 1;
                        int var85 = var84 + 1;
                        int var86 = arg4[var83];
                        int var87 = arg4[var84];
                        int var88 = arg4[var85];
                        int var89 = arg5[var83];
                        int var90 = arg5[var84];
                        int var91 = arg5[var85];
                        int var92 = arg6[var83] + arg6[var84] + arg6[var85];
                        if ((var86 - var87) * (var91 - var90) - (var88 - var87) * (var89 - var90) > 0) {
                            arg3.field2244 = var86 < 0 || var87 < 0 || var88 < 0 || var86 > arg3.field2239 || var87 > arg3.field2239 || var88 > arg3.field2239;
                            short var93 = var64.field5458[var82];
                            if (var92 < 765) {
                                if (var93 != -1 && this.method2858(this.field6808.field182.method468((byte) -37, var93).field279)) {
                                    arg3.field2246 = 100;
                                }
                                if (var92 > 0) {
                                    if (var93 != -1) {
                                        arg3.method1117(var89, var90, var91, var86, var87, var88, this.field6808.field163, arg6[var83], arg6[var84], arg6[var85], var64.field5466[var83], var64.field5466[var84], var64.field5466[var85], var73, var76, var79, var74, var77, var80, var75, var78, var81, var93);
                                    } else if ((var64.field5466[var83] & 16777215) != 0) {
                                        arg3.method1120(var89, var90, var91, var86, var87, var88, class93.method635(true, var64.field5466[var83], arg6[var83] << 24 | this.field6808.field163), class93.method635(true, var64.field5466[var84], arg6[var84] << 24 | this.field6808.field163), class93.method635(true, var64.field5466[var85], arg6[var85] << 24 | this.field6808.field163));
                                    }
                                } else if (var93 != -1) {
                                    arg3.method1115(var89, var90, var91, var86, var87, var88, var64.field5466[var83], var64.field5466[var84], var64.field5466[var85], var73, var76, var79, var74, var77, var80, var75, var78, var81, var93);
                                } else if ((var64.field5466[var83] & 16777215) != 0) {
                                    arg3.method1120(var89, var90, var91, var86, var87, var88, var64.field5466[var83], var64.field5466[var84], var64.field5466[var85]);
                                }
                                arg3.field2246 = 0;
                            } else {
                                arg3.method1111(var89, var90, var91, var86, var87, var88, this.field6808.field163);
                            }
                        }
                    }
                    return;
                }
                for (int var94 = 0; var94 < var64.field5465; ++var94) {
                    int var95 = var94 * 3;
                    int var96 = var95 + 1;
                    int var97 = var96 + 1;
                    int var98 = arg4[var95];
                    int var99 = arg4[var96];
                    int var100 = arg4[var97];
                    int var101 = arg5[var95];
                    int var102 = arg5[var96];
                    int var103 = arg5[var97];
                    int var104 = arg6[var95] + arg6[var96] + arg6[var97];
                    if ((var98 - var99) * (var103 - var102) - (var100 - var99) * (var101 - var102) > 0) {
                        arg3.field2244 = var98 < 0 || var99 < 0 || var100 < 0 || var98 > arg3.field2239 || var99 > arg3.field2239 || var100 > arg3.field2239;
                        if (var104 < 765) {
                            if (var104 > 0) {
                                if ((var64.field5466[var95] & 16777215) != 0) {
                                    arg3.method1120(var101, var102, var103, var98, var99, var100, class44.method370(var64.field5466[var95], false, arg6[var95], this.field6808.field163), class44.method370(var64.field5466[var96], false, arg6[var96], this.field6808.field163), class44.method370(var64.field5466[var97], false, arg6[var97], this.field6808.field163));
                                }
                            } else if ((var64.field5466[var95] & 16777215) != 0) {
                                arg3.method1120(var101, var102, var103, var98, var99, var100, var64.field5466[var95], var64.field5466[var96], var64.field5466[var97]);
                            }
                        } else {
                            arg3.method1111(var101, var102, var103, var98, var99, var100, this.field6808.field163);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(Lqh;IIIIZ)V")
    public final void method1430(class337 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)Z")
    private final boolean method2858(int arg0) {
        if ((this.field6819 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else {
            return arg0 == 8;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIIIII[[ZLfi;[I[I)V")
    private final void method2859(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class172 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field2245 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field6805[var16][var17] != null) {
                        class114 var18 = this.field6805[var16][var17];
                        if (var18.field1553 != -1 && (var18.field1552 & 2) == 0 && var18.field1556 == 0) {
                            int var19 = this.field6808.method193(var18.field1553);
                            arg8.method1121(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class402.method2512(var19, var18.field1554, -30597), class402.method2512(var19, var18.field1550, -30597), class402.method2512(var19, var18.field1555, -30597));
                            arg8.method1121(var15, var15, var15 - var13, var14, var13 + var14, var14, class402.method2512(var19, var18.field1551, -30597), class402.method2512(var19, var18.field1555, -30597), class402.method2512(var19, var18.field1550, -30597));
                        } else if (var18.field1556 == 0) {
                            arg8.method1120(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field1554, var18.field1550, var18.field1555);
                            arg8.method1120(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field1551, var18.field1555, var18.field1550);
                        } else {
                            int var20 = var18.field1556;
                            arg8.method1120(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class93.method635(true, var20, var18.field1554 & -16777216), class93.method635(true, var20, var18.field1550 & -16777216), class93.method635(true, var20, var18.field1555 & -16777216));
                            arg8.method1120(var15, var15, var15 - var13, var14, var13 + var14, var14, class93.method635(true, var20, var18.field1551 & -16777216), class93.method635(true, var20, var18.field1555 & -16777216), class93.method635(true, var20, var18.field1550 & -16777216));
                        }
                    } else if (this.field6807[var16][var17] != null) {
                        class374 var21 = this.field6807[var16][var17];
                        for (int var22 = 0; var22 < var21.field5462; ++var22) {
                            arg9[var22] = (var21.field5463[var22] - this.field6821 * var16) * var13 / this.field6821 + var14;
                            arg10[var22] = var15 - (var21.field5464[var22] - this.field6821 * var17) * var13 / this.field6821;
                        }
                        for (int var23 = 0; var23 < var21.field5465; ++var23) {
                            int var24 = var23 * 3;
                            int var25 = var24 + 1;
                            int var26 = var25 + 1;
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field5460 != null && var21.field5460[var23] != 0 && (var21.field5458 == null || var21.field5458 != null && var21.field5458[var23] == -1)) {
                                int var33 = var21.field5460[var23];
                                arg8.method1120(var30, var31, var32, var27, var28, var29, class93.method635(true, var33, -16777216 - (var21.field5466[var24] & -16777216)), class93.method635(true, var33, -16777216 - (var21.field5466[var25] & -16777216)), class93.method635(true, var33, -16777216 - (var21.field5466[var26] & -16777216)));
                            } else if (var21.field5458 != null && var21.field5458[var23] != -1) {
                                int var34 = this.field6808.method193(var21.field5458[var23]);
                                arg8.method1121(var30, var31, var32, var27, var28, var29, var34, var34, var34);
                            } else {
                                arg8.method1120(var30, var31, var32, var27, var28, var29, var21.field5466[var24], var21.field5466[var25], var21.field5466[var26]);
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field2245 = true;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)I")
    public final int method1429(int arg0, int arg1) {
        return this.field6817[arg0][arg1];
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method1422(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class130 var9 = this.field6808.method195(Thread.currentThread());
        class172 var10 = var9.field1725;
        var10.field2246 = 0;
        var10.field2244 = false;
        if (this.field6805 != null) {
            this.method2859(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field1778, var9.field1747);
        } else {
            if (this.field6802 != null) {
                this.method2860(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field1778, var9.field1747);
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lap;[I)V")
    public final void method1432(class298 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lqh;IIIIZ)V")
    public final void method1431(class337 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(IIIIIII[[ZLfi;[I[I)V")
    private final void method2860(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class172 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field2245 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field6802[var16][var17] != null) {
                        class48 var18 = this.field6802[var16][var17];
                        if (var18.field621 != -1 && (var18.field622 & 2) == 0 && var18.field620 == -1) {
                            int var19 = this.field6808.method193(var18.field621);
                            arg8.method1121(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class402.method2512(var19, var18.field624 & 65535, -30597), class402.method2512(var19, var18.field623 & 65535, -30597), class402.method2512(var19, var18.field625 & 65535, -30597));
                            arg8.method1121(var15, var15, var15 - var13, var14, var13 + var14, var14, class402.method2512(var19, var18.field626 & 65535, -30597), class402.method2512(var19, var18.field625 & 65535, -30597), class402.method2512(var19, var18.field623 & 65535, -30597));
                        } else if (var18.field620 == -1) {
                            arg8.method1121(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field624 & 65535, var18.field623 & 65535, var18.field625 & 65535);
                            arg8.method1121(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field626 & 65535, var18.field625 & 65535, var18.field623 & 65535);
                        } else {
                            int var20 = var18.field620;
                            arg8.method1121(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var20, var20, var20);
                            arg8.method1121(var15, var15, var15 - var13, var14, var13 + var14, var14, var20, var20, var20);
                        }
                    } else if (this.field6823[var16][var17] != null) {
                        class412 var21 = this.field6823[var16][var17];
                        for (int var22 = 0; var22 < var21.field5924; ++var22) {
                            arg9[var22] = (var21.field5926[var22] - this.field6821 * var16) * var13 / this.field6821 + var14;
                            arg10[var22] = var15 - (var21.field5927[var22] - this.field6821 * var17) * var13 / this.field6821;
                        }
                        for (int var23 = 0; var23 < var21.field5928; ++var23) {
                            short var24 = var21.field5931[var23];
                            short var25 = var21.field5922[var23];
                            short var26 = var21.field5929[var23];
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field5920 != null && var21.field5920[var23] != -1) {
                                int var33 = var21.field5920[var23];
                                arg8.method1121(var30, var31, var32, var27, var28, var29, class402.method2512(var33, var21.field5932[var24], -30597), class402.method2512(var33, var21.field5932[var25], -30597), class402.method2512(var33, var21.field5932[var26], -30597));
                            } else if (var21.field5923 != null && var21.field5923[var23] != -1) {
                                int var34 = this.field6808.method193(var21.field5923[var23]);
                                arg8.method1121(var30, var31, var32, var27, var28, var29, class402.method2512(var34, var21.field5932[var24], -30597), class402.method2512(var34, var21.field5932[var25], -30597), class402.method2512(var34, var21.field5932[var26], -30597));
                            } else {
                                int var35 = var21.field5930[var23];
                                arg8.method1121(var30, var31, var32, var27, var28, var29, class402.method2512(var35, var21.field5932[var24], -30597), class402.method2512(var35, var21.field5932[var25], -30597), class402.method2512(var35, var21.field5932[var26], -30597));
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field2245 = true;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V")
    public final void method1423(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9, int arg10, boolean arg11) {
        if (this.field6805 == null) {
            this.field6805 = new class114[super.field5538][super.field5540];
            this.field6807 = new class374[super.field5538][super.field5540];
        } else if (this.field6802 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var13 = 0; var13 < arg5.length; ++var13) {
                if (arg5[var13] == -1) {
                    arg5[var13] = 0;
                } else {
                    arg5[var13] = class10.field129[class57.method429(arg5[var13], 127) & 65535] << 8 | 255;
                }
            }
            if (arg6 != null) {
                for (int var14 = 0; var14 < arg6.length; ++var14) {
                    if (arg6[var14] == -1) {
                        arg6[var14] = 0;
                    } else {
                        arg6[var14] = class10.field129[class57.method429(arg6[var14], 127) & 65535] << 8 | 255;
                    }
                }
            }
            boolean var15 = true;
            int var16 = -1;
            int var17 = -1;
            int var18 = -1;
            int var19 = -1;
            if (arg2.length == 6) {
                for (int var20 = 0; var20 < 6; ++var20) {
                    if (arg2[var20] == 0 && arg4[var20] == 0) {
                        if (var16 != -1 && arg5[var16] != arg5[var20]) {
                            var15 = false;
                            break;
                        }
                        var16 = var20;
                    } else if (arg2[var20] == this.field6821 && arg4[var20] == 0) {
                        if (var17 != -1 && arg5[var17] != arg5[var20]) {
                            var15 = false;
                            break;
                        }
                        var17 = var20;
                    } else if (arg2[var20] == this.field6821 && arg4[var20] == this.field6821) {
                        if (var18 != -1 && arg5[var18] != arg5[var20]) {
                            var15 = false;
                            break;
                        }
                        var18 = var20;
                    } else if (arg2[var20] == 0 && arg4[var20] == this.field6821) {
                        if (var19 != -1 && arg5[var19] != arg5[var20]) {
                            var15 = false;
                            break;
                        }
                        var19 = var20;
                    }
                }
                if (var16 == -1 || var17 == -1 || var18 == -1 || var19 == -1) {
                    var15 = false;
                }
                if (var15) {
                    if (arg3 != null) {
                        for (int var21 = 0; var21 < 4; ++var21) {
                            if (arg3[var21] != 0) {
                                var15 = false;
                                break;
                            }
                        }
                    }
                    if (var15) {
                        for (int var22 = 1; var22 < 4; ++var22) {
                            if (arg2[var22] != arg2[0] && arg2[0] + this.field6821 != arg2[var22] && arg2[0] - this.field6821 != arg2[var22]) {
                                var15 = false;
                                break;
                            }
                            if (arg4[var22] != arg4[0] && arg4[0] + this.field6821 != arg4[var22] && arg4[0] - this.field6821 != arg4[var22]) {
                                var15 = false;
                                break;
                            }
                        }
                    }
                }
            } else {
                var15 = false;
            }
            if (var15) {
                class114 var23 = new class114();
                int var24 = arg5[0];
                int var25 = arg7[0];
                if (arg6 != null) {
                    var23.field1556 = arg6[0] >> 8;
                    if (var24 == 0) {
                        var23.field1552 = (byte) (var23.field1552 | 2);
                    }
                } else if (var24 == 0) {
                    return;
                }
                if (this.field6817[arg0 + 1][arg1] == this.field6817[arg0][arg1] && this.field6817[arg0 + 1][arg1 + 1] == this.field6817[arg0][arg1] && this.field6817[arg0][arg1 + 1] == this.field6817[arg0][arg1]) {
                    var23.field1552 = (byte) (var23.field1552 | 1);
                }
                if (var25 != -1 && (var23.field1552 & 2) == 0 && !this.field6808.field182.method468((byte) -37, var25).field260) {
                    var23.field1551 = this.field6810[arg0][arg1] - this.field6816[arg0][arg1];
                    var23.field1555 = this.field6810[arg0 + 1][arg1] - this.field6816[arg0 + 1][arg1];
                    var23.field1554 = this.field6810[arg0 + 1][arg1 + 1] - this.field6816[arg0 + 1][arg1 + 1];
                    var23.field1550 = this.field6810[arg0][arg1 + 1] - this.field6816[arg0][arg1 + 1];
                    var23.field1553 = (short) var25;
                } else {
                    int var26;
                    if (this.field6813 != null && arg10 != 0) {
                        var26 = this.field6813[arg0][arg1] * 255 / arg10;
                        if (var26 < 0) {
                            var26 = 0;
                        } else if (var26 > 255) {
                            var26 = 255;
                        }
                    } else {
                        var26 = 0;
                    }
                    var23.field1551 = class44.method370(method2856(arg5[var16] >> 8, this.field6810[arg0][arg1] - this.field6816[arg0][arg1]), false, var26, arg9);
                    if (var23.field1556 != 0) {
                        var23.field1551 |= 255 - (this.field6810[arg0][arg1] - this.field6816[arg0][arg1]) << 25;
                    }
                    int var27;
                    if (this.field6813 != null && arg10 != 0) {
                        var27 = this.field6813[arg0 + 1][arg1] * 255 / arg10;
                        if (var27 < 0) {
                            var27 = 0;
                        } else if (var27 > 255) {
                            var27 = 255;
                        }
                    } else {
                        var27 = 0;
                    }
                    var23.field1555 = class44.method370(method2856(arg5[var17] >> 8, this.field6810[arg0 + 1][arg1] - this.field6816[arg0 + 1][arg1]), false, var27, arg9);
                    if (var23.field1556 != 0) {
                        var23.field1555 |= 255 - (this.field6810[arg0 + 1][arg1] - this.field6816[arg0 + 1][arg1]) << 25;
                    }
                    int var28;
                    if (this.field6813 != null && arg10 != 0) {
                        var28 = this.field6813[arg0 + 1][arg1 + 1] * 255 / arg10;
                        if (var28 < 0) {
                            var28 = 0;
                        } else if (var28 > 255) {
                            var28 = 255;
                        }
                    } else {
                        var28 = 0;
                    }
                    var23.field1554 = class44.method370(method2856(arg5[var18] >> 8, this.field6810[arg0 + 1][arg1 + 1] - this.field6816[arg0 + 1][arg1 + 1]), false, var28, arg9);
                    if (var23.field1556 != 0) {
                        var23.field1554 |= 255 - (this.field6810[arg0 + 1][arg1 + 1] - this.field6816[arg0 + 1][arg1 + 1]) << 25;
                    }
                    int var29;
                    if (this.field6813 != null && arg10 != 0) {
                        var29 = this.field6813[arg0][arg1 + 1] * 255 / arg10;
                        if (var29 < 0) {
                            var29 = 0;
                        } else if (var29 > 255) {
                            var29 = 255;
                        }
                    } else {
                        var29 = 0;
                    }
                    var23.field1550 = class44.method370(method2856(arg5[var19] >> 8, this.field6810[arg0][arg1 + 1] - this.field6816[arg0][arg1 + 1]), false, var29, arg9);
                    if (var23.field1556 != 0) {
                        var23.field1550 |= 255 - (this.field6810[arg0][arg1 + 1] - this.field6816[arg0][arg1 + 1]) << 25;
                    }
                    var23.field1553 = -1;
                }
                this.field6805[arg0][arg1] = var23;
            } else {
                class374 var30 = new class374();
                var30.field5462 = (short) arg2.length;
                var30.field5465 = (short) (arg2.length / 3);
                var30.field5463 = new short[var30.field5462];
                var30.field5459 = new short[var30.field5462];
                var30.field5464 = new short[var30.field5462];
                var30.field5466 = new int[var30.field5462];
                if (this.field6813 != null) {
                    var30.field5461 = new short[var30.field5462];
                }
                for (int var31 = 0; var31 < var30.field5462; ++var31) {
                    int var46 = arg2[var31];
                    int var47 = arg4[var31];
                    boolean var48 = false;
                    int var49;
                    if (var46 == 0 && var47 == 0) {
                        var49 = this.field6810[arg0][arg1] - this.field6816[arg0][arg1];
                    } else if (var46 == 0 && this.field6821 == var47) {
                        var49 = this.field6810[arg0][arg1 + 1] - this.field6816[arg0][arg1 + 1];
                    } else if (this.field6821 == var46 && this.field6821 == var47) {
                        var49 = this.field6810[arg0 + 1][arg1 + 1] - this.field6816[arg0 + 1][arg1 + 1];
                    } else if (this.field6821 == var46 && var47 == 0) {
                        var49 = this.field6810[arg0 + 1][arg1] - this.field6816[arg0 + 1][arg1];
                    } else {
                        int var50 = (this.field6810[arg0 + 1][arg1] - this.field6816[arg0 + 1][arg1]) * var46 + (this.field6810[arg0][arg1] - this.field6816[arg0][arg1]) * (this.field6821 - var46);
                        int var51 = (this.field6810[arg0 + 1][arg1 + 1] - this.field6816[arg0 + 1][arg1 + 1]) * var46 + (this.field6810[arg0][arg1 + 1] - this.field6816[arg0][arg1 + 1]) * (this.field6821 - var46);
                        var49 = (this.field6821 - var47) * var50 + var47 * var51 >> this.field6806 * 2;
                    }
                    short var52 = (short) ((arg0 << this.field6806) + var46);
                    short var53 = (short) ((arg1 << this.field6806) + var47);
                    var30.field5463[var31] = var52;
                    var30.field5464[var31] = var53;
                    var30.field5459[var31] = (short) (this.method1427(var52, var53) + (arg3 != null ? arg3[var31] : 0));
                    if (var49 < 0) {
                        var49 = 0;
                    }
                    if (arg7[var31] != -1 && !this.field6808.field182.method468((byte) -37, arg7[var31]).field260) {
                        var30.field5466[var31] = var49;
                    } else if (arg5[var31] == 0) {
                        if (arg6 != null) {
                            var30.field5466[var31] = var49 << 25;
                        } else {
                            var30.field5466[var31] = 0;
                        }
                    } else {
                        int var54 = 0;
                        if (this.field6813 != null) {
                            boolean var55 = false;
                            int var56;
                            if (var46 == 0 && var47 == 0) {
                                var56 = this.field6813[arg0][arg1];
                            } else if (var46 == 0 && this.field6821 == var47) {
                                var56 = this.field6813[arg0][arg1 + 1];
                            } else if (this.field6821 == var46 && this.field6821 == var47) {
                                var56 = this.field6813[arg0 + 1][arg1 + 1];
                            } else if (this.field6821 == var46 && var47 == 0) {
                                var56 = this.field6813[arg0 + 1][arg1];
                            } else {
                                int var57 = (this.field6821 - var46) * this.field6813[arg0][arg1] + this.field6813[arg0 + 1][arg1] * var46;
                                int var58 = (this.field6821 - var46) * this.field6813[arg0][arg1 + 1] + this.field6813[arg0 + 1][arg1 + 1] * var46;
                                var56 = (this.field6821 - var47) * var57 + var47 * var58 >> this.field6806 * 2;
                            }
                            var30.field5461[var31] = (short) var56;
                            if (arg10 != 0) {
                                var54 = var56 * 255 / arg10;
                                if (var54 < 0) {
                                    var54 = 0;
                                } else if (var54 > 255) {
                                    var54 = 255;
                                }
                            }
                        }
                        var30.field5466[var31] = class44.method370(method2856(arg5[var31] >> 8, var49), false, var54, arg9);
                        if (arg6 != null) {
                            var30.field5466[var31] |= var49 << 25;
                        }
                    }
                }
                boolean var32 = false;
                for (int var33 = 0; var33 < var30.field5465; ++var33) {
                    if (arg7[var33 * 3] != -1 && !this.field6808.field182.method468((byte) -37, arg7[var33 * 3]).field260) {
                        var32 = true;
                    }
                }
                if (arg6 != null) {
                    var30.field5460 = new int[var30.field5465];
                }
                if (var32) {
                    var30.field5458 = new short[var30.field5465];
                    var30.field5457 = new short[var30.field5465];
                }
                for (int var34 = 0; var34 < var30.field5465; ++var34) {
                    int var35 = var34 * 3;
                    if (arg6 != null && arg6[var35] != 0) {
                        var30.field5460[var34] = arg6[var35] >> 8;
                    }
                    if (var32) {
                        int var36 = var35 + 1;
                        int var37 = var36 + 1;
                        boolean var38 = false;
                        boolean var39 = true;
                        int var40 = arg7[var35];
                        if (var40 != -1 && !this.field6808.field182.method468((byte) -37, var40).field260) {
                            var38 = true;
                        } else {
                            var39 = false;
                        }
                        int var41 = arg7[var36];
                        if (var41 != -1 && !this.field6808.field182.method468((byte) -37, var41).field260) {
                            var38 = true;
                        } else {
                            var39 = false;
                        }
                        int var42 = arg7[var37];
                        if (var42 != -1 && !this.field6808.field182.method468((byte) -37, var42).field260) {
                            var38 = true;
                        } else {
                            var39 = false;
                        }
                        if (var39) {
                            var30.field5458[var34] = (short) var42;
                            var30.field5457[var34] = (short) arg8[var35];
                        } else {
                            if (var38) {
                                int var43 = arg7[var35];
                                if (var43 != -1 && !this.field6808.field182.method468((byte) -37, var43).field260) {
                                    var30.field5466[var35] = class10.field129[class57.method429(this.field6808.field182.method468((byte) -37, var43).field259 & 65535, 127) & 65535];
                                }
                                int var44 = arg7[var36];
                                if (var44 != -1 && !this.field6808.field182.method468((byte) -37, var44).field260) {
                                    var30.field5466[var36] = class10.field129[class57.method429(this.field6808.field182.method468((byte) -37, var44).field259 & 65535, 127) & 65535];
                                }
                                int var45 = arg7[var37];
                                if (var45 != -1 && !this.field6808.field182.method468((byte) -37, var45).field260) {
                                    var30.field5466[var37] = class10.field129[class57.method429(this.field6808.field182.method468((byte) -37, var45).field259 & 65535, 127) & 65535];
                                }
                            }
                            var30.field5458[var34] = -1;
                        }
                    }
                }
                this.field6807[arg0][arg1] = var30;
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IILfi;[I[I[I)V")
    private final void method2861(int arg0, int arg1, class172 arg2, int[] arg3, int[] arg4, int[] arg5) {
        class48 var7 = this.field6802[arg0][arg1];
        if (var7 != null) {
            if ((var7.field622 & 2) == 0) {
                int var8 = this.field6821 * arg0;
                int var9 = this.field6821 + var8;
                int var10 = this.field6821 * arg1;
                int var11 = this.field6821 + var10;
                int var14;
                int var15;
                int var17;
                int var20;
                int var21;
                int var22;
                int var23;
                int var24;
                int var25;
                int var26;
                int var27;
                int var29;
                int var31;
                int var32;
                int var33;
                int var34;
                int var35;
                if ((var7.field622 & 1) != 0) {
                    int var12 = this.field6817[arg0][arg1];
                    int var13 = this.field6818 * var12;
                    var14 = (this.field6824 * var10 + this.field6825 * var8 + var13 >> 15) + this.field6814;
                    if (var14 <= this.field6808.field164) {
                        return;
                    }
                    var15 = (this.field6824 * var10 + this.field6825 * var9 + var13 >> 15) + this.field6814;
                    if (var15 <= this.field6808.field164) {
                        return;
                    }
                    int var16 = (this.field6824 * var11 + this.field6825 * var9 + var13 >> 15) + this.field6814;
                    if (var16 <= this.field6808.field164) {
                        return;
                    }
                    var17 = (this.field6824 * var11 + this.field6825 * var8 + var13 >> 15) + this.field6814;
                    if (var17 <= this.field6808.field164) {
                        return;
                    }
                    int var18 = this.field6820 * var12;
                    int var19 = this.field6809 * var12;
                    var20 = (this.field6803 * var10 + this.field6804 * var8 + var18 >> 15) + this.field6812;
                    var21 = this.field6808.field203 * var20 / var14 + arg2.field2249;
                    var22 = (this.field6811 * var10 + this.field6822 * var8 + var19 >> 15) + this.field6815;
                    var23 = this.field6808.field168 * var22 / var14 + arg2.field2243;
                    var24 = (this.field6803 * var10 + this.field6804 * var9 + var18 >> 15) + this.field6812;
                    var25 = this.field6808.field203 * var24 / var15 + arg2.field2249;
                    var26 = (this.field6811 * var10 + this.field6822 * var9 + var19 >> 15) + this.field6815;
                    var27 = this.field6808.field168 * var26 / var15 + arg2.field2243;
                    int var28 = (this.field6803 * var11 + this.field6804 * var9 + var18 >> 15) + this.field6812;
                    var29 = this.field6808.field203 * var28 / var16 + arg2.field2249;
                    int var30 = (this.field6811 * var11 + this.field6822 * var9 + var19 >> 15) + this.field6815;
                    var31 = this.field6808.field168 * var30 / var16 + arg2.field2243;
                    var32 = (this.field6803 * var11 + this.field6804 * var8 + var18 >> 15) + this.field6812;
                    var33 = this.field6808.field203 * var32 / var17 + arg2.field2249;
                    var34 = (this.field6811 * var11 + this.field6822 * var8 + var19 >> 15) + this.field6815;
                    var35 = this.field6808.field168 * var34 / var17 + arg2.field2243;
                } else {
                    int var36 = this.field6817[arg0][arg1];
                    int var37 = this.field6817[arg0 + 1][arg1];
                    int var38 = this.field6817[arg0 + 1][arg1 + 1];
                    int var39 = this.field6817[arg0][arg1 + 1];
                    var14 = (this.field6824 * var10 + this.field6825 * var8 + this.field6818 * var36 >> 15) + this.field6814;
                    if (var14 <= this.field6808.field164) {
                        return;
                    }
                    var15 = (this.field6824 * var10 + this.field6825 * var9 + this.field6818 * var37 >> 15) + this.field6814;
                    if (var15 <= this.field6808.field164) {
                        return;
                    }
                    int var40 = (this.field6824 * var11 + this.field6825 * var9 + this.field6818 * var38 >> 15) + this.field6814;
                    if (var40 <= this.field6808.field164) {
                        return;
                    }
                    var17 = (this.field6824 * var11 + this.field6825 * var8 + this.field6818 * var39 >> 15) + this.field6814;
                    if (var17 <= this.field6808.field164) {
                        return;
                    }
                    var20 = (this.field6803 * var10 + this.field6820 * var36 + this.field6804 * var8 >> 15) + this.field6812;
                    var21 = this.field6808.field203 * var20 / var14 + arg2.field2249;
                    var22 = (this.field6811 * var10 + this.field6822 * var8 + this.field6809 * var36 >> 15) + this.field6815;
                    var23 = this.field6808.field168 * var22 / var14 + arg2.field2243;
                    var24 = (this.field6803 * var10 + this.field6820 * var37 + this.field6804 * var9 >> 15) + this.field6812;
                    var25 = this.field6808.field203 * var24 / var15 + arg2.field2249;
                    var26 = (this.field6811 * var10 + this.field6822 * var9 + this.field6809 * var37 >> 15) + this.field6815;
                    var27 = this.field6808.field168 * var26 / var15 + arg2.field2243;
                    int var41 = (this.field6803 * var11 + this.field6820 * var38 + this.field6804 * var9 >> 15) + this.field6812;
                    var29 = this.field6808.field203 * var41 / var40 + arg2.field2249;
                    int var42 = (this.field6811 * var11 + this.field6822 * var9 + this.field6809 * var38 >> 15) + this.field6815;
                    var31 = this.field6808.field168 * var42 / var40 + arg2.field2243;
                    var32 = (this.field6803 * var11 + this.field6820 * var39 + this.field6804 * var8 >> 15) + this.field6812;
                    var33 = this.field6808.field203 * var32 / var17 + arg2.field2249;
                    var34 = (this.field6811 * var11 + this.field6822 * var8 + this.field6809 * var39 >> 15) + this.field6815;
                    var35 = this.field6808.field168 * var34 / var17 + arg2.field2243;
                }
                if ((var27 - var35) * (var29 - var33) - (var25 - var33) * (var31 - var35) > 0) {
                    arg2.field2244 = var29 < 0 || var33 < 0 || var25 < 0 || var29 > arg2.field2239 || var33 > arg2.field2239 || var25 > arg2.field2239;
                    if (var7.field621 >= 0) {
                        if (this.method2858(this.field6808.field182.method468((byte) -37, var7.field621).field279)) {
                            arg2.field2246 = 100;
                        }
                        arg2.method1115(var31, var35, var27, var29, var33, var25, var7.field624 & 65535, var7.field623 & 65535, var7.field625 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field621);
                        arg2.field2246 = 0;
                    } else {
                        arg2.method1121(var31, var35, var27, var29, var33, var25, var7.field624 & 65535, var7.field623 & 65535, var7.field625 & 65535);
                    }
                }
                if ((var21 - var25) * (var35 - var27) - (var23 - var27) * (var33 - var25) > 0) {
                    arg2.field2244 = var21 < 0 || var25 < 0 || var33 < 0 || var21 > arg2.field2239 || var25 > arg2.field2239 || var33 > arg2.field2239;
                    if (var7.field621 >= 0) {
                        if (this.method2858(this.field6808.field182.method468((byte) -37, var7.field621).field279)) {
                            arg2.field2246 = 100;
                        }
                        arg2.method1115(var23, var27, var35, var21, var25, var33, var7.field626 & 65535, var7.field625 & 65535, var7.field623 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field621);
                        arg2.field2246 = 0;
                        return;
                    }
                    arg2.method1121(var23, var27, var35, var21, var25, var33, var7.field626 & 65535, var7.field625 & 65535, var7.field623 & 65535);
                }
            }
        } else {
            class412 var43 = this.field6823[arg0][arg1];
            if (var43 != null) {
                for (int var44 = 0; var44 < var43.field5924; ++var44) {
                    int var84 = var43.field5926[var44];
                    int var85 = var43.field5925[var44];
                    int var86 = var43.field5927[var44];
                    int var87 = (this.field6824 * var86 + this.field6825 * var84 + this.field6818 * var85 >> 15) + this.field6814;
                    if (var87 <= this.field6808.field164) {
                        return;
                    }
                    int var88 = (this.field6803 * var86 + this.field6820 * var85 + this.field6804 * var84 >> 15) + this.field6812;
                    int var89 = (this.field6811 * var86 + this.field6822 * var84 + this.field6809 * var85 >> 15) + this.field6815;
                    arg3[var44] = this.field6808.field203 * var88 / var87 + arg2.field2249;
                    arg4[var44] = this.field6808.field168 * var89 / var87 + arg2.field2243;
                }
                if (var43.field5923 != null) {
                    int var45 = this.field6817[arg0][arg1];
                    int var46 = this.field6817[arg0 + 1][arg1];
                    int var47 = this.field6817[arg0][arg1 + 1];
                    int var48 = this.field6821 * arg0;
                    int var49 = this.field6821 + var48;
                    int var50 = this.field6821 * arg1;
                    int var51 = this.field6821 + var50;
                    int var52 = (this.field6803 * var50 + this.field6820 * var45 + this.field6804 * var48 >> 15) + this.field6812;
                    int var53 = (this.field6811 * var50 + this.field6822 * var48 + this.field6809 * var45 >> 15) + this.field6815;
                    int var54 = (this.field6824 * var50 + this.field6825 * var48 + this.field6818 * var45 >> 15) + this.field6814;
                    int var55 = (this.field6803 * var50 + this.field6820 * var46 + this.field6804 * var49 >> 15) + this.field6812;
                    int var56 = (this.field6811 * var50 + this.field6822 * var49 + this.field6809 * var46 >> 15) + this.field6815;
                    int var57 = (this.field6824 * var50 + this.field6825 * var49 + this.field6818 * var46 >> 15) + this.field6814;
                    int var58 = (this.field6803 * var51 + this.field6820 * var47 + this.field6804 * var48 >> 15) + this.field6812;
                    int var59 = (this.field6811 * var51 + this.field6822 * var48 + this.field6809 * var47 >> 15) + this.field6815;
                    int var60 = (this.field6824 * var51 + this.field6825 * var48 + this.field6818 * var47 >> 15) + this.field6814;
                    for (int var61 = 0; var61 < var43.field5928; ++var61) {
                        short var62 = var43.field5931[var61];
                        short var63 = var43.field5922[var61];
                        short var64 = var43.field5929[var61];
                        int var65 = arg3[var62];
                        int var66 = arg3[var63];
                        int var67 = arg3[var64];
                        int var68 = arg4[var62];
                        int var69 = arg4[var63];
                        int var70 = arg4[var64];
                        if ((var65 - var66) * (var70 - var69) - (var67 - var66) * (var68 - var69) > 0) {
                            arg2.field2244 = var65 < 0 || var66 < 0 || var67 < 0 || var65 > arg2.field2239 || var66 > arg2.field2239 || var67 > arg2.field2239;
                            short var71 = var43.field5923[var61];
                            if (var71 != -1) {
                                if (this.method2858(this.field6808.field182.method468((byte) -37, var71).field279)) {
                                    arg2.field2246 = 100;
                                }
                                arg2.method1115(var68, var69, var70, var65, var66, var67, var43.field5932[var62], var43.field5932[var63], var43.field5932[var64], var52, var55, var58, var53, var56, var59, var54, var57, var60, var71);
                                arg2.field2246 = 0;
                            } else {
                                int var72 = var43.field5930[var61];
                                if (var72 != -1) {
                                    arg2.method1121(var68, var69, var70, var65, var66, var67, class402.method2512(var72, var43.field5932[var62], -30597), class402.method2512(var72, var43.field5932[var63], -30597), class402.method2512(var72, var43.field5932[var64], -30597));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var73 = 0; var73 < var43.field5928; ++var73) {
                    short var74 = var43.field5931[var73];
                    short var75 = var43.field5922[var73];
                    short var76 = var43.field5929[var73];
                    int var77 = arg3[var74];
                    int var78 = arg3[var75];
                    int var79 = arg3[var76];
                    int var80 = arg4[var74];
                    int var81 = arg4[var75];
                    int var82 = arg4[var76];
                    if ((var77 - var78) * (var82 - var81) - (var79 - var78) * (var80 - var81) > 0) {
                        int var83 = var43.field5930[var73];
                        if (var83 != -1) {
                            arg2.field2244 = var77 < 0 || var78 < 0 || var79 < 0 || var77 > arg2.field2239 || var78 > arg2.field2239 || var79 > arg2.field2239;
                            arg2.method1121(var80, var81, var82, var77, var78, var79, class402.method2512(var83, var43.field5932[var74], -30597), class402.method2512(var83, var43.field5932[var75], -30597), class402.method2512(var83, var43.field5932[var76], -30597));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "()V")
    public final void method1421() {
        this.field6810 = null;
        this.field6816 = null;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IILqh;)Lqh;")
    public final class337 method1426(int arg0, int arg1, class337 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(Lqh;IIIIZ)Z")
    public final boolean method1428(class337 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V")
    public final void method1425(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int arg12, int arg13, boolean arg14) {
        if (this.field6802 == null) {
            this.field6802 = new class48[super.field5538][super.field5540];
            this.field6823 = new class412[super.field5538][super.field5540];
        } else if (this.field6805 != null) {
            throw new IllegalStateException();
        }
        boolean var16 = false;
        if (arg8.length == 2 && arg5.length == 2 && (arg8[0] == arg8[1] || arg10[0] != -1 && arg10[0] == arg10[1])) {
            var16 = true;
            for (int var17 = 1; var17 < 2; ++var17) {
                int var18 = arg2[arg5[var17]];
                int var19 = arg4[arg5[var17]];
                if (var18 != 0 && this.field6821 != var18 || var19 != 0 && this.field6821 != var19) {
                    var16 = false;
                    break;
                }
            }
        }
        if (!var16) {
            class412 var20 = new class412();
            short var21 = (short) arg2.length;
            short var22 = (short) arg8.length;
            var20.field5924 = var21;
            var20.field5932 = new short[var21];
            var20.field5926 = new int[var21];
            var20.field5925 = new int[var21];
            var20.field5927 = new int[var21];
            for (int var23 = 0; var23 < var21; ++var23) {
                int var28 = arg2[var23];
                int var29 = arg4[var23];
                if (var28 == 0 && var29 == 0) {
                    var20.field5932[var23] = (short) (this.field6810[arg0][arg1] - this.field6816[arg0][arg1]);
                } else if (var28 == 0 && this.field6821 == var29) {
                    var20.field5932[var23] = (short) (this.field6810[arg0][arg1 + 1] - this.field6816[arg0][arg1 + 1]);
                } else if (this.field6821 == var28 && this.field6821 == var29) {
                    var20.field5932[var23] = (short) (this.field6810[arg0 + 1][arg1 + 1] - this.field6816[arg0 + 1][arg1 + 1]);
                } else if (this.field6821 == var28 && var29 == 0) {
                    var20.field5932[var23] = (short) (this.field6810[arg0 + 1][arg1] - this.field6816[arg0 + 1][arg1]);
                } else {
                    int var30 = (this.field6810[arg0 + 1][arg1] - this.field6816[arg0 + 1][arg1]) * var28 + (this.field6810[arg0][arg1] - this.field6816[arg0][arg1]) * (this.field6821 - var28);
                    int var31 = (this.field6810[arg0 + 1][arg1 + 1] - this.field6816[arg0 + 1][arg1 + 1]) * var28 + (this.field6810[arg0][arg1 + 1] - this.field6816[arg0][arg1 + 1]) * (this.field6821 - var28);
                    var20.field5932[var23] = (short) ((this.field6821 - var29) * var30 + var29 * var31 >> this.field6806 * 2);
                }
                int var32 = (arg0 << this.field6806) + var28;
                int var33 = (arg1 << this.field6806) + var29;
                var20.field5926[var23] = var32;
                var20.field5927[var23] = var33;
                var20.field5925[var23] = this.method1427(var32, var33) + (arg3 != null ? arg3[var23] : 0);
                if (var20.field5932[var23] < 2) {
                    var20.field5932[var23] = 2;
                }
            }
            boolean var24 = false;
            int var25 = 0;
            for (int var26 = 0; var26 < var22; ++var26) {
                if (arg8[var26] >= 0 || arg9 != null && arg9[var26] >= 0) {
                    ++var25;
                }
                if (arg10[var26] != -1 && !this.field6808.field182.method468((byte) -37, arg10[var26]).field260) {
                    var24 = true;
                }
            }
            var20.field5930 = new int[var25];
            if (arg9 != null) {
                var20.field5920 = new int[var25];
            }
            var20.field5931 = new short[var25];
            var20.field5922 = new short[var25];
            var20.field5929 = new short[var25];
            if (var24) {
                var20.field5923 = new short[var25];
                var20.field5921 = new short[var25];
            }
            for (int var27 = 0; var27 < var22; ++var27) {
                if (arg8[var27] >= 0 || arg9 != null && arg9[var27] >= 0) {
                    if (arg8[var27] >= 0) {
                        var20.field5930[var20.field5928] = class57.method429(arg8[var27], 127);
                    } else {
                        var20.field5930[var20.field5928] = -1;
                    }
                    if (arg9 != null) {
                        if (arg9[var27] != -1) {
                            var20.field5920[var20.field5928] = class57.method429(arg9[var27], 127);
                        } else {
                            var20.field5920[var20.field5928] = -1;
                        }
                    }
                    var20.field5931[var20.field5928] = (short) arg5[var27];
                    var20.field5922[var20.field5928] = (short) arg6[var27];
                    var20.field5929[var20.field5928] = (short) arg7[var27];
                    if (var24) {
                        if (arg10[var27] != -1 && !this.field6808.field182.method468((byte) -37, arg10[var27]).field260) {
                            var20.field5923[var20.field5928] = (short) arg10[var27];
                            var20.field5921[var20.field5928] = (short) arg11[var27];
                        } else {
                            var20.field5923[var20.field5928] = -1;
                        }
                    }
                    ++var20.field5928;
                }
            }
            this.field6823[arg0][arg1] = var20;
        } else {
            if (arg8[0] >= 0 || arg9 != null && arg9[0] >= 0) {
                class48 var34 = new class48();
                int var35 = arg8[0];
                int var36 = arg10[0];
                if (arg9 != null) {
                    var34.field620 = class402.method2512(class57.method429(arg9[0], 127), this.field6810[arg0][arg1] - this.field6816[arg0][arg1], -30597);
                    if (var35 == -1) {
                        var34.field622 = (byte) (var34.field622 | 2);
                    }
                }
                if (this.field6817[arg0 + 1][arg1] == this.field6817[arg0][arg1] && this.field6817[arg0 + 1][arg1 + 1] == this.field6817[arg0][arg1] && this.field6817[arg0][arg1 + 1] == this.field6817[arg0][arg1]) {
                    var34.field622 = (byte) (var34.field622 | 1);
                }
                if (var36 != -1 && (var34.field622 & 2) == 0 && !this.field6808.field182.method468((byte) -37, var36).field260) {
                    var34.field626 = (short) (this.field6810[arg0][arg1] - this.field6816[arg0][arg1]);
                    var34.field625 = (short) (this.field6810[arg0 + 1][arg1] - this.field6816[arg0 + 1][arg1]);
                    var34.field624 = (short) (this.field6810[arg0 + 1][arg1 + 1] - this.field6816[arg0 + 1][arg1 + 1]);
                    var34.field623 = (short) (this.field6810[arg0][arg1 + 1] - this.field6816[arg0][arg1 + 1]);
                    var34.field621 = (short) var36;
                } else {
                    short var37 = class57.method429(var35, 127);
                    var34.field626 = (short) class402.method2512(var37, this.field6810[arg0][arg1] - this.field6816[arg0][arg1], -30597);
                    var34.field625 = (short) class402.method2512(var37, this.field6810[arg0 + 1][arg1] - this.field6816[arg0 + 1][arg1], -30597);
                    var34.field624 = (short) class402.method2512(var37, this.field6810[arg0 + 1][arg1 + 1] - this.field6816[arg0 + 1][arg1 + 1], -30597);
                    var34.field623 = (short) class402.method2512(var37, this.field6810[arg0][arg1 + 1] - this.field6816[arg0][arg1 + 1], -30597);
                    var34.field621 = -1;
                }
                this.field6802[arg0][arg1] = var34;
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(II)V")
    public final void method1420(int arg0, int arg1) {
        class130 var3 = this.field6808.method195(Thread.currentThread());
        var3.field1725.field2246 = 0;
        if (this.field6805 != null) {
            this.method2857(arg0, arg1, this.field6808.field201, var3.field1725, var3.field1778, var3.field1747, var3.field1754);
        } else {
            if (this.field6802 != null) {
                this.method2861(arg0, arg1, var3.field1725, var3.field1778, var3.field1747, var3.field1754);
            }
        }
    }
}
