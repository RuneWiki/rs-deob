import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class53 extends class177 {

    @OriginalMember(owner = "client!tn", name = "u", descriptor = "Lj;")
    private class349 field712;

    @OriginalMember(owner = "client!tn", name = "n", descriptor = "I")
    private int field705;

    @OriginalMember(owner = "client!tn", name = "D", descriptor = "[[I")
    public int[][] field721;

    @OriginalMember(owner = "client!tn", name = "z", descriptor = "I")
    private int field717;

    @OriginalMember(owner = "client!tn", name = "x", descriptor = "I")
    private int field715;

    @OriginalMember(owner = "client!tn", name = "E", descriptor = "[[B")
    private byte[][] field722;

    @OriginalMember(owner = "client!tn", name = "w", descriptor = "[[B")
    private byte[][] field714;

    @OriginalMember(owner = "client!tn", name = "j", descriptor = "I")
    private int field701;

    @OriginalMember(owner = "client!tn", name = "k", descriptor = "I")
    private int field702;

    @OriginalMember(owner = "client!tn", name = "l", descriptor = "I")
    private int field703;

    @OriginalMember(owner = "client!tn", name = "p", descriptor = "I")
    private int field707;

    @OriginalMember(owner = "client!tn", name = "q", descriptor = "I")
    private int field708;

    @OriginalMember(owner = "client!tn", name = "s", descriptor = "I")
    private int field710;

    @OriginalMember(owner = "client!tn", name = "t", descriptor = "I")
    private int field711;

    @OriginalMember(owner = "client!tn", name = "v", descriptor = "I")
    private int field713;

    @OriginalMember(owner = "client!tn", name = "y", descriptor = "I")
    private int field716;

    @OriginalMember(owner = "client!tn", name = "A", descriptor = "I")
    private int field718;

    @OriginalMember(owner = "client!tn", name = "B", descriptor = "I")
    private int field719;

    @OriginalMember(owner = "client!tn", name = "C", descriptor = "I")
    private int field720;

    @OriginalMember(owner = "client!tn", name = "F", descriptor = "[[Lle;")
    private class184[][] field723;

    @OriginalMember(owner = "client!tn", name = "r", descriptor = "[[Lce;")
    private class185[][] field709;

    @OriginalMember(owner = "client!tn", name = "o", descriptor = "[[Lre;")
    private class393[][] field706;

    @OriginalMember(owner = "client!tn", name = "m", descriptor = "[[Lcp;")
    private class470[][] field704;

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "(II)I")
    private static final int method364(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(III)V")
    public final void method365(int arg0, int arg1, int arg2) {
        if (this.field714[arg0][arg1] < arg2) {
            this.field714[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "()V")
    public final void method366() {
        this.field722 = null;
        this.field714 = null;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIIIIII[[ZLgf;[I[I)V")
    private final void method367(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class166 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field2292 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field704[var16][var17] != null) {
                        class470 var18 = this.field704[var16][var17];
                        if (var18.field6485 != -1 && (var18.field6484 & 2) == 0 && var18.field6490 == -1) {
                            int var19 = this.field712.method2158(var18.field6485);
                            arg8.method972(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class235.method1311(var19, var18.field6489 & 65535, (byte) -90), class235.method1311(var19, var18.field6486 & 65535, (byte) -114), class235.method1311(var19, var18.field6488 & 65535, (byte) -85));
                            arg8.method972(var15, var15, var15 - var13, var14, var13 + var14, var14, class235.method1311(var19, var18.field6487 & 65535, (byte) -118), class235.method1311(var19, var18.field6488 & 65535, (byte) -57), class235.method1311(var19, var18.field6486 & 65535, (byte) -117));
                        } else if (var18.field6490 == -1) {
                            arg8.method972(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field6489 & 65535, var18.field6486 & 65535, var18.field6488 & 65535);
                            arg8.method972(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field6487 & 65535, var18.field6488 & 65535, var18.field6486 & 65535);
                        } else {
                            int var20 = var18.field6490;
                            arg8.method972(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var20, var20, var20);
                            arg8.method972(var15, var15, var15 - var13, var14, var13 + var14, var14, var20, var20, var20);
                        }
                    } else if (this.field709[var16][var17] != null) {
                        class185 var21 = this.field709[var16][var17];
                        for (int var22 = 0; var22 < var21.field2543; ++var22) {
                            arg9[var22] = (var21.field2536[var22] - this.field717 * var16) * var13 / this.field717 + var14;
                            arg10[var22] = var15 - (var21.field2542[var22] - this.field717 * var17) * var13 / this.field717;
                        }
                        for (int var23 = 0; var23 < var21.field2532; ++var23) {
                            short var24 = var21.field2537[var23];
                            short var25 = var21.field2538[var23];
                            short var26 = var21.field2533[var23];
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field2540 != null && var21.field2540[var23] != -1) {
                                int var33 = var21.field2540[var23];
                                arg8.method972(var30, var31, var32, var27, var28, var29, class235.method1311(var33, var21.field2541[var24], (byte) -65), class235.method1311(var33, var21.field2541[var25], (byte) -99), class235.method1311(var33, var21.field2541[var26], (byte) -64));
                            } else if (var21.field2535 != null && var21.field2535[var23] != -1) {
                                int var34 = this.field712.method2158(var21.field2535[var23]);
                                arg8.method972(var30, var31, var32, var27, var28, var29, class235.method1311(var34, var21.field2541[var24], (byte) -117), class235.method1311(var34, var21.field2541[var25], (byte) -70), class235.method1311(var34, var21.field2541[var26], (byte) -128));
                            } else {
                                int var35 = var21.field2539[var23];
                                arg8.method972(var30, var31, var32, var27, var28, var29, class235.method1311(var35, var21.field2541[var24], (byte) -92), class235.method1311(var35, var21.field2541[var25], (byte) -66), class235.method1311(var35, var21.field2541[var26], (byte) -101));
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field2292 = true;
    }

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "(II)I")
    public final int method368(int arg0, int arg1) {
        int var3 = arg0 >> this.field715;
        int var4 = arg1 >> this.field715;
        if (var3 >= 0 && var4 >= 0 && var3 <= super.field2410 - 1 && var4 <= super.field2409 - 1) {
            int var5 = arg0 & this.field717 - 1;
            int var6 = arg1 & this.field717 - 1;
            int var7 = (this.field717 - var5) * this.field721[var3][var4] + this.field721[var3 + 1][var4] * var5 >> this.field715;
            int var8 = (this.field717 - var5) * this.field721[var3][var4 + 1] + this.field721[var3 + 1][var4 + 1] * var5 >> this.field715;
            return (this.field717 - var6) * var7 + var6 * var8 >> this.field715;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IILkb;)Lkb;")
    public final class449 method369(int arg0, int arg1, class449 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "(I)Z")
    private final boolean method370(int arg0) {
        if ((this.field705 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else {
            return arg0 == 8;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(II)I")
    public final int method371(int arg0, int arg1) {
        return this.field721[arg0][arg1];
    }

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "(Lkb;IIIIZ)V")
    public final void method372(class449 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "(Lkb;IIIIZ)Z")
    public final boolean method373(class449 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "(II)V")
    public final void method374(int arg0, int arg1) {
        class104 var3 = this.field712.method2156(Thread.currentThread());
        var3.field1508.field2293 = 0;
        if (this.field706 != null) {
            this.method375(arg0, arg1, this.field712.field4809, var3.field1508, var3.field1534, var3.field1547, var3.field1529);
        } else {
            if (this.field704 != null) {
                this.method376(arg0, arg1, var3.field1508, var3.field1534, var3.field1547, var3.field1529);
            }
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIZLgf;[I[I[I)V")
    private final void method375(int arg0, int arg1, boolean arg2, class166 arg3, int[] arg4, int[] arg5, int[] arg6) {
        class393 var8 = this.field706[arg0][arg1];
        if (var8 != null) {
            if ((var8.field5449 & 2) == 0) {
                int var9 = this.field717 * arg0;
                int var10 = this.field717 + var9;
                int var11 = this.field717 * arg1;
                int var12 = this.field717 + var11;
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
                if ((var8.field5449 & 1) != 0 && !arg2) {
                    int var17 = this.field721[arg0][arg1];
                    int var18 = this.field720 * var17;
                    var19 = (this.field703 * var11 + this.field701 * var9 + var18 >> 15) + this.field708;
                    if (var19 <= this.field712.field4806) {
                        return;
                    }
                    var20 = (this.field703 * var11 + this.field701 * var10 + var18 >> 15) + this.field708;
                    if (var20 <= this.field712.field4806) {
                        return;
                    }
                    var21 = (this.field703 * var12 + this.field701 * var10 + var18 >> 15) + this.field708;
                    if (var21 <= this.field712.field4806) {
                        return;
                    }
                    var22 = (this.field703 * var12 + this.field701 * var9 + var18 >> 15) + this.field708;
                    if (var22 <= this.field712.field4806) {
                        return;
                    }
                    if (this.field712.field4805) {
                        int var23 = var19 - this.field712.field4839;
                        if (var23 > 0) {
                            var13 = var23;
                            if (var23 > 255) {
                                var13 = 255;
                            }
                        }
                        int var24 = var20 - this.field712.field4839;
                        if (var24 > 0) {
                            var14 = var24;
                            if (var24 > 255) {
                                var14 = 255;
                            }
                        }
                        int var25 = var21 - this.field712.field4839;
                        if (var25 > 0) {
                            var15 = var25;
                            if (var25 > 255) {
                                var15 = 255;
                            }
                        }
                        int var26 = var22 - this.field712.field4839;
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    int var27 = this.field711 * var17;
                    int var28 = this.field702 * var17;
                    var29 = (this.field716 * var11 + this.field718 * var9 + var27 >> 15) + this.field713;
                    var30 = this.field712.field4817 * var29 / var19 + arg3.field2296;
                    var31 = (this.field719 * var11 + this.field710 * var9 + var28 >> 15) + this.field707;
                    var32 = this.field712.field4803 * var31 / var19 + arg3.field2291;
                    var33 = (this.field716 * var11 + this.field718 * var10 + var27 >> 15) + this.field713;
                    var34 = this.field712.field4817 * var33 / var20 + arg3.field2296;
                    var35 = (this.field719 * var11 + this.field710 * var10 + var28 >> 15) + this.field707;
                    var36 = this.field712.field4803 * var35 / var20 + arg3.field2291;
                    var37 = (this.field716 * var12 + this.field718 * var10 + var27 >> 15) + this.field713;
                    var38 = this.field712.field4817 * var37 / var21 + arg3.field2296;
                    var39 = (this.field719 * var12 + this.field710 * var10 + var28 >> 15) + this.field707;
                    var40 = this.field712.field4803 * var39 / var21 + arg3.field2291;
                    var41 = (this.field716 * var12 + this.field718 * var9 + var27 >> 15) + this.field713;
                    var42 = this.field712.field4817 * var41 / var22 + arg3.field2296;
                    var43 = (this.field719 * var12 + this.field710 * var9 + var28 >> 15) + this.field707;
                    var44 = this.field712.field4803 * var43 / var22 + arg3.field2291;
                } else {
                    int var45 = this.field721[arg0][arg1];
                    int var46 = this.field721[arg0 + 1][arg1];
                    int var47 = this.field721[arg0 + 1][arg1 + 1];
                    int var48 = this.field721[arg0][arg1 + 1];
                    var19 = (this.field703 * var11 + this.field720 * var45 + this.field701 * var9 >> 15) + this.field708;
                    if (var19 <= this.field712.field4806) {
                        return;
                    }
                    var20 = (this.field703 * var11 + this.field720 * var46 + this.field701 * var10 >> 15) + this.field708;
                    if (var20 <= this.field712.field4806) {
                        return;
                    }
                    var21 = (this.field703 * var12 + this.field720 * var47 + this.field701 * var10 >> 15) + this.field708;
                    if (var21 <= this.field712.field4806) {
                        return;
                    }
                    var22 = (this.field703 * var12 + this.field720 * var48 + this.field701 * var9 >> 15) + this.field708;
                    if (var22 <= this.field712.field4806) {
                        return;
                    }
                    if (arg2) {
                        int var49 = var19 - this.field712.field4839;
                        if (var49 > 255) {
                            var49 = 255;
                        }
                        if (var49 > 0) {
                            var13 = var49;
                            int var50 = var8.field5455 * var49 / 255;
                            if (var50 > 0) {
                                var45 -= var50;
                            }
                        }
                        int var51 = var20 - this.field712.field4839;
                        if (var51 > 255) {
                            var51 = 255;
                        }
                        if (var51 > 0) {
                            var14 = var51;
                            int var52 = var8.field5454 * var51 / 255;
                            if (var52 > 0) {
                                var46 -= var52;
                            }
                        }
                        int var53 = var21 - this.field712.field4839;
                        if (var53 > 255) {
                            var53 = 255;
                        }
                        if (var53 > 0) {
                            var15 = var53;
                            int var54 = var8.field5453 * var53 / 255;
                            if (var54 > 0) {
                                var47 -= var54;
                            }
                        }
                        int var55 = var22 - this.field712.field4839;
                        if (var55 > 255) {
                            var55 = 255;
                        }
                        if (var55 > 0) {
                            var16 = var55;
                            int var56 = var8.field5459 * var55 / 255;
                            if (var56 > 0) {
                                var48 -= var56;
                            }
                        }
                    } else if (this.field712.field4805) {
                        int var57 = var19 - this.field712.field4839;
                        if (var57 > 0) {
                            var13 = var57;
                            if (var57 > 255) {
                                var13 = 255;
                            }
                        }
                        int var58 = var20 - this.field712.field4839;
                        if (var58 > 0) {
                            var14 = var58;
                            if (var58 > 255) {
                                var14 = 255;
                            }
                        }
                        int var59 = var21 - this.field712.field4839;
                        if (var59 > 0) {
                            var15 = var59;
                            if (var59 > 255) {
                                var15 = 255;
                            }
                        }
                        int var60 = var22 - this.field712.field4839;
                        if (var60 > 0) {
                            var16 = var60;
                            if (var60 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    var29 = (this.field716 * var11 + this.field718 * var9 + this.field711 * var45 >> 15) + this.field713;
                    var30 = this.field712.field4817 * var29 / var19 + arg3.field2296;
                    var31 = (this.field719 * var11 + this.field710 * var9 + this.field702 * var45 >> 15) + this.field707;
                    var32 = this.field712.field4803 * var31 / var19 + arg3.field2291;
                    var33 = (this.field716 * var11 + this.field718 * var10 + this.field711 * var46 >> 15) + this.field713;
                    var34 = this.field712.field4817 * var33 / var20 + arg3.field2296;
                    var35 = (this.field719 * var11 + this.field710 * var10 + this.field702 * var46 >> 15) + this.field707;
                    var36 = this.field712.field4803 * var35 / var20 + arg3.field2291;
                    var37 = (this.field716 * var12 + this.field718 * var10 + this.field711 * var47 >> 15) + this.field713;
                    var38 = this.field712.field4817 * var37 / var21 + arg3.field2296;
                    var39 = (this.field719 * var12 + this.field710 * var10 + this.field702 * var47 >> 15) + this.field707;
                    var40 = this.field712.field4803 * var39 / var21 + arg3.field2291;
                    var41 = (this.field716 * var12 + this.field718 * var9 + this.field711 * var48 >> 15) + this.field713;
                    var42 = this.field712.field4817 * var41 / var22 + arg3.field2296;
                    var43 = (this.field719 * var12 + this.field710 * var9 + this.field702 * var48 >> 15) + this.field707;
                    var44 = this.field712.field4803 * var43 / var22 + arg3.field2291;
                }
                boolean var61 = var8.field5456 != -1 && this.method370(this.field712.field4988.method1621(18318, var8.field5456).field301);
                int var62 = var14 + var15 + var16;
                if ((var36 - var44) * (var38 - var42) - (var34 - var42) * (var40 - var44) > 0) {
                    arg3.field2298 = var38 < 0 || var42 < 0 || var34 < 0 || var38 > arg3.field2295 || var42 > arg3.field2295 || var34 > arg3.field2295;
                    if (var62 < 765) {
                        if (var61) {
                            arg3.field2293 = 100;
                        }
                        if (var62 > 0) {
                            if (var8.field5456 >= 0) {
                                arg3.method966(var40, var44, var36, var38, var42, var34, this.field712.field4819, var15, var16, var14, var8.field5457, var8.field5452, var8.field5450, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field5456);
                            } else {
                                arg3.method975(var40, var44, var36, var38, var42, var34, class374.method2299(17, var8.field5457, var15 << 24 | this.field712.field4819), class374.method2299(53, var8.field5452, var16 << 24 | this.field712.field4819), class374.method2299(50, var8.field5450, var14 << 24 | this.field712.field4819));
                            }
                        } else if (var8.field5456 >= 0) {
                            arg3.method976(var40, var44, var36, var38, var42, var34, var8.field5457, var8.field5452, var8.field5450, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field5456);
                        } else {
                            arg3.method975(var40, var44, var36, var38, var42, var34, var8.field5457, var8.field5452, var8.field5450);
                        }
                        arg3.field2293 = 0;
                    } else {
                        arg3.method968(var40, var44, var36, var38, var42, var34, this.field712.field4819);
                    }
                }
                int var63 = var13 + var14 + var16;
                if ((var30 - var34) * (var44 - var36) - (var32 - var36) * (var42 - var34) > 0) {
                    arg3.field2298 = var30 < 0 || var34 < 0 || var42 < 0 || var30 > arg3.field2295 || var34 > arg3.field2295 || var42 > arg3.field2295;
                    if (var63 < 765) {
                        if (var61) {
                            arg3.field2293 = 100;
                        }
                        if (var63 > 0) {
                            if (var8.field5456 >= 0) {
                                arg3.method966(var32, var36, var44, var30, var34, var42, this.field712.field4819, var13, var14, var16, var8.field5451, var8.field5450, var8.field5452, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field5456);
                            } else {
                                arg3.method975(var32, var36, var44, var30, var34, var42, class374.method2299(-105, var8.field5451, var13 << 24 | this.field712.field4819), class374.method2299(76, var8.field5450, var14 << 24 | this.field712.field4819), class374.method2299(13, var8.field5452, var16 << 24 | this.field712.field4819));
                            }
                        } else if (var8.field5456 >= 0) {
                            arg3.method976(var32, var36, var44, var30, var34, var42, var8.field5451, var8.field5450, var8.field5452, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field5456);
                        } else {
                            arg3.method975(var32, var36, var44, var30, var34, var42, var8.field5451, var8.field5450, var8.field5452);
                        }
                        arg3.field2293 = 0;
                        return;
                    }
                    arg3.method968(var32, var36, var44, var30, var34, var42, this.field712.field4819);
                }
            }
        } else {
            class184 var64 = this.field723[arg0][arg1];
            if (var64 != null) {
                for (int var65 = 0; var65 < var64.field2525; ++var65) {
                    short var105 = var64.field2527[var65];
                    int var106 = var64.field2528[var65];
                    short var107 = var64.field2524[var65];
                    int var108 = (this.field703 * var107 + this.field720 * var106 + this.field701 * var105 >> 15) + this.field708;
                    if (var108 <= this.field712.field4806) {
                        return;
                    }
                    arg6[var65] = 0;
                    if (arg2) {
                        int var109 = var108 - this.field712.field4839;
                        if (var109 > 255) {
                            var109 = 255;
                        }
                        if (var109 > 0) {
                            arg6[var65] = var109;
                            int var110 = var64.field2526[var65] * var109 / 255;
                            if (var110 > 0) {
                                var106 -= var110;
                            }
                        }
                    } else if (this.field712.field4805) {
                        int var111 = var108 - this.field712.field4839;
                        if (var111 > 0) {
                            arg6[var65] = var111;
                            if (arg6[var65] > 255) {
                                arg6[var65] = 255;
                            }
                        }
                    }
                    int var112 = (this.field716 * var107 + this.field718 * var105 + this.field711 * var106 >> 15) + this.field713;
                    int var113 = (this.field719 * var107 + this.field710 * var105 + this.field702 * var106 >> 15) + this.field707;
                    arg4[var65] = this.field712.field4817 * var112 / var108 + arg3.field2296;
                    arg5[var65] = this.field712.field4803 * var113 / var108 + arg3.field2291;
                }
                if (var64.field2523 != null) {
                    int var66 = this.field721[arg0][arg1];
                    int var67 = this.field721[arg0 + 1][arg1];
                    int var68 = this.field721[arg0][arg1 + 1];
                    int var69 = this.field717 * arg0;
                    int var70 = this.field717 + var69;
                    int var71 = this.field717 * arg1;
                    int var72 = this.field717 + var71;
                    int var73 = (this.field716 * var71 + this.field718 * var69 + this.field711 * var66 >> 15) + this.field713;
                    int var74 = (this.field719 * var71 + this.field710 * var69 + this.field702 * var66 >> 15) + this.field707;
                    int var75 = (this.field703 * var71 + this.field720 * var66 + this.field701 * var69 >> 15) + this.field708;
                    int var76 = (this.field716 * var71 + this.field718 * var70 + this.field711 * var67 >> 15) + this.field713;
                    int var77 = (this.field719 * var71 + this.field710 * var70 + this.field702 * var67 >> 15) + this.field707;
                    int var78 = (this.field703 * var71 + this.field720 * var67 + this.field701 * var70 >> 15) + this.field708;
                    int var79 = (this.field716 * var72 + this.field718 * var69 + this.field711 * var68 >> 15) + this.field713;
                    int var80 = (this.field719 * var72 + this.field710 * var69 + this.field702 * var68 >> 15) + this.field707;
                    int var81 = (this.field703 * var72 + this.field720 * var68 + this.field701 * var69 >> 15) + this.field708;
                    for (int var82 = 0; var82 < var64.field2530; ++var82) {
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
                            arg3.field2298 = var86 < 0 || var87 < 0 || var88 < 0 || var86 > arg3.field2295 || var87 > arg3.field2295 || var88 > arg3.field2295;
                            short var93 = var64.field2523[var82];
                            if (var92 < 765) {
                                if (var93 != -1 && this.method370(this.field712.field4988.method1621(18318, var93).field301)) {
                                    arg3.field2293 = 100;
                                }
                                if (var92 > 0) {
                                    if (var93 != -1) {
                                        arg3.method966(var89, var90, var91, var86, var87, var88, this.field712.field4819, arg6[var83], arg6[var84], arg6[var85], var64.field2522[var83], var64.field2522[var84], var64.field2522[var85], var73, var76, var79, var74, var77, var80, var75, var78, var81, var93);
                                    } else if ((var64.field2522[var83] & 16777215) != 0) {
                                        arg3.method975(var89, var90, var91, var86, var87, var88, class374.method2299(109, var64.field2522[var83], arg6[var83] << 24 | this.field712.field4819), class374.method2299(66, var64.field2522[var84], arg6[var84] << 24 | this.field712.field4819), class374.method2299(88, var64.field2522[var85], arg6[var85] << 24 | this.field712.field4819));
                                    }
                                } else if (var93 != -1) {
                                    arg3.method976(var89, var90, var91, var86, var87, var88, var64.field2522[var83], var64.field2522[var84], var64.field2522[var85], var73, var76, var79, var74, var77, var80, var75, var78, var81, var93);
                                } else if ((var64.field2522[var83] & 16777215) != 0) {
                                    arg3.method975(var89, var90, var91, var86, var87, var88, var64.field2522[var83], var64.field2522[var84], var64.field2522[var85]);
                                }
                                arg3.field2293 = 0;
                            } else {
                                arg3.method968(var89, var90, var91, var86, var87, var88, this.field712.field4819);
                            }
                        }
                    }
                    return;
                }
                for (int var94 = 0; var94 < var64.field2530; ++var94) {
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
                        arg3.field2298 = var98 < 0 || var99 < 0 || var100 < 0 || var98 > arg3.field2295 || var99 > arg3.field2295 || var100 > arg3.field2295;
                        if (var104 < 765) {
                            if (var104 > 0) {
                                if ((var64.field2522[var95] & 16777215) != 0) {
                                    arg3.method975(var101, var102, var103, var98, var99, var100, class431.method2550(arg6[var95], -31673, this.field712.field4819, var64.field2522[var95]), class431.method2550(arg6[var96], -31673, this.field712.field4819, var64.field2522[var96]), class431.method2550(arg6[var97], -31673, this.field712.field4819, var64.field2522[var97]));
                                }
                            } else if ((var64.field2522[var95] & 16777215) != 0) {
                                arg3.method975(var101, var102, var103, var98, var99, var100, var64.field2522[var95], var64.field2522[var96], var64.field2522[var97]);
                            }
                        } else {
                            arg3.method968(var101, var102, var103, var98, var99, var100, this.field712.field4819);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IILgf;[I[I[I)V")
    private final void method376(int arg0, int arg1, class166 arg2, int[] arg3, int[] arg4, int[] arg5) {
        class470 var7 = this.field704[arg0][arg1];
        if (var7 != null) {
            if ((var7.field6484 & 2) == 0) {
                int var8 = this.field717 * arg0;
                int var9 = this.field717 + var8;
                int var10 = this.field717 * arg1;
                int var11 = this.field717 + var10;
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
                if ((var7.field6484 & 1) != 0) {
                    int var12 = this.field721[arg0][arg1];
                    int var13 = this.field720 * var12;
                    var14 = (this.field703 * var10 + this.field701 * var8 + var13 >> 15) + this.field708;
                    if (var14 <= this.field712.field4806) {
                        return;
                    }
                    var15 = (this.field703 * var10 + this.field701 * var9 + var13 >> 15) + this.field708;
                    if (var15 <= this.field712.field4806) {
                        return;
                    }
                    int var16 = (this.field703 * var11 + this.field701 * var9 + var13 >> 15) + this.field708;
                    if (var16 <= this.field712.field4806) {
                        return;
                    }
                    var17 = (this.field703 * var11 + this.field701 * var8 + var13 >> 15) + this.field708;
                    if (var17 <= this.field712.field4806) {
                        return;
                    }
                    int var18 = this.field711 * var12;
                    int var19 = this.field702 * var12;
                    var20 = (this.field716 * var10 + this.field718 * var8 + var18 >> 15) + this.field713;
                    var21 = this.field712.field4817 * var20 / var14 + arg2.field2296;
                    var22 = (this.field719 * var10 + this.field710 * var8 + var19 >> 15) + this.field707;
                    var23 = this.field712.field4803 * var22 / var14 + arg2.field2291;
                    var24 = (this.field716 * var10 + this.field718 * var9 + var18 >> 15) + this.field713;
                    var25 = this.field712.field4817 * var24 / var15 + arg2.field2296;
                    var26 = (this.field719 * var10 + this.field710 * var9 + var19 >> 15) + this.field707;
                    var27 = this.field712.field4803 * var26 / var15 + arg2.field2291;
                    int var28 = (this.field716 * var11 + this.field718 * var9 + var18 >> 15) + this.field713;
                    var29 = this.field712.field4817 * var28 / var16 + arg2.field2296;
                    int var30 = (this.field719 * var11 + this.field710 * var9 + var19 >> 15) + this.field707;
                    var31 = this.field712.field4803 * var30 / var16 + arg2.field2291;
                    var32 = (this.field716 * var11 + this.field718 * var8 + var18 >> 15) + this.field713;
                    var33 = this.field712.field4817 * var32 / var17 + arg2.field2296;
                    var34 = (this.field719 * var11 + this.field710 * var8 + var19 >> 15) + this.field707;
                    var35 = this.field712.field4803 * var34 / var17 + arg2.field2291;
                } else {
                    int var36 = this.field721[arg0][arg1];
                    int var37 = this.field721[arg0 + 1][arg1];
                    int var38 = this.field721[arg0 + 1][arg1 + 1];
                    int var39 = this.field721[arg0][arg1 + 1];
                    var14 = (this.field703 * var10 + this.field720 * var36 + this.field701 * var8 >> 15) + this.field708;
                    if (var14 <= this.field712.field4806) {
                        return;
                    }
                    var15 = (this.field703 * var10 + this.field720 * var37 + this.field701 * var9 >> 15) + this.field708;
                    if (var15 <= this.field712.field4806) {
                        return;
                    }
                    int var40 = (this.field703 * var11 + this.field720 * var38 + this.field701 * var9 >> 15) + this.field708;
                    if (var40 <= this.field712.field4806) {
                        return;
                    }
                    var17 = (this.field703 * var11 + this.field720 * var39 + this.field701 * var8 >> 15) + this.field708;
                    if (var17 <= this.field712.field4806) {
                        return;
                    }
                    var20 = (this.field716 * var10 + this.field718 * var8 + this.field711 * var36 >> 15) + this.field713;
                    var21 = this.field712.field4817 * var20 / var14 + arg2.field2296;
                    var22 = (this.field719 * var10 + this.field710 * var8 + this.field702 * var36 >> 15) + this.field707;
                    var23 = this.field712.field4803 * var22 / var14 + arg2.field2291;
                    var24 = (this.field716 * var10 + this.field718 * var9 + this.field711 * var37 >> 15) + this.field713;
                    var25 = this.field712.field4817 * var24 / var15 + arg2.field2296;
                    var26 = (this.field719 * var10 + this.field710 * var9 + this.field702 * var37 >> 15) + this.field707;
                    var27 = this.field712.field4803 * var26 / var15 + arg2.field2291;
                    int var41 = (this.field716 * var11 + this.field718 * var9 + this.field711 * var38 >> 15) + this.field713;
                    var29 = this.field712.field4817 * var41 / var40 + arg2.field2296;
                    int var42 = (this.field719 * var11 + this.field710 * var9 + this.field702 * var38 >> 15) + this.field707;
                    var31 = this.field712.field4803 * var42 / var40 + arg2.field2291;
                    var32 = (this.field716 * var11 + this.field718 * var8 + this.field711 * var39 >> 15) + this.field713;
                    var33 = this.field712.field4817 * var32 / var17 + arg2.field2296;
                    var34 = (this.field719 * var11 + this.field710 * var8 + this.field702 * var39 >> 15) + this.field707;
                    var35 = this.field712.field4803 * var34 / var17 + arg2.field2291;
                }
                if ((var27 - var35) * (var29 - var33) - (var25 - var33) * (var31 - var35) > 0) {
                    arg2.field2298 = var29 < 0 || var33 < 0 || var25 < 0 || var29 > arg2.field2295 || var33 > arg2.field2295 || var25 > arg2.field2295;
                    if (var7.field6485 >= 0) {
                        if (this.method370(this.field712.field4988.method1621(18318, var7.field6485).field301)) {
                            arg2.field2293 = 100;
                        }
                        arg2.method976(var31, var35, var27, var29, var33, var25, var7.field6489 & 65535, var7.field6486 & 65535, var7.field6488 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field6485);
                        arg2.field2293 = 0;
                    } else {
                        arg2.method972(var31, var35, var27, var29, var33, var25, var7.field6489 & 65535, var7.field6486 & 65535, var7.field6488 & 65535);
                    }
                }
                if ((var21 - var25) * (var35 - var27) - (var23 - var27) * (var33 - var25) > 0) {
                    arg2.field2298 = var21 < 0 || var25 < 0 || var33 < 0 || var21 > arg2.field2295 || var25 > arg2.field2295 || var33 > arg2.field2295;
                    if (var7.field6485 >= 0) {
                        if (this.method370(this.field712.field4988.method1621(18318, var7.field6485).field301)) {
                            arg2.field2293 = 100;
                        }
                        arg2.method976(var23, var27, var35, var21, var25, var33, var7.field6487 & 65535, var7.field6488 & 65535, var7.field6486 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field6485);
                        arg2.field2293 = 0;
                        return;
                    }
                    arg2.method972(var23, var27, var35, var21, var25, var33, var7.field6487 & 65535, var7.field6488 & 65535, var7.field6486 & 65535);
                }
            }
        } else {
            class185 var43 = this.field709[arg0][arg1];
            if (var43 != null) {
                for (int var44 = 0; var44 < var43.field2543; ++var44) {
                    int var84 = var43.field2536[var44];
                    int var85 = var43.field2534[var44];
                    int var86 = var43.field2542[var44];
                    int var87 = (this.field703 * var86 + this.field720 * var85 + this.field701 * var84 >> 15) + this.field708;
                    if (var87 <= this.field712.field4806) {
                        return;
                    }
                    int var88 = (this.field716 * var86 + this.field718 * var84 + this.field711 * var85 >> 15) + this.field713;
                    int var89 = (this.field719 * var86 + this.field710 * var84 + this.field702 * var85 >> 15) + this.field707;
                    arg3[var44] = this.field712.field4817 * var88 / var87 + arg2.field2296;
                    arg4[var44] = this.field712.field4803 * var89 / var87 + arg2.field2291;
                }
                if (var43.field2535 != null) {
                    int var45 = this.field721[arg0][arg1];
                    int var46 = this.field721[arg0 + 1][arg1];
                    int var47 = this.field721[arg0][arg1 + 1];
                    int var48 = this.field717 * arg0;
                    int var49 = this.field717 + var48;
                    int var50 = this.field717 * arg1;
                    int var51 = this.field717 + var50;
                    int var52 = (this.field716 * var50 + this.field718 * var48 + this.field711 * var45 >> 15) + this.field713;
                    int var53 = (this.field719 * var50 + this.field710 * var48 + this.field702 * var45 >> 15) + this.field707;
                    int var54 = (this.field703 * var50 + this.field720 * var45 + this.field701 * var48 >> 15) + this.field708;
                    int var55 = (this.field716 * var50 + this.field718 * var49 + this.field711 * var46 >> 15) + this.field713;
                    int var56 = (this.field719 * var50 + this.field710 * var49 + this.field702 * var46 >> 15) + this.field707;
                    int var57 = (this.field703 * var50 + this.field720 * var46 + this.field701 * var49 >> 15) + this.field708;
                    int var58 = (this.field716 * var51 + this.field718 * var48 + this.field711 * var47 >> 15) + this.field713;
                    int var59 = (this.field719 * var51 + this.field710 * var48 + this.field702 * var47 >> 15) + this.field707;
                    int var60 = (this.field703 * var51 + this.field720 * var47 + this.field701 * var48 >> 15) + this.field708;
                    for (int var61 = 0; var61 < var43.field2532; ++var61) {
                        short var62 = var43.field2537[var61];
                        short var63 = var43.field2538[var61];
                        short var64 = var43.field2533[var61];
                        int var65 = arg3[var62];
                        int var66 = arg3[var63];
                        int var67 = arg3[var64];
                        int var68 = arg4[var62];
                        int var69 = arg4[var63];
                        int var70 = arg4[var64];
                        if ((var65 - var66) * (var70 - var69) - (var67 - var66) * (var68 - var69) > 0) {
                            arg2.field2298 = var65 < 0 || var66 < 0 || var67 < 0 || var65 > arg2.field2295 || var66 > arg2.field2295 || var67 > arg2.field2295;
                            short var71 = var43.field2535[var61];
                            if (var71 != -1) {
                                if (this.method370(this.field712.field4988.method1621(18318, var71).field301)) {
                                    arg2.field2293 = 100;
                                }
                                arg2.method976(var68, var69, var70, var65, var66, var67, var43.field2541[var62], var43.field2541[var63], var43.field2541[var64], var52, var55, var58, var53, var56, var59, var54, var57, var60, var71);
                                arg2.field2293 = 0;
                            } else {
                                int var72 = var43.field2539[var61];
                                if (var72 != -1) {
                                    arg2.method972(var68, var69, var70, var65, var66, var67, class235.method1311(var72, var43.field2541[var62], (byte) -92), class235.method1311(var72, var43.field2541[var63], (byte) -94), class235.method1311(var72, var43.field2541[var64], (byte) -109));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var73 = 0; var73 < var43.field2532; ++var73) {
                    short var74 = var43.field2537[var73];
                    short var75 = var43.field2538[var73];
                    short var76 = var43.field2533[var73];
                    int var77 = arg3[var74];
                    int var78 = arg3[var75];
                    int var79 = arg3[var76];
                    int var80 = arg4[var74];
                    int var81 = arg4[var75];
                    int var82 = arg4[var76];
                    if ((var77 - var78) * (var82 - var81) - (var79 - var78) * (var80 - var81) > 0) {
                        int var83 = var43.field2539[var73];
                        if (var83 != -1) {
                            arg2.field2298 = var77 < 0 || var78 < 0 || var79 < 0 || var77 > arg2.field2295 || var78 > arg2.field2295 || var79 > arg2.field2295;
                            arg2.method972(var80, var81, var82, var77, var78, var79, class235.method1311(var83, var43.field2541[var74], (byte) -118), class235.method1311(var83, var43.field2541[var75], (byte) -58), class235.method1311(var83, var43.field2541[var76], (byte) -128));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method377(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class104 var9 = this.field712.method2156(Thread.currentThread());
        class166 var10 = var9.field1508;
        var10.field2293 = 0;
        var10.field2298 = false;
        if (this.field706 != null) {
            this.method378(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field1534, var9.field1547);
        } else {
            if (this.field704 != null) {
                this.method367(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field1534, var9.field1547);
            }
        }
    }

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(Lj;IIII[[I[[II)V")
    public class53(class349 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4);
        this.field712 = arg0;
        this.field705 = arg2;
        this.field721 = arg5;
        this.field717 = arg7;
        this.field715 = 0;
        while (arg7 > 1) {
            ++this.field715;
            arg7 >>= 1;
        }
        this.field722 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field712.field4818 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + var13 * var13 + 65536));
                int var16 = (var13 << 8) / var15;
                int var17 = -65536 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field712.field4816 * var18 + this.field712.field4810 * var16 + this.field712.field4801 * var17 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field722[var11][var10] = (byte) var20;
            }
        }
        this.field714 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "(IIIIIII[[ZLgf;[I[I)V")
    private final void method378(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class166 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field2292 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field706[var16][var17] != null) {
                        class393 var18 = this.field706[var16][var17];
                        if (var18.field5456 != -1 && (var18.field5449 & 2) == 0 && var18.field5458 == 0) {
                            int var19 = this.field712.method2158(var18.field5456);
                            arg8.method972(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class235.method1311(var19, var18.field5457, (byte) -127), class235.method1311(var19, var18.field5452, (byte) -111), class235.method1311(var19, var18.field5450, (byte) -102));
                            arg8.method972(var15, var15, var15 - var13, var14, var13 + var14, var14, class235.method1311(var19, var18.field5451, (byte) -56), class235.method1311(var19, var18.field5450, (byte) -122), class235.method1311(var19, var18.field5452, (byte) -74));
                        } else if (var18.field5458 == 0) {
                            arg8.method975(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field5457, var18.field5452, var18.field5450);
                            arg8.method975(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field5451, var18.field5450, var18.field5452);
                        } else {
                            int var20 = var18.field5458;
                            arg8.method975(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class374.method2299(28, var20, var18.field5457 & -16777216), class374.method2299(123, var20, var18.field5452 & -16777216), class374.method2299(68, var20, var18.field5450 & -16777216));
                            arg8.method975(var15, var15, var15 - var13, var14, var13 + var14, var14, class374.method2299(39, var20, var18.field5451 & -16777216), class374.method2299(-114, var20, var18.field5450 & -16777216), class374.method2299(-104, var20, var18.field5452 & -16777216));
                        }
                    } else if (this.field723[var16][var17] != null) {
                        class184 var21 = this.field723[var16][var17];
                        for (int var22 = 0; var22 < var21.field2525; ++var22) {
                            arg9[var22] = (var21.field2527[var22] - this.field717 * var16) * var13 / this.field717 + var14;
                            arg10[var22] = var15 - (var21.field2524[var22] - this.field717 * var17) * var13 / this.field717;
                        }
                        for (int var23 = 0; var23 < var21.field2530; ++var23) {
                            int var24 = var23 * 3;
                            int var25 = var24 + 1;
                            int var26 = var25 + 1;
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field2529 == null || var21.field2529[var23] == 0 || var21.field2523 != null && (var21.field2523 == null || var21.field2523[var23] != -1)) {
                                if (var21.field2523 != null && var21.field2523[var23] != -1) {
                                    int var34 = this.field712.method2158(var21.field2523[var23]);
                                    arg8.method972(var30, var31, var32, var27, var28, var29, var34, var34, var34);
                                } else {
                                    arg8.method975(var30, var31, var32, var27, var28, var29, var21.field2522[var24], var21.field2522[var25], var21.field2522[var26]);
                                }
                            } else {
                                int var33 = var21.field2529[var23];
                                arg8.method975(var30, var31, var32, var27, var28, var29, class374.method2299(14, var33, -16777216 - (var21.field2522[var24] & -16777216)), class374.method2299(29, var33, -16777216 - (var21.field2522[var25] & -16777216)), class374.method2299(126, var33, -16777216 - (var21.field2522[var26] & -16777216)));
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field2292 = true;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lkb;IIIIZ)V")
    public final void method379(class449 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lof;[I)V")
    public final void method380(class404 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method381(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (this.field706 == null) {
            this.field706 = new class393[super.field2410][super.field2409];
            this.field723 = new class184[super.field2410][super.field2409];
        } else if (this.field704 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var15 = 0; var15 < arg6.length; ++var15) {
                if (arg6[var15] == -1) {
                    arg6[var15] = 0;
                } else {
                    arg6[var15] = class461.field6250[class146.method868(arg6[var15], -2045205981) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var16 = 0; var16 < arg7.length; ++var16) {
                    if (arg7[var16] == -1) {
                        arg7[var16] = 0;
                    } else {
                        arg7[var16] = class461.field6250[class146.method868(arg7[var16], -2045205981) & 65535] << 8 | 255;
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
                    } else if (arg2[var22] == this.field717 && arg4[var22] == 0) {
                        if (var19 != -1 && arg6[var19] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var19 = var22;
                    } else if (arg2[var22] == this.field717 && arg4[var22] == this.field717) {
                        if (var20 != -1 && arg6[var20] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var20 = var22;
                    } else if (arg2[var22] == 0 && arg4[var22] == this.field717) {
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
                            if (arg2[var24] != arg2[0] && arg2[0] + this.field717 != arg2[var24] && arg2[0] - this.field717 != arg2[var24]) {
                                var17 = false;
                                break;
                            }
                            if (arg4[var24] != arg4[0] && arg4[0] + this.field717 != arg4[var24] && arg4[0] - this.field717 != arg4[var24]) {
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
                class393 var25 = new class393();
                int var26 = arg6[0];
                int var27 = arg8[0];
                if (arg7 != null) {
                    var25.field5458 = arg7[0] >> 8;
                    if (var26 == 0) {
                        var25.field5449 = (byte) (var25.field5449 | 2);
                    }
                } else if (var26 == 0) {
                    return;
                }
                if (this.field721[arg0 + 1][arg1] == this.field721[arg0][arg1] && this.field721[arg0 + 1][arg1 + 1] == this.field721[arg0][arg1] && this.field721[arg0][arg1 + 1] == this.field721[arg0][arg1]) {
                    var25.field5449 = (byte) (var25.field5449 | 1);
                }
                if (var27 != -1 && (var25.field5449 & 2) == 0 && !this.field712.field4988.method1621(18318, var27).field302) {
                    var25.field5451 = this.field722[arg0][arg1] - this.field714[arg0][arg1];
                    var25.field5450 = this.field722[arg0 + 1][arg1] - this.field714[arg0 + 1][arg1];
                    var25.field5457 = this.field722[arg0 + 1][arg1 + 1] - this.field714[arg0 + 1][arg1 + 1];
                    var25.field5452 = this.field722[arg0][arg1 + 1] - this.field714[arg0][arg1 + 1];
                    var25.field5456 = (short) var27;
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
                    var25.field5451 = class431.method2550(var28, -31673, arg10, method364(arg6[var18] >> 8, this.field722[arg0][arg1] - this.field714[arg0][arg1]));
                    if (var25.field5458 != 0) {
                        var25.field5451 |= 255 - (this.field722[arg0][arg1] - this.field714[arg0][arg1]) << 25;
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
                    var25.field5450 = class431.method2550(var29, -31673, arg10, method364(arg6[var19] >> 8, this.field722[arg0 + 1][arg1] - this.field714[arg0 + 1][arg1]));
                    if (var25.field5458 != 0) {
                        var25.field5450 |= 255 - (this.field722[arg0 + 1][arg1] - this.field714[arg0 + 1][arg1]) << 25;
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
                    var25.field5457 = class431.method2550(var30, -31673, arg10, method364(arg6[var20] >> 8, this.field722[arg0 + 1][arg1 + 1] - this.field714[arg0 + 1][arg1 + 1]));
                    if (var25.field5458 != 0) {
                        var25.field5457 |= 255 - (this.field722[arg0 + 1][arg1 + 1] - this.field714[arg0 + 1][arg1 + 1]) << 25;
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
                    var25.field5452 = class431.method2550(var31, -31673, arg10, method364(arg6[var21] >> 8, this.field722[arg0][arg1 + 1] - this.field714[arg0][arg1 + 1]));
                    if (var25.field5458 != 0) {
                        var25.field5452 |= 255 - (this.field722[arg0][arg1 + 1] - this.field714[arg0][arg1 + 1]) << 25;
                    }
                    var25.field5456 = -1;
                }
                if (arg5 != null) {
                    var25.field5453 = (short) arg5[var20];
                    var25.field5459 = (short) arg5[var21];
                    var25.field5454 = (short) arg5[var19];
                    var25.field5455 = (short) arg5[var18];
                }
                this.field706[arg0][arg1] = var25;
            } else {
                class184 var32 = new class184();
                var32.field2525 = (short) arg2.length;
                var32.field2530 = (short) (arg2.length / 3);
                var32.field2527 = new short[var32.field2525];
                var32.field2528 = new short[var32.field2525];
                var32.field2524 = new short[var32.field2525];
                var32.field2522 = new int[var32.field2525];
                if (arg5 != null) {
                    var32.field2526 = new short[var32.field2525];
                }
                for (int var33 = 0; var33 < var32.field2525; ++var33) {
                    int var48 = arg2[var33];
                    int var49 = arg4[var33];
                    boolean var50 = false;
                    int var51;
                    if (var48 == 0 && var49 == 0) {
                        var51 = this.field722[arg0][arg1] - this.field714[arg0][arg1];
                    } else if (var48 == 0 && this.field717 == var49) {
                        var51 = this.field722[arg0][arg1 + 1] - this.field714[arg0][arg1 + 1];
                    } else if (this.field717 == var48 && this.field717 == var49) {
                        var51 = this.field722[arg0 + 1][arg1 + 1] - this.field714[arg0 + 1][arg1 + 1];
                    } else if (this.field717 == var48 && var49 == 0) {
                        var51 = this.field722[arg0 + 1][arg1] - this.field714[arg0 + 1][arg1];
                    } else {
                        int var52 = (this.field722[arg0 + 1][arg1] - this.field714[arg0 + 1][arg1]) * var48 + (this.field722[arg0][arg1] - this.field714[arg0][arg1]) * (this.field717 - var48);
                        int var53 = (this.field722[arg0 + 1][arg1 + 1] - this.field714[arg0 + 1][arg1 + 1]) * var48 + (this.field722[arg0][arg1 + 1] - this.field714[arg0][arg1 + 1]) * (this.field717 - var48);
                        var51 = (this.field717 - var49) * var52 + var49 * var53 >> this.field715 * 2;
                    }
                    short var54 = (short) ((arg0 << this.field715) + var48);
                    short var55 = (short) ((arg1 << this.field715) + var49);
                    var32.field2527[var33] = var54;
                    var32.field2524[var33] = var55;
                    var32.field2528[var33] = (short) (this.method368(var54, var55) + (arg3 != null ? arg3[var33] : 0));
                    if (var51 < 0) {
                        var51 = 0;
                    }
                    if (arg8[var33] != -1 && !this.field712.field4988.method1621(18318, arg8[var33]).field302) {
                        var32.field2522[var33] = var51;
                    } else if (arg6[var33] == 0) {
                        if (arg7 != null) {
                            var32.field2522[var33] = var51 << 25;
                        } else {
                            var32.field2522[var33] = 0;
                        }
                    } else {
                        int var56 = 0;
                        if (arg5 != null) {
                            short var57 = var32.field2526[var33] = (short) arg5[var33];
                            if (arg11 != 0) {
                                var56 = var57 * 255 / arg11;
                                if (var56 < 0) {
                                    var56 = 0;
                                } else if (var56 > 255) {
                                    var56 = 255;
                                }
                            }
                        }
                        var32.field2522[var33] = class431.method2550(var56, -31673, arg10, method364(arg6[var33] >> 8, var51));
                        if (arg7 != null) {
                            var32.field2522[var33] |= var51 << 25;
                        }
                    }
                }
                boolean var34 = false;
                for (int var35 = 0; var35 < var32.field2530; ++var35) {
                    if (arg8[var35 * 3] != -1 && !this.field712.field4988.method1621(18318, arg8[var35 * 3]).field302) {
                        var34 = true;
                    }
                }
                if (arg7 != null) {
                    var32.field2529 = new int[var32.field2530];
                }
                if (var34) {
                    var32.field2523 = new short[var32.field2530];
                    var32.field2531 = new short[var32.field2530];
                }
                for (int var36 = 0; var36 < var32.field2530; ++var36) {
                    int var37 = var36 * 3;
                    if (arg7 != null && arg7[var37] != 0) {
                        var32.field2529[var36] = arg7[var37] >> 8;
                    }
                    if (var34) {
                        int var38 = var37 + 1;
                        int var39 = var38 + 1;
                        boolean var40 = false;
                        boolean var41 = true;
                        int var42 = arg8[var37];
                        if (var42 != -1 && !this.field712.field4988.method1621(18318, var42).field302) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var43 = arg8[var38];
                        if (var43 != -1 && !this.field712.field4988.method1621(18318, var43).field302) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var44 = arg8[var39];
                        if (var44 != -1 && !this.field712.field4988.method1621(18318, var44).field302) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        if (var41) {
                            var32.field2523[var36] = (short) var44;
                            var32.field2531[var36] = (short) arg9[var37];
                        } else {
                            if (var40) {
                                int var45 = arg8[var37];
                                if (var45 != -1 && !this.field712.field4988.method1621(18318, var45).field302) {
                                    var32.field2522[var37] = class461.field6250[class146.method868(this.field712.field4988.method1621(18318, var45).field295 & 65535, -2045205981) & 65535];
                                }
                                int var46 = arg8[var38];
                                if (var46 != -1 && !this.field712.field4988.method1621(18318, var46).field302) {
                                    var32.field2522[var38] = class461.field6250[class146.method868(this.field712.field4988.method1621(18318, var46).field295 & 65535, -2045205981) & 65535];
                                }
                                int var47 = arg8[var39];
                                if (var47 != -1 && !this.field712.field4988.method1621(18318, var47).field302) {
                                    var32.field2522[var39] = class461.field6250[class146.method868(this.field712.field4988.method1621(18318, var47).field295 & 65535, -2045205981) & 65535];
                                }
                            }
                            var32.field2523[var36] = -1;
                        }
                    }
                }
                this.field723[arg0][arg1] = var32;
            }
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method382(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field704 == null) {
            this.field704 = new class470[super.field2410][super.field2409];
            this.field709 = new class185[super.field2410][super.field2409];
        } else if (this.field706 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && this.field717 != var20 || var21 != 0 && this.field717 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class185 var22 = new class185();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field2543 = var23;
            var22.field2541 = new short[var23];
            var22.field2536 = new int[var23];
            var22.field2534 = new int[var23];
            var22.field2542 = new int[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var30 = arg2[var25];
                int var31 = arg4[var25];
                if (var30 == 0 && var31 == 0) {
                    var22.field2541[var25] = (short) (this.field722[arg0][arg1] - this.field714[arg0][arg1]);
                } else if (var30 == 0 && this.field717 == var31) {
                    var22.field2541[var25] = (short) (this.field722[arg0][arg1 + 1] - this.field714[arg0][arg1 + 1]);
                } else if (this.field717 == var30 && this.field717 == var31) {
                    var22.field2541[var25] = (short) (this.field722[arg0 + 1][arg1 + 1] - this.field714[arg0 + 1][arg1 + 1]);
                } else if (this.field717 == var30 && var31 == 0) {
                    var22.field2541[var25] = (short) (this.field722[arg0 + 1][arg1] - this.field714[arg0 + 1][arg1]);
                } else {
                    int var32 = (this.field722[arg0 + 1][arg1] - this.field714[arg0 + 1][arg1]) * var30 + (this.field722[arg0][arg1] - this.field714[arg0][arg1]) * (this.field717 - var30);
                    int var33 = (this.field722[arg0 + 1][arg1 + 1] - this.field714[arg0 + 1][arg1 + 1]) * var30 + (this.field722[arg0][arg1 + 1] - this.field714[arg0][arg1 + 1]) * (this.field717 - var30);
                    var22.field2541[var25] = (short) ((this.field717 - var31) * var32 + var31 * var33 >> this.field715 * 2);
                }
                int var34 = (arg0 << this.field715) + var30;
                int var35 = (arg1 << this.field715) + var31;
                var22.field2536[var25] = var34;
                var22.field2542[var25] = var35;
                var22.field2534[var25] = this.method368(var34, var35) + (arg3 != null ? arg3[var25] : 0);
                if (var22.field2541[var25] < 2) {
                    var22.field2541[var25] = 2;
                }
            }
            boolean var26 = false;
            int var27 = 0;
            for (int var28 = 0; var28 < var24; ++var28) {
                if (arg9[var28] >= 0 || arg10 != null && arg10[var28] >= 0) {
                    ++var27;
                }
                if (arg11[var28] != -1 && !this.field712.field4988.method1621(18318, arg11[var28]).field302) {
                    var26 = true;
                }
            }
            var22.field2539 = new int[var27];
            if (arg10 != null) {
                var22.field2540 = new int[var27];
            }
            var22.field2537 = new short[var27];
            var22.field2538 = new short[var27];
            var22.field2533 = new short[var27];
            if (var26) {
                var22.field2535 = new short[var27];
                var22.field2544 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field2539[var22.field2532] = class146.method868(arg9[var29], -2045205981);
                    } else {
                        var22.field2539[var22.field2532] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field2540[var22.field2532] = class146.method868(arg10[var29], -2045205981);
                        } else {
                            var22.field2540[var22.field2532] = -1;
                        }
                    }
                    var22.field2537[var22.field2532] = (short) arg6[var29];
                    var22.field2538[var22.field2532] = (short) arg7[var29];
                    var22.field2533[var22.field2532] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field712.field4988.method1621(18318, arg11[var29]).field302) {
                            var22.field2535[var22.field2532] = (short) arg11[var29];
                            var22.field2544[var22.field2532] = (short) arg12[var29];
                        } else {
                            var22.field2535[var22.field2532] = -1;
                        }
                    }
                    ++var22.field2532;
                }
            }
            this.field709[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class470 var36 = new class470();
                int var37 = arg9[0];
                int var38 = arg11[0];
                if (arg10 != null) {
                    var36.field6490 = class235.method1311(class146.method868(arg10[0], -2045205981), this.field722[arg0][arg1] - this.field714[arg0][arg1], (byte) -76);
                    if (var37 == -1) {
                        var36.field6484 = (byte) (var36.field6484 | 2);
                    }
                }
                if (this.field721[arg0 + 1][arg1] == this.field721[arg0][arg1] && this.field721[arg0 + 1][arg1 + 1] == this.field721[arg0][arg1] && this.field721[arg0][arg1 + 1] == this.field721[arg0][arg1]) {
                    var36.field6484 = (byte) (var36.field6484 | 1);
                }
                if (var38 != -1 && (var36.field6484 & 2) == 0 && !this.field712.field4988.method1621(18318, var38).field302) {
                    var36.field6487 = (short) (this.field722[arg0][arg1] - this.field714[arg0][arg1]);
                    var36.field6488 = (short) (this.field722[arg0 + 1][arg1] - this.field714[arg0 + 1][arg1]);
                    var36.field6489 = (short) (this.field722[arg0 + 1][arg1 + 1] - this.field714[arg0 + 1][arg1 + 1]);
                    var36.field6486 = (short) (this.field722[arg0][arg1 + 1] - this.field714[arg0][arg1 + 1]);
                    var36.field6485 = (short) var38;
                } else {
                    short var39 = class146.method868(var37, -2045205981);
                    var36.field6487 = (short) class235.method1311(var39, this.field722[arg0][arg1] - this.field714[arg0][arg1], (byte) -86);
                    var36.field6488 = (short) class235.method1311(var39, this.field722[arg0 + 1][arg1] - this.field714[arg0 + 1][arg1], (byte) -55);
                    var36.field6489 = (short) class235.method1311(var39, this.field722[arg0 + 1][arg1 + 1] - this.field714[arg0 + 1][arg1 + 1], (byte) -124);
                    var36.field6486 = (short) class235.method1311(var39, this.field722[arg0][arg1 + 1] - this.field714[arg0][arg1 + 1], (byte) -123);
                    var36.field6485 = -1;
                }
                this.field704[arg0][arg1] = var36;
            }
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(III[[ZZ)V")
    public final void method383(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        class240 var6 = this.field712.field4834;
        this.field718 = var6.field3202;
        this.field711 = var6.field3197;
        this.field716 = var6.field3194;
        this.field713 = var6.field3195;
        this.field710 = var6.field3204;
        this.field702 = var6.field3203;
        this.field719 = var6.field3196;
        this.field707 = var6.field3193;
        this.field701 = var6.field3201;
        this.field720 = var6.field3199;
        this.field703 = var6.field3200;
        this.field708 = var6.field3198;
    }
}
