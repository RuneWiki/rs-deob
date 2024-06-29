import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public class class113 extends class11 {

    @OriginalMember(owner = "client!su", name = "y", descriptor = "I")
    private int field1743 = -1;

    @OriginalMember(owner = "client!su", name = "B", descriptor = "Lqf;")
    private class146 field1746;

    @OriginalMember(owner = "client!su", name = "r", descriptor = "I")
    private int field1736;

    @OriginalMember(owner = "client!su", name = "l", descriptor = "[[I")
    public int[][] field1730;

    @OriginalMember(owner = "client!su", name = "q", descriptor = "[[B")
    private byte[][] field1735;

    @OriginalMember(owner = "client!su", name = "A", descriptor = "[[B")
    private byte[][] field1745;

    @OriginalMember(owner = "client!su", name = "i", descriptor = "I")
    private int field1727;

    @OriginalMember(owner = "client!su", name = "j", descriptor = "I")
    private int field1728;

    @OriginalMember(owner = "client!su", name = "k", descriptor = "I")
    private int field1729;

    @OriginalMember(owner = "client!su", name = "n", descriptor = "I")
    private int field1732;

    @OriginalMember(owner = "client!su", name = "o", descriptor = "I")
    private int field1733;

    @OriginalMember(owner = "client!su", name = "p", descriptor = "I")
    private int field1734;

    @OriginalMember(owner = "client!su", name = "s", descriptor = "I")
    private int field1737;

    @OriginalMember(owner = "client!su", name = "t", descriptor = "I")
    private int field1738;

    @OriginalMember(owner = "client!su", name = "u", descriptor = "I")
    private int field1739;

    @OriginalMember(owner = "client!su", name = "w", descriptor = "I")
    private int field1741;

    @OriginalMember(owner = "client!su", name = "z", descriptor = "I")
    private int field1744;

    @OriginalMember(owner = "client!su", name = "C", descriptor = "I")
    private int field1747;

    @OriginalMember(owner = "client!su", name = "v", descriptor = "[[Lth;")
    private class211[][] field1740;

    @OriginalMember(owner = "client!su", name = "m", descriptor = "[[Lrv;")
    private class226[][] field1731;

    @OriginalMember(owner = "client!su", name = "x", descriptor = "[[Lpb;")
    private class302[][] field1742;

    @OriginalMember(owner = "client!su", name = "h", descriptor = "[[Lht;")
    private class465[][] field1726;

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(IIIIIII[[ZLqh;[I[I)V", line = 5)
    private final void method865(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class233 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field3503 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field1731[var16][var17] != null) {
                        class226 var18 = this.field1731[var16][var17];
                        if (var18.field3435 != -1 && (var18.field3436 & 2) == 0 && var18.field3433 == -1) {
                            int var19 = this.field1746.method1043(var18.field3435);
                            arg8.method1578(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class432.method2687(var19, var18.field3437 & 65535, -3935), class432.method2687(var19, var18.field3434 & 65535, -3935), class432.method2687(var19, var18.field3439 & 65535, -3935));
                            arg8.method1578(var15, var15, var15 - var13, var14, var13 + var14, var14, class432.method2687(var19, var18.field3438 & 65535, -3935), class432.method2687(var19, var18.field3439 & 65535, -3935), class432.method2687(var19, var18.field3434 & 65535, -3935));
                        } else if (var18.field3433 == -1) {
                            arg8.method1578(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field3437 & 65535, var18.field3434 & 65535, var18.field3439 & 65535);
                            arg8.method1578(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field3438 & 65535, var18.field3439 & 65535, var18.field3434 & 65535);
                        } else {
                            int var20 = var18.field3433;
                            arg8.method1578(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var20, var20, var20);
                            arg8.method1578(var15, var15, var15 - var13, var14, var13 + var14, var14, var20, var20, var20);
                        }
                    } else if (this.field1742[var16][var17] != null) {
                        class302 var21 = this.field1742[var16][var17];
                        for (int var22 = 0; var22 < var21.field4637; ++var22) {
                            arg9[var22] = var21.field4643[var22] * var13 / super.field127 + var14;
                            arg10[var22] = var15 - var21.field4634[var22] * var13 / super.field127;
                        }
                        for (int var23 = 0; var23 < var21.field4642; ++var23) {
                            short var24 = var21.field4639[var23];
                            short var25 = var21.field4640[var23];
                            short var26 = var21.field4632[var23];
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field4635 != null && var21.field4635[var23] != -1) {
                                int var33 = var21.field4635[var23];
                                arg8.method1578(var30, var31, var32, var27, var28, var29, class432.method2687(var33, var21.field4641[var24], -3935), class432.method2687(var33, var21.field4641[var25], -3935), class432.method2687(var33, var21.field4641[var26], -3935));
                            } else if (var21.field4633 != null && var21.field4633[var23] != -1) {
                                int var34 = this.field1746.method1043(var21.field4633[var23]);
                                arg8.method1578(var30, var31, var32, var27, var28, var29, class432.method2687(var34, var21.field4641[var24], -3935), class432.method2687(var34, var21.field4641[var25], -3935), class432.method2687(var34, var21.field4641[var26], -3935));
                            } else {
                                int var35 = var21.field4638[var23];
                                arg8.method1578(var30, var31, var32, var27, var28, var29, class432.method2687(var35, var21.field4641[var24], -3935), class432.method2687(var35, var21.field4641[var25], -3935), class432.method2687(var35, var21.field4641[var26], -3935));
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field3503 = true;
    }

    @OriginalMember(owner = "client!su", name = "<init>", descriptor = "(Lqf;IIII[[I[[II)V", line = 135)
    public class113(class146 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field1746 = arg0;
        this.field1736 = arg2;
        this.field1730 = arg5;
        this.field1735 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field1746.field2157 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + arg7 * 512 + var13 * var13));
                int var16 = (var13 << 8) / var15;
                int var17 = arg7 * -512 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field1746.field2148 * var18 + this.field1746.field2161 * var17 + this.field1746.field2146 * var16 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field1735[var11][var10] = (byte) var20;
            }
        }
        this.field1745 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!su", name = "ca", descriptor = "(II)I", line = 186)
    public final int method68(int arg0, int arg1) {
        int var3 = arg0 >> super.field123;
        int var4 = arg1 >> super.field123;
        if (var3 >= 0 && var4 >= 0 && var3 <= super.field124 - 1 && var4 <= super.field122 - 1) {
            int var5 = arg0 & super.field127 - 1;
            int var6 = arg1 & super.field127 - 1;
            int var7 = (super.field127 - var5) * this.field1730[var3][var4] + this.field1730[var3 + 1][var4] * var5 >> super.field123;
            int var8 = (super.field127 - var5) * this.field1730[var3][var4 + 1] + this.field1730[var3 + 1][var4 + 1] * var5 >> super.field123;
            return (super.field127 - var6) * var7 + var6 * var8 >> super.field123;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!su", name = "H", descriptor = "(Li;IIIIZ)V", line = 206)
    public final void method61(class200 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!su", name = "ua", descriptor = "(II)I", line = 212)
    public final int method56(int arg0, int arg1) {
        return this.field1730[arg0][arg1];
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(IIZLqh;[I[I[I)V", line = 216)
    private final void method866(int arg0, int arg1, boolean arg2, class233 arg3, int[] arg4, int[] arg5, int[] arg6) {
        class465 var8 = this.field1726[arg0][arg1];
        if (var8 != null) {
            if ((var8.field6868 & 2) == 0) {
                int var9 = super.field127 * arg0;
                int var10 = super.field127 + var9;
                int var11 = super.field127 * arg1;
                int var12 = super.field127 + var11;
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
                if ((var8.field6868 & 1) != 0 && !arg2) {
                    int var17 = this.field1730[arg0][arg1];
                    if (this.field1743 == -1) {
                        int var18 = this.field1741 * var17;
                        var19 = (this.field1744 * var11 + this.field1738 * var9 + var18 >> 15) + this.field1728;
                        if (var19 <= this.field1746.field2178) {
                            return;
                        }
                        var20 = (this.field1744 * var11 + this.field1738 * var10 + var18 >> 15) + this.field1728;
                        if (var20 <= this.field1746.field2178) {
                            return;
                        }
                        var21 = (this.field1744 * var12 + this.field1738 * var10 + var18 >> 15) + this.field1728;
                        if (var21 <= this.field1746.field2178) {
                            return;
                        }
                        var22 = (this.field1744 * var12 + this.field1738 * var9 + var18 >> 15) + this.field1728;
                        if (var22 <= this.field1746.field2178) {
                            return;
                        }
                    } else {
                        var22 = this.field1743;
                        var21 = this.field1743;
                        var20 = this.field1743;
                        var19 = this.field1743;
                    }
                    if (this.field1746.field2160) {
                        int var23 = var19 - this.field1746.field2164;
                        if (var23 > 0) {
                            var13 = var23;
                            if (var23 > 255) {
                                var13 = 255;
                            }
                        }
                        int var24 = var20 - this.field1746.field2164;
                        if (var24 > 0) {
                            var14 = var24;
                            if (var24 > 255) {
                                var14 = 255;
                            }
                        }
                        int var25 = var21 - this.field1746.field2164;
                        if (var25 > 0) {
                            var15 = var25;
                            if (var25 > 255) {
                                var15 = 255;
                            }
                        }
                        int var26 = var22 - this.field1746.field2164;
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    int var27 = this.field1732 * var17;
                    int var28 = this.field1733 * var17;
                    var29 = (this.field1729 * var11 + this.field1739 * var9 + var27 >> 15) + this.field1747;
                    var30 = this.field1746.field2172 * var29 / var19 + arg3.field3501;
                    var31 = (this.field1734 * var11 + this.field1727 * var9 + var28 >> 15) + this.field1737;
                    var32 = this.field1746.field2166 * var31 / var19 + arg3.field3498;
                    var33 = (this.field1729 * var11 + this.field1739 * var10 + var27 >> 15) + this.field1747;
                    var34 = this.field1746.field2172 * var33 / var20 + arg3.field3501;
                    var35 = (this.field1734 * var11 + this.field1727 * var10 + var28 >> 15) + this.field1737;
                    var36 = this.field1746.field2166 * var35 / var20 + arg3.field3498;
                    var37 = (this.field1729 * var12 + this.field1739 * var10 + var27 >> 15) + this.field1747;
                    var38 = this.field1746.field2172 * var37 / var21 + arg3.field3501;
                    var39 = (this.field1734 * var12 + this.field1727 * var10 + var28 >> 15) + this.field1737;
                    var40 = this.field1746.field2166 * var39 / var21 + arg3.field3498;
                    var41 = (this.field1729 * var12 + this.field1739 * var9 + var27 >> 15) + this.field1747;
                    var42 = this.field1746.field2172 * var41 / var22 + arg3.field3501;
                    var43 = (this.field1734 * var12 + this.field1727 * var9 + var28 >> 15) + this.field1737;
                    var44 = this.field1746.field2166 * var43 / var22 + arg3.field3498;
                } else {
                    int var45 = this.field1730[arg0][arg1];
                    int var46 = this.field1730[arg0 + 1][arg1];
                    int var47 = this.field1730[arg0 + 1][arg1 + 1];
                    int var48 = this.field1730[arg0][arg1 + 1];
                    if (this.field1743 == -1) {
                        var19 = (this.field1744 * var11 + this.field1741 * var45 + this.field1738 * var9 >> 15) + this.field1728;
                        if (var19 <= this.field1746.field2178) {
                            return;
                        }
                        var20 = (this.field1744 * var11 + this.field1741 * var46 + this.field1738 * var10 >> 15) + this.field1728;
                        if (var20 <= this.field1746.field2178) {
                            return;
                        }
                        var21 = (this.field1744 * var12 + this.field1741 * var47 + this.field1738 * var10 >> 15) + this.field1728;
                        if (var21 <= this.field1746.field2178) {
                            return;
                        }
                        var22 = (this.field1744 * var12 + this.field1741 * var48 + this.field1738 * var9 >> 15) + this.field1728;
                        if (var22 <= this.field1746.field2178) {
                            return;
                        }
                    } else {
                        var22 = this.field1743;
                        var21 = this.field1743;
                        var20 = this.field1743;
                        var19 = this.field1743;
                    }
                    if (arg2) {
                        int var49 = var19 - this.field1746.field2164;
                        if (var49 > 255) {
                            var49 = 255;
                        }
                        if (var49 > 0) {
                            var13 = var49;
                            int var50 = var8.field6876 * var49 / 255;
                            if (var50 > 0) {
                                var45 -= var50;
                            }
                        }
                        int var51 = var20 - this.field1746.field2164;
                        if (var51 > 255) {
                            var51 = 255;
                        }
                        if (var51 > 0) {
                            var14 = var51;
                            int var52 = var8.field6875 * var51 / 255;
                            if (var52 > 0) {
                                var46 -= var52;
                            }
                        }
                        int var53 = var21 - this.field1746.field2164;
                        if (var53 > 255) {
                            var53 = 255;
                        }
                        if (var53 > 0) {
                            var15 = var53;
                            int var54 = var8.field6869 * var53 / 255;
                            if (var54 > 0) {
                                var47 -= var54;
                            }
                        }
                        int var55 = var22 - this.field1746.field2164;
                        if (var55 > 255) {
                            var55 = 255;
                        }
                        if (var55 > 0) {
                            var16 = var55;
                            int var56 = var8.field6871 * var55 / 255;
                            if (var56 > 0) {
                                var48 -= var56;
                            }
                        }
                    } else if (this.field1746.field2160) {
                        int var57 = var19 - this.field1746.field2164;
                        if (var57 > 0) {
                            var13 = var57;
                            if (var57 > 255) {
                                var13 = 255;
                            }
                        }
                        int var58 = var20 - this.field1746.field2164;
                        if (var58 > 0) {
                            var14 = var58;
                            if (var58 > 255) {
                                var14 = 255;
                            }
                        }
                        int var59 = var21 - this.field1746.field2164;
                        if (var59 > 0) {
                            var15 = var59;
                            if (var59 > 255) {
                                var15 = 255;
                            }
                        }
                        int var60 = var22 - this.field1746.field2164;
                        if (var60 > 0) {
                            var16 = var60;
                            if (var60 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    var29 = (this.field1729 * var11 + this.field1739 * var9 + this.field1732 * var45 >> 15) + this.field1747;
                    var30 = this.field1746.field2172 * var29 / var19 + arg3.field3501;
                    var31 = (this.field1734 * var11 + this.field1733 * var45 + this.field1727 * var9 >> 15) + this.field1737;
                    var32 = this.field1746.field2166 * var31 / var19 + arg3.field3498;
                    var33 = (this.field1729 * var11 + this.field1739 * var10 + this.field1732 * var46 >> 15) + this.field1747;
                    var34 = this.field1746.field2172 * var33 / var20 + arg3.field3501;
                    var35 = (this.field1734 * var11 + this.field1733 * var46 + this.field1727 * var10 >> 15) + this.field1737;
                    var36 = this.field1746.field2166 * var35 / var20 + arg3.field3498;
                    var37 = (this.field1729 * var12 + this.field1739 * var10 + this.field1732 * var47 >> 15) + this.field1747;
                    var38 = this.field1746.field2172 * var37 / var21 + arg3.field3501;
                    var39 = (this.field1734 * var12 + this.field1733 * var47 + this.field1727 * var10 >> 15) + this.field1737;
                    var40 = this.field1746.field2166 * var39 / var21 + arg3.field3498;
                    var41 = (this.field1729 * var12 + this.field1739 * var9 + this.field1732 * var48 >> 15) + this.field1747;
                    var42 = this.field1746.field2172 * var41 / var22 + arg3.field3501;
                    var43 = (this.field1734 * var12 + this.field1733 * var48 + this.field1727 * var9 >> 15) + this.field1737;
                    var44 = this.field1746.field2166 * var43 / var22 + arg3.field3498;
                }
                boolean var61 = var8.field6872 != -1 && this.method870(this.field1746.field4588.method938(28923, var8.field6872).field6169);
                int var62 = var14 + var15 + var16;
                if ((var36 - var44) * (var38 - var42) - (var34 - var42) * (var40 - var44) > 0) {
                    arg3.field3496 = var38 < 0 || var42 < 0 || var34 < 0 || var38 > arg3.field3504 || var42 > arg3.field3504 || var34 > arg3.field3504;
                    if (var62 < 765) {
                        if (var61) {
                            arg3.field3505 = 100;
                        }
                        if (var62 > 0) {
                            if (var8.field6872 >= 0) {
                                arg3.method1577(var40, var44, var36, var38, var42, var34, this.field1746.field2140, var15, var16, var14, var8.field6870, var8.field6874, var8.field6867, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field6872);
                            } else {
                                arg3.method1574(var40, var44, var36, var38, var42, var34, class125.method925(var8.field6870, var15 << 24 | this.field1746.field2140, 99), class125.method925(var8.field6874, var16 << 24 | this.field1746.field2140, 127), class125.method925(var8.field6867, var14 << 24 | this.field1746.field2140, -120));
                            }
                        } else if (var8.field6872 >= 0) {
                            arg3.method1575(var40, var44, var36, var38, var42, var34, var8.field6870, var8.field6874, var8.field6867, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field6872);
                        } else {
                            arg3.method1574(var40, var44, var36, var38, var42, var34, var8.field6870, var8.field6874, var8.field6867);
                        }
                        arg3.field3505 = 0;
                    } else {
                        arg3.method1579(var40, var44, var36, var38, var42, var34, this.field1746.field2140);
                    }
                }
                int var63 = var13 + var14 + var16;
                if ((var30 - var34) * (var44 - var36) - (var32 - var36) * (var42 - var34) > 0) {
                    arg3.field3496 = var30 < 0 || var34 < 0 || var42 < 0 || var30 > arg3.field3504 || var34 > arg3.field3504 || var42 > arg3.field3504;
                    if (var63 < 765) {
                        if (var61) {
                            arg3.field3505 = 100;
                        }
                        if (var63 > 0) {
                            if (var8.field6872 >= 0) {
                                arg3.method1577(var32, var36, var44, var30, var34, var42, this.field1746.field2140, var13, var14, var16, var8.field6866, var8.field6867, var8.field6874, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field6872);
                            } else {
                                arg3.method1574(var32, var36, var44, var30, var34, var42, class125.method925(var8.field6866, var13 << 24 | this.field1746.field2140, 60), class125.method925(var8.field6867, var14 << 24 | this.field1746.field2140, 61), class125.method925(var8.field6874, var16 << 24 | this.field1746.field2140, -125));
                            }
                        } else if (var8.field6872 >= 0) {
                            arg3.method1575(var32, var36, var44, var30, var34, var42, var8.field6866, var8.field6867, var8.field6874, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field6872);
                        } else {
                            arg3.method1574(var32, var36, var44, var30, var34, var42, var8.field6866, var8.field6867, var8.field6874);
                        }
                        arg3.field3505 = 0;
                        return;
                    }
                    arg3.method1579(var32, var36, var44, var30, var34, var42, this.field1746.field2140);
                }
            }
        } else {
            class211 var64 = this.field1740[arg0][arg1];
            if (var64 != null) {
                if (this.field1743 == -1) {
                    for (int var65 = 0; var65 < var64.field3209; ++var65) {
                        int var66 = (arg0 << super.field123) + var64.field3215[var65];
                        int var67 = var64.field3210[var65];
                        int var68 = (arg1 << super.field123) + var64.field3216[var65];
                        int var69 = (this.field1744 * var68 + this.field1741 * var67 + this.field1738 * var66 >> 15) + this.field1728;
                        if (var69 <= this.field1746.field2178) {
                            return;
                        }
                        arg6[var65] = 0;
                        if (arg2) {
                            int var70 = var69 - this.field1746.field2164;
                            if (var70 > 255) {
                                var70 = 255;
                            }
                            if (var70 > 0) {
                                arg6[var65] = var70;
                                int var71 = var64.field3208[var65] * var70 / 255;
                                if (var71 > 0) {
                                    var67 -= var71;
                                }
                            }
                        } else if (this.field1746.field2160) {
                            int var72 = var69 - this.field1746.field2164;
                            if (var72 > 0) {
                                arg6[var65] = var72;
                                if (arg6[var65] > 255) {
                                    arg6[var65] = 255;
                                }
                            }
                        }
                        int var73 = (this.field1729 * var68 + this.field1739 * var66 + this.field1732 * var67 >> 15) + this.field1747;
                        int var74 = (this.field1734 * var68 + this.field1733 * var67 + this.field1727 * var66 >> 15) + this.field1737;
                        arg4[var65] = this.field1746.field2172 * var73 / var69 + arg3.field3501;
                        arg5[var65] = this.field1746.field2166 * var74 / var69 + arg3.field3498;
                    }
                } else {
                    for (int var75 = 0; var75 < var64.field3209; ++var75) {
                        int var115 = (arg0 << super.field123) + var64.field3215[var75];
                        int var116 = var64.field3210[var75];
                        int var117 = (arg1 << super.field123) + var64.field3216[var75];
                        arg6[var75] = 0;
                        if (arg2) {
                            int var118 = this.field1743 - this.field1746.field2164;
                            if (var118 > 255) {
                                var118 = 255;
                            }
                            if (var118 > 0) {
                                arg6[var75] = var118;
                                int var119 = var64.field3208[var75] * var118 / 255;
                                if (var119 > 0) {
                                    var116 -= var119;
                                }
                            }
                        } else if (this.field1746.field2160) {
                            int var120 = this.field1743 - this.field1746.field2164;
                            if (var120 > 0) {
                                arg6[var75] = var120;
                                if (arg6[var75] > 255) {
                                    arg6[var75] = 255;
                                }
                            }
                        }
                        int var121 = (this.field1729 * var117 + this.field1739 * var115 + this.field1732 * var116 >> 15) + this.field1747;
                        int var122 = (this.field1734 * var117 + this.field1733 * var116 + this.field1727 * var115 >> 15) + this.field1737;
                        arg4[var75] = this.field1746.field2172 * var121 / this.field1743 + arg3.field3501;
                        arg5[var75] = this.field1746.field2166 * var122 / this.field1743 + arg3.field3498;
                    }
                }
                if (var64.field3214 != null) {
                    int var76 = this.field1730[arg0][arg1];
                    int var77 = this.field1730[arg0 + 1][arg1];
                    int var78 = this.field1730[arg0][arg1 + 1];
                    int var79 = super.field127 * arg0;
                    int var80 = super.field127 + var79;
                    int var81 = super.field127 * arg1;
                    int var82 = super.field127 + var81;
                    int var83 = (this.field1729 * var81 + this.field1739 * var79 + this.field1732 * var76 >> 15) + this.field1747;
                    int var84 = (this.field1734 * var81 + this.field1733 * var76 + this.field1727 * var79 >> 15) + this.field1737;
                    int var85 = (this.field1744 * var81 + this.field1741 * var76 + this.field1738 * var79 >> 15) + this.field1728;
                    int var86 = (this.field1729 * var81 + this.field1739 * var80 + this.field1732 * var77 >> 15) + this.field1747;
                    int var87 = (this.field1734 * var81 + this.field1733 * var77 + this.field1727 * var80 >> 15) + this.field1737;
                    int var88 = (this.field1744 * var81 + this.field1741 * var77 + this.field1738 * var80 >> 15) + this.field1728;
                    int var89 = (this.field1729 * var82 + this.field1739 * var79 + this.field1732 * var78 >> 15) + this.field1747;
                    int var90 = (this.field1734 * var82 + this.field1733 * var78 + this.field1727 * var79 >> 15) + this.field1737;
                    int var91 = (this.field1744 * var82 + this.field1741 * var78 + this.field1738 * var79 >> 15) + this.field1728;
                    for (int var92 = 0; var92 < var64.field3211; ++var92) {
                        int var93 = var92 * 3;
                        int var94 = var93 + 1;
                        int var95 = var94 + 1;
                        int var96 = arg4[var93];
                        int var97 = arg4[var94];
                        int var98 = arg4[var95];
                        int var99 = arg5[var93];
                        int var100 = arg5[var94];
                        int var101 = arg5[var95];
                        int var102 = arg6[var93] + arg6[var94] + arg6[var95];
                        if ((var96 - var97) * (var101 - var100) - (var98 - var97) * (var99 - var100) > 0) {
                            arg3.field3496 = var96 < 0 || var97 < 0 || var98 < 0 || var96 > arg3.field3504 || var97 > arg3.field3504 || var98 > arg3.field3504;
                            short var103 = var64.field3214[var92];
                            if (var102 < 765) {
                                if (var103 != -1 && this.method870(this.field1746.field4588.method938(28923, var103).field6169)) {
                                    arg3.field3505 = 100;
                                }
                                if (var102 > 0) {
                                    if (var103 != -1) {
                                        arg3.method1577(var99, var100, var101, var96, var97, var98, this.field1746.field2140, arg6[var93], arg6[var94], arg6[var95], var64.field3217[var93], var64.field3217[var94], var64.field3217[var95], var83, var86, var89, var84, var87, var90, var85, var88, var91, var103);
                                    } else if ((var64.field3217[var93] & 16777215) != 0) {
                                        arg3.method1574(var99, var100, var101, var96, var97, var98, class125.method925(var64.field3217[var93], arg6[var93] << 24 | this.field1746.field2140, -96), class125.method925(var64.field3217[var94], arg6[var94] << 24 | this.field1746.field2140, 97), class125.method925(var64.field3217[var95], arg6[var95] << 24 | this.field1746.field2140, -109));
                                    }
                                } else if (var103 != -1) {
                                    arg3.method1575(var99, var100, var101, var96, var97, var98, var64.field3217[var93], var64.field3217[var94], var64.field3217[var95], var83, var86, var89, var84, var87, var90, var85, var88, var91, var103);
                                } else if ((var64.field3217[var93] & 16777215) != 0) {
                                    arg3.method1574(var99, var100, var101, var96, var97, var98, var64.field3217[var93], var64.field3217[var94], var64.field3217[var95]);
                                }
                                arg3.field3505 = 0;
                            } else {
                                arg3.method1579(var99, var100, var101, var96, var97, var98, this.field1746.field2140);
                            }
                        }
                    }
                    return;
                }
                for (int var104 = 0; var104 < var64.field3211; ++var104) {
                    int var105 = var104 * 3;
                    int var106 = var105 + 1;
                    int var107 = var106 + 1;
                    int var108 = arg4[var105];
                    int var109 = arg4[var106];
                    int var110 = arg4[var107];
                    int var111 = arg5[var105];
                    int var112 = arg5[var106];
                    int var113 = arg5[var107];
                    int var114 = arg6[var105] + arg6[var106] + arg6[var107];
                    if ((var108 - var109) * (var113 - var112) - (var110 - var109) * (var111 - var112) > 0) {
                        arg3.field3496 = var108 < 0 || var109 < 0 || var110 < 0 || var108 > arg3.field3504 || var109 > arg3.field3504 || var110 > arg3.field3504;
                        if (var114 < 765) {
                            if (var114 > 0) {
                                if ((var64.field3217[var105] & 16777215) != 0) {
                                    arg3.method1574(var111, var112, var113, var108, var109, var110, class301.method2000(arg6[var105], -96, var64.field3217[var105], this.field1746.field2140), class301.method2000(arg6[var106], -74, var64.field3217[var106], this.field1746.field2140), class301.method2000(arg6[var107], -112, var64.field3217[var107], this.field1746.field2140));
                                }
                            } else if ((var64.field3217[var105] & 16777215) != 0) {
                                arg3.method1574(var111, var112, var113, var108, var109, var110, var64.field3217[var105], var64.field3217[var106], var64.field3217[var107]);
                            }
                        } else {
                            arg3.method1579(var111, var112, var113, var108, var109, var110, this.field1746.field2140);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(II)V", line = 856)
    public final void method69(int arg0, int arg1) {
        class112 var3 = this.field1746.method1038(Thread.currentThread());
        var3.field1675.field3505 = 0;
        if (this.field1726 != null) {
            this.method866(arg0, arg1, this.field1746.field2179, var3.field1675, var3.field1715, var3.field1697, var3.field1724);
        } else {
            if (this.field1731 != null) {
                this.method868(arg0, arg1, var3.field1675, var3.field1715, var3.field1697, var3.field1724);
            }
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(Li;IIIIZ)Z", line = 867)
    public final boolean method66(class200 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(IIIIIII[[Z)V", line = 873)
    public final void method62(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class112 var9 = this.field1746.method1038(Thread.currentThread());
        class233 var10 = var9.field1675;
        var10.field3505 = 0;
        var10.field3496 = false;
        if (this.field1726 != null) {
            this.method867(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field1715, var9.field1697);
        } else {
            if (this.field1731 != null) {
                this.method865(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field1715, var9.field1697);
            }
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(III[[ZZ)V", line = 890)
    public final void method67(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        class526 var6 = this.field1746.field2154;
        this.field1743 = -1;
        this.field1739 = var6.field7705;
        this.field1732 = var6.field7711;
        this.field1729 = var6.field7708;
        this.field1747 = var6.field7707;
        this.field1727 = var6.field7702;
        this.field1733 = var6.field7703;
        this.field1734 = var6.field7701;
        this.field1737 = var6.field7709;
        this.field1738 = var6.field7712;
        this.field1741 = var6.field7710;
        this.field1744 = var6.field7706;
        this.field1728 = var6.field7704;
    }

    @OriginalMember(owner = "client!su", name = "OA", descriptor = "(IILi;)Li;", line = 909)
    public final class200 method54(int arg0, int arg1, class200 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 912)
    public final void method63(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field1731 == null) {
            this.field1731 = new class226[super.field124][super.field122];
            this.field1742 = new class302[super.field124][super.field122];
        } else if (this.field1726 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && super.field127 != var20 || var21 != 0 && super.field127 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class302 var22 = new class302();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field4637 = var23;
            var22.field4641 = new short[var23];
            var22.field4643 = new short[var23];
            var22.field4631 = new short[var23];
            var22.field4634 = new short[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var30 = arg2[var25];
                int var31 = arg4[var25];
                if (var30 == 0 && var31 == 0) {
                    var22.field4641[var25] = (short) (this.field1735[arg0][arg1] - this.field1745[arg0][arg1]);
                } else if (var30 == 0 && super.field127 == var31) {
                    var22.field4641[var25] = (short) (this.field1735[arg0][arg1 + 1] - this.field1745[arg0][arg1 + 1]);
                } else if (super.field127 == var30 && super.field127 == var31) {
                    var22.field4641[var25] = (short) (this.field1735[arg0 + 1][arg1 + 1] - this.field1745[arg0 + 1][arg1 + 1]);
                } else if (super.field127 == var30 && var31 == 0) {
                    var22.field4641[var25] = (short) (this.field1735[arg0 + 1][arg1] - this.field1745[arg0 + 1][arg1]);
                } else {
                    int var32 = (this.field1735[arg0 + 1][arg1] - this.field1745[arg0 + 1][arg1]) * var30 + (this.field1735[arg0][arg1] - this.field1745[arg0][arg1]) * (super.field127 - var30);
                    int var33 = (this.field1735[arg0 + 1][arg1 + 1] - this.field1745[arg0 + 1][arg1 + 1]) * var30 + (this.field1735[arg0][arg1 + 1] - this.field1745[arg0][arg1 + 1]) * (super.field127 - var30);
                    var22.field4641[var25] = (short) ((super.field127 - var31) * var32 + var31 * var33 >> super.field123 * 2);
                }
                int var34 = (arg0 << super.field123) + var30;
                int var35 = (arg1 << super.field123) + var31;
                var22.field4643[var25] = (short) var30;
                var22.field4634[var25] = (short) var31;
                var22.field4631[var25] = (short) (this.method68(var34, var35) + (arg3 != null ? arg3[var25] : 0));
                if (var22.field4641[var25] < 2) {
                    var22.field4641[var25] = 2;
                }
            }
            boolean var26 = false;
            int var27 = 0;
            for (int var28 = 0; var28 < var24; ++var28) {
                if (arg9[var28] >= 0 || arg10 != null && arg10[var28] >= 0) {
                    ++var27;
                }
                if (arg11[var28] != -1 && !this.field1746.field4588.method938(28923, arg11[var28]).field6161) {
                    var26 = true;
                }
            }
            var22.field4638 = new int[var27];
            if (arg10 != null) {
                var22.field4635 = new int[var27];
            }
            var22.field4639 = new short[var27];
            var22.field4640 = new short[var27];
            var22.field4632 = new short[var27];
            if (var26) {
                var22.field4633 = new short[var27];
                var22.field4636 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field4638[var22.field4642] = class415.method2598((byte) -124, arg9[var29]);
                    } else {
                        var22.field4638[var22.field4642] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field4635[var22.field4642] = class415.method2598((byte) -124, arg10[var29]);
                        } else {
                            var22.field4635[var22.field4642] = -1;
                        }
                    }
                    var22.field4639[var22.field4642] = (short) arg6[var29];
                    var22.field4640[var22.field4642] = (short) arg7[var29];
                    var22.field4632[var22.field4642] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field1746.field4588.method938(28923, arg11[var29]).field6161) {
                            var22.field4633[var22.field4642] = (short) arg11[var29];
                            var22.field4636[var22.field4642] = (short) arg12[var29];
                        } else {
                            var22.field4633[var22.field4642] = -1;
                        }
                    }
                    ++var22.field4642;
                }
            }
            this.field1742[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class226 var36 = new class226();
                int var37 = arg9[0];
                int var38 = arg11[0];
                if (arg10 != null) {
                    var36.field3433 = class432.method2687(class415.method2598((byte) -124, arg10[0]), this.field1735[arg0][arg1] - this.field1745[arg0][arg1], -3935);
                    if (var37 == -1) {
                        var36.field3436 = (byte) (var36.field3436 | 2);
                    }
                }
                if (this.field1730[arg0 + 1][arg1] == this.field1730[arg0][arg1] && this.field1730[arg0 + 1][arg1 + 1] == this.field1730[arg0][arg1] && this.field1730[arg0][arg1 + 1] == this.field1730[arg0][arg1]) {
                    var36.field3436 = (byte) (var36.field3436 | 1);
                }
                if (var38 != -1 && (var36.field3436 & 2) == 0 && !this.field1746.field4588.method938(28923, var38).field6161) {
                    var36.field3438 = (short) (this.field1735[arg0][arg1] - this.field1745[arg0][arg1]);
                    var36.field3439 = (short) (this.field1735[arg0 + 1][arg1] - this.field1745[arg0 + 1][arg1]);
                    var36.field3437 = (short) (this.field1735[arg0 + 1][arg1 + 1] - this.field1745[arg0 + 1][arg1 + 1]);
                    var36.field3434 = (short) (this.field1735[arg0][arg1 + 1] - this.field1745[arg0][arg1 + 1]);
                    var36.field3435 = (short) var38;
                } else {
                    short var39 = class415.method2598((byte) -124, var37);
                    var36.field3438 = (short) class432.method2687(var39, this.field1735[arg0][arg1] - this.field1745[arg0][arg1], -3935);
                    var36.field3439 = (short) class432.method2687(var39, this.field1735[arg0 + 1][arg1] - this.field1745[arg0 + 1][arg1], -3935);
                    var36.field3437 = (short) class432.method2687(var39, this.field1735[arg0 + 1][arg1 + 1] - this.field1745[arg0 + 1][arg1 + 1], -3935);
                    var36.field3434 = (short) class432.method2687(var39, this.field1735[arg0][arg1 + 1] - this.field1745[arg0][arg1 + 1], -3935);
                    var36.field3435 = -1;
                }
                this.field1731[arg0][arg1] = var36;
            }
        }
    }

    @OriginalMember(owner = "client!su", name = "b", descriptor = "(IIIIIII[[ZLqh;[I[I)V", line = 1142)
    private final void method867(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class233 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field3503 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field1726[var16][var17] != null) {
                        class465 var18 = this.field1726[var16][var17];
                        if (var18.field6872 != -1 && (var18.field6868 & 2) == 0 && var18.field6873 == 0) {
                            int var19 = this.field1746.method1043(var18.field6872);
                            arg8.method1578(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class432.method2687(var19, var18.field6870, -3935), class432.method2687(var19, var18.field6874, -3935), class432.method2687(var19, var18.field6867, -3935));
                            arg8.method1578(var15, var15, var15 - var13, var14, var13 + var14, var14, class432.method2687(var19, var18.field6866, -3935), class432.method2687(var19, var18.field6867, -3935), class432.method2687(var19, var18.field6874, -3935));
                        } else if (var18.field6873 == 0) {
                            arg8.method1574(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field6870, var18.field6874, var18.field6867);
                            arg8.method1574(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field6866, var18.field6867, var18.field6874);
                        } else {
                            int var20 = var18.field6873;
                            arg8.method1574(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class125.method925(var20, var18.field6870 & -16777216, 124), class125.method925(var20, var18.field6874 & -16777216, 104), class125.method925(var20, var18.field6867 & -16777216, 119));
                            arg8.method1574(var15, var15, var15 - var13, var14, var13 + var14, var14, class125.method925(var20, var18.field6866 & -16777216, 60), class125.method925(var20, var18.field6867 & -16777216, -119), class125.method925(var20, var18.field6874 & -16777216, -81));
                        }
                    } else if (this.field1740[var16][var17] != null) {
                        class211 var21 = this.field1740[var16][var17];
                        for (int var22 = 0; var22 < var21.field3209; ++var22) {
                            arg9[var22] = var21.field3215[var22] * var13 / super.field127 + var14;
                            arg10[var22] = var15 - var21.field3216[var22] * var13 / super.field127;
                        }
                        for (int var23 = 0; var23 < var21.field3211; ++var23) {
                            int var24 = var23 * 3;
                            int var25 = var24 + 1;
                            int var26 = var25 + 1;
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field3212 != null && var21.field3212[var23] != 0 && (var21.field3214 == null || var21.field3214 != null && var21.field3214[var23] == -1)) {
                                int var33 = var21.field3212[var23];
                                arg8.method1574(var30, var31, var32, var27, var28, var29, class125.method925(var33, -16777216 - (var21.field3217[var24] & -16777216), -60), class125.method925(var33, -16777216 - (var21.field3217[var25] & -16777216), -92), class125.method925(var33, -16777216 - (var21.field3217[var26] & -16777216), -103));
                            } else if (var21.field3214 != null && var21.field3214[var23] != -1) {
                                int var34 = this.field1746.method1043(var21.field3214[var23]);
                                arg8.method1578(var30, var31, var32, var27, var28, var29, var34, var34, var34);
                            } else {
                                arg8.method1574(var30, var31, var32, var27, var28, var29, var21.field3217[var24], var21.field3217[var25], var21.field3217[var26]);
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field3503 = true;
    }

    @OriginalMember(owner = "client!su", name = "ba", descriptor = "(Li;IIIIZ)V", line = 1269)
    public final void method55(class200 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!su", name = "aa", descriptor = "()V", line = 1273)
    public final void method64() {
        this.field1735 = null;
        this.field1745 = null;
    }

    @OriginalMember(owner = "client!su", name = "pa", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 1280)
    public final void method59(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (this.field1726 == null) {
            this.field1726 = new class465[super.field124][super.field122];
            this.field1740 = new class211[super.field124][super.field122];
        } else if (this.field1731 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var15 = 0; var15 < arg6.length; ++var15) {
                if (arg6[var15] == -1) {
                    arg6[var15] = 0;
                } else {
                    arg6[var15] = class471.field6909[class415.method2598((byte) -124, arg6[var15]) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var16 = 0; var16 < arg7.length; ++var16) {
                    if (arg7[var16] == -1) {
                        arg7[var16] = 0;
                    } else {
                        arg7[var16] = class471.field6909[class415.method2598((byte) -124, arg7[var16]) & 65535] << 8 | 255;
                    }
                }
            }
            boolean var17 = true;
            int var18 = -1;
            int var19 = -1;
            int var20 = -1;
            int var21 = -1;
            if (arg2.length == 6) {
                for (int var22 = 0; var22 < 6; ++var22) {
                    if (arg2[var22] == 0 && arg4[var22] == 0) {
                        if (var18 != -1 && arg6[var18] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var18 = var22;
                    } else if (arg2[var22] == super.field127 && arg4[var22] == 0) {
                        if (var19 != -1 && arg6[var19] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var19 = var22;
                    } else if (arg2[var22] == super.field127 && arg4[var22] == super.field127) {
                        if (var20 != -1 && arg6[var20] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var20 = var22;
                    } else if (arg2[var22] == 0 && arg4[var22] == super.field127) {
                        if (var21 != -1 && arg6[var21] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var21 = var22;
                    }
                }
                if (var18 == -1 || var19 == -1 || var20 == -1 || var21 == -1) {
                    var17 = false;
                }
                if (var17) {
                    if (arg3 != null) {
                        for (int var23 = 0; var23 < 4; ++var23) {
                            if (arg3[var23] != 0) {
                                var17 = false;
                                break;
                            }
                        }
                    }
                    if (var17) {
                        for (int var24 = 1; var24 < 4; ++var24) {
                            if (arg2[var24] != arg2[0] && arg2[0] + super.field127 != arg2[var24] && arg2[0] - super.field127 != arg2[var24]) {
                                var17 = false;
                                break;
                            }
                            if (arg4[var24] != arg4[0] && arg4[0] + super.field127 != arg4[var24] && arg4[0] - super.field127 != arg4[var24]) {
                                var17 = false;
                                break;
                            }
                        }
                    }
                }
            } else {
                var17 = false;
            }
            if (var17) {
                class465 var25 = new class465();
                int var26 = arg6[0];
                int var27 = arg8[0];
                if (arg7 != null) {
                    var25.field6873 = arg7[0] >> 8;
                    if (var26 == 0) {
                        var25.field6868 = (byte) (var25.field6868 | 2);
                    }
                } else if (var26 == 0) {
                    return;
                }
                if (this.field1730[arg0 + 1][arg1] == this.field1730[arg0][arg1] && this.field1730[arg0 + 1][arg1 + 1] == this.field1730[arg0][arg1] && this.field1730[arg0][arg1 + 1] == this.field1730[arg0][arg1]) {
                    var25.field6868 = (byte) (var25.field6868 | 1);
                }
                if (var27 != -1 && (var25.field6868 & 2) == 0 && !this.field1746.field4588.method938(28923, var27).field6161) {
                    var25.field6866 = this.field1735[arg0][arg1] - this.field1745[arg0][arg1];
                    var25.field6867 = this.field1735[arg0 + 1][arg1] - this.field1745[arg0 + 1][arg1];
                    var25.field6870 = this.field1735[arg0 + 1][arg1 + 1] - this.field1745[arg0 + 1][arg1 + 1];
                    var25.field6874 = this.field1735[arg0][arg1 + 1] - this.field1745[arg0][arg1 + 1];
                    var25.field6872 = (short) var27;
                } else {
                    int var28;
                    if (arg5 != null && arg11 != 0) {
                        var28 = arg5[var18] * 255 / arg11;
                        if (var28 < 0) {
                            var28 = 0;
                        } else if (var28 > 255) {
                            var28 = 255;
                        }
                    } else {
                        var28 = 0;
                    }
                    var25.field6866 = class301.method2000(var28, -109, method869(arg6[var18] >> 8, this.field1735[arg0][arg1] - this.field1745[arg0][arg1]), arg10);
                    if (var25.field6873 != 0) {
                        var25.field6866 |= 255 - (this.field1735[arg0][arg1] - this.field1745[arg0][arg1]) << 25;
                    }
                    int var29;
                    if (arg5 != null && arg11 != 0) {
                        var29 = arg5[var19] * 255 / arg11;
                        if (var29 < 0) {
                            var29 = 0;
                        } else if (var29 > 255) {
                            var29 = 255;
                        }
                    } else {
                        var29 = 0;
                    }
                    var25.field6867 = class301.method2000(var29, -100, method869(arg6[var19] >> 8, this.field1735[arg0 + 1][arg1] - this.field1745[arg0 + 1][arg1]), arg10);
                    if (var25.field6873 != 0) {
                        var25.field6867 |= 255 - (this.field1735[arg0 + 1][arg1] - this.field1745[arg0 + 1][arg1]) << 25;
                    }
                    int var30;
                    if (arg5 != null && arg11 != 0) {
                        var30 = arg5[var20] * 255 / arg11;
                        if (var30 < 0) {
                            var30 = 0;
                        } else if (var30 > 255) {
                            var30 = 255;
                        }
                    } else {
                        var30 = 0;
                    }
                    var25.field6870 = class301.method2000(var30, -98, method869(arg6[var20] >> 8, this.field1735[arg0 + 1][arg1 + 1] - this.field1745[arg0 + 1][arg1 + 1]), arg10);
                    if (var25.field6873 != 0) {
                        var25.field6870 |= 255 - (this.field1735[arg0 + 1][arg1 + 1] - this.field1745[arg0 + 1][arg1 + 1]) << 25;
                    }
                    int var31;
                    if (arg5 != null && arg11 != 0) {
                        var31 = arg5[var21] * 255 / arg11;
                        if (var31 < 0) {
                            var31 = 0;
                        } else if (var31 > 255) {
                            var31 = 255;
                        }
                    } else {
                        var31 = 0;
                    }
                    var25.field6874 = class301.method2000(var31, -126, method869(arg6[var21] >> 8, this.field1735[arg0][arg1 + 1] - this.field1745[arg0][arg1 + 1]), arg10);
                    if (var25.field6873 != 0) {
                        var25.field6874 |= 255 - (this.field1735[arg0][arg1 + 1] - this.field1745[arg0][arg1 + 1]) << 25;
                    }
                    var25.field6872 = -1;
                }
                if (arg5 != null) {
                    var25.field6869 = (short) arg5[var20];
                    var25.field6871 = (short) arg5[var21];
                    var25.field6875 = (short) arg5[var19];
                    var25.field6876 = (short) arg5[var18];
                }
                this.field1726[arg0][arg1] = var25;
            } else {
                class211 var32 = new class211();
                var32.field3209 = (short) arg2.length;
                var32.field3211 = (short) (arg2.length / 3);
                var32.field3215 = new short[var32.field3209];
                var32.field3210 = new short[var32.field3209];
                var32.field3216 = new short[var32.field3209];
                var32.field3217 = new int[var32.field3209];
                if (arg5 != null) {
                    var32.field3208 = new short[var32.field3209];
                }
                for (int var33 = 0; var33 < var32.field3209; ++var33) {
                    int var48 = arg2[var33];
                    int var49 = arg4[var33];
                    boolean var50 = false;
                    int var51;
                    if (var48 == 0 && var49 == 0) {
                        var51 = this.field1735[arg0][arg1] - this.field1745[arg0][arg1];
                    } else if (var48 == 0 && super.field127 == var49) {
                        var51 = this.field1735[arg0][arg1 + 1] - this.field1745[arg0][arg1 + 1];
                    } else if (super.field127 == var48 && super.field127 == var49) {
                        var51 = this.field1735[arg0 + 1][arg1 + 1] - this.field1745[arg0 + 1][arg1 + 1];
                    } else if (super.field127 == var48 && var49 == 0) {
                        var51 = this.field1735[arg0 + 1][arg1] - this.field1745[arg0 + 1][arg1];
                    } else {
                        int var52 = (this.field1735[arg0 + 1][arg1] - this.field1745[arg0 + 1][arg1]) * var48 + (this.field1735[arg0][arg1] - this.field1745[arg0][arg1]) * (super.field127 - var48);
                        int var53 = (this.field1735[arg0 + 1][arg1 + 1] - this.field1745[arg0 + 1][arg1 + 1]) * var48 + (this.field1735[arg0][arg1 + 1] - this.field1745[arg0][arg1 + 1]) * (super.field127 - var48);
                        var51 = (super.field127 - var49) * var52 + var49 * var53 >> super.field123 * 2;
                    }
                    int var54 = (arg0 << super.field123) + var48;
                    int var55 = (arg1 << super.field123) + var49;
                    var32.field3215[var33] = (short) var48;
                    var32.field3216[var33] = (short) var49;
                    var32.field3210[var33] = (short) (this.method68(var54, var55) + (arg3 != null ? arg3[var33] : 0));
                    if (var51 < 0) {
                        var51 = 0;
                    }
                    if (arg8[var33] != -1 && !this.field1746.field4588.method938(28923, arg8[var33]).field6161) {
                        var32.field3217[var33] = var51;
                    } else if (arg6[var33] == 0) {
                        if (arg7 != null) {
                            var32.field3217[var33] = var51 << 25;
                        } else {
                            var32.field3217[var33] = 0;
                        }
                    } else {
                        int var56 = 0;
                        if (arg5 != null) {
                            short var57 = var32.field3208[var33] = (short) arg5[var33];
                            if (arg11 != 0) {
                                var56 = var57 * 255 / arg11;
                                if (var56 < 0) {
                                    var56 = 0;
                                } else if (var56 > 255) {
                                    var56 = 255;
                                }
                            }
                        }
                        var32.field3217[var33] = class301.method2000(var56, -123, method869(arg6[var33] >> 8, var51), arg10);
                        if (arg7 != null) {
                            var32.field3217[var33] |= var51 << 25;
                        }
                    }
                }
                boolean var34 = false;
                for (int var35 = 0; var35 < var32.field3211; ++var35) {
                    if (arg8[var35 * 3] != -1 && !this.field1746.field4588.method938(28923, arg8[var35 * 3]).field6161) {
                        var34 = true;
                    }
                }
                if (arg7 != null) {
                    var32.field3212 = new int[var32.field3211];
                }
                if (var34) {
                    var32.field3214 = new short[var32.field3211];
                    var32.field3213 = new short[var32.field3211];
                }
                for (int var36 = 0; var36 < var32.field3211; ++var36) {
                    int var37 = var36 * 3;
                    if (arg7 != null && arg7[var37] != 0) {
                        var32.field3212[var36] = arg7[var37] >> 8;
                    }
                    if (var34) {
                        int var38 = var37 + 1;
                        int var39 = var38 + 1;
                        boolean var40 = false;
                        boolean var41 = true;
                        int var42 = arg8[var37];
                        if (var42 != -1 && !this.field1746.field4588.method938(28923, var42).field6161) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var43 = arg8[var38];
                        if (var43 != -1 && !this.field1746.field4588.method938(28923, var43).field6161) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var44 = arg8[var39];
                        if (var44 != -1 && !this.field1746.field4588.method938(28923, var44).field6161) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        if (var41) {
                            var32.field3214[var36] = (short) var44;
                            var32.field3213[var36] = (short) arg9[var37];
                        } else {
                            if (var40) {
                                int var45 = arg8[var37];
                                if (var45 != -1 && !this.field1746.field4588.method938(28923, var45).field6161) {
                                    var32.field3217[var37] = class471.field6909[class415.method2598((byte) -124, this.field1746.field4588.method938(28923, var45).field6160 & 65535) & 65535];
                                }
                                int var46 = arg8[var38];
                                if (var46 != -1 && !this.field1746.field4588.method938(28923, var46).field6161) {
                                    var32.field3217[var38] = class471.field6909[class415.method2598((byte) -124, this.field1746.field4588.method938(28923, var46).field6160 & 65535) & 65535];
                                }
                                int var47 = arg8[var39];
                                if (var47 != -1 && !this.field1746.field4588.method938(28923, var47).field6161) {
                                    var32.field3217[var39] = class471.field6909[class415.method2598((byte) -124, this.field1746.field4588.method938(28923, var47).field6160 & 65535) & 65535];
                                }
                            }
                            var32.field3214[var36] = -1;
                        }
                    }
                }
                this.field1740[arg0][arg1] = var32;
            }
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(IILqh;[I[I[I)V", line = 1774)
    private final void method868(int arg0, int arg1, class233 arg2, int[] arg3, int[] arg4, int[] arg5) {
        class226 var7 = this.field1731[arg0][arg1];
        if (var7 != null) {
            if ((var7.field3436 & 2) == 0) {
                int var8 = super.field127 * arg0;
                int var9 = super.field127 + var8;
                int var10 = super.field127 * arg1;
                int var11 = super.field127 + var10;
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
                if ((var7.field3436 & 1) != 0) {
                    int var12 = this.field1730[arg0][arg1];
                    int var16;
                    if (this.field1743 == -1) {
                        int var13 = this.field1741 * var12;
                        var14 = (this.field1744 * var10 + this.field1738 * var8 + var13 >> 15) + this.field1728;
                        if (var14 <= this.field1746.field2178) {
                            return;
                        }
                        var15 = (this.field1744 * var10 + this.field1738 * var9 + var13 >> 15) + this.field1728;
                        if (var15 <= this.field1746.field2178) {
                            return;
                        }
                        var16 = (this.field1744 * var11 + this.field1738 * var9 + var13 >> 15) + this.field1728;
                        if (var16 <= this.field1746.field2178) {
                            return;
                        }
                        var17 = (this.field1744 * var11 + this.field1738 * var8 + var13 >> 15) + this.field1728;
                        if (var17 <= this.field1746.field2178) {
                            return;
                        }
                    } else {
                        var17 = this.field1743;
                        var16 = this.field1743;
                        var15 = this.field1743;
                        var14 = this.field1743;
                    }
                    int var18 = this.field1732 * var12;
                    int var19 = this.field1733 * var12;
                    var20 = (this.field1729 * var10 + this.field1739 * var8 + var18 >> 15) + this.field1747;
                    var21 = this.field1746.field2172 * var20 / var14 + arg2.field3501;
                    var22 = (this.field1734 * var10 + this.field1727 * var8 + var19 >> 15) + this.field1737;
                    var23 = this.field1746.field2166 * var22 / var14 + arg2.field3498;
                    var24 = (this.field1729 * var10 + this.field1739 * var9 + var18 >> 15) + this.field1747;
                    var25 = this.field1746.field2172 * var24 / var15 + arg2.field3501;
                    var26 = (this.field1734 * var10 + this.field1727 * var9 + var19 >> 15) + this.field1737;
                    var27 = this.field1746.field2166 * var26 / var15 + arg2.field3498;
                    int var28 = (this.field1729 * var11 + this.field1739 * var9 + var18 >> 15) + this.field1747;
                    var29 = this.field1746.field2172 * var28 / var16 + arg2.field3501;
                    int var30 = (this.field1734 * var11 + this.field1727 * var9 + var19 >> 15) + this.field1737;
                    var31 = this.field1746.field2166 * var30 / var16 + arg2.field3498;
                    var32 = (this.field1729 * var11 + this.field1739 * var8 + var18 >> 15) + this.field1747;
                    var33 = this.field1746.field2172 * var32 / var17 + arg2.field3501;
                    var34 = (this.field1734 * var11 + this.field1727 * var8 + var19 >> 15) + this.field1737;
                    var35 = this.field1746.field2166 * var34 / var17 + arg2.field3498;
                } else {
                    int var36 = this.field1730[arg0][arg1];
                    int var37 = this.field1730[arg0 + 1][arg1];
                    int var38 = this.field1730[arg0 + 1][arg1 + 1];
                    int var39 = this.field1730[arg0][arg1 + 1];
                    int var40;
                    if (this.field1743 == -1) {
                        var14 = (this.field1744 * var10 + this.field1741 * var36 + this.field1738 * var8 >> 15) + this.field1728;
                        if (var14 <= this.field1746.field2178) {
                            return;
                        }
                        var15 = (this.field1744 * var10 + this.field1741 * var37 + this.field1738 * var9 >> 15) + this.field1728;
                        if (var15 <= this.field1746.field2178) {
                            return;
                        }
                        var40 = (this.field1744 * var11 + this.field1741 * var38 + this.field1738 * var9 >> 15) + this.field1728;
                        if (var40 <= this.field1746.field2178) {
                            return;
                        }
                        var17 = (this.field1744 * var11 + this.field1741 * var39 + this.field1738 * var8 >> 15) + this.field1728;
                        if (var17 <= this.field1746.field2178) {
                            return;
                        }
                    } else {
                        var17 = this.field1743;
                        var40 = this.field1743;
                        var15 = this.field1743;
                        var14 = this.field1743;
                    }
                    var20 = (this.field1729 * var10 + this.field1739 * var8 + this.field1732 * var36 >> 15) + this.field1747;
                    var21 = this.field1746.field2172 * var20 / var14 + arg2.field3501;
                    var22 = (this.field1734 * var10 + this.field1733 * var36 + this.field1727 * var8 >> 15) + this.field1737;
                    var23 = this.field1746.field2166 * var22 / var14 + arg2.field3498;
                    var24 = (this.field1729 * var10 + this.field1739 * var9 + this.field1732 * var37 >> 15) + this.field1747;
                    var25 = this.field1746.field2172 * var24 / var15 + arg2.field3501;
                    var26 = (this.field1734 * var10 + this.field1733 * var37 + this.field1727 * var9 >> 15) + this.field1737;
                    var27 = this.field1746.field2166 * var26 / var15 + arg2.field3498;
                    int var41 = (this.field1729 * var11 + this.field1739 * var9 + this.field1732 * var38 >> 15) + this.field1747;
                    var29 = this.field1746.field2172 * var41 / var40 + arg2.field3501;
                    int var42 = (this.field1734 * var11 + this.field1733 * var38 + this.field1727 * var9 >> 15) + this.field1737;
                    var31 = this.field1746.field2166 * var42 / var40 + arg2.field3498;
                    var32 = (this.field1729 * var11 + this.field1739 * var8 + this.field1732 * var39 >> 15) + this.field1747;
                    var33 = this.field1746.field2172 * var32 / var17 + arg2.field3501;
                    var34 = (this.field1734 * var11 + this.field1733 * var39 + this.field1727 * var8 >> 15) + this.field1737;
                    var35 = this.field1746.field2166 * var34 / var17 + arg2.field3498;
                }
                if ((var27 - var35) * (var29 - var33) - (var25 - var33) * (var31 - var35) > 0) {
                    arg2.field3496 = var29 < 0 || var33 < 0 || var25 < 0 || var29 > arg2.field3504 || var33 > arg2.field3504 || var25 > arg2.field3504;
                    if (var7.field3435 >= 0) {
                        if (this.method870(this.field1746.field4588.method938(28923, var7.field3435).field6169)) {
                            arg2.field3505 = 100;
                        }
                        arg2.method1575(var31, var35, var27, var29, var33, var25, var7.field3437 & 65535, var7.field3434 & 65535, var7.field3439 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field3435);
                        arg2.field3505 = 0;
                    } else {
                        arg2.method1578(var31, var35, var27, var29, var33, var25, var7.field3437 & 65535, var7.field3434 & 65535, var7.field3439 & 65535);
                    }
                }
                if ((var21 - var25) * (var35 - var27) - (var23 - var27) * (var33 - var25) > 0) {
                    arg2.field3496 = var21 < 0 || var25 < 0 || var33 < 0 || var21 > arg2.field3504 || var25 > arg2.field3504 || var33 > arg2.field3504;
                    if (var7.field3435 >= 0) {
                        if (this.method870(this.field1746.field4588.method938(28923, var7.field3435).field6169)) {
                            arg2.field3505 = 100;
                        }
                        arg2.method1575(var23, var27, var35, var21, var25, var33, var7.field3438 & 65535, var7.field3439 & 65535, var7.field3434 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field3435);
                        arg2.field3505 = 0;
                        return;
                    }
                    arg2.method1578(var23, var27, var35, var21, var25, var33, var7.field3438 & 65535, var7.field3439 & 65535, var7.field3434 & 65535);
                }
            }
        } else {
            class302 var43 = this.field1742[arg0][arg1];
            if (var43 != null) {
                if (this.field1743 == -1) {
                    for (int var44 = 0; var44 < var43.field4637; ++var44) {
                        int var45 = (arg0 << super.field123) + var43.field4643[var44];
                        short var46 = var43.field4631[var44];
                        int var47 = (arg1 << super.field123) + var43.field4634[var44];
                        int var48 = (this.field1744 * var47 + this.field1741 * var46 + this.field1738 * var45 >> 15) + this.field1728;
                        if (var48 <= this.field1746.field2178) {
                            return;
                        }
                        int var49 = (this.field1729 * var47 + this.field1739 * var45 + this.field1732 * var46 >> 15) + this.field1747;
                        int var50 = (this.field1734 * var47 + this.field1733 * var46 + this.field1727 * var45 >> 15) + this.field1737;
                        arg3[var44] = this.field1746.field2172 * var49 / var48 + arg2.field3501;
                        arg4[var44] = this.field1746.field2166 * var50 / var48 + arg2.field3498;
                    }
                } else {
                    for (int var51 = 0; var51 < var43.field4637; ++var51) {
                        int var91 = (arg0 << super.field123) + var43.field4643[var51];
                        short var92 = var43.field4631[var51];
                        int var93 = (arg1 << super.field123) + var43.field4634[var51];
                        int var94 = (this.field1729 * var93 + this.field1739 * var91 + this.field1732 * var92 >> 15) + this.field1747;
                        int var95 = (this.field1734 * var93 + this.field1733 * var92 + this.field1727 * var91 >> 15) + this.field1737;
                        arg3[var51] = this.field1746.field2172 * var94 / this.field1743 + arg2.field3501;
                        arg4[var51] = this.field1746.field2166 * var95 / this.field1743 + arg2.field3498;
                    }
                }
                if (var43.field4633 != null) {
                    int var52 = this.field1730[arg0][arg1];
                    int var53 = this.field1730[arg0 + 1][arg1];
                    int var54 = this.field1730[arg0][arg1 + 1];
                    int var55 = super.field127 * arg0;
                    int var56 = super.field127 + var55;
                    int var57 = super.field127 * arg1;
                    int var58 = super.field127 + var57;
                    int var59 = (this.field1729 * var57 + this.field1739 * var55 + this.field1732 * var52 >> 15) + this.field1747;
                    int var60 = (this.field1734 * var57 + this.field1733 * var52 + this.field1727 * var55 >> 15) + this.field1737;
                    int var61 = (this.field1744 * var57 + this.field1741 * var52 + this.field1738 * var55 >> 15) + this.field1728;
                    int var62 = (this.field1729 * var57 + this.field1739 * var56 + this.field1732 * var53 >> 15) + this.field1747;
                    int var63 = (this.field1734 * var57 + this.field1733 * var53 + this.field1727 * var56 >> 15) + this.field1737;
                    int var64 = (this.field1744 * var57 + this.field1741 * var53 + this.field1738 * var56 >> 15) + this.field1728;
                    int var65 = (this.field1729 * var58 + this.field1739 * var55 + this.field1732 * var54 >> 15) + this.field1747;
                    int var66 = (this.field1734 * var58 + this.field1733 * var54 + this.field1727 * var55 >> 15) + this.field1737;
                    int var67 = (this.field1744 * var58 + this.field1741 * var54 + this.field1738 * var55 >> 15) + this.field1728;
                    for (int var68 = 0; var68 < var43.field4642; ++var68) {
                        short var69 = var43.field4639[var68];
                        short var70 = var43.field4640[var68];
                        short var71 = var43.field4632[var68];
                        int var72 = arg3[var69];
                        int var73 = arg3[var70];
                        int var74 = arg3[var71];
                        int var75 = arg4[var69];
                        int var76 = arg4[var70];
                        int var77 = arg4[var71];
                        if ((var72 - var73) * (var77 - var76) - (var74 - var73) * (var75 - var76) > 0) {
                            arg2.field3496 = var72 < 0 || var73 < 0 || var74 < 0 || var72 > arg2.field3504 || var73 > arg2.field3504 || var74 > arg2.field3504;
                            short var78 = var43.field4633[var68];
                            if (var78 != -1) {
                                if (this.method870(this.field1746.field4588.method938(28923, var78).field6169)) {
                                    arg2.field3505 = 100;
                                }
                                arg2.method1575(var75, var76, var77, var72, var73, var74, var43.field4641[var69], var43.field4641[var70], var43.field4641[var71], var59, var62, var65, var60, var63, var66, var61, var64, var67, var78);
                                arg2.field3505 = 0;
                            } else {
                                int var79 = var43.field4638[var68];
                                if (var79 != -1) {
                                    arg2.method1578(var75, var76, var77, var72, var73, var74, class432.method2687(var79, var43.field4641[var69], -3935), class432.method2687(var79, var43.field4641[var70], -3935), class432.method2687(var79, var43.field4641[var71], -3935));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var80 = 0; var80 < var43.field4642; ++var80) {
                    short var81 = var43.field4639[var80];
                    short var82 = var43.field4640[var80];
                    short var83 = var43.field4632[var80];
                    int var84 = arg3[var81];
                    int var85 = arg3[var82];
                    int var86 = arg3[var83];
                    int var87 = arg4[var81];
                    int var88 = arg4[var82];
                    int var89 = arg4[var83];
                    if ((var84 - var85) * (var89 - var88) - (var86 - var85) * (var87 - var88) > 0) {
                        int var90 = var43.field4638[var80];
                        if (var90 != -1) {
                            arg2.field3496 = var84 < 0 || var85 < 0 || var86 < 0 || var84 > arg2.field3504 || var85 > arg2.field3504 || var86 > arg2.field3504;
                            arg2.method1578(var87, var88, var89, var84, var85, var86, class432.method2687(var90, var43.field4641[var81], -3935), class432.method2687(var90, var43.field4641[var82], -3935), class432.method2687(var90, var43.field4641[var83], -3935));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!su", name = "b", descriptor = "(II)I", line = 2129)
    private static final int method869(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(Lrd;[I)V", line = 2161)
    public final void method60(class344 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!su", name = "c", descriptor = "(I)Z", line = 2167)
    private final boolean method870(int arg0) {
        if ((this.field1736 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else if (arg0 == 8) {
            return true;
        } else {
            return arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!su", name = "qa", descriptor = "(III)V", line = 2187)
    public final void method58(int arg0, int arg1, int arg2) {
        if (this.field1745[arg0][arg1] < arg2) {
            this.field1745[arg0][arg1] = (byte) arg2;
        }
    }
}
