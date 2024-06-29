import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class395 extends class35 {

    @OriginalMember(owner = "client!wm", name = "C", descriptor = "I")
    private int field5505 = -1;

    @OriginalMember(owner = "client!wm", name = "G", descriptor = "Lra;")
    private class70 field5509;

    @OriginalMember(owner = "client!wm", name = "n", descriptor = "I")
    private int field5491;

    @OriginalMember(owner = "client!wm", name = "o", descriptor = "[[I")
    public int[][] field5492;

    @OriginalMember(owner = "client!wm", name = "B", descriptor = "[[B")
    private byte[][] field5504;

    @OriginalMember(owner = "client!wm", name = "F", descriptor = "[[B")
    private byte[][] field5508;

    @OriginalMember(owner = "client!wm", name = "m", descriptor = "I")
    private int field5490;

    @OriginalMember(owner = "client!wm", name = "p", descriptor = "I")
    private int field5493;

    @OriginalMember(owner = "client!wm", name = "r", descriptor = "I")
    private int field5495;

    @OriginalMember(owner = "client!wm", name = "t", descriptor = "I")
    private int field5497;

    @OriginalMember(owner = "client!wm", name = "v", descriptor = "I")
    private int field5499;

    @OriginalMember(owner = "client!wm", name = "w", descriptor = "I")
    private int field5500;

    @OriginalMember(owner = "client!wm", name = "y", descriptor = "I")
    private int field5502;

    @OriginalMember(owner = "client!wm", name = "z", descriptor = "I")
    private int field5503;

    @OriginalMember(owner = "client!wm", name = "D", descriptor = "I")
    private int field5506;

    @OriginalMember(owner = "client!wm", name = "E", descriptor = "I")
    private int field5507;

    @OriginalMember(owner = "client!wm", name = "H", descriptor = "I")
    private int field5510;

    @OriginalMember(owner = "client!wm", name = "I", descriptor = "I")
    private int field5511;

    @OriginalMember(owner = "client!wm", name = "x", descriptor = "[[Luj;")
    private class259[][] field5501;

    @OriginalMember(owner = "client!wm", name = "u", descriptor = "[[Lud;")
    private class27[][] field5498;

    @OriginalMember(owner = "client!wm", name = "q", descriptor = "[[Ldn;")
    private class357[][] field5494;

    @OriginalMember(owner = "client!wm", name = "s", descriptor = "[[Lde;")
    private class369[][] field5496;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lj;IIIIZ)Z", line = 4)
    public final boolean method230(class378 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(II)I", line = 9)
    private static final int method2260(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IILcc;[I[I[I)V", line = 39)
    private final void method2261(int arg0, int arg1, class513 arg2, int[] arg3, int[] arg4, int[] arg5) {
        class369 var7 = this.field5496[arg0][arg1];
        if (var7 != null) {
            if ((var7.field5180 & 2) == 0) {
                int var8 = super.field494 * arg0;
                int var9 = super.field494 + var8;
                int var10 = super.field494 * arg1;
                int var11 = super.field494 + var10;
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
                if ((var7.field5180 & 1) != 0) {
                    int var12 = this.field5492[arg0][arg1];
                    int var16;
                    if (this.field5505 == -1) {
                        int var13 = this.field5495 * var12;
                        var14 = (this.field5507 * var10 + this.field5511 * var8 + var13 >> 15) + this.field5502;
                        if (var14 <= this.field5509.field1033) {
                            return;
                        }
                        var15 = (this.field5507 * var10 + this.field5511 * var9 + var13 >> 15) + this.field5502;
                        if (var15 <= this.field5509.field1033) {
                            return;
                        }
                        var16 = (this.field5507 * var11 + this.field5511 * var9 + var13 >> 15) + this.field5502;
                        if (var16 <= this.field5509.field1033) {
                            return;
                        }
                        var17 = (this.field5507 * var11 + this.field5511 * var8 + var13 >> 15) + this.field5502;
                        if (var17 <= this.field5509.field1033) {
                            return;
                        }
                    } else {
                        var17 = this.field5505;
                        var16 = this.field5505;
                        var15 = this.field5505;
                        var14 = this.field5505;
                    }
                    int var18 = this.field5493 * var12;
                    int var19 = this.field5506 * var12;
                    var20 = (this.field5500 * var10 + this.field5490 * var8 + var18 >> 15) + this.field5499;
                    var21 = this.field5509.field1035 * var20 / var14 + arg2.field7536;
                    var22 = (this.field5510 * var10 + this.field5503 * var8 + var19 >> 15) + this.field5497;
                    var23 = this.field5509.field1049 * var22 / var14 + arg2.field7538;
                    var24 = (this.field5500 * var10 + this.field5490 * var9 + var18 >> 15) + this.field5499;
                    var25 = this.field5509.field1035 * var24 / var15 + arg2.field7536;
                    var26 = (this.field5510 * var10 + this.field5503 * var9 + var19 >> 15) + this.field5497;
                    var27 = this.field5509.field1049 * var26 / var15 + arg2.field7538;
                    int var28 = (this.field5500 * var11 + this.field5490 * var9 + var18 >> 15) + this.field5499;
                    var29 = this.field5509.field1035 * var28 / var16 + arg2.field7536;
                    int var30 = (this.field5510 * var11 + this.field5503 * var9 + var19 >> 15) + this.field5497;
                    var31 = this.field5509.field1049 * var30 / var16 + arg2.field7538;
                    var32 = (this.field5500 * var11 + this.field5490 * var8 + var18 >> 15) + this.field5499;
                    var33 = this.field5509.field1035 * var32 / var17 + arg2.field7536;
                    var34 = (this.field5510 * var11 + this.field5503 * var8 + var19 >> 15) + this.field5497;
                    var35 = this.field5509.field1049 * var34 / var17 + arg2.field7538;
                } else {
                    int var36 = this.field5492[arg0][arg1];
                    int var37 = this.field5492[arg0 + 1][arg1];
                    int var38 = this.field5492[arg0 + 1][arg1 + 1];
                    int var39 = this.field5492[arg0][arg1 + 1];
                    int var40;
                    if (this.field5505 == -1) {
                        var14 = (this.field5507 * var10 + this.field5511 * var8 + this.field5495 * var36 >> 15) + this.field5502;
                        if (var14 <= this.field5509.field1033) {
                            return;
                        }
                        var15 = (this.field5507 * var10 + this.field5511 * var9 + this.field5495 * var37 >> 15) + this.field5502;
                        if (var15 <= this.field5509.field1033) {
                            return;
                        }
                        var40 = (this.field5507 * var11 + this.field5511 * var9 + this.field5495 * var38 >> 15) + this.field5502;
                        if (var40 <= this.field5509.field1033) {
                            return;
                        }
                        var17 = (this.field5507 * var11 + this.field5511 * var8 + this.field5495 * var39 >> 15) + this.field5502;
                        if (var17 <= this.field5509.field1033) {
                            return;
                        }
                    } else {
                        var17 = this.field5505;
                        var40 = this.field5505;
                        var15 = this.field5505;
                        var14 = this.field5505;
                    }
                    var20 = (this.field5500 * var10 + this.field5493 * var36 + this.field5490 * var8 >> 15) + this.field5499;
                    var21 = this.field5509.field1035 * var20 / var14 + arg2.field7536;
                    var22 = (this.field5510 * var10 + this.field5506 * var36 + this.field5503 * var8 >> 15) + this.field5497;
                    var23 = this.field5509.field1049 * var22 / var14 + arg2.field7538;
                    var24 = (this.field5500 * var10 + this.field5493 * var37 + this.field5490 * var9 >> 15) + this.field5499;
                    var25 = this.field5509.field1035 * var24 / var15 + arg2.field7536;
                    var26 = (this.field5510 * var10 + this.field5506 * var37 + this.field5503 * var9 >> 15) + this.field5497;
                    var27 = this.field5509.field1049 * var26 / var15 + arg2.field7538;
                    int var41 = (this.field5500 * var11 + this.field5493 * var38 + this.field5490 * var9 >> 15) + this.field5499;
                    var29 = this.field5509.field1035 * var41 / var40 + arg2.field7536;
                    int var42 = (this.field5510 * var11 + this.field5506 * var38 + this.field5503 * var9 >> 15) + this.field5497;
                    var31 = this.field5509.field1049 * var42 / var40 + arg2.field7538;
                    var32 = (this.field5500 * var11 + this.field5493 * var39 + this.field5490 * var8 >> 15) + this.field5499;
                    var33 = this.field5509.field1035 * var32 / var17 + arg2.field7536;
                    var34 = (this.field5510 * var11 + this.field5506 * var39 + this.field5503 * var8 >> 15) + this.field5497;
                    var35 = this.field5509.field1049 * var34 / var17 + arg2.field7538;
                }
                if ((var27 - var35) * (var29 - var33) - (var25 - var33) * (var31 - var35) > 0) {
                    arg2.field7544 = var29 < 0 || var33 < 0 || var25 < 0 || var29 > arg2.field7537 || var33 > arg2.field7537 || var25 > arg2.field7537;
                    if (var7.field5176 >= 0) {
                        if (this.method2263(this.field5509.field2312.method830(var7.field5176, (byte) 71).field7366)) {
                            arg2.field7542 = 100;
                        }
                        arg2.method3010(var31, var35, var27, var29, var33, var25, var7.field5175 & 65535, var7.field5178 & 65535, var7.field5174 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field5176);
                        arg2.field7542 = 0;
                    } else {
                        arg2.method3008(var31, var35, var27, var29, var33, var25, var7.field5175 & 65535, var7.field5178 & 65535, var7.field5174 & 65535);
                    }
                }
                if ((var21 - var25) * (var35 - var27) - (var23 - var27) * (var33 - var25) > 0) {
                    arg2.field7544 = var21 < 0 || var25 < 0 || var33 < 0 || var21 > arg2.field7537 || var25 > arg2.field7537 || var33 > arg2.field7537;
                    if (var7.field5176 >= 0) {
                        if (this.method2263(this.field5509.field2312.method830(var7.field5176, (byte) 71).field7366)) {
                            arg2.field7542 = 100;
                        }
                        arg2.method3010(var23, var27, var35, var21, var25, var33, var7.field5179 & 65535, var7.field5174 & 65535, var7.field5178 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field5176);
                        arg2.field7542 = 0;
                        return;
                    }
                    arg2.method3008(var23, var27, var35, var21, var25, var33, var7.field5179 & 65535, var7.field5174 & 65535, var7.field5178 & 65535);
                }
            }
        } else {
            class357 var43 = this.field5494[arg0][arg1];
            if (var43 != null) {
                if (this.field5505 == -1) {
                    for (int var44 = 0; var44 < var43.field4878; ++var44) {
                        int var45 = (arg0 << super.field492) + var43.field4883[var44];
                        short var46 = var43.field4882[var44];
                        int var47 = (arg1 << super.field492) + var43.field4885[var44];
                        int var48 = (this.field5507 * var47 + this.field5511 * var45 + this.field5495 * var46 >> 15) + this.field5502;
                        if (var48 <= this.field5509.field1033) {
                            return;
                        }
                        int var49 = (this.field5500 * var47 + this.field5493 * var46 + this.field5490 * var45 >> 15) + this.field5499;
                        int var50 = (this.field5510 * var47 + this.field5506 * var46 + this.field5503 * var45 >> 15) + this.field5497;
                        arg3[var44] = this.field5509.field1035 * var49 / var48 + arg2.field7536;
                        arg4[var44] = this.field5509.field1049 * var50 / var48 + arg2.field7538;
                    }
                } else {
                    for (int var51 = 0; var51 < var43.field4878; ++var51) {
                        int var91 = (arg0 << super.field492) + var43.field4883[var51];
                        short var92 = var43.field4882[var51];
                        int var93 = (arg1 << super.field492) + var43.field4885[var51];
                        int var94 = (this.field5500 * var93 + this.field5493 * var92 + this.field5490 * var91 >> 15) + this.field5499;
                        int var95 = (this.field5510 * var93 + this.field5506 * var92 + this.field5503 * var91 >> 15) + this.field5497;
                        arg3[var51] = this.field5509.field1035 * var94 / this.field5505 + arg2.field7536;
                        arg4[var51] = this.field5509.field1049 * var95 / this.field5505 + arg2.field7538;
                    }
                }
                if (var43.field4881 != null) {
                    int var52 = this.field5492[arg0][arg1];
                    int var53 = this.field5492[arg0 + 1][arg1];
                    int var54 = this.field5492[arg0][arg1 + 1];
                    int var55 = super.field494 * arg0;
                    int var56 = super.field494 + var55;
                    int var57 = super.field494 * arg1;
                    int var58 = super.field494 + var57;
                    int var59 = (this.field5500 * var57 + this.field5493 * var52 + this.field5490 * var55 >> 15) + this.field5499;
                    int var60 = (this.field5510 * var57 + this.field5506 * var52 + this.field5503 * var55 >> 15) + this.field5497;
                    int var61 = (this.field5507 * var57 + this.field5511 * var55 + this.field5495 * var52 >> 15) + this.field5502;
                    int var62 = (this.field5500 * var57 + this.field5493 * var53 + this.field5490 * var56 >> 15) + this.field5499;
                    int var63 = (this.field5510 * var57 + this.field5506 * var53 + this.field5503 * var56 >> 15) + this.field5497;
                    int var64 = (this.field5507 * var57 + this.field5511 * var56 + this.field5495 * var53 >> 15) + this.field5502;
                    int var65 = (this.field5500 * var58 + this.field5493 * var54 + this.field5490 * var55 >> 15) + this.field5499;
                    int var66 = (this.field5510 * var58 + this.field5506 * var54 + this.field5503 * var55 >> 15) + this.field5497;
                    int var67 = (this.field5507 * var58 + this.field5511 * var55 + this.field5495 * var54 >> 15) + this.field5502;
                    for (int var68 = 0; var68 < var43.field4880; ++var68) {
                        short var69 = var43.field4877[var68];
                        short var70 = var43.field4887[var68];
                        short var71 = var43.field4876[var68];
                        int var72 = arg3[var69];
                        int var73 = arg3[var70];
                        int var74 = arg3[var71];
                        int var75 = arg4[var69];
                        int var76 = arg4[var70];
                        int var77 = arg4[var71];
                        if ((var72 - var73) * (var77 - var76) - (var74 - var73) * (var75 - var76) > 0) {
                            arg2.field7544 = var72 < 0 || var73 < 0 || var74 < 0 || var72 > arg2.field7537 || var73 > arg2.field7537 || var74 > arg2.field7537;
                            short var78 = var43.field4881[var68];
                            if (var78 != -1) {
                                if (this.method2263(this.field5509.field2312.method830(var78, (byte) 71).field7366)) {
                                    arg2.field7542 = 100;
                                }
                                arg2.method3010(var75, var76, var77, var72, var73, var74, var43.field4875[var69], var43.field4875[var70], var43.field4875[var71], var59, var62, var65, var60, var63, var66, var61, var64, var67, var78);
                                arg2.field7542 = 0;
                            } else {
                                int var79 = var43.field4886[var68];
                                if (var79 != -1) {
                                    arg2.method3008(var75, var76, var77, var72, var73, var74, class522.method3074(0, var43.field4875[var69], var79), class522.method3074(0, var43.field4875[var70], var79), class522.method3074(0, var43.field4875[var71], var79));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var80 = 0; var80 < var43.field4880; ++var80) {
                    short var81 = var43.field4877[var80];
                    short var82 = var43.field4887[var80];
                    short var83 = var43.field4876[var80];
                    int var84 = arg3[var81];
                    int var85 = arg3[var82];
                    int var86 = arg3[var83];
                    int var87 = arg4[var81];
                    int var88 = arg4[var82];
                    int var89 = arg4[var83];
                    if ((var84 - var85) * (var89 - var88) - (var86 - var85) * (var87 - var88) > 0) {
                        int var90 = var43.field4886[var80];
                        if (var90 != -1) {
                            arg2.field7544 = var84 < 0 || var85 < 0 || var86 < 0 || var84 > arg2.field7537 || var85 > arg2.field7537 || var86 > arg2.field7537;
                            arg2.method3008(var87, var88, var89, var84, var85, var86, class522.method3074(0, var43.field4875[var81], var90), class522.method3074(0, var43.field4875[var82], var90), class522.method3074(0, var43.field4875[var83], var90));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lpe;[I)V", line = 394)
    public final void method233(class432 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIZLcc;[I[I[I)V", line = 398)
    private final void method2262(int arg0, int arg1, boolean arg2, class513 arg3, int[] arg4, int[] arg5, int[] arg6) {
        class27 var8 = this.field5498[arg0][arg1];
        if (var8 != null) {
            if ((var8.field409 & 2) == 0) {
                int var9 = super.field494 * arg0;
                int var10 = super.field494 + var9;
                int var11 = super.field494 * arg1;
                int var12 = super.field494 + var11;
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
                if ((var8.field409 & 1) != 0 && !arg2) {
                    int var17 = this.field5492[arg0][arg1];
                    if (this.field5505 == -1) {
                        int var18 = this.field5495 * var17;
                        var19 = (this.field5507 * var11 + this.field5511 * var9 + var18 >> 15) + this.field5502;
                        if (var19 <= this.field5509.field1033) {
                            return;
                        }
                        var20 = (this.field5507 * var11 + this.field5511 * var10 + var18 >> 15) + this.field5502;
                        if (var20 <= this.field5509.field1033) {
                            return;
                        }
                        var21 = (this.field5507 * var12 + this.field5511 * var10 + var18 >> 15) + this.field5502;
                        if (var21 <= this.field5509.field1033) {
                            return;
                        }
                        var22 = (this.field5507 * var12 + this.field5511 * var9 + var18 >> 15) + this.field5502;
                        if (var22 <= this.field5509.field1033) {
                            return;
                        }
                    } else {
                        var22 = this.field5505;
                        var21 = this.field5505;
                        var20 = this.field5505;
                        var19 = this.field5505;
                    }
                    if (this.field5509.field1028) {
                        int var23 = var19 - this.field5509.field1018;
                        if (var23 > 0) {
                            var13 = var23;
                            if (var23 > 255) {
                                var13 = 255;
                            }
                        }
                        int var24 = var20 - this.field5509.field1018;
                        if (var24 > 0) {
                            var14 = var24;
                            if (var24 > 255) {
                                var14 = 255;
                            }
                        }
                        int var25 = var21 - this.field5509.field1018;
                        if (var25 > 0) {
                            var15 = var25;
                            if (var25 > 255) {
                                var15 = 255;
                            }
                        }
                        int var26 = var22 - this.field5509.field1018;
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    int var27 = this.field5493 * var17;
                    int var28 = this.field5506 * var17;
                    var29 = (this.field5500 * var11 + this.field5490 * var9 + var27 >> 15) + this.field5499;
                    var30 = this.field5509.field1035 * var29 / var19 + arg3.field7536;
                    var31 = (this.field5510 * var11 + this.field5503 * var9 + var28 >> 15) + this.field5497;
                    var32 = this.field5509.field1049 * var31 / var19 + arg3.field7538;
                    var33 = (this.field5500 * var11 + this.field5490 * var10 + var27 >> 15) + this.field5499;
                    var34 = this.field5509.field1035 * var33 / var20 + arg3.field7536;
                    var35 = (this.field5510 * var11 + this.field5503 * var10 + var28 >> 15) + this.field5497;
                    var36 = this.field5509.field1049 * var35 / var20 + arg3.field7538;
                    var37 = (this.field5500 * var12 + this.field5490 * var10 + var27 >> 15) + this.field5499;
                    var38 = this.field5509.field1035 * var37 / var21 + arg3.field7536;
                    var39 = (this.field5510 * var12 + this.field5503 * var10 + var28 >> 15) + this.field5497;
                    var40 = this.field5509.field1049 * var39 / var21 + arg3.field7538;
                    var41 = (this.field5500 * var12 + this.field5490 * var9 + var27 >> 15) + this.field5499;
                    var42 = this.field5509.field1035 * var41 / var22 + arg3.field7536;
                    var43 = (this.field5510 * var12 + this.field5503 * var9 + var28 >> 15) + this.field5497;
                    var44 = this.field5509.field1049 * var43 / var22 + arg3.field7538;
                } else {
                    int var45 = this.field5492[arg0][arg1];
                    int var46 = this.field5492[arg0 + 1][arg1];
                    int var47 = this.field5492[arg0 + 1][arg1 + 1];
                    int var48 = this.field5492[arg0][arg1 + 1];
                    if (this.field5505 == -1) {
                        var19 = (this.field5507 * var11 + this.field5511 * var9 + this.field5495 * var45 >> 15) + this.field5502;
                        if (var19 <= this.field5509.field1033) {
                            return;
                        }
                        var20 = (this.field5507 * var11 + this.field5511 * var10 + this.field5495 * var46 >> 15) + this.field5502;
                        if (var20 <= this.field5509.field1033) {
                            return;
                        }
                        var21 = (this.field5507 * var12 + this.field5511 * var10 + this.field5495 * var47 >> 15) + this.field5502;
                        if (var21 <= this.field5509.field1033) {
                            return;
                        }
                        var22 = (this.field5507 * var12 + this.field5511 * var9 + this.field5495 * var48 >> 15) + this.field5502;
                        if (var22 <= this.field5509.field1033) {
                            return;
                        }
                    } else {
                        var22 = this.field5505;
                        var21 = this.field5505;
                        var20 = this.field5505;
                        var19 = this.field5505;
                    }
                    if (arg2) {
                        int var49 = var19 - this.field5509.field1018;
                        if (var49 > 255) {
                            var49 = 255;
                        }
                        if (var49 > 0) {
                            var13 = var49;
                            int var50 = var8.field417 * var49 / 255;
                            if (var50 > 0) {
                                var45 -= var50;
                            }
                        }
                        int var51 = var20 - this.field5509.field1018;
                        if (var51 > 255) {
                            var51 = 255;
                        }
                        if (var51 > 0) {
                            var14 = var51;
                            int var52 = var8.field408 * var51 / 255;
                            if (var52 > 0) {
                                var46 -= var52;
                            }
                        }
                        int var53 = var21 - this.field5509.field1018;
                        if (var53 > 255) {
                            var53 = 255;
                        }
                        if (var53 > 0) {
                            var15 = var53;
                            int var54 = var8.field411 * var53 / 255;
                            if (var54 > 0) {
                                var47 -= var54;
                            }
                        }
                        int var55 = var22 - this.field5509.field1018;
                        if (var55 > 255) {
                            var55 = 255;
                        }
                        if (var55 > 0) {
                            var16 = var55;
                            int var56 = var8.field413 * var55 / 255;
                            if (var56 > 0) {
                                var48 -= var56;
                            }
                        }
                    } else if (this.field5509.field1028) {
                        int var57 = var19 - this.field5509.field1018;
                        if (var57 > 0) {
                            var13 = var57;
                            if (var57 > 255) {
                                var13 = 255;
                            }
                        }
                        int var58 = var20 - this.field5509.field1018;
                        if (var58 > 0) {
                            var14 = var58;
                            if (var58 > 255) {
                                var14 = 255;
                            }
                        }
                        int var59 = var21 - this.field5509.field1018;
                        if (var59 > 0) {
                            var15 = var59;
                            if (var59 > 255) {
                                var15 = 255;
                            }
                        }
                        int var60 = var22 - this.field5509.field1018;
                        if (var60 > 0) {
                            var16 = var60;
                            if (var60 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    var29 = (this.field5500 * var11 + this.field5493 * var45 + this.field5490 * var9 >> 15) + this.field5499;
                    var30 = this.field5509.field1035 * var29 / var19 + arg3.field7536;
                    var31 = (this.field5510 * var11 + this.field5506 * var45 + this.field5503 * var9 >> 15) + this.field5497;
                    var32 = this.field5509.field1049 * var31 / var19 + arg3.field7538;
                    var33 = (this.field5500 * var11 + this.field5493 * var46 + this.field5490 * var10 >> 15) + this.field5499;
                    var34 = this.field5509.field1035 * var33 / var20 + arg3.field7536;
                    var35 = (this.field5510 * var11 + this.field5506 * var46 + this.field5503 * var10 >> 15) + this.field5497;
                    var36 = this.field5509.field1049 * var35 / var20 + arg3.field7538;
                    var37 = (this.field5500 * var12 + this.field5493 * var47 + this.field5490 * var10 >> 15) + this.field5499;
                    var38 = this.field5509.field1035 * var37 / var21 + arg3.field7536;
                    var39 = (this.field5510 * var12 + this.field5506 * var47 + this.field5503 * var10 >> 15) + this.field5497;
                    var40 = this.field5509.field1049 * var39 / var21 + arg3.field7538;
                    var41 = (this.field5500 * var12 + this.field5493 * var48 + this.field5490 * var9 >> 15) + this.field5499;
                    var42 = this.field5509.field1035 * var41 / var22 + arg3.field7536;
                    var43 = (this.field5510 * var12 + this.field5506 * var48 + this.field5503 * var9 >> 15) + this.field5497;
                    var44 = this.field5509.field1049 * var43 / var22 + arg3.field7538;
                }
                boolean var61 = var8.field416 != -1 && this.method2263(this.field5509.field2312.method830(var8.field416, (byte) 71).field7366);
                int var62 = var14 + var15 + var16;
                if ((var36 - var44) * (var38 - var42) - (var34 - var42) * (var40 - var44) > 0) {
                    arg3.field7544 = var38 < 0 || var42 < 0 || var34 < 0 || var38 > arg3.field7537 || var42 > arg3.field7537 || var34 > arg3.field7537;
                    if (var62 < 765) {
                        if (var61) {
                            arg3.field7542 = 100;
                        }
                        if (var62 > 0) {
                            if (var8.field416 >= 0) {
                                arg3.method3011(var40, var44, var36, var38, var42, var34, this.field5509.field1019, var15, var16, var14, var8.field407, var8.field415, var8.field410, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field416);
                            } else {
                                arg3.method3016(var40, var44, var36, var38, var42, var34, class110.method713(var15 << 24 | this.field5509.field1019, var8.field407, 127), class110.method713(var16 << 24 | this.field5509.field1019, var8.field415, 109), class110.method713(var14 << 24 | this.field5509.field1019, var8.field410, 102));
                            }
                        } else if (var8.field416 >= 0) {
                            arg3.method3010(var40, var44, var36, var38, var42, var34, var8.field407, var8.field415, var8.field410, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field416);
                        } else {
                            arg3.method3016(var40, var44, var36, var38, var42, var34, var8.field407, var8.field415, var8.field410);
                        }
                        arg3.field7542 = 0;
                    } else {
                        arg3.method3014(var40, var44, var36, var38, var42, var34, this.field5509.field1019);
                    }
                }
                int var63 = var13 + var14 + var16;
                if ((var30 - var34) * (var44 - var36) - (var32 - var36) * (var42 - var34) > 0) {
                    arg3.field7544 = var30 < 0 || var34 < 0 || var42 < 0 || var30 > arg3.field7537 || var34 > arg3.field7537 || var42 > arg3.field7537;
                    if (var63 < 765) {
                        if (var61) {
                            arg3.field7542 = 100;
                        }
                        if (var63 > 0) {
                            if (var8.field416 >= 0) {
                                arg3.method3011(var32, var36, var44, var30, var34, var42, this.field5509.field1019, var13, var14, var16, var8.field414, var8.field410, var8.field415, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field416);
                            } else {
                                arg3.method3016(var32, var36, var44, var30, var34, var42, class110.method713(var13 << 24 | this.field5509.field1019, var8.field414, 98), class110.method713(var14 << 24 | this.field5509.field1019, var8.field410, 99), class110.method713(var16 << 24 | this.field5509.field1019, var8.field415, 111));
                            }
                        } else if (var8.field416 >= 0) {
                            arg3.method3010(var32, var36, var44, var30, var34, var42, var8.field414, var8.field410, var8.field415, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field416);
                        } else {
                            arg3.method3016(var32, var36, var44, var30, var34, var42, var8.field414, var8.field410, var8.field415);
                        }
                        arg3.field7542 = 0;
                        return;
                    }
                    arg3.method3014(var32, var36, var44, var30, var34, var42, this.field5509.field1019);
                }
            }
        } else {
            class259 var64 = this.field5501[arg0][arg1];
            if (var64 != null) {
                if (this.field5505 == -1) {
                    for (int var65 = 0; var65 < var64.field3571; ++var65) {
                        int var66 = (arg0 << super.field492) + var64.field3567[var65];
                        int var67 = var64.field3572[var65];
                        int var68 = (arg1 << super.field492) + var64.field3573[var65];
                        int var69 = (this.field5507 * var68 + this.field5511 * var66 + this.field5495 * var67 >> 15) + this.field5502;
                        if (var69 <= this.field5509.field1033) {
                            return;
                        }
                        arg6[var65] = 0;
                        if (arg2) {
                            int var70 = var69 - this.field5509.field1018;
                            if (var70 > 255) {
                                var70 = 255;
                            }
                            if (var70 > 0) {
                                arg6[var65] = var70;
                                int var71 = var64.field3574[var65] * var70 / 255;
                                if (var71 > 0) {
                                    var67 -= var71;
                                }
                            }
                        } else if (this.field5509.field1028) {
                            int var72 = var69 - this.field5509.field1018;
                            if (var72 > 0) {
                                arg6[var65] = var72;
                                if (arg6[var65] > 255) {
                                    arg6[var65] = 255;
                                }
                            }
                        }
                        int var73 = (this.field5500 * var68 + this.field5493 * var67 + this.field5490 * var66 >> 15) + this.field5499;
                        int var74 = (this.field5510 * var68 + this.field5506 * var67 + this.field5503 * var66 >> 15) + this.field5497;
                        arg4[var65] = this.field5509.field1035 * var73 / var69 + arg3.field7536;
                        arg5[var65] = this.field5509.field1049 * var74 / var69 + arg3.field7538;
                    }
                } else {
                    for (int var75 = 0; var75 < var64.field3571; ++var75) {
                        int var115 = (arg0 << super.field492) + var64.field3567[var75];
                        int var116 = var64.field3572[var75];
                        int var117 = (arg1 << super.field492) + var64.field3573[var75];
                        arg6[var75] = 0;
                        if (arg2) {
                            int var118 = this.field5505 - this.field5509.field1018;
                            if (var118 > 255) {
                                var118 = 255;
                            }
                            if (var118 > 0) {
                                arg6[var75] = var118;
                                int var119 = var64.field3574[var75] * var118 / 255;
                                if (var119 > 0) {
                                    var116 -= var119;
                                }
                            }
                        } else if (this.field5509.field1028) {
                            int var120 = this.field5505 - this.field5509.field1018;
                            if (var120 > 0) {
                                arg6[var75] = var120;
                                if (arg6[var75] > 255) {
                                    arg6[var75] = 255;
                                }
                            }
                        }
                        int var121 = (this.field5500 * var117 + this.field5493 * var116 + this.field5490 * var115 >> 15) + this.field5499;
                        int var122 = (this.field5510 * var117 + this.field5506 * var116 + this.field5503 * var115 >> 15) + this.field5497;
                        arg4[var75] = this.field5509.field1035 * var121 / this.field5505 + arg3.field7536;
                        arg5[var75] = this.field5509.field1049 * var122 / this.field5505 + arg3.field7538;
                    }
                }
                if (var64.field3566 != null) {
                    int var76 = this.field5492[arg0][arg1];
                    int var77 = this.field5492[arg0 + 1][arg1];
                    int var78 = this.field5492[arg0][arg1 + 1];
                    int var79 = super.field494 * arg0;
                    int var80 = super.field494 + var79;
                    int var81 = super.field494 * arg1;
                    int var82 = super.field494 + var81;
                    int var83 = (this.field5500 * var81 + this.field5493 * var76 + this.field5490 * var79 >> 15) + this.field5499;
                    int var84 = (this.field5510 * var81 + this.field5506 * var76 + this.field5503 * var79 >> 15) + this.field5497;
                    int var85 = (this.field5507 * var81 + this.field5511 * var79 + this.field5495 * var76 >> 15) + this.field5502;
                    int var86 = (this.field5500 * var81 + this.field5493 * var77 + this.field5490 * var80 >> 15) + this.field5499;
                    int var87 = (this.field5510 * var81 + this.field5506 * var77 + this.field5503 * var80 >> 15) + this.field5497;
                    int var88 = (this.field5507 * var81 + this.field5511 * var80 + this.field5495 * var77 >> 15) + this.field5502;
                    int var89 = (this.field5500 * var82 + this.field5493 * var78 + this.field5490 * var79 >> 15) + this.field5499;
                    int var90 = (this.field5510 * var82 + this.field5506 * var78 + this.field5503 * var79 >> 15) + this.field5497;
                    int var91 = (this.field5507 * var82 + this.field5511 * var79 + this.field5495 * var78 >> 15) + this.field5502;
                    for (int var92 = 0; var92 < var64.field3569; ++var92) {
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
                            arg3.field7544 = var96 < 0 || var97 < 0 || var98 < 0 || var96 > arg3.field7537 || var97 > arg3.field7537 || var98 > arg3.field7537;
                            short var103 = var64.field3566[var92];
                            if (var102 < 765) {
                                if (var103 != -1 && this.method2263(this.field5509.field2312.method830(var103, (byte) 71).field7366)) {
                                    arg3.field7542 = 100;
                                }
                                if (var102 > 0) {
                                    if (var103 != -1) {
                                        arg3.method3011(var99, var100, var101, var96, var97, var98, this.field5509.field1019, arg6[var93], arg6[var94], arg6[var95], var64.field3568[var93], var64.field3568[var94], var64.field3568[var95], var83, var86, var89, var84, var87, var90, var85, var88, var91, var103);
                                    } else if ((var64.field3568[var93] & 16777215) != 0) {
                                        arg3.method3016(var99, var100, var101, var96, var97, var98, class110.method713(arg6[var93] << 24 | this.field5509.field1019, var64.field3568[var93], 123), class110.method713(arg6[var94] << 24 | this.field5509.field1019, var64.field3568[var94], 112), class110.method713(arg6[var95] << 24 | this.field5509.field1019, var64.field3568[var95], 103));
                                    }
                                } else if (var103 != -1) {
                                    arg3.method3010(var99, var100, var101, var96, var97, var98, var64.field3568[var93], var64.field3568[var94], var64.field3568[var95], var83, var86, var89, var84, var87, var90, var85, var88, var91, var103);
                                } else if ((var64.field3568[var93] & 16777215) != 0) {
                                    arg3.method3016(var99, var100, var101, var96, var97, var98, var64.field3568[var93], var64.field3568[var94], var64.field3568[var95]);
                                }
                                arg3.field7542 = 0;
                            } else {
                                arg3.method3014(var99, var100, var101, var96, var97, var98, this.field5509.field1019);
                            }
                        }
                    }
                    return;
                }
                for (int var104 = 0; var104 < var64.field3569; ++var104) {
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
                        arg3.field7544 = var108 < 0 || var109 < 0 || var110 < 0 || var108 > arg3.field7537 || var109 > arg3.field7537 || var110 > arg3.field7537;
                        if (var114 < 765) {
                            if (var114 > 0) {
                                if ((var64.field3568[var105] & 16777215) != 0) {
                                    arg3.method3016(var111, var112, var113, var108, var109, var110, class24.method178(var64.field3568[var105], arg6[var105], this.field5509.field1019, -1866846296), class24.method178(var64.field3568[var106], arg6[var106], this.field5509.field1019, -1866846296), class24.method178(var64.field3568[var107], arg6[var107], this.field5509.field1019, -1866846296));
                                }
                            } else if ((var64.field3568[var105] & 16777215) != 0) {
                                arg3.method3016(var111, var112, var113, var108, var109, var110, var64.field3568[var105], var64.field3568[var106], var64.field3568[var107]);
                            }
                        } else {
                            arg3.method3014(var111, var112, var113, var108, var109, var110, this.field5509.field1019);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wm", name = "QA", descriptor = "(III)V", line = 1037)
    public final void method231(int arg0, int arg1, int arg2) {
        if (this.field5508[arg0][arg1] < arg2) {
            this.field5508[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(III[[ZZ)V", line = 1043)
    public final void method229(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        class98 var6 = this.field5509.field1022;
        this.field5505 = -1;
        this.field5490 = var6.field1358;
        this.field5493 = var6.field1360;
        this.field5500 = var6.field1362;
        this.field5499 = var6.field1351;
        this.field5503 = var6.field1361;
        this.field5506 = var6.field1357;
        this.field5510 = var6.field1352;
        this.field5497 = var6.field1353;
        this.field5511 = var6.field1356;
        this.field5495 = var6.field1355;
        this.field5507 = var6.field1354;
        this.field5502 = var6.field1359;
    }

    @OriginalMember(owner = "client!wm", name = "SA", descriptor = "(Lj;IIIIZ)V", line = 1058)
    public final void method227(class378 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(Lra;IIII[[I[[II)V", line = 1064)
    public class395(class70 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field5509 = arg0;
        this.field5491 = arg2;
        this.field5492 = arg5;
        this.field5504 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field5509.field1012 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + arg7 * 512 + var13 * var13));
                int var16 = (var13 << 8) / var15;
                int var17 = arg7 * -512 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field5509.field1016 * var18 + this.field5509.field1026 * var16 + this.field5509.field1025 * var17 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field5504[var11][var10] = (byte) var20;
            }
        }
        this.field5508 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(I)Z", line = 1119)
    private final boolean method2263(int arg0) {
        if ((this.field5491 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else if (arg0 == 8) {
            return true;
        } else {
            return arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(II)V", line = 1135)
    public final void method225(int arg0, int arg1) {
        class374 var3 = this.field5509.method523(Thread.currentThread());
        var3.field5224.field7542 = 0;
        if (this.field5498 != null) {
            this.method2262(arg0, arg1, this.field5509.field1021, var3.field5224, var3.field5248, var3.field5242, var3.field5259);
        } else {
            if (this.field5496 != null) {
                this.method2261(arg0, arg1, var3.field5224, var3.field5248, var3.field5242, var3.field5259);
            }
        }
    }

    @OriginalMember(owner = "client!wm", name = "O", descriptor = "(IILj;)Lj;", line = 1149)
    public final class378 method224(int arg0, int arg1, class378 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!wm", name = "U", descriptor = "(Lj;IIIIZ)V", line = 1151)
    public final void method226(class378 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!wm", name = "f", descriptor = "()V", line = 1155)
    public final void method235() {
        this.field5504 = null;
        this.field5508 = null;
    }

    @OriginalMember(owner = "client!wm", name = "JA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 1159)
    public final void method223(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (this.field5498 == null) {
            this.field5498 = new class27[super.field495][super.field497];
            this.field5501 = new class259[super.field495][super.field497];
        } else if (this.field5496 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var15 = 0; var15 < arg6.length; ++var15) {
                if (arg6[var15] == -1) {
                    arg6[var15] = 0;
                } else {
                    arg6[var15] = class455.field6653[class384.method2206(true, arg6[var15]) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var16 = 0; var16 < arg7.length; ++var16) {
                    if (arg7[var16] == -1) {
                        arg7[var16] = 0;
                    } else {
                        arg7[var16] = class455.field6653[class384.method2206(true, arg7[var16]) & 65535] << 8 | 255;
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
                    } else if (arg2[var22] == super.field494 && arg4[var22] == 0) {
                        if (var19 != -1 && arg6[var19] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var19 = var22;
                    } else if (arg2[var22] == super.field494 && arg4[var22] == super.field494) {
                        if (var20 != -1 && arg6[var20] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var20 = var22;
                    } else if (arg2[var22] == 0 && arg4[var22] == super.field494) {
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
                            if (arg2[var24] != arg2[0] && arg2[0] + super.field494 != arg2[var24] && arg2[0] - super.field494 != arg2[var24]) {
                                var17 = false;
                                break;
                            }
                            if (arg4[var24] != arg4[0] && arg4[0] + super.field494 != arg4[var24] && arg4[0] - super.field494 != arg4[var24]) {
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
                class27 var25 = new class27();
                int var26 = arg6[0];
                int var27 = arg8[0];
                if (arg7 != null) {
                    var25.field412 = arg7[0] >> 8;
                    if (var26 == 0) {
                        var25.field409 = (byte) (var25.field409 | 2);
                    }
                } else if (var26 == 0) {
                    return;
                }
                if (this.field5492[arg0 + 1][arg1] == this.field5492[arg0][arg1] && this.field5492[arg0 + 1][arg1 + 1] == this.field5492[arg0][arg1] && this.field5492[arg0][arg1 + 1] == this.field5492[arg0][arg1]) {
                    var25.field409 = (byte) (var25.field409 | 1);
                }
                if (var27 != -1 && (var25.field409 & 2) == 0 && !this.field5509.field2312.method830(var27, (byte) 71).field7371) {
                    var25.field414 = this.field5504[arg0][arg1] - this.field5508[arg0][arg1];
                    var25.field410 = this.field5504[arg0 + 1][arg1] - this.field5508[arg0 + 1][arg1];
                    var25.field407 = this.field5504[arg0 + 1][arg1 + 1] - this.field5508[arg0 + 1][arg1 + 1];
                    var25.field415 = this.field5504[arg0][arg1 + 1] - this.field5508[arg0][arg1 + 1];
                    var25.field416 = (short) var27;
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
                    var25.field414 = class24.method178(method2260(arg6[var18] >> 8, this.field5504[arg0][arg1] - this.field5508[arg0][arg1]), var28, arg10, -1866846296);
                    if (var25.field412 != 0) {
                        var25.field414 |= 255 - (this.field5504[arg0][arg1] - this.field5508[arg0][arg1]) << 25;
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
                    var25.field410 = class24.method178(method2260(arg6[var19] >> 8, this.field5504[arg0 + 1][arg1] - this.field5508[arg0 + 1][arg1]), var29, arg10, -1866846296);
                    if (var25.field412 != 0) {
                        var25.field410 |= 255 - (this.field5504[arg0 + 1][arg1] - this.field5508[arg0 + 1][arg1]) << 25;
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
                    var25.field407 = class24.method178(method2260(arg6[var20] >> 8, this.field5504[arg0 + 1][arg1 + 1] - this.field5508[arg0 + 1][arg1 + 1]), var30, arg10, -1866846296);
                    if (var25.field412 != 0) {
                        var25.field407 |= 255 - (this.field5504[arg0 + 1][arg1 + 1] - this.field5508[arg0 + 1][arg1 + 1]) << 25;
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
                    var25.field415 = class24.method178(method2260(arg6[var21] >> 8, this.field5504[arg0][arg1 + 1] - this.field5508[arg0][arg1 + 1]), var31, arg10, -1866846296);
                    if (var25.field412 != 0) {
                        var25.field415 |= 255 - (this.field5504[arg0][arg1 + 1] - this.field5508[arg0][arg1 + 1]) << 25;
                    }
                    var25.field416 = -1;
                }
                if (arg5 != null) {
                    var25.field411 = (short) arg5[var20];
                    var25.field413 = (short) arg5[var21];
                    var25.field408 = (short) arg5[var19];
                    var25.field417 = (short) arg5[var18];
                }
                this.field5498[arg0][arg1] = var25;
            } else {
                class259 var32 = new class259();
                var32.field3571 = (short) arg2.length;
                var32.field3569 = (short) (arg2.length / 3);
                var32.field3567 = new short[var32.field3571];
                var32.field3572 = new short[var32.field3571];
                var32.field3573 = new short[var32.field3571];
                var32.field3568 = new int[var32.field3571];
                if (arg5 != null) {
                    var32.field3574 = new short[var32.field3571];
                }
                for (int var33 = 0; var33 < var32.field3571; ++var33) {
                    int var48 = arg2[var33];
                    int var49 = arg4[var33];
                    boolean var50 = false;
                    int var51;
                    if (var48 == 0 && var49 == 0) {
                        var51 = this.field5504[arg0][arg1] - this.field5508[arg0][arg1];
                    } else if (var48 == 0 && super.field494 == var49) {
                        var51 = this.field5504[arg0][arg1 + 1] - this.field5508[arg0][arg1 + 1];
                    } else if (super.field494 == var48 && super.field494 == var49) {
                        var51 = this.field5504[arg0 + 1][arg1 + 1] - this.field5508[arg0 + 1][arg1 + 1];
                    } else if (super.field494 == var48 && var49 == 0) {
                        var51 = this.field5504[arg0 + 1][arg1] - this.field5508[arg0 + 1][arg1];
                    } else {
                        int var52 = (this.field5504[arg0 + 1][arg1] - this.field5508[arg0 + 1][arg1]) * var48 + (this.field5504[arg0][arg1] - this.field5508[arg0][arg1]) * (super.field494 - var48);
                        int var53 = (this.field5504[arg0 + 1][arg1 + 1] - this.field5508[arg0 + 1][arg1 + 1]) * var48 + (this.field5504[arg0][arg1 + 1] - this.field5508[arg0][arg1 + 1]) * (super.field494 - var48);
                        var51 = (super.field494 - var49) * var52 + var49 * var53 >> super.field492 * 2;
                    }
                    int var54 = (arg0 << super.field492) + var48;
                    int var55 = (arg1 << super.field492) + var49;
                    var32.field3567[var33] = (short) var48;
                    var32.field3573[var33] = (short) var49;
                    var32.field3572[var33] = (short) (this.method232(var54, var55) + (arg3 != null ? arg3[var33] : 0));
                    if (var51 < 0) {
                        var51 = 0;
                    }
                    if (arg8[var33] != -1 && !this.field5509.field2312.method830(arg8[var33], (byte) 71).field7371) {
                        var32.field3568[var33] = var51;
                    } else if (arg6[var33] == 0) {
                        if (arg7 != null) {
                            var32.field3568[var33] = var51 << 25;
                        } else {
                            var32.field3568[var33] = 0;
                        }
                    } else {
                        int var56 = 0;
                        if (arg5 != null) {
                            short var57 = var32.field3574[var33] = (short) arg5[var33];
                            if (arg11 != 0) {
                                var56 = var57 * 255 / arg11;
                                if (var56 < 0) {
                                    var56 = 0;
                                } else if (var56 > 255) {
                                    var56 = 255;
                                }
                            }
                        }
                        var32.field3568[var33] = class24.method178(method2260(arg6[var33] >> 8, var51), var56, arg10, -1866846296);
                        if (arg7 != null) {
                            var32.field3568[var33] |= var51 << 25;
                        }
                    }
                }
                boolean var34 = false;
                for (int var35 = 0; var35 < var32.field3569; ++var35) {
                    if (arg8[var35 * 3] != -1 && !this.field5509.field2312.method830(arg8[var35 * 3], (byte) 71).field7371) {
                        var34 = true;
                    }
                }
                if (arg7 != null) {
                    var32.field3570 = new int[var32.field3569];
                }
                if (var34) {
                    var32.field3566 = new short[var32.field3569];
                    var32.field3575 = new short[var32.field3569];
                }
                for (int var36 = 0; var36 < var32.field3569; ++var36) {
                    int var37 = var36 * 3;
                    if (arg7 != null && arg7[var37] != 0) {
                        var32.field3570[var36] = arg7[var37] >> 8;
                    }
                    if (var34) {
                        int var38 = var37 + 1;
                        int var39 = var38 + 1;
                        boolean var40 = false;
                        boolean var41 = true;
                        int var42 = arg8[var37];
                        if (var42 != -1 && !this.field5509.field2312.method830(var42, (byte) 71).field7371) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var43 = arg8[var38];
                        if (var43 != -1 && !this.field5509.field2312.method830(var43, (byte) 71).field7371) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var44 = arg8[var39];
                        if (var44 != -1 && !this.field5509.field2312.method830(var44, (byte) 71).field7371) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        if (var41) {
                            var32.field3566[var36] = (short) var44;
                            var32.field3575[var36] = (short) arg9[var37];
                        } else {
                            if (var40) {
                                int var45 = arg8[var37];
                                if (var45 != -1 && !this.field5509.field2312.method830(var45, (byte) 71).field7371) {
                                    var32.field3568[var37] = class455.field6653[class384.method2206(true, this.field5509.field2312.method830(var45, (byte) 71).field7367 & 65535) & 65535];
                                }
                                int var46 = arg8[var38];
                                if (var46 != -1 && !this.field5509.field2312.method830(var46, (byte) 71).field7371) {
                                    var32.field3568[var38] = class455.field6653[class384.method2206(true, this.field5509.field2312.method830(var46, (byte) 71).field7367 & 65535) & 65535];
                                }
                                int var47 = arg8[var39];
                                if (var47 != -1 && !this.field5509.field2312.method830(var47, (byte) 71).field7371) {
                                    var32.field3568[var39] = class455.field6653[class384.method2206(true, this.field5509.field2312.method830(var47, (byte) 71).field7367 & 65535) & 65535];
                                }
                            }
                            var32.field3566[var36] = -1;
                        }
                    }
                }
                this.field5501[arg0][arg1] = var32;
            }
        }
    }

    @OriginalMember(owner = "client!wm", name = "I", descriptor = "(II)I", line = 1655)
    public final int method221(int arg0, int arg1) {
        return this.field5492[arg0][arg1];
    }

    @OriginalMember(owner = "client!wm", name = "va", descriptor = "(II)I", line = 1664)
    public final int method232(int arg0, int arg1) {
        int var3 = arg0 >> super.field492;
        int var4 = arg1 >> super.field492;
        if (var3 >= 0 && var4 >= 0 && var3 <= super.field495 - 1 && var4 <= super.field497 - 1) {
            int var5 = arg0 & super.field494 - 1;
            int var6 = arg1 & super.field494 - 1;
            int var7 = (super.field494 - var5) * this.field5492[var3][var4] + this.field5492[var3 + 1][var4] * var5 >> super.field492;
            int var8 = (super.field494 - var5) * this.field5492[var3][var4 + 1] + this.field5492[var3 + 1][var4 + 1] * var5 >> super.field492;
            return (super.field494 - var6) * var7 + var6 * var8 >> super.field492;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIIIIII[[ZLcc;[I[I)V", line = 1683)
    private final void method2264(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class513 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field7533 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field5498[var16][var17] != null) {
                        class27 var18 = this.field5498[var16][var17];
                        if (var18.field416 != -1 && (var18.field409 & 2) == 0 && var18.field412 == 0) {
                            int var19 = this.field5509.method494(var18.field416);
                            arg8.method3008(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class522.method3074(0, var18.field407, var19), class522.method3074(0, var18.field415, var19), class522.method3074(0, var18.field410, var19));
                            arg8.method3008(var15, var15, var15 - var13, var14, var13 + var14, var14, class522.method3074(0, var18.field414, var19), class522.method3074(0, var18.field410, var19), class522.method3074(0, var18.field415, var19));
                        } else if (var18.field412 == 0) {
                            arg8.method3016(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field407, var18.field415, var18.field410);
                            arg8.method3016(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field414, var18.field410, var18.field415);
                        } else {
                            int var20 = var18.field412;
                            arg8.method3016(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class110.method713(var18.field407 & -16777216, var20, 107), class110.method713(var18.field415 & -16777216, var20, 101), class110.method713(var18.field410 & -16777216, var20, 118));
                            arg8.method3016(var15, var15, var15 - var13, var14, var13 + var14, var14, class110.method713(var18.field414 & -16777216, var20, 122), class110.method713(var18.field410 & -16777216, var20, 109), class110.method713(var18.field415 & -16777216, var20, 109));
                        }
                    } else if (this.field5501[var16][var17] != null) {
                        class259 var21 = this.field5501[var16][var17];
                        for (int var22 = 0; var22 < var21.field3571; ++var22) {
                            arg9[var22] = var21.field3567[var22] * var13 / super.field494 + var14;
                            arg10[var22] = var15 - var21.field3573[var22] * var13 / super.field494;
                        }
                        for (int var23 = 0; var23 < var21.field3569; ++var23) {
                            int var24 = var23 * 3;
                            int var25 = var24 + 1;
                            int var26 = var25 + 1;
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field3570 != null && var21.field3570[var23] != 0 && (var21.field3566 == null || var21.field3566 != null && var21.field3566[var23] == -1)) {
                                int var33 = var21.field3570[var23];
                                arg8.method3016(var30, var31, var32, var27, var28, var29, class110.method713(-16777216 - (var21.field3568[var24] & -16777216), var33, 126), class110.method713(-16777216 - (var21.field3568[var25] & -16777216), var33, 111), class110.method713(-16777216 - (var21.field3568[var26] & -16777216), var33, 120));
                            } else if (var21.field3566 != null && var21.field3566[var23] != -1) {
                                int var34 = this.field5509.method494(var21.field3566[var23]);
                                arg8.method3008(var30, var31, var32, var27, var28, var29, var34, var34, var34);
                            } else {
                                arg8.method3016(var30, var31, var32, var27, var28, var29, var21.field3568[var24], var21.field3568[var25], var21.field3568[var26]);
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field7533 = true;
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(IIIIIII[[ZLcc;[I[I)V", line = 1817)
    private final void method2265(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class513 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field7533 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field5496[var16][var17] != null) {
                        class369 var18 = this.field5496[var16][var17];
                        if (var18.field5176 != -1 && (var18.field5180 & 2) == 0 && var18.field5177 == -1) {
                            int var19 = this.field5509.method494(var18.field5176);
                            arg8.method3008(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class522.method3074(0, var18.field5175 & 65535, var19), class522.method3074(0, var18.field5178 & 65535, var19), class522.method3074(0, var18.field5174 & 65535, var19));
                            arg8.method3008(var15, var15, var15 - var13, var14, var13 + var14, var14, class522.method3074(0, var18.field5179 & 65535, var19), class522.method3074(0, var18.field5174 & 65535, var19), class522.method3074(0, var18.field5178 & 65535, var19));
                        } else if (var18.field5177 == -1) {
                            arg8.method3008(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field5175 & 65535, var18.field5178 & 65535, var18.field5174 & 65535);
                            arg8.method3008(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field5179 & 65535, var18.field5174 & 65535, var18.field5178 & 65535);
                        } else {
                            int var20 = var18.field5177;
                            arg8.method3008(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var20, var20, var20);
                            arg8.method3008(var15, var15, var15 - var13, var14, var13 + var14, var14, var20, var20, var20);
                        }
                    } else if (this.field5494[var16][var17] != null) {
                        class357 var21 = this.field5494[var16][var17];
                        for (int var22 = 0; var22 < var21.field4878; ++var22) {
                            arg9[var22] = var21.field4883[var22] * var13 / super.field494 + var14;
                            arg10[var22] = var15 - var21.field4885[var22] * var13 / super.field494;
                        }
                        for (int var23 = 0; var23 < var21.field4880; ++var23) {
                            short var24 = var21.field4877[var23];
                            short var25 = var21.field4887[var23];
                            short var26 = var21.field4876[var23];
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field4884 != null && var21.field4884[var23] != -1) {
                                int var33 = var21.field4884[var23];
                                arg8.method3008(var30, var31, var32, var27, var28, var29, class522.method3074(0, var21.field4875[var24], var33), class522.method3074(0, var21.field4875[var25], var33), class522.method3074(0, var21.field4875[var26], var33));
                            } else if (var21.field4881 != null && var21.field4881[var23] != -1) {
                                int var34 = this.field5509.method494(var21.field4881[var23]);
                                arg8.method3008(var30, var31, var32, var27, var28, var29, class522.method3074(0, var21.field4875[var24], var34), class522.method3074(0, var21.field4875[var25], var34), class522.method3074(0, var21.field4875[var26], var34));
                            } else {
                                int var35 = var21.field4886[var23];
                                arg8.method3008(var30, var31, var32, var27, var28, var29, class522.method3074(0, var21.field4875[var24], var35), class522.method3074(0, var21.field4875[var25], var35), class522.method3074(0, var21.field4875[var26], var35));
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field7533 = true;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIIIIII[[Z)V", line = 1948)
    public final void method228(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class374 var9 = this.field5509.method523(Thread.currentThread());
        class513 var10 = var9.field5224;
        var10.field7542 = 0;
        var10.field7544 = false;
        if (this.field5498 != null) {
            this.method2264(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field5248, var9.field5242);
        } else {
            if (this.field5496 != null) {
                this.method2265(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field5248, var9.field5242);
            }
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 1962)
    public final void method222(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field5496 == null) {
            this.field5496 = new class369[super.field495][super.field497];
            this.field5494 = new class357[super.field495][super.field497];
        } else if (this.field5498 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && super.field494 != var20 || var21 != 0 && super.field494 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class357 var22 = new class357();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field4878 = var23;
            var22.field4875 = new short[var23];
            var22.field4883 = new short[var23];
            var22.field4882 = new short[var23];
            var22.field4885 = new short[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var30 = arg2[var25];
                int var31 = arg4[var25];
                if (var30 == 0 && var31 == 0) {
                    var22.field4875[var25] = (short) (this.field5504[arg0][arg1] - this.field5508[arg0][arg1]);
                } else if (var30 == 0 && super.field494 == var31) {
                    var22.field4875[var25] = (short) (this.field5504[arg0][arg1 + 1] - this.field5508[arg0][arg1 + 1]);
                } else if (super.field494 == var30 && super.field494 == var31) {
                    var22.field4875[var25] = (short) (this.field5504[arg0 + 1][arg1 + 1] - this.field5508[arg0 + 1][arg1 + 1]);
                } else if (super.field494 == var30 && var31 == 0) {
                    var22.field4875[var25] = (short) (this.field5504[arg0 + 1][arg1] - this.field5508[arg0 + 1][arg1]);
                } else {
                    int var32 = (this.field5504[arg0 + 1][arg1] - this.field5508[arg0 + 1][arg1]) * var30 + (this.field5504[arg0][arg1] - this.field5508[arg0][arg1]) * (super.field494 - var30);
                    int var33 = (this.field5504[arg0 + 1][arg1 + 1] - this.field5508[arg0 + 1][arg1 + 1]) * var30 + (this.field5504[arg0][arg1 + 1] - this.field5508[arg0][arg1 + 1]) * (super.field494 - var30);
                    var22.field4875[var25] = (short) ((super.field494 - var31) * var32 + var31 * var33 >> super.field492 * 2);
                }
                int var34 = (arg0 << super.field492) + var30;
                int var35 = (arg1 << super.field492) + var31;
                var22.field4883[var25] = (short) var30;
                var22.field4885[var25] = (short) var31;
                var22.field4882[var25] = (short) (this.method232(var34, var35) + (arg3 != null ? arg3[var25] : 0));
                if (var22.field4875[var25] < 2) {
                    var22.field4875[var25] = 2;
                }
            }
            boolean var26 = false;
            int var27 = 0;
            for (int var28 = 0; var28 < var24; ++var28) {
                if (arg9[var28] >= 0 || arg10 != null && arg10[var28] >= 0) {
                    ++var27;
                }
                if (arg11[var28] != -1 && !this.field5509.field2312.method830(arg11[var28], (byte) 71).field7371) {
                    var26 = true;
                }
            }
            var22.field4886 = new int[var27];
            if (arg10 != null) {
                var22.field4884 = new int[var27];
            }
            var22.field4877 = new short[var27];
            var22.field4887 = new short[var27];
            var22.field4876 = new short[var27];
            if (var26) {
                var22.field4881 = new short[var27];
                var22.field4879 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field4886[var22.field4880] = class384.method2206(true, arg9[var29]);
                    } else {
                        var22.field4886[var22.field4880] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field4884[var22.field4880] = class384.method2206(true, arg10[var29]);
                        } else {
                            var22.field4884[var22.field4880] = -1;
                        }
                    }
                    var22.field4877[var22.field4880] = (short) arg6[var29];
                    var22.field4887[var22.field4880] = (short) arg7[var29];
                    var22.field4876[var22.field4880] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field5509.field2312.method830(arg11[var29], (byte) 71).field7371) {
                            var22.field4881[var22.field4880] = (short) arg11[var29];
                            var22.field4879[var22.field4880] = (short) arg12[var29];
                        } else {
                            var22.field4881[var22.field4880] = -1;
                        }
                    }
                    ++var22.field4880;
                }
            }
            this.field5494[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class369 var36 = new class369();
                int var37 = arg9[0];
                int var38 = arg11[0];
                if (arg10 != null) {
                    var36.field5177 = class522.method3074(0, this.field5504[arg0][arg1] - this.field5508[arg0][arg1], class384.method2206(true, arg10[0]));
                    if (var37 == -1) {
                        var36.field5180 = (byte) (var36.field5180 | 2);
                    }
                }
                if (this.field5492[arg0 + 1][arg1] == this.field5492[arg0][arg1] && this.field5492[arg0 + 1][arg1 + 1] == this.field5492[arg0][arg1] && this.field5492[arg0][arg1 + 1] == this.field5492[arg0][arg1]) {
                    var36.field5180 = (byte) (var36.field5180 | 1);
                }
                if (var38 != -1 && (var36.field5180 & 2) == 0 && !this.field5509.field2312.method830(var38, (byte) 71).field7371) {
                    var36.field5179 = (short) (this.field5504[arg0][arg1] - this.field5508[arg0][arg1]);
                    var36.field5174 = (short) (this.field5504[arg0 + 1][arg1] - this.field5508[arg0 + 1][arg1]);
                    var36.field5175 = (short) (this.field5504[arg0 + 1][arg1 + 1] - this.field5508[arg0 + 1][arg1 + 1]);
                    var36.field5178 = (short) (this.field5504[arg0][arg1 + 1] - this.field5508[arg0][arg1 + 1]);
                    var36.field5176 = (short) var38;
                } else {
                    short var39 = class384.method2206(true, var37);
                    var36.field5179 = (short) class522.method3074(0, this.field5504[arg0][arg1] - this.field5508[arg0][arg1], var39);
                    var36.field5174 = (short) class522.method3074(0, this.field5504[arg0 + 1][arg1] - this.field5508[arg0 + 1][arg1], var39);
                    var36.field5175 = (short) class522.method3074(0, this.field5504[arg0 + 1][arg1 + 1] - this.field5508[arg0 + 1][arg1 + 1], var39);
                    var36.field5178 = (short) class522.method3074(0, this.field5504[arg0][arg1 + 1] - this.field5508[arg0][arg1 + 1], var39);
                    var36.field5176 = -1;
                }
                this.field5496[arg0][arg1] = var36;
            }
        }
    }
}
