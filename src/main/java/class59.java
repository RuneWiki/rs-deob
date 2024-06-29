import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class59 extends class11 {

    @OriginalMember(owner = "client!mq", name = "w", descriptor = "I")
    private int field846 = -1;

    @OriginalMember(owner = "client!mq", name = "j", descriptor = "Lms;")
    private class82 field833;

    @OriginalMember(owner = "client!mq", name = "t", descriptor = "I")
    private int field843;

    @OriginalMember(owner = "client!mq", name = "q", descriptor = "[[I")
    public int[][] field840;

    @OriginalMember(owner = "client!mq", name = "D", descriptor = "[[B")
    private byte[][] field853;

    @OriginalMember(owner = "client!mq", name = "s", descriptor = "[[B")
    private byte[][] field842;

    @OriginalMember(owner = "client!mq", name = "i", descriptor = "I")
    private int field832;

    @OriginalMember(owner = "client!mq", name = "k", descriptor = "I")
    private int field834;

    @OriginalMember(owner = "client!mq", name = "m", descriptor = "I")
    private int field836;

    @OriginalMember(owner = "client!mq", name = "n", descriptor = "I")
    private int field837;

    @OriginalMember(owner = "client!mq", name = "p", descriptor = "I")
    private int field839;

    @OriginalMember(owner = "client!mq", name = "r", descriptor = "I")
    private int field841;

    @OriginalMember(owner = "client!mq", name = "u", descriptor = "I")
    private int field844;

    @OriginalMember(owner = "client!mq", name = "v", descriptor = "I")
    private int field845;

    @OriginalMember(owner = "client!mq", name = "y", descriptor = "I")
    private int field848;

    @OriginalMember(owner = "client!mq", name = "A", descriptor = "I")
    private int field850;

    @OriginalMember(owner = "client!mq", name = "B", descriptor = "I")
    private int field851;

    @OriginalMember(owner = "client!mq", name = "C", descriptor = "I")
    private int field852;

    @OriginalMember(owner = "client!mq", name = "x", descriptor = "[[Lsk;")
    private class335[][] field847;

    @OriginalMember(owner = "client!mq", name = "z", descriptor = "[[Lr;")
    private class430[][] field849;

    @OriginalMember(owner = "client!mq", name = "l", descriptor = "[[Lnl;")
    private class442[][] field835;

    @OriginalMember(owner = "client!mq", name = "o", descriptor = "[[Lsl;")
    private class456[][] field838;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIIIIII[[Z)V", line = 4)
    public final void method83(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class348 var9 = this.field833.method633(Thread.currentThread());
        class289 var10 = var9.field5003;
        var10.field3922 = 0;
        var10.field3914 = false;
        if (this.field849 != null) {
            this.method382(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field5028, var9.field5018);
        } else {
            if (this.field838 != null) {
                this.method384(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field5028, var9.field5018);
            }
        }
    }

    @OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(Lms;IIII[[I[[II)V", line = 18)
    public class59(class82 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field833 = arg0;
        this.field843 = arg2;
        this.field840 = arg5;
        this.field853 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field833.field1175 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + arg7 * 512 + var13 * var13));
                int var16 = (var13 << 8) / var15;
                int var17 = arg7 * -512 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field833.field1168 * var18 + this.field833.field1207 * var16 + this.field833.field1188 * var17 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field853[var11][var10] = (byte) var20;
            }
        }
        this.field842 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!mq", name = "OA", descriptor = "(IILi;)Li;", line = 70)
    public final class197 method86(int arg0, int arg1, class197 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!mq", name = "ba", descriptor = "(Li;IIIIZ)V", line = 74)
    public final void method73(class197 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIZLhp;[I[I[I)V", line = 78)
    private final void method380(int arg0, int arg1, boolean arg2, class289 arg3, int[] arg4, int[] arg5, int[] arg6) {
        class430 var8 = this.field849[arg0][arg1];
        if (var8 != null) {
            if ((var8.field6232 & 2) == 0) {
                int var9 = super.field121 * arg0;
                int var10 = super.field121 + var9;
                int var11 = super.field121 * arg1;
                int var12 = super.field121 + var11;
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
                if ((var8.field6232 & 1) != 0 && !arg2) {
                    int var17 = this.field840[arg0][arg1];
                    if (this.field846 == -1) {
                        int var18 = this.field841 * var17;
                        var19 = (this.field850 * var11 + this.field837 * var9 + var18 >> 15) + this.field851;
                        if (var19 <= this.field833.field1202) {
                            return;
                        }
                        var20 = (this.field850 * var11 + this.field837 * var10 + var18 >> 15) + this.field851;
                        if (var20 <= this.field833.field1202) {
                            return;
                        }
                        var21 = (this.field850 * var12 + this.field837 * var10 + var18 >> 15) + this.field851;
                        if (var21 <= this.field833.field1202) {
                            return;
                        }
                        var22 = (this.field850 * var12 + this.field837 * var9 + var18 >> 15) + this.field851;
                        if (var22 <= this.field833.field1202) {
                            return;
                        }
                    } else {
                        var22 = this.field846;
                        var21 = this.field846;
                        var20 = this.field846;
                        var19 = this.field846;
                    }
                    if (this.field833.field1195) {
                        int var23 = var19 - this.field833.field1189;
                        if (var23 > 0) {
                            var13 = var23;
                            if (var23 > 255) {
                                var13 = 255;
                            }
                        }
                        int var24 = var20 - this.field833.field1189;
                        if (var24 > 0) {
                            var14 = var24;
                            if (var24 > 255) {
                                var14 = 255;
                            }
                        }
                        int var25 = var21 - this.field833.field1189;
                        if (var25 > 0) {
                            var15 = var25;
                            if (var25 > 255) {
                                var15 = 255;
                            }
                        }
                        int var26 = var22 - this.field833.field1189;
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    int var27 = this.field852 * var17;
                    int var28 = this.field845 * var17;
                    var29 = (this.field844 * var11 + this.field836 * var9 + var27 >> 15) + this.field832;
                    var30 = this.field833.field1186 * var29 / var19 + arg3.field3918;
                    var31 = (this.field834 * var11 + this.field848 * var9 + var28 >> 15) + this.field839;
                    var32 = this.field833.field1184 * var31 / var19 + arg3.field3917;
                    var33 = (this.field844 * var11 + this.field836 * var10 + var27 >> 15) + this.field832;
                    var34 = this.field833.field1186 * var33 / var20 + arg3.field3918;
                    var35 = (this.field834 * var11 + this.field848 * var10 + var28 >> 15) + this.field839;
                    var36 = this.field833.field1184 * var35 / var20 + arg3.field3917;
                    var37 = (this.field844 * var12 + this.field836 * var10 + var27 >> 15) + this.field832;
                    var38 = this.field833.field1186 * var37 / var21 + arg3.field3918;
                    var39 = (this.field834 * var12 + this.field848 * var10 + var28 >> 15) + this.field839;
                    var40 = this.field833.field1184 * var39 / var21 + arg3.field3917;
                    var41 = (this.field844 * var12 + this.field836 * var9 + var27 >> 15) + this.field832;
                    var42 = this.field833.field1186 * var41 / var22 + arg3.field3918;
                    var43 = (this.field834 * var12 + this.field848 * var9 + var28 >> 15) + this.field839;
                    var44 = this.field833.field1184 * var43 / var22 + arg3.field3917;
                } else {
                    int var45 = this.field840[arg0][arg1];
                    int var46 = this.field840[arg0 + 1][arg1];
                    int var47 = this.field840[arg0 + 1][arg1 + 1];
                    int var48 = this.field840[arg0][arg1 + 1];
                    if (this.field846 == -1) {
                        var19 = (this.field850 * var11 + this.field841 * var45 + this.field837 * var9 >> 15) + this.field851;
                        if (var19 <= this.field833.field1202) {
                            return;
                        }
                        var20 = (this.field850 * var11 + this.field841 * var46 + this.field837 * var10 >> 15) + this.field851;
                        if (var20 <= this.field833.field1202) {
                            return;
                        }
                        var21 = (this.field850 * var12 + this.field841 * var47 + this.field837 * var10 >> 15) + this.field851;
                        if (var21 <= this.field833.field1202) {
                            return;
                        }
                        var22 = (this.field850 * var12 + this.field841 * var48 + this.field837 * var9 >> 15) + this.field851;
                        if (var22 <= this.field833.field1202) {
                            return;
                        }
                    } else {
                        var22 = this.field846;
                        var21 = this.field846;
                        var20 = this.field846;
                        var19 = this.field846;
                    }
                    if (arg2) {
                        int var49 = var19 - this.field833.field1189;
                        if (var49 > 255) {
                            var49 = 255;
                        }
                        if (var49 > 0) {
                            var13 = var49;
                            int var50 = var8.field6234 * var49 / 255;
                            if (var50 > 0) {
                                var45 -= var50;
                            }
                        }
                        int var51 = var20 - this.field833.field1189;
                        if (var51 > 255) {
                            var51 = 255;
                        }
                        if (var51 > 0) {
                            var14 = var51;
                            int var52 = var8.field6235 * var51 / 255;
                            if (var52 > 0) {
                                var46 -= var52;
                            }
                        }
                        int var53 = var21 - this.field833.field1189;
                        if (var53 > 255) {
                            var53 = 255;
                        }
                        if (var53 > 0) {
                            var15 = var53;
                            int var54 = var8.field6237 * var53 / 255;
                            if (var54 > 0) {
                                var47 -= var54;
                            }
                        }
                        int var55 = var22 - this.field833.field1189;
                        if (var55 > 255) {
                            var55 = 255;
                        }
                        if (var55 > 0) {
                            var16 = var55;
                            int var56 = var8.field6236 * var55 / 255;
                            if (var56 > 0) {
                                var48 -= var56;
                            }
                        }
                    } else if (this.field833.field1195) {
                        int var57 = var19 - this.field833.field1189;
                        if (var57 > 0) {
                            var13 = var57;
                            if (var57 > 255) {
                                var13 = 255;
                            }
                        }
                        int var58 = var20 - this.field833.field1189;
                        if (var58 > 0) {
                            var14 = var58;
                            if (var58 > 255) {
                                var14 = 255;
                            }
                        }
                        int var59 = var21 - this.field833.field1189;
                        if (var59 > 0) {
                            var15 = var59;
                            if (var59 > 255) {
                                var15 = 255;
                            }
                        }
                        int var60 = var22 - this.field833.field1189;
                        if (var60 > 0) {
                            var16 = var60;
                            if (var60 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    var29 = (this.field844 * var11 + this.field852 * var45 + this.field836 * var9 >> 15) + this.field832;
                    var30 = this.field833.field1186 * var29 / var19 + arg3.field3918;
                    var31 = (this.field834 * var11 + this.field848 * var9 + this.field845 * var45 >> 15) + this.field839;
                    var32 = this.field833.field1184 * var31 / var19 + arg3.field3917;
                    var33 = (this.field844 * var11 + this.field852 * var46 + this.field836 * var10 >> 15) + this.field832;
                    var34 = this.field833.field1186 * var33 / var20 + arg3.field3918;
                    var35 = (this.field834 * var11 + this.field848 * var10 + this.field845 * var46 >> 15) + this.field839;
                    var36 = this.field833.field1184 * var35 / var20 + arg3.field3917;
                    var37 = (this.field844 * var12 + this.field852 * var47 + this.field836 * var10 >> 15) + this.field832;
                    var38 = this.field833.field1186 * var37 / var21 + arg3.field3918;
                    var39 = (this.field834 * var12 + this.field848 * var10 + this.field845 * var47 >> 15) + this.field839;
                    var40 = this.field833.field1184 * var39 / var21 + arg3.field3917;
                    var41 = (this.field844 * var12 + this.field852 * var48 + this.field836 * var9 >> 15) + this.field832;
                    var42 = this.field833.field1186 * var41 / var22 + arg3.field3918;
                    var43 = (this.field834 * var12 + this.field848 * var9 + this.field845 * var48 >> 15) + this.field839;
                    var44 = this.field833.field1184 * var43 / var22 + arg3.field3917;
                }
                boolean var61 = var8.field6231 != -1 && this.method381(this.field833.field3988.method914(false, var8.field6231).field3382);
                int var62 = var14 + var15 + var16;
                if ((var36 - var44) * (var38 - var42) - (var34 - var42) * (var40 - var44) > 0) {
                    arg3.field3914 = var38 < 0 || var42 < 0 || var34 < 0 || var38 > arg3.field3920 || var42 > arg3.field3920 || var34 > arg3.field3920;
                    if (var62 < 765) {
                        if (var61) {
                            arg3.field3922 = 100;
                        }
                        if (var62 > 0) {
                            if (var8.field6231 >= 0) {
                                arg3.method1665(var40, var44, var36, var38, var42, var34, this.field833.field1182, var15, var16, var14, var8.field6230, var8.field6239, var8.field6229, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field6231);
                            } else {
                                arg3.method1664(var40, var44, var36, var38, var42, var34, class425.method2539(35, var8.field6230, var15 << 24 | this.field833.field1182), class425.method2539(58, var8.field6239, var16 << 24 | this.field833.field1182), class425.method2539(48, var8.field6229, var14 << 24 | this.field833.field1182));
                            }
                        } else if (var8.field6231 >= 0) {
                            arg3.method1666(var40, var44, var36, var38, var42, var34, var8.field6230, var8.field6239, var8.field6229, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field6231);
                        } else {
                            arg3.method1664(var40, var44, var36, var38, var42, var34, var8.field6230, var8.field6239, var8.field6229);
                        }
                        arg3.field3922 = 0;
                    } else {
                        arg3.method1663(var40, var44, var36, var38, var42, var34, this.field833.field1182);
                    }
                }
                int var63 = var13 + var14 + var16;
                if ((var30 - var34) * (var44 - var36) - (var32 - var36) * (var42 - var34) > 0) {
                    arg3.field3914 = var30 < 0 || var34 < 0 || var42 < 0 || var30 > arg3.field3920 || var34 > arg3.field3920 || var42 > arg3.field3920;
                    if (var63 < 765) {
                        if (var61) {
                            arg3.field3922 = 100;
                        }
                        if (var63 > 0) {
                            if (var8.field6231 >= 0) {
                                arg3.method1665(var32, var36, var44, var30, var34, var42, this.field833.field1182, var13, var14, var16, var8.field6233, var8.field6229, var8.field6239, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field6231);
                            } else {
                                arg3.method1664(var32, var36, var44, var30, var34, var42, class425.method2539(107, var8.field6233, var13 << 24 | this.field833.field1182), class425.method2539(105, var8.field6229, var14 << 24 | this.field833.field1182), class425.method2539(119, var8.field6239, var16 << 24 | this.field833.field1182));
                            }
                        } else if (var8.field6231 >= 0) {
                            arg3.method1666(var32, var36, var44, var30, var34, var42, var8.field6233, var8.field6229, var8.field6239, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field6231);
                        } else {
                            arg3.method1664(var32, var36, var44, var30, var34, var42, var8.field6233, var8.field6229, var8.field6239);
                        }
                        arg3.field3922 = 0;
                        return;
                    }
                    arg3.method1663(var32, var36, var44, var30, var34, var42, this.field833.field1182);
                }
            }
        } else {
            class442 var64 = this.field835[arg0][arg1];
            if (var64 != null) {
                if (this.field846 == -1) {
                    for (int var65 = 0; var65 < var64.field6368; ++var65) {
                        int var66 = (arg0 << super.field126) + var64.field6371[var65];
                        int var67 = var64.field6366[var65];
                        int var68 = (arg1 << super.field126) + var64.field6374[var65];
                        int var69 = (this.field850 * var68 + this.field841 * var67 + this.field837 * var66 >> 15) + this.field851;
                        if (var69 <= this.field833.field1202) {
                            return;
                        }
                        arg6[var65] = 0;
                        if (arg2) {
                            int var70 = var69 - this.field833.field1189;
                            if (var70 > 255) {
                                var70 = 255;
                            }
                            if (var70 > 0) {
                                arg6[var65] = var70;
                                int var71 = var64.field6369[var65] * var70 / 255;
                                if (var71 > 0) {
                                    var67 -= var71;
                                }
                            }
                        } else if (this.field833.field1195) {
                            int var72 = var69 - this.field833.field1189;
                            if (var72 > 0) {
                                arg6[var65] = var72;
                                if (arg6[var65] > 255) {
                                    arg6[var65] = 255;
                                }
                            }
                        }
                        int var73 = (this.field844 * var68 + this.field852 * var67 + this.field836 * var66 >> 15) + this.field832;
                        int var74 = (this.field834 * var68 + this.field848 * var66 + this.field845 * var67 >> 15) + this.field839;
                        arg4[var65] = this.field833.field1186 * var73 / var69 + arg3.field3918;
                        arg5[var65] = this.field833.field1184 * var74 / var69 + arg3.field3917;
                    }
                } else {
                    for (int var75 = 0; var75 < var64.field6368; ++var75) {
                        int var115 = (arg0 << super.field126) + var64.field6371[var75];
                        int var116 = var64.field6366[var75];
                        int var117 = (arg1 << super.field126) + var64.field6374[var75];
                        arg6[var75] = 0;
                        if (arg2) {
                            int var118 = this.field846 - this.field833.field1189;
                            if (var118 > 255) {
                                var118 = 255;
                            }
                            if (var118 > 0) {
                                arg6[var75] = var118;
                                int var119 = var64.field6369[var75] * var118 / 255;
                                if (var119 > 0) {
                                    var116 -= var119;
                                }
                            }
                        } else if (this.field833.field1195) {
                            int var120 = this.field846 - this.field833.field1189;
                            if (var120 > 0) {
                                arg6[var75] = var120;
                                if (arg6[var75] > 255) {
                                    arg6[var75] = 255;
                                }
                            }
                        }
                        int var121 = (this.field844 * var117 + this.field852 * var116 + this.field836 * var115 >> 15) + this.field832;
                        int var122 = (this.field834 * var117 + this.field848 * var115 + this.field845 * var116 >> 15) + this.field839;
                        arg4[var75] = this.field833.field1186 * var121 / this.field846 + arg3.field3918;
                        arg5[var75] = this.field833.field1184 * var122 / this.field846 + arg3.field3917;
                    }
                }
                if (var64.field6373 != null) {
                    int var76 = this.field840[arg0][arg1];
                    int var77 = this.field840[arg0 + 1][arg1];
                    int var78 = this.field840[arg0][arg1 + 1];
                    int var79 = super.field121 * arg0;
                    int var80 = super.field121 + var79;
                    int var81 = super.field121 * arg1;
                    int var82 = super.field121 + var81;
                    int var83 = (this.field844 * var81 + this.field852 * var76 + this.field836 * var79 >> 15) + this.field832;
                    int var84 = (this.field834 * var81 + this.field848 * var79 + this.field845 * var76 >> 15) + this.field839;
                    int var85 = (this.field850 * var81 + this.field841 * var76 + this.field837 * var79 >> 15) + this.field851;
                    int var86 = (this.field844 * var81 + this.field852 * var77 + this.field836 * var80 >> 15) + this.field832;
                    int var87 = (this.field834 * var81 + this.field848 * var80 + this.field845 * var77 >> 15) + this.field839;
                    int var88 = (this.field850 * var81 + this.field841 * var77 + this.field837 * var80 >> 15) + this.field851;
                    int var89 = (this.field844 * var82 + this.field852 * var78 + this.field836 * var79 >> 15) + this.field832;
                    int var90 = (this.field834 * var82 + this.field848 * var79 + this.field845 * var78 >> 15) + this.field839;
                    int var91 = (this.field850 * var82 + this.field841 * var78 + this.field837 * var79 >> 15) + this.field851;
                    for (int var92 = 0; var92 < var64.field6370; ++var92) {
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
                            arg3.field3914 = var96 < 0 || var97 < 0 || var98 < 0 || var96 > arg3.field3920 || var97 > arg3.field3920 || var98 > arg3.field3920;
                            short var103 = var64.field6373[var92];
                            if (var102 < 765) {
                                if (var103 != -1 && this.method381(this.field833.field3988.method914(false, var103).field3382)) {
                                    arg3.field3922 = 100;
                                }
                                if (var102 > 0) {
                                    if (var103 != -1) {
                                        arg3.method1665(var99, var100, var101, var96, var97, var98, this.field833.field1182, arg6[var93], arg6[var94], arg6[var95], var64.field6367[var93], var64.field6367[var94], var64.field6367[var95], var83, var86, var89, var84, var87, var90, var85, var88, var91, var103);
                                    } else if ((var64.field6367[var93] & 16777215) != 0) {
                                        arg3.method1664(var99, var100, var101, var96, var97, var98, class425.method2539(119, var64.field6367[var93], arg6[var93] << 24 | this.field833.field1182), class425.method2539(69, var64.field6367[var94], arg6[var94] << 24 | this.field833.field1182), class425.method2539(60, var64.field6367[var95], arg6[var95] << 24 | this.field833.field1182));
                                    }
                                } else if (var103 != -1) {
                                    arg3.method1666(var99, var100, var101, var96, var97, var98, var64.field6367[var93], var64.field6367[var94], var64.field6367[var95], var83, var86, var89, var84, var87, var90, var85, var88, var91, var103);
                                } else if ((var64.field6367[var93] & 16777215) != 0) {
                                    arg3.method1664(var99, var100, var101, var96, var97, var98, var64.field6367[var93], var64.field6367[var94], var64.field6367[var95]);
                                }
                                arg3.field3922 = 0;
                            } else {
                                arg3.method1663(var99, var100, var101, var96, var97, var98, this.field833.field1182);
                            }
                        }
                    }
                    return;
                }
                for (int var104 = 0; var104 < var64.field6370; ++var104) {
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
                        arg3.field3914 = var108 < 0 || var109 < 0 || var110 < 0 || var108 > arg3.field3920 || var109 > arg3.field3920 || var110 > arg3.field3920;
                        if (var114 < 765) {
                            if (var114 > 0) {
                                if ((var64.field6367[var105] & 16777215) != 0) {
                                    arg3.method1664(var111, var112, var113, var108, var109, var110, class531.method3151(arg6[var105], 196579528, var64.field6367[var105], this.field833.field1182), class531.method3151(arg6[var106], 196579528, var64.field6367[var106], this.field833.field1182), class531.method3151(arg6[var107], 196579528, var64.field6367[var107], this.field833.field1182));
                                }
                            } else if ((var64.field6367[var105] & 16777215) != 0) {
                                arg3.method1664(var111, var112, var113, var108, var109, var110, var64.field6367[var105], var64.field6367[var106], var64.field6367[var107]);
                            }
                        } else {
                            arg3.method1663(var111, var112, var113, var108, var109, var110, this.field833.field1182);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(III[[ZZ)V", line = 720)
    public final void method82(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        class393 var6 = this.field833.field1209;
        this.field846 = -1;
        this.field836 = var6.field5674;
        this.field852 = var6.field5673;
        this.field844 = var6.field5668;
        this.field832 = var6.field5675;
        this.field848 = var6.field5679;
        this.field845 = var6.field5677;
        this.field834 = var6.field5669;
        this.field839 = var6.field5672;
        this.field837 = var6.field5671;
        this.field841 = var6.field5670;
        this.field850 = var6.field5678;
        this.field851 = var6.field5676;
    }

    @OriginalMember(owner = "client!mq", name = "H", descriptor = "(Li;IIIIZ)V", line = 735)
    public final void method84(class197 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "(I)Z", line = 738)
    private final boolean method381(int arg0) {
        if ((this.field843 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else if (arg0 == 8) {
            return true;
        } else {
            return arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIIIIII[[ZLhp;[I[I)V", line = 755)
    private final void method382(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class289 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field3912 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field849[var16][var17] != null) {
                        class430 var18 = this.field849[var16][var17];
                        if (var18.field6231 != -1 && (var18.field6232 & 2) == 0 && var18.field6238 == 0) {
                            int var19 = this.field833.method643(var18.field6231);
                            arg8.method1668(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class320.method1902((byte) -115, var19, var18.field6230), class320.method1902((byte) -115, var19, var18.field6239), class320.method1902((byte) -115, var19, var18.field6229));
                            arg8.method1668(var15, var15, var15 - var13, var14, var13 + var14, var14, class320.method1902((byte) -115, var19, var18.field6233), class320.method1902((byte) -115, var19, var18.field6229), class320.method1902((byte) -115, var19, var18.field6239));
                        } else if (var18.field6238 == 0) {
                            arg8.method1664(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field6230, var18.field6239, var18.field6229);
                            arg8.method1664(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field6233, var18.field6229, var18.field6239);
                        } else {
                            int var20 = var18.field6238;
                            arg8.method1664(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class425.method2539(103, var20, var18.field6230 & -16777216), class425.method2539(72, var20, var18.field6239 & -16777216), class425.method2539(110, var20, var18.field6229 & -16777216));
                            arg8.method1664(var15, var15, var15 - var13, var14, var13 + var14, var14, class425.method2539(103, var20, var18.field6233 & -16777216), class425.method2539(79, var20, var18.field6229 & -16777216), class425.method2539(107, var20, var18.field6239 & -16777216));
                        }
                    } else if (this.field835[var16][var17] != null) {
                        class442 var21 = this.field835[var16][var17];
                        for (int var22 = 0; var22 < var21.field6368; ++var22) {
                            arg9[var22] = var21.field6371[var22] * var13 / super.field121 + var14;
                            arg10[var22] = var15 - var21.field6374[var22] * var13 / super.field121;
                        }
                        for (int var23 = 0; var23 < var21.field6370; ++var23) {
                            int var24 = var23 * 3;
                            int var25 = var24 + 1;
                            int var26 = var25 + 1;
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field6365 != null && var21.field6365[var23] != 0 && (var21.field6373 == null || var21.field6373 != null && var21.field6373[var23] == -1)) {
                                int var33 = var21.field6365[var23];
                                arg8.method1664(var30, var31, var32, var27, var28, var29, class425.method2539(110, var33, -16777216 - (var21.field6367[var24] & -16777216)), class425.method2539(101, var33, -16777216 - (var21.field6367[var25] & -16777216)), class425.method2539(95, var33, -16777216 - (var21.field6367[var26] & -16777216)));
                            } else if (var21.field6373 != null && var21.field6373[var23] != -1) {
                                int var34 = this.field833.method643(var21.field6373[var23]);
                                arg8.method1668(var30, var31, var32, var27, var28, var29, var34, var34, var34);
                            } else {
                                arg8.method1664(var30, var31, var32, var27, var28, var29, var21.field6367[var24], var21.field6367[var25], var21.field6367[var26]);
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field3912 = true;
    }

    @OriginalMember(owner = "client!mq", name = "aa", descriptor = "()V", line = 883)
    public final void method81() {
        this.field853 = null;
        this.field842 = null;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lsa;[I)V", line = 886)
    public final void method75(class447 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!mq", name = "ca", descriptor = "(II)I", line = 892)
    public final int method79(int arg0, int arg1) {
        int var3 = arg0 >> super.field126;
        int var4 = arg1 >> super.field126;
        if (var3 >= 0 && var4 >= 0 && var3 <= super.field125 - 1 && var4 <= super.field124 - 1) {
            int var5 = arg0 & super.field121 - 1;
            int var6 = arg1 & super.field121 - 1;
            int var7 = (super.field121 - var5) * this.field840[var3][var4] + this.field840[var3 + 1][var4] * var5 >> super.field126;
            int var8 = (super.field121 - var5) * this.field840[var3][var4 + 1] + this.field840[var3 + 1][var4 + 1] * var5 >> super.field126;
            return (super.field121 - var6) * var7 + var6 * var8 >> super.field126;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 909)
    public final void method76(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field838 == null) {
            this.field838 = new class456[super.field125][super.field124];
            this.field847 = new class335[super.field125][super.field124];
        } else if (this.field849 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && super.field121 != var20 || var21 != 0 && super.field121 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class335 var22 = new class335();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field4892 = var23;
            var22.field4893 = new short[var23];
            var22.field4886 = new short[var23];
            var22.field4894 = new short[var23];
            var22.field4885 = new short[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var30 = arg2[var25];
                int var31 = arg4[var25];
                if (var30 == 0 && var31 == 0) {
                    var22.field4893[var25] = (short) (this.field853[arg0][arg1] - this.field842[arg0][arg1]);
                } else if (var30 == 0 && super.field121 == var31) {
                    var22.field4893[var25] = (short) (this.field853[arg0][arg1 + 1] - this.field842[arg0][arg1 + 1]);
                } else if (super.field121 == var30 && super.field121 == var31) {
                    var22.field4893[var25] = (short) (this.field853[arg0 + 1][arg1 + 1] - this.field842[arg0 + 1][arg1 + 1]);
                } else if (super.field121 == var30 && var31 == 0) {
                    var22.field4893[var25] = (short) (this.field853[arg0 + 1][arg1] - this.field842[arg0 + 1][arg1]);
                } else {
                    int var32 = (this.field853[arg0 + 1][arg1] - this.field842[arg0 + 1][arg1]) * var30 + (this.field853[arg0][arg1] - this.field842[arg0][arg1]) * (super.field121 - var30);
                    int var33 = (this.field853[arg0 + 1][arg1 + 1] - this.field842[arg0 + 1][arg1 + 1]) * var30 + (this.field853[arg0][arg1 + 1] - this.field842[arg0][arg1 + 1]) * (super.field121 - var30);
                    var22.field4893[var25] = (short) ((super.field121 - var31) * var32 + var31 * var33 >> super.field126 * 2);
                }
                int var34 = (arg0 << super.field126) + var30;
                int var35 = (arg1 << super.field126) + var31;
                var22.field4886[var25] = (short) var30;
                var22.field4885[var25] = (short) var31;
                var22.field4894[var25] = (short) (this.method79(var34, var35) + (arg3 != null ? arg3[var25] : 0));
                if (var22.field4893[var25] < 2) {
                    var22.field4893[var25] = 2;
                }
            }
            boolean var26 = false;
            int var27 = 0;
            for (int var28 = 0; var28 < var24; ++var28) {
                if (arg9[var28] >= 0 || arg10 != null && arg10[var28] >= 0) {
                    ++var27;
                }
                if (arg11[var28] != -1 && !this.field833.field3988.method914(false, arg11[var28]).field3391) {
                    var26 = true;
                }
            }
            var22.field4887 = new int[var27];
            if (arg10 != null) {
                var22.field4884 = new int[var27];
            }
            var22.field4882 = new short[var27];
            var22.field4890 = new short[var27];
            var22.field4889 = new short[var27];
            if (var26) {
                var22.field4891 = new short[var27];
                var22.field4883 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field4887[var22.field4888] = class156.method1123(arg9[var29], -90);
                    } else {
                        var22.field4887[var22.field4888] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field4884[var22.field4888] = class156.method1123(arg10[var29], -98);
                        } else {
                            var22.field4884[var22.field4888] = -1;
                        }
                    }
                    var22.field4882[var22.field4888] = (short) arg6[var29];
                    var22.field4890[var22.field4888] = (short) arg7[var29];
                    var22.field4889[var22.field4888] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field833.field3988.method914(false, arg11[var29]).field3391) {
                            var22.field4891[var22.field4888] = (short) arg11[var29];
                            var22.field4883[var22.field4888] = (short) arg12[var29];
                        } else {
                            var22.field4891[var22.field4888] = -1;
                        }
                    }
                    ++var22.field4888;
                }
            }
            this.field847[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class456 var36 = new class456();
                int var37 = arg9[0];
                int var38 = arg11[0];
                if (arg10 != null) {
                    var36.field6653 = class320.method1902((byte) -115, class156.method1123(arg10[0], -127), this.field853[arg0][arg1] - this.field842[arg0][arg1]);
                    if (var37 == -1) {
                        var36.field6650 = (byte) (var36.field6650 | 2);
                    }
                }
                if (this.field840[arg0 + 1][arg1] == this.field840[arg0][arg1] && this.field840[arg0 + 1][arg1 + 1] == this.field840[arg0][arg1] && this.field840[arg0][arg1 + 1] == this.field840[arg0][arg1]) {
                    var36.field6650 = (byte) (var36.field6650 | 1);
                }
                if (var38 != -1 && (var36.field6650 & 2) == 0 && !this.field833.field3988.method914(false, var38).field3391) {
                    var36.field6648 = (short) (this.field853[arg0][arg1] - this.field842[arg0][arg1]);
                    var36.field6654 = (short) (this.field853[arg0 + 1][arg1] - this.field842[arg0 + 1][arg1]);
                    var36.field6652 = (short) (this.field853[arg0 + 1][arg1 + 1] - this.field842[arg0 + 1][arg1 + 1]);
                    var36.field6649 = (short) (this.field853[arg0][arg1 + 1] - this.field842[arg0][arg1 + 1]);
                    var36.field6651 = (short) var38;
                } else {
                    short var39 = class156.method1123(var37, -84);
                    var36.field6648 = (short) class320.method1902((byte) -115, var39, this.field853[arg0][arg1] - this.field842[arg0][arg1]);
                    var36.field6654 = (short) class320.method1902((byte) -115, var39, this.field853[arg0 + 1][arg1] - this.field842[arg0 + 1][arg1]);
                    var36.field6652 = (short) class320.method1902((byte) -115, var39, this.field853[arg0 + 1][arg1 + 1] - this.field842[arg0 + 1][arg1 + 1]);
                    var36.field6649 = (short) class320.method1902((byte) -115, var39, this.field853[arg0][arg1 + 1] - this.field842[arg0][arg1 + 1]);
                    var36.field6651 = -1;
                }
                this.field838[arg0][arg1] = var36;
            }
        }
    }

    @OriginalMember(owner = "client!mq", name = "ua", descriptor = "(II)I", line = 1140)
    public final int method85(int arg0, int arg1) {
        return this.field840[arg0][arg1];
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(Li;IIIIZ)Z", line = 1153)
    public final boolean method74(class197 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!mq", name = "pa", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 1156)
    public final void method78(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (this.field849 == null) {
            this.field849 = new class430[super.field125][super.field124];
            this.field835 = new class442[super.field125][super.field124];
        } else if (this.field838 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var15 = 0; var15 < arg6.length; ++var15) {
                if (arg6[var15] == -1) {
                    arg6[var15] = 0;
                } else {
                    arg6[var15] = class188.field2769[class156.method1123(arg6[var15], -98) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var16 = 0; var16 < arg7.length; ++var16) {
                    if (arg7[var16] == -1) {
                        arg7[var16] = 0;
                    } else {
                        arg7[var16] = class188.field2769[class156.method1123(arg7[var16], -89) & 65535] << 8 | 255;
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
                    } else if (arg2[var22] == super.field121 && arg4[var22] == 0) {
                        if (var19 != -1 && arg6[var19] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var19 = var22;
                    } else if (arg2[var22] == super.field121 && arg4[var22] == super.field121) {
                        if (var20 != -1 && arg6[var20] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var20 = var22;
                    } else if (arg2[var22] == 0 && arg4[var22] == super.field121) {
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
                            if (arg2[var24] != arg2[0] && arg2[0] + super.field121 != arg2[var24] && arg2[0] - super.field121 != arg2[var24]) {
                                var17 = false;
                                break;
                            }
                            if (arg4[var24] != arg4[0] && arg4[0] + super.field121 != arg4[var24] && arg4[0] - super.field121 != arg4[var24]) {
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
                class430 var25 = new class430();
                int var26 = arg6[0];
                int var27 = arg8[0];
                if (arg7 != null) {
                    var25.field6238 = arg7[0] >> 8;
                    if (var26 == 0) {
                        var25.field6232 = (byte) (var25.field6232 | 2);
                    }
                } else if (var26 == 0) {
                    return;
                }
                if (this.field840[arg0 + 1][arg1] == this.field840[arg0][arg1] && this.field840[arg0 + 1][arg1 + 1] == this.field840[arg0][arg1] && this.field840[arg0][arg1 + 1] == this.field840[arg0][arg1]) {
                    var25.field6232 = (byte) (var25.field6232 | 1);
                }
                if (var27 != -1 && (var25.field6232 & 2) == 0 && !this.field833.field3988.method914(false, var27).field3391) {
                    var25.field6233 = this.field853[arg0][arg1] - this.field842[arg0][arg1];
                    var25.field6229 = this.field853[arg0 + 1][arg1] - this.field842[arg0 + 1][arg1];
                    var25.field6230 = this.field853[arg0 + 1][arg1 + 1] - this.field842[arg0 + 1][arg1 + 1];
                    var25.field6239 = this.field853[arg0][arg1 + 1] - this.field842[arg0][arg1 + 1];
                    var25.field6231 = (short) var27;
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
                    var25.field6233 = class531.method3151(var28, 196579528, method385(arg6[var18] >> 8, this.field853[arg0][arg1] - this.field842[arg0][arg1]), arg10);
                    if (var25.field6238 != 0) {
                        var25.field6233 |= 255 - (this.field853[arg0][arg1] - this.field842[arg0][arg1]) << 25;
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
                    var25.field6229 = class531.method3151(var29, 196579528, method385(arg6[var19] >> 8, this.field853[arg0 + 1][arg1] - this.field842[arg0 + 1][arg1]), arg10);
                    if (var25.field6238 != 0) {
                        var25.field6229 |= 255 - (this.field853[arg0 + 1][arg1] - this.field842[arg0 + 1][arg1]) << 25;
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
                    var25.field6230 = class531.method3151(var30, 196579528, method385(arg6[var20] >> 8, this.field853[arg0 + 1][arg1 + 1] - this.field842[arg0 + 1][arg1 + 1]), arg10);
                    if (var25.field6238 != 0) {
                        var25.field6230 |= 255 - (this.field853[arg0 + 1][arg1 + 1] - this.field842[arg0 + 1][arg1 + 1]) << 25;
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
                    var25.field6239 = class531.method3151(var31, 196579528, method385(arg6[var21] >> 8, this.field853[arg0][arg1 + 1] - this.field842[arg0][arg1 + 1]), arg10);
                    if (var25.field6238 != 0) {
                        var25.field6239 |= 255 - (this.field853[arg0][arg1 + 1] - this.field842[arg0][arg1 + 1]) << 25;
                    }
                    var25.field6231 = -1;
                }
                if (arg5 != null) {
                    var25.field6237 = (short) arg5[var20];
                    var25.field6236 = (short) arg5[var21];
                    var25.field6235 = (short) arg5[var19];
                    var25.field6234 = (short) arg5[var18];
                }
                this.field849[arg0][arg1] = var25;
            } else {
                class442 var32 = new class442();
                var32.field6368 = (short) arg2.length;
                var32.field6370 = (short) (arg2.length / 3);
                var32.field6371 = new short[var32.field6368];
                var32.field6366 = new short[var32.field6368];
                var32.field6374 = new short[var32.field6368];
                var32.field6367 = new int[var32.field6368];
                if (arg5 != null) {
                    var32.field6369 = new short[var32.field6368];
                }
                for (int var33 = 0; var33 < var32.field6368; ++var33) {
                    int var48 = arg2[var33];
                    int var49 = arg4[var33];
                    boolean var50 = false;
                    int var51;
                    if (var48 == 0 && var49 == 0) {
                        var51 = this.field853[arg0][arg1] - this.field842[arg0][arg1];
                    } else if (var48 == 0 && super.field121 == var49) {
                        var51 = this.field853[arg0][arg1 + 1] - this.field842[arg0][arg1 + 1];
                    } else if (super.field121 == var48 && super.field121 == var49) {
                        var51 = this.field853[arg0 + 1][arg1 + 1] - this.field842[arg0 + 1][arg1 + 1];
                    } else if (super.field121 == var48 && var49 == 0) {
                        var51 = this.field853[arg0 + 1][arg1] - this.field842[arg0 + 1][arg1];
                    } else {
                        int var52 = (this.field853[arg0 + 1][arg1] - this.field842[arg0 + 1][arg1]) * var48 + (this.field853[arg0][arg1] - this.field842[arg0][arg1]) * (super.field121 - var48);
                        int var53 = (this.field853[arg0 + 1][arg1 + 1] - this.field842[arg0 + 1][arg1 + 1]) * var48 + (this.field853[arg0][arg1 + 1] - this.field842[arg0][arg1 + 1]) * (super.field121 - var48);
                        var51 = (super.field121 - var49) * var52 + var49 * var53 >> super.field126 * 2;
                    }
                    int var54 = (arg0 << super.field126) + var48;
                    int var55 = (arg1 << super.field126) + var49;
                    var32.field6371[var33] = (short) var48;
                    var32.field6374[var33] = (short) var49;
                    var32.field6366[var33] = (short) (this.method79(var54, var55) + (arg3 != null ? arg3[var33] : 0));
                    if (var51 < 0) {
                        var51 = 0;
                    }
                    if (arg8[var33] != -1 && !this.field833.field3988.method914(false, arg8[var33]).field3391) {
                        var32.field6367[var33] = var51;
                    } else if (arg6[var33] == 0) {
                        if (arg7 != null) {
                            var32.field6367[var33] = var51 << 25;
                        } else {
                            var32.field6367[var33] = 0;
                        }
                    } else {
                        int var56 = 0;
                        if (arg5 != null) {
                            short var57 = var32.field6369[var33] = (short) arg5[var33];
                            if (arg11 != 0) {
                                var56 = var57 * 255 / arg11;
                                if (var56 < 0) {
                                    var56 = 0;
                                } else if (var56 > 255) {
                                    var56 = 255;
                                }
                            }
                        }
                        var32.field6367[var33] = class531.method3151(var56, 196579528, method385(arg6[var33] >> 8, var51), arg10);
                        if (arg7 != null) {
                            var32.field6367[var33] |= var51 << 25;
                        }
                    }
                }
                boolean var34 = false;
                for (int var35 = 0; var35 < var32.field6370; ++var35) {
                    if (arg8[var35 * 3] != -1 && !this.field833.field3988.method914(false, arg8[var35 * 3]).field3391) {
                        var34 = true;
                    }
                }
                if (arg7 != null) {
                    var32.field6365 = new int[var32.field6370];
                }
                if (var34) {
                    var32.field6373 = new short[var32.field6370];
                    var32.field6372 = new short[var32.field6370];
                }
                for (int var36 = 0; var36 < var32.field6370; ++var36) {
                    int var37 = var36 * 3;
                    if (arg7 != null && arg7[var37] != 0) {
                        var32.field6365[var36] = arg7[var37] >> 8;
                    }
                    if (var34) {
                        int var38 = var37 + 1;
                        int var39 = var38 + 1;
                        boolean var40 = false;
                        boolean var41 = true;
                        int var42 = arg8[var37];
                        if (var42 != -1 && !this.field833.field3988.method914(false, var42).field3391) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var43 = arg8[var38];
                        if (var43 != -1 && !this.field833.field3988.method914(false, var43).field3391) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var44 = arg8[var39];
                        if (var44 != -1 && !this.field833.field3988.method914(false, var44).field3391) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        if (var41) {
                            var32.field6373[var36] = (short) var44;
                            var32.field6372[var36] = (short) arg9[var37];
                        } else {
                            if (var40) {
                                int var45 = arg8[var37];
                                if (var45 != -1 && !this.field833.field3988.method914(false, var45).field3391) {
                                    var32.field6367[var37] = class188.field2769[class156.method1123(this.field833.field3988.method914(false, var45).field3377 & 65535, -100) & 65535];
                                }
                                int var46 = arg8[var38];
                                if (var46 != -1 && !this.field833.field3988.method914(false, var46).field3391) {
                                    var32.field6367[var38] = class188.field2769[class156.method1123(this.field833.field3988.method914(false, var46).field3377 & 65535, -107) & 65535];
                                }
                                int var47 = arg8[var39];
                                if (var47 != -1 && !this.field833.field3988.method914(false, var47).field3391) {
                                    var32.field6367[var39] = class188.field2769[class156.method1123(this.field833.field3988.method914(false, var47).field3377 & 65535, -114) & 65535];
                                }
                            }
                            var32.field6373[var36] = -1;
                        }
                    }
                }
                this.field835[arg0][arg1] = var32;
            }
        }
    }

    @OriginalMember(owner = "client!mq", name = "qa", descriptor = "(III)V", line = 1653)
    public final void method77(int arg0, int arg1, int arg2) {
        if (this.field842[arg0][arg1] < arg2) {
            this.field842[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IILhp;[I[I[I)V", line = 1659)
    private final void method383(int arg0, int arg1, class289 arg2, int[] arg3, int[] arg4, int[] arg5) {
        class456 var7 = this.field838[arg0][arg1];
        if (var7 != null) {
            if ((var7.field6650 & 2) == 0) {
                int var8 = super.field121 * arg0;
                int var9 = super.field121 + var8;
                int var10 = super.field121 * arg1;
                int var11 = super.field121 + var10;
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
                if ((var7.field6650 & 1) != 0) {
                    int var12 = this.field840[arg0][arg1];
                    int var16;
                    if (this.field846 == -1) {
                        int var13 = this.field841 * var12;
                        var14 = (this.field850 * var10 + this.field837 * var8 + var13 >> 15) + this.field851;
                        if (var14 <= this.field833.field1202) {
                            return;
                        }
                        var15 = (this.field850 * var10 + this.field837 * var9 + var13 >> 15) + this.field851;
                        if (var15 <= this.field833.field1202) {
                            return;
                        }
                        var16 = (this.field850 * var11 + this.field837 * var9 + var13 >> 15) + this.field851;
                        if (var16 <= this.field833.field1202) {
                            return;
                        }
                        var17 = (this.field850 * var11 + this.field837 * var8 + var13 >> 15) + this.field851;
                        if (var17 <= this.field833.field1202) {
                            return;
                        }
                    } else {
                        var17 = this.field846;
                        var16 = this.field846;
                        var15 = this.field846;
                        var14 = this.field846;
                    }
                    int var18 = this.field852 * var12;
                    int var19 = this.field845 * var12;
                    var20 = (this.field844 * var10 + this.field836 * var8 + var18 >> 15) + this.field832;
                    var21 = this.field833.field1186 * var20 / var14 + arg2.field3918;
                    var22 = (this.field834 * var10 + this.field848 * var8 + var19 >> 15) + this.field839;
                    var23 = this.field833.field1184 * var22 / var14 + arg2.field3917;
                    var24 = (this.field844 * var10 + this.field836 * var9 + var18 >> 15) + this.field832;
                    var25 = this.field833.field1186 * var24 / var15 + arg2.field3918;
                    var26 = (this.field834 * var10 + this.field848 * var9 + var19 >> 15) + this.field839;
                    var27 = this.field833.field1184 * var26 / var15 + arg2.field3917;
                    int var28 = (this.field844 * var11 + this.field836 * var9 + var18 >> 15) + this.field832;
                    var29 = this.field833.field1186 * var28 / var16 + arg2.field3918;
                    int var30 = (this.field834 * var11 + this.field848 * var9 + var19 >> 15) + this.field839;
                    var31 = this.field833.field1184 * var30 / var16 + arg2.field3917;
                    var32 = (this.field844 * var11 + this.field836 * var8 + var18 >> 15) + this.field832;
                    var33 = this.field833.field1186 * var32 / var17 + arg2.field3918;
                    var34 = (this.field834 * var11 + this.field848 * var8 + var19 >> 15) + this.field839;
                    var35 = this.field833.field1184 * var34 / var17 + arg2.field3917;
                } else {
                    int var36 = this.field840[arg0][arg1];
                    int var37 = this.field840[arg0 + 1][arg1];
                    int var38 = this.field840[arg0 + 1][arg1 + 1];
                    int var39 = this.field840[arg0][arg1 + 1];
                    int var40;
                    if (this.field846 == -1) {
                        var14 = (this.field850 * var10 + this.field841 * var36 + this.field837 * var8 >> 15) + this.field851;
                        if (var14 <= this.field833.field1202) {
                            return;
                        }
                        var15 = (this.field850 * var10 + this.field841 * var37 + this.field837 * var9 >> 15) + this.field851;
                        if (var15 <= this.field833.field1202) {
                            return;
                        }
                        var40 = (this.field850 * var11 + this.field841 * var38 + this.field837 * var9 >> 15) + this.field851;
                        if (var40 <= this.field833.field1202) {
                            return;
                        }
                        var17 = (this.field850 * var11 + this.field841 * var39 + this.field837 * var8 >> 15) + this.field851;
                        if (var17 <= this.field833.field1202) {
                            return;
                        }
                    } else {
                        var17 = this.field846;
                        var40 = this.field846;
                        var15 = this.field846;
                        var14 = this.field846;
                    }
                    var20 = (this.field844 * var10 + this.field852 * var36 + this.field836 * var8 >> 15) + this.field832;
                    var21 = this.field833.field1186 * var20 / var14 + arg2.field3918;
                    var22 = (this.field834 * var10 + this.field848 * var8 + this.field845 * var36 >> 15) + this.field839;
                    var23 = this.field833.field1184 * var22 / var14 + arg2.field3917;
                    var24 = (this.field844 * var10 + this.field852 * var37 + this.field836 * var9 >> 15) + this.field832;
                    var25 = this.field833.field1186 * var24 / var15 + arg2.field3918;
                    var26 = (this.field834 * var10 + this.field848 * var9 + this.field845 * var37 >> 15) + this.field839;
                    var27 = this.field833.field1184 * var26 / var15 + arg2.field3917;
                    int var41 = (this.field844 * var11 + this.field852 * var38 + this.field836 * var9 >> 15) + this.field832;
                    var29 = this.field833.field1186 * var41 / var40 + arg2.field3918;
                    int var42 = (this.field834 * var11 + this.field848 * var9 + this.field845 * var38 >> 15) + this.field839;
                    var31 = this.field833.field1184 * var42 / var40 + arg2.field3917;
                    var32 = (this.field844 * var11 + this.field852 * var39 + this.field836 * var8 >> 15) + this.field832;
                    var33 = this.field833.field1186 * var32 / var17 + arg2.field3918;
                    var34 = (this.field834 * var11 + this.field848 * var8 + this.field845 * var39 >> 15) + this.field839;
                    var35 = this.field833.field1184 * var34 / var17 + arg2.field3917;
                }
                if ((var27 - var35) * (var29 - var33) - (var25 - var33) * (var31 - var35) > 0) {
                    arg2.field3914 = var29 < 0 || var33 < 0 || var25 < 0 || var29 > arg2.field3920 || var33 > arg2.field3920 || var25 > arg2.field3920;
                    if (var7.field6651 >= 0) {
                        if (this.method381(this.field833.field3988.method914(false, var7.field6651).field3382)) {
                            arg2.field3922 = 100;
                        }
                        arg2.method1666(var31, var35, var27, var29, var33, var25, var7.field6652 & 65535, var7.field6649 & 65535, var7.field6654 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field6651);
                        arg2.field3922 = 0;
                    } else {
                        arg2.method1668(var31, var35, var27, var29, var33, var25, var7.field6652 & 65535, var7.field6649 & 65535, var7.field6654 & 65535);
                    }
                }
                if ((var21 - var25) * (var35 - var27) - (var23 - var27) * (var33 - var25) > 0) {
                    arg2.field3914 = var21 < 0 || var25 < 0 || var33 < 0 || var21 > arg2.field3920 || var25 > arg2.field3920 || var33 > arg2.field3920;
                    if (var7.field6651 >= 0) {
                        if (this.method381(this.field833.field3988.method914(false, var7.field6651).field3382)) {
                            arg2.field3922 = 100;
                        }
                        arg2.method1666(var23, var27, var35, var21, var25, var33, var7.field6648 & 65535, var7.field6654 & 65535, var7.field6649 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field6651);
                        arg2.field3922 = 0;
                        return;
                    }
                    arg2.method1668(var23, var27, var35, var21, var25, var33, var7.field6648 & 65535, var7.field6654 & 65535, var7.field6649 & 65535);
                }
            }
        } else {
            class335 var43 = this.field847[arg0][arg1];
            if (var43 != null) {
                if (this.field846 == -1) {
                    for (int var44 = 0; var44 < var43.field4892; ++var44) {
                        int var45 = (arg0 << super.field126) + var43.field4886[var44];
                        short var46 = var43.field4894[var44];
                        int var47 = (arg1 << super.field126) + var43.field4885[var44];
                        int var48 = (this.field850 * var47 + this.field841 * var46 + this.field837 * var45 >> 15) + this.field851;
                        if (var48 <= this.field833.field1202) {
                            return;
                        }
                        int var49 = (this.field844 * var47 + this.field852 * var46 + this.field836 * var45 >> 15) + this.field832;
                        int var50 = (this.field834 * var47 + this.field848 * var45 + this.field845 * var46 >> 15) + this.field839;
                        arg3[var44] = this.field833.field1186 * var49 / var48 + arg2.field3918;
                        arg4[var44] = this.field833.field1184 * var50 / var48 + arg2.field3917;
                    }
                } else {
                    for (int var51 = 0; var51 < var43.field4892; ++var51) {
                        int var91 = (arg0 << super.field126) + var43.field4886[var51];
                        short var92 = var43.field4894[var51];
                        int var93 = (arg1 << super.field126) + var43.field4885[var51];
                        int var94 = (this.field844 * var93 + this.field852 * var92 + this.field836 * var91 >> 15) + this.field832;
                        int var95 = (this.field834 * var93 + this.field848 * var91 + this.field845 * var92 >> 15) + this.field839;
                        arg3[var51] = this.field833.field1186 * var94 / this.field846 + arg2.field3918;
                        arg4[var51] = this.field833.field1184 * var95 / this.field846 + arg2.field3917;
                    }
                }
                if (var43.field4891 != null) {
                    int var52 = this.field840[arg0][arg1];
                    int var53 = this.field840[arg0 + 1][arg1];
                    int var54 = this.field840[arg0][arg1 + 1];
                    int var55 = super.field121 * arg0;
                    int var56 = super.field121 + var55;
                    int var57 = super.field121 * arg1;
                    int var58 = super.field121 + var57;
                    int var59 = (this.field844 * var57 + this.field852 * var52 + this.field836 * var55 >> 15) + this.field832;
                    int var60 = (this.field834 * var57 + this.field848 * var55 + this.field845 * var52 >> 15) + this.field839;
                    int var61 = (this.field850 * var57 + this.field841 * var52 + this.field837 * var55 >> 15) + this.field851;
                    int var62 = (this.field844 * var57 + this.field852 * var53 + this.field836 * var56 >> 15) + this.field832;
                    int var63 = (this.field834 * var57 + this.field848 * var56 + this.field845 * var53 >> 15) + this.field839;
                    int var64 = (this.field850 * var57 + this.field841 * var53 + this.field837 * var56 >> 15) + this.field851;
                    int var65 = (this.field844 * var58 + this.field852 * var54 + this.field836 * var55 >> 15) + this.field832;
                    int var66 = (this.field834 * var58 + this.field848 * var55 + this.field845 * var54 >> 15) + this.field839;
                    int var67 = (this.field850 * var58 + this.field841 * var54 + this.field837 * var55 >> 15) + this.field851;
                    for (int var68 = 0; var68 < var43.field4888; ++var68) {
                        short var69 = var43.field4882[var68];
                        short var70 = var43.field4890[var68];
                        short var71 = var43.field4889[var68];
                        int var72 = arg3[var69];
                        int var73 = arg3[var70];
                        int var74 = arg3[var71];
                        int var75 = arg4[var69];
                        int var76 = arg4[var70];
                        int var77 = arg4[var71];
                        if ((var72 - var73) * (var77 - var76) - (var74 - var73) * (var75 - var76) > 0) {
                            arg2.field3914 = var72 < 0 || var73 < 0 || var74 < 0 || var72 > arg2.field3920 || var73 > arg2.field3920 || var74 > arg2.field3920;
                            short var78 = var43.field4891[var68];
                            if (var78 != -1) {
                                if (this.method381(this.field833.field3988.method914(false, var78).field3382)) {
                                    arg2.field3922 = 100;
                                }
                                arg2.method1666(var75, var76, var77, var72, var73, var74, var43.field4893[var69], var43.field4893[var70], var43.field4893[var71], var59, var62, var65, var60, var63, var66, var61, var64, var67, var78);
                                arg2.field3922 = 0;
                            } else {
                                int var79 = var43.field4887[var68];
                                if (var79 != -1) {
                                    arg2.method1668(var75, var76, var77, var72, var73, var74, class320.method1902((byte) -115, var79, var43.field4893[var69]), class320.method1902((byte) -115, var79, var43.field4893[var70]), class320.method1902((byte) -115, var79, var43.field4893[var71]));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var80 = 0; var80 < var43.field4888; ++var80) {
                    short var81 = var43.field4882[var80];
                    short var82 = var43.field4890[var80];
                    short var83 = var43.field4889[var80];
                    int var84 = arg3[var81];
                    int var85 = arg3[var82];
                    int var86 = arg3[var83];
                    int var87 = arg4[var81];
                    int var88 = arg4[var82];
                    int var89 = arg4[var83];
                    if ((var84 - var85) * (var89 - var88) - (var86 - var85) * (var87 - var88) > 0) {
                        int var90 = var43.field4887[var80];
                        if (var90 != -1) {
                            arg2.field3914 = var84 < 0 || var85 < 0 || var86 < 0 || var84 > arg2.field3920 || var85 > arg2.field3920 || var86 > arg2.field3920;
                            arg2.method1668(var87, var88, var89, var84, var85, var86, class320.method1902((byte) -115, var90, var43.field4893[var81]), class320.method1902((byte) -115, var90, var43.field4893[var82]), class320.method1902((byte) -115, var90, var43.field4893[var83]));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(IIIIIII[[ZLhp;[I[I)V", line = 2014)
    private final void method384(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class289 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field3912 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field838[var16][var17] != null) {
                        class456 var18 = this.field838[var16][var17];
                        if (var18.field6651 != -1 && (var18.field6650 & 2) == 0 && var18.field6653 == -1) {
                            int var19 = this.field833.method643(var18.field6651);
                            arg8.method1668(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class320.method1902((byte) -115, var19, var18.field6652 & 65535), class320.method1902((byte) -115, var19, var18.field6649 & 65535), class320.method1902((byte) -115, var19, var18.field6654 & 65535));
                            arg8.method1668(var15, var15, var15 - var13, var14, var13 + var14, var14, class320.method1902((byte) -115, var19, var18.field6648 & 65535), class320.method1902((byte) -115, var19, var18.field6654 & 65535), class320.method1902((byte) -115, var19, var18.field6649 & 65535));
                        } else if (var18.field6653 == -1) {
                            arg8.method1668(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field6652 & 65535, var18.field6649 & 65535, var18.field6654 & 65535);
                            arg8.method1668(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field6648 & 65535, var18.field6654 & 65535, var18.field6649 & 65535);
                        } else {
                            int var20 = var18.field6653;
                            arg8.method1668(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var20, var20, var20);
                            arg8.method1668(var15, var15, var15 - var13, var14, var13 + var14, var14, var20, var20, var20);
                        }
                    } else if (this.field847[var16][var17] != null) {
                        class335 var21 = this.field847[var16][var17];
                        for (int var22 = 0; var22 < var21.field4892; ++var22) {
                            arg9[var22] = var21.field4886[var22] * var13 / super.field121 + var14;
                            arg10[var22] = var15 - var21.field4885[var22] * var13 / super.field121;
                        }
                        for (int var23 = 0; var23 < var21.field4888; ++var23) {
                            short var24 = var21.field4882[var23];
                            short var25 = var21.field4890[var23];
                            short var26 = var21.field4889[var23];
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field4884 != null && var21.field4884[var23] != -1) {
                                int var33 = var21.field4884[var23];
                                arg8.method1668(var30, var31, var32, var27, var28, var29, class320.method1902((byte) -115, var33, var21.field4893[var24]), class320.method1902((byte) -115, var33, var21.field4893[var25]), class320.method1902((byte) -115, var33, var21.field4893[var26]));
                            } else if (var21.field4891 != null && var21.field4891[var23] != -1) {
                                int var34 = this.field833.method643(var21.field4891[var23]);
                                arg8.method1668(var30, var31, var32, var27, var28, var29, class320.method1902((byte) -115, var34, var21.field4893[var24]), class320.method1902((byte) -115, var34, var21.field4893[var25]), class320.method1902((byte) -115, var34, var21.field4893[var26]));
                            } else {
                                int var35 = var21.field4887[var23];
                                arg8.method1668(var30, var31, var32, var27, var28, var29, class320.method1902((byte) -115, var35, var21.field4893[var24]), class320.method1902((byte) -115, var35, var21.field4893[var25]), class320.method1902((byte) -115, var35, var21.field4893[var26]));
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field3912 = true;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(II)V", line = 2151)
    public final void method71(int arg0, int arg1) {
        class348 var3 = this.field833.method633(Thread.currentThread());
        var3.field5003.field3922 = 0;
        if (this.field849 != null) {
            this.method380(arg0, arg1, this.field833.field1191, var3.field5003, var3.field5028, var3.field5018, var3.field5021);
        } else {
            if (this.field838 != null) {
                this.method383(arg0, arg1, var3.field5003, var3.field5028, var3.field5018, var3.field5021);
            }
        }
    }

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(II)I", line = 2163)
    private static final int method385(int arg0, int arg1) {
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
}
