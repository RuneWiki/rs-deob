import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class18 extends class43 {

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "([I[IIIIIIII)V", line = 5)
    private static final void method137(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = -arg5;
        for (int var10 = -arg6; var10 < 0; var10++) {
            for (int var11 = var9; var11 < 0; var11++) {
                int var12 = arg1[arg3] >>> 24;
                int var13 = 256 - var12;
                int var14 = arg1[arg3++];
                int var15 = arg0[arg4];
                arg0[arg4++] = ((var14 & 0xFF00FF) * var12 + (var15 & 0xFF00FF) * var13 & 0xFF00FF00) + ((var14 & 0xFF00) * var12 + (var15 & 0xFF00) * var13 & 0xFF0000) >> 8;
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIII)V", line = 37)
    public final void method138(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        int var6 = this.field1347;
        int var7 = this.field1345;
        int var8 = 0;
        int var9 = 0;
        int var10 = this.field1346;
        int var11 = this.field1344;
        int var12 = (var10 << 16) / arg2;
        int var13 = (var11 << 16) / arg3;
        if (this.field1340 > 0) {
            int var14 = ((this.field1340 << 16) + var12 - 1) / var12;
            arg0 += var14;
            var8 += var12 * var14 - (this.field1340 << 16);
        }
        if (this.field1334 > 0) {
            int var15 = ((this.field1334 << 16) + var13 - 1) / var13;
            arg1 += var15;
            var9 += var13 * var15 - (this.field1334 << 16);
        }
        if (var6 < var10) {
            arg2 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        if (var7 < var11) {
            arg3 = ((var7 << 16) + var13 - var9 - 1) / var13;
        }
        int var16 = class286.field4719 * arg1 + arg0;
        int var17 = class286.field4719 - arg2;
        if (arg1 + arg3 > class286.field4722) {
            arg3 -= arg1 + arg3 - class286.field4722;
        }
        if (arg1 < class286.field4724) {
            int var18 = class286.field4724 - arg1;
            arg3 -= var18;
            var16 += class286.field4719 * var18;
            var9 += var13 * var18;
        }
        if (arg0 + arg2 > class286.field4720) {
            int var19 = arg0 + arg2 - class286.field4720;
            arg2 -= var19;
            var17 += var19;
        }
        if (arg0 < class286.field4723) {
            int var20 = class286.field4723 - arg0;
            arg2 -= var20;
            var16 += var20;
            var8 += var12 * var20;
            var17 += var20;
        }
        method141(class286.field4718, this.field652, 0, var8, var9, var16, var17, arg2, arg3, var12, var13, var6, arg4);
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(II)V", line = 119)
    public final void method139(int arg0, int arg1) {
        int var3 = this.field1340 + arg0;
        int var4 = this.field1334 + arg1;
        int var5 = class286.field4719 * var4 + var3;
        int var6 = 0;
        int var7 = this.field1345;
        int var8 = this.field1347;
        int var9 = class286.field4719 - var8;
        int var10 = 0;
        if (var4 < class286.field4724) {
            int var11 = class286.field4724 - var4;
            var7 -= var11;
            var4 = class286.field4724;
            var6 += var8 * var11;
            var5 += class286.field4719 * var11;
        }
        if (var4 + var7 > class286.field4722) {
            var7 -= var4 + var7 - class286.field4722;
        }
        if (var3 < class286.field4723) {
            int var12 = class286.field4723 - var3;
            var8 -= var12;
            var3 = class286.field4723;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class286.field4720) {
            int var13 = var3 + var8 - class286.field4720;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method137(class286.field4718, this.field652, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "([I[IIIIIII)V", line = 175)
    private static final void method140(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = -arg5; var8 < 0; var8++) {
            int var9 = arg3 + arg4;
            while (arg3 < var9) {
                int var10 = arg1[arg2] >>> 24;
                int var11 = 256 - var10;
                int var12 = arg1[arg2++];
                int var13 = arg0[arg3];
                arg0[arg3++] = ((var12 & 0xFF00FF) * var10 + (var13 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var12 & 0xFF00) * var10 + (var13 & 0xFF00) * var11 & 0xFF0000) >> 8;
            }
            arg3 += arg6;
            arg2 += arg7;
        }
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "([I[IIIIIIIIIIII)V", line = 202)
    private static final void method141(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        int var13 = arg3;
        for (int var14 = -arg8; var14 < 0; var14++) {
            int var15 = (arg4 >> 16) * arg11;
            for (int var16 = -arg7; var16 < 0; var16++) {
                int var17 = arg1[(arg3 >> 16) + var15];
                int var18 = arg0[arg5];
                int var19 = (var17 >>> 24) - (255 - arg12);
                if (var19 < 0) {
                    var19 = 0;
                }
                int var20 = 256 - var19;
                arg0[arg5++] = ((var17 & 0xFF00FF) * var19 + (var18 & 0xFF00FF) * var20 & 0xFF00FF00) + ((var17 & 0xFF00) * var19 + (var18 & 0xFF00) * var20 & 0xFF0000) >> 8;
                arg3 += arg9;
            }
            arg4 += arg10;
            arg3 = var13;
            arg5 += arg6;
        }
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(IIIIII[I)V", line = 239)
    public class18(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "([I[IIIIIIIII)V", line = 245)
    private static final void method142(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = -arg6; var10 < 0; var10++) {
            for (int var11 = -arg5; var11 < 0; var11++) {
                int var12 = (arg1[arg3] >>> 24) - (255 - arg9);
                if (var12 < 0) {
                    var12 = 0;
                }
                int var13 = 256 - var12;
                int var14 = arg1[arg3++];
                int var15 = arg0[arg4];
                arg0[arg4++] = ((var14 & 0xFF00FF) * var12 + (var15 & 0xFF00FF) * var13 & 0xFF00FF00) + ((var14 & 0xFF00) * var12 + (var15 & 0xFF00) * var13 & 0xFF0000) >> 8;
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)V", line = 277)
    public final void method143(int arg0, int arg1) {
        int var3 = this.field1340 + arg0;
        int var4 = this.field1334 + arg1;
        int var5 = class286.field4719 * var4 + var3;
        int var6 = 0;
        int var7 = this.field1345;
        int var8 = this.field1347;
        int var9 = class286.field4719 - var8;
        int var10 = 0;
        if (var4 < class286.field4724) {
            int var11 = class286.field4724 - var4;
            var7 -= var11;
            var4 = class286.field4724;
            var6 += var8 * var11;
            var5 += class286.field4719 * var11;
        }
        if (var4 + var7 > class286.field4722) {
            var7 -= var4 + var7 - class286.field4722;
        }
        if (var3 < class286.field4723) {
            int var12 = class286.field4723 - var3;
            var8 -= var12;
            var3 = class286.field4723;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class286.field4720) {
            int var13 = var3 + var8 - class286.field4720;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method140(class286.field4718, this.field652, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIIII)V", line = 333)
    public final void method144(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 == 0) {
            return;
        }
        int var7 = arg0 - (this.field1340 << 4);
        int var8 = arg1 - (this.field1334 << 4);
        double var9 = (double) (arg4 & 0xFFFF) * 9.587379924285257E-5D;
        int var11 = (int) Math.floor(Math.sin(var9) * (double) arg5 + 0.5D);
        int var12 = (int) Math.floor(Math.cos(var9) * (double) arg5 + 0.5D);
        int var13 = -var7 * var12 + -var8 * var11;
        int var14 = -(-var7) * var11 + -var8 * var12;
        int var15 = ((this.field1347 << 4) - var7) * var12 + -var8 * var11;
        int var16 = -((this.field1347 << 4) - var7) * var11 + -var8 * var12;
        int var17 = ((this.field1345 << 4) - var8) * var11 + -var7 * var12;
        int var18 = ((this.field1345 << 4) - var8) * var12 + -(-var7) * var11;
        int var19 = ((this.field1347 << 4) - var7) * var12 + ((this.field1345 << 4) - var8) * var11;
        int var20 = ((this.field1345 << 4) - var8) * var12 + -((this.field1347 << 4) - var7) * var11;
        int var21;
        int var22;
        if (var13 < var15) {
            var21 = var13;
            var22 = var15;
        } else {
            var21 = var15;
            var22 = var13;
        }
        if (var17 < var21) {
            var21 = var17;
        }
        if (var19 < var21) {
            var21 = var19;
        }
        if (var17 > var22) {
            var22 = var17;
        }
        if (var19 > var22) {
            var22 = var19;
        }
        int var23;
        int var24;
        if (var14 < var16) {
            var23 = var14;
            var24 = var16;
        } else {
            var23 = var16;
            var24 = var14;
        }
        if (var18 < var23) {
            var23 = var18;
        }
        if (var20 < var23) {
            var23 = var20;
        }
        if (var18 > var24) {
            var24 = var18;
        }
        if (var20 > var24) {
            var24 = var20;
        }
        int var25 = var21 >> 12;
        int var26 = var22 + 4095 >> 12;
        int var27 = var23 >> 12;
        int var28 = var24 + 4095 >> 12;
        int var29 = arg2 + var25;
        int var30 = arg2 + var26;
        int var31 = arg3 + var27;
        int var32 = arg3 + var28;
        int var33 = var29 >> 4;
        int var34 = var30 + 15 >> 4;
        int var35 = var31 >> 4;
        int var36 = var32 + 15 >> 4;
        if (var33 < class286.field4723) {
            var33 = class286.field4723;
        }
        if (var34 > class286.field4720) {
            var34 = class286.field4720;
        }
        if (var35 < class286.field4724) {
            var35 = class286.field4724;
        }
        if (var36 > class286.field4722) {
            var36 = class286.field4722;
        }
        int var37 = var33 - var34;
        if (var37 >= 0) {
            return;
        }
        int var38 = var35 - var36;
        if (var38 >= 0) {
            return;
        }
        int var39 = class286.field4719 * var35 + var33;
        double var40 = 1.6777216E7D / (double) arg5;
        int var42 = (int) Math.floor(Math.sin(var9) * var40 + 0.5D);
        int var43 = (int) Math.floor(Math.cos(var9) * var40 + 0.5D);
        int var44 = (var33 << 4) + 8 - arg2;
        int var45 = (var35 << 4) + 8 - arg3;
        int var46 = (var7 << 8) - (var42 * var45 >> 4);
        int var47 = (var8 << 8) + (var43 * var45 >> 4);
        if (var43 == 0) {
            if (var42 == 0) {
                int var48 = var38;
                while (var48 < 0) {
                    int var49 = var39;
                    int var50 = var46;
                    int var51 = var47;
                    int var52 = var37;
                    if (var46 >= 0 && var47 >= 0 && var46 - (this.field1347 << 12) < 0 && var47 - (this.field1345 << 12) < 0) {
                        while (var52 < 0) {
                            int var53 = this.field652[(var50 >> 12) + (var51 >> 12) * this.field1347];
                            int var54 = class286.field4718[var49];
                            int var55 = var53 >>> 24;
                            int var56 = 256 - var55;
                            class286.field4718[var49++] = ((var53 & 0xFF00FF) * var55 + (var54 & 0xFF00FF) * var56 & 0xFF00FF00) + ((var53 & 0xFF00) * var55 + (var54 & 0xFF00) * var56 & 0xFF0000) >> 8;
                            var52++;
                        }
                    }
                    var48++;
                    var39 += class286.field4719;
                }
            } else if (var42 < 0) {
                int var57 = var38;
                while (var57 < 0) {
                    int var58 = var39;
                    int var59 = var46;
                    int var60 = (var42 * var44 >> 4) + var47;
                    int var61 = var37;
                    if (var46 >= 0 && var46 - (this.field1347 << 12) < 0) {
                        int var62;
                        if ((var62 = var60 - (this.field1345 << 12)) >= 0) {
                            int var63 = (var42 - var62) / var42;
                            var61 = var37 + var63;
                            var60 += var42 * var63;
                            var58 = var39 + var63;
                        }
                        int var64;
                        if ((var64 = (var60 - var42) / var42) > var61) {
                            var61 = var64;
                        }
                        while (var61 < 0) {
                            int var65 = this.field652[(var59 >> 12) + (var60 >> 12) * this.field1347];
                            int var66 = class286.field4718[var58];
                            int var67 = var65 >>> 24;
                            int var68 = 256 - var67;
                            class286.field4718[var58++] = ((var65 & 0xFF00FF) * var67 + (var66 & 0xFF00FF) * var68 & 0xFF00FF00) + ((var65 & 0xFF00) * var67 + (var66 & 0xFF00) * var68 & 0xFF0000) >> 8;
                            var60 += var42;
                            var61++;
                        }
                    }
                    var57++;
                    var46 -= var42;
                    var39 += class286.field4719;
                }
            } else {
                int var69 = var38;
                while (var69 < 0) {
                    int var70 = var39;
                    int var71 = var46;
                    int var72 = (var42 * var44 >> 4) + var47;
                    int var73 = var37;
                    if (var46 >= 0 && var46 - (this.field1347 << 12) < 0) {
                        if (var72 < 0) {
                            int var74 = (var42 - var72 - 1) / var42;
                            var73 = var37 + var74;
                            var72 += var42 * var74;
                            var70 = var39 + var74;
                        }
                        int var75;
                        if ((var75 = (var72 + 1 - (this.field1345 << 12) - var42) / var42) > var73) {
                            var73 = var75;
                        }
                        while (var73 < 0) {
                            int var76 = this.field652[(var71 >> 12) + (var72 >> 12) * this.field1347];
                            int var77 = class286.field4718[var70];
                            int var78 = var76 >>> 24;
                            int var79 = 256 - var78;
                            class286.field4718[var70++] = ((var76 & 0xFF00FF) * var78 + (var77 & 0xFF00FF) * var79 & 0xFF00FF00) + ((var76 & 0xFF00) * var78 + (var77 & 0xFF00) * var79 & 0xFF0000) >> 8;
                            var72 += var42;
                            var73++;
                        }
                    }
                    var69++;
                    var46 -= var42;
                    var39 += class286.field4719;
                }
            }
        } else if (var43 < 0) {
            if (var42 == 0) {
                int var80 = var38;
                while (var80 < 0) {
                    int var81 = var39;
                    int var82 = (var43 * var44 >> 4) + var46;
                    int var83 = var47;
                    int var84 = var37;
                    if (var47 >= 0 && var47 - (this.field1345 << 12) < 0) {
                        int var85;
                        if ((var85 = var82 - (this.field1347 << 12)) >= 0) {
                            int var86 = (var43 - var85) / var43;
                            var84 = var37 + var86;
                            var82 += var43 * var86;
                            var81 = var39 + var86;
                        }
                        int var87;
                        if ((var87 = (var82 - var43) / var43) > var84) {
                            var84 = var87;
                        }
                        while (var84 < 0) {
                            int var88 = this.field652[(var82 >> 12) + (var83 >> 12) * this.field1347];
                            int var89 = class286.field4718[var81];
                            int var90 = var88 >>> 24;
                            int var91 = 256 - var90;
                            class286.field4718[var81++] = ((var88 & 0xFF00FF) * var90 + (var89 & 0xFF00FF) * var91 & 0xFF00FF00) + ((var88 & 0xFF00) * var90 + (var89 & 0xFF00) * var91 & 0xFF0000) >> 8;
                            var82 += var43;
                            var84++;
                        }
                    }
                    var80++;
                    var47 += var43;
                    var39 += class286.field4719;
                }
            } else if (var42 < 0) {
                int var92 = var38;
                while (var92 < 0) {
                    int var93 = var39;
                    int var94 = (var43 * var44 >> 4) + var46;
                    int var95 = (var42 * var44 >> 4) + var47;
                    int var96 = var37;
                    int var97;
                    if ((var97 = var94 - (this.field1347 << 12)) >= 0) {
                        int var98 = (var43 - var97) / var43;
                        var96 = var37 + var98;
                        var94 += var43 * var98;
                        var95 += var42 * var98;
                        var93 = var39 + var98;
                    }
                    int var99;
                    if ((var99 = (var94 - var43) / var43) > var96) {
                        var96 = var99;
                    }
                    int var100;
                    if ((var100 = var95 - (this.field1345 << 12)) >= 0) {
                        int var101 = (var42 - var100) / var42;
                        var96 += var101;
                        var94 += var43 * var101;
                        var95 += var42 * var101;
                        var93 += var101;
                    }
                    int var102;
                    if ((var102 = (var95 - var42) / var42) > var96) {
                        var96 = var102;
                    }
                    while (var96 < 0) {
                        int var103 = this.field652[(var94 >> 12) + (var95 >> 12) * this.field1347];
                        int var104 = class286.field4718[var93];
                        int var105 = var103 >>> 24;
                        int var106 = 256 - var105;
                        class286.field4718[var93++] = ((var103 & 0xFF00FF) * var105 + (var104 & 0xFF00FF) * var106 & 0xFF00FF00) + ((var103 & 0xFF00) * var105 + (var104 & 0xFF00) * var106 & 0xFF0000) >> 8;
                        var94 += var43;
                        var95 += var42;
                        var96++;
                    }
                    var92++;
                    var46 -= var42;
                    var47 += var43;
                    var39 += class286.field4719;
                }
            } else {
                int var107 = var38;
                while (var107 < 0) {
                    int var108 = var39;
                    int var109 = (var43 * var44 >> 4) + var46;
                    int var110 = (var42 * var44 >> 4) + var47;
                    int var111 = var37;
                    int var112;
                    if ((var112 = var109 - (this.field1347 << 12)) >= 0) {
                        int var113 = (var43 - var112) / var43;
                        var111 = var37 + var113;
                        var109 += var43 * var113;
                        var110 += var42 * var113;
                        var108 = var39 + var113;
                    }
                    int var114;
                    if ((var114 = (var109 - var43) / var43) > var111) {
                        var111 = var114;
                    }
                    if (var110 < 0) {
                        int var115 = (var42 - var110 - 1) / var42;
                        var111 += var115;
                        var109 += var43 * var115;
                        var110 += var42 * var115;
                        var108 += var115;
                    }
                    int var116;
                    if ((var116 = (var110 + 1 - (this.field1345 << 12) - var42) / var42) > var111) {
                        var111 = var116;
                    }
                    while (var111 < 0) {
                        int var117 = this.field652[(var109 >> 12) + (var110 >> 12) * this.field1347];
                        int var118 = class286.field4718[var108];
                        int var119 = var117 >>> 24;
                        int var120 = 256 - var119;
                        class286.field4718[var108++] = ((var117 & 0xFF00FF) * var119 + (var118 & 0xFF00FF) * var120 & 0xFF00FF00) + ((var117 & 0xFF00) * var119 + (var118 & 0xFF00) * var120 & 0xFF0000) >> 8;
                        var109 += var43;
                        var110 += var42;
                        var111++;
                    }
                    var107++;
                    var46 -= var42;
                    var47 += var43;
                    var39 += class286.field4719;
                }
            }
        } else if (var42 == 0) {
            int var121 = var38;
            while (var121 < 0) {
                int var122 = var39;
                int var123 = (var43 * var44 >> 4) + var46;
                int var124 = var47;
                int var125 = var37;
                if (var47 >= 0 && var47 - (this.field1345 << 12) < 0) {
                    if (var123 < 0) {
                        int var126 = (var43 - var123 - 1) / var43;
                        var125 = var37 + var126;
                        var123 += var43 * var126;
                        var122 = var39 + var126;
                    }
                    int var127;
                    if ((var127 = (var123 + 1 - (this.field1347 << 12) - var43) / var43) > var125) {
                        var125 = var127;
                    }
                    while (var125 < 0) {
                        int var128 = this.field652[(var123 >> 12) + (var124 >> 12) * this.field1347];
                        int var129 = class286.field4718[var122];
                        int var130 = var128 >>> 24;
                        int var131 = 256 - var130;
                        class286.field4718[var122++] = ((var128 & 0xFF00FF) * var130 + (var129 & 0xFF00FF) * var131 & 0xFF00FF00) + ((var128 & 0xFF00) * var130 + (var129 & 0xFF00) * var131 & 0xFF0000) >> 8;
                        var123 += var43;
                        var125++;
                    }
                }
                var121++;
                var47 += var43;
                var39 += class286.field4719;
            }
        } else if (var42 < 0) {
            int var132 = var38;
            while (var132 < 0) {
                int var133 = var39;
                int var134 = (var43 * var44 >> 4) + var46;
                int var135 = (var42 * var44 >> 4) + var47;
                int var136 = var37;
                if (var134 < 0) {
                    int var137 = (var43 - var134 - 1) / var43;
                    var136 = var37 + var137;
                    var134 += var43 * var137;
                    var135 += var42 * var137;
                    var133 = var39 + var137;
                }
                int var138;
                if ((var138 = (var134 + 1 - (this.field1347 << 12) - var43) / var43) > var136) {
                    var136 = var138;
                }
                int var139;
                if ((var139 = var135 - (this.field1345 << 12)) >= 0) {
                    int var140 = (var42 - var139) / var42;
                    var136 += var140;
                    var134 += var43 * var140;
                    var135 += var42 * var140;
                    var133 += var140;
                }
                int var141;
                if ((var141 = (var135 - var42) / var42) > var136) {
                    var136 = var141;
                }
                while (var136 < 0) {
                    int var142 = this.field652[(var134 >> 12) + (var135 >> 12) * this.field1347];
                    int var143 = class286.field4718[var133];
                    int var144 = var142 >>> 24;
                    int var145 = 256 - var144;
                    class286.field4718[var133++] = ((var142 & 0xFF00FF) * var144 + (var143 & 0xFF00FF) * var145 & 0xFF00FF00) + ((var142 & 0xFF00) * var144 + (var143 & 0xFF00) * var145 & 0xFF0000) >> 8;
                    var134 += var43;
                    var135 += var42;
                    var136++;
                }
                var132++;
                var46 -= var42;
                var47 += var43;
                var39 += class286.field4719;
            }
        } else {
            int var146 = var38;
            while (var146 < 0) {
                int var147 = var39;
                int var148 = (var43 * var44 >> 4) + var46;
                int var149 = (var42 * var44 >> 4) + var47;
                int var150 = var37;
                if (var148 < 0) {
                    int var151 = (var43 - var148 - 1) / var43;
                    var150 = var37 + var151;
                    var148 += var43 * var151;
                    var149 += var42 * var151;
                    var147 = var39 + var151;
                }
                int var152;
                if ((var152 = (var148 + 1 - (this.field1347 << 12) - var43) / var43) > var150) {
                    var150 = var152;
                }
                if (var149 < 0) {
                    int var153 = (var42 - var149 - 1) / var42;
                    var150 += var153;
                    var148 += var43 * var153;
                    var149 += var42 * var153;
                    var147 += var153;
                }
                int var154;
                if ((var154 = (var149 + 1 - (this.field1345 << 12) - var42) / var42) > var150) {
                    var150 = var154;
                }
                while (var150 < 0) {
                    int var155 = this.field652[(var148 >> 12) + (var149 >> 12) * this.field1347];
                    int var156 = class286.field4718[var147];
                    int var157 = var155 >>> 24;
                    int var158 = 256 - var157;
                    class286.field4718[var147++] = ((var155 & 0xFF00FF) * var157 + (var156 & 0xFF00FF) * var158 & 0xFF00FF00) + ((var155 & 0xFF00) * var157 + (var156 & 0xFF00) * var158 & 0xFF0000) >> 8;
                    var148 += var43;
                    var149 += var42;
                    var150++;
                }
                var146++;
                var46 -= var42;
                var47 += var43;
                var39 += class286.field4719;
            }
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(III)V", line = 979)
    public final void method145(int arg0, int arg1, int arg2) {
        int var4 = this.field1340 + arg0;
        int var5 = this.field1334 + arg1;
        int var6 = class286.field4719 * var5 + var4;
        int var7 = 0;
        int var8 = this.field1345;
        int var9 = this.field1347;
        int var10 = class286.field4719 - var9;
        int var11 = 0;
        if (var5 < class286.field4724) {
            int var12 = class286.field4724 - var5;
            var8 -= var12;
            var5 = class286.field4724;
            var7 += var9 * var12;
            var6 += class286.field4719 * var12;
        }
        if (var5 + var8 > class286.field4722) {
            var8 -= var5 + var8 - class286.field4722;
        }
        if (var4 < class286.field4723) {
            int var13 = class286.field4723 - var4;
            var9 -= var13;
            var4 = class286.field4723;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class286.field4720) {
            int var14 = var4 + var9 - class286.field4720;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            method142(class286.field4718, this.field652, 0, var7, var6, var9, var8, var10, var11, arg2);
        }
    }
}
